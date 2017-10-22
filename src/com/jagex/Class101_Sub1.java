package com.jagex;

import jaggl.OpenGL;

public class Class101_Sub1 extends Class101 {
	static final char aChar8534 = '\0';

	/**
	 * <code>
	 * !!ARBvp1.0
	 * OPTION  ARB_position_invariant;
	 * ATTRIB  iPos         = vertex.position;
	 * ATTRIB  iColour      = vertex.color;
	 * ATTRIB  iTexCoord    = vertex.texcoord[0];
	 * OUTPUT  oColour      = result.color;
	 * OUTPUT  oTexCoord0   = result.texcoord[0];
	 * OUTPUT  oTexCoord1   = result.texcoord[1];
	 * OUTPUT  oFogCoord    = result.fogcoord;
	 * PARAM   time         = program.local[65];
	 * PARAM   turbulence   = program.local[64];
	 * PARAM   lightAmbient = program.local[66];
	 * PARAM   pMatrix[4]   = { state.matrix.projection };
	 * PARAM   mvMatrix[4]  = { state.matrix.modelview };
	 * PARAM   ivMatrix[4]  = { state.matrix.texture[1] };
	 * PARAM   texMatrix[4]  = { state.matrix.texture[0] };
	 * PARAM   fNoise[64]   = { program.local[0..63] };
	 * TEMP    noise, viewPos, worldPos, texCoord;
	 * ADDRESS noiseAddr;
	 * DP4   viewPos.x, mvMatrix[0], iPos;
	 * DP4   viewPos.y, mvMatrix[1], iPos;
	 * DP4   viewPos.z, mvMatrix[2], iPos;
	 * DP4   viewPos.w, mvMatrix[3], iPos;
	 * MOV   oFogCoord.x, viewPos.z;
	 * DP4   worldPos.x, ivMatrix[0], viewPos;
	 * DP4   worldPos.y, ivMatrix[1], viewPos;
	 * DP4   worldPos.z, ivMatrix[2], viewPos;
	 * DP4   worldPos.w, ivMatrix[3], viewPos;
	 * ADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;
	 * FRC   noise, noise;
	 * MUL   noise, noise, 64;
	 * ARL   noiseAddr.x, noise.x;
	 * MOV   noise.x, fNoise[noiseAddr.x].x;
	 * ARL   noiseAddr.x, noise.y;
	 * MOV   noise.y, fNoise[noiseAddr.x].y;
	 * MUL   noise, noise, turbulence.x;
	 * DP4   texCoord.x, texMatrix[0], iTexCoord;
	 * DP4   texCoord.y, texMatrix[1], iTexCoord;
	 * ADD   oTexCoord0.xy, texCoord, noise;
	 * MOV   oTexCoord0.z, 0;
	 * MOV   oTexCoord0.w, 1;
	 * MUL   oTexCoord1.xy, texCoord, 0.125;
	 * MOV   oTexCoord1.zw, time.xxxw;
	 * MUL   oColour.xyz, iColour, lightAmbient;
	 * MOV   oColour.w, iColour.w;
	 * END
	 * </code>
	 */
	static final String aString8537 = "!!ARBvp1.0\nOPTION  ARB_position_invariant;\nATTRIB  iPos         = vertex.position;\nATTRIB  iColour      = vertex.color;\nATTRIB  iTexCoord    = vertex.texcoord[0];\nOUTPUT  oColour      = result.color;\nOUTPUT  oTexCoord0   = result.texcoord[0];\nOUTPUT  oTexCoord1   = result.texcoord[1];\nOUTPUT  oFogCoord    = result.fogcoord;\nPARAM   time         = program.local[65];\nPARAM   turbulence   = program.local[64];\nPARAM   lightAmbient = program.local[66]; \nPARAM   pMatrix[4]   = { state.matrix.projection };\nPARAM   mvMatrix[4]  = { state.matrix.modelview };\nPARAM   ivMatrix[4]  = { state.matrix.texture[1] };\nPARAM   texMatrix[4]  = { state.matrix.texture[0] };\nPARAM   fNoise[64]   = { program.local[0..63] };\nTEMP    noise, viewPos, worldPos, texCoord;\nADDRESS noiseAddr;\nDP4   viewPos.x, mvMatrix[0], iPos;\nDP4   viewPos.y, mvMatrix[1], iPos;\nDP4   viewPos.z, mvMatrix[2], iPos;\nDP4   viewPos.w, mvMatrix[3], iPos;\nMOV   oFogCoord.x, viewPos.z;\nDP4   worldPos.x, ivMatrix[0], viewPos;\nDP4   worldPos.y, ivMatrix[1], viewPos;\nDP4   worldPos.z, ivMatrix[2], viewPos;\nDP4   worldPos.w, ivMatrix[3], viewPos;\nADD   noise.x, worldPos.x, worldPos.z;SUB   noise.y, worldPos.z, worldPos.x;MUL   noise, noise, 0.0001220703125;\nFRC   noise, noise;\nMUL   noise, noise, 64;\nARL   noiseAddr.x, noise.x;\nMOV   noise.x, fNoise[noiseAddr.x].x;\nARL   noiseAddr.x, noise.y;\nMOV   noise.y, fNoise[noiseAddr.x].y;\nMUL   noise, noise, turbulence.x;\nDP4   texCoord.x, texMatrix[0], iTexCoord;\nDP4   texCoord.y, texMatrix[1], iTexCoord;\nADD   oTexCoord0.xy, texCoord, noise;\nMOV   oTexCoord0.z, 0;\nMOV   oTexCoord0.w, 1;\nMUL   oTexCoord1.xy, texCoord, 0.125;\nMOV   oTexCoord1.zw, time.xxxw;\nMUL   oColour.xyz, iColour, lightAmbient;\nMOV   oColour.w, iColour.w;\nEND";
	static final char aChar8539 = '\001';
	static float[] aFloatArray8541 = new float[4];
	Class107 aClass107_8533;
	float aFloat8535;
	OpenGlList list;
	float[] aFloatArray8538;
	OpenGlProgramString aClass95_8540;
	int anInt8542;

