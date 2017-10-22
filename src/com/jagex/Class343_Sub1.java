package com.jagex;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;

public class Class343_Sub1 extends Class343 {
	static final float aFloat9851 = 2.0F;
	Thread aThread9850;
	volatile boolean aBool9852 = false;
	Class339 aClass339_9853;
	Thread aThread9854;
	HashMap<Class457, Class459[]> aHashMap9855;
	long aLong9856 = TimeUtil.time() * 8109434290832148101L;
	Runnable aRunnable9857 = new Class110(this);
	Runnable aRunnable9858 = new Class125(this);

	public Class343_Sub1(Class584 class584) {
		aClass339_9853 = new Class339(this);
		aHashMap9855 = new HashMap<Class457, Class459[]>();
		Iterator iterator = class584.aHashMap7772.keySet().iterator();
		while (iterator.hasNext()) {
			Class457 class457 = (Class457) iterator.next();
			aHashMap9855.put(class457, new Class459[class584.aHashMap7772.get(class457).intValue()]);
		}
		iterator = aHashMap9855.keySet().iterator();
		while (iterator.hasNext()) {
			Class457 class457 = (Class457) iterator.next();
			Class459[] class459s = aHashMap9855.get(class457);
			for (int i = 0; i < class459s.length; i++) {
				Class217 class217 = new Class217(2.0F);
				class217.method261(0, Class337.aClass337_3618, Class338.aClass338_3622, 2);
				class459s[i] = new Class459(class457, 32768, 3, class217, this);
			}
		}
		aThread9854 = new Thread(aRunnable9858);
		aThread9850 = new Thread(aRunnable9857);
		aThread9854.setPriority(1);
		aThread9850.setPriority(1);
		aThread9854.start();
		aThread9850.start();
	}

	@Override
	public void method5873() {
		if (null != aClass339_9853) {
			aClass339_9853.method5838();
		}
		Iterator iterator = aHashMap9855.keySet().iterator();
		while (iterator.hasNext()) {
			Class457 class457 = (Class457) iterator.next();
			Class459[] class459s = aHashMap9855.get(class457);
			if (!class457.aBool5150) {
				boolean bool = false;
				for (Class459 class459 : class459s) {
					class459.method7631();
					bool |= class459.method7564();
				}
				if (bool) {
					Arrays.sort(class459s, new Class122(this));
				}
			}
			int i_3_ = 3;
			boolean bool = false;
			int i_4_ = class459s.length - 1;
			while (!bool) {
				float f = class459s[i_4_].method7562();
				Class454 class454 = class459s[i_4_].method7548();
				if (f < 0.0F) {
					if (class454 == Class454.aClass454_5104 || class454 == Class454.aClass454_5098
							|| Class454.aClass454_5102 == class454) {
						class459s[i_4_].method7558();
					}
				} else {
					bool = true;
				}
				if (--i_4_ < 0) {
					bool = true;
				}
			}
			if (i_4_ >= class459s.length - i_3_) {
				for (; i_4_ >= class459s.length - i_3_; i_4_--) {
					Class454 class454 = class459s[i_4_].method7548();
					if (Class454.aClass454_5104 == class454) {
						class459s[i_4_].method7558();
					}
				}
			}
		}
	}

	@Override
	public Object method5874(int i, int i_5_, Class337 class337, Class338 class338, int i_6_, float f, byte i_7_) {
		return new Object();
	}

	@Override
	public void method5875() {
		HashMap hashmap = method15342();
		synchronized (hashmap) {
			Iterator iterator = hashmap.keySet().iterator();
			while (iterator.hasNext()) {
				Class457 class457 = (Class457) iterator.next();
				Class459[] class459s = (Class459[]) hashmap.get(class457);
				for (Class459 class459 : class459s) {
					if (class459.method7548() != Class454.aClass454_5106) {
						class459.method7558();
						class459.method7553();
					}
				}
			}
		}
		boolean bool = false;
		while (!bool) {
			bool = true;
			synchronized (hashmap) {
				Iterator iterator = hashmap.keySet().iterator();
				while (iterator.hasNext()) {
					Class457 class457 = (Class457) iterator.next();
					Class459[] class459s = (Class459[]) hashmap.get(class457);
					for (Class459 class459 : class459s) {
						if (class459.method7548() != Class454.aClass454_5106) {
							class459.method7631();
							bool = false;
						}
					}
				}
			}
			Client.sleep(10L);
		}
		aBool9852 = true;
		try {
			aThread9854.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread9850.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	@Override
	public void method5876(Object object, byte[] is, int i, int i_8_, int i_9_) {

	}

	@Override
	public Class339 method5888() {
		return aClass339_9853;
	}

	@Override
	public int method5889(Object object, int i) {
		long l = TimeUtil.time();
		int i_12_ = (int) (180000.0F / ((l - -3215644189946478003L * aLong9856) / 1000.0F));
		aLong9856 = l * 8109434290832148101L;
		return i_12_;
	}

	@Override
	public void method5904(Object object, int i) {

	}

	@Override
	public Class459 method5905(Class457 class457) {
		synchronized (aHashMap9855) {
			Class459[] class459s = aHashMap9855.get(class457);
			if (null == class459s) {
				Class459 class459 = null;
				return class459;
			}
			for (Class459 class459 : class459s) {
				Class454 class454 = class459.method7548();
				if (Class454.aClass454_5106 == class454) {
					class459.method7552();
					Class459 class459_11_ = class459;
					return class459_11_;
				}
			}
		}
		return null;
	}

	HashMap<Class457, Class459[]> method15342() {
		return aHashMap9855;
	}

	@Override
	Object method5879(Class326 class326) {
		return null;
	}
}
