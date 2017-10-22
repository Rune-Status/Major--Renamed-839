package com.jagex;

public class PreferenceManager extends Linkable {

	public static final int anInt10260 = 245;
	public static final int anInt10275 = 500;
	static final int BUFFER_SIZE = 44;
	static final int LEGACY_VERSION = 23;
	static final int VERSION = 34;

	public static void method744() {
		int attributes = 0;
		if (Class199.preferences.lighting.getValue() == 1) {
			attributes |= 0x1;
			attributes |= 0x10;
			attributes |= 0x20;
			attributes |= 0x2;
			attributes |= 0x4;
		}

		if (Class199.preferences.textures.getValue() == 0) {
			attributes |= 0x40;
		}

		BaseAnimationDefinitionProvider.method3319(attributes);
		Client.aClass460_10760.getObjectLoader().clear(attributes);
		Class237.aClass461_2622.method7827().getObjectLoader().clear(attributes);
		ItemDefinition.loader.clearModelsCache(attributes);
		NpcDefinition.loader.clear(attributes);
		GraphicDefinition.loader.reset(attributes);
		ReferenceTable.method6962(attributes);
		Program.method4568(attributes);
		Class298_Sub1.method15207(attributes);
		Class501.method8689(attributes);
		DrawableImage.method15208(attributes);
		Client.aClass460_10760.method7705();
	}

	public Class632_Sub11 aClass632_Sub11_10264;
	public Class632_Sub19 aClass632_Sub19_10283;
	public RemoveRoofsPreference aClass632_Sub22_10284;
	public Class632_Sub23 aClass632_Sub23_10272;
	public Class632_Sub28 aClass632_Sub28_10274;
	public ScreenSizePreference aClass632_Sub30_10305;
	public Class632_Sub33 aClass632_Sub33_10293;
	public Class632_Sub8 aClass632_Sub8_10280;
	public AntiAliasingPreference antiAliasing;
	public VolumePreference areaSoundsVolume;
	public BloomPreference bloom;
	public BrightnessPreference brightness;
	public BuildAreaPreference buildArea;
	public CpuUsagePreference cpu;
	public ToolkitPreference currentToolkit;
	public CustomCursorsPreference customCursors;
	public ToolkitPreference desiredToolkit;
	public FlickeringEffectsPreference flickeringEffects;
	public FogPreference fog;
	public GraphicsLevelPreference graphics;
	public GroundBlendingPreference groundBlending;
	public GroundDecorationPreference groundDecoration;
	public IdleAnimationsPreference idleAnimations;
	public LightingDetailPreference lighting;
	public MaxScreenSizePreference maxScreenSize;
	public MobShadowsPreference mobShadows;
	public AntiAliasingPreference multisample;
	public VolumePreference musicVolume;
	public OrthoModePreference orthoMode;
	public ParticlesPreference particles;
	public RemoveRoofsPreference removeRoofs;
	public SafeModePreference safeMode;
	public SceneryShadowsPreference sceneryShadows;
	public ScreenSizePreference screenSize;
	public SkyboxesPreference skyboxes;
	public VolumePreference soundsEffectsVolume;
	public StereoSoundPreference steroSound;
	public TexturesPreference textures;
	public VolumePreference themeMusicVolume;
	public VolumePreference voiceOverVolume;
	public WaterDetailPreference water;
	Class632_Sub21 aClass632_Sub21_10258;
	Class632_Sub26 aClass632_Sub26_10259;
	EnvironmentContext environment;

	GameContext game;

	public PreferenceManager(Buffer buffer, GameContext game, int toolkit) {
		this.game = game;
		environment = new EnvironmentContext(Engine.heapSize * 1926618523, 804666615 * Engine.processorCount,
				IntRaster.architecture.contains("arm"), Class189.osName.startsWith("win"));
		currentToolkit = new ToolkitPreference(toolkit, this);
		decode(buffer);
	}

	public PreferenceManager(GameContext game, int toolkit) {
		this.game = game;
		environment = new EnvironmentContext(1926618523 * Engine.heapSize, Engine.processorCount * 804666615,
				IntRaster.architecture.toLowerCase().contains("arm"), Class189.osName.startsWith("win"));
		currentToolkit = new ToolkitPreference(toolkit, this);
		setDefaults(true, true);
	}

