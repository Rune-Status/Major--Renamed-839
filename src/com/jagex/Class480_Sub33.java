package com.jagex;

public class Class480_Sub33 extends Linkable {

	static void method16088() {
		Class63.anInt954 = 0;
		Class63.anInt943 = 742271049;
		Class63.anInt939 = 517887053;
		Class63.anInt950 = -224109565;
	}

	boolean aBool10225 = true;
	public byte aByte10226;
	boolean aBool10227;
	public int anInt10228 = 0;
	int[] anIntArray10229;
	long aLong10230;
	public String aString10231 = null;
	public byte aByte10232;
	public Class283[] aClass283Array10233;

	public Class480_Sub33(Buffer buffer) {
		decode(buffer);
	}

	public int[] method16073(int i) {
		if (null == anIntArray10229) {
			String[] strings = new String[1777256127 * anInt10228];
			anIntArray10229 = new int[1777256127 * anInt10228];

			for (int index = 0; index < 1777256127 * anInt10228; index++) {
				strings[index] = aClass283Array10233[index].aString3165;
				anIntArray10229[index] = index;
			}

			ArrayUtils.sort(strings, anIntArray10229);
		}

		return anIntArray10229;
	}

	public int method16076(String string) {
		for (int index = 0; index < anInt10228 * 1777256127; index++) {
			if (aClass283Array10233[index].aString3165.equalsIgnoreCase(string)) {
				return index;
			}
		}

		return -1;
	}

	void method16075(int i) {
		anInt10228 -= -432559809;
		if (0 == 1777256127 * anInt10228) {
			aClass283Array10233 = null;
		} else {
			System.arraycopy(aClass283Array10233, i + 1, aClass283Array10233, i, 1777256127 * anInt10228 - i);
		}

		anIntArray10229 = null;
	}

	void decode(Buffer buffer) {
		int attributes = buffer.readUByte();
		if ((attributes & 0x1) != 0) {
			aBool10227 = true;
		}

		if (0 != (attributes & 0x2)) {
			aBool10225 = true;
		}

		int i_4_ = 2;
		if (0 != (attributes & 0x4)) {
			i_4_ = buffer.readUByte();
		}

		linkedKey = buffer.readLong() * -7096345066895942069L;
		aLong10230 = buffer.readLong() * -7326488349242084039L;
		aString10231 = buffer.readString();
		buffer.readUByte();
		aByte10226 = buffer.readByte();
		aByte10232 = buffer.readByte();
		anInt10228 = buffer.readUShort() * -432559809;

		if (anInt10228 * 1777256127 > 0) {
			aClass283Array10233 = new Class283[anInt10228 * 1777256127];

			for (int index = 0; index < anInt10228 * 1777256127; index++) {
				Class283 class283 = new Class283();
				if (aBool10227) {
					buffer.readLong();
				}

				if (aBool10225) {
					class283.aString3165 = buffer.readString();
				}

				class283.aByte3163 = buffer.readByte();
				class283.anInt3164 = buffer.readUShort() * -1457733513;

				if (i_4_ >= 3) {
					buffer.readUByte();
				}

				aClass283Array10233[index] = class283;
			}
		}
	}

	void method16083(int i) {
		if (aClass283Array10233 != null) {
			System.arraycopy(aClass283Array10233, 0, aClass283Array10233 = new Class283[i], 0, anInt10228 * 1777256127);
		} else {
			aClass283Array10233 = new Class283[i];
		}
	}

	void method16085(Class283 class283) {
		if (aClass283Array10233 == null || 1777256127 * anInt10228 >= aClass283Array10233.length) {
			method16083(1777256127 * anInt10228 + 5);
		}

		aClass283Array10233[(anInt10228 += -432559809) * 1777256127 - 1] = class283;
		anIntArray10229 = null;
	}

}