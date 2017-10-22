package com.jagex;

import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;

import java.awt.Canvas;
import java.lang.reflect.Field;

import sun.misc.Unsafe;

public class OpenGlToolkit extends Toolkit {
	static final float aFloat9034 = 0.35F;
	static float[] RGBA_COLOUR = new float[4];
	static float[] aFloatArray9145 = new float[4];
	static final int anInt8951 = 1;
	static final int anInt8952 = 2;
	static final int anInt8953 = 4;
	static final int anInt8954 = 8;
	static final int anInt8955 = 16;
	static final int anInt8956 = 32;
	static final int anInt8957 = 32993;
	static final int anInt8958 = 5121;
	static final int anInt8959 = 5123;
	static final int anInt8960 = 5126;
	static final int anInt8961 = 4;
	static final int anInt8963 = 128;
	static final int anInt8964 = -1;
	static final int anInt8967 = 8448;
	static final int anInt8968 = 2;
	static final int anInt8970 = 34165;
	static final int anInt8972 = 34168;
	static final int anInt8973 = 5890;
	static final int anInt8974 = 1;
	static final int anInt8975 = 34166;
	static final int anInt8977 = 768;
	static final int anInt8978 = 0;
	static final int anInt8979 = 1;
	static final int anInt8980 = 2;
	static final int anInt8983 = 2;
	static final int anInt8984 = 3;
	static final int anInt8987 = 4;
	static final int anInt8988 = 8;
	static final int anInt8990 = 7;
	static final int anInt8997 = 7681;
	static final int anInt9007 = 34479;
	static int anInt9065 = 4;
	static final int anInt9068 = 34167;
	static final int anInt9072 = 0;
	static final int anInt9077 = 1;
	static final int anInt9098 = 100663296;
	static final int anInt9099 = 260;
	static final int anInt9102 = 34023;
	static final int anInt9119 = 55;
	static final int anInt9120 = 770;
	static final int anInt9125 = -2;
	static final int anInt9131 = 7;
	static final int anInt9142 = 0;
	static final int anInt9151 = 3;
	static int[] anIntArray9022 = new int[1000];

	public static Toolkit create(Canvas canvas, TextureMetricsList class147, Interface19 interface19,
			BillboardLoader interface41, ParticleProducerDefinitionLoader interface42, Interface44 interface44,
			int multisamples) {
		return new OpenGlToolkit(canvas, class147, interface19, interface41, interface42, interface44, multisamples);
	}

	static int internalFormat(Class121 class121, Class151 class151) {
		if (class151 == Class151.aClass151_2) {
			switch (class121.id * 1703450577) {
				default:
					throw new IllegalArgumentException();
				case 8:
					return 6409;
				case 0:
					return 6410;
				case 5:
					return 6406;
				case 4:
					return 6408;
				case 2:
					return 6407;
			}
		} else if (class151 == Class151.aClass151_1849) {
			switch (class121.id * 1703450577) {
				case 5:
					return 32830;
				case 8:
					return 32834;
				default:
					throw new IllegalArgumentException();
				case 0:
					return 36219;
				case 2:
					return 32852;
				case 4:
					return 32859;
				case 1:
					return 33189;
			}
		} else if (class151 == Class151.aClass151_1854) {
			switch (class121.id * 1703450577) {
				case 1:
					return 33190;
				default:
					throw new IllegalArgumentException();
			}
		} else if (class151 == Class151.aClass151_1855) {
			switch (class121.id * 1703450577) {
				case 0:
					return 34847;
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34844;
				case 4:
					return 34842;
				case 2:
					return 34843;
				case 8:
					return 34846;
			}
		} else if (class151 == Class151.aClass151_1) {
			switch (class121.id * 1703450577) {
				case 2:
					return 34837;
				default:
					throw new IllegalArgumentException();
				case 5:
					return 34838;
				case 4:
					return 34836;
				case 0:
					return 34841;
				case 8:
					return 34840;
			}
		}

		throw new IllegalArgumentException();
	}

	static int format(Class121 class121) {
		int GL_ALPHA = 0x1906;
		int GL_RGB = 0x1907;
		int GL_RGBA = 0x1908;
		int GL_LUMINANCE = 0x1909;
		int GL_LUMINANCE_ALPHA = 0x190A;
		int GL_DEPTH_COMPONENT = 0x1902;

		switch (class121.id * 1703450577) {
			case 0:
				return GL_LUMINANCE_ALPHA;
			case 1:
				return GL_DEPTH_COMPONENT;
			case 2:
				return GL_RGB;
			case 4:
				return GL_RGBA;
			case 5:
				return GL_ALPHA;
			case 8:
				return GL_LUMINANCE;
			default:
				throw new IllegalStateException();
		}
	}

	boolean underwater;
	boolean aBool8976;
	boolean aBool8982;
	boolean aBool9006;
	boolean aBool9017;
	boolean aBool9027;
	boolean aBool9029;
	boolean aBool9031;
	boolean aBool9032;
	boolean aBool9035;
	boolean aBool9038;
	boolean colourMask;
	boolean aBool9054;
	boolean aBool9061;
	boolean aBool9066;
	boolean aBool9067;
	boolean aBool9075;
	boolean aBool9084;
	boolean aBool9093;
	boolean aBool9104;
	boolean aBool9108;
	boolean bigEndian;
	boolean aBool9111;
	boolean aBool9116;
	boolean aBool9117;
	boolean aBool9118;
	boolean aBool9121;
	boolean aBool9122;
	boolean aBool9124;
	boolean aBool9126;
	boolean aBool9127;
	boolean aBool9128;
	boolean aBool9130;
	boolean aBool9132;
	boolean aBool9133;
	boolean aBool9134;
	byte aByte9030;
	byte[] aByteArray9095;
	OpenGl2DTexture aClass102_Sub1_9047;
	OpenGlTexture[] aClass102Array9103;
	Class106 aClass106_9152;
	Class112 aClass112_8995;
	Sprite aClass116_9042;
	Sprite aClass116_9153;
	Class117 aClass117_9003;
	OpenGl2DTextureCache aClass119_8993;
	OpenGlCubeMapTextureProvider aClass138_Sub2_9105;
	OpenGlModel[] aClass143_Sub1Array8989;
	OpenGlModel[] aClass143_Sub1Array9138;
	DirectDisplay aClass146_Sub2_9154;
	OpenGlDirectDisplay aClass146_Sub2_Sub1_9049;
	Class150 aClass150_9070;
	Matrix4f aClass399_9000;
	Matrix4f aClass399_9001;
	Matrix4f aClass399_9015;
	Matrix4f aClass399_9036;
	Matrix4f aClass399_9037;
	Matrix4f aClass399_9050;
	Matrix4f aClass399_9051;
	Matrix4f aClass399_9087;
	Matrix4f aClass399_9092;
	Class405 aClass405_8962;
	Class405 aClass405_9033;
	Class405 aClass405_9045;
	FloatBuffer dataBuffer;
	PointLight[] aClass480_Sub23Array9079;
	Class480_Sub4_Sub1 aClass480_Sub4_Sub1_8996;
	Class480_Sub4_Sub2 aClass480_Sub4_Sub2_9028;
	Class480_Sub4_Sub3 aClass480_Sub4_Sub3_8998;
	Deque deletedPrograms;
	Deque deletedBuffers;
	Deque aClass644_9009;
	Deque aClass644_9014;
	Deque<LinkableInt> deletedTextures;
	Deque<LinkableInt> deletededRenderBuffers;
	Deque<Linkable> deletedShaders;
	Deque deletedFrameBuffers;
	OpenGlArrayBufferPointer aClass94_8999;
	OpenGlArrayBufferPointer aClass94_9141;
	Class98 aClass98_9059 = new Class98();
	float aFloat8985;
	float aFloat9004;
	float aFloat9041;
	float aFloat9043;
	float aFloat9044;
	float aFloat9046;
	float aFloat9048;
	float aFloat9074;
	float aFloat9088;
	float aFloat9089;
	float aFloat9090;
	float aFloat9091;
	float aFloat9113;
	float aFloat9123;
	float aFloat9136;
	float aFloat9137;
	float ambient;
	float aFloat9149;
	float sunIntensity;
	float aFloat9159;
	float[] aFloatArray8981;
	float[] aFloatArray9039;
	float[] aFloatArray9052;
	float[] aFloatArray9069;
	float[] aFloatArray9071;
	float[] sunDirection;
	float[][] aFloatArrayArray9139;
	long aLong9021;
	long[] aLongArray9156;
	int anInt8948;
	int shadowScale;
	int anInt8966;
	int anInt8986;
	int anInt8992;
	int anInt8994;
	int anInt9002;
	int anInt9005;
	int allocatedTextureSize;
	int allocatedBufferSize;
	int allocatedRenderBufferSize;
	int anInt9019;
	int anInt9023;
	int anInt9024;
	int blendType;
	int anInt9026;
	int blendMode;
	int anInt9055;
	int anInt9056;
	int anInt9057;
	int anInt9058;
	int anInt9060;
	int anInt9062;
	int anInt9063;
	int anInt9073;
	int anInt9078;
	int anInt9080;
	int anInt9081;
	int sunProjectionX;
	int sunProjectionZ;
	int anInt9085;
	int anInt9086;
	int anInt9094;
	int anInt9100;
	int anInt9112;
	int anInt9114;
	int anInt9115;
	int pixelType;
	int anInt9140;
	int anInt9150;
	int anInt9158;
	int[] anIntArray8965;
	int[] anIntArray9101;
	int[] shadowX;
	int[] shadowY;
	int[] anIntArray9157;
	ArrayBuffer arrayBuffer;
	ArrayBuffer anInterface11_9143;
	ElementArrayBuffer elementBuffer;
	OpenGL gl;
	Unsafe unsafe;
	String description;

	NativeHeap heap;

	String vendorName;

	int version;

