package com.jagex;

public class Class241 {

	public static void method4579(String host, int id) {
		if (null == Class177.aClass672_1992) {
			Class177.aClass672_1992 = new ConnectionInfo(true);
		}

		Class177.aClass672_1992.host = host;
		Class177.aClass672_1992.id = (id + 1099) * -212349065;
		Class177.aClass672_1992.port = -1309620211 * Class177.aClass672_1992.id + 759363264;
		Class177.aClass672_1992.alternatePort = 733597859 * Class177.aClass672_1992.id + -1111289248;
		Class177.aClass672_1992.aBool8472 = true;
	}

	public int[] anIntArray2644;
	public int[] anIntArray2645;
	Class253 aClass253_2639;
	Class253 aClass253_2640;
	int anInt2641 = 1969502237;
	String name;
	String aString2643;

	void decode(ShaderMetaBuffer buffer) {
		int ordinal = buffer.readUShort();
		aClass253_2639 = Class253.values()[ordinal];

		if (Class253.aClass253_2697 == aClass253_2639) {
			int index = buffer.readUShort();
			aClass253_2640 = Class253.values()[index];
			anInt2641 = buffer.readUShort() * -1969502237;
		}

		name = buffer.readString();
		aString2643 = buffer.readString();
		int count = buffer.readUShort();
		anIntArray2644 = new int[count];
		anIntArray2645 = new int[count];

		for (int index = 0; index < count; index++) {
			anIntArray2644[index] = buffer.readUShort();
			anIntArray2645[index] = buffer.readUShort();
		}
	}

}