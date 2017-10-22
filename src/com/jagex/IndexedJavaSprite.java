package com.jagex;

public class IndexedJavaSprite extends JavaSprite {
	byte[] raster;
	int[] palette;

	IndexedJavaSprite(JavaToolkit toolkit, byte[] raster, int[] palette, int width, int height) {
		super(toolkit, width, height);
		this.raster = raster;
		this.palette = palette;
	}

	@Override
	public Interface16 method2075() {
		throw new IllegalStateException();
	}

	@Override
	public void method2076(int i, int i_569_, int i_570_, int i_571_, int[] is, int[] is_572_, int i_573_, int i_574_) {
		throw new IllegalStateException();
	}

	@Override
	public void method2081(int i, int i_436_, ClippingMask class129, int i_437_, int i_438_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		int[] is = toolkit.anIntArray8797;
		if (is != null) {
			i += offsetX;
			i_436_ += offsetY;
			int i_439_ = 0;
			int i_440_ = toolkit.displayWidth * 464577083;
			int i_441_ = width;
			int i_442_ = height;
			int i_443_ = i_440_ - i_441_;
			int i_444_ = 0;
			int i_445_ = i + i_436_ * i_440_;
			if (i_436_ < toolkit.bottomClip * 1163397961) {
				int i_446_ = toolkit.bottomClip * 1163397961 - i_436_;
				i_442_ -= i_446_;
				i_436_ = toolkit.bottomClip * 1163397961;
				i_439_ += i_446_ * i_441_;
				i_445_ += i_446_ * i_440_;
			}
			if (i_436_ + i_442_ > toolkit.topClip * -68852597) {
				i_442_ -= i_436_ + i_442_ - toolkit.topClip * -68852597;
			}
			if (i < toolkit.leftClip * 113391253) {
				int i_447_ = toolkit.leftClip * 113391253 - i;
				i_441_ -= i_447_;
				i = toolkit.leftClip * 113391253;
				i_439_ += i_447_;
				i_445_ += i_447_;
				i_444_ += i_447_;
				i_443_ += i_447_;
			}
			if (i + i_441_ > toolkit.rightClip * -1451559971) {
				int i_448_ = i + i_441_ - toolkit.rightClip * -1451559971;
				i_441_ -= i_448_;
				i_444_ += i_448_;
				i_443_ += i_448_;
			}
			if (i_441_ > 0 && i_442_ > 0) {
				JavaClippingMask class129_sub3 = (JavaClippingMask) class129;
				int[] is_449_ = class129_sub3.offsets;
				int[] is_450_ = class129_sub3.widths;
				int i_451_ = i_436_;
				if (i_438_ > i_451_) {
					i_451_ = i_438_;
					i_445_ += (i_438_ - i_436_) * i_440_;
					i_439_ += (i_438_ - i_436_) * width;
				}
				int i_452_ = i_438_ + is_449_.length < i_436_ + i_442_ ? i_438_ + is_449_.length : i_436_ + i_442_;
				for (int i_453_ = i_451_; i_453_ < i_452_; i_453_++) {
					int i_454_ = is_449_[i_453_ - i_438_] + i_437_;
					int i_455_ = is_450_[i_453_ - i_438_];
					int i_456_ = i_441_;
					if (i > i_454_) {
						int i_457_ = i - i_454_;
						if (i_457_ >= i_455_) {
							i_439_ += i_441_ + i_444_;
							i_445_ += i_441_ + i_443_;
							continue;
						}
						i_455_ -= i_457_;
					} else {
						int i_458_ = i_454_ - i;
						if (i_458_ >= i_441_) {
							i_439_ += i_441_ + i_444_;
							i_445_ += i_441_ + i_443_;
							continue;
						}
						i_439_ += i_458_;
						i_456_ -= i_458_;
						i_445_ += i_458_;
					}
					int i_459_ = 0;
					if (i_456_ < i_455_) {
						i_455_ = i_456_;
					} else {
						i_459_ = i_456_ - i_455_;
					}
					for (int i_460_ = -i_455_; i_460_ < 0; i_460_++) {
						int i_461_ = raster[i_439_++];
						if (i_461_ != 0) {
							is[i_445_++] = palette[i_461_ & 0xff];
						} else {
							i_445_++;
						}
					}
					i_439_ += i_459_ + i_444_;
					i_445_ += i_459_ + i_443_;
				}
			}
		}
	}

	@Override
	public void method2088(int i, int i_1200_, int i_1201_, int i_1202_, int i_1203_, int i_1204_) {
		throw new IllegalStateException();
	}

	@Override
	public void method2100(int i, int i_0_, int i_1_, int i_2_, int[] is, int i_3_, int i_4_) {
		throw new IllegalStateException();
	}

	@Override
	public void method2114(int i, int i_311_, int i_312_) {
		throw new IllegalStateException();
	}

