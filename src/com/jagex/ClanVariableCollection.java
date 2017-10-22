package com.jagex;

public class ClanVariableCollection implements VariableCollection {

	ClanSettings settings;

	ClanVariableCollection(ClanSettings settings) {
		this.settings = settings;
	}

	@Override
	public int getVarp(BaseVariableParameterDefinition parameter) {
		Integer integer = settings.getIntVariable(Client.game.id * -1589762327 << 16 | 169834903 * parameter.id);
		if (null == integer) {
			return (Integer) parameter.getDefaultValue();
		}

		return integer.intValue();
	}

	@Override
	public int getVarbit(VariableBitsDefinition varbit) {
		return varbit.getValue(getVarp(varbit.varp));
	}

	@Override
	public long getLongVarp(BaseVariableParameterDefinition parameter) {
		Long value = settings.getLongVariable(-1589762327 * Client.game.id << 16 | 169834903 * parameter.id);
		if (null == value) {
			return (Long) parameter.getDefaultValue();
		}

		return value.longValue();
	}

	@Override
	public void setIntVarp(BaseVariableParameterDefinition parameter, int value) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getStringVarp(BaseVariableParameterDefinition parameter) {
		if (CharacterType.S_LOWER != parameter.aClass422_1515) {
			throw new IllegalArgumentException("");
		}

		return settings.getStringVariable(-1589762327 * Client.game.id << 16 | parameter.id * 169834903);
	}

	@Override
	public void setStringVarp(BaseVariableParameterDefinition parameter, Object object) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setVarbit(VariableBitsDefinition varbit, int i) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void setLongVarp(BaseVariableParameterDefinition parameter, long l) {
		throw new UnsupportedOperationException();
	}

	static VariableCollection create(ClanSettings setting) {
		return new ClanVariableCollection(setting);
	}

}