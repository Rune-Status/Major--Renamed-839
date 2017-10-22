package com.jagex;

public class Class63 {
	public static int anInt939;
	static boolean aBool940 = false;
	static final int anInt941 = 48;
	static int[] anIntArray942;
	static int anInt943;
	static boolean aBool944 = false;
	static int[] anIntArray945;
	static int[] anIntArray946;
	static int anInt947;
	static Deque aClass644_948;
	static final double aDouble949 = 100.0;
	public static int anInt950;
	static Sprite aClass116_951;
	static boolean aBool952;
	static int[] anIntArray953;
	static int anInt954;
	static boolean aBool955;

	static {
		anIntArray942 = new int[4];
		anInt943 = 742271049;
		anInt947 = 0;
		anIntArray945 = new int[1003];
		anIntArray946 = new int[1009];
		anIntArray953 = new int[1007];
		aClass644_948 = new Deque();
		anInt939 = 517887053;
		anInt950 = -224109565;
		aBool955 = true;
		aBool952 = false;
		anInt954 = 0;
	}

	public static MenuOption method1482() {
		return Class480_Sub41_Sub4.aClass480_Sub31_Sub17_11430;
	}

	static final void method1483(ScriptExecutionContext class613, int i) {
		class613.intVariables[class613.anIntArray7943[1523704279 * class613.counter]] = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
	}

	static void method1484(String string, String string_0_, String string_1_, boolean bool, boolean bool_2_, int i) {
		BufferedConnectionContext class83 = Client.getActiveConnection();
		if (class83.getConnection() != null) {
			OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3969, class83.encryptor);
			class480_sub15.payload.writeShort(Buffer.encodedStringLength(string)
					+ Buffer.encodedStringLength(string_0_) + Buffer.encodedStringLength(string_1_) + 1);
			class480_sub15.payload.writeCString(string);
			class480_sub15.payload.writeCString(string_0_);
			class480_sub15.payload.writeCString(string_1_);
			int i_3_ = 0;
			if (bool) {
				i_3_ |= 0x1;
			}
			if (bool_2_) {
				i_3_ |= 0x2;
			}
			class480_sub15.payload.writeByte(i_3_);
			class83.sendFrame(class480_sub15);
		}
	}

	Class63() throws Throwable {
		throw new Error();
	}
}
