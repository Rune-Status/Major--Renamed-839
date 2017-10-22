package com.jagex;

public class MonochromeAlphaJavaFont extends Font {

	int[] offsetsX;
	byte[][] alphas;
	int[] widths;
	int[] offsetsY;
	JavaToolkit toolkit;
	int[] heights;

	MonochromeAlphaJavaFont(JavaToolkit toolkit, FontSpecification specification, IndexedImage[] images, int[] widths,
			int[] heights) {
		super(toolkit, specification);
		this.toolkit = toolkit;

		this.widths = widths;
		this.heights = heights;

		alphas = new byte[images.length][];
		offsetsY = new int[images.length];
		offsetsX = new int[images.length];

		for (int index = 0; index < images.length; index++) {
			IndexedImage image = images[index];
			if (image.alpha != null) {
				alphas[index] = image.alpha;
			} else {
				byte[] raster = image.raster;
				byte[] alpha = alphas[index] = new byte[raster.length];

				for (int pixel = 0; pixel < raster.length; pixel++) {
					alpha[pixel] = (byte) (0 == raster[pixel] ? 0 : -1);
				}
			}

			offsetsY[index] = image.offsetY;
			offsetsX[index] = image.offsetX;
		}
	}

	MonochromeAlphaJavaFont(JavaToolkit toolkit, FontSpecification specification, DirectImage[] images, int[] is,
			int[] is_12_) {
		super(toolkit, specification);
		this.toolkit = toolkit;

		widths = is;
		heights = is_12_;

		alphas = new byte[images.length][];
		offsetsY = new int[images.length];
		offsetsX = new int[images.length];

		for (int index = 0; index < images.length; index++) {
			DirectImage image = images[index];
			int[] argb = image.argb(false);

			byte[] alpha = alphas[index] = new byte[argb.length];
			for (int pixel = 0; pixel < argb.length; pixel++) {
				alpha[pixel] = (byte) (argb[pixel] >> 24 & 0xff);
			}

			offsetsY[index] = image.getOffsetY();
			offsetsX[index] = image.getOffsetX();
		}
	}

	void method14185(byte[] is, int[] is_0_, int i, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		for (int i_7_ = -i_4_; i_7_ < 0; i_7_++) {
			for (int i_8_ = -i_3_; i_8_ < 0; i_8_++) {
				int i_9_ = is[i_1_++] & 0xff;
				if (0 != i_9_) {
					int i_10_ = (i_9_ * (i & 0xff00ff) & ~0xff00ff) + ((i & 0xff00) * i_9_ & 0xff0000) >> 8;
					i_9_ = 256 - i_9_;
					int i_11_ = is_0_[i_2_];
					is_0_[i_2_++] = (((i_11_ & 0xff00ff) * i_9_ & ~0xff00ff) + ((i_11_ & 0xff00) * i_9_ & 0xff0000) >> 8)
							+ i_10_;
				} else {
					i_2_++;
				}
			}
			i_2_ += i_5_;
			i_1_ += i_6_;
		}
	}

	void method14188(byte[] is, int[] is_42_, int i, int i_43_, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_,
			int i_49_, int i_50_, int i_51_, ClippingMask class129, int i_52_, int i_53_) {
		JavaClippingMask class129_sub3 = (JavaClippingMask) class129;
		int[] is_54_ = class129_sub3.offsets;
		int[] is_55_ = class129_sub3.widths;
		int i_56_ = i_49_ - toolkit.leftClip * 113391253;
		int i_57_ = i_50_;
		if (i_53_ > i_57_) {
			i_57_ = i_53_;
			i_44_ += toolkit.displayWidth * 464577083 * (i_53_ - i_50_);
			i_43_ += i_51_ * (i_53_ - i_50_);
		}
		int i_58_ = is_54_.length + i_53_ < i_50_ + i_46_ ? i_53_ + is_54_.length : i_46_ + i_50_;
		for (int i_59_ = i_57_; i_59_ < i_58_; i_59_++) {
			int i_60_ = is_54_[i_59_ - i_53_] + i_52_;
			int i_61_ = is_55_[i_59_ - i_53_];
			int i_62_ = i_45_;
			if (i_56_ > i_60_) {
				int i_63_ = i_56_ - i_60_;
				if (i_63_ >= i_61_) {
					i_43_ += i_45_ + i_48_;
					i_44_ += i_45_ + i_47_;
					continue;
				}
				i_61_ -= i_63_;
			} else {
				int i_64_ = i_60_ - i_56_;
				if (i_64_ >= i_45_) {
					i_43_ += i_45_ + i_48_;
					i_44_ += i_47_ + i_45_;
					continue;
				}
				i_43_ += i_64_;
				i_62_ -= i_64_;
				i_44_ += i_64_;
			}
			int i_65_ = 0;
			if (i_62_ < i_61_) {
				i_61_ = i_62_;
			} else {
				i_65_ = i_62_ - i_61_;
			}
			for (int i_66_ = -i_61_; i_66_ < 0; i_66_++) {
				int i_67_ = is[i_43_++] & 0xff;
				if (0 != i_67_) {
					int i_68_ = ((i & 0xff00ff) * i_67_ & ~0xff00ff) + ((i & 0xff00) * i_67_ & 0xff0000) >> 8;
					i_67_ = 256 - i_67_;
					int i_69_ = is_42_[i_44_];
					is_42_[i_44_++] = i_68_
							+ (((i_69_ & 0xff00) * i_67_ & 0xff0000) + ((i_69_ & 0xff00ff) * i_67_ & ~0xff00ff) >> 8);
				} else {
					i_44_++;
				}
			}
			i_43_ += i_65_ + i_48_;
			i_44_ += i_65_ + i_47_;
		}
	}

