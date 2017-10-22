package com.jagex;

import jaggl.OpenGL;

public class Class480_Sub4_Sub2 extends Class480_Sub4 {
	static float aFloat11219;
	static float aFloat11220;
	static float aFloat11221;
	static float aFloat11222;
	static final String aString11223 = "#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n";
	static float aFloat11224 = 1.0F;
	static {
		aFloat11220 = 0.0F;
		aFloat11219 = 1.0F;
		aFloat11221 = 0.0F;
		aFloat11222 = 1.0F;
	}

	OpenGlShaderList aClass96_11225;

	Class480_Sub4_Sub2(OpenGlToolkit class134_sub2) {
		super(class134_sub2);
	}

	@Override
	boolean method15487() {
		return aClass96_11225 != null;
	}

	@Override
	void method15491(int i, int i_0_) {

	}

	@Override
	void method15492(int i, OpenGl2DTexture class102_sub1, OpenGl2DTexture class102_sub1_1_, int i_2_, int i_3_) {
		int i_4_ = aClass96_11225.program;
		OpenGL.glUseProgram(i_4_);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_4_, "sceneTex"), 0);
		OpenGL.glUniform1f(OpenGL.glGetUniformLocation(i_4_, "paramsGamma"), aFloat11224);
		OpenGL.glUniform4f(OpenGL.glGetUniformLocation(i_4_, "paramsRanges"), aFloat11220, aFloat11219, aFloat11221,
				aFloat11222);
		toolkit.method14326(0);
		toolkit.setActiveTexture(class102_sub1);
	}

	@Override
	void method15493() {
		OpenGL.glUseProgram(0);
		toolkit.method14326(0);
		toolkit.setActiveTexture(null);
	}

	@Override
	int method15495() {
		return 1;
	}

	@Override
	void destroy() {
		aClass96_11225 = null;
	}

	@Override
	boolean method15509() {
		if (toolkit.aBool9132) {
			aClass96_11225 = OpenGlShaderList
					.create(toolkit,
							new OpenGlShaderPointer[] { OpenGlShaderPointer
									.create(toolkit,
											35632,
											"#extension GL_ARB_texture_rectangle : enable\nuniform float paramsGamma;\nuniform vec4 paramsRanges;\nuniform sampler2DRect sceneTex;\nvoid main() {\n    vec3 col = texture2DRect(sceneTex, gl_TexCoord[0].xy).xyz;\n    col -= vec3(paramsRanges.x,paramsRanges.x,paramsRanges.x);\n    vec3 colourClampedIn = col / (paramsRanges.y - paramsRanges.x);\n    vec3 colourGammaCorrected = pow(colourClampedIn, vec3(paramsGamma,paramsGamma,paramsGamma));\n    colourGammaCorrected = clamp(colourGammaCorrected,0.0,1.0);\n    vec3 outCol = mix(vec3(paramsRanges.z,paramsRanges.z,paramsRanges.z), vec3(paramsRanges.w,paramsRanges.w,paramsRanges.w), colourGammaCorrected);\n    gl_FragColor = vec4(clamp(outCol,0.0,1.0), 1.0);\n}\n") });
			return aClass96_11225 != null;
		}
		return false;
	}

	@Override
	Class151 method15520() {
		return Class151.aClass151_2;
	}

	@Override
	boolean method15528() {
		return aFloat11224 == 1.0F && aFloat11220 == 0.0F && aFloat11219 == 1.0F && aFloat11221 == 0.0F
				&& aFloat11222 == 1.0F;
	}

	boolean method17566() {
		return toolkit.aBool9132;
	}
}
