package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVertexBuffer;
import jagdx.IUnknown;

public class DirectXArrayBuffer implements NativeArrayBuffer {

	/**
	 * Resources are placed in the memory pool most appropriate for the set of usages requested for the given resource.
	 * This is usually video memory, including both local video memory and AGP memory. The D3DPOOL_DEFAULT pool is
	 * separate from D3DPOOL_MANAGED and it specifies that the resource is placed in the preferred memory for device
	 * access.
	 *
	 * https://msdn.microsoft.com/en-us/library/windows/desktop/bb172584%28v=vs.85%29.aspx
	 */
	private static final int D3DPOOL_DEFAULT = 0;

	/**
	 * Resources are copied automatically to device-accessible memory as needed. Managed resources are backed by system
	 * memory and do not need to be recreated when a device is lost. See Managing Resources (Direct3D 9) for more
	 * information. Managed resources can be locked. Only the system-memory copy is directly modified. Direct3D copies
	 * your changes to driver-accessible memory as needed.
	 *
	 * https://msdn.microsoft.com/en-us/library/windows/desktop/bb172584%28v=vs.85%29.aspx
	 */
	private static final int D3DPOOL_MANAGED = 1;

	/**
	 * Set to indicate that the vertex buffer requires dynamic memory use. This is useful for drivers because it enables
	 * them to decide where to place the buffer. In general, static vertex buffers are placed in video memory and
	 * dynamic vertex buffers are placed in AGP memory
	 */
	private static final int D3DUSAGE_DYNAMIC = 0x200;

	/**
	 * Setting this flag indicates that the driver should restrict access to the shared resource. The caller must create
	 * an authenticated channel with the driver. The driver should then allow access to processes that attempt to open
	 * that shared resource.
	 */
	private static final int D3DUSAGE_RESTRICT_SHARED_RESOURCE_DRIVER = 0x2000;

	/**
	 * Informs the system that the application writes only to the vertex buffer. Using this flag enables the driver to
	 * choose the best memory location for efficient write operations and rendering.
	 */
	private static final int D3DUSAGE_WRITEONLY = 0x8;

	int allocated;
	boolean dynamic;
	long identifier = 0L;
	int length;
	byte stride;
	DirectXToolkit toolkit;

	DirectXArrayBuffer(DirectXToolkit toolkit, boolean stream) {
		this.toolkit = toolkit;
		dynamic = stream;
		toolkit.method14863(this);
	}

	@Override
	public void deleteImmediately() {
		if (identifier != 0L) {
			IUnknown.Release(identifier);
			identifier = 0L;
		}

		allocated = 0;
		length = 0;
		toolkit.method14583(this);
	}

	@Override
	public void finalize() {
		if (identifier != 0L) {
			toolkit.method17421(identifier);
			identifier = 0L;
			allocated = 0;
			length = 0;
		}
	}

	@Override
	public int getLength() {
		return length;
	}

	@Override
	public long lock(int offset, int length) {
		return IDirect3DVertexBuffer.Lock(identifier, offset, length,
				dynamic ? D3DUSAGE_RESTRICT_SHARED_RESOURCE_DRIVER : 0);
	}

	@Override
	public boolean read(int offset, int length, long source) {
		return Class327.method5799(IDirect3DVertexBuffer.Upload(identifier, offset, length,
				dynamic ? D3DUSAGE_RESTRICT_SHARED_RESOURCE_DRIVER : 0, source));
	}

	@Override
	public boolean reallocate(int length, int stride) {
		this.length = length;
		this.stride = (byte) stride;

		if (length > allocated) {
			int usage = D3DUSAGE_WRITEONLY;
			int pooling;

			if (dynamic) {
				pooling = D3DPOOL_DEFAULT;
				usage |= D3DUSAGE_DYNAMIC;
			} else {
				pooling = D3DPOOL_MANAGED;
			}

			if (identifier != 0L) {
				IUnknown.Release(identifier);
			}

			identifier = IDirect3DDevice.CreateVertexBuffer(toolkit.aLong4029, length, usage, 0, pooling);
			allocated = length;
		}

		return identifier != 0L;
	}

	@Override
	public void unmap() {
		IDirect3DVertexBuffer.Unlock(identifier);
	}

	int getStride() {
		return stride;
	}

	void method6200() {
		if (identifier != 0L) {
			toolkit.method17421(identifier);
			identifier = 0L;
			allocated = 0;
			length = 0;
		}
	}

}