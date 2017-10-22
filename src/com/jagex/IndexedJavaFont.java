package com.jagex;

public class IndexedJavaFont extends Font {
	static Class480_Sub31_Sub18 aClass480_Sub31_Sub18_8847;
	int[] offsetsY;
	int[] widths;
	int[] palette;
	JavaToolkit toolkit;
	int[] heights;
	byte[][] rasters;
	int[] offsetsX;

	IndexedJavaFont(JavaToolkit toolkit, FontSpecification specification, IndexedImage[] images, int[] widths,
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

		palette = images[0].palette;
	}

	void draw(byte[] is, int[] is_12_, int[] is_13_, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_) {
		int i_19_ = -(i_15_ >> 2);
		i_15_ = -(i_15_ & 0x3);
		for (int i_20_ = -i_16_; i_20_ < 0; i_20_++) {
			for (int i_21_ = i_19_; i_21_ < 0; i_21_++) {
				int i_22_;
				if ((i_22_ = is[i++]) != 0) {
					is_12_[i_14_++] = is_13_[i_22_ & 0xff];
				} else {
					i_14_++;
				}
				if ((i_22_ = is[i++]) != 0) {
					is_12_[i_14_++] = is_13_[i_22_ & 0xff];
				} else {
					i_14_++;
				}
				if ((i_22_ = is[i++]) != 0) {
					is_12_[i_14_++] = is_13_[i_22_ & 0xff];
				} else {
					i_14_++;
				}
				if ((i_22_ = is[i++]) != 0) {
					is_12_[i_14_++] = is_13_[i_22_ & 0xff];
				} else {
					i_14_++;
				}
			}
			for (int i_23_ = i_15_; i_23_ < 0; i_23_++) {
				int i_24_;
				if ((i_24_ = is[i++]) != 0) {
					is_12_[i_14_++] = is_13_[i_24_ & 0xff];
				} else {
					i_14_++;
				}
			}
			i_14_ += i_17_;
			i += i_18_;
		}
	}

	void method14157(byte[] is, int[] is_39_, int[] is_40_, int i, int i_41_, int i_42_, int i_43_, int i_44_,
			int i_45_, int i_46_, int i_47_, int i_48_, int i_49_, ClippingMask class129, int i_50_, int i_51_) {
		JavaClippingMask class129_sub3 = (JavaClippingMask) class129;
		int[] is_52_ = class129_sub3.offsets;
		int[] is_53_ = class129_sub3.widths;
		int i_54_ = i_47_ - toolkit.leftClip * 113391253;
		int i_55_ = i_48_;
		if (i_51_ > i_55_) {
			i_55_ = i_51_;
			i_42_ += toolkit.displayWidth * 464577083 * (i_51_ - i_48_);
			i_41_ += (i_51_ - i_48_) * i_49_;
		}
		int i_56_ = i_51_ + is_52_.length < i_48_ + i_44_ ? i_51_ + is_52_.length : i_48_ + i_44_;
		for (int i_57_ = i_55_; i_57_ < i_56_; i_57_++) {
			int i_58_ = i_50_ + is_52_[i_57_ - i_51_];
			int i_59_ = is_53_[i_57_ - i_51_];
			int i_60_ = i_43_;
			if (i_54_ > i_58_) {
				int i_61_ = i_54_ - i_58_;
				if (i_61_ >= i_59_) {
					i_41_ += i_43_ + i_46_;
					i_42_ += i_45_ + i_43_;
					continue;
				}
				i_59_ -= i_61_;
			} else {
				int i_62_ = i_58_ - i_54_;
				if (i_62_ >= i_43_) {
					i_41_ += i_43_ + i_46_;
					i_42_ += i_43_ + i_45_;
					continue;
				}
				i_41_ += i_62_;
				i_60_ -= i_62_;
				i_42_ += i_62_;
			}
			int i_63_ = 0;
			if (i_60_ < i_59_) {
				i_59_ = i_60_;
			} else {
				i_63_ = i_60_ - i_59_;
			}
			for (int i_64_ = -i_59_; i_64_ < 0; i_64_++) {
				int i_65_;
				if ((i_65_ = is[i_41_++]) != 0) {
					is_39_[i_42_++] = is_40_[i_65_ & 0xff];
				} else {
					i_42_++;
				}
			}
			i_41_ += i_46_ + i_63_;
			i_42_ += i_63_ + i_45_;
		}
	}

