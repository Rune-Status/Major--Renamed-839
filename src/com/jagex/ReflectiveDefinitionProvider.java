package com.jagex;

public class ReflectiveDefinitionProvider<T extends Definition> implements DefinitionProvider<T> {

	static final String method13895(int i, int i_2_) {
		String string = Integer.toString(i);
		for (int i_3_ = string.length() - 3; i_3_ > 0; i_3_ -= 3) {
			string = new StringBuilder().append(string.substring(0, i_3_)).append(Class60.COMMA)
					.append(string.substring(i_3_)).toString();
		}
		if (string.length() > 9) {
			return new StringBuilder().append(" ").append(Item.getColourHtml(65408))
					.append(string.substring(0, string.length() - 8))
					.append(TranslatableString.aClass5_158.translate(Client.currentLanguage)).append(" (")
					.append(string).append(")").append(Class60.CLOSING_COLOUR_TAG).toString();
		}
		if (string.length() > 6) {
			return new StringBuilder().append(" ").append(Item.getColourHtml(16777215))
					.append(string.substring(0, string.length() - 4))
					.append(TranslatableString.aClass5_160.translate(Client.currentLanguage)).append(" (")
					.append(string).append(")").append(Class60.CLOSING_COLOUR_TAG).toString();
		}
		return new StringBuilder().append(" ").append(Item.getColourHtml(16776960)).append(string)
				.append(Class60.CLOSING_COLOUR_TAG).toString();
	}

	static int method13896(int i, int i_4_, byte i_5_) {
		if (ObjectCategory.aClass541_7336.type * -1050493863 == i
				|| ObjectCategory.aClass541_7355.type * -1050493863 == i) {
			return Class600_Sub1_Sub5_Sub1.anIntArray11603[i_4_ & 0x3];
		}
		return Class600_Sub1_Sub5_Sub1.anIntArray11600[i_4_ & 0x3];
	}

