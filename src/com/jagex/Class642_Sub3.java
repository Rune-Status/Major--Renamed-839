package com.jagex;

public class Class642_Sub3 extends Class642 {
	public static Client aclient10561;
	Class397 aClass397_10555 = new Class397();
	boolean aBool10556;
	Class397 aClass397_10557;
	Class397 aClass397_10558 = new Class397(Float.NaN, Float.NaN, Float.NaN);
	Class397 aClass397_10559 = new Class397(Float.NaN, Float.NaN, Float.NaN);
	GameCharacter anInterface26_10560;

	public Class642_Sub3(Class261 class261) {
		super(class261);
		aClass397_10557 = new Class397();
	}

	@Override
	public Class397 method13222(byte i) {
		Class397 class397 = Class397.copyOf(aClass397_10559);
		Class397 class397_0_ = Class397.copyOf(aClass397_10555);
		if (aBool10556) {
			class397_0_.method6480(anInterface26_10560.method142());
		}
		class397.add(class397_0_);
		class397_0_.cache();
		return class397;
	}

	@Override
	public void method13223(float f, int i) {
		if (null != anInterface26_10560) {
			aClass397_10559.copyFrom(anInterface26_10560.method140().copy());
			aClass261_8163.method4862(false, f, aClass397_10558, aClass261_8163.method4883((byte) 8), aClass397_10559,
					aClass397_10557, -958958229);
		}
	}

	@Override
	public boolean method13224() {
		return !Float.isNaN(aClass397_10558.x);
	}

	@Override
	public void method13227(Class268 class268, Class405 class405, int i, int i_3_, float f, int i_4_) {
		Class397 class397 = Class397.copyOf(aClass261_8163.method4859());
		class397.x -= i;
		class397.z -= i_3_;
		class397.y *= -1.0F;
		Class397 class397_5_ = method13235();
		class397_5_.x -= i;
		class397_5_.z -= i_3_;
		class397_5_.y *= -1.0F;
		class405.method6731(class397.x, class397.y, class397.z, class397_5_.x, class397_5_.y, class397_5_.z, 0.0F,
				1.0F, 0.0F);
		class397.cache();
		class397_5_.cache();
	}

	@Override
	public Class397 method13235() {
		Class397 class397 = Class397.copyOf(aClass397_10558);
		Class397 class397_1_ = Class397.copyOf(aClass397_10555);
		if (aBool10556) {
			class397_1_.method6480(anInterface26_10560.method142());
		}
		class397.add(class397_1_);
		class397_1_.cache();
		return class397;
	}

	@Override
	public void method13244(Buffer buffer, int i) {
		MobType class260 = MobType.valueOf(buffer.readUByte());
		int i_2_ = buffer.readUShort();
		anInterface26_10560 = aClass261_8163.method4835().get(class260, i_2_);
		aClass397_10555.decode(buffer);
		aBool10556 = buffer.readUByte() == 1;
	}

	public void method16719(GameCharacter interface26, Class397 class397, boolean bool, byte i) {
		anInterface26_10560 = interface26;
		aClass397_10555.copyFrom(class397);
		aBool10556 = bool;
		interface26.method140();
	}

	public Class397 method16720(int i) {
		return aClass397_10558;
	}

	public void method16723() {
		if (anInterface26_10560 != null) {
			anInterface26_10560 = aClass261_8163.method4835().get(anInterface26_10560.getType(),
					anInterface26_10560.method33());
		}
	}
}
