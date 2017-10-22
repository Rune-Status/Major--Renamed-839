package com.jagex;

import jaclib.memory.Stream;
import jaggl.OpenGL;

public class OpenGlModel extends Model {
	static boolean aBool8939;
	static float[] aFloatArray8932 = new float[2];
	static long[] aLongArray8931;
	static final int anInt8863 = 4;
	static final int anInt8864 = 7;
	static final int anInt8867 = 1;
	static int anInt8874;
	static final int anInt8883 = 2;
	static final int anInt8886 = 4;
	static final int anInt8926 = 8;
	static int anInt8936;
	static final int anInt8937 = 16;
	static int anInt8938;
	static int[] anIntArray8933 = new int[8];
	static int[] anIntArray8934 = new int[8];
	static int[] anIntArray8935 = new int[8];

	static byte[] method14193(byte[] is, int i) {
		byte[] is_138_ = new byte[i];
		System.arraycopy(is, 0, is_138_, 0, i);
		return is_138_;
	}

	static short[] method14203(short[] is, int i) {
		short[] is_478_ = new short[i];
		System.arraycopy(is, 0, is_478_, 0, i);
		return is_478_;
	}

	static float[] method14204(float[] fs, int i) {
		float[] fs_481_ = new float[i];
		System.arraycopy(fs, 0, fs_481_, 0, i);
		return fs_481_;
	}

	static final int method14211(int i, int i_623_) {
		i_623_ = i_623_ * (i & 0x7f) >> 7;
		if (i_623_ < 2) {
			i_623_ = 2;
		} else if (i_623_ > 126) {
			i_623_ = 126;
		}
		return (i & 0xff80) + i_623_;
	}

	boolean aBool8869 = false;
	boolean aBool8873;
	boolean aBool8877 = false;
	boolean aBool8910;
	boolean computedBounds;
	byte aByte8901;
	byte[] aByteArray8876;
	byte[] aByteArray8889;
	Class115[] aClass115Array8896;
	Class127 aClass127_8865;
	Class130[] aClass130Array8928;
	OpenGlToolkit toolkit;
	Class145[] aClass145Array8925;
	Class86[] aClass86Array8929;
	OpenGlElementBufferPointer aClass92_8907;
	OpenGlArrayBufferPointer aClass94_8890;
	OpenGlArrayBufferPointer aClass94_8904;
	OpenGlArrayBufferPointer aClass94_8905;
	OpenGlArrayBufferPointer aClass94_8906;
	float[] aFloatArray8891;
	float[] aFloatArray8892;
	int anInt8872;
	int anInt8878 = 0;
	int anInt8893;
	int anInt8894;
	int uniqueVertices = 0;
	int anInt8911;
	int anInt8912;
	int anInt8916;
	int[] anIntArray8903;
	int[] sharedFaces;
	int[][] anIntArrayArray8918;
	int[][] anIntArrayArray8921;
	int[][] anIntArrayArray8930;
	ArrayBuffer anInterface11_8909;
	ElementArrayBuffer anInterface15_8908;
	short aShort8875;
	short maximumX;
	short minimumX;
	short minimumY;
	short maximumY;
	short aShort8917;
	short maximumZ;
	short aShort8922;
	short minimumZ;
	short[] aShortArray8868;
	short[] aShortArray8870;
	short[] aShortArray8884;
	short[] aShortArray8885;
	short[] aShortArray8887;
	short[] aShortArray8898;
	short[] aShortArray8899;
	short[] aShortArray8900;
	short[] aShortArray8902;
	short[] aShortArray8920;
	short[] aShortArray8924;
	int functionMask;
	int vertexCount = 0;
	int[] vertexX;
	int[] vertexY;
	int[] vertexZ;

	OpenGlModel(OpenGlToolkit toolkit) {
		anInt8893 = 0;
		anInt8894 = 0;
		aBool8910 = true;
		computedBounds = false;
		aBool8873 = false;
		this.toolkit = toolkit;
		aClass94_8890 = new OpenGlArrayBufferPointer(null, 5126, 3, 0);
		aClass94_8906 = new OpenGlArrayBufferPointer(null, 5126, 2, 0);
		aClass94_8905 = new OpenGlArrayBufferPointer(null, 5126, 3, 0);
		aClass94_8904 = new OpenGlArrayBufferPointer(null, 5121, 4, 0);
		aClass92_8907 = new OpenGlElementBufferPointer();
	}

	OpenGlModel(OpenGlToolkit toolkit, BaseModel base, int attributes, int ambience, int contrast, int i_2_) {
		aBool8910 = true;
		this.toolkit = toolkit;
		functionMask = attributes;
		anInt8916 = i_2_;

		if (Class105.method1888(attributes, i_2_)) {
			aClass94_8890 = new OpenGlArrayBufferPointer(null, 5126, 3, 0);
		}
		if (Class105.method1970(attributes, i_2_)) {
			aClass94_8906 = new OpenGlArrayBufferPointer(null, 5126, 2, 0);
		}
		if (Class105.method1924(attributes, i_2_)) {
			aClass94_8905 = new OpenGlArrayBufferPointer(null, 5126, 3, 0);
		}
		if (Class105.method1939(attributes, i_2_)) {
			aClass94_8904 = new OpenGlArrayBufferPointer(null, 5121, 4, 0);
		}
		if (Class105.method1892(attributes, i_2_)) {
			aClass92_8907 = new OpenGlElementBufferPointer();
		}

		TextureMetricsList metricsList = toolkit.metricsList;
		BillboardLoader billboardLoader = toolkit.billboardLoader;
		int[] is = new int[base.anInt1793];
		sharedFaces = new int[base.anInt1768 + 1];

		for (int i_3_ = 0; i_3_ < base.anInt1793; i_3_++) {
			if (base.aByteArray1775 == null || base.aByteArray1775[i_3_] != 2) {
				if (base.aShortArray1780 != null && base.aShortArray1780[i_3_] != -1) {
					TextureMetrics metrics = metricsList.get(base.aShortArray1780[i_3_] & 0xffff);
					if (((anInt8916 & 0x40) == 0 || !metrics.aBool1724) && metrics.aBool1723) {
						continue;
					}
				}

				is[anInt8893++] = i_3_;
				sharedFaces[base.aShortArray1769[i_3_]]++;
				sharedFaces[base.aShortArray1770[i_3_]]++;
				sharedFaces[base.aShortArray1766[i_3_]]++;
			}
		}

		anInt8894 = anInt8893;
		long[] ls = new long[anInt8893];
		boolean bool = (functionMask & 0x100) != 0;
		for (int i_4_ = 0; i_4_ < anInt8893; i_4_++) {
			int i_5_ = is[i_4_];
			TextureMetrics metrics = null;
			int i_6_ = 0;
			int i_7_ = 0;
			int i_8_ = 0;
			int i_9_ = 0;
			if (base.aClass148Array1795 != null) {
				boolean bool_10_ = false;
				for (Class148 class148 : base.aClass148Array1795) {
					if (i_5_ == class148.anInt1823 * 55597925) {
						Billboard billboard = billboardLoader.load(class148.billboard * -310433347);
						if (billboard.aBool3806) {
							bool_10_ = true;
						}
						if (billboard.texture * -1249209579 != -1) {
							TextureMetrics texture = metricsList.get(billboard.texture * -1249209579);
							if (texture.aClass554_1727 == Class554.aClass554_7500) {
								aBool8869 = true;
							}
						}
					}
				}
				if (bool_10_) {
					ls[i_4_] = 9223372036854775807L;
					anInt8894--;
					continue;
				}
			}
			if (base.aClass145Array1777 != null) {
				boolean bool_13_ = false;
				for (Class145 class145 : base.aClass145Array1777) {
					if (i_5_ == class145.anInt1804 * -15453957) {
						ParticleProducerDefinition definition = toolkit.particleLoader.load(class145.producer
								* -471432283);
						if (definition.aBool3743) {
							bool_13_ = true;
						}
					}
				}
				if (bool_13_) {
					ls[i_4_] = 9223372036854775807L;
					anInt8894--;
					continue;
				}
			}
			int i_15_ = -1;
			if (base.aShortArray1780 != null) {
				i_15_ = base.aShortArray1780[i_5_];
				if (i_15_ != -1) {
					metrics = metricsList.get(i_15_ & 0xffff);
					if ((anInt8916 & 0x40) == 0 || !metrics.aBool1724) {
						i_8_ = metrics.aByte1719;
						i_9_ = metrics.aByte1720;
						if (metrics.aByte1728 != 0 || metrics.aByte1700 != 0) {
							aBool8877 = true;
						}
					} else {
						i_15_ = -1;
						metrics = null;
					}
				}
			}
			boolean bool_16_ = base.aByteArray1788 != null && base.aByteArray1788[i_5_] != 0 || metrics != null
					&& metrics.aClass554_1727 != Class554.aClass554_7499;
			if ((bool || bool_16_) && base.aByteArray1790 != null) {
				i_6_ += base.aByteArray1790[i_5_] << 17;
			}
			if (bool_16_) {
				i_6_ += 65536;
			}
			i_6_ += (i_8_ & 0xff) << 8;
			i_6_ += i_9_ & 0xff;
			i_7_ += (i_15_ & 0xffff) << 16;
			i_7_ += i_4_ & 0xffff;
			ls[i_4_] = ((long) i_6_ << 32) + i_7_;
			aBool8869 |= bool_16_;
			OpenGlModel class143_sub1_17_ = this;
			class143_sub1_17_.aBool8877 = class143_sub1_17_.aBool8877
					| (metrics != null && (metrics.aByte1728 != 0 || metrics.aByte1700 != 0));
		}
		Class431.method7148(ls, is);
		anInt8878 = base.vertexCount;
		vertexCount = base.anInt1768;
		vertexX = base.vertexX;
		vertexY = base.vertexY;
		vertexZ = base.vertexZ;
		aShortArray8884 = base.aShortArray1764;
		VertexNormal[] class100s = new VertexNormal[vertexCount];
		aClass145Array8925 = base.aClass145Array1777;
		aClass115Array8896 = base.aClass115Array1800;

		if (base.aClass148Array1795 != null) {
			anInt8872 = base.aClass148Array1795.length;
			aClass130Array8928 = new Class130[anInt8872];
			aClass86Array8929 = new Class86[anInt8872];
			for (int i_18_ = 0; i_18_ < anInt8872; i_18_++) {
				Class148 class148 = base.aClass148Array1795[i_18_];
				Billboard class355 = billboardLoader.load(class148.billboard * -310433347);
				int i_19_ = -1;
				for (int i_20_ = 0; i_20_ < anInt8893; i_20_++) {
					if (is[i_20_] == class148.anInt1823 * 55597925) {
						i_19_ = i_20_;
						break;
					}
				}
				if (i_19_ == -1) {
					throw new RuntimeException();
				}
				int i_21_ = Class598.HSL_TABLE[base.aShortArray1779[class148.anInt1823 * 55597925] & 0xffff] & 0xffffff;
				i_21_ = i_21_
						| 255 - (base.aByteArray1788 != null ? base.aByteArray1788[class148.anInt1823 * 55597925] : 0) << 24;
				aClass130Array8928[i_18_] = new Class130(i_19_, base.aShortArray1769[class148.anInt1823 * 55597925],
						base.aShortArray1770[class148.anInt1823 * 55597925],
						base.aShortArray1766[class148.anInt1823 * 55597925], class355.anInt3808 * 923292647,
						class355.anInt3809 * -202613523, class355.texture * -1249209579,
						class355.anInt3811 * 1336839747, class355.anInt3813 * -8778329, class355.aBool3806,
						class355.aBool3807, class148.anInt1824 * 214376177);
				aClass86Array8929[i_18_] = new Class86(i_21_);
			}
		}

		int i_22_ = anInt8893 * 3;
		aShortArray8885 = new short[i_22_];
		aShortArray8887 = new short[i_22_];
		aShortArray8868 = new short[i_22_];
		aByteArray8889 = new byte[i_22_];
		aFloatArray8891 = new float[i_22_];
		aFloatArray8892 = new float[i_22_];
		aShortArray8870 = new short[anInt8893];
		aByteArray8876 = new byte[anInt8893];
		aShortArray8920 = new short[anInt8893];
		aShortArray8898 = new short[anInt8893];
		aShortArray8899 = new short[anInt8893];
		aShortArray8900 = new short[anInt8893];
		if (base.aShortArray1753 != null) {
			aShortArray8902 = new short[anInt8893];
		}
		aShort8917 = (short) ambience;
		aShort8875 = (short) contrast;
		aShortArray8924 = new short[i_22_];
		aLongArray8931 = new long[i_22_];
		int i_23_ = 0;
		for (int i_24_ = 0; i_24_ < base.anInt1768; i_24_++) {
			int i_25_ = sharedFaces[i_24_];
			sharedFaces[i_24_] = i_23_;
			i_23_ += i_25_;
			class100s[i_24_] = new VertexNormal();
		}
		sharedFaces[base.anInt1768] = i_23_;
		Class135 class135 = method2888(base, is, anInt8893);
		Class88[] class88s = new Class88[base.anInt1793];
		for (int i_26_ = 0; i_26_ < base.anInt1793; i_26_++) {
			short i_27_ = base.aShortArray1769[i_26_];
			short i_28_ = base.aShortArray1770[i_26_];
			short i_29_ = base.aShortArray1766[i_26_];
			int i_30_ = vertexX[i_28_] - vertexX[i_27_];
			int i_31_ = vertexY[i_28_] - vertexY[i_27_];
			int i_32_ = vertexZ[i_28_] - vertexZ[i_27_];
			int i_33_ = vertexX[i_29_] - vertexX[i_27_];
			int i_34_ = vertexY[i_29_] - vertexY[i_27_];
			int i_35_ = vertexZ[i_29_] - vertexZ[i_27_];
			int i_36_ = i_31_ * i_35_ - i_34_ * i_32_;
			int i_37_ = i_32_ * i_33_ - i_35_ * i_30_;
			int i_38_;
			for (i_38_ = i_30_ * i_34_ - i_33_ * i_31_; i_36_ > 8192 || i_37_ > 8192 || i_38_ > 8192 || i_36_ < -8192
					|| i_37_ < -8192 || i_38_ < -8192; i_38_ >>= 1) {
				i_36_ >>= 1;
				i_37_ >>= 1;
			}
			int distance = (int) Math.sqrt(i_36_ * i_36_ + i_37_ * i_37_ + i_38_ * i_38_);
			if (distance <= 0) {
				distance = 1;
			}
			i_36_ = i_36_ * 256 / distance;
			i_37_ = i_37_ * 256 / distance;
			i_38_ = i_38_ * 256 / distance;
			byte i_40_ = base.aByteArray1775 == null ? (byte) 0 : base.aByteArray1775[i_26_];
			if (i_40_ == 0) {
				VertexNormal normal = class100s[i_27_];
				normal.anInt1317 += i_36_;
				normal.anInt1316 += i_37_;
				normal.anInt1315 += i_38_;
				normal.faceCount++;
				normal = class100s[i_28_];
				normal.anInt1317 += i_36_;
				normal.anInt1316 += i_37_;
				normal.anInt1315 += i_38_;
				normal.faceCount++;
				normal = class100s[i_29_];
				normal.anInt1317 += i_36_;
				normal.anInt1316 += i_37_;
				normal.anInt1315 += i_38_;
				normal.faceCount++;
			} else if (i_40_ == 1) {
				Class88 class88 = class88s[i_26_] = new Class88();
				class88.anInt1238 = i_36_;
				class88.anInt1239 = i_37_;
				class88.anInt1237 = i_38_;
			}
		}
		for (int i_41_ = 0; i_41_ < anInt8893; i_41_++) {
			int i_42_ = is[i_41_];
			int i_43_ = base.aShortArray1779[i_42_] & 0xffff;
			int i_44_ = base.aByteArray1788 != null ? base.aByteArray1788[i_42_] & 0xff : 0;
			short i_45_ = base.aShortArray1780 == null ? (short) -1 : base.aShortArray1780[i_42_];
			if (i_45_ != -1 && (anInt8916 & 0x40) != 0 && metricsList.get(i_45_).aBool1724) {
				i_45_ = (short) -1;
			}
			float f = 0.0F;
			float f_46_ = 0.0F;
			float f_47_ = 0.0F;
			float f_48_ = 0.0F;
			float f_49_ = 0.0F;
			float f_50_ = 0.0F;
			long l;
			long l_51_;
			long l_52_;
			if (i_45_ != -1) {
				int i_53_ = base.aShortArray1778 != null ? base.aShortArray1778[i_42_] : -1;
				if (i_53_ == 32766) {
					int i_54_ = base.aByteArray1772[i_42_] & 0xff;
					int i_55_ = base.aByteArray1773[i_42_] & 0xff;
					int i_56_ = base.aByteArray1758[i_42_] & 0xff;
					i_54_ += base.anIntArray1762[base.aShortArray1769[i_42_]];
					l_52_ = i_54_;
					i_55_ += base.anIntArray1762[base.aShortArray1770[i_42_]];
					l_51_ = i_54_;
					i_56_ += base.anIntArray1762[base.aShortArray1766[i_42_]];
					l = i_54_;
					f = base.aFloatArray1774[i_54_];
					f_46_ = base.aFloatArray1767[i_54_];
					f_47_ = base.aFloatArray1774[i_55_];
					f_48_ = base.aFloatArray1767[i_55_];
					f_49_ = base.aFloatArray1774[i_56_];
					f_50_ = base.aFloatArray1767[i_56_];
				} else if (i_53_ == -1) {
					f = 0.0F;
					f_46_ = 1.0F;
					l_52_ = 65535L;
					f_47_ = 1.0F;
					f_48_ = 1.0F;
					l_51_ = 131071L;
					f_49_ = 0.0F;
					f_50_ = 0.0F;
					l = 196607L;
				} else {
					i_53_ &= 0xffff;
					int i_57_ = 0;
					int i_58_ = 0;
					int i_59_ = 0;
					byte i_60_ = base.aByteArray1787[i_53_];
					if (i_60_ == 0) {
						short i_61_ = base.aShortArray1769[i_42_];
						short i_62_ = base.aShortArray1770[i_42_];
						short i_63_ = base.aShortArray1766[i_42_];
						short i_64_ = base.aShortArray1785[i_53_];
						short i_65_ = base.aShortArray1789[i_53_];
						short i_66_ = base.aShortArray1801[i_53_];
						float f_67_ = base.vertexX[i_64_];
						float f_68_ = base.vertexY[i_64_];
						float f_69_ = base.vertexZ[i_64_];
						float f_70_ = base.vertexX[i_65_] - f_67_;
						float f_71_ = base.vertexY[i_65_] - f_68_;
						float f_72_ = base.vertexZ[i_65_] - f_69_;
						float f_73_ = base.vertexX[i_66_] - f_67_;
						float f_74_ = base.vertexY[i_66_] - f_68_;
						float f_75_ = base.vertexZ[i_66_] - f_69_;
						float f_76_ = base.vertexX[i_61_] - f_67_;
						float f_77_ = base.vertexY[i_61_] - f_68_;
						float f_78_ = base.vertexZ[i_61_] - f_69_;
						float f_79_ = base.vertexX[i_62_] - f_67_;
						float f_80_ = base.vertexY[i_62_] - f_68_;
						float f_81_ = base.vertexZ[i_62_] - f_69_;
						float f_82_ = base.vertexX[i_63_] - f_67_;
						float f_83_ = base.vertexY[i_63_] - f_68_;
						float f_84_ = base.vertexZ[i_63_] - f_69_;
						float f_85_ = f_71_ * f_75_ - f_72_ * f_74_;
						float f_86_ = f_72_ * f_73_ - f_70_ * f_75_;
						float f_87_ = f_70_ * f_74_ - f_71_ * f_73_;
						float f_88_ = f_74_ * f_87_ - f_75_ * f_86_;
						float f_89_ = f_75_ * f_85_ - f_73_ * f_87_;
						float f_90_ = f_73_ * f_86_ - f_74_ * f_85_;
						float f_91_ = 1.0F / (f_88_ * f_70_ + f_89_ * f_71_ + f_90_ * f_72_);
						f = (f_88_ * f_76_ + f_89_ * f_77_ + f_90_ * f_78_) * f_91_;
						f_47_ = (f_88_ * f_79_ + f_89_ * f_80_ + f_90_ * f_81_) * f_91_;
						f_49_ = (f_88_ * f_82_ + f_89_ * f_83_ + f_90_ * f_84_) * f_91_;
						f_88_ = f_71_ * f_87_ - f_72_ * f_86_;
						f_89_ = f_72_ * f_85_ - f_70_ * f_87_;
						f_90_ = f_70_ * f_86_ - f_71_ * f_85_;
						f_91_ = 1.0F / (f_88_ * f_73_ + f_89_ * f_74_ + f_90_ * f_75_);
						f_46_ = (f_88_ * f_76_ + f_89_ * f_77_ + f_90_ * f_78_) * f_91_;
						f_48_ = (f_88_ * f_79_ + f_89_ * f_80_ + f_90_ * f_81_) * f_91_;
						f_50_ = (f_88_ * f_82_ + f_89_ * f_83_ + f_90_ * f_84_) * f_91_;
					} else {
						short i_92_ = base.aShortArray1769[i_42_];
						short i_93_ = base.aShortArray1770[i_42_];
						short i_94_ = base.aShortArray1766[i_42_];
						int i_95_ = class135.anIntArray1575[i_53_];
						int i_96_ = class135.anIntArray1572[i_53_];
						int i_97_ = class135.anIntArray1574[i_53_];
						float[] fs = class135.aFloatArrayArray1573[i_53_];
						byte i_98_ = base.aByteArray1798[i_53_];
						float f_99_ = base.anIntArray1794[i_53_] / 256.0F;
						if (i_60_ == 1) {
							float f_100_ = base.anIntArray1760[i_53_] / 1024.0F;
							method2885(base.vertexX[i_92_], base.vertexY[i_92_], base.vertexZ[i_92_], i_95_, i_96_,
									i_97_, fs, f_100_, i_98_, f_99_, aFloatArray8932);
							f = aFloatArray8932[0];
							f_46_ = aFloatArray8932[1];
							method2885(base.vertexX[i_93_], base.vertexY[i_93_], base.vertexZ[i_93_], i_95_, i_96_,
									i_97_, fs, f_100_, i_98_, f_99_, aFloatArray8932);
							f_47_ = aFloatArray8932[0];
							f_48_ = aFloatArray8932[1];
							method2885(base.vertexX[i_94_], base.vertexY[i_94_], base.vertexZ[i_94_], i_95_, i_96_,
									i_97_, fs, f_100_, i_98_, f_99_, aFloatArray8932);
							f_49_ = aFloatArray8932[0];
							f_50_ = aFloatArray8932[1];
							float f_101_ = f_100_ / 2.0F;
							if ((i_98_ & 0x1) == 0) {
								if (f_47_ - f > f_101_) {
									f_47_ -= f_100_;
									i_58_ = 1;
								} else if (f - f_47_ > f_101_) {
									f_47_ += f_100_;
									i_58_ = 2;
								}
								if (f_49_ - f > f_101_) {
									f_49_ -= f_100_;
									i_59_ = 1;
								} else if (f - f_49_ > f_101_) {
									f_49_ += f_100_;
									i_59_ = 2;
								}
							} else {
								if (f_48_ - f_46_ > f_101_) {
									f_48_ -= f_100_;
									i_58_ = 1;
								} else if (f_46_ - f_48_ > f_101_) {
									f_48_ += f_100_;
									i_58_ = 2;
								}
								if (f_50_ - f_46_ > f_101_) {
									f_50_ -= f_100_;
									i_59_ = 1;
								} else if (f_46_ - f_50_ > f_101_) {
									f_50_ += f_100_;
									i_59_ = 2;
								}
							}
						} else if (i_60_ == 2) {
							float f_102_ = base.anIntArray1757[i_53_] / 256.0F;
							float f_103_ = base.anIntArray1796[i_53_] / 256.0F;
							int i_104_ = base.vertexX[i_93_] - base.vertexX[i_92_];
							int i_105_ = base.vertexY[i_93_] - base.vertexY[i_92_];
							int i_106_ = base.vertexZ[i_93_] - base.vertexZ[i_92_];
							int i_107_ = base.vertexX[i_94_] - base.vertexX[i_92_];
							int i_108_ = base.vertexY[i_94_] - base.vertexY[i_92_];
							int i_109_ = base.vertexZ[i_94_] - base.vertexZ[i_92_];
							int i_110_ = i_105_ * i_109_ - i_108_ * i_106_;
							int i_111_ = i_106_ * i_107_ - i_109_ * i_104_;
							int i_112_ = i_104_ * i_108_ - i_107_ * i_105_;
							float f_113_ = 64.0F / base.anIntArray1791[i_53_];
							float f_114_ = 64.0F / base.anIntArray1792[i_53_];
							float f_115_ = 64.0F / base.anIntArray1760[i_53_];
							float f_116_ = (i_110_ * fs[0] + i_111_ * fs[1] + i_112_ * fs[2]) / f_113_;
							float f_117_ = (i_110_ * fs[3] + i_111_ * fs[4] + i_112_ * fs[5]) / f_114_;
							float f_118_ = (i_110_ * fs[6] + i_111_ * fs[7] + i_112_ * fs[8]) / f_115_;
							i_57_ = method2967(f_116_, f_117_, f_118_);
							method2887(base.vertexX[i_92_], base.vertexY[i_92_], base.vertexZ[i_92_], i_95_, i_96_,
									i_97_, i_57_, fs, i_98_, f_99_, f_102_, f_103_, aFloatArray8932);
							f = aFloatArray8932[0];
							f_46_ = aFloatArray8932[1];
							method2887(base.vertexX[i_93_], base.vertexY[i_93_], base.vertexZ[i_93_], i_95_, i_96_,
									i_97_, i_57_, fs, i_98_, f_99_, f_102_, f_103_, aFloatArray8932);
							f_47_ = aFloatArray8932[0];
							f_48_ = aFloatArray8932[1];
							method2887(base.vertexX[i_94_], base.vertexY[i_94_], base.vertexZ[i_94_], i_95_, i_96_,
									i_97_, i_57_, fs, i_98_, f_99_, f_102_, f_103_, aFloatArray8932);
							f_49_ = aFloatArray8932[0];
							f_50_ = aFloatArray8932[1];
						} else if (i_60_ == 3) {
							method3010(base.vertexX[i_92_], base.vertexY[i_92_], base.vertexZ[i_92_], i_95_, i_96_,
									i_97_, fs, i_98_, f_99_, aFloatArray8932);
							f = aFloatArray8932[0];
							f_46_ = aFloatArray8932[1];
							method3010(base.vertexX[i_93_], base.vertexY[i_93_], base.vertexZ[i_93_], i_95_, i_96_,
									i_97_, fs, i_98_, f_99_, aFloatArray8932);
							f_47_ = aFloatArray8932[0];
							f_48_ = aFloatArray8932[1];
							method3010(base.vertexX[i_94_], base.vertexY[i_94_], base.vertexZ[i_94_], i_95_, i_96_,
									i_97_, fs, i_98_, f_99_, aFloatArray8932);
							f_49_ = aFloatArray8932[0];
							f_50_ = aFloatArray8932[1];
							if ((i_98_ & 0x1) == 0) {
								if (f_47_ - f > 0.5F) {
									f_47_--;
									i_58_ = 1;
								} else if (f - f_47_ > 0.5F) {
									f_47_++;
									i_58_ = 2;
								}
								if (f_49_ - f > 0.5F) {
									f_49_--;
									i_59_ = 1;
								} else if (f - f_49_ > 0.5F) {
									f_49_++;
									i_59_ = 2;
								}
							} else {
								if (f_48_ - f_46_ > 0.5F) {
									f_48_--;
									i_58_ = 1;
								} else if (f_46_ - f_48_ > 0.5F) {
									f_48_++;
									i_58_ = 2;
								}
								if (f_50_ - f_46_ > 0.5F) {
									f_50_--;
									i_59_ = 1;
								} else if (f_46_ - f_50_ > 0.5F) {
									f_50_++;
									i_59_ = 2;
								}
							}
						}
					}
					l_52_ = i_57_ << 16 | i_53_;
					l_51_ = i_58_ << 19 | l_52_;
					l = i_59_ << 19 | l_52_;
				}
			} else {
				l = 0L;
				l_51_ = 0L;
				l_52_ = 0L;
			}
			byte i_119_ = base.aByteArray1775 != null ? base.aByteArray1775[i_42_] : (byte) 0;
			if (i_119_ == 0) {
				long l_120_ = (i_43_ << 8) + i_44_;
				short i_121_ = base.aShortArray1769[i_42_];
				short i_122_ = base.aShortArray1770[i_42_];
				short i_123_ = base.aShortArray1766[i_42_];
				VertexNormal class100 = class100s[i_121_];
				aShortArray8920[i_41_] = method14200(base, i_121_, l_120_ | l_52_ << 24, class100.anInt1317,
						class100.anInt1316, class100.anInt1315, class100.faceCount, f, f_46_);
				class100 = class100s[i_122_];
				aShortArray8898[i_41_] = method14200(base, i_122_, l_120_ | l_51_ << 24, class100.anInt1317,
						class100.anInt1316, class100.anInt1315, class100.faceCount, f_47_, f_48_);
				class100 = class100s[i_123_];
				aShortArray8899[i_41_] = method14200(base, i_123_, l_120_ | l << 24, class100.anInt1317,
						class100.anInt1316, class100.anInt1315, class100.faceCount, f_49_, f_50_);
			} else if (i_119_ == 1) {
				Class88 class88 = class88s[i_42_];
				long l_124_ = ((long) (class88.anInt1238 & ~0x7fffffff) << 9)
						+ ((long) (class88.anInt1239 + 256) << 32) + ((long) (class88.anInt1237 + 256) << 24)
						+ (i_43_ << 8) + i_44_;
				aShortArray8920[i_41_] = method14200(base, base.aShortArray1769[i_42_], l_124_ | l_52_ << 41,
						class88.anInt1238, class88.anInt1239, class88.anInt1237, 0, f, f_46_);
				aShortArray8898[i_41_] = method14200(base, base.aShortArray1770[i_42_], l_124_ | l_52_ << 41,
						class88.anInt1238, class88.anInt1239, class88.anInt1237, 0, f_47_, f_48_);
				aShortArray8899[i_41_] = method14200(base, base.aShortArray1766[i_42_], l_124_ | l_52_ << 41,
						class88.anInt1238, class88.anInt1239, class88.anInt1237, 0, f_49_, f_50_);
			}
			if (base.aByteArray1788 != null) {
				aByteArray8876[i_41_] = base.aByteArray1788[i_42_];
			}
			if (base.aShortArray1753 != null) {
				aShortArray8902[i_41_] = base.aShortArray1753[i_42_];
			}
			aShortArray8870[i_41_] = base.aShortArray1779[i_42_];
			aShortArray8900[i_41_] = i_45_;
		}
		int i_125_ = 0;
		short i_126_ = -10000;
		for (int i_127_ = 0; i_127_ < anInt8894; i_127_++) {
			short i_128_ = aShortArray8900[i_127_];
			if (i_128_ != i_126_) {
				i_125_++;
				i_126_ = i_128_;
			}
		}
		anIntArray8903 = new int[i_125_ + 1];
		i_125_ = 0;
		i_126_ = (short) -10000;
		for (int i_129_ = 0; i_129_ < anInt8894; i_129_++) {
			short i_130_ = aShortArray8900[i_129_];
			if (i_130_ != i_126_) {
				anIntArray8903[i_125_++] = i_129_;
				i_126_ = i_130_;
			}
		}
		anIntArray8903[i_125_] = anInt8894;
		aLongArray8931 = null;
		aShortArray8885 = method14203(aShortArray8885, uniqueVertices);
		aShortArray8887 = method14203(aShortArray8887, uniqueVertices);
		aShortArray8868 = method14203(aShortArray8868, uniqueVertices);
		aByteArray8889 = method14193(aByteArray8889, uniqueVertices);
		aFloatArray8891 = method14204(aFloatArray8891, uniqueVertices);
		aFloatArray8892 = method14204(aFloatArray8892, uniqueVertices);
		if (base.anIntArray1763 != null && Class105.method1929(attributes, anInt8916)) {
			anIntArrayArray8921 = base.method3096(false);
		}
		if (base.aClass148Array1795 != null && Class105.method1907(attributes, anInt8916)) {
			anIntArrayArray8930 = base.method3098();
		}
		if (base.anIntArray1781 != null && Class105.method1912(attributes, anInt8916)) {
			int i_131_ = 0;
			int[] is_132_ = new int[256];
			for (int i_133_ = 0; i_133_ < anInt8893; i_133_++) {
				int i_134_ = base.anIntArray1781[is[i_133_]];
				if (i_134_ >= 0) {
					is_132_[i_134_]++;
					if (i_134_ > i_131_) {
						i_131_ = i_134_;
					}
				}
			}
			anIntArrayArray8918 = new int[i_131_ + 1][];
			for (int i_135_ = 0; i_135_ <= i_131_; i_135_++) {
				anIntArrayArray8918[i_135_] = new int[is_132_[i_135_]];
				is_132_[i_135_] = 0;
			}
			for (int i_136_ = 0; i_136_ < anInt8893; i_136_++) {
				int i_137_ = base.anIntArray1781[is[i_136_]];
				if (i_137_ >= 0) {
					anIntArrayArray8918[i_137_][is_132_[i_137_]++] = i_136_;
				}
			}
		}
	}

