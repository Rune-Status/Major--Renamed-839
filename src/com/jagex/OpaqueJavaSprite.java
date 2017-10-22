package com.jagex;

public class OpaqueJavaSprite extends JavaSprite {
	int[] raster;

	OpaqueJavaSprite(JavaToolkit toolkit, int width, int height) {
		super(toolkit, width, height);
		raster = new int[width * height];
	}

	OpaqueJavaSprite(JavaToolkit toolkit, int[] raster, int width, int height) {
		super(toolkit, width, height);
		this.raster = raster;
	}

	OpaqueJavaSprite(JavaToolkit toolkit, int[] raster, int sourceOffset, int step, int width, int height, boolean copy) {
		super(toolkit, width, height);
		if (copy) {
			this.raster = new int[width * height];
		} else {
			this.raster = raster;
		}

		step -= width;
		int dest = 0;

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int colour = raster[sourceOffset++];
				if (colour >>> 24 == 255) {
					this.raster[dest++] = (colour & 0xFFFFFF) == 0 ? -16777215 : colour;
				} else {
					this.raster[dest++] = 0;
				}
			}

			sourceOffset += step;
		}
	}

	@Override
	public Interface16 method2075() {
		return new IntRaster(width, height, raster);
	}

	@Override
	public void method2076(int i, int i_68_, int i_69_, int i_70_, int[] is, int[] is_71_, int i_72_, int i_73_) {
		method17331(i, i_68_, i_69_, i_70_, is, i_72_, i_73_);
	}

	@Override
	public void method2081(int i, int i_203_, ClippingMask class129, int i_204_, int i_205_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		int[] is = toolkit.anIntArray8797;
		if (is != null) {
			i += offsetX;
			i_203_ += offsetY;
			int i_206_ = 0;
			int i_207_ = toolkit.displayWidth * 464577083;
			int i_208_ = width;
			int i_209_ = height;
			int i_210_ = i_207_ - i_208_;
			int i_211_ = 0;
			int i_212_ = i + i_203_ * i_207_;
			if (i_203_ < toolkit.bottomClip * 1163397961) {
				int i_213_ = toolkit.bottomClip * 1163397961 - i_203_;
				i_209_ -= i_213_;
				i_203_ = toolkit.bottomClip * 1163397961;
				i_206_ += i_213_ * i_208_;
				i_212_ += i_213_ * i_207_;
			}
			if (i_203_ + i_209_ > toolkit.topClip * -68852597) {
				i_209_ -= i_203_ + i_209_ - toolkit.topClip * -68852597;
			}
			if (i < toolkit.leftClip * 113391253) {
				int i_214_ = toolkit.leftClip * 113391253 - i;
				i_208_ -= i_214_;
				i = toolkit.leftClip * 113391253;
				i_206_ += i_214_;
				i_212_ += i_214_;
				i_211_ += i_214_;
				i_210_ += i_214_;
			}
			if (i + i_208_ > toolkit.rightClip * -1451559971) {
				int i_215_ = i + i_208_ - toolkit.rightClip * -1451559971;
				i_208_ -= i_215_;
				i_211_ += i_215_;
				i_210_ += i_215_;
			}
			if (i_208_ > 0 && i_209_ > 0) {
				JavaClippingMask class129_sub3 = (JavaClippingMask) class129;
				int[] is_216_ = class129_sub3.offsets;
				int[] is_217_ = class129_sub3.widths;
				int i_218_ = i_203_;
				if (i_205_ > i_218_) {
					i_218_ = i_205_;
					i_212_ += (i_205_ - i_203_) * i_207_;
					i_206_ += (i_205_ - i_203_) * width;
				}
				int i_219_ = i_205_ + is_216_.length < i_203_ + i_209_ ? i_205_ + is_216_.length : i_203_ + i_209_;
				for (int i_220_ = i_218_; i_220_ < i_219_; i_220_++) {
					int i_221_ = is_216_[i_220_ - i_205_] + i_204_;
					int i_222_ = is_217_[i_220_ - i_205_];
					int i_223_ = i_208_;
					if (i > i_221_) {
						int i_224_ = i - i_221_;
						if (i_224_ >= i_222_) {
							i_206_ += i_208_ + i_211_;
							i_212_ += i_208_ + i_210_;
							continue;
						}
						i_222_ -= i_224_;
					} else {
						int i_225_ = i_221_ - i;
						if (i_225_ >= i_208_) {
							i_206_ += i_208_ + i_211_;
							i_212_ += i_208_ + i_210_;
							continue;
						}
						i_206_ += i_225_;
						i_223_ -= i_225_;
						i_212_ += i_225_;
					}
					int i_226_ = 0;
					if (i_223_ < i_222_) {
						i_222_ = i_223_;
					} else {
						i_226_ = i_223_ - i_222_;
					}
					for (int i_227_ = -i_222_; i_227_ < 0; i_227_++) {
						int i_228_ = raster[i_206_++];
						if (i_228_ != 0) {
							is[i_212_++] = i_228_;
						} else {
							i_212_++;
						}
					}
					i_206_ += i_226_ + i_211_;
					i_212_ += i_226_ + i_210_;
				}
			}
		}
	}

	@Override
	public void method2088(int i, int i_74_, int i_75_, int i_76_, int i_77_, int i_78_) {
		int[] is = toolkit.anIntArray8797;
		if (is == null) {
			throw new IllegalStateException("");
		}
		for (int i_79_ = 0; i_79_ < i_76_; i_79_++) {
			int i_80_ = (i_74_ + i_79_) * width + i;
			int i_81_ = (i_78_ + i_79_) * toolkit.displayWidth * 464577083 + i_77_;
			for (int i_82_ = 0; i_82_ < i_75_; i_82_++) {
				raster[i_80_ + i_82_] = is[i_81_ + i_82_];
			}
		}
	}

	@Override
	public void method2100(int i, int i_2_, int i_3_, int i_4_, int[] is, int i_5_, int i_6_) {
		i_6_ -= i_3_;
		for (int i_7_ = 0; i_7_ < i_4_; i_7_++) {
			int i_8_ = (i_2_ + i_7_) * i_3_ + i;
			for (int i_9_ = 0; i_9_ < i_3_; i_9_++) {
				raster[i_8_ + i_9_] = is[i_5_++];
			}
			i_5_ += i_6_;
		}
	}

	@Override
	public void method2114(int i, int i_0_, int i_1_) {
		throw new IllegalStateException("");
	}

	@Override
	public void method2142(int x, int i_84_, int i_85_, int i_86_, int i_87_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		int[] is = toolkit.anIntArray8797;
		if (is != null) {
			int i_88_ = toolkit.displayWidth * 464577083;
			x += offsetX;
			i_84_ += offsetY;
			int i_89_ = i_84_ * i_88_ + x;
			int i_90_ = 0;
			int i_91_ = height;
			int i_92_ = width;
			int i_93_ = i_88_ - i_92_;
			int i_94_ = 0;
			if (i_84_ < toolkit.bottomClip * 1163397961) {
				int i_95_ = toolkit.bottomClip * 1163397961 - i_84_;
				i_91_ -= i_95_;
				i_84_ = toolkit.bottomClip * 1163397961;
				i_90_ += i_95_ * i_92_;
				i_89_ += i_95_ * i_88_;
			}
			if (i_84_ + i_91_ > toolkit.topClip * -68852597) {
				i_91_ -= i_84_ + i_91_ - toolkit.topClip * -68852597;
			}
			if (x < toolkit.leftClip * 113391253) {
				int i_96_ = toolkit.leftClip * 113391253 - x;
				i_92_ -= i_96_;
				x = toolkit.leftClip * 113391253;
				i_90_ += i_96_;
				i_89_ += i_96_;
				i_94_ += i_96_;
				i_93_ += i_96_;
			}
			if (x + i_92_ > toolkit.rightClip * -1451559971) {
				int i_97_ = x + i_92_ - toolkit.rightClip * -1451559971;
				i_92_ -= i_97_;
				i_94_ += i_97_;
				i_93_ += i_97_;
			}
			if (i_92_ > 0 && i_91_ > 0) {
				if (i_87_ == 0) {
					if (i_85_ == 1) {
						for (int i_98_ = -i_91_; i_98_ < 0; i_98_++) {
							int i_99_ = i_89_ + i_92_ - 3;
							while (i_89_ < i_99_) {
								is[i_89_++] = raster[i_90_++];
								is[i_89_++] = raster[i_90_++];
								is[i_89_++] = raster[i_90_++];
								is[i_89_++] = raster[i_90_++];
							}
							i_99_ += 3;
							while (i_89_ < i_99_) {
								is[i_89_++] = raster[i_90_++];
							}
							i_89_ += i_93_;
							i_90_ += i_94_;
						}
					} else if (i_85_ == 0) {
						int i_100_ = (i_86_ & 0xff0000) >> 16;
						int i_101_ = (i_86_ & 0xff00) >> 8;
						int i_102_ = i_86_ & 0xff;
						for (int i_103_ = -i_91_; i_103_ < 0; i_103_++) {
							for (int i_104_ = -i_92_; i_104_ < 0; i_104_++) {
								int i_105_ = raster[i_90_++];
								int i_106_ = (i_105_ & 0xff0000) * i_100_ & ~0xffffff;
								int i_107_ = (i_105_ & 0xff00) * i_101_ & 0xff0000;
								int i_108_ = (i_105_ & 0xff) * i_102_ & 0xff00;
								is[i_89_++] = (i_106_ | i_107_ | i_108_) >>> 8;
							}
							i_89_ += i_93_;
							i_90_ += i_94_;
						}
					} else if (i_85_ == 3) {
						for (int i_109_ = -i_91_; i_109_ < 0; i_109_++) {
							for (int i_110_ = -i_92_; i_110_ < 0; i_110_++) {
								int i_111_ = raster[i_90_++];
								int i_112_ = i_111_ + i_86_;
								int i_113_ = (i_111_ & 0xff00ff) + (i_86_ & 0xff00ff);
								int i_114_ = (i_113_ & 0x1000100) + (i_112_ - i_113_ & 0x10000);
								is[i_89_++] = i_112_ - i_114_ | i_114_ - (i_114_ >>> 8);
							}
							i_89_ += i_93_;
							i_90_ += i_94_;
						}
					} else if (i_85_ == 2) {
						int i_115_ = i_86_ >>> 24;
						int i_116_ = 256 - i_115_;
						int i_117_ = (i_86_ & 0xff00ff) * i_116_ & ~0xff00ff;
						int i_118_ = (i_86_ & 0xff00) * i_116_ & 0xff0000;
						i_86_ = (i_117_ | i_118_) >>> 8;
						for (int i_119_ = -i_91_; i_119_ < 0; i_119_++) {
							for (int i_120_ = -i_92_; i_120_ < 0; i_120_++) {
								int i_121_ = raster[i_90_++];
								i_117_ = (i_121_ & 0xff00ff) * i_115_ & ~0xff00ff;
								i_118_ = (i_121_ & 0xff00) * i_115_ & 0xff0000;
								is[i_89_++] = ((i_117_ | i_118_) >>> 8) + i_86_;
							}
							i_89_ += i_93_;
							i_90_ += i_94_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_87_ == 1) {
					if (i_85_ == 1) {
						for (int i_122_ = -i_91_; i_122_ < 0; i_122_++) {
							int i_123_ = i_89_ + i_92_ - 3;
							while (i_89_ < i_123_) {
								int i_124_ = raster[i_90_++];
								if (i_124_ != 0) {
									is[i_89_++] = i_124_;
								} else {
									i_89_++;
								}
								i_124_ = raster[i_90_++];
								if (i_124_ != 0) {
									is[i_89_++] = i_124_;
								} else {
									i_89_++;
								}
								i_124_ = raster[i_90_++];
								if (i_124_ != 0) {
									is[i_89_++] = i_124_;
								} else {
									i_89_++;
								}
								i_124_ = raster[i_90_++];
								if (i_124_ != 0) {
									is[i_89_++] = i_124_;
								} else {
									i_89_++;
								}
							}
							i_123_ += 3;
							while (i_89_ < i_123_) {
								int i_125_ = raster[i_90_++];
								if (i_125_ != 0) {
									is[i_89_++] = i_125_;
								} else {
									i_89_++;
								}
							}
							i_89_ += i_93_;
							i_90_ += i_94_;
						}
					} else if (i_85_ == 0) {
						if ((i_86_ & 0xffffff) == 16777215) {
							int i_126_ = i_86_ >>> 24;
							int i_127_ = 256 - i_126_;
							for (int i_128_ = -i_91_; i_128_ < 0; i_128_++) {
								for (int i_129_ = -i_92_; i_129_ < 0; i_129_++) {
									int i_130_ = raster[i_90_++];
									if (i_130_ != 0) {
										int i_131_ = is[i_89_];
										is[i_89_++] = ((i_130_ & 0xff00ff) * i_126_ + (i_131_ & 0xff00ff) * i_127_ & ~0xff00ff)
												+ ((i_130_ & 0xff00) * i_126_ + (i_131_ & 0xff00) * i_127_ & 0xff0000) >> 8;
									} else {
										i_89_++;
									}
								}
								i_89_ += i_93_;
								i_90_ += i_94_;
							}
						} else {
							int i_132_ = (i_86_ & 0xff0000) >> 16;
							int i_133_ = (i_86_ & 0xff00) >> 8;
							int i_134_ = i_86_ & 0xff;
							int i_135_ = i_86_ >>> 24;
							int i_136_ = 256 - i_135_;
							for (int i_137_ = -i_91_; i_137_ < 0; i_137_++) {
								for (int i_138_ = -i_92_; i_138_ < 0; i_138_++) {
									int i_139_ = raster[i_90_++];
									if (i_139_ != 0) {
										if (i_135_ != 255) {
											int i_140_ = (i_139_ & 0xff0000) * i_132_ & ~0xffffff;
											int i_141_ = (i_139_ & 0xff00) * i_133_ & 0xff0000;
											int i_142_ = (i_139_ & 0xff) * i_134_ & 0xff00;
											i_139_ = (i_140_ | i_141_ | i_142_) >>> 8;
											int i_143_ = is[i_89_];
											is[i_89_++] = ((i_139_ & 0xff00ff) * i_135_ + (i_143_ & 0xff00ff) * i_136_ & ~0xff00ff)
													+ ((i_139_ & 0xff00) * i_135_ + (i_143_ & 0xff00) * i_136_ & 0xff0000) >> 8;
										} else {
											int i_144_ = (i_139_ & 0xff0000) * i_132_ & ~0xffffff;
											int i_145_ = (i_139_ & 0xff00) * i_133_ & 0xff0000;
											int i_146_ = (i_139_ & 0xff) * i_134_ & 0xff00;
											is[i_89_++] = (i_144_ | i_145_ | i_146_) >>> 8;
										}
									} else {
										i_89_++;
									}
								}
								i_89_ += i_93_;
								i_90_ += i_94_;
							}
						}
					} else if (i_85_ == 3) {
						int i_147_ = i_86_ >>> 24;
						int i_148_ = 256 - i_147_;
						for (int i_149_ = -i_91_; i_149_ < 0; i_149_++) {
							for (int i_150_ = -i_92_; i_150_ < 0; i_150_++) {
								int i_151_ = raster[i_90_++];
								int i_152_ = i_151_ + i_86_;
								int i_153_ = (i_151_ & 0xff00ff) + (i_86_ & 0xff00ff);
								int i_154_ = (i_153_ & 0x1000100) + (i_152_ - i_153_ & 0x10000);
								i_154_ = i_152_ - i_154_ | i_154_ - (i_154_ >>> 8);
								if (i_151_ == 0 && i_147_ != 255) {
									i_151_ = i_154_;
									i_154_ = is[i_89_];
									i_154_ = ((i_151_ & 0xff00ff) * i_147_ + (i_154_ & 0xff00ff) * i_148_ & ~0xff00ff)
											+ ((i_151_ & 0xff00) * i_147_ + (i_154_ & 0xff00) * i_148_ & 0xff0000) >> 8;
								}
								is[i_89_++] = i_154_;
							}
							i_89_ += i_93_;
							i_90_ += i_94_;
						}
					} else if (i_85_ == 2) {
						int i_155_ = i_86_ >>> 24;
						int i_156_ = 256 - i_155_;
						int i_157_ = (i_86_ & 0xff00ff) * i_156_ & ~0xff00ff;
						int i_158_ = (i_86_ & 0xff00) * i_156_ & 0xff0000;
						i_86_ = (i_157_ | i_158_) >>> 8;
						for (int i_159_ = -i_91_; i_159_ < 0; i_159_++) {
							for (int i_160_ = -i_92_; i_160_ < 0; i_160_++) {
								int i_161_ = raster[i_90_++];
								if (i_161_ != 0) {
									i_157_ = (i_161_ & 0xff00ff) * i_155_ & ~0xff00ff;
									i_158_ = (i_161_ & 0xff00) * i_155_ & 0xff0000;
									is[i_89_++] = ((i_157_ | i_158_) >>> 8) + i_86_;
								} else {
									i_89_++;
								}
							}
							i_89_ += i_93_;
							i_90_ += i_94_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_87_ == 2) {
					if (i_85_ == 1) {
						for (int i_162_ = -i_91_; i_162_ < 0; i_162_++) {
							for (int i_163_ = -i_92_; i_163_ < 0; i_163_++) {
								int i_164_ = raster[i_90_++];
								if (i_164_ != 0) {
									int i_165_ = is[i_89_];
									int i_166_ = i_164_ + i_165_;
									int i_167_ = (i_164_ & 0xff00ff) + (i_165_ & 0xff00ff);
									i_165_ = (i_167_ & 0x1000100) + (i_166_ - i_167_ & 0x10000);
									is[i_89_++] = i_166_ - i_165_ | i_165_ - (i_165_ >>> 8);
								} else {
									i_89_++;
								}
							}
							i_89_ += i_93_;
							i_90_ += i_94_;
						}
					} else if (i_85_ == 0) {
						int i_168_ = (i_86_ & 0xff0000) >> 16;
						int i_169_ = (i_86_ & 0xff00) >> 8;
						int i_170_ = i_86_ & 0xff;
						for (int i_171_ = -i_91_; i_171_ < 0; i_171_++) {
							for (int i_172_ = -i_92_; i_172_ < 0; i_172_++) {
								int i_173_ = raster[i_90_++];
								if (i_173_ != 0) {
									int i_174_ = (i_173_ & 0xff0000) * i_168_ & ~0xffffff;
									int i_175_ = (i_173_ & 0xff00) * i_169_ & 0xff0000;
									int i_176_ = (i_173_ & 0xff) * i_170_ & 0xff00;
									i_173_ = (i_174_ | i_175_ | i_176_) >>> 8;
									int i_177_ = is[i_89_];
									int i_178_ = i_173_ + i_177_;
									int i_179_ = (i_173_ & 0xff00ff) + (i_177_ & 0xff00ff);
									i_177_ = (i_179_ & 0x1000100) + (i_178_ - i_179_ & 0x10000);
									is[i_89_++] = i_178_ - i_177_ | i_177_ - (i_177_ >>> 8);
								} else {
									i_89_++;
								}
							}
							i_89_ += i_93_;
							i_90_ += i_94_;
						}
					} else if (i_85_ == 3) {
						for (int i_180_ = -i_91_; i_180_ < 0; i_180_++) {
							for (int i_181_ = -i_92_; i_181_ < 0; i_181_++) {
								int i_182_ = raster[i_90_++];
								int i_183_ = i_182_ + i_86_;
								int i_184_ = (i_182_ & 0xff00ff) + (i_86_ & 0xff00ff);
								int i_185_ = (i_184_ & 0x1000100) + (i_183_ - i_184_ & 0x10000);
								i_182_ = i_183_ - i_185_ | i_185_ - (i_185_ >>> 8);
								i_185_ = is[i_89_];
								i_183_ = i_182_ + i_185_;
								i_184_ = (i_182_ & 0xff00ff) + (i_185_ & 0xff00ff);
								i_185_ = (i_184_ & 0x1000100) + (i_183_ - i_184_ & 0x10000);
								is[i_89_++] = i_183_ - i_185_ | i_185_ - (i_185_ >>> 8);
							}
							i_89_ += i_93_;
							i_90_ += i_94_;
						}
					} else if (i_85_ == 2) {
						int i_186_ = i_86_ >>> 24;
						int i_187_ = 256 - i_186_;
						int i_188_ = (i_86_ & 0xff00ff) * i_187_ & ~0xff00ff;
						int i_189_ = (i_86_ & 0xff00) * i_187_ & 0xff0000;
						i_86_ = (i_188_ | i_189_) >>> 8;
						for (int i_190_ = -i_91_; i_190_ < 0; i_190_++) {
							for (int i_191_ = -i_92_; i_191_ < 0; i_191_++) {
								int i_192_ = raster[i_90_++];
								if (i_192_ != 0) {
									i_188_ = (i_192_ & 0xff00ff) * i_186_ & ~0xff00ff;
									i_189_ = (i_192_ & 0xff00) * i_186_ & 0xff0000;
									i_192_ = ((i_188_ | i_189_) >>> 8) + i_86_;
									int i_193_ = is[i_89_];
									int i_194_ = i_192_ + i_193_;
									int i_195_ = (i_192_ & 0xff00ff) + (i_193_ & 0xff00ff);
									i_193_ = (i_195_ & 0x1000100) + (i_194_ - i_195_ & 0x10000);
									is[i_89_++] = i_194_ - i_193_ | i_193_ - (i_193_ >>> 8);
								} else {
									i_89_++;
								}
							}
							i_89_ += i_93_;
							i_90_ += i_94_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@Override
	void method13985(boolean bool, boolean bool_542_, boolean bool_543_, int i, int i_544_, float f, int i_545_,
			int i_546_, int i_547_, int i_548_, int i_549_, int i_550_, boolean bool_551_) {
		if (i_545_ > 0 && i_546_ > 0 && (bool || bool_542_)) {
			int i_552_ = 0;
			int i_553_ = 0;
			int i_554_ = offsetX + width + deltaWidth;
			int i_555_ = offsetY + height + deltaHeight;
			int i_556_ = (i_554_ << 16) / i_545_;
			int i_557_ = (i_555_ << 16) / i_546_;
			if (offsetX > 0) {
				int i_558_ = ((offsetX << 16) + i_556_ - 1) / i_556_;
				i += i_558_;
				i_552_ += i_558_ * i_556_ - (offsetX << 16);
			}
			if (offsetY > 0) {
				int i_559_ = ((offsetY << 16) + i_557_ - 1) / i_557_;
				i_544_ += i_559_;
				i_553_ += i_559_ * i_557_ - (offsetY << 16);
			}
			if (width < i_554_) {
				i_545_ = ((width << 16) - i_552_ + i_556_ - 1) / i_556_;
			}
			if (height < i_555_) {
				i_546_ = ((height << 16) - i_553_ + i_557_ - 1) / i_557_;
			}
			int i_560_ = i + i_544_ * toolkit.displayWidth * 464577083;
			int i_561_ = toolkit.displayWidth * 464577083 - i_545_;
			if (i_544_ + i_546_ > toolkit.topClip * -68852597) {
				i_546_ -= i_544_ + i_546_ - toolkit.topClip * -68852597;
			}
			if (i_544_ < toolkit.bottomClip * 1163397961) {
				int i_562_ = toolkit.bottomClip * 1163397961 - i_544_;
				i_546_ -= i_562_;
				i_560_ += i_562_ * toolkit.displayWidth * 464577083;
				i_553_ += i_557_ * i_562_;
			}
			if (i + i_545_ > toolkit.rightClip * -1451559971) {
				int i_563_ = i + i_545_ - toolkit.rightClip * -1451559971;
				i_545_ -= i_563_;
				i_561_ += i_563_;
			}
			if (i < toolkit.leftClip * 113391253) {
				int i_564_ = toolkit.leftClip * 113391253 - i;
				i_545_ -= i_564_;
				i_560_ += i_564_;
				i_552_ += i_556_ * i_564_;
				i_561_ += i_564_;
			}
			float[] fs = toolkit.aFloatArray8801;
			int[] is = toolkit.anIntArray8797;
			if (i_549_ == 0) {
				if (i_547_ == 1) {
					int i_565_ = i_552_;
					for (int i_566_ = -i_546_; i_566_ < 0; i_566_++) {
						int i_567_ = (i_553_ >> 16) * width;
						for (int i_568_ = -i_545_; i_568_ < 0; i_568_++) {
							if (!bool_542_ || f < fs[i_560_]) {
								if (bool) {
									is[i_560_] = raster[(i_552_ >> 16) + i_567_];
								}
								if (bool_542_ && bool_551_) {
									fs[i_560_] = f;
								}
							}
							i_552_ += i_556_;
							i_560_++;
						}
						i_553_ += i_557_;
						i_552_ = i_565_;
						i_560_ += i_561_;
					}
				} else if (i_547_ == 0) {
					int i_569_ = (i_548_ & 0xff0000) >> 16;
					int i_570_ = (i_548_ & 0xff00) >> 8;
					int i_571_ = i_548_ & 0xff;
					int i_572_ = i_552_;
					for (int i_573_ = -i_546_; i_573_ < 0; i_573_++) {
						int i_574_ = (i_553_ >> 16) * width;
						for (int i_575_ = -i_545_; i_575_ < 0; i_575_++) {
							if (!bool_542_ || f < fs[i_560_]) {
								if (bool) {
									int i_576_ = raster[(i_552_ >> 16) + i_574_];
									int i_577_ = (i_576_ & 0xff0000) * i_569_ & ~0xffffff;
									int i_578_ = (i_576_ & 0xff00) * i_570_ & 0xff0000;
									int i_579_ = (i_576_ & 0xff) * i_571_ & 0xff00;
									is[i_560_] = (i_577_ | i_578_ | i_579_) >>> 8;
								}
								if (bool_542_ && bool_551_) {
									fs[i_560_] = f;
								}
							}
							i_552_ += i_556_;
							i_560_++;
						}
						i_553_ += i_557_;
						i_552_ = i_572_;
						i_560_ += i_561_;
					}
				} else if (i_547_ == 3) {
					int i_580_ = i_552_;
					for (int i_581_ = -i_546_; i_581_ < 0; i_581_++) {
						int i_582_ = (i_553_ >> 16) * width;
						for (int i_583_ = -i_545_; i_583_ < 0; i_583_++) {
							if (!bool_542_ || f < fs[i_560_]) {
								if (bool) {
									int i_584_ = raster[(i_552_ >> 16) + i_582_];
									int i_585_ = i_584_ + i_548_;
									int i_586_ = (i_584_ & 0xff00ff) + (i_548_ & 0xff00ff);
									int i_587_ = (i_586_ & 0x1000100) + (i_585_ - i_586_ & 0x10000);
									is[i_560_] = i_585_ - i_587_ | i_587_ - (i_587_ >>> 8);
								}
								if (bool_542_ && bool_551_) {
									fs[i_560_] = f;
								}
							}
							i_552_ += i_556_;
							i_560_++;
						}
						i_553_ += i_557_;
						i_552_ = i_580_;
						i_560_ += i_561_;
					}
				} else if (i_547_ == 2) {
					int i_588_ = i_548_ >>> 24;
					int i_589_ = 256 - i_588_;
					int i_590_ = (i_548_ & 0xff00ff) * i_589_ & ~0xff00ff;
					int i_591_ = (i_548_ & 0xff00) * i_589_ & 0xff0000;
					i_548_ = (i_590_ | i_591_) >>> 8;
					int i_592_ = i_552_;
					for (int i_593_ = -i_546_; i_593_ < 0; i_593_++) {
						int i_594_ = (i_553_ >> 16) * width;
						for (int i_595_ = -i_545_; i_595_ < 0; i_595_++) {
							if (!bool_542_ || f < fs[i_560_]) {
								if (bool) {
									int i_596_ = raster[(i_552_ >> 16) + i_594_];
									i_590_ = (i_596_ & 0xff00ff) * i_588_ & ~0xff00ff;
									i_591_ = (i_596_ & 0xff00) * i_588_ & 0xff0000;
									is[i_560_] = ((i_590_ | i_591_) >>> 8) + i_548_;
								}
								if (bool_542_ && bool_551_) {
									fs[i_560_] = f;
								}
							}
							i_552_ += i_556_;
							i_560_++;
						}
						i_553_ += i_557_;
						i_552_ = i_592_;
						i_560_ += i_561_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (i_549_ == 1) {
				if (i_547_ == 1) {
					int i_597_ = i_552_;
					for (int i_598_ = -i_546_; i_598_ < 0; i_598_++) {
						int i_599_ = (i_553_ >> 16) * width;
						for (int i_600_ = -i_545_; i_600_ < 0; i_600_++) {
							if (!bool_542_ || f < fs[i_560_]) {
								int i_601_ = raster[(i_552_ >> 16) + i_599_];
								if (i_601_ != 0) {
									if (bool) {
										is[i_560_] = i_601_;
									}
									if (bool_542_ && bool_551_) {
										fs[i_560_] = f;
									}
								}
							}
							i_552_ += i_556_;
							i_560_++;
						}
						i_553_ += i_557_;
						i_552_ = i_597_;
						i_560_ += i_561_;
					}
				} else if (i_547_ == 0) {
					int i_602_ = i_552_;
					if ((i_548_ & 0xffffff) == 16777215) {
						int i_603_ = i_548_ >>> 24;
						int i_604_ = 256 - i_603_;
						for (int i_605_ = -i_546_; i_605_ < 0; i_605_++) {
							int i_606_ = (i_553_ >> 16) * width;
							for (int i_607_ = -i_545_; i_607_ < 0; i_607_++) {
								if (!bool_542_ || f < fs[i_560_]) {
									int i_608_ = raster[(i_552_ >> 16) + i_606_];
									if (i_608_ != 0) {
										if (bool) {
											int i_609_ = is[i_560_];
											is[i_560_] = ((i_608_ & 0xff00ff) * i_603_ + (i_609_ & 0xff00ff) * i_604_ & ~0xff00ff)
													+ ((i_608_ & 0xff00) * i_603_ + (i_609_ & 0xff00) * i_604_ & 0xff0000) >> 8;
										}
										if (bool_542_ && bool_551_) {
											fs[i_560_] = f;
										}
									}
								}
								i_552_ += i_556_;
								i_560_++;
							}
							i_553_ += i_557_;
							i_552_ = i_602_;
							i_560_ += i_561_;
						}
					} else {
						int i_610_ = (i_548_ & 0xff0000) >> 16;
						int i_611_ = (i_548_ & 0xff00) >> 8;
						int i_612_ = i_548_ & 0xff;
						int i_613_ = i_548_ >>> 24;
						int i_614_ = 256 - i_613_;
						for (int i_615_ = -i_546_; i_615_ < 0; i_615_++) {
							int i_616_ = (i_553_ >> 16) * width;
							for (int i_617_ = -i_545_; i_617_ < 0; i_617_++) {
								if (!bool_542_ || f < fs[i_560_]) {
									int i_618_ = raster[(i_552_ >> 16) + i_616_];
									if (i_618_ != 0) {
										if (i_613_ != 255) {
											if (bool) {
												int i_619_ = (i_618_ & 0xff0000) * i_610_ & ~0xffffff;
												int i_620_ = (i_618_ & 0xff00) * i_611_ & 0xff0000;
												int i_621_ = (i_618_ & 0xff) * i_612_ & 0xff00;
												i_618_ = (i_619_ | i_620_ | i_621_) >>> 8;
												int i_622_ = is[i_560_];
												is[i_560_] = ((i_618_ & 0xff00ff) * i_613_ + (i_622_ & 0xff00ff)
														* i_614_ & ~0xff00ff)
														+ ((i_618_ & 0xff00) * i_613_ + (i_622_ & 0xff00) * i_614_ & 0xff0000) >> 8;
											}
											if (bool_542_ && bool_551_) {
												fs[i_560_] = f;
											}
										} else {
											if (bool) {
												int i_623_ = (i_618_ & 0xff0000) * i_610_ & ~0xffffff;
												int i_624_ = (i_618_ & 0xff00) * i_611_ & 0xff0000;
												int i_625_ = (i_618_ & 0xff) * i_612_ & 0xff00;
												is[i_560_] = (i_623_ | i_624_ | i_625_) >>> 8;
											}
											if (bool_542_ && bool_551_) {
												fs[i_560_] = f;
											}
										}
									}
								}
								i_552_ += i_556_;
								i_560_++;
							}
							i_553_ += i_557_;
							i_552_ = i_602_;
							i_560_ += i_561_;
						}
					}
				} else if (i_547_ == 3) {
					int i_626_ = i_552_;
					int i_627_ = i_548_ >>> 24;
					int i_628_ = 256 - i_627_;
					for (int i_629_ = -i_546_; i_629_ < 0; i_629_++) {
						int i_630_ = (i_553_ >> 16) * width;
						for (int i_631_ = -i_545_; i_631_ < 0; i_631_++) {
							if (!bool_542_ || f < fs[i_560_]) {
								if (bool) {
									int i_632_ = raster[(i_552_ >> 16) + i_630_];
									int i_633_ = i_632_ + i_548_;
									int i_634_ = (i_632_ & 0xff00ff) + (i_548_ & 0xff00ff);
									int i_635_ = (i_634_ & 0x1000100) + (i_633_ - i_634_ & 0x10000);
									i_635_ = i_633_ - i_635_ | i_635_ - (i_635_ >>> 8);
									if (i_632_ == 0 && i_627_ != 255) {
										i_632_ = i_635_;
										i_635_ = is[i_560_];
										i_635_ = ((i_632_ & 0xff00ff) * i_627_ + (i_635_ & 0xff00ff) * i_628_ & ~0xff00ff)
												+ ((i_632_ & 0xff00) * i_627_ + (i_635_ & 0xff00) * i_628_ & 0xff0000) >> 8;
									}
									is[i_560_] = i_635_;
								}
								if (bool_542_ && bool_551_) {
									fs[i_560_] = f;
								}
							}
							i_552_ += i_556_;
							i_560_++;
						}
						i_553_ += i_557_;
						i_552_ = i_626_;
						i_560_ += i_561_;
					}
				} else if (i_547_ == 2) {
					int i_636_ = i_548_ >>> 24;
					int i_637_ = 256 - i_636_;
					int i_638_ = (i_548_ & 0xff00ff) * i_637_ & ~0xff00ff;
					int i_639_ = (i_548_ & 0xff00) * i_637_ & 0xff0000;
					i_548_ = (i_638_ | i_639_) >>> 8;
					int i_640_ = i_552_;
					for (int i_641_ = -i_546_; i_641_ < 0; i_641_++) {
						int i_642_ = (i_553_ >> 16) * width;
						for (int i_643_ = -i_545_; i_643_ < 0; i_643_++) {
							if (!bool_542_ || f < fs[i_560_]) {
								int i_644_ = raster[(i_552_ >> 16) + i_642_];
								if (i_644_ != 0) {
									if (bool) {
										i_638_ = (i_644_ & 0xff00ff) * i_636_ & ~0xff00ff;
										i_639_ = (i_644_ & 0xff00) * i_636_ & 0xff0000;
										is[i_560_] = ((i_638_ | i_639_) >>> 8) + i_548_;
									}
									if (bool_542_ && bool_551_) {
										fs[i_560_] = f;
									}
								}
							}
							i_552_ += i_556_;
							i_560_++;
						}
						i_553_ += i_557_;
						i_552_ = i_640_;
						i_560_ += i_561_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (i_549_ == 2) {
				if (i_547_ == 1) {
					int i_645_ = i_552_;
					for (int i_646_ = -i_546_; i_646_ < 0; i_646_++) {
						int i_647_ = (i_553_ >> 16) * width;
						for (int i_648_ = -i_545_; i_648_ < 0; i_648_++) {
							if (!bool_542_ || f < fs[i_560_]) {
								int i_649_ = raster[(i_552_ >> 16) + i_647_];
								if (i_649_ != 0) {
									if (bool) {
										int i_650_ = is[i_560_];
										int i_651_ = i_649_ + i_650_;
										int i_652_ = (i_649_ & 0xff00ff) + (i_650_ & 0xff00ff);
										i_650_ = (i_652_ & 0x1000100) + (i_651_ - i_652_ & 0x10000);
										is[i_560_] = i_651_ - i_650_ | i_650_ - (i_650_ >>> 8);
									}
									if (bool_542_ && bool_551_) {
										fs[i_560_] = f;
									}
								}
							}
							i_552_ += i_556_;
							i_560_++;
						}
						i_553_ += i_557_;
						i_552_ = i_645_;
						i_560_ += i_561_;
					}
				} else if (i_547_ == 0) {
					int i_653_ = i_552_;
					int i_654_ = (i_548_ & 0xff0000) >> 16;
					int i_655_ = (i_548_ & 0xff00) >> 8;
					int i_656_ = i_548_ & 0xff;
					for (int i_657_ = -i_546_; i_657_ < 0; i_657_++) {
						int i_658_ = (i_553_ >> 16) * width;
						for (int i_659_ = -i_545_; i_659_ < 0; i_659_++) {
							if (!bool_542_ || f < fs[i_560_]) {
								int i_660_ = raster[(i_552_ >> 16) + i_658_];
								if (i_660_ != 0) {
									if (bool) {
										int i_661_ = (i_660_ & 0xff0000) * i_654_ & ~0xffffff;
										int i_662_ = (i_660_ & 0xff00) * i_655_ & 0xff0000;
										int i_663_ = (i_660_ & 0xff) * i_656_ & 0xff00;
										i_660_ = (i_661_ | i_662_ | i_663_) >>> 8;
										int i_664_ = is[i_560_];
										int i_665_ = i_660_ + i_664_;
										int i_666_ = (i_660_ & 0xff00ff) + (i_664_ & 0xff00ff);
										i_664_ = (i_666_ & 0x1000100) + (i_665_ - i_666_ & 0x10000);
										is[i_560_] = i_665_ - i_664_ | i_664_ - (i_664_ >>> 8);
									}
									if (bool_542_ && bool_551_) {
										fs[i_560_] = f;
									}
								}
							}
							i_552_ += i_556_;
							i_560_++;
						}
						i_553_ += i_557_;
						i_552_ = i_653_;
						i_560_ += i_561_;
					}
				} else if (i_547_ == 3) {
					int i_667_ = i_552_;
					for (int i_668_ = -i_546_; i_668_ < 0; i_668_++) {
						int i_669_ = (i_553_ >> 16) * width;
						for (int i_670_ = -i_545_; i_670_ < 0; i_670_++) {
							if (!bool_542_ || f < fs[i_560_]) {
								if (bool) {
									int i_671_ = raster[(i_552_ >> 16) + i_669_];
									int i_672_ = i_671_ + i_548_;
									int i_673_ = (i_671_ & 0xff00ff) + (i_548_ & 0xff00ff);
									int i_674_ = (i_673_ & 0x1000100) + (i_672_ - i_673_ & 0x10000);
									i_671_ = i_672_ - i_674_ | i_674_ - (i_674_ >>> 8);
									i_674_ = is[i_560_];
									i_672_ = i_671_ + i_674_;
									i_673_ = (i_671_ & 0xff00ff) + (i_674_ & 0xff00ff);
									i_674_ = (i_673_ & 0x1000100) + (i_672_ - i_673_ & 0x10000);
									is[i_560_] = i_672_ - i_674_ | i_674_ - (i_674_ >>> 8);
								}
								if (bool_542_ && bool_551_) {
									fs[i_560_] = f;
								}
							}
							i_552_ += i_556_;
							i_560_++;
						}
						i_553_ += i_557_;
						i_552_ = i_667_;
						i_560_ += i_561_;
					}
				} else if (i_547_ == 2) {
					int i_675_ = i_548_ >>> 24;
					int i_676_ = 256 - i_675_;
					int i_677_ = (i_548_ & 0xff00ff) * i_676_ & ~0xff00ff;
					int i_678_ = (i_548_ & 0xff00) * i_676_ & 0xff0000;
					i_548_ = (i_677_ | i_678_) >>> 8;
					int i_679_ = i_552_;
					for (int i_680_ = -i_546_; i_680_ < 0; i_680_++) {
						int i_681_ = (i_553_ >> 16) * width;
						for (int i_682_ = -i_545_; i_682_ < 0; i_682_++) {
							if (!bool_542_ || f < fs[i_560_]) {
								int i_683_ = raster[(i_552_ >> 16) + i_681_];
								if (i_683_ != 0) {
									if (bool) {
										i_677_ = (i_683_ & 0xff00ff) * i_675_ & ~0xff00ff;
										i_678_ = (i_683_ & 0xff00) * i_675_ & 0xff0000;
										i_683_ = ((i_677_ | i_678_) >>> 8) + i_548_;
										int i_684_ = is[i_560_];
										int i_685_ = i_683_ + i_684_;
										int i_686_ = (i_683_ & 0xff00ff) + (i_684_ & 0xff00ff);
										i_684_ = (i_686_ & 0x1000100) + (i_685_ - i_686_ & 0x10000);
										is[i_560_] = i_685_ - i_684_ | i_684_ - (i_684_ >>> 8);
									}
									if (bool_542_ && bool_551_) {
										fs[i_560_] = f;
									}
								}
							}
							i_552_ += i_556_;
							i_560_++;
						}
						i_553_ += i_557_;
						i_552_ = i_679_;
						i_560_ += i_561_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@Override
	void method13987(int i, int i_10_) {
		int[] is = toolkit.anIntArray8797;
		if (is != null) {
			if (anInt8564 == 0) {
				if (anInt8576 == 0) {
					int i_11_ = anInt8561;
					while (i_11_ < 0) {
						int i_12_ = anInt8547;
						int i_13_ = anInt8570;
						int i_14_ = anInt8571;
						int i_15_ = anInt8572;
						if (i_13_ >= 0 && i_14_ >= 0 && i_13_ - (width << 12) < 0 && i_14_ - (height << 12) < 0) {
							for (; i_15_ < 0; i_15_++) {
								method17330((i_14_ >> 12) * width + (i_13_ >> 12), i_12_++, is, i, i_10_);
							}
						}
						i_11_++;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_16_ = anInt8561;
					while (i_16_ < 0) {
						int i_17_ = anInt8547;
						int i_18_ = anInt8570;
						int i_19_ = anInt8571 + anInt8574;
						int i_20_ = anInt8572;
						if (i_18_ >= 0 && i_18_ - (width << 12) < 0) {
							int i_21_;
							if ((i_21_ = i_19_ - (height << 12)) >= 0) {
								i_21_ = (anInt8576 - i_21_) / anInt8576;
								i_20_ += i_21_;
								i_19_ += anInt8576 * i_21_;
								i_17_ += i_21_;
							}
							if ((i_21_ = (i_19_ - anInt8576) / anInt8576) > i_20_) {
								i_20_ = i_21_;
							}
							for (; i_20_ < 0; i_20_++) {
								method17330((i_19_ >> 12) * width + (i_18_ >> 12), i_17_++, is, i, i_10_);
								i_19_ += anInt8576;
							}
						}
						i_16_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				} else {
					int i_22_ = anInt8561;
					while (i_22_ < 0) {
						int i_23_ = anInt8547;
						int i_24_ = anInt8570;
						int i_25_ = anInt8571 + anInt8574;
						int i_26_ = anInt8572;
						if (i_24_ >= 0 && i_24_ - (width << 12) < 0) {
							if (i_25_ < 0) {
								int i_27_ = (anInt8576 - 1 - i_25_) / anInt8576;
								i_26_ += i_27_;
								i_25_ += anInt8576 * i_27_;
								i_23_ += i_27_;
							}
							int i_28_;
							if ((i_28_ = (1 + i_25_ - (height << 12) - anInt8576) / anInt8576) > i_26_) {
								i_26_ = i_28_;
							}
							for (; i_26_ < 0; i_26_++) {
								method17330((i_25_ >> 12) * width + (i_24_ >> 12), i_23_++, is, i, i_10_);
								i_25_ += anInt8576;
							}
						}
						i_22_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8564 < 0) {
				if (anInt8576 == 0) {
					int i_29_ = anInt8561;
					while (i_29_ < 0) {
						int i_30_ = anInt8547;
						int i_31_ = anInt8570 + anInt8573;
						int i_32_ = anInt8571;
						int i_33_ = anInt8572;
						if (i_32_ >= 0 && i_32_ - (height << 12) < 0) {
							int i_34_;
							if ((i_34_ = i_31_ - (width << 12)) >= 0) {
								i_34_ = (anInt8564 - i_34_) / anInt8564;
								i_33_ += i_34_;
								i_31_ += anInt8564 * i_34_;
								i_30_ += i_34_;
							}
							if ((i_34_ = (i_31_ - anInt8564) / anInt8564) > i_33_) {
								i_33_ = i_34_;
							}
							for (; i_33_ < 0; i_33_++) {
								method17330((i_32_ >> 12) * width + (i_31_ >> 12), i_30_++, is, i, i_10_);
								i_31_ += anInt8564;
							}
						}
						i_29_++;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_35_ = anInt8561;
					while (i_35_ < 0) {
						int i_36_ = anInt8547;
						int i_37_ = anInt8570 + anInt8573;
						int i_38_ = anInt8571 + anInt8574;
						int i_39_ = anInt8572;
						int i_40_;
						if ((i_40_ = i_37_ - (width << 12)) >= 0) {
							i_40_ = (anInt8564 - i_40_) / anInt8564;
							i_39_ += i_40_;
							i_37_ += anInt8564 * i_40_;
							i_38_ += anInt8576 * i_40_;
							i_36_ += i_40_;
						}
						if ((i_40_ = (i_37_ - anInt8564) / anInt8564) > i_39_) {
							i_39_ = i_40_;
						}
						if ((i_40_ = i_38_ - (height << 12)) >= 0) {
							i_40_ = (anInt8576 - i_40_) / anInt8576;
							i_39_ += i_40_;
							i_37_ += anInt8564 * i_40_;
							i_38_ += anInt8576 * i_40_;
							i_36_ += i_40_;
						}
						if ((i_40_ = (i_38_ - anInt8576) / anInt8576) > i_39_) {
							i_39_ = i_40_;
						}
						for (; i_39_ < 0; i_39_++) {
							method17330((i_38_ >> 12) * width + (i_37_ >> 12), i_36_++, is, i, i_10_);
							i_37_ += anInt8564;
							i_38_ += anInt8576;
						}
						i_35_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else {
					int i_41_ = anInt8561;
					while (i_41_ < 0) {
						int i_42_ = anInt8547;
						int i_43_ = anInt8570 + anInt8573;
						int i_44_ = anInt8571 + anInt8574;
						int i_45_ = anInt8572;
						int i_46_;
						if ((i_46_ = i_43_ - (width << 12)) >= 0) {
							i_46_ = (anInt8564 - i_46_) / anInt8564;
							i_45_ += i_46_;
							i_43_ += anInt8564 * i_46_;
							i_44_ += anInt8576 * i_46_;
							i_42_ += i_46_;
						}
						if ((i_46_ = (i_43_ - anInt8564) / anInt8564) > i_45_) {
							i_45_ = i_46_;
						}
						if (i_44_ < 0) {
							i_46_ = (anInt8576 - 1 - i_44_) / anInt8576;
							i_45_ += i_46_;
							i_43_ += anInt8564 * i_46_;
							i_44_ += anInt8576 * i_46_;
							i_42_ += i_46_;
						}
						if ((i_46_ = (1 + i_44_ - (height << 12) - anInt8576) / anInt8576) > i_45_) {
							i_45_ = i_46_;
						}
						for (; i_45_ < 0; i_45_++) {
							method17330((i_44_ >> 12) * width + (i_43_ >> 12), i_42_++, is, i, i_10_);
							i_43_ += anInt8564;
							i_44_ += anInt8576;
						}
						i_41_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8576 == 0) {
				int i_47_ = anInt8561;
				while (i_47_ < 0) {
					int i_48_ = anInt8547;
					int i_49_ = anInt8570 + anInt8573;
					int i_50_ = anInt8571;
					int i_51_ = anInt8572;
					if (i_50_ >= 0 && i_50_ - (height << 12) < 0) {
						if (i_49_ < 0) {
							int i_52_ = (anInt8564 - 1 - i_49_) / anInt8564;
							i_51_ += i_52_;
							i_49_ += anInt8564 * i_52_;
							i_48_ += i_52_;
						}
						int i_53_;
						if ((i_53_ = (1 + i_49_ - (width << 12) - anInt8564) / anInt8564) > i_51_) {
							i_51_ = i_53_;
						}
						for (; i_51_ < 0; i_51_++) {
							method17330((i_50_ >> 12) * width + (i_49_ >> 12), i_48_++, is, i, i_10_);
							i_49_ += anInt8564;
						}
					}
					i_47_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else if (anInt8576 < 0) {
				for (int i_54_ = anInt8561; i_54_ < 0; i_54_++) {
					int i_55_ = anInt8547;
					int i_56_ = anInt8570 + anInt8573;
					int i_57_ = anInt8571 + anInt8574;
					int i_58_ = anInt8572;
					if (i_56_ < 0) {
						int i_59_ = (anInt8564 - 1 - i_56_) / anInt8564;
						i_58_ += i_59_;
						i_56_ += anInt8564 * i_59_;
						i_57_ += anInt8576 * i_59_;
						i_55_ += i_59_;
					}
					int i_60_;
					if ((i_60_ = (1 + i_56_ - (width << 12) - anInt8564) / anInt8564) > i_58_) {
						i_58_ = i_60_;
					}
					if ((i_60_ = i_57_ - (height << 12)) >= 0) {
						i_60_ = (anInt8576 - i_60_) / anInt8576;
						i_58_ += i_60_;
						i_56_ += anInt8564 * i_60_;
						i_57_ += anInt8576 * i_60_;
						i_55_ += i_60_;
					}
					if ((i_60_ = (i_57_ - anInt8576) / anInt8576) > i_58_) {
						i_58_ = i_60_;
					}
					for (; i_58_ < 0; i_58_++) {
						method17330((i_57_ >> 12) * width + (i_56_ >> 12), i_55_++, is, i, i_10_);
						i_56_ += anInt8564;
						i_57_ += anInt8576;
					}
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else {
				for (int i_61_ = anInt8561; i_61_ < 0; i_61_++) {
					int i_62_ = anInt8547;
					int i_63_ = anInt8570 + anInt8573;
					int i_64_ = anInt8571 + anInt8574;
					int i_65_ = anInt8572;
					if (i_63_ < 0) {
						int i_66_ = (anInt8564 - 1 - i_63_) / anInt8564;
						i_65_ += i_66_;
						i_63_ += anInt8564 * i_66_;
						i_64_ += anInt8576 * i_66_;
						i_62_ += i_66_;
					}
					int i_67_;
					if ((i_67_ = (1 + i_63_ - (width << 12) - anInt8564) / anInt8564) > i_65_) {
						i_65_ = i_67_;
					}
					if (i_64_ < 0) {
						i_67_ = (anInt8576 - 1 - i_64_) / anInt8576;
						i_65_ += i_67_;
						i_63_ += anInt8564 * i_67_;
						i_64_ += anInt8576 * i_67_;
						i_62_ += i_67_;
					}
					if ((i_67_ = (1 + i_64_ - (height << 12) - anInt8576) / anInt8576) > i_65_) {
						i_65_ = i_67_;
					}
					for (; i_65_ < 0; i_65_++) {
						method17330((i_64_ >> 12) * width + (i_63_ >> 12), i_62_++, is, i, i_10_);
						i_63_ += anInt8564;
						i_64_ += anInt8576;
					}
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			}
		}
	}

	@Override
	void method13988(int[] is, int[] is_229_, int i, int i_230_) {
		int[] is_231_ = toolkit.anIntArray8797;
		if (is_231_ != null) {
			if (anInt8564 == 0) {
				if (anInt8576 == 0) {
					int i_232_ = anInt8561;
					while (i_232_ < 0) {
						int i_233_ = i_232_ + i_230_;
						if (i_233_ >= 0) {
							if (i_233_ >= is.length) {
								break;
							}
							int i_234_ = anInt8547;
							int i_235_ = anInt8570;
							int i_236_ = anInt8571;
							int i_237_ = anInt8572;
							if (i_235_ >= 0 && i_236_ >= 0 && i_235_ - (width << 12) < 0 && i_236_ - (height << 12) < 0) {
								int i_238_ = is[i_233_] - i;
								int i_239_ = -is_229_[i_233_];
								int i_240_ = i_238_ - (i_234_ - anInt8547);
								if (i_240_ > 0) {
									i_234_ += i_240_;
									i_237_ += i_240_;
									i_235_ += anInt8564 * i_240_;
									i_236_ += anInt8576 * i_240_;
								} else {
									i_239_ -= i_240_;
								}
								if (i_237_ < i_239_) {
									i_237_ = i_239_;
								}
								for (; i_237_ < 0; i_237_++) {
									int i_241_ = raster[(i_236_ >> 12) * width + (i_235_ >> 12)];
									if (i_241_ != 0) {
										is_231_[i_234_++] = i_241_;
									} else {
										i_234_++;
									}
								}
							}
						}
						i_232_++;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_242_ = anInt8561;
					while (i_242_ < 0) {
						int i_243_ = i_242_ + i_230_;
						if (i_243_ >= 0) {
							if (i_243_ >= is.length) {
								break;
							}
							int i_244_ = anInt8547;
							int i_245_ = anInt8570;
							int i_246_ = anInt8571 + anInt8574;
							int i_247_ = anInt8572;
							if (i_245_ >= 0 && i_245_ - (width << 12) < 0) {
								int i_248_;
								if ((i_248_ = i_246_ - (height << 12)) >= 0) {
									i_248_ = (anInt8576 - i_248_) / anInt8576;
									i_247_ += i_248_;
									i_246_ += anInt8576 * i_248_;
									i_244_ += i_248_;
								}
								if ((i_248_ = (i_246_ - anInt8576) / anInt8576) > i_247_) {
									i_247_ = i_248_;
								}
								int i_249_ = is[i_243_] - i;
								int i_250_ = -is_229_[i_243_];
								int i_251_ = i_249_ - (i_244_ - anInt8547);
								if (i_251_ > 0) {
									i_244_ += i_251_;
									i_247_ += i_251_;
									i_245_ += anInt8564 * i_251_;
									i_246_ += anInt8576 * i_251_;
								} else {
									i_250_ -= i_251_;
								}
								if (i_247_ < i_250_) {
									i_247_ = i_250_;
								}
								for (; i_247_ < 0; i_247_++) {
									int i_252_ = raster[(i_246_ >> 12) * width + (i_245_ >> 12)];
									if (i_252_ != 0) {
										is_231_[i_244_++] = i_252_;
									} else {
										i_244_++;
									}
									i_246_ += anInt8576;
								}
							}
						}
						i_242_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				} else {
					int i_253_ = anInt8561;
					while (i_253_ < 0) {
						int i_254_ = i_253_ + i_230_;
						if (i_254_ >= 0) {
							if (i_254_ >= is.length) {
								break;
							}
							int i_255_ = anInt8547;
							int i_256_ = anInt8570;
							int i_257_ = anInt8571 + anInt8574;
							int i_258_ = anInt8572;
							if (i_256_ >= 0 && i_256_ - (width << 12) < 0) {
								if (i_257_ < 0) {
									int i_259_ = (anInt8576 - 1 - i_257_) / anInt8576;
									i_258_ += i_259_;
									i_257_ += anInt8576 * i_259_;
									i_255_ += i_259_;
								}
								int i_260_;
								if ((i_260_ = (1 + i_257_ - (height << 12) - anInt8576) / anInt8576) > i_258_) {
									i_258_ = i_260_;
								}
								int i_261_ = is[i_254_] - i;
								int i_262_ = -is_229_[i_254_];
								int i_263_ = i_261_ - (i_255_ - anInt8547);
								if (i_263_ > 0) {
									i_255_ += i_263_;
									i_258_ += i_263_;
									i_256_ += anInt8564 * i_263_;
									i_257_ += anInt8576 * i_263_;
								} else {
									i_262_ -= i_263_;
								}
								if (i_258_ < i_262_) {
									i_258_ = i_262_;
								}
								for (; i_258_ < 0; i_258_++) {
									int i_264_ = raster[(i_257_ >> 12) * width + (i_256_ >> 12)];
									if (i_264_ != 0) {
										is_231_[i_255_++] = i_264_;
									} else {
										i_255_++;
									}
									i_257_ += anInt8576;
								}
							}
						}
						i_253_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8564 < 0) {
				if (anInt8576 == 0) {
					int i_265_ = anInt8561;
					while (i_265_ < 0) {
						int i_266_ = i_265_ + i_230_;
						if (i_266_ >= 0) {
							if (i_266_ >= is.length) {
								break;
							}
							int i_267_ = anInt8547;
							int i_268_ = anInt8570 + anInt8573;
							int i_269_ = anInt8571;
							int i_270_ = anInt8572;
							if (i_269_ >= 0 && i_269_ - (height << 12) < 0) {
								int i_271_;
								if ((i_271_ = i_268_ - (width << 12)) >= 0) {
									i_271_ = (anInt8564 - i_271_) / anInt8564;
									i_270_ += i_271_;
									i_268_ += anInt8564 * i_271_;
									i_267_ += i_271_;
								}
								if ((i_271_ = (i_268_ - anInt8564) / anInt8564) > i_270_) {
									i_270_ = i_271_;
								}
								int i_272_ = is[i_266_] - i;
								int i_273_ = -is_229_[i_266_];
								int i_274_ = i_272_ - (i_267_ - anInt8547);
								if (i_274_ > 0) {
									i_267_ += i_274_;
									i_270_ += i_274_;
									i_268_ += anInt8564 * i_274_;
									i_269_ += anInt8576 * i_274_;
								} else {
									i_273_ -= i_274_;
								}
								if (i_270_ < i_273_) {
									i_270_ = i_273_;
								}
								for (; i_270_ < 0; i_270_++) {
									int i_275_ = raster[(i_269_ >> 12) * width + (i_268_ >> 12)];
									if (i_275_ != 0) {
										is_231_[i_267_++] = i_275_;
									} else {
										i_267_++;
									}
									i_268_ += anInt8564;
								}
							}
						}
						i_265_++;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_276_ = anInt8561;
					while (i_276_ < 0) {
						int i_277_ = i_276_ + i_230_;
						if (i_277_ >= 0) {
							if (i_277_ >= is.length) {
								break;
							}
							int i_278_ = anInt8547;
							int i_279_ = anInt8570 + anInt8573;
							int i_280_ = anInt8571 + anInt8574;
							int i_281_ = anInt8572;
							int i_282_;
							if ((i_282_ = i_279_ - (width << 12)) >= 0) {
								i_282_ = (anInt8564 - i_282_) / anInt8564;
								i_281_ += i_282_;
								i_279_ += anInt8564 * i_282_;
								i_280_ += anInt8576 * i_282_;
								i_278_ += i_282_;
							}
							if ((i_282_ = (i_279_ - anInt8564) / anInt8564) > i_281_) {
								i_281_ = i_282_;
							}
							if ((i_282_ = i_280_ - (height << 12)) >= 0) {
								i_282_ = (anInt8576 - i_282_) / anInt8576;
								i_281_ += i_282_;
								i_279_ += anInt8564 * i_282_;
								i_280_ += anInt8576 * i_282_;
								i_278_ += i_282_;
							}
							if ((i_282_ = (i_280_ - anInt8576) / anInt8576) > i_281_) {
								i_281_ = i_282_;
							}
							int i_283_ = is[i_277_] - i;
							int i_284_ = -is_229_[i_277_];
							int i_285_ = i_283_ - (i_278_ - anInt8547);
							if (i_285_ > 0) {
								i_278_ += i_285_;
								i_281_ += i_285_;
								i_279_ += anInt8564 * i_285_;
								i_280_ += anInt8576 * i_285_;
							} else {
								i_284_ -= i_285_;
							}
							if (i_281_ < i_284_) {
								i_281_ = i_284_;
							}
							for (; i_281_ < 0; i_281_++) {
								int i_286_ = raster[(i_280_ >> 12) * width + (i_279_ >> 12)];
								if (i_286_ != 0) {
									is_231_[i_278_++] = i_286_;
								} else {
									i_278_++;
								}
								i_279_ += anInt8564;
								i_280_ += anInt8576;
							}
						}
						i_276_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else {
					int i_287_ = anInt8561;
					while (i_287_ < 0) {
						int i_288_ = i_287_ + i_230_;
						if (i_288_ >= 0) {
							if (i_288_ >= is.length) {
								break;
							}
							int i_289_ = anInt8547;
							int i_290_ = anInt8570 + anInt8573;
							int i_291_ = anInt8571 + anInt8574;
							int i_292_ = anInt8572;
							int i_293_;
							if ((i_293_ = i_290_ - (width << 12)) >= 0) {
								i_293_ = (anInt8564 - i_293_) / anInt8564;
								i_292_ += i_293_;
								i_290_ += anInt8564 * i_293_;
								i_291_ += anInt8576 * i_293_;
								i_289_ += i_293_;
							}
							if ((i_293_ = (i_290_ - anInt8564) / anInt8564) > i_292_) {
								i_292_ = i_293_;
							}
							if (i_291_ < 0) {
								i_293_ = (anInt8576 - 1 - i_291_) / anInt8576;
								i_292_ += i_293_;
								i_290_ += anInt8564 * i_293_;
								i_291_ += anInt8576 * i_293_;
								i_289_ += i_293_;
							}
							if ((i_293_ = (1 + i_291_ - (height << 12) - anInt8576) / anInt8576) > i_292_) {
								i_292_ = i_293_;
							}
							int i_294_ = is[i_288_] - i;
							int i_295_ = -is_229_[i_288_];
							int i_296_ = i_294_ - (i_289_ - anInt8547);
							if (i_296_ > 0) {
								i_289_ += i_296_;
								i_292_ += i_296_;
								i_290_ += anInt8564 * i_296_;
								i_291_ += anInt8576 * i_296_;
							} else {
								i_295_ -= i_296_;
							}
							if (i_292_ < i_295_) {
								i_292_ = i_295_;
							}
							for (; i_292_ < 0; i_292_++) {
								int i_297_ = raster[(i_291_ >> 12) * width + (i_290_ >> 12)];
								if (i_297_ != 0) {
									is_231_[i_289_++] = i_297_;
								} else {
									i_289_++;
								}
								i_290_ += anInt8564;
								i_291_ += anInt8576;
							}
						}
						i_287_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8576 == 0) {
				int i_298_ = anInt8561;
				while (i_298_ < 0) {
					int i_299_ = i_298_ + i_230_;
					if (i_299_ >= 0) {
						if (i_299_ >= is.length) {
							break;
						}
						int i_300_ = anInt8547;
						int i_301_ = anInt8570 + anInt8573;
						int i_302_ = anInt8571;
						int i_303_ = anInt8572;
						if (i_302_ >= 0 && i_302_ - (height << 12) < 0) {
							if (i_301_ < 0) {
								int i_304_ = (anInt8564 - 1 - i_301_) / anInt8564;
								i_303_ += i_304_;
								i_301_ += anInt8564 * i_304_;
								i_300_ += i_304_;
							}
							int i_305_;
							if ((i_305_ = (1 + i_301_ - (width << 12) - anInt8564) / anInt8564) > i_303_) {
								i_303_ = i_305_;
							}
							int i_306_ = is[i_299_] - i;
							int i_307_ = -is_229_[i_299_];
							int i_308_ = i_306_ - (i_300_ - anInt8547);
							if (i_308_ > 0) {
								i_300_ += i_308_;
								i_303_ += i_308_;
								i_301_ += anInt8564 * i_308_;
								i_302_ += anInt8576 * i_308_;
							} else {
								i_307_ -= i_308_;
							}
							if (i_303_ < i_307_) {
								i_303_ = i_307_;
							}
							for (; i_303_ < 0; i_303_++) {
								int i_309_ = raster[(i_302_ >> 12) * width + (i_301_ >> 12)];
								if (i_309_ != 0) {
									is_231_[i_300_++] = i_309_;
								} else {
									i_300_++;
								}
								i_301_ += anInt8564;
							}
						}
					}
					i_298_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else if (anInt8576 < 0) {
				int i_310_ = anInt8561;
				while (i_310_ < 0) {
					int i_311_ = i_310_ + i_230_;
					if (i_311_ >= 0) {
						if (i_311_ >= is.length) {
							break;
						}
						int i_312_ = anInt8547;
						int i_313_ = anInt8570 + anInt8573;
						int i_314_ = anInt8571 + anInt8574;
						int i_315_ = anInt8572;
						if (i_313_ < 0) {
							int i_316_ = (anInt8564 - 1 - i_313_) / anInt8564;
							i_315_ += i_316_;
							i_313_ += anInt8564 * i_316_;
							i_314_ += anInt8576 * i_316_;
							i_312_ += i_316_;
						}
						int i_317_;
						if ((i_317_ = (1 + i_313_ - (width << 12) - anInt8564) / anInt8564) > i_315_) {
							i_315_ = i_317_;
						}
						if ((i_317_ = i_314_ - (height << 12)) >= 0) {
							i_317_ = (anInt8576 - i_317_) / anInt8576;
							i_315_ += i_317_;
							i_313_ += anInt8564 * i_317_;
							i_314_ += anInt8576 * i_317_;
							i_312_ += i_317_;
						}
						if ((i_317_ = (i_314_ - anInt8576) / anInt8576) > i_315_) {
							i_315_ = i_317_;
						}
						int i_318_ = is[i_311_] - i;
						int i_319_ = -is_229_[i_311_];
						int i_320_ = i_318_ - (i_312_ - anInt8547);
						if (i_320_ > 0) {
							i_312_ += i_320_;
							i_315_ += i_320_;
							i_313_ += anInt8564 * i_320_;
							i_314_ += anInt8576 * i_320_;
						} else {
							i_319_ -= i_320_;
						}
						if (i_315_ < i_319_) {
							i_315_ = i_319_;
						}
						for (; i_315_ < 0; i_315_++) {
							int i_321_ = raster[(i_314_ >> 12) * width + (i_313_ >> 12)];
							if (i_321_ != 0) {
								is_231_[i_312_++] = i_321_;
							} else {
								i_312_++;
							}
							i_313_ += anInt8564;
							i_314_ += anInt8576;
						}
					}
					i_310_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else {
				int i_322_ = anInt8561;
				while (i_322_ < 0) {
					int i_323_ = i_322_ + i_230_;
					if (i_323_ >= 0) {
						if (i_323_ >= is.length) {
							break;
						}
						int i_324_ = anInt8547;
						int i_325_ = anInt8570 + anInt8573;
						int i_326_ = anInt8571 + anInt8574;
						int i_327_ = anInt8572;
						if (i_325_ < 0) {
							int i_328_ = (anInt8564 - 1 - i_325_) / anInt8564;
							i_327_ += i_328_;
							i_325_ += anInt8564 * i_328_;
							i_326_ += anInt8576 * i_328_;
							i_324_ += i_328_;
						}
						int i_329_;
						if ((i_329_ = (1 + i_325_ - (width << 12) - anInt8564) / anInt8564) > i_327_) {
							i_327_ = i_329_;
						}
						if (i_326_ < 0) {
							i_329_ = (anInt8576 - 1 - i_326_) / anInt8576;
							i_327_ += i_329_;
							i_325_ += anInt8564 * i_329_;
							i_326_ += anInt8576 * i_329_;
							i_324_ += i_329_;
						}
						if ((i_329_ = (1 + i_326_ - (height << 12) - anInt8576) / anInt8576) > i_327_) {
							i_327_ = i_329_;
						}
						int i_330_ = is[i_323_] - i;
						int i_331_ = -is_229_[i_323_];
						int i_332_ = i_330_ - (i_324_ - anInt8547);
						if (i_332_ > 0) {
							i_324_ += i_332_;
							i_327_ += i_332_;
							i_325_ += anInt8564 * i_332_;
							i_326_ += anInt8576 * i_332_;
						} else {
							i_331_ -= i_332_;
						}
						if (i_327_ < i_331_) {
							i_327_ = i_331_;
						}
						for (; i_327_ < 0; i_327_++) {
							int i_333_ = raster[(i_326_ >> 12) * width + (i_325_ >> 12)];
							if (i_333_ != 0) {
								is_231_[i_324_++] = i_333_;
							} else {
								i_324_++;
							}
							i_325_ += anInt8564;
							i_326_ += anInt8576;
						}
					}
					i_322_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			}
		}
	}

	void method17330(int i, int i_334_, int[] is, int i_335_, int i_336_) {
		if (i_336_ == 0) {
			if (i_335_ == 1) {
				is[i_334_] = raster[i];
			} else if (i_335_ == 0) {
				int i_337_ = raster[i++];
				int i_338_ = (i_337_ & 0xff0000) * anInt8577 & ~0xffffff;
				int i_339_ = (i_337_ & 0xff00) * anInt8560 & 0xff0000;
				int i_340_ = (i_337_ & 0xff) * anInt8579 & 0xff00;
				is[i_334_] = (i_338_ | i_339_ | i_340_) >>> 8;
			} else if (i_335_ == 3) {
				int i_341_ = raster[i++];
				int i_342_ = anInt8578;
				int i_343_ = i_341_ + i_342_;
				int i_344_ = (i_341_ & 0xff00ff) + (i_342_ & 0xff00ff);
				int i_345_ = (i_344_ & 0x1000100) + (i_343_ - i_344_ & 0x10000);
				is[i_334_] = i_343_ - i_345_ | i_345_ - (i_345_ >>> 8);
			} else if (i_335_ == 2) {
				int i_346_ = raster[i];
				int i_347_ = (i_346_ & 0xff00ff) * anInt8575 & ~0xff00ff;
				int i_348_ = (i_346_ & 0xff00) * anInt8575 & 0xff0000;
				is[i_334_] = ((i_347_ | i_348_) >>> 8) + anInt8582;
			} else {
				throw new IllegalArgumentException();
			}
		} else if (i_336_ == 1) {
			if (i_335_ == 1) {
				int i_349_ = raster[i];
				if (i_349_ != 0) {
					is[i_334_] = i_349_;
				}
			} else if (i_335_ == 0) {
				int i_350_ = raster[i];
				if (i_350_ != 0) {
					if ((anInt8578 & 0xffffff) == 16777215) {
						int i_351_ = anInt8578 >>> 24;
						int i_352_ = 256 - i_351_;
						int i_353_ = is[i_334_];
						is[i_334_] = ((i_350_ & 0xff00ff) * i_351_ + (i_353_ & 0xff00ff) * i_352_ & ~0xff00ff)
								+ ((i_350_ & 0xff00) * i_351_ + (i_353_ & 0xff00) * i_352_ & 0xff0000) >> 8;
					} else if (anInt8575 != 255) {
						int i_354_ = (i_350_ & 0xff0000) * anInt8577 & ~0xffffff;
						int i_355_ = (i_350_ & 0xff00) * anInt8560 & 0xff0000;
						int i_356_ = (i_350_ & 0xff) * anInt8579 & 0xff00;
						i_350_ = (i_354_ | i_355_ | i_356_) >>> 8;
						int i_357_ = is[i_334_];
						is[i_334_] = ((i_350_ & 0xff00ff) * anInt8575 + (i_357_ & 0xff00ff) * anInt8562 & ~0xff00ff)
								+ ((i_350_ & 0xff00) * anInt8575 + (i_357_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
					} else {
						int i_358_ = (i_350_ & 0xff0000) * anInt8577 & ~0xffffff;
						int i_359_ = (i_350_ & 0xff00) * anInt8560 & 0xff0000;
						int i_360_ = (i_350_ & 0xff) * anInt8579 & 0xff00;
						is[i_334_] = (i_358_ | i_359_ | i_360_) >>> 8;
					}
				}
			} else if (i_335_ == 3) {
				int i_361_ = raster[i];
				int i_362_ = anInt8578;
				int i_363_ = i_361_ + i_362_;
				int i_364_ = (i_361_ & 0xff00ff) + (i_362_ & 0xff00ff);
				int i_365_ = (i_364_ & 0x1000100) + (i_363_ - i_364_ & 0x10000);
				i_365_ = i_363_ - i_365_ | i_365_ - (i_365_ >>> 8);
				if (i_361_ == 0 && anInt8575 != 255) {
					i_361_ = i_365_;
					i_365_ = is[i_334_];
					i_365_ = ((i_361_ & 0xff00ff) * anInt8575 + (i_365_ & 0xff00ff) * anInt8562 & ~0xff00ff)
							+ ((i_361_ & 0xff00) * anInt8575 + (i_365_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
				}
				is[i_334_] = i_365_;
			} else if (i_335_ == 2) {
				int i_366_ = raster[i];
				if (i_366_ != 0) {
					int i_367_ = (i_366_ & 0xff00ff) * anInt8575 & ~0xff00ff;
					int i_368_ = (i_366_ & 0xff00) * anInt8575 & 0xff0000;
					is[i_334_++] = ((i_367_ | i_368_) >>> 8) + anInt8582;
				}
			} else {
				throw new IllegalArgumentException();
			}
		} else if (i_336_ == 2) {
			if (i_335_ == 1) {
				int i_369_ = raster[i];
				if (i_369_ != 0) {
					int i_370_ = is[i_334_];
					int i_371_ = i_369_ + i_370_;
					int i_372_ = (i_369_ & 0xff00ff) + (i_370_ & 0xff00ff);
					i_370_ = (i_372_ & 0x1000100) + (i_371_ - i_372_ & 0x10000);
					is[i_334_] = i_371_ - i_370_ | i_370_ - (i_370_ >>> 8);
				}
			} else if (i_335_ == 0) {
				int i_373_ = raster[i];
				if (i_373_ != 0) {
					int i_374_ = (i_373_ & 0xff0000) * anInt8577 & ~0xffffff;
					int i_375_ = (i_373_ & 0xff00) * anInt8560 & 0xff0000;
					int i_376_ = (i_373_ & 0xff) * anInt8579 & 0xff00;
					i_373_ = (i_374_ | i_375_ | i_376_) >>> 8;
					int i_377_ = is[i_334_];
					int i_378_ = i_373_ + i_377_;
					int i_379_ = (i_373_ & 0xff00ff) + (i_377_ & 0xff00ff);
					i_377_ = (i_379_ & 0x1000100) + (i_378_ - i_379_ & 0x10000);
					is[i_334_] = i_378_ - i_377_ | i_377_ - (i_377_ >>> 8);
				}
			} else if (i_335_ == 3) {
				int i_380_ = raster[i];
				int i_381_ = anInt8578;
				int i_382_ = i_380_ + i_381_;
				int i_383_ = (i_380_ & 0xff00ff) + (i_381_ & 0xff00ff);
				int i_384_ = (i_383_ & 0x1000100) + (i_382_ - i_383_ & 0x10000);
				i_380_ = i_382_ - i_384_ | i_384_ - (i_384_ >>> 8);
				i_384_ = is[i_334_];
				i_382_ = i_380_ + i_384_;
				i_383_ = (i_380_ & 0xff00ff) + (i_384_ & 0xff00ff);
				i_384_ = (i_383_ & 0x1000100) + (i_382_ - i_383_ & 0x10000);
				is[i_334_] = i_382_ - i_384_ | i_384_ - (i_384_ >>> 8);
			} else if (i_335_ == 2) {
				int i_385_ = raster[i];
				if (i_385_ != 0) {
					int i_386_ = (i_385_ & 0xff00ff) * anInt8575 & ~0xff00ff;
					int i_387_ = (i_385_ & 0xff00) * anInt8575 & 0xff0000;
					i_385_ = ((i_386_ | i_387_) >>> 8) + anInt8582;
					int i_388_ = is[i_334_];
					int i_389_ = i_385_ + i_388_;
					int i_390_ = (i_385_ & 0xff00ff) + (i_388_ & 0xff00ff);
					i_388_ = (i_390_ & 0x1000100) + (i_389_ - i_390_ & 0x10000);
					is[i_334_] = i_389_ - i_388_ | i_388_ - (i_388_ >>> 8);
				}
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	void method17331(int i, int i_391_, int i_392_, int i_393_, int[] is, int i_394_, int i_395_) {
		i_395_ -= i_392_;
		for (int i_396_ = 0; i_396_ < i_393_; i_396_++) {
			int i_397_ = (i_391_ + i_396_) * i_392_ + i;
			for (int i_398_ = 0; i_398_ < i_392_; i_398_++) {
				is[i_394_++] = raster[i_397_ + i_398_];
			}
			i_394_ += i_395_;
		}
	}

	@Override
	void method2083(int i, int i_399_, int i_400_, int i_401_, int i_402_, int i_403_, int i_404_, int i_405_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		if (i_400_ > 0 && i_401_ > 0) {
			int[] is = toolkit.anIntArray8797;
			if (is != null) {
				int i_406_ = 0;
				int i_407_ = 0;
				int i_408_ = toolkit.displayWidth * 464577083;
				int i_409_ = offsetX + width + deltaWidth;
				int i_410_ = offsetY + height + deltaHeight;
				int i_411_ = (i_409_ << 16) / i_400_;
				int i_412_ = (i_410_ << 16) / i_401_;
				if (offsetX > 0) {
					int i_413_ = ((offsetX << 16) + i_411_ - 1) / i_411_;
					i += i_413_;
					i_406_ += i_413_ * i_411_ - (offsetX << 16);
				}
				if (offsetY > 0) {
					int i_414_ = ((offsetY << 16) + i_412_ - 1) / i_412_;
					i_399_ += i_414_;
					i_407_ += i_414_ * i_412_ - (offsetY << 16);
				}
				if (width < i_409_) {
					i_400_ = ((width << 16) - i_406_ + i_411_ - 1) / i_411_;
				}
				if (height < i_410_) {
					i_401_ = ((height << 16) - i_407_ + i_412_ - 1) / i_412_;
				}
				int i_415_ = i + i_399_ * i_408_;
				int i_416_ = i_408_ - i_400_;
				if (i_399_ + i_401_ > toolkit.topClip * -68852597) {
					i_401_ -= i_399_ + i_401_ - toolkit.topClip * -68852597;
				}
				if (i_399_ < toolkit.bottomClip * 1163397961) {
					int i_417_ = toolkit.bottomClip * 1163397961 - i_399_;
					i_401_ -= i_417_;
					i_415_ += i_417_ * i_408_;
					i_407_ += i_412_ * i_417_;
				}
				if (i + i_400_ > toolkit.rightClip * -1451559971) {
					int i_418_ = i + i_400_ - toolkit.rightClip * -1451559971;
					i_400_ -= i_418_;
					i_416_ += i_418_;
				}
				if (i < toolkit.leftClip * 113391253) {
					int i_419_ = toolkit.leftClip * 113391253 - i;
					i_400_ -= i_419_;
					i_415_ += i_419_;
					i_406_ += i_411_ * i_419_;
					i_416_ += i_419_;
				}
				if (i_404_ == 0) {
					if (i_402_ == 1) {
						int i_420_ = i_406_;
						for (int i_421_ = -i_401_; i_421_ < 0; i_421_++) {
							int i_422_ = (i_407_ >> 16) * width;
							for (int i_423_ = -i_400_; i_423_ < 0; i_423_++) {
								is[i_415_++] = raster[(i_406_ >> 16) + i_422_];
								i_406_ += i_411_;
							}
							i_407_ += i_412_;
							i_406_ = i_420_;
							i_415_ += i_416_;
						}
					} else if (i_402_ == 0) {
						int i_424_ = (i_403_ & 0xff0000) >> 16;
						int i_425_ = (i_403_ & 0xff00) >> 8;
						int i_426_ = i_403_ & 0xff;
						int i_427_ = i_406_;
						for (int i_428_ = -i_401_; i_428_ < 0; i_428_++) {
							int i_429_ = (i_407_ >> 16) * width;
							for (int i_430_ = -i_400_; i_430_ < 0; i_430_++) {
								int i_431_ = raster[(i_406_ >> 16) + i_429_];
								int i_432_ = (i_431_ & 0xff0000) * i_424_ & ~0xffffff;
								int i_433_ = (i_431_ & 0xff00) * i_425_ & 0xff0000;
								int i_434_ = (i_431_ & 0xff) * i_426_ & 0xff00;
								is[i_415_++] = (i_432_ | i_433_ | i_434_) >>> 8;
								i_406_ += i_411_;
							}
							i_407_ += i_412_;
							i_406_ = i_427_;
							i_415_ += i_416_;
						}
					} else if (i_402_ == 3) {
						int i_435_ = i_406_;
						for (int i_436_ = -i_401_; i_436_ < 0; i_436_++) {
							int i_437_ = (i_407_ >> 16) * width;
							for (int i_438_ = -i_400_; i_438_ < 0; i_438_++) {
								int i_439_ = raster[(i_406_ >> 16) + i_437_];
								int i_440_ = i_439_ + i_403_;
								int i_441_ = (i_439_ & 0xff00ff) + (i_403_ & 0xff00ff);
								int i_442_ = (i_441_ & 0x1000100) + (i_440_ - i_441_ & 0x10000);
								is[i_415_++] = i_440_ - i_442_ | i_442_ - (i_442_ >>> 8);
								i_406_ += i_411_;
							}
							i_407_ += i_412_;
							i_406_ = i_435_;
							i_415_ += i_416_;
						}
					} else if (i_402_ == 2) {
						int i_443_ = i_403_ >>> 24;
						int i_444_ = 256 - i_443_;
						int i_445_ = (i_403_ & 0xff00ff) * i_444_ & ~0xff00ff;
						int i_446_ = (i_403_ & 0xff00) * i_444_ & 0xff0000;
						i_403_ = (i_445_ | i_446_) >>> 8;
						int i_447_ = i_406_;
						for (int i_448_ = -i_401_; i_448_ < 0; i_448_++) {
							int i_449_ = (i_407_ >> 16) * width;
							for (int i_450_ = -i_400_; i_450_ < 0; i_450_++) {
								int i_451_ = raster[(i_406_ >> 16) + i_449_];
								i_445_ = (i_451_ & 0xff00ff) * i_443_ & ~0xff00ff;
								i_446_ = (i_451_ & 0xff00) * i_443_ & 0xff0000;
								is[i_415_++] = ((i_445_ | i_446_) >>> 8) + i_403_;
								i_406_ += i_411_;
							}
							i_407_ += i_412_;
							i_406_ = i_447_;
							i_415_ += i_416_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_404_ == 1) {
					if (i_402_ == 1) {
						int i_452_ = i_406_;
						for (int i_453_ = -i_401_; i_453_ < 0; i_453_++) {
							int i_454_ = (i_407_ >> 16) * width;
							for (int i_455_ = -i_400_; i_455_ < 0; i_455_++) {
								int i_456_ = raster[(i_406_ >> 16) + i_454_];
								if (i_456_ != 0) {
									is[i_415_++] = i_456_;
								} else {
									i_415_++;
								}
								i_406_ += i_411_;
							}
							i_407_ += i_412_;
							i_406_ = i_452_;
							i_415_ += i_416_;
						}
					} else if (i_402_ == 0) {
						int i_457_ = i_406_;
						if ((i_403_ & 0xffffff) == 16777215) {
							int i_458_ = i_403_ >>> 24;
							int i_459_ = 256 - i_458_;
							for (int i_460_ = -i_401_; i_460_ < 0; i_460_++) {
								int i_461_ = (i_407_ >> 16) * width;
								for (int i_462_ = -i_400_; i_462_ < 0; i_462_++) {
									int i_463_ = raster[(i_406_ >> 16) + i_461_];
									if (i_463_ != 0) {
										int i_464_ = is[i_415_];
										is[i_415_++] = ((i_463_ & 0xff00ff) * i_458_ + (i_464_ & 0xff00ff) * i_459_ & ~0xff00ff)
												+ ((i_463_ & 0xff00) * i_458_ + (i_464_ & 0xff00) * i_459_ & 0xff0000) >> 8;
									} else {
										i_415_++;
									}
									i_406_ += i_411_;
								}
								i_407_ += i_412_;
								i_406_ = i_457_;
								i_415_ += i_416_;
							}
						} else {
							int i_465_ = (i_403_ & 0xff0000) >> 16;
							int i_466_ = (i_403_ & 0xff00) >> 8;
							int i_467_ = i_403_ & 0xff;
							int i_468_ = i_403_ >>> 24;
							int i_469_ = 256 - i_468_;
							for (int i_470_ = -i_401_; i_470_ < 0; i_470_++) {
								int i_471_ = (i_407_ >> 16) * width;
								for (int i_472_ = -i_400_; i_472_ < 0; i_472_++) {
									int i_473_ = raster[(i_406_ >> 16) + i_471_];
									if (i_473_ != 0) {
										if (i_468_ != 255) {
											int i_474_ = (i_473_ & 0xff0000) * i_465_ & ~0xffffff;
											int i_475_ = (i_473_ & 0xff00) * i_466_ & 0xff0000;
											int i_476_ = (i_473_ & 0xff) * i_467_ & 0xff00;
											i_473_ = (i_474_ | i_475_ | i_476_) >>> 8;
											int i_477_ = is[i_415_];
											is[i_415_++] = ((i_473_ & 0xff00ff) * i_468_ + (i_477_ & 0xff00ff) * i_469_ & ~0xff00ff)
													+ ((i_473_ & 0xff00) * i_468_ + (i_477_ & 0xff00) * i_469_ & 0xff0000) >> 8;
										} else {
											int i_478_ = (i_473_ & 0xff0000) * i_465_ & ~0xffffff;
											int i_479_ = (i_473_ & 0xff00) * i_466_ & 0xff0000;
											int i_480_ = (i_473_ & 0xff) * i_467_ & 0xff00;
											is[i_415_++] = (i_478_ | i_479_ | i_480_) >>> 8;
										}
									} else {
										i_415_++;
									}
									i_406_ += i_411_;
								}
								i_407_ += i_412_;
								i_406_ = i_457_;
								i_415_ += i_416_;
							}
						}
					} else if (i_402_ == 3) {
						int i_481_ = i_406_;
						int i_482_ = i_403_ >>> 24;
						int i_483_ = 256 - i_482_;
						for (int i_484_ = -i_401_; i_484_ < 0; i_484_++) {
							int i_485_ = (i_407_ >> 16) * width;
							for (int i_486_ = -i_400_; i_486_ < 0; i_486_++) {
								int i_487_ = raster[(i_406_ >> 16) + i_485_];
								int i_488_ = i_487_ + i_403_;
								int i_489_ = (i_487_ & 0xff00ff) + (i_403_ & 0xff00ff);
								int i_490_ = (i_489_ & 0x1000100) + (i_488_ - i_489_ & 0x10000);
								i_490_ = i_488_ - i_490_ | i_490_ - (i_490_ >>> 8);
								if (i_487_ == 0 && i_482_ != 255) {
									i_487_ = i_490_;
									i_490_ = is[i_415_];
									i_490_ = ((i_487_ & 0xff00ff) * i_482_ + (i_490_ & 0xff00ff) * i_483_ & ~0xff00ff)
											+ ((i_487_ & 0xff00) * i_482_ + (i_490_ & 0xff00) * i_483_ & 0xff0000) >> 8;
								}
								is[i_415_++] = i_490_;
								i_406_ += i_411_;
							}
							i_407_ += i_412_;
							i_406_ = i_481_;
							i_415_ += i_416_;
						}
					} else if (i_402_ == 2) {
						int i_491_ = i_403_ >>> 24;
						int i_492_ = 256 - i_491_;
						int i_493_ = (i_403_ & 0xff00ff) * i_492_ & ~0xff00ff;
						int i_494_ = (i_403_ & 0xff00) * i_492_ & 0xff0000;
						i_403_ = (i_493_ | i_494_) >>> 8;
						int i_495_ = i_406_;
						for (int i_496_ = -i_401_; i_496_ < 0; i_496_++) {
							int i_497_ = (i_407_ >> 16) * width;
							for (int i_498_ = -i_400_; i_498_ < 0; i_498_++) {
								int i_499_ = raster[(i_406_ >> 16) + i_497_];
								if (i_499_ != 0) {
									i_493_ = (i_499_ & 0xff00ff) * i_491_ & ~0xff00ff;
									i_494_ = (i_499_ & 0xff00) * i_491_ & 0xff0000;
									is[i_415_++] = ((i_493_ | i_494_) >>> 8) + i_403_;
								} else {
									i_415_++;
								}
								i_406_ += i_411_;
							}
							i_407_ += i_412_;
							i_406_ = i_495_;
							i_415_ += i_416_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_404_ == 2) {
					if (i_402_ == 1) {
						int i_500_ = i_406_;
						for (int i_501_ = -i_401_; i_501_ < 0; i_501_++) {
							int i_502_ = (i_407_ >> 16) * width;
							for (int i_503_ = -i_400_; i_503_ < 0; i_503_++) {
								int i_504_ = raster[(i_406_ >> 16) + i_502_];
								if (i_504_ != 0) {
									int i_505_ = is[i_415_];
									int i_506_ = i_504_ + i_505_;
									int i_507_ = (i_504_ & 0xff00ff) + (i_505_ & 0xff00ff);
									i_505_ = (i_507_ & 0x1000100) + (i_506_ - i_507_ & 0x10000);
									is[i_415_++] = i_506_ - i_505_ | i_505_ - (i_505_ >>> 8);
								} else {
									i_415_++;
								}
								i_406_ += i_411_;
							}
							i_407_ += i_412_;
							i_406_ = i_500_;
							i_415_ += i_416_;
						}
					} else if (i_402_ == 0) {
						int i_508_ = i_406_;
						int i_509_ = (i_403_ & 0xff0000) >> 16;
						int i_510_ = (i_403_ & 0xff00) >> 8;
						int i_511_ = i_403_ & 0xff;
						for (int i_512_ = -i_401_; i_512_ < 0; i_512_++) {
							int i_513_ = (i_407_ >> 16) * width;
							for (int i_514_ = -i_400_; i_514_ < 0; i_514_++) {
								int i_515_ = raster[(i_406_ >> 16) + i_513_];
								if (i_515_ != 0) {
									int i_516_ = (i_515_ & 0xff0000) * i_509_ & ~0xffffff;
									int i_517_ = (i_515_ & 0xff00) * i_510_ & 0xff0000;
									int i_518_ = (i_515_ & 0xff) * i_511_ & 0xff00;
									i_515_ = (i_516_ | i_517_ | i_518_) >>> 8;
									int i_519_ = is[i_415_];
									int i_520_ = i_515_ + i_519_;
									int i_521_ = (i_515_ & 0xff00ff) + (i_519_ & 0xff00ff);
									i_519_ = (i_521_ & 0x1000100) + (i_520_ - i_521_ & 0x10000);
									is[i_415_++] = i_520_ - i_519_ | i_519_ - (i_519_ >>> 8);
								} else {
									i_415_++;
								}
								i_406_ += i_411_;
							}
							i_407_ += i_412_;
							i_406_ = i_508_;
							i_415_ += i_416_;
						}
					} else if (i_402_ == 3) {
						int i_522_ = i_406_;
						for (int i_523_ = -i_401_; i_523_ < 0; i_523_++) {
							int i_524_ = (i_407_ >> 16) * width;
							for (int i_525_ = -i_400_; i_525_ < 0; i_525_++) {
								int i_526_ = raster[(i_406_ >> 16) + i_524_];
								int i_527_ = i_526_ + i_403_;
								int i_528_ = (i_526_ & 0xff00ff) + (i_403_ & 0xff00ff);
								int i_529_ = (i_528_ & 0x1000100) + (i_527_ - i_528_ & 0x10000);
								i_526_ = i_527_ - i_529_ | i_529_ - (i_529_ >>> 8);
								i_529_ = is[i_415_];
								i_527_ = i_526_ + i_529_;
								i_528_ = (i_526_ & 0xff00ff) + (i_529_ & 0xff00ff);
								i_529_ = (i_528_ & 0x1000100) + (i_527_ - i_528_ & 0x10000);
								is[i_415_++] = i_527_ - i_529_ | i_529_ - (i_529_ >>> 8);
								i_406_ += i_411_;
							}
							i_407_ += i_412_;
							i_406_ = i_522_;
							i_415_ += i_416_;
						}
					} else if (i_402_ == 2) {
						int i_530_ = i_403_ >>> 24;
						int i_531_ = 256 - i_530_;
						int i_532_ = (i_403_ & 0xff00ff) * i_531_ & ~0xff00ff;
						int i_533_ = (i_403_ & 0xff00) * i_531_ & 0xff0000;
						i_403_ = (i_532_ | i_533_) >>> 8;
						int i_534_ = i_406_;
						for (int i_535_ = -i_401_; i_535_ < 0; i_535_++) {
							int i_536_ = (i_407_ >> 16) * width;
							for (int i_537_ = -i_400_; i_537_ < 0; i_537_++) {
								int i_538_ = raster[(i_406_ >> 16) + i_536_];
								if (i_538_ != 0) {
									i_532_ = (i_538_ & 0xff00ff) * i_530_ & ~0xff00ff;
									i_533_ = (i_538_ & 0xff00) * i_530_ & 0xff0000;
									i_538_ = ((i_532_ | i_533_) >>> 8) + i_403_;
									int i_539_ = is[i_415_];
									int i_540_ = i_538_ + i_539_;
									int i_541_ = (i_538_ & 0xff00ff) + (i_539_ & 0xff00ff);
									i_539_ = (i_541_ & 0x1000100) + (i_540_ - i_541_ & 0x10000);
									is[i_415_++] = i_540_ - i_539_ | i_539_ - (i_539_ >>> 8);
								} else {
									i_415_++;
								}
								i_406_ += i_411_;
							}
							i_407_ += i_412_;
							i_406_ = i_534_;
							i_415_ += i_416_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}
}
