package com.jagex;

import java.nio.ByteBuffer;
import java.util.Iterator;

public class NativeGround extends Ground {
	static final int anInt8711 = 1;
	static final int anInt8727 = 74;
	int anInt8708;
	int[][][] anIntArrayArrayArray8709;
	NativeToolkit toolkit;
	int anInt8712;
	NativeArrayBuffer anInterface32_8713;
	Linkable[] aClass480Array8714;
	int anInt8715;
	int anInt8716;
	short[][] aShortArrayArray8717;
	float aFloat8718 = 3.4028235E38F;
	float aFloat8719 = -3.4028235E38F;
	Class480_Sub34[][][] aClass480_Sub34ArrayArrayArray8720;
	byte[][] aByteArrayArray8721;
	ByteBuffer aByteBuffer8722;
	int[][][] anIntArrayArrayArray8723;
	int[][][] anIntArrayArrayArray8724;
	int[][][] anIntArrayArrayArray8725;
	int[][][] anIntArrayArrayArray8726;
	int anInt8728;
	Deque aClass644_8729 = new Deque();
	byte[][] aByteArrayArray8730;
	NativeArrayBuffer anInterface32_8731;
	int anInt8732;
	Class323 aClass323_8733;
	float[][] aFloatArrayArray8734;
	int anInt8735;
	Class322 aClass322_8736;
	int anInt8737;
	float[][] aFloatArrayArray8738;
	float[][] aFloatArrayArray8739;
	int[][][] anIntArrayArrayArray8740;
	int anInt8741;
	Linkable[] aClass480Array8742;
	HashTable aClass667_8743;
	ByteBuffer aByteBuffer8744;
	int anInt8745;
	int[] anIntArray8746 = new int[1];
	int[] anIntArray8747 = new int[1];
	int anInt8748;
	int[] anIntArray8749 = new int[1];

	NativeGround(NativeToolkit class134_sub3, int i, int i_38_, int i_39_, int i_40_, int[][] is, int[][] is_41_,
			int i_42_) {
		super(i_39_, i_40_, i_42_, is);
		toolkit = class134_sub3;
		anInt8741 = tileScale * -333236347 - 2;
		anInt8728 = 1 << anInt8741;
		anInt8712 = i;
		anInt8732 = i_38_;
		anIntArrayArrayArray8725 = new int[i_39_][i_40_][];
		aClass480_Sub34ArrayArrayArray8720 = new Class480_Sub34[i_39_][i_40_][];
		anIntArrayArrayArray8723 = new int[i_39_][i_40_][];
		anIntArrayArrayArray8724 = new int[i_39_][i_40_][];
		anIntArrayArrayArray8709 = new int[i_39_][i_40_][];
		anIntArrayArrayArray8740 = new int[i_39_][i_40_][];
		aShortArrayArray8717 = new short[i_39_ * i_40_][];
		aByteArrayArray8730 = new byte[i_39_][i_40_];
		aByteArrayArray8721 = new byte[i_39_ + 1][i_40_ + 1];
		aFloatArrayArray8734 = new float[width * 767658255 + 1][length * 295124605 + 1];
		aFloatArrayArray8738 = new float[width * 767658255 + 1][length * 295124605 + 1];
		aFloatArrayArray8739 = new float[width * 767658255 + 1][length * 295124605 + 1];
		for (int i_43_ = 0; i_43_ <= length * 295124605; i_43_++) {
			for (int i_44_ = 0; i_44_ <= width * 767658255; i_44_++) {
				int i_45_ = tileHeights[i_44_][i_43_];
				if (i_45_ < aFloat8718) {
					aFloat8718 = i_45_;
				}
				if (i_45_ > aFloat8719) {
					aFloat8719 = i_45_;
				}
				if (i_44_ > 0 && i_43_ > 0 && i_44_ < width * 767658255 && i_43_ < length * 295124605) {
					int i_46_ = is_41_[i_44_ + 1][i_43_] - is_41_[i_44_ - 1][i_43_];
					int i_47_ = is_41_[i_44_][i_43_ + 1] - is_41_[i_44_][i_43_ - 1];
					float f = (float) (1.0 / Math.sqrt(i_46_ * i_46_ + 4 * i_42_ * i_42_ + i_47_ * i_47_));
					aFloatArrayArray8734[i_44_][i_43_] = i_46_ * f;
					aFloatArrayArray8738[i_44_][i_43_] = -i_42_ * 2 * f;
					aFloatArrayArray8739[i_44_][i_43_] = i_47_ * f;
				}
			}
		}
		aFloat8718--;
		aFloat8719++;
		aClass667_8743 = new HashTable(128);
		if ((anInt8732 & 0x10) != 0) {
			aClass322_8736 = new Class322(toolkit, this);
		}
	}

