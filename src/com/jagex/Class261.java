package com.jagex;

import java.util.Iterator;

public abstract class Class261 {
	static final int anInt2897 = 50;
	public static final float aFloat2905 = Float.POSITIVE_INFINITY;
	static final int anInt2914 = 10000;

	public static void method4960(Class490 class490, Toolkit toolkit) {
		Iterator<ParticleSystem> iterator = Class570.aList7638.iterator();
		while (iterator.hasNext()) {
			ParticleSystem system = iterator.next();
			if (system.aBool7571) {
				system.method9514(class490, toolkit);
			}
		}
	}

	Class281 aClass281_2885;
	Class272 aClass272_2886;
	Class275 aClass275_2887;
	float aFloat2888;
	float aFloat2889;
	Class270 aClass270_2890;
	float aFloat2891;
	GameCharacterProvider provider;
	Class264 aClass264_2893;
	int anInt2894;
	float aFloat2895;
	Class397 aClass397_2896 = new Class397();
	Class397 aClass397_2898 = new Class397();
	float aFloat2899 = 5120.0F;
	Class397 aClass397_2900 = new Class397();
	float aFloat2901;
	float aFloat2902 = 10.0F;
	float aFloat2903 = 1.0F;
	Class397 aClass397_2904 = new Class397();
	HashTable aClass667_2906 = new HashTable(8);
	Class397 aClass397_2907 = new Class397();
	float aFloat2908;
	float aFloat2909;
	float aFloat2910;
	Class257 aClass257_2911;
	Class397 aClass397_2912 = new Class397();
	Class278 aClass278_2913;
	Class642 aClass642_2915;
	float aFloat2916;
	boolean aBool2917;
	boolean aBool2918;
	int anInt2919;
	float aFloat2920;
	float aFloat2921;

	Class261(Class278 class278, GameCharacterProvider provider) {
		aFloat2899 = 5120.0F;
		aFloat2902 = 10.0F;
		aFloat2903 = 1.0F;
		aFloat2909 = 5120.0F;
		aFloat2888 = 10.0F;
		aFloat2908 = 1.0F;
		aFloat2920 = 1.0F;
		aClass278_2913 = class278;
		this.provider = provider;
		method4803(true);
	}

	public void method4802(Class397 class397) throws ScriptException {
		if (!method4809() || !aClass264_2893.aBool2960) {
			throw new ScriptException();
		}
		aClass397_2896.copyFrom(class397);
	}

