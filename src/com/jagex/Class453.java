package com.jagex;

public class Class453 {
	public static Class678_Sub3 aClass678_Sub3_5096;
	public static Class558 aClass558_5097;

	static final void method7414(Widget class226, int i, int i_0_, ScriptExecutionContext class613) {
		if (null == class226.anIntArray2380) {
			if (i_0_ > 0) {
				class226.aByteArrayArray2549 = new byte[11][];
				class226.aByteArrayArray2467 = new byte[11][];
				class226.anIntArray2466 = new int[11];
				class226.anIntArray2488 = new int[11];
				class226.anIntArray2380 = new int[11];
			} else {
				return;
			}
		}
		class226.anIntArray2380[i] = i_0_;
		if (i_0_ > 0) {
			class226.aBool2414 = true;
		} else {
			class226.aBool2414 = false;
			for (int i_2_ = 0; i_2_ < class226.aByteArrayArray2549.length; i_2_++) {
				if (class226.aByteArrayArray2549[i_2_] != null || class226.anIntArray2380[i_2_] > 0) {
					class226.aBool2414 = true;
					break;
				}
			}
		}
	}

	Buffer buffer;
	Class459 this$0;
	int anInt5093 = 582654239;
	int anInt5094 = -1499312893;
	boolean aBool5095;

	Class453(Class459 class459, Buffer buffer, boolean bool) {
		this$0 = class459;
		this.buffer = buffer;
		aBool5095 = bool;
	}

	void method7413() {
		if (buffer != null && false == aBool5095) {
			buffer.cache();
		}

		anInt5093 = 582654239;
		anInt5094 = -1499312893;
	}

}