	@Override
	public void finish() {
		if (anInt8708 <= 0) {
			aClass322_8736 = null;
			method14049();
		} else {
			byte[][] is = new byte[width * 767658255 + 1][length * 295124605 + 1];
			for (int i = 1; i < width * 767658255; i++) {
				for (int i_164_ = 1; i_164_ < length * 295124605; i_164_++) {
					is[i][i_164_] = (byte) ((aByteArrayArray8721[i - 1][i_164_] >> 2)
							+ (aByteArrayArray8721[i + 1][i_164_] >> 3) + (aByteArrayArray8721[i][i_164_ - 1] >> 2)
							+ (aByteArrayArray8721[i][i_164_ + 1] >> 3) + (aByteArrayArray8721[i][i_164_] >> 1));
				}
			}
			aClass480Array8742 = new Linkable[aClass667_8743.size()];
			aClass667_8743.values(aClass480Array8742);
			for (Linkable element : aClass480Array8742) {
				((Class480_Sub34) element).method16091(anInt8708);
			}
			anInt8745 = 20;
			if (anIntArrayArrayArray8726 != null) {
				anInt8745 += 4;
			}
			if ((anInt8732 & 0x7) != 0) {
				anInt8745 += 12;
			}
			aByteBuffer8722 = toolkit.allocate(anInt8708 * 4);
			aByteBuffer8744 = toolkit.allocate(anInt8708 * anInt8745);
			Class480_Sub34[] class480_sub34s = new Class480_Sub34[anInt8708];
			int i = Class593.priorPowerOf2(anInt8708 / 4);
			if (i < 1) {
				i = 1;
			}
			HashTable class667 = new HashTable(i);
			Class480_Sub34[] class480_sub34s_165_ = new Class480_Sub34[anInt8735];
			for (int i_166_ = 0; i_166_ < width * 767658255; i_166_++) {
				for (int i_167_ = 0; i_167_ < length * 295124605; i_167_++) {
					method14050(i_166_, i_167_, is, class480_sub34s_165_, class667, class480_sub34s);
				}
			}
			for (int i_168_ = 0; i_168_ < anInt8715; i_168_++) {
				Class480_Sub34 class480_sub34 = class480_sub34s[i_168_];
				if (class480_sub34 != null) {
					class480_sub34.method16103(i_168_);
				}
			}
			for (int i_169_ = 0; i_169_ < width * 767658255; i_169_++) {
				for (int i_170_ = 0; i_170_ < length * 295124605; i_170_++) {
					short[] is_171_ = aShortArrayArray8717[i_170_ * width * 767658255 + i_169_];
					if (is_171_ != null) {
						int i_172_ = 0;
						int i_173_ = 0;
						while (i_173_ < is_171_.length) {
							int i_174_ = is_171_[i_173_++] & 0xffff;
							int i_175_ = is_171_[i_173_++] & 0xffff;
							int i_176_ = is_171_[i_173_++] & 0xffff;
							Class480_Sub34 class480_sub34 = class480_sub34s[i_174_];
							Class480_Sub34 class480_sub34_177_ = class480_sub34s[i_175_];
							Class480_Sub34 class480_sub34_178_ = class480_sub34s[i_176_];
							Class480_Sub34 class480_sub34_179_ = null;
							if (class480_sub34 != null) {
								class480_sub34.method16090(i_169_, i_170_, i_172_);
								class480_sub34_179_ = class480_sub34;
							}
							if (class480_sub34_177_ != null) {
								class480_sub34_177_.method16090(i_169_, i_170_, i_172_);
								if (class480_sub34_179_ == null
										|| class480_sub34_177_.linkedKey * -4821875126325281949L < class480_sub34_179_.linkedKey
												* -4821875126325281949L) {
									class480_sub34_179_ = class480_sub34_177_;
								}
							}
							if (class480_sub34_178_ != null) {
								class480_sub34_178_.method16090(i_169_, i_170_, i_172_);
								if (class480_sub34_179_ == null
										|| class480_sub34_178_.linkedKey * -4821875126325281949L < class480_sub34_179_.linkedKey
												* -4821875126325281949L) {
									class480_sub34_179_ = class480_sub34_178_;
								}
							}
							if (class480_sub34_179_ != null) {
								if (class480_sub34 != null) {
									class480_sub34_179_.method16103(i_174_);
								}
								if (class480_sub34_177_ != null) {
									class480_sub34_179_.method16103(i_175_);
								}
								if (class480_sub34_178_ != null) {
									class480_sub34_179_.method16103(i_176_);
								}
								class480_sub34_179_.method16090(i_169_, i_170_, i_172_);
							}
							i_172_++;
						}
					}
				}
			}
			anInt8737 = 0;
			for (int i_180_ = 0; i_180_ < aClass480Array8742.length; i_180_++) {
				Class480_Sub34 class480_sub34 = (Class480_Sub34) aClass480Array8742[i_180_];
				if (class480_sub34.anInt10240 > 0) {
					aClass480Array8742[anInt8737++] = class480_sub34;
				}
			}
			aClass480Array8714 = new Linkable[anInt8737];
			long[] ls = new long[anInt8737];
			for (int i_181_ = 0; i_181_ < anInt8737; i_181_++) {
				Class480_Sub34 class480_sub34 = (Class480_Sub34) aClass480Array8742[i_181_];
				ls[i_181_] = class480_sub34.linkedKey * -4821875126325281949L;
				aClass480Array8714[i_181_] = class480_sub34;
			}
			ArrayUtils.sort(ls, aClass480Array8714);
			method14048();
		}
	}

	@Override
	public void setShadowing(int x, int z, int value) {
		x = Math.min(aByteArrayArray8721.length - 1, Math.max(0, x));
		z = Math.min(aByteArrayArray8721[x].length - 1, Math.max(0, z));
		if ((aByteArrayArray8721[x][z] & 0xff) < value) {
			aByteArrayArray8721[x][z] = (byte) value;
		}
	}

	@Override
	public void addBlendedTile(int i, int i_185_, int[] is, int[] is_186_, int[] is_187_, int[] is_188_, int[] is_189_,
			int[] is_190_, int[] is_191_, int[] is_192_, Class150 class150, boolean bool) {
		TextureMetricsList class147 = toolkit.metricsList;
		if (is_188_ != null && anIntArrayArrayArray8726 == null) {
			anIntArrayArrayArray8726 = new int[width * 767658255][length * 295124605][];
		}
		if (is_186_ != null && anIntArrayArrayArray8725 == null) {
			anIntArrayArrayArray8725 = new int[width * 767658255][length * 295124605][];
		}
		anIntArrayArrayArray8723[i][i_185_] = is;
		anIntArrayArrayArray8724[i][i_185_] = is_187_;
		anIntArrayArrayArray8709[i][i_185_] = is_189_;
		anIntArrayArrayArray8740[i][i_185_] = is_190_;
		if (anIntArrayArrayArray8726 != null) {
			anIntArrayArrayArray8726[i][i_185_] = is_188_;
		}
		if (anIntArrayArrayArray8725 != null) {
			anIntArrayArrayArray8725[i][i_185_] = is_186_;
		}
		Class480_Sub34[] class480_sub34s = aClass480_Sub34ArrayArrayArray8720[i][i_185_] = new Class480_Sub34[is_189_.length];
		for (int i_193_ = 0; i_193_ < is_189_.length; i_193_++) {
			int i_194_ = is_191_[i_193_];
			int i_195_ = is_192_[i_193_];
			if ((anInt8732 & 0x20) != 0 && i_194_ != -1 && class147.get(i_194_).aBool1724) {
				i_195_ = 128;
				i_194_ = -1;
			}
			long l = (long) (class150.intensity * -1801120163) << 48 | (long) (class150.scale * -329760297) << 42
					| (long) (class150.colour * 2139661437) << 28 | i_195_ << 14 | i_194_;
			Linkable class480;
			for (class480 = aClass667_8743.get(l); class480 != null; class480 = aClass667_8743.nextInBucket()) {
				Class480_Sub34 class480_sub34 = (Class480_Sub34) class480;
				if (class480_sub34.anInt10241 == i_194_ && class480_sub34.aFloat10234 == i_195_
						&& class480_sub34.aClass150_10245.equals(class150)) {
					break;
				}
			}
			if (class480 == null) {
				class480_sub34s[i_193_] = new Class480_Sub34(this, i_194_, i_195_, class150);
				aClass667_8743.put(l, class480_sub34s[i_193_]);
			} else {
				class480_sub34s[i_193_] = (Class480_Sub34) class480;
			}
		}
		if (bool) {
			aByteArrayArray8730[i][i_185_] |= 0x1;
		}
		if (is_189_.length > anInt8735) {
			anInt8735 = is_189_.length;
		}
		anInt8708 += is_189_.length;
	}

