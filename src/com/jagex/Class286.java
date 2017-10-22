package com.jagex;

public class Class286 {
	public static void method5290(NativeLibraryProvider interface54) {
		if (null != Client.nativeProvider) {
			throw new IllegalStateException("");
		}
		Client.nativeProvider = interface54;
	}

	Class297 aClass297_3191;
	Archive aClass406_3192;
	Archive fonts;

	public Class286(Archive class406, Archive fonts) {
		aClass406_3192 = class406;
		this.fonts = fonts;
	}

	public Interface28 method5287(Interface43 interface43) {
		if (null == interface43) {
			return null;
		}

		Class360 class360 = interface43.method316();
		if (Class360.aClass360_3884 == class360) {
			return new Class295((Class341) interface43);
		} else if (Class360.aClass360_3881 == class360) {
			return new Class287(method5288(), (Class330) interface43);
		} else if (Class360.aClass360_3882 == class360) {
			return new Class289(aClass406_3192, (Class367) interface43);
		} else if (class360 == Class360.aClass360_3877) {
			return new Class289_Sub1(aClass406_3192, (Class367_Sub1) interface43);
		} else if (Class360.aClass360_3883 == class360) {
			return new Class296_Sub1(aClass406_3192, fonts, (Class340_Sub3) interface43);
		} else if (Class360.aClass360_3879 == class360) {
			return new Class296_Sub2(aClass406_3192, fonts, (Class340_Sub1) interface43);
		} else if (class360 == Class360.aClass360_3880) {
			return new Class296_Sub3(aClass406_3192, fonts, (Class340_Sub2) interface43);
		} else if (class360 == Class360.aClass360_3878) {
			return new Class285(aClass406_3192, fonts, (Class348) interface43);
		} else if (Class360.aClass360_3888 == class360) {
			return new Class293(aClass406_3192, (Class350) interface43);
		} else if (class360 == Class360.aClass360_3886) {
			return new Class296_Sub3_Sub1(aClass406_3192, fonts, (Class340_Sub2_Sub1) interface43);
		} else if (Class360.aClass360_3887 == class360) {
			return new Class282(aClass406_3192, fonts, (Class331) interface43);
		}

		return null;
	}

	Class297 method5288() {
		if (aClass297_3191 == null) {
			aClass297_3191 = new Class297();
		}

		return aClass297_3191;
	}

}