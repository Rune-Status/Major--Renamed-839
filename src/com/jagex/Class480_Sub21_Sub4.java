package com.jagex;

public class Class480_Sub21_Sub4 extends Class480_Sub21 {
	static void method17756(MenuCategory class480_sub31_sub4, int i, byte i_2_) {
		if (Class56.menuOpen) {
			FontSpecification class9 = Class179.method3543();
			int i_3_ = 0;
			for (MenuOption class480_sub31_sub17 = class480_sub31_sub4.options.getFront(); class480_sub31_sub17 != null; class480_sub31_sub17 = class480_sub31_sub4.options
					.next()) {
				int i_4_ = ParameterDefinitionLoader.method16838(class480_sub31_sub17, class9);
				if (i_4_ > i_3_) {
					i_3_ = i_4_;
				}
			}
			i_3_ += 8;
			int i_5_ = 713555001 * class480_sub31_sub4.size * -1427683309 * Class56.anInt616 + 21;
			FloatRaster.anInt1245 = (-1427683309 * Class56.anInt616 * class480_sub31_sub4.size * 713555001 + (Class56.aBool642 ? 26
					: 22)) * 1195337785;
			int i_6_ = 907118265 * TextureMetricsList.anInt1822 + -1708755565 * Class480_Sub41_Sub4.anInt11432;
			if (i_3_ + i_6_ > Engine.screenWidth * 1319181337) {
				i_6_ = 907118265 * TextureMetricsList.anInt1822 - i_3_;
			}
			if (i_6_ < 0) {
				i_6_ = 0;
			}
			int i_7_ = Class56.aBool642 ? 20 + -1971642963 * class9.topPadding + 1 : 31;
			int i_8_ = class9.topPadding * -1971642963 + i - i_7_ + 1;
			if (i_8_ + i_5_ > Engine.screenHeight * -551672947) {
				i_8_ = Engine.screenHeight * -551672947 - i_5_;
			}
			if (i_8_ < 0) {
				i_8_ = 0;
			}
			Class56.anInt635 = 1362408725 * i_6_;
			Class159.anInt1896 = -594400979 * i_8_;
			EnvironmentContext.anInt8164 = 1132969331 * i_3_;
			Class56.aClass480_Sub31_Sub4_646 = class480_sub31_sub4;
		}
	}

	byte aByte11321;
	int anInt11322;
	int anInt11323;

	String aString11324;

	Class280 this$0;

	Class480_Sub21_Sub4(Class280 class280) {
		this$0 = class280;
		anInt11322 = 68518575;
	}

	@Override
	void method15947(Buffer buffer) {
		buffer.readUByte();
		anInt11322 = buffer.readUShort() * -68518575;
		aByte11321 = buffer.readByte();
		anInt11323 = buffer.readUShort() * 1652558965;
		buffer.readLong();
		aString11324 = buffer.readString();
		buffer.readUByte();
	}

	@Override
	void method15948(Class480_Sub33 class480_sub33) {
		Class283 class283 = class480_sub33.aClass283Array10233[1190587313 * anInt11322];
		class283.aByte3163 = aByte11321;
		class283.anInt3164 = 1712073659 * anInt11323;
		class283.aString3165 = aString11324;
	}
}
