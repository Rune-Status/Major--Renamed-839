package com.jagex;

import java.io.IOException;

final class Class27 implements Interface57 {
	static void method787() {
		if (null != Class34.aClass40_450) {
			try {
				int maximumTicks;
				if (0 == -1507527029 * Class34.loginErrors) {
					maximumTicks = 250;
				} else {
					maximumTicks = 2000;
				}

				Class34.loginTicks += 216379739;
				if (-970778925 * Class34.loginTicks > maximumTicks) {
					FriendsChatPlayer.method1538();
				}
				if (Class34.aClass40_450 == Class40.aClass40_542) {
					Client.lobbyConnection.init(
							AsynchronousConnection.create(Class671.lobbyConnectionInfo.createSocket(), 15000),
							Class671.lobbyConnectionInfo.host);
					Client.lobbyConnection.dropFrames();
					OutgoingFrame frame = OutgoingFrame.empty();
					frame.payload.writeByte(HandshakeType.aClass352_3712.type * 1262357869);
					frame.payload.writeShort(0);
					int start = frame.payload.offset * -165875887;
					frame.payload.writeShort(839);
					frame.payload.writeShort(1);
					Class34.anIntArray447 = Class164.method3369(frame);
					int i_2_ = -165875887 * frame.payload.offset;
					frame.payload.writeCString(Client.aString10608);
					frame.payload.writeShort(672060199 * Client.affiliateId);
					frame.payload.writeInt(Client.anInt10597 * -1924912047);
					frame.payload.writeInt(832706251 * Client.anInt10596);
					frame.payload.writeCString(EquipmentDefaults.aString7549);
					frame.payload.writeByte(Client.currentLanguage.getId());
					frame.payload.writeByte(-1589762327 * Client.game.id);
					Class326.readRandom(frame.payload);
					String string = Client.additionalInfo;
					frame.payload.writeByte(string == null ? 0 : 1);

					if (string != null) {
						frame.payload.writeCString(string);
					}

					AsynchronousInputStream.systemInfo.encode(frame.payload);
					frame.payload.offset += 217060311;
					frame.payload.encodeXtea(Class34.anIntArray447, i_2_, -165875887 * frame.payload.offset);
					frame.payload.writeSizeShort(-165875887 * frame.payload.offset - start, -1195126801);
					Client.lobbyConnection.sendFrame(frame);
					Client.lobbyConnection.flush();
					Class34.aClass40_450 = Class40.aClass40_541;
				}
				if (Class34.aClass40_450 == Class40.aClass40_541) {
					if (Client.lobbyConnection.getConnection() == null) {
						FriendsChatPlayer.method1538();
					} else if (Client.lobbyConnection.getConnection().available(1)) {
						Client.lobbyConnection.getConnection().read(Client.lobbyConnection.buffer.payload, 0, 1);
						Class34.aClass653_451 = CompressionType.findIdentifiable(Class653.values(),
								Client.lobbyConnection.buffer.payload[0] & 0xff);
						if (Class653.aClass653_8229 == Class34.aClass653_451) {
							Client.lobbyConnection.encryptor = new IsaacCipher(Class34.anIntArray447);
							int[] is = new int[4];
							for (int i_3_ = 0; i_3_ < 4; i_3_++) {
								is[i_3_] = Class34.anIntArray447[i_3_] + 50;
							}
							Client.lobbyConnection.decryptor = new IsaacCipher(is);
							new IsaacCipher(is);
							Client.lobbyConnection.buffer.setCipher(Client.lobbyConnection.decryptor);
							Class536.setGameState(6);
							Client.lobbyConnection.dropFrames();
							Client.lobbyConnection.buffer.offset = 0;
							Client.lobbyConnection.lastFrame = null;
							Client.lobbyConnection.secondLastFrame = null;
							Client.lobbyConnection.thirdLastFrame = null;
							Client.lobbyConnection.idleReadPulses = 0;
							PlayerVariableProvider.instance.collection.reset();
							PulseEvent.clear();
						} else {
							Client.lobbyConnection.stopConnection();
						}
						Client.lobbyConnection.currentFrame = null;
						Class34.aClass40_450 = null;
					}
				}
			} catch (IOException ioexception) {
				FriendsChatPlayer.method1538();
			}
		}
	}

	static void method788() {
		Class31.aString405 = "";
		Class31.accountPassword = "";
		Class31.aString423 = "";
		Class31.aBool426 = true;
	}

	static final void method789(Class480_Sub12 class480_sub12) {
		Class490 class490 = Client.aClass460_10760.method7687();
		if (null != class490) {
			SceneObject interface55 = null;
			if (class480_sub12.group * -677397461 == 0) {
				interface55 = (SceneObject) class490.method8345(-618261599 * class480_sub12.plane,
						1155137153 * class480_sub12.localX, class480_sub12.localZ * 51547319);
			}
			if (1 == -677397461 * class480_sub12.group) {
				interface55 = (SceneObject) class490.method8347(class480_sub12.plane * -618261599,
						1155137153 * class480_sub12.localX, 51547319 * class480_sub12.localZ);
			}
			if (2 == class480_sub12.group * -677397461) {
				interface55 = (SceneObject) class490.method8349(class480_sub12.plane * -618261599,
						1155137153 * class480_sub12.localX, class480_sub12.localZ * 51547319,
						Client.anInterface57_10904);
			}
			if (class480_sub12.group * -677397461 == 3) {
				interface55 = (SceneObject) class490.method8351(class480_sub12.plane * -618261599,
						class480_sub12.localX * 1155137153, class480_sub12.localZ * 51547319);
			}
			if (null != interface55) {
				class480_sub12.anInt10070 = interface55.getId() * 1052783123;
				class480_sub12.anInt10062 = interface55.method339() * -434992811;
				class480_sub12.anInt10060 = interface55.method377() * -1836104921;
			} else {
				class480_sub12.anInt10070 = -1052783123;
				class480_sub12.anInt10062 = 0;
				class480_sub12.anInt10060 = 0;
			}
		}
	}

	@Override
	public boolean method388(Class600_Sub1_Sub3 class600_sub1_sub3, byte i) {
		return class600_sub1_sub3 instanceof SceneObject && ((SceneObject) class600_sub1_sub3).method363();
	}

}