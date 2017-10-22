package com.jagex;

public class EnvironmentContext {
	public static int[] anIntArray8169;
	static int anInt8164;

	public static void method13262() {
		Class163.variables.clear();
		CutsceneArea.cutsceneAreas.clear();
		Class493.aClass159Array6787 = null;
		CutsceneMob.mobs = null;
		CutsceneObject.objects = null;
		CutsceneWalk.walks = null;
		CutsceneAction.actions = null;
		Class163.anInt1907 = -1697778917;
		Class163.anInt1908 = 0;
		Class163.anInt1905 = 0;
		Class163.aClass155_1915 = null;
		Class163.anInt1914 = -739340267;
		Class163.anInt1916 = 63563923;

		if (Class163.aBool1910) {
			Client.aShort10902 = Class166_Sub3.aShort9532;
			Client.aShort10885 = VarpDefinitionLoader.aShort10931;
			Client.aShort10626 = Class163.aShort1912;
			Client.aShort10758 = Class163.aShort1903;
			Class163.aBool1910 = false;
		}
	}

	static void method13263(int i, byte i_2_) {
		int i_3_;
		if (0 == i) {
			i_3_ = 0;
		} else if (i == 1) {
			i_3_ = 1;
		} else if (i == 2) {
			i_3_ = 2;
		} else {
			return;
		}
		int i_4_;
		if (Class495.aFloat6835 == 2.0) {
			i_4_ = 0;
		} else if (Class495.aFloat6835 == 3.0) {
			i_4_ = 1;
		} else if (Class495.aFloat6835 == 4.0) {
			i_4_ = 2;
		} else if (Class495.aFloat6835 == 6.0) {
			i_4_ = 3;
		} else if (Class495.aFloat6835 >= 8.0) {
			i_4_ = 4;
		} else {
			return;
		}
		Class679.aClass132_288 = Class495_Sub1.aClass132ArrayArray10329[i_3_][i_4_];
		ChecksumTableEntry.aClass9_4512 = Class495_Sub1.aClass9ArrayArray10339[i_3_][i_4_];
	}

	boolean arm;
	int heapSize;
	int processors;
	boolean windows;

	EnvironmentContext(int heapSize, int processors, boolean arm, boolean windows) {
		this.heapSize = -492882479 * heapSize;
		this.processors = 402128387 * processors;
		this.arm = arm;
		this.windows = windows;
	}

	public int getHeapSize() {
		return heapSize * 1554072369;
	}

	public int getProcessorCount() {
		return processors * -606397269;
	}

	public boolean isArm() {
		return arm;
	}

	public boolean isWindows() {
		return windows;
	}

}