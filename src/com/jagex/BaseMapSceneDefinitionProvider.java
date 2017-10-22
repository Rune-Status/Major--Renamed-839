package com.jagex;

public abstract class BaseMapSceneDefinitionProvider implements DefinitionProvider<MapSceneDefinition> {

	public static void method745(int i, int i_4_) {
		AsynchronousStreamRequest.anInt4532 = 807429799 * (i - Class495.anInt6849);
		ClanChannelUpdater.anInt3185 = (i_4_ - Class495.anInt6823) * 1001358417;
		Class495_Sub1.anInt10327 = -1164673443;
		Class495_Sub1.anInt10324 = -732309487;
		SpawnObjectCutsceneAction.method15149();
	}

	public static final void method746(String name) {
		if (null != name) {
			String filteredName = Interface.filterName(name, Class189.aClass25_2060);

			if (filteredName != null) {
				for (int index = 0; index < -1763746795 * Client.friendCount; index++) {
					BefriendedPlayer friend = Client.friends[index];
					String friendName = friend.name;
					String filteredFriendName = Interface.filterName(friendName, Class189.aClass25_2060);

					if (Class140.equalNames(name, filteredName, friendName, filteredFriendName)) {
						Client.friendCount -= -32795843;

						for (int i = index; i < -1763746795 * Client.friendCount; i++) {
							Client.friends[i] = Client.friends[1 + i];
						}

						Client.anInt10834 = Client.anInt10823 * 822603117;
						BufferedConnectionContext connection = Client.getActiveConnection();

						OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4038,
								connection.encryptor);
						frame.payload.writeByte(Buffer.encodedStringLength(name));
						frame.payload.writeCString(name);
						connection.sendFrame(frame);
						break;
					}
				}
			}
		}
	}

	Archive images;
	ReferenceCache<Sprite> sprites;

	BaseMapSceneDefinitionProvider(Archive images, int size) {
		this.images = images;
		sprites = new ReferenceCache<Sprite>(size);
	}

	void resizeCache(int size) {
		sprites = new ReferenceCache<Sprite>(size);
	}

	void clear() {
		synchronized (sprites) {
			sprites.clear();
		}
	}

	void clearSoft() {
		synchronized (sprites) {
			sprites.clearSoft();
		}
	}

	void sweep(int age) {
		synchronized (sprites) {
			sprites.sweep(age);
		}
	}

}