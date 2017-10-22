package com.jagex;

public class Class480_Sub41_Sub4 extends Class480_Sub41 {
	static MenuOption aClass480_Sub31_Sub17_11430;
	static int anInt11432;
	int index;

	public Class480_Sub41_Sub4(int i, int i_0_, int i_1_) {
		super(i, i_0_);
		index = i_1_ * -1007889265;
	}

	@Override
	public boolean method16250() {
		Player player = Client.players[index * 2071579247];
		if (null != player) {
			Class253.method4724(Class520.aClass520_7186, anInt10372 * 1021060255, -1, player, 2071579247 * index);
			return true;
		}
		return false;
	}

}