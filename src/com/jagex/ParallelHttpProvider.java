package com.jagex;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class ParallelHttpProvider {
	static final int anInt4903 = 10000;
	static final int anInt4907 = 2;
	static final int anInt4911 = 10000;
	static final int anInt4912 = 10;
	static final int anInt4913 = 60000;

	static final void method7169(ScriptExecutionContext class613, int i) {
		Class199.preferences.setValue(Class199.preferences.mobShadows,
				class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1 ? 1 : 0);
		Client.savePreferences();
		Client.sentPreferences = false;
	}

	static int method7170(Class562_Sub1 class562_sub1, Class562_Sub1 class562_sub1_8_, int i, boolean bool) {
		if (i == 1) {
			int i_10_ = class562_sub1.anInt7553 * -1320445881;
			int i_11_ = -1320445881 * class562_sub1_8_.anInt7553;
			if (!bool) {
				if (-1 == i_10_) {
					i_10_ = 2001;
				}
				if (i_11_ == -1) {
					i_11_ = 2001;
				}
			}
			return i_10_ - i_11_;
		}
		if (i == 2) {
			return VarpDefinition.method13983(class562_sub1.method16236(),
					class562_sub1_8_.method16236(), Client.currentLanguage);
		}
		if (3 == i) {
			if (class562_sub1.aString10366.equals("-")) {
				if (class562_sub1_8_.aString10366.equals("-")) {
					return 0;
				}
				return bool ? -1 : 1;
			}
			if (class562_sub1_8_.aString10366.equals("-")) {
				return bool ? 1 : -1;
			}
			return VarpDefinition.method13983(class562_sub1.aString10366, class562_sub1_8_.aString10366,
					Client.currentLanguage);
		}
		if (4 == i) {
			return class562_sub1.method9468(-877465065) ? class562_sub1_8_.method9468(-567506690) ? 0 : 1
					: class562_sub1_8_.method9468(-817015346) ? -1 : 0;
		}
		if (i == 5) {
			return class562_sub1.method9467(914280779) ? class562_sub1_8_.method9467(914280779) ? 0 : 1
					: class562_sub1_8_.method9467(914280779) ? -1 : 0;
		}
		if (i == 6) {
			return class562_sub1.method9466((byte) 0) ? class562_sub1_8_.method9466((byte) 0) ? 0 : 1
					: class562_sub1_8_.method9466((byte) 0) ? -1 : 0;
		}
		if (7 == i) {
			return class562_sub1.method9475((byte) 32) ? class562_sub1_8_.method9475((byte) 32) ? 0 : 1
					: class562_sub1_8_.method9475((byte) 32) ? -1 : 0;
		}
		if (8 == i) {
			int i_12_ = 1668853513 * class562_sub1.anInt10368;
			int i_13_ = 1668853513 * class562_sub1_8_.anInt10368;
			if (bool) {
				if (1000 == i_12_) {
					i_12_ = -1;
				}
				if (i_13_ == 1000) {
					i_13_ = -1;
				}
			} else {
				if (-1 == i_12_) {
					i_12_ = 1000;
				}
				if (-1 == i_13_) {
					i_13_ = 1000;
				}
			}
			return i_12_ - i_13_;
		}
		return class562_sub1.anInt10370 * -1741841871 - class562_sub1_8_.anInt10370 * -1741841871;
	}

	static final void method7171(ScriptExecutionContext class613, byte i) {
		int i_14_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Class125.method2261(i_14_, 593106085);
	}

	boolean enabled = false;
	long startTime;
	int game;
	ExecutorService executor = Executors.newFixedThreadPool(2);
	String host;
	int port;
	volatile int remaining = 0;

	public ParallelHttpProvider(String host, int port, int game) {
		this.host = host;
		this.port = port * -490651;
		this.game = -2128206705 * game;
	}

	public void setHost(String host, int port) {
		this.host = host;
		this.port = -490651 * port;
	}

	public void shutdown() {
		executor.shutdown();
	}

	void decrementRemaining() {
		remaining -= 1710256009;
	}

	void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	AsynchronousRequest request(int type, int file, byte padding, boolean highPriority, int checksum, int version) {
		if (type < 0 || file < 0) {
			throw new RuntimeException(type + "," + file);
		}

		if (unavailable()) {
			return null;
		}

		boolean isTable = 255 == type && file == 255;
		if (!enabled && !isTable) {
			return null;
		} else if (10000L + startTime * -4591049672868857647L >= TimeUtil.time()) {
			return null;
		}

		String string = isTable ? "&cb=" + TimeUtil.time() : "&c=" + checksum + "&v=" + version;

		URL url;
		try {
			url = new URL("http", host, port * 1189738093, "/ms?m=" + 1163295343 * game + "&a=" + type + "&g=" + file
					+ string);
		} catch (MalformedURLException ex) {
			return null;
		}

		AsynchronousRequest request = new AsynchronousRequest(padding);
		request.highPriority = highPriority;
		remaining += 1710256009;
		Future future = executor.submit(new AsynchronousHttpRequestCreator(this, url, request));
		request.setFuture(future);
		return request;
	}

	AsynchronousRequest requestReferenceTable() {
		return request(255, 255, (byte) 0, true, 0, 0);
	}

	boolean unavailable() {
		return 626308793 * remaining >= 10;
	}

}