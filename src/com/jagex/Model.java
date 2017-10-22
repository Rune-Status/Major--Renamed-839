package com.jagex;

public abstract class Model {
	static final float aFloat1752 = ((float) Math.PI);
	protected boolean aBool1750 = false;
	public boolean aBool1751 = true;

	public abstract int minimumY();

	public abstract int maximumZ();

	public abstract int minimumX();

	public abstract int functionMask();
	
	public abstract void yaw(int i);

	public abstract void pitch(int angle);

	public abstract void roll(int i);

	abstract void endAnimation();

	public abstract void updateFunctionMask(int mask);

	public abstract void translate(int dx, int dy, int dz);

	abstract void transform(int type, int x, int y, int z);

	public abstract void scale(int x, int y, int z);

	public abstract void transform(Class405 class405, int i, boolean bool);

	public abstract void retexture(short original, short replacement);

	public abstract void recolour(short original, short replacement);

	abstract boolean startAnimation();

	public abstract int method2886();

	public abstract Model method2890(byte i, int mask, boolean bool);

	public abstract void method2895(int i);

	public abstract void method2899();

	public abstract void method2901(int i, int i_74_, Ground class120, Ground class120_75_, int i_76_, int i_77_,
			int i_78_);

	public final void method2906(FrameCollection class480_sub31_sub8, int i, FrameCollection class480_sub31_sub8_108_,
			int i_109_, int i_110_, int i_111_, int i_112_, int i_113_, boolean bool, int[] is) {
		if (i != -1) {
			method2903();

			if (!startAnimation()) {
				method2904();
			} else {
				AnimationFrame class142 = class480_sub31_sub8.frames[i];
				AnimationFrameBase base = class142.base;
				AnimationFrame class142_114_ = null;

				if (class480_sub31_sub8_108_ != null) {
					class142_114_ = class480_sub31_sub8_108_.frames[i_109_];

					if (class142_114_.base != base) {
						class142_114_ = null;
					}
				}

				method2909(base, class142, class142_114_, i_110_, i_111_, i_112_, null, false, bool, i_113_, is);
				endAnimation();
				method2904();
			}
		}
	}

	public final void method2907(FrameCollection class480_sub31_sub8, int i, FrameCollection class480_sub31_sub8_115_,
			int i_116_, int i_117_, int i_118_, FrameCollection class480_sub31_sub8_119_, int i_120_,
			FrameCollection class480_sub31_sub8_121_, int i_122_, int i_123_, int i_124_, boolean[] bools, boolean bool) {
		if (i != -1) {
			if (bools == null || i_120_ == -1) {
				method2950(class480_sub31_sub8, i, class480_sub31_sub8_115_, i_116_, i_117_, i_118_, 0, bool);
			} else {
				method2903();
				if (!startAnimation()) {
					method2904();
				} else {
					AnimationFrame class142 = class480_sub31_sub8.frames[i];
					AnimationFrameBase class480_sub10 = class142.base;
					AnimationFrame class142_125_ = null;
					if (class480_sub31_sub8_115_ != null) {
						class142_125_ = class480_sub31_sub8_115_.frames[i_116_];
						if (class142_125_.base != class480_sub10) {
							class142_125_ = null;
						}
					}

					method2909(class480_sub10, class142, class142_125_, i_117_, i_118_, 0, bools, false, bool, 65535,
							null);
					AnimationFrame class142_126_ = class480_sub31_sub8_119_.frames[i_120_];
					AnimationFrame class142_127_ = null;
					if (class480_sub31_sub8_121_ != null) {
						class142_127_ = class480_sub31_sub8_121_.frames[i_122_];
						if (class142_127_.base != class480_sub10) {
							class142_127_ = null;
						}
					}

					method3079(0, new int[0], 0, 0, 0, 0, bool);
					method2909(class142_126_.base, class142_126_, class142_127_, i_123_, i_124_, 0, bools, true, bool,
							65535, null);
					endAnimation();
					method2904();
				}
			}
		}
	}

	public abstract void method2917(Class405 class405, Class139 class139, int i);

	public abstract boolean method2918(int i, int i_181_, Class405 class405, boolean bool, int i_182_);

	public abstract int method2920();

	public abstract int method2923();

	public abstract int method2928();

	public abstract void method2929(int i);

	public abstract int method2931();

