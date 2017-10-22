package com.jagex;

public class MonochromeJavaFont extends Font {
	static int[] anIntArray8946;

	byte[][] rasters;
	JavaToolkit toolkit;
	int[] widths;
	int[] heights;
	int[] offsetsY;
	int[] offsetsX;

	MonochromeJavaFont(JavaToolkit toolkit, FontSpecification specification, IndexedImage[] images, int[] widths,
			int[] heights) {
		super(toolkit, specification);
		this.toolkit = toolkit;

		this.widths = widths;
		this.heights = heights;

		rasters = new byte[images.length][];
		offsetsY = new int[images.length];
		offsetsX = new int[images.length];

		for (int index = 0; index < images.length; index++) {
			rasters[index] = images[index].raster;
			offsetsY[index] = images[index].offsetY;
			offsetsX[index] = images[index].offsetX;
		}
	}

	MonochromeJavaFont(JavaToolkit toolkit, FontSpecification specification, DirectImage[] images, int[] widths,
			int[] heights) {
		super(toolkit, specification);
		this.toolkit = toolkit;

		this.widths = widths;
		this.heights = heights;

		rasters = new byte[images.length][];
		offsetsY = new int[images.length];
		offsetsX = new int[images.length];

		for (int index = 0; index < images.length; index++) {
			int[] argb = images[index].argb(false);
			byte[] raster = rasters[index] = new byte[argb.length];

			for (int pixel = 0; pixel < argb.length; pixel++) {
				int colour = argb[pixel];
				byte adjusted = (byte) ((colour & 0xff) + 4 * (colour >> 8 & 0xff) + (colour >> 16 & 0xff) * 3 >> 3);
				raster[pixel] = adjusted;
			}

			offsetsY[index] = images[index].getOffsetY();
			offsetsX[index] = images[index].getOffsetX();
		}
	}

	void method14243(byte[] is, int[] is_18_, int i, int i_19_, int i_20_, int i_21_, int i_22_, int i_23_, int i_24_) {
		int i_25_ = -(i_21_ >> 2);
		i_21_ = -(i_21_ & 0x3);
		for (int i_26_ = -i_22_; i_26_ < 0; i_26_++) {
			for (int i_27_ = i_25_; i_27_ < 0; i_27_++) {
				if (is[i_19_++] != 0) {
					is_18_[i_20_++] = i;
				} else {
					i_20_++;
				}
				if (is[i_19_++] != 0) {
					is_18_[i_20_++] = i;
				} else {
					i_20_++;
				}
				if (is[i_19_++] != 0) {
					is_18_[i_20_++] = i;
				} else {
					i_20_++;
				}
				if (is[i_19_++] != 0) {
					is_18_[i_20_++] = i;
				} else {
					i_20_++;
				}
			}
			for (int i_28_ = i_21_; i_28_ < 0; i_28_++) {
				if (is[i_19_++] != 0) {
					is_18_[i_20_++] = i;
				} else {
					i_20_++;
				}
			}
			i_20_ += i_23_;
			i_19_ += i_24_;
		}
	}

	void method14244(byte[] is, int[] is_29_, int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_) {
		int i_36_ = i >>> 24;
		int i_37_ = 255 - i_36_;
		for (int i_38_ = -i_33_; i_38_ < 0; i_38_++) {
			for (int i_39_ = -i_32_; i_39_ < 0; i_39_++) {
				if (is[i_30_++] != 0) {
					int i_40_ = ((i & 0xff00) * i_36_ & 0xff0000) + (i_36_ * (i & 0xff00ff) & ~0xff00ff) >> 8;
					int i_41_ = is_29_[i_31_];
					is_29_[i_31_++] = ((i_37_ * (i_41_ & 0xff00) & 0xff0000) + (i_37_ * (i_41_ & 0xff00ff) & ~0xff00ff) >> 8)
							+ i_40_;
				} else {
					i_31_++;
				}
			}
			i_31_ += i_34_;
			i_30_ += i_35_;
		}
	}

