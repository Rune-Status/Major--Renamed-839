package com.jagex;

public class Class166_Sub16 extends CutsceneAction {
	int anInt9603;
	int anInt9604;
	int anInt9605;
	int anInt9606;
	int anInt9607;
	int anInt9608;

	Class166_Sub16(Buffer buffer) {
		super(buffer);
		anInt9607 = buffer.readUShort() * 2068525045;
		anInt9606 = buffer.readUShort() * -524189483;
		anInt9605 = buffer.readUShort() * 857204541;
		anInt9603 = buffer.readUShort() * 1114774189;
		anInt9604 = buffer.readUShort() * -208488619;
		anInt9608 = buffer.readUShort() * -1556982207;
	}

	@Override
	public void execute() {
		Class493.aClass159Array6787[-837237667 * anInt9607].method3322(0);
		Class493.aClass159Array6787[-692078467 * anInt9606].method3322(1);
		Client.anInt10620 = 0;
		Client.anInt10723 = anInt9605 * 1143760753;
		Client.anInt10725 = 0;
		Client.anInt10726 = anInt9604 * 84012003;
		Client.anInt10727 = anInt9608 * -1749971075;
		Client.anInt10722 = 1338730263;
		Client.anInt10724 = -110360149 * anInt9603;
		Connection.anInt7170 = 442919637;
		Class51.method1136();
		Client.aBool10678 = true;
	}

}