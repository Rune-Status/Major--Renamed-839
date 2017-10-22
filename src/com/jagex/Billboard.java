package com.jagex;

public class Billboard {
	static final int anInt3810 = 0;

	public static void socialNetworkLogin(int id, String string, boolean bool) {
		if (Client.unconnected()) {
			if (id != Class31.socialNetworkId * -1420488133) {
				Class31.accountName = -5617524125832062695L;
			}
			Class31.socialNetworkId = id * 1568798451;
			Class31.aString405 = string;
			Class31.aBool426 = bool;
			Class536.setGameState(15);
		}
	}

	static final void method6005(ScriptExecutionContext class613, int i) {
		int i_4_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_4_);
		ScriptExecutionContext.method1537(class226, class613);
	}

	static void method6007(int i, int i_6_, int i_7_) {
		Class56.anInt639 = i * -779078951;
		Class56.anInt640 = i_6_ * 2092610951;
	}

	public boolean aBool3806;
	public boolean aBool3807;
	public int anInt3808;
	public int anInt3809;
	public int anInt3811;
	public int anInt3813;
	public int texture = -1058808893;
	public static Archive billboards;

	Billboard() {
		anInt3808 = 1413739968;
		anInt3809 = -1508361920;
		anInt3813 = -1106537426;
		anInt3811 = 305376875;
	}

	void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	void decode(Buffer buffer, int opcode) {
		if (1 == opcode) {
			texture = buffer.readUShort() * 1058808893;
			if (65535 == -1249209579 * texture) {
				texture = -1058808893;
			}
		} else if (opcode == 2) {
			anInt3808 = (buffer.readUShort() + 1) * 1766920151;
			anInt3809 = (buffer.readUShort() + 1) * 915955941;
		} else if (opcode == 3) {
			buffer.readByte();
		} else if (opcode == 4) {
			anInt3813 = buffer.readUByte() * -553268713;
		} else if (opcode == 5) {
			anInt3811 = buffer.readUByte() * 305376875;
		} else if (opcode == 6) {
			aBool3807 = true;
		} else if (opcode == 7) {
			aBool3806 = true;
		}
	}

}