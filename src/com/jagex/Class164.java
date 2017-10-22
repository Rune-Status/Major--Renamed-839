package com.jagex;

import java.util.Iterator;

class Class164 implements Interface20 {
	static int localRegionZ;

	public static void method3364(boolean bool, boolean bool_0_) {
		Class533.aBool7289 = bool;
		Class533.aBool7290 = bool_0_;
	}

	static int[] method3369(OutgoingFrame frame) {
		Buffer buffer = new Buffer(518);
		int[] seed = new int[4];
		for (int index = 0; index < 4; index++) {
			seed[index] = (int) (Math.random() * 9.9999999E7);
		}

		buffer.writeByte(10);
		buffer.writeInt(seed[0]);
		buffer.writeInt(seed[1]);
		buffer.writeInt(seed[2]);
		buffer.writeInt(seed[3]);

		for (int time = 0; time < 10; time++) {
			buffer.writeInt((int) (Math.random() * 9.9999999E7));
		}

		buffer.writeShort((int) (Math.random() * 9.9999999E7));
		buffer.rsa(Class62.LOGIN_RSA_EXPONENT, Class62.LOGIN_RSA_MODULUS);
		frame.payload.writeBytes(buffer.payload, 0, -165875887 * buffer.offset);
		return seed;
	}

	Class186 this$0;

	Class164(Class186 class186) {
		this$0 = class186;
	}

	@Override
	public void method116(Object object) {
		method3363((Interface66) object);
	}

	void method3363(Interface66 interface66) {
		Iterator<Class456> iterator = this$0.method3667().iterator();
		while (iterator.hasNext()) {
			Class456 class456 = iterator.next();

			if (class456.method7444() == interface66) {
				class456.method7509();
				iterator.remove();
			}
		}
	}

}