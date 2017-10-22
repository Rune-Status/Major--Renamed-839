package com.jagex;

public final class Class587 {
	static final void method9893(ScriptExecutionContext class613, int i) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		Interface class221 = Class598.loadedInterfaces[i_0_ >> 16];
		class226.anInt2418 = -1025291226;
		class226.aClass267_2361 = null;
		class226.anInt2486 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] * 1265546033;
		if (-592186295 * class226.component == -1 && !class221.aBool2278) {
			PulseEvent.method7175(1857819631 * class226.id);
		}
	}

	static final void method9894(ScriptExecutionContext class613, int i) {
		ScriptExecutionContext.method15098(class613);
	}

	static final void method9895(ScriptExecutionContext class613, Mob class600_sub1_sub3_sub1, byte i) {
		class613.anInt7924 -= 195773364;
		int i_1_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_2_ = class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		int i_3_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 2];
		boolean bool = class613.anIntArray7942[3 + class613.anInt7924 * 1841827045] == 1;
		if (Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2855) {
			throw new RuntimeException();
		}
		Class642_Sub3 class642_sub3 = (Class642_Sub3) Class369.aClass261_Sub1_4079.method4834();
		if (class600_sub1_sub3_sub1 != null) {
			class642_sub3.method16719(class600_sub1_sub3_sub1, new Class397(i_1_, i_2_, i_3_), bool, (byte) 66);
		}
		Client.aBool10611 = true;
	}

	public volatile int anInt7774 = -1943359943;

	volatile String aString7775;

	Class587(String string) {
		aString7775 = string;
	}
}
