package com.jagex;

import java.util.HashSet;
import java.util.Set;

public class Class622 implements Identifiable {
	public static Class622 aClass622_8003 = new Class622("", 4);
	static Class622 aClass622_8004;
	static Class622 aClass622_8005;
	static Class622 aClass622_8006;
	public static Class622 aClass622_8007;
	public static Class622 aClass622_8008;
	public static Class622 aClass622_8009 = new Class622("", 3, new Class620[] { Class620.aClass620_7991 });
	public static Class622 aClass622_8010;
	static Class622 aClass622_8011;
	public static Class622 aClass622_8012;
	public static Class622 aClass622_8013;

	static {
		aClass622_8005 = new Class622("", 11, new Class620[] { Class620.aClass620_7991 });
		aClass622_8007 = new Class622("", 5, new Class620[] { Class620.aClass620_7991, Class620.aClass620_7992 });
		aClass622_8011 = new Class622("", 8, new Class620[] { Class620.aClass620_7991, Class620.aClass620_7992 });
		aClass622_8008 = new Class622("", 2, new Class620[] { Class620.aClass620_7991, Class620.aClass620_7990 });
		aClass622_8004 = new Class622("", 9, new Class620[] { Class620.aClass620_7991, Class620.aClass620_7990 });
		aClass622_8010 = new Class622("", 1, new Class620[] { Class620.aClass620_7991, Class620.aClass620_7992 });
		aClass622_8006 = new Class622("", 6, new Class620[] { Class620.aClass620_7992 });
		aClass622_8012 = new Class622("", 0, new Class620[] { Class620.aClass620_7992 });
		aClass622_8013 = new Class622("", 10, new Class620[] { Class620.aClass620_7991 });
	}

	public static void method10431() {
		if (null != Class593.aClass343_7835) {
			Class593.aClass343_7835.method5875();
			Class593.aClass343_7835 = null;
		}
	}

	public static Class622[] values() {
		return new Class622[] { aClass622_8005, aClass622_8003, aClass622_8011, aClass622_8009, aClass622_8004,
				aClass622_8006, aClass622_8013, aClass622_8007, aClass622_8008, aClass622_8010, aClass622_8012 };
	}

