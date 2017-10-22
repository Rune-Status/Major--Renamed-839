package com.jagex;

import java.io.InputStream;
import java.io.OutputStreamWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.Random;

public class CacheableEntity extends Entity {

	public static final int method15590(long serverSeed, String string) {
		Random random = new Random();
		Buffer header = new Buffer(128);
		Buffer buffer_1_ = new Buffer(128);

		int[] seed = new int[4];
		seed[0] = random.nextInt();
		seed[1] = random.nextInt();
		seed[2] = (int) (serverSeed >> 32);
		seed[3] = (int) serverSeed;

		header.writeByte(10);
		for (int i_2_ = 0; i_2_ < 4; i_2_++) {
			header.writeInt(random.nextInt());
		}

		header.writeInt(seed[0]);
		header.writeInt(seed[1]);
		header.writeLong(serverSeed);
		header.writeLong(0L);

		for (int count = 0; count < 4; count++) {
			header.writeInt(random.nextInt());
		}

		header.rsa(Class53.aBigInteger596, Class53.aBigInteger597);
		buffer_1_.writeByte(10);

		for (int count = 0; count < 3; count++) {
			buffer_1_.writeInt(random.nextInt());
		}

		buffer_1_.writeLong(random.nextLong());
		buffer_1_.write48(random.nextLong());
		Class326.readRandom(buffer_1_);
		buffer_1_.writeLong(random.nextLong());
		buffer_1_.rsa(Class53.aBigInteger596, Class53.aBigInteger597);

		int length = Buffer.encodedStringLength(string);
		if (0 != length % 8) {
			length += 8 - length % 8;
		}

		Buffer encrypted = new Buffer(length);
		encrypted.writeCString(string);
		encrypted.offset = 1258142129 * length;
		encrypted.encodeXtea(seed);
		Buffer buffer = new Buffer(-165875887 * header.offset + 5 + -165875887 * buffer_1_.offset + -165875887
				* encrypted.offset);

		buffer.writeByte(2);
		buffer.writeByte(-165875887 * header.offset);
		buffer.writeBytes(header.payload, 0, header.offset * -165875887);
		buffer.writeByte(buffer_1_.offset * -165875887);
		buffer.writeBytes(buffer_1_.payload, 0, -165875887 * buffer_1_.offset);
		buffer.writeShort(-165875887 * encrypted.offset);
		buffer.writeBytes(encrypted.payload, 0, encrypted.offset * -165875887);

		String data = Client.decodeBase64Url(buffer.payload);

		try {
			URL url = new URL(Class485.method8246("services", false) + "m=accountappeal/login.ws");
			URLConnection connection = url.openConnection();
			connection.setDoInput(true);
			connection.setDoOutput(true);
			connection.setConnectTimeout(5000);

			OutputStreamWriter writer = new OutputStreamWriter(connection.getOutputStream());
			writer.write("data2=" + SocketProvider.toUrlSafe(data) + "&dest="
					+ SocketProvider.toUrlSafe("passwordchoice.ws"));
			writer.flush();

			InputStream input = connection.getInputStream();
			buffer = new Buffer(new byte[1000]);
			for (;;) {
				int in = input.read(buffer.payload, -165875887 * buffer.offset, 1000 - -165875887 * buffer.offset);
				if (-1 == in) {
					break;
				}

				buffer.offset += 1258142129 * in;
				if (-165875887 * buffer.offset >= 1000) {
					return 5;
				}
			}

			writer.close();
			input.close();
			String response = new String(buffer.payload);

			if (response.startsWith("OFFLINE")) {
				return 4;
			} else if (response.startsWith("WRONG")) {
				return 7;
			} else if (response.startsWith("RELOAD")) {
				return 3;
			} else if (response.startsWith("Not permitted for social network accounts.")) {
				return 6;
			}

			buffer.decodeXtea(seed);
			for (; -165875887 * buffer.offset > 0 && 0 == buffer.payload[-165875887 * buffer.offset - 1]; buffer.offset -= 1258142129) {

			}

			response = new String(buffer.payload, 0, -165875887 * buffer.offset);
			if (Archive.validUrl(response)) {
				TranslatableString.openJsUrl(response, true, Client.useJs);
				return 2;
			}

			return 5;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			return 5;
		}
	}

	public CacheableEntity previousCacheable;
	public CacheableEntity nextCacheable;

	public void uncache() {
		if (previousCacheable != null) {
			previousCacheable.nextCacheable = nextCacheable;
			nextCacheable.previousCacheable = previousCacheable;
			nextCacheable = null;
			previousCacheable = null;
		}
	}

}