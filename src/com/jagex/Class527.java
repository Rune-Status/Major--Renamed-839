package com.jagex;

import java.util.Date;

public class Class527 implements Identifiable {
	public static Class527 aClass527_7218 = new Class527(0, "", new CharacterType[] { CharacterType.I_LOWER,
			CharacterType.S_LOWER });
	public static Class527 aClass527_7219;
	public static Class527 aClass527_7220 = new Class527(1, "", new CharacterType[] { CharacterType.I_LOWER,
			CharacterType.I_LOWER });
	static Class527 aClass527_7221;
	static {
		aClass527_7219 = new Class527(2, "", new CharacterType[] { CharacterType.S_LOWER, CharacterType.S_LOWER });
		aClass527_7221 = new Class527(3, "", new CharacterType[] { CharacterType.I_LOWER, CharacterType.I_LOWER,
				CharacterType.S_LOWER });
	}

	static boolean method8986() {
		try {
			GzipDecompressor decompressor = new GzipDecompressor();
			byte[] data = decompressor.decompress(Class274.aByteArray3089);
			Sprite.create(data);
			return true;
		} catch (Exception exception) {
			return false;
		}
	}

	static String intToString(int value, int radix, boolean bool) {
		if (radix < 2 || radix > 36) {
			throw new IllegalArgumentException(new StringBuilder().append("").append(radix).toString());
		} else if (!bool || value < 0) {
			return Integer.toString(value, radix);
		}

		int length = 2;
		int remaining = value / radix;

		while (0 != remaining) {
			remaining /= radix;
			length++;
		}

		char[] chars = new char[length];
		chars[0] = '+';

		for (int index = length - 1; index > 0; index--) {
			int i_7_ = value;
			value /= radix;
			int result = i_7_ - radix * value;

			if (result >= 10) {
				chars[index] = (char) (87 + result);
			} else {
				chars[index] = (char) (48 + result);
			}
		}

		return new String(chars);
	}

	static void method8990(long l) {
		CalendarUtils.DEFAULT_CALENDAR.setTime(new Date(l));
	}

	int id;
	CharacterType[] types;

	Class527(int i, String string, CharacterType[] types) {
		id = i * -411689407;
		this.types = types;

		for (CharacterType type : types) {
			switch (-1355589053 * type.valueType.anInt4854) {
				case 0:
					break;
				default:
					break;
				case 4:
					break;
				case 3:

			}
		}
	}

	@Override
	public int getId() {
		return id * 1601761729;
	}

}