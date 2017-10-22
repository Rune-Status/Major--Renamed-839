package com.jagex;

public class JavaGround extends Ground {

	static int method14080(int i, int i_420_) {
		int i_421_ = (i & 0xff0000) * i_420_ >> 23;
		if (i_421_ < 2) {
			i_421_ = 2;
		} else if (i_421_ > 253) {
			i_421_ = 253;
		}

		int i_422_ = (i & 0xff00) * i_420_ >> 15;
		if (i_422_ < 2) {
			i_422_ = 2;
		} else if (i_422_ > 253) {
			i_422_ = 253;
		}

		int i_423_ = (i & 0xff) * i_420_ >> 7;
		if (i_423_ < 2) {
			i_423_ = 2;
		} else if (i_423_ > 253) {
			i_423_ = 253;
		}

		return i_421_ << 16 | i_422_ << 8 | i_423_;
	}

	float aFloat8750;
	float aFloat8751;
	int anInt8756;
	float aFloat8757;
	Class78[][] aClass78ArrayArray8758;
	Class85[][] aClass85ArrayArray8759;
	Class90[][] aClass90ArrayArray8760;
	float aFloat8761;
	float aFloat8762;
	float aFloat8763;
	Class108[][] aClass108ArrayArray8764;
	float aFloat8765;
	float aFloat8766;
	float aFloat8767;
	Class70[][] aClass70ArrayArray8768;
	float aFloat8769;
	float aFloat8770;
	float aFloat8771;
	JavaToolkit toolkit;
	float aFloat8774;
	float aFloat8775;
	float aFloat8776;
	float aFloat8777;
	byte[][] lighting;

	byte[][] shadowing;

	JavaGround(JavaToolkit toolkit, int i_330_, int width, int length, int[][] heights, int[][] lighting, int units) {
		super(width, length, units, heights);
		this.toolkit = toolkit;

		anInt8756 = i_330_;
		this.lighting = new byte[width + 1][length + 1];
		int i_335_ = toolkit.anInt8816 * 1012731861 >> 9;

		for (int z = 1; z < length; z++) {
			for (int x = 1; x < width; x++) {
				int intensity = i_335_;
				int dx = lighting[x + 1][z] - lighting[x - 1][z];
				int dz = lighting[x][z + 1] - lighting[x][z - 1];
				int distance = (int) Math.sqrt(dx * dx + 512 * units + dz * dz);
				int lightX = (dx << 8) / distance;
				int lightY = -512 * units / distance;
				int lightZ = (dz << 8) / distance;
				intensity += toolkit.lightX * -2078106349 * lightX + toolkit.lightY * -1406837097 * lightY
						+ toolkit.lightZ * 1546397231 * lightZ >> 17;
				intensity >>= 1;

				if (intensity < 2) {
					intensity = 2;
				} else if (intensity > 126) {
					intensity = 126;
				}

				this.lighting[x][z] = (byte) intensity;
			}
		}

		shadowing = new byte[width + 1][length + 1];
	}

	@Override
	public void finish() {
		lighting = null;
		shadowing = null;
	}

	@Override
	public void setShadowing(int x, int z, int value) {
		x = Math.min(shadowing.length - 1, Math.max(0, x));
		z = Math.min(shadowing[x].length - 1, Math.max(0, z));

		if (shadowing[x][z] < value) {
			shadowing[x][z] = (byte) value;
		}
	}

