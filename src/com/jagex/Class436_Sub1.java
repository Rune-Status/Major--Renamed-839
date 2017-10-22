package com.jagex;

public class Class436_Sub1 extends Class436 {
	static int[] anIntArray9927;
	static boolean aBool9928;
	static int[] anIntArray9929;
	static final int anInt9930 = 1;
	static final int anInt9931 = 2;
	static final int anInt9932 = 3;
	static int[] anIntArray9933;
	static final int anInt9934 = 0;
	static boolean aBool9935 = false;
	static int[] anIntArray9936;
	static {
		anIntArray9933 = new int[] { 1, 0, -1, 0 };
		anIntArray9927 = new int[] { 0, -1, 0, 1 };
		anIntArray9929 = new int[] { 1, -1, -1, 1 };
		anIntArray9936 = new int[] { -1, -1, 1, 1 };
	}
	int anInt9937 = -1077669075;
	Class575 aClass575_9938;

	ObjectDefinitionLoader loader;

	public Class436_Sub1(Class490 class490, ObjectDefinitionLoader loader, int i, int i_34_, int i_35_, boolean bool,
			TileFlags flags, Class575 class575) {
		super(class490, i, i_34_, i_35_, bool, OverlayDefinition.loader, UnderlayDefinition.loader, flags);
		this.loader = loader;
		aClass575_9938 = class575;
	}

	public final void method15408(Toolkit toolkit, Buffer buffer, int i, int i_0_) {
		if (!underwater) {
			buffer.offset += 1475202440;
			boolean bool = false;
			Class569 class569 = null;
			boolean bool_2_ = false;

			while (-165875887 * buffer.offset < buffer.payload.length) {
				int i_3_ = buffer.readUByte();
				if (0 == i_3_) {
					if (null == class569) {
						class569 = new Class569(buffer, aClass575_9938);
					} else {
						class569.method9592(buffer, aClass575_9938);
					}
				} else if (1 == i_3_) {
					int i_4_ = buffer.readUByte();
					if (i_4_ > 0) {
						for (int i_5_ = 0; i_5_ < i_4_; i_5_++) {
							Class504 class504 = new Class504(toolkit, aClass490_4924.tileScale * -1911343043, buffer, 2);
							if (31 == 1154867723 * class504.anInt6950) {
								Class679 class679 = Class457.aClass678_Sub21_5151.get(buffer.readUShort());
								class504.method8719(class679.anInt286 * 2034260441, 394102647 * class679.anInt284,
										873727007 * class679.anInt285, class679.anInt283 * -1148555795);
							}
							if (toolkit.method2480() > 0) {
								PointLight class480_sub23 = class504.light;
								int i_6_ = class480_sub23.getX() + (i << 9);
								int i_7_ = class480_sub23.getZ() + (i_0_ << 9);
								int i_8_ = i_6_ >> 9;
								int i_9_ = i_7_ >> 9;
								if (i_8_ >= 0 && i_9_ >= 0 && i_8_ < 1626386547 * width && i_9_ < -1252946243 * length) {
									class480_sub23.reposition(
											i_6_,
											tileHeights[class504.anInt6948 * 297507485][i_8_][i_9_]
													- class480_sub23.getY(), i_7_);
									aClass490_4924.method8366(class504, 995913351);
								}
							}
						}
					}
				} else if (i_3_ == 2) {
					if (null == class569) {
						class569 = new Class569();
					}
					class569.method9612(buffer);
				} else if (i_3_ == 3) {
					if (class569 == null) {
						class569 = new Class569();
					}
					class569.method9594(buffer);
				} else if (128 == i_3_) {
					if (class569 == null) {
						class569 = new Class569();
					}
					class569.method9596(buffer, aClass575_9938);
				} else if (129 == i_3_) {
					if (null == aByteArrayArrayArray4971) {
						aByteArrayArrayArray4971 = new byte[4][][];
					}
					for (int i_10_ = 0; i_10_ < 4; i_10_++) {
						byte i_11_ = buffer.readByte();
						if (0 == i_11_ && null != aByteArrayArrayArray4971[i_10_]) {
							int i_12_ = i;
							int i_13_ = i + 64;
							int i_14_ = i_0_;
							int i_15_ = 64 + i_0_;
							if (i_12_ < 0) {
								i_12_ = 0;
							} else if (i_12_ >= 1626386547 * width) {
								i_12_ = 1626386547 * width;
							}
							if (i_13_ < 0) {
								i_13_ = 0;
							} else if (i_13_ >= 1626386547 * width) {
								i_13_ = 1626386547 * width;
							}
							if (i_14_ < 0) {
								i_14_ = 0;
							} else if (i_14_ >= -1252946243 * length) {
								i_14_ = length * -1252946243;
							}
							if (i_15_ < 0) {
								i_15_ = 0;
							} else if (i_15_ >= length * -1252946243) {
								i_15_ = length * -1252946243;
							}
							for (; i_12_ < i_13_; i_12_++) {
								for (; i_14_ < i_15_; i_14_++) {
									aByteArrayArrayArray4971[i_10_][i_12_][i_14_] = (byte) 0;
								}
							}
						} else if (1 == i_11_) {
							if (null == aByteArrayArrayArray4971[i_10_]) {
								aByteArrayArrayArray4971[i_10_] = new byte[1 + 1626386547 * width][1 + -1252946243
										* length];
							}
							for (int i_16_ = 0; i_16_ < 64; i_16_ += 4) {
								for (int i_17_ = 0; i_17_ < 64; i_17_ += 4) {
									byte i_18_ = buffer.readByte();
									for (int i_19_ = i_16_ + i; i_19_ < i_16_ + i + 4; i_19_++) {
										for (int i_20_ = i_17_ + i_0_; i_20_ < 4 + i_17_ + i_0_; i_20_++) {
											if (i_19_ >= 0 && i_19_ < 1626386547 * width && i_20_ >= 0
													&& i_20_ < length * -1252946243) {
												aByteArrayArrayArray4971[i_10_][i_19_][i_20_] = i_18_;
											}
										}
									}
								}
							}
						} else if (i_11_ == 2) {
							if (aByteArrayArrayArray4971[i_10_] == null) {
								aByteArrayArrayArray4971[i_10_] = new byte[1 + width * 1626386547][1 + -1252946243
										* length];
							}
							if (i_10_ > 0) {
								int i_21_ = i;
								int i_22_ = 64 + i;
								int i_23_ = i_0_;
								int i_24_ = i_0_ + 64;
								if (i_21_ < 0) {
									i_21_ = 0;
								} else if (i_21_ >= width * 1626386547) {
									i_21_ = width * 1626386547;
								}
								if (i_22_ < 0) {
									i_22_ = 0;
								} else if (i_22_ >= 1626386547 * width) {
									i_22_ = 1626386547 * width;
								}
								if (i_23_ < 0) {
									i_23_ = 0;
								} else if (i_23_ >= length * -1252946243) {
									i_23_ = length * -1252946243;
								}
								if (i_24_ < 0) {
									i_24_ = 0;
								} else if (i_24_ >= length * -1252946243) {
									i_24_ = -1252946243 * length;
								}
								for (; i_21_ < i_22_; i_21_++) {
									for (; i_23_ < i_24_; i_23_++) {
										aByteArrayArrayArray4971[i_10_][i_21_][i_23_] = aByteArrayArrayArray4971[i_10_ - 1][i_21_][i_23_];
									}
								}
							}
						}
					}
					bool = true;
				} else if (130 == i_3_) {
					bool_2_ = true;
				} else {
					throw new IllegalStateException("");
				}
			}
			for (int i_25_ = 0; i_25_ < 8; i_25_++) {
				for (int i_26_ = 0; i_26_ < 8; i_26_++) {
					int i_27_ = i_25_ + (i >> 3);
					int i_28_ = (i_0_ >> 3) + i_26_;
					if (i_27_ >= 0 && i_27_ < width * 1626386547 >> 3 && i_28_ >= 0
							&& i_28_ < length * -1252946243 >> 3) {
						if (class569 != null) {
							aClass575_9938.method9704(i_27_, i_28_, class569);
						}
						Class172.method3495(i_27_, i_28_, bool_2_);
					}
				}
			}
			if (!bool && aByteArrayArrayArray4971 != null) {
				for (int i_29_ = 0; i_29_ < 4; i_29_++) {
					if (aByteArrayArrayArray4971[i_29_] != null) {
						for (int i_30_ = 0; i_30_ < 16; i_30_++) {
							for (int i_31_ = 0; i_31_ < 16; i_31_++) {
								int i_32_ = (i >> 2) + i_30_;
								int i_33_ = i_31_ + (i_0_ >> 2);
								if (i_32_ >= 0 && i_32_ < 26 && i_33_ >= 0 && i_33_ < 26) {
									aByteArrayArrayArray4971[i_29_][i_32_][i_33_] = (byte) 0;
								}
							}
						}
					}
				}
			}
		}
	}

