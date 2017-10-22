package com.jagex;

public class VarpDefinition extends BaseVariableParameterDefinition {
	public static int method13983(CharSequence charsequence, CharSequence charsequence_1_, Language language) {
		int i_2_ = charsequence.length();
		int i_3_ = charsequence_1_.length();
		int i_4_ = 0;
		int i_5_ = 0;
		char c = '\0';
		char c_6_ = '\0';
		while (i_4_ - c < i_2_ || i_5_ - c_6_ < i_3_) {
			if (i_4_ - c >= i_2_) {
				return -1;
			}
			if (i_5_ - c_6_ >= i_3_) {
				return 1;
			}
			char c_7_;
			if (0 != c) {
				c_7_ = c;
			} else {
				c_7_ = charsequence.charAt(i_4_++);
			}
			char c_8_;
			if (0 != c_6_) {
				c_8_ = c_6_;
			} else {
				c_8_ = charsequence_1_.charAt(i_5_++);
			}
			c = ValueType.method7040(c_7_);
			c_6_ = ValueType.method7040(c_8_);
			c_7_ = Class526.method8981(c_7_, language);
			c_8_ = Class526.method8981(c_8_, language);
			if (c_7_ != c_8_ && Character.toUpperCase(c_7_) != Character.toUpperCase(c_8_)) {
				c_7_ = Character.toLowerCase(c_7_);
				c_8_ = Character.toLowerCase(c_8_);
				if (c_7_ != c_8_) {
					return Class184.method3580(c_7_, language) - Class184.method3580(c_8_, language);
				}
			}
		}
		int i_9_ = Math.min(i_2_, i_3_);
		for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
			if (Language.FRENCH == language) {
				i_4_ = i_2_ - 1 - i_10_;
				i_5_ = i_3_ - 1 - i_10_;
			} else {
				i_4_ = i_5_ = i_10_;
			}
			char c_11_ = charsequence.charAt(i_4_);
			char c_12_ = charsequence_1_.charAt(i_5_);
			if (c_12_ != c_11_ && Character.toUpperCase(c_11_) != Character.toUpperCase(c_12_)) {
				c_11_ = Character.toLowerCase(c_11_);
				c_12_ = Character.toLowerCase(c_12_);
				if (c_11_ != c_12_) {
					return Class184.method3580(c_11_, language) - Class184.method3580(c_12_, language);
				}
			}
		}
		int i_13_ = i_2_ - i_3_;
		if (0 != i_13_) {
			return i_13_;
		}
		for (int i_14_ = 0; i_14_ < i_9_; i_14_++) {
			char c_15_ = charsequence.charAt(i_14_);
			char c_16_ = charsequence_1_.charAt(i_14_);
			if (c_15_ != c_16_) {
				return Class184.method3580(c_15_, language) - Class184.method3580(c_16_, language);
			}
		}
		return 0;
	}

	VarpDefinition(VarpType type, int id) {
		super(type, id);
	}

	@Override
	public void method35() {

	}

	@Override
	void decode(Buffer buffer, int opcode) {

	}
}
