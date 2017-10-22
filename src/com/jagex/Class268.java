package com.jagex;

public class Class268 {
	static String aString2985;
	static int cameraY;

	static String getOpeningColourHtml(int i) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(i)).append(">").toString();
	}

	static final void method5051(int plane, int group, int localX, int localZ, int id, int orientation, int type,
			int animation, int i_9_) {
		if (localX >= 1 && localZ >= 1 && localX <= Client.aClass460_10760.method7680() - 2
				&& localZ <= Client.aClass460_10760.method7707() - 2) {
			int collisionPlane = plane;
			if (collisionPlane < 3 && Client.aClass460_10760.method7775().isBridge(localX, localZ)) {
				collisionPlane++;
			}

			if (Client.aClass460_10760.method7687() != null) {
				Client.aClass460_10760.method7696().method15412(Class60.activeToolkit, plane, group, localX, localZ);
				if (id >= 0) {
					int preference = Class199.preferences.groundDecoration.getValue();
					Class199.preferences.setValue(Class199.preferences.groundDecoration, 1);
					Client.aClass460_10760.method7696().method15411(Class60.activeToolkit, collisionPlane, plane,
							localX, localZ, id, orientation, type, animation, i_9_);
					Class199.preferences.setValue(Class199.preferences.groundDecoration, preference);
				}

				Class467.method7906(Client.localPlayer.plane);
			}
		}
	}

	public int anInt2982;
	public int anInt2983;
	public int anInt2984;

}