	void method14158(byte[] is, int[] is_66_, int i, int i_67_, int i_68_, int i_69_, int i_70_, int i_71_, int i_72_,
			int i_73_, int i_74_, int i_75_, ClippingMask mask, int i_76_, int i_77_) {
		JavaClippingMask clipping = (JavaClippingMask) mask;
		int[] offsets = clipping.offsets;
		int[] widths = clipping.widths;
		int i_80_ = i_73_ - toolkit.leftClip * 113391253;
		int i_81_ = i_74_;
		if (i_77_ > i_81_) {
			i_81_ = i_77_;
			i_68_ += (i_77_ - i_74_) * 464577083 * toolkit.displayWidth;
			i_67_ += (i_77_ - i_74_) * i_75_;
		}
		int i_82_ = i_77_ + offsets.length < i_70_ + i_74_ ? offsets.length + i_77_ : i_70_ + i_74_;
		for (int i_83_ = i_81_; i_83_ < i_82_; i_83_++) {
			int i_84_ = i_76_ + offsets[i_83_ - i_77_];
			int i_85_ = widths[i_83_ - i_77_];
			int i_86_ = i_69_;
			if (i_80_ > i_84_) {
				int i_87_ = i_80_ - i_84_;
				if (i_87_ >= i_85_) {
					i_67_ += i_69_ + i_72_;
					i_68_ += i_69_ + i_71_;
					continue;
				}
				i_85_ -= i_87_;
			} else {
				int i_88_ = i_84_ - i_80_;
				if (i_88_ >= i_69_) {
					i_67_ += i_72_ + i_69_;
					i_68_ += i_71_ + i_69_;
					continue;
				}
				i_67_ += i_88_;
				i_86_ -= i_88_;
				i_68_ += i_88_;
			}
			int i_89_ = 0;
			if (i_86_ < i_85_) {
				i_85_ = i_86_;
			} else {
				i_89_ = i_86_ - i_85_;
			}
			for (int i_90_ = -i_85_; i_90_ < 0; i_90_++) {
				if (is[i_67_++] != 0) {
					is_66_[i_68_++] = i;
				} else {
					i_68_++;
				}
			}
			i_67_ += i_67_ + i_89_;
			i_68_ += i_71_ + i_89_;
		}
	}

	void drawMono(byte[] raster, int[] dest, int i, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_) {
		int i_99_ = -(i_95_ >> 2);
		i_95_ = -(i_95_ & 0x3);
		for (int i_100_ = -i_96_; i_100_ < 0; i_100_++) {
			for (int i_101_ = i_99_; i_101_ < 0; i_101_++) {
				if (raster[i_93_++] != 0) {
					dest[i_94_++] = i;
				} else {
					i_94_++;
				}
				if (raster[i_93_++] != 0) {
					dest[i_94_++] = i;
				} else {
					i_94_++;
				}
				if (raster[i_93_++] != 0) {
					dest[i_94_++] = i;
				} else {
					i_94_++;
				}
				if (raster[i_93_++] != 0) {
					dest[i_94_++] = i;
				} else {
					i_94_++;
				}
			}
			for (int i_102_ = i_95_; i_102_ < 0; i_102_++) {
				if (raster[i_93_++] != 0) {
					dest[i_94_++] = i;
				} else {
					i_94_++;
				}
			}
			i_94_ += i_97_;
			i_93_ += i_98_;
		}
	}

