package com.jagex;

public class Class545 {

	static void method9300(Class498 class498, int i, int i_2_, int i_3_, Model class143) {
		if (class143 != null) {
			class498.method8679(i, i_2_, i_3_, class143.method2920(), class143.minimumX(), class143.method2923(),
					class143.minimumY(), class143.method2931(), class143.method2886(), class143.maximumZ());
		}
	}

	static void method9301(Toolkit toolkit, int i, int i_5_, Widget widget, ClippingMask clipping, int i_6_, int i_7_) {
		for (int index = 0; index < 1746328619 * Client.npcCount; index++) {
			LinkableObject<Npc> linkable = Client.npcs.get(Client.npcIndices[index]);
			if (null != linkable) {
				Npc npc = linkable.object;

				if (npc.hasDefinition() && Client.localPlayer.plane == npc.plane) {
					NpcDefinition definition = npc.definition;
					if (null != definition && null != definition.morphisms) {
						definition = definition.morph(PlayerVariableProvider.instance, PlayerVariableProvider.instance);
					}

					if (null != definition && definition.drawMapdot && definition.aBool3052) {
						Class397 class397 = npc.method10164().aClass397_4507;
						int i_10_ = (int) class397.x / 128 - i / 128;
						int i_11_ = (int) class397.z / 128 - i_5_ / 128;

						if (-1 != definition.mapFunction * -27195067) {
							Widget.method7346(toolkit, clipping, widget, i_6_, i_7_, i_10_, i_11_,
									definition.mapFunction * -27195067, -541076374);
						} else {
							Class369.method6107(widget, clipping, i_6_, i_7_, i_10_, i_11_, Client.mapDots[1]);
						}
					}
				}
			}
		}
	}

	Class545() throws Throwable {
		throw new Error();
	}

}