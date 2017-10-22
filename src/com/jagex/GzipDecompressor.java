package com.jagex;

import java.util.zip.Inflater;

public class GzipDecompressor {
	Inflater inflater;

	public GzipDecompressor() {
		this(-1, 1000000, 1000000);
	}

	GzipDecompressor(int i, int i_0_, int i_1_) {

	}

	public byte[] decompress(byte[] is) {
		Buffer buffer = new Buffer(is);
		buffer.offset = 1258142129 * (is.length - 4);
		int i_2_ = buffer.readLEInt();
		byte[] is_3_ = new byte[i_2_];
		buffer.offset = 0;
		decompress(buffer, is_3_);
		return is_3_;
	}

	public void decompress(Buffer buffer, byte[] is) {
		if (buffer.payload[buffer.offset * -165875887] != 31 || -117 != buffer.payload[1 + -165875887 * buffer.offset]) {
			throw new RuntimeException("");
		}
		if (inflater == null) {
			inflater = new Inflater(true);
		}
		try {
			inflater.setInput(buffer.payload, -165875887 * buffer.offset + 10, buffer.payload.length
					- (-165875887 * buffer.offset + 10 + 8));
			inflater.inflate(is);
		} catch (Exception exception) {
			inflater.reset();
			throw new RuntimeException("");
		}
		inflater.reset();
	}
}
