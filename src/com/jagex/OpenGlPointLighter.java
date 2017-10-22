package com.jagex;

public class OpenGlPointLighter extends Linkable {
	OpenGlToolkit toolkit;
	OpenGlGround ground;
	PointLight light;
	int startZ;
	OpenGlArrayBufferPointer colourPointer;
	float[][] lightingZ;
	int endZ;
	int nextIndex;
	int indexCount;
	ElementArrayBuffer indices;
	ArrayBuffer anInterface11_10016;
	OpenGlArrayBufferPointer vertexPointer;
	int startX;
	int endX;
	float[][] lightingY;
	float[][] lightingX;
	Buffer indexData;
	FloatBuffer data;
	HashTable indexTable;

	OpenGlPointLighter(OpenGlToolkit toolkit, OpenGlGround ground, PointLight light, int[] is) {
		this.toolkit = toolkit;
		this.light = light;
		this.ground = ground;

		int halfExtent = light.getRange() - (ground.tileUnits * 1668096025 >> 1);
		startX = light.getX() - halfExtent >> ground.tileScale * -333236347;
		endX = light.getX() + halfExtent >> ground.tileScale * -333236347;
		startZ = light.getZ() - halfExtent >> ground.tileScale * -333236347;
		endZ = light.getZ() + halfExtent >> ground.tileScale * -333236347;

		int width = endX - startX + 1;
		int length = endZ - startZ + 1;

		lightingX = new float[width + 1][length + 1];
		lightingY = new float[width + 1][length + 1];
		lightingZ = new float[width + 1][length + 1];

		for (int dz = 0; dz <= length; dz++) {
			int z = dz + startZ;

			if (z > 0 && z < ground.length * 295124605 - 1) {
				for (int dx = 0; dx <= width; dx++) {
					int x = dx + startX;

					if (x > 0 && x < ground.width * 767658255 - 1) {
						int heightX = ground.getTileHeight(x + 1, z) - ground.getTileHeight(x - 1, z);
						int heightZ = ground.getTileHeight(x, z + 1) - ground.getTileHeight(x, z - 1);

						float magnitude = (float) (1.0 / Math.sqrt(heightX * heightX + 65536 + heightZ * heightZ));

						lightingX[dx][dz] = heightX * magnitude;
						lightingY[dx][dz] = -256.0F * magnitude;
						lightingZ[dx][dz] = heightZ * magnitude;
					}
				}
			}
		}

		int index = 0;
		for (int z = startZ; z <= endZ; z++) {
			if (z >= 0 && z < ground.length * 295124605) {
				for (int x = startX; x <= endX; x++) {
					if (x >= 0 && x < ground.width * 767658255) {
						int type = is[index];
						int[] colours = ground.tileColours[x][z];

						if (colours != null && type != 0) {
							if (type == 1) {
								for (int pixel = 0; pixel < colours.length; pixel += 3) {
									if (colours[pixel] != -1 && colours[pixel + 1] != -1 && colours[pixel + 2] != -1) {
										indexCount += 3;
									}
								}
							} else {
								indexCount += 3;
							}
						}
					}

					index++;
				}
			} else {
				index += endX - startX;
			}
		}

		if (indexCount > 0) {
			indexData = new Buffer(indexCount * 2);
			data = new FloatBuffer(indexCount * 16);
			indexTable = new HashTable(HashTable.nextPowerOfTwo(indexCount));
			int z = 0;
			index = 0;

			for (int dz = startZ; dz <= endZ; dz++) {
				if (dz >= 0 && dz < ground.length * 295124605) {
					int x = 0;

					for (int dx = startX; dx <= endX; dx++) {
						if (dx >= 0 && dx < ground.width * 767658255) {
							int type = is[index];
							int[] colours = ground.tileColours[dx][dz];

							if (colours != null && type != 0) {
								if (type == 1) {
									int[] offsetsX = ground.tileXOffsets[dx][dz];
									int[] offsetsZ = ground.tileZOffsets[dx][dz];
									int offset = 0;

									while (offset < colours.length) {
										if (colours[offset] != -1 && colours[offset + 1] != -1
												&& colours[offset + 2] != -1) {
											update(x, z, dx, dz, offsetsX[offset], offsetsZ[offset]);
											offset++;
											update(x, z, dx, dz, offsetsX[offset], offsetsZ[offset]);
											offset++;
											update(x, z, dx, dz, offsetsX[offset], offsetsZ[offset]);
											offset++;
										} else {
											offset += 3;
										}
									}
								} else if (type == 3) {
									update(x, z, dx, dz, 0, 0);
									update(x, z, dx, dz, ground.tileUnits * 1668096025, 0);
									update(x, z, dx, dz, 0, ground.tileUnits * 1668096025);
								} else if (type == 2) {
									update(x, z, dx, dz, ground.tileUnits * 1668096025, 0);
									update(x, z, dx, dz, ground.tileUnits * 1668096025, ground.tileUnits * 1668096025);
									update(x, z, dx, dz, 0, 0);
								} else if (type == 5) {
									update(x, z, dx, dz, ground.tileUnits * 1668096025, ground.tileUnits * 1668096025);
									update(x, z, dx, dz, 0, ground.tileUnits * 1668096025);
									update(x, z, dx, dz, ground.tileUnits * 1668096025, 0);
								} else if (type == 4) {
									update(x, z, dx, dz, 0, ground.tileUnits * 1668096025);
									update(x, z, dx, dz, 0, 0);
									update(x, z, dx, dz, ground.tileUnits * 1668096025, ground.tileUnits * 1668096025);
								}
							}
						}
						index++;
						x++;
					}
				} else {
					index += endX - startX;
				}
				z++;
			}

			indices = toolkit.createElementArrayBuffer(indexData.payload, indexData.offset * -165875887, false);
			anInterface11_10016 = toolkit.createArrayBuffer(16, data.payload, data.offset * -165875887, false);
			vertexPointer = new OpenGlArrayBufferPointer(anInterface11_10016, 5126, 3, 0);
			colourPointer = new OpenGlArrayBufferPointer(anInterface11_10016, 5121, 4, 12);
		} else {
			indices = null;
			anInterface11_10016 = null;
			vertexPointer = null;
			colourPointer = null;
		}

		data = null;
		indexData = null;
		indexTable = null;
		lightingZ = null;
		lightingY = null;
		lightingX = null;
	}