	public final void method15410(Toolkit toolkit, byte[] data, int i, int i_36_, int i_37_, int i_38_, int i_39_,
			int i_40_, int i_41_, byte i_42_) {
		Buffer buffer = new Buffer(data);
		int id = -1;
		for (;;) {
			int idOffset = buffer.readSmarts();
			if (idOffset == 0) {
				break;
			}

			id += idOffset;
			int position = 0;

			for (;;) {
				int positionOffset = buffer.readUSmart();
				if (0 == positionOffset) {
					break;
				}

				position += positionOffset - 1;
				int i_47_ = position & 0x3f;
				int i_48_ = position >> 6 & 0x3f;
				int i_49_ = position >> 12;
				int i_50_ = buffer.readUByte();
				int i_51_ = i_50_ >> 2;
				int orientation = i_50_ & 0x3;

				if (i_49_ == i_38_ && i_48_ >= i_39_ && i_48_ < i_39_ + 8 && i_47_ >= i_40_ && i_47_ < i_40_ + 8) {
					ObjectDefinition definition = loader.get(id);
					int i_53_;
					int i_54_;

					if (0 == (orientation & 0x1)) {
						i_53_ = 723391465 * definition.width;
						i_54_ = definition.length * 2076427087;
					} else {
						i_53_ = 2076427087 * definition.length;
						i_54_ = 723391465 * definition.width;
					}

					int i_55_ = i_36_
							+ HashedVariableCollection.method2262(i_48_ & 0x7, i_47_ & 0x7, i_41_,
									definition.width * 723391465, definition.length * 2076427087, orientation);
					int i_56_ = i_37_
							+ Class253.method4729(i_48_ & 0x7, i_47_ & 0x7, i_41_, definition.width * 723391465,
									2076427087 * definition.length, orientation);
					int i_57_ = i_55_ + i_53_;
					int i_58_ = i_56_ + i_54_;
					if (i_55_ < width * 1626386547
							&& i_56_ < -1252946243 * length
							&& i_57_ > 0
							&& i_58_ > 0
							&& (-1050493863 * ObjectCategory.aClass541_7338.type == i_51_
									|| i_51_ == -1050493863 * ObjectCategory.aClass541_7357.type || i_55_ > 0
									&& i_56_ > 0 && i_55_ < width * 1626386547 - 1 && i_56_ < -1252946243 * length - 1)) {
						method15411(toolkit, i, i, i_55_, i_56_, id, orientation + i_41_ & 0x3, i_51_, -1, 0);
					}
				}
			}
		}
	}

	public final void method15416(Toolkit class134, boolean bool, int i) {
		aClass490_4924.method8352();
		if (!bool) {
			if (anInt4969 * -710177039 > 1) {
				for (int i_111_ = 0; i_111_ < 1626386547 * width; i_111_++) {
					for (int i_112_ = 0; i_112_ < -1252946243 * length; i_112_++) {
						if ((aClass425_4950.flags[1][i_111_][i_112_] & 0x2) == 2) {
							aClass490_4924.method8317(i_111_, i_112_, (byte) 88);
						}
					}
				}
			}
			for (int i_113_ = 0; i_113_ < -710177039 * anInt4969; i_113_++) {
				for (int i_114_ = 0; i_114_ <= -1252946243 * length; i_114_++) {
					for (int i_115_ = 0; i_115_ <= width * 1626386547; i_115_++) {
						if ((aByteArrayArrayArray4922[i_113_][i_115_][i_114_] & 0x4) != 0) {
							int i_116_ = i_115_;
							int i_117_ = i_115_;
							int i_118_ = i_114_;
							int i_119_;
							for (i_119_ = i_114_; i_118_ > 0
									&& (aByteArrayArrayArray4922[i_113_][i_115_][i_118_ - 1] & 0x4) != 0
									&& i_119_ - i_118_ < 10; i_118_--) {

							}
							for (; i_119_ < length * -1252946243
									&& (aByteArrayArrayArray4922[i_113_][i_115_][i_119_ + 1] & 0x4) != 0
									&& i_119_ - i_118_ < 10; i_119_++) {

							}
							while_53_: for (; i_116_ > 0 && i_117_ - i_116_ < 10; i_116_--) {
								for (int i_120_ = i_118_; i_120_ <= i_119_; i_120_++) {
									if (0 == (aByteArrayArrayArray4922[i_113_][i_116_ - 1][i_120_] & 0x4)) {
										break while_53_;
									}
								}
							}
							while_54_: for (; i_117_ < 1626386547 * width && i_117_ - i_116_ < 10; i_117_++) {
								for (int i_121_ = i_118_; i_121_ <= i_119_; i_121_++) {
									if (0 == (aByteArrayArrayArray4922[i_113_][1 + i_117_][i_121_] & 0x4)) {
										break while_54_;
									}
								}
							}
							if ((i_117_ - i_116_ + 1) * (i_119_ - i_118_ + 1) >= 4) {
								int i_122_ = tileHeights[i_113_][i_116_][i_118_];
								aClass490_4924.aClass492_6695.method8496(4, i_113_, i_116_ << 9, 512 + (i_117_ << 9),
										i_118_ << 9, 512 + (i_119_ << 9), i_122_, i_122_);
								for (int i_123_ = i_116_; i_123_ <= i_117_; i_123_++) {
									for (int i_124_ = i_118_; i_124_ <= i_119_; i_124_++) {
										aByteArrayArrayArray4922[i_113_][i_123_][i_124_] &= ~0x4;
									}
								}
							}
						}
					}
				}
			}
			aClass490_4924.aClass492_6695.method8494();
		}
		aByteArrayArrayArray4922 = null;
	}

