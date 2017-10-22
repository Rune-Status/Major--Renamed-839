package com.jagex;

import jaggl.OpenGL;

import java.util.HashMap;
import java.util.Map;

public class Class249_Sub2 extends Class249 {
	static boolean $assertionsDisabled = !Class249_Sub2.class.desiredAssertionStatus();
	static float[] aFloatArray9583 = new float[16];
	static final int anInt9592 = 13;

	static final int GL_COMPILE_STATUS = 0x8B81;
	static final int GL_FRAGMENT_SHADER_ARB = 0x8B30;
	static final int GL_LINK_STATUS = 0x8B82;
	static final int GL_VERTEX_SHADER_ARB = 0x8B31;

	static int[] parameters = new int[2];
	boolean aBool9589;
	Map<Integer, Float> aMap9587 = new HashMap<Integer, Float>();
	Map<Integer, Float> aMap9594 = new HashMap<Integer, Float>();
	Map<Integer, Float> aMap9595 = new HashMap<Integer, Float>();
	Map<Integer, Float> aMap9596 = new HashMap<Integer, Float>();
	Map<Integer, Integer> aMap9597 = new HashMap<Integer, Integer>();
	int pixelShader;
	String pixelShaderSource;
	OpenGlProgram program;
	int programId = 0;
	OpenGlXToolkit toolkit;
	int vertexShader;
	String vertexShaderSource;

	Class249_Sub2(OpenGlXToolkit toolkit, Class246 class246) {
		name = class246.name;

		StringBuilder source = new StringBuilder();
		if (class246.vertexShaderName != null) {
			vertexShaderName = class246.vertexShaderName;

			if (class246.vertexDirectives != null) {
				for (DefineDirective directive : class246.vertexDirectives) {
					source.append("#define " + directive.identifier + " " + directive.value + '\n');
				}
			}

			source.append(new String(toolkit.loadOpenGlShader(vertexShaderName)));
			vertexShaderSource = source.toString();
		}

		if (class246.pixelShaderName != null) {
			pixelShaderName = class246.pixelShaderName;
			source.setLength(0);

			if (class246.pixelDirectives != null) {
				for (DefineDirective directive : class246.pixelDirectives) {
					source.append("#define " + directive.identifier + " " + directive.value + '\n');
				}
			}

			source.append(new String(toolkit.loadOpenGlShader(pixelShaderName)));
			pixelShaderSource = source.toString();
		}
	}

	Class249_Sub2(OpenGlXToolkit toolkit, OpenGlProgram program, Class246 class246) {
		this(toolkit, class246);
		this.program = program;
		this.toolkit = toolkit;
	}

	@Override
	public void deleteImmediately() {
		if (programId != 0) {
			toolkit.method17356(programId);
			if (vertexShader != 0) {
				toolkit.method17361(vertexShader);
			}

			if (pixelShader != 0) {
				toolkit.method17361(pixelShader);
			}

			programId = 0;
			vertexShader = 0;
			pixelShader = 0;
		}
	}

	@Override
	public void finalize() {
		deleteImmediately();
	}

