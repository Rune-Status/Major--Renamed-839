package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class608 {
	static Map aMap7907 = new HashMap();

	static int method10291(String string, byte[] is, int i) {
		int i_1_ = i;
		int i_2_ = string.length();
		for (int i_3_ = 0; i_3_ < i_2_; i_3_ += 4) {
			int i_4_ = Class361.method6061(string.charAt(i_3_));
			int i_5_ = i_3_ + 1 < i_2_ ? Class361.method6061(string.charAt(1 + i_3_)) : -1;
			int i_6_ = i_3_ + 2 < i_2_ ? Class361.method6061(string.charAt(2 + i_3_)) : -1;
			int i_7_ = i_3_ + 3 < i_2_ ? Class361.method6061(string.charAt(3 + i_3_)) : -1;
			is[i++] = (byte) (i_4_ << 2 | i_5_ >>> 4);
			if (i_6_ == -1) {
				break;
			}
			is[i++] = (byte) ((i_5_ & 0xf) << 4 | i_6_ >>> 2);
			if (i_7_ == -1) {
				break;
			}
			is[i++] = (byte) ((i_6_ & 0x3) << 6 | i_7_);
		}
		return i - i_1_;
	}

	static final void method10292(Widget class226, Interface class221, ScriptExecutionContext class613, short i) {
		int i_8_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_9_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (i_9_ >= 1 && i_9_ <= 10) {
			class226.method4236(i_9_ - 1, i_8_, -1695764395);
		}
	}

	Class608() throws Throwable {
		throw new Error();
	}

	public static Identifiable method15335(Class clazz, int i) {
		synchronized (aMap7907) {
			Map map = (Map) aMap7907.get(clazz);
			if (map == null) {
				map = new HashMap();
				Identifiable[] interface69s = (Identifiable[]) clazz.getEnumConstants();
				for (Identifiable interface69 : interface69s) {
					map.put(Integer.valueOf(interface69.getId()), interface69);
				}
				aMap7907.put(clazz, map);
			}

			return (Identifiable) map.get(Integer.valueOf(i));
		}
	}
}
