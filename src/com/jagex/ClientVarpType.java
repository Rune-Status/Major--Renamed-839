package com.jagex;

final class ClientVarpType extends VarpType {
	static int method15442() {
		if (Class199.preferences.safeMode.getValue() == 0) {
			for (int i_4_ = 0; i_4_ < 1019900971 * Client.anInt10690; i_4_++) {
				if (Client.anInterface59Array10637[i_4_].getCharacter() == 's'
						|| Client.anInterface59Array10637[i_4_].getCharacter() == 'S') {
					Class199.preferences.setValue(Class199.preferences.safeMode, 1);
					Client.aBool10599 = true;
					Class359.method6033(Class22.aClass22_306);
					break;
				}
			}
		}
		if (Class262.aClass262_2650 == Class262.aClass262_2940) {
			if (null == ArchiveLoader.aClass402_4522) {
				ArchiveLoader.aClass402_4522 = new ResourceManager(Class364.netWorker, Class467.aClass432_6478,
						BefriendedPlayer.cacheWorker, Class62.aBigInteger687, Class62.aBigInteger685);
			}
			if (!ArchiveLoader.aClass402_4522.init()) {
				return 0;
			}
			Class522.method8955(0, null, true);
			NpcVarpType.aBool9950 = !Class527.method8986();
			Class277.aClass406_3123 = Archive.create(NpcVarpType.aBool9950 ? ArchiveType.ARCHIVE_34
					: ArchiveType.ARCHIVE_32, false, 1, true);
			UnboundedDefinitionLoader.aClass406_231 = Archive.create(ArchiveType.GAME_TIPS, false, 1, true);
			Class80.fonts = Archive.create(ArchiveType.FONTS, false, 1, true);
		}
		if (Class262.aClass262_2941 == Class262.aClass262_2650) {
			boolean bool = UnboundedDefinitionLoader.aClass406_231.complete();
			int i_5_ = Archive.providers[ArchiveType.GAME_TIPS.toInteger()].tablePercentage();
			i_5_ = i_5_
					+ Archive.providers[NpcVarpType.aBool9950 ? ArchiveType.ARCHIVE_34.toInteger()
							: ArchiveType.ARCHIVE_32.toInteger()].tablePercentage();
			i_5_ += Archive.providers[ArchiveType.FONTS.toInteger()].tablePercentage();
			i_5_ = i_5_ + (bool ? 100 : UnboundedDefinitionLoader.aClass406_231.percentComplete());
			if (400 != i_5_) {
				return i_5_ / 4;
			}
			Class277.anInt3119 = Class277.aClass406_3123.getTableChecksum() * -91656159;
			Class277.anInt3120 = UnboundedDefinitionLoader.aClass406_231.getTableChecksum() * -957755877;
			Class24.initFonts(Class277.aClass406_3123);
			int i_6_ = Class199.preferences.aClass632_Sub19_10283.getValue();
			Class148.aClass35_1827 = new Class35(Client.game, Client.currentLanguage,
					UnboundedDefinitionLoader.aClass406_231);
			Class23[] class23s = Class148.aClass35_1827.method982(i_6_);
			if (0 == class23s.length) {
				class23s = Class148.aClass35_1827.method982(0);
			}
			Class286 class286 = new Class286(Class277.aClass406_3123, Class80.fonts);
			if (class23s.length > 0) {
				Class277.anInterface27Array3114 = new Interface27[class23s.length];
				for (int i_7_ = 0; i_7_ < Class277.anInterface27Array3114.length; i_7_++) {
					Class277.anInterface27Array3114[i_7_] = new Class274(
							Class148.aClass35_1827.method981(1251619505 * class23s[i_7_].anInt325), -239473137
									* class23s[i_7_].anInt323, -76309551 * class23s[i_7_].anInt324, class286);
				}
			}
		}
		if (Class262.aClass262_2924 == Class262.aClass262_2650) {
			Class509.aClass374_6997 = new Class374(Class277.aClass406_3123, Class80.fonts,
					FontSpecification.getFontIndices());
		}
		if (Class262.aClass262_2650 == Class262.aClass262_2925) {
			int i_8_ = Class509.aClass374_6997.method6150();
			int i_9_ = Class509.aClass374_6997.method6123();
			if (i_8_ < i_9_) {
				return 100 * i_8_ / i_9_;
			}
		}
		if (Class262.aClass262_2650 == Class262.aClass262_2923) {
			if (null != Class277.anInterface27Array3114 && Class277.anInterface27Array3114.length > 0) {
				if (Class277.anInterface27Array3114[0].method160() < 100) {
					return 0;
				}
				if (Class277.anInterface27Array3114.length > 1 && Class148.aClass35_1827.method983()
						&& Class277.anInterface27Array3114[1].method160() < 100) {
					return 0;
				}
			}
			Class509.aClass374_6997.init(Client.anInterface47_10645);
			Class222.method4165(Class60.activeToolkit);
			Class536.setGameState(5);
		}
		if (Class262.aClass262_2650 == Class262.aClass262_2922) {
			DequeIterator.images = Archive.create(ArchiveType.IMAGES, false, 1, true);
			Deque.frames = Archive.create(ArchiveType.FRAMES, false, 1, true);
			Class340_Sub3.frameBases = Archive.create(ArchiveType.FRAME_BASES, false, 1, true);
			Class350.config = Archive.create(ArchiveType.CONFIG, false, 1, true);
			Class671.widgets = Archive.create(ArchiveType.WIDGETS, false, 1, true);
			BufferedConnectionContext.maps = Archive.create(ArchiveType.MAPS, true, 1, true);
			Class436.models = Archive.create(ArchiveType.MODELS, false, 1, true);
			Class51.textures = Archive.create(ArchiveType.TEXTURES, true, 1, true);
			Class467.materials = Archive.create(ArchiveType.MATERIALS, true, 1, true);
			ClientVarpType.huffman = Archive.create(ArchiveType.HUFFMAN, false, 1, true);
			Script.scripts = Archive.create(ArchiveType.SCRIPTS, false, 1, true);

			if (!Class252.aBool2693) {
				Class480_Sub21_Sub3.soundEffects = Archive.create(ArchiveType.SOUND_EFFECTS, true, 1, false);
				Class614.music = Archive.create(ArchiveType.MUSIC, true, 1, false);
			}

			Class51.objects = Archive.create(ArchiveType.OBJECTS, false, 1, true);
			Class285.enumerations = Archive.create(ArchiveType.ENUMERATIONS, false, 1, true);
			ResourceProvider.npcs = Archive.create(ArchiveType.NPCS, false, 1, true);
			Class215.items = Archive.create(ArchiveType.ITEMS, false, 1, true);
			TranslatableString.animations = Archive.create(ArchiveType.ANIMATIONS, false, 1, true);
			Ground.graphics = Archive.create(ArchiveType.SPOT_ANIMATIONS, false, 1, true);
			Class501.varbits = Archive.create(ArchiveType.VARBITS, false, 1, true);
			DequeIterator.worldMapInfo = Archive.create(ArchiveType.WORLD_MAP_INFO, true, 1, true);
			SetMemberRankChannelUpdate.worldMap = Archive.create(ArchiveType.WORLD_MAP_DATA, true, 1, true);
			Client.quickChat = Archive.create(ArchiveType.QUICK_CHAT, false, 1, true);
			Class337.restrictedQuickChat = Archive.create(ArchiveType.RESTRICTED_QUICK_CHAT, false, 1, true);
			ValueType.textureDefinitions = Archive.create(ArchiveType.TEXTURE_DEFINITIONS, true, 1, true);
			Class23.particles = Archive.create(ArchiveType.PARTICLES, false, 1, true);
			Class22.defaults = Archive.create(ArchiveType.DEFAULTS, true, 1, true);
			Billboard.billboards = Archive.create(ArchiveType.BILLBOARDS, false, 1, true);
			Class140.cutscenes = Archive.create(ArchiveType.CUTSCENES, true, 1, true);
			Class580.natives = Archive.create(ArchiveType.NATIVES, true, 1, true);
			Class54.shaders = Archive.create(ArchiveType.SHADERS, true, 1, true);
		}
		if (Class262.aClass262_2928 == Class262.aClass262_2650) {
			int percentage = 0;
			for (int index = 0; index < Archive.providers.length; index++) {
				if (null != Archive.providers[index]) {
					percentage += Archive.providers[index].tablePercentage() * Class277.anIntArray3116[index] / 100;
				}
			}

			if (percentage != 100) {
				if (-205963767 * Class277.anInt3124 < 0) {
					Class277.anInt3124 = percentage * 788770873;
				}
				return 100 * (percentage - -205963767 * Class277.anInt3124) / (100 - -205963767 * Class277.anInt3124);
			}

			Client.getVitalImageIndices(DequeIterator.images);
			Class509.aClass374_6997 = new Class374(DequeIterator.images, Class80.fonts,
					FontSpecification.getFontIndices());
		}
		if (Class262.aClass262_2650 == Class262.aClass262_2929) {
			byte[] is = Class22.defaults.get(-1881625811 * Class577.aClass577_7729.file);
			if (null == is) {
				return 0;
			}

			TurnMobCutsceneAction.aClass186_9434 = new Class186();
			if (!Class252.aBool2693) {
				TurnMobCutsceneAction.aClass186_9434.method3590(50, 7340032);
			}

			Class75.method1615(is);
			Class536.setGameState(19);
		}
		if (Class262.aClass262_2926 == Class262.aClass262_2650 && LibraryLoader.natives == null) {
			LibraryLoader.natives = new NativeLibraryTable(Class580.natives);
			Class286.method5290(LibraryLoader.natives);
		}
		if (Class262.aClass262_2650 == Class262.aClass262_2935) {
			int i_12_ = Client.loadRequiredFiles();
			if (i_12_ < 100) {
				return i_12_;
			}

			Class7_Sub1.method16830(Class22.defaults.get(Class577.aClass577_7734.file * -1881625811));
			Mob.defaults = new MobDefaults(Class22.defaults);
			UnboundedDefinitionLoader.originalBodyColours = Mob.defaults.originalColours;
			HuffmanCodec.replacementBodyColours = Mob.defaults.replacementColours;

			if (-1 != Mob.defaults.anInt7585 * 2105964905 && 2146047459 * Mob.defaults.anInt7599 != -1) {
				Client.anInt10682 = 1186575901 * Mob.defaults.anInt7585;
				Client.anInt10813 = Mob.defaults.anInt7599 * -217067231;
			}

			EquipmentDefaults.defaults = new EquipmentDefaults(Class22.defaults);
			Class197.aClass566_9252 = new Class566(Class22.defaults);
			Script.aClass580_11401 = new Class580(Class22.defaults);
			Class453.aClass558_5097 = new Class558(Class22.defaults);
			Class495.aClass560_6827 = new Class560(Class22.defaults);
		}
		if (Class262.aClass262_2932 == Class262.aClass262_2650) {
			if (-1 != Mob.defaults.profilingModel * -587121439
					&& !Class436.models.loaded(-587121439 * Mob.defaults.profilingModel, 0)) {
				return 99;
			}

			CachedParticleDefinitionLoader.aClass147_3727 = new TextureMetricsList(ValueType.textureDefinitions);
			CutsceneObject.anInterface19_1944 = new Class136_Sub1(Class51.textures, Class467.materials);
			ParameterDefinition.loader = new ParameterDefinitionLoader(Client.game, Client.currentLanguage,
					Class350.config);
			ProxyingVariableLoader.aClass678_Sub6_3003 = new Class678_Sub6(Client.game, Client.currentLanguage, Class350.config);
			CursorDefinition.loader = new CursorDefinitionLoader(Client.game, Client.currentLanguage, Class350.config,
					DequeIterator.images);
			EnumDefinition.loader = new EnumDefinitionLoader(Client.game, Client.currentLanguage, Class285.enumerations);
			OverlayDefinition.loader = new OverlayDefinitionLoader(Client.game, Client.currentLanguage, Class350.config);
			UnderlayDefinition.loader = new UnderlayDefinitionLoader(Client.game, Client.currentLanguage,
					Class350.config);
			HitsplatDefinition.loader = new HitsplatDefinitionLoader(Client.game, Client.currentLanguage,
					Class350.config, DequeIterator.images);
			HitbarDefinition.loader = new HitbarDefinitionLoader(Client.game, Client.currentLanguage, Class350.config,
					DequeIterator.images);
			IdentikitDefinition.loader = new IdentikitDefinitionLoader(Client.game, Client.currentLanguage,
					Class350.config, Class436.models);
			WeakReferenceTable.aClass678_Sub12_558 = new Class678_Sub12(Client.game, Client.currentLanguage,
					Class350.config);
			Class457.aClass678_Sub21_5151 = new Class678_Sub21(Client.game, Client.currentLanguage, Class350.config);
			Class539.aClass678_Sub17_7330 = new ObjectDefinitionLoader(Client.game, Client.currentLanguage, true,
					Class51.objects, Class436.models);
			Client.aClass460_10760.setObjectLoader(Class539.aClass678_Sub17_7330);
			Class237.aClass461_2622.method7824(new ObjectDefinitionLoader(Client.game, Client.currentLanguage, true,
					Class51.objects, Class436.models));
			Queue.aClass678_Sub8_8139 = new Class678_Sub8(Client.game, Client.currentLanguage, Class350.config,
					DequeIterator.images);
			MapSceneDefinition.loader = new MapSceneDefinitionLoader(Client.game, Client.currentLanguage,
					Class350.config, DequeIterator.images);
			NpcDefinition.loader = new NpcDefinitionLoader(Client.game, Client.currentLanguage, true,
					ResourceProvider.npcs, Class436.models);
			ItemDefinition.loader = new ItemDefinitionLoader(Client.game, Client.currentLanguage, true,
					ParameterDefinition.loader, Class215.items, Class436.models);
			QuestDefinition.loader = new QuestDefinitionLoader(Client.game, Client.currentLanguage, Class350.config,
					true);
			Class453.aClass678_Sub3_5096 = new Class678_Sub3(Client.game, Client.currentLanguage, Class350.config);
			AnimationDefinition.loader = new AnimationDefinitionLoader(Client.game, Client.currentLanguage,
					TranslatableString.animations, Deque.frames, Class340_Sub3.frameBases, Class453.aClass678_Sub3_5096);
			SkyboxDefinition.loader = new SkyboxDefinitionLoader(Client.game, Client.currentLanguage, Class350.config);
			SunDefinition.loader = new SunDefinitionLoader(Client.game, Client.currentLanguage, Class350.config);
			GraphicDefinition.loader = new GraphicDefinitionLoader(Client.game, Client.currentLanguage,
					Ground.graphics, Class436.models);
			Class548.aClass7_Sub1_7467 = new Class7_Sub1(Client.game, Client.currentLanguage, Class501.varbits, true);
			Class630.aClass77_Sub1_Sub1_8060 = new VarpDefinitionLoader(Client.game, VarpType.CLIENT,
					Client.currentLanguage, Class350.config);
			BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726 = new PlayerVarpDefinitionLoader(Client.game,
					VarpType.PLAYER, Client.currentLanguage, Class350.config);
			Npc.varpLoader = new VarpDefinitionLoader(Client.game, VarpType.NPC,
					Client.currentLanguage, Class350.config);
			Class501.aClass77_Sub1_Sub1_6903 = new VarpDefinitionLoader(Client.game, VarpType.CLAN,
					Client.currentLanguage, Class350.config);
			Class184.aClass77_Sub1_Sub1_2006 = new VarpDefinitionLoader(Client.game, VarpType.CLAN_SETTING,
					Client.currentLanguage, Class350.config);
			SunDefinition.aClass77_Sub1_Sub1_2846 = new VarpDefinitionLoader(Client.game, VarpType.aClass441_5047,
					Client.currentLanguage, Class350.config);
			ProxyingVariableLoader.parameters = Class154.method3281(new DefaultProvidingVarpLoader[] {
					Class630.aClass77_Sub1_Sub1_8060, BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726,
					Npc.varpLoader, Class501.aClass77_Sub1_Sub1_6903,
					Class184.aClass77_Sub1_Sub1_2006, SunDefinition.aClass77_Sub1_Sub1_2846 });
			VariableBitsDefinition.loader = new VariableBitsDefinitionLoader(Client.game, Client.currentLanguage,
					Class350.config, ProxyingVariableLoader.parameters);
			Class378.anInterface14_4201 = new ProxyingVariableLoader();
			ShaderMetaBuffer.method4368(Class671.widgets, Class436.models, DequeIterator.images, Class80.fonts);
			ArchiveBillboardsLoader.instance = new ArchiveBillboardsLoader(Billboard.billboards);
			Class274.aClass364_3093 = new Class364(Class23.particles);
			ParticleProducerDefinition.loader = new CachedParticleDefinitionLoader(Class23.particles);
			AnimateObjectCutsceneAction.aClass420_9538 = new QuickChatCategoryLoader(Client.currentLanguage, Client.quickChat,
					Class337.restrictedQuickChat);
			ThemeMusicVolumeNormaliser.aClass10_2062 = new QuickChatMessageLoader(Client.currentLanguage,
					Client.quickChat, Class337.restrictedQuickChat, new DefinitionChatInterpolantProvider());
			PlayerVariableProvider.instance = new PlayerVariableProvider(
					BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726, VariableBitsDefinition.loader,
					Class197.aClass566_9252.method9564());
			PreferenceManager.method744();
			AnimationDefinitionLoader.init(AnimationDefinition.loader);
			Class575.method9765(Class274.aClass364_3093);
			Class155.method3285(Class436.models, CachedParticleDefinitionLoader.aClass147_3727,
					CutsceneObject.anInterface19_1944);
			HuffmanCodec huffman = new HuffmanCodec(ClientVarpType.huffman.get("huffman", ""));
			GroundDecoration.method18064(huffman);
			Engine.aClass467_6508 = Class467.method6970();
			AsynchronousInputStream.systemInfo = new SystemInformation(true);
		}
		if (Class262.aClass262_2650 == Class262.aClass262_2933) {
			int i_13_ = SoundEffectsVolumeNormaliser.loadedVitalImageCount(DequeIterator.images)
					+ Class509.aClass374_6997.method6148(true);
			int i_14_ = 10 + Class509.aClass374_6997.method6123();
			if (i_13_ < i_14_) {
				return 100 * i_13_ / i_14_;
			}
		}
		if (Class262.aClass262_2934 == Class262.aClass262_2650) {
			Class495.method8547(DequeIterator.worldMapInfo, SetMemberRankChannelUpdate.worldMap,
					OverlayDefinition.loader, UnderlayDefinition.loader, Client.aClass460_10760.getObjectLoader(),
					Queue.aClass678_Sub8_8139, MapSceneDefinition.loader, PlayerVariableProvider.instance,
					PlayerVariableProvider.instance);
		}
		if (Class262.aClass262_2650 == Class262.aClass262_2936) {
			Class199.aClass126_Sub1_2099 = new Class126_Sub1(Class630.aClass77_Sub1_Sub1_8060);
			Class339.method5852();
			SkyboxDefinition.aClass55_7012 = TranslatableString.method554();
			BufferedConnectionContext.maps.clearNames(false, true);
			DequeIterator.images.clearNames(true, true);
			Class80.fonts.clearNames(true, true);
			ClientVarpType.huffman.clearNames(true, true);
			Client.aBool10625 = true;
		}
		if (Class262.aClass262_2931 == Class262.aClass262_2650 && Mob.defaults.loginWindow * 1673114103 != -1) {
			if (!Widget.loadInterface(1673114103 * Mob.defaults.loginWindow, null)) {
				return 0;
			}
			boolean bool = true;
			for (int i_15_ = 0; i_15_ < Class598.loadedInterfaces[1673114103 * Mob.defaults.loginWindow].children.length; i_15_++) {
				Widget class226 = Class598.loadedInterfaces[1673114103 * Mob.defaults.loginWindow].children[i_15_];
				if (5 == 1558474223 * class226.type && -1 != class226.anInt2409 * -370763243
						&& !DequeIterator.images.loaded(-370763243 * class226.anInt2409, 0)) {
					bool = false;
				}
			}
			if (!bool) {
				return 0;
			}
		}
		if (Class262.aClass262_2650 == Class262.aClass262_2937) {
			Client.method9237(true);
		}
		if (Class262.aClass262_2938 == Class262.aClass262_2650) {
			IgnoredPlayer.aClass266_670.method5008();
			try {
				Class263.aThread2955.join();
			} catch (InterruptedException interruptedexception) {
				return 0;
			}
			IgnoredPlayer.aClass266_670 = null;
			Class263.aThread2955 = null;
			Class277.aClass406_3123 = null;
			UnboundedDefinitionLoader.aClass406_231 = null;
			Class148.aClass35_1827 = null;
			Class277.anInterface27Array3114 = null;
			Class215.method4036();
			Client.aBool10598 = Class199.preferences.safeMode.getValue() == 1;
			Class199.preferences.setValue(Class199.preferences.safeMode, 1);
			if (Client.aBool10598) {
				Class199.preferences.setValue(Class199.preferences.desiredToolkit, 0);
			} else if (Class199.preferences.desiredToolkit.defaultValue
					&& AsynchronousInputStream.systemInfo.anInt10408 * -2033165835 < 512
					&& AsynchronousInputStream.systemInfo.anInt10408 * -2033165835 != 0) {
				Class199.preferences.setValue(Class199.preferences.desiredToolkit, 0);
			}
			Client.savePreferences();
			if (Client.aBool10598) {
				ChecksumTableEntry.method6355(0, false);
				if (!Client.aBool10599) {
					Class359.method6033(Class22.aClass22_315);
				}
			} else {
				ChecksumTableEntry.method6355(Class199.preferences.desiredToolkit.getValue(), false);
				if (Class199.preferences.desiredToolkit.getValue() == 0) {
					Class359.method6033(Class22.aClass22_316);
				}
			}
			Class254.method4740(Class199.preferences.screenSize.getValue(), -1, -1, false);
			Class509.aClass374_6997.init(Client.anInterface47_10645);
			Class222.method4165(Class60.activeToolkit);
			Sprite.loadVitalImages(Class60.activeToolkit, DequeIterator.images);
			Sprite.method8794(WeakReferenceTable.nameIcons);
		}
		return Class257.method4760();
	}

	public static Archive huffman;

	ClientVarpType(ConfigEntry config, int id) {
		super(config, id);
	}

	@Override
	Object method7337(BaseVariableParameterDefinition parameter) {
		if (CharacterType.I_LOWER == parameter.aClass422_1515 || CharacterType.ONE == parameter.aClass422_1515) {
			return -1;
		}

		return parameter.aClass422_1515.method7017();
	}

}