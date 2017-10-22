package com.jagex;

import jaggl.OpenGL;

public class Class480_Sub4_Sub1 extends Class480_Sub4 {
	static float aFloat11173 = 0.25F;
	static float aFloat11174 = 1.0F;
	static float params = 1.0F;

	static final int anInt11192 = 256;

	/**
	 * <code>
	 * #extension GL_ARB_texture_rectangle : enable
	 * uniform vec3 params;
	 * uniform sampler2DRect sceneTex;
	 *
	 * const vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);
	 *
	 * void main() {
	 *     vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);
	 *     gl_FragColor = col * step(params.x, dot(lumCoef, col.rgb));
	 * }
	 * </code>
	 */
	static final String STEP_LUMINANCE_RECTANGULAR = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform sampler2DRect sceneTex;"
			+ "\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);\nvoid main() {\n    vec4 col = texture2DRect(sceneTex, gl_TexCoord[0].xy);\n"
			+ "    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	/**
	 * <code>
	 * uniform vec3 params;
	 * uniform sampler2D sceneTex;
	 * const vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);
	 *
	 * void main() {
	 *     vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);
	 *     gl_FragColor = col * step(params.x, dot(lumCoef, col.rgb));
	 * }
	 * </code>
	 */
	static final String STEP_LUMINANCE = "uniform vec3 params;\nuniform sampler2D sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);"
			+ "\nvoid main() {\n    vec4 col = texture2D(sceneTex, gl_TexCoord[0].xy);\n    gl_FragColor = col*step(params.x, dot(lumCoef, col.rgb));\n}\n";

	/**
	 * <code>
	 * uniform vec3 step;
	 * uniform sampler2D baseTex;
	 *
	 * void main() {
	 * 	    vec4 fragCol = texture2D(baseTex, gl_TexCoord[0].xy) * 0.091396265;
	 *
	 * 	    fragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0 * step.xy)) * 0.088584304;
	 * 	    fragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0 * step.xy)) * 0.088584304;
	 *
	 * 	    fragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-2.0 * step.xy)) * 0.08065692;
	 * 	    fragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 2.0 * step.xy)) * 0.08065692;
	 *
	 * 	    fragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0 * step.xy)) * 0.068989515;
	 * 	    fragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 3.0 * step.xy)) * 0.068989515;
	 *
	 * 	    fragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-4.0 * step.xy)) * 0.055434637;
	 *     	fragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0 * step.xy)) * 0.055434637;
	 *
	 *     	fragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0 * step.xy)) * 0.04184426;
	 * 	    fragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 5.0 * step.xy)) * 0.04184426;
	 *
	 *     	fragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0 * step.xy)) * 0.029672023;
	 * 	    fragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 6.0 * step.xy)) * 0.029672023;
	 *
	 * 	    fragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-7.0 * step.xy)) * 0.019765828;
	 * 	    fragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0 * step.xy)) * 0.019765828;
	 *
	 *     	fragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0 * step.xy)) * 0.012369139;
	 *     	fragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 8.0 * step.xy)) * 0.012369139;
	 *
	 *     	gl_FragColor = fragCol;
	 * }
	 * </code>
	 */
	static final String aString11178 = "uniform vec3 step;\nuniform sampler2D baseTex;\nvoid main() {\n\tvec4 fragCol = "
			+ "texture2D(baseTex, gl_TexCoord[0].xy)*0.091396265;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-1.0*step.xy))"
			+ "*0.088584304;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 1.0*step.xy))*0.088584304;\n\tfragCol += "
			+ "texture2D(baseTex, gl_TexCoord[0].xy+(-2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+"
			+ "( 2.0*step.xy))*0.08065692;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-3.0*step.xy))*0.068989515;\n\tfragCol +="
			+ " texture2D(baseTex, gl_TexCoord[0].xy+( 3.0*step.xy))*0.068989515;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+"
			+ "(-4.0*step.xy))*0.055434637;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 4.0*step.xy))*0.055434637;\n\tfragCol"
			+ " += texture2D(baseTex, gl_TexCoord[0].xy+(-5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+"
			+ "( 5.0*step.xy))*0.04184426;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+(-6.0*step.xy))*0.029672023;\n\tfragCol += "
			+ "texture2D(baseTex, gl_TexCoord[0].xy+( 6.0*step.xy))*0.029672023;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+"
			+ "(-7.0*step.xy))*0.019765828;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+( 7.0*step.xy))*0.019765828;\n\tfragCol"
			+ " += texture2D(baseTex, gl_TexCoord[0].xy+(-8.0*step.xy))*0.012369139;\n\tfragCol += texture2D(baseTex, gl_TexCoord[0].xy+"
			+ "( 8.0*step.xy))*0.012369139;\n\tgl_FragColor = fragCol;\n}\n";

	/**
	 * <code>
	 * #extension GL_ARB_texture_rectangle : enable
	 * uniform vec3 params;
	 * uniform vec3 dimScale;
	 * uniform sampler2D bloomTex;
	 * uniform sampler2DRect sceneTex;
	 *
	 * const vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);
	 *
	 * void main() {
	 * 	   vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);
	 * 	   vec4 sceneCol = texture2DRect(sceneTex, gl_TexCoord[0].xy);
	 *
	 *     float preLum = 0.99 * dot(lumCoef, sceneCol.rgb) + 0.01;
	 *     float postLum = preLum * (1.0 + (preLum / params.y)) / (preLum + 1.0);
	 *
	 * 	   gl_FragColor = clamp(sceneCol * (postLum / preLum) + bloomCol * params.x, 0.0, 1.0);
	 * }
	 * </code>
	 */
	static final String aString11179 = "#extension GL_ARB_texture_rectangle : enable\nuniform vec3 params;\nuniform vec3 dimScale;"
			+ "\nuniform sampler2D bloomTex;\nuniform sampler2DRect sceneTex;\nconst vec3 lumCoef = vec3(0.2126, 0.7152, 0.0722);"
			+ "\nvoid main() {\n\t vec4 bloomCol = texture2D(bloomTex, gl_TexCoord[1].xy);\n\t vec4 sceneCol = "
			+ "texture2DRect(sceneTex, gl_TexCoord[0].xy);\n\t float preLum = 0.99*dot(lumCoef, sceneCol.rgb)+0.01;\n    "
			+ "float postLum = preLum*(1.0+(preLum/params.y))/(preLum+1.0);\n\t gl_FragColor = clamp(sceneCol*(postLum/preLum)+bloomCol*params.x,0.0,1.0);\n}\n";

	OpenGl2DTexture aClass102_Sub1_11176;
	OpenGl2DTexture aClass102_Sub1_11183;
	OpenGl2DTexture[] aClass102_Sub1Array11184;
	OpenGlDirectDisplay aClass146_Sub2_Sub1_11181;
	OpenGlDirectDisplay aClass146_Sub2_Sub1_11182;
	OpenGlShaderList aClass96_11172;
	OpenGlShaderList aClass96_11180;
	OpenGlShaderList aClass96_11190;
	OpenGlShaderList aClass96_11191;

	int viewportWidth;
	int viewportHeight;
	int anInt11187;
	int anInt11188;

	Class480_Sub4_Sub1(OpenGlToolkit toolkit) {
		super(toolkit);
	}

	@Override
	boolean method15487() {
		return aClass146_Sub2_Sub1_11181 != null;
	}

	@Override
	void method15491(int width, int height) {
		viewportWidth = width;
		viewportHeight = height;
		int reducedWidth = Class593.priorPowerOf2(viewportWidth);
		int reducedHeight = Class593.priorPowerOf2(viewportHeight);

		if (anInt11187 != reducedWidth || anInt11188 != reducedHeight) {
			if (aClass102_Sub1Array11184 != null) {
				for (int i_13_ = 0; i_13_ < aClass102_Sub1Array11184.length; i_13_++) {
					aClass102_Sub1Array11184[i_13_].deleteImmediately();
				}

				aClass102_Sub1Array11184 = null;
			}

			if (reducedWidth > 256 || reducedHeight > 256) {
				int textureWidth = reducedWidth;
				int textureHeight = reducedHeight;
				int count = 0;

				while (textureWidth > 256 || textureHeight > 256) {
					if (textureWidth > 256) {
						textureWidth >>= 1;
					}

					if (textureHeight > 256) {
						textureHeight >>= 1;
					}

					count++;
				}

				if (aClass146_Sub2_Sub1_11182 == null) {
					aClass146_Sub2_Sub1_11182 = new OpenGlDirectDisplay(toolkit);
				}

				aClass102_Sub1Array11184 = new OpenGl2DTexture[count];
				textureWidth = reducedWidth;
				textureHeight = reducedHeight;
				count = 0;

				while (textureWidth > 256 || textureHeight > 256) {
					aClass102_Sub1Array11184[count++] = new OpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D,
							Class121.aClass121_1465, method15520(), textureWidth, textureHeight);
					if (textureWidth > 256) {
						textureWidth >>= 1;
					}

					if (textureHeight > 256) {
						textureHeight >>= 1;
					}
				}
			} else {
				aClass146_Sub2_Sub1_11182 = null;
			}

			anInt11187 = reducedWidth;
			anInt11188 = reducedHeight;
		}
	}

	@Override
	void method15492(int i, OpenGl2DTexture class102_sub1, OpenGl2DTexture class102_sub1_0_, int i_1_, int i_2_) {
		OpenGL.glPushAttrib(2048);
		OpenGL.glMatrixMode(5889);
		OpenGL.glPushMatrix();
		OpenGL.glLoadIdentity();
		OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);

		if (aClass102_Sub1Array11184 != null) {
			toolkit.method2397(aClass146_Sub2_Sub1_11182);
			int width = Class593.priorPowerOf2(viewportWidth);
			int height = Class593.priorPowerOf2(viewportHeight);
			int index = 0;

			while (width > 256 || height > 256) {
				OpenGL.glViewport(0, 0, width, height);
				aClass146_Sub2_Sub1_11182.method14256(0, aClass102_Sub1Array11184[index].method13938(0));

				if (index == 0) {
					toolkit.setActiveTexture(class102_sub1);
					OpenGL.glBegin(7);

					OpenGL.glTexCoord2f(0.0F, viewportHeight - i_1_);
					OpenGL.glVertex2i(0, 0);

					OpenGL.glTexCoord2f(0 + i_2_, viewportHeight - i_1_);
					OpenGL.glVertex2i(1, 0);

					OpenGL.glTexCoord2f(0 + i_2_, viewportHeight);
					OpenGL.glVertex2i(1, 1);

					OpenGL.glTexCoord2f(0.0F, viewportHeight);
					OpenGL.glVertex2i(0, 1);

					OpenGL.glEnd();
				} else {
					toolkit.setActiveTexture(aClass102_Sub1Array11184[index - 1]);
					OpenGL.glBegin(7);

					OpenGL.glTexCoord2f(0.0F, 0.0F);
					OpenGL.glVertex2i(0, 0);

					OpenGL.glTexCoord2f(1.0F, 0.0F);
					OpenGL.glVertex2i(1, 0);

					OpenGL.glTexCoord2f(1.0F, 1.0F);
					OpenGL.glVertex2i(1, 1);

					OpenGL.glTexCoord2f(0.0F, 1.0F);
					OpenGL.glVertex2i(0, 1);

					OpenGL.glEnd();
				}

				if (width > 256) {
					width >>= 1;
				}

				if (height > 256) {
					height >>= 1;
				}

				index++;
			}

			toolkit.method2398(aClass146_Sub2_Sub1_11182);
			toolkit.setActiveTexture(aClass102_Sub1Array11184[index - 1]);
			toolkit.method2397(aClass146_Sub2_Sub1_11181);

			aClass146_Sub2_Sub1_11181.method17475(0);
			OpenGL.glViewport(0, 0, 256, 256);

			int program = aClass96_11180.program;
			OpenGL.glUseProgram(program);

			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(program, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(program, "params"), params, 0.0F, 0.0F);
			OpenGL.glBegin(7);

			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);

			OpenGL.glTexCoord2f(1.0F, 0.0F);
			OpenGL.glVertex2i(1, 0);

			OpenGL.glTexCoord2f(1.0F, 1.0F);
			OpenGL.glVertex2i(1, 1);

			OpenGL.glTexCoord2f(0.0F, 1.0F);
			OpenGL.glVertex2i(0, 1);

			OpenGL.glEnd();
		} else {
			toolkit.setActiveTexture(class102_sub1);
			toolkit.method2397(aClass146_Sub2_Sub1_11181);
			aClass146_Sub2_Sub1_11181.method17475(0);
			OpenGL.glViewport(0, 0, 256, 256);

			int program = aClass96_11191.program;
			OpenGL.glUseProgram(program);

			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(program, "sceneTex"), 0);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(program, "params"), params, 0.0F, 0.0F);
			OpenGL.glBegin(7);

			OpenGL.glTexCoord2f(0.0F, 0.0F);
			OpenGL.glVertex2i(0, 0);

			OpenGL.glTexCoord2f(viewportWidth, 0.0F);
			OpenGL.glVertex2i(1, 0);

			OpenGL.glTexCoord2f(viewportWidth, viewportHeight);
			OpenGL.glVertex2i(1, 1);

			OpenGL.glTexCoord2f(0.0F, viewportHeight);
			OpenGL.glVertex2i(0, 1);

			OpenGL.glEnd();
		}

		aClass146_Sub2_Sub1_11181.method17475(1);
		toolkit.setActiveTexture(aClass102_Sub1_11176);
		int i_8_ = aClass96_11172.program;
		OpenGL.glUseProgram(i_8_);

		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(i_8_, "baseTex"), 0);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_8_, "step"), 0.00390625F, 0.0F, 0.0F);
		OpenGL.glBegin(7);

		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);

		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);

		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);

		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);

		OpenGL.glEnd();

		aClass146_Sub2_Sub1_11181.method17475(0);
		toolkit.setActiveTexture(aClass102_Sub1_11183);

		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(i_8_, "step"), 0.0F, 0.00390625F, 0.0F);
		OpenGL.glBegin(7);

		OpenGL.glTexCoord2f(0.0F, 0.0F);
		OpenGL.glVertex2i(0, 0);

		OpenGL.glTexCoord2f(1.0F, 0.0F);
		OpenGL.glVertex2i(1, 0);

		OpenGL.glTexCoord2f(1.0F, 1.0F);
		OpenGL.glVertex2i(1, 1);

		OpenGL.glTexCoord2f(0.0F, 1.0F);
		OpenGL.glVertex2i(0, 1);

		OpenGL.glEnd();
		OpenGL.glPopAttrib();
		OpenGL.glPopMatrix();
		OpenGL.glMatrixMode(5888);

		toolkit.method2398(aClass146_Sub2_Sub1_11181);
		int program = aClass96_11190.program;
		OpenGL.glUseProgram(program);

		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(program, "sceneTex"), 0);
		OpenGL.glUniform1i(OpenGL.glGetUniformLocation(program, "bloomTex"), 1);
		OpenGL.glUniform3f(OpenGL.glGetUniformLocation(program, "params"), aFloat11173, aFloat11174, 0.0F);

		toolkit.method14326(1);
		toolkit.setActiveTexture(aClass102_Sub1_11176);
		toolkit.method14326(0);
		toolkit.setActiveTexture(class102_sub1);
	}

	@Override
	void method15493() {
		OpenGL.glUseProgram(0);
		toolkit.method14326(1);
		toolkit.setActiveTexture(null);
		toolkit.method14326(0);
	}

	@Override
	int method15495() {
		return 0;
	}

	@Override
	void destroy() {
		anInt11188 = -1;
		anInt11187 = -1;
		aClass146_Sub2_Sub1_11182 = null;
		aClass102_Sub1Array11184 = null;
		aClass146_Sub2_Sub1_11181 = null;
		aClass102_Sub1_11176 = null;
		aClass102_Sub1_11183 = null;
		aClass96_11191 = null;
		aClass96_11180 = null;
		aClass96_11190 = null;
		aClass96_11172 = null;
	}

	private static final int GL_FRAGMENT_SHADER = 0x8B30;

	@Override
	boolean method15509() {
		if (toolkit.aBool9035 && toolkit.aBool9132 && toolkit.aBool9127) {
			aClass146_Sub2_Sub1_11181 = new OpenGlDirectDisplay(toolkit);
			aClass102_Sub1_11176 = new OpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D, Class121.aClass121_1465,
					method15520(), 256, 256);
			aClass102_Sub1_11176.setRepeating(false, false);
			aClass102_Sub1_11183 = new OpenGl2DTexture(toolkit, OpenGL.GL_TEXTURE_2D, Class121.aClass121_1465,
					method15520(), 256, 256);
			aClass102_Sub1_11183.setRepeating(false, false);
			toolkit.method2397(aClass146_Sub2_Sub1_11181);

			aClass146_Sub2_Sub1_11181.method14256(0, aClass102_Sub1_11176.method13938(0));
			aClass146_Sub2_Sub1_11181.method14256(1, aClass102_Sub1_11183.method13938(0));
			aClass146_Sub2_Sub1_11181.method17475(0);

			if (!aClass146_Sub2_Sub1_11181.isComplete()) {
				toolkit.method2398(aClass146_Sub2_Sub1_11181);
				return false;
			}

			toolkit.method2398(aClass146_Sub2_Sub1_11181);
			aClass96_11191 = OpenGlShaderList.create(toolkit,
					OpenGlShaderPointer.create(toolkit, GL_FRAGMENT_SHADER, STEP_LUMINANCE_RECTANGULAR));
			aClass96_11180 = OpenGlShaderList.create(toolkit,
					OpenGlShaderPointer.create(toolkit, GL_FRAGMENT_SHADER, STEP_LUMINANCE));
			aClass96_11190 = OpenGlShaderList.create(toolkit,
					OpenGlShaderPointer.create(toolkit, GL_FRAGMENT_SHADER, aString11179));
			aClass96_11172 = OpenGlShaderList.create(toolkit,
					OpenGlShaderPointer.create(toolkit, GL_FRAGMENT_SHADER, aString11178));
			return aClass96_11180 != null && aClass96_11191 != null && aClass96_11190 != null && aClass96_11172 != null;
		}

		return false;
	}

	@Override
	Class151 method15520() {
		return Class151.aClass151_1855;
	}

	@Override
	boolean method15528() {
		return false;
	}

	boolean method17531() {
		return toolkit.aBool9035 && toolkit.aBool9132 && toolkit.aBool9127;
	}

}