	public Buffer encode() {
		Buffer buffer = new Buffer(BUFFER_SIZE);
		buffer.writeByte(VERSION);
		buffer.writeByte(aClass632_Sub11_10264.getValue());
		buffer.writeByte(antiAliasing.getValue());
		buffer.writeByte(aClass632_Sub21_10258.getValue());
		buffer.writeByte(bloom.getValue());
		buffer.writeByte(brightness.getValue());
		buffer.writeByte(buildArea.getValue());
		buffer.writeByte(aClass632_Sub23_10272.getValue());
		buffer.writeByte(flickeringEffects.getValue());
		buffer.writeByte(fog.getValue());
		buffer.writeByte(groundBlending.getValue());
		buffer.writeByte(groundDecoration.getValue());
		buffer.writeByte(idleAnimations.getValue());
		buffer.writeByte(lighting.getValue());
		buffer.writeByte(sceneryShadows.getValue());
		buffer.writeByte(aClass632_Sub8_10280.getValue());
		buffer.writeByte(0);
		buffer.writeByte(orthoMode.getValue());
		buffer.writeByte(particles.getValue());
		buffer.writeByte(removeRoofs.getValue());
		buffer.writeByte(maxScreenSize.getValue());
		buffer.writeByte(skyboxes.getValue());
		buffer.writeByte(mobShadows.getValue());
		buffer.writeByte(textures.getValue());
		buffer.writeByte(desiredToolkit.getValue());
		buffer.writeByte(0);
		buffer.writeByte(water.getValue());
		buffer.writeByte(screenSize.getValue());
		buffer.writeByte(customCursors.getValue());
		buffer.writeByte(graphics.getValue());
		buffer.writeByte(cpu.getValue());
		buffer.writeByte(aClass632_Sub19_10283.getValue());
		buffer.writeByte(safeMode.getValue());
		buffer.writeByte(aClass632_Sub33_10293.getValue());
		buffer.writeByte(aClass632_Sub26_10259.getValue());
		buffer.writeByte(aClass632_Sub28_10274.getValue());
		buffer.writeByte(soundsEffectsVolume.getValue());
		buffer.writeByte(areaSoundsVolume.getValue());
		buffer.writeByte(voiceOverVolume.getValue());
		buffer.writeByte(musicVolume.getValue());
		buffer.writeByte(themeMusicVolume.getValue());
		buffer.writeByte(steroSound.getValue());
		return buffer;
	}

	public EnvironmentContext getEnvironment() {
		return environment;
	}

	public GameContext getGame() {
		return game;
	}

	public void setLive(ToolkitPreference preference, boolean live) {
		preference.setLive(live);
		validate();
	}

	public void setValue(Preference preference, int value) {
		preference.setIfCompatible(value);
		validate();
	}