	public abstract int method2932();

	public abstract byte[] method2933();

	public abstract void method2935(byte i, byte[] is);

	public abstract void method2937(int i, int i_184_, int i_185_, int i_186_);

	public abstract boolean method2938();

	public abstract boolean method2939();

	public abstract boolean method2940();

	public abstract Class145[] method2942();

	public abstract Class115[] method2943();

	public abstract void method2944(Model class143_187_, int i, int i_188_, int i_189_, boolean bool);

	public final void method2950(FrameCollection class480_sub31_sub8, int i, FrameCollection class480_sub31_sub8_190_,
			int i_191_, int i_192_, int i_193_, int i_194_, boolean bool) {
		if (i != -1) {
			method2903();
			if (!startAnimation()) {
				method2904();
			} else {
				AnimationFrame class142 = class480_sub31_sub8.frames[i];
				AnimationFrameBase base = class142.base;
				AnimationFrame class142_195_ = null;

				if (class480_sub31_sub8_190_ != null) {
					class142_195_ = class480_sub31_sub8_190_.frames[i_191_];
					if (class142_195_.base != base) {
						class142_195_ = null;
					}
				}

				method2909(base, class142, class142_195_, i_192_, i_193_, i_194_, null, false, bool, 65535, null);
				endAnimation();
				method2904();
			}
		}
	}

	public abstract void method2962();

	public abstract int method2971();

	public abstract void method2974(int i);

	public final void method2979(FrameCollection collection, int id) {
		if (id != -1) {
			method2903();

			if (!startAnimation()) {
				method2904();
			} else {
				AnimationFrame frame = collection.frames[id];
				AnimationFrameBase base = frame.base;

				for (int transformation = 0; transformation < frame.transformationCount; transformation++) {
					short index = frame.transformationIndices[transformation];
					if (base.aBoolArray10041[index]) {
						if (frame.skippedReferences[transformation] != -1) {
							transform(0, 0, 0, 0);
						}

						transform(base.transformationTypes[index], frame.transformationX[transformation],
								frame.transformationY[transformation], frame.transformationZ[transformation]);
					}
				}

				endAnimation();
				method2904();
			}
		}
	}

	public abstract int method3016();

	public abstract Shadow method3018(Shadow shadow);

	public abstract void method3045();

	public abstract void method3063(Class405 class405);

	float[] method2884(int i, int i_0_, int i_1_, int i_2_, float f, float f_3_, float f_4_) {
		float[] fs = new float[9];
		float[] fs_5_ = new float[9];
		float f_6_ = (float) Math.cos(i_2_ * 0.024543693F);
		float f_7_ = (float) Math.sin(i_2_ * 0.024543693F);
		float f_8_ = 1.0F - f_6_;
		fs[0] = f_6_;
		fs[1] = 0.0F;
		fs[2] = f_7_;
		fs[3] = 0.0F;
		fs[4] = 1.0F;
		fs[5] = 0.0F;
		fs[6] = -f_7_;
		fs[7] = 0.0F;
		fs[8] = f_6_;
		float[] fs_9_ = new float[9];
		float f_10_ = 1.0F;
		float f_11_ = 0.0F;
		f_6_ = i_0_ / 32767.0F;
		f_7_ = -(float) Math.sqrt(1.0F - f_6_ * f_6_);
		f_8_ = 1.0F - f_6_;
		float f_12_ = (float) Math.sqrt(i * i + i_1_ * i_1_);
		if (f_12_ == 0.0F && f_6_ == 0.0F) {
			fs_5_ = fs;
		} else {
			if (f_12_ != 0.0F) {
				f_10_ = -i_1_ / f_12_;
				f_11_ = i / f_12_;
			}
			fs_9_[0] = f_6_ + f_10_ * f_10_ * f_8_;
			fs_9_[1] = f_11_ * f_7_;
			fs_9_[2] = f_11_ * f_10_ * f_8_;
			fs_9_[3] = -f_11_ * f_7_;
			fs_9_[4] = f_6_;
			fs_9_[5] = f_10_ * f_7_;
			fs_9_[6] = f_10_ * f_11_ * f_8_;
			fs_9_[7] = -f_10_ * f_7_;
			fs_9_[8] = f_6_ + f_11_ * f_11_ * f_8_;
			fs_5_[0] = fs[0] * fs_9_[0] + fs[1] * fs_9_[3] + fs[2] * fs_9_[6];
			fs_5_[1] = fs[0] * fs_9_[1] + fs[1] * fs_9_[4] + fs[2] * fs_9_[7];
			fs_5_[2] = fs[0] * fs_9_[2] + fs[1] * fs_9_[5] + fs[2] * fs_9_[8];
			fs_5_[3] = fs[3] * fs_9_[0] + fs[4] * fs_9_[3] + fs[5] * fs_9_[6];
			fs_5_[4] = fs[3] * fs_9_[1] + fs[4] * fs_9_[4] + fs[5] * fs_9_[7];
			fs_5_[5] = fs[3] * fs_9_[2] + fs[4] * fs_9_[5] + fs[5] * fs_9_[8];
			fs_5_[6] = fs[6] * fs_9_[0] + fs[7] * fs_9_[3] + fs[8] * fs_9_[6];
			fs_5_[7] = fs[6] * fs_9_[1] + fs[7] * fs_9_[4] + fs[8] * fs_9_[7];
			fs_5_[8] = fs[6] * fs_9_[2] + fs[7] * fs_9_[5] + fs[8] * fs_9_[8];
		}
		fs_5_[0] *= f;
		fs_5_[1] *= f;
		fs_5_[2] *= f;
		fs_5_[3] *= f_3_;
		fs_5_[4] *= f_3_;
		fs_5_[5] *= f_3_;
		fs_5_[6] *= f_4_;
		fs_5_[7] *= f_4_;
		fs_5_[8] *= f_4_;
		return fs_5_;
	}

