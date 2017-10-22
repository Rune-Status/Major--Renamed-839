package com.jagex;

public class DefineDirective {

	public String identifier;
	public String value;

	void decode(ShaderMetaBuffer buffer) {
		identifier = buffer.readString();
		value = buffer.readString();
	}

}