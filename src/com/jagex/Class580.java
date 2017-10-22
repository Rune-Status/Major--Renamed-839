package com.jagex;

public class Class580 {
	public static Archive natives;

	static void method9829(int i) {
		Class75.aClass168_1125.sweep(i);
	}

	public InputSubscriber anInterface62_7754;
	public InputSubscriber anInterface62_7755;
	public InputSubscriber anInterface62_7756;
	public InputSubscriber anInterface62_7757;
	public boolean aBool7758;
	public HeldKeyInputSubscriber aClass557_7759;
	public HeldKeyInputSubscriber aClass557_7760;
	public HeldKeyInputSubscriber aClass557_7761;
	public int anInt7762;
	public int anInt7763;

	public Class580(Archive defaults) {
		byte[] data = defaults.get(Class577.aClass577_7732.file * -1881625811);
		decode(new Buffer(data));
	}

	void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			if (1 == opcode) {
				anInterface62_7757 = InputSubscriberUtils.decode(buffer);
			} else if (opcode == 2) {
				anInterface62_7755 = InputSubscriberUtils.decode(buffer);
			} else if (3 == opcode) {
				anInterface62_7756 = InputSubscriberUtils.decode(buffer);
			} else if (opcode == 4) {
				anInterface62_7754 = InputSubscriberUtils.decode(buffer);
			} else if (opcode == 5) {
				aClass557_7761 = HeldKeyInputSubscriber.decode(buffer);
			} else if (opcode == 6) {
				aClass557_7759 = HeldKeyInputSubscriber.decode(buffer);
			} else if (7 == opcode) {
				aClass557_7760 = HeldKeyInputSubscriber.decode(buffer);
			} else if (opcode == 8) {
				InputSubscriberUtils.decode(buffer);
			} else if (9 == opcode) {
				InputSubscriberUtils.decode(buffer);
			} else if (10 == opcode) {
				InputSubscriberUtils.decode(buffer);
			} else if (opcode == 11) {
				aBool7758 = true;
			} else if (12 == opcode) {
				anInt7763 = buffer.readInt() * -1157045713;
			} else if (opcode == 13) {
				anInt7762 = buffer.readInt() * 156923411;
			}
		}
	}

}