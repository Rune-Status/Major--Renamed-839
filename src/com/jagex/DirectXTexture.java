package com.jagex;

import jagdx.IUnknown;

public abstract class DirectXTexture implements Deletable {
	boolean aBool4225;
	DirectXToolkit toolkit;
	Class121 aClass121_4227;
	Class151 aClass151_4228;
	long aLong4229 = 0L;

	DirectXTexture(DirectXToolkit toolkit, Class121 class121, Class151 class151, boolean bool, int i) {
		this.toolkit = toolkit;
		aClass121_4227 = class121;
		aClass151_4228 = class151;
		aBool4225 = bool;
		toolkit.method14863(this);
	}

	@Override
	public void finalize() {
		if (aLong4229 != 0L) {
			toolkit.method17421(aLong4229);
			aLong4229 = 0L;
		}
	}

	public void method296(Class318 class318) {

	}

	@Override
	public void deleteImmediately() {
		if (aLong4229 != 0L) {
			IUnknown.Release(aLong4229);
			aLong4229 = 0L;
		}

		toolkit.method14583(this);
	}

	long method6237() {
		return aLong4229;
	}

}