	@Override
	public void addBlendedTile(int i, int i_3_, int[] is, int[] is_4_, int[] is_5_, int[] is_6_, int[] is_7_, int[] is_8_,
			int[] is_9_, int[] is_10_, Class150 class150, boolean bool) {
		boolean bool_11_ = (anInt8756 & 0x20) == 0;
		if (aClass85ArrayArray8759 == null && !bool_11_) {
			aClass85ArrayArray8759 = new Class85[width * 767658255][length * 295124605];
			aClass70ArrayArray8768 = new Class70[width * 767658255][length * 295124605];
		} else if (aClass90ArrayArray8760 == null && bool_11_) {
			aClass90ArrayArray8760 = new Class90[width * 767658255][length * 295124605];
		} else if (aClass108ArrayArray8764 != null) {
			throw new IllegalStateException();
		}

		if (is != null && is.length != 0) {
			for (int i_12_ = 0; i_12_ < is_7_.length; i_12_++) {
				if (is_7_[i_12_] == -1) {
					is_7_[i_12_] = 0;
				} else {
					is_7_[i_12_] = Class335.HSV_TABLE[HslUtils.hslToHsv(is_7_[i_12_]) & 0xffff] << 8 | 0xff;
				}
			}

			if (is_8_ != null) {
				for (int i_13_ = 0; i_13_ < is_8_.length; i_13_++) {
					if (is_8_[i_13_] == -1) {
						is_8_[i_13_] = 0;
					} else {
						is_8_[i_13_] = Class335.HSV_TABLE[HslUtils.hslToHsv(is_8_[i_13_]) & 0xffff] << 8 | 0xff;
					}
				}
			}
			if (bool_11_) {
				Class90 class90 = new Class90();
				class90.aShort1247 = (short) is.length;
				class90.aShort1253 = (short) (is.length / 3);
				class90.aShortArray1248 = new short[class90.aShort1247];
				class90.aShortArray1249 = new short[class90.aShort1247];
				class90.aShortArray1250 = new short[class90.aShort1247];
				class90.anIntArray1246 = new int[class90.aShort1247];
				class90.aShortArray1252 = new short[class90.aShort1247];
				class90.aShortArray1256 = new short[class90.aShort1247];
				class90.aByteArray1255 = new byte[class90.aShort1247];
				if (is_6_ != null) {
					class90.aShortArray1251 = new short[class90.aShort1247];
				}
				for (int i_14_ = 0; i_14_ < class90.aShort1247; i_14_++) {
					int i_15_ = is[i_14_];
					int i_16_ = is_5_[i_14_];
					int i_18_;
					if (i_15_ == 0 && i_16_ == 0) {
						i_18_ = lighting[i][i_3_] - shadowing[i][i_3_];
					} else if (i_15_ == 0 && i_16_ == tileUnits * 1668096025) {
						i_18_ = lighting[i][i_3_ + 1] - shadowing[i][i_3_ + 1];
					} else if (i_15_ == tileUnits * 1668096025 && i_16_ == tileUnits * 1668096025) {
						i_18_ = lighting[i + 1][i_3_ + 1] - shadowing[i + 1][i_3_ + 1];
					} else if (i_15_ == tileUnits * 1668096025 && i_16_ == 0) {
						i_18_ = lighting[i + 1][i_3_] - shadowing[i + 1][i_3_];
					} else {
						int i_19_ = (lighting[i][i_3_] - shadowing[i][i_3_]) * (tileUnits * 1668096025 - i_15_)
								+ (lighting[i + 1][i_3_] - shadowing[i + 1][i_3_]) * i_15_;
						int i_20_ = (lighting[i][i_3_ + 1] - shadowing[i][i_3_ + 1]) * (tileUnits * 1668096025 - i_15_)
								+ (lighting[i + 1][i_3_ + 1] - shadowing[i + 1][i_3_ + 1]) * i_15_;
						i_18_ = i_19_ * (tileUnits * 1668096025 - i_16_) + i_20_ * i_16_ >> tileScale * -666472694;
					}
					int i_21_ = (i << tileScale * -333236347) + i_15_;
					int i_22_ = (i_3_ << tileScale * -333236347) + i_16_;
					class90.aShortArray1248[i_14_] = (short) i_15_;
					class90.aShortArray1250[i_14_] = (short) i_16_;
					class90.aShortArray1249[i_14_] = (short) (averageHeight(i_21_, i_22_) + (is_4_ != null ? is_4_[i_14_]
							: 0));
					if (i_18_ < 0) {
						i_18_ = 0;
					}
					if (is_7_[i_14_] == 0) {
						class90.anIntArray1246[i_14_] = 0;
						if (is_8_ != null) {
							class90.aByteArray1255[i_14_] = (byte) i_18_;
						}
					} else {
						int i_23_ = 0;
						if (is_6_ != null) {
							int i_24_ = class90.aShortArray1251[i_14_] = (short) is_6_[i_14_];
							if (class150.scale * -329760297 != 0) {
								i_23_ = 255 * i_24_ / (class150.scale * -329760297);
								if (i_23_ < 0) {
									i_23_ = 0;
								} else if (i_23_ > 255) {
									i_23_ = 255;
								}
							}
						}
						int i_25_ = -16777216;
						if (is_9_[i_14_] != -1) {
							TextureMetrics metrics = toolkit.metricsList.get(is_9_[i_14_]);
							if (metrics.aBool1698 && method14062(metrics.aByte1719)) {
								i_25_ = -1694498816;
							}
						}
						class90.anIntArray1246[i_14_] = i_25_
								| JavaGround.blendColours(method14080(is_7_[i_14_] >> 8, i_18_),
										class150.colour * 2139661437, i_23_);
						if (is_8_ != null) {
							class90.aByteArray1255[i_14_] = (byte) i_18_;
						}
					}
					class90.aShortArray1252[i_14_] = (short) is_9_[i_14_];
					class90.aShortArray1256[i_14_] = (short) is_10_[i_14_];
				}
				if (is_8_ != null) {
					class90.anIntArray1254 = new int[class90.aShort1253];
					for (int i_26_ = 0; i_26_ < class90.aShort1253; i_26_++) {
						int i_27_ = i_26_ * 3;
						if (is_8_[i_27_] != 0) {
							class90.anIntArray1254[i_26_] = ~0xffffff | is_8_[i_27_] >> 8;
						}
					}
				}
				aClass90ArrayArray8760[i][i_3_] = class90;
			} else {
				boolean bool_28_ = true;
				int i_29_ = -1;
				int i_30_ = -1;
				int i_31_ = -1;
				int i_32_ = -1;
				if (is.length == 6) {
					for (int i_33_ = 0; i_33_ < 6; i_33_++) {
						if (is[i_33_] == 0 && is_5_[i_33_] == 0) {
							if (i_29_ != -1 && is_7_[i_29_] != is_7_[i_33_]) {
								bool_28_ = false;
								break;
							}
							i_29_ = i_33_;
						} else if (is[i_33_] == tileUnits * 1668096025 && is_5_[i_33_] == 0) {
							if (i_30_ != -1 && is_7_[i_30_] != is_7_[i_33_]) {
								bool_28_ = false;
								break;
							}
							i_30_ = i_33_;
						} else if (is[i_33_] == tileUnits * 1668096025 && is_5_[i_33_] == tileUnits * 1668096025) {
							if (i_31_ != -1 && is_7_[i_31_] != is_7_[i_33_]) {
								bool_28_ = false;
								break;
							}
							i_31_ = i_33_;
						} else if (is[i_33_] == 0 && is_5_[i_33_] == tileUnits * 1668096025) {
							if (i_32_ != -1 && is_7_[i_32_] != is_7_[i_33_]) {
								bool_28_ = false;
								break;
							}
							i_32_ = i_33_;
						}
					}
					if (i_29_ == -1 || i_30_ == -1 || i_31_ == -1 || i_32_ == -1) {
						bool_28_ = false;
					}
					if (bool_28_) {
						if (is_4_ != null) {
							for (int i_34_ = 0; i_34_ < 4; i_34_++) {
								if (is_4_[i_34_] != 0) {
									bool_28_ = false;
									break;
								}
							}
						}
						if (bool_28_) {
							for (int i_35_ = 1; i_35_ < 4; i_35_++) {
								if (is[i_35_] != is[0] && is[i_35_] != is[0] + tileUnits * 1668096025
										&& is[i_35_] != is[0] - tileUnits * 1668096025) {
									bool_28_ = false;
									break;
								}
								if (is_5_[i_35_] != is_5_[0] && is_5_[i_35_] != is_5_[0] + tileUnits * 1668096025
										&& is_5_[i_35_] != is_5_[0] - tileUnits * 1668096025) {
									bool_28_ = false;
									break;
								}
							}
						}
					}
				} else {
					bool_28_ = false;
				}
				if (bool_28_) {
					Class85 class85 = new Class85();
					int i_36_ = is_7_[0];
					int i_37_ = is_9_[0];
					if (is_8_ != null) {
						class85.anInt1226 = is_8_[0] >> 8;
						if (i_36_ == 0) {
							class85.aByte1219 |= 0x2;
						}
					} else if (i_36_ == 0) {
						return;
					}
					if (tileHeights[i][i_3_] == tileHeights[i + 1][i_3_]
							&& tileHeights[i][i_3_] == tileHeights[i + 1][i_3_ + 1]
							&& tileHeights[i][i_3_] == tileHeights[i][i_3_ + 1]) {
						class85.aByte1219 |= 0x1;
					}
					if (i_37_ != -1 && (class85.aByte1219 & 0x2) == 0 && !toolkit.metricsList.get(i_37_).aBool1724) {
						int i_38_;
						if (is_6_ != null && class150.scale * -329760297 != 0) {
							i_38_ = 255 * is_6_[i_29_] / (class150.scale * -329760297);
							if (i_38_ < 0) {
								i_38_ = 0;
							} else if (i_38_ > 255) {
								i_38_ = 255;
							}
						} else {
							i_38_ = 0;
						}
						class85.anInt1218 = JavaGround.blendColours(
								method14080(is_7_[i_29_] >> 8, lighting[i][i_3_] - shadowing[i][i_3_]),
								class150.colour * 2139661437, i_38_);
						if (class85.anInt1226 != 0) {
							class85.anInt1218 |= 255 - (lighting[i][i_3_] - shadowing[i][i_3_]) << 25;
						}
						if (is_6_ != null && class150.scale * -329760297 != 0) {
							i_38_ = 255 * is_6_[i_30_] / (class150.scale * -329760297);
							if (i_38_ < 0) {
								i_38_ = 0;
							} else if (i_38_ > 255) {
								i_38_ = 255;
							}
						} else {
							i_38_ = 0;
						}
						class85.anInt1224 = JavaGround.blendColours(
								method14080(is_7_[i_30_] >> 8, lighting[i + 1][i_3_] - shadowing[i + 1][i_3_]),
								class150.colour * 2139661437, i_38_);
						if (class85.anInt1226 != 0) {
							class85.anInt1224 |= 255 - (lighting[i + 1][i_3_] - shadowing[i + 1][i_3_]) << 25;
						}
						if (is_6_ != null && class150.scale * -329760297 != 0) {
							i_38_ = 255 * is_6_[i_31_] / (class150.scale * -329760297);
							if (i_38_ < 0) {
								i_38_ = 0;
							} else if (i_38_ > 255) {
								i_38_ = 255;
							}
						} else {
							i_38_ = 0;
						}
						class85.anInt1217 = JavaGround.blendColours(
								method14080(is_7_[i_31_] >> 8, lighting[i + 1][i_3_ + 1] - shadowing[i + 1][i_3_ + 1]),
								class150.colour * 2139661437, i_38_);
						if (class85.anInt1226 != 0) {
							class85.anInt1217 |= 255 - (lighting[i + 1][i_3_ + 1] - shadowing[i + 1][i_3_ + 1]) << 25;
						}
						if (is_6_ != null && class150.scale * -329760297 != 0) {
							i_38_ = 255 * is_6_[i_32_] / (class150.scale * -329760297);
							if (i_38_ < 0) {
								i_38_ = 0;
							} else if (i_38_ > 255) {
								i_38_ = 255;
							}
						} else {
							i_38_ = 0;
						}
						class85.anInt1221 = JavaGround.blendColours(
								method14080(is_7_[i_32_] >> 8, lighting[i][i_3_ + 1] - shadowing[i][i_3_ + 1]),
								class150.colour * 2139661437, i_38_);
						class85.aShort1222 = (short) i_37_;
					} else {
						int i_39_;
						if (is_6_ != null && class150.scale * -329760297 != 0) {
							i_39_ = 255 * is_6_[i_29_] / (class150.scale * -329760297);
							if (i_39_ < 0) {
								i_39_ = 0;
							} else if (i_39_ > 255) {
								i_39_ = 255;
							}
						} else {
							i_39_ = 0;
						}
						class85.anInt1218 = JavaGround.blendColours(
								method14080(is_7_[i_29_] >> 8, lighting[i][i_3_] - shadowing[i][i_3_]),
								class150.colour * 2139661437, i_39_);
						if (class85.anInt1226 != 0) {
							class85.anInt1218 |= 255 - (lighting[i][i_3_] - shadowing[i][i_3_]) << 25;
						}
						if (is_6_ != null && class150.scale * -329760297 != 0) {
							i_39_ = 255 * is_6_[i_30_] / (class150.scale * -329760297);
							if (i_39_ < 0) {
								i_39_ = 0;
							} else if (i_39_ > 255) {
								i_39_ = 255;
							}
						} else {
							i_39_ = 0;
						}
						class85.anInt1224 = JavaGround.blendColours(
								method14080(is_7_[i_30_] >> 8, lighting[i + 1][i_3_] - shadowing[i + 1][i_3_]),
								class150.colour * 2139661437, i_39_);
						if (class85.anInt1226 != 0) {
							class85.anInt1224 |= 255 - (lighting[i + 1][i_3_] - shadowing[i + 1][i_3_]) << 25;
						}
						if (is_6_ != null && class150.scale * -329760297 != 0) {
							i_39_ = 255 * is_6_[i_31_] / (class150.scale * -329760297);
							if (i_39_ < 0) {
								i_39_ = 0;
							} else if (i_39_ > 255) {
								i_39_ = 255;
							}
						} else {
							i_39_ = 0;
						}
						class85.anInt1217 = JavaGround.blendColours(
								method14080(is_7_[i_31_] >> 8, lighting[i + 1][i_3_ + 1] - shadowing[i + 1][i_3_ + 1]),
								class150.colour * 2139661437, i_39_);
						if (class85.anInt1226 != 0) {
							class85.anInt1217 |= 255 - (lighting[i + 1][i_3_ + 1] - shadowing[i + 1][i_3_ + 1]) << 25;
						}
						if (is_6_ != null && class150.scale * -329760297 != 0) {
							i_39_ = 255 * is_6_[i_32_] / (class150.scale * -329760297);
							if (i_39_ < 0) {
								i_39_ = 0;
							} else if (i_39_ > 255) {
								i_39_ = 255;
							}
						} else {
							i_39_ = 0;
						}
						class85.anInt1221 = JavaGround.blendColours(
								method14080(is_7_[i_32_] >> 8, lighting[i][i_3_ + 1] - shadowing[i][i_3_ + 1]),
								class150.colour * 2139661437, i_39_);
						if (class85.anInt1226 != 0) {
							class85.anInt1221 |= 255 - (lighting[i][i_3_ + 1] - shadowing[i][i_3_ + 1]) << 25;
						}
						class85.aShort1222 = (short) -1;
					}
					if (is_6_ != null) {
						class85.aShort1227 = (short) is_6_[i_31_];
						class85.aShort1225 = (short) is_6_[i_32_];
						class85.aShort1223 = (short) is_6_[i_30_];
						class85.aShort1220 = (short) is_6_[i_29_];
					}
					aClass85ArrayArray8759[i][i_3_] = class85;
				} else {
					Class70 class70 = new Class70();
					class70.aShort1038 = (short) is.length;
					class70.aShort1041 = (short) (is.length / 3);
					class70.aShortArray1040 = new short[class70.aShort1038];
					class70.aShortArray1044 = new short[class70.aShort1038];
					class70.aShortArray1042 = new short[class70.aShort1038];
					class70.anIntArray1037 = new int[class70.aShort1038];
					if (is_6_ != null) {
						class70.aShortArray1043 = new short[class70.aShort1038];
					}
					for (int i_40_ = 0; i_40_ < class70.aShort1038; i_40_++) {
						int i_41_ = is[i_40_];
						int i_42_ = is_5_[i_40_];
						int i_44_;
						if (i_41_ == 0 && i_42_ == 0) {
							i_44_ = lighting[i][i_3_] - shadowing[i][i_3_];
						} else if (i_41_ == 0 && i_42_ == tileUnits * 1668096025) {
							i_44_ = lighting[i][i_3_ + 1] - shadowing[i][i_3_ + 1];
						} else if (i_41_ == tileUnits * 1668096025 && i_42_ == tileUnits * 1668096025) {
							i_44_ = lighting[i + 1][i_3_ + 1] - shadowing[i + 1][i_3_ + 1];
						} else if (i_41_ == tileUnits * 1668096025 && i_42_ == 0) {
							i_44_ = lighting[i + 1][i_3_] - shadowing[i + 1][i_3_];
						} else {
							int i_45_ = (lighting[i][i_3_] - shadowing[i][i_3_]) * (tileUnits * 1668096025 - i_41_)
									+ (lighting[i + 1][i_3_] - shadowing[i + 1][i_3_]) * i_41_;
							int i_46_ = (lighting[i][i_3_ + 1] - shadowing[i][i_3_ + 1])
									* (tileUnits * 1668096025 - i_41_)
									+ (lighting[i + 1][i_3_ + 1] - shadowing[i + 1][i_3_ + 1]) * i_41_;
							i_44_ = i_45_ * (tileUnits * 1668096025 - i_42_) + i_46_ * i_42_ >> tileScale * -666472694;
						}
						int i_47_ = (i << tileScale * -333236347) + i_41_;
						int i_48_ = (i_3_ << tileScale * -333236347) + i_42_;
						class70.aShortArray1040[i_40_] = (short) i_41_;
						class70.aShortArray1042[i_40_] = (short) i_42_;
						class70.aShortArray1044[i_40_] = (short) (averageHeight(i_47_, i_48_) + (is_4_ != null ? is_4_[i_40_]
								: 0));
						if (i_44_ < 0) {
							i_44_ = 0;
						}
						if (is_7_[i_40_] == 0) {
							if (is_8_ != null) {
								class70.anIntArray1037[i_40_] = i_44_ << 25;
							} else {
								class70.anIntArray1037[i_40_] = 0;
							}
						} else {
							int i_49_ = 0;
							if (is_6_ != null) {
								int i_50_ = class70.aShortArray1043[i_40_] = (short) is_6_[i_40_];
								if (class150.scale * -329760297 != 0) {
									i_49_ = 255 * i_50_ / (class150.scale * -329760297);
									if (i_49_ < 0) {
										i_49_ = 0;
									} else if (i_49_ > 255) {
										i_49_ = 255;
									}
								}
							}
							class70.anIntArray1037[i_40_] = JavaGround.blendColours(
									method14080(is_7_[i_40_] >> 8, i_44_), class150.colour * 2139661437, i_49_);
							if (is_8_ != null) {
								class70.anIntArray1037[i_40_] |= i_44_ << 25;
							}
						}
					}
					boolean bool_51_ = false;
					for (int i_52_ = 0; i_52_ < class70.aShort1041; i_52_++) {
						if (is_9_[i_52_ * 3] != -1 && !toolkit.metricsList.get(is_9_[i_52_ * 3]).aBool1724) {
							bool_51_ = true;
						}
					}
					if (is_8_ != null) {
						class70.anIntArray1047 = new int[class70.aShort1041];
					}
					if (bool_51_) {
						class70.aShortArray1045 = new short[class70.aShort1041];
						class70.aShortArray1046 = new short[class70.aShort1041];
					}
					for (int i_53_ = 0; i_53_ < class70.aShort1041; i_53_++) {
						int i_54_ = i_53_ * 3;
						if (is_8_ != null && is_8_[i_54_] != 0) {
							class70.anIntArray1047[i_53_] = is_8_[i_54_] >> 8;
						}
						if (bool_51_) {
							int i_55_ = i_54_ + 1;
							int i_56_ = i_55_ + 1;
							boolean bool_57_ = false;
							boolean bool_58_ = true;
							int i_59_ = is_9_[i_54_];
							if (i_59_ == -1 || toolkit.metricsList.get(i_59_).aBool1724) {
								bool_58_ = false;
							} else {
								bool_57_ = true;
							}
							i_59_ = is_9_[i_55_];
							if (i_59_ == -1 || toolkit.metricsList.get(i_59_).aBool1724) {
								bool_58_ = false;
							} else {
								bool_57_ = true;
							}
							i_59_ = is_9_[i_56_];
							if (i_59_ == -1 || toolkit.metricsList.get(i_59_).aBool1724) {
								bool_58_ = false;
							} else {
								bool_57_ = true;
							}
							if (bool_58_) {
								class70.aShortArray1045[i_53_] = (short) i_59_;
								class70.aShortArray1046[i_53_] = (short) is_10_[i_54_];
							} else {
								if (bool_57_) {
									i_59_ = is_9_[i_54_];
									if (i_59_ != -1 && !toolkit.metricsList.get(i_59_).aBool1724) {
										class70.anIntArray1037[i_54_] = Class335.HSV_TABLE[HslUtils
												.hslToHsv(toolkit.metricsList.get(i_59_).colour & 0xffff) & 0xffff];
									}
									i_59_ = is_9_[i_55_];
									if (i_59_ != -1 && !toolkit.metricsList.get(i_59_).aBool1724) {
										class70.anIntArray1037[i_55_] = Class335.HSV_TABLE[HslUtils
												.hslToHsv(toolkit.metricsList.get(i_59_).colour & 0xffff) & 0xffff];
									}
									i_59_ = is_9_[i_56_];
									if (i_59_ != -1 && !toolkit.metricsList.get(i_59_).aBool1724) {
										class70.anIntArray1037[i_56_] = Class335.HSV_TABLE[HslUtils
												.hslToHsv(toolkit.metricsList.get(i_59_).colour & 0xffff) & 0xffff];
									}
								}
								class70.aShortArray1045[i_53_] = (short) -1;
							}
						}
					}
					aClass70ArrayArray8768[i][i_3_] = class70;
				}
			}
		}
	}

	@Override
	public Shadow method2194(int i, int i_345_, Shadow class480_sub31_sub12) {
		return null;
	}

	@Override
	public void deleteShadow(Shadow class480_sub31_sub12, int i, int i_0_, int i_1_, int i_2_, boolean bool) {

	}

	@Override
	public void addShadow(Shadow class480_sub31_sub12, int i, int i_377_, int i_378_, int i_379_, boolean bool) {

	}

	@Override
	public boolean method2197(Shadow class480_sub31_sub12, int i, int i_374_, int i_375_, int i_376_, boolean bool) {
		return false;
	}

	@Override
	public void addLight(PointLight class480_sub23, int[] is) {

	}

	@Override
	public void renderPlan(int i, int i_324_, int i_325_, int i_326_, int i_327_, int i_328_, int i_329_,
			boolean[][] bools) {
		JavaThreadResource class64 = toolkit.getThreadResource(Thread.currentThread());
		Rasterizer class109 = class64.rasterizer;
		class109.anInt1375 = 0;
		class109.aBool1376 = true;
		toolkit.method14098();
		if (aClass85ArrayArray8759 != null || aClass90ArrayArray8760 != null) {
			method14064(i, i_324_, i_325_, i_326_, i_327_, i_328_, i_329_, bools, class64, class109,
					class64.aFloatArray978, class64.aFloatArray997);
		} else if (aClass108ArrayArray8764 != null) {
			method14063(i, i_324_, i_325_, i_326_, i_327_, i_328_, i_329_, bools, class64, class109,
					class64.aFloatArray978, class64.aFloatArray997);
		}
	}

