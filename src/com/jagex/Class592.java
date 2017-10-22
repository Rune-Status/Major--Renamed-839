package com.jagex;

public class Class592 {
	static FontSpecification aClass9_7834;

	public static String method10026(long l, int i) {
		Class527.method8990(l);
		int i_3_ = CalendarUtils.DEFAULT_CALENDAR.get(5);
		int i_4_ = CalendarUtils.DEFAULT_CALENDAR.get(2);
		int i_5_ = CalendarUtils.DEFAULT_CALENDAR.get(1);
		if (i == 3) {
			return Class410.method6950(l);
		}
		return new StringBuilder().append(Integer.toString(i_3_ / 10)).append(i_3_ % 10).append("-")
				.append(CalendarUtils.MONTHS[i][i_4_]).append("-").append(i_5_).toString();
	}

	static final void method10024(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		Class49.method1110(class226, class221, class613, 287960181);
	}

	static final void method10025(ScriptExecutionContext class613, int i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class80.method1677((char) i_1_,
				-1190955577) ? 1 : 0;
	}

	static final void method10027(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= -926911801;
		int i_6_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_7_ = class613.anIntArray7942[1 + class613.anInt7924 * 1841827045];
		boolean bool = 1 == class613.anIntArray7942[2 + class613.anInt7924 * 1841827045];
		Class565 class565 = ItemDefinition.aClass192_8339.method3806(i_6_).method3927(i_7_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = bool ? class565.method9536()
				: class565.getExperience();
	}

	Class592() throws Throwable {
		throw new Error();
	}
}
