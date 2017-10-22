package com.jagex;

public class ProgramDefinition {

	static final int anInt2625 = 4;
	static final int anInt2626 = 256;
	static final int anInt2630 = 2;

	public static void setConsoleText(String string) {
		Class65.consoleText = string;
		Class65.consoleTextIndex = Class65.consoleText.length() * -1223481467;
	}

	static final boolean illegalNameCharacter(char c) {
		return c == '\u00a0' || c == ' ' || '_' == c || '-' == c;
	}

	Class246[] aClass246Array2624;
	Class241[] aClass241Array2627;
	String aString2628;
	Class241[] aClass241Array2629;

	public ProgramDefinition(byte[] data) throws ProgramMagicException {
		decode(data);
	}

	void decode(byte[] data) throws ProgramMagicException {
		ShaderMetaBuffer buffer = new ShaderMetaBuffer(data);
		int magic = buffer.readUShort();
		if (4 != magic) {
			throw new ProgramMagicException(this, magic, 4);
		}

		aString2628 = buffer.readString();
		aClass241Array2627 = new Class241[buffer.readUShort()];
		aClass241Array2629 = new Class241[buffer.readUShort()];
		aClass246Array2624 = new Class246[buffer.readUShort()];

		for (int index = 0; index < aClass241Array2627.length; index++) {
			aClass241Array2627[index] = new Class241();
			aClass241Array2627[index].decode(buffer);
		}

		for (int index = 0; index < aClass241Array2629.length; index++) {
			aClass241Array2629[index] = new Class241();
			aClass241Array2629[index].decode(buffer);
		}

		for (int index = 0; index < aClass246Array2624.length; index++) {
			aClass246Array2624[index] = new Class246();
			aClass246Array2624[index].decode(buffer);
		}
	}

}