	@Override
	public void method2216(int i, int i_92_, int i_93_, boolean[][] bools, boolean bool, int i_94_) {
		if (toolkit.anIntArray8797 == null || toolkit.aFloatArray8801 == null) {
			throw new IllegalStateException("");
		}
		Matrix4f class399 = toolkit.aClass399_8814;
		aFloat8761 = class399.array[0];
		aFloat8750 = class399.array[1];
		aFloat8751 = class399.array[2];
		aFloat8765 = class399.array[3];
		aFloat8766 = class399.array[4];
		aFloat8767 = class399.array[5];
		aFloat8763 = class399.array[6];
		aFloat8769 = class399.array[7];
		aFloat8774 = class399.array[8];
		aFloat8771 = class399.array[9];
		aFloat8770 = class399.array[10];
		aFloat8762 = class399.array[11];
		aFloat8757 = class399.array[12];
		aFloat8775 = class399.array[13];
		aFloat8776 = class399.array[14];
		aFloat8777 = class399.array[15];
		for (int i_95_ = 0; i_95_ < i_93_ + i_93_; i_95_++) {
			for (int i_96_ = 0; i_96_ < i_93_ + i_93_; i_96_++) {
				if (bools[i_95_][i_96_]) {
					int i_97_ = i - i_93_ + i_95_;
					int i_98_ = i_92_ - i_93_ + i_96_;
					if (i_97_ >= 0 && i_97_ < width * 767658255 && i_98_ >= 0 && i_98_ < length * 295124605) {
						method14058(i_97_, i_98_, i_94_);
					}
				}
			}
		}
	}

	@Override
	public void method2224(int i, int i_60_, int[] is, int[] is_61_, int[] is_62_, int[] is_63_, int[] is_64_,
			int[] is_65_, int[] is_66_, int[] is_67_, int[] is_68_, int[] is_69_, int[] is_70_, Class150 class150,
			boolean bool) {
		if (aClass108ArrayArray8764 == null) {
			aClass108ArrayArray8764 = new Class108[width * 767658255][length * 295124605];
			aClass78ArrayArray8758 = new Class78[width * 767658255][length * 295124605];
		} else if (aClass85ArrayArray8759 != null || aClass90ArrayArray8760 != null) {
			throw new IllegalStateException();
		}
		boolean bool_71_ = false;
		if (is_67_.length == 2 && is_64_.length == 2
				&& (is_67_[0] == is_67_[1] || is_69_[0] != -1 && is_69_[0] == is_69_[1])) {
			bool_71_ = true;
			for (int i_72_ = 1; i_72_ < 2; i_72_++) {
				int i_73_ = is[is_64_[i_72_]];
				int i_74_ = is_62_[is_64_[i_72_]];
				if (i_73_ != 0 && i_73_ != tileUnits * 1668096025 || i_74_ != 0 && i_74_ != tileUnits * 1668096025) {
					bool_71_ = false;
					break;
				}
			}
		}
		if (!bool_71_) {
			Class78 class78 = new Class78();
			short i_75_ = (short) is.length;
			int i_76_ = (short) is_67_.length;
			class78.aShort1132 = i_75_;
			class78.aShortArray1137 = new short[i_75_];
			class78.aShortArray1134 = new short[i_75_];
			class78.aShortArray1138 = new short[i_75_];
			class78.aShortArray1136 = new short[i_75_];
			for (int i_77_ = 0; i_77_ < i_75_; i_77_++) {
				int i_78_ = is[i_77_];
				int i_79_ = is_62_[i_77_];
				if (i_78_ == 0 && i_79_ == 0) {
					class78.aShortArray1137[i_77_] = (short) (lighting[i][i_60_] - shadowing[i][i_60_]);
				} else if (i_78_ == 0 && i_79_ == tileUnits * 1668096025) {
					class78.aShortArray1137[i_77_] = (short) (lighting[i][i_60_ + 1] - shadowing[i][i_60_ + 1]);
				} else if (i_78_ == tileUnits * 1668096025 && i_79_ == tileUnits * 1668096025) {
					class78.aShortArray1137[i_77_] = (short) (lighting[i + 1][i_60_ + 1] - shadowing[i + 1][i_60_ + 1]);
				} else if (i_78_ == tileUnits * 1668096025 && i_79_ == 0) {
					class78.aShortArray1137[i_77_] = (short) (lighting[i + 1][i_60_] - shadowing[i + 1][i_60_]);
				} else {
					int i_80_ = (lighting[i][i_60_] - shadowing[i][i_60_]) * (tileUnits * 1668096025 - i_78_)
							+ (lighting[i + 1][i_60_] - shadowing[i + 1][i_60_]) * i_78_;
					int i_81_ = (lighting[i][i_60_ + 1] - shadowing[i][i_60_ + 1]) * (tileUnits * 1668096025 - i_78_)
							+ (lighting[i + 1][i_60_ + 1] - shadowing[i + 1][i_60_ + 1]) * i_78_;
					class78.aShortArray1137[i_77_] = (short) (i_80_ * (tileUnits * 1668096025 - i_79_) + i_81_ * i_79_ >> tileScale
							* -666472694);
				}
				int i_82_ = (i << tileScale * -333236347) + i_78_;
				int i_83_ = (i_60_ << tileScale * -333236347) + i_79_;
				class78.aShortArray1134[i_77_] = (short) i_78_;
				class78.aShortArray1136[i_77_] = (short) i_79_;
				class78.aShortArray1138[i_77_] = (short) (averageHeight(i_82_, i_83_) + (is_61_ != null ? is_61_[i_77_]
						: 0));
				if (class78.aShortArray1137[i_77_] < 2) {
					class78.aShortArray1137[i_77_] = (short) 2;
				}
			}
			boolean bool_84_ = false;
			int i_85_ = 0;
			for (int i_86_ = 0; i_86_ < i_76_; i_86_++) {
				if (is_67_[i_86_] >= 0 || is_68_ != null && is_68_[i_86_] >= 0) {
					i_85_++;
				}
				int i_87_ = is_69_[i_86_];
				if (i_87_ != -1) {
					TextureMetrics class141 = toolkit.metricsList.get(i_87_);
					if (!class141.aBool1724) {
						bool_84_ = true;
						if (method14062(class141.aByte1719) || class141.aByte1728 != 0 || class141.aByte1700 != 0) {
							class78.aByte1133 |= 0x4;
						}
					}
				}
			}
			class78.anIntArray1144 = new int[i_85_];
			if (is_68_ != null) {
				class78.anIntArray1141 = new int[i_85_];
			}
			class78.aShortArray1143 = new short[i_85_];
			class78.aShortArray1131 = new short[i_85_];
			class78.aShortArray1140 = new short[i_85_];
			if (bool_84_) {
				class78.aShortArray1139 = new short[i_85_];
				class78.aShortArray1142 = new short[i_85_];
			}
			for (int i_88_ = 0; i_88_ < i_76_; i_88_++) {
				if (is_67_[i_88_] >= 0 || is_68_ != null && is_68_[i_88_] >= 0) {
					if (is_67_[i_88_] >= 0) {
						class78.anIntArray1144[class78.aShort1135] = HslUtils.hslToHsv(is_67_[i_88_]);
					} else {
						class78.anIntArray1144[class78.aShort1135] = -1;
					}
					if (is_68_ != null) {
						if (is_68_[i_88_] != -1) {
							class78.anIntArray1141[class78.aShort1135] = HslUtils.hslToHsv(is_68_[i_88_]);
						} else {
							class78.anIntArray1141[class78.aShort1135] = -1;
						}
					}
					class78.aShortArray1143[class78.aShort1135] = (short) is_64_[i_88_];
					class78.aShortArray1131[class78.aShort1135] = (short) is_65_[i_88_];
					class78.aShortArray1140[class78.aShort1135] = (short) is_66_[i_88_];
					if (bool_84_) {
						if (is_69_[i_88_] != -1 && !toolkit.metricsList.get(is_69_[i_88_]).aBool1724) {
							class78.aShortArray1139[class78.aShort1135] = (short) is_69_[i_88_];
							class78.aShortArray1142[class78.aShort1135] = (short) is_70_[i_88_];
						} else {
							class78.aShortArray1139[class78.aShort1135] = (short) -1;
						}
					}
					class78.aShort1135++;
				}
			}
			aClass78ArrayArray8758[i][i_60_] = class78;
		} else if (is_67_[0] >= 0 || is_68_ != null && is_68_[0] >= 0) {
			Class108 class108 = new Class108();
			int i_89_ = is_67_[0];
			int i_90_ = is_69_[0];
			if (is_68_ != null) {
				class108.anInt1370 = Class679.light(HslUtils.hslToHsv(is_68_[0]), lighting[i][i_60_]
						- shadowing[i][i_60_]);
				if (i_89_ == -1) {
					class108.aByte1369 |= 0x2;
				}
			}
			if (tileHeights[i][i_60_] == tileHeights[i + 1][i_60_]
					&& tileHeights[i][i_60_] == tileHeights[i + 1][i_60_ + 1]
					&& tileHeights[i][i_60_] == tileHeights[i][i_60_ + 1]) {
				class108.aByte1369 |= 0x1;
			}
			TextureMetrics class141 = null;
			if (i_90_ != -1) {
				class141 = toolkit.metricsList.get(i_90_);
			}
			if (class141 != null && (class108.aByte1369 & 0x2) == 0 && !class141.aBool1724) {
				class108.aShort1366 = (short) (lighting[i][i_60_] - shadowing[i][i_60_]);
				class108.aShort1367 = (short) (lighting[i + 1][i_60_] - shadowing[i + 1][i_60_]);
				class108.aShort1368 = (short) (lighting[i + 1][i_60_ + 1] - shadowing[i + 1][i_60_ + 1]);
				class108.aShort1365 = (short) (lighting[i][i_60_ + 1] - shadowing[i][i_60_ + 1]);
				class108.aShort1371 = (short) i_90_;
				if (method14062(class141.aByte1719) || class141.aByte1728 != 0 || class141.aByte1700 != 0) {
					class108.aByte1369 |= 0x4;
				}
			} else {
				short i_91_ = HslUtils.hslToHsv(i_89_);
				class108.aShort1366 = (short) Class679.light(i_91_, lighting[i][i_60_] - shadowing[i][i_60_]);
				class108.aShort1367 = (short) Class679.light(i_91_, lighting[i + 1][i_60_] - shadowing[i + 1][i_60_]);
				class108.aShort1368 = (short) Class679.light(i_91_, lighting[i + 1][i_60_ + 1]
						- shadowing[i + 1][i_60_ + 1]);
				class108.aShort1365 = (short) Class679.light(i_91_, lighting[i][i_60_ + 1] - shadowing[i][i_60_ + 1]);
				class108.aShort1371 = (short) -1;
			}
			aClass108ArrayArray8764[i][i_60_] = class108;
		}
	}

	void method14058(int i, int i_99_, int i_100_) {
		JavaThreadResource class64 = toolkit.getThreadResource(Thread.currentThread());
		class64.rasterizer.anInt1375 = 0;
		if (aClass85ArrayArray8759 != null) {
			method14060(i, i_99_, class64.aBool990, class64, class64.rasterizer, class64.aFloatArray978,
					class64.aFloatArray997, class64.aFloatArray985, class64.aFloatArray988, class64.aFloatArray998,
					i_100_);
		} else if (aClass108ArrayArray8764 != null) {
			method14059(i, i_99_, class64.rasterizer, class64.aFloatArray978, class64.aFloatArray997,
					class64.aFloatArray985, class64.aFloatArray988, class64.aFloatArray998, i_100_);
		} else if (aClass90ArrayArray8760 != null) {
			method14061(i, i_99_, class64.aBool990, class64, class64.rasterizer, class64.aFloatArray978,
					class64.aFloatArray997, class64.aFloatArray985, class64.aFloatArray988, class64.aFloatArray998,
					i_100_);
		}
	}

