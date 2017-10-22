package com.jagex;

import java.nio.ByteBuffer;

import sun.misc.Unsafe;

public class NativeModel extends Model {
	static final int anInt9169 = 7;
	static final int anInt9176 = 4;

	static short[] method14520(short[] is, int i) {
		short[] is_23_ = new short[i];
		System.arraycopy(is, 0, is_23_, 0, i);
		return is_23_;
	}

	static float[] method14552(float[] fs, int i) {
		float[] fs_790_ = new float[i];
		System.arraycopy(fs, 0, fs_790_, 0, i);
		return fs_790_;
	}

	static byte[] method14558(byte[] is, int i) {
		byte[] is_791_ = new byte[i];
		System.arraycopy(is, 0, is_791_, 0, i);
		return is_791_;
	}

	int vertexCount;
	Class145[] aClass145Array9161;
	NativeToolkit toolkit;
	int anInt9163;
	int anInt9164;
	int anInt9165 = 0;
	short aShort9166;
	boolean aBool9167;
	int[] anIntArray9168;
	int[] vertexY;
	int anInt9171;
	int[][] anIntArrayArray9172;
	float[] aFloatArray9173;
	int uniqueVertices;
	short[] aShortArray9175;
	short[] aShortArray9177;
	short[] aShortArray9178;
	short[] aShortArray9179;
	byte[] aByteArray9180;
	int minimumY;
	float[] aFloatArray9182;
	Class328 aClass328_9183;
	int anInt9184;
	short[] aShortArray9185;
	int[] anIntArray9186;
	byte[] aByteArray9187;
	short[] aShortArray9188;
	int minimumX;
	short[] aShortArray9190;
	short[] aShortArray9191;
	int[] vertexX;
	short[] aShortArray9193;
	Class313 aClass313_9194;
	int anInt9195;
	Class314 aClass314_9196;
	Class305[] aClass305Array9197;
	Class314 aClass314_9198;
	int maximumX;
	boolean aBool9200;
	boolean aBool9201;
	boolean aBool9202;
	int anInt9203;
	int[][] anIntArrayArray9204;
	boolean computedBounds;
	int[] anIntArray9206;
	int maximumY;
	boolean aBool9208;
	int[][] anIntArrayArray9209;
	int minimumZ;
	int maximumZ;
	short[] aShortArray9212;
	int anInt9213;
	int[] anIntArray9214;
	int[] anIntArray9215;
	int[] anIntArray9216;
	Class314 aClass314_9217;
	short[] aShortArray9218;
	Class314 aClass314_9219;
	Class115[] aClass115Array9220;
	int anInt9221;
	Class324[] aClass324Array9222;
	short aShort9223;
	int anInt9224;
	short[] aShortArray9225;
	float[] aFloatArray9226;
	int[] anIntArray9227;
	int[] vertexZ;
	int[] anIntArray9229;
	short[] aShortArray9230;
	int[] anIntArray9231;
	long[] aLongArray9232;

	int anInt9233;

	int anInt9234;

	boolean aBool9235;

	NativeModel(NativeToolkit toolkit, BaseModel base, int i, int i_140_, int i_141_, int i_142_) {
		this(toolkit, i, i_142_, true, false);
		TextureMetricsList class147 = toolkit.metricsList;
		BillboardLoader interface41 = toolkit.billboardLoader;
		int[] is = new int[base.anInt1793];
		anIntArray9186 = new int[base.anInt1768 + 1];
		for (int i_143_ = 0; i_143_ < base.anInt1793; i_143_++) {
			if (base.aByteArray1775 == null || base.aByteArray1775[i_143_] != 2) {
				if (base.aShortArray1780 != null && base.aShortArray1780[i_143_] != -1) {
					TextureMetrics class141 = class147.get(base.aShortArray1780[i_143_] & 0xffff);
					if (((anInt9164 & 0x40) == 0 || !class141.aBool1724) && class141.aBool1723) {
						continue;
					}
				}
				is[anInt9184++] = i_143_;
				anIntArray9186[base.aShortArray1769[i_143_]]++;
				anIntArray9186[base.aShortArray1770[i_143_]]++;
				anIntArray9186[base.aShortArray1766[i_143_]]++;
			}
		}
		anInt9195 = anInt9184;
		long[] ls = new long[anInt9184];
		boolean bool = (anInt9163 & 0x100) != 0;
		for (int i_144_ = 0; i_144_ < anInt9184; i_144_++) {
			int i_145_ = is[i_144_];
			TextureMetrics class141 = null;
			int i_146_ = 0;
			int i_147_ = 0;
			int i_148_ = 0;
			int i_149_ = 0;
			if (base.aClass148Array1795 != null) {
				boolean bool_150_ = false;
				for (Class148 class148 : base.aClass148Array1795) {
					if (i_145_ == class148.anInt1823 * 55597925) {
						Billboard class355 = interface41.load(class148.billboard * -310433347);
						if (class355.aBool3806) {
							bool_150_ = true;
						}
						if (class355.texture * -1249209579 != -1) {
							TextureMetrics class141_152_ = class147.get(class355.texture * -1249209579);
							if (class141_152_.aClass554_1727 == Class554.aClass554_7500) {
								aBool9201 = true;
							}
						}
					}
				}
				if (bool_150_) {
					ls[i_144_] = 9223372036854775807L;
					anInt9195--;
					continue;
				}
			}
			if (base.aClass145Array1777 != null) {
				boolean bool_153_ = false;
				for (Class145 class145 : base.aClass145Array1777) {
					if (i_145_ == class145.anInt1804 * -15453957) {
						ParticleProducerDefinition class354 = toolkit.particleLoader.load(class145.producer
								* -471432283);
						if (class354.aBool3743) {
							bool_153_ = true;
						}
					}
				}
				if (bool_153_) {
					ls[i_144_] = 9223372036854775807L;
					anInt9195--;
					continue;
				}
			}
			int i_155_ = -1;
			if (base.aShortArray1780 != null) {
				i_155_ = base.aShortArray1780[i_145_];
				if (i_155_ != -1) {
					class141 = class147.get(i_155_ & 0xffff);
					if ((anInt9164 & 0x40) == 0 || !class141.aBool1724) {
						i_148_ = class141.aByte1719;
						i_149_ = class141.aByte1720;
					} else {
						i_155_ = -1;
						class141 = null;
					}
				}
			}
			boolean bool_156_ = base.aByteArray1788 != null && base.aByteArray1788[i_145_] != 0 || class141 != null
					&& class141.aClass554_1727 != Class554.aClass554_7499;
			if ((bool || bool_156_) && base.aByteArray1790 != null) {
				i_146_ += base.aByteArray1790[i_145_] << 17;
			}
			if (bool_156_) {
				i_146_ += 65536;
			}
			i_146_ += (i_148_ & 0xff) << 8;
			i_146_ += i_149_ & 0xff;
			i_147_ += (i_155_ & 0xffff) << 16;
			i_147_ += i_144_ & 0xffff;
			ls[i_144_] = ((long) i_146_ << 32) + i_147_;
			aBool9201 |= bool_156_;
			NativeModel class143_sub2_157_ = this;
			class143_sub2_157_.aBool9202 = class143_sub2_157_.aBool9202
					| (class141 != null && (class141.aByte1728 != 0 || class141.aByte1700 != 0));
		}
		Class431.method7148(ls, is);
		anInt9165 = base.vertexCount;
		vertexCount = base.anInt1768;
		vertexX = base.vertexX;
		vertexY = base.vertexY;
		vertexZ = base.vertexZ;
		aShortArray9178 = base.aShortArray1764;
		Class345[] class345s = new Class345[vertexCount];
		aClass145Array9161 = base.aClass145Array1777;
		aClass115Array9220 = base.aClass115Array1800;
		if (base.aClass148Array1795 != null) {
			anInt9221 = base.aClass148Array1795.length;
			aClass324Array9222 = new Class324[anInt9221];
			aClass305Array9197 = new Class305[anInt9221];
			for (int i_158_ = 0; i_158_ < anInt9221; i_158_++) {
				Class148 class148 = base.aClass148Array1795[i_158_];
				Billboard class355 = interface41.load(class148.billboard * -310433347);
				int i_159_ = -1;
				for (int i_160_ = 0; i_160_ < anInt9184; i_160_++) {
					if (is[i_160_] == class148.anInt1823 * 55597925) {
						i_159_ = i_160_;
						break;
					}
				}
				if (i_159_ == -1) {
					throw new RuntimeException();
				}
				int i_161_ = Class598.HSL_TABLE[base.aShortArray1779[class148.anInt1823 * 55597925] & 0xffff] & 0xffffff;
				i_161_ = i_161_
						| 255 - (base.aByteArray1788 != null ? base.aByteArray1788[class148.anInt1823 * 55597925] : 0) << 24;
				aClass324Array9222[i_158_] = new Class324(i_159_, base.aShortArray1769[class148.anInt1823 * 55597925],
						base.aShortArray1770[class148.anInt1823 * 55597925],
						base.aShortArray1766[class148.anInt1823 * 55597925], class355.anInt3808 * 923292647,
						class355.anInt3809 * -202613523, class355.texture * -1249209579,
						class355.anInt3811 * 1336839747, class355.anInt3813 * -8778329, class355.aBool3806,
						class355.aBool3807, class148.anInt1824 * 214376177);
				aClass305Array9197[i_158_] = new Class305(i_161_);
			}
		}
		int i_162_ = anInt9184 * 3;
		aShortArray9175 = new short[i_162_];
		aShortArray9230 = new short[i_162_];
		aShortArray9177 = new short[i_162_];
		aShortArray9212 = new short[i_162_];
		aShortArray9179 = new short[i_162_];
		aByteArray9180 = new byte[i_162_];
		aFloatArray9173 = new float[i_162_];
		aFloatArray9182 = new float[i_162_];
		aShortArray9193 = new short[anInt9184];
		aByteArray9187 = new byte[anInt9184];
		aShortArray9188 = new short[anInt9184];
		aShortArray9185 = new short[anInt9184];
		aShortArray9190 = new short[anInt9184];
		aShortArray9191 = new short[anInt9184];
		if (base.aShortArray1753 != null) {
			aShortArray9225 = new short[anInt9184];
		}
		aShort9223 = (short) i_140_;
		aShort9166 = (short) i_141_;
		aShortArray9218 = new short[i_162_];
		aLongArray9232 = new long[i_162_];
		int i_163_ = 0;
		for (int i_164_ = 0; i_164_ < base.anInt1768; i_164_++) {
			int i_165_ = anIntArray9186[i_164_];
			anIntArray9186[i_164_] = i_163_;
			i_163_ += i_165_;
			class345s[i_164_] = new Class345();
		}
		anIntArray9186[base.anInt1768] = i_163_;
		Class135 class135 = method2888(base, is, anInt9184);
		Class307[] class307s = new Class307[base.anInt1793];
		for (int i_166_ = 0; i_166_ < base.anInt1793; i_166_++) {
			short i_167_ = base.aShortArray1769[i_166_];
			short i_168_ = base.aShortArray1770[i_166_];
			short i_169_ = base.aShortArray1766[i_166_];
			int i_170_ = vertexX[i_168_] - vertexX[i_167_];
			int i_171_ = vertexY[i_168_] - vertexY[i_167_];
			int i_172_ = vertexZ[i_168_] - vertexZ[i_167_];
			int i_173_ = vertexX[i_169_] - vertexX[i_167_];
			int i_174_ = vertexY[i_169_] - vertexY[i_167_];
			int i_175_ = vertexZ[i_169_] - vertexZ[i_167_];
			int i_176_ = i_171_ * i_175_ - i_174_ * i_172_;
			int i_177_ = i_172_ * i_173_ - i_175_ * i_170_;
			int i_178_;
			for (i_178_ = i_170_ * i_174_ - i_173_ * i_171_; i_176_ > 8192 || i_177_ > 8192 || i_178_ > 8192
					|| i_176_ < -8192 || i_177_ < -8192 || i_178_ < -8192; i_178_ >>= 1) {
				i_176_ >>= 1;
				i_177_ >>= 1;
			}
			int i_179_ = (int) Math.sqrt(i_176_ * i_176_ + i_177_ * i_177_ + i_178_ * i_178_);
			if (i_179_ <= 0) {
				i_179_ = 1;
			}
			i_176_ = i_176_ * 256 / i_179_;
			i_177_ = i_177_ * 256 / i_179_;
			i_178_ = i_178_ * 256 / i_179_;
			byte i_180_ = base.aByteArray1775 == null ? (byte) 0 : base.aByteArray1775[i_166_];
			if (i_180_ == 0) {
				Class345 class345 = class345s[i_167_];
				class345.anInt3655 += i_176_;
				class345.anInt3657 += i_177_;
				class345.anInt3654 += i_178_;
				class345.anInt3656++;
				class345 = class345s[i_168_];
				class345.anInt3655 += i_176_;
				class345.anInt3657 += i_177_;
				class345.anInt3654 += i_178_;
				class345.anInt3656++;
				class345 = class345s[i_169_];
				class345.anInt3655 += i_176_;
				class345.anInt3657 += i_177_;
				class345.anInt3654 += i_178_;
				class345.anInt3656++;
			} else if (i_180_ == 1) {
				Class307 class307 = class307s[i_166_] = new Class307();
				class307.anInt3316 = i_176_;
				class307.anInt3317 = i_177_;
				class307.anInt3318 = i_178_;
			}
		}
		for (int i_181_ = 0; i_181_ < anInt9184; i_181_++) {
			int i_182_ = is[i_181_];
			int i_183_ = base.aShortArray1779[i_182_] & 0xffff;
			int i_184_ = base.aByteArray1788 != null ? base.aByteArray1788[i_182_] & 0xff : 0;
			short i_185_ = base.aShortArray1780 == null ? (short) -1 : base.aShortArray1780[i_182_];
			if (i_185_ != -1 && (anInt9164 & 0x40) != 0 && class147.get(i_185_).aBool1724) {
				i_185_ = (short) -1;
			}
			float f = 0.0F;
			float f_186_ = 0.0F;
			float f_187_ = 0.0F;
			float f_188_ = 0.0F;
			float f_189_ = 0.0F;
			float f_190_ = 0.0F;
			long l;
			long l_191_;
			long l_192_;
			if (i_185_ != -1) {
				int i_193_ = base.aShortArray1778 != null ? base.aShortArray1778[i_182_] : -1;
				if (i_193_ == 32766) {
					int i_194_ = base.aByteArray1772[i_182_] & 0xff;
					int i_195_ = base.aByteArray1773[i_182_] & 0xff;
					int i_196_ = base.aByteArray1758[i_182_] & 0xff;
					i_194_ += base.anIntArray1762[base.aShortArray1769[i_182_]];
					l_192_ = i_194_;
					i_195_ += base.anIntArray1762[base.aShortArray1770[i_182_]];
					l_191_ = i_194_;
					i_196_ += base.anIntArray1762[base.aShortArray1766[i_182_]];
					l = i_194_;
					f = base.aFloatArray1774[i_194_];
					f_186_ = base.aFloatArray1767[i_194_];
					f_187_ = base.aFloatArray1774[i_195_];
					f_188_ = base.aFloatArray1767[i_195_];
					f_189_ = base.aFloatArray1774[i_196_];
					f_190_ = base.aFloatArray1767[i_196_];
				} else if (i_193_ == -1) {
					f = 0.0F;
					f_186_ = 1.0F;
					l_192_ = 65535L;
					f_187_ = 1.0F;
					f_188_ = 1.0F;
					l_191_ = 131071L;
					f_189_ = 0.0F;
					f_190_ = 0.0F;
					l = 196607L;
				} else {
					i_193_ &= 0xffff;
					int i_197_ = 0;
					int i_198_ = 0;
					int i_199_ = 0;
					byte i_200_ = base.aByteArray1787[i_193_];
					if (i_200_ == 0) {
						short i_201_ = base.aShortArray1769[i_182_];
						short i_202_ = base.aShortArray1770[i_182_];
						short i_203_ = base.aShortArray1766[i_182_];
						short i_204_ = base.aShortArray1785[i_193_];
						short i_205_ = base.aShortArray1789[i_193_];
						short i_206_ = base.aShortArray1801[i_193_];
						float f_207_ = base.vertexX[i_204_];
						float f_208_ = base.vertexY[i_204_];
						float f_209_ = base.vertexZ[i_204_];
						float f_210_ = base.vertexX[i_205_] - f_207_;
						float f_211_ = base.vertexY[i_205_] - f_208_;
						float f_212_ = base.vertexZ[i_205_] - f_209_;
						float f_213_ = base.vertexX[i_206_] - f_207_;
						float f_214_ = base.vertexY[i_206_] - f_208_;
						float f_215_ = base.vertexZ[i_206_] - f_209_;
						float f_216_ = base.vertexX[i_201_] - f_207_;
						float f_217_ = base.vertexY[i_201_] - f_208_;
						float f_218_ = base.vertexZ[i_201_] - f_209_;
						float f_219_ = base.vertexX[i_202_] - f_207_;
						float f_220_ = base.vertexY[i_202_] - f_208_;
						float f_221_ = base.vertexZ[i_202_] - f_209_;
						float f_222_ = base.vertexX[i_203_] - f_207_;
						float f_223_ = base.vertexY[i_203_] - f_208_;
						float f_224_ = base.vertexZ[i_203_] - f_209_;
						float f_225_ = f_211_ * f_215_ - f_212_ * f_214_;
						float f_226_ = f_212_ * f_213_ - f_210_ * f_215_;
						float f_227_ = f_210_ * f_214_ - f_211_ * f_213_;
						float f_228_ = f_214_ * f_227_ - f_215_ * f_226_;
						float f_229_ = f_215_ * f_225_ - f_213_ * f_227_;
						float f_230_ = f_213_ * f_226_ - f_214_ * f_225_;
						float f_231_ = 1.0F / (f_228_ * f_210_ + f_229_ * f_211_ + f_230_ * f_212_);
						f = (f_228_ * f_216_ + f_229_ * f_217_ + f_230_ * f_218_) * f_231_;
						f_187_ = (f_228_ * f_219_ + f_229_ * f_220_ + f_230_ * f_221_) * f_231_;
						f_189_ = (f_228_ * f_222_ + f_229_ * f_223_ + f_230_ * f_224_) * f_231_;
						f_228_ = f_211_ * f_227_ - f_212_ * f_226_;
						f_229_ = f_212_ * f_225_ - f_210_ * f_227_;
						f_230_ = f_210_ * f_226_ - f_211_ * f_225_;
						f_231_ = 1.0F / (f_228_ * f_213_ + f_229_ * f_214_ + f_230_ * f_215_);
						f_186_ = (f_228_ * f_216_ + f_229_ * f_217_ + f_230_ * f_218_) * f_231_;
						f_188_ = (f_228_ * f_219_ + f_229_ * f_220_ + f_230_ * f_221_) * f_231_;
						f_190_ = (f_228_ * f_222_ + f_229_ * f_223_ + f_230_ * f_224_) * f_231_;
					} else {
						short i_232_ = base.aShortArray1769[i_182_];
						short i_233_ = base.aShortArray1770[i_182_];
						short i_234_ = base.aShortArray1766[i_182_];
						int i_235_ = class135.anIntArray1575[i_193_];
						int i_236_ = class135.anIntArray1572[i_193_];
						int i_237_ = class135.anIntArray1574[i_193_];
						float[] fs = class135.aFloatArrayArray1573[i_193_];
						byte i_238_ = base.aByteArray1798[i_193_];
						float f_239_ = base.anIntArray1794[i_193_] / 256.0F;
						if (i_200_ == 1) {
							float f_240_ = base.anIntArray1760[i_193_] / 1024.0F;
							method2885(base.vertexX[i_232_], base.vertexY[i_232_], base.vertexZ[i_232_], i_235_,
									i_236_, i_237_, fs, f_240_, i_238_, f_239_, aFloatArray9226);
							f = aFloatArray9226[0];
							f_186_ = aFloatArray9226[1];
							method2885(base.vertexX[i_233_], base.vertexY[i_233_], base.vertexZ[i_233_], i_235_,
									i_236_, i_237_, fs, f_240_, i_238_, f_239_, aFloatArray9226);
							f_187_ = aFloatArray9226[0];
							f_188_ = aFloatArray9226[1];
							method2885(base.vertexX[i_234_], base.vertexY[i_234_], base.vertexZ[i_234_], i_235_,
									i_236_, i_237_, fs, f_240_, i_238_, f_239_, aFloatArray9226);
							f_189_ = aFloatArray9226[0];
							f_190_ = aFloatArray9226[1];
							float f_241_ = f_240_ / 2.0F;
							if ((i_238_ & 0x1) == 0) {
								if (f_187_ - f > f_241_) {
									f_187_ -= f_240_;
									i_198_ = 1;
								} else if (f - f_187_ > f_241_) {
									f_187_ += f_240_;
									i_198_ = 2;
								}
								if (f_189_ - f > f_241_) {
									f_189_ -= f_240_;
									i_199_ = 1;
								} else if (f - f_189_ > f_241_) {
									f_189_ += f_240_;
									i_199_ = 2;
								}
							} else {
								if (f_188_ - f_186_ > f_241_) {
									f_188_ -= f_240_;
									i_198_ = 1;
								} else if (f_186_ - f_188_ > f_241_) {
									f_188_ += f_240_;
									i_198_ = 2;
								}
								if (f_190_ - f_186_ > f_241_) {
									f_190_ -= f_240_;
									i_199_ = 1;
								} else if (f_186_ - f_190_ > f_241_) {
									f_190_ += f_240_;
									i_199_ = 2;
								}
							}
						} else if (i_200_ == 2) {
							float f_242_ = base.anIntArray1757[i_193_] / 256.0F;
							float f_243_ = base.anIntArray1796[i_193_] / 256.0F;
							int i_244_ = base.vertexX[i_233_] - base.vertexX[i_232_];
							int i_245_ = base.vertexY[i_233_] - base.vertexY[i_232_];
							int i_246_ = base.vertexZ[i_233_] - base.vertexZ[i_232_];
							int i_247_ = base.vertexX[i_234_] - base.vertexX[i_232_];
							int i_248_ = base.vertexY[i_234_] - base.vertexY[i_232_];
							int i_249_ = base.vertexZ[i_234_] - base.vertexZ[i_232_];
							int i_250_ = i_245_ * i_249_ - i_248_ * i_246_;
							int i_251_ = i_246_ * i_247_ - i_249_ * i_244_;
							int i_252_ = i_244_ * i_248_ - i_247_ * i_245_;
							float f_253_ = 64.0F / base.anIntArray1791[i_193_];
							float f_254_ = 64.0F / base.anIntArray1792[i_193_];
							float f_255_ = 64.0F / base.anIntArray1760[i_193_];
							float f_256_ = (i_250_ * fs[0] + i_251_ * fs[1] + i_252_ * fs[2]) / f_253_;
							float f_257_ = (i_250_ * fs[3] + i_251_ * fs[4] + i_252_ * fs[5]) / f_254_;
							float f_258_ = (i_250_ * fs[6] + i_251_ * fs[7] + i_252_ * fs[8]) / f_255_;
							i_197_ = method2967(f_256_, f_257_, f_258_);
							method2887(base.vertexX[i_232_], base.vertexY[i_232_], base.vertexZ[i_232_], i_235_,
									i_236_, i_237_, i_197_, fs, i_238_, f_239_, f_242_, f_243_, aFloatArray9226);
							f = aFloatArray9226[0];
							f_186_ = aFloatArray9226[1];
							method2887(base.vertexX[i_233_], base.vertexY[i_233_], base.vertexZ[i_233_], i_235_,
									i_236_, i_237_, i_197_, fs, i_238_, f_239_, f_242_, f_243_, aFloatArray9226);
							f_187_ = aFloatArray9226[0];
							f_188_ = aFloatArray9226[1];
							method2887(base.vertexX[i_234_], base.vertexY[i_234_], base.vertexZ[i_234_], i_235_,
									i_236_, i_237_, i_197_, fs, i_238_, f_239_, f_242_, f_243_, aFloatArray9226);
							f_189_ = aFloatArray9226[0];
							f_190_ = aFloatArray9226[1];
						} else if (i_200_ == 3) {
							method3010(base.vertexX[i_232_], base.vertexY[i_232_], base.vertexZ[i_232_], i_235_,
									i_236_, i_237_, fs, i_238_, f_239_, aFloatArray9226);
							f = aFloatArray9226[0];
							f_186_ = aFloatArray9226[1];
							method3010(base.vertexX[i_233_], base.vertexY[i_233_], base.vertexZ[i_233_], i_235_,
									i_236_, i_237_, fs, i_238_, f_239_, aFloatArray9226);
							f_187_ = aFloatArray9226[0];
							f_188_ = aFloatArray9226[1];
							method3010(base.vertexX[i_234_], base.vertexY[i_234_], base.vertexZ[i_234_], i_235_,
									i_236_, i_237_, fs, i_238_, f_239_, aFloatArray9226);
							f_189_ = aFloatArray9226[0];
							f_190_ = aFloatArray9226[1];
							if ((i_238_ & 0x1) == 0) {
								if (f_187_ - f > 0.5F) {
									f_187_--;
									i_198_ = 1;
								} else if (f - f_187_ > 0.5F) {
									f_187_++;
									i_198_ = 2;
								}
								if (f_189_ - f > 0.5F) {
									f_189_--;
									i_199_ = 1;
								} else if (f - f_189_ > 0.5F) {
									f_189_++;
									i_199_ = 2;
								}
							} else {
								if (f_188_ - f_186_ > 0.5F) {
									f_188_--;
									i_198_ = 1;
								} else if (f_186_ - f_188_ > 0.5F) {
									f_188_++;
									i_198_ = 2;
								}
								if (f_190_ - f_186_ > 0.5F) {
									f_190_--;
									i_199_ = 1;
								} else if (f_186_ - f_190_ > 0.5F) {
									f_190_++;
									i_199_ = 2;
								}
							}
						}
					}
					l_192_ = i_197_ << 16 | i_193_;
					l_191_ = i_198_ << 19 | l_192_;
					l = i_199_ << 19 | l_192_;
				}
			} else {
				l = 0L;
				l_191_ = 0L;
				l_192_ = 0L;
			}
			byte i_259_ = base.aByteArray1775 != null ? base.aByteArray1775[i_182_] : (byte) 0;
			if (i_259_ == 0) {
				long l_260_ = (i_183_ << 8) + i_184_;
				short i_261_ = base.aShortArray1769[i_182_];
				short i_262_ = base.aShortArray1770[i_182_];
				short i_263_ = base.aShortArray1766[i_182_];
				Class345 class345 = class345s[i_261_];
				aShortArray9188[i_181_] = method14546(base, i_261_, i_181_, l_260_ | l_192_ << 24, class345.anInt3655,
						class345.anInt3657, class345.anInt3654, class345.anInt3656, f, f_186_);
				class345 = class345s[i_262_];
				aShortArray9185[i_181_] = method14546(base, i_262_, i_181_, l_260_ | l_191_ << 24, class345.anInt3655,
						class345.anInt3657, class345.anInt3654, class345.anInt3656, f_187_, f_188_);
				class345 = class345s[i_263_];
				aShortArray9190[i_181_] = method14546(base, i_263_, i_181_, l_260_ | l << 24, class345.anInt3655,
						class345.anInt3657, class345.anInt3654, class345.anInt3656, f_189_, f_190_);
			} else if (i_259_ == 1) {
				Class307 class307 = class307s[i_182_];
				long l_264_ = ((long) (class307.anInt3316 & ~0x7fffffff) << 9)
						+ ((long) (class307.anInt3317 + 256) << 32) + ((long) (class307.anInt3318 + 256) << 24)
						+ (i_183_ << 8) + i_184_;
				aShortArray9188[i_181_] = method14546(base, base.aShortArray1769[i_182_], i_181_,
						l_264_ | l_192_ << 41, class307.anInt3316, class307.anInt3317, class307.anInt3318, 0, f, f_186_);
				aShortArray9185[i_181_] = method14546(base, base.aShortArray1770[i_182_], i_181_,
						l_264_ | l_192_ << 41, class307.anInt3316, class307.anInt3317, class307.anInt3318, 0, f_187_,
						f_188_);
				aShortArray9190[i_181_] = method14546(base, base.aShortArray1766[i_182_], i_181_,
						l_264_ | l_192_ << 41, class307.anInt3316, class307.anInt3317, class307.anInt3318, 0, f_189_,
						f_190_);
			}
			if (base.aByteArray1788 != null) {
				aByteArray9187[i_181_] = base.aByteArray1788[i_182_];
			}
			if (base.aShortArray1753 != null) {
				aShortArray9225[i_181_] = base.aShortArray1753[i_182_];
			}
			aShortArray9193[i_181_] = base.aShortArray1779[i_182_];
			aShortArray9191[i_181_] = i_185_;
		}
		if (anInt9195 > 0) {
			int i_265_ = 1;
			short i_266_ = aShortArray9191[0];
			for (int i_267_ = 0; i_267_ < anInt9195; i_267_++) {
				short i_268_ = aShortArray9191[i_267_];
				if (i_268_ != i_266_) {
					i_265_++;
					i_266_ = i_268_;
				}
			}
			anIntArray9215 = new int[i_265_];
			anIntArray9216 = new int[i_265_];
			anIntArray9214 = new int[i_265_ + 1];
			anIntArray9214[0] = 0;
			int i_269_ = uniqueVertices;
			int i_270_ = 0;
			i_265_ = 0;
			i_266_ = aShortArray9191[0];
			for (int i_271_ = 0; i_271_ < anInt9195; i_271_++) {
				short i_272_ = aShortArray9191[i_271_];
				if (i_272_ != i_266_) {
					anIntArray9215[i_265_] = i_269_;
					anIntArray9216[i_265_] = i_270_ - i_269_ + 1;
					anIntArray9214[++i_265_] = i_271_;
					i_269_ = uniqueVertices;
					i_270_ = 0;
					i_266_ = i_272_;
				}
				int i_273_ = aShortArray9188[i_271_] & 0xffff;
				if (i_273_ < i_269_) {
					i_269_ = i_273_;
				}
				if (i_273_ > i_270_) {
					i_270_ = i_273_;
				}
				i_273_ = aShortArray9185[i_271_] & 0xffff;
				if (i_273_ < i_269_) {
					i_269_ = i_273_;
				}
				if (i_273_ > i_270_) {
					i_270_ = i_273_;
				}
				i_273_ = aShortArray9190[i_271_] & 0xffff;
				if (i_273_ < i_269_) {
					i_269_ = i_273_;
				}
				if (i_273_ > i_270_) {
					i_270_ = i_273_;
				}
			}
			anIntArray9215[i_265_] = i_269_;
			anIntArray9216[i_265_] = i_270_ - i_269_ + 1;
			anIntArray9214[++i_265_] = anInt9195;
		}
		aLongArray9232 = null;
		aShortArray9175 = method14520(aShortArray9175, uniqueVertices);
		aShortArray9230 = method14520(aShortArray9230, uniqueVertices);
		aShortArray9177 = method14520(aShortArray9177, uniqueVertices);
		aShortArray9212 = method14520(aShortArray9212, uniqueVertices);
		aShortArray9179 = method14520(aShortArray9179, uniqueVertices);
		aByteArray9180 = method14558(aByteArray9180, uniqueVertices);
		aFloatArray9173 = method14552(aFloatArray9173, uniqueVertices);
		aFloatArray9182 = method14552(aFloatArray9182, uniqueVertices);
		if (base.anIntArray1763 != null && Class310.method5582(i, anInt9164)) {
			anIntArrayArray9172 = base.method3096(false);
		}
		if (base.aClass148Array1795 != null && Class310.method5583(i, anInt9164)) {
			anIntArrayArray9204 = base.method3098();
		}
		if (base.anIntArray1781 != null && Class310.method5581(i, anInt9164)) {
			int i_274_ = 0;
			int[] is_275_ = new int[256];
			for (int i_276_ = 0; i_276_ < anInt9184; i_276_++) {
				int i_277_ = base.anIntArray1781[is[i_276_]];
				if (i_277_ >= 0) {
					is_275_[i_277_]++;
					if (i_277_ > i_274_) {
						i_274_ = i_277_;
					}
				}
			}
			anIntArrayArray9209 = new int[i_274_ + 1][];
			for (int i_278_ = 0; i_278_ <= i_274_; i_278_++) {
				anIntArrayArray9209[i_278_] = new int[is_275_[i_278_]];
				is_275_[i_278_] = 0;
			}
			for (int i_279_ = 0; i_279_ < anInt9184; i_279_++) {
				int i_280_ = base.anIntArray1781[is[i_279_]];
				if (i_280_ >= 0) {
					anIntArrayArray9209[i_280_][is_275_[i_280_]++] = i_279_;
				}
			}
		}
	}

