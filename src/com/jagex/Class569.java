package com.jagex;

public class Class569 {
	float[] aFloatArray7614 = { 0.0F, 0.0F, 0.0F };
	float aFloat7615;
	float aFloat7616;
	int anInt7617;
	Class397 aClass397_7618;
	int anInt7619;
	int anInt7620;
	CubeMapTextureProvider aClass138_7621;
	float aFloat7622;
	float aFloat7623;
	float aFloat7624;
	Class487 aClass487_7625;
	float aFloat7626 = 1.0F;
	float aFloat7627;
	float aFloat7628 = 1.0F;
	int[] anIntArray7629 = { -1, -1, -1 };
	float aFloat7630 = 1.0F;
	float aFloat7631;
	float aFloat7632;

	public Class569() {
		method9603();
	}

	public Class569(Buffer buffer, Class575 class575) {
		method9592(buffer, class575);
	}

	public void method9592(Buffer buffer, Class575 class575) {
		int attributes = buffer.readUByte();
		if (Class199.preferences.lighting.getValue() == 1 && Class60.activeToolkit.method2480() > 0) {
			if ((attributes & Class589.aClass589_7787.anInt7795 * -126543503) != 0) {
				anInt7617 = buffer.readInt() * 434884129;
			} else {
				anInt7617 = 118763999;
			}

			if (0 != (attributes & -126543503 * Class589.aClass589_7781.anInt7795)) {
				aFloat7615 = buffer.readUShort() / 256.0F;
			} else {
				aFloat7615 = 1.1523438F;
			}

			if (0 != (attributes & Class589.aClass589_7782.anInt7795 * -126543503)) {
				aFloat7616 = buffer.readUShort() / 256.0F;
			} else {
				aFloat7616 = 0.69921875F;
			}

			if (0 != (attributes & Class589.aClass589_7783.anInt7795 * -126543503)) {
				aFloat7632 = buffer.readUShort() / 256.0F;
			} else {
				aFloat7632 = 1.2F;
			}
		} else {
			if (0 != (attributes & -126543503 * Class589.aClass589_7787.anInt7795)) {
				buffer.readInt();
			}

			if ((attributes & -126543503 * Class589.aClass589_7781.anInt7795) != 0) {
				buffer.readUShort();
			}

			if ((attributes & -126543503 * Class589.aClass589_7782.anInt7795) != 0) {
				buffer.readUShort();
			}

			if ((attributes & Class589.aClass589_7783.anInt7795 * -126543503) != 0) {
				buffer.readUShort();
			}

			anInt7617 = 118763999;
			aFloat7632 = 1.2F;
			aFloat7616 = 0.69921875F;
			aFloat7615 = 1.1523438F;
		}

		if ((attributes & Class589.aClass589_7784.anInt7795 * -126543503) != 0) {
			aClass397_7618 = Class397.create(buffer.readShort(), buffer.readShort(), buffer.readShort());
		} else {
			aClass397_7618 = Class397.create(-50.0F, -60.0F, -50.0F);
		}

		if (0 != (attributes & -126543503 * Class589.aClass589_7785.anInt7795)) {
			anInt7619 = buffer.readInt() * -716043805;
		} else {
			anInt7619 = 1050197240;
		}

		if ((attributes & Class589.aClass589_7786.anInt7795 * -126543503) != 0) {
			anInt7620 = buffer.readUShort() * 2119251793;
		} else {
			anInt7620 = 0;
		}

		if ((attributes & -126543503 * Class589.aClass589_7794.anInt7795) != 0) {
			int i_25_ = buffer.readUShort();
			aClass138_7621 = class575.method9701(i_25_);
		} else {
			aClass138_7621 = Class575.aClass138_7681;
		}
	}

	public void method9594(Buffer buffer) {
		method9595(buffer, 0);
	}

	public void method9596(Buffer buffer, Class575 class575) {
		int skybox = buffer.readUShort();
		int i_28_ = buffer.readShort();
		int i_29_ = buffer.readShort();
		int i_30_ = buffer.readShort();
		int i_31_ = buffer.readUShort();
		Class611.anInt7915 = -2067120069 * i_31_;
		aClass487_7625 = class575.method9702(skybox, i_28_, i_29_, i_30_);
	}

	public int method9600() {
		return anInt7619 * 1359053771;
	}

	public void method9612(Buffer buffer) {
		aFloat7631 = buffer.readFloat();
		aFloat7623 = buffer.readFloat();
		aFloat7627 = buffer.readFloat();
	}

