package com.jagex;

public class Class480_Sub41_Sub3 extends Class480_Sub41 {
	int anInt11332;

	public Class480_Sub41_Sub3(int i, int i_0_, int i_1_) {
		super(i, i_0_);
		anInt11332 = i_1_ * 390350975;
	}

	@Override
	public boolean method16250() {
		LinkableObject class480_sub25 = Client.npcs.get(-1441564801 * anInt11332);
		if (class480_sub25 != null) {
			Class253.method4724(Class520.aClass520_7185, 1021060255 * anInt10372, -1, (Mob) class480_sub25.object,
					anInt11332 * -1441564801);
			return true;
		}
		return false;
	}
}
