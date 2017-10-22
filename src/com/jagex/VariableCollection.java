package com.jagex;

public interface VariableCollection extends VariableProvider {

	@Override
	int getVarp(BaseVariableParameterDefinition parameter);

	long getLongVarp(BaseVariableParameterDefinition parameter);

	Object getStringVarp(BaseVariableParameterDefinition parameter);

	@Override
	int getVarbit(VariableBitsDefinition varbit);

	void setIntVarp(BaseVariableParameterDefinition parameter, int value);

	void setLongVarp(BaseVariableParameterDefinition parameter, long l);

	void setStringVarp(BaseVariableParameterDefinition parameter, Object object);

	void setVarbit(VariableBitsDefinition varbit, int i) throws VarbitException;

}