	@Override
	public void method2142(int x, int i_313_, int i_314_, int i_315_, int i_316_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		int[] is = toolkit.anIntArray8797;
		if (is != null) {
			int i_317_ = toolkit.displayWidth * 464577083;
			x += offsetX;
			i_313_ += offsetY;
			int i_318_ = i_313_ * i_317_ + x;
			int i_319_ = 0;
			int i_320_ = height;
			int i_321_ = width;
			int i_322_ = i_317_ - i_321_;
			int i_323_ = 0;
			if (i_313_ < toolkit.bottomClip * 1163397961) {
				int i_324_ = toolkit.bottomClip * 1163397961 - i_313_;
				i_320_ -= i_324_;
				i_313_ = toolkit.bottomClip * 1163397961;
				i_319_ += i_324_ * i_321_;
				i_318_ += i_324_ * i_317_;
			}
			if (i_313_ + i_320_ > toolkit.topClip * -68852597) {
				i_320_ -= i_313_ + i_320_ - toolkit.topClip * -68852597;
			}
			if (x < toolkit.leftClip * 113391253) {
				int i_325_ = toolkit.leftClip * 113391253 - x;
				i_321_ -= i_325_;
				x = toolkit.leftClip * 113391253;
				i_319_ += i_325_;
				i_318_ += i_325_;
				i_323_ += i_325_;
				i_322_ += i_325_;
			}
			if (x + i_321_ > toolkit.rightClip * -1451559971) {
				int i_326_ = x + i_321_ - toolkit.rightClip * -1451559971;
				i_321_ -= i_326_;
				i_323_ += i_326_;
				i_322_ += i_326_;
			}
			if (i_321_ > 0 && i_320_ > 0) {
				if (i_316_ == 0) {
					if (i_314_ == 1) {
						for (int i_327_ = -i_320_; i_327_ < 0; i_327_++) {
							int i_328_ = i_318_ + i_321_ - 3;
							while (i_318_ < i_328_) {
								is[i_318_++] = palette[raster[i_319_++] & 0xff];
								is[i_318_++] = palette[raster[i_319_++] & 0xff];
								is[i_318_++] = palette[raster[i_319_++] & 0xff];
								is[i_318_++] = palette[raster[i_319_++] & 0xff];
							}
							i_328_ += 3;
							while (i_318_ < i_328_) {
								is[i_318_++] = palette[raster[i_319_++] & 0xff];
							}
							i_318_ += i_322_;
							i_319_ += i_323_;
						}
					} else if (i_314_ == 0) {
						int i_329_ = (i_315_ & 0xff0000) >> 16;
						int i_330_ = (i_315_ & 0xff00) >> 8;
						int i_331_ = i_315_ & 0xff;
						for (int i_332_ = -i_320_; i_332_ < 0; i_332_++) {
							for (int i_333_ = -i_321_; i_333_ < 0; i_333_++) {
								int i_334_ = palette[raster[i_319_++] & 0xff];
								int i_335_ = (i_334_ & 0xff0000) * i_329_ & ~0xffffff;
								int i_336_ = (i_334_ & 0xff00) * i_330_ & 0xff0000;
								int i_337_ = (i_334_ & 0xff) * i_331_ & 0xff00;
								is[i_318_++] = (i_335_ | i_336_ | i_337_) >>> 8;
							}
							i_318_ += i_322_;
							i_319_ += i_323_;
						}
					} else if (i_314_ == 3) {
						for (int i_338_ = -i_320_; i_338_ < 0; i_338_++) {
							for (int i_339_ = -i_321_; i_339_ < 0; i_339_++) {
								int i_340_ = palette[raster[i_319_++] & 0xff];
								int i_341_ = i_340_ + i_315_;
								int i_342_ = (i_340_ & 0xff00ff) + (i_315_ & 0xff00ff);
								int i_343_ = (i_342_ & 0x1000100) + (i_341_ - i_342_ & 0x10000);
								is[i_318_++] = i_341_ - i_343_ | i_343_ - (i_343_ >>> 8);
							}
							i_318_ += i_322_;
							i_319_ += i_323_;
						}
					} else if (i_314_ == 2) {
						int i_344_ = i_315_ >>> 24;
						int i_345_ = 256 - i_344_;
						int i_346_ = (i_315_ & 0xff00ff) * i_345_ & ~0xff00ff;
						int i_347_ = (i_315_ & 0xff00) * i_345_ & 0xff0000;
						i_315_ = (i_346_ | i_347_) >>> 8;
						for (int i_348_ = -i_320_; i_348_ < 0; i_348_++) {
							for (int i_349_ = -i_321_; i_349_ < 0; i_349_++) {
								int i_350_ = palette[raster[i_319_++] & 0xff];
								i_346_ = (i_350_ & 0xff00ff) * i_344_ & ~0xff00ff;
								i_347_ = (i_350_ & 0xff00) * i_344_ & 0xff0000;
								is[i_318_++] = ((i_346_ | i_347_) >>> 8) + i_315_;
							}
							i_318_ += i_322_;
							i_319_ += i_323_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_316_ == 1) {
					if (i_314_ == 1) {
						for (int i_351_ = -i_320_; i_351_ < 0; i_351_++) {
							for (int i_352_ = -i_321_; i_352_ < 0; i_352_++) {
								int i_353_ = raster[i_319_++];
								if (i_353_ != 0) {
									int i_354_ = palette[i_353_ & 0xff] | ~0xffffff;
									int i_355_ = 255;
									int i_356_ = 0;
									int i_357_ = is[i_318_];
									is[i_318_++] = (((i_354_ & 0xff00ff) * i_355_ + (i_357_ & 0xff00ff) * i_356_ & ~0xff00ff) >> 8)
											+ (((i_354_ & ~0xff00ff) >>> 8) * i_355_ + ((i_357_ & ~0xff00ff) >>> 8)
													* i_356_ & ~0xff00ff);
								} else {
									i_318_++;
								}
							}
							i_318_ += i_322_;
							i_319_ += i_323_;
						}
					} else if (i_314_ == 0) {
						if ((i_315_ & 0xffffff) == 16777215) {
							int i_358_ = i_315_ >>> 24;
							int i_359_ = 256 - i_358_;
							for (int i_360_ = -i_320_; i_360_ < 0; i_360_++) {
								for (int i_361_ = -i_321_; i_361_ < 0; i_361_++) {
									int i_362_ = raster[i_319_++];
									if (i_362_ != 0) {
										int i_363_ = palette[i_362_ & 0xff];
										int i_364_ = is[i_318_];
										is[i_318_++] = ((i_363_ & 0xff00ff) * i_358_ + (i_364_ & 0xff00ff) * i_359_ & ~0xff00ff)
												+ ((i_363_ & 0xff00) * i_358_ + (i_364_ & 0xff00) * i_359_ & 0xff0000) >> 8;
									} else {
										i_318_++;
									}
								}
								i_318_ += i_322_;
								i_319_ += i_323_;
							}
						} else {
							int i_365_ = (i_315_ & 0xff0000) >> 16;
							int i_366_ = (i_315_ & 0xff00) >> 8;
							int i_367_ = i_315_ & 0xff;
							int i_368_ = i_315_ >>> 24;
							int i_369_ = 256 - i_368_;
							for (int i_370_ = -i_320_; i_370_ < 0; i_370_++) {
								for (int i_371_ = -i_321_; i_371_ < 0; i_371_++) {
									int i_372_ = raster[i_319_++];
									if (i_372_ != 0) {
										int i_373_ = palette[i_372_ & 0xff];
										if (i_368_ != 255) {
											int i_374_ = (i_373_ & 0xff0000) * i_365_ & ~0xffffff;
											int i_375_ = (i_373_ & 0xff00) * i_366_ & 0xff0000;
											int i_376_ = (i_373_ & 0xff) * i_367_ & 0xff00;
											i_373_ = (i_374_ | i_375_ | i_376_) >>> 8;
											int i_377_ = is[i_318_];
											is[i_318_++] = ((i_373_ & 0xff00ff) * i_368_ + (i_377_ & 0xff00ff) * i_369_ & ~0xff00ff)
													+ ((i_373_ & 0xff00) * i_368_ + (i_377_ & 0xff00) * i_369_ & 0xff0000) >> 8;
										} else {
											int i_378_ = (i_373_ & 0xff0000) * i_365_ & ~0xffffff;
											int i_379_ = (i_373_ & 0xff00) * i_366_ & 0xff0000;
											int i_380_ = (i_373_ & 0xff) * i_367_ & 0xff00;
											is[i_318_++] = (i_378_ | i_379_ | i_380_) >>> 8;
										}
									} else {
										i_318_++;
									}
								}
								i_318_ += i_322_;
								i_319_ += i_323_;
							}
						}
					} else if (i_314_ == 3) {
						int i_381_ = i_315_ >>> 24;
						int i_382_ = 256 - i_381_;
						for (int i_383_ = -i_320_; i_383_ < 0; i_383_++) {
							for (int i_384_ = -i_321_; i_384_ < 0; i_384_++) {
								byte i_385_ = raster[i_319_++];
								int i_386_ = i_385_ > 0 ? palette[i_385_] : 0;
								int i_387_ = i_386_ + i_315_;
								int i_388_ = (i_386_ & 0xff00ff) + (i_315_ & 0xff00ff);
								int i_389_ = (i_388_ & 0x1000100) + (i_387_ - i_388_ & 0x10000);
								i_389_ = i_387_ - i_389_ | i_389_ - (i_389_ >>> 8);
								if (i_386_ == 0 && i_381_ != 255) {
									i_386_ = i_389_;
									i_389_ = is[i_318_];
									i_389_ = ((i_386_ & 0xff00ff) * i_381_ + (i_389_ & 0xff00ff) * i_382_ & ~0xff00ff)
											+ ((i_386_ & 0xff00) * i_381_ + (i_389_ & 0xff00) * i_382_ & 0xff0000) >> 8;
								}
								is[i_318_++] = i_389_;
							}
							i_318_ += i_322_;
							i_319_ += i_323_;
						}
					} else if (i_314_ == 2) {
						int i_390_ = i_315_ >>> 24;
						int i_391_ = 256 - i_390_;
						int i_392_ = (i_315_ & 0xff00ff) * i_391_ & ~0xff00ff;
						int i_393_ = (i_315_ & 0xff00) * i_391_ & 0xff0000;
						i_315_ = (i_392_ | i_393_) >>> 8;
						for (int i_394_ = -i_320_; i_394_ < 0; i_394_++) {
							for (int i_395_ = -i_321_; i_395_ < 0; i_395_++) {
								int i_396_ = raster[i_319_++];
								if (i_396_ != 0) {
									int i_397_ = palette[i_396_ & 0xff];
									i_392_ = (i_397_ & 0xff00ff) * i_390_ & ~0xff00ff;
									i_393_ = (i_397_ & 0xff00) * i_390_ & 0xff0000;
									is[i_318_++] = ((i_392_ | i_393_) >>> 8) + i_315_;
								} else {
									i_318_++;
								}
							}
							i_318_ += i_322_;
							i_319_ += i_323_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_316_ == 2) {
					if (i_314_ == 1) {
						for (int i_398_ = -i_320_; i_398_ < 0; i_398_++) {
							for (int i_399_ = -i_321_; i_399_ < 0; i_399_++) {
								int i_400_ = raster[i_319_++];
								if (i_400_ != 0) {
									int i_401_ = palette[i_400_ & 0xff];
									int i_402_ = is[i_318_];
									int i_403_ = i_401_ + i_402_;
									int i_404_ = (i_401_ & 0xff00ff) + (i_402_ & 0xff00ff);
									i_402_ = (i_404_ & 0x1000100) + (i_403_ - i_404_ & 0x10000);
									is[i_318_++] = i_403_ - i_402_ | i_402_ - (i_402_ >>> 8);
								} else {
									i_318_++;
								}
							}
							i_318_ += i_322_;
							i_319_ += i_323_;
						}
					} else if (i_314_ == 0) {
						int i_405_ = (i_315_ & 0xff0000) >> 16;
						int i_406_ = (i_315_ & 0xff00) >> 8;
						int i_407_ = i_315_ & 0xff;
						for (int i_408_ = -i_320_; i_408_ < 0; i_408_++) {
							for (int i_409_ = -i_321_; i_409_ < 0; i_409_++) {
								int i_410_ = raster[i_319_++];
								if (i_410_ != 0) {
									int i_411_ = palette[i_410_ & 0xff];
									int i_412_ = (i_411_ & 0xff0000) * i_405_ & ~0xffffff;
									int i_413_ = (i_411_ & 0xff00) * i_406_ & 0xff0000;
									int i_414_ = (i_411_ & 0xff) * i_407_ & 0xff00;
									i_411_ = (i_412_ | i_413_ | i_414_) >>> 8;
									int i_415_ = is[i_318_];
									int i_416_ = i_411_ + i_415_;
									int i_417_ = (i_411_ & 0xff00ff) + (i_415_ & 0xff00ff);
									i_415_ = (i_417_ & 0x1000100) + (i_416_ - i_417_ & 0x10000);
									is[i_318_++] = i_416_ - i_415_ | i_415_ - (i_415_ >>> 8);
								} else {
									i_318_++;
								}
							}
							i_318_ += i_322_;
							i_319_ += i_323_;
						}
					} else if (i_314_ == 3) {
						for (int i_418_ = -i_320_; i_418_ < 0; i_418_++) {
							for (int i_419_ = -i_321_; i_419_ < 0; i_419_++) {
								byte i_420_ = raster[i_319_++];
								int i_421_ = i_420_ > 0 ? palette[i_420_] : 0;
								int i_422_ = i_421_ + i_315_;
								int i_423_ = (i_421_ & 0xff00ff) + (i_315_ & 0xff00ff);
								int i_424_ = (i_423_ & 0x1000100) + (i_422_ - i_423_ & 0x10000);
								i_421_ = i_422_ - i_424_ | i_424_ - (i_424_ >>> 8);
								i_424_ = is[i_318_];
								i_422_ = i_421_ + i_424_;
								i_423_ = (i_421_ & 0xff00ff) + (i_424_ & 0xff00ff);
								i_424_ = (i_423_ & 0x1000100) + (i_422_ - i_423_ & 0x10000);
								is[i_318_++] = i_422_ - i_424_ | i_424_ - (i_424_ >>> 8);
							}
							i_318_ += i_322_;
							i_319_ += i_323_;
						}
					} else if (i_314_ == 2) {
						int i_425_ = i_315_ >>> 24;
						int i_426_ = 256 - i_425_;
						int i_427_ = (i_315_ & 0xff00ff) * i_426_ & ~0xff00ff;
						int i_428_ = (i_315_ & 0xff00) * i_426_ & 0xff0000;
						i_315_ = (i_427_ | i_428_) >>> 8;
						for (int i_429_ = -i_320_; i_429_ < 0; i_429_++) {
							for (int i_430_ = -i_321_; i_430_ < 0; i_430_++) {
								int i_431_ = raster[i_319_++];
								if (i_431_ != 0) {
									int i_432_ = palette[i_431_ & 0xff];
									i_427_ = (i_432_ & 0xff00ff) * i_425_ & ~0xff00ff;
									i_428_ = (i_432_ & 0xff00) * i_425_ & 0xff0000;
									i_432_ = ((i_427_ | i_428_) >>> 8) + i_315_;
									int i_433_ = is[i_318_];
									int i_434_ = i_432_ + i_433_;
									int i_435_ = (i_432_ & 0xff00ff) + (i_433_ & 0xff00ff);
									i_433_ = (i_435_ & 0x1000100) + (i_434_ - i_435_ & 0x10000);
									is[i_318_++] = i_434_ - i_433_ | i_433_ - (i_433_ >>> 8);
								} else {
									i_318_++;
								}
							}
							i_318_ += i_322_;
							i_319_ += i_323_;
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
	void method13985(boolean bool, boolean bool_157_, boolean bool_158_, int i, int i_159_, float f, int i_160_,
			int i_161_, int i_162_, int i_163_, int i_164_, int i_165_, boolean bool_166_) {
		if (i_160_ > 0 && i_161_ > 0 && (bool || bool_157_)) {
			int i_167_ = 0;
			int i_168_ = 0;
			int i_169_ = offsetX + width + deltaWidth;
			int i_170_ = offsetY + height + deltaHeight;
			int i_171_ = (i_169_ << 16) / i_160_;
			int i_172_ = (i_170_ << 16) / i_161_;
			if (offsetX > 0) {
				int i_173_ = ((offsetX << 16) + i_171_ - 1) / i_171_;
				i += i_173_;
				i_167_ += i_173_ * i_171_ - (offsetX << 16);
			}
			if (offsetY > 0) {
				int i_174_ = ((offsetY << 16) + i_172_ - 1) / i_172_;
				i_159_ += i_174_;
				i_168_ += i_174_ * i_172_ - (offsetY << 16);
			}
			if (width < i_169_) {
				i_160_ = ((width << 16) - i_167_ + i_171_ - 1) / i_171_;
			}
			if (height < i_170_) {
				i_161_ = ((height << 16) - i_168_ + i_172_ - 1) / i_172_;
			}
			int i_175_ = i + i_159_ * toolkit.displayWidth * 464577083;
			int i_176_ = toolkit.displayWidth * 464577083 - i_160_;
			if (i_159_ + i_161_ > toolkit.topClip * -68852597) {
				i_161_ -= i_159_ + i_161_ - toolkit.topClip * -68852597;
			}
			if (i_159_ < toolkit.bottomClip * 1163397961) {
				int i_177_ = toolkit.bottomClip * 1163397961 - i_159_;
				i_161_ -= i_177_;
				i_175_ += i_177_ * toolkit.displayWidth * 464577083;
				i_168_ += i_172_ * i_177_;
			}
			if (i + i_160_ > toolkit.rightClip * -1451559971) {
				int i_178_ = i + i_160_ - toolkit.rightClip * -1451559971;
				i_160_ -= i_178_;
				i_176_ += i_178_;
			}
			if (i < toolkit.leftClip * 113391253) {
				int i_179_ = toolkit.leftClip * 113391253 - i;
				i_160_ -= i_179_;
				i_175_ += i_179_;
				i_167_ += i_171_ * i_179_;
				i_176_ += i_179_;
			}
			float[] fs = toolkit.aFloatArray8801;
			int[] is = toolkit.anIntArray8797;
			if (i_164_ == 0) {
				if (i_162_ == 1) {
					int i_180_ = i_167_;
					for (int i_181_ = -i_161_; i_181_ < 0; i_181_++) {
						int i_182_ = (i_168_ >> 16) * width;
						for (int i_183_ = -i_160_; i_183_ < 0; i_183_++) {
							if (!bool_157_ || f < fs[i_175_]) {
								if (bool) {
									is[i_175_] = palette[raster[(i_167_ >> 16) + i_182_] & 0xff];
								}
								if (bool_157_ && bool_166_) {
									fs[i_175_] = f;
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_180_;
						i_175_ += i_176_;
					}
				} else if (i_162_ == 0) {
					int i_184_ = (i_163_ & 0xff0000) >> 16;
					int i_185_ = (i_163_ & 0xff00) >> 8;
					int i_186_ = i_163_ & 0xff;
					int i_187_ = i_167_;
					for (int i_188_ = -i_161_; i_188_ < 0; i_188_++) {
						int i_189_ = (i_168_ >> 16) * width;
						for (int i_190_ = -i_160_; i_190_ < 0; i_190_++) {
							if (!bool_157_ || f < fs[i_175_]) {
								if (bool) {
									int i_191_ = palette[raster[(i_167_ >> 16) + i_189_] & 0xff];
									int i_192_ = (i_191_ & 0xff0000) * i_184_ & ~0xffffff;
									int i_193_ = (i_191_ & 0xff00) * i_185_ & 0xff0000;
									int i_194_ = (i_191_ & 0xff) * i_186_ & 0xff00;
									is[i_175_] = (i_192_ | i_193_ | i_194_) >>> 8;
								}
								if (bool_157_ && bool_166_) {
									fs[i_175_] = f;
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_187_;
						i_175_ += i_176_;
					}
				} else if (i_162_ == 3) {
					int i_195_ = i_167_;
					for (int i_196_ = -i_161_; i_196_ < 0; i_196_++) {
						int i_197_ = (i_168_ >> 16) * width;
						for (int i_198_ = -i_160_; i_198_ < 0; i_198_++) {
							if (!bool_157_ || f < fs[i_175_]) {
								if (bool) {
									byte i_199_ = raster[(i_167_ >> 16) + i_197_];
									int i_200_ = i_199_ > 0 ? palette[i_199_] : 0;
									int i_201_ = i_200_ + i_163_;
									int i_202_ = (i_200_ & 0xff00ff) + (i_163_ & 0xff00ff);
									int i_203_ = (i_202_ & 0x1000100) + (i_201_ - i_202_ & 0x10000);
									is[i_175_] = i_201_ - i_203_ | i_203_ - (i_203_ >>> 8);
								}
								if (bool_157_ && bool_166_) {
									fs[i_175_] = f;
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_195_;
						i_175_ += i_176_;
					}
				} else if (i_162_ == 2) {
					int i_204_ = i_163_ >>> 24;
					int i_205_ = 256 - i_204_;
					int i_206_ = (i_163_ & 0xff00ff) * i_205_ & ~0xff00ff;
					int i_207_ = (i_163_ & 0xff00) * i_205_ & 0xff0000;
					i_163_ = (i_206_ | i_207_) >>> 8;
					int i_208_ = i_167_;
					for (int i_209_ = -i_161_; i_209_ < 0; i_209_++) {
						int i_210_ = (i_168_ >> 16) * width;
						for (int i_211_ = -i_160_; i_211_ < 0; i_211_++) {
							if (!bool_157_ || f < fs[i_175_]) {
								if (bool) {
									int i_212_ = palette[raster[(i_167_ >> 16) + i_210_] & 0xff];
									i_206_ = (i_212_ & 0xff00ff) * i_204_ & ~0xff00ff;
									i_207_ = (i_212_ & 0xff00) * i_204_ & 0xff0000;
									is[i_175_] = ((i_206_ | i_207_) >>> 8) + i_163_;
								}
								if (bool_157_ && bool_166_) {
									fs[i_175_] = f;
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_208_;
						i_175_ += i_176_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (i_164_ == 1) {
				if (i_162_ == 1) {
					int i_213_ = i_167_;
					for (int i_214_ = -i_161_; i_214_ < 0; i_214_++) {
						int i_215_ = (i_168_ >> 16) * width;
						for (int i_216_ = -i_160_; i_216_ < 0; i_216_++) {
							if (!bool_157_ || f < fs[i_175_]) {
								int i_217_ = raster[(i_167_ >> 16) + i_215_];
								if (i_217_ != 0) {
									if (bool) {
										is[i_175_] = palette[i_217_ & 0xff];
									}
									if (bool_157_ && bool_166_) {
										fs[i_175_] = f;
									}
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_213_;
						i_175_ += i_176_;
					}
				} else if (i_162_ == 0) {
					int i_218_ = i_167_;
					if ((i_163_ & 0xffffff) == 16777215) {
						int i_219_ = i_163_ >>> 24;
						int i_220_ = 256 - i_219_;
						for (int i_221_ = -i_161_; i_221_ < 0; i_221_++) {
							int i_222_ = (i_168_ >> 16) * width;
							for (int i_223_ = -i_160_; i_223_ < 0; i_223_++) {
								if (!bool_157_ || f < fs[i_175_]) {
									int i_224_ = raster[(i_167_ >> 16) + i_222_];
									if (i_224_ != 0) {
										if (bool) {
											int i_225_ = palette[i_224_ & 0xff];
											int i_226_ = is[i_175_];
											is[i_175_] = ((i_225_ & 0xff00ff) * i_219_ + (i_226_ & 0xff00ff) * i_220_ & ~0xff00ff)
													+ ((i_225_ & 0xff00) * i_219_ + (i_226_ & 0xff00) * i_220_ & 0xff0000) >> 8;
										}
										if (bool_157_ && bool_166_) {
											fs[i_175_] = f;
										}
									}
								}
								i_167_ += i_171_;
								i_175_++;
							}
							i_168_ += i_172_;
							i_167_ = i_218_;
							i_175_ += i_176_;
						}
					} else {
						int i_227_ = (i_163_ & 0xff0000) >> 16;
						int i_228_ = (i_163_ & 0xff00) >> 8;
						int i_229_ = i_163_ & 0xff;
						int i_230_ = i_163_ >>> 24;
						int i_231_ = 256 - i_230_;
						for (int i_232_ = -i_161_; i_232_ < 0; i_232_++) {
							int i_233_ = (i_168_ >> 16) * width;
							for (int i_234_ = -i_160_; i_234_ < 0; i_234_++) {
								if (!bool_157_ || f < fs[i_175_]) {
									int i_235_ = raster[(i_167_ >> 16) + i_233_];
									if (i_235_ != 0) {
										int i_236_ = palette[i_235_ & 0xff];
										if (i_230_ != 255) {
											if (bool) {
												int i_237_ = (i_236_ & 0xff0000) * i_227_ & ~0xffffff;
												int i_238_ = (i_236_ & 0xff00) * i_228_ & 0xff0000;
												int i_239_ = (i_236_ & 0xff) * i_229_ & 0xff00;
												i_236_ = (i_237_ | i_238_ | i_239_) >>> 8;
												int i_240_ = is[i_175_];
												is[i_175_] = ((i_236_ & 0xff00ff) * i_230_ + (i_240_ & 0xff00ff)
														* i_231_ & ~0xff00ff)
														+ ((i_236_ & 0xff00) * i_230_ + (i_240_ & 0xff00) * i_231_ & 0xff0000) >> 8;
											}
											if (bool_157_ && bool_166_) {
												fs[i_175_] = f;
											}
										} else {
											if (bool) {
												int i_241_ = (i_236_ & 0xff0000) * i_227_ & ~0xffffff;
												int i_242_ = (i_236_ & 0xff00) * i_228_ & 0xff0000;
												int i_243_ = (i_236_ & 0xff) * i_229_ & 0xff00;
												is[i_175_] = (i_241_ | i_242_ | i_243_) >>> 8;
											}
											if (bool_157_ && bool_166_) {
												fs[i_175_] = f;
											}
										}
									}
								}
								i_167_ += i_171_;
								i_175_++;
							}
							i_168_ += i_172_;
							i_167_ = i_218_;
							i_175_ += i_176_;
						}
					}
				} else if (i_162_ == 3) {
					int i_244_ = i_167_;
					int i_245_ = i_163_ >>> 24;
					int i_246_ = 256 - i_245_;
					for (int i_247_ = -i_161_; i_247_ < 0; i_247_++) {
						int i_248_ = (i_168_ >> 16) * width;
						for (int i_249_ = -i_160_; i_249_ < 0; i_249_++) {
							if (!bool_157_ || f < fs[i_175_]) {
								if (bool) {
									byte i_250_ = raster[(i_167_ >> 16) + i_248_];
									int i_251_ = i_250_ > 0 ? palette[i_250_] : 0;
									int i_252_ = i_251_ + i_163_;
									int i_253_ = (i_251_ & 0xff00ff) + (i_163_ & 0xff00ff);
									int i_254_ = (i_253_ & 0x1000100) + (i_252_ - i_253_ & 0x10000);
									i_254_ = i_252_ - i_254_ | i_254_ - (i_254_ >>> 8);
									if (i_251_ == 0 && i_245_ != 255) {
										i_251_ = i_254_;
										i_254_ = is[i_175_];
										i_254_ = ((i_251_ & 0xff00ff) * i_245_ + (i_254_ & 0xff00ff) * i_246_ & ~0xff00ff)
												+ ((i_251_ & 0xff00) * i_245_ + (i_254_ & 0xff00) * i_246_ & 0xff0000) >> 8;
									}
									is[i_175_] = i_254_;
								}
								if (bool_157_ && bool_166_) {
									fs[i_175_] = f;
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_244_;
						i_175_ += i_176_;
					}
				} else if (i_162_ == 2) {
					int i_255_ = i_163_ >>> 24;
					int i_256_ = 256 - i_255_;
					int i_257_ = (i_163_ & 0xff00ff) * i_256_ & ~0xff00ff;
					int i_258_ = (i_163_ & 0xff00) * i_256_ & 0xff0000;
					i_163_ = (i_257_ | i_258_) >>> 8;
					int i_259_ = i_167_;
					for (int i_260_ = -i_161_; i_260_ < 0; i_260_++) {
						int i_261_ = (i_168_ >> 16) * width;
						for (int i_262_ = -i_160_; i_262_ < 0; i_262_++) {
							if (!bool_157_ || f < fs[i_175_]) {
								int i_263_ = raster[(i_167_ >> 16) + i_261_];
								if (i_263_ != 0) {
									if (bool) {
										int i_264_ = palette[i_263_ & 0xff];
										i_257_ = (i_264_ & 0xff00ff) * i_255_ & ~0xff00ff;
										i_258_ = (i_264_ & 0xff00) * i_255_ & 0xff0000;
										is[i_175_] = ((i_257_ | i_258_) >>> 8) + i_163_;
									}
									if (bool_157_ && bool_166_) {
										fs[i_175_] = f;
									}
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_259_;
						i_175_ += i_176_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else if (i_164_ == 2) {
				if (i_162_ == 1) {
					int i_265_ = i_167_;
					for (int i_266_ = -i_161_; i_266_ < 0; i_266_++) {
						int i_267_ = (i_168_ >> 16) * width;
						for (int i_268_ = -i_160_; i_268_ < 0; i_268_++) {
							if (!bool_157_ || f < fs[i_175_]) {
								int i_269_ = raster[(i_167_ >> 16) + i_267_];
								if (i_269_ != 0) {
									if (bool) {
										int i_270_ = palette[i_269_ & 0xff];
										int i_271_ = is[i_175_];
										int i_272_ = i_270_ + i_271_;
										int i_273_ = (i_270_ & 0xff00ff) + (i_271_ & 0xff00ff);
										i_271_ = (i_273_ & 0x1000100) + (i_272_ - i_273_ & 0x10000);
										is[i_175_] = i_272_ - i_271_ | i_271_ - (i_271_ >>> 8);
									}
									if (bool_157_ && bool_166_) {
										fs[i_175_] = f;
									}
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_265_;
						i_175_ += i_176_;
					}
				} else if (i_162_ == 0) {
					int i_274_ = i_167_;
					int i_275_ = (i_163_ & 0xff0000) >> 16;
					int i_276_ = (i_163_ & 0xff00) >> 8;
					int i_277_ = i_163_ & 0xff;
					for (int i_278_ = -i_161_; i_278_ < 0; i_278_++) {
						int i_279_ = (i_168_ >> 16) * width;
						for (int i_280_ = -i_160_; i_280_ < 0; i_280_++) {
							if (!bool_157_ || f < fs[i_175_]) {
								int i_281_ = raster[(i_167_ >> 16) + i_279_];
								if (i_281_ != 0) {
									if (bool) {
										int i_282_ = palette[i_281_ & 0xff];
										int i_283_ = (i_282_ & 0xff0000) * i_275_ & ~0xffffff;
										int i_284_ = (i_282_ & 0xff00) * i_276_ & 0xff0000;
										int i_285_ = (i_282_ & 0xff) * i_277_ & 0xff00;
										i_282_ = (i_283_ | i_284_ | i_285_) >>> 8;
										int i_286_ = is[i_175_];
										int i_287_ = i_282_ + i_286_;
										int i_288_ = (i_282_ & 0xff00ff) + (i_286_ & 0xff00ff);
										i_286_ = (i_288_ & 0x1000100) + (i_287_ - i_288_ & 0x10000);
										is[i_175_] = i_287_ - i_286_ | i_286_ - (i_286_ >>> 8);
									}
									if (bool_157_ && bool_166_) {
										fs[i_175_] = f;
									}
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_274_;
						i_175_ += i_176_;
					}
				} else if (i_162_ == 3) {
					int i_289_ = i_167_;
					for (int i_290_ = -i_161_; i_290_ < 0; i_290_++) {
						int i_291_ = (i_168_ >> 16) * width;
						for (int i_292_ = -i_160_; i_292_ < 0; i_292_++) {
							if (!bool_157_ || f < fs[i_175_]) {
								if (bool) {
									byte i_293_ = raster[(i_167_ >> 16) + i_291_];
									int i_294_ = i_293_ > 0 ? palette[i_293_] : 0;
									int i_295_ = i_294_ + i_163_;
									int i_296_ = (i_294_ & 0xff00ff) + (i_163_ & 0xff00ff);
									int i_297_ = (i_296_ & 0x1000100) + (i_295_ - i_296_ & 0x10000);
									i_294_ = i_295_ - i_297_ | i_297_ - (i_297_ >>> 8);
									i_297_ = is[i_175_];
									i_295_ = i_294_ + i_297_;
									i_296_ = (i_294_ & 0xff00ff) + (i_297_ & 0xff00ff);
									i_297_ = (i_296_ & 0x1000100) + (i_295_ - i_296_ & 0x10000);
									is[i_175_] = i_295_ - i_297_ | i_297_ - (i_297_ >>> 8);
								}
								if (bool_157_ && bool_166_) {
									fs[i_175_] = f;
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_289_;
						i_175_ += i_176_;
					}
				} else if (i_162_ == 2) {
					int i_298_ = i_163_ >>> 24;
					int i_299_ = 256 - i_298_;
					int i_300_ = (i_163_ & 0xff00ff) * i_299_ & ~0xff00ff;
					int i_301_ = (i_163_ & 0xff00) * i_299_ & 0xff0000;
					i_163_ = (i_300_ | i_301_) >>> 8;
					int i_302_ = i_167_;
					for (int i_303_ = -i_161_; i_303_ < 0; i_303_++) {
						int i_304_ = (i_168_ >> 16) * width;
						for (int i_305_ = -i_160_; i_305_ < 0; i_305_++) {
							if (!bool_157_ || f < fs[i_175_]) {
								int i_306_ = raster[(i_167_ >> 16) + i_304_];
								if (i_306_ != 0) {
									if (bool) {
										int i_307_ = palette[i_306_ & 0xff];
										i_300_ = (i_307_ & 0xff00ff) * i_298_ & ~0xff00ff;
										i_301_ = (i_307_ & 0xff00) * i_298_ & 0xff0000;
										i_307_ = ((i_300_ | i_301_) >>> 8) + i_163_;
										int i_308_ = is[i_175_];
										int i_309_ = i_307_ + i_308_;
										int i_310_ = (i_307_ & 0xff00ff) + (i_308_ & 0xff00ff);
										i_308_ = (i_310_ & 0x1000100) + (i_309_ - i_310_ & 0x10000);
										is[i_175_] = i_309_ - i_308_ | i_308_ - (i_308_ >>> 8);
									}
									if (bool_157_ && bool_166_) {
										fs[i_175_] = f;
									}
								}
							}
							i_167_ += i_171_;
							i_175_++;
						}
						i_168_ += i_172_;
						i_167_ = i_302_;
						i_175_ += i_176_;
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
	void method13987(int i, int i_575_) {
		int[] is = toolkit.anIntArray8797;
		if (is != null) {
			if (anInt8564 == 0) {
				if (anInt8576 == 0) {
					int i_576_ = anInt8561;
					while (i_576_ < 0) {
						int i_577_ = anInt8547;
						int i_578_ = anInt8570;
						int i_579_ = anInt8571;
						int i_580_ = anInt8572;
						if (i_578_ >= 0 && i_579_ >= 0 && i_578_ - (width << 12) < 0 && i_579_ - (height << 12) < 0) {
							for (; i_580_ < 0; i_580_++) {
								int i_581_ = (i_579_ >> 12) * width + (i_578_ >> 12);
								int i_582_ = i_577_++;
								if (i_575_ == 0) {
									if (i == 1) {
										is[i_582_] = palette[raster[i_581_] & 0xff];
									} else if (i == 0) {
										int i_583_ = palette[raster[i_581_] & 0xff];
										int i_584_ = (i_583_ & 0xff0000) * anInt8577 & ~0xffffff;
										int i_585_ = (i_583_ & 0xff00) * anInt8560 & 0xff0000;
										int i_586_ = (i_583_ & 0xff) * anInt8579 & 0xff00;
										is[i_582_] = (i_584_ | i_585_ | i_586_) >>> 8;
									} else if (i == 3) {
										int i_587_ = palette[raster[i_581_] & 0xff];
										int i_588_ = anInt8578;
										int i_589_ = i_587_ + i_588_;
										int i_590_ = (i_587_ & 0xff00ff) + (i_588_ & 0xff00ff);
										int i_591_ = (i_590_ & 0x1000100) + (i_589_ - i_590_ & 0x10000);
										is[i_582_] = i_589_ - i_591_ | i_591_ - (i_591_ >>> 8);
									} else if (i == 2) {
										int i_592_ = palette[raster[i_581_] & 0xff];
										int i_593_ = (i_592_ & 0xff00ff) * anInt8575 & ~0xff00ff;
										int i_594_ = (i_592_ & 0xff00) * anInt8575 & 0xff0000;
										is[i_582_] = ((i_593_ | i_594_) >>> 8) + anInt8582;
									} else {
										throw new IllegalArgumentException();
									}
								} else if (i_575_ == 1) {
									if (i == 1) {
										int i_595_ = raster[i_581_];
										if (i_595_ != 0) {
											is[i_582_] = palette[i_595_ & 0xff];
										}
									} else if (i == 0) {
										int i_596_ = raster[i_581_];
										if (i_596_ != 0) {
											int i_597_ = palette[i_596_ & 0xff];
											if ((anInt8578 & 0xffffff) == 16777215) {
												int i_598_ = anInt8578 >>> 24;
												int i_599_ = 256 - i_598_;
												int i_600_ = is[i_582_];
												is[i_582_] = ((i_597_ & 0xff00ff) * i_598_ + (i_600_ & 0xff00ff)
														* i_599_ & ~0xff00ff)
														+ ((i_597_ & 0xff00) * i_598_ + (i_600_ & 0xff00) * i_599_ & 0xff0000) >> 8;
											} else if (anInt8575 != 255) {
												int i_601_ = (i_597_ & 0xff0000) * anInt8577 & ~0xffffff;
												int i_602_ = (i_597_ & 0xff00) * anInt8560 & 0xff0000;
												int i_603_ = (i_597_ & 0xff) * anInt8579 & 0xff00;
												i_597_ = (i_601_ | i_602_ | i_603_) >>> 8;
												int i_604_ = is[i_582_];
												is[i_582_] = ((i_597_ & 0xff00ff) * anInt8575 + (i_604_ & 0xff00ff)
														* anInt8562 & ~0xff00ff)
														+ ((i_597_ & 0xff00) * anInt8575 + (i_604_ & 0xff00)
																* anInt8562 & 0xff0000) >> 8;
											} else {
												int i_605_ = (i_597_ & 0xff0000) * anInt8577 & ~0xffffff;
												int i_606_ = (i_597_ & 0xff00) * anInt8560 & 0xff0000;
												int i_607_ = (i_597_ & 0xff) * anInt8579 & 0xff00;
												is[i_582_] = (i_605_ | i_606_ | i_607_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_608_ = raster[i_581_];
										int i_609_ = i_608_ > 0 ? palette[i_608_] : 0;
										int i_610_ = anInt8578;
										int i_611_ = i_609_ + i_610_;
										int i_612_ = (i_609_ & 0xff00ff) + (i_610_ & 0xff00ff);
										int i_613_ = (i_612_ & 0x1000100) + (i_611_ - i_612_ & 0x10000);
										i_613_ = i_611_ - i_613_ | i_613_ - (i_613_ >>> 8);
										if (i_609_ == 0 && anInt8575 != 255) {
											i_609_ = i_613_;
											i_613_ = is[i_582_];
											i_613_ = ((i_609_ & 0xff00ff) * anInt8575 + (i_613_ & 0xff00ff) * anInt8562 & ~0xff00ff)
													+ ((i_609_ & 0xff00) * anInt8575 + (i_613_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
										}
										is[i_582_] = i_613_;
									} else if (i == 2) {
										int i_614_ = raster[i_581_];
										if (i_614_ != 0) {
											int i_615_ = palette[i_614_ & 0xff];
											int i_616_ = (i_615_ & 0xff00ff) * anInt8575 & ~0xff00ff;
											int i_617_ = (i_615_ & 0xff00) * anInt8575 & 0xff0000;
											is[i_582_++] = ((i_616_ | i_617_) >>> 8) + anInt8582;
										}
									} else {
										throw new IllegalArgumentException();
									}
								} else if (i_575_ == 2) {
									if (i == 1) {
										int i_618_ = raster[i_581_];
										if (i_618_ != 0) {
											int i_619_ = palette[i_618_ & 0xff];
											int i_620_ = is[i_582_];
											int i_621_ = i_619_ + i_620_;
											int i_622_ = (i_619_ & 0xff00ff) + (i_620_ & 0xff00ff);
											i_620_ = (i_622_ & 0x1000100) + (i_621_ - i_622_ & 0x10000);
											is[i_582_] = i_621_ - i_620_ | i_620_ - (i_620_ >>> 8);
										}
									} else if (i == 0) {
										int i_623_ = raster[i_581_];
										if (i_623_ != 0) {
											int i_624_ = palette[i_623_ & 0xff];
											int i_625_ = (i_624_ & 0xff0000) * anInt8577 & ~0xffffff;
											int i_626_ = (i_624_ & 0xff00) * anInt8560 & 0xff0000;
											int i_627_ = (i_624_ & 0xff) * anInt8579 & 0xff00;
											i_624_ = (i_625_ | i_626_ | i_627_) >>> 8;
											int i_628_ = is[i_582_];
											int i_629_ = i_624_ + i_628_;
											int i_630_ = (i_624_ & 0xff00ff) + (i_628_ & 0xff00ff);
											i_628_ = (i_630_ & 0x1000100) + (i_629_ - i_630_ & 0x10000);
											is[i_582_] = i_629_ - i_628_ | i_628_ - (i_628_ >>> 8);
										}
									} else if (i == 3) {
										byte i_631_ = raster[i_581_];
										int i_632_ = i_631_ > 0 ? palette[i_631_] : 0;
										int i_633_ = anInt8578;
										int i_634_ = i_632_ + i_633_;
										int i_635_ = (i_632_ & 0xff00ff) + (i_633_ & 0xff00ff);
										int i_636_ = (i_635_ & 0x1000100) + (i_634_ - i_635_ & 0x10000);
										i_636_ = i_634_ - i_636_ | i_636_ - (i_636_ >>> 8);
										if (i_632_ == 0 && anInt8575 != 255) {
											i_632_ = i_636_;
											i_636_ = is[i_582_];
											i_636_ = ((i_632_ & 0xff00ff) * anInt8575 + (i_636_ & 0xff00ff) * anInt8562 & ~0xff00ff)
													+ ((i_632_ & 0xff00) * anInt8575 + (i_636_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
										}
										is[i_582_] = i_636_;
									} else if (i == 2) {
										int i_637_ = raster[i_581_];
										if (i_637_ != 0) {
											int i_638_ = palette[i_637_ & 0xff];
											int i_639_ = (i_638_ & 0xff00ff) * anInt8575 & ~0xff00ff;
											int i_640_ = (i_638_ & 0xff00) * anInt8575 & 0xff0000;
											i_638_ = ((i_639_ | i_640_) >>> 8) + anInt8582;
											int i_641_ = is[i_582_];
											int i_642_ = i_638_ + i_641_;
											int i_643_ = (i_638_ & 0xff00ff) + (i_641_ & 0xff00ff);
											i_641_ = (i_643_ & 0x1000100) + (i_642_ - i_643_ & 0x10000);
											is[i_582_] = i_642_ - i_641_ | i_641_ - (i_641_ >>> 8);
										}
									}
								} else {
									throw new IllegalArgumentException();
								}
							}
						}
						i_576_++;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_644_ = anInt8561;
					while (i_644_ < 0) {
						int i_645_ = anInt8547;
						int i_646_ = anInt8570;
						int i_647_ = anInt8571 + anInt8574;
						int i_648_ = anInt8572;
						if (i_646_ >= 0 && i_646_ - (width << 12) < 0) {
							int i_649_;
							if ((i_649_ = i_647_ - (height << 12)) >= 0) {
								i_649_ = (anInt8576 - i_649_) / anInt8576;
								i_648_ += i_649_;
								i_647_ += anInt8576 * i_649_;
								i_645_ += i_649_;
							}
							if ((i_649_ = (i_647_ - anInt8576) / anInt8576) > i_648_) {
								i_648_ = i_649_;
							}
							for (; i_648_ < 0; i_648_++) {
								int i_650_ = (i_647_ >> 12) * width + (i_646_ >> 12);
								int i_651_ = i_645_++;
								if (i_575_ == 0) {
									if (i == 1) {
										is[i_651_] = palette[raster[i_650_] & 0xff];
									} else if (i == 0) {
										int i_652_ = palette[raster[i_650_] & 0xff];
										int i_653_ = (i_652_ & 0xff0000) * anInt8577 & ~0xffffff;
										int i_654_ = (i_652_ & 0xff00) * anInt8560 & 0xff0000;
										int i_655_ = (i_652_ & 0xff) * anInt8579 & 0xff00;
										is[i_651_] = (i_653_ | i_654_ | i_655_) >>> 8;
									} else if (i == 3) {
										int i_656_ = palette[raster[i_650_] & 0xff];
										int i_657_ = anInt8578;
										int i_658_ = i_656_ + i_657_;
										int i_659_ = (i_656_ & 0xff00ff) + (i_657_ & 0xff00ff);
										int i_660_ = (i_659_ & 0x1000100) + (i_658_ - i_659_ & 0x10000);
										is[i_651_] = i_658_ - i_660_ | i_660_ - (i_660_ >>> 8);
									} else if (i == 2) {
										int i_661_ = palette[raster[i_650_] & 0xff];
										int i_662_ = (i_661_ & 0xff00ff) * anInt8575 & ~0xff00ff;
										int i_663_ = (i_661_ & 0xff00) * anInt8575 & 0xff0000;
										is[i_651_] = ((i_662_ | i_663_) >>> 8) + anInt8582;
									} else {
										throw new IllegalArgumentException();
									}
								} else if (i_575_ == 1) {
									if (i == 1) {
										int i_664_ = raster[i_650_];
										if (i_664_ != 0) {
											is[i_651_] = palette[i_664_ & 0xff];
										}
									} else if (i == 0) {
										int i_665_ = raster[i_650_];
										if (i_665_ != 0) {
											int i_666_ = palette[i_665_ & 0xff];
											if ((anInt8578 & 0xffffff) == 16777215) {
												int i_667_ = anInt8578 >>> 24;
												int i_668_ = 256 - i_667_;
												int i_669_ = is[i_651_];
												is[i_651_] = ((i_666_ & 0xff00ff) * i_667_ + (i_669_ & 0xff00ff)
														* i_668_ & ~0xff00ff)
														+ ((i_666_ & 0xff00) * i_667_ + (i_669_ & 0xff00) * i_668_ & 0xff0000) >> 8;
											} else if (anInt8575 != 255) {
												int i_670_ = (i_666_ & 0xff0000) * anInt8577 & ~0xffffff;
												int i_671_ = (i_666_ & 0xff00) * anInt8560 & 0xff0000;
												int i_672_ = (i_666_ & 0xff) * anInt8579 & 0xff00;
												i_666_ = (i_670_ | i_671_ | i_672_) >>> 8;
												int i_673_ = is[i_651_];
												is[i_651_] = ((i_666_ & 0xff00ff) * anInt8575 + (i_673_ & 0xff00ff)
														* anInt8562 & ~0xff00ff)
														+ ((i_666_ & 0xff00) * anInt8575 + (i_673_ & 0xff00)
																* anInt8562 & 0xff0000) >> 8;
											} else {
												int i_674_ = (i_666_ & 0xff0000) * anInt8577 & ~0xffffff;
												int i_675_ = (i_666_ & 0xff00) * anInt8560 & 0xff0000;
												int i_676_ = (i_666_ & 0xff) * anInt8579 & 0xff00;
												is[i_651_] = (i_674_ | i_675_ | i_676_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_677_ = raster[i_650_];
										int i_678_ = i_677_ > 0 ? palette[i_677_] : 0;
										int i_679_ = anInt8578;
										int i_680_ = i_678_ + i_679_;
										int i_681_ = (i_678_ & 0xff00ff) + (i_679_ & 0xff00ff);
										int i_682_ = (i_681_ & 0x1000100) + (i_680_ - i_681_ & 0x10000);
										i_682_ = i_680_ - i_682_ | i_682_ - (i_682_ >>> 8);
										if (i_678_ == 0 && anInt8575 != 255) {
											i_678_ = i_682_;
											i_682_ = is[i_651_];
											i_682_ = ((i_678_ & 0xff00ff) * anInt8575 + (i_682_ & 0xff00ff) * anInt8562 & ~0xff00ff)
													+ ((i_678_ & 0xff00) * anInt8575 + (i_682_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
										}
										is[i_651_] = i_682_;
									} else if (i == 2) {
										int i_683_ = raster[i_650_];
										if (i_683_ != 0) {
											int i_684_ = palette[i_683_ & 0xff];
											int i_685_ = (i_684_ & 0xff00ff) * anInt8575 & ~0xff00ff;
											int i_686_ = (i_684_ & 0xff00) * anInt8575 & 0xff0000;
											is[i_651_++] = ((i_685_ | i_686_) >>> 8) + anInt8582;
										}
									} else {
										throw new IllegalArgumentException();
									}
								} else if (i_575_ == 2) {
									if (i == 1) {
										int i_687_ = raster[i_650_];
										if (i_687_ != 0) {
											int i_688_ = palette[i_687_ & 0xff];
											int i_689_ = is[i_651_];
											int i_690_ = i_688_ + i_689_;
											int i_691_ = (i_688_ & 0xff00ff) + (i_689_ & 0xff00ff);
											i_689_ = (i_691_ & 0x1000100) + (i_690_ - i_691_ & 0x10000);
											is[i_651_] = i_690_ - i_689_ | i_689_ - (i_689_ >>> 8);
										}
									} else if (i == 0) {
										int i_692_ = raster[i_650_];
										if (i_692_ != 0) {
											int i_693_ = palette[i_692_ & 0xff];
											int i_694_ = (i_693_ & 0xff0000) * anInt8577 & ~0xffffff;
											int i_695_ = (i_693_ & 0xff00) * anInt8560 & 0xff0000;
											int i_696_ = (i_693_ & 0xff) * anInt8579 & 0xff00;
											i_693_ = (i_694_ | i_695_ | i_696_) >>> 8;
											int i_697_ = is[i_651_];
											int i_698_ = i_693_ + i_697_;
											int i_699_ = (i_693_ & 0xff00ff) + (i_697_ & 0xff00ff);
											i_697_ = (i_699_ & 0x1000100) + (i_698_ - i_699_ & 0x10000);
											is[i_651_] = i_698_ - i_697_ | i_697_ - (i_697_ >>> 8);
										}
									} else if (i == 3) {
										byte i_700_ = raster[i_650_];
										int i_701_ = i_700_ > 0 ? palette[i_700_] : 0;
										int i_702_ = anInt8578;
										int i_703_ = i_701_ + i_702_;
										int i_704_ = (i_701_ & 0xff00ff) + (i_702_ & 0xff00ff);
										int i_705_ = (i_704_ & 0x1000100) + (i_703_ - i_704_ & 0x10000);
										i_705_ = i_703_ - i_705_ | i_705_ - (i_705_ >>> 8);
										if (i_701_ == 0 && anInt8575 != 255) {
											i_701_ = i_705_;
											i_705_ = is[i_651_];
											i_705_ = ((i_701_ & 0xff00ff) * anInt8575 + (i_705_ & 0xff00ff) * anInt8562 & ~0xff00ff)
													+ ((i_701_ & 0xff00) * anInt8575 + (i_705_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
										}
										is[i_651_] = i_705_;
									} else if (i == 2) {
										int i_706_ = raster[i_650_];
										if (i_706_ != 0) {
											int i_707_ = palette[i_706_ & 0xff];
											int i_708_ = (i_707_ & 0xff00ff) * anInt8575 & ~0xff00ff;
											int i_709_ = (i_707_ & 0xff00) * anInt8575 & 0xff0000;
											i_707_ = ((i_708_ | i_709_) >>> 8) + anInt8582;
											int i_710_ = is[i_651_];
											int i_711_ = i_707_ + i_710_;
											int i_712_ = (i_707_ & 0xff00ff) + (i_710_ & 0xff00ff);
											i_710_ = (i_712_ & 0x1000100) + (i_711_ - i_712_ & 0x10000);
											is[i_651_] = i_711_ - i_710_ | i_710_ - (i_710_ >>> 8);
										}
									}
								} else {
									throw new IllegalArgumentException();
								}
								i_647_ += anInt8576;
							}
						}
						i_644_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				} else {
					int i_713_ = anInt8561;
					while (i_713_ < 0) {
						int i_714_ = anInt8547;
						int i_715_ = anInt8570;
						int i_716_ = anInt8571 + anInt8574;
						int i_717_ = anInt8572;
						if (i_715_ >= 0 && i_715_ - (width << 12) < 0) {
							if (i_716_ < 0) {
								int i_718_ = (anInt8576 - 1 - i_716_) / anInt8576;
								i_717_ += i_718_;
								i_716_ += anInt8576 * i_718_;
								i_714_ += i_718_;
							}
							int i_719_;
							if ((i_719_ = (1 + i_716_ - (height << 12) - anInt8576) / anInt8576) > i_717_) {
								i_717_ = i_719_;
							}
							for (; i_717_ < 0; i_717_++) {
								int i_720_ = (i_716_ >> 12) * width + (i_715_ >> 12);
								int i_721_ = i_714_++;
								if (i_575_ == 0) {
									if (i == 1) {
										is[i_721_] = palette[raster[i_720_] & 0xff];
									} else if (i == 0) {
										int i_722_ = palette[raster[i_720_] & 0xff];
										int i_723_ = (i_722_ & 0xff0000) * anInt8577 & ~0xffffff;
										int i_724_ = (i_722_ & 0xff00) * anInt8560 & 0xff0000;
										int i_725_ = (i_722_ & 0xff) * anInt8579 & 0xff00;
										is[i_721_] = (i_723_ | i_724_ | i_725_) >>> 8;
									} else if (i == 3) {
										int i_726_ = palette[raster[i_720_] & 0xff];
										int i_727_ = anInt8578;
										int i_728_ = i_726_ + i_727_;
										int i_729_ = (i_726_ & 0xff00ff) + (i_727_ & 0xff00ff);
										int i_730_ = (i_729_ & 0x1000100) + (i_728_ - i_729_ & 0x10000);
										is[i_721_] = i_728_ - i_730_ | i_730_ - (i_730_ >>> 8);
									} else if (i == 2) {
										int i_731_ = palette[raster[i_720_] & 0xff];
										int i_732_ = (i_731_ & 0xff00ff) * anInt8575 & ~0xff00ff;
										int i_733_ = (i_731_ & 0xff00) * anInt8575 & 0xff0000;
										is[i_721_] = ((i_732_ | i_733_) >>> 8) + anInt8582;
									} else {
										throw new IllegalArgumentException();
									}
								} else if (i_575_ == 1) {
									if (i == 1) {
										int i_734_ = raster[i_720_];
										if (i_734_ != 0) {
											is[i_721_] = palette[i_734_ & 0xff];
										}
									} else if (i == 0) {
										int i_735_ = raster[i_720_];
										if (i_735_ != 0) {
											int i_736_ = palette[i_735_ & 0xff];
											if ((anInt8578 & 0xffffff) == 16777215) {
												int i_737_ = anInt8578 >>> 24;
												int i_738_ = 256 - i_737_;
												int i_739_ = is[i_721_];
												is[i_721_] = ((i_736_ & 0xff00ff) * i_737_ + (i_739_ & 0xff00ff)
														* i_738_ & ~0xff00ff)
														+ ((i_736_ & 0xff00) * i_737_ + (i_739_ & 0xff00) * i_738_ & 0xff0000) >> 8;
											} else if (anInt8575 != 255) {
												int i_740_ = (i_736_ & 0xff0000) * anInt8577 & ~0xffffff;
												int i_741_ = (i_736_ & 0xff00) * anInt8560 & 0xff0000;
												int i_742_ = (i_736_ & 0xff) * anInt8579 & 0xff00;
												i_736_ = (i_740_ | i_741_ | i_742_) >>> 8;
												int i_743_ = is[i_721_];
												is[i_721_] = ((i_736_ & 0xff00ff) * anInt8575 + (i_743_ & 0xff00ff)
														* anInt8562 & ~0xff00ff)
														+ ((i_736_ & 0xff00) * anInt8575 + (i_743_ & 0xff00)
																* anInt8562 & 0xff0000) >> 8;
											} else {
												int i_744_ = (i_736_ & 0xff0000) * anInt8577 & ~0xffffff;
												int i_745_ = (i_736_ & 0xff00) * anInt8560 & 0xff0000;
												int i_746_ = (i_736_ & 0xff) * anInt8579 & 0xff00;
												is[i_721_] = (i_744_ | i_745_ | i_746_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_747_ = raster[i_720_];
										int i_748_ = i_747_ > 0 ? palette[i_747_] : 0;
										int i_749_ = anInt8578;
										int i_750_ = i_748_ + i_749_;
										int i_751_ = (i_748_ & 0xff00ff) + (i_749_ & 0xff00ff);
										int i_752_ = (i_751_ & 0x1000100) + (i_750_ - i_751_ & 0x10000);
										i_752_ = i_750_ - i_752_ | i_752_ - (i_752_ >>> 8);
										if (i_748_ == 0 && anInt8575 != 255) {
											i_748_ = i_752_;
											i_752_ = is[i_721_];
											i_752_ = ((i_748_ & 0xff00ff) * anInt8575 + (i_752_ & 0xff00ff) * anInt8562 & ~0xff00ff)
													+ ((i_748_ & 0xff00) * anInt8575 + (i_752_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
										}
										is[i_721_] = i_752_;
									} else if (i == 2) {
										int i_753_ = raster[i_720_];
										if (i_753_ != 0) {
											int i_754_ = palette[i_753_ & 0xff];
											int i_755_ = (i_754_ & 0xff00ff) * anInt8575 & ~0xff00ff;
											int i_756_ = (i_754_ & 0xff00) * anInt8575 & 0xff0000;
											is[i_721_++] = ((i_755_ | i_756_) >>> 8) + anInt8582;
										}
									} else {
										throw new IllegalArgumentException();
									}
								} else if (i_575_ == 2) {
									if (i == 1) {
										int i_757_ = raster[i_720_];
										if (i_757_ != 0) {
											int i_758_ = palette[i_757_ & 0xff];
											int i_759_ = is[i_721_];
											int i_760_ = i_758_ + i_759_;
											int i_761_ = (i_758_ & 0xff00ff) + (i_759_ & 0xff00ff);
											i_759_ = (i_761_ & 0x1000100) + (i_760_ - i_761_ & 0x10000);
											is[i_721_] = i_760_ - i_759_ | i_759_ - (i_759_ >>> 8);
										}
									} else if (i == 0) {
										int i_762_ = raster[i_720_];
										if (i_762_ != 0) {
											int i_763_ = palette[i_762_ & 0xff];
											int i_764_ = (i_763_ & 0xff0000) * anInt8577 & ~0xffffff;
											int i_765_ = (i_763_ & 0xff00) * anInt8560 & 0xff0000;
											int i_766_ = (i_763_ & 0xff) * anInt8579 & 0xff00;
											i_763_ = (i_764_ | i_765_ | i_766_) >>> 8;
											int i_767_ = is[i_721_];
											int i_768_ = i_763_ + i_767_;
											int i_769_ = (i_763_ & 0xff00ff) + (i_767_ & 0xff00ff);
											i_767_ = (i_769_ & 0x1000100) + (i_768_ - i_769_ & 0x10000);
											is[i_721_] = i_768_ - i_767_ | i_767_ - (i_767_ >>> 8);
										}
									} else if (i == 3) {
										byte i_770_ = raster[i_720_];
										int i_771_ = i_770_ > 0 ? palette[i_770_] : 0;
										int i_772_ = anInt8578;
										int i_773_ = i_771_ + i_772_;
										int i_774_ = (i_771_ & 0xff00ff) + (i_772_ & 0xff00ff);
										int i_775_ = (i_774_ & 0x1000100) + (i_773_ - i_774_ & 0x10000);
										i_775_ = i_773_ - i_775_ | i_775_ - (i_775_ >>> 8);
										if (i_771_ == 0 && anInt8575 != 255) {
											i_771_ = i_775_;
											i_775_ = is[i_721_];
											i_775_ = ((i_771_ & 0xff00ff) * anInt8575 + (i_775_ & 0xff00ff) * anInt8562 & ~0xff00ff)
													+ ((i_771_ & 0xff00) * anInt8575 + (i_775_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
										}
										is[i_721_] = i_775_;
									} else if (i == 2) {
										int i_776_ = raster[i_720_];
										if (i_776_ != 0) {
											int i_777_ = palette[i_776_ & 0xff];
											int i_778_ = (i_777_ & 0xff00ff) * anInt8575 & ~0xff00ff;
											int i_779_ = (i_777_ & 0xff00) * anInt8575 & 0xff0000;
											i_777_ = ((i_778_ | i_779_) >>> 8) + anInt8582;
											int i_780_ = is[i_721_];
											int i_781_ = i_777_ + i_780_;
											int i_782_ = (i_777_ & 0xff00ff) + (i_780_ & 0xff00ff);
											i_780_ = (i_782_ & 0x1000100) + (i_781_ - i_782_ & 0x10000);
											is[i_721_] = i_781_ - i_780_ | i_780_ - (i_780_ >>> 8);
										}
									}
								} else {
									throw new IllegalArgumentException();
								}
								i_716_ += anInt8576;
							}
						}
						i_713_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8564 < 0) {
				if (anInt8576 == 0) {
					int i_783_ = anInt8561;
					while (i_783_ < 0) {
						int i_784_ = anInt8547;
						int i_785_ = anInt8570 + anInt8573;
						int i_786_ = anInt8571;
						int i_787_ = anInt8572;
						if (i_786_ >= 0 && i_786_ - (height << 12) < 0) {
							int i_788_;
							if ((i_788_ = i_785_ - (width << 12)) >= 0) {
								i_788_ = (anInt8564 - i_788_) / anInt8564;
								i_787_ += i_788_;
								i_785_ += anInt8564 * i_788_;
								i_784_ += i_788_;
							}
							if ((i_788_ = (i_785_ - anInt8564) / anInt8564) > i_787_) {
								i_787_ = i_788_;
							}
							for (; i_787_ < 0; i_787_++) {
								int i_789_ = (i_786_ >> 12) * width + (i_785_ >> 12);
								int i_790_ = i_784_++;
								if (i_575_ == 0) {
									if (i == 1) {
										is[i_790_] = palette[raster[i_789_] & 0xff];
									} else if (i == 0) {
										int i_791_ = palette[raster[i_789_] & 0xff];
										int i_792_ = (i_791_ & 0xff0000) * anInt8577 & ~0xffffff;
										int i_793_ = (i_791_ & 0xff00) * anInt8560 & 0xff0000;
										int i_794_ = (i_791_ & 0xff) * anInt8579 & 0xff00;
										is[i_790_] = (i_792_ | i_793_ | i_794_) >>> 8;
									} else if (i == 3) {
										int i_795_ = palette[raster[i_789_] & 0xff];
										int i_796_ = anInt8578;
										int i_797_ = i_795_ + i_796_;
										int i_798_ = (i_795_ & 0xff00ff) + (i_796_ & 0xff00ff);
										int i_799_ = (i_798_ & 0x1000100) + (i_797_ - i_798_ & 0x10000);
										is[i_790_] = i_797_ - i_799_ | i_799_ - (i_799_ >>> 8);
									} else if (i == 2) {
										int i_800_ = palette[raster[i_789_] & 0xff];
										int i_801_ = (i_800_ & 0xff00ff) * anInt8575 & ~0xff00ff;
										int i_802_ = (i_800_ & 0xff00) * anInt8575 & 0xff0000;
										is[i_790_] = ((i_801_ | i_802_) >>> 8) + anInt8582;
									} else {
										throw new IllegalArgumentException();
									}
								} else if (i_575_ == 1) {
									if (i == 1) {
										int i_803_ = raster[i_789_];
										if (i_803_ != 0) {
											is[i_790_] = palette[i_803_ & 0xff];
										}
									} else if (i == 0) {
										int i_804_ = raster[i_789_];
										if (i_804_ != 0) {
											int i_805_ = palette[i_804_ & 0xff];
											if ((anInt8578 & 0xffffff) == 16777215) {
												int i_806_ = anInt8578 >>> 24;
												int i_807_ = 256 - i_806_;
												int i_808_ = is[i_790_];
												is[i_790_] = ((i_805_ & 0xff00ff) * i_806_ + (i_808_ & 0xff00ff)
														* i_807_ & ~0xff00ff)
														+ ((i_805_ & 0xff00) * i_806_ + (i_808_ & 0xff00) * i_807_ & 0xff0000) >> 8;
											} else if (anInt8575 != 255) {
												int i_809_ = (i_805_ & 0xff0000) * anInt8577 & ~0xffffff;
												int i_810_ = (i_805_ & 0xff00) * anInt8560 & 0xff0000;
												int i_811_ = (i_805_ & 0xff) * anInt8579 & 0xff00;
												i_805_ = (i_809_ | i_810_ | i_811_) >>> 8;
												int i_812_ = is[i_790_];
												is[i_790_] = ((i_805_ & 0xff00ff) * anInt8575 + (i_812_ & 0xff00ff)
														* anInt8562 & ~0xff00ff)
														+ ((i_805_ & 0xff00) * anInt8575 + (i_812_ & 0xff00)
																* anInt8562 & 0xff0000) >> 8;
											} else {
												int i_813_ = (i_805_ & 0xff0000) * anInt8577 & ~0xffffff;
												int i_814_ = (i_805_ & 0xff00) * anInt8560 & 0xff0000;
												int i_815_ = (i_805_ & 0xff) * anInt8579 & 0xff00;
												is[i_790_] = (i_813_ | i_814_ | i_815_) >>> 8;
											}
										}
									} else if (i == 3) {
										byte i_816_ = raster[i_789_];
										int i_817_ = i_816_ > 0 ? palette[i_816_] : 0;
										int i_818_ = anInt8578;
										int i_819_ = i_817_ + i_818_;
										int i_820_ = (i_817_ & 0xff00ff) + (i_818_ & 0xff00ff);
										int i_821_ = (i_820_ & 0x1000100) + (i_819_ - i_820_ & 0x10000);
										i_821_ = i_819_ - i_821_ | i_821_ - (i_821_ >>> 8);
										if (i_817_ == 0 && anInt8575 != 255) {
											i_817_ = i_821_;
											i_821_ = is[i_790_];
											i_821_ = ((i_817_ & 0xff00ff) * anInt8575 + (i_821_ & 0xff00ff) * anInt8562 & ~0xff00ff)
													+ ((i_817_ & 0xff00) * anInt8575 + (i_821_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
										}
										is[i_790_] = i_821_;
									} else if (i == 2) {
										int i_822_ = raster[i_789_];
										if (i_822_ != 0) {
											int i_823_ = palette[i_822_ & 0xff];
											int i_824_ = (i_823_ & 0xff00ff) * anInt8575 & ~0xff00ff;
											int i_825_ = (i_823_ & 0xff00) * anInt8575 & 0xff0000;
											is[i_790_++] = ((i_824_ | i_825_) >>> 8) + anInt8582;
										}
									} else {
										throw new IllegalArgumentException();
									}
								} else if (i_575_ == 2) {
									if (i == 1) {
										int i_826_ = raster[i_789_];
										if (i_826_ != 0) {
											int i_827_ = palette[i_826_ & 0xff];
											int i_828_ = is[i_790_];
											int i_829_ = i_827_ + i_828_;
											int i_830_ = (i_827_ & 0xff00ff) + (i_828_ & 0xff00ff);
											i_828_ = (i_830_ & 0x1000100) + (i_829_ - i_830_ & 0x10000);
											is[i_790_] = i_829_ - i_828_ | i_828_ - (i_828_ >>> 8);
										}
									} else if (i == 0) {
										int i_831_ = raster[i_789_];
										if (i_831_ != 0) {
											int i_832_ = palette[i_831_ & 0xff];
											int i_833_ = (i_832_ & 0xff0000) * anInt8577 & ~0xffffff;
											int i_834_ = (i_832_ & 0xff00) * anInt8560 & 0xff0000;
											int i_835_ = (i_832_ & 0xff) * anInt8579 & 0xff00;
											i_832_ = (i_833_ | i_834_ | i_835_) >>> 8;
											int i_836_ = is[i_790_];
											int i_837_ = i_832_ + i_836_;
											int i_838_ = (i_832_ & 0xff00ff) + (i_836_ & 0xff00ff);
											i_836_ = (i_838_ & 0x1000100) + (i_837_ - i_838_ & 0x10000);
											is[i_790_] = i_837_ - i_836_ | i_836_ - (i_836_ >>> 8);
										}
									} else if (i == 3) {
										byte i_839_ = raster[i_789_];
										int i_840_ = i_839_ > 0 ? palette[i_839_] : 0;
										int i_841_ = anInt8578;
										int i_842_ = i_840_ + i_841_;
										int i_843_ = (i_840_ & 0xff00ff) + (i_841_ & 0xff00ff);
										int i_844_ = (i_843_ & 0x1000100) + (i_842_ - i_843_ & 0x10000);
										i_844_ = i_842_ - i_844_ | i_844_ - (i_844_ >>> 8);
										if (i_840_ == 0 && anInt8575 != 255) {
											i_840_ = i_844_;
											i_844_ = is[i_790_];
											i_844_ = ((i_840_ & 0xff00ff) * anInt8575 + (i_844_ & 0xff00ff) * anInt8562 & ~0xff00ff)
													+ ((i_840_ & 0xff00) * anInt8575 + (i_844_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
										}
										is[i_790_] = i_844_;
									} else if (i == 2) {
										int i_845_ = raster[i_789_];
										if (i_845_ != 0) {
											int i_846_ = palette[i_845_ & 0xff];
											int i_847_ = (i_846_ & 0xff00ff) * anInt8575 & ~0xff00ff;
											int i_848_ = (i_846_ & 0xff00) * anInt8575 & 0xff0000;
											i_846_ = ((i_847_ | i_848_) >>> 8) + anInt8582;
											int i_849_ = is[i_790_];
											int i_850_ = i_846_ + i_849_;
											int i_851_ = (i_846_ & 0xff00ff) + (i_849_ & 0xff00ff);
											i_849_ = (i_851_ & 0x1000100) + (i_850_ - i_851_ & 0x10000);
											is[i_790_] = i_850_ - i_849_ | i_849_ - (i_849_ >>> 8);
										}
									}
								} else {
									throw new IllegalArgumentException();
								}
								i_785_ += anInt8564;
							}
						}
						i_783_++;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_852_ = anInt8561;
					while (i_852_ < 0) {
						int i_853_ = anInt8547;
						int i_854_ = anInt8570 + anInt8573;
						int i_855_ = anInt8571 + anInt8574;
						int i_856_ = anInt8572;
						int i_857_;
						if ((i_857_ = i_854_ - (width << 12)) >= 0) {
							i_857_ = (anInt8564 - i_857_) / anInt8564;
							i_856_ += i_857_;
							i_854_ += anInt8564 * i_857_;
							i_855_ += anInt8576 * i_857_;
							i_853_ += i_857_;
						}
						if ((i_857_ = (i_854_ - anInt8564) / anInt8564) > i_856_) {
							i_856_ = i_857_;
						}
						if ((i_857_ = i_855_ - (height << 12)) >= 0) {
							i_857_ = (anInt8576 - i_857_) / anInt8576;
							i_856_ += i_857_;
							i_854_ += anInt8564 * i_857_;
							i_855_ += anInt8576 * i_857_;
							i_853_ += i_857_;
						}
						if ((i_857_ = (i_855_ - anInt8576) / anInt8576) > i_856_) {
							i_856_ = i_857_;
						}
						for (; i_856_ < 0; i_856_++) {
							int i_858_ = (i_855_ >> 12) * width + (i_854_ >> 12);
							int i_859_ = i_853_++;
							if (i_575_ == 0) {
								if (i == 1) {
									is[i_859_] = palette[raster[i_858_] & 0xff];
								} else if (i == 0) {
									int i_860_ = palette[raster[i_858_] & 0xff];
									int i_861_ = (i_860_ & 0xff0000) * anInt8577 & ~0xffffff;
									int i_862_ = (i_860_ & 0xff00) * anInt8560 & 0xff0000;
									int i_863_ = (i_860_ & 0xff) * anInt8579 & 0xff00;
									is[i_859_] = (i_861_ | i_862_ | i_863_) >>> 8;
								} else if (i == 3) {
									int i_864_ = palette[raster[i_858_] & 0xff];
									int i_865_ = anInt8578;
									int i_866_ = i_864_ + i_865_;
									int i_867_ = (i_864_ & 0xff00ff) + (i_865_ & 0xff00ff);
									int i_868_ = (i_867_ & 0x1000100) + (i_866_ - i_867_ & 0x10000);
									is[i_859_] = i_866_ - i_868_ | i_868_ - (i_868_ >>> 8);
								} else if (i == 2) {
									int i_869_ = palette[raster[i_858_] & 0xff];
									int i_870_ = (i_869_ & 0xff00ff) * anInt8575 & ~0xff00ff;
									int i_871_ = (i_869_ & 0xff00) * anInt8575 & 0xff0000;
									is[i_859_] = ((i_870_ | i_871_) >>> 8) + anInt8582;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_575_ == 1) {
								if (i == 1) {
									int i_872_ = raster[i_858_];
									if (i_872_ != 0) {
										is[i_859_] = palette[i_872_ & 0xff];
									}
								} else if (i == 0) {
									int i_873_ = raster[i_858_];
									if (i_873_ != 0) {
										int i_874_ = palette[i_873_ & 0xff];
										if ((anInt8578 & 0xffffff) == 16777215) {
											int i_875_ = anInt8578 >>> 24;
											int i_876_ = 256 - i_875_;
											int i_877_ = is[i_859_];
											is[i_859_] = ((i_874_ & 0xff00ff) * i_875_ + (i_877_ & 0xff00ff) * i_876_ & ~0xff00ff)
													+ ((i_874_ & 0xff00) * i_875_ + (i_877_ & 0xff00) * i_876_ & 0xff0000) >> 8;
										} else if (anInt8575 != 255) {
											int i_878_ = (i_874_ & 0xff0000) * anInt8577 & ~0xffffff;
											int i_879_ = (i_874_ & 0xff00) * anInt8560 & 0xff0000;
											int i_880_ = (i_874_ & 0xff) * anInt8579 & 0xff00;
											i_874_ = (i_878_ | i_879_ | i_880_) >>> 8;
											int i_881_ = is[i_859_];
											is[i_859_] = ((i_874_ & 0xff00ff) * anInt8575 + (i_881_ & 0xff00ff)
													* anInt8562 & ~0xff00ff)
													+ ((i_874_ & 0xff00) * anInt8575 + (i_881_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
										} else {
											int i_882_ = (i_874_ & 0xff0000) * anInt8577 & ~0xffffff;
											int i_883_ = (i_874_ & 0xff00) * anInt8560 & 0xff0000;
											int i_884_ = (i_874_ & 0xff) * anInt8579 & 0xff00;
											is[i_859_] = (i_882_ | i_883_ | i_884_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_885_ = raster[i_858_];
									int i_886_ = i_885_ > 0 ? palette[i_885_] : 0;
									int i_887_ = anInt8578;
									int i_888_ = i_886_ + i_887_;
									int i_889_ = (i_886_ & 0xff00ff) + (i_887_ & 0xff00ff);
									int i_890_ = (i_889_ & 0x1000100) + (i_888_ - i_889_ & 0x10000);
									i_890_ = i_888_ - i_890_ | i_890_ - (i_890_ >>> 8);
									if (i_886_ == 0 && anInt8575 != 255) {
										i_886_ = i_890_;
										i_890_ = is[i_859_];
										i_890_ = ((i_886_ & 0xff00ff) * anInt8575 + (i_890_ & 0xff00ff) * anInt8562 & ~0xff00ff)
												+ ((i_886_ & 0xff00) * anInt8575 + (i_890_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
									}
									is[i_859_] = i_890_;
								} else if (i == 2) {
									int i_891_ = raster[i_858_];
									if (i_891_ != 0) {
										int i_892_ = palette[i_891_ & 0xff];
										int i_893_ = (i_892_ & 0xff00ff) * anInt8575 & ~0xff00ff;
										int i_894_ = (i_892_ & 0xff00) * anInt8575 & 0xff0000;
										is[i_859_++] = ((i_893_ | i_894_) >>> 8) + anInt8582;
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_575_ == 2) {
								if (i == 1) {
									int i_895_ = raster[i_858_];
									if (i_895_ != 0) {
										int i_896_ = palette[i_895_ & 0xff];
										int i_897_ = is[i_859_];
										int i_898_ = i_896_ + i_897_;
										int i_899_ = (i_896_ & 0xff00ff) + (i_897_ & 0xff00ff);
										i_897_ = (i_899_ & 0x1000100) + (i_898_ - i_899_ & 0x10000);
										is[i_859_] = i_898_ - i_897_ | i_897_ - (i_897_ >>> 8);
									}
								} else if (i == 0) {
									int i_900_ = raster[i_858_];
									if (i_900_ != 0) {
										int i_901_ = palette[i_900_ & 0xff];
										int i_902_ = (i_901_ & 0xff0000) * anInt8577 & ~0xffffff;
										int i_903_ = (i_901_ & 0xff00) * anInt8560 & 0xff0000;
										int i_904_ = (i_901_ & 0xff) * anInt8579 & 0xff00;
										i_901_ = (i_902_ | i_903_ | i_904_) >>> 8;
										int i_905_ = is[i_859_];
										int i_906_ = i_901_ + i_905_;
										int i_907_ = (i_901_ & 0xff00ff) + (i_905_ & 0xff00ff);
										i_905_ = (i_907_ & 0x1000100) + (i_906_ - i_907_ & 0x10000);
										is[i_859_] = i_906_ - i_905_ | i_905_ - (i_905_ >>> 8);
									}
								} else if (i == 3) {
									byte i_908_ = raster[i_858_];
									int i_909_ = i_908_ > 0 ? palette[i_908_] : 0;
									int i_910_ = anInt8578;
									int i_911_ = i_909_ + i_910_;
									int i_912_ = (i_909_ & 0xff00ff) + (i_910_ & 0xff00ff);
									int i_913_ = (i_912_ & 0x1000100) + (i_911_ - i_912_ & 0x10000);
									i_913_ = i_911_ - i_913_ | i_913_ - (i_913_ >>> 8);
									if (i_909_ == 0 && anInt8575 != 255) {
										i_909_ = i_913_;
										i_913_ = is[i_859_];
										i_913_ = ((i_909_ & 0xff00ff) * anInt8575 + (i_913_ & 0xff00ff) * anInt8562 & ~0xff00ff)
												+ ((i_909_ & 0xff00) * anInt8575 + (i_913_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
									}
									is[i_859_] = i_913_;
								} else if (i == 2) {
									int i_914_ = raster[i_858_];
									if (i_914_ != 0) {
										int i_915_ = palette[i_914_ & 0xff];
										int i_916_ = (i_915_ & 0xff00ff) * anInt8575 & ~0xff00ff;
										int i_917_ = (i_915_ & 0xff00) * anInt8575 & 0xff0000;
										i_915_ = ((i_916_ | i_917_) >>> 8) + anInt8582;
										int i_918_ = is[i_859_];
										int i_919_ = i_915_ + i_918_;
										int i_920_ = (i_915_ & 0xff00ff) + (i_918_ & 0xff00ff);
										i_918_ = (i_920_ & 0x1000100) + (i_919_ - i_920_ & 0x10000);
										is[i_859_] = i_919_ - i_918_ | i_918_ - (i_918_ >>> 8);
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_854_ += anInt8564;
							i_855_ += anInt8576;
						}
						i_852_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else {
					int i_921_ = anInt8561;
					while (i_921_ < 0) {
						int i_922_ = anInt8547;
						int i_923_ = anInt8570 + anInt8573;
						int i_924_ = anInt8571 + anInt8574;
						int i_925_ = anInt8572;
						int i_926_;
						if ((i_926_ = i_923_ - (width << 12)) >= 0) {
							i_926_ = (anInt8564 - i_926_) / anInt8564;
							i_925_ += i_926_;
							i_923_ += anInt8564 * i_926_;
							i_924_ += anInt8576 * i_926_;
							i_922_ += i_926_;
						}
						if ((i_926_ = (i_923_ - anInt8564) / anInt8564) > i_925_) {
							i_925_ = i_926_;
						}
						if (i_924_ < 0) {
							i_926_ = (anInt8576 - 1 - i_924_) / anInt8576;
							i_925_ += i_926_;
							i_923_ += anInt8564 * i_926_;
							i_924_ += anInt8576 * i_926_;
							i_922_ += i_926_;
						}
						if ((i_926_ = (1 + i_924_ - (height << 12) - anInt8576) / anInt8576) > i_925_) {
							i_925_ = i_926_;
						}
						for (; i_925_ < 0; i_925_++) {
							int i_927_ = (i_924_ >> 12) * width + (i_923_ >> 12);
							int i_928_ = i_922_++;
							if (i_575_ == 0) {
								if (i == 1) {
									is[i_928_] = palette[raster[i_927_] & 0xff];
								} else if (i == 0) {
									int i_929_ = palette[raster[i_927_] & 0xff];
									int i_930_ = (i_929_ & 0xff0000) * anInt8577 & ~0xffffff;
									int i_931_ = (i_929_ & 0xff00) * anInt8560 & 0xff0000;
									int i_932_ = (i_929_ & 0xff) * anInt8579 & 0xff00;
									is[i_928_] = (i_930_ | i_931_ | i_932_) >>> 8;
								} else if (i == 3) {
									int i_933_ = palette[raster[i_927_] & 0xff];
									int i_934_ = anInt8578;
									int i_935_ = i_933_ + i_934_;
									int i_936_ = (i_933_ & 0xff00ff) + (i_934_ & 0xff00ff);
									int i_937_ = (i_936_ & 0x1000100) + (i_935_ - i_936_ & 0x10000);
									is[i_928_] = i_935_ - i_937_ | i_937_ - (i_937_ >>> 8);
								} else if (i == 2) {
									int i_938_ = palette[raster[i_927_] & 0xff];
									int i_939_ = (i_938_ & 0xff00ff) * anInt8575 & ~0xff00ff;
									int i_940_ = (i_938_ & 0xff00) * anInt8575 & 0xff0000;
									is[i_928_] = ((i_939_ | i_940_) >>> 8) + anInt8582;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_575_ == 1) {
								if (i == 1) {
									int i_941_ = raster[i_927_];
									if (i_941_ != 0) {
										is[i_928_] = palette[i_941_ & 0xff];
									}
								} else if (i == 0) {
									int i_942_ = raster[i_927_];
									if (i_942_ != 0) {
										int i_943_ = palette[i_942_ & 0xff];
										if ((anInt8578 & 0xffffff) == 16777215) {
											int i_944_ = anInt8578 >>> 24;
											int i_945_ = 256 - i_944_;
											int i_946_ = is[i_928_];
											is[i_928_] = ((i_943_ & 0xff00ff) * i_944_ + (i_946_ & 0xff00ff) * i_945_ & ~0xff00ff)
													+ ((i_943_ & 0xff00) * i_944_ + (i_946_ & 0xff00) * i_945_ & 0xff0000) >> 8;
										} else if (anInt8575 != 255) {
											int i_947_ = (i_943_ & 0xff0000) * anInt8577 & ~0xffffff;
											int i_948_ = (i_943_ & 0xff00) * anInt8560 & 0xff0000;
											int i_949_ = (i_943_ & 0xff) * anInt8579 & 0xff00;
											i_943_ = (i_947_ | i_948_ | i_949_) >>> 8;
											int i_950_ = is[i_928_];
											is[i_928_] = ((i_943_ & 0xff00ff) * anInt8575 + (i_950_ & 0xff00ff)
													* anInt8562 & ~0xff00ff)
													+ ((i_943_ & 0xff00) * anInt8575 + (i_950_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
										} else {
											int i_951_ = (i_943_ & 0xff0000) * anInt8577 & ~0xffffff;
											int i_952_ = (i_943_ & 0xff00) * anInt8560 & 0xff0000;
											int i_953_ = (i_943_ & 0xff) * anInt8579 & 0xff00;
											is[i_928_] = (i_951_ | i_952_ | i_953_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_954_ = raster[i_927_];
									int i_955_ = i_954_ > 0 ? palette[i_954_] : 0;
									int i_956_ = anInt8578;
									int i_957_ = i_955_ + i_956_;
									int i_958_ = (i_955_ & 0xff00ff) + (i_956_ & 0xff00ff);
									int i_959_ = (i_958_ & 0x1000100) + (i_957_ - i_958_ & 0x10000);
									i_959_ = i_957_ - i_959_ | i_959_ - (i_959_ >>> 8);
									if (i_955_ == 0 && anInt8575 != 255) {
										i_955_ = i_959_;
										i_959_ = is[i_928_];
										i_959_ = ((i_955_ & 0xff00ff) * anInt8575 + (i_959_ & 0xff00ff) * anInt8562 & ~0xff00ff)
												+ ((i_955_ & 0xff00) * anInt8575 + (i_959_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
									}
									is[i_928_] = i_959_;
								} else if (i == 2) {
									int i_960_ = raster[i_927_];
									if (i_960_ != 0) {
										int i_961_ = palette[i_960_ & 0xff];
										int i_962_ = (i_961_ & 0xff00ff) * anInt8575 & ~0xff00ff;
										int i_963_ = (i_961_ & 0xff00) * anInt8575 & 0xff0000;
										is[i_928_++] = ((i_962_ | i_963_) >>> 8) + anInt8582;
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_575_ == 2) {
								if (i == 1) {
									int i_964_ = raster[i_927_];
									if (i_964_ != 0) {
										int i_965_ = palette[i_964_ & 0xff];
										int i_966_ = is[i_928_];
										int i_967_ = i_965_ + i_966_;
										int i_968_ = (i_965_ & 0xff00ff) + (i_966_ & 0xff00ff);
										i_966_ = (i_968_ & 0x1000100) + (i_967_ - i_968_ & 0x10000);
										is[i_928_] = i_967_ - i_966_ | i_966_ - (i_966_ >>> 8);
									}
								} else if (i == 0) {
									int i_969_ = raster[i_927_];
									if (i_969_ != 0) {
										int i_970_ = palette[i_969_ & 0xff];
										int i_971_ = (i_970_ & 0xff0000) * anInt8577 & ~0xffffff;
										int i_972_ = (i_970_ & 0xff00) * anInt8560 & 0xff0000;
										int i_973_ = (i_970_ & 0xff) * anInt8579 & 0xff00;
										i_970_ = (i_971_ | i_972_ | i_973_) >>> 8;
										int i_974_ = is[i_928_];
										int i_975_ = i_970_ + i_974_;
										int i_976_ = (i_970_ & 0xff00ff) + (i_974_ & 0xff00ff);
										i_974_ = (i_976_ & 0x1000100) + (i_975_ - i_976_ & 0x10000);
										is[i_928_] = i_975_ - i_974_ | i_974_ - (i_974_ >>> 8);
									}
								} else if (i == 3) {
									byte i_977_ = raster[i_927_];
									int i_978_ = i_977_ > 0 ? palette[i_977_] : 0;
									int i_979_ = anInt8578;
									int i_980_ = i_978_ + i_979_;
									int i_981_ = (i_978_ & 0xff00ff) + (i_979_ & 0xff00ff);
									int i_982_ = (i_981_ & 0x1000100) + (i_980_ - i_981_ & 0x10000);
									i_982_ = i_980_ - i_982_ | i_982_ - (i_982_ >>> 8);
									if (i_978_ == 0 && anInt8575 != 255) {
										i_978_ = i_982_;
										i_982_ = is[i_928_];
										i_982_ = ((i_978_ & 0xff00ff) * anInt8575 + (i_982_ & 0xff00ff) * anInt8562 & ~0xff00ff)
												+ ((i_978_ & 0xff00) * anInt8575 + (i_982_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
									}
									is[i_928_] = i_982_;
								} else if (i == 2) {
									int i_983_ = raster[i_927_];
									if (i_983_ != 0) {
										int i_984_ = palette[i_983_ & 0xff];
										int i_985_ = (i_984_ & 0xff00ff) * anInt8575 & ~0xff00ff;
										int i_986_ = (i_984_ & 0xff00) * anInt8575 & 0xff0000;
										i_984_ = ((i_985_ | i_986_) >>> 8) + anInt8582;
										int i_987_ = is[i_928_];
										int i_988_ = i_984_ + i_987_;
										int i_989_ = (i_984_ & 0xff00ff) + (i_987_ & 0xff00ff);
										i_987_ = (i_989_ & 0x1000100) + (i_988_ - i_989_ & 0x10000);
										is[i_928_] = i_988_ - i_987_ | i_987_ - (i_987_ >>> 8);
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_923_ += anInt8564;
							i_924_ += anInt8576;
						}
						i_921_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8576 == 0) {
				int i_990_ = anInt8561;
				while (i_990_ < 0) {
					int i_991_ = anInt8547;
					int i_992_ = anInt8570 + anInt8573;
					int i_993_ = anInt8571;
					int i_994_ = anInt8572;
					if (i_993_ >= 0 && i_993_ - (height << 12) < 0) {
						if (i_992_ < 0) {
							int i_995_ = (anInt8564 - 1 - i_992_) / anInt8564;
							i_994_ += i_995_;
							i_992_ += anInt8564 * i_995_;
							i_991_ += i_995_;
						}
						int i_996_;
						if ((i_996_ = (1 + i_992_ - (width << 12) - anInt8564) / anInt8564) > i_994_) {
							i_994_ = i_996_;
						}
						for (; i_994_ < 0; i_994_++) {
							int i_997_ = (i_993_ >> 12) * width + (i_992_ >> 12);
							int i_998_ = i_991_++;
							if (i_575_ == 0) {
								if (i == 1) {
									is[i_998_] = palette[raster[i_997_] & 0xff];
								} else if (i == 0) {
									int i_999_ = palette[raster[i_997_] & 0xff];
									int i_1000_ = (i_999_ & 0xff0000) * anInt8577 & ~0xffffff;
									int i_1001_ = (i_999_ & 0xff00) * anInt8560 & 0xff0000;
									int i_1002_ = (i_999_ & 0xff) * anInt8579 & 0xff00;
									is[i_998_] = (i_1000_ | i_1001_ | i_1002_) >>> 8;
								} else if (i == 3) {
									int i_1003_ = palette[raster[i_997_] & 0xff];
									int i_1004_ = anInt8578;
									int i_1005_ = i_1003_ + i_1004_;
									int i_1006_ = (i_1003_ & 0xff00ff) + (i_1004_ & 0xff00ff);
									int i_1007_ = (i_1006_ & 0x1000100) + (i_1005_ - i_1006_ & 0x10000);
									is[i_998_] = i_1005_ - i_1007_ | i_1007_ - (i_1007_ >>> 8);
								} else if (i == 2) {
									int i_1008_ = palette[raster[i_997_] & 0xff];
									int i_1009_ = (i_1008_ & 0xff00ff) * anInt8575 & ~0xff00ff;
									int i_1010_ = (i_1008_ & 0xff00) * anInt8575 & 0xff0000;
									is[i_998_] = ((i_1009_ | i_1010_) >>> 8) + anInt8582;
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_575_ == 1) {
								if (i == 1) {
									int i_1011_ = raster[i_997_];
									if (i_1011_ != 0) {
										is[i_998_] = palette[i_1011_ & 0xff];
									}
								} else if (i == 0) {
									int i_1012_ = raster[i_997_];
									if (i_1012_ != 0) {
										int i_1013_ = palette[i_1012_ & 0xff];
										if ((anInt8578 & 0xffffff) == 16777215) {
											int i_1014_ = anInt8578 >>> 24;
											int i_1015_ = 256 - i_1014_;
											int i_1016_ = is[i_998_];
											is[i_998_] = ((i_1013_ & 0xff00ff) * i_1014_ + (i_1016_ & 0xff00ff)
													* i_1015_ & ~0xff00ff)
													+ ((i_1013_ & 0xff00) * i_1014_ + (i_1016_ & 0xff00) * i_1015_ & 0xff0000) >> 8;
										} else if (anInt8575 != 255) {
											int i_1017_ = (i_1013_ & 0xff0000) * anInt8577 & ~0xffffff;
											int i_1018_ = (i_1013_ & 0xff00) * anInt8560 & 0xff0000;
											int i_1019_ = (i_1013_ & 0xff) * anInt8579 & 0xff00;
											i_1013_ = (i_1017_ | i_1018_ | i_1019_) >>> 8;
											int i_1020_ = is[i_998_];
											is[i_998_] = ((i_1013_ & 0xff00ff) * anInt8575 + (i_1020_ & 0xff00ff)
													* anInt8562 & ~0xff00ff)
													+ ((i_1013_ & 0xff00) * anInt8575 + (i_1020_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
										} else {
											int i_1021_ = (i_1013_ & 0xff0000) * anInt8577 & ~0xffffff;
											int i_1022_ = (i_1013_ & 0xff00) * anInt8560 & 0xff0000;
											int i_1023_ = (i_1013_ & 0xff) * anInt8579 & 0xff00;
											is[i_998_] = (i_1021_ | i_1022_ | i_1023_) >>> 8;
										}
									}
								} else if (i == 3) {
									byte i_1024_ = raster[i_997_];
									int i_1025_ = i_1024_ > 0 ? palette[i_1024_] : 0;
									int i_1026_ = anInt8578;
									int i_1027_ = i_1025_ + i_1026_;
									int i_1028_ = (i_1025_ & 0xff00ff) + (i_1026_ & 0xff00ff);
									int i_1029_ = (i_1028_ & 0x1000100) + (i_1027_ - i_1028_ & 0x10000);
									i_1029_ = i_1027_ - i_1029_ | i_1029_ - (i_1029_ >>> 8);
									if (i_1025_ == 0 && anInt8575 != 255) {
										i_1025_ = i_1029_;
										i_1029_ = is[i_998_];
										i_1029_ = ((i_1025_ & 0xff00ff) * anInt8575 + (i_1029_ & 0xff00ff) * anInt8562 & ~0xff00ff)
												+ ((i_1025_ & 0xff00) * anInt8575 + (i_1029_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
									}
									is[i_998_] = i_1029_;
								} else if (i == 2) {
									int i_1030_ = raster[i_997_];
									if (i_1030_ != 0) {
										int i_1031_ = palette[i_1030_ & 0xff];
										int i_1032_ = (i_1031_ & 0xff00ff) * anInt8575 & ~0xff00ff;
										int i_1033_ = (i_1031_ & 0xff00) * anInt8575 & 0xff0000;
										is[i_998_++] = ((i_1032_ | i_1033_) >>> 8) + anInt8582;
									}
								} else {
									throw new IllegalArgumentException();
								}
							} else if (i_575_ == 2) {
								if (i == 1) {
									int i_1034_ = raster[i_997_];
									if (i_1034_ != 0) {
										int i_1035_ = palette[i_1034_ & 0xff];
										int i_1036_ = is[i_998_];
										int i_1037_ = i_1035_ + i_1036_;
										int i_1038_ = (i_1035_ & 0xff00ff) + (i_1036_ & 0xff00ff);
										i_1036_ = (i_1038_ & 0x1000100) + (i_1037_ - i_1038_ & 0x10000);
										is[i_998_] = i_1037_ - i_1036_ | i_1036_ - (i_1036_ >>> 8);
									}
								} else if (i == 0) {
									int i_1039_ = raster[i_997_];
									if (i_1039_ != 0) {
										int i_1040_ = palette[i_1039_ & 0xff];
										int i_1041_ = (i_1040_ & 0xff0000) * anInt8577 & ~0xffffff;
										int i_1042_ = (i_1040_ & 0xff00) * anInt8560 & 0xff0000;
										int i_1043_ = (i_1040_ & 0xff) * anInt8579 & 0xff00;
										i_1040_ = (i_1041_ | i_1042_ | i_1043_) >>> 8;
										int i_1044_ = is[i_998_];
										int i_1045_ = i_1040_ + i_1044_;
										int i_1046_ = (i_1040_ & 0xff00ff) + (i_1044_ & 0xff00ff);
										i_1044_ = (i_1046_ & 0x1000100) + (i_1045_ - i_1046_ & 0x10000);
										is[i_998_] = i_1045_ - i_1044_ | i_1044_ - (i_1044_ >>> 8);
									}
								} else if (i == 3) {
									byte i_1047_ = raster[i_997_];
									int i_1048_ = i_1047_ > 0 ? palette[i_1047_] : 0;
									int i_1049_ = anInt8578;
									int i_1050_ = i_1048_ + i_1049_;
									int i_1051_ = (i_1048_ & 0xff00ff) + (i_1049_ & 0xff00ff);
									int i_1052_ = (i_1051_ & 0x1000100) + (i_1050_ - i_1051_ & 0x10000);
									i_1052_ = i_1050_ - i_1052_ | i_1052_ - (i_1052_ >>> 8);
									if (i_1048_ == 0 && anInt8575 != 255) {
										i_1048_ = i_1052_;
										i_1052_ = is[i_998_];
										i_1052_ = ((i_1048_ & 0xff00ff) * anInt8575 + (i_1052_ & 0xff00ff) * anInt8562 & ~0xff00ff)
												+ ((i_1048_ & 0xff00) * anInt8575 + (i_1052_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
									}
									is[i_998_] = i_1052_;
								} else if (i == 2) {
									int i_1053_ = raster[i_997_];
									if (i_1053_ != 0) {
										int i_1054_ = palette[i_1053_ & 0xff];
										int i_1055_ = (i_1054_ & 0xff00ff) * anInt8575 & ~0xff00ff;
										int i_1056_ = (i_1054_ & 0xff00) * anInt8575 & 0xff0000;
										i_1054_ = ((i_1055_ | i_1056_) >>> 8) + anInt8582;
										int i_1057_ = is[i_998_];
										int i_1058_ = i_1054_ + i_1057_;
										int i_1059_ = (i_1054_ & 0xff00ff) + (i_1057_ & 0xff00ff);
										i_1057_ = (i_1059_ & 0x1000100) + (i_1058_ - i_1059_ & 0x10000);
										is[i_998_] = i_1058_ - i_1057_ | i_1057_ - (i_1057_ >>> 8);
									}
								}
							} else {
								throw new IllegalArgumentException();
							}
							i_992_ += anInt8564;
						}
					}
					i_990_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else if (anInt8576 < 0) {
				for (int i_1060_ = anInt8561; i_1060_ < 0; i_1060_++) {
					int i_1061_ = anInt8547;
					int i_1062_ = anInt8570 + anInt8573;
					int i_1063_ = anInt8571 + anInt8574;
					int i_1064_ = anInt8572;
					if (i_1062_ < 0) {
						int i_1065_ = (anInt8564 - 1 - i_1062_) / anInt8564;
						i_1064_ += i_1065_;
						i_1062_ += anInt8564 * i_1065_;
						i_1063_ += anInt8576 * i_1065_;
						i_1061_ += i_1065_;
					}
					int i_1066_;
					if ((i_1066_ = (1 + i_1062_ - (width << 12) - anInt8564) / anInt8564) > i_1064_) {
						i_1064_ = i_1066_;
					}
					if ((i_1066_ = i_1063_ - (height << 12)) >= 0) {
						i_1066_ = (anInt8576 - i_1066_) / anInt8576;
						i_1064_ += i_1066_;
						i_1062_ += anInt8564 * i_1066_;
						i_1063_ += anInt8576 * i_1066_;
						i_1061_ += i_1066_;
					}
					if ((i_1066_ = (i_1063_ - anInt8576) / anInt8576) > i_1064_) {
						i_1064_ = i_1066_;
					}
					for (; i_1064_ < 0; i_1064_++) {
						int i_1067_ = (i_1063_ >> 12) * width + (i_1062_ >> 12);
						int i_1068_ = i_1061_++;
						if (i_575_ == 0) {
							if (i == 1) {
								is[i_1068_] = palette[raster[i_1067_] & 0xff];
							} else if (i == 0) {
								int i_1069_ = palette[raster[i_1067_] & 0xff];
								int i_1070_ = (i_1069_ & 0xff0000) * anInt8577 & ~0xffffff;
								int i_1071_ = (i_1069_ & 0xff00) * anInt8560 & 0xff0000;
								int i_1072_ = (i_1069_ & 0xff) * anInt8579 & 0xff00;
								is[i_1068_] = (i_1070_ | i_1071_ | i_1072_) >>> 8;
							} else if (i == 3) {
								int i_1073_ = palette[raster[i_1067_] & 0xff];
								int i_1074_ = anInt8578;
								int i_1075_ = i_1073_ + i_1074_;
								int i_1076_ = (i_1073_ & 0xff00ff) + (i_1074_ & 0xff00ff);
								int i_1077_ = (i_1076_ & 0x1000100) + (i_1075_ - i_1076_ & 0x10000);
								is[i_1068_] = i_1075_ - i_1077_ | i_1077_ - (i_1077_ >>> 8);
							} else if (i == 2) {
								int i_1078_ = palette[raster[i_1067_] & 0xff];
								int i_1079_ = (i_1078_ & 0xff00ff) * anInt8575 & ~0xff00ff;
								int i_1080_ = (i_1078_ & 0xff00) * anInt8575 & 0xff0000;
								is[i_1068_] = ((i_1079_ | i_1080_) >>> 8) + anInt8582;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_575_ == 1) {
							if (i == 1) {
								int i_1081_ = raster[i_1067_];
								if (i_1081_ != 0) {
									is[i_1068_] = palette[i_1081_ & 0xff];
								}
							} else if (i == 0) {
								int i_1082_ = raster[i_1067_];
								if (i_1082_ != 0) {
									int i_1083_ = palette[i_1082_ & 0xff];
									if ((anInt8578 & 0xffffff) == 16777215) {
										int i_1084_ = anInt8578 >>> 24;
										int i_1085_ = 256 - i_1084_;
										int i_1086_ = is[i_1068_];
										is[i_1068_] = ((i_1083_ & 0xff00ff) * i_1084_ + (i_1086_ & 0xff00ff) * i_1085_ & ~0xff00ff)
												+ ((i_1083_ & 0xff00) * i_1084_ + (i_1086_ & 0xff00) * i_1085_ & 0xff0000) >> 8;
									} else if (anInt8575 != 255) {
										int i_1087_ = (i_1083_ & 0xff0000) * anInt8577 & ~0xffffff;
										int i_1088_ = (i_1083_ & 0xff00) * anInt8560 & 0xff0000;
										int i_1089_ = (i_1083_ & 0xff) * anInt8579 & 0xff00;
										i_1083_ = (i_1087_ | i_1088_ | i_1089_) >>> 8;
										int i_1090_ = is[i_1068_];
										is[i_1068_] = ((i_1083_ & 0xff00ff) * anInt8575 + (i_1090_ & 0xff00ff)
												* anInt8562 & ~0xff00ff)
												+ ((i_1083_ & 0xff00) * anInt8575 + (i_1090_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
									} else {
										int i_1091_ = (i_1083_ & 0xff0000) * anInt8577 & ~0xffffff;
										int i_1092_ = (i_1083_ & 0xff00) * anInt8560 & 0xff0000;
										int i_1093_ = (i_1083_ & 0xff) * anInt8579 & 0xff00;
										is[i_1068_] = (i_1091_ | i_1092_ | i_1093_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1094_ = raster[i_1067_];
								int i_1095_ = i_1094_ > 0 ? palette[i_1094_] : 0;
								int i_1096_ = anInt8578;
								int i_1097_ = i_1095_ + i_1096_;
								int i_1098_ = (i_1095_ & 0xff00ff) + (i_1096_ & 0xff00ff);
								int i_1099_ = (i_1098_ & 0x1000100) + (i_1097_ - i_1098_ & 0x10000);
								i_1099_ = i_1097_ - i_1099_ | i_1099_ - (i_1099_ >>> 8);
								if (i_1095_ == 0 && anInt8575 != 255) {
									i_1095_ = i_1099_;
									i_1099_ = is[i_1068_];
									i_1099_ = ((i_1095_ & 0xff00ff) * anInt8575 + (i_1099_ & 0xff00ff) * anInt8562 & ~0xff00ff)
											+ ((i_1095_ & 0xff00) * anInt8575 + (i_1099_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
								}
								is[i_1068_] = i_1099_;
							} else if (i == 2) {
								int i_1100_ = raster[i_1067_];
								if (i_1100_ != 0) {
									int i_1101_ = palette[i_1100_ & 0xff];
									int i_1102_ = (i_1101_ & 0xff00ff) * anInt8575 & ~0xff00ff;
									int i_1103_ = (i_1101_ & 0xff00) * anInt8575 & 0xff0000;
									is[i_1068_++] = ((i_1102_ | i_1103_) >>> 8) + anInt8582;
								}
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_575_ == 2) {
							if (i == 1) {
								int i_1104_ = raster[i_1067_];
								if (i_1104_ != 0) {
									int i_1105_ = palette[i_1104_ & 0xff];
									int i_1106_ = is[i_1068_];
									int i_1107_ = i_1105_ + i_1106_;
									int i_1108_ = (i_1105_ & 0xff00ff) + (i_1106_ & 0xff00ff);
									i_1106_ = (i_1108_ & 0x1000100) + (i_1107_ - i_1108_ & 0x10000);
									is[i_1068_] = i_1107_ - i_1106_ | i_1106_ - (i_1106_ >>> 8);
								}
							} else if (i == 0) {
								int i_1109_ = raster[i_1067_];
								if (i_1109_ != 0) {
									int i_1110_ = palette[i_1109_ & 0xff];
									int i_1111_ = (i_1110_ & 0xff0000) * anInt8577 & ~0xffffff;
									int i_1112_ = (i_1110_ & 0xff00) * anInt8560 & 0xff0000;
									int i_1113_ = (i_1110_ & 0xff) * anInt8579 & 0xff00;
									i_1110_ = (i_1111_ | i_1112_ | i_1113_) >>> 8;
									int i_1114_ = is[i_1068_];
									int i_1115_ = i_1110_ + i_1114_;
									int i_1116_ = (i_1110_ & 0xff00ff) + (i_1114_ & 0xff00ff);
									i_1114_ = (i_1116_ & 0x1000100) + (i_1115_ - i_1116_ & 0x10000);
									is[i_1068_] = i_1115_ - i_1114_ | i_1114_ - (i_1114_ >>> 8);
								}
							} else if (i == 3) {
								byte i_1117_ = raster[i_1067_];
								int i_1118_ = i_1117_ > 0 ? palette[i_1117_] : 0;
								int i_1119_ = anInt8578;
								int i_1120_ = i_1118_ + i_1119_;
								int i_1121_ = (i_1118_ & 0xff00ff) + (i_1119_ & 0xff00ff);
								int i_1122_ = (i_1121_ & 0x1000100) + (i_1120_ - i_1121_ & 0x10000);
								i_1122_ = i_1120_ - i_1122_ | i_1122_ - (i_1122_ >>> 8);
								if (i_1118_ == 0 && anInt8575 != 255) {
									i_1118_ = i_1122_;
									i_1122_ = is[i_1068_];
									i_1122_ = ((i_1118_ & 0xff00ff) * anInt8575 + (i_1122_ & 0xff00ff) * anInt8562 & ~0xff00ff)
											+ ((i_1118_ & 0xff00) * anInt8575 + (i_1122_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
								}
								is[i_1068_] = i_1122_;
							} else if (i == 2) {
								int i_1123_ = raster[i_1067_];
								if (i_1123_ != 0) {
									int i_1124_ = palette[i_1123_ & 0xff];
									int i_1125_ = (i_1124_ & 0xff00ff) * anInt8575 & ~0xff00ff;
									int i_1126_ = (i_1124_ & 0xff00) * anInt8575 & 0xff0000;
									i_1124_ = ((i_1125_ | i_1126_) >>> 8) + anInt8582;
									int i_1127_ = is[i_1068_];
									int i_1128_ = i_1124_ + i_1127_;
									int i_1129_ = (i_1124_ & 0xff00ff) + (i_1127_ & 0xff00ff);
									i_1127_ = (i_1129_ & 0x1000100) + (i_1128_ - i_1129_ & 0x10000);
									is[i_1068_] = i_1128_ - i_1127_ | i_1127_ - (i_1127_ >>> 8);
								}
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_1062_ += anInt8564;
						i_1063_ += anInt8576;
					}
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else {
				for (int i_1130_ = anInt8561; i_1130_ < 0; i_1130_++) {
					int i_1131_ = anInt8547;
					int i_1132_ = anInt8570 + anInt8573;
					int i_1133_ = anInt8571 + anInt8574;
					int i_1134_ = anInt8572;
					if (i_1132_ < 0) {
						int i_1135_ = (anInt8564 - 1 - i_1132_) / anInt8564;
						i_1134_ += i_1135_;
						i_1132_ += anInt8564 * i_1135_;
						i_1133_ += anInt8576 * i_1135_;
						i_1131_ += i_1135_;
					}
					int i_1136_;
					if ((i_1136_ = (1 + i_1132_ - (width << 12) - anInt8564) / anInt8564) > i_1134_) {
						i_1134_ = i_1136_;
					}
					if (i_1133_ < 0) {
						i_1136_ = (anInt8576 - 1 - i_1133_) / anInt8576;
						i_1134_ += i_1136_;
						i_1132_ += anInt8564 * i_1136_;
						i_1133_ += anInt8576 * i_1136_;
						i_1131_ += i_1136_;
					}
					if ((i_1136_ = (1 + i_1133_ - (height << 12) - anInt8576) / anInt8576) > i_1134_) {
						i_1134_ = i_1136_;
					}
					for (; i_1134_ < 0; i_1134_++) {
						int i_1137_ = (i_1133_ >> 12) * width + (i_1132_ >> 12);
						int i_1138_ = i_1131_++;
						if (i_575_ == 0) {
							if (i == 1) {
								is[i_1138_] = palette[raster[i_1137_] & 0xff];
							} else if (i == 0) {
								int i_1139_ = palette[raster[i_1137_] & 0xff];
								int i_1140_ = (i_1139_ & 0xff0000) * anInt8577 & ~0xffffff;
								int i_1141_ = (i_1139_ & 0xff00) * anInt8560 & 0xff0000;
								int i_1142_ = (i_1139_ & 0xff) * anInt8579 & 0xff00;
								is[i_1138_] = (i_1140_ | i_1141_ | i_1142_) >>> 8;
							} else if (i == 3) {
								int i_1143_ = palette[raster[i_1137_] & 0xff];
								int i_1144_ = anInt8578;
								int i_1145_ = i_1143_ + i_1144_;
								int i_1146_ = (i_1143_ & 0xff00ff) + (i_1144_ & 0xff00ff);
								int i_1147_ = (i_1146_ & 0x1000100) + (i_1145_ - i_1146_ & 0x10000);
								is[i_1138_] = i_1145_ - i_1147_ | i_1147_ - (i_1147_ >>> 8);
							} else if (i == 2) {
								int i_1148_ = palette[raster[i_1137_] & 0xff];
								int i_1149_ = (i_1148_ & 0xff00ff) * anInt8575 & ~0xff00ff;
								int i_1150_ = (i_1148_ & 0xff00) * anInt8575 & 0xff0000;
								is[i_1138_] = ((i_1149_ | i_1150_) >>> 8) + anInt8582;
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_575_ == 1) {
							if (i == 1) {
								int i_1151_ = raster[i_1137_];
								if (i_1151_ != 0) {
									is[i_1138_] = palette[i_1151_ & 0xff];
								}
							} else if (i == 0) {
								int i_1152_ = raster[i_1137_];
								if (i_1152_ != 0) {
									int i_1153_ = palette[i_1152_ & 0xff];
									if ((anInt8578 & 0xffffff) == 16777215) {
										int i_1154_ = anInt8578 >>> 24;
										int i_1155_ = 256 - i_1154_;
										int i_1156_ = is[i_1138_];
										is[i_1138_] = ((i_1153_ & 0xff00ff) * i_1154_ + (i_1156_ & 0xff00ff) * i_1155_ & ~0xff00ff)
												+ ((i_1153_ & 0xff00) * i_1154_ + (i_1156_ & 0xff00) * i_1155_ & 0xff0000) >> 8;
									} else if (anInt8575 != 255) {
										int i_1157_ = (i_1153_ & 0xff0000) * anInt8577 & ~0xffffff;
										int i_1158_ = (i_1153_ & 0xff00) * anInt8560 & 0xff0000;
										int i_1159_ = (i_1153_ & 0xff) * anInt8579 & 0xff00;
										i_1153_ = (i_1157_ | i_1158_ | i_1159_) >>> 8;
										int i_1160_ = is[i_1138_];
										is[i_1138_] = ((i_1153_ & 0xff00ff) * anInt8575 + (i_1160_ & 0xff00ff)
												* anInt8562 & ~0xff00ff)
												+ ((i_1153_ & 0xff00) * anInt8575 + (i_1160_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
									} else {
										int i_1161_ = (i_1153_ & 0xff0000) * anInt8577 & ~0xffffff;
										int i_1162_ = (i_1153_ & 0xff00) * anInt8560 & 0xff0000;
										int i_1163_ = (i_1153_ & 0xff) * anInt8579 & 0xff00;
										is[i_1138_] = (i_1161_ | i_1162_ | i_1163_) >>> 8;
									}
								}
							} else if (i == 3) {
								byte i_1164_ = raster[i_1137_];
								int i_1165_ = i_1164_ > 0 ? palette[i_1164_] : 0;
								int i_1166_ = anInt8578;
								int i_1167_ = i_1165_ + i_1166_;
								int i_1168_ = (i_1165_ & 0xff00ff) + (i_1166_ & 0xff00ff);
								int i_1169_ = (i_1168_ & 0x1000100) + (i_1167_ - i_1168_ & 0x10000);
								i_1169_ = i_1167_ - i_1169_ | i_1169_ - (i_1169_ >>> 8);
								if (i_1165_ == 0 && anInt8575 != 255) {
									i_1165_ = i_1169_;
									i_1169_ = is[i_1138_];
									i_1169_ = ((i_1165_ & 0xff00ff) * anInt8575 + (i_1169_ & 0xff00ff) * anInt8562 & ~0xff00ff)
											+ ((i_1165_ & 0xff00) * anInt8575 + (i_1169_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
								}
								is[i_1138_] = i_1169_;
							} else if (i == 2) {
								int i_1170_ = raster[i_1137_];
								if (i_1170_ != 0) {
									int i_1171_ = palette[i_1170_ & 0xff];
									int i_1172_ = (i_1171_ & 0xff00ff) * anInt8575 & ~0xff00ff;
									int i_1173_ = (i_1171_ & 0xff00) * anInt8575 & 0xff0000;
									is[i_1138_++] = ((i_1172_ | i_1173_) >>> 8) + anInt8582;
								}
							} else {
								throw new IllegalArgumentException();
							}
						} else if (i_575_ == 2) {
							if (i == 1) {
								int i_1174_ = raster[i_1137_];
								if (i_1174_ != 0) {
									int i_1175_ = palette[i_1174_ & 0xff];
									int i_1176_ = is[i_1138_];
									int i_1177_ = i_1175_ + i_1176_;
									int i_1178_ = (i_1175_ & 0xff00ff) + (i_1176_ & 0xff00ff);
									i_1176_ = (i_1178_ & 0x1000100) + (i_1177_ - i_1178_ & 0x10000);
									is[i_1138_] = i_1177_ - i_1176_ | i_1176_ - (i_1176_ >>> 8);
								}
							} else if (i == 0) {
								int i_1179_ = raster[i_1137_];
								if (i_1179_ != 0) {
									int i_1180_ = palette[i_1179_ & 0xff];
									int i_1181_ = (i_1180_ & 0xff0000) * anInt8577 & ~0xffffff;
									int i_1182_ = (i_1180_ & 0xff00) * anInt8560 & 0xff0000;
									int i_1183_ = (i_1180_ & 0xff) * anInt8579 & 0xff00;
									i_1180_ = (i_1181_ | i_1182_ | i_1183_) >>> 8;
									int i_1184_ = is[i_1138_];
									int i_1185_ = i_1180_ + i_1184_;
									int i_1186_ = (i_1180_ & 0xff00ff) + (i_1184_ & 0xff00ff);
									i_1184_ = (i_1186_ & 0x1000100) + (i_1185_ - i_1186_ & 0x10000);
									is[i_1138_] = i_1185_ - i_1184_ | i_1184_ - (i_1184_ >>> 8);
								}
							} else if (i == 3) {
								byte i_1187_ = raster[i_1137_];
								int i_1188_ = i_1187_ > 0 ? palette[i_1187_] : 0;
								int i_1189_ = anInt8578;
								int i_1190_ = i_1188_ + i_1189_;
								int i_1191_ = (i_1188_ & 0xff00ff) + (i_1189_ & 0xff00ff);
								int i_1192_ = (i_1191_ & 0x1000100) + (i_1190_ - i_1191_ & 0x10000);
								i_1192_ = i_1190_ - i_1192_ | i_1192_ - (i_1192_ >>> 8);
								if (i_1188_ == 0 && anInt8575 != 255) {
									i_1188_ = i_1192_;
									i_1192_ = is[i_1138_];
									i_1192_ = ((i_1188_ & 0xff00ff) * anInt8575 + (i_1192_ & 0xff00ff) * anInt8562 & ~0xff00ff)
											+ ((i_1188_ & 0xff00) * anInt8575 + (i_1192_ & 0xff00) * anInt8562 & 0xff0000) >> 8;
								}
								is[i_1138_] = i_1192_;
							} else if (i == 2) {
								int i_1193_ = raster[i_1137_];
								if (i_1193_ != 0) {
									int i_1194_ = palette[i_1193_ & 0xff];
									int i_1195_ = (i_1194_ & 0xff00ff) * anInt8575 & ~0xff00ff;
									int i_1196_ = (i_1194_ & 0xff00) * anInt8575 & 0xff0000;
									i_1194_ = ((i_1195_ | i_1196_) >>> 8) + anInt8582;
									int i_1197_ = is[i_1138_];
									int i_1198_ = i_1194_ + i_1197_;
									int i_1199_ = (i_1194_ & 0xff00ff) + (i_1197_ & 0xff00ff);
									i_1197_ = (i_1199_ & 0x1000100) + (i_1198_ - i_1199_ & 0x10000);
									is[i_1138_] = i_1198_ - i_1197_ | i_1197_ - (i_1197_ >>> 8);
								}
							}
						} else {
							throw new IllegalArgumentException();
						}
						i_1132_ += anInt8564;
						i_1133_ += anInt8576;
					}
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			}
		}
	}

	@Override
	void method13988(int[] is, int[] is_464_, int i, int i_465_) {
		int[] is_466_ = toolkit.anIntArray8797;
		if (is_466_ != null) {
			if (anInt8564 == 0) {
				if (anInt8576 == 0) {
					int i_467_ = anInt8561;
					while (i_467_ < 0) {
						int i_468_ = i_467_ + i_465_;
						if (i_468_ >= 0) {
							if (i_468_ >= is.length) {
								break;
							}
							int i_469_ = anInt8547;
							int i_470_ = anInt8570;
							int i_471_ = anInt8571;
							int i_472_ = anInt8572;
							if (i_470_ >= 0 && i_471_ >= 0 && i_470_ - (width << 12) < 0 && i_471_ - (height << 12) < 0) {
								int i_473_ = is[i_468_] - i;
								int i_474_ = -is_464_[i_468_];
								int i_475_ = i_473_ - (i_469_ - anInt8547);
								if (i_475_ > 0) {
									i_469_ += i_475_;
									i_472_ += i_475_;
									i_470_ += anInt8564 * i_475_;
									i_471_ += anInt8576 * i_475_;
								} else {
									i_474_ -= i_475_;
								}
								if (i_472_ < i_474_) {
									i_472_ = i_474_;
								}
								for (; i_472_ < 0; i_472_++) {
									int i_476_ = raster[(i_471_ >> 12) * width + (i_470_ >> 12)];
									if (i_476_ != 0) {
										is_466_[i_469_++] = palette[i_476_ & 0xff];
									} else {
										i_469_++;
									}
								}
							}
						}
						i_467_++;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_477_ = anInt8561;
					while (i_477_ < 0) {
						int i_478_ = i_477_ + i_465_;
						if (i_478_ >= 0) {
							if (i_478_ >= is.length) {
								break;
							}
							int i_479_ = anInt8547;
							int i_480_ = anInt8570;
							int i_481_ = anInt8571 + anInt8574;
							int i_482_ = anInt8572;
							if (i_480_ >= 0 && i_480_ - (width << 12) < 0) {
								int i_483_;
								if ((i_483_ = i_481_ - (height << 12)) >= 0) {
									i_483_ = (anInt8576 - i_483_) / anInt8576;
									i_482_ += i_483_;
									i_481_ += anInt8576 * i_483_;
									i_479_ += i_483_;
								}
								if ((i_483_ = (i_481_ - anInt8576) / anInt8576) > i_482_) {
									i_482_ = i_483_;
								}
								int i_484_ = is[i_478_] - i;
								int i_485_ = -is_464_[i_478_];
								int i_486_ = i_484_ - (i_479_ - anInt8547);
								if (i_486_ > 0) {
									i_479_ += i_486_;
									i_482_ += i_486_;
									i_480_ += anInt8564 * i_486_;
									i_481_ += anInt8576 * i_486_;
								} else {
									i_485_ -= i_486_;
								}
								if (i_482_ < i_485_) {
									i_482_ = i_485_;
								}
								for (; i_482_ < 0; i_482_++) {
									int i_487_ = raster[(i_481_ >> 12) * width + (i_480_ >> 12)];
									if (i_487_ != 0) {
										is_466_[i_479_++] = palette[i_487_ & 0xff];
									} else {
										i_479_++;
									}
									i_481_ += anInt8576;
								}
							}
						}
						i_477_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				} else {
					int i_488_ = anInt8561;
					while (i_488_ < 0) {
						int i_489_ = i_488_ + i_465_;
						if (i_489_ >= 0) {
							if (i_489_ >= is.length) {
								break;
							}
							int i_490_ = anInt8547;
							int i_491_ = anInt8570;
							int i_492_ = anInt8571 + anInt8574;
							int i_493_ = anInt8572;
							if (i_491_ >= 0 && i_491_ - (width << 12) < 0) {
								if (i_492_ < 0) {
									int i_494_ = (anInt8576 - 1 - i_492_) / anInt8576;
									i_493_ += i_494_;
									i_492_ += anInt8576 * i_494_;
									i_490_ += i_494_;
								}
								int i_495_;
								if ((i_495_ = (1 + i_492_ - (height << 12) - anInt8576) / anInt8576) > i_493_) {
									i_493_ = i_495_;
								}
								int i_496_ = is[i_489_] - i;
								int i_497_ = -is_464_[i_489_];
								int i_498_ = i_496_ - (i_490_ - anInt8547);
								if (i_498_ > 0) {
									i_490_ += i_498_;
									i_493_ += i_498_;
									i_491_ += anInt8564 * i_498_;
									i_492_ += anInt8576 * i_498_;
								} else {
									i_497_ -= i_498_;
								}
								if (i_493_ < i_497_) {
									i_493_ = i_497_;
								}
								for (; i_493_ < 0; i_493_++) {
									int i_499_ = raster[(i_492_ >> 12) * width + (i_491_ >> 12)];
									if (i_499_ != 0) {
										is_466_[i_490_++] = palette[i_499_ & 0xff];
									} else {
										i_490_++;
									}
									i_492_ += anInt8576;
								}
							}
						}
						i_488_++;
						anInt8570 += anInt8566;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8564 < 0) {
				if (anInt8576 == 0) {
					int i_500_ = anInt8561;
					while (i_500_ < 0) {
						int i_501_ = i_500_ + i_465_;
						if (i_501_ >= 0) {
							if (i_501_ >= is.length) {
								break;
							}
							int i_502_ = anInt8547;
							int i_503_ = anInt8570 + anInt8573;
							int i_504_ = anInt8571;
							int i_505_ = anInt8572;
							if (i_504_ >= 0 && i_504_ - (height << 12) < 0) {
								int i_506_;
								if ((i_506_ = i_503_ - (width << 12)) >= 0) {
									i_506_ = (anInt8564 - i_506_) / anInt8564;
									i_505_ += i_506_;
									i_503_ += anInt8564 * i_506_;
									i_502_ += i_506_;
								}
								if ((i_506_ = (i_503_ - anInt8564) / anInt8564) > i_505_) {
									i_505_ = i_506_;
								}
								int i_507_ = is[i_501_] - i;
								int i_508_ = -is_464_[i_501_];
								int i_509_ = i_507_ - (i_502_ - anInt8547);
								if (i_509_ > 0) {
									i_502_ += i_509_;
									i_505_ += i_509_;
									i_503_ += anInt8564 * i_509_;
									i_504_ += anInt8576 * i_509_;
								} else {
									i_508_ -= i_509_;
								}
								if (i_505_ < i_508_) {
									i_505_ = i_508_;
								}
								for (; i_505_ < 0; i_505_++) {
									int i_510_ = raster[(i_504_ >> 12) * width + (i_503_ >> 12)];
									if (i_510_ != 0) {
										is_466_[i_502_++] = palette[i_510_ & 0xff];
									} else {
										i_502_++;
									}
									i_503_ += anInt8564;
								}
							}
						}
						i_500_++;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else if (anInt8576 < 0) {
					int i_511_ = anInt8561;
					while (i_511_ < 0) {
						int i_512_ = i_511_ + i_465_;
						if (i_512_ >= 0) {
							if (i_512_ >= is.length) {
								break;
							}
							int i_513_ = anInt8547;
							int i_514_ = anInt8570 + anInt8573;
							int i_515_ = anInt8571 + anInt8574;
							int i_516_ = anInt8572;
							int i_517_;
							if ((i_517_ = i_514_ - (width << 12)) >= 0) {
								i_517_ = (anInt8564 - i_517_) / anInt8564;
								i_516_ += i_517_;
								i_514_ += anInt8564 * i_517_;
								i_515_ += anInt8576 * i_517_;
								i_513_ += i_517_;
							}
							if ((i_517_ = (i_514_ - anInt8564) / anInt8564) > i_516_) {
								i_516_ = i_517_;
							}
							if ((i_517_ = i_515_ - (height << 12)) >= 0) {
								i_517_ = (anInt8576 - i_517_) / anInt8576;
								i_516_ += i_517_;
								i_514_ += anInt8564 * i_517_;
								i_515_ += anInt8576 * i_517_;
								i_513_ += i_517_;
							}
							if ((i_517_ = (i_515_ - anInt8576) / anInt8576) > i_516_) {
								i_516_ = i_517_;
							}
							int i_518_ = is[i_512_] - i;
							int i_519_ = -is_464_[i_512_];
							int i_520_ = i_518_ - (i_513_ - anInt8547);
							if (i_520_ > 0) {
								i_513_ += i_520_;
								i_516_ += i_520_;
								i_514_ += anInt8564 * i_520_;
								i_515_ += anInt8576 * i_520_;
							} else {
								i_519_ -= i_520_;
							}
							if (i_516_ < i_519_) {
								i_516_ = i_519_;
							}
							for (; i_516_ < 0; i_516_++) {
								int i_521_ = raster[(i_515_ >> 12) * width + (i_514_ >> 12)];
								if (i_521_ != 0) {
									is_466_[i_513_++] = palette[i_521_ & 0xff];
								} else {
									i_513_++;
								}
								i_514_ += anInt8564;
								i_515_ += anInt8576;
							}
						}
						i_511_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				} else {
					int i_522_ = anInt8561;
					while (i_522_ < 0) {
						int i_523_ = i_522_ + i_465_;
						if (i_523_ >= 0) {
							if (i_523_ >= is.length) {
								break;
							}
							int i_524_ = anInt8547;
							int i_525_ = anInt8570 + anInt8573;
							int i_526_ = anInt8571 + anInt8574;
							int i_527_ = anInt8572;
							int i_528_;
							if ((i_528_ = i_525_ - (width << 12)) >= 0) {
								i_528_ = (anInt8564 - i_528_) / anInt8564;
								i_527_ += i_528_;
								i_525_ += anInt8564 * i_528_;
								i_526_ += anInt8576 * i_528_;
								i_524_ += i_528_;
							}
							if ((i_528_ = (i_525_ - anInt8564) / anInt8564) > i_527_) {
								i_527_ = i_528_;
							}
							if (i_526_ < 0) {
								i_528_ = (anInt8576 - 1 - i_526_) / anInt8576;
								i_527_ += i_528_;
								i_525_ += anInt8564 * i_528_;
								i_526_ += anInt8576 * i_528_;
								i_524_ += i_528_;
							}
							if ((i_528_ = (1 + i_526_ - (height << 12) - anInt8576) / anInt8576) > i_527_) {
								i_527_ = i_528_;
							}
							int i_529_ = is[i_523_] - i;
							int i_530_ = -is_464_[i_523_];
							int i_531_ = i_529_ - (i_524_ - anInt8547);
							if (i_531_ > 0) {
								i_524_ += i_531_;
								i_527_ += i_531_;
								i_525_ += anInt8564 * i_531_;
								i_526_ += anInt8576 * i_531_;
							} else {
								i_530_ -= i_531_;
							}
							if (i_527_ < i_530_) {
								i_527_ = i_530_;
							}
							for (; i_527_ < 0; i_527_++) {
								int i_532_ = raster[(i_526_ >> 12) * width + (i_525_ >> 12)];
								if (i_532_ != 0) {
									is_466_[i_524_++] = palette[i_532_ & 0xff];
								} else {
									i_524_++;
								}
								i_525_ += anInt8564;
								i_526_ += anInt8576;
							}
						}
						i_522_++;
						anInt8570 += anInt8566;
						anInt8571 += anInt8567;
						anInt8547 += anInt8559;
					}
				}
			} else if (anInt8576 == 0) {
				int i_533_ = anInt8561;
				while (i_533_ < 0) {
					int i_534_ = i_533_ + i_465_;
					if (i_534_ >= 0) {
						if (i_534_ >= is.length) {
							break;
						}
						int i_535_ = anInt8547;
						int i_536_ = anInt8570 + anInt8573;
						int i_537_ = anInt8571;
						int i_538_ = anInt8572;
						if (i_537_ >= 0 && i_537_ - (height << 12) < 0) {
							if (i_536_ < 0) {
								int i_539_ = (anInt8564 - 1 - i_536_) / anInt8564;
								i_538_ += i_539_;
								i_536_ += anInt8564 * i_539_;
								i_535_ += i_539_;
							}
							int i_540_;
							if ((i_540_ = (1 + i_536_ - (width << 12) - anInt8564) / anInt8564) > i_538_) {
								i_538_ = i_540_;
							}
							int i_541_ = is[i_534_] - i;
							int i_542_ = -is_464_[i_534_];
							int i_543_ = i_541_ - (i_535_ - anInt8547);
							if (i_543_ > 0) {
								i_535_ += i_543_;
								i_538_ += i_543_;
								i_536_ += anInt8564 * i_543_;
								i_537_ += anInt8576 * i_543_;
							} else {
								i_542_ -= i_543_;
							}
							if (i_538_ < i_542_) {
								i_538_ = i_542_;
							}
							for (; i_538_ < 0; i_538_++) {
								int i_544_ = raster[(i_537_ >> 12) * width + (i_536_ >> 12)];
								if (i_544_ != 0) {
									is_466_[i_535_++] = palette[i_544_ & 0xff];
								} else {
									i_535_++;
								}
								i_536_ += anInt8564;
							}
						}
					}
					i_533_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else if (anInt8576 < 0) {
				int i_545_ = anInt8561;
				while (i_545_ < 0) {
					int i_546_ = i_545_ + i_465_;
					if (i_546_ >= 0) {
						if (i_546_ >= is.length) {
							break;
						}
						int i_547_ = anInt8547;
						int i_548_ = anInt8570 + anInt8573;
						int i_549_ = anInt8571 + anInt8574;
						int i_550_ = anInt8572;
						if (i_548_ < 0) {
							int i_551_ = (anInt8564 - 1 - i_548_) / anInt8564;
							i_550_ += i_551_;
							i_548_ += anInt8564 * i_551_;
							i_549_ += anInt8576 * i_551_;
							i_547_ += i_551_;
						}
						int i_552_;
						if ((i_552_ = (1 + i_548_ - (width << 12) - anInt8564) / anInt8564) > i_550_) {
							i_550_ = i_552_;
						}
						if ((i_552_ = i_549_ - (height << 12)) >= 0) {
							i_552_ = (anInt8576 - i_552_) / anInt8576;
							i_550_ += i_552_;
							i_548_ += anInt8564 * i_552_;
							i_549_ += anInt8576 * i_552_;
							i_547_ += i_552_;
						}
						if ((i_552_ = (i_549_ - anInt8576) / anInt8576) > i_550_) {
							i_550_ = i_552_;
						}
						int i_553_ = is[i_546_] - i;
						int i_554_ = -is_464_[i_546_];
						int i_555_ = i_553_ - (i_547_ - anInt8547);
						if (i_555_ > 0) {
							i_547_ += i_555_;
							i_550_ += i_555_;
							i_548_ += anInt8564 * i_555_;
							i_549_ += anInt8576 * i_555_;
						} else {
							i_554_ -= i_555_;
						}
						if (i_550_ < i_554_) {
							i_550_ = i_554_;
						}
						for (; i_550_ < 0; i_550_++) {
							int i_556_ = raster[(i_549_ >> 12) * width + (i_548_ >> 12)];
							if (i_556_ != 0) {
								is_466_[i_547_++] = palette[i_556_ & 0xff];
							} else {
								i_547_++;
							}
							i_548_ += anInt8564;
							i_549_ += anInt8576;
						}
					}
					i_545_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			} else {
				int i_557_ = anInt8561;
				while (i_557_ < 0) {
					int i_558_ = i_557_ + i_465_;
					if (i_558_ >= 0) {
						if (i_558_ >= is.length) {
							break;
						}
						int i_559_ = anInt8547;
						int i_560_ = anInt8570 + anInt8573;
						int i_561_ = anInt8571 + anInt8574;
						int i_562_ = anInt8572;
						if (i_560_ < 0) {
							int i_563_ = (anInt8564 - 1 - i_560_) / anInt8564;
							i_562_ += i_563_;
							i_560_ += anInt8564 * i_563_;
							i_561_ += anInt8576 * i_563_;
							i_559_ += i_563_;
						}
						int i_564_;
						if ((i_564_ = (1 + i_560_ - (width << 12) - anInt8564) / anInt8564) > i_562_) {
							i_562_ = i_564_;
						}
						if (i_561_ < 0) {
							i_564_ = (anInt8576 - 1 - i_561_) / anInt8576;
							i_562_ += i_564_;
							i_560_ += anInt8564 * i_564_;
							i_561_ += anInt8576 * i_564_;
							i_559_ += i_564_;
						}
						if ((i_564_ = (1 + i_561_ - (height << 12) - anInt8576) / anInt8576) > i_562_) {
							i_562_ = i_564_;
						}
						int i_565_ = is[i_558_] - i;
						int i_566_ = -is_464_[i_558_];
						int i_567_ = i_565_ - (i_559_ - anInt8547);
						if (i_567_ > 0) {
							i_559_ += i_567_;
							i_562_ += i_567_;
							i_560_ += anInt8564 * i_567_;
							i_561_ += anInt8576 * i_567_;
						} else {
							i_566_ -= i_567_;
						}
						if (i_562_ < i_566_) {
							i_562_ = i_566_;
						}
						for (; i_562_ < 0; i_562_++) {
							int i_568_ = raster[(i_561_ >> 12) * width + (i_560_ >> 12)];
							if (i_568_ != 0) {
								is_466_[i_559_++] = palette[i_568_ & 0xff];
							} else {
								i_559_++;
							}
							i_560_ += anInt8564;
							i_561_ += anInt8576;
						}
					}
					i_557_++;
					anInt8570 += anInt8566;
					anInt8571 += anInt8567;
					anInt8547 += anInt8559;
				}
			}
		}
	}

	@Override
	void method2083(int i, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_) {
		if (toolkit.method14100()) {
			throw new IllegalStateException();
		}
		if (i_6_ > 0 && i_7_ > 0) {
			int[] is = toolkit.anIntArray8797;
			if (is != null) {
				int i_12_ = 0;
				int i_13_ = 0;
				int i_14_ = toolkit.displayWidth * 464577083;
				int i_15_ = offsetX + width + deltaWidth;
				int i_16_ = offsetY + height + deltaHeight;
				int i_17_ = (i_15_ << 16) / i_6_;
				int i_18_ = (i_16_ << 16) / i_7_;
				if (offsetX > 0) {
					int i_19_ = ((offsetX << 16) + i_17_ - 1) / i_17_;
					i += i_19_;
					i_12_ += i_19_ * i_17_ - (offsetX << 16);
				}
				if (offsetY > 0) {
					int i_20_ = ((offsetY << 16) + i_18_ - 1) / i_18_;
					i_5_ += i_20_;
					i_13_ += i_20_ * i_18_ - (offsetY << 16);
				}
				if (width < i_15_) {
					i_6_ = ((width << 16) - i_12_ + i_17_ - 1) / i_17_;
				}
				if (height < i_16_) {
					i_7_ = ((height << 16) - i_13_ + i_18_ - 1) / i_18_;
				}
				int i_21_ = i + i_5_ * i_14_;
				int i_22_ = i_14_ - i_6_;
				if (i_5_ + i_7_ > toolkit.topClip * -68852597) {
					i_7_ -= i_5_ + i_7_ - toolkit.topClip * -68852597;
				}
				if (i_5_ < toolkit.bottomClip * 1163397961) {
					int i_23_ = toolkit.bottomClip * 1163397961 - i_5_;
					i_7_ -= i_23_;
					i_21_ += i_23_ * i_14_;
					i_13_ += i_18_ * i_23_;
				}
				if (i + i_6_ > toolkit.rightClip * -1451559971) {
					int i_24_ = i + i_6_ - toolkit.rightClip * -1451559971;
					i_6_ -= i_24_;
					i_22_ += i_24_;
				}
				if (i < toolkit.leftClip * 113391253) {
					int i_25_ = toolkit.leftClip * 113391253 - i;
					i_6_ -= i_25_;
					i_21_ += i_25_;
					i_12_ += i_17_ * i_25_;
					i_22_ += i_25_;
				}
				if (i_10_ == 0) {
					if (i_8_ == 1) {
						int i_26_ = i_12_;
						for (int i_27_ = -i_7_; i_27_ < 0; i_27_++) {
							int i_28_ = (i_13_ >> 16) * width;
							for (int i_29_ = -i_6_; i_29_ < 0; i_29_++) {
								is[i_21_++] = palette[raster[(i_12_ >> 16) + i_28_] & 0xff];
								i_12_ += i_17_;
							}
							i_13_ += i_18_;
							i_12_ = i_26_;
							i_21_ += i_22_;
						}
					} else if (i_8_ == 0) {
						int i_30_ = (i_9_ & 0xff0000) >> 16;
						int i_31_ = (i_9_ & 0xff00) >> 8;
						int i_32_ = i_9_ & 0xff;
						int i_33_ = i_12_;
						for (int i_34_ = -i_7_; i_34_ < 0; i_34_++) {
							int i_35_ = (i_13_ >> 16) * width;
							for (int i_36_ = -i_6_; i_36_ < 0; i_36_++) {
								int i_37_ = palette[raster[(i_12_ >> 16) + i_35_] & 0xff];
								int i_38_ = (i_37_ & 0xff0000) * i_30_ & ~0xffffff;
								int i_39_ = (i_37_ & 0xff00) * i_31_ & 0xff0000;
								int i_40_ = (i_37_ & 0xff) * i_32_ & 0xff00;
								is[i_21_++] = (i_38_ | i_39_ | i_40_) >>> 8;
								i_12_ += i_17_;
							}
							i_13_ += i_18_;
							i_12_ = i_33_;
							i_21_ += i_22_;
						}
					} else if (i_8_ == 3) {
						int i_41_ = i_12_;
						for (int i_42_ = -i_7_; i_42_ < 0; i_42_++) {
							int i_43_ = (i_13_ >> 16) * width;
							for (int i_44_ = -i_6_; i_44_ < 0; i_44_++) {
								byte i_45_ = raster[(i_12_ >> 16) + i_43_];
								int i_46_ = i_45_ > 0 ? palette[i_45_] : 0;
								int i_47_ = i_46_ + i_9_;
								int i_48_ = (i_46_ & 0xff00ff) + (i_9_ & 0xff00ff);
								int i_49_ = (i_48_ & 0x1000100) + (i_47_ - i_48_ & 0x10000);
								is[i_21_++] = i_47_ - i_49_ | i_49_ - (i_49_ >>> 8);
								i_12_ += i_17_;
							}
							i_13_ += i_18_;
							i_12_ = i_41_;
							i_21_ += i_22_;
						}
					} else if (i_8_ == 2) {
						int i_50_ = i_9_ >>> 24;
						int i_51_ = 256 - i_50_;
						int i_52_ = (i_9_ & 0xff00ff) * i_51_ & ~0xff00ff;
						int i_53_ = (i_9_ & 0xff00) * i_51_ & 0xff0000;
						i_9_ = (i_52_ | i_53_) >>> 8;
						int i_54_ = i_12_;
						for (int i_55_ = -i_7_; i_55_ < 0; i_55_++) {
							int i_56_ = (i_13_ >> 16) * width;
							for (int i_57_ = -i_6_; i_57_ < 0; i_57_++) {
								int i_58_ = palette[raster[(i_12_ >> 16) + i_56_] & 0xff];
								i_52_ = (i_58_ & 0xff00ff) * i_50_ & ~0xff00ff;
								i_53_ = (i_58_ & 0xff00) * i_50_ & 0xff0000;
								is[i_21_++] = ((i_52_ | i_53_) >>> 8) + i_9_;
								i_12_ += i_17_;
							}
							i_13_ += i_18_;
							i_12_ = i_54_;
							i_21_ += i_22_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_10_ == 1) {
					if (i_8_ == 1) {
						int i_59_ = i_12_;
						for (int i_60_ = -i_7_; i_60_ < 0; i_60_++) {
							int i_61_ = (i_13_ >> 16) * width;
							for (int i_62_ = -i_6_; i_62_ < 0; i_62_++) {
								int i_63_ = raster[(i_12_ >> 16) + i_61_];
								if (i_63_ != 0) {
									is[i_21_++] = palette[i_63_ & 0xff];
								} else {
									i_21_++;
								}
								i_12_ += i_17_;
							}
							i_13_ += i_18_;
							i_12_ = i_59_;
							i_21_ += i_22_;
						}
					} else if (i_8_ == 0) {
						int i_64_ = i_12_;
						if ((i_9_ & 0xffffff) == 16777215) {
							int i_65_ = i_9_ >>> 24;
							int i_66_ = 256 - i_65_;
							for (int i_67_ = -i_7_; i_67_ < 0; i_67_++) {
								int i_68_ = (i_13_ >> 16) * width;
								for (int i_69_ = -i_6_; i_69_ < 0; i_69_++) {
									int i_70_ = raster[(i_12_ >> 16) + i_68_];
									if (i_70_ != 0) {
										int i_71_ = palette[i_70_ & 0xff];
										int i_72_ = is[i_21_];
										is[i_21_++] = ((i_71_ & 0xff00ff) * i_65_ + (i_72_ & 0xff00ff) * i_66_ & ~0xff00ff)
												+ ((i_71_ & 0xff00) * i_65_ + (i_72_ & 0xff00) * i_66_ & 0xff0000) >> 8;
									} else {
										i_21_++;
									}
									i_12_ += i_17_;
								}
								i_13_ += i_18_;
								i_12_ = i_64_;
								i_21_ += i_22_;
							}
						} else {
							int i_73_ = (i_9_ & 0xff0000) >> 16;
							int i_74_ = (i_9_ & 0xff00) >> 8;
							int i_75_ = i_9_ & 0xff;
							int i_76_ = i_9_ >>> 24;
							int i_77_ = 256 - i_76_;
							for (int i_78_ = -i_7_; i_78_ < 0; i_78_++) {
								int i_79_ = (i_13_ >> 16) * width;
								for (int i_80_ = -i_6_; i_80_ < 0; i_80_++) {
									int i_81_ = raster[(i_12_ >> 16) + i_79_];
									if (i_81_ != 0) {
										int i_82_ = palette[i_81_ & 0xff];
										if (i_76_ != 255) {
											int i_83_ = (i_82_ & 0xff0000) * i_73_ & ~0xffffff;
											int i_84_ = (i_82_ & 0xff00) * i_74_ & 0xff0000;
											int i_85_ = (i_82_ & 0xff) * i_75_ & 0xff00;
											i_82_ = (i_83_ | i_84_ | i_85_) >>> 8;
											int i_86_ = is[i_21_];
											is[i_21_++] = ((i_82_ & 0xff00ff) * i_76_ + (i_86_ & 0xff00ff) * i_77_ & ~0xff00ff)
													+ ((i_82_ & 0xff00) * i_76_ + (i_86_ & 0xff00) * i_77_ & 0xff0000) >> 8;
										} else {
											int i_87_ = (i_82_ & 0xff0000) * i_73_ & ~0xffffff;
											int i_88_ = (i_82_ & 0xff00) * i_74_ & 0xff0000;
											int i_89_ = (i_82_ & 0xff) * i_75_ & 0xff00;
											is[i_21_++] = (i_87_ | i_88_ | i_89_) >>> 8;
										}
									} else {
										i_21_++;
									}
									i_12_ += i_17_;
								}
								i_13_ += i_18_;
								i_12_ = i_64_;
								i_21_ += i_22_;
							}
						}
					} else if (i_8_ == 3) {
						int i_90_ = i_12_;
						int i_91_ = i_9_ >>> 24;
						int i_92_ = 256 - i_91_;
						for (int i_93_ = -i_7_; i_93_ < 0; i_93_++) {
							int i_94_ = (i_13_ >> 16) * width;
							for (int i_95_ = -i_6_; i_95_ < 0; i_95_++) {
								byte i_96_ = raster[(i_12_ >> 16) + i_94_];
								int i_97_ = i_96_ > 0 ? palette[i_96_] : 0;
								int i_98_ = i_97_ + i_9_;
								int i_99_ = (i_97_ & 0xff00ff) + (i_9_ & 0xff00ff);
								int i_100_ = (i_99_ & 0x1000100) + (i_98_ - i_99_ & 0x10000);
								i_100_ = i_98_ - i_100_ | i_100_ - (i_100_ >>> 8);
								if (i_97_ == 0 && i_91_ != 255) {
									i_97_ = i_100_;
									i_100_ = is[i_21_];
									i_100_ = ((i_97_ & 0xff00ff) * i_91_ + (i_100_ & 0xff00ff) * i_92_ & ~0xff00ff)
											+ ((i_97_ & 0xff00) * i_91_ + (i_100_ & 0xff00) * i_92_ & 0xff0000) >> 8;
								}
								is[i_21_++] = i_100_;
								i_12_ += i_17_;
							}
							i_13_ += i_18_;
							i_12_ = i_90_;
							i_21_ += i_22_;
						}
					} else if (i_8_ == 2) {
						int i_101_ = i_9_ >>> 24;
						int i_102_ = 256 - i_101_;
						int i_103_ = (i_9_ & 0xff00ff) * i_102_ & ~0xff00ff;
						int i_104_ = (i_9_ & 0xff00) * i_102_ & 0xff0000;
						i_9_ = (i_103_ | i_104_) >>> 8;
						int i_105_ = i_12_;
						for (int i_106_ = -i_7_; i_106_ < 0; i_106_++) {
							int i_107_ = (i_13_ >> 16) * width;
							for (int i_108_ = -i_6_; i_108_ < 0; i_108_++) {
								int i_109_ = raster[(i_12_ >> 16) + i_107_];
								if (i_109_ != 0) {
									int i_110_ = palette[i_109_ & 0xff];
									i_103_ = (i_110_ & 0xff00ff) * i_101_ & ~0xff00ff;
									i_104_ = (i_110_ & 0xff00) * i_101_ & 0xff0000;
									is[i_21_++] = ((i_103_ | i_104_) >>> 8) + i_9_;
								} else {
									i_21_++;
								}
								i_12_ += i_17_;
							}
							i_13_ += i_18_;
							i_12_ = i_105_;
							i_21_ += i_22_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else if (i_10_ == 2) {
					if (i_8_ == 1) {
						int i_111_ = i_12_;
						for (int i_112_ = -i_7_; i_112_ < 0; i_112_++) {
							int i_113_ = (i_13_ >> 16) * width;
							for (int i_114_ = -i_6_; i_114_ < 0; i_114_++) {
								int i_115_ = raster[(i_12_ >> 16) + i_113_];
								if (i_115_ != 0) {
									int i_116_ = palette[i_115_ & 0xff];
									int i_117_ = is[i_21_];
									int i_118_ = i_116_ + i_117_;
									int i_119_ = (i_116_ & 0xff00ff) + (i_117_ & 0xff00ff);
									i_117_ = (i_119_ & 0x1000100) + (i_118_ - i_119_ & 0x10000);
									is[i_21_++] = i_118_ - i_117_ | i_117_ - (i_117_ >>> 8);
								} else {
									i_21_++;
								}
								i_12_ += i_17_;
							}
							i_13_ += i_18_;
							i_12_ = i_111_;
							i_21_ += i_22_;
						}
					} else if (i_8_ == 0) {
						int i_120_ = i_12_;
						int i_121_ = (i_9_ & 0xff0000) >> 16;
						int i_122_ = (i_9_ & 0xff00) >> 8;
						int i_123_ = i_9_ & 0xff;
						for (int i_124_ = -i_7_; i_124_ < 0; i_124_++) {
							int i_125_ = (i_13_ >> 16) * width;
							for (int i_126_ = -i_6_; i_126_ < 0; i_126_++) {
								int i_127_ = raster[(i_12_ >> 16) + i_125_];
								if (i_127_ != 0) {
									int i_128_ = palette[i_127_ & 0xff];
									int i_129_ = (i_128_ & 0xff0000) * i_121_ & ~0xffffff;
									int i_130_ = (i_128_ & 0xff00) * i_122_ & 0xff0000;
									int i_131_ = (i_128_ & 0xff) * i_123_ & 0xff00;
									i_128_ = (i_129_ | i_130_ | i_131_) >>> 8;
									int i_132_ = is[i_21_];
									int i_133_ = i_128_ + i_132_;
									int i_134_ = (i_128_ & 0xff00ff) + (i_132_ & 0xff00ff);
									i_132_ = (i_134_ & 0x1000100) + (i_133_ - i_134_ & 0x10000);
									is[i_21_++] = i_133_ - i_132_ | i_132_ - (i_132_ >>> 8);
								} else {
									i_21_++;
								}
								i_12_ += i_17_;
							}
							i_13_ += i_18_;
							i_12_ = i_120_;
							i_21_ += i_22_;
						}
					} else if (i_8_ == 3) {
						int i_135_ = i_12_;
						for (int i_136_ = -i_7_; i_136_ < 0; i_136_++) {
							int i_137_ = (i_13_ >> 16) * width;
							for (int i_138_ = -i_6_; i_138_ < 0; i_138_++) {
								byte i_139_ = raster[(i_12_ >> 16) + i_137_];
								int i_140_ = i_139_ > 0 ? palette[i_139_] : 0;
								int i_141_ = i_140_ + i_9_;
								int i_142_ = (i_140_ & 0xff00ff) + (i_9_ & 0xff00ff);
								int i_143_ = (i_142_ & 0x1000100) + (i_141_ - i_142_ & 0x10000);
								i_140_ = i_141_ - i_143_ | i_143_ - (i_143_ >>> 8);
								i_143_ = is[i_21_];
								i_141_ = i_140_ + i_143_;
								i_142_ = (i_140_ & 0xff00ff) + (i_143_ & 0xff00ff);
								i_143_ = (i_142_ & 0x1000100) + (i_141_ - i_142_ & 0x10000);
								is[i_21_++] = i_141_ - i_143_ | i_143_ - (i_143_ >>> 8);
								i_12_ += i_17_;
							}
							i_13_ += i_18_;
							i_12_ = i_135_;
							i_21_ += i_22_;
						}
					} else if (i_8_ == 2) {
						int i_144_ = i_9_ >>> 24;
						int i_145_ = 256 - i_144_;
						int i_146_ = (i_9_ & 0xff00ff) * i_145_ & ~0xff00ff;
						int i_147_ = (i_9_ & 0xff00) * i_145_ & 0xff0000;
						i_9_ = (i_146_ | i_147_) >>> 8;
						int i_148_ = i_12_;
						for (int i_149_ = -i_7_; i_149_ < 0; i_149_++) {
							int i_150_ = (i_13_ >> 16) * width;
							for (int i_151_ = -i_6_; i_151_ < 0; i_151_++) {
								int i_152_ = raster[(i_12_ >> 16) + i_150_];
								if (i_152_ != 0) {
									int i_153_ = palette[i_152_ & 0xff];
									i_146_ = (i_153_ & 0xff00ff) * i_144_ & ~0xff00ff;
									i_147_ = (i_153_ & 0xff00) * i_144_ & 0xff0000;
									i_153_ = ((i_146_ | i_147_) >>> 8) + i_9_;
									int i_154_ = is[i_21_];
									int i_155_ = i_153_ + i_154_;
									int i_156_ = (i_153_ & 0xff00ff) + (i_154_ & 0xff00ff);
									i_154_ = (i_156_ & 0x1000100) + (i_155_ - i_156_ & 0x10000);
									is[i_21_++] = i_155_ - i_154_ | i_154_ - (i_154_ >>> 8);
								} else {
									i_21_++;
								}
								i_12_ += i_17_;
							}
							i_13_ += i_18_;
							i_12_ = i_148_;
							i_21_ += i_22_;
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
