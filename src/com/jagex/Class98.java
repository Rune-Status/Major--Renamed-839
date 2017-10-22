package com.jagex;

import jaggl.OpenGL;

public class Class98 {
	static float aFloat1309;
	int[] anIntArray1292 = new int[8191];
	FloatBuffer data = new FloatBuffer(786336);
	ArrayBuffer anInterface11_1294;
	OpenGlArrayBufferPointer aClass94_1295;
	OpenGlArrayBufferPointer aClass94_1296;
	int anInt1297 = LatencyMonitor.method1059(1600);
	int anInt1298 = 64;
	OpenGlArrayBufferPointer aClass94_1299;
	int anInt1300 = 1600;
	float[] aFloatArray1301 = new float[16];
	int anInt1302 = 64;
	PointEntity[][] aClass477_Sub4_Sub1ArrayArray1303 = new PointEntity[64][768];
	int[] anIntArray1304 = new int[1600];
	int[] anIntArray1305 = new int[64];
	int anInt1306 = 768;
	PointEntity[][] aClass477_Sub4_Sub1ArrayArray1307 = new PointEntity[1600][64];
	int anInt1308;

	void method1788(OpenGlToolkit toolkit, Class137 class137) {
		if (toolkit.aClass399_9015 != null) {
			method1791(toolkit);
			float f = toolkit.aClass399_9015.array[2];
			float f_0_ = toolkit.aClass399_9015.array[6];
			float f_1_ = toolkit.aClass399_9015.array[10];
			float f_2_ = toolkit.aClass399_9015.array[14];

			try {
				int i = 0;
				int i_3_ = 2147483647;
				int i_4_ = 0;

				CacheableEntity cacheable = class137.entities.tail;
				for (CacheableEntity next = cacheable.nextCacheable; next != cacheable; next = next.nextCacheable) {
					PointEntity point = (PointEntity) next;
					int i_6_ = (int) (f * (point.x >> 12) + f_0_ * (point.z >> 12) + f_1_ * (point.y >> 12) + f_2_);
					if (i_6_ > i_4_) {
						i_4_ = i_6_;
					}
					if (i_6_ < i_3_) {
						i_3_ = i_6_;
					}

					anIntArray1292[i++] = i_6_;
				}

				int i_7_ = i_4_ - i_3_;
				int i_8_;

				if (i_7_ + 2 > 1600) {
					i_8_ = 1 + LatencyMonitor.method1059(i_7_) - anInt1297;
					i_7_ = (i_7_ >> i_8_) + 2;
				} else {
					i_8_ = 0;
					i_7_ += 2;
				}

				CacheableEntity next = cacheable.nextCacheable;
				i = 0;
				int i_10_ = -2;
				boolean bool = true;
				boolean bool_11_ = true;

				while (next != cacheable) {
					anInt1308 = 0;
					for (int i_12_ = 0; i_12_ < i_7_; i_12_++) {
						anIntArray1304[i_12_] = 0;
					}

					for (int i_13_ = 0; i_13_ < 64; i_13_++) {
						anIntArray1305[i_13_] = 0;
					}

					for (; next != cacheable; next = next.nextCacheable) {
						PointEntity point = (PointEntity) next;
						if (bool_11_) {
							i_10_ = point.texture;
							bool = point.aBool11252;
							bool_11_ = false;
						}
						if (i > 0 && (i_10_ != point.texture || bool != point.aBool11252)) {
							bool_11_ = true;
							break;
						}
						int i_14_ = anIntArray1292[i++] - i_3_ >> i_8_;
						if (i_14_ < 1600) {
							if (anIntArray1304[i_14_] < 64) {
								aClass477_Sub4_Sub1ArrayArray1307[i_14_][anIntArray1304[i_14_]++] = point;
							} else {
								if (anIntArray1304[i_14_] == 64) {
									if (anInt1308 == 64) {
										continue;
									}
									anIntArray1304[i_14_] += 1 + anInt1308++;
								}
								aClass477_Sub4_Sub1ArrayArray1303[anIntArray1304[i_14_] - 64 - 1][anIntArray1305[anIntArray1304[i_14_] - 64 - 1]++] = point;
							}
						}
					}
					if (i_10_ >= 0) {
						toolkit.method14497(i_10_);
					} else {
						toolkit.method14497(-1);
					}
					if (bool && toolkit.ambient != aFloat1309) {
						toolkit.method2476(aFloat1309);
					} else if (toolkit.ambient != 1.0F) {
						toolkit.method2476(1.0F);
					}
					method1790(toolkit, i_7_);
				}
			} catch (Exception exception) {

			}
			method1792(toolkit);
		}
	}

