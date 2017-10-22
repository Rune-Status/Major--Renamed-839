package com.jagex;

public class Class606 {
	public static boolean method10251(int id, String host) {
		Class671.activeConnectionInfo = new ConnectionInfo(false);
		Class671.activeConnectionInfo.id = -212349065 * id;
		Class671.activeConnectionInfo.host = host;

		if (Class622.aClass622_8012 != ArchiveLoader.aClass622_4521) {
			Class671.activeConnectionInfo.port = -1309620211 * Class671.activeConnectionInfo.id + 759363264;
			Class671.activeConnectionInfo.alternatePort = Class671.activeConnectionInfo.id * 733597859 + 380423312;
		}
		return true;
	}

	static Class480_Sub1 method10252(int i, boolean bool) {
		long l = i | (bool ? -2147483648 : 0);
		return (Class480_Sub1) Class480_Sub1.aClass667_9961.get(l);
	}

	int anInt7905;

	Class553 aClass553_7906;

	public Class606(Class553 class553, int i) {
		aClass553_7906 = class553;
		anInt7905 = i * 903024319;
	}

	public Class600_Sub1_Sub1_Sub1 method10247(short i) {
		ItemDeque class480_sub3 = Client.groundItems.get(aClass553_7906.plane * 394202151 << 28
				| aClass553_7906.z * -180305283 << 14 | aClass553_7906.x * 2051316501);
		if (class480_sub3 == null) {
			return null;
		}
		Class553 class553 = Client.aClass460_10760.method7679();
		int i_0_ = 2051316501 * aClass553_7906.x - class553.x * 2051316501;
		int i_1_ = aClass553_7906.z * -180305283 - -180305283 * class553.z;
		if (i_0_ >= 0 && i_1_ >= 0 && i_0_ < Client.aClass460_10760.method7680()
				&& i_1_ < Client.aClass460_10760.method7707() && Client.aClass460_10760.method7687() != null) {
			for (Item class480_sub6 = class480_sub3.items.head(); class480_sub6 != null; class480_sub6 = class480_sub3.items
					.next()) {
				if (class480_sub6.id * 1659909117 == anInt7905 * 784818495) {
					return (Class600_Sub1_Sub1_Sub1) Client.aClass460_10760.method7687().method8348(
							394202151 * aClass553_7906.plane, i_0_, i_1_, (byte) -8);
				}
			}
		}
		return null;
	}

}