	void method2885(int i, int i_13_, int i_14_, int i_15_, int i_16_, int i_17_, float[] fs, float f, int i_18_,
			float f_19_, float[] fs_20_) {
		i -= i_15_;
		i_13_ -= i_16_;
		i_14_ -= i_17_;
		float f_21_ = i * fs[0] + i_13_ * fs[1] + i_14_ * fs[2];
		float f_22_ = i * fs[3] + i_13_ * fs[4] + i_14_ * fs[5];
		float f_23_ = i * fs[6] + i_13_ * fs[7] + i_14_ * fs[8];
		float f_24_ = (float) Math.atan2(f_21_, f_23_) / 6.2831855F + 0.5F;
		if (f != 1.0F) {
			f_24_ *= f;
		}
		float f_25_ = f_22_ + 0.5F + f_19_;
		if (i_18_ == 1) {
			float f_26_ = f_24_;
			f_24_ = -f_25_;
			f_25_ = f_26_;
		} else if (i_18_ == 2) {
			f_24_ = -f_24_;
			f_25_ = -f_25_;
		} else if (i_18_ == 3) {
			float f_27_ = f_24_;
			f_24_ = f_25_;
			f_25_ = -f_27_;
		}
		fs_20_[0] = f_24_;
		fs_20_[1] = f_25_;
	}

	void method2887(int i, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_, float[] fs, int i_34_,
			float f, float f_35_, float f_36_, float[] fs_37_) {
		i -= i_30_;
		i_28_ -= i_31_;
		i_29_ -= i_32_;
		float f_38_ = i * fs[0] + i_28_ * fs[1] + i_29_ * fs[2];
		float f_39_ = i * fs[3] + i_28_ * fs[4] + i_29_ * fs[5];
		float f_40_ = i * fs[6] + i_28_ * fs[7] + i_29_ * fs[8];
		float f_41_;
		float f_42_;
		if (i_33_ == 0) {
			f_41_ = f_38_ + f + 0.5F;
			f_42_ = -f_40_ + f_36_ + 0.5F;
		} else if (i_33_ == 1) {
			f_41_ = f_38_ + f + 0.5F;
			f_42_ = f_40_ + f_36_ + 0.5F;
		} else if (i_33_ == 2) {
			f_41_ = -f_38_ + f + 0.5F;
			f_42_ = -f_39_ + f_35_ + 0.5F;
		} else if (i_33_ == 3) {
			f_41_ = f_38_ + f + 0.5F;
			f_42_ = -f_39_ + f_35_ + 0.5F;
		} else if (i_33_ == 4) {
			f_41_ = f_40_ + f_36_ + 0.5F;
			f_42_ = -f_39_ + f_35_ + 0.5F;
		} else {
			f_41_ = -f_40_ + f_36_ + 0.5F;
			f_42_ = -f_39_ + f_35_ + 0.5F;
		}
		if (i_34_ == 1) {
			float f_43_ = f_41_;
			f_41_ = -f_42_;
			f_42_ = f_43_;
		} else if (i_34_ == 2) {
			f_41_ = -f_41_;
			f_42_ = -f_42_;
		} else if (i_34_ == 3) {
			float f_44_ = f_41_;
			f_41_ = f_42_;
			f_42_ = -f_44_;
		}
		fs_37_[0] = f_41_;
		fs_37_[1] = f_42_;
	}