	void method1790(OpenGlToolkit class134_sub2, int i) {
		OpenGL.glGetFloatv(2982, aFloatArray1301, 0);
		float f = aFloatArray1301[0];
		float f_15_ = aFloatArray1301[4];
		float f_16_ = aFloatArray1301[8];
		float f_17_ = aFloatArray1301[1];
		float f_18_ = aFloatArray1301[5];
		float f_19_ = aFloatArray1301[9];
		float f_20_ = f + f_17_;
		float f_21_ = f_15_ + f_18_;
		float f_22_ = f_16_ + f_19_;
		float f_23_ = f - f_17_;
		float f_24_ = f_15_ - f_18_;
		float f_25_ = f_16_ - f_19_;
		float f_26_ = f_17_ - f;
		float f_27_ = f_18_ - f_15_;
		float f_28_ = f_19_ - f_16_;
		float[] fs = new float[3];
		float[] fs_29_ = new float[3];
		class134_sub2.aClass399_9050.method6545(class134_sub2.aClass399_9092);
		data.offset = 0;
		if (class134_sub2.bigEndian) {
			for (int i_30_ = i - 1; i_30_ >= 0; i_30_--) {
				int i_31_ = anIntArray1304[i_30_] > 64 ? 64 : anIntArray1304[i_30_];
				if (i_31_ > 0) {
					for (int i_32_ = i_31_ - 1; i_32_ >= 0; i_32_--) {
						PointEntity class477_sub4_sub1 = aClass477_Sub4_Sub1ArrayArray1307[i_30_][i_32_];
						int i_33_ = class477_sub4_sub1.colour;
						byte i_34_ = (byte) (i_33_ >> 16);
						byte i_35_ = (byte) (i_33_ >> 8);
						byte i_36_ = (byte) i_33_;
						byte i_37_ = (byte) (i_33_ >>> 24);
						float f_38_ = class477_sub4_sub1.x >> 12;
						float f_39_ = class477_sub4_sub1.z >> 12;
						float f_40_ = class477_sub4_sub1.y >> 12;
						int i_41_ = class477_sub4_sub1.size >> 12;
						if (class477_sub4_sub1.rotation != 0) {
							class134_sub2.aClass399_9051.method6577(class477_sub4_sub1.rotation, i_41_, i_41_, 0.0F,
									0.0F, 0.0F);
							class134_sub2.aClass399_9051.method6547(class134_sub2.aClass399_9050);
							class134_sub2.aClass399_9051.method6553(1.0F, 0.0F, 0.0F, fs);
							class134_sub2.aClass399_9051.method6553(0.0F, 1.0F, 0.0F, fs_29_);
							data.writeFloat(0.0F);
							data.writeFloat(0.0F);
							data.writeFloat(f_38_ - fs[0] - fs_29_[0]);
							data.writeFloat(f_39_ - fs[1] - fs_29_[1]);
							data.writeFloat(f_40_ - fs[2] - fs_29_[2]);
							data.writeByte(i_34_);
							data.writeByte(i_35_);
							data.writeByte(i_36_);
							data.writeByte(i_37_);
							data.writeFloat(0.0F);
							data.writeFloat(1.0F);
							data.writeFloat(f_38_ - fs[0] + fs_29_[0]);
							data.writeFloat(f_39_ - fs[1] + fs_29_[1]);
							data.writeFloat(f_40_ - fs[2] + fs_29_[2]);
							data.writeByte(i_34_);
							data.writeByte(i_35_);
							data.writeByte(i_36_);
							data.writeByte(i_37_);
							data.writeFloat(1.0F);
							data.writeFloat(1.0F);
							data.writeFloat(f_38_ + fs[0] + fs_29_[0]);
							data.writeFloat(f_39_ + fs[1] + fs_29_[1]);
							data.writeFloat(f_40_ + fs[2] + fs_29_[2]);
							data.writeByte(i_34_);
							data.writeByte(i_35_);
							data.writeByte(i_36_);
							data.writeByte(i_37_);
							data.writeFloat(1.0F);
							data.writeFloat(0.0F);
							data.writeFloat(f_38_ + fs[0] - fs_29_[0]);
							data.writeFloat(f_39_ + fs[1] - fs_29_[1]);
							data.writeFloat(f_40_ + fs[2] - fs_29_[2]);
							data.writeByte(i_34_);
							data.writeByte(i_35_);
							data.writeByte(i_36_);
							data.writeByte(i_37_);
						} else {
							data.writeFloat(0.0F);
							data.writeFloat(0.0F);
							data.writeFloat(f_38_ + f_20_ * -i_41_);
							data.writeFloat(f_39_ + f_21_ * -i_41_);
							data.writeFloat(f_40_ + f_22_ * -i_41_);
							data.writeByte(i_34_);
							data.writeByte(i_35_);
							data.writeByte(i_36_);
							data.writeByte(i_37_);
							data.writeFloat(0.0F);
							data.writeFloat(1.0F);
							data.writeFloat(f_38_ + f_26_ * i_41_);
							data.writeFloat(f_39_ + f_27_ * i_41_);
							data.writeFloat(f_40_ + f_28_ * i_41_);
							data.writeByte(i_34_);
							data.writeByte(i_35_);
							data.writeByte(i_36_);
							data.writeByte(i_37_);
							data.writeFloat(1.0F);
							data.writeFloat(1.0F);
							data.writeFloat(f_38_ + f_20_ * i_41_);
							data.writeFloat(f_39_ + f_21_ * i_41_);
							data.writeFloat(f_40_ + f_22_ * i_41_);
							data.writeByte(i_34_);
							data.writeByte(i_35_);
							data.writeByte(i_36_);
							data.writeByte(i_37_);
							data.writeFloat(1.0F);
							data.writeFloat(0.0F);
							data.writeFloat(f_38_ + f_23_ * i_41_);
							data.writeFloat(f_39_ + f_24_ * i_41_);
							data.writeFloat(f_40_ + f_25_ * i_41_);
							data.writeByte(i_34_);
							data.writeByte(i_35_);
							data.writeByte(i_36_);
							data.writeByte(i_37_);
						}
					}
					if (anIntArray1304[i_30_] > 64) {
						int i_42_ = anIntArray1304[i_30_] - 64 - 1;
						for (int i_43_ = anIntArray1305[i_42_] - 1; i_43_ >= 0; i_43_--) {
							PointEntity class477_sub4_sub1 = aClass477_Sub4_Sub1ArrayArray1303[i_42_][i_43_];
							int i_44_ = class477_sub4_sub1.colour;
							byte i_45_ = (byte) (i_44_ >> 16);
							byte i_46_ = (byte) (i_44_ >> 8);
							byte i_47_ = (byte) i_44_;
							byte i_48_ = (byte) (i_44_ >>> 24);
							float f_49_ = class477_sub4_sub1.x >> 12;
							float f_50_ = class477_sub4_sub1.z >> 12;
							float f_51_ = class477_sub4_sub1.y >> 12;
							int i_52_ = class477_sub4_sub1.size >> 12;
							if (class477_sub4_sub1.rotation != 0) {
								class134_sub2.aClass399_9051.method6577(class477_sub4_sub1.rotation, i_52_, i_52_,
										0.0F, 0.0F, 0.0F);
								class134_sub2.aClass399_9051.method6547(class134_sub2.aClass399_9050);
								class134_sub2.aClass399_9051.method6553(1.0F, 0.0F, 0.0F, fs);
								class134_sub2.aClass399_9051.method6553(0.0F, 1.0F, 0.0F, fs_29_);
								data.writeFloat(0.0F);
								data.writeFloat(0.0F);
								data.writeFloat(f_49_ - fs[0] - fs_29_[0]);
								data.writeFloat(f_50_ - fs[1] - fs_29_[1]);
								data.writeFloat(f_51_ - fs[2] - fs_29_[2]);
								data.writeByte(i_45_);
								data.writeByte(i_46_);
								data.writeByte(i_47_);
								data.writeByte(i_48_);
								data.writeFloat(0.0F);
								data.writeFloat(1.0F);
								data.writeFloat(f_49_ - fs[0] + fs_29_[0]);
								data.writeFloat(f_50_ - fs[1] + fs_29_[1]);
								data.writeFloat(f_51_ - fs[2] + fs_29_[2]);
								data.writeByte(i_45_);
								data.writeByte(i_46_);
								data.writeByte(i_47_);
								data.writeByte(i_48_);
								data.writeFloat(1.0F);
								data.writeFloat(1.0F);
								data.writeFloat(f_49_ + fs[0] + fs_29_[0]);
								data.writeFloat(f_50_ + fs[1] + fs_29_[1]);
								data.writeFloat(f_51_ + fs[2] + fs_29_[2]);
								data.writeByte(i_45_);
								data.writeByte(i_46_);
								data.writeByte(i_47_);
								data.writeByte(i_48_);
								data.writeFloat(1.0F);
								data.writeFloat(0.0F);
								data.writeFloat(f_49_ + fs[0] - fs_29_[0]);
								data.writeFloat(f_50_ + fs[1] - fs_29_[1]);
								data.writeFloat(f_51_ + fs[2] - fs_29_[2]);
								data.writeByte(i_45_);
								data.writeByte(i_46_);
								data.writeByte(i_47_);
								data.writeByte(i_48_);
							} else {
								data.writeFloat(0.0F);
								data.writeFloat(0.0F);
								data.writeFloat(f_49_ + f_20_ * -i_52_);
								data.writeFloat(f_50_ + f_21_ * -i_52_);
								data.writeFloat(f_51_ + f_22_ * -i_52_);
								data.writeByte(i_45_);
								data.writeByte(i_46_);
								data.writeByte(i_47_);
								data.writeByte(i_48_);
								data.writeFloat(0.0F);
								data.writeFloat(1.0F);
								data.writeFloat(f_49_ + f_26_ * i_52_);
								data.writeFloat(f_50_ + f_27_ * i_52_);
								data.writeFloat(f_51_ + f_28_ * i_52_);
								data.writeByte(i_45_);
								data.writeByte(i_46_);
								data.writeByte(i_47_);
								data.writeByte(i_48_);
								data.writeFloat(1.0F);
								data.writeFloat(1.0F);
								data.writeFloat(f_49_ + f_20_ * i_52_);
								data.writeFloat(f_50_ + f_21_ * i_52_);
								data.writeFloat(f_51_ + f_22_ * i_52_);
								data.writeByte(i_45_);
								data.writeByte(i_46_);
								data.writeByte(i_47_);
								data.writeByte(i_48_);
								data.writeFloat(1.0F);
								data.writeFloat(0.0F);
								data.writeFloat(f_49_ + f_23_ * i_52_);
								data.writeFloat(f_50_ + f_24_ * i_52_);
								data.writeFloat(f_51_ + f_25_ * i_52_);
								data.writeByte(i_45_);
								data.writeByte(i_46_);
								data.writeByte(i_47_);
								data.writeByte(i_48_);
							}
						}
					}
				}
			}
		} else {
			for (int i_53_ = i - 1; i_53_ >= 0; i_53_--) {
				int i_54_ = anIntArray1304[i_53_] > 64 ? 64 : anIntArray1304[i_53_];
				if (i_54_ > 0) {
					for (int i_55_ = i_54_ - 1; i_55_ >= 0; i_55_--) {
						PointEntity class477_sub4_sub1 = aClass477_Sub4_Sub1ArrayArray1307[i_53_][i_55_];
						int i_56_ = class477_sub4_sub1.colour;
						byte i_57_ = (byte) (i_56_ >> 16);
						byte i_58_ = (byte) (i_56_ >> 8);
						byte i_59_ = (byte) i_56_;
						byte i_60_ = (byte) (i_56_ >>> 24);
						float f_61_ = class477_sub4_sub1.x >> 12;
						float f_62_ = class477_sub4_sub1.z >> 12;
						float f_63_ = class477_sub4_sub1.y >> 12;
						int i_64_ = class477_sub4_sub1.size >> 12;
						if (class477_sub4_sub1.rotation != 0) {
							class134_sub2.aClass399_9051.method6577(class477_sub4_sub1.rotation, i_64_, i_64_, 0.0F,
									0.0F, 0.0F);
							class134_sub2.aClass399_9051.method6547(class134_sub2.aClass399_9050);
							class134_sub2.aClass399_9051.method6553(1.0F, 0.0F, 0.0F, fs);
							class134_sub2.aClass399_9051.method6553(0.0F, 1.0F, 0.0F, fs_29_);
							data.writeLEFloat(0.0F);
							data.writeLEFloat(0.0F);
							data.writeLEFloat(f_61_ - fs[0] - fs_29_[0]);
							data.writeLEFloat(f_62_ - fs[1] - fs_29_[1]);
							data.writeLEFloat(f_63_ - fs[2] - fs_29_[2]);
							data.writeByte(i_57_);
							data.writeByte(i_58_);
							data.writeByte(i_59_);
							data.writeByte(i_60_);
							data.writeLEFloat(0.0F);
							data.writeLEFloat(1.0F);
							data.writeLEFloat(f_61_ - fs[0] + fs_29_[0]);
							data.writeLEFloat(f_62_ - fs[1] + fs_29_[1]);
							data.writeLEFloat(f_63_ - fs[2] + fs_29_[2]);
							data.writeByte(i_57_);
							data.writeByte(i_58_);
							data.writeByte(i_59_);
							data.writeByte(i_60_);
							data.writeLEFloat(1.0F);
							data.writeLEFloat(1.0F);
							data.writeLEFloat(f_61_ + fs[0] + fs_29_[0]);
							data.writeLEFloat(f_62_ + fs[1] + fs_29_[1]);
							data.writeLEFloat(f_63_ + fs[2] + fs_29_[2]);
							data.writeByte(i_57_);
							data.writeByte(i_58_);
							data.writeByte(i_59_);
							data.writeByte(i_60_);
							data.writeLEFloat(1.0F);
							data.writeLEFloat(0.0F);
							data.writeLEFloat(f_61_ + fs[0] - fs_29_[0]);
							data.writeLEFloat(f_62_ + fs[1] - fs_29_[1]);
							data.writeLEFloat(f_63_ + fs[2] - fs_29_[2]);
							data.writeByte(i_57_);
							data.writeByte(i_58_);
							data.writeByte(i_59_);
							data.writeByte(i_60_);
						} else {
							data.writeLEFloat(0.0F);
							data.writeLEFloat(0.0F);
							data.writeLEFloat(f_61_ + f_20_ * -i_64_);
							data.writeLEFloat(f_62_ + f_21_ * -i_64_);
							data.writeLEFloat(f_63_ + f_22_ * -i_64_);
							data.writeByte(i_57_);
							data.writeByte(i_58_);
							data.writeByte(i_59_);
							data.writeByte(i_60_);
							data.writeLEFloat(0.0F);
							data.writeLEFloat(1.0F);
							data.writeLEFloat(f_61_ + f_26_ * i_64_);
							data.writeLEFloat(f_62_ + f_27_ * i_64_);
							data.writeLEFloat(f_63_ + f_28_ * i_64_);
							data.writeByte(i_57_);
							data.writeByte(i_58_);
							data.writeByte(i_59_);
							data.writeByte(i_60_);
							data.writeLEFloat(1.0F);
							data.writeLEFloat(1.0F);
							data.writeLEFloat(f_61_ + f_20_ * i_64_);
							data.writeLEFloat(f_62_ + f_21_ * i_64_);
							data.writeLEFloat(f_63_ + f_22_ * i_64_);
							data.writeByte(i_57_);
							data.writeByte(i_58_);
							data.writeByte(i_59_);
							data.writeByte(i_60_);
							data.writeLEFloat(1.0F);
							data.writeLEFloat(0.0F);
							data.writeLEFloat(f_61_ + f_23_ * i_64_);
							data.writeLEFloat(f_62_ + f_24_ * i_64_);
							data.writeLEFloat(f_63_ + f_25_ * i_64_);
							data.writeByte(i_57_);
							data.writeByte(i_58_);
							data.writeByte(i_59_);
							data.writeByte(i_60_);
						}
					}
					if (anIntArray1304[i_53_] > 64) {
						int i_65_ = anIntArray1304[i_53_] - 64 - 1;
						for (int i_66_ = anIntArray1305[i_65_] - 1; i_66_ >= 0; i_66_--) {
							PointEntity class477_sub4_sub1 = aClass477_Sub4_Sub1ArrayArray1303[i_65_][i_66_];
							int i_67_ = class477_sub4_sub1.colour;
							byte i_68_ = (byte) (i_67_ >> 16);
							byte i_69_ = (byte) (i_67_ >> 8);
							byte i_70_ = (byte) i_67_;
							byte i_71_ = (byte) (i_67_ >>> 24);
							float f_72_ = class477_sub4_sub1.x >> 12;
							float f_73_ = class477_sub4_sub1.z >> 12;
							float f_74_ = class477_sub4_sub1.y >> 12;
							int i_75_ = class477_sub4_sub1.size >> 12;
							if (class477_sub4_sub1.rotation != 0) {
								class134_sub2.aClass399_9051.method6577(class477_sub4_sub1.rotation, i_75_, i_75_,
										0.0F, 0.0F, 0.0F);
								class134_sub2.aClass399_9051.method6547(class134_sub2.aClass399_9050);
								class134_sub2.aClass399_9051.method6553(1.0F, 0.0F, 0.0F, fs);
								class134_sub2.aClass399_9051.method6553(0.0F, 1.0F, 0.0F, fs_29_);
								data.writeLEFloat(0.0F);
								data.writeLEFloat(0.0F);
								data.writeLEFloat(f_72_ - fs[0] - fs_29_[0]);
								data.writeLEFloat(f_73_ - fs[1] - fs_29_[1]);
								data.writeLEFloat(f_74_ - fs[2] - fs_29_[2]);
								data.writeByte(i_68_);
								data.writeByte(i_69_);
								data.writeByte(i_70_);
								data.writeByte(i_71_);
								data.writeLEFloat(0.0F);
								data.writeLEFloat(1.0F);
								data.writeLEFloat(f_72_ - fs[0] + fs_29_[0]);
								data.writeLEFloat(f_73_ - fs[1] + fs_29_[1]);
								data.writeLEFloat(f_74_ - fs[2] + fs_29_[2]);
								data.writeByte(i_68_);
								data.writeByte(i_69_);
								data.writeByte(i_70_);
								data.writeByte(i_71_);
								data.writeLEFloat(1.0F);
								data.writeLEFloat(1.0F);
								data.writeLEFloat(f_72_ + fs[0] + fs_29_[0]);
								data.writeLEFloat(f_73_ + fs[1] + fs_29_[1]);
								data.writeLEFloat(f_74_ + fs[2] + fs_29_[2]);
								data.writeByte(i_68_);
								data.writeByte(i_69_);
								data.writeByte(i_70_);
								data.writeByte(i_71_);
								data.writeLEFloat(1.0F);
								data.writeLEFloat(0.0F);
								data.writeLEFloat(f_72_ + fs[0] - fs_29_[0]);
								data.writeLEFloat(f_73_ + fs[1] - fs_29_[1]);
								data.writeLEFloat(f_74_ + fs[2] - fs_29_[2]);
								data.writeByte(i_68_);
								data.writeByte(i_69_);
								data.writeByte(i_70_);
								data.writeByte(i_71_);
							} else {
								data.writeLEFloat(0.0F);
								data.writeLEFloat(0.0F);
								data.writeLEFloat(f_72_ + f_20_ * -i_75_);
								data.writeLEFloat(f_73_ + f_21_ * -i_75_);
								data.writeLEFloat(f_74_ + f_22_ * -i_75_);
								data.writeByte(i_68_);
								data.writeByte(i_69_);
								data.writeByte(i_70_);
								data.writeByte(i_71_);
								data.writeLEFloat(0.0F);
								data.writeLEFloat(1.0F);
								data.writeLEFloat(f_72_ + f_26_ * i_75_);
								data.writeLEFloat(f_73_ + f_27_ * i_75_);
								data.writeLEFloat(f_74_ + f_28_ * i_75_);
								data.writeByte(i_68_);
								data.writeByte(i_69_);
								data.writeByte(i_70_);
								data.writeByte(i_71_);
								data.writeLEFloat(1.0F);
								data.writeLEFloat(1.0F);
								data.writeLEFloat(f_72_ + f_20_ * i_75_);
								data.writeLEFloat(f_73_ + f_21_ * i_75_);
								data.writeLEFloat(f_74_ + f_22_ * i_75_);
								data.writeByte(i_68_);
								data.writeByte(i_69_);
								data.writeByte(i_70_);
								data.writeByte(i_71_);
								data.writeLEFloat(1.0F);
								data.writeLEFloat(0.0F);
								data.writeLEFloat(f_72_ + f_23_ * i_75_);
								data.writeLEFloat(f_73_ + f_24_ * i_75_);
								data.writeLEFloat(f_74_ + f_25_ * i_75_);
								data.writeByte(i_68_);
								data.writeByte(i_69_);
								data.writeByte(i_70_);
								data.writeByte(i_71_);
							}
						}
					}
				}
			}
		}
		if (data.offset * -165875887 != 0) {
			anInterface11_1294.write(24, data.payload, data.offset
					* -165875887);
			class134_sub2.setPointers(aClass94_1295, null, aClass94_1296, aClass94_1299);
			class134_sub2.method14353(7, 0, data.offset * -165875887 / 24);
		}
	}

	void method1791(OpenGlToolkit toolkit) {
		aFloat1309 = toolkit.ambient;
		toolkit.method14375();
		OpenGL.glDisable(16384);
		OpenGL.glDisable(16385);
		toolkit.method14339(false);
		OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
	}

	void method1792(OpenGlToolkit toolkit) {
		toolkit.method14339(true);
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);

		if (toolkit.ambient != aFloat1309) {
			toolkit.method2476(aFloat1309);
		}
	}

	void method1802(OpenGlToolkit toolkit) {
		anInterface11_1294 = toolkit.createArrayBuffer(24, null, 196584, true);
		aClass94_1299 = new OpenGlArrayBufferPointer(anInterface11_1294, 5126, 2, 0);
		aClass94_1295 = new OpenGlArrayBufferPointer(anInterface11_1294, 5126, 3, 8);
		aClass94_1296 = new OpenGlArrayBufferPointer(anInterface11_1294, 5121, 4, 20);
	}

}