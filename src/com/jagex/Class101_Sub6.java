package com.jagex;

import jaggl.OpenGL;

public class Class101_Sub6 extends Class101 {
	static final String aString8618 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";
	static final String aString8621 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	boolean aBool8616 = false;
	OpenGlShaderList aClass96_8617;
	Class107 aClass107_8619;
	boolean aBool8620 = false;

	Class101_Sub6(OpenGlToolkit class134_sub2, Class107 class107) {
		super(class134_sub2);
		aClass107_8619 = class107;
		if (aClass107_8619.aClass102_Sub2_1363 != null && toolkit.aBool9130 && toolkit.aBool9132) {
			OpenGlShaderPointer class99 = OpenGlShaderPointer
					.create(toolkit,
							35633,
							"uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n");
			OpenGlShaderPointer class99_0_ = OpenGlShaderPointer
					.create(toolkit,
							35632,
							"varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform vec2 waveIntensity;\nuniform float waveExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat waveFactor = pow(1.0-shoreFactor, waveExponent)-0.5;\nwaveFactor = -4.0*waveFactor*waveFactor+1.0;\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 1.0);\nvec4 surfaceColour = mix(vec4(envColour, fresnel*shoreFactor), (waveIntensity.x*wnNormal.wwww)+waveIntensity.y, waveFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n");
			aClass96_8617 = OpenGlShaderList.create(toolkit, new OpenGlShaderPointer[] { class99, class99_0_ });
			aBool8620 = aClass96_8617 != null;
		}
	}

	@Override
	boolean method1811() {
		return aBool8620;
	}

	@Override
	void method1812(boolean bool) {
		OpenGlCubeMapTexture class102_sub3 = toolkit.method14292();
		if (aBool8620 && class102_sub3 != null) {
			float f = 1.0F + (1.0F - Math.abs(toolkit.sunDirection[1])) * 2.0F;
			toolkit.method14326(1);
			toolkit.setActiveTexture(class102_sub3);
			toolkit.method14326(0);
			toolkit.setActiveTexture(aClass107_8619.aClass102_Sub2_1363);
			int program = aClass96_8617.program;
			OpenGL.glUseProgram(program);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(program, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(program, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(program, "sunDir"), -toolkit.sunDirection[0],
					-toolkit.sunDirection[1], -toolkit.sunDirection[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(program, "sunColour"), toolkit.aFloat9149 * f,
					toolkit.aFloat9074 * f, toolkit.aFloat9159 * f, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(program, "sunExponent"),
					64.0F + Math.abs(toolkit.sunDirection[1]) * 928.0F);
			aBool8616 = true;
		}
	}

	@Override
	void method1814() {
		if (aBool8616) {
			toolkit.method14326(1);
			toolkit.setActiveTexture(null);
			toolkit.method14326(0);
			toolkit.setActiveTexture(null);
			OpenGL.glUseProgram(0);
			aBool8616 = false;
		}
	}

	@Override
	void method1815(int i, int i_1_) {
		if (aBool8616) {
			int i_2_ = 1 << (i & 0x3);
			float scale = (1 << (i >> 3 & 0x7)) / 32.0F;
			int breakWaterDepth = i_1_ & 0xffff;
			float breakWaterOffset = (i_1_ >> 16 & 0x3) / 8.0F;
			float f_5_ = (i_1_ >> 19 & 0xf) / 16.0F;
			float f_6_ = (i_1_ >> 23 & 0xf) / 16.0F;
			int waveExponent = i_1_ >> 27 & 0xf;
			int program = aClass96_8617.program;
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(program, "time"), i_2_ * toolkit.anInt8966 % 40000
					/ 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(program, "scale"), scale);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(program, "breakWaterDepth"), breakWaterDepth);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(program, "breakWaterOffset"), breakWaterOffset);
			OpenGL.glUniform2f(OpenGL.glGetUniformLocation(program, "waveIntensity"), f_6_, f_5_);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(program, "waveExponent"), waveExponent);
		}
	}

	@Override
	void activate(OpenGlTexture texture, int i) {
		if (!aBool8616) {
			toolkit.setActiveTexture(texture);
			toolkit.setColourOp(i);
		}
	}

	@Override
	void method1828(boolean bool) {

	}

}