package com.jagex;

import java.awt.Canvas;
import java.awt.Dimension;
import java.util.Enumeration;
import java.util.Hashtable;

public abstract class Toolkit {
	public static final int anInt1538 = 1;
	public static final int anInt1539 = 0;
	public static final int anInt1541 = 3;
	public static final int anInt1542 = 5;
	public static final int anInt1556 = 2;
	public static final int anInt1563 = 2;
	public static final int anInt1567 = 0;
	public static final int anInt1571 = 1;
	protected static final int anInt1551 = 2;
	protected static final int anInt1553 = 1;
	protected static final int anInt1555 = 4;
	protected static final int anInt1557 = 16;
	protected static final int anInt1562 = 8;
	protected static final int anInt1565 = 32;
	static boolean[] aBoolArray1544 = new boolean[8];
	static final int anInt1540 = 4;
	static final int anInt1543 = 8;

	public static Toolkit create(int type, Canvas canvas, TextureMetricsList metrics, Interface19 interface19,
			BillboardLoader billboardLoader, ParticleProducerDefinitionLoader particleLoader, Interface44 interface44,
			Archive shaders, int multisamples) {
		int width = 0;
		int height = 0;

		if (canvas != null) {
			Dimension dimension = canvas.getSize();
			width = dimension.width;
			height = dimension.height;
		}

		return create(type, canvas, metrics, interface19, billboardLoader, particleLoader, interface44, shaders,
				multisamples, width, height);
	}

	static synchronized Toolkit create(int type, Canvas canvas, TextureMetricsList metrics, Interface19 interface19,
			BillboardLoader billboardLoader, ParticleProducerDefinitionLoader particleLoader, Interface44 interface44,
			Archive shaders, int multisamples, int width, int height) {
		if (0 == type) {
			return JavaToolkit.create(canvas, metrics, interface19, billboardLoader, particleLoader, interface44,
					width, height);
		} else if (type == 1) {
			return OpenGlToolkit.create(canvas, metrics, interface19, billboardLoader, particleLoader, interface44,
					multisamples);
		} else if (type == 5) {
			return OpenGlXToolkit.create(canvas, metrics, interface19, billboardLoader, particleLoader, interface44,
					shaders, multisamples);
		} else if (type == 3) {
			return DirectXToolkit.create(canvas, metrics, interface19, billboardLoader, particleLoader, interface44,
					shaders, multisamples);
		}

		throw new IllegalArgumentException("");
	}

	static void method2868(Toolkit toolkit) {
		if (Class56.aClass399_645 != null) {
			toolkit.method2540(Class56.aClass399_645);
			toolkit.method2471(Class56.aClass405_625);
			toolkit.method2760(Class56.anInt639 * -1318900375, 633667639 * Class56.anInt640, 992277267
					* Class56.anInt641 + Class56.anInt639 * -1318900375, Class56.anInt640 * 633667639 + 1249343635
					* Class56.anInt621);
			toolkit.method2566(-1318900375 * Class56.anInt639, Class56.anInt640 * 633667639,
					992277267 * Class56.anInt641, 1249343635 * Class56.anInt621);
		}
	}

	static void method5369(Toolkit toolkit) {
		if (!Class56.aBool642) {
			Ground.method2227(toolkit);
		} else {
			Class57.method1362(toolkit);
		}
	}

	public float aFloat1550;
	public int anInt1568;
	public int anInt1569;
	public Interface19 anInterface19_1546;
	public BillboardLoader billboardLoader;
	public int id;
	public TextureMetricsList metricsList;
	public ParticleProducerDefinitionLoader particleLoader;
	protected Display aClass146_1561;
	protected DelegatingDisplay aClass146_Sub1_1552;
	protected Hashtable aHashtable1558;
	protected int anInt1554;
	protected int anInt1559;
	protected int anInt1566;
	protected int anInt1570;
	DirectDisplay[] aClass146_Sub2Array1564;
	int anInt1560 = 651650201;