	void decode(Buffer buffer) {
		if (buffer == null || buffer.payload == null) {
			setDefaults(true, true);
		} else {
			int version = buffer.readUByte();
			if (version < LEGACY_VERSION) {
				try {
					decodeLegacy(buffer, version);
				} catch (Exception exception) {
					setDefaults(true, true);
				}

				setDefaults(false, true);
			} else if (version > 34) {
				setDefaults(true, true);
			} else {
				if (version >= 29) {
					aClass632_Sub11_10264 = new Class632_Sub11(buffer.readUByte(), this);
				}

				antiAliasing = new AntiAliasingPreference(buffer.readUByte(), this);
				if (version >= 31) {
					aClass632_Sub21_10258 = new Class632_Sub21(buffer.readUByte(), this);
				}

				multisample = new AntiAliasingPreference(antiAliasing.getValue(), this);
				bloom = new BloomPreference(buffer.readUByte(), this);
				brightness = new BrightnessPreference(buffer.readUByte(), this);
				buildArea = new BuildAreaPreference(buffer.readUByte(), this);

				if (version >= 27) {
					aClass632_Sub23_10272 = new Class632_Sub23(buffer.readUByte(), this);
				}

				flickeringEffects = new FlickeringEffectsPreference(buffer.readUByte(), this);
				fog = new FogPreference(buffer.readUByte(), this);
				groundBlending = new GroundBlendingPreference(buffer.readUByte(), this);
				groundDecoration = new GroundDecorationPreference(buffer.readUByte(), this);
				idleAnimations = new IdleAnimationsPreference(buffer.readUByte(), this);
				lighting = new LightingDetailPreference(buffer.readUByte(), this);
				sceneryShadows = new SceneryShadowsPreference(buffer.readUByte(), this);

				if (version >= 33) {
					aClass632_Sub8_10280 = new Class632_Sub8(buffer.readUByte(), this);
				}

				if (version >= 34) {
					buffer.readUByte();
				}

				if (version >= 24) {
					orthoMode = new OrthoModePreference(buffer.readUByte(), this);
				}

				particles = new ParticlesPreference(buffer.readUByte(), this);
				removeRoofs = new RemoveRoofsPreference(buffer.readUByte(), this);
				aClass632_Sub22_10284 = new RemoveRoofsPreference(removeRoofs.getValue(), this);
				maxScreenSize = new MaxScreenSizePreference(buffer.readUByte(), this);

				if (version >= 25) {
					skyboxes = new SkyboxesPreference(buffer.readUByte(), this);
				}

				mobShadows = new MobShadowsPreference(buffer.readUByte(), this);
				if (version <= 25) {
					buffer.offset += 1258142129;
				}

				textures = new TexturesPreference(buffer.readUByte(), this);
				desiredToolkit = new ToolkitPreference(buffer.readUByte(), this);
				currentToolkit = new ToolkitPreference(desiredToolkit.getValue(), this);
				buffer.readUByte();
				water = new WaterDetailPreference(buffer.readUByte(), this);
				screenSize = new ScreenSizePreference(buffer.readUByte(), this);
				aClass632_Sub30_10305 = new ScreenSizePreference(screenSize.getValue(), this);
				customCursors = new CustomCursorsPreference(buffer.readUByte(), this);
				graphics = new GraphicsLevelPreference(buffer.readUByte(), this);
				cpu = new CpuUsagePreference(buffer.readUByte(), this);
				aClass632_Sub19_10283 = new Class632_Sub19(buffer.readUByte(), this);
				safeMode = new SafeModePreference(buffer.readUByte(), this);
				if (version >= 26) {
					aClass632_Sub33_10293 = new Class632_Sub33(buffer.readUByte(), this);
				}

				if (version >= 28) {
					aClass632_Sub26_10259 = new Class632_Sub26(buffer.readUByte(), this);
				}

				if (version >= 30) {
					aClass632_Sub28_10274 = new Class632_Sub28(buffer.readUByte(), this);
				}

				soundsEffectsVolume = new VolumePreference(buffer.readUByte(), this);
				areaSoundsVolume = new VolumePreference(buffer.readUByte(), this);
				voiceOverVolume = new VolumePreference(buffer.readUByte(), this);
				musicVolume = new VolumePreference(buffer.readUByte(), this);
				themeMusicVolume = new VolumePreference(buffer.readUByte(), this);
				steroSound = new StereoSoundPreference(buffer.readUByte(), this);
				setDefaults(false, version < 32);
			}
		}

		validate();
	}

