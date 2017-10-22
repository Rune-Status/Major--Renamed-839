package com.jagex;

final class Class26 implements Interface22 {
	public static String decodeString(byte[] is) {
		return Buffer.decodeString(is, 0, is.length);
	}

	public static String method784(String string) {
		StringBuilder stringbuilder = new StringBuilder();
		int i_12_ = string.length();
		for (int i_13_ = 0; i_13_ < i_12_; i_13_++) {
			char c = string.charAt(i_13_);
			if (37 == c && i_12_ > i_13_ + 2) {
				c = string.charAt(1 + i_13_);
				int i_14_;
				if (c >= 48 && c <= 57) {
					i_14_ = c - 48;
				} else if (c >= 97 && c <= 102) {
					i_14_ = 10 + c - 97;
				} else if (c >= 65 && c <= 70) {
					i_14_ = 10 + c - 65;
				} else {
					stringbuilder.append('%');
					continue;
				}
				i_14_ *= 16;
				int i_15_ = string.charAt(i_13_ + 2);
				if (i_15_ >= 48 && i_15_ <= 57) {
					i_14_ += i_15_ - 48;
				} else if (i_15_ >= 97 && i_15_ <= 102) {
					i_14_ += 10 + i_15_ - 97;
				} else if (i_15_ >= 65 && i_15_ <= 70) {
					i_14_ += i_15_ + 10 - 65;
				} else {
					stringbuilder.append('%');
					continue;
				}
				if (i_14_ != 0 && TextureMetricsList.method3168((byte) i_14_)) {
					stringbuilder.append(Class215.byteToChar((byte) i_14_));
				}
				i_13_ += 2;
			} else if (c == 43) {
				stringbuilder.append(' ');
			} else {
				stringbuilder.append(c);
			}
		}
		return stringbuilder.toString();
	}

	static void method781(Player player, boolean bool) {
		if (Class56.menuOptionCount * 84366055 < 406) {
			if (player == Client.localPlayer) {
				if (Client.widgetSelected && 0 != (Class577.selectedWidgetAttributes * -1564025309 & 0x10)) {
					MenuOption.add(
							Client.selectedWidgetAction,
							new StringBuilder().append(Client.aString10789).append(" ").append(Class60.aString677)
									.append(" ").append(Item.getColourHtml(16777215))
									.append(TranslatableString.SELF.translate(Client.currentLanguage)).toString(),
							Class166_Sub8.anInt9550 * -29134223, 16, -1, 0L, 0, 0, true, false,
							player.index * 387935885, false);
				}
			} else {
				String string;
				if (0 == -432563225 * player.skillRating) {
					boolean bool_0_ = true;

					if (Client.localPlayer.combatRange * 878548731 != -1 && 878548731 * player.combatRange != -1) {
						int combatRange = 878548731 * Client.localPlayer.combatRange < player.combatRange * 878548731 ? Client.localPlayer.combatRange * 878548731
								: 878548731 * player.combatRange;
						int combatDifference = Client.localPlayer.combat * 1340998367 - player.combat * 1340998367;

						if (combatDifference < 0) {
							combatDifference = -combatDifference;
						}

						if (combatDifference > combatRange) {
							bool_0_ = false;
						}
					}

					String level = Client.game == GameContext.STELLAR_DAWN ? TranslatableString.RATING
							.translate(Client.currentLanguage) : TranslatableString.LEVEL
							.translate(Client.currentLanguage);
					if (player.combat * 1340998367 >= player.boosted * -919525781) {
						string = new StringBuilder()
								.append(player.formattedName(true))
								.append(bool_0_ ? Class167.getCombatDifferenceHtml(1340998367 * player.combat,
										1340998367 * Client.localPlayer.combat) : Item.getColourHtml(16777215))
								.append(Class60.LEFT_PARENTHESIS).append(level).append(1340998367 * player.combat)
								.append(Class60.RIGHT_PARENTHESIS).toString();
					} else {
						string = new StringBuilder()
								.append(player.formattedName(true))
								.append(bool_0_ ? Class167.getCombatDifferenceHtml(1340998367 * player.combat,
										Client.localPlayer.combat * 1340998367) : Item.getColourHtml(16777215))
								.append(Class60.LEFT_PARENTHESIS).append(level).append(1340998367 * player.combat)
								.append("+").append(-919525781 * player.boosted - 1340998367 * player.combat)
								.append(Class60.RIGHT_PARENTHESIS).toString();
					}
				} else if (-1 == player.skillRating * -432563225) {
					string = player.formattedName(true);
				} else {
					string = new StringBuilder().append(player.formattedName(true)).append(Class60.LEFT_PARENTHESIS)
							.append(TranslatableString.SKILL.translate(Client.currentLanguage))
							.append(-432563225 * player.skillRating).append(Class60.RIGHT_PARENTHESIS).toString();
				}
				boolean bool_4_ = false;
				if (null != player.appearance && player.appearance.npc * 1639350421 != -1) {
					NpcDefinition npcDefinition = NpcDefinition.loader.get(1639350421 * player.appearance.npc);
					if (npcDefinition.aBool3084) {
						bool_4_ = true;
						string = NpcDefinition.loader.get(player.appearance.npc * 1639350421).name;
						if (npcDefinition.combat * -338576685 != 0) {
							String string_5_ = Client.game == GameContext.STELLAR_DAWN ? TranslatableString.RATING
									.translate(Client.currentLanguage) : TranslatableString.LEVEL
									.translate(Client.currentLanguage);
							string = new StringBuilder()
									.append(string)
									.append(Class167.getCombatDifferenceHtml(-338576685 * npcDefinition.combat,
											Client.localPlayer.combat * 1340998367)).append(Class60.LEFT_PARENTHESIS)
									.append(string_5_).append(-338576685 * npcDefinition.combat)
									.append(Class60.RIGHT_PARENTHESIS).toString();
						}
					}
				}
				if (Client.widgetSelected && !bool && (Class577.selectedWidgetAttributes * -1564025309 & 0x8) != 0) {
					MenuOption.add(Client.selectedWidgetAction,
							new StringBuilder().append(Client.aString10789).append(" ").append(Class60.aString677)
									.append(" ").append(Item.getColourHtml(16777215)).append(string).toString(),
							Class166_Sub8.anInt9550 * -29134223, 15, -1, player.index * 387935885, 0, 0, true, false,
							player.index * 387935885, false);
				}
				if (!bool) {
					for (int index = 7; index >= 0; index--) {
						if (null != Client.playerOptions[index]) {
							short offset = 0;
							if (Client.game == GameContext.RUNESCAPE
									&& Client.playerOptions[index].equalsIgnoreCase(TranslatableString.ATTACK
											.translate(Client.currentLanguage))) {
								if (Client.reduceAttackPriority
										&& player.combat * 1340998367 > Client.localPlayer.combat * 1340998367) {
									offset = (short) 2000;
								}

								if (1911759637 * Client.localPlayer.team != 0 && 0 != 1911759637 * player.team) {
									if (1911759637 * player.team == 1911759637 * Client.localPlayer.team) {
										offset = (short) 2000;
									} else {
										offset = (short) 0;
									}
								} else if (player.clanmate) {
									offset = (short) 2000;
								}
							} else if (Client.playerOptionReducedPriority[index]) {
								offset = (short) 2000;
							}

							short type = (short) (offset + Client.PLAYER_OPTION_TYPES[index]);
							int cursor = -1 != Client.playerOptionCursors[index] ? Client.playerOptionCursors[index]
									: 377198047 * Client.anInt10783;
							int colour = bool_4_ ? 16776960 : 16777215;

							MenuOption.add(Client.playerOptions[index], Item.getColourHtml(colour) + string, cursor,
									type, -1, player.index * 387935885, 0, 0, true, false, 387935885 * player.index,
									false);
						}
					}
				} else if (!bool_4_) {
					MenuOption.add(new StringBuilder().append(Item.getColourHtml(13421772)).append(string).toString(),
							"", -1, -1, 0, 0L, 0, 0, false, true, player.index * 387935885, false);
				}
				if (!bool && !bool_4_) {
					for (MenuOption option = MenuOption.options.head(); option != null; option = MenuOption.options
							.next()) {
						if (23 == -20536735 * option.type) {
							option.aString11415 = new StringBuilder().append(Item.getColourHtml(16777215))
									.append(string).toString();
							break;
						}
					}
				}
			}
		}
	}

