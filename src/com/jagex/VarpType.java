package com.jagex;

public class VarpType implements Identifiable {

	public static VarpType aClass441_5047 = new VarpType(ConfigEntry.aClass37_479, 9);
	public static VarpType CLAN = new VarpType(ConfigEntry.CLAN_VARIABLES, 6);
	public static VarpType CLAN_SETTING = new VarpType(ConfigEntry.CLAN_SETTING_VARIABLES, 7);
	public static VarpType CLIENT = new ClientVarpType(ConfigEntry.CLIENT_VARIABLES, 2);
	public static VarpType NPC = new NpcVarpType(ConfigEntry.NPC_VARIABLES, 1);
	public static VarpType PLAYER = new PlayerVarpType(ConfigEntry.PLAYER_VARIABLES, 0);
	static VarpType aClass441_5046 = new Class441_Sub1(ConfigEntry.aClass37_522, 8);
	static VarpType aClass441_5048 = new VarpType(ConfigEntry.aClass37_528, 10);
	static VarpType OBJECT = new VarpType(ConfigEntry.OBJECT_VARIABLES, 5);
	static VarpType REGION = new VarpType(ConfigEntry.REGION_VARIABLES, 4);
	static VarpType WORLD = new WorldVarpType(ConfigEntry.WORLD_VARIABLES, 3);

	public static VarpType[] values() {
		return new VarpType[] { REGION, OBJECT, aClass441_5047, CLIENT, NPC, aClass441_5046, CLAN, aClass441_5048,
				CLAN_SETTING, PLAYER, WORLD };
	}

	ConfigEntry config;
	int id;

	VarpType(ConfigEntry config, int id) {
		this.config = config;
		this.id = id * 1178777311;
	}

	public final ConfigEntry getConfig() {
		return config;
	}

	@Override
	public int getId() {
		return id * 1515619615;
	}

	public Object getDefaultValue(BaseVariableParameterDefinition parameter) {
		if (parameter.aBool1511) {
			return method7337(parameter);
		}

		return parameter.aClass422_1515.method7017();
	}

	Object method7337(BaseVariableParameterDefinition parameter) {
		return parameter.aClass422_1515.method7017();
	}

}