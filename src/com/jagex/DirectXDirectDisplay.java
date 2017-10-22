package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class DirectXDirectDisplay extends NativeDirectDisplay {
	static final int anInt11663 = 16;
	int height;
	DirectXToolkit toolkit;
	Interface48 anInterface48_11659 = null;
	int width;
	int anInt11661;
	boolean aBool11662;
	Interface46[] anInterface46Array11664 = new Interface46[4];

	DirectXDirectDisplay(DirectXToolkit toolkit) {
		super(toolkit);
		this.toolkit = toolkit;
	}

	@Override
	public void finalize() throws Throwable {
		method18139();
		super.finalize();
	}

	@Override
	public void method14255(Interface17 interface17) {
		Interface48 interface48 = (Interface48) interface17;

		if (interface17 != null) {
			if (anInt11661 != 0) {
				if (width != interface48.getWidth() || height != interface48.getHeight()) {
					throw new RuntimeException();
				}
			} else {
				height = interface48.getHeight();
				width = interface48.getWidth();
				method17509();
			}

			anInt11661 |= 0x10;
			anInterface48_11659 = interface48;

			if (aBool11662) {
				method18137(interface48.getIdentifier());
			}
		} else {
			anInt11661 &= ~0x10;
			anInterface48_11659 = null;

			if (aBool11662) {
				method18137(0L);
			}

			if (anInt11661 == 0) {
				height = 0;
				width = 0;
			}
		}
	}

	@Override
	public void method14256(int i, Interface16 interface16) {
		int i_6_ = 1 << i;
		Interface46 interface46 = (Interface46) interface16;

		if (interface16 != null) {
			if (anInt11661 != 0) {
				if (width != interface46.getWidth() || height != interface46.getHeight()) {
					throw new RuntimeException();
				}
			} else {
				height = interface46.getHeight();
				width = interface46.getWidth();
				method17509();
			}

			anInt11661 |= i_6_;
			anInterface46Array11664[i] = interface46;

			if (aBool11662) {
				method18136(i, interface46.getIdentifier());
			}
		} else {
			anInt11661 &= i_6_ ^ 0xffffffff;
			anInterface46Array11664[i] = null;

			if (aBool11662) {
				method18136(i, 0L);
			}

			if (anInt11661 == 0) {
				height = 0;
				width = 0;
			}
		}
	}

	@Override
	public boolean isComplete() {
		return anInterface46Array11664[0] != null;
	}

	@Override
	public void method14263(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, boolean bool, boolean bool_5_) {
		if (bool) {
			long l = IDirect3DDevice.GetRenderTarget(toolkit.aLong4029, 0);
			IDirect3DDevice.StretchRect(toolkit.aLong4029, anInterface46Array11664[0].getIdentifier(), i, i_0_, i_1_,
					i_2_, l, i_3_, i_4_, i_1_, i_2_, 0);
			IUnknown.Release(l);
		}
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
	public void delete() {
		if (anInterface48_11659 != null) {
			anInterface48_11659.deleteImmediately();
		}

		for (int index = 0; index < anInterface46Array11664.length; index++) {
			if (anInterface46Array11664[index] != null) {
				anInterface46Array11664[index].deleteImmediately();
			}
		}
	}

	boolean method18136(int i, long l) {
		return Class327.method5799(IDirect3DDevice.SetRenderTarget(toolkit.aLong4029, i, l));
	}

	boolean method18137(long l) {
		return Class327.method5799(IDirect3DDevice.SetDepthStencilSurface(toolkit.aLong4029, l));
	}

	void method18139() {
		if (anInterface48_11659 != null) {
			anInterface48_11659.delete();
		}

		for (int index = 0; index < anInterface46Array11664.length; index++) {
			if (anInterface46Array11664[index] != null) {
				anInterface46Array11664[index].delete();
			}
		}
	}

	@Override
	boolean method3151() {
		for (int index = 1; index < 4; index++) {
			Interface46 interface46 = anInterface46Array11664[index];
			if (interface46 != null) {
				method18136(index, 0L);
			}
		}

		if (anInterface48_11659 != null) {
			method18137(0L);
		}

		aBool11662 = false;
		return true;
	}

	@Override
	boolean method324() {
		for (int index = 0; index < 4; index++) {
			Interface46 interface46 = anInterface46Array11664[index];

			if (interface46 != null) {
				long l = interface46.getIdentifier();
				method18136(index, l);
			}
		}

		if (anInterface48_11659 != null) {
			method18137(anInterface48_11659.getIdentifier());
		}

		aBool11662 = true;
		return super.method324();
	}

}