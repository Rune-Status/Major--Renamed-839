package com.jagex;

public class Class448 {

	public static Class488 method1002(Archive archive, String id, boolean force) {
		int entryIndex = archive.index(id);
		if (entryIndex == -1) {
			return new Class488(0);
		}

		byte[] data = archive.get(entryIndex, 1);
		if (data == null) {
			return new Class488(0);
		}

		Buffer buffer = new Buffer(data);
		int count = buffer.readUShort();
		Class488 class488 = new Class488(count);
		int index = 0;

		while (index < -428779527 * class488.anInt6669) {
			int i_6_ = buffer.readInt();
			int i_7_ = buffer.readUShort();
			int i_8_ = buffer.readUByte();

			if (force || 1 != i_8_) {
				class488.anIntArray6670[index] = i_6_;
				class488.anIntArray6671[index] = i_7_;
				index++;
			} else {
				class488.anInt6669 -= 211532361;
			}
		}

		return class488;
	}

	public int anInt5068;
	public int anInt5069;
	public int anInt5070;
	public int anInt5071;
	public int anInt5072;

	byte aByte5073;

	public Class448() {

	}

	public Class448(Buffer buffer, DefaultProvidingVarpLoader varpLoader) {
		aByte5073 = buffer.readByte();
		anInt5069 = buffer.readUShort() * -2080465617;
		anInt5070 = buffer.readInt() * -1737112447;
		anInt5071 = buffer.readInt() * -1403907745;
		anInt5072 = buffer.readInt() * 185312119;
		anInt5068 = buffer.readInt() * 111039981;

		if (varpLoader != null) {
			PlayerAppearance.method9807(buffer, varpLoader);
		}
	}

	public int method7375() {
		return aByte5073 & 0x7;
	}

	public int method7380(int i) {
		return 8 == (aByte5073 & 0x8) ? 1 : 0;
	}

}