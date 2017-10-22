package com.jagex;

import jagdx.IDirect3DTexture;
import jagdx.IUnknown;

public class Class372 implements Interface46, Interface48 {
	RectangularDirectX2DTexture aClass381_Sub2_Sub1_4133;
	int anInt4134;
	long aLong4135;

	Class372(RectangularDirectX2DTexture class381_sub2_sub1, int i) {
		anInt4134 = i;
		aClass381_Sub2_Sub1_4133 = class381_sub2_sub1;
		aClass381_Sub2_Sub1_4133.toolkit.method14863(this);
	}

	@Override
	public void finalize() {
		delete();
	}

	@Override
	public int getWidth() {
		return aClass381_Sub2_Sub1_4133.getWidth();
	}

	@Override
	public void delete() {
		if (aLong4135 != 0L) {
			aClass381_Sub2_Sub1_4133.toolkit.method17421(aLong4135);
			aLong4135 = 0L;
		}
	}

	@Override
	public long getIdentifier() {
		if (aLong4135 == 0L) {
			aLong4135 = IDirect3DTexture.GetSurfaceLevel(aClass381_Sub2_Sub1_4133.aLong4229, anInt4134);
		}
		return aLong4135;
	}

	@Override
	public int getHeight() {
		return aClass381_Sub2_Sub1_4133.getHeight();
	}

	@Override
	public void deleteImmediately() {
		if (aLong4135 != 0L) {
			IUnknown.Release(aLong4135);
			aLong4135 = 0L;
		}

		aClass381_Sub2_Sub1_4133.toolkit.method14583(this);
	}

}