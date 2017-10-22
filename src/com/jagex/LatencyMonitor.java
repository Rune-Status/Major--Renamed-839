package com.jagex;

import jaclib.ping.Ping;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class LatencyMonitor implements Runnable {
	public static Sprite aClass116_552;
	public static String javaVersion;

	public static boolean isWindows() {
		return Class485.osName.startsWith("win");
	}

	public static int method1059(int i) {
		int i_3_ = 0;
		if (i < 0 || i >= 65536) {
			i >>>= 16;
			i_3_ += 16;
		}
		if (i >= 256) {
			i >>>= 8;
			i_3_ += 8;
		}
		if (i >= 16) {
			i >>>= 4;
			i_3_ += 4;
		}
		if (i >= 4) {
			i >>>= 2;
			i_3_ += 2;
		}
		if (i >= 1) {
			i >>>= 1;
			i_3_++;
		}
		return i_3_ + i;
	}

	static final void method1056(ScriptExecutionContext class613) {
		int i_0_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_0_);
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = class226.scrollHeight
				* -184691147;
	}

	static final void method1057(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		int i_1_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anObjectArray7918[(class613.anInt7929 += -1356601931) * 211787933 - 1] = new StringBuilder()
				.append(string).append(i_1_).toString();
	}

	String host;
	InetAddress address;
	volatile long latency = -2914134489188177619L;
	volatile boolean running = true;

	@Override
	public void run() {
		while (running) {
			ping();
		}
	}

	void ping() {
		if (address != null) {
			try {
				byte[] ip = address.getAddress();
				latency = Ping.ping(ip[0], ip[1], ip[2], ip[3], 10000L) * 2914134489188177619L;
			} catch (Throwable throwable) {

			}
		}

		Client.sleep(1000L);
	}

	void setHost(String host) {
		this.host = host;
		address = null;
		latency = -2914134489188177619L;

		if (null != host) {
			try {
				address = InetAddress.getByName(host);
			} catch (UnknownHostException ex) {
			}
		}
	}

	long getLatency() {
		return latency * -7128845480199573157L;
	}

	void stop() {
		running = false;
	}

}