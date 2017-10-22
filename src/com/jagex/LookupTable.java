package com.jagex;

public class LookupTable {
	static int anInt2647;

	public static void method4583() {
		Class277.aBool3118 = true;
		SpawnAnimatedObjectCutsceneAction.aString11131 = Class31.aString423;
		BaseNpcDefinitionProvider.aString2994 = Class31.accountPassword;
		Class495_Sub1.logout(false);
		Class180.method3544();
		Class277.aClass262Array3115 = null;
		ArchiveLoader.aClass402_4522 = null;
		Class536.setGameState(4);
	}

	int[] table;

	public LookupTable(int[] is) {
		int size;
		for (size = 1; size <= (is.length >> 1) + is.length; size <<= 1) {

		}
		table = new int[size + size];
		for (int index = 0; index < size + size; index++) {
			table[index] = -1;
		}
		for (int index = 0; index < is.length; index++) {
			int pos;
			for (pos = is[index] & size - 1; table[pos + pos + 1] != -1; pos = pos + 1 & size - 1) {

			}
			table[pos + pos] = is[index];
			table[pos + pos + 1] = index;
		}
	}

	public int get(int identifer) {
		int size = (table.length >> 1) - 1;
		int position = identifer & size;
		for (;;) {
			int current = table[position + position + 1];
			if (-1 == current) {
				return -1;
			} else if (table[position + position] == identifer) {
				return current;
			}

			position = position + 1 & size;
		}
	}

}