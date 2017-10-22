package com.jagex;

public class DefinitionChatInterpolantProvider implements QuickChatInterpolantProvider {

	@Override
	public String provide(QuickChatMessageType type, int[] configs, long data) {
		if (type == QuickChatMessageType.aClass605_7894) {
			EnumDefinition definition = EnumDefinition.loader.get(configs[0]);
			return definition.getString((int) data);
		} else if (type == QuickChatMessageType.aClass605_7887 || QuickChatMessageType.aClass605_7886 == type) {
			ItemDefinition definition = ItemDefinition.loader.get((int) data);
			return definition.name;
		} else if (type == QuickChatMessageType.aClass605_7898 || QuickChatMessageType.aClass605_7891 == type
				|| type == QuickChatMessageType.aClass605_7895) {
			return EnumDefinition.loader.get(configs[0]).getString((int) data);
		}

		return null;
	}

}