	Toolkit(TextureMetricsList metrics, Interface19 interface19, BillboardLoader billboardLoader,
			ParticleProducerDefinitionLoader particleLoader, Interface44 interface44) {
		aHashtable1558 = new Hashtable();
		aClass146_Sub2Array1564 = new DirectDisplay[4];
		anInt1570 = 0;
		aFloat1550 = 0.0F;
		metricsList = metrics;
		anInterface19_1546 = interface19;
		this.billboardLoader = billboardLoader;
		this.particleLoader = particleLoader;

		int id = -1;
		for (int index = 0; index < 8; index++) {
			if (!aBoolArray1544[index]) {
				aBoolArray1544[index] = true;
				id = index;
				break;
			}
		}

		if (-1 == id) {
			throw new IllegalStateException("");
		}

		this.id = 631941797 * id;
	}

	public abstract ClippingMask createClippingMask(int width, int height, int[] offsets, int[] widths);

	public abstract CubeMapTextureProvider createCubeMapTextureProvider(int id);

	public abstract DirectDisplay createDirectDisplay();

	public abstract Font createFont(FontSpecification specification, Image[] images, boolean bool);

	public abstract Model createModel(BaseModel base, int attributes, int i_92_, int ambience, int contrast);

	public abstract Sprite createSprite(Image image, boolean alpha);

	public abstract Sprite createSprite(int width, int height, boolean transparent, boolean bool_82_);

	public Sprite createSprite(int i, int i_79_, boolean bool, int i_80_) {
		return createSprite(i, i_79_, bool, false);
	}

	public Sprite createSprite(int[] raster, int offset, int step, int width, int height) {
		return createSprite(raster, offset, step, width, height, true);
	}

	public abstract Sprite createSprite(int[] raster, int offset, int step, int width, int height, boolean copy);

	@Override
	public void finalize() {
		method2373();
	}

	public abstract int mergeFunctionMasks(int i, int mask);

	public final void method2370() {
		method2647(0, 0);
	}

	public abstract void method2372();

	public void method2373() {
		aBoolArray1544[id * 976039213] = false;
		Enumeration enumeration = aHashtable1558.keys();
		while (enumeration.hasMoreElements()) {
			Canvas canvas = (Canvas) enumeration.nextElement();
			DelegatingDisplay class146_sub1 = (DelegatingDisplay) aHashtable1558.get(canvas);
			class146_sub1.delete();
		}
		method2374();
	}

	public abstract void method2375(int i);

	public abstract boolean method2378();

	public abstract boolean method2379();

	public final void method2382(int i, int i_6_, int i_7_, int i_8_, int i_9_) {
		method2437(i, i_6_, i_7_, i_8_, 1);
	}

	public abstract boolean method2383();

	public abstract boolean method2384();

	public abstract boolean method2386();

	public abstract boolean method2387();

	public abstract String method2388();

	public final DelegatingDisplay method2391() {
		return aClass146_Sub1_1552;
	}

	public final void method2392(Canvas canvas, int i, int i_10_) {
		if (!aHashtable1558.containsKey(canvas)) {
			CompressionType.ignoreRepaint(canvas);
			method2433(canvas, createDelegatingDisplay(canvas, i, i_10_));
		}
	}

	public final void method2394(Canvas canvas, int i) {
		if (aHashtable1558.containsKey(canvas)) {
			DelegatingDisplay class146_sub1 = (DelegatingDisplay) aHashtable1558.get(canvas);
			class146_sub1.delete();
			aHashtable1558.remove(canvas);
		}
	}

	public abstract void method2395(int[] is);

	public final void method2396(Canvas canvas, int i, int i_12_, int i_13_) {
		DelegatingDisplay class146_sub1 = (DelegatingDisplay) aHashtable1558.get(canvas);
		if (class146_sub1 == null) {
			throw new RuntimeException("");
		}
		class146_sub1.setDimensions(i, i_12_);
	}

