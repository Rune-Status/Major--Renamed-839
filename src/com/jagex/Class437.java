package com.jagex;

final class Class437 implements Interface5 {
	public static final void method7274(int i, int i_1_, int i_2_, int i_3_, boolean bool) {
		if (i_2_ < 1) {
			i_2_ = 1;
		}
		if (i_3_ < 1) {
			i_3_ = 1;
		}
		int i_5_ = i_3_ - 334;
		if (i_5_ < 0) {
			i_5_ = 0;
		} else if (i_5_ > 100) {
			i_5_ = 100;
		}
		int i_6_ = i_5_ * (Client.aShort10878 - Client.aShort10613) / 100 + Client.aShort10613;
		int i_7_ = i_3_ * i_6_ * 512 / (334 * i_2_);
		if (i_7_ < Client.aShort10902) {
			i_7_ = Client.aShort10902;
			i_6_ = 334 * i_2_ * i_7_ / (i_3_ * 512);
			if (i_6_ > Client.aShort10758) {
				i_6_ = Client.aShort10758;
				int i_8_ = 512 * i_6_ * i_3_ / (i_7_ * 334);
				int i_9_ = (i_2_ - i_8_) / 2;
				if (bool) {
					Class60.activeToolkit.method2421();
					Class60.activeToolkit.method2805(i, i_1_, i_9_, i_3_, -16777216);
					Class60.activeToolkit.method2805(i_2_ + i - i_9_, i_1_, i_9_, i_3_, -16777216);
				}
				i += i_9_;
				i_2_ -= 2 * i_9_;
			}
		} else if (i_7_ > Client.aShort10885) {
			i_7_ = Client.aShort10885;
			i_6_ = i_2_ * i_7_ * 334 / (512 * i_3_);
			if (i_6_ < Client.aShort10626) {
				i_6_ = Client.aShort10626;
				int i_10_ = i_7_ * i_2_ * 334 / (512 * i_6_);
				int i_11_ = (i_3_ - i_10_) / 2;
				if (bool) {
					Class60.activeToolkit.method2421();
					Class60.activeToolkit.method2805(i, i_1_, i_2_, i_11_, -16777216);
					Class60.activeToolkit.method2805(i, i_3_ + i_1_ - i_11_, i_2_, i_11_, -16777216);
				}
				i_1_ += i_11_;
				i_3_ -= 2 * i_11_;
			}
		}
		Client.anInt10906 = -1137455197 * (i_3_ * i_6_ / 334);
		Client.anInt10728 = i * 227080789;
		Client.anInt10655 = i_1_ * 1904852575;
		Client.anInt10888 = -673482619 * (short) i_2_;
		Client.anInt10889 = (short) i_3_ * 270558685;
	}
}
