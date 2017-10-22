package com.jagex;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class AsynchronousStreamRequest {
	public static int anInt4532;

	public static boolean loggedOutState(int state) {
		return state == 0 || state == 12 || state == 18 || state == 15 || 6 == state || state == 2 || state == 1;
	}

	ParallelHttpProvider provider;
	byte[] payload;

	AsynchronousStreamRequest(ParallelHttpProvider provider, InputStream input, AsynchronousRequest request, URL url) {
		this.provider = provider;
		payload = null;

		if (input != null) {
			int size = 10240;
			Buffer buffer = new Buffer(size, true);
			int in = 0;
			byte[] bytes = ByteArrayPool.get(1024);

			while (in >= 0) {
				try {
					in = input.read(bytes);
				} catch (IOException ioexception) {
					ioexception.printStackTrace();
					in = -1;
				}

				if (in > 0) {
					if (-165875887 * buffer.offset + in >= buffer.payload.length) {
						int i_1_ = buffer.payload.length + 10240;
						byte[] tmp = ByteArrayPool.get(i_1_, true);
						System.arraycopy(buffer.payload, 0, tmp, 0, buffer.offset * -165875887);
						ByteArrayPool.offer(buffer.payload);
						buffer.payload = tmp;
					}
					buffer.writeBytes(bytes, 0, in);
				}
			}

			for (int padding = 0; padding < request.padding * -1208288435; padding++) {
				buffer.writeByte(0);
			}

			byte[] data = new byte[-165875887 * buffer.offset];
			System.arraycopy(buffer.payload, 0, data, 0, -165875887 * buffer.offset);
			buffer.cache();
			ByteArrayPool.offer(bytes);
			payload = data;

			try {
				input.close();
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
		}

		request.waiting = false;
		provider.decrementRemaining();
	}

	byte[] getData() {
		return payload;
	}

}