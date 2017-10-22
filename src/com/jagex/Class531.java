package com.jagex;

import java.util.Iterator;
import java.util.List;

public class Class531 implements Encodeable {
	public static void method9030(Toolkit toolkit, long l) {
		toolkit.method2416();
		Class533.aLinkedList7260.clear();
		Class533.aLinkedList7284.clear();
		Class533.aLong7285 = (l + Class533.anInt7261 * -1477979021) * 9110903633089232207L;
	}

	static void method9031(Npc npc, boolean bool) {
		if (Class56.menuOptionCount * 84366055 < 406) {
			NpcDefinition npcDefinition = npc.definition;
			String string = npc.name;
			if (null != npcDefinition.morphisms) {
				npcDefinition = npcDefinition.morph(PlayerVariableProvider.instance, PlayerVariableProvider.instance);
				if (null == npcDefinition) {
					return;
				}
				string = npcDefinition.name;
			}
			if (npcDefinition.aBool3052) {
				if (2011629825 * npc.combat != 0) {
					String string_0_ = GameContext.STELLAR_DAWN == Client.game ? TranslatableString.RATING
							.translate(Client.currentLanguage) : TranslatableString.LEVEL
							.translate(Client.currentLanguage);
					string = new StringBuilder()
							.append(string)
							.append(Class167.getCombatDifferenceHtml(npc.combat * 2011629825,
									1340998367 * Client.localPlayer.combat)).append(Class60.LEFT_PARENTHESIS)
							.append(string_0_).append(npc.combat * 2011629825).append(Class60.RIGHT_PARENTHESIS)
							.toString();
				}
				if (Client.widgetSelected && !bool) {
					ParameterDefinition class33 = -410965469 * LookupTable.anInt2647 != -1 ? ParameterDefinition.loader
							.get(-410965469 * LookupTable.anInt2647) : null;
					if (0 != (Class577.selectedWidgetAttributes * -1564025309 & 0x2)
							&& (class33 == null || npcDefinition.getParameter(-410965469 * LookupTable.anInt2647,
									-125275839 * class33.defaultInt) != class33.defaultInt * -125275839)) {
						MenuOption.add(Client.selectedWidgetAction, new StringBuilder().append(Client.aString10789)
								.append(" ").append(Class60.aString677).append(" ")
								.append(Item.getColourHtml(16776960)).append(string).toString(),
								Class166_Sub8.anInt9550 * -29134223, 8, -1, 387935885 * npc.index, 0, 0, true, false,
								npc.index * 387935885, false);
					}
				}
				if (!bool) {
					String[] strings = npcDefinition.actions;
					if (Client.aBool10797) {
						strings = Class572.method9673(strings, (byte) -39);
					}
					if (strings != null) {
						for (int i_1_ = strings.length - 1; i_1_ >= 0; i_1_--) {
							if (strings[i_1_] != null
									&& (781778657 * npc.anInt11800 & 1 << i_1_) == 0
									&& (npcDefinition.aByte3076 == 0 || !strings[i_1_]
											.equalsIgnoreCase(TranslatableString.ATTACK
													.translate(Client.currentLanguage))
											&& !strings[i_1_].equalsIgnoreCase(TranslatableString.EXAMINE
													.translate(Client.currentLanguage)))) {
								int i_2_ = 0;
								int i_3_ = 377198047 * Client.anInt10783;
								if (0 == i_1_) {
									i_2_ = 9;
								}
								if (i_1_ == 1) {
									i_2_ = 10;
								}
								if (i_1_ == 2) {
									i_2_ = 11;
								}
								if (i_1_ == 3) {
									i_2_ = 12;
								}
								if (i_1_ == 4) {
									i_2_ = 13;
								}
								if (5 == i_1_) {
									i_2_ = 1003;
								}
								int i_4_ = npcDefinition.method5112(i_1_, 71746589);
								if (i_4_ != -1) {
									i_3_ = i_4_;
								}
								MenuOption.add(strings[i_1_], new StringBuilder().append(Item.getColourHtml(16776960))
										.append(string).toString(),
										strings[i_1_].equalsIgnoreCase(TranslatableString.ATTACK
												.translate(Client.currentLanguage)) ? npcDefinition.attackCursor
												* -61212913 : i_3_, i_2_, -1, 387935885 * npc.index, 0, 0, true, false,
										npc.index * 387935885, false);
							}
						}
						if (npcDefinition.aByte3076 == 1) {
							for (int i_5_ = 0; i_5_ < strings.length; i_5_++) {
								if (strings[i_5_] != null
										&& (781778657 * npc.anInt11800 & 1 << i_5_) == 0
										&& (strings[i_5_].equalsIgnoreCase(TranslatableString.ATTACK
												.translate(Client.currentLanguage)) || strings[i_5_]
												.equalsIgnoreCase(TranslatableString.EXAMINE
														.translate(Client.currentLanguage)))) {
									short i_6_ = 0;
									if (npc.combat * 2011629825 > 1340998367 * Client.localPlayer.combat) {
										i_6_ = (short) 2000;
									}
									short i_7_ = 0;
									int i_8_ = 377198047 * Client.anInt10783;
									if (i_5_ == 0) {
										i_7_ = (short) 9;
									}
									if (1 == i_5_) {
										i_7_ = (short) 10;
									}
									if (2 == i_5_) {
										i_7_ = (short) 11;
									}
									if (3 == i_5_) {
										i_7_ = (short) 12;
									}
									if (i_5_ == 4) {
										i_7_ = (short) 13;
									}
									if (i_5_ == 5) {
										i_7_ = (short) 1003;
									}
									if (0 != i_7_) {
										i_7_ += i_6_;
									}
									int i_9_ = npcDefinition.method5112(i_5_, 71746589);
									if (-1 != i_9_) {
										i_8_ = i_9_;
									}
									MenuOption.add(strings[i_5_],
											new StringBuilder().append(Item.getColourHtml(16776960)).append(string)
													.toString(),
											strings[i_5_].equalsIgnoreCase(TranslatableString.ATTACK
													.translate(Client.currentLanguage)) ? npcDefinition.attackCursor
													* -61212913 : i_8_, i_7_, -1, npc.index * 387935885, 0, 0, true,
											false, 387935885 * npc.index, false);
								}
							}
						}
					}
				}
			}
		}
	}