	@Override
	void renderCharacter(char character, int x, int y, int colour, boolean mono) {
		if (toolkit.anIntArray8797 != null) {
			x += offsetsX[character];
			y += offsetsY[character];

			int i_2_ = widths[character];
			int i_3_ = heights[character];
			int i_4_ = 464577083 * toolkit.displayWidth;

			int i_5_ = x + i_4_ * y;
			int i_6_ = i_4_ - i_2_;
			int i_7_ = 0;
			int i_8_ = 0;

			if (y < toolkit.bottomClip * 1163397961) {
				int i_9_ = toolkit.bottomClip * 1163397961 - y;
				i_3_ -= i_9_;
				y = 1163397961 * toolkit.bottomClip;
				i_8_ += i_2_ * i_9_;
				i_5_ += i_4_ * i_9_;
			}

			if (y + i_3_ > -68852597 * toolkit.topClip) {
				i_3_ -= y + i_3_ - -68852597 * toolkit.topClip;
			}

			if (x < toolkit.leftClip * 113391253) {
				int i_10_ = 113391253 * toolkit.leftClip - x;
				i_2_ -= i_10_;
				x = toolkit.leftClip * 113391253;
				i_8_ += i_10_;
				i_5_ += i_10_;
				i_7_ += i_10_;
				i_6_ += i_10_;
			}

			if (x + i_2_ > toolkit.rightClip * -1451559971) {
				int i_11_ = x + i_2_ - toolkit.rightClip * -1451559971;
				i_2_ -= i_11_;
				i_7_ += i_11_;
				i_6_ += i_11_;
			}

			if (i_2_ > 0 && i_3_ > 0) {
				if (mono) {
					drawMono(rasters[character], toolkit.anIntArray8797, colour, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
				} else {
					draw(rasters[character], toolkit.anIntArray8797, palette, i_8_, i_5_, i_2_, i_3_, i_6_, i_7_);
				}
			}
		}
	}

	@Override
	void renderCharacter(char c, int i, int i_25_, int i_26_, boolean bool, ClippingMask clipping, int i_27_, int i_28_) {
		if (null != toolkit.anIntArray8797) {
			if (clipping == null) {
				renderCharacter(c, i, i_25_, i_26_, bool);
			} else {
				i += offsetsX[c];
				i_25_ += offsetsY[c];
				int i_29_ = widths[c];
				int i_30_ = heights[c];
				int i_31_ = 464577083 * toolkit.displayWidth;
				int i_32_ = i_25_ * i_31_ + i;
				int i_33_ = i_31_ - i_29_;
				int i_34_ = 0;
				int i_35_ = 0;
				if (i_25_ < toolkit.bottomClip * 1163397961) {
					int i_36_ = 1163397961 * toolkit.bottomClip - i_25_;
					i_30_ -= i_36_;
					i_25_ = 1163397961 * toolkit.bottomClip;
					i_35_ += i_36_ * i_29_;
					i_32_ += i_31_ * i_36_;
				}
				if (i_25_ + i_30_ > -68852597 * toolkit.topClip) {
					i_30_ -= i_30_ + i_25_ - -68852597 * toolkit.topClip;
				}
				if (i < 113391253 * toolkit.leftClip) {
					int i_37_ = 113391253 * toolkit.leftClip - i;
					i_29_ -= i_37_;
					i = toolkit.leftClip * 113391253;
					i_35_ += i_37_;
					i_32_ += i_37_;
					i_34_ += i_37_;
					i_33_ += i_37_;
				}
				if (i + i_29_ > toolkit.rightClip * -1451559971) {
					int i_38_ = i_29_ + i - -1451559971 * toolkit.rightClip;
					i_29_ -= i_38_;
					i_34_ += i_38_;
					i_33_ += i_38_;
				}
				if (i_29_ > 0 && i_30_ > 0) {
					if (bool) {
						method14158(rasters[c], toolkit.anIntArray8797, i_26_, i_35_, i_32_, i_29_, i_30_, i_33_,
								i_34_, i, i_25_, widths[c], clipping, i_27_, i_28_);
					} else {
						method14157(rasters[c], toolkit.anIntArray8797, palette, i_26_, i_35_, i_32_, i_29_, i_30_,
								i_33_, i_34_, i, i_25_, widths[c], clipping, i_27_, i_28_);
					}
				}
			}
		}
	}

}