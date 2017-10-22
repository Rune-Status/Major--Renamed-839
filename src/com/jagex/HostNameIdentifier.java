package com.jagex;

import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class HostNameIdentifier implements Runnable {

	public static void method1377(boolean force) {
		TurnMobCutsceneAction.aClass186_9434.method3615();

		if (BaseAnimationDefinitionProvider.method3320(-1501875989 * Client.gameState)) {
			for (BufferedConnectionContext context : Client.connectionContexts) {
				context.idleWritePulses += -1224738573;
				if (context.idleWritePulses * 1834999867 < 50 && !force) {
					return;
				}

				context.idleWritePulses = 0;
				if (!context.error && context.getConnection() != null) {
					OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.KEEP_ALIVE, context.encryptor);
					context.sendFrame(frame);

					try {
						context.flush();
					} catch (IOException ioexception) {
						context.error = true;
					}
				}
			}

			TurnMobCutsceneAction.aClass186_9434.method3615();
		}
	}

	public static String method1378(MenuOption class480_sub31_sub17) {
		if (Class56.menuOpen || class480_sub31_sub17 == null) {
			return "";
		}

		int[] is = Widget.method4318(class480_sub31_sub17);
		if (is == null) {
			return "";
		}

		return UrlResourceRequest.method1572(is);
	}

	static final void decodeRegionUpdate(RegionUpdateType update) {
		FrameBuffer buffer = Client.gameConnection.buffer;

		if (update == RegionUpdateType.aClass358_3833) {
			int positionOffset = buffer.readUByte();
			int x = (positionOffset >> 4 & 0x7) + Class185.localRegionX * 1507881063;
			int z = 1606151957 * Class164.localRegionZ + (positionOffset & 0x7);
			int i_5_ = buffer.readUShort();
			if (i_5_ == 65535) {
				i_5_ = -1;
			}

			int packed = buffer.readUByte();
			int i_7_ = packed >> 4 & 0xf;
			int i_8_ = packed & 0x7;
			int i_9_ = buffer.readUByte();
			int i_10_ = buffer.readUByte();
			int i_11_ = buffer.readUShort();

			if (Client.aClass460_10760.method7675() != Class458.aClass458_5152) {
				if (x >= 0 && z >= 0 && x < Client.aClass460_10760.method7680()
						&& z < Client.aClass460_10760.method7707()) {
					int distance = 1 + i_7_;
					if (Client.localPlayer.pathX[0] >= x - distance && Client.localPlayer.pathX[0] <= distance + x
							&& Client.localPlayer.pathZ[0] >= z - distance
							&& Client.localPlayer.pathZ[0] <= distance + z) {
						Class397 class397 = new Class397(x << 9, 0.0F, z << 9);
						int i_13_ = -1123616625 * BaseVarpDefinitionLoader.anInt1129;
						TurnMobCutsceneAction.aClass186_9434.method3710(Class171.aClass171_1947, i_5_, i_8_, i_10_,
								Class156.aClass156_1876.method3293(), Class167.aClass167_1927, 0.0F, i_7_ << 9,
								class397, i_13_, i_11_, i_9_);
					}
				}
			}
		} else if (RegionUpdateType.SET_GROUND_ITEM_AMOUNT == update) {
			int positionOffset = buffer.readUByte();
			Class553 class553 = Client.aClass460_10760.method7679();
			int localZ = (positionOffset & 0x7) + 1606151957 * Class164.localRegionZ;
			int z = -180305283 * class553.z + localZ;
			int localX = 1507881063 * Class185.localRegionX + (positionOffset >> 4 & 0x7);
			int x = class553.x * 2051316501 + localX;
			int id = buffer.readUShort();
			int oldAmount = buffer.readUShort();
			int amount = buffer.readUShort();

			if (Client.groundItems != null) {
				ItemDeque deque = Client.groundItems.get(-1123616625 * BaseVarpDefinitionLoader.anInt1129 << 28
						| z << 14 | x);
				if (null != deque) {
					for (Item next = deque.items.head(); null != next; next = deque.items.next()) {
						if (id == 1659909117 * next.id && oldAmount == next.amount * 392072967) {
							next.unlink();
							next.amount = amount * -1157124425;
							Item.addGroundItem(next, x, z, BaseVarpDefinitionLoader.anInt1129 * -1123616625);
							break;
						}
					}

					if (localX >= 0 && localZ >= 0 && localX < Client.aClass460_10760.method7680()
							&& localZ < Client.aClass460_10760.method7707()) {
						FloatRaster.method1727(-1123616625 * BaseVarpDefinitionLoader.anInt1129, localX, localZ);
					}
				}
			}
		} else if (RegionUpdateType.SPAWN_PUBLIC_GROUND_ITEM == update) {
			int positionOffset = buffer.readNegatedUByte();
			Class553 class553 = Client.aClass460_10760.method7679();
			int localZ = 1606151957 * Class164.localRegionZ + (positionOffset & 0x7);
			int z = -180305283 * class553.z + localZ;
			int localX = (positionOffset >> 4 & 0x7) + 1507881063 * Class185.localRegionX;
			int x = class553.x * 2051316501 + localX;
			int id = buffer.readUShortA();
			int owner = buffer.readLEUShortA();
			int amount = buffer.readLEUShortA();

			if (owner != Client.localPlayerIndex * -406165969) {
				boolean bool = localX >= 0 && localZ >= 0 && localX < Client.aClass460_10760.method7680()
						&& localZ < Client.aClass460_10760.method7707();
				if (bool || Client.aClass460_10760.method7675().method7536()) {
					Item.addGroundItem(new Item(id, amount), x, z, -1123616625 * BaseVarpDefinitionLoader.anInt1129);

					if (bool) {
						FloatRaster.method1727(BaseVarpDefinitionLoader.anInt1129 * -1123616625, localX, localZ);
					}
				}
			}
		} else if (RegionUpdateType.REMOVE_GROUND_ITEM == update) {
			int id = buffer.readUShortA();
			int positionOffset = buffer.readUByte();
			Class553 class553 = Client.aClass460_10760.method7679();
			int localZ = Class164.localRegionZ * 1606151957 + (positionOffset & 0x7);
			int z = class553.z * -180305283 + localZ;
			int localX = (positionOffset >> 4 & 0x7) + 1507881063 * Class185.localRegionX;
			int x = class553.x * 2051316501 + localX;

			ItemDeque deque = Client.groundItems.get(-1123616625 * BaseVarpDefinitionLoader.anInt1129 << 28 | z << 14
					| x);
			if (deque != null) {
				for (Item item = deque.items.head(); item != null; item = deque.items.next()) {
					if (item.id * 1659909117 == id) {
						item.unlink();
						break;
					}
				}

				if (deque.items.isEmpty()) {
					deque.unlink();
				}

				if (localX >= 0 && localZ >= 0 && localX < Client.aClass460_10760.method7680()
						&& localZ < Client.aClass460_10760.method7707()) {
					FloatRaster.method1727(-1123616625 * BaseVarpDefinitionLoader.anInt1129, localX, localZ);
				}
			}
		} else if (RegionUpdateType.aClass358_3820 == update) {
			buffer.readUByte();
			int positionOffset = buffer.readUByte();
			int localX = Class185.localRegionX * 1507881063 + (positionOffset >> 4 & 0x7);
			int localZ = (positionOffset & 0x7) + 1606151957 * Class164.localRegionZ;
			int longetivity = buffer.readUShort();
			int heightOffset = buffer.readUByte();
			int i_41_ = buffer.readUTriByte();
			String string = buffer.readString();

			if (Client.aClass460_10760.method7675() != Class458.aClass458_5152) {
				Class477_Sub6.create(-1123616625 * BaseVarpDefinitionLoader.anInt1129, localX, localZ, heightOffset,
						longetivity, i_41_, string);
			}
		} else if (RegionUpdateType.aClass358_3829 == update) {
			int positionOffset = buffer.readUByte();
			int localX = (positionOffset >> 4 & 0x7) + Class185.localRegionX * 1507881063;
			int localZ = (positionOffset & 0x7) + Class164.localRegionZ * 1606151957;
			int i_45_ = buffer.readUShort();
			if (i_45_ == 65535) {
				i_45_ = -1;
			}

			int packed = buffer.readUByte();
			int i_47_ = packed >> 4 & 0xf;
			int i_48_ = packed & 0x7;
			int i_49_ = buffer.readUByte();
			int i_50_ = buffer.readUByte();
			int i_51_ = buffer.readUShort();
			boolean bool = buffer.readUByte() == 1;

			if (Client.aClass460_10760.method7675() != Class458.aClass458_5152) {
				if (localX >= 0 && localZ >= 0 && localX < Client.aClass460_10760.method7680()
						&& localZ < Client.aClass460_10760.method7707()) {
					int distance = i_47_ + 1;
					if (Client.localPlayer.pathX[0] >= localX - distance
							&& Client.localPlayer.pathX[0] <= localX + distance
							&& Client.localPlayer.pathZ[0] >= localZ - distance
							&& Client.localPlayer.pathZ[0] <= localZ + distance) {
						Class397 class397 = new Class397(localX << 9, 0.0F, localZ << 9);
						int i_53_ = BaseVarpDefinitionLoader.anInt1129 * -1123616625;
						int i_54_ = bool ? Class156.aClass156_1877.method3293() : Class156.aClass156_1876.method3293();
						TurnMobCutsceneAction.aClass186_9434.method3710(Class171.aClass171_1947, i_45_, i_48_, i_50_,
								i_54_, Class167.aClass167_1927, 0.0F, i_47_ << 9, class397, i_53_, i_51_, i_49_);
					}
				}
			}
		} else if (RegionUpdateType.SPAWN_PRIVATE_GROUND_ITEM == update) {
			int id = buffer.readUShort();
			int positionOffset = buffer.readUByteS();
			Class553 class553 = Client.aClass460_10760.method7679();
			int localZ = 1606151957 * Class164.localRegionZ + (positionOffset & 0x7);
			int z = localZ + class553.z * -180305283;
			int localX = Class185.localRegionX * 1507881063 + (positionOffset >> 4 & 0x7);
			int x = localX + 2051316501 * class553.x;
			int amount = buffer.readLEUShortA();
			boolean bool = localX >= 0 && localZ >= 0 && localX < Client.aClass460_10760.method7680()
					&& localZ < Client.aClass460_10760.method7707();

			if (bool || Client.aClass460_10760.method7675().method7536()) {
				Item.addGroundItem(new Item(id, amount), x, z, BaseVarpDefinitionLoader.anInt1129 * -1123616625);

				if (bool) {
					FloatRaster.method1727(-1123616625 * BaseVarpDefinitionLoader.anInt1129, localX, localZ);
				}
			}
		} else if (update == RegionUpdateType.SPAWN_ANIMABLE) {
			int positionOffset = buffer.readUByte();
			int localX = (positionOffset >> 4 & 0x7) + 1507881063 * Class185.localRegionX;
			int localZ = 1606151957 * Class164.localRegionZ + (positionOffset & 0x7);

			int graphic = buffer.readUShort();
			if (graphic == 65535) {
				graphic = -1;
			}

			int heightOffset = buffer.readUShort();
			int i_67_ = buffer.readUShort();
			int i_68_ = buffer.readUByte();
			int i_69_ = buffer.readShort();
			if (Client.aClass460_10760.method7675() != Class458.aClass458_5152) {
				if (localX >= 0 && localZ >= 0 && localX < Client.aClass460_10760.method7680()
						&& localZ < Client.aClass460_10760.method7707()) {
					if (graphic == -1) {
						CacheableAnimatedObject cached = Client.animatedObjects.get(localX << 16 | localZ);
						if (cached != null) {
							cached.animated.method18224();
							cached.unlink();
						}
					} else {
						int worldX = 256 + 512 * localX;
						int worldZ = localZ * 512 + 256;
						int collisionPlane = -1123616625 * BaseVarpDefinitionLoader.anInt1129;

						if (collisionPlane < 3 && Client.aClass460_10760.method7775().isBridge(localX, localZ)) {
							collisionPlane++;
						}

						AnimatedObject animable = new AnimatedObject(Client.aClass460_10760.method7687(), graphic,
								i_67_, BaseVarpDefinitionLoader.anInt1129 * -1123616625, collisionPlane, worldX,
								Class279.getAverageHeight(worldX, worldZ, BaseVarpDefinitionLoader.anInt1129
										* -1123616625)
										- heightOffset, worldZ, localX, localX, localZ, localZ, i_68_, false, i_69_);
						Client.animatedObjects.put(localX << 16 | localZ, new CacheableAnimatedObject(animable));
					}
				}
			}
		} else if (RegionUpdateType.aClass358_3824 == update) {
			int packed = buffer.readUByte();
			int type = packed >> 2;
			int orientation = packed & 0x3;
			int group = Client.OBJECT_GROUPS[type];
			int positionOffset = buffer.readUByte();
			int localX = (positionOffset >> 4 & 0x7) + 1507881063 * Class185.localRegionX;
			int localZ = (positionOffset & 0x7) + Class164.localRegionZ * 1606151957;

			if (Client.aClass460_10760.method7675().method7536() || localX >= 0 && localZ >= 0
					&& localX < Client.aClass460_10760.method7680() && localZ < Client.aClass460_10760.method7707()) {
				FullScreenAdapter.method13393(-1123616625 * BaseVarpDefinitionLoader.anInt1129, localX, localZ, group,
						-1, type, orientation);
			}
		} else if (update == RegionUpdateType.aClass358_3826) {
			int id = buffer.readInt();
			int type = buffer.readUByte();
			Client.aClass460_10760.getObjectLoader().get(id).typeLoaded(type);
		} else if (update == RegionUpdateType.aClass358_3823) {
			int packed = buffer.readNegatedUByte();
			int type = packed >> 2;
			int group = Client.OBJECT_GROUPS[type];
			int positionOffset = buffer.readUByteS();
			int localX = Class185.localRegionX * 1507881063 + (positionOffset >> 4 & 0x7);
			int localZ = (positionOffset & 0x7) + Class164.localRegionZ * 1606151957;
			int attributes = buffer.readUByteA();
			int i_89_ = buffer.readLEInt();

			if (ObjectCategory.aClass541_7357.type * -1050493863 == type) {
				type = -1050493863 * ObjectCategory.aClass541_7338.type;
			}

			if ((attributes & 0x1) == 1) {
				SocketProvider.method13762(-1123616625 * BaseVarpDefinitionLoader.anInt1129, localX, localZ, group,
						i_89_, type, null);
			} else {
				int[] is = null;
				if ((attributes & 0x2) == 2) {
					int count = buffer.readUByte();
					is = new int[count];

					for (int index = 0; index < count; index++) {
						is[index] = buffer.readInt();
					}
				}

				short[] is_92_ = null;
				if ((attributes & 0x4) == 4) {
					int count = buffer.readUByte();
					is_92_ = new short[count];

					for (int index = 0; index < count; index++) {
						is_92_[index] = (short) buffer.readUShort();
					}
				}

				short[] is_95_ = null;
				if (8 == (attributes & 0x8)) {
					int count = buffer.readUByte();
					is_95_ = new short[count];

					for (int index = 0; index < count; index++) {
						is_95_[index] = (short) buffer.readUShort();
					}
				}

				SocketProvider
						.method13762(-1123616625 * BaseVarpDefinitionLoader.anInt1129, localX, localZ, group, i_89_,
								type,
								new Class540(2098922587613350483L * Class480_Sub12.aLong10071, is, is_92_, is_95_));
				Class480_Sub12.aLong10071 += 3866542625567148507L;
			}
		} else if (update == RegionUpdateType.SPAWN_PROJECTILE) {
			int positionOffset = buffer.readUByte();
			boolean bool = 0 != (positionOffset & 0x80);
			int localX = Class185.localRegionX * 1507881063 + (positionOffset >> 3 & 0x7);
			int localZ = (positionOffset & 0x7) + Class164.localRegionZ * 1606151957;
			int targetX = localX + buffer.readByte();
			int targetZ = localZ + buffer.readByte();
			int targetIndex = buffer.readShort();
			int graphic = buffer.readUShort();
			int i_105_ = buffer.readUByte() * 4;
			int heightOffset_ = buffer.readUByte() * 4;
			int delay = buffer.readUShort();
			int longetivity = buffer.readUShort();
			int verticalPitch = buffer.readUByte();
			int initialDisplacement = buffer.readUShort();
			int i_111_ = buffer.readShort();

			if (verticalPitch == 255) {
				verticalPitch = -1;
			}

			if (Client.aClass460_10760.method7675() != Class458.aClass458_5152) {
				if (localX >= 0 && localZ >= 0 && localX < Client.aClass460_10760.method7680()
						&& localZ < Client.aClass460_10760.method7707() && targetX >= 0 && targetZ >= 0
						&& targetX < Client.aClass460_10760.method7680()
						&& targetZ < Client.aClass460_10760.method7707() && 65535 != graphic) {
					localX = 512 * localX + 256;
					localZ = 256 + localZ * 512;
					targetX = targetX * 512 + 256;
					targetZ = targetZ * 512 + 256;
					i_105_ <<= 2;
					heightOffset_ <<= 2;
					initialDisplacement <<= 2;

					Projectile projectile = new Projectile(Client.aClass460_10760.method7687(), graphic,
							BaseVarpDefinitionLoader.anInt1129 * -1123616625, BaseVarpDefinitionLoader.anInt1129
									* -1123616625, localX, localZ, i_105_, delay + Client.tick, longetivity
									+ Client.tick, verticalPitch, initialDisplacement, 0, targetIndex, heightOffset_,
							bool, -1, i_111_);
					projectile.target(
							targetX,
							targetZ,
							Class279.getAverageHeight(targetX, targetZ, BaseVarpDefinitionLoader.anInt1129
									* -1123616625)
									- heightOffset_, Client.tick + delay);
					Client.projectiles.pushBack(new CacheableProjectile(projectile));
				}
			}
		} else if (RegionUpdateType.ANIMATE_OBJECT == update) {
			int i_112_ = buffer.readUByteS();
			int positionOffset = buffer.readUByte();
			int x = (positionOffset >> 4 & 0x7) + Class185.localRegionX * 1507881063;
			int z = (positionOffset & 0x7) + Class164.localRegionZ * 1606151957;
			int packed = buffer.readUByteA();
			int type = packed >> 2;
			int orientation = packed & 0x3;
			int group = Client.OBJECT_GROUPS[type];
			int animation = buffer.readInt();

			if (Client.aClass460_10760.method7675() != Class458.aClass458_5152) {
				Class540.animateObject(BaseVarpDefinitionLoader.anInt1129 * -1123616625, x, z, group, type,
						orientation, animation, i_112_);
			}
		} else if (RegionUpdateType.SPAWN_FIRED_PROJECTILE == update) {
			int positionOffset = buffer.readUByte();
			int originX = (positionOffset >> 4 & 0xf) + -1279205170 * Class185.localRegionX;
			int originZ = (positionOffset & 0xf) + -1082663382 * Class164.localRegionZ;
			int i_124_ = buffer.readUByte();
			boolean bool = (i_124_ & 0x1) != 0;
			boolean bool_125_ = 0 != (i_124_ & 0x2);
			int i_126_ = bool_125_ ? i_124_ >> 2 : -1;
			int targetX = originX + buffer.readByte();
			int targetZ = originZ + buffer.readByte();
			int index = buffer.readShort();
			int targetIndex = buffer.readShort();
			int graphic = buffer.readUShort();
			int initialHeight = buffer.readUByte();

			if (bool_125_) {
				initialHeight = (byte) initialHeight;
			} else {
				initialHeight *= 4;
			}

			int heightOffset = buffer.readUByte() * 4;
			int delay = buffer.readUShort();
			int longetivity = buffer.readUShort();
			int verticalPitch = buffer.readUByte();
			int initialDisplacement = buffer.readUShort();

			if (verticalPitch == 255) {
				verticalPitch = -1;
			}

			int i_138_ = buffer.readShort();

			if (Client.aClass460_10760.method7675() != Class458.aClass458_5152) {
				if (originX >= 0 && originZ >= 0 && originX < Client.aClass460_10760.method7680() * 2
						&& originZ < Client.aClass460_10760.method7680() * 2 && targetX >= 0 && targetZ >= 0
						&& targetX < Client.aClass460_10760.method7707() * 2
						&& targetZ < Client.aClass460_10760.method7707() * 2 && 65535 != graphic) {
					originX = 256 * originX;
					originZ = 256 * originZ;
					targetX = 256 * targetX;
					targetZ *= 256;
					initialHeight <<= 2;
					heightOffset <<= 2;
					initialDisplacement <<= 2;

					Projectile.create(graphic, index, targetIndex, i_126_, initialHeight, heightOffset, originX,
							originZ, targetX, targetZ, delay, longetivity, verticalPitch, initialDisplacement, bool,
							i_138_);
				}
			}
		} else if (RegionUpdateType.aClass358_3822 == update) {
			int packed = buffer.readUByte();
			int type = packed >> 2;
			int orientation = packed & 0x3;
			int group = Client.OBJECT_GROUPS[type];
			int i_143_ = buffer.readUByteS();
			int localX = (i_143_ >> 4 & 0x7) + 1507881063 * Class185.localRegionX;
			int localZ = (i_143_ & 0x7) + Class164.localRegionZ * 1606151957;
			int i_146_ = buffer.readInt();

			if (Client.aClass460_10760.method7675().method7536() || localX >= 0 && localZ >= 0
					&& localX < Client.aClass460_10760.method7680() && localZ < Client.aClass460_10760.method7707()) {
				FullScreenAdapter.method13393(BaseVarpDefinitionLoader.anInt1129 * -1123616625, localX, localZ, group,
						i_146_, type, orientation);
			}
		} else {
			HitsplatDefinitionProvider.reportError("" + update, new RuntimeException());
			Class495_Sub1.logout(false);
		}
	}

	InetAddress address;
	volatile String host;

	HostNameIdentifier(int ip) throws UnknownHostException {
		address = InetAddress.getByAddress(new byte[] { (byte) (ip >> 24 & 0xff), (byte) (ip >> 16 & 0xff),
				(byte) (ip >> 8 & 0xff), (byte) (ip & 0xff) });
	}

	public String getHostName() {
		return host;
	}

	@Override
	public void run() {
		host = address.getHostName();
	}

}