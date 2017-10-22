package com.jagex;

public class Class597 {
	static long aLong7841 = -6316292173340227821L;
	static int anInt7842 = 0;
	static boolean aBool7843 = true;

	public static boolean method10130(int id) {
		if (Class163.anInt1914 * -2047393597 != id || null == Class163.aClass155_1915) {
			EnvironmentContext.method13262();
			Class163.aClass155_1915 = Class155.aClass155_1871;
			Class163.anInt1914 = 739340267 * id;
		}

		if (Class155.aClass155_1871 == Class163.aClass155_1915) {
			byte[] data = Class140.cutscenes.get(id);
			if (data == null) {
				return false;
			}

			Buffer buffer = new Buffer(data);
			Class163.method977(buffer);
			int areas = buffer.readUByte();
			for (int index = 0; index < areas; index++) {
				CutsceneArea.cutsceneAreas.pushBack(new CutsceneArea(buffer));
			}

			int i_3_ = buffer.readUSmart();
			Class493.aClass159Array6787 = new Class159[i_3_];
			for (int index = 0; index < i_3_; index++) {
				Class493.aClass159Array6787[index] = new Class159(buffer);
			}

			int mobs = buffer.readUSmart();
			CutsceneMob.mobs = new CutsceneMob[mobs];
			for (int index = 0; index < mobs; index++) {
				CutsceneMob.mobs[index] = new CutsceneMob(buffer, index);
			}

			int objects = buffer.readUSmart();
			CutsceneObject.objects = new CutsceneObject[objects];
			for (int index = 0; index < objects; index++) {
				CutsceneObject.objects[index] = new CutsceneObject(buffer);
			}

			int paths = buffer.readUSmart();
			CutsceneWalk.walks = new CutsceneWalk[paths];
			for (int index = 0; index < paths; index++) {
				CutsceneWalk.walks[index] = new CutsceneWalk(buffer);
			}

			int actions = buffer.readUSmart();
			CutsceneAction.actions = new CutsceneAction[actions];
			for (int index = 0; index < actions; index++) {
				CutsceneAction.actions[index] = CutsceneAction.decode(buffer);
			}

			Class163.aClass155_1915 = Class155.aClass155_1872;
		}

		if (Class155.aClass155_1872 == Class163.aClass155_1915) {
			boolean ready = true;

			for (CutsceneMob mob : CutsceneMob.mobs) {
				if (!mob.ready()) {
					ready = false;
				}
			}

			for (CutsceneAction action : CutsceneAction.actions) {
				if (!action.ready()) {
					ready = false;
				}
			}

			for (CutsceneObject object : CutsceneObject.objects) {
				if (!object.ready()) {
					ready = false;
				}
			}

			if (!ready) {
				return false;
			}

			Class163.aClass155_1915 = Class155.aClass155_1873;
		}

		return true;
	}

	Class597() throws Throwable {
		throw new Error();
	}

}