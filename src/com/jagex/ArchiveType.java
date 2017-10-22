package com.jagex;

public class ArchiveType {
	public static final ArchiveType FRAMES = new ArchiveType(0, false);
	public static final ArchiveType FRAME_BASES = new ArchiveType(1, false);
	public static final ArchiveType CONFIG = new ArchiveType(2, false);
	public static final ArchiveType WIDGETS = new ArchiveType(3, false);
	public static final ArchiveType MAPS = new ArchiveType(5, false);
	public static final ArchiveType MODELS = new ArchiveType(7, false);
	public static final ArchiveType IMAGES = new ArchiveType(8, false);
	public static final ArchiveType HUFFMAN = new ArchiveType(10, false);
	public static final ArchiveType SCRIPTS = new ArchiveType(12, false);
	public static final ArchiveType FONTS = new ArchiveType(13, false);
	public static final ArchiveType SOUND_EFFECTS = new ArchiveType(14, false);
	public static final ArchiveType OBJECTS = new ArchiveType(16, false);
	public static final ArchiveType ENUMERATIONS = new ArchiveType(17, false);
	public static final ArchiveType NPCS = new ArchiveType(18, false);
	public static final ArchiveType ITEMS = new ArchiveType(19, false);
	public static final ArchiveType ANIMATIONS = new ArchiveType(20, false);
	public static final ArchiveType SPOT_ANIMATIONS = new ArchiveType(21, false);
	public static final ArchiveType VARBITS = new ArchiveType(22, false);
	public static final ArchiveType WORLD_MAP_INFO = new ArchiveType(23, false);
	public static final ArchiveType QUICK_CHAT = new ArchiveType(24, false);
	public static final ArchiveType RESTRICTED_QUICK_CHAT = new ArchiveType(25, false);
	public static final ArchiveType TEXTURE_DEFINITIONS = new ArchiveType(26, false);
	public static final ArchiveType PARTICLES = new ArchiveType(27, false);
	public static final ArchiveType DEFAULTS = new ArchiveType(28, false);
	public static final ArchiveType BILLBOARDS = new ArchiveType(29, false);
	public static final ArchiveType NATIVES = new ArchiveType(30, false);
	public static final ArchiveType SHADERS = new ArchiveType(31, false);
	public static final ArchiveType ARCHIVE_32 = new ArchiveType(32, false);
	public static final ArchiveType GAME_TIPS = new ArchiveType(33, false);
	public static final ArchiveType ARCHIVE_34 = new ArchiveType(34, false);
	public static final ArchiveType CUTSCENES = new ArchiveType(35, false);
	public static final ArchiveType MUSIC = new ArchiveType(40, true);
	public static final ArchiveType WORLD_MAP_DATA = new ArchiveType(41, false);
	public static final ArchiveType ARCHIVE_42 = new ArchiveType(42, false);
	public static final ArchiveType TEXTURES = new ArchiveType(43, false);
	public static final ArchiveType MATERIALS = new ArchiveType(44, false);
	static int anInt8448 = -1509706891;
	static int anInt8449;

	static ArchiveType[] values() {
		return new ArchiveType[] { VARBITS, SOUND_EFFECTS, ENUMERATIONS, PARTICLES, NATIVES, MAPS, FRAMES, DEFAULTS,
				ANIMATIONS, RESTRICTED_QUICK_CHAT, SPOT_ANIMATIONS, GAME_TIPS, SCRIPTS, WORLD_MAP_INFO, BILLBOARDS,
				WORLD_MAP_DATA, TEXTURES, ITEMS, FRAME_BASES, NPCS, SHADERS, ARCHIVE_32, MUSIC, QUICK_CHAT, FONTS,
				MATERIALS, CUTSCENES, IMAGES, OBJECTS, WIDGETS, ARCHIVE_34, TEXTURE_DEFINITIONS, ARCHIVE_42, CONFIG,
				MODELS, HUFFMAN };
	}

	int id;
	boolean serveAsynchronously;

	ArchiveType(int id, boolean serveAsynchronously) {
		this.id = -1818229065 * id;
		this.serveAsynchronously = serveAsynchronously;
	}

	public boolean serveAsynchronously() {
		return serveAsynchronously;
	}

	public int toInteger() {
		return id * -775571705;
	}

}