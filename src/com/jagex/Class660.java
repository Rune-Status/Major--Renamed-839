package com.jagex;

public class Class660 {
	static final void method13656(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.desiredToolkit
				.method16484() ? 1 : 0;
	}

	static final void method13657() {
		Class553 class553 = Client.aClass460_10760.method7679();
		Class397 class397 = Class369.aClass261_Sub1_4079.method4859();
		Client.cameraX = -224503671 * ((int) class397.x - (2051316501 * class553.x << 9));
		Class268.cameraY = -1128143643 * -(int) class397.y;
		Wall.cameraZ = ((int) class397.z - (class553.z * -180305283 << 9)) * -187933039;
		Class155.anInt1874 = ((int) (Class369.aClass261_Sub1_4079.method4907((byte) 1) * 2607.5945876176133) & 0x3fff)
				* -1300105055;
		Class550.anInt7476 = ((int) (Class369.aClass261_Sub1_4079.method4843() * 2607.5945876176133) & 0x3fff)
				* -1726145155;
		IncomingFrameMeta.anInt4473 = 0;
	}

	static void method13658(ScriptExecutionContext class613) {
		class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1] = QuestDefinition.loader
				.get(class613.anIntArray7942[1841827045 * class613.anInt7924 - 1]).anInt2594 * 2106198419;
	}

	Class660() throws Throwable {
		throw new Error();
	}
}
