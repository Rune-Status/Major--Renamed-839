package com.jagex;

import java.util.Random;

public class Class35 {
	static final int anInt456 = 0;

	int anInt455;
	Class59[] aClass59Array457;
	Archive tips;

	public Class35(GameContext context, Language language, Archive tips) {
		this.tips = tips;

		Buffer buffer = new Buffer(tips.get(0, 0));
		int i = buffer.payload == null || buffer.payload.length < 1 ? -1 : buffer.readUByte();
		if (i < 4) {
			aClass59Array457 = new Class59[0];
			anInt455 = 532753965;
		} else {
			int i_0_ = buffer.readUByte();
			Class360[] class360s = Class360.values();
			boolean bool = true;

			if (class360s.length != i_0_) {
				bool = false;
			} else {
				for (Class360 class360 : class360s) {
					int i_2_ = buffer.readUByte();
					if (1218979017 * class360.anInt3885 != i_2_) {
						bool = false;
						break;
					}
				}
			}

			if (bool) {
				int i_3_ = buffer.readUByte();
				int i_4_ = buffer.readUByte();
				int i_5_;
				int i_6_;
				if (i > 2) {
					anInt455 = buffer.readShort() * -532753965;
					i_5_ = buffer.readUTriByte();
					i_6_ = buffer.readUShort();
				} else {
					anInt455 = 532753965;
					i_5_ = 0;
					i_6_ = 0;
				}
				aClass59Array457 = new Class59[1 + i_4_];
				for (int i_7_ = 0; i_7_ < i_3_; i_7_++) {
					int i_8_ = buffer.readUByte();
					boolean bool_9_ = buffer.readUByte() == 1;
					int i_10_ = buffer.readUShort();
					Class23[] class23s;
					if (-1 == anInt455 * 905621083) {
						class23s = new Class23[i_10_];
						for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
							int i_12_ = buffer.readUShort();
							int i_13_ = buffer.readUTriByte();
							int i_14_ = buffer.readUShort();
							class23s[i_11_] = new Class23(i_12_, i_13_, i_14_);
						}
						aClass59Array457[i_8_] = new Class59(bool_9_, class23s);
					} else {
						class23s = new Class23[i_10_ + 1];
						class23s[0] = new Class23(anInt455 * 905621083, i_5_, i_6_);
						for (int i_15_ = 0; i_15_ < i_10_; i_15_++) {
							int i_16_ = buffer.readUShort();
							int i_17_ = buffer.readUTriByte();
							int i_18_ = buffer.readUShort();
							class23s[1 + i_15_] = new Class23(i_16_, i_17_, i_18_);
						}
					}
					aClass59Array457[i_8_] = new Class59(bool_9_, class23s);
				}
				for (int i_19_ = 0; i_19_ < i_4_ + 1; i_19_++) {
					if (null == aClass59Array457[i_19_]) {
						aClass59Array457[i_19_] = method984(i_5_, i_6_);
					}
				}
			} else {
				aClass59Array457 = new Class59[0];
				anInt455 = 532753965;
			}
		}
	}

	public Class42 method981(int i) {
		byte[] is = tips.get(i, 0);
		Class42 class42 = new Class42();
		class42.method1039(new Buffer(is));
		return class42;
	}

	public Class23[] method982(int i) {
		if (i < 0 || i >= aClass59Array457.length) {
			return method984(0, 0).aClass23Array671;
		}
		Class59 class59 = aClass59Array457[i];
		if (!class59.aBool672 || class59.aClass23Array671.length <= 1) {
			return class59.aClass23Array671;
		}
		int i_22_ = 905621083 * anInt455 == -1 ? 0 : 1;
		Random random = new Random();
		Class23[] class23s = new Class23[class59.aClass23Array671.length];
		System.arraycopy(class59.aClass23Array671, 0, class23s, 0, class23s.length);
		for (int i_23_ = i_22_; i_23_ < class23s.length; i_23_++) {
			int i_24_ = Class36.method991(random, class23s.length - i_22_) + i_22_;
			Class23 class23 = class59.aClass23Array671[i_23_];
			class23s[i_23_] = class23s[i_24_];
			class23s[i_24_] = class23;
		}
		return class23s;
	}

	public boolean method983() {
		return -1 != 905621083 * anInt455;
	}

	Class59 method984(int i, int i_25_) {
		if (-1 == 905621083 * anInt455) {
			return new Class59(false, new Class23[0]);
		}

		Class23 class23 = new Class23(anInt455 * 905621083, i, i_25_);
		return new Class59(false, new Class23[] { class23 });
	}

}