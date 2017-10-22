package com.jagex;

public class AnimationFrame {
	static final int anInt1730 = 1;
	static final int anInt1731 = 2;
	static final int anInt1749 = 2;
	static short[] bufferX = new short[500];
	static short[] bufferY = new short[500];
	static short[] bufferZ = new short[500];
	static byte[] flagsBuffer = new byte[500];
	static short[] indicesBuffer = new short[500];
	static short[] skipped = new short[500];

	boolean aBool1746 = false;
	AnimationFrameBase base = null;
	boolean modifiesAlpha = false;
	boolean modifiesColour = false;
	short[] skippedReferences;
	int transformationCount = 0;
	byte[] transformationFlags;
	short[] transformationIndices;
	short[] transformationX;
	short[] transformationY;
	short[] transformationZ;

	AnimationFrame(byte[] data, AnimationFrameBase base) {
		this.base = base;

		try {
			Buffer attributes = new Buffer(data);
			Buffer transformations = new Buffer(data);
			int version = attributes.readUByte();
			attributes.offset += -1778683038;
			int count = attributes.readUShort();
			int used = 0;
			int last = -1;
			int lastUsed = -1;
			transformations.offset = (attributes.offset * -165875887 + count) * 1258142129;

			for (int index = 0; index < count; index++) {
				int type = base.transformationTypes[index];
				if (type == 0) {
					last = index;
				}

				int attribute = attributes.readUByte();
				if (attribute > 0) {
					if (type == 0) {
						lastUsed = index;
					}

					indicesBuffer[used] = (short) index;
					short value = 0;
					if (type == 3 || type == 10) {
						value = (short) 128;
					}

					if (version >= 2 && type == 7) {
						if ((attribute & 0x1) != 0) {
							bufferX[used] = (short) transformations.readSmart();
							transformations.readSmart();
						} else {
							bufferX[used] = value;
						}

						if ((attribute & 0x2) != 0) {
							bufferY[used] = (short) transformations.readSmart();
							transformations.readSmart();
						} else {
							bufferY[used] = value;
						}

						if ((attribute & 0x4) != 0) {
							bufferZ[used] = (short) transformations.readSmart();
							transformations.readSmart();
						} else {
							bufferZ[used] = value;
						}
					} else {
						if ((attribute & 0x1) != 0) {
							bufferX[used] = (short) transformations.readSmart();
						} else {
							bufferX[used] = value;
						}

						if ((attribute & 0x2) != 0) {
							bufferY[used] = (short) transformations.readSmart();
						} else {
							bufferY[used] = value;
						}

						if ((attribute & 0x4) != 0) {
							bufferZ[used] = (short) transformations.readSmart();
						} else {
							bufferZ[used] = value;
						}
					}

					flagsBuffer[used] = (byte) (attribute >>> 3 & 0x3);
					if (type == 2 || type == 9) {
						bufferX[used] = (short) (bufferX[used] << 2 & 0x3fff);
						bufferY[used] = (short) (bufferY[used] << 2 & 0x3fff);
						bufferZ[used] = (short) (bufferZ[used] << 2 & 0x3fff);
					}

					skipped[used] = (short) -1;
					if (type == 1 || type == 2 || type == 3) {
						if (last > lastUsed) {
							skipped[used] = (short) last;
							lastUsed = last;
						}
					} else if (type == 5) {
						modifiesAlpha = true;
					} else if (type == 7) {
						modifiesColour = true;
					} else if (type == 9 || type == 10 || type == 8) {
						aBool1746 = true;
					}

					used++;
				}
			}

			if (transformations.offset * -165875887 != data.length) {
				throw new RuntimeException();
			}

			transformationCount = used;
			transformationIndices = new short[used];
			transformationX = new short[used];
			transformationY = new short[used];
			transformationZ = new short[used];
			skippedReferences = new short[used];
			transformationFlags = new byte[used];

			for (int index = 0; index < used; index++) {
				transformationIndices[index] = indicesBuffer[index];
				transformationX[index] = bufferX[index];
				transformationY[index] = bufferY[index];
				transformationZ[index] = bufferZ[index];
				skippedReferences[index] = skipped[index];
				transformationFlags[index] = flagsBuffer[index];
			}
		} catch (Exception exception) {
			transformationCount = 0;
			modifiesAlpha = false;
			modifiesColour = false;
		}
	}

}