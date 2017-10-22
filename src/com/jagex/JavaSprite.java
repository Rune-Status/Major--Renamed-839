package com.jagex;

public abstract class JavaSprite extends Sprite {
	static int anInt8547;
	static int anInt8551;
	static final int anInt8555 = 4;
	static final int anInt8556 = 8;
	static final int anInt8557 = 12;
	static int anInt8559;
	static int anInt8560;
	static int anInt8561;
	static int anInt8562;
	static int anInt8563;
	static int anInt8564;
	static int anInt8566;
	static int anInt8567;
	static int anInt8568;
	static int anInt8569;
	static int anInt8570;
	static int anInt8571;
	static int anInt8572;
	static int anInt8573;
	static int anInt8574;
	static int anInt8575;
	static int anInt8576;
	static int anInt8577;
	static int anInt8578;
	static int anInt8579;
	static int anInt8580;
	static int anInt8581;
	static int anInt8582;

	JavaToolkit toolkit;
	int height;
	int offsetX;
	int deltaWidth;
	int deltaHeight;
	int[] anIntArray8554;
	int offsetY;
	int width;

	JavaSprite(JavaToolkit toolkit, int width, int height) {
		this.toolkit = toolkit;
		this.width = width;
		this.height = height;
	}

	@Override
	public int scaleWidth() {
		return offsetX + width + deltaWidth;
	}

	@Override
	public void setOffsets(int offsetX, int offsetY, int deltaWidth, int deltaHeight) {
		this.offsetX = offsetX;
		this.offsetY = offsetY;
		this.deltaWidth = deltaWidth;
		this.deltaHeight = deltaHeight;
	}

	@Override
	public void getOffsets(int[] array) {
		array[0] = offsetX;
		array[1] = offsetY;
		array[2] = deltaWidth;
		array[3] = deltaHeight;
	}

	@Override
	public int scaleHeight() {
		return offsetY + height + deltaHeight;
	}

	@Override
	public abstract void method2081(int i, int i_83_, ClippingMask class129, int i_84_, int i_85_);

	@Override
	public void method2085(int i, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		if (anIntArray8554 == null) {
			anIntArray8554 = new int[4];
		}
		toolkit.method2425(anIntArray8554);
		toolkit.method2511(toolkit.leftClip * 113391253, toolkit.bottomClip * 1163397961, i + i_71_, i_70_ + i_72_);
		int width = scaleWidth();
		int i_77_ = scaleHeight();
		int i_78_ = (i_71_ + width - 1) / width;
		int i_79_ = (i_72_ + i_77_ - 1) / i_77_;
		for (int i_80_ = 0; i_80_ < i_79_; i_80_++) {
			int i_81_ = i_80_ * i_77_;
			for (int i_82_ = 0; i_82_ < i_78_; i_82_++) {
				method2142(i + i_82_ * width, i_70_ + i_81_, i_73_, i_74_, i_75_);
			}
		}
		toolkit.method2760(anIntArray8554[0], anIntArray8554[1], anIntArray8554[2], anIntArray8554[3]);
	}

	@Override
	public abstract void method2100(int i, int i_86_, int i_87_, int i_88_, int[] is, int i_89_, int i_90_);

	@Override
	public int method2119() {
		return height;
	}

	@Override
	public abstract void method2142(int x, int i_0_, int i_1_, int i_2_, int i_3_);

	@Override
	public int method2157() {
		return width;
	}

	abstract void method13985(boolean bool, boolean bool_14_, boolean bool_15_, int i, int i_16_, float f, int i_17_,
			int i_18_, int i_19_, int i_20_, int i_21_, int i_22_, boolean bool_23_);