	public final void method15425(Toolkit class134, byte[] is, int i, int i_125_, byte i_126_) {
		Buffer buffer = new Buffer(is);
		int i_127_ = -1;
		for (;;) {
			int i_128_ = buffer.readSmarts();
			if (i_128_ == 0) {
				break;
			}
			i_127_ += i_128_;
			int i_129_ = 0;
			for (;;) {
				int i_130_ = buffer.readUSmart();
				if (i_130_ == 0) {
					break;
				}
				i_129_ += i_130_ - 1;
				int i_131_ = i_129_ & 0x3f;
				int i_132_ = i_129_ >> 6 & 0x3f;
				int i_133_ = i_129_ >> 12;
				int i_134_ = buffer.readUByte();
				int i_135_ = i_134_ >> 2;
				int i_136_ = i_134_ & 0x3;
				int i_137_ = i_132_ + i;
				int i_138_ = i_125_ + i_131_;
				ObjectDefinition class544 = loader.get(i_127_);
				int i_139_;
				int i_140_;
				if (0 == (i_136_ & 0x1)) {
					i_139_ = class544.width * 723391465;
					i_140_ = class544.length * 2076427087;
				} else {
					i_139_ = class544.length * 2076427087;
					i_140_ = class544.width * 723391465;
				}
				int i_141_ = i_139_ + i_137_;
				int i_142_ = i_138_ + i_140_;
				if (i_137_ < width * 1626386547
						&& i_138_ < -1252946243 * length
						&& i_141_ > 0
						&& i_142_ > 0
						&& (-1050493863 * ObjectCategory.aClass541_7338.type == i_135_
								|| ObjectCategory.aClass541_7357.type * -1050493863 == i_135_ || i_137_ > 0
								&& i_138_ > 0 && i_137_ < width * 1626386547 - 1 && i_138_ < length * -1252946243 - 1)) {
					method15411(class134, i_133_, i_133_, i_137_, i_138_, i_127_, i_136_, i_135_, -1, 0);
				}
			}
		}
	}

	public final void method15431(Toolkit class134, Buffer buffer, int i, int i_162_, int i_163_, int i_164_,
			int i_165_, int i_166_, int i_167_, int i_168_) {
		if (!underwater) {
			buffer.offset += 1475202440;
			boolean bool = false;
			Class569 class569 = null;
			boolean bool_169_ = false;
			int i_170_ = (i_165_ & 0x7) * 8;
			int i_171_ = 8 * (i_166_ & 0x7);
			while (-165875887 * buffer.offset < buffer.payload.length) {
				int i_172_ = buffer.readUByte();
				if (0 == i_172_) {
					if (class569 == null) {
						class569 = new Class569(buffer, aClass575_9938);
					} else {
						class569.method9592(buffer, aClass575_9938);
					}
				} else if (1 == i_172_) {
					int i_173_ = buffer.readUByte();
					if (i_173_ > 0) {
						for (int i_174_ = 0; i_174_ < i_173_; i_174_++) {
							Class504 class504 = new Class504(class134, aClass490_4924.tileScale * -1911343043, buffer,
									2);
							if (1154867723 * class504.anInt6950 == 31) {
								Class679 class679 = Class457.aClass678_Sub21_5151.get(buffer.readUShort());
								class504.method8719(2034260441 * class679.anInt286, class679.anInt284 * 394102647,
										class679.anInt285 * 873727007, -1148555795 * class679.anInt283);
							}
							if (class134.method2480() > 0) {
								PointLight class480_sub23 = class504.light;
								int i_175_ = class480_sub23.getX() >> 9;
								int i_176_ = class480_sub23.getZ() >> 9;
								if (class504.anInt6948 * 297507485 == i_164_ && i_175_ >= i_170_ && i_175_ < 8 + i_170_
										&& i_176_ >= i_171_ && i_176_ < 8 + i_171_) {
									int i_177_ = (i_162_ << 9)
											+ Class20.method730(class480_sub23.getX() & 0xfff,
													class480_sub23.getZ() & 0xfff, i_167_, -1554549175);
									int i_178_ = (i_163_ << 9)
											+ AreaSoundVolumeNormaliser.method3850(class480_sub23.getX() & 0xfff,
													class480_sub23.getZ() & 0xfff, i_167_, -644933705);
									i_175_ = i_177_ >> 9;
									i_176_ = i_178_ >> 9;
									if (i_175_ >= 0 && i_176_ >= 0 && i_175_ < 1626386547 * width
											&& i_176_ < -1252946243 * length) {
										class504.anInt6948 = -794313803 * i;
										class480_sub23.reposition(i_177_,
												tileHeights[297507485 * class504.anInt6948][i_175_][i_176_]
														- class480_sub23.getY(), i_178_);
										aClass490_4924.method8366(class504, 334858052);
									}
								}
							}
						}
					}
				} else if (2 == i_172_) {
					if (class569 == null) {
						class569 = new Class569();
					}
					class569.method9612(buffer);
				} else if (3 == i_172_) {
					if (null == class569) {
						class569 = new Class569();
					}
					class569.method9594(buffer);
				} else if (i_172_ == 128) {
					if (null == class569) {
						class569 = new Class569();
					}
					class569.method9596(buffer, aClass575_9938);
				} else if (i_172_ == 129) {
					if (null == aByteArrayArrayArray4971) {
						aByteArrayArrayArray4971 = new byte[4][][];
					}
					for (int i_179_ = 0; i_179_ < 4; i_179_++) {
						byte i_180_ = buffer.readByte();
						if (0 == i_180_ && null != aByteArrayArrayArray4971[i]) {
							if (i_179_ <= i_164_) {
								int i_181_ = i_162_;
								int i_182_ = 7 + i_162_;
								int i_183_ = i_163_;
								int i_184_ = i_163_ + 7;
								if (i_181_ < 0) {
									i_181_ = 0;
								} else if (i_181_ >= width * 1626386547) {
									i_181_ = 1626386547 * width;
								}
								if (i_182_ < 0) {
									i_182_ = 0;
								} else if (i_182_ >= 1626386547 * width) {
									i_182_ = width * 1626386547;
								}
								if (i_183_ < 0) {
									i_183_ = 0;
								} else if (i_183_ >= length * -1252946243) {
									i_183_ = length * -1252946243;
								}
								if (i_184_ < 0) {
									i_184_ = 0;
								} else if (i_184_ >= -1252946243 * length) {
									i_184_ = -1252946243 * length;
								}
								for (; i_181_ < i_182_; i_181_++) {
									for (; i_183_ < i_184_; i_183_++) {
										aByteArrayArrayArray4971[i][i_181_][i_183_] = (byte) 0;
									}
								}
							}
						} else if (1 == i_180_) {
							if (aByteArrayArrayArray4971[i] == null) {
								aByteArrayArrayArray4971[i] = new byte[1626386547 * width + 1][length * -1252946243 + 1];
							}
							for (int i_185_ = 0; i_185_ < 64; i_185_ += 4) {
								for (int i_186_ = 0; i_186_ < 64; i_186_ += 4) {
									byte i_187_ = buffer.readByte();
									if (i_179_ <= i_164_) {
										for (int i_188_ = i_185_; i_188_ < 4 + i_185_; i_188_++) {
											for (int i_189_ = i_186_; i_189_ < 4 + i_186_; i_189_++) {
												if (i_188_ >= i_170_ && i_188_ < 8 + i_170_ && i_189_ >= i_171_
														&& i_189_ < i_171_ + 8) {
													int i_190_ = i_162_
															+ Class166_Sub15.method15125(i_188_ & 0x7, i_189_ & 0x7,
																	i_167_);
													int i_191_ = i_163_
															+ Class55.method1183(i_188_ & 0x7, i_189_ & 0x7, i_167_);
													if (i_190_ >= 0 && i_190_ < width * 1626386547 && i_191_ >= 0
															&& i_191_ < -1252946243 * length) {
														aByteArrayArrayArray4971[i][i_190_][i_191_] = i_187_;
														bool = true;
													}
												}
											}
										}
									}
								}
							}
						} else if (2 == i_180_) {
							continue;
						}
					}
				} else if (130 == i_172_) {
					bool_169_ = true;
				} else {
					throw new IllegalStateException("");
				}
			}
			if (null != class569) {
				aClass575_9938.method9704(i_162_ >> 3, i_163_ >> 3, class569);
			}
			Class172.method3495(i_162_ >> 3, i_163_ >> 3, bool_169_);
			if (!bool && aByteArrayArrayArray4971 != null && null != aByteArrayArrayArray4971[i]) {
				int i_192_ = 7 + i_162_;
				int i_193_ = i_163_ + 7;
				for (int i_194_ = i_162_; i_194_ < i_192_; i_194_++) {
					for (int i_195_ = i_163_; i_195_ < i_193_; i_195_++) {
						aByteArrayArrayArray4971[i][i_194_][i_195_] = (byte) 0;
					}
				}
			}
		}
	}

