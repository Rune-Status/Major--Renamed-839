package com.jagex;

public class ValueType implements Identifiable {
	static ValueType aClass423_4847;
	public static ValueType LONG;
	public static ValueType STRING;
	static ValueType aClass423_4850;
	public static ValueType INTEGER = new ValueType(4, 0, Integer.class);
	public static Archive textureDefinitions;
	static int anInt4856;
	static {
		LONG = new ValueType(0, 1, Long.class);
		STRING = new ValueType(3, 2, String.class);
		aClass423_4850 = new ValueType(2, 3, Class480_Sub22.class);
		aClass423_4847 = new ValueType(1, 4, Class215.class);
	}

	public static ValueType[] values() {
		return new ValueType[] { INTEGER, aClass423_4847, LONG, STRING, aClass423_4850 };
	}

	public static void method7039(int i) {
		Class36 class36 = (Class36) Class495_Sub1.aHashMap10331.get(Integer.valueOf(i));
		if (class36 == null) {
			class36 = new Class36();
		}
		class36.anInt460 = Class495_Sub1.anInt10333 * -172530885;
		class36.anInt459 = -122843361 * Class495_Sub1.anInt10334;
		Class495_Sub1.aHashMap10331.put(Integer.valueOf(i), class36);
	}

	static final void method7037(ScriptExecutionContext class613, short i) {
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_1_);
		Interface class221 = Class598.loadedInterfaces[i_1_ >> 16];
		ScriptExecutionContext.method3539(class226, class221, class613, (byte) 1);
	}

	static final void method7038(ScriptExecutionContext class613) {
		Widget class226 = Widget.lookup(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
		if (-1 != 1391525437 * class226.item) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.itemAmount
					* -1212380503;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static char method7040(char c) {
		if ('\u00c6' == c) {
			return 'E';
		}
		if (c == '\u00e6') {
			return 'e';
		}
		if ('\u00df' == c) {
			return 's';
		}
		if (c == '\u0152') {
			return 'E';
		}
		if ('\u0153' == c) {
			return 'e';
		}
		return '\0';
	}

	static final void method7041(ScriptExecutionContext class613, int i) {
		int i_3_ = Client.aClass667_10791.size();
		if (-1 != 1764783361 * Client.anInt10790) {
			i_3_++;
		}
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = i_3_;
	}

	static final void method7042(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method1573(class226, class221, class613);
	}

	static final void method7043(ScriptExecutionContext class613) {
		Class199.preferences.setValue(Class199.preferences.fog,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1 ? 1 : 0);
		Client.aClass460_10760.method7705();
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	public Class classType;
	int id;
	public int anInt4854;

	ValueType(int i, int i_0_, Class clazz) {
		anInt4854 = i * 2087469675;
		id = -1215678093 * i_0_;
		classType = clazz;
	}

	@Override
	public int getId() {
		return -838233157 * id;
	}

}