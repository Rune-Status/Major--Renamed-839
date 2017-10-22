package com.jagex;

import java.util.ArrayList;
import java.util.List;

public class Class187 {
	public static void method3739(boolean bool) {
		if (Client.cutsceneStage * 2087248539 != 0 && Client.cutsceneStage * 2087248539 != 3) {
			if (!bool) {
				if (CutsceneAction.actions != null) {
					for (CutsceneAction action : CutsceneAction.actions) {
						action.method3389();
					}
				}

				if (1093175909 * Class163.anInt1916 != -1) {
					TurnMobCutsceneAction.aClass186_9434.method3617(1093175909 * Class163.anInt1916, 255);
				}
			}

			Client.cutsceneStage = 0;
			HashedVariableCollection.aClass480_Sub17_1484 = null;
			Client.aBool10678 = false;

			if (-2047393597 * Class163.anInt1914 > 0) {
				ScriptExecutionContext.method6991(Class520.aClass520_7189, -2047393597 * Class163.anInt1914, -1);
			}

			EnvironmentContext.method13262();
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4037,
					Client.gameConnection.encryptor);
			frame.payload.writeByte(bool ? 1 : 0);
			Client.gameConnection.sendFrame(frame);
		}
	}

	Class186 this$0;
	List<Class456> list = new ArrayList<Class456>();

	Class187(Class186 class186) {
		this$0 = class186;
	}

	void add(Class456 class456) {
		list.add(class456);
	}

	void remove(Class456 class456) {
		list.remove(class456);
	}

	List<Class456> backing() {
		return list;
	}

	boolean contains(Class456 class456) {
		return list.contains(class456);
	}

}