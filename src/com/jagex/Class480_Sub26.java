package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class Class480_Sub26 extends Linkable {
	NativeGround aClass120_Sub2_10170;
	PointLight aClass480_Sub23_10171;
	ByteBuffer aByteBuffer10172;
	int anInt10173;
	int anInt10174;
	int anInt10175;
	float[][] aFloatArrayArray10176;
	int anInt10177 = 0;
	int anInt10178 = 0;
	int anInt10179 = 0;
	NativeElementArrayBuffer anInterface36_10180;
	NativeArrayBuffer anInterface32_10181;
	int anInt10182;
	float[][] aFloatArrayArray10183;
	float[][] aFloatArrayArray10184;
	HashTable aClass667_10185;
	NativeToolkit aClass134_Sub3_10186;

	Class480_Sub26(NativeToolkit class134_sub3, NativeGround class120_sub2, PointLight class480_sub23, int[] is) {
		aClass134_Sub3_10186 = class134_sub3;
		aClass480_Sub23_10171 = class480_sub23;
		aClass120_Sub2_10170 = class120_sub2;
		int i = aClass480_Sub23_10171.getRange() - (class120_sub2.tileUnits * 1668096025 >> 1);
		anInt10173 = aClass480_Sub23_10171.getX() - i >> class120_sub2.tileScale * -333236347;
		anInt10174 = aClass480_Sub23_10171.getX() + i >> class120_sub2.tileScale * -333236347;
		anInt10175 = aClass480_Sub23_10171.getZ() - i >> class120_sub2.tileScale * -333236347;
		anInt10182 = aClass480_Sub23_10171.getZ() + i >> class120_sub2.tileScale * -333236347;
		int i_42_ = anInt10174 - anInt10173 + 1;
		int i_43_ = anInt10182 - anInt10175 + 1;
		aFloatArrayArray10176 = new float[i_42_ + 1][i_43_ + 1];
		aFloatArrayArray10183 = new float[i_42_ + 1][i_43_ + 1];
		aFloatArrayArray10184 = new float[i_42_ + 1][i_43_ + 1];
		for (int i_44_ = 0; i_44_ <= i_43_; i_44_++) {
			int i_45_ = i_44_ + anInt10175;
			if (i_45_ > 0 && i_45_ < aClass120_Sub2_10170.length * 295124605 - 1) {
				for (int i_46_ = 0; i_46_ <= i_42_; i_46_++) {
					int i_47_ = i_46_ + anInt10173;
					if (i_47_ > 0 && i_47_ < aClass120_Sub2_10170.width * 767658255 - 1) {
						int i_48_ = class120_sub2.getTileHeight(i_47_ + 1, i_45_)
								- class120_sub2.getTileHeight(i_47_ - 1, i_45_);
						int i_49_ = class120_sub2.getTileHeight(i_47_, i_45_ + 1)
								- class120_sub2.getTileHeight(i_47_, i_45_ - 1);
						float f = (float) (1.0 / Math.sqrt(i_48_ * i_48_ + 65536 + i_49_ * i_49_));
						aFloatArrayArray10176[i_46_][i_44_] = i_48_ * f;
						aFloatArrayArray10183[i_46_][i_44_] = -256.0F * f;
						aFloatArrayArray10184[i_46_][i_44_] = i_49_ * f;
					}
				}
			}
		}
		int i_50_ = 0;
		for (int i_51_ = anInt10175; i_51_ <= anInt10182; i_51_++) {
			if (i_51_ >= 0 && i_51_ < class120_sub2.length * 295124605) {
				for (int i_52_ = anInt10173; i_52_ <= anInt10174; i_52_++) {
					if (i_52_ >= 0 && i_52_ < class120_sub2.width * 767658255) {
						int i_53_ = is[i_50_];
						int[] is_54_ = class120_sub2.anIntArrayArrayArray8709[i_52_][i_51_];
						if (is_54_ != null && i_53_ != 0) {
							if (i_53_ == 1) {
								for (int i_55_ = 0; i_55_ < is_54_.length; i_55_ += 3) {
									if (is_54_[i_55_] != -1 && is_54_[i_55_ + 1] != -1 && is_54_[i_55_ + 2] != -1) {
										anInt10178 += 3;
									}
								}
							} else {
								anInt10178 += 3;
							}
						}
					}
					i_50_++;
				}
			} else {
				i_50_ += anInt10174 - anInt10173;
			}
		}
		if (anInt10178 > 0) {
			aClass667_10185 = new HashTable(HashTable.nextPowerOfTwo(anInt10178));
			aByteBuffer10172 = aClass134_Sub3_10186.aByteBuffer9279;
			aByteBuffer10172.clear();
			aByteBuffer10172.position(aClass134_Sub3_10186.anInt9282 >> 1);
			aByteBuffer10172.slice();
			aByteBuffer10172.position(0);
			aByteBuffer10172.limit(aClass134_Sub3_10186.anInt9282 >> 1);
			int i_56_ = 0;
			i_50_ = 0;
			for (int i_57_ = anInt10175; i_57_ <= anInt10182; i_57_++) {
				if (i_57_ >= 0 && i_57_ < class120_sub2.length * 295124605) {
					int i_58_ = 0;
					for (int i_59_ = anInt10173; i_59_ <= anInt10174; i_59_++) {
						if (i_59_ >= 0 && i_59_ < class120_sub2.width * 767658255) {
							int i_60_ = is[i_50_];
							int[] is_61_ = class120_sub2.anIntArrayArrayArray8709[i_59_][i_57_];
							if (is_61_ != null && i_60_ != 0) {
								if (i_60_ == 1) {
									int[] is_62_ = class120_sub2.anIntArrayArrayArray8723[i_59_][i_57_];
									int[] is_63_ = class120_sub2.anIntArrayArrayArray8724[i_59_][i_57_];
									int i_64_ = 0;
									while (i_64_ < is_61_.length) {
										if (is_61_[i_64_] != -1 && is_61_[i_64_ + 1] != -1 && is_61_[i_64_ + 2] != -1) {
											method16023(i_58_, i_56_, i_59_, i_57_, is_62_[i_64_], is_63_[i_64_]);
											i_64_++;
											method16023(i_58_, i_56_, i_59_, i_57_, is_62_[i_64_], is_63_[i_64_]);
											i_64_++;
											method16023(i_58_, i_56_, i_59_, i_57_, is_62_[i_64_], is_63_[i_64_]);
											i_64_++;
										} else {
											i_64_ += 3;
										}
									}
								} else if (i_60_ == 3) {
									method16023(i_58_, i_56_, i_59_, i_57_, 0, 0);
									method16023(i_58_, i_56_, i_59_, i_57_, class120_sub2.tileUnits * 1668096025, 0);
									method16023(i_58_, i_56_, i_59_, i_57_, 0, class120_sub2.tileUnits * 1668096025);
								} else if (i_60_ == 2) {
									method16023(i_58_, i_56_, i_59_, i_57_, class120_sub2.tileUnits * 1668096025, 0);
									method16023(i_58_, i_56_, i_59_, i_57_, class120_sub2.tileUnits * 1668096025,
											class120_sub2.tileUnits * 1668096025);
									method16023(i_58_, i_56_, i_59_, i_57_, 0, 0);
								} else if (i_60_ == 5) {
									method16023(i_58_, i_56_, i_59_, i_57_, class120_sub2.tileUnits * 1668096025,
											class120_sub2.tileUnits * 1668096025);
									method16023(i_58_, i_56_, i_59_, i_57_, 0, class120_sub2.tileUnits * 1668096025);
									method16023(i_58_, i_56_, i_59_, i_57_, class120_sub2.tileUnits * 1668096025, 0);
								} else if (i_60_ == 4) {
									method16023(i_58_, i_56_, i_59_, i_57_, 0, class120_sub2.tileUnits * 1668096025);
									method16023(i_58_, i_56_, i_59_, i_57_, 0, 0);
									method16023(i_58_, i_56_, i_59_, i_57_, class120_sub2.tileUnits * 1668096025,
											class120_sub2.tileUnits * 1668096025);
								}
							}
						}
						i_50_++;
						i_58_++;
					}
				} else {
					i_50_ += anInt10174 - anInt10173;
				}
				i_56_++;
			}
			method16035();
		} else {
			anInterface32_10181 = null;
			anInterface36_10180 = null;
		}
		aClass667_10185 = null;
		aFloatArrayArray10184 = null;
		aFloatArrayArray10183 = null;
		aFloatArrayArray10176 = null;
	}

	void method16022(Class259 class259, NativeElementArrayBuffer interface36, int i) {
		class259.anInt2880 = 0;
		class259.anInt2879 = anInt10177;
		class259.anInt2878 = 0;
		class259.anInt2877 = anInt10179 / 3;
		class259.anInterface29_2863 = aClass134_Sub3_10186.anInterface29_9361;
		float f = aClass480_Sub23_10171.getIntensity();
		class259.aClass397_2870.set(f, f, f);
		aClass134_Sub3_10186.method14620(0, anInterface32_10181);
		aClass134_Sub3_10186.method14697(aClass134_Sub3_10186.aClass323_9291);
		aClass134_Sub3_10186.method14748(anInterface36_10180);
		class259.method4776(0);
	}

	void method16023(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_) {
		long l = -1L;
		int i_5_ = i_3_ + (i_1_ << aClass120_Sub2_10170.tileScale * -333236347);
		int i_6_ = i_4_ + (i_2_ << aClass120_Sub2_10170.tileScale * -333236347);
		int i_7_ = aClass120_Sub2_10170.averageHeight(i_5_, i_6_);
		if ((i_3_ & 0x7f) == 0 || (i_4_ & 0x7f) == 0) {
			l = (i_6_ & 0xffffL) << 16 | i_5_ & 0xffffL;
			Linkable class480 = aClass667_10185.get(l);
			if (class480 != null) {
				Unsafe unsafe = aClass134_Sub3_10186.unsafe;
				unsafe.putShort(
						aClass134_Sub3_10186.aLong9268 + (aClass134_Sub3_10186.anInt9282 >> 1) + anInt10179 * 2,
						((LinkableShort) class480).value);
				anInt10179++;
				return;
			}
		}
		short i_8_ = (short) anInt10177;
		if (l != -1L) {
			aClass667_10185.put(l, new LinkableShort(i_8_));
		}
		float f;
		float f_9_;
		float f_10_;
		if (i_3_ == 0 && i_4_ == 0) {
			f = aFloatArrayArray10176[i][i_0_];
			f_9_ = aFloatArrayArray10183[i][i_0_];
			f_10_ = aFloatArrayArray10184[i][i_0_];
		} else if (i_3_ == aClass120_Sub2_10170.tileUnits * 1668096025 && i_4_ == 0) {
			f = aFloatArrayArray10176[i + 1][i_0_];
			f_9_ = aFloatArrayArray10183[i + 1][i_0_];
			f_10_ = aFloatArrayArray10184[i + 1][i_0_];
		} else if (i_3_ == aClass120_Sub2_10170.tileUnits * 1668096025
				&& i_4_ == aClass120_Sub2_10170.tileUnits * 1668096025) {
			f = aFloatArrayArray10176[i + 1][i_0_ + 1];
			f_9_ = aFloatArrayArray10183[i + 1][i_0_ + 1];
			f_10_ = aFloatArrayArray10184[i + 1][i_0_ + 1];
		} else if (i_3_ == 0 && i_4_ == aClass120_Sub2_10170.tileUnits * 1668096025) {
			f = aFloatArrayArray10176[i][i_0_ + 1];
			f_9_ = aFloatArrayArray10183[i][i_0_ + 1];
			f_10_ = aFloatArrayArray10184[i][i_0_ + 1];
		} else {
			float f_11_ = (float) i_3_ / (float) (aClass120_Sub2_10170.tileUnits * 1668096025);
			float f_12_ = (float) i_4_ / (float) (aClass120_Sub2_10170.tileUnits * 1668096025);
			float f_13_ = aFloatArrayArray10176[i][i_0_];
			float f_14_ = aFloatArrayArray10183[i][i_0_];
			float f_15_ = aFloatArrayArray10184[i][i_0_];
			float f_16_ = aFloatArrayArray10176[i + 1][i_0_];
			float f_17_ = aFloatArrayArray10183[i + 1][i_0_];
			float f_18_ = aFloatArrayArray10184[i + 1][i_0_];
			f_13_ += (aFloatArrayArray10176[i][i_0_ + 1] - f_13_) * f_11_;
			f_14_ += (aFloatArrayArray10183[i][i_0_ + 1] - f_14_) * f_11_;
			f_15_ += (aFloatArrayArray10184[i][i_0_ + 1] - f_15_) * f_11_;
			f_16_ += (aFloatArrayArray10176[i + 1][i_0_ + 1] - f_16_) * f_11_;
			f_17_ += (aFloatArrayArray10183[i + 1][i_0_ + 1] - f_17_) * f_11_;
			f_18_ += (aFloatArrayArray10184[i + 1][i_0_ + 1] - f_18_) * f_11_;
			f = f_13_ + (f_16_ - f_13_) * f_12_;
			f_9_ = f_14_ + (f_17_ - f_14_) * f_12_;
			f_10_ = f_15_ + (f_18_ - f_15_) * f_12_;
		}
		float f_19_ = aClass480_Sub23_10171.getX() - i_5_;
		float f_20_ = aClass480_Sub23_10171.getY() - i_7_;
		float f_21_ = aClass480_Sub23_10171.getZ() - i_6_;
		float f_22_ = (float) Math.sqrt(f_19_ * f_19_ + f_20_ * f_20_ + f_21_ * f_21_);
		float f_23_ = 1.0F / f_22_;
		f_19_ *= f_23_;
		f_20_ *= f_23_;
		f_21_ *= f_23_;
		float f_24_ = f_22_ / aClass480_Sub23_10171.getRange();
		float f_25_ = 1.0F - f_24_ * f_24_;
		if (f_25_ < 0.0F) {
			f_25_ = 0.0F;
		}
		float f_26_ = f_19_ * f + f_20_ * f_9_ + f_21_ * f_10_;
		if (f_26_ < 0.0F) {
			f_26_ = 0.0F;
		}
		float f_27_ = f_26_ * f_25_ * 2.0F;
		if (f_27_ > 1.0F) {
			f_27_ = 1.0F;
		}
		int i_28_ = aClass480_Sub23_10171.getColour();
		int i_29_ = (int) (f_27_ * (i_28_ >> 16 & 0xff));
		if (i_29_ > 255) {
			i_29_ = 255;
		}
		int i_30_ = (int) (f_27_ * (i_28_ >> 8 & 0xff));
		if (i_30_ > 255) {
			i_30_ = 255;
		}
		int i_31_ = (int) (f_27_ * (i_28_ & 0xff));
		if (i_31_ > 255) {
			i_31_ = 255;
		}
		Unsafe unsafe = aClass134_Sub3_10186.unsafe;
		unsafe.putFloat(aClass134_Sub3_10186.aLong9268 + anInt10177 * 16, i_5_);
		unsafe.putFloat(aClass134_Sub3_10186.aLong9268 + anInt10177 * 16 + 4L, i_7_);
		unsafe.putFloat(aClass134_Sub3_10186.aLong9268 + anInt10177 * 16 + 8L, i_6_);
		if (aClass134_Sub3_10186.endianness == 0) {
			unsafe.putByte(aClass134_Sub3_10186.aLong9268 + anInt10177 * 16 + 12L, (byte) i_31_);
			unsafe.putByte(aClass134_Sub3_10186.aLong9268 + anInt10177 * 16 + 13L, (byte) i_30_);
			unsafe.putByte(aClass134_Sub3_10186.aLong9268 + anInt10177 * 16 + 14L, (byte) i_29_);
		} else {
			unsafe.putByte(aClass134_Sub3_10186.aLong9268 + anInt10177 * 16 + 12L, (byte) i_29_);
			unsafe.putByte(aClass134_Sub3_10186.aLong9268 + anInt10177 * 16 + 13L, (byte) i_30_);
			unsafe.putByte(aClass134_Sub3_10186.aLong9268 + anInt10177 * 16 + 14L, (byte) i_31_);
		}
		unsafe.putByte(aClass134_Sub3_10186.aLong9268 + anInt10177 * 16 + 15L, (byte) -1);
		anInt10177++;
		unsafe.putShort(aClass134_Sub3_10186.aLong9268 + (aClass134_Sub3_10186.anInt9282 >> 1) + anInt10179 * 2, i_8_);
		anInt10179++;
	}

	void method16024(Class259 class259, int i, int i_32_, int i_33_, boolean[][] bools, boolean bool) {
		if (anInterface36_10180 != null && anInt10173 <= i + i_33_ && anInt10174 >= i - i_33_
				&& anInt10175 <= i_32_ + i_33_ && anInt10182 >= i_32_ - i_33_) {
			if (bool) {
				for (int i_34_ = anInt10173; i_34_ <= anInt10174; i_34_++) {
					if (i_34_ - i >= -i_33_ && i_34_ - i <= i_33_) {
						for (int i_35_ = anInt10175; i_35_ <= anInt10182; i_35_++) {
							if (i_35_ - i_32_ >= -i_33_ && i_35_ - i_32_ <= i_33_
									&& bools[i_34_ - i + i_33_][i_35_ - i_32_ + i_33_]) {
								method16022(class259, anInterface36_10180, anInt10179 / 3);
								return;
							}
						}
					}
				}
			} else {
				int i_36_ = 0;
				ByteBuffer bytebuffer = aClass134_Sub3_10186.aByteBuffer9279;
				bytebuffer.clear();
				for (int i_37_ = anInt10175; i_37_ <= anInt10182; i_37_++) {
					if (i_37_ - i_32_ >= -i_33_ && i_37_ - i_32_ <= i_33_) {
						int i_38_ = i_37_ * aClass120_Sub2_10170.width * 767658255 + anInt10173;
						for (int i_39_ = anInt10173; i_39_ <= anInt10174; i_39_++) {
							if (i_39_ - i >= -i_33_ && i_39_ - i <= i_33_
									&& bools[i_39_ - i + i_33_][i_37_ - i_32_ + i_33_]) {
								short[] is = aClass120_Sub2_10170.aShortArrayArray8717[i_38_];
								if (is != null) {
									for (short element : is) {
										bytebuffer.putShort(element);
										i_36_++;
									}
								}
							}
							i_38_++;
						}
					}
				}
				if (bytebuffer.position() != 0 && i_36_ != 0) {
					int i_41_ = bytebuffer.position();
					NativeElementArrayBuffer interface36 = aClass134_Sub3_10186.method14618(i_41_ / 2);
					interface36.read(0, i_41_, aClass134_Sub3_10186.aLong9268);
					method16022(class259, interface36, i_36_ / 3);
				}
			}
		}
	}

	void method16035() {
		anInterface36_10180 = aClass134_Sub3_10186.createElementArrayBuffer(false);
		anInterface36_10180.allocate(anInt10179);
		anInterface32_10181 = aClass134_Sub3_10186.createArrayBuffer(false);
		anInterface32_10181.reallocate(anInt10177 * 16, 16);
		anInterface32_10181.read(0, anInt10177 * 16, aClass134_Sub3_10186.aLong9268);
		anInterface36_10180.read(0, anInt10179 * 2, aClass134_Sub3_10186.aLong9268
				+ (aClass134_Sub3_10186.anInt9282 >> 1));
	}
}
