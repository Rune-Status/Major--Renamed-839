package com.jagex;

import java.net.InetAddress;
import java.util.LinkedList;
import java.util.Queue;

import jaclib.ping.Ping;

public class Class588 implements Runnable {
	public static int anInt7779;

	static final void method9911(ScriptExecutionContext class613, byte i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method5906(class226, class221, class613);
	}

	static final void method9912(ScriptExecutionContext class613, int i) {
		Class587.method9895(class613, Client.localPlayer, (byte) 52);
	}

	static final void method9913(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3976,
				Client.gameConnection.encryptor);
		class480_sub15.payload.writeShort(i_0_);
		Client.gameConnection.sendFrame(class480_sub15);
	}

	Thread aThread7776;

	Object anObject7777 = new Object();

	Queue aQueue7778 = new LinkedList();

	public Class588() {
		aThread7776 = new Thread(this);
		aThread7776.setDaemon(true);
		aThread7776.start();
	}

	public Class587 method9897(String string) {
		if (aThread7776 == null) {
			throw new IllegalStateException("");
		}
		if (string == null) {
			throw new IllegalArgumentException("");
		}
		Class587 class587 = new Class587(string);
		method9898(class587, -61287978);
		return class587;
	}

	public void method9909(byte i) {
		if (null != aThread7776) {
			method9898(anObject7777, -61287978);
			try {
				aThread7776.join();
			} catch (InterruptedException interruptedexception) {

			}
			aThread7776 = null;
		}
	}

	@Override
	public void run() {
		for (;;) {
			Class587 class587;
			synchronized (aQueue7778) {
				Object object;
				for (object = aQueue7778.poll(); null == object; object = aQueue7778.poll()) {
					try {
						aQueue7778.wait();
					} catch (InterruptedException interruptedexception) {

					}
				}
				if (anObject7777 == object) {
					break;
				}
				class587 = (Class587) object;
			}
			int i;
			try {
				byte[] is = InetAddress.getByName(class587.aString7775).getAddress();
				i = Ping.ping(is[0], is[1], is[2], is[3], 1000L);
			} catch (Throwable throwable) {
				i = 1000;
			}
			class587.anInt7774 = i * 1943359943;
		}
	}

	void method9898(Object object, int i) {
		synchronized (aQueue7778) {
			aQueue7778.add(object);
			aQueue7778.notify();
		}
	}
}
