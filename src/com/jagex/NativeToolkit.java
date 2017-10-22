package com.jagex;

import jaclib.memory.DirectBufferHelper;
import jaclib.memory.heap.NativeHeap;
import jaclib.memory.heap.NativeHeapBuffer;

import java.lang.reflect.Field;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Iterator;

import sun.misc.Unsafe;

public abstract class NativeToolkit extends Toolkit {
	static final int anInt9255 = 128;
	static final int anInt9256 = 1;
	static final int anInt9257 = 2;
	static final int anInt9258 = 4;
	static final int anInt9259 = 4;
	static final int anInt9260 = 55;
	protected static final int anInt9262 = 100663296;
	static final int anInt9269 = 4194304;
	static Object anObject9270 = new Object();
	static Matrix4f aClass399_9286 = new Matrix4f();
	static final int anInt9335 = 7;
	static final int anInt9369 = 8;
	static final int anInt9377 = 1;
	static final int anInt9378 = 2;
	static final int anInt9379 = 3;

	static int method14824(char c, char c_187_, char c_188_, char c_189_) {
		return (c & 0xff) << 0 | (c_187_ & 0xff) << 8 | (c_188_ & 0xff) << 16 | (c_189_ & 0xff) << 24;
	}

	boolean aBool9253;
	WeakReferenceTable aClass45_9254 = new WeakReferenceTable();
	NativeModel[] aClass143_Sub2Array9261;
	Archive shaders;
	protected boolean fixedFunction;
	Matrix4f aClass399_9265;
	protected Unsafe unsafe;
	boolean aBool9267;
	public long aLong9268;
	protected boolean aBool9271;
	NativeHeap heap;
	Deque aClass644_9273;
	public int allocatedTextureSize;
	public int anInt9275;
	boolean aBool9276;
	Class405 aClass405_9277;
	Matrix4f aClass399_9278;
	public ByteBuffer aByteBuffer9279;
	Class405 aClass405_9280;
	public Matrix4f aClass399_9281;
	int anInt9282 = 0;
	Matrix4f aClass399_9283;
	Class405 aClass405_9284;
	int anInt9285;
	Class405 aClass405_9287;
	float[] aFloatArray9288;
	Matrix4f aClass399_9289;
	Class397 aClass397_9290;
	Class323 aClass323_9291;
	protected int anInt9292;
	protected int anInt9293;
	int anInt9294;
	boolean aBool9295;
	Matrix4f aClass399_9296;
	NativeArrayBuffer anInterface32_9297;
	public float[] aFloatArray9298;
	Matrix4f aClass399_9299;
	Matrix4f aClass399_9300;
	public Matrix4f aClass399_9301;
	Matrix4f aClass399_9302;
	public Matrix4f aClass399_9303;
	protected int anInt9304;
	protected int anInt9305;
	Class302_Sub1_Sub2 aClass302_Sub1_Sub2_9306;
	protected boolean aBool9307;
	float aFloat9308;
	protected float aFloat9309;
	protected float aFloat9310;
	float aFloat9311;
	float aFloat9312;
	protected float aFloat9313;
	protected float aFloat9314;
	Matrix4f aClass399_9315;
	Class405 aClass405_9316;
	int anInt9317;
	protected int anInt9318;
	int anInt9319;
	public float aFloat9320;
	public float aFloat9321;
	int anInt9322;
	Matrix4f aClass399_9323;
	protected Matrix4f aClass399_9324;
	protected Class308 aClass308_9325;
	Class302[] aClass302Array9326;
	NativeModel[] aClass143_Sub2Array9327;
	protected int anInt9328;
	protected float[] aFloatArray9329;
	protected boolean aBool9330;
	protected float aFloat9331;
	protected boolean aBool9332;
	protected boolean aBool9333;
	Class259 aClass259_9334;
	int anInt9336;
	protected int anInt9337;
	float[] aFloatArray9338;
	int anInt9339;
	public float aFloat9340;
	Class315 aClass315_9341;
	int[] anIntArray9342;
	float aFloat9343;
	public float aFloat9344;
	protected float aFloat9345;
	protected PointLight[] aClass480_Sub23Array9346;
	protected int anInt9347;
	protected int anInt9348;
	boolean aBool9349;
	int shadowScale;
	int sunProjectionX;
	int sunProjectionZ;
	protected int anInt9353;
	NativeTexture[] anInterface38Array9354;
	float[] aFloatArray9355;
	protected Class336[] aClass336Array9356;
	protected Class347[] aClass347Array9357;
	protected Class347[] aClass347Array9358;
	boolean aBool9359;
	Native2DTextureCache aClass321_9360;
	public Native2DTexture anInterface29_9361;
	Native2DTexture anInterface29_9362;
	Class302_Sub1_Sub1 aClass302_Sub1_Sub1_9363;
	float aFloat9364;
	int anInt9365;
	Class346 aClass346_9366;
	Class302 aClass302_9367;
	protected int anInt9368;
	Class299 aClass299_9370;
	Class298 aClass298_9371;
	protected int anInt9372;
	protected int anInt9373;
	Class302_Sub1_Sub1 aClass302_Sub1_Sub1_9374;
	Class323 aClass323_9375;
	protected int anInt9376;
	protected boolean aBool9380;
	Class309[] aClass309Array9381;
	NativeCubeMapTextureProvider aClass138_Sub1_9382;
	Class294 aClass294_9383;
	protected int anInt9384;
	int anInt9385;
	Class150 aClass150_9386;
	protected boolean aBool9387;
	protected boolean aBool9388;
	NativeElementArrayBuffer anInterface36_9389;
	protected int anInt9390;
	protected int anInt9391;
	protected float aFloat9392;
	protected float aFloat9393;
	protected int anInt9394;
	protected int anInt9395;
	protected Matrix4f[] aClass399Array9396;
	protected boolean aBool9397;
	protected boolean aBool9398;
	protected byte aByte9399;
	public int anInt9400;
	public int anInt9401;
	float[][] aFloatArrayArray9402;
	float aFloat9403;
	Class319 aClass319_9404;
	int endianness;
	public int anInt9406;
	protected int anInt9407;
	public boolean aBool9408;
	protected boolean aBool9409;
	boolean aBool9410;
	protected boolean aBool9411;
	protected boolean aBool9412;
	public boolean threeDimensional;
	protected boolean aBool9414;
	protected boolean aBool9415;
	NativeSprite aClass116_Sub3_9416;
	NativeArrayBuffer anInterface32_9417;
	Matrix4f aClass399_9418;
	Class323 aClass323_9419;
	Class323 aClass323_9420;
	Class323 aClass323_9421;
	NativeArrayBuffer anInterface32_9422;
	Class323 aClass323_9423;
	Class304 aClass304_9424;
	NativeSprite aClass116_Sub3_9425;
	Class290 aClass290_9426;
	protected boolean aBool9427;
	Matrix4f aClass399_9428;
	Class405 aClass405_9429;
	protected boolean aBool9430;

