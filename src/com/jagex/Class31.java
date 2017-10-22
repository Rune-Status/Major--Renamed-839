package com.jagex;

public class Class31 {
	static final int anInt385 = 218;
	static final int anInt386 = 203;
	static final int anInt387 = 3;
	public static int anInt388;
	static int socialNetworkId;
	static boolean socialNetworkLogin;
	static final int anInt392 = 73;
	static long accountName;
	static boolean aBool394 = false;
	public static int anInt395;
	static int loginErrors;
	static final int anInt397 = 38;
	static final int anInt398 = 48;
	static final int anInt399 = 223;
	static final int anInt400 = 67;
	static final int anInt401 = 156;
	static final int anInt402 = 87;
	static final int anInt403 = 95;
	static final int anInt404 = 108;
	static String aString405;
	static final int anInt406 = 126;
	public static int anInt407;
	static final int anInt408 = 148;
	static final int anInt409 = 157;
	static final int anInt410 = 168;
	static final int anInt411 = 174;
	static int loginStep;
	static final int anInt413 = 15;
	static final int anInt414 = 207;
	static int loginType;
	static BufferedConnectionContext activeConnection;
	static final int anInt417 = 231;
	static final int anInt418 = 4;
	static final int anInt419 = 53;
	static final int anInt420 = 260;
	public static String accountPassword;
	static long serverKey;
	public static String aString423;
	static final int anInt424 = 115;
	static int loginTicks;
	static boolean aBool426;
	static final int anInt427 = 257;
	static final int anInt428 = 196;
	public static int anInt429;
	static final int anInt430 = 248;
	public static int anInt431;
	static final int anInt432 = 180;
	public static int anInt433;
	static final int anInt434 = 135;
	public static int anInt435;
	public static int anInt436;
	public static int anInt437;
	static boolean aBool438;
	public static int anInt439;
	static boolean aBool440;

	static {
		socialNetworkLogin = false;
		socialNetworkId = -1568798451;
		accountName = -5617524125832062695L;
		loginStep = -2074489177;
		serverKey = 0L;
		aString423 = "";
		accountPassword = "";
		aString405 = "";
		aBool426 = true;
		loginTicks = 0;
		loginErrors = 0;
		anInt429 = -1525773506;
		anInt395 = 1473095230;
		anInt431 = 734206074;
		anInt407 = -35623517;
		anInt433 = 1096708613;
		anInt388 = 0;
		anInt435 = -1600689111;
		anInt436 = 2091473183;
		anInt437 = 0;
		aBool438 = false;
		anInt439 = 0;
		aBool440 = false;
	}

	public static void method906(int i) {
		if (6 == Client.gameState * -1501875989) {
			OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3995,
					Client.lobbyConnection.encryptor);
			class480_sub15.payload.writeByte(i);
			Client.lobbyConnection.sendFrame(class480_sub15);
		}
	}

	public static Model method907(Toolkit class134, int i, int i_2_, int i_3_, int i_4_, Model class143, short i_5_,
			byte i_6_, Class650 class650, int i_7_) {
		if (class143 == null) {
			return null;
		}
		int i_8_ = 2055;
		if (class650 != null) {
			i_8_ |= class650.method13457();
			i_8_ &= ~0x200;
		}
		long l = (i_5_ & 0xffff) << 8 | i_6_;
		Model class143_9_;
		synchronized (Class38.aClass168_538) {
			class143_9_ = (Model) Class38.aClass168_538.get(l);
		}
		if (null == class143_9_ || class134.method2637(class143_9_.functionMask(), i_8_) != 0) {
			if (class143_9_ != null) {
				i_8_ = class134.mergeFunctionMasks(i_8_, class143_9_.functionMask());
			}
			BaseModel class144 = new BaseModel(4, 2, 2);
			int i_10_ = 128;
			int[] is = new int[4];
			is[0] = class144.method3089(-i_10_, 0, -i_10_);
			is[1] = class144.method3089(i_10_, 0, -i_10_);
			is[2] = class144.method3089(i_10_, 0, i_10_);
			is[3] = class144.method3089(-i_10_, 0, i_10_);
			class144.method3114(0, 1, 2, (byte) 1, (byte) 0, (short) 0, i_6_, i_5_);
			class144.method3114(0, 2, 3, (byte) 1, (byte) 0, (short) 0, i_6_, i_5_);
			class144.method3094((short) 1, (short) 2, (short) 0);
			class144.method3094((short) 2, (short) 3, (short) 0);
			class143_9_ = class134.createModel(class144, i_8_, Class38.anInt539 * -2135198873, 64, 768);
			synchronized (Class38.aClass168_538) {
				Class38.aClass168_538.put(l, class143_9_);
			}
		}
		int i_11_ = class143.minimumX();
		int i_12_ = class143.method2923();
		int i_13_ = class143.method2886();
		int i_14_ = class143.maximumZ();
		if (class650 != null) {
			class143_9_ = class143_9_.method2890((byte) 3, i_8_, true);
			class143_9_.scale(i_12_ - i_11_ >> 1, 128, i_14_ - i_13_ >> 1);
			class143_9_.translate(i_12_ + i_11_ >> 1, 0, i_14_ + i_13_ >> 1);
			class650.method13460(class143_9_);
		} else {
			class143_9_ = class143_9_.method2890((byte) 3, i_8_, true);
			class143_9_.scale(i_12_ - i_11_ >> 1, 128, i_14_ - i_13_ >> 1);
			class143_9_.translate(i_12_ + i_11_ >> 1, 0, i_13_ + i_14_ >> 1);
		}
		if (0 != i_2_) {
			class143_9_.pitch(i_2_);
		}
		if (i_3_ != 0) {
			class143_9_.roll(i_3_);
		}
		if (0 != i_4_) {
			class143_9_.translate(0, i_4_, 0);
		}
		return class143_9_;
	}

	public static Class637 method909(int i) {
		if (Class34.aClass637_448 == null) {
			return Class637.aClass637_8130;
		}
		return Class34.aClass637_448;
	}

	static boolean method905(int i) {
		if (i == 9 || i == 10 || i == 11 || 12 == i || 13 == i || i == 1003) {
			return true;
		}
		return 8 == i;
	}

	static final void method908(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method7005(class226, class221, class613);
	}

	Class31() throws Throwable {
		throw new Error();
	}
}