	Class135 method2888(BaseModel class144, int[] is, int i) {
		int[] is_45_ = null;
		int[] is_46_ = null;
		int[] is_47_ = null;
		float[][] fs = null;
		if (class144.aShortArray1778 != null) {
			int i_48_ = class144.texturedFaceCount;
			int[] is_49_ = new int[i_48_];
			int[] is_50_ = new int[i_48_];
			int[] is_51_ = new int[i_48_];
			int[] is_52_ = new int[i_48_];
			int[] is_53_ = new int[i_48_];
			int[] is_54_ = new int[i_48_];
			for (int i_55_ = 0; i_55_ < i_48_; i_55_++) {
				is_49_[i_55_] = 2147483647;
				is_50_[i_55_] = -2147483647;
				is_51_[i_55_] = 2147483647;
				is_52_[i_55_] = -2147483647;
				is_53_[i_55_] = 2147483647;
				is_54_[i_55_] = -2147483647;
			}
			for (int i_56_ = 0; i_56_ < i; i_56_++) {
				int i_57_ = is[i_56_];
				short i_58_ = class144.aShortArray1778[i_57_];
				if (i_58_ > -1 && i_58_ < 32766) {
					for (int i_59_ = 0; i_59_ < 3; i_59_++) {
						short i_60_;
						if (i_59_ == 0) {
							i_60_ = class144.aShortArray1769[i_57_];
						} else if (i_59_ == 1) {
							i_60_ = class144.aShortArray1770[i_57_];
						} else {
							i_60_ = class144.aShortArray1766[i_57_];
						}
						int i_61_ = class144.vertexX[i_60_];
						int i_62_ = class144.vertexY[i_60_];
						int i_63_ = class144.vertexZ[i_60_];
						if (i_61_ < is_49_[i_58_]) {
							is_49_[i_58_] = i_61_;
						}
						if (i_61_ > is_50_[i_58_]) {
							is_50_[i_58_] = i_61_;
						}
						if (i_62_ < is_51_[i_58_]) {
							is_51_[i_58_] = i_62_;
						}
						if (i_62_ > is_52_[i_58_]) {
							is_52_[i_58_] = i_62_;
						}
						if (i_63_ < is_53_[i_58_]) {
							is_53_[i_58_] = i_63_;
						}
						if (i_63_ > is_54_[i_58_]) {
							is_54_[i_58_] = i_63_;
						}
					}
				}
			}
			is_45_ = new int[i_48_];
			is_46_ = new int[i_48_];
			is_47_ = new int[i_48_];
			fs = new float[i_48_][];
			for (int i_64_ = 0; i_64_ < i_48_; i_64_++) {
				byte i_65_ = class144.aByteArray1787[i_64_];
				if (i_65_ > 0) {
					is_45_[i_64_] = (is_49_[i_64_] + is_50_[i_64_]) / 2;
					is_46_[i_64_] = (is_51_[i_64_] + is_52_[i_64_]) / 2;
					is_47_[i_64_] = (is_53_[i_64_] + is_54_[i_64_]) / 2;
					float f;
					float f_66_;
					float f_67_;
					if (i_65_ == 1) {
						int i_68_ = class144.anIntArray1791[i_64_];
						if (i_68_ == 0) {
							f = 1.0F;
							f_67_ = 1.0F;
						} else if (i_68_ > 0) {
							f = 1.0F;
							f_67_ = i_68_ / 1024.0F;
						} else {
							f_67_ = 1.0F;
							f = -i_68_ / 1024.0F;
						}
						f_66_ = 64.0F / class144.anIntArray1792[i_64_];
					} else if (i_65_ == 2) {
						f = 64.0F / class144.anIntArray1791[i_64_];
						f_66_ = 64.0F / class144.anIntArray1792[i_64_];
						f_67_ = 64.0F / class144.anIntArray1760[i_64_];
					} else {
						f = class144.anIntArray1791[i_64_] / 1024.0F;
						f_66_ = class144.anIntArray1792[i_64_] / 1024.0F;
						f_67_ = class144.anIntArray1760[i_64_] / 1024.0F;
					}
					fs[i_64_] = method2884(class144.aShortArray1785[i_64_], class144.aShortArray1789[i_64_],
							class144.aShortArray1801[i_64_], class144.aByteArray1799[i_64_] & 0xff, f, f_66_, f_67_);
				}
			}
		}
		return new Class135(this, is_45_, is_46_, is_47_, fs);
	}