	NativeModel(NativeToolkit class134_sub3, int i, int i_766_, boolean bool, boolean bool_767_) {
		vertexCount = 0;
		uniqueVertices = 0;
		anInt9184 = 0;
		anInt9195 = 0;
		aBool9208 = false;
		aBool9200 = true;
		aBool9201 = false;
		aBool9202 = false;
		computedBounds = false;
		aBool9167 = false;
		aFloatArray9226 = new float[2];
		anIntArray9227 = new int[1];
		anIntArray9206 = new int[1];
		anIntArray9229 = new int[8];
		anIntArray9168 = new int[8];
		anIntArray9231 = new int[8];
		toolkit = class134_sub3;
		anInt9163 = i;
		anInt9164 = i_766_;
		aBool9208 = bool_767_;
		if (bool || Class310.method5565(anInt9163, anInt9164)) {
			aClass314_9217 = new Class314(Class310.method5570(anInt9163, anInt9164));
		}
		if (bool || Class310.method5568(anInt9163, anInt9164)) {
			aClass314_9198 = new Class314(Class310.method5573(anInt9163, anInt9164));
		}
		if (bool || Class310.method5626(anInt9163, anInt9164)) {
			aClass314_9196 = new Class314(Class310.method5572(anInt9163, anInt9164));
		}
		if (bool || Class310.method5574(anInt9163, anInt9164)) {
			aClass314_9219 = new Class314(Class310.method5571(anInt9163, anInt9164));
		}
		if (bool || Class310.method5630(anInt9163, anInt9164)) {
			aClass313_9194 = new Class313(Class310.method5638(anInt9163, anInt9164));
		}
		if (bool && bool_767_) {
			aClass314_9217.anInterface32_3332 = aClass314_9217.anInterface32_3334 = toolkit
					.createArrayBuffer(aBool9208);
			aClass314_9198.anInterface32_3332 = aClass314_9198.anInterface32_3334 = toolkit
					.createArrayBuffer(aBool9208);
			aClass314_9196.anInterface32_3332 = aClass314_9196.anInterface32_3334 = toolkit
					.createArrayBuffer(aBool9208);
			aClass314_9219.anInterface32_3332 = aClass314_9219.anInterface32_3334 = toolkit
					.createArrayBuffer(aBool9208);
		}
	}

	@Override
	public int method2886() {
		if (!computedBounds) {
			computeBounds();
		}
		return minimumZ;
	}

	@Override
	public Model method2890(byte i, int i_786_, boolean bool) {
		boolean bool_787_ = false;
		NativeModel class143_sub2_788_;
		NativeModel class143_sub2_789_;
		if (i > 0 && i <= 8) {
			class143_sub2_789_ = toolkit.aClass143_Sub2Array9261[i - 1];
			class143_sub2_788_ = toolkit.aClass143_Sub2Array9327[i - 1];
			bool_787_ = true;
		} else {
			class143_sub2_788_ = class143_sub2_789_ = new NativeModel(toolkit, 0, 0, true, false);
		}
		return method14519(class143_sub2_788_, class143_sub2_789_, i_786_, bool_787_, bool);
	}

	@Override
	public void updateFunctionMask(int i) {
		if (aClass314_9217 != null) {
			aClass314_9217.aBool3333 = Class310.method5570(i, anInt9164);
		}
		if (aClass314_9198 != null) {
			aClass314_9198.aBool3333 = Class310.method5573(i, anInt9164);
		}
		if (aClass314_9196 != null) {
			aClass314_9196.aBool3333 = Class310.method5572(i, anInt9164);
		}
		if (aClass314_9219 != null) {
			aClass314_9219.aBool3333 = Class310.method5571(i, anInt9164);
		}
		anInt9163 = i;
		if (aClass328_9183 != null && (anInt9163 & 0x10000) == 0) {
			aShortArray9177 = aClass328_9183.aShortArray3561;
			aShortArray9212 = aClass328_9183.aShortArray3559;
			aShortArray9179 = aClass328_9183.aShortArray3560;
			aByteArray9180 = aClass328_9183.aByteArray3558;
			aClass328_9183 = null;
		}
		aBool9200 = true;
		method14522();
	}

	@Override
	public int functionMask() {
		return anInt9163;
	}

	@Override
	public void yaw(int i) {
		int i_26_ = Class373.SINE[i];
		int i_27_ = Class373.COSINE[i];
		for (int i_28_ = 0; i_28_ < vertexCount; i_28_++) {
			int i_29_ = vertexZ[i_28_] * i_26_ + vertexX[i_28_] * i_27_ >> 14;
			vertexZ[i_28_] = vertexZ[i_28_] * i_27_ - vertexX[i_28_] * i_26_ >> 14;
			vertexX[i_28_] = i_29_;
		}
		method14523();
		computedBounds = false;
	}

	@Override
	public void method2895(int i) {
		int i_30_ = Class373.SINE[i];
		int i_31_ = Class373.COSINE[i];
		for (int i_32_ = 0; i_32_ < vertexCount; i_32_++) {
			int i_33_ = vertexZ[i_32_] * i_30_ + vertexX[i_32_] * i_31_ >> 14;
			vertexZ[i_32_] = vertexZ[i_32_] * i_31_ - vertexX[i_32_] * i_30_ >> 14;
			vertexX[i_32_] = i_33_;
		}
		for (int i_34_ = 0; i_34_ < uniqueVertices; i_34_++) {
			int i_35_ = aShortArray9179[i_34_] * i_30_ + aShortArray9177[i_34_] * i_31_ >> 14;
			aShortArray9179[i_34_] = (short) (aShortArray9179[i_34_] * i_31_ - aShortArray9177[i_34_] * i_30_ >> 14);
			aShortArray9177[i_34_] = (short) i_35_;
		}
		method14523();
		method14525();
		computedBounds = false;
	}

	@Override
	public void roll(int i) {
		int i_40_ = Class373.SINE[i];
		int i_41_ = Class373.COSINE[i];
		for (int i_42_ = 0; i_42_ < vertexCount; i_42_++) {
			int i_43_ = vertexY[i_42_] * i_40_ + vertexX[i_42_] * i_41_ >> 14;
			vertexY[i_42_] = vertexY[i_42_] * i_41_ - vertexX[i_42_] * i_40_ >> 14;
			vertexX[i_42_] = i_43_;
		}
		method14523();
		computedBounds = false;
	}

	@Override
	public void translate(int dx, int dy, int dz) {
		for (int vertex = 0; vertex < vertexCount; vertex++) {
			if (dx != 0) {
				vertexX[vertex] += dx;
			}
			if (dy != 0) {
				vertexY[vertex] += dy;
			}
			if (dz != 0) {
				vertexZ[vertex] += dz;
			}
		}

		method14523();
		computedBounds = false;
	}

	@Override
	public void method2899() {
		for (int i = 0; i < vertexCount; i++) {
			vertexZ[i] = -vertexZ[i];
		}
		for (int i = 0; i < uniqueVertices; i++) {
			aShortArray9179[i] = (short) -aShortArray9179[i];
		}
		for (int i = 0; i < anInt9184; i++) {
			short i_47_ = aShortArray9188[i];
			aShortArray9188[i] = aShortArray9190[i];
			aShortArray9190[i] = i_47_;
		}
		method14523();
		method14525();
		method14548();
		computedBounds = false;
	}

	@Override
	public void scale(int x, int y, int z) {
		for (int vertex = 0; vertex < vertexCount; vertex++) {
			if (x != 128) {
				vertexX[vertex] = vertexX[vertex] * x >> 7;
			}
			if (y != 128) {
				vertexY[vertex] = vertexY[vertex] * y >> 7;
			}
			if (z != 128) {
				vertexZ[vertex] = vertexZ[vertex] * z >> 7;
			}
		}

		method14523();
		computedBounds = false;
	}

	@Override
	public void method2901(int i, int i_114_, Ground class120, Ground class120_115_, int i_116_, int i_117_, int i_118_) {
		if (!computedBounds) {
			computeBounds();
		}
		int i_119_ = i_116_ + minimumX;
		int i_120_ = i_116_ + maximumX;
		int i_121_ = i_118_ + minimumZ;
		int i_122_ = i_118_ + maximumZ;
		if (i != 1
				&& i != 2
				&& i != 3
				&& i != 5
				|| i_119_ >= 0
				&& i_120_ + class120.tileUnits * 1668096025 >> class120.tileScale * -333236347 < class120.width * 767658255
				&& i_121_ >= 0
				&& i_122_ + class120.tileUnits * 1668096025 >> class120.tileScale * -333236347 < class120.length * 295124605) {
			if (i == 4 || i == 5) {
				if (class120_115_ == null
						|| i_119_ < 0
						|| i_120_ + class120_115_.tileUnits * 1668096025 >> class120_115_.tileScale * -333236347 >= class120_115_.width * 767658255
						|| i_121_ < 0
						|| i_122_ + class120_115_.tileUnits * 1668096025 >> class120_115_.tileScale * -333236347 >= class120_115_.length * 295124605) {
					return;
				}
			} else {
				i_119_ >>= class120.tileScale * -333236347;
				i_120_ = i_120_ + class120.tileUnits * 1668096025 - 1 >> class120.tileScale * -333236347;
				i_121_ >>= class120.tileScale * -333236347;
				i_122_ = i_122_ + class120.tileUnits * 1668096025 - 1 >> class120.tileScale * -333236347;
				if (class120.getTileHeight(i_119_, i_121_) == i_117_
						&& class120.getTileHeight(i_120_, i_121_) == i_117_
						&& class120.getTileHeight(i_119_, i_122_) == i_117_
						&& class120.getTileHeight(i_120_, i_122_) == i_117_) {
					return;
				}
			}
			if (i == 1) {
				for (int i_123_ = 0; i_123_ < vertexCount; i_123_++) {
					vertexY[i_123_] = vertexY[i_123_]
							+ class120.method2206(vertexX[i_123_] + i_116_, vertexZ[i_123_] + i_118_, -353898470)
							- i_117_;
				}
			} else if (i == 2) {
				int i_124_ = minimumY;
				if (i_124_ == 0) {
					return;
				}
				for (int i_125_ = 0; i_125_ < vertexCount; i_125_++) {
					int i_126_ = (vertexY[i_125_] << 16) / i_124_;
					if (i_126_ < i_114_) {
						vertexY[i_125_] = vertexY[i_125_]
								+ (class120.method2206(vertexX[i_125_] + i_116_, vertexZ[i_125_] + i_118_, -215056335) - i_117_)
								* (i_114_ - i_126_) / i_114_;
					}
				}
			} else if (i == 3) {
				int i_127_ = (i_114_ & 0xff) * 4;
				int i_128_ = (i_114_ >> 8 & 0xff) * 4;
				int i_129_ = (i_114_ >> 16 & 0xff) << 6;
				int i_130_ = (i_114_ >> 24 & 0xff) << 6;
				if (i_116_ - (i_127_ >> 1) < 0
						|| i_116_ + (i_127_ >> 1) + class120.tileUnits * 1668096025 >= class120.width * 767658255 << class120.tileScale
								* -333236347
						|| i_118_ - (i_128_ >> 1) < 0
						|| i_118_ + (i_128_ >> 1) + class120.tileUnits * 1668096025 >= class120.length * 295124605 << class120.tileScale
								* -333236347) {
					return;
				}
				method2902(class120, i_116_, i_117_, i_118_, i_127_, i_128_, i_129_, i_130_);
			} else if (i == 4) {
				int i_131_ = maximumY - minimumY;
				for (int i_132_ = 0; i_132_ < vertexCount; i_132_++) {
					vertexY[i_132_] = vertexY[i_132_]
							+ class120_115_.method2206(vertexX[i_132_] + i_116_, vertexZ[i_132_] + i_118_, 167285040)
							- i_117_ + i_131_;
				}
			} else if (i == 5) {
				int i_133_ = maximumY - minimumY;
				for (int i_134_ = 0; i_134_ < vertexCount; i_134_++) {
					int i_135_ = vertexX[i_134_] + i_116_;
					int i_136_ = vertexZ[i_134_] + i_118_;
					int i_137_ = class120.method2206(i_135_, i_136_, -759189583);
					int i_138_ = class120_115_.method2206(i_135_, i_136_, -1092552245);
					int i_139_ = i_137_ - i_138_ - i_114_;
					vertexY[i_134_] = ((vertexY[i_134_] << 8) / i_133_ * i_139_ >> 8) - (i_117_ - i_137_);
				}
			}
			method14523();
			computedBounds = false;
		}
	}

