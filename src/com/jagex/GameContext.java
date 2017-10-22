package com.jagex;

public class GameContext {
	static GameContext RUNESCAPE_2007 = new GameContext("oldscape", "RuneScape 2007", 5, Class25.aClass25_347);
	public static GameContext RUNESCAPE = new GameContext("runescape", "RuneScape", 0, Class25.aClass25_347);
	static GameContext aClass623_8018 = new GameContext("game3", "Game 3", 2, Class25.aClass25_347);
	static GameContext aClass623_8019 = new GameContext("game4", "Game 4", 3, Class25.aClass25_337);
	static GameContext aClass623_8020 = new GameContext("game5", "Game 5", 4, Class25.aClass25_342);
	public static GameContext STELLAR_DAWN = new GameContext("stellardawn", "Stellar Dawn", 1, Class25.aClass25_340);

	public static Interface method10444(int i, int[] is, Interface class221, boolean bool) {
		if (!UnboundedDefinitionLoaderIterator.widgets.loadEntry(i)) {
			return null;
		}
		int i_2_ = UnboundedDefinitionLoaderIterator.widgets.childSize(i);
		Widget[] class226s;
		if (i_2_ == 0) {
			class226s = new Widget[0];
		} else if (null == class221) {
			class226s = new Widget[i_2_];
		} else {
			class226s = class221.children;
		}
		if (null == class221) {
			class221 = new Interface(bool, class226s);
		} else {
			class221.children = class226s;
			class221.aBool2278 = bool;
		}
		for (int i_3_ = 0; i_3_ < i_2_; i_3_++) {
			if (null == class221.children[i_3_]) {
				byte[] data = UnboundedDefinitionLoaderIterator.widgets.get(i, i_3_, is);
				if (null != data) {
					Widget class226 = class221.children[i_3_] = new Widget();
					class226.id = -1375110385 * (i_3_ + (i << 16));
					class226.method4301(new Buffer(data));
				}
			}
		}
		return class221;
	}

	public String domain;
	public String name;
	public int id;

	GameContext(String domain, String name, int id, Class25 class25) {
		this.domain = domain;
		this.name = name;
		this.id = id * 1459032409;
	}

	public static GameContext valueOf(int id) {
		GameContext[] values = GameContext.values();
		for (GameContext context : values) {
			if (context.id * -1589762327 == id) {
				return context;
			}
		}

		return null;
	}

	static GameContext[] values() {
		return new GameContext[] { aClass623_8019, aClass623_8020, RUNESCAPE_2007, aClass623_8018, RUNESCAPE,
				STELLAR_DAWN };
	}

}