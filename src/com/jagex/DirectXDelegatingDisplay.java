package com.jagex;

import jagdx.Direct3DPresentParameters;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DSwapChain;
import jagdx.IUnknown;

import java.awt.Canvas;

public class DirectXDelegatingDisplay extends NativeDelegatingDisplay implements Interface45 {
	int height;
	Canvas canvas;
	long aLong11564;
	long aLong11565;
	Direct3DPresentParameters parameters;
	int width;
	long aLong11568;
	boolean aBool11569 = false;
	boolean aBool11570 = false;
	DirectXToolkit toolkit;

	DirectXDelegatingDisplay(DirectXToolkit toolkit, Canvas canvas, int width, int height, boolean bool) {
		super(toolkit);
		this.canvas = canvas;
		this.toolkit = toolkit;
		this.width = width;
		this.height = height;
		aBool11570 = bool;
		method331();
	}

	@Override
	public void finalize() throws Throwable {
		method18043();
		super.finalize();
	}

	@Override
	public int draw() {
		return IDirect3DSwapChain.Present(aLong11564, 0);
	}

	@Override
	public int draw(int x, int y) {
		return IDirect3DSwapChain.Present(aLong11564, 0);
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public boolean method324() {
		aBool11569 = true;
		if (aLong11564 == 0L) {
			if (toolkit.aBool11053) {
				return false;
			}
			method331();
		}

		if (Class327.method5798(IDirect3DDevice.SetRenderTarget(toolkit.aLong4029, 0, aLong11565))) {
			return false;
		} else if (Class327.method5798(IDirect3DDevice.SetDepthStencilSurface(toolkit.aLong4029, aLong11568))) {
			return false;
		}

		return super.method324();
	}

	@Override
	public void method331() {
		if (aLong11564 == 0L) {
			parameters = new Direct3DPresentParameters(canvas);
			parameters.Windowed = true;
			parameters.BackBufferCount = 1;
			parameters.PresentationInterval = -2147483648;
			parameters.BackBufferWidth = width;
			parameters.BackBufferHeight = height;

			if (aBool11570) {
				aLong11564 = IDirect3DDevice.GetSwapChain(toolkit.aLong4029, 0);
				aLong11565 = IDirect3DSwapChain.GetBackBuffer(aLong11564, 0, 0);
				aLong11568 = IDirect3DDevice.GetDepthStencilSurface(toolkit.aLong4029);
			} else {
				if (!DirectXToolkit.method17420(toolkit.anInt11061, toolkit.anInt11047, toolkit.aLong11048,
						toolkit.anInt9400, toolkit.aD3DDISPLAYMODE11080, parameters)) {
					throw new RuntimeException();
				}

				int format = parameters.AutoDepthStencilFormat;
				aLong11564 = IDirect3DDevice.CreateAdditionalSwapChain(toolkit.aLong4029, parameters);
				aLong11565 = IDirect3DSwapChain.GetBackBuffer(aLong11564, 0, 0);
				aLong11568 = IDirect3DDevice.CreateDepthStencilSurface(toolkit.aLong4029, width, height, format,
						parameters.MultiSampleType, parameters.MultiSampleQuality, false);
			}

			toolkit.method17412(this);
		}

		if (aBool11569) {
			method324();
		}
	}

	@Override
	public void delete() {
		if (aLong11565 != 0L) {
			IUnknown.Release(aLong11565);
			aLong11565 = 0L;
		}

		if (aLong11568 != 0L) {
			IUnknown.Release(aLong11568);
			aLong11568 = 0L;
		}

		if (aLong11564 != 0L) {
			IUnknown.Release(aLong11564);
			aLong11564 = 0L;
		}

		toolkit.method17405(this);
	}

	@Override
	void setDimensions(int width, int height) {
		delete();
		this.width = width;
		this.height = height;

		if (aBool11570) {
			toolkit.method17403(width, height);
		}

		method331();
		super.setDimensions(width, height);
	}

	void method18043() {
		if (aLong11565 != 0L) {
			IUnknown.Release(aLong11565);
			aLong11565 = 0L;
		}

		if (aLong11568 != 0L) {
			IUnknown.Release(aLong11568);
			aLong11568 = 0L;
		}

		if (aLong11564 != 0L) {
			IUnknown.Release(aLong11564);
			aLong11564 = 0L;
		}

		toolkit.method17405(this);
	}

	@Override
	boolean method3151() {
		aBool11569 = false;
		return Class327.method5799(IDirect3DDevice.SetDepthStencilSurface(toolkit.aLong4029, 0L));
	}

}