	void method15558(int dx, int dz, int offset, boolean[][] bools) {
		if (indices != null && startX <= dx + offset && endX >= dx - offset && startZ <= dz + offset
				&& endZ >= dz - offset) {
			for (int z = startZ; z <= endZ; z++) {
				for (int x = startX; x <= endX; x++) {
					int offsetX = x - dx;
					int offsetZ = z - dz;

					if (offsetX > -offset && offsetX < offset && offsetZ > -offset && offsetZ < offset
							&& bools[offsetX + offset][offsetZ + offset]) {
						toolkit.setTexEnvColour((int) (light.getIntensity() * 255.0F) << 24);
						toolkit.setPointers(vertexPointer, null, colourPointer, null);
						toolkit.drawElements(indices, 4, 0, indexCount);
						return;
					}
				}
			}
		}
	}

	void writeIndex(short index) {
		if (toolkit.bigEndian) {
			indexData.writeShort(index);
		} else {
			indexData.writeLEShort(index);
		}
	}

	void update(int lightIndexX, int lightIndexZ, int tileX, int tileZ, int dx, int dz) {
		long key = -1L;
		int x = dx + (tileX << ground.tileScale * -333236347);
		int z = dz + (tileZ << ground.tileScale * -333236347);
		int height = ground.averageHeight(x, z);

		if ((dx & 0x7f) == 0 || (dz & 0x7f) == 0) {
			key = (z & 0xffffL) << 16 | x & 0xffffL;
			LinkableShort linkable = (LinkableShort) indexTable.get(key);
			if (linkable != null) {
				writeIndex(linkable.value);
				return;
			}
		}

		short index = (short) nextIndex++;
		if (key != -1L) {
			indexTable.put(key, new LinkableShort(index));
		}

		float lightX;
		float lightY;
		float lightZ;

		if (dx == 0 && dz == 0) {
			lightX = lightingX[lightIndexX][lightIndexZ];
			lightY = lightingY[lightIndexX][lightIndexZ];
			lightZ = lightingZ[lightIndexX][lightIndexZ];
		} else if (dx == ground.tileUnits * 1668096025 && dz == 0) {
			lightX = lightingX[lightIndexX + 1][lightIndexZ];
			lightY = lightingY[lightIndexX + 1][lightIndexZ];
			lightZ = lightingZ[lightIndexX + 1][lightIndexZ];
		} else if (dx == ground.tileUnits * 1668096025 && dz == ground.tileUnits * 1668096025) {
			lightX = lightingX[lightIndexX + 1][lightIndexZ + 1];
			lightY = lightingY[lightIndexX + 1][lightIndexZ + 1];
			lightZ = lightingZ[lightIndexX + 1][lightIndexZ + 1];
		} else if (dx == 0 && dz == ground.tileUnits * 1668096025) {
			lightX = lightingX[lightIndexX][lightIndexZ + 1];
			lightY = lightingY[lightIndexX][lightIndexZ + 1];
			lightZ = lightingZ[lightIndexX][lightIndexZ + 1];
		} else {
			float f_17_ = (float) dx / (float) (ground.tileUnits * 1668096025);
			float f_18_ = (float) dz / (float) (ground.tileUnits * 1668096025);

			float f_19_ = lightingX[lightIndexX][lightIndexZ];
			float f_20_ = lightingY[lightIndexX][lightIndexZ];
			float f_21_ = lightingZ[lightIndexX][lightIndexZ];

			float f_22_ = lightingX[lightIndexX + 1][lightIndexZ];
			float f_23_ = lightingY[lightIndexX + 1][lightIndexZ];
			float f_24_ = lightingZ[lightIndexX + 1][lightIndexZ];

			f_19_ += (lightingX[lightIndexX][lightIndexZ + 1] - f_19_) * f_17_;
			f_20_ += (lightingY[lightIndexX][lightIndexZ + 1] - f_20_) * f_17_;
			f_21_ += (lightingZ[lightIndexX][lightIndexZ + 1] - f_21_) * f_17_;

			f_22_ += (lightingX[lightIndexX + 1][lightIndexZ + 1] - f_22_) * f_17_;
			f_23_ += (lightingY[lightIndexX + 1][lightIndexZ + 1] - f_23_) * f_17_;
			f_24_ += (lightingZ[lightIndexX + 1][lightIndexZ + 1] - f_24_) * f_17_;

			lightX = f_19_ + (f_22_ - f_19_) * f_18_;
			lightY = f_20_ + (f_23_ - f_20_) * f_18_;
			lightZ = f_21_ + (f_24_ - f_21_) * f_18_;
		}

		float f_25_ = light.getX() - x;
		float f_26_ = light.getY() - height;
		float f_27_ = light.getZ() - z;
		float f_28_ = (float) Math.sqrt(f_25_ * f_25_ + f_26_ * f_26_ + f_27_ * f_27_);
		float f_29_ = 1.0F / f_28_;
		f_25_ *= f_29_;
		f_26_ *= f_29_;
		f_27_ *= f_29_;
		float f_30_ = f_28_ / light.getRange();
		float f_31_ = 1.0F - f_30_ * f_30_;
		if (f_31_ < 0.0F) {
			f_31_ = 0.0F;
		}
		float f_32_ = f_25_ * lightX + f_26_ * lightY + f_27_ * lightZ;
		if (f_32_ < 0.0F) {
			f_32_ = 0.0F;
		}
		float intensity = f_32_ * f_31_ * 2.0F;
		if (intensity > 1.0F) {
			intensity = 1.0F;
		}
		int colour = light.getColour();
		int red = (int) (intensity * (colour >> 16 & 0xff));
		if (red > 255) {
			red = 255;
		}
		int green = (int) (intensity * (colour >> 8 & 0xff));
		if (green > 255) {
			green = 255;
		}
		int blue = (int) (intensity * (colour & 0xff));
		if (blue > 255) {
			blue = 255;
		}

		if (toolkit.bigEndian) {
			data.writeFloat(x);
			data.writeFloat(height);
			data.writeFloat(z);
		} else {
			data.writeLEFloat(x);
			data.writeLEFloat(height);
			data.writeLEFloat(z);
		}

		data.writeByte(red);
		data.writeByte(green);
		data.writeByte(blue);
		data.writeByte(255);
		writeIndex(index);
	}

}