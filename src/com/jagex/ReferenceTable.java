package com.jagex;

public class ReferenceTable {
	static final int anInt4633 = 7;

	public static final int method6964(int i, int i_40_, int i_41_, short i_42_) {
		if (i_41_ > 243) {
			i_40_ >>= 4;
		} else if (i_41_ > 217) {
			i_40_ >>= 3;
		} else if (i_41_ > 192) {
			i_40_ >>= 2;
		} else if (i_41_ > 179) {
			i_40_ >>= 1;
		}
		return (i_40_ >> 5 << 7) + ((i & 0xff) >> 2 << 10) + (i_41_ >> 1);
	}

	static void method6962(int i) {
		UnderlayDefinitionLoader.anInt10585 = -1617722877 * i;
		Class75.aClass168_1125.clear();
	}

	static void method6963(ScriptExecutionContext class613, byte i) {
		class613.anIntArray7942[class613.anInt7924 * 1841827045 - 2] = QuestDefinition.loader
				.get(class613.anIntArray7942[class613.anInt7924 * 1841827045 - 2]).anIntArrayArray2607[class613.anIntArray7942[class613.anInt7924 * 1841827045 - 1]][0];
		class613.anInt7924 -= 1122685165;
	}

	int[] anIntArray4624;
	int[] anIntArray4626;
	int[] anIntArray4630;
	int checksum;
	int[] childCounts;
	int[][] childIndices;
	int[][] childNames;
	LookupTable[] children;
	int[] childSizes;
	byte[] digest;
	LookupTable entries;
	int entryCount;
	int[] entryCrcs;
	byte[][] entryHashes;
	int[] entryIndices;
	int[] entryNames;
	int entrySize;
	int[] entryVersions;
	int version;

	ReferenceTable(byte[] data, int expectedChecksum, byte[] hash) {
		checksum = BufferedFile.crc32(data, data.length) * -169223875;
		if (expectedChecksum != checksum * -239286763) {
			throw new RuntimeException();
		}

		if (null != hash) {
			if (64 != hash.length) {
				throw new RuntimeException();
			}

			digest = Class24.whirlpool(data, 0, data.length);
			for (int index = 0; index < 64; index++) {
				if (digest[index] != hash[index]) {
					throw new RuntimeException();
				}
			}
		}

		decode(data);
	}