	@Override
	public Shadow method2194(int i, int i_182_, Shadow class480_sub31_sub12) {
		if ((aByteArrayArray8730[i][i_182_] & 0x1) == 0) {
			return null;
		}
		int i_183_ = tileUnits * 1668096025 >> toolkit.shadowScale;
		NativeShadow class480_sub31_sub12_sub1 = (NativeShadow) class480_sub31_sub12;
		NativeShadow class480_sub31_sub12_sub1_184_;
		if (class480_sub31_sub12_sub1 != null && class480_sub31_sub12_sub1.containsRegion(i_183_, i_183_)) {
			class480_sub31_sub12_sub1_184_ = class480_sub31_sub12_sub1;
			class480_sub31_sub12_sub1_184_.clear();
		} else {
			class480_sub31_sub12_sub1_184_ = new NativeShadow(toolkit, i_183_, i_183_);
		}
		class480_sub31_sub12_sub1_184_.setBounds(0, 0, i_183_, i_183_);
		method14047(class480_sub31_sub12_sub1_184_, i, i_182_);
		return class480_sub31_sub12_sub1_184_;
	}

	@Override
	public void deleteShadow(Shadow class480_sub31_sub12, int i, int i_154_, int i_155_, int i_156_,
			boolean bool) {
		if (aClass322_8736 != null && class480_sub31_sub12 != null) {
			int i_157_ = i - (i_154_ * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale;
			int i_158_ = i_155_ - (i_154_ * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale;
			aClass322_8736.method5755(class480_sub31_sub12, i_157_, i_158_);
		}
	}

	@Override
	public void addShadow(Shadow class480_sub31_sub12, int i, int i_159_, int i_160_, int i_161_,
			boolean bool) {
		if (aClass322_8736 != null && class480_sub31_sub12 != null) {
			int i_162_ = i - (i_159_ * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale;
			int i_163_ = i_160_ - (i_159_ * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale;
			aClass322_8736.method5757(class480_sub31_sub12, i_162_, i_163_);
		}
	}

	@Override
	public boolean method2197(Shadow class480_sub31_sub12, int i, int i_149_, int i_150_, int i_151_,
			boolean bool) {
		if (aClass322_8736 == null || class480_sub31_sub12 == null) {
			return false;
		}
		int i_152_ = i - (i_149_ * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale;
		int i_153_ = i_150_ - (i_149_ * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale;
		return aClass322_8736.method5758(class480_sub31_sub12, i_152_, i_153_);
	}

	@Override
	public void addLight(PointLight class480_sub23, int[] is) {
		aClass644_8729.pushBack(new Class480_Sub26(toolkit, this, class480_sub23, is));
	}

	@Override
	public void renderPlan(int i, int i_133_, int i_134_, int i_135_, int i_136_, int i_137_, int i_138_,
			boolean[][] bools) {
		if (anInt8708 > 0) {
			NativeElementArrayBuffer interface36 = toolkit.method14618(anInt8716);
			int i_139_ = 0;
			int i_140_ = 32767;
			int i_141_ = -32768;
			ByteBuffer bytebuffer = toolkit.aByteBuffer9279;
			bytebuffer.clear();
			for (int i_142_ = i_136_; i_142_ < i_138_; i_142_++) {
				int i_143_ = i_142_ * width * 767658255 + i_135_;
				for (int i_144_ = i_135_; i_144_ < i_137_; i_144_++) {
					if (bools[i_144_ - i_135_][i_142_ - i_136_]) {
						short[] is = aShortArrayArray8717[i_143_];
						if (is != null) {
							for (short element : is) {
								int i_146_ = element & 0xffff;
								if (i_146_ > i_141_) {
									i_141_ = i_146_;
								}
								if (i_146_ < i_140_) {
									i_140_ = i_146_;
								}
								bytebuffer.putShort((short) i_146_);
								i_139_++;
							}
						}
					}
					i_143_++;
				}
			}
			interface36.read(0, bytebuffer.position(), toolkit.aLong9268);
			if (i_139_ > 0) {
				toolkit.method14710();
				Class259 class259 = toolkit.aClass259_9334;
				toolkit.method14620(0, anInterface32_8731);
				toolkit.method14620(1, anInterface32_8713);
				toolkit.method14697(aClass323_8733);
				toolkit.method14748(interface36);
				toolkit.method2471(Class405.aClass405_4563);
				float f = toolkit.method2628().getWidth();
				float f_147_ = toolkit.method2628().getHeight();
				Class405 class405 = new Class405();
				Class405 class405_148_ = new Class405();
				class405.method6754(1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 1.0F, 0.0F);
				class405_148_.method6740(i_134_ / (256.0F * (tileUnits * 1668096025)), -i_134_
						/ (256.0F * (tileUnits * 1668096025)), 1.0F / (aFloat8719 - aFloat8718));
				class405_148_.method6744(i - i_135_ * i_134_ / 256.0F, i_133_ + i_138_ * i_134_ / 256.0F, -aFloat8718
						/ (aFloat8719 - aFloat8718));
				class405_148_.method6741(2.0F / f, 2.0F / f_147_, 1.0F);
				class405_148_.method6744(-1.0F, -1.0F, 0.0F);
				toolkit.aClass405_9287.method6746(class405, class405_148_);
				toolkit.aClass399_9324.method6548(toolkit.aClass405_9287);
				toolkit.method2540(toolkit.aClass399_9324);
				class259.method4789(Matrix4f.aClass399_4530);
				class259.aClass375_2871.set(0.0F, 0.0F, 0.0F, 0.0F);
				class259.aClass397_2875.set(0.0F, 0.0F, 0.0F);
				class259.aClass375_2869.set(0.0F, 0.0F, 0.0F, 0.0F);
				class259.aClass397_2872.set(0.0F, 0.0F, 0.0F);
				class259.anInterface29_2863 = toolkit.anInterface29_9361;
				class259.aClass399_2865.toIdentity();
				class259.anInt2880 = i_140_;
				class259.anInt2879 = i_141_ - i_140_ + 1;
				class259.anInt2878 = 0;
				class259.anInt2877 = i_139_ / 3;
				if (toolkit.aBool9427) {
					toolkit.method2473(false);
					class259.method4775(false);
					toolkit.method2473(true);
				} else {
					class259.method4775(false);
				}
			}
		}
	}

	@Override
	public void method2216(int i, int i_112_, int i_113_, boolean[][] bools, boolean bool, int i_114_) {
		if (aClass480Array8714 != null) {
			int i_115_ = i_113_ + i_113_ + 1;
			i_115_ *= i_115_;
			if (anIntArray8749.length < i_115_) {
				anIntArray8749 = new int[i_115_];
			}
			int i_116_ = i - i_113_;
			int i_117_ = i_116_;
			if (i_116_ < 0) {
				i_116_ = 0;
			}
			int i_118_ = i_112_ - i_113_;
			int i_119_ = i_118_;
			if (i_118_ < 0) {
				i_118_ = 0;
			}
			int i_120_ = i + i_113_;
			if (i_120_ > width * 767658255 - 1) {
				i_120_ = width * 767658255 - 1;
			}
			int i_121_ = i_112_ + i_113_;
			if (i_121_ > length * 295124605 - 1) {
				i_121_ = length * 295124605 - 1;
			}
			anInt8748 = 0;
			for (int i_122_ = i_116_; i_122_ <= i_120_; i_122_++) {
				boolean[] bools_123_ = bools[i_122_ - i_117_];
				for (int i_124_ = i_118_; i_124_ <= i_121_; i_124_++) {
					if (bools_123_[i_124_ - i_119_]) {
						anIntArray8749[anInt8748++] = i_124_ * width * 767658255 + i_122_;
					}
				}
			}
			ByteBuffer bytebuffer = toolkit.aByteBuffer9279;
			bytebuffer.clear();
			for (Linkable element : aClass480Array8714) {
				Class480_Sub34 class480_sub34 = (Class480_Sub34) element;
				class480_sub34.method16095(anIntArray8749, anInt8748);
			}
			int i_126_ = bytebuffer.position();
			Class259 class259 = toolkit.aClass259_9334;
			if (i_126_ != 0) {
				NativeElementArrayBuffer interface36 = toolkit.method14618(i_126_ / 2);
				interface36.read(0, i_126_, toolkit.aLong9268);
				toolkit.method14710();
				toolkit.method14620(0, anInterface32_8731);
				toolkit.method14748(interface36);
				class259.method4789(Matrix4f.aClass399_4530);
				if (toolkit.anInt9390 > 0) {
					class259.aClass397_2875.set((toolkit.anInt9293 >> 16 & 0xff) / 255.0F,
							(toolkit.anInt9293 >> 8 & 0xff) / 255.0F, (toolkit.anInt9293 >> 0 & 0xff) / 255.0F);
					class259.aClass375_2871.set(0.0F, 0.0F, 1.0F, -toolkit.aFloat9392);
					class259.aClass375_2871.method6163(toolkit.aClass399_9283);
					class259.aClass375_2871.multiply(1.0F / (toolkit.aFloat9393 - toolkit.aFloat9392));
				} else {
					class259.aClass375_2871.set(0.0F, 0.0F, 0.0F, 0.0F);
					class259.aClass397_2875.set(0.0F, 0.0F, 0.0F);
				}
				if ((anInt8732 & 0x7) == 0) {
					int i_127_ = 0;
					for (int i_128_ = 0; i_128_ < aClass480Array8714.length; i_128_++) {
						Class480_Sub34 class480_sub34 = (Class480_Sub34) aClass480Array8714[i_128_];
						if (class480_sub34.anInt10242 != 0) {
							if (toolkit.aBool9349) {
								toolkit.method2804(0, class480_sub34.aClass150_10245);
								class259.aClass375_2869.set(0.0F, 1.0F, 0.0F, toolkit.anInt9385
										+ class480_sub34.aClass150_10245.intensity * -1801120163 / 255.0F
										* (class480_sub34.aClass150_10245.scale * -329760297));
								class259.aClass375_2869
										.multiply(1.0F / (class480_sub34.aClass150_10245.scale * -329760297));
								class259.aClass397_2872.set(
										(class480_sub34.aClass150_10245.colour * 2139661437 >> 16 & 0xff) / 255.0F,
										(class480_sub34.aClass150_10245.colour * 2139661437 >> 8 & 0xff) / 255.0F,
										(class480_sub34.aClass150_10245.colour * 2139661437 >> 0 & 0xff) / 255.0F);
							} else {
								class259.aClass375_2869.set(0.0F, 0.0F, 0.0F, 0.0F);
								class259.aClass397_2872.set(0.0F, 0.0F, 0.0F);
							}
							boolean bool_129_ = false;
							if (class480_sub34.anInt10241 != -1) {
								TextureMetrics class141 = toolkit.metricsList.get(class480_sub34.anInt10241);
								class259.anInterface29_2863 = toolkit.aClass321_9360.get(class141);
								bool_129_ = !Class279.method5212(class141.aByte1719);
							} else {
								class259.anInterface29_2863 = toolkit.anInterface29_9361;
							}
							toolkit.method14620(1, class480_sub34.anInterface32_10239);
							toolkit.method14697(aClass323_8733);
							class259.aClass399_2865.method6551(1.0F / class480_sub34.aFloat10234,
									1.0F / class480_sub34.aFloat10234, 1.0F, 1.0F);
							class259.anInt2880 = class480_sub34.anInt10236;
							class259.anInt2879 = class480_sub34.anInt10244 - class480_sub34.anInt10236 + 1;
							class259.anInt2878 = i_127_;
							class259.anInt2877 = class480_sub34.anInt10242 / 3;
							class259.method4775(bool_129_);
							i_127_ += class480_sub34.anInt10242;
						}
					}
				} else {
					class259.aClass397_2859.set(toolkit.aFloatArray9298[0], toolkit.aFloatArray9298[1],
							toolkit.aFloatArray9298[2]);
					class259.aClass397_2874.set(toolkit.aFloat9344 * toolkit.aFloat9340, toolkit.aFloat9344
							* toolkit.aFloat9321, toolkit.aFloat9344 * toolkit.aFloat9320);
					class259.aClass397_2873.set(-toolkit.aFloat9345 * toolkit.aFloat9340, -toolkit.aFloat9345
							* toolkit.aFloat9321, -toolkit.aFloat9345 * toolkit.aFloat9320);
					class259.aClass397_2870.set(toolkit.aFloat9331 * toolkit.aFloat9340, toolkit.aFloat9331
							* toolkit.aFloat9321, toolkit.aFloat9331 * toolkit.aFloat9320);
					int i_130_ = 0;
					for (int i_131_ = 0; i_131_ < aClass480Array8714.length; i_131_++) {
						Class480_Sub34 class480_sub34 = (Class480_Sub34) aClass480Array8714[i_131_];
						if (class480_sub34.anInt10242 > 0) {
							if (toolkit.aBool9349) {
								toolkit.method2804(0, class480_sub34.aClass150_10245);
								float f = 0.15F;
								class259.aClass375_2869.set(0.0F, 1.0F / (class480_sub34.aClass150_10245.scale
										* -329760297 * f), 0.0F, 256.0F / (class480_sub34.aClass150_10245.scale
										* -329760297 * f));
								class259.aClass397_2872.set(
										(class480_sub34.aClass150_10245.colour * 2139661437 >> 16 & 0xff) / 255.0F,
										(class480_sub34.aClass150_10245.colour * 2139661437 >> 8 & 0xff) / 255.0F,
										(class480_sub34.aClass150_10245.colour * 2139661437 >> 0 & 0xff) / 255.0F);
							} else {
								class259.aClass375_2869.set(0.0F, 0.0F, 0.0F, 0.0F);
								class259.aClass397_2872.set(0.0F, 0.0F, 0.0F);
							}
							byte i_132_ = 11;
							if (class480_sub34.anInt10241 != -1) {
								TextureMetrics class141 = toolkit.metricsList.get(class480_sub34.anInt10241);
								i_132_ = class141.aByte1719;
								class259.anInterface29_2863 = toolkit.aClass321_9360.get(class141);
								class259.method4773(class141.aByte1720);
							} else {
								class259.anInterface29_2863 = toolkit.anInterface29_9361;
							}
							toolkit.method14620(1, class480_sub34.anInterface32_10239);
							toolkit.method14697(aClass323_8733);
							class259.aClass399_2865.method6551(1.0F / class480_sub34.aFloat10234,
									1.0F / class480_sub34.aFloat10234, 1.0F, 1.0F);
							class259.anInt2880 = class480_sub34.anInt10236;
							class259.anInt2879 = class480_sub34.anInt10244 - class480_sub34.anInt10236 + 1;
							class259.anInt2878 = i_130_;
							class259.anInt2877 = class480_sub34.anInt10242 / 3;
							switch (i_132_) {
								case 1:
									class259.aClass397_2876.set(toolkit.aClass399_9323.array[12],
											toolkit.aClass399_9323.array[13], toolkit.aClass399_9323.array[14]);
									if (toolkit.aBool9349) {
										class259.method4780();
									} else {
										class259.method4777(0);
									}
									break;
								case 6:
									class259.method4775(!Class279.method5212(i_132_));
									break;
								default:
									if (toolkit.aBool9349) {
										class259.method4772();
									} else {
										class259.method4776(0);
									}
									break;
								case 2:
								case 4:
								case 8:
								case 9:
									if (!toolkit.fixedFunction && (anInt8732 & 0x8) != 0
											&& toolkit.aClass302_Sub1_Sub1_9374.method17393((short) 7874)) {
										Class302_Sub1_Sub1 class302_sub1_sub1 = toolkit.aClass302_Sub1_Sub1_9374;
										if (i_132_ == 2) {
											class302_sub1_sub1 = toolkit.aClass302_Sub1_Sub1_9363;
										}
										class302_sub1_sub1.aClass399_11008.copyFrom(toolkit.aClass399_9303);
										class302_sub1_sub1.aClass399_11010
												.method6551(
														1.0F / (class480_sub34.aFloat10234 * (class480_sub34.aClass150_10245.anInt1848 * -1963415229)),
														1.0F / (class480_sub34.aFloat10234 * (class480_sub34.aClass150_10245.anInt1848 * -1963415229)),
														1.0F, 1.0F);
										class302_sub1_sub1.aClass397_11024.set(toolkit.aClass399_9323.array[12],
												toolkit.aClass399_9323.array[13], toolkit.aClass399_9323.array[14]);
										TextureMetrics class141 = toolkit.metricsList.get(class480_sub34.anInt10241);
										class302_sub1_sub1.anInt11023 = class141.aByte1720 * 525382417;
										class302_sub1_sub1.anInt11028 = class480_sub34.anInt10236 * -1081723803;
										class302_sub1_sub1.anInt11017 = (class480_sub34.anInt10244
												- class480_sub34.anInt10236 + 1)
												* -13563057;
										class302_sub1_sub1.anInt11030 = i_130_ * -1949750267;
										class302_sub1_sub1.anInt11031 = class480_sub34.anInt10242 / 3 * -1067048569;
										class302_sub1_sub1.aClass375_11021.method6170(class259.aClass375_2869);
										class302_sub1_sub1.aClass397_11018.copyFrom(class259.aClass397_2872);
										class302_sub1_sub1.aClass375_11025.method6170(class259.aClass375_2871);
										class302_sub1_sub1.aClass397_11029.copyFrom(class259.aClass397_2875);
										class302_sub1_sub1.method17395((byte) 0);
									} else {
										class259.method4776(0);
									}
									break;
								case 7:
									class259.aClass397_2876.set(toolkit.aClass399_9323.array[12],
											toolkit.aClass399_9323.array[13], toolkit.aClass399_9323.array[14]);
									class259.aClass399_2881.toIdentity();
									class259.anInterface39_2864 = toolkit.method14587();
									class259.method4788(0);
							}
							i_130_ += class480_sub34.anInt10242;
						}
					}
				}
			}
			if (!aClass644_8729.isEmpty()) {
				toolkit.method14893(128);
				toolkit.method14644(false);
				Class397 class397 = new Class397(class259.aClass397_2875);
				class259.aClass397_2875.set(0.0F, 0.0F, 0.0F);
				Iterator iterator = aClass644_8729.iterator();
				while (iterator.hasNext()) {
					Class480_Sub26 class480_sub26 = (Class480_Sub26) iterator.next();
					class480_sub26.method16024(class259, i, i_112_, i_113_, bools, bool);
				}
				class259.aClass397_2875.copyFrom(class397);
			}
			if (aClass322_8736 != null) {
				toolkit.method14893(1);
				toolkit.method14620(0, anInterface32_8731);
				toolkit.method14620(1, anInterface32_8713);
				toolkit.method14697(aClass323_8733);
				Matrix4f class399 = toolkit.aClass399_9324;
				class399.toIdentity();
				class399.array[13] = -1.0F;
				class259.method4789(class399);
				aClass322_8736.method5756(class259, i, i_112_, i_113_, bools, bool);
			}
		}
	}

	@Override
	public void method2224(int i, int i_13_, int[] is, int[] is_14_, int[] is_15_, int[] is_16_, int[] is_17_,
			int[] is_18_, int[] is_19_, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_, Class150 class150,
			boolean bool) {
		int i_24_ = is_20_.length;
		int[] is_25_ = new int[i_24_ * 3];
		int[] is_26_ = new int[i_24_ * 3];
		int[] is_27_ = new int[i_24_ * 3];
		int[] is_28_ = new int[i_24_ * 3];
		int[] is_29_ = new int[i_24_ * 3];
		int[] is_30_ = new int[i_24_ * 3];
		int[] is_31_ = is_14_ != null ? new int[i_24_ * 3] : null;
		int[] is_32_ = is_16_ != null ? new int[i_24_ * 3] : null;
		int i_33_ = 0;
		for (int i_34_ = 0; i_34_ < i_24_; i_34_++) {
			int i_35_ = is_17_[i_34_];
			int i_36_ = is_18_[i_34_];
			int i_37_ = is_19_[i_34_];
			is_25_[i_33_] = is[i_35_];
			is_26_[i_33_] = is_15_[i_35_];
			is_27_[i_33_] = is_20_[i_34_];
			is_29_[i_33_] = is_22_[i_34_];
			is_30_[i_33_] = is_23_[i_34_];
			is_28_[i_33_] = is_21_ != null ? is_21_[i_34_] : is_20_[i_34_];
			if (is_14_ != null) {
				is_31_[i_33_] = is_14_[i_35_];
			}
			if (is_16_ != null) {
				is_32_[i_33_] = is_16_[i_35_];
			}
			i_33_++;
			is_25_[i_33_] = is[i_36_];
			is_26_[i_33_] = is_15_[i_36_];
			is_27_[i_33_] = is_20_[i_34_];
			is_29_[i_33_] = is_22_[i_34_];
			is_30_[i_33_] = is_23_[i_34_];
			is_28_[i_33_] = is_21_ != null ? is_21_[i_34_] : is_20_[i_34_];
			if (is_14_ != null) {
				is_31_[i_33_] = is_14_[i_36_];
			}
			if (is_16_ != null) {
				is_32_[i_33_] = is_16_[i_36_];
			}
			i_33_++;
			is_25_[i_33_] = is[i_37_];
			is_26_[i_33_] = is_15_[i_37_];
			is_27_[i_33_] = is_20_[i_34_];
			is_29_[i_33_] = is_22_[i_34_];
			is_30_[i_33_] = is_23_[i_34_];
			is_28_[i_33_] = is_21_ != null ? is_21_[i_34_] : is_20_[i_34_];
			if (is_14_ != null) {
				is_31_[i_33_] = is_14_[i_37_];
			}
			if (is_16_ != null) {
				is_32_[i_33_] = is_16_[i_37_];
			}
			i_33_++;
		}
		addBlendedTile(i, i_13_, is_25_, is_31_, is_26_, is_32_, is_27_, is_28_, is_29_, is_30_, class150, bool);
	}

	void method14047(NativeShadow class480_sub31_sub12_sub1, int i, int i_2_) {
		int[] is = anIntArrayArrayArray8723[i][i_2_];
		int[] is_3_ = anIntArrayArrayArray8724[i][i_2_];
		int i_4_ = is.length;
		if (anIntArray8746.length < i_4_) {
			anIntArray8746 = new int[i_4_];
			anIntArray8747 = new int[i_4_];
		}
		for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
			anIntArray8746[i_5_] = is[i_5_] >> toolkit.shadowScale;
			anIntArray8747[i_5_] = is_3_[i_5_] >> toolkit.shadowScale;
		}
		int i_6_ = 0;
		while (i_6_ < i_4_) {
			int i_7_ = anIntArray8746[i_6_];
			int i_8_ = anIntArray8747[i_6_++];
			int i_9_ = anIntArray8746[i_6_];
			int i_10_ = anIntArray8747[i_6_++];
			int i_11_ = anIntArray8746[i_6_];
			int i_12_ = anIntArray8747[i_6_++];
			if ((i_7_ - i_9_) * (i_10_ - i_12_) - (i_10_ - i_8_) * (i_11_ - i_9_) > 0) {
				class480_sub31_sub12_sub1.fill(i_8_, i_10_, i_12_, i_7_, i_9_, i_11_);
			}
		}
	}

	void method14048() {
		anInterface32_8713 = toolkit.createArrayBuffer(false);
		anInterface32_8713.reallocate(anInt8715 * 4, 4);
		anInterface32_8713.read(0, anInt8715 * 4, toolkit.getAddress(aByteBuffer8722));
		anInterface32_8731 = toolkit.createArrayBuffer(false);
		anInterface32_8731.reallocate(anInt8715 * anInt8745, anInt8745);
		anInterface32_8731.read(0, anInt8715 * anInt8745, toolkit.getAddress(aByteBuffer8744));
		aByteBuffer8722.clear();
		aByteBuffer8722 = null;
		aByteBuffer8744.clear();
		aByteBuffer8744 = null;
		if ((anInt8732 & 0x7) != 0) {
			if (anIntArrayArrayArray8726 != null) {
				aClass323_8733 = toolkit.method14696(new Class320[] {
						new Class320(new Class316[] { Class316.aClass316_3, Class316.aClass316_9,
								Class316.aClass316_12, Class316.aClass316_1 }), new Class320(Class316.aClass316_2) });
			} else {
				aClass323_8733 = toolkit.method14696(new Class320[] {
						new Class320(
								new Class316[] { Class316.aClass316_3, Class316.aClass316_9, Class316.aClass316_1 }),
						new Class320(Class316.aClass316_2) });
			}
		} else if (anIntArrayArrayArray8726 != null) {
			aClass323_8733 = toolkit.method14696(new Class320[] {
					new Class320(new Class316[] { Class316.aClass316_3, Class316.aClass316_9, Class316.aClass316_12 }),
					new Class320(Class316.aClass316_2) });
		} else {
			aClass323_8733 = toolkit.method14696(new Class320[] {
					new Class320(new Class316[] { Class316.aClass316_3, Class316.aClass316_9 }),
					new Class320(Class316.aClass316_2) });
		}
		for (int i = 0; i < anInt8737; i++) {
			Class480_Sub34 class480_sub34 = (Class480_Sub34) aClass480Array8742[i];
			class480_sub34.method16100(anInt8715);
		}
		if (aClass322_8736 != null) {
			aClass322_8736.method5754();
		}
		method14049();
	}

	void method14049() {
		if ((anInt8712 & 0x2) == 0) {
			anIntArrayArrayArray8724 = null;
			anIntArrayArrayArray8723 = null;
			anIntArrayArrayArray8709 = null;
		}
		anIntArrayArrayArray8726 = null;
		anIntArrayArrayArray8740 = null;
		anIntArrayArrayArray8725 = null;
		aClass480_Sub34ArrayArrayArray8720 = null;
		aByteArrayArray8721 = null;
		aClass667_8743 = null;
		aClass480Array8742 = null;
		aFloatArrayArray8739 = null;
		aFloatArrayArray8738 = null;
		aFloatArrayArray8734 = null;
	}

	void method14050(int i, int i_48_, byte[][] is, Class480_Sub34[] class480_sub34s, HashTable class667,
			Class480_Sub34[] class480_sub34s_49_) {
		if (anIntArrayArrayArray8709[i][i_48_] != null) {
			Class480_Sub34[] class480_sub34s_50_ = aClass480_Sub34ArrayArrayArray8720[i][i_48_];
			int[] is_51_ = anIntArrayArrayArray8723[i][i_48_];
			int[] is_52_ = anIntArrayArrayArray8724[i][i_48_];
			int[] is_53_ = anIntArrayArrayArray8740[i][i_48_];
			int[] is_54_ = anIntArrayArrayArray8709[i][i_48_];
			int[] is_55_ = anIntArrayArrayArray8725 != null ? anIntArrayArrayArray8725[i][i_48_] : null;
			int[] is_56_ = anIntArrayArrayArray8726 != null ? anIntArrayArrayArray8726[i][i_48_] : null;
			if (is_53_ == null) {
				is_53_ = is_54_;
			}
			float f = aFloatArrayArray8734[i][i_48_];
			float f_57_ = aFloatArrayArray8738[i][i_48_];
			float f_58_ = aFloatArrayArray8739[i][i_48_];
			float f_59_ = aFloatArrayArray8734[i][i_48_ + 1];
			float f_60_ = aFloatArrayArray8738[i][i_48_ + 1];
			float f_61_ = aFloatArrayArray8739[i][i_48_ + 1];
			float f_62_ = aFloatArrayArray8734[i + 1][i_48_ + 1];
			float f_63_ = aFloatArrayArray8738[i + 1][i_48_ + 1];
			float f_64_ = aFloatArrayArray8739[i + 1][i_48_ + 1];
			float f_65_ = aFloatArrayArray8734[i + 1][i_48_];
			float f_66_ = aFloatArrayArray8738[i + 1][i_48_];
			float f_67_ = aFloatArrayArray8739[i + 1][i_48_];
			int i_68_ = is[i][i_48_] & 0xff;
			int i_69_ = is[i][i_48_ + 1] & 0xff;
			int i_70_ = is[i + 1][i_48_ + 1] & 0xff;
			int i_71_ = is[i + 1][i_48_] & 0xff;
			int i_72_ = 0;
			while_21_: for (int i_73_ = 0; i_73_ < is_54_.length; i_73_++) {
				Class480_Sub34 class480_sub34 = class480_sub34s_50_[i_73_];
				for (int i_74_ = 0; i_74_ < i_72_; i_74_++) {
					if (class480_sub34s[i_74_] == class480_sub34) {
						continue while_21_;
					}
				}
				class480_sub34s[i_72_++] = class480_sub34;
			}
			short[] is_75_ = aShortArrayArray8717[i_48_ * width * 767658255 + i] = new short[is_54_.length];
			for (int i_76_ = 0; i_76_ < is_54_.length; i_76_++) {
				int i_77_ = (i << tileScale * -333236347) + is_51_[i_76_];
				int i_78_ = (i_48_ << tileScale * -333236347) + is_52_[i_76_];
				int i_79_ = i_77_ >> anInt8741;
				int i_80_ = i_78_ >> anInt8741;
				int i_81_ = is_54_[i_76_];
				int i_82_ = is_53_[i_76_];
				int i_83_ = is_55_ != null ? is_55_[i_76_] : 0;
				long l = (long) i_82_ << 48 | (long) i_81_ << 32 | i_79_ << 16 | i_80_;
				int i_84_ = is_51_[i_76_];
				int i_85_ = is_52_[i_76_];
				int i_86_ = 74;
				int i_87_ = 0;
				float f_88_ = 1.0F;
				float f_89_;
				float f_90_;
				float f_91_;
				if (i_84_ == 0 && i_85_ == 0) {
					f_89_ = f;
					f_90_ = f_57_;
					f_91_ = f_58_;
					i_86_ -= i_68_;
				} else if (i_84_ == 0 && i_85_ == tileUnits * 1668096025) {
					f_89_ = f_59_;
					f_90_ = f_60_;
					f_91_ = f_61_;
					i_86_ -= i_69_;
				} else if (i_84_ == tileUnits * 1668096025 && i_85_ == tileUnits * 1668096025) {
					f_89_ = f_62_;
					f_90_ = f_63_;
					f_91_ = f_64_;
					i_86_ -= i_70_;
				} else if (i_84_ == tileUnits * 1668096025 && i_85_ == 0) {
					f_89_ = f_65_;
					f_90_ = f_66_;
					f_91_ = f_67_;
					i_86_ -= i_71_;
				} else {
					float f_92_ = (float) i_84_ / (float) (tileUnits * 1668096025);
					float f_93_ = (float) i_85_ / (float) (tileUnits * 1668096025);
					float f_94_ = f + (f_65_ - f) * f_92_;
					float f_95_ = f_57_ + (f_66_ - f_57_) * f_92_;
					float f_96_ = f_58_ + (f_67_ - f_58_) * f_92_;
					float f_97_ = f_59_ + (f_62_ - f_59_) * f_92_;
					float f_98_ = f_60_ + (f_63_ - f_60_) * f_92_;
					float f_99_ = f_61_ + (f_64_ - f_61_) * f_92_;
					f_89_ = f_94_ + (f_97_ - f_94_) * f_93_;
					f_90_ = f_95_ + (f_98_ - f_95_) * f_93_;
					f_91_ = f_96_ + (f_99_ - f_96_) * f_93_;
					int i_100_ = i_68_ + ((i_71_ - i_68_) * i_84_ >> tileScale * -333236347);
					int i_101_ = i_69_ + ((i_70_ - i_69_) * i_84_ >> tileScale * -333236347);
					i_86_ -= i_100_ + ((i_101_ - i_100_) * i_85_ >> tileScale * -333236347);
				}
				if (i_81_ != -1) {
					int i_102_ = (i_81_ & 0x7f) * i_86_ >> 7;
					if (i_102_ < 2) {
						i_102_ = 2;
					} else if (i_102_ > 126) {
						i_102_ = 126;
					}
					i_87_ = EnvironmentContext.anIntArray8169[i_81_ & 0xff80 | i_102_];
					if ((anInt8732 & 0x7) == 0) {
						f_88_ = toolkit.aFloatArray9298[0] * f_89_ + toolkit.aFloatArray9298[1] * f_90_
								+ toolkit.aFloatArray9298[2] * f_91_;
						f_88_ = toolkit.aFloat9331 + f_88_ * (f_88_ > 0.0F ? toolkit.aFloat9344 : toolkit.aFloat9345);
					}
				}
				Linkable class480 = null;
				if ((i_77_ & anInt8728 - 1) == 0 && (i_78_ & anInt8728 - 1) == 0) {
					class480 = class667.get(l);
				}
				int i_103_;
				if (class480 == null) {
					int i_104_;
					if (i_82_ != i_81_) {
						int i_105_ = (i_82_ & 0x7f) * i_86_ >> 7;
						if (i_105_ < 2) {
							i_105_ = 2;
						} else if (i_105_ > 126) {
							i_105_ = 126;
						}
						i_104_ = EnvironmentContext.anIntArray8169[i_82_ & 0xff80 | i_105_];
						if ((anInt8732 & 0x7) == 0) {
							float f_106_ = toolkit.aFloatArray9298[0] * f_89_ + toolkit.aFloatArray9298[1] * f_90_
									+ toolkit.aFloatArray9298[2] * f_91_;
							f_106_ = toolkit.aFloat9331 + f_88_
									* (f_88_ > 0.0F ? toolkit.aFloat9344 : toolkit.aFloat9345);
							int i_107_ = i_104_ >> 16 & 0xff;
							int i_108_ = i_104_ >> 8 & 0xff;
							int i_109_ = i_104_ & 0xff;
							i_107_ *= f_106_;
							if (i_107_ < 0) {
								i_107_ = 0;
							} else if (i_107_ > 255) {
								i_107_ = 255;
							}
							i_108_ *= f_106_;
							if (i_108_ < 0) {
								i_108_ = 0;
							} else if (i_108_ > 255) {
								i_108_ = 255;
							}
							i_109_ *= f_106_;
							if (i_109_ < 0) {
								i_109_ = 0;
							} else if (i_109_ > 255) {
								i_109_ = 255;
							}
							i_104_ = i_107_ << 16 | i_108_ << 8 | i_109_;
						}
					} else {
						i_104_ = i_87_;
					}
					aByteBuffer8744.putFloat(i_77_);
					aByteBuffer8744.putFloat(averageHeight(i_77_, i_78_) + i_83_);
					aByteBuffer8744.putFloat(i_78_);
					aByteBuffer8744.putFloat(i_77_);
					aByteBuffer8744.putFloat(i_78_);
					if (anIntArrayArrayArray8726 != null) {
						aByteBuffer8744.putFloat(is_56_ != null ? (float) (is_56_[i_76_] - 1) : 0.0F);
					}
					if ((anInt8732 & 0x7) != 0) {
						aByteBuffer8744.putFloat(f_89_);
						aByteBuffer8744.putFloat(f_90_);
						aByteBuffer8744.putFloat(f_91_);
					}
					if (toolkit.endianness == 0) {
						int i_110_ = i_104_ & ~0xff00ff;
						i_110_ |= (i_104_ & 0xff0000) >> 16;
						i_110_ |= (i_104_ & 0xff) << 16;
						i_104_ = i_110_;
					}
					aByteBuffer8722.putInt(~0xffffff | i_104_);
					i_103_ = anInt8715++;
					is_75_[i_76_] = (short) i_103_;
					if (i_81_ != -1) {
						class480_sub34s_49_[i_103_] = class480_sub34s_50_[i_76_];
					}
					class667.put(l, new LinkableShort(is_75_[i_76_]));
				} else {
					is_75_[i_76_] = ((LinkableShort) class480).value;
					i_103_ = is_75_[i_76_] & 0xffff;
					if (i_81_ != -1
							&& class480_sub34s_50_[i_76_].linkedKey * -4821875126325281949L < class480_sub34s_49_[i_103_].linkedKey
									* -4821875126325281949L) {
						class480_sub34s_49_[i_103_] = class480_sub34s_50_[i_76_];
					}
				}
				for (int i_111_ = 0; i_111_ < i_72_; i_111_++) {
					class480_sub34s[i_111_].method16094(i_103_, i_87_, i_86_, f_88_);
				}
				anInt8716++;
			}
		}
	}
}
