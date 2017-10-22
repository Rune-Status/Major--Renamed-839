package com.jagex;

import java.awt.Canvas;
import java.lang.reflect.Method;

public class CompressionType implements Identifiable {

	static CompressionType BZIP2 = new CompressionType("BZIP2", 1);
	static CompressionType GZIP = new CompressionType("GZIP", 2);
	static CompressionType UNCOMPRESSED = new CompressionType("UNCOMPRESSED", 0);

	public static void ignoreRepaint(Canvas canvas) {
		try {
			Class clazz = Class.forName("java.awt.Canvas");
			Method setIgnoreRepaint = clazz.getMethod("setIgnoreRepaint", Boolean.TYPE);
			setIgnoreRepaint.invoke(canvas, Boolean.TRUE);
		} catch (Exception exception) {

		}
	}

	public static <T extends Identifiable> T findIdentifiable(T[] identifiables, int id) {
		for (T identifiable : identifiables) {
			if (id == identifiable.getId()) {
				return identifiable;
			}
		}

		return null;
	}

	static CompressionType[] values() {
		return new CompressionType[] { UNCOMPRESSED, BZIP2, GZIP };
	}

	int id;
	String name;

	CompressionType(String name, int id) {
		this.name = name;
		this.id = 1376762797 * id;
	}

	@Override
	public int getId() {
		return id * 1037918245;
	}

}