	NativeToolkit(TextureMetricsList metricsList, Interface19 interface19, BillboardLoader billboardLoader,
			ParticleProducerDefinitionLoader particleLoader, Interface44 interface44, Archive shaders, int i, int i_223_) {
		super(metricsList, interface19, billboardLoader, particleLoader, interface44);
		aClass644_9273 = new Deque();
		aClass405_9277 = new Class405();
		aClass399_9278 = new Matrix4f();
		aClass405_9316 = new Class405();
		aClass405_9280 = new Class405();
		aClass399_9281 = new Matrix4f();
		aClass399_9323 = new Matrix4f();
		aClass399_9283 = new Matrix4f();
		aClass405_9284 = new Class405();
		aClass399_9315 = new Matrix4f();
		aClass405_9287 = new Class405();
		aClass399_9324 = new Matrix4f();
		aClass399_9289 = new Matrix4f();
		aClass397_9290 = new Class397();
		aFloatArray9288 = new float[4];
		aClass304_9424 = Class304.aClass304_3306;
		aClass399_9265 = new Matrix4f();
		aClass399_9296 = new Matrix4f();
		aClass399_9418 = new Matrix4f();
		aClass399_9299 = new Matrix4f();
		aClass399_9300 = aClass399_9299;
		aClass399_9301 = new Matrix4f();
		aClass399_9302 = new Matrix4f();
		aClass399_9303 = new Matrix4f();
		aFloatArrayArray9402 = new float[6][4];
		aFloat9310 = 1.0F;
		aFloat9312 = 1.0F;
		aFloat9313 = 50.0F;
		aFloat9314 = 3584.0F;
		aBool9427 = true;
		aBool9333 = true;
		aFloatArray9298 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		aFloatArray9329 = new float[] { 0.0F, 0.0F, -1.0F, 0.0F };
		aFloatArray9355 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		aFloatArray9338 = new float[] { 0.0F, 0.0F, 1.0F, 0.0F };
		anInt9339 = 16777215;
		aFloat9340 = 1.0F;
		aFloat9321 = 1.0F;
		aFloat9320 = 1.0F;
		aFloat9331 = 1.0F;
		aFloat9344 = -1.0F;
		aFloat9345 = -1.0F;
		anInt9336 = 8;
		shadowScale = 3;
		aClass302Array9326 = new Class302[16];
		aClass309Array9381 = new Class309[4];
		aBool9388 = true;
		anInt9293 = -1;
		anInt9390 = -1;
		anInt9365 = 1;
		anInt9395 = -1;
		aClass308_9325 = Class308.aClass308_3322;
		aBool9397 = true;
		aBool9398 = true;
		aClass143_Sub2Array9327 = new NativeModel[8];
		aClass143_Sub2Array9261 = new NativeModel[8];
		aClass399_9428 = new Matrix4f();
		aClass405_9429 = new Class405();

		try {
			this.shaders = shaders;
			anInt9400 = i;
			endianness = i_223_;
			Class44.method1067(false, true);

			if (anInterface19_1546 != null) {
				aClass321_9360 = new Native2DTextureCache(this, anInterface19_1546);
			} else {
				aClass321_9360 = null;
			}

			if (endianness == 0) {
				anIntArray9342 = Class598.HSL_TABLE;
			} else {
				anIntArray9342 = EnvironmentContext.anIntArray8169;
			}

			try {
				Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
				field.setAccessible(true);
				unsafe = (Unsafe) field.get(null);
			} catch (Exception exception) {

			}

			method14589(4194304);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method2373();
			if (throwable instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) throwable;
			}
			throw new RuntimeException("");
		}
		method2824(method2808(131072));
	}

	public void method14583(Deletable destroyable) {
		aClass45_9254.remove(destroyable);
	}

	public abstract boolean method14585();

	public abstract boolean method14586();

	public final NativeCubeMapTexture method14587() {
		return aClass138_Sub1_9382 != null ? aClass138_Sub1_9382.getTexture() : null;
	}

	public void method14589(int i) {
		if (i > anInt9282) {
			anInt9282 = i;
			aByteBuffer9279 = ByteBuffer.allocateDirect(anInt9282);
			aByteBuffer9279.order(ByteOrder.nativeOrder());
			aLong9268 = DirectBufferHelper.getDirectBufferAddress(aByteBuffer9279);
		}
	}

	public final void method14596() {
		anInterface38Array9354 = new NativeTexture[anInt9406];
		aClass399Array9396 = new Matrix4f[anInt9406];
		aClass336Array9356 = new Class336[anInt9406];
		aClass347Array9357 = new Class347[anInt9406];
		aClass347Array9358 = new Class347[anInt9406];
		for (int i = 0; i < anInt9406; i++) {
			aClass347Array9358[i] = Class347.aClass347_3671;
			aClass347Array9357[i] = Class347.aClass347_3671;
			aClass336Array9356[i] = Class336.aClass336_3610;
			aClass399Array9396[i] = new Matrix4f();
		}
		aClass480_Sub23Array9346 = new PointLight[anInt9407 - 2];
		int[] is = { -1 };
		anInterface29_9361 = method14717(1, 1, false, is, 0, 0);
		is[0] = -16777216;
		anInterface29_9362 = method14717(1, 1, false, is, 0, 0);
		method2824(new Class480_Sub5_Sub2(262144));
		aClass323_9423 = method14696(new Class320[] { new Class320(new Class316[] { Class316.aClass316_3,
				Class316.aClass316_9 }) });
		aClass323_9291 = method14696(new Class320[] { new Class320(new Class316[] { Class316.aClass316_3,
				Class316.aClass316_2 }) });
		aClass323_9375 = method14696(new Class320[] { new Class320(Class316.aClass316_3),
				new Class320(Class316.aClass316_2), new Class320(Class316.aClass316_9),
				new Class320(Class316.aClass316_1) });
		aClass323_9421 = method14696(new Class320[] { new Class320(Class316.aClass316_3),
				new Class320(Class316.aClass316_2), new Class320(Class316.aClass316_9) });
		for (int i = 0; i < 8; i++) {
			aClass143_Sub2Array9327[i] = new NativeModel(this, 0, 0, false, false);
			aClass143_Sub2Array9261[i] = new NativeModel(this, 0, 0, true, true);
		}
		method14597();
		anInterface36_9389 = createElementArrayBuffer(true);
		method14598();
		method2421();
		method2405();
		aClass116_Sub3_9416 = new NativeSprite(this, anInterface29_9361);
		aClass116_Sub3_9425 = new NativeSprite(this, anInterface29_9362);
		method2426(3, 0);
	}

	public abstract float method14608();

	public final void method14609(int i, Class344 class344) {
		method14673(i, class344, false);
	}

	public abstract void method14620(int i, NativeArrayBuffer interface32);

	public final void method14648(Class336 class336) {
		aClass336Array9356[anInt9353] = class336;
		method14899();
	}

	public final int method14665() {
		return anInt9353;
	}

	public final void method14666(int i) {
		if (anInt9353 != i) {
			anInt9353 = i;
			method14681();
		}
	}

	public abstract void method14667();

	public final void method14668(int i) {
		switch (i) {
			case 3:
				method14669(Class347.aClass347_3672, Class347.aClass347_3671);
				break;
			case 4:
				method14669(Class347.aClass347_3674, Class347.aClass347_3674);
				break;
			case 0:
				method14669(Class347.aClass347_3671, Class347.aClass347_3671);
				break;
			case 1:
				method14669(Class347.aClass347_3673, Class347.aClass347_3673);
				break;
			case 2:
				method14669(Class347.aClass347_3675, Class347.aClass347_3673);
				break;
		}
	}

	public final void method14669(Class347 class347, Class347 class347_90_) {
		boolean bool = false;
		if (aClass347Array9357[anInt9353] != class347) {
			aClass347Array9357[anInt9353] = class347;
			method14678();
			bool = true;
		}
		if (aClass347Array9358[anInt9353] != class347_90_) {
			aClass347Array9358[anInt9353] = class347_90_;
			method14682();
			bool = true;
		}
		if (bool) {
			anInt9294 &= ~0xd;
		}
	}

	public final void method14670(int i, Class344 class344) {
		method14671(i, class344, false, false);
	}

	public void method14674(int i) {
		if (i != anInt9384) {
			anInt9384 = i;
			method14679();
		}
	}

	public final Matrix4f method14676() {
		return aClass399Array9396[anInt9353];
	}

	public final void method14689(NativeTexture texture) {
		if (anInterface38Array9354[anInt9353] != texture) {
			anInterface38Array9354[anInt9353] = texture;

			if (texture != null) {
				texture.method301();
			} else {
				anInterface29_9361.method301();
			}

			anInt9294 &= ~0x1;
		}
	}

	public abstract void method14697(Class323 class323);

	public final void method14705() {
		method14706(Class333.aClass333_3598, 2);
	}

	public abstract void method14707(Class333 class333, int i, int i_154_);

	public final void method14709() {
		if (anInt9294 != 2) {
			method14741();
			method14690(false);
			method14619(false);
			method14643(false);
			method14644(false);
			method14893(1);
			method14685((byte) 0);
			anInt9294 = 2;
		}
	}

	public abstract void method14735(Matrix4f class399);

	public final NativeHeapBuffer allocateHeapBuffer(int size, boolean bool) {
		return heap.allocate(size, bool);
	}

	public abstract void method14773(Class333 class333, int i, int i_182_, int i_183_, int i_184_);

	public abstract void method14789(Matrix4f class399, Matrix4f class399_185_, Matrix4f class399_186_);

	public void method14863(Deletable interface33) {
		aClass45_9254.add(interface33);
	}

	public abstract Program loadProgram(String string);

	public abstract boolean method14964(boolean bool);

	@Override
	public void method2375(int i) {
		if (aClass321_9360 != null) {
			aClass321_9360.sweep();
		}
		anInt9401 = i & 0x7fffffff;
	}

	@Override
	public final int offheapSize() {
		return anInt9275 + allocatedTextureSize + anInt9304;
	}

	@Override
	public final boolean method2378() {
		return true;
	}

	@Override
	public final boolean method2379() {
		return true;
	}

	@Override
	public final void setFogColour(int i, int i_208_, int i_209_) {
		if (anInt9293 != i || anInt9390 != i_208_ || anInt9391 != i_209_) {
			anInt9293 = i;
			anInt9390 = i_208_;
			anInt9391 = i_209_;
			method14692();
			method14733();
		}
	}

	@Override
	public final boolean method2383() {
		return true;
	}

	@Override
	public final boolean method2384() {
		return aBool9411;
	}

	@Override
	public final boolean method2386() {
		return true;
	}

	@Override
	public final boolean method2387() {
		return false;
	}

	@Override
	public abstract String method2388();

	@Override
	public void method2395(int[] is) {
		is[0] = anInt9319;
		is[1] = anInt9285;
		is[2] = anInt9317;
		is[3] = anInt9322;
	}

	@Override
	public final boolean method2411() {
		if (aClass309Array9381[3] != null && !aClass309Array9381[3].method5514()) {
			boolean bool = aClass315_9341.method5669(aClass309Array9381[3]);
			if (bool) {
				aClass321_9360.clear();
			}
			return bool;
		}
		return false;
	}

	@Override
	public final void method2414(int i, Class150 class150) {
		anInt9385 = i;
		aClass150_9386 = class150;
		aBool9349 = true;
	}

	@Override
	public void method2419(boolean bool) {
		aBool9267 = bool;
	}

	@Override
	public void method2420(float f, float f_83_) {
		aFloat9311 = f;
		aFloat9312 = f_83_;
		method14623();
	}

	@Override
	public final void method2421() {
		if (aClass146_1561 != null) {
			anInt9373 = 0;
			anInt9305 = 0;
			anInt9318 = aClass146_1561.getWidth();
			anInt9394 = aClass146_1561.getHeight();
		} else {
			anInt9394 = 0;
			anInt9318 = 0;
			anInt9373 = 0;
			anInt9305 = 0;
		}
		if (aBool9430) {
			aBool9430 = false;
			method14629();
		}
	}

	@Override
	public void method2424(float f, float f_1_, float f_0_, float[] fs) {
		float f_2_ = aClass399_9302.array[15] + aClass399_9302.array[3] * f + aClass399_9302.array[7] * f_0_
				+ aClass399_9302.array[11] * f_1_;
		float f_3_ = aClass399_9302.array[12] + aClass399_9302.array[0] * f + aClass399_9302.array[4] * f_0_
				+ aClass399_9302.array[8] * f_1_;
		float f_4_ = aClass399_9302.array[13] + aClass399_9302.array[1] * f + aClass399_9302.array[5] * f_0_
				+ aClass399_9302.array[9] * f_1_;
		float f_5_ = aClass399_9281.array[14] + aClass399_9281.array[2] * f + aClass399_9281.array[6] * f_0_
				+ aClass399_9281.array[10] * f_1_;
		fs[0] = aFloat9403 + aFloat9364 * f_3_ / f_2_;
		fs[1] = aFloat9343 + aFloat9308 * f_4_ / f_2_;
		fs[2] = f_5_;
	}

	@Override
	public final void method2425(int[] is) {
		is[0] = anInt9305;
		is[1] = anInt9373;
		is[2] = anInt9318;
		is[3] = anInt9394;
	}

	@Override
	public final void method2434(int i, int i_210_, int i_211_, int i_212_, int i_213_, int i_214_) {
		if (aBool9411 && anInt9400 != 0) {
			method14908(false);
		}
		if (aBool9427) {
			method2473(false);
			aClass116_Sub3_9416.method2082(i, i_210_, i_211_, i_212_, 0, i_213_, i_214_);
			method2473(true);
		} else {
			aClass116_Sub3_9416.method2082(i, i_210_, i_211_, i_212_, 0, i_213_, i_214_);
		}
		if (aBool9411 && anInt9400 != 0) {
			method14908(true);
		}
	}

	@Override
	public final void method2435(int i, int i_104_, float f, int i_105_, int i_106_, float f_107_, int i_108_,
			int i_109_, float f_110_, int i_111_, int i_112_, int i_113_, int i_114_) {

	}

	@Override
	public final void method2440(int i, int i_147_, int i_148_, int i_149_, int i_150_, int i_151_,
			ClippingMask class129, int i_152_, int i_153_) {

	}

	@Override
	public void method2441(int i, int i_127_, int i_128_, int i_129_, int i_130_, int i_131_, int i_132_, int i_133_,
			int i_134_) {
		float f = (float) i_128_ - (float) i;
		float f_135_ = (float) i_129_ - (float) i_127_;
		if (f == 0.0F && f_135_ == 0.0F) {
			f = 1.0F;
		} else {
			float f_136_ = (float) (1.0 / Math.sqrt(f * f + f_135_ * f_135_));
			f *= f_136_;
			f_135_ *= f_136_;
		}
		method14741();
		Class302 class302 = aClass302Array9326[13];
		class302.method5480();
		class302.method5490(i_130_);
		method14893(i_131_);
		class302.method5473();
		method14908(false);
		i_134_ %= i_133_ + i_132_;
		float f_137_ = f * i_132_;
		float f_138_ = f_135_ * i_132_;
		float f_139_ = 0.0F;
		float f_140_ = 0.0F;
		float f_141_ = f_137_;
		float f_142_ = f_138_;
		if (i_134_ > i_132_) {
			f_139_ = f * (i_132_ + i_133_ - i_134_);
			f_140_ = f_135_ * (i_132_ + i_133_ - i_134_);
		} else {
			f_141_ = f * (i_132_ - i_134_);
			f_142_ = f_135_ * (i_132_ - i_134_);
		}
		float f_143_ = i + f_139_;
		float f_144_ = i_127_ + f_140_;
		float f_145_ = f * i_133_;
		float f_146_ = f_135_ * i_133_;
		for (;;) {
			if (i_128_ > i) {
				if (f_143_ > i_128_) {
					break;
				}
				if (f_143_ + f_141_ > i_128_) {
					f_141_ = i_128_ - f_143_;
				}
			} else {
				if (f_143_ < i_128_) {
					break;
				}
				if (f_143_ + f_141_ < i_128_) {
					f_141_ = i_128_ - f_143_;
				}
			}
			if (i_129_ > i_127_) {
				if (f_144_ > i_129_) {
					break;
				}
				if (f_144_ + f_142_ > i_129_) {
					f_142_ = i_129_ - f_144_;
				}
			} else {
				if (f_144_ < i_129_) {
					break;
				}
				if (f_144_ + f_142_ < i_129_) {
					f_142_ = i_129_ - f_144_;
				}
			}
			if (!method14747(f_143_, f_144_, 0.0F, f_143_ + f_141_, f_144_ + f_142_, 0.0F)) {
				return;
			}
			method14704();
			f_143_ += f_145_ + f_141_;
			f_144_ += f_146_ + f_142_;
			f_141_ = f_137_;
			f_142_ = f_138_;
		}
		method14908(true);
		class302.method5475();
	}

	@Override
	public void method2446() {
		if (aClass346_9366 != null) {
			aClass346_9366.method5936();
		}
	}

	@Override
	public void method2447(Class405 class405, Class139 class139, Class379 class379) {
		Matrix4f class399 = aClass399_9324;
		class399.method6548(class405);
		class399.method6547(aClass399_9302);
		class139.method2870(class379, aClass399_9418, class399, aFloat9403, aFloat9343, aFloat9364, aFloat9308);
	}

	@Override
	public final Sprite createSprite(int width, int height, boolean transparent, boolean bool_216_) {
		return new NativeSprite(this, width, height, transparent, bool_216_);
	}

	@Override
	public final Sprite createSprite(int[] is, int offset, int i_16_, int i_17_, int i_18_, boolean copy) {
		return new NativeSprite(this, i_17_, i_18_, is, offset, i_16_);
	}

	@Override
	public final Sprite createSprite(Image image, boolean indexed) {
		Sprite sprite;
		if (image.getWidth() != 0 && image.getHeight() != 0) {
			int[] argb = image.argb(false);
			sprite = createSprite(argb, 0, image.getWidth(), image.getWidth(), image.getHeight());
		} else {
			sprite = createSprite(new int[] { 0 }, 0, 1, 1, 1);
		}

		sprite.setOffsets(image.getOffsetX(), image.getOffsetY(), image.getDeltaWidth(), image.getDeltaHeight());
		return sprite;
	}

	@Override
	public void method2456() {
		if (aClass346_9366 != null) {
			aClass346_9366.method5939();
		}
	}

	@Override
	public void method2457() {
		if (aClass346_9366 != null) {
			aClass346_9366.method5915();
		}
	}

	@Override
	public final ClippingMask createClippingMask(int width, int height, int[] offsets, int[] widths) {
		return NativeClippingMask.create(this, width, height, offsets, widths);
	}

	@Override
	public final Matrix4f method2462() {
		return aClass399_9428;
	}

	@Override
	public final Class405 method2463() {
		return aClass405_9429;
	}

	@Override
	public final void method2464(int i) {

	}

	@Override
	public final Model createModel(BaseModel base, int attributes, int i_24_, int ambience, int contrast) {
		return new NativeModel(this, base, attributes, ambience, contrast, i_24_);
	}

	@Override
	public final boolean method2466() {
		return true;
	}

	@Override
	public final void method2467(int i, ClippingMask class129, int i_155_, int i_156_) {
		method2473(false);
		aClass116_Sub3_9425.method2096(0.0F, 0.0F, method2628().getWidth(), 0.0F, 0.0F, method2628().getHeight(), 0,
				class129, i_155_, i_156_);
		method2473(true);
	}

	@Override
	public final Ground createGround(int i, int i_197_, int[][] is, int[][] is_198_, int i_199_, int i_200_, int i_201_) {
		return new NativeGround(this, i_200_, i_201_, i, i_197_, is, is_198_, i_199_);
	}

	@Override
	public final void method2470(Class137 class137) {
		aClass319_9404.method5723(this, class137);
	}

	@Override
	public final void method2471(Class405 class405) {
		aClass405_9316 = class405;
		aClass399_9281.method6548(aClass405_9316);
		aClass399_9283.copyFrom(aClass399_9281);
		aClass399_9283.method6569();
		aClass405_9280.copyFrom(class405);
		aClass405_9280.method6735();
		aClass399_9323.method6548(aClass405_9280);
		method14631();
		if (aClass304_9424 == Class304.aClass304_3305) {
			method14632();
		}
	}

	@Override
	public final void method2473(boolean bool) {
		aBool9427 = bool;
		method14661();
	}

	@Override
	public final void method2476(float f) {
		if (aFloat9331 != f) {
			aFloat9331 = f;
			method14604();
			method14651();
		}
	}

	@Override
	public final void method2477(int i, float f, float f_77_, float f_78_, float f_79_, float f_80_) {
		boolean bool = anInt9339 != i;
		f *= 0.5F;
		f_77_ *= 0.5F;
		if (bool || aFloat9344 != f || aFloat9345 != f_77_) {
			anInt9339 = i;
			aFloat9344 = f;
			aFloat9345 = f_77_;
			if (bool) {
				aFloat9340 = (anInt9339 & 0xff0000) / 1.671168E7F;
				aFloat9321 = (anInt9339 & 0xff00) / 65280.0F;
				aFloat9320 = (anInt9339 & 0xff) / 255.0F;
				method14604();
			}
			method14649();
		}
		if (aFloatArray9355[0] != f_78_ || aFloatArray9355[1] != f_79_ || aFloatArray9355[2] != f_80_) {
			aFloatArray9355[0] = f_78_;
			aFloatArray9355[1] = f_79_;
			aFloatArray9355[2] = f_80_;
			aFloatArray9338[0] = -f_78_;
			aFloatArray9338[1] = -f_79_;
			aFloatArray9338[2] = -f_80_;
			float f_81_ = (float) (1.0 / Math.sqrt(f_78_ * f_78_ + f_79_ * f_79_ + f_80_ * f_80_));
			aFloatArray9298[0] = f_78_ * f_81_;
			aFloatArray9298[1] = f_79_ * f_81_;
			aFloatArray9298[2] = f_80_ * f_81_;
			aFloatArray9329[0] = -aFloatArray9298[0];
			aFloatArray9329[1] = -aFloatArray9298[1];
			aFloatArray9329[2] = -aFloatArray9298[2];
			method14650();
			sunProjectionX = (int) (f_78_ * 256.0F / f_79_);
			sunProjectionZ = (int) (f_80_ * 256.0F / f_79_);
		}
		method14651();
	}

	@Override
	public final void method2478(int i) {
		shadowScale = 0;
		for (; i > 1; i >>= 1) {
			shadowScale++;
		}
		anInt9336 = 1 << shadowScale;
	}

	@Override
	public final int method2480() {
		return anInt9407 - 2;
	}

	@Override
	public final void method2482(int i, PointLight[] class480_sub23s) {
		for (int i_219_ = 0; i_219_ < i; i_219_++) {
			aClass480_Sub23Array9346[i_219_] = class480_sub23s[i_219_];
		}
		anInt9348 = i;
	}

	@Override
	public final CubeMapTextureProvider createCubeMapTextureProvider(int id) {
		return new LazyNativeCubeMapTextureProvider(this, id);
	}

	@Override
	public final void setCubeMapTextureProvider(CubeMapTextureProvider provider) {
		this.aClass138_Sub1_9382 = (NativeCubeMapTextureProvider) provider;
	}

	@Override
	public final void method2487(int i, int i_94_) {
		if (aClass315_9341 != null) {
			aClass315_9341.method5675(i, i_94_);
		}
	}

	@Override
	public boolean method2489() {
		return aClass309Array9381[1] != null && aClass309Array9381[1].method5514();
	}

	@Override
	public void method2490(float f, float f_8_, float f_9_, float f_10_, float f_11_) {
		Class309_Sub1.aFloat9707 = f;
		Class309_Sub1.aFloat9714 = f_8_;
		Class309_Sub1.aFloat9715 = f_9_;
		Class309_Sub1.aFloat9716 = f_10_;
		Class309_Sub1.aFloat9717 = f_11_;
	}

	@Override
	public Class118 method2491(int[] argb) {
		return new Class118_Sub2(this, argb);
	}

	@Override
	public boolean method2492() {
		return aClass309Array9381[2] != null && aClass309Array9381[2].method5514();
	}

	@Override
	public void method2493(Class118 class118, float f, Class118 class118_12_, float f_13_, Class118 class118_14_,
			float f_15_) {
		int i = 0;
		if (class118_14_ == null && f_15_ > 0.0F) {
			f_15_ = 0.0F;
		}
		if (class118_12_ == null && f_13_ > 0.0F) {
			class118_12_ = class118_14_;
			class118_14_ = null;
			f_13_ = f_15_;
			f_15_ = 0.0F;
		}
		if (class118 == null && f > 0.0F) {
			class118 = class118_12_;
			class118_12_ = class118_14_;
			class118_14_ = null;
			f = f_13_;
			f_13_ = f_15_;
			f_15_ = 0.0F;
		}
		Class309_Sub3.aClass118_Sub2Array9904[0] = (Class118_Sub2) class118;
		Class309_Sub3.aFloatArray9906[0] = f;
		if (f > 0.0F) {
			i++;
		}
		Class309_Sub3.aClass118_Sub2Array9904[1] = (Class118_Sub2) class118_12_;
		Class309_Sub3.aFloatArray9906[1] = f_13_;
		if (f_13_ > 0.0F) {
			i++;
		}
		Class309_Sub3.aClass118_Sub2Array9904[2] = (Class118_Sub2) class118_14_;
		Class309_Sub3.aFloatArray9906[2] = f_15_;
		if (f_15_ > 0.0F) {
			i++;
		}
		Class309_Sub3.anInt9903 = i;
		Class309_Sub3.aFloat9909 = 1.0F - (f + f_13_ + f_15_);
	}

	@Override
	public void method2494() {
		anInt9319 = 0;
		anInt9285 = 0;
		anInt9317 = aClass146_1561.getWidth();
		anInt9322 = aClass146_1561.getHeight();
		method14623();
	}

	@Override
	public final void method2495() {
		if (aClass309Array9381[3] != null && aClass309Array9381[3].method5514()) {
			aClass315_9341.method5671(aClass309Array9381[3]);
			aClass321_9360.clear();
		}
	}

	@Override
	public final boolean method2496() {
		return aClass309Array9381[3] != null && aClass309Array9381[3].method5514();
	}

	@Override
	public final void method2501() {
		aBool9349 = false;
	}

	@Override
	public void method2502(float f, float f_52_, float f_51_, float[] fs) {
		float f_53_ = aClass399_9302.array[14] + aClass399_9302.array[2] * f + aClass399_9302.array[6] * f_51_
				+ aClass399_9302.array[10] * f_52_;
		float f_54_ = aClass399_9302.array[15] + aClass399_9302.array[3] * f + aClass399_9302.array[7] * f_51_
				+ aClass399_9302.array[11] * f_52_;
		if (f_53_ < -f_54_ || f_53_ > f_54_) {
			float[] fs_55_ = fs;
			float[] fs_56_ = fs;
			fs[2] = Float.NaN;
			fs_56_[1] = Float.NaN;
			fs_55_[0] = Float.NaN;
		} else {
			float f_57_ = aClass399_9302.array[12] + aClass399_9302.array[0] * f + aClass399_9302.array[4] * f_51_
					+ aClass399_9302.array[8] * f_52_;
			if (f_57_ < -f_54_ || f_57_ > f_54_) {
				float[] fs_58_ = fs;
				float[] fs_59_ = fs;
				fs[2] = Float.NaN;
				fs_59_[1] = Float.NaN;
				fs_58_[0] = Float.NaN;
			} else {
				float f_60_ = aClass399_9302.array[13] + aClass399_9302.array[1] * f + aClass399_9302.array[5] * f_51_
						+ aClass399_9302.array[9] * f_52_;
				if (f_60_ < -f_54_ || f_60_ > f_54_) {
					float[] fs_61_ = fs;
					float[] fs_62_ = fs;
					fs[2] = Float.NaN;
					fs_62_[1] = Float.NaN;
					fs_61_[0] = Float.NaN;
				} else {
					float f_63_ = aClass399_9281.array[14] + aClass399_9281.array[2] * f + aClass399_9281.array[6]
							* f_51_ + aClass399_9281.array[10] * f_52_;
					fs[0] = aFloat9403 + aFloat9364 * f_57_ / f_54_;
					fs[1] = aFloat9343 + aFloat9308 * f_60_ / f_54_;
					fs[2] = f_63_;
				}
			}
		}
	}

	@Override
	public final void method2511(int i, int i_45_, int i_46_, int i_47_) {
		int i_48_;
		int i_49_;
		if (aClass146_1561 != null) {
			i_49_ = aClass146_1561.getWidth();
			i_48_ = aClass146_1561.getHeight();
		} else {
			i_48_ = 0;
			i_49_ = 0;
		}
		i = i >= 0 ? i : 0;
		i_46_ = i_46_ <= i_49_ ? i_46_ : i_49_;
		i_45_ = i_45_ >= 0 ? i_45_ : 0;
		i_47_ = i_47_ <= i_48_ ? i_47_ : i_48_;
		boolean bool = false;
		if (anInt9305 < i) {
			anInt9305 = i;
			bool = true;
		}
		if (anInt9318 > i_46_) {
			anInt9318 = i_46_;
			bool = true;
		}
		if (anInt9373 < i_45_) {
			anInt9373 = i_45_;
			bool = true;
		}
		if (anInt9394 > i_47_) {
			anInt9394 = i_47_;
			bool = true;
		}
		if (bool) {
			if (!aBool9430 && (aBool9267 || method14715() == Class306.aClass306_3313)) {
				aBool9430 = true;
				method14629();
			}
			if (aBool9430) {
				method14968();
			}
		}
	}

	@Override
	public final boolean method2539() {
		return true;
	}

	@Override
	public final void method2540(Matrix4f class399) {
		aClass399_9418.copyFrom(class399);
		method14631();
		if (aClass304_9424 == Class304.aClass304_3305) {
			method14700();
		}
	}

	@Override
	public void method2566(int i, int i_37_, int i_38_, int i_39_) {
		anInt9319 = i;
		anInt9285 = i_37_;
		anInt9317 = i_38_;
		anInt9322 = i_39_;
		method14623();
	}

	@Override
	public final Matrix4f method2575() {
		return aClass399_9418;
	}

	@Override
	public int method2586(int i, int i_64_, int i_65_, int i_66_, int i_67_, int i_68_) {
		int i_69_ = 0;
		float f = aClass399_9302.array[14] + aClass399_9302.array[2] * i + aClass399_9302.array[6] * i_64_
				+ aClass399_9302.array[10] * i_65_;
		float f_70_ = aClass399_9302.array[14] + aClass399_9302.array[2] * i_66_ + aClass399_9302.array[6] * i_67_
				+ aClass399_9302.array[10] * i_68_;
		float f_71_ = aClass399_9302.array[15] + aClass399_9302.array[3] * i + aClass399_9302.array[7] * i_64_
				+ aClass399_9302.array[11] * i_65_;
		float f_72_ = aClass399_9302.array[15] + aClass399_9302.array[3] * i_66_ + aClass399_9302.array[7] * i_67_
				+ aClass399_9302.array[11] * i_68_;
		if (f < -f_71_ && f_70_ < -f_72_) {
			i_69_ |= 0x10;
		} else if (f > f_71_ && f_70_ > f_72_) {
			i_69_ |= 0x20;
		}
		float f_73_ = aClass399_9302.array[12] + aClass399_9302.array[0] * i + aClass399_9302.array[4] * i_64_
				+ aClass399_9302.array[8] * i_65_;
		float f_74_ = aClass399_9302.array[12] + aClass399_9302.array[0] * i_66_ + aClass399_9302.array[4] * i_67_
				+ aClass399_9302.array[8] * i_68_;
		if (f_73_ < -f_71_ && f_74_ < -f_72_) {
			i_69_ |= 0x1;
		}
		if (f_73_ > f_71_ && f_74_ > f_72_) {
			i_69_ |= 0x2;
		}
		float f_75_ = aClass399_9302.array[13] + aClass399_9302.array[1] * i + aClass399_9302.array[5] * i_64_
				+ aClass399_9302.array[9] * i_65_;
		float f_76_ = aClass399_9302.array[13] + aClass399_9302.array[1] * i_66_ + aClass399_9302.array[5] * i_67_
				+ aClass399_9302.array[9] * i_68_;
		if (f_75_ < -f_71_ && f_76_ < -f_72_) {
			i_69_ |= 0x4;
		}
		if (f_75_ > f_71_ && f_76_ > f_72_) {
			i_69_ |= 0x8;
		}
		return i_69_;
	}

	@Override
	public final Font createFont(FontSpecification specification, Image[] images, boolean bool) {
		return new NativeFont(this, specification, images, bool);
	}

	@Override
	public final void method2625(int i, int i_98_, int i_99_, int i_100_, int i_101_, int i_102_) {
		i_99_--;
		i_100_--;
		int i_103_ = 0;
		if (this instanceof OpenGlXToolkit) {
			i_103_ = -1;
		}

		if (aBool9411 && anInt9400 != 0) {
			method14908(false);
		}

		method2783(i, i_98_ + i_103_, i + i_99_, i_98_ + i_103_, i_101_, i_102_);
		method2783(i, i_98_ + i_100_ + i_103_, i + i_99_, i_98_ + i_100_ + i_103_, i_101_, i_102_);
		method2783(i, i_98_, i, i_98_ + i_100_, i_101_, i_102_);
		method2783(i + i_99_, i_98_, i + i_99_, i_98_ + i_100_, i_101_, i_102_);

		if (aBool9411 && anInt9400 != 0) {
			method14908(true);
		}
	}

	@Override
	public final Sprite method2630(int i, int i_19_, int i_20_, int i_21_, boolean bool) {
		NativeSprite sprite = new NativeSprite(this, i_20_, i_21_, bool, false);
		sprite.method2088(0, 0, i_20_, i_21_, i, i_19_);
		return sprite;
	}

	@Override
	public final int method2637(int functionMask, int i_193_) {
		return functionMask & i_193_ ^ i_193_;
	}

	@Override
	public final boolean method2678() {
		return aClass315_9341 != null && aClass315_9341.aBool3353;
	}

	@Override
	public final boolean method2688() {
		return aClass309Array9381[3] != null;
	}

	@Override
	public final int mergeFunctionMasks(int i, int i_218_) {
		return i | i_218_;
	}

	@Override
	public final void method2730(int i, int i_85_, int i_86_, int i_87_) {
		if (aClass315_9341 != null) {
			for (int i_88_ = 0; i_88_ < aClass309Array9381.length; i_88_++) {
				if (aClass309Array9381[i_88_] != null && aClass309Array9381[i_88_].method5514()
						&& !aClass309Array9381[i_88_].method5516()) {
					if (!aClass315_9341.method5690(i, i_85_, i_86_, i_87_)) {
						aClass315_9341.method5666();
						aClass315_9341 = null;
					}
					break;
				}
			}
		}
	}

	@Override
	public final void method2748(int i, int i_27_, int i_28_, int i_29_, int i_30_, int i_31_, int i_32_) {
		i += 1.0F;
		i_27_ += 1.0F;
		i_28_ += 1.0F;
		i_29_ += 1.0F;
		float f = i_28_ - i;
		float f_33_ = i_29_ - i_27_;
		float f_34_ = 1.0F / (float) Math.sqrt(f * f + f_33_ * f_33_);
		f *= f_34_;
		f_33_ *= f_34_;
		i -= f;
		i_27_ -= f_33_;
		float f_35_ = -f_33_;
		float f_36_ = f;
		f_35_ *= 0.5F * i_31_;
		f_36_ *= 0.5F * i_31_;
		aClass116_Sub3_9416.method2093(i - f_35_, i_27_ - f_36_, i_28_ - f_35_, i_29_ - f_36_, i + f_35_,
				i_27_ + f_36_, 0, i_30_, i_32_);
	}

	@Override
	public Class405 method2754() {
		return aClass405_9316;
	}

	@Override
	public final void method2760(int i, int i_40_, int i_41_, int i_42_) {
		int i_43_;
		int i_44_;
		if (aClass146_1561 != null) {
			i_44_ = aClass146_1561.getWidth();
			i_43_ = aClass146_1561.getHeight();
		} else {
			i_43_ = 0;
			i_44_ = 0;
		}
		if (i <= 0 && i_41_ >= i_44_ - 1 && i_40_ <= 0 && i_42_ >= i_43_ - 1) {
			method2421();
		} else {
			anInt9305 = i >= 0 ? i : 0;
			anInt9318 = i_41_ <= i_44_ ? i_41_ : i_44_;
			anInt9373 = i_40_ >= 0 ? i_40_ : 0;
			anInt9394 = i_42_ <= i_43_ ? i_42_ : i_43_;
			if (!aBool9430 && (aBool9267 || method14715() == Class306.aClass306_3313)) {
				aBool9430 = true;
				method14629();
			}
			if (aBool9430) {
				method14968();
			}
		}
	}

	@Override
	public final void method2783(int i, int i_202_, int i_203_, int i_204_, int i_205_, int i_206_) {
		method2748(i, i_202_, i_203_, i_204_, i_205_, 1, i_206_);
	}

	@Override
	public final void method2804(int i, Class150 class150) {
		if (!aBool9349) {
			throw new RuntimeException("");
		}
		anInt9385 = i;
		aClass150_9386 = class150;
		if (aBool9410) {
			aClass302Array9326[3].method5477();
			aClass302Array9326[3].method5478();
		}
	}

	@Override
	public final Class480_Sub5 method2808(int i) {
		Class480_Sub5_Sub2 class480_sub5_sub2 = new Class480_Sub5_Sub2(i);
		aClass644_9273.pushBack(class480_sub5_sub2);
		return class480_sub5_sub2;
	}

	@Override
	public void method2813(int i, int i_171_, int i_172_, int i_173_, int i_174_, int i_175_, ClippingMask class129,
			int i_176_, int i_177_, int i_178_, int i_179_, int i_180_) {

	}

	@Override
	public final boolean method2820() {
		return true;
	}

	@Override
	public final void method2824(Class480_Sub5 class480_sub5) {
		heap = ((Class480_Sub5_Sub2) class480_sub5).aNativeHeap11248;
	}

	void method14584() {
		ArrayList arraylist = aClass45_9254.toList();
		Iterator<Deletable> iterator = arraylist.iterator();

		while (iterator.hasNext()) {
			Deletable interface33 = iterator.next();
			interface33.deleteImmediately();
		}
	}

	final boolean isFixedFunction() {
		return fixedFunction;
	}

	ByteBuffer allocate(int capacity) {
		ByteBuffer buffer = ByteBuffer.allocateDirect(capacity);
		buffer.order(ByteOrder.nativeOrder());
		return buffer;
	}

	long getAddress(ByteBuffer buffer) {
		return DirectBufferHelper.getDirectBufferAddress(buffer);
	}

	final void method14597() {
		aClass294_9383 = new Class294(this);
		fixedFunction = false;
		try {
			aClass259_9334 = new Class259_Sub2(this);
			aClass299_9370 = new Class299_Sub2(this);
			aClass298_9371 = new Class298_Sub1(this);
			aClass290_9426 = new Class290_Sub1(this);
			aClass302_Sub1_Sub1_9363 = new Class302_Sub1_Sub1(this, aClass294_9383, false);
			aClass302_Sub1_Sub1_9374 = new Class302_Sub1_Sub1(this, aClass294_9383, true);
			aClass302_Sub1_Sub2_9306 = new Class302_Sub1_Sub2(this, aClass294_9383);
		} catch (Exception exception) {
			exception.printStackTrace();
			aClass259_9334 = new Class259_Sub1(this);
			aClass299_9370 = new Class299_Sub1(this);
			aClass298_9371 = new Class298_Sub2(this);
			aClass290_9426 = new Class290_Sub2(this);
			aClass302_Sub1_Sub1_9363 = null;
			aClass302_Sub1_Sub1_9374 = null;
			aClass302_Sub1_Sub2_9306 = null;
			fixedFunction = true;
		}
		if (!fixedFunction) {
			int i;
			int i_6_;
			if (aClass146_1561 != null) {
				i_6_ = aClass146_1561.getWidth();
				i = aClass146_1561.getHeight();
			} else {
				i = 0;
				i_6_ = 0;
			}
			aClass315_9341 = new Class315(this, i_6_, i);
			aClass309Array9381[3] = new Class309_Sub2(this);
			aClass309Array9381[1] = new Class309_Sub1(this);
			aClass309Array9381[2] = new Class309_Sub3(this);
			if (aClass309Array9381[3].method5503()) {
				aClass315_9341.method5669(aClass309Array9381[3]);
			}
			aClass315_9341.method5669(aClass309Array9381[1]);
			aClass315_9341.method5669(aClass309Array9381[2]);
			method14616();
			method14614();
		}
		if (aClass302_9367 != null) {
			aClass302_9367.method5475();
			aClass302_9367 = null;
		}
		method14638();
	}

	void method14598() {
		method14686(7);
		method14599();
	}

	final void method14599() {
		method14604();
		method14649();
		method14953();
		method14653();
		method14650();
		method14651();
		method14621();
		method14645();
		method14661();
		method14733();
		method14693();
		method14625();
		method14688();
		method14720();
		for (int i = anInt9406 - 1; i >= 0; i--) {
			method14666(i);
			method14678();
			method14682();
			method14640();
		}
		method14679();
		method14627();
	}

	final void method14601() {
		anInterface32_9417 = createArrayBuffer(false);
		int i = 160;
		anInterface32_9417.reallocate(i, 32);
		aByteBuffer9279.clear();
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putInt(-1);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putInt(-1);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putInt(-1);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putInt(-1);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(1.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putInt(-1);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		anInterface32_9417.read(0, aByteBuffer9279.position(), aLong9268);
		aClass323_9420 = method14696(new Class320[] { new Class320(new Class316[] { Class316.aClass316_3,
				Class316.aClass316_2, Class316.aClass316_9, Class316.aClass316_9 }) });
	}

	final void method14602() {
		anInterface32_9297 = createArrayBuffer(true);
		anInterface32_9297.reallocate(24, 12);
		aClass323_9419 = method14696(new Class320[] { new Class320(Class316.aClass316_3) });
	}

	final void method14603() {
		anInterface32_9422 = createArrayBuffer(false);
		anInterface32_9422.reallocate(3096, 12);
		aByteBuffer9279.clear();
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		aByteBuffer9279.putFloat(0.0F);
		for (int i = 0; i <= 256; i++) {
			double d = i * 2 * Math.PI / 256.0;
			float f = (float) Math.cos(d);
			float f_7_ = (float) Math.sin(d);
			aByteBuffer9279.putFloat(f_7_);
			aByteBuffer9279.putFloat(f);
			aByteBuffer9279.putFloat(0.0F);
		}
		anInterface32_9422.read(0, aByteBuffer9279.position(), aLong9268);
	}

	abstract void method14604();

	void method14612() {
		method14957();
	}

	boolean method14614() {
		if (aClass309Array9381[2] != null && !aClass309Array9381[2].method5514()) {
			boolean bool = aClass315_9341.method5669(aClass309Array9381[2]);
			if (bool) {
				aClass321_9360.clear();
			}
			return bool;
		}
		return false;
	}

	boolean method14616() {
		if (aClass309Array9381[1] != null && !aClass309Array9381[1].method5514()) {
			boolean bool = aClass315_9341.method5669(aClass309Array9381[1]);
			if (bool) {
				aClass321_9360.clear();
			}
			return bool;
		}
		return false;
	}

	final NativeElementArrayBuffer method14618(int i) {
		if (anInterface36_9389.getLength() < i * 2) {
			anInterface36_9389.allocate(i);
		}
		return anInterface36_9389;
	}

	final void method14619(boolean bool) {
		if (bool != aBool9332) {
			aBool9332 = bool;
			method14953();
			anInt9294 &= ~0x7;
		}
	}

	abstract void method14621();

	final void method14623() {
		if (aClass304_9424 == Class304.aClass304_3305) {
			anInt9372 = anInt9319;
			anInt9337 = anInt9285;
			anInt9368 = anInt9317;
			anInt9376 = anInt9322;
			aFloat9309 = aFloat9311;
			aFloat9310 = aFloat9312;
		} else {
			anInt9372 = 0;
			anInt9337 = 0;
			anInt9368 = aClass146_1561.getWidth();
			anInt9376 = aClass146_1561.getHeight();
			aFloat9309 = 0.0F;
			aFloat9310 = 1.0F;
		}
		method14627();
		aFloat9364 = anInt9317 / 2.0F;
		aFloat9308 = anInt9322 / 2.0F;
		aFloat9403 = anInt9319 + aFloat9364;
		aFloat9343 = anInt9285 + aFloat9308;
	}

	abstract void method14625();

	abstract void method14627();

	abstract void method14629();

	final Matrix4f method14630() {
		if (aClass304_9424 == Class304.aClass304_3305) {
			return aClass399_9323;
		}
		return aClass399_9286;
	}

	final void method14631() {
		aClass399_9302.copyFrom(aClass399_9281);
		aClass399_9302.method6547(aClass399_9418);
		aClass399_9302.method6567(aFloatArrayArray9402[0]);
		aClass399_9302.method6568(aFloatArrayArray9402[1]);
		aClass399_9302.method6563(aFloatArrayArray9402[2]);
		aClass399_9302.method6564(aFloatArrayArray9402[3]);
		aClass399_9302.method6632(aFloatArrayArray9402[4]);
		aClass399_9302.method6566(aFloatArrayArray9402[5]);
		aClass399_9303.copyFrom(aClass399_9302);
		method14735(aClass399_9303);
	}

	final void method14632() {
		aBool9295 = false;
	}

	Matrix4f method14633() {
		return aClass399_9278;
	}

	final Matrix4f method14635() {
		return aClass399_9301;
	}

	final void method14637() {
		if (aClass304_9424 != Class304.aClass304_3306) {
			Class304 class304 = aClass304_9424;
			aClass304_9424 = Class304.aClass304_3306;
			if (class304 == Class304.aClass304_3305) {
				method14632();
			}
			aClass399_9300 = aClass399_9299;
			method14700();
			method14623();
			anInt9294 &= ~0xf;
		}
	}

	void method14638() {
		if (aClass315_9341 != null) {
			aClass315_9341.method5668();
		}
		if (aClass309Array9381 != null) {
			for (Class309 element : aClass309Array9381) {
				if (element != null && element.method5514()) {
					element.method5506();
				}
			}
		}
		aClass319_9404 = new Class319(this);
		method14601();
		method14602();
		method14603();
		aClass319_9404.method5714(this);
		if (aBool9408) {
			aClass346_9366 = new Class346(this, 1024);
		}
	}

	final void method14639() {
		aBool9359 = false;
		if (aClass304_9424 == Class304.aClass304_3304) {
			method14641();
			method14700();
		}
	}

	final void method14640() {
		if (aClass336Array9356[anInt9353] != Class336.aClass336_3610) {
			aClass336Array9356[anInt9353] = Class336.aClass336_3610;
			aClass399Array9396[anInt9353].toIdentity();
			method14899();
		}
	}

	final void method14641() {
		if (!aBool9359) {
			int i;
			int i_50_;
			if (aClass146_1561 != null) {
				i_50_ = aClass146_1561.getWidth();
				i = aClass146_1561.getHeight();
			} else {
				i = 0;
				i_50_ = 0;
			}
			Matrix4f class399 = aClass399_9265;
			if (i_50_ != 0 && i != 0) {
				class399.method6555(0.0F, i_50_, 0.0F, i, -1.0F, 1.0F);
			} else {
				class399.toIdentity();
			}
			aClass399_9296.copyFrom(class399);
			method14735(aClass399_9296);
			aBool9359 = true;
		}
	}

	final void method14642() {
		if (!aBool9276) {
			aBool9276 = true;
		}
	}

	final void method14643(boolean bool) {
		if (bool != aBool9307) {
			aBool9307 = bool;
			method14645();
			anInt9294 &= ~0xf;
		}
	}

	final void method14644(boolean bool) {
		if (bool != aBool9330) {
			aBool9330 = bool;
			method14661();
			anInt9294 &= ~0xf;
		}
	}

	abstract void method14645();

	abstract void method14649();

	abstract void method14650();

	abstract void method14651();

	final void method14653() {
		if (isFixedFunction()) {
			method14654();
		}
		anInt9347 = anInt9348;
	}

	abstract void method14654();

	abstract boolean method14655(Class121 class121, Class151 class151);

	abstract boolean method14656(Class121 class121, Class151 class151);

	final Native2DTexture create2DTexture(int width, int height, boolean bool, int[] data) {
		return method14717(width, height, bool, data, 0, 0);
	}

	final Native2DTexture method14658(Class121 class121, int i, int i_84_, boolean bool, float[] fs) {
		return method14699(class121, i, i_84_, bool, fs, 0, 0);
	}

	abstract void method14660(int i);

	abstract void method14661();

	abstract NativeCubeMapTexture createCubeMapTexture(int length, boolean mipmapped, int[][] data);

	abstract Interface40 create2DTexture(Class121 class121, Class151 class151, int i, int i_89_);

	abstract void method14671(int i, Class344 class344, boolean bool, boolean bool_91_);

	abstract NativeElementArrayBuffer createElementArrayBuffer(boolean stream);

	abstract void method14673(int i, Class344 class344, boolean bool);

	final Matrix4f method14675() {
		return aClass399Array9396[anInt9353];
	}

	abstract Native3DTexture create3DTexture(Class121 class121, int width, int height, int depth, boolean bool,
			byte[] data);

	abstract void method14678();

	abstract void method14679();

	abstract void method14680();

	abstract void method14681();

	abstract void method14682();

	final void method14684(int i) {
		if (anInt9395 != i) {
			anInt9395 = i;
			method14688();
		}
	}

	final void method14685(byte i) {
		if (aByte9399 != i) {
			aByte9399 = i;

			if (i == 0) {
				method14684(0);
				method14893(1);
			} else {
				method14684(3);
				method14893(3);
			}

			method14720();
		}
	}

	abstract void method14686(int i);

	abstract void method14688();

	final void method14690(boolean bool) {
		if (bool != aBool9387) {
			aBool9387 = bool;
			method14733();
			anInt9294 &= ~0xf;
		}
	}

	final void method14692() {
		if (aClass302_9367 != null) {
			aClass302_9367.method5478();
		}
		method14693();
	}

	abstract void method14693();

	abstract NativeArrayBuffer createArrayBuffer(boolean bool);

	abstract Class323 method14696(Class320... class320s);

	abstract Native2DTexture method14699(Class121 class121, int i, int i_95_, boolean bool, float[] fs, int i_96_,
			int i_97_);

	final void method14700() {
		aClass399_9301.copyFrom(aClass399_9300);
		method14735(aClass399_9301);
		aFloat9314 = (aClass399_9301.array[14] - aClass399_9301.array[15])
				/ (aClass399_9301.array[11] - aClass399_9301.array[10]);
		aFloat9313 = -aClass399_9301.array[14] / aClass399_9301.array[10];
		method14692();
	}

	Class405 method14702() {
		if (aClass304_9424 == Class304.aClass304_3305) {
			if (!aBool9295) {
				aClass405_9284.copyFrom(aClass405_9277);
				aClass405_9284.method6745(aClass405_9316);
				aClass399_9315.method6548(aClass405_9284);
				aBool9295 = true;
			}
			return aClass405_9284;
		}
		return aClass405_9277;
	}

	final void method14704() {
		method14620(0, anInterface32_9297);
		method14697(aClass323_9419);
		method14707(Class333.aClass333_3599, 0, 1);
	}

	final void method14706(Class333 class333, int i) {
		method14620(0, anInterface32_9417);
		method14697(aClass323_9420);
		method14707(class333, 0, i);
	}

	final void method14710() {
		if (anInt9294 != 8) {
			method14844();
			method14690(true);
			method14643(true);
			method14644(true);
			method14893(1);
			method14685((byte) 0);
			anInt9294 = 8;
		}
	}

	final Matrix4f method14713() {
		return aClass399_9303;
	}

	Class306 method14715() {
		if (aClass346_9366 == null) {
			return Class306.aClass306_3313;
		}
		return aClass346_9366.method5917();
	}

	abstract Native2DTexture method14717(int width, int height, boolean bool, int[] data, int i_158_, int i_159_);

	abstract void method14720();

	void method14731() {
		if (aClass315_9341 != null) {
			aClass315_9341.method5666();
		}
		if (anInterface32_9417 != null) {
			anInterface32_9417.deleteImmediately();
		}
		if (anInterface32_9297 != null) {
			anInterface32_9297.deleteImmediately();
		}
		if (anInterface32_9422 != null) {
			anInterface32_9422.deleteImmediately();
		}
		for (int i = 0; i < 8; i++) {
			if (aClass143_Sub2Array9261[i] != null) {
				aClass143_Sub2Array9261[i].method14537();
			}
		}
		if (aClass319_9404 != null) {
			aClass319_9404.method5712();
		}
		if (anInterface36_9389 != null) {
			anInterface36_9389.deleteImmediately();
		}
		if (aClass346_9366 != null) {
			aClass346_9366.method5909();
			aClass346_9366 = null;
		}
	}

	abstract void method14733();

	final void method14734() {
		aBool9276 = false;
		method14642();
		if (aClass304_9424 == Class304.aClass304_3305) {
			method14700();
		}
	}

	abstract Native2DTexture method14740(Class121 class121, Class151 class151, int i, int i_165_);

	final void method14741() {
		if (aClass304_9424 != Class304.aClass304_3304) {
			Class304 class304 = aClass304_9424;
			aClass304_9424 = Class304.aClass304_3304;
			if (class304 == Class304.aClass304_3305) {
				method14632();
			}
			method14641();
			aClass399_9300 = aClass399_9265;
			method14700();
			method14623();
			anInt9294 &= ~0x8;
		}
	}

	boolean method14747(float f, float f_166_, float f_167_, float f_168_, float f_169_, float f_170_) {
		aByteBuffer9279.clear();
		aByteBuffer9279.putFloat(f);
		aByteBuffer9279.putFloat(f_166_);
		aByteBuffer9279.putFloat(f_167_);
		aByteBuffer9279.putFloat(f_168_);
		aByteBuffer9279.putFloat(f_169_);
		aByteBuffer9279.putFloat(f_170_);
		return anInterface32_9297.read(0, aByteBuffer9279.position(), aLong9268);
	}

	abstract void method14748(NativeElementArrayBuffer interface36);

	byte[] loadShader(String name, String child) {
		return shaders.get(name, child);
	}

	Matrix4f method14758() {
		if (aClass304_9424 == Class304.aClass304_3305) {
			if (!aBool9295) {
				method14702();
			}
			return aClass399_9315;
		}
		return aClass399_9278;
	}

	Class150 method14775() {
		return aClass150_9386;
	}

	abstract Native2DTexture create2DTexture(Class121 class121, int i, int i_190_, boolean bool, byte[] data,
			int i_191_, int i_192_);

	final void method14844() {
		if (aClass304_9424 != Class304.aClass304_3305) {
			aClass304_9424 = Class304.aClass304_3305;
			method14632();
			method14642();
			aClass399_9300 = aClass399_9418;
			method14700();
			method14623();
			anInt9294 &= ~0x7;
		}
	}

	final void method14893(int i) {
		if (anInt9365 != i) {
			Class308 class308;
			boolean bool;
			boolean bool_207_;
			if (i == 1) {
				class308 = Class308.aClass308_3322;
				bool = true;
				bool_207_ = true;
			} else if (i == 2) {
				class308 = Class308.aClass308_3319;
				bool = false;
				bool_207_ = true;
			} else if (i == 128) {
				class308 = Class308.aClass308_3321;
				bool = true;
				bool_207_ = true;
			} else if (i == 3) {
				class308 = Class308.aClass308_3320;
				bool = true;
				bool_207_ = false;
			} else {
				class308 = Class308.aClass308_3320;
				bool = false;
				bool_207_ = false;
			}
			if (bool != aBool9398) {
				aBool9398 = bool;
				method14720();
			}
			if (bool_207_ != aBool9397) {
				aBool9397 = bool_207_;
				method14625();
			}
			if (class308 != aClass308_9325) {
				aClass308_9325 = class308;
				method14688();
			}
			anInt9365 = i;
			anInt9294 &= ~0xc;
		}
	}

	final void method14899() {
		method14680();
	}

	abstract void method14908(boolean bool);

	final Matrix4f method14921() {
		if (aClass304_9424 == Class304.aClass304_3305) {
			return aClass399_9281;
		}
		return aClass399_9286;
	}

	ProgramDefinition method14924(byte[] is) {
		if (is == null) {
			return null;
		}

		ProgramDefinition class239;
		try {
			class239 = new ProgramDefinition(is);
		} catch (Exception exception) {
			return null;
		}
		return class239;
	}

	final void method14946(int i, int i_217_) {
		anInt9292 = i;
		anInt9328 = i_217_;
		method14627();
		if (!aBool9430 && (aBool9267 || method14715() == Class306.aClass306_3313)) {
			aBool9430 = true;
			method14629();
		}
		if (aBool9430) {
			method14968();
		}
	}

	abstract void method14953();

	void method14957() {
		method14639();
		method14734();
		method14637();
		method2494();
		method2421();
	}

	abstract void method14968();

	abstract void method14977(NativeElementArrayBuffer interface36, Class333 class333, int i, int i_220_, int i_221_,
			int i_222_);

	final Native2DTexture create2DTexture(Class121 class121, int i, int i_224_, boolean bool, byte[] data) {
		return create2DTexture(class121, i, i_224_, bool, data, 0, 0);
	}

	@Override
	void method2374() {
		if (!aBool9253) {
			method14731();
			aClass321_9360.clear();
			for (Linkable class480 = aClass644_9273.head(); class480 != null; class480 = aClass644_9273.next()) {
				((Class480_Sub5_Sub2) class480).method17576();
			}
			Class470.method8046(false, true);
			for (int i = 0; i < aClass302Array9326.length; i++) {
				if (aClass302Array9326[i] != null) {
					aClass302Array9326[i].method5484();
					aClass302Array9326[i] = null;
				}
			}
			for (int i = 0; i < aClass309Array9381.length; i++) {
				if (aClass309Array9381[i] != null) {
					aClass309Array9381[i].method5505();
					aClass309Array9381[i] = null;
				}
			}
			method14584();
			method2375(0);
			aBool9253 = true;
		}
	}

	@Override
	boolean method2377(int i, int i_194_, int i_195_, int i_196_, Class405 class405, Class379 class379) {
		Matrix4f class399 = aClass399_9324;
		class399.method6548(class405);
		class399.method6547(aClass399_9302);
		return class379.method6218(i, i_194_, i_195_, i_196_, class399, aFloat9403, aFloat9343, aFloat9364, aFloat9308);
	}

	@Override
	final void method2437(int i, int i_119_, int i_120_, int i_121_, int i_122_) {
		method2783(i, i_119_, i + i_120_, i_119_, i_121_, i_122_);
	}

	@Override
	final void method2472(int i, int i_123_, int i_124_, int i_125_, int i_126_) {
		method2783(i, i_123_, i, i_123_ + i_124_, i_125_, i_126_);
	}

	@Override
	final void method2500(float f, float f_160_, float f_161_, float f_162_, float f_163_, float f_164_) {
		Class309_Sub2.aFloat9725 = f;
		Class309_Sub2.aFloat9726 = f_160_;
		Class309_Sub2.aFloat9733 = f_161_;
		Class309_Sub2.aFloat9728 = f_164_;
	}

	@Override
	final void method2736(int i, int i_115_, int i_116_, int i_117_, int i_118_) {

	}
}
