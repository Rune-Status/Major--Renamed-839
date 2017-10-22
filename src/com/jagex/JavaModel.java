package com.jagex;

public class JavaModel extends Model {
	static int anInt9445 = 4096;
	static int anInt9446 = 4096;
	static final int anInt9447 = -1;
	static final int anInt9448 = -2;
	static final int anInt9449 = 4;
	static final int anInt9451 = 618520;
	static final int anInt9452 = 618648;
	static final int anInt9474 = 0;
	static final int anInt9475 = 1;
	static final int anInt9476 = 2;
	static int anInt9500 = 0;
	static final int anInt9508 = 7;
	int anInt9440;
	int anInt9441;
	JavaThreadResource aClass64_9442;
	JavaThreadResource aClass64_9443;
	Rasterizer aClass109_9444;
	Class145[] aClass145Array9450;
	int anInt9453;
	int[] anIntArray9454;
	int anInt9455;
	int vertexCount;
	int anInt9457;
	int[] vertexX;
	int anInt9459;
	int[] vertexZ;
	short[] aShortArray9461;
	Class84[] aClass84Array9462;
	float[] aFloatArray9463;
	int faceCount;
	boolean aBool9465;
	short[] aShortArray9466;
	short[] aShortArray9467;
	Class69[] aClass69Array9468;
	float[][] aFloatArrayArray9469;
	short aShort9470;
	int[] anIntArray9471;
	int[] anIntArray9472;
	JavaToolkit toolkit;
	int anInt9477;
	Class81[] aClass81Array9478;
	byte[] aByteArray9479;
	boolean aBool9480;
	byte[] faceAlphas;
	short[] aShortArray9482;
	short[] faceColours;
	int[][] faceLabels;
	short[] aShortArray9485;
	int[][] vertexLabels;
	int[] anIntArray9487;
	boolean aBool9488;
	boolean scaledVertices;
	int centroidX;
	short aShort9491;
	int centroidZ;
	boolean aBool9493;
	float[] aFloatArray9494;
	Class115[] aClass115Array9495;
	int[] vertexY;
	byte[] aByteArray9497;
	Class79[] aClass79Array9498;
	Class84[] aClass84Array9499;
	short aShort9501;
	short aShort9502;
	boolean aBool9503 = false;
	short aShort9504;
	short aShort9505;
	short aShort9506;
	int[] anIntArray9507;
	short[] aShortArray9509;
	short aShort9510;
	boolean aBool9511;
	int[][] anIntArrayArray9512;
	int centroidY;
	int[] anIntArray9514;
	float[] aFloatArray9515;
	float[] aFloatArray9516;
	short aShort9517;
	boolean computedBounds;
	int[] anIntArray9519;
	int[] anIntArray9520;
	int[] anIntArray9521;
	short[] aShortArray9522;
	float[][] aFloatArrayArray9523;
	int[] anIntArray9524;
	JavaModel[] aClass143_Sub3Array9525;
	JavaModel[] aClass143_Sub3Array9526;

	JavaModel(JavaToolkit toolkit) {
		this.toolkit = toolkit;
	}

	JavaModel(JavaToolkit toolkit, BaseModel base, int i, int i_0_, int i_1_, int i_2_) {
		this.toolkit = toolkit;
		anInt9453 = i;
		anInt9441 = i_0_;
		anInt9455 = i_1_;
		TextureMetricsList class147 = toolkit.metricsList;
		BillboardLoader interface41 = toolkit.billboardLoader;
		vertexCount = base.vertexCount;
		anInt9457 = base.anInt1768;
		vertexX = base.vertexX;
		vertexY = base.vertexY;
		vertexZ = base.vertexZ;
		faceCount = base.anInt1793;
		aShortArray9466 = base.aShortArray1769;
		aShortArray9467 = base.aShortArray1770;
		aShortArray9522 = base.aShortArray1766;
		aByteArray9497 = base.aByteArray1790;
		faceColours = base.aShortArray1779;
		faceAlphas = base.aByteArray1788;
		aShortArray9509 = base.aShortArray1753;
		aByteArray9479 = base.aByteArray1775;
		aClass145Array9450 = base.aClass145Array1777;
		aClass115Array9495 = base.aClass115Array1800;
		aShortArray9461 = base.aShortArray1764;
		anInt9440 = faceCount;
		int[] is = new int[faceCount];
		for (int i_3_ = 0; i_3_ < faceCount; i_3_++) {
			is[i_3_] = i_3_;
		}
		long[] ls = new long[faceCount];
		boolean bool = (anInt9453 & 0x100) != 0;
		for (int i_4_ = 0; i_4_ < faceCount; i_4_++) {
			int i_5_ = is[i_4_];
			TextureMetrics class141 = null;
			int i_6_ = 0;
			int i_7_ = 0;
			int i_8_ = 0;
			int i_9_ = 0;
			if (base.aClass148Array1795 != null) {
				boolean bool_10_ = false;
				for (Class148 class148 : base.aClass148Array1795) {
					if (i_5_ == class148.anInt1823 * 55597925) {
						Billboard class355 = interface41.load(class148.billboard * -310433347);
						if (class355.aBool3806) {
							bool_10_ = true;
						}
						if (class355.texture * -1249209579 != -1) {
							TextureMetrics class141_12_ = class147.get(class355.texture * -1249209579);
							if (class141_12_.aClass554_1727 == Class554.aClass554_7500) {
								aBool9511 = true;
							}
						}
					}
				}
				if (bool_10_) {
					ls[i_4_] = 9223372036854775807L;
					anInt9440--;
					continue;
				}
			}
			if (base.aClass145Array1777 != null) {
				boolean bool_13_ = false;
				for (Class145 class145 : base.aClass145Array1777) {
					if (i_5_ == class145.anInt1804 * -15453957) {
						ParticleProducerDefinition class354 = toolkit.particleLoader.load(class145.producer
								* -471432283);
						if (class354.aBool3743) {
							bool_13_ = true;
						}
					}
				}
				if (bool_13_) {
					ls[i_4_] = 9223372036854775807L;
					anInt9440--;
					continue;
				}
			}
			int i_15_ = -1;
			if (base.aShortArray1780 != null) {
				i_15_ = base.aShortArray1780[i_5_];
				if (i_15_ != -1) {
					class141 = class147.get(i_15_ & 0xffff);
					if ((i_2_ & 0x40) == 0 || !class141.aBool1724) {
						i_8_ = class141.aByte1719;
						i_9_ = class141.aByte1720;
					} else {
						i_15_ = -1;
					}
				}
			}
			boolean bool_16_ = faceAlphas != null && faceAlphas[i_5_] != 0 || class141 != null
					&& class141.aClass554_1727 == Class554.aClass554_7500;
			if ((bool || bool_16_) && aByteArray9497 != null) {
				i_6_ += aByteArray9497[i_5_] << 17;
			}
			if (bool_16_) {
				i_6_ += 65536;
			}
			i_6_ += (i_8_ & 0xff) << 8;
			i_6_ += i_9_ & 0xff;
			i_7_ += (i_15_ & 0xffff) << 16;
			i_7_ += i_4_ & 0xffff;
			ls[i_4_] = ((long) i_6_ << 32) + i_7_;
			aBool9511 |= bool_16_;
		}
		Class431.method7148(ls, is);
		if (base.aClass148Array1795 != null) {
			anInt9459 = base.aClass148Array1795.length;
			aClass69Array9468 = new Class69[anInt9459];
			aClass79Array9498 = new Class79[anInt9459];
			for (int i_17_ = 0; i_17_ < base.aClass148Array1795.length; i_17_++) {
				Class148 class148 = base.aClass148Array1795[i_17_];
				Billboard class355 = interface41.load(class148.billboard * -310433347);
				int i_18_ = Class335.HSV_TABLE[base.aShortArray1779[class148.anInt1823 * 55597925] & 0xffff] & 0xffffff;
				i_18_ = i_18_
						| 255 - (base.aByteArray1788 != null ? base.aByteArray1788[class148.anInt1823 * 55597925] & 0xff
								: 0) << 24;
				aClass69Array9468[i_17_] = new Class69(class148.anInt1823 * 55597925,
						base.aShortArray1769[class148.anInt1823 * 55597925],
						base.aShortArray1770[class148.anInt1823 * 55597925],
						base.aShortArray1766[class148.anInt1823 * 55597925], class355.anInt3808 * 923292647,
						class355.anInt3809 * -202613523, class355.texture * -1249209579,
						class355.anInt3811 * 1336839747, class355.anInt3813 * -8778329, class355.aBool3806,
						class148.anInt1824 * 214376177);
				aClass79Array9498[i_17_] = new Class79(i_18_);
			}
		}
		aFloatArrayArray9469 = new float[faceCount][];
		aFloatArrayArray9523 = new float[faceCount][];
		Class135 class135 = method2888(base, is, faceCount);
		JavaThreadResource class64 = toolkit.getThreadResource(Thread.currentThread());
		float[] fs = class64.aFloatArray993;
		boolean bool_19_ = false;
		for (int i_20_ = 0; i_20_ < faceCount; i_20_++) {
			int i_21_ = is[i_20_];
			int i_22_ = base.aShortArray1780 != null ? base.aShortArray1780[i_21_] : -1;
			if (i_22_ != -1 && (i_2_ & 0x40) != 0 && class147.get(i_22_ & 0xffff).aBool1724) {
				i_22_ = -1;
			}
			if (i_22_ != -1) {
				int i_23_ = base.aShortArray1778 != null ? base.aShortArray1778[i_21_] : -1;
				bool_19_ = true;
				float[] fs_24_ = aFloatArrayArray9469[i_21_] = new float[3];
				float[] fs_25_ = aFloatArrayArray9523[i_21_] = new float[3];
				if (i_23_ == 32766) {
					int i_26_ = base.aByteArray1772[i_21_] & 0xff;
					int i_27_ = base.aByteArray1773[i_21_] & 0xff;
					int i_28_ = base.aByteArray1758[i_21_] & 0xff;
					i_26_ += base.anIntArray1762[base.aShortArray1769[i_21_]];
					i_27_ += base.anIntArray1762[base.aShortArray1770[i_21_]];
					i_28_ += base.anIntArray1762[base.aShortArray1766[i_21_]];
					fs_24_[0] = base.aFloatArray1774[i_26_];
					fs_25_[0] = base.aFloatArray1767[i_26_];
					fs_24_[1] = base.aFloatArray1774[i_27_];
					fs_25_[1] = base.aFloatArray1767[i_27_];
					fs_24_[2] = base.aFloatArray1774[i_28_];
					fs_25_[2] = base.aFloatArray1767[i_28_];
				} else if (i_23_ == -1) {
					fs_24_[0] = 0.0F;
					fs_25_[0] = 1.0F;
					fs_24_[1] = 1.0F;
					fs_25_[1] = 1.0F;
					fs_24_[2] = 0.0F;
					fs_25_[2] = 0.0F;
				} else {
					i_23_ &= 0xffff;
					byte i_29_ = base.aByteArray1787[i_23_];
					if (i_29_ == 0) {
						short i_30_ = aShortArray9466[i_21_];
						short i_31_ = aShortArray9467[i_21_];
						short i_32_ = aShortArray9522[i_21_];
						short i_33_ = base.aShortArray1785[i_23_];
						short i_34_ = base.aShortArray1789[i_23_];
						short i_35_ = base.aShortArray1801[i_23_];
						float f = vertexX[i_33_];
						float f_36_ = vertexY[i_33_];
						float f_37_ = vertexZ[i_33_];
						float f_38_ = vertexX[i_34_] - f;
						float f_39_ = vertexY[i_34_] - f_36_;
						float f_40_ = vertexZ[i_34_] - f_37_;
						float f_41_ = vertexX[i_35_] - f;
						float f_42_ = vertexY[i_35_] - f_36_;
						float f_43_ = vertexZ[i_35_] - f_37_;
						float f_44_ = vertexX[i_30_] - f;
						float f_45_ = vertexY[i_30_] - f_36_;
						float f_46_ = vertexZ[i_30_] - f_37_;
						float f_47_ = vertexX[i_31_] - f;
						float f_48_ = vertexY[i_31_] - f_36_;
						float f_49_ = vertexZ[i_31_] - f_37_;
						float f_50_ = vertexX[i_32_] - f;
						float f_51_ = vertexY[i_32_] - f_36_;
						float f_52_ = vertexZ[i_32_] - f_37_;
						float f_53_ = f_39_ * f_43_ - f_40_ * f_42_;
						float f_54_ = f_40_ * f_41_ - f_38_ * f_43_;
						float f_55_ = f_38_ * f_42_ - f_39_ * f_41_;
						float f_56_ = f_42_ * f_55_ - f_43_ * f_54_;
						float f_57_ = f_43_ * f_53_ - f_41_ * f_55_;
						float f_58_ = f_41_ * f_54_ - f_42_ * f_53_;
						float f_59_ = 1.0F / (f_56_ * f_38_ + f_57_ * f_39_ + f_58_ * f_40_);
						fs_24_[0] = (f_56_ * f_44_ + f_57_ * f_45_ + f_58_ * f_46_) * f_59_;
						fs_24_[1] = (f_56_ * f_47_ + f_57_ * f_48_ + f_58_ * f_49_) * f_59_;
						fs_24_[2] = (f_56_ * f_50_ + f_57_ * f_51_ + f_58_ * f_52_) * f_59_;
						f_56_ = f_39_ * f_55_ - f_40_ * f_54_;
						f_57_ = f_40_ * f_53_ - f_38_ * f_55_;
						f_58_ = f_38_ * f_54_ - f_39_ * f_53_;
						f_59_ = 1.0F / (f_56_ * f_41_ + f_57_ * f_42_ + f_58_ * f_43_);
						fs_25_[0] = (f_56_ * f_44_ + f_57_ * f_45_ + f_58_ * f_46_) * f_59_;
						fs_25_[1] = (f_56_ * f_47_ + f_57_ * f_48_ + f_58_ * f_49_) * f_59_;
						fs_25_[2] = (f_56_ * f_50_ + f_57_ * f_51_ + f_58_ * f_52_) * f_59_;
					} else {
						short i_60_ = aShortArray9466[i_21_];
						short i_61_ = aShortArray9467[i_21_];
						short i_62_ = aShortArray9522[i_21_];
						int i_63_ = class135.anIntArray1575[i_23_];
						int i_64_ = class135.anIntArray1572[i_23_];
						int i_65_ = class135.anIntArray1574[i_23_];
						float[] fs_66_ = class135.aFloatArrayArray1573[i_23_];
						byte i_67_ = base.aByteArray1798[i_23_];
						float f = base.anIntArray1794[i_23_] / 256.0F;
						if (i_29_ == 1) {
							float f_68_ = base.anIntArray1760[i_23_] / 1024.0F;
							method2885(vertexX[i_60_], vertexY[i_60_], vertexZ[i_60_], i_63_, i_64_, i_65_, fs_66_,
									f_68_, i_67_, f, fs);
							fs_24_[0] = fs[0];
							fs_25_[0] = fs[1];
							method2885(vertexX[i_61_], vertexY[i_61_], vertexZ[i_61_], i_63_, i_64_, i_65_, fs_66_,
									f_68_, i_67_, f, fs);
							fs_24_[1] = fs[0];
							fs_25_[1] = fs[1];
							method2885(vertexX[i_62_], vertexY[i_62_], vertexZ[i_62_], i_63_, i_64_, i_65_, fs_66_,
									f_68_, i_67_, f, fs);
							fs_24_[2] = fs[0];
							fs_25_[2] = fs[1];
							float f_69_ = f_68_ / 2.0F;
							if ((i_67_ & 0x1) == 0) {
								if (fs_24_[1] - fs_24_[0] > f_69_) {
									fs_24_[1] -= f_68_;
								} else if (fs_24_[0] - fs_24_[1] > f_69_) {
									fs_24_[1] += f_68_;
								}
								if (fs_24_[2] - fs_24_[0] > f_69_) {
									fs_24_[2] -= f_68_;
								} else if (fs_24_[0] - fs_24_[2] > f_69_) {
									fs_24_[2] += f_68_;
								}
							} else {
								if (fs_25_[1] - fs_25_[0] > f_69_) {
									fs_25_[1] -= f_68_;
								} else if (fs_25_[0] - fs_25_[1] > f_69_) {
									fs_25_[1] += f_68_;
								}
								if (fs_25_[2] - fs_25_[0] > f_69_) {
									fs_25_[2] -= f_68_;
								} else if (fs_25_[0] - fs_25_[2] > f_69_) {
									fs_25_[2] += f_68_;
								}
							}
						} else if (i_29_ == 2) {
							float f_70_ = base.anIntArray1757[i_23_] / 256.0F;
							float f_71_ = base.anIntArray1796[i_23_] / 256.0F;
							int i_72_ = vertexX[i_61_] - vertexX[i_60_];
							int i_73_ = vertexY[i_61_] - vertexY[i_60_];
							int i_74_ = vertexZ[i_61_] - vertexZ[i_60_];
							int i_75_ = vertexX[i_62_] - vertexX[i_60_];
							int i_76_ = vertexY[i_62_] - vertexY[i_60_];
							int i_77_ = vertexZ[i_62_] - vertexZ[i_60_];
							int i_78_ = i_73_ * i_77_ - i_76_ * i_74_;
							int i_79_ = i_74_ * i_75_ - i_77_ * i_72_;
							int i_80_ = i_72_ * i_76_ - i_75_ * i_73_;
							float f_81_ = 64.0F / base.anIntArray1791[i_23_];
							float f_82_ = 64.0F / base.anIntArray1792[i_23_];
							float f_83_ = 64.0F / base.anIntArray1760[i_23_];
							float f_84_ = (i_78_ * fs_66_[0] + i_79_ * fs_66_[1] + i_80_ * fs_66_[2]) / f_81_;
							float f_85_ = (i_78_ * fs_66_[3] + i_79_ * fs_66_[4] + i_80_ * fs_66_[5]) / f_82_;
							float f_86_ = (i_78_ * fs_66_[6] + i_79_ * fs_66_[7] + i_80_ * fs_66_[8]) / f_83_;
							int i_87_ = method2967(f_84_, f_85_, f_86_);
							method2887(vertexX[i_60_], vertexY[i_60_], vertexZ[i_60_], i_63_, i_64_, i_65_, i_87_,
									fs_66_, i_67_, f, f_70_, f_71_, fs);
							fs_24_[0] = fs[0];
							fs_25_[0] = fs[1];
							method2887(vertexX[i_61_], vertexY[i_61_], vertexZ[i_61_], i_63_, i_64_, i_65_, i_87_,
									fs_66_, i_67_, f, f_70_, f_71_, fs);
							fs_24_[1] = fs[0];
							fs_25_[1] = fs[1];
							method2887(vertexX[i_62_], vertexY[i_62_], vertexZ[i_62_], i_63_, i_64_, i_65_, i_87_,
									fs_66_, i_67_, f, f_70_, f_71_, fs);
							fs_24_[2] = fs[0];
							fs_25_[2] = fs[1];
						} else if (i_29_ == 3) {
							method3010(vertexX[i_60_], vertexY[i_60_], vertexZ[i_60_], i_63_, i_64_, i_65_, fs_66_,
									i_67_, f, fs);
							fs_24_[0] = fs[0];
							fs_25_[0] = fs[1];
							method3010(vertexX[i_61_], vertexY[i_61_], vertexZ[i_61_], i_63_, i_64_, i_65_, fs_66_,
									i_67_, f, fs);
							fs_24_[1] = fs[0];
							fs_25_[1] = fs[1];
							method3010(vertexX[i_62_], vertexY[i_62_], vertexZ[i_62_], i_63_, i_64_, i_65_, fs_66_,
									i_67_, f, fs);
							fs_24_[2] = fs[0];
							fs_25_[2] = fs[1];
							if ((i_67_ & 0x1) == 0) {
								if (fs_24_[1] - fs_24_[0] > 0.5F) {
									fs_24_[1]--;
								} else if (fs_24_[0] - fs_24_[1] > 0.5F) {
									fs_24_[1]++;
								}
								if (fs_24_[2] - fs_24_[0] > 0.5F) {
									fs_24_[2]--;
								} else if (fs_24_[0] - fs_24_[2] > 0.5F) {
									fs_24_[2]++;
								}
							} else {
								if (fs_25_[1] - fs_25_[0] > 0.5F) {
									fs_25_[1]--;
								} else if (fs_25_[0] - fs_25_[1] > 0.5F) {
									fs_25_[1]++;
								}
								if (fs_25_[2] - fs_25_[0] > 0.5F) {
									fs_25_[2]--;
								} else if (fs_25_[0] - fs_25_[2] > 0.5F) {
									fs_25_[2]++;
								}
							}
						}
					}
				}
			}
		}
		if (!bool_19_) {
			aFloatArrayArray9523 = null;
			aFloatArrayArray9469 = null;
		}
		if (base.anIntArray1763 != null && (anInt9453 & 0x20) != 0) {
			vertexLabels = base.method3096(true);
		}
		if (base.anIntArray1781 != null && (anInt9453 & 0x180) != 0) {
			faceLabels = base.method3092();
		}
		if (base.aClass148Array1795 != null && (anInt9453 & 0x400) != 0) {
			anIntArrayArray9512 = base.method3098();
		}
		if (base.aShortArray1780 != null) {
			aShortArray9482 = new short[faceCount];
			boolean bool_88_ = false;
			for (int i_89_ = 0; i_89_ < faceCount; i_89_++) {
				short i_90_ = base.aShortArray1780[i_89_];
				if (i_90_ != -1) {
					TextureMetrics class141 = toolkit.metricsList.get(i_90_ & 0xffff);
					if ((i_2_ & 0x40) == 0 || !class141.aBool1724) {
						aShortArray9482[i_89_] = i_90_;
						bool_88_ = true;
						if (class141.aClass554_1727 == Class554.aClass554_7500) {
							aBool9511 = true;
						}
						if (class141.aByte1728 != 0 || class141.aByte1700 != 0) {
							aBool9465 = true;
						}
					} else {
						aShortArray9482[i_89_] = (short) -1;
					}
				} else {
					aShortArray9482[i_89_] = (short) -1;
				}
			}
			if (!bool_88_) {
				aShortArray9482 = null;
			}
		} else {
			aShortArray9482 = null;
		}
		if (aBool9511 || aClass69Array9468 != null) {
			aShortArray9485 = new short[faceCount];
			for (int i_91_ = 0; i_91_ < faceCount; i_91_++) {
				aShortArray9485[i_91_] = (short) is[i_91_];
			}
		}
	}

	@Override
	public int method2886() {
		if (!computedBounds) {
			method15069();
		}
		return aShort9504;
	}

