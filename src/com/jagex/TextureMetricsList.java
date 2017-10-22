package com.jagex;

public class TextureMetricsList {

	public static String javaVendor;
	static int anInt1822;

	public static boolean method3168(byte i) {
		int value = i & 0xff;
		if (value == 0) {
			return false;
		}

		return !(value >= 128 && value < 160 && Class612.UNICODE_TABLE[value - 128] == 0);
	}

	int count;
	TextureMetrics[] metrics;

	public TextureMetricsList(Archive archive) {
		count = archive.childSize(0) * -1341856061;
		metrics = new TextureMetrics[1090157035 * count];

		for (int id = 0; id < count * 1090157035; id++) {
			Buffer buffer = new Buffer(archive.get(0, id));
			if (buffer.payload == null) {
				metrics[id] = null;
			} else {
				try {
					TextureMetrics metric = new TextureMetrics();
					metric.decode(id, buffer);
					metrics[id] = metric;
				} catch (Exception exception) {
					metrics[id] = null;
				}
			}
		}
	}

	public TextureMetrics get(int id) {
		return metrics[id];
	}

}