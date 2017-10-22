package com.jagex;

public class Class340 implements Interface43 {
	static String formattedOsName;

	public static boolean method5858(int i, boolean bool, byte i_8_) {
		if (2022909907 * Class495_Sub1.anInt10345 == i) {
			Class495_Sub1.aBool10336 = bool;
		} else if (-368197735 * Class495_Sub1.anInt10317 == i) {
			Class495_Sub1.aBool10343 = bool;
		} else if (Class495_Sub1.anInt10337 * -1518567513 == i) {
			Class495_Sub1.aBool10344 = bool;
		} else {
			return false;
		}
		return true;
	}

	public static void method5859(String host, int i) {
		if (Class671.lobbyConnectionInfo == null) {
			Class671.lobbyConnectionInfo = new ConnectionInfo(true);
		}

		Class671.lobbyConnectionInfo.host = host;
		Class671.lobbyConnectionInfo.id = (1099 + i) * -212349065;
		Class671.lobbyConnectionInfo.port = 759363264 + -1309620211 * Class671.lobbyConnectionInfo.id;
		Class671.lobbyConnectionInfo.alternatePort = 380423312 + Class671.lobbyConnectionInfo.id * 733597859;
	}

	static boolean method5854() {
		Class31.loginType = 472539564;
		Class31.activeConnection = Client.lobbyConnection;
		if (Client.aByteArray10716 != null) {
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

	public int anInt3629;
	public Class349 aClass349_3630;
	public int anInt3631;
	public int anInt3632;
	public int anInt3633;
	public int anInt3634;
	public Class334 aClass334_3635;
	public int anInt3636;
	public int anInt3637;

	Class340(Class349 class349, Class334 class334, int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_) {
		aClass349_3630 = class349;
		aClass334_3635 = class334;
		anInt3631 = 666035815 * i;
		anInt3629 = i_0_ * 334848175;
		anInt3633 = -235136783 * i_1_;
		anInt3634 = i_2_ * -283954965;
		anInt3632 = -372652039 * i_3_;
		anInt3636 = 561019247 * i_4_;
		anInt3637 = -1279861137 * i_5_;
	}

	@Override
	public Class360 method316() {
		return null;
	}

}