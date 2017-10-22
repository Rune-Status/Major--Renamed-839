package com.jagex;

public class LoadingRequirementType {
	public static LoadingRequirementType ARCHIVE_CHILDREN;
	public static LoadingRequirementType ARCHIVE_FILE;
	public static LoadingRequirementType ARCHIVE = new LoadingRequirementType();
	public static LoadingRequirementType LIBRARY;
	static int anInt236;

	static {
		ARCHIVE_FILE = new LoadingRequirementType();
		ARCHIVE_CHILDREN = new LoadingRequirementType();
		LIBRARY = new LoadingRequirementType();
	}

	public static float method592(Class395 class395, int i) {
		Class397 class397 = Class397.create(0.0F, 0.0F, 1.0F);
		class397.method6480(class395);
		double d = 1.5707963267948966 - Math.acos(class397.y);
		class397.cache();
		return (float) d;
	}

	public static int method594(MenuOption class480_sub31_sub17, int i) {
		if (Class56.menuOpen) {
			return 6;
		}
		if (null == class480_sub31_sub17) {
			return 0;
		}
		int i_3_ = class480_sub31_sub17.type * -20536735;
		if (MenuOption.method1628(i_3_)) {
			return 1;
		}
		if (Class530.method9028(i_3_)) {
			return 2;
		}
		if (Class512.method8809(i_3_)) {
			return 3;
		}
		if (Class31.method905(i_3_)) {
			return 4;
		}
		if (Class249.method4705(i_3_, 1593682031)) {
			return 7;
		}
		if (i_3_ == 16) {
			return 8;
		}
		return 5;
	}

	public static int method595() {
		return Class533.anInt7283 * 1274816843;
	}

	static void method590(Class11_Sub1 class11_sub1) {
		class11_sub1.method16226(0);
		int i_0_;
		if (1926618523 * Engine.heapSize >= 96) {
			int i_1_ = AsynchronousHttpRequestCreator.method6954();
			if (i_1_ <= 101) {
				VarpLoaderIterator.method9691();
				i_0_ = 4;
			} else if (i_1_ <= 502) {
				PreferenceManager.method1038();
				i_0_ = 3;
			} else if (i_1_ <= 1004) {
				PreferenceManager.setDefaultPreferences();
				i_0_ = 2;
			} else {
				Engine.method8026(true);
				i_0_ = 1;
			}
			class11_sub1.method16222(0, i_1_);
		} else {
			Engine.method8026(true);
			i_0_ = 1;
			class11_sub1.method16220(64);
		}
		if (Class199.preferences.currentToolkit.getValue() != 0) {
			Class199.preferences.setValue(Class199.preferences.desiredToolkit, 0);
			ChecksumTableEntry.method6355(0, false);
		} else {
			Class199.preferences.setLive(Class199.preferences.currentToolkit, true);
		}
		Client.savePreferences();
		class11_sub1.method16219(i_0_);
	}

	static final void method591(ScriptExecutionContext class613) throws ScriptException {
		Class369.aClass261_Sub1_4079.method4816();
	}

	static final void method593(ScriptExecutionContext class613, int i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		int i_2_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = new StringBuilder()
				.append(string).append(Class452.decimalToString(i_2_, true)).toString();
	}

	LoadingRequirementType() {

	}
}
