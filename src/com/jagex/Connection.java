package com.jagex;

import java.io.IOException;

public abstract class Connection {
	public static int anInt7170;

	public abstract int available() throws IOException;

	public abstract boolean available(int amount) throws IOException;

	public abstract void write(byte[] buffer, int offset, int length) throws IOException;

	public abstract int read(byte[] buffer, int offset, int length) throws IOException;

	public abstract void stop();

	public abstract void close();

}