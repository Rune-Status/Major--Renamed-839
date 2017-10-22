package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class195 {

	static OutgoingFrame method3857(int type, int x, int z) {
		OutgoingFrame frame = null;
		if (type == 0) {
			frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3960, Client.gameConnection.encryptor);
		} else if (1 == type) {
			frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4022, Client.gameConnection.encryptor);
		}

		Class553 class553 = Client.aClass460_10760.method7679();
		frame.payload.writeLEShortA(2051316501 * class553.x + x);
		frame.payload.writeShort(-180305283 * class553.z + z);
		frame.payload.writeByteS(ThemeMusicVolumeNormaliser.method3755() ? 1 : 0);
		Class63.anInt939 = x * -517887053;
		Class63.anInt950 = z * 224109565;
		Class63.aBool955 = false;
		PulseEvent.method16137();
		return frame;
	}

	LinkedList aLinkedList2082;
	long aLong2083;
	int anInt2084 = 1544629177;
	Interface22 anInterface22_2085;

	public Class195(Buffer buffer, Interface22 interface22) {
		aLinkedList2082 = new LinkedList();
		anInterface22_2085 = interface22;
		aLong2083 = buffer.readLong() * 8721777305723894819L;
		anInt2084 = buffer.readInt() * -1544629177;
		for (int i = buffer.readUByte(); 0 != i; i = buffer.readUByte()) {
			Class188 class188 = CompressionType.findIdentifiable(Class188.values(), i);
			Interface23 interface23;
			switch (class188.anInt2053 * 1842393785) {
				case 2:
					interface23 = new Class197(this, buffer);
					break;
				case 1:
					interface23 = new Class189(this, buffer);
					break;
				case 3:
					interface23 = new Class180(this, buffer);
					break;
				case 12:
					interface23 = new Class204(this, buffer);
					break;
				case 6:
					interface23 = new Class201(this, buffer);
					break;
				case 10:
					interface23 = new Class181(this, buffer);
					break;
				case 8:
					interface23 = new Class179(this, buffer);
					break;
				default:
					throw new IllegalStateException("");
				case 0:
					interface23 = new Class185(this);
					break;
				case 9:
					interface23 = new Class184(this, buffer);
					break;
				case 11:
					interface23 = new Class196(this, buffer);
					break;
				case 5:
					interface23 = new Class216(this, buffer);
					break;
				case 7:
					interface23 = new Class183(this, buffer);
					break;
				case 13:
					interface23 = new Class191(this);
					break;
				case 4:
					interface23 = new Class199(this, buffer);
			}

			aLinkedList2082.add(interface23);
		}
	}

	public void method3852(Class192 class192) {
		if (-5896531547024649915L * class192.aLong2068 != aLong2083 * 6220525534949282699L
				|| class192.method3766() != 522360183 * anInt2084) {
			throw new IllegalStateException("");
		}
		Iterator iterator = aLinkedList2082.iterator();
		while (iterator.hasNext()) {
			Interface23 interface23 = (Interface23) iterator.next();
			interface23.method131(class192);
		}
		class192.method3767();
	}

}