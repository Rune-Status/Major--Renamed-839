package com.jagex;

import java.awt.Dimension;

public class Class431 {
	public static Class431 aClass431_4893 = new Class431(0);
	public static Class431 aClass431_4894 = new Class431(1);
	public static Class431 aClass431_4895 = new Class431(2);
	public static Class431 aClass431_4896 = new Class431(3);
	public static Class431 aClass431_4897 = new Class431(4);
	static Class431 aClass431_4898 = new Class431(5);
	static Class431 aClass431_4899 = new Class431(6);
	static Class431 aClass431_4900 = new Class431(7);
	static Class431 aClass431_4901 = new Class431(8);

	public static int method7147(int i, int i_1_) {
		if (-1 == -587121439 * Mob.defaults.profilingModel) {
			return 1;
		}
		if (i != Class199.preferences.currentToolkit.getValue()) {
			Class369.method6110(i, TranslatableString.PROFILING.translate(Client.currentLanguage), true);
			if (Class199.preferences.currentToolkit.getValue() != i) {
				return -1;
			}
		}
		int i_3_;
		try {
			Dimension dimension = Engine.aCanvas6501.getSize();
			Class62.method1382(TranslatableString.PROFILING.translate(Client.currentLanguage), true,
					Class60.activeToolkit, Client.p12Full, Class24.p12Full);
			BaseModel class144 = BaseModel.lookup(Class436.models, -587121439 * Mob.defaults.profilingModel, 0);
			long l = TimeUtil.time();
			Class60.activeToolkit.method2421();
			Client.aClass405_10612.method6742(0.0F, 256.0F, 0.0F);
			Class60.activeToolkit.method2471(Client.aClass405_10612);
			Matrix4f class399 = Class60.activeToolkit.method2462();
			class399.method6559(dimension.width / 2, dimension.height / 2, 512.0F, 512.0F,
					Client.aClass460_10760.method7685(), Client.aClass460_10760.method7686(), dimension.width,
					dimension.height);
			Class60.activeToolkit.method2540(class399);
			Class60.activeToolkit.method2476(1.0F);
			Class60.activeToolkit.method2477(16777215, 0.5F, 0.5F, 20.0F, -50.0F, 30.0F);
			Model class143 = Class60.activeToolkit.createModel(class144, 2048, 64, 64, 768);
			int i_4_ = 0;
			while_14_: for (int i_5_ = 0; i_5_ < 500; i_5_++) {
				Class60.activeToolkit.method2426(3, 0);
				for (int i_6_ = 15; i_6_ >= 0; i_6_--) {
					for (int i_7_ = 0; i_7_ <= i_6_; i_7_++) {
						Client.aClass405_10715
								.method6742((int) ((i_7_ - i_6_ / 2.0F) * 512.0F), 0.0F, (1 + i_6_) * 512);
						class143.method2917(Client.aClass405_10715, null, 0);
						i_4_++;
						if (TimeUtil.time() - l >= i_1_) {
							break while_14_;
						}
					}
				}
			}
			Class60.activeToolkit.method2372();
			long l_8_ = i_4_ * 1000 / (TimeUtil.time() - l);
			Class60.activeToolkit.method2426(3, 0);
			i_3_ = (int) l_8_;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return -1;
		}
		return i_3_;
	}

	public static void method7148(long[] ls, int[] is) {
		ArrayUtils.sort(ls, is, 0, ls.length - 1);
	}

	static final void method7146(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		MobDefaults.method9578(class226, class221, class613);
	}

	public int anInt4902;

	Class431(int i) {
		anInt4902 = 109407615 * i;
	}
}