	Class101_Sub1(OpenGlToolkit toolkit, Class107 class107) {
		super(toolkit);
		aClass107_8533 = class107;
		if (toolkit.aBool9104 && this.toolkit.anInt8948 >= 2) {
			aClass95_8540 = OpenGlProgramString.create(toolkit, 34336, aString8537);

			if (aClass95_8540 != null) {
				int[][] is = Class156.method3300(64, 256, 0, 4, 4, 3, 0.4F, false);
				int[][] is_1_ = Class156.method3300(64, 256, 8, 4, 4, 3, 0.4F, false);
				int i = 0;

				aFloatArray8538 = new float[32768];
				for (int i_2_ = 0; i_2_ < 256; i_2_++) {
					int[] is_3_ = is[i_2_];
					int[] is_4_ = is_1_[i_2_];

					for (int i_5_ = 0; i_5_ < 64; i_5_++) {
						aFloatArray8538[i++] = is_3_[i_5_] / 4096.0F;
						aFloatArray8538[i++] = is_4_[i_5_] / 4096.0F;
					}
				}
				method13962();
			}
		}
	}

	void method13962() {
		list = new OpenGlList(toolkit, 2);
		list.create(0);
		toolkit.method14326(1);
		toolkit.setTexEnvColour(-16777216);
		toolkit.setTextureParameters(260, 7681);
		toolkit.method14283(0, 34166, 770);
		toolkit.method14326(0);
		OpenGL.glBindProgramARB(34336, aClass95_8540.program);
		OpenGL.glEnable(34336);
		list.end();
		list.create(1);
		toolkit.method14326(1);
		OpenGL.glMatrixMode(5890);
		OpenGL.glLoadIdentity();
		OpenGL.glMatrixMode(5888);
		toolkit.setColourOp(0);
		toolkit.method14283(0, 5890, 770);
		toolkit.method14326(0);
		OpenGL.glBindProgramARB(34336, 0);
		OpenGL.glDisable(34336);
		list.end();
	}