	final void method15411(Toolkit toolkit, int collisionPlane, int plane, int localX, int localZ, int id,
			int orientation, int type, int animation, int i_66_) { // TODO
		if (plane < -1335764017 * anInt9937) {
			anInt9937 = plane * 1290619695;
		}

		ObjectDefinition object = loader.get(id);
		if (Class199.preferences.textures.getValue() != 0 || !object.aBool7435) {
			int i_68_;
			int i_69_;

			if (1 == orientation || 3 == orientation) {
				i_68_ = object.length * 2076427087;
				i_69_ = object.width * 723391465;
			} else {
				i_68_ = 723391465 * object.width;
				i_69_ = object.length * 2076427087;
			}

			int i_70_;
			int i_71_;
			if (localX + i_68_ <= 1626386547 * width) {
				i_70_ = localX + (i_68_ >> 1);
				i_71_ = localX + (1 + i_68_ >> 1);
			} else {
				i_70_ = localX;
				i_71_ = localX + 1;
			}

			int i_72_;
			int i_73_;
			if (localZ + i_69_ <= -1252946243 * length) {
				i_72_ = localZ + (i_69_ >> 1);
				i_73_ = localZ + (1 + i_69_ >> 1);
			} else {
				i_72_ = localZ;
				i_73_ = localZ + 1;
			}

			Ground ground = aClass490_4924.aClass120Array6700[collisionPlane];
			int i_74_;
			if (-1050493863 * ObjectCategory.aClass541_7338.type == type
					|| ObjectCategory.aClass541_7357.type * -1050493863 == type) {
				i_74_ = ground.method2214(i_70_, i_72_) + ground.method2214(i_71_, i_72_)
						+ ground.method2214(i_70_, i_73_) + ground.method2214(i_71_, i_73_) >> 2;
			} else {
				i_74_ = ground.getTileHeight(i_70_, i_72_) + ground.getTileHeight(i_71_, i_72_)
						+ ground.getTileHeight(i_70_, i_73_) + ground.getTileHeight(i_71_, i_73_) >> 2;
			}

			int i_75_ = (localX << 9) + (i_68_ << 8);
			int i_76_ = (localZ << 9) + (i_69_ << 8);
			boolean bool = aBool4937 && !underwater && object.aBool7392;
			if (object.method9248()) {
				Class262.method4972(plane, localX, localZ, orientation, object, null, null);
			}

			boolean bool_77_ = animation == -1
					&& (!object.method9252() || object.aBool7398
							&& Class199.preferences.aClass632_Sub11_10264.getValue() == 0) && null == object.morphisms
					&& !object.aBool7441 && !object.aBool7443;
			if (!aBool9935
					|| (!ScriptExecutionContext.method10341(type, 980548823) || object.occludes * 777675999 == 1)
					&& (!ObjectCategory.method9380(type) || object.occludes * 777675999 != 0)) {
				if (ObjectCategory.aClass541_7358.type * -1050493863 == type) {
					if (Class199.preferences.groundDecoration.getValue() != 0 || 0 != -1893691057 * object.anInt7389
							|| 1 == 383562139 * object.anInt7367 || object.aBool7420) {
						Class600_Sub1_Sub4 class600_sub1_sub4;

						if (bool_77_) {
							Class600_Sub1_Sub4_Sub1 class600_sub1_sub4_sub1 = new Class600_Sub1_Sub4_Sub1(
									aClass490_4924, toolkit, loader, object, plane, collisionPlane, i_75_, i_74_,
									i_76_, underwater, orientation, bool);
							if (class600_sub1_sub4_sub1.method362()) {
								class600_sub1_sub4_sub1.method364(toolkit);
							}
							class600_sub1_sub4 = class600_sub1_sub4_sub1;
						} else {
							class600_sub1_sub4 = new GroundDecoration(aClass490_4924, toolkit, loader, object, plane,
									collisionPlane, i_75_, i_74_, i_76_, underwater, orientation, animation, i_66_);
						}

						aClass490_4924.method8446(plane, localX, localZ, class600_sub1_sub4, -1331064663);
					}
				} else if (type == -1050493863 * ObjectCategory.aClass541_7338.type
						|| type == -1050493863 * ObjectCategory.aClass541_7357.type) {
					Class600_Sub1_Sub3_Sub3 class600_sub1_sub3_sub3 = null;
					Class600_Sub1_Sub3 class600_sub1_sub3;
					int i_78_;
					if (bool_77_) {
						Class600_Sub1_Sub3_Sub3 class600_sub1_sub3_sub3_79_ = new Class600_Sub1_Sub3_Sub3(
								aClass490_4924, toolkit, loader, object, plane, collisionPlane, i_75_, i_74_, i_76_,
								underwater, localX, localX + i_68_ - 1, localZ, localZ + i_69_ - 1, type, orientation,
								bool, object.aClass550_7388 != Class550.aClass550_7474);
						i_78_ = class600_sub1_sub3_sub3_79_.method18074(1896885579);
						class600_sub1_sub3 = class600_sub1_sub3_sub3_79_;
						class600_sub1_sub3_sub3 = class600_sub1_sub3_sub3_79_;
					} else {
						class600_sub1_sub3 = new GameObject(aClass490_4924, toolkit, loader, object, plane,
								collisionPlane, i_75_, i_74_, i_76_, underwater, localX, i_68_ + localX - 1, localZ,
								i_69_ + localZ - 1, type, orientation, animation, i_66_,
								object.aClass550_7388 != Class550.aClass550_7474);
						i_78_ = 15;
					}
					if (aClass490_4924.method8423(class600_sub1_sub3, false)) {
						if (class600_sub1_sub3_sub3 != null && class600_sub1_sub3_sub3.method362()) {
							class600_sub1_sub3_sub3.method364(toolkit);
						}
						if (object.castsShadow && aBool4937) {
							if (i_78_ > 30) {
								i_78_ = 30;
							}
							for (int i_80_ = 0; i_80_ <= i_68_; i_80_++) {
								for (int i_81_ = 0; i_81_ <= i_69_; i_81_++) {
									ground.setShadowing(localX + i_80_, i_81_ + localZ, i_78_);
								}
							}
						}
					}
				} else if (ObjectCategory.method9380(type) || ArchiveBillboardsLoader.method6015(type)) {
					Class600_Sub1_Sub3 class600_sub1_sub3;
					if (bool_77_) {
						Class600_Sub1_Sub3_Sub3 class600_sub1_sub3_sub3 = new Class600_Sub1_Sub3_Sub3(aClass490_4924,
								toolkit, loader, object, plane, collisionPlane, i_75_, i_74_, i_76_, underwater,
								localX, localX + i_68_ - 1, localZ, i_69_ + localZ - 1, type, orientation, bool, true);
						if (class600_sub1_sub3_sub3.method362()) {
							class600_sub1_sub3_sub3.method364(toolkit);
						}
						class600_sub1_sub3 = class600_sub1_sub3_sub3;
					} else {
						class600_sub1_sub3 = new GameObject(aClass490_4924, toolkit, loader, object, plane,
								collisionPlane, i_75_, i_74_, i_76_, underwater, localX, localX + i_68_ - 1, localZ,
								i_69_ + localZ - 1, type, orientation, animation, i_66_, true);
					}
					aClass490_4924.method8423(class600_sub1_sub3, false);
					if (aBool4937 && !underwater && ObjectCategory.method9380(type)
							&& -1050493863 * ObjectCategory.aClass541_7346.type != type && plane > 0
							&& object.occludes * 777675999 != 0) {
						aByteArrayArrayArray4922[plane][localX][localZ] |= 0x4;
					}
				} else if (method15430(toolkit, type, orientation, bool_77_, object, animation, i_66_, plane,
						collisionPlane, i_75_, i_74_, i_76_, localX, localZ, bool, ground, i_68_, i_69_, (byte) 32)
						|| method15413(toolkit, type, orientation, bool_77_, object, animation, i_66_, plane,
								collisionPlane, i_75_, i_74_, i_76_, localX, localZ, 822672749)) {

				}
			}
		}
	}

