package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class DirectXDepthStencil implements Interface48 {
	DirectXToolkit toolkit;
	int width;
	Class151 aClass151_4476;
	int height;
	private long identifier;

	DirectXDepthStencil(DirectXToolkit toolkit, Class151 class151, int width, int height, int samples) {
		this.toolkit = toolkit;
		this.width = width;
		this.height = height;
		aClass151_4476 = class151;
		identifier = IDirect3DDevice.CreateDepthStencilSurface(toolkit.aLong4029, width, height,
				DirectXToolkit.method17451(aClass151_4476), samples, 0, false);
		toolkit.method14863(this);
	}

	@Override
	public void finalize() {
		delete();
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public void delete() {
		if (identifier != 0L) {
			toolkit.method17421(identifier);
			identifier = 0L;
		}
	}

	@Override
	public long getIdentifier() {
		return identifier;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public void deleteImmediately() {
		if (identifier != 0L) {
			IUnknown.Release(identifier);
			identifier = 0L;
		}

		toolkit.method14583(this);
	}

}