	boolean method13986(float f, float f_24_, float f_25_, float f_26_, float f_27_, float f_28_) {
		int i = offsetX + width + deltaWidth;
		int i_29_ = offsetY + height + deltaHeight;
		if (i != width || i_29_ != height) {
			float f_30_ = (f_25_ - f) / i;
			float f_31_ = (f_26_ - f_24_) / i;
			float f_32_ = (f_27_ - f) / i_29_;
			float f_33_ = (f_28_ - f_24_) / i_29_;
			float f_34_ = f_32_ * offsetY;
			float f_35_ = f_33_ * offsetY;
			float f_36_ = f_30_ * offsetX;
			float f_37_ = f_31_ * offsetX;
			float f_38_ = -f_30_ * deltaWidth;
			float f_39_ = -f_31_ * deltaWidth;
			float f_40_ = -f_32_ * deltaHeight;
			float f_41_ = -f_33_ * deltaHeight;
			f += f_36_ + f_34_;
			f_24_ += f_37_ + f_35_;
			f_25_ += f_38_ + f_34_;
			f_26_ += f_39_ + f_35_;
			f_27_ += f_36_ + f_40_;
			f_28_ += f_37_ + f_41_;
		}
		float f_42_ = f_27_ + (f_25_ - f);
		float f_43_ = f_26_ + (f_28_ - f_24_);
		float f_44_;
		float f_45_;
		if (f < f_25_) {
			f_44_ = f;
			f_45_ = f_25_;
		} else {
			f_44_ = f_25_;
			f_45_ = f;
		}
		if (f_27_ < f_44_) {
			f_44_ = f_27_;
		}
		if (f_42_ < f_44_) {
			f_44_ = f_42_;
		}
		if (f_27_ > f_45_) {
			f_45_ = f_27_;
		}
		if (f_42_ > f_45_) {
			f_45_ = f_42_;
		}
		float f_46_;
		float f_47_;
		if (f_24_ < f_26_) {
			f_46_ = f_24_;
			f_47_ = f_26_;
		} else {
			f_46_ = f_26_;
			f_47_ = f_24_;
		}
		if (f_28_ < f_46_) {
			f_46_ = f_28_;
		}
		if (f_43_ < f_46_) {
			f_46_ = f_43_;
		}
		if (f_28_ > f_47_) {
			f_47_ = f_28_;
		}
		if (f_43_ > f_47_) {
			f_47_ = f_43_;
		}
		if (f_44_ < toolkit.leftClip * 113391253) {
			f_44_ = toolkit.leftClip * 113391253;
		}
		if (f_45_ > toolkit.rightClip * -1451559971) {
			f_45_ = toolkit.rightClip * -1451559971;
		}
		if (f_46_ < toolkit.bottomClip * 1163397961) {
			f_46_ = toolkit.bottomClip * 1163397961;
		}
		if (f_47_ > toolkit.topClip * -68852597) {
			f_47_ = toolkit.topClip * -68852597;
		}
		f_45_ = f_44_ - f_45_;
		if (f_45_ >= 0.0F) {
			return false;
		}
		f_47_ = f_46_ - f_47_;
		if (f_47_ >= 0.0F) {
			return false;
		}
		anInt8559 = toolkit.displayWidth * 464577083;
		anInt8547 = (int) ((int) f_46_ * anInt8559 + f_44_);
		float f_48_ = (f_25_ - f) * (f_28_ - f_24_) - (f_26_ - f_24_) * (f_27_ - f);
		float f_49_ = (f_27_ - f) * (f_26_ - f_24_) - (f_28_ - f_24_) * (f_25_ - f);
		anInt8564 = (int) ((f_28_ - f_24_) * 4096.0F * width / f_48_);
		anInt8576 = (int) ((f_26_ - f_24_) * 4096.0F * height / f_49_);
		anInt8566 = (int) ((f_27_ - f) * 4096.0F * width / f_49_);
		anInt8567 = (int) ((f_25_ - f) * 4096.0F * height / f_48_);
		anInt8568 = (int) (f_44_ * 16.0F + 8.0F - (f + f_25_ + f_27_ + f_42_) / 4.0F * 16.0F);
		anInt8569 = (int) (f_46_ * 16.0F + 8.0F - (f_24_ + f_26_ + f_28_ + f_43_) / 4.0F * 16.0F);
		anInt8570 = (width >> 1 << 12) + (anInt8569 * anInt8566 >> 4);
		anInt8571 = (height >> 1 << 12) + (anInt8569 * anInt8567 >> 4);
		anInt8573 = anInt8568 * anInt8564 >> 4;
		anInt8574 = anInt8568 * anInt8576 >> 4;
		anInt8551 = (int) f_44_;
		anInt8572 = (int) f_45_;
		anInt8581 = (int) f_46_;
		anInt8561 = (int) f_47_;
		return true;
	}

	abstract void method13987(int i, int i_60_);

	abstract void method13988(int[] is, int[] is_68_, int i, int i_69_);

	@Override
	abstract void method2083(int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_, int i_12_, int i_13_);

	@Override
	void method2096(float f, float f_61_, float f_62_, float f_63_, float f_64_, float f_65_, int i,
			ClippingMask class129, int i_66_, int i_67_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		if (method13986(f, f_61_, f_62_, f_63_, f_64_, f_65_)) {
			JavaClippingMask class129_sub3 = (JavaClippingMask) class129;
			method13988(class129_sub3.offsets, class129_sub3.widths, anInt8551 - i_66_, -i_67_
					- (anInt8561 - anInt8581));
		}
	}

	@Override
	void method2143(float f, float f_50_, float f_51_, float f_52_, float f_53_, float f_54_, int i, int i_55_,
			int i_56_, int i_57_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		if (method13986(f, f_50_, f_51_, f_52_, f_53_, f_54_)) {
			anInt8578 = i_55_;
			if (i != 1) {
				anInt8575 = i_55_ >>> 24;
				anInt8562 = 256 - anInt8575;
				if (i == 0) {
					anInt8577 = (i_55_ & 0xff0000) >> 16;
					anInt8560 = (i_55_ & 0xff00) >> 8;
					anInt8579 = i_55_ & 0xff;
				} else if (i == 2) {
					anInt8580 = i_55_ >>> 24;
					anInt8563 = 256 - anInt8580;
					int i_58_ = (i_55_ & 0xff00ff) * anInt8563 & ~0xff00ff;
					int i_59_ = (i_55_ & 0xff00) * anInt8563 & 0xff0000;
					anInt8582 = (i_58_ | i_59_) >>> 8;
				}
			}
			method13987(i, i_56_);
		}
	}

}