	static void method9032(Toolkit class134, int i, int i_10_) {
		if (i >= 0 && i_10_ >= 0 && null != Class56.aClass399_645) {
			Class553 class553 = Client.aClass460_10760.method7679();
			Matrix4f class399 = class134.method2462();
			Toolkit.method2868(class134);
			class399.method6548(Class56.aClass405_625);
			class399.method6547(Class56.aClass399_645);
			class399.method6643();
			int i_12_ = i - Class56.anInt639 * -1318900375;
			int i_13_ = i_10_ - Class56.anInt640 * 633667639;
			if (Client.aClass460_10760.method7687() != null) {
				if (!Client.widgetSelected || 0 != (Class577.selectedWidgetAttributes * -1564025309 & 0x40)) {
					int i_14_ = -1;
					int i_15_ = -1;
					float f = i_12_ * 2.0F / (Class56.anInt641 * 992277267) - 1.0F;
					float f_16_ = i_13_ * 2.0F / (Class56.anInt621 * 1249343635) - 1.0F;
					class399.method6553(f, f_16_, -1.0F, Class56.aFloatArray651);
					float f_17_ = Class56.aFloatArray651[0] / Class56.aFloatArray651[3];
					float f_18_ = Class56.aFloatArray651[1] / Class56.aFloatArray651[3];
					float f_19_ = Class56.aFloatArray651[2] / Class56.aFloatArray651[3];
					class399.method6553(f, f_16_, 1.0F, Class56.aFloatArray651);
					float f_20_ = Class56.aFloatArray651[0] / Class56.aFloatArray651[3];
					float f_21_ = Class56.aFloatArray651[1] / Class56.aFloatArray651[3];
					float f_22_ = Class56.aFloatArray651[2] / Class56.aFloatArray651[3];
					float f_23_ = Class55.method1182(f_17_, f_18_, f_19_, f_20_, f_21_, f_22_, 4);
					if (f_23_ > 0.0F) {
						float f_24_ = f_20_ - f_17_;
						float f_25_ = f_22_ - f_19_;
						int i_26_ = (int) (f_17_ + f_24_ * f_23_);
						int i_27_ = (int) (f_19_ + f_23_ * f_25_);
						i_14_ = i_26_ + (Client.localPlayer.boundSize() - 1 << 8) >> 9;
						i_15_ = i_27_ + (Client.localPlayer.boundSize() - 1 << 8) >> 9;
						int i_28_ = Client.localPlayer.plane;
						if (i_28_ < 3
								&& (Client.aClass460_10760.method7775().flags[1][i_26_ >> 9][i_27_ >> 9] & 0x2) != 0) {
							i_28_++;
						}
					}
					if (-1 != i_14_ && i_15_ != -1) {
						if (Client.widgetSelected && 0 != (Class577.selectedWidgetAttributes * -1564025309 & 0x40)) {
							Widget class226 = Class185.method3584(Class490.anInt6751 * 1969702363, Client.anInt10756
									* -800680953);
							if (null != class226) {
								MenuOption.add(Client.selectedWidgetAction,
										new StringBuilder().append(" ").append(Class60.aString677).append(" ")
												.toString(), Class166_Sub8.anInt9550 * -29134223, 59, -1, 0L, i_14_,
										i_15_, true, false, i_14_ << 32 | i_15_, true);
							} else {
								PlayerVariableProvider.method1560();
							}
						} else {
							if (TextureMetrics.aBool1729) {
								MenuOption.add(TranslatableString.FACE_HERE.translate(Client.currentLanguage), "", -1,
										60, -1, 0L, i_14_, i_15_, true, false, i_14_ << 32 | i_15_, true);
							}
							MenuOption.add(ParticleTriangle.aString7753, "", 675691335 * Client.anInt10775, 23, -1, 0L,
									i_14_, i_15_, true, false, i_14_ << 32 | i_15_, true);
						}
					}
				}
				Class497 class497 = Client.aClass460_10760.method7687().aClass497_6711;
				int i_29_ = i;
				int i_30_ = i_10_;
				List list = class497.aList6881;
				Iterator iterator = list.iterator();
				while (iterator.hasNext()) {
					Class506 class506 = (Class506) iterator.next();
					if ((Client.aBool10687 || class506.aClass600_Sub1_6962.plane == Client.localPlayer.plane)
							&& class506.method8730(class134, i_29_, i_30_, (byte) 47)) {
						int i_32_;
						int i_33_;
						if (class506.aClass600_Sub1_6962 instanceof Class600_Sub1_Sub3) {
							i_32_ = ((Class600_Sub1_Sub3) class506.aClass600_Sub1_6962).aShort11457;
							i_33_ = ((Class600_Sub1_Sub3) class506.aClass600_Sub1_6962).aShort11464;
						} else {
							Class397 class397 = class506.aClass600_Sub1_6962.method10164().aClass397_4507;
							i_32_ = (int) class397.x >> 9;
							i_33_ = (int) class397.z >> 9;
						}
						if (class506.aClass600_Sub1_6962 instanceof Player) {
							Player class600_sub1_sub3_sub1_sub1 = (Player) class506.aClass600_Sub1_6962;
							int i_34_ = class600_sub1_sub3_sub1_sub1.boundSize();
							Class397 class397 = class600_sub1_sub3_sub1_sub1.method10164().aClass397_4507;
							if (0 == (i_34_ & 0x1) && ((int) class397.x & 0x1ff) == 0
									&& ((int) class397.z & 0x1ff) == 0 || (i_34_ & 0x1) == 1
									&& ((int) class397.x & 0x1ff) == 256 && ((int) class397.z & 0x1ff) == 256) {
								int i_35_ = (int) class397.x - (class600_sub1_sub3_sub1_sub1.boundSize() - 1 << 8);
								int i_36_ = (int) class397.z - (class600_sub1_sub3_sub1_sub1.boundSize() - 1 << 8);
								for (int i_37_ = 0; i_37_ < Client.npcCount * 1746328619; i_37_++) {
									LinkableObject class480_sub25 = Client.npcs.get(Client.npcIndices[i_37_]);
									if (class480_sub25 != null) {
										Npc class600_sub1_sub3_sub1_sub2 = (Npc) class480_sub25.object;
										if (-1061209915 * class600_sub1_sub3_sub1_sub2.anInt11547 != Client.tick
												&& class600_sub1_sub3_sub1_sub2.aBool11499) {
											Class397 class397_38_ = class600_sub1_sub3_sub1_sub2.method10164().aClass397_4507;
											int i_39_ = (int) class397_38_.x
													- (2117527163 * class600_sub1_sub3_sub1_sub2.definition.boundSize - 1 << 8);
											int i_40_ = (int) class397_38_.z
													- (2117527163 * class600_sub1_sub3_sub1_sub2.definition.boundSize - 1 << 8);
											if (i_39_ >= i_35_
													&& 2117527163 * class600_sub1_sub3_sub1_sub2.definition.boundSize <= class600_sub1_sub3_sub1_sub1
															.boundSize() - (i_39_ - i_35_ >> 9)
													&& i_40_ >= i_36_
													&& class600_sub1_sub3_sub1_sub2.definition.boundSize * 2117527163 <= class600_sub1_sub3_sub1_sub1
															.boundSize() - (i_40_ - i_36_ >> 9)) {
												method9031(class600_sub1_sub3_sub1_sub2,
														Client.localPlayer.plane != class506.aClass600_Sub1_6962.plane);
												class600_sub1_sub3_sub1_sub2.anInt11547 = Client.tick * 2138539533;
											}
										}
									}
								}
								int i_41_ = -1784886003 * Class80.playerCount;
								int[] is = Class80.playerIndices;
								for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
									Player player = Client.players[is[i_42_]];
									if (player != null && player.anInt11547 * -1061209915 != Client.tick
											&& class600_sub1_sub3_sub1_sub1 != player && player.aBool11499) {
										Class397 class397_44_ = player.method10164().aClass397_4507;
										int i_45_ = (int) class397_44_.x - (player.boundSize() - 1 << 8);
										int i_46_ = (int) class397_44_.z - (player.boundSize() - 1 << 8);
										if (i_45_ >= i_35_
												&& player.boundSize() <= class600_sub1_sub3_sub1_sub1.boundSize()
														- (i_45_ - i_35_ >> 9)
												&& i_46_ >= i_36_
												&& player.boundSize() <= class600_sub1_sub3_sub1_sub1.boundSize()
														- (i_46_ - i_36_ >> 9)) {
											Class26.method781(player,
													class506.aClass600_Sub1_6962.plane != Client.localPlayer.plane);
											player.anInt11547 = 2138539533 * Client.tick;
										}
									}
								}
							}
							if (-1061209915 * class600_sub1_sub3_sub1_sub1.anInt11547 == Client.tick) {
								continue;
							}
							Class26.method781(class600_sub1_sub3_sub1_sub1,
									Client.localPlayer.plane != class506.aClass600_Sub1_6962.plane);
							class600_sub1_sub3_sub1_sub1.anInt11547 = Client.tick * 2138539533;
						}
						if (class506.aClass600_Sub1_6962 instanceof Npc) {
							Npc npc = (Npc) class506.aClass600_Sub1_6962;
							if (npc.definition != null) {
								Class397 class397 = npc.method10164().aClass397_4507;
								if (0 == (npc.definition.boundSize * 2117527163 & 0x1)
										&& ((int) class397.x & 0x1ff) == 0 && 0 == ((int) class397.z & 0x1ff)
										|| 1 == (npc.definition.boundSize * 2117527163 & 0x1)
										&& 256 == ((int) class397.x & 0x1ff) && ((int) class397.z & 0x1ff) == 256) {
									int i_47_ = (int) class397.x - (2117527163 * npc.definition.boundSize - 1 << 8);
									int i_48_ = (int) class397.z - (npc.definition.boundSize * 2117527163 - 1 << 8);
									for (int i_49_ = 0; i_49_ < Client.npcCount * 1746328619; i_49_++) {
										LinkableObject linkable = Client.npcs.get(Client.npcIndices[i_49_]);
										if (null != linkable) {
											Npc other = (Npc) linkable.object;
											if (-1061209915 * other.anInt11547 != Client.tick && npc != other
													&& other.aBool11499) {
												Class397 class397_51_ = other.method10164().aClass397_4507;
												int i_52_ = (int) class397_51_.x
														- (other.definition.boundSize * 2117527163 - 1 << 8);
												int i_53_ = (int) class397_51_.z
														- (other.definition.boundSize * 2117527163 - 1 << 8);
												if (i_52_ >= i_47_
														&& other.definition.boundSize * 2117527163 <= npc.definition.boundSize
																* 2117527163 - (i_52_ - i_47_ >> 9)
														&& i_53_ >= i_48_
														&& 2117527163 * other.definition.boundSize <= npc.definition.boundSize
																* 2117527163 - (i_53_ - i_48_ >> 9)) {
													method9031(
															other,
															Client.localPlayer.plane != class506.aClass600_Sub1_6962.plane);
													other.anInt11547 = 2138539533 * Client.tick;
												}
											}
										}
									}
									int playerCount = Class80.playerCount * -1784886003;
									int[] playerIndices = Class80.playerIndices;
									for (int index = 0; index < playerCount; index++) {
										Player player = Client.players[playerIndices[index]];
										if (player != null && Client.tick != player.anInt11547 * -1061209915
												&& player.aBool11499) {
											Class397 class397_56_ = player.method10164().aClass397_4507;
											int i_57_ = (int) class397_56_.x - (player.boundSize() - 1 << 8);
											int i_58_ = (int) class397_56_.z - (player.boundSize() - 1 << 8);
											if (i_57_ >= i_47_
													&& player.boundSize() <= npc.definition.boundSize * 2117527163
															- (i_57_ - i_47_ >> 9)
													&& i_58_ >= i_48_
													&& player.boundSize() <= npc.definition.boundSize * 2117527163
															- (i_58_ - i_48_ >> 9)) {
												Class26.method781(player,
														Client.localPlayer.plane != class506.aClass600_Sub1_6962.plane);
												player.anInt11547 = Client.tick * 2138539533;
											}
										}
									}
								}
								if (Client.tick == npc.anInt11547 * -1061209915) {
									continue;
								}
								method9031(npc, class506.aClass600_Sub1_6962.plane != Client.localPlayer.plane);
								npc.anInt11547 = 2138539533 * Client.tick;
							}
						}
						if (class506.aClass600_Sub1_6962 instanceof Class600_Sub1_Sub1_Sub1) {
							int x = class553.x * 2051316501 + i_32_;
							int z = class553.z * -180305283 + i_33_;

							ItemDeque deque = Client.groundItems.get(class506.aClass600_Sub1_6962.plane << 28 | z << 14
									| x);
							if (deque != null) {
								int i_61_ = 0;
								Item item = deque.items.tail();
								while (null != item) {
									ItemDefinition definition = ItemDefinition.loader.get(1659909117 * item.id);
									int i_62_;
									if (definition.aBool8335) {
										i_62_ = -2006367341 * definition.anInt8294;
									} else if (definition.members) {
										i_62_ = -670718769 * Script.aClass580_11401.anInt7763;
									} else {
										i_62_ = Script.aClass580_11401.anInt7762 * -661273573;
									}

									if (Client.widgetSelected
											&& class506.aClass600_Sub1_6962.plane == Client.localPlayer.plane) {
										ParameterDefinition parameter = -1 != -410965469 * LookupTable.anInt2647 ? ParameterDefinition.loader
												.get(LookupTable.anInt2647 * -410965469) : null;
										if (0 != (Class577.selectedWidgetAttributes * -1564025309 & 0x1)
												&& (null == parameter || definition.getOrDefault(-410965469
														* LookupTable.anInt2647, parameter.defaultInt * -125275839) != -125275839
														* parameter.defaultInt)) {
											MenuOption.add(
													Client.selectedWidgetAction,
													new StringBuilder().append(Client.aString10789).append(" ")
															.append(Class60.aString677).append(" ")
															.append(Item.getColourHtml(i_62_)).append(definition.name)
															.toString(), -29134223 * Class166_Sub8.anInt9550, 17, -1,
													1659909117 * item.id, i_32_, i_33_, true, false, i_61_, false);
										}
									}
									if (class506.aClass600_Sub1_6962.plane == Client.localPlayer.plane) {
										String[] strings = definition.groundActions;
										for (int i_63_ = strings.length - 1; i_63_ >= 0; i_63_--) {
											if (null != strings[i_63_]) {
												int i_64_ = 0;
												int i_65_ = 377198047 * Client.anInt10783;
												if (i_63_ == 0) {
													i_64_ = 18;
												}
												if (1 == i_63_) {
													i_64_ = 19;
												}
												if (2 == i_63_) {
													i_64_ = 20;
												}
												if (i_63_ == 3) {
													i_64_ = 21;
												}
												if (i_63_ == 4) {
													i_64_ = 22;
												}
												if (i_63_ == 5) {
													i_64_ = 1004;
												}
												int i_66_ = definition.method13593(i_63_, -2011468712);
												if (-1 != i_66_) {
													i_65_ = i_66_;
												}
												MenuOption.add(
														strings[i_63_],
														new StringBuilder().append(Item.getColourHtml(i_62_))
																.append(definition.name).toString(), i_65_, i_64_, -1,
														1659909117 * item.id, i_32_, i_33_, true, false, i_61_, false);
											}
										}
									}
									item = deque.items.previous();
									i_61_++;
								}
							}
						}
						if (class506.aClass600_Sub1_6962 instanceof SceneObject) {
							SceneObject interface55 = (SceneObject) class506.aClass600_Sub1_6962;
							ObjectDefinition object = Client.aClass460_10760.getObjectLoader().get(interface55.getId());
							if (null != object.morphisms) {
								object = object.method9255(PlayerVariableProvider.instance,
										PlayerVariableProvider.instance);
							}

							if (null != object) {
								if (Client.widgetSelected
										&& class506.aClass600_Sub1_6962.plane == Client.localPlayer.plane) {
									ParameterDefinition parameter = LookupTable.anInt2647 * -410965469 != -1 ? ParameterDefinition.loader
											.get(LookupTable.anInt2647 * -410965469) : null;
									if ((Class577.selectedWidgetAttributes * -1564025309 & 0x4) != 0
											&& (parameter == null || object.getParameter(LookupTable.anInt2647
													* -410965469, -125275839 * parameter.defaultInt) != -125275839
													* parameter.defaultInt)) {
										MenuOption.add(Client.selectedWidgetAction, Client.aString10789 + " "
												+ Class60.aString677 + " " + Item.getColourHtml(65535) + object.name,
												-29134223 * Class166_Sub8.anInt9550, 2, -1,
												MobChatCutsceneAction.method15138(interface55, i_32_, i_33_), i_32_,
												i_33_, true, false, interface55.hashCode(), false);
									}
								}
								if (class506.aClass600_Sub1_6962.plane == Client.localPlayer.plane) {
									String[] strings = object.actions;
									if (null != strings) {
										for (int i_67_ = strings.length - 1; i_67_ >= 0; i_67_--) {
											if (null != strings[i_67_]) {
												int i_68_ = 0;
												int i_69_ = Client.anInt10783 * 377198047;
												if (0 == i_67_) {
													i_68_ = 3;
												}
												if (i_67_ == 1) {
													i_68_ = 4;
												}
												if (2 == i_67_) {
													i_68_ = 5;
												}
												if (i_67_ == 3) {
													i_68_ = 6;
												}
												if (i_67_ == 4) {
													i_68_ = 1001;
												}
												if (i_67_ == 5) {
													i_68_ = 1002;
												}
												int i_70_ = object.method9256(i_67_);
												if (i_70_ != -1) {
													i_69_ = i_70_;
												}
												MenuOption.add(strings[i_67_], Item.getColourHtml(65535) + object.name,
														i_69_, i_68_, -1,
														MobChatCutsceneAction.method15138(interface55, i_32_, i_33_),
														i_32_, i_33_, true, false, interface55.hashCode(), false);
											}
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	int anInt7228;

	Class531(int i) {
		anInt7228 = i * -1631706671;
	}

	@Override
	public void encode() {
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3929, Client.gameConnection.encryptor);
		frame.payload.writeShort(1277548337 * anInt7228);
		Client.gameConnection.sendFrame(frame);
	}

}