package com.jagex;

public class ClanChannelUpdater {

	public static int anInt3185;
	static final int anInt3168 = 9;
	static final int anInt3170 = 7;
	static final int anInt3172 = 2;
	static final int anInt3173 = 3;
	static final int anInt3174 = 4;
	static final int anInt3175 = 5;
	static final int anInt3176 = 10;
	static final int anInt3177 = 14;
	static final int anInt3178 = 1;
	static final int anInt3179 = 8;
	static final int anInt3181 = 11;
	static final int anInt3182 = 12;
	static final int anInt3183 = 13;
	static final int anInt3184 = 6;

	static void method5279(int i, boolean bool, int i_4_) {
		Class480_Sub1 class480_sub1 = Class606.method10252(i, bool);
		if (null != class480_sub1) {
			class480_sub1.unlink();
		}
	}

	long hash;
	int updateCount = -569012373;
	Deque<ClanChannelUpdate> updates = new Deque<ClanChannelUpdate>();

	public ClanChannelUpdater(Buffer buffer) {
		decode(buffer);
	}

	public void apply(ClanSettings settings) {
		if (settings.hash * 315422807604727727L != -2511050711533589225L * hash
				|| updateCount * -891495747 != 1082901023 * settings.updateCount) {
			throw new RuntimeException("");
		}

		for (ClanChannelUpdate update = updates.head(); update != null; update = updates.next()) {
			update.apply(settings);
		}

		settings.updateCount += 1624717791;
	}

	void decode(Buffer buffer) {
		hash = buffer.readLong() * -4169698889701287257L;
		updateCount = buffer.readInt() * 569012373;

		for (int opcode = buffer.readUByte(); 0 != opcode; opcode = buffer.readUByte()) {
			ClanChannelUpdate update;

			if (opcode == 3) {
				update = new BanMemberChannelUpdate(this);
			} else if (1 == opcode) {
				update = new AddMemberChannelUpdate(this);
			} else if (13 == opcode) {
				update = new Class480_Sub14_Sub10(this);
			} else if (4 == opcode) {
				update = new ClanSettingsChannelUpdate(this);
			} else if (opcode == 6) {
				update = new UnbanMemberChannelUpdate(this);
			} else if (opcode == 5) {
				update = new DeleteMemberChannelUpdate(this);
			} else if (opcode == 2) {
				update = new SetMemberRankChannelUpdate(this);
			} else if (opcode == 7) {
				update = new Class480_Sub14_Sub4(this);
			} else if (opcode == 14) {
				update = new Class480_Sub14_Sub12(this);
			} else if (opcode == 8) {
				update = new SetIntVariableChannelUpdate(this);
			} else if (9 == opcode) {
				update = new SetLongVariableChannelUpdate(this);
			} else if (10 == opcode) {
				update = new SetStringVariableChannelUpdate(this);
			} else if (11 == opcode) {
				update = new SetVarbitChannelUpdate(this);
			} else if (opcode == 12) {
				update = new SetClanNameChannelUpdate(this);
			} else {
				throw new RuntimeException("");
			}

			update.decode(buffer);
			updates.pushBack(update);
		}
	}

}