	public final void method2397(DirectDisplay class146_sub2) {
		if (1432703063 * anInt1560 >= 3) {
			throw new RuntimeException();
		}
		if (1432703063 * anInt1560 >= 0) {
			aClass146_Sub2Array1564[1432703063 * anInt1560].method3151();
		} else {
			aClass146_Sub1_1552.method3151();
		}
		aClass146_1561 = aClass146_Sub2Array1564[(anInt1560 += -651650201) * 1432703063] = class146_sub2;
		class146_sub2.method324();
	}

	public final void method2398(DirectDisplay class146_sub2) {
		if (anInt1560 * 1432703063 < 0 || class146_sub2 != aClass146_Sub2Array1564[anInt1560 * 1432703063]) {
			throw new RuntimeException();
		}
		aClass146_Sub2Array1564[(anInt1560 -= -651650201) * 1432703063 + 1] = null;
		class146_sub2.method3151();
		if (1432703063 * anInt1560 >= 0) {
			aClass146_1561 = aClass146_Sub2Array1564[1432703063 * anInt1560];
			aClass146_Sub2Array1564[anInt1560 * 1432703063].method324();
		} else {
			aClass146_1561 = aClass146_Sub1_1552;
			aClass146_Sub1_1552.method324();
		}
	}

	public abstract Interface16 method2401(int i, int i_15_, Class121 class121, Class151 class151, int i_16_);

	public abstract Interface17 method2403(int i, int i_17_, int i_18_);

	public abstract int[] method2404(int i, int i_19_, int i_20_, int i_21_);

	public abstract void method2405();

	public abstract boolean method2406();

	public abstract boolean method2408();

	public abstract boolean method2411();

	public abstract void method2412(int i, int i_22_, int i_23_);

	public abstract void method2413(long l);

	public abstract void method2414(int i, Class150 class150);

	public void method2415(int[] is) {
		if (aClass146_Sub1_1552 != null) {
			is[0] = aClass146_Sub1_1552.getWidth();
			is[1] = aClass146_Sub1_1552.getHeight();
		} else {
			int[] is_24_ = is;
			is[1] = 0;
			is_24_[0] = 0;
		}
	}

	public abstract void method2416();

	public void method2419(boolean bool) {

	}

	public abstract void method2420(float f, float f_25_);

	public abstract void method2421();

	public abstract void method2424(float f, float f_27_, float f_26_, float[] fs);

	public abstract void method2425(int[] is);

	public abstract void method2426(int i, int i_28_);

	public final void method2431(int i, int i_29_, int i_30_, int i_31_, int i_32_) {
		method2472(i, i_29_, i_30_, i_31_, 1);
	}

	public final void method2432(int i, int i_33_, int i_34_, int i_35_, int i_36_) {
		method2783(i, i_33_, i_34_, i_35_, i_36_, 1);
	}

	public abstract void method2434(int i, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_);

	public abstract void method2435(int i, int i_43_, float f, int i_44_, int i_45_, float f_46_, int i_47_, int i_48_,
			float f_49_, int i_50_, int i_51_, int i_52_, int i_53_);

	public abstract void method2440(int i, int i_62_, int i_63_, int i_64_, int i_65_, int i_66_,
			ClippingMask class129, int i_67_, int i_68_);

	public abstract void method2441(int i, int i_69_, int i_70_, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_,
			int i_76_);

	public boolean method2445(int i, int i_77_, Class405 class405, Class379 class379) {
		return method2377(i, i_77_, 0, 0, class405, class379);
	}

	public void method2446() {

	}

	public abstract void method2447(Class405 class405, Class139 class139, Class379 class379);

	public void method2456() {

	}

	public void method2457() {

	}

	public abstract Matrix4f method2462();

	public abstract Class405 method2463();

	public abstract void method2464(int i);

	public abstract boolean method2466();

	public abstract void method2467(int i, ClippingMask class129, int i_95_, int i_96_);