	@Override
	public int functionMask() {
		return functionMask;
	}

	@Override
	public int method2886() {
		if (!computedBounds) {
			computeBounds();
		}
		return minimumZ;
	}

	@Override
	public Model method2890(byte i, int i_139_, boolean bool) {
		boolean bool_140_ = false;
		OpenGlModel class143_sub1_141_;
		OpenGlModel class143_sub1_142_;
		if (i > 0 && i <= 8) {
			class143_sub1_142_ = toolkit.aClass143_Sub1Array9138[i - 1];
			class143_sub1_141_ = toolkit.aClass143_Sub1Array8989[i - 1];
			bool_140_ = true;
		} else {
			class143_sub1_141_ = class143_sub1_142_ = new OpenGlModel(toolkit);
		}
		return method14195(class143_sub1_141_, class143_sub1_142_, i_139_, bool_140_, bool);
	}

	@Override
	public void method2895(int angle) {
		int sin = Class373.SINE[angle];
		int cos = Class373.COSINE[angle];

		for (int vertex = 0; vertex < vertexCount; vertex++) {
			int x = vertexZ[vertex] * sin + vertexX[vertex] * cos >> 14;
			vertexZ[vertex] = vertexZ[vertex] * cos - vertexX[vertex] * sin >> 14;
			vertexX[vertex] = x;
		}

		for (int i_676_ = 0; i_676_ < uniqueVertices; i_676_++) {
			int i_677_ = aShortArray8868[i_676_] * sin + aShortArray8885[i_676_] * cos >> 14;
			aShortArray8868[i_676_] = (short) (aShortArray8868[i_676_] * cos - aShortArray8885[i_676_] * sin >> 14);
			aShortArray8885[i_676_] = (short) i_677_;
		}

		if (aClass94_8905 == null && aClass94_8904 != null) {
			aClass94_8904.buffer = null;
		}

		if (aClass94_8905 != null) {
			aClass94_8905.buffer = null;
		}

		if (aClass94_8890 != null) {
			aClass94_8890.buffer = null;
		}

		computedBounds = false;
	}

	@Override
	public void method2899() {
		for (int i = 0; i < vertexCount; i++) {
			vertexZ[i] = -vertexZ[i];
		}
		for (int i = 0; i < uniqueVertices; i++) {
			aShortArray8868[i] = (short) -aShortArray8868[i];
		}
		for (int i = 0; i < anInt8893; i++) {
			short i_626_ = aShortArray8920[i];
			aShortArray8920[i] = aShortArray8899[i];
			aShortArray8899[i] = i_626_;
		}
		if (aClass94_8905 == null && aClass94_8904 != null) {
			aClass94_8904.buffer = null;
		}
		if (aClass94_8905 != null) {
			aClass94_8905.buffer = null;
		}
		if (aClass94_8890 != null) {
			aClass94_8890.buffer = null;
		}
		if (aClass92_8907 != null) {
			aClass92_8907.buffer = null;
		}
		computedBounds = false;
	}

	@Override
	public void method2901(int i, int i_174_, Ground class120, Ground class120_175_, int i_176_, int i_177_, int i_178_) {
		if (!computedBounds) {
			computeBounds();
		}
		int i_179_ = i_176_ + minimumX;
		int i_180_ = i_176_ + maximumX;
		int i_181_ = i_178_ + minimumZ;
		int i_182_ = i_178_ + maximumZ;
		if (i != 1
				&& i != 2
				&& i != 3
				&& i != 5
				|| i_179_ >= 0
				&& i_180_ + class120.tileUnits * 1668096025 >> class120.tileScale * -333236347 < class120.width * 767658255
				&& i_181_ >= 0
				&& i_182_ + class120.tileUnits * 1668096025 >> class120.tileScale * -333236347 < class120.length * 295124605) {
			if (i == 4 || i == 5) {
				if (class120_175_ == null
						|| i_179_ < 0
						|| i_180_ + class120_175_.tileUnits * 1668096025 >> class120_175_.tileScale * -333236347 >= class120_175_.width * 767658255
						|| i_181_ < 0
						|| i_182_ + class120_175_.tileUnits * 1668096025 >> class120_175_.tileScale * -333236347 >= class120_175_.length * 295124605) {
					return;
				}
			} else {
				i_179_ >>= class120.tileScale * -333236347;
				i_180_ = i_180_ + class120.tileUnits * 1668096025 - 1 >> class120.tileScale * -333236347;
				i_181_ >>= class120.tileScale * -333236347;
				i_182_ = i_182_ + class120.tileUnits * 1668096025 - 1 >> class120.tileScale * -333236347;
				if (class120.getTileHeight(i_179_, i_181_) == i_177_
						&& class120.getTileHeight(i_180_, i_181_) == i_177_
						&& class120.getTileHeight(i_179_, i_182_) == i_177_
						&& class120.getTileHeight(i_180_, i_182_) == i_177_) {
					return;
				}
			}
			if (i == 1) {
				for (int i_183_ = 0; i_183_ < vertexCount; i_183_++) {
					vertexY[i_183_] = vertexY[i_183_]
							+ class120.method2206(vertexX[i_183_] + i_176_, vertexZ[i_183_] + i_178_, 1839011695)
							- i_177_;
				}
			} else if (i == 2) {
				int i_184_ = minimumY;
				if (i_184_ == 0) {
					return;
				}
				for (int i_185_ = 0; i_185_ < vertexCount; i_185_++) {
					int i_186_ = (vertexY[i_185_] << 16) / i_184_;
					if (i_186_ < i_174_) {
						vertexY[i_185_] = vertexY[i_185_]
								+ (class120.method2206(vertexX[i_185_] + i_176_, vertexZ[i_185_] + i_178_, 992977355) - i_177_)
								* (i_174_ - i_186_) / i_174_;
					}
				}
			} else if (i == 3) {
				int i_187_ = (i_174_ & 0xff) * 4;
				int i_188_ = (i_174_ >> 8 & 0xff) * 4;
				int i_189_ = (i_174_ >> 16 & 0xff) << 6;
				int i_190_ = (i_174_ >> 24 & 0xff) << 6;
				if (i_176_ - (i_187_ >> 1) < 0
						|| i_176_ + (i_187_ >> 1) + class120.tileUnits * 1668096025 >= class120.width * 767658255 << class120.tileScale
								* -333236347
						|| i_178_ - (i_188_ >> 1) < 0
						|| i_178_ + (i_188_ >> 1) + class120.tileUnits * 1668096025 >= class120.length * 295124605 << class120.tileScale
								* -333236347) {
					return;
				}
				method2902(class120, i_176_, i_177_, i_178_, i_187_, i_188_, i_189_, i_190_);
			} else if (i == 4) {
				int i_191_ = maximumY - minimumY;
				for (int i_192_ = 0; i_192_ < vertexCount; i_192_++) {
					vertexY[i_192_] = vertexY[i_192_]
							+ class120_175_.method2206(vertexX[i_192_] + i_176_, vertexZ[i_192_] + i_178_, -1195686099)
							- i_177_ + i_191_;
				}
			} else if (i == 5) {
				int i_193_ = maximumY - minimumY;
				for (int i_194_ = 0; i_194_ < vertexCount; i_194_++) {
					int i_195_ = vertexX[i_194_] + i_176_;
					int i_196_ = vertexZ[i_194_] + i_178_;
					int i_197_ = class120.method2206(i_195_, i_196_, -396596552);
					int i_198_ = class120_175_.method2206(i_195_, i_196_, 2034696990);
					int i_199_ = i_197_ - i_198_ - i_174_;
					vertexY[i_194_] = ((vertexY[i_194_] << 8) / i_193_ * i_199_ >> 8) - (i_177_ - i_197_);
				}
			}
			if (aClass94_8890 != null) {
				aClass94_8890.buffer = null;
			}
			computedBounds = false;
		}
	}

