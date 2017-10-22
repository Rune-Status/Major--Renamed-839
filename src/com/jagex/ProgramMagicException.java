package com.jagex;

public class ProgramMagicException extends Exception {
	ProgramDefinition definition;

	ProgramMagicException(ProgramDefinition definition, int received, int expected) {
		super("");
		this.definition = definition;
	}

}