	void method14245(byte[] is, int[] is_56_, int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_,
			int i_63_, int i_64_, int i_65_, ClippingMask class129, int i_66_, int i_67_) {
		JavaClippingMask class129_sub3 = (JavaClippingMask) class129;
		int[] is_68_ = class129_sub3.offsets;
		int[] is_69_ = class129_sub3.widths;
		int i_70_ = i_64_;
		if (i_67_ > i_70_) {
			i_70_ = i_67_;
			i_58_ += (i_67_ - i_64_) * toolkit.displayWidth * 464577083;
			i_57_ += (i_67_ - i_64_) * i_65_;
		}
		int i_71_ = i_67_ + is_68_.length < i_60_ + i_64_ ? is_68_.length + i_67_ : i_60_ + i_64_;
		for (int i_72_ = i_70_; i_72_ < i_71_; i_72_++) {
			int i_73_ = is_68_[i_72_ - i_67_] + i_66_;
			int i_74_ = is_69_[i_72_ - i_67_];
			int i_75_ = i_59_;
			if (i_63_ > i_73_) {
				int i_76_ = i_63_ - i_73_;
				if (i_76_ >= i_74_) {
					i_57_ += i_62_ + i_59_;
					i_58_ += i_59_ + i_61_;
					continue;
				}
				i_74_ -= i_76_;
			} else {
				int i_77_ = i_73_ - i_63_;
				if (i_77_ >= i_59_) {
					i_57_ += i_62_ + i_59_;
					i_58_ += i_61_ + i_59_;
					continue;
				}
				i_57_ += i_77_;
				i_75_ -= i_77_;
				i_58_ += i_77_;
			}
			int i_78_ = 0;
			if (i_75_ < i_74_) {
				i_74_ = i_75_;
			} else {
				i_78_ = i_75_ - i_74_;
			}
			for (int i_79_ = 0; i_79_ < i_74_; i_79_++) {
				if (is[i_57_++] != 0) {
					is_56_[i_58_++] = i;
				} else {
					i_58_++;
				}
			}
			i_57_ += i_78_ + i_62_;
			i_58_ += i_78_ + i_61_;
		}
	}

	void method14251(byte[] is, int[] is_81_, int i, int i_82_, int i_83_, int i_84_, int i_85_, int i_86_, int i_87_,
			int i_88_, int i_89_, int i_90_, ClippingMask class129, int i_91_, int i_92_) {
		JavaClippingMask class129_sub3 = (JavaClippingMask) class129;
		int[] is_93_ = class129_sub3.offsets;
		int[] is_94_ = class129_sub3.widths;
		int i_95_ = i_88_ - toolkit.leftClip * 113391253;
		int i_96_ = i_89_;
		if (i_92_ > i_96_) {
			i_96_ = i_92_;
			i_83_ += (i_92_ - i_89_) * 464577083 * toolkit.displayWidth;
			i_82_ += i_90_ * (i_92_ - i_89_);
		}
		int i_97_ = is_93_.length + i_92_ < i_85_ + i_89_ ? is_93_.length + i_92_ : i_89_ + i_85_;
		int i_98_ = i >>> 24;
		int i_99_ = 255 - i_98_;
		for (int i_100_ = i_96_; i_100_ < i_97_; i_100_++) {
			int i_101_ = is_93_[i_100_ - i_92_] + i_91_;
			int i_102_ = is_94_[i_100_ - i_92_];
			int i_103_ = i_84_;
			if (i_95_ > i_101_) {
				int i_104_ = i_95_ - i_101_;
				if (i_104_ >= i_102_) {
					i_82_ += i_84_ + i_87_;
					i_83_ += i_84_ + i_86_;
					continue;
				}
				i_102_ -= i_104_;
			} else {
				int i_105_ = i_101_ - i_95_;
				if (i_105_ >= i_84_) {
					i_82_ += i_84_ + i_87_;
					i_83_ += i_84_ + i_86_;
					continue;
				}
				i_82_ += i_105_;
				i_103_ -= i_105_;
				i_83_ += i_105_;
			}
			int i_106_ = 0;
			if (i_103_ < i_102_) {
				i_102_ = i_103_;
			} else {
				i_106_ = i_103_ - i_102_;
			}
			for (int i_107_ = -i_102_; i_107_ < 0; i_107_++) {
				if (is[i_82_++] != 0) {
					int i_108_ = ((i & 0xff00ff) * i_98_ & ~0xff00ff) + ((i & 0xff00) * i_98_ & 0xff0000) >> 8;
					int i_109_ = is_81_[i_83_];
					is_81_[i_83_++] = ((i_99_ * (i_109_ & 0xff00) & 0xff0000)
							+ (i_99_ * (i_109_ & 0xff00ff) & ~0xff00ff) >> 8)
							+ i_108_;
				} else {
					i_83_++;
				}
			}
			i_82_ += i_87_ + i_106_;
			i_83_ += i_106_ + i_86_;
		}
	}

