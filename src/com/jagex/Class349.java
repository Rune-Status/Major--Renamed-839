package com.jagex;

public class Class349 {
	static Class349 aClass349_3690 = new Class349();
	static Class349 aClass349_3691 = new Class349();
	static Class349 aClass349_3692 = new Class349();

	static void method5956(Buffer buffer) {
		for (int i_3_ = 0; i_3_ < 704263327 * Class572.anInt7657; i_3_++) {
			int i_4_ = buffer.readUSmart();
			int i_5_ = buffer.readUShort();
			if (i_5_ == 65535) {
				i_5_ = -1;
			}
			if (null != Class289_Sub1.aClass562_Sub1Array9823[i_4_]) {
				Class289_Sub1.aClass562_Sub1Array9823[i_4_].anInt7553 = i_5_ * -1065053833;
			}
		}
	}

	static void method5957(Widget class226, ClippingMask class129, int i, int i_6_, int i_7_, int i_8_,
			Sprite class116, double d, Class203 class203, Class220 class220) {
		if (null != class116) {
			int i_10_;
			if (Connection.anInt7170 * 1212513917 == 3) {
				i_10_ = (int) (Class369.aClass261_Sub1_4079.method4843() * 2607.5945876176133) + Client.anInt10699
						* 1093165775 & 0x3fff;
			} else if (Connection.anInt7170 * 1212513917 == 6) {
				i_10_ = (int) Client.aFloat10787 & 0x3fff;
			} else {
				i_10_ = Client.anInt10699 * 1093165775 + (int) Client.aFloat10787 & 0x3fff;
			}
			int i_11_ = Math.max(class226.width * 688089097 / 2, 1362321717 * class226.height / 2) + 10;
			int i_12_ = i_8_ * i_8_ + i_7_ * i_7_;
			if (i_12_ <= i_11_ * i_11_) {
				int i_13_ = Class373.SINE[i_10_];
				int i_14_ = Class373.COSINE[i_10_];
				if (6 != Connection.anInt7170 * 1212513917) {
					i_13_ = 256 * i_13_ / (Client.anInt10701 * -1894746741 + 256);
					i_14_ = i_14_ * 256 / (256 + -1894746741 * Client.anInt10701);
				}
				int i_15_ = i_14_ * i_7_ + i_13_ * i_8_ >> 14;
				int i_16_ = i_8_ * i_14_ - i_13_ * i_7_ >> 14;
				double d_17_ = d / 100.0;
				switch (class203.anInt2125 * 347466895) {
					case 0:
						i = i_15_ + i + 688089097 * class226.width / 2 - (int) (class116.scaleWidth() * d_17_);
						break;
					case 2:
						i = i_15_ + i + class226.width * 688089097 / 2;
						break;
					case 1:
						i = i + class226.width * 688089097 / 2 + i_15_ - (int) (class116.scaleWidth() / 2 * d_17_);
						break;
				}
				switch (class220.anInt2275 * -340911157) {
					case 0:
						i_6_ = 1362321717 * class226.height / 2 + i_6_ - i_16_
								- (int) (class116.scaleHeight() / 2 * d_17_);
						break;
					case 1:
						i_6_ = i_6_ + class226.height * 1362321717 / 2 - i_16_;
						break;
					case 2:
						i_6_ = class226.height * 1362321717 / 2 + i_6_ - i_16_ - (int) (class116.scaleHeight() * d_17_);
						break;
				}
				if (class129 != null) {
					if (d_17_ == 1.0) {
						class116.method2081(i, i_6_, class129, i, i_6_);
					} else {
						class116.method2145(i, i_6_, (int) (class116.scaleWidth() * d_17_),
								(int) (class116.scaleHeight() * d_17_));
					}
				} else {
					if (1.0 == d_17_) {
						class116.method2079(i, i_6_);
					}
					class116.method2145(i, i_6_, (int) (class116.scaleWidth() * d_17_),
							(int) (class116.scaleHeight() * d_17_));
				}
			}
		}
	}

	static final void method5958(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class613.aClass288_7941.banCount
				* -1617114583;
	}

	Class349() {

	}

	public int method5948(int i, int i_0_) {
		int i_2_ = 1319181337 * Engine.screenWidth > i_0_ ? 1319181337 * Engine.screenWidth : i_0_;
		if (aClass349_3690 == this) {
			return 0;
		} else if (this == aClass349_3692) {
			return i_2_ - i;
		} else if (this == aClass349_3691) {
			return (i_2_ - i) / 2;
		}

		return 0;
	}

	public static Class349[] values() {
		return new Class349[] { aClass349_3690, aClass349_3691, aClass349_3692 };
	}

}