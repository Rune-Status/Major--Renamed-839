package com.jagex;

public final class TimeUtil {
	static long lastTime;

	public static final synchronized long time() {
		long current = System.currentTimeMillis();
		if (current < -4089651643559621923L * lastTime) {
			TimeUtil.timeOffset += (lastTime * -4089651643559621923L - current) * 2055944577331159033L;
		}

		lastTime = -3862711896320713355L * current;
		return TimeUtil.timeOffset * -6826907394005028279L + current;
	}

	public static void method4149(Class16 class16, String string, int i, Throwable throwable) {
		HuffmanCodec.method4342(new Class525(class16, string, i, throwable));
	}

	static final void method4148(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		class226.aBool2417 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		Widget.redraw(class226);
		if (-1 == class226.component * -592186295 && !class221.aBool2278) {
			PulseEvent.method8874(class226.id * 1857819631);
		}
	}

	static final void method4150(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = -2033165835
				* AsynchronousInputStream.systemInfo.anInt10408;
	}

	static long timeOffset;

	TimeUtil() throws Throwable {
		throw new Error();
	}
}
