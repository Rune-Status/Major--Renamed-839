package com.jagex;

public class TransparentJavaSprite extends JavaSprite {

	int[] raster;

	TransparentJavaSprite(JavaToolkit toolkit, int width, int height) {
		super(toolkit, width, height);
		raster = new int[width * height];
	}

	TransparentJavaSprite(JavaToolkit toolkit, int[] raster, int width, int height) {
		super(toolkit, width, height);
		this.raster = raster;
	}

	TransparentJavaSprite(JavaToolkit toolkit, int[] raster, int sourceOffset, int step, int width, int height,
			boolean copy) {
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
				this.raster[dest++] = raster[sourceOffset++];
			}

			sourceOffset += step;
		}
	}

	@Override
	public Interface16 method2075() {
		return new IntRaster(width, height, raster);
	}

	@Override
	public void method2076(int i, int i_174_, int i_175_, int i_176_, int[] is, int[] is_177_, int i_178_, int i_179_) {
		method17343(i, i_174_, i_175_, i_176_, is, i_178_, i_179_);
	}

	@Override
	public void method2081(int i, int i_316_, ClippingMask class129, int i_317_, int i_318_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		int[] is = toolkit.anIntArray8797;
		if (is != null) {
			i += offsetX;
			i_316_ += offsetY;
			int i_319_ = 0;
			int i_320_ = toolkit.displayWidth * 464577083;
			int i_321_ = width;
			int i_322_ = height;
			int i_323_ = i_320_ - i_321_;
			int i_324_ = 0;
			int i_325_ = i + i_316_ * i_320_;
			if (i_316_ < toolkit.bottomClip * 1163397961) {
				int i_326_ = toolkit.bottomClip * 1163397961 - i_316_;
				i_322_ -= i_326_;
				i_316_ = toolkit.bottomClip * 1163397961;
				i_319_ += i_326_ * i_321_;
				i_325_ += i_326_ * i_320_;
			}
			if (i_316_ + i_322_ > toolkit.topClip * -68852597) {
				i_322_ -= i_316_ + i_322_ - toolkit.topClip * -68852597;
			}
			if (i < toolkit.leftClip * 113391253) {
				int i_327_ = toolkit.leftClip * 113391253 - i;
				i_321_ -= i_327_;
				i = toolkit.leftClip * 113391253;
				i_319_ += i_327_;
				i_325_ += i_327_;
				i_324_ += i_327_;
				i_323_ += i_327_;
			}
			if (i + i_321_ > toolkit.rightClip * -1451559971) {
				int i_328_ = i + i_321_ - toolkit.rightClip * -1451559971;
				i_321_ -= i_328_;
				i_324_ += i_328_;
				i_323_ += i_328_;
			}
			if (i_321_ > 0 && i_322_ > 0) {
				JavaClippingMask class129_sub3 = (JavaClippingMask) class129;
				int[] is_329_ = class129_sub3.offsets;
				int[] is_330_ = class129_sub3.widths;
				int i_331_ = i_316_;
				if (i_318_ > i_331_) {
					i_331_ = i_318_;
					i_325_ += (i_318_ - i_316_) * i_320_;
					i_319_ += (i_318_ - i_316_) * width;
				}
				int i_332_ = i_318_ + is_329_.length < i_316_ + i_322_ ? i_318_ + is_329_.length : i_316_ + i_322_;
				for (int i_333_ = i_331_; i_333_ < i_332_; i_333_++) {
					int i_334_ = is_329_[i_333_ - i_318_] + i_317_;
					int i_335_ = is_330_[i_333_ - i_318_];
					int i_336_ = i_321_;
					if (i > i_334_) {
						int i_337_ = i - i_334_;
						if (i_337_ >= i_335_) {
							i_319_ += i_321_ + i_324_;
							i_325_ += i_321_ + i_323_;
							continue;
						}
						i_335_ -= i_337_;
					} else {
						int i_338_ = i_334_ - i;
						if (i_338_ >= i_321_) {
							i_319_ += i_321_ + i_324_;
							i_325_ += i_321_ + i_323_;
							continue;
						}
						i_319_ += i_338_;
						i_336_ -= i_338_;
						i_325_ += i_338_;
					}
					int i_339_ = 0;
					if (i_336_ < i_335_) {
						i_335_ = i_336_;
					} else {
						i_339_ = i_336_ - i_335_;
					}
					for (int i_340_ = -i_335_; i_340_ < 0; i_340_++) {
						int i_341_ = raster[i_319_++];
						int i_342_ = i_341_ >>> 24;
						int i_343_ = 256 - i_342_;
						int i_344_ = is[i_325_];
						is[i_325_++] = ((i_341_ & 0xff00ff) * i_342_ + (i_344_ & 0xff00ff) * i_343_ & ~0xff00ff)
								+ ((i_341_ & 0xff00) * i_342_ + (i_344_ & 0xff00) * i_343_ & 0xff0000) >> 8;
					}
					i_319_ += i_339_ + i_324_;
					i_325_ += i_339_ + i_323_;
				}
			}
		}
	}

	@Override
	public void method2088(int i, int i_749_, int i_750_, int i_751_, int i_752_, int i_753_) {
		int[] is = toolkit.anIntArray8797;
		if (is == null) {
			throw new IllegalStateException("");
		}
		for (int i_754_ = 0; i_754_ < i_751_; i_754_++) {
			int i_755_ = (i_749_ + i_754_) * i_750_ + i;
			int i_756_ = (i_753_ + i_754_) * i_750_ + i_752_;
			for (int i_757_ = 0; i_757_ < i_750_; i_757_++) {
				raster[i_755_ + i_757_] = is[i_756_ + i_757_] & 0xffffff;
			}
		}
	}

	@Override
	public void method2100(int i, int i_14_, int i_15_, int i_16_, int[] is, int i_17_, int i_18_) {
		i_18_ -= i_15_;
		for (int i_19_ = 0; i_19_ < i_16_; i_19_++) {
			int i_20_ = (i_14_ + i_19_) * i_15_ + i;
			for (int i_21_ = 0; i_21_ < i_15_; i_21_++) {
				raster[i_20_ + i_21_] = is[i_17_++];
			}
			i_17_ += i_18_;
		}
	}

	@Override
	public void method2114(int i, int i_181_, int i_182_) {
		int[] is = toolkit.anIntArray8797;
		if (is == null) {
			throw new IllegalStateException("");
		}
		if (i_182_ == 0) {
			for (int i_183_ = 0; i_183_ < height; i_183_++) {
				int i_184_ = i_183_ * width;
				int i_185_ = (i_181_ + i_183_) * toolkit.displayWidth * 464577083 + i;
				for (int i_186_ = 0; i_186_ < width; i_186_++) {
					raster[i_184_ + i_186_] = raster[i_184_ + i_186_] & 0xffffff | is[i_185_ + i_186_] << 8 & ~0xffffff;
				}
			}
		} else if (i_182_ == 1) {
			for (int i_187_ = 0; i_187_ < height; i_187_++) {
				int i_188_ = i_187_ * width;
				int i_189_ = (i_181_ + i_187_) * toolkit.displayWidth * 464577083 + i;
				for (int i_190_ = 0; i_190_ < width; i_190_++) {
					raster[i_188_ + i_190_] = raster[i_188_ + i_190_] & 0xffffff | is[i_189_ + i_190_] << 16
							& ~0xffffff;
				}
			}
		} else if (i_182_ == 2) {
			for (int i_191_ = 0; i_191_ < height; i_191_++) {
				int i_192_ = i_191_ * width;
				int i_193_ = (i_181_ + i_191_) * toolkit.displayWidth * 464577083 + i;
				for (int i_194_ = 0; i_194_ < width; i_194_++) {
					raster[i_192_ + i_194_] = raster[i_192_ + i_194_] & 0xffffff | is[i_193_ + i_194_] << 24
							& ~0xffffff;
				}
			}
		} else if (i_182_ == 3) {
			for (int i_195_ = 0; i_195_ < height; i_195_++) {
				int i_196_ = i_195_ * width;
				int i_197_ = (i_181_ + i_195_) * toolkit.displayWidth * 464577083 + i;
				for (int i_198_ = 0; i_198_ < width; i_198_++) {
					raster[i_196_ + i_198_] = raster[i_196_ + i_198_] & 0xffffff
							| (is[i_197_ + i_198_] != 0 ? -16777216 : 0);
				}
			}
		}
	}

	@Override
	public void method2142(int x, int i_199_, int i_200_, int i_201_, int i_202_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		int[] is = toolkit.anIntArray8797;
		if (is != null) {
			int i_203_ = toolkit.displayWidth * 464577083;
			x += offsetX;
			i_199_ += offsetY;
			int i_204_ = i_199_ * i_203_ + x;
			int i_205_ = 0;
			int i_206_ = height;
			int i_207_ = width;
			int i_208_ = i_203_ - i_207_;
			int i_209_ = 0;
			if (i_199_ < toolkit.bottomClip * 1163397961) {
				int i_210_ = toolkit.bottomClip * 1163397961 - i_199_;
				i_206_ -= i_210_;
				i_199_ = toolkit.bottomClip * 1163397961;
				i_205_ += i_210_ * i_207_;
				i_204_ += i_210_ * i_203_;
			}
			if (i_199_ + i_206_ > toolkit.topClip * -68852597) {
				i_206_ -= i_199_ + i_206_ - toolkit.topClip * -68852597;
			}
			if (x < toolkit.leftClip * 113391253) {
				int i_211_ = toolkit.leftClip * 113391253 - x;
				i_207_ -= i_211_;
				x = toolkit.leftClip * 113391253;
				i_205_ += i_211_;
				i_204_ += i_211_;
				i_209_ += i_211_;
				i_208_ += i_211_;
			}
			if (x + i_207_ > toolkit.rightClip * -1451559971) {
				int i_212_ = x + i_207_ - toolkit.rightClip * -1451559971;
				i_207_ -= i_212_;
				i_209_ += i_212_;
				i_208_ += i_212_;
			}
			if (i_207_ > 0 && i_206_ > 0) {
				if (i_202_ == 0) {
					if (i_200_ == 1) {
						for (int i_213_ = -i_206_; i_213_ < 0; i_213_++) {
							int i_214_ = i_204_ + i_207_ - 3;
							while (i_204_ < i_214_) {
								is[i_204_++] = raster[i_205_++];
								is[i_204_++] = raster[i_205_++];
								is[i_204_++] = raster[i_205_++];
								is[i_204_++] = raster[i_205_++];
							}
							i_214_ += 3;
							while (i_204_ < i_214_) {
								is[i_204_++] = raster[i_205_++];
							}
							i_204_ += i_208_;
							i_205_ += i_209_;
						}
					} else if (i_200_ == 0) {
						int i_215_ = (i_201_ & 0xff0000) >> 16;
						int i_216_ = (i_201_ & 0xff00) >> 8;
						int i_217_ = i_201_ & 0xff;
						for (int i_218_ = -i_206_; i_218_ < 0; i_218_++) {
							for (int i_219_ = -i_207_; i_219_ < 0; i_219_++) {
								int i_220_ = raster[i_205_++];
								int i_221_ = (i_220_ & 0xff0000) * i_215_ & ~0xffffff;
								int i_222_ = (i_220_ & 0xff00) * i_216_ & 0xff0000;
								int i_223_ = (i_220_ & 0xff) * i_217_ & 0xff00;
								is[i_204_++] = (i_221_ | i_222_ | i_223_) >>> 8;
							}
							i_204_ += i_208_;
							i_205_ += i_209_;
						}
					} else if (i_200_ == 3) {
						for (int i_224_ = -i_206_; i_224_ < 0; i_224_++) {
							for (int i_225_ = -i_207_; i_225_ < 0; i_225_++) {
								int i_226_ = raster[i_205_++];
								int i_227_ = i_226_ + i_201_;
								int i_228_ = (i_226_ & 0xff00ff) + (i_201_ & 0xff00ff);
								int i_229_ = (i_228_ & 0x1000100) + (i_227_ - i_228_ & 0x10000);
								is[i_204_++] = i_227_ - i_229_ | i_229_ - (i_229_ >>> 8);
							}
							i_204_ += i_208_;
							i_205_ += i_209_;
						}
					} else if (i_200_ == 2) {
						int i_230_ = i_201_ >>> 24;
						int i_231_ = 256 - i_230_;
						int i_232_ = (i_201_ & 0xff00ff) * i_231_ & ~0xff00ff;
						int i_233_ = (i_201_ & 0xff00) * i_231_ & 0xff0000;
						i_201_ = (i_232_ | i_233_) >>> 8;
						for (int i_234_ = -i_206_; i_234_ < 0; i_234_++) {
							for (int i_235_ = -i_207_; i_235_ < 0; i_235_++) {
								int i_236_ = raster[i_205_++];
								i_232_ = (i_236_ & 0xff00ff) * i_230_ & ~0xff00ff;
								i_233_ = (i_236_ & 0xff00) * i_230_ & 0xff0000;
								is[i_204_++] = ((i_232_ | i_233_) >>> 8) + i_201_;
							}
							i_204_ += i_208_;
							i_205_ += i_209_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_202_ == 1) {
					if (i_200_ == 1) {
						for (int i_237_ = -i_206_; i_237_ < 0; i_237_++) {
							for (int i_238_ = -i_207_; i_238_ < 0; i_238_++) {
								int i_239_ = raster[i_205_++];
								int i_240_ = i_239_ >>> 24;
								int i_241_ = 256 - i_240_;
								int i_242_ = is[i_204_];
								is[i_204_++] = (((i_239_ & 0xff00ff) * i_240_ + (i_242_ & 0xff00ff) * i_241_ & ~0xff00ff) >> 8)
										+ (((i_239_ & ~0xff00ff) >>> 8) * i_240_ + ((i_242_ & ~0xff00ff) >>> 8)
												* i_241_ & ~0xff00ff);
							}
							i_204_ += i_208_;
							i_205_ += i_209_;
						}
					} else if (i_200_ == 0) {
						if ((i_201_ & 0xffffff) == 16777215) {
							for (int i_243_ = -i_206_; i_243_ < 0; i_243_++) {
								for (int i_244_ = -i_207_; i_244_ < 0; i_244_++) {
									int i_245_ = raster[i_205_++];
									int i_246_ = (i_245_ >>> 24) * (i_201_ >>> 24) >> 8;
									int i_247_ = 256 - i_246_;
									int i_248_ = is[i_204_];
									is[i_204_++] = ((i_245_ & 0xff00ff) * i_246_ + (i_248_ & 0xff00ff) * i_247_ & ~0xff00ff)
											+ ((i_245_ & 0xff00) * i_246_ + (i_248_ & 0xff00) * i_247_ & 0xff0000) >> 8;
								}
								i_204_ += i_208_;
								i_205_ += i_209_;
							}
						} else {
							int i_249_ = (i_201_ & 0xff0000) >> 16;
							int i_250_ = (i_201_ & 0xff00) >> 8;
							int i_251_ = i_201_ & 0xff;
							for (int i_252_ = -i_206_; i_252_ < 0; i_252_++) {
								for (int i_253_ = -i_207_; i_253_ < 0; i_253_++) {
									int i_254_ = raster[i_205_++];
									int i_255_ = (i_254_ >>> 24) * (i_201_ >>> 24) >> 8;
									int i_256_ = 256 - i_255_;
									if (i_255_ != 255) {
										int i_257_ = (i_254_ & 0xff0000) * i_249_ & ~0xffffff;
										int i_258_ = (i_254_ & 0xff00) * i_250_ & 0xff0000;
										int i_259_ = (i_254_ & 0xff) * i_251_ & 0xff00;
										i_254_ = (i_257_ | i_258_ | i_259_) >>> 8;
										int i_260_ = is[i_204_];
										is[i_204_++] = ((i_254_ & 0xff00ff) * i_255_ + (i_260_ & 0xff00ff) * i_256_ & ~0xff00ff)
												+ ((i_254_ & 0xff00) * i_255_ + (i_260_ & 0xff00) * i_256_ & 0xff0000) >> 8;
									} else {
										int i_261_ = (i_254_ & 0xff0000) * i_249_ & ~0xffffff;
										int i_262_ = (i_254_ & 0xff00) * i_250_ & 0xff0000;
										int i_263_ = (i_254_ & 0xff) * i_251_ & 0xff00;
										is[i_204_++] = (i_261_ | i_262_ | i_263_) >>> 8;
									}
								}
								i_204_ += i_208_;
								i_205_ += i_209_;
							}
						}
					} else if (i_200_ == 3) {
						for (int i_264_ = -i_206_; i_264_ < 0; i_264_++) {
							for (int i_265_ = -i_207_; i_265_ < 0; i_265_++) {
								int i_266_ = raster[i_205_++];
								int i_267_ = i_266_ + i_201_;
								int i_268_ = (i_266_ & 0xff00ff) + (i_201_ & 0xff00ff);
								int i_269_ = (i_268_ & 0x1000100) + (i_267_ - i_268_ & 0x10000);
								i_269_ = i_267_ - i_269_ | i_269_ - (i_269_ >>> 8);
								int i_270_ = (i_269_ >>> 24) * (i_201_ >>> 24) >> 8;
								int i_271_ = 256 - i_270_;
								if (i_270_ != 255) {
									i_266_ = i_269_;
									i_269_ = is[i_204_];
									i_269_ = ((i_266_ & 0xff00ff) * i_270_ + (i_269_ & 0xff00ff) * i_271_ & ~0xff00ff)
											+ ((i_266_ & 0xff00) * i_270_ + (i_269_ & 0xff00) * i_271_ & 0xff0000) >> 8;
								}
								is[i_204_++] = i_269_;
							}
							i_204_ += i_208_;
							i_205_ += i_209_;
						}
					} else if (i_200_ == 2) {
						int i_272_ = i_201_ >>> 24;
						int i_273_ = 256 - i_272_;
						int i_274_ = (i_201_ & 0xff00ff) * i_273_ & ~0xff00ff;
						int i_275_ = (i_201_ & 0xff00) * i_273_ & 0xff0000;
						i_201_ = (i_274_ | i_275_) >>> 8;
						for (int i_276_ = -i_206_; i_276_ < 0; i_276_++) {
							for (int i_277_ = -i_207_; i_277_ < 0; i_277_++) {
								int i_278_ = raster[i_205_++];
								int i_279_ = i_278_ >>> 24;
								int i_280_ = 256 - i_279_;
								i_274_ = (i_278_ & 0xff00ff) * i_272_ & ~0xff00ff;
								i_275_ = (i_278_ & 0xff00) * i_272_ & 0xff0000;
								i_278_ = ((i_274_ | i_275_) >>> 8) + i_201_;
								int i_281_ = is[i_204_];
								is[i_204_++] = ((i_278_ & 0xff00ff) * i_279_ + (i_281_ & 0xff00ff) * i_280_ & ~0xff00ff)
										+ ((i_278_ & 0xff00) * i_279_ + (i_281_ & 0xff00) * i_280_ & 0xff0000) >> 8;
							}
							i_204_ += i_208_;
							i_205_ += i_209_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_202_ == 2) {
					if (i_200_ == 1) {
						for (int i_282_ = -i_206_; i_282_ < 0; i_282_++) {
							for (int i_283_ = -i_207_; i_283_ < 0; i_283_++) {
								int i_284_ = raster[i_205_++];
								if (i_284_ != 0) {
									int i_285_ = is[i_204_];
									int i_286_ = i_284_ + i_285_;
									int i_287_ = (i_284_ & 0xff00ff) + (i_285_ & 0xff00ff);
									i_285_ = (i_287_ & 0x1000100) + (i_286_ - i_287_ & 0x10000);
									is[i_204_++] = i_286_ - i_285_ | i_285_ - (i_285_ >>> 8);
								} else {
									i_204_++;
								}
							}
							i_204_ += i_208_;
							i_205_ += i_209_;
						}
					} else if (i_200_ == 0) {
						int i_288_ = (i_201_ & 0xff0000) >> 16;
						int i_289_ = (i_201_ & 0xff00) >> 8;
						int i_290_ = i_201_ & 0xff;
						for (int i_291_ = -i_206_; i_291_ < 0; i_291_++) {
							for (int i_292_ = -i_207_; i_292_ < 0; i_292_++) {
								int i_293_ = raster[i_205_++];
								if (i_293_ != 0) {
									int i_294_ = (i_293_ & 0xff0000) * i_288_ & ~0xffffff;
									int i_295_ = (i_293_ & 0xff00) * i_289_ & 0xff0000;
									int i_296_ = (i_293_ & 0xff) * i_290_ & 0xff00;
									i_293_ = (i_294_ | i_295_ | i_296_) >>> 8;
									int i_297_ = is[i_204_];
									int i_298_ = i_293_ + i_297_;
									int i_299_ = (i_293_ & 0xff00ff) + (i_297_ & 0xff00ff);
									i_297_ = (i_299_ & 0x1000100) + (i_298_ - i_299_ & 0x10000);
									is[i_204_++] = i_298_ - i_297_ | i_297_ - (i_297_ >>> 8);
								} else {
									i_204_++;
								}
							}
							i_204_ += i_208_;
							i_205_ += i_209_;
						}
					} else if (i_200_ == 3) {
						for (int i_300_ = -i_206_; i_300_ < 0; i_300_++) {
							for (int i_301_ = -i_207_; i_301_ < 0; i_301_++) {
								int i_302_ = raster[i_205_++];
								int i_303_ = i_302_ + i_201_;
								int i_304_ = (i_302_ & 0xff00ff) + (i_201_ & 0xff00ff);
								int i_305_ = (i_304_ & 0x1000100) + (i_303_ - i_304_ & 0x10000);
								i_302_ = i_303_ - i_305_ | i_305_ - (i_305_ >>> 8);
								i_305_ = is[i_204_];
								i_303_ = i_302_ + i_305_;
								i_304_ = (i_302_ & 0xff00ff) + (i_305_ & 0xff00ff);
								i_305_ = (i_304_ & 0x1000100) + (i_303_ - i_304_ & 0x10000);
								is[i_204_++] = i_303_ - i_305_ | i_305_ - (i_305_ >>> 8);
							}
							i_204_ += i_208_;
							i_205_ += i_209_;
						}
					} else if (i_200_ == 2) {
						int i_306_ = i_201_ >>> 24;
						int i_307_ = 256 - i_306_;
						int i_308_ = (i_201_ & 0xff00ff) * i_307_ & ~0xff00ff;
						int i_309_ = (i_201_ & 0xff00) * i_307_ & 0xff0000;
						i_201_ = (i_308_ | i_309_) >>> 8;
						for (int i_310_ = -i_206_; i_310_ < 0; i_310_++) {
							for (int i_311_ = -i_207_; i_311_ < 0; i_311_++) {
								int i_312_ = raster[i_205_++];
								if (i_312_ != 0) {
									i_308_ = (i_312_ & 0xff00ff) * i_306_ & ~0xff00ff;
									i_309_ = (i_312_ & 0xff00) * i_306_ & 0xff0000;
									i_312_ = ((i_308_ | i_309_) >>> 8) + i_201_;
									int i_313_ = is[i_204_];
									int i_314_ = i_312_ + i_313_;
									int i_315_ = (i_312_ & 0xff00ff) + (i_313_ & 0xff00ff);
									i_313_ = (i_315_ & 0x1000100) + (i_314_ - i_315_ & 0x10000);
									is[i_204_++] = i_314_ - i_313_ | i_313_ - (i_313_ >>> 8);
								} else {
									i_204_++;
								}
							}
							i_204_ += i_208_;
							i_205_ += i_209_;
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
	void method13985(boolean bool, boolean bool_22_, boolean bool_23_, int i, int i_24_, float f, int i_25_, int i_26_,
			int i_27_, int i_28_, int i_29_, int i_30_, boolean bool_31_) {
		if (i_25_ > 0 && i_26_ > 0 && (bool || bool_22_)) {
			int i_32_ = 0;
			int i_33_ = 0;
			int i_34_ = offsetX + width + deltaWidth;
			int i_35_ = offsetY + height + deltaHeight;
			int i_36_ = (i_34_ << 16) / i_25_;
			int i_37_ = (i_35_ << 16) / i_26_;
			if (offsetX > 0) {
				int i_38_ = ((offsetX << 16) + i_36_ - 1) / i_36_;
				i += i_38_;
				i_32_ += i_38_ * i_36_ - (offsetX << 16);
			}
			if (offsetY > 0) {
				int i_39_ = ((offsetY << 16) + i_37_ - 1) / i_37_;
				i_24_ += i_39_;
				i_33_ += i_39_ * i_37_ - (offsetY << 16);
			}
			if (width < i_34_) {
				i_25_ = ((width << 16) - i_32_ + i_36_ - 1) / i_36_;
			}
			if (height < i_35_) {
				i_26_ = ((height << 16) - i_33_ + i_37_ - 1) / i_37_;
			}
			int i_40_ = i + i_24_ * toolkit.displayWidth * 464577083;
			int i_41_ = toolkit.displayWidth * 464577083 - i_25_;
			if (i_24_ + i_26_ > toolkit.topClip * -68852597) {
				i_26_ -= i_24_ + i_26_ - toolkit.topClip * -68852597;
			}
			if (i_24_ < toolkit.bottomClip * 1163397961) {
				int i_42_ = toolkit.bottomClip * 1163397961 - i_24_;
				i_26_ -= i_42_;
				i_40_ += i_42_ * toolkit.displayWidth * 464577083;
				i_33_ += i_37_ * i_42_;
			}
			if (i + i_25_ > toolkit.rightClip * -1451559971) {
				int i_43_ = i + i_25_ - toolkit.rightClip * -1451559971;
				i_25_ -= i_43_;
				i_41_ += i_43_;
			}
			if (i < toolkit.leftClip * 113391253) {
				int i_44_ = toolkit.leftClip * 113391253 - i;
				i_25_ -= i_44_;
				i_40_ += i_44_;
				i_32_ += i_36_ * i_44_;
				i_41_ += i_44_;
			}
			float[] fs = toolkit.aFloatArray8801;
			int[] is = toolkit.anIntArray8797;
			if (i_29_ == 0) {
				if (i_27_ == 1) {
					int i_45_ = i_32_;
					for (int i_46_ = -i_26_; i_46_ < 0; i_46_++) {
						int i_47_ = (i_33_ >> 16) * width;
						for (int i_48_ = -i_25_; i_48_ < 0; i_48_++) {
							if (!bool_22_ || f < fs[i_40_]) {
								if (bool) {
									is[i_40_] = raster[(i_32_ >> 16) + i_47_];
								}
								if (bool_22_ && bool_31_) {
									fs[i_40_] = f;
								}
							}
							i_32_ += i_36_;
							i_40_++;
						}
						i_33_ += i_37_;
						i_32_ = i_45_;
						i_40_ += i_41_;
					}
				} else if (i_27_ == 0) {
					int i_49_ = (i_28_ & 0xff0000) >> 16;
					int i_50_ = (i_28_ & 0xff00) >> 8;
					int i_51_ = i_28_ & 0xff;
					int i_52_ = i_32_;
					for (int i_53_ = -i_26_; i_53_ < 0; i_53_++) {
						int i_54_ = (i_33_ >> 16) * width;
						for (int i_55_ = -i_25_; i_55_ < 0; i_55_++) {
							if (!bool_22_ || f < fs[i_40_]) {
								if (bool) {
									int i_56_ = raster[(i_32_ >> 16) + i_54_];
									int i_57_ = (i_56_ & 0xff0000) * i_49_ & ~0xffffff;
									int i_58_ = (i_56_ & 0xff00) * i_50_ & 0xff0000;
									int i_59_ = (i_56_ & 0xff) * i_51_ & 0xff00;
									is[i_40_] = (i_57_ | i_58_ | i_59_) >>> 8;
								}
								if (bool_22_ && bool_31_) {
									fs[i_40_] = f;
								}
							}
							i_32_ += i_36_;
							i_40_++;
						}
						i_33_ += i_37_;
						i_32_ = i_52_;
						i_40_ += i_41_;
					}
				} else if (i_27_ == 3) {
					int i_60_ = i_32_;
					for (int i_61_ = -i_26_; i_61_ < 0; i_61_++) {
						int i_62_ = (i_33_ >> 16) * width;
						for (int i_63_ = -i_25_; i_63_ < 0; i_63_++) {
							if (!bool_22_ || f < fs[i_40_]) {
								if (bool) {
									int i_64_ = raster[(i_32_ >> 16) + i_62_];
									int i_65_ = i_64_ + i_28_;
									int i_66_ = (i_64_ & 0xff00ff) + (i_28_ & 0xff00ff);
									int i_67_ = (i_66_ & 0x1000100) + (i_65_ - i_66_ & 0x10000);
									is[i_40_] = i_65_ - i_67_ | i_67_ - (i_67_ >>> 8);
								}
								if (bool_22_ && bool_31_) {
									fs[i_40_] = f;
								}
							}
							i_32_ += i_36_;
							i_40_++;
						}
						i_33_ += i_37_;
						i_32_ = i_60_;
						i_40_ += i_41_;
					}
				} else if (i_27_ == 2) {
					int i_68_ = i_28_ >>> 24;
					int i_69_ = 256 - i_68_;
					int i_70_ = (i_28_ & 0xff00ff) * i_69_ & ~0xff00ff;
					int i_71_ = (i_28_ & 0xff00) * i_69_ & 0xff0000;
					i_28_ = (i_70_ | i_71_) >>> 8;
					int i_72_ = i_32_;
					for (int i_73_ = -i_26_; i_73_ < 0; i_73_++) {
						int i_74_ = (i_33_ >> 16) * width;
						for (int i_75_ = -i_25_; i_75_ < 0; i_75_++) {
							if (!bool_22_ || f < fs[i_40_]) {
								if (bool) {
									int i_76_ = raster[(i_32_ >> 16) + i_74_];
									i_70_ = (i_76_ & 0xff00ff) * i_68_ & ~0xff00ff;
									i_71_ = (i_76_ & 0xff00) * i_68_ & 0xff0000;
									is[i_40_] = ((i_70_ | i_71_) >>> 8) + i_28_;
								}
								if (bool_22_ && bool_31_) {
									fs[i_40_] = f;
								}
							}
							i_32_ += i_36_;
							i_40_++;
						}
						i_33_ += i_37_;
						i_32_ = i_72_;
						i_40_ += i_41_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (i_29_ == 1) {
				if (i_27_ == 1) {
					int i_77_ = i_32_;
					for (int i_78_ = -i_26_; i_78_ < 0; i_78_++) {
						int i_79_ = (i_33_ >> 16) * width;
						for (int i_80_ = -i_25_; i_80_ < 0; i_80_++) {
							if (!bool_22_ || f < fs[i_40_]) {
								if (bool) {
									int i_81_ = raster[(i_32_ >> 16) + i_79_];
									int i_82_ = i_81_ >>> 24;
									int i_83_ = 256 - i_82_;
									int i_84_ = is[i_40_];
									is[i_40_] = (((i_81_ & 0xff00ff) * i_82_ + (i_84_ & 0xff00ff) * i_83_ & ~0xff00ff) >> 8)
											+ (((i_81_ & ~0xff00ff) >>> 8) * i_82_ + ((i_84_ & ~0xff00ff) >>> 8)
													* i_83_ & ~0xff00ff);
								}
								if (bool_22_ && bool_31_) {
									fs[i_40_] = f;
								}
							}
							i_32_ += i_36_;
							i_40_++;
						}
						i_33_ += i_37_;
						i_32_ = i_77_;
						i_40_ += i_41_;
					}
				} else if (i_27_ == 0) {
					int i_85_ = i_32_;
					if ((i_28_ & 0xffffff) == 16777215) {
						for (int i_86_ = -i_26_; i_86_ < 0; i_86_++) {
							int i_87_ = (i_33_ >> 16) * width;
							for (int i_88_ = -i_25_; i_88_ < 0; i_88_++) {
								if (!bool_22_ || f < fs[i_40_]) {
									if (bool) {
										int i_89_ = raster[(i_32_ >> 16) + i_87_];
										int i_90_ = (i_89_ >>> 24) * (i_28_ >>> 24) >> 8;
										int i_91_ = 256 - i_90_;
										int i_92_ = is[i_40_];
										is[i_40_] = ((i_89_ & 0xff00ff) * i_90_ + (i_92_ & 0xff00ff) * i_91_ & ~0xff00ff)
												+ ((i_89_ & 0xff00) * i_90_ + (i_92_ & 0xff00) * i_91_ & 0xff0000) >> 8;
									}
									if (bool_22_ && bool_31_) {
										fs[i_40_] = f;
									}
								}
								i_32_ += i_36_;
								i_40_++;
							}
							i_33_ += i_37_;
							i_32_ = i_85_;
							i_40_ += i_41_;
						}
					} else {
						int i_93_ = (i_28_ & 0xff0000) >> 16;
						int i_94_ = (i_28_ & 0xff00) >> 8;
						int i_95_ = i_28_ & 0xff;
						for (int i_96_ = -i_26_; i_96_ < 0; i_96_++) {
							int i_97_ = (i_33_ >> 16) * width;
							for (int i_98_ = -i_25_; i_98_ < 0; i_98_++) {
								if (!bool_22_ || f < fs[i_40_]) {
									int i_99_ = raster[(i_32_ >> 16) + i_97_];
									int i_100_ = (i_99_ >>> 24) * (i_28_ >>> 24) >> 8;
									int i_101_ = 256 - i_100_;
									if (i_100_ != 255) {
										if (bool) {
											int i_102_ = (i_99_ & 0xff0000) * i_93_ & ~0xffffff;
											int i_103_ = (i_99_ & 0xff00) * i_94_ & 0xff0000;
											int i_104_ = (i_99_ & 0xff) * i_95_ & 0xff00;
											i_99_ = (i_102_ | i_103_ | i_104_) >>> 8;
											int i_105_ = is[i_40_];
											is[i_40_] = ((i_99_ & 0xff00ff) * i_100_ + (i_105_ & 0xff00ff) * i_101_ & ~0xff00ff)
													+ ((i_99_ & 0xff00) * i_100_ + (i_105_ & 0xff00) * i_101_ & 0xff0000) >> 8;
											if (bool_23_) {
												int i_106_ = (i_105_ >>> 24) + i_100_;
												if (i_106_ > 255) {
													i_106_ = 255;
												}
												is[i_40_] |= i_106_ << 24;
											}
										}
										if (bool_22_ && bool_31_) {
											fs[i_40_] = f;
										}
									} else {
										if (bool) {
											int i_107_ = (i_99_ & 0xff0000) * i_93_ & ~0xffffff;
											int i_108_ = (i_99_ & 0xff00) * i_94_ & 0xff0000;
											int i_109_ = (i_99_ & 0xff) * i_95_ & 0xff00;
											is[i_40_] = (i_107_ | i_108_ | i_109_) >>> 8;
										}
										if (bool_22_ && bool_31_) {
											fs[i_40_] = f;
										}
									}
								}
								i_32_ += i_36_;
								i_40_++;
							}
							i_33_ += i_37_;
							i_32_ = i_85_;
							i_40_ += i_41_;
						}
					}
				} else if (i_27_ == 3) {
					int i_110_ = i_32_;
					for (int i_111_ = -i_26_; i_111_ < 0; i_111_++) {
						int i_112_ = (i_33_ >> 16) * width;
						for (int i_113_ = -i_25_; i_113_ < 0; i_113_++) {
							if (!bool_22_ || f < fs[i_40_]) {
								if (bool) {
									int i_114_ = raster[(i_32_ >> 16) + i_112_];
									int i_115_ = i_114_ + i_28_;
									int i_116_ = (i_114_ & 0xff00ff) + (i_28_ & 0xff00ff);
									int i_117_ = (i_116_ & 0x1000100) + (i_115_ - i_116_ & 0x10000);
									i_117_ = i_115_ - i_117_ | i_117_ - (i_117_ >>> 8);
									int i_118_ = (i_117_ >>> 24) * (i_28_ >>> 24) >> 8;
									int i_119_ = 256 - i_118_;
									if (i_118_ != 255) {
										i_114_ = i_117_;
										i_117_ = is[i_40_];
										i_117_ = ((i_114_ & 0xff00ff) * i_118_ + (i_117_ & 0xff00ff) * i_119_ & ~0xff00ff)
												+ ((i_114_ & 0xff00) * i_118_ + (i_117_ & 0xff00) * i_119_ & 0xff0000) >> 8;
									}
									is[i_40_] = i_117_;
								}
								if (bool_22_ && bool_31_) {
									fs[i_40_] = f;
								}
							}
							i_32_ += i_36_;
							i_40_++;
						}
						i_33_ += i_37_;
						i_32_ = i_110_;
						i_40_ += i_41_;
					}
				} else if (i_27_ == 2) {
					int i_120_ = i_28_ >>> 24;
					int i_121_ = 256 - i_120_;
					int i_122_ = (i_28_ & 0xff00ff) * i_121_ & ~0xff00ff;
					int i_123_ = (i_28_ & 0xff00) * i_121_ & 0xff0000;
					i_28_ = (i_122_ | i_123_) >>> 8;
					int i_124_ = i_32_;
					for (int i_125_ = -i_26_; i_125_ < 0; i_125_++) {
						int i_126_ = (i_33_ >> 16) * width;
						for (int i_127_ = -i_25_; i_127_ < 0; i_127_++) {
							if (!bool_22_ || f < fs[i_40_]) {
								if (bool) {
									int i_128_ = raster[(i_32_ >> 16) + i_126_];
									int i_129_ = i_128_ >>> 24;
									int i_130_ = 256 - i_129_;
									i_122_ = (i_128_ & 0xff00ff) * i_120_ & ~0xff00ff;
									i_123_ = (i_128_ & 0xff00) * i_120_ & 0xff0000;
									i_128_ = ((i_122_ | i_123_) >>> 8) + i_28_;
									int i_131_ = is[i_40_];
									is[i_40_] = ((i_128_ & 0xff00ff) * i_129_ + (i_131_ & 0xff00ff) * i_130_ & ~0xff00ff)
											+ ((i_128_ & 0xff00) * i_129_ + (i_131_ & 0xff00) * i_130_ & 0xff0000) >> 8;
								}
								if (bool_22_ && bool_31_) {
									fs[i_40_] = f;
								}
							}
							i_32_ += i_36_;
							i_40_++;
						}
						i_33_ += i_37_;
						i_32_ = i_124_;
						i_40_ += i_41_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (i_29_ == 2) {
				if (i_27_ == 1) {
					int i_132_ = i_32_;
					for (int i_133_ = -i_26_; i_133_ < 0; i_133_++) {
						int i_134_ = (i_33_ >> 16) * width;
						for (int i_135_ = -i_25_; i_135_ < 0; i_135_++) {
							if (!bool_22_ || f < fs[i_40_]) {
								int i_136_ = raster[(i_32_ >> 16) + i_134_];
								if (i_136_ != 0) {
									if (bool) {
										int i_137_ = is[i_40_];
										int i_138_ = i_136_ + i_137_;
										int i_139_ = (i_136_ & 0xff00ff) + (i_137_ & 0xff00ff);
										i_137_ = (i_139_ & 0x1000100) + (i_138_ - i_139_ & 0x10000);
										is[i_40_] = i_138_ - i_137_ | i_137_ - (i_137_ >>> 8);
									}
									if (bool_22_ && bool_31_) {
										fs[i_40_] = f;
									}
								}
							}
							i_32_ += i_36_;
							i_40_++;
						}
						i_33_ += i_37_;
						i_32_ = i_132_;
						i_40_ += i_41_;
					}
				} else if (i_27_ == 0) {
					int i_140_ = i_32_;
					int i_141_ = (i_28_ & 0xff0000) >> 16;
					int i_142_ = (i_28_ & 0xff00) >> 8;
					int i_143_ = i_28_ & 0xff;
					for (int i_144_ = -i_26_; i_144_ < 0; i_144_++) {
						int i_145_ = (i_33_ >> 16) * width;
						for (int i_146_ = -i_25_; i_146_ < 0; i_146_++) {
							if (!bool_22_ || f < fs[i_40_]) {
								int i_147_ = raster[(i_32_ >> 16) + i_145_];
								if (i_147_ != 0) {
									if (bool) {
										int i_148_ = (i_147_ & 0xff0000) * i_141_ & ~0xffffff;
										int i_149_ = (i_147_ & 0xff00) * i_142_ & 0xff0000;
										int i_150_ = (i_147_ & 0xff) * i_143_ & 0xff00;
										i_147_ = (i_148_ | i_149_ | i_150_) >>> 8;
										int i_151_ = is[i_40_];
										int i_152_ = i_147_ + i_151_;
										int i_153_ = (i_147_ & 0xff00ff) + (i_151_ & 0xff00ff);
										i_151_ = (i_153_ & 0x1000100) + (i_152_ - i_153_ & 0x10000);
										is[i_40_] = i_152_ - i_151_ | i_151_ - (i_151_ >>> 8);
									}
									if (bool_22_ && bool_31_) {
										fs[i_40_] = f;
									}
								}
							}
							i_32_ += i_36_;
							i_40_++;
						}
						i_33_ += i_37_;
						i_32_ = i_140_;
						i_40_ += i_41_;
					}
				} else if (i_27_ == 3) {
					int i_154_ = i_32_;
					for (int i_155_ = -i_26_; i_155_ < 0; i_155_++) {
						int i_156_ = (i_33_ >> 16) * width;
						for (int i_157_ = -i_25_; i_157_ < 0; i_157_++) {
							if (!bool_22_ || f < fs[i_40_]) {
								if (bool) {
									int i_158_ = raster[(i_32_ >> 16) + i_156_];
									int i_159_ = i_158_ + i_28_;
									int i_160_ = (i_158_ & 0xff00ff) + (i_28_ & 0xff00ff);
									int i_161_ = (i_160_ & 0x1000100) + (i_159_ - i_160_ & 0x10000);
									i_158_ = i_159_ - i_161_ | i_161_ - (i_161_ >>> 8);
									i_161_ = is[i_40_];
									i_159_ = i_158_ + i_161_;
									i_160_ = (i_158_ & 0xff00ff) + (i_161_ & 0xff00ff);
									i_161_ = (i_160_ & 0x1000100) + (i_159_ - i_160_ & 0x10000);
									is[i_40_] = i_159_ - i_161_ | i_161_ - (i_161_ >>> 8);
								}
								if (bool_22_ && bool_31_) {
									fs[i_40_] = f;
								}
							}
							i_32_ += i_36_;
							i_40_++;
						}
						i_33_ += i_37_;
						i_32_ = i_154_;
						i_40_ += i_41_;
					}
				} else if (i_27_ == 2) {
					int i_162_ = i_28_ >>> 24;
					int i_163_ = 256 - i_162_;
					int i_164_ = (i_28_ & 0xff00ff) * i_163_ & ~0xff00ff;
					int i_165_ = (i_28_ & 0xff00) * i_163_ & 0xff0000;
					i_28_ = (i_164_ | i_165_) >>> 8;
					int i_166_ = i_32_;
					for (int i_167_ = -i_26_; i_167_ < 0; i_167_++) {
						int i_168_ = (i_33_ >> 16) * width;
						for (int i_169_ = -i_25_; i_169_ < 0; i_169_++) {
							if (!bool_22_ || f < fs[i_40_]) {
								int i_170_ = raster[(i_32_ >> 16) + i_168_];
								if (i_170_ != 0) {
									if (bool) {
										i_164_ = (i_170_ & 0xff00ff) * i_162_ & ~0xff00ff;
										i_165_ = (i_170_ & 0xff00) * i_162_ & 0xff0000;
										i_170_ = ((i_164_ | i_165_) >>> 8) + i_28_;
										int i_171_ = is[i_40_];
										int i_172_ = i_170_ + i_171_;
										int i_173_ = (i_170_ & 0xff00ff) + (i_171_ & 0xff00ff);
										i_171_ = (i_173_ & 0x1000100) + (i_172_ - i_173_ & 0x10000);
										is[i_40_] = i_172_ - i_171_ | i_171_ - (i_171_ >>> 8);
									}
									if (bool_22_ && bool_31_) {
										fs[i_40_] = f;
									}
								}
							}
							i_32_ += i_36_;
							i_40_++;
						}
						i_33_ += i_37_;
						i_32_ = i_166_;
						i_40_ += i_41_;
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
	void method13987(int i, int i_494_) {
		int[] is = toolkit.anIntArray8797;
		if (is != null) {
			if (anInt8564 == 0) {
				if (anInt8576 == 0) {
					int i_495_ = anInt8561;
					while (i_495_ < 0) {
						int i_496_ = anInt8547;
						int i_497_ = anInt8570;
						int i_498_ = anInt8571;
						int i_499_ = anInt8572;
						if (i_497_ >= 0 && i_498_ >= 0 && i_497_ - (width << 12) < 0 && i_498_ - (height << 12) < 0) {
							for (; i_499_ < 0; i_499_++) {
								method17344((i_498_ >> 12) * width + (i_497_ >> 12), i_496_++, is, i, i_494_);
							}
						}
						i_495_++;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_500_ = anInt8561;
					while (i_500_ < 0) {
						int i_501_ = anInt8547;
						int i_502_ = anInt8570;
						int i_503_ = anInt8571 + anInt8574;
						int i_504_ = anInt8572;
						if (i_502_ >= 0 && i_502_ - (width << 12) < 0) {
							int i_505_;
							if ((i_505_ = i_503_ - (height << 12)) >= 0) {
								i_505_ = (anInt8576 - i_505_) / anInt8576;
								i_504_ += i_505_;
								i_503_ += anInt8576 * i_505_;
								i_501_ += i_505_;
							}
							if ((i_505_ = (i_503_ - anInt8576) / anInt8576) > i_504_) {
								i_504_ = i_505_;
							}
							for (; i_504_ < 0; i_504_++) {
								method17344((i_503_ >> 12) * width + (i_502_ >> 12), i_501_++, is, i, i_494_);
								i_503_ += anInt8576;
							}
						}
						i_500_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				} else {
					int i_506_ = anInt8561;
					while (i_506_ < 0) {
						int i_507_ = anInt8547;
						int i_508_ = anInt8570;
						int i_509_ = anInt8571 + anInt8574;
						int i_510_ = anInt8572;
						if (i_508_ >= 0 && i_508_ - (width << 12) < 0) {
							if (i_509_ < 0) {
								int i_511_ = (anInt8576 - 1 - i_509_) / anInt8576;
								i_510_ += i_511_;
								i_509_ += anInt8576 * i_511_;
								i_507_ += i_511_;
							}
							int i_512_;
							if ((i_512_ = (1 + i_509_ - (height << 12) - anInt8576) / anInt8576) > i_510_) {
								i_510_ = i_512_;
							}
							for (; i_510_ < 0; i_510_++) {
								method17344((i_509_ >> 12) * width + (i_508_ >> 12), i_507_++, is, i, i_494_);
								i_509_ += anInt8576;
							}
						}
						i_506_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8564 < 0) {
				if (anInt8576 == 0) {
					int i_513_ = anInt8561;
					while (i_513_ < 0) {
						int i_514_ = anInt8547;
						int i_515_ = anInt8570 + anInt8573;
						int i_516_ = anInt8571;
						int i_517_ = anInt8572;
						if (i_516_ >= 0 && i_516_ - (height << 12) < 0) {
							int i_518_;
							if ((i_518_ = i_515_ - (width << 12)) >= 0) {
								i_518_ = (anInt8564 - i_518_) / anInt8564;
								i_517_ += i_518_;
								i_515_ += anInt8564 * i_518_;
								i_514_ += i_518_;
							}
							if ((i_518_ = (i_515_ - anInt8564) / anInt8564) > i_517_) {
								i_517_ = i_518_;
							}
							for (; i_517_ < 0; i_517_++) {
								method17344((i_516_ >> 12) * width + (i_515_ >> 12), i_514_++, is, i, i_494_);
								i_515_ += anInt8564;
							}
						}
						i_513_++;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_519_ = anInt8561;
					while (i_519_ < 0) {
						int i_520_ = anInt8547;
						int i_521_ = anInt8570 + anInt8573;
						int i_522_ = anInt8571 + anInt8574;
						int i_523_ = anInt8572;
						int i_524_;
						if ((i_524_ = i_521_ - (width << 12)) >= 0) {
							i_524_ = (anInt8564 - i_524_) / anInt8564;
							i_523_ += i_524_;
							i_521_ += anInt8564 * i_524_;
							i_522_ += anInt8576 * i_524_;
							i_520_ += i_524_;
						}
						if ((i_524_ = (i_521_ - anInt8564) / anInt8564) > i_523_) {
							i_523_ = i_524_;
						}
						if ((i_524_ = i_522_ - (height << 12)) >= 0) {
							i_524_ = (anInt8576 - i_524_) / anInt8576;
							i_523_ += i_524_;
							i_521_ += anInt8564 * i_524_;
							i_522_ += anInt8576 * i_524_;
							i_520_ += i_524_;
						}
						if ((i_524_ = (i_522_ - anInt8576) / anInt8576) > i_523_) {
							i_523_ = i_524_;
						}
						for (; i_523_ < 0; i_523_++) {
							method17344((i_522_ >> 12) * width + (i_521_ >> 12), i_520_++, is, i, i_494_);
							i_521_ += anInt8564;
							i_522_ += anInt8576;
						}
						i_519_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else {
					int i_525_ = anInt8561;
					while (i_525_ < 0) {
						int i_526_ = anInt8547;
						int i_527_ = anInt8570 + anInt8573;
						int i_528_ = anInt8571 + anInt8574;
						int i_529_ = anInt8572;
						int i_530_;
						if ((i_530_ = i_527_ - (width << 12)) >= 0) {
							i_530_ = (anInt8564 - i_530_) / anInt8564;
							i_529_ += i_530_;
							i_527_ += anInt8564 * i_530_;
							i_528_ += anInt8576 * i_530_;
							i_526_ += i_530_;
						}
						if ((i_530_ = (i_527_ - anInt8564) / anInt8564) > i_529_) {
							i_529_ = i_530_;
						}
						if (i_528_ < 0) {
							i_530_ = (anInt8576 - 1 - i_528_) / anInt8576;
							i_529_ += i_530_;
							i_527_ += anInt8564 * i_530_;
							i_528_ += anInt8576 * i_530_;
							i_526_ += i_530_;
						}
						if ((i_530_ = (1 + i_528_ - (height << 12) - anInt8576) / anInt8576) > i_529_) {
							i_529_ = i_530_;
						}
						for (; i_529_ < 0; i_529_++) {
							method17344((i_528_ >> 12) * width + (i_527_ >> 12), i_526_++, is, i, i_494_);
							i_527_ += anInt8564;
							i_528_ += anInt8576;
						}
						i_525_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8576 == 0) {
				int i_531_ = anInt8561;
				while (i_531_ < 0) {
					int i_532_ = anInt8547;
					int i_533_ = anInt8570 + anInt8573;
					int i_534_ = anInt8571;
					int i_535_ = anInt8572;
					if (i_534_ >= 0 && i_534_ - (height << 12) < 0) {
						if (i_533_ < 0) {
							int i_536_ = (anInt8564 - 1 - i_533_) / anInt8564;
							i_535_ += i_536_;
							i_533_ += anInt8564 * i_536_;
							i_532_ += i_536_;
						}
						int i_537_;
						if ((i_537_ = (1 + i_533_ - (width << 12) - anInt8564) / anInt8564) > i_535_) {
							i_535_ = i_537_;
						}
						for (; i_535_ < 0; i_535_++) {
							method17344((i_534_ >> 12) * width + (i_533_ >> 12), i_532_++, is, i, i_494_);
							i_533_ += anInt8564;
						}
					}
					i_531_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else if (anInt8576 < 0) {
				for (int i_538_ = anInt8561; i_538_ < 0; i_538_++) {
					int i_539_ = anInt8547;
					int i_540_ = anInt8570 + anInt8573;
					int i_541_ = anInt8571 + anInt8574;
					int i_542_ = anInt8572;
					if (i_540_ < 0) {
						int i_543_ = (anInt8564 - 1 - i_540_) / anInt8564;
						i_542_ += i_543_;
						i_540_ += anInt8564 * i_543_;
						i_541_ += anInt8576 * i_543_;
						i_539_ += i_543_;
					}
					int i_544_;
					if ((i_544_ = (1 + i_540_ - (width << 12) - anInt8564) / anInt8564) > i_542_) {
						i_542_ = i_544_;
					}
					if ((i_544_ = i_541_ - (height << 12)) >= 0) {
						i_544_ = (anInt8576 - i_544_) / anInt8576;
						i_542_ += i_544_;
						i_540_ += anInt8564 * i_544_;
						i_541_ += anInt8576 * i_544_;
						i_539_ += i_544_;
					}
					if ((i_544_ = (i_541_ - anInt8576) / anInt8576) > i_542_) {
						i_542_ = i_544_;
					}
					for (; i_542_ < 0; i_542_++) {
						method17344((i_541_ >> 12) * width + (i_540_ >> 12), i_539_++, is, i, i_494_);
						i_540_ += anInt8564;
						i_541_ += anInt8576;
					}
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else {
				for (int i_545_ = anInt8561; i_545_ < 0; i_545_++) {
					int i_546_ = anInt8547;
					int i_547_ = anInt8570 + anInt8573;
					int i_548_ = anInt8571 + anInt8574;
					int i_549_ = anInt8572;
					if (i_547_ < 0) {
						int i_550_ = (anInt8564 - 1 - i_547_) / anInt8564;
						i_549_ += i_550_;
						i_547_ += anInt8564 * i_550_;
						i_548_ += anInt8576 * i_550_;
						i_546_ += i_550_;
					}
					int i_551_;
					if ((i_551_ = (1 + i_547_ - (width << 12) - anInt8564) / anInt8564) > i_549_) {
						i_549_ = i_551_;
					}
					if (i_548_ < 0) {
						i_551_ = (anInt8576 - 1 - i_548_) / anInt8576;
						i_549_ += i_551_;
						i_547_ += anInt8564 * i_551_;
						i_548_ += anInt8576 * i_551_;
						i_546_ += i_551_;
					}
					if ((i_551_ = (1 + i_548_ - (height << 12) - anInt8576) / anInt8576) > i_549_) {
						i_549_ = i_551_;
					}
					for (; i_549_ < 0; i_549_++) {
						method17344((i_548_ >> 12) * width + (i_547_ >> 12), i_546_++, is, i, i_494_);
						i_547_ += anInt8564;
						i_548_ += anInt8576;
					}
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			}
		}
	}

	@Override
	void method13988(int[] is, int[] is_552_, int i, int i_553_) {
		int[] is_554_ = toolkit.anIntArray8797;
		if (is_554_ != null) {
			if (anInt8564 == 0) {
				if (anInt8576 == 0) {
					int i_555_ = anInt8561;
					while (i_555_ < 0) {
						int i_556_ = i_555_ + i_553_;
						if (i_556_ >= 0) {
							if (i_556_ >= is.length) {
								break;
							}
							int i_557_ = anInt8547;
							int i_558_ = anInt8570;
							int i_559_ = anInt8571;
							int i_560_ = anInt8572;
							if (i_558_ >= 0 && i_559_ >= 0 && i_558_ - (width << 12) < 0 && i_559_ - (height << 12) < 0) {
								int i_561_ = is[i_556_] - i;
								int i_562_ = -is_552_[i_556_];
								int i_563_ = i_561_ - (i_557_ - anInt8547);
								if (i_563_ > 0) {
									i_557_ += i_563_;
									i_560_ += i_563_;
									i_558_ += anInt8564 * i_563_;
									i_559_ += anInt8576 * i_563_;
								} else {
									i_562_ -= i_563_;
								}
								if (i_560_ < i_562_) {
									i_560_ = i_562_;
								}
								for (; i_560_ < 0; i_560_++) {
									int i_564_ = raster[(i_559_ >> 12) * width + (i_558_ >> 12)];
									int i_565_ = i_564_ >>> 24;
									int i_566_ = 256 - i_565_;
									int i_567_ = is_554_[i_557_];
									is_554_[i_557_++] = ((i_564_ & 0xff00ff) * i_565_ + (i_567_ & 0xff00ff) * i_566_ & ~0xff00ff)
											+ ((i_564_ & 0xff00) * i_565_ + (i_567_ & 0xff00) * i_566_ & 0xff0000) >> 8;
								}
							}
						}
						i_555_++;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_568_ = anInt8561;
					while (i_568_ < 0) {
						int i_569_ = i_568_ + i_553_;
						if (i_569_ >= 0) {
							if (i_569_ >= is.length) {
								break;
							}
							int i_570_ = anInt8547;
							int i_571_ = anInt8570;
							int i_572_ = anInt8571 + anInt8574;
							int i_573_ = anInt8572;
							if (i_571_ >= 0 && i_571_ - (width << 12) < 0) {
								int i_574_;
								if ((i_574_ = i_572_ - (height << 12)) >= 0) {
									i_574_ = (anInt8576 - i_574_) / anInt8576;
									i_573_ += i_574_;
									i_572_ += anInt8576 * i_574_;
									i_570_ += i_574_;
								}
								if ((i_574_ = (i_572_ - anInt8576) / anInt8576) > i_573_) {
									i_573_ = i_574_;
								}
								int i_575_ = is[i_569_] - i;
								int i_576_ = -is_552_[i_569_];
								int i_577_ = i_575_ - (i_570_ - anInt8547);
								if (i_577_ > 0) {
									i_570_ += i_577_;
									i_573_ += i_577_;
									i_571_ += anInt8564 * i_577_;
									i_572_ += anInt8576 * i_577_;
								} else {
									i_576_ -= i_577_;
								}
								if (i_573_ < i_576_) {
									i_573_ = i_576_;
								}
								for (; i_573_ < 0; i_573_++) {
									int i_578_ = raster[(i_572_ >> 12) * width + (i_571_ >> 12)];
									int i_579_ = i_578_ >>> 24;
									int i_580_ = 256 - i_579_;
									int i_581_ = is_554_[i_570_];
									is_554_[i_570_++] = ((i_578_ & 0xff00ff) * i_579_ + (i_581_ & 0xff00ff) * i_580_ & ~0xff00ff)
											+ ((i_578_ & 0xff00) * i_579_ + (i_581_ & 0xff00) * i_580_ & 0xff0000) >> 8;
									i_572_ += anInt8576;
								}
							}
						}
						i_568_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				} else {
					int i_582_ = anInt8561;
					while (i_582_ < 0) {
						int i_583_ = i_582_ + i_553_;
						if (i_583_ >= 0) {
							if (i_583_ >= is.length) {
								break;
							}
							int i_584_ = anInt8547;
							int i_585_ = anInt8570;
							int i_586_ = anInt8571 + anInt8574;
							int i_587_ = anInt8572;
							if (i_585_ >= 0 && i_585_ - (width << 12) < 0) {
								if (i_586_ < 0) {
									int i_588_ = (anInt8576 - 1 - i_586_) / anInt8576;
									i_587_ += i_588_;
									i_586_ += anInt8576 * i_588_;
									i_584_ += i_588_;
								}
								int i_589_;
								if ((i_589_ = (1 + i_586_ - (height << 12) - anInt8576) / anInt8576) > i_587_) {
									i_587_ = i_589_;
								}
								int i_590_ = is[i_583_] - i;
								int i_591_ = -is_552_[i_583_];
								int i_592_ = i_590_ - (i_584_ - anInt8547);
								if (i_592_ > 0) {
									i_584_ += i_592_;
									i_587_ += i_592_;
									i_585_ += anInt8564 * i_592_;
									i_586_ += anInt8576 * i_592_;
								} else {
									i_591_ -= i_592_;
								}
								if (i_587_ < i_591_) {
									i_587_ = i_591_;
								}
								for (; i_587_ < 0; i_587_++) {
									int i_593_ = raster[(i_586_ >> 12) * width + (i_585_ >> 12)];
									int i_594_ = i_593_ >>> 24;
									int i_595_ = 256 - i_594_;
									int i_596_ = is_554_[i_584_];
									is_554_[i_584_++] = ((i_593_ & 0xff00ff) * i_594_ + (i_596_ & 0xff00ff) * i_595_ & ~0xff00ff)
											+ ((i_593_ & 0xff00) * i_594_ + (i_596_ & 0xff00) * i_595_ & 0xff0000) >> 8;
									i_586_ += anInt8576;
								}
							}
						}
						i_582_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8564 < 0) {
				if (anInt8576 == 0) {
					int i_597_ = anInt8561;
					while (i_597_ < 0) {
						int i_598_ = i_597_ + i_553_;
						if (i_598_ >= 0) {
							if (i_598_ >= is.length) {
								break;
							}
							int i_599_ = anInt8547;
							int i_600_ = anInt8570 + anInt8573;
							int i_601_ = anInt8571;
							int i_602_ = anInt8572;
							if (i_601_ >= 0 && i_601_ - (height << 12) < 0) {
								int i_603_;
								if ((i_603_ = i_600_ - (width << 12)) >= 0) {
									i_603_ = (anInt8564 - i_603_) / anInt8564;
									i_602_ += i_603_;
									i_600_ += anInt8564 * i_603_;
									i_599_ += i_603_;
								}
								if ((i_603_ = (i_600_ - anInt8564) / anInt8564) > i_602_) {
									i_602_ = i_603_;
								}
								int i_604_ = is[i_598_] - i;
								int i_605_ = -is_552_[i_598_];
								int i_606_ = i_604_ - (i_599_ - anInt8547);
								if (i_606_ > 0) {
									i_599_ += i_606_;
									i_602_ += i_606_;
									i_600_ += anInt8564 * i_606_;
									i_601_ += anInt8576 * i_606_;
								} else {
									i_605_ -= i_606_;
								}
								if (i_602_ < i_605_) {
									i_602_ = i_605_;
								}
								for (; i_602_ < 0; i_602_++) {
									int i_607_ = raster[(i_601_ >> 12) * width + (i_600_ >> 12)];
									int i_608_ = i_607_ >>> 24;
									int i_609_ = 256 - i_608_;
									int i_610_ = is_554_[i_599_];
									is_554_[i_599_++] = ((i_607_ & 0xff00ff) * i_608_ + (i_610_ & 0xff00ff) * i_609_ & ~0xff00ff)
											+ ((i_607_ & 0xff00) * i_608_ + (i_610_ & 0xff00) * i_609_ & 0xff0000) >> 8;
									i_600_ += anInt8564;
								}
							}
						}
						i_597_++;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_611_ = anInt8561;
					while (i_611_ < 0) {
						int i_612_ = i_611_ + i_553_;
						if (i_612_ >= 0) {
							if (i_612_ >= is.length) {
								break;
							}
							int i_613_ = anInt8547;
							int i_614_ = anInt8570 + anInt8573;
							int i_615_ = anInt8571 + anInt8574;
							int i_616_ = anInt8572;
							int i_617_;
							if ((i_617_ = i_614_ - (width << 12)) >= 0) {
								i_617_ = (anInt8564 - i_617_) / anInt8564;
								i_616_ += i_617_;
								i_614_ += anInt8564 * i_617_;
								i_615_ += anInt8576 * i_617_;
								i_613_ += i_617_;
							}
							if ((i_617_ = (i_614_ - anInt8564) / anInt8564) > i_616_) {
								i_616_ = i_617_;
							}
							if ((i_617_ = i_615_ - (height << 12)) >= 0) {
								i_617_ = (anInt8576 - i_617_) / anInt8576;
								i_616_ += i_617_;
								i_614_ += anInt8564 * i_617_;
								i_615_ += anInt8576 * i_617_;
								i_613_ += i_617_;
							}
							if ((i_617_ = (i_615_ - anInt8576) / anInt8576) > i_616_) {
								i_616_ = i_617_;
							}
							int i_618_ = is[i_612_] - i;
							int i_619_ = -is_552_[i_612_];
							int i_620_ = i_618_ - (i_613_ - anInt8547);
							if (i_620_ > 0) {
								i_613_ += i_620_;
								i_616_ += i_620_;
								i_614_ += anInt8564 * i_620_;
								i_615_ += anInt8576 * i_620_;
							} else {
								i_619_ -= i_620_;
							}
							if (i_616_ < i_619_) {
								i_616_ = i_619_;
							}
							for (; i_616_ < 0; i_616_++) {
								int i_621_ = raster[(i_615_ >> 12) * width + (i_614_ >> 12)];
								int i_622_ = i_621_ >>> 24;
								int i_623_ = 256 - i_622_;
								int i_624_ = is_554_[i_613_];
								is_554_[i_613_++] = ((i_621_ & 0xff00ff) * i_622_ + (i_624_ & 0xff00ff) * i_623_ & ~0xff00ff)
										+ ((i_621_ & 0xff00) * i_622_ + (i_624_ & 0xff00) * i_623_ & 0xff0000) >> 8;
								i_614_ += anInt8564;
								i_615_ += anInt8576;
							}
						}
						i_611_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else {
					int i_625_ = anInt8561;
					while (i_625_ < 0) {
						int i_626_ = i_625_ + i_553_;
						if (i_626_ >= 0) {
							if (i_626_ >= is.length) {
								break;
							}
							int i_627_ = anInt8547;
							int i_628_ = anInt8570 + anInt8573;
							int i_629_ = anInt8571 + anInt8574;
							int i_630_ = anInt8572;
							int i_631_;
							if ((i_631_ = i_628_ - (width << 12)) >= 0) {
								i_631_ = (anInt8564 - i_631_) / anInt8564;
								i_630_ += i_631_;
								i_628_ += anInt8564 * i_631_;
								i_629_ += anInt8576 * i_631_;
								i_627_ += i_631_;
							}
							if ((i_631_ = (i_628_ - anInt8564) / anInt8564) > i_630_) {
								i_630_ = i_631_;
							}
							if (i_629_ < 0) {
								i_631_ = (anInt8576 - 1 - i_629_) / anInt8576;
								i_630_ += i_631_;
								i_628_ += anInt8564 * i_631_;
								i_629_ += anInt8576 * i_631_;
								i_627_ += i_631_;
							}
							if ((i_631_ = (1 + i_629_ - (height << 12) - anInt8576) / anInt8576) > i_630_) {
								i_630_ = i_631_;
							}
							int i_632_ = is[i_626_] - i;
							int i_633_ = -is_552_[i_626_];
							int i_634_ = i_632_ - (i_627_ - anInt8547);
							if (i_634_ > 0) {
								i_627_ += i_634_;
								i_630_ += i_634_;
								i_628_ += anInt8564 * i_634_;
								i_629_ += anInt8576 * i_634_;
							} else {
								i_633_ -= i_634_;
							}
							if (i_630_ < i_633_) {
								i_630_ = i_633_;
							}
							for (; i_630_ < 0; i_630_++) {
								int i_635_ = raster[(i_629_ >> 12) * width + (i_628_ >> 12)];
								int i_636_ = i_635_ >>> 24;
								int i_637_ = 256 - i_636_;
								int i_638_ = is_554_[i_627_];
								is_554_[i_627_++] = ((i_635_ & 0xff00ff) * i_636_ + (i_638_ & 0xff00ff) * i_637_ & ~0xff00ff)
										+ ((i_635_ & 0xff00) * i_636_ + (i_638_ & 0xff00) * i_637_ & 0xff0000) >> 8;
								i_628_ += anInt8564;
								i_629_ += anInt8576;
							}
						}
						i_625_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8576 == 0) {
				int i_639_ = anInt8561;
				while (i_639_ < 0) {
					int i_640_ = i_639_ + i_553_;
					if (i_640_ >= 0) {
						if (i_640_ >= is.length) {
							break;
						}
						int i_641_ = anInt8547;
						int i_642_ = anInt8570 + anInt8573;
						int i_643_ = anInt8571;
						int i_644_ = anInt8572;
						if (i_643_ >= 0 && i_643_ - (height << 12) < 0) {
							if (i_642_ < 0) {
								int i_645_ = (anInt8564 - 1 - i_642_) / anInt8564;
								i_644_ += i_645_;
								i_642_ += anInt8564 * i_645_;
								i_641_ += i_645_;
							}
							int i_646_;
							if ((i_646_ = (1 + i_642_ - (width << 12) - anInt8564) / anInt8564) > i_644_) {
								i_644_ = i_646_;
							}
							int i_647_ = is[i_640_] - i;
							int i_648_ = -is_552_[i_640_];
							int i_649_ = i_647_ - (i_641_ - anInt8547);
							if (i_649_ > 0) {
								i_641_ += i_649_;
								i_644_ += i_649_;
								i_642_ += anInt8564 * i_649_;
								i_643_ += anInt8576 * i_649_;
							} else {
								i_648_ -= i_649_;
							}
							if (i_644_ < i_648_) {
								i_644_ = i_648_;
							}
							for (; i_644_ < 0; i_644_++) {
								int i_650_ = raster[(i_643_ >> 12) * width + (i_642_ >> 12)];
								int i_651_ = i_650_ >>> 24;
								int i_652_ = 256 - i_651_;
								int i_653_ = is_554_[i_641_];
								is_554_[i_641_++] = ((i_650_ & 0xff00ff) * i_651_ + (i_653_ & 0xff00ff) * i_652_ & ~0xff00ff)
										+ ((i_650_ & 0xff00) * i_651_ + (i_653_ & 0xff00) * i_652_ & 0xff0000) >> 8;
								i_642_ += anInt8564;
							}
						}
					}
					i_639_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else if (anInt8576 < 0) {
				int i_654_ = anInt8561;
				while (i_654_ < 0) {
					int i_655_ = i_654_ + i_553_;
					if (i_655_ >= 0) {
						if (i_655_ >= is.length) {
							break;
						}
						int i_656_ = anInt8547;
						int i_657_ = anInt8570 + anInt8573;
						int i_658_ = anInt8571 + anInt8574;
						int i_659_ = anInt8572;
						if (i_657_ < 0) {
							int i_660_ = (anInt8564 - 1 - i_657_) / anInt8564;
							i_659_ += i_660_;
							i_657_ += anInt8564 * i_660_;
							i_658_ += anInt8576 * i_660_;
							i_656_ += i_660_;
						}
						int i_661_;
						if ((i_661_ = (1 + i_657_ - (width << 12) - anInt8564) / anInt8564) > i_659_) {
							i_659_ = i_661_;
						}
						if ((i_661_ = i_658_ - (height << 12)) >= 0) {
							i_661_ = (anInt8576 - i_661_) / anInt8576;
							i_659_ += i_661_;
							i_657_ += anInt8564 * i_661_;
							i_658_ += anInt8576 * i_661_;
							i_656_ += i_661_;
						}
						if ((i_661_ = (i_658_ - anInt8576) / anInt8576) > i_659_) {
							i_659_ = i_661_;
						}
						int i_662_ = is[i_655_] - i;
						int i_663_ = -is_552_[i_655_];
						int i_664_ = i_662_ - (i_656_ - anInt8547);
						if (i_664_ > 0) {
							i_656_ += i_664_;
							i_659_ += i_664_;
							i_657_ += anInt8564 * i_664_;
							i_658_ += anInt8576 * i_664_;
						} else {
							i_663_ -= i_664_;
						}
						if (i_659_ < i_663_) {
							i_659_ = i_663_;
						}
						for (; i_659_ < 0; i_659_++) {
							int i_665_ = raster[(i_658_ >> 12) * width + (i_657_ >> 12)];
							int i_666_ = i_665_ >>> 24;
							int i_667_ = 256 - i_666_;
							int i_668_ = is_554_[i_656_];
							is_554_[i_656_++] = ((i_665_ & 0xff00ff) * i_666_ + (i_668_ & 0xff00ff) * i_667_ & ~0xff00ff)
									+ ((i_665_ & 0xff00) * i_666_ + (i_668_ & 0xff00) * i_667_ & 0xff0000) >> 8;
							i_657_ += anInt8564;
							i_658_ += anInt8576;
						}
					}
					i_654_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else {
				int i_669_ = anInt8561;
				while (i_669_ < 0) {
					int i_670_ = i_669_ + i_553_;
					if (i_670_ >= 0) {
						if (i_670_ >= is.length) {
							break;
						}
						int i_671_ = anInt8547;
						int i_672_ = anInt8570 + anInt8573;
						int i_673_ = anInt8571 + anInt8574;
						int i_674_ = anInt8572;
						if (i_672_ < 0) {
							int i_675_ = (anInt8564 - 1 - i_672_) / anInt8564;
							i_674_ += i_675_;
							i_672_ += anInt8564 * i_675_;
							i_673_ += anInt8576 * i_675_;
							i_671_ += i_675_;
						}
						int i_676_;
						if ((i_676_ = (1 + i_672_ - (width << 12) - anInt8564) / anInt8564) > i_674_) {
							i_674_ = i_676_;
						}
						if (i_673_ < 0) {
							i_676_ = (anInt8576 - 1 - i_673_) / anInt8576;
							i_674_ += i_676_;
							i_672_ += anInt8564 * i_676_;
							i_673_ += anInt8576 * i_676_;
							i_671_ += i_676_;
						}
						if ((i_676_ = (1 + i_673_ - (height << 12) - anInt8576) / anInt8576) > i_674_) {
							i_674_ = i_676_;
						}
						int i_677_ = is[i_670_] - i;
						int i_678_ = -is_552_[i_670_];
						int i_679_ = i_677_ - (i_671_ - anInt8547);
						if (i_679_ > 0) {
							i_671_ += i_679_;
							i_674_ += i_679_;
							i_672_ += anInt8564 * i_679_;
							i_673_ += anInt8576 * i_679_;
						} else {
							i_678_ -= i_679_;
						}
						if (i_674_ < i_678_) {
							i_674_ = i_678_;
						}
						for (; i_674_ < 0; i_674_++) {
							int i_680_ = raster[(i_673_ >> 12) * width + (i_672_ >> 12)];
							int i_681_ = i_680_ >>> 24;
							int i_682_ = 256 - i_681_;
							int i_683_ = is_554_[i_671_];
							is_554_[i_671_++] = ((i_680_ & 0xff00ff) * i_681_ + (i_683_ & 0xff00ff) * i_682_ & ~0xff00ff)
									+ ((i_680_ & 0xff00) * i_681_ + (i_683_ & 0xff00) * i_682_ & 0xff0000) >> 8;
							i_672_ += anInt8564;
							i_673_ += anInt8576;
						}
					}
					i_669_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			}
		}
	}

	void method17343(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		i_4_ -= i_1_;
		for (int i_5_ = 0; i_5_ < i_2_; i_5_++) {
			int i_6_ = (i_0_ + i_5_) * i_1_ + i;
			for (int i_7_ = 0; i_7_ < i_1_; i_7_++) {
				is[i_3_++] = raster[i_6_ + i_7_];
			}
			i_3_ += i_4_;
		}
	}

	void method17344(int i, int i_684_, int[] is, int i_685_, int i_686_) {
		if (i_686_ == 0) {
			if (i_685_ == 1) {
				is[i_684_] = raster[i];
			} else if (i_685_ == 0) {
				int i_687_ = raster[i++];
				int i_688_ = (i_687_ & 0xff0000) * anInt8577 & ~0xffffff;
				int i_689_ = (i_687_ & 0xff00) * anInt8560 & 0xff0000;
				int i_690_ = (i_687_ & 0xff) * anInt8579 & 0xff00;
				is[i_684_] = (i_688_ | i_689_ | i_690_) >>> 8;
			} else if (i_685_ == 3) {
				int i_691_ = raster[i++];
				int i_692_ = anInt8578;
				int i_693_ = i_691_ + i_692_;
				int i_694_ = (i_691_ & 0xff00ff) + (i_692_ & 0xff00ff);
				int i_695_ = (i_694_ & 0x1000100) + (i_693_ - i_694_ & 0x10000);
				is[i_684_] = i_693_ - i_695_ | i_695_ - (i_695_ >>> 8);
			} else if (i_685_ == 2) {
				int i_696_ = raster[i];
				int i_697_ = (i_696_ & 0xff00ff) * anInt8575 & ~0xff00ff;
				int i_698_ = (i_696_ & 0xff00) * anInt8575 & 0xff0000;
				is[i_684_] = ((i_697_ | i_698_) >>> 8) + anInt8582;
			} else {
				throw new IllegalArgumentException();
			}
		} else if (i_686_ == 1) {
			if (i_685_ == 1) {
				int i_699_ = raster[i];
				int i_700_ = i_699_ >>> 24;
				int i_701_ = 256 - i_700_;
				int i_702_ = is[i_684_];
				is[i_684_] = ((i_699_ & 0xff00ff) * i_700_ + (i_702_ & 0xff00ff) * i_701_ & ~0xff00ff)
						+ ((i_699_ & 0xff00) * i_700_ + (i_702_ & 0xff00) * i_701_ & 0xff0000) >> 8;
			} else if (i_685_ == 0) {
				int i_703_ = raster[i];
				int i_704_ = (i_703_ >>> 24) * anInt8575 >> 8;
				int i_705_ = 256 - i_704_;
				if ((anInt8578 & 0xffffff) == 16777215) {
					int i_706_ = is[i_684_];
					is[i_684_] = ((i_703_ & 0xff00ff) * i_704_ + (i_706_ & 0xff00ff) * i_705_ & ~0xff00ff)
							+ ((i_703_ & 0xff00) * i_704_ + (i_706_ & 0xff00) * i_705_ & 0xff0000) >> 8;
				} else if (i_704_ != 255) {
					int i_707_ = (i_703_ & 0xff0000) * anInt8577 & ~0xffffff;
					int i_708_ = (i_703_ & 0xff00) * anInt8560 & 0xff0000;
					int i_709_ = (i_703_ & 0xff) * anInt8579 & 0xff00;
					i_703_ = (i_707_ | i_708_ | i_709_) >>> 8;
					int i_710_ = is[i_684_];
					is[i_684_] = ((i_703_ & 0xff00ff) * i_704_ + (i_710_ & 0xff00ff) * i_705_ & ~0xff00ff)
							+ ((i_703_ & 0xff00) * i_704_ + (i_710_ & 0xff00) * i_705_ & 0xff0000) >> 8;
				} else {
					int i_711_ = (i_703_ & 0xff0000) * anInt8577 & ~0xffffff;
					int i_712_ = (i_703_ & 0xff00) * anInt8560 & 0xff0000;
					int i_713_ = (i_703_ & 0xff) * anInt8579 & 0xff00;
					is[i_684_] = (i_711_ | i_712_ | i_713_) >>> 8;
				}
			} else if (i_685_ == 3) {
				int i_714_ = raster[i];
				int i_715_ = anInt8578;
				int i_716_ = i_714_ + i_715_;
				int i_717_ = (i_714_ & 0xff00ff) + (i_715_ & 0xff00ff);
				int i_718_ = (i_717_ & 0x1000100) + (i_716_ - i_717_ & 0x10000);
				i_718_ = i_716_ - i_718_ | i_718_ - (i_718_ >>> 8);
				int i_719_ = (i_714_ >>> 24) * anInt8575 >> 8;
				int i_720_ = 256 - i_719_;
				if (i_719_ != 255) {
					i_714_ = i_718_;
					i_718_ = is[i_684_];
					i_718_ = ((i_714_ & 0xff00ff) * i_719_ + (i_718_ & 0xff00ff) * i_720_ & ~0xff00ff)
							+ ((i_714_ & 0xff00) * i_719_ + (i_718_ & 0xff00) * i_720_ & 0xff0000) >> 8;
				}
				is[i_684_] = i_718_;
			} else if (i_685_ == 2) {
				int i_721_ = raster[i];
				int i_722_ = i_721_ >>> 24;
				int i_723_ = 256 - i_722_;
				int i_724_ = (i_721_ & 0xff00ff) * anInt8575 & ~0xff00ff;
				int i_725_ = (i_721_ & 0xff00) * anInt8575 & 0xff0000;
				i_721_ = ((i_724_ | i_725_) >>> 8) + anInt8582;
				int i_726_ = is[i_684_];
				is[i_684_] = ((i_721_ & 0xff00ff) * i_722_ + (i_726_ & 0xff00ff) * i_723_ & ~0xff00ff)
						+ ((i_721_ & 0xff00) * i_722_ + (i_726_ & 0xff00) * i_723_ & 0xff0000) >> 8;
			} else {
				throw new IllegalArgumentException();
			}
		} else if (i_686_ == 2) {
			if (i_685_ == 1) {
				int i_727_ = raster[i];
				int i_728_ = is[i_684_];
				int i_729_ = i_727_ + i_728_;
				int i_730_ = (i_727_ & 0xff00ff) + (i_728_ & 0xff00ff);
				i_728_ = (i_730_ & 0x1000100) + (i_729_ - i_730_ & 0x10000);
				is[i_684_] = i_729_ - i_728_ | i_728_ - (i_728_ >>> 8);
			} else if (i_685_ == 0) {
				int i_731_ = raster[i];
				int i_732_ = (i_731_ & 0xff0000) * anInt8577 & ~0xffffff;
				int i_733_ = (i_731_ & 0xff00) * anInt8560 & 0xff0000;
				int i_734_ = (i_731_ & 0xff) * anInt8579 & 0xff00;
				i_731_ = (i_732_ | i_733_ | i_734_) >>> 8;
				int i_735_ = is[i_684_];
				int i_736_ = i_731_ + i_735_;
				int i_737_ = (i_731_ & 0xff00ff) + (i_735_ & 0xff00ff);
				i_735_ = (i_737_ & 0x1000100) + (i_736_ - i_737_ & 0x10000);
				is[i_684_] = i_736_ - i_735_ | i_735_ - (i_735_ >>> 8);
			} else if (i_685_ == 3) {
				int i_738_ = raster[i];
				int i_739_ = anInt8578;
				int i_740_ = i_738_ + i_739_;
				int i_741_ = (i_738_ & 0xff00ff) + (i_739_ & 0xff00ff);
				int i_742_ = (i_741_ & 0x1000100) + (i_740_ - i_741_ & 0x10000);
				i_738_ = i_740_ - i_742_ | i_742_ - (i_742_ >>> 8);
				i_742_ = is[i_684_];
				i_740_ = i_738_ + i_742_;
				i_741_ = (i_738_ & 0xff00ff) + (i_742_ & 0xff00ff);
				i_742_ = (i_741_ & 0x1000100) + (i_740_ - i_741_ & 0x10000);
				is[i_684_] = i_740_ - i_742_ | i_742_ - (i_742_ >>> 8);
			} else if (i_685_ == 2) {
				int i_743_ = raster[i];
				int i_744_ = (i_743_ & 0xff00ff) * anInt8575 & ~0xff00ff;
				int i_745_ = (i_743_ & 0xff00) * anInt8575 & 0xff0000;
				i_743_ = ((i_744_ | i_745_) >>> 8) + anInt8582;
				int i_746_ = is[i_684_];
				int i_747_ = i_743_ + i_746_;
				int i_748_ = (i_743_ & 0xff00ff) + (i_746_ & 0xff00ff);
				i_746_ = (i_748_ & 0x1000100) + (i_747_ - i_748_ & 0x10000);
				is[i_684_] = i_747_ - i_746_ | i_746_ - (i_746_ >>> 8);
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	@Override
	void method2083(int i, int i_345_, int i_346_, int i_347_, int i_348_, int i_349_, int i_350_, int i_351_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		if (i_346_ > 0 && i_347_ > 0) {
			int[] is = toolkit.anIntArray8797;
			if (is != null) {
				int i_352_ = 0;
				int i_353_ = 0;
				int i_354_ = toolkit.displayWidth * 464577083;
				int i_355_ = offsetX + width + deltaWidth;
				int i_356_ = offsetY + height + deltaHeight;
				int i_357_ = (i_355_ << 16) / i_346_;
				int i_358_ = (i_356_ << 16) / i_347_;
				if (offsetX > 0) {
					int i_359_ = ((offsetX << 16) + i_357_ - 1) / i_357_;
					i += i_359_;
					i_352_ += i_359_ * i_357_ - (offsetX << 16);
				}
				if (offsetY > 0) {
					int i_360_ = ((offsetY << 16) + i_358_ - 1) / i_358_;
					i_345_ += i_360_;
					i_353_ += i_360_ * i_358_ - (offsetY << 16);
				}
				if (width < i_355_) {
					i_346_ = ((width << 16) - i_352_ + i_357_ - 1) / i_357_;
				}
				if (height < i_356_) {
					i_347_ = ((height << 16) - i_353_ + i_358_ - 1) / i_358_;
				}
				int i_361_ = i + i_345_ * i_354_;
				int i_362_ = i_354_ - i_346_;
				if (i_345_ + i_347_ > toolkit.topClip * -68852597) {
					i_347_ -= i_345_ + i_347_ - toolkit.topClip * -68852597;
				}
				if (i_345_ < toolkit.bottomClip * 1163397961) {
					int i_363_ = toolkit.bottomClip * 1163397961 - i_345_;
					i_347_ -= i_363_;
					i_361_ += i_363_ * i_354_;
					i_353_ += i_358_ * i_363_;
				}
				if (i + i_346_ > toolkit.rightClip * -1451559971) {
					int i_364_ = i + i_346_ - toolkit.rightClip * -1451559971;
					i_346_ -= i_364_;
					i_362_ += i_364_;
				}
				if (i < toolkit.leftClip * 113391253) {
					int i_365_ = toolkit.leftClip * 113391253 - i;
					i_346_ -= i_365_;
					i_361_ += i_365_;
					i_352_ += i_357_ * i_365_;
					i_362_ += i_365_;
				}
				if (i_350_ == 0) {
					if (i_348_ == 1) {
						int i_366_ = i_352_;
						for (int i_367_ = -i_347_; i_367_ < 0; i_367_++) {
							int i_368_ = (i_353_ >> 16) * width;
							for (int i_369_ = -i_346_; i_369_ < 0; i_369_++) {
								is[i_361_++] = raster[(i_352_ >> 16) + i_368_];
								i_352_ += i_357_;
							}
							i_353_ += i_358_;
							i_352_ = i_366_;
							i_361_ += i_362_;
						}
					} else if (i_348_ == 0) {
						int i_370_ = (i_349_ & 0xff0000) >> 16;
						int i_371_ = (i_349_ & 0xff00) >> 8;
						int i_372_ = i_349_ & 0xff;
						int i_373_ = i_352_;
						for (int i_374_ = -i_347_; i_374_ < 0; i_374_++) {
							int i_375_ = (i_353_ >> 16) * width;
							for (int i_376_ = -i_346_; i_376_ < 0; i_376_++) {
								int i_377_ = raster[(i_352_ >> 16) + i_375_];
								int i_378_ = (i_377_ & 0xff0000) * i_370_ & ~0xffffff;
								int i_379_ = (i_377_ & 0xff00) * i_371_ & 0xff0000;
								int i_380_ = (i_377_ & 0xff) * i_372_ & 0xff00;
								is[i_361_++] = (i_378_ | i_379_ | i_380_) >>> 8;
								i_352_ += i_357_;
							}
							i_353_ += i_358_;
							i_352_ = i_373_;
							i_361_ += i_362_;
						}
					} else if (i_348_ == 3) {
						int i_381_ = i_352_;
						for (int i_382_ = -i_347_; i_382_ < 0; i_382_++) {
							int i_383_ = (i_353_ >> 16) * width;
							for (int i_384_ = -i_346_; i_384_ < 0; i_384_++) {
								int i_385_ = raster[(i_352_ >> 16) + i_383_];
								int i_386_ = i_385_ + i_349_;
								int i_387_ = (i_385_ & 0xff00ff) + (i_349_ & 0xff00ff);
								int i_388_ = (i_387_ & 0x1000100) + (i_386_ - i_387_ & 0x10000);
								is[i_361_++] = i_386_ - i_388_ | i_388_ - (i_388_ >>> 8);
								i_352_ += i_357_;
							}
							i_353_ += i_358_;
							i_352_ = i_381_;
							i_361_ += i_362_;
						}
					} else if (i_348_ == 2) {
						int i_389_ = i_349_ >>> 24;
						int i_390_ = 256 - i_389_;
						int i_391_ = (i_349_ & 0xff00ff) * i_390_ & ~0xff00ff;
						int i_392_ = (i_349_ & 0xff00) * i_390_ & 0xff0000;
						i_349_ = (i_391_ | i_392_) >>> 8;
						int i_393_ = i_352_;
						for (int i_394_ = -i_347_; i_394_ < 0; i_394_++) {
							int i_395_ = (i_353_ >> 16) * width;
							for (int i_396_ = -i_346_; i_396_ < 0; i_396_++) {
								int i_397_ = raster[(i_352_ >> 16) + i_395_];
								i_391_ = (i_397_ & 0xff00ff) * i_389_ & ~0xff00ff;
								i_392_ = (i_397_ & 0xff00) * i_389_ & 0xff0000;
								is[i_361_++] = ((i_391_ | i_392_) >>> 8) + i_349_;
								i_352_ += i_357_;
							}
							i_353_ += i_358_;
							i_352_ = i_393_;
							i_361_ += i_362_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_350_ == 1) {
					if (i_348_ == 1) {
						int i_398_ = i_352_;
						for (int i_399_ = -i_347_; i_399_ < 0; i_399_++) {
							int i_400_ = (i_353_ >> 16) * width;
							for (int i_401_ = -i_346_; i_401_ < 0; i_401_++) {
								int i_402_ = raster[(i_352_ >> 16) + i_400_];
								int i_403_ = i_402_ >>> 24;
								int i_404_ = 256 - i_403_;
								int i_405_ = is[i_361_];
								is[i_361_++] = (((i_402_ & 0xff00ff) * i_403_ + (i_405_ & 0xff00ff) * i_404_ & ~0xff00ff) >> 8)
										+ (((i_402_ & ~0xff00ff) >>> 8) * i_403_ + ((i_405_ & ~0xff00ff) >>> 8)
												* i_404_ & ~0xff00ff);
								i_352_ += i_357_;
							}
							i_353_ += i_358_;
							i_352_ = i_398_;
							i_361_ += i_362_;
						}
					} else if (i_348_ == 0) {
						int i_406_ = i_352_;
						if ((i_349_ & 0xffffff) == 16777215) {
							for (int i_407_ = -i_347_; i_407_ < 0; i_407_++) {
								int i_408_ = (i_353_ >> 16) * width;
								for (int i_409_ = -i_346_; i_409_ < 0; i_409_++) {
									int i_410_ = raster[(i_352_ >> 16) + i_408_];
									int i_411_ = (i_410_ >>> 24) * (i_349_ >>> 24) >> 8;
									int i_412_ = 256 - i_411_;
									int i_413_ = is[i_361_];
									is[i_361_++] = ((i_410_ & 0xff00ff) * i_411_ + (i_413_ & 0xff00ff) * i_412_ & ~0xff00ff)
											+ ((i_410_ & 0xff00) * i_411_ + (i_413_ & 0xff00) * i_412_ & 0xff0000) >> 8;
									i_352_ += i_357_;
								}
								i_353_ += i_358_;
								i_352_ = i_406_;
								i_361_ += i_362_;
							}
						} else {
							int i_414_ = (i_349_ & 0xff0000) >> 16;
							int i_415_ = (i_349_ & 0xff00) >> 8;
							int i_416_ = i_349_ & 0xff;
							for (int i_417_ = -i_347_; i_417_ < 0; i_417_++) {
								int i_418_ = (i_353_ >> 16) * width;
								for (int i_419_ = -i_346_; i_419_ < 0; i_419_++) {
									int i_420_ = raster[(i_352_ >> 16) + i_418_];
									int i_421_ = (i_420_ >>> 24) * (i_349_ >>> 24) >> 8;
									int i_422_ = 256 - i_421_;
									if (i_421_ != 255) {
										int i_423_ = (i_420_ & 0xff0000) * i_414_ & ~0xffffff;
										int i_424_ = (i_420_ & 0xff00) * i_415_ & 0xff0000;
										int i_425_ = (i_420_ & 0xff) * i_416_ & 0xff00;
										i_420_ = (i_423_ | i_424_ | i_425_) >>> 8;
										int i_426_ = is[i_361_];
										is[i_361_++] = ((i_420_ & 0xff00ff) * i_421_ + (i_426_ & 0xff00ff) * i_422_ & ~0xff00ff)
												+ ((i_420_ & 0xff00) * i_421_ + (i_426_ & 0xff00) * i_422_ & 0xff0000) >> 8;
									} else {
										int i_427_ = (i_420_ & 0xff0000) * i_414_ & ~0xffffff;
										int i_428_ = (i_420_ & 0xff00) * i_415_ & 0xff0000;
										int i_429_ = (i_420_ & 0xff) * i_416_ & 0xff00;
										is[i_361_++] = (i_427_ | i_428_ | i_429_) >>> 8;
									}
									i_352_ += i_357_;
								}
								i_353_ += i_358_;
								i_352_ = i_406_;
								i_361_ += i_362_;
							}
						}
					} else if (i_348_ == 3) {
						int i_430_ = i_352_;
						for (int i_431_ = -i_347_; i_431_ < 0; i_431_++) {
							int i_432_ = (i_353_ >> 16) * width;
							for (int i_433_ = -i_346_; i_433_ < 0; i_433_++) {
								int i_434_ = raster[(i_352_ >> 16) + i_432_];
								int i_435_ = i_434_ + i_349_;
								int i_436_ = (i_434_ & 0xff00ff) + (i_349_ & 0xff00ff);
								int i_437_ = (i_436_ & 0x1000100) + (i_435_ - i_436_ & 0x10000);
								i_437_ = i_435_ - i_437_ | i_437_ - (i_437_ >>> 8);
								int i_438_ = (i_437_ >>> 24) * (i_349_ >>> 24) >> 8;
								int i_439_ = 256 - i_438_;
								if (i_438_ != 255) {
									i_434_ = i_437_;
									i_437_ = is[i_361_];
									i_437_ = ((i_434_ & 0xff00ff) * i_438_ + (i_437_ & 0xff00ff) * i_439_ & ~0xff00ff)
											+ ((i_434_ & 0xff00) * i_438_ + (i_437_ & 0xff00) * i_439_ & 0xff0000) >> 8;
								}
								is[i_361_++] = i_437_;
								i_352_ += i_357_;
							}
							i_353_ += i_358_;
							i_352_ = i_430_;
							i_361_ += i_362_;
						}
					} else if (i_348_ == 2) {
						int i_440_ = i_349_ >>> 24;
						int i_441_ = 256 - i_440_;
						int i_442_ = (i_349_ & 0xff00ff) * i_441_ & ~0xff00ff;
						int i_443_ = (i_349_ & 0xff00) * i_441_ & 0xff0000;
						i_349_ = (i_442_ | i_443_) >>> 8;
						int i_444_ = i_352_;
						for (int i_445_ = -i_347_; i_445_ < 0; i_445_++) {
							int i_446_ = (i_353_ >> 16) * width;
							for (int i_447_ = -i_346_; i_447_ < 0; i_447_++) {
								int i_448_ = raster[(i_352_ >> 16) + i_446_];
								int i_449_ = i_448_ >>> 24;
								int i_450_ = 256 - i_449_;
								i_442_ = (i_448_ & 0xff00ff) * i_440_ & ~0xff00ff;
								i_443_ = (i_448_ & 0xff00) * i_440_ & 0xff0000;
								i_448_ = ((i_442_ | i_443_) >>> 8) + i_349_;
								int i_451_ = is[i_361_];
								is[i_361_++] = ((i_448_ & 0xff00ff) * i_449_ + (i_451_ & 0xff00ff) * i_450_ & ~0xff00ff)
										+ ((i_448_ & 0xff00) * i_449_ + (i_451_ & 0xff00) * i_450_ & 0xff0000) >> 8;
								i_352_ += i_357_;
							}
							i_353_ += i_358_;
							i_352_ = i_444_;
							i_361_ += i_362_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_350_ == 2) {
					if (i_348_ == 1) {
						int i_452_ = i_352_;
						for (int i_453_ = -i_347_; i_453_ < 0; i_453_++) {
							int i_454_ = (i_353_ >> 16) * width;
							for (int i_455_ = -i_346_; i_455_ < 0; i_455_++) {
								int i_456_ = raster[(i_352_ >> 16) + i_454_];
								if (i_456_ != 0) {
									int i_457_ = is[i_361_];
									int i_458_ = i_456_ + i_457_;
									int i_459_ = (i_456_ & 0xff00ff) + (i_457_ & 0xff00ff);
									i_457_ = (i_459_ & 0x1000100) + (i_458_ - i_459_ & 0x10000);
									is[i_361_++] = i_458_ - i_457_ | i_457_ - (i_457_ >>> 8);
								} else {
									i_361_++;
								}
								i_352_ += i_357_;
							}
							i_353_ += i_358_;
							i_352_ = i_452_;
							i_361_ += i_362_;
						}
					} else if (i_348_ == 0) {
						int i_460_ = i_352_;
						int i_461_ = (i_349_ & 0xff0000) >> 16;
						int i_462_ = (i_349_ & 0xff00) >> 8;
						int i_463_ = i_349_ & 0xff;
						for (int i_464_ = -i_347_; i_464_ < 0; i_464_++) {
							int i_465_ = (i_353_ >> 16) * width;
							for (int i_466_ = -i_346_; i_466_ < 0; i_466_++) {
								int i_467_ = raster[(i_352_ >> 16) + i_465_];
								if (i_467_ != 0) {
									int i_468_ = (i_467_ & 0xff0000) * i_461_ & ~0xffffff;
									int i_469_ = (i_467_ & 0xff00) * i_462_ & 0xff0000;
									int i_470_ = (i_467_ & 0xff) * i_463_ & 0xff00;
									i_467_ = (i_468_ | i_469_ | i_470_) >>> 8;
									int i_471_ = is[i_361_];
									int i_472_ = i_467_ + i_471_;
									int i_473_ = (i_467_ & 0xff00ff) + (i_471_ & 0xff00ff);
									i_471_ = (i_473_ & 0x1000100) + (i_472_ - i_473_ & 0x10000);
									is[i_361_++] = i_472_ - i_471_ | i_471_ - (i_471_ >>> 8);
								} else {
									i_361_++;
								}
								i_352_ += i_357_;
							}
							i_353_ += i_358_;
							i_352_ = i_460_;
							i_361_ += i_362_;
						}
					} else if (i_348_ == 3) {
						int i_474_ = i_352_;
						for (int i_475_ = -i_347_; i_475_ < 0; i_475_++) {
							int i_476_ = (i_353_ >> 16) * width;
							for (int i_477_ = -i_346_; i_477_ < 0; i_477_++) {
								int i_478_ = raster[(i_352_ >> 16) + i_476_];
								int i_479_ = i_478_ + i_349_;
								int i_480_ = (i_478_ & 0xff00ff) + (i_349_ & 0xff00ff);
								int i_481_ = (i_480_ & 0x1000100) + (i_479_ - i_480_ & 0x10000);
								i_478_ = i_479_ - i_481_ | i_481_ - (i_481_ >>> 8);
								i_481_ = is[i_361_];
								i_479_ = i_478_ + i_481_;
								i_480_ = (i_478_ & 0xff00ff) + (i_481_ & 0xff00ff);
								i_481_ = (i_480_ & 0x1000100) + (i_479_ - i_480_ & 0x10000);
								is[i_361_++] = i_479_ - i_481_ | i_481_ - (i_481_ >>> 8);
								i_352_ += i_357_;
							}
							i_353_ += i_358_;
							i_352_ = i_474_;
							i_361_ += i_362_;
						}
					} else if (i_348_ == 2) {
						int i_482_ = i_349_ >>> 24;
						int i_483_ = 256 - i_482_;
						int i_484_ = (i_349_ & 0xff00ff) * i_483_ & ~0xff00ff;
						int i_485_ = (i_349_ & 0xff00) * i_483_ & 0xff0000;
						i_349_ = (i_484_ | i_485_) >>> 8;
						int i_486_ = i_352_;
						for (int i_487_ = -i_347_; i_487_ < 0; i_487_++) {
							int i_488_ = (i_353_ >> 16) * width;
							for (int i_489_ = -i_346_; i_489_ < 0; i_489_++) {
								int i_490_ = raster[(i_352_ >> 16) + i_488_];
								if (i_490_ != 0) {
									i_484_ = (i_490_ & 0xff00ff) * i_482_ & ~0xff00ff;
									i_485_ = (i_490_ & 0xff00) * i_482_ & 0xff0000;
									i_490_ = ((i_484_ | i_485_) >>> 8) + i_349_;
									int i_491_ = is[i_361_];
									int i_492_ = i_490_ + i_491_;
									int i_493_ = (i_490_ & 0xff00ff) + (i_491_ & 0xff00ff);
									i_491_ = (i_493_ & 0x1000100) + (i_492_ - i_493_ & 0x10000);
									is[i_361_++] = i_492_ - i_491_ | i_491_ - (i_491_ >>> 8);
								} else {
									i_361_++;
								}
								i_352_ += i_357_;
							}
							i_353_ += i_358_;
							i_352_ = i_486_;
							i_361_ += i_362_;
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