	static final void method13897(Toolkit class134, TextureMetricsList class147, int i) {
		if (147042807 * Class495_Sub1.anInt10322 != 100 && null != Class495.aClass480_Sub31_Sub18_6808) {
			TimeUtil.time();
			TimeUtil.time();
			if (Class495_Sub1.anInt10322 * 147042807 < 10) {
				for (int i_6_ = 0; i_6_ < Class495_Sub1.aClass132ArrayArray10329.length; i_6_++) {
					for (int i_7_ = 0; i_7_ < Class495_Sub1.aClass132ArrayArray10329[i_6_].length; i_7_++) {
						DequeIterator.images.fileLoaded(Class495.aClass560_6827.anIntArrayArray7532[i_6_][i_7_]);
						Class80.fonts.fileLoaded(Class495.aClass560_6827.anIntArrayArray7532[i_6_][i_7_]);
					}
				}
				if (!Class495.aClass406_6821.loadEntry(Class495.aClass480_Sub31_Sub18_6808.aString11419)) {
					Class495_Sub1.anInt10322 = SetMemberRankChannelUpdate.worldMap
							.percentComplete(Class495.aClass480_Sub31_Sub18_6808.aString11419) / 10 * 5922759;
					return;
				}
				Class495_Sub1.anInt10322 = 59227590;
			}
			if (10 == 147042807 * Class495_Sub1.anInt10322) {
				Class495.anInt6849 = -1874808723 * Class495.aClass480_Sub31_Sub18_6808.anInt11425 >> 6 << 6;
				Class495.anInt6823 = 1964867229 * Class495.aClass480_Sub31_Sub18_6808.anInt11427 >> 6 << 6;
				Class495.anInt6824 = 64 + (Class495.aClass480_Sub31_Sub18_6808.anInt11428 * -1334470583 >> 6 << 6)
						- Class495.anInt6849;
				Class495.anInt6826 = 64 + (Class495.aClass480_Sub31_Sub18_6808.anInt11421 * -144068941 >> 6 << 6)
						- Class495.anInt6823;
				int[] is = new int[3];
				int i_8_ = -1;
				int i_9_ = -1;
				Class397 class397 = Client.localPlayer.method10164().aClass397_4507;
				Class553 class553 = Client.aClass460_10760.method7679();
				if (Class495.aClass480_Sub31_Sub18_6808.method17861(Client.localPlayer.plane, ((int) class397.x >> 9)
						+ 2051316501 * class553.x, class553.z * -180305283 + ((int) class397.z >> 9), is)) {
					i_8_ = is[1] - Class495.anInt6849;
					i_9_ = is[2] - Class495.anInt6823;
				}
				if (!Class495_Sub1.aBool10321 && i_8_ >= 0 && i_8_ < Class495.anInt6824 && i_9_ >= 0
						&& i_9_ < Class495.anInt6826) {
					i_8_ += (int) (Math.random() * 10.0) - 5;
					i_9_ += (int) (Math.random() * 10.0) - 5;
					AsynchronousStreamRequest.anInt4532 = 807429799 * i_8_;
					ClanChannelUpdater.anInt3185 = 1001358417 * i_9_;
				} else if (1489851091 * Class495_Sub1.anInt10326 != -1 && -743205525 * Class495_Sub1.anInt10330 != -1) {
					Class495.aClass480_Sub31_Sub18_6808.method17860(1489851091 * Class495_Sub1.anInt10326,
							Class495_Sub1.anInt10330 * -743205525, is, 1857262099);
					AsynchronousStreamRequest.anInt4532 = (is[1] - Class495.anInt6849) * 807429799;
					ClanChannelUpdater.anInt3185 = 1001358417 * (is[2] - Class495.anInt6823);
					Class495_Sub1.anInt10330 = -499380035;
					Class495_Sub1.anInt10326 = -238998875;
					Class495_Sub1.aBool10321 = false;
				} else {
					Class495.aClass480_Sub31_Sub18_6808.method17860(
							Class495.aClass480_Sub31_Sub18_6808.anInt11422 * 181021407 >> 14 & 0x3fff,
							Class495.aClass480_Sub31_Sub18_6808.anInt11422 * 181021407 & 0x3fff, is, 1857262099);
					AsynchronousStreamRequest.anInt4532 = (is[1] - Class495.anInt6849) * 807429799;
					ClanChannelUpdater.anInt3185 = (is[2] - Class495.anInt6823) * 1001358417;
				}
				if (25 == -667632177 * Class495.aClass480_Sub31_Sub18_6808.anInt11424) {
					Class495.aFloat6818 = 2.0F;
					Class495.aFloat6835 = 2.0F;
				} else if (-667632177 * Class495.aClass480_Sub31_Sub18_6808.anInt11424 == 37) {
					Class495.aFloat6818 = 3.0F;
					Class495.aFloat6835 = 3.0F;
				} else if (-667632177 * Class495.aClass480_Sub31_Sub18_6808.anInt11424 == 50) {
					Class495.aFloat6818 = 4.0F;
					Class495.aFloat6835 = 4.0F;
				} else if (Class495.aClass480_Sub31_Sub18_6808.anInt11424 * -667632177 == 75) {
					Class495.aFloat6818 = 6.0F;
					Class495.aFloat6835 = 6.0F;
				} else if (Class495.aClass480_Sub31_Sub18_6808.anInt11424 * -667632177 == 100) {
					Class495.aFloat6818 = 8.0F;
					Class495.aFloat6835 = 8.0F;
				} else if (Class495.aClass480_Sub31_Sub18_6808.anInt11424 * -667632177 == 200) {
					Class495.aFloat6818 = 16.0F;
					Class495.aFloat6835 = 16.0F;
				} else {
					Class495.aFloat6818 = 8.0F;
					Class495.aFloat6835 = 8.0F;
				}
				Class495.anInt6857 = (int) Class495.aFloat6835 >> 1;
				Class495.aByteArrayArrayArray6814 = Program.method4569(Class495.anInt6857);
				SpawnObjectCutsceneAction.method15149();
				Class495.method8610();
				Class208.aClass644_2168 = new Deque();
				Class495.anInt6812 += (int) (Math.random() * 5.0) - 2;
				if (Class495.anInt6812 < -8) {
					Class495.anInt6812 = -8;
				}
				if (Class495.anInt6812 > 8) {
					Class495.anInt6812 = 8;
				}
				Class495.anInt6813 += (int) (Math.random() * 5.0) - 2;
				if (Class495.anInt6813 < -16) {
					Class495.anInt6813 = -16;
				}
				if (Class495.anInt6813 > 16) {
					Class495.anInt6813 = 16;
				}
				Class495.method8555(class147, Class495.anInt6812 >> 2 << 10, Class495.anInt6813 >> 1);
				Class495.aClass678_Sub8_6803.resizeCaches(1024, 256);
				Class495.aClass678_Sub15_6809.resizeCache(256, 256);
				Class495.aClass678_Sub17_6802.resize(4096);
				VariableBitsDefinition.loader.resize(256);
				Class495_Sub1.anInt10322 = 118455180;
			} else if (20 == 147042807 * Class495_Sub1.anInt10322) {
				if (Class495.aBool6845) {
					if (Class495.method8557(class134, Class495.anInt6812, Class495.anInt6813, Class495.aBool6845)) {
						Class495_Sub1.anInt10322 = 355365540;
					}
				} else {
					HostNameIdentifier.method1377(true);
					Class495.method8557(class134, Class495.anInt6812, Class495.anInt6813, Class495.aBool6845);
					Class495_Sub1.anInt10322 = 355365540;
					HostNameIdentifier.method1377(true);
					Class454.method7418();
				}
			} else if (Class495_Sub1.anInt10322 * 147042807 == 60) {
				if (Class495.aClass406_6821.validFile(Class495.aClass480_Sub31_Sub18_6808.aString11419)) {
					if (!Class495.aClass406_6821.loadEntry(Class495.aClass480_Sub31_Sub18_6808.aString11419)) {
						return;
					}
					Class495.aClass488_6832 = Class448.method1002(Class495.aClass406_6821,
							Class495.aClass480_Sub31_Sub18_6808.aString11419, Client.membersWorld);
				} else {
					Class495.aClass488_6832 = new Class488(0);
				}
				Class495.method8560();
				Class495_Sub1.anInt10322 = 414593130;
				HostNameIdentifier.method1377(true);
				Class454.method7418();
			} else if (147042807 * Class495_Sub1.anInt10322 >= 70) {
				for (int i_10_ = 0; i_10_ < 3; i_10_++) {
					for (int i_11_ = 0; i_11_ < 5; i_11_++) {
						if (Class495_Sub1.aClass132ArrayArray10329[i_10_][i_11_] == null
								|| Class495_Sub1.aClass9ArrayArray10339[i_10_][i_11_] == null) {
							Class495_Sub1.aClass132ArrayArray10329[i_10_][i_11_] = (Font) Class509.aClass374_6997
									.method6124(Client.anInterface47_10645,
											Class495.aClass560_6827.anIntArrayArray7532[i_10_][i_11_], true, true);
							Class495_Sub1.aClass9ArrayArray10339[i_10_][i_11_] = FontSpecification.load(Class80.fonts,
									Class495.aClass560_6827.anIntArrayArray7532[i_10_][i_11_]);
							if (null != Class495_Sub1.aClass132ArrayArray10329[i_10_][i_11_]
									&& Class495_Sub1.aClass9ArrayArray10339[i_10_][i_11_] != null) {
								Class495_Sub1.anInt10322 += 17768277;
							} else {
								return;
							}
						}
					}
				}
				Class495_Sub1.anInt10322 = 592275900;
				System.gc();
			}
		}
	}

	static final void method13898(ScriptExecutionContext class613) {
		int i_12_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_12_);
		ScriptExecutionContext.method5394(class226, class613);
	}

	Class<T> clazz;

	public ReflectiveDefinitionProvider(Class<T> clazz) {
		this.clazz = clazz;
	}

	@Override
	public Class<T> getClassType() {
		return clazz;
	}

	@Override
	public T provide(int id, DefinitionLoader<T> cache) {
		T definition;
		try {
			T created = clazz.newInstance();
			((Interface71) created).setId(id);
			definition = created;
		} catch (Exception exception) {
			exception.printStackTrace();
			return null;
		}

		return definition;
	}

}