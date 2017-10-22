package com.jagex;

public class ParameterDefinitionLoader extends CachedDefinitionLoader<ParameterDefinition> {

	static int method16838(MenuOption class480_sub31_sub17, FontSpecification specification) {
		String string = Class589.method9918(class480_sub31_sub17);
		int[] is = Widget.method4318(class480_sub31_sub17);
		if (null != is) {
			string = new StringBuilder().append(string).append(UrlResourceRequest.method1572(is)).toString();
		}

		int width = specification.textWidth(string, Class368.aClass116Array4053);
		if (class480_sub31_sub17.aBool11417) {
			width += Class216.otherLevel.method2157() + 4;
		}
		return width;
	}

	public ParameterDefinitionLoader(GameContext context, Language language, Archive config) {
		super(context, language, config, ConfigEntry.PARAMETERS, 64, new ReflectiveDefinitionProvider(
				ParameterDefinition.class));
	}

}