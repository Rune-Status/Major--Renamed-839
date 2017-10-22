package com.jagex;

import java.awt.Canvas;

public class JavaToolkit extends Toolkit {

	public static Toolkit create(Canvas canvas, TextureMetricsList class147, Interface19 interface19,
			BillboardLoader interface41, ParticleProducerDefinitionLoader interface42, Interface44 interface44,
			int width, int height) {
		return new JavaToolkit(canvas, class147, interface19, interface41, interface42, interface44, width, height);
	}

	static void method14153(int i, int i_597_, int i_598_, int i_599_, int i_600_, int i_601_, int i_602_,
			MenuOption class480_sub31_sub17, Font class132, FontSpecification class9, int i_603_, int i_604_, int i_605_) {
		if (i > i_598_ && i < i_598_ + i_600_ && i_597_ > i_602_ - class9.topPadding * -1971642963 - 1
				&& i_597_ < class9.bottomPadding * -1569538073 + i_602_ && class480_sub31_sub17.aBool11412) {
			i_603_ = i_604_;
		}
		int[] is = Widget.method4318(class480_sub31_sub17);
		String string = Class589.method9918(class480_sub31_sub17);
		if (null != is) {
			string = new StringBuilder().append(string).append(UrlResourceRequest.method1572(is)).toString();
		}
		class132.method2326(string, i_598_ + 3, i_602_, i_603_, 0, Client.aRandom10887, Class54.anInt608,
				Class368.aClass116Array4053, LruDefinitionCacheIterator.anIntArray278, 526350844);
		if (class480_sub31_sub17.aBool11417) {
			Class216.otherLevel.method2079(i_598_ + 5 + class9.textWidth(string), i_602_ - class9.topPadding
					* -1971642963);
		}
	}

	boolean aBool8796;
	boolean aBool8821 = false;
	Sprite aClass116_8823;
	Sprite aClass116_8832;
	DirectDisplay aClass146_Sub2_8833;
	ReferenceCache<Class480_Sub7> aClass168_8828;
	ReferenceCache aClass168_8829;
	Matrix4f aClass399_8812;
	Matrix4f aClass399_8814;
	Matrix4f aClass399_8819;
	Class405 aClass405_8811;
	float aFloat8794;
	float aFloat8800;
	float aFloat8808;
	float aFloat8820;
	float aFloat8824;
	float aFloat8825;
	float[] aFloatArray8801;
	float[][] aFloatArrayArray8815;
	int anInt8795;
	int anInt8798;
	int displayHeight;
	int anInt8802;
	int bottomClip;
	int topClip;
	int lightX;
	int lightY;
	int lightZ;
	int anInt8809;
	int displayWidth;
	int anInt8816;
	int anInt8817;
	int anInt8818;
	int rightClip;
	int anInt8827;
	int anInt8830;
	int leftClip;

	int[] anIntArray8797;
	int threadCount;

	JavaThreadResource[] threads;

	JavaToolkit(Canvas canvas, TextureMetricsList class147, Interface19 interface19, BillboardLoader interface41,
			ParticleProducerDefinitionLoader particleLoader, Interface44 interface44, int i, int i_439_) {
		this(class147, interface19, interface41, particleLoader, interface44);
		try {
			method2392(canvas, i, i_439_);
			method2620(canvas);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method2373();
			throw new RuntimeException("");
		}
	}

	JavaToolkit(TextureMetricsList class147, Interface19 interface19, BillboardLoader billboardLoader,
			ParticleProducerDefinitionLoader particleLoader, Interface44 interface44) {
		super(class147, interface19, billboardLoader, particleLoader, interface44);
		aBool8796 = false;
		leftClip = 0;
		rightClip = 0;
		bottomClip = 0;
		topClip = 0;
		anInt8827 = -1520010353;
		anInt8809 = 79091706;
		anInt8816 = -332158970;
		aFloatArrayArray8815 = new float[6][4];
		aFloat8824 = 1.0F;
		aFloat8825 = 0.0F;
		aClass168_8829 = new ReferenceCache(16);
		anInt8802 = -1461298283;

		try {
			aClass168_8828 = new ReferenceCache(10485760, 256);
			aClass405_8811 = new Class405();
			aClass399_8812 = new Matrix4f();
			aClass399_8819 = new Matrix4f();
			aClass399_8814 = new Matrix4f();
			allocateThreads(1);
			method14103(0);
			Class44.method1067(true, true);
			aBool8796 = true;
			anInt8795 = (int) TimeUtil.time() * 1358928927;
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method2373();
			throw new RuntimeException("");
		}
	}

	@Override
	public Model createModel(BaseModel base, int attributes, int i_217_, int i_218_, int i_219_) {
		return new JavaModel(this, base, attributes, i_218_, i_219_, i_217_);
	}

	@Override
	public Sprite createSprite(Image image, boolean indexed) {
		int width = image.getWidth();
		int height = image.getHeight();
		JavaSprite sprite;

		if (indexed && !image.hasAlpha() && image.isIndexed()) {
			IndexedImage base = (IndexedImage) image;
			int[] palette = new int[base.palette.length];
			byte[] raster = new byte[height * width];

			for (int y = 0; y < height; y++) {
				int offset = width * y;

				for (int x = 0; x < width; x++) {
					raster[x + offset] = base.raster[offset + x];
				}
			}

			for (int index = 0; index < base.palette.length; index++) {
				palette[index] = base.palette[index];
			}

			sprite = new IndexedJavaSprite(this, raster, palette, width, height);
		} else {
			int[] raster = image.argb(false);
			if (image.hasAlpha()) {
				sprite = new TransparentJavaSprite(this, raster, width, height);
			} else {
				sprite = new OpaqueJavaSprite(this, raster, width, height);
			}
		}

		sprite.setOffsets(image.getOffsetX(), image.getOffsetY(), image.getDeltaWidth(), image.getDeltaHeight());
		return sprite;
	}

