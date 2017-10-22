package com.jagex;

public class Class467_Sub2 extends Class467 {
	static final void method15326(ScriptExecutionContext class613, byte i) {
		int i_3_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_3_);
		Interface class221 = Class598.loadedInterfaces[i_3_ >> 16];
		ScriptExecutionContext.method1632(class226, class221, class613);
	}

	static void method15327(MenuOption class480_sub31_sub17, int i, int i_4_, boolean bool) {
		if (null != class480_sub31_sub17 && MenuOption.options.tail != class480_sub31_sub17) {
			int i_6_ = class480_sub31_sub17.secondary * -1800080575;
			int i_7_ = class480_sub31_sub17.tertiary * 1353485821;
			int i_8_ = class480_sub31_sub17.type * -20536735;
			int i_9_ = (int) (class480_sub31_sub17.primary * -1867655888037237139L);
			long l = -1867655888037237139L * class480_sub31_sub17.primary;
			if (i_8_ >= 2000) {
				i_8_ -= 2000;
			}
			Class553 class553 = Client.aClass460_10760.method7679();
			if (17 == i_8_) {
				Client.anInt10737 = i * -1837674915;
				Client.anInt10738 = i_4_ * 1535894177;
				Client.anInt10731 = -216409942;
				Client.anInt10679 = 0;
				OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3951,
						Client.gameConnection.encryptor);
				class480_sub15.payload.writeLEShortA(-800680953 * Client.anInt10756);
				class480_sub15.payload.writeShortA(Client.anInt10867 * -224153241);
				class480_sub15.payload.writeShortA(i_7_ + class553.z * -180305283);
				class480_sub15.payload.writeLEShort(i_9_);
				class480_sub15.payload.writeByteA(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
				class480_sub15.payload.writeInt(Class490.anInt6751 * 1969702363);
				class480_sub15.payload.writeShortA(i_6_ + 2051316501 * class553.x);
				Client.gameConnection.sendFrame(class480_sub15);
				Class20.method728(i_6_, i_7_);
			}
			OutgoingFrameMeta class366 = null;
			if (i_8_ == 44) {
				class366 = OutgoingFrameMeta.aClass366_3982;
			} else if (45 == i_8_) {
				class366 = OutgoingFrameMeta.aClass366_4023;
			} else if (i_8_ == 46) {
				class366 = OutgoingFrameMeta.aClass366_3942;
			} else if (i_8_ == 47) {
				class366 = OutgoingFrameMeta.aClass366_4021;
			} else if (48 == i_8_) {
				class366 = OutgoingFrameMeta.aClass366_3967;
			} else if (49 == i_8_) {
				class366 = OutgoingFrameMeta.aClass366_3975;
			} else if (i_8_ == 50) {
				class366 = OutgoingFrameMeta.aClass366_3972;
			} else if (51 == i_8_) {
				class366 = OutgoingFrameMeta.aClass366_3965;
			} else if (i_8_ == 52) {
				class366 = OutgoingFrameMeta.aClass366_3974;
			} else if (i_8_ == 53) {
				class366 = OutgoingFrameMeta.aClass366_4028;
			}
			if (class366 != null) {
				Player class600_sub1_sub3_sub1_sub1 = Client.players[i_9_];
				if (class600_sub1_sub3_sub1_sub1 != null) {
					Client.anInt10737 = i * -1837674915;
					Client.anInt10738 = i_4_ * 1535894177;
					Client.anInt10731 = -216409942;
					Client.anInt10679 = 0;
					OutgoingFrame class480_sub15 = OutgoingFrame.prepare(class366, Client.gameConnection.encryptor);
					class480_sub15.payload.writeShortA(i_9_);
					class480_sub15.payload.writeByteS(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
					Client.gameConnection.sendFrame(class480_sub15);
					Class20.method728(class600_sub1_sub3_sub1_sub1.pathX[0], class600_sub1_sub3_sub1_sub1.pathZ[0]);
				}
			}
			if (i_8_ == 23) {
				if (Client.localPrivilege * 1667858447 > 0 && CutsceneVariableProvider.method3346()) {
					Client.teleport(Client.localPlayer.plane, i_6_ + class553.x * 2051316501, i_7_ + class553.z
							* -180305283);
				} else {
					OutgoingFrame class480_sub15 = Class195.method3857(i_9_, i_6_, i_7_);
					if (1 == i_9_) {
						class480_sub15.payload.writeByte(-1);
						class480_sub15.payload.writeByte(-1);
						class480_sub15.payload.writeShort((int) Client.aFloat10787);
						class480_sub15.payload.writeByte(57);
						class480_sub15.payload.writeByte(Client.anInt10699 * 1093165775);
						class480_sub15.payload.writeByte(Client.anInt10701 * -1894746741);
						class480_sub15.payload.writeByte(89);
						Class397 class397 = Client.localPlayer.method10164().aClass397_4507;
						class480_sub15.payload.writeShort((int) class397.x);
						class480_sub15.payload.writeShort((int) class397.z);
						class480_sub15.payload.writeByte(63);
					} else {
						Client.anInt10737 = i * -1837674915;
						Client.anInt10738 = 1535894177 * i_4_;
						Client.anInt10731 = 2039278677;
						Client.anInt10679 = 0;
					}
					Client.gameConnection.sendFrame(class480_sub15);
					Class20.method728(i_6_, i_7_);
				}
			}
			if (8 == i_8_) {
				LinkableObject class480_sub25 = Client.npcs.get(i_9_);
				if (null != class480_sub25) {
					Npc class600_sub1_sub3_sub1_sub2 = (Npc) class480_sub25.object;
					Client.anInt10737 = i * -1837674915;
					Client.anInt10738 = i_4_ * 1535894177;
					Client.anInt10731 = -216409942;
					Client.anInt10679 = 0;
					OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4000,
							Client.gameConnection.encryptor);
					class480_sub15.payload.writeLEShort(i_9_);
					class480_sub15.payload.writeInt(Class490.anInt6751 * 1969702363);
					class480_sub15.payload.writeByte(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
					class480_sub15.payload.writeShortA(Client.anInt10756 * -800680953);
					class480_sub15.payload.writeShortA(Client.anInt10867 * -224153241);
					Client.gameConnection.sendFrame(class480_sub15);
					Class20.method728(class600_sub1_sub3_sub1_sub2.pathX[0], class600_sub1_sub3_sub1_sub2.pathZ[0]);
				}
			}
			if (25 == i_8_) {
				Widget class226 = Class185.method3584(i_7_, i_6_);
				if (null != class226) {
					PlayerVariableProvider.method1560();
					Class480_Sub16 class480_sub16 = Client.method17050(class226);
					Class57.method1361(class226, class480_sub16.method15633(), class480_sub16.anInt10101 * 1945403175);
					Client.selectedWidgetAction = Class341.method5865(class226);
					if (Client.selectedWidgetAction == null) {
						Client.selectedWidgetAction = "Null";
					}
					Client.aString10789 = new StringBuilder().append(class226.aString2473)
							.append(Item.getColourHtml(16777215)).toString();
				}
			} else {
				if (i_8_ == 30 && Client.aClass226_10793 == null) {
					Class276.method5162(i_7_, i_6_, (short) 26389);
					Client.aClass226_10793 = Class185.method3584(i_7_, i_6_);
					if (Client.aClass226_10793 != null) {
						Widget.redraw(Client.aClass226_10793);
					}
				}
				OutgoingFrameMeta class366_10_ = null;
				if (i_8_ == 9) {
					class366_10_ = OutgoingFrameMeta.aClass366_3923;
				} else if (10 == i_8_) {
					class366_10_ = OutgoingFrameMeta.aClass366_3947;
				} else if (i_8_ == 11) {
					class366_10_ = OutgoingFrameMeta.aClass366_3943;
				} else if (i_8_ == 12) {
					class366_10_ = OutgoingFrameMeta.aClass366_3931;
				} else if (13 == i_8_) {
					class366_10_ = OutgoingFrameMeta.aClass366_4019;
				} else if (1003 == i_8_) {
					class366_10_ = OutgoingFrameMeta.aClass366_3978;
				}
				if (null != class366_10_) {
					LinkableObject class480_sub25 = Client.npcs.get(i_9_);
					if (null != class480_sub25) {
						Npc class600_sub1_sub3_sub1_sub2 = (Npc) class480_sub25.object;
						Client.anInt10737 = -1837674915 * i;
						Client.anInt10738 = 1535894177 * i_4_;
						Client.anInt10731 = -216409942;
						Client.anInt10679 = 0;
						OutgoingFrame class480_sub15 = OutgoingFrame.prepare(class366_10_,
								Client.gameConnection.encryptor);
						class480_sub15.payload.writeByteS(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
						class480_sub15.payload.writeShort(i_9_);
						Client.gameConnection.sendFrame(class480_sub15);
						Class20.method728(class600_sub1_sub3_sub1_sub2.pathX[0], class600_sub1_sub3_sub1_sub2.pathZ[0]);
					}
				}
				if (i_8_ == 15) {
					Player class600_sub1_sub3_sub1_sub1 = Client.players[i_9_];
					if (class600_sub1_sub3_sub1_sub1 != null) {
						Client.anInt10737 = i * -1837674915;
						Client.anInt10738 = 1535894177 * i_4_;
						Client.anInt10731 = -216409942;
						Client.anInt10679 = 0;
						OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4017,
								Client.gameConnection.encryptor);
						class480_sub15.payload.writeLEShort(Client.anInt10867 * -224153241);
						class480_sub15.payload.writeLEShort(Client.anInt10756 * -800680953);
						class480_sub15.payload.writeNegatedByte(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
						class480_sub15.payload.writeLEShort(i_9_);
						class480_sub15.payload.writeLEInt(Class490.anInt6751 * 1969702363);
						Client.gameConnection.sendFrame(class480_sub15);
						Class20.method728(class600_sub1_sub3_sub1_sub1.pathX[0], class600_sub1_sub3_sub1_sub1.pathZ[0]);
					}
				}
				if (i_8_ == 16) {
					Client.anInt10737 = i * -1837674915;
					Client.anInt10738 = i_4_ * 1535894177;
					Client.anInt10731 = -216409942;
					Client.anInt10679 = 0;
					OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4017,
							Client.gameConnection.encryptor);
					class480_sub15.payload.writeLEShort(Client.anInt10867 * -224153241);
					class480_sub15.payload.writeLEShort(-800680953 * Client.anInt10756);
					class480_sub15.payload.writeNegatedByte(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
					class480_sub15.payload.writeLEShort(387935885 * Client.localPlayer.index);
					class480_sub15.payload.writeLEInt(Class490.anInt6751 * 1969702363);
					Client.gameConnection.sendFrame(class480_sub15);
				}
				if (57 == i_8_ || i_8_ == 1007) {
					ConnectionInfo.method13843(i_9_, i_7_, i_6_, class480_sub31_sub17.target);
				}
				OutgoingFrameMeta class366_11_ = null;
				if (3 == i_8_) {
					class366_11_ = OutgoingFrameMeta.aClass366_4014;
				} else if (i_8_ == 4) {
					class366_11_ = OutgoingFrameMeta.aClass366_3966;
				} else if (i_8_ == 5) {
					class366_11_ = OutgoingFrameMeta.aClass366_3932;
				} else if (i_8_ == 6) {
					class366_11_ = OutgoingFrameMeta.aClass366_4010;
				} else if (1001 == i_8_) {
					class366_11_ = OutgoingFrameMeta.aClass366_4009;
				} else if (1002 == i_8_) {
					class366_11_ = OutgoingFrameMeta.aClass366_3941;
				}
				if (class366_11_ != null) {
					Client.anInt10737 = i * -1837674915;
					Client.anInt10738 = i_4_ * 1535894177;
					Client.anInt10731 = -216409942;
					Client.anInt10679 = 0;
					OutgoingFrame class480_sub15 = OutgoingFrame.prepare(class366_11_, Client.gameConnection.encryptor);
					class480_sub15.payload.writeByte(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
					class480_sub15.payload.writeLEShortA(i_7_ + class553.z * -180305283);
					class480_sub15.payload.writeShortA(class553.x * 2051316501 + i_6_);
					class480_sub15.payload.writeInt((int) (l >>> 32) & 0x7fffffff);
					Client.gameConnection.sendFrame(class480_sub15);
					Class20.method728(i_6_, i_7_);
				}
				if (1008 == i_8_ || 1009 == i_8_ || 1010 == i_8_ || 1011 == i_8_ || i_8_ == 1012) {
					Orientation.method814(i_8_, i_9_, i_6_, 984955062);
				}
				if (i_8_ == 59) {
					Client.anInt10737 = i * -1837674915;
					Client.anInt10738 = i_4_ * 1535894177;
					Client.anInt10731 = 2039278677;
					Client.anInt10679 = 0;
					OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3930,
							Client.gameConnection.encryptor);
					class480_sub15.payload.writeLEShortA(-800680953 * Client.anInt10756);
					class480_sub15.payload.writeLEShort(2051316501 * class553.x + i_6_);
					class480_sub15.payload.writeShortA(Client.anInt10867 * -224153241);
					class480_sub15.payload.writeShort(i_7_ + -180305283 * class553.z);
					class480_sub15.payload.writeMEInt(1969702363 * Class490.anInt6751);
					Client.gameConnection.sendFrame(class480_sub15);
					Class20.method728(i_6_, i_7_);
				}
				if (60 == i_8_) {
					if (1667858447 * Client.localPrivilege > 0 && CutsceneVariableProvider.method3346()) {
						Client.teleport(Client.localPlayer.plane, class553.x * 2051316501 + i_6_, -180305283
								* class553.z + i_7_);
					} else {
						Client.anInt10737 = -1837674915 * i;
						Client.anInt10738 = 1535894177 * i_4_;
						Client.anInt10731 = 2039278677;
						Client.anInt10679 = 0;
						OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3986,
								Client.gameConnection.encryptor);
						class480_sub15.payload.writeLEShort(-180305283 * class553.z + i_7_);
						class480_sub15.payload.writeLEShort(2051316501 * class553.x + i_6_);
						Client.gameConnection.sendFrame(class480_sub15);
					}
				}
				if (i_8_ == 2) {
					Client.anInt10737 = i * -1837674915;
					Client.anInt10738 = i_4_ * 1535894177;
					Client.anInt10731 = -216409942;
					Client.anInt10679 = 0;
					OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3940,
							Client.gameConnection.encryptor);
					class480_sub15.payload.writeByteA(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
					class480_sub15.payload.writeLEShortA(Client.anInt10756 * -800680953);
					class480_sub15.payload.writeLEShort(-180305283 * class553.z + i_7_);
					class480_sub15.payload.writeShortA(class553.x * 2051316501 + i_6_);
					class480_sub15.payload.writeLEShort(-224153241 * Client.anInt10867);
					class480_sub15.payload.writeIMEInt(1969702363 * Class490.anInt6751);
					class480_sub15.payload.writeMEInt((int) (l >>> 32) & 0x7fffffff);
					Client.gameConnection.sendFrame(class480_sub15);
					Class20.method728(i_6_, i_7_);
				}
				if (58 == i_8_) {
					Widget class226 = Class185.method3584(i_7_, i_6_);
					if (null != class226) {
						Class480_Sub40.method16234(class226, -1393513011);
					}
				}
				OutgoingFrameMeta class366_12_ = null;
				if (18 == i_8_) {
					class366_12_ = OutgoingFrameMeta.aClass366_3983;
				} else if (i_8_ == 19) {
					class366_12_ = OutgoingFrameMeta.aClass366_4013;
				} else if (i_8_ == 20) {
					class366_12_ = OutgoingFrameMeta.aClass366_3985;
				} else if (21 == i_8_) {
					class366_12_ = OutgoingFrameMeta.aClass366_3939;
				} else if (i_8_ == 22) {
					class366_12_ = OutgoingFrameMeta.aClass366_3926;
				} else if (i_8_ == 1004) {
					class366_12_ = OutgoingFrameMeta.aClass366_3953;
				}
				if (class366_12_ != null) {
					Client.anInt10737 = i * -1837674915;
					Client.anInt10738 = i_4_ * 1535894177;
					Client.anInt10731 = -216409942;
					Client.anInt10679 = 0;
					OutgoingFrame class480_sub15 = OutgoingFrame.prepare(class366_12_, Client.gameConnection.encryptor);
					class480_sub15.payload.writeLEShort(class553.z * -180305283 + i_7_);
					class480_sub15.payload.writeShort(i_6_ + 2051316501 * class553.x);
					class480_sub15.payload.writeByteS((bool ? 2 : 0)
							| (ThemeMusicVolumeNormaliser.method3755() ? 1 : 0));
					class480_sub15.payload.writeLEShortA(i_9_);
					Client.gameConnection.sendFrame(class480_sub15);
					Class20.method728(i_6_, i_7_);
				}
				if (Client.widgetSelected) {
					PlayerVariableProvider.method1560();
				}
				if (null != DrawableText.aClass226_9829 && 444672209 * Client.anInt10741 == 0) {
					Widget.redraw(DrawableText.aClass226_9829);
				}
			}
		}
	}

	long aLong9837;
	int anInt9838;
	long aLong9839;
	long[] aLongArray9840;

	int anInt9841;

	long aLong9842 = 0L;

	Class467_Sub2() {
		aLong9837 = 0L;
		aLong9839 = 0L;
		aLongArray9840 = new long[10];
		anInt9841 = 0;
		anInt9838 = -1226479421;
		aLong9842 = System.nanoTime() * 2553089956175584773L;
		aLong9837 = System.nanoTime() * 1856464366422168743L;
	}

	long method15322(int i) {
		long l = System.nanoTime();
		long l_0_ = l - aLong9839 * 3631060314329852889L;
		aLong9839 = 1243060601205924969L * l;
		if (l_0_ > -5000000000L && l_0_ < 5000000000L) {
			aLongArray9840[anInt9841 * 1918849569] = l_0_;
			anInt9841 = (1 + 1918849569 * anInt9841) % 10 * 611365345;
			if (anInt9838 * -1752266773 < 1) {
				anInt9838 += -1226479421;
			}
		}
		long l_1_ = 0L;
		for (int i_2_ = 1; i_2_ <= anInt9838 * -1752266773; i_2_++) {
			l_1_ += aLongArray9840[(10 + anInt9841 * 1918849569 - i_2_) % 10];
		}
		return l_1_ / (anInt9838 * -1752266773);
	}

	@Override
	void method7891() {
		aLong9839 = 0L;
		if (aLong9837 * -8400346072457096425L > -5790302255800811827L * aLong9842) {
			aLong9842 += 7401816915789631859L * aLong9837 - 1L * aLong9842;
		}
	}

	@Override
	long method7894() {
		return -5790302255800811827L * aLong9842;
	}

	@Override
	long method7897() {
		aLong9842 += method15322(-367903253) * 2553089956175584773L;
		if (aLong9837 * -8400346072457096425L > -5790302255800811827L * aLong9842) {
			return (aLong9837 * -8400346072457096425L - -5790302255800811827L * aLong9842) / 1000000L;
		}
		return 0L;
	}

	@Override
	int method7905(long l) {
		if (-8400346072457096425L * aLong9837 > aLong9842 * -5790302255800811827L) {
			aLong9839 += aLong9837 * 4104000515390066799L - aLong9842 * -8360114898687666667L;
			aLong9842 += aLong9837 * 7401816915789631859L - aLong9842 * 1L;
			aLong9837 += l * 1856464366422168743L;
			return 1;
		}
		int i = 0;
		do {
			i++;
			aLong9837 += l * 1856464366422168743L;
		} while (i < 10 && -8400346072457096425L * aLong9837 < -5790302255800811827L * aLong9842);
		if (aLong9837 * -8400346072457096425L < aLong9842 * -5790302255800811827L) {
			aLong9837 = aLong9842 * 2635160276237237179L;
		}
		return i;
	}
}
