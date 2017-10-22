package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class493 implements Runnable {
	static Class159[] aClass159Array6787;

	static final void method8527(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -370763243 * class226.anInt2409;
	}

	Class343_Sub2 this$0;

	Class493(Class343_Sub2 class343_sub2) {
		this$0 = class343_sub2;
	}

	@Override
	public void run() {
		try {
			while (!this$0.aBool9954) {
				HashMap hashmap = this$0.method15444(410848597);
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
				Client.sleep(10L);
			}
		} catch (Exception exception) {
			HitsplatDefinitionProvider.reportError(null, exception);
			exception.printStackTrace();
		}
	}
}