	@Override
	public boolean method4648() {
		if (aBool9589) {
			return true;
		}

		toolkit.aClass249_Sub2_10977 = null;
		vertexShader = compileShader(GL_VERTEX_SHADER_ARB, vertexShaderSource);
		pixelShader = compileShader(GL_FRAGMENT_SHADER_ARB, pixelShaderSource);

		if (vertexShader == 0 || pixelShader == 0) {
			if (vertexShader != 0) {
				OpenGL.glDeleteShader(vertexShader);
			}

			if (pixelShader != 0) {
				OpenGL.glDeleteShader(pixelShader);
			}

			return false;
		}

		programId = OpenGL.glCreateProgram();
		if (vertexShader != 0) {
			OpenGL.glAttachShader(programId, vertexShader);
		}

		if (pixelShader != 0) {
			OpenGL.glAttachShader(programId, pixelShader);
		}

		OpenGL.glLinkProgram(programId);
		OpenGL.glGetProgramiv(programId, GL_LINK_STATUS, parameters, 0);

		if (parameters[0] == 0) {
			if (vertexShader != 0) {
				OpenGL.glDetachShader(programId, vertexShader);
				OpenGL.glDeleteShader(vertexShader);
			}

			if (pixelShader != 0) {
				OpenGL.glDetachShader(programId, pixelShader);
				OpenGL.glDeleteShader(pixelShader);
			}

			OpenGL.glDeleteProgram(programId);
			return false;
		}

		OpenGL.glUseProgram(programId);
		int i = -1;

		for (int i_0_ = 0; i_0_ < program.method4506(); i_0_++) {
			if (program.method4449(i_0_) == this) {
				i = i_0_;
				break;
			}
		}

		if (i == -1) {
			return false;
		}

		for (int i_1_ = 0; i_1_ < program.method4462(); i_1_++) {
			Class480_Sub13_Sub1 class480_sub13_sub1 = program.method4478(i_1_);
			if (class480_sub13_sub1 != null) {
				class480_sub13_sub1.method17548(i);
			}
		}

		for (int i_2_ = 0; i_2_ < program.method4474(); i_2_++) {
			Class480_Sub13_Sub1 class480_sub13_sub1 = program.method4475(i_2_);
			if (class480_sub13_sub1 != null) {
				class480_sub13_sub1.method17548(i);
			}
		}

		vertexShaderSource = null;
		pixelShaderSource = null;
		aBool9589 = true;
		return true;
	}

	int compileShader(int type, String source) {
		if (source == null) {
			return 0;
		}

		int reference = OpenGL.glCreateShader(type);
		OpenGL.glShaderSource(reference, source);
		OpenGL.glCompileShader(reference);
		OpenGL.glGetShaderiv(reference, GL_COMPILE_STATUS, parameters, 0);

		if (parameters[0] == 0) {
			OpenGL.glDeleteShader(reference);
			reference = 0;
		}

		return reference;
	}

	@Override
	void method4649(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_9_) {
		int location = ((Class480_Sub13_Sub1_Sub2) class480_sub13_sub1).method18234();
		if (location != -1) {
			if (aMap9587.get(location) == null || aMap9594.get(location) == null || aMap9587.get(location) != f
					|| aMap9594.get(location) != f_9_) {
				aMap9587.put(location, f);
				aMap9594.put(location, f_9_);
				if (class480_sub13_sub1.method17541() != Class253.aClass253_2720) {
					throw new IllegalArgumentException_Sub1(class480_sub13_sub1, "");
				}

				OpenGL.glUniform2f(location, f, f_9_);
			}
		}
	}

	@Override
	void method4650(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_3_, float f_4_) {
		int location = ((Class480_Sub13_Sub1_Sub2) class480_sub13_sub1).method18234();
		if (location != -1) {
			if (aMap9587.get(location) == null || aMap9594.get(location) == null || aMap9595.get(location) == null
					|| aMap9587.get(location) != f || aMap9594.get(location) != f_3_ || aMap9595.get(location) != f_4_) {
				aMap9587.put(location, f);
				aMap9594.put(location, f_3_);
				aMap9595.put(location, f_4_);

				if (class480_sub13_sub1.method17541() != Class253.aClass253_2721) {
					throw new IllegalArgumentException_Sub1(class480_sub13_sub1, "");
				}

				OpenGL.glUniform3f(location, f, f_3_, f_4_);
			}
		}
	}

	@Override
	void method4651(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_5_, float f_6_, float f_7_) {
		int location = ((Class480_Sub13_Sub1_Sub2) class480_sub13_sub1).method18234();
		if (location != -1) {
			if (aMap9587.get(location) == null || aMap9594.get(location) == null || aMap9595.get(location) == null
					|| aMap9596.get(location) == null || aMap9587.get(location) != f || aMap9594.get(location) != f_5_
					|| aMap9595.get(location) != f_6_ || aMap9596.get(location) != f_7_) {
				aMap9587.put(location, f);
				aMap9594.put(location, f_5_);
				aMap9595.put(location, f_6_);
				aMap9596.put(location, f_7_);

				if (class480_sub13_sub1.method17541() != Class253.aClass253_2695) {
					throw new IllegalArgumentException_Sub1(class480_sub13_sub1, "");
				}

				OpenGL.glUniform4f(location, f, f_5_, f_6_, f_7_);
			}
		}
	}