	@Override
	public void transform(Class405 class405, int i, boolean bool) {
		if (aShortArray9178 != null) {
			Class405 class405_801_ = class405;
			if (bool) {
				class405_801_ = toolkit.aClass405_9287;
				class405_801_.method6725(class405);
			}
			float[] fs = new float[3];
			for (int i_802_ = 0; i_802_ < vertexCount; i_802_++) {
				if ((i & aShortArray9178[i_802_]) != 0) {
					class405_801_.method6793(vertexX[i_802_], vertexY[i_802_], vertexZ[i_802_], fs);
					vertexX[i_802_] = (int) fs[0];
					vertexY[i_802_] = (int) fs[1];
					vertexZ[i_802_] = (int) fs[2];
				}
			}
		}
	}

	@Override
	public void method2917(Class405 class405, Class139 class139, int i) {
		if (class139 != null) {
			class139.aBool1581 = false;
		}
		if (uniqueVertices != 0) {
			Matrix4f class399 = toolkit.aClass399_9418;
			Matrix4f class399_647_ = toolkit.aClass399_9324;
			Matrix4f class399_648_ = toolkit.aClass399_9289;
			class399_647_.method6548(class405);
			class399_648_.copyFrom(class399_647_);
			class399_648_.method6547(toolkit.aClass399_9302);
			if (!computedBounds) {
				computeBounds();
			}
			float[] fs = toolkit.aFloatArray9288;
			class399_647_.method6553(0.0F, minimumY, 0.0F, fs);
			float f = fs[0];
			float f_649_ = fs[1];
			float f_650_ = fs[2];
			class399_647_.method6553(0.0F, maximumY, 0.0F, fs);
			float f_651_ = fs[0];
			float f_652_ = fs[1];
			float f_653_ = fs[2];
			for (int i_654_ = 0; i_654_ < 6; i_654_++) {
				float[] fs_655_ = toolkit.aFloatArrayArray9402[i_654_];
				float f_656_ = fs_655_[0] * f + fs_655_[1] * f_649_ + fs_655_[2] * f_650_ + fs_655_[3] + anInt9171;
				float f_657_ = fs_655_[0] * f_651_ + fs_655_[1] * f_652_ + fs_655_[2] * f_653_ + fs_655_[3] + anInt9171;
				if (f_656_ < 0.0F && f_657_ < 0.0F) {
					return;
				}
			}
			if (class139 != null) {
				boolean bool = false;
				boolean bool_658_ = true;
				int i_659_ = minimumX + maximumX >> 1;
				int i_660_ = minimumZ + maximumZ >> 1;
				int i_661_ = i_659_;
				int i_662_ = minimumY;
				int i_663_ = i_660_;
				float f_664_ = class399_648_.array[0] * i_661_ + class399_648_.array[4] * i_662_
						+ class399_648_.array[8] * i_663_ + class399_648_.array[12];
				float f_665_ = class399_648_.array[1] * i_661_ + class399_648_.array[5] * i_662_
						+ class399_648_.array[9] * i_663_ + class399_648_.array[13];
				float f_666_ = class399_648_.array[2] * i_661_ + class399_648_.array[6] * i_662_
						+ class399_648_.array[10] * i_663_ + class399_648_.array[14];
				float f_667_ = class399_648_.array[3] * i_661_ + class399_648_.array[7] * i_662_
						+ class399_648_.array[11] * i_663_ + class399_648_.array[15];
				if (f_666_ >= -f_667_) {
					class139.anInt1580 = (int) (toolkit.aFloat9403 + toolkit.aFloat9364 * f_664_ / f_667_);
					class139.anInt1582 = (int) (toolkit.aFloat9343 + toolkit.aFloat9308 * f_665_ / f_667_);
				} else {
					bool = true;
				}
				i_661_ = i_659_;
				i_662_ = maximumY;
				i_663_ = i_660_;
				float f_668_ = class399_648_.array[0] * i_661_ + class399_648_.array[4] * i_662_
						+ class399_648_.array[8] * i_663_ + class399_648_.array[12];
				float f_669_ = class399_648_.array[1] * i_661_ + class399_648_.array[5] * i_662_
						+ class399_648_.array[9] * i_663_ + class399_648_.array[13];
				float f_670_ = class399_648_.array[2] * i_661_ + class399_648_.array[6] * i_662_
						+ class399_648_.array[10] * i_663_ + class399_648_.array[14];
				float f_671_ = class399_648_.array[3] * i_661_ + class399_648_.array[7] * i_662_
						+ class399_648_.array[11] * i_663_ + class399_648_.array[15];
				if (f_670_ >= -f_671_) {
					class139.anInt1583 = (int) (toolkit.aFloat9403 + toolkit.aFloat9364 * f_668_ / f_671_);
					class139.anInt1584 = (int) (toolkit.aFloat9343 + toolkit.aFloat9308 * f_669_ / f_671_);
				} else {
					bool = true;
				}
				if (bool) {
					if (f_666_ < -f_667_ && f_670_ < -f_671_) {
						bool_658_ = false;
					} else if (f_666_ < -f_667_) {
						float f_672_ = (f_666_ + f_667_) / (f_670_ + f_671_) - 1.0F;
						float f_673_ = f_664_ + f_672_ * (f_668_ - f_664_);
						float f_674_ = f_665_ + f_672_ * (f_669_ - f_665_);
						float f_675_ = f_667_ + f_672_ * (f_671_ - f_667_);
						class139.anInt1580 = (int) (toolkit.aFloat9403 + toolkit.aFloat9364 * f_673_ / f_675_);
						class139.anInt1582 = (int) (toolkit.aFloat9343 + toolkit.aFloat9308 * f_674_ / f_675_);
					} else if (f_670_ < -f_671_) {
						float f_676_ = (f_670_ + f_671_) / (f_666_ + f_667_) - 1.0F;
						float f_677_ = f_668_ + f_676_ * (f_664_ - f_668_);
						float f_678_ = f_669_ + f_676_ * (f_665_ - f_669_);
						float f_679_ = f_671_ + f_676_ * (f_667_ - f_671_);
						class139.anInt1583 = (int) (toolkit.aFloat9403 + toolkit.aFloat9364 * f_677_ / f_679_);
						class139.anInt1584 = (int) (toolkit.aFloat9343 + toolkit.aFloat9308 * f_678_ / f_679_);
					}
				}
				if (bool_658_) {
					if (f_666_ / f_667_ > f_670_ / f_671_) {
						float f_680_ = f_664_ + class399.array[0] * anInt9171 + class399.array[12];
						float f_681_ = f_667_ + class399.array[3] * anInt9171 + class399.array[15];
						class139.anInt1585 = (int) (toolkit.aFloat9403 - class139.anInt1580 + toolkit.aFloat9364
								* f_680_ / f_681_);
					} else {
						float f_682_ = f_668_ + class399.array[0] * anInt9171 + class399.array[12];
						float f_683_ = f_671_ + class399.array[3] * anInt9171 + class399.array[15];
						class139.anInt1585 = (int) (toolkit.aFloat9403 - class139.anInt1583 + toolkit.aFloat9364
								* f_682_ / f_683_);
					}
					class139.aBool1581 = true;
				}
			}
			toolkit.method14660(i);
			method14534(class405);
			toolkit.method14660(0);
			class399_647_.method6548(class405);
			class399_647_.method6547(toolkit.aClass399_9281);
			method14571(class399_647_);
		}
	}

	@Override
	public boolean method2918(int i, int i_581_, Class405 class405, boolean bool, int i_582_) {
		return method14530(i, i_581_, 0, 0, class405, bool, i_582_);
	}

	@Override
	public int method2920() {
		if (!computedBounds) {
			computeBounds();
		}
		return anInt9171;
	}

	@Override
	public int method2923() {
		if (!computedBounds) {
			computeBounds();
		}
		return maximumX;
	}

	@Override
	public void retexture(short original, short i_768_) {
		TextureMetricsList class147 = toolkit.metricsList;
		for (int i_769_ = 0; i_769_ < anInt9184; i_769_++) {
			if (aShortArray9191[i_769_] == original) {
				aShortArray9191[i_769_] = i_768_;
			}
		}
		byte i_770_ = 0;
		byte i_771_ = 0;
		if (original != -1) {
			TextureMetrics class141 = class147.get(original & 0xffff);
			i_770_ = class141.alpha;
			i_771_ = class141.colourOffset;
		}
		byte i_772_ = 0;
		byte i_773_ = 0;
		if (i_768_ != -1) {
			TextureMetrics class141 = class147.get(i_768_ & 0xffff);
			i_772_ = class141.alpha;
			i_773_ = class141.colourOffset;
			if (class141.aByte1728 != 0 || class141.aByte1700 != 0) {
				aBool9202 = true;
			}
		}
		if (i_770_ != i_772_ | i_771_ != i_773_) {
			if (aClass324Array9222 != null) {
				for (int i_774_ = 0; i_774_ < anInt9221; i_774_++) {
					Class324 class324 = aClass324Array9222[i_774_];
					Class305 class305 = aClass305Array9197[i_774_];
					class305.anInt3310 = class305.anInt3310 & ~0xffffff
							| Class598.HSL_TABLE[aShortArray9193[class324.anInt3429] & 0xffff] & 0xffffff;
				}
			}
			method14524();
		}
	}

	@Override
	public int method2928() {
		if (!aBool9167) {
			method2962();
		}
		return anInt9213;
	}

	@Override
	public void method2929(int i) {
		aShort9223 = (short) i;
		method14524();
	}

	@Override
	public int method2931() {
		if (!computedBounds) {
			computeBounds();
		}
		return maximumY;
	}

	@Override
	public int method2932() {
		return aShort9166;
	}

	@Override
	public byte[] method2933() {
		return aByteArray9187;
	}

	@Override
	public void method2935(byte i, byte[] is) {
		if (is == null) {
			for (int i_111_ = 0; i_111_ < anInt9184; i_111_++) {
				aByteArray9187[i_111_] = i;
			}
		} else {
			for (int i_112_ = 0; i_112_ < anInt9184; i_112_++) {
				int i_113_ = 255 - (255 - (is[i_112_] & 0xff)) * (255 - (i & 0xff)) / 255;
				aByteArray9187[i_112_] = (byte) i_113_;
			}
		}
		method14524();
	}

	@Override
	public void method2937(int i, int i_757_, int i_758_, int i_759_) {
		for (int i_760_ = 0; i_760_ < anInt9184; i_760_++) {
			int i_761_ = aShortArray9193[i_760_] & 0xffff;
			int i_762_ = i_761_ >> 10 & 0x3f;
			int i_763_ = i_761_ >> 7 & 0x7;
			int i_764_ = i_761_ & 0x7f;
			if (i != -1) {
				i_762_ += (i - i_762_) * i_759_ >> 7;
			}
			if (i_757_ != -1) {
				i_763_ += (i_757_ - i_763_) * i_759_ >> 7;
			}
			if (i_758_ != -1) {
				i_764_ += (i_758_ - i_764_) * i_759_ >> 7;
			}
			aShortArray9193[i_760_] = (short) (i_762_ << 10 | i_763_ << 7 | i_764_);
		}
		if (aClass324Array9222 != null) {
			for (int i_765_ = 0; i_765_ < anInt9221; i_765_++) {
				Class324 class324 = aClass324Array9222[i_765_];
				Class305 class305 = aClass305Array9197[i_765_];
				class305.anInt3310 = class305.anInt3310 & ~0xffffff
						| Class598.HSL_TABLE[aShortArray9193[class324.anInt3429] & 0xffff] & 0xffffff;
			}
		}
		method14524();
	}

