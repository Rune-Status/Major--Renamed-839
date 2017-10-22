package com.jagex;

public class Class51 {
	public static Archive textures;
	public static Archive objects;
	public static int cameraViewZ;

	public static final void method1136() {
		if (-1583827119 * Client.anInt10620 != -1 && -1 != Client.anInt10722 * -2113519449) {
			int i_3_ = (1825029507 * Client.anInt10725
					* (1275260565 * Client.anInt10727 - 466846879 * Client.anInt10726) >> 16)
					+ 466846879 * Client.anInt10726;
			Client.anInt10725 += 1860909355 * i_3_;
			if (1825029507 * Client.anInt10725 >= 65535) {
				Client.anInt10725 = -901789995;
				Client.aBool10841 = !Client.aBool10729;
				Client.aBool10729 = true;
			} else {
				Client.aBool10841 = false;
				Client.aBool10729 = false;
			}
			float f = Client.anInt10725 * 1825029507 / 65535.0F;
			float[] fs = new float[3];
			int i_4_ = -1034403382 * Client.anInt10723;
			for (int i_5_ = 0; i_5_ < 3; i_5_++) {
				int i_6_ = Client.anIntArrayArrayArray10720[-1583827119 * Client.anInt10620][i_4_][i_5_] * 3;
				int i_7_ = 3 * Client.anIntArrayArrayArray10720[Client.anInt10620 * -1583827119][i_4_ + 1][i_5_];
				int i_8_ = 3 * (Client.anIntArrayArrayArray10720[-1583827119 * Client.anInt10620][2 + i_4_][i_5_] - (Client.anIntArrayArrayArray10720[-1583827119
						* Client.anInt10620][3 + i_4_][i_5_] - Client.anIntArrayArrayArray10720[-1583827119
						* Client.anInt10620][2 + i_4_][i_5_]));
				int i_9_ = Client.anIntArrayArrayArray10720[-1583827119 * Client.anInt10620][i_4_][i_5_];
				int i_10_ = i_7_ - i_6_;
				int i_11_ = i_6_ - i_7_ * 2 + i_8_;
				int i_12_ = i_7_ + Client.anIntArrayArrayArray10720[-1583827119 * Client.anInt10620][2 + i_4_][i_5_]
						- i_9_ - i_8_;
				fs[i_5_] = f * (i_10_ + f * (f * i_12_ + i_11_)) + i_9_;
			}
			Class553 class553 = Client.aClass460_10760.method7679();
			Client.cameraX = ((int) fs[0] - class553.x * -1992939008) * -224503671;
			Class268.cameraY = (int) fs[1] * 1128143643;
			Wall.cameraZ = -187933039 * ((int) fs[2] - -2121991680 * class553.z);
			float[] fs_13_ = new float[3];
			int i_14_ = 1103687902 * Client.anInt10724;
			for (int i_15_ = 0; i_15_ < 3; i_15_++) {
				int i_16_ = 3 * Client.anIntArrayArrayArray10720[Client.anInt10722 * -2113519449][i_14_][i_15_];
				int i_17_ = Client.anIntArrayArrayArray10720[Client.anInt10722 * -2113519449][1 + i_14_][i_15_] * 3;
				int i_18_ = 3 * (Client.anIntArrayArrayArray10720[-2113519449 * Client.anInt10722][2 + i_14_][i_15_] - (Client.anIntArrayArrayArray10720[-2113519449
						* Client.anInt10722][i_14_ + 3][i_15_] - Client.anIntArrayArrayArray10720[Client.anInt10722
						* -2113519449][i_14_ + 2][i_15_]));
				int i_19_ = Client.anIntArrayArrayArray10720[Client.anInt10722 * -2113519449][i_14_][i_15_];
				int i_20_ = i_17_ - i_16_;
				int i_21_ = i_18_ + i_16_ - 2 * i_17_;
				int i_22_ = Client.anIntArrayArrayArray10720[-2113519449 * Client.anInt10722][i_14_ + 2][i_15_] - i_19_
						+ i_17_ - i_18_;
				fs_13_[i_15_] = f * ((i_22_ * f + i_21_) * f + i_20_) + i_19_;
			}
			float f_23_ = fs_13_[0] - fs[0];
			float f_24_ = (fs_13_[1] - fs[1]) * -1.0F;
			float f_25_ = fs_13_[2] - fs[2];
			double d = Math.sqrt(f_23_ * f_23_ + f_25_ * f_25_);
			Class155.anInt1874 = ((int) (Math.atan2(f_24_, d) * 2607.5945876176133) & 0x3fff) * -1300105055;
			Class550.anInt7476 = ((int) (-Math.atan2(f_23_, f_25_) * 2607.5945876176133) & 0x3fff) * -1726145155;
			IncomingFrameMeta.anInt4473 = ((1825029507
					* Client.anInt10725
					* (Client.anIntArrayArrayArray10720[-1583827119 * Client.anInt10620][i_4_ + 2][3] - Client.anIntArrayArrayArray10720[Client.anInt10620
							* -1583827119][i_4_][3]) >> 16) + Client.anIntArrayArrayArray10720[Client.anInt10620
					* -1583827119][i_4_][3]) * 796245051;
		}
	}

	public static int method1137(int i, int i_26_, boolean bool, int i_27_) {
		int i_28_ = 0;
		Class480_Sub1 class480_sub1 = Class606.method10252(i, bool);
		if (null == class480_sub1) {
			return 0;
		}
		for (int i_29_ = 0; i_29_ < class480_sub1.anIntArray9964.length; i_29_++) {
			if (class480_sub1.anIntArray9964[i_29_] >= 0
					&& ItemDefinition.loader.get(class480_sub1.anIntArray9964[i_29_]).anInt8269 * 1553194521 == i_26_) {
				i_28_ += Class427.method7092(i, i_29_, bool);
			}
		}
		return i_28_;
	}

	static final void method1135() {
		Class255.method4748();
		Client.aClass460_10760.method7698();
		for (int i_0_ = 0; i_0_ < Client.aClass75Array10623.length; i_0_++) {
			Client.aClass75Array10623[i_0_] = null;
		}
		for (int i_1_ = 0; i_1_ < Client.aClass473Array10624.length; i_1_++) {
			Client.aClass473Array10624[i_1_] = null;
		}
		Client.clearPlayers();
		for (int i_2_ = 0; i_2_ < 2048; i_2_++) {
			Client.players[i_2_] = null;
		}
		Client.npcCount = 0;
		Client.npcs.clear();
		Client.anInt10862 = 0;
		Client.groundItems.clear();
		Class637.method13160(FloatRaster.method1728());
		Client.anInt10657 = 0;
		PlayerVariableProvider.instance.collection.reset();
		MobChatCutsceneAction.aClass288_9645 = null;
		JavaFont.aClass288_8793 = null;
		Class486.aClass480_Sub33_6643 = null;
		Class417.aClass480_Sub33_4650 = null;
		ItemDefinition.aClass192_8339 = null;
		Class24.aClass587_336 = null;
		Class224.aLong2344 = 0L;
		HitbarDefinition.method8950();
		FriendsChatPlayer.method1540();
	}

	Class51() throws Throwable {
		throw new Error();
	}

}