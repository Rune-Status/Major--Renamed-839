package com.jagex;

final class PlayerVarpType extends VarpType {
	public static DisplayProperties[] method15345() {
		if (null == Class62.aClass651Array689) {
			DisplayProperties[] all = DisplayProperties.getAll(Class589.fullScreenAdapter);
			DisplayProperties[] class651s_1_ = new DisplayProperties[all.length];
			int i_2_ = 0;
			int i_3_ = Class199.preferences.maxScreenSize.getValue();
			while_11_: for (int i_4_ = 0; i_4_ < all.length; i_4_++) {
				DisplayProperties class651 = all[i_4_];
				if ((class651.bitDepth * 951692249 <= 0 || class651.bitDepth * 951692249 >= 24)
						&& 1967400213 * class651.width >= 800 && -150744351 * class651.height >= 600
						&& (i_3_ != 2 || 1967400213 * class651.width <= 800 && class651.height * -150744351 <= 600)
						&& (i_3_ != 1 || 1967400213 * class651.width <= 1024 && -150744351 * class651.height <= 768)) {
					for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
						DisplayProperties class651_6_ = class651s_1_[i_5_];
						if (class651.width * 1967400213 == class651_6_.width * 1967400213
								&& class651.height * -150744351 == -150744351 * class651_6_.height) {
							if (class651.bitDepth * 951692249 > class651_6_.bitDepth * 951692249) {
								class651s_1_[i_5_] = class651;
							}
							continue while_11_;
						}
					}
					class651s_1_[i_2_] = class651;
					i_2_++;
				}
			}
			Class62.aClass651Array689 = new DisplayProperties[i_2_];
			System.arraycopy(class651s_1_, 0, Class62.aClass651Array689, 0, i_2_);
			int[] is = new int[Class62.aClass651Array689.length];
			for (int i_7_ = 0; i_7_ < Class62.aClass651Array689.length; i_7_++) {
				DisplayProperties class651 = Class62.aClass651Array689[i_7_];
				is[i_7_] = -150744351 * class651.height * class651.width * 1967400213;
			}
			ArrayUtils.sort(is, Class62.aClass651Array689);
		}
		return Class62.aClass651Array689;
	}

	public static void method15346(int i) {
		if (Class255.method4749() != Class465.aClass465_5274) {
			try {
				String string = Class454.applet.getParameter(ClientParameter.aClass385_4272.name);
				int i_8_ = (int) (TimeUtil.time() / 86400000L) - 11745;
				String string_9_ = new StringBuilder().append("usrdob=").append(i_8_)
						.append("; version=1; path=/; domain=").append(string).toString();
				JavascriptUtils.eval(Class454.applet, new StringBuilder().append("document.cookie=\"")
						.append(string_9_).append("\"").toString());
			} catch (Throwable throwable) {

			}
		}
	}

	static final void method15347(ScriptExecutionContext class613, byte i) {
		int i_10_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.skyboxes
				.compatible(i_10_);
	}

	PlayerVarpType(ConfigEntry config, int id) {
		super(config, id);
	}

	@Override
	Object method7337(BaseVariableParameterDefinition parameter) {
		if (CharacterType.ONE == parameter.aClass422_1515) {
			return -1;
		}

		return parameter.aClass422_1515.method7017();
	}

}