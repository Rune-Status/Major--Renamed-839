package com.jagex;

public class ConfigEntry { // jagex call this Js5ConfigGroup

	public static ConfigEntry aClass37_469 = new ConfigEntry(9, 7);
	public static ConfigEntry ANIMATIONS = new ConfigEntry(12, 7);
	public static ConfigEntry PLAYER_VARIABLES = new ConfigEntry(60);
	public static ConfigEntry CLAN_SETTING_VARIABLES = new ConfigEntry(67);
	public static ConfigEntry aClass37_479 = new ConfigEntry(80);
	public static ConfigEntry aClass37_491 = new ConfigEntry(31);
	public static ConfigEntry aClass37_492 = new ConfigEntry(32);
	public static ConfigEntry WORLD_MAP_INFO = new ConfigEntry(36);
	public static ConfigEntry CLIENT_VARIABLES = new ConfigEntry(62);
	public static ConfigEntry aClass37_514 = new ConfigEntry(26, 5);
	public static ConfigEntry INVENTORIES = new ConfigEntry(5);
	public static ConfigEntry WORLD_VARIABLES = new ConfigEntry(63);
	public static ConfigEntry REGION_VARIABLES = new ConfigEntry(64);
	public static ConfigEntry CLAN_VARIABLES = new ConfigEntry(66);
	public static ConfigEntry GRAPHICS = new ConfigEntry(13, 8);
	public static ConfigEntry aClass37_522 = new ConfigEntry(68);
	public static ConfigEntry VARIABLE_BITS = new ConfigEntry(69);
	public static ConfigEntry aClass37_528 = new ConfigEntry(75);
	public static ConfigEntry NPC_VARIABLES = new ConfigEntry(61);
	public static ConfigEntry aClass37_530 = new ConfigEntry(77);
	public static ConfigEntry OBJECT_VARIABLES = new ConfigEntry(65);
	public static ConfigEntry CURSORS = new ConfigEntry(33);
	public static ConfigEntry ENUMERATIONS = new ConfigEntry(8, 8);
	public static ConfigEntry HITBARS = new ConfigEntry(72);
	public static ConfigEntry HITSPLATS = new ConfigEntry(46);
	public static ConfigEntry IDENTIKITS = new ConfigEntry(3);
	public static ConfigEntry ITEMS = new ConfigEntry(10, 8);
	public static ConfigEntry MAP_SCENES = new ConfigEntry(34);
	public static ConfigEntry OBJECTS = new ConfigEntry(6, 8);
	public static ConfigEntry OVERLAYS = new ConfigEntry(4);
	public static ConfigEntry PARAMETERS = new ConfigEntry(11);
	public static ConfigEntry QUESTS = new ConfigEntry(35);
	public static ConfigEntry SKYBOXES = new ConfigEntry(29);
	public static ConfigEntry SUNS = new ConfigEntry(30);
	public static ConfigEntry UNDERLAYS = new ConfigEntry(1);
	static ConfigEntry aClass37_461 = new ConfigEntry(76);
	static ConfigEntry aClass37_462 = new ConfigEntry(2);
	static ConfigEntry aClass37_465 = new ConfigEntry(70);
	static ConfigEntry aClass37_467 = new ConfigEntry(18);
	static ConfigEntry aClass37_473 = new ConfigEntry(82);
	static ConfigEntry aClass37_474 = new ConfigEntry(14, 10);
	static ConfigEntry aClass37_476 = new ConfigEntry(16);
	static ConfigEntry aClass37_478 = new ConfigEntry(37);
	static ConfigEntry aClass37_480 = new ConfigEntry(20);
	static ConfigEntry aClass37_481 = new ConfigEntry(39);
	static ConfigEntry aClass37_482 = new ConfigEntry(53);
	static ConfigEntry aClass37_483 = new ConfigEntry(23);
	static ConfigEntry aClass37_484 = new ConfigEntry(24);
	static ConfigEntry aClass37_485 = new ConfigEntry(25);
	static ConfigEntry aClass37_486 = new ConfigEntry(44);
	static ConfigEntry aClass37_487 = new ConfigEntry(27);
	static ConfigEntry aClass37_488 = new ConfigEntry(28);
	static ConfigEntry aClass37_497 = new ConfigEntry(54);
	static ConfigEntry aClass37_498 = new ConfigEntry(38);
	static ConfigEntry aClass37_500 = new ConfigEntry(40);
	static ConfigEntry aClass37_502 = new ConfigEntry(42);
	static ConfigEntry aClass37_503 = new ConfigEntry(43);
	static ConfigEntry aClass37_504 = new ConfigEntry(17);
	static ConfigEntry aClass37_505 = new ConfigEntry(45);
	static ConfigEntry aClass37_507 = new ConfigEntry(78);
	static ConfigEntry aClass37_508 = new ConfigEntry(22);
	static ConfigEntry aClass37_509 = new ConfigEntry(49);
	static ConfigEntry aClass37_510 = new ConfigEntry(50);
	static ConfigEntry aClass37_511 = new ConfigEntry(51);
	static ConfigEntry aClass37_513 = new ConfigEntry(47);
	static ConfigEntry aClass37_517 = new ConfigEntry(41);
	static ConfigEntry aClass37_519 = new ConfigEntry(48);
	static ConfigEntry aClass37_524 = new ConfigEntry(7);
	static ConfigEntry aClass37_526 = new ConfigEntry(73);
	static ConfigEntry aClass37_527 = new ConfigEntry(74);
	static ConfigEntry aClass37_531 = new ConfigEntry(15);
	static ConfigEntry aClass37_532 = new ConfigEntry(79);
	static ConfigEntry aClass37_533 = new ConfigEntry(21);
	static ConfigEntry aClass37_534 = new ConfigEntry(81);
	static ConfigEntry aClass37_535 = new ConfigEntry(19);

	public static int method1003() {
		synchronized (PlayerAppearance.aClass168_7723) {
			return PlayerAppearance.aClass168_7723.hardCount();
		}
	}

	public static void method1004(int i) {
		if (i < 1) {
			Class495_Sub1.anInt10334 = Class495_Sub1.anInt10325 * 205337113;
		} else {
			Class495_Sub1.anInt10334 = i * 2118464807;
		}
	}

	public int entry;
	int size;

	ConfigEntry(int entry) {
		this(entry, 0);
	}

	ConfigEntry(int entry, int shift) {
		this.entry = 1149718113 * entry;
		size = shift * -1788832647;
	}

	public int getFile(int i) {
		return i & (1 << 1820956105 * size) - 1;
	}

	public int getType(int i) {
		return i >>> size * 1820956105;
	}

	public int getTypeSize() {
		return 1 << size * 1820956105;
	}

	static byte[] get(Archive archive, ConfigEntry entry, int id) {
		if (entry.getTypeSize() > 1) {
			return archive.get(entry.getType(id), entry.getFile(id));
		}
	
		return archive.get(1179768225 * entry.entry, id);
	}

}