	static final void method785(long l) {
		if (Client.aClass460_10760.method7687() != null) {
			if (2 == Connection.anInt7170 * 1212513917 || 1212513917 * Connection.anInt7170 == 4) {
				ParameterDefinition.method924(l);
			} else if (1212513917 * Connection.anInt7170 == 6) {
				Class351.method5968(l);
			}
		}
		ParticleSystem.method3934(Class60.activeToolkit, Client.tick);
		if (1764783361 * Client.anInt10790 != -1) {
			Interface.method9889(1764783361 * Client.anInt10790);
		}
		for (int i = 0; i < -573888519 * Client.anInt10848; i++) {
			Client.aBoolArray10851[i] = Client.aBoolArray10850[i];
			Client.aBoolArray10850[i] = false;
		}
		Client.anInt10864 = Client.tick * -401913693;
		Billboard.method6007(-1, -1, 1277578711);
		if (Client.anInt10790 * 1764783361 != -1) {
			Client.anInt10848 = 0;
			Class671.method13823((byte) 0);
		}
		Class60.activeToolkit.method2421();
		Class471.method8052(Class60.activeToolkit);
		int i = Class480_Sub31_Sub1.method17278();
		if (-1 == i) {
			i = Client.anInt10782 * -1573005291;
		}
		if (-1 == i) {
			i = Client.anInt10781 * 918063407;
		}
		CursorDefinition.createCursor(i);
		int i_16_ = Client.localPlayer.boundSize() << 8;
		Class397 class397 = Client.localPlayer.method10164().aClass397_4507;
		Class611.method10321(Client.localPlayer.plane, (int) class397.x + i_16_, (int) class397.z + i_16_,
				360018919 * Client.anInt10595, 651983907);
		Client.anInt10595 = 0;
	}

	@Override
	public DefaultProvidingVarpLoader method119() {
		return SunDefinition.aClass77_Sub1_Sub1_2846;
	}

	@Override
	public VariableBitsDefinitionLoader method120() {
		return VariableBitsDefinition.loader;
	}

	@Override
	public Class566 method121() {
		return Class197.aClass566_9252;
	}

	@Override
	public DefaultProvidingVarpLoader method128() {
		return BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726;
	}

}