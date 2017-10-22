package com.jagex;

public class Class600 {
	Class393 aClass393_7864;
	Class393 aClass393_7865;
	boolean aBool7866;
	Class405 aClass405_7867;
	boolean aBool7868;
	protected boolean aBool7869;
	boolean aBool7870;
	Class393 aClass393_7871 = new Class393();
	Class600 aClass600_7872;
	Class600 aClass600_7873;
	Class600 aClass600_7874;

	Class600() {
		aClass393_7865 = new Class393();
		aBool7866 = true;
		aClass393_7864 = new Class393();
		aBool7868 = true;
		aClass405_7867 = new Class405();
		aBool7870 = true;
		aBool7869 = true;
	}

	public final Class393 method10164() {
		if (aBool7866) {
			aBool7866 = false;
			aClass393_7865.method6347(aClass393_7871);

			if (aClass600_7872 != null) {
				aClass393_7865.method6350(aClass600_7872.method10164());
			}
		}

		return aClass393_7865;
	}

	public final void method10169(Class397 class397) {
		aClass393_7871.aClass397_4507.copyFrom(class397);
		method10172();
		if (aClass600_7873 != null) {
			aClass600_7873.method10173();
		}
	}

	public final void method10170(float x, float height, float z) {
		aClass393_7871.aClass397_4507.set(x, height, z);
		method10172();

		if (aClass600_7873 != null) {
			aClass600_7873.method10173();
		}
	}

	public final void method10174() {
		if (aClass600_7872 != null) {
			Class600 class600_3_ = aClass600_7872.aClass600_7873;
			if (class600_3_ == this) {
				aClass600_7872.aClass600_7873 = aClass600_7874;
			} else {
				for (; class600_3_.aClass600_7874 != this; class600_3_ = class600_3_.aClass600_7874) {

				}
				class600_3_.aClass600_7874 = aClass600_7874;
			}
		}
		method10172();
		if (aClass600_7873 != null) {
			aClass600_7873.method10173();
			Class600 class600_4_ = aClass600_7873;
			for (;;) {
				class600_4_.aClass393_7871.method6350(aClass393_7871);
				class600_4_.aClass600_7872 = aClass600_7872;
				if (class600_4_.aClass600_7874 == null) {
					class600_4_.aClass600_7874 = aClass600_7872.aClass600_7873;
					break;
				}
				class600_4_ = class600_4_.aClass600_7874;
			}
			aClass600_7872.aClass600_7873 = aClass600_7873;
		}
		aClass600_7872 = null;
		aClass600_7874 = null;
		aClass600_7873 = null;
	}

	public final void method10179(Class395 class395) {
		aClass393_7871.aClass395_4506.copyFrom(class395);
		method10172();
		if (aClass600_7873 != null) {
			aClass600_7873.method10173();
		}
	}

	public final Class393 method10180() {
		return aClass393_7871;
	}

	final Class393 method10165() {
		if (aBool7868) {
			aBool7868 = false;
			aClass393_7864.method6347(method10164());
			aClass393_7864.method6349();
		}
		return aClass393_7865;
	}

	final Class405 method10166() {
		if (aBool7870) {
			aBool7870 = false;
			aClass405_7867.method6729(method10164());
		}
		return aClass405_7867;
	}

	final void method10171(Class393 class393) {
		if (aClass600_7872 != null) {
			Class393 class393_2_ = new Class393(class393);
			class393_2_.method6350(aClass600_7872.method10165());
			method10186(class393_2_);
		} else {
			method10186(class393);
		}
	}

	final void method10172() {
		aBool7866 = true;
		aBool7868 = true;
		aBool7870 = true;
		aBool7869 = true;
	}

	final void method10173() {
		method10172();
		if (aClass600_7873 != null) {
			aClass600_7873.method10173();
		}
		if (aClass600_7874 != null) {
			aClass600_7874.method10173();
		}
	}

	final void method10186(Class393 class393) {
		aClass393_7871.method6347(class393);
		method10172();
		if (aClass600_7873 != null) {
			aClass600_7873.method10173();
		}
	}

}