package com.jagex;

public class Class148 {
	static Class35 aClass35_1827;

	public static String method3173() {
		return Class471.aFile6534.getAbsolutePath();
	}

	public static final void method3177(int viewX, int viewZ, int viewY, int i_8_, int i_9_) {
		ComponentKeyRecord.cameraViewX = 1716222449 * viewX;
		Class51.cameraViewZ = viewZ * 541735519;
		Preference.cameraViewY = viewY * 1531198247;
		Class525.anInt7217 = -91321113 * i_8_;
		BefriendedPlayer.anInt576 = 1992549399 * i_9_;

		if (Connection.anInt7170 * 1212513917 == 3) {
			Class660.method13657();
		}

		if (BefriendedPlayer.anInt576 * -1261726809 >= 100) {
			int i_11_ = 256 + ComponentKeyRecord.cameraViewX * -1733418496;
			int i_12_ = 256 + -1589428736 * Class51.cameraViewZ;
			int i_13_ = Class279.getAverageHeight(i_11_, i_12_, ProxyingVariableLoader.localPlane * 1611577177)
					- 1314358423 * Preference.cameraViewY;
			int i_14_ = i_11_ - Client.cameraX * 2006359481;
			int i_15_ = i_13_ - 1525233901 * Class268.cameraY;
			int i_16_ = i_12_ - Wall.cameraZ * 1829446257;
			int i_17_ = (int) Math.sqrt(i_14_ * i_14_ + i_16_ * i_16_);

			Class155.anInt1874 = ((int) (Math.atan2(i_15_, i_17_) * 2607.5945876176133) & 0x3fff) * -1300105055;
			Class550.anInt7476 = ((int) (Math.atan2(i_14_, i_16_) * -2607.5945876176133) & 0x3fff) * -1726145155;
			IncomingFrameMeta.anInt4473 = 0;

			if (912649057 * Class155.anInt1874 < 1024) {
				Class155.anInt1874 = 132285440;
			}

			if (912649057 * Class155.anInt1874 > 3072) {
				Class155.anInt1874 = 396856320;
			}
		}

		Connection.anInt7170 = -2080369111;
		TurnMobCutsceneAction.anInt9433 = -1490979241;
		Class156.anInt1886 = -1672889529;
	}

	public int anInt1823;
	public int anInt1824;
	public int billboard;
	int anInt1826;

	Class148(int billboard, int i_0_, int i_1_, int i_2_) {
		this.billboard = -335390315 * billboard;
		anInt1823 = i_0_ * 1437752941;
		anInt1826 = 1577458139 * i_1_;
		anInt1824 = i_2_ * 1681527313;
	}

	Class148 method3170(int i) {
		return new Class148(billboard * -310433347, i, anInt1826 * -1751238061, 214376177 * anInt1824);
	}

}