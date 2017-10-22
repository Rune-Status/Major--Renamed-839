package com.jagex;

import java.nio.ByteBuffer;

public class Class322 {

	static final void method5761(byte[] dest, byte[] source, int sourceOffset, int destOffset, int width, int i_72_,
			int destStep, int sourceStep) {
		int i_75_ = -(width >> 2);
		width = -(width & 0x3);

		for (int i_76_ = -i_72_; i_76_ < 0; i_76_++) {
			for (int i_77_ = i_75_; i_77_ < 0; i_77_++) {
				dest[destOffset++] -= source[sourceOffset++];
				dest[destOffset++] -= source[sourceOffset++];
				dest[destOffset++] -= source[sourceOffset++];
				dest[destOffset++] -= source[sourceOffset++];
			}

			for (int x = width; x < 0; x++) {
				dest[destOffset++] -= source[sourceOffset++];
			}

			destOffset += destStep;
			sourceOffset += sourceStep;
		}
	}

	static final boolean method5762(byte[] is, int index, int width, int height, int i_81_, int i_82_) {
		int i_83_ = width % i_82_;
		int i_84_;

		if (i_83_ != 0) {
			i_84_ = i_82_ - i_83_;
		} else {
			i_84_ = 0;
		}

		int i_85_ = -((height + i_82_ - 1) / i_82_);
		int i_86_ = -((width + i_82_ - 1) / i_82_);

		for (int i_87_ = i_85_; i_87_ < 0; i_87_++) {
			for (int i_88_ = i_86_; i_88_ < 0; i_88_++) {
				if (is[index] == 0) {
					return true;
				}

				index += i_82_;
			}

			index -= i_84_;
			if (is[index - 1] == 0) {
				return true;
			}

			index += i_81_;
		}

		return false;
	}

	static final void method5767(byte[] dest, byte[] source, int sourceOffset, int destOffset, int width, int i_92_,
			int destStep, int sourceStep) {
		int i_95_ = -(width >> 2);
		width = -(width & 0x3);

		for (int i_96_ = -i_92_; i_96_ < 0; i_96_++) {
			for (int i_97_ = i_95_; i_97_ < 0; i_97_++) {
				dest[destOffset++] += source[sourceOffset++];
				dest[destOffset++] += source[sourceOffset++];
				dest[destOffset++] += source[sourceOffset++];
				dest[destOffset++] += source[sourceOffset++];
			}

			for (int x = width; x < 0; x++) {
				dest[destOffset++] += source[sourceOffset++];
			}

			destOffset += destStep;
			sourceOffset += sourceStep;
		}
	}

	int anInt3416;
	int anInt3417;
	int anInt3418;
	NativeGround ground;
	byte[] aByteArray3420;
	int anInt3421;
	int anInt3422;
	NativeToolkit toolkit;
	Class317[][] aClass317ArrayArray3424;

	Class322(NativeToolkit toolkit, NativeGround ground) {
		this.toolkit = toolkit;
		this.ground = ground;

		anInt3418 = 2 + (ground.width * 767658255 * ground.tileUnits * 1668096025 >> toolkit.shadowScale);
		anInt3417 = 2 + (ground.length * 295124605 * ground.tileUnits * 1668096025 >> toolkit.shadowScale);
		aByteArray3420 = new byte[anInt3418 * anInt3417];
		anInt3422 = 7 + toolkit.shadowScale - ground.tileScale * -333236347;
		anInt3421 = ground.width * 767658255 >> anInt3422;
		anInt3416 = ground.length * 295124605 >> anInt3422;
	}

	void method5754() {
		aClass317ArrayArray3424 = new Class317[anInt3421][anInt3416];
		for (int i = 0; i < anInt3416; i++) {
			for (int i_0_ = 0; i_0_ < anInt3421; i_0_++) {
				aClass317ArrayArray3424[i_0_][i] = new Class317(toolkit, this, ground, i_0_, i, anInt3422,
						i_0_ * 128 + 1, i * 128 + 1);
				if (aClass317ArrayArray3424[i_0_][i].anInt3386 == 0) {
					aClass317ArrayArray3424[i_0_][i] = null;
				}
			}
		}
	}

