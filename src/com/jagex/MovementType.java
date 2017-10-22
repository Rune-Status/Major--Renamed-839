package com.jagex;

public class MovementType implements Identifiable {
	public static final MovementType aClass624_8025 = new MovementType(0, (byte) -1);
	public static final MovementType TELEPORTING = new MovementType(1, (byte) 0);
	public static final MovementType RUNNING = new MovementType(3, (byte) 2);
	public static final MovementType aClass624_8029 = new MovementType(4, (byte) 3);
	public static final MovementType WALKING = new MovementType(2, (byte) 1);
	public static final int anInt8031 = 4;

	public static MovementType[] values() {
		return new MovementType[] { aClass624_8025, TELEPORTING, WALKING, RUNNING, aClass624_8029 };
	}

	public static final int method10454(ObjectDefinitionLoader loader, byte[] data, int dx, int dy, int i_14_,
			int i_15_, Class583 class583, Class583 class583_16_) {
		int i_18_ = 0;
		Buffer buffer = new Buffer(data);
		int id = -1;

		for (;;) {
			int idOffset = buffer.readSmarts();
			if (idOffset == 0) {
				break;
			}

			id += idOffset;
			int position = 0;
			boolean skip = false;
			for (;;) {
				if (skip) {
					int unfinished = buffer.readUSmart();
					if (unfinished == 0) {
						break;
					}

					buffer.readUByte();
				} else {
					int positionOffset = buffer.readUSmart();
					if (positionOffset == 0) {
						break;
					}

					position += positionOffset - 1;
					int localY = position & 0x3f;
					int localX = position >> 6 & 0x3f;
					int i_26_ = buffer.readUByte() >> 2;
					int i_27_ = i_26_ & 0x3;
					i_26_ >>= 2;
					int x = localX + dx;
					int y = dy + localY;
					ObjectDefinition definition = loader.get(id);
					int width;
					int length;

					if (0 == (i_27_ & 0x1)) {
						width = 723391465 * definition.width;
						length = 2076427087 * definition.length;
					} else {
						width = 2076427087 * definition.length;
						length = 723391465 * definition.width;
					}

					if (x < i_14_ && y < i_15_ && x + width >= 0 && y + length >= 0) {
						if (i_26_ != -1050493863 * ObjectCategory.aClass541_7358.type
								|| Class199.preferences.groundDecoration.getValue() != 0
								|| definition.anInt7389 * -1893691057 != 0 || definition.anInt7367 * 383562139 == 1
								|| definition.aBool7420) {
							if (!definition.method9245(class583_16_)) {
								class583.anInt7770 = id * 1723557403;
								i_18_++;
							}

							skip = true;
						}
					}
				}
			}
		}
		return i_18_;
	}

	static final void method10452() {
		if (Client.aFloat10708 < 1099.0F) {
			Client.aFloat10708 = 1099.0F;
		}

		if (Client.aFloat10708 > 3007.0F) {
			Client.aFloat10708 = 3007.0F;
		}

		for (; Client.aFloat10787 >= 16384.0F; Client.aFloat10787 -= 16384.0F) {

		}

		for (; Client.aFloat10787 < 0.0F; Client.aFloat10787 += 16384.0F) {

		}

		TileFlags flags = Client.aClass460_10760.method7775();
		Class490 class490 = Client.aClass460_10760.method7687();
		int centralRegionX = -55942707 * Class215.anInt2196 >> 9;
		int centralRegionZ = Class115.anInt1444 * -457862351 >> 9;
		int i_3_ = Class279.getAverageHeight(-55942707 * Class215.anInt2196, Class115.anInt1444 * -457862351,
				1611577177 * ProxyingVariableLoader.localPlane);
		int i_4_ = 0;

		if (centralRegionX > 3 && centralRegionZ > 3 && centralRegionX < Client.aClass460_10760.method7680() - 4
				&& centralRegionZ < Client.aClass460_10760.method7707() - 4) {
			for (int x = centralRegionX - 4; x <= centralRegionX + 4; x++) {
				for (int z = centralRegionZ - 4; z <= centralRegionZ + 4; z++) {
					int plane = 1611577177 * ProxyingVariableLoader.localPlane;
					if (plane < 3 && flags.isBridge(x, z)) {
						plane++;
					}

					int heightOffset = 0;
					byte[][] is = Client.aClass460_10760.method7688(plane);
					if (is != null) {
						heightOffset = 8 * (is[x][z] & 0xff) << 2;
					}

					if (null != class490.aClass120Array6700 && class490.aClass120Array6700[plane] != null) {
						int i_9_ = i_3_ - (class490.aClass120Array6700[plane].getTileHeight(x, z) - heightOffset);
						if (i_9_ > i_4_) {
							i_4_ = i_9_;
						}
					}
				}
			}
		}

		int i_10_ = 1536 * (i_4_ >> 2);
		if (i_10_ > 786432) {
			i_10_ = 786432;
		}

		if (i_10_ < 262144) {
			i_10_ = 262144;
		}

		if (i_10_ > Client.anInt10717 * 1848927567) {
			Client.anInt10717 += (i_10_ - 1848927567 * Client.anInt10717) / 24 * -316436049;
		} else if (i_10_ < 1848927567 * Client.anInt10717) {
			Client.anInt10717 += (i_10_ - 1848927567 * Client.anInt10717) / 80 * -316436049;
		}
	}

	static int method10453(VariableProvider provider, DefinitionLoader<QuestDefinition> loader) {
		int i_11_ = 0;

		for (int id = 0; id < loader.count(); id++) {
			QuestDefinition quest = loader.get(id);

			if (quest.method4375(provider)) {
				i_11_ += quest.anInt2603 * 527933495;
			}
		}

		return i_11_;
	}

	static final boolean method10455(char c) {
		if (Character.isISOControl(c)) {
			return false;
		} else if (CacheResourceWorker.isAlphaNumeric(c)) {
			return true;
		}

		char[] cs = Class57.aCharArray662;
		for (char c_33_ : cs) {
			if (c == c_33_) {
				return true;
			}
		}
		
		cs = Class57.aCharArray664;
		for (char c_35_ : cs) {
			if (c == c_35_) {
				return true;
			}
		}
		
		return false;
	}

	public int anInt8027;
	public byte id;

	MovementType(int i, byte i_0_) {
		anInt8027 = i * 1699814393;
		id = i_0_;
	}

	public int getSpeed() {
		return 1 + id;
	}

	@Override
	public int getId() {
		return id;
	}

}