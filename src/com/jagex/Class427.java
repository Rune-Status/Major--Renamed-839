package com.jagex;

public class Class427 {
	static Class427 aClass427_4873 = new Class427(3);
	static Class427 aClass427_4874 = new Class427(0);
	static Class427 aClass427_4875 = new Class427(6);
	static Class427 aClass427_4876 = new Class427(1);
	static Class427 aClass427_4877 = new Class427(5);
	static Class427 aClass427_4878 = new Class427(2);
	static Class427 aClass427_4879 = new Class427(4);

	public static int method7092(int i, int i_6_, boolean bool) {
		Class480_Sub1 class480_sub1 = Class606.method10252(i, bool);
		if (null == class480_sub1) {
			return 0;
		} else if (i_6_ < 0 || i_6_ >= class480_sub1.anIntArray9965.length) {
			return 0;
		}

		return class480_sub1.anIntArray9965[i_6_];
	}

	static void method7086(Widget class226, int i, int i_0_) {
		Class56.aClass226_636 = class226;
		Class56.anInt637 = i * -1357380675;
		Class56.anInt638 = i_0_ * 534298803;
	}

	static final void method7091(Widget[] class226s, int i) {
		for (Widget class226 : class226s) {
			if (null != class226) {
				if (0 == 1558474223 * class226.type) {
					if (class226.aClass226Array2521 != null) {
						method7091(class226.aClass226Array2521, i);
					}
					Class480_Sub41 class480_sub41 = (Class480_Sub41) Client.aClass667_10791
							.get(1857819631 * class226.id);
					if (class480_sub41 != null) {
						Widget.method15440(class480_sub41.anInt10372 * 1021060255, i);
					}
				}
				if (0 == i && class226.anObjectArray2366 != null) {
					ScriptContext class480_sub35 = new ScriptContext();
					class480_sub35.source = class226;
					class480_sub35.arguments = class226.anObjectArray2366;
					Script.execute(class480_sub35);
				}
				if (i == 1 && class226.anObjectArray2454 != null) {
					if (-592186295 * class226.component >= 0) {
						Widget class226_5_ = Widget.lookup(class226.id * 1857819631);
						if (null == class226_5_ || null == class226_5_.aClass226Array2542
								|| -592186295 * class226.component >= class226_5_.aClass226Array2542.length
								|| class226 != class226_5_.aClass226Array2542[-592186295 * class226.component]) {
							continue;
						}
					}
					ScriptContext class480_sub35 = new ScriptContext();
					class480_sub35.source = class226;
					class480_sub35.arguments = class226.anObjectArray2454;
					Script.execute(class480_sub35);
				}
			}
		}
	}

	int anInt4872;

	Class427(int i) {
		anInt4872 = i * -1756186431;
	}

}