	static void method10436(Toolkit class134, Widget class226, int i, int i_2_, byte i_3_) {
		if (null != Client.localPlayer) {
			class134.method2456();
			Class211 class211 = null;
			ClippingMask class129 = null;
			if (5 == 1558474223 * class226.type) {
				class211 = class226.method4298(class134);
				if (null == class211) {
					return;
				}
				class129 = class211.aClass129_2183;
				if (class226.width * 688089097 != 881990655 * class211.anInt2182
						|| 1362321717 * class226.height != class211.anInt2180 * 1644092335) {
					throw new IllegalStateException("");
				}
			}
			class134.method2760(i, i_2_, i + class226.width * 688089097, i_2_ + 1362321717 * class226.height);
			if (422203915 * Class63.anInt954 != 2 && 5 != 422203915 * Class63.anInt954 && Class63.aClass116_951 != null) {
				class134.method2395(Class63.anIntArray942);
				class134.method2494();
				Class553 class553 = Client.aClass460_10760.method7679();
				int i_4_;
				int i_5_;
				int i_6_;
				int i_7_;
				if (1212513917 * Connection.anInt7170 == 6) {
					i_4_ = 1327138123 * Client.anInt10706;
					i_5_ = -2128941351 * Client.anInt10707;
					i_6_ = (int) -Client.aFloat10787 & 0x3fff;
					i_7_ = 4096;
				} else {
					Class397 class397 = Client.localPlayer.method10164().aClass397_4507;
					i_4_ = (int) class397.x;
					i_5_ = (int) class397.z;
					if (3 == Connection.anInt7170 * 1212513917) {
						i_6_ = (int) -(Class369.aClass261_Sub1_4079.method4843() * 2607.5945876176133)
								+ Client.anInt10699 * 1093165775 & 0x3fff;
					} else {
						i_6_ = (int) -Client.aFloat10787 + Client.anInt10699 * 1093165775 & 0x3fff;
					}
					i_7_ = 4096 - -251176784 * Client.anInt10701;
				}
				int i_8_ = i_4_ / 128 + 48;
				int i_9_ = 48 + Client.aClass460_10760.method7707() * 4 - i_5_ / 128;
				if (class129 != null) {
					Class63.aClass116_951.method2092(i + class226.width * 688089097 / 2.0F, 1362321717
							* class226.height / 2.0F + i_2_, i_8_, i_9_, i_7_, i_6_ << 2, class129, i, i_2_);
				} else {
					Class63.aClass116_951.method2090(688089097 * class226.width / 2.0F + i, i_2_ + class226.height
							* 1362321717 / 2.0F, i_8_, i_9_, i_7_, i_6_ << 2, 1, -1, 1);
				}
				Class488 class488 = Client.aClass460_10760.method7729();
				for (LinkableInt class480_sub24 = (LinkableInt) Class63.aClass644_948.head(); null != class480_sub24; class480_sub24 = (LinkableInt) Class63.aClass644_948
						.next()) {
					int i_10_ = -1189875169 * class480_sub24.value;
					int i_11_ = (class488.anIntArray6670[i_10_] >> 14 & 0x3fff) - class553.x * 2051316501;
					int i_12_ = (class488.anIntArray6670[i_10_] & 0x3fff) - class553.z * -180305283;
					int i_13_ = 2 + i_11_ * 4 - i_4_ / 128;
					int i_14_ = i_12_ * 4 + 2 - i_5_ / 128;
					Widget.method7346(class134, class129, class226, i, i_2_, i_13_, i_14_,
							class488.anIntArray6671[i_10_], -541076374);
				}
				for (int i_15_ = 0; i_15_ < -399051693 * Class63.anInt947; i_15_++) {
					int i_16_ = 4 * Class63.anIntArray945[i_15_] + 2 - i_4_ / 128;
					int i_17_ = 4 * Class63.anIntArray946[i_15_] + 2 - i_5_ / 128;
					ObjectDefinition class544 = Client.aClass460_10760.getObjectLoader().get(
							Class63.anIntArray953[i_15_]);
					if (class544.morphisms != null) {
						class544 = class544
								.method9255(PlayerVariableProvider.instance, PlayerVariableProvider.instance);
						if (null == class544 || 1294173105 * class544.mapFunction == -1) {
							continue;
						}
					}
					Widget.method7346(class134, class129, class226, i, i_2_, i_16_, i_17_,
							1294173105 * class544.mapFunction, -541076374);
				}
				for (ItemDeque class480_sub3 = Client.groundItems.first(); class480_sub3 != null; class480_sub3 = Client.groundItems
						.next()) {
					int i_18_ = (int) (class480_sub3.linkedKey * -4821875126325281949L >> 28 & 0x3L);
					if (i_18_ == Class63.anInt943 * -1503545849) {
						int i_19_ = (int) (class480_sub3.linkedKey * -4821875126325281949L & 0x3fffL) - 2051316501
								* class553.x;
						int i_20_ = (int) (-4821875126325281949L * class480_sub3.linkedKey >> 14 & 0x3fffL)
								- class553.z * -180305283;
						int i_21_ = 2 + 4 * i_19_ - i_4_ / 128;
						int i_22_ = 4 * i_20_ + 2 - i_5_ / 128;
						Class369.method6107(class226, class129, i, i_2_, i_21_, i_22_, Client.mapDots[0]);
					}
				}
				Class545.method9301(class134, i_4_, i_5_, class226, class129, i, i_2_);
				CutsceneObject.method3483(i_4_, i_5_, class226, class129, i, i_2_, 237098637);
				Orientation.method815(i_4_, i_5_, class226, class211, i, i_2_, -864966782);
				if (Connection.anInt7170 * 1212513917 != 6) {
					if (-1 != Class63.anInt939 * 1134492539) {
						int i_23_ = 2 + 243002860 * Class63.anInt939 - i_4_ / 128
								+ (Client.localPlayer.boundSize() - 1) * 2;
						int i_24_ = 2 + Class63.anInt950 * -1692973740 - i_5_ / 128
								+ (Client.localPlayer.boundSize() - 1) * 2;
						Class369.method6107(class226, class129, i, i_2_, i_23_, i_24_,
								Class351.mapflags[Class63.aBool955 ? 1 : 0]);
					}
					if (!Client.localPlayer.aBool11783) {
						class134.method2805(i + 688089097 * class226.width / 2 - 1, class226.height * 1362321717
								/ 2 + i_2_ - 1, 3, 3, -1);
					}
				}
				class134.method2566(Class63.anIntArray942[0], Class63.anIntArray942[1], Class63.anIntArray942[2],
						Class63.anIntArray942[3]);
			} else if (null != class129) {
				class134.method2467(-16777216, class129, i, i_2_);
			}
		}
	}

	int id;
	Set<Class620> aSet8015 = new HashSet<Class620>();

	Class622(String name, int ordinal) {
		id = ordinal * -1624921801;
	}

	Class622(String string, int i, Class620... class620s) {
		aSet8015 = new HashSet();
		this.id = -1624921801 * i;

		for (Class620 class620 : class620s) {
			aSet8015.add(class620);
		}
	}

	public boolean method10432(Class620 class620) {
		return aSet8015.contains(class620);
	}

	@Override
	public int getId() {
		return id * 575429767;
	}

}