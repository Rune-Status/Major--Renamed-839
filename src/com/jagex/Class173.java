package com.jagex;

import java.io.File;

class Class173 implements Interface52 {

	static long encodeBase37(CharSequence sequence) {
		long value = 0L;
		int length = sequence.length();

		for (int index = 0; index < length; index++) {
			value *= 37L;
			char character = sequence.charAt(index);

			if (character >= 'A' && character <= 'Z') {
				value += character + '\001' - 'A';
			} else if (character >= 'a' && character <= 'z') {
				value += character + '\001' - 'a';
			} else if (character >= '0' && character <= '9') {
				value += character + '\033' - '0';
			}

			if (value >= 177917621779460413L) {
				break;
			}
		}

		for (; value % 37L == 0L && value != 0L; value /= 37L) {

		}

		return value;
	}

	static void method3500(File file) {
		Class471.aFile6534 = file;
		if (!Class471.aFile6534.exists()) {
			throw new RuntimeException("");
		}
		Class471.aBool6533 = true;
	}

	static final void method3502(ScriptExecutionContext class613) {
		Class199.preferences.setValue(Class199.preferences.graphics, 0);
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	Class186 this$0;

	Class173(Class186 class186) {
		this$0 = class186;
	}

	@Override
	public void method345(Object object, float[] fs, Object[] objects, int i) {
		Class456 class456 = (Class456) object;
		Class397 class397 = class456.method7518();
		float f = class456.method7425();
		float f_0_ = class456.method7448();

		Class397 class397_1_ = Class397.difference(class397, this$0.method3598());
		float f_2_ = 0.0F;
		float f_3_ = class397_1_.distance();

		if (f_3_ >= f_0_) {
			f_2_ = 0.0F;
		}

		if (f_3_ <= f) {
			f_2_ = 1.0F;
		} else {
			float f_4_ = 1.0F - 1.0F / (f_0_ - f) * (f_3_ - f);
			if (f_4_ < 0.0 || f_4_ > 1.0) {
				f_4_ = Math.min(Math.max(f_4_, 0.0F), 1.0F);
			}

			f_2_ = f_4_;
		}

		fs[0] = f_2_;
		fs[1] = f_2_;
	}

}