	@Override
	public boolean method2938() {
		if (aShortArray9191 == null) {
			return true;
		}
		for (int i = 0; i < aShortArray9191.length; i++) {
			if (aShortArray9191[i] != -1
					&& !toolkit.aClass321_9360.loaded(toolkit.metricsList.get(aShortArray9191[i]), -1)) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean method2939() {
		return aBool9201;
	}

	@Override
	public boolean method2940() {
		return aBool9202;
	}

	@Override
	public Class145[] method2942() {
		return aClass145Array9161;
	}

	@Override
	public Class115[] method2943() {
		return aClass115Array9220;
	}

	@Override
	public void method2944(Model class143, int i, int i_63_, int i_64_, boolean bool) {
		NativeModel class143_sub2_65_ = (NativeModel) class143;
		if (anInt9184 != 0 && class143_sub2_65_.anInt9184 != 0) {
			int i_66_ = class143_sub2_65_.vertexCount;
			int[] is = class143_sub2_65_.vertexX;
			int[] is_67_ = class143_sub2_65_.vertexY;
			int[] is_68_ = class143_sub2_65_.vertexZ;
			short[] is_69_ = class143_sub2_65_.aShortArray9177;
			short[] is_70_ = class143_sub2_65_.aShortArray9212;
			short[] is_71_ = class143_sub2_65_.aShortArray9179;
			byte[] is_72_ = class143_sub2_65_.aByteArray9180;
			short[] is_73_;
			short[] is_74_;
			short[] is_75_;
			byte[] is_76_;
			if (aClass328_9183 != null) {
				is_73_ = aClass328_9183.aShortArray3561;
				is_74_ = aClass328_9183.aShortArray3559;
				is_75_ = aClass328_9183.aShortArray3560;
				is_76_ = aClass328_9183.aByteArray3558;
			} else {
				is_73_ = null;
				is_74_ = null;
				is_75_ = null;
				is_76_ = null;
			}
			short[] is_77_;
			short[] is_78_;
			short[] is_79_;
			byte[] is_80_;
			if (class143_sub2_65_.aClass328_9183 != null) {
				is_77_ = class143_sub2_65_.aClass328_9183.aShortArray3561;
				is_78_ = class143_sub2_65_.aClass328_9183.aShortArray3559;
				is_79_ = class143_sub2_65_.aClass328_9183.aShortArray3560;
				is_80_ = class143_sub2_65_.aClass328_9183.aByteArray3558;
			} else {
				is_77_ = null;
				is_78_ = null;
				is_79_ = null;
				is_80_ = null;
			}
			int[] is_81_ = class143_sub2_65_.anIntArray9186;
			short[] is_82_ = class143_sub2_65_.aShortArray9218;
			if (!class143_sub2_65_.computedBounds) {
				class143_sub2_65_.computeBounds();
			}
			int i_83_ = class143_sub2_65_.minimumY;
			int i_84_ = class143_sub2_65_.maximumY;
			int i_85_ = class143_sub2_65_.minimumX;
			int i_86_ = class143_sub2_65_.maximumX;
			int i_87_ = class143_sub2_65_.minimumZ;
			int i_88_ = class143_sub2_65_.maximumZ;
			for (int i_89_ = 0; i_89_ < vertexCount; i_89_++) {
				int i_90_ = vertexY[i_89_] - i_63_;
				if (i_90_ >= i_83_ && i_90_ <= i_84_) {
					int i_91_ = vertexX[i_89_] - i;
					if (i_91_ >= i_85_ && i_91_ <= i_86_) {
						int i_92_ = vertexZ[i_89_] - i_64_;
						if (i_92_ >= i_87_ && i_92_ <= i_88_) {
							int i_93_ = -1;
							int i_94_ = anIntArray9186[i_89_];
							int i_95_ = anIntArray9186[i_89_ + 1];
							for (int i_96_ = i_94_; i_96_ < i_95_ && aShortArray9218[i_96_] != 0; i_96_++) {
								i_93_ = (aShortArray9218[i_96_] & 0xffff) - 1;
								if (aByteArray9180[i_93_] != 0) {
									break;
								}
							}
							if (i_93_ != -1) {
								for (int i_97_ = 0; i_97_ < i_66_; i_97_++) {
									if (i_91_ == is[i_97_] && i_92_ == is_68_[i_97_] && i_90_ == is_67_[i_97_]) {
										int i_98_ = -1;
										i_94_ = is_81_[i_97_];
										i_95_ = is_81_[i_97_ + 1];
										for (int i_99_ = i_94_; i_99_ < i_95_ && is_82_[i_99_] != 0; i_99_++) {
											i_98_ = is_82_[i_99_] - 1 & 0xffff;
											if (is_72_[i_98_] != 0) {
												break;
											}
										}
										if (i_98_ != -1) {
											if (is_73_ == null) {
												aClass328_9183 = new Class328();
												is_73_ = aClass328_9183.aShortArray3561 = CursorDefinition
														.copy(aShortArray9177);
												is_74_ = aClass328_9183.aShortArray3559 = CursorDefinition
														.copy(aShortArray9212);
												is_75_ = aClass328_9183.aShortArray3560 = CursorDefinition
														.copy(aShortArray9179);
												is_76_ = aClass328_9183.aByteArray3558 = Class193.copy(aByteArray9180);
											}
											if (is_77_ == null) {
												Class328 class328 = class143_sub2_65_.aClass328_9183 = new Class328();
												is_77_ = class328.aShortArray3561 = CursorDefinition.copy(is_69_);
												is_78_ = class328.aShortArray3559 = CursorDefinition.copy(is_70_);
												is_79_ = class328.aShortArray3560 = CursorDefinition.copy(is_71_);
												is_80_ = class328.aByteArray3558 = Class193.copy(is_72_);
											}
											short i_100_ = aShortArray9177[i_93_];
											short i_101_ = aShortArray9212[i_93_];
											short i_102_ = aShortArray9179[i_93_];
											byte i_103_ = aByteArray9180[i_93_];
											i_94_ = is_81_[i_97_];
											i_95_ = is_81_[i_97_ + 1];
											for (int i_104_ = i_94_; i_104_ < i_95_; i_104_++) {
												int i_105_ = is_82_[i_104_] - 1;
												if (i_105_ == -1) {
													break;
												}
												if (is_80_[i_105_] != 0) {
													is_77_[i_105_] += i_100_;
													is_78_[i_105_] += i_101_;
													is_79_[i_105_] += i_102_;
													is_80_[i_105_] += i_103_;
												}
											}
											i_100_ = is_69_[i_98_];
											i_101_ = is_70_[i_98_];
											i_102_ = is_71_[i_98_];
											i_103_ = is_72_[i_98_];
											i_94_ = anIntArray9186[i_89_];
											i_95_ = anIntArray9186[i_89_ + 1];
											for (int i_106_ = i_94_; i_106_ < i_95_ && aShortArray9218[i_106_] != 0; i_106_++) {
												int i_107_ = (aShortArray9218[i_106_] & 0xffff) - 1;
												if (is_76_[i_107_] != 0) {
													is_73_[i_107_] += i_100_;
													is_74_[i_107_] += i_101_;
													is_75_[i_107_] += i_102_;
													is_76_[i_107_] += i_103_;
												}
											}
											class143_sub2_65_.method14525();
											method14525();
										}
									}
								}
							}
						}
					}
				}
			}
		}
	}

	@Override
	public void method2962() {
		if (!aBool9167) {
			if (!computedBounds) {
				computeBounds();
			}
			anInt9213 = minimumY;
			aBool9167 = true;
		}
	}

	@Override
	public int method2971() {
		return aShort9223;
	}

	@Override
	public void method2974(int i) {
		aShort9166 = (short) i;
		method14523();
		method14525();
	}

	@Override
	public int minimumX() {
		if (!computedBounds) {
			computeBounds();
		}
		return minimumX;
	}

	@Override
	public void recolour(short original, short i_108_) {
		for (int i_109_ = 0; i_109_ < anInt9184; i_109_++) {
			if (aShortArray9193[i_109_] == original) {
				aShortArray9193[i_109_] = i_108_;
			}
		}
		if (aClass324Array9222 != null) {
			for (int i_110_ = 0; i_110_ < anInt9221; i_110_++) {
				Class324 class324 = aClass324Array9222[i_110_];
				Class305 class305 = aClass305Array9197[i_110_];
				class305.anInt3310 = class305.anInt3310 & ~0xffffff
						| Class598.HSL_TABLE[aShortArray9193[class324.anInt3429] & 0xffff] & 0xffffff;
			}
		}
		method14524();
	}

	@Override
	public int method3016() {
		if (!computedBounds) {
			computeBounds();
		}
		return anInt9224;
	}

	@Override
	public Shadow method3018(Shadow shad) {
		if (uniqueVertices == 0) {
			return null;
		} else if (!computedBounds) {
			computeBounds();
		}

		int minX;
		int maxX;

		if (toolkit.sunProjectionX > 0) {
			minX = minimumX - (maximumY * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale;
			maxX = maximumX - (minimumY * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale;
		} else {
			minX = minimumX - (minimumY * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale;
			maxX = maximumX - (maximumY * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale;
		}

		int minZ;
		int maxZ;

		if (toolkit.sunProjectionZ > 0) {
			minZ = minimumZ - (maximumY * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale;
			maxZ = maximumZ - (minimumY * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale;
		} else {
			minZ = minimumZ - (minimumY * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale;
			maxZ = maximumZ - (maximumY * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale;
		}

		int dx = maxX - minX + 1;
		int dz = maxZ - minZ + 1;

		NativeShadow shadow = (NativeShadow) shad;
		NativeShadow copy;

		if (shadow != null && shadow.containsRegion(dx, dz)) {
			copy = shadow;
			copy.clear();
		} else {
			copy = new NativeShadow(toolkit, dx, dz);
		}

		copy.setBounds(minX, minZ, maxX, maxZ);
		fillShadow(copy);
		return copy;
	}

	@Override
	public int maximumZ() {
		if (!computedBounds) {
			computeBounds();
		}

		return maximumZ;
	}

	@Override
	public void method3045() {
		if (uniqueVertices > 0 && anInt9195 > 0) {
			method14536();
			method14535();
			method14522();
		}
	}

	@Override
	public void pitch(int angle) {
		int i_36_ = Class373.SINE[angle];
		int i_37_ = Class373.COSINE[angle];
		for (int i_38_ = 0; i_38_ < vertexCount; i_38_++) {
			int i_39_ = vertexY[i_38_] * i_37_ - vertexZ[i_38_] * i_36_ >> 14;
			vertexZ[i_38_] = vertexY[i_38_] * i_36_ + vertexZ[i_38_] * i_37_ >> 14;
			vertexY[i_38_] = i_39_;
		}
		method14523();
		computedBounds = false;
	}

	@Override
	public void method3063(Class405 class405) {
		Matrix4f class399 = toolkit.aClass399_9324;
		class399.method6548(class405);
		if (aClass145Array9161 != null) {
			for (Class145 class145 : aClass145Array9161) {
				Class145 class145_579_ = class145;
				if (class145.aClass145_1803 != null) {
					class145_579_ = class145.aClass145_1803;
				}
				class145_579_.anInt1809 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class145.anInt1805 * 1662200367] + class399.array[4]
						* vertexY[class145.anInt1805 * 1662200367] + class399.array[8]
						* vertexZ[class145.anInt1805 * 1662200367]))
						* -324129411;
				class145_579_.anInt1816 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class145.anInt1805 * 1662200367] + class399.array[5]
						* vertexY[class145.anInt1805 * 1662200367] + class399.array[9]
						* vertexZ[class145.anInt1805 * 1662200367]))
						* -1194099427;
				class145_579_.anInt1811 = (int) (class399.array[14] + (class399.array[2]
						* vertexX[class145.anInt1805 * 1662200367] + class399.array[6]
						* vertexY[class145.anInt1805 * 1662200367] + class399.array[10]
						* vertexZ[class145.anInt1805 * 1662200367])) * 1082189991;
				class145_579_.anInt1810 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class145.anInt1802 * -1204023687] + class399.array[4]
						* vertexY[class145.anInt1802 * -1204023687] + class399.array[8]
						* vertexZ[class145.anInt1802 * -1204023687]))
						* -1558281385;
				class145_579_.anInt1813 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class145.anInt1802 * -1204023687] + class399.array[5]
						* vertexY[class145.anInt1802 * -1204023687] + class399.array[9]
						* vertexZ[class145.anInt1802 * -1204023687]))
						* -465338573;
				class145_579_.anInt1814 = (int) (class399.array[14] + (class399.array[2]
						* vertexX[class145.anInt1802 * -1204023687] + class399.array[6]
						* vertexY[class145.anInt1802 * -1204023687] + class399.array[10]
						* vertexZ[class145.anInt1802 * -1204023687]))
						* -170225769;
				class145_579_.anInt1815 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class145.anInt1806 * -1333709795] + class399.array[4]
						* vertexY[class145.anInt1806 * -1333709795] + class399.array[8]
						* vertexZ[class145.anInt1806 * -1333709795])) * 714262933;
				class145_579_.anInt1808 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class145.anInt1806 * -1333709795] + class399.array[5]
						* vertexY[class145.anInt1806 * -1333709795] + class399.array[9]
						* vertexZ[class145.anInt1806 * -1333709795])) * 847013515;
				class145_579_.anInt1817 = (int) (class399.array[14] + (class399.array[2]
						* vertexX[class145.anInt1806 * -1333709795] + class399.array[6]
						* vertexY[class145.anInt1806 * -1333709795] + class399.array[10]
						* vertexZ[class145.anInt1806 * -1333709795])) * 1666826233;
			}
		}
		if (aClass115Array9220 != null) {
			for (Class115 element : aClass115Array9220) {
				Class115 class115 = element;
				Class115 class115_580_ = class115;
				if (class115.aClass115_1441 != null) {
					class115_580_ = class115.aClass115_1441;
				}
				if (class115.aClass399_1443 != null) {
					class115.aClass399_1443.copyFrom(class399);
				} else {
					class115.aClass399_1443 = new Matrix4f(class399);
				}
				class115_580_.anInt1438 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class115.anInt1439 * 1047194323] + class399.array[4]
						* vertexY[class115.anInt1439 * 1047194323] + class399.array[8]
						* vertexZ[class115.anInt1439 * 1047194323]))
						* -2111105049;
				class115_580_.anInt1440 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class115.anInt1439 * 1047194323] + class399.array[5]
						* vertexY[class115.anInt1439 * 1047194323] + class399.array[9]
						* vertexZ[class115.anInt1439 * 1047194323])) * 1144355343;
				class115_580_.anInt1442 = (int) (class399.array[14] + (class399.array[2]
						* vertexX[class115.anInt1439 * 1047194323] + class399.array[6]
						* vertexY[class115.anInt1439 * 1047194323] + class399.array[10]
						* vertexZ[class115.anInt1439 * 1047194323]))
						* -767839935;
			}
		}
	}

	@Override
	public int minimumY() {
		if (!computedBounds) {
			computeBounds();
		}
		return minimumY;
	}

	Model method14519(NativeModel class143_sub2_0_, NativeModel class143_sub2_1_, int i, boolean bool, boolean bool_2_) {
		class143_sub2_0_.anInt9163 = i;
		class143_sub2_0_.anInt9164 = anInt9164;
		class143_sub2_0_.aShort9223 = aShort9223;
		class143_sub2_0_.aShort9166 = aShort9166;
		class143_sub2_0_.anInt9165 = anInt9165;
		class143_sub2_0_.vertexCount = vertexCount;
		class143_sub2_0_.uniqueVertices = uniqueVertices;
		class143_sub2_0_.anInt9184 = anInt9184;
		class143_sub2_0_.anInt9195 = anInt9195;
		class143_sub2_0_.anInt9221 = anInt9221;
		if ((i & 0x100) != 0) {
			class143_sub2_0_.aBool9201 = true;
		} else {
			class143_sub2_0_.aBool9201 = aBool9201;
		}
		class143_sub2_0_.aBool9202 = aBool9202;
		boolean bool_3_ = Class310.method5596(i, anInt9164);
		boolean bool_4_ = Class310.method5554(i, anInt9164);
		boolean bool_5_ = Class310.method5580(i, anInt9164);
		boolean bool_6_ = bool_3_ | bool_4_ | bool_5_;
		if (bool_6_) {
			if (bool_3_) {
				if (class143_sub2_1_.vertexX == null || class143_sub2_1_.vertexX.length < anInt9165) {
					class143_sub2_0_.vertexX = class143_sub2_1_.vertexX = new int[anInt9165];
				} else {
					class143_sub2_0_.vertexX = class143_sub2_1_.vertexX;
				}
			} else {
				class143_sub2_0_.vertexX = vertexX;
			}
			if (bool_4_) {
				if (class143_sub2_1_.vertexY == null || class143_sub2_1_.vertexY.length < anInt9165) {
					class143_sub2_0_.vertexY = class143_sub2_1_.vertexY = new int[anInt9165];
				} else {
					class143_sub2_0_.vertexY = class143_sub2_1_.vertexY;
				}
			} else {
				class143_sub2_0_.vertexY = vertexY;
			}
			if (bool_5_) {
				if (class143_sub2_1_.vertexZ == null || class143_sub2_1_.vertexZ.length < anInt9165) {
					class143_sub2_0_.vertexZ = class143_sub2_1_.vertexZ = new int[anInt9165];
				} else {
					class143_sub2_0_.vertexZ = class143_sub2_1_.vertexZ;
				}
			} else {
				class143_sub2_0_.vertexZ = vertexZ;
			}
			for (int i_7_ = 0; i_7_ < anInt9165; i_7_++) {
				if (bool_3_) {
					class143_sub2_0_.vertexX[i_7_] = vertexX[i_7_];
				}
				if (bool_4_) {
					class143_sub2_0_.vertexY[i_7_] = vertexY[i_7_];
				}
				if (bool_5_) {
					class143_sub2_0_.vertexZ[i_7_] = vertexZ[i_7_];
				}
			}
		} else {
			class143_sub2_0_.vertexX = vertexX;
			class143_sub2_0_.vertexY = vertexY;
			class143_sub2_0_.vertexZ = vertexZ;
		}
		if (Class310.method5570(i, anInt9164)) {
			class143_sub2_0_.aClass314_9217 = class143_sub2_1_.aClass314_9217;
			class143_sub2_0_.aClass314_9217.anInterface32_3334 = aClass314_9217.anInterface32_3334;
			class143_sub2_0_.aClass314_9217.aBool3335 = aClass314_9217.aBool3335;
			class143_sub2_0_.aClass314_9217.aBool3333 = true;
		} else if (Class310.method5565(i, anInt9164)) {
			class143_sub2_0_.aClass314_9217 = aClass314_9217;
		} else {
			class143_sub2_0_.aClass314_9217 = null;
		}
		if (Class310.method5558(i, anInt9164)) {
			if (class143_sub2_1_.aShortArray9193 == null || class143_sub2_1_.aShortArray9193.length < anInt9184) {
				class143_sub2_0_.aShortArray9193 = class143_sub2_1_.aShortArray9193 = new short[anInt9184];
			} else {
				class143_sub2_0_.aShortArray9193 = class143_sub2_1_.aShortArray9193;
			}
			for (int i_8_ = 0; i_8_ < anInt9184; i_8_++) {
				class143_sub2_0_.aShortArray9193[i_8_] = aShortArray9193[i_8_];
			}
		} else {
			class143_sub2_0_.aShortArray9193 = aShortArray9193;
		}
		if (Class310.method5553(i, anInt9164)) {
			if (class143_sub2_1_.aByteArray9187 == null || class143_sub2_1_.aByteArray9187.length < anInt9184) {
				class143_sub2_0_.aByteArray9187 = class143_sub2_1_.aByteArray9187 = new byte[anInt9184];
			} else {
				class143_sub2_0_.aByteArray9187 = class143_sub2_1_.aByteArray9187;
			}
			for (int i_9_ = 0; i_9_ < anInt9184; i_9_++) {
				class143_sub2_0_.aByteArray9187[i_9_] = aByteArray9187[i_9_];
			}
		} else {
			class143_sub2_0_.aByteArray9187 = aByteArray9187;
		}
		if (Class310.method5572(i, anInt9164)) {
			class143_sub2_0_.aClass314_9196 = class143_sub2_1_.aClass314_9196;
			class143_sub2_0_.aClass314_9196.anInterface32_3334 = aClass314_9196.anInterface32_3334;
			class143_sub2_0_.aClass314_9196.aBool3335 = aClass314_9196.aBool3335;
			class143_sub2_0_.aClass314_9196.aBool3333 = true;
		} else if (Class310.method5626(i, anInt9164)) {
			class143_sub2_0_.aClass314_9196 = aClass314_9196;
		} else {
			class143_sub2_0_.aClass314_9196 = null;
		}
		if (Class310.method5557(i, anInt9164)) {
			if (class143_sub2_1_.aShortArray9177 == null || class143_sub2_1_.aShortArray9177.length < uniqueVertices) {
				int i_10_ = uniqueVertices;
				class143_sub2_0_.aShortArray9177 = class143_sub2_1_.aShortArray9177 = new short[i_10_];
				class143_sub2_0_.aShortArray9212 = class143_sub2_1_.aShortArray9212 = new short[i_10_];
				class143_sub2_0_.aShortArray9179 = class143_sub2_1_.aShortArray9179 = new short[i_10_];
			} else {
				class143_sub2_0_.aShortArray9177 = class143_sub2_1_.aShortArray9177;
				class143_sub2_0_.aShortArray9212 = class143_sub2_1_.aShortArray9212;
				class143_sub2_0_.aShortArray9179 = class143_sub2_1_.aShortArray9179;
			}
			if (aClass328_9183 != null) {
				if (class143_sub2_1_.aClass328_9183 == null) {
					class143_sub2_1_.aClass328_9183 = new Class328();
				}
				Class328 class328 = class143_sub2_0_.aClass328_9183 = class143_sub2_1_.aClass328_9183;
				if (class328.aShortArray3561 == null || class328.aShortArray3561.length < uniqueVertices) {
					int i_11_ = uniqueVertices;
					class328.aShortArray3561 = new short[i_11_];
					class328.aShortArray3559 = new short[i_11_];
					class328.aShortArray3560 = new short[i_11_];
					class328.aByteArray3558 = new byte[i_11_];
				}
				for (int i_12_ = 0; i_12_ < uniqueVertices; i_12_++) {
					class143_sub2_0_.aShortArray9177[i_12_] = aShortArray9177[i_12_];
					class143_sub2_0_.aShortArray9212[i_12_] = aShortArray9212[i_12_];
					class143_sub2_0_.aShortArray9179[i_12_] = aShortArray9179[i_12_];
					class328.aShortArray3561[i_12_] = aClass328_9183.aShortArray3561[i_12_];
					class328.aShortArray3559[i_12_] = aClass328_9183.aShortArray3559[i_12_];
					class328.aShortArray3560[i_12_] = aClass328_9183.aShortArray3560[i_12_];
					class328.aByteArray3558[i_12_] = aClass328_9183.aByteArray3558[i_12_];
				}
			} else {
				class143_sub2_0_.aClass328_9183 = null;
				for (int i_13_ = 0; i_13_ < uniqueVertices; i_13_++) {
					class143_sub2_0_.aShortArray9177[i_13_] = aShortArray9177[i_13_];
					class143_sub2_0_.aShortArray9212[i_13_] = aShortArray9212[i_13_];
					class143_sub2_0_.aShortArray9179[i_13_] = aShortArray9179[i_13_];
				}
			}
			class143_sub2_0_.aByteArray9180 = aByteArray9180;
		} else {
			class143_sub2_0_.aClass328_9183 = aClass328_9183;
			class143_sub2_0_.aShortArray9177 = aShortArray9177;
			class143_sub2_0_.aShortArray9212 = aShortArray9212;
			class143_sub2_0_.aShortArray9179 = aShortArray9179;
			class143_sub2_0_.aByteArray9180 = aByteArray9180;
		}
		if (Class310.method5571(i, anInt9164)) {
			class143_sub2_0_.aClass314_9219 = class143_sub2_1_.aClass314_9219;
			class143_sub2_0_.aClass314_9219.anInterface32_3334 = aClass314_9219.anInterface32_3334;
			class143_sub2_0_.aClass314_9219.aBool3335 = aClass314_9219.aBool3335;
			class143_sub2_0_.aClass314_9219.aBool3333 = true;
		} else if (Class310.method5574(i, anInt9164)) {
			class143_sub2_0_.aClass314_9219 = aClass314_9219;
		} else {
			class143_sub2_0_.aClass314_9219 = null;
		}
		if (Class310.method5552(i, anInt9164)) {
			if (class143_sub2_1_.aFloatArray9173 == null || class143_sub2_1_.aFloatArray9173.length < anInt9184) {
				int i_14_ = uniqueVertices;
				class143_sub2_0_.aFloatArray9173 = class143_sub2_1_.aFloatArray9173 = new float[i_14_];
				class143_sub2_0_.aFloatArray9182 = class143_sub2_1_.aFloatArray9182 = new float[i_14_];
			} else {
				class143_sub2_0_.aFloatArray9173 = class143_sub2_1_.aFloatArray9173;
				class143_sub2_0_.aFloatArray9182 = class143_sub2_1_.aFloatArray9182;
			}
			for (int i_15_ = 0; i_15_ < uniqueVertices; i_15_++) {
				class143_sub2_0_.aFloatArray9173[i_15_] = aFloatArray9173[i_15_];
				class143_sub2_0_.aFloatArray9182[i_15_] = aFloatArray9182[i_15_];
			}
		} else {
			class143_sub2_0_.aFloatArray9173 = aFloatArray9173;
			class143_sub2_0_.aFloatArray9182 = aFloatArray9182;
		}
		if (Class310.method5573(i, anInt9164)) {
			class143_sub2_0_.aClass314_9198 = class143_sub2_1_.aClass314_9198;
			class143_sub2_0_.aClass314_9198.anInterface32_3334 = aClass314_9198.anInterface32_3334;
			class143_sub2_0_.aClass314_9198.aBool3335 = aClass314_9198.aBool3335;
			class143_sub2_0_.aClass314_9198.aBool3333 = true;
		} else if (Class310.method5568(i, anInt9164)) {
			class143_sub2_0_.aClass314_9198 = aClass314_9198;
		} else {
			class143_sub2_0_.aClass314_9198 = null;
		}
		if (Class310.method5561(i, anInt9164)) {
			if (class143_sub2_1_.aShortArray9188 == null || class143_sub2_1_.aShortArray9188.length < anInt9184) {
				int i_16_ = anInt9184;
				class143_sub2_0_.aShortArray9188 = class143_sub2_1_.aShortArray9188 = new short[i_16_];
				class143_sub2_0_.aShortArray9185 = class143_sub2_1_.aShortArray9185 = new short[i_16_];
				class143_sub2_0_.aShortArray9190 = class143_sub2_1_.aShortArray9190 = new short[i_16_];
			} else {
				class143_sub2_0_.aShortArray9188 = class143_sub2_1_.aShortArray9188;
				class143_sub2_0_.aShortArray9185 = class143_sub2_1_.aShortArray9185;
				class143_sub2_0_.aShortArray9190 = class143_sub2_1_.aShortArray9190;
			}
			for (int i_17_ = 0; i_17_ < anInt9184; i_17_++) {
				class143_sub2_0_.aShortArray9188[i_17_] = aShortArray9188[i_17_];
				class143_sub2_0_.aShortArray9185[i_17_] = aShortArray9185[i_17_];
				class143_sub2_0_.aShortArray9190[i_17_] = aShortArray9190[i_17_];
			}
		} else {
			class143_sub2_0_.aShortArray9188 = aShortArray9188;
			class143_sub2_0_.aShortArray9185 = aShortArray9185;
			class143_sub2_0_.aShortArray9190 = aShortArray9190;
		}
		if (Class310.method5638(i, anInt9164)) {
			class143_sub2_0_.aClass313_9194 = class143_sub2_1_.aClass313_9194;
			class143_sub2_0_.aClass313_9194.anInterface36_3329 = aClass313_9194.anInterface36_3329;
			class143_sub2_0_.aClass313_9194.aBool3330 = aClass313_9194.aBool3330;
			class143_sub2_0_.aClass313_9194.aBool3328 = true;
		} else if (Class310.method5630(i, anInt9164)) {
			class143_sub2_0_.aClass313_9194 = aClass313_9194;
		} else {
			class143_sub2_0_.aClass313_9194 = null;
		}
		if (Class310.method5562(i, anInt9164)) {
			if (class143_sub2_1_.aShortArray9191 == null || class143_sub2_1_.aShortArray9191.length < anInt9184) {
				int i_18_ = anInt9184;
				class143_sub2_0_.aShortArray9191 = class143_sub2_1_.aShortArray9191 = new short[i_18_];
			} else {
				class143_sub2_0_.aShortArray9191 = class143_sub2_1_.aShortArray9191;
			}
			for (int i_19_ = 0; i_19_ < anInt9184; i_19_++) {
				class143_sub2_0_.aShortArray9191[i_19_] = aShortArray9191[i_19_];
			}
		} else {
			class143_sub2_0_.aShortArray9191 = aShortArray9191;
		}
		if (Class310.method5617(i, anInt9164)) {
			if (class143_sub2_1_.aClass305Array9197 == null || class143_sub2_1_.aClass305Array9197.length < anInt9221) {
				int i_20_ = anInt9221;
				class143_sub2_0_.aClass305Array9197 = class143_sub2_1_.aClass305Array9197 = new Class305[i_20_];
				for (int i_21_ = 0; i_21_ < anInt9221; i_21_++) {
					class143_sub2_0_.aClass305Array9197[i_21_] = aClass305Array9197[i_21_].copy();
				}
			} else {
				class143_sub2_0_.aClass305Array9197 = class143_sub2_1_.aClass305Array9197;
				for (int i_22_ = 0; i_22_ < anInt9221; i_22_++) {
					class143_sub2_0_.aClass305Array9197[i_22_].copyFrom(aClass305Array9197[i_22_]);
				}
			}
		} else {
			class143_sub2_0_.aClass305Array9197 = aClass305Array9197;
		}
		class143_sub2_0_.aClass324Array9222 = aClass324Array9222;
		if (computedBounds) {
			class143_sub2_0_.anInt9224 = anInt9224;
			class143_sub2_0_.anInt9171 = anInt9171;
			class143_sub2_0_.minimumX = minimumX;
			class143_sub2_0_.maximumX = maximumX;
			class143_sub2_0_.minimumY = minimumY;
			class143_sub2_0_.maximumY = maximumY;
			class143_sub2_0_.minimumZ = minimumZ;
			class143_sub2_0_.maximumZ = maximumZ;
			class143_sub2_0_.computedBounds = true;
		} else {
			class143_sub2_0_.computedBounds = false;
		}
		if (aBool9167) {
			class143_sub2_0_.anInt9213 = anInt9213;
			class143_sub2_0_.aBool9167 = true;
		} else {
			class143_sub2_0_.aBool9167 = false;
		}
		class143_sub2_0_.anIntArrayArray9172 = anIntArrayArray9172;
		class143_sub2_0_.anIntArrayArray9209 = anIntArrayArray9209;
		class143_sub2_0_.anIntArrayArray9204 = anIntArrayArray9204;
		class143_sub2_0_.aShortArray9218 = aShortArray9218;
		class143_sub2_0_.anIntArray9186 = anIntArray9186;
		class143_sub2_0_.aShortArray9175 = aShortArray9175;
		class143_sub2_0_.aShortArray9230 = aShortArray9230;
		class143_sub2_0_.aShortArray9178 = aShortArray9178;
		class143_sub2_0_.aShortArray9225 = aShortArray9225;
		class143_sub2_0_.anIntArray9214 = anIntArray9214;
		class143_sub2_0_.anIntArray9216 = anIntArray9216;
		class143_sub2_0_.anIntArray9215 = anIntArray9215;
		class143_sub2_0_.aClass145Array9161 = aClass145Array9161;
		class143_sub2_0_.aClass115Array9220 = aClass115Array9220;
		return class143_sub2_0_;
	}

	void method14522() {
		if (aBool9200) {
			aBool9200 = false;
			if (aClass145Array9161 == null && aClass115Array9220 == null && aClass324Array9222 == null
					&& !Class310.method5604(anInt9163, anInt9164)) {
				boolean bool = false;
				boolean bool_24_ = false;
				boolean bool_25_ = false;
				if (vertexX != null && !Class310.method5575(anInt9163, anInt9164)) {
					if (aClass314_9217 == null || aClass314_9217.method5663()) {
						if (!computedBounds) {
							computeBounds();
						}
						bool = true;
					} else {
						aBool9200 = true;
					}
				}
				if (vertexY != null && !Class310.method5576(anInt9163, anInt9164)) {
					if (aClass314_9217 == null || aClass314_9217.method5663()) {
						if (!computedBounds) {
							computeBounds();
						}
						bool_24_ = true;
					} else {
						aBool9200 = true;
					}
				}
				if (vertexZ != null && !Class310.method5577(anInt9163, anInt9164)) {
					if (aClass314_9217 == null || aClass314_9217.method5663()) {
						if (!computedBounds) {
							computeBounds();
						}
						bool_25_ = true;
					} else {
						aBool9200 = true;
					}
				}
				if (bool) {
					vertexX = null;
				}
				if (bool_24_) {
					vertexY = null;
				}
				if (bool_25_) {
					vertexZ = null;
				}
			}
			if (aShortArray9218 != null && vertexX == null && vertexY == null && vertexZ == null) {
				aShortArray9218 = null;
				anIntArray9186 = null;
			}
			while_35_: do {
				if (aByteArray9180 != null && !Class310.method5578(anInt9163, anInt9164)) {
					do {
						if ((anInt9164 & 0x37) != 0) {
							if (aClass314_9219 != null && !aClass314_9219.method5663()) {
								break;
							}
						} else if (aClass314_9196 != null && !aClass314_9196.method5663()) {
							break;
						}
						aShortArray9179 = null;
						aShortArray9212 = null;
						aShortArray9177 = null;
						aByteArray9180 = null;
						break while_35_;
					} while (false);
					aBool9200 = true;
				}
			} while (false);
			if (aShortArray9193 != null && !Class310.method5569(anInt9163, anInt9164)) {
				if (aClass314_9196 == null || aClass314_9196.method5663()) {
					aShortArray9193 = null;
				} else {
					aBool9200 = true;
				}
			}
			if (aByteArray9187 != null && !Class310.method5579(anInt9163, anInt9164)) {
				if (aClass314_9196 == null || aClass314_9196.method5663()) {
					aByteArray9187 = null;
				} else {
					aBool9200 = true;
				}
			}
			if (aFloatArray9173 != null && !Class310.method5622(anInt9163, anInt9164)) {
				if (aClass314_9198 == null || aClass314_9198.method5663()) {
					aFloatArray9182 = null;
					aFloatArray9173 = null;
				} else {
					aBool9200 = true;
				}
			}
			if (aShortArray9191 != null && !Class310.method5585(anInt9163, anInt9164)) {
				if (aClass314_9196 == null || aClass314_9196.method5663()) {
					aShortArray9191 = null;
				} else {
					aBool9200 = true;
				}
			}
			if (aShortArray9188 != null && !Class310.method5584(anInt9163, anInt9164)) {
				if ((aClass313_9194 == null || aClass313_9194.method5659())
						&& (aClass314_9196 == null || aClass314_9196.method5663())) {
					aShortArray9190 = null;
					aShortArray9185 = null;
					aShortArray9188 = null;
				} else {
					aBool9200 = true;
				}
			}
			if (aShortArray9175 != null) {
				if (aClass314_9217 == null || aClass314_9217.method5663()) {
					aShortArray9175 = null;
				} else {
					aBool9200 = true;
				}
			}
			if (aShortArray9230 != null) {
				if (aClass314_9196 == null || aClass314_9196.method5663()) {
					aShortArray9230 = null;
				} else {
					aBool9200 = true;
				}
			}
			if (anIntArrayArray9209 != null && !Class310.method5581(anInt9163, anInt9164)) {
				anIntArrayArray9209 = null;
				aShortArray9225 = null;
			}
			if (anIntArrayArray9172 != null && !Class310.method5582(anInt9163, anInt9164)) {
				anIntArrayArray9172 = null;
				aShortArray9178 = null;
			}
			if (anIntArrayArray9204 != null && !Class310.method5583(anInt9163, anInt9164)) {
				anIntArrayArray9204 = null;
			}
			if (anIntArray9214 != null && (anInt9163 & 0x800) == 0 && (anInt9163 & 0x40000) == 0) {
				anIntArray9214 = null;
				anIntArray9216 = null;
				anIntArray9215 = null;
			}
		}
	}

	void method14523() {
		if (aClass314_9217 != null) {
			aClass314_9217.aBool3335 = false;
		}
	}

	void method14524() {
		if (aClass314_9196 != null) {
			aClass314_9196.aBool3335 = false;
		}
	}

	void method14525() {
		if ((anInt9164 & 0x37) != 0) {
			if (aClass314_9219 != null) {
				aClass314_9219.aBool3335 = false;
			}
		} else if (aClass314_9196 != null) {
			aClass314_9196.aBool3335 = false;
		}
	}

	void computeBounds() {
		int i = 32767;
		int i_51_ = 32767;
		int i_52_ = 32767;
		int i_53_ = -32768;
		int i_54_ = -32768;
		int i_55_ = -32768;
		int i_56_ = 0;
		int i_57_ = 0;
		for (int i_58_ = 0; i_58_ < vertexCount; i_58_++) {
			int i_59_ = vertexX[i_58_];
			int i_60_ = vertexY[i_58_];
			int i_61_ = vertexZ[i_58_];
			if (i_59_ < i) {
				i = i_59_;
			}
			if (i_59_ > i_53_) {
				i_53_ = i_59_;
			}
			if (i_60_ < i_51_) {
				i_51_ = i_60_;
			}
			if (i_60_ > i_54_) {
				i_54_ = i_60_;
			}
			if (i_61_ < i_52_) {
				i_52_ = i_61_;
			}
			if (i_61_ > i_55_) {
				i_55_ = i_61_;
			}
			int i_62_ = i_59_ * i_59_ + i_61_ * i_61_;
			if (i_62_ > i_56_) {
				i_56_ = i_62_;
			}
			i_62_ = i_59_ * i_59_ + i_61_ * i_61_ + i_60_ * i_60_;
			if (i_62_ > i_57_) {
				i_57_ = i_62_;
			}
		}
		minimumX = i;
		maximumX = i_53_;
		minimumY = i_51_;
		maximumY = i_54_;
		minimumZ = i_52_;
		maximumZ = i_55_;
		anInt9171 = (int) (Math.sqrt(i_56_) + 0.99);
		anInt9224 = (int) (Math.sqrt(i_57_) + 0.99);
		computedBounds = true;
	}

	boolean method14530(int i, int i_583_, int i_584_, int i_585_, Class405 class405, boolean bool, int i_586_) {
		Matrix4f class399 = toolkit.aClass399_9324;
		class399.method6548(class405);
		class399.method6547(toolkit.aClass399_9302);
		boolean bool_587_ = false;
		float f = 3.4028235E38F;
		float f_588_ = -3.4028235E38F;
		float f_589_ = 3.4028235E38F;
		float f_590_ = -3.4028235E38F;
		if (!computedBounds) {
			computeBounds();
		}
		int i_591_ = maximumX - minimumX >> 1;
		int i_592_ = maximumY - minimumY >> 1;
		int i_593_ = maximumZ - minimumZ >> 1;
		int i_594_ = minimumX + i_591_;
		int i_595_ = minimumY + i_592_;
		int i_596_ = minimumZ + i_593_;
		int i_597_ = i_594_ - (i_591_ << i_586_);
		int i_598_ = i_595_ - (i_592_ << i_586_);
		int i_599_ = i_596_ - (i_593_ << i_586_);
		int i_600_ = i_594_ + (i_591_ << i_586_);
		int i_601_ = i_595_ + (i_592_ << i_586_);
		int i_602_ = i_596_ + (i_593_ << i_586_);
		anIntArray9229[0] = i_597_;
		anIntArray9168[0] = i_598_;
		anIntArray9231[0] = i_599_;
		anIntArray9229[1] = i_600_;
		anIntArray9168[1] = i_598_;
		anIntArray9231[1] = i_599_;
		anIntArray9229[2] = i_597_;
		anIntArray9168[2] = i_601_;
		anIntArray9231[2] = i_599_;
		anIntArray9229[3] = i_600_;
		anIntArray9168[3] = i_601_;
		anIntArray9231[3] = i_599_;
		anIntArray9229[4] = i_597_;
		anIntArray9168[4] = i_598_;
		anIntArray9231[4] = i_602_;
		anIntArray9229[5] = i_600_;
		anIntArray9168[5] = i_598_;
		anIntArray9231[5] = i_602_;
		anIntArray9229[6] = i_597_;
		anIntArray9168[6] = i_601_;
		anIntArray9231[6] = i_602_;
		anIntArray9229[7] = i_600_;
		anIntArray9168[7] = i_601_;
		anIntArray9231[7] = i_602_;
		for (int i_603_ = 0; i_603_ < 8; i_603_++) {
			float f_604_ = anIntArray9229[i_603_];
			float f_605_ = anIntArray9168[i_603_];
			float f_606_ = anIntArray9231[i_603_];
			float f_607_ = class399.array[2] * f_604_ + class399.array[6] * f_605_ + class399.array[10] * f_606_
					+ class399.array[14];
			float f_608_ = class399.array[3] * f_604_ + class399.array[7] * f_605_ + class399.array[11] * f_606_
					+ class399.array[15];
			if (f_607_ >= -f_608_) {
				float f_609_ = class399.array[0] * f_604_ + class399.array[4] * f_605_ + class399.array[8] * f_606_
						+ class399.array[12];
				float f_610_ = class399.array[1] * f_604_ + class399.array[5] * f_605_ + class399.array[9] * f_606_
						+ class399.array[13];
				float f_611_ = toolkit.aFloat9403 + toolkit.aFloat9364 * f_609_ / f_608_;
				float f_612_ = toolkit.aFloat9343 + toolkit.aFloat9308 * f_610_ / f_608_;
				if (f_611_ < f) {
					f = f_611_;
				}
				if (f_611_ > f_588_) {
					f_588_ = f_611_;
				}
				if (f_612_ < f_589_) {
					f_589_ = f_612_;
				}
				if (f_612_ > f_590_) {
					f_590_ = f_612_;
				}
				bool_587_ = true;
			}
		}
		int i_613_ = i + i_584_;
		int i_614_ = i_583_ + i_585_;
		if (bool_587_ && i_613_ > f && i < f_588_ && i_614_ > f_589_ && i_583_ < f_590_) {
			if (bool) {
				return true;
			}
			if (anIntArray9227.length < uniqueVertices) {
				anIntArray9227 = new int[uniqueVertices];
				anIntArray9206 = new int[uniqueVertices];
			}
			for (int i_615_ = 0; i_615_ < vertexCount; i_615_++) {
				float f_616_ = vertexX[i_615_];
				float f_617_ = vertexY[i_615_];
				float f_618_ = vertexZ[i_615_];
				float f_619_ = class399.array[2] * f_616_ + class399.array[6] * f_617_ + class399.array[10] * f_618_
						+ class399.array[14];
				float f_620_ = class399.array[3] * f_616_ + class399.array[7] * f_617_ + class399.array[11] * f_618_
						+ class399.array[15];
				if (f_619_ >= -f_620_) {
					float f_621_ = class399.array[0] * f_616_ + class399.array[4] * f_617_ + class399.array[8] * f_618_
							+ class399.array[12];
					float f_622_ = class399.array[1] * f_616_ + class399.array[5] * f_617_ + class399.array[9] * f_618_
							+ class399.array[13];
					int i_623_ = anIntArray9186[i_615_];
					int i_624_ = anIntArray9186[i_615_ + 1];
					for (int i_625_ = i_623_; i_625_ < i_624_ && aShortArray9218[i_625_] != 0; i_625_++) {
						int i_626_ = (aShortArray9218[i_625_] & 0xffff) - 1;
						anIntArray9227[i_626_] = (int) (toolkit.aFloat9403 + toolkit.aFloat9364 * f_621_ / f_620_);
						anIntArray9206[i_626_] = (int) (toolkit.aFloat9343 + toolkit.aFloat9308 * f_622_ / f_620_);
					}
				} else {
					int i_627_ = anIntArray9186[i_615_];
					int i_628_ = anIntArray9186[i_615_ + 1];
					for (int i_629_ = i_627_; i_629_ < i_628_ && aShortArray9218[i_629_] != 0; i_629_++) {
						int i_630_ = (aShortArray9218[i_629_] & 0xffff) - 1;
						anIntArray9227[i_630_] = -999999;
					}
				}
			}
			for (int i_631_ = 0; i_631_ < anInt9184; i_631_++) {
				if (anIntArray9227[aShortArray9188[i_631_] & 0xffff] != -999999
						&& anIntArray9227[aShortArray9185[i_631_] & 0xffff] != -999999
						&& anIntArray9227[aShortArray9190[i_631_] & 0xffff] != -999999
						&& method14559(i, i_583_, i_613_, i_614_, anIntArray9206[aShortArray9188[i_631_] & 0xffff],
								anIntArray9206[aShortArray9185[i_631_] & 0xffff],
								anIntArray9206[aShortArray9190[i_631_] & 0xffff],
								anIntArray9227[aShortArray9188[i_631_] & 0xffff],
								anIntArray9227[aShortArray9185[i_631_] & 0xffff],
								anIntArray9227[aShortArray9190[i_631_] & 0xffff])) {
					return true;
				}
			}
		}
		return false;
	}

	void fillShadow(NativeShadow class480_sub31_sub12_sub1) {
		if (anIntArray9227.length < uniqueVertices) {
			anIntArray9227 = new int[uniqueVertices];
			anIntArray9206 = new int[uniqueVertices];
		}
		for (int i = 0; i < vertexCount; i++) {
			int i_632_ = (vertexX[i] - (vertexY[i] * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale)
					- class480_sub31_sub12_sub1.x;
			int i_633_ = (vertexZ[i] - (vertexY[i] * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale)
					- class480_sub31_sub12_sub1.y;
			int i_634_ = anIntArray9186[i];
			int i_635_ = anIntArray9186[i + 1];
			for (int i_636_ = i_634_; i_636_ < i_635_ && aShortArray9218[i_636_] != 0; i_636_++) {
				int i_637_ = (aShortArray9218[i_636_] & 0xffff) - 1;
				anIntArray9227[i_637_] = i_632_;
				anIntArray9206[i_637_] = i_633_;
			}
		}
		for (int i = 0; i < anInt9195; i++) {
			if (aByteArray9187 == null || aByteArray9187[i] <= 128) {
				int i_638_ = aShortArray9188[i] & 0xffff;
				int i_639_ = aShortArray9185[i] & 0xffff;
				int i_640_ = aShortArray9190[i] & 0xffff;
				int i_641_ = anIntArray9227[i_638_];
				int i_642_ = anIntArray9227[i_639_];
				int i_643_ = anIntArray9227[i_640_];
				int i_644_ = anIntArray9206[i_638_];
				int i_645_ = anIntArray9206[i_639_];
				int i_646_ = anIntArray9206[i_640_];
				if ((i_641_ - i_642_) * (i_645_ - i_646_) - (i_645_ - i_644_) * (i_643_ - i_642_) > 0) {
					class480_sub31_sub12_sub1.fill(i_644_, i_645_, i_646_, i_641_, i_642_, i_643_);
				}
			}
		}
	}

	void method14534(Class405 class405) {
		if (anInt9195 != 0 && method14536() && method14535()) {
			toolkit.method14710();
			toolkit.method14653();
			Class259 class259 = toolkit.aClass259_9334;
			toolkit.method14620(0, aClass314_9217.anInterface32_3334);
			toolkit.method14620(1, aClass314_9196.anInterface32_3334);
			toolkit.method14620(2, aClass314_9198.anInterface32_3334);
			toolkit.method14748(aClass313_9194.anInterface36_3329);
			toolkit.aClass399_9324.method6548(class405);
			class259.method4789(toolkit.aClass399_9324);
			class259.aClass399_2865.toIdentity();
			if (toolkit.aBool9349) {
				Class150 class150 = toolkit.method14775();
				class259.aClass375_2869.set(0.0F, 1.0F, 0.0F, -toolkit.anInt9385);
				class259.aClass375_2869.multiply(3.0F / (class150.scale * -329760297));
				class259.aClass397_2872.set((class150.colour * 2139661437 >> 16 & 0xff) / 255.0F,
						(class150.colour * 2139661437 >> 8 & 0xff) / 255.0F,
						(class150.colour * 2139661437 >> 0 & 0xff) / 255.0F);
			} else {
				class259.aClass375_2869.set(0.0F, 0.0F, 0.0F, 0.0F);
				class259.aClass397_2872.set(0.0F, 0.0F, 0.0F);
			}
			if (toolkit.anInt9390 > 0) {
				class259.aClass375_2871.set(0.0F, 0.0F, 1.0F, -toolkit.aFloat9392);
				class259.aClass397_2875.set((toolkit.anInt9293 >> 16 & 0xff) / 255.0F,
						(toolkit.anInt9293 >> 8 & 0xff) / 255.0F, (toolkit.anInt9293 >> 0 & 0xff) / 255.0F);
				toolkit.aClass399_9324.method6548(class405);
				toolkit.aClass399_9324.method6569();
				class259.aClass375_2869.method6163(toolkit.aClass399_9324);
				toolkit.aClass399_9324.method6548(class405);
				toolkit.aClass399_9324.method6547(toolkit.aClass399_9281);
				toolkit.aClass399_9324.method6569();
				class259.aClass375_2871.method6163(toolkit.aClass399_9324);
				class259.aClass375_2871.multiply(1.0F / (toolkit.aFloat9393 - toolkit.aFloat9392));
			} else {
				class259.aClass375_2871.set(0.0F, 0.0F, 0.0F, 0.0F);
				class259.aClass397_2875.set(0.0F, 0.0F, 0.0F);
			}
			if ((anInt9164 & 0x37) == 0) {
				toolkit.method14697(toolkit.aClass323_9421);
				if (toolkit.fixedFunction) {
					toolkit.method14619(false);
				}
				for (int i = 0; i < anIntArray9215.length; i++) {
					int i_684_ = anIntArray9214[i];
					int i_685_ = anIntArray9214[i + 1];
					int i_686_ = aShortArray9191[i_684_];
					boolean bool = false;
					byte i_687_ = 0;
					if (i_686_ != -1) {
						TextureMetrics class141 = toolkit.metricsList.get(i_686_ & 0xffff);
						class259.anInterface29_2863 = toolkit.aClass321_9360.get(class141);
						bool = !Class279.method5212(class141.aByte1719);
						class259.aClass399_2865.array[12] = toolkit.anInt9401 % 128000 / 1000.0F * class141.aByte1728
								/ 64.0F % 1.0F;
						class259.aClass399_2865.array[13] = toolkit.anInt9401 % 128000 / 1000.0F * class141.aByte1700
								/ 64.0F % 1.0F;
						if (class141.aClass554_1727 == Class554.aClass554_7501) {
							i_687_ = class141.aByte1711;
						}
					} else {
						class259.anInterface29_2863 = toolkit.anInterface29_9361;
						float[] fs = class259.aClass399_2865.array;
						class259.aClass399_2865.array[13] = 0.0F;
						fs[12] = 0.0F;
					}
					toolkit.method14685(i_687_);
					class259.anInt2880 = anIntArray9215[i];
					class259.anInt2879 = anIntArray9216[i];
					class259.anInt2878 = i_684_ * 3;
					class259.anInt2877 = i_685_ - i_684_;
					class259.method4775(bool);
				}
			} else {
				toolkit.method14620(3, aClass314_9219.anInterface32_3334);
				toolkit.method14697(toolkit.aClass323_9375);
				Class405 class405_688_ = toolkit.aClass405_9287;
				class405_688_.copyFrom(class405);
				class405_688_.method6735();
				int i = 0;
				if (toolkit.fixedFunction) {
					toolkit.method14619(true);
				} else {
					class259.aClass397_2859.set(toolkit.aFloatArray9298[0], toolkit.aFloatArray9298[1],
							toolkit.aFloatArray9298[2]);
					class259.aClass397_2859.method6466(class405_688_);
					class259.aClass397_2874.set(toolkit.aFloat9344 * toolkit.aFloat9340, toolkit.aFloat9344
							* toolkit.aFloat9321, toolkit.aFloat9344 * toolkit.aFloat9320);
					class259.aClass397_2873.set(-toolkit.aFloat9345 * toolkit.aFloat9340, -toolkit.aFloat9345
							* toolkit.aFloat9321, -toolkit.aFloat9345 * toolkit.aFloat9320);
					class259.aClass397_2870.set(toolkit.aFloat9331 * toolkit.aFloat9340, toolkit.aFloat9331
							* toolkit.aFloat9321, toolkit.aFloat9331 * toolkit.aFloat9320);
					if (toolkit.anInt9347 > 0) {
						i = toolkit.anInt9347;
						Class397 class397 = toolkit.aClass397_9290;
						for (int i_689_ = 0; i_689_ < i; i_689_++) {
							PointLight class480_sub23 = toolkit.aClass480_Sub23Array9346[i_689_];
							int i_690_ = class480_sub23.getColour();
							class397.copyFrom(class480_sub23.position);
							class397.method6465(class405_688_);
							class259.aFloatArray2862[i_689_ * 4 + 0] = class397.x;
							class259.aFloatArray2862[i_689_ * 4 + 1] = class397.y;
							class259.aFloatArray2862[i_689_ * 4 + 2] = class397.z;
							class259.aFloatArray2862[i_689_ * 4 + 3] = 1.0F / (class480_sub23.getRange() * class480_sub23
									.getRange());
							float f = class480_sub23.getIntensity() / 255.0F;
							class259.aFloatArray2861[i_689_ * 4 + 0] = (i_690_ >> 16 & 0xff) * f;
							class259.aFloatArray2861[i_689_ * 4 + 1] = (i_690_ >> 8 & 0xff) * f;
							class259.aFloatArray2861[i_689_ * 4 + 2] = (i_690_ & 0xff) * f;
							class259.aFloatArray2861[i_689_ * 4 + 3] = 1.0F;
						}
					}
				}
				for (int i_691_ = 0; i_691_ < anIntArray9215.length; i_691_++) {
					int i_692_ = anIntArray9214[i_691_];
					int i_693_ = anIntArray9214[i_691_ + 1];
					int i_694_ = aShortArray9191[i_692_];
					byte i_695_ = 11;
					TextureMetrics class141 = null;
					byte i_696_ = 0;
					if (i_694_ != -1) {
						class141 = toolkit.metricsList.get(i_694_ & 0xffff);
						class259.anInterface29_2863 = toolkit.aClass321_9360.get(class141);
						i_695_ = class141.aByte1719;
						class259.method4773(class141.aByte1720);
						class259.aClass399_2865.array[12] = toolkit.anInt9401 % 128000 / 1000.0F * class141.aByte1728
								/ 64.0F % 1.0F;
						class259.aClass399_2865.array[13] = toolkit.anInt9401 % 128000 / 1000.0F * class141.aByte1700
								/ 64.0F % 1.0F;
						if (class141.aClass554_1727 == Class554.aClass554_7501) {
							i_696_ = class141.aByte1711;
						}
					} else {
						class259.anInterface29_2863 = toolkit.anInterface29_9361;
						float[] fs = class259.aClass399_2865.array;
						class259.aClass399_2865.array[13] = 0.0F;
						fs[12] = 0.0F;
					}
					toolkit.method14685(i_696_);
					class259.anInt2880 = anIntArray9215[i_691_];
					class259.anInt2879 = anIntArray9216[i_691_];
					class259.anInt2878 = i_692_ * 3;
					class259.anInt2877 = i_693_ - i_692_;
					switch (i_695_) {
						default:
							class259.method4776(i);
							break;
						case 5:
							if (!toolkit.fixedFunction) {
								Class302_Sub1_Sub2 class302_sub1_sub2 = toolkit.aClass302_Sub1_Sub2_9306;
								class302_sub1_sub2.method17512(class141.aByte1720, class141.anInt1721 * -1583207725,
										1876823625);
								class302_sub1_sub2.aClass399_11142.method6548(class405);
								class302_sub1_sub2.aClass399_11147.method6548(class405);
								class302_sub1_sub2.aClass399_11147.method6547(toolkit.aClass399_9303);
								class302_sub1_sub2.anInt11146 = anIntArray9215[i_691_] * 486244793;
								class302_sub1_sub2.anInt11149 = anIntArray9216[i_691_] * 857342953;
								class302_sub1_sub2.anInt11150 = i_692_ * -924091811;
								class302_sub1_sub2.anInt11134 = (i_693_ - i_692_) * 1210660121;
								class302_sub1_sub2.method17513(1538832840);
							} else {
								class259.method4776(i);
							}
							break;
						case 7:
							class259.aClass397_2876.set(toolkit.aClass399_9323.array[12],
									toolkit.aClass399_9323.array[13], toolkit.aClass399_9323.array[14]);
							class259.aClass397_2876.method6465(class405_688_);
							class259.aClass399_2881.method6548(class405);
							class259.anInterface39_2864 = toolkit.method14587();
							class259.method4788(i);
							break;
						case 1:
							class259.aClass397_2876.set(toolkit.aClass399_9323.array[12],
									toolkit.aClass399_9323.array[13], toolkit.aClass399_9323.array[14]);
							class259.aClass397_2876.method6465(class405_688_);
							class259.method4777(i);
							break;
						case 6:
							class259.method4775(!Class279.method5212(i_695_));
					}
				}
			}
			method14522();
		}
	}

	boolean method14535() {
		if (aClass313_9194.aBool3330) {
			return true;
		}
		if (aClass313_9194.anInterface36_3331 == null) {
			aClass313_9194.anInterface36_3331 = toolkit.createElementArrayBuffer(false);
		}
		NativeElementArrayBuffer interface36 = aClass313_9194.anInterface36_3331;
		interface36.allocate(anInt9195 * 6);
		Unsafe unsafe = toolkit.unsafe;
		if (unsafe != null) {
			int i = anInt9195 * 6;
			long l = interface36.lock(0, i);
			if (l == 0L) {
				return false;
			}
			for (int i_697_ = 0; i_697_ < anInt9195; i_697_++) {
				unsafe.putShort(l, aShortArray9188[i_697_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9185[i_697_]);
				l += 2L;
				unsafe.putShort(l, aShortArray9190[i_697_]);
				l += 2L;
			}
			interface36.unmap();
			aClass313_9194.anInterface36_3329 = interface36;
			aClass313_9194.aBool3330 = true;
			aBool9200 = true;
			return true;
		}
		ByteBuffer bytebuffer = toolkit.aByteBuffer9279;
		bytebuffer.clear();
		for (int i = 0; i < anInt9195; i++) {
			bytebuffer.putShort(aShortArray9188[i]);
			bytebuffer.putShort(aShortArray9185[i]);
			bytebuffer.putShort(aShortArray9190[i]);
		}
		if (interface36.read(0, bytebuffer.position(), toolkit.aLong9268)) {
			aClass313_9194.anInterface36_3329 = interface36;
			aClass313_9194.aBool3330 = true;
			aBool9200 = true;
			return true;
		}
		return false;
	}

	boolean method14536() {
		boolean bool = !aClass314_9196.aBool3335;
		boolean bool_698_ = (anInt9164 & 0x37) != 0 && !aClass314_9219.aBool3335;
		boolean bool_699_ = !aClass314_9217.aBool3335;
		boolean bool_700_ = !aClass314_9198.aBool3335;
		if (!bool_699_ && !bool && !bool_698_ && !bool_700_) {
			return true;
		}
		boolean bool_701_ = true;
		if (bool_699_ && aShortArray9175 != null) {
			if (aClass314_9217.anInterface32_3332 == null) {
				aClass314_9217.anInterface32_3332 = toolkit.createArrayBuffer(aBool9208);
			}
			NativeArrayBuffer interface32 = aClass314_9217.anInterface32_3332;
			interface32.reallocate(uniqueVertices * 12, 12);
			Unsafe unsafe = toolkit.unsafe;
			if (unsafe != null) {
				int i = uniqueVertices * 12;
				long l = interface32.lock(0, i);
				for (int i_702_ = 0; i_702_ < uniqueVertices; i_702_++) {
					short i_703_ = aShortArray9175[i_702_];
					unsafe.putFloat(l, vertexX[i_703_]);
					l += 4L;
					unsafe.putFloat(l, vertexY[i_703_]);
					l += 4L;
					unsafe.putFloat(l, vertexZ[i_703_]);
					l += 4L;
				}
				interface32.unmap();
			} else {
				ByteBuffer bytebuffer = toolkit.aByteBuffer9279;
				bytebuffer.clear();
				for (int i = 0; i < uniqueVertices; i++) {
					bytebuffer.putFloat(vertexX[aShortArray9175[i]]);
					bytebuffer.putFloat(vertexY[aShortArray9175[i]]);
					bytebuffer.putFloat(vertexZ[aShortArray9175[i]]);
				}
				interface32.read(0, bytebuffer.position(), toolkit.aLong9268);
			}
			aClass314_9217.anInterface32_3334 = interface32;
			aClass314_9217.aBool3335 = true;
		}
		if (bool) {
			if (aClass314_9196.anInterface32_3332 == null) {
				aClass314_9196.anInterface32_3332 = toolkit.createArrayBuffer(aBool9208);
			}
			NativeArrayBuffer interface32 = aClass314_9196.anInterface32_3332;
			interface32.reallocate(uniqueVertices * 4, 4);
			Unsafe unsafe = toolkit.unsafe;
			if (unsafe != null) {
				int i = uniqueVertices * 4;
				long l = interface32.lock(0, i);
				if ((anInt9164 & 0x37) == 0) {
					short[] is;
					short[] is_704_;
					short[] is_705_;
					byte[] is_706_;
					if (aClass328_9183 != null) {
						is = aClass328_9183.aShortArray3561;
						is_704_ = aClass328_9183.aShortArray3559;
						is_705_ = aClass328_9183.aShortArray3560;
						is_706_ = aClass328_9183.aByteArray3558;
					} else {
						is = aShortArray9177;
						is_704_ = aShortArray9212;
						is_705_ = aShortArray9179;
						is_706_ = aByteArray9180;
					}
					float f = toolkit.aFloat9344 * 768.0F / aShort9166;
					float f_707_ = toolkit.aFloat9345 * 768.0F / aShort9166;
					for (int i_708_ = 0; i_708_ < uniqueVertices; i_708_++) {
						short i_709_ = aShortArray9230[i_708_];
						int i_710_ = method14539(aShortArray9193[i_709_] & 0xffff, aShortArray9191[i_709_], aShort9223);
						float f_711_ = (i_710_ >> 16 & 0xff) * toolkit.aFloat9340;
						float f_712_ = (i_710_ >> 8 & 0xff) * toolkit.aFloat9321;
						float f_713_ = (i_710_ & 0xff) * toolkit.aFloat9320;
						byte i_714_ = is_706_[i_708_];
						float f_715_;
						if (i_714_ == 0) {
							f_715_ = (toolkit.aFloatArray9298[0] * is[i_708_] + toolkit.aFloatArray9298[1]
									* is_704_[i_708_] + toolkit.aFloatArray9298[2] * is_705_[i_708_]) * 0.0026041667F;
						} else {
							f_715_ = (toolkit.aFloatArray9298[0] * is[i_708_] + toolkit.aFloatArray9298[1]
									* is_704_[i_708_] + toolkit.aFloatArray9298[2] * is_705_[i_708_])
									/ (i_714_ * 256.0F);
						}
						float f_716_ = toolkit.aFloat9331 + f_715_ * (f_715_ < 0.0F ? f_707_ : f);
						int i_717_ = (int) (f_711_ * f_716_);
						if (i_717_ < 0) {
							i_717_ = 0;
						} else if (i_717_ > 255) {
							i_717_ = 255;
						}
						int i_718_ = (int) (f_712_ * f_716_);
						if (i_718_ < 0) {
							i_718_ = 0;
						} else if (i_718_ > 255) {
							i_718_ = 255;
						}
						int i_719_ = (int) (f_713_ * f_716_);
						if (i_719_ < 0) {
							i_719_ = 0;
						} else if (i_719_ > 255) {
							i_719_ = 255;
						}
						unsafe.putInt(l, 255 - aByteArray9187[i_709_] << 24 | i_717_ << 16 | i_718_ << 8 | i_719_);
						l += 4L;
					}
				} else {
					for (int i_720_ = 0; i_720_ < uniqueVertices; i_720_++) {
						short i_721_ = aShortArray9230[i_720_];
						int i_722_ = 255 - aByteArray9187[i_721_] << 24
								| method14539(aShortArray9193[i_721_] & 0xffff, aShortArray9191[i_721_], aShort9223);
						unsafe.putInt(l, i_722_);
						l += 4L;
					}
				}
				interface32.unmap();
			} else {
				ByteBuffer bytebuffer = toolkit.aByteBuffer9279;
				bytebuffer.clear();
				if ((anInt9164 & 0x37) == 0) {
					short[] is;
					short[] is_723_;
					short[] is_724_;
					byte[] is_725_;
					if (aClass328_9183 != null) {
						is = aClass328_9183.aShortArray3561;
						is_723_ = aClass328_9183.aShortArray3559;
						is_724_ = aClass328_9183.aShortArray3560;
						is_725_ = aClass328_9183.aByteArray3558;
					} else {
						is = aShortArray9177;
						is_723_ = aShortArray9212;
						is_724_ = aShortArray9179;
						is_725_ = aByteArray9180;
					}
					float f = toolkit.aFloat9344 * 768.0F / aShort9166;
					float f_726_ = toolkit.aFloat9345 * 768.0F / aShort9166;
					for (int i = 0; i < uniqueVertices; i++) {
						short i_727_ = aShortArray9230[i];
						int i_728_ = method14539(aShortArray9193[i_727_] & 0xffff, aShortArray9191[i_727_], aShort9223);
						float f_729_ = (i_728_ >> 16 & 0xff) * toolkit.aFloat9340;
						float f_730_ = (i_728_ >> 8 & 0xff) * toolkit.aFloat9321;
						float f_731_ = (i_728_ & 0xff) * toolkit.aFloat9320;
						byte i_732_ = is_725_[i];
						float f_733_;
						if (i_732_ == 0) {
							f_733_ = (toolkit.aFloatArray9298[0] * is[i] + toolkit.aFloatArray9298[1] * is_723_[i] + toolkit.aFloatArray9298[2]
									* is_724_[i]) * 0.0026041667F;
						} else {
							f_733_ = (toolkit.aFloatArray9298[0] * is[i] + toolkit.aFloatArray9298[1] * is_723_[i] + toolkit.aFloatArray9298[2]
									* is_724_[i])
									/ (i_732_ * 256.0F);
						}
						float f_734_ = toolkit.aFloat9331 + f_733_ * (f_733_ < 0.0F ? f_726_ : f);
						int i_735_ = (int) (f_729_ * f_734_);
						if (i_735_ < 0) {
							i_735_ = 0;
						} else if (i_735_ > 255) {
							i_735_ = 255;
						}
						int i_736_ = (int) (f_730_ * f_734_);
						if (i_736_ < 0) {
							i_736_ = 0;
						} else if (i_736_ > 255) {
							i_736_ = 255;
						}
						int i_737_ = (int) (f_731_ * f_734_);
						if (i_737_ < 0) {
							i_737_ = 0;
						} else if (i_737_ > 255) {
							i_737_ = 255;
						}
						bytebuffer.putInt(255 - aByteArray9187[i_727_] << 24 | i_735_ << 16 | i_736_ << 8 | i_737_);
					}
				} else {
					for (int i = 0; i < uniqueVertices; i++) {
						short i_738_ = aShortArray9230[i];
						int i_739_ = 255 - aByteArray9187[i_738_] << 24
								| method14539(aShortArray9193[i_738_] & 0xffff, aShortArray9191[i_738_], aShort9223);
						bytebuffer.putInt(i_739_);
					}
				}
				interface32.read(0, bytebuffer.position(), toolkit.aLong9268);
			}
			aClass314_9196.anInterface32_3334 = interface32;
			aClass314_9196.aBool3335 = true;
		}
		if (bool_698_) {
			if (aClass314_9219.anInterface32_3332 == null) {
				aClass314_9219.anInterface32_3332 = toolkit.createArrayBuffer(aBool9208);
			}
			NativeArrayBuffer interface32 = aClass314_9219.anInterface32_3332;
			interface32.reallocate(uniqueVertices * 12, 12);
			short[] is;
			short[] is_740_;
			short[] is_741_;
			byte[] is_742_;
			if (aClass328_9183 != null) {
				is = aClass328_9183.aShortArray3561;
				is_740_ = aClass328_9183.aShortArray3559;
				is_741_ = aClass328_9183.aShortArray3560;
				is_742_ = aClass328_9183.aByteArray3558;
			} else {
				is = aShortArray9177;
				is_740_ = aShortArray9212;
				is_741_ = aShortArray9179;
				is_742_ = aByteArray9180;
			}
			Unsafe unsafe = toolkit.unsafe;
			if (unsafe != null) {
				int i = uniqueVertices * 12;
				long l = interface32.lock(0, i);
				for (int i_743_ = 0; i_743_ < uniqueVertices; i_743_++) {
					Class397 class397 = new Class397(is[i_743_], is_740_[i_743_], is_741_[i_743_]);
					if (class397.distance() != 0.0F) {
						if (is_742_[i_743_] > 1) {
							class397.divide(is_742_[i_743_]);
						}
						class397.method6446();
					}
					unsafe.putFloat(l, class397.x);
					l += 4L;
					unsafe.putFloat(l, class397.y);
					l += 4L;
					unsafe.putFloat(l, class397.z);
					l += 4L;
				}
				interface32.unmap();
			} else {
				ByteBuffer bytebuffer = toolkit.aByteBuffer9279;
				bytebuffer.clear();
				for (int i = 0; i < uniqueVertices; i++) {
					Class397 class397 = new Class397(is[i], is_740_[i], is_741_[i]);
					if (class397.distance() != 0.0F) {
						if (is_742_[i] > 1) {
							class397.divide(is_742_[i]);
						}
						class397.method6446();
					}
					bytebuffer.putFloat(class397.x);
					bytebuffer.putFloat(class397.y);
					bytebuffer.putFloat(class397.z);
				}
				interface32.read(0, bytebuffer.position(), toolkit.aLong9268);
			}
			aClass314_9219.anInterface32_3334 = interface32;
			aClass314_9219.aBool3335 = true;
		}
		if (bool_700_) {
			if (aClass314_9198.anInterface32_3332 == null) {
				aClass314_9198.anInterface32_3332 = toolkit.createArrayBuffer(aBool9208);
			}
			NativeArrayBuffer interface32 = aClass314_9198.anInterface32_3332;
			interface32.reallocate(uniqueVertices * 8, 8);
			Unsafe unsafe = toolkit.unsafe;
			if (unsafe != null) {
				int i = uniqueVertices * 8;
				long l = interface32.lock(0, i);
				for (int i_744_ = 0; i_744_ < uniqueVertices; i_744_++) {
					unsafe.putFloat(l, aFloatArray9173[i_744_]);
					l += 4L;
					unsafe.putFloat(l, aFloatArray9182[i_744_]);
					l += 4L;
				}
				interface32.unmap();
			} else {
				ByteBuffer bytebuffer = toolkit.aByteBuffer9279;
				bytebuffer.clear();
				for (int i = 0; i < uniqueVertices; i++) {
					bytebuffer.putFloat(aFloatArray9173[i]);
					bytebuffer.putFloat(aFloatArray9182[i]);
				}
				interface32.read(0, bytebuffer.position(), toolkit.aLong9268);
			}
			aClass314_9198.anInterface32_3334 = interface32;
			aClass314_9198.aBool3335 = true;
		}
		return bool_701_;
	}

	void method14537() {
		if (aClass314_9217 != null) {
			aClass314_9217.method5664();
		}
		if (aClass314_9198 != null) {
			aClass314_9198.method5664();
		}
		if (aClass314_9196 != null) {
			aClass314_9196.method5664();
		}
		if (aClass314_9219 != null) {
			aClass314_9219.method5664();
		}
		if (aClass313_9194 != null) {
			aClass313_9194.method5657();
		}
	}

	int method14538(int i, int i_745_) {
		i_745_ = i_745_ * (i & 0x7f) >> 7;
		if (i_745_ < 2) {
			i_745_ = 2;
		} else if (i_745_ > 126) {
			i_745_ = 126;
		}
		return (i & 0xff80) + i_745_;
	}

	int method14539(int i, short i_746_, int i_747_) {
		int i_748_ = toolkit.anIntArray9342[method14538(i, i_747_)];
		if (i_746_ != -1) {
			TextureMetrics class141 = toolkit.metricsList.get(i_746_ & 0xffff);
			int i_749_ = class141.alpha & 0xff;
			if (i_749_ != 0) {
				int i_750_ = 131586 * i_747_;
				if (i_747_ < 0) {
					i_750_ = 0;
				} else if (i_747_ > 127) {
					i_750_ = 16777215;
				} else {
					i_750_ = 131586 * i_747_;
				}
				if (i_749_ == 256) {
					i_748_ = i_750_;
				} else {
					int i_751_ = i_749_;
					int i_752_ = 256 - i_749_;
					i_748_ = ((i_750_ & 0xff00ff) * i_751_ + (i_748_ & 0xff00ff) * i_752_ & ~0xff00ff)
							+ ((i_750_ & 0xff00) * i_751_ + (i_748_ & 0xff00) * i_752_ & 0xff0000) >> 8;
				}
			}
			int i_753_ = class141.colourOffset & 0xff;
			if (i_753_ != 0) {
				i_753_ += 256;
				int i_754_ = ((i_748_ & 0xff0000) >> 16) * i_753_;
				if (i_754_ > 65535) {
					i_754_ = 65535;
				}
				int i_755_ = ((i_748_ & 0xff00) >> 8) * i_753_;
				if (i_755_ > 65535) {
					i_755_ = 65535;
				}
				int i_756_ = (i_748_ & 0xff) * i_753_;
				if (i_756_ > 65535) {
					i_756_ = 65535;
				}
				i_748_ = (i_754_ << 8 & 0xff0000) + (i_755_ & 0xff00) + (i_756_ >> 8);
			}
		}
		return i_748_ & 0xffffff;
	}

	short method14546(BaseModel class144, int i, int i_775_, long l, int i_776_, int i_777_, int i_778_, int i_779_,
			float f, float f_780_) {
		int i_781_ = anIntArray9186[i];
		int i_782_ = anIntArray9186[i + 1];
		int i_783_ = 0;
		for (int i_784_ = i_781_; i_784_ < i_782_; i_784_++) {
			if (aShortArray9218[i_784_] == 0) {
				i_783_ = i_784_;
				break;
			}
			int i_785_ = (aShortArray9218[i_784_] & 0xffff) - 1;
			if (aLongArray9232[i_784_] == l) {
				return (short) i_785_;
			}
		}
		aShortArray9218[i_783_] = (short) (uniqueVertices + 1);
		aLongArray9232[i_783_] = l;
		aShortArray9230[uniqueVertices] = (short) i_775_;
		aShortArray9175[uniqueVertices] = (short) i;
		aShortArray9177[uniqueVertices] = (short) i_776_;
		aShortArray9212[uniqueVertices] = (short) i_777_;
		aShortArray9179[uniqueVertices] = (short) i_778_;
		aByteArray9180[uniqueVertices] = (byte) i_779_;
		aFloatArray9173[uniqueVertices] = f;
		aFloatArray9182[uniqueVertices] = f_780_;
		return (short) uniqueVertices++;
	}

	void method14548() {
		if (aClass313_9194 != null) {
			aClass313_9194.aBool3330 = false;
		}
	}

	boolean method14559(int i, int i_792_, int i_793_, int i_794_, int i_795_, int i_796_, int i_797_, int i_798_,
			int i_799_, int i_800_) {
		if (i_794_ < i_795_ && i_794_ < i_796_ && i_794_ < i_797_) {
			return false;
		}
		if (i_792_ > i_795_ && i_792_ > i_796_ && i_792_ > i_797_) {
			return false;
		}
		if (i_793_ < i_798_ && i_793_ < i_799_ && i_793_ < i_800_) {
			return false;
		}
		return !(i > i_798_ && i > i_799_ && i > i_800_);
	}

	void method14571(Matrix4f class399) {
		if (aClass324Array9222 != null) {
			toolkit.method2473(!aBool9201);
			Class405 class405 = toolkit.aClass405_9287;
			Class290 class290 = toolkit.aClass290_9426;
			boolean bool = toolkit.anInt9390 > 0;
			if (bool) {
				class290.aClass397_3232.set((toolkit.anInt9293 >> 16 & 0xff) / 255.0F,
						(toolkit.anInt9293 >> 8 & 0xff) / 255.0F, (toolkit.anInt9293 >> 0 & 0xff) / 255.0F);
			} else {
				class290.aClass397_3232.set(0.0F, 0.0F, 0.0F);
			}
			for (int i = 0; i < anInt9221; i++) {
				Class324 class324 = aClass324Array9222[i];
				Class305 class305 = aClass305Array9197[i];
				if (!class324.aBool3430 || !toolkit.method2496()) {
					float f = (vertexX[class324.anInt3426] + vertexX[class324.anInt3427] + vertexX[class324.anInt3428]) * 0.3333333F;
					float f_803_ = (vertexY[class324.anInt3426] + vertexY[class324.anInt3427] + vertexY[class324.anInt3428]) * 0.3333333F;
					float f_804_ = (vertexZ[class324.anInt3426] + vertexZ[class324.anInt3427] + vertexZ[class324.anInt3428]) * 0.3333333F;
					float f_805_ = class399.array[0] * f + class399.array[4] * f_803_ + class399.array[8] * f_804_
							+ class399.array[12];
					float f_806_ = class399.array[1] * f + class399.array[5] * f_803_ + class399.array[9] * f_804_
							+ class399.array[13];
					float f_807_ = class399.array[2] * f + class399.array[6] * f_803_ + class399.array[10] * f_804_
							+ class399.array[14];
					float f_808_ = (float) (1.0 / Math.sqrt(f_805_ * f_805_ + f_806_ * f_806_ + f_807_ * f_807_))
							* class324.anInt3433;
					class405.method6766(class305.anInt3309, class305.anInt3308 * class324.aShort3434 >> 7,
							class305.anInt3307 * class324.aShort3431 >> 7, f_805_ + class305.anInt3312 - f_805_
									* f_808_, f_806_ + class305.anInt3311 - f_806_ * f_808_, f_807_ - f_807_ * f_808_);
					class405.method6745(toolkit.aClass405_9280);
					toolkit.aClass399_9289.method6548(class405);
					class290.method5378(toolkit.aClass399_9289);
					class290.aClass399_3234.toIdentity();
					class290.anInt3233 = class305.anInt3310;
					if (bool) {
						class290.aFloat3236 = 1.0F - (toolkit.aFloat9393 - f_807_)
								/ (toolkit.aFloat9393 - toolkit.aFloat9392);
					}
					class290.texture = null;
					if (class324.aShort3432 != -1) {
						class290.texture = toolkit.aClass321_9360.get(toolkit.metricsList
								.get(class324.aShort3432 & 0xffff));
					}
					class290.method5376(bool);
				}
			}
			toolkit.method2473(true);
		}
	}

	@Override
	void method2903() {

	}

	@Override
	void method2904() {

	}

	@Override
	void method2913(int i, int[] is, int i_281_, int i_282_, int i_283_, boolean bool, int i_284_, int[] is_285_) {
		int i_286_ = is.length;
		if (i == 0) {
			i_281_ <<= 4;
			i_282_ <<= 4;
			i_283_ <<= 4;
			int i_287_ = 0;
			anInt9203 = 0;
			anInt9233 = 0;
			anInt9234 = 0;
			for (int i_288_ = 0; i_288_ < i_286_; i_288_++) {
				int i_289_ = is[i_288_];
				if (i_289_ < anIntArrayArray9172.length) {
					int[] is_290_ = anIntArrayArray9172[i_289_];
					for (int i_292_ : is_290_) {
						if (aShortArray9178 == null || (i_284_ & aShortArray9178[i_292_]) != 0) {
							anInt9203 += vertexX[i_292_];
							anInt9233 += vertexY[i_292_];
							anInt9234 += vertexZ[i_292_];
							i_287_++;
						}
					}
				}
			}
			if (i_287_ > 0) {
				anInt9203 = anInt9203 / i_287_ + i_281_;
				anInt9233 = anInt9233 / i_287_ + i_282_;
				anInt9234 = anInt9234 / i_287_ + i_283_;
				aBool9235 = true;
			} else {
				anInt9203 = i_281_;
				anInt9233 = i_282_;
				anInt9234 = i_283_;
			}
		} else if (i == 1) {
			if (is_285_ != null) {
				int i_293_ = is_285_[0] * i_281_ + is_285_[1] * i_282_ + is_285_[2] * i_283_ + 8192 >> 14;
				int i_294_ = is_285_[3] * i_281_ + is_285_[4] * i_282_ + is_285_[5] * i_283_ + 8192 >> 14;
				int i_295_ = is_285_[6] * i_281_ + is_285_[7] * i_282_ + is_285_[8] * i_283_ + 8192 >> 14;
				i_281_ = i_293_;
				i_282_ = i_294_;
				i_283_ = i_295_;
			}
			i_281_ <<= 4;
			i_282_ <<= 4;
			i_283_ <<= 4;
			for (int i_296_ = 0; i_296_ < i_286_; i_296_++) {
				int i_297_ = is[i_296_];
				if (i_297_ < anIntArrayArray9172.length) {
					int[] is_298_ = anIntArrayArray9172[i_297_];
					for (int element : is_298_) {
						int i_300_ = element;
						if (aShortArray9178 == null || (i_284_ & aShortArray9178[i_300_]) != 0) {
							vertexX[i_300_] += i_281_;
							vertexY[i_300_] += i_282_;
							vertexZ[i_300_] += i_283_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_285_ != null) {
				int i_301_ = is_285_[9] << 4;
				int i_302_ = is_285_[10] << 4;
				int i_303_ = is_285_[11] << 4;
				int i_304_ = is_285_[12] << 4;
				int i_305_ = is_285_[13] << 4;
				int i_306_ = is_285_[14] << 4;
				if (aBool9235) {
					int i_307_ = is_285_[0] * anInt9203 + is_285_[3] * anInt9233 + is_285_[6] * anInt9234 + 8192 >> 14;
					int i_308_ = is_285_[1] * anInt9203 + is_285_[4] * anInt9233 + is_285_[7] * anInt9234 + 8192 >> 14;
					int i_309_ = is_285_[2] * anInt9203 + is_285_[5] * anInt9233 + is_285_[8] * anInt9234 + 8192 >> 14;
					i_307_ += i_304_;
					i_308_ += i_305_;
					i_309_ += i_306_;
					anInt9203 = i_307_;
					anInt9233 = i_308_;
					anInt9234 = i_309_;
					aBool9235 = false;
				}
				int[] is_310_ = new int[9];
				int i_311_ = Class373.COSINE[i_281_];
				int i_312_ = Class373.SINE[i_281_];
				int i_313_ = Class373.COSINE[i_282_];
				int i_314_ = Class373.SINE[i_282_];
				int i_315_ = Class373.COSINE[i_283_];
				int i_316_ = Class373.SINE[i_283_];
				int i_317_ = i_312_ * i_315_ + 8192 >> 14;
				int i_318_ = i_312_ * i_316_ + 8192 >> 14;
				is_310_[0] = i_313_ * i_315_ + i_314_ * i_318_ + 8192 >> 14;
				is_310_[1] = -i_313_ * i_316_ + i_314_ * i_317_ + 8192 >> 14;
				is_310_[2] = i_314_ * i_311_ + 8192 >> 14;
				is_310_[3] = i_311_ * i_316_ + 8192 >> 14;
				is_310_[4] = i_311_ * i_315_ + 8192 >> 14;
				is_310_[5] = -i_312_;
				is_310_[6] = -i_314_ * i_315_ + i_313_ * i_318_ + 8192 >> 14;
				is_310_[7] = i_314_ * i_316_ + i_313_ * i_317_ + 8192 >> 14;
				is_310_[8] = i_313_ * i_311_ + 8192 >> 14;
				int i_319_ = is_310_[0] * -anInt9203 + is_310_[1] * -anInt9233 + is_310_[2] * -anInt9234 + 8192 >> 14;
				int i_320_ = is_310_[3] * -anInt9203 + is_310_[4] * -anInt9233 + is_310_[5] * -anInt9234 + 8192 >> 14;
				int i_321_ = is_310_[6] * -anInt9203 + is_310_[7] * -anInt9233 + is_310_[8] * -anInt9234 + 8192 >> 14;
				int i_322_ = i_319_ + anInt9203;
				int i_323_ = i_320_ + anInt9233;
				int i_324_ = i_321_ + anInt9234;
				int[] is_325_ = new int[9];
				for (int i_326_ = 0; i_326_ < 3; i_326_++) {
					for (int i_327_ = 0; i_327_ < 3; i_327_++) {
						int i_328_ = 0;
						for (int i_329_ = 0; i_329_ < 3; i_329_++) {
							i_328_ += is_310_[i_326_ * 3 + i_329_] * is_285_[i_327_ * 3 + i_329_];
						}
						is_325_[i_326_ * 3 + i_327_] = i_328_ + 8192 >> 14;
					}
				}
				int i_330_ = is_310_[0] * i_304_ + is_310_[1] * i_305_ + is_310_[2] * i_306_ + 8192 >> 14;
				int i_331_ = is_310_[3] * i_304_ + is_310_[4] * i_305_ + is_310_[5] * i_306_ + 8192 >> 14;
				int i_332_ = is_310_[6] * i_304_ + is_310_[7] * i_305_ + is_310_[8] * i_306_ + 8192 >> 14;
				i_330_ += i_322_;
				i_331_ += i_323_;
				i_332_ += i_324_;
				int[] is_333_ = new int[9];
				for (int i_334_ = 0; i_334_ < 3; i_334_++) {
					for (int i_335_ = 0; i_335_ < 3; i_335_++) {
						int i_336_ = 0;
						for (int i_337_ = 0; i_337_ < 3; i_337_++) {
							i_336_ += is_285_[i_334_ * 3 + i_337_] * is_325_[i_335_ + i_337_ * 3];
						}
						is_333_[i_334_ * 3 + i_335_] = i_336_ + 8192 >> 14;
					}
				}
				int i_338_ = is_285_[0] * i_330_ + is_285_[1] * i_331_ + is_285_[2] * i_332_ + 8192 >> 14;
				int i_339_ = is_285_[3] * i_330_ + is_285_[4] * i_331_ + is_285_[5] * i_332_ + 8192 >> 14;
				int i_340_ = is_285_[6] * i_330_ + is_285_[7] * i_331_ + is_285_[8] * i_332_ + 8192 >> 14;
				i_338_ += i_301_;
				i_339_ += i_302_;
				i_340_ += i_303_;
				for (int i_341_ = 0; i_341_ < i_286_; i_341_++) {
					int i_342_ = is[i_341_];
					if (i_342_ < anIntArrayArray9172.length) {
						int[] is_343_ = anIntArrayArray9172[i_342_];
						for (int element : is_343_) {
							int i_345_ = element;
							if (aShortArray9178 == null || (i_284_ & aShortArray9178[i_345_]) != 0) {
								int i_346_ = is_333_[0] * vertexX[i_345_] + is_333_[1] * vertexY[i_345_] + is_333_[2]
										* vertexZ[i_345_] + 8192 >> 14;
								int i_347_ = is_333_[3] * vertexX[i_345_] + is_333_[4] * vertexY[i_345_] + is_333_[5]
										* vertexZ[i_345_] + 8192 >> 14;
								int i_348_ = is_333_[6] * vertexX[i_345_] + is_333_[7] * vertexY[i_345_] + is_333_[8]
										* vertexZ[i_345_] + 8192 >> 14;
								i_346_ += i_338_;
								i_347_ += i_339_;
								i_348_ += i_340_;
								vertexX[i_345_] = i_346_;
								vertexY[i_345_] = i_347_;
								vertexZ[i_345_] = i_348_;
							}
						}
					}
				}
			} else {
				for (int i_349_ = 0; i_349_ < i_286_; i_349_++) {
					int i_350_ = is[i_349_];
					if (i_350_ < anIntArrayArray9172.length) {
						int[] is_351_ = anIntArrayArray9172[i_350_];
						for (int element : is_351_) {
							int i_353_ = element;
							if (aShortArray9178 == null || (i_284_ & aShortArray9178[i_353_]) != 0) {
								vertexX[i_353_] -= anInt9203;
								vertexY[i_353_] -= anInt9233;
								vertexZ[i_353_] -= anInt9234;
								if (i_283_ != 0) {
									int i_354_ = Class373.SINE[i_283_];
									int i_355_ = Class373.COSINE[i_283_];
									int i_356_ = vertexY[i_353_] * i_354_ + vertexX[i_353_] * i_355_ + 16383 >> 14;
									vertexY[i_353_] = vertexY[i_353_] * i_355_ - vertexX[i_353_] * i_354_ + 16383 >> 14;
									vertexX[i_353_] = i_356_;
								}
								if (i_281_ != 0) {
									int i_357_ = Class373.SINE[i_281_];
									int i_358_ = Class373.COSINE[i_281_];
									int i_359_ = vertexY[i_353_] * i_358_ - vertexZ[i_353_] * i_357_ + 16383 >> 14;
									vertexZ[i_353_] = vertexY[i_353_] * i_357_ + vertexZ[i_353_] * i_358_ + 16383 >> 14;
									vertexY[i_353_] = i_359_;
								}
								if (i_282_ != 0) {
									int i_360_ = Class373.SINE[i_282_];
									int i_361_ = Class373.COSINE[i_282_];
									int i_362_ = vertexZ[i_353_] * i_360_ + vertexX[i_353_] * i_361_ + 16383 >> 14;
									vertexZ[i_353_] = vertexZ[i_353_] * i_361_ - vertexX[i_353_] * i_360_ + 16383 >> 14;
									vertexX[i_353_] = i_362_;
								}
								vertexX[i_353_] += anInt9203;
								vertexY[i_353_] += anInt9233;
								vertexZ[i_353_] += anInt9234;
							}
						}
					}
				}
				if (bool) {
					for (int i_363_ = 0; i_363_ < i_286_; i_363_++) {
						int i_364_ = is[i_363_];
						if (i_364_ < anIntArrayArray9172.length) {
							int[] is_365_ = anIntArrayArray9172[i_364_];
							for (int i_367_ : is_365_) {
								if (aShortArray9178 == null || (i_284_ & aShortArray9178[i_367_]) != 0) {
									int i_368_ = anIntArray9186[i_367_];
									int i_369_ = anIntArray9186[i_367_ + 1];
									for (int i_370_ = i_368_; i_370_ < i_369_ && aShortArray9218[i_370_] != 0; i_370_++) {
										int i_371_ = (aShortArray9218[i_370_] & 0xffff) - 1;
										if (i_283_ != 0) {
											int i_372_ = Class373.SINE[i_283_];
											int i_373_ = Class373.COSINE[i_283_];
											int i_374_ = aShortArray9212[i_371_] * i_372_ + aShortArray9177[i_371_]
													* i_373_ + 16383 >> 14;
											aShortArray9212[i_371_] = (short) (aShortArray9212[i_371_] * i_373_
													- aShortArray9177[i_371_] * i_372_ + 16383 >> 14);
											aShortArray9177[i_371_] = (short) i_374_;
										}
										if (i_281_ != 0) {
											int i_375_ = Class373.SINE[i_281_];
											int i_376_ = Class373.COSINE[i_281_];
											int i_377_ = aShortArray9212[i_371_] * i_376_ - aShortArray9179[i_371_]
													* i_375_ + 16383 >> 14;
											aShortArray9179[i_371_] = (short) (aShortArray9212[i_371_] * i_375_
													+ aShortArray9179[i_371_] * i_376_ + 16383 >> 14);
											aShortArray9212[i_371_] = (short) i_377_;
										}
										if (i_282_ != 0) {
											int i_378_ = Class373.SINE[i_282_];
											int i_379_ = Class373.COSINE[i_282_];
											int i_380_ = aShortArray9179[i_371_] * i_378_ + aShortArray9177[i_371_]
													* i_379_ + 16383 >> 14;
											aShortArray9179[i_371_] = (short) (aShortArray9179[i_371_] * i_379_
													- aShortArray9177[i_371_] * i_378_ + 16383 >> 14);
											aShortArray9177[i_371_] = (short) i_380_;
										}
									}
								}
							}
						}
					}
					method14525();
				}
			}
		} else if (i == 3) {
			if (is_285_ != null) {
				int i_381_ = is_285_[9] << 4;
				int i_382_ = is_285_[10] << 4;
				int i_383_ = is_285_[11] << 4;
				int i_384_ = is_285_[12] << 4;
				int i_385_ = is_285_[13] << 4;
				int i_386_ = is_285_[14] << 4;
				if (aBool9235) {
					int i_387_ = is_285_[0] * anInt9203 + is_285_[3] * anInt9233 + is_285_[6] * anInt9234 + 8192 >> 14;
					int i_388_ = is_285_[1] * anInt9203 + is_285_[4] * anInt9233 + is_285_[7] * anInt9234 + 8192 >> 14;
					int i_389_ = is_285_[2] * anInt9203 + is_285_[5] * anInt9233 + is_285_[8] * anInt9234 + 8192 >> 14;
					i_387_ += i_384_;
					i_388_ += i_385_;
					i_389_ += i_386_;
					anInt9203 = i_387_;
					anInt9233 = i_388_;
					anInt9234 = i_389_;
					aBool9235 = false;
				}
				int i_390_ = i_281_ << 15 >> 7;
				int i_391_ = i_282_ << 15 >> 7;
				int i_392_ = i_283_ << 15 >> 7;
				int i_393_ = i_390_ * -anInt9203 + 8192 >> 14;
				int i_394_ = i_391_ * -anInt9233 + 8192 >> 14;
				int i_395_ = i_392_ * -anInt9234 + 8192 >> 14;
				int i_396_ = i_393_ + anInt9203;
				int i_397_ = i_394_ + anInt9233;
				int i_398_ = i_395_ + anInt9234;
				int[] is_399_ = new int[9];
				is_399_[0] = i_390_ * is_285_[0] + 8192 >> 14;
				is_399_[1] = i_390_ * is_285_[3] + 8192 >> 14;
				is_399_[2] = i_390_ * is_285_[6] + 8192 >> 14;
				is_399_[3] = i_391_ * is_285_[1] + 8192 >> 14;
				is_399_[4] = i_391_ * is_285_[4] + 8192 >> 14;
				is_399_[5] = i_391_ * is_285_[7] + 8192 >> 14;
				is_399_[6] = i_392_ * is_285_[2] + 8192 >> 14;
				is_399_[7] = i_392_ * is_285_[5] + 8192 >> 14;
				is_399_[8] = i_392_ * is_285_[8] + 8192 >> 14;
				int i_400_ = i_390_ * i_384_ + 8192 >> 14;
				int i_401_ = i_391_ * i_385_ + 8192 >> 14;
				int i_402_ = i_392_ * i_386_ + 8192 >> 14;
				i_400_ += i_396_;
				i_401_ += i_397_;
				i_402_ += i_398_;
				int[] is_403_ = new int[9];
				for (int i_404_ = 0; i_404_ < 3; i_404_++) {
					for (int i_405_ = 0; i_405_ < 3; i_405_++) {
						int i_406_ = 0;
						for (int i_407_ = 0; i_407_ < 3; i_407_++) {
							i_406_ += is_285_[i_404_ * 3 + i_407_] * is_399_[i_405_ + i_407_ * 3];
						}
						is_403_[i_404_ * 3 + i_405_] = i_406_ + 8192 >> 14;
					}
				}
				int i_408_ = is_285_[0] * i_400_ + is_285_[1] * i_401_ + is_285_[2] * i_402_ + 8192 >> 14;
				int i_409_ = is_285_[3] * i_400_ + is_285_[4] * i_401_ + is_285_[5] * i_402_ + 8192 >> 14;
				int i_410_ = is_285_[6] * i_400_ + is_285_[7] * i_401_ + is_285_[8] * i_402_ + 8192 >> 14;
				i_408_ += i_381_;
				i_409_ += i_382_;
				i_410_ += i_383_;
				for (int i_411_ = 0; i_411_ < i_286_; i_411_++) {
					int i_412_ = is[i_411_];
					if (i_412_ < anIntArrayArray9172.length) {
						int[] is_413_ = anIntArrayArray9172[i_412_];
						for (int element : is_413_) {
							int i_415_ = element;
							if (aShortArray9178 == null || (i_284_ & aShortArray9178[i_415_]) != 0) {
								int i_416_ = is_403_[0] * vertexX[i_415_] + is_403_[1] * vertexY[i_415_] + is_403_[2]
										* vertexZ[i_415_] + 8192 >> 14;
								int i_417_ = is_403_[3] * vertexX[i_415_] + is_403_[4] * vertexY[i_415_] + is_403_[5]
										* vertexZ[i_415_] + 8192 >> 14;
								int i_418_ = is_403_[6] * vertexX[i_415_] + is_403_[7] * vertexY[i_415_] + is_403_[8]
										* vertexZ[i_415_] + 8192 >> 14;
								i_416_ += i_408_;
								i_417_ += i_409_;
								i_418_ += i_410_;
								vertexX[i_415_] = i_416_;
								vertexY[i_415_] = i_417_;
								vertexZ[i_415_] = i_418_;
							}
						}
					}
				}
			} else {
				for (int i_419_ = 0; i_419_ < i_286_; i_419_++) {
					int i_420_ = is[i_419_];
					if (i_420_ < anIntArrayArray9172.length) {
						int[] is_421_ = anIntArrayArray9172[i_420_];
						for (int element : is_421_) {
							int i_423_ = element;
							if (aShortArray9178 == null || (i_284_ & aShortArray9178[i_423_]) != 0) {
								vertexX[i_423_] -= anInt9203;
								vertexY[i_423_] -= anInt9233;
								vertexZ[i_423_] -= anInt9234;
								vertexX[i_423_] = vertexX[i_423_] * i_281_ >> 7;
								vertexY[i_423_] = vertexY[i_423_] * i_282_ >> 7;
								vertexZ[i_423_] = vertexZ[i_423_] * i_283_ >> 7;
								vertexX[i_423_] += anInt9203;
								vertexY[i_423_] += anInt9233;
								vertexZ[i_423_] += anInt9234;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9209 != null) {
				boolean bool_424_ = false;
				for (int i_425_ = 0; i_425_ < i_286_; i_425_++) {
					int i_426_ = is[i_425_];
					if (i_426_ < anIntArrayArray9209.length) {
						int[] is_427_ = anIntArrayArray9209[i_426_];
						for (int element : is_427_) {
							int i_429_ = element;
							if (aShortArray9225 == null || (i_284_ & aShortArray9225[i_429_]) != 0) {
								int i_430_ = (aByteArray9187[i_429_] & 0xff) + i_281_ * 8;
								if (i_430_ < 0) {
									i_430_ = 0;
								} else if (i_430_ > 255) {
									i_430_ = 255;
								}
								aByteArray9187[i_429_] = (byte) i_430_;
							}
						}
						bool_424_ = bool_424_ | is_427_.length > 0;
					}
				}
				if (bool_424_) {
					if (aClass324Array9222 != null) {
						for (int i_431_ = 0; i_431_ < anInt9221; i_431_++) {
							Class324 class324 = aClass324Array9222[i_431_];
							Class305 class305 = aClass305Array9197[i_431_];
							class305.anInt3310 = class305.anInt3310 & 0xffffff
									| 255 - (aByteArray9187[class324.anInt3429] & 0xff) << 24;
						}
					}
					method14524();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9209 != null) {
				boolean bool_432_ = false;
				for (int i_433_ = 0; i_433_ < i_286_; i_433_++) {
					int i_434_ = is[i_433_];
					if (i_434_ < anIntArrayArray9209.length) {
						int[] is_435_ = anIntArrayArray9209[i_434_];
						for (int element : is_435_) {
							int i_437_ = element;
							if (aShortArray9225 == null || (i_284_ & aShortArray9225[i_437_]) != 0) {
								int i_438_ = aShortArray9193[i_437_] & 0xffff;
								int i_439_ = i_438_ >> 10 & 0x3f;
								int i_440_ = i_438_ >> 7 & 0x7;
								int i_441_ = i_438_ & 0x7f;
								i_439_ = i_439_ + i_281_ & 0x3f;
								i_440_ += i_282_ / 4;
								if (i_440_ < 0) {
									i_440_ = 0;
								} else if (i_440_ > 7) {
									i_440_ = 7;
								}
								i_441_ += i_283_;
								if (i_441_ < 0) {
									i_441_ = 0;
								} else if (i_441_ > 127) {
									i_441_ = 127;
								}
								aShortArray9193[i_437_] = (short) (i_439_ << 10 | i_440_ << 7 | i_441_);
							}
						}
						bool_432_ = bool_432_ | is_435_.length > 0;
					}
				}
				if (bool_432_) {
					if (aClass324Array9222 != null) {
						for (int i_442_ = 0; i_442_ < anInt9221; i_442_++) {
							Class324 class324 = aClass324Array9222[i_442_];
							Class305 class305 = aClass305Array9197[i_442_];
							class305.anInt3310 = class305.anInt3310 & ~0xffffff
									| Class598.HSL_TABLE[aShortArray9193[class324.anInt3429] & 0xffff] & 0xffffff;
						}
					}
					method14524();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9204 != null) {
				for (int i_443_ = 0; i_443_ < i_286_; i_443_++) {
					int i_444_ = is[i_443_];
					if (i_444_ < anIntArrayArray9204.length) {
						int[] is_445_ = anIntArrayArray9204[i_444_];
						for (int element : is_445_) {
							Class305 class305 = aClass305Array9197[element];
							class305.anInt3312 += i_281_;
							class305.anInt3311 += i_282_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9204 != null) {
				for (int i_447_ = 0; i_447_ < i_286_; i_447_++) {
					int i_448_ = is[i_447_];
					if (i_448_ < anIntArrayArray9204.length) {
						int[] is_449_ = anIntArrayArray9204[i_448_];
						for (int element : is_449_) {
							Class305 class305 = aClass305Array9197[element];
							class305.anInt3308 = class305.anInt3308 * i_281_ >> 7;
							class305.anInt3307 = class305.anInt3307 * i_282_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9204 != null) {
				for (int i_451_ = 0; i_451_ < i_286_; i_451_++) {
					int i_452_ = is[i_451_];
					if (i_452_ < anIntArrayArray9204.length) {
						int[] is_453_ = anIntArrayArray9204[i_452_];
						for (int element : is_453_) {
							Class305 class305 = aClass305Array9197[element];
							class305.anInt3309 = class305.anInt3309 + i_281_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	@Override
	void transform(int type, int dx, int dy, int dz) {
		if (type == 0) {
			int i_458_ = 0;
			anInt9203 = 0;
			anInt9233 = 0;
			anInt9234 = 0;

			for (int i_459_ = 0; i_459_ < vertexCount; i_459_++) {
				anInt9203 += vertexX[i_459_];
				anInt9233 += vertexY[i_459_];
				anInt9234 += vertexZ[i_459_];
				i_458_++;
			}

			if (i_458_ > 0) {
				anInt9203 = anInt9203 / i_458_ + dx;
				anInt9233 = anInt9233 / i_458_ + dy;
				anInt9234 = anInt9234 / i_458_ + dz;
			} else {
				anInt9203 = dx;
				anInt9233 = dy;
				anInt9234 = dz;
			}
		} else if (type == 1) {
			for (int i_460_ = 0; i_460_ < vertexCount; i_460_++) {
				vertexX[i_460_] += dx;
				vertexY[i_460_] += dy;
				vertexZ[i_460_] += dz;
			}
		} else if (type == 2) {
			for (int i_461_ = 0; i_461_ < vertexCount; i_461_++) {
				vertexX[i_461_] -= anInt9203;
				vertexY[i_461_] -= anInt9233;
				vertexZ[i_461_] -= anInt9234;

				if (dz != 0) {
					int i_462_ = Class373.SINE[dz];
					int i_463_ = Class373.COSINE[dz];
					int i_464_ = vertexY[i_461_] * i_462_ + vertexX[i_461_] * i_463_ + 16383 >> 14;
					vertexY[i_461_] = vertexY[i_461_] * i_463_ - vertexX[i_461_] * i_462_ + 16383 >> 14;
					vertexX[i_461_] = i_464_;
				}
				if (dx != 0) {
					int i_465_ = Class373.SINE[dx];
					int i_466_ = Class373.COSINE[dx];
					int i_467_ = vertexY[i_461_] * i_466_ - vertexZ[i_461_] * i_465_ + 16383 >> 14;
					vertexZ[i_461_] = vertexY[i_461_] * i_465_ + vertexZ[i_461_] * i_466_ + 16383 >> 14;
					vertexY[i_461_] = i_467_;
				}
				if (dy != 0) {
					int i_468_ = Class373.SINE[dy];
					int i_469_ = Class373.COSINE[dy];
					int i_470_ = vertexZ[i_461_] * i_468_ + vertexX[i_461_] * i_469_ + 16383 >> 14;
					vertexZ[i_461_] = vertexZ[i_461_] * i_469_ - vertexX[i_461_] * i_468_ + 16383 >> 14;
					vertexX[i_461_] = i_470_;
				}
				vertexX[i_461_] += anInt9203;
				vertexY[i_461_] += anInt9233;
				vertexZ[i_461_] += anInt9234;
			}
		} else if (type == 3) {
			for (int i_471_ = 0; i_471_ < vertexCount; i_471_++) {
				vertexX[i_471_] -= anInt9203;
				vertexY[i_471_] -= anInt9233;
				vertexZ[i_471_] -= anInt9234;
				vertexX[i_471_] = vertexX[i_471_] * dx / 128;
				vertexY[i_471_] = vertexY[i_471_] * dy / 128;
				vertexZ[i_471_] = vertexZ[i_471_] * dz / 128;
				vertexX[i_471_] += anInt9203;
				vertexY[i_471_] += anInt9233;
				vertexZ[i_471_] += anInt9234;
			}
		} else if (type == 5) {
			for (int i_472_ = 0; i_472_ < anInt9184; i_472_++) {
				int i_473_ = (aByteArray9187[i_472_] & 0xff) + dx * 8;
				if (i_473_ < 0) {
					i_473_ = 0;
				} else if (i_473_ > 255) {
					i_473_ = 255;
				}
				aByteArray9187[i_472_] = (byte) i_473_;
			}
			if (aClass324Array9222 != null) {
				for (int i_474_ = 0; i_474_ < anInt9221; i_474_++) {
					Class324 class324 = aClass324Array9222[i_474_];
					Class305 class305 = aClass305Array9197[i_474_];
					class305.anInt3310 = class305.anInt3310 & 0xffffff
							| 255 - (aByteArray9187[class324.anInt3429] & 0xff) << 24;
				}
			}
			method14524();
		} else if (type == 7) {
			for (int i_475_ = 0; i_475_ < anInt9184; i_475_++) {
				int i_476_ = aShortArray9193[i_475_] & 0xffff;
				int i_477_ = i_476_ >> 10 & 0x3f;
				int i_478_ = i_476_ >> 7 & 0x7;
				int i_479_ = i_476_ & 0x7f;
				i_477_ = i_477_ + dx & 0x3f;
				i_478_ += dy / 4;
				if (i_478_ < 0) {
					i_478_ = 0;
				} else if (i_478_ > 7) {
					i_478_ = 7;
				}
				i_479_ += dz;
				if (i_479_ < 0) {
					i_479_ = 0;
				} else if (i_479_ > 127) {
					i_479_ = 127;
				}
				aShortArray9193[i_475_] = (short) (i_477_ << 10 | i_478_ << 7 | i_479_);
			}
			if (aClass324Array9222 != null) {
				for (int i_480_ = 0; i_480_ < anInt9221; i_480_++) {
					Class324 class324 = aClass324Array9222[i_480_];
					Class305 class305 = aClass305Array9197[i_480_];
					class305.anInt3310 = class305.anInt3310 & ~0xffffff
							| Class598.HSL_TABLE[aShortArray9193[class324.anInt3429] & 0xffff] & 0xffffff;
				}
			}
			method14524();
		} else if (type == 8) {
			for (int i_481_ = 0; i_481_ < anInt9221; i_481_++) {
				Class305 class305 = aClass305Array9197[i_481_];
				class305.anInt3312 += dx;
				class305.anInt3311 += dy;
			}
		} else if (type == 10) {
			for (int i_482_ = 0; i_482_ < anInt9221; i_482_++) {
				Class305 class305 = aClass305Array9197[i_482_];
				class305.anInt3308 = class305.anInt3308 * dx >> 7;
				class305.anInt3307 = class305.anInt3307 * dy >> 7;
			}
		} else if (type == 9) {
			for (int i_483_ = 0; i_483_ < anInt9221; i_483_++) {
				Class305 class305 = aClass305Array9197[i_483_];
				class305.anInt3309 = class305.anInt3309 + dx & 0x3fff;
			}
		}
	}

	@Override
	void endAnimation() {
		for (int i = 0; i < anInt9165; i++) {
			vertexX[i] = vertexX[i] + 7 >> 4;
			vertexY[i] = vertexY[i] + 7 >> 4;
			vertexZ[i] = vertexZ[i] + 7 >> 4;
		}
		method14523();
		computedBounds = false;
	}

	@Override
	boolean startAnimation() {
		if (anIntArrayArray9172 == null) {
			return false;
		}
		for (int i = 0; i < anInt9165; i++) {
			vertexX[i] <<= 4;
			vertexY[i] <<= 4;
			vertexZ[i] <<= 4;
		}
		anInt9203 = 0;
		anInt9233 = 0;
		anInt9234 = 0;
		return true;
	}

	@Override
	void method3079(int i, int[] is, int i_484_, int i_485_, int i_486_, int i_487_, boolean bool) {
		int i_488_ = is.length;
		if (i == 0) {
			i_484_ <<= 4;
			i_485_ <<= 4;
			i_486_ <<= 4;
			int i_489_ = 0;
			anInt9203 = 0;
			anInt9233 = 0;
			anInt9234 = 0;
			for (int i_490_ = 0; i_490_ < i_488_; i_490_++) {
				int i_491_ = is[i_490_];
				if (i_491_ < anIntArrayArray9172.length) {
					int[] is_492_ = anIntArrayArray9172[i_491_];
					for (int i_494_ : is_492_) {
						anInt9203 += vertexX[i_494_];
						anInt9233 += vertexY[i_494_];
						anInt9234 += vertexZ[i_494_];
						i_489_++;
					}
				}
			}
			if (i_489_ > 0) {
				anInt9203 = anInt9203 / i_489_ + i_484_;
				anInt9233 = anInt9233 / i_489_ + i_485_;
				anInt9234 = anInt9234 / i_489_ + i_486_;
			} else {
				anInt9203 = i_484_;
				anInt9233 = i_485_;
				anInt9234 = i_486_;
			}
		} else if (i == 1) {
			i_484_ <<= 4;
			i_485_ <<= 4;
			i_486_ <<= 4;
			for (int i_495_ = 0; i_495_ < i_488_; i_495_++) {
				int i_496_ = is[i_495_];
				if (i_496_ < anIntArrayArray9172.length) {
					int[] is_497_ = anIntArrayArray9172[i_496_];
					for (int element : is_497_) {
						int i_499_ = element;
						vertexX[i_499_] += i_484_;
						vertexY[i_499_] += i_485_;
						vertexZ[i_499_] += i_486_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_500_ = 0; i_500_ < i_488_; i_500_++) {
				int i_501_ = is[i_500_];
				if (i_501_ < anIntArrayArray9172.length) {
					int[] is_502_ = anIntArrayArray9172[i_501_];
					if ((i_487_ & 0x1) == 0) {
						for (int element : is_502_) {
							int i_504_ = element;
							vertexX[i_504_] -= anInt9203;
							vertexY[i_504_] -= anInt9233;
							vertexZ[i_504_] -= anInt9234;
							if (i_486_ != 0) {
								int i_505_ = Class373.SINE[i_486_];
								int i_506_ = Class373.COSINE[i_486_];
								int i_507_ = vertexY[i_504_] * i_505_ + vertexX[i_504_] * i_506_ + 16383 >> 14;
								vertexY[i_504_] = vertexY[i_504_] * i_506_ - vertexX[i_504_] * i_505_ + 16383 >> 14;
								vertexX[i_504_] = i_507_;
							}
							if (i_484_ != 0) {
								int i_508_ = Class373.SINE[i_484_];
								int i_509_ = Class373.COSINE[i_484_];
								int i_510_ = vertexY[i_504_] * i_509_ - vertexZ[i_504_] * i_508_ + 16383 >> 14;
								vertexZ[i_504_] = vertexY[i_504_] * i_508_ + vertexZ[i_504_] * i_509_ + 16383 >> 14;
								vertexY[i_504_] = i_510_;
							}
							if (i_485_ != 0) {
								int i_511_ = Class373.SINE[i_485_];
								int i_512_ = Class373.COSINE[i_485_];
								int i_513_ = vertexZ[i_504_] * i_511_ + vertexX[i_504_] * i_512_ + 16383 >> 14;
								vertexZ[i_504_] = vertexZ[i_504_] * i_512_ - vertexX[i_504_] * i_511_ + 16383 >> 14;
								vertexX[i_504_] = i_513_;
							}
							vertexX[i_504_] += anInt9203;
							vertexY[i_504_] += anInt9233;
							vertexZ[i_504_] += anInt9234;
						}
					} else {
						for (int element : is_502_) {
							int i_515_ = element;
							vertexX[i_515_] -= anInt9203;
							vertexY[i_515_] -= anInt9233;
							vertexZ[i_515_] -= anInt9234;
							if (i_484_ != 0) {
								int i_516_ = Class373.SINE[i_484_];
								int i_517_ = Class373.COSINE[i_484_];
								int i_518_ = vertexY[i_515_] * i_517_ - vertexZ[i_515_] * i_516_ + 16383 >> 14;
								vertexZ[i_515_] = vertexY[i_515_] * i_516_ + vertexZ[i_515_] * i_517_ + 16383 >> 14;
								vertexY[i_515_] = i_518_;
							}
							if (i_486_ != 0) {
								int i_519_ = Class373.SINE[i_486_];
								int i_520_ = Class373.COSINE[i_486_];
								int i_521_ = vertexY[i_515_] * i_519_ + vertexX[i_515_] * i_520_ + 16383 >> 14;
								vertexY[i_515_] = vertexY[i_515_] * i_520_ - vertexX[i_515_] * i_519_ + 16383 >> 14;
								vertexX[i_515_] = i_521_;
							}
							if (i_485_ != 0) {
								int i_522_ = Class373.SINE[i_485_];
								int i_523_ = Class373.COSINE[i_485_];
								int i_524_ = vertexZ[i_515_] * i_522_ + vertexX[i_515_] * i_523_ + 16383 >> 14;
								vertexZ[i_515_] = vertexZ[i_515_] * i_523_ - vertexX[i_515_] * i_522_ + 16383 >> 14;
								vertexX[i_515_] = i_524_;
							}
							vertexX[i_515_] += anInt9203;
							vertexY[i_515_] += anInt9233;
							vertexZ[i_515_] += anInt9234;
						}
					}
				}
			}
			if (bool) {
				for (int i_525_ = 0; i_525_ < i_488_; i_525_++) {
					int i_526_ = is[i_525_];
					if (i_526_ < anIntArrayArray9172.length) {
						int[] is_527_ = anIntArrayArray9172[i_526_];
						for (int i_529_ : is_527_) {
							int i_530_ = anIntArray9186[i_529_];
							int i_531_ = anIntArray9186[i_529_ + 1];
							for (int i_532_ = i_530_; i_532_ < i_531_ && aShortArray9218[i_532_] != 0; i_532_++) {
								int i_533_ = (aShortArray9218[i_532_] & 0xffff) - 1;
								if (i_486_ != 0) {
									int i_534_ = Class373.SINE[i_486_];
									int i_535_ = Class373.COSINE[i_486_];
									int i_536_ = aShortArray9212[i_533_] * i_534_ + aShortArray9177[i_533_] * i_535_
											+ 16383 >> 14;
									aShortArray9212[i_533_] = (short) (aShortArray9212[i_533_] * i_535_
											- aShortArray9177[i_533_] * i_534_ + 16383 >> 14);
									aShortArray9177[i_533_] = (short) i_536_;
								}
								if (i_484_ != 0) {
									int i_537_ = Class373.SINE[i_484_];
									int i_538_ = Class373.COSINE[i_484_];
									int i_539_ = aShortArray9212[i_533_] * i_538_ - aShortArray9179[i_533_] * i_537_
											+ 16383 >> 14;
									aShortArray9179[i_533_] = (short) (aShortArray9212[i_533_] * i_537_
											+ aShortArray9179[i_533_] * i_538_ + 16383 >> 14);
									aShortArray9212[i_533_] = (short) i_539_;
								}
								if (i_485_ != 0) {
									int i_540_ = Class373.SINE[i_485_];
									int i_541_ = Class373.COSINE[i_485_];
									int i_542_ = aShortArray9179[i_533_] * i_540_ + aShortArray9177[i_533_] * i_541_
											+ 16383 >> 14;
									aShortArray9179[i_533_] = (short) (aShortArray9179[i_533_] * i_541_
											- aShortArray9177[i_533_] * i_540_ + 16383 >> 14);
									aShortArray9177[i_533_] = (short) i_542_;
								}
							}
						}
					}
				}
				method14525();
			}
		} else if (i == 3) {
			for (int i_543_ = 0; i_543_ < i_488_; i_543_++) {
				int i_544_ = is[i_543_];
				if (i_544_ < anIntArrayArray9172.length) {
					int[] is_545_ = anIntArrayArray9172[i_544_];
					for (int element : is_545_) {
						int i_547_ = element;
						vertexX[i_547_] -= anInt9203;
						vertexY[i_547_] -= anInt9233;
						vertexZ[i_547_] -= anInt9234;
						vertexX[i_547_] = vertexX[i_547_] * i_484_ >> 7;
						vertexY[i_547_] = vertexY[i_547_] * i_485_ >> 7;
						vertexZ[i_547_] = vertexZ[i_547_] * i_486_ >> 7;
						vertexX[i_547_] += anInt9203;
						vertexY[i_547_] += anInt9233;
						vertexZ[i_547_] += anInt9234;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray9209 != null) {
				boolean bool_548_ = false;
				for (int i_549_ = 0; i_549_ < i_488_; i_549_++) {
					int i_550_ = is[i_549_];
					if (i_550_ < anIntArrayArray9209.length) {
						int[] is_551_ = anIntArrayArray9209[i_550_];
						for (int element : is_551_) {
							int i_553_ = element;
							int i_554_ = (aByteArray9187[i_553_] & 0xff) + i_484_ * 8;
							if (i_554_ < 0) {
								i_554_ = 0;
							} else if (i_554_ > 255) {
								i_554_ = 255;
							}
							aByteArray9187[i_553_] = (byte) i_554_;
						}
						bool_548_ = bool_548_ | is_551_.length > 0;
					}
				}
				if (bool_548_) {
					if (aClass324Array9222 != null) {
						for (int i_555_ = 0; i_555_ < anInt9221; i_555_++) {
							Class324 class324 = aClass324Array9222[i_555_];
							Class305 class305 = aClass305Array9197[i_555_];
							class305.anInt3310 = class305.anInt3310 & 0xffffff
									| 255 - (aByteArray9187[class324.anInt3429] & 0xff) << 24;
						}
					}
					method14524();
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray9209 != null) {
				boolean bool_556_ = false;
				for (int i_557_ = 0; i_557_ < i_488_; i_557_++) {
					int i_558_ = is[i_557_];
					if (i_558_ < anIntArrayArray9209.length) {
						int[] is_559_ = anIntArrayArray9209[i_558_];
						for (int element : is_559_) {
							int i_561_ = element;
							int i_562_ = aShortArray9193[i_561_] & 0xffff;
							int i_563_ = i_562_ >> 10 & 0x3f;
							int i_564_ = i_562_ >> 7 & 0x7;
							int i_565_ = i_562_ & 0x7f;
							i_563_ = i_563_ + i_484_ & 0x3f;
							i_564_ += i_485_ / 4;
							if (i_564_ < 0) {
								i_564_ = 0;
							} else if (i_564_ > 7) {
								i_564_ = 7;
							}
							i_565_ += i_486_;
							if (i_565_ < 0) {
								i_565_ = 0;
							} else if (i_565_ > 127) {
								i_565_ = 127;
							}
							aShortArray9193[i_561_] = (short) (i_563_ << 10 | i_564_ << 7 | i_565_);
						}
						bool_556_ = bool_556_ | is_559_.length > 0;
					}
				}
				if (bool_556_) {
					if (aClass324Array9222 != null) {
						for (int i_566_ = 0; i_566_ < anInt9221; i_566_++) {
							Class324 class324 = aClass324Array9222[i_566_];
							Class305 class305 = aClass305Array9197[i_566_];
							class305.anInt3310 = class305.anInt3310 & ~0xffffff
									| Class598.HSL_TABLE[aShortArray9193[class324.anInt3429] & 0xffff] & 0xffffff;
						}
					}
					method14524();
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9204 != null) {
				for (int i_567_ = 0; i_567_ < i_488_; i_567_++) {
					int i_568_ = is[i_567_];
					if (i_568_ < anIntArrayArray9204.length) {
						int[] is_569_ = anIntArrayArray9204[i_568_];
						for (int element : is_569_) {
							Class305 class305 = aClass305Array9197[element];
							class305.anInt3312 += i_484_;
							class305.anInt3311 += i_485_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9204 != null) {
				for (int i_571_ = 0; i_571_ < i_488_; i_571_++) {
					int i_572_ = is[i_571_];
					if (i_572_ < anIntArrayArray9204.length) {
						int[] is_573_ = anIntArrayArray9204[i_572_];
						for (int element : is_573_) {
							Class305 class305 = aClass305Array9197[element];
							class305.anInt3308 = class305.anInt3308 * i_484_ >> 7;
							class305.anInt3307 = class305.anInt3307 * i_485_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9204 != null) {
				for (int i_575_ = 0; i_575_ < i_488_; i_575_++) {
					int i_576_ = is[i_575_];
					if (i_576_ < anIntArrayArray9204.length) {
						int[] is_577_ = anIntArrayArray9204[i_576_];
						for (int element : is_577_) {
							Class305 class305 = aClass305Array9197[element];
							class305.anInt3309 = class305.anInt3309 + i_484_ & 0x3fff;
						}
					}
				}
			}
		}
	}
}