	@Override
	public void method2917(Class405 class405, Class139 class139, int i) {
		if ((i & 0x2) != 0) {
			OpenGL.glPolygonMode(1032, 6913);
		}
		if (uniqueVertices != 0) {
			Matrix4f class399 = toolkit.aClass399_9036;
			Matrix4f class399_504_ = toolkit.aClass399_9050;
			Matrix4f class399_505_ = toolkit.aClass399_9051;
			class399_504_.method6548(class405);
			class399_505_.copyFrom(class399_504_);
			class399_505_.method6547(toolkit.aClass399_9087);
			if (!computedBounds) {
				computeBounds();
			}
			float[] fs = toolkit.aFloatArray9039;
			class399_504_.method6553(0.0F, minimumY, 0.0F, fs);
			float f = fs[0];
			float f_506_ = fs[1];
			float f_507_ = fs[2];
			class399_504_.method6553(0.0F, maximumY, 0.0F, fs);
			float f_508_ = fs[0];
			float f_509_ = fs[1];
			float f_510_ = fs[2];
			for (int i_511_ = 0; i_511_ < 6; i_511_++) {
				float[] fs_512_ = toolkit.aFloatArrayArray9139[i_511_];
				float f_513_ = fs_512_[0] * f + fs_512_[1] * f_506_ + fs_512_[2] * f_507_ + fs_512_[3] + anInt8912;
				float f_514_ = fs_512_[0] * f_508_ + fs_512_[1] * f_509_ + fs_512_[2] * f_510_ + fs_512_[3] + anInt8912;
				if (f_513_ < 0.0F && f_514_ < 0.0F) {
					return;
				}
			}
			if (class139 != null) {
				boolean bool = false;
				boolean bool_515_ = true;
				int i_516_ = minimumX + maximumX >> 1;
				int i_517_ = minimumZ + maximumZ >> 1;
				int i_518_ = i_516_;
				short i_519_ = minimumY;
				int i_520_ = i_517_;
				float f_521_ = class399_505_.array[0] * i_518_ + class399_505_.array[4] * i_519_
						+ class399_505_.array[8] * i_520_ + class399_505_.array[12];
				float f_522_ = class399_505_.array[1] * i_518_ + class399_505_.array[5] * i_519_
						+ class399_505_.array[9] * i_520_ + class399_505_.array[13];
				float f_523_ = class399_505_.array[2] * i_518_ + class399_505_.array[6] * i_519_
						+ class399_505_.array[10] * i_520_ + class399_505_.array[14];
				float f_524_ = class399_505_.array[3] * i_518_ + class399_505_.array[7] * i_519_
						+ class399_505_.array[11] * i_520_ + class399_505_.array[15];
				if (f_523_ >= -f_524_) {
					class139.anInt1580 = (int) (toolkit.aFloat9041 + toolkit.aFloat9004 * f_521_ / f_524_);
					class139.anInt1582 = (int) (toolkit.aFloat9043 + toolkit.aFloat9044 * f_522_ / f_524_);
				} else {
					bool = true;
				}
				i_518_ = i_516_;
				i_519_ = maximumY;
				i_520_ = i_517_;
				float f_525_ = class399_505_.array[0] * i_518_ + class399_505_.array[4] * i_519_
						+ class399_505_.array[8] * i_520_ + class399_505_.array[12];
				float f_526_ = class399_505_.array[1] * i_518_ + class399_505_.array[5] * i_519_
						+ class399_505_.array[9] * i_520_ + class399_505_.array[13];
				float f_527_ = class399_505_.array[2] * i_518_ + class399_505_.array[6] * i_519_
						+ class399_505_.array[10] * i_520_ + class399_505_.array[14];
				float f_528_ = class399_505_.array[3] * i_518_ + class399_505_.array[7] * i_519_
						+ class399_505_.array[11] * i_520_ + class399_505_.array[15];
				if (f_527_ >= -f_528_) {
					class139.anInt1583 = (int) (toolkit.aFloat9041 + toolkit.aFloat9004 * f_525_ / f_528_);
					class139.anInt1584 = (int) (toolkit.aFloat9043 + toolkit.aFloat9044 * f_526_ / f_528_);
				} else {
					bool = true;
				}
				if (bool) {
					if (f_523_ < -f_524_ && f_527_ < -f_528_) {
						bool_515_ = false;
					} else if (f_523_ < -f_524_) {
						float f_529_ = (f_523_ + f_524_) / (f_527_ + f_528_) - 1.0F;
						float f_530_ = f_521_ + f_529_ * (f_525_ - f_521_);
						float f_531_ = f_522_ + f_529_ * (f_526_ - f_522_);
						float f_532_ = f_524_ + f_529_ * (f_528_ - f_524_);
						class139.anInt1580 = (int) (toolkit.aFloat9041 + toolkit.aFloat9004 * f_530_ / f_532_);
						class139.anInt1582 = (int) (toolkit.aFloat9043 + toolkit.aFloat9044 * f_531_ / f_532_);
					} else if (f_527_ < -f_528_) {
						float f_533_ = (f_527_ + f_528_) / (f_523_ + f_524_) - 1.0F;
						float f_534_ = f_525_ + f_533_ * (f_521_ - f_525_);
						float f_535_ = f_526_ + f_533_ * (f_522_ - f_526_);
						float f_536_ = f_528_ + f_533_ * (f_524_ - f_528_);
						class139.anInt1583 = (int) (toolkit.aFloat9041 + toolkit.aFloat9004 * f_534_ / f_536_);
						class139.anInt1584 = (int) (toolkit.aFloat9043 + toolkit.aFloat9044 * f_535_ / f_536_);
					}
				}
				if (bool_515_) {
					if (f_523_ / f_524_ > f_527_ / f_528_) {
						float f_537_ = f_521_ + class399.array[0] * anInt8912 + class399.array[12];
						float f_538_ = f_524_ + class399.array[3] * anInt8912 + class399.array[15];
						class139.anInt1585 = (int) (toolkit.aFloat9041 - class139.anInt1580 + toolkit.aFloat9004
								* f_537_ / f_538_);
					} else {
						float f_539_ = f_525_ + class399.array[0] * anInt8912 + class399.array[12];
						float f_540_ = f_528_ + class399.array[3] * anInt8912 + class399.array[15];
						class139.anInt1585 = (int) (toolkit.aFloat9041 - class139.anInt1583 + toolkit.aFloat9004
								* f_539_ / f_540_);
					}
					class139.aBool1581 = true;
				}
			}
			toolkit.method14375();
			toolkit.method14517(class399_504_);
			method14206();
			toolkit.method14297();
			class399_504_.method6547(toolkit.aClass399_9015);
			method14207(class399_504_);
			if ((i & 0x2) != 0) {
				OpenGL.glPolygonMode(1028, 6914);
			}
		}
	}

