package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class OpenGlGround extends Ground {
	static final int anInt8647 = 1;
	static final int anInt8650 = 74;
	static float[] GROUND_MATRIX = new float[16];
	OpenGlArrayBufferPointer vertexPointer;
	short[][] materialIndices;
	OpenGlToolkit toolkit;
	OpenGlArrayBufferPointer texturePointer;
	int quartertileUnits;
	int flags;
	float[][] lightingY;
	int anInt8651;
	OpenGlTileMaterial[][][] materials;
	int[][][] tileColours;
	int[][][] tileBlendColours;
	int[][][] tileXOffsets;
	int[][][] tileZOffsets;
	int[][][] anIntArrayArrayArray8657;
	int[][][] anIntArrayArrayArray8658;
	int anInt8659;
	Class91 aClass91_8660;
	Deque lighters = new Deque();
	Linkable[] groundMaterials;
	int quarterTileScale;
	ArrayBuffer data;
	byte[][] shadowing;
	OpenGlArrayBufferPointer normalPointer;
	float[][] lightingZ;
	int vertices;
	int maximumVertices;
	int anInt8670;
	float[][] lightingX;
	OpenGlArrayBufferPointer colourPointer;
	byte[][] shadowFlags;
	HashTable materialTable;

	OpenGlGround(OpenGlToolkit toolkit, int i, int flags, int width, int length, int[][] heights, int[][] lighting,
			int units) {
		super(width, length, units, heights);
		this.toolkit = toolkit;
		quarterTileScale = tileScale * -333236347 - 2;
		quartertileUnits = 1 << quarterTileScale;
		anInt8670 = i;
		this.flags = flags;

		anIntArrayArrayArray8657 = new int[width][length][];
		materials = new OpenGlTileMaterial[width][length][];
		tileXOffsets = new int[width][length][];
		tileZOffsets = new int[width][length][];
		tileColours = new int[width][length][];
		tileBlendColours = new int[width][length][];
		materialIndices = new short[width * length][];

		shadowFlags = new byte[width][length];
		shadowing = new byte[width + 1][length + 1];

		lightingX = new float[this.width * 767658255 + 1][this.length * 295124605 + 1];
		lightingY = new float[this.width * 767658255 + 1][this.length * 295124605 + 1];
		lightingZ = new float[this.width * 767658255 + 1][this.length * 295124605 + 1];

		for (int z = 1; z < this.length * 295124605; z++) {
			for (int x = 1; x < this.width * 767658255; x++) {
				int dx = lighting[x + 1][z] - lighting[x - 1][z];
				int dz = lighting[x][z + 1] - lighting[x][z - 1];
				float distance = (float) (1.0 / Math.sqrt(dx * dx + 4 * units * units + dz * dz));

				lightingX[x][z] = dx * distance;
				lightingY[x][z] = -units * 2 * distance;
				lightingZ[x][z] = dz * distance;
			}
		}

		materialTable = new HashTable(128);
		if ((flags & 0x10) != 0) {
			aClass91_8660 = new Class91(toolkit, this);
		}
	}

	@Override
	public void finish() {
		if (vertices > 0) {
			byte[][] shadows = new byte[width * 767658255 + 1][length * 295124605 + 1];
			for (int x = 1; x < width * 767658255; x++) {
				for (int z = 1; z < length * 295124605; z++) {
					shadows[x][z] = (byte) ((shadowing[x - 1][z] >> 2) + (shadowing[x + 1][z] >> 3)
							+ (shadowing[x][z - 1] >> 2) + (shadowing[x][z + 1] >> 3) + (shadowing[x][z] >> 1));
				}
			}

			groundMaterials = new Linkable[materialTable.size()];
			materialTable.values(groundMaterials);
			for (Linkable element : groundMaterials) {
				((OpenGlTileMaterial) element).init(vertices);
			}

			int stride = 24;
			if (anIntArrayArrayArray8658 != null) {
				stride += 4;
			}
			if ((flags & 0x7) != 0) {
				stride += 12;
			}

			NativeHeapBuffer buffer = toolkit.heap.allocate(vertices * stride, false);
			Stream stream = new Stream(buffer);
			OpenGlTileMaterial[] active = new OpenGlTileMaterial[vertices];
			int size = Class593.priorPowerOf2(vertices / 4);
			if (size < 1) {
				size = 1;
			}

			HashTable table = new HashTable(size);
			OpenGlTileMaterial[] unqiue = new OpenGlTileMaterial[maximumVertices];

			for (int x = 0; x < width * 767658255; x++) {
				for (int z = 0; z < length * 295124605; z++) {
					if (tileColours[x][z] != null) {
						OpenGlTileMaterial[] tile = materials[x][z];
						int[] offsetsX = tileXOffsets[x][z];
						int[] offsetsZ = tileZOffsets[x][z];
						int[] blendColours = tileBlendColours[x][z];
						int[] colours = tileColours[x][z];

						int[] is_54_ = anIntArrayArrayArray8657 != null ? anIntArrayArrayArray8657[x][z] : null;
						int[] is_55_ = anIntArrayArrayArray8658 != null ? anIntArrayArrayArray8658[x][z] : null;

						if (blendColours == null) {
							blendColours = colours;
						}

						float lx = lightingX[x][z];
						float ly = lightingY[x][z];
						float lz = lightingZ[x][z];
						float nlx = lightingX[x][z + 1];
						float nly = lightingY[x][z + 1];
						float nlz = lightingZ[x][z + 1];
						float nelx = lightingX[x + 1][z + 1];
						float nely = lightingY[x + 1][z + 1];
						float nelz = lightingZ[x + 1][z + 1];
						float elx = lightingX[x + 1][z];
						float ely = lightingY[x + 1][z];
						float elz = lightingZ[x + 1][z];

						int s = shadows[x][z] & 0xff;
						int ns = shadows[x][z + 1] & 0xff;
						int nes = shadows[x + 1][z + 1] & 0xff;
						int es = shadows[x + 1][z] & 0xff;
						int count = 0;

						while_23_: for (int index = 0; index < colours.length; index++) {
							OpenGlTileMaterial material = tile[index];
							for (int u = 0; u < count; u++) {
								if (unqiue[u] == material) {
									continue while_23_;
								}
							}

							unqiue[count++] = material;
						}

						short[] indices = materialIndices[z * width * 767658255 + x] = new short[colours.length];
						for (int index = 0; index < colours.length; index++) {
							int vertexX = (x << tileScale * -333236347) + offsetsX[index];
							int vertexZ = (z << tileScale * -333236347) + offsetsZ[index];

							int quarterX = vertexX >> quarterTileScale;
							int quarterZ = vertexZ >> quarterTileScale;

							int colour = colours[index];
							int blend = blendColours[index];
							int i_82_ = is_54_ != null ? is_54_[index] : 0;

							long key = (long) blend << 48 | (long) colour << 32 | quarterX << 16 | quarterZ;
							int dx = offsetsX[index];
							int dz = offsetsZ[index];
							int i_85_ = 74;
							int litColour = 0;

							float intensity = 1.0F;
							float f_88_;
							float f_89_;
							float f_90_;

							if (dx == 0 && dz == 0) {
								f_88_ = lx;
								f_89_ = ly;
								f_90_ = lz;
								i_85_ -= s;
							} else if (dx == 0 && dz == tileUnits * 1668096025) {
								f_88_ = nlx;
								f_89_ = nly;
								f_90_ = nlz;
								i_85_ -= ns;
							} else if (dx == tileUnits * 1668096025 && dz == tileUnits * 1668096025) {
								f_88_ = nelx;
								f_89_ = nely;
								f_90_ = nelz;
								i_85_ -= nes;
							} else if (dx == tileUnits * 1668096025 && dz == 0) {
								f_88_ = elx;
								f_89_ = ely;
								f_90_ = elz;
								i_85_ -= es;
							} else {
								float displacementX = (float) dx / (float) (tileUnits * 1668096025);
								float displacementZ = (float) dz / (float) (tileUnits * 1668096025);
								float f_93_ = lx + (elx - lx) * displacementX;
								float f_94_ = ly + (ely - ly) * displacementX;
								float f_95_ = lz + (elz - lz) * displacementX;

								float f_96_ = nlx + (nelx - nlx) * displacementX;
								float f_97_ = nly + (nely - nly) * displacementX;
								float f_98_ = nlz + (nelz - nlz) * displacementX;

								f_88_ = f_93_ + (f_96_ - f_93_) * displacementZ;
								f_89_ = f_94_ + (f_97_ - f_94_) * displacementZ;
								f_90_ = f_95_ + (f_98_ - f_95_) * displacementZ;
								int i_99_ = s + ((es - s) * dx >> tileScale * -333236347);
								int i_100_ = ns + ((nes - ns) * dx >> tileScale * -333236347);
								i_85_ -= i_99_ + ((i_100_ - i_99_) * dz >> tileScale * -333236347);
							}
							if (colour != -1) {
								int lighting = (colour & 0x7f) * i_85_ >> 7;
								if (lighting < 2) {
									lighting = 2;
								} else if (lighting > 126) {
									lighting = 126;
								}

								litColour = Class598.HSL_TABLE[colour & 0xff80 | lighting];
								if ((flags & 0x7) == 0) {
									intensity = toolkit.sunDirection[0] * f_88_ + toolkit.sunDirection[1] * f_89_
											+ toolkit.sunDirection[2] * f_90_;
									intensity = toolkit.ambient + intensity
											* (intensity > 0.0F ? toolkit.sunIntensity : toolkit.aFloat8985);
								}
							}

							Linkable linkable = null;
							if ((vertexX & quartertileUnits - 1) == 0 && (vertexZ & quartertileUnits - 1) == 0) {
								linkable = table.get(key);
							}

							int i_102_;
							if (linkable == null) {
								int i_103_;
								if (blend != colour) {
									int i_104_ = (blend & 0x7f) * i_85_ >> 7;
									if (i_104_ < 2) {
										i_104_ = 2;
									} else if (i_104_ > 126) {
										i_104_ = 126;
									}

									i_103_ = Class598.HSL_TABLE[blend & 0xff80 | i_104_];
									if ((flags & 0x7) == 0) {
										float f_105_ = toolkit.sunDirection[0] * f_88_ + toolkit.sunDirection[1]
												* f_89_ + toolkit.sunDirection[2] * f_90_;
										f_105_ = toolkit.ambient + intensity
												* (intensity > 0.0F ? toolkit.sunIntensity : toolkit.aFloat8985);
										int i_106_ = i_103_ >> 16 & 0xff;
										int i_107_ = i_103_ >> 8 & 0xff;
										int i_108_ = i_103_ & 0xff;
										i_106_ *= f_105_;
										if (i_106_ < 0) {
											i_106_ = 0;
										} else if (i_106_ > 255) {
											i_106_ = 255;
										}
										i_107_ *= f_105_;
										if (i_107_ < 0) {
											i_107_ = 0;
										} else if (i_107_ > 255) {
											i_107_ = 255;
										}
										i_108_ *= f_105_;
										if (i_108_ < 0) {
											i_108_ = 0;
										} else if (i_108_ > 255) {
											i_108_ = 255;
										}
										i_103_ = i_106_ << 16 | i_107_ << 8 | i_108_;
									}
								} else {
									i_103_ = litColour;
								}
								if (toolkit.bigEndian) {
									stream.writeBEFloat(vertexX);
									stream.writeBEFloat(averageHeight(vertexX, vertexZ) + i_82_);
									stream.writeBEFloat(vertexZ);
									stream.writeByte((byte) (i_103_ >> 16));
									stream.writeByte((byte) (i_103_ >> 8));
									stream.writeByte((byte) i_103_);
									stream.writeByte(-1);
									stream.writeBEFloat(vertexX);
									stream.writeBEFloat(vertexZ);
									if (anIntArrayArrayArray8658 != null) {
										stream.writeBEFloat(is_55_ != null ? (float) (is_55_[index] - 1) : 0.0F);
									}
									if ((flags & 0x7) != 0) {
										stream.writeBEFloat(f_88_);
										stream.writeBEFloat(f_89_);
										stream.writeBEFloat(f_90_);
									}
								} else {
									stream.writeLEFloat(vertexX);
									stream.writeLEFloat(averageHeight(vertexX, vertexZ) + i_82_);
									stream.writeLEFloat(vertexZ);
									stream.writeByte((byte) (i_103_ >> 16));
									stream.writeByte((byte) (i_103_ >> 8));
									stream.writeByte((byte) i_103_);
									stream.writeByte(-1);
									stream.writeLEFloat(vertexX);
									stream.writeLEFloat(vertexZ);
									if (anIntArrayArrayArray8658 != null) {
										stream.writeLEFloat(is_55_ != null ? (float) (is_55_[index] - 1) : 0.0F);
									}
									if ((flags & 0x7) != 0) {
										stream.writeLEFloat(f_88_);
										stream.writeLEFloat(f_89_);
										stream.writeLEFloat(f_90_);
									}
								}
								i_102_ = anInt8659++;
								indices[index] = (short) i_102_;
								if (colour != -1) {
									active[i_102_] = tile[index];
								}
								table.put(key, new LinkableShort(indices[index]));
							} else {
								indices[index] = ((LinkableShort) linkable).value;
								i_102_ = indices[index] & 0xffff;
								if (colour != -1
										&& tile[index].linkedKey * -4821875126325281949L < active[i_102_].linkedKey
												* -4821875126325281949L) {
									active[i_102_] = tile[index];
								}
							}
							for (int i_109_ = 0; i_109_ < count; i_109_++) {
								unqiue[i_109_].colour(i_102_, litColour, i_85_, intensity);
							}
							anInt8651++;
						}
					}
				}
			}
			for (int i_110_ = 0; i_110_ < anInt8659; i_110_++) {
				OpenGlTileMaterial class480_sub8 = active[i_110_];
				if (class480_sub8 != null) {
					class480_sub8.activate(i_110_);
				}
			}
			for (int i_111_ = 0; i_111_ < width * 767658255; i_111_++) {
				for (int i_112_ = 0; i_112_ < length * 295124605; i_112_++) {
					short[] is_113_ = materialIndices[i_112_ * width * 767658255 + i_111_];
					if (is_113_ != null) {
						int i_114_ = 0;
						int i_115_ = 0;
						while (i_115_ < is_113_.length) {
							int i_116_ = is_113_[i_115_++] & 0xffff;
							int i_117_ = is_113_[i_115_++] & 0xffff;
							int i_118_ = is_113_[i_115_++] & 0xffff;
							OpenGlTileMaterial class480_sub8 = active[i_116_];
							OpenGlTileMaterial class480_sub8_119_ = active[i_117_];
							OpenGlTileMaterial class480_sub8_120_ = active[i_118_];
							OpenGlTileMaterial class480_sub8_121_ = null;
							if (class480_sub8 != null) {
								class480_sub8.flag(i_111_, i_112_, i_114_);
								class480_sub8_121_ = class480_sub8;
							}
							if (class480_sub8_119_ != null) {
								class480_sub8_119_.flag(i_111_, i_112_, i_114_);
								if (class480_sub8_121_ == null
										|| class480_sub8_119_.linkedKey * -4821875126325281949L < class480_sub8_121_.linkedKey
												* -4821875126325281949L) {
									class480_sub8_121_ = class480_sub8_119_;
								}
							}
							if (class480_sub8_120_ != null) {
								class480_sub8_120_.flag(i_111_, i_112_, i_114_);
								if (class480_sub8_121_ == null
										|| class480_sub8_120_.linkedKey * -4821875126325281949L < class480_sub8_121_.linkedKey
												* -4821875126325281949L) {
									class480_sub8_121_ = class480_sub8_120_;
								}
							}
							if (class480_sub8_121_ != null) {
								if (class480_sub8 != null) {
									class480_sub8_121_.activate(i_116_);
								}
								if (class480_sub8_119_ != null) {
									class480_sub8_121_.activate(i_117_);
								}
								if (class480_sub8_120_ != null) {
									class480_sub8_121_.activate(i_118_);
								}
								class480_sub8_121_.flag(i_111_, i_112_, i_114_);
							}
							i_114_++;
						}
					}
				}
			}
			stream.flush();
			data = toolkit.createArrayBuffer(buffer, stride, stream.written(), false);
			if (data instanceof OpenGlArrayBuffer) {
				buffer.deallocate();
			}
			vertexPointer = new OpenGlArrayBufferPointer(data, 5126, 3, 0);
			colourPointer = new OpenGlArrayBufferPointer(data, 5121, 4, 12);
			int i_122_;
			if (anIntArrayArrayArray8658 != null) {
				texturePointer = new OpenGlArrayBufferPointer(data, 5126, 3, 16);
				i_122_ = 28;
			} else {
				texturePointer = new OpenGlArrayBufferPointer(data, 5126, 2, 16);
				i_122_ = 24;
			}
			if ((flags & 0x7) != 0) {
				normalPointer = new OpenGlArrayBufferPointer(data, 5126, 3, i_122_);
			}
			long[] ls = new long[groundMaterials.length];
			for (int i_123_ = 0; i_123_ < groundMaterials.length; i_123_++) {
				OpenGlTileMaterial class480_sub8 = (OpenGlTileMaterial) groundMaterials[i_123_];
				ls[i_123_] = class480_sub8.linkedKey * -4821875126325281949L;
				class480_sub8.finish(anInt8659);
			}
			ArrayUtils.sort(ls, groundMaterials);
			if (aClass91_8660 != null) {
				aClass91_8660.method1748();
			}
		} else {
			aClass91_8660 = null;
		}
		if ((anInt8670 & 0x2) == 0) {
			tileZOffsets = null;
			tileXOffsets = null;
			tileColours = null;
		}
		anIntArrayArrayArray8658 = null;
		tileBlendColours = null;
		anIntArrayArrayArray8657 = null;
		materials = null;
		shadowing = null;
		materialTable = null;
		lightingZ = null;
		lightingY = null;
		lightingX = null;
	}

	@Override
	public void setShadowing(int x, int z, int value) {
		x = Math.min(shadowing.length - 1, Math.max(0, x));
		z = Math.min(shadowing[x].length - 1, Math.max(0, z));
		if ((shadowing[x][z] & 0xff) < value) {
			shadowing[x][z] = (byte) value;
		}
	}

	@Override
	public void addBlendedTile(int x, int z, int[] offsetsX, int[] is_178_, int[] offsetsY, int[] is_180_,
			int[] colours, int[] blendColours, int[] textures, int[] scales, Class150 class150, boolean bool) {
		TextureMetricsList metricsList = toolkit.metricsList;
		if (is_180_ != null && anIntArrayArrayArray8658 == null) {
			anIntArrayArrayArray8658 = new int[width * 767658255][length * 295124605][];
		}

		if (is_178_ != null && anIntArrayArrayArray8657 == null) {
			anIntArrayArrayArray8657 = new int[width * 767658255][length * 295124605][];
		}

		tileXOffsets[x][z] = offsetsX;
		tileZOffsets[x][z] = offsetsY;
		tileColours[x][z] = colours;
		tileBlendColours[x][z] = blendColours;

		if (anIntArrayArrayArray8658 != null) {
			anIntArrayArrayArray8658[x][z] = is_180_;
		}

		if (anIntArrayArrayArray8657 != null) {
			anIntArrayArrayArray8657[x][z] = is_178_;
		}

		OpenGlTileMaterial[] tile = materials[x][z] = new OpenGlTileMaterial[colours.length];
		for (int index = 0; index < colours.length; index++) {
			int texture = textures[index];
			int scale = scales[index];

			if ((flags & 0x20) != 0 && texture != -1 && metricsList.get(texture).aBool1724) {
				scale = 128;
				texture = -1;
			}

			long key = (long) (class150.intensity * -1801120163) << 48 | (long) (class150.scale * -329760297) << 42
					| (long) (class150.colour * 2139661437) << 28 | scale << 14 | texture;
			Linkable linkable;
			for (linkable = materialTable.get(key); linkable != null; linkable = materialTable.nextInBucket()) {
				OpenGlTileMaterial material = (OpenGlTileMaterial) linkable;
				if (material.texture == texture && material.scale == scale && material.aClass150_9997.equals(class150)) {
					break;
				}
			}

			if (linkable == null) {
				tile[index] = new OpenGlTileMaterial(this, texture, scale, class150);
				materialTable.put(key, tile[index]);
			} else {
				tile[index] = (OpenGlTileMaterial) linkable;
			}
		}

		if (bool) {
			shadowFlags[x][z] |= 0x1;
		}

		if (colours.length > maximumVertices) {
			maximumVertices = colours.length;
		}

		vertices += colours.length;
	}

	@Override
	public Shadow method2194(int x, int z, Shadow shadow) {
		if ((shadowFlags[x][z] & 0x1) == 0) {
			return null;
		}

		int units = tileUnits * 1668096025 >> toolkit.shadowScale;
		OpenGlShadow replacement = (OpenGlShadow) shadow;
		OpenGlShadow result;

		if (replacement != null && replacement.containsRegion(units, units)) {
			result = replacement;
			result.clear();
		} else {
			result = new OpenGlShadow(toolkit, units, units);
		}

		result.setBounds(0, 0, units, units);
		updateShadow(result, x, z);
		return result;
	}

	@Override
	public void deleteShadow(Shadow shadow, int x, int y, int z, int i_190_, boolean bool) {
		if (aClass91_8660 != null && shadow != null) {
			int projectedX = x - (y * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale;
			int projectedZ = z - (y * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale;
			aClass91_8660.delete(shadow, projectedX, projectedZ);
		}
	}

	@Override
	public void addShadow(Shadow shadow, int x, int y, int z, int i_162_, boolean bool) {
		if (aClass91_8660 != null && shadow != null) {
			int projectedX = x - (y * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale;
			int projectedZ = z - (y * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale;
			aClass91_8660.add(shadow, projectedX, projectedZ);
		}
	}

	@Override
	public boolean method2197(Shadow shadow, int x, int y, int z, int i_157_, boolean bool) {
		if (aClass91_8660 == null || shadow == null) {
			return false;
		}

		int projectedX = x - (y * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale;
		int projectedZ = z - (y * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale;
		return aClass91_8660.method1744(shadow, projectedX, projectedZ);
	}

	@Override
	public void addLight(PointLight light, int[] is) {
		lighters.pushBack(new OpenGlPointLighter(toolkit, this, light, is));
	}

	@Override
	public void renderPlan(int startPositionX, int startPositionZ, int tileScale, int startX, int startZ, int endX,
			int endZ, boolean[][] plan) {
		Display display = toolkit.method2628();
		if (vertices > 0 && display != null) {
			toolkit.method14307();
			toolkit.method14334(false);
			toolkit.method14335(false);
			toolkit.method14338(false);
			toolkit.method14339(false);
			toolkit.setBlendMode(0);
			toolkit.method14497(-2);
			toolkit.setActiveTexture(null);
			GROUND_MATRIX[0] = tileScale / (128.0F * (tileUnits * 1668096025) * display.getWidth());
			GROUND_MATRIX[1] = 0.0F;
			GROUND_MATRIX[2] = 0.0F;
			GROUND_MATRIX[3] = 0.0F;
			GROUND_MATRIX[4] = 0.0F;
			GROUND_MATRIX[5] = tileScale / (128.0F * (tileUnits * 1668096025) * display.getHeight());
			GROUND_MATRIX[6] = 0.0F;
			GROUND_MATRIX[7] = 0.0F;
			GROUND_MATRIX[8] = 0.0F;
			GROUND_MATRIX[9] = 0.0F;
			GROUND_MATRIX[10] = 0.0F;
			GROUND_MATRIX[11] = 0.0F;
			GROUND_MATRIX[12] = -1.0F - (startX * tileScale / 128.0F - startPositionX * 2) / display.getWidth();
			GROUND_MATRIX[13] = 1.0F - (2 * startPositionZ + endZ * tileScale / 128.0F) / display.getHeight();
			GROUND_MATRIX[14] = 0.0F;
			GROUND_MATRIX[15] = 1.0F;

			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadMatrixf(GROUND_MATRIX, 0);

			GROUND_MATRIX[0] = 1.0F;
			GROUND_MATRIX[1] = 0.0F;
			GROUND_MATRIX[2] = 0.0F;
			GROUND_MATRIX[3] = 0.0F;
			GROUND_MATRIX[4] = 0.0F;
			GROUND_MATRIX[5] = 0.0F;
			GROUND_MATRIX[6] = 1.0F;
			GROUND_MATRIX[7] = 0.0F;
			GROUND_MATRIX[8] = 0.0F;
			GROUND_MATRIX[9] = 1.0F;
			GROUND_MATRIX[10] = 0.0F;
			GROUND_MATRIX[11] = 0.0F;
			GROUND_MATRIX[12] = 0.0F;
			GROUND_MATRIX[13] = 0.0F;
			GROUND_MATRIX[14] = 0.0F;
			GROUND_MATRIX[15] = 1.0F;
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadMatrixf(GROUND_MATRIX, 0);

			if ((flags & 0x7) != 0) {
				toolkit.method14335(true);
				toolkit.method14306();
			} else {
				toolkit.method14335(false);
			}

			toolkit.setPointers(vertexPointer, normalPointer, colourPointer, texturePointer);
			if (toolkit.dataBuffer.payload.length < anInt8651 * 2) {
				toolkit.dataBuffer = new FloatBuffer(anInt8651 * 2);
			} else {
				toolkit.dataBuffer.offset = 0;
			}

			int count = 0;
			FloatBuffer buffer = toolkit.dataBuffer;
			if (toolkit.bigEndian) {
				for (int z = startZ; z < endZ; z++) {
					int offset = z * width * 767658255 + startX;

					for (int x = startX; x < endX; x++) {
						if (plan[x - startX][z - startZ]) {
							short[] indices = materialIndices[offset];

							if (indices != null) {
								for (short index : indices) {
									buffer.writeShort(index & 0xffff);
									count++;
								}
							}
						}

						offset++;
					}
				}
			} else {
				for (int z = startZ; z < endZ; z++) {
					int offset = z * width * 767658255 + startX;

					for (int x = startX; x < endX; x++) {
						if (plan[x - startX][z - startZ]) {
							short[] indices = materialIndices[offset];

							if (indices != null) {
								for (short index : indices) {
									buffer.writeLEShort(index & 0xffff);
									count++;
								}
							}
						}

						offset++;
					}
				}
			}

			if (count > 0) {
				NativeOpenGlElementArrayBuffer elements = new NativeOpenGlElementArrayBuffer(toolkit, buffer.payload,
						buffer.offset * -165875887);
				toolkit.drawElements(elements, 4, 0, count);
			}
		}
	}

	@Override
	public void method2216(int i, int i_174_, int i_175_, boolean[][] bools, boolean bool, int i_176_) {
		method14020(i, i_174_, i_175_, bools, bool, i_176_);
	}

	@Override
	public void method2224(int i, int i_19_, int[] is, int[] is_20_, int[] is_21_, int[] is_22_, int[] is_23_,
			int[] is_24_, int[] is_25_, int[] is_26_, int[] is_27_, int[] is_28_, int[] is_29_, Class150 class150,
			boolean bool) {
		int i_30_ = is_26_.length;
		int[] is_31_ = new int[i_30_ * 3];
		int[] is_32_ = new int[i_30_ * 3];
		int[] is_33_ = new int[i_30_ * 3];
		int[] is_34_ = is_27_ != null ? new int[i_30_ * 3] : null;
		int[] is_35_ = new int[i_30_ * 3];
		int[] is_36_ = new int[i_30_ * 3];
		int[] is_37_ = is_20_ != null ? new int[i_30_ * 3] : null;
		int[] is_38_ = is_22_ != null ? new int[i_30_ * 3] : null;
		int i_39_ = 0;
		for (int i_40_ = 0; i_40_ < i_30_; i_40_++) {
			int i_41_ = is_23_[i_40_];
			int i_42_ = is_24_[i_40_];
			int i_43_ = is_25_[i_40_];
			is_31_[i_39_] = is[i_41_];
			is_32_[i_39_] = is_21_[i_41_];
			is_33_[i_39_] = is_26_[i_40_];
			is_35_[i_39_] = is_28_[i_40_];
			is_36_[i_39_] = is_29_[i_40_];
			if (is_27_ != null) {
				is_34_[i_39_] = is_27_[i_40_];
			}
			if (is_20_ != null) {
				is_37_[i_39_] = is_20_[i_41_];
			}
			if (is_22_ != null) {
				is_38_[i_39_] = is_22_[i_41_];
			}
			i_39_++;
			is_31_[i_39_] = is[i_42_];
			is_32_[i_39_] = is_21_[i_42_];
			is_33_[i_39_] = is_26_[i_40_];
			is_35_[i_39_] = is_28_[i_40_];
			is_36_[i_39_] = is_29_[i_40_];
			if (is_27_ != null) {
				is_34_[i_39_] = is_27_[i_40_];
			}
			if (is_20_ != null) {
				is_37_[i_39_] = is_20_[i_42_];
			}
			if (is_22_ != null) {
				is_38_[i_39_] = is_22_[i_42_];
			}
			i_39_++;
			is_31_[i_39_] = is[i_43_];
			is_32_[i_39_] = is_21_[i_43_];
			is_33_[i_39_] = is_26_[i_40_];
			is_35_[i_39_] = is_28_[i_40_];
			is_36_[i_39_] = is_29_[i_40_];
			if (is_27_ != null) {
				is_34_[i_39_] = is_27_[i_40_];
			}
			if (is_20_ != null) {
				is_37_[i_39_] = is_20_[i_43_];
			}
			if (is_22_ != null) {
				is_38_[i_39_] = is_22_[i_43_];
			}
			i_39_++;
		}
		addBlendedTile(i, i_19_, is_31_, is_37_, is_32_, is_38_, is_33_, is_34_, is_35_, is_36_, class150, bool);
	}

	void method14020(int i, int i_2_, int i_3_, boolean[][] bools, boolean bool, int i_4_) {
		if (groundMaterials != null) {
			int i_5_ = i_3_ + i_3_ + 1;
			i_5_ *= i_5_;
			if (toolkit.anIntArray9101.length < i_5_) {
				toolkit.anIntArray9101 = new int[i_5_];
			}
			if (toolkit.dataBuffer.payload.length < anInt8651 * 2) {
				toolkit.dataBuffer = new FloatBuffer(anInt8651 * 2);
			}
			int i_6_ = i - i_3_;
			int i_7_ = i_6_;
			if (i_6_ < 0) {
				i_6_ = 0;
			}
			int i_8_ = i_2_ - i_3_;
			int i_9_ = i_8_;
			if (i_8_ < 0) {
				i_8_ = 0;
			}
			int i_10_ = i + i_3_;
			if (i_10_ > width * 767658255 - 1) {
				i_10_ = width * 767658255 - 1;
			}
			int i_11_ = i_2_ + i_3_;
			if (i_11_ > length * 295124605 - 1) {
				i_11_ = length * 295124605 - 1;
			}
			int i_12_ = 0;
			int[] is = toolkit.anIntArray9101;
			for (int i_13_ = i_6_; i_13_ <= i_10_; i_13_++) {
				boolean[] bools_14_ = bools[i_13_ - i_7_];
				for (int i_15_ = i_8_; i_15_ <= i_11_; i_15_++) {
					if (bools_14_[i_15_ - i_9_]) {
						is[i_12_++] = i_15_ * width * 767658255 + i_13_;
					}
				}
			}
			toolkit.method14375();
			toolkit.method14335((flags & 0x7) != 0);
			for (int i_16_ = 0; i_16_ < groundMaterials.length - 0; i_16_++) {
				((OpenGlTileMaterial) groundMaterials[i_16_]).render(is, i_12_);
			}
			if (!lighters.isEmpty()) {
				int i_17_ = toolkit.anInt9085;
				int i_18_ = toolkit.anInt9073;
				toolkit.setFogColour(0, i_18_, toolkit.anInt9026);
				toolkit.method14335(false);
				toolkit.method14339(false);
				toolkit.setBlendMode(128);
				toolkit.method14497(-2);
				toolkit.setActiveTexture(toolkit.aClass102_Sub1_9047);
				toolkit.setTextureParameters(8448, 7681);
				toolkit.method14376(0, 34166, 770);
				toolkit.method14283(0, 34167, 770);
				for (Linkable class480 = lighters.head(); class480 != null; class480 = lighters.next()) {
					OpenGlPointLighter class480_sub9 = (OpenGlPointLighter) class480;
					class480_sub9.method15558(i, i_2_, i_3_, bools);
				}
				toolkit.method14376(0, 5890, 768);
				toolkit.method14283(0, 5890, 770);
				toolkit.setActiveTexture(null);
				toolkit.setFogColour(i_17_, i_18_, toolkit.anInt9026);
			}
			if (aClass91_8660 != null) {
				OpenGL.glPushMatrix();
				OpenGL.glTranslatef(0.0F, -1.0F, 0.0F);
				toolkit.setPointers(vertexPointer, null, null, texturePointer);
				aClass91_8660.method1750(i, i_2_, i_3_, bools, bool);
				OpenGL.glPopMatrix();
			}
		}
	}

	void updateShadow(OpenGlShadow class480_sub31_sub12_sub2, int i, int i_142_) {
		int[] is = tileXOffsets[i][i_142_];
		int[] is_143_ = tileZOffsets[i][i_142_];
		int i_144_ = is.length;
		if (toolkit.shadowX.length < i_144_) {
			toolkit.shadowX = new int[i_144_];
			toolkit.shadowY = new int[i_144_];
		}
		int[] is_145_ = toolkit.shadowX;
		int[] is_146_ = toolkit.shadowY;
		for (int i_147_ = 0; i_147_ < i_144_; i_147_++) {
			is_145_[i_147_] = is[i_147_] >> toolkit.shadowScale;
			is_146_[i_147_] = is_143_[i_147_] >> toolkit.shadowScale;
		}
		int i_148_ = 0;
		while (i_148_ < i_144_) {
			int i_149_ = is_145_[i_148_];
			int i_150_ = is_146_[i_148_++];
			int i_151_ = is_145_[i_148_];
			int i_152_ = is_146_[i_148_++];
			int i_153_ = is_145_[i_148_];
			int i_154_ = is_146_[i_148_++];
			if ((i_149_ - i_151_) * (i_152_ - i_154_) - (i_152_ - i_150_) * (i_153_ - i_151_) > 0) {
				class480_sub31_sub12_sub2.fill(i_150_, i_152_, i_154_, i_149_, i_151_, i_153_);
			}
		}
	}
}
