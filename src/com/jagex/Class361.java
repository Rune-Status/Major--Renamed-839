package com.jagex;

public class Class361 {
	public static final int anInt3890 = 2;
	public static final int anInt3891 = 0;
	public static final int anInt3892 = 1;
	public static final int anInt3895 = 1;
	public static final int anInt3896 = 0;
	static final int anInt3897 = 1;
	static final int anInt3904 = 0;
	public static final int anInt3907 = 2;
	static final int anInt3910 = 1;
	static Sprite aClass116_3912;

	static int method6061(char c) {
		if (c >= 0 && c < Class614.anIntArray7950.length) {
			return Class614.anIntArray7950[c];
		}
		return -1;
	}

	public long aLong3889;
	public int anInt3893;
	public int anInt3894;
	public int id;
	public int anInt3899;
	int anInt3900;
	public int anInt3901;
	public int anInt3902;
	public int anInt3903;
	public int anInt3905;
	public int anInt3906 = 0;
	boolean aBool3908;
	public int distance;
	public int anInt3911;

	void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			anInt3900 = buffer.readUShort() * -1724229711;
		} else if (opcode == 2) {
			buffer.readUByte();
		} else if (3 == opcode) {
			anInt3901 = buffer.readInt() * 1102509791;
			anInt3902 = buffer.readInt() * -1041757759;
			anInt3893 = buffer.readInt() * 1896445207;
		} else if (opcode == 4) {
			anInt3903 = buffer.readUByte() * -1915546765;
			anInt3905 = buffer.readInt() * 1676586213;
		} else if (opcode == 6) {
			anInt3894 = buffer.readUByte() * -680399753;
		} else if (8 == opcode) {
			anInt3906 = -1412276039;
		} else if (9 == opcode) {
			anInt3899 = -2061218725;
		} else if (opcode == 10) {
			aBool3908 = true;
		}
	}

	void method6054() {
		anInt3911 = -1626024785 * Class373.COSINE[anInt3900 * -1919970991 << 3];
		long l = -1787673313 * anInt3901; // x?
		long l_2_ = anInt3902 * 1822099009; // z?
		long l_3_ = anInt3893 * 1305416359; // y?
		distance = (int) Math.sqrt(l * l + l_2_ * l_2_ + l_3_ * l_3_) * -1783993543;

		if (anInt3905 * -2110574355 == 0) {
			anInt3905 = 1676586213;
		}

		if (anInt3903 * 1365723579 == 0) {
			aLong3889 = -6730505495613300481L;
		} else if (1 == 1365723579 * anInt3903) {
			aLong3889 = distance * 866687048 / (-2110574355 * anInt3905) * -1021263134048362751L;
			aLong3889 *= aLong3889 * -171913190644866815L;
		} else if (1365723579 * anInt3903 == 2) {
			aLong3889 = 866687048 * distance / (-2110574355 * anInt3905) * -1021263134048362751L;
		}

		if (aBool3908) {
			distance *= -1;
		}
	}

}