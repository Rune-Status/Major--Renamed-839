package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public class Class376 implements Interface46 {
	DirectXToolkit toolkit;
	Class151 aClass151_4164;
	Class121 aClass121_4165;
	int anInt4166;
	int anInt4167;
	long aLong4168;

	Class376(DirectXToolkit toolkit, Class121 class121, Class151 class151, int i, int i_0_, int i_1_) {
		this.toolkit = toolkit;
		anInt4166 = i;
		anInt4167 = i_0_;
		aClass121_4165 = class121;
		aClass151_4164 = class151;
		aLong4168 = IDirect3DDevice.CreateRenderTarget(toolkit.aLong4029, i, i_0_,
				DirectXToolkit.method17414(aClass121_4165, aClass151_4164), 0 + i_1_, 0, false);
		toolkit.method14863(this);
	}

	@Override
	public void finalize() {
		delete();
	}

	@Override
	public int getWidth() {
		return anInt4166;
	}

	@Override
	public void delete() {
		if (aLong4168 != 0L) {
			toolkit.method17421(aLong4168);
			aLong4168 = 0L;
		}
	}

	@Override
	public long getIdentifier() {
		return aLong4168;
	}

	@Override
	public int getHeight() {
		return anInt4167;
	}

	@Override
	public void deleteImmediately() {
		if (aLong4168 != 0L) {
			IUnknown.Release(aLong4168);
			aLong4168 = 0L;
		}

		toolkit.method14583(this);
	}

}