	public Class487 method9621() {
		return aClass487_7625;
	}

	void copyFrom(Class569 other) {
		anInt7617 = other.anInt7617;
		aFloat7615 = other.aFloat7615;
		aFloat7616 = other.aFloat7616;
		aFloat7632 = other.aFloat7632;
		aClass397_7618.copyFrom(other.aClass397_7618);
		anInt7619 = other.anInt7619;
		anInt7620 = other.anInt7620;
		aClass138_7621 = other.aClass138_7621;
		aFloat7631 = other.aFloat7631;
		aFloat7623 = other.aFloat7623;
		aFloat7627 = other.aFloat7627;
		aClass487_7625 = other.aClass487_7625;
		aFloat7626 = other.aFloat7626;
		aFloat7622 = other.aFloat7622;
		aFloat7628 = other.aFloat7628;
		aFloat7624 = other.aFloat7624;
		aFloat7630 = other.aFloat7630;
		anIntArray7629[0] = other.anIntArray7629[0];
		anIntArray7629[1] = other.anIntArray7629[1];
		anIntArray7629[2] = other.anIntArray7629[2];
		aFloatArray7614[0] = other.aFloatArray7614[0];
		aFloatArray7614[1] = other.aFloatArray7614[1];
		aFloatArray7614[2] = other.aFloatArray7614[2];
	}

