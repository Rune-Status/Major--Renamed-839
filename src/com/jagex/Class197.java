package com.jagex;

public class Class197 implements Interface23 {
	static void method3862() {
		Class31.activeConnection.dropFrames();
		Class31.activeConnection.buffer.offset = 0;
		Class31.activeConnection.lastFrame = null;
		Class31.activeConnection.secondLastFrame = null;
		Class31.activeConnection.thirdLastFrame = null;
		Class31.activeConnection.idleReadPulses = 0;
		Client.anInt10622 = 0;
		Class248.method4007();
		Client.anInt10892 = 0;
		Client.friendCount = 0;
		Client.ignoredPlayerCount = 0;
		Client.aString10890 = null;
		Client.friendChatSize = 0;
		Class551.friendsChat = null;
		MobChatCutsceneAction.aClass288_9645 = null;
		JavaFont.aClass288_8793 = null;
		Client.resetRecordEncoders();

		for (int i_0_ = 0; i_0_ < PlayerVariableProvider.instance.aClass565Array1023.length; i_0_++) {
			Class565 class565 = new Class565(Class197.aClass566_9252.method9565(i_0_), false);
			class565.method9532(0);
			class565.method9529(0);
			PlayerVariableProvider.instance.aClass565Array1023[i_0_] = class565;
		}

		PlayerVariableProvider.instance.collection.reset();
		PulseEvent.clear();
		Class530.sendWindowInfo(Class31.activeConnection);
	}

	static final void method3864(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.anInt2418 = 1219093618;
		class226.aClass267_2361 = null;
		class226.anInt2486 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 1265546033;
		if (-1 == class226.component * -592186295 && !class221.aBool2278) {
			PulseEvent.method7175(class226.id * 1857819631);
		}
	}

	static void method3866(Widget class226, int i, int i_1_, byte i_2_) {
		if (0 == class226.aByte2400) {
			class226.positionX = class226.basePositionX * -19961807;
		} else if (class226.aByte2400 == 1) {
			class226.positionX = 1223155671 * (183375671 * class226.basePositionX + (i - class226.width * 688089097) / 2);
		} else if (2 == class226.aByte2400) {
			class226.positionX = 1223155671 * (i - 688089097 * class226.width - class226.basePositionX * 183375671);
		} else if (class226.aByte2400 == 3) {
			class226.positionX = 1223155671 * (i * class226.basePositionX * 183375671 >> 14);
		} else if (4 == class226.aByte2400) {
			class226.positionX = ((i * 183375671 * class226.basePositionX >> 14) + (i - class226.width * 688089097) / 2) * 1223155671;
		} else {
			class226.positionX = (i - 688089097 * class226.width - (class226.basePositionX * 183375671 * i >> 14)) * 1223155671;
		}
		if (class226.aByte2381 == 0) {
			class226.positionY = class226.basePositionY * 986926653;
		} else if (class226.aByte2381 == 1) {
			class226.positionY = -695394183
					* (1359139557 * class226.basePositionY + (i_1_ - 1362321717 * class226.height) / 2);
		} else if (class226.aByte2381 == 2) {
			class226.positionY = (i_1_ - 1362321717 * class226.height - class226.basePositionY * 1359139557)
					* -695394183;
		} else if (3 == class226.aByte2381) {
			class226.positionY = (1359139557 * class226.basePositionY * i_1_ >> 14) * -695394183;
		} else if (class226.aByte2381 == 4) {
			class226.positionY = -695394183
					* ((i_1_ - 1362321717 * class226.height) / 2 + (1359139557 * class226.basePositionY * i_1_ >> 14));
		} else {
			class226.positionY = (i_1_ - class226.height * 1362321717 - (class226.basePositionY * 1359139557 * i_1_ >> 14))
					* -695394183;
		}
		if (Client.aBool10603
				&& (Client.method17050(class226).anInt10100 * -528482985 != 0 || class226.type * 1558474223 == 0)) {
			if (class226.positionX * -346651673 < 0) {
				class226.positionX = 0;
			} else if (-346651673 * class226.positionX + 688089097 * class226.width > i) {
				class226.positionX = (i - class226.width * 688089097) * 1223155671;
			}
			if (class226.positionY * -1901639223 < 0) {
				class226.positionY = 0;
			} else if (class226.height * 1362321717 + -1901639223 * class226.positionY > i_1_) {
				class226.positionY = -695394183 * (i_1_ - 1362321717 * class226.height);
			}
		}
	}

	int anInt2089;
	Class195 this$0;
	public static Class566 aClass566_9252;

	Class197(Class195 class195, Buffer buffer) {
		this$0 = class195;
		anInt2089 = buffer.readUShort() * 1796817849;
	}

	@Override
	public void method131(Class192 class192) {
		class192.method3833(97899145 * anInt2089);
		class192.method3806(anInt2089 * 97899145);
	}

}