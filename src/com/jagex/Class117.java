package com.jagex;

import jaggl.OpenGL;

public class Class117 {

	/**
	 * <code>
	 * uniform float rcpRelief;
	 * uniform vec2 sampleSize;
	 * uniform sampler3D heightMap;
	 * 
	 * void main() {
	 *     float dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0) + gl_TexCoord[0].xyz).r
	 *                   - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0) + gl_TexCoord[0].xyz).r;
	 *     float dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0) + gl_TexCoord[0].xyz).r
	 *                   - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0) + gl_TexCoord[0].xyz).r;
	 *     gl_FragColor = vec4(0.5 + normalize(vec3(dx, dy, rcpRelief)) * 0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);
	 * }
	 * </code>
	 */
	static final String SHADER_SOURCE = "uniform float rcpRelief;\nuniform vec2 sampleSize;\nuniform sampler3D heightMap;\nvoid main() {\nfloat dx = texture3D(heightMap, vec3(-sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(sampleSize.x, 0.0, 0.0)+gl_TexCoord[0].xyz).r;\nfloat dy = texture3D(heightMap, vec3(0.0, -sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r - texture3D(heightMap, vec3(0.0, sampleSize.y, 0.0)+gl_TexCoord[0].xyz).r;\ngl_FragColor = vec4(0.5+normalize(vec3(dx, dy, rcpRelief))*0.5, texture3D(heightMap, gl_TexCoord[0].xyz).r);\n}\n";
	OpenGlToolkit toolkit;
	OpenGlShaderList shaders;

	Class117(OpenGlToolkit toolkit) {
		this.toolkit = toolkit;
	}

	boolean method2162() {
		if (toolkit.aBool9035 && toolkit.aBool9132 && shaders == null) {
			OpenGlShaderPointer pointer = OpenGlShaderPointer.create(toolkit, 35632, SHADER_SOURCE);
			if (pointer != null) {
				shaders = OpenGlShaderList.create(toolkit, new OpenGlShaderPointer[] { pointer });
			}
		}

		return shaders != null;
	}

	boolean method2164(OpenGl3DTexture class102_sub2, OpenGl3DTexture class102_sub2_0_, float f) {
		if (!method2162()) {
			return false;
		}

		OpenGlDirectDisplay class146_sub2_sub1 = toolkit.aClass146_Sub2_Sub1_9049;
		OpenGlAttachableRenderBuffer class480_sub31_sub3 = new OpenGlAttachableRenderBuffer(toolkit, Class121.aClass121_1465,
				Class151.aClass151_2, class102_sub2.width, class102_sub2.height);
		boolean bool = false;
		toolkit.method2397(class146_sub2_sub1);
		class146_sub2_sub1.method14256(0, class480_sub31_sub3);

		if (class146_sub2_sub1.isComplete()) {
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glMatrixMode(5889);
			OpenGL.glPushMatrix();
			OpenGL.glLoadIdentity();
			OpenGL.glOrtho(0.0, 1.0, 0.0, 1.0, -1.0, 1.0);
			OpenGL.glPushAttrib(2048);
			OpenGL.glViewport(0, 0, class102_sub2.width, class102_sub2.height);
			OpenGL.glUseProgram(shaders.program);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(shaders.program, "heightMap"), 0);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(shaders.program, "rcpRelief"), 1.0F / f);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(shaders.program, "sampleSize"),
					1.0F / class102_sub2_0_.width, 1.0F / class102_sub2_0_.height);

			for (int i = 0; i < class102_sub2.depth; i++) {
				float f_1_ = (float) i / (float) class102_sub2.depth;
				toolkit.setActiveTexture(class102_sub2_0_);
				OpenGL.glBegin(7);
				OpenGL.glTexCoord3f(0.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 0.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 0.0F);
				OpenGL.glTexCoord3f(1.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(1.0F, 1.0F);
				OpenGL.glTexCoord3f(0.0F, 1.0F, f_1_);
				OpenGL.glVertex2f(0.0F, 1.0F);
				OpenGL.glEnd();
				class102_sub2.copy(0, 0, i, class102_sub2.width, class102_sub2.height, 0, 0);
			}

			OpenGL.glUseProgram(0);
			OpenGL.glPopAttrib();
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
			OpenGL.glPopMatrix();
			bool = true;
		}

		class146_sub2_sub1.method14256(0, null);
		toolkit.method2398(class146_sub2_sub1);
		return bool;
	}

}