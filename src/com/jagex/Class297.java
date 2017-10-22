package com.jagex;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Calendar;

public class Class297 implements Runnable {
	public static String method5441(long l, int i, boolean bool, int i_7_) {
		Calendar calendar;
		if (bool) {
			Class181.method3557(l);
			calendar = CalendarUtils.GMT_CALENDAR;
		} else {
			Class527.method8990(l);
			calendar = CalendarUtils.DEFAULT_CALENDAR;
		}

		int i_8_ = calendar.get(5);
		int i_9_ = calendar.get(2);
		int i_10_ = calendar.get(1);
		int i_11_ = calendar.get(11);
		int i_12_ = calendar.get(12);
		if (3 == i) {
			return Class176.method3527(l, i, bool);
		}

		return new StringBuilder().append(Integer.toString(i_8_ / 10)).append(i_8_ % 10).append("-")
				.append(CalendarUtils.MONTHS[i][i_9_]).append("-").append(i_10_).append(" ").append(i_11_ / 10)
				.append(i_11_ % 10).append(":").append(i_12_ / 10).append(i_12_ % 10).toString();
	}

	Class292[] aClass292Array3276;
	Thread thread;
	volatile boolean finished;

	@Override
	public void run() {
		try {
			int port = Class622.aClass622_8012 == ArchiveLoader.aClass622_4521 ? 80 : 7000 + Class671.aClass672_8462.id
					* -1113605561;
			BufferedReader reader = new BufferedReader(new InputStreamReader(new DataInputStream(
					new URL("http://" + Class671.aClass672_8462.host + ":" + port + "/news.ws?game="
							+ (Client.game.id * -1589762327)).openStream())));

			String response = reader.readLine();
			ArrayList<String> list = new ArrayList<String>();
			for (; null != response; response = reader.readLine()) {
				list.add(response);
			}

			String[] strings = new String[list.size()];
			list.toArray(strings);
			if (strings.length % 3 != 0) {
				return;
			}

			aClass292Array3276 = new Class292[strings.length / 3];
			for (int index = 0; index < strings.length; index += 3) {
				aClass292Array3276[index / 3] = new Class292(strings[index], strings[index + 1], strings[2 + index]);
			}
		} catch (IOException ioexception) {

		}

		finished = true;
	}

	boolean start() {
		if (finished) {
			return true;
		}

		if (thread == null) {
			thread = new Thread(this);
			thread.start();
		}

		return finished;
	}

	Class292 method5433(int i) {
		if (aClass292Array3276 == null || i < 0 || i >= aClass292Array3276.length) {
			return null;
		}

		return aClass292Array3276[i];
	}

}