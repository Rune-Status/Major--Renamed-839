package com.jagex;

public class Class22 implements Identifiable {
	public static Class22 aClass22_306 = new Class22(8);
	static Class22 aClass22_307 = new Class22(1);
	public static Class22 aClass22_308 = new Class22(13);
	public static Class22 aClass22_309 = new Class22(3);
	public static Class22 aClass22_310 = new Class22(4);
	static Class22 aClass22_311 = new Class22(0);
	static Class22 aClass22_312 = new Class22(6);
	static Class22 aClass22_313 = new Class22(7);
	static Class22 aClass22_314 = new Class22(5);
	public static Class22 aClass22_315 = new Class22(9);
	public static Class22 aClass22_316 = new Class22(10);
	static Class22 aClass22_317 = new Class22(11);
	public static Class22 aClass22_318 = new Class22(12);
	static Class22 aClass22_319 = new Class22(2);
	public static Archive defaults;
	static int anInt322;

	static void method749() {
		Class281_Sub3 class281_sub3 = (Class281_Sub3) Class50.aClass261_Sub1_582.method4876();
		Class642_Sub1 class642_sub1 = (Class642_Sub1) Class50.aClass261_Sub1_582.method4834();
		Class397 class397 = class281_sub3.method5224();
		Class395 class395 = class642_sub1.method16693();

		if (null != Client.aClass226_10798) {
			int i_0_ = Client.aClass226_10798.width * 688089097;
			int i_1_ = 1362321717 * Client.aClass226_10798.height;
			float f = 1000.0F;
			float f_2_ = (float) (2.0 * Math.atan(i_0_ / 2.0F / f));
			float f_3_ = (float) (2.0 * Math.atan(i_1_ / 2.0F / f));

			try {
				Class50.aClass261_Sub1_582.method4854(f_2_, f_3_);
			} catch (ScriptException exception_sub3) {

			}
		}

		if (Client.recorder.rightButtonDown()) {
			Class395 class395_4_ = Class395.create();
			class395_4_.method6367(1.0F, 0.0F, 0.0F,
					(Client.recorder.getMouseY() - Class50.mouseY * 962001503) / 200.0F);
			class395.method6377(class395_4_);
			Class397 class397_5_ = Class397.create(0.0F, 1.0F, 0.0F);
			class397_5_.method6480(class395);
			Class395 class395_6_ = Class395.create();
			class395_6_.method6380(class397_5_,
					(1055432981 * ScriptException.mouseX - Client.recorder.getMouseX()) / 200.0F);
			class395.method6377(class395_6_);
			class642_sub1.method16685(class395);
		}

		ScriptException.mouseX = Client.recorder.getMouseX() * 2099684925;
		Class50.mouseY = Client.recorder.getMouseY() * -265035361;
		class395.method6379();

		if (Class193.keyRecorder.held(98)) {
			Class397 class397_7_ = Class397.create(0.0F, 0.0F, 25.0F);
			class397_7_.method6480(class395);
			class397_7_.y *= -1.0F;
			class397.add(class397_7_);
		}

		if (Class193.keyRecorder.held(99)) {
			Class397 class397_8_ = Class397.create(0.0F, 0.0F, -25.0F);
			class397_8_.method6480(class395);
			class397_8_.y *= -1.0F;
			class397.add(class397_8_);
		}

		if (Class193.keyRecorder.held(96)) {
			Class397 class397_9_ = Class397.create(-25.0F, 0.0F, 0.0F);
			class397_9_.method6480(class395);
			class397_9_.y *= -1.0F;
			class397.add(class397_9_);
		}

		if (Class193.keyRecorder.held(97)) {
			Class397 class397_10_ = Class397.create(25.0F, 0.0F, 0.0F);
			class397_10_.method6480(class395);
			class397_10_.y *= -1.0F;
			class397.add(class397_10_);
		}

		Class480_Sub22 class480_sub22 = new Class480_Sub22(0, (int) class397.x, (int) class397.y, (int) class397.z);
		class281_sub3.method15304(class480_sub22);
		Class553 class553 = Client.aClass460_10760.method7679();
		int i_11_ = 2051316501 * class553.x << 9;
		int i_12_ = class553.z * -180305283 << 9;
		Class50.aClass261_Sub1_582.method4804(0.02F, Client.aClass460_10760.method7696().tileHeights,
				Client.aClass460_10760.method7775(), i_11_, i_12_);
	}

	int id;

	Class22(int i) {
		id = 1163972649 * i;
	}

	@Override
	public int getId() {
		return id * 800312345;
	}

}