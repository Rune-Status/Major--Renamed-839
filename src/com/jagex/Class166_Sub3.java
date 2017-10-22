package com.jagex;

public class Class166_Sub3 extends CutsceneAction {
	static short aShort9532;

	public static void method15077() {
		Class495_Sub1.aHashMap10331.clear();
		Class495_Sub1.aHashMap10332.clear();
	}

	int anInt9527;
	int anInt9528;
	int anInt9529;
	int anInt9530;
	int anInt9531;

	Class166_Sub3(Buffer buffer) {
		super(buffer);
		anInt9529 = buffer.readUShort() * 2144751595;
		anInt9528 = buffer.readUShort() * -460565449;
		anInt9531 = buffer.readUShort() * -1363685835;
		anInt9527 = buffer.readUShort() * -402594033;
		anInt9530 = buffer.readUShort() * -584697093;
	}

	@Override
	public void execute() {
		ResourceManager.method6709(anInt9529 * 2082169027, anInt9531 * 888902685, anInt9528 * -1128291961, 100, 100,
				false);
		Class474.method8102(anInt9527 * -994367505, 1184022579 * anInt9530, 0);
		Client.aBool10678 = true;
	}

}