	@Override
	public boolean method2918(int i, int i_627_, Class405 class405, boolean bool, int i_628_) {
		Matrix4f class399 = toolkit.aClass399_9050;
		class399.method6548(class405);
		class399.method6547(toolkit.aClass399_9087);
		boolean bool_629_ = false;
		int i_630_ = 2147483647;
		int i_631_ = -2147483648;
		int i_632_ = 2147483647;
		int i_633_ = -2147483648;
		if (!computedBounds) {
			computeBounds();
		}
		int i_634_ = maximumX - minimumX >> 1;
		int i_635_ = maximumY - minimumY >> 1;
		int i_636_ = maximumZ - minimumZ >> 1;
		int i_637_ = minimumX + i_634_;
		int i_638_ = minimumY + i_635_;
		int i_639_ = minimumZ + i_636_;
		int i_640_ = i_637_ - (i_634_ << i_628_);
		int i_641_ = i_638_ - (i_635_ << i_628_);
		int i_642_ = i_639_ - (i_636_ << i_628_);
		int i_643_ = i_637_ + (i_634_ << i_628_);
		int i_644_ = i_638_ + (i_635_ << i_628_);
		int i_645_ = i_639_ + (i_636_ << i_628_);
		anIntArray8933[0] = i_640_;
		anIntArray8934[0] = i_641_;
		anIntArray8935[0] = i_642_;
		anIntArray8933[1] = i_643_;
		anIntArray8934[1] = i_641_;
		anIntArray8935[1] = i_642_;
		anIntArray8933[2] = i_640_;
		anIntArray8934[2] = i_644_;
		anIntArray8935[2] = i_642_;
		anIntArray8933[3] = i_643_;
		anIntArray8934[3] = i_644_;
		anIntArray8935[3] = i_642_;
		anIntArray8933[4] = i_640_;
		anIntArray8934[4] = i_641_;
		anIntArray8935[4] = i_645_;
		anIntArray8933[5] = i_643_;
		anIntArray8934[5] = i_641_;
		anIntArray8935[5] = i_645_;
		anIntArray8933[6] = i_640_;
		anIntArray8934[6] = i_644_;
		anIntArray8935[6] = i_645_;
		anIntArray8933[7] = i_643_;
		anIntArray8934[7] = i_644_;
		anIntArray8935[7] = i_645_;
		for (int i_646_ = 0; i_646_ < 8; i_646_++) {
			int i_647_ = anIntArray8933[i_646_];
			int i_648_ = anIntArray8934[i_646_];
			int i_649_ = anIntArray8935[i_646_];
			float f = class399.array[2] * i_647_ + class399.array[6] * i_648_ + class399.array[10] * i_649_
					+ class399.array[14];
			float f_650_ = class399.array[3] * i_647_ + class399.array[7] * i_648_ + class399.array[11] * i_649_
					+ class399.array[15];
			if (f >= -f_650_) {
				float f_651_ = class399.array[0] * i_647_ + class399.array[4] * i_648_ + class399.array[8] * i_649_
						+ class399.array[12];
				float f_652_ = class399.array[1] * i_647_ + class399.array[5] * i_648_ + class399.array[9] * i_649_
						+ class399.array[13];
				int i_653_ = (int) (toolkit.aFloat9041 + toolkit.aFloat9004 * f_651_ / f_650_);
				int i_654_ = (int) (toolkit.aFloat9043 + toolkit.aFloat9044 * f_652_ / f_650_);
				if (i_653_ < i_630_) {
					i_630_ = i_653_;
				}
				if (i_653_ > i_631_) {
					i_631_ = i_653_;
				}
				if (i_654_ < i_632_) {
					i_632_ = i_654_;
				}
				if (i_654_ > i_633_) {
					i_633_ = i_654_;
				}
				bool_629_ = true;
			}
		}
		if (bool_629_ && i > i_630_ && i < i_631_ && i_627_ > i_632_ && i_627_ < i_633_) {
			if (bool) {
				return true;
			}
			if (toolkit.shadowX.length < uniqueVertices) {
				toolkit.shadowX = new int[uniqueVertices];
				toolkit.shadowY = new int[uniqueVertices];
			}
			int[] is = toolkit.shadowX;
			int[] is_655_ = toolkit.shadowY;
			for (int i_656_ = 0; i_656_ < vertexCount; i_656_++) {
				int i_657_ = vertexX[i_656_];
				int i_658_ = vertexY[i_656_];
				int i_659_ = vertexZ[i_656_];
				float f = class399.array[2] * i_657_ + class399.array[6] * i_658_ + class399.array[10] * i_659_
						+ class399.array[14];
				float f_660_ = class399.array[3] * i_657_ + class399.array[7] * i_658_ + class399.array[11] * i_659_
						+ class399.array[15];
				if (f >= -f_660_) {
					float f_661_ = class399.array[0] * i_657_ + class399.array[4] * i_658_ + class399.array[8] * i_659_
							+ class399.array[12];
					float f_662_ = class399.array[1] * i_657_ + class399.array[5] * i_658_ + class399.array[9] * i_659_
							+ class399.array[13];
					int i_663_ = sharedFaces[i_656_];
					int i_664_ = sharedFaces[i_656_ + 1];
					for (int i_665_ = i_663_; i_665_ < i_664_ && aShortArray8924[i_665_] != 0; i_665_++) {
						int i_666_ = (aShortArray8924[i_665_] & 0xffff) - 1;
						is[i_666_] = (int) (toolkit.aFloat9041 + toolkit.aFloat9004 * f_661_ / f_660_);
						is_655_[i_666_] = (int) (toolkit.aFloat9043 + toolkit.aFloat9044 * f_662_ / f_660_);
					}
				} else {
					int i_667_ = sharedFaces[i_656_];
					int i_668_ = sharedFaces[i_656_ + 1];
					for (int i_669_ = i_667_; i_669_ < i_668_ && aShortArray8924[i_669_] != 0; i_669_++) {
						int i_670_ = (aShortArray8924[i_669_] & 0xffff) - 1;
						is[i_670_] = -999999;
					}
				}
			}
			for (int i_671_ = 0; i_671_ < anInt8893; i_671_++) {
				if (is[aShortArray8920[i_671_] & 0xffff] != -999999
						&& is[aShortArray8898[i_671_] & 0xffff] != -999999
						&& is[aShortArray8899[i_671_] & 0xffff] != -999999
						&& method14220(i, i_627_, is_655_[aShortArray8920[i_671_] & 0xffff],
								is_655_[aShortArray8898[i_671_] & 0xffff], is_655_[aShortArray8899[i_671_] & 0xffff],
								is[aShortArray8920[i_671_] & 0xffff], is[aShortArray8898[i_671_] & 0xffff],
								is[aShortArray8899[i_671_] & 0xffff])) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int method2920() {
		if (!computedBounds) {
			computeBounds();
		}
		return anInt8912;
	}

	@Override
	public int method2923() {
		if (!computedBounds) {
			computeBounds();
		}
		return maximumX;
	}

	@Override
	public int method2928() {
		if (!aBool8873) {
			method2962();
		}
		return aShort8922;
	}

	@Override
	public void method2929(int i) {
		aShort8917 = (short) i;
		if (aClass94_8904 != null) {
			aClass94_8904.buffer = null;
		}
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
		return aShort8875;
	}

	@Override
	public byte[] method2933() {
		return aByteArray8876;
	}

	@Override
	public void method2935(byte i, byte[] is) {
		if (is == null) {
			for (int i_222_ = 0; i_222_ < anInt8893; i_222_++) {
				aByteArray8876[i_222_] = i;
			}
		} else {
			for (int i_223_ = 0; i_223_ < anInt8893; i_223_++) {
				int i_224_ = 255 - (255 - (is[i_223_] & 0xff)) * (255 - (i & 0xff)) / 255;
				aByteArray8876[i_223_] = (byte) i_224_;
			}
		}
		if (aClass94_8904 != null) {
			aClass94_8904.buffer = null;
		}
	}

	@Override
	public void method2937(int i, int i_789_, int i_790_, int i_791_) {
		for (int i_792_ = 0; i_792_ < anInt8893; i_792_++) {
			int i_793_ = aShortArray8870[i_792_] & 0xffff;
			int i_794_ = i_793_ >> 10 & 0x3f;
			int i_795_ = i_793_ >> 7 & 0x7;
			int i_796_ = i_793_ & 0x7f;
			if (i != -1) {
				i_794_ += (i - i_794_) * i_791_ >> 7;
			}
			if (i_789_ != -1) {
				i_795_ += (i_789_ - i_795_) * i_791_ >> 7;
			}
			if (i_790_ != -1) {
				i_796_ += (i_790_ - i_796_) * i_791_ >> 7;
			}
			aShortArray8870[i_792_] = (short) (i_794_ << 10 | i_795_ << 7 | i_796_);
		}
		if (aClass130Array8928 != null) {
			for (int i_797_ = 0; i_797_ < anInt8872; i_797_++) {
				Class130 class130 = aClass130Array8928[i_797_];
				Class86 class86 = aClass86Array8929[i_797_];
				class86.anInt1229 = class86.anInt1229 & ~0xffffff
						| Class598.HSL_TABLE[aShortArray8870[class130.anInt1504] & 0xffff] & 0xffffff;
			}
		}
		if (aClass94_8904 != null) {
			aClass94_8904.buffer = null;
		}
	}

	@Override
	public boolean method2938() {
		if (aShortArray8900 == null) {
			return true;
		}

		for (short element : aShortArray8900) {
			if (element != -1) {
				TextureMetrics metrics = toolkit.metricsList.get(element & 0xffff);
				if (metrics.aBool1698 && !toolkit.aClass119_8993.loaded(Class549.TEXTURE_AND_MATERIAL, metrics, -1)) {
					return false;
				}
			}
		}

		return true;
	}

	@Override
	public boolean method2939() {
		return aBool8869;
	}

	@Override
	public boolean method2940() {
		return aBool8877;
	}

	@Override
	public Class145[] method2942() {
		return aClass145Array8925;
	}

	@Override
	public Class115[] method2943() {
		return aClass115Array8896;
	}

	@Override
	public void method2944(Model class143, int i, int i_225_, int i_226_, boolean bool) {
		OpenGlModel class143_sub1_227_ = (OpenGlModel) class143;
		if (anInt8893 != 0 && class143_sub1_227_.anInt8893 != 0) {
			int i_228_ = class143_sub1_227_.vertexCount;
			int[] is = class143_sub1_227_.vertexX;
			int[] is_229_ = class143_sub1_227_.vertexY;
			int[] is_230_ = class143_sub1_227_.vertexZ;
			short[] is_231_ = class143_sub1_227_.aShortArray8885;
			short[] is_232_ = class143_sub1_227_.aShortArray8887;
			short[] is_233_ = class143_sub1_227_.aShortArray8868;
			byte[] is_234_ = class143_sub1_227_.aByteArray8889;
			short[] is_235_;
			short[] is_236_;
			short[] is_237_;
			byte[] is_238_;
			if (aClass127_8865 != null) {
				is_235_ = aClass127_8865.aShortArray1487;
				is_236_ = aClass127_8865.aShortArray1486;
				is_237_ = aClass127_8865.aShortArray1488;
				is_238_ = aClass127_8865.aByteArray1489;
			} else {
				is_235_ = null;
				is_236_ = null;
				is_237_ = null;
				is_238_ = null;
			}
			short[] is_239_;
			short[] is_240_;
			short[] is_241_;
			byte[] is_242_;
			if (class143_sub1_227_.aClass127_8865 != null) {
				is_239_ = class143_sub1_227_.aClass127_8865.aShortArray1487;
				is_240_ = class143_sub1_227_.aClass127_8865.aShortArray1486;
				is_241_ = class143_sub1_227_.aClass127_8865.aShortArray1488;
				is_242_ = class143_sub1_227_.aClass127_8865.aByteArray1489;
			} else {
				is_239_ = null;
				is_240_ = null;
				is_241_ = null;
				is_242_ = null;
			}
			int[] is_243_ = class143_sub1_227_.sharedFaces;
			short[] is_244_ = class143_sub1_227_.aShortArray8924;
			if (!class143_sub1_227_.computedBounds) {
				class143_sub1_227_.computeBounds();
			}
			int i_245_ = class143_sub1_227_.minimumY;
			int i_246_ = class143_sub1_227_.maximumY;
			int i_247_ = class143_sub1_227_.minimumX;
			int i_248_ = class143_sub1_227_.maximumX;
			int i_249_ = class143_sub1_227_.minimumZ;
			int i_250_ = class143_sub1_227_.maximumZ;
			for (int i_251_ = 0; i_251_ < vertexCount; i_251_++) {
				int i_252_ = vertexY[i_251_] - i_225_;
				if (i_252_ >= i_245_ && i_252_ <= i_246_) {
					int i_253_ = vertexX[i_251_] - i;
					if (i_253_ >= i_247_ && i_253_ <= i_248_) {
						int i_254_ = vertexZ[i_251_] - i_226_;
						if (i_254_ >= i_249_ && i_254_ <= i_250_) {
							int i_255_ = -1;
							int i_256_ = sharedFaces[i_251_];
							int i_257_ = sharedFaces[i_251_ + 1];
							for (int i_258_ = i_256_; i_258_ < i_257_ && aShortArray8924[i_258_] != 0; i_258_++) {
								i_255_ = (aShortArray8924[i_258_] & 0xffff) - 1;
								if (aByteArray8889[i_255_] != 0) {
									break;
								}
							}
							if (i_255_ != -1) {
								for (int i_259_ = 0; i_259_ < i_228_; i_259_++) {
									if (i_253_ == is[i_259_] && i_254_ == is_230_[i_259_] && i_252_ == is_229_[i_259_]) {
										int i_260_ = -1;
										i_256_ = is_243_[i_259_];
										i_257_ = is_243_[i_259_ + 1];
										for (int i_261_ = i_256_; i_261_ < i_257_ && is_244_[i_261_] != 0; i_261_++) {
											i_260_ = (is_244_[i_261_] & 0xffff) - 1;
											if (is_234_[i_260_] != 0) {
												break;
											}
										}
										if (i_260_ != -1) {
											if (is_235_ == null) {
												aClass127_8865 = new Class127();
												is_235_ = aClass127_8865.aShortArray1487 = CursorDefinition
														.copy(aShortArray8885);
												is_236_ = aClass127_8865.aShortArray1486 = CursorDefinition
														.copy(aShortArray8887);
												is_237_ = aClass127_8865.aShortArray1488 = CursorDefinition
														.copy(aShortArray8868);
												is_238_ = aClass127_8865.aByteArray1489 = Class193.copy(aByteArray8889);
											}
											if (is_239_ == null) {
												Class127 class127 = class143_sub1_227_.aClass127_8865 = new Class127();
												is_239_ = class127.aShortArray1487 = CursorDefinition.copy(is_231_);
												is_240_ = class127.aShortArray1486 = CursorDefinition.copy(is_232_);
												is_241_ = class127.aShortArray1488 = CursorDefinition.copy(is_233_);
												is_242_ = class127.aByteArray1489 = Class193.copy(is_234_);
											}
											short i_262_ = aShortArray8885[i_255_];
											short i_263_ = aShortArray8887[i_255_];
											short i_264_ = aShortArray8868[i_255_];
											byte i_265_ = aByteArray8889[i_255_];
											i_256_ = is_243_[i_259_];
											i_257_ = is_243_[i_259_ + 1];
											for (int i_266_ = i_256_; i_266_ < i_257_; i_266_++) {
												int i_267_ = is_244_[i_266_] - 1;
												if (i_267_ == -1) {
													break;
												}
												if (is_242_[i_267_] != 0) {
													is_239_[i_267_] += i_262_;
													is_240_[i_267_] += i_263_;
													is_241_[i_267_] += i_264_;
													is_242_[i_267_] += i_265_;
												}
											}
											i_262_ = is_231_[i_260_];
											i_263_ = is_232_[i_260_];
											i_264_ = is_233_[i_260_];
											i_265_ = is_234_[i_260_];
											i_256_ = sharedFaces[i_251_];
											i_257_ = sharedFaces[i_251_ + 1];
											for (int i_268_ = i_256_; i_268_ < i_257_ && aShortArray8924[i_268_] != 0; i_268_++) {
												int i_269_ = (aShortArray8924[i_268_] & 0xffff) - 1;
												if (is_238_[i_269_] != 0) {
													is_235_[i_269_] += i_262_;
													is_236_[i_269_] += i_263_;
													is_237_[i_269_] += i_264_;
													is_238_[i_269_] += i_265_;
												}
											}
											if (aClass94_8905 == null && aClass94_8904 != null) {
												aClass94_8904.buffer = null;
											}
											if (aClass94_8905 != null) {
												aClass94_8905.buffer = null;
											}
											if (class143_sub1_227_.aClass94_8905 == null
													&& class143_sub1_227_.aClass94_8904 != null) {
												class143_sub1_227_.aClass94_8904.buffer = null;
											}
											if (class143_sub1_227_.aClass94_8905 != null) {
												class143_sub1_227_.aClass94_8905.buffer = null;
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
	}

	@Override
	public void method2962() {
		if (!aBool8873) {
			if (!computedBounds) {
				computeBounds();
			}
			aShort8922 = minimumY;
			aBool8873 = true;
		}
	}

	@Override
	public int method2971() {
		return aShort8917;
	}

	@Override
	public void method2974(int i) {
		aShort8875 = (short) i;
		if (aClass94_8904 != null) {
			aClass94_8904.buffer = null;
		}
		if (aClass94_8905 != null) {
			aClass94_8905.buffer = null;
		}
	}

	@Override
	public int minimumX() {
		if (!computedBounds) {
			computeBounds();
		}
		return minimumX;
	}

	@Override
	public int method3016() {
		if (!computedBounds) {
			computeBounds();
		}
		return anInt8911;
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

		OpenGlShadow shadow = (OpenGlShadow) shad;
		OpenGlShadow copy;

		if (shadow != null && shadow.containsRegion(dx, dz)) {
			copy = shadow;
			copy.clear();
		} else {
			copy = new OpenGlShadow(toolkit, dx, dz);
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
		if (uniqueVertices > 0 && anInt8894 > 0) {
			method14209(false);
			if ((aByte8901 & 0x10) == 0 && aClass92_8907.buffer == null) {
				method14208(false);
			}

			method14196();
		}
	}

	@Override
	public void method3063(Class405 class405) {
		Matrix4f class399 = toolkit.aClass399_9050;
		class399.method6548(class405);
		if (aClass145Array8925 != null) {
			for (Class145 class145 : aClass145Array8925) {
				Class145 class145_479_ = class145;
				if (class145.aClass145_1803 != null) {
					class145_479_ = class145.aClass145_1803;
				}
				class145_479_.anInt1809 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class145.anInt1805 * 1662200367] + class399.array[4]
						* vertexY[class145.anInt1805 * 1662200367] + class399.array[8]
						* vertexZ[class145.anInt1805 * 1662200367]))
						* -324129411;
				class145_479_.anInt1816 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class145.anInt1805 * 1662200367] + class399.array[5]
						* vertexY[class145.anInt1805 * 1662200367] + class399.array[9]
						* vertexZ[class145.anInt1805 * 1662200367]))
						* -1194099427;
				class145_479_.anInt1811 = (int) (class399.array[14] + (class399.array[2]
						* vertexX[class145.anInt1805 * 1662200367] + class399.array[6]
						* vertexY[class145.anInt1805 * 1662200367] + class399.array[10]
						* vertexZ[class145.anInt1805 * 1662200367])) * 1082189991;
				class145_479_.anInt1810 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class145.anInt1802 * -1204023687] + class399.array[4]
						* vertexY[class145.anInt1802 * -1204023687] + class399.array[8]
						* vertexZ[class145.anInt1802 * -1204023687]))
						* -1558281385;
				class145_479_.anInt1813 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class145.anInt1802 * -1204023687] + class399.array[5]
						* vertexY[class145.anInt1802 * -1204023687] + class399.array[9]
						* vertexZ[class145.anInt1802 * -1204023687]))
						* -465338573;
				class145_479_.anInt1814 = (int) (class399.array[14] + (class399.array[2]
						* vertexX[class145.anInt1802 * -1204023687] + class399.array[6]
						* vertexY[class145.anInt1802 * -1204023687] + class399.array[10]
						* vertexZ[class145.anInt1802 * -1204023687]))
						* -170225769;
				class145_479_.anInt1815 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class145.anInt1806 * -1333709795] + class399.array[4]
						* vertexY[class145.anInt1806 * -1333709795] + class399.array[8]
						* vertexZ[class145.anInt1806 * -1333709795])) * 714262933;
				class145_479_.anInt1808 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class145.anInt1806 * -1333709795] + class399.array[5]
						* vertexY[class145.anInt1806 * -1333709795] + class399.array[9]
						* vertexZ[class145.anInt1806 * -1333709795])) * 847013515;
				class145_479_.anInt1817 = (int) (class399.array[14] + (class399.array[2]
						* vertexX[class145.anInt1806 * -1333709795] + class399.array[6]
						* vertexY[class145.anInt1806 * -1333709795] + class399.array[10]
						* vertexZ[class145.anInt1806 * -1333709795])) * 1666826233;
			}
		}
		if (aClass115Array8896 != null) {
			for (Class115 element : aClass115Array8896) {
				Class115 class115 = element;
				Class115 class115_480_ = class115;
				if (class115.aClass115_1441 != null) {
					class115_480_ = class115.aClass115_1441;
				}
				if (class115.aClass399_1443 != null) {
					class115.aClass399_1443.copyFrom(class399);
				} else {
					class115.aClass399_1443 = new Matrix4f(class399);
				}
				class115_480_.anInt1438 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class115.anInt1439 * 1047194323] + class399.array[4]
						* vertexY[class115.anInt1439 * 1047194323] + class399.array[8]
						* vertexZ[class115.anInt1439 * 1047194323]))
						* -2111105049;
				class115_480_.anInt1440 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class115.anInt1439 * 1047194323] + class399.array[5]
						* vertexY[class115.anInt1439 * 1047194323] + class399.array[9]
						* vertexZ[class115.anInt1439 * 1047194323])) * 1144355343;
				class115_480_.anInt1442 = (int) (class399.array[14] + (class399.array[2]
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

	@Override
	public void pitch(int angle) {
		int sin = Class373.SINE[angle];
		int cos = Class373.COSINE[angle];

		for (int vertex = 0; vertex < vertexCount; vertex++) {
			int y = vertexY[vertex] * cos - vertexZ[vertex] * sin >> 14;
			vertexZ[vertex] = vertexY[vertex] * sin + vertexZ[vertex] * cos >> 14;
			vertexY[vertex] = y;
		}

		if (aClass94_8890 != null) {
			aClass94_8890.buffer = null;
		}

		computedBounds = false;
	}

	@Override
	public void recolour(short original, short i_782_) {
		for (int i_783_ = 0; i_783_ < anInt8893; i_783_++) {
			if (aShortArray8870[i_783_] == original) {
				aShortArray8870[i_783_] = i_782_;
			}
		}
		if (aClass130Array8928 != null) {
			for (int i_784_ = 0; i_784_ < anInt8872; i_784_++) {
				Class130 class130 = aClass130Array8928[i_784_];
				Class86 class86 = aClass86Array8929[i_784_];
				class86.anInt1229 = class86.anInt1229 & ~0xffffff
						| Class598.HSL_TABLE[aShortArray8870[class130.anInt1504] & 0xffff] & 0xffffff;
			}
		}
		if (aClass94_8904 != null) {
			aClass94_8904.buffer = null;
		}
	}

	@Override
	public void retexture(short original, short i_270_) {
		TextureMetricsList class147 = toolkit.metricsList;
		for (int i_271_ = 0; i_271_ < anInt8893; i_271_++) {
			if (aShortArray8900[i_271_] == original) {
				aShortArray8900[i_271_] = i_270_;
			}
		}
		byte i_272_ = 0;
		byte i_273_ = 0;
		if (original != -1) {
			TextureMetrics class141 = class147.get(original & 0xffff);
			i_272_ = class141.alpha;
			i_273_ = class141.colourOffset;
		}
		byte i_274_ = 0;
		byte i_275_ = 0;
		if (i_270_ != -1) {
			TextureMetrics class141 = class147.get(i_270_ & 0xffff);
			i_274_ = class141.alpha;
			i_275_ = class141.colourOffset;
			if (class141.aByte1728 != 0 || class141.aByte1700 != 0) {
				aBool8877 = true;
			}
		}
		if (i_272_ != i_274_ | i_273_ != i_275_) {
			if (aClass130Array8928 != null) {
				for (int i_276_ = 0; i_276_ < anInt8872; i_276_++) {
					Class130 class130 = aClass130Array8928[i_276_];
					Class86 class86 = aClass86Array8929[i_276_];
					class86.anInt1229 = class86.anInt1229 & ~0xffffff
							| Class598.HSL_TABLE[aShortArray8870[class130.anInt1504] & 0xffff] & 0xffffff;
				}
			}
			if (aClass94_8904 != null) {
				aClass94_8904.buffer = null;
			}
		}
	}

	@Override
	public void roll(int angle) {
		int sin = Class373.SINE[angle];
		int cos = Class373.COSINE[angle];

		for (int vertex = 0; vertex < vertexCount; vertex++) {
			int x = vertexY[vertex] * sin + vertexX[vertex] * cos >> 14;
			vertexY[vertex] = vertexY[vertex] * cos - vertexX[vertex] * sin >> 14;
			vertexX[vertex] = x;
		}

		if (aClass94_8890 != null) {
			aClass94_8890.buffer = null;
		}

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

		if (aClass94_8890 != null) {
			aClass94_8890.buffer = null;
		}

		computedBounds = false;
	}

	@Override
	public void transform(Class405 class405, int i, boolean bool) {
		if (aShortArray8884 != null) {
			Class405 class405_624_ = class405;
			if (bool) {
				class405_624_ = toolkit.aClass405_8962;
				class405_624_.method6725(class405);
			}
			float[] fs = new float[3];
			for (int i_625_ = 0; i_625_ < vertexCount; i_625_++) {
				if ((i & aShortArray8884[i_625_]) != 0) {
					class405_624_.method6793(vertexX[i_625_], vertexY[i_625_], vertexZ[i_625_], fs);
					vertexX[i_625_] = (int) fs[0];
					vertexY[i_625_] = (int) fs[1];
					vertexZ[i_625_] = (int) fs[2];
				}
			}
		}
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

		if (aClass94_8890 != null) {
			aClass94_8890.buffer = null;
		}

		computedBounds = false;
	}

	@Override
	public void updateFunctionMask(int mask) {
		functionMask = mask;
		if (aClass127_8865 != null && (functionMask & 0x10000) == 0) {
			aShortArray8885 = aClass127_8865.aShortArray1487;
			aShortArray8887 = aClass127_8865.aShortArray1486;
			aShortArray8868 = aClass127_8865.aShortArray1488;
			aByteArray8889 = aClass127_8865.aByteArray1489;
			aClass127_8865 = null;
		}

		aBool8910 = true;
		method14196();
	}

	@Override
	public void yaw(int angle) {
		int sin = Class373.SINE[angle];
		int cos = Class373.COSINE[angle];

		for (int index = 0; index < vertexCount; index++) {
			int i_788_ = vertexZ[index] * sin + vertexX[index] * cos >> 14;
			vertexZ[index] = vertexZ[index] * cos - vertexX[index] * sin >> 14;
			vertexX[index] = i_788_;
		}

		if (aClass94_8890 != null) {
			aClass94_8890.buffer = null;
		}

		computedBounds = false;
	}

	Model method14195(OpenGlModel class143_sub1_143_, OpenGlModel class143_sub1_144_, int i, boolean bool,
			boolean bool_145_) {
		class143_sub1_143_.aByte8901 = (byte) 0;
		class143_sub1_143_.functionMask = i;
		class143_sub1_143_.anInt8916 = anInt8916;
		class143_sub1_143_.aShort8917 = aShort8917;
		class143_sub1_143_.aShort8875 = aShort8875;
		class143_sub1_143_.anInt8878 = anInt8878;
		class143_sub1_143_.vertexCount = vertexCount;
		class143_sub1_143_.uniqueVertices = uniqueVertices;
		class143_sub1_143_.anInt8893 = anInt8893;
		class143_sub1_143_.anInt8894 = anInt8894;
		class143_sub1_143_.anInt8872 = anInt8872;
		if ((i & 0x100) != 0) {
			class143_sub1_143_.aBool8869 = true;
		} else {
			class143_sub1_143_.aBool8869 = aBool8869;
		}
		class143_sub1_143_.aBool8877 = aBool8877;
		boolean bool_146_ = Class105.method1876(i, anInt8916);
		boolean bool_147_ = Class105.method1877(i, anInt8916);
		boolean bool_148_ = Class105.method1878(i, anInt8916);
		boolean bool_149_ = bool_146_ | bool_147_ | bool_148_;
		if (bool_149_) {
			if (bool_146_) {
				if (class143_sub1_144_.vertexX == null || class143_sub1_144_.vertexX.length < anInt8878) {
					class143_sub1_143_.vertexX = class143_sub1_144_.vertexX = new int[anInt8878];
				} else {
					class143_sub1_143_.vertexX = class143_sub1_144_.vertexX;
				}
			} else {
				class143_sub1_143_.vertexX = vertexX;
			}
			if (bool_147_) {
				if (class143_sub1_144_.vertexY == null || class143_sub1_144_.vertexY.length < anInt8878) {
					class143_sub1_143_.vertexY = class143_sub1_144_.vertexY = new int[anInt8878];
				} else {
					class143_sub1_143_.vertexY = class143_sub1_144_.vertexY;
				}
			} else {
				class143_sub1_143_.vertexY = vertexY;
			}
			if (bool_148_) {
				if (class143_sub1_144_.vertexZ == null || class143_sub1_144_.vertexZ.length < anInt8878) {
					class143_sub1_143_.vertexZ = class143_sub1_144_.vertexZ = new int[anInt8878];
				} else {
					class143_sub1_143_.vertexZ = class143_sub1_144_.vertexZ;
				}
			} else {
				class143_sub1_143_.vertexZ = vertexZ;
			}
			for (int i_150_ = 0; i_150_ < anInt8878; i_150_++) {
				if (bool_146_) {
					class143_sub1_143_.vertexX[i_150_] = vertexX[i_150_];
				}
				if (bool_147_) {
					class143_sub1_143_.vertexY[i_150_] = vertexY[i_150_];
				}
				if (bool_148_) {
					class143_sub1_143_.vertexZ[i_150_] = vertexZ[i_150_];
				}
			}
		} else {
			class143_sub1_143_.vertexX = vertexX;
			class143_sub1_143_.vertexY = vertexY;
			class143_sub1_143_.vertexZ = vertexZ;
		}
		if (Class105.method1893(i, anInt8916)) {
			if (bool) {
				class143_sub1_143_.aByte8901 |= 0x1;
			}
			class143_sub1_143_.aClass94_8890 = class143_sub1_144_.aClass94_8890;
			class143_sub1_143_.aClass94_8890.offset = aClass94_8890.offset;
			class143_sub1_143_.aClass94_8890.buffer = aClass94_8890.buffer;
		} else if (Class105.method1888(i, anInt8916)) {
			class143_sub1_143_.aClass94_8890 = aClass94_8890;
		} else {
			class143_sub1_143_.aClass94_8890 = null;
		}
		if (Class105.method1881(i, anInt8916)) {
			if (class143_sub1_144_.aShortArray8870 == null || class143_sub1_144_.aShortArray8870.length < anInt8893) {
				class143_sub1_143_.aShortArray8870 = class143_sub1_144_.aShortArray8870 = new short[anInt8893];
			} else {
				class143_sub1_143_.aShortArray8870 = class143_sub1_144_.aShortArray8870;
			}
			for (int i_151_ = 0; i_151_ < anInt8893; i_151_++) {
				class143_sub1_143_.aShortArray8870[i_151_] = aShortArray8870[i_151_];
			}
		} else {
			class143_sub1_143_.aShortArray8870 = aShortArray8870;
		}
		if (Class105.method1882(i, anInt8916)) {
			if (class143_sub1_144_.aByteArray8876 == null || class143_sub1_144_.aByteArray8876.length < anInt8893) {
				class143_sub1_143_.aByteArray8876 = class143_sub1_144_.aByteArray8876 = new byte[anInt8893];
			} else {
				class143_sub1_143_.aByteArray8876 = class143_sub1_144_.aByteArray8876;
			}
			for (int i_152_ = 0; i_152_ < anInt8893; i_152_++) {
				class143_sub1_143_.aByteArray8876[i_152_] = aByteArray8876[i_152_];
			}
		} else {
			class143_sub1_143_.aByteArray8876 = aByteArray8876;
		}
		if (Class105.method1895(i, anInt8916)) {
			if (bool) {
				class143_sub1_143_.aByte8901 |= 0x2;
			}
			class143_sub1_143_.aClass94_8904 = class143_sub1_144_.aClass94_8904;
			class143_sub1_143_.aClass94_8904.offset = aClass94_8904.offset;
			class143_sub1_143_.aClass94_8904.buffer = aClass94_8904.buffer;
		} else if (Class105.method1939(i, anInt8916)) {
			class143_sub1_143_.aClass94_8904 = aClass94_8904;
		} else {
			class143_sub1_143_.aClass94_8904 = null;
		}
		if (Class105.method1971(i, anInt8916)) {
			if (class143_sub1_144_.aShortArray8885 == null
					|| class143_sub1_144_.aShortArray8885.length < uniqueVertices) {
				int i_153_ = uniqueVertices;
				class143_sub1_143_.aShortArray8885 = class143_sub1_144_.aShortArray8885 = new short[i_153_];
				class143_sub1_143_.aShortArray8887 = class143_sub1_144_.aShortArray8887 = new short[i_153_];
				class143_sub1_143_.aShortArray8868 = class143_sub1_144_.aShortArray8868 = new short[i_153_];
			} else {
				class143_sub1_143_.aShortArray8885 = class143_sub1_144_.aShortArray8885;
				class143_sub1_143_.aShortArray8887 = class143_sub1_144_.aShortArray8887;
				class143_sub1_143_.aShortArray8868 = class143_sub1_144_.aShortArray8868;
			}
			if (aClass127_8865 != null) {
				if (class143_sub1_144_.aClass127_8865 == null) {
					class143_sub1_144_.aClass127_8865 = new Class127();
				}
				Class127 class127 = class143_sub1_143_.aClass127_8865 = class143_sub1_144_.aClass127_8865;
				if (class127.aShortArray1487 == null || class127.aShortArray1487.length < uniqueVertices) {
					int i_154_ = uniqueVertices;
					class127.aShortArray1487 = new short[i_154_];
					class127.aShortArray1486 = new short[i_154_];
					class127.aShortArray1488 = new short[i_154_];
					class127.aByteArray1489 = new byte[i_154_];
				}
				for (int i_155_ = 0; i_155_ < uniqueVertices; i_155_++) {
					class143_sub1_143_.aShortArray8885[i_155_] = aShortArray8885[i_155_];
					class143_sub1_143_.aShortArray8887[i_155_] = aShortArray8887[i_155_];
					class143_sub1_143_.aShortArray8868[i_155_] = aShortArray8868[i_155_];
					class127.aShortArray1487[i_155_] = aClass127_8865.aShortArray1487[i_155_];
					class127.aShortArray1486[i_155_] = aClass127_8865.aShortArray1486[i_155_];
					class127.aShortArray1488[i_155_] = aClass127_8865.aShortArray1488[i_155_];
					class127.aByteArray1489[i_155_] = aClass127_8865.aByteArray1489[i_155_];
				}
			} else {
				for (int i_156_ = 0; i_156_ < uniqueVertices; i_156_++) {
					class143_sub1_143_.aShortArray8885[i_156_] = aShortArray8885[i_156_];
					class143_sub1_143_.aShortArray8887[i_156_] = aShortArray8887[i_156_];
					class143_sub1_143_.aShortArray8868[i_156_] = aShortArray8868[i_156_];
				}
			}
			class143_sub1_143_.aByteArray8889 = aByteArray8889;
		} else {
			class143_sub1_143_.aClass127_8865 = aClass127_8865;
			class143_sub1_143_.aShortArray8885 = aShortArray8885;
			class143_sub1_143_.aShortArray8887 = aShortArray8887;
			class143_sub1_143_.aShortArray8868 = aShortArray8868;
			class143_sub1_143_.aByteArray8889 = aByteArray8889;
		}
		if (Class105.method1894(i, anInt8916)) {
			if (bool) {
				class143_sub1_143_.aByte8901 |= 0x4;
			}
			class143_sub1_143_.aClass94_8905 = class143_sub1_144_.aClass94_8905;
			class143_sub1_143_.aClass94_8905.offset = aClass94_8905.offset;
			class143_sub1_143_.aClass94_8905.buffer = aClass94_8905.buffer;
		} else if (Class105.method1924(i, anInt8916)) {
			class143_sub1_143_.aClass94_8905 = aClass94_8905;
		} else {
			class143_sub1_143_.aClass94_8905 = null;
		}
		if (Class105.method1917(i, anInt8916)) {
			if (class143_sub1_144_.aFloatArray8891 == null || class143_sub1_144_.aFloatArray8891.length < anInt8893) {
				int i_157_ = uniqueVertices;
				class143_sub1_143_.aFloatArray8891 = class143_sub1_144_.aFloatArray8891 = new float[i_157_];
				class143_sub1_143_.aFloatArray8892 = class143_sub1_144_.aFloatArray8892 = new float[i_157_];
			} else {
				class143_sub1_143_.aFloatArray8891 = class143_sub1_144_.aFloatArray8891;
				class143_sub1_143_.aFloatArray8892 = class143_sub1_144_.aFloatArray8892;
			}
			for (int i_158_ = 0; i_158_ < uniqueVertices; i_158_++) {
				class143_sub1_143_.aFloatArray8891[i_158_] = aFloatArray8891[i_158_];
				class143_sub1_143_.aFloatArray8892[i_158_] = aFloatArray8892[i_158_];
			}
		} else {
			class143_sub1_143_.aFloatArray8891 = aFloatArray8891;
			class143_sub1_143_.aFloatArray8892 = aFloatArray8892;
		}
		if (Class105.method1922(i, anInt8916)) {
			if (bool) {
				class143_sub1_143_.aByte8901 |= 0x8;
			}
			class143_sub1_143_.aClass94_8906 = class143_sub1_144_.aClass94_8906;
			class143_sub1_143_.aClass94_8906.offset = aClass94_8906.offset;
			class143_sub1_143_.aClass94_8906.buffer = aClass94_8906.buffer;
		} else if (Class105.method1970(i, anInt8916)) {
			class143_sub1_143_.aClass94_8906 = aClass94_8906;
		} else {
			class143_sub1_143_.aClass94_8906 = null;
		}
		if (Class105.method1884(i, anInt8916)) {
			if (class143_sub1_144_.aShortArray8920 == null || class143_sub1_144_.aShortArray8920.length < anInt8893) {
				int i_159_ = anInt8893;
				class143_sub1_143_.aShortArray8920 = class143_sub1_144_.aShortArray8920 = new short[i_159_];
				class143_sub1_143_.aShortArray8898 = class143_sub1_144_.aShortArray8898 = new short[i_159_];
				class143_sub1_143_.aShortArray8899 = class143_sub1_144_.aShortArray8899 = new short[i_159_];
			} else {
				class143_sub1_143_.aShortArray8920 = class143_sub1_144_.aShortArray8920;
				class143_sub1_143_.aShortArray8898 = class143_sub1_144_.aShortArray8898;
				class143_sub1_143_.aShortArray8899 = class143_sub1_144_.aShortArray8899;
			}
			for (int i_160_ = 0; i_160_ < anInt8893; i_160_++) {
				class143_sub1_143_.aShortArray8920[i_160_] = aShortArray8920[i_160_];
				class143_sub1_143_.aShortArray8898[i_160_] = aShortArray8898[i_160_];
				class143_sub1_143_.aShortArray8899[i_160_] = aShortArray8899[i_160_];
			}
		} else {
			class143_sub1_143_.aShortArray8920 = aShortArray8920;
			class143_sub1_143_.aShortArray8898 = aShortArray8898;
			class143_sub1_143_.aShortArray8899 = aShortArray8899;
		}
		if (Class105.method1897(i, anInt8916)) {
			if (bool) {
				class143_sub1_143_.aByte8901 |= 0x10;
			}
			class143_sub1_143_.aClass92_8907 = class143_sub1_144_.aClass92_8907;
			class143_sub1_143_.aClass92_8907.buffer = aClass92_8907.buffer;
		} else if (Class105.method1892(i, anInt8916)) {
			class143_sub1_143_.aClass92_8907 = aClass92_8907;
		} else {
			class143_sub1_143_.aClass92_8907 = null;
		}
		if (Class105.method1885(i, anInt8916)) {
			if (class143_sub1_144_.aShortArray8900 == null || class143_sub1_144_.aShortArray8900.length < anInt8893) {
				int i_161_ = anInt8893;
				class143_sub1_143_.aShortArray8900 = class143_sub1_144_.aShortArray8900 = new short[i_161_];
			} else {
				class143_sub1_143_.aShortArray8900 = class143_sub1_144_.aShortArray8900;
			}
			for (int i_162_ = 0; i_162_ < anInt8893; i_162_++) {
				class143_sub1_143_.aShortArray8900[i_162_] = aShortArray8900[i_162_];
			}
		} else {
			class143_sub1_143_.aShortArray8900 = aShortArray8900;
		}
		if (Class105.method1886(i, anInt8916)) {
			if (class143_sub1_144_.aClass86Array8929 == null || class143_sub1_144_.aClass86Array8929.length < anInt8872) {
				int i_163_ = anInt8872;
				class143_sub1_143_.aClass86Array8929 = class143_sub1_144_.aClass86Array8929 = new Class86[i_163_];
				for (int i_164_ = 0; i_164_ < anInt8872; i_164_++) {
					class143_sub1_143_.aClass86Array8929[i_164_] = aClass86Array8929[i_164_].copy();
				}
			} else {
				class143_sub1_143_.aClass86Array8929 = class143_sub1_144_.aClass86Array8929;
				for (int i_165_ = 0; i_165_ < anInt8872; i_165_++) {
					class143_sub1_143_.aClass86Array8929[i_165_].copyFrom(aClass86Array8929[i_165_]);
				}
			}
		} else {
			class143_sub1_143_.aClass86Array8929 = aClass86Array8929;
		}
		class143_sub1_143_.aClass130Array8928 = aClass130Array8928;
		if (computedBounds) {
			class143_sub1_143_.anInt8911 = anInt8911;
			class143_sub1_143_.anInt8912 = anInt8912;
			class143_sub1_143_.minimumX = minimumX;
			class143_sub1_143_.maximumX = maximumX;
			class143_sub1_143_.minimumY = minimumY;
			class143_sub1_143_.maximumY = maximumY;
			class143_sub1_143_.minimumZ = minimumZ;
			class143_sub1_143_.maximumZ = maximumZ;
			class143_sub1_143_.computedBounds = true;
		} else {
			class143_sub1_143_.computedBounds = false;
		}
		if (aBool8873) {
			class143_sub1_143_.aShort8922 = aShort8922;
			class143_sub1_143_.aBool8873 = true;
		} else {
			class143_sub1_143_.aBool8873 = false;
		}
		class143_sub1_143_.anIntArrayArray8921 = anIntArrayArray8921;
		class143_sub1_143_.anIntArrayArray8918 = anIntArrayArray8918;
		class143_sub1_143_.anIntArrayArray8930 = anIntArrayArray8930;
		class143_sub1_143_.aShortArray8924 = aShortArray8924;
		class143_sub1_143_.sharedFaces = sharedFaces;
		class143_sub1_143_.aShortArray8884 = aShortArray8884;
		class143_sub1_143_.aShortArray8902 = aShortArray8902;
		class143_sub1_143_.anIntArray8903 = anIntArray8903;
		class143_sub1_143_.aClass145Array8925 = aClass145Array8925;
		class143_sub1_143_.aClass115Array8896 = aClass115Array8896;
		return class143_sub1_143_;
	}

	void method14196() {
		if (aBool8910) {
			aBool8910 = false;
			if (aClass145Array8925 == null && aClass115Array8896 == null && aClass130Array8928 == null
					&& !Class105.method1879(functionMask, anInt8916)) {
				boolean bool = false;
				boolean bool_166_ = false;
				boolean bool_167_ = false;
				if (vertexX != null && !Class105.method1898(functionMask, anInt8916)) {
					if (aClass94_8890 == null || aClass94_8890.buffer != null) {
						if (!computedBounds) {
							computeBounds();
						}
						bool = true;
					} else {
						aBool8910 = true;
					}
				}
				if (vertexY != null && !Class105.method1899(functionMask, anInt8916)) {
					if (aClass94_8890 == null || aClass94_8890.buffer != null) {
						if (!computedBounds) {
							computeBounds();
						}
						bool_166_ = true;
					} else {
						aBool8910 = true;
					}
				}
				if (vertexZ != null && !Class105.method1900(functionMask, anInt8916)) {
					if (aClass94_8890 == null || aClass94_8890.buffer != null) {
						if (!computedBounds) {
							computeBounds();
						}
						bool_167_ = true;
					} else {
						aBool8910 = true;
					}
				}
				if (bool) {
					vertexX = null;
				}
				if (bool_166_) {
					vertexY = null;
				}
				if (bool_167_) {
					vertexZ = null;
				}
			}
			if (aShortArray8924 != null && vertexX == null && vertexY == null && vertexZ == null) {
				aShortArray8924 = null;
				sharedFaces = null;
			}
			if (aByteArray8889 != null && !Class105.method1901(functionMask, anInt8916)) {
				if (aClass94_8905 != null) {
					if (aClass94_8905.buffer != null) {
						aShortArray8868 = null;
						aShortArray8887 = null;
						aShortArray8885 = null;
						aByteArray8889 = null;
					} else {
						aBool8910 = true;
					}
				} else if (aClass94_8904 == null || aClass94_8904.buffer != null) {
					aShortArray8868 = null;
					aShortArray8887 = null;
					aShortArray8885 = null;
					aByteArray8889 = null;
				} else {
					aBool8910 = true;
				}
			}
			if (aShortArray8870 != null && !Class105.method1902(functionMask, anInt8916)) {
				if (aClass94_8904 == null || aClass94_8904.buffer != null) {
					aShortArray8870 = null;
				} else {
					aBool8910 = true;
				}
			}
			if (aByteArray8876 != null && !Class105.method1903(functionMask, anInt8916)) {
				if (aClass94_8904 == null || aClass94_8904.buffer != null) {
					aByteArray8876 = null;
				} else {
					aBool8910 = true;
				}
			}
			if (aFloatArray8891 != null && !Class105.method1904(functionMask, anInt8916)) {
				if (aClass94_8906 == null || aClass94_8906.buffer != null) {
					aFloatArray8892 = null;
					aFloatArray8891 = null;
				} else {
					aBool8910 = true;
				}
			}
			if (aShortArray8900 != null && !Class105.method1909(functionMask, anInt8916)) {
				if (aClass94_8904 == null || aClass94_8904.buffer != null) {
					aShortArray8900 = null;
				} else {
					aBool8910 = true;
				}
			}
			if (aShortArray8920 != null && !Class105.method1908(functionMask, anInt8916)) {
				if ((aClass92_8907 == null || aClass92_8907.buffer != null)
						&& (aClass94_8904 == null || aClass94_8904.buffer != null)) {
					aShortArray8899 = null;
					aShortArray8898 = null;
					aShortArray8920 = null;
				} else {
					aBool8910 = true;
				}
			}
			if (anIntArrayArray8918 != null && !Class105.method1912(functionMask, anInt8916)) {
				anIntArrayArray8918 = null;
				aShortArray8902 = null;
			}
			if (anIntArrayArray8921 != null && !Class105.method1929(functionMask, anInt8916)) {
				anIntArrayArray8921 = null;
				aShortArray8884 = null;
			}
			if (anIntArrayArray8930 != null && !Class105.method1907(functionMask, anInt8916)) {
				anIntArrayArray8930 = null;
			}
			if (anIntArray8903 != null && (functionMask & 0x800) == 0 && (functionMask & 0x40000) == 0) {
				anIntArray8903 = null;
			}
		}
	}

	void computeBounds() {
		int i = 32767;
		int i_200_ = 32767;
		int i_201_ = 32767;
		int i_202_ = -32768;
		int i_203_ = -32768;
		int i_204_ = -32768;
		int i_205_ = 0;
		int i_206_ = 0;
		for (int i_207_ = 0; i_207_ < vertexCount; i_207_++) {
			int i_208_ = vertexX[i_207_];
			int i_209_ = vertexY[i_207_];
			int i_210_ = vertexZ[i_207_];
			if (i_208_ < i) {
				i = i_208_;
			}
			if (i_208_ > i_202_) {
				i_202_ = i_208_;
			}
			if (i_209_ < i_200_) {
				i_200_ = i_209_;
			}
			if (i_209_ > i_203_) {
				i_203_ = i_209_;
			}
			if (i_210_ < i_201_) {
				i_201_ = i_210_;
			}
			if (i_210_ > i_204_) {
				i_204_ = i_210_;
			}
			int i_211_ = i_208_ * i_208_ + i_210_ * i_210_;
			if (i_211_ > i_205_) {
				i_205_ = i_211_;
			}
			i_211_ = i_208_ * i_208_ + i_210_ * i_210_ + i_209_ * i_209_;
			if (i_211_ > i_206_) {
				i_206_ = i_211_;
			}
		}
		minimumX = (short) i;
		maximumX = (short) i_202_;
		minimumY = (short) i_200_;
		maximumY = (short) i_203_;
		minimumZ = (short) i_201_;
		maximumZ = (short) i_204_;
		anInt8912 = (int) (Math.sqrt(i_205_) + 0.99);
		anInt8911 = (int) (Math.sqrt(i_206_) + 0.99);
		computedBounds = true;
	}

	short method14200(BaseModel base, int i, long l, int i_212_, int i_213_, int i_214_, int i_215_, float f,
			float f_216_) {
		int i_217_ = sharedFaces[i];
		int i_218_ = sharedFaces[i + 1];
		int i_219_ = 0;

		for (int i_220_ = i_217_; i_220_ < i_218_; i_220_++) {
			if (aShortArray8924[i_220_] == 0) {
				i_219_ = i_220_;
				break;
			}
			int i_221_ = (aShortArray8924[i_220_] & 0xffff) - 1;
			if (aLongArray8931[i_220_] == l) {
				return (short) i_221_;
			}
		}

		aShortArray8924[i_219_] = (short) (uniqueVertices + 1);
		aLongArray8931[i_219_] = l;
		aShortArray8885[uniqueVertices] = (short) i_212_;
		aShortArray8887[uniqueVertices] = (short) i_213_;
		aShortArray8868[uniqueVertices] = (short) i_214_;
		aByteArray8889[uniqueVertices] = (byte) i_215_;
		aFloatArray8891[uniqueVertices] = f;
		aFloatArray8892[uniqueVertices] = f_216_;
		return (short) uniqueVertices++;
	}

	void fillShadow(OpenGlShadow shadow) {
		if (toolkit.shadowX.length < uniqueVertices) {
			toolkit.shadowX = new int[uniqueVertices];
			toolkit.shadowY = new int[uniqueVertices];
		}

		int[] shadowX = toolkit.shadowX;
		int[] shadowY = toolkit.shadowY;

		for (int index = 0; index < vertexCount; index++) {
			int x = (vertexX[index] - (vertexY[index] * toolkit.sunProjectionX >> 8) >> toolkit.shadowScale) - shadow.x;
			int z = (vertexZ[index] - (vertexY[index] * toolkit.sunProjectionZ >> 8) >> toolkit.shadowScale) - shadow.y;

			int count = sharedFaces[index];
			int nextCount = sharedFaces[index + 1];

			for (int i_493_ = count; i_493_ < nextCount && aShortArray8924[i_493_] != 0; i_493_++) {
				int shadowIndex = (aShortArray8924[i_493_] & 0xffff) - 1;
				shadowX[shadowIndex] = x;
				shadowY[shadowIndex] = z;
			}
		}

		for (int index = 0; index < anInt8894; index++) {
			if (aByteArray8876 == null || aByteArray8876[index] <= 128) {
				int i_495_ = aShortArray8920[index] & 0xffff;
				int i_496_ = aShortArray8898[index] & 0xffff;
				int i_497_ = aShortArray8899[index] & 0xffff;

				int i_498_ = shadowX[i_495_];
				int i_499_ = shadowX[i_496_];
				int i_500_ = shadowX[i_497_];

				int i_501_ = shadowY[i_495_];
				int i_502_ = shadowY[i_496_];
				int i_503_ = shadowY[i_497_];

				if ((i_498_ - i_499_) * (i_502_ - i_503_) - (i_502_ - i_501_) * (i_500_ - i_499_) > 0) {
					shadow.fill(i_501_, i_502_, i_503_, i_498_, i_499_, i_500_);
				}
			}
		}
	}

	void method14206() {
		if (anInt8894 != 0) {
			if (aByte8901 != 0) {
				method14209(true);
			}
			method14209(false);
			if (aClass92_8907 != null) {
				if (aClass92_8907.buffer == null) {
					method14208((aByte8901 & 0x10) != 0);
				}
				if (aClass92_8907.buffer != null) {
					toolkit.method14335(aClass94_8905 != null);
					toolkit.setPointers(aClass94_8890, aClass94_8905, aClass94_8904, aClass94_8906);
					int i = anIntArray8903.length - 1;
					for (int i_541_ = 0; i_541_ < i; i_541_++) {
						int i_542_ = anIntArray8903[i_541_];
						int i_543_ = anIntArray8903[i_541_ + 1];
						int i_544_ = aShortArray8900[i_542_] == -1 ? -1 : aShortArray8900[i_542_] & 0xffff;
						toolkit.method14486(i_544_, aClass94_8905 != null);
						toolkit.drawElements(aClass92_8907.buffer, 4, i_542_ * 3, (i_543_ - i_542_) * 3);
					}
				}
			}
			method14196();
		}
	}

	void method14207(Matrix4f class399) {
		if (aClass130Array8928 != null) {
			Matrix4f class399_545_ = toolkit.aClass399_9001;
			toolkit.method14294();
			toolkit.method2473(!aBool8869);
			toolkit.method14335(false);
			toolkit.setPointers(toolkit.aClass94_9141, null, null, toolkit.aClass94_8999);
			for (int i = 0; i < anInt8872; i++) {
				Class130 class130 = aClass130Array8928[i];
				Class86 class86 = aClass86Array8929[i];
				if (!class130.aBool1509 || !toolkit.method2496()) {
					float f = (vertexX[class130.anInt1510] + vertexX[class130.anInt1503] + vertexX[class130.anInt1502]) * 0.3333333F;
					float f_546_ = (vertexY[class130.anInt1510] + vertexY[class130.anInt1503] + vertexY[class130.anInt1502]) * 0.3333333F;
					float f_547_ = (vertexZ[class130.anInt1510] + vertexZ[class130.anInt1503] + vertexZ[class130.anInt1502]) * 0.3333333F;
					float f_548_ = class399.array[0] * f + class399.array[4] * f_546_ + class399.array[8] * f_547_
							+ class399.array[12];
					float f_549_ = class399.array[1] * f + class399.array[5] * f_546_ + class399.array[9] * f_547_
							+ class399.array[13];
					float f_550_ = class399.array[2] * f + class399.array[6] * f_546_ + class399.array[10] * f_547_
							+ class399.array[14];
					float f_551_ = (float) (1.0 / Math.sqrt(f_548_ * f_548_ + f_549_ * f_549_ + f_550_ * f_550_))
							* class130.anInt1507;
					class399_545_.method6577(class86.anInt1233, class86.anInt1228 * class130.aShort1505 >> 7,
							class86.anInt1230 * class130.aShort1506 >> 7, f_548_ + class86.anInt1231 - f_548_ * f_551_,
							f_549_ + class86.anInt1232 - f_549_ * f_551_, f_550_ - f_550_ * f_551_);
					toolkit.method14296(class399_545_);
					int i_552_ = class86.anInt1229;
					OpenGL.glColor4ub((byte) (i_552_ >> 16), (byte) (i_552_ >> 8), (byte) i_552_, (byte) (i_552_ >> 24));
					toolkit.method14497(class130.aShort1501);
					toolkit.setBlendMode(class130.aByte1508);
					toolkit.method14353(7, 0, 4);
				}
			}
			toolkit.method2473(true);
			toolkit.method14297();
		}
	}

	void method14208(boolean bool) {
		if (toolkit.dataBuffer.payload.length < anInt8894 * 6) {
			toolkit.dataBuffer = new FloatBuffer((anInt8894 + 100) * 6);
		} else {
			toolkit.dataBuffer.offset = 0;
		}
		FloatBuffer rsfloatbuffer = toolkit.dataBuffer;
		if (toolkit.bigEndian) {
			for (int i = 0; i < anInt8894; i++) {
				rsfloatbuffer.writeShort(aShortArray8920[i]);
				rsfloatbuffer.writeShort(aShortArray8898[i]);
				rsfloatbuffer.writeShort(aShortArray8899[i]);
			}
		} else {
			for (int i = 0; i < anInt8894; i++) {
				rsfloatbuffer.writeLEShort(aShortArray8920[i]);
				rsfloatbuffer.writeLEShort(aShortArray8898[i]);
				rsfloatbuffer.writeLEShort(aShortArray8899[i]);
			}
		}
		if (rsfloatbuffer.offset * -165875887 != 0) {
			if (bool) {
				if (anInterface15_8908 == null) {
					anInterface15_8908 = toolkit.createElementArrayBuffer(rsfloatbuffer.payload, rsfloatbuffer.offset
							* -165875887, true);
				} else {
					anInterface15_8908.write(rsfloatbuffer.payload, rsfloatbuffer.offset * -165875887);
				}
				aClass92_8907.buffer = anInterface15_8908;
			} else {
				aClass92_8907.buffer = toolkit.createElementArrayBuffer(rsfloatbuffer.payload, rsfloatbuffer.offset
						* -165875887, false);
			}
			if (!bool) {
				aBool8910 = true;
			}
		}
	}

	void method14209(boolean bool) {
		boolean bool_553_ = aClass94_8904 != null && aClass94_8904.buffer == null;
		boolean bool_554_ = aClass94_8905 != null && aClass94_8905.buffer == null;
		boolean bool_555_ = aClass94_8890 != null && aClass94_8890.buffer == null;
		boolean bool_556_ = aClass94_8906 != null && aClass94_8906.buffer == null;
		if (bool) {
			bool_553_ = bool_553_ & (aByte8901 & 0x2) != 0;
			bool_554_ = bool_554_ & (aByte8901 & 0x4) != 0;
			bool_555_ = bool_555_ & (aByte8901 & 0x1) != 0;
			bool_556_ = bool_556_ & (aByte8901 & 0x8) != 0;
		}
		byte i = 0;
		byte i_557_ = 0;
		byte i_558_ = 0;
		byte i_559_ = 0;
		byte i_560_ = 0;
		if (bool_555_) {
			i_557_ = i;
			i += 12;
		}
		if (bool_553_) {
			i_558_ = i;
			i += 4;
		}
		if (bool_554_) {
			i_559_ = i;
			i += 12;
		}
		if (bool_556_) {
			i_560_ = i;
			i += 8;
		}
		if (i != 0) {
			if (toolkit.dataBuffer.payload.length < uniqueVertices * i) {
				toolkit.dataBuffer = new FloatBuffer((uniqueVertices + 100) * i);
			} else {
				toolkit.dataBuffer.offset = 0;
			}
			FloatBuffer rsfloatbuffer = toolkit.dataBuffer;
			if (bool_555_) {
				if (toolkit.bigEndian) {
					for (int i_561_ = 0; i_561_ < vertexCount; i_561_++) {
						int i_562_ = Stream.floatToRawIntBits(vertexX[i_561_]);
						int i_563_ = Stream.floatToRawIntBits(vertexY[i_561_]);
						int i_564_ = Stream.floatToRawIntBits(vertexZ[i_561_]);
						int i_565_ = sharedFaces[i_561_];
						int i_566_ = sharedFaces[i_561_ + 1];
						for (int i_567_ = i_565_; i_567_ < i_566_ && aShortArray8924[i_567_] != 0; i_567_++) {
							int i_568_ = (aShortArray8924[i_567_] & 0xffff) - 1;
							rsfloatbuffer.offset = i_568_ * i * 1258142129;
							rsfloatbuffer.writeInt(i_562_);
							rsfloatbuffer.writeInt(i_563_);
							rsfloatbuffer.writeInt(i_564_);
						}
					}
				} else {
					for (int i_569_ = 0; i_569_ < vertexCount; i_569_++) {
						int i_570_ = Stream.floatToRawIntBits(vertexX[i_569_]);
						int i_571_ = Stream.floatToRawIntBits(vertexY[i_569_]);
						int i_572_ = Stream.floatToRawIntBits(vertexZ[i_569_]);
						int i_573_ = sharedFaces[i_569_];
						int i_574_ = sharedFaces[i_569_ + 1];
						for (int i_575_ = i_573_; i_575_ < i_574_ && aShortArray8924[i_575_] != 0; i_575_++) {
							int i_576_ = (aShortArray8924[i_575_] & 0xffff) - 1;
							rsfloatbuffer.offset = i_576_ * i * 1258142129;
							rsfloatbuffer.writeLEInt(i_570_);
							rsfloatbuffer.writeLEInt(i_571_);
							rsfloatbuffer.writeLEInt(i_572_);
						}
					}
				}
			}
			if (bool_553_) {
				if (aClass94_8905 == null) {
					short[] is;
					short[] is_577_;
					short[] is_578_;
					byte[] is_579_;
					if (aClass127_8865 != null) {
						is = aClass127_8865.aShortArray1487;
						is_577_ = aClass127_8865.aShortArray1486;
						is_578_ = aClass127_8865.aShortArray1488;
						is_579_ = aClass127_8865.aByteArray1489;
					} else {
						is = aShortArray8885;
						is_577_ = aShortArray8887;
						is_578_ = aShortArray8868;
						is_579_ = aByteArray8889;
					}
					float f = toolkit.sunDirection[0];
					float f_580_ = toolkit.sunDirection[1];
					float f_581_ = toolkit.sunDirection[2];
					float f_582_ = toolkit.ambient;
					float f_583_ = toolkit.sunIntensity * 768.0F / aShort8875;
					float f_584_ = toolkit.aFloat8985 * 768.0F / aShort8875;
					for (int i_585_ = 0; i_585_ < anInt8893; i_585_++) {
						int i_586_ = method14210(aShortArray8870[i_585_], aShortArray8900[i_585_], aShort8917,
								aByteArray8876[i_585_]);
						float f_587_ = (i_586_ >>> 24) * toolkit.aFloat9149;
						float f_588_ = (i_586_ >> 16 & 0xff) * toolkit.aFloat9074;
						float f_589_ = (i_586_ >> 8 & 0xff) * toolkit.aFloat9159;
						int i_590_ = aShortArray8920[i_585_] & 0xffff;
						short i_591_ = is_579_[i_590_];
						float f_592_;
						if (i_591_ == 0) {
							f_592_ = (f * is[i_590_] + f_580_ * is_577_[i_590_] + f_581_ * is_578_[i_590_]) * 0.0026041667F;
						} else {
							f_592_ = (f * is[i_590_] + f_580_ * is_577_[i_590_] + f_581_ * is_578_[i_590_])
									/ (i_591_ * 256);
						}
						float f_593_ = f_582_ + f_592_ * (f_592_ < 0.0F ? f_584_ : f_583_);
						int i_594_ = (int) (f_587_ * f_593_);
						if (i_594_ < 0) {
							i_594_ = 0;
						} else if (i_594_ > 255) {
							i_594_ = 255;
						}
						int i_595_ = (int) (f_588_ * f_593_);
						if (i_595_ < 0) {
							i_595_ = 0;
						} else if (i_595_ > 255) {
							i_595_ = 255;
						}
						int i_596_ = (int) (f_589_ * f_593_);
						if (i_596_ < 0) {
							i_596_ = 0;
						} else if (i_596_ > 255) {
							i_596_ = 255;
						}
						rsfloatbuffer.offset = (i_558_ + i_590_ * i) * 1258142129;
						rsfloatbuffer.writeByte(i_594_);
						rsfloatbuffer.writeByte(i_595_);
						rsfloatbuffer.writeByte(i_596_);
						rsfloatbuffer.writeByte(255 - (aByteArray8876[i_585_] & 0xff));
						i_590_ = aShortArray8898[i_585_] & 0xffff;
						i_591_ = is_579_[i_590_];
						if (i_591_ == 0) {
							f_592_ = (f * is[i_590_] + f_580_ * is_577_[i_590_] + f_581_ * is_578_[i_590_]) * 0.0026041667F;
						} else {
							f_592_ = (f * is[i_590_] + f_580_ * is_577_[i_590_] + f_581_ * is_578_[i_590_])
									/ (i_591_ * 256);
						}
						f_593_ = f_582_ + f_592_ * (f_592_ < 0.0F ? f_584_ : f_583_);
						i_594_ = (int) (f_587_ * f_593_);
						if (i_594_ < 0) {
							i_594_ = 0;
						} else if (i_594_ > 255) {
							i_594_ = 255;
						}
						i_595_ = (int) (f_588_ * f_593_);
						if (i_595_ < 0) {
							i_595_ = 0;
						} else if (i_595_ > 255) {
							i_595_ = 255;
						}
						i_596_ = (int) (f_589_ * f_593_);
						if (i_596_ < 0) {
							i_596_ = 0;
						} else if (i_596_ > 255) {
							i_596_ = 255;
						}
						rsfloatbuffer.offset = (i_558_ + i_590_ * i) * 1258142129;
						rsfloatbuffer.writeByte(i_594_);
						rsfloatbuffer.writeByte(i_595_);
						rsfloatbuffer.writeByte(i_596_);
						rsfloatbuffer.writeByte(255 - (aByteArray8876[i_585_] & 0xff));
						i_590_ = aShortArray8899[i_585_] & 0xffff;
						i_591_ = is_579_[i_590_];
						if (i_591_ == 0) {
							f_592_ = (f * is[i_590_] + f_580_ * is_577_[i_590_] + f_581_ * is_578_[i_590_]) * 0.0026041667F;
						} else {
							f_592_ = (f * is[i_590_] + f_580_ * is_577_[i_590_] + f_581_ * is_578_[i_590_])
									/ (i_591_ * 256);
						}
						f_593_ = f_582_ + f_592_ * (f_592_ < 0.0F ? f_584_ : f_583_);
						i_594_ = (int) (f_587_ * f_593_);
						if (i_594_ < 0) {
							i_594_ = 0;
						} else if (i_594_ > 255) {
							i_594_ = 255;
						}
						i_595_ = (int) (f_588_ * f_593_);
						if (i_595_ < 0) {
							i_595_ = 0;
						} else if (i_595_ > 255) {
							i_595_ = 255;
						}
						i_596_ = (int) (f_589_ * f_593_);
						if (i_596_ < 0) {
							i_596_ = 0;
						} else if (i_596_ > 255) {
							i_596_ = 255;
						}
						rsfloatbuffer.offset = (i_558_ + i_590_ * i) * 1258142129;
						rsfloatbuffer.writeByte(i_594_);
						rsfloatbuffer.writeByte(i_595_);
						rsfloatbuffer.writeByte(i_596_);
						rsfloatbuffer.writeByte(255 - (aByteArray8876[i_585_] & 0xff));
					}
				} else {
					for (int i_597_ = 0; i_597_ < anInt8893; i_597_++) {
						int i_598_ = method14210(aShortArray8870[i_597_], aShortArray8900[i_597_], aShort8917,
								aByteArray8876[i_597_]);
						rsfloatbuffer.offset = (i_558_ + (aShortArray8920[i_597_] & 0xffff) * i) * 1258142129;
						rsfloatbuffer.writeInt(i_598_);
						rsfloatbuffer.offset = (i_558_ + (aShortArray8898[i_597_] & 0xffff) * i) * 1258142129;
						rsfloatbuffer.writeInt(i_598_);
						rsfloatbuffer.offset = (i_558_ + (aShortArray8899[i_597_] & 0xffff) * i) * 1258142129;
						rsfloatbuffer.writeInt(i_598_);
					}
				}
			}
			if (bool_554_) {
				short[] is;
				short[] is_599_;
				short[] is_600_;
				byte[] is_601_;
				if (aClass127_8865 != null) {
					is = aClass127_8865.aShortArray1487;
					is_599_ = aClass127_8865.aShortArray1486;
					is_600_ = aClass127_8865.aShortArray1488;
					is_601_ = aClass127_8865.aByteArray1489;
				} else {
					is = aShortArray8885;
					is_599_ = aShortArray8887;
					is_600_ = aShortArray8868;
					is_601_ = aByteArray8889;
				}
				float f = 3.0F / aShort8875;
				float f_602_ = 3.0F / (aShort8875 + aShort8875 / 2);
				rsfloatbuffer.offset = i_559_ * 1258142129;
				if (toolkit.bigEndian) {
					for (int i_603_ = 0; i_603_ < uniqueVertices; i_603_++) {
						int i_604_ = is_601_[i_603_] & 0xff;
						if (i_604_ == 0) {
							rsfloatbuffer.writeFloat(is[i_603_] * f_602_);
							rsfloatbuffer.writeFloat(is_599_[i_603_] * f_602_);
							rsfloatbuffer.writeFloat(is_600_[i_603_] * f_602_);
						} else {
							float f_605_ = f / i_604_;
							rsfloatbuffer.writeFloat(is[i_603_] * f_605_);
							rsfloatbuffer.writeFloat(is_599_[i_603_] * f_605_);
							rsfloatbuffer.writeFloat(is_600_[i_603_] * f_605_);
						}
						rsfloatbuffer.offset += (i - 12) * 1258142129;
					}
				} else {
					for (int i_606_ = 0; i_606_ < uniqueVertices; i_606_++) {
						int i_607_ = is_601_[i_606_] & 0xff;
						if (i_607_ == 0) {
							rsfloatbuffer.writeLEFloat(is[i_606_] * f_602_);
							rsfloatbuffer.writeLEFloat(is_599_[i_606_] * f_602_);
							rsfloatbuffer.writeLEFloat(is_600_[i_606_] * f_602_);
						} else {
							float f_608_ = f / i_607_;
							rsfloatbuffer.writeLEFloat(is[i_606_] * f_608_);
							rsfloatbuffer.writeLEFloat(is_599_[i_606_] * f_608_);
							rsfloatbuffer.writeLEFloat(is_600_[i_606_] * f_608_);
						}
						rsfloatbuffer.offset += (i - 12) * 1258142129;
					}
				}
			}
			if (bool_556_) {
				rsfloatbuffer.offset = i_560_ * 1258142129;
				if (toolkit.bigEndian) {
					for (int i_609_ = 0; i_609_ < uniqueVertices; i_609_++) {
						rsfloatbuffer.writeFloat(aFloatArray8891[i_609_]);
						rsfloatbuffer.writeFloat(aFloatArray8892[i_609_]);
						rsfloatbuffer.offset += (i - 8) * 1258142129;
					}
				} else {
					for (int i_610_ = 0; i_610_ < uniqueVertices; i_610_++) {
						rsfloatbuffer.writeLEFloat(aFloatArray8891[i_610_]);
						rsfloatbuffer.writeLEFloat(aFloatArray8892[i_610_]);
						rsfloatbuffer.offset += (i - 8) * 1258142129;
					}
				}
			}
			rsfloatbuffer.offset = i * uniqueVertices * 1258142129;
			ArrayBuffer interface11;
			if (bool) {
				if (anInterface11_8909 == null) {
					anInterface11_8909 = toolkit.createArrayBuffer(i, rsfloatbuffer.payload, rsfloatbuffer.offset
							* -165875887, true);
				} else {
					anInterface11_8909.write(i, rsfloatbuffer.payload, rsfloatbuffer.offset * -165875887);
				}
				interface11 = anInterface11_8909;
				aByte8901 = (byte) 0;
			} else {
				interface11 = toolkit.createArrayBuffer(i, rsfloatbuffer.payload, rsfloatbuffer.offset * -165875887,
						false);
				aBool8910 = true;
			}
			if (bool_555_) {
				aClass94_8890.buffer = interface11;
				aClass94_8890.offset = i_557_;
			}
			if (bool_556_) {
				aClass94_8906.buffer = interface11;
				aClass94_8906.offset = i_560_;
			}
			if (bool_553_) {
				aClass94_8904.buffer = interface11;
				aClass94_8904.offset = i_558_;
			}
			if (bool_554_) {
				aClass94_8905.buffer = interface11;
				aClass94_8905.offset = i_559_;
			}
		}
	}

	int method14210(int i, short i_611_, int i_612_, byte i_613_) {
		int i_614_ = Class598.HSL_TABLE[method14211(i, i_612_)];
		if (i_611_ != -1) {
			TextureMetrics class141 = toolkit.metricsList.get(i_611_ & 0xffff);
			int i_615_ = class141.alpha & 0xff;
			if (i_615_ != 0) {
				int i_616_;
				if (i_612_ < 0) {
					i_616_ = 0;
				} else if (i_612_ > 127) {
					i_616_ = 16777215;
				} else {
					i_616_ = 131586 * i_612_;
				}
				if (i_615_ == 256) {
					i_614_ = i_616_;
				} else {
					int i_617_ = i_615_;
					int i_618_ = 256 - i_615_;
					i_614_ = ((i_616_ & 0xff00ff) * i_617_ + (i_614_ & 0xff00ff) * i_618_ & ~0xff00ff)
							+ ((i_616_ & 0xff00) * i_617_ + (i_614_ & 0xff00) * i_618_ & 0xff0000) >> 8;
				}
			}
			int i_619_ = class141.colourOffset & 0xff;
			if (i_619_ != 0) {
				i_619_ += 256;
				int i_620_ = ((i_614_ & 0xff0000) >> 16) * i_619_;
				if (i_620_ > 65535) {
					i_620_ = 65535;
				}
				int i_621_ = ((i_614_ & 0xff00) >> 8) * i_619_;
				if (i_621_ > 65535) {
					i_621_ = 65535;
				}
				int i_622_ = (i_614_ & 0xff) * i_619_;
				if (i_622_ > 65535) {
					i_622_ = 65535;
				}
				i_614_ = (i_620_ << 8 & 0xff0000) + (i_621_ & 0xff00) + (i_622_ >> 8);
			}
		}
		return i_614_ << 8 | 255 - (i_613_ & 0xff);
	}

	boolean method14220(int i, int i_775_, int i_776_, int i_777_, int i_778_, int i_779_, int i_780_, int i_781_) {
		if (i_775_ < i_776_ && i_775_ < i_777_ && i_775_ < i_778_) {
			return false;
		}
		if (i_775_ > i_776_ && i_775_ > i_777_ && i_775_ > i_778_) {
			return false;
		}
		if (i < i_779_ && i < i_780_ && i < i_781_) {
			return false;
		}
		return !(i > i_779_ && i > i_780_ && i > i_781_);
	}

	@Override
	void method2903() {

	}

	@Override
	void method2904() {

	}

	@Override
	void method2913(int i, int[] is, int i_277_, int i_278_, int i_279_, boolean bool, int i_280_, int[] is_281_) {
		int i_282_ = is.length;
		if (i == 0) {
			i_277_ <<= 4;
			i_278_ <<= 4;
			i_279_ <<= 4;
			int i_283_ = 0;
			anInt8936 = 0;
			anInt8874 = 0;
			anInt8938 = 0;
			for (int i_284_ = 0; i_284_ < i_282_; i_284_++) {
				int i_285_ = is[i_284_];
				if (i_285_ < anIntArrayArray8921.length) {
					int[] is_286_ = anIntArrayArray8921[i_285_];
					for (int i_288_ : is_286_) {
						if (aShortArray8884 == null || (i_280_ & aShortArray8884[i_288_]) != 0) {
							anInt8936 += vertexX[i_288_];
							anInt8874 += vertexY[i_288_];
							anInt8938 += vertexZ[i_288_];
							i_283_++;
						}
					}
				}
			}
			if (i_283_ > 0) {
				anInt8936 = anInt8936 / i_283_ + i_277_;
				anInt8874 = anInt8874 / i_283_ + i_278_;
				anInt8938 = anInt8938 / i_283_ + i_279_;
				aBool8939 = true;
			} else {
				anInt8936 = i_277_;
				anInt8874 = i_278_;
				anInt8938 = i_279_;
			}
		} else if (i == 1) {
			if (is_281_ != null) {
				int i_289_ = is_281_[0] * i_277_ + is_281_[1] * i_278_ + is_281_[2] * i_279_ + 8192 >> 14;
				int i_290_ = is_281_[3] * i_277_ + is_281_[4] * i_278_ + is_281_[5] * i_279_ + 8192 >> 14;
				int i_291_ = is_281_[6] * i_277_ + is_281_[7] * i_278_ + is_281_[8] * i_279_ + 8192 >> 14;
				i_277_ = i_289_;
				i_278_ = i_290_;
				i_279_ = i_291_;
			}
			i_277_ <<= 4;
			i_278_ <<= 4;
			i_279_ <<= 4;
			for (int i_292_ = 0; i_292_ < i_282_; i_292_++) {
				int i_293_ = is[i_292_];
				if (i_293_ < anIntArrayArray8921.length) {
					int[] is_294_ = anIntArrayArray8921[i_293_];
					for (int element : is_294_) {
						int i_296_ = element;
						if (aShortArray8884 == null || (i_280_ & aShortArray8884[i_296_]) != 0) {
							vertexX[i_296_] += i_277_;
							vertexY[i_296_] += i_278_;
							vertexZ[i_296_] += i_279_;
						}
					}
				}
			}
		} else if (i == 2) {
			if (is_281_ != null) {
				int i_297_ = is_281_[9] << 4;
				int i_298_ = is_281_[10] << 4;
				int i_299_ = is_281_[11] << 4;
				int i_300_ = is_281_[12] << 4;
				int i_301_ = is_281_[13] << 4;
				int i_302_ = is_281_[14] << 4;
				if (aBool8939) {
					int i_303_ = is_281_[0] * anInt8936 + is_281_[3] * anInt8874 + is_281_[6] * anInt8938 + 8192 >> 14;
					int i_304_ = is_281_[1] * anInt8936 + is_281_[4] * anInt8874 + is_281_[7] * anInt8938 + 8192 >> 14;
					int i_305_ = is_281_[2] * anInt8936 + is_281_[5] * anInt8874 + is_281_[8] * anInt8938 + 8192 >> 14;
					i_303_ += i_300_;
					i_304_ += i_301_;
					i_305_ += i_302_;
					anInt8936 = i_303_;
					anInt8874 = i_304_;
					anInt8938 = i_305_;
					aBool8939 = false;
				}
				int[] is_306_ = new int[9];
				int i_307_ = Class373.COSINE[i_277_];
				int i_308_ = Class373.SINE[i_277_];
				int i_309_ = Class373.COSINE[i_278_];
				int i_310_ = Class373.SINE[i_278_];
				int i_311_ = Class373.COSINE[i_279_];
				int i_312_ = Class373.SINE[i_279_];
				int i_313_ = i_308_ * i_311_ + 8192 >> 14;
				int i_314_ = i_308_ * i_312_ + 8192 >> 14;
				is_306_[0] = i_309_ * i_311_ + i_310_ * i_314_ + 8192 >> 14;
				is_306_[1] = -i_309_ * i_312_ + i_310_ * i_313_ + 8192 >> 14;
				is_306_[2] = i_310_ * i_307_ + 8192 >> 14;
				is_306_[3] = i_307_ * i_312_ + 8192 >> 14;
				is_306_[4] = i_307_ * i_311_ + 8192 >> 14;
				is_306_[5] = -i_308_;
				is_306_[6] = -i_310_ * i_311_ + i_309_ * i_314_ + 8192 >> 14;
				is_306_[7] = i_310_ * i_312_ + i_309_ * i_313_ + 8192 >> 14;
				is_306_[8] = i_309_ * i_307_ + 8192 >> 14;
				int i_315_ = is_306_[0] * -anInt8936 + is_306_[1] * -anInt8874 + is_306_[2] * -anInt8938 + 8192 >> 14;
				int i_316_ = is_306_[3] * -anInt8936 + is_306_[4] * -anInt8874 + is_306_[5] * -anInt8938 + 8192 >> 14;
				int i_317_ = is_306_[6] * -anInt8936 + is_306_[7] * -anInt8874 + is_306_[8] * -anInt8938 + 8192 >> 14;
				int i_318_ = i_315_ + anInt8936;
				int i_319_ = i_316_ + anInt8874;
				int i_320_ = i_317_ + anInt8938;
				int[] is_321_ = new int[9];
				for (int i_322_ = 0; i_322_ < 3; i_322_++) {
					for (int i_323_ = 0; i_323_ < 3; i_323_++) {
						int i_324_ = 0;
						for (int i_325_ = 0; i_325_ < 3; i_325_++) {
							i_324_ += is_306_[i_322_ * 3 + i_325_] * is_281_[i_323_ * 3 + i_325_];
						}
						is_321_[i_322_ * 3 + i_323_] = i_324_ + 8192 >> 14;
					}
				}
				int i_326_ = is_306_[0] * i_300_ + is_306_[1] * i_301_ + is_306_[2] * i_302_ + 8192 >> 14;
				int i_327_ = is_306_[3] * i_300_ + is_306_[4] * i_301_ + is_306_[5] * i_302_ + 8192 >> 14;
				int i_328_ = is_306_[6] * i_300_ + is_306_[7] * i_301_ + is_306_[8] * i_302_ + 8192 >> 14;
				i_326_ += i_318_;
				i_327_ += i_319_;
				i_328_ += i_320_;
				int[] is_329_ = new int[9];
				for (int i_330_ = 0; i_330_ < 3; i_330_++) {
					for (int i_331_ = 0; i_331_ < 3; i_331_++) {
						int i_332_ = 0;
						for (int i_333_ = 0; i_333_ < 3; i_333_++) {
							i_332_ += is_281_[i_330_ * 3 + i_333_] * is_321_[i_331_ + i_333_ * 3];
						}
						is_329_[i_330_ * 3 + i_331_] = i_332_ + 8192 >> 14;
					}
				}
				int i_334_ = is_281_[0] * i_326_ + is_281_[1] * i_327_ + is_281_[2] * i_328_ + 8192 >> 14;
				int i_335_ = is_281_[3] * i_326_ + is_281_[4] * i_327_ + is_281_[5] * i_328_ + 8192 >> 14;
				int i_336_ = is_281_[6] * i_326_ + is_281_[7] * i_327_ + is_281_[8] * i_328_ + 8192 >> 14;
				i_334_ += i_297_;
				i_335_ += i_298_;
				i_336_ += i_299_;
				for (int i_337_ = 0; i_337_ < i_282_; i_337_++) {
					int i_338_ = is[i_337_];
					if (i_338_ < anIntArrayArray8921.length) {
						int[] is_339_ = anIntArrayArray8921[i_338_];
						for (int element : is_339_) {
							int i_341_ = element;
							if (aShortArray8884 == null || (i_280_ & aShortArray8884[i_341_]) != 0) {
								int i_342_ = is_329_[0] * vertexX[i_341_] + is_329_[1] * vertexY[i_341_] + is_329_[2]
										* vertexZ[i_341_] + 8192 >> 14;
								int i_343_ = is_329_[3] * vertexX[i_341_] + is_329_[4] * vertexY[i_341_] + is_329_[5]
										* vertexZ[i_341_] + 8192 >> 14;
								int i_344_ = is_329_[6] * vertexX[i_341_] + is_329_[7] * vertexY[i_341_] + is_329_[8]
										* vertexZ[i_341_] + 8192 >> 14;
								i_342_ += i_334_;
								i_343_ += i_335_;
								i_344_ += i_336_;
								vertexX[i_341_] = i_342_;
								vertexY[i_341_] = i_343_;
								vertexZ[i_341_] = i_344_;
							}
						}
					}
				}
			} else {
				for (int i_345_ = 0; i_345_ < i_282_; i_345_++) {
					int i_346_ = is[i_345_];
					if (i_346_ < anIntArrayArray8921.length) {
						int[] is_347_ = anIntArrayArray8921[i_346_];
						for (int element : is_347_) {
							int i_349_ = element;
							if (aShortArray8884 == null || (i_280_ & aShortArray8884[i_349_]) != 0) {
								vertexX[i_349_] -= anInt8936;
								vertexY[i_349_] -= anInt8874;
								vertexZ[i_349_] -= anInt8938;
								if (i_279_ != 0) {
									int i_350_ = Class373.SINE[i_279_];
									int i_351_ = Class373.COSINE[i_279_];
									int i_352_ = vertexY[i_349_] * i_350_ + vertexX[i_349_] * i_351_ + 16383 >> 14;
									vertexY[i_349_] = vertexY[i_349_] * i_351_ - vertexX[i_349_] * i_350_ + 16383 >> 14;
									vertexX[i_349_] = i_352_;
								}
								if (i_277_ != 0) {
									int i_353_ = Class373.SINE[i_277_];
									int i_354_ = Class373.COSINE[i_277_];
									int i_355_ = vertexY[i_349_] * i_354_ - vertexZ[i_349_] * i_353_ + 16383 >> 14;
									vertexZ[i_349_] = vertexY[i_349_] * i_353_ + vertexZ[i_349_] * i_354_ + 16383 >> 14;
									vertexY[i_349_] = i_355_;
								}
								if (i_278_ != 0) {
									int i_356_ = Class373.SINE[i_278_];
									int i_357_ = Class373.COSINE[i_278_];
									int i_358_ = vertexZ[i_349_] * i_356_ + vertexX[i_349_] * i_357_ + 16383 >> 14;
									vertexZ[i_349_] = vertexZ[i_349_] * i_357_ - vertexX[i_349_] * i_356_ + 16383 >> 14;
									vertexX[i_349_] = i_358_;
								}
								vertexX[i_349_] += anInt8936;
								vertexY[i_349_] += anInt8874;
								vertexZ[i_349_] += anInt8938;
							}
						}
					}
				}
				if (bool) {
					for (int i_359_ = 0; i_359_ < i_282_; i_359_++) {
						int i_360_ = is[i_359_];
						if (i_360_ < anIntArrayArray8921.length) {
							int[] is_361_ = anIntArrayArray8921[i_360_];
							for (int i_363_ : is_361_) {
								if (aShortArray8884 == null || (i_280_ & aShortArray8884[i_363_]) != 0) {
									int i_364_ = sharedFaces[i_363_];
									int i_365_ = sharedFaces[i_363_ + 1];
									for (int i_366_ = i_364_; i_366_ < i_365_ && aShortArray8924[i_366_] != 0; i_366_++) {
										int i_367_ = (aShortArray8924[i_366_] & 0xffff) - 1;
										if (i_279_ != 0) {
											int i_368_ = Class373.SINE[i_279_];
											int i_369_ = Class373.COSINE[i_279_];
											int i_370_ = aShortArray8887[i_367_] * i_368_ + aShortArray8885[i_367_]
													* i_369_ + 16383 >> 14;
											aShortArray8887[i_367_] = (short) (aShortArray8887[i_367_] * i_369_
													- aShortArray8885[i_367_] * i_368_ + 16383 >> 14);
											aShortArray8885[i_367_] = (short) i_370_;
										}
										if (i_277_ != 0) {
											int i_371_ = Class373.SINE[i_277_];
											int i_372_ = Class373.COSINE[i_277_];
											int i_373_ = aShortArray8887[i_367_] * i_372_ - aShortArray8868[i_367_]
													* i_371_ + 16383 >> 14;
											aShortArray8868[i_367_] = (short) (aShortArray8887[i_367_] * i_371_
													+ aShortArray8868[i_367_] * i_372_ + 16383 >> 14);
											aShortArray8887[i_367_] = (short) i_373_;
										}
										if (i_278_ != 0) {
											int i_374_ = Class373.SINE[i_278_];
											int i_375_ = Class373.COSINE[i_278_];
											int i_376_ = aShortArray8868[i_367_] * i_374_ + aShortArray8885[i_367_]
													* i_375_ + 16383 >> 14;
											aShortArray8868[i_367_] = (short) (aShortArray8868[i_367_] * i_375_
													- aShortArray8885[i_367_] * i_374_ + 16383 >> 14);
											aShortArray8885[i_367_] = (short) i_376_;
										}
									}
								}
							}
						}
					}
					if (aClass94_8905 == null && aClass94_8904 != null) {
						aClass94_8904.buffer = null;
					}
					if (aClass94_8905 != null) {
						aClass94_8905.buffer = null;
					}
				}
			}
		} else if (i == 3) {
			if (is_281_ != null) {
				int i_377_ = is_281_[9] << 4;
				int i_378_ = is_281_[10] << 4;
				int i_379_ = is_281_[11] << 4;
				int i_380_ = is_281_[12] << 4;
				int i_381_ = is_281_[13] << 4;
				int i_382_ = is_281_[14] << 4;
				if (aBool8939) {
					int i_383_ = is_281_[0] * anInt8936 + is_281_[3] * anInt8874 + is_281_[6] * anInt8938 + 8192 >> 14;
					int i_384_ = is_281_[1] * anInt8936 + is_281_[4] * anInt8874 + is_281_[7] * anInt8938 + 8192 >> 14;
					int i_385_ = is_281_[2] * anInt8936 + is_281_[5] * anInt8874 + is_281_[8] * anInt8938 + 8192 >> 14;
					i_383_ += i_380_;
					i_384_ += i_381_;
					i_385_ += i_382_;
					anInt8936 = i_383_;
					anInt8874 = i_384_;
					anInt8938 = i_385_;
					aBool8939 = false;
				}
				int i_386_ = i_277_ << 15 >> 7;
				int i_387_ = i_278_ << 15 >> 7;
				int i_388_ = i_279_ << 15 >> 7;
				int i_389_ = i_386_ * -anInt8936 + 8192 >> 14;
				int i_390_ = i_387_ * -anInt8874 + 8192 >> 14;
				int i_391_ = i_388_ * -anInt8938 + 8192 >> 14;
				int i_392_ = i_389_ + anInt8936;
				int i_393_ = i_390_ + anInt8874;
				int i_394_ = i_391_ + anInt8938;
				int[] is_395_ = new int[9];
				is_395_[0] = i_386_ * is_281_[0] + 8192 >> 14;
				is_395_[1] = i_386_ * is_281_[3] + 8192 >> 14;
				is_395_[2] = i_386_ * is_281_[6] + 8192 >> 14;
				is_395_[3] = i_387_ * is_281_[1] + 8192 >> 14;
				is_395_[4] = i_387_ * is_281_[4] + 8192 >> 14;
				is_395_[5] = i_387_ * is_281_[7] + 8192 >> 14;
				is_395_[6] = i_388_ * is_281_[2] + 8192 >> 14;
				is_395_[7] = i_388_ * is_281_[5] + 8192 >> 14;
				is_395_[8] = i_388_ * is_281_[8] + 8192 >> 14;
				int i_396_ = i_386_ * i_380_ + 8192 >> 14;
				int i_397_ = i_387_ * i_381_ + 8192 >> 14;
				int i_398_ = i_388_ * i_382_ + 8192 >> 14;
				i_396_ += i_392_;
				i_397_ += i_393_;
				i_398_ += i_394_;
				int[] is_399_ = new int[9];
				for (int i_400_ = 0; i_400_ < 3; i_400_++) {
					for (int i_401_ = 0; i_401_ < 3; i_401_++) {
						int i_402_ = 0;
						for (int i_403_ = 0; i_403_ < 3; i_403_++) {
							i_402_ += is_281_[i_400_ * 3 + i_403_] * is_395_[i_401_ + i_403_ * 3];
						}
						is_399_[i_400_ * 3 + i_401_] = i_402_ + 8192 >> 14;
					}
				}
				int i_404_ = is_281_[0] * i_396_ + is_281_[1] * i_397_ + is_281_[2] * i_398_ + 8192 >> 14;
				int i_405_ = is_281_[3] * i_396_ + is_281_[4] * i_397_ + is_281_[5] * i_398_ + 8192 >> 14;
				int i_406_ = is_281_[6] * i_396_ + is_281_[7] * i_397_ + is_281_[8] * i_398_ + 8192 >> 14;
				i_404_ += i_377_;
				i_405_ += i_378_;
				i_406_ += i_379_;
				for (int i_407_ = 0; i_407_ < i_282_; i_407_++) {
					int i_408_ = is[i_407_];
					if (i_408_ < anIntArrayArray8921.length) {
						int[] is_409_ = anIntArrayArray8921[i_408_];
						for (int element : is_409_) {
							int i_411_ = element;
							if (aShortArray8884 == null || (i_280_ & aShortArray8884[i_411_]) != 0) {
								int i_412_ = is_399_[0] * vertexX[i_411_] + is_399_[1] * vertexY[i_411_] + is_399_[2]
										* vertexZ[i_411_] + 8192 >> 14;
								int i_413_ = is_399_[3] * vertexX[i_411_] + is_399_[4] * vertexY[i_411_] + is_399_[5]
										* vertexZ[i_411_] + 8192 >> 14;
								int i_414_ = is_399_[6] * vertexX[i_411_] + is_399_[7] * vertexY[i_411_] + is_399_[8]
										* vertexZ[i_411_] + 8192 >> 14;
								i_412_ += i_404_;
								i_413_ += i_405_;
								i_414_ += i_406_;
								vertexX[i_411_] = i_412_;
								vertexY[i_411_] = i_413_;
								vertexZ[i_411_] = i_414_;
							}
						}
					}
				}
			} else {
				for (int i_415_ = 0; i_415_ < i_282_; i_415_++) {
					int i_416_ = is[i_415_];
					if (i_416_ < anIntArrayArray8921.length) {
						int[] is_417_ = anIntArrayArray8921[i_416_];
						for (int element : is_417_) {
							int i_419_ = element;
							if (aShortArray8884 == null || (i_280_ & aShortArray8884[i_419_]) != 0) {
								vertexX[i_419_] -= anInt8936;
								vertexY[i_419_] -= anInt8874;
								vertexZ[i_419_] -= anInt8938;
								vertexX[i_419_] = vertexX[i_419_] * i_277_ >> 7;
								vertexY[i_419_] = vertexY[i_419_] * i_278_ >> 7;
								vertexZ[i_419_] = vertexZ[i_419_] * i_279_ >> 7;
								vertexX[i_419_] += anInt8936;
								vertexY[i_419_] += anInt8874;
								vertexZ[i_419_] += anInt8938;
							}
						}
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray8918 != null) {
				for (int i_420_ = 0; i_420_ < i_282_; i_420_++) {
					int i_421_ = is[i_420_];
					if (i_421_ < anIntArrayArray8918.length) {
						int[] is_422_ = anIntArrayArray8918[i_421_];
						for (int element : is_422_) {
							int i_424_ = element;
							if (aShortArray8902 == null || (i_280_ & aShortArray8902[i_424_]) != 0) {
								int i_425_ = (aByteArray8876[i_424_] & 0xff) + i_277_ * 8;
								if (i_425_ < 0) {
									i_425_ = 0;
								} else if (i_425_ > 255) {
									i_425_ = 255;
								}
								aByteArray8876[i_424_] = (byte) i_425_;
								if (aClass94_8904 != null) {
									aClass94_8904.buffer = null;
								}
							}
						}
					}
				}
				if (aClass130Array8928 != null) {
					for (int i_426_ = 0; i_426_ < anInt8872; i_426_++) {
						Class130 class130 = aClass130Array8928[i_426_];
						Class86 class86 = aClass86Array8929[i_426_];
						class86.anInt1229 = class86.anInt1229 & 0xffffff
								| 255 - (aByteArray8876[class130.anInt1504] & 0xff) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray8918 != null) {
				for (int i_427_ = 0; i_427_ < i_282_; i_427_++) {
					int i_428_ = is[i_427_];
					if (i_428_ < anIntArrayArray8918.length) {
						int[] is_429_ = anIntArrayArray8918[i_428_];
						for (int element : is_429_) {
							int i_431_ = element;
							if (aShortArray8902 == null || (i_280_ & aShortArray8902[i_431_]) != 0) {
								int i_432_ = aShortArray8870[i_431_] & 0xffff;
								int i_433_ = i_432_ >> 10 & 0x3f;
								int i_434_ = i_432_ >> 7 & 0x7;
								int i_435_ = i_432_ & 0x7f;
								i_433_ = i_433_ + i_277_ & 0x3f;
								i_434_ += i_278_ / 4;
								if (i_434_ < 0) {
									i_434_ = 0;
								} else if (i_434_ > 7) {
									i_434_ = 7;
								}
								i_435_ += i_279_;
								if (i_435_ < 0) {
									i_435_ = 0;
								} else if (i_435_ > 127) {
									i_435_ = 127;
								}
								aShortArray8870[i_431_] = (short) (i_433_ << 10 | i_434_ << 7 | i_435_);
								if (aClass94_8904 != null) {
									aClass94_8904.buffer = null;
								}
							}
						}
					}
				}
				if (aClass130Array8928 != null) {
					for (int i_436_ = 0; i_436_ < anInt8872; i_436_++) {
						Class130 class130 = aClass130Array8928[i_436_];
						Class86 class86 = aClass86Array8929[i_436_];
						class86.anInt1229 = class86.anInt1229 & ~0xffffff
								| Class598.HSL_TABLE[aShortArray8870[class130.anInt1504] & 0xffff] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray8930 != null) {
				for (int i_437_ = 0; i_437_ < i_282_; i_437_++) {
					int i_438_ = is[i_437_];
					if (i_438_ < anIntArrayArray8930.length) {
						int[] is_439_ = anIntArrayArray8930[i_438_];
						for (int element : is_439_) {
							Class86 class86 = aClass86Array8929[element];
							class86.anInt1231 += i_277_;
							class86.anInt1232 += i_278_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray8930 != null) {
				for (int i_441_ = 0; i_441_ < i_282_; i_441_++) {
					int i_442_ = is[i_441_];
					if (i_442_ < anIntArrayArray8930.length) {
						int[] is_443_ = anIntArrayArray8930[i_442_];
						for (int element : is_443_) {
							Class86 class86 = aClass86Array8929[element];
							class86.anInt1228 = class86.anInt1228 * i_277_ >> 7;
							class86.anInt1230 = class86.anInt1230 * i_278_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray8930 != null) {
				for (int i_445_ = 0; i_445_ < i_282_; i_445_++) {
					int i_446_ = is[i_445_];
					if (i_446_ < anIntArrayArray8930.length) {
						int[] is_447_ = anIntArrayArray8930[i_446_];
						for (int element : is_447_) {
							Class86 class86 = aClass86Array8929[element];
							class86.anInt1233 = class86.anInt1233 + i_277_ & 0x3fff;
						}
					}
				}
			}
		}
	}

	@Override
	void transform(int type, int dx, int dy, int dz) {
		if (type == 0) {
			int i_452_ = 0;
			anInt8936 = 0;
			anInt8874 = 0;
			anInt8938 = 0;
			for (int i_453_ = 0; i_453_ < vertexCount; i_453_++) {
				anInt8936 += vertexX[i_453_];
				anInt8874 += vertexY[i_453_];
				anInt8938 += vertexZ[i_453_];
				i_452_++;
			}
			if (i_452_ > 0) {
				anInt8936 = anInt8936 / i_452_ + dx;
				anInt8874 = anInt8874 / i_452_ + dy;
				anInt8938 = anInt8938 / i_452_ + dz;
			} else {
				anInt8936 = dx;
				anInt8874 = dy;
				anInt8938 = dz;
			}
		} else if (type == 1) {
			for (int i_454_ = 0; i_454_ < vertexCount; i_454_++) {
				vertexX[i_454_] += dx;
				vertexY[i_454_] += dy;
				vertexZ[i_454_] += dz;
			}
		} else if (type == 2) {
			for (int i_455_ = 0; i_455_ < vertexCount; i_455_++) {
				vertexX[i_455_] -= anInt8936;
				vertexY[i_455_] -= anInt8874;
				vertexZ[i_455_] -= anInt8938;
				if (dz != 0) {
					int i_456_ = Class373.SINE[dz];
					int i_457_ = Class373.COSINE[dz];
					int i_458_ = vertexY[i_455_] * i_456_ + vertexX[i_455_] * i_457_ + 16383 >> 14;
					vertexY[i_455_] = vertexY[i_455_] * i_457_ - vertexX[i_455_] * i_456_ + 16383 >> 14;
					vertexX[i_455_] = i_458_;
				}
				if (dx != 0) {
					int i_459_ = Class373.SINE[dx];
					int i_460_ = Class373.COSINE[dx];
					int i_461_ = vertexY[i_455_] * i_460_ - vertexZ[i_455_] * i_459_ + 16383 >> 14;
					vertexZ[i_455_] = vertexY[i_455_] * i_459_ + vertexZ[i_455_] * i_460_ + 16383 >> 14;
					vertexY[i_455_] = i_461_;
				}
				if (dy != 0) {
					int i_462_ = Class373.SINE[dy];
					int i_463_ = Class373.COSINE[dy];
					int i_464_ = vertexZ[i_455_] * i_462_ + vertexX[i_455_] * i_463_ + 16383 >> 14;
					vertexZ[i_455_] = vertexZ[i_455_] * i_463_ - vertexX[i_455_] * i_462_ + 16383 >> 14;
					vertexX[i_455_] = i_464_;
				}
				vertexX[i_455_] += anInt8936;
				vertexY[i_455_] += anInt8874;
				vertexZ[i_455_] += anInt8938;
			}
		} else if (type == 3) {
			for (int i_465_ = 0; i_465_ < vertexCount; i_465_++) {
				vertexX[i_465_] -= anInt8936;
				vertexY[i_465_] -= anInt8874;
				vertexZ[i_465_] -= anInt8938;
				vertexX[i_465_] = vertexX[i_465_] * dx / 128;
				vertexY[i_465_] = vertexY[i_465_] * dy / 128;
				vertexZ[i_465_] = vertexZ[i_465_] * dz / 128;
				vertexX[i_465_] += anInt8936;
				vertexY[i_465_] += anInt8874;
				vertexZ[i_465_] += anInt8938;
			}
		} else if (type == 5) {
			for (int i_466_ = 0; i_466_ < anInt8893; i_466_++) {
				int i_467_ = (aByteArray8876[i_466_] & 0xff) + dx * 8;
				if (i_467_ < 0) {
					i_467_ = 0;
				} else if (i_467_ > 255) {
					i_467_ = 255;
				}
				aByteArray8876[i_466_] = (byte) i_467_;
			}
			if (aClass94_8904 != null) {
				aClass94_8904.buffer = null;
			}
			if (aClass130Array8928 != null) {
				for (int i_468_ = 0; i_468_ < anInt8872; i_468_++) {
					Class130 class130 = aClass130Array8928[i_468_];
					Class86 class86 = aClass86Array8929[i_468_];
					class86.anInt1229 = class86.anInt1229 & 0xffffff
							| 255 - (aByteArray8876[class130.anInt1504] & 0xff) << 24;
				}
			}
		} else if (type == 7) {
			for (int i_469_ = 0; i_469_ < anInt8893; i_469_++) {
				int i_470_ = aShortArray8870[i_469_] & 0xffff;
				int i_471_ = i_470_ >> 10 & 0x3f;
				int i_472_ = i_470_ >> 7 & 0x7;
				int i_473_ = i_470_ & 0x7f;
				i_471_ = i_471_ + dx & 0x3f;
				i_472_ += dy / 4;
				if (i_472_ < 0) {
					i_472_ = 0;
				} else if (i_472_ > 7) {
					i_472_ = 7;
				}
				i_473_ += dz;
				if (i_473_ < 0) {
					i_473_ = 0;
				} else if (i_473_ > 127) {
					i_473_ = 127;
				}
				aShortArray8870[i_469_] = (short) (i_471_ << 10 | i_472_ << 7 | i_473_);
			}
			if (aClass94_8904 != null) {
				aClass94_8904.buffer = null;
			}
			if (aClass130Array8928 != null) {
				for (int i_474_ = 0; i_474_ < anInt8872; i_474_++) {
					Class130 class130 = aClass130Array8928[i_474_];
					Class86 class86 = aClass86Array8929[i_474_];
					class86.anInt1229 = class86.anInt1229 & ~0xffffff
							| Class598.HSL_TABLE[aShortArray8870[class130.anInt1504] & 0xffff] & 0xffffff;
				}
			}
		} else if (type == 8) {
			for (int i_475_ = 0; i_475_ < anInt8872; i_475_++) {
				Class86 class86 = aClass86Array8929[i_475_];
				class86.anInt1231 += dx;
				class86.anInt1232 += dy;
			}
		} else if (type == 10) {
			for (int i_476_ = 0; i_476_ < anInt8872; i_476_++) {
				Class86 class86 = aClass86Array8929[i_476_];
				class86.anInt1228 = class86.anInt1228 * dx >> 7;
				class86.anInt1230 = class86.anInt1230 * dy >> 7;
			}
		} else if (type == 9) {
			for (int i_477_ = 0; i_477_ < anInt8872; i_477_++) {
				Class86 class86 = aClass86Array8929[i_477_];
				class86.anInt1233 = class86.anInt1233 + dx & 0x3fff;
			}
		}
	}

	@Override
	void endAnimation() {
		for (int i = 0; i < anInt8878; i++) {
			vertexX[i] = vertexX[i] + 7 >> 4;
			vertexY[i] = vertexY[i] + 7 >> 4;
			vertexZ[i] = vertexZ[i] + 7 >> 4;
		}
		if (aClass94_8890 != null) {
			aClass94_8890.buffer = null;
		}
		computedBounds = false;
	}

	@Override
	boolean startAnimation() {
		if (anIntArrayArray8921 == null) {
			return false;
		}
		for (int i = 0; i < anInt8878; i++) {
			vertexX[i] <<= 4;
			vertexY[i] <<= 4;
			vertexZ[i] <<= 4;
		}
		anInt8936 = 0;
		anInt8874 = 0;
		anInt8938 = 0;
		return true;
	}

	@Override
	void method3079(int i, int[] is, int i_682_, int i_683_, int i_684_, int i_685_, boolean bool) {
		int i_686_ = is.length;
		if (i == 0) {
			i_682_ <<= 4;
			i_683_ <<= 4;
			i_684_ <<= 4;
			int i_687_ = 0;
			anInt8936 = 0;
			anInt8874 = 0;
			anInt8938 = 0;
			for (int i_688_ = 0; i_688_ < i_686_; i_688_++) {
				int i_689_ = is[i_688_];
				if (i_689_ < anIntArrayArray8921.length) {
					int[] is_690_ = anIntArrayArray8921[i_689_];
					for (int i_692_ : is_690_) {
						anInt8936 += vertexX[i_692_];
						anInt8874 += vertexY[i_692_];
						anInt8938 += vertexZ[i_692_];
						i_687_++;
					}
				}
			}
			if (i_687_ > 0) {
				anInt8936 = anInt8936 / i_687_ + i_682_;
				anInt8874 = anInt8874 / i_687_ + i_683_;
				anInt8938 = anInt8938 / i_687_ + i_684_;
			} else {
				anInt8936 = i_682_;
				anInt8874 = i_683_;
				anInt8938 = i_684_;
			}
		} else if (i == 1) {
			i_682_ <<= 4;
			i_683_ <<= 4;
			i_684_ <<= 4;
			for (int i_693_ = 0; i_693_ < i_686_; i_693_++) {
				int i_694_ = is[i_693_];
				if (i_694_ < anIntArrayArray8921.length) {
					int[] is_695_ = anIntArrayArray8921[i_694_];
					for (int element : is_695_) {
						int i_697_ = element;
						vertexX[i_697_] += i_682_;
						vertexY[i_697_] += i_683_;
						vertexZ[i_697_] += i_684_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_698_ = 0; i_698_ < i_686_; i_698_++) {
				int i_699_ = is[i_698_];
				if (i_699_ < anIntArrayArray8921.length) {
					int[] is_700_ = anIntArrayArray8921[i_699_];
					if ((i_685_ & 0x1) == 0) {
						for (int element : is_700_) {
							int i_702_ = element;
							vertexX[i_702_] -= anInt8936;
							vertexY[i_702_] -= anInt8874;
							vertexZ[i_702_] -= anInt8938;
							if (i_684_ != 0) {
								int i_703_ = Class373.SINE[i_684_];
								int i_704_ = Class373.COSINE[i_684_];
								int i_705_ = vertexY[i_702_] * i_703_ + vertexX[i_702_] * i_704_ + 16383 >> 14;
								vertexY[i_702_] = vertexY[i_702_] * i_704_ - vertexX[i_702_] * i_703_ + 16383 >> 14;
								vertexX[i_702_] = i_705_;
							}
							if (i_682_ != 0) {
								int i_706_ = Class373.SINE[i_682_];
								int i_707_ = Class373.COSINE[i_682_];
								int i_708_ = vertexY[i_702_] * i_707_ - vertexZ[i_702_] * i_706_ + 16383 >> 14;
								vertexZ[i_702_] = vertexY[i_702_] * i_706_ + vertexZ[i_702_] * i_707_ + 16383 >> 14;
								vertexY[i_702_] = i_708_;
							}
							if (i_683_ != 0) {
								int i_709_ = Class373.SINE[i_683_];
								int i_710_ = Class373.COSINE[i_683_];
								int i_711_ = vertexZ[i_702_] * i_709_ + vertexX[i_702_] * i_710_ + 16383 >> 14;
								vertexZ[i_702_] = vertexZ[i_702_] * i_710_ - vertexX[i_702_] * i_709_ + 16383 >> 14;
								vertexX[i_702_] = i_711_;
							}
							vertexX[i_702_] += anInt8936;
							vertexY[i_702_] += anInt8874;
							vertexZ[i_702_] += anInt8938;
						}
					} else {
						for (int element : is_700_) {
							int i_713_ = element;
							vertexX[i_713_] -= anInt8936;
							vertexY[i_713_] -= anInt8874;
							vertexZ[i_713_] -= anInt8938;
							if (i_682_ != 0) {
								int i_714_ = Class373.SINE[i_682_];
								int i_715_ = Class373.COSINE[i_682_];
								int i_716_ = vertexY[i_713_] * i_715_ - vertexZ[i_713_] * i_714_ + 16383 >> 14;
								vertexZ[i_713_] = vertexY[i_713_] * i_714_ + vertexZ[i_713_] * i_715_ + 16383 >> 14;
								vertexY[i_713_] = i_716_;
							}
							if (i_684_ != 0) {
								int i_717_ = Class373.SINE[i_684_];
								int i_718_ = Class373.COSINE[i_684_];
								int i_719_ = vertexY[i_713_] * i_717_ + vertexX[i_713_] * i_718_ + 16383 >> 14;
								vertexY[i_713_] = vertexY[i_713_] * i_718_ - vertexX[i_713_] * i_717_ + 16383 >> 14;
								vertexX[i_713_] = i_719_;
							}
							if (i_683_ != 0) {
								int i_720_ = Class373.SINE[i_683_];
								int i_721_ = Class373.COSINE[i_683_];
								int i_722_ = vertexZ[i_713_] * i_720_ + vertexX[i_713_] * i_721_ + 16383 >> 14;
								vertexZ[i_713_] = vertexZ[i_713_] * i_721_ - vertexX[i_713_] * i_720_ + 16383 >> 14;
								vertexX[i_713_] = i_722_;
							}
							vertexX[i_713_] += anInt8936;
							vertexY[i_713_] += anInt8874;
							vertexZ[i_713_] += anInt8938;
						}
					}
				}
			}
			if (bool) {
				for (int i_723_ = 0; i_723_ < i_686_; i_723_++) {
					int i_724_ = is[i_723_];
					if (i_724_ < anIntArrayArray8921.length) {
						int[] is_725_ = anIntArrayArray8921[i_724_];
						for (int i_727_ : is_725_) {
							int i_728_ = sharedFaces[i_727_];
							int i_729_ = sharedFaces[i_727_ + 1];
							for (int i_730_ = i_728_; i_730_ < i_729_ && aShortArray8924[i_730_] != 0; i_730_++) {
								int i_731_ = (aShortArray8924[i_730_] & 0xffff) - 1;
								if (i_684_ != 0) {
									int i_732_ = Class373.SINE[i_684_];
									int i_733_ = Class373.COSINE[i_684_];
									int i_734_ = aShortArray8887[i_731_] * i_732_ + aShortArray8885[i_731_] * i_733_
											+ 16383 >> 14;
									aShortArray8887[i_731_] = (short) (aShortArray8887[i_731_] * i_733_
											- aShortArray8885[i_731_] * i_732_ + 16383 >> 14);
									aShortArray8885[i_731_] = (short) i_734_;
								}
								if (i_682_ != 0) {
									int i_735_ = Class373.SINE[i_682_];
									int i_736_ = Class373.COSINE[i_682_];
									int i_737_ = aShortArray8887[i_731_] * i_736_ - aShortArray8868[i_731_] * i_735_
											+ 16383 >> 14;
									aShortArray8868[i_731_] = (short) (aShortArray8887[i_731_] * i_735_
											+ aShortArray8868[i_731_] * i_736_ + 16383 >> 14);
									aShortArray8887[i_731_] = (short) i_737_;
								}
								if (i_683_ != 0) {
									int i_738_ = Class373.SINE[i_683_];
									int i_739_ = Class373.COSINE[i_683_];
									int i_740_ = aShortArray8868[i_731_] * i_738_ + aShortArray8885[i_731_] * i_739_
											+ 16383 >> 14;
									aShortArray8868[i_731_] = (short) (aShortArray8868[i_731_] * i_739_
											- aShortArray8885[i_731_] * i_738_ + 16383 >> 14);
									aShortArray8885[i_731_] = (short) i_740_;
								}
							}
						}
					}
				}
				if (aClass94_8905 == null && aClass94_8904 != null) {
					aClass94_8904.buffer = null;
				}
				if (aClass94_8905 != null) {
					aClass94_8905.buffer = null;
				}
			}
		} else if (i == 3) {
			for (int i_741_ = 0; i_741_ < i_686_; i_741_++) {
				int i_742_ = is[i_741_];
				if (i_742_ < anIntArrayArray8921.length) {
					int[] is_743_ = anIntArrayArray8921[i_742_];
					for (int element : is_743_) {
						int i_745_ = element;
						vertexX[i_745_] -= anInt8936;
						vertexY[i_745_] -= anInt8874;
						vertexZ[i_745_] -= anInt8938;
						vertexX[i_745_] = vertexX[i_745_] * i_682_ >> 7;
						vertexY[i_745_] = vertexY[i_745_] * i_683_ >> 7;
						vertexZ[i_745_] = vertexZ[i_745_] * i_684_ >> 7;
						vertexX[i_745_] += anInt8936;
						vertexY[i_745_] += anInt8874;
						vertexZ[i_745_] += anInt8938;
					}
				}
			}
		} else if (i == 5) {
			if (anIntArrayArray8918 != null) {
				for (int i_746_ = 0; i_746_ < i_686_; i_746_++) {
					int i_747_ = is[i_746_];
					if (i_747_ < anIntArrayArray8918.length) {
						int[] is_748_ = anIntArrayArray8918[i_747_];
						for (int element : is_748_) {
							int i_750_ = element;
							int i_751_ = (aByteArray8876[i_750_] & 0xff) + i_682_ * 8;
							if (i_751_ < 0) {
								i_751_ = 0;
							} else if (i_751_ > 255) {
								i_751_ = 255;
							}
							aByteArray8876[i_750_] = (byte) i_751_;
						}
						if (is_748_.length > 0 && aClass94_8904 != null) {
							aClass94_8904.buffer = null;
						}
					}
				}
				if (aClass130Array8928 != null) {
					for (int i_752_ = 0; i_752_ < anInt8872; i_752_++) {
						Class130 class130 = aClass130Array8928[i_752_];
						Class86 class86 = aClass86Array8929[i_752_];
						class86.anInt1229 = class86.anInt1229 & 0xffffff
								| 255 - (aByteArray8876[class130.anInt1504] & 0xff) << 24;
					}
				}
			}
		} else if (i == 7) {
			if (anIntArrayArray8918 != null) {
				for (int i_753_ = 0; i_753_ < i_686_; i_753_++) {
					int i_754_ = is[i_753_];
					if (i_754_ < anIntArrayArray8918.length) {
						int[] is_755_ = anIntArrayArray8918[i_754_];
						for (int element : is_755_) {
							int i_757_ = element;
							int i_758_ = aShortArray8870[i_757_] & 0xffff;
							int i_759_ = i_758_ >> 10 & 0x3f;
							int i_760_ = i_758_ >> 7 & 0x7;
							int i_761_ = i_758_ & 0x7f;
							i_759_ = i_759_ + i_682_ & 0x3f;
							i_760_ += i_683_ / 4;
							if (i_760_ < 0) {
								i_760_ = 0;
							} else if (i_760_ > 7) {
								i_760_ = 7;
							}
							i_761_ += i_684_;
							if (i_761_ < 0) {
								i_761_ = 0;
							} else if (i_761_ > 127) {
								i_761_ = 127;
							}
							aShortArray8870[i_757_] = (short) (i_759_ << 10 | i_760_ << 7 | i_761_);
						}
						if (is_755_.length > 0 && aClass94_8904 != null) {
							aClass94_8904.buffer = null;
						}
					}
				}
				if (aClass130Array8928 != null) {
					for (int i_762_ = 0; i_762_ < anInt8872; i_762_++) {
						Class130 class130 = aClass130Array8928[i_762_];
						Class86 class86 = aClass86Array8929[i_762_];
						class86.anInt1229 = class86.anInt1229 & ~0xffffff
								| Class598.HSL_TABLE[aShortArray8870[class130.anInt1504] & 0xffff] & 0xffffff;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray8930 != null) {
				for (int i_763_ = 0; i_763_ < i_686_; i_763_++) {
					int i_764_ = is[i_763_];
					if (i_764_ < anIntArrayArray8930.length) {
						int[] is_765_ = anIntArrayArray8930[i_764_];
						for (int element : is_765_) {
							Class86 class86 = aClass86Array8929[element];
							class86.anInt1231 += i_682_;
							class86.anInt1232 += i_683_;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray8930 != null) {
				for (int i_767_ = 0; i_767_ < i_686_; i_767_++) {
					int i_768_ = is[i_767_];
					if (i_768_ < anIntArrayArray8930.length) {
						int[] is_769_ = anIntArrayArray8930[i_768_];
						for (int element : is_769_) {
							Class86 class86 = aClass86Array8929[element];
							class86.anInt1228 = class86.anInt1228 * i_682_ >> 7;
							class86.anInt1230 = class86.anInt1230 * i_683_ >> 7;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray8930 != null) {
				for (int i_771_ = 0; i_771_ < i_686_; i_771_++) {
					int i_772_ = is[i_771_];
					if (i_772_ < anIntArrayArray8930.length) {
						int[] is_773_ = anIntArrayArray8930[i_772_];
						for (int element : is_773_) {
							Class86 class86 = aClass86Array8929[element];
							class86.anInt1233 = class86.anInt1233 + i_682_ & 0x3fff;
						}
					}
				}
			}
		}
	}
}