	public abstract Ground createGround(int width, int length, int[][] heights, int[][] lighting, int units,
			int i_100_, int i_101_);

	public boolean method2469() {
		return true;
	}

	public abstract void method2470(Class137 class137);

	public abstract void method2471(Class405 class405);

	public abstract void method2473(boolean bool);

	public abstract void method2476(float f);

	public abstract void method2477(int i, float f, float f_106_, float f_107_, float f_108_, float f_109_);

	public abstract void method2478(int i);

	public abstract int method2480();

	public PointLight createPointLight(int x, int y, int z, int range, int colour, float intensity) {
		return new PointLight(x, y, z, range, colour, intensity);
	}

	public abstract void method2482(int i, PointLight[] class480_sub23s);

	public abstract CubeMapTextureProvider method2484(CubeMapTextureProvider class138,
			CubeMapTextureProvider class138_114_, float f, CubeMapTextureProvider class138_115_);

	public abstract void method2487(int i, int i_116_);

	public abstract boolean method2489();

	public abstract void method2490(float f, float f_117_, float f_118_, float f_119_, float f_120_);

	public abstract Class118 method2491(int[] argb);

	public abstract boolean method2492();

	public abstract void method2493(Class118 class118, float f, Class118 class118_121_, float f_122_,
			Class118 class118_123_, float f_124_);

	public abstract void method2494();

	public abstract void method2495();

	public abstract boolean method2496();

	public void method2497(float f, float f_125_, float f_126_, byte i) {
		method2500(f, f_125_, f_126_, 0.0F, 1.0F, 1.0F);
	}

	public abstract int method2499();

	public abstract void method2501();

	public abstract void method2502(float f, float f_133_, float f_132_, float[] fs);

	public byte[] method2506(int i, int i_134_, int i_135_, int i_136_, byte[] is, int i_137_, int i_138_, int i_139_) {
		byte[] is_141_ = new byte[i_135_ * i_136_ * i_139_];
		if (i_138_ == 0) {
			i_138_ = i_139_ * i;
		}
		for (int i_142_ = 0; i_142_ < i_136_; i_142_++) {
			if (i_142_ < i_134_) {
				int i_143_ = i_142_ * i_138_ + i_137_;
				for (int i_144_ = 0; i_144_ < i; i_144_++) {
					for (int i_145_ = 0; i_145_ < i_139_; i_145_++) {
						is_141_[i_145_ + i_139_ * i_142_ * i_135_ + i_139_ * i_144_] = is[i_143_ + i_139_ * i_144_
								+ i_145_];
					}
				}
				byte[] is_146_ = new byte[i_139_];
				for (int i_147_ = 0; i_147_ < i_139_; i_147_++) {
					is_146_[i_147_] = is[(i - 1) * i_139_ + i_143_ + i_147_];
				}
				for (int i_148_ = i; i_148_ < i_135_; i_148_++) {
					for (int i_149_ = 0; i_149_ < i_139_; i_149_++) {
						is_141_[i_149_ + i_142_ * i_135_ * i_139_ + i_139_ * i_148_] = is_146_[i_149_];
					}
				}
			} else {
				int i_150_ = (i_134_ - 1) * i_135_ * i_139_;
				for (int i_151_ = 0; i_151_ < i_135_; i_151_++) {
					for (int i_152_ = 0; i_152_ < i_139_; i_152_++) {
						is_141_[i_139_ * i_151_ + i_139_ * i_135_ * i_142_ + i_152_] = is_141_[i_152_ + i_139_ * i_151_
								+ i_150_];
					}
				}
			}
		}
		return is_141_;
	}

	public abstract void method2507(boolean bool);

	public abstract void method2511(int i, int i_153_, int i_154_, int i_155_);

	public abstract void method2525(int i, int i_156_, int[] is, int[] is_157_);

	public abstract boolean method2539();

	public abstract void method2540(Matrix4f class399);

	public abstract void method2566(int i, int i_158_, int i_159_, int i_160_);

	public abstract void method2574();

