package com.jagex;

import jaggl.OpenGL;

public class Class101_Sub9 extends Class101 {

	/**
	 * <code>
	 * uniform float time;
	 * uniform float scale;
	 * varying vec3 wvVertex;
	 * varying float waterDepth;
	 * 
	 * void main() {
	 *     waterDepth = gl_MultiTexCoord0.z;
	 *     vec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;
	 *     wvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);
	 *     wvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);
	 *     wvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);
	 * 
	 *     gl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;
	 *     gl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;
	 *     gl_TexCoord[0].z = time;
	 *     gl_TexCoord[0].w = 1.0;
	 * 
	 *     gl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);
	 *     gl_Position = ftransform();
	 * }
	 * </code>
	 */
	static final String aString8678 = "uniform float time;\nuniform float scale;\nvarying vec3 wvVertex;\nvarying float waterDepth;\nvoid main() {\nwaterDepth = gl_MultiTexCoord0.z;\nvec4 ecVertex = gl_ModelViewMatrix*gl_Vertex;\nwvVertex.x = dot(gl_NormalMatrix[0], ecVertex.xyz);\nwvVertex.y = dot(gl_NormalMatrix[1], ecVertex.xyz);\nwvVertex.z = dot(gl_NormalMatrix[2], ecVertex.xyz);\ngl_TexCoord[0].x = dot(gl_TextureMatrix[0][0], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].y = dot(gl_TextureMatrix[0][1], gl_MultiTexCoord0)*scale;\ngl_TexCoord[0].z = time;\ngl_TexCoord[0].w = 1.0;\ngl_FogFragCoord = clamp((ecVertex.z-gl_Fog.start)*gl_Fog.scale, 0.0, 1.0);\ngl_Position = ftransform();\n}\n";

	/**
	 * <code>
	 * varying vec3 wvVertex;
	 * varying float waterDepth;
	 * uniform vec3 sunDir;
	 * uniform vec4 sunColour;
	 * uniform float sunExponent;
	 * uniform float breakWaterDepth;
	 * uniform float breakWaterOffset;
	 * uniform sampler3D normalSampler;
	 * uniform samplerCube envMapSampler;
	 * 
	 * void main() {
	 *     vec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;
	 * 	   wnNormal.xyz = 2.0*wnNormal.xyz-1.0;
	 * 
	 * 	   vec3 wnVector = normalize(wvVertex);
	 * 	   vec3 wnReflection = reflect(wnVector, wnNormal.xyz);
	 * 	   vec3 envColour = textureCube(envMapSampler, wnReflection).rgb;
	 * 	   vec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);
	 * 
	 * 	   float shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);
	 * 	   float ndote = dot(wnVector, wnNormal.xyz);
	 * 	   float fresnel = pow(1.0-abs(ndote), 2.0);
	 * 
	 * 	   vec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;
	 * 	   gl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);
	 * }
	 * </code>
	 */
	static final String aString8682 = "varying vec3 wvVertex;\nvarying float waterDepth;\nuniform vec3 sunDir;\nuniform vec4 sunColour;\nuniform float sunExponent;\nuniform float breakWaterDepth;\nuniform float breakWaterOffset;\nuniform sampler3D normalSampler;\nuniform samplerCube envMapSampler;\nvoid main() {\nvec4 wnNormal = texture3D(normalSampler, gl_TexCoord[0].xyz).rbga;\nwnNormal.xyz = 2.0*wnNormal.xyz-1.0;\nvec3 wnVector = normalize(wvVertex);\nvec3 wnReflection = reflect(wnVector, wnNormal.xyz);\nvec3 envColour = textureCube(envMapSampler, wnReflection).rgb;\nvec4 specularColour = sunColour*pow(clamp(-dot(sunDir, wnReflection), 0.0, 1.0), sunExponent);\nfloat shoreFactor = clamp(waterDepth/breakWaterDepth-breakWaterOffset*wnNormal.w, 0.0, 1.0);\nfloat ndote = dot(wnVector, wnNormal.xyz);\nfloat fresnel = pow(1.0-abs(ndote), 2.0);\nvec4 surfaceColour = vec4(envColour, fresnel*shoreFactor)+specularColour*shoreFactor;\ngl_FragColor = vec4(mix(surfaceColour.rgb, gl_Fog.color.rgb, gl_FogFragCoord), surfaceColour.a);\n}\n";
	boolean aBool8677;
	OpenGlShaderList aClass96_8679;
	boolean aBool8680 = false;
	Class107 aClass107_8681;

