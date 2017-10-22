package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class501 implements Runnable {
	public static Archive varbits;
	public static VarpDefinitionLoader aClass77_Sub1_Sub1_6903;

	public static void method8689(int i) {
		PlayerAppearance.anInt7725 = -787359857 * i;
		synchronized (PlayerAppearance.models) {
			PlayerAppearance.models.clear();
		}
		synchronized (PlayerAppearance.aClass168_7723) {
			PlayerAppearance.aClass168_7723.clear();
		}
	}

	static final void method8690(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.removeRoofs
				.getValue();
	}

	Class343_Sub2 this$0;

	Class501(Class343_Sub2 class343_sub2) {
		this$0 = class343_sub2;
	}

	@Override
	public void run() {
		try {
			while (!this$0.aBool9954) {
				Iterator iterator = this$0.aList9957.iterator();
				while (iterator.hasNext()) {
					Class494 class494 = (Class494) iterator.next();
					class494.method8529();
				}
				HashMap hashmap = this$0.method15444(1177740094);
				Iterator iterator_0_ = hashmap.keySet().iterator();
				while (iterator_0_.hasNext()) {
					Class457 class457 = (Class457) iterator_0_.next();
					if (!class457.aBool5150) {
						Class459[] class459s = (Class459[]) hashmap.get(class457);
						for (Class459 class459 : class459s) {
							class459.method7576();
						}
					}
				}
				iterator_0_ = this$0.aList9957.iterator();
				while (iterator_0_.hasNext()) {
					Class494 class494 = (Class494) iterator_0_.next();
					class494.method8530();
				}
				Client.sleep(6L);
			}
		} catch (Exception exception) {
			HitsplatDefinitionProvider.reportError(null, exception);
			exception.printStackTrace();
		}
	}
}