	@Override
	public Model method2890(byte index, int i_138_, boolean bool) {
		method15035(Thread.currentThread());
		boolean bool_139_ = false;
		JavaModel class143_sub3_140_;
		JavaModel class143_sub3_141_;

		if (index > 0 && index <= 8) {
			class143_sub3_141_ = aClass143_Sub3Array9526[index - 1];
			class143_sub3_140_ = aClass143_Sub3Array9525[index - 1];
			bool_139_ = true;
		} else {
			class143_sub3_140_ = class143_sub3_141_ = new JavaModel(toolkit);
		}

		return method15073(class143_sub3_140_, class143_sub3_141_, i_138_, bool_139_, bool);
	}

	@Override
	public void updateFunctionMask(int i) {
		if (toolkit.threadCount * -1677857107 > 1) {
			synchronized (this) {
				if ((anInt9453 & 0x10000) == 65536 && (i & 0x10000) == 0) {
					method14991(true);
				}
				anInt9453 = i;
			}
		} else {
			if ((anInt9453 & 0x10000) == 65536 && (i & 0x10000) == 0) {
				method14991(true);
			}
			anInt9453 = i;
		}
	}

	@Override
	public int functionMask() {
		return anInt9453;
	}

	@Override
	public void yaw(int i) {
		if ((anInt9453 & 0x5) != 5) {
			throw new IllegalStateException();
		}
		if (i == 4096) {
			method15004();
		} else if (i == 8192) {
			method14998();
		} else if (i == 12288) {
			method14999();
		} else {
			int i_813_ = Class373.SINE[i];
			int i_814_ = Class373.COSINE[i];
			synchronized (this) {
				for (int i_815_ = 0; i_815_ < vertexCount; i_815_++) {
					int i_816_ = vertexZ[i_815_] * i_813_ + vertexX[i_815_] * i_814_ >> 14;
					vertexZ[i_815_] = vertexZ[i_815_] * i_814_ - vertexX[i_815_] * i_813_ >> 14;
					vertexX[i_815_] = i_816_;
				}
				method15003();
			}
		}
	}

	@Override
	public void method2895(int angle) {
		if ((anInt9453 & 0xd) != 13) {
			throw new IllegalStateException();
		}

		if (aClass84Array9462 != null) {
			if (angle == 4096) {
				method15000();
			} else if (angle == 8192) {
				method15009();
			} else if (angle == 12288) {
				method15076();
			} else {
				int sin = Class373.SINE[angle];
				int cos = Class373.COSINE[angle];

				synchronized (this) {
					for (int index = 0; index < anInt9457; index++) {
						int x = vertexZ[index] * sin + vertexX[index] * cos >> 14;
						vertexZ[index] = vertexZ[index] * cos - vertexX[index] * sin >> 14;
						vertexX[index] = x;

						if (aClass84Array9462[index] != null) {
							x = aClass84Array9462[index].anInt1215 * sin + aClass84Array9462[index].anInt1216 * cos >> 14;
							aClass84Array9462[index].anInt1215 = aClass84Array9462[index].anInt1215 * cos
									- aClass84Array9462[index].anInt1216 * sin >> 14;
							aClass84Array9462[index].anInt1216 = x;
						}
					}

					if (aClass81Array9478 != null) {
						for (int index = 0; index < faceCount; index++) {
							if (aClass81Array9478[index] != null) {
								int i_704_ = aClass81Array9478[index].anInt1174 * sin
										+ aClass81Array9478[index].anInt1176 * cos >> 14;
								aClass81Array9478[index].anInt1174 = aClass81Array9478[index].anInt1174 * cos
										- aClass81Array9478[index].anInt1176 * sin >> 14;
								aClass81Array9478[index].anInt1176 = i_704_;
							}
						}
					}

					for (int index = anInt9457; index < vertexCount; index++) {
						int x = vertexZ[index] * sin + vertexX[index] * cos >> 14;
						vertexZ[index] = vertexZ[index] * cos - vertexX[index] * sin >> 14;
						vertexX[index] = x;
					}

					anInt9477 = 0;
					computedBounds = false;
				}
			}
		} else {
			yaw(angle);
		}
	}

	@Override
	public void roll(int i) {
		if ((anInt9453 & 0x3) != 3) {
			throw new IllegalStateException();
		}
		int i_651_ = Class373.SINE[i];
		int i_652_ = Class373.COSINE[i];
		synchronized (this) {
			for (int i_653_ = 0; i_653_ < vertexCount; i_653_++) {
				int i_654_ = vertexY[i_653_] * i_651_ + vertexX[i_653_] * i_652_ >> 14;
				vertexY[i_653_] = vertexY[i_653_] * i_652_ - vertexX[i_653_] * i_651_ >> 14;
				vertexX[i_653_] = i_654_;
			}
			method15003();
		}
	}

