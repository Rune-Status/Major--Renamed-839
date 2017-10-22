package com.jagex;

public class Class565 {
	static final int anInt7579 = 2000000000;

	static final void method9560(byte i) {
		byte[][][] is = Client.aClass460_10760.method7694();
		if (null == is) {
			is = new byte[4][Client.aClass460_10760.method7680()][Client.aClass460_10760.method7707()];
			Client.aClass460_10760.method7770(is);
		}

		for (int i_7_ = 0; i_7_ < 4; i_7_++) {
			for (int i_8_ = 0; i_8_ < Client.aClass460_10760.method7680(); i_8_++) {
				for (int i_9_ = 0; i_9_ < Client.aClass460_10760.method7707(); i_9_++) {
					is[i_7_][i_8_][i_9_] = i;
				}
			}
		}
	}

	int level = -1182317223;
	Class559 aClass559_7577;
	boolean raw;
	int experience = 0;
	int anInt7581 = 511065337;

	public Class565(Class559 class559, boolean raw) {
		aClass559_7577 = class559;
		this.raw = raw;
	}

	public void method9529(int i) {
		anInt7581 = i * 511065337;
	}

	public int getExperience() {
		return 1440396249 * experience;
	}

	public void method9532(int i) {
		experience = i * -1261134743;

		if (experience * 1440396249 < 0) {
			experience = 0;
		} else if (raw && 1440396249 * experience > 2000000000) {
			experience = 455717888;
		} else if (!raw && experience * 1440396249 > 200000000) {
			experience = 904565248;
		}

		method9540();
	}

	public int method9534(Class615 class615) {
		if (class615 == Class615.aClass615_7954 && aClass559_7577.method9438() && aClass559_7577.method9453()) {
			int maximum = aClass559_7577.getMaximumLevel();

			if (-340086039 * level > maximum) {
				return maximum;
			}
		}

		return -340086039 * level;
	}

	public int method9536() {
		return level * -340086039;
	}

	public int method9543() {
		return anInt7581 * 1451607369;
	}

	public int method9556(Class615 class615) {
		if (Class615.aClass615_7954 == class615 && aClass559_7577.method9438() && aClass559_7577.method9453()) {
			int experience = aClass559_7577.getExperience();
			if (!raw) {
				experience /= 10;
			}

			if (this.experience * 1440396249 > experience) {
				return experience;
			}
		}

		return experience * 1440396249;
	}

	void method9540() {
		if (raw) {
			level = aClass559_7577.levelForRawExperience(1440396249 * experience) * -1182317223;
		} else {
			level = aClass559_7577.levelForExperience(1440396249 * experience) * -1182317223;
		}
	}

}