	void method2902(Ground class120, int i, int i_79_, int i_80_, int i_81_, int i_82_, int i_83_, int i_84_) {
		int i_87_ = -i_81_ / 2;
		int i_88_ = -i_82_ / 2;
		int i_89_ = class120.method2206(i + i_87_, i_80_ + i_88_, -1076798867);
		int i_90_ = i_81_ / 2;
		int i_91_ = -i_82_ / 2;
		int i_92_ = class120.method2206(i + i_90_, i_80_ + i_91_, -122842264);
		int i_93_ = -i_81_ / 2;
		int i_94_ = i_82_ / 2;
		int i_95_ = class120.method2206(i + i_93_, i_80_ + i_94_, 305742434);
		int i_96_ = i_81_ / 2;
		int i_97_ = i_82_ / 2;
		int i_98_ = class120.method2206(i + i_96_, i_80_ + i_97_, -905154686);
		int i_99_ = i_89_ < i_92_ ? i_89_ : i_92_;
		int i_100_ = i_95_ < i_98_ ? i_95_ : i_98_;
		int i_101_ = i_92_ < i_98_ ? i_92_ : i_98_;
		int i_102_ = i_89_ < i_95_ ? i_89_ : i_95_;
		if (i_82_ != 0) {
			int i_103_ = (int) (Math.atan2(i_99_ - i_100_, i_82_) * 2607.5945876176133) & 0x3fff;
			if (i_103_ != 0) {
				if (i_83_ != 0) {
					if (i_103_ > 8192) {
						int i_104_ = 16384 - i_83_;
						if (i_103_ < i_104_) {
							i_103_ = i_104_;
						}
					} else if (i_103_ > i_83_) {
						i_103_ = i_83_;
					}
				}
				pitch(i_103_);
			}
		}
		if (i_81_ != 0) {
			int i_105_ = (int) (Math.atan2(i_102_ - i_101_, i_81_) * 2607.5945876176133) & 0x3fff;
			if (i_105_ != 0) {
				if (i_84_ != 0) {
					if (i_105_ > 8192) {
						int i_106_ = 16384 - i_84_;
						if (i_105_ < i_106_) {
							i_105_ = i_106_;
						}
					} else if (i_105_ > i_84_) {
						i_105_ = i_84_;
					}
				}
				roll(i_105_);
			}
		}
		int i_107_ = i_89_ + i_98_;
		if (i_92_ + i_95_ < i_107_) {
			i_107_ = i_92_ + i_95_;
		}
		i_107_ = (i_107_ >> 1) - i_79_;
		if (i_107_ != 0) {
			translate(0, i_107_, 0);
		}
	}

	abstract void method2903();

	abstract void method2904();

