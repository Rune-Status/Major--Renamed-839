package com.jagex;

public class Class280 {
	public static int anInt3154;

	public static void method5220(Class584 class584) {
		if (class584.aClass335_7771 == Class335.aClass335_3605) {
			Class593.aClass343_7835 = new Class343_Sub2(class584);
		} else if (class584.aClass335_7771 == Class335.aClass335_3604) {
			Class593.aClass343_7835 = new Class343_Sub1(class584);
		} else {
			throw new RuntimeException();
		}
	}

	long aLong3147 = 4244047732328907777L;
	Deque aClass644_3148 = new Deque();
	long aLong3152;

	public Class280(Buffer buffer) {
		method5219(buffer);
	}

	public void method5216(Class480_Sub33 class480_sub33) {
		if (-4821875126325281949L * class480_sub33.linkedKey != aLong3152 * -8499859033862147549L
				|| -1881717336919751681L * aLong3147 != -724158532690826999L * class480_sub33.aLong10230) {
			throw new RuntimeException("");
		}
		for (Class480_Sub21 class480_sub21 = (Class480_Sub21) aClass644_3148.head(); class480_sub21 != null; class480_sub21 = (Class480_Sub21) aClass644_3148
				.next()) {
			class480_sub21.method15948(class480_sub33);
		}
		class480_sub33.aLong10230 += -7326488349242084039L;
	}

	void method5219(Buffer buffer) {
		aLong3152 = buffer.readLong() * 3831802234186026379L;
		aLong3147 = buffer.readLong() * -4244047732328907777L;
		for (int i_0_ = buffer.readUByte(); i_0_ != 0; i_0_ = buffer.readUByte()) {
			Class480_Sub21 class480_sub21;
			if (i_0_ == 1) {
				class480_sub21 = new Class480_Sub21_Sub5(this);
			} else if (4 == i_0_) {
				class480_sub21 = new Class480_Sub21_Sub3(this);
			} else if (3 == i_0_) {
				class480_sub21 = new Class480_Sub21_Sub1(this);
			} else if (2 == i_0_) {
				class480_sub21 = new Class480_Sub21_Sub2(this);
			} else if (i_0_ == 5) {
				class480_sub21 = new Class480_Sub21_Sub4(this);
			} else {
				throw new RuntimeException("");
			}
			class480_sub21.method15947(buffer);
			aClass644_3148.pushBack(class480_sub21);
		}
	}

}