	void decode(byte[] data) {
		Buffer buffer = new Buffer(ReferenceTable.decodeContainer(data));
		int format = buffer.readUByte();
		if (format < 5 || format > 7) {
			throw new RuntimeException();
		}

		version = (format >= 6) ? buffer.readInt() * 546140195 : 0;

		int attributes = buffer.readUByte();
		boolean named = (attributes & 0x1) != 0;
		boolean hashed = (attributes & 0x2) != 0;
		boolean bool_5_ = (attributes & 0x4) != 0;
		boolean bool_6_ = (attributes & 0x8) != 0;

		entryCount = (format >= 7) ? buffer.readLargeSmart() * -1624621671 : buffer.readUShort() * -1624621671;

		int offset = 0;
		int max = -1;
		entryIndices = new int[entryCount * -824064343];

		if (format >= 7) {
			for (int entry = 0; entry < entryCount * -824064343; entry++) {
				entryIndices[entry] = offset += buffer.readLargeSmart();
				if (entryIndices[entry] > max) {
					max = entryIndices[entry];
				}
			}
		} else {
			for (int entry = 0; entry < -824064343 * entryCount; entry++) {
				entryIndices[entry] = offset += buffer.readUShort();
				if (entryIndices[entry] > max) {
					max = entryIndices[entry];
				}
			}
		}

		entrySize = -786869485 * (max + 1);
		entryCrcs = new int[entrySize * 1448439579];

		if (bool_6_) {
			anIntArray4626 = new int[1448439579 * entrySize];
		}

		if (hashed) {
			entryHashes = new byte[entrySize * 1448439579][];
		}

		entryVersions = new int[entrySize * 1448439579];
		childCounts = new int[entrySize * 1448439579];
		childIndices = new int[1448439579 * entrySize][];
		childSizes = new int[1448439579 * entrySize];

		if (named) {
			entryNames = new int[entrySize * 1448439579];
			for (int index = 0; index < entrySize * 1448439579; index++) {
				entryNames[index] = -1;
			}

			for (int index = 0; index < entryCount * -824064343; index++) {
				entryNames[entryIndices[index]] = buffer.readInt();
			}
			entries = new LookupTable(entryNames);
		}

		for (int index = 0; index < entryCount * -824064343; index++) {
			entryCrcs[entryIndices[index]] = buffer.readInt();
		}

		if (bool_6_) {
			for (int index = 0; index < -824064343 * entryCount; index++) {
				anIntArray4626[index] = buffer.readInt();
			}
		}

		if (hashed) {
			for (int index = 0; index < entryCount * -824064343; index++) {
				byte[] hash = new byte[64];
				buffer.readBytes(hash, 0, 64);
				entryHashes[entryIndices[index]] = hash;
			}
		}

		if (bool_5_) {
			anIntArray4624 = new int[1448439579 * entrySize];
			anIntArray4630 = new int[entrySize * 1448439579];
			for (int index = 0; index < -824064343 * entryCount; index++) {
				anIntArray4624[entryIndices[index]] = buffer.readInt();
				anIntArray4630[entryIndices[index]] = buffer.readInt();
			}
		}

		for (int index = 0; index < -824064343 * entryCount; index++) {
			entryVersions[entryIndices[index]] = buffer.readInt();
		}

		if (format >= 7) {
			for (int index = 0; index < -824064343 * entryCount; index++) {
				childCounts[entryIndices[index]] = buffer.readLargeSmart();
			}

			for (int entry = 0; entry < -824064343 * entryCount; entry++) {
				int entryIndex = entryIndices[entry];
				int count = childCounts[entryIndex];
				offset = 0;
				int maxIndex = -1;
				childIndices[entryIndex] = new int[count];

				for (int index = 0; index < count; index++) {
					int child = childIndices[entryIndex][index] = offset += buffer.readLargeSmart();
					if (child > maxIndex) {
						maxIndex = child;
					}
				}

				childSizes[entryIndex] = maxIndex + 1;
				if (1 + maxIndex == count) {
					childIndices[entryIndex] = null;
				}
			}
		} else {
			for (int index = 0; index < -824064343 * entryCount; index++) {
				childCounts[entryIndices[index]] = buffer.readUShort();
			}

			for (int entry = 0; entry < entryCount * -824064343; entry++) {
				int entryIndex = entryIndices[entry];
				int count = childCounts[entryIndex];
				offset = 0;
				int maxIndex = -1;
				childIndices[entryIndex] = new int[count];

				for (int child = 0; child < count; child++) {
					int index = childIndices[entryIndex][child] = offset += buffer.readUShort();
					if (index > maxIndex) {
						maxIndex = index;
					}
				}

				childSizes[entryIndex] = maxIndex + 1;
				if (1 + maxIndex == count) {
					childIndices[entryIndex] = null;
				}
			}
		}

		if (named) {
			childNames = new int[1 + max][];
			children = new LookupTable[max + 1];

			for (int entry = 0; entry < entryCount * -824064343; entry++) {
				int entryIndex = entryIndices[entry];
				int count = childCounts[entryIndex];
				childNames[entryIndex] = new int[childSizes[entryIndex]];

				for (int index = 0; index < childSizes[entryIndex]; index++) {
					childNames[entryIndex][index] = -1;
				}

				for (int index = 0; index < count; index++) {
					int child;
					if (childIndices[entryIndex] != null) {
						child = childIndices[entryIndex][index];
					} else {
						child = index;
					}

					childNames[entryIndex][child] = buffer.readInt();
				}

				children[entryIndex] = new LookupTable(childNames[entryIndex]);
			}
		}
	}

	static final byte[] decodeContainer(byte[] data) {
		Buffer buffer = new Buffer(data);
		ContainerHeader header = new ContainerHeader(buffer);
		CompressionType type = header.compressionType();
		int compressed = header.compressedLength();

		if (compressed < 0 || Archive.maximumContainerSize * 906654859 != 0
				&& compressed > Archive.maximumContainerSize * 906654859) {
			throw new RuntimeException();
		}

		if (type == CompressionType.UNCOMPRESSED) {
			byte[] bytes = new byte[compressed];
			buffer.readBytes(bytes, 0, compressed);
			return bytes;
		}

		int length = header.decompressedLength();
		if (length < 0 || 906654859 * Archive.maximumContainerSize != 0
				&& length > Archive.maximumContainerSize * 906654859) {
			throw new RuntimeException();
		}

		byte[] decoded = new byte[length];
		if (type == CompressionType.BZIP2) {
			Bzip2Decompressor.decompress(decoded, length, data, compressed, 9);
		} else {
			synchronized (Archive.GZIP_DECOMPRESSOR) {
				Archive.GZIP_DECOMPRESSOR.decompress(buffer, decoded);
			}
		}

		return decoded;
	}

}