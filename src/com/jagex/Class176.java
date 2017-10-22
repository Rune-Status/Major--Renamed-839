package com.jagex;

import java.util.Calendar;

public class Class176 implements Definition, Interface71 {
	public static void addChatMessage(int type, int i_7_, String name, String string_8_, String string_9_,
			String message, Class351 class351) {
		JavaThreadResource.addChatMessage(type, i_7_, name, string_8_, string_9_, message, null, -1, class351);
	}

	static String method3527(long l, int i, boolean bool) {
		Calendar calendar;
		if (bool) {
			Class181.method3557(l);
			calendar = CalendarUtils.GMT_CALENDAR;
		} else {
			Class527.method8990(l);
			calendar = CalendarUtils.DEFAULT_CALENDAR;
		}
		int i_13_ = calendar.get(5);
		int i_14_ = calendar.get(2) + 1;
		int i_15_ = calendar.get(1);
		int i_16_ = calendar.get(11);
		int i_17_ = calendar.get(12);
		return new StringBuilder().append(Integer.toString(i_13_ / 10)).append(i_13_ % 10).append("/")
				.append(i_14_ / 10).append(i_14_ % 10).append("/").append(i_15_ % 100 / 10).append(i_15_ % 10)
				.append(" ").append(i_16_ / 10).append(i_16_ % 10).append(":").append(i_17_ / 10).append(i_17_ % 10)
				.toString();
	}

	public boolean[] aBoolArray1991;

	@Override
	public void method35() {

	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	@Override
	public void method40(int i) {

	}

	@Override
	public void setId(int id) {

	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 2) {
			aBoolArray1991 = new boolean[400];
			int count = buffer.readUSmart();

			for (int index = 0; index < count; index++) {
				aBoolArray1991[buffer.readUSmart()] = true;
			}
		} else if (3 == opcode) {
			buffer.readUByte();
			int count = buffer.readUSmart();

			for (int index = 0; index < count; index++) {
				buffer.readUSmart();
				buffer.readUByte();
			}
		}
	}

}