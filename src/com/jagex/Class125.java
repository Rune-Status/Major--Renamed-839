package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class125 implements Runnable {
	public static void method2261(int i, int i_2_) {
		if (i < 1) {
			Class495_Sub1.anInt10333 = Class495_Sub1.anInt10323 * -1428542803;
		} else {
			Class495_Sub1.anInt10333 = -1403830349 * i;
		}
	}

	Class343_Sub1 this$0;

	Class125(Class343_Sub1 class343_sub1) {
		this$0 = class343_sub1;
	}

	@Override
	public void run() {
		try {
			while (!this$0.aBool9852) {
				HashMap hashmap = this$0.method15342();
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class457 class457 = (Class457) iterator.next();
					if (!class457.aBool5150) {
						Class459[] class459s = (Class459[]) hashmap.get(class457);
						for (Class459 class459 : class459s) {
							class459.method7580();
						}
					}
				}
				Client.sleep(25L);
			}
		} catch (Exception exception) {
			HitsplatDefinitionProvider.reportError(null, exception);
		}
	}
}