	void method14059(int i, int i_101_, Rasterizer class109, float[] fs, float[] fs_102_, float[] fs_103_,
			float[] fs_104_, float[] fs_105_, int i_106_) {
		Class108 class108 = aClass108ArrayArray8764[i][i_101_];
		if (class108 != null) {
			if ((class108.aByte1369 & 0x2) == 0) {
				if (i_106_ != 0) {
					if ((class108.aByte1369 & 0x4) != 0) {
						if ((i_106_ & 0x1) != 0) {
							return;
						}
					} else if ((i_106_ & 0x2) != 0) {
						return;
					}
				}
				int i_107_ = i * tileUnits * 1668096025;
				int i_108_ = i_107_ + tileUnits * 1668096025;
				int i_109_ = i_101_ * tileUnits * 1668096025;
				int i_110_ = i_109_ + tileUnits * 1668096025;
				float f;
				float f_111_;
				float f_112_;
				float f_113_;
				float f_114_;
				float f_115_;
				float f_116_;
				float f_117_;
				float f_118_;
				float f_119_;
				float f_120_;
				float f_121_;
				float f_122_;
				float f_123_;
				float f_124_;
				float f_125_;
				if ((class108.aByte1369 & 0x1) != 0) {
					int i_126_ = tileHeights[i][i_101_];
					float f_127_ = aFloat8763 * i_126_;
					float f_128_ = aFloat8769 * i_126_;
					float f_129_ = aFloat8776 + (aFloat8751 * i_107_ + f_127_ + aFloat8770 * i_109_);
					f = aFloat8777 + (aFloat8765 * i_107_ + f_128_ + aFloat8762 * i_109_);
					if (f_129_ < -f) {
						return;
					}
					float f_130_ = aFloat8776 + (aFloat8751 * i_108_ + f_127_ + aFloat8770 * i_109_);
					f_111_ = aFloat8777 + (aFloat8765 * i_108_ + f_128_ + aFloat8762 * i_109_);
					if (f_130_ < -f_111_) {
						return;
					}
					float f_131_ = aFloat8776 + (aFloat8751 * i_108_ + f_127_ + aFloat8770 * i_110_);
					f_112_ = aFloat8777 + (aFloat8765 * i_108_ + f_128_ + aFloat8762 * i_110_);
					if (f_131_ < -f_112_) {
						return;
					}
					float f_132_ = aFloat8776 + (aFloat8751 * i_107_ + f_127_ + aFloat8770 * i_110_);
					f_113_ = aFloat8777 + (aFloat8765 * i_107_ + f_128_ + aFloat8762 * i_110_);
					if (f_132_ < -f_113_) {
						return;
					}
					float f_133_ = aFloat8766 * i_126_;
					float f_134_ = aFloat8767 * i_126_;
					float f_135_ = aFloat8757 + (aFloat8761 * i_107_ + f_133_ + aFloat8774 * i_109_);
					f_114_ = class109.aFloat1379 + class109.aFloat1380 * f_135_ / f;
					float f_136_ = aFloat8775 + (aFloat8750 * i_107_ + f_134_ + aFloat8771 * i_109_);
					f_115_ = class109.aFloat1381 + class109.aFloat1374 * f_136_ / f;
					f_116_ = class109.aFloat1386 + class109.aFloat1388 * f_129_ / f;
					float f_137_ = aFloat8757 + (aFloat8761 * i_108_ + f_133_ + aFloat8774 * i_109_);
					f_117_ = class109.aFloat1379 + class109.aFloat1380 * f_137_ / f_111_;
					float f_138_ = aFloat8775 + (aFloat8750 * i_108_ + f_134_ + aFloat8771 * i_109_);
					f_118_ = class109.aFloat1381 + class109.aFloat1374 * f_138_ / f_111_;
					f_119_ = class109.aFloat1386 + class109.aFloat1388 * f_130_ / f_111_;
					float f_139_ = aFloat8757 + (aFloat8761 * i_108_ + f_133_ + aFloat8774 * i_110_);
					f_120_ = class109.aFloat1379 + class109.aFloat1380 * f_139_ / f_112_;
					float f_140_ = aFloat8775 + (aFloat8750 * i_108_ + f_134_ + aFloat8771 * i_110_);
					f_121_ = class109.aFloat1381 + class109.aFloat1374 * f_140_ / f_112_;
					f_122_ = class109.aFloat1386 + class109.aFloat1388 * f_131_ / f_112_;
					float f_141_ = aFloat8757 + (aFloat8761 * i_107_ + f_133_ + aFloat8774 * i_110_);
					f_123_ = class109.aFloat1379 + class109.aFloat1380 * f_141_ / f_113_;
					float f_142_ = aFloat8775 + (aFloat8750 * i_107_ + f_134_ + aFloat8771 * i_110_);
					f_124_ = class109.aFloat1381 + class109.aFloat1374 * f_142_ / f_113_;
					f_125_ = class109.aFloat1386 + class109.aFloat1388 * f_132_ / f_113_;
				} else {
					int i_143_ = tileHeights[i][i_101_];
					int i_144_ = tileHeights[i + 1][i_101_];
					int i_145_ = tileHeights[i + 1][i_101_ + 1];
					int i_146_ = tileHeights[i][i_101_ + 1];
					float f_147_ = aFloat8776 + (aFloat8751 * i_107_ + aFloat8763 * i_143_ + aFloat8770 * i_109_);
					f = aFloat8777 + (aFloat8765 * i_107_ + aFloat8769 * i_143_ + aFloat8762 * i_109_);
					if (f_147_ < -f) {
						return;
					}
					float f_148_ = aFloat8776 + (aFloat8751 * i_108_ + aFloat8763 * i_144_ + aFloat8770 * i_109_);
					f_111_ = aFloat8777 + (aFloat8765 * i_108_ + aFloat8769 * i_144_ + aFloat8762 * i_109_);
					if (f_148_ < -f_111_) {
						return;
					}
					float f_149_ = aFloat8776 + (aFloat8751 * i_108_ + aFloat8763 * i_145_ + aFloat8770 * i_110_);
					f_112_ = aFloat8777 + (aFloat8765 * i_108_ + aFloat8769 * i_145_ + aFloat8762 * i_110_);
					if (f_149_ < -f_112_) {
						return;
					}
					float f_150_ = aFloat8776 + (aFloat8751 * i_107_ + aFloat8763 * i_146_ + aFloat8770 * i_110_);
					f_113_ = aFloat8777 + (aFloat8765 * i_107_ + aFloat8769 * i_146_ + aFloat8762 * i_110_);
					if (f_150_ < -f_113_) {
						return;
					}
					float f_151_ = aFloat8757 + (aFloat8761 * i_107_ + aFloat8766 * i_143_ + aFloat8774 * i_109_);
					f_114_ = class109.aFloat1379 + class109.aFloat1380 * f_151_ / f;
					float f_152_ = aFloat8775 + (aFloat8750 * i_107_ + aFloat8767 * i_143_ + aFloat8771 * i_109_);
					f_115_ = class109.aFloat1381 + class109.aFloat1374 * f_152_ / f;
					f_116_ = class109.aFloat1386 + class109.aFloat1388 * f_147_ / f;
					float f_153_ = aFloat8757 + (aFloat8761 * i_108_ + aFloat8766 * i_144_ + aFloat8774 * i_109_);
					f_117_ = class109.aFloat1379 + class109.aFloat1380 * f_153_ / f_111_;
					float f_154_ = aFloat8775 + (aFloat8750 * i_108_ + aFloat8767 * i_144_ + aFloat8771 * i_109_);
					f_118_ = class109.aFloat1381 + class109.aFloat1374 * f_154_ / f_111_;
					f_119_ = class109.aFloat1386 + class109.aFloat1388 * f_148_ / f_111_;
					float f_155_ = aFloat8757 + (aFloat8761 * i_108_ + aFloat8766 * i_145_ + aFloat8774 * i_110_);
					f_120_ = class109.aFloat1379 + class109.aFloat1380 * f_155_ / f_112_;
					float f_156_ = aFloat8775 + (aFloat8750 * i_108_ + aFloat8767 * i_145_ + aFloat8771 * i_110_);
					f_121_ = class109.aFloat1381 + class109.aFloat1374 * f_156_ / f_112_;
					f_122_ = class109.aFloat1386 + class109.aFloat1388 * f_149_ / f_112_;
					float f_157_ = aFloat8757 + (aFloat8761 * i_107_ + aFloat8766 * i_146_ + aFloat8774 * i_110_);
					f_123_ = class109.aFloat1379 + class109.aFloat1380 * f_157_ / f_113_;
					float f_158_ = aFloat8775 + (aFloat8750 * i_107_ + aFloat8767 * i_146_ + aFloat8771 * i_110_);
					f_124_ = class109.aFloat1381 + class109.aFloat1374 * f_158_ / f_113_;
					f_125_ = class109.aFloat1386 + class109.aFloat1388 * f_150_ / f_113_;
				}
				boolean bool = false;
				if (class108.aShort1371 != -1) {
					TextureMetrics class141 = toolkit.metricsList.get(class108.aShort1371 & 0xffff);
					bool = class141.aBool1698;
				}
				if ((f_120_ - f_123_) * (f_118_ - f_124_) - (f_121_ - f_124_) * (f_117_ - f_123_) > 0.0F) {
					class109.aBool1376 = f_120_ < 0.0F || f_123_ < 0.0F || f_117_ < 0.0F || f_120_ > class109.anInt1395
							|| f_123_ > class109.anInt1395 || f_117_ > class109.anInt1395;
					if (bool) {
						class109.method1995(true, true, false, f_121_, f_124_, f_118_, f_120_, f_123_, f_117_, f_122_,
								f_125_, f_119_, f_112_, f_113_, f_111_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F, ~0xffffff
										| Class335.HSV_TABLE[class108.aShort1368 & 0xffff] & 0xffffff, ~0xffffff
										| Class335.HSV_TABLE[class108.aShort1365 & 0xffff] & 0xffffff, ~0xffffff
										| Class335.HSV_TABLE[class108.aShort1367 & 0xffff] & 0xffffff, 0, 0.0F, 0.0F,
								0.0F, class108.aShort1371 & 0xffff);
					} else {
						class109.method1989(true, true, false, f_121_, f_124_, f_118_, f_120_, f_123_, f_117_, f_122_,
								f_125_, f_119_, class108.aShort1368 & 0xffff, class108.aShort1365 & 0xffff,
								class108.aShort1367 & 0xffff);
					}
				}
				if ((f_114_ - f_117_) * (f_124_ - f_118_) - (f_115_ - f_118_) * (f_123_ - f_117_) > 0.0F) {
					class109.aBool1376 = f_114_ < 0.0F || f_117_ < 0.0F || f_123_ < 0.0F || f_114_ > class109.anInt1395
							|| f_117_ > class109.anInt1395 || f_123_ > class109.anInt1395;
					if (bool) {
						class109.method1995(true, true, false, f_115_, f_118_, f_124_, f_114_, f_117_, f_123_, f_116_,
								f_119_, f_125_, f, f_111_, f_113_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F, ~0xffffff
										| Class335.HSV_TABLE[class108.aShort1366 & 0xffff] & 0xffffff, ~0xffffff
										| Class335.HSV_TABLE[class108.aShort1367 & 0xffff] & 0xffffff, ~0xffffff
										| Class335.HSV_TABLE[class108.aShort1365 & 0xffff] & 0xffffff, 0, 0.0F, 0.0F,
								0.0F, class108.aShort1371 & 0xffff);
					} else {
						class109.method1989(true, true, false, f_115_, f_118_, f_124_, f_114_, f_117_, f_123_, f_116_,
								f_119_, f_125_, class108.aShort1366 & 0xffff, class108.aShort1367 & 0xffff,
								class108.aShort1365 & 0xffff);
					}
				}
			}
		} else {
			Class78 class78 = aClass78ArrayArray8758[i][i_101_];
			if (class78 != null) {
				if (i_106_ != 0) {
					if ((class78.aByte1133 & 0x4) != 0) {
						if ((i_106_ & 0x1) != 0) {
							return;
						}
					} else if ((i_106_ & 0x2) != 0) {
						return;
					}
				}
				for (int i_159_ = 0; i_159_ < class78.aShort1132; i_159_++) {
					int i_160_ = class78.aShortArray1134[i_159_] + (i << tileScale * -333236347);
					short i_161_ = class78.aShortArray1138[i_159_];
					int i_162_ = class78.aShortArray1136[i_159_] + (i_101_ << tileScale * -333236347);
					float f = aFloat8776 + (aFloat8751 * i_160_ + aFloat8763 * i_161_ + aFloat8770 * i_162_);
					float f_163_ = aFloat8777 + (aFloat8765 * i_160_ + aFloat8769 * i_161_ + aFloat8762 * i_162_);
					if (f < -f_163_) {
						return;
					}
					float f_164_ = aFloat8757 + (aFloat8761 * i_160_ + aFloat8766 * i_161_ + aFloat8774 * i_162_);
					float f_165_ = aFloat8775 + (aFloat8750 * i_160_ + aFloat8767 * i_161_ + aFloat8771 * i_162_);
					fs[i_159_] = class109.aFloat1379 + class109.aFloat1380 * f_164_ / f_163_;
					fs_102_[i_159_] = class109.aFloat1381 + class109.aFloat1374 * f_165_ / f_163_;
					fs_103_[i_159_] = class109.aFloat1386 + class109.aFloat1388 * f / f_163_;
					fs_104_[i_159_] = f_163_;
				}
				if (class78.aShortArray1139 != null) {
					for (int i_166_ = 0; i_166_ < class78.aShort1135; i_166_++) {
						short i_167_ = class78.aShortArray1143[i_166_];
						short i_168_ = class78.aShortArray1131[i_166_];
						short i_169_ = class78.aShortArray1140[i_166_];
						float f = fs[i_167_];
						float f_170_ = fs[i_168_];
						float f_171_ = fs[i_169_];
						float f_172_ = fs_102_[i_167_];
						float f_173_ = fs_102_[i_168_];
						float f_174_ = fs_102_[i_169_];
						if ((f - f_170_) * (f_174_ - f_173_) - (f_172_ - f_173_) * (f_171_ - f_170_) > 0.0F) {
							class109.aBool1376 = f < 0.0F || f_170_ < 0.0F || f_171_ < 0.0F || f > class109.anInt1395
									|| f_170_ > class109.anInt1395 || f_171_ > class109.anInt1395;
							boolean bool = false;
							if (class78.aShortArray1139[i_166_] != -1) {
								TextureMetrics class141 = toolkit.metricsList
										.get(class78.aShortArray1139[i_166_] & 0xffff);
								bool = class141.aBool1698;
							}
							if (bool) {
								class109.method1995(true, true, false, f_172_, f_173_, f_174_, f, f_170_, f_171_,
										fs_103_[i_167_], fs_103_[i_168_], fs_103_[i_169_], fs_104_[i_167_],
										fs_104_[i_168_], fs_104_[i_169_], (float) class78.aShortArray1134[i_167_]
												/ (float) (tileUnits * 1668096025),
										(float) class78.aShortArray1134[i_168_] / (float) (tileUnits * 1668096025),
										(float) class78.aShortArray1134[i_169_] / (float) (tileUnits * 1668096025),
										(float) class78.aShortArray1136[i_167_] / (float) (tileUnits * 1668096025),
										(float) class78.aShortArray1136[i_168_] / (float) (tileUnits * 1668096025),
										(float) class78.aShortArray1136[i_169_] / (float) (tileUnits * 1668096025),
										~0xffffff | Class335.HSV_TABLE[class78.aShortArray1137[i_167_] & 0xffff]
												& 0xffffff, ~0xffffff
												| Class335.HSV_TABLE[class78.aShortArray1137[i_168_] & 0xffff]
												& 0xffffff, ~0xffffff
												| Class335.HSV_TABLE[class78.aShortArray1137[i_169_] & 0xffff]
												& 0xffffff, 0, 0.0F, 0.0F, 0.0F,
										class78.aShortArray1139[i_166_] & 0xffff);
							} else {
								int i_175_ = class78.anIntArray1144[i_166_];
								if (i_175_ != -1) {
									class109.method1989(true, true, false, f_172_, f_173_, f_174_, f, f_170_, f_171_,
											fs_103_[i_167_], fs_103_[i_168_], fs_103_[i_169_],
											Class679.light(i_175_, class78.aShortArray1137[i_167_]),
											Class679.light(i_175_, class78.aShortArray1137[i_168_]),
											Class679.light(i_175_, class78.aShortArray1137[i_169_]));
								}
							}
						}
					}
				} else {
					for (int i_176_ = 0; i_176_ < class78.aShort1135; i_176_++) {
						short i_177_ = class78.aShortArray1143[i_176_];
						short i_178_ = class78.aShortArray1131[i_176_];
						short i_179_ = class78.aShortArray1140[i_176_];
						float f = fs[i_177_];
						float f_180_ = fs[i_178_];
						float f_181_ = fs[i_179_];
						float f_182_ = fs_102_[i_177_];
						float f_183_ = fs_102_[i_178_];
						float f_184_ = fs_102_[i_179_];
						if ((f - f_180_) * (f_184_ - f_183_) - (f_182_ - f_183_) * (f_181_ - f_180_) > 0.0F) {
							int i_185_ = class78.anIntArray1144[i_176_];
							if (i_185_ != -1) {
								class109.aBool1376 = f < 0.0F || f_180_ < 0.0F || f_181_ < 0.0F
										|| f > class109.anInt1395 || f_180_ > class109.anInt1395
										|| f_181_ > class109.anInt1395;
								class109.method1989(true, true, false, f_182_, f_183_, f_184_, f, f_180_, f_181_,
										fs_103_[i_177_], fs_103_[i_178_], fs_103_[i_179_],
										Class679.light(i_185_, class78.aShortArray1137[i_177_]),
										Class679.light(i_185_, class78.aShortArray1137[i_178_]),
										Class679.light(i_185_, class78.aShortArray1137[i_179_]));
							}
						}
					}
				}
			}
		}
	}