	public void method4803(boolean bool) {
		aClass275_2887 = Class275.aClass275_3097;
		aClass257_2911 = null;
		aClass642_2915 = null;
		aClass270_2890 = null;
		aClass281_2885 = null;
		if (aClass278_2913 == Class278.aClass278_3126 || !bool) {
			aClass272_2886 = Class272.aClass272_3006;
		} else {
			aClass272_2886 = Class272.aClass272_3007;
		}
		aClass264_2893 = Class264.aClass264_2956;
		aClass397_2896.set(100.0F, 100.0F, 100.0F);
		aClass397_2912.set(100.0F, 100.0F, 100.0F);
		aFloat2895 = 0.05F;
		aClass397_2898.set(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass397_2900.set(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY);
		aClass397_2907.set(1.0F, 1.0F, 1.0F);
		aClass397_2904.set(1.0F, 1.0F, 1.0F);
		aFloat2891 = 1.1F;
		aFloat2910 = 1.1F;
		aFloat2889 = 50.0F;
		aFloat2921 = 10000.0F;
		aFloat2916 = 1.5707964F;
		aFloat2901 = 1.5707964F;
		anInt2894 = 482105007;
		aBool2917 = true;
		aBool2918 = true;
		anInt2919 = 0;
		aFloat2920 = 1.0F;
		aClass667_2906.clear();
	}

	public void method4804(float f, int[][][] is, TileFlags flags, int i, int i_0_) {
		if (null != aClass642_2915) {
			aClass642_2915.method13223(f, 1940475849);
		}
		if (null != aClass281_2885) {
			aClass281_2885.method5225(f, is, flags, i, i_0_, (byte) 124);
		}
		Iterator iterator = aClass667_2906.iterator();
		while (iterator.hasNext()) {
			Class480_Sub31_Sub19 class480_sub31_sub19 = (Class480_Sub31_Sub19) iterator.next();
			class480_sub31_sub19.method17880(f, (byte) -56);
		}
	}

	public void method4806(Class272 class272) {
		aClass272_2886 = class272;
	}

	public void method4812(Class264 class264) throws ScriptException {
		if (!method4809()) {
			throw new ScriptException();
		}
		aClass264_2893 = class264;
	}

	public void method4814(Class397 class397) throws ScriptException {
		if (!method4809() || !aClass264_2893.aBool2960) {
			throw new ScriptException();
		}
		aClass397_2900.copyFrom(class397);
	}

	public void method4815(float f, float f_2_, float f_3_, int i) throws ScriptException {
		if (!method4809()) {
			throw new ScriptException();
		}
		aFloat2909 = f;
		aFloat2888 = f_2_;
		aFloat2908 = f_3_;
	}

	public void method4816() throws ScriptException {
		if (!method4809()) {
			throw new ScriptException();
		}
		aFloat2909 = 5120.0F;
		aFloat2888 = 10.0F;
		aFloat2908 = 1.0F;
	}

	public void method4818(Class397 class397) throws ScriptException {
		if (!method4809() || !aClass264_2893.aBool2960) {
			throw new ScriptException();
		}
		aClass397_2912.copyFrom(class397);
	}

	public void method4820(Class397 class397, float f) throws ScriptException {
		if (!method4809() || aClass264_2893.aBool2960) {
			throw new ScriptException();
		}
		aClass397_2907.copyFrom(class397);
		aFloat2891 = f;
	}

	public void method4821(Class397 class397, float f, int i) throws ScriptException {
		if (!method4809() || aClass264_2893.aBool2960) {
			throw new ScriptException();
		}
		aClass397_2904.copyFrom(class397);
		aFloat2910 = f;
	}

	public void method4822(float f, float f_4_, int i) throws ScriptException {
		if (!method4809()) {
			throw new ScriptException();
		}
		if (f < 1.0F) {
			f = 50.0F;
		}
		if (f_4_ < 1.0F) {
			f_4_ = 10000.0F;
		}
		if (f >= f_4_) {
			throw new ScriptException();
		}
		aFloat2889 = f;
		aFloat2921 = f_4_;
	}

	public void method4823(float f, byte i) throws ScriptException {
		if (!method4809()) {
			throw new ScriptException();
		}
		aFloat2895 = f;
	}

	public void method4824(boolean bool, boolean bool_5_, int i) throws ScriptException {
		if (!method4809()) {
			throw new ScriptException();
		}
		aBool2917 = bool;
		aBool2918 = bool_5_;
	}

	public void method4825(int i, float f, byte i_6_) throws ScriptException {
		if (!method4809() || !aClass264_2893.aBool2960) {
			throw new ScriptException();
		}
		anInt2919 = 676493399 * i;
		aFloat2920 = f;
	}

	public void method4826(Class480_Sub31_Sub19 class480_sub31_sub19) {
		aClass667_2906.put(361545025 * class480_sub31_sub19.anInt11433, class480_sub31_sub19);
	}

	public void method4827(int i, int i_7_) {
		Class480_Sub31_Sub19 class480_sub31_sub19 = (Class480_Sub31_Sub19) aClass667_2906.get(i);
		if (null != class480_sub31_sub19) {
			class480_sub31_sub19.unlink();
		}
	}

	public Class480_Sub31_Sub19 method4828(int i) {
		return (Class480_Sub31_Sub19) aClass667_2906.get(i);
	}

	public float method4829(int i) {
		return aFloat2889;
	}

	public boolean method4830() {
		if (aClass642_2915 == null || aClass281_2885 == null) {
			return false;
		}
		if (!aClass642_2915.method13224()) {
			return false;
		}
		return aClass281_2885.method5226();
	}

	public Class272 method4832(int i) {
		return aClass272_2886;
	}

	public void method4833(float f) throws ScriptException {
		if (!method4809()) {
			throw new ScriptException();
		}
	}

	public Class642 method4834() {
		return aClass642_2915;
	}

	public GameCharacterProvider method4835() {
		return provider;
	}

	public Class257 method4836() {
		return aClass257_2911;
	}

	public Class270 method4837() {
		return aClass270_2890;
	}

	public double[] method4839() {
		if (null == aClass281_2885 || !aClass281_2885.method5226()) {
			return null;
		}
		return aClass281_2885.method5228();
	}

	public Class397 method4840() {
		if (null == aClass642_2915 || !aClass642_2915.method13224()) {
			return null;
		}
		return aClass642_2915.method13235();
	}

	public float method4843() {
		Class397 class397 = method4859();
		Class397 class397_9_ = method4840();
		float f = 0.0F;
		if (class397 != null && class397_9_ != null) {
			Class397 class397_10_ = Class397.difference(class397, class397_9_);
			class397_10_.y = 0.0F;
			f = (float) Math.atan2(class397_10_.x, class397_10_.z);
			class397.cache();
			class397_9_.cache();
		}
		return (float) (Math.PI - f);
	}

	public boolean method4845() {
		return aBool2917;
	}

	public Class397 method4846(short i) {
		return aClass397_2898;
	}

	public Class397 method4847(int i) {
		return aClass397_2900;
	}

	public Class480_Sub22 method4848(int i) {
		if (null == aClass281_2885 || !aClass281_2885.method5226()) {
			return null;
		}
		return aClass281_2885.method5238((short) 18820);
	}

	public Class397 method4850(int i) {
		return aClass397_2912;
	}

	public float method4851(int i) {
		return aFloat2895;
	}

	public float method4852(int i) {
		return aFloat2921;
	}

	public float method4853(short i) {
		return aFloat2901;
	}

	public void method4854(float f, float f_11_) throws ScriptException {
		if (!method4809()) {
			throw new ScriptException();
		}
		aFloat2901 = f;
		aFloat2916 = f_11_;
	}

	public boolean method4855() {
		return aBool2918;
	}

	public Class397 method4859() {
		if (aClass281_2885 == null || !aClass281_2885.method5226()) {
			return null;
		}
		return aClass281_2885.method5224();
	}

	public void method4862(boolean bool, float f, Class397 class397, Class395 class395, Class397 class397_12_,
			Class397 class397_13_, int i) {
		if (Class264.aClass264_2957 == aClass264_2893) {
			Class44.method1072(f, class397, class397_12_, class397_13_, bool ? aClass397_2900 : aClass397_2898,
					bool ? aClass397_2912 : aClass397_2896, anInt2919 * 1136784231, aFloat2920, aFloat2909, aFloat2888,
					(short) -14098);
		} else if (aClass264_2893 == Class264.aClass264_2956) {
			Class49.method1112(f, class397, class395, class397_12_, class397_13_, bool ? aClass397_2900
					: aClass397_2898, bool ? aClass397_2912 : aClass397_2896, 1136784231 * anInt2919, aFloat2920,
					aFloat2909, aFloat2888, -1749450848);
		} else if (Class264.aClass264_2958 == aClass264_2893) {
			Class171.method3488(f, class397, class395, class397_12_, class397_13_, bool ? aClass397_2904
					: aClass397_2907, bool ? aFloat2910 : aFloat2891, aFloat2909, aFloat2908, 1452425248);
		}
	}

	public void method4871(Class397 class397) throws ScriptException {
		if (!method4809() || !aClass264_2893.aBool2960) {
			throw new ScriptException();
		}
		aClass397_2898.copyFrom(class397);
	}

	public Class281 method4876() {
		return aClass281_2885;
	}

	public Class395 method4883(byte i) {
		Class395 class395 = Class395.create();
		class395.method6413(method4843(), method4907((byte) 1), method4844());
		return class395;
	}

	public Class642 method4889(Class257 class257, boolean bool) throws ScriptException {
		if (Class272.aClass272_3006 == aClass272_2886 && !bool) {
			throw new ScriptException();
		}
		aClass257_2911 = class257;
		if (Class257.aClass257_2855 == class257) {
			aClass642_2915 = new Class642_Sub3(this);
		} else if (class257 == Class257.aClass257_2850) {
			aClass642_2915 = new Class642_Sub1(this);
		} else if (Class257.aClass257_2848 == class257) {
			aClass642_2915 = new Class642_Sub2(this);
		} else if (class257 == Class257.aClass257_2849) {
			aClass642_2915 = new Class642_Sub5_Sub1(this);
		} else if (Class257.aClass257_2851 == class257) {
			aClass642_2915 = new Class642_Sub5_Sub2(this);
		} else if (Class257.aClass257_2852 == class257) {
			aClass642_2915 = new Class642_Sub4(this);
		} else if (Class257.aClass257_2847 == class257) {
			aClass642_2915 = new Class642_Sub5_Sub3(this);
		}
		return aClass642_2915;
	}

	public void method4891(Class268 class268, Class405 class405, Matrix4f class399, int i, int i_14_, byte i_15_) {
		if (method4830()) {
			aClass642_2915.method13227(class268, class405, i, i_14_, aClass281_2885.method5230((byte) 35), -719085633);
			aClass281_2885.method5248(class268, i, i_14_, (byte) -57);
			if (Class275.aClass275_3097 == aClass275_2887) {
				class399.method6556(aFloat2889, aFloat2921, aFloat2901, aFloat2916);
			} else {
				class399.method6557(aFloat2889, aFloat2921, 1989001611 * anInt2894);
			}
			Iterator iterator = aClass667_2906.iterator();
			while (iterator.hasNext()) {
				Class480_Sub31_Sub19 class480_sub31_sub19 = (Class480_Sub31_Sub19) iterator.next();
				class480_sub31_sub19.method17881(class268, class405, class399, (byte) -49);
			}
		}
	}

	public Class281 method4903(Class270 class270, boolean bool) throws ScriptException {
		if (aClass272_2886 == Class272.aClass272_3006 && !bool) {
			throw new ScriptException();
		}
		aClass270_2890 = class270;
		if (Class270.aClass270_2995 == class270) {
			aClass281_2885 = new Class281_Sub2(this);
		} else if (Class270.aClass270_2997 == class270) {
			aClass281_2885 = new Class281_Sub3(this);
		} else if (Class270.aClass270_2996 == class270) {
			aClass281_2885 = new Class281_Sub1_Sub2(this);
		} else if (Class270.aClass270_2998 == class270) {
			aClass281_2885 = new Class281_Sub1_Sub3(this);
		} else if (class270 == Class270.aClass270_2999) {
			aClass281_2885 = new Class281_Sub1_Sub1(this);
		}
		return aClass281_2885;
	}

	public float method4907(byte i) {
		Class397 class397 = method4859();
		Class397 class397_16_ = method4840();
		float f = 0.0F;
		if (null != class397 && class397_16_ != null) {
			Class397 class397_17_ = Class397.difference(class397_16_, class397);
			float f_18_ = (float) Math.sqrt(class397_17_.x * class397_17_.x + class397_17_.z * class397_17_.z);
			f = (float) Math.atan2(-class397_17_.y, f_18_);
			class397.cache();
			class397_16_.cache();
		}
		return f;
	}

	public Class397 method4912() {
		return aClass397_2896;
	}

	public void method4915(Class397 class397, float f) throws ScriptException {
		if (!method4809() || aClass264_2893.aBool2960) {
			throw new ScriptException();
		}
		aClass397_2907.copyFrom(class397);
		aClass397_2904.copyFrom(class397);
		aFloat2891 = f;
		aFloat2910 = f;
	}

	public void reset() {
		aClass667_2906.clear();
	}

	boolean method4809() {
		if (Class278.aClass278_3126 == aClass278_2913 && aClass272_2886 == Class272.aClass272_3006) {
			return true;
		}
		return aClass278_2913 == Class278.aClass278_3127 && aClass272_2886 == Class272.aClass272_3007;
	}

	float method4844() {
		return 0.0F;
	}

}