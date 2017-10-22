package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DVolumeTexture;

import java.nio.ByteBuffer;

public final class DirectX3DTexture extends DirectXTexture implements Native3DTexture {
	int height;
	int depth;
	int width;

	DirectX3DTexture(DirectXToolkit toolkit, Class121 class121, int width, int height, int depth, byte[] data) {
		super(toolkit, class121, Class151.aClass151_2, false, width * height * depth);
		this.width = width;
		this.height = height;
		this.depth = depth;

		aLong4229 = IDirect3DDevice.CreateVolumeTexture(toolkit.aLong4029, width, height, depth, 1, 0,
				DirectXToolkit.method17414(class121, aClass151_4228), 1);
		toolkit.method14589(width * height * class121.size * 115153045);
		ByteBuffer buffer = toolkit.aByteBuffer9279;
		buffer.clear();
		buffer.put(data);

		IDirect3DVolumeTexture.Upload(aLong4229, 0, 0, 0, 0, width, height, depth, width * class121.size * 115153045,
				0, toolkit.aLong9268);
	}

	@Override
	public void method296(Class318 class318) {
		super.method296(class318);
	}

	@Override
	public void method301() {
		toolkit.method17431(this);
	}

	@Override
	public void deleteImmediately() {
		super.deleteImmediately();
	}

	@Override
	long method6237() {
		return aLong4229;
	}

}