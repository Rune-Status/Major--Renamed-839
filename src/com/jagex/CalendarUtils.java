package com.jagex;

import java.util.Calendar;
import java.util.TimeZone;

public class CalendarUtils {
	static String[][] MONTHS = {
			{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" },
			{ "Jan", "Feb", "M\u00e4r", "Apr", "Mai", "Jun", "Jul", "Aug", "Sep", "Okt", "Nov", "Dez" },
			{ "jan", "f\u00e9v", "mars", "avr", "mai", "juin", "juil", "ao\u00fbt", "sept", "oct", "nov", "d\u00e9c" },
			{ "jan", "fev", "mar", "abr", "mai", "jun", "jul", "ago", "set", "out", "nov", "dez" },
			{ "jan", "feb", "mrt", "apr", "mei", "jun", "jul", "aug", "sep", "okt", "nov", "dec" },
			{ "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" },
			{ "ene", "feb", "mar", "abr", "may", "jun", "jul", "ago", "sep", "oct", "nov", "dic" } };
	static Calendar DEFAULT_CALENDAR = Calendar.getInstance();
	static Calendar GMT_CALENDAR = Calendar.getInstance(TimeZone.getTimeZone("GMT"));

	public static final void method524(String string) {
		if (Class551.friendsChat != null) {
			BufferedConnectionContext connection = Client.getActiveConnection();
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3950, connection.encryptor);
			frame.payload.writeByte(Buffer.encodedStringLength(string));
			frame.payload.writeCString(string);
			connection.sendFrame(frame);
		}
	}

	CalendarUtils() throws Throwable {
		throw new Error();
	}

}