	void method5755(Shadow shadow, int x, int y) {
		NativeShadow shad = (NativeShadow) shadow;
		x += shad.x + 1;
		y += shad.y + 1;

		int i_2_ = x + y * anInt3418;
		int i_3_ = 0;
		int height = shad.height;
		int width = shad.width;
		int i_6_ = anInt3418 - width;
		int i_7_ = 0;

		if (y <= 0) {
			int i_8_ = 1 - y;
			height -= i_8_;
			i_3_ += i_8_ * width;
			i_2_ += i_8_ * anInt3418;
			y = 1;
		}

		if (y + height >= anInt3417) {
			int i_9_ = y + height + 1 - anInt3417;
			height -= i_9_;
		}

		if (x <= 0) {
			int i_10_ = 1 - x;
			width -= i_10_;
			i_3_ += i_10_;
			i_2_ += i_10_;
			i_7_ += i_10_;
			i_6_ += i_10_;
			x = 1;
		}

		if (x + width >= anInt3418) {
			int i_11_ = x + width + 1 - anInt3418;
			width -= i_11_;
			i_7_ += i_11_;
			i_6_ += i_11_;
		}

		if (width > 0 && height > 0) {
			method5767(aByteArray3420, shad.map, i_3_, i_2_, width, height, i_6_, i_7_);
			method5759(x, y, width, height);
		}
	}

	void method5756(Class259 class259, int i, int i_12_, int i_13_, boolean[][] bools, boolean bool) {
		toolkit.method2473(false);
		float f = 1.0F / (toolkit.anInt9336 * 128);

		if (bool) {
			for (int i_14_ = 0; i_14_ < anInt3416; i_14_++) {
				int i_15_ = i_14_ << anInt3422;
				int i_16_ = i_14_ + 1 << anInt3422;

				for (int i_17_ = 0; i_17_ < anInt3421; i_17_++) {
					if (aClass317ArrayArray3424[i_17_][i_14_] != null) {
						int i_18_ = i_17_ << anInt3422;
						int i_19_ = i_17_ + 1 << anInt3422;

						while_0_: for (int i_20_ = i_18_; i_20_ < i_19_; i_20_++) {
							if (i_20_ - i >= -i_13_ && i_20_ - i <= i_13_) {
								for (int i_21_ = i_15_; i_21_ < i_16_; i_21_++) {
									if (i_21_ - i_12_ >= -i_13_ && i_21_ - i_12_ <= i_13_
											&& bools[i_20_ - i + i_13_][i_21_ - i_12_ + i_13_]) {
										class259.aClass399_2865.method6551(f, f, 1.0F, 1.0F);
										class259.aClass399_2865.array[12] = -i_17_;
										class259.aClass399_2865.array[13] = -i_14_;

										aClass317ArrayArray3424[i_17_][i_14_].method5703(class259);
										break while_0_;
									}
								}
							}
						}
					}
				}
			}
		} else {
			int[] is = new int[anInt3416 * anInt3421];
			ByteBuffer buffer = toolkit.aByteBuffer9279;
			buffer.clear();
			int i_22_ = 0;

			for (int i_23_ = 0; i_23_ < anInt3416; i_23_++) {
				int i_24_ = i_23_ << anInt3422;
				int i_25_ = i_23_ + 1 << anInt3422;

				for (int i_26_ = 0; i_26_ < anInt3421; i_26_++) {
					Class317 class317 = aClass317ArrayArray3424[i_26_][i_23_];
					int i_27_ = 0;

					if (class317 != null) {
						int i_28_ = i_26_ << anInt3422;
						int i_29_ = i_26_ + 1 << anInt3422;

						for (int i_30_ = i_24_; i_30_ < i_25_; i_30_++) {
							if (i_30_ - i_12_ >= -i_13_ && i_30_ - i_12_ <= i_13_) {
								int i_31_ = i_30_ * ground.width * 767658255 + i_28_;

								for (int i_32_ = i_28_; i_32_ < i_29_; i_32_++) {
									if (i_32_ - i >= -i_13_ && i_32_ - i <= i_13_
											&& bools[i_32_ - i + i_13_][i_30_ - i_12_ + i_13_]) {
										short[] is_33_ = ground.aShortArrayArray8717[i_31_];

										if (is_33_ != null) {
											for (short element : is_33_) {
												buffer.putShort(element);
												i_27_++;
											}
										}
									}
									i_31_++;
								}
							}
						}
					}

					is[i_22_] = i_27_;
					i_22_++;
				}
			}

			if (buffer.position() != 0) {
				int i_35_ = buffer.position();
				NativeElementArrayBuffer interface36 = toolkit.method14618(i_35_ / 2);
				interface36.read(0, i_35_, toolkit.aLong9268);
				int i_36_ = 0;
				i_22_ = 0;

				for (int i_37_ = 0; i_37_ < anInt3416; i_37_++) {
					for (int i_38_ = 0; i_38_ < anInt3421; i_38_++) {
						if (is[i_22_] != 0) {
							class259.aClass399_2865.method6551(f, f, 1.0F, 1.0F);
							class259.aClass399_2865.array[12] = -i_38_;
							class259.aClass399_2865.array[13] = -i_37_;
							aClass317ArrayArray3424[i_38_][i_37_].method5702(class259, interface36, i_36_,
									is[i_22_] / 3);
							i_36_ += is[i_22_];
						}
						i_22_++;
					}
				}
			}
		}

		toolkit.method2473(true);
	}