	Class101_Sub9(OpenGlToolkit toolkit, Class107 class107) {
		super(toolkit);
		aBool8677 = false;
		aClass107_8681 = class107;
		if (aClass107_8681.aClass102_Sub2_1363 != null && toolkit.aBool9130 && toolkit.aBool9132) {
			OpenGlShaderPointer class99 = OpenGlShaderPointer.create(toolkit, 35633, aString8678);
			OpenGlShaderPointer class99_5_ = OpenGlShaderPointer.create(toolkit, 35632, aString8682);
			aClass96_8679 = OpenGlShaderList.create(toolkit, new OpenGlShaderPointer[] { class99, class99_5_ });
			aBool8677 = aClass96_8679 != null;
		}
	}

	@Override
	boolean method1811() {
		return aBool8677;
	}

	@Override
	void method1812(boolean bool) {
		OpenGlCubeMapTexture class102_sub3 = toolkit.method14292();

		if (aBool8677 && class102_sub3 != null) {
			toolkit.method14326(1);
			toolkit.setActiveTexture(class102_sub3);
			toolkit.method14326(0);
			toolkit.setActiveTexture(aClass107_8681.aClass102_Sub2_1363);

			int program = aClass96_8679.program;
			OpenGL.glUseProgram(program);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(program, "normalSampler"), 0);
			OpenGL.glUniform1i(OpenGL.glGetUniformLocation(program, "envMapSampler"), 1);
			OpenGL.glUniform3f(OpenGL.glGetUniformLocation(program, "sunDir"), -toolkit.sunDirection[0],
					-toolkit.sunDirection[1], -toolkit.sunDirection[2]);
			OpenGL.glUniform4f(OpenGL.glGetUniformLocation(program, "sunColour"), toolkit.aFloat9149,
					toolkit.aFloat9074, toolkit.aFloat9159, 1.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(program, "sunExponent"),
					96.0F + Math.abs(toolkit.sunDirection[1]) * 928.0F);
			aBool8680 = true;
		}
	}

	@Override
	void method1814() {
		if (aBool8680) {
			toolkit.method14326(1);
			toolkit.setActiveTexture(null);
			toolkit.method14326(0);
			toolkit.setActiveTexture(null);
			OpenGL.glUseProgram(0);
			aBool8680 = false;
		}
	}

	@Override
	void method1815(int i, int waterInfo) {
		if (aBool8680) {
			int i_1_ = 1 << (i & 0x3);
			float scale = (1 << (i >> 3 & 0x7)) / 32.0F;
			int brealWaterDepth = waterInfo & 0xffff;
			float breakWaterOffset = (waterInfo >> 16 & 0x3) / 8.0F;
			int program = aClass96_8679.program;

			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(program, "time"), i_1_ * toolkit.anInt8966 % 40000
					/ 40000.0F);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(program, "scale"), scale);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(program, "breakWaterDepth"), brealWaterDepth);
			OpenGL.glUniform1f(OpenGL.glGetUniformLocation(program, "breakWaterOffset"), breakWaterOffset);
		}
	}

	@Override
	void activate(OpenGlTexture texture, int i) {
		if (!aBool8680) {
			toolkit.setActiveTexture(texture);
			toolkit.setColourOp(i);
		}
	}

	@Override
	void method1828(boolean bool) {

	}

}