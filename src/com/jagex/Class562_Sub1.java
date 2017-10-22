package com.jagex;

public class Class562_Sub1 extends Class562 {
	static final Object[] method16248(String string, ScriptExecutionContext class613) {
		Object[] objects = new Object[string.length() + 1];
		for (int i_0_ = objects.length - 1; i_0_ >= 1; i_0_--) {
			if (string.charAt(i_0_ - 1) == 's') {
				objects[i_0_] = class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
			} else if (string.charAt(i_0_ - 1) == 'l') {
				objects[i_0_] = new Long(class613.aLongArray7934[(class613.anInt7928 -= 423292651) * -47101501]);
			} else {
				objects[i_0_] = new Integer(class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045]);
			}
		}
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (-1 != i_1_) {
			objects[0] = new Integer(i_1_);
		} else {
			objects = null;
		}
		return objects;
	}

	public String aString10365;
	public String aString10366;
	String aString10367;
	public int anInt10368 = 649883847;
	int anInt10369;

	public int anInt10370;

	Class562_Sub1() {

	}

	public String method16236() {
		if (1124271573 * anInt10369 != 0) {
			return aString10367;
		}
		return method16245((byte) 91).aString7738;
	}

	public int method16238() {
		if (1124271573 * anInt10369 != 0) {
			return 1124271573 * anInt10369;
		}
		return method16245((byte) 38).anInt7739 * -1489454561;
	}

	Class578 method16245(byte i) {
		return Class367.aClass578Array4049[-604159251 * anInt7555];
	}
}