	void method2909(AnimationFrameBase base, AnimationFrame class142, AnimationFrame class142_128_, int i, int i_129_,
			int i_130_, boolean[] bools, boolean bool, boolean bool_131_, int i_132_, int[] is) {
		if (class142_128_ == null || i == 0) {
			for (int transformation = 0; transformation < class142.transformationCount; transformation++) {
				short indices = class142.transformationIndices[transformation];
				if (bools == null || bools[indices] == bool || base.transformationTypes[indices] == 0) {
					short skipped = class142.skippedReferences[transformation];
					if (skipped != -1) {
						method2910(0, base.labels[skipped], 0, 0, 0, i_130_, bool_131_, i_132_
								& base.anIntArray10042[skipped], is);
					}

					method2910(base.transformationTypes[indices], base.labels[indices],
							class142.transformationX[transformation], class142.transformationY[transformation],
							class142.transformationZ[transformation], i_130_, bool_131_, i_132_
									& base.anIntArray10042[indices], is);
				}
			}
		} else {
			int i_136_ = 0;
			int i_137_ = 0;
			for (int index = 0; index < base.count * -1475031283; index++) {
				boolean bool_139_ = false;
				if (i_136_ < class142.transformationCount && class142.transformationIndices[i_136_] == index) {
					bool_139_ = true;
				}

				boolean bool_140_ = false;
				if (i_137_ < class142_128_.transformationCount && class142_128_.transformationIndices[i_137_] == index) {
					bool_140_ = true;
				}

				if (bool_139_ || bool_140_) {
					if (bools != null && bools[index] != bool && base.transformationTypes[index] != 0) {
						if (bool_139_) {
							i_136_++;
						}
						if (bool_140_) {
							i_137_++;
						}
					} else {
						int defaultTransformation = 0;
						int type = base.transformationTypes[index];
						if (type == 3 || type == 10) {
							defaultTransformation = 128;
						}

						int dx;
						int dy;
						int dz;
						short skipped;
						byte flags;

						if (bool_139_) {
							dx = class142.transformationX[i_136_];
							dy = class142.transformationY[i_136_];
							dz = class142.transformationZ[i_136_];
							skipped = class142.skippedReferences[i_136_];
							flags = class142.transformationFlags[i_136_];
							i_136_++;
						} else {
							dx = defaultTransformation;
							dy = defaultTransformation;
							dz = defaultTransformation;
							skipped = (short) -1;
							flags = (byte) 0;
						}

						int i_148_;
						int i_149_;
						int i_150_;
						short i_151_;
						byte i_152_;

						if (bool_140_) {
							i_148_ = class142_128_.transformationX[i_137_];
							i_149_ = class142_128_.transformationY[i_137_];
							i_150_ = class142_128_.transformationZ[i_137_];
							i_151_ = class142_128_.skippedReferences[i_137_];
							i_152_ = class142_128_.transformationFlags[i_137_];
							i_137_++;
						} else {
							i_148_ = defaultTransformation;
							i_149_ = defaultTransformation;
							i_150_ = defaultTransformation;
							i_151_ = (short) -1;
							i_152_ = (byte) 0;
						}

						int i_153_;
						int i_154_;
						int i_155_;
						if ((flags & 0x2) != 0 || (i_152_ & 0x1) != 0) {
							i_153_ = dx;
							i_154_ = dy;
							i_155_ = dz;
						} else if (type == 2) {
							int i_156_ = i_148_ - dx & 0x3fff;
							int i_157_ = i_149_ - dy & 0x3fff;
							int i_158_ = i_150_ - dz & 0x3fff;
							if (i_156_ >= 8192) {
								i_156_ -= 16384;
							}
							if (i_157_ >= 8192) {
								i_157_ -= 16384;
							}
							if (i_158_ >= 8192) {
								i_158_ -= 16384;
							}
							i_153_ = dx + i_156_ * i / i_129_ & 0x3fff;
							i_154_ = dy + i_157_ * i / i_129_ & 0x3fff;
							i_155_ = dz + i_158_ * i / i_129_ & 0x3fff;
						} else if (type == 9) {
							int i_159_ = i_148_ - dx & 0x3fff;
							if (i_159_ >= 8192) {
								i_159_ -= 16384;
							}
							i_153_ = dx + i_159_ * i / i_129_ & 0x3fff;
							i_155_ = 0;
							i_154_ = 0;
						} else if (type == 7) {
							int i_160_ = i_148_ - dx & 0x3f;
							if (i_160_ >= 32) {
								i_160_ -= 64;
							}
							i_153_ = dx + i_160_ * i / i_129_ & 0x3f;
							i_154_ = dy + (i_149_ - dy) * i / i_129_;
							i_155_ = dz + (i_150_ - dz) * i / i_129_;
						} else {
							i_153_ = dx + (i_148_ - dx) * i / i_129_;
							i_154_ = dy + (i_149_ - dy) * i / i_129_;
							i_155_ = dz + (i_150_ - dz) * i / i_129_;
						}
						if (skipped != -1) {
							method2910(0, base.labels[skipped], 0, 0, 0, i_130_, bool_131_, i_132_
									& base.anIntArray10042[skipped], is);
						} else if (i_151_ != -1) {
							method2910(0, base.labels[i_151_], 0, 0, 0, i_130_, bool_131_, i_132_
									& base.anIntArray10042[i_151_], is);
						}
						method2910(type, base.labels[index], i_153_, i_154_, i_155_, i_130_, bool_131_, i_132_
								& base.anIntArray10042[index], is);
					}
				}
			}
		}
	}