	void method9591(Toolkit toolkit, Class569 class569_1_, Class569 class569_2_, float f) {
		anInt7617 = Class360.blendColours(class569_1_.anInt7617 * -1514981919, -1514981919 * class569_2_.anInt7617,
				255.0F * f) * 434884129;
		aFloat7616 = f * (class569_2_.aFloat7616 - class569_1_.aFloat7616) + class569_1_.aFloat7616;
		aFloat7632 = class569_1_.aFloat7632 + f * (class569_2_.aFloat7632 - class569_1_.aFloat7632);
		aFloat7615 = class569_1_.aFloat7615 + (class569_2_.aFloat7615 - class569_1_.aFloat7615) * f;
		aFloat7627 = class569_1_.aFloat7627 + (class569_2_.aFloat7627 - class569_1_.aFloat7627) * f;
		aFloat7631 = f * (class569_2_.aFloat7631 - class569_1_.aFloat7631) + class569_1_.aFloat7631;
		aFloat7623 = (class569_2_.aFloat7623 - class569_1_.aFloat7623) * f + class569_1_.aFloat7623;
		anInt7619 = Class360.blendColours(1359053771 * class569_1_.anInt7619, class569_2_.anInt7619 * 1359053771,
				f * 255.0F) * -716043805;
		anInt7620 = (int) (class569_1_.anInt7620 * -1441893967 + f
				* (-1441893967 * class569_2_.anInt7620 - -1441893967 * class569_1_.anInt7620)) * 2119251793;
		if (class569_1_.aClass138_7621 != class569_2_.aClass138_7621) {
			aClass138_7621 = toolkit.method2484(class569_1_.aClass138_7621, class569_2_.aClass138_7621, f,
					aClass138_7621);
		}
		if (class569_2_.aClass487_7625 != class569_1_.aClass487_7625) {
			if (null == class569_1_.aClass487_7625) {
				aClass487_7625 = class569_2_.aClass487_7625;
				if (aClass487_7625 != null) {
					aClass487_7625.method8251((int) (f * 255.0F), 0);
				}
			} else {
				aClass487_7625 = class569_1_.aClass487_7625;
				if (aClass487_7625 != null) {
					aClass487_7625.method8251((int) (255.0F * f), 255);
				}
			}
		}
		aFloat7626 = f * (class569_2_.aFloat7626 - class569_1_.aFloat7626) + class569_1_.aFloat7626;
		aFloat7622 = class569_1_.aFloat7622 + f * (class569_2_.aFloat7622 - class569_1_.aFloat7622);
		aFloat7628 = class569_1_.aFloat7628 + (class569_2_.aFloat7628 - class569_1_.aFloat7628) * f;
		aFloat7624 = f * (class569_2_.aFloat7624 - class569_1_.aFloat7624) + class569_1_.aFloat7624;
		aFloat7630 = f * (class569_2_.aFloat7630 - class569_1_.aFloat7630) + class569_1_.aFloat7630;
		float f_3_ = class569_1_.aFloatArray7614[2] + (class569_1_.aFloatArray7614[0] + class569_1_.aFloatArray7614[1]);
		float f_4_ = class569_2_.aFloatArray7614[2] + (class569_2_.aFloatArray7614[0] + class569_2_.aFloatArray7614[1]);
		float f_5_ = f_3_ + f * (f_4_ - f_3_);
		if (0.0F == f_5_) {
			int[] is = anIntArray7629;
			int[] is_6_ = anIntArray7629;
			anIntArray7629[2] = -1;
			is_6_[1] = -1;
			is[0] = -1;
			float[] fs = aFloatArray7614;
			float[] fs_7_ = aFloatArray7614;
			aFloatArray7614[2] = 0.0F;
			fs_7_[1] = 0.0F;
			fs[0] = 0.0F;
		} else if (class569_1_.anIntArray7629[0] == -1 && class569_1_.anIntArray7629[1] == -1
				&& class569_1_.anIntArray7629[2] == -1) {
			for (int i_8_ = 0; i_8_ < 3; i_8_++) {
				anIntArray7629[i_8_] = class569_2_.anIntArray7629[i_8_];
				if (-1 == anIntArray7629[i_8_]) {
					aFloatArray7614[i_8_] = 0.0F;
				} else {
					aFloatArray7614[i_8_] = f * class569_2_.aFloatArray7614[i_8_];
				}
			}
		} else if (-1 == class569_2_.anIntArray7629[0] && class569_2_.anIntArray7629[1] == -1
				&& -1 == class569_2_.anIntArray7629[2]) {
			for (int i_9_ = 0; i_9_ < 3; i_9_++) {
				anIntArray7629[i_9_] = class569_1_.anIntArray7629[i_9_];
				if (-1 == anIntArray7629[i_9_]) {
					aFloatArray7614[i_9_] = 0.0F;
				} else {
					aFloatArray7614[i_9_] = (1.0F - f) * class569_1_.aFloatArray7614[i_9_];
				}
			}
		} else {
			float f_10_ = 1.0F - f;
			int i_11_ = 0;
			int[] is = { -1, -1, -1, -1, -1, -1 };
			float[] fs = { 0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.0F };
			for (int i_12_ = 0; i_12_ < 3; i_12_++) {
				if (class569_1_.anIntArray7629[i_12_] > -1) {
					is[i_11_] = class569_1_.anIntArray7629[i_12_];
					fs[i_11_++] = class569_1_.aFloatArray7614[i_12_] * f_10_;
				}
			}
			int i_13_ = i_11_;
			for (int i_14_ = 0; i_14_ < 3; i_14_++) {
				if (class569_2_.anIntArray7629[i_14_] > -1) {
					float f_15_ = class569_2_.aFloatArray7614[i_14_] * f;
					for (int i_16_ = 0; i_16_ < i_13_; i_16_++) {
						if (is[i_16_] == class569_2_.anIntArray7629[i_14_]) {
							fs[i_16_] += f_15_;
							break;
						}
						if (i_13_ - 1 == i_16_) {
							is[i_11_] = class569_2_.anIntArray7629[i_14_];
							fs[i_11_++] = f_15_;
						}
					}
				}
			}
			if (i_11_ > 3) {
				float f_17_ = 0.0F;
				float f_18_ = 0.0F;
				for (int i_19_ = 0; i_19_ < i_11_; i_19_++) {
					f_17_ += fs[i_19_];
				}
				ArrayUtils.sort(fs, is, 0, i_11_ - 1);
				for (int i_20_ = 0; i_20_ < 3; i_20_++) {
					f_18_ += fs[i_20_];
				}
				float f_21_ = f_17_ / f_18_;
				for (int i_22_ = 0; i_22_ < 3; i_22_++) {
					fs[i_22_] *= f_21_;
				}
			}
			for (int i_23_ = 0; i_23_ < 3; i_23_++) {
				anIntArray7629[i_23_] = is[i_23_];
				aFloatArray7614[i_23_] = fs[i_23_];
			}
		}
	}

	void method9595(Buffer buffer, int i) {
		anIntArray7629[i] = buffer.readUShort();
		aFloatArray7614[i] = buffer.readFloat();
	}

