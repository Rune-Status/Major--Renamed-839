package com.jagex;

public class MobProvider implements GameCharacterProvider {

	@Override
	public GameCharacter get(MobType type, int index) {
		if (type == MobType.PLAYER) {
			return Client.players[index];
		}

		if (MobType.NPC == type) {
			LinkableObject<Npc> linkable = Client.npcs.get(index);
			if (linkable != null) {
				return linkable.object;
			}
		}

		return null;
	}

}