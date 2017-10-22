package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSurface;
import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class RectangularDirectX2DTexture extends DirectX2DTexture implements Interface40 {

	RectangularDirectX2DTexture(DirectXToolkit toolkit, Class121 class121, Class151 class151, int i, int i_26_) {
		super(toolkit, class121, class151, i, i_26_, 1025, 0);
	}

	@Override
	public void method218(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_) {
		long surface = IDirect3DTexture.GetSurfaceLevel(aLong4229, 0);
		long render = IDirect3DDevice.CreateRenderTarget(toolkit.aLong4029, i_1_, i_2_, 21, 0, 0, true);
		toolkit.method14589(i_2_ * i_1_ * 4);

		if (Class327.method5799(IDirect3DDevice.StretchRect(toolkit.aLong4029, surface, i, i_0_, i_1_, i_2_, render, 0, 0,
				i_1_, i_2_, 1))) {
			IDirect3DSurface.Download(render, 0, 0, i_1_, i_2_, i_1_ * 4, 16, toolkit.aLong9268);
			toolkit.aByteBuffer9279.clear();
			toolkit.aByteBuffer9279.asIntBuffer().get(is);
		}

		IUnknown.Release(surface);
		IUnknown.Release(render);
	}

	@Override
	public Interface16 method305(int i) {
		return new Class372(this, i);
	}

}