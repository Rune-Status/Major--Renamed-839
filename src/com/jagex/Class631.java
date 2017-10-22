package com.jagex;

public class Class631 {

	int anInt8061;
	int anInt8062;
	int anInt8063;
	FrameCollection aClass480_Sub31_Sub8_8064;
	FrameCollection aClass480_Sub31_Sub8_8065;
	boolean aBool8066 = false;

	final void method13111() {
		aClass480_Sub31_Sub8_8065 = null;
		aClass480_Sub31_Sub8_8064 = null;
	}

	final boolean method13113(AnimationDefinitionLoader loader, AnimationDefinition animation, int i, int i_0_,
			int[] is) {
		if (!aBool8066) {
			if (i >= is.length) {
				return false;
			}

			anInt8062 = 904062007 * is[i];
			aClass480_Sub31_Sub8_8064 = loader.getCollection(140382599 * anInt8062 >> 16);
			anInt8062 = 904062007 * (anInt8062 * 140382599 & 0xffff);

			if (aClass480_Sub31_Sub8_8064 != null) {
				if (animation.tweened && i_0_ != -1 && i_0_ < is.length) {
					anInt8061 = -1409948549 * is[i_0_];
					aClass480_Sub31_Sub8_8065 = loader.getCollection(1088051891 * anInt8061 >> 16);
					anInt8061 = -1409948549 * (anInt8061 * 1088051891 & 0xffff);
				}

				if (animation.aBool1971) {
					anInt8063 = (anInt8063 * -444292541 | 0x200) * 1940863595;
				}

				if (aClass480_Sub31_Sub8_8064.modifiesColour(140382599 * anInt8062)) {
					anInt8063 = 1940863595 * (-444292541 * anInt8063 | 0x80);
				}

				if (aClass480_Sub31_Sub8_8064.modifiesAlpha(anInt8062 * 140382599)) {
					anInt8063 = (-444292541 * anInt8063 | 0x100) * 1940863595;
				}

				if (aClass480_Sub31_Sub8_8064.method17745(140382599 * anInt8062)) {
					anInt8063 = 1940863595 * (anInt8063 * -444292541 | 0x400);
				}

				if (null != aClass480_Sub31_Sub8_8065) {
					if (aClass480_Sub31_Sub8_8065.modifiesColour(1088051891 * anInt8061)) {
						anInt8063 = 1940863595 * (-444292541 * anInt8063 | 0x80);
					}

					if (aClass480_Sub31_Sub8_8065.modifiesAlpha(1088051891 * anInt8061)) {
						anInt8063 = (-444292541 * anInt8063 | 0x100) * 1940863595;
					}

					if (aClass480_Sub31_Sub8_8065.method17745(1088051891 * anInt8061)) {
						anInt8063 = (-444292541 * anInt8063 | 0x400) * 1940863595;
					}
				}

				anInt8063 = 1940863595 * (-444292541 * anInt8063 | 0x20);
				aBool8066 = true;
				return true;
			}

			return false;
		}

		return true;
	}

}