	OpenGlToolkit(Canvas canvas, TextureMetricsList class147, Interface19 interface19, BillboardLoader interface41,
			ParticleProducerDefinitionLoader interface42, Interface44 interface44, int i) {
		super(class147, interface19, interface41, interface42, interface44);
		aClass399_9000 = new Matrix4f();
		aClass399_9001 = new Matrix4f();
		aClass405_9045 = new Class405();
		anInt9005 = 8;
		shadowScale = 3;
		aBool9128 = false;
		aClass644_9009 = new Deque();
		unsafe = null;
		aClass644_9014 = new Deque();
		deletedBuffers = new Deque();
		deletedTextures = new Deque();
		deletedFrameBuffers = new Deque();
		deletededRenderBuffers = new Deque();
		deletedPrograms = new Deque();
		deletedShaders = new Deque();
		aClass405_9033 = new Class405();
		aClass399_9015 = new Matrix4f();
		aClass399_9092 = new Matrix4f();
		aClass399_9036 = new Matrix4f();
		aClass399_9037 = new Matrix4f();
		aClass399_9087 = new Matrix4f();
		aFloatArrayArray9139 = new float[6][4];
		aFloatArray9039 = new float[4];
		aFloat9113 = 0.0F;
		aFloat9046 = 1.0F;
		aFloat9123 = 0.0F;
		aFloat9048 = -1.0F;
		aClass405_8962 = new Class405();
		aClass399_9050 = new Matrix4f();
		aClass399_9051 = new Matrix4f();
		aFloatArray9052 = new float[16];
		aBool9054 = true;
		anInt9055 = 0;
		anInt9056 = 0;
		anInt9057 = 0;
		anInt9058 = 0;
		anInt9078 = 0;
		anInt9060 = 0;
		aFloatArray8981 = new float[4];
		aFloatArray9069 = new float[4];
		sunDirection = new float[4];
		aFloatArray9071 = new float[4];
		anInt9112 = -1;
		aFloat9149 = 1.0F;
		aFloat9074 = 1.0F;
		aFloat9159 = 1.0F;
		sunIntensity = -1.0F;
		aFloat8985 = -1.0F;
		aClass480_Sub23Array9079 = new PointLight[anInt9065];
		anInt9085 = -1;
		anInt9073 = -1;
		anInt9026 = 0;
		aFloat9090 = 1.0F;
		aFloat9091 = 0.0F;
		aBool9093 = false;
		anInt9140 = 8448;
		anInt9100 = 8448;
		aFloat9136 = -1.0F;
		aFloat9137 = -1.0F;
		aClass143_Sub1Array8989 = new OpenGlModel[8];
		aClass143_Sub1Array9138 = new OpenGlModel[8];
		dataBuffer = new FloatBuffer(8192);
		shadowX = new int[1];
		shadowY = new int[1];
		anIntArray9101 = new int[1];
		aByteArray9095 = new byte[16384];
		aClass116_9042 = null;
		aClass116_9153 = null;
		aClass146_Sub2_9154 = null;
		anIntArray8965 = new int[3];
		aLongArray9156 = new long[3];
		anIntArray9157 = new int[3];
		anInt9158 = 0;
		anInt8994 = 0;
		try {
			try {
				Field field = sun.misc.Unsafe.class.getDeclaredField("theUnsafe");
				field.setAccessible(true);
				unsafe = (Unsafe) field.get(null);
			} catch (Exception exception) {

			}
			anInt8992 = i;
			Client.getNativeProvider().load("jaclib");
			Client.getNativeProvider().load("jaggl");
			gl = new OpenGL();
			long l = gl.init(canvas, 8, 8, 8, 24, 0, anInt8992);
			if (l == 0L) {
				throw new RuntimeException("");
			}
			method14391();
			int i_148_ = method14464();
			if (i_148_ != 0) {
				throw new RuntimeException("");
			}
			pixelType = bigEndian ? 33639 : 5121;
			aBool9108 = description.indexOf("radeon") != -1;
			boolean bool = vendorName.indexOf("intel") != -1;
			boolean bool_149_ = false;
			boolean bool_150_ = false;
			int i_151_ = 0;
			if (aBool9108 || bool) {
				String[] strings = Class374.splitString(description.replace('/', ' '), ' ');
				int i_152_ = 0;
				for (; i_152_ < strings.length; i_152_++) {
					String string = strings[i_152_];
					try {
						if (string.length() <= 0) {
							continue;
						}
						if (string.charAt(0) == 'x' && string.length() >= 3
								&& Class292.isDecimal(string.substring(1, 3))) {
							string = string.substring(1);
							bool_150_ = true;
						}
						if (string.equals("hd")) {
							bool_149_ = true;
							continue;
						}
						if (string.startsWith("hd")) {
							string = string.substring(2);
							bool_149_ = true;
						}
						if (string.length() < 4 || !Class292.isDecimal(string.substring(0, 4))) {
							continue;
						}
						i_151_ = Client.parseDecimal(string.substring(0, 4));
					} catch (Exception exception) {
						continue;
					}
					break;
				}
			}

			if (anInt8992 != 0 && bool && !bool_149_) {
				throw new RuntimeException_Sub1("");
			}

			if (aBool9108 || bool) {
				if (bool) {
					if (!bool_149_) {
						aBool9035 = false;
						aBool9118 = false;
						aBool9061 = false;
					}
				} else {
					if (!bool_150_ && !bool_149_) {
						if (i_151_ >= 7000 && i_151_ <= 7999) {
							aBool9038 = false;
						}
						if (i_151_ >= 7000 && i_151_ <= 9250) {
							aBool8982 = false;
						}
					}
					if (!bool_149_ || i_151_ < 4000) {
						aBool9127 = false;
					}

					aBool9126 &= gl.method1385("GL_ARB_half_float_pixel");
					aBool9121 = aBool9038;
				}
			}

			aBool9133 = !vendorName.equals("s3 graphics");
			if (aBool9038) {
				try {
					int[] is = new int[1];
					OpenGL.glGenBuffersARB(1, is, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			}
			Class44.method1067(false, true);
			aBool9128 = true;
			aClass119_8993 = new OpenGl2DTextureCache(this, anInterface19_1546);
			method14357();
			aClass117_9003 = new Class117(this);
			aClass112_8995 = new Class112(this);
			if (!aClass112_8995.method2033()) {
				aClass112_8995.method2032();
				aClass112_8995 = null;
			} else {
				aClass480_Sub4_Sub1_8996 = new Class480_Sub4_Sub1(this);
				if (!aClass480_Sub4_Sub1_8996.method17531()) {
					aClass480_Sub4_Sub1_8996.destroy();
					aClass480_Sub4_Sub1_8996 = null;
				}
				aClass480_Sub4_Sub2_9028 = new Class480_Sub4_Sub2(this);
				if (!aClass480_Sub4_Sub2_9028.method17566()) {
					aClass480_Sub4_Sub2_9028.destroy();
					aClass480_Sub4_Sub2_9028 = null;
				}
				aClass480_Sub4_Sub3_8998 = new Class480_Sub4_Sub3(this);
				if (!aClass480_Sub4_Sub3_8998.method17572()) {
					aClass480_Sub4_Sub3_8998.destroy();
					aClass480_Sub4_Sub3_8998 = null;
				}
			}
			method2433(canvas, new OpenGlDelegatingDisplay(this, canvas, l));
			method2620(canvas);
			aClass106_9152 = new Class106(this);
			method14363();
			method2405();
			if (aClass112_8995 != null) {
				method14313();
				method14314();
			}
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method2373();
			if (throwable instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) throwable;
			}
			if (throwable instanceof RuntimeException_Sub1) {
				throw (RuntimeException_Sub1) throwable;
			}
			throw new RuntimeException("");
		}
	}

	@Override
	public Model createModel(BaseModel base, int attributes, int i_90_, int ambience, int contrast) {
		return new OpenGlModel(this, base, attributes, ambience, contrast, i_90_);
	}

	@Override
	public Sprite createSprite(Image image, boolean bool) {
		int[] argb = image.argb(false);
		Sprite sprite = createSprite(argb, 0, image.getWidth(), image.getWidth(), image.getHeight());
		sprite.setOffsets(image.getOffsetX(), image.getOffsetY(), image.getDeltaWidth(), image.getDeltaHeight());
		return sprite;
	}

	@Override
	public Sprite createSprite(int[] is, int offset, int i_237_, int i_238_, int i_239_, boolean copy) {
		return new OpenGlSprite(this, i_238_, i_239_, is, offset, i_237_);
	}

	@Override
	public int mergeFunctionMasks(int i, int i_265_) {
		return i | i_265_;
	}

	@Override
	public void method2372() {
		OpenGL.glFinish();
	}

	@Override
	public final synchronized void method2375(int i) {
		int i_266_ = 0;
		i &= 0x7fffffff;
		while (!deletedBuffers.isEmpty()) {
			LinkableInt class480_sub24 = (LinkableInt) deletedBuffers.popHead();
			anIntArray9022[i_266_++] = (int) (class480_sub24.linkedKey * -4821875126325281949L);
			allocatedBufferSize -= class480_sub24.value * -1189875169;
			if (i_266_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_266_, anIntArray9022, 0);
				i_266_ = 0;
			}
		}
		if (i_266_ > 0) {
			OpenGL.glDeleteBuffersARB(i_266_, anIntArray9022, 0);
			i_266_ = 0;
		}
		while (!deletedTextures.isEmpty()) {
			LinkableInt class480_sub24 = deletedTextures.popHead();
			anIntArray9022[i_266_++] = (int) (class480_sub24.linkedKey * -4821875126325281949L);
			allocatedTextureSize -= class480_sub24.value * -1189875169;
			if (i_266_ == 1000) {
				OpenGL.glDeleteTextures(i_266_, anIntArray9022, 0);
				i_266_ = 0;
			}
		}
		if (i_266_ > 0) {
			OpenGL.glDeleteTextures(i_266_, anIntArray9022, 0);
			i_266_ = 0;
		}
		while (!deletedFrameBuffers.isEmpty()) {
			LinkableInt class480_sub24 = (LinkableInt) deletedFrameBuffers.popHead();
			anIntArray9022[i_266_++] = class480_sub24.value * -1189875169;
			if (i_266_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_266_, anIntArray9022, 0);
				i_266_ = 0;
			}
		}
		if (i_266_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_266_, anIntArray9022, 0);
			i_266_ = 0;
		}
		while (!deletededRenderBuffers.isEmpty()) {
			LinkableInt linkable = deletededRenderBuffers.popHead();
			anIntArray9022[i_266_++] = (int) (linkable.linkedKey * -4821875126325281949L);
			allocatedRenderBufferSize -= linkable.value * -1189875169;

			if (i_266_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_266_, anIntArray9022, 0);
				i_266_ = 0;
			}
		}

		if (i_266_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_266_, anIntArray9022, 0);
		}

		while (!aClass644_9014.isEmpty()) {
			LinkableInt class480_sub24 = (LinkableInt) aClass644_9014.popHead();
			OpenGL.glDeleteLists((int) (class480_sub24.linkedKey * -4821875126325281949L), class480_sub24.value
					* -1189875169);
		}

		while (!deletedPrograms.isEmpty()) {
			Linkable class480 = deletedPrograms.popHead();
			OpenGL.glDeleteProgramARB((int) (class480.linkedKey * -4821875126325281949L));
		}

		while (!deletedShaders.isEmpty()) {
			Linkable linkable = deletedShaders.popHead();
			OpenGL.glDeleteShader((int) (linkable.linkedKey * -4821875126325281949L));
		}

		while (!aClass644_9014.isEmpty()) {
			LinkableInt class480_sub24 = (LinkableInt) aClass644_9014.popHead();
			OpenGL.glDeleteLists((int) (class480_sub24.linkedKey * -4821875126325281949L), class480_sub24.value
					* -1189875169);
		}

		aClass119_8993.sweep();
		if (offheapSize() > 100663296 && TimeUtil.time() > aLong9021 + 60000L) {
			System.gc();
			aLong9021 = TimeUtil.time();
		}
		anInt8966 = i;
	}

	@Override
	public final int offheapSize() {
		return allocatedBufferSize + allocatedTextureSize + allocatedRenderBufferSize;
	}

	@Override
	public boolean method2378() {
		return true;
	}

	@Override
	public boolean method2379() {
		return true;
	}

	@Override
	public boolean method2383() {
		return true;
	}

	@Override
	public boolean method2384() {
		return aBool9118 && (!method2496() || aBool9061);
	}

	@Override
	public boolean method2386() {
		return true;
	}

	@Override
	public boolean method2387() {
		return false;
	}

	@Override
	public String method2388() {
		String string = "Caps: 2:";
		String string_212_ = ":";
		string = new StringBuilder().append(string).append(anInt8992).append(string_212_).toString();
		string = new StringBuilder().append(string).append(pixelType).append(string_212_).toString();
		string = new StringBuilder().append(string).append(anInt8948).append(string_212_).toString();
		string = new StringBuilder().append(string).append(anInt9150).append(string_212_).toString();
		string = new StringBuilder().append(string).append(anInt9114).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aFloat9137).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aFloat9136).append(string_212_).toString();
		string = new StringBuilder().append(string).append(bigEndian ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9108 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9111 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9038 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9121 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9118 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9104 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9006 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9130 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9132 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool8982 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9126 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9124 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9075 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool8976 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9035 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9116 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9117 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9127 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9133 ? 1 : 0).append(string_212_).toString();
		string = new StringBuilder().append(string).append(aBool9134 ? 1 : 0).toString();
		return string;
	}

	@Override
	public void method2395(int[] is) {
		is[0] = anInt9115;
		is[1] = anInt9062;
		is[2] = anInt9063;
		is[3] = anInt9024;
	}

	@Override
	public Interface16 method2401(int i, int i_128_, Class121 class121, Class151 class151, int i_129_) {
		return new OpenGlAttachableRenderBuffer(this, class121, class151, i, i_128_, i_129_);
	}

	@Override
	public Interface17 method2403(int i, int i_287_, int i_288_) {
		return new OpenGlAttachableRenderBuffer(this, Class121.aClass121_1467, Class151.aClass151_1854, i, i_287_,
				i_288_);
	}

	@Override
	public int[] method2404(int i, int i_250_, int i_251_, int i_252_) {
		if (aClass146_1561 != null) {
			int[] is = new int[i_251_ * i_252_];
			int i_253_ = aClass146_1561.getHeight();
			for (int i_254_ = 0; i_254_ < i_252_; i_254_++) {
				OpenGL.glReadPixelsi(i, i_253_ - i_250_ - i_254_ - 1, i_251_, 1, 32993, pixelType, is, i_254_ * i_251_);
			}
			return is;
		}
		return null;
	}

	@Override
	public void method2405() {
		if (aBool9133 && aClass146_1561 != null) {
			int i = anInt9057;
			int i_5_ = anInt9058;
			int i_6_ = anInt9055;
			int i_7_ = anInt9056;
			method2421();
			int i_8_ = anInt9115;
			int i_9_ = anInt9062;
			int i_10_ = anInt9063;
			int i_11_ = anInt9024;
			method2494();
			OpenGL.glReadBuffer(1028);
			OpenGL.glDrawBuffer(1029);
			method14307();
			method14334(false);
			method14335(false);
			method14338(false);
			method14339(false);
			setActiveTexture(null);
			method14497(-2);
			setColourOp(1);
			setBlendMode(0);
			OpenGL.glMatrixMode(5889);
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			OpenGL.glRasterPos2i(0, 0);
			OpenGL.glCopyPixels(0, 0, aClass146_1561.getWidth(), aClass146_1561.getHeight(), 6144);
			OpenGL.glFlush();
			OpenGL.glReadBuffer(1029);
			OpenGL.glDrawBuffer(1029);
			method2760(i, i_6_, i_5_, i_7_);
			method2566(i_8_, i_9_, i_10_, i_11_);
		}
	}

	@Override
	public boolean method2406() {
		return aBool9122;
	}

	@Override
	public boolean method2408() {
		return true;
	}

	@Override
	public final boolean method2411() {
		if (aClass480_Sub4_Sub1_8996 != null) {
			if (!aClass480_Sub4_Sub1_8996.method15498()) {
				if (aClass112_8995.method2039(aClass480_Sub4_Sub1_8996)) {
					aClass119_8993.clear();
				} else {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	@Override
	public void method2412(int i, int i_143_, int i_144_) {
		method2457();
		if (aClass146_Sub2_9154 == null) {
			method14400(i_143_, i_144_);
		}
		if (aClass116_9042 == null) {
			aClass116_9042 = method2630(0, 0, aClass146_1561.getWidth(), aClass146_1561.getHeight(), true);
		} else {
			((OpenGlSprite) aClass116_9042).method14009(0, 0, aClass146_1561.getWidth(), aClass146_1561.getHeight(), 0,
					0, true);
		}
		method2397(aClass146_Sub2_9154);
		method2426(1, -16777216);
		aClass116_9042.method2145(anInt1569 * 81622179, anInt1568 * -2040424545, anInt1559 * -673653535, anInt1570
				* -303698357);
		OpenGL.glBindBufferARB(35051, anIntArray8965[anInt8994]);
		OpenGL.glReadPixelsub(0, 0, anInt1554 * -939590513, anInt1566 * 2016536651, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method2398(aClass146_Sub2_9154);
		aLongArray9156[anInt8994] = OpenGL.glFenceSync(37143, 0);
		anIntArray9157[anInt8994] = i;
		if (++anInt8994 >= 3) {
			anInt8994 = 0;
		}
		method2446();
	}

	@Override
	public void method2413(long l) {
		if (OpenGL.glUnmapBufferARB(35051)) {

		}
		OpenGL.glBindBufferARB(35051, 0);
	}

	@Override
	public void method2414(int i, Class150 class150) {
		anInt9094 = i;
		aClass150_9070 = class150;
		underwater = true;
	}

	@Override
	public void method2416() {
		if (aBool9122) {
			aClass116_9042 = null;
			if (aClass146_Sub2_9154 != null) {
				aClass146_Sub2_9154.delete();
				aClass146_Sub2_9154 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray8965, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray8965[i] = 0;
				if (aLongArray9156[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray9156[i]);
					aLongArray9156[i] = 0L;
				}
			}
		} else {
			aClass146_Sub2_9154 = null;
			aClass116_9153 = null;
			aClass116_9042 = null;
		}
	}

	@Override
	public void method2420(float f, float f_99_) {
		aFloat9113 = f;
		aFloat9046 = f_99_;
		method14453();
	}

	@Override
	public final void method2421() {
		if (aClass146_1561 != null) {
			anInt9057 = 0;
			anInt9055 = 0;
			anInt9058 = aClass146_1561.getWidth();
			anInt9056 = aClass146_1561.getHeight();
			OpenGL.glDisable(3089);
		}
	}

	@Override
	public void method2424(float f, float f_66_, float f_65_, float[] fs) {
		float f_67_ = aClass399_9087.array[15] + aClass399_9087.array[3] * f + aClass399_9087.array[7] * f_65_
				+ aClass399_9087.array[11] * f_66_;
		float f_68_ = aClass399_9087.array[12] + aClass399_9087.array[0] * f + aClass399_9087.array[4] * f_65_
				+ aClass399_9087.array[8] * f_66_;
		float f_69_ = aClass399_9087.array[13] + aClass399_9087.array[1] * f + aClass399_9087.array[5] * f_65_
				+ aClass399_9087.array[9] * f_66_;
		float f_70_ = aClass399_9015.array[14] + aClass399_9015.array[2] * f + aClass399_9015.array[6] * f_65_
				+ aClass399_9015.array[10] * f_66_;
		fs[0] = aFloat9041 + aFloat9004 * f_68_ / f_67_;
		fs[1] = aFloat9043 + aFloat9044 * f_69_ / f_67_;
		fs[2] = f_70_;
	}

	@Override
	public final void method2425(int[] is) {
		is[0] = anInt9057;
		is[1] = anInt9055;
		is[2] = anInt9058;
		is[3] = anInt9056;
	}

	@Override
	public void method2426(int i, int i_19_) {
		int i_20_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((i_19_ & 0xff0000) / 1.671168E7F, (i_19_ & 0xff00) / 65280.0F, (i_19_ & 0xff) / 255.0F,
					(i_19_ >>> 24) / 255.0F);
			i_20_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method14339(true);
			i_20_ |= 0x100;
		}
		if ((i & 0x4) != 0) {
			i_20_ |= 0x400;
		}
		OpenGL.glClear(i_20_);
	}

	@Override
	public void method2434(int i, int i_29_, int i_30_, int i_31_, int i_32_, int i_33_) {
		float f = i + 0.35F;
		float f_34_ = i_29_ + 0.35F;
		float f_35_ = f + i_30_;
		float f_36_ = f_34_ + i_31_;
		method14321();
		setBlendMode(i_33_);
		OpenGL.glColor4ub((byte) (i_32_ >> 16), (byte) (i_32_ >> 8), (byte) i_32_, (byte) (i_32_ >> 24));
		if (aBool9118) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(7);
		OpenGL.glVertex2f(f, f_34_);
		OpenGL.glVertex2f(f, f_36_);
		OpenGL.glVertex2f(f_35_, f_36_);
		OpenGL.glVertex2f(f_35_, f_34_);
		OpenGL.glEnd();
		if (aBool9118) {
			OpenGL.glEnable(32925);
		}
	}

	@Override
	public void method2435(int i, int i_172_, float f, int i_173_, int i_174_, float f_175_, int i_176_, int i_177_,
			float f_178_, int i_179_, int i_180_, int i_181_, int i_182_) {
		method14321();
		setBlendMode(i_182_);
		OpenGL.glBegin(4);
		OpenGL.glColor4ub((byte) (i_179_ >> 16), (byte) (i_179_ >> 8), (byte) i_179_, (byte) (i_179_ >> 24));
		OpenGL.glVertex3f(i + 0.35F, i_172_ + 0.35F, f);
		OpenGL.glColor4ub((byte) (i_180_ >> 16), (byte) (i_180_ >> 8), (byte) i_180_, (byte) (i_180_ >> 24));
		OpenGL.glVertex3f(i_173_ + 0.35F, i_174_ + 0.35F, f_175_);
		OpenGL.glColor4ub((byte) (i_181_ >> 16), (byte) (i_181_ >> 8), (byte) i_181_, (byte) (i_181_ >> 24));
		OpenGL.glVertex3f(i_176_ + 0.35F, i_177_ + 0.35F, f_178_);
		OpenGL.glEnd();
	}

	@Override
	public void method2440(int i, int i_159_, int i_160_, int i_161_, int i_162_, int i_163_, ClippingMask class129,
			int i_164_, int i_165_) {
		OpenGlClippingMask class129_sub2 = (OpenGlClippingMask) class129;
		RectangularOpenGl2DTexture class102_sub1_sub1 = class129_sub2.texture;
		method14322();
		setActiveTexture(class129_sub2.texture);
		setBlendMode(i_163_);
		setTextureParameters(7681, 8448);
		method14376(0, 34167, 768);
		float f = class102_sub1_sub1.widthRatio / class102_sub1_sub1.anInt10950;
		float f_166_ = class102_sub1_sub1.heightRatio / class102_sub1_sub1.anInt10947;
		float f_167_ = (float) i_160_ - (float) i;
		float f_168_ = (float) i_161_ - (float) i_159_;
		float f_169_ = (float) (1.0 / Math.sqrt(f_167_ * f_167_ + f_168_ * f_168_));
		f_167_ *= f_169_;
		f_168_ *= f_169_;
		OpenGL.glColor4ub((byte) (i_162_ >> 16), (byte) (i_162_ >> 8), (byte) i_162_, (byte) (i_162_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glTexCoord2f(f * (i - i_164_), f_166_ * (i_159_ - i_165_));
		OpenGL.glVertex2f(i + 0.35F, i_159_ + 0.35F);
		OpenGL.glTexCoord2f(f * (i_160_ - i_164_), f_166_ * (i_161_ - i_165_));
		OpenGL.glVertex2f(i_160_ + f_167_ + 0.35F, i_161_ + f_168_ + 0.35F);
		OpenGL.glEnd();
		method14376(0, 5890, 768);
	}

	@Override
	public void method2441(int i, int i_191_, int i_192_, int i_193_, int i_194_, int i_195_, int i_196_, int i_197_,
			int i_198_) {
		if (i != i_192_ || i_191_ != i_193_) {
			method14321();
			setBlendMode(i_195_);
			float f = (float) i_192_ - (float) i;
			float f_199_ = (float) i_193_ - (float) i_191_;
			float f_200_ = (float) (1.0 / Math.sqrt(f * f + f_199_ * f_199_));
			f *= f_200_;
			f_199_ *= f_200_;
			OpenGL.glColor4ub((byte) (i_194_ >> 16), (byte) (i_194_ >> 8), (byte) i_194_, (byte) (i_194_ >> 24));
			i_198_ %= i_197_ + i_196_;
			float f_201_ = f * i_196_;
			float f_202_ = f_199_ * i_196_;
			float f_203_ = 0.0F;
			float f_204_ = 0.0F;
			float f_205_ = f_201_;
			float f_206_ = f_202_;
			if (i_198_ > i_196_) {
				f_203_ = f * (i_196_ + i_197_ - i_198_);
				f_204_ = f_199_ * (i_196_ + i_197_ - i_198_);
			} else {
				f_205_ = f * (i_196_ - i_198_);
				f_206_ = f_199_ * (i_196_ - i_198_);
			}
			float f_207_ = i + 0.35F + f_203_;
			float f_208_ = i_191_ + 0.35F + f_204_;
			float f_209_ = f * i_197_;
			float f_210_ = f_199_ * i_197_;
			for (;;) {
				if (i_192_ > i) {
					if (f_207_ > i_192_ + 0.35F) {
						break;
					}
					if (f_207_ + f_205_ > i_192_) {
						f_205_ = i_192_ - f_207_;
					}
				} else {
					if (f_207_ < i_192_ + 0.35F) {
						break;
					}
					if (f_207_ + f_205_ < i_192_) {
						f_205_ = i_192_ - f_207_;
					}
				}
				if (i_193_ > i_191_) {
					if (f_208_ > i_193_ + 0.35F) {
						break;
					}
					if (f_208_ + f_206_ > i_193_) {
						f_206_ = i_193_ - f_208_;
					}
				} else {
					if (f_208_ < i_193_ + 0.35F) {
						break;
					}
					if (f_208_ + f_206_ < i_193_) {
						f_206_ = i_193_ - f_208_;
					}
				}
				OpenGL.glBegin(1);
				OpenGL.glVertex2f(f_207_, f_208_);
				OpenGL.glVertex2f(f_207_ + f_205_, f_208_ + f_206_);
				OpenGL.glEnd();
				f_207_ += f_209_ + f_205_;
				f_208_ += f_210_ + f_206_;
				f_205_ = f_201_;
				f_206_ = f_202_;
			}
		}
	}

	@Override
	public void method2447(Class405 class405, Class139 class139, Class379 class379) {
		Matrix4f class399 = aClass399_9050;
		class399.method6548(class405);
		class399.method6547(aClass399_9087);
		class139.method2870(class379, aClass399_9036, class399, aFloat9041, aFloat9043, aFloat9004, aFloat9044);
	}

	@Override
	public Sprite createSprite(int i, int i_189_, boolean transparent, boolean bool_190_) {
		return new OpenGlSprite(this, i, i_189_, transparent);
	}

	@Override
	public ClippingMask createClippingMask(int width, int height, int[] offsets, int[] widths) {
		return OpenGlClippingMask.create(this, width, height, offsets, widths);
	}

	@Override
	public Matrix4f method2462() {
		return aClass399_9000;
	}

	@Override
	public Class405 method2463() {
		return aClass405_9045;
	}

	@Override
	public void method2464(int i) {

	}

	@Override
	public boolean method2466() {
		return true;
	}

	@Override
	public void method2467(int i, ClippingMask class129, int i_240_, int i_241_) {
		OpenGlClippingMask class129_sub2 = (OpenGlClippingMask) class129;
		RectangularOpenGl2DTexture class102_sub1_sub1 = class129_sub2.texture;
		method14322();
		setActiveTexture(class129_sub2.texture);
		setBlendMode(1);
		setTextureParameters(7681, 8448);
		method14376(0, 34167, 768);
		float f = class102_sub1_sub1.widthRatio / class102_sub1_sub1.anInt10950;
		float f_242_ = class102_sub1_sub1.heightRatio / class102_sub1_sub1.anInt10947;
		OpenGL.glColor4ub((byte) (i >> 16), (byte) (i >> 8), (byte) i, (byte) (i >> 24));
		OpenGL.glBegin(7);
		OpenGL.glTexCoord2f(f * (anInt9057 - i_240_), f_242_ * (anInt9055 - i_241_));
		OpenGL.glVertex2i(anInt9057, anInt9055);
		OpenGL.glTexCoord2f(f * (anInt9057 - i_240_), f_242_ * (anInt9056 - i_241_));
		OpenGL.glVertex2i(anInt9057, anInt9056);
		OpenGL.glTexCoord2f(f * (anInt9058 - i_240_), f_242_ * (anInt9056 - i_241_));
		OpenGL.glVertex2i(anInt9058, anInt9056);
		OpenGL.glTexCoord2f(f * (anInt9058 - i_240_), f_242_ * (anInt9055 - i_241_));
		OpenGL.glVertex2i(anInt9058, anInt9055);
		OpenGL.glEnd();
		method14376(0, 5890, 768);
	}

	@Override
	public Ground createGround(int width, int length, int[][] heights, int[][] lighting, int units, int i_187_,
			int i_188_) {
		return new OpenGlGround(this, i_187_, i_188_, width, length, heights, lighting, units);
	}

	@Override
	public void method2470(Class137 class137) {
		aClass98_9059.method1788(this, class137);
	}

	@Override
	public final void method2471(Class405 class405) {
		aClass405_9033.copyFrom(class405);
		aClass399_9015.method6548(aClass405_9033);
		aClass405_8962.copyFrom(class405);
		aClass405_8962.method6735();
		aClass399_9092.method6548(aClass405_8962);
		method14300();
		if (anInt9086 != 1) {
			method14405();
		}
	}

	@Override
	public void method2473(boolean bool) {
		aBool9054 = bool;
		method14365();
	}

	@Override
	public final void method2476(float f) {
		if (ambient != f) {
			ambient = f;
			method14370();
		}
	}

	@Override
	public final void method2477(int i, float f, float f_108_, float f_109_, float f_110_, float f_111_) {
		boolean bool = anInt9112 != i;
		if (bool || sunIntensity != f || aFloat8985 != f_108_) {
			anInt9112 = i;
			sunIntensity = f;
			aFloat8985 = f_108_;
			if (bool) {
				aFloat9149 = (anInt9112 & 0xff0000) / 1.671168E7F;
				aFloat9074 = (anInt9112 & 0xff00) / 65280.0F;
				aFloat9159 = (anInt9112 & 0xff) / 255.0F;
				method14370();
			}
			method14305();
		}
		if (aFloatArray8981[0] != f_109_ || aFloatArray8981[1] != f_110_ || aFloatArray8981[2] != f_111_) {
			aFloatArray8981[0] = f_109_;
			aFloatArray8981[1] = f_110_;
			aFloatArray8981[2] = f_111_;
			aFloatArray9069[0] = -f_109_;
			aFloatArray9069[1] = -f_110_;
			aFloatArray9069[2] = -f_111_;
			float f_112_ = (float) (1.0 / Math.sqrt(f_109_ * f_109_ + f_110_ * f_110_ + f_111_ * f_111_));
			sunDirection[0] = f_109_ * f_112_;
			sunDirection[1] = f_110_ * f_112_;
			sunDirection[2] = f_111_ * f_112_;
			aFloatArray9071[0] = -sunDirection[0];
			aFloatArray9071[1] = -sunDirection[1];
			aFloatArray9071[2] = -sunDirection[2];
			method14306();
			sunProjectionX = (int) (f_109_ * 256.0F / f_110_);
			sunProjectionZ = (int) (f_111_ * 256.0F / f_110_);
		}
	}

	@Override
	public final void method2478(int i) {
		shadowScale = 0;
		for (; i > 1; i >>= 1) {
			shadowScale++;
		}
		anInt9005 = 1 << shadowScale;
	}

	@Override
	public int method2480() {
		return 4;
	}

	@Override
	public void method2482(int i, PointLight[] class480_sub23s) {
		for (int i_105_ = 0; i_105_ < i; i_105_++) {
			aClass480_Sub23Array9079[i_105_] = class480_sub23s[i_105_];
		}
		anInt9081 = i;
		if (anInt9086 != 1) {
			method14302();
		}
	}

	@Override
	public CubeMapTextureProvider createCubeMapTextureProvider(int id) {
		return aBool9124 ? new LazyOpenGlCubeMapTextureProvider(this, id) : null;
	}

	@Override
	public CubeMapTextureProvider method2484(CubeMapTextureProvider class138, CubeMapTextureProvider class138_115_,
			float f, CubeMapTextureProvider class138_116_) {
		if (class138 != null && class138_115_ != null && aBool9124 && aBool9035) {
			MergeableOpenGlCubeMapTextureProvider class138_sub2_sub2 = null;
			OpenGlCubeMapTextureProvider class138_sub2 = (OpenGlCubeMapTextureProvider) class138;
			OpenGlCubeMapTextureProvider class138_sub2_117_ = (OpenGlCubeMapTextureProvider) class138_115_;
			OpenGlCubeMapTexture class102_sub3 = class138_sub2.getTexture();
			OpenGlCubeMapTexture class102_sub3_118_ = class138_sub2_117_.getTexture();
			if (class102_sub3 != null && class102_sub3_118_ != null) {
				int i = class102_sub3.length > class102_sub3_118_.length ? class102_sub3.length
						: class102_sub3_118_.length;
				if (class138 != class138_116_ && class138_115_ != class138_116_
						&& class138_116_ instanceof MergeableOpenGlCubeMapTextureProvider) {
					MergeableOpenGlCubeMapTextureProvider class138_sub2_sub2_119_ = (MergeableOpenGlCubeMapTextureProvider) class138_116_;
					if (class138_sub2_sub2_119_.getLength() == i) {
						class138_sub2_sub2 = class138_sub2_sub2_119_;
					}
				}
				if (class138_sub2_sub2 == null) {
					class138_sub2_sub2 = new MergeableOpenGlCubeMapTextureProvider(this, i);
				}
				if (class138_sub2_sub2.method17493(class102_sub3, class102_sub3_118_, f)) {
					return class138_sub2_sub2;
				}
			}
		}
		return f < 0.5F ? class138 : class138_115_;
	}

	@Override
	public final void setCubeMapTextureProvider(CubeMapTextureProvider class138) {
		aClass138_Sub2_9105 = (OpenGlCubeMapTextureProvider) class138;
	}

	@Override
	public final void method2487(int i, int i_131_) {
		if (aClass112_8995 != null) {
			aClass112_8995.method2038(i, i_131_);
		}
	}

	@Override
	public boolean method2489() {
		return aClass480_Sub4_Sub2_9028 != null && aClass480_Sub4_Sub2_9028.method15498();
	}

	@Override
	public void method2490(float f, float f_245_, float f_246_, float f_247_, float f_248_) {
		Class480_Sub4_Sub2.aFloat11224 = f;
		Class480_Sub4_Sub2.aFloat11220 = f_245_;
		Class480_Sub4_Sub2.aFloat11219 = f_246_;
		Class480_Sub4_Sub2.aFloat11221 = f_247_;
		Class480_Sub4_Sub2.aFloat11222 = f_248_;
	}

	@Override
	public Class118 method2491(int[] argb) {
		return new Class118_Sub1(this, argb);
	}

	@Override
	public boolean method2492() {
		return aClass480_Sub4_Sub3_8998 != null && aClass480_Sub4_Sub3_8998.method15498();
	}

	@Override
	public void method2493(Class118 class118, float f, Class118 class118_123_, float f_124_, Class118 class118_125_,
			float f_126_) {
		int i = 0;
		if (class118_125_ == null && f_126_ > 0.0F) {
			f_126_ = 0.0F;
		}
		if (class118_123_ == null && f_124_ > 0.0F) {
			class118_123_ = class118_125_;
			class118_125_ = null;
			f_124_ = f_126_;
			f_126_ = 0.0F;
		}
		if (class118 == null && f > 0.0F) {
			class118 = class118_123_;
			class118_123_ = class118_125_;
			class118_125_ = null;
			f = f_124_;
			f_124_ = f_126_;
			f_126_ = 0.0F;
		}
		Class480_Sub4_Sub3.aClass118_Sub1Array11235[0] = (Class118_Sub1) class118;
		Class480_Sub4_Sub3.aFloatArray11247[0] = f;
		if (f > 0.0F) {
			i++;
		}
		Class480_Sub4_Sub3.aClass118_Sub1Array11235[1] = (Class118_Sub1) class118_123_;
		Class480_Sub4_Sub3.aFloatArray11247[1] = f_124_;
		if (f_124_ > 0.0F) {
			i++;
		}
		Class480_Sub4_Sub3.aClass118_Sub1Array11235[2] = (Class118_Sub1) class118_125_;
		Class480_Sub4_Sub3.aFloatArray11247[2] = f_126_;
		if (f_126_ > 0.0F) {
			i++;
		}
		Class480_Sub4_Sub3.anInt11237 = i;
		Class480_Sub4_Sub3.aFloat11245 = 1.0F - (f + f_124_ + f_126_);
	}

	@Override
	public void method2494() {
		anInt9115 = 0;
		anInt9062 = 0;
		anInt9063 = aClass146_1561.getWidth();
		anInt9024 = aClass146_1561.getHeight();
		method14291();
	}

	@Override
	public final void method2495() {
		if (aClass480_Sub4_Sub1_8996 != null && aClass480_Sub4_Sub1_8996.method15498()) {
			aClass112_8995.method2040(aClass480_Sub4_Sub1_8996);
			aClass119_8993.clear();
		}
	}

	@Override
	public final boolean method2496() {
		return aClass480_Sub4_Sub1_8996 != null && aClass480_Sub4_Sub1_8996.method15498();
	}

	@Override
	public int method2499() {
		if (aBool9122) {
			if (aLongArray9156[anInt9158] == 0L) {
				return -1;
			}
			int i = OpenGL.glClientWaitSync(aLongArray9156[anInt9158], 0, 0);
			if (i == 37149) {
				method2574();
				return -1;
			}
			return i != 37147 ? anIntArray9157[anInt9158] : -1;
		}
		return -1;
	}

	@Override
	public void method2501() {
		underwater = false;
	}

	@Override
	public void method2502(float f, float f_273_, float f_272_, float[] fs) {
		float f_274_ = aClass399_9087.array[14] + aClass399_9087.array[2] * f + aClass399_9087.array[6] * f_272_
				+ aClass399_9087.array[10] * f_273_;
		float f_275_ = aClass399_9087.array[15] + aClass399_9087.array[3] * f + aClass399_9087.array[7] * f_272_
				+ aClass399_9087.array[11] * f_273_;
		if (f_274_ < -f_275_ || f_274_ > f_275_) {
			float[] fs_276_ = fs;
			float[] fs_277_ = fs;
			fs[2] = Float.NaN;
			fs_277_[1] = Float.NaN;
			fs_276_[0] = Float.NaN;
		} else {
			float f_278_ = aClass399_9087.array[12] + aClass399_9087.array[0] * f + aClass399_9087.array[4] * f_272_
					+ aClass399_9087.array[8] * f_273_;
			if (f_278_ < -f_275_ || f_278_ > f_275_) {
				float[] fs_279_ = fs;
				float[] fs_280_ = fs;
				fs[2] = Float.NaN;
				fs_280_[1] = Float.NaN;
				fs_279_[0] = Float.NaN;
			} else {
				float f_281_ = aClass399_9087.array[13] + aClass399_9087.array[1] * f + aClass399_9087.array[5]
						* f_272_ + aClass399_9087.array[9] * f_273_;
				if (f_281_ < -f_275_ || f_281_ > f_275_) {
					float[] fs_282_ = fs;
					float[] fs_283_ = fs;
					fs[2] = Float.NaN;
					fs_283_[1] = Float.NaN;
					fs_282_[0] = Float.NaN;
				} else {
					float f_284_ = aClass399_9015.array[14] + aClass399_9015.array[2] * f + aClass399_9015.array[6]
							* f_272_ + aClass399_9015.array[10] * f_273_;
					fs[0] = aFloat9041 + aFloat9004 * f_278_ / f_275_;
					fs[1] = aFloat9043 + aFloat9044 * f_281_ / f_275_;
					fs[2] = f_284_;
				}
			}
		}
	}

	@Override
	public void method2507(boolean bool) {

	}

	@Override
	public final void method2511(int i, int i_37_, int i_38_, int i_39_) {
		if (anInt9057 < i) {
			anInt9057 = i;
		}
		if (anInt9058 > i_38_) {
			anInt9058 = i_38_;
		}
		if (anInt9055 < i_37_) {
			anInt9055 = i_37_;
		}
		if (anInt9056 > i_39_) {
			anInt9056 = i_39_;
		}
		OpenGL.glEnable(3089);
		method14293();
	}

	@Override
	public DirectDisplay createDirectDisplay() {
		return new OpenGlDirectDisplay(this);
	}

	@Override
	public void method2525(int i, int i_12_, int[] is, int[] is_13_) {
		method14279(i, i_12_, is, is_13_);
	}

	@Override
	public boolean method2539() {
		return true;
	}

	@Override
	public final void method2540(Matrix4f class399) {
		aClass399_9036.copyFrom(class399);
		method14300();
		method14299();
	}

	@Override
	public void method2566(int i, int i_96_, int i_97_, int i_98_) {
		anInt9115 = i;
		anInt9062 = i_96_;
		anInt9063 = i_97_;
		anInt9024 = i_98_;
		method14291();
	}

	@Override
	public void method2574() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray9156[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray9156[i]);
				aLongArray9156[i] = 0L;
			}
		}
		anInt8994 = 0;
		anInt9158 = 0;
	}

	@Override
	public final Matrix4f method2575() {
		return new Matrix4f(aClass399_9036);
	}

	@Override
	public int method2586(int i, int i_71_, int i_72_, int i_73_, int i_74_, int i_75_) {
		int i_76_ = 0;
		float f = aClass399_9087.array[14] + aClass399_9087.array[2] * i + aClass399_9087.array[6] * i_71_
				+ aClass399_9087.array[10] * i_72_;
		float f_77_ = aClass399_9087.array[14] + aClass399_9087.array[2] * i_73_ + aClass399_9087.array[6] * i_74_
				+ aClass399_9087.array[10] * i_75_;
		float f_78_ = aClass399_9087.array[15] + aClass399_9087.array[3] * i + aClass399_9087.array[7] * i_71_
				+ aClass399_9087.array[11] * i_72_;
		float f_79_ = aClass399_9087.array[15] + aClass399_9087.array[3] * i_73_ + aClass399_9087.array[7] * i_74_
				+ aClass399_9087.array[11] * i_75_;
		if (f < -f_78_ && f_77_ < -f_79_) {
			i_76_ |= 0x10;
		} else if (f > f_78_ && f_77_ > f_79_) {
			i_76_ |= 0x20;
		}
		float f_80_ = aClass399_9087.array[12] + aClass399_9087.array[0] * i + aClass399_9087.array[4] * i_71_
				+ aClass399_9087.array[8] * i_72_;
		float f_81_ = aClass399_9087.array[12] + aClass399_9087.array[0] * i_73_ + aClass399_9087.array[4] * i_74_
				+ aClass399_9087.array[8] * i_75_;
		if (f_80_ < -f_78_ && f_81_ < -f_79_) {
			i_76_ |= 0x1;
		}
		if (f_80_ > f_78_ && f_81_ > f_79_) {
			i_76_ |= 0x2;
		}
		float f_82_ = aClass399_9087.array[13] + aClass399_9087.array[1] * i + aClass399_9087.array[5] * i_71_
				+ aClass399_9087.array[9] * i_72_;
		float f_83_ = aClass399_9087.array[13] + aClass399_9087.array[1] * i_73_ + aClass399_9087.array[5] * i_74_
				+ aClass399_9087.array[9] * i_75_;
		if (f_82_ < -f_78_ && f_83_ < -f_79_) {
			i_76_ |= 0x4;
		}
		if (f_82_ > f_78_ && f_83_ > f_79_) {
			i_76_ |= 0x8;
		}
		return i_76_;
	}

	@Override
	public Font createFont(FontSpecification class9, Image[] class152s, boolean bool) {
		return new OpenGlFont(this, class9, class152s, bool);
	}

	@Override
	public void method2625(int i, int i_21_, int i_22_, int i_23_, int i_24_, int i_25_) {
		float f = i + 0.35F;
		float f_26_ = i_21_ + 0.35F;
		float f_27_ = f + i_22_ - 1.0F;
		float f_28_ = f_26_ + i_23_ - 1.0F;
		method14321();
		setBlendMode(i_25_);
		OpenGL.glColor4ub((byte) (i_24_ >> 16), (byte) (i_24_ >> 8), (byte) i_24_, (byte) (i_24_ >> 24));
		if (aBool9118) {
			OpenGL.glDisable(32925);
		}
		OpenGL.glBegin(2);
		OpenGL.glVertex2f(f, f_26_);
		OpenGL.glVertex2f(f, f_28_);
		OpenGL.glVertex2f(f_27_, f_28_);
		OpenGL.glVertex2f(f_27_, f_26_);
		OpenGL.glEnd();
		if (aBool9118) {
			OpenGL.glEnable(32925);
		}
	}

	@Override
	public Sprite method2630(int i, int i_289_, int i_290_, int i_291_, boolean bool) {
		return new OpenGlSprite(this, i, i_289_, i_290_, i_291_);
	}

	@Override
	public int method2637(int functionMask, int i_93_) {
		return functionMask & i_93_ ^ i_93_;
	}

	@Override
	public final boolean method2678() {
		if (aClass112_8995 == null) {
			return false;
		}
		return aClass112_8995.method2034();
	}

	@Override
	public long method2685(int i, int i_89_) {
		return method14279(i, i_89_, null, null);
	}

	@Override
	public boolean method2688() {
		return aClass480_Sub4_Sub1_8996 != null && (anInt8992 <= 1 || aBool9061);
	}

	@Override
	public boolean method2707() {
		return true;
	}

	@Override
	public final void method2730(int i, int i_120_, int i_121_, int i_122_) {
		if (aClass112_8995 != null) {
			aClass112_8995.method2037(i, i_120_, i_121_, i_122_);
		}
	}

	@Override
	public void method2748(int i, int i_255_, int i_256_, int i_257_, int i_258_, int i_259_, int i_260_) {
		OpenGL.glLineWidth(i_259_);
		method2783(i, i_255_, i_256_, i_257_, i_258_, i_260_);
		OpenGL.glLineWidth(1.0F);
	}

	@Override
	public Class405 method2754() {
		return new Class405(aClass405_9033);
	}

	@Override
	public final void method2760(int i, int i_292_, int i_293_, int i_294_) {
		if (aClass146_1561 != null) {
			if (i < 0) {
				i = 0;
			}
			if (i_293_ > aClass146_1561.getWidth()) {
				i_293_ = aClass146_1561.getWidth();
			}
			if (i_292_ < 0) {
				i_292_ = 0;
			}
			if (i_294_ > aClass146_1561.getHeight()) {
				i_294_ = aClass146_1561.getHeight();
			}
			anInt9057 = i;
			anInt9055 = i_292_;
			anInt9058 = i_293_;
			anInt9056 = i_294_;
			OpenGL.glEnable(3089);
			method14293();
		}
	}

	@Override
	public Interface17 method2774(int i, int i_127_) {
		return new OpenGlAttachableRenderBuffer(this, Class121.aClass121_1467, Class151.aClass151_1854, i, i_127_);
	}

	@Override
	public void method2783(int i, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_) {
		method14321();
		setBlendMode(i_62_);
		float f = (float) i_59_ - (float) i;
		float f_63_ = (float) i_60_ - (float) i_58_;
		if (f == 0.0F && f_63_ == 0.0F) {
			f = 1.0F;
		} else {
			float f_64_ = (float) (1.0 / Math.sqrt(f * f + f_63_ * f_63_));
			f *= f_64_;
			f_63_ *= f_64_;
		}
		OpenGL.glColor4ub((byte) (i_61_ >> 16), (byte) (i_61_ >> 8), (byte) i_61_, (byte) (i_61_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(i + 0.35F, i_58_ + 0.35F);
		OpenGL.glVertex2f(i_59_ + f + 0.35F, i_60_ + f_63_ + 0.35F);
		OpenGL.glEnd();
	}

	@Override
	public void method2804(int i, Class150 class150) {
		if (!underwater) {
			throw new RuntimeException("");
		}

		anInt9094 = i;
		aClass150_9070 = class150;
		if (aBool9093) {
			aClass106_9152.aClass101_Sub2_1351.method14001();
			aClass106_9152.aClass101_Sub2_1351.method14003();
		}
	}

	@Override
	public boolean method2806() {
		return !(aBool9122 && aLongArray9156[anInt8994] != 0L);
	}

	@Override
	public Class480_Sub5 method2808(int i) {
		Class480_Sub5_Sub1 class480_sub5_sub1 = new Class480_Sub5_Sub1(i);
		aClass644_9009.pushBack(class480_sub5_sub1);
		return class480_sub5_sub1;
	}

	@Override
	public void method2813(int i, int i_213_, int i_214_, int i_215_, int i_216_, int i_217_, ClippingMask class129,
			int i_218_, int i_219_, int i_220_, int i_221_, int i_222_) {
		if (i != i_214_ || i_213_ != i_215_) {
			OpenGlClippingMask class129_sub2 = (OpenGlClippingMask) class129;
			RectangularOpenGl2DTexture class102_sub1_sub1 = class129_sub2.texture;
			method14322();
			setActiveTexture(class129_sub2.texture);
			setBlendMode(i_217_);
			setTextureParameters(7681, 8448);
			method14376(0, 34167, 768);
			float f = class102_sub1_sub1.widthRatio / class102_sub1_sub1.anInt10950;
			float f_223_ = class102_sub1_sub1.heightRatio / class102_sub1_sub1.anInt10947;
			float f_224_ = (float) i_214_ - (float) i;
			float f_225_ = (float) i_215_ - (float) i_213_;
			float f_226_ = (float) (1.0 / Math.sqrt(f_224_ * f_224_ + f_225_ * f_225_));
			f_224_ *= f_226_;
			f_225_ *= f_226_;
			OpenGL.glColor4ub((byte) (i_216_ >> 16), (byte) (i_216_ >> 8), (byte) i_216_, (byte) (i_216_ >> 24));
			i_222_ %= i_221_ + i_220_;
			float f_227_ = f_224_ * i_220_;
			float f_228_ = f_225_ * i_220_;
			float f_229_ = 0.0F;
			float f_230_ = 0.0F;
			float f_231_ = f_227_;
			float f_232_ = f_228_;
			if (i_222_ > i_220_) {
				f_229_ = f_224_ * (i_220_ + i_221_ - i_222_);
				f_230_ = f_225_ * (i_220_ + i_221_ - i_222_);
			} else {
				f_231_ = f_224_ * (i_220_ - i_222_);
				f_232_ = f_225_ * (i_220_ - i_222_);
			}
			float f_233_ = i + 0.35F + f_229_;
			float f_234_ = i_213_ + 0.35F + f_230_;
			float f_235_ = f_224_ * i_221_;
			float f_236_ = f_225_ * i_221_;
			for (;;) {
				if (i_214_ > i) {
					if (f_233_ > i_214_ + 0.35F) {
						break;
					}
					if (f_233_ + f_231_ > i_214_) {
						f_231_ = i_214_ - f_233_;
					}
				} else {
					if (f_233_ < i_214_ + 0.35F) {
						break;
					}
					if (f_233_ + f_231_ < i_214_) {
						f_231_ = i_214_ - f_233_;
					}
				}
				if (i_215_ > i_213_) {
					if (f_234_ > i_215_ + 0.35F) {
						break;
					}
					if (f_234_ + f_232_ > i_215_) {
						f_232_ = i_215_ - f_234_;
					}
				} else {
					if (f_234_ < i_215_ + 0.35F) {
						break;
					}
					if (f_234_ + f_232_ < i_215_) {
						f_232_ = i_215_ - f_234_;
					}
				}
				OpenGL.glBegin(1);
				OpenGL.glTexCoord2f(f * (f_233_ - i_218_), f_223_ * (f_234_ - i_219_));
				OpenGL.glVertex2f(f_233_, f_234_);
				OpenGL.glTexCoord2f(f * (f_233_ + f_231_ - i_218_), f_223_ * (f_234_ + f_232_ - i_219_));
				OpenGL.glVertex2f(f_233_ + f_231_, f_234_ + f_232_);
				OpenGL.glEnd();
				f_233_ += f_235_ + f_231_;
				f_234_ += f_236_ + f_232_;
				f_231_ = f_227_;
				f_232_ = f_228_;
			}
			method14376(0, 5890, 768);
		}
	}

	@Override
	public boolean method2820() {
		return true;
	}

	@Override
	public void method2824(Class480_Sub5 class480_sub5) {
		heap = ((Class480_Sub5_Sub1) class480_sub5).aNativeHeap11194;
		if (anInterface11_9143 == null) {
			FloatBuffer rsfloatbuffer = new FloatBuffer(80);
			if (bigEndian) {
				rsfloatbuffer.writeFloat(-1.0F);
				rsfloatbuffer.writeFloat(-1.0F);
				rsfloatbuffer.writeFloat(0.0F);
				rsfloatbuffer.writeFloat(0.0F);
				rsfloatbuffer.writeFloat(0.0F);
				rsfloatbuffer.writeFloat(-1.0F);
				rsfloatbuffer.writeFloat(1.0F);
				rsfloatbuffer.writeFloat(0.0F);
				rsfloatbuffer.writeFloat(0.0F);
				rsfloatbuffer.writeFloat(1.0F);
				rsfloatbuffer.writeFloat(1.0F);
				rsfloatbuffer.writeFloat(1.0F);
				rsfloatbuffer.writeFloat(0.0F);
				rsfloatbuffer.writeFloat(1.0F);
				rsfloatbuffer.writeFloat(1.0F);
				rsfloatbuffer.writeFloat(1.0F);
				rsfloatbuffer.writeFloat(-1.0F);
				rsfloatbuffer.writeFloat(0.0F);
				rsfloatbuffer.writeFloat(1.0F);
				rsfloatbuffer.writeFloat(0.0F);
			} else {
				rsfloatbuffer.writeLEFloat(-1.0F);
				rsfloatbuffer.writeLEFloat(-1.0F);
				rsfloatbuffer.writeLEFloat(0.0F);
				rsfloatbuffer.writeLEFloat(0.0F);
				rsfloatbuffer.writeLEFloat(0.0F);
				rsfloatbuffer.writeLEFloat(-1.0F);
				rsfloatbuffer.writeLEFloat(1.0F);
				rsfloatbuffer.writeLEFloat(0.0F);
				rsfloatbuffer.writeLEFloat(0.0F);
				rsfloatbuffer.writeLEFloat(1.0F);
				rsfloatbuffer.writeLEFloat(1.0F);
				rsfloatbuffer.writeLEFloat(1.0F);
				rsfloatbuffer.writeLEFloat(0.0F);
				rsfloatbuffer.writeLEFloat(1.0F);
				rsfloatbuffer.writeLEFloat(1.0F);
				rsfloatbuffer.writeLEFloat(1.0F);
				rsfloatbuffer.writeLEFloat(-1.0F);
				rsfloatbuffer.writeLEFloat(0.0F);
				rsfloatbuffer.writeLEFloat(1.0F);
				rsfloatbuffer.writeLEFloat(0.0F);
			}
			anInterface11_9143 = createArrayBuffer(20, rsfloatbuffer.payload, rsfloatbuffer.offset * -165875887, false);
			aClass94_9141 = new OpenGlArrayBufferPointer(anInterface11_9143, 5126, 3, 0);
			aClass94_8999 = new OpenGlArrayBufferPointer(anInterface11_9143, 5126, 2, 12);
			aClass98_9059.method1802(this);
		}
	}

	@Override
	public RendererType renderer() {
		int vendor = -1;
		if (vendorName.indexOf("nvidia") != -1) {
			vendor = 4318;
		} else if (vendorName.indexOf("intel") != -1) {
			vendor = 32902;
		} else if (vendorName.indexOf("ati") != -1) {
			vendor = 4098;
		}

		return new RendererType(vendor, "OpenGL", version, description, 0L);
	}

	@Override
	public final void setFogColour(int i, int i_263_, int i_264_) {
		if (anInt9085 != i || anInt9073 != i_263_ || anInt9026 != i_264_) {
			anInt9085 = i;
			anInt9073 = i_263_;
			anInt9026 = i_264_;
			method14308();
			method14298();
		}
	}

	final void bindArrayBuffer(ArrayBuffer buffer) {
		if (arrayBuffer != buffer) {
			if (aBool9038) {
				OpenGL.glBindBufferARB(34962, buffer.getName());
			}

			arrayBuffer = buffer;
		}
	}

	void method14276() {
		method14277();
	}

	void method14277() {
		int i = aClass146_1561.getWidth();
		int i_4_ = aClass146_1561.getHeight();
		aClass399_9037.method6555(0.0F, i, 0.0F, i_4_, -1.0F, 1.0F);
		method2494();
		method14307();
		method2421();
	}

	long method14279(int i, int i_14_, int[] is, int[] is_15_) {
		if (aBool9122) {
			if (aLongArray9156[anInt9158] != 0L) {
				OpenGL.glDeleteSync(aLongArray9156[anInt9158]);
				aLongArray9156[anInt9158] = 0L;
			}
			OpenGL.glBindBufferARB(35051, anIntArray8965[anInt9158]);
			long l = OpenGL.glMapBufferARB(35051, 35000);
			if (is != null) {
				int i_16_ = 0;
				for (int i_17_ = i_14_ - 1; i_17_ >= 0; i_17_--) {
					for (int i_18_ = 0; i_18_ < i; i_18_++) {
						is[i_16_++] = unsafe.getInt(l + (i_17_ * i + i_18_) * 4);
					}
				}
				if (OpenGL.glUnmapBufferARB(35051)) {

				}
				OpenGL.glBindBufferARB(35051, 0);
				l = 0L;
			}
			if (++anInt9158 >= 3) {
				anInt9158 = 0;
			}
			return l;
		}
		if (aClass116_9153 == null) {
			method14400(i, i_14_);
		}
		if (aClass116_9042 == null) {
			aClass116_9042 = method2630(0, 0, aClass146_1561.getWidth(), aClass146_1561.getHeight(), true);
		} else {
			((OpenGlSprite) aClass116_9042).method14009(0, 0, aClass146_1561.getWidth(), aClass146_1561.getHeight(), 0,
					0, true);
		}
		method2397(aClass146_Sub2_9154);
		method2426(1, -16777216);
		aClass116_9042.method2145(anInt1569 * 81622179, anInt1568 * -2040424545, anInt1559 * -673653535, anInt1570
				* -303698357);
		aClass116_9153.method2076(0, 0, i, i_14_, is, is_15_, 0, i);
		method2398(aClass146_Sub2_9154);
		return 0L;
	}

	final void method14283(int i, int i_84_, int i_85_) {
		OpenGL.glTexEnvi(8960, 34184 + i, i_84_);
		OpenGL.glTexEnvi(8960, 34200 + i, i_85_);
	}

	final synchronized void deleteRenderBuffer(int identifier, int size) {
		LinkableInt linkable = new LinkableInt(size);
		linkable.linkedKey = identifier * -7096345066895942069L;
		deletededRenderBuffers.pushBack(linkable);
	}

	boolean method14286() {
		return aClass106_9152.method1974(3);
	}

	final void drawElements(ElementArrayBuffer buffer, int mode, int i_94_, int count) {
		bindElementArrayBuffer(buffer);
		final int GL_UNSIGNED_SHORT = 0x1403;
		OpenGL.glDrawElements(mode, count, GL_UNSIGNED_SHORT, buffer.getAddress() + i_94_ * 2);
	}

	final void method14290(int i, int i_100_) {
		anInt9078 = i;
		anInt9060 = i_100_;
		method14291();
		method14293();
	}

	final void method14291() {
		if (aClass146_1561 != null) {
			int i;
			int i_101_;
			int i_102_;
			int i_103_;
			if (anInt9086 == 2) {
				i = anInt9115;
				i_101_ = anInt9062;
				i_102_ = anInt9063;
				i_103_ = anInt9024;
			} else {
				i = 0;
				i_101_ = 0;
				i_102_ = aClass146_1561.getWidth();
				i_103_ = aClass146_1561.getHeight();
			}
			if (i_102_ < 1) {
				i_102_ = 1;
			}
			if (i_103_ < 1) {
				i_103_ = 1;
			}
			OpenGL.glViewport(anInt9078 + i, anInt9060 + aClass146_1561.getHeight() - i_101_ - i_103_, i_102_, i_103_);
			aFloat9004 = anInt9063 / 2.0F;
			aFloat9044 = anInt9024 / 2.0F;
			aFloat9041 = anInt9115 + aFloat9004;
			aFloat9043 = anInt9062 + aFloat9044;
		}
	}

	final OpenGlCubeMapTexture method14292() {
		return aClass138_Sub2_9105 != null ? aClass138_Sub2_9105.getTexture() : null;
	}

	final void method14293() {
		if (aClass146_1561 != null && anInt9057 < anInt9058 && anInt9055 < anInt9056) {
			OpenGL.glScissor(anInt9078 + anInt9057, anInt9060 + aClass146_1561.getHeight() - anInt9056, anInt9058
					- anInt9057, anInt9056 - anInt9055);
		} else {
			OpenGL.glScissor(0, 0, 0, 0);
		}
	}

	final void method14294() {
		OpenGL.glPushMatrix();
	}

	final void method14296(Matrix4f class399) {
		OpenGL.glLoadMatrixf(class399.array, 0);
	}

	final void method14297() {
		OpenGL.glPopMatrix();
	}

	void method14298() {
		if (aBool9084 && anInt9073 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	final void method14299() {
		aFloat9048 = aClass399_9036.method6550();
		aFloat9123 = aClass399_9036.method6602();
		method14308();
		if (anInt9086 == 2) {
			method14301(aClass399_9036.array);
		} else if (anInt9086 == 1) {
			method14301(aClass399_9037.array);
		}
	}

	final void method14300() {
		aClass399_9087.copyFrom(aClass399_9015);
		aClass399_9087.method6547(aClass399_9036);
		aClass399_9087.method6567(aFloatArrayArray9139[0]);
		aClass399_9087.method6568(aFloatArrayArray9139[1]);
		aClass399_9087.method6563(aFloatArrayArray9139[2]);
		aClass399_9087.method6564(aFloatArrayArray9139[3]);
		aClass399_9087.method6632(aFloatArrayArray9139[4]);
		aClass399_9087.method6566(aFloatArrayArray9139[5]);
	}

	final void method14301(float[] fs) {
		float[] fs_104_ = new float[16];
		System.arraycopy(fs, 0, fs_104_, 0, 16);
		fs_104_[1] = -fs_104_[1];
		fs_104_[5] = -fs_104_[5];
		fs_104_[9] = -fs_104_[9];
		fs_104_[13] = -fs_104_[13];
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(fs_104_, 0);
		OpenGL.glMatrixMode(5888);
	}

	void method14302() {
		int i;
		for (i = 0; i < anInt9081; i++) {
			PointLight class480_sub23 = aClass480_Sub23Array9079[i];
			int i_106_ = 16386 + i;
			aFloatArray9145[0] = class480_sub23.getX();
			aFloatArray9145[1] = class480_sub23.getY();
			aFloatArray9145[2] = class480_sub23.getZ();
			aFloatArray9145[3] = 1.0F;
			OpenGL.glLightfv(i_106_, 4611, aFloatArray9145, 0);
			int i_107_ = class480_sub23.getColour();
			float f = class480_sub23.getIntensity() / 255.0F;
			aFloatArray9145[0] = (i_107_ >> 16 & 0xff) * f;
			aFloatArray9145[1] = (i_107_ >> 8 & 0xff) * f;
			aFloatArray9145[2] = (i_107_ & 0xff) * f;
			OpenGL.glLightfv(i_106_, 4609, aFloatArray9145, 0);
			OpenGL.glLightf(i_106_, 4617, 1.0F / (class480_sub23.getRange() * class480_sub23.getRange()));
			OpenGL.glEnable(i_106_);
		}
		for (; i < anInt9080; i++) {
			OpenGL.glDisable(16386 + i);
		}
		anInt9080 = anInt9081;
	}

	final synchronized void deleteTexture(int name, int size) {
		LinkableInt linkable = new LinkableInt(size);
		linkable.linkedKey = name * -7096345066895942069L;
		deletedTextures.pushBack(linkable);
	}

	final void method14304() {
		if (aBool9134) {
			int i = 0;
			int i_114_ = 0;
			if (anInt8986 == 0) {
				i = 0;
				i_114_ = 0;
			} else if (anInt8986 == 1) {
				i = 1;
				i_114_ = 0;
			} else if (anInt8986 == 2) {
				i = 1;
				i_114_ = 1;
			} else if (anInt8986 == 3) {
				i = 0;
				i_114_ = 1;
			}
			if (blendType == 1) {
				OpenGL.glBlendFuncSeparate(770, 771, i, i_114_);
			} else if (blendType == 2) {
				OpenGL.glBlendFuncSeparate(1, 1, i, i_114_);
			} else if (blendType == 3) {
				OpenGL.glBlendFuncSeparate(774, 1, i, i_114_);
			} else if (blendType == 0) {
				OpenGL.glBlendFuncSeparate(1, 0, i, i_114_);
			}
		} else if (blendType == 1) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (blendType == 2) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (blendType == 3) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	void method14305() {
		RGBA_COLOUR[0] = sunIntensity * aFloat9149;
		RGBA_COLOUR[1] = sunIntensity * aFloat9074;
		RGBA_COLOUR[2] = sunIntensity * aFloat9159;
		RGBA_COLOUR[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, RGBA_COLOUR, 0);
		RGBA_COLOUR[0] = -aFloat8985 * aFloat9149;
		RGBA_COLOUR[1] = -aFloat8985 * aFloat9074;
		RGBA_COLOUR[2] = -aFloat8985 * aFloat9159;
		RGBA_COLOUR[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, RGBA_COLOUR, 0);
	}

	void method14306() {
		OpenGL.glLightfv(16384, 4611, sunDirection, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9071, 0);
	}

	final void method14307() {
		if (anInt9086 != 0) {
			anInt9086 = 0;
			method14291();
			method14453();
			anInt9023 &= ~0xf;
		}
	}

	void method14308() {
		aFloat9089 = aFloat9048 - anInt9026 - aFloat9091;
		aFloat9088 = aFloat9089 - anInt9073 * aFloat9090;
		if (aFloat9088 < aFloat9123) {
			aFloat9088 = aFloat9123;
		}
		OpenGL.glFogf(2915, aFloat9088);
		OpenGL.glFogf(2916, aFloat9089);
		RGBA_COLOUR[0] = (anInt9085 & 0xff0000) / 1.671168E7F;
		RGBA_COLOUR[1] = (anInt9085 & 0xff00) / 65280.0F;
		RGBA_COLOUR[2] = (anInt9085 & 0xff) / 255.0F;
		OpenGL.glFogfv(2918, RGBA_COLOUR, 0);
	}

	boolean method14313() {
		if (aClass480_Sub4_Sub2_9028 != null) {
			if (!aClass480_Sub4_Sub2_9028.method15498()) {
				if (aClass112_8995.method2039(aClass480_Sub4_Sub2_9028)) {
					aClass119_8993.clear();
				} else {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	boolean method14314() {
		if (aClass480_Sub4_Sub3_8998 != null) {
			if (!aClass480_Sub4_Sub3_8998.method15498()) {
				if (aClass112_8995.method2039(aClass480_Sub4_Sub3_8998)) {
					aClass119_8993.clear();
				} else {
					return false;
				}
			}
			return true;
		}
		return false;
	}

	final synchronized void deleteFrameBuffer(int identifer) {
		LinkableInt class480_sub24 = new LinkableInt(identifer);
		deletedFrameBuffers.pushBack(class480_sub24);
	}

	final ArrayBuffer createArrayBuffer(int stride, byte[] buffer, int length, boolean stream) {
		if (aBool9038 && (!stream || aBool9121)) {
			return new OpenGlArrayBuffer(this, stride, buffer, length, stream);
		}

		return new NativeOpenGlArrayBuffer(this, stride, buffer, length);
	}

	final ArrayBuffer createArrayBuffer(Buffer buffer, int stride, int length, boolean stream) {
		if (aBool9038 && (!stream || aBool9121)) {
			return new OpenGlArrayBuffer(this, stride, buffer, length, stream);
		}

		return new NativeOpenGlArrayBuffer(this, stride, buffer);
	}

	final void setPointers(OpenGlArrayBufferPointer vertex, OpenGlArrayBufferPointer normal,
			OpenGlArrayBufferPointer color, OpenGlArrayBufferPointer texture) {
		if (vertex != null) {
			bindArrayBuffer(vertex.buffer);
			OpenGL.glVertexPointer(vertex.size, vertex.type, arrayBuffer.getStride(), arrayBuffer.getAddress()
					+ vertex.offset);
			OpenGL.glEnableClientState(32884);
		} else {
			OpenGL.glDisableClientState(32884);
		}

		if (normal != null) {
			bindArrayBuffer(normal.buffer);
			OpenGL.glNormalPointer(normal.type, arrayBuffer.getStride(), arrayBuffer.getAddress() + normal.offset);
			OpenGL.glEnableClientState(32885);
		} else {
			OpenGL.glDisableClientState(32885);
		}

		if (color != null) {
			bindArrayBuffer(color.buffer);
			OpenGL.glColorPointer(color.size, color.type, arrayBuffer.getStride(), arrayBuffer.getAddress()
					+ color.offset);
			OpenGL.glEnableClientState(32886);
		} else {
			OpenGL.glDisableClientState(32886);
		}

		if (texture != null) {
			bindArrayBuffer(texture.buffer);
			OpenGL.glTexCoordPointer(texture.size, texture.type, arrayBuffer.getStride(), arrayBuffer.getAddress()
					+ texture.offset);
			OpenGL.glEnableClientState(32888);
		} else {
			OpenGL.glDisableClientState(32888);
		}
	}

	final void method14321() {
		if (anInt9023 != 1) {
			method14385();
			method14334(false);
			method14335(false);
			method14338(false);
			method14339(false);
			setActiveTexture(null);
			method14497(-2);
			setColourOp(1);
			method14344((byte) 0);
			anInt9023 = 1;
		}
	}

	final void method14322() {
		if (anInt9023 != 2) {
			method14385();
			method14334(false);
			method14335(false);
			method14338(false);
			method14339(false);
			method14497(-2);
			method14344((byte) 0);
			anInt9023 = 2;
		}
	}

	final void method14323() {
		if (anInt9023 != 4) {
			method14385();
			method14334(false);
			method14335(false);
			method14338(false);
			method14339(false);
			method14497(-2);
			setBlendMode(1);
			method14344((byte) 0);
			anInt9023 = 4;
		}
	}

	final void method14325(int i, boolean bool, boolean bool_135_) {
		if (i != anInt9002 || aBool9093 != underwater) {
			OpenGl2DTexture class102_sub1 = null;
			byte i_136_ = 0;
			byte i_137_ = 0;
			int i_138_ = 0;
			byte i_139_ = underwater ? (byte) 3 : (byte) 0;
			byte i_140_ = 0;
			if (i >= 0) {
				TextureMetrics class141 = metricsList.get(i);
				if (class141.aBool1698) {
					class102_sub1 = aClass119_8993.get(class141);
					if (class141.aByte1728 != 0 || class141.aByte1700 != 0) {
						method14514(anInt8966 % 128000 / 1000.0F * class141.aByte1728 / 64.0F % 1.0F, anInt8966
								% 128000 / 1000.0F * class141.aByte1700 / 64.0F % 1.0F, 0.0F);
					} else {
						method14333();
					}
					if (!underwater) {
						i_137_ = class141.aByte1720;
						i_138_ = class141.anInt1721 * -1583207725;
						i_139_ = class141.aByte1719;
					}
					i_136_ = class141.aByte1690;
				} else {
					method14333();
				}
				if (class141.aClass554_1727 == Class554.aClass554_7501) {
					i_140_ = class141.aByte1711;
				}
			} else {
				method14333();
			}
			method14344(i_140_);
			aClass106_9152.method1975(i_139_, i_137_, i_138_, bool, bool_135_);
			if (!aClass106_9152.method1973(class102_sub1, i_136_)) {
				setActiveTexture(class102_sub1);
				setColourOp(i_136_);
			}
			aBool9093 = underwater;
			anInt9002 = i;
		}
		anInt9023 &= ~0x7;
	}

	final void method14326(int i) {
		if (anInt9019 != i) {
			OpenGL.glActiveTexture(33984 + i);
			anInt9019 = i;
		}
	}

	final void setActiveTexture(OpenGlTexture texture) {
		OpenGlTexture current = aClass102Array9103[anInt9019];
		if (current != texture) {
			if (texture != null) {
				if (current != null) {
					if (texture.target != current.target) {
						OpenGL.glDisable(current.target);
						OpenGL.glEnable(texture.target);
					}
				} else {
					OpenGL.glEnable(texture.target);
				}
				OpenGL.glBindTexture(texture.target, texture.name);
			} else {
				OpenGL.glDisable(current.target);
			}
			aClass102Array9103[anInt9019] = texture;
		}
		anInt9023 &= ~0x1;
	}

	final void setColourOp(int i) {
		if (i == 1) {
			setTextureParameters(7681, 7681);
		} else if (i == 0) {
			setTextureParameters(8448, 8448);
		} else if (i == 2) {
			setTextureParameters(34165, 7681);
		} else if (i == 3) {
			setTextureParameters(260, 8448);
		} else if (i == 4) {
			setTextureParameters(34023, 34023);
		}
	}

	final int method14329(int i) {
		if (i == 1) {
			return 7681;
		}
		if (i == 0) {
			return 8448;
		}
		if (i == 2) {
			return 34165;
		}
		if (i == 3) {
			return 260;
		}
		if (i == 4) {
			return 34023;
		}
		throw new IllegalArgumentException();
	}

	final void setTextureParameters(int rgb, int alpha) {
		if (anInt9019 == 0) {
			boolean updated = false;
			if (anInt9140 != rgb) {
				OpenGL.glTexEnvi(8960, 34161, rgb);
				anInt9140 = rgb;
				updated = true;
			}

			if (anInt9100 != alpha) {
				OpenGL.glTexEnvi(8960, 34162, alpha);
				anInt9100 = alpha;
				updated = true;
			}

			if (updated) {
				anInt9023 &= ~0xd;
			}
		} else {
			OpenGL.glTexEnvi(8960, 34161, rgb);
			OpenGL.glTexEnvi(8960, 34162, alpha);
		}
	}

	final void setTexEnvColour(int colour) {
		RGBA_COLOUR[0] = (colour & 0xff0000) / 1.671168E7F;
		RGBA_COLOUR[1] = (colour & 0xff00) / 65280.0F;
		RGBA_COLOUR[2] = (colour & 0xff) / 255.0F;
		RGBA_COLOUR[3] = (colour >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, RGBA_COLOUR, 0);
	}

	final void setTexEnvColour(float red, float green, float blue, float alpha) {
		RGBA_COLOUR[0] = red;
		RGBA_COLOUR[1] = green;
		RGBA_COLOUR[2] = blue;
		RGBA_COLOUR[3] = alpha;
		OpenGL.glTexEnvfv(8960, 8705, RGBA_COLOUR, 0);
	}

	final void method14333() {
		if (aBool9017) {
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5888);
			aBool9017 = false;
		}
	}

	final void method14334(boolean bool) {
		if (bool != aBool9084) {
			aBool9084 = bool;
			method14298();
			anInt9023 &= ~0xf;
		}
	}

	final void method14335(boolean bool) {
		if (bool != aBool9066) {
			aBool9066 = bool;
			method14337();
			anInt9023 &= ~0x7;
		}
	}

	final void method14336(boolean bool) {
		if (bool != aBool9067) {
			aBool9067 = bool;
			method14337();
		}
	}

	void method14337() {
		if (aBool9066 && !aBool9067) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	final void method14338(boolean bool) {
		if (bool != aBool9031) {
			if (bool) {
				OpenGL.glEnable(2929);
			} else {
				OpenGL.glDisable(2929);
			}
			aBool9031 = bool;
			anInt9023 &= ~0xf;
		}
	}

	final void method14339(boolean bool) {
		if (bool != aBool9032) {
			aBool9032 = bool;
			method14365();
			anInt9023 &= ~0xf;
		}
	}

	final void setBlendMode(int mode) {
		if (blendMode != mode) {
			int type;
			boolean mask;
			boolean bool_154_;
			boolean bool_155_;

			if (mode == 1) {
				type = 1;
				mask = true;
				bool_154_ = true;
				bool_155_ = true;
			} else if (mode == 2) {
				type = 2;
				mask = true;
				bool_154_ = false;
				bool_155_ = true;
			} else if (mode == 128) {
				type = 3;
				mask = true;
				bool_154_ = true;
				bool_155_ = true;
			} else if (mode == 3) {
				type = 0;
				mask = true;
				bool_154_ = true;
				bool_155_ = false;
			} else {
				type = 0;
				mask = true;
				bool_154_ = false;
				bool_155_ = false;
			}

			if (mask != colourMask) {
				OpenGL.glColorMask(mask, mask, mask, true);
				colourMask = mask;
			}

			if (bool_154_ != aBool9029) {
				aBool9029 = bool_154_;
				method14343();
			}
			if (bool_155_ != aBool9027) {
				aBool9027 = bool_155_;
				method14463();
			}
			if (type != blendType) {
				blendType = type;
				method14304();
			}
			blendMode = mode;
			anInt9023 &= ~0xc;
		}
	}

	final void method14342(int i) {
		if (anInt8986 != i) {
			anInt8986 = i;
			method14304();
		}
	}

	final void method14343() {
		if (aBool9029) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}
		OpenGL.glAlphaFunc(516, (aByte9030 & 0xff) / 255.0F);
		if (anInt8992 > 0) {
			if (aByte9030 == 0) {
				OpenGL.glDisable(32926);
			} else {
				OpenGL.glEnable(32926);
			}
		}
	}

	final void method14344(byte i) {
		if (aByte9030 != i) {
			aByte9030 = i;
			if (i == 0) {
				method14342(2);
				setBlendMode(1);
			} else {
				method14342(3);
				setBlendMode(3);
			}
			method14343();
		}
	}

	final synchronized void deleteBuffer(int name, int length) {
		LinkableInt linkable = new LinkableInt(length);
		linkable.linkedKey = name * -7096345066895942069L;
		deletedBuffers.pushBack(linkable);
	}

	final ElementArrayBuffer createElementArrayBuffer(byte[] buffer, int length, boolean stream) {
		if (aBool9038 && (!stream || aBool9121)) {
			return new OpenGlElementArrayBuffer(this, buffer, length, stream);
		}

		return new NativeOpenGlElementArrayBuffer(this, buffer, length);
	}

	final synchronized void deleteShader(long shader) {
		Linkable linkable = new Linkable();
		linkable.linkedKey = shader * -7096345066895942069L;
		deletedShaders.pushBack(linkable);
	}

	final synchronized void deleteProgram(int program) {
		Linkable linkable = new Linkable();
		linkable.linkedKey = program * -7096345066895942069L;
		deletedPrograms.pushBack(linkable);
	}

	final void method14353(int i, int i_170_, int i_171_) {
		OpenGL.glDrawArrays(i, i_170_, i_171_);
	}

	void method14357() {
		aClass102Array9103 = new OpenGlTexture[anInt8948];
		aClass102_Sub1_9047 = new OpenGl2DTexture(this,OpenGL.GL_TEXTURE_2D, Class121.aClass121_1465, Class151.aClass151_2, 1, 1);
		new OpenGl2DTexture(this,OpenGL.GL_TEXTURE_2D, Class121.aClass121_1465, Class151.aClass151_2, 1, 1);
		new OpenGl2DTexture(this,OpenGL.GL_TEXTURE_2D, Class121.aClass121_1465, Class151.aClass151_2, 1, 1);
		for (int i = 0; i < 8; i++) {
			aClass143_Sub1Array8989[i] = new OpenGlModel(this);
			aClass143_Sub1Array9138[i] = new OpenGlModel(this);
		}

		if (aBool9035) {
			aClass146_Sub2_Sub1_9049 = new OpenGlDirectDisplay(this);
			new OpenGlDirectDisplay(this);
		}
	}

	void method14363() {
		method14497(-2);
		for (int i = anInt8948 - 1; i >= 0; i--) {
			method14326(i);
			setActiveTexture(null);
			OpenGL.glTexEnvi(8960, 8704, 34160);
		}

		setTextureParameters(8448, 8448);
		method14376(2, 34168, 770);
		method14333();
		blendMode = 1;
		anInt8986 = 0;
		aBool9027 = true;

		if (aBool9134) {
			OpenGL.glBlendFuncSeparate(770, 771, 0, 0);
		} else {
			OpenGL.glBlendFunc(770, 771);
		}

		blendType = 1;
		aByte9030 = (byte) -1;
		method14344((byte) 0);
		aBool9029 = true;
		OpenGL.glEnable(3008);
		OpenGL.glAlphaFunc(516, aByte9030);
		if (aBool9118) {
			if (anInt8992 == 0) {
				OpenGL.glDisable(32925);
			} else {
				OpenGL.glEnable(32925);
			}
			OpenGL.glDisable(32926);
		}
		OpenGL.glColorMask(true, true, true, true);
		colourMask = true;
		method14334(true);
		method14335(true);
		method14338(true);
		method14339(true);
		method2420(0.0F, 1.0F);
		method14307();
		gl.setSwapInterval(0);
		OpenGL.glShadeModel(7425);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glDepthFunc(515);
		OpenGL.glPolygonMode(1028, 6914);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };
		for (int i = 0; i < 8; i++) {
			int i_211_ = 16384 + i;
			OpenGL.glLightfv(i_211_, 4608, fs, 0);
			OpenGL.glLightf(i_211_, 4615, 0.0F);
			OpenGL.glLightf(i_211_, 4616, 0.0F);
		}
		OpenGL.glEnable(16384);
		OpenGL.glEnable(16385);
		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		if (aBool9075) {
			OpenGL.glEnable(34895);
		}
		anInt9085 = -1;
		anInt9112 = -1;
		method2494();
		method2421();
	}

	final void method14365() {
		OpenGL.glDepthMask(aBool9032 && aBool9054);
	}

	void method14370() {
		RGBA_COLOUR[0] = ambient * aFloat9149;
		RGBA_COLOUR[1] = ambient * aFloat9074;
		RGBA_COLOUR[2] = ambient * aFloat9159;
		RGBA_COLOUR[3] = 1.0F;
		OpenGL.glLightModelfv(2899, RGBA_COLOUR, 0);
	}

	final void bindElementArrayBuffer(ElementArrayBuffer buffer) {
		if (elementBuffer != buffer) {
			if (aBool9038) {
				OpenGL.glBindBufferARB(34963, buffer.getName());
			}

			elementBuffer = buffer;
		}
	}

	final void method14375() {
		if (anInt9023 != 8) {
			method14420();
			method14334(true);
			method14338(true);
			method14339(true);
			setBlendMode(1);
			method14344((byte) 0);
			anInt9023 = 8;
		}
	}

	final void method14376(int i, int i_243_, int i_244_) {
		OpenGL.glTexEnvi(8960, 34176 + i, i_243_);
		OpenGL.glTexEnvi(8960, 34192 + i, i_244_);
	}

	final void method14378(float f, float f_249_) {
		aFloat9090 = f;
		aFloat9091 = f_249_;
		method14308();
	}

	final void method14385() {
		if (anInt9086 != 1) {
			anInt9086 = 1;
			method14299();
			method14291();
			method14453();
			OpenGL.glMatrixMode(5888);
			OpenGL.glLoadIdentity();
			anInt9023 &= ~0x8;
		}
	}

	void method14391() {
		int i = 0;
		while (!gl.method1386()) {
			if (i++ > 5) {
				throw new RuntimeException("");
			}
			Client.sleep(1000L);
		}
	}

	void method14400(int i, int i_261_) {
		method2416();
		method2757(i, i_261_);
		if (aBool9122) {
			aClass116_9153 = createSprite(i, i_261_, true, true);
			aClass146_Sub2_9154 = createDirectDisplay();
			aClass146_Sub2_9154.method14256(0, aClass116_9153.method2075());
			OpenGL.glGenBuffersARB(3, anIntArray8965, 0);
			for (int i_262_ = 0; i_262_ < 3; i_262_++) {
				OpenGL.glBindBufferARB(35051, anIntArray8965[i_262_]);
				OpenGL.glBufferDataARBa(35051, i * i_261_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass116_9153 = createSprite(i, i_261_, true, true);
			aClass146_Sub2_9154 = createDirectDisplay();
			aClass146_Sub2_9154.method14256(0, aClass116_9153.method2075());
		}
	}

	final void method14405() {
		OpenGL.glLoadIdentity();
		OpenGL.glMultMatrixf(aClass399_9015.array, 0);
		if (aBool9093) {
			aClass106_9152.aClass101_Sub2_1351.method14001();
		}
		method14306();
		method14302();
	}

	final void method14420() {
		if (anInt9086 != 2) {
			anInt9086 = 2;
			method14301(aClass399_9036.array);
			method14405();
			method14291();
			method14453();
			anInt9023 &= ~0x7;
		}
	}

	final void method14453() {
		if (anInt9086 == 2) {
			OpenGL.glDepthRange(aFloat9113, aFloat9046);
		} else {
			OpenGL.glDepthRange(0.0F, 1.0F);
		}
	}

	final void method14463() {
		if (aBool9027) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	int method14464() {
		int attributes = 0;
		vendorName = OpenGL.glGetString(7936).toLowerCase();
		description = OpenGL.glGetString(7937).toLowerCase();
		if (vendorName.indexOf("microsoft") != -1) {
			attributes |= 0x1;
		}
		if (vendorName.indexOf("brian paul") != -1 || vendorName.indexOf("mesa") != -1) {
			attributes |= 0x1;
		}
		String string = OpenGL.glGetString(7938);
		String[] strings = Class374.splitString(string.replace('.', ' '), ' ');
		if (strings.length >= 2) {
			try {
				int i_285_ = Client.parseDecimal(strings[0]);
				int i_286_ = Client.parseDecimal(strings[1]);
				version = i_285_ * 10 + i_286_;
			} catch (NumberFormatException numberformatexception) {
				attributes |= 0x4;
			}
		} else {
			attributes |= 0x4;
		}
		if (version < 12) {
			attributes |= 0x2;
		}
		if (!gl.method1385("GL_ARB_multitexture")) {
			attributes |= 0x8;
		}
		if (!gl.method1385("GL_ARB_texture_env_combine")) {
			attributes |= 0x20;
		}
		int[] is = new int[1];
		OpenGL.glGetIntegerv(34018, is, 0);
		anInt8948 = is[0];
		OpenGL.glGetIntegerv(34929, is, 0);
		anInt9150 = is[0];
		OpenGL.glGetIntegerv(34930, is, 0);
		anInt9114 = is[0];
		if (anInt8948 < 2 || anInt9150 < 2 || anInt9114 < 2) {
			attributes |= 0x10;
		}

		bigEndian = Stream.method1427();
		aBool9038 = gl.method1385("GL_ARB_vertex_buffer_object");
		aBool9118 = gl.method1385("GL_ARB_multisample");
		aBool9104 = gl.method1385("GL_ARB_vertex_program");
		aBool9006 = gl.method1385("GL_ARB_fragment_program");
		aBool9130 = gl.method1385("GL_ARB_vertex_shader");
		aBool9132 = gl.method1385("GL_ARB_fragment_shader");
		aBool8982 = gl.method1385("GL_EXT_texture3D");
		aBool9126 = gl.method1385("GL_ARB_texture_rectangle");
		aBool9124 = gl.method1385("GL_ARB_texture_cube_map");
		aBool9075 = gl.method1385("GL_ARB_seamless_cube_map");
		aBool9127 = gl.method1385("GL_ARB_texture_float");
		aBool8976 = gl.method1385("GL_ARB_texture_non_power_of_two");
		aBool9035 = gl.method1385("GL_EXT_framebuffer_object");
		aBool9116 = gl.method1385("GL_EXT_framebuffer_blit");
		aBool9117 = gl.method1385("GL_EXT_framebuffer_multisample");
		aBool9061 = aBool9116 & aBool9117;
		aBool9134 = gl.method1385("GL_EXT_blend_func_separate");
		aBool9122 = unsafe != null && (version >= 32 || gl.method1385("GL_ARB_sync"));
		aBool9111 = Class485.osName.startsWith("mac");
		OpenGL.glGetFloatv(2834, RGBA_COLOUR, 0);
		aFloat9137 = RGBA_COLOUR[0];
		aFloat9136 = RGBA_COLOUR[1];
		return attributes != 0 ? attributes : 0;
	}

	final void method14486(int i, boolean bool) {
		method14325(i, bool, true);
	}

	final void method14497(int i) {
		method14486(i, true);
	}

	final void method14514(float f, float f_295_, float f_296_) {
		OpenGL.glMatrixMode(5890);
		if (aBool9017) {
			OpenGL.glLoadIdentity();
		}

		OpenGL.glTranslatef(f, f_295_, f_296_);
		OpenGL.glMatrixMode(5888);
		aBool9017 = true;
	}

	final void method14517(Matrix4f matrix) {
		OpenGL.glPushMatrix();
		OpenGL.glMultMatrixf(matrix.array, 0);
	}

	@Override
	void method2374() {
		for (Linkable class480 = aClass644_9009.head(); class480 != null; class480 = aClass644_9009.next()) {
			((Class480_Sub5_Sub1) class480).method17537();
		}
		if (aClass112_8995 != null) {
			aClass112_8995.method2032();
		}
		if (aBool9128) {
			Class470.method8046(false, true);
			aBool9128 = false;
		}
	}

	@Override
	boolean method2377(int i, int i_0_, int i_1_, int i_2_, Class405 class405, Class379 class379) {
		Matrix4f class399 = aClass399_9050;
		class399.method6548(class405);
		class399.method6547(aClass399_9087);
		return class379.method6218(i, i_0_, i_1_, i_2_, class399, aFloat9041, aFloat9043, aFloat9004, aFloat9044);
	}

	@Override
	DelegatingDisplay createDelegatingDisplay(Canvas canvas, int width, int height) {
		return new OpenGlDelegatingDisplay(this, canvas);
	}

	@Override
	void method2437(int i, int i_48_, int i_49_, int i_50_, int i_51_) {
		method14321();
		setBlendMode(i_51_);
		float f = i + 0.35F;
		float f_52_ = i_48_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_50_ >> 16), (byte) (i_50_ >> 8), (byte) i_50_, (byte) (i_50_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_52_);
		OpenGL.glVertex2f(f + i_49_, f_52_);
		OpenGL.glEnd();
	}

	@Override
	void method2472(int i, int i_53_, int i_54_, int i_55_, int i_56_) {
		method14321();
		setBlendMode(i_56_);
		float f = i + 0.35F;
		float f_57_ = i_53_ + 0.35F;
		OpenGL.glColor4ub((byte) (i_55_ >> 16), (byte) (i_55_ >> 8), (byte) i_55_, (byte) (i_55_ >> 24));
		OpenGL.glBegin(1);
		OpenGL.glVertex2f(f, f_57_);
		OpenGL.glVertex2f(f, f_57_ + i_54_);
		OpenGL.glEnd();
	}

	@Override
	final void method2500(float f, float f_267_, float f_268_, float f_269_, float f_270_, float f_271_) {
		Class480_Sub4_Sub1.params = f;
		Class480_Sub4_Sub1.aFloat11174 = f_267_;
		Class480_Sub4_Sub1.aFloat11173 = f_268_;
	}

	@Override
	void method2647(int i, int i_3_) {
		try {
			aClass146_Sub1_1552.draw();
		} catch (Exception exception) {

		}
		if (anInterface19_1546 != null) {
			anInterface19_1546.method106();
		}
	}

	@Override
	void method2736(int i, int i_40_, int i_41_, int i_42_, int i_43_) {
		if (i_41_ < 0) {
			i_41_ = -i_41_;
		}
		if (i + i_41_ >= anInt9057 && i - i_41_ <= anInt9058 && i_40_ + i_41_ >= anInt9055
				&& i_40_ - i_41_ <= anInt9056) {
			method14321();
			setBlendMode(i_43_);
			OpenGL.glColor4ub((byte) (i_42_ >> 16), (byte) (i_42_ >> 8), (byte) i_42_, (byte) (i_42_ >> 24));
			float f = i + 0.35F;
			float f_44_ = i_40_ + 0.35F;
			int i_45_ = i_41_ << 1;
			if (i_45_ < aFloat9137) {
				OpenGL.glBegin(7);
				OpenGL.glVertex2f(f + 1.0F, f_44_ + 1.0F);
				OpenGL.glVertex2f(f + 1.0F, f_44_ - 1.0F);
				OpenGL.glVertex2f(f - 1.0F, f_44_ - 1.0F);
				OpenGL.glVertex2f(f - 1.0F, f_44_ + 1.0F);
				OpenGL.glEnd();
			} else if (i_45_ <= aFloat9136) {
				OpenGL.glEnable(2832);
				OpenGL.glPointSize(i_45_);
				OpenGL.glBegin(0);
				OpenGL.glVertex2f(f, f_44_);
				OpenGL.glEnd();
				OpenGL.glDisable(2832);
			} else {
				OpenGL.glBegin(6);
				OpenGL.glVertex2f(f, f_44_);
				int i_46_ = 262144 / (6 * i_41_);
				if (i_46_ <= 64) {
					i_46_ = 64;
				} else if (i_46_ > 512) {
					i_46_ = 512;
				}
				i_46_ = Class593.priorPowerOf2(i_46_);
				OpenGL.glVertex2f(f + i_41_, f_44_);
				for (int i_47_ = 16384 - i_46_; i_47_ > 0; i_47_ -= i_46_) {
					OpenGL.glVertex2f(f + Class111.COSINE[i_47_] * i_41_, f_44_ + Class111.SINE[i_47_] * i_41_);
				}
				OpenGL.glVertex2f(f + i_41_, f_44_);
				OpenGL.glEnd();
			}
		}
	}

}