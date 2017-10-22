package com.jagex;

import java.awt.datatransfer.Clipboard;

public class Class198 implements Identifiable {
	public static Class198 aClass198_2091 = new Class198(2, 1);
	public static Class198 aClass198_2092 = new Class198(1, 2);
	public static Class198 aClass198_2093 = new Class198(0, 0);
	static Interface44 anInterface44_2095;
	public static Clipboard aClipboard2096;

	public static Class198[] values() {
		return new Class198[] { aClass198_2093, aClass198_2092, aClass198_2091 };
	}

	public static int method3870(Class395 class395) {
		Class397 class397 = Class397.create(0.0F, 0.0F, 1.0F);
		class397.method6480(class395);
		double d = 1.5707963267948966 - Math.acos(class397.y);
		class397.cache();
		if (d < 0.0) {
			d = d + Math.PI + Math.PI;
		}
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	public static void method3873(boolean bool) {
		Class495_Sub1.aBool10335 = bool;
	}

	static void method3869(Interface class221, Widget class226) {
		if (null != class226) {
			if (-592186295 * class226.component != -1) {
				Widget class226_1_ = class221.children[class226.parent * 1920469085 & 0xffff];
				if (class226_1_ != null) {
					if (class226_1_.aClass226Array2542 == class226_1_.aClass226Array2521) {
						class226_1_.aClass226Array2521 = new Widget[class226_1_.aClass226Array2542.length];
						class226_1_.aClass226Array2521[0] = class226;
						Class627.method13077(class226_1_.aClass226Array2542, 0, class226_1_.aClass226Array2521, 1,
								class226.component * -592186295);
						Class627.method13077(class226_1_.aClass226Array2542, class226.component * -592186295 + 1,
								class226_1_.aClass226Array2521, class226.component * -592186295 + 1,
								class226_1_.aClass226Array2542.length - -592186295 * class226.component - 1);
					} else {
						int i_2_ = 0;
						Widget[] class226s;
						for (class226s = class226_1_.aClass226Array2521; i_2_ < class226s.length
								&& class226 != class226s[i_2_]; i_2_++) {

						}
						if (i_2_ < class226s.length) {
							Class627.method13077(class226s, 0, class226s, 1, i_2_);
							class226s[0] = class226;
						}
					}
				}
			} else {
				Widget[] class226s = class221.getChildren();
				int i_3_;
				for (i_3_ = 0; i_3_ < class226s.length && class226 != class226s[i_3_]; i_3_++) {

				}
				if (i_3_ < class226s.length) {
					Class627.method13077(class226s, 0, class226s, 1, i_3_);
					class226s[0] = class226;
				}
			}
		}
	}

	static boolean method3871(String string, String string_4_) {
		Class31.loginType = 472539564;
		Class31.activeConnection = Client.lobbyConnection;
		return Class110.method2024(false, false, string, string_4_, -1L);
	}

	static final void method3872(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (ScriptExecutionContext.method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2359 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	int anInt2090;
	int id;

	Class198(int i, int i_0_) {
		anInt2090 = i * -2065857869;
		id = i_0_ * 281529283;
	}

	@Override
	public int getId() {
		return -1750270741 * id;
	}

}