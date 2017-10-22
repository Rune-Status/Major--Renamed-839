package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

public class Class343_Sub2 extends Class343 {
	static final float aFloat9958 = 2.0F;
	public static String osVersion;

	static void method15447() {
		Class50.aClass261_Sub1_582 = null;
		Class50.aBool584 = false;
	}

	Thread aThread9951;
	HashMap aHashMap9952 = new HashMap();
	Class339 aClass339_9953;
	volatile boolean aBool9954 = false;
	Runnable aRunnable9955;
	Runnable aRunnable9956;
	List aList9957 = new ArrayList();

	Thread aThread9959;

	public Class343_Sub2(Class584 class584) {
		aRunnable9956 = new Class501(this);
		aRunnable9955 = new Class493(this);
		aClass339_9953 = new Class339(this);

		Iterator<Class457> iterator = class584.aHashMap7772.keySet().iterator();
		while (iterator.hasNext()) {
			Class457 class457 = iterator.next();
			aHashMap9952.put(class457, new Class459[class584.aHashMap7772.get(class457)]);
		}

		iterator = aHashMap9952.keySet().iterator();
		while (iterator.hasNext()) {
			Class457 class457 = iterator.next();
			Class459[] class459s = (Class459[]) aHashMap9952.get(class457);

			for (int index = 0; index < class459s.length; index++) {
				Class217 class217 = new Class217(2.0F);
				class217.method261(0, Class337.aClass337_3618, Class338.aClass338_3622, 2);
				class459s[index] = new Class459(class457, 8192, 3, class217, this);
			}
		}

		Class494 class494 = new Class494(this, 44100.0F, 32768);
		Class494 class494_5_ = new Class494(this, 22050.0F, 16384);

		aList9957.add(class494);
		aList9957.add(class494_5_);

		aThread9951 = new Thread(aRunnable9955);
		aThread9959 = new Thread(aRunnable9956);

		aThread9951.setPriority(10);
		aThread9959.setPriority(10);

		aThread9951.start();
		aThread9959.start();
	}

	@Override
	public void method5873() {
		if (null != aClass339_9953) {
			aClass339_9953.method5838();
		}

		Iterator iterator = aHashMap9952.keySet().iterator();
		while (iterator.hasNext()) {
			Class457 class457 = (Class457) iterator.next();
			Class459[] class459s = (Class459[]) aHashMap9952.get(class457);

			if (!class457.aBool5150) {
				boolean bool = false;
				for (Class459 class459 : class459s) {
					class459.method7631();
					bool |= class459.method7564();
				}

				if (bool) {
					Arrays.sort(class459s, new Class499(this));
				}
			}

			int i_17_ = 6;
			boolean bool = false;
			int i_18_ = class459s.length - 1;
			while (false == bool) {
				float f = class459s[i_18_].method7562();
				Class454 class454 = class459s[i_18_].method7548();
				if (f < 0.0F) {
					if (Class454.aClass454_5104 == class454 || Class454.aClass454_5098 == class454
							|| class454 == Class454.aClass454_5102) {
						class459s[i_18_].method7558();
					}
				} else {
					bool = true;
				}
				if (--i_18_ < 0) {
					bool = true;
				}
			}
			if (i_18_ >= class459s.length - i_17_) {
				for (; i_18_ >= class459s.length - i_17_; i_18_--) {
					Class454 class454 = class459s[i_18_].method7548();
					if (Class454.aClass454_5104 == class454) {
						class459s[i_18_].method7558();
					}
				}
			}
		}
	}

	@Override
	public Object method5874(int i, int i_6_, Class337 class337, Class338 class338, int i_7_, float f, byte i_8_) {
		Class494 class494 = method15443(f * i_6_);
		Class502 class502 = new Class502(this, class494, i_7_, i_6_ * f, class337.anInt3617 * 1502392487,
				i < 2 ? 2 : i, Class337.aClass337_3618 == class337 || Class337.aClass337_3619 == class337,
				Class338.aClass338_3623 == class338);
		synchronized (class502.aClass494_6904) {
			class502.aClass494_6904.add(class502);
		}
		return class502;
	}

	@Override
	public void method5875() {
		HashMap hashmap = method15444(243160210);
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
		aBool9954 = true;
		try {
			aThread9951.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
		try {
			aThread9959.join();
		} catch (InterruptedException interruptedexception) {
			interruptedexception.printStackTrace();
		}
	}

	@Override
	public void method5876(Object object, byte[] is, int i, int i_10_, int i_11_) {
		if (object != null && object instanceof Class502) {
			Class502 class502 = (Class502) object;
			synchronized (class502.aClass494_6904) {
				class502.method8694(is, i, i_10_, 1766115761);
			}
		}
	}

	@Override
	public Class339 method5888() {
		return aClass339_9953;
	}

	@Override
	public int method5889(Object object, int i) {
		if (object != null && object instanceof Class502) {
			Class502 class502 = (Class502) object;
			synchronized (class502.aClass494_6904) {
				int i_9_ = class502.method8692();
				return i_9_;
			}
		}
		return 0;
	}

	@Override
	public void method5904(Object object, int i) {
		if (null != object && object instanceof Class502) {
			Class502 class502 = (Class502) object;
			synchronized (class502.aClass494_6904) {
				class502.aClass494_6904.remove(class502);
			}
		}
	}

	@Override
	public Class459 method5905(Class457 class457) {
		synchronized (aHashMap9952) {
			Class459[] class459s = (Class459[]) aHashMap9952.get(class457);
			if (null == class459s) {
				Class459 class459 = null;
				return class459;
			}
			for (Class459 class459 : class459s) {
				Class454 class454 = class459.method7548();
				if (Class454.aClass454_5106 == class454) {
					class459.method7552();
					Class459 class459_15_ = class459;
					return class459_15_;
				}
			}
		}
		return null;
	}

	Class494 method15443(float f) {
		float f_0_ = -1.0F;
		float f_1_ = 3.4028235E38F;
		Class494 class494 = null;
		Iterator<Class494> iterator = aList9957.iterator();

		while (iterator.hasNext()) {
			Class494 class494_2_ = iterator.next();
			float rate = class494_2_.sampleRate;
			float f_4_ = Math.abs(rate - f);

			if (f_0_ < 0.0F || f_4_ < f_1_) {
				f_0_ = rate;
				f_1_ = f_4_;
				class494 = class494_2_;
			}
		}

		return class494;
	}

	HashMap method15444(int i) {
		return aHashMap9952;
	}

	@Override
	Object method5879(Class326 class326) {
		return null;
	}

}