	void method15412(Toolkit toolkit, int i, int i_82_, int i_83_, int i_84_) {
		SceneObject interface55 = getObject(i, i_82_, i_83_, i_84_);
		if (interface55 != null) {
			ObjectDefinition class544 = loader.get(interface55.getId());
			int i_86_ = interface55.method339();
			int i_87_ = interface55.method377();
			if (class544.method9248()) {
				Class480_Sub18.method15334(i, i_83_, i_84_, class544, -196218542);
			}
			if (interface55.method362()) {
				interface55.method365(toolkit);
			}
			if (i_82_ == 0) {
				aClass490_4924.method8336(i, i_83_, i_84_, -720979437);
				aClass490_4924.method8337(i, i_83_, i_84_, -831143864);
				if (777675999 * class544.occludes == 1) {
					if (i_87_ == 0) {
						aClass490_4924.aClass492_6695.method8513(1, i, i_83_, i_84_);
					} else if (i_87_ == 1) {
						aClass490_4924.aClass492_6695.method8513(2, i, i_83_, 1 + i_84_);
					} else if (i_87_ == 2) {
						aClass490_4924.aClass492_6695.method8513(1, i, 1 + i_83_, i_84_);
					} else if (i_87_ == 3) {
						aClass490_4924.aClass492_6695.method8513(2, i, i_83_, i_84_);
					}
				}
			} else if (1 == i_82_) {
				aClass490_4924.method8463(i, i_83_, i_84_, 944565284);
				aClass490_4924.method8339(i, i_83_, i_84_, 34168);
			} else if (i_82_ == 2) {
				aClass490_4924.method8342(i, i_83_, i_84_, Client.anInterface57_10904);
				if (i_86_ == ObjectCategory.aClass541_7339.type * -1050493863) {
					if (0 == (i_87_ & 0x1)) {
						aClass490_4924.aClass492_6695.method8513(8, i, i_83_, i_84_);
					} else {
						aClass490_4924.aClass492_6695.method8513(16, i, i_83_, i_84_);
					}
				}
			} else if (3 == i_82_) {
				aClass490_4924.method8382(i, i_83_, i_84_, -1509376493);
			}
		}
	}

