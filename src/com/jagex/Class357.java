package com.jagex;

import java.awt.Canvas;

public class Class357 {
	public static int anInt3819;

	public static Class357 decode(Buffer buffer) {
		Class357 class357 = new Class357();
		class357.id = buffer.readUShort() * -516720029;
		class357.message = ThemeMusicVolumeNormaliser.aClass10_2062.get(-973678773 * class357.id);
		return class357;
	}

	static void method6020(Toolkit toolkit) {
		if (Class49.aClass644_579.size() != 0) {
			if (Class199.preferences.currentToolkit.getValue() == 0) {
				for (Class480_Sub2 class480_sub2 = (Class480_Sub2) Class49.aClass644_579.head(); null != class480_sub2; class480_sub2 = (Class480_Sub2) Class49.aClass644_579
						.next()) {
					ItemDefinition.loader.getSprite(toolkit, toolkit, 446648719 * class480_sub2.anInt9973,
							602658431 * class480_sub2.anInt9971, class480_sub2.anInt9972 * 587801107,
							class480_sub2.anInt9970 * 1730769447, false, false, class480_sub2.anInt9974 * 1896582689,
							Class558.p11Full, class480_sub2.aBool9975 ? Client.localPlayer.appearance : null,
							Mob.defaults);
					class480_sub2.unlink();
				}
				EntityQueue.method13532();
			} else {
				if (Class49.aClass134_581 == null) {
					Canvas canvas = new Canvas();
					canvas.setSize(36, 32);
					Class49.aClass134_581 = Toolkit.create(0, canvas, CachedParticleDefinitionLoader.aClass147_3727,
							CutsceneObject.anInterface19_1944, ArchiveBillboardsLoader.instance,
							ParticleProducerDefinition.loader, Class274.aClass364_3093, Class54.shaders, 0);
					Class49.aClass132_580 = Class49.aClass134_581.createFont(
							FontSpecification.create(Class80.fonts, 1909085029 * Class24.p11FullIndex, 0),
							ImageUtils.load(DequeIterator.images, 1909085029 * Class24.p11FullIndex, 0), true);
				}
				for (Class480_Sub2 class480_sub2 = (Class480_Sub2) Class49.aClass644_579.head(); null != class480_sub2; class480_sub2 = (Class480_Sub2) Class49.aClass644_579
						.next()) {
					ItemDefinition.loader.getSprite(Class49.aClass134_581, toolkit,
							446648719 * class480_sub2.anInt9973, class480_sub2.anInt9971 * 602658431,
							class480_sub2.anInt9972 * 587801107, 1730769447 * class480_sub2.anInt9970, false, false,
							1896582689 * class480_sub2.anInt9974, Class49.aClass132_580,
							class480_sub2.aBool9975 ? Client.localPlayer.appearance : null, Mob.defaults);
					class480_sub2.unlink();
				}
			}
		}
	}

	public QuickChatMessage message;
	public int id;
	public int[] anIntArray3818;

}