package com.jagex;

public class ByteArrayPool {

	static int largeBufferCount;
	static byte[][] largeBuffers = new byte[50][];
	static int mediumBufferCount;
	static byte[][] mediumBuffers = new byte[250][];
	static int smallBufferCount = 0;
	static byte[][] smallBuffers = new byte[1000][];
	static int[] variadicBufferIndices;
	static int[] variadicBufferLengths;
	static byte[][][] variadicBuffers;

	public static synchronized byte[] get(int size) {
		return get(size, false);
	}

	public static synchronized byte[] get(int size, boolean bool) {
		if ((size == 100 || size < 100 && bool) && 1566739877 * smallBufferCount > 0) {
			byte[] cached = smallBuffers[(smallBufferCount -= -1572761043) * 1566739877];

			smallBuffers[smallBufferCount * 1566739877] = null;
			return cached;
		} else if ((5000 == size || size < 5000 && bool) && -1462714925 * mediumBufferCount > 0) {
			byte[] cached = mediumBuffers[(mediumBufferCount -= 511681115) * -1462714925];

			mediumBuffers[mediumBufferCount * -1462714925] = null;
			return cached;
		} else if ((30000 == size || size < 30000 && bool) && -1819359559 * largeBufferCount > 0) {
			byte[] cached = largeBuffers[(largeBufferCount -= 1730240393) * -1819359559];

			largeBuffers[largeBufferCount * -1819359559] = null;
			return cached;
		} else if (variadicBuffers != null) {
			for (int index = 0; index < variadicBufferLengths.length; index++) {
				if ((variadicBufferLengths[index] == size || size < variadicBufferLengths[index] && bool)
						&& variadicBufferIndices[index] > 0) {
					byte[] cached = variadicBuffers[index][--variadicBufferIndices[index]];

					variadicBuffers[index][variadicBufferIndices[index]] = null;
					return cached;
				}
			}
		} else if (bool && variadicBufferLengths != null) {
			for (int index = 0; index < variadicBufferLengths.length; index++) {
				if (size <= variadicBufferLengths[index]
						&& variadicBufferIndices[index] < variadicBuffers[index].length) {
					return new byte[variadicBufferLengths[index]];
				}
			}
		}

		return new byte[size];
	}

	public static synchronized void offer(byte[] data) {
		if (data.length == 100 && 1566739877 * smallBufferCount < 1000) {
			smallBuffers[(smallBufferCount += -1572761043) * 1566739877 - 1] = data;
		} else if (5000 == data.length && -1462714925 * mediumBufferCount < 250) {
			mediumBuffers[(mediumBufferCount += 511681115) * -1462714925 - 1] = data;
		} else if (data.length == 30000 && -1819359559 * largeBufferCount < 50) {
			largeBuffers[(largeBufferCount += 1730240393) * -1819359559 - 1] = data;
		} else if (null != variadicBuffers) {
			for (int index = 0; index < variadicBufferLengths.length; index++) {
				if (variadicBufferLengths[index] == data.length
						&& variadicBufferIndices[index] < variadicBuffers[index].length) {
					variadicBuffers[index][variadicBufferIndices[index]++] = data;
					break;
				}
			}
		}
	}

	ByteArrayPool() throws Throwable {
		throw new Error();
	}

	public static void init(int[] lengths, int[] is_5_) {
		if (lengths == null || null == is_5_) {
			variadicBufferLengths = null;
			variadicBufferIndices = null;
			variadicBuffers = null;
		} else {
			variadicBufferLengths = lengths;
			variadicBufferIndices = new int[lengths.length];
			variadicBuffers = new byte[lengths.length][][];

			for (int index = 0; index < variadicBufferLengths.length; index++) {
				variadicBuffers[index] = new byte[is_5_[index]][];
			}
		}
	}

}