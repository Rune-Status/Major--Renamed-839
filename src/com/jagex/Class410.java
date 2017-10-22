package com.jagex;

import java.util.Calendar;

public class Class410 {
	public static final int anInt4605 = 5;
	public static final int anInt4606 = 4;
	public static final int anInt4607 = 1;
	public static final int anInt4608 = 6;
	public static final int anInt4609 = 2;
	public static final int anInt4610 = 3;

	public static final void method6946() {
		Class31.loginStep = -2074489177;
		Class31.anInt395 = 1473095230;
		Class31.anInt429 = -1525773506;
	}

	public static boolean method6951() {
		return Class533.aBool7280;
	}

	static final void method6948(ScriptExecutionContext class613) {
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = new StringBuilder()
				.append(Class297.method5441(
						class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 60000L,
						Client.currentLanguage.getId(), true, 16777215)).append(" UTC").toString();
	}

	static String method6950(long l) {
		Class527.method8990(l);
		int day = CalendarUtils.DEFAULT_CALENDAR.get(Calendar.DAY_OF_MONTH);
		int month = CalendarUtils.DEFAULT_CALENDAR.get(Calendar.MONTH) + 1;
		int year = CalendarUtils.DEFAULT_CALENDAR.get(Calendar.YEAR);

		return Integer.toString(day / 10) + (day % 10) + "/" + (month / 10) + "" + (month % 10) + "/" + (year % 100)
				/ 10 + "" + (year % 10);
	}

	Class410() throws Throwable {
		throw new Error();
	}

}