	@Override
	public void translate(int dx, int dy, int dz) {
		if (dx != 0 && (anInt9453 & 0x1) != 1) {
			throw new IllegalStateException();
		}
		if (dy != 0 && (anInt9453 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (dz != 0 && (anInt9453 & 0x4) != 4) {
			throw new IllegalStateException();
		}

		synchronized (this) {
			for (int vertex = 0; vertex < vertexCount; vertex++) {
				vertexX[vertex] += dx;
				vertexY[vertex] += dy;
				vertexZ[vertex] += dz;
			}
		}
	}

	@Override
	public void method2899() {
		if ((anInt9453 & 0x10) != 16) {
			throw new IllegalStateException();
		}
		synchronized (this) {
			for (int i = 0; i < vertexCount; i++) {
				vertexZ[i] = -vertexZ[i];
			}
			if (aClass84Array9462 != null) {
				for (int i = 0; i < anInt9457; i++) {
					if (aClass84Array9462[i] != null) {
						aClass84Array9462[i].anInt1215 = -aClass84Array9462[i].anInt1215;
					}
				}
			}
			if (aClass84Array9499 != null) {
				for (int i = 0; i < anInt9457; i++) {
					if (aClass84Array9499[i] != null) {
						aClass84Array9499[i].anInt1215 = -aClass84Array9499[i].anInt1215;
					}
				}
			}
			if (aClass81Array9478 != null) {
				for (int i = 0; i < faceCount; i++) {
					if (aClass81Array9478[i] != null) {
						aClass81Array9478[i].anInt1174 = -aClass81Array9478[i].anInt1174;
					}
				}
			}
			short[] is = aShortArray9466;
			aShortArray9466 = aShortArray9522;
			aShortArray9522 = is;
			if (aFloatArrayArray9469 != null) {
				for (int i = 0; i < faceCount; i++) {
					if (aFloatArrayArray9469[i] != null) {
						float f = aFloatArrayArray9469[i][0];
						aFloatArrayArray9469[i][0] = aFloatArrayArray9469[i][2];
						aFloatArrayArray9469[i][2] = f;
					}
					if (aFloatArrayArray9523[i] != null) {
						float f = aFloatArrayArray9523[i][0];
						aFloatArrayArray9523[i][0] = aFloatArrayArray9523[i][2];
						aFloatArrayArray9523[i][2] = f;
					}
				}
			}
			computedBounds = false;
			anInt9477 = 0;
		}
	}

	@Override
	public void scale(int x, int y, int z) {
		if (x != 128 && (anInt9453 & 0x1) != 1) {
			throw new IllegalStateException();
		}
		if (y != 128 && (anInt9453 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (z != 128 && (anInt9453 & 0x4) != 4) {
			throw new IllegalStateException();
		}

		synchronized (this) {
			for (int vertex = 0; vertex < vertexCount; vertex++) {
				vertexX[vertex] = vertexX[vertex] * x >> 7;
				vertexY[vertex] = vertexY[vertex] * y >> 7;
				vertexZ[vertex] = vertexZ[vertex] * z >> 7;
			}

			computedBounds = false;
		}
	}

	@Override
	public void method2901(int i, int i_156_, Ground class120, Ground class120_157_, int i_158_, int i_159_, int i_160_) {
		if (i == 3) {
			if ((anInt9453 & 0x7) != 7) {
				throw new IllegalStateException();
			}
		} else if ((anInt9453 & 0x2) != 2) {
			throw new IllegalStateException();
		}
		if (!computedBounds) {
			method15069();
		}
		int i_161_ = i_158_ + aShort9505;
		int i_162_ = i_158_ + aShort9506;
		int i_163_ = i_160_ + aShort9504;
		int i_164_ = i_160_ + aShort9491;
		if (i == 4
				|| i_161_ >= 0
				&& i_162_ + class120.tileUnits * 1668096025 >> class120.tileScale * -333236347 < class120.width * 767658255
				&& i_163_ >= 0
				&& i_164_ + class120.tileUnits * 1668096025 >> class120.tileScale * -333236347 < class120.length * 295124605) {
			int[][] is = class120.tileHeights;
			int[][] is_165_ = null;
			if (class120_157_ != null) {
				is_165_ = class120_157_.tileHeights;
			}
			if (i == 4 || i == 5) {
				if (class120_157_ == null
						|| i_161_ < 0
						|| i_162_ + class120_157_.tileUnits * 1668096025 >> class120_157_.tileScale * -333236347 >= class120_157_.width * 767658255
						|| i_163_ < 0
						|| i_164_ + class120_157_.tileUnits * 1668096025 >> class120_157_.tileScale * -333236347 >= class120_157_.length * 295124605) {
					return;
				}
			} else {
				i_161_ >>= class120.tileScale * -333236347;
				i_162_ = i_162_ + class120.tileUnits * 1668096025 - 1 >> class120.tileScale * -333236347;
				i_163_ >>= class120.tileScale * -333236347;
				i_164_ = i_164_ + class120.tileUnits * 1668096025 - 1 >> class120.tileScale * -333236347;
				if (is[i_161_][i_163_] == i_159_ && is[i_162_][i_163_] == i_159_ && is[i_161_][i_164_] == i_159_
						&& is[i_162_][i_164_] == i_159_) {
					return;
				}
			}
			synchronized (this) {
				if (i == 1) {
					int i_166_ = class120.tileUnits * 1668096025 - 1;
					for (int i_167_ = 0; i_167_ < anInt9457; i_167_++) {
						int i_168_ = vertexX[i_167_] + i_158_;
						int i_169_ = vertexZ[i_167_] + i_160_;
						int i_170_ = i_168_ & i_166_;
						int i_171_ = i_169_ & i_166_;
						int i_172_ = i_168_ >> class120.tileScale * -333236347;
						int i_173_ = i_169_ >> class120.tileScale * -333236347;
						int i_174_ = is[i_172_][i_173_] * (class120.tileUnits * 1668096025 - i_170_)
								+ is[i_172_ + 1][i_173_] * i_170_ >> class120.tileScale * -333236347;
						int i_175_ = is[i_172_][i_173_ + 1] * (class120.tileUnits * 1668096025 - i_170_)
								+ is[i_172_ + 1][i_173_ + 1] * i_170_ >> class120.tileScale * -333236347;
						int i_176_ = i_174_ * (class120.tileUnits * 1668096025 - i_171_) + i_175_ * i_171_ >> class120.tileScale
								* -333236347;
						vertexY[i_167_] = vertexY[i_167_] + i_176_ - i_159_;
					}
					for (int i_177_ = anInt9457; i_177_ < vertexCount; i_177_++) {
						int i_178_ = vertexX[i_177_] + i_158_;
						int i_179_ = vertexZ[i_177_] + i_160_;
						int i_180_ = i_178_ & i_166_;
						int i_181_ = i_179_ & i_166_;
						int i_182_ = i_178_ >> class120.tileScale * -333236347;
						int i_183_ = i_179_ >> class120.tileScale * -333236347;
						if (i_182_ >= 0 && i_182_ < is.length - 1 && i_183_ >= 0 && i_183_ < is[0].length - 1) {
							int i_184_ = is[i_182_][i_183_] * (class120.tileUnits * 1668096025 - i_180_)
									+ is[i_182_ + 1][i_183_] * i_180_ >> class120.tileScale * -333236347;
							int i_185_ = is[i_182_][i_183_ + 1] * (class120.tileUnits * 1668096025 - i_180_)
									+ is[i_182_ + 1][i_183_ + 1] * i_180_ >> class120.tileScale * -333236347;
							int i_186_ = i_184_ * (class120.tileUnits * 1668096025 - i_181_) + i_185_ * i_181_ >> class120.tileScale
									* -333236347;
							vertexY[i_177_] = vertexY[i_177_] + i_186_ - i_159_;
						}
					}
				} else if (i == 2) {
					if (aShort9470 == 0) {
						return;
					}
					int i_187_ = class120.tileUnits * 1668096025 - 1;
					for (int i_188_ = 0; i_188_ < anInt9457; i_188_++) {
						int i_189_ = (vertexY[i_188_] << 16) / aShort9470;
						if (i_189_ < i_156_) {
							int i_190_ = vertexX[i_188_] + i_158_;
							int i_191_ = vertexZ[i_188_] + i_160_;
							int i_192_ = i_190_ & i_187_;
							int i_193_ = i_191_ & i_187_;
							int i_194_ = i_190_ >> class120.tileScale * -333236347;
							int i_195_ = i_191_ >> class120.tileScale * -333236347;
							int i_196_ = is[i_194_][i_195_] * (class120.tileUnits * 1668096025 - i_192_)
									+ is[i_194_ + 1][i_195_] * i_192_ >> class120.tileScale * -333236347;
							int i_197_ = is[i_194_][i_195_ + 1] * (class120.tileUnits * 1668096025 - i_192_)
									+ is[i_194_ + 1][i_195_ + 1] * i_192_ >> class120.tileScale * -333236347;
							int i_198_ = i_196_ * (class120.tileUnits * 1668096025 - i_193_) + i_197_ * i_193_ >> class120.tileScale
									* -333236347;
							vertexY[i_188_] = vertexY[i_188_] + (i_198_ - i_159_) * (i_156_ - i_189_) / i_156_;
						} else {
							vertexY[i_188_] = vertexY[i_188_];
						}
					}
					for (int i_199_ = anInt9457; i_199_ < vertexCount; i_199_++) {
						int i_200_ = (vertexY[i_199_] << 16) / aShort9470;
						if (i_200_ < i_156_) {
							int i_201_ = vertexX[i_199_] + i_158_;
							int i_202_ = vertexZ[i_199_] + i_160_;
							int i_203_ = i_201_ & i_187_;
							int i_204_ = i_202_ & i_187_;
							int i_205_ = i_201_ >> class120.tileScale * -333236347;
							int i_206_ = i_202_ >> class120.tileScale * -333236347;
							if (i_205_ >= 0 && i_205_ < class120.width * 767658255 - 1 && i_206_ >= 0
									&& i_206_ < class120.length * 295124605 - 1) {
								int i_207_ = is[i_205_][i_206_] * (class120.tileUnits * 1668096025 - i_203_)
										+ is[i_205_ + 1][i_206_] * i_203_ >> class120.tileScale * -333236347;
								int i_208_ = is[i_205_][i_206_ + 1] * (class120.tileUnits * 1668096025 - i_203_)
										+ is[i_205_ + 1][i_206_ + 1] * i_203_ >> class120.tileScale * -333236347;
								int i_209_ = i_207_ * (class120.tileUnits * 1668096025 - i_204_) + i_208_ * i_204_ >> class120.tileScale
										* -333236347;
								vertexY[i_199_] = vertexY[i_199_] + (i_209_ - i_159_) * (i_156_ - i_200_) / i_156_;
							}
						} else {
							vertexY[i_199_] = vertexY[i_199_];
						}
					}
				} else if (i == 3) {
					int i_210_ = (i_156_ & 0xff) * 4;
					int i_211_ = (i_156_ >> 8 & 0xff) * 4;
					int i_212_ = (i_156_ >> 16 & 0xff) << 6;
					int i_213_ = (i_156_ >> 24 & 0xff) << 6;
					if (i_158_ - (i_210_ >> 1) < 0
							|| i_158_ + (i_210_ >> 1) + class120.tileUnits * 1668096025 >= class120.width * 767658255 << class120.tileScale
									* -333236347
							|| i_160_ - (i_211_ >> 1) < 0
							|| i_160_ + (i_211_ >> 1) + class120.tileUnits * 1668096025 >= class120.length * 295124605 << class120.tileScale
									* -333236347) {
						return;
					}
					method2902(class120, i_158_, i_159_, i_160_, i_210_, i_211_, i_212_, i_213_);
				} else if (i == 4) {
					int i_214_ = class120_157_.tileUnits * 1668096025 - 1;
					int i_215_ = aShort9517 - aShort9470;
					for (int i_216_ = 0; i_216_ < anInt9457; i_216_++) {
						int i_217_ = vertexX[i_216_] + i_158_;
						int i_218_ = vertexZ[i_216_] + i_160_;
						int i_219_ = i_217_ & i_214_;
						int i_220_ = i_218_ & i_214_;
						int i_221_ = i_217_ >> class120_157_.tileScale * -333236347;
						int i_222_ = i_218_ >> class120_157_.tileScale * -333236347;
						int i_223_ = is_165_[i_221_][i_222_] * (class120_157_.tileUnits * 1668096025 - i_219_)
								+ is_165_[i_221_ + 1][i_222_] * i_219_ >> class120_157_.tileScale * -333236347;
						int i_224_ = is_165_[i_221_][i_222_ + 1] * (class120_157_.tileUnits * 1668096025 - i_219_)
								+ is_165_[i_221_ + 1][i_222_ + 1] * i_219_ >> class120_157_.tileScale * -333236347;
						int i_225_ = i_223_ * (class120_157_.tileUnits * 1668096025 - i_220_) + i_224_ * i_220_ >> class120_157_.tileScale
								* -333236347;
						vertexY[i_216_] = vertexY[i_216_] + i_225_ - i_159_ + i_215_;
					}
					for (int i_226_ = anInt9457; i_226_ < vertexCount; i_226_++) {
						int i_227_ = vertexX[i_226_] + i_158_;
						int i_228_ = vertexZ[i_226_] + i_160_;
						int i_229_ = i_227_ & i_214_;
						int i_230_ = i_228_ & i_214_;
						int i_231_ = i_227_ >> class120_157_.tileScale * -333236347;
						int i_232_ = i_228_ >> class120_157_.tileScale * -333236347;
						if (i_231_ >= 0 && i_231_ < class120_157_.width * 767658255 - 1 && i_232_ >= 0
								&& i_232_ < class120_157_.length * 295124605 - 1) {
							int i_233_ = is_165_[i_231_][i_232_] * (class120_157_.tileUnits * 1668096025 - i_229_)
									+ is_165_[i_231_ + 1][i_232_] * i_229_ >> class120_157_.tileScale * -333236347;
							int i_234_ = is_165_[i_231_][i_232_ + 1] * (class120_157_.tileUnits * 1668096025 - i_229_)
									+ is_165_[i_231_ + 1][i_232_ + 1] * i_229_ >> class120_157_.tileScale * -333236347;
							int i_235_ = i_233_ * (class120_157_.tileUnits * 1668096025 - i_230_) + i_234_ * i_230_ >> class120_157_.tileScale
									* -333236347;
							vertexY[i_226_] = vertexY[i_226_] + i_235_ - i_159_ + i_215_;
						}
					}
				} else if (i == 5) {
					int i_236_ = class120_157_.tileUnits * 1668096025 - 1;
					int i_237_ = aShort9517 - aShort9470;
					for (int i_238_ = 0; i_238_ < anInt9457; i_238_++) {
						int i_239_ = vertexX[i_238_] + i_158_;
						int i_240_ = vertexZ[i_238_] + i_160_;
						int i_241_ = i_239_ & i_236_;
						int i_242_ = i_240_ & i_236_;
						int i_243_ = i_239_ >> class120.tileScale * -333236347;
						int i_244_ = i_240_ >> class120.tileScale * -333236347;
						int i_245_ = is[i_243_][i_244_] * (class120.tileUnits * 1668096025 - i_241_)
								+ is[i_243_ + 1][i_244_] * i_241_ >> class120.tileScale * -333236347;
						int i_246_ = is[i_243_][i_244_ + 1] * (class120.tileUnits * 1668096025 - i_241_)
								+ is[i_243_ + 1][i_244_ + 1] * i_241_ >> class120.tileScale * -333236347;
						int i_247_ = i_245_ * (class120.tileUnits * 1668096025 - i_242_) + i_246_ * i_242_ >> class120.tileScale
								* -333236347;
						i_245_ = is_165_[i_243_][i_244_] * (class120_157_.tileUnits * 1668096025 - i_241_)
								+ is_165_[i_243_ + 1][i_244_] * i_241_ >> class120_157_.tileScale * -333236347;
						i_246_ = is_165_[i_243_][i_244_ + 1] * (class120_157_.tileUnits * 1668096025 - i_241_)
								+ is_165_[i_243_ + 1][i_244_ + 1] * i_241_ >> class120_157_.tileScale * -333236347;
						int i_248_ = i_245_ * (class120_157_.tileUnits * 1668096025 - i_242_) + i_246_ * i_242_ >> class120_157_.tileScale
								* -333236347;
						int i_249_ = i_247_ - i_248_ - i_156_;
						vertexY[i_238_] = ((vertexY[i_238_] << 8) / i_237_ * i_249_ >> 8) - (i_159_ - i_247_);
					}
					for (int i_250_ = anInt9457; i_250_ < vertexCount; i_250_++) {
						int i_251_ = vertexX[i_250_] + i_158_;
						int i_252_ = vertexZ[i_250_] + i_160_;
						int i_253_ = i_251_ & i_236_;
						int i_254_ = i_252_ & i_236_;
						int i_255_ = i_251_ >> class120.tileScale * -333236347;
						int i_256_ = i_252_ >> class120.tileScale * -333236347;
						if (i_255_ >= 0 && i_255_ < class120.width * 767658255 - 1
								&& i_255_ < class120_157_.width * 767658255 - 1 && i_256_ >= 0
								&& i_256_ < class120.length * 295124605 - 1
								&& i_256_ < class120_157_.length * 295124605 - 1) {
							int i_257_ = is[i_255_][i_256_] * (class120.tileUnits * 1668096025 - i_253_)
									+ is[i_255_ + 1][i_256_] * i_253_ >> class120.tileScale * -333236347;
							int i_258_ = is[i_255_][i_256_ + 1] * (class120.tileUnits * 1668096025 - i_253_)
									+ is[i_255_ + 1][i_256_ + 1] * i_253_ >> class120.tileScale * -333236347;
							int i_259_ = i_257_ * (class120.tileUnits * 1668096025 - i_254_) + i_258_ * i_254_ >> class120.tileScale
									* -333236347;
							i_257_ = is_165_[i_255_][i_256_] * (class120_157_.tileUnits * 1668096025 - i_253_)
									+ is_165_[i_255_ + 1][i_256_] * i_253_ >> class120_157_.tileScale * -333236347;
							i_258_ = is_165_[i_255_][i_256_ + 1] * (class120_157_.tileUnits * 1668096025 - i_253_)
									+ is_165_[i_255_ + 1][i_256_ + 1] * i_253_ >> class120_157_.tileScale * -333236347;
							int i_260_ = i_257_ * (class120_157_.tileUnits * 1668096025 - i_254_) + i_258_ * i_254_ >> class120_157_.tileScale
									* -333236347;
							int i_261_ = i_259_ - i_260_ - i_156_;
							vertexY[i_250_] = ((vertexY[i_250_] << 8) / i_237_ * i_261_ >> 8) - (i_159_ - i_259_);
						}
					}
				}
				computedBounds = false;
			}
		}
	}

	@Override
	public void transform(Class405 class405, int i, boolean bool) {
		if (aShortArray9461 != null) {
			JavaThreadResource class64 = toolkit.getThreadResource(Thread.currentThread());
			Class405 class405_498_ = class64.aClass405_971;
			class405_498_.copyFrom(class405);
			if (bool) {
				class405_498_.method6735();
			}
			Matrix4f class399 = class64.aClass399_972;
			class399.method6548(class405_498_);
			float[] fs = new float[3];
			for (int i_499_ = 0; i_499_ < anInt9457; i_499_++) {
				if ((i & aShortArray9461[i_499_]) != 0) {
					class399.method6553(vertexX[i_499_], vertexY[i_499_], vertexZ[i_499_], fs);
					vertexX[i_499_] = (int) fs[0];
					vertexY[i_499_] = (int) fs[1];
					vertexZ[i_499_] = (int) fs[2];
				}
			}
		}
	}

	@Override
	public void method2917(Class405 class405, Class139 class139, int i) {
		method15006(class405, class139, i);
	}

	@Override
	public boolean method2918(int i, int i_713_, Class405 class405, boolean bool, int i_714_) {
		method14988(toolkit.getThreadResource(Thread.currentThread()));
		Matrix4f class399 = aClass64_9442.aClass399_972;
		class399.method6548(class405);
		Matrix4f class399_715_ = aClass64_9442.aClass399_973;
		class399_715_.copyFrom(class399);
		class399_715_.method6547(toolkit.aClass399_8814);
		boolean bool_716_ = false;
		int i_717_ = 2147483647;
		int i_718_ = -2147483648;
		int i_719_ = 2147483647;
		int i_720_ = -2147483648;
		if (!computedBounds) {
			method15069();
		}
		int i_721_ = aShort9506 - aShort9505 >> 1;
		int i_722_ = aShort9517 - aShort9470 >> 1;
		int i_723_ = aShort9491 - aShort9504 >> 1;
		int i_724_ = aShort9505 + i_721_;
		int i_725_ = aShort9470 + i_722_;
		int i_726_ = aShort9504 + i_723_;
		int i_727_ = i_724_ - (i_721_ << i_714_);
		int i_728_ = i_725_ - (i_722_ << i_714_);
		int i_729_ = i_726_ - (i_723_ << i_714_);
		int i_730_ = i_724_ + (i_721_ << i_714_);
		int i_731_ = i_725_ + (i_722_ << i_714_);
		int i_732_ = i_726_ + (i_723_ << i_714_);
		anIntArray9519[0] = i_727_;
		anIntArray9520[0] = i_728_;
		anIntArray9521[0] = i_729_;
		anIntArray9519[1] = i_730_;
		anIntArray9520[1] = i_728_;
		anIntArray9521[1] = i_729_;
		anIntArray9519[2] = i_727_;
		anIntArray9520[2] = i_731_;
		anIntArray9521[2] = i_729_;
		anIntArray9519[3] = i_730_;
		anIntArray9520[3] = i_731_;
		anIntArray9521[3] = i_729_;
		anIntArray9519[4] = i_727_;
		anIntArray9520[4] = i_728_;
		anIntArray9521[4] = i_732_;
		anIntArray9519[5] = i_730_;
		anIntArray9520[5] = i_728_;
		anIntArray9521[5] = i_732_;
		anIntArray9519[6] = i_727_;
		anIntArray9520[6] = i_731_;
		anIntArray9521[6] = i_732_;
		anIntArray9519[7] = i_730_;
		anIntArray9520[7] = i_731_;
		anIntArray9521[7] = i_732_;
		for (int i_733_ = 0; i_733_ < 8; i_733_++) {
			int i_734_ = anIntArray9519[i_733_];
			int i_735_ = anIntArray9520[i_733_];
			int i_736_ = anIntArray9521[i_733_];
			float f = class399_715_.array[2] * i_734_ + class399_715_.array[6] * i_735_ + class399_715_.array[10]
					* i_736_ + class399_715_.array[14];
			float f_737_ = class399_715_.array[3] * i_734_ + class399_715_.array[7] * i_735_ + class399_715_.array[11]
					* i_736_ + class399_715_.array[15];
			if (f >= -f_737_) {
				float f_738_ = class399_715_.array[0] * i_734_ + class399_715_.array[4] * i_735_
						+ class399_715_.array[8] * i_736_ + class399_715_.array[12];
				float f_739_ = class399_715_.array[1] * i_734_ + class399_715_.array[5] * i_735_
						+ class399_715_.array[9] * i_736_ + class399_715_.array[13];
				int i_740_ = (int) (toolkit.aFloat8794 + toolkit.aFloat8820 * f_738_ / f_737_);
				int i_741_ = (int) (toolkit.aFloat8800 + toolkit.aFloat8808 * f_739_ / f_737_);
				if (i_740_ < i_717_) {
					i_717_ = i_740_;
				}
				if (i_740_ > i_718_) {
					i_718_ = i_740_;
				}
				if (i_741_ < i_719_) {
					i_719_ = i_741_;
				}
				if (i_741_ > i_720_) {
					i_720_ = i_741_;
				}
				bool_716_ = true;
			}
		}
		if (bool_716_ && i > i_717_ && i < i_718_ && i_713_ > i_719_ && i_713_ < i_720_) {
			if (bool) {
				return true;
			}
			for (int i_742_ = 0; i_742_ < vertexCount; i_742_++) {
				int i_743_ = vertexX[i_742_];
				int i_744_ = vertexY[i_742_];
				int i_745_ = vertexZ[i_742_];
				float f = class399_715_.array[2] * i_743_ + class399_715_.array[6] * i_744_ + class399_715_.array[10]
						* i_745_ + class399_715_.array[14];
				float f_746_ = class399_715_.array[3] * i_743_ + class399_715_.array[7] * i_744_
						+ class399_715_.array[11] * i_745_ + class399_715_.array[15];
				if (f >= -f_746_) {
					float f_747_ = class399_715_.array[0] * i_743_ + class399_715_.array[4] * i_744_
							+ class399_715_.array[8] * i_745_ + class399_715_.array[12];
					float f_748_ = class399_715_.array[1] * i_743_ + class399_715_.array[5] * i_744_
							+ class399_715_.array[9] * i_745_ + class399_715_.array[13];
					aFloatArray9515[i_742_] = (int) (toolkit.aFloat8794 + toolkit.aFloat8820 * f_747_ / f_746_);
					aFloatArray9516[i_742_] = (int) (toolkit.aFloat8800 + toolkit.aFloat8808 * f_748_ / f_746_);
				} else {
					aFloatArray9515[i_742_] = -999999.0F;
				}
			}
			for (int i_749_ = 0; i_749_ < anInt9440; i_749_++) {
				if (aFloatArray9515[aShortArray9466[i_749_]] != -999999.0F
						&& aFloatArray9515[aShortArray9467[i_749_]] != -999999.0F
						&& aFloatArray9515[aShortArray9522[i_749_]] != -999999.0F
						&& method15052(i, i_713_, aFloatArray9516[aShortArray9466[i_749_]],
								aFloatArray9516[aShortArray9467[i_749_]], aFloatArray9516[aShortArray9522[i_749_]],
								aFloatArray9515[aShortArray9466[i_749_]], aFloatArray9515[aShortArray9467[i_749_]],
								aFloatArray9515[aShortArray9522[i_749_]])) {
					return true;
				}
			}
		}
		return false;
	}

	@Override
	public int method2920() {
		if (!computedBounds) {
			method15069();
		}
		return aShort9501;
	}

	@Override
	public int method2923() {
		if (!computedBounds) {
			method15069();
		}
		return aShort9506;
	}

	@Override
	public void retexture(short original, short i_640_) {
		if (aShortArray9482 != null) {
			if (!aBool9465 && i_640_ >= 0) {
				TextureMetrics class141 = toolkit.metricsList.get(i_640_ & 0xffff);
				if (class141.aByte1728 != 0 || class141.aByte1700 != 0) {
					aBool9465 = true;
				}
			}
			for (int i_641_ = 0; i_641_ < faceCount; i_641_++) {
				if (aShortArray9482[i_641_] == original) {
					aShortArray9482[i_641_] = i_640_;
				}
			}
		}
	}

	@Override
	public int method2928() {
		if (!aBool9480) {
			method2962();
		}
		return aShort9510;
	}

	@Override
	public void method2929(int i) {
		if ((anInt9453 & 0x1000) != 4096) {
			throw new IllegalStateException();
		}
		anInt9441 = i;
		anInt9477 = 0;
	}

	@Override
	public int method2931() {
		if (!computedBounds) {
			method15069();
		}
		return aShort9517;
	}

	@Override
	public int method2932() {
		return anInt9455;
	}

	@Override
	public byte[] method2933() {
		return faceAlphas;
	}

	@Override
	public void method2935(byte i, byte[] is) {
		if ((anInt9453 & 0x100000) == 0) {
			throw new RuntimeException();
		}
		if (faceAlphas == null) {
			faceAlphas = new byte[faceCount];
		}
		if (is == null) {
			for (int i_750_ = 0; i_750_ < faceCount; i_750_++) {
				faceAlphas[i_750_] = i;
			}
		} else {
			for (int i_751_ = 0; i_751_ < faceCount; i_751_++) {
				int i_752_ = 255 - (255 - (is[i_751_] & 0xff)) * (255 - (i & 0xff)) / 255;
				faceAlphas[i_751_] = (byte) i_752_;
			}
		}
		if (anInt9477 == 2) {
			anInt9477 = 1;
		}
	}

	@Override
	public void method2937(int i, int i_642_, int i_643_, int i_644_) {
		if ((anInt9453 & 0x80000) != 524288) {
			throw new IllegalStateException();
		}
		for (int i_645_ = 0; i_645_ < faceCount; i_645_++) {
			int i_646_ = faceColours[i_645_] & 0xffff;
			int i_647_ = i_646_ >> 10 & 0x3f;
			int i_648_ = i_646_ >> 7 & 0x7;
			int i_649_ = i_646_ & 0x7f;
			if (i != -1) {
				i_647_ += (i - i_647_) * i_644_ >> 7;
			}
			if (i_642_ != -1) {
				i_648_ += (i_642_ - i_648_) * i_644_ >> 7;
			}
			if (i_643_ != -1) {
				i_649_ += (i_643_ - i_649_) * i_644_ >> 7;
			}
			faceColours[i_645_] = (short) (i_647_ << 10 | i_648_ << 7 | i_649_);
		}
		if (aClass69Array9468 != null) {
			for (int i_650_ = 0; i_650_ < anInt9459; i_650_++) {
				Class69 class69 = aClass69Array9468[i_650_];
				Class79 class79 = aClass79Array9498[i_650_];
				class79.colour = (class79.colour * -1876827231 & ~0xffffff | Class335.HSV_TABLE[HslUtils
						.hslToHsv(faceColours[class69.face * -316357385] & 0xffff) & 0xffff] & 0xffffff) * 577814625;
			}
		}
		if (anInt9477 == 2) {
			anInt9477 = 1;
		}
	}

	@Override
	public boolean method2938() {
		if (aShortArray9482 == null) {
			return true;
		}
		for (int i = 0; i < aShortArray9482.length; i++) {
			if (aShortArray9482[i] != -1 && !toolkit.method14093(aShortArray9482[i])) {
				return false;
			}
		}
		return true;
	}

	@Override
	public boolean method2939() {
		return aBool9511;
	}

	@Override
	public boolean method2940() {
		return aBool9465;
	}

	@Override
	public Class145[] method2942() {
		return aClass145Array9450;
	}

	@Override
	public Class115[] method2943() {
		return aClass115Array9495;
	}

	@Override
	public void method2944(Model class143, int i, int i_684_, int i_685_, boolean bool) {
		JavaModel class143_sub3_686_ = (JavaModel) class143;
		if ((anInt9453 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		}
		if ((class143_sub3_686_.anInt9453 & 0x10000) != 65536) {
			throw new IllegalStateException("");
		}
		method14988(toolkit.getThreadResource(Thread.currentThread()));
		method15069();
		method14990();
		class143_sub3_686_.method15069();
		class143_sub3_686_.method14990();
		anInt9500++;
		int i_687_ = 0;
		int[] is = class143_sub3_686_.vertexX;
		int i_688_ = class143_sub3_686_.anInt9457;
		for (int i_689_ = 0; i_689_ < anInt9457; i_689_++) {
			Class84 class84 = aClass84Array9462[i_689_];
			if (class84.anInt1213 != 0) {
				int i_690_ = vertexY[i_689_] - i_684_;
				if (i_690_ >= class143_sub3_686_.aShort9470 && i_690_ <= class143_sub3_686_.aShort9517) {
					int i_691_ = vertexX[i_689_] - i;
					if (i_691_ >= class143_sub3_686_.aShort9505 && i_691_ <= class143_sub3_686_.aShort9506) {
						int i_692_ = vertexZ[i_689_] - i_685_;
						if (i_692_ >= class143_sub3_686_.aShort9504 && i_692_ <= class143_sub3_686_.aShort9491) {
							for (int i_693_ = 0; i_693_ < i_688_; i_693_++) {
								Class84 class84_694_ = class143_sub3_686_.aClass84Array9462[i_693_];
								if (i_691_ == is[i_693_] && i_692_ == class143_sub3_686_.vertexZ[i_693_]
										&& i_690_ == class143_sub3_686_.vertexY[i_693_] && class84_694_.anInt1213 != 0) {
									if (aClass84Array9499 == null) {
										aClass84Array9499 = new Class84[anInt9457];
									}
									if (class143_sub3_686_.aClass84Array9499 == null) {
										class143_sub3_686_.aClass84Array9499 = new Class84[i_688_];
									}
									Class84 class84_695_ = aClass84Array9499[i_689_];
									if (class84_695_ == null) {
										class84_695_ = aClass84Array9499[i_689_] = new Class84(class84);
									}
									Class84 class84_696_ = class143_sub3_686_.aClass84Array9499[i_693_];
									if (class84_696_ == null) {
										class84_696_ = class143_sub3_686_.aClass84Array9499[i_693_] = new Class84(
												class84_694_);
									}
									class84_695_.anInt1216 += class84_694_.anInt1216;
									class84_695_.anInt1214 += class84_694_.anInt1214;
									class84_695_.anInt1215 += class84_694_.anInt1215;
									class84_695_.anInt1213 += class84_694_.anInt1213;
									class84_696_.anInt1216 += class84.anInt1216;
									class84_696_.anInt1214 += class84.anInt1214;
									class84_696_.anInt1215 += class84.anInt1215;
									class84_696_.anInt1213 += class84.anInt1213;
									i_687_++;
									anIntArray9487[i_689_] = anInt9500;
									anIntArray9454[i_693_] = anInt9500;
								}
							}
						}
					}
				}
			}
		}
		if (i_687_ >= 3 && bool) {
			for (int i_697_ = 0; i_697_ < faceCount; i_697_++) {
				if (anIntArray9487[aShortArray9466[i_697_]] == anInt9500
						&& anIntArray9487[aShortArray9467[i_697_]] == anInt9500
						&& anIntArray9487[aShortArray9522[i_697_]] == anInt9500) {
					if (aByteArray9479 == null) {
						aByteArray9479 = new byte[faceCount];
					}
					aByteArray9479[i_697_] = (byte) 2;
				}
			}
			for (int i_698_ = 0; i_698_ < class143_sub3_686_.faceCount; i_698_++) {
				if (anIntArray9454[class143_sub3_686_.aShortArray9466[i_698_]] == anInt9500
						&& anIntArray9454[class143_sub3_686_.aShortArray9467[i_698_]] == anInt9500
						&& anIntArray9454[class143_sub3_686_.aShortArray9522[i_698_]] == anInt9500) {
					if (class143_sub3_686_.aByteArray9479 == null) {
						class143_sub3_686_.aByteArray9479 = new byte[class143_sub3_686_.faceCount];
					}
					class143_sub3_686_.aByteArray9479[i_698_] = (byte) 2;
				}
			}
		}
	}

	@Override
	public void method2962() {
		if (!aBool9480) {
			if (!computedBounds) {
				method15069();
			}
			aShort9510 = aShort9470;
			aBool9480 = true;
		}
	}

	@Override
	public int method2971() {
		return anInt9441;
	}

	@Override
	public void method2974(int i) {
		if ((anInt9453 & 0x2000) != 8192) {
			throw new IllegalStateException();
		}
		anInt9455 = i;
		anInt9477 = 0;
	}

	@Override
	public int minimumX() {
		if (!computedBounds) {
			method15069();
		}
		return aShort9505;
	}

	@Override
	public void recolour(short original, short i_637_) {
		for (int i_638_ = 0; i_638_ < faceCount; i_638_++) {
			if (faceColours[i_638_] == original) {
				faceColours[i_638_] = i_637_;
			}
		}
		if (aClass69Array9468 != null) {
			for (int i_639_ = 0; i_639_ < anInt9459; i_639_++) {
				Class69 class69 = aClass69Array9468[i_639_];
				Class79 class79 = aClass79Array9498[i_639_];
				class79.colour = (class79.colour * -1876827231 & ~0xffffff | Class335.HSV_TABLE[HslUtils
						.hslToHsv(faceColours[class69.face * -316357385]) & 0xffff] & 0xffffff) * 577814625;
			}
		}
		if (anInt9477 == 2) {
			anInt9477 = 1;
		}
	}

	@Override
	public int method3016() {
		if (!computedBounds) {
			method15069();
		}
		return aShort9502;
	}

	@Override
	public Shadow method3018(Shadow shadow) {
		return null;
	}

	@Override
	public int maximumZ() {
		if (!computedBounds) {
			method15069();
		}
		return aShort9491;
	}

	@Override
	public void method3045() {

	}

	@Override
	public void pitch(int angle) {
		if ((anInt9453 & 0x6) != 6) {
			throw new IllegalStateException();
		}
		int i_149_ = Class373.SINE[angle];
		int i_150_ = Class373.COSINE[angle];
		synchronized (this) {
			for (int i_151_ = 0; i_151_ < vertexCount; i_151_++) {
				int i_152_ = vertexY[i_151_] * i_150_ - vertexZ[i_151_] * i_149_ >> 14;
				vertexZ[i_151_] = vertexY[i_151_] * i_149_ + vertexZ[i_151_] * i_150_ >> 14;
				vertexY[i_151_] = i_152_;
			}
			method15003();
		}
	}

	@Override
	public void method3063(Class405 class405) {
		method14988(toolkit.getThreadResource(Thread.currentThread()));
		Matrix4f class399 = aClass64_9442.aClass399_972;
		class399.method6548(class405);
		if (aClass145Array9450 != null) {
			for (Class145 class145 : aClass145Array9450) {
				Class145 class145_635_ = class145;
				if (class145.aClass145_1803 != null) {
					class145_635_ = class145.aClass145_1803;
				}
				class145_635_.anInt1809 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class145.anInt1805 * 1662200367] + class399.array[4]
						* vertexY[class145.anInt1805 * 1662200367] + class399.array[8]
						* vertexZ[class145.anInt1805 * 1662200367]))
						* -324129411;
				class145_635_.anInt1816 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class145.anInt1805 * 1662200367] + class399.array[5]
						* vertexY[class145.anInt1805 * 1662200367] + class399.array[9]
						* vertexZ[class145.anInt1805 * 1662200367]))
						* -1194099427;
				class145_635_.anInt1811 = (int) (class399.array[14] + (class399.array[2]
						* vertexX[class145.anInt1805 * 1662200367] + class399.array[6]
						* vertexY[class145.anInt1805 * 1662200367] + class399.array[10]
						* vertexZ[class145.anInt1805 * 1662200367])) * 1082189991;
				class145_635_.anInt1810 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class145.anInt1802 * -1204023687] + class399.array[4]
						* vertexY[class145.anInt1802 * -1204023687] + class399.array[8]
						* vertexZ[class145.anInt1802 * -1204023687]))
						* -1558281385;
				class145_635_.anInt1813 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class145.anInt1802 * -1204023687] + class399.array[5]
						* vertexY[class145.anInt1802 * -1204023687] + class399.array[9]
						* vertexZ[class145.anInt1802 * -1204023687]))
						* -465338573;
				class145_635_.anInt1814 = (int) (class399.array[14] + (class399.array[2]
						* vertexX[class145.anInt1802 * -1204023687] + class399.array[6]
						* vertexY[class145.anInt1802 * -1204023687] + class399.array[10]
						* vertexZ[class145.anInt1802 * -1204023687]))
						* -170225769;
				class145_635_.anInt1815 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class145.anInt1806 * -1333709795] + class399.array[4]
						* vertexY[class145.anInt1806 * -1333709795] + class399.array[8]
						* vertexZ[class145.anInt1806 * -1333709795])) * 714262933;
				class145_635_.anInt1808 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class145.anInt1806 * -1333709795] + class399.array[5]
						* vertexY[class145.anInt1806 * -1333709795] + class399.array[9]
						* vertexZ[class145.anInt1806 * -1333709795])) * 847013515;
				class145_635_.anInt1817 = (int) (class399.array[14] + (class399.array[2]
						* vertexX[class145.anInt1806 * -1333709795] + class399.array[6]
						* vertexY[class145.anInt1806 * -1333709795] + class399.array[10]
						* vertexZ[class145.anInt1806 * -1333709795])) * 1666826233;
			}
		}
		if (aClass115Array9495 != null) {
			for (Class115 element : aClass115Array9495) {
				Class115 class115 = element;
				Class115 class115_636_ = class115;
				if (class115.aClass115_1441 != null) {
					class115_636_ = class115.aClass115_1441;
				}
				if (class115.aClass399_1443 != null) {
					class115.aClass399_1443.copyFrom(class399);
				} else {
					class115.aClass399_1443 = new Matrix4f(class399);
				}
				class115_636_.anInt1438 = (int) (class399.array[12] + (class399.array[0]
						* vertexX[class115.anInt1439 * 1047194323] + class399.array[4]
						* vertexY[class115.anInt1439 * 1047194323] + class399.array[8]
						* vertexZ[class115.anInt1439 * 1047194323]))
						* -2111105049;
				class115_636_.anInt1440 = (int) (class399.array[13] + (class399.array[1]
						* vertexX[class115.anInt1439 * 1047194323] + class399.array[5]
						* vertexY[class115.anInt1439 * 1047194323] + class399.array[9]
						* vertexZ[class115.anInt1439 * 1047194323])) * 1144355343;
				class115_636_.anInt1442 = (int) (class399.array[14] + (class399.array[2]
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
			method15069();
		}
		return aShort9470;
	}

	void method14988(JavaThreadResource class64) {
		aClass109_9444 = class64.rasterizer;
		if (class64 != aClass64_9442) {
			aClass64_9442 = class64;
			anIntArray9514 = aClass64_9442.anIntArray974;
			aFloatArray9515 = aClass64_9442.aFloatArray991;
			aFloatArray9516 = aClass64_9442.aFloatArray976;
			aFloatArray9494 = aClass64_9442.aFloatArray982;
			aFloatArray9463 = aClass64_9442.aFloatArray996;
			anIntArray9519 = aClass64_9442.anIntArray979;
			anIntArray9520 = aClass64_9442.anIntArray989;
			anIntArray9521 = aClass64_9442.anIntArray975;
			anIntArray9487 = aClass64_9442.anIntArray999;
			anIntArray9454 = aClass64_9442.anIntArray983;
			anIntArray9524 = aClass64_9442.anIntArray984;
		}
	}

	void method14990() {
		if (anInt9477 == 0 && aClass84Array9462 == null) {
			if (toolkit.threadCount * -1677857107 > 1) {
				synchronized (this) {
					method15071();
				}
			} else {
				method15071();
			}
		}
	}

	void method14991(boolean bool) {
		if (toolkit.threadCount * -1677857107 > 1) {
			synchronized (this) {
				method14992(bool);
			}
		} else {
			method14992(bool);
		}
	}

	void method14992(boolean bool) {
		if (anInt9477 == 1) {
			method15068();
		} else if (anInt9477 == 2) {
			if ((anInt9453 & 0x97098) == 0 && aFloatArrayArray9469 == null) {
				faceColours = null;
			}
			if (bool) {
				aByteArray9479 = null;
			}
		} else {
			method14990();
			int i = toolkit.lightX * -2078106349;
			int i_92_ = toolkit.lightY * -1406837097;
			int i_93_ = toolkit.lightZ * 1546397231;
			int i_94_ = toolkit.anInt8816 * 1012731861 >> 8;
			int i_95_ = 0;
			int i_96_ = 0;
			if (anInt9455 != 0) {
				i_95_ = toolkit.anInt8827 * 17609472 / anInt9455;
				i_96_ = toolkit.anInt8809 * -1260230912 / anInt9455;
			}
			if (anIntArray9471 == null) {
				anIntArray9471 = new int[faceCount];
				anIntArray9472 = new int[faceCount];
				anIntArray9507 = new int[faceCount];
			}
			for (int i_97_ = 0; i_97_ < faceCount; i_97_++) {
				byte i_98_;
				if (aByteArray9479 == null) {
					i_98_ = (byte) 0;
				} else {
					i_98_ = aByteArray9479[i_97_];
				}
				byte i_99_;
				if (faceAlphas == null) {
					i_99_ = (byte) 0;
				} else {
					i_99_ = faceAlphas[i_97_];
				}
				short i_100_;
				if (aShortArray9482 == null) {
					i_100_ = (short) -1;
				} else {
					i_100_ = aShortArray9482[i_97_];
				}
				if (i_99_ == -2) {
					i_98_ = (byte) 3;
				}
				if (i_99_ == -1) {
					i_98_ = (byte) 2;
				}
				if (i_100_ == -1) {
					if (i_98_ == 0) {
						int i_101_ = faceColours[i_97_] & 0xffff;
						int i_102_ = (i_101_ & 0x7f) * anInt9441 >> 7;
						short i_103_ = HslUtils.hslToHsv(i_101_ & ~0x7f | i_102_);
						Class84 class84;
						if (aClass84Array9499 != null && aClass84Array9499[aShortArray9466[i_97_]] != null) {
							class84 = aClass84Array9499[aShortArray9466[i_97_]];
						} else {
							class84 = aClass84Array9462[aShortArray9466[i_97_]];
						}
						int i_104_ = (i * class84.anInt1216 + i_92_ * class84.anInt1214 + i_93_ * class84.anInt1215)
								/ class84.anInt1213 >> 16;
						int i_105_ = i_104_ > 256 ? i_95_ : i_96_;
						int i_106_ = (i_94_ >> 1) + (i_105_ * i_104_ >> 17);
						anIntArray9471[i_97_] = i_106_ << 17 | Class679.light(i_103_, i_106_);
						if (aClass84Array9499 != null && aClass84Array9499[aShortArray9467[i_97_]] != null) {
							class84 = aClass84Array9499[aShortArray9467[i_97_]];
						} else {
							class84 = aClass84Array9462[aShortArray9467[i_97_]];
						}
						i_104_ = (i * class84.anInt1216 + i_92_ * class84.anInt1214 + i_93_ * class84.anInt1215)
								/ class84.anInt1213 >> 16;
						i_105_ = i_104_ > 256 ? i_95_ : i_96_;
						i_106_ = (i_94_ >> 1) + (i_105_ * i_104_ >> 17);
						anIntArray9472[i_97_] = i_106_ << 17 | Class679.light(i_103_, i_106_);
						if (aClass84Array9499 != null && aClass84Array9499[aShortArray9522[i_97_]] != null) {
							class84 = aClass84Array9499[aShortArray9522[i_97_]];
						} else {
							class84 = aClass84Array9462[aShortArray9522[i_97_]];
						}
						i_104_ = (i * class84.anInt1216 + i_92_ * class84.anInt1214 + i_93_ * class84.anInt1215)
								/ class84.anInt1213 >> 16;
						i_105_ = i_104_ > 256 ? i_95_ : i_96_;
						i_106_ = (i_94_ >> 1) + (i_105_ * i_104_ >> 17);
						anIntArray9507[i_97_] = i_106_ << 17 | Class679.light(i_103_, i_106_);
					} else if (i_98_ == 1) {
						int i_107_ = faceColours[i_97_] & 0xffff;
						int i_108_ = (i_107_ & 0x7f) * anInt9441 >> 7;
						short i_109_ = HslUtils.hslToHsv(i_107_ & ~0x7f | i_108_);
						Class81 class81 = aClass81Array9478[i_97_];
						int i_110_ = i * class81.anInt1176 + i_92_ * class81.anInt1175 + i_93_ * class81.anInt1174 >> 16;
						int i_111_ = i_110_ > 256 ? i_95_ : i_96_;
						int i_112_ = (i_94_ >> 1) + (i_111_ * i_110_ >> 17);
						anIntArray9471[i_97_] = i_112_ << 17 | Class679.light(i_109_, i_112_);
						anIntArray9507[i_97_] = -1;
					} else if (i_98_ == 3) {
						anIntArray9471[i_97_] = 128;
						anIntArray9507[i_97_] = -1;
					} else {
						anIntArray9507[i_97_] = -2;
					}
				} else {
					int i_113_ = faceColours[i_97_] & 0xffff;
					if (i_98_ == 0) {
						Class84 class84;
						if (aClass84Array9499 != null && aClass84Array9499[aShortArray9466[i_97_]] != null) {
							class84 = aClass84Array9499[aShortArray9466[i_97_]];
						} else {
							class84 = aClass84Array9462[aShortArray9466[i_97_]];
						}
						int i_114_ = (i * class84.anInt1216 + i_92_ * class84.anInt1214 + i_93_ * class84.anInt1215)
								/ class84.anInt1213 >> 16;
						int i_115_ = i_114_ > 256 ? i_95_ : i_96_;
						int i_116_ = method14995((i_94_ >> 2) + (i_115_ * i_114_ >> 18));
						anIntArray9471[i_97_] = i_116_ << 24 | method14993(i_113_, i_100_, i_116_);
						if (aClass84Array9499 != null && aClass84Array9499[aShortArray9467[i_97_]] != null) {
							class84 = aClass84Array9499[aShortArray9467[i_97_]];
						} else {
							class84 = aClass84Array9462[aShortArray9467[i_97_]];
						}
						i_114_ = (i * class84.anInt1216 + i_92_ * class84.anInt1214 + i_93_ * class84.anInt1215)
								/ class84.anInt1213 >> 16;
						i_115_ = i_114_ > 256 ? i_95_ : i_96_;
						i_116_ = method14995((i_94_ >> 2) + (i_115_ * i_114_ >> 18));
						anIntArray9472[i_97_] = i_116_ << 24 | method14993(i_113_, i_100_, i_116_);
						if (aClass84Array9499 != null && aClass84Array9499[aShortArray9522[i_97_]] != null) {
							class84 = aClass84Array9499[aShortArray9522[i_97_]];
						} else {
							class84 = aClass84Array9462[aShortArray9522[i_97_]];
						}
						i_114_ = (i * class84.anInt1216 + i_92_ * class84.anInt1214 + i_93_ * class84.anInt1215)
								/ class84.anInt1213 >> 16;
						i_115_ = i_114_ > 256 ? i_95_ : i_96_;
						i_116_ = method14995((i_94_ >> 2) + (i_115_ * i_114_ >> 18));
						anIntArray9507[i_97_] = i_116_ << 24 | method14993(i_113_, i_100_, i_116_);
					} else if (i_98_ == 1) {
						Class81 class81 = aClass81Array9478[i_97_];
						int i_117_ = i * class81.anInt1176 + i_92_ * class81.anInt1175 + i_93_ * class81.anInt1174 >> 16;
						int i_118_ = i_117_ > 256 ? i_95_ : i_96_;
						int i_119_ = method14995((i_94_ >> 2) + (i_118_ * i_117_ >> 18));
						anIntArray9471[i_97_] = i_119_ << 24 | method14993(i_113_, i_100_, i_119_);
						anIntArray9507[i_97_] = -1;
					} else {
						anIntArray9507[i_97_] = -2;
					}
				}
			}
			aClass84Array9462 = null;
			aClass84Array9499 = null;
			aClass81Array9478 = null;
			if ((anInt9453 & 0x97098) == 0 && aFloatArrayArray9469 == null) {
				faceColours = null;
			}
			if (bool) {
				aByteArray9479 = null;
			}
			anInt9477 = 2;
		}
	}

	int method14993(int i, short i_120_, int i_121_) {
		int i_122_ = Class598.HSL_TABLE[method14994(i, i_121_)];
		TextureMetrics class141 = toolkit.metricsList.get(i_120_ & 0xffff);
		int i_123_ = class141.alpha & 0xff;
		if (i_123_ != 0) {
			int i_124_ = 131586 * i_121_;
			if (i_123_ == 256) {
				i_122_ = i_124_;
			} else {
				int i_125_ = i_123_;
				int i_126_ = 256 - i_123_;
				i_122_ = ((i_124_ & 0xff00ff) * i_125_ + (i_122_ & 0xff00ff) * i_126_ & ~0xff00ff)
						+ ((i_124_ & 0xff00) * i_125_ + (i_122_ & 0xff00) * i_126_ & 0xff0000) >> 8;
			}
		}
		int i_127_ = class141.colourOffset & 0xff;
		if (i_127_ != 0) {
			i_127_ += 256;
			int i_128_ = ((i_122_ & 0xff0000) >> 16) * i_127_;
			if (i_128_ > 65535) {
				i_128_ = 65535;
			}
			int i_129_ = ((i_122_ & 0xff00) >> 8) * i_127_;
			if (i_129_ > 65535) {
				i_129_ = 65535;
			}
			int i_130_ = (i_122_ & 0xff) * i_127_;
			if (i_130_ > 65535) {
				i_130_ = 65535;
			}
			i_122_ = (i_128_ << 8 & 0xff0000) + (i_129_ & 0xff00) + (i_130_ >> 8);
		}
		return i_122_;
	}

	int method14994(int i, int i_131_) {
		i_131_ = i_131_ * (i & 0x7f) >> 7;
		if (i_131_ < 2) {
			i_131_ = 2;
		} else if (i_131_ > 126) {
			i_131_ = 126;
		}
		return (i & 0xff80) + i_131_;
	}

	int method14995(int i) {
		if (i < 2) {
			i = 2;
		} else if (i > 126) {
			i = 126;
		}
		return i;
	}

	void method14996() {
		for (int i = 0; i < faceCount; i++) {
			short i_132_ = aShortArray9482 != null ? aShortArray9482[i] : (short) -1;
			if (i_132_ == -1) {
				int i_133_ = faceColours[i] & 0xffff;
				int i_134_ = (i_133_ & 0x7f) * anInt9441 >> 7;
				short i_135_ = HslUtils.hslToHsv(i_133_ & ~0x7f | i_134_);
				if (anIntArray9507[i] == -1) {
					int i_136_ = anIntArray9471[i] & ~0x1ffff;
					anIntArray9471[i] = i_136_ | Class679.light(i_135_, i_136_ >> 17);
				} else if (anIntArray9507[i] != -2) {
					int i_137_ = anIntArray9471[i] & ~0x1ffff;
					anIntArray9471[i] = i_137_ | Class679.light(i_135_, i_137_ >> 17);
					i_137_ = anIntArray9472[i] & ~0x1ffff;
					anIntArray9472[i] = i_137_ | Class679.light(i_135_, i_137_ >> 17);
					i_137_ = anIntArray9507[i] & ~0x1ffff;
					anIntArray9507[i] = i_137_ | Class679.light(i_135_, i_137_ >> 17);
				}
			}
		}
		anInt9477 = 2;
	}

	void method14998() {
		synchronized (this) {
			for (int i = 0; i < vertexCount; i++) {
				vertexX[i] = -vertexX[i];
				vertexZ[i] = -vertexZ[i];
			}
			method15003();
		}
	}

	void method14999() {
		synchronized (this) {
			for (int i = 0; i < vertexCount; i++) {
				int i_145_ = vertexZ[i];
				vertexZ[i] = vertexX[i];
				vertexX[i] = -i_145_;
			}
			method15003();
		}
	}

	void method15000() {
		synchronized (this) {
			for (int i = 0; i < anInt9457; i++) {
				int i_146_ = vertexX[i];
				vertexX[i] = vertexZ[i];
				vertexZ[i] = -i_146_;
				if (aClass84Array9462[i] != null) {
					i_146_ = aClass84Array9462[i].anInt1216;
					aClass84Array9462[i].anInt1216 = aClass84Array9462[i].anInt1215;
					aClass84Array9462[i].anInt1215 = -i_146_;
				}
			}
			if (aClass81Array9478 != null) {
				for (int i = 0; i < faceCount; i++) {
					if (aClass81Array9478[i] != null) {
						int i_147_ = aClass81Array9478[i].anInt1176;
						aClass81Array9478[i].anInt1176 = aClass81Array9478[i].anInt1174;
						aClass81Array9478[i].anInt1174 = -i_147_;
					}
				}
			}
			for (int i = anInt9457; i < vertexCount; i++) {
				int i_148_ = vertexX[i];
				vertexX[i] = vertexZ[i];
				vertexZ[i] = -i_148_;
			}
			anInt9477 = 0;
			computedBounds = false;
		}
	}

	final boolean method15002(int i) {
		if (faceAlphas == null) {
			return false;
		}
		return faceAlphas[i] != 0;
	}

	void method15003() {
		aClass84Array9462 = null;
		aClass84Array9499 = null;
		aClass81Array9478 = null;
		computedBounds = false;
	}

	void method15004() {
		synchronized (this) {
			for (int i = 0; i < vertexCount; i++) {
				int i_262_ = vertexX[i];
				vertexX[i] = vertexZ[i];
				vertexZ[i] = -i_262_;
			}
			method15003();
		}
	}

	void method15006(Class405 class405, Class139 class139, int i) {
		if (anInt9457 >= 1) {
			JavaThreadResource class64 = toolkit.getThreadResource(Thread.currentThread());
			Matrix4f class399 = class64.aClass399_972;
			class399.method6548(class405);
			Matrix4f class399_500_ = toolkit.aClass399_8812;
			Matrix4f class399_501_ = toolkit.aClass399_8819;
			if (!computedBounds) {
				method15069();
			}
			boolean bool = class399.method6640();
			float[] fs = class64.aFloatArray981;
			class399.method6553(0.0F, aShort9470, 0.0F, fs);
			float f = fs[0];
			float f_502_ = fs[1];
			float f_503_ = fs[2];
			class399.method6553(0.0F, aShort9517, 0.0F, fs);
			float f_504_ = fs[0];
			float f_505_ = fs[1];
			float f_506_ = fs[2];
			for (int i_507_ = 0; i_507_ < 6; i_507_++) {
				float[] fs_508_ = toolkit.aFloatArrayArray8815[i_507_];
				float f_509_ = fs_508_[0] * f + fs_508_[1] * f_502_ + fs_508_[2] * f_503_ + fs_508_[3] + aShort9501;
				float f_510_ = fs_508_[0] * f_504_ + fs_508_[1] * f_505_ + fs_508_[2] * f_506_ + fs_508_[3]
						+ aShort9501;
				if (f_509_ < 0.0F && f_510_ < 0.0F) {
					return;
				}
			}
			float f_511_;
			float f_512_;
			if (bool) {
				f_511_ = class399_500_.array[14];
				f_512_ = class399_500_.array[6];
			} else {
				f_511_ = class399.array[12] * class399_500_.array[2] + class399.array[13] * class399_500_.array[6]
						+ class399.array[14] * class399_500_.array[10] + class399_500_.array[14];
				f_512_ = class399.array[4] * class399_500_.array[2] + class399.array[5] * class399_500_.array[6]
						+ class399.array[6] * class399_500_.array[10];
			}
			float f_513_ = f_511_ + aShort9470 * f_512_;
			float f_514_ = f_511_ + aShort9517 * f_512_;
			float f_515_ = f_513_ > f_514_ ? f_513_ + aShort9501 : f_514_ + aShort9501;
			float f_516_ = class399_501_.array[10] * f_515_ + class399_501_.array[14];
			if (toolkit.threadCount * -1677857107 > 1) {
				synchronized (this) {
					while (aBool9503) {
						try {
							wait();
						} catch (InterruptedException interruptedexception) {

						}
					}
					aBool9503 = true;
				}
			}
			method14988(class64);
			Matrix4f class399_517_ = aClass64_9442.aClass399_973;
			class399_517_.copyFrom(class399);
			class399_517_.method6547(toolkit.aClass399_8814);
			if ((i & 0x2) != 0) {
				aClass109_9444.method1988(true);
			} else {
				aClass109_9444.method1988(false);
			}
			boolean bool_518_ = false;
			aClass64_9442.aFloat977 = aClass109_9444.aFloat1380;
			aClass64_9442.aFloat1000 = aClass109_9444.aFloat1374;
			aClass64_9442.aFloat961 = aClass109_9444.aFloat1388;
			aClass64_9442.aFloat968 = 1.0F / aClass109_9444.aFloat1388;
			aClass64_9442.aFloat986 = aClass109_9444.aFloat1379;
			aClass64_9442.aFloat987 = aClass109_9444.aFloat1381;
			aClass64_9442.aFloat1001 = aClass109_9444.aFloat1386;
			aClass64_9442.anInt980 = aClass109_9444.anInt1395 * 383378289;
			for (int i_519_ = 0; i_519_ < vertexCount; i_519_++) {
				int i_520_ = vertexX[i_519_];
				int i_521_ = vertexY[i_519_];
				int i_522_ = vertexZ[i_519_];
				float f_523_ = class399_517_.array[0] * i_520_ + class399_517_.array[4] * i_521_
						+ class399_517_.array[8] * i_522_ + class399_517_.array[12];
				float f_524_ = class399_517_.array[1] * i_520_ + class399_517_.array[5] * i_521_
						+ class399_517_.array[9] * i_522_ + class399_517_.array[13];
				float f_525_ = class399_517_.array[2] * i_520_ + class399_517_.array[6] * i_521_
						+ class399_517_.array[10] * i_522_ + class399_517_.array[14];
				float f_526_ = class399_517_.array[3] * i_520_ + class399_517_.array[7] * i_521_
						+ class399_517_.array[11] * i_522_ + class399_517_.array[15];
				aFloatArray9494[i_519_] = aClass64_9442.aFloat1001 + aClass64_9442.aFloat961 * f_525_ / f_526_;
				aFloatArray9463[i_519_] = f_526_;
				if (f_525_ >= -f_526_) {
					aFloatArray9515[i_519_] = (int) (aClass64_9442.aFloat986 + aClass64_9442.aFloat977 * f_523_
							/ f_526_);
					aFloatArray9516[i_519_] = (int) (aClass64_9442.aFloat987 + aClass64_9442.aFloat1000 * f_524_
							/ f_526_);
				} else {
					aFloatArray9515[i_519_] = -5000.0F;
					bool_518_ = true;
				}
				if (aClass64_9442.aBool990) {
					anIntArray9514[i_519_] = (int) (class399.array[13] + (class399.array[1] * i_520_
							+ class399.array[5] * i_521_ + class399.array[9] * i_522_));
				}
			}
			if (aClass69Array9468 != null) {
				for (int i_527_ = 0; i_527_ < anInt9459; i_527_++) {
					Class69 class69 = aClass69Array9468[i_527_];
					Class79 class79 = aClass79Array9498[i_527_];
					short i_528_ = aShortArray9466[class69.face * -316357385];
					short i_529_ = aShortArray9467[class69.face * -316357385];
					short i_530_ = aShortArray9522[class69.face * -316357385];
					int i_531_ = (vertexX[i_528_] + vertexX[i_529_] + vertexX[i_530_]) / 3;
					int i_532_ = (vertexY[i_528_] + vertexY[i_529_] + vertexY[i_530_]) / 3;
					int i_533_ = (vertexZ[i_528_] + vertexZ[i_529_] + vertexZ[i_530_]) / 3;
					float f_534_ = class399_517_.array[0] * i_531_ + class399_517_.array[4] * i_532_
							+ class399_517_.array[8] * i_533_ + class399_517_.array[12];
					float f_535_ = class399_517_.array[1] * i_531_ + class399_517_.array[5] * i_532_
							+ class399_517_.array[9] * i_533_ + class399_517_.array[13];
					float f_536_ = class399_517_.array[2] * i_531_ + class399_517_.array[6] * i_532_
							+ class399_517_.array[10] * i_533_ + class399_517_.array[14];
					float f_537_ = class399_517_.array[3] * i_531_ + class399_517_.array[7] * i_532_
							+ class399_517_.array[11] * i_533_ + class399_517_.array[15];
					f_536_ += class399_501_.array[2] * (class79.anInt1148 * 630938169) + class399_501_.array[6]
							* (class79.anInt1151 * -2051776023);
					f_537_ += class399_501_.array[3] * (class79.anInt1148 * 630938169) + class399_501_.array[7]
							* (class79.anInt1151 * -2051776023);
					if (f_536_ > -f_537_) {
						f_534_ += class399_501_.array[0] * (class79.anInt1148 * 630938169) + class399_501_.array[4]
								* (class79.anInt1151 * -2051776023);
						f_535_ += class399_501_.array[1] * (class79.anInt1148 * 630938169) + class399_501_.array[5]
								* (class79.anInt1151 * -2051776023);
						float f_538_ = toolkit.aFloat8794 + toolkit.aFloat8820 * f_534_ / f_537_;
						float f_539_ = toolkit.aFloat8800 + toolkit.aFloat8808 * f_535_ / f_537_;
						float f_540_ = class79.aFloat1157 * class69.aShort1031;
						float f_541_ = class79.aFloat1149 * class69.aShort1030;
						float f_542_ = f_534_ + class399_501_.array[0] * f_540_ + class399_501_.array[4] * f_541_;
						float f_543_ = f_535_ + class399_501_.array[1] * f_540_ + class399_501_.array[5] * f_541_;
						float f_544_ = f_537_ + class399_501_.array[3] * f_540_ + class399_501_.array[7] * f_541_;
						float f_545_ = toolkit.aFloat8794 + toolkit.aFloat8820 * f_542_ / f_544_;
						float f_546_ = toolkit.aFloat8800 + toolkit.aFloat8808 * f_543_ / f_544_;
						class79.anInt1147 = (int) f_538_ * 1482455517;
						class79.anInt1154 = (int) f_539_ * -1592389373;
						class79.aFloat1153 = toolkit.aFloat8825 + toolkit.aFloat8824
								* (f_536_ - class399_501_.array[10] * (class69.anInt1035 * 2132893977)) / f_537_;
						class79.anInt1155 = (int) (f_545_ < f_538_ ? f_538_ - f_545_ : f_545_ - f_538_) * 1296465363;
						class79.anInt1156 = (int) (f_546_ < f_539_ ? f_539_ - f_546_ : f_546_ - f_539_) * 1715272233;
					} else {
						Class79 class79_547_ = class79;
						class79.anInt1156 = 0;
						class79_547_.anInt1155 = 0;
					}
				}
			}
			if (class139 != null) {
				boolean bool_548_ = false;
				boolean bool_549_ = true;
				int i_550_ = aShort9505 + aShort9506 >> 1;
				int i_551_ = aShort9504 + aShort9491 >> 1;
				int i_552_ = i_550_;
				short i_553_ = aShort9470;
				int i_554_ = i_551_;
				float f_555_ = class399_517_.array[0] * i_552_ + class399_517_.array[4] * i_553_
						+ class399_517_.array[8] * i_554_ + class399_517_.array[12];
				float f_556_ = class399_517_.array[1] * i_552_ + class399_517_.array[5] * i_553_
						+ class399_517_.array[9] * i_554_ + class399_517_.array[13];
				float f_557_ = class399_517_.array[2] * i_552_ + class399_517_.array[6] * i_553_
						+ class399_517_.array[10] * i_554_ + class399_517_.array[14];
				float f_558_ = class399_517_.array[3] * i_552_ + class399_517_.array[7] * i_553_
						+ class399_517_.array[11] * i_554_ + class399_517_.array[15];
				if (f_557_ >= -f_558_) {
					class139.anInt1580 = (int) (toolkit.aFloat8794 + toolkit.aFloat8820 * f_555_ / f_558_);
					class139.anInt1582 = (int) (toolkit.aFloat8800 + toolkit.aFloat8808 * f_556_ / f_558_);
				} else {
					bool_548_ = true;
				}
				i_552_ = i_550_;
				i_553_ = aShort9517;
				i_554_ = i_551_;
				float f_559_ = class399_517_.array[0] * i_552_ + class399_517_.array[4] * i_553_
						+ class399_517_.array[8] * i_554_ + class399_517_.array[12];
				float f_560_ = class399_517_.array[1] * i_552_ + class399_517_.array[5] * i_553_
						+ class399_517_.array[9] * i_554_ + class399_517_.array[13];
				float f_561_ = class399_517_.array[2] * i_552_ + class399_517_.array[6] * i_553_
						+ class399_517_.array[10] * i_554_ + class399_517_.array[14];
				float f_562_ = class399_517_.array[3] * i_552_ + class399_517_.array[7] * i_553_
						+ class399_517_.array[11] * i_554_ + class399_517_.array[15];
				if (f_561_ >= -f_562_) {
					class139.anInt1583 = (int) (toolkit.aFloat8794 + toolkit.aFloat8820 * f_559_ / f_562_);
					class139.anInt1584 = (int) (toolkit.aFloat8800 + toolkit.aFloat8808 * f_560_ / f_562_);
				} else {
					bool_548_ = true;
				}
				if (bool_548_) {
					if (f_557_ < -f_558_ && f_561_ < -f_562_) {
						bool_549_ = false;
					} else if (f_557_ < -f_558_) {
						float f_563_ = (f_557_ + f_558_) / (f_561_ + f_562_) - 1.0F;
						float f_564_ = f_555_ + f_563_ * (f_559_ - f_555_);
						float f_565_ = f_556_ + f_563_ * (f_560_ - f_556_);
						float f_566_ = f_558_ + f_563_ * (f_562_ - f_558_);
						class139.anInt1580 = (int) (toolkit.aFloat8794 + toolkit.aFloat8820 * f_564_ / f_566_);
						class139.anInt1582 = (int) (toolkit.aFloat8800 + toolkit.aFloat8808 * f_565_ / f_566_);
					} else if (f_561_ < -f_562_) {
						float f_567_ = (f_561_ + f_562_) / (f_557_ + f_558_) - 1.0F;
						float f_568_ = f_559_ + f_567_ * (f_555_ - f_559_);
						float f_569_ = f_560_ + f_567_ * (f_556_ - f_560_);
						float f_570_ = f_562_ + f_567_ * (f_558_ - f_562_);
						class139.anInt1583 = (int) (toolkit.aFloat8794 + toolkit.aFloat8820 * f_568_ / f_570_);
						class139.anInt1584 = (int) (toolkit.aFloat8800 + toolkit.aFloat8808 * f_569_ / f_570_);
					}
				}
				if (bool_549_) {
					if (f_557_ / f_558_ > f_561_ / f_562_) {
						float f_571_ = f_555_ + class399_501_.array[0] * aShort9501 + class399_501_.array[12];
						float f_572_ = f_558_ + class399_501_.array[3] * aShort9501 + class399_501_.array[15];
						class139.anInt1585 = (int) (toolkit.aFloat8794 - class139.anInt1580 + toolkit.aFloat8820
								* f_571_ / f_572_);
					} else {
						float f_573_ = f_559_ + class399_501_.array[0] * aShort9501 + class399_501_.array[12];
						float f_574_ = f_562_ + class399_501_.array[3] * aShort9501 + class399_501_.array[15];
						class139.anInt1585 = (int) (toolkit.aFloat8794 - class139.anInt1583 + toolkit.aFloat8820
								* f_573_ / f_574_);
					}
					class139.aBool1581 = true;
				}
			}
			method14991(true);
			aClass109_9444.aBool1373 = (i & 0x1) == 0;
			aClass109_9444.aBool1396 = false;
			try {
				method15007(toolkit.anIntArray8797 != null, toolkit.aFloatArray8801 != null, (i & 0x4) != 0, bool_518_,
						aClass64_9442.aBool959 && f_516_ > aClass64_9442.aFloat960 || aClass64_9442.aBool990);
			} catch (Exception exception) {

			}
			if (aClass69Array9468 != null) {
				for (int i_575_ = 0; i_575_ < faceCount; i_575_++) {
					anIntArray9524[i_575_] = -1;
				}
			}
			aClass109_9444 = null;
			if (toolkit.threadCount * -1677857107 > 1) {
				synchronized (this) {
					aBool9503 = false;
					notifyAll();
				}
			}
		}
	}

	final void method15007(boolean bool, boolean bool_576_, boolean bool_577_, boolean bool_578_, boolean bool_579_) {
		if (aClass69Array9468 != null) {
			for (int i = 0; i < anInt9459; i++) {
				Class69 class69 = aClass69Array9468[i];
				anIntArray9524[class69.face * -316357385] = i;
			}
		}
		if (aBool9511 || aClass69Array9468 != null) {
			if ((anInt9453 & 0x100) == 0 && aShortArray9485 != null) {
				for (int i = 0; i < anInt9440; i++) {
					short i_580_ = aShortArray9485[i];
					method15010(bool, bool_576_, bool_577_, i_580_, bool_578_, bool_579_);
				}
			} else {
				for (int i = 0; i < anInt9440; i++) {
					if (!method15002(i) && !method15030(i)) {
						method15010(bool, bool_576_, bool_577_, i, bool_578_, bool_579_);
					}
				}
				if (aByteArray9497 == null) {
					for (int i = 0; i < anInt9440; i++) {
						if (method15002(i) || method15030(i)) {
							method15010(bool, bool_576_, bool_577_, i, bool_578_, bool_579_);
						}
					}
				} else {
					for (int i = 0; i < 12; i++) {
						for (int i_581_ = 0; i_581_ < anInt9440; i_581_++) {
							if (aByteArray9497[i_581_] == i && (method15002(i_581_) || method15030(i_581_))) {
								method15010(bool, bool_576_, bool_577_, i_581_, bool_578_, bool_579_);
							}
						}
					}
				}
			}
			if (aClass69Array9468 != null) {
				method15008(bool, bool_576_, bool_577_);
			}
		} else {
			for (int i = 0; i < anInt9440; i++) {
				method15010(bool, bool_576_, bool_577_, i, bool_578_, bool_579_);
			}
		}
	}

	final void method15008(boolean bool, boolean bool_582_, boolean bool_583_) {
		for (int i = 0; i < anInt9459; i++) {
			Class69 class69 = aClass69Array9468[i];
			if (class69.aBool1034) {
				Class79 class79 = aClass79Array9498[i];
				toolkit.method14107(bool, bool_582_, bool_583_, class79.anInt1147 * -610032011,
						class79.anInt1154 * 1321591211, class79.aFloat1153, class79.anInt1155 * 1821368923,
						class79.anInt1156 * -1161477607, class69.aShort1029, class79.colour * -1876827231,
						class69.aByte1033, class69.aByte1032);
			}
		}
	}

	void method15009() {
		synchronized (this) {
			for (int i = 0; i < anInt9457; i++) {
				vertexX[i] = -vertexX[i];
				vertexZ[i] = -vertexZ[i];
				if (aClass84Array9462[i] != null) {
					aClass84Array9462[i].anInt1216 = -aClass84Array9462[i].anInt1216;
					aClass84Array9462[i].anInt1215 = -aClass84Array9462[i].anInt1215;
				}
			}
			if (aClass81Array9478 != null) {
				for (int i = 0; i < faceCount; i++) {
					if (aClass81Array9478[i] != null) {
						aClass81Array9478[i].anInt1176 = -aClass81Array9478[i].anInt1176;
						aClass81Array9478[i].anInt1174 = -aClass81Array9478[i].anInt1174;
					}
				}
			}
			for (int i = anInt9457; i < vertexCount; i++) {
				vertexX[i] = -vertexX[i];
				vertexZ[i] = -vertexZ[i];
			}
			anInt9477 = 0;
			computedBounds = false;
		}
	}

	final void method15010(boolean bool, boolean bool_584_, boolean bool_585_, int i, boolean bool_586_,
			boolean bool_587_) {
		if (anIntArray9507[i] != -2) {
			short i_588_ = aShortArray9466[i];
			short i_589_ = aShortArray9467[i];
			short i_590_ = aShortArray9522[i];
			float f = aFloatArray9515[i_588_];
			float f_591_ = aFloatArray9515[i_589_];
			float f_592_ = aFloatArray9515[i_590_];
			if (!bool_586_ || f != -5000.0F && f_591_ != -5000.0F && f_592_ != -5000.0F) {
				float f_593_ = aFloatArray9516[i_588_];
				float f_594_ = aFloatArray9516[i_589_];
				float f_595_ = aFloatArray9516[i_590_];
				if (anIntArray9524[i] != -1
						|| (f - f_591_) * (f_595_ - f_594_) - (f_593_ - f_594_) * (f_592_ - f_591_) > 0.0F) {
					aClass109_9444.aBool1376 = f < 0.0F || f_591_ < 0.0F || f_592_ < 0.0F
							|| f > aClass64_9442.anInt980 * -16220783 || f_591_ > aClass64_9442.anInt980 * -16220783
							|| f_592_ > aClass64_9442.anInt980 * -16220783;
					if (bool_587_) {
						int i_596_ = anIntArray9524[i];
						if (i_596_ == -1 || !aClass69Array9468[i_596_].aBool1034) {
							method15011(bool, bool_584_, bool_585_, i);
						}
					} else {
						int i_597_ = anIntArray9524[i];
						if (i_597_ != -1) {
							Class69 class69 = aClass69Array9468[i_597_];
							Class79 class79 = aClass79Array9498[i_597_];
							if (!class69.aBool1034) {
								method15012(bool, bool_584_, bool_585_, i);
							}
							toolkit.method14107(bool, bool_584_, bool_585_, class79.anInt1147 * -610032011,
									class79.anInt1154 * 1321591211, class79.aFloat1153, class79.anInt1155 * 1821368923,
									class79.anInt1156 * -1161477607, class69.aShort1029, class79.colour * -1876827231,
									class69.aByte1033, class69.aByte1032);
						} else {
							method15012(bool, bool_584_, bool_585_, i);
						}
					}
				}
			}
		}
	}

	final void method15011(boolean bool, boolean bool_598_, boolean bool_599_, int i) {
		boolean bool_600_ = false;
		if (aShortArray9482 != null && aShortArray9482[i] != -1) {
			bool_600_ = toolkit.metricsList.get(aShortArray9482[i] & 0xffff).aBool1698;
		}
		if (!aClass64_9442.aBool990) {
			short i_601_ = aShortArray9466[i];
			short i_602_ = aShortArray9467[i];
			short i_603_ = aShortArray9522[i];
			Matrix4f class399 = toolkit.aClass399_8819;
			float f = class399.array[10];
			float f_604_ = class399.array[14];
			float f_605_ = class399.array[11];
			float f_606_ = class399.array[15];
			float f_607_ = f_604_ * f_605_ - f * f_606_;
			float f_608_ = (aFloatArray9494[i_601_] - aClass64_9442.aFloat1001) * aClass64_9442.aFloat968;
			float f_609_ = (aFloatArray9494[i_602_] - aClass64_9442.aFloat1001) * aClass64_9442.aFloat968;
			float f_610_ = (aFloatArray9494[i_603_] - aClass64_9442.aFloat1001) * aClass64_9442.aFloat968;
			float f_611_ = f_608_ * f_607_ / (f_608_ * f_605_ - f);
			float f_612_ = f_609_ * f_607_ / (f_609_ * f_605_ - f);
			float f_613_ = f_610_ * f_607_ / (f_610_ * f_605_ - f);
			float f_614_ = (f_611_ - aClass64_9442.aFloat960) / aClass64_9442.aFloat956;
			if (f_614_ > 1.0F) {
				f_614_ = 1.0F;
			} else if (f_614_ < 0.0F) {
				f_614_ = 0.0F;
			}
			float f_615_ = (f_612_ - aClass64_9442.aFloat960) / aClass64_9442.aFloat956;
			if (f_615_ > 1.0F) {
				f_615_ = 1.0F;
			} else if (f_615_ < 0.0F) {
				f_615_ = 0.0F;
			}
			float f_616_ = (f_613_ - aClass64_9442.aFloat960) / aClass64_9442.aFloat956;
			if (f_616_ > 1.0F) {
				f_616_ = 1.0F;
			} else if (f_616_ < 0.0F) {
				f_616_ = 0.0F;
			}
			float f_617_ = f_614_ + f_615_ + f_616_;
			if (!(f_617_ >= 3.0F)) {
				if (f_617_ <= 0.0F) {
					method15012(bool, bool_598_, bool_599_, i);
				} else {
					if (faceAlphas == null) {
						aClass109_9444.anInt1375 = 0;
					} else {
						aClass109_9444.anInt1375 = faceAlphas[i] & 0xff;
					}
					if (!bool_600_) {
						if (anIntArray9507[i] == -1) {
							aClass109_9444.method1991(bool, bool_598_, bool_599_, aFloatArray9516[i_601_],
									aFloatArray9516[i_602_], aFloatArray9516[i_603_], aFloatArray9515[i_601_],
									aFloatArray9515[i_602_], aFloatArray9515[i_603_], aFloatArray9494[i_601_],
									aFloatArray9494[i_602_], aFloatArray9494[i_603_], Class360.blendColours(
											Class335.HSV_TABLE[anIntArray9471[i] & 0xffff],
											aClass64_9442.fogColour * 1595608531, f_614_ * 255.0F), Class360
											.blendColours(Class335.HSV_TABLE[anIntArray9471[i] & 0xffff],
													aClass64_9442.fogColour * 1595608531, f_615_ * 255.0F), Class360
											.blendColours(Class335.HSV_TABLE[anIntArray9471[i] & 0xffff],
													aClass64_9442.fogColour * 1595608531, f_616_ * 255.0F));
						} else {
							aClass109_9444.method1991(bool, bool_598_, bool_599_, aFloatArray9516[i_601_],
									aFloatArray9516[i_602_], aFloatArray9516[i_603_], aFloatArray9515[i_601_],
									aFloatArray9515[i_602_], aFloatArray9515[i_603_], aFloatArray9494[i_601_],
									aFloatArray9494[i_602_], aFloatArray9494[i_603_], Class360.blendColours(
											Class335.HSV_TABLE[anIntArray9471[i] & 0xffff],
											aClass64_9442.fogColour * 1595608531, f_614_ * 255.0F), Class360
											.blendColours(Class335.HSV_TABLE[anIntArray9472[i] & 0xffff],
													aClass64_9442.fogColour * 1595608531, f_615_ * 255.0F), Class360
											.blendColours(Class335.HSV_TABLE[anIntArray9507[i] & 0xffff],
													aClass64_9442.fogColour * 1595608531, f_616_ * 255.0F));
						}
					} else {
						int i_618_ = -16777216;
						if (faceAlphas != null) {
							i_618_ = 255 - (faceAlphas[i] & 0xff) << 24;
						}
						if (anIntArray9507[i] == -1) {
							int i_619_ = i_618_ | anIntArray9471[i] & 0xffffff;
							aClass109_9444.method1995(bool, bool_598_, bool_599_, aFloatArray9516[i_601_],
									aFloatArray9516[i_602_], aFloatArray9516[i_603_], aFloatArray9515[i_601_],
									aFloatArray9515[i_602_], aFloatArray9515[i_603_], aFloatArray9494[i_601_],
									aFloatArray9494[i_602_], aFloatArray9494[i_603_], aFloatArray9463[i_601_],
									aFloatArray9463[i_602_], aFloatArray9463[i_603_], aFloatArrayArray9469[i][0],
									aFloatArrayArray9469[i][1], aFloatArrayArray9469[i][2], aFloatArrayArray9523[i][0],
									aFloatArrayArray9523[i][1], aFloatArrayArray9523[i][2], i_619_, i_619_, i_619_,
									aClass64_9442.fogColour * 1595608531, f_614_ * 255.0F, f_615_ * 255.0F,
									f_616_ * 255.0F, aShortArray9482[i] & 0xffff);
						} else {
							aClass109_9444.method1995(bool, bool_598_, bool_599_, aFloatArray9516[i_601_],
									aFloatArray9516[i_602_], aFloatArray9516[i_603_], aFloatArray9515[i_601_],
									aFloatArray9515[i_602_], aFloatArray9515[i_603_], aFloatArray9494[i_601_],
									aFloatArray9494[i_602_], aFloatArray9494[i_603_], aFloatArray9463[i_601_],
									aFloatArray9463[i_602_], aFloatArray9463[i_603_], aFloatArrayArray9469[i][0],
									aFloatArrayArray9469[i][1], aFloatArrayArray9469[i][2], aFloatArrayArray9523[i][0],
									aFloatArrayArray9523[i][1], aFloatArrayArray9523[i][2], i_618_ | anIntArray9471[i]
											& 0xffffff, i_618_ | anIntArray9472[i] & 0xffffff, i_618_
											| anIntArray9507[i] & 0xffffff, aClass64_9442.fogColour * 1595608531,
									f_614_ * 255.0F, f_615_ * 255.0F, f_616_ * 255.0F, aShortArray9482[i] & 0xffff);
						}
					}
				}
			}
		} else {
			short i_620_ = aShortArray9466[i];
			short i_621_ = aShortArray9467[i];
			short i_622_ = aShortArray9522[i];
			float f = 0.0F;
			float f_623_ = 0.0F;
			float f_624_ = 0.0F;
			if (anIntArray9514[i_620_] > aClass64_9442.anInt966 * -368702957) {
				f = 1.0F;
			} else if (anIntArray9514[i_620_] > aClass64_9442.anInt965 * 929457875) {
				f = (aClass64_9442.anInt965 * 929457875 - anIntArray9514[i_620_]) * 1.0F
						/ (aClass64_9442.anInt965 * 929457875 - aClass64_9442.anInt966 * -368702957);
			}
			if (anIntArray9514[i_621_] > aClass64_9442.anInt966 * -368702957) {
				f_623_ = 1.0F;
			} else if (anIntArray9514[i_621_] > aClass64_9442.anInt965 * 929457875) {
				f_623_ = (aClass64_9442.anInt965 * 929457875 - anIntArray9514[i_621_]) * 1.0F
						/ (aClass64_9442.anInt965 * 929457875 - aClass64_9442.anInt966 * -368702957);
			}
			if (anIntArray9514[i_622_] > aClass64_9442.anInt966 * -368702957) {
				f_624_ = 1.0F;
			} else if (anIntArray9514[i_622_] > aClass64_9442.anInt965 * 929457875) {
				f_624_ = (aClass64_9442.anInt965 * 929457875 - anIntArray9514[i_622_]) * 1.0F
						/ (aClass64_9442.anInt965 * 929457875 - aClass64_9442.anInt966 * -368702957);
			}
			if (faceAlphas == null) {
				aClass109_9444.anInt1375 = 0;
			} else {
				aClass109_9444.anInt1375 = faceAlphas[i] & 0xff;
			}
			if (!bool_600_) {
				if (anIntArray9507[i] == -1) {
					aClass109_9444.method1991(bool, bool_598_, bool_599_, aFloatArray9516[i_620_],
							aFloatArray9516[i_621_], aFloatArray9516[i_622_], aFloatArray9515[i_620_],
							aFloatArray9515[i_621_], aFloatArray9515[i_622_], aFloatArray9494[i_620_],
							aFloatArray9494[i_621_], aFloatArray9494[i_622_], Class360.blendColours(
									Class335.HSV_TABLE[anIntArray9471[i] & 0xffff],
									aClass64_9442.fogColour * 1595608531, f * 255.0F), Class360.blendColours(
									Class335.HSV_TABLE[anIntArray9471[i] & 0xffff],
									aClass64_9442.fogColour * 1595608531, f_623_ * 255.0F), Class360.blendColours(
									Class335.HSV_TABLE[anIntArray9471[i] & 0xffff],
									aClass64_9442.fogColour * 1595608531, f_624_ * 255.0F));
				} else {
					aClass109_9444.method1991(bool, bool_598_, bool_599_, aFloatArray9516[i_620_],
							aFloatArray9516[i_621_], aFloatArray9516[i_622_], aFloatArray9515[i_620_],
							aFloatArray9515[i_621_], aFloatArray9515[i_622_], aFloatArray9494[i_620_],
							aFloatArray9494[i_621_], aFloatArray9494[i_622_], Class360.blendColours(
									Class335.HSV_TABLE[anIntArray9471[i] & 0xffff],
									aClass64_9442.fogColour * 1595608531, f * 255.0F), Class360.blendColours(
									Class335.HSV_TABLE[anIntArray9472[i] & 0xffff],
									aClass64_9442.fogColour * 1595608531, f_623_ * 255.0F), Class360.blendColours(
									Class335.HSV_TABLE[anIntArray9507[i] & 0xffff],
									aClass64_9442.fogColour * 1595608531, f_624_ * 255.0F));
				}
			} else {
				int i_625_ = -16777216;
				if (faceAlphas != null) {
					i_625_ = 255 - (faceAlphas[i] & 0xff) << 24;
				}
				if (anIntArray9507[i] == -1) {
					int i_626_ = i_625_ | anIntArray9471[i] & 0xffffff;
					aClass109_9444.method1995(bool, bool_598_, bool_599_, aFloatArray9516[i_620_],
							aFloatArray9516[i_621_], aFloatArray9516[i_622_], aFloatArray9515[i_620_],
							aFloatArray9515[i_621_], aFloatArray9515[i_622_], aFloatArray9494[i_620_],
							aFloatArray9494[i_621_], aFloatArray9494[i_622_], aFloatArray9463[i_620_],
							aFloatArray9463[i_621_], aFloatArray9463[i_622_], aFloatArrayArray9469[i][0],
							aFloatArrayArray9469[i][1], aFloatArrayArray9469[i][2], aFloatArrayArray9523[i][0],
							aFloatArrayArray9523[i][1], aFloatArrayArray9523[i][2], i_626_, i_626_, i_626_,
							aClass64_9442.fogColour * 1595608531, f * 255.0F, f_623_ * 255.0F, f_624_ * 255.0F,
							aShortArray9482[i] & 0xffff);
				} else {
					aClass109_9444.method1995(bool, bool_598_, bool_599_, aFloatArray9516[i_620_],
							aFloatArray9516[i_621_], aFloatArray9516[i_622_], aFloatArray9515[i_620_],
							aFloatArray9515[i_621_], aFloatArray9515[i_622_], aFloatArray9494[i_620_],
							aFloatArray9494[i_621_], aFloatArray9494[i_622_], aFloatArray9463[i_620_],
							aFloatArray9463[i_621_], aFloatArray9463[i_622_], aFloatArrayArray9469[i][0],
							aFloatArrayArray9469[i][1], aFloatArrayArray9469[i][2], aFloatArrayArray9523[i][0],
							aFloatArrayArray9523[i][1], aFloatArrayArray9523[i][2], i_625_ | anIntArray9471[i]
									& 0xffffff, i_625_ | anIntArray9472[i] & 0xffffff, i_625_ | anIntArray9507[i]
									& 0xffffff, aClass64_9442.fogColour * 1595608531, f * 255.0F, f_623_ * 255.0F,
							f_624_ * 255.0F, aShortArray9482[i] & 0xffff);
				}
			}
		}
	}

	final void method15012(boolean bool, boolean bool_627_, boolean bool_628_, int i) {
		short i_629_ = aShortArray9466[i];
		short i_630_ = aShortArray9467[i];
		short i_631_ = aShortArray9522[i];
		boolean bool_632_ = false;
		if (aShortArray9482 != null && aShortArray9482[i] != -1) {
			bool_632_ = toolkit.metricsList.get(aShortArray9482[i] & 0xffff).aBool1698;
		}
		if (!bool_632_) {
			if (faceAlphas == null) {
				aClass109_9444.anInt1375 = 0;
			} else {
				aClass109_9444.anInt1375 = faceAlphas[i] & 0xff;
			}
			if (anIntArray9507[i] == -1) {
				aClass109_9444.method1993(bool, bool_627_, bool_628_, aFloatArray9516[i_629_], aFloatArray9516[i_630_],
						aFloatArray9516[i_631_], aFloatArray9515[i_629_], aFloatArray9515[i_630_],
						aFloatArray9515[i_631_], aFloatArray9494[i_629_], aFloatArray9494[i_630_],
						aFloatArray9494[i_631_], Class335.HSV_TABLE[anIntArray9471[i] & 0xffff]);
			} else {
				aClass109_9444.method1989(bool, bool_627_, bool_628_, aFloatArray9516[i_629_], aFloatArray9516[i_630_],
						aFloatArray9516[i_631_], aFloatArray9515[i_629_], aFloatArray9515[i_630_],
						aFloatArray9515[i_631_], aFloatArray9494[i_629_], aFloatArray9494[i_630_],
						aFloatArray9494[i_631_], anIntArray9471[i] & 0xffff, anIntArray9472[i] & 0xffff,
						anIntArray9507[i] & 0xffff);
			}
		} else {
			int i_633_ = -16777216;
			if (faceAlphas != null) {
				i_633_ = 255 - (faceAlphas[i] & 0xff) << 24;
			}
			if (anIntArray9507[i] == -1) {
				int i_634_ = i_633_ | anIntArray9471[i] & 0xffffff;
				aClass109_9444.method1995(bool, bool_627_, bool_628_, aFloatArray9516[i_629_], aFloatArray9516[i_630_],
						aFloatArray9516[i_631_], aFloatArray9515[i_629_], aFloatArray9515[i_630_],
						aFloatArray9515[i_631_], aFloatArray9494[i_629_], aFloatArray9494[i_630_],
						aFloatArray9494[i_631_], aFloatArray9463[i_629_], aFloatArray9463[i_630_],
						aFloatArray9463[i_631_], aFloatArrayArray9469[i][0], aFloatArrayArray9469[i][1],
						aFloatArrayArray9469[i][2], aFloatArrayArray9523[i][0], aFloatArrayArray9523[i][1],
						aFloatArrayArray9523[i][2], i_634_, i_634_, i_634_, aClass64_9442.fogColour * 1595608531, 0.0F,
						0.0F, 0.0F, aShortArray9482[i] & 0xffff);
			} else {
				aClass109_9444.method1995(bool, bool_627_, bool_628_, aFloatArray9516[i_629_], aFloatArray9516[i_630_],
						aFloatArray9516[i_631_], aFloatArray9515[i_629_], aFloatArray9515[i_630_],
						aFloatArray9515[i_631_], aFloatArray9494[i_629_], aFloatArray9494[i_630_],
						aFloatArray9494[i_631_], aFloatArray9463[i_629_], aFloatArray9463[i_630_],
						aFloatArray9463[i_631_], aFloatArrayArray9469[i][0], aFloatArrayArray9469[i][1],
						aFloatArrayArray9469[i][2], aFloatArrayArray9523[i][0], aFloatArrayArray9523[i][1],
						aFloatArrayArray9523[i][2], i_633_ | anIntArray9471[i] & 0xffffff, i_633_ | anIntArray9472[i]
								& 0xffffff, i_633_ | anIntArray9507[i] & 0xffffff,
						aClass64_9442.fogColour * 1595608531, 0.0F, 0.0F, 0.0F, aShortArray9482[i] & 0xffff);
			}
		}
	}

	final boolean method15030(int i) {
		if (anIntArray9524 == null) {
			return false;
		}
		return anIntArray9524[i] != -1;
	}

	void method15035(Thread thread) {
		JavaThreadResource class64 = toolkit.getThreadResource(thread);
		if (class64 != aClass64_9443) {
			aClass64_9443 = class64;
			aClass143_Sub3Array9525 = aClass64_9443.aClass143_Sub3Array994;
			aClass143_Sub3Array9526 = aClass64_9443.aClass143_Sub3Array995;
		}
	}

	boolean method15052(int i, int i_707_, float f, float f_708_, float f_709_, float f_710_, float f_711_, float f_712_) {
		if (i_707_ < f && i_707_ < f_708_ && i_707_ < f_709_) {
			return false;
		}
		if (i_707_ > f && i_707_ > f_708_ && i_707_ > f_709_) {
			return false;
		}
		if (i < f_710_ && i < f_711_ && i < f_712_) {
			return false;
		}
		return !(i > f_710_ && i > f_711_ && i > f_712_);
	}

	void method15068() {
		if (anInt9477 == 0) {
			method14991(false);
		} else if (toolkit.threadCount * -1677857107 > 1) {
			synchronized (this) {
				method14996();
			}
		} else {
			method14996();
		}
	}

	void method15069() {
		if (!computedBounds) {
			int i = 0;
			int i_753_ = 0;
			int i_754_ = 32767;
			int i_755_ = 32767;
			int i_756_ = 32767;
			int i_757_ = -32768;
			int i_758_ = -32768;
			int i_759_ = -32768;
			for (int i_760_ = 0; i_760_ < anInt9457; i_760_++) {
				int i_761_ = vertexX[i_760_];
				int i_762_ = vertexY[i_760_];
				int i_763_ = vertexZ[i_760_];
				if (i_761_ < i_754_) {
					i_754_ = i_761_;
				}
				if (i_761_ > i_757_) {
					i_757_ = i_761_;
				}
				if (i_762_ < i_755_) {
					i_755_ = i_762_;
				}
				if (i_762_ > i_758_) {
					i_758_ = i_762_;
				}
				if (i_763_ < i_756_) {
					i_756_ = i_763_;
				}
				if (i_763_ > i_759_) {
					i_759_ = i_763_;
				}
				int i_764_ = i_761_ * i_761_ + i_763_ * i_763_;
				if (i_764_ > i) {
					i = i_764_;
				}
				i_764_ += i_762_ * i_762_;
				if (i_764_ > i_753_) {
					i_753_ = i_764_;
				}
			}
			aShort9505 = (short) i_754_;
			aShort9506 = (short) i_757_;
			aShort9470 = (short) i_755_;
			aShort9517 = (short) i_758_;
			aShort9504 = (short) i_756_;
			aShort9491 = (short) i_759_;
			aShort9501 = (short) (int) (Math.sqrt(i) + 0.99);
			aShort9502 = (short) (int) (Math.sqrt(i_753_) + 0.99);
			computedBounds = true;
		}
	}

	void method15071() {
		aClass84Array9462 = new Class84[anInt9457];
		for (int i = 0; i < anInt9457; i++) {
			aClass84Array9462[i] = new Class84();
		}
		for (int i = 0; i < faceCount; i++) {
			short i_765_ = aShortArray9466[i];
			short i_766_ = aShortArray9467[i];
			short i_767_ = aShortArray9522[i];
			int i_768_ = vertexX[i_766_] - vertexX[i_765_];
			int i_769_ = vertexY[i_766_] - vertexY[i_765_];
			int i_770_ = vertexZ[i_766_] - vertexZ[i_765_];
			int i_771_ = vertexX[i_767_] - vertexX[i_765_];
			int i_772_ = vertexY[i_767_] - vertexY[i_765_];
			int i_773_ = vertexZ[i_767_] - vertexZ[i_765_];
			int i_774_ = i_769_ * i_773_ - i_772_ * i_770_;
			int i_775_ = i_770_ * i_771_ - i_773_ * i_768_;
			int i_776_;
			for (i_776_ = i_768_ * i_772_ - i_771_ * i_769_; i_774_ > 8192 || i_775_ > 8192 || i_776_ > 8192
					|| i_774_ < -8192 || i_775_ < -8192 || i_776_ < -8192; i_776_ >>= 1) {
				i_774_ >>= 1;
				i_775_ >>= 1;
			}
			int i_777_ = (int) Math.sqrt(i_774_ * i_774_ + i_775_ * i_775_ + i_776_ * i_776_);
			if (i_777_ <= 0) {
				i_777_ = 1;
			}
			i_774_ = i_774_ * 256 / i_777_;
			i_775_ = i_775_ * 256 / i_777_;
			i_776_ = i_776_ * 256 / i_777_;
			byte i_778_;
			if (aByteArray9479 == null) {
				i_778_ = (byte) 0;
			} else {
				i_778_ = aByteArray9479[i];
			}
			if (i_778_ == 0) {
				Class84 class84 = aClass84Array9462[i_765_];
				class84.anInt1216 += i_774_;
				class84.anInt1214 += i_775_;
				class84.anInt1215 += i_776_;
				class84.anInt1213++;
				class84 = aClass84Array9462[i_766_];
				class84.anInt1216 += i_774_;
				class84.anInt1214 += i_775_;
				class84.anInt1215 += i_776_;
				class84.anInt1213++;
				class84 = aClass84Array9462[i_767_];
				class84.anInt1216 += i_774_;
				class84.anInt1214 += i_775_;
				class84.anInt1215 += i_776_;
				class84.anInt1213++;
			} else if (i_778_ == 1) {
				if (aClass81Array9478 == null) {
					aClass81Array9478 = new Class81[faceCount];
				}
				Class81 class81 = aClass81Array9478[i] = new Class81();
				class81.anInt1176 = i_774_;
				class81.anInt1175 = i_775_;
				class81.anInt1174 = i_776_;
			}
		}
	}

	Model method15073(JavaModel class143_sub3_779_, JavaModel class143_sub3_780_, int i, boolean bool, boolean bool_781_) {
		class143_sub3_779_.computedBounds = computedBounds;
		if (computedBounds) {
			class143_sub3_779_.aShort9506 = aShort9506;
			class143_sub3_779_.aShort9517 = aShort9517;
			class143_sub3_779_.aShort9491 = aShort9491;
			class143_sub3_779_.aShort9505 = aShort9505;
			class143_sub3_779_.aShort9470 = aShort9470;
			class143_sub3_779_.aShort9504 = aShort9504;
			class143_sub3_779_.aShort9501 = aShort9501;
			class143_sub3_779_.aShort9502 = aShort9502;
		}
		if (aBool9480) {
			class143_sub3_779_.aShort9510 = aShort9510;
			class143_sub3_779_.aBool9480 = true;
		} else {
			class143_sub3_779_.aBool9480 = false;
		}
		class143_sub3_779_.anInt9441 = anInt9441;
		class143_sub3_779_.anInt9455 = anInt9455;
		class143_sub3_779_.vertexCount = vertexCount;
		class143_sub3_779_.anInt9457 = anInt9457;
		class143_sub3_779_.faceCount = faceCount;
		class143_sub3_779_.anInt9459 = anInt9459;
		class143_sub3_779_.anInt9440 = anInt9440;
		if ((i & 0x100) != 0) {
			class143_sub3_779_.aBool9511 = true;
		} else {
			class143_sub3_779_.aBool9511 = aBool9511;
		}
		class143_sub3_779_.aBool9465 = aBool9465;
		boolean bool_782_ = (i & 0x7) == 7 | (i & 0x20) != 0;
		boolean bool_783_ = bool_782_ || (i & 0x1) != 0;
		boolean bool_784_ = bool_782_ || (i & 0x2) != 0;
		boolean bool_785_ = bool_782_ || (i & 0x4) != 0 || (i & 0x10) != 0;
		if (bool_783_ || bool_784_ || bool_785_) {
			if (bool_783_) {
				if (class143_sub3_780_.vertexX == null || class143_sub3_780_.vertexX.length < vertexCount) {
					class143_sub3_779_.vertexX = class143_sub3_780_.vertexX = new int[vertexCount];
				} else {
					class143_sub3_779_.vertexX = class143_sub3_780_.vertexX;
				}
				for (int i_786_ = 0; i_786_ < vertexCount; i_786_++) {
					class143_sub3_779_.vertexX[i_786_] = vertexX[i_786_];
				}
			} else {
				class143_sub3_779_.vertexX = vertexX;
			}
			if (bool_784_) {
				if (class143_sub3_780_.vertexY == null || class143_sub3_780_.vertexY.length < vertexCount) {
					class143_sub3_779_.vertexY = class143_sub3_780_.vertexY = new int[vertexCount];
				} else {
					class143_sub3_779_.vertexY = class143_sub3_780_.vertexY;
				}
				for (int i_787_ = 0; i_787_ < vertexCount; i_787_++) {
					class143_sub3_779_.vertexY[i_787_] = vertexY[i_787_];
				}
			} else {
				class143_sub3_779_.vertexY = vertexY;
			}
			if (bool_785_) {
				if (class143_sub3_780_.vertexZ == null || class143_sub3_780_.vertexZ.length < vertexCount) {
					class143_sub3_779_.vertexZ = class143_sub3_780_.vertexZ = new int[vertexCount];
				} else {
					class143_sub3_779_.vertexZ = class143_sub3_780_.vertexZ;
				}
				for (int i_788_ = 0; i_788_ < vertexCount; i_788_++) {
					class143_sub3_779_.vertexZ[i_788_] = vertexZ[i_788_];
				}
			} else {
				class143_sub3_779_.vertexZ = vertexZ;
			}
		} else {
			class143_sub3_779_.vertexX = vertexX;
			class143_sub3_779_.vertexY = vertexY;
			class143_sub3_779_.vertexZ = vertexZ;
		}
		if ((i & 0x84080) != 0) {
			if (class143_sub3_780_.faceColours == null || class143_sub3_780_.faceColours.length < faceCount) {
				int i_789_ = faceCount;
				class143_sub3_779_.faceColours = class143_sub3_780_.faceColours = new short[i_789_];
			} else {
				class143_sub3_779_.faceColours = class143_sub3_780_.faceColours;
			}
			for (int i_790_ = 0; i_790_ < faceCount; i_790_++) {
				class143_sub3_779_.faceColours[i_790_] = faceColours[i_790_];
			}
		} else {
			class143_sub3_779_.faceColours = faceColours;
		}
		if ((i & 0x97018) != 0) {
			class143_sub3_779_.anInt9477 = 0;
			JavaModel class143_sub3_791_ = class143_sub3_779_;
			JavaModel class143_sub3_792_ = class143_sub3_779_;
			class143_sub3_779_.anIntArray9507 = null;
			class143_sub3_792_.anIntArray9472 = null;
			class143_sub3_791_.anIntArray9471 = null;
		} else if ((i & 0x80) != 0) {
			if (bool_781_) {
				method14991(false);
			}
			if (anIntArray9471 != null) {
				if (class143_sub3_780_.anIntArray9471 == null || class143_sub3_780_.anIntArray9471.length < faceCount) {
					int i_793_ = faceCount;
					class143_sub3_779_.anIntArray9471 = class143_sub3_780_.anIntArray9471 = new int[i_793_];
					class143_sub3_779_.anIntArray9472 = class143_sub3_780_.anIntArray9472 = new int[i_793_];
					class143_sub3_779_.anIntArray9507 = class143_sub3_780_.anIntArray9507 = new int[i_793_];
				} else {
					class143_sub3_779_.anIntArray9471 = class143_sub3_780_.anIntArray9471;
					class143_sub3_779_.anIntArray9472 = class143_sub3_780_.anIntArray9472;
					class143_sub3_779_.anIntArray9507 = class143_sub3_780_.anIntArray9507;
				}
				for (int i_794_ = 0; i_794_ < faceCount; i_794_++) {
					class143_sub3_779_.anIntArray9471[i_794_] = anIntArray9471[i_794_];
					class143_sub3_779_.anIntArray9472[i_794_] = anIntArray9472[i_794_];
					class143_sub3_779_.anIntArray9507[i_794_] = anIntArray9507[i_794_];
				}
			}
			class143_sub3_779_.anInt9477 = anInt9477;
		} else {
			if (bool_781_) {
				method14991(false);
			}
			class143_sub3_779_.anIntArray9471 = anIntArray9471;
			class143_sub3_779_.anIntArray9472 = anIntArray9472;
			class143_sub3_779_.anIntArray9507 = anIntArray9507;
			class143_sub3_779_.anInt9477 = anInt9477;
		}
		if ((i & 0x100) != 0) {
			if (class143_sub3_780_.faceAlphas == null || class143_sub3_780_.faceAlphas.length < faceCount) {
				int i_795_ = faceCount;
				class143_sub3_779_.faceAlphas = class143_sub3_780_.faceAlphas = new byte[i_795_];
			} else {
				class143_sub3_779_.faceAlphas = class143_sub3_780_.faceAlphas;
			}
			if (faceAlphas != null) {
				for (int i_796_ = 0; i_796_ < faceCount; i_796_++) {
					class143_sub3_779_.faceAlphas[i_796_] = faceAlphas[i_796_];
				}
			} else {
				for (int i_797_ = 0; i_797_ < faceCount; i_797_++) {
					class143_sub3_779_.faceAlphas[i_797_] = (byte) 0;
				}
			}
		} else {
			class143_sub3_779_.faceAlphas = faceAlphas;
		}
		if ((i & 0x8) != 0 || (i & 0x10) != 0) {
			if (class143_sub3_780_.aClass84Array9462 == null || class143_sub3_780_.aClass84Array9462.length < anInt9457) {
				int i_798_ = anInt9457;
				class143_sub3_779_.aClass84Array9462 = class143_sub3_780_.aClass84Array9462 = new Class84[i_798_];
			} else {
				class143_sub3_779_.aClass84Array9462 = class143_sub3_780_.aClass84Array9462;
			}
			if (aClass84Array9462 != null) {
				for (int i_799_ = 0; i_799_ < anInt9457; i_799_++) {
					class143_sub3_779_.aClass84Array9462[i_799_] = new Class84(aClass84Array9462[i_799_]);
				}
			} else {
				class143_sub3_779_.aClass84Array9462 = null;
			}
			if (aClass81Array9478 != null) {
				if (class143_sub3_780_.aClass81Array9478 == null
						|| class143_sub3_780_.aClass81Array9478.length < faceCount) {
					int i_800_ = faceCount;
					class143_sub3_779_.aClass81Array9478 = class143_sub3_780_.aClass81Array9478 = new Class81[i_800_];
				} else {
					class143_sub3_779_.aClass81Array9478 = class143_sub3_780_.aClass81Array9478;
				}
				for (int i_801_ = 0; i_801_ < faceCount; i_801_++) {
					class143_sub3_779_.aClass81Array9478[i_801_] = aClass81Array9478[i_801_] != null ? new Class81(
							aClass81Array9478[i_801_]) : null;
				}
			} else {
				class143_sub3_779_.aClass81Array9478 = null;
			}
		} else {
			if (bool_781_) {
				method14990();
			}
			class143_sub3_779_.aClass84Array9462 = aClass84Array9462;
			class143_sub3_779_.aClass81Array9478 = aClass81Array9478;
		}
		if ((i & 0x8000) != 0) {
			if (aShortArray9482 == null) {
				class143_sub3_779_.aShortArray9482 = null;
			} else {
				if (class143_sub3_780_.aShortArray9482 == null || class143_sub3_780_.aShortArray9482.length < faceCount) {
					int i_802_ = faceCount;
					class143_sub3_779_.aShortArray9482 = class143_sub3_780_.aShortArray9482 = new short[i_802_];
				} else {
					class143_sub3_779_.aShortArray9482 = class143_sub3_780_.aShortArray9482;
				}
				for (int i_803_ = 0; i_803_ < faceCount; i_803_++) {
					class143_sub3_779_.aShortArray9482[i_803_] = aShortArray9482[i_803_];
				}
			}
		} else {
			class143_sub3_779_.aShortArray9482 = aShortArray9482;
		}
		if ((i & 0x10000) != 0) {
			if (aByteArray9479 == null) {
				class143_sub3_779_.aByteArray9479 = null;
			} else {
				if (class143_sub3_780_.aByteArray9479 == null || class143_sub3_780_.aByteArray9479.length < faceCount) {
					int i_804_ = bool ? faceCount + 100 : faceCount;
					class143_sub3_779_.aByteArray9479 = class143_sub3_780_.aByteArray9479 = new byte[i_804_];
				} else {
					class143_sub3_779_.aByteArray9479 = class143_sub3_780_.aByteArray9479;
				}
				for (int i_805_ = 0; i_805_ < faceCount; i_805_++) {
					class143_sub3_779_.aByteArray9479[i_805_] = aByteArray9479[i_805_];
				}
			}
		} else {
			class143_sub3_779_.aByteArray9479 = aByteArray9479;
		}
		if ((i & 0xc580) != 0) {
			if (class143_sub3_780_.aClass79Array9498 == null || class143_sub3_780_.aClass79Array9498.length < anInt9459) {
				int i_806_ = anInt9459;
				class143_sub3_779_.aClass79Array9498 = class143_sub3_780_.aClass79Array9498 = new Class79[i_806_];
				for (int i_807_ = 0; i_807_ < anInt9459; i_807_++) {
					class143_sub3_779_.aClass79Array9498[i_807_] = aClass79Array9498[i_807_].copy();
				}
			} else {
				class143_sub3_779_.aClass79Array9498 = class143_sub3_780_.aClass79Array9498;
				for (int i_808_ = 0; i_808_ < anInt9459; i_808_++) {
					class143_sub3_779_.aClass79Array9498[i_808_].copyFrom(aClass79Array9498[i_808_]);
				}
			}
		} else {
			class143_sub3_779_.aClass79Array9498 = aClass79Array9498;
		}
		if (aFloatArrayArray9469 != null && (i & 0x10) != 0) {
			if (class143_sub3_780_.aFloatArrayArray9469 == null
					|| class143_sub3_780_.aFloatArrayArray9469.length < faceCount) {
				int i_809_ = bool ? faceCount + 100 : faceCount;
				class143_sub3_779_.aFloatArrayArray9469 = class143_sub3_780_.aFloatArrayArray9469 = new float[i_809_][3];
			} else {
				class143_sub3_779_.aFloatArrayArray9469 = class143_sub3_780_.aFloatArrayArray9469;
			}
			for (int i_810_ = 0; i_810_ < faceCount; i_810_++) {
				if (aFloatArrayArray9469[i_810_] != null) {
					class143_sub3_779_.aFloatArrayArray9469[i_810_][0] = aFloatArrayArray9469[i_810_][0];
					class143_sub3_779_.aFloatArrayArray9469[i_810_][1] = aFloatArrayArray9469[i_810_][1];
					class143_sub3_779_.aFloatArrayArray9469[i_810_][2] = aFloatArrayArray9469[i_810_][2];
				}
			}
			if (class143_sub3_780_.aFloatArrayArray9523 == null
					|| class143_sub3_780_.aFloatArrayArray9523.length < faceCount) {
				int i_811_ = bool ? faceCount + 100 : faceCount;
				class143_sub3_779_.aFloatArrayArray9523 = class143_sub3_780_.aFloatArrayArray9523 = new float[i_811_][3];
			} else {
				class143_sub3_779_.aFloatArrayArray9523 = class143_sub3_780_.aFloatArrayArray9523;
			}
			for (int i_812_ = 0; i_812_ < faceCount; i_812_++) {
				if (aFloatArrayArray9523[i_812_] != null) {
					class143_sub3_779_.aFloatArrayArray9523[i_812_][0] = aFloatArrayArray9523[i_812_][0];
					class143_sub3_779_.aFloatArrayArray9523[i_812_][1] = aFloatArrayArray9523[i_812_][1];
					class143_sub3_779_.aFloatArrayArray9523[i_812_][2] = aFloatArrayArray9523[i_812_][2];
				}
			}
		} else {
			class143_sub3_779_.aFloatArrayArray9469 = aFloatArrayArray9469;
			class143_sub3_779_.aFloatArrayArray9523 = aFloatArrayArray9523;
		}

		class143_sub3_779_.vertexLabels = vertexLabels;
		class143_sub3_779_.faceLabels = faceLabels;
		class143_sub3_779_.anIntArrayArray9512 = anIntArrayArray9512;
		class143_sub3_779_.aShortArray9461 = aShortArray9461;
		class143_sub3_779_.aShortArray9509 = aShortArray9509;
		class143_sub3_779_.aByteArray9497 = aByteArray9497;
		class143_sub3_779_.aShortArray9466 = aShortArray9466;
		class143_sub3_779_.aShortArray9467 = aShortArray9467;
		class143_sub3_779_.aShortArray9522 = aShortArray9522;
		class143_sub3_779_.aClass145Array9450 = aClass145Array9450;
		class143_sub3_779_.aClass115Array9495 = aClass115Array9495;
		class143_sub3_779_.aClass69Array9468 = aClass69Array9468;
		class143_sub3_779_.aShortArray9485 = aShortArray9485;
		class143_sub3_779_.anInt9453 = i;
		return class143_sub3_779_;
	}

	void method15076() {
		synchronized (this) {
			for (int vertex = 0; vertex < anInt9457; vertex++) {
				int i_817_ = vertexZ[vertex];
				vertexZ[vertex] = vertexX[vertex];
				vertexX[vertex] = -i_817_;

				if (aClass84Array9462[vertex] != null) {
					i_817_ = aClass84Array9462[vertex].anInt1215;
					aClass84Array9462[vertex].anInt1215 = aClass84Array9462[vertex].anInt1216;
					aClass84Array9462[vertex].anInt1216 = -i_817_;
				}
			}

			if (aClass81Array9478 != null) {
				for (int face = 0; face < faceCount; face++) {
					if (aClass81Array9478[face] != null) {
						int i_818_ = aClass81Array9478[face].anInt1174;
						aClass81Array9478[face].anInt1174 = aClass81Array9478[face].anInt1176;
						aClass81Array9478[face].anInt1176 = -i_818_;
					}
				}
			}

			for (int vertex = anInt9457; vertex < vertexCount; vertex++) {
				int i_819_ = vertexZ[vertex];
				vertexZ[vertex] = vertexX[vertex];
				vertexX[vertex] = -i_819_;
			}

			anInt9477 = 0;
			computedBounds = false;
		}
	}

	@Override
	void method2903() {
		if (toolkit.threadCount * -1677857107 > 1) {
			synchronized (this) {
				while (aBool1750) {
					try {
						wait();
					} catch (InterruptedException interruptedexception) {

					}
				}
				aBool1750 = true;
			}
		}
	}

	@Override
	void method2904() {
		if (toolkit.threadCount * -1677857107 > 1) {
			synchronized (this) {
				aBool1750 = false;
				notifyAll();
			}
		}
	}

	@Override
	void method2913(int type, int[] labels, int tx, int ty, int tz, boolean bool, int i_343_, int[] is_344_) {
		int i_345_ = labels.length;
		if (type == 0) {
			tx <<= 4;
			ty <<= 4;
			tz <<= 4;

			if (!scaledVertices) {
				for (int index = 0; index < vertexCount; index++) {
					vertexX[index] <<= 4;
					vertexY[index] <<= 4;
					vertexZ[index] <<= 4;
				}

				scaledVertices = true;
			}

			int count = 0;
			centroidX = 0;
			centroidY = 0;
			centroidZ = 0;

			for (int index = 0; index < i_345_; index++) {
				int label = labels[index];

				if (label < vertexLabels.length) {
					for (int vertex : vertexLabels[label]) {
						if (aShortArray9461 == null || (i_343_ & aShortArray9461[vertex]) != 0) {
							centroidX += vertexX[vertex];
							centroidY += vertexY[vertex];
							centroidZ += vertexZ[vertex];
							count++;
						}
					}
				}
			}

			if (count > 0) {
				centroidX = centroidX / count + tx;
				centroidY = centroidY / count + ty;
				centroidZ = centroidZ / count + tz;
				aBool9493 = true;
			} else {
				centroidX = tx;
				centroidY = ty;
				centroidZ = tz;
			}
		} else if (type == 1) {
			if (is_344_ != null) {
				int x = is_344_[0] * tx + is_344_[1] * ty + is_344_[2] * tz + 8192 >> 14;
				int y = is_344_[3] * tx + is_344_[4] * ty + is_344_[5] * tz + 8192 >> 14;
				int z = is_344_[6] * tx + is_344_[7] * ty + is_344_[8] * tz + 8192 >> 14;
				tx = x;
				ty = y;
				tz = z;
			}

			tx <<= 4;
			ty <<= 4;
			tz <<= 4;

			if (!scaledVertices) {
				for (int index = 0; index < vertexCount; index++) {
					vertexX[index] <<= 4;
					vertexY[index] <<= 4;
					vertexZ[index] <<= 4;
				}

				scaledVertices = true;
			}

			for (int index = 0; index < i_345_; index++) {
				int label = labels[index];
				if (label < vertexLabels.length) {
					for (int vertex : vertexLabels[label]) {
						if (aShortArray9461 == null || (i_343_ & aShortArray9461[vertex]) != 0) {
							vertexX[vertex] += tx;
							vertexY[vertex] += ty;
							vertexZ[vertex] += tz;
						}
					}
				}
			}
		} else if (type == 2) {
			if (is_344_ != null) {
				if (!scaledVertices) {
					for (int index = 0; index < vertexCount; index++) {
						vertexX[index] <<= 4;
						vertexY[index] <<= 4;
						vertexZ[index] <<= 4;
					}

					scaledVertices = true;
				}

				int i_363_ = is_344_[9] << 4;
				int i_364_ = is_344_[10] << 4;
				int i_365_ = is_344_[11] << 4;
				int i_366_ = is_344_[12] << 4;
				int i_367_ = is_344_[13] << 4;
				int i_368_ = is_344_[14] << 4;

				if (aBool9493) {
					int x = is_344_[0] * centroidX + is_344_[3] * centroidY + is_344_[6] * centroidZ + 8192 >> 14;
					int y = is_344_[1] * centroidX + is_344_[4] * centroidY + is_344_[7] * centroidZ + 8192 >> 14;
					int z = is_344_[2] * centroidX + is_344_[5] * centroidY + is_344_[8] * centroidZ + 8192 >> 14;
					x += i_366_;
					y += i_367_;
					z += i_368_;
					centroidX = x;
					centroidY = y;
					centroidZ = z;
					aBool9493 = false;
				}

				int[] is_372_ = new int[9];
				int cosx = Class373.COSINE[tx];
				int sinx = Class373.SINE[tx];
				int cosy = Class373.COSINE[ty];
				int siny = Class373.SINE[ty];
				int cosz = Class373.COSINE[tz];
				int sinz = Class373.SINE[tz];

				int i_379_ = sinx * cosz + 8192 >> 14;
				int i_380_ = sinx * sinz + 8192 >> 14;

				is_372_[0] = cosy * cosz + siny * i_380_ + 8192 >> 14;
				is_372_[1] = -cosy * sinz + siny * i_379_ + 8192 >> 14;
				is_372_[2] = siny * cosx + 8192 >> 14;
				is_372_[3] = cosx * sinz + 8192 >> 14;
				is_372_[4] = cosx * cosz + 8192 >> 14;
				is_372_[5] = -sinx;
				is_372_[6] = -siny * cosz + cosy * i_380_ + 8192 >> 14;
				is_372_[7] = siny * sinz + cosy * i_379_ + 8192 >> 14;
				is_372_[8] = cosy * cosx + 8192 >> 14;

				int i_381_ = is_372_[0] * -centroidX + is_372_[1] * -centroidY + is_372_[2] * -centroidZ + 8192 >> 14;
				int i_382_ = is_372_[3] * -centroidX + is_372_[4] * -centroidY + is_372_[5] * -centroidZ + 8192 >> 14;
				int i_383_ = is_372_[6] * -centroidX + is_372_[7] * -centroidY + is_372_[8] * -centroidZ + 8192 >> 14;

				int i_384_ = i_381_ + centroidX;
				int i_385_ = i_382_ + centroidY;
				int i_386_ = i_383_ + centroidZ;
				int[] is_387_ = new int[9];

				for (int i_388_ = 0; i_388_ < 3; i_388_++) {
					for (int i_389_ = 0; i_389_ < 3; i_389_++) {
						int i_390_ = 0;

						for (int i_391_ = 0; i_391_ < 3; i_391_++) {
							i_390_ += is_372_[i_388_ * 3 + i_391_] * is_344_[i_389_ * 3 + i_391_];
						}

						is_387_[i_388_ * 3 + i_389_] = i_390_ + 8192 >> 14;
					}
				}

				int i_392_ = is_372_[0] * i_366_ + is_372_[1] * i_367_ + is_372_[2] * i_368_ + 8192 >> 14;
				int i_393_ = is_372_[3] * i_366_ + is_372_[4] * i_367_ + is_372_[5] * i_368_ + 8192 >> 14;
				int i_394_ = is_372_[6] * i_366_ + is_372_[7] * i_367_ + is_372_[8] * i_368_ + 8192 >> 14;

				i_392_ += i_384_;
				i_393_ += i_385_;
				i_394_ += i_386_;
				int[] is_395_ = new int[9];

				for (int i_396_ = 0; i_396_ < 3; i_396_++) {
					for (int i_397_ = 0; i_397_ < 3; i_397_++) {
						int i_398_ = 0;

						for (int i_399_ = 0; i_399_ < 3; i_399_++) {
							i_398_ += is_344_[i_396_ * 3 + i_399_] * is_387_[i_397_ + i_399_ * 3];
						}

						is_395_[i_396_ * 3 + i_397_] = i_398_ + 8192 >> 14;
					}
				}

				int dx = is_344_[0] * i_392_ + is_344_[1] * i_393_ + is_344_[2] * i_394_ + 8192 >> 14;
				int dy = is_344_[3] * i_392_ + is_344_[4] * i_393_ + is_344_[5] * i_394_ + 8192 >> 14;
				int dz = is_344_[6] * i_392_ + is_344_[7] * i_393_ + is_344_[8] * i_394_ + 8192 >> 14;

				dx += i_363_;
				dy += i_364_;
				dz += i_365_;

				for (int index = 0; index < i_345_; index++) {
					int label = labels[index];
					if (label < vertexLabels.length) {
						for (int vertex : vertexLabels[label]) {
							if (aShortArray9461 == null || (i_343_ & aShortArray9461[vertex]) != 0) {
								int x = is_395_[0] * vertexX[vertex] + is_395_[1] * vertexY[vertex] + is_395_[2]
										* vertexZ[vertex] + 8192 >> 14;
								int y = is_395_[3] * vertexX[vertex] + is_395_[4] * vertexY[vertex] + is_395_[5]
										* vertexZ[vertex] + 8192 >> 14;
								int z = is_395_[6] * vertexX[vertex] + is_395_[7] * vertexY[vertex] + is_395_[8]
										* vertexZ[vertex] + 8192 >> 14;
								x += dx;
								y += dy;
								z += dz;
								vertexX[vertex] = x;
								vertexY[vertex] = y;
								vertexZ[vertex] = z;
							}
						}
					}
				}
			} else {
				for (int index = 0; index < i_345_; index++) {
					int label = labels[index];
					if (label < vertexLabels.length) {
						for (int vertex : vertexLabels[label]) {
							if (aShortArray9461 == null || (i_343_ & aShortArray9461[vertex]) != 0) {
								vertexX[vertex] -= centroidX;
								vertexY[vertex] -= centroidY;
								vertexZ[vertex] -= centroidZ;

								if (tz != 0) {
									int sinz = Class373.SINE[tz];
									int cosz = Class373.COSINE[tz];
									int x = vertexY[vertex] * sinz + vertexX[vertex] * cosz + 16383 >> 14;
									vertexY[vertex] = vertexY[vertex] * cosz - vertexX[vertex] * sinz + 16383 >> 14;
									vertexX[vertex] = x;
								}

								if (tx != 0) {
									int sinx = Class373.SINE[tx];
									int cosx = Class373.COSINE[tx];
									int y = vertexY[vertex] * cosx - vertexZ[vertex] * sinx + 16383 >> 14;
									vertexZ[vertex] = vertexY[vertex] * sinx + vertexZ[vertex] * cosx + 16383 >> 14;
									vertexY[vertex] = y;
								}

								if (ty != 0) {
									int siny = Class373.SINE[ty];
									int cosy = Class373.COSINE[ty];
									int x = vertexZ[vertex] * siny + vertexX[vertex] * cosy + 16383 >> 14;
									vertexZ[vertex] = vertexZ[vertex] * cosy - vertexX[vertex] * siny + 16383 >> 14;
									vertexX[vertex] = x;
								}

								vertexX[vertex] += centroidX;
								vertexY[vertex] += centroidY;
								vertexZ[vertex] += centroidZ;
							}
						}
					}
				}
			}
		} else if (type == 3) {
			if (is_344_ != null) {
				if (!scaledVertices) {
					for (int index = 0; index < vertexCount; index++) {
						vertexX[index] <<= 4;
						vertexY[index] <<= 4;
						vertexZ[index] <<= 4;
					}

					scaledVertices = true;
				}

				int i_426_ = is_344_[9] << 4;
				int i_427_ = is_344_[10] << 4;
				int i_428_ = is_344_[11] << 4;
				int i_429_ = is_344_[12] << 4;
				int i_430_ = is_344_[13] << 4;
				int i_431_ = is_344_[14] << 4;

				if (aBool9493) {
					int x = is_344_[0] * centroidX + is_344_[3] * centroidY + is_344_[6] * centroidZ + 8192 >> 14;
					int y = is_344_[1] * centroidX + is_344_[4] * centroidY + is_344_[7] * centroidZ + 8192 >> 14;
					int z = is_344_[2] * centroidX + is_344_[5] * centroidY + is_344_[8] * centroidZ + 8192 >> 14;
					x += i_429_;
					y += i_430_;
					z += i_431_;

					centroidX = x;
					centroidY = y;
					centroidZ = z;
					aBool9493 = false;
				}

				int i_435_ = tx << 15 >> 7;
				int i_436_ = ty << 15 >> 7;
				int i_437_ = tz << 15 >> 7;
				int i_438_ = i_435_ * -centroidX + 8192 >> 14;
				int i_439_ = i_436_ * -centroidY + 8192 >> 14;
				int i_440_ = i_437_ * -centroidZ + 8192 >> 14;
				int i_441_ = i_438_ + centroidX;
				int i_442_ = i_439_ + centroidY;
				int i_443_ = i_440_ + centroidZ;
				int[] is_444_ = new int[9];

				is_444_[0] = i_435_ * is_344_[0] + 8192 >> 14;
				is_444_[1] = i_435_ * is_344_[3] + 8192 >> 14;
				is_444_[2] = i_435_ * is_344_[6] + 8192 >> 14;
				is_444_[3] = i_436_ * is_344_[1] + 8192 >> 14;
				is_444_[4] = i_436_ * is_344_[4] + 8192 >> 14;
				is_444_[5] = i_436_ * is_344_[7] + 8192 >> 14;
				is_444_[6] = i_437_ * is_344_[2] + 8192 >> 14;
				is_444_[7] = i_437_ * is_344_[5] + 8192 >> 14;
				is_444_[8] = i_437_ * is_344_[8] + 8192 >> 14;

				int i_445_ = i_435_ * i_429_ + 8192 >> 14;
				int i_446_ = i_436_ * i_430_ + 8192 >> 14;
				int i_447_ = i_437_ * i_431_ + 8192 >> 14;

				i_445_ += i_441_;
				i_446_ += i_442_;
				i_447_ += i_443_;

				int[] is_448_ = new int[9];

				for (int i_449_ = 0; i_449_ < 3; i_449_++) {
					for (int i_450_ = 0; i_450_ < 3; i_450_++) {
						int i_451_ = 0;
						for (int i_452_ = 0; i_452_ < 3; i_452_++) {
							i_451_ += is_344_[i_449_ * 3 + i_452_] * is_444_[i_450_ + i_452_ * 3];
						}
						is_448_[i_449_ * 3 + i_450_] = i_451_ + 8192 >> 14;
					}
				}

				int dx = is_344_[0] * i_445_ + is_344_[1] * i_446_ + is_344_[2] * i_447_ + 8192 >> 14;
				int dy = is_344_[3] * i_445_ + is_344_[4] * i_446_ + is_344_[5] * i_447_ + 8192 >> 14;
				int dz = is_344_[6] * i_445_ + is_344_[7] * i_446_ + is_344_[8] * i_447_ + 8192 >> 14;
				dx += i_426_;
				dy += i_427_;
				dz += i_428_;

				for (int index = 0; index < i_345_; index++) {
					int label = labels[index];
					if (label < vertexLabels.length) {
						for (int vertex : vertexLabels[label]) {
							if (aShortArray9461 == null || (i_343_ & aShortArray9461[vertex]) != 0) {
								int x = is_448_[0] * vertexX[vertex] + is_448_[1] * vertexY[vertex] + is_448_[2]
										* vertexZ[vertex] + 8192 >> 14;
								int y = is_448_[3] * vertexX[vertex] + is_448_[4] * vertexY[vertex] + is_448_[5]
										* vertexZ[vertex] + 8192 >> 14;
								int z = is_448_[6] * vertexX[vertex] + is_448_[7] * vertexY[vertex] + is_448_[8]
										* vertexZ[vertex] + 8192 >> 14;
								x += dx;
								y += dy;
								z += dz;
								vertexX[vertex] = x;
								vertexY[vertex] = y;
								vertexZ[vertex] = z;
							}
						}
					}
				}
			} else {
				for (int index = 0; index < i_345_; index++) {
					int label = labels[index];
					if (label < vertexLabels.length) {
						for (int vertex : vertexLabels[label]) {
							if (aShortArray9461 == null || (i_343_ & aShortArray9461[vertex]) != 0) {
								vertexX[vertex] -= centroidX;
								vertexY[vertex] -= centroidY;
								vertexZ[vertex] -= centroidZ;

								vertexX[vertex] = vertexX[vertex] * tx / 128;
								vertexY[vertex] = vertexY[vertex] * ty / 128;
								vertexZ[vertex] = vertexZ[vertex] * tz / 128;

								vertexX[vertex] += centroidX;
								vertexY[vertex] += centroidY;
								vertexZ[vertex] += centroidZ;
							}
						}
					}
				}
			}
		} else if (type == 5) {
			if (faceLabels != null && faceAlphas != null) {
				for (int index = 0; index < i_345_; index++) {
					int label = labels[index];
					if (label < faceLabels.length) {
						for (int face : faceLabels[label]) {
							if (aShortArray9509 == null || (i_343_ & aShortArray9509[face]) != 0) {
								int alpha = (faceAlphas[face] & 0xff) + tx * 8;
								if (alpha < 0) {
									alpha = 0;
								} else if (alpha > 255) {
									alpha = 255;
								}

								faceAlphas[face] = (byte) alpha;
							}
						}
					}
				}

				if (aClass69Array9468 != null) {
					for (int index = 0; index < anInt9459; index++) {
						Class69 class69 = aClass69Array9468[index];
						Class79 class79 = aClass79Array9498[index];
						class79.colour = (class79.colour * -1876827231 & 0xffffff | 255 - (faceAlphas[class69.face
								* -316357385] & 0xff) << 24) * 577814625;
					}
				}
			}
		} else if (type == 7) {
			if (faceLabels != null) {
				for (int index = 0; index < i_345_; index++) {
					int label = labels[index];
					if (label < faceLabels.length) {
						for (int face : faceLabels[label]) {
							if (aShortArray9509 == null || (i_343_ & aShortArray9509[face]) != 0) {
								int colour = faceColours[face] & 0xffff;
								int i_482_ = colour >> 10 & 0x3f;
								int i_483_ = colour >> 7 & 0x7;
								int i_484_ = colour & 0x7f;

								i_482_ = i_482_ + tx & 0x3f;
								i_483_ += ty;
								if (i_483_ < 0) {
									i_483_ = 0;
								} else if (i_483_ > 7) {
									i_483_ = 7;
								}

								i_484_ += tz;
								if (i_484_ < 0) {
									i_484_ = 0;
								} else if (i_484_ > 127) {
									i_484_ = 127;
								}

								faceColours[face] = (short) (i_482_ << 10 | i_483_ << 7 | i_484_);
							}
						}

						aBool9488 = true;
					}
				}
				if (aClass69Array9468 != null) {
					for (int i_485_ = 0; i_485_ < anInt9459; i_485_++) {
						Class69 class69 = aClass69Array9468[i_485_];
						Class79 class79 = aClass79Array9498[i_485_];
						class79.colour = (class79.colour * -1876827231 & ~0xffffff | Class335.HSV_TABLE[HslUtils
								.hslToHsv(faceColours[class69.face * -316357385] & 0xffff) & 0xffff] & 0xffffff) * 577814625;
					}
				}
			}
		} else if (type == 8) {
			if (anIntArrayArray9512 != null) {
				for (int index = 0; index < i_345_; index++) {
					int label = labels[index];
					if (label < anIntArrayArray9512.length) {
						for (int element : anIntArrayArray9512[label]) {
							Class79 class79 = aClass79Array9498[element];
							class79.anInt1148 += tx * -1377274871;
							class79.anInt1151 += ty * -260405671;
						}
					}
				}
			}
		} else if (type == 10) {
			if (anIntArrayArray9512 != null) {
				for (int index = 0; index < i_345_; index++) {
					int label = labels[index];
					if (label < anIntArrayArray9512.length) {
						for (int element : anIntArrayArray9512[label]) {
							Class79 class79 = aClass79Array9498[element];
							class79.aFloat1157 = class79.aFloat1157 * tx / 128.0F;
							class79.aFloat1149 = class79.aFloat1149 * ty / 128.0F;
						}
					}
				}
			}
		} else if (type == 9) {
			if (anIntArrayArray9512 != null) {
				for (int index = 0; index < i_345_; index++) {
					int label = labels[index];
					if (label < anIntArrayArray9512.length) {
						for (int element : anIntArrayArray9512[label]) {
							Class79 class79 = aClass79Array9498[element];
							class79.anInt1152 = (class79.anInt1152 * -431290941 + tx & 0x3fff) * 79565547;
						}
					}
				}
			}
		}
	}

	@Override
	void transform(int type, int dx, int dy, int dz) {
		if (type == 0) {
			int count = 0;
			centroidX = 0;
			centroidY = 0;
			centroidZ = 0;

			for (int vertex = 0; vertex < vertexCount; vertex++) {
				centroidX += vertexX[vertex];
				centroidY += vertexY[vertex];
				centroidZ += vertexZ[vertex];
				count++;
			}

			if (count > 0) {
				centroidX = centroidX / count + dx;
				centroidY = centroidY / count + dy;
				centroidZ = centroidZ / count + dz;
			} else {
				centroidX = dx;
				centroidY = dy;
				centroidZ = dz;
			}
		} else if (type == 1) {
			for (int vertex = 0; vertex < vertexCount; vertex++) {
				vertexX[vertex] += dx;
				vertexY[vertex] += dy;
				vertexZ[vertex] += dz;
			}
		} else if (type == 2) {
			for (int vertex = 0; vertex < vertexCount; vertex++) {
				vertexX[vertex] -= centroidX;
				vertexY[vertex] -= centroidY;
				vertexZ[vertex] -= centroidZ;

				if (dz != 0) {
					int sinz = Class373.SINE[dz];
					int cosz = Class373.COSINE[dz];

					int x = vertexY[vertex] * sinz + vertexX[vertex] * cosz + 16383 >> 14;
					vertexY[vertex] = vertexY[vertex] * cosz - vertexX[vertex] * sinz + 16383 >> 14;
					vertexX[vertex] = x;
				}

				if (dx != 0) {
					int sinx = Class373.SINE[dx];
					int cosx = Class373.COSINE[dx];

					int y = vertexY[vertex] * cosx - vertexZ[vertex] * sinx + 16383 >> 14;
					vertexZ[vertex] = vertexY[vertex] * sinx + vertexZ[vertex] * cosx + 16383 >> 14;
					vertexY[vertex] = y;
				}

				if (dy != 0) {
					int siny = Class373.SINE[dy];
					int cosy = Class373.COSINE[dy];

					int x = vertexZ[vertex] * siny + vertexX[vertex] * cosy + 16383 >> 14;
					vertexZ[vertex] = vertexZ[vertex] * cosy - vertexX[vertex] * siny + 16383 >> 14;
					vertexX[vertex] = x;
				}

				vertexX[vertex] += centroidX;
				vertexY[vertex] += centroidY;
				vertexZ[vertex] += centroidZ;
			}
		} else if (type == 3) {
			for (int vertex = 0; vertex < vertexCount; vertex++) {
				vertexX[vertex] -= centroidX;
				vertexY[vertex] -= centroidY;
				vertexZ[vertex] -= centroidZ;

				vertexX[vertex] = vertexX[vertex] * dx / 128;
				vertexY[vertex] = vertexY[vertex] * dy / 128;
				vertexZ[vertex] = vertexZ[vertex] * dz / 128;

				vertexX[vertex] += centroidX;
				vertexY[vertex] += centroidY;
				vertexZ[vertex] += centroidZ;
			}
		} else if (type == 5) {
			for (int face = 0; face < faceCount; face++) {
				int alpha = (faceAlphas[face] & 0xff) + dx * 8;
				if (alpha < 0) {
					alpha = 0;
				} else if (alpha > 255) {
					alpha = 255;
				}

				faceAlphas[face] = (byte) alpha;
			}

			if (aClass69Array9468 != null) {
				for (int index = 0; index < anInt9459; index++) {
					Class69 class69 = aClass69Array9468[index];
					Class79 class79 = aClass79Array9498[index];
					class79.colour = (class79.colour * -1876827231 & 0xffffff | 255 - (faceAlphas[class69.face
							* -316357385] & 0xff) << 24) * 577814625;
				}
			}
		} else if (type == 7) {
			for (int index = 0; index < faceCount; index++) {
				int colour = faceColours[index] & 0xffff;
				int i_677_ = colour >> 10 & 0x3f;
				int i_678_ = colour >> 7 & 0x7;
				int i_679_ = colour & 0x7f;

				i_677_ = i_677_ + dx & 0x3f;
				i_678_ += dy;

				if (i_678_ < 0) {
					i_678_ = 0;
				} else if (i_678_ > 7) {
					i_678_ = 7;
				}

				i_679_ += dz;
				if (i_679_ < 0) {
					i_679_ = 0;
				} else if (i_679_ > 127) {
					i_679_ = 127;
				}

				faceColours[index] = (short) (i_677_ << 10 | i_678_ << 7 | i_679_);
			}
			aBool9488 = true;
			if (aClass69Array9468 != null) {
				for (int index = 0; index < anInt9459; index++) {
					Class69 class69 = aClass69Array9468[index];
					Class79 class79 = aClass79Array9498[index];
					class79.colour = (class79.colour * -1876827231 & ~0xffffff | Class335.HSV_TABLE[HslUtils
							.hslToHsv(faceColours[class69.face * -316357385] & 0xffff) & 0xffff] & 0xffffff) * 577814625;
				}
			}
		} else if (type == 8) {
			for (int index = 0; index < anInt9459; index++) {
				Class79 class79 = aClass79Array9498[index];
				class79.anInt1148 += dx * -1377274871;
				class79.anInt1151 += dy * -260405671;
			}
		} else if (type == 10) {
			for (int index = 0; index < anInt9459; index++) {
				Class79 class79 = aClass79Array9498[index];
				class79.aFloat1157 = class79.aFloat1157 * dx / 128.0F;
				class79.aFloat1149 = class79.aFloat1149 * dy / 128.0F;
			}
		} else if (type == 9) {
			for (int index = 0; index < anInt9459; index++) {
				Class79 class79 = aClass79Array9498[index];
				class79.anInt1152 = (class79.anInt1152 * -431290941 + dx & 0x3fff) * 79565547;
			}
		}
	}

	@Override
	void endAnimation() {
		if (scaledVertices) {
			for (int index = 0; index < vertexCount; index++) {
				vertexX[index] = vertexX[index] + 7 >> 4;
				vertexY[index] = vertexY[index] + 7 >> 4;
				vertexZ[index] = vertexZ[index] + 7 >> 4;
			}

			scaledVertices = false;
		}

		if (aBool9488) {
			method15068();
			aBool9488 = false;
		}

		computedBounds = false;
	}

	@Override
	boolean startAnimation() {
		if (vertexLabels == null) {
			return false;
		}

		centroidX = 0;
		centroidY = 0;
		centroidZ = 0;
		return true;
	}

	@Override
	void method3079(int i, int[] is, int i_263_, int i_264_, int i_265_, int i_266_, boolean bool) {
		int i_267_ = is.length;
		if (i == 0) {
			i_263_ <<= 4;
			i_264_ <<= 4;
			i_265_ <<= 4;
			if (!scaledVertices) {
				for (int i_268_ = 0; i_268_ < vertexCount; i_268_++) {
					vertexX[i_268_] <<= 4;
					vertexY[i_268_] <<= 4;
					vertexZ[i_268_] <<= 4;
				}
				scaledVertices = true;
			}
			int i_269_ = 0;
			centroidX = 0;
			centroidY = 0;
			centroidZ = 0;
			for (int i_270_ = 0; i_270_ < i_267_; i_270_++) {
				int i_271_ = is[i_270_];
				if (i_271_ < vertexLabels.length) {
					int[] is_272_ = vertexLabels[i_271_];
					for (int i_274_ : is_272_) {
						centroidX += vertexX[i_274_];
						centroidY += vertexY[i_274_];
						centroidZ += vertexZ[i_274_];
						i_269_++;
					}
				}
			}
			if (i_269_ > 0) {
				centroidX = centroidX / i_269_ + i_263_;
				centroidY = centroidY / i_269_ + i_264_;
				centroidZ = centroidZ / i_269_ + i_265_;
			} else {
				centroidX = i_263_;
				centroidY = i_264_;
				centroidZ = i_265_;
			}
		} else if (i == 1) {
			i_263_ <<= 4;
			i_264_ <<= 4;
			i_265_ <<= 4;
			if (!scaledVertices) {
				for (int i_275_ = 0; i_275_ < vertexCount; i_275_++) {
					vertexX[i_275_] <<= 4;
					vertexY[i_275_] <<= 4;
					vertexZ[i_275_] <<= 4;
				}
				scaledVertices = true;
			}
			for (int i_276_ = 0; i_276_ < i_267_; i_276_++) {
				int i_277_ = is[i_276_];
				if (i_277_ < vertexLabels.length) {
					int[] is_278_ = vertexLabels[i_277_];
					for (int element : is_278_) {
						int i_280_ = element;
						vertexX[i_280_] += i_263_;
						vertexY[i_280_] += i_264_;
						vertexZ[i_280_] += i_265_;
					}
				}
			}
		} else if (i == 2) {
			for (int i_281_ = 0; i_281_ < i_267_; i_281_++) {
				int i_282_ = is[i_281_];
				if (i_282_ < vertexLabels.length) {
					int[] is_283_ = vertexLabels[i_282_];
					if ((i_266_ & 0x1) == 0) {
						for (int element : is_283_) {
							int i_285_ = element;
							vertexX[i_285_] -= centroidX;
							vertexY[i_285_] -= centroidY;
							vertexZ[i_285_] -= centroidZ;
							if (i_265_ != 0) {
								int i_286_ = Class373.SINE[i_265_];
								int i_287_ = Class373.COSINE[i_265_];
								int i_288_ = vertexY[i_285_] * i_286_ + vertexX[i_285_] * i_287_ + 16383 >> 14;
								vertexY[i_285_] = vertexY[i_285_] * i_287_ - vertexX[i_285_] * i_286_ + 16383 >> 14;
								vertexX[i_285_] = i_288_;
							}
							if (i_263_ != 0) {
								int i_289_ = Class373.SINE[i_263_];
								int i_290_ = Class373.COSINE[i_263_];
								int i_291_ = vertexY[i_285_] * i_290_ - vertexZ[i_285_] * i_289_ + 16383 >> 14;
								vertexZ[i_285_] = vertexY[i_285_] * i_289_ + vertexZ[i_285_] * i_290_ + 16383 >> 14;
								vertexY[i_285_] = i_291_;
							}
							if (i_264_ != 0) {
								int i_292_ = Class373.SINE[i_264_];
								int i_293_ = Class373.COSINE[i_264_];
								int i_294_ = vertexZ[i_285_] * i_292_ + vertexX[i_285_] * i_293_ + 16383 >> 14;
								vertexZ[i_285_] = vertexZ[i_285_] * i_293_ - vertexX[i_285_] * i_292_ + 16383 >> 14;
								vertexX[i_285_] = i_294_;
							}
							vertexX[i_285_] += centroidX;
							vertexY[i_285_] += centroidY;
							vertexZ[i_285_] += centroidZ;
						}
					} else {
						for (int element : is_283_) {
							int i_296_ = element;
							vertexX[i_296_] -= centroidX;
							vertexY[i_296_] -= centroidY;
							vertexZ[i_296_] -= centroidZ;
							if (i_263_ != 0) {
								int i_297_ = Class373.SINE[i_263_];
								int i_298_ = Class373.COSINE[i_263_];
								int i_299_ = vertexY[i_296_] * i_298_ - vertexZ[i_296_] * i_297_ + 16383 >> 14;
								vertexZ[i_296_] = vertexY[i_296_] * i_297_ + vertexZ[i_296_] * i_298_ + 16383 >> 14;
								vertexY[i_296_] = i_299_;
							}
							if (i_265_ != 0) {
								int i_300_ = Class373.SINE[i_265_];
								int i_301_ = Class373.COSINE[i_265_];
								int i_302_ = vertexY[i_296_] * i_300_ + vertexX[i_296_] * i_301_ + 16383 >> 14;
								vertexY[i_296_] = vertexY[i_296_] * i_301_ - vertexX[i_296_] * i_300_ + 16383 >> 14;
								vertexX[i_296_] = i_302_;
							}
							if (i_264_ != 0) {
								int i_303_ = Class373.SINE[i_264_];
								int i_304_ = Class373.COSINE[i_264_];
								int i_305_ = vertexZ[i_296_] * i_303_ + vertexX[i_296_] * i_304_ + 16383 >> 14;
								vertexZ[i_296_] = vertexZ[i_296_] * i_304_ - vertexX[i_296_] * i_303_ + 16383 >> 14;
								vertexX[i_296_] = i_305_;
							}
							vertexX[i_296_] += centroidX;
							vertexY[i_296_] += centroidY;
							vertexZ[i_296_] += centroidZ;
						}
					}
				}
			}
		} else if (i == 3) {
			for (int i_306_ = 0; i_306_ < i_267_; i_306_++) {
				int i_307_ = is[i_306_];
				if (i_307_ < vertexLabels.length) {
					int[] is_308_ = vertexLabels[i_307_];
					for (int element : is_308_) {
						int i_310_ = element;
						vertexX[i_310_] -= centroidX;
						vertexY[i_310_] -= centroidY;
						vertexZ[i_310_] -= centroidZ;
						vertexX[i_310_] = vertexX[i_310_] * i_263_ / 128;
						vertexY[i_310_] = vertexY[i_310_] * i_264_ / 128;
						vertexZ[i_310_] = vertexZ[i_310_] * i_265_ / 128;
						vertexX[i_310_] += centroidX;
						vertexY[i_310_] += centroidY;
						vertexZ[i_310_] += centroidZ;
					}
				}
			}
		} else if (i == 5) {
			if (faceLabels != null && faceAlphas != null) {
				for (int i_311_ = 0; i_311_ < i_267_; i_311_++) {
					int i_312_ = is[i_311_];
					if (i_312_ < faceLabels.length) {
						int[] is_313_ = faceLabels[i_312_];
						for (int element : is_313_) {
							int i_315_ = element;
							int i_316_ = (faceAlphas[i_315_] & 0xff) + i_263_ * 8;
							if (i_316_ < 0) {
								i_316_ = 0;
							} else if (i_316_ > 255) {
								i_316_ = 255;
							}
							faceAlphas[i_315_] = (byte) i_316_;
						}
					}
				}
				if (aClass69Array9468 != null) {
					for (int i_317_ = 0; i_317_ < anInt9459; i_317_++) {
						Class69 class69 = aClass69Array9468[i_317_];
						Class79 class79 = aClass79Array9498[i_317_];
						class79.colour = (class79.colour * -1876827231 & 0xffffff | 255 - (faceAlphas[class69.face
								* -316357385] & 0xff) << 24) * 577814625;
					}
				}
			}
		} else if (i == 7) {
			if (faceLabels != null) {
				for (int i_318_ = 0; i_318_ < i_267_; i_318_++) {
					int i_319_ = is[i_318_];
					if (i_319_ < faceLabels.length) {
						int[] is_320_ = faceLabels[i_319_];
						for (int element : is_320_) {
							int i_322_ = element;
							int i_323_ = faceColours[i_322_] & 0xffff;
							int i_324_ = i_323_ >> 10 & 0x3f;
							int i_325_ = i_323_ >> 7 & 0x7;
							int i_326_ = i_323_ & 0x7f;
							i_324_ = i_324_ + i_263_ & 0x3f;
							i_325_ += i_264_;
							if (i_325_ < 0) {
								i_325_ = 0;
							} else if (i_325_ > 7) {
								i_325_ = 7;
							}
							i_326_ += i_265_;
							if (i_326_ < 0) {
								i_326_ = 0;
							} else if (i_326_ > 127) {
								i_326_ = 127;
							}
							faceColours[i_322_] = (short) (i_324_ << 10 | i_325_ << 7 | i_326_);
						}
						aBool9488 = true;
					}
				}
				if (aClass69Array9468 != null) {
					for (int i_327_ = 0; i_327_ < anInt9459; i_327_++) {
						Class69 class69 = aClass69Array9468[i_327_];
						Class79 class79 = aClass79Array9498[i_327_];
						class79.colour = (class79.colour * -1876827231 & ~0xffffff | Class335.HSV_TABLE[HslUtils
								.hslToHsv(faceColours[class69.face * -316357385] & 0xffff) & 0xffff] & 0xffffff) * 577814625;
					}
				}
			}
		} else if (i == 8) {
			if (anIntArrayArray9512 != null) {
				for (int i_328_ = 0; i_328_ < i_267_; i_328_++) {
					int i_329_ = is[i_328_];
					if (i_329_ < anIntArrayArray9512.length) {
						int[] is_330_ = anIntArrayArray9512[i_329_];
						for (int element : is_330_) {
							Class79 class79 = aClass79Array9498[element];
							class79.anInt1148 += i_263_ * -1377274871;
							class79.anInt1151 += i_264_ * -260405671;
						}
					}
				}
			}
		} else if (i == 10) {
			if (anIntArrayArray9512 != null) {
				for (int i_332_ = 0; i_332_ < i_267_; i_332_++) {
					int i_333_ = is[i_332_];
					if (i_333_ < anIntArrayArray9512.length) {
						int[] is_334_ = anIntArrayArray9512[i_333_];
						for (int element : is_334_) {
							Class79 class79 = aClass79Array9498[element];
							class79.aFloat1157 = class79.aFloat1157 * i_263_ / 128.0F;
							class79.aFloat1149 = class79.aFloat1149 * i_264_ / 128.0F;
						}
					}
				}
			}
		} else if (i == 9) {
			if (anIntArrayArray9512 != null) {
				for (int i_336_ = 0; i_336_ < i_267_; i_336_++) {
					int i_337_ = is[i_336_];
					if (i_337_ < anIntArrayArray9512.length) {
						int[] is_338_ = anIntArrayArray9512[i_337_];
						for (int element : is_338_) {
							Class79 class79 = aClass79Array9498[element];
							class79.anInt1152 = (class79.anInt1152 * -431290941 + i_263_ & 0x3fff) * 79565547;
						}
					}
				}
			}
		}
	}
}
