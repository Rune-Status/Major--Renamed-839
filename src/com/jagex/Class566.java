package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class566 implements Iterable {

	public static Class636 method9573(int i) {
		if (null == Class34.aClass636_454) {
			return Class636.aClass636_8123;
		}
		return Class34.aClass636_454;
	}

	static void method9574(FrameBuffer buffer) {
		boolean bool = buffer.readUByte() == 1;
		if (bool) {
			int i_11_ = buffer.readOpcode() << 24;
			i_11_ |= buffer.readOpcode() << 16;
			i_11_ |= buffer.readOpcode() << 8;
			i_11_ |= buffer.readOpcode();
			SkyboxDefinition.aClass55_7012.put(Class298_Sub1.aLong9722 * -4578638200598135289L, i_11_);
		}
	}

	Class559[] aClass559Array7583;

	public Class566(Archive defaults) {
		method9569(defaults.get(Class577.aClass577_7730.file * -1881625811));
	}

	@Override
	public Iterator iterator() {
		return new Class581(aClass559Array7583);
	}

	public int method9564() {
		return aClass559Array7583.length;
	}

	public Class559 method9565(int i) {
		return aClass559Array7583[i];
	}

	void method9561() {
		aClass559Array7583 = null;
	}

	void method9563(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			if (opcode == 1) {
				int count = buffer.readUByte();
				int maximumId = 0;
				LinkedList<Class559> list = new LinkedList<Class559>();

				for (int i = 0; i < count; i++) {
					int id = buffer.readUByte();
					int i_5_ = buffer.readUShort();
					int attributes = buffer.readUByte();
					boolean bool = (attributes & 0x1) != 0;
					int level = 0;

					if ((attributes & 0x2) != 0) {
						level = buffer.readUByte();
					}

					buffer.readUByte();
					list.add(new Class559(id, i_5_, bool, level));
					if (id > maximumId) {
						maximumId = id;
					}
				}

				aClass559Array7583 = new Class559[1 + maximumId];
				Iterator<Class559> iterator = list.iterator();

				while (iterator.hasNext()) {
					Class559 class559 = iterator.next();
					aClass559Array7583[class559.getId()] = class559;
				}
			}
		}
	}

	void method9569(byte[] data) {
		method9561();
		if (data == null) {
			aClass559Array7583 = new Class559[0];
		} else {
			method9563(new Buffer(data));
		}
	}

}