	void decodeLegacy(Buffer buffer, int version) {
		brightness = new BrightnessPreference(buffer.readUByte(), this);
		buffer.offset += 1258142129;
		removeRoofs = new RemoveRoofsPreference(buffer.readUByte() + 1, this);
		groundDecoration = new GroundDecorationPreference(buffer.readUByte(), this);
		buffer.offset += 1258142129;
		idleAnimations = new IdleAnimationsPreference(buffer.readUByte(), this);
		flickeringEffects = new FlickeringEffectsPreference(buffer.readUByte(), this);
		buffer.readUByte();
		mobShadows = new MobShadowsPreference(buffer.readUByte(), this);
		int i_2_ = buffer.readUByte();
		int i_3_ = 0;
		if (version >= 17) {
			i_3_ = buffer.readUByte();
		}

		sceneryShadows = new SceneryShadowsPreference(i_2_ > i_3_ ? i_2_ : i_3_, this);
		boolean bool = true;
		boolean bool_4_ = true;
		if (version >= 2) {
			bool = buffer.readUByte() == 1;
			if (version >= 17) {
				bool_4_ = buffer.readUByte() == 1;
			}
		} else {
			bool = buffer.readUByte() == 1;
			buffer.readUByte();
		}

		lighting = new LightingDetailPreference(bool | bool_4_ ? 1 : 0, this);
		water = new WaterDetailPreference(buffer.readUByte(), this);
		fog = new FogPreference(buffer.readUByte(), this);
		antiAliasing = new AntiAliasingPreference(buffer.readUByte(), this);
		steroSound = new StereoSoundPreference(buffer.readUByte(), this);
		soundsEffectsVolume = new VolumePreference(buffer.readUByte(), this);

		if (version >= 20) {
			voiceOverVolume = new VolumePreference(buffer.readUByte(), this);
		} else {
			voiceOverVolume = new VolumePreference(soundsEffectsVolume.getValue(), this);
		}

		musicVolume = new VolumePreference(buffer.readUByte(), this);
		areaSoundsVolume = new VolumePreference(buffer.readUByte(), this);

		if (version >= 21) {
			themeMusicVolume = new VolumePreference(buffer.readUByte(), this);
		} else {
			themeMusicVolume = new VolumePreference(musicVolume.getValue(), this);
		}

		if (version >= 1) {
			buffer.readUShort();
			buffer.readUShort();
		}
		if (version >= 3 && version < 6) {
			buffer.readUByte();
		}
		if (version >= 4) {
			particles = new ParticlesPreference(buffer.readUByte(), this);
		}
		buffer.readInt();
		if (version >= 6) {
			screenSize = new ScreenSizePreference(buffer.readUByte(), this);
		}
		if (version >= 7) {
			safeMode = new SafeModePreference(buffer.readUByte(), this);
		}
		if (version >= 8) {
			buffer.readUByte();
		}
		if (version >= 9) {
			buildArea = new BuildAreaPreference(buffer.readUByte(), this);
		}
		if (version >= 10) {
			bloom = new BloomPreference(buffer.readUByte(), this);
		}
		if (version >= 11) {
			customCursors = new CustomCursorsPreference(buffer.readUByte(), this);
		}
		if (version >= 12) {
			idleAnimations = new IdleAnimationsPreference(buffer.readUByte(), this);
		}
		if (version >= 13) {
			groundBlending = new GroundBlendingPreference(buffer.readUByte(), this);
		}
		if (version >= 14) {
			desiredToolkit = new ToolkitPreference(buffer.readUByte(), this);
		}
		if (version >= 15) {
			cpu = new CpuUsagePreference(buffer.readUByte(), this);
		}
		if (version >= 16) {
			textures = new TexturesPreference(buffer.readUByte(), this);
		}
		if (version >= 18) {
			graphics = new GraphicsLevelPreference(buffer.readUByte(), this);
		}
		if (version >= 19) {
			maxScreenSize = new MaxScreenSizePreference(buffer.readUByte(), this);
		}
		if (version >= 22) {
			aClass632_Sub19_10283 = new Class632_Sub19(buffer.readUByte(), this);
		}
	}