	@Override
	void renderCharacter(char character, int x, int i_6_, int i_7_, boolean mono) {
		if (null != toolkit.anIntArray8797) {
			x += offsetsX[character];
			i_6_ += offsetsY[character];
			int i_8_ = widths[character];
			int i_9_ = heights[character];
			int i_10_ = 464577083 * toolkit.displayWidth;
			int i_11_ = i_6_ * i_10_ + x;
			int i_12_ = i_10_ - i_8_;
			int i_13_ = 0;
			int i_14_ = 0;
			if (i_6_ < toolkit.bottomClip * 1163397961) {
				int i_15_ = toolkit.bottomClip * 1163397961 - i_6_;
				i_9_ -= i_15_;
				i_6_ = 1163397961 * toolkit.bottomClip;
				i_14_ += i_15_ * i_8_;
				i_11_ += i_10_ * i_15_;
			}
			if (i_6_ + i_9_ > toolkit.topClip * -68852597) {
				i_9_ -= i_9_ + i_6_ - -68852597 * toolkit.topClip;
			}
			if (x < toolkit.leftClip * 113391253) {
				int i_16_ = 113391253 * toolkit.leftClip - x;
				i_8_ -= i_16_;
				x = 113391253 * toolkit.leftClip;
				i_14_ += i_16_;
				i_11_ += i_16_;
				i_13_ += i_16_;
				i_12_ += i_16_;
			}
			if (x + i_8_ > toolkit.rightClip * -1451559971) {
				int i_17_ = x + i_8_ - -1451559971 * toolkit.rightClip;
				i_8_ -= i_17_;
				i_13_ += i_17_;
				i_12_ += i_17_;
			}
			if (i_8_ > 0 && i_9_ > 0) {
				if (-16777216 == (i_7_ & ~0xffffff)) {
					method14243(rasters[character], toolkit.anIntArray8797, i_7_, i_14_, i_11_, i_8_, i_9_, i_12_,
							i_13_);
				} else if (0 != (i_7_ & ~0xffffff)) {
					method14244(rasters[character], toolkit.anIntArray8797, i_7_, i_14_, i_11_, i_8_, i_9_, i_12_,
							i_13_);
				}
			}
		}
	}

	@Override
	void renderCharacter(char c, int i, int i_42_, int i_43_, boolean bool, ClippingMask clipping, int i_44_, int i_45_) {
		if (toolkit.anIntArray8797 != null) {
			if (null == clipping) {
				renderCharacter(c, i, i_42_, i_43_, bool);
			} else {
				i += offsetsX[c];
				i_42_ += offsetsY[c];
				int i_46_ = widths[c];
				int i_47_ = heights[c];
				int i_48_ = 464577083 * toolkit.displayWidth;
				int i_49_ = i + i_42_ * i_48_;
				int i_50_ = i_48_ - i_46_;
				int i_51_ = 0;
				int i_52_ = 0;
				if (i_42_ < toolkit.bottomClip * 1163397961) {
					int i_53_ = 1163397961 * toolkit.bottomClip - i_42_;
					i_47_ -= i_53_;
					i_42_ = 1163397961 * toolkit.bottomClip;
					i_52_ += i_53_ * i_46_;
					i_49_ += i_53_ * i_48_;
				}
				if (i_47_ + i_42_ > -68852597 * toolkit.topClip) {
					i_47_ -= i_42_ + i_47_ - -68852597 * toolkit.topClip;
				}
				if (i < 113391253 * toolkit.leftClip) {
					int i_54_ = 113391253 * toolkit.leftClip - i;
					i_46_ -= i_54_;
					i = 113391253 * toolkit.leftClip;
					i_52_ += i_54_;
					i_49_ += i_54_;
					i_51_ += i_54_;
					i_50_ += i_54_;
				}
				if (i_46_ + i > -1451559971 * toolkit.rightClip) {
					int i_55_ = i + i_46_ - -1451559971 * toolkit.rightClip;
					i_46_ -= i_55_;
					i_51_ += i_55_;
					i_50_ += i_55_;
				}
				if (i_46_ > 0 && i_47_ > 0) {
					if (-16777216 == (i_43_ & ~0xffffff)) {
						method14245(rasters[c], toolkit.anIntArray8797, i_43_, i_52_, i_49_, i_46_, i_47_, i_50_,
								i_51_, i, i_42_, widths[c], clipping, i_44_, i_45_);
					} else {
						method14251(rasters[c], toolkit.anIntArray8797, i_43_, i_52_, i_49_, i_46_, i_47_, i_50_,
								i_51_, i, i_42_, widths[c], clipping, i_44_, i_45_);
					}
				}
			}
		}
	}
}
