package com.jagex;

final class CutsceneVariableProvider implements VariableProvider {
	public static int anInt1902;

	static boolean method3346() {
		return AsynchronousHttpRequestCreator.method6956(Script.aClass580_11401.aClass557_7760);
	}

	@Override
	public int getVarp(BaseVariableParameterDefinition parameter) {
		LinkableInt linkable = Class163.variables.get(parameter.id * 169834903);
		if (linkable == null) {
			return PlayerVariableProvider.instance.getVarp(parameter);
		}

		return -1189875169 * linkable.value;
	}

	@Override
	public int getVarbit(VariableBitsDefinition variable) {
		LinkableInt linkable = Class163.variables.get(0x100000000L | -2037338825 * variable.id);
		if (linkable == null) {
			return PlayerVariableProvider.instance.getVarbit(variable);
		}

		return -1189875169 * linkable.value;
	}

}