	boolean method15413(Toolkit class134, int i, int i_88_, boolean bool, ObjectDefinition class544, int i_89_,
			int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_, int i_97_, int i_98_) {
		if (i == ObjectCategory.aClass541_7344.type * -1050493863) {
			Class600_Sub1_Sub2 class600_sub1_sub2;
			if (bool) {
				Class600_Sub1_Sub2_Sub2 class600_sub1_sub2_sub2 = new Class600_Sub1_Sub2_Sub2(aClass490_4924, class134,
						loader, class544, i_91_, i_92_, i_93_, i_94_, i_95_, underwater, 0, 0, i, i_88_);
				if (class600_sub1_sub2_sub2.method362()) {
					class600_sub1_sub2_sub2.method364(class134);
				}
				class600_sub1_sub2 = class600_sub1_sub2_sub2;
			} else {
				class600_sub1_sub2 = new WallDecoration(aClass490_4924, class134, loader, class544, i_91_, i_92_,
						i_93_, i_94_, i_95_, underwater, 0, 0, i, i_88_, i_89_, i_90_);
			}
			aClass490_4924.method8353(i_91_, i_96_, i_97_, class600_sub1_sub2, null, -2097097763);
			return true;
		}
		if (i == ObjectCategory.aClass541_7341.type * -1050493863) {
			int i_99_ = 65;
			SceneObject interface55 = (SceneObject) aClass490_4924.method8345(i_91_, i_96_, i_97_);
			if (interface55 != null) {
				i_99_ = loader.get(interface55.getId()).anInt7401 * 1601375007 + 1;
			}
			Class600_Sub1_Sub2 class600_sub1_sub2;
			if (bool) {
				Class600_Sub1_Sub2_Sub2 class600_sub1_sub2_sub2 = new Class600_Sub1_Sub2_Sub2(aClass490_4924, class134,
						loader, class544, i_91_, i_92_, i_93_, i_94_, i_95_, underwater, anIntArray9933[i_88_] * i_99_,
						anIntArray9927[i_88_] * i_99_, i, i_88_);
				if (class600_sub1_sub2_sub2.method362()) {
					class600_sub1_sub2_sub2.method364(class134);
				}
				class600_sub1_sub2 = class600_sub1_sub2_sub2;
			} else {
				class600_sub1_sub2 = new WallDecoration(aClass490_4924, class134, loader, class544, i_91_, i_92_,
						i_93_, i_94_, i_95_, underwater, anIntArray9933[i_88_] * i_99_, i_99_ * anIntArray9927[i_88_],
						i, i_88_, i_89_, i_90_);
			}
			aClass490_4924.method8353(i_91_, i_96_, i_97_, class600_sub1_sub2, null, -2110611709);
			return true;
		}
		if (i == ObjectCategory.aClass541_7340.type * -1050493863) {
			int i_100_ = 33;
			SceneObject interface55 = (SceneObject) aClass490_4924.method8345(i_91_, i_96_, i_97_);
			if (interface55 != null) {
				i_100_ = loader.get(interface55.getId()).anInt7401 * 1601375007 / 2 + 1;
			}
			Class600_Sub1_Sub2 class600_sub1_sub2;
			if (bool) {
				Class600_Sub1_Sub2_Sub2 class600_sub1_sub2_sub2 = new Class600_Sub1_Sub2_Sub2(aClass490_4924, class134,
						loader, class544, i_91_, i_92_, i_93_, i_94_, i_95_, underwater,
						i_100_ * anIntArray9933[i_88_], i_100_ * anIntArray9927[i_88_], i, 4 + i_88_);
				if (class600_sub1_sub2_sub2.method362()) {
					class600_sub1_sub2_sub2.method364(class134);
				}
				class600_sub1_sub2 = class600_sub1_sub2_sub2;
			} else {
				class600_sub1_sub2 = new WallDecoration(aClass490_4924, class134, loader, class544, i_91_, i_92_,
						i_93_, i_94_, i_95_, underwater, i_100_ * anIntArray9929[i_88_],
						anIntArray9936[i_88_] * i_100_, i, i_88_ + 4, i_89_, i_90_);
			}
			aClass490_4924.method8353(i_91_, i_96_, i_97_, class600_sub1_sub2, null, -2064412549);
			return true;
		}
		if (i == ObjectCategory.aClass541_7343.type * -1050493863) {
			int i_101_ = i_88_ + 2 & 0x3;
			Class600_Sub1_Sub2 class600_sub1_sub2;
			if (bool) {
				Class600_Sub1_Sub2_Sub2 class600_sub1_sub2_sub2 = new Class600_Sub1_Sub2_Sub2(aClass490_4924, class134,
						loader, class544, i_91_, i_92_, i_93_, i_94_, i_95_, underwater, 0, 0, i, 4 + i_101_);
				if (class600_sub1_sub2_sub2.method362()) {
					class600_sub1_sub2_sub2.method364(class134);
				}
				class600_sub1_sub2 = class600_sub1_sub2_sub2;
			} else {
				class600_sub1_sub2 = new WallDecoration(aClass490_4924, class134, loader, class544, i_91_, i_92_,
						i_93_, i_94_, i_95_, underwater, 0, 0, i, 4 + i_101_, i_89_, i_90_);
			}
			aClass490_4924.method8353(i_91_, i_96_, i_97_, class600_sub1_sub2, null, -2051889004);
			return true;
		}
		if (ObjectCategory.aClass541_7356.type * -1050493863 == i) {
			int i_102_ = 2 + i_88_ & 0x3;
			int i_103_ = 33;
			SceneObject interface55 = (SceneObject) aClass490_4924.method8345(i_91_, i_96_, i_97_);
			if (interface55 != null) {
				i_103_ = loader.get(interface55.getId()).anInt7401 * 1601375007 / 2 + 1;
			}
			Class600_Sub1_Sub2 class600_sub1_sub2;
			Class600_Sub1_Sub2 class600_sub1_sub2_104_;
			if (bool) {
				Class600_Sub1_Sub2_Sub2 class600_sub1_sub2_sub2 = new Class600_Sub1_Sub2_Sub2(aClass490_4924, class134,
						loader, class544, i_91_, i_92_, i_93_, i_94_, i_95_, underwater,
						i_103_ * anIntArray9929[i_88_], i_103_ * anIntArray9936[i_88_], i, i_88_ + 4);
				Class600_Sub1_Sub2_Sub2 class600_sub1_sub2_sub2_105_ = new Class600_Sub1_Sub2_Sub2(aClass490_4924,
						class134, loader, class544, i_91_, i_92_, i_93_, i_94_, i_95_, underwater, 0, 0, i, 4 + i_102_);
				if (class600_sub1_sub2_sub2.method362()) {
					class600_sub1_sub2_sub2.method364(class134);
				}
				if (class600_sub1_sub2_sub2_105_.method362()) {
					class600_sub1_sub2_sub2_105_.method364(class134);
				}
				class600_sub1_sub2 = class600_sub1_sub2_sub2;
				class600_sub1_sub2_104_ = class600_sub1_sub2_sub2_105_;
			} else {
				WallDecoration class600_sub1_sub2_sub1 = new WallDecoration(aClass490_4924, class134, loader, class544,
						i_91_, i_92_, i_93_, i_94_, i_95_, underwater, i_103_ * anIntArray9929[i_88_],
						anIntArray9936[i_88_] * i_103_, i, i_88_ + 4, i_89_, i_90_);
				WallDecoration class600_sub1_sub2_sub1_106_ = new WallDecoration(aClass490_4924, class134, loader,
						class544, i_91_, i_92_, i_93_, i_94_, i_95_, underwater, 0, 0, i, 4 + i_102_, i_89_, i_90_);
				class600_sub1_sub2 = class600_sub1_sub2_sub1;
				class600_sub1_sub2_104_ = class600_sub1_sub2_sub1_106_;
			}
			aClass490_4924.method8353(i_91_, i_96_, i_97_, class600_sub1_sub2, class600_sub1_sub2_104_, -2126246091);
			return true;
		}
		return false;
	}