	void setDefaults(boolean all, boolean bool2) {
		if (all || null == aClass632_Sub11_10264) {
			aClass632_Sub11_10264 = new Class632_Sub11(this);
		}
		if (all || antiAliasing == null) {
			antiAliasing = new AntiAliasingPreference(this);
		}
		if (all || null == aClass632_Sub21_10258) {
			aClass632_Sub21_10258 = new Class632_Sub21(this);
		}
		if (all || multisample == null) {
			multisample = new AntiAliasingPreference(antiAliasing.getValue(), this);
		}
		if (all || bloom == null) {
			bloom = new BloomPreference(this);
		}
		if (all || brightness == null) {
			brightness = new BrightnessPreference(this);
		}
		if (all || null == buildArea) {
			buildArea = new BuildAreaPreference(this);
		}
		if (all || aClass632_Sub23_10272 == null) {
			aClass632_Sub23_10272 = new Class632_Sub23(this);
		}
		if (all || null == flickeringEffects) {
			flickeringEffects = new FlickeringEffectsPreference(this);
		}
		if (all || fog == null) {
			fog = new FogPreference(this);
		}
		if (all || null == groundBlending) {
			groundBlending = new GroundBlendingPreference(this);
		}
		if (all || groundDecoration == null) {
			groundDecoration = new GroundDecorationPreference(this);
		}
		if (all || null == idleAnimations) {
			idleAnimations = new IdleAnimationsPreference(this);
		}
		if (all || lighting == null) {
			lighting = new LightingDetailPreference(this);
		}
		if (all || null == sceneryShadows) {
			sceneryShadows = new SceneryShadowsPreference(this);
		}
		if (all || null == aClass632_Sub8_10280) {
			aClass632_Sub8_10280 = new Class632_Sub8(this);
		}
		if (all || null == orthoMode) {
			orthoMode = new OrthoModePreference(this);
		}
		if (all || particles == null) {
			particles = new ParticlesPreference(this);
		}
		if (all || removeRoofs == null) {
			removeRoofs = new RemoveRoofsPreference(this);
		}
		if (all || aClass632_Sub22_10284 == null) {
			aClass632_Sub22_10284 = new RemoveRoofsPreference(removeRoofs.getValue(), this);
		}
		if (all || null == maxScreenSize) {
			maxScreenSize = new MaxScreenSizePreference(this);
		}
		if (all || skyboxes == null) {
			skyboxes = new SkyboxesPreference(this);
		}
		if (all || null == mobShadows) {
			mobShadows = new MobShadowsPreference(this);
		}
		if (all || null == textures) {
			textures = new TexturesPreference(this);
		}
		if (all || desiredToolkit == null) {
			desiredToolkit = new ToolkitPreference(this);
		}
		if (all || currentToolkit == null) {
			currentToolkit = new ToolkitPreference(desiredToolkit.getValue(), this);
		}
		if (all || null == water) {
			water = new WaterDetailPreference(this);
		}
		if (all || screenSize == null) {
			screenSize = new ScreenSizePreference(this);
		}
		if (all || null == aClass632_Sub30_10305) {
			aClass632_Sub30_10305 = new ScreenSizePreference(screenSize.getValue(), this);
		}
		if (all || null == customCursors) {
			customCursors = new CustomCursorsPreference(this);
		}
		if (all || graphics == null) {
			graphics = new GraphicsLevelPreference(this);
		}
		if (all || cpu == null) {
			cpu = new CpuUsagePreference(this);
		}
		if (all || aClass632_Sub19_10283 == null) {
			aClass632_Sub19_10283 = new Class632_Sub19(this);
		}
		if (all || null == safeMode) {
			safeMode = new SafeModePreference(this);
		}
		if (all || aClass632_Sub33_10293 == null) {
			aClass632_Sub33_10293 = new Class632_Sub33(this);
		}
		if (all || null == aClass632_Sub26_10259) {
			aClass632_Sub26_10259 = new Class632_Sub26(this);
		}
		if (all || null == aClass632_Sub28_10274) {
			aClass632_Sub28_10274 = new Class632_Sub28(this);
		}
		if (all || bool2 || soundsEffectsVolume == null) {
			soundsEffectsVolume = new VolumePreference(this);
		}
		if (all || bool2 || null == areaSoundsVolume) {
			areaSoundsVolume = new VolumePreference(this);
		}
		if (all || bool2 || voiceOverVolume == null) {
			voiceOverVolume = new VolumePreference(this);
		}
		if (all || bool2 || null == musicVolume) {
			musicVolume = new VolumePreference(this);
		}
		if (all || bool2 || themeMusicVolume == null) {
			themeMusicVolume = new VolumePreference(this);
		}
		if (all || bool2 || steroSound == null) {
			steroSound = new StereoSoundPreference(this);
		}
	}

	void validate() {
		aClass632_Sub11_10264.validate();
		antiAliasing.validate();
		aClass632_Sub21_10258.validate();
		multisample.validate();
		bloom.validate();
		brightness.validate();
		buildArea.validate();
		aClass632_Sub23_10272.validate();
		flickeringEffects.validate();
		fog.validate();
		groundBlending.validate();
		groundDecoration.validate();
		idleAnimations.validate();
		lighting.validate();
		sceneryShadows.validate();
		aClass632_Sub8_10280.validate();
		orthoMode.validate();
		particles.validate();
		removeRoofs.validate();
		aClass632_Sub22_10284.validate();
		maxScreenSize.validate();
		skyboxes.validate();
		mobShadows.validate();
		textures.validate();
		desiredToolkit.validate();
		currentToolkit.validate();
		water.validate();
		screenSize.validate();
		aClass632_Sub30_10305.validate();
		customCursors.validate();
		graphics.validate();
		cpu.validate();
		aClass632_Sub19_10283.validate();
		safeMode.validate();
		aClass632_Sub33_10293.validate();
		aClass632_Sub26_10259.validate();
		aClass632_Sub28_10274.validate();
		soundsEffectsVolume.validate();
		areaSoundsVolume.validate();
		voiceOverVolume.validate();
		musicVolume.validate();
		themeMusicVolume.validate();
		steroSound.validate();
	}

	static void method1627(Class11_Sub1 class11_sub1, int i, int i_0_) {
		class11_sub1.method16226(i);
		int i_2_;
	
		if (i_0_ > 100000) {
			VarpLoaderIterator.method9691();
			i_2_ = 4;
		} else if (i_0_ > 50000) {
			method1038();
			i_2_ = 3;
		} else if (i_0_ > 10000) {
			setDefaultPreferences();
			i_2_ = 2;
		} else {
			Engine.method8026(true);
			i_2_ = 1;
		}
	
		if (Class199.preferences.currentToolkit.getValue() != i) {
			Class199.preferences.setValue(Class199.preferences.desiredToolkit, i);
			ChecksumTableEntry.method6355(i, false);
		} else {
			Class199.preferences.setLive(Class199.preferences.currentToolkit, true);
		}
	
		Client.savePreferences();
		class11_sub1.method16219(i_2_);
	}

