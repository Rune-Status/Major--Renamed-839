package com.jagex;

public interface VariableLoader {

	BaseVariableParameterDefinition getVarp(VarpType type, int id);

	VariableBitsDefinition getVarbit(int id);

}