package com.jagex;

public class IdentikitDefinitionProvider implements DefinitionProvider<IdentikitDefinition> {
	static boolean[][] aBoolArrayArray3303;

	public static final void method5495(int i) {
		for (Class480_Sub12 class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10068.head(); class480_sub12 != null; class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10068
				.next()) {
			if (!class480_sub12.aBool10063) {
				class480_sub12.aBool10069 = true;
				if (class480_sub12.localX * 1155137153 >= 0 && class480_sub12.localZ * 51547319 >= 0
						&& class480_sub12.localX * 1155137153 < Client.aClass460_10760.method7680()
						&& 51547319 * class480_sub12.localZ < Client.aClass460_10760.method7707()) {
					Class27.method789(class480_sub12);
				}
			} else {
				class480_sub12.unlink();
			}
		}
		for (Class480_Sub12 class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10067.head(); class480_sub12 != null; class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10067
				.next()) {
			if (!class480_sub12.aBool10063) {
				class480_sub12.aBool10069 = true;
			} else {
				class480_sub12.unlink();
			}
		}
	}

	static void method5491(Class489[][][] class489s, int i) {
		for (Class489[][] class489s_2_ : class489s) {
			for (Class489[] element : class489s_2_) {
				for (int i_4_ = 0; i_4_ < element.length; i_4_++) {
					Class489 class489 = element[i_4_];
					if (null != class489) {
						if (class489.aClass600_Sub1_Sub4_6678 instanceof SceneObject) {
							((SceneObject) class489.aClass600_Sub1_Sub4_6678).method372();
						}
						if (class489.aClass600_Sub1_Sub2_6672 instanceof SceneObject) {
							((SceneObject) class489.aClass600_Sub1_Sub2_6672).method372();
						}
						if (class489.aClass600_Sub1_Sub2_6677 instanceof SceneObject) {
							((SceneObject) class489.aClass600_Sub1_Sub2_6677).method372();
						}
						if (class489.aClass600_Sub1_Sub5_6674 instanceof SceneObject) {
							((SceneObject) class489.aClass600_Sub1_Sub5_6674).method372();
						}
						if (class489.aClass600_Sub1_Sub5_6675 instanceof SceneObject) {
							((SceneObject) class489.aClass600_Sub1_Sub5_6675).method372();
						}
						for (Class491 class491 = class489.aClass491_6680; class491 != null; class491 = class491.aClass491_6753) {
							Class600_Sub1_Sub3 class600_sub1_sub3 = class491.aClass600_Sub1_Sub3_6752;
							if (class600_sub1_sub3 instanceof SceneObject) {
								((SceneObject) class600_sub1_sub3).method372();
							}
						}
					}
				}
			}
		}
	}

	static final void method5492(ScriptExecutionContext class613, byte i) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_5_);
		Interface class221 = Class598.loadedInterfaces[i_5_ >> 16];
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (class226.animation * 1642844085 != i_1_) {
			if (i_1_ != -1) {
				if (null == class226.aClass650_2541) {
					class226.aClass650_2541 = new Class650_Sub3();
				}
				class226.aClass650_2541.update(i_1_);
			} else {
				class226.aClass650_2541 = null;
			}
			class226.animation = 1473373853 * i_1_;
			Widget.redraw(class226);
		}
		if (-1 == class226.component * -592186295 && !class221.aBool2278) {
			Class642_Sub4.method16758(class226.id * 1857819631, (byte) -1);
		}
	}

	static final void method5493(ScriptExecutionContext class613) {
		int i_6_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_6_);
		Interface class221 = Class598.loadedInterfaces[i_6_ >> 16];
		ScriptExecutionContext.method1138(class226, class221, class613);
	}

	static final void method5494(ScriptExecutionContext class613, int i) {
		int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_7_);
		Interface class221 = Class598.loadedInterfaces[i_7_ >> 16];
		ScriptExecutionContext.method3552(class226, class221, class613);
	}

	Archive models;

	IdentikitDefinitionProvider(Archive models) {
		this.models = models;
	}

	@Override
	public Class<IdentikitDefinition> getClassType() {
		return IdentikitDefinition.class;
	}

	@Override
	public IdentikitDefinition provide(int id, DefinitionLoader<IdentikitDefinition> cache) {
		return new IdentikitDefinition(models);
	}

}