	void method14060(int i, int i_186_, boolean bool, JavaThreadResource class64, Rasterizer class109, float[] fs,
			float[] fs_187_, float[] fs_188_, float[] fs_189_, float[] fs_190_, int i_191_) {
		Class85 class85 = aClass85ArrayArray8759[i][i_186_];
		if (class85 != null) {
			if ((class85.aByte1219 & 0x2) == 0) {
				if (i_191_ != 0) {
					if ((class85.aByte1219 & 0x4) != 0) {
						if ((i_191_ & 0x1) != 0) {
							return;
						}
					} else if ((i_191_ & 0x2) != 0) {
						return;
					}
				}
				int i_192_ = i * tileUnits * 1668096025;
				int i_193_ = i_192_ + tileUnits * 1668096025;
				int i_194_ = i_186_ * tileUnits * 1668096025;
				int i_195_ = i_194_ + tileUnits * 1668096025;
				float f = 0.0F;
				float f_196_ = 0.0F;
				float f_197_ = 0.0F;
				float f_198_ = 0.0F;
				float f_199_;
				float f_200_;
				float f_201_;
				float f_202_;
				float f_203_;
				float f_204_;
				float f_205_;
				float f_206_;
				float f_207_;
				float f_208_;
				float f_209_;
				float f_210_;
				float f_211_;
				float f_212_;
				float f_213_;
				float f_214_;
				if ((class85.aByte1219 & 0x1) != 0 && !bool) {
					int i_215_ = tileHeights[i][i_186_];
					float f_216_ = aFloat8763 * i_215_;
					float f_217_ = aFloat8769 * i_215_;
					float f_218_ = aFloat8776 + (aFloat8751 * i_192_ + f_216_ + aFloat8770 * i_194_);
					f_199_ = aFloat8777 + (aFloat8765 * i_192_ + f_217_ + aFloat8762 * i_194_);
					if (f_218_ < -f_199_) {
						return;
					}
					float f_219_ = aFloat8776 + (aFloat8751 * i_193_ + f_216_ + aFloat8770 * i_194_);
					f_200_ = aFloat8777 + (aFloat8765 * i_193_ + f_217_ + aFloat8762 * i_194_);
					if (f_219_ < -f_200_) {
						return;
					}
					float f_220_ = aFloat8776 + (aFloat8751 * i_193_ + f_216_ + aFloat8770 * i_195_);
					f_201_ = aFloat8777 + (aFloat8765 * i_193_ + f_217_ + aFloat8762 * i_195_);
					if (f_220_ < -f_201_) {
						return;
					}
					float f_221_ = aFloat8776 + (aFloat8751 * i_192_ + f_216_ + aFloat8770 * i_195_);
					f_202_ = aFloat8777 + (aFloat8765 * i_192_ + f_217_ + aFloat8762 * i_195_);
					if (f_221_ < -f_202_) {
						return;
					}
					f_203_ = class109.aFloat1386 + class109.aFloat1388 * f_218_ / f_199_;
					f_204_ = class109.aFloat1386 + class109.aFloat1388 * f_219_ / f_200_;
					f_205_ = class109.aFloat1386 + class109.aFloat1388 * f_220_ / f_201_;
					f_206_ = class109.aFloat1386 + class109.aFloat1388 * f_221_ / f_202_;
					if (class64.aBool959) {
						float f_222_ = f_218_ - class64.aFloat960;
						if (f_222_ > 0.0F) {
							f = f_222_ / class64.aFloat956;
							if (f > 1.0F) {
								f = 1.0F;
							}
						}
						f_222_ = f_219_ - class64.aFloat960;
						if (f_222_ > 0.0F) {
							f_196_ = f_222_ / class64.aFloat956;
							if (f_196_ > 1.0F) {
								f_196_ = 1.0F;
							}
						}
						f_222_ = f_220_ - class64.aFloat960;
						if (f_222_ > 0.0F) {
							f_197_ = f_222_ / class64.aFloat956;
							if (f_197_ > 1.0F) {
								f_197_ = 1.0F;
							}
						}
						f_222_ = f_221_ - class64.aFloat960;
						if (f_222_ > 0.0F) {
							f_198_ = f_222_ / class64.aFloat956;
							if (f_198_ > 1.0F) {
								f_198_ = 1.0F;
							}
						}
					}
					float f_223_ = aFloat8766 * i_215_;
					float f_224_ = aFloat8767 * i_215_;
					float f_225_ = aFloat8757 + (aFloat8761 * i_192_ + f_223_ + aFloat8774 * i_194_);
					f_207_ = class109.aFloat1379 + class109.aFloat1380 * f_225_ / f_199_;
					float f_226_ = aFloat8775 + (aFloat8750 * i_192_ + f_224_ + aFloat8771 * i_194_);
					f_208_ = class109.aFloat1381 + class109.aFloat1374 * f_226_ / f_199_;
					float f_227_ = aFloat8757 + (aFloat8761 * i_193_ + f_223_ + aFloat8774 * i_194_);
					f_209_ = class109.aFloat1379 + class109.aFloat1380 * f_227_ / f_200_;
					float f_228_ = aFloat8775 + (aFloat8750 * i_193_ + f_224_ + aFloat8771 * i_194_);
					f_210_ = class109.aFloat1381 + class109.aFloat1374 * f_228_ / f_200_;
					float f_229_ = aFloat8757 + (aFloat8761 * i_193_ + f_223_ + aFloat8774 * i_195_);
					f_211_ = class109.aFloat1379 + class109.aFloat1380 * f_229_ / f_201_;
					float f_230_ = aFloat8775 + (aFloat8750 * i_193_ + f_224_ + aFloat8771 * i_195_);
					f_212_ = class109.aFloat1381 + class109.aFloat1374 * f_230_ / f_201_;
					float f_231_ = aFloat8757 + (aFloat8761 * i_192_ + f_223_ + aFloat8774 * i_195_);
					f_213_ = class109.aFloat1379 + class109.aFloat1380 * f_231_ / f_202_;
					float f_232_ = aFloat8775 + (aFloat8750 * i_192_ + f_224_ + aFloat8771 * i_195_);
					f_214_ = class109.aFloat1381 + class109.aFloat1374 * f_232_ / f_202_;
				} else {
					int i_233_ = tileHeights[i][i_186_];
					int i_234_ = tileHeights[i + 1][i_186_];
					int i_235_ = tileHeights[i + 1][i_186_ + 1];
					int i_236_ = tileHeights[i][i_186_ + 1];
					float f_237_ = aFloat8776 + (aFloat8751 * i_192_ + aFloat8763 * i_233_ + aFloat8770 * i_194_);
					f_199_ = aFloat8777 + (aFloat8765 * i_192_ + aFloat8769 * i_233_ + aFloat8762 * i_194_);
					if (f_237_ < -f_199_) {
						return;
					}
					float f_238_ = aFloat8776 + (aFloat8751 * i_193_ + aFloat8763 * i_234_ + aFloat8770 * i_194_);
					f_200_ = aFloat8777 + (aFloat8765 * i_193_ + aFloat8769 * i_234_ + aFloat8762 * i_194_);
					if (f_238_ < -f_200_) {
						return;
					}
					float f_239_ = aFloat8776 + (aFloat8751 * i_193_ + aFloat8763 * i_235_ + aFloat8770 * i_195_);
					f_201_ = aFloat8777 + (aFloat8765 * i_193_ + aFloat8769 * i_235_ + aFloat8762 * i_195_);
					if (f_239_ < -f_201_) {
						return;
					}
					float f_240_ = aFloat8776 + (aFloat8751 * i_192_ + aFloat8763 * i_236_ + aFloat8770 * i_195_);
					f_202_ = aFloat8777 + (aFloat8765 * i_192_ + aFloat8769 * i_236_ + aFloat8762 * i_195_);
					if (f_240_ < -f_202_) {
						return;
					}
					f_203_ = class109.aFloat1386 + class109.aFloat1388 * f_237_ / f_199_;
					f_204_ = class109.aFloat1386 + class109.aFloat1388 * f_238_ / f_200_;
					f_205_ = class109.aFloat1386 + class109.aFloat1388 * f_239_ / f_201_;
					f_206_ = class109.aFloat1386 + class109.aFloat1388 * f_240_ / f_202_;
					if (bool) {
						float f_241_ = f_237_ - class64.aFloat960;
						if (f_241_ > 0.0F) {
							f_241_ /= class64.aFloat956;
							if (f_241_ > 1.0F) {
								f_241_ = 1.0F;
							}
							f = f_241_;
							int i_242_ = (int) (class85.aShort1220 * f_241_);
							if (i_242_ > 0) {
								i_233_ -= i_242_;
							}
						}
						f_241_ = f_238_ - class64.aFloat960;
						if (f_241_ > 0.0F) {
							f_241_ /= class64.aFloat956;
							if (f_241_ > 1.0F) {
								f_241_ = 1.0F;
							}
							f_196_ = f_241_;
							int i_243_ = (int) (class85.aShort1223 * f_241_);
							if (i_243_ > 0) {
								i_234_ -= i_243_;
							}
						}
						f_241_ = f_239_ - class64.aFloat960;
						if (f_241_ > 0.0F) {
							f_241_ /= class64.aFloat956;
							if (f_241_ > 1.0F) {
								f_241_ = 1.0F;
							}
							f_197_ = f_241_;
							int i_244_ = (int) (class85.aShort1227 * f_241_);
							if (i_244_ > 0) {
								i_235_ -= i_244_;
							}
						}
						f_241_ = f_240_ - class64.aFloat960;
						if (f_241_ > 0.0F) {
							f_241_ /= class64.aFloat956;
							if (f_241_ > 1.0F) {
								f_241_ = 1.0F;
							}
							f_198_ = f_241_;
							int i_245_ = (int) (class85.aShort1225 * f_241_);
							if (i_245_ > 0) {
								i_236_ -= i_245_;
							}
						}
					} else if (class64.aBool959) {
						float f_246_ = f_237_ - class64.aFloat960;
						if (f_246_ > 0.0F) {
							f = f_246_ / class64.aFloat956;
							if (f > 1.0F) {
								f = 1.0F;
							}
						}
						f_246_ = f_238_ - class64.aFloat960;
						if (f_246_ > 0.0F) {
							f_196_ = f_246_ / class64.aFloat956;
							if (f_196_ > 1.0F) {
								f_196_ = 1.0F;
							}
						}
						f_246_ = f_239_ - class64.aFloat960;
						if (f_246_ > 0.0F) {
							f_197_ = f_246_ / class64.aFloat956;
							if (f_197_ > 1.0F) {
								f_197_ = 1.0F;
							}
						}
						f_246_ = f_240_ - class64.aFloat960;
						if (f_246_ > 0.0F) {
							f_198_ = f_246_ / class64.aFloat956;
							if (f_198_ > 1.0F) {
								f_198_ = 1.0F;
							}
						}
					}
					float f_247_ = aFloat8757 + (aFloat8761 * i_192_ + aFloat8766 * i_233_ + aFloat8774 * i_194_);
					f_207_ = class109.aFloat1379 + class109.aFloat1380 * f_247_ / f_199_;
					float f_248_ = aFloat8775 + (aFloat8750 * i_192_ + aFloat8767 * i_233_ + aFloat8771 * i_194_);
					f_208_ = class109.aFloat1381 + class109.aFloat1374 * f_248_ / f_199_;
					float f_249_ = aFloat8757 + (aFloat8761 * i_193_ + aFloat8766 * i_234_ + aFloat8774 * i_194_);
					f_209_ = class109.aFloat1379 + class109.aFloat1380 * f_249_ / f_200_;
					float f_250_ = aFloat8775 + (aFloat8750 * i_193_ + aFloat8767 * i_234_ + aFloat8771 * i_194_);
					f_210_ = class109.aFloat1381 + class109.aFloat1374 * f_250_ / f_200_;
					float f_251_ = aFloat8757 + (aFloat8761 * i_193_ + aFloat8766 * i_235_ + aFloat8774 * i_195_);
					f_211_ = class109.aFloat1379 + class109.aFloat1380 * f_251_ / f_201_;
					float f_252_ = aFloat8775 + (aFloat8750 * i_193_ + aFloat8767 * i_235_ + aFloat8771 * i_195_);
					f_212_ = class109.aFloat1381 + class109.aFloat1374 * f_252_ / f_201_;
					float f_253_ = aFloat8757 + (aFloat8761 * i_192_ + aFloat8766 * i_236_ + aFloat8774 * i_195_);
					f_213_ = class109.aFloat1379 + class109.aFloat1380 * f_253_ / f_202_;
					float f_254_ = aFloat8775 + (aFloat8750 * i_192_ + aFloat8767 * i_236_ + aFloat8771 * i_195_);
					f_214_ = class109.aFloat1381 + class109.aFloat1374 * f_254_ / f_202_;
				}
				TextureMetrics class141 = null;
				boolean bool_255_ = false;
				if (class85.aShort1222 != -1) {
					class141 = toolkit.metricsList.get(class85.aShort1222 & 0xffff);
					bool_255_ = class141.aBool1698;
				}
				boolean bool_256_ = class141 != null && method14062(class141.aByte1719);
				float f_257_ = f_196_ + f_197_ + f_198_;
				if ((f_211_ - f_213_) * (f_210_ - f_214_) - (f_212_ - f_214_) * (f_209_ - f_213_) > 0.0F) {
					class109.aBool1376 = f_211_ < 0.0F || f_213_ < 0.0F || f_209_ < 0.0F || f_211_ > class109.anInt1395
							|| f_213_ > class109.anInt1395 || f_209_ > class109.anInt1395;
					if (f_257_ < 3.0F) {
						if (f_257_ > 0.0F) {
							if (bool_255_) {
								int i_258_ = -16777216;
								if (bool_256_) {
									i_258_ = -1694498816;
								}
								class109.method1995(true, true, false, f_212_, f_214_, f_210_, f_211_, f_213_, f_209_,
										f_205_, f_206_, f_204_, f_201_, f_202_, f_200_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F,
										0.0F, i_258_ | class85.anInt1217 & 0xffffff, i_258_ | class85.anInt1221
												& 0xffffff, i_258_ | class85.anInt1224 & 0xffffff,
										class64.fogColour * 1595608531, f_197_ * 255.0F, f_198_ * 255.0F,
										f_196_ * 255.0F, class85.aShort1222 & 0xffff);
							} else {
								if (bool_256_) {
									class109.anInt1375 = 100;
								}
								class109.method1991(
										true,
										true,
										false,
										f_212_,
										f_214_,
										f_210_,
										f_211_,
										f_213_,
										f_209_,
										f_205_,
										f_206_,
										f_204_,
										LoadingRequirement.method582(class85.anInt1217, (int) (f_197_ * 255.0F) << 24
												| class64.fogColour * 1595608531, (byte) 35),
										LoadingRequirement.method582(class85.anInt1221, (int) (f_198_ * 255.0F) << 24
												| class64.fogColour * 1595608531, (byte) 35),
										LoadingRequirement.method582(class85.anInt1224, (int) (f_196_ * 255.0F) << 24
												| class64.fogColour * 1595608531, (byte) 35));
								class109.anInt1375 = 0;
							}
						} else if (bool_255_) {
							int i_259_ = -16777216;
							if (bool_256_) {
								i_259_ = -1694498816;
							}
							class109.method1995(true, true, false, f_212_, f_214_, f_210_, f_211_, f_213_, f_209_,
									f_205_, f_206_, f_204_, f_201_, f_202_, f_200_, 1.0F, 0.0F, 1.0F, 1.0F, 1.0F, 0.0F,
									i_259_ | class85.anInt1217 & 0xffffff, i_259_ | class85.anInt1221 & 0xffffff,
									i_259_ | class85.anInt1224 & 0xffffff, 0, 0.0F, 0.0F, 0.0F,
									class85.aShort1222 & 0xffff);
						} else {
							if (bool_256_) {
								class109.anInt1375 = 100;
							}
							class109.method1991(true, true, false, f_212_, f_214_, f_210_, f_211_, f_213_, f_209_,
									f_205_, f_206_, f_204_, class85.anInt1217, class85.anInt1221, class85.anInt1224);
							class109.anInt1375 = 0;
						}
					} else {
						class109.method1993(true, true, false, f_212_, f_214_, f_210_, f_211_, f_213_, f_209_, f_205_,
								f_206_, f_204_, class64.fogColour * 1595608531);
					}
				}
				f_257_ = f + f_196_ + f_198_;
				if ((f_207_ - f_209_) * (f_214_ - f_210_) - (f_208_ - f_210_) * (f_213_ - f_209_) > 0.0F) {
					class109.aBool1376 = f_207_ < 0.0F || f_209_ < 0.0F || f_213_ < 0.0F || f_207_ > class109.anInt1395
							|| f_209_ > class109.anInt1395 || f_213_ > class109.anInt1395;
					if (f_257_ < 3.0F) {
						if (bool_256_) {
							class109.anInt1375 = -1694498816;
						}
						if (f_257_ > 0.0F) {
							if (bool_255_) {
								int i_260_ = -16777216;
								if (bool_256_) {
									i_260_ = -1694498816;
								}
								class109.method1995(true, true, false, f_208_, f_210_, f_214_, f_207_, f_209_, f_213_,
										f_203_, f_204_, f_206_, f_199_, f_200_, f_202_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F,
										1.0F, i_260_ | class85.anInt1218 & 0xffffff, i_260_ | class85.anInt1224
												& 0xffffff, i_260_ | class85.anInt1221 & 0xffffff,
										class64.fogColour * 1595608531, f * 255.0F, f_196_ * 255.0F, f_198_ * 255.0F,
										class85.aShort1222 & 0xffff);
							} else {
								if (bool_256_) {
									class109.anInt1375 = 100;
								}
								class109.method1991(
										true,
										true,
										false,
										f_208_,
										f_210_,
										f_214_,
										f_207_,
										f_209_,
										f_213_,
										f_203_,
										f_204_,
										f_206_,
										LoadingRequirement.method582(class85.anInt1218, (int) (f * 255.0F) << 24
												| class64.fogColour * 1595608531, (byte) 35),
										LoadingRequirement.method582(class85.anInt1224, (int) (f_196_ * 255.0F) << 24
												| class64.fogColour * 1595608531, (byte) 35),
										LoadingRequirement.method582(class85.anInt1221, (int) (f_198_ * 255.0F) << 24
												| class64.fogColour * 1595608531, (byte) 35));
								class109.anInt1375 = 0;
							}
						} else if (bool_255_) {
							int i_261_ = -16777216;
							if (bool_256_) {
								i_261_ = -1694498816;
							}
							class109.method1995(true, true, false, f_208_, f_210_, f_214_, f_207_, f_209_, f_213_,
									f_203_, f_204_, f_206_, f_199_, f_200_, f_202_, 0.0F, 1.0F, 1.0F, 0.0F, 0.0F, 1.0F,
									i_261_ | class85.anInt1218 & 0xffffff, i_261_ | class85.anInt1224 & 0xffffff,
									i_261_ | class85.anInt1221 & 0xffffff, 0, 0.0F, 0.0F, 0.0F,
									class85.aShort1222 & 0xffff);
						} else {
							if (bool_256_) {
								class109.anInt1375 = 100;
							}
							class109.method1991(true, true, false, f_208_, f_210_, f_214_, f_207_, f_209_, f_213_,
									f_203_, f_204_, f_206_, class85.anInt1218, class85.anInt1224, class85.anInt1221);
							class109.anInt1375 = 0;
						}
					} else {
						class109.method1993(true, true, false, f_208_, f_210_, f_214_, f_207_, f_209_, f_213_, f_203_,
								f_204_, f_206_, class64.fogColour * 1595608531);
					}
				}
			}
		} else {
			Class70 class70 = aClass70ArrayArray8768[i][i_186_];
			if (class70 != null) {
				if (i_191_ != 0) {
					if ((class70.aByte1039 & 0x4) != 0) {
						if ((i_191_ & 0x1) != 0) {
							return;
						}
					} else if ((i_191_ & 0x2) != 0) {
						return;
					}
				}
				for (int i_262_ = 0; i_262_ < class70.aShort1038; i_262_++) {
					int i_263_ = class70.aShortArray1040[i_262_] + (i << tileScale * -333236347);
					int i_264_ = class70.aShortArray1044[i_262_];
					int i_265_ = class70.aShortArray1042[i_262_] + (i_186_ << tileScale * -333236347);
					float f = aFloat8776 + (aFloat8751 * i_263_ + aFloat8763 * i_264_ + aFloat8770 * i_265_);
					float f_266_ = aFloat8777 + (aFloat8765 * i_263_ + aFloat8769 * i_264_ + aFloat8762 * i_265_);
					if (f < -f_266_) {
						return;
					}
					float f_267_ = class109.aFloat1386 + class109.aFloat1388 * f / f_266_;
					fs_190_[i_262_] = 0.0F;
					if (bool) {
						float f_268_ = f - class64.aFloat960;
						if (f_268_ > 0.0F) {
							f_268_ /= class64.aFloat956;
							if (f_268_ > 1.0F) {
								f_268_ = 1.0F;
							}
							fs_190_[i_262_] = f_268_;
							int i_269_ = (int) (class70.aShortArray1043[i_262_] * f_268_);
							if (i_269_ > 0) {
								i_264_ -= i_269_;
							}
						}
					} else if (class64.aBool959) {
						float f_270_ = f - class64.aFloat960;
						if (f_270_ > 0.0F) {
							fs_190_[i_262_] = f_270_ / class64.aFloat956;
							if (fs_190_[i_262_] > 1.0F) {
								fs_190_[i_262_] = 1.0F;
							}
						}
					}
					float f_271_ = aFloat8757 + (aFloat8761 * i_263_ + aFloat8766 * i_264_ + aFloat8774 * i_265_);
					float f_272_ = aFloat8775 + (aFloat8750 * i_263_ + aFloat8767 * i_264_ + aFloat8771 * i_265_);
					fs[i_262_] = class109.aFloat1379 + class109.aFloat1380 * f_271_ / f_266_;
					fs_187_[i_262_] = class109.aFloat1381 + class109.aFloat1374 * f_272_ / f_266_;
					fs_188_[i_262_] = f_267_;
					fs_189_[i_262_] = f_266_;
				}
				if (class70.aShortArray1045 != null) {
					for (int i_273_ = 0; i_273_ < class70.aShort1041; i_273_++) {
						int i_274_ = i_273_ * 3;
						int i_275_ = i_274_ + 1;
						int i_276_ = i_275_ + 1;
						float f = fs[i_274_];
						float f_277_ = fs[i_275_];
						float f_278_ = fs[i_276_];
						float f_279_ = fs_187_[i_274_];
						float f_280_ = fs_187_[i_275_];
						float f_281_ = fs_187_[i_276_];
						float f_282_ = fs_190_[i_274_] + fs_190_[i_275_] + fs_190_[i_276_];
						if ((f - f_277_) * (f_281_ - f_280_) - (f_279_ - f_280_) * (f_278_ - f_277_) > 0.0F) {
							class109.aBool1376 = f < 0.0F || f_277_ < 0.0F || f_278_ < 0.0F || f > class109.anInt1395
									|| f_277_ > class109.anInt1395 || f_278_ > class109.anInt1395;
							TextureMetrics class141 = null;
							boolean bool_283_ = false;
							if (class70.aShortArray1045[i_273_] != -1) {
								class141 = toolkit.metricsList.get(class70.aShortArray1045[i_273_] & 0xffff);
								bool_283_ = class141.aBool1698;
							}
							if (f_282_ < 3.0F) {
								if (f_282_ > 0.0F) {
									if (bool_283_) {
										int i_284_ = -16777216;
										if (method14062(class141.aByte1719)) {
											i_284_ = -1694498816;
										}
										class109.method1995(true, true, false, f_279_, f_280_, f_281_, f, f_277_,
												f_278_, fs_188_[i_274_], fs_188_[i_275_], fs_188_[i_276_],
												fs_189_[i_274_], fs_189_[i_275_], fs_189_[i_276_],
												(float) class70.aShortArray1040[i_274_]
														/ (float) (tileUnits * 1668096025),
												(float) class70.aShortArray1040[i_275_]
														/ (float) (tileUnits * 1668096025),
												(float) class70.aShortArray1040[i_276_]
														/ (float) (tileUnits * 1668096025),
												(float) class70.aShortArray1042[i_274_]
														/ (float) (tileUnits * 1668096025),
												(float) class70.aShortArray1042[i_275_]
														/ (float) (tileUnits * 1668096025),
												(float) class70.aShortArray1042[i_276_]
														/ (float) (tileUnits * 1668096025), i_284_
														| class70.anIntArray1037[i_274_] & 0xffffff, i_284_
														| class70.anIntArray1037[i_275_] & 0xffffff, i_284_
														| class70.anIntArray1037[i_276_] & 0xffffff,
												class64.fogColour * 1595608531, fs_190_[i_274_] * 255.0F,
												fs_190_[i_275_] * 255.0F, fs_190_[i_276_] * 255.0F,
												class70.aShortArray1045[i_273_] & 0xffff);
									} else if ((class70.anIntArray1037[i_274_] & 0xffffff) != 0) {
										class109.method1991(true, true, false, f_279_, f_280_, f_281_, f, f_277_,
												f_278_, fs_188_[i_274_], fs_188_[i_275_], fs_188_[i_276_],
												LoadingRequirement.method582(class70.anIntArray1037[i_274_],
														(int) (fs_190_[i_274_] * 255.0F) << 24 | class64.fogColour
																* 1595608531, (byte) 35), LoadingRequirement.method582(
														class70.anIntArray1037[i_275_],
														(int) (fs_190_[i_275_] * 255.0F) << 24 | class64.fogColour
																* 1595608531, (byte) 35), LoadingRequirement.method582(
														class70.anIntArray1037[i_276_],
														(int) (fs_190_[i_276_] * 255.0F) << 24 | class64.fogColour
																* 1595608531, (byte) 35));
										class109.anInt1375 = 0;
									}
								} else if (bool_283_) {
									int i_285_ = -16777216;
									if (method14062(class141.aByte1719)) {
										i_285_ = -1694498816;
									}
									class109.method1995(true, true, false, f_279_, f_280_, f_281_, f, f_277_, f_278_,
											fs_188_[i_274_], fs_188_[i_275_], fs_188_[i_276_], fs_189_[i_274_],
											fs_189_[i_275_], fs_189_[i_276_], (float) class70.aShortArray1040[i_274_]
													/ (float) (tileUnits * 1668096025),
											(float) class70.aShortArray1040[i_275_] / (float) (tileUnits * 1668096025),
											(float) class70.aShortArray1040[i_276_] / (float) (tileUnits * 1668096025),
											(float) class70.aShortArray1042[i_274_] / (float) (tileUnits * 1668096025),
											(float) class70.aShortArray1042[i_275_] / (float) (tileUnits * 1668096025),
											(float) class70.aShortArray1042[i_276_] / (float) (tileUnits * 1668096025),
											i_285_ | class70.anIntArray1037[i_274_] & 0xffffff, i_285_
													| class70.anIntArray1037[i_275_] & 0xffffff, i_285_
													| class70.anIntArray1037[i_276_] & 0xffffff, 0, 0.0F, 0.0F, 0.0F,
											class70.aShortArray1045[i_273_] & 0xffff);
								} else if ((class70.anIntArray1037[i_274_] & 0xffffff) != 0) {
									class109.method1991(true, true, false, f_279_, f_280_, f_281_, f, f_277_, f_278_,
											fs_188_[i_274_], fs_188_[i_275_], fs_188_[i_276_],
											class70.anIntArray1037[i_274_], class70.anIntArray1037[i_275_],
											class70.anIntArray1037[i_276_]);
									class109.anInt1375 = 0;
								}
							} else {
								class109.method1993(true, true, false, f_279_, f_280_, f_281_, f, f_277_, f_278_,
										fs_188_[i_274_], fs_188_[i_275_], fs_188_[i_276_],
										class64.fogColour * 1595608531);
							}
						}
					}
				} else {
					for (int i_286_ = 0; i_286_ < class70.aShort1041; i_286_++) {
						int i_287_ = i_286_ * 3;
						int i_288_ = i_287_ + 1;
						int i_289_ = i_288_ + 1;
						float f = fs[i_287_];
						float f_290_ = fs[i_288_];
						float f_291_ = fs[i_289_];
						float f_292_ = fs_187_[i_287_];
						float f_293_ = fs_187_[i_288_];
						float f_294_ = fs_187_[i_289_];
						float f_295_ = fs_190_[i_287_] + fs_190_[i_288_] + fs_190_[i_289_];
						if ((f - f_290_) * (f_294_ - f_293_) - (f_292_ - f_293_) * (f_291_ - f_290_) > 0.0F) {
							class109.aBool1376 = f < 0.0F || f_290_ < 0.0F || f_291_ < 0.0F || f > class109.anInt1395
									|| f_290_ > class109.anInt1395 || f_291_ > class109.anInt1395;
							if (f_295_ < 3.0F) {
								if (f_295_ > 0.0F) {
									if ((class70.anIntArray1037[i_287_] & 0xffffff) != 0) {
										class109.method1991(true, true, false, f_292_, f_293_, f_294_, f, f_290_,
												f_291_, fs_188_[i_287_], fs_188_[i_288_], fs_188_[i_289_], Class360
														.blendColours(class70.anIntArray1037[i_287_],
																class64.fogColour * 1595608531,
																fs_190_[i_287_] * 255.0F), Class360.blendColours(
														class70.anIntArray1037[i_288_], class64.fogColour * 1595608531,
														fs_190_[i_288_] * 255.0F), Class360.blendColours(
														class70.anIntArray1037[i_289_], class64.fogColour * 1595608531,
														fs_190_[i_289_] * 255.0F));
									}
								} else if ((class70.anIntArray1037[i_287_] & 0xffffff) != 0) {
									class109.method1991(true, true, false, f_292_, f_293_, f_294_, f, f_290_, f_291_,
											fs_188_[i_287_], fs_188_[i_288_], fs_188_[i_289_],
											class70.anIntArray1037[i_287_], class70.anIntArray1037[i_288_],
											class70.anIntArray1037[i_289_]);
								}
							} else {
								class109.method1993(true, true, false, f_292_, f_293_, f_294_, f, f_290_, f_291_,
										fs_188_[i_287_], fs_188_[i_288_], fs_188_[i_289_],
										class64.fogColour * 1595608531);
							}
						}
					}
				}
			}
		}
	}

