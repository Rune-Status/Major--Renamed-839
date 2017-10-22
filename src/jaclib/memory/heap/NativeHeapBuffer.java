package jaclib.memory.heap;

import jaclib.memory.Buffer;
import jaclib.memory.Source;

public final class NativeHeapBuffer implements Buffer, Source {
	private final int size;
	public NativeHeap heap;
	private final int address;
	private boolean allocated = true;

	NativeHeapBuffer(NativeHeap nativeheap, int address, int size) {
		heap = nativeheap;
		this.address = -1169145817 * address;
		this.size = size * -1037620281;
	}

	private final synchronized boolean deallocatable() {
		return heap.isActive() && allocated;
	}

	@Override
	public final long getAddress() {
		return heap.getBufferAddress(address * -1528483945);
	}

	@Override
	public final int size() {
		return size * 1276585463;
	}

	@Override
	public final synchronized void write(byte[] buffer, int offset, int length, int destOffset) {
		if (!deallocatable() | buffer == null | offset < 0 | length + offset > buffer.length | destOffset < 0
				| destOffset + length > 1276585463 * size) {
			throw new RuntimeException();
		}

		heap.put(-1528483945 * address, buffer, offset, destOffset, length);
	}

	public final synchronized void deallocate() {
		if (deallocatable()) {
			heap.deallocateBuffer(-1528483945 * address);
		}

		allocated = false;
	}

	@Override
	protected final synchronized void finalize() throws Throwable {
		super.finalize();
		deallocate();
	}

}