	void method9598(Class575 class575, Class591 class591) {
		if (Class199.preferences.lighting.getValue() == 1 && Class60.activeToolkit.method2480() > 0) {
			if (class591.method9935() != -1) {
				anInt7617 = class591.method9935() * 434884129;
			}

			if (class591.method9936() != -1.0F) {
				aFloat7615 = class591.method9936();
			}

			if (class591.method9954() != -1.0F) {
				aFloat7616 = class591.method9954();
			}

			if (class591.method9975() != -1.0F) {
				aFloat7632 = class591.method9975();
			}
		}

		if (class591.method9945() != null) {
			aClass397_7618.copyFrom(class591.method9945());
		}

		if (class591.method9956() != -1) {
			anInt7619 = class591.method9956() * -716043805;
		}

		if (class591.method9941() != -1) {
			anInt7620 = class591.method9941() * 2119251793;
		}

		if (class591.method9942() != -1.0F) {
			aFloat7623 = class591.method9942();
		}

		if (class591.method9943() != -1.0F) {
			aFloat7627 = class591.method9943();
		}

		if (class591.method9944() != -1.0F) {
			aFloat7631 = class591.method9944();
		}

		if (class591.method9933() != -1) {
			aClass138_7621 = class575.method9701(class591.method9933());
		}

		if (class591.method9970() != -1) {
			int skybox = class591.method9970();
			int i_33_ = class591.method9947();
			int i_34_ = class591.method9940();
			int i_35_ = class591.method9988();
			int i_36_ = class591.method9950();
			Class611.anInt7915 = i_36_ * -2067120069;
			aClass487_7625 = class575.method9702(skybox, i_33_, i_34_, i_35_);
		}

		if (class591.method9951(0) != -1) {
			anIntArray7629[0] = class591.method9951(0);
			aFloatArray7614[0] = class591.method9952(0);
		}

		if (class591.method9951(1) != -1) {
			anIntArray7629[1] = class591.method9951(1);
			aFloatArray7614[1] = class591.method9952(1);
		}

		if (class591.method9951(2) != -1) {
			anIntArray7629[2] = class591.method9951(2);
			aFloatArray7614[2] = class591.method9952(2);
		}
	}

	void method9603() {
		anInt7617 = 118763999;
		aClass397_7618 = Class397.create(-50.0F, -60.0F, -50.0F);
		aFloat7615 = 1.1523438F;
		aFloat7616 = 0.69921875F;
		aFloat7632 = 1.2F;
		anInt7619 = 1050197240;
		anInt7620 = 0;
		aClass138_7621 = Class575.aClass138_7681;
		aFloat7631 = 1.0F;
		aFloat7623 = 0.25F;
		aFloat7627 = 1.0F;
		aClass487_7625 = Class575.aClass487_7680;
		aFloat7626 = 1.0F;
		aFloat7622 = 0.0F;
		aFloat7628 = 1.0F;
		aFloat7624 = 0.0F;
		aFloat7630 = 1.0F;
		int[] is = anIntArray7629;
		int[] is_37_ = anIntArray7629;
		anIntArray7629[2] = -1;
		is_37_[1] = -1;
		is[0] = -1;
		float[] fs = aFloatArray7614;
		float[] fs_38_ = aFloatArray7614;
		aFloatArray7614[2] = 0.0F;
		fs_38_[1] = 0.0F;
		fs[0] = 0.0F;
	}

	boolean equals(Class569 other) {
		return -1514981919 * other.anInt7617 == anInt7617 * -1514981919 && other.aFloat7615 == aFloat7615
				&& other.aFloat7616 == aFloat7616 && other.aFloat7632 == aFloat7632 && aFloat7623 == other.aFloat7623
				&& aFloat7631 == other.aFloat7631 && aFloat7627 == other.aFloat7627
				&& 1359053771 * other.anInt7619 == 1359053771 * anInt7619
				&& -1441893967 * anInt7620 == other.anInt7620 * -1441893967 && other.aClass138_7621 == aClass138_7621
				&& aClass487_7625 == other.aClass487_7625 && aFloat7626 == other.aFloat7626
				&& aFloat7622 == other.aFloat7622 && other.aFloat7628 == aFloat7628 && other.aFloat7624 == aFloat7624
				&& other.aFloat7630 == aFloat7630 && anIntArray7629[0] == other.anIntArray7629[0]
				&& anIntArray7629[1] == other.anIntArray7629[1] && anIntArray7629[2] == other.anIntArray7629[2]
				&& other.aFloatArray7614[0] == aFloatArray7614[0] && aFloatArray7614[1] == other.aFloatArray7614[1]
				&& other.aFloatArray7614[2] == aFloatArray7614[2];
	}

}