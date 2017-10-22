package com.jagex;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;

public class Class351 implements Identifiable {
	static Class351 aClass351_3695;
	static Class351 aClass351_3698;
	static Class351 aClass351_3699;
	static Class351 aClass351_3700;
	static Class351 aClass351_3701;
	static Class351 aClass351_3702;
	static Class351 aClass351_3703;
	static Class351 aClass351_3704;
	static Class351 aClass351_3705 = new Class351(0, -1, false, true);
	static Sprite[] mapflags;
	static {
		aClass351_3695 = new Class351(1, 0, true, true);
		aClass351_3700 = new Class351(2, 1, true, false);
		aClass351_3704 = new Class351(3, 8, true, true);
		aClass351_3699 = new Class351(4, 9, false, true);
		aClass351_3698 = new Class351(5, 10, true, true);
		aClass351_3701 = new Class351(6, 11, false, true);
		aClass351_3702 = new Class351(7, 12, false, true);
		aClass351_3703 = new Class351(8, 13, false, true);
	}

	public static Class351[] values() {
		return new Class351[] { aClass351_3695, aClass351_3705, aClass351_3700, aClass351_3702, aClass351_3703,
				aClass351_3704, aClass351_3699, aClass351_3701, aClass351_3698 };
	}

	public static void method5970() {
		if (Client.fullScreenFrame == null) {
			int i_8_ = 1489471141 * Engine.anInt6498;
			int i_9_ = -1495234169 * Engine.anInt6499;
			int i_10_ = Engine.anInt6494 * -562696973 - Engine.screenWidth * 1319181337 - i_8_;
			int i_11_ = -1308048867 * Class166_Sub15.anInt9602 - Engine.screenHeight * -551672947 - i_9_;
			if (i_8_ > 0 || i_10_ > 0 || i_9_ > 0 || i_11_ > 0) {
				try {
					Container container = Client.getActiveContainer();
					int i_12_ = 0;
					int i_13_ = 0;
					if (container == Engine.frame) {
						Insets insets = Engine.frame.getInsets();
						i_12_ = insets.left;
						i_13_ = insets.top;
					}
					Graphics graphics = container.getGraphics();
					graphics.setColor(Color.black);
					if (i_8_ > 0) {
						graphics.fillRect(i_12_, i_13_, i_8_, -1308048867 * Class166_Sub15.anInt9602);
					}
					if (i_9_ > 0) {
						graphics.fillRect(i_12_, i_13_, Engine.anInt6494 * -562696973, i_9_);
					}
					if (i_10_ > 0) {
						graphics.fillRect(i_12_ + Engine.anInt6494 * -562696973 - i_10_, i_13_, i_10_, -1308048867
								* Class166_Sub15.anInt9602);
					}
					if (i_11_ > 0) {
						graphics.fillRect(i_12_, i_13_ + -1308048867 * Class166_Sub15.anInt9602 - i_11_, -562696973
								* Engine.anInt6494, i_11_);
					}
				} catch (Exception exception) {

				}
			}
		}
	}

	static final void method5967(ScriptExecutionContext class613, int i) {
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = ItemDefinition.aClass192_8339
				.method3811();
	}

	static final void method5968(long l) {
		int i = 1327138123 * Client.anInt10706;
		int i_3_ = -2128941351 * Client.anInt10707;
		if (i != -55942707 * Class215.anInt2196) {
			int i_4_ = i - Class215.anInt2196 * -55942707;
			int i_5_ = (int) (i_4_ * l / 320L);
			if (i_4_ > 0) {
				if (0 == i_5_) {
					i_5_ = 1;
				} else if (i_5_ > i_4_) {
					i_5_ = i_4_;
				}
			} else if (0 == i_5_) {
				i_5_ = -1;
			} else if (i_5_ < i_4_) {
				i_5_ = i_4_;
			}
			Class215.anInt2196 += i_5_ * -2001636603;
		}
		if (i_3_ != -457862351 * Class115.anInt1444) {
			int i_6_ = i_3_ - -457862351 * Class115.anInt1444;
			int i_7_ = (int) (l * i_6_ / 320L);
			if (i_6_ > 0) {
				if (0 == i_7_) {
					i_7_ = 1;
				} else if (i_7_ > i_6_) {
					i_7_ = i_6_;
				}
			} else if (0 == i_7_) {
				i_7_ = -1;
			} else if (i_7_ < i_6_) {
				i_7_ = i_6_;
			}
			Class115.anInt1444 += i_7_ * 1452860881;
		}
		Client.aFloat10787 += 8.0F * (Client.aFloat10710 * l / 40.0F);
		Client.aFloat10708 += l * Client.aFloat10711 / 40.0F * 8.0F;
		MovementType.method10452();
	}

	static final void method5969(Widget class226, Interface class221, ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (ScriptExecutionContext.method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2522 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	int id;
	public int crown;
	public boolean aBool3706;
	public boolean aBool3707;

	Class351(int i, int i_0_, boolean bool_1_, boolean bool_2_) {
		id = -2117400295 * i;
		crown = i_0_ * 935562711;
		aBool3706 = bool_1_;
		aBool3707 = bool_2_;
	}

	@Override
	public int getId() {
		return -584432855 * id;
	}

}