	public abstract Matrix4f method2575();

	public abstract int method2586(int i, int i_161_, int i_162_, int i_163_, int i_164_, int i_165_);

	public final void method2620(Canvas canvas) {
		DelegatingDisplay display = (DelegatingDisplay) aHashtable1558.get(canvas);
		if (null == display) {
			throw new RuntimeException();
		} else if (1432703063 * anInt1560 > 0 || aClass146_1561 != aClass146_Sub1_1552) {
			throw new RuntimeException();
		}

		if (aClass146_1561 != null) {
			aClass146_1561.method3151();
		}

		if (1432703063 * anInt1560 < 0) {
			aClass146_1561 = display;
		}

		aClass146_Sub1_1552 = display;
		display.method324();
	}

	public abstract void method2625(int i, int i_166_, int i_167_, int i_168_, int i_169_, int i_170_);

	public final Display method2628() {
		return aClass146_1561;
	}

	public abstract Sprite method2630(int i, int i_171_, int i_172_, int i_173_, boolean bool);

	public abstract int method2637(int functionMask, int operand);

	public float[] method2668(int i, int i_176_, int i_177_, int i_178_, float[] fs, int i_179_, int i_180_, int i_181_) {
		float[] fs_183_ = new float[i_181_ * i_178_ * i_177_];
		if (0 == i_180_) {
			i_180_ = i * i_181_;
		}
		for (int i_184_ = 0; i_184_ < i_178_; i_184_++) {
			if (i_184_ < i_176_) {
				int i_185_ = i_179_ + i_180_ * i_184_;
				for (int i_186_ = 0; i_186_ < i; i_186_++) {
					for (int i_187_ = 0; i_187_ < i_181_; i_187_++) {
						fs_183_[i_186_ * i_181_ + i_181_ * i_177_ * i_184_ + i_187_] = fs[i_187_ + i_181_ * i_186_
								+ i_185_];
					}
				}
				float[] fs_188_ = new float[i_181_];
				for (int i_189_ = 0; i_189_ < i_181_; i_189_++) {
					fs_188_[i_189_] = fs[i_181_ * (i - 1) + i_185_ + i_189_];
				}
				for (int i_190_ = i; i_190_ < i_177_; i_190_++) {
					for (int i_191_ = 0; i_191_ < i_181_; i_191_++) {
						fs_183_[i_191_ + i_184_ * i_177_ * i_181_ + i_190_ * i_181_] = fs_188_[i_191_];
					}
				}
			} else {
				int i_192_ = (i_176_ - 1) * i_177_ * i_181_;
				for (int i_193_ = 0; i_193_ < i_177_; i_193_++) {
					for (int i_194_ = 0; i_194_ < i_181_; i_194_++) {
						fs_183_[i_194_ + i_181_ * i_193_ + i_181_ * i_184_ * i_177_] = fs_183_[i_194_ + i_192_ + i_193_
								* i_181_];
					}
				}
			}
		}
		return fs_183_;
	}

	public abstract boolean method2678();

	public abstract long method2685(int i, int i_195_);

	public abstract boolean method2688();

	public int[] method2694(int i, int i_197_, int i_198_, int i_199_, int[] is, int i_200_, int i_201_) {
		int[] is_203_ = new int[i_198_ * i_199_];
		if (0 == i_201_) {
			i_201_ = i;
		}

		for (int i_204_ = 0; i_204_ < i_199_; i_204_++) {
			if (i_204_ < i_197_) {
				int i_205_ = i_204_ * i_201_ + i_200_;
				for (int i_206_ = 0; i_206_ < i; i_206_++) {
					is_203_[i_198_ * i_204_ + i_206_] = is[i_205_ + i_206_];
				}

				int i_207_ = is[i_205_ + i - 1];
				for (int i_208_ = i; i_208_ < i_198_; i_208_++) {
					is_203_[i_198_ * i_204_ + i_208_] = i_207_;
				}
			} else {
				int i_209_ = (i_197_ - 1) * i_198_;

				for (int i_210_ = 0; i_210_ < i_198_; i_210_++) {
					is_203_[i_210_ + i_204_ * i_198_] = is_203_[i_210_ + i_209_];
				}
			}
		}

		return is_203_;
	}

