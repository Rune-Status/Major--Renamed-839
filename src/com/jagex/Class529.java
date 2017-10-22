package com.jagex;

import java.util.LinkedList;

public class Class529 {
	static LinkedList<Encodeable> aLinkedList7226 = new LinkedList<Encodeable>();

	public static boolean method9019(byte[] data) {
		Buffer buffer = new Buffer(data);
		int i_3_ = buffer.readUByte();
		if (2 != i_3_) {
			return false;
		}

		boolean bool = buffer.readUByte() == 1;
		if (bool) {
			Class462.method7851(buffer);
		}

		Class349.method5956(buffer);
		return true;
	}

	Class529() throws Throwable {
		throw new Error();
	}

}