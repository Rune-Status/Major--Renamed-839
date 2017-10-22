package com.jagex;

import java.util.HashMap;
import java.util.Iterator;

class Class110 implements Runnable {
	static FontSpecification aClass9_1411;

	static boolean method2024(boolean bool, boolean bool_0_, String string, String string_1_, long l) {
		Class31.socialNetworkLogin = bool;
		if (!bool_0_) {
			Class31.socialNetworkId = -1568798451;
		}
		Class31.aBool394 = bool_0_;
		Class31.aString423 = string;
		Class31.accountPassword = string_1_;
		Class31.accountName = 5617524125832062695L * l;
		if (!Class31.aBool394 && (Class31.aString423.equals("") || Class31.accountPassword.equals(""))) {
			HashTableIterator.method13671(3);
			Client.method5397();
			return false;
		}
		if (156 != -1955604939 * Class31.loginType) {
			Class31.anInt388 = 0;
			Class31.anInt436 = 2091473183;
			Class31.anInt435 = -1600689111;
		}
		Class31.activeConnection.error = false;
		HashTableIterator.method13671(-3);
		Class31.loginStep = -1782511293;
		Class31.loginTicks = 0;
		Class31.loginErrors = 0;
		return true;
	}

	static void method2025() {
		Class34.aClass40_450 = Class40.aClass40_542;
		Class34.aClass653_451 = Class653.aClass653_8227;
		Class23.aClass640_326 = Class640.aClass640_8140;
		Class34.aClass637_448 = Class637.aClass637_8130;
		Class34.aClass636_454 = Class636.aClass636_8123;
		Class34.aClass630_449 = Class630.aClass630_8058;
		Class512.aString7005 = null;
	}

	Class343_Sub1 this$0;

	Class110(Class343_Sub1 class343_sub1) {
		this$0 = class343_sub1;
	}

	@Override
	public void run() {
		try {
			while (!this$0.aBool9852) {
				HashMap<Class457, Class459[]> hashmap = this$0.method15342();
				Iterator<Class457> iterator = hashmap.keySet().iterator();

				while (iterator.hasNext()) {
					Class457 class457 = iterator.next();
					if (!class457.aBool5150) {
						Class459[] class459s = hashmap.get(class457);
						for (Class459 class459 : class459s) {
							class459.method7576();
						}
					}
				}
				Client.sleep(50L);
			}
		} catch (Exception exception) {
			HitsplatDefinitionProvider.reportError(null, exception);
		}
	}

}