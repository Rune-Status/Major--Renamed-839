package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;

public class Class368 {
	public static final int anInt4050 = 839;
	public static final int anInt4051 = 1;
	static int anInt4052;
	static Sprite[] aClass116Array4053;

	public static String replaceChar(String original, char match, String replacement) {
		int length = original.length();
		int replacementLength = replacement.length() - 1;

		if (0 != replacementLength) {
			int start = 0;
			for (;;) {
				start = original.indexOf(match, start);
				if (start < 0) {
					break;
				}

				start++;
				length += replacementLength;
			}
		}

		StringBuilder builder = new StringBuilder(length);
		int last = 0;
		for (;;) {
			int index = original.indexOf(match, last);
			if (index < 0) {
				break;
			}

			builder.append(original.substring(last, index));
			builder.append(replacement);
			last = index + 1;
		}

		builder.append(original.substring(last));
		return builder.toString();
	}

	public static long method6101() {
		try {
			URL url = new URL(new StringBuilder().append(Class485.method8246("services", false))
					.append("m=accountappeal/login.ws").toString());
			URLConnection connection = url.openConnection();
			connection.setRequestProperty("connection", "close");
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setConnectTimeout(5000);

			OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
			writer.write("data1=req");
			writer.flush();

			InputStream in = connection.getInputStream();
			Buffer buffer = new Buffer(new byte[1000]);

			for (;;) {
				int read = in.read(buffer.payload, -165875887 * buffer.offset, 1000 - -165875887 * buffer.offset);
				if (read == -1) {
					break;
				}

				buffer.offset += read * 1258142129;
				if (buffer.offset * -165875887 >= 1000) {
					return 0L;
				}
			}

			buffer.offset = 0;
			return buffer.readLong();
		} catch (Exception exception) {
			return 0L;
		}
	}

	public static final void method6102(Class600_Sub1 class600_sub1, int i, boolean bool) {
		AnimationDefinition.method3522(class600_sub1, i, true, bool);
	}

	Class368() throws Throwable {
		throw new Error();
	}
}