	SceneObject getObject(int plane, int group, int x, int z) {
		SceneObject object = null;
		if (group == 0) {
			object = (SceneObject) aClass490_4924.method8345(plane, x, z);
		}
		if (group == 1) {
			object = (SceneObject) aClass490_4924.method8347(plane, x, z);
		}
		if (group == 2) {
			object = (SceneObject) aClass490_4924.method8349(plane, x, z, Client.anInterface57_10904);
		}
		if (3 == group) {
			object = (SceneObject) aClass490_4924.method8351(plane, x, z);
		}
		return object;
	}

	boolean method15430(Toolkit class134, int i, int i_143_, boolean bool, ObjectDefinition class544, int i_144_,
			int i_145_, int i_146_, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_, int i_152_,
			boolean bool_153_, Ground class120, int i_154_, int i_155_, byte i_156_) {
		if (-1050493863 * ObjectCategory.aClass541_7335.type == i) {
			int i_157_ = 777675999 * class544.occludes;
			if (aBool9928 && -1 == class544.occludes * 777675999) {
				i_157_ = 1;
			}
			Class600_Sub1_Sub5 class600_sub1_sub5;
			if (bool) {
				Class600_Sub1_Sub5_Sub1 class600_sub1_sub5_sub1 = new Class600_Sub1_Sub5_Sub1(aClass490_4924, class134,
						loader, class544, i_146_, i_147_, i_148_, i_149_, i_150_, underwater, i, i_143_, bool_153_);
				if (class600_sub1_sub5_sub1.method362()) {
					class600_sub1_sub5_sub1.method364(class134);
				}
				class600_sub1_sub5 = class600_sub1_sub5_sub1;
			} else {
				class600_sub1_sub5 = new Wall(aClass490_4924, class134, loader, class544, i_146_, i_147_, i_148_,
						i_149_, i_150_, underwater, i, i_143_, i_144_, i_145_);
			}
			aClass490_4924.method8359(i_146_, i_151_, i_152_, class600_sub1_sub5, null, 2135603389);
			if (i_143_ == 0) {
				if (aBool4937 && class544.castsShadow) {
					class120.setShadowing(i_151_, i_152_, 50);
					class120.setShadowing(i_151_, 1 + i_152_, 50);
				}
				if (i_157_ == 1 && !underwater) {
					aClass490_4924.aClass492_6695.method8515(1, i_146_, i_151_, i_152_, 93223085 * class544.anInt7394,
							class544.anInt7395 * 683670749);
				}
			} else if (1 == i_143_) {
				if (aBool4937 && class544.castsShadow) {
					class120.setShadowing(i_151_, 1 + i_152_, 50);
					class120.setShadowing(i_151_ + 1, 1 + i_152_, 50);
				}
				if (1 == i_157_ && !underwater) {
					aClass490_4924.aClass492_6695.method8515(2, i_146_, i_151_, 1 + i_152_,
							93223085 * class544.anInt7394, -(683670749 * class544.anInt7395));
				}
			} else if (i_143_ == 2) {
				if (aBool4937 && class544.castsShadow) {
					class120.setShadowing(i_151_ + 1, i_152_, 50);
					class120.setShadowing(1 + i_151_, i_152_ + 1, 50);
				}
				if (i_157_ == 1 && !underwater) {
					aClass490_4924.aClass492_6695.method8515(1, i_146_, 1 + i_151_, i_152_,
							93223085 * class544.anInt7394, -(683670749 * class544.anInt7395));
				}
			} else if (i_143_ == 3) {
				if (aBool4937 && class544.castsShadow) {
					class120.setShadowing(i_151_, i_152_, 50);
					class120.setShadowing(i_151_ + 1, i_152_, 50);
				}
				if (i_157_ == 1 && !underwater) {
					aClass490_4924.aClass492_6695.method8515(2, i_146_, i_151_, i_152_, 93223085 * class544.anInt7394,
							class544.anInt7395 * 683670749);
				}
			}
			if (64 != class544.anInt7401 * 1601375007) {
				aClass490_4924.method8334(i_146_, i_151_, i_152_, 1601375007 * class544.anInt7401, 964940834);
			}
			return true;
		}
		if (i == -1050493863 * ObjectCategory.aClass541_7336.type) {
			Class600_Sub1_Sub5 class600_sub1_sub5;
			if (bool) {
				Class600_Sub1_Sub5_Sub1 class600_sub1_sub5_sub1 = new Class600_Sub1_Sub5_Sub1(aClass490_4924, class134,
						loader, class544, i_146_, i_147_, i_148_, i_149_, i_150_, underwater, i, i_143_, bool_153_);
				if (class600_sub1_sub5_sub1.method362()) {
					class600_sub1_sub5_sub1.method364(class134);
				}
				class600_sub1_sub5 = class600_sub1_sub5_sub1;
			} else {
				class600_sub1_sub5 = new Wall(aClass490_4924, class134, loader, class544, i_146_, i_147_, i_148_,
						i_149_, i_150_, underwater, i, i_143_, i_144_, i_145_);
			}
			aClass490_4924.method8359(i_146_, i_151_, i_152_, class600_sub1_sub5, null, 2125945864);
			if (class544.castsShadow && aBool4937) {
				if (i_143_ == 0) {
					class120.setShadowing(i_151_, i_152_ + 1, 50);
				} else if (i_143_ == 1) {
					class120.setShadowing(1 + i_151_, 1 + i_152_, 50);
				} else if (i_143_ == 2) {
					class120.setShadowing(i_151_ + 1, i_152_, 50);
				} else if (i_143_ == 3) {
					class120.setShadowing(i_151_, i_152_, 50);
				}
			}
			return true;
		}
		if (i == ObjectCategory.aClass541_7337.type * -1050493863) {
			int i_158_ = 1 + i_143_ & 0x3;
			Class600_Sub1_Sub5 class600_sub1_sub5;
			Class600_Sub1_Sub5 class600_sub1_sub5_159_;
			if (bool) {
				Class600_Sub1_Sub5_Sub1 class600_sub1_sub5_sub1 = new Class600_Sub1_Sub5_Sub1(aClass490_4924, class134,
						loader, class544, i_146_, i_147_, i_148_, i_149_, i_150_, underwater, i, i_143_ + 4, bool_153_);
				Class600_Sub1_Sub5_Sub1 class600_sub1_sub5_sub1_160_ = new Class600_Sub1_Sub5_Sub1(aClass490_4924,
						class134, loader, class544, i_146_, i_147_, i_148_, i_149_, i_150_, underwater, i, i_158_,
						bool_153_);
				if (class600_sub1_sub5_sub1.method362()) {
					class600_sub1_sub5_sub1.method364(class134);
				}
				if (class600_sub1_sub5_sub1_160_.method362()) {
					class600_sub1_sub5_sub1_160_.method364(class134);
				}
				class600_sub1_sub5 = class600_sub1_sub5_sub1;
				class600_sub1_sub5_159_ = class600_sub1_sub5_sub1_160_;
			} else {
				class600_sub1_sub5 = new Wall(aClass490_4924, class134, loader, class544, i_146_, i_147_, i_148_,
						i_149_, i_150_, underwater, i, 4 + i_143_, i_144_, i_145_);
				class600_sub1_sub5_159_ = new Wall(aClass490_4924, class134, loader, class544, i_146_, i_147_, i_148_,
						i_149_, i_150_, underwater, i, i_158_, i_144_, i_145_);
			}
			aClass490_4924.method8359(i_146_, i_151_, i_152_, class600_sub1_sub5, class600_sub1_sub5_159_, 2096584039);
			if ((1 == class544.occludes * 777675999 || aBool9928 && 777675999 * class544.occludes == -1) && !underwater) {
				if (0 == i_143_) {
					aClass490_4924.aClass492_6695.method8515(1, i_146_, i_151_, i_152_, class544.anInt7394 * 93223085,
							class544.anInt7395 * 683670749);
					aClass490_4924.aClass492_6695.method8515(2, i_146_, i_151_, 1 + i_152_,
							class544.anInt7394 * 93223085, class544.anInt7395 * 683670749);
				} else if (1 == i_143_) {
					aClass490_4924.aClass492_6695.method8515(1, i_146_, i_151_ + 1, i_152_,
							93223085 * class544.anInt7394, 683670749 * class544.anInt7395);
					aClass490_4924.aClass492_6695.method8515(2, i_146_, i_151_, 1 + i_152_,
							93223085 * class544.anInt7394, class544.anInt7395 * 683670749);
				} else if (i_143_ == 2) {
					aClass490_4924.aClass492_6695.method8515(1, i_146_, 1 + i_151_, i_152_,
							class544.anInt7394 * 93223085, 683670749 * class544.anInt7395);
					aClass490_4924.aClass492_6695.method8515(2, i_146_, i_151_, i_152_, class544.anInt7394 * 93223085,
							683670749 * class544.anInt7395);
				} else if (i_143_ == 3) {
					aClass490_4924.aClass492_6695.method8515(1, i_146_, i_151_, i_152_, 93223085 * class544.anInt7394,
							683670749 * class544.anInt7395);
					aClass490_4924.aClass492_6695.method8515(2, i_146_, i_151_, i_152_, class544.anInt7394 * 93223085,
							class544.anInt7395 * 683670749);
				}
			}
			if (64 != class544.anInt7401 * 1601375007) {
				aClass490_4924.method8334(i_146_, i_151_, i_152_, 1601375007 * class544.anInt7401, -1579830867);
			}
			return true;
		}
		if (i == ObjectCategory.aClass541_7355.type * -1050493863) {
			Class600_Sub1_Sub5 class600_sub1_sub5;
			if (bool) {
				Class600_Sub1_Sub5_Sub1 class600_sub1_sub5_sub1 = new Class600_Sub1_Sub5_Sub1(aClass490_4924, class134,
						loader, class544, i_146_, i_147_, i_148_, i_149_, i_150_, underwater, i, i_143_, bool_153_);
				if (class600_sub1_sub5_sub1.method362()) {
					class600_sub1_sub5_sub1.method364(class134);
				}
				class600_sub1_sub5 = class600_sub1_sub5_sub1;
			} else {
				class600_sub1_sub5 = new Wall(aClass490_4924, class134, loader, class544, i_146_, i_147_, i_148_,
						i_149_, i_150_, underwater, i, i_143_, i_144_, i_145_);
			}
			aClass490_4924.method8359(i_146_, i_151_, i_152_, class600_sub1_sub5, null, 2062178199);
			if (class544.castsShadow && aBool4937) {
				if (i_143_ == 0) {
					class120.setShadowing(i_151_, i_152_ + 1, 50);
				} else if (i_143_ == 1) {
					class120.setShadowing(1 + i_151_, 1 + i_152_, 50);
				} else if (i_143_ == 2) {
					class120.setShadowing(i_151_ + 1, i_152_, 50);
				} else if (i_143_ == 3) {
					class120.setShadowing(i_151_, i_152_, 50);
				}
			}
			return true;
		}
		if (ObjectCategory.aClass541_7339.type * -1050493863 == i) {
			Class600_Sub1_Sub3 class600_sub1_sub3;
			if (bool) {
				Class600_Sub1_Sub3_Sub3 class600_sub1_sub3_sub3 = new Class600_Sub1_Sub3_Sub3(aClass490_4924, class134,
						loader, class544, i_146_, i_147_, i_148_, i_149_, i_150_, underwater, i_151_, i_151_, i_152_,
						i_152_, i, i_143_, bool_153_, true);
				if (class600_sub1_sub3_sub3.method362()) {
					class600_sub1_sub3_sub3.method364(class134);
				}
				class600_sub1_sub3 = class600_sub1_sub3_sub3;
			} else {
				class600_sub1_sub3 = new GameObject(aClass490_4924, class134, loader, class544, i_146_, i_147_, i_148_,
						i_149_, i_150_, underwater, i_151_, i_154_ + i_151_ - 1, i_152_, i_152_ + i_155_ - 1, i,
						i_143_, i_144_, i_145_, true);
			}
			aClass490_4924.method8423(class600_sub1_sub3, false);
			if (1 == class544.occludes * 777675999 && !underwater) {
				int i_161_;
				if (0 == (i_143_ & 0x1)) {
					i_161_ = 8;
				} else {
					i_161_ = 16;
				}
				aClass490_4924.aClass492_6695.method8515(i_161_, i_146_, i_151_, i_152_, 93223085 * class544.anInt7394,
						0);
			}
			if (64 != 1601375007 * class544.anInt7401) {
				aClass490_4924.method8334(i_146_, i_151_, i_152_, 1601375007 * class544.anInt7401, -355772503);
			}
			return true;
		}
		return false;
	}
}
