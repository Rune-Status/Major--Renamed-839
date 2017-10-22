package com.jagex;

public class Class671 {
	public static ConnectionInfo autoWorld;
	public static ConnectionInfo activeConnectionInfo;
	static Class562_Sub1[] aClass562_Sub1Array8455;
	static Class587 aClass587_8456;
	public static ConnectionInfo aClass672_8457;
	public static boolean aBool8458 = false;
	public static ConnectionInfo lobbyConnectionInfo;
	static int anInt8460;
	static int anInt8461;
	public static ConnectionInfo aClass672_8462;
	public static boolean aBool8463;
	public static Archive widgets;
	public static int anInt8465;

	static {
		aClass562_Sub1Array8455 = new Class562_Sub1[0];
		anInt8460 = 122988895;
		anInt8461 = 0;
		aClass587_8456 = null;
		aBool8463 = false;
	}

	static final void method13823(byte i) {
		Class480_Sub12.aClass226Array10072 = null;
		Class449.method7389(1764783361 * Client.anInt10790, 0, 0, Engine.screenWidth * 1319181337, Engine.screenHeight
				* -551672947, 0, 0, -1);
		if (null != Class480_Sub12.aClass226Array10072) {
			Widget.method587(Class480_Sub12.aClass226Array10072, -1412584499, 0, 0, Engine.screenWidth * 1319181337,
					Engine.screenHeight * -551672947, -256764387 * Class514.anInt7014, -1635876971
							* TurnMobCutsceneAction.anInt9435, Client.aClass226_10802 == Class172.aClass226_1961 ? -1
							: -561182687 * Client.aClass226_10802.anInt2386, true);
			Class480_Sub12.aClass226Array10072 = null;
		}
	}

	static void method13824() {
		BufferedConnectionContext class83 = Client.getActiveConnection();
		OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3987, class83.encryptor);
		class480_sub15.payload.writeInt(-1094887049 * Client.anInt10657);
		class83.sendFrame(class480_sub15);
	}

	static boolean method13825() {
		Class31.loginType = 780098303;
		Class31.activeConnection = Client.gameConnection;
		if (null != Client.aByteArray10716) {
			Buffer buffer = new Buffer(Client.aByteArray10716);
			Class31.accountName = buffer.readLong() * 5617524125832062695L;
			Class31.serverKey = buffer.readLong() * -2384142863413936637L;
		}
		if (-3559573875977646889L * Class31.accountName < 0L) {
			HashTableIterator.method13671(35);
			return false;
		}
		return Class110.method2024(false, true, "", "", Class31.accountName * -3559573875977646889L);
	}

	Class671() throws Throwable {
		throw new Error();
	}

}