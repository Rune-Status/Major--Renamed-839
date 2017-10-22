package com.jagex;

public class Class16 implements Identifiable {
	public static Class16 aClass16_279 = new Class16(0);
	public static Class16 aClass16_280 = new Class16(1);
	public static short[] aShortArray282;

	public static int method685(long l) {
		Class527.method8990(l);
		return CalendarUtils.DEFAULT_CALENDAR.get(1);
	}

	public static int method686(int i, boolean bool) {
		if (bool) {
			return 0;
		}
		Class480_Sub1 class480_sub1 = Class606.method10252(i, bool);
		if (null == class480_sub1) {
			return WeakReferenceTable.aClass678_Sub12_558.get(i).anInt10934 * 2138482635;
		}

		int i_1_ = 0;
		for (int element : class480_sub1.anIntArray9964) {
			if (element == -1) {
				i_1_++;
			}
		}

		i_1_ += WeakReferenceTable.aClass678_Sub12_558.get(i).anInt10934 * 2138482635
				- class480_sub1.anIntArray9964.length;
		return i_1_;
	}

	public static Class228 method688(int i, int i_3_) {
		if (i == Class228.aClass228_2570.anInt2571 * -1381220489) {
			return Class228.aClass228_2570;
		} else if (-1381220489 * Class228.aClass228_2569.anInt2571 == i) {
			return Class228.aClass228_2569;
		}

		return null;
	}

	int id;

	Class16(int i) {
		id = -339963269 * i;
	}

	@Override
	public int getId() {
		return -1762231117 * id;
	}

}