	void method14061(int i, int i_296_, boolean bool, JavaThreadResource class64, Rasterizer class109, float[] fs,
			float[] fs_297_, float[] fs_298_, float[] fs_299_, float[] fs_300_, int i_301_) {
		Class90 class90 = aClass90ArrayArray8760[i][i_296_];
		if (i_301_ == 0 || (i_301_ & 0x2) == 0) {
			if (class90 != null) {
				for (int i_302_ = 0; i_302_ < class90.aShort1247; i_302_++) {
					int i_303_ = class90.aShortArray1248[i_302_] + (i << tileScale * -333236347);
					int i_304_ = class90.aShortArray1249[i_302_];
					int i_305_ = class90.aShortArray1250[i_302_] + (i_296_ << tileScale * -333236347);
					float f = aFloat8776 + (aFloat8751 * i_303_ + aFloat8763 * i_304_ + aFloat8770 * i_305_);
					float f_306_ = aFloat8777 + (aFloat8765 * i_303_ + aFloat8769 * i_304_ + aFloat8762 * i_305_);
					if (f < -f_306_) {
						return;
					}
					fs_300_[i_302_] = 0.0F;
					if (bool) {
						float f_307_ = f - class64.aFloat960;
						if (f_307_ > 0.0F) {
							f_307_ /= class64.aFloat956;
							if (f_307_ > 1.0F) {
								f_307_ = 1.0F;
							}
							fs_300_[i_302_] = f_307_;
							int i_308_ = (int) (class90.aShortArray1251[i_302_] * f_307_);
							if (i_308_ > 0) {
								i_304_ -= i_308_;
							}
						}
					} else if (class64.aBool959) {
						float f_309_ = f - class64.aFloat960;
						if (f_309_ > 0.0F) {
							fs_300_[i_302_] = f_309_ / class64.aFloat956;
							if (fs_300_[i_302_] > 1.0F) {
								fs_300_[i_302_] = 1.0F;
							}
						}
					}
					float f_310_ = aFloat8757 + (aFloat8761 * i_303_ + aFloat8766 * i_304_ + aFloat8774 * i_305_);
					float f_311_ = aFloat8775 + (aFloat8750 * i_303_ + aFloat8767 * i_304_ + aFloat8771 * i_305_);
					fs[i_302_] = class109.aFloat1379 + class109.aFloat1380 * f_310_ / f_306_;
					fs_297_[i_302_] = class109.aFloat1381 + class109.aFloat1374 * f_311_ / f_306_;
					fs_298_[i_302_] = class109.aFloat1386 + class109.aFloat1388 * f / f_306_;
					fs_299_[i_302_] = f_306_;
				}
				float f = tileUnits * 1668096025;
				for (int i_312_ = 0; i_312_ < class90.aShort1253; i_312_++) {
					int i_313_ = i_312_ * 3;
					int i_314_ = i_313_ + 1;
					int i_315_ = i_314_ + 1;
					float f_316_ = fs[i_313_];
					float f_317_ = fs[i_314_];
					float f_318_ = fs[i_315_];
					float f_319_ = fs_297_[i_313_];
					float f_320_ = fs_297_[i_314_];
					float f_321_ = fs_297_[i_315_];
					if ((f_316_ - f_317_) * (f_321_ - f_320_) - (f_319_ - f_320_) * (f_318_ - f_317_) > 0.0F) {
						class109.aBool1376 = f_316_ < 0.0F || f_317_ < 0.0F || f_318_ < 0.0F
								|| f_316_ > class109.anInt1395 || f_317_ > class109.anInt1395
								|| f_318_ > class109.anInt1395;
						if (fs_300_[i_313_] + fs_300_[i_314_] + fs_300_[i_315_] < 3.0F) {
							int i_322_ = i << tileScale * -333236347;
							int i_323_ = i_296_ << tileScale * -333236347;
							if ((class90.anIntArray1246[i_313_] & 0xffffff) != 0) {
								if (class90.aShortArray1252[i_313_] != -1 && class90.aShortArray1252[i_314_] != -1
										&& class90.aShortArray1252[i_315_] != -1) {
									if (class90.aShortArray1252[i_313_] == class90.aShortArray1252[i_314_]
											&& class90.aShortArray1252[i_313_] == class90.aShortArray1252[i_315_]
											&& class90.aShortArray1256[i_313_] == class90.aShortArray1256[i_314_]
											&& class90.aShortArray1256[i_313_] == class90.aShortArray1256[i_315_]) {
										class109.method1995(true, true, false, f_319_, f_320_, f_321_, f_316_, f_317_,
												f_318_, fs_298_[i_313_], fs_298_[i_314_], fs_298_[i_315_],
												fs_299_[i_313_], fs_299_[i_314_], fs_299_[i_315_],
												(float) (i_322_ + class90.aShortArray1248[i_313_])
														/ (float) class90.aShortArray1256[i_313_],
												(float) (i_322_ + class90.aShortArray1248[i_314_])
														/ (float) class90.aShortArray1256[i_314_],
												(float) (i_322_ + class90.aShortArray1248[i_315_])
														/ (float) class90.aShortArray1256[i_315_],
												(float) (i_323_ + class90.aShortArray1250[i_313_])
														/ (float) class90.aShortArray1256[i_313_],
												(float) (i_323_ + class90.aShortArray1250[i_314_])
														/ (float) class90.aShortArray1256[i_314_],
												(float) (i_323_ + class90.aShortArray1250[i_315_])
														/ (float) class90.aShortArray1256[i_315_],
												class90.anIntArray1246[i_313_], class90.anIntArray1246[i_314_],
												class90.anIntArray1246[i_315_], class64.fogColour * 1595608531,
												fs_300_[i_313_] * 255.0F, fs_300_[i_314_] * 255.0F,
												fs_300_[i_315_] * 255.0F, class90.aShortArray1252[i_313_] & 0xffff);
									} else {
										class109.method1994(true, true, false, f_319_, f_320_, f_321_, f_316_, f_317_,
												f_318_, fs_298_[i_313_], fs_298_[i_314_], fs_298_[i_315_],
												fs_299_[i_313_], fs_299_[i_314_], fs_299_[i_315_],
												(i_322_ + class90.aShortArray1248[i_313_]) / f,
												(i_322_ + class90.aShortArray1248[i_314_]) / f,
												(i_322_ + class90.aShortArray1248[i_315_]) / f,
												(i_323_ + class90.aShortArray1250[i_313_]) / f,
												(i_323_ + class90.aShortArray1250[i_314_]) / f,
												(i_323_ + class90.aShortArray1250[i_315_]) / f,
												class90.anIntArray1246[i_313_], class90.anIntArray1246[i_314_],
												class90.anIntArray1246[i_315_], class64.fogColour * 1595608531,
												fs_300_[i_313_] * 255.0F, fs_300_[i_314_] * 255.0F,
												fs_300_[i_315_] * 255.0F, class90.aShortArray1252[i_313_] & 0xffff, f
														/ class90.aShortArray1256[i_313_],
												class90.aShortArray1252[i_314_] & 0xffff, f
														/ class90.aShortArray1256[i_314_],
												class90.aShortArray1252[i_315_] & 0xffff, f
														/ class90.aShortArray1256[i_315_]);
									}
								} else if (fs_300_[i_313_] + fs_300_[i_314_] + fs_300_[i_315_] > 0.0F) {
									class109.method1991(true, true, false, f_319_, f_320_, f_321_, f_316_, f_317_,
											f_318_, fs_298_[i_313_], fs_298_[i_314_], fs_298_[i_315_], Class360
													.blendColours(class90.anIntArray1246[i_313_],
															class64.fogColour * 1595608531, fs_300_[i_313_] * 255.0F),
											Class360.blendColours(class90.anIntArray1246[i_314_],
													class64.fogColour * 1595608531, fs_300_[i_314_] * 255.0F), Class360
													.blendColours(class90.anIntArray1246[i_315_],
															class64.fogColour * 1595608531, fs_300_[i_315_] * 255.0F));
								} else {
									class109.method1991(true, true, false, f_319_, f_320_, f_321_, f_316_, f_317_,
											f_318_, fs_298_[i_313_], fs_298_[i_314_], fs_298_[i_315_],
											class90.anIntArray1246[i_313_], class90.anIntArray1246[i_314_],
											class90.anIntArray1246[i_315_]);
								}
							}
						} else {
							class109.method1993(true, true, false, f_319_, f_320_, f_321_, f_316_, f_317_, f_318_,
									fs_298_[i_313_], fs_298_[i_314_], fs_298_[i_315_], class64.fogColour * 1595608531);
						}
					}
				}
			}
		}
	}