	void method2910(int type, int[] labels, int dx, int dy, int dz, int i_164_, boolean bool, int i_165_, int[] is_166_) {
		if (i_164_ == 1) {
			if (type == 0 || type == 1) {
				int tmp = -dx;
				dx = dz;
				dz = tmp;
			} else if (type == 3) {
				int tmp = dx;
				dx = dz;
				dz = tmp;
			} else if (type == 2) {
				int tmp = dx;
				dx = -dz & 0x3fff;
				dz = tmp & 0x3fff;
			}
		} else if (i_164_ == 2) {
			if (type == 0 || type == 1) {
				dx = -dx;
				dz = -dz;
			} else if (type == 2) {
				dx = -dx & 0x3fff;
				dz = -dz & 0x3fff;
			}
		} else if (i_164_ == 3) {
			if (type == 0 || type == 1) {
				int i_170_ = dx;
				dx = -dz;
				dz = i_170_;
			} else if (type == 3) {
				int i_171_ = dx;
				dx = dz;
				dz = i_171_;
			} else if (type == 2) {
				int i_172_ = dx;
				dx = dz & 0x3fff;
				dz = -i_172_ & 0x3fff;
			}
		}

		if (i_165_ != 65535) {
			method2913(type, labels, dx, dy, dz, bool, i_165_, is_166_);
		} else {
			method3079(type, labels, dx, dy, dz, i_164_, bool);
		}
	}

	abstract void method2913(int type, int[] labels, int dx, int dy, int dz, boolean bool, int i_176_, int[] is_177_);

	int method2967(float f, float f_196_, float f_197_) {
		float f_198_ = f < 0.0F ? -f : f;
		float f_199_ = f_196_ < 0.0F ? -f_196_ : f_196_;
		float f_200_ = f_197_ < 0.0F ? -f_197_ : f_197_;

		if (f_199_ > f_198_ && f_199_ > f_200_) {
			if (f_196_ > 0.0F) {
				return 0;
			}

			return 1;
		} else if (f_200_ > f_198_ && f_200_ > f_199_) {
			if (f_197_ > 0.0F) {
				return 2;
			}

			return 3;
		} else if (f > 0.0F) {
			return 4;
		}

		return 5;
	}

	void method3010(int i, int i_204_, int i_205_, int i_206_, int i_207_, int i_208_, float[] fs, int i_209_, float f,
			float[] fs_210_) {
		i -= i_206_;
		i_204_ -= i_207_;
		i_205_ -= i_208_;

		float f_211_ = i * fs[0] + i_204_ * fs[1] + i_205_ * fs[2];
		float f_212_ = i * fs[3] + i_204_ * fs[4] + i_205_ * fs[5];
		float f_213_ = i * fs[6] + i_204_ * fs[7] + i_205_ * fs[8];

		float f_214_ = (float) Math.sqrt(f_211_ * f_211_ + f_212_ * f_212_ + f_213_ * f_213_);
		float f_215_ = (float) Math.atan2(f_211_, f_213_) / 6.2831855F + 0.5F;
		float f_216_ = (float) Math.asin(f_212_ / f_214_) / ((float) Math.PI) + 0.5F + f;

		if (i_209_ == 1) {
			float f_217_ = f_215_;
			f_215_ = -f_216_;
			f_216_ = f_217_;
		} else if (i_209_ == 2) {
			f_215_ = -f_215_;
			f_216_ = -f_216_;
		} else if (i_209_ == 3) {
			float f_218_ = f_215_;
			f_215_ = f_216_;
			f_216_ = -f_218_;
		}

		fs_210_[0] = f_215_;
		fs_210_[1] = f_216_;
	}

	abstract void method3079(int i, int[] is, int i_219_, int i_220_, int i_221_, int i_222_, boolean bool);

}