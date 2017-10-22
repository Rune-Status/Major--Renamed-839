package com.jagex;

public class Class604 {
	static final void method10231() {
		Class626.anInt8034 -= -710535363;
	}

	static final void method10232(Class480_Sub12 class480_sub12, boolean bool) {
		if (class480_sub12.aBool10063) {
			if (class480_sub12.anInt10070 * 1634822171 < 0
					|| ObjectDefinition.modelsLoaded(Client.aClass460_10760.getObjectLoader(),
							1634822171 * class480_sub12.anInt10070, class480_sub12.anInt10062 * 1948855293)) {
				if (!bool) {
					Class268.method5051(-618261599 * class480_sub12.plane, class480_sub12.group * -677397461,
							class480_sub12.localX * 1155137153, 51547319 * class480_sub12.localZ,
							class480_sub12.anInt10070 * 1634822171, class480_sub12.anInt10060 * 1217658007,
							class480_sub12.anInt10062 * 1948855293, -1, 0);
				} else {
					Class261_Sub1.method15146(-618261599 * class480_sub12.plane, class480_sub12.group * -677397461,
							class480_sub12.localX * 1155137153, class480_sub12.localZ * 51547319, null);
				}
				class480_sub12.unlink();
			}
		} else if (class480_sub12.aBool10069
				&& 1155137153 * class480_sub12.localX >= 1
				&& 51547319 * class480_sub12.localZ >= 1
				&& 1155137153 * class480_sub12.localX <= Client.aClass460_10760.method7680() - 2
				&& 51547319 * class480_sub12.localZ <= Client.aClass460_10760.method7707() - 2
				&& (42318177 * class480_sub12.id < 0 || ObjectDefinition.modelsLoaded(
						Client.aClass460_10760.getObjectLoader(), 42318177 * class480_sub12.id,
						class480_sub12.type * 357065445))) {
			if (!bool) {
				Class268.method5051(class480_sub12.plane * -618261599, class480_sub12.group * -677397461,
						class480_sub12.localX * 1155137153, 51547319 * class480_sub12.localZ,
						class480_sub12.id * 42318177, 1727643 * class480_sub12.orientation,
						357065445 * class480_sub12.type, -1, 0);
			} else {
				Class261_Sub1.method15146(class480_sub12.plane * -618261599, class480_sub12.group * -677397461,
						1155137153 * class480_sub12.localX, 51547319 * class480_sub12.localZ,
						class480_sub12.aClass540_10066);
			}
			class480_sub12.aBool10069 = false;
			if (!bool && class480_sub12.id * 42318177 == class480_sub12.anInt10070 * 1634822171
					&& -1 == 1634822171 * class480_sub12.anInt10070) {
				class480_sub12.unlink();
			} else if (!bool && 42318177 * class480_sub12.id == class480_sub12.anInt10070 * 1634822171
					&& class480_sub12.orientation * 1727643 == 1217658007 * class480_sub12.anInt10060
					&& class480_sub12.anInt10062 * 1948855293 == 357065445 * class480_sub12.type) {
				class480_sub12.unlink();
			}
		}
	}

	Object[] anObjectArray7881;
	int anInt7882 = -2083631521;
	int[] anIntArray7883;
	Script scripts;
	long[] aLongArray7885;

}