	@Override
	boolean method1811() {
		return true;
	}

	@Override
	void method1812(boolean bool) {
		if (list != null) {
			list.call('\0');
			toolkit.method14326(1);
			OpenGL.glMatrixMode(5890);
			OpenGL.glLoadMatrixf(toolkit.aClass399_9092.array, 0);
			OpenGL.glMatrixMode(5888);
			toolkit.method14326(0);

			if (anInt8542 != toolkit.anInt8966) {
				int i = toolkit.anInt8966 % 5000 * 128 / 5000;

				for (int i_0_ = 0; i_0_ < 64; i_0_++) {
					OpenGL.glProgramLocalParameter4fvARB(34336, i_0_, aFloatArray8538, i);
					i += 2;
				}

				if (aClass107_8533.aBool1361) {
					aFloat8535 = toolkit.anInt8966 % 4000 / 4000.0F;
				} else {
					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}

				anInt8542 = toolkit.anInt8966;
			}
		}
	}

	@Override
	void method1814() {
		if (list != null) {
			list.call('\001');
			toolkit.method14326(1);
			toolkit.setActiveTexture(null);
			toolkit.method14326(0);
		}
	}

	@Override
	void method1815(int i, int i_6_) {
		if (list != null) {
			toolkit.method14326(1);

			if ((i & 0x80) == 0) {
				if ((i_6_ & 0x1) == 1) {
					if (!aClass107_8533.aBool1361) {
						int i_7_ = toolkit.anInt8966 % 4000 * 16 / 4000;

						toolkit.setActiveTexture(aClass107_8533.aClass102_Sub1Array1357[i_7_]);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
					} else {
						toolkit.setActiveTexture(aClass107_8533.aClass102_Sub2_1358);
						OpenGL.glProgramLocalParameter4fARB(34336, 65, aFloat8535, 0.0F, 0.0F, 1.0F);
					}
				} else {
					if (aClass107_8533.aBool1361) {
						toolkit.setActiveTexture(aClass107_8533.aClass102_Sub2_1358);
					} else {
						toolkit.setActiveTexture(aClass107_8533.aClass102_Sub1Array1357[0]);
					}

					OpenGL.glProgramLocalParameter4fARB(34336, 65, 0.0F, 0.0F, 0.0F, 1.0F);
				}
			} else {
				toolkit.setActiveTexture(null);
			}

			toolkit.method14326(0);
			if ((i & 0x40) == 0) {
				aFloatArray8541[0] = toolkit.ambient * toolkit.aFloat9149;
				aFloatArray8541[1] = toolkit.ambient * toolkit.aFloat9074;
				aFloatArray8541[2] = toolkit.ambient * toolkit.aFloat9159;
				OpenGL.glProgramLocalParameter4fvARB(34336, 66, aFloatArray8541, 0);
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 66, 1.0F, 1.0F, 1.0F, 1.0F);
			}

			int i_8_ = i & 0x3;
			if (i_8_ == 2) {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.05F, 1.0F, 1.0F, 1.0F);
			} else if (i_8_ == 3) {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.1F, 1.0F, 1.0F, 1.0F);
			} else {
				OpenGL.glProgramLocalParameter4fARB(34336, 64, 0.025F, 1.0F, 1.0F, 1.0F);
			}
		}
	}

	@Override
	void activate(OpenGlTexture texture, int i) {
		toolkit.setActiveTexture(texture);
		toolkit.setColourOp(i);
	}

	@Override
	void method1828(boolean bool) {

	}

}