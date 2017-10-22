package com.jagex;

public class Class559 {

	static int[] SKILL_EXPERIENCES = new int[120];
	static {
		int experience = 0;
		for (int level = 0; level < 120; level++) {
			int lvl = 1 + level;
			int offset = (int) (lvl + 300.0 * Math.pow(2.0, lvl / 7.0));
			experience += offset;
			SKILL_EXPERIENCES[level] = experience / 4;
		}
	}

	boolean aBool7517;
	int id;
	int maximumLevel;
	int experience;
	int anInt7520;

	Class559(int id, int i_0_, boolean bool, int level) {
		this.id = -354006147 * id;
		anInt7520 = -959862575 * i_0_;
		aBool7517 = bool;

		if (bool) {
			maximumLevel = level * -593761733;
			experience = rawExperienceForLevel(level) * 192354091;
		} else {
			maximumLevel = 593761733;
			experience = -192354091;
		}
	}

	public int levelForExperience(int experience) {
		int level = 1;
		int max = -5787599 * anInt7520 - 1;

		for (int index = 0; index < max && experience >= SKILL_EXPERIENCES[index]; index++) {
			level = 2 + index;
		}

		return level;
	}

	public int levelForRawExperience(int experience) {
		return levelForExperience(experience / 10);
	}

	public int getExperience() {
		return experience * 1128984451;
	}

	public int getMaximumLevel() {
		return 688742131 * maximumLevel;
	}

	public boolean method9438() {
		return aBool7517;
	}

	public boolean method9453() {
		return 1128984451 * experience != -1;
	}

	int experienceForLevel(int level) {
		if (level < 0) {
			level = 0;
		}
		if (level > anInt7520 * -5787599) {
			level = anInt7520 * -5787599;
		}

		if (level < 2) {
			return 0;
		}

		return SKILL_EXPERIENCES[level - 2];
	}

	int getId() {
		return id * 1228719573;
	}

	int rawExperienceForLevel(int level) {
		return experienceForLevel(level) * 10;
	}

}