	@Override
	void method4653(Class480_Sub13_Sub1 class480_sub13_sub1, Matrix4f matrix) {
		if (!$assertionsDisabled && class480_sub13_sub1.method17541() != Class253.aClass253_2736) {
			throw new AssertionError();
		}

		int location = ((Class480_Sub13_Sub1_Sub2) class480_sub13_sub1).method18234();
		if (location != -1) {
			OpenGL.glUniform2fv(location, 4, matrix.method6652(aFloatArray9583), 0);
		}
	}

	@Override
	void method4655(Class480_Sub13_Sub1 class480_sub13_sub1, int i, NativeTexture texture) {
		int location = ((Class480_Sub13_Sub1_Sub2) class480_sub13_sub1).method18234();
		if (location != -1) {
			if (texture == null) {
				texture = toolkit.anInterface29_9361;
			}

			if (i < toolkit.anInt9406) {
				toolkit.method14666(i);
				toolkit.method14689(texture);
			} else {
				OpenGL.glActiveTexture(33984 + i);
				OpenGL.glBindTexture(((OpenGlXTexture) texture).target, ((OpenGlXTexture) texture).texture);
			}

			if (aMap9597.get(location) == null || aMap9597.get(location) != i) {
				aMap9597.put(location, i);
				OpenGL.glUniform1i(location, i);
			}
		}
	}

	@Override
	void method4659(int location, Matrix4f class399) {
		OpenGL.glUniform3fv(location, 3, class399.method6598(aFloatArray9583), 0);
	}

	@Override
	void method4660(int location, Matrix4f class399) {
		OpenGL.glUniform2fv(location, 4, class399.method6652(aFloatArray9583), 0);
	}

	@Override
	void method4661(int location, float[] fs, int i_15_) {
		OpenGL.glUniform4fv(location, i_15_, fs, 0);
	}

	@Override
	void method4663(Class480_Sub13_Sub1 class480_sub13_sub1, float[] fs, int i) {
		int location = ((Class480_Sub13_Sub1_Sub2) class480_sub13_sub1).method18234();
		if (location != -1) {
			OpenGL.glUniform4fv(location, i, fs, 0);
		}
	}

	@Override
	void method4665(Class480_Sub13_Sub1 class480_sub13_sub1, Matrix4f texture) {
		if (!$assertionsDisabled && class480_sub13_sub1.method17541() != Class253.aClass253_2738) {
			throw new AssertionError();
		}

		int location = ((Class480_Sub13_Sub1_Sub2) class480_sub13_sub1).method18234();
		if (location != -1) {
			OpenGL.glUniform4fv(location, 4, texture.copy(aFloatArray9583), 0);
		}
	}

	@Override
	void method4668(int location, float f, float f_12_, float f_13_, float f_14_) {
		OpenGL.glUniform4f(location, f, f_12_, f_13_, f_14_);
	}

	@Override
	void method4674(int location, int i_16_, NativeTexture texture) {
		toolkit.method14666(i_16_);
		toolkit.method14689(texture);
		OpenGL.glUniform1i(location, i_16_);
	}

	@Override
	void method4681(int location, float f, float f_10_, float f_11_) {
		OpenGL.glUniform3f(location, f, f_10_, f_11_);
	}

	@Override
	void method4692(int location, Matrix4f matrix) {
		OpenGL.glUniform4fv(location, 4, matrix.copy(aFloatArray9583), 0);
	}

	@Override
	void method4697(Class480_Sub13_Sub1 class480_sub13_sub1, float f) {
		int location = ((Class480_Sub13_Sub1_Sub2) class480_sub13_sub1).method18234();
		if (location != -1) {
			if (aMap9587.get(location) == null || aMap9587.get(location) != f) {
				aMap9587.put(location, f);

				if (class480_sub13_sub1.method17541() != Class253.aClass253_2729
						&& class480_sub13_sub1.method17541() != Class253.aClass253_2707) {
					throw new IllegalArgumentException_Sub1(class480_sub13_sub1, "");
				}

				OpenGL.glUniform1f(location, f);
			}
		}
	}

}