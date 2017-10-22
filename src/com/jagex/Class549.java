package com.jagex;

public class Class549 {

	public static Class549 TEXTURE = new Class549(0);
	public static Class549 TEXTURE_AND_MATERIAL = new Class549(1);
	public static Class549 MATERIAL = new Class549(4);

	public static long method9328(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, byte i_5_) {
		CalendarUtils.GMT_CALENDAR.clear();
		CalendarUtils.GMT_CALENDAR.set(i_4_, i_3_, i_2_, i_1_, i_0_, i);
		return CalendarUtils.GMT_CALENDAR.getTime().getTime();
	}

	public static void method9329(boolean bool) {
		for (Class480_Sub18 class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass644_10111.head(); null != class480_sub18; class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass644_10111
				.next()) {
			if (class480_sub18.aClass456_10136 != null) {
				class480_sub18.aClass456_10136.method7431(150);
				TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10136);
				class480_sub18.aClass456_10136 = null;
			}
			if (class480_sub18.aClass456_10119 != null) {
				class480_sub18.aClass456_10119.method7431(150);
				TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10119);
				class480_sub18.aClass456_10119 = null;
			}
			class480_sub18.unlink();
		}
		if (bool) {
			for (Class480_Sub18 class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass644_10112.head(); class480_sub18 != null; class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass644_10112
					.next()) {
				if (class480_sub18.aClass456_10136 != null) {
					class480_sub18.aClass456_10136.method7431(150);
					TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10136);
					class480_sub18.aClass456_10136 = null;
				}
				class480_sub18.unlink();
			}
			for (Class480_Sub18 class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass667_10113.first(); null != class480_sub18; class480_sub18 = (Class480_Sub18) Class480_Sub18.aClass667_10113
					.next()) {
				if (class480_sub18.aClass456_10136 != null) {
					class480_sub18.aClass456_10136.method7431(150);
					TurnMobCutsceneAction.aClass186_9434.method3631(class480_sub18.aClass456_10136);
					class480_sub18.aClass456_10136 = null;
				}
				class480_sub18.unlink();
			}
		}
	}

	Class549(int value) {

	}

}