	void method5757(Shadow shadow, int i, int i_39_) {
		NativeShadow shad = (NativeShadow) shadow;
		i += shad.x + 1;
		i_39_ += shad.y + 1;
		int i_40_ = i + i_39_ * anInt3418;
		int i_41_ = 0;
		int height = shad.height;
		int width = shad.width;
		int i_44_ = anInt3418 - width;
		int i_45_ = 0;
		if (i_39_ <= 0) {
			int i_46_ = 1 - i_39_;
			height -= i_46_;
			i_41_ += i_46_ * width;
			i_40_ += i_46_ * anInt3418;
			i_39_ = 1;
		}
		if (i_39_ + height >= anInt3417) {
			int i_47_ = i_39_ + height + 1 - anInt3417;
			height -= i_47_;
		}
		if (i <= 0) {
			int i_48_ = 1 - i;
			width -= i_48_;
			i_41_ += i_48_;
			i_40_ += i_48_;
			i_45_ += i_48_;
			i_44_ += i_48_;
			i = 1;
		}
		if (i + width >= anInt3418) {
			int i_49_ = i + width + 1 - anInt3418;
			width -= i_49_;
			i_45_ += i_49_;
			i_44_ += i_49_;
		}
		if (width > 0 && height > 0) {
			method5761(aByteArray3420, shad.map, i_41_, i_40_, width, height, i_44_, i_45_);
			method5759(i, i_39_, width, height);
		}
	}

	boolean method5758(Shadow shadow, int x, int y) {
		NativeShadow shad = (NativeShadow) shadow;
		x += shad.x + 1;
		y += shad.y + 1;
		int i_51_ = x + y * anInt3418;
		int height = shad.height;
		int width = shad.width;
		int i_54_ = anInt3418 - width;

		if (y <= 0) {
			int i_55_ = 1 - y;
			height -= i_55_;
			i_51_ += i_55_ * anInt3418;
			y = 1;
		}

		if (y + height >= anInt3417) {
			int i_56_ = y + height + 1 - anInt3417;
			height -= i_56_;
		}

		if (x <= 0) {
			int i_57_ = 1 - x;
			width -= i_57_;
			i_51_ += i_57_;
			i_54_ += i_57_;
			x = 1;
		}

		if (x + width >= anInt3418) {
			int i_58_ = x + width + 1 - anInt3418;
			width -= i_58_;
			i_54_ += i_58_;
		}

		if (width <= 0 || height <= 0) {
			return false;
		}

		int i_59_ = 8;
		i_54_ += (i_59_ - 1) * anInt3418;
		return method5762(aByteArray3420, i_51_, width, height, i_54_, i_59_);
	}

	void method5759(int i, int i_60_, int width, int height) {
		if (aClass317ArrayArray3424 != null) {
			int minX = i - 1 >> 7;
			int maxX = i - 1 + width - 1 >> 7;
			int minY = i_60_ - 1 >> 7;
			int maxY = i_60_ - 1 + height - 1 >> 7;

			for (int index = minX; index <= maxX; index++) {
				Class317[] class317s = aClass317ArrayArray3424[index];

				for (int i_68_ = minY; i_68_ <= maxY; i_68_++) {
					if (class317s[i_68_] != null) {
						class317s[i_68_].aBool3381 = true;
					}
				}
			}
		}
	}

}