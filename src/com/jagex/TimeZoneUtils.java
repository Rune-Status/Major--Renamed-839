package com.jagex;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;

public final class TimeZoneUtils {
	public static final long aLong2175 = 60000L;
	public static final long aLong2177 = 1000L;
	static Map<Language, ConcurrentLinkedQueue<SimpleDateFormat>> formats;
	static HashMap<String, TimeZone> timeZones = new HashMap();

	static {
		Calendar.getInstance(getTimeZone("Europe/London"));
	}

	public static String format(Date date, String string) {
		return format(date, string, defaultTimeZone(), Language.ENGLISH);
	}

	public static int method4000(String string) {
		return string.length() + 2;
	}

	static TimeZone defaultTimeZone() {
		return getTimeZone("Europe/London");
	}

	static String format(Date date, String string, TimeZone zone, Language language) {
		if (null == formats) {
			formats = new HashMap(7);

			for (Language lang : Language.values()) {
				formats.put(lang, new ConcurrentLinkedQueue<SimpleDateFormat>());
			}
		}

		ConcurrentLinkedQueue<SimpleDateFormat> queue = formats.get(language);
		SimpleDateFormat format = queue.poll();
		if (format == null) {
			format = new SimpleDateFormat(string, language.getLocale());
		} else {
			format.applyPattern(string);
		}

		format.setTimeZone(zone);
		String time = format.format(date);
		queue.add(format);
		return time;
	}

	static TimeZone getTimeZone(String string) {
		synchronized (timeZones) {
			TimeZone zone = timeZones.get(string);
			if (zone == null) {
				zone = TimeZone.getTimeZone(string);
				timeZones.put(string, zone);
			}

			return zone;
		}
	}

	TimeZoneUtils() throws Throwable {
		throw new Error();
	}

}