	@Override
	public Sprite createSprite(int[] raster, int offset, int step, int width, int height, boolean copy) {
		boolean transparent = false;
		int index = offset;

		loop: for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int colour = raster[index++] >>> 24;

				if (colour != 0 && colour != 255) {
					transparent = true;
					break loop;
				}
			}
		}

		if (transparent) {
			return new TransparentJavaSprite(this, raster, offset, step, width, height, copy);
		}

		return new OpaqueJavaSprite(this, raster, offset, step, width, height, copy);
	}

	@Override
	public int mergeFunctionMasks(int i, int i_334_) {
		return i | i_334_;
	}

	@Override
	public void method2372() {

	}

	@Override
	public void method2375(int i) {
		int i_2_ = i - anInt8795 * 749264863;
		for (Class480_Sub7 class480_sub7 = aClass168_8828.first(); class480_sub7 != null; class480_sub7 = aClass168_8828
				.next()) {
			if (class480_sub7.aBool9993) {
				class480_sub7.anInt9992 += i_2_;
				int i_3_ = class480_sub7.anInt9992 / 50;
				if (i_3_ > 0) {
					TextureMetrics metrics = metricsList.get(class480_sub7.texture);
					float levels = metrics.length * -931821243;
					class480_sub7.method15536((int) (levels * (metrics.aByte1728 * (i_2_ / 1000.0F) / 64.0F)),
							(int) (i_2_ / 1000.0F * metrics.aByte1700 / 64.0F * levels));
					class480_sub7.anInt9992 -= i_3_ * 50;
				}
				class480_sub7.aBool9993 = false;
			}
		}

		anInt8795 = 1358928927 * i;
		aClass168_8829.sweep(5);
		aClass168_8828.sweep(5);
	}

	@Override
	public int offheapSize() {
		return 0;
	}

	@Override
	public boolean method2378() {
		return false;
	}

	@Override
	public boolean method2379() {
		return false;
	}

	@Override
	public boolean method2383() {
		return false;
	}

	@Override
	public boolean method2384() {
		return false;
	}

	@Override
	public boolean method2386() {
		return false;
	}

	@Override
	public boolean method2387() {
		return true;
	}

	@Override
	public String method2388() {
		return "";
	}

	@Override
	public void method2395(int[] is) {
		is[0] = anInt8817 * -1201443707;
		is[1] = anInt8798 * -759265545;
		is[2] = anInt8818 * -1550211773;
		is[3] = -1846721847 * anInt8830;
	}

	@Override
	public Interface16 method2401(int i, int i_36_, Class121 class121, Class151 class151, int i_37_) {
		return method14110(i, i_36_);
	}

	@Override
	public Interface17 method2403(int i, int i_174_, int i_175_) {
		return new FloatRaster(i, i_174_);
	}

	@Override
	public int[] method2404(int i, int i_11_, int i_12_, int i_13_) {
		if (anIntArray8797 == null) {
			throw new IllegalStateException("");
		}

		int[] is = new int[i_13_ * i_12_];
		int i_14_ = 0;

		for (int i_15_ = 0; i_15_ < i_13_; i_15_++) {
			int i_16_ = i + 464577083 * displayWidth * (i_15_ + i_11_);
			for (int i_17_ = 0; i_17_ < i_12_; i_17_++) {
				is[i_14_++] = anIntArray8797[i_16_ + i_17_];
			}
		}

		return is;
	}

	@Override
	public void method2405() {

	}

	@Override
	public boolean method2406() {
		return false;
	}

	@Override
	public boolean method2408() {
		return false;
	}

	@Override
	public boolean method2411() {
		return false;
	}

	@Override
	public void method2412(int i, int i_18_, int i_19_) {

	}

	@Override
	public void method2413(long l) {

	}

	@Override
	public void method2414(int i, Class150 class150) {
		for (int i_313_ = 0; i_313_ < threads.length; i_313_++) {
			threads[i_313_].anInt963 = 830901879 * threads[i_313_].fogColour;
			threads[i_313_].anInt965 = -929111717 * i;
			threads[i_313_].fogColour = -2025454993 * class150.colour;
			threads[i_313_].anInt966 = class150.scale * 336404909;
			threads[i_313_].aBool990 = true;
		}
	}

	@Override
	public void method2415(int[] is) {
		is[0] = 464577083 * displayWidth;
		is[1] = displayHeight * 762738765;
	}

	@Override
	public void method2416() {
		aClass146_Sub2_8833 = null;
		aClass116_8832 = null;
	}

	@Override
	public void method2420(float f, float f_1_) {
		aFloat8824 = f_1_ - f;
		aFloat8825 = f + f_1_ - 1.0F;

		for (int index = 0; index < -1677857107 * threadCount; index++) {
			JavaThreadResource thread = threads[index];
			Rasterizer rasterizer = thread.rasterizer;
			rasterizer.aFloat1388 = aFloat8824;
			rasterizer.aFloat1386 = aFloat8825;
		}
	}

	@Override
	public void method2421() {
		leftClip = 0;
		bottomClip = 0;
		rightClip = 1723889911 * displayWidth;
		topClip = -1304249977 * displayHeight;
		method14102();
	}

	@Override
	public void method2424(float f, float f_328_, float f_327_, float[] fs) {
		float f_329_ = f_327_ * aClass399_8814.array[7] + (f * aClass399_8814.array[3] + aClass399_8814.array[15])
				+ f_328_ * aClass399_8814.array[11];
		float f_330_ = aClass399_8814.array[0] * f + aClass399_8814.array[12] + f_327_ * aClass399_8814.array[4]
				+ aClass399_8814.array[8] * f_328_;
		float f_331_ = f_328_ * aClass399_8814.array[9]
				+ (aClass399_8814.array[13] + aClass399_8814.array[1] * f + aClass399_8814.array[5] * f_327_);
		float f_332_ = f_327_ * aClass399_8812.array[6] + (aClass399_8812.array[14] + aClass399_8812.array[2] * f)
				+ f_328_ * aClass399_8812.array[10];
		fs[0] = aFloat8794 + f_330_ * aFloat8820 / f_329_;
		fs[1] = aFloat8800 + f_331_ * aFloat8808 / f_329_;
		fs[2] = f_332_;
	}

	@Override
	public void method2425(int[] is) {
		is[0] = leftClip * 113391253;
		is[1] = 1163397961 * bottomClip;
		is[2] = -1451559971 * rightClip;
		is[3] = topClip * -68852597;
	}

	@Override
	public void method2426(int i, int i_38_) {
		if ((i & 0x1) != 0) {
			method2434(0, 0, displayWidth * 464577083, 762738765 * displayHeight, i_38_, 0);
		}
		if ((i & 0x2) != 0) {
			method14098();
		}
	}

	@Override
	public void method2434(int i, int i_44_, int i_45_, int i_46_, int i_47_, int i_48_) {
		if (anIntArray8797 != null) {
			if (i < 113391253 * leftClip) {
				i_45_ -= leftClip * 113391253 - i;
				i = leftClip * 113391253;
			}
			if (i_44_ < 1163397961 * bottomClip) {
				i_46_ -= bottomClip * 1163397961 - i_44_;
				i_44_ = 1163397961 * bottomClip;
			}
			if (i + i_45_ > rightClip * -1451559971) {
				i_45_ = -1451559971 * rightClip - i;
			}
			if (i_44_ + i_46_ > -68852597 * topClip) {
				i_46_ = topClip * -68852597 - i_44_;
			}
			if (i_45_ > 0 && i_46_ > 0 && i <= rightClip * -1451559971 && i_44_ <= -68852597 * topClip) {
				int i_49_ = 464577083 * displayWidth - i_45_;
				int i_50_ = i + 464577083 * displayWidth * i_44_;
				int i_51_ = i_47_ >>> 24;
				if (0 == i_48_ || 1 == i_48_ && 255 == i_51_) {
					int i_52_ = i_45_ >> 3;
					int i_53_ = i_45_ & 0x7;
					i_45_ = i_50_ - 1;
					for (int i_54_ = -i_46_; i_54_ < 0; i_54_++) {
						if (i_52_ > 0) {
							i = i_52_;
							do {
								anIntArray8797[++i_45_] = i_47_;
								anIntArray8797[++i_45_] = i_47_;
								anIntArray8797[++i_45_] = i_47_;
								anIntArray8797[++i_45_] = i_47_;
								anIntArray8797[++i_45_] = i_47_;
								anIntArray8797[++i_45_] = i_47_;
								anIntArray8797[++i_45_] = i_47_;
								anIntArray8797[++i_45_] = i_47_;
							} while (--i > 0);
						}
						if (i_53_ > 0) {
							i = i_53_;
							do {
								anIntArray8797[++i_45_] = i_47_;
							} while (--i > 0);
						}
						i_45_ += i_49_;
					}
				} else if (1 == i_48_) {
					i_47_ = (i_51_ * (i_47_ & 0xff00ff) >> 8 & 0xff00ff)
							+ (i_51_ * ((i_47_ & ~0xff00ff) >>> 8) & ~0xff00ff);
					int i_55_ = 256 - i_51_;
					for (int i_56_ = 0; i_56_ < i_46_; i_56_++) {
						for (int i_57_ = -i_45_; i_57_ < 0; i_57_++) {
							int i_58_ = anIntArray8797[i_50_];
							i_58_ = ((i_58_ & 0xff00ff) * i_55_ >> 8 & 0xff00ff)
									+ (((i_58_ & ~0xff00ff) >>> 8) * i_55_ & ~0xff00ff);
							anIntArray8797[i_50_++] = i_58_ + i_47_;
						}
						i_50_ += i_49_;
					}
				} else if (i_48_ == 2) {
					for (int i_59_ = 0; i_59_ < i_46_; i_59_++) {
						for (int i_60_ = -i_45_; i_60_ < 0; i_60_++) {
							int i_61_ = anIntArray8797[i_50_];
							int i_62_ = i_61_ + i_47_;
							int i_63_ = (i_61_ & 0xff00ff) + (i_47_ & 0xff00ff);
							i_61_ = (i_62_ - i_63_ & 0x10000) + (i_63_ & 0x1000100);
							anIntArray8797[i_50_++] = i_62_ - i_61_ | i_61_ - (i_61_ >>> 8);
						}
						i_50_ += i_49_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@Override
	public void method2435(int i, int i_314_, float f, int i_315_, int i_316_, float f_317_, int i_318_, int i_319_,
			float f_320_, int i_321_, int i_322_, int i_323_, int i_324_) {
		boolean bool = null != anIntArray8797;
		boolean bool_325_ = aFloatArray8801 != null;
		if (bool || bool_325_) {
			JavaThreadResource thread = getThreadResource(Thread.currentThread());
			Rasterizer class109 = thread.rasterizer;
			class109.aBool1373 = false;
			i -= leftClip * 113391253;
			i_315_ -= 113391253 * leftClip;
			i_318_ -= leftClip * 113391253;
			i_314_ -= 1163397961 * bottomClip;
			i_316_ -= bottomClip * 1163397961;
			i_319_ -= bottomClip * 1163397961;
			class109.aBool1376 = i < 0 || i > class109.anInt1395 || i_315_ < 0 || i_315_ > class109.anInt1395
					|| i_318_ < 0 || i_318_ > class109.anInt1395;
			int i_326_ = i_321_ >>> 24;
			if (i_324_ == 0 || 1 == i_324_ && i_326_ == 255) {
				class109.anInt1375 = 0;
				class109.aBool1396 = false;
				class109.method1991(bool, bool_325_, false, i_314_, i_316_, i_319_, i, i_315_, i_318_, f, f_317_,
						f_320_, i_321_, i_322_, i_323_);
			} else if (1 == i_324_) {
				class109.anInt1375 = 255 - i_326_;
				class109.aBool1396 = false;
				class109.method1991(bool, bool_325_, false, i_314_, i_316_, i_319_, i, i_315_, i_318_, f, f_317_,
						f_320_, i_321_, i_322_, i_323_);
			} else if (i_324_ == 2) {
				class109.anInt1375 = 128;
				class109.aBool1396 = true;
				class109.method1991(bool, bool_325_, false, i_314_, i_316_, i_319_, i, i_315_, i_318_, f, f_317_,
						f_320_, i_321_, i_322_, i_323_);
			} else {
				throw new IllegalArgumentException();
			}
			class109.aBool1373 = true;
		}
	}

	@Override
	public void method2440(int i, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, ClippingMask class129,
			int i_133_, int i_134_) {
		if (null != anIntArray8797) {
			JavaClippingMask class129_sub3 = (JavaClippingMask) class129;
			int[] is = class129_sub3.offsets;
			int[] is_135_ = class129_sub3.widths;
			int i_136_ = 1163397961 * bottomClip > i_134_ ? bottomClip * 1163397961 : i_134_;
			int i_137_ = -68852597 * topClip < is.length + i_134_ ? topClip * -68852597 : is.length + i_134_;
			i_129_ -= i;
			i_130_ -= i_128_;
			if (i_130_ + i_129_ < 0) {
				i += i_129_;
				i_129_ = -i_129_;
				i_128_ += i_130_;
				i_130_ = -i_130_;
			}
			if (i_129_ > i_130_) {
				i_128_ <<= 16;
				i_128_ += 32768;
				i_130_ <<= 16;
				int i_138_ = (int) Math.floor(0.5 + (double) i_130_ / (double) i_129_);
				i_129_ += i;
				if (i < leftClip * 113391253) {
					i_128_ += i_138_ * (leftClip * 113391253 - i);
					i = leftClip * 113391253;
				}
				if (i_129_ >= -1451559971 * rightClip) {
					i_129_ = rightClip * -1451559971 - 1;
				}
				int i_139_ = i_131_ >>> 24;
				if (0 == i_132_ || i_132_ == 1 && 255 == i_139_) {
					for (; i <= i_129_; i++) {
						int i_140_ = i_128_ >> 16;
						int i_141_ = i_140_ - i_134_;
						if (i_140_ >= i_136_ && i_140_ < i_137_) {
							int i_142_ = i_133_ + is[i_141_];
							if (i >= i_142_ && i < i_142_ + is_135_[i_141_]) {
								anIntArray8797[464577083 * displayWidth * i_140_ + i] = i_131_;
							}
						}
						i_128_ += i_138_;
					}
				} else if (i_132_ == 1) {
					i_131_ = (i_139_ << 24) + (i_139_ * (i_131_ & 0xff00ff) >> 8 & 0xff00ff)
							+ ((i_131_ & 0xff00) * i_139_ >> 8 & 0xff00);
					int i_143_ = 256 - i_139_;
					for (; i <= i_129_; i++) {
						int i_144_ = i_128_ >> 16;
						int i_145_ = i_144_ - i_134_;
						if (i_144_ >= i_136_ && i_144_ < i_137_) {
							int i_146_ = i_133_ + is[i_145_];
							if (i >= i_146_ && i < is_135_[i_145_] + i_146_) {
								int i_147_ = i + displayWidth * 464577083 * i_144_;
								int i_148_ = anIntArray8797[i_147_];
								i_148_ = ((i_148_ & 0xff00) * i_143_ >> 8 & 0xff00)
										+ (i_143_ * (i_148_ & 0xff00ff) >> 8 & 0xff00ff);
								anIntArray8797[i_147_] = i_148_ + i_131_;
							}
						}
						i_128_ += i_138_;
					}
				} else if (i_132_ == 2) {
					for (; i <= i_129_; i++) {
						int i_149_ = i_128_ >> 16;
						int i_150_ = i_149_ - i_134_;
						if (i_149_ >= i_136_ && i_149_ < i_137_) {
							int i_151_ = i_133_ + is[i_150_];
							if (i >= i_151_ && i < is_135_[i_150_] + i_151_) {
								int i_152_ = i + 464577083 * displayWidth * i_149_;
								int i_153_ = anIntArray8797[i_152_];
								int i_154_ = i_131_ + i_153_;
								int i_155_ = (i_131_ & 0xff00ff) + (i_153_ & 0xff00ff);
								i_153_ = (i_154_ - i_155_ & 0x10000) + (i_155_ & 0x1000100);
								anIntArray8797[i_152_] = i_154_ - i_153_ | i_153_ - (i_153_ >>> 8);
							}
						}
						i_128_ += i_138_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				i <<= 16;
				i += 32768;
				i_129_ <<= 16;
				int i_156_ = (int) Math.floor(0.5 + (double) i_129_ / (double) i_130_);
				i_130_ += i_128_;
				if (i_128_ < i_136_) {
					i += (i_136_ - i_128_) * i_156_;
					i_128_ = i_136_;
				}
				if (i_130_ >= i_137_) {
					i_130_ = i_137_ - 1;
				}
				int i_157_ = i_131_ >>> 24;
				if (i_132_ == 0 || i_132_ == 1 && 255 == i_157_) {
					for (; i_128_ <= i_130_; i_128_++) {
						int i_158_ = i >> 16;
						int i_159_ = i_128_ - i_134_;
						int i_160_ = i_133_ + is[i_159_];
						if (i_158_ >= 113391253 * leftClip && i_158_ < rightClip * -1451559971 && i_158_ >= i_160_
								&& i_158_ < is_135_[i_159_] + i_160_) {
							anIntArray8797[i_158_ + displayWidth * 464577083 * i_128_] = i_131_;
						}
						i += i_156_;
					}
				} else if (i_132_ == 1) {
					i_131_ = (i_157_ << 24) + (i_157_ * (i_131_ & 0xff00) >> 8 & 0xff00)
							+ ((i_131_ & 0xff00ff) * i_157_ >> 8 & 0xff00ff);
					int i_161_ = 256 - i_157_;
					for (; i_128_ <= i_130_; i_128_++) {
						int i_162_ = i >> 16;
						int i_163_ = i_128_ - i_134_;
						int i_164_ = is[i_163_] + i_133_;
						if (i_162_ >= leftClip * 113391253 && i_162_ < rightClip * -1451559971 && i_162_ >= i_164_
								&& i_162_ < is_135_[i_163_] + i_164_) {
							int i_165_ = 464577083 * displayWidth * i_128_ + i_162_;
							int i_166_ = anIntArray8797[i_165_];
							i_166_ = ((i_166_ & 0xff00ff) * i_161_ >> 8 & 0xff00ff)
									+ (i_161_ * (i_166_ & 0xff00) >> 8 & 0xff00);
							anIntArray8797[i_162_ + displayWidth * 464577083 * i_128_] = i_166_ + i_131_;
						}
						i += i_156_;
					}
				} else if (i_132_ == 2) {
					for (; i_128_ <= i_130_; i_128_++) {
						int i_167_ = i >> 16;
						int i_168_ = i_128_ - i_134_;
						int i_169_ = i_133_ + is[i_168_];
						if (i_167_ >= 113391253 * leftClip && i_167_ < rightClip * -1451559971 && i_167_ >= i_169_
								&& i_167_ < i_169_ + is_135_[i_168_]) {
							int i_170_ = displayWidth * 464577083 * i_128_ + i_167_;
							int i_171_ = anIntArray8797[i_170_];
							int i_172_ = i_171_ + i_131_;
							int i_173_ = (i_131_ & 0xff00ff) + (i_171_ & 0xff00ff);
							i_171_ = (i_172_ - i_173_ & 0x10000) + (i_173_ & 0x1000100);
							anIntArray8797[i_170_] = i_172_ - i_171_ | i_171_ - (i_171_ >>> 8);
						}
						i += i_156_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@Override
	public void method2441(int i, int i_89_, int i_90_, int i_91_, int i_92_, int i_93_, int i_94_, int i_95_, int i_96_) {
		if (null != anIntArray8797) {
			i_90_ -= i;
			i_91_ -= i_89_;
			if (i_91_ == 0) {
				if (i_90_ >= 0) {
					method14101(i, i_89_, i_90_ + 1, i_92_, i_93_, i_94_, i_95_, i_96_);
				} else {
					int i_97_ = i_95_ + i_94_;
					i_96_ %= i_97_;
					i_96_ = i_97_ + i_94_ - i_96_ - (-i_90_ + 1) % i_97_;
					i_96_ %= i_97_;
					if (i_96_ < 0) {
						i_96_ += i_97_;
					}
					method14101(i_90_ + i, i_89_, 1 + -i_90_, i_92_, i_93_, i_94_, i_95_, i_96_);
				}
			} else if (i_90_ == 0) {
				if (i_91_ >= 0) {
					method14133(i, i_89_, i_91_ + 1, i_92_, i_93_, i_94_, i_95_, i_96_);
				} else {
					int i_98_ = i_95_ + i_94_;
					i_96_ %= i_98_;
					i_96_ = i_94_ + i_98_ - i_96_ - (-i_91_ + 1) % i_98_;
					i_96_ %= i_98_;
					if (i_96_ < 0) {
						i_96_ += i_98_;
					}
					method14133(i, i_91_ + i_89_, -i_91_ + 1, i_92_, i_93_, i_94_, i_95_, i_96_);
				}
			} else {
				i_96_ <<= 8;
				i_94_ <<= 8;
				i_95_ <<= 8;
				int i_99_ = i_95_ + i_94_;
				i_96_ %= i_99_;
				if (i_91_ + i_90_ < 0) {
					int i_100_ = (int) (Math.sqrt(i_91_ * i_91_ + i_90_ * i_90_) * 256.0);
					int i_101_ = i_100_ % i_99_;
					i_96_ = i_99_ + i_94_ - i_96_ - i_101_;
					i_96_ %= i_99_;
					if (i_96_ < 0) {
						i_96_ += i_99_;
					}
					i += i_90_;
					i_90_ = -i_90_;
					i_89_ += i_91_;
					i_91_ = -i_91_;
				}
				if (i_90_ > i_91_) {
					i_89_ <<= 16;
					i_89_ += 32768;
					i_91_ <<= 16;
					int i_102_ = (int) Math.floor((double) i_91_ / (double) i_90_ + 0.5);
					i_90_ += i;
					int i_103_ = i_92_ >>> 24;
					int i_104_ = (int) Math.sqrt(65536 + (i_102_ >> 8) * (i_102_ >> 8));
					if (i_93_ == 0 || 1 == i_93_ && i_103_ == 255) {
						while (i <= i_90_) {
							int i_105_ = i_89_ >> 16;
							if (i >= 113391253 * leftClip && i < rightClip * -1451559971
									&& i_105_ >= 1163397961 * bottomClip && i_105_ < topClip * -68852597
									&& i_96_ < i_94_) {
								anIntArray8797[464577083 * displayWidth * i_105_ + i] = i_92_;
							}
							i_89_ += i_102_;
							i++;
							i_96_ += i_104_;
							i_96_ %= i_99_;
						}
					} else if (1 == i_93_) {
						i_92_ = (i_103_ << 24) + (i_103_ * (i_92_ & 0xff00ff) >> 8 & 0xff00ff)
								+ (i_103_ * (i_92_ & 0xff00) >> 8 & 0xff00);
						int i_106_ = 256 - i_103_;
						while (i <= i_90_) {
							int i_107_ = i_89_ >> 16;
							if (i >= leftClip * 113391253 && i < -1451559971 * rightClip
									&& i_107_ >= bottomClip * 1163397961 && i_107_ < -68852597 * topClip
									&& i_96_ < i_94_) {
								int i_108_ = displayWidth * 464577083 * i_107_ + i;
								int i_109_ = anIntArray8797[i_108_];
								i_109_ = ((i_109_ & 0xff00ff) * i_106_ >> 8 & 0xff00ff)
										+ (i_106_ * (i_109_ & 0xff00) >> 8 & 0xff00);
								anIntArray8797[i_108_] = i_92_ + i_109_;
							}
							i_89_ += i_102_;
							i++;
							i_96_ += i_104_;
							i_96_ %= i_99_;
						}
					} else if (2 == i_93_) {
						while (i <= i_90_) {
							int i_110_ = i_89_ >> 16;
							if (i >= leftClip * 113391253 && i < -1451559971 * rightClip
									&& i_110_ >= bottomClip * 1163397961 && i_110_ < topClip * -68852597
									&& i_96_ < i_94_) {
								int i_111_ = displayWidth * 464577083 * i_110_ + i;
								int i_112_ = anIntArray8797[i_111_];
								int i_113_ = i_112_ + i_92_;
								int i_114_ = (i_92_ & 0xff00ff) + (i_112_ & 0xff00ff);
								i_112_ = (i_113_ - i_114_ & 0x10000) + (i_114_ & 0x1000100);
								anIntArray8797[i_111_] = i_113_ - i_112_ | i_112_ - (i_112_ >>> 8);
							}
							i_89_ += i_102_;
							i++;
							i_96_ += i_104_;
							i_96_ %= i_99_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else {
					i <<= 16;
					i += 32768;
					i_90_ <<= 16;
					int i_115_ = (int) Math.floor((double) i_90_ / (double) i_91_ + 0.5);
					i_91_ += i_89_;
					int i_116_ = i_92_ >>> 24;
					int i_117_ = (int) Math.sqrt(65536 + (i_115_ >> 8) * (i_115_ >> 8));
					if (0 == i_93_ || 1 == i_93_ && 255 == i_116_) {
						while (i_89_ <= i_91_) {
							int i_118_ = i >> 16;
							if (i_89_ >= 1163397961 * bottomClip && i_89_ < -68852597 * topClip
									&& i_118_ >= 113391253 * leftClip && i_118_ < rightClip * -1451559971
									&& i_96_ < i_94_) {
								anIntArray8797[displayWidth * 464577083 * i_89_ + i_118_] = i_92_;
							}
							i += i_115_;
							i_89_++;
							i_96_ += i_117_;
							i_96_ %= i_99_;
						}
					} else if (i_93_ == 1) {
						i_92_ = ((i_92_ & 0xff00) * i_116_ >> 8 & 0xff00)
								+ (i_116_ * (i_92_ & 0xff00ff) >> 8 & 0xff00ff) + (i_116_ << 24);
						int i_119_ = 256 - i_116_;
						while (i_89_ <= i_91_) {
							int i_120_ = i >> 16;
							if (i_89_ >= 1163397961 * bottomClip && i_89_ < topClip * -68852597
									&& i_120_ >= 113391253 * leftClip && i_120_ < -1451559971 * rightClip
									&& i_96_ < i_94_) {
								int i_121_ = 464577083 * displayWidth * i_89_ + i_120_;
								int i_122_ = anIntArray8797[i_121_];
								i_122_ = ((i_122_ & 0xff00) * i_119_ >> 8 & 0xff00)
										+ (i_119_ * (i_122_ & 0xff00ff) >> 8 & 0xff00ff);
								anIntArray8797[i_89_ * 464577083 * displayWidth + i_120_] = i_122_ + i_92_;
							}
							i += i_115_;
							i_89_++;
							i_96_ += i_117_;
							i_96_ %= i_99_;
						}
					} else if (i_93_ == 2) {
						while (i_89_ <= i_91_) {
							int i_123_ = i >> 16;
							if (i_89_ >= bottomClip * 1163397961 && i_89_ < -68852597 * topClip
									&& i_123_ >= 113391253 * leftClip && i_123_ < rightClip * -1451559971
									&& i_96_ < i_94_) {
								int i_124_ = displayWidth * 464577083 * i_89_ + i_123_;
								int i_125_ = anIntArray8797[i_124_];
								int i_126_ = i_92_ + i_125_;
								int i_127_ = (i_125_ & 0xff00ff) + (i_92_ & 0xff00ff);
								i_125_ = (i_127_ & 0x1000100) + (i_126_ - i_127_ & 0x10000);
								anIntArray8797[i_124_] = i_126_ - i_125_ | i_125_ - (i_125_ >>> 8);
							}
							i += i_115_;
							i_89_++;
							i_96_ += i_117_;
							i_96_ %= i_99_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				}
			}
		}
	}

	@Override
	public void method2447(Class405 class405, Class139 class139, Class379 class379) {
		Matrix4f class399 = method2462();
		class399.method6548(class405);
		class399.method6547(aClass399_8814);
		class139.method2870(class379, aClass399_8819, class399, aFloat8794, aFloat8800, aFloat8820, aFloat8808);
	}

	@Override
	public Sprite createSprite(int width, int height, boolean transparent, boolean bool_181_) {
		if (transparent) {
			return new TransparentJavaSprite(this, width, height);
		}

		return new OpaqueJavaSprite(this, width, height);
	}

	@Override
	public ClippingMask createClippingMask(int width, int height, int[] offsets, int[] widths) {
		return new JavaClippingMask(offsets, widths);
	}

	@Override
	public Matrix4f method2462() {
		JavaThreadResource class64 = getThreadResource(Thread.currentThread());
		return class64.aClass399_992;
	}

	@Override
	public Class405 method2463() {
		JavaThreadResource class64 = getThreadResource(Thread.currentThread());
		return class64.aClass405_969;
	}

	@Override
	public void method2464(int i) {
		JavaModel.anInt9446 = JavaModel.anInt9445 = i;
		if (-1677857107 * threadCount > 1) {
			throw new IllegalStateException();
		}
		allocateThreads(threadCount * -1677857107);
		method14103(0);
	}

	@Override
	public boolean method2466() {
		return true;
	}

	@Override
	public void method2467(int i, ClippingMask class129, int i_204_, int i_205_) {
		if (anIntArray8797 != null) {
			JavaClippingMask class129_sub3 = (JavaClippingMask) class129;
			int[] is = class129_sub3.offsets;
			int[] is_206_ = class129_sub3.widths;
			int i_207_;
			if (topClip * -68852597 < is.length + i_205_) {
				i_207_ = -68852597 * topClip - i_205_;
			} else {
				i_207_ = is.length;
			}
			int i_208_;
			if (1163397961 * bottomClip > i_205_) {
				i_208_ = bottomClip * 1163397961 - i_205_;
				i_205_ = 1163397961 * bottomClip;
			} else {
				i_208_ = 0;
			}
			if (i_207_ - i_208_ > 0) {
				int i_209_ = 464577083 * displayWidth * i_205_;
				for (int i_210_ = i_208_; i_210_ < i_207_; i_210_++) {
					int i_211_ = is[i_210_] + i_204_;
					int i_212_ = is_206_[i_210_];
					if (leftClip * 113391253 > i_211_) {
						i_212_ -= leftClip * 113391253 - i_211_;
						i_211_ = leftClip * 113391253;
					}
					if (-1451559971 * rightClip < i_212_ + i_211_) {
						i_212_ = rightClip * -1451559971 - i_211_;
					}
					i_211_ += i_209_;
					for (int i_213_ = -i_212_; i_213_ < 0; i_213_++) {
						anIntArray8797[i_211_++] = i;
					}
					i_209_ += 464577083 * displayWidth;
				}
			}
		}
	}

	@Override
	public Ground createGround(int width, int length, int[][] heights, int[][] lighting, int units, int i_8_, int i_9_) {
		return new JavaGround(this, i_9_, width, length, heights, lighting, units);
	}

	@Override
	public void method2470(Class137 class137) {
		method14134(anIntArray8797 != null, null != aFloatArray8801, false, class137);
	}

	@Override
	public void method2471(Class405 class405) {
		aClass405_8811 = class405;
		method14109();
	}

	@Override
	public void method2473(boolean bool) {
		JavaThreadResource class64 = getThreadResource(Thread.currentThread());
		class64.aBool967 = bool;
	}

	@Override
	public void method2476(float f) {
		anInt8816 = 1336521085 * (int) (65535.0F * f);
	}

	@Override
	public void method2477(int i, float f, float f_456_, float f_457_, float f_458_, float f_459_) {
		anInt8827 = (int) (f * 65535.0F) * -1873967247;
		anInt8809 = -937997307 * (int) (65535.0F * f_456_);
		float f_460_ = (float) Math.sqrt(f_457_ * f_457_ + f_458_ * f_458_ + f_459_ * f_459_);
		lightX = (int) (f_457_ * 65535.0F / f_460_) * -68569829;
		lightY = (int) (f_458_ * 65535.0F / f_460_) * 1955594535;
		lightZ = 1113383119 * (int) (65535.0F * f_459_ / f_460_);
	}

	@Override
	public void method2478(int i) {

	}

	@Override
	public int method2480() {
		return 0;
	}

	@Override
	public PointLight createPointLight(int i, int i_220_, int i_221_, int i_222_, int i_223_, float f) {
		return null;
	}

	@Override
	public void method2482(int i, PointLight[] class480_sub23s) {

	}

	@Override
	public CubeMapTextureProvider createCubeMapTextureProvider(int id) {
		return null;
	}

	@Override
	public CubeMapTextureProvider method2484(CubeMapTextureProvider class138, CubeMapTextureProvider class138_306_,
			float f, CubeMapTextureProvider class138_307_) {
		return null;
	}

	@Override
	public void setCubeMapTextureProvider(CubeMapTextureProvider class138) {

	}

	@Override
	public void method2487(int i, int i_308_) {

	}

	@Override
	public boolean method2489() {
		return false;
	}

	@Override
	public void method2490(float f, float f_309_, float f_310_, float f_311_, float f_312_) {

	}

	@Override
	public Class118 method2491(int[] argb) {
		return null;
	}

	@Override
	public boolean method2492() {
		return false;
	}

	@Override
	public void method2493(Class118 class118, float f, Class118 class118_566_, float f_567_, Class118 class118_568_,
			float f_569_) {

	}

	@Override
	public void method2494() {
		anInt8817 = 0;
		anInt8798 = 0;
		anInt8818 = displayWidth * -1716452439;
		anInt8830 = displayHeight * -1124423835;
		method14102();
	}

	@Override
	public void method2495() {

	}

	@Override
	public boolean method2496() {
		return false;
	}

	@Override
	public int method2499() {
		return -1;
	}

	@Override
	public void method2501() {
		for (int i = 0; i < threads.length; i++) {
			threads[i].fogColour = threads[i].anInt963 * 702786375;
			threads[i].aBool990 = false;
		}
	}

	@Override
	public void method2502(float f, float f_422_, float f_421_, float[] fs) {
		float f_423_ = f_421_ * aClass399_8814.array[6] + (aClass399_8814.array[14] + aClass399_8814.array[2] * f)
				+ f_422_ * aClass399_8814.array[10];
		float f_424_ = f_421_ * aClass399_8814.array[7] + (aClass399_8814.array[15] + f * aClass399_8814.array[3])
				+ aClass399_8814.array[11] * f_422_;
		if (f_423_ < -f_424_ || f_423_ > f_424_) {
			float[] fs_425_ = fs;
			float[] fs_426_ = fs;
			fs[2] = Float.NaN;
			fs_426_[1] = Float.NaN;
			fs_425_[0] = Float.NaN;
		} else {
			float f_427_ = aClass399_8814.array[8] * f_422_
					+ (f * aClass399_8814.array[0] + aClass399_8814.array[12] + aClass399_8814.array[4] * f_421_);
			if (f_427_ < -f_424_ || f_427_ > f_424_) {
				float[] fs_428_ = fs;
				float[] fs_429_ = fs;
				fs[2] = Float.NaN;
				fs_429_[1] = Float.NaN;
				fs_428_[0] = Float.NaN;
			} else {
				float f_430_ = f_421_ * aClass399_8814.array[5]
						+ (aClass399_8814.array[13] + aClass399_8814.array[1] * f) + f_422_ * aClass399_8814.array[9];
				if (f_430_ < -f_424_ || f_430_ > f_424_) {
					float[] fs_431_ = fs;
					float[] fs_432_ = fs;
					fs[2] = Float.NaN;
					fs_432_[1] = Float.NaN;
					fs_431_[0] = Float.NaN;
				} else {
					float f_433_ = aClass399_8812.array[10]
							* f_422_
							+ (aClass399_8812.array[14] + aClass399_8812.array[2] * f + aClass399_8812.array[6]
									* f_421_);
					fs[0] = f_427_ * aFloat8820 / f_424_ + aFloat8794;
					fs[1] = aFloat8800 + aFloat8808 * f_430_ / f_424_;
					fs[2] = f_433_;
				}
			}
		}
	}

	@Override
	public void method2507(boolean bool) {

	}

	@Override
	public void method2511(int i, int i_413_, int i_414_, int i_415_) {
		if (113391253 * leftClip < i) {
			leftClip = 1186849981 * i;
		}
		if (1163397961 * bottomClip < i_413_) {
			bottomClip = i_413_ * 914282233;
		}
		if (rightClip * -1451559971 > i_414_) {
			rightClip = -1103758219 * i_414_;
		}
		if (topClip * -68852597 > i_415_) {
			topClip = 1509221155 * i_415_;
		}
		method14102();
	}

	@Override
	public DirectDisplay createDirectDisplay() {
		return new JavaDirectDisplay(this);
	}

	@Override
	public void method2525(int width, int height, int[] is, int[] is_22_) {
		method2757(width, height);
		if (aClass116_8832 == null || aClass116_8832.method2157() != width || aClass116_8832.method2119() != height) {
			aClass116_8832 = createSprite(width, height, true, true);
			aClass146_Sub2_8833 = null;
		}

		if (aClass146_Sub2_8833 == null) {
			aClass146_Sub2_8833 = createDirectDisplay();
			aClass146_Sub2_8833.method14256(0, aClass116_8832.method2075());
		}

		TransparentJavaSprite sprite = new TransparentJavaSprite(this, anIntArray8797, 464577083 * displayWidth,
				762738765 * displayHeight);
		method2397(aClass146_Sub2_8833);
		method2426(1, -16777216);
		sprite.method2083(anInt1569 * 81622179, anInt1568 * -2040424545, -673653535 * anInt1559,
				anInt1570 * -303698357, 1, 0, 0, 0);
		aClass116_8832.method2076(0, 0, width, height, is, is_22_, 0, width);
		method2398(aClass146_Sub2_8833);
	}

	@Override
	public boolean method2539() {
		return false;
	}

	@Override
	public void method2540(Matrix4f class399) {
		aClass399_8819.copyFrom(class399);
		method14109();
	}

	@Override
	public void method2566(int i, int i_436_, int i_437_, int i_438_) {
		anInt8817 = i * 2065935437;
		anInt8798 = -783279417 * i_436_;
		anInt8818 = i_437_ * -1955393685;
		anInt8830 = i_438_ * -296716423;
		method14102();
	}

	@Override
	public void method2574() {

	}

	@Override
	public Matrix4f method2575() {
		return new Matrix4f(aClass399_8819);
	}

	@Override
	public int method2586(int i, int i_496_, int i_497_, int i_498_, int i_499_, int i_500_) {
		int i_501_ = 0;
		float f = aClass399_8814.array[2] * i + aClass399_8814.array[14] + i_496_ * aClass399_8814.array[6]
				+ aClass399_8814.array[10] * i_497_;
		float f_502_ = aClass399_8814.array[10] * i_500_
				+ (i_499_ * aClass399_8814.array[6] + (aClass399_8814.array[2] * i_498_ + aClass399_8814.array[14]));
		float f_503_ = i_497_ * aClass399_8814.array[11]
				+ (aClass399_8814.array[7] * i_496_ + (aClass399_8814.array[15] + i * aClass399_8814.array[3]));
		float f_504_ = i_499_ * aClass399_8814.array[7] + (i_498_ * aClass399_8814.array[3] + aClass399_8814.array[15])
				+ aClass399_8814.array[11] * i_500_;
		if (f < -f_503_ && f_502_ < -f_504_) {
			i_501_ |= 0x10;
		} else if (f > f_503_ && f_502_ > f_504_) {
			i_501_ |= 0x20;
		}
		float f_505_ = aClass399_8814.array[4] * i_496_ + (aClass399_8814.array[12] + i * aClass399_8814.array[0])
				+ i_497_ * aClass399_8814.array[8];
		float f_506_ = i_500_ * aClass399_8814.array[8]
				+ (aClass399_8814.array[4] * i_499_ + (aClass399_8814.array[12] + i_498_ * aClass399_8814.array[0]));
		if (f_505_ < -f_503_ && f_506_ < -f_504_) {
			i_501_ |= 0x1;
		}
		if (f_505_ > f_503_ && f_506_ > f_504_) {
			i_501_ |= 0x2;
		}
		float f_507_ = aClass399_8814.array[9] * i_497_
				+ (i_496_ * aClass399_8814.array[5] + (aClass399_8814.array[13] + i * aClass399_8814.array[1]));
		float f_508_ = aClass399_8814.array[13] + aClass399_8814.array[1] * i_498_ + i_499_ * aClass399_8814.array[5]
				+ aClass399_8814.array[9] * i_500_;
		if (f_507_ < -f_503_ && f_508_ < -f_504_) {
			i_501_ |= 0x4;
		}
		if (f_507_ > f_503_ && f_508_ > f_504_) {
			i_501_ |= 0x8;
		}
		return i_501_;
	}

	@Override
	public Font createFont(FontSpecification specification, Image[] images, boolean monochrome) {
		int[] widths = new int[images.length];
		int[] heights = new int[images.length];
		boolean alpha = false;
		boolean indexed = false;

		for (int index = 0; index < images.length; index++) {
			widths[index] = images[index].getWidth();
			heights[index] = images[index].getHeight();
			if (images[index].hasAlpha()) {
				alpha = true;
			}
			if (images[index].isIndexed()) {
				indexed = true;
			}
		}

		if (monochrome) {
			if (indexed) {
				if (alpha) {
					return new MonochromeAlphaJavaFont(this, specification, (IndexedImage[]) images, widths, heights);
				}

				return new MonochromeJavaFont(this, specification, (IndexedImage[]) images, widths, heights);
			}

			if (alpha) {
				return new MonochromeAlphaJavaFont(this, specification, (DirectImage[]) images, widths, heights);
			}

			return new MonochromeJavaFont(this, specification, (DirectImage[]) images, widths, heights);
		} else if (indexed) {
			if (alpha) {
				throw new IllegalArgumentException("");
			}

			return new IndexedJavaFont(this, specification, (IndexedImage[]) images, widths, heights);
		}

		return new JavaFont(this, specification, (DirectImage[]) images, widths, heights);
	}

	@Override
	public void method2625(int i, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_) {
		method2437(i, i_39_, i_40_, i_42_, i_43_);
		method2437(i, i_41_ + i_39_ - 1, i_40_, i_42_, i_43_);
		method2472(i, i_39_ + 1, i_41_ - 2, i_42_, i_43_);
		method2472(i_40_ + i - 1, i_39_ + 1, i_41_ - 2, i_42_, i_43_);
	}

	@Override
	public Sprite method2630(int i, int i_196_, int i_197_, int i_198_, boolean bool) {
		if (null == anIntArray8797) {
			throw new IllegalStateException("");
		}
		int[] is = new int[i_198_ * i_197_];
		int i_199_ = i + i_196_ * displayWidth * 464577083;
		int i_200_ = displayWidth * 464577083 - i_197_;
		for (int i_201_ = 0; i_201_ < i_198_; i_201_++) {
			int i_202_ = i_201_ * i_197_;
			for (int i_203_ = 0; i_203_ < i_197_; i_203_++) {
				is[i_202_ + i_203_] = anIntArray8797[i_199_++];
			}
			i_199_ += i_200_;
		}
		if (bool) {
			return new TransparentJavaSprite(this, is, i_197_, i_198_);
		}
		return new OpaqueJavaSprite(this, is, i_197_, i_198_);
	}

	@Override
	public int method2637(int mask, int operand) {
		mask |= 0x20800;
		return mask & operand ^ operand;
	}

	@Override
	public boolean method2678() {
		return false;
	}

	@Override
	public long method2685(int i, int i_20_) {
		return 0L;
	}

	@Override
	public boolean method2688() {
		return false;
	}

	@Override
	public boolean method2707() {
		return false;
	}

	@Override
	public void method2730(int i, int i_381_, int i_382_, int i_383_) {

	}

	@Override
	public void method2748(int i, int i_572_, int i_573_, int i_574_, int i_575_, int i_576_, int i_577_) {
		if (null != anIntArray8797) {
			JavaThreadResource class64 = getThreadResource(Thread.currentThread());
			Rasterizer class109 = class64.rasterizer;
			int i_578_ = i_573_ - i;
			int i_579_ = i_574_ - i_572_;
			int i_580_ = i_578_ >= 0 ? i_578_ : -i_578_;
			int i_581_ = i_579_ >= 0 ? i_579_ : -i_579_;
			int i_582_ = i_580_;
			if (i_582_ < i_581_) {
				i_582_ = i_581_;
			}
			if (0 != i_582_) {
				int i_583_ = (i_578_ << 16) / i_582_;
				int i_584_ = (i_579_ << 16) / i_582_;
				i_578_ += i_583_ >> 16;
				i_579_ += i_584_ >> 16;
				if (i_584_ <= i_583_) {
					i_583_ = -i_583_;
				} else {
					i_584_ = -i_584_;
				}
				int i_585_ = i_584_ * i_576_ >> 17;
				int i_586_ = 1 + i_576_ * i_584_ >> 17;
				int i_587_ = i_576_ * i_583_ >> 17;
				int i_588_ = 1 + i_576_ * i_583_ >> 17;
				i -= class109.method1986();
				i_572_ -= class109.method1987();
				int i_589_ = i + i_585_;
				int i_590_ = i - i_586_;
				int i_591_ = i + i_578_ - i_586_;
				int i_592_ = i_585_ + i_578_ + i;
				int i_593_ = i_572_ + i_587_;
				int i_594_ = i_572_ - i_588_;
				int i_595_ = i_579_ + i_572_ - i_588_;
				int i_596_ = i_572_ + i_579_ + i_587_;
				if (0 == i_577_) {
					class109.anInt1375 = 0;
				} else if (i_577_ == 1) {
					class109.anInt1375 = 255 - (i_575_ >>> 24);
				} else {
					throw new IllegalArgumentException();
				}
				method2473(false);
				class109.aBool1376 = i_589_ < 0 || i_589_ > class109.anInt1395 || i_590_ < 0
						|| i_590_ > class109.anInt1395 || i_591_ < 0 || i_591_ > class109.anInt1395;
				class109.method1993(true, false, false, i_593_, i_594_, i_595_, i_589_, i_590_, i_591_, 100.0F, 100.0F,
						100.0F, i_575_);
				class109.aBool1376 = i_589_ < 0 || i_589_ > class109.anInt1395 || i_591_ < 0
						|| i_591_ > class109.anInt1395 || i_592_ < 0 || i_592_ > class109.anInt1395;
				class109.method1993(true, false, false, i_593_, i_595_, i_596_, i_589_, i_591_, i_592_, 100.0F, 100.0F,
						100.0F, i_575_);
				method2473(true);
			}
		}
	}

	@Override
	public Class405 method2754() {
		return new Class405(aClass405_8811);
	}

	@Override
	public void method2760(int i, int i_33_, int i_34_, int i_35_) {
		if (i < 0) {
			i = 0;
		}
		if (i_33_ < 0) {
			i_33_ = 0;
		}
		if (i_34_ > 464577083 * displayWidth) {
			i_34_ = 464577083 * displayWidth;
		}
		if (i_35_ > displayHeight * 762738765) {
			i_35_ = 762738765 * displayHeight;
		}
		leftClip = 1186849981 * i;
		rightClip = i_34_ * -1103758219;
		bottomClip = i_33_ * 914282233;
		topClip = 1509221155 * i_35_;
		method14102();
	}

	@Override
	public Interface17 method2774(int i, int i_288_) {
		return new FloatRaster(i, i_288_);
	}

	@Override
	public void method2783(int i, int i_384_, int i_385_, int i_386_, int i_387_, int i_388_) {
		if (anIntArray8797 != null) {
			i_385_ -= i;
			i_386_ -= i_384_;
			if (0 == i_386_) {
				if (i_385_ >= 0) {
					method2437(i, i_384_, i_385_ + 1, i_387_, i_388_);
				} else {
					method2437(i + i_385_, i_384_, 1 + -i_385_, i_387_, i_388_);
				}
			} else if (0 == i_385_) {
				if (i_386_ >= 0) {
					method2472(i, i_384_, i_386_ + 1, i_387_, i_388_);
				} else {
					method2472(i, i_386_ + i_384_, 1 + -i_386_, i_387_, i_388_);
				}
			} else {
				if (i_386_ + i_385_ < 0) {
					i += i_385_;
					i_385_ = -i_385_;
					i_384_ += i_386_;
					i_386_ = -i_386_;
				}
				if (i_385_ > i_386_) {
					i_384_ <<= 16;
					i_384_ += 32768;
					i_386_ <<= 16;
					int i_389_ = (int) Math.floor(0.5 + (double) i_386_ / (double) i_385_);
					i_385_ += i;
					if (i < 113391253 * leftClip) {
						i_384_ += i_389_ * (113391253 * leftClip - i);
						i = leftClip * 113391253;
					}
					if (i_385_ >= rightClip * -1451559971) {
						i_385_ = rightClip * -1451559971 - 1;
					}
					int i_390_ = i_387_ >>> 24;
					if (i_388_ == 0 || i_388_ == 1 && 255 == i_390_) {
						for (; i <= i_385_; i++) {
							int i_391_ = i_384_ >> 16;
							if (i_391_ >= bottomClip * 1163397961 && i_391_ < topClip * -68852597) {
								anIntArray8797[464577083 * displayWidth * i_391_ + i] = i_387_;
							}
							i_384_ += i_389_;
						}
					} else if (i_388_ == 1) {
						i_387_ = (i_390_ << 24) + (i_390_ * (i_387_ & 0xff00ff) >> 8 & 0xff00ff)
								+ (i_390_ * (i_387_ & 0xff00) >> 8 & 0xff00);
						int i_392_ = 256 - i_390_;
						for (; i <= i_385_; i++) {
							int i_393_ = i_384_ >> 16;
							if (i_393_ >= 1163397961 * bottomClip && i_393_ < -68852597 * topClip) {
								int i_394_ = i + displayWidth * 464577083 * i_393_;
								int i_395_ = anIntArray8797[i_394_];
								i_395_ = (i_392_ * (i_395_ & 0xff00) >> 8 & 0xff00)
										+ ((i_395_ & 0xff00ff) * i_392_ >> 8 & 0xff00ff);
								anIntArray8797[i_394_] = i_395_ + i_387_;
							}
							i_384_ += i_389_;
						}
					} else if (i_388_ == 2) {
						for (; i <= i_385_; i++) {
							int i_396_ = i_384_ >> 16;
							if (i_396_ >= 1163397961 * bottomClip && i_396_ < -68852597 * topClip) {
								int i_397_ = 464577083 * displayWidth * i_396_ + i;
								int i_398_ = anIntArray8797[i_397_];
								int i_399_ = i_387_ + i_398_;
								int i_400_ = (i_398_ & 0xff00ff) + (i_387_ & 0xff00ff);
								i_398_ = (i_399_ - i_400_ & 0x10000) + (i_400_ & 0x1000100);
								anIntArray8797[i_397_] = i_399_ - i_398_ | i_398_ - (i_398_ >>> 8);
							}
							i_384_ += i_389_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				} else {
					i <<= 16;
					i += 32768;
					i_385_ <<= 16;
					int i_401_ = (int) Math.floor(0.5 + (double) i_385_ / (double) i_386_);
					i_386_ += i_384_;
					if (i_384_ < bottomClip * 1163397961) {
						i += (1163397961 * bottomClip - i_384_) * i_401_;
						i_384_ = 1163397961 * bottomClip;
					}
					if (i_386_ >= topClip * -68852597) {
						i_386_ = -68852597 * topClip - 1;
					}
					int i_402_ = i_387_ >>> 24;
					if (0 == i_388_ || i_388_ == 1 && i_402_ == 255) {
						for (; i_384_ <= i_386_; i_384_++) {
							int i_403_ = i >> 16;
							if (i_403_ >= leftClip * 113391253 && i_403_ < -1451559971 * rightClip) {
								anIntArray8797[i_384_ * displayWidth * 464577083 + i_403_] = i_387_;
							}
							i += i_401_;
						}
					} else if (1 == i_388_) {
						i_387_ = (i_402_ << 24) + (i_402_ * (i_387_ & 0xff00) >> 8 & 0xff00)
								+ ((i_387_ & 0xff00ff) * i_402_ >> 8 & 0xff00ff);
						int i_404_ = 256 - i_402_;
						for (; i_384_ <= i_386_; i_384_++) {
							int i_405_ = i >> 16;
							if (i_405_ >= leftClip * 113391253 && i_405_ < rightClip * -1451559971) {
								int i_406_ = displayWidth * 464577083 * i_384_ + i_405_;
								int i_407_ = anIntArray8797[i_406_];
								i_407_ = (i_404_ * (i_407_ & 0xff00) >> 8 & 0xff00)
										+ (i_404_ * (i_407_ & 0xff00ff) >> 8 & 0xff00ff);
								anIntArray8797[i_405_ + i_384_ * displayWidth * 464577083] = i_407_ + i_387_;
							}
							i += i_401_;
						}
					} else if (i_388_ == 2) {
						for (; i_384_ <= i_386_; i_384_++) {
							int i_408_ = i >> 16;
							if (i_408_ >= leftClip * 113391253 && i_408_ < rightClip * -1451559971) {
								int i_409_ = i_408_ + displayWidth * 464577083 * i_384_;
								int i_410_ = anIntArray8797[i_409_];
								int i_411_ = i_410_ + i_387_;
								int i_412_ = (i_387_ & 0xff00ff) + (i_410_ & 0xff00ff);
								i_410_ = (i_412_ & 0x1000100) + (i_411_ - i_412_ & 0x10000);
								anIntArray8797[i_409_] = i_411_ - i_410_ | i_410_ - (i_410_ >>> 8);
							}
							i += i_401_;
						}
					} else {
						throw new IllegalArgumentException();
					}
				}
			}
		}
	}

	@Override
	public void method2804(int i, Class150 class150) {
		JavaThreadResource class64 = getThreadResource(Thread.currentThread());
		class64.anInt965 = i * -929111717;
		class64.fogColour = -2025454993 * class150.colour;
		class64.anInt966 = 336404909 * class150.scale;
	}

	@Override
	public boolean method2806() {
		return true;
	}

	@Override
	public Class480_Sub5 method2808(int i) {
		return null;
	}

	@Override
	public void method2813(int i, int i_515_, int i_516_, int i_517_, int i_518_, int i_519_, ClippingMask class129,
			int i_520_, int i_521_, int i_522_, int i_523_, int i_524_) {
		if (anIntArray8797 != null) {
			JavaClippingMask class129_sub3 = (JavaClippingMask) class129;
			int[] is = class129_sub3.offsets;
			int[] is_525_ = class129_sub3.widths;
			int i_526_ = 1163397961 * bottomClip > i_521_ ? 1163397961 * bottomClip : i_521_;
			int i_527_ = -68852597 * topClip < i_521_ + is.length ? topClip * -68852597 : i_521_ + is.length;
			i_524_ <<= 8;
			i_522_ <<= 8;
			i_523_ <<= 8;
			int i_528_ = i_522_ + i_523_;
			i_524_ %= i_528_;
			i_516_ -= i;
			i_517_ -= i_515_;
			if (i_516_ + i_517_ < 0) {
				int i_529_ = (int) (Math.sqrt(i_517_ * i_517_ + i_516_ * i_516_) * 256.0);
				int i_530_ = i_529_ % i_528_;
				i_524_ = i_528_ + i_522_ - i_524_ - i_530_;
				i_524_ %= i_528_;
				if (i_524_ < 0) {
					i_524_ += i_528_;
				}
				i += i_516_;
				i_516_ = -i_516_;
				i_515_ += i_517_;
				i_517_ = -i_517_;
			}
			if (i_516_ > i_517_) {
				i_515_ <<= 16;
				i_515_ += 32768;
				i_517_ <<= 16;
				int i_531_ = (int) Math.floor(0.5 + (double) i_517_ / (double) i_516_);
				i_516_ += i;
				int i_532_ = i_518_ >>> 24;
				int i_533_ = (int) Math.sqrt(65536 + (i_531_ >> 8) * (i_531_ >> 8));
				if (i_519_ == 0 || i_519_ == 1 && 255 == i_532_) {
					while (i <= i_516_) {
						int i_534_ = i_515_ >> 16;
						int i_535_ = i_534_ - i_521_;
						if (i >= leftClip * 113391253 && i < rightClip * -1451559971 && i_534_ >= i_526_
								&& i_534_ < i_527_ && i_524_ < i_522_) {
							int i_536_ = i_520_ + is[i_535_];
							if (i >= i_536_ && i < i_536_ + is_525_[i_535_]) {
								anIntArray8797[464577083 * displayWidth * i_534_ + i] = i_518_;
							}
						}
						i_515_ += i_531_;
						i++;
						i_524_ += i_533_;
						i_524_ %= i_528_;
					}
				} else if (1 == i_519_) {
					i_518_ = (i_532_ * (i_518_ & 0xff00ff) >> 8 & 0xff00ff)
							+ ((i_518_ & 0xff00) * i_532_ >> 8 & 0xff00) + (i_532_ << 24);
					int i_537_ = 256 - i_532_;
					while (i <= i_516_) {
						int i_538_ = i_515_ >> 16;
						int i_539_ = i_538_ - i_521_;
						if (i >= leftClip * 113391253 && i < -1451559971 * rightClip && i_538_ >= i_526_
								&& i_538_ < i_527_ && i_524_ < i_522_) {
							int i_540_ = is[i_539_] + i_520_;
							if (i >= i_540_ && i < is_525_[i_539_] + i_540_) {
								int i_541_ = i + 464577083 * displayWidth * i_538_;
								int i_542_ = anIntArray8797[i_541_];
								i_542_ = ((i_542_ & 0xff00ff) * i_537_ >> 8 & 0xff00ff)
										+ ((i_542_ & 0xff00) * i_537_ >> 8 & 0xff00);
								anIntArray8797[i_541_] = i_542_ + i_518_;
							}
						}
						i_515_ += i_531_;
						i++;
						i_524_ += i_533_;
						i_524_ %= i_528_;
					}
				} else if (i_519_ == 2) {
					while (i <= i_516_) {
						int i_543_ = i_515_ >> 16;
						int i_544_ = i_543_ - i_521_;
						if (i >= 113391253 * leftClip && i < -1451559971 * rightClip && i_543_ >= i_526_
								&& i_543_ < i_527_ && i_524_ < i_522_) {
							int i_545_ = is[i_544_] + i_520_;
							if (i >= i_545_ && i < is_525_[i_544_] + i_545_) {
								int i_546_ = i + i_543_ * displayWidth * 464577083;
								int i_547_ = anIntArray8797[i_546_];
								int i_548_ = i_547_ + i_518_;
								int i_549_ = (i_547_ & 0xff00ff) + (i_518_ & 0xff00ff);
								i_547_ = (i_549_ & 0x1000100) + (i_548_ - i_549_ & 0x10000);
								anIntArray8797[i_546_] = i_548_ - i_547_ | i_547_ - (i_547_ >>> 8);
							}
						}
						i_515_ += i_531_;
						i++;
						i_524_ += i_533_;
						i_524_ %= i_528_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			} else {
				i <<= 16;
				i += 32768;
				i_516_ <<= 16;
				int i_550_ = (int) Math.floor((double) i_516_ / (double) i_517_ + 0.5);
				int i_551_ = (int) Math.sqrt(65536 + (i_550_ >> 8) * (i_550_ >> 8));
				i_517_ += i_515_;
				int i_552_ = i_518_ >>> 24;
				if (0 == i_519_ || 1 == i_519_ && i_552_ == 255) {
					while (i_515_ <= i_517_) {
						int i_553_ = i >> 16;
						int i_554_ = i_515_ - i_521_;
						if (i_515_ >= i_526_ && i_515_ < i_527_ && i_553_ >= 113391253 * leftClip
								&& i_553_ < rightClip * -1451559971 && i_524_ < i_522_ && i_553_ >= i_520_ + is[i_554_]
								&& i_553_ < i_520_ + is[i_554_] + is_525_[i_554_]) {
							anIntArray8797[i_553_ + i_515_ * displayWidth * 464577083] = i_518_;
						}
						i += i_550_;
						i_515_++;
						i_524_ += i_551_;
						i_524_ %= i_528_;
					}
				} else if (1 == i_519_) {
					i_518_ = (i_552_ * (i_518_ & 0xff00) >> 8 & 0xff00)
							+ ((i_518_ & 0xff00ff) * i_552_ >> 8 & 0xff00ff) + (i_552_ << 24);
					int i_555_ = 256 - i_552_;
					while (i_515_ <= i_517_) {
						int i_556_ = i >> 16;
						int i_557_ = i_515_ - i_521_;
						if (i_515_ >= i_526_ && i_515_ < i_527_ && i_556_ >= leftClip * 113391253
								&& i_556_ < rightClip * -1451559971 && i_524_ < i_522_ && i_556_ >= i_520_ + is[i_557_]
								&& i_556_ < is_525_[i_557_] + is[i_557_] + i_520_) {
							int i_558_ = i_556_ + i_515_ * 464577083 * displayWidth;
							int i_559_ = anIntArray8797[i_558_];
							i_559_ = (i_555_ * (i_559_ & 0xff00ff) >> 8 & 0xff00ff)
									+ ((i_559_ & 0xff00) * i_555_ >> 8 & 0xff00);
							anIntArray8797[i_515_ * 464577083 * displayWidth + i_556_] = i_518_ + i_559_;
						}
						i += i_550_;
						i_515_++;
						i_524_ += i_551_;
						i_524_ %= i_528_;
					}
				} else if (2 == i_519_) {
					while (i_515_ <= i_517_) {
						int i_560_ = i >> 16;
						int i_561_ = i_515_ - i_521_;
						if (i_515_ >= i_526_ && i_515_ < i_527_ && i_560_ >= 113391253 * leftClip
								&& i_560_ < -1451559971 * rightClip && i_524_ < i_522_ && i_560_ >= is[i_561_] + i_520_
								&& i_560_ < is_525_[i_561_] + is[i_561_] + i_520_) {
							int i_562_ = i_515_ * 464577083 * displayWidth + i_560_;
							int i_563_ = anIntArray8797[i_562_];
							int i_564_ = i_518_ + i_563_;
							int i_565_ = (i_563_ & 0xff00ff) + (i_518_ & 0xff00ff);
							i_563_ = (i_565_ & 0x1000100) + (i_564_ - i_565_ & 0x10000);
							anIntArray8797[i_562_] = i_564_ - i_563_ | i_563_ - (i_563_ >>> 8);
						}
						i += i_550_;
						i_515_++;
						i_524_ += i_551_;
						i_524_ %= i_528_;
					}
				} else {
					throw new IllegalArgumentException();
				}
			}
		}
	}

	@Override
	public boolean method2820() {
		return false;
	}

	@Override
	public void method2824(Class480_Sub5 class480_sub5) {

	}

	@Override
	public RendererType renderer() {
		return new RendererType(0, "Pure Java", 1, "CPU", 0L);
	}

	@Override
	public void setFogColour(int colour, int i_509_, int i_510_) {
		for (JavaThreadResource thread : threads) {
			thread.fogColour = 166318683 * (colour & 0xFFFF);
			int red = 1595608531 * thread.fogColour >>> 16 & 0xFF;
			if (red < 2) {
				red = 2;
			}

			int green = 1595608531 * thread.fogColour >> 8 & 0xFF;
			if (green < 2) {
				green = 2;
			}

			int blue = 1595608531 * thread.fogColour & 0xFF;
			if (blue < 2) {
				blue = 2;
			}

			thread.fogColour = (red << 16 | green << 8 | blue) * 166318683;
			thread.aBool959 = i_509_ >= 0;
		}
	}

	void allocateThreads(int count) {
		threadCount = -785144539 * count;
		threads = new JavaThreadResource[-1677857107 * threadCount];
		for (int index = 0; index < threadCount * -1677857107; index++) {
			threads[index] = new JavaThreadResource(this);
		}
	}

	JavaThreadResource getThreadResource(Runnable runnable) {
		for (int index = 0; index < -1677857107 * threadCount; index++) {
			if (runnable == threads[index].runnable) {
				return threads[index];
			}
		}

		return null;
	}

	int[] method14092(int i) {
		Class480_Sub7 class480_sub7;
		synchronized (aClass168_8828) {
			class480_sub7 = aClass168_8828.get(i & 0xffff | ~0x7fffffffffffffffL);
			if (null == class480_sub7) {
				TextureMetrics class141 = metricsList.get(i);
				int i_4_ = class141.length * -931821243;
				if (!anInterface19_1546.loaded(Class549.TEXTURE_AND_MATERIAL, i)) {
					int[] is = null;
					return is;
				}
				int[] is;
				if (Class554.aClass554_7499 != class141.aClass554_1727) {
					is = anInterface19_1546.loadOpaque(Class549.TEXTURE_AND_MATERIAL, i, 0.7F);
				} else {
					is = anInterface19_1546.loadTranslucent(Class549.TEXTURE_AND_MATERIAL, i, 0.7F);
				}
				class480_sub7 = new Class480_Sub7(i, i_4_, is, class141.aClass554_1727 != Class554.aClass554_7501);
				aClass168_8828.put(i & 0xffff | ~0x7fffffffffffffffL, class480_sub7, i_4_ * i_4_);
			}
		}
		class480_sub7.aBool9993 = true;
		return class480_sub7.method15537();
	}

	boolean method14093(int id) {
		return anInterface19_1546.loaded(Class549.TEXTURE_AND_MATERIAL, id);
	}

	byte method14094(int i) {
		return metricsList.get(i).aByte1711;
	}

	boolean method14095(int id) {
		TextureMetrics metrics = metricsList.get(id);
		return 0 != metrics.aByte1709 || 0 != metrics.aByte1705;
	}

	int getTextureColour(int id) {
		return metricsList.get(id).colour & 0xffff;
	}

	void method14098() {
		if (null != aFloatArray8801) {
			if (0 == 113391253 * leftClip && 464577083 * displayWidth == rightClip * -1451559971
					&& bottomClip * 1163397961 == 0 && 762738765 * displayHeight == -68852597 * topClip) {
				int i = aFloatArray8801.length;
				int i_23_ = i - (i & 0x7);
				int i_24_ = 0;
				while (i_24_ < i_23_) {
					aFloatArray8801[i_24_++] = 2.14748365E9F;
					aFloatArray8801[i_24_++] = 2.14748365E9F;
					aFloatArray8801[i_24_++] = 2.14748365E9F;
					aFloatArray8801[i_24_++] = 2.14748365E9F;
					aFloatArray8801[i_24_++] = 2.14748365E9F;
					aFloatArray8801[i_24_++] = 2.14748365E9F;
					aFloatArray8801[i_24_++] = 2.14748365E9F;
					aFloatArray8801[i_24_++] = 2.14748365E9F;
				}
				while (i_24_ < i) {
					aFloatArray8801[i_24_++] = 2.14748365E9F;
				}
			} else {
				int i = -1451559971 * rightClip - leftClip * 113391253;
				int i_25_ = -68852597 * topClip - 1163397961 * bottomClip;
				int i_26_ = displayWidth * 464577083 - i;
				int i_27_ = 464577083 * displayWidth * 1163397961 * bottomClip + leftClip * 113391253;
				int i_28_ = i >> 3;
				int i_29_ = i & 0x7;
				i = i_27_ - 1;
				for (int i_30_ = -i_25_; i_30_ < 0; i_30_++) {
					if (i_28_ > 0) {
						int i_31_ = i_28_;
						do {
							aFloatArray8801[++i] = 2.14748365E9F;
							aFloatArray8801[++i] = 2.14748365E9F;
							aFloatArray8801[++i] = 2.14748365E9F;
							aFloatArray8801[++i] = 2.14748365E9F;
							aFloatArray8801[++i] = 2.14748365E9F;
							aFloatArray8801[++i] = 2.14748365E9F;
							aFloatArray8801[++i] = 2.14748365E9F;
							aFloatArray8801[++i] = 2.14748365E9F;
						} while (--i_31_ > 0);
					}
					if (i_29_ > 0) {
						int i_32_ = i_29_;
						do {
							aFloatArray8801[++i] = 2.14748365E9F;
						} while (--i_32_ > 0);
					}
					i += i_26_;
				}
			}
		}
	}

	boolean method14100() {
		return aBool8821;
	}

	void method14101(int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_, int i_69_, int i_70_) {
		if (anIntArray8797 != null && i_64_ >= 1163397961 * bottomClip && i_64_ < -68852597 * topClip) {
			int i_71_ = i_64_ * 464577083 * displayWidth + i;
			int i_72_ = i_66_ >>> 24;
			int i_73_ = i_68_ + i_69_;
			int i_74_ = i_70_ % i_73_;
			if (0 == i_67_ || i_67_ == 1 && i_72_ == 255) {
				int i_75_ = 0;
				while (i_75_ < i_65_) {
					if (i + i_75_ >= 113391253 * leftClip && i + i_75_ < rightClip * -1451559971 && i_74_ < i_68_) {
						anIntArray8797[i_71_ + i_75_] = i_66_;
					}
					i_75_++;
					i_74_ = ++i_74_ % i_73_;
				}
			} else if (1 == i_67_) {
				i_66_ = (i_72_ << 24) + ((i_66_ & 0xff00) * i_72_ >> 8 & 0xff00)
						+ (i_72_ * (i_66_ & 0xff00ff) >> 8 & 0xff00ff);
				int i_76_ = 256 - i_72_;
				int i_77_ = 0;
				while (i_77_ < i_65_) {
					if (i_77_ + i >= leftClip * 113391253 && i_77_ + i < rightClip * -1451559971 && i_74_ < i_68_) {
						int i_78_ = anIntArray8797[i_71_ + i_77_];
						i_78_ = (i_76_ * (i_78_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_78_ & 0xff00) * i_76_ >> 8 & 0xff00);
						anIntArray8797[i_71_ + i_77_] = i_78_ + i_66_;
					}
					i_77_++;
					i_74_ = ++i_74_ % i_73_;
				}
			} else if (2 == i_67_) {
				int i_79_ = 0;
				while (i_79_ < i_65_) {
					if (i + i_79_ >= 113391253 * leftClip && i_79_ + i < rightClip * -1451559971 && i_74_ < i_68_) {
						int i_80_ = anIntArray8797[i_71_ + i_79_];
						int i_81_ = i_66_ + i_80_;
						int i_82_ = (i_80_ & 0xff00ff) + (i_66_ & 0xff00ff);
						i_80_ = (i_81_ - i_82_ & 0x10000) + (i_82_ & 0x1000100);
						anIntArray8797[i_71_ + i_79_] = i_81_ - i_80_ | i_80_ - (i_80_ >>> 8);
					}
					i_79_++;
					i_74_ = ++i_74_ % i_73_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	void method14102() {
		int i = rightClip * -1451559971 - 113391253 * leftClip;
		int i_83_ = topClip * -68852597 - 1163397961 * bottomClip;
		float f = aFloat8820 = -1550211773 * anInt8818 / 2.0F;
		float f_84_ = aFloat8808 = anInt8830 * -1846721847 / 2.0F;
		aFloat8794 = anInt8817 * -1201443707 + f;
		aFloat8800 = f_84_ + -759265545 * anInt8798;
		for (int i_85_ = 0; i_85_ < -1677857107 * threadCount; i_85_++) {
			JavaThreadResource class64 = threads[i_85_];
			Rasterizer class109 = class64.rasterizer;
			class109.aFloat1380 = f;
			class109.aFloat1374 = f_84_;
			class109.aFloat1379 = aFloat8794 - 113391253 * leftClip;
			class109.aFloat1381 = aFloat8800 - 1163397961 * bottomClip;
			class109.anInt1395 = i;
			class109.anInt1382 = i_83_;
		}
		int i_86_ = bottomClip * 1163397961 * displayWidth * 464577083 + 113391253 * leftClip;
		for (int i_87_ = 1163397961 * bottomClip; i_87_ < topClip * -68852597; i_87_++) {
			for (int i_88_ = 0; i_88_ < -1677857107 * threadCount; i_88_++) {
				threads[i_88_].rasterizer.anIntArray1378[i_87_ - 1163397961 * bottomClip] = i_86_;
			}
			i_86_ += 464577083 * displayWidth;
		}
	}

	void method14103(int index) {
		threads[index].setRunnable(Thread.currentThread());
	}

	void method14106(boolean bool, boolean bool_225_, boolean bool_226_, PointEntity class477_sub4_sub1, int i,
			int i_227_, float f, int i_228_) {
		int i_229_ = class477_sub4_sub1.texture;
		int i_230_ = i_228_;
		i_228_ <<= 1;
		if (i_229_ == -1) {
			method14108(bool_225_, i, i_227_, f, i_230_, class477_sub4_sub1.colour, 1);
		} else {
			if (i_229_ != -535041981 * anInt8802) {
				Sprite class116 = (Sprite) aClass168_8829.get(i_229_);
				if (null == class116) {
					TextureMetrics class141 = metricsList.get(i_229_);
					int[] is = method14092(i_229_);
					if (is != null) {
						int i_231_ = class141.length * -931821243;
						class116 = createSprite(is, 0, i_231_, i_231_, i_231_);
						aClass168_8829.put(i_229_, class116);
					} else {
						return;
					}
				}
				anInt8802 = i_229_ * 1461298283;
				aClass116_8823 = class116;
			}
			i_228_++;
			((JavaSprite) aClass116_8823).method13985(bool, bool_225_, bool_226_, i - i_230_, i_227_ - i_230_, f,
					i_228_, i_228_, 0, class477_sub4_sub1.colour, 1, 1, false);
		}
	}

	void method14107(boolean bool, boolean bool_232_, boolean bool_233_, int i, int i_234_, float f, int i_235_,
			int i_236_, short i_237_, int i_238_, int i_239_, int i_240_) {
		if (0 != i_235_ && i_236_ != 0) {
			if (i_237_ != -1) {
				TextureMetrics class141 = metricsList.get(i_237_);
				if (!class141.aBool1724) {
					if (anInt8802 * -535041981 != i_237_) {
						Sprite class116 = (Sprite) aClass168_8829.get(i_237_);
						if (class116 == null) {
							int[] is = method14092(i_237_);
							if (null == is) {
								return;
							}
							int i_241_ = class141.length * -931821243;
							class116 = createSprite(is, 0, i_241_, i_241_, i_241_);
							aClass168_8829.put(i_237_, class116);
						}
						anInt8802 = i_237_ * 1461298283;
						aClass116_8823 = class116;
					}
					((JavaSprite) aClass116_8823).method13985(bool, bool_232_, bool_233_, i - i_235_, i_234_ - i_236_,
							f, i_235_ << 1, i_236_ << 1, i_239_, i_238_, i_240_, 1,
							class141.aClass554_1727 != Class554.aClass554_7500);
					return;
				}
			}
			method14108(bool_232_, i, i_234_, f, i_235_, i_238_, i_240_);
		}
	}

	void method14108(boolean bool, int i, int i_242_, float f, int i_243_, int i_244_, int i_245_) {
		if (anIntArray8797 != null) {
			if (i_243_ < 0) {
				i_243_ = -i_243_;
			}
			int i_246_ = i_242_ - i_243_;
			if (i_246_ < 1163397961 * bottomClip) {
				i_246_ = bottomClip * 1163397961;
			}
			int i_247_ = i_242_ + i_243_ + 1;
			if (i_247_ > -68852597 * topClip) {
				i_247_ = topClip * -68852597;
			}
			int i_248_ = i_246_;
			int i_249_ = i_243_ * i_243_;
			int i_250_ = 0;
			int i_251_ = i_242_ - i_248_;
			int i_252_ = i_251_ * i_251_;
			int i_253_ = i_252_ - i_251_;
			if (i_242_ > i_247_) {
				i_242_ = i_247_;
			}
			int i_254_ = i_244_ >>> 24;
			if (0 == i_245_ || 1 == i_245_ && 255 == i_254_) {
				while (i_248_ < i_242_) {
					for (; i_253_ <= i_249_ || i_252_ <= i_249_; i_253_ += i_250_++ + i_250_) {
						i_252_ += i_250_ + i_250_;
					}
					int i_255_ = i - i_250_ + 1;
					if (i_255_ < leftClip * 113391253) {
						i_255_ = leftClip * 113391253;
					}
					int i_256_ = i + i_250_;
					if (i_256_ > -1451559971 * rightClip) {
						i_256_ = -1451559971 * rightClip;
					}
					int i_257_ = i_248_ * 464577083 * displayWidth + i_255_;
					for (int i_258_ = i_255_; i_258_ < i_256_; i_258_++) {
						if (!bool || f < aFloatArray8801[i_257_]) {
							anIntArray8797[i_257_] = i_244_;
						}
						i_257_++;
					}
					i_248_++;
					i_252_ -= i_251_-- + i_251_;
					i_253_ -= i_251_ + i_251_;
				}
				i_250_ = i_243_;
				i_251_ = i_248_ - i_242_;
				i_253_ = i_251_ * i_251_ + i_249_;
				i_252_ = i_253_ - i_250_;
				i_253_ -= i_251_;
				while (i_248_ < i_247_) {
					for (; i_253_ > i_249_ && i_252_ > i_249_; i_252_ -= i_250_ + i_250_) {
						i_253_ -= i_250_-- + i_250_;
					}
					int i_259_ = i - i_250_;
					if (i_259_ < leftClip * 113391253) {
						i_259_ = leftClip * 113391253;
					}
					int i_260_ = i_250_ + i;
					if (i_260_ > -1451559971 * rightClip - 1) {
						i_260_ = rightClip * -1451559971 - 1;
					}
					int i_261_ = 464577083 * displayWidth * i_248_ + i_259_;
					for (int i_262_ = i_259_; i_262_ <= i_260_; i_262_++) {
						if (!bool || f < aFloatArray8801[i_261_]) {
							anIntArray8797[i_261_] = i_244_;
						}
						i_261_++;
					}
					i_248_++;
					i_253_ += i_251_ + i_251_;
					i_252_ += i_251_++ + i_251_;
				}
			} else if (i_245_ == 1) {
				i_244_ = ((i_244_ & 0xff00) * i_254_ >> 8 & 0xff00) + (i_254_ * (i_244_ & 0xff00ff) >> 8 & 0xff00ff)
						+ (i_254_ << 24);
				int i_263_ = 256 - i_254_;
				while (i_248_ < i_242_) {
					for (; i_253_ <= i_249_ || i_252_ <= i_249_; i_253_ += i_250_++ + i_250_) {
						i_252_ += i_250_ + i_250_;
					}
					int i_264_ = i - i_250_ + 1;
					if (i_264_ < 113391253 * leftClip) {
						i_264_ = leftClip * 113391253;
					}
					int i_265_ = i_250_ + i;
					if (i_265_ > rightClip * -1451559971) {
						i_265_ = -1451559971 * rightClip;
					}
					int i_266_ = i_264_ + i_248_ * displayWidth * 464577083;
					for (int i_267_ = i_264_; i_267_ < i_265_; i_267_++) {
						if (!bool || f < aFloatArray8801[i_266_]) {
							int i_268_ = anIntArray8797[i_266_];
							i_268_ = (i_263_ * (i_268_ & 0xff00) >> 8 & 0xff00)
									+ ((i_268_ & 0xff00ff) * i_263_ >> 8 & 0xff00ff);
							anIntArray8797[i_266_] = i_244_ + i_268_;
						}
						i_266_++;
					}
					i_248_++;
					i_252_ -= i_251_-- + i_251_;
					i_253_ -= i_251_ + i_251_;
				}
				i_250_ = i_243_;
				i_251_ = -i_251_;
				i_253_ = i_249_ + i_251_ * i_251_;
				i_252_ = i_253_ - i_250_;
				i_253_ -= i_251_;
				while (i_248_ < i_247_) {
					for (; i_253_ > i_249_ && i_252_ > i_249_; i_252_ -= i_250_ + i_250_) {
						i_253_ -= i_250_-- + i_250_;
					}
					int i_269_ = i - i_250_;
					if (i_269_ < 113391253 * leftClip) {
						i_269_ = leftClip * 113391253;
					}
					int i_270_ = i + i_250_;
					if (i_270_ > -1451559971 * rightClip - 1) {
						i_270_ = rightClip * -1451559971 - 1;
					}
					int i_271_ = i_248_ * displayWidth * 464577083 + i_269_;
					for (int i_272_ = i_269_; i_272_ <= i_270_; i_272_++) {
						if (!bool || f < aFloatArray8801[i_271_]) {
							int i_273_ = anIntArray8797[i_271_];
							i_273_ = (i_263_ * (i_273_ & 0xff00) >> 8 & 0xff00)
									+ ((i_273_ & 0xff00ff) * i_263_ >> 8 & 0xff00ff);
							anIntArray8797[i_271_] = i_244_ + i_273_;
						}
						i_271_++;
					}
					i_248_++;
					i_253_ += i_251_ + i_251_;
					i_252_ += i_251_++ + i_251_;
				}
			} else if (2 == i_245_) {
				while (i_248_ < i_242_) {
					for (; i_253_ <= i_249_ || i_252_ <= i_249_; i_253_ += i_250_++ + i_250_) {
						i_252_ += i_250_ + i_250_;
					}
					int i_274_ = i - i_250_ + 1;
					if (i_274_ < leftClip * 113391253) {
						i_274_ = 113391253 * leftClip;
					}
					int i_275_ = i + i_250_;
					if (i_275_ > -1451559971 * rightClip) {
						i_275_ = -1451559971 * rightClip;
					}
					int i_276_ = i_248_ * displayWidth * 464577083 + i_274_;
					for (int i_277_ = i_274_; i_277_ < i_275_; i_277_++) {
						if (!bool || f < aFloatArray8801[i_276_]) {
							int i_278_ = anIntArray8797[i_276_];
							int i_279_ = i_278_ + i_244_;
							int i_280_ = (i_278_ & 0xff00ff) + (i_244_ & 0xff00ff);
							i_278_ = (i_279_ - i_280_ & 0x10000) + (i_280_ & 0x1000100);
							anIntArray8797[i_276_] = i_279_ - i_278_ | i_278_ - (i_278_ >>> 8);
						}
						i_276_++;
					}
					i_248_++;
					i_252_ -= i_251_-- + i_251_;
					i_253_ -= i_251_ + i_251_;
				}
				i_250_ = i_243_;
				i_251_ = -i_251_;
				i_253_ = i_249_ + i_251_ * i_251_;
				i_252_ = i_253_ - i_250_;
				i_253_ -= i_251_;
				while (i_248_ < i_247_) {
					for (; i_253_ > i_249_ && i_252_ > i_249_; i_252_ -= i_250_ + i_250_) {
						i_253_ -= i_250_-- + i_250_;
					}
					int i_281_ = i - i_250_;
					if (i_281_ < leftClip * 113391253) {
						i_281_ = 113391253 * leftClip;
					}
					int i_282_ = i + i_250_;
					if (i_282_ > -1451559971 * rightClip - 1) {
						i_282_ = -1451559971 * rightClip - 1;
					}
					int i_283_ = i_281_ + 464577083 * displayWidth * i_248_;
					for (int i_284_ = i_281_; i_284_ <= i_282_; i_284_++) {
						if (!bool || f < aFloatArray8801[i_283_]) {
							int i_285_ = anIntArray8797[i_283_];
							int i_286_ = i_244_ + i_285_;
							int i_287_ = (i_285_ & 0xff00ff) + (i_244_ & 0xff00ff);
							i_285_ = (i_286_ - i_287_ & 0x10000) + (i_287_ & 0x1000100);
							anIntArray8797[i_283_] = i_286_ - i_285_ | i_285_ - (i_285_ >>> 8);
						}
						i_283_++;
					}
					i_248_++;
					i_253_ += i_251_ + i_251_;
					i_252_ += i_251_++ + i_251_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	void method14109() {
		aClass399_8812.method6548(aClass405_8811);
		aClass399_8814.copyFrom(aClass399_8812);
		aClass399_8814.method6547(aClass399_8819);
		aClass399_8814.method6567(aFloatArrayArray8815[0]);
		aClass399_8814.method6568(aFloatArrayArray8815[1]);
		aClass399_8814.method6563(aFloatArrayArray8815[2]);
		aClass399_8814.method6564(aFloatArrayArray8815[3]);
		aClass399_8814.method6632(aFloatArrayArray8815[4]);
		aClass399_8814.method6566(aFloatArrayArray8815[5]);
		float f = aClass399_8819.method6550();
		float f_303_ = aClass399_8819.array[10] * (f - 255.0F) + aClass399_8819.array[14];
		float f_304_ = aClass399_8819.array[14] + aClass399_8819.array[10] * f;
		float f_305_ = f_304_ - f_303_;
		for (int i = 0; i < threadCount * -1677857107; i++) {
			JavaThreadResource class64 = threads[i];
			class64.aFloat960 = f_303_;
			class64.aFloat956 = f_305_;
		}
	}

	Interface16 method14110(int i, int i_333_) {
		return new IntRaster(i, i_333_);
	}

	Class554 method14118(int i) {
		return metricsList.get(i).aClass554_1727;
	}

	int method14127(int i) {
		return metricsList.get(i).length * -931821243;
	}

	void method14132(int width, int height, int[] is, float[] fs) {
		displayWidth = width * -138041613;
		displayHeight = -519995259 * height;
		anIntArray8797 = is;
		aFloatArray8801 = fs;

		for (int index = 0; index < -1677857107 * threadCount; index++) {
			threads[index].resetRasterizer();
		}

		method2421();
		method2494();
	}

	void method14133(int i, int i_461_, int i_462_, int i_463_, int i_464_, int i_465_, int i_466_, int i_467_) {
		if (null != anIntArray8797 && i >= 113391253 * leftClip && i < -1451559971 * rightClip) {
			int i_468_ = i + 464577083 * displayWidth * i_461_;
			int i_469_ = i_463_ >>> 24;
			int i_470_ = i_465_ + i_466_;
			int i_471_ = i_467_ % i_470_;
			if (i_464_ == 0 || i_464_ == 1 && 255 == i_469_) {
				int i_472_ = 0;
				while (i_472_ < i_462_) {
					if (i_461_ + i_472_ >= 1163397961 * bottomClip && i_461_ + i_472_ < topClip * -68852597
							&& i_471_ < i_465_) {
						anIntArray8797[i_468_ + 464577083 * displayWidth * i_472_] = i_463_;
					}
					i_472_++;
					i_471_ = ++i_471_ % i_470_;
				}
			} else if (i_464_ == 1) {
				i_463_ = (i_469_ << 24) + ((i_463_ & 0xff00) * i_469_ >> 8 & 0xff00)
						+ (i_469_ * (i_463_ & 0xff00ff) >> 8 & 0xff00ff);
				int i_473_ = 256 - i_469_;
				int i_474_ = 0;
				while (i_474_ < i_462_) {
					if (i_461_ + i_474_ >= 1163397961 * bottomClip && i_461_ + i_474_ < -68852597 * topClip
							&& i_471_ < i_465_) {
						int i_475_ = i_468_ + 464577083 * displayWidth * i_474_;
						int i_476_ = anIntArray8797[i_475_];
						i_476_ = ((i_476_ & 0xff00) * i_473_ >> 8 & 0xff00)
								+ (i_473_ * (i_476_ & 0xff00ff) >> 8 & 0xff00ff);
						anIntArray8797[i_475_] = i_463_ + i_476_;
					}
					i_474_++;
					i_471_ = ++i_471_ % i_470_;
				}
			} else if (2 == i_464_) {
				int i_477_ = 0;
				while (i_477_ < i_462_) {
					if (i_461_ + i_477_ >= 1163397961 * bottomClip && i_461_ + i_477_ < -68852597 * topClip
							&& i_471_ < i_465_) {
						int i_478_ = 464577083 * displayWidth * i_477_ + i_468_;
						int i_479_ = anIntArray8797[i_478_];
						int i_480_ = i_479_ + i_463_;
						int i_481_ = (i_479_ & 0xff00ff) + (i_463_ & 0xff00ff);
						i_479_ = (i_480_ - i_481_ & 0x10000) + (i_481_ & 0x1000100);
						anIntArray8797[i_478_] = i_480_ - i_479_ | i_479_ - (i_479_ >>> 8);
					}
					i_477_++;
					i_471_ = ++i_471_ % i_470_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	void method14134(boolean bool, boolean bool_482_, boolean bool_483_, Class137 class137) {
		JavaThreadResource class64 = getThreadResource(Thread.currentThread());
		for (PointEntity class477_sub4_sub1 = (PointEntity) class137.entities.getFront(); class477_sub4_sub1 != null; class477_sub4_sub1 = (PointEntity) class137.entities
				.next()) {
			int i = class477_sub4_sub1.x >> 12;
			int i_484_ = class477_sub4_sub1.z >> 12;
			int i_485_ = class477_sub4_sub1.y >> 12;
			float f = aClass399_8814.array[14]
					+ (i * aClass399_8814.array[2] + aClass399_8814.array[6] * i_484_ + i_485_
							* aClass399_8814.array[10]);
			float f_486_ = aClass399_8814.array[15]
					+ (aClass399_8814.array[7] * i_484_ + i * aClass399_8814.array[3] + i_485_
							* aClass399_8814.array[11]);
			if (!(f < -f_486_)) {
				float f_487_ = aFloat8824 * f / f_486_ + aFloat8825;
				if (!(f > class64.aFloat960)) {
					float f_488_ = aClass399_8814.array[4] * i_484_ + aClass399_8814.array[0] * i + i_485_
							* aClass399_8814.array[8] + aClass399_8814.array[12];
					float f_489_ = i_485_ * aClass399_8814.array[9]
							+ (i * aClass399_8814.array[1] + aClass399_8814.array[5] * i_484_)
							+ aClass399_8814.array[13];
					if (!(f_488_ < -f_486_) && !(f_488_ > f_486_) && !(f_489_ < -f_486_) && !(f_489_ > f_486_)) {
						float f_490_ = class477_sub4_sub1.size / 4096.0F;
						float f_491_ = f_490_ * aClass399_8819.array[0] + f_488_;
						float f_492_ = f_486_ + aClass399_8819.array[3] * f_490_;
						float f_493_ = f_488_ * aFloat8820 / f_486_ + aFloat8794;
						float f_494_ = f_489_ * aFloat8808 / f_486_ + aFloat8800;
						float f_495_ = aFloat8820 * f_491_ / f_492_ + aFloat8794;
						method14106(bool, bool_482_, bool_483_, class477_sub4_sub1, (int) f_493_, (int) f_494_, f_487_,
								(int) (f_495_ < f_493_ ? f_493_ - f_495_ : f_495_ - f_493_));
					}
				}
			}
		}
	}

	@Override
	void method2374() {
		if (aBool8796) {
			Class470.method8046(true, false);
			aBool8796 = false;
		}
		aBool8821 = true;
	}

	@Override
	boolean method2377(int i, int i_177_, int i_178_, int i_179_, Class405 class405, Class379 class379) {
		Matrix4f class399 = method2462();
		class399.method6548(class405);
		class399.method6547(aClass399_8814);
		return class379.method6218(i, i_177_, i_178_, i_179_, class399, aFloat8794, aFloat8800, aFloat8820, aFloat8808);
	}

	@Override
	DelegatingDisplay createDelegatingDisplay(Canvas canvas, int width, int height) {
		return JavaDelegatingDisplay.create(this, canvas, width, height);
	}

	@Override
	void method2437(int i, int i_289_, int i_290_, int i_291_, int i_292_) {
		if (anIntArray8797 != null && i_289_ >= 1163397961 * bottomClip && i_289_ < topClip * -68852597) {
			if (i < leftClip * 113391253) {
				i_290_ -= leftClip * 113391253 - i;
				i = 113391253 * leftClip;
			}
			if (i_290_ + i > rightClip * -1451559971) {
				i_290_ = rightClip * -1451559971 - i;
			}
			int i_293_ = i + displayWidth * 464577083 * i_289_;
			int i_294_ = i_291_ >>> 24;
			if (i_292_ == 0 || i_292_ == 1 && i_294_ == 255) {
				for (int i_295_ = 0; i_295_ < i_290_; i_295_++) {
					anIntArray8797[i_295_ + i_293_] = i_291_;
				}
			} else if (1 == i_292_) {
				i_291_ = (i_294_ * (i_291_ & 0xff00ff) >> 8 & 0xff00ff) + ((i_291_ & 0xff00) * i_294_ >> 8 & 0xff00)
						+ (i_294_ << 24);
				int i_296_ = 256 - i_294_;
				for (int i_297_ = 0; i_297_ < i_290_; i_297_++) {
					int i_298_ = anIntArray8797[i_297_ + i_293_];
					i_298_ = (i_296_ * (i_298_ & 0xff00ff) >> 8 & 0xff00ff)
							+ ((i_298_ & 0xff00) * i_296_ >> 8 & 0xff00);
					anIntArray8797[i_297_ + i_293_] = i_291_ + i_298_;
				}
			} else if (i_292_ == 2) {
				for (int i_299_ = 0; i_299_ < i_290_; i_299_++) {
					int i_300_ = anIntArray8797[i_293_ + i_299_];
					int i_301_ = i_300_ + i_291_;
					int i_302_ = (i_291_ & 0xff00ff) + (i_300_ & 0xff00ff);
					i_300_ = (i_302_ & 0x1000100) + (i_301_ - i_302_ & 0x10000);
					anIntArray8797[i_299_ + i_293_] = i_301_ - i_300_ | i_300_ - (i_300_ >>> 8);
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@Override
	void method2472(int i, int i_440_, int i_441_, int i_442_, int i_443_) {
		if (anIntArray8797 != null && i >= leftClip * 113391253 && i < -1451559971 * rightClip) {
			if (i_440_ < bottomClip * 1163397961) {
				i_441_ -= bottomClip * 1163397961 - i_440_;
				i_440_ = bottomClip * 1163397961;
			}
			if (i_441_ + i_440_ > -68852597 * topClip) {
				i_441_ = -68852597 * topClip - i_440_;
			}
			int i_444_ = i + i_440_ * 464577083 * displayWidth;
			int i_445_ = i_442_ >>> 24;
			if (i_443_ == 0 || 1 == i_443_ && i_445_ == 255) {
				for (int i_446_ = 0; i_446_ < i_441_; i_446_++) {
					anIntArray8797[i_446_ * displayWidth * 464577083 + i_444_] = i_442_;
				}
			} else if (i_443_ == 1) {
				i_442_ = ((i_442_ & 0xff00) * i_445_ >> 8 & 0xff00) + ((i_442_ & 0xff00ff) * i_445_ >> 8 & 0xff00ff)
						+ (i_445_ << 24);
				int i_447_ = 256 - i_445_;
				for (int i_448_ = 0; i_448_ < i_441_; i_448_++) {
					int i_449_ = displayWidth * 464577083 * i_448_ + i_444_;
					int i_450_ = anIntArray8797[i_449_];
					i_450_ = (i_447_ * (i_450_ & 0xff00) >> 8 & 0xff00)
							+ ((i_450_ & 0xff00ff) * i_447_ >> 8 & 0xff00ff);
					anIntArray8797[i_449_] = i_450_ + i_442_;
				}
			} else if (i_443_ == 2) {
				for (int i_451_ = 0; i_451_ < i_441_; i_451_++) {
					int i_452_ = displayWidth * 464577083 * i_451_ + i_444_;
					int i_453_ = anIntArray8797[i_452_];
					int i_454_ = i_442_ + i_453_;
					int i_455_ = (i_453_ & 0xff00ff) + (i_442_ & 0xff00ff);
					i_453_ = (i_455_ & 0x1000100) + (i_454_ - i_455_ & 0x10000);
					anIntArray8797[i_452_] = i_454_ - i_453_ | i_453_ - (i_453_ >>> 8);
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

	@Override
	void method2500(float f, float f_416_, float f_417_, float f_418_, float f_419_, float f_420_) {

	}

	@Override
	void method2647(int x, int y) {
		aClass146_Sub1_1552.draw(x, y);
		if (anInterface19_1546 != null) {
			anInterface19_1546.method106();
		}
	}

	@Override
	void method2736(int i, int i_335_, int i_336_, int i_337_, int i_338_) {
		if (null != anIntArray8797) {
			if (i_336_ < 0) {
				i_336_ = -i_336_;
			}
			int i_339_ = i_335_ - i_336_;
			if (i_339_ < bottomClip * 1163397961) {
				i_339_ = 1163397961 * bottomClip;
			}
			int i_340_ = 1 + i_335_ + i_336_;
			if (i_340_ > -68852597 * topClip) {
				i_340_ = -68852597 * topClip;
			}
			int i_341_ = i_339_;
			int i_342_ = i_336_ * i_336_;
			int i_343_ = 0;
			int i_344_ = i_335_ - i_341_;
			int i_345_ = i_344_ * i_344_;
			int i_346_ = i_345_ - i_344_;
			if (i_335_ > i_340_) {
				i_335_ = i_340_;
			}
			int i_347_ = i_337_ >>> 24;
			if (0 == i_338_ || i_338_ == 1 && i_347_ == 255) {
				while (i_341_ < i_335_) {
					for (; i_346_ <= i_342_ || i_345_ <= i_342_; i_346_ += i_343_++ + i_343_) {
						i_345_ += i_343_ + i_343_;
					}
					int i_348_ = 1 + i - i_343_;
					if (i_348_ < 113391253 * leftClip) {
						i_348_ = leftClip * 113391253;
					}
					int i_349_ = i_343_ + i;
					if (i_349_ > rightClip * -1451559971) {
						i_349_ = rightClip * -1451559971;
					}
					int i_350_ = displayWidth * 464577083 * i_341_ + i_348_;
					for (int i_351_ = i_348_; i_351_ < i_349_; i_351_++) {
						anIntArray8797[i_350_++] = i_337_;
					}
					i_341_++;
					i_345_ -= i_344_-- + i_344_;
					i_346_ -= i_344_ + i_344_;
				}
				i_343_ = i_336_;
				i_344_ = i_341_ - i_335_;
				i_346_ = i_342_ + i_344_ * i_344_;
				i_345_ = i_346_ - i_343_;
				i_346_ -= i_344_;
				while (i_341_ < i_340_) {
					for (; i_346_ > i_342_ && i_345_ > i_342_; i_345_ -= i_343_ + i_343_) {
						i_346_ -= i_343_-- + i_343_;
					}
					int i_352_ = i - i_343_;
					if (i_352_ < leftClip * 113391253) {
						i_352_ = leftClip * 113391253;
					}
					int i_353_ = i + i_343_;
					if (i_353_ > -1451559971 * rightClip - 1) {
						i_353_ = rightClip * -1451559971 - 1;
					}
					int i_354_ = 464577083 * displayWidth * i_341_ + i_352_;
					for (int i_355_ = i_352_; i_355_ <= i_353_; i_355_++) {
						anIntArray8797[i_354_++] = i_337_;
					}
					i_341_++;
					i_346_ += i_344_ + i_344_;
					i_345_ += i_344_++ + i_344_;
				}
			} else if (i_338_ == 1) {
				i_337_ = (i_347_ << 24) + ((i_337_ & 0xff00) * i_347_ >> 8 & 0xff00)
						+ ((i_337_ & 0xff00ff) * i_347_ >> 8 & 0xff00ff);
				int i_356_ = 256 - i_347_;
				while (i_341_ < i_335_) {
					for (; i_346_ <= i_342_ || i_345_ <= i_342_; i_346_ += i_343_++ + i_343_) {
						i_345_ += i_343_ + i_343_;
					}
					int i_357_ = i - i_343_ + 1;
					if (i_357_ < 113391253 * leftClip) {
						i_357_ = leftClip * 113391253;
					}
					int i_358_ = i + i_343_;
					if (i_358_ > rightClip * -1451559971) {
						i_358_ = -1451559971 * rightClip;
					}
					int i_359_ = 464577083 * displayWidth * i_341_ + i_357_;
					for (int i_360_ = i_357_; i_360_ < i_358_; i_360_++) {
						int i_361_ = anIntArray8797[i_359_];
						i_361_ = (i_356_ * (i_361_ & 0xff00) >> 8 & 0xff00)
								+ (i_356_ * (i_361_ & 0xff00ff) >> 8 & 0xff00ff);
						anIntArray8797[i_359_++] = i_361_ + i_337_;
					}
					i_341_++;
					i_345_ -= i_344_-- + i_344_;
					i_346_ -= i_344_ + i_344_;
				}
				i_343_ = i_336_;
				i_344_ = -i_344_;
				i_346_ = i_344_ * i_344_ + i_342_;
				i_345_ = i_346_ - i_343_;
				i_346_ -= i_344_;
				while (i_341_ < i_340_) {
					for (; i_346_ > i_342_ && i_345_ > i_342_; i_345_ -= i_343_ + i_343_) {
						i_346_ -= i_343_-- + i_343_;
					}
					int i_362_ = i - i_343_;
					if (i_362_ < 113391253 * leftClip) {
						i_362_ = 113391253 * leftClip;
					}
					int i_363_ = i_343_ + i;
					if (i_363_ > -1451559971 * rightClip - 1) {
						i_363_ = rightClip * -1451559971 - 1;
					}
					int i_364_ = i_362_ + 464577083 * displayWidth * i_341_;
					for (int i_365_ = i_362_; i_365_ <= i_363_; i_365_++) {
						int i_366_ = anIntArray8797[i_364_];
						i_366_ = (i_356_ * (i_366_ & 0xff00) >> 8 & 0xff00)
								+ ((i_366_ & 0xff00ff) * i_356_ >> 8 & 0xff00ff);
						anIntArray8797[i_364_++] = i_366_ + i_337_;
					}
					i_341_++;
					i_346_ += i_344_ + i_344_;
					i_345_ += i_344_++ + i_344_;
				}
			} else if (2 == i_338_) {
				while (i_341_ < i_335_) {
					for (; i_346_ <= i_342_ || i_345_ <= i_342_; i_346_ += i_343_++ + i_343_) {
						i_345_ += i_343_ + i_343_;
					}
					int i_367_ = i - i_343_ + 1;
					if (i_367_ < leftClip * 113391253) {
						i_367_ = leftClip * 113391253;
					}
					int i_368_ = i + i_343_;
					if (i_368_ > -1451559971 * rightClip) {
						i_368_ = -1451559971 * rightClip;
					}
					int i_369_ = i_341_ * displayWidth * 464577083 + i_367_;
					for (int i_370_ = i_367_; i_370_ < i_368_; i_370_++) {
						int i_371_ = anIntArray8797[i_369_];
						int i_372_ = i_371_ + i_337_;
						int i_373_ = (i_337_ & 0xff00ff) + (i_371_ & 0xff00ff);
						i_371_ = (i_373_ & 0x1000100) + (i_372_ - i_373_ & 0x10000);
						anIntArray8797[i_369_++] = i_372_ - i_371_ | i_371_ - (i_371_ >>> 8);
					}
					i_341_++;
					i_345_ -= i_344_-- + i_344_;
					i_346_ -= i_344_ + i_344_;
				}
				i_343_ = i_336_;
				i_344_ = -i_344_;
				i_346_ = i_344_ * i_344_ + i_342_;
				i_345_ = i_346_ - i_343_;
				i_346_ -= i_344_;
				while (i_341_ < i_340_) {
					for (; i_346_ > i_342_ && i_345_ > i_342_; i_345_ -= i_343_ + i_343_) {
						i_346_ -= i_343_-- + i_343_;
					}
					int i_374_ = i - i_343_;
					if (i_374_ < 113391253 * leftClip) {
						i_374_ = 113391253 * leftClip;
					}
					int i_375_ = i + i_343_;
					if (i_375_ > -1451559971 * rightClip - 1) {
						i_375_ = rightClip * -1451559971 - 1;
					}
					int i_376_ = i_374_ + 464577083 * displayWidth * i_341_;
					for (int i_377_ = i_374_; i_377_ <= i_375_; i_377_++) {
						int i_378_ = anIntArray8797[i_376_];
						int i_379_ = i_378_ + i_337_;
						int i_380_ = (i_378_ & 0xff00ff) + (i_337_ & 0xff00ff);
						i_378_ = (i_380_ & 0x1000100) + (i_379_ - i_380_ & 0x10000);
						anIntArray8797[i_376_++] = i_379_ - i_378_ | i_378_ - (i_378_ >>> 8);
					}
					i_341_++;
					i_346_ += i_344_ + i_344_;
					i_345_ += i_344_++ + i_344_;
				}
			} else {
				throw new IllegalArgumentException();
			}
		}
	}

}