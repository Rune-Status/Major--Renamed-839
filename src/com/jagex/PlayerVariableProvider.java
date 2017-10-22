package com.jagex;

public class PlayerVariableProvider implements VariableProvider, VariableLoader, Interface65 {
	static Interface19 anInterface19_1027;

	public static void method1560() {
		if (Client.widgetSelected) {
			Widget widget = Class185.method3584(1969702363 * Class490.anInt6751, Client.anInt10756 * -800680953);

			if (null != widget && null != widget.anObjectArray2495) {
				ScriptContext context = new ScriptContext();
				context.source = widget;
				context.arguments = widget.anObjectArray2495;
				Script.execute(context);
			}

			Client.anInt10782 = -2101032765;
			Client.anInt10867 = -1059838551;
			Client.widgetSelected = false;

			if (widget != null) {
				Widget.redraw(widget);
			}
		}
	}

	Class565[] aClass565Array1023;
	public TimedVariableCollection collection = new TimedVariableCollection();
	VariableBitsDefinitionLoader varbitLoader;
	PlayerVarpDefinitionLoader varpLoader;
	public static PlayerVariableProvider instance;

	public PlayerVariableProvider(PlayerVarpDefinitionLoader varpLoader, VariableBitsDefinitionLoader loader, int size) {
		aClass565Array1023 = new Class565[size];
		this.varpLoader = varpLoader;
		varbitLoader = loader;
	}

	public int method1546(int i) {
		return aClass565Array1023[i]
				.method9556(Client.membersWorld ? Class615.aClass615_7953 : Class615.aClass615_7954);
	}

	public int method1547(int i) {
		return aClass565Array1023[i].method9543();
	}

	public int method1548(int i) {
		return aClass565Array1023[i].getExperience();
	}

	public int method1549(int i) {
		return aClass565Array1023[i].method9536();
	}

	@Override
	public int method410(int i) {
		return aClass565Array1023[i]
				.method9534(Client.membersWorld ? Class615.aClass615_7953 : Class615.aClass615_7954);
	}

	@Override
	public int getVarp(BaseVariableParameterDefinition parameter) {
		return collection.getVarp(parameter);
	}

	@Override
	public int getVarbit(VariableBitsDefinition variable) {
		return collection.getVarbit(variable);
	}

	@Override
	public BaseVariableParameterDefinition getVarp(VarpType type, int id) {
		if (VarpType.PLAYER != type) {
			return null;
		}

		return varpLoader.get(id);
	}

	@Override
	public VariableBitsDefinition getVarbit(int id) {
		VariableBitsDefinition variable = varbitLoader.get(id);
		if (variable.varp.type != VarpType.PLAYER) {
			return null;
		}

		return variable;
	}

}