	boolean method14062(int i) {
		if ((anInt8756 & 0x8) == 0) {
			return false;
		}
		if (i == 4) {
			return true;
		}
		if (i == 8) {
			return true;
		}
		return i == 9;
	}

	void method14063(int i, int i_346_, int i_347_, int i_348_, int i_349_, int i_350_, int i_351_, boolean[][] bools,
			JavaThreadResource class64, Rasterizer class109, float[] fs, float[] fs_352_) {
		int i_353_ = (i_351_ - i_349_) * i_347_ / 256;
		int i_354_ = i_347_ >> 8;
		boolean bool = class64.aBool967;
		toolkit.method2473(false);
		class109.aBool1373 = false;
		class109.aBool1396 = false;
		int i_355_ = i;
		int i_356_ = i_346_ + i_353_;
		for (int i_357_ = i_348_; i_357_ < i_350_; i_357_++) {
			for (int i_358_ = i_349_; i_358_ < i_351_; i_358_++) {
				if (bools[i_357_ - i_348_][i_358_ - i_349_]) {
					if (aClass108ArrayArray8764[i_357_][i_358_] != null) {
						Class108 class108 = aClass108ArrayArray8764[i_357_][i_358_];
						if (class108.aShort1371 != -1 && (class108.aByte1369 & 0x2) == 0 && class108.anInt1370 == -1) {
							int i_359_ = toolkit.getTextureColour(class108.aShort1371 & 0xffff);
							class109.method1989(true, true, false, i_356_ - i_354_, i_356_ - i_354_, i_356_, i_355_
									+ i_354_, i_355_, i_355_ + i_354_, 100.0F, 100.0F, 100.0F,
									Class679.light(i_359_, class108.aShort1368 & 0xffff),
									Class679.light(i_359_, class108.aShort1365 & 0xffff),
									Class679.light(i_359_, class108.aShort1367 & 0xffff));
							class109.method1989(true, true, false, i_356_, i_356_, i_356_ - i_354_, i_355_, i_355_
									+ i_354_, i_355_, 100.0F, 100.0F, 100.0F,
									Class679.light(i_359_, class108.aShort1366 & 0xffff),
									Class679.light(i_359_, class108.aShort1367 & 0xffff),
									Class679.light(i_359_, class108.aShort1365 & 0xffff));
						} else if (class108.anInt1370 == -1) {
							class109.method1989(true, true, false, i_356_ - i_354_, i_356_ - i_354_, i_356_, i_355_
									+ i_354_, i_355_, i_355_ + i_354_, 100.0F, 100.0F, 100.0F,
									class108.aShort1368 & 0xffff, class108.aShort1365 & 0xffff,
									class108.aShort1367 & 0xffff);
							class109.method1989(true, true, false, i_356_, i_356_, i_356_ - i_354_, i_355_, i_355_
									+ i_354_, i_355_, 100.0F, 100.0F, 100.0F, class108.aShort1366 & 0xffff,
									class108.aShort1367 & 0xffff, class108.aShort1365 & 0xffff);
						} else {
							int i_360_ = class108.anInt1370;
							class109.method1989(true, true, false, i_356_ - i_354_, i_356_ - i_354_, i_356_, i_355_
									+ i_354_, i_355_, i_355_ + i_354_, 100.0F, 100.0F, 100.0F, i_360_, i_360_, i_360_);
							class109.method1989(true, true, false, i_356_, i_356_, i_356_ - i_354_, i_355_, i_355_
									+ i_354_, i_355_, 100.0F, 100.0F, 100.0F, i_360_, i_360_, i_360_);
						}
					} else if (aClass78ArrayArray8758[i_357_][i_358_] != null) {
						Class78 class78 = aClass78ArrayArray8758[i_357_][i_358_];
						for (int i_361_ = 0; i_361_ < class78.aShort1132; i_361_++) {
							fs[i_361_] = i_355_ + class78.aShortArray1134[i_361_] * i_354_ / (tileUnits * 1668096025);
							fs_352_[i_361_] = i_356_ - class78.aShortArray1136[i_361_] * i_354_
									/ (tileUnits * 1668096025);
						}
						for (int i_362_ = 0; i_362_ < class78.aShort1135; i_362_++) {
							short i_363_ = class78.aShortArray1143[i_362_];
							short i_364_ = class78.aShortArray1131[i_362_];
							short i_365_ = class78.aShortArray1140[i_362_];
							float f = fs[i_363_];
							float f_366_ = fs[i_364_];
							float f_367_ = fs[i_365_];
							float f_368_ = fs_352_[i_363_];
							float f_369_ = fs_352_[i_364_];
							float f_370_ = fs_352_[i_365_];
							if (class78.anIntArray1141 != null && class78.anIntArray1141[i_362_] != -1) {
								int i_371_ = class78.anIntArray1141[i_362_];
								class109.method1989(true, true, false, f_368_, f_369_, f_370_, f, f_366_, f_367_,
										100.0F, 100.0F, 100.0F,
										Class679.light(i_371_, class78.aShortArray1137[i_363_]),
										Class679.light(i_371_, class78.aShortArray1137[i_364_]),
										Class679.light(i_371_, class78.aShortArray1137[i_365_]));
							} else if (class78.aShortArray1139 != null && class78.aShortArray1139[i_362_] != -1) {
								int i_372_ = toolkit.getTextureColour(class78.aShortArray1139[i_362_] & 0xffff);
								class109.method1989(true, true, false, f_368_, f_369_, f_370_, f, f_366_, f_367_,
										100.0F, 100.0F, 100.0F,
										Class679.light(i_372_, class78.aShortArray1137[i_363_]),
										Class679.light(i_372_, class78.aShortArray1137[i_364_]),
										Class679.light(i_372_, class78.aShortArray1137[i_365_]));
							} else {
								int i_373_ = class78.anIntArray1144[i_362_];
								class109.method1989(true, true, false, f_368_, f_369_, f_370_, f, f_366_, f_367_,
										100.0F, 100.0F, 100.0F,
										Class679.light(i_373_, class78.aShortArray1137[i_363_]),
										Class679.light(i_373_, class78.aShortArray1137[i_364_]),
										Class679.light(i_373_, class78.aShortArray1137[i_365_]));
							}
						}
					}
				}
				i_356_ -= i_354_;
			}
			i_356_ = i_346_ + i_353_;
			i_355_ += i_354_;
		}
		class109.aBool1373 = true;
		toolkit.method2473(bool);
	}

