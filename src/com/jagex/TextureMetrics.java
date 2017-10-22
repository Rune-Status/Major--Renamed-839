package com.jagex;

public class TextureMetrics {

	public static final int anInt1678 = 7;
	static final int anInt1679 = 1;
	static final int anInt1680 = 512;
	static final int anInt1681 = 3;
	static final int anInt1683 = 1;
	static final int anInt1684 = 16;
	static final int anInt1685 = 16;
	static final int anInt1687 = 64;
	static final int anInt1688 = 128;
	static final int anInt1689 = 32;
	public static final byte aByte1691 = 0;
	public static final byte aByte1692 = 1;
	static final int anInt1693 = 1;
	static final int anInt1694 = 2;
	public static final int anInt1695 = 2;
	static final int anInt1696 = 0;
	public static final int anInt1699 = 5;
	static final int anInt1702 = 4;
	public static final int anInt1704 = 1;
	public static final int anInt1706 = 0;
	public static final int anInt1707 = 3;
	public static final int anInt1708 = 4;
	public static final int anInt1712 = 6;
	static final int anInt1713 = 256;
	public static final int anInt1714 = 8;
	public static final int anInt1715 = 9;
	public static final int anInt1716 = 11;
	public static final int anInt1717 = 13;
	public static final int anInt1718 = 16;
	static final int anInt1726 = 2;
	static boolean aBool1729;

	static int parseInt(CharSequence sequence, int radix, boolean allowPlus) {
		if (radix < 2 || radix > 36) {
			throw new IllegalArgumentException(new StringBuilder().append("").append(radix).toString());
		}

		boolean negated = false;
		boolean valid = false;
		int parsed = 0;
		int length = sequence.length();

		for (int index = 0; index < length; index++) {
			int character = sequence.charAt(index);
			if (index == 0) {
				if ('-' == character) {
					negated = true;
					continue;
				}

				if (character == '+' && allowPlus) {
					continue;
				}
			}

			if (character >= '0' && character <= 'Z') {
				character -= 48;
			} else if (character >= 'A' && character <= 'Z') {
				character -= 55;
			} else if (character >= 'a' && character <= 'z') {
				character -= 87;
			} else {
				throw new NumberFormatException();
			}

			if (character >= radix) {
				throw new NumberFormatException();
			}

			if (negated) {
				character = -character;
			}

			int updated = parsed * radix + character;
			if (updated / radix != parsed) {
				throw new NumberFormatException();
			}

			parsed = updated;
			valid = true;
		}

		if (!valid) {
			throw new NumberFormatException();
		}

		return parsed;
	}

	public int id;
	public short colour;
	public byte aByte1690;
	public boolean aBool1697;
	public boolean aBool1698 = false;
	public byte aByte1700;
	public boolean aBool1701;
	public byte alpha = -1;
	public byte aByte1705;
	public byte aByte1709;
	public int length;
	public byte aByte1711 = -1;
	public byte aByte1719;
	public byte aByte1720;
	public int anInt1721;
	public byte mipmapLevel;
	public boolean aBool1723;
	public boolean aBool1724;
	public byte colourOffset;
	public Class554 aClass554_1727 = Class554.aClass554_7499;
	public byte aByte1728;

	void decode(int id, Buffer buffer) {
		this.id = id * -417392093;

		int type = buffer.readUByte();
		if (0 == type) {
			length = 1760060224;
		} else if (1 == type) {
			length = -774846848;
		} else if (2 == type) {
			length = -1549693696;
		} else if (3 == type) {
			length = 1195579904;
		} else if (4 == type) {
			length = -1903807488;
		}

		int i_2_ = buffer.readInt();
		aBool1698 = (i_2_ & 0x1) != 0;
		aBool1697 = (i_2_ & 0x10) != 0;
		int i_3_ = (byte) buffer.readUByte();
		aByte1709 = (byte) (i_3_ & 0x7);
		aByte1705 = (byte) (i_3_ >> 3 & 0x7);
		int attributes = buffer.readInt();

		if ((attributes & 0x10) != 0) {
			buffer.readFloat();
			buffer.readFloat();
		}

		if (0 != (attributes & 0x20)) {
			buffer.readInt();
		}

		if ((attributes & 0x40) != 0) {
			buffer.readInt();
		}

		if (0 != (attributes & 0x80)) {
			buffer.readInt();
		}

		if ((attributes & 0x100) != 0) {
			buffer.readInt();
		}

		if ((attributes & 0x200) != 0) {
			buffer.readInt();
		}

		aBool1701 = buffer.readUByte() == 1;
		CompressionType.findIdentifiable(Class536.values(), buffer.readUByte());
		CompressionType.findIdentifiable(Class539.values(), buffer.readUByte());
		aClass554_1727 = CompressionType.findIdentifiable(Class554.values(), buffer.readUByte());
		if (Class554.aClass554_7501 == aClass554_1727) {
			aByte1711 = (byte) buffer.readUByte();
		}

		int i_5_ = buffer.readUByte();
		if (0 != (i_5_ & 0x1)) {
			aByte1728 = (byte) buffer.readUByte();
		}

		if ((i_5_ & 0x2) != 0) {
			aByte1700 = (byte) buffer.readUByte();
		}

		if (buffer.readUByte() == 1) {
			aByte1719 = (byte) buffer.readUByte();
			aByte1720 = (byte) buffer.readUByte();
			anInt1721 = buffer.readInt() * 389004635;
			aByte1690 = (byte) buffer.readUByte();
			buffer.readUByte();
			mipmapLevel = (byte) buffer.readUByte();
			aBool1723 = buffer.readUByte() == 1;
			aBool1724 = buffer.readUByte() == 1;
			colourOffset = (byte) buffer.readUByte();
			alpha = (byte) buffer.readUByte();
			colour = (short) buffer.readUShort();
		}
	}

}