	public abstract boolean method2707();

	public abstract void method2730(int i, int i_211_, int i_212_, int i_213_);

	public final void method2747(int i, int i_218_, int i_219_, int i_220_, int i_221_) {
		method2625(i, i_218_, i_219_, i_220_, i_221_, 1);
	}

	public abstract void method2748(int i, int i_223_, int i_224_, int i_225_, int i_226_, int i_227_, int i_228_);

	public abstract Class405 method2754();

	public abstract void method2760(int i, int i_232_, int i_233_, int i_234_);

	public abstract Interface17 method2774(int i, int i_235_);

	public abstract void method2783(int i, int i_236_, int i_237_, int i_238_, int i_239_, int i_240_);

	public abstract void method2804(int i, Class150 class150);

	public final void method2805(int i, int i_241_, int i_242_, int i_243_, int i_244_) {
		method2434(i, i_241_, i_242_, i_243_, i_244_, 1);
	}

	public abstract boolean method2806();

	public abstract Class480_Sub5 method2808(int i);

	public abstract void method2813(int i, int i_246_, int i_247_, int i_248_, int i_249_, int i_250_,
			ClippingMask class129, int i_251_, int i_252_, int i_253_, int i_254_, int i_255_);

	public abstract boolean method2820();

	public abstract void method2824(Class480_Sub5 class480_sub5);

	public final void method2827(int i, int i_256_, int i_257_, int i_258_, int i_259_) {
		method2736(i, i_256_, i_257_, i_258_, 1);
	}

	public abstract int offheapSize();

	public abstract RendererType renderer();

	public abstract void setCubeMapTextureProvider(CubeMapTextureProvider provider);

	public abstract void setFogColour(int colour, int i_4_, int i_5_);

	abstract DelegatingDisplay createDelegatingDisplay(Canvas canvas, int width, int height);

	abstract void method2374();

	abstract boolean method2377(int i, int i_1_, int i_2_, int i_3_, Class405 class405, Class379 class379);

	final void method2433(Canvas canvas, DelegatingDisplay display) {
		if (null == display) {
			throw new RuntimeException("");
		}

		aHashtable1558.put(canvas, display);
	}

	abstract void method2437(int i, int i_54_, int i_55_, int i_56_, int i_57_);

	abstract void method2472(int i, int i_102_, int i_103_, int i_104_, int i_105_);

	abstract void method2500(float f, float f_127_, float f_128_, float f_129_, float f_130_, float f_131_);

	abstract void method2647(int i, int i_175_);

	abstract void method2736(int i, int i_214_, int i_215_, int i_216_, int i_217_);

	void method2757(int i, int i_229_) {
		anInt1554 = -1803378065 * i;
		anInt1566 = 458531171 * i_229_;
		float displayRatio = (float) aClass146_1561.getWidth() / aClass146_1561.getHeight();
		float f_231_ = (float) (anInt1554 * -939590513) / (2016536651 * anInt1566);

		if (displayRatio < f_231_) {
			anInt1559 = (int) (2016536651 * anInt1566 * displayRatio) * -1932695775;
			anInt1570 = anInt1566 * -1377849855;
		} else {
			anInt1559 = -771811473 * anInt1554;
			anInt1570 = (int) (anInt1554 * -939590513 / displayRatio) * 490924899;
		}

		aFloat1550 = (float) (-673653535 * anInt1559) / (float) aClass146_1561.getWidth();
		anInt1569 = -1833509109 * ((anInt1554 * -939590513 - anInt1559 * -673653535) / 2);
		anInt1568 = 1164821599 * ((anInt1566 * 2016536651 - -303698357 * anInt1570) / 2);
	}

}