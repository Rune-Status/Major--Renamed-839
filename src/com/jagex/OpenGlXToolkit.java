package com.jagex;

import jaclib.memory.Stream;
import jaggl.MapBuffer;
import jaggl.OpenGL;

import java.awt.Canvas;

public final class OpenGlXToolkit extends NativeToolkit {
	static final int anInt10972 = 3;

	public static Toolkit create(Canvas canvas, TextureMetricsList class147, Interface19 interface19,
			BillboardLoader billboardLoader, ParticleProducerDefinitionLoader particleLoader, Interface44 interface44,
			Archive shaders, int multisamples) {
		try {
			Client.loadJaclib();
			Client.getNativeProvider().load("jaggl");
			CompressionType.ignoreRepaint(canvas);
			OpenGL gl = new OpenGL();
			long l = gl.init(canvas, 8, 8, 8, 24, 0, multisamples);
			if (l == 0L) {
				throw new RuntimeException("");
			}

			OpenGlXToolkit toolkit = new OpenGlXToolkit(gl, canvas, l, class147, interface19, billboardLoader,
					particleLoader, interface44, shaders, multisamples);
			toolkit.method14596();
			return toolkit;
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
	}

	static final int method17350(Class347 class347) {
		if (class347 == Class347.aClass347_3673) {
			return 7681;
		}
		if (class347 == Class347.aClass347_3671) {
			return 8448;
		}
		if (class347 == Class347.aClass347_3675) {
			return 34165;
		}
		if (class347 == Class347.aClass347_3672) {
			return 260;
		}
		if (class347 == Class347.aClass347_3674) {
			return 34023;
		}
		throw new IllegalArgumentException();
	}

	static int method17357(Class121 class121, Class151 class151) {
		if (class151 == Class151.aClass151_2) {
			switch (class121.id * 1703450577) {
				case 2:
					return 6407;
				case 6:
					return 33779;
				case 5:
					return 6406;
				case 9:
					return 33777;
				case 0:
					return 6410;
				case 4:
					return 6408;
				default:
					throw new IllegalArgumentException();
				case 8:
					return 6409;
			}
		}
		if (class151 == Class151.aClass151_1849) {
			switch (class121.id * 1703450577) {
				case 4:
					return 32859;
				case 0:
					return 36219;
				case 1:
					return 33189;
				default:
					throw new IllegalArgumentException();
				case 5:
					return 32830;
				case 8:
					return 32834;
				case 2:
					return 32852;
			}
		}
		if (class151 == Class151.aClass151_1854) {
			switch (class121.id * 1703450577) {
				default:
					throw new IllegalArgumentException();
				case 1:
					return 33190;
			}
		}
		if (class151 == Class151.aClass151_1850) {
			switch (class121.id * 1703450577) {
				default:
					throw new IllegalArgumentException();
				case 1:
					return 33191;
			}
		}
		if (class151 == Class151.aClass151_1855) {
			switch (class121.id * 1703450577) {
				case 5:
					return 34844;
				case 2:
					return 34843;
				default:
					throw new IllegalArgumentException();
				case 0:
					return 34847;
				case 4:
					return 34842;
				case 8:
					return 34846;
			}
		}
		if (class151 == Class151.aClass151_1) {
			switch (class121.id * 1703450577) {
				default:
					throw new IllegalArgumentException();
				case 4:
					return 34836;
				case 0:
					return 34841;
				case 2:
					return 34837;
				case 5:
					return 34838;
				case 8:
					return 34840;
			}
		}
		throw new IllegalArgumentException();
	}

	static int method17363(Class121 class121) {
		switch (class121.id * 1703450577) {
			case 1:
				return 6402;
			case 2:
				return 6407;
			default:
				throw new IllegalStateException();
			case 5:
				return 6406;
			case 0:
				return 6410;
			case 8:
				return 6409;
			case 4:
				return 6408;
		}
	}

	static final int method17369(Class344 class344) {
		if (class344 == Class344.aClass344_3650) {
			return 5890;
		}
		if (class344 == Class344.aClass344_3652) {
			return 34167;
		}
		if (class344 == Class344.aClass344_3651) {
			return 34168;
		}
		if (class344 == Class344.aClass344_3649) {
			return 34166;
		}
		throw new IllegalArgumentException();
	}

	static final int method17380(Class151 class151) {
		switch (class151.id * 451784863) {
			case 1:
				return 5124;
			case 0:
				return 5122;
			case 3:
				return 5131;
			case 5:
				return 5125;
			case 8:
				return 5121;
			case 4:
				return 5120;
			case 6:
				return 5126;
			case 7:
				return 5123;
			default:
				return 5121;
		}
	}

	boolean aBool10962;
	boolean aBool10967;
	boolean aBool10970;
	boolean aBool10971;
	boolean aBool10978;
	boolean aBool10981;
	boolean aBool10982;
	boolean aBool10983;
	boolean aBool10984;
	boolean aBool10986;
	boolean aBool10987;
	boolean aBool10988;
	boolean aBool10991;
	Sprite aClass116_10995;
	Sprite aClass116_10996;
	DirectDisplay aClass146_Sub2_10997;
	Class249_Sub2 aClass249_Sub2_10977;
	OpenGlXArrayBuffer[] aClass451_Sub1Array10974;
	OpenGlXElementArrayBuffer aClass451_Sub2_10994;
	Deque aClass644_10960;
	Deque aClass644_10961 = new Deque();
	Deque deletedTextures;
	Deque aClass644_10964;
	Deque deletedRenderBuffers;
	Deque aClass644_10966;
	Deque aClass644_10985;
	float[] aFloatArray10979;
	float[] aFloatArray10992;
	long aLong10968;
	long[] aLongArray10980;
	int anInt10990;
	int anInt10993;
	int anInt11001;
	int anInt11002;
	int[] anIntArray10969;
	int[] anIntArray10975;
	int[] anIntArray10998;
	int[] anIntArray11000;
	OpenGL gl;
	String aString10973;
	String description;
	int version;

	OpenGlXToolkit(OpenGL opengl, Canvas canvas, long l, TextureMetricsList metricsList, Interface19 interface19,
			BillboardLoader billboardLoader, ParticleProducerDefinitionLoader particleLoader, Interface44 interface44,
			Archive shaders, int i) {
		super(metricsList, interface19, billboardLoader, particleLoader, interface44, shaders, i, 1);
		aClass644_10960 = new Deque();
		deletedTextures = new Deque();
		aClass644_10964 = new Deque();
		deletedRenderBuffers = new Deque();
		aClass644_10966 = new Deque();
		aClass644_10985 = new Deque();
		anIntArray10975 = new int[1000];
		aClass451_Sub1Array10974 = new OpenGlXArrayBuffer[16];
		new MapBuffer();
		new MapBuffer();
		aFloatArray10992 = new float[4];
		aFloatArray10979 = new float[16];
		aClass116_10995 = null;
		aClass116_10996 = null;
		aClass146_Sub2_10997 = null;
		anIntArray10998 = new int[3];
		aLongArray10980 = new long[3];
		anIntArray11000 = new int[3];
		anInt11001 = 0;
		anInt11002 = 0;
		int[] is = new int[1];
		try {
			gl = opengl;
			gl.method1386();
			aString10973 = OpenGL.glGetString(7936).toLowerCase();
			description = OpenGL.glGetString(7937).toLowerCase();
			if (aString10973.indexOf("microsoft") != -1 || aString10973.indexOf("brian paul") != -1
					|| aString10973.indexOf("mesa") != -1) {
				throw new RuntimeException("");
			}
			String string = OpenGL.glGetString(7938);
			String[] strings = Class374.splitString(string.replace('.', ' '), ' ');
			if (strings.length >= 2) {
				try {
					int i_76_ = Client.parseDecimal(strings[0]);
					int i_77_ = Client.parseDecimal(strings[1]);
					version = i_76_ * 10 + i_77_;
				} catch (NumberFormatException numberformatexception) {
					throw new RuntimeException("");
				}
			} else {
				throw new RuntimeException("");
			}
			if (version < 12) {
				throw new RuntimeException("");
			}
			OpenGL.glGetIntegerv(34018, is, 0);
			anInt9406 = is[0];
			if (anInt9406 < 2) {
				throw new RuntimeException("");
			}
			anInt9407 = 8;
			aBool10982 = gl.method1385("GL_ARB_vertex_buffer_object");
			aBool9411 = gl.method1385("GL_ARB_multisample");
			aBool9415 = gl.method1385("GL_EXT_blend_func_separate");
			aBool10983 = gl.method1385("GL_ARB_texture_rectangle");
			aBool9412 = gl.method1385("GL_ARB_texture_cube_map");
			aBool10984 = gl.method1385("GL_ARB_texture_non_power_of_two");
			threeDimensional = true;
			aBool10981 = gl.method1385("GL_ARB_vertex_shader");
			aBool10986 = gl.method1385("GL_ARB_vertex_program");
			aBool10987 = gl.method1385("GL_ARB_fragment_shader");
			aBool10988 = gl.method1385("GL_ARB_fragment_program");
			aBool9408 = gl.method1385("GL_EXT_framebuffer_object");
			aBool9414 = aBool9408;
			aBool9409 = gl.method1385("GL_EXT_framebuffer_blit");
			aBool9271 = gl.method1385("GL_EXT_framebuffer_multisample");
			aBool10967 = unsafe != null && (version >= 32 || gl.method1385("GL_ARB_sync"));
			anIntArray10969 = new int[anInt9406];
			if (!method14585() || !method14586()) {
				if (!gl.method1385("GL_ARB_multitexture")) {
					throw new RuntimeException("");
				}
				if (!gl.method1385("GL_ARB_texture_env_combine")) {
					throw new RuntimeException("");
				}
			}
			Class485.osName.startsWith("mac");
			anInt10993 = Stream.method1427() ? 33639 : 5121;
			if (description.indexOf("radeon") != -1 || aString10973.indexOf("intel") != -1) {
				int i_78_ = 0;
				boolean bool = aString10973.indexOf("intel") != -1;
				boolean bool_79_ = false;
				boolean bool_80_ = false;
				String[] strings_81_ = Class374.splitString(description.replace('/', ' '), ' ');
				for (String element : strings_81_) {
					String string_83_ = element;
					try {
						if (string_83_.length() <= 0) {
							continue;
						}
						if (string_83_.charAt(0) == 'x' && string_83_.length() >= 3
								&& Class292.isDecimal(string_83_.substring(1, 3))) {
							string_83_ = string_83_.substring(1);
							bool_80_ = true;
						}
						if (string_83_.equals("hd")) {
							bool_79_ = true;
							continue;
						}
						if (string_83_.startsWith("hd")) {
							string_83_ = string_83_.substring(2);
							bool_79_ = true;
						}
						if (string_83_.length() < 4 || !Class292.isDecimal(string_83_.substring(0, 4))) {
							continue;
						}
						i_78_ = Client.parseDecimal(string_83_.substring(0, 4));
					} catch (Exception exception) {
						continue;
					}
					break;
				}
				if (bool) {
					if (!bool_79_) {
						aBool9408 = false;
					}
				} else {
					if (!bool_80_ && !bool_79_) {
						if (i_78_ >= 7000 && i_78_ <= 7999) {
							aBool10982 = false;
						}
						if (i_78_ >= 7000 && i_78_ <= 9250) {
							threeDimensional = false;
						}
					}
					aBool10983 &= gl.method1385("GL_ARB_half_float_pixel");
					aBool10970 = true;
				}
			}
			if (aBool10982) {
				try {
					int[] is_84_ = new int[1];
					OpenGL.glGenBuffersARB(1, is_84_, 0);
				} catch (Throwable throwable) {
					throw new RuntimeException("");
				}
			} else {
				throw new RuntimeException("");
			}
			method2433(canvas, new OpenGlXDelegatingDisplay(this, canvas, l));
			method2620(canvas);
			allocateHeapBuffer(32768, false);
			allocateHeapBuffer(32768, false);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method2373();
			if (throwable instanceof OutOfMemoryError) {
				throw (OutOfMemoryError) throwable;
			}
			throw new RuntimeException("");
		}
	}

	@Override
	public boolean method14585() {
		return aBool10981;
	}

	@Override
	public boolean method14586() {
		return aBool10987;
	}

	@Override
	public float method14608() {
		return 0.0F;
	}

	@Override
	public void method14620(int i, NativeArrayBuffer interface32) {
		aClass451_Sub1Array10974[i] = (OpenGlXArrayBuffer) interface32;
	}

	@Override
	public void method14667() {
		int i = anIntArray10969[anInt9353];
		if (i != 0) {
			anIntArray10969[anInt9353] = 0;
			OpenGL.glBindTexture(i, 0);
			OpenGL.glDisable(i);
		}
	}

	@Override
	public void method14697(Class323 class323) {
		Class320[] class320s = class323.aClass320Array3425;
		int i = 0;
		boolean bool = false;
		boolean bool_64_ = false;
		boolean bool_65_ = false;
		for (int i_66_ = 0; i_66_ < class320s.length; i_66_++) {
			Class320 class320 = class320s[i_66_];
			OpenGlXArrayBuffer buffer = aClass451_Sub1Array10974[i_66_];
			int offset = 0;
			int stride = buffer.getStride();
			long address = buffer.getAddress();
			buffer.bind();

			for (int i_69_ = 0; i_69_ < class320.method5729(); i_69_++) {
				Class316 class316 = class320.method5731(i_69_);
				final int GL_FLOAT = 0x1406;
				switch (class316.anInt3371) {
					case 5:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(2, GL_FLOAT, stride, address + offset);
						break;
					case 8:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(3, GL_FLOAT, stride, address + offset);
						break;
					default:
						break;
					case 9:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(1, GL_FLOAT, stride, address + offset);
						break;
					case 3:
						OpenGL.glClientActiveTexture(33984 + i++);
						OpenGL.glTexCoordPointer(4, GL_FLOAT, stride, address + offset);
						break;
					case 7:
						OpenGL.glColorPointer(4, 5121, stride, address + offset);
						bool = true;
						break;
					case 0:
						OpenGL.glNormalPointer(GL_FLOAT, stride, address + offset);
						bool_64_ = true;
						break;
					case 1:
						OpenGL.glVertexPointer(3, GL_FLOAT, stride, address + offset);
						bool_65_ = true;
				}
				offset += class316.anInt3377;
			}
		}
		if (aBool10978 != bool_65_) {
			if (bool_65_) {
				OpenGL.glEnableClientState(32884);
			} else {
				OpenGL.glDisableClientState(32884);
			}
			aBool10978 = bool_65_;
		}
		if (aBool10962 != bool_64_) {
			if (bool_64_) {
				OpenGL.glEnableClientState(32885);
			} else {
				OpenGL.glDisableClientState(32885);
			}
			aBool10962 = bool_64_;
		}
		if (aBool10971 != bool) {
			if (bool) {
				OpenGL.glEnableClientState(32886);
			} else {
				OpenGL.glDisableClientState(32886);
			}
			aBool10971 = bool;
		}
		if (anInt10990 < i) {
			for (int i_70_ = anInt10990; i_70_ < i; i_70_++) {
				OpenGL.glClientActiveTexture(33984 + i_70_);
				OpenGL.glEnableClientState(32888);
			}
			anInt10990 = i;
		} else if (anInt10990 > i) {
			for (int i_71_ = i; i_71_ < anInt10990; i_71_++) {
				OpenGL.glClientActiveTexture(33984 + i_71_);
				OpenGL.glDisableClientState(32888);
			}
			anInt10990 = i;
		}
	}

	@Override
	public final void method14707(Class333 class333, int i, int i_51_) {
		int i_52_;
		int i_53_;
		if (class333 == Class333.aClass333_3599) {
			i_52_ = 1;
			i_53_ = i_51_ * 2;
		} else if (class333 == Class333.aClass333_3595) {
			i_52_ = 3;
			i_53_ = i_51_ + 1;
		} else if (class333 == Class333.aClass333_3597) {
			i_52_ = 4;
			i_53_ = i_51_ * 3;
		} else if (class333 == Class333.aClass333_3598) {
			i_52_ = 6;
			i_53_ = i_51_ + 2;
		} else if (class333 == Class333.aClass333_3594) {
			i_52_ = 5;
			i_53_ = i_51_ + 2;
		} else {
			i_52_ = 0;
			i_53_ = i_51_;
		}
		OpenGL.glDrawArrays(i_52_, i, i_53_);
	}

	@Override
	public void method14735(Matrix4f class399) {
		float[] fs = class399.array;
		fs[1] = -fs[1];
		fs[5] = -fs[5];
		fs[9] = -fs[9];
		fs[13] = -fs[13];
	}

	@Override
	public final void method14773(Class333 class333, int i, int i_54_, int i_55_, int i_56_) {
		int i_57_;
		int i_58_;
		if (class333 == Class333.aClass333_3599) {
			i_57_ = 1;
			i_58_ = i_56_ * 2;
		} else if (class333 == Class333.aClass333_3595) {
			i_57_ = 3;
			i_58_ = i_56_ + 1;
		} else if (class333 == Class333.aClass333_3597) {
			i_57_ = 4;
			i_58_ = i_56_ * 3;
		} else if (class333 == Class333.aClass333_3598) {
			i_57_ = 6;
			i_58_ = i_56_ + 2;
		} else if (class333 == Class333.aClass333_3594) {
			i_57_ = 5;
			i_58_ = i_56_ + 2;
		} else {
			i_57_ = 0;
			i_58_ = i_56_;
		}
		Class151 class151 = aClass451_Sub2_10994.method292();
		OpenGL.glDrawElements(i_57_, i_58_, method17380(class151), aClass451_Sub2_10994.getAddress() + i_55_
				* class151.size * -172886387);
	}

	@Override
	public void method14789(Matrix4f class399, Matrix4f class399_9_, Matrix4f class399_10_) {
		OpenGL.glMatrixMode(5888);
		aClass399_9324.method6546(class399, class399_9_);
		OpenGL.glLoadMatrixf(aClass399_9324.array, 0);
		OpenGL.glMatrixMode(5889);
		OpenGL.glLoadMatrixf(class399_10_.array, 0);
	}

	@Override
	public Program loadProgram(String string) {
		byte[] data = loadOpenGlShader(string);
		if (data == null) {
			return null;
		}

		ProgramDefinition class239 = method14924(data);
		return new OpenGlProgram(this, class239);
	}

	@Override
	public boolean method14964(boolean bool) {
		return true;
	}

	@Override
	public void method2372() {
		OpenGL.glFinish();
	}

	@Override
	public final synchronized void method2375(int i) {
		try {
			method17352();
		} catch (Exception exception) {
			return;
		}

		int i_20_ = 0;
		i &= 0x7fffffff;
		while (!aClass644_10960.isEmpty()) {
			LinkableInt class480_sub24 = (LinkableInt) aClass644_10960.popHead();
			anIntArray10975[i_20_++] = (int) (class480_sub24.linkedKey * -4821875126325281949L);
			anInt9275 -= class480_sub24.value * -1189875169;
			if (i_20_ == 1000) {
				OpenGL.glDeleteBuffersARB(i_20_, anIntArray10975, 0);
				i_20_ = 0;
			}
		}

		if (i_20_ > 0) {
			OpenGL.glDeleteBuffersARB(i_20_, anIntArray10975, 0);
			i_20_ = 0;
		}

		while (!deletedTextures.isEmpty()) {
			LinkableInt class480_sub24 = (LinkableInt) deletedTextures.popHead();
			anIntArray10975[i_20_++] = (int) (class480_sub24.linkedKey * -4821875126325281949L);
			allocatedTextureSize -= class480_sub24.value * -1189875169;
			if (i_20_ == 1000) {
				OpenGL.glDeleteTextures(i_20_, anIntArray10975, 0);
				i_20_ = 0;
			}
		}
		if (i_20_ > 0) {
			OpenGL.glDeleteTextures(i_20_, anIntArray10975, 0);
			i_20_ = 0;
		}
		while (!aClass644_10964.isEmpty()) {
			LinkableInt class480_sub24 = (LinkableInt) aClass644_10964.popHead();
			anIntArray10975[i_20_++] = class480_sub24.value * -1189875169;
			if (i_20_ == 1000) {
				OpenGL.glDeleteFramebuffersEXT(i_20_, anIntArray10975, 0);
				i_20_ = 0;
			}
		}
		if (i_20_ > 0) {
			OpenGL.glDeleteFramebuffersEXT(i_20_, anIntArray10975, 0);
			i_20_ = 0;
		}
		while (!deletedRenderBuffers.isEmpty()) {
			LinkableInt class480_sub24 = (LinkableInt) deletedRenderBuffers.popHead();
			anIntArray10975[i_20_++] = (int) (class480_sub24.linkedKey * -4821875126325281949L);
			anInt9304 -= class480_sub24.value * -1189875169;
			if (i_20_ == 1000) {
				OpenGL.glDeleteRenderbuffersEXT(i_20_, anIntArray10975, 0);
				i_20_ = 0;
			}
		}
		if (i_20_ > 0) {
			OpenGL.glDeleteRenderbuffersEXT(i_20_, anIntArray10975, 0);
		}
		while (!aClass644_10961.isEmpty()) {
			LinkableInt class480_sub24 = (LinkableInt) aClass644_10961.popHead();
			OpenGL.glDeleteLists((int) (class480_sub24.linkedKey * -4821875126325281949L), class480_sub24.value
					* -1189875169);
		}
		while (!aClass644_10966.isEmpty()) {
			Linkable class480 = aClass644_10966.popHead();
			OpenGL.glDeleteProgram((int) (class480.linkedKey * -4821875126325281949L));
		}
		while (!aClass644_10985.isEmpty()) {
			Linkable class480 = aClass644_10985.popHead();
			OpenGL.glDeleteShader((int) (class480.linkedKey * -4821875126325281949L));
		}
		while (!aClass644_10961.isEmpty()) {
			LinkableInt class480_sub24 = (LinkableInt) aClass644_10961.popHead();
			OpenGL.glDeleteLists((int) (class480_sub24.linkedKey * -4821875126325281949L), class480_sub24.value
					* -1189875169);
		}
		if (offheapSize() > 100663296 && TimeUtil.time() > aLong10968 + 60000L) {
			System.gc();
			aLong10968 = TimeUtil.time();
		}
		super.method2375(i);
	}

	@Override
	public String method2388() {
		String string = "Caps: 4:";
		String string_61_ = ":";
		string = new StringBuilder().append(string).append(anInt9400).append(string_61_).toString();
		string = new StringBuilder().append(string).append(anInt10993).append(string_61_).toString();
		string = new StringBuilder().append(string).append(anInt9406).append(string_61_).toString();
		string = new StringBuilder().append(string).append(anInt9407).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool10982 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool9411 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool10986 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool10988 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool10981 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool10987 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(threeDimensional ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool10983 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool9412 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool10984 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool9408 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool9409 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool9271 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(aBool9415 ? 1 : 0).append(string_61_).toString();
		string = new StringBuilder().append(string).append(OpenGL.glGetString(35724).toLowerCase()).toString();
		return string;
	}

	@Override
	public Interface16 method2401(int i, int i_6_, Class121 class121, Class151 class151, int i_7_) {
		return new OpenGlXAttachableRenderBuffer(this, class121, class151, i, i_6_, i_7_);
	}

	@Override
	public Interface17 method2403(int i, int i_34_, int i_35_) {
		return new OpenGlXAttachableRenderBuffer(this, Class121.aClass121_1467, Class151.aClass151_1854, i, i_34_,
				i_35_);
	}

	@Override
	public int[] method2404(int i, int i_88_, int i_89_, int i_90_) {
		int[] is = new int[i_89_ * i_90_];
		int i_91_ = aClass146_1561.getHeight();
		for (int i_92_ = 0; i_92_ < i_90_; i_92_++) {
			OpenGL.glReadPixelsi(i, i_91_ - i_88_ - i_92_ - 1, i_89_, 1, 32993, anInt10993, is, i_92_ * i_89_);
		}
		return is;
	}

	@Override
	public void method2405() {
		if (aClass146_1561 != null) {
			int i = aClass146_1561.getWidth();
			int i_11_ = aClass146_1561.getHeight();
			if (i > 0 || i_11_ > 0) {
				int i_12_ = anInt9372;
				int i_13_ = anInt9337;
				int i_14_ = anInt9368;
				int i_15_ = anInt9376;
				method2494();
				int i_16_ = anInt9305;
				int i_17_ = anInt9318;
				int i_18_ = anInt9373;
				int i_19_ = anInt9394;
				method2421();
				OpenGL.glReadBuffer(1028);
				OpenGL.glDrawBuffer(1029);
				method14637();
				method14690(false);
				method14619(false);
				method14643(false);
				method14644(false);
				method14689(null);
				method14668(1);
				method14893(0);
				OpenGL.glMatrixMode(5889);
				OpenGL.glLoadIdentity();
				OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
				OpenGL.glMatrixMode(5888);
				OpenGL.glLoadIdentity();
				OpenGL.glRasterPos2i(0, 0);
				OpenGL.glDisable(3553);
				OpenGL.glCopyPixels(0, 0, i, i_11_, 6144);
				OpenGL.glEnable(3553);
				OpenGL.glFlush();
				OpenGL.glReadBuffer(1029);
				OpenGL.glDrawBuffer(1029);
				method2760(i_16_, i_18_, i_17_, i_19_);
				method2566(i_12_, i_13_, i_14_, i_15_);
			}
		}
	}

	@Override
	public boolean method2406() {
		return aBool10967;
	}

	@Override
	public boolean method2408() {
		return true;
	}

	@Override
	public void method2412(int i, int i_21_, int i_22_) {
		method2457();
		if (aClass146_Sub2_10997 == null) {
			method17359(i_21_, i_22_);
		}
		if (aClass116_10995 == null) {
			aClass116_10995 = method2630(0, 0, aClass146_1561.getWidth(), aClass146_1561.getHeight(), false);
		} else {
			aClass116_10995.method2088(0, 0, aClass146_1561.getWidth(), aClass146_1561.getHeight(), 0, 0);
		}
		method2397(aClass146_Sub2_10997);
		method2426(1, -16777216);
		aClass116_10995.method2145(anInt1569 * 81622179, anInt1568 * -2040424545, anInt1559 * -673653535, anInt1570
				* -303698357);
		OpenGL.glBindBufferARB(35051, anIntArray10998[anInt11002]);
		OpenGL.glReadPixelsub(0, 0, anInt1554 * -939590513, anInt1566 * 2016536651, 32993, 5121, null, 0);
		OpenGL.glBindBufferARB(35051, 0);
		method2398(aClass146_Sub2_10997);
		aLongArray10980[anInt11002] = OpenGL.glFenceSync(37143, 0);
		anIntArray11000[anInt11002] = i;
		if (++anInt11002 >= 3) {
			anInt11002 = 0;
		}
		method2446();
	}

	@Override
	public void method2413(long l) {
		if (l != 0L) {
			if (OpenGL.glUnmapBufferARB(35051)) {

			}
			OpenGL.glBindBufferARB(35051, 0);
		}
	}

	@Override
	public void method2416() {
		if (aBool10967) {
			aClass116_10995 = null;
			if (aClass146_Sub2_10997 != null) {
				aClass146_Sub2_10997.delete();
				aClass146_Sub2_10997 = null;
			}
			OpenGL.glDeleteBuffersARB(3, anIntArray10998, 0);
			for (int i = 0; i < 3; i++) {
				anIntArray10998[i] = 0;
				if (aLongArray10980[i] != 0L) {
					OpenGL.glDeleteSync(aLongArray10980[i]);
					aLongArray10980[i] = 0L;
				}
			}
		} else {
			aClass146_Sub2_10997 = null;
			aClass116_10996 = null;
			aClass116_10995 = null;
		}
		anInt11002 = 0;
		anInt11001 = 0;
	}

	@Override
	public void method2426(int i, int i_72_) {
		int i_73_ = 0;
		if ((i & 0x1) != 0) {
			OpenGL.glClearColor((i_72_ & 0xff0000) / 1.671168E7F, (i_72_ & 0xff00) / 65280.0F, (i_72_ & 0xff) / 255.0F,
					(i_72_ >>> 24) / 255.0F);
			i_73_ = 16384;
		}
		if ((i & 0x2) != 0) {
			method14644(true);
			i_73_ |= 0x100;
		}
		if ((i & 0x4) != 0) {
			i_73_ |= 0x400;
		}
		OpenGL.glClear(i_73_);
	}

	@Override
	public CubeMapTextureProvider method2484(CubeMapTextureProvider class138, CubeMapTextureProvider class138_29_,
			float f, CubeMapTextureProvider class138_30_) {
		return f < 0.5F ? class138 : class138_29_;
	}

	@Override
	public int method2499() {
		if (aBool10967) {
			if (aLongArray10980[anInt11001] == 0L) {
				return -1;
			}
			int i = OpenGL.glClientWaitSync(aLongArray10980[anInt11001], 0, 0);
			if (i == 37149) {
				method2574();
				return -1;
			}
			return i != 37147 ? anIntArray11000[anInt11001] : -1;
		}
		return -1;
	}

	@Override
	public void method2507(boolean bool) {

	}

	@Override
	public DirectDisplay createDirectDisplay() {
		return new OpenGlXDirectDisplay(this);
	}

	@Override
	public void method2525(int i, int i_24_, int[] is, int[] is_25_) {
		method17367(i, i_24_, is, is_25_);
	}

	@Override
	public void method2574() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray10980[i] != 0L) {
				OpenGL.glDeleteSync(aLongArray10980[i]);
				aLongArray10980[i] = 0L;
			}
		}
		anInt11002 = 0;
		anInt11001 = 0;
	}

	@Override
	public long method2685(int i, int i_23_) {
		return method17367(i, i_23_, null, null);
	}

	@Override
	public boolean method2707() {
		return false;
	}

	@Override
	public Interface17 method2774(int i, int i_8_) {
		return new OpenGlXAttachableRenderBuffer(this, Class121.aClass121_1467, Class151.aClass151_1854, i, i_8_);
	}

	@Override
	public boolean method2806() {
		if (aBool10967 && aLongArray10980[anInt11002] != 0L) {
			return false;
		}
		return true;
	}

	@Override
	public RendererType renderer() {
		int vendor = -1;
		if (aString10973.indexOf("nvidia") != -1) {
			vendor = 4318;
		} else if (aString10973.indexOf("intel") != -1) {
			vendor = 32902;
		} else if (aString10973.indexOf("ati") != -1) {
			vendor = 4098;
		}

		return new RendererType(vendor, isFixedFunction() ? "OpenGL FF" : "OpenGL", version, description, 0L);
	}

	@Override
	void method14598() {
		OpenGL.glDepthFunc(515);
		OpenGL.glEnable(2884);
		OpenGL.glCullFace(1029);
		OpenGL.glClearDepth(1.0F);
		OpenGL.glAlphaFunc(516, 0.0F);
		OpenGL.glPolygonMode(1028, 6914);

		if (aBool9411) {
			method14908(anInt9400 > 1);
			OpenGL.glDisable(32926);
		}

		for (int i = anInt9406 - 1; i >= 0; i--) {
			OpenGL.glActiveTexture(33984 + i);
			OpenGL.glTexEnvi(8960, 8704, 34160);
			OpenGL.glTexEnvi(8960, 34161, 8448);
			OpenGL.glTexEnvi(8960, 34178, 34166);
			OpenGL.glTexEnvi(8960, 34162, 8448);
			OpenGL.glTexEnvi(8960, 34186, 34166);
		}

		OpenGL.glTexEnvi(8960, 34186, 34168);
		OpenGL.glShadeModel(7425);
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadIdentity();
		OpenGL.glColorMaterial(1028, 5634);
		OpenGL.glEnable(2903);
		float[] fs = { 0.0F, 0.0F, 0.0F, 1.0F };

		for (int i = 0; i < 8; i++) {
			int i_3_ = 16384 + i;
			OpenGL.glLightfv(i_3_, 4608, fs, 0);
			OpenGL.glLightf(i_3_, 4615, 0.0F);
			OpenGL.glLightf(i_3_, 4616, 0.0F);
		}

		OpenGL.glFogf(2914, 0.95F);
		OpenGL.glFogi(2917, 9729);
		OpenGL.glHint(3156, 4353);
		gl.setSwapInterval(0);
		super.method14598();
	}

	@Override
	void method14604() {
		aFloatArray10992[0] = aFloat9331 * aFloat9340;
		aFloatArray10992[1] = aFloat9331 * aFloat9321;
		aFloatArray10992[2] = aFloat9331 * aFloat9320;
		aFloatArray10992[3] = 1.0F;
		OpenGL.glLightModelfv(2899, aFloatArray10992, 0);
	}

	@Override
	void method14621() {
		if (aBool9333) {
			OpenGL.glEnable(16384);
			OpenGL.glEnable(16385);
		} else {
			OpenGL.glDisable(16384);
			OpenGL.glDisable(16385);
		}
	}

	@Override
	void method14625() {
		if (aBool9397) {
			OpenGL.glEnable(3042);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@Override
	void method14627() {
		if (aClass146_1561 != null) {
			OpenGL.glViewport(anInt9292 + anInt9372, anInt9328 + aClass146_1561.getHeight() - anInt9337 - anInt9376,
					anInt9368, anInt9376);
		}
		OpenGL.glDepthRange(aFloat9309, aFloat9310);
	}

	@Override
	void method14629() {
		if (aBool9430) {
			OpenGL.glEnable(3089);
		} else {
			OpenGL.glDisable(3089);
		}
	}

	@Override
	void method14645() {
		if (aBool9307) {
			OpenGL.glEnable(2929);
		} else {
			OpenGL.glDisable(2929);
		}
	}

	@Override
	void method14649() {
		aFloatArray10992[0] = aFloat9344 * aFloat9340;
		aFloatArray10992[1] = aFloat9344 * aFloat9321;
		aFloatArray10992[2] = aFloat9344 * aFloat9320;
		aFloatArray10992[3] = 1.0F;
		OpenGL.glLightfv(16384, 4609, aFloatArray10992, 0);

		aFloatArray10992[0] = -aFloat9345 * aFloat9340;
		aFloatArray10992[1] = -aFloat9345 * aFloat9321;
		aFloatArray10992[2] = -aFloat9345 * aFloat9320;
		aFloatArray10992[3] = 1.0F;
		OpenGL.glLightfv(16385, 4609, aFloatArray10992, 0);
	}

	@Override
	void method14650() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass399_9281.array, 0);
		OpenGL.glLightfv(16384, 4611, aFloatArray9298, 0);
		OpenGL.glLightfv(16385, 4611, aFloatArray9329, 0);
	}

	@Override
	void method14651() {

	}

	@Override
	void method14654() {
		OpenGL.glMatrixMode(5888);
		OpenGL.glLoadMatrixf(aClass399_9281.array, 0);
		int i;
		for (i = 0; i < anInt9348; i++) {
			PointLight class480_sub23 = aClass480_Sub23Array9346[i];
			int i_31_ = class480_sub23.getColour();
			int i_32_ = 16386 + i;
			float f = class480_sub23.getIntensity() / 255.0F;

			aFloatArray10992[0] = class480_sub23.getX();
			aFloatArray10992[1] = class480_sub23.getY();
			aFloatArray10992[2] = class480_sub23.getZ();
			aFloatArray10992[3] = 1.0F;

			OpenGL.glLightfv(i_32_, 4611, aFloatArray10992, 0);
			aFloatArray10992[0] = (i_31_ >> 16 & 0xff) * f;
			aFloatArray10992[1] = (i_31_ >> 8 & 0xff) * f;
			aFloatArray10992[2] = (i_31_ & 0xff) * f;
			aFloatArray10992[3] = 1.0F;

			OpenGL.glLightfv(i_32_, 4609, aFloatArray10992, 0);
			OpenGL.glLightf(i_32_, 4617, 1.0F / (class480_sub23.getRange() * class480_sub23.getRange()));
			OpenGL.glEnable(i_32_);
		}

		for (; i < anInt9347; i++) {
			OpenGL.glDisable(16386 + i);
		}
	}

	@Override
	boolean method14655(Class121 class121, Class151 class151) {
		return true;
	}

	@Override
	boolean method14656(Class121 class121, Class151 class151) {
		return threeDimensional;
	}

	@Override
	void method14660(int i) {
		if (!aBool10991) {
			OpenGL.glPolygonMode(1028, (i & 0x2) != 0 ? 6913 : 6914);
		}
	}

	@Override
	void method14661() {
		OpenGL.glDepthMask(aBool9427 && aBool9330);
	}

	@Override
	NativeCubeMapTexture createCubeMapTexture(int length, boolean mipmapped, int[][] data) {
		return new OpenGlXCubeMapTexture(this, length, mipmapped, data);
	}

	@Override
	Interface40 create2DTexture(Class121 class121, Class151 class151, int width, int data) {
		return new OpenGlX2DTexture(this, class121, class151, width, data);
	}

	@Override
	final void method14671(int i, Class344 class344, boolean bool, boolean bool_43_) {
		OpenGL.glTexEnvi(8960, 34176 + i, method17369(class344));
		if (bool) {
			OpenGL.glTexEnvi(8960, 34192 + i, bool_43_ ? 771 : 770);
		} else {
			OpenGL.glTexEnvi(8960, 34192 + i, bool_43_ ? 769 : 768);
		}
	}

	@Override
	final NativeElementArrayBuffer createElementArrayBuffer(boolean stream) {
		return new OpenGlXElementArrayBuffer(this, Class151.aClass151_1849, stream);
	}

	@Override
	final void method14673(int i, Class344 class344, boolean bool) {
		OpenGL.glTexEnvi(8960, 34184 + i, method17369(class344));
		OpenGL.glTexEnvi(8960, 34200 + i, bool ? 771 : 770);
	}

	@Override
	Native3DTexture create3DTexture(Class121 class121, int width, int height, int depth, boolean mipmapped, byte[] data) {
		return new OpenGlX3DTexture(this, class121, width, height, depth, mipmapped, data);
	}

	@Override
	void method14678() {
		OpenGL.glTexEnvi(8960, 34161, method17350(aClass347Array9357[anInt9353]));
	}

	@Override
	final void method14679() {
		aFloatArray10992[0] = (anInt9384 & 0xff0000) / 1.671168E7F;
		aFloatArray10992[1] = (anInt9384 & 0xff00) / 65280.0F;
		aFloatArray10992[2] = (anInt9384 & 0xff) / 255.0F;
		aFloatArray10992[3] = (anInt9384 >>> 24) / 255.0F;
		OpenGL.glTexEnvfv(8960, 8705, aFloatArray10992, 0);
	}

	@Override
	void method14680() {
		OpenGL.glMatrixMode(5890);
		if (aClass336Array9356[anInt9353] != Class336.aClass336_3610) {
			OpenGL.glLoadMatrixf(aClass399Array9396[anInt9353].copy(aFloatArray10979), 0);
		} else {
			OpenGL.glLoadIdentity();
		}
		OpenGL.glMatrixMode(5888);
	}

	@Override
	void method14681() {
		OpenGL.glActiveTexture(33984 + anInt9353);
	}

	@Override
	void method14682() {
		OpenGL.glTexEnvi(8960, 34162, method17350(aClass347Array9358[anInt9353]));
	}

	@Override
	void method14686(int i) {
		OpenGL.glColorMask((i & 0x1) != 0, (i & 0x2) != 0, (i & 0x4) != 0, (i & 0x8) != 0);
	}

	@Override
	void method14688() {
		if (aBool9415) {
			int i = 0;
			int i_44_ = 0;
			if (anInt9395 == 0) {
				i = 0;
				i_44_ = 0;
			} else if (anInt9395 == 1) {
				i = 1;
				i_44_ = 0;
			} else if (anInt9395 == 2) {
				i = 1;
				i_44_ = 1;
			} else if (anInt9395 == 3) {
				i = 0;
				i_44_ = 1;
			}
			if (aClass308_9325 == Class308.aClass308_3322) {
				OpenGL.glBlendFuncSeparate(770, 771, i, i_44_);
			} else if (aClass308_9325 == Class308.aClass308_3319) {
				OpenGL.glBlendFuncSeparate(1, 1, i, i_44_);
			} else if (aClass308_9325 == Class308.aClass308_3321) {
				OpenGL.glBlendFuncSeparate(774, 1, i, i_44_);
			} else if (aClass308_9325 == Class308.aClass308_3320) {
				OpenGL.glBlendFuncSeparate(1, 0, i, i_44_);
			}
		} else if (aClass308_9325 == Class308.aClass308_3322) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(770, 771);
		} else if (aClass308_9325 == Class308.aClass308_3319) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(1, 1);
		} else if (aClass308_9325 == Class308.aClass308_3321) {
			OpenGL.glEnable(3042);
			OpenGL.glBlendFunc(774, 1);
		} else {
			OpenGL.glDisable(3042);
		}
	}

	@Override
	void method14693() {
		aFloat9393 = aFloat9314 - anInt9391;
		aFloat9392 = aFloat9393 - anInt9390;
		if (aFloat9392 < aFloat9313) {
			aFloat9392 = aFloat9313;
		}
		if (fixedFunction) {
			OpenGL.glFogf(2915, aFloat9392);
			OpenGL.glFogf(2916, aFloat9393);
			aFloatArray10992[0] = (anInt9293 & 0xff0000) / 1.671168E7F;
			aFloatArray10992[1] = (anInt9293 & 0xff00) / 65280.0F;
			aFloatArray10992[2] = (anInt9293 & 0xff) / 255.0F;
			OpenGL.glFogfv(2918, aFloatArray10992, 0);
		}
	}

	@Override
	final NativeArrayBuffer createArrayBuffer(boolean stream) {
		return new OpenGlXArrayBuffer(this, stream);
	}

	@Override
	Class323 method14696(Class320... class320s) {
		return new Class323_Sub2(class320s);
	}

	@Override
	Native2DTexture method14699(Class121 class121, int width, int height, boolean mipmapped, float[] data, int i_40_,
			int i_41_) {
		return new OpenGlX2DTexture(this, class121, width, height, mipmapped, data, i_40_, i_41_);
	}

	@Override
	Native2DTexture method14717(int width, int height, boolean mipmapped, int[] data, int i_1_, int i_2_) {
		return new OpenGlX2DTexture(this, width, height, mipmapped, data, i_1_, i_2_);
	}

	@Override
	void method14720() {
		if (aBool9398) {
			OpenGL.glEnable(3008);
		} else {
			OpenGL.glDisable(3008);
		}

		OpenGL.glAlphaFunc(516, (aByte9399 & 0xff) / 255.0F);
		if (anInt9400 > 1) {
			if (aByte9399 != 0) {
				OpenGL.glEnable(32926);
			} else {
				OpenGL.glDisable(32926);
			}
		}
	}

	@Override
	void method14733() {
		if (aBool9388 && aBool9387 && anInt9390 >= 0) {
			OpenGL.glEnable(2912);
		} else {
			OpenGL.glDisable(2912);
		}
	}

	@Override
	Native2DTexture method14740(Class121 class121, Class151 class151, int i, int i_33_) {
		return create2DTexture(class121, class151, i, i_33_);
	}

	@Override
	void method14748(NativeElementArrayBuffer buffer) {
		aClass451_Sub2_10994 = (OpenGlXElementArrayBuffer) buffer;
		aClass451_Sub2_10994.bind();
	}

	@Override
	Native2DTexture create2DTexture(Class121 class121, int width, int height, boolean mipmapped, byte[] data,
			int i_37_, int i_38_) {
		return new OpenGlX2DTexture(this, class121, width, height, mipmapped, data, i_37_, i_38_);
	}

	@Override
	void method14908(boolean bool) {
		if (bool) {
			OpenGL.glEnable(32925);
		} else {
			OpenGL.glDisable(32925);
		}
	}

	@Override
	void method14953() {
		if (aBool9332 && !aBool9380) {
			OpenGL.glEnable(2896);
		} else {
			OpenGL.glDisable(2896);
		}
	}

	@Override
	void method14968() {
		if (aClass146_1561 != null) {
			int i = anInt9292 + anInt9305;
			int i_26_ = anInt9328 + aClass146_1561.getHeight() - anInt9394;
			int i_27_ = anInt9318 - anInt9305;
			int i_28_ = anInt9394 - anInt9373;

			if (i_27_ < 0) {
				i_27_ = 0;
			}

			if (i_28_ < 0) {
				i_28_ = 0;
			}

			OpenGL.glScissor(i, i_26_, i_27_, i_28_);
		}
	}

	@Override
	final void method14977(NativeElementArrayBuffer buffer, Class333 class333, int i, int i_45_, int i_46_, int i_47_) {
		int i_48_;
		int i_49_;

		if (class333 == Class333.aClass333_3599) {
			i_48_ = 1;
			i_49_ = i_47_ * 2;
		} else if (class333 == Class333.aClass333_3595) {
			i_48_ = 3;
			i_49_ = i_47_ + 1;
		} else if (class333 == Class333.aClass333_3597) {
			i_48_ = 4;
			i_49_ = i_47_ * 3;
		} else if (class333 == Class333.aClass333_3598) {
			i_48_ = 6;
			i_49_ = i_47_ + 2;
		} else if (class333 == Class333.aClass333_3594) {
			i_48_ = 5;
			i_49_ = i_47_ + 2;
		} else {
			i_48_ = 0;
			i_49_ = i_47_;
		}

		Class151 class151 = buffer.method292();
		OpenGlXElementArrayBuffer elements = (OpenGlXElementArrayBuffer) buffer;
		elements.bind();
		OpenGL.glDrawElements(i_48_, i_49_, method17380(class151), elements.getAddress() + i_46_ * class151.size
				* -172886387);
	}

	final synchronized void method17351(int i, int i_50_) {
		LinkableInt class480_sub24 = new LinkableInt(i_50_);
		class480_sub24.linkedKey = i * -7096345066895942069L;
		aClass644_10960.pushBack(class480_sub24);
	}

	void method17352() {
		int i = 0;
		while (!gl.method1386()) {
			if (i++ > 5) {
				throw new RuntimeException("");
			}
			Client.sleep(1000L);
		}
	}

	final synchronized void deleteTexture(int name, int size) {
		LinkableInt linkable = new LinkableInt(size);
		linkable.linkedKey = name * -7096345066895942069L;
		deletedTextures.pushBack(linkable);
	}

	final synchronized void method17354(int i) {
		LinkableInt class480_sub24 = new LinkableInt(i);
		aClass644_10964.pushBack(class480_sub24);
	}

	final synchronized void deleteRenderBuffer(int buffer, int size) {
		LinkableInt linkable = new LinkableInt(size);
		linkable.linkedKey = buffer * -7096345066895942069L;
		deletedRenderBuffers.pushBack(linkable);
	}

	final synchronized void method17356(int i) {
		Linkable class480 = new Linkable();
		class480.linkedKey = i * -7096345066895942069L;
		aClass644_10966.pushBack(class480);
	}

	void method17359(int i, int i_62_) {
		method2416();
		method2757(i, i_62_);

		if (aBool10967) {
			aClass116_10996 = createSprite(i, i_62_, false, true);
			aClass146_Sub2_10997 = createDirectDisplay();
			aClass146_Sub2_10997.method14256(0, aClass116_10996.method2075());
			OpenGL.glGenBuffersARB(3, anIntArray10998, 0);

			for (int i_63_ = 0; i_63_ < 3; i_63_++) {
				OpenGL.glBindBufferARB(35051, anIntArray10998[i_63_]);
				OpenGL.glBufferDataARBa(35051, i * i_62_ * 4, 0L, 35041);
				OpenGL.glBindBufferARB(35051, 0);
			}
		} else {
			aClass116_10996 = createSprite(i, i_62_, false, true);
			aClass146_Sub2_10997 = createDirectDisplay();
			aClass146_Sub2_10997.method14256(0, aClass116_10996.method2075());
		}
	}

	byte[] loadOpenGlShader(String string) {
		return loadShader("gl", string);
	}

	final synchronized void method17361(long l) {
		Linkable class480 = new Linkable();
		class480.linkedKey = l * -7096345066895942069L;
		aClass644_10985.pushBack(class480);
	}

	long method17367(int i, int i_85_, int[] is, int[] is_86_) {
		if (aBool10967) {
			if (aLongArray10980[anInt11001] != 0L) {
				OpenGL.glDeleteSync(aLongArray10980[anInt11001]);
				aLongArray10980[anInt11001] = 0L;
			}
			OpenGL.glBindBufferARB(35051, anIntArray10998[anInt11001]);
			long l = OpenGL.glMapBufferARB(35051, 35000);
			if (is != null) {
				for (int i_87_ = 0; i_87_ < i * i_85_; i_87_++) {
					is[i_87_] = unsafe.getInt(l + i_87_ * 4);
				}
				if (OpenGL.glUnmapBufferARB(35051)) {

				}
				OpenGL.glBindBufferARB(35051, 0);
				l = 0L;
			}
			if (++anInt11001 >= 3) {
				anInt11001 = 0;
			}
			return l;
		}
		if (aClass116_10996 == null) {
			method17359(i, i_85_);
		}
		if (aClass116_10995 == null) {
			aClass116_10995 = method2630(0, 0, aClass146_1561.getWidth(), aClass146_1561.getHeight(), false);
		} else {
			aClass116_10995.method2088(0, 0, aClass146_1561.getWidth(), aClass146_1561.getHeight(), 0, 0);
		}
		method2397(aClass146_Sub2_10997);
		method2426(1, -16777216);
		aClass116_10995.method2145(anInt1569 * 81622179, anInt1568 * -2040424545, anInt1559 * -673653535, anInt1570
				* -303698357);
		aClass116_10996.method2076(0, 0, i, i_85_, is, is_86_, 0, i);
		method2398(aClass146_Sub2_10997);
		return 0L;
	}

	@Override
	void method2374() {
		super.method2374();
		if (gl != null) {
			gl.method1387();
			gl.release();
			gl = null;
		}
	}

	@Override
	DelegatingDisplay createDelegatingDisplay(Canvas canvas, int width, int height) {
		return new OpenGlXDelegatingDisplay(this, canvas);
	}

	@Override
	void method2647(int i, int i_4_) {
		aClass146_Sub1_1552.draw();
		if (anInterface19_1546 != null) {
			anInterface19_1546.method106();
		}
	}

}