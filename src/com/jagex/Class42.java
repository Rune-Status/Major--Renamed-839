package com.jagex;

public class Class42 {
	static final void method1043(int plane, int worldX, int worldZ, int i_3_, int heightOffset, boolean bool,
			boolean bool_5_) {
		if (!bool
				&& (worldX < 512 || worldZ < 512 || worldX > (Client.aClass460_10760.method7680() - 2) * 512 || worldZ > (Client.aClass460_10760
						.method7707() - 2) * 512)) {
			float[] fs = Client.aFloatArray10736;
			Client.aFloatArray10736[1] = -1.0F;
			fs[0] = -1.0F;
		} else {
			int height = Class279.getAverageHeight(worldX, worldZ, plane) - heightOffset;
			Client.aClass405_10612.copyFrom(Class60.activeToolkit.method2754());
			Client.aClass405_10612.method6744(i_3_, 0.0F, 0.0F);
			Class60.activeToolkit.method2471(Client.aClass405_10612);

			if (bool) {
				Class60.activeToolkit.method2424(worldX, worldZ, height, Client.aFloatArray10736);
			} else {
				Class60.activeToolkit.method2502(worldX, worldZ, height, Client.aFloatArray10736);
			}

			Client.aClass405_10612.method6744(-i_3_, 0.0F, 0.0F);
			Class60.activeToolkit.method2471(Client.aClass405_10612);

			if (!bool_5_) {
				Client.aFloatArray10736[0] -= Client.anInt10728 * -674483459;
				Client.aFloatArray10736[1] -= 1180573087 * Client.anInt10655;
			}
		}
	}

	public Interface43[] anInterface43Array547;

	void method1039(Buffer buffer) {
		anInterface43Array547 = new Interface43[buffer.readUByte()];
		Class360[] class360s = Class360.values();
		for (int i_0_ = 0; i_0_ < anInterface43Array547.length; i_0_++) {
			anInterface43Array547[i_0_] = method1040(buffer, class360s[buffer.readUByte()]);
		}
	}

	Interface43 method1040(Buffer buffer, Class360 type) {
		if (type == Class360.aClass360_3884) {
			return Class341.decode(buffer);
		} else if (Class360.aClass360_3883 == type) {
			return Class340_Sub3.decode(buffer);
		} else if (Class360.aClass360_3881 == type) {
			return Class330.decode(buffer);
		} else if (type == Class360.aClass360_3877) {
			return Class367_Sub1.decode(buffer);
		} else if (type == Class360.aClass360_3882) {
			return Class367.decode(buffer);
		} else if (Class360.aClass360_3879 == type) {
			return Class340_Sub1.decode(buffer);
		} else if (type == Class360.aClass360_3880) {
			return Class340_Sub2.decode(buffer);
		} else if (Class360.aClass360_3878 == type) {
			return Class348.decode(buffer);
		} else if (type == Class360.aClass360_3888) {
			return Class350.decode(buffer);
		} else if (type == Class360.aClass360_3886) {
			return Class340_Sub2_Sub1.decode(buffer);
		} else if (Class360.aClass360_3887 == type) {
			return Class331.decode(buffer);
		}

		return null;
	}

}