	@Override
	void renderCharacter(char character, int x, int y, int colour, boolean mono) {
		if (toolkit.anIntArray8797 != null) {
			x += offsetsX[character];
			y += offsetsY[character];
			int i_18_ = widths[character];
			int i_19_ = heights[character];
			int i_20_ = toolkit.displayWidth * 464577083;
			int i_21_ = x + y * i_20_;
			int i_22_ = i_20_ - i_18_;
			int i_23_ = 0;
			int i_24_ = 0;
			if (y < toolkit.bottomClip * 1163397961) {
				int i_25_ = toolkit.bottomClip * 1163397961 - y;
				i_19_ -= i_25_;
				y = 1163397961 * toolkit.bottomClip;
				i_24_ += i_25_ * i_18_;
				i_21_ += i_25_ * i_20_;
			}
			if (i_19_ + y > -68852597 * toolkit.topClip) {
				i_19_ -= y + i_19_ - -68852597 * toolkit.topClip;
			}
			if (x < 113391253 * toolkit.leftClip) {
				int i_26_ = toolkit.leftClip * 113391253 - x;
				i_18_ -= i_26_;
				x = 113391253 * toolkit.leftClip;
				i_24_ += i_26_;
				i_21_ += i_26_;
				i_23_ += i_26_;
				i_22_ += i_26_;
			}
			if (i_18_ + x > toolkit.rightClip * -1451559971) {
				int i_27_ = i_18_ + x - -1451559971 * toolkit.rightClip;
				i_18_ -= i_27_;
				i_23_ += i_27_;
				i_22_ += i_27_;
			}
			if (i_18_ > 0 && i_19_ > 0) {
				method14185(alphas[character], toolkit.anIntArray8797, colour, i_24_, i_21_, i_18_, i_19_, i_22_, i_23_);
			}
		}
	}

	@Override
	void renderCharacter(char c, int i, int i_28_, int i_29_, boolean bool, ClippingMask clipping, int i_30_, int i_31_) {
		if (null != toolkit.anIntArray8797) {
			if (clipping == null) {
				renderCharacter(c, i, i_28_, i_29_, bool);
			} else {
				i += offsetsX[c];
				i_28_ += offsetsY[c];
				int i_32_ = widths[c];
				int i_33_ = heights[c];
				int i_34_ = toolkit.displayWidth * 464577083;
				int i_35_ = i_28_ * i_34_ + i;
				int i_36_ = i_34_ - i_32_;
				int i_37_ = 0;
				int i_38_ = 0;
				if (i_28_ < toolkit.bottomClip * 1163397961) {
					int i_39_ = 1163397961 * toolkit.bottomClip - i_28_;
					i_33_ -= i_39_;
					i_28_ = 1163397961 * toolkit.bottomClip;
					i_38_ += i_39_ * i_32_;
					i_35_ += i_39_ * i_34_;
				}
				if (i_33_ + i_28_ > -68852597 * toolkit.topClip) {
					i_33_ -= i_28_ + i_33_ - -68852597 * toolkit.topClip;
				}
				if (i < 113391253 * toolkit.leftClip) {
					int i_40_ = toolkit.leftClip * 113391253 - i;
					i_32_ -= i_40_;
					i = 113391253 * toolkit.leftClip;
					i_38_ += i_40_;
					i_35_ += i_40_;
					i_37_ += i_40_;
					i_36_ += i_40_;
				}
				if (i + i_32_ > toolkit.rightClip * -1451559971) {
					int i_41_ = i + i_32_ - toolkit.rightClip * -1451559971;
					i_32_ -= i_41_;
					i_37_ += i_41_;
					i_36_ += i_41_;
				}
				if (i_32_ > 0 && i_33_ > 0) {
					method14188(alphas[c], toolkit.anIntArray8797, i_29_, i_38_, i_35_, i_32_, i_33_, i_36_, i_37_, i,
							i_28_, widths[c], clipping, i_30_, i_31_);
				}
			}
		}
	}

}