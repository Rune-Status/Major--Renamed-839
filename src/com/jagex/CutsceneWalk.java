package com.jagex;

public class CutsceneWalk {
	static final int TELEPORTING = 0;
	static final int RUNNING = 2;

	static void method3507(Class480_Sub22 class480_sub22) {
		Class50.aClass261_Sub1_582 = new Class261_Sub1(Client.aClass28_10871);
		Class50.aClass261_Sub1_582.method4806(Class272.aClass272_3007);
		try {
			Class281_Sub3 class281_sub3 = (Class281_Sub3) Class50.aClass261_Sub1_582.method4903(
					Class270.aClass270_2997, false);
			Class642_Sub1 class642_sub1 = (Class642_Sub1) Class50.aClass261_Sub1_582.method4889(
					Class257.aClass257_2850, false);
			class281_sub3.method15304(class480_sub22);
			class642_sub1.method16685(new Class395(0.0F, 0.0F, 0.0F));
			Class50.aClass261_Sub1_582.method4818(Class397.create(99999.0F, 99999.0F, 99999.0F));
			Class50.aClass261_Sub1_582.method4814(Class397.create(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY,
					Float.POSITIVE_INFINITY));
			Class50.aClass261_Sub1_582.method4802(Class397.create(99999.0F, 99999.0F, 99999.0F));
			Class50.aClass261_Sub1_582.method4871(Class397.create(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY,
					Float.POSITIVE_INFINITY));
		} catch (ScriptException exception_sub3) {

		}

		ScriptException.mouseX = Client.recorder.getMouseX() * 2099684925;
		Class50.mouseY = Client.recorder.getMouseY() * -265035361;
		Class50.aBool584 = true;
	}

	int[] movementTypes;
	int[] positions;
	static CutsceneWalk[] walks;

	CutsceneWalk(Buffer buffer) {
		int count = buffer.readUSmart();
		movementTypes = new int[count];
		positions = new int[count];

		for (int index = 0; index < count; index++) {
			int type = buffer.readUByte();
			movementTypes[index] = type;

			int x = buffer.readUShort();
			int z = buffer.readUShort();
			positions[index] = (x << 16) + z;
		}
	}

	void walk(CutsceneMob cutscene, int plane) {
		int position = positions[0];
		cutscene.move(position >>> 16, position & 0xffff, plane);
		Mob mob = cutscene.getMob();
		mob.pathLength = 0;

		for (int index = movementTypes.length - 1; index >= 0; index--) {
			int type = movementTypes[index];
			int next = positions[index];

			mob.pathX[mob.pathLength * 2071858351] = next >> 16;
			mob.pathZ[2071858351 * mob.pathLength] = next & 0xffff;

			byte speed = MovementType.WALKING.id;
			if (TELEPORTING == type) {
				speed = MovementType.TELEPORTING.id;
			} else if (RUNNING == type) {
				speed = MovementType.RUNNING.id;
			}

			mob.pathSpeed[mob.pathLength * 2071858351] = speed;
			mob.pathLength += -379008433;
		}
	}

}