package com.jagex;

import java.lang.management.GarbageCollectorMXBean;
import java.util.Iterator;

public class Class530 {
	static GarbageCollectorMXBean collector;

	public static void method9021() {
		Class570.aClass667_7644 = new HashTable(8);
		Class570.anInt7643 = 0;
		Iterator<ParticleSystem> iterator = Class570.aList7638.iterator();

		while (iterator.hasNext()) {
			ParticleSystem system = iterator.next();
			system.stop();
		}
	}

	static void sendWindowInfo(BufferedConnectionContext connection) {
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.WINDOW_INFO, connection.encryptor);
		frame.payload.writeByte(RendererType.windowMode());
		frame.payload.writeShort(1319181337 * Engine.screenWidth);
		frame.payload.writeShort(Engine.screenHeight * -551672947);
		frame.payload.writeByte(Class199.preferences.multisample.getValue());
		connection.sendFrame(frame);
	}

	static final void method9026(byte i) {
		byte[][][] is = Client.aClass460_10760.method7694();
		byte i_2_ = (byte) (764752929 * Client.anInt10730 - 4 & 0xff);
		int i_3_ = Client.anInt10730 * 764752929 % Client.aClass460_10760.method7680();
		for (int i_4_ = 0; i_4_ < 4; i_4_++) {
			for (int i_5_ = 0; i_5_ < Client.aClass460_10760.method7707(); i_5_++) {
				is[i_4_][i_3_][i_5_] = i_2_;
			}
		}
		if (3 != ProxyingVariableLoader.localPlane * 1611577177) {
			for (int i_6_ = 0; i_6_ < 2; i_6_++) {
				Client.anIntArray10746[i_6_] = -1000000;
				Client.anIntArray10747[i_6_] = 1000000;
				Client.anIntArray10748[i_6_] = 0;
				Client.anIntArray10750[i_6_] = 1000000;
				Client.anIntArray10749[i_6_] = 0;
			}
			Class397 class397 = Client.localPlayer.method10164().aClass397_4507;
			TileFlags class425 = Client.aClass460_10760.method7775();
			Class490 class490 = Client.aClass460_10760.method7687();
			if (Connection.anInt7170 * 1212513917 == 2 || Connection.anInt7170 * 1212513917 == 3
					|| -1 != 1601470857 * Class156.anInt1886) {
				Class553 class553 = Client.aClass460_10760.method7679();
				int i_7_;
				int i_8_;
				if (3 == Connection.anInt7170 * 1212513917) {
					Class397 class397_9_ = Class369.aClass261_Sub1_4079.method4834().method13222((byte) 1);
					if (Float.isNaN(class397_9_.x)) {
						return;
					}
					i_7_ = (int) class397_9_.x - (2051316501 * class553.x << 9);
					i_8_ = (int) class397_9_.z - (class553.z * -180305283 << 9);
					if (i_7_ < 0
							|| i_8_ < 0
							|| i_7_ >> 9 >= class425.flags[1611577177 * ProxyingVariableLoader.localPlane].length
							|| i_8_ >> 9 >= class425.flags[1611577177 * ProxyingVariableLoader.localPlane][i_7_ >> 9].length) {
						return;
					}
				} else if (2 == Connection.anInt7170 * 1212513917) {
					i_7_ = (int) class397.x;
					i_8_ = (int) class397.z;
				} else {
					i_7_ = Class156.anInt1886 * 1601470857;
					i_8_ = TurnMobCutsceneAction.anInt9433 * 56240793;
				}
				if (0 != (class425.flags[1611577177 * ProxyingVariableLoader.localPlane][i_7_ >> 9][i_8_ >> 9] & 0x4)) {
					Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706, 0, i_7_ >> 9, i_8_ >> 9,
							false, -1907978845);
				} else {
					int i_10_;
					int i_11_;
					if (1212513917 * Connection.anInt7170 == 3) {
						Class397 class397_12_ = Class369.aClass261_Sub1_4079.method4876().method5224();
						i_10_ = ((int) class397_12_.x >> 9) - 2051316501 * class553.x;
						i_11_ = ((int) class397_12_.z >> 9) - -180305283 * class553.z;
						if (i_10_ < 0
								|| i_11_ < 0
								|| i_10_ >= class425.flags[ProxyingVariableLoader.localPlane * 1611577177].length
								|| i_11_ >= class425.flags[ProxyingVariableLoader.localPlane * 1611577177][i_10_].length) {
							return;
						}
					} else {
						i_10_ = 2006359481 * Client.cameraX >> 9;
						i_11_ = Wall.cameraZ * 1829446257 >> 9;
					}
					int i_13_ = i_7_ >> 9;
					int i_14_ = i_8_ >> 9;
					if (class425.method7066(i_10_, i_11_)) {
						int i_15_ = Class279
								.getAverageHeight(Client.cameraX * 2006359481, 1829446257 * Wall.cameraZ, 3);
						if (Class268.cameraY * 1525233901 >= i_15_) {
							Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706, 1, i_10_, i_11_,
									false, 937019418);
						}
					} else {
						while_7_: do {
							if (912649057 * Class155.anInt1874 < 2560) {
								int i_16_;
								if (i_13_ > i_10_) {
									i_16_ = i_13_ - i_10_;
								} else {
									i_16_ = i_10_ - i_13_;
								}
								int i_17_;
								if (i_14_ > i_11_) {
									i_17_ = i_14_ - i_11_;
								} else {
									i_17_ = i_11_ - i_14_;
								}
								if (i_16_ == 0 && 0 == i_17_ || i_16_ <= -Client.aClass460_10760.method7680()
										|| i_16_ >= Client.aClass460_10760.method7680()
										|| i_17_ <= -Client.aClass460_10760.method7707()
										|| i_17_ >= Client.aClass460_10760.method7707()) {
									if (Connection.anInt7170 * 1212513917 != 3) {
										HitsplatDefinitionProvider.reportError(
												new StringBuilder().append(i_10_).append(Class60.COMMA).append(i_11_)
														.append(" ").append(i_13_).append(Class60.COMMA).append(i_14_)
														.append(" ").append(2051316501 * class553.x)
														.append(Class60.COMMA).append(-180305283 * class553.z)
														.toString(), new RuntimeException());
									}
									break;
								}
								if (i_16_ > i_17_) {
									int i_18_ = 65536 * i_17_ / i_16_;
									int i_19_ = 32768;
									while_6_: do {
										for (;;) {
											if (i_13_ == i_10_) {
												break while_6_;
											}
											if (i_10_ < i_13_) {
												i_10_++;
											} else if (i_10_ > i_13_) {
												i_10_--;
											}
											if ((class425.flags[ProxyingVariableLoader.localPlane * 1611577177][i_10_][i_11_] & 0x4) != 0) {
												Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706,
														1, i_10_, i_11_, false, 366908592);
												break while_6_;
											}
											if (i_11_ + 1 < class425.flags[ProxyingVariableLoader.localPlane * 1611577177][i_10_].length
													&& 0 != (class425.flags[1611577177 * ProxyingVariableLoader.localPlane][i_10_][1 + i_11_] & 0x4)) {
												Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706,
														1, i_10_, 1 + i_11_, false, -1511304944);
												break while_6_;
											}
											if (i_11_ > 0
													&& (class425.flags[ProxyingVariableLoader.localPlane * 1611577177][i_10_][i_11_ - 1] & 0x4) != 0) {
												Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706,
														1, i_10_, i_11_ - 1, false, -1713049728);
												break while_6_;
											}
											i_19_ += i_18_;
											if (i_19_ >= 65536) {
												i_19_ -= 65536;
												if (i_11_ < i_14_) {
													i_11_++;
													if (1 + i_11_ < class425.flags[1611577177 * ProxyingVariableLoader.localPlane][i_10_].length
															&& (class425.flags[1611577177 * ProxyingVariableLoader.localPlane][i_10_][1 + i_11_] & 0x4) != 0) {
														Class480_Sub31_Sub2.method17300(
																class490.aClass489ArrayArrayArray6706, 1, i_10_,
																i_11_ + 1, false, 429865690);
														break while_6_;
													}
												} else if (i_11_ > i_14_
														&& --i_11_ > 0
														&& (class425.flags[1611577177 * ProxyingVariableLoader.localPlane][i_10_][i_11_ - 1] & 0x4) != 0) {
													break;
												}
											}
										}
										Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706, 1,
												i_10_, i_11_ - 1, false, 1638968047);
									} while (false);
								} else {
									int i_20_ = i_16_ * 65536 / i_17_;
									int i_21_ = 32768;
									for (;;) {
										if (i_11_ == i_14_) {
											break while_7_;
										}
										if (i_11_ < i_14_) {
											i_11_++;
										} else if (i_11_ > i_14_) {
											i_11_--;
										}
										if ((class425.flags[1611577177 * ProxyingVariableLoader.localPlane][i_10_][i_11_] & 0x4) != 0) {
											Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706, 1,
													i_10_, i_11_, false, 361781745);
											break while_7_;
										}
										if (1 + i_10_ < class425.flags[1611577177 * ProxyingVariableLoader.localPlane].length
												&& 0 != (class425.flags[ProxyingVariableLoader.localPlane * 1611577177][1 + i_10_][i_11_] & 0x4)) {
											Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706, 1,
													i_10_ + 1, i_11_, false, 837135482);
											break while_7_;
										}
										if (i_10_ > 0
												&& (class425.flags[1611577177 * ProxyingVariableLoader.localPlane][i_10_ - 1][i_11_] & 0x4) != 0) {
											Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706, 1,
													i_10_ - 1, i_11_, false, -239819047);
											break while_7_;
										}
										i_21_ += i_20_;
										if (i_21_ >= 65536) {
											i_21_ -= 65536;
											if (i_10_ < i_13_) {
												if (++i_10_ + 1 < class425.flags[1611577177 * ProxyingVariableLoader.localPlane].length
														&& 0 != (class425.flags[ProxyingVariableLoader.localPlane * 1611577177][i_10_ + 1][i_11_] & 0x4)) {
													Class480_Sub31_Sub2.method17300(
															class490.aClass489ArrayArrayArray6706, 1, i_10_ + 1, i_11_,
															false, -1202586804);
													break while_7_;
												}
											} else if (i_10_ > i_13_
													&& --i_10_ > 0
													&& (class425.flags[ProxyingVariableLoader.localPlane * 1611577177][i_10_ - 1][i_11_] & 0x4) != 0) {
												break;
											}
										}
									}
									Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706, 1,
											i_10_ - 1, i_11_, false, 1677383084);
								}
							}
						} while (false);
					}
				}
			} else {
				int i_22_ = Class279.getAverageHeight(2006359481 * Client.cameraX, Wall.cameraZ * 1829446257,
						ProxyingVariableLoader.localPlane * 1611577177);
				if (i_22_ - Class268.cameraY * 1525233901 < 3200
						&& (class425.flags[ProxyingVariableLoader.localPlane * 1611577177][2006359481 * Client.cameraX >> 9][1829446257 * Wall.cameraZ >> 9] & 0x4) != 0) {
					Class480_Sub31_Sub2.method17300(class490.aClass489ArrayArrayArray6706, 1,
							Client.cameraX * 2006359481 >> 9, 1829446257 * Wall.cameraZ >> 9, false, -763590060);
				}
			}
		}
	}

	static void method9027(int i, int i_23_) {
		for (Linkable class480 = Client.aClass667_10846.first(); null != class480; class480 = Client.aClass667_10846
				.next()) {
			if ((class480.linkedKey * -4821875126325281949L >> 48 & 0xffffL) == i) {
				class480.unlink();
			}
		}
	}

	static boolean method9028(int i) {
		if (18 == i || 19 == i || i == 20 || i == 21 || 22 == i || i == 1004) {
			return true;
		}
		return 17 == i;
	}

	Class530() throws Throwable {
		throw new Error();
	}
}
