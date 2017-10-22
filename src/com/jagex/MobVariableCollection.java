package com.jagex;

public class MobVariableCollection implements VariableCollection {
	static int anInt6537;

	Mob mob;

	MobVariableCollection(Mob mob) {
		this.mob = mob;
	}

	@Override
	public int getVarp(BaseVariableParameterDefinition parameter) {
		return mob.anInterface73_11556.getOrDefaultInt(parameter.id * 169834903);
	}

	@Override
	public int getVarbit(VariableBitsDefinition varbit) {
		return varbit.getValue(getVarp(varbit.varp));
	}

	@Override
	public long getLongVarp(BaseVariableParameterDefinition parameter) {
		return mob.anInterface73_11556.getOrDefaultLong(parameter.id * 169834903);
	}

	@Override
	public void setIntVarp(BaseVariableParameterDefinition parameter, int value) {
		mob.anInterface73_11556.put(parameter.id * 169834903, value);
	}

	@Override
	public Object getStringVarp(BaseVariableParameterDefinition parameter) {
		return mob.anInterface73_11556.getOrDefaultObject(parameter.id * 169834903);
	}

	@Override
	public void setStringVarp(BaseVariableParameterDefinition parameter, Object object) {
		mob.anInterface73_11556.put(parameter.id * 169834903, object);
	}

	@Override
	public void setVarbit(VariableBitsDefinition varbit, int i) throws VarbitException {
		setIntVarp(varbit.varp, varbit.method5462(getVarp(varbit.varp), i));
	}

	@Override
	public void setLongVarp(BaseVariableParameterDefinition parameter, long l) {
		mob.anInterface73_11556.put(parameter.id * 169834903, l);
	}

}