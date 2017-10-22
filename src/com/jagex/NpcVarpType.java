package com.jagex;

final class NpcVarpType extends VarpType {
	static boolean aBool9950;

	NpcVarpType(ConfigEntry config, int id) {
		super(config, id);
	}

	@Override
	Object method7337(BaseVariableParameterDefinition parameter) {
		if (CharacterType.ONE == parameter.aClass422_1515) {
			return -1;
		}

		return parameter.aClass422_1515.method7017();
	}

}