	public static void method1038() {
		Class199.preferences.setValue(Class199.preferences.removeRoofs, 2);
		Class199.preferences.setValue(Class199.preferences.aClass632_Sub22_10284, 2);
		Class199.preferences.setValue(Class199.preferences.groundDecoration, 1);
		Class199.preferences.setValue(Class199.preferences.groundBlending, 1);
		Class199.preferences.setValue(Class199.preferences.idleAnimations, 1);
		Class199.preferences.setValue(Class199.preferences.flickeringEffects, 1);
		Class199.preferences.setValue(Class199.preferences.mobShadows, 1);
		Class199.preferences.setValue(Class199.preferences.textures, 1);
		Class199.preferences.setValue(Class199.preferences.sceneryShadows, 1);
		Class199.preferences.setValue(Class199.preferences.lighting, 1);
		Class199.preferences.setValue(Class199.preferences.water, 0);
		Class199.preferences.setValue(Class199.preferences.fog, 1);
		Class199.preferences.setValue(Class199.preferences.antiAliasing, 0);
		Class199.preferences.setValue(Class199.preferences.multisample, 0);
		Class199.preferences.setValue(Class199.preferences.particles, 1);
		Class199.preferences.setValue(Class199.preferences.buildArea, MapSize.STANDARD.type * 1283574337);
		Class199.preferences.setValue(Class199.preferences.bloom, 0);
		if (Class60.activeToolkit != null && Class60.activeToolkit.method2688() && Class60.activeToolkit.method2496()) {
			Class60.activeToolkit.method2495();
		}

		Class199.preferences.setValue(Class199.preferences.skyboxes, 1);
		Class199.preferences.setValue(Class199.preferences.aClass632_Sub11_10264, 1);
		TurnMobCutsceneAction.resetCpuPreference();
		Class199.preferences.setValue(Class199.preferences.maxScreenSize, 1);
		Class199.preferences.setValue(Class199.preferences.graphics, 3);
		method744();
		Client.aClass460_10760.method7690().method9709();
		Client.aBool10905 = true;
	}

	public static void setDefaultPreferences() {
		Class199.preferences.setValue(Class199.preferences.removeRoofs, 1);
		Class199.preferences.setValue(Class199.preferences.aClass632_Sub22_10284, 1);
		Class199.preferences.setValue(Class199.preferences.groundDecoration, 1);
		Class199.preferences.setValue(Class199.preferences.groundBlending, 1);
		Class199.preferences.setValue(Class199.preferences.idleAnimations, 0);
		Class199.preferences.setValue(Class199.preferences.flickeringEffects, 0);
		Class199.preferences.setValue(Class199.preferences.mobShadows, 0);
		Class199.preferences.setValue(Class199.preferences.sceneryShadows, 0);
		Class199.preferences.setValue(Class199.preferences.textures, 0);
		Class199.preferences.setValue(Class199.preferences.lighting, 0);
		Class199.preferences.setValue(Class199.preferences.water, 0);
		Class199.preferences.setValue(Class199.preferences.fog, 0);
		Class199.preferences.setValue(Class199.preferences.antiAliasing, 0);
		Class199.preferences.setValue(Class199.preferences.multisample, 0);
		Class199.preferences.setValue(Class199.preferences.particles, 0);
		Class199.preferences.setValue(Class199.preferences.buildArea, MapSize.STANDARD.type * 1283574337);
		Class199.preferences.setValue(Class199.preferences.bloom, 0);

		if (Class60.activeToolkit != null && Class60.activeToolkit.method2688() && Class60.activeToolkit.method2496()) {
			Class60.activeToolkit.method2495();
		}

		Class199.preferences.setValue(Class199.preferences.skyboxes, 0);
		Class199.preferences.setValue(Class199.preferences.aClass632_Sub11_10264, 0);
		TurnMobCutsceneAction.resetCpuPreference();
		Class199.preferences.setValue(Class199.preferences.maxScreenSize, 2);
		Class199.preferences.setValue(Class199.preferences.graphics, 2);
		method744();
		Client.aClass460_10760.method7690().method9709();
		Client.aBool10905 = true;
	}

}