	void method14064(int i, int i_380_, int i_381_, int i_382_, int i_383_, int i_384_, int i_385_, boolean[][] bools,
			JavaThreadResource class64, Rasterizer class109, float[] fs, float[] fs_386_) {
		int i_387_ = (i_385_ - i_383_) * i_381_ / 256;
		int i_388_ = i_381_ >> 8;
		boolean bool = class64.aBool967;
		toolkit.method2473(false);
		class109.aBool1373 = false;
		class109.aBool1396 = false;
		int i_389_ = i;
		int i_390_ = i_380_ + i_387_;
		for (int i_391_ = i_382_; i_391_ < i_384_; i_391_++) {
			for (int i_392_ = i_383_; i_392_ < i_385_; i_392_++) {
				if (bools[i_391_ - i_382_][i_392_ - i_383_]) {
					if (aClass85ArrayArray8759 != null) {
						if (aClass85ArrayArray8759[i_391_][i_392_] != null) {
							Class85 class85 = aClass85ArrayArray8759[i_391_][i_392_];
							if (class85.aShort1222 != -1 && (class85.aByte1219 & 0x2) == 0 && class85.anInt1226 == 0) {
								int i_393_ = toolkit.getTextureColour(class85.aShort1222 & 0xffff);
								class109.method1989(true, true, false, i_390_ - i_388_, i_390_ - i_388_, i_390_, i_389_
										+ i_388_, i_389_, i_389_ + i_388_, 100.0F, 100.0F, 100.0F,
										Class679.light(i_393_, class85.anInt1217),
										Class679.light(i_393_, class85.anInt1221),
										Class679.light(i_393_, class85.anInt1224));
								class109.method1989(true, true, false, i_390_, i_390_, i_390_ - i_388_, i_389_, i_389_
										+ i_388_, i_389_, 100.0F, 100.0F, 100.0F,
										Class679.light(i_393_, class85.anInt1218),
										Class679.light(i_393_, class85.anInt1224),
										Class679.light(i_393_, class85.anInt1221));
							} else if (class85.anInt1226 == 0) {
								class109.method1991(true, true, false, i_390_ - i_388_, i_390_ - i_388_, i_390_, i_389_
										+ i_388_, i_389_, i_389_ + i_388_, 100.0F, 100.0F, 100.0F, class85.anInt1217,
										class85.anInt1221, class85.anInt1224);
								class109.method1991(true, true, false, i_390_, i_390_, i_390_ - i_388_, i_389_, i_389_
										+ i_388_, i_389_, 100.0F, 100.0F, 100.0F, class85.anInt1218, class85.anInt1224,
										class85.anInt1221);
							} else {
								int i_394_ = class85.anInt1226;
								class109.method1991(true, true, false, i_390_ - i_388_, i_390_ - i_388_, i_390_, i_389_
										+ i_388_, i_389_, i_389_ + i_388_, 100.0F, 100.0F, 100.0F,
										LoadingRequirement.method582(i_394_, class85.anInt1217 & ~0xffffff, (byte) 35),
										LoadingRequirement.method582(i_394_, class85.anInt1221 & ~0xffffff, (byte) 35),
										LoadingRequirement.method582(i_394_, class85.anInt1224 & ~0xffffff, (byte) 35));
								class109.method1991(true, true, false, i_390_, i_390_, i_390_ - i_388_, i_389_, i_389_
										+ i_388_, i_389_, 100.0F, 100.0F, 100.0F,
										LoadingRequirement.method582(i_394_, class85.anInt1218 & ~0xffffff, (byte) 35),
										LoadingRequirement.method582(i_394_, class85.anInt1224 & ~0xffffff, (byte) 35),
										LoadingRequirement.method582(i_394_, class85.anInt1221 & ~0xffffff, (byte) 35));
							}
						} else if (aClass70ArrayArray8768[i_391_][i_392_] != null) {
							Class70 class70 = aClass70ArrayArray8768[i_391_][i_392_];
							for (int i_395_ = 0; i_395_ < class70.aShort1038; i_395_++) {
								fs[i_395_] = i_389_ + class70.aShortArray1040[i_395_] * i_388_
										/ (tileUnits * 1668096025);
								fs_386_[i_395_] = i_390_ - class70.aShortArray1042[i_395_] * i_388_
										/ (tileUnits * 1668096025);
							}
							for (int i_396_ = 0; i_396_ < class70.aShort1041; i_396_++) {
								int i_397_ = i_396_ * 3;
								int i_398_ = i_397_ + 1;
								int i_399_ = i_398_ + 1;
								float f = fs[i_397_];
								float f_400_ = fs[i_398_];
								float f_401_ = fs[i_399_];
								float f_402_ = fs_386_[i_397_];
								float f_403_ = fs_386_[i_398_];
								float f_404_ = fs_386_[i_399_];
								if (class70.anIntArray1047 != null
										&& class70.anIntArray1047[i_396_] != 0
										&& (class70.aShortArray1045 == null || class70.aShortArray1045 != null
												&& class70.aShortArray1045[i_396_] == -1)) {
									int i_405_ = class70.anIntArray1047[i_396_];
									class109.method1991(
											true,
											true,
											false,
											f_402_,
											f_403_,
											f_404_,
											f,
											f_400_,
											f_401_,
											100.0F,
											100.0F,
											100.0F,
											LoadingRequirement.method582(i_405_, -16777216
													- (class70.anIntArray1037[i_397_] & ~0xffffff), (byte) 35),
											LoadingRequirement.method582(i_405_, -16777216
													- (class70.anIntArray1037[i_398_] & ~0xffffff), (byte) 35),
											LoadingRequirement.method582(i_405_, -16777216
													- (class70.anIntArray1037[i_399_] & ~0xffffff), (byte) 35));
								} else if (class70.aShortArray1045 != null && class70.aShortArray1045[i_396_] != -1) {
									int i_406_ = toolkit.getTextureColour(class70.aShortArray1045[i_396_] & 0xffff);
									class109.method1989(true, true, false, f_402_, f_403_, f_404_, f, f_400_, f_401_,
											100.0F, 100.0F, 100.0F, i_406_, i_406_, i_406_);
								} else {
									class109.method1991(true, true, false, f_402_, f_403_, f_404_, f, f_400_, f_401_,
											100.0F, 100.0F, 100.0F, class70.anIntArray1037[i_397_],
											class70.anIntArray1037[i_398_], class70.anIntArray1037[i_399_]);
								}
							}
						}
					} else if (aClass90ArrayArray8760[i_391_][i_392_] != null) {
						Class90 class90 = aClass90ArrayArray8760[i_391_][i_392_];
						for (int i_407_ = 0; i_407_ < class90.aShort1247; i_407_++) {
							fs[i_407_] = i_389_ + class90.aShortArray1248[i_407_] * i_388_ / (tileUnits * 1668096025);
							fs_386_[i_407_] = i_390_ - class90.aShortArray1250[i_407_] * i_388_
									/ (tileUnits * 1668096025);
						}
						for (int i_408_ = 0; i_408_ < class90.aShort1253; i_408_++) {
							int i_409_ = i_408_ * 3;
							int i_410_ = i_409_ + 1;
							int i_411_ = i_410_ + 1;
							float f = fs[i_409_];
							float f_412_ = fs[i_410_];
							float f_413_ = fs[i_411_];
							float f_414_ = fs_386_[i_409_];
							float f_415_ = fs_386_[i_410_];
							float f_416_ = fs_386_[i_411_];
							if (class90.anIntArray1254 != null && class90.anIntArray1254[i_408_] != 0) {
								int i_417_ = class90.anIntArray1254[i_408_];
								class109.method1991(true, true, false, f_414_, f_415_, f_416_, f, f_412_, f_413_,
										100.0F, 100.0F, 100.0F, i_417_, i_417_, i_417_);
							} else {
								class109.method1991(true, true, false, f_414_, f_415_, f_416_, f, f_412_, f_413_,
										100.0F, 100.0F, 100.0F, class90.anIntArray1246[i_409_],
										class90.anIntArray1246[i_410_], class90.anIntArray1246[i_411_]);
							}
						}
					}
				}
				i_390_ -= i_388_;
			}
			i_390_ = i_380_ + i_387_;
			i_389_ += i_388_;
		}
		class109.aBool1373 = true;
		toolkit.method2473(bool);
	}

	public static int blendColours(int first, int second, int alpha) {
		int invertedAlpha = 255 - alpha;
		second = (alpha * (second & 0xff00ff) & ~0xff00ff | (second & 0xff00) * alpha & 0xff0000) >>> 8;
		return (((first & 0xff00ff) * invertedAlpha & ~0xff00ff | invertedAlpha * (first & 0xff00) & 0xff0000) >>> 8)
				+ second;
	}
}
