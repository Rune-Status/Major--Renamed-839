package com.jagex;

public class BaseModel {
	static final int anInt1754 = 26;
	static final int anInt1755 = 1;
	static final int anInt1771 = 3;
	public static final short aShort1776 = 32766;
	public static final short aShort1784 = -1;

	public static BaseModel lookup(Archive archive, int entry, int child) {
		byte[] data = archive.get(entry, child);
		if (data == null) {
			return null;
		}
		return new BaseModel(data);
	}

	public short[] aShortArray1753;
	public int version = 12;
	public int[] anIntArray1757;
	public byte[] aByteArray1758;
	public int[] vertexX;
	public int[] anIntArray1760;
	public int[] vertexZ;
	public int[] anIntArray1762;
	public int[] anIntArray1763;
	public short[] aShortArray1764;
	int anInt1765;
	public short[] aShortArray1766;
	public float[] aFloatArray1767;
	public int anInt1768;
	public short[] aShortArray1769;
	public short[] aShortArray1770;
	public byte[] aByteArray1772;
	public byte[] aByteArray1773;
	public float[] aFloatArray1774;
	public byte[] aByteArray1775;
	public Class145[] aClass145Array1777;
	public short[] aShortArray1778;
	public short[] aShortArray1779;
	public short[] aShortArray1780;
	public int[] anIntArray1781;
	byte aByte1782;
	public int vertexCount = 0;
	public short[] aShortArray1785;
	public int[] vertexY;
	public byte[] aByteArray1787;
	public byte[] aByteArray1788;
	public short[] aShortArray1789;
	public byte[] aByteArray1790;
	public int[] anIntArray1791;
	public int[] anIntArray1792;
	public int anInt1793;
	public int[] anIntArray1794;
	public Class148[] aClass148Array1795;
	public int[] anIntArray1796;
	int texturedFaceCount;
	public byte[] aByteArray1798;
	byte[] aByteArray1799;
	public Class115[] aClass115Array1800;

	public short[] aShortArray1801;

	public BaseModel(byte[] is) {
		anInt1768 = 0;
		anInt1793 = 0;
		aByte1782 = (byte) 0;
		texturedFaceCount = 0;
		Buffer buffer = new Buffer(is);
		Buffer buffer_129_ = new Buffer(is);
		Buffer buffer_130_ = new Buffer(is);
		Buffer buffer_131_ = new Buffer(is);
		Buffer buffer_132_ = new Buffer(is);
		Buffer buffer_133_ = new Buffer(is);
		Buffer buffer_134_ = new Buffer(is);
		int i = buffer.readUByte();
		if (i != 1) {
			System.out.println(new StringBuilder().append("").append(i).toString());
		} else {
			buffer.readUByte();
			version = buffer.readUByte();
			buffer.offset = (is.length - 26) * 1258142129;
			vertexCount = buffer.readUShort();
			anInt1793 = buffer.readUShort();
			texturedFaceCount = buffer.readUShort();
			int i_135_ = buffer.readUByte();
			boolean bool = (i_135_ & 0x1) == 1;
			boolean bool_136_ = (i_135_ & 0x2) == 2;
			boolean bool_137_ = (i_135_ & 0x4) == 4;
			boolean bool_138_ = (i_135_ & 0x10) == 16;
			boolean bool_139_ = (i_135_ & 0x20) == 32;
			boolean bool_140_ = (i_135_ & 0x40) == 64;
			boolean bool_141_ = (i_135_ & 0x80) == 128;
			int i_142_ = buffer.readUByte();
			int i_143_ = buffer.readUByte();
			int i_144_ = buffer.readUByte();
			int i_145_ = buffer.readUByte();
			int i_146_ = buffer.readUByte();
			int i_147_ = buffer.readUShort();
			int i_148_ = buffer.readUShort();
			int i_149_ = buffer.readUShort();
			int i_150_ = buffer.readUShort();
			int i_151_ = buffer.readUShort();
			int i_152_ = buffer.readUShort();
			int i_153_ = buffer.readUShort();
			if (!bool_138_) {
				if (i_146_ == 1) {
					i_152_ = vertexCount;
				} else {
					i_152_ = 0;
				}
			}
			if (!bool_139_) {
				if (i_144_ == 1) {
					i_153_ = anInt1793;
				} else {
					i_153_ = 0;
				}
			}
			int i_154_ = 0;
			int i_155_ = 0;
			int i_156_ = 0;
			if (texturedFaceCount > 0) {
				aByteArray1787 = new byte[texturedFaceCount];
				buffer.offset = -520540909;
				for (int i_157_ = 0; i_157_ < texturedFaceCount; i_157_++) {
					byte i_158_ = aByteArray1787[i_157_] = buffer.readByte();
					if (i_158_ == 0) {
						i_154_++;
					}
					if (i_158_ >= 1 && i_158_ <= 3) {
						i_155_++;
					}
					if (i_158_ == 2) {
						i_156_++;
					}
				}
			}
			int i_159_ = 3 + texturedFaceCount;
			int i_160_ = i_159_;
			i_159_ += vertexCount;
			int i_161_ = i_159_;
			if (bool) {
				i_159_ += anInt1793;
			}
			int i_162_ = i_159_;
			i_159_ += anInt1793;
			int i_163_ = i_159_;
			if (i_142_ == 255) {
				i_159_ += anInt1793;
			}
			int i_164_ = i_159_;
			i_159_ += i_153_;
			int i_165_ = i_159_;
			i_159_ += i_152_;
			int i_166_ = i_159_;
			if (i_143_ == 1) {
				i_159_ += anInt1793;
			}
			int i_167_ = i_159_;
			i_159_ += i_150_;
			int i_168_ = i_159_;
			if (i_145_ == 1) {
				i_159_ += anInt1793 * 2;
			}
			int i_169_ = i_159_;
			i_159_ += i_151_;
			int i_170_ = i_159_;
			i_159_ += anInt1793 * 2;
			int i_171_ = i_159_;
			i_159_ += i_147_;
			int i_172_ = i_159_;
			i_159_ += i_148_;
			int i_173_ = i_159_;
			i_159_ += i_149_;
			int i_174_ = i_159_;
			i_159_ += i_154_ * 6;
			int i_175_ = i_159_;
			i_159_ += i_155_ * 6;
			int i_176_ = 6;
			if (version == 14) {
				i_176_ = 7;
			} else if (version >= 15) {
				i_176_ = 9;
			}
			int i_177_ = i_159_;
			i_159_ += i_155_ * i_176_;
			int i_178_ = i_159_;
			i_159_ += i_155_;
			int i_179_ = i_159_;
			i_159_ += i_155_;
			int i_180_ = i_159_;
			i_159_ += i_155_ + i_156_ * 2;
			int i_181_ = i_159_;
			int i_182_ = is.length;
			int i_183_ = is.length;
			int i_184_ = is.length;
			int i_185_ = is.length;
			if (bool_141_) {
				Buffer buffer_186_ = new Buffer(is);
				buffer_186_.offset = (is.length - 26) * 1258142129;
				buffer_186_.offset -= is[buffer_186_.offset * -165875887 - 1] * 1258142129;
				anInt1765 = buffer_186_.readUShort();
				int i_187_ = buffer_186_.readUShort();
				int i_188_ = buffer_186_.readUShort();
				i_182_ = i_181_ + i_187_;
				i_183_ = i_182_ + i_188_;
				i_184_ = i_183_ + vertexCount;
				i_185_ = i_184_ + anInt1765 * 2;
			}
			vertexX = new int[vertexCount];
			vertexY = new int[vertexCount];
			vertexZ = new int[vertexCount];
			aShortArray1769 = new short[anInt1793];
			aShortArray1770 = new short[anInt1793];
			aShortArray1766 = new short[anInt1793];
			if (i_146_ == 1) {
				anIntArray1763 = new int[vertexCount];
			}
			if (bool) {
				aByteArray1775 = new byte[anInt1793];
			}
			if (i_142_ == 255) {
				aByteArray1790 = new byte[anInt1793];
			} else {
				aByte1782 = (byte) i_142_;
			}
			if (i_143_ == 1) {
				aByteArray1788 = new byte[anInt1793];
			}
			if (i_144_ == 1) {
				anIntArray1781 = new int[anInt1793];
			}
			if (i_145_ == 1) {
				aShortArray1780 = new short[anInt1793];
			}
			if (i_145_ == 1 && (texturedFaceCount > 0 || anInt1765 > 0)) {
				aShortArray1778 = new short[anInt1793];
			}
			aShortArray1779 = new short[anInt1793];
			if (texturedFaceCount > 0) {
				aShortArray1785 = new short[texturedFaceCount];
				aShortArray1789 = new short[texturedFaceCount];
				aShortArray1801 = new short[texturedFaceCount];
				if (i_155_ > 0) {
					anIntArray1791 = new int[i_155_];
					anIntArray1792 = new int[i_155_];
					anIntArray1760 = new int[i_155_];
					aByteArray1799 = new byte[i_155_];
					aByteArray1798 = new byte[i_155_];
					anIntArray1794 = new int[i_155_];
				}
				if (i_156_ > 0) {
					anIntArray1757 = new int[i_156_];
					anIntArray1796 = new int[i_156_];
				}
			}
			buffer.offset = i_160_ * 1258142129;
			buffer_129_.offset = i_171_ * 1258142129;
			buffer_130_.offset = i_172_ * 1258142129;
			buffer_131_.offset = i_173_ * 1258142129;
			buffer_132_.offset = i_165_ * 1258142129;
			int i_189_ = 0;
			int i_190_ = 0;
			int i_191_ = 0;
			for (int i_192_ = 0; i_192_ < vertexCount; i_192_++) {
				int i_193_ = buffer.readUByte();
				int i_194_ = 0;
				if ((i_193_ & 0x1) != 0) {
					i_194_ = buffer_129_.readSmart();
				}
				int i_195_ = 0;
				if ((i_193_ & 0x2) != 0) {
					i_195_ = buffer_130_.readSmart();
				}
				int i_196_ = 0;
				if ((i_193_ & 0x4) != 0) {
					i_196_ = buffer_131_.readSmart();
				}
				vertexX[i_192_] = i_189_ + i_194_;
				vertexY[i_192_] = i_190_ + i_195_;
				vertexZ[i_192_] = i_191_ + i_196_;
				i_189_ = vertexX[i_192_];
				i_190_ = vertexY[i_192_];
				i_191_ = vertexZ[i_192_];
				if (i_146_ == 1) {
					if (bool_138_) {
						anIntArray1763[i_192_] = buffer_132_.readDecrSmart();
					} else {
						anIntArray1763[i_192_] = buffer_132_.readUByte();
						if (anIntArray1763[i_192_] == 255) {
							anIntArray1763[i_192_] = -1;
						}
					}
				}
			}
			if (anInt1765 > 0) {
				buffer.offset = i_183_ * 1258142129;
				buffer_129_.offset = i_184_ * 1258142129;
				buffer_130_.offset = i_185_ * 1258142129;
				anIntArray1762 = new int[vertexCount];
				int i_197_ = 0;
				int i_198_ = 0;
				for (; i_197_ < vertexCount; i_197_++) {
					anIntArray1762[i_197_] = i_198_;
					i_198_ += buffer.readUByte();
				}
				aByteArray1772 = new byte[anInt1793];
				aByteArray1773 = new byte[anInt1793];
				aByteArray1758 = new byte[anInt1793];
				aFloatArray1774 = new float[anInt1765];
				aFloatArray1767 = new float[anInt1765];
				for (i_197_ = 0; i_197_ < anInt1765; i_197_++) {
					aFloatArray1774[i_197_] = buffer_129_.readShort() / 4096.0F;
					aFloatArray1767[i_197_] = buffer_130_.readShort() / 4096.0F;
				}
			}
			buffer.offset = i_170_ * 1258142129;
			buffer_129_.offset = i_161_ * 1258142129;
			buffer_130_.offset = i_163_ * 1258142129;
			buffer_131_.offset = i_166_ * 1258142129;
			buffer_132_.offset = i_164_ * 1258142129;
			buffer_133_.offset = i_168_ * 1258142129;
			buffer_134_.offset = i_169_ * 1258142129;
			for (int i_199_ = 0; i_199_ < anInt1793; i_199_++) {
				aShortArray1779[i_199_] = (short) buffer.readUShort();
				if (bool) {
					aByteArray1775[i_199_] = buffer_129_.readByte();
				}
				if (i_142_ == 255) {
					aByteArray1790[i_199_] = buffer_130_.readByte();
				}
				if (i_143_ == 1) {
					aByteArray1788[i_199_] = buffer_131_.readByte();
				}
				if (i_144_ == 1) {
					if (bool_139_) {
						anIntArray1781[i_199_] = buffer_132_.readDecrSmart();
					} else {
						anIntArray1781[i_199_] = buffer_132_.readUByte();
						if (anIntArray1781[i_199_] == 255) {
							anIntArray1781[i_199_] = -1;
						}
					}
				}
				if (i_145_ == 1) {
					aShortArray1780[i_199_] = (short) (buffer_133_.readUShort() - 1);
				}
				if (aShortArray1778 != null) {
					if (aShortArray1780[i_199_] != -1) {
						if (version >= 16) {
							aShortArray1778[i_199_] = (short) (buffer_134_.readUSmart() - 1);
						} else {
							aShortArray1778[i_199_] = (short) (buffer_134_.readUByte() - 1);
						}
					} else {
						aShortArray1778[i_199_] = (short) -1;
					}
				}
			}
			anInt1768 = -1;
			buffer.offset = i_167_ * 1258142129;
			buffer_129_.offset = i_162_ * 1258142129;
			buffer_130_.offset = i_182_ * 1258142129;
			method3090(buffer, buffer_129_, buffer_130_);
			buffer.offset = i_174_ * 1258142129;
			buffer_129_.offset = i_175_ * 1258142129;
			buffer_130_.offset = i_177_ * 1258142129;
			buffer_131_.offset = i_178_ * 1258142129;
			buffer_132_.offset = i_179_ * 1258142129;
			buffer_133_.offset = i_180_ * 1258142129;
			method3091(buffer, buffer_129_, buffer_130_, buffer_131_, buffer_132_, buffer_133_);
			buffer.offset = i_181_ * 1258142129;
			if (bool_136_) {
				int i_200_ = buffer.readUByte();
				if (i_200_ > 0) {
					aClass145Array1777 = new Class145[i_200_];
					for (int i_201_ = 0; i_201_ < i_200_; i_201_++) {
						int emitter = buffer.readUShort();
						int i_203_ = buffer.readUShort();
						byte priority;

						if (i_142_ == 255) {
							priority = aByteArray1790[i_203_];
						} else {
							priority = (byte) i_142_;
						}

						aClass145Array1777[i_201_] = new Class145(emitter, i_203_, aShortArray1769[i_203_],
								aShortArray1770[i_203_], aShortArray1766[i_203_], priority);
					}
				}
				int i_205_ = buffer.readUByte();
				if (i_205_ > 0) {
					aClass115Array1800 = new Class115[i_205_];
					for (int i_206_ = 0; i_206_ < i_205_; i_206_++) {
						int i_207_ = buffer.readUShort();
						int i_208_ = buffer.readUShort();
						aClass115Array1800[i_206_] = new Class115(i_207_, i_208_);
					}
				}
			}
			if (bool_137_) {
				int i_209_ = buffer.readUByte();
				if (i_209_ > 0) {
					aClass148Array1795 = new Class148[i_209_];
					for (int i_210_ = 0; i_210_ < i_209_; i_210_++) {
						int i_211_ = buffer.readUShort();
						int i_212_ = buffer.readUShort();
						int i_213_;
						if (bool_140_) {
							i_213_ = buffer.readDecrSmart();
						} else {
							i_213_ = buffer.readUByte();
							if (i_213_ == 255) {
								i_213_ = -1;
							}
						}
						byte i_214_ = buffer.readByte();
						aClass148Array1795[i_210_] = new Class148(i_211_, i_212_, i_213_, i_214_);
					}
				}
			}
		}
	}

	public BaseModel(BaseModel[] class144s, int i) {
		anInt1768 = 0;
		anInt1793 = 0;
		aByte1782 = (byte) 0;
		texturedFaceCount = 0;
		vertexCount = 0;
		anInt1793 = 0;
		texturedFaceCount = 0;
		anInt1765 = 0;
		int i_8_ = 0;
		int i_9_ = 0;
		int i_10_ = 0;
		boolean bool = false;
		boolean bool_11_ = false;
		boolean bool_12_ = false;
		boolean bool_13_ = false;
		boolean bool_14_ = false;
		boolean bool_15_ = false;
		aByte1782 = (byte) -1;
		for (int i_16_ = 0; i_16_ < i; i_16_++) {
			BaseModel class144_17_ = class144s[i_16_];
			if (class144_17_ != null) {
				vertexCount += class144_17_.vertexCount;
				anInt1793 += class144_17_.anInt1793;
				texturedFaceCount += class144_17_.texturedFaceCount;
				anInt1765 += class144_17_.anInt1765;
				if (class144_17_.aClass145Array1777 != null) {
					i_8_ += class144_17_.aClass145Array1777.length;
				}
				if (class144_17_.aClass115Array1800 != null) {
					i_9_ += class144_17_.aClass115Array1800.length;
				}
				if (class144_17_.aClass148Array1795 != null) {
					i_10_ += class144_17_.aClass148Array1795.length;
				}
				bool = bool | class144_17_.aByteArray1775 != null;
				if (class144_17_.aByteArray1790 != null) {
					bool_11_ = true;
				} else {
					if (aByte1782 == -1) {
						aByte1782 = class144_17_.aByte1782;
					}
					if (aByte1782 != class144_17_.aByte1782) {
						bool_11_ = true;
					}
				}
				bool_12_ = bool_12_ | class144_17_.aByteArray1788 != null;
				bool_13_ = bool_13_ | class144_17_.aShortArray1778 != null;
				bool_14_ = bool_14_ | class144_17_.aShortArray1780 != null;
				bool_15_ = bool_15_ | class144_17_.anIntArray1781 != null;
			}
		}
		vertexX = new int[vertexCount];
		vertexY = new int[vertexCount];
		vertexZ = new int[vertexCount];
		anIntArray1763 = new int[vertexCount];
		aShortArray1764 = new short[vertexCount];
		aShortArray1769 = new short[anInt1793];
		aShortArray1770 = new short[anInt1793];
		aShortArray1766 = new short[anInt1793];
		if (bool) {
			aByteArray1775 = new byte[anInt1793];
		}
		if (bool_11_) {
			aByteArray1790 = new byte[anInt1793];
		}
		if (bool_12_) {
			aByteArray1788 = new byte[anInt1793];
		}
		if (bool_13_) {
			aShortArray1778 = new short[anInt1793];
		}
		aShortArray1779 = new short[anInt1793];
		if (bool_14_) {
			aShortArray1780 = new short[anInt1793];
		}
		if (bool_15_) {
			anIntArray1781 = new int[anInt1793];
		}
		aShortArray1753 = new short[anInt1793];
		if (texturedFaceCount > 0) {
			aByteArray1787 = new byte[texturedFaceCount];
			aShortArray1785 = new short[texturedFaceCount];
			aShortArray1789 = new short[texturedFaceCount];
			aShortArray1801 = new short[texturedFaceCount];
			anIntArray1791 = new int[texturedFaceCount];
			anIntArray1792 = new int[texturedFaceCount];
			anIntArray1760 = new int[texturedFaceCount];
			aByteArray1799 = new byte[texturedFaceCount];
			aByteArray1798 = new byte[texturedFaceCount];
			anIntArray1794 = new int[texturedFaceCount];
			anIntArray1757 = new int[texturedFaceCount];
			anIntArray1796 = new int[texturedFaceCount];
		}
		if (i_10_ > 0) {
			aClass148Array1795 = new Class148[i_10_];
		}
		if (i_8_ > 0) {
			aClass145Array1777 = new Class145[i_8_];
		}
		if (i_9_ > 0) {
			aClass115Array1800 = new Class115[i_9_];
		}
		if (anInt1765 > 0) {
			aFloatArray1774 = new float[anInt1765];
			aFloatArray1767 = new float[anInt1765];
			anIntArray1762 = new int[vertexCount];
			aByteArray1772 = new byte[anInt1793];
			aByteArray1773 = new byte[anInt1793];
			aByteArray1758 = new byte[anInt1793];
		}
		int[] is = new int[vertexCount];
		int[] is_18_ = new int[anInt1765];
		int[] is_19_ = new int[vertexCount];
		int[] is_20_ = new int[vertexCount];
		int[] is_21_ = new int[3];
		vertexCount = 0;
		anInt1793 = 0;
		texturedFaceCount = 0;
		anInt1765 = 0;
		i_8_ = 0;
		i_9_ = 0;
		i_10_ = 0;
		for (int i_22_ = 0; i_22_ < i; i_22_++) {
			short i_23_ = (short) (1 << i_22_);
			BaseModel class144_24_ = class144s[i_22_];
			int i_25_ = anInt1793;
			if (class144_24_ != null) {
				boolean[] bools = new boolean[class144_24_.vertexCount];
				if (class144_24_.aClass148Array1795 != null) {
					for (int i_26_ = 0; i_26_ < class144_24_.aClass148Array1795.length; i_26_++) {
						Class148 class148 = class144_24_.aClass148Array1795[i_26_];
						aClass148Array1795[i_10_++] = class148.method3170(class148.anInt1823 * 55597925 + anInt1793);
					}
				}
				for (int i_27_ = 0; i_27_ < class144_24_.anInt1793; i_27_++) {
					is_21_[0] = class144_24_.aShortArray1769[i_27_];
					is_21_[1] = class144_24_.aShortArray1770[i_27_];
					is_21_[2] = class144_24_.aShortArray1766[i_27_];
					for (int i_28_ = 0; i_28_ < 3; i_28_++) {
						int i_29_ = is_21_[i_28_];
						int i_30_ = class144_24_.vertexX[i_29_];
						int i_31_ = class144_24_.vertexY[i_29_];
						int i_32_ = class144_24_.vertexZ[i_29_];
						int i_33_;
						for (i_33_ = 0; i_33_ < vertexCount; i_33_++) {
							if (i_30_ == vertexX[i_33_] && i_31_ == vertexY[i_33_] && i_32_ == vertexZ[i_33_]) {
								aShortArray1764[i_33_] |= i_23_;
								is_19_[i_29_] = i_33_;
								break;
							}
						}
						if (class144_24_.anInt1765 > 0 && !bools[i_29_]) {
							int i_34_ = (i_29_ < class144_24_.vertexCount - 1 ? class144_24_.anIntArray1762[i_29_ + 1]
									: class144_24_.anInt1765) - class144_24_.anIntArray1762[i_29_];
							for (int i_35_ = 0; i_35_ < i_34_; i_35_++) {
								aFloatArray1774[anInt1765] = class144_24_.aFloatArray1774[class144_24_.anIntArray1762[i_29_]
										+ i_35_];
								aFloatArray1767[anInt1765] = class144_24_.aFloatArray1767[class144_24_.anIntArray1762[i_29_]
										+ i_35_];
								is_18_[anInt1765] = i_33_ << 16 | is[i_33_] + i_35_;
								anInt1765++;
							}
							is_20_[i_29_] = is[i_33_];
							is[i_33_] += i_34_;
							bools[i_29_] = true;
						}
						if (i_33_ >= vertexCount) {
							vertexX[vertexCount] = i_30_;
							vertexY[vertexCount] = i_31_;
							vertexZ[vertexCount] = i_32_;
							aShortArray1764[vertexCount] = i_23_;
							anIntArray1763[vertexCount] = class144_24_.anIntArray1763 != null ? class144_24_.anIntArray1763[i_29_]
									: -1;
							is_19_[i_29_] = vertexCount;
							vertexCount++;
						}
					}
				}
				for (int i_36_ = 0; i_36_ < class144_24_.anInt1793; i_36_++) {
					if (bool && class144_24_.aByteArray1775 != null) {
						aByteArray1775[anInt1793] = class144_24_.aByteArray1775[i_36_];
					}
					if (bool_11_) {
						if (class144_24_.aByteArray1790 != null) {
							aByteArray1790[anInt1793] = class144_24_.aByteArray1790[i_36_];
						} else {
							aByteArray1790[anInt1793] = class144_24_.aByte1782;
						}
					}
					if (bool_12_ && class144_24_.aByteArray1788 != null) {
						aByteArray1788[anInt1793] = class144_24_.aByteArray1788[i_36_];
					}
					if (bool_14_) {
						if (class144_24_.aShortArray1780 != null) {
							aShortArray1780[anInt1793] = class144_24_.aShortArray1780[i_36_];
						} else {
							aShortArray1780[anInt1793] = (short) -1;
						}
					}
					if (bool_15_) {
						if (class144_24_.anIntArray1781 != null) {
							anIntArray1781[anInt1793] = class144_24_.anIntArray1781[i_36_];
						} else {
							anIntArray1781[anInt1793] = -1;
						}
					}
					if (class144_24_.anInt1765 > 0) {
						aByteArray1772[anInt1793] = (byte) (class144_24_.aByteArray1772[i_36_] + is_20_[class144_24_.aShortArray1769[i_36_]]);
						aByteArray1773[anInt1793] = (byte) (class144_24_.aByteArray1773[i_36_] + is_20_[class144_24_.aShortArray1770[i_36_]]);
						aByteArray1758[anInt1793] = (byte) (class144_24_.aByteArray1758[i_36_] + is_20_[class144_24_.aShortArray1766[i_36_]]);
					}
					aShortArray1769[anInt1793] = (short) is_19_[class144_24_.aShortArray1769[i_36_]];
					aShortArray1770[anInt1793] = (short) is_19_[class144_24_.aShortArray1770[i_36_]];
					aShortArray1766[anInt1793] = (short) is_19_[class144_24_.aShortArray1766[i_36_]];
					aShortArray1753[anInt1793] = i_23_;
					aShortArray1779[anInt1793] = class144_24_.aShortArray1779[i_36_];
					anInt1793++;
				}
				if (class144_24_.aClass145Array1777 != null) {
					for (int i_37_ = 0; i_37_ < class144_24_.aClass145Array1777.length; i_37_++) {
						int i_38_ = is_19_[class144_24_.aClass145Array1777[i_37_].anInt1805 * 1662200367];
						int i_39_ = is_19_[class144_24_.aClass145Array1777[i_37_].anInt1802 * -1204023687];
						int i_40_ = is_19_[class144_24_.aClass145Array1777[i_37_].anInt1806 * -1333709795];
						aClass145Array1777[i_8_] = class144_24_.aClass145Array1777[i_37_].method3138(
								class144_24_.aClass145Array1777[i_37_].anInt1804 * -15453957 + i_25_, i_38_, i_39_,
								i_40_, 2113336579);
						i_8_++;
					}
				}
				if (class144_24_.aClass115Array1800 != null) {
					for (int i_41_ = 0; i_41_ < class144_24_.aClass115Array1800.length; i_41_++) {
						int i_42_ = is_19_[class144_24_.aClass115Array1800[i_41_].anInt1439 * 1047194323];
						aClass115Array1800[i_9_] = class144_24_.aClass115Array1800[i_41_].method2062(i_42_);
						i_9_++;
					}
				}
			}
		}
		anInt1768 = vertexCount;
		if (anInt1765 > 0) {
			ArrayUtils.sort(is_18_, aFloatArray1774, aFloatArray1767);
			int i_43_ = 0;
			int i_44_ = 0;
			for (; i_43_ < vertexCount; i_43_++) {
				anIntArray1762[i_43_] = i_44_;
				i_44_ += is[i_43_];
			}
		}
		int i_45_ = 0;
		int i_46_ = 0;
		for (; i_45_ < i; i_45_++) {
			short i_47_ = (short) (1 << i_45_);
			BaseModel class144_48_ = class144s[i_45_];
			if (class144_48_ != null) {
				if (bool_13_) {
					int i_49_ = 0;
					while (i_49_ < class144_48_.anInt1793) {
						aShortArray1778[i_46_] = class144_48_.aShortArray1778 != null ? class144_48_.aShortArray1778[i_49_]
								: (short) -1;
						if (aShortArray1778[i_46_] > -1 && aShortArray1778[i_46_] < 32766) {
							aShortArray1778[i_46_] = (short) (aShortArray1778[i_46_] + texturedFaceCount);
						}
						i_49_++;
						i_46_++;
					}
				}
				for (int i_50_ = 0; i_50_ < class144_48_.texturedFaceCount; i_50_++) {
					byte i_51_ = aByteArray1787[texturedFaceCount] = class144_48_.aByteArray1787[i_50_];
					if (i_51_ == 0) {
						aShortArray1785[texturedFaceCount] = (short) method3088(class144_48_,
								class144_48_.aShortArray1785[i_50_], i_47_);
						aShortArray1789[texturedFaceCount] = (short) method3088(class144_48_,
								class144_48_.aShortArray1789[i_50_], i_47_);
						aShortArray1801[texturedFaceCount] = (short) method3088(class144_48_,
								class144_48_.aShortArray1801[i_50_], i_47_);
					} else if (i_51_ >= 1 && i_51_ <= 3) {
						aShortArray1785[texturedFaceCount] = class144_48_.aShortArray1785[i_50_];
						aShortArray1789[texturedFaceCount] = class144_48_.aShortArray1789[i_50_];
						aShortArray1801[texturedFaceCount] = class144_48_.aShortArray1801[i_50_];
						anIntArray1791[texturedFaceCount] = class144_48_.anIntArray1791[i_50_];
						anIntArray1792[texturedFaceCount] = class144_48_.anIntArray1792[i_50_];
						anIntArray1760[texturedFaceCount] = class144_48_.anIntArray1760[i_50_];
						aByteArray1799[texturedFaceCount] = class144_48_.aByteArray1799[i_50_];
						aByteArray1798[texturedFaceCount] = class144_48_.aByteArray1798[i_50_];
						anIntArray1794[texturedFaceCount] = class144_48_.anIntArray1794[i_50_];
					} else if (i_51_ == 2) {
						anIntArray1757[texturedFaceCount] = class144_48_.anIntArray1757[i_50_];
						anIntArray1796[texturedFaceCount] = class144_48_.anIntArray1796[i_50_];
					}
					texturedFaceCount++;
				}
			}
		}
	}

	public BaseModel(int i, int i_6_, int i_7_) {
		anInt1768 = 0;
		anInt1793 = 0;
		aByte1782 = (byte) 0;
		texturedFaceCount = 0;
		vertexX = new int[i];
		vertexY = new int[i];
		vertexZ = new int[i];
		anIntArray1763 = new int[i];
		aShortArray1769 = new short[i_6_];
		aShortArray1770 = new short[i_6_];
		aShortArray1766 = new short[i_6_];
		aByteArray1775 = new byte[i_6_];
		aByteArray1790 = new byte[i_6_];
		aByteArray1788 = new byte[i_6_];
		aShortArray1778 = new short[i_6_];
		aShortArray1779 = new short[i_6_];
		aShortArray1780 = new short[i_6_];
		anIntArray1781 = new int[i_6_];
		if (i_7_ > 0) {
			aByteArray1787 = new byte[i_7_];
			aShortArray1785 = new short[i_7_];
			aShortArray1789 = new short[i_7_];
			aShortArray1801 = new short[i_7_];
			anIntArray1791 = new int[i_7_];
			anIntArray1792 = new int[i_7_];
			anIntArray1760 = new int[i_7_];
			aByteArray1799 = new byte[i_7_];
			aByteArray1798 = new byte[i_7_];
			anIntArray1794 = new int[i_7_];
			anIntArray1757 = new int[i_7_];
			anIntArray1796 = new int[i_7_];
		}
	}

	public int method3089(int i, int i_52_, int i_53_) {
		for (int i_54_ = 0; i_54_ < vertexCount; i_54_++) {
			if (vertexX[i_54_] == i && vertexY[i_54_] == i_52_ && vertexZ[i_54_] == i_53_) {
				return i_54_;
			}
		}
		vertexX[vertexCount] = i;
		vertexY[vertexCount] = i_52_;
		vertexZ[vertexCount] = i_53_;
		anInt1768 = vertexCount + 1;
		return vertexCount++;
	}

	public int[][] method3092() {
		int[] is = new int[256];
		int i = 0;
		for (int i_70_ = 0; i_70_ < anInt1793; i_70_++) {
			int i_71_ = anIntArray1781[i_70_];
			if (i_71_ >= 0) {
				is[i_71_]++;
				if (i_71_ > i) {
					i = i_71_;
				}
			}
		}
		int[][] is_72_ = new int[i + 1][];
		for (int i_73_ = 0; i_73_ <= i; i_73_++) {
			is_72_[i_73_] = new int[is[i_73_]];
			is[i_73_] = 0;
		}
		for (int i_74_ = 0; i_74_ < anInt1793; i_74_++) {
			int i_75_ = anIntArray1781[i_74_];
			if (i_75_ >= 0) {
				is_72_[i_75_][is[i_75_]++] = i_74_;
			}
		}
		return is_72_;
	}

	public byte method3094(short i, short i_76_, short i_77_) {
		if (texturedFaceCount >= 255) {
			throw new IllegalStateException();
		}
		aByteArray1787[texturedFaceCount] = (byte) 0;
		aShortArray1785[texturedFaceCount] = i;
		aShortArray1789[texturedFaceCount] = i_76_;
		aShortArray1801[texturedFaceCount] = i_77_;
		return (byte) texturedFaceCount++;
	}

	public int[][] method3096(boolean bool) {
		int[] is = new int[400];
		int i = 0;
		int i_78_ = bool ? vertexCount : anInt1768;
		for (int i_79_ = 0; i_79_ < i_78_; i_79_++) {
			int i_80_ = anIntArray1763[i_79_];
			if (i_80_ >= 0) {
				is[i_80_]++;
				if (i_80_ > i) {
					i = i_80_;
				}
			}
		}
		int[][] is_81_ = new int[i + 1][];
		for (int i_82_ = 0; i_82_ <= i; i_82_++) {
			is_81_[i_82_] = new int[is[i_82_]];
			is[i_82_] = 0;
		}
		for (int i_83_ = 0; i_83_ < i_78_; i_83_++) {
			int i_84_ = anIntArray1763[i_83_];
			if (i_84_ >= 0) {
				is_81_[i_84_][is[i_84_]++] = i_83_;
			}
		}
		return is_81_;
	}

	public int[][] method3098() {
		int[] is = new int[256];
		int i = 0;
		for (Class148 element : aClass148Array1795) {
			int i_86_ = element.anInt1826 * -1751238061;
			if (i_86_ >= 0) {
				is[i_86_]++;
				if (i_86_ > i) {
					i = i_86_;
				}
			}
		}
		int[][] is_87_ = new int[i + 1][];
		for (int i_88_ = 0; i_88_ <= i; i_88_++) {
			is_87_[i_88_] = new int[is[i_88_]];
			is[i_88_] = 0;
		}
		for (int i_89_ = 0; i_89_ < aClass148Array1795.length; i_89_++) {
			int i_90_ = aClass148Array1795[i_89_].anInt1826 * -1751238061;
			if (i_90_ >= 0) {
				is_87_[i_90_][is[i_90_]++] = i_89_;
			}
		}
		return is_87_;
	}

	public void recolour(short original, short replacement) {
		for (int index = 0; index < anInt1793; index++) {
			if (aShortArray1779[index] == original) {
				aShortArray1779[index] = replacement;
			}
		}
	}

	public void retexture(short original, short replacement) {
		if (aShortArray1780 != null) {
			for (int index = 0; index < anInt1793; index++) {
				if (aShortArray1780[index] == original) {
					aShortArray1780[index] = replacement;
				}
			}
		}
	}

	public void translate(int dx, int dy, int dz) {
		for (int index = 0; index < vertexCount; index++) {
			vertexX[index] += dx;
			vertexY[index] += dy;
			vertexZ[index] += dz;
		}
	}

	public void method3102(int i, int i_98_, int i_99_) {
		if (i_99_ != 0) {
			int i_100_ = Class373.SINE[i_99_];
			int i_101_ = Class373.COSINE[i_99_];
			for (int i_102_ = 0; i_102_ < vertexCount; i_102_++) {
				int i_103_ = vertexY[i_102_] * i_100_ + vertexX[i_102_] * i_101_ >> 14;
				vertexY[i_102_] = vertexY[i_102_] * i_101_ - vertexX[i_102_] * i_100_ >> 14;
				vertexX[i_102_] = i_103_;
			}
		}
		if (i != 0) {
			int i_104_ = Class373.SINE[i];
			int i_105_ = Class373.COSINE[i];
			for (int i_106_ = 0; i_106_ < vertexCount; i_106_++) {
				int i_107_ = vertexY[i_106_] * i_105_ - vertexZ[i_106_] * i_104_ >> 14;
				vertexZ[i_106_] = vertexY[i_106_] * i_104_ + vertexZ[i_106_] * i_105_ >> 14;
				vertexY[i_106_] = i_107_;
			}
		}
		if (i_98_ != 0) {
			int i_108_ = Class373.SINE[i_98_];
			int i_109_ = Class373.COSINE[i_98_];
			for (int i_110_ = 0; i_110_ < vertexCount; i_110_++) {
				int i_111_ = vertexZ[i_110_] * i_108_ + vertexX[i_110_] * i_109_ >> 14;
				vertexZ[i_110_] = vertexZ[i_110_] * i_109_ - vertexX[i_110_] * i_108_ >> 14;
				vertexX[i_110_] = i_111_;
			}
		}
	}

	public void method3103(int i) {
		for (int vertex = 0; vertex < vertexCount; vertex++) {
			vertexX[vertex] <<= i;
			vertexY[vertex] <<= i;
			vertexZ[vertex] <<= i;
		}

		if (texturedFaceCount > 0 && anIntArray1791 != null) {
			for (int i_113_ = 0; i_113_ < anIntArray1791.length; i_113_++) {
				anIntArray1791[i_113_] <<= i;
				anIntArray1792[i_113_] <<= i;

				if (aByteArray1787[i_113_] != 1) {
					anIntArray1760[i_113_] <<= i;
				}
			}
		}
	}

	public int method3114(int i, int i_114_, int i_115_, byte i_116_, byte i_117_, short i_118_, byte i_119_,
			short i_120_) {
		aShortArray1769[anInt1793] = (short) i;
		aShortArray1770[anInt1793] = (short) i_114_;
		aShortArray1766[anInt1793] = (short) i_115_;
		aByteArray1775[anInt1793] = i_116_;
		aShortArray1778[anInt1793] = i_117_;
		aShortArray1779[anInt1793] = i_118_;
		aByteArray1788[anInt1793] = i_119_;
		aShortArray1780[anInt1793] = i_120_;
		return anInt1793++;
	}

	public byte method3124(short i, short i_121_, short i_122_, short i_123_, short i_124_, short i_125_, byte i_126_,
			byte i_127_, byte i_128_) {
		if (texturedFaceCount >= 255) {
			throw new IllegalStateException();
		}

		aByteArray1787[texturedFaceCount] = (byte) 3;
		aShortArray1785[texturedFaceCount] = i;
		aShortArray1789[texturedFaceCount] = i_121_;
		aShortArray1801[texturedFaceCount] = i_122_;
		anIntArray1791[texturedFaceCount] = i_123_;
		anIntArray1792[texturedFaceCount] = i_124_;
		anIntArray1760[texturedFaceCount] = i_125_;
		aByteArray1799[texturedFaceCount] = i_126_;
		aByteArray1798[texturedFaceCount] = i_127_;
		anIntArray1794[texturedFaceCount] = i_128_;
		return (byte) texturedFaceCount++;
	}

	public void method3125(float f) {
		for (int i = 0; i < vertexCount; i++) {
			vertexX[i] *= f;
			vertexY[i] *= f;
			vertexZ[i] *= f;
		}
		if (texturedFaceCount > 0 && anIntArray1791 != null) {
			for (int i = 0; i < anIntArray1791.length; i++) {
				anIntArray1791[i] *= f;
				anIntArray1792[i] *= f;
				if (aByteArray1787[i] != 1) {
					anIntArray1760[i] *= f;
				}
			}
		}
	}

	final int method3088(BaseModel class144_0_, int i, short i_1_) {
		int i_2_ = class144_0_.vertexX[i];
		int i_3_ = class144_0_.vertexY[i];
		int i_4_ = class144_0_.vertexZ[i];
		for (int i_5_ = 0; i_5_ < vertexCount; i_5_++) {
			if (i_2_ == vertexX[i_5_] && i_3_ == vertexY[i_5_] && i_4_ == vertexZ[i_5_]) {
				aShortArray1764[i_5_] |= i_1_;
				return i_5_;
			}
		}
		vertexX[vertexCount] = i_2_;
		vertexY[vertexCount] = i_3_;
		vertexZ[vertexCount] = i_4_;
		aShortArray1764[vertexCount] = i_1_;
		anIntArray1763[vertexCount] = class144_0_.anIntArray1763 != null ? class144_0_.anIntArray1763[i] : -1;
		return vertexCount++;
	}

	void method3090(Buffer buffer, Buffer buffer_55_, Buffer buffer_56_) {
		short i = 0;
		short i_57_ = 0;
		short i_58_ = 0;
		int i_59_ = 0;
		for (int i_60_ = 0; i_60_ < anInt1793; i_60_++) {
			int i_61_ = buffer_55_.readUByte();
			int i_62_ = i_61_ & 0x7;
			if (i_62_ == 1) {
				aShortArray1769[i_60_] = i = (short) (buffer.readSmart() + i_59_);
				i_59_ = i;
				aShortArray1770[i_60_] = i_57_ = (short) (buffer.readSmart() + i_59_);
				i_59_ = i_57_;
				aShortArray1766[i_60_] = i_58_ = (short) (buffer.readSmart() + i_59_);
				i_59_ = i_58_;
				if (i > anInt1768) {
					anInt1768 = i;
				}
				if (i_57_ > anInt1768) {
					anInt1768 = i_57_;
				}
				if (i_58_ > anInt1768) {
					anInt1768 = i_58_;
				}
			}
			if (i_62_ == 2) {
				i_57_ = i_58_;
				i_58_ = (short) (buffer.readSmart() + i_59_);
				i_59_ = i_58_;
				aShortArray1769[i_60_] = i;
				aShortArray1770[i_60_] = i_57_;
				aShortArray1766[i_60_] = i_58_;
				if (i_58_ > anInt1768) {
					anInt1768 = i_58_;
				}
			}
			if (i_62_ == 3) {
				i = i_58_;
				i_58_ = (short) (buffer.readSmart() + i_59_);
				i_59_ = i_58_;
				aShortArray1769[i_60_] = i;
				aShortArray1770[i_60_] = i_57_;
				aShortArray1766[i_60_] = i_58_;
				if (i_58_ > anInt1768) {
					anInt1768 = i_58_;
				}
			}
			if (i_62_ == 4) {
				short i_63_ = i;
				i = i_57_;
				i_57_ = i_63_;
				i_58_ = (short) (buffer.readSmart() + i_59_);
				i_59_ = i_58_;
				aShortArray1769[i_60_] = i;
				aShortArray1770[i_60_] = i_57_;
				aShortArray1766[i_60_] = i_58_;
				if (i_58_ > anInt1768) {
					anInt1768 = i_58_;
				}
			}
			if (anInt1765 > 0 && (i_61_ & 0x8) != 0) {
				aByteArray1772[i_60_] = (byte) buffer_56_.readUByte();
				aByteArray1773[i_60_] = (byte) buffer_56_.readUByte();
				aByteArray1758[i_60_] = (byte) buffer_56_.readUByte();
			}
		}
		anInt1768++;
	}

	void method3091(Buffer buffer, Buffer buffer_64_, Buffer buffer_65_, Buffer buffer_66_, Buffer buffer_67_,
			Buffer buffer_68_) {
		for (int i = 0; i < texturedFaceCount; i++) {
			int i_69_ = aByteArray1787[i] & 0xff;
			if (i_69_ == 0) {
				aShortArray1785[i] = (short) buffer.readUShort();
				aShortArray1789[i] = (short) buffer.readUShort();
				aShortArray1801[i] = (short) buffer.readUShort();
			}
			if (i_69_ == 1) {
				aShortArray1785[i] = (short) buffer_64_.readUShort();
				aShortArray1789[i] = (short) buffer_64_.readUShort();
				aShortArray1801[i] = (short) buffer_64_.readUShort();
				if (version < 15) {
					anIntArray1791[i] = buffer_65_.readUShort();
					if (version < 14) {
						anIntArray1792[i] = buffer_65_.readUShort();
					} else {
						anIntArray1792[i] = buffer_65_.readUTriByte();
					}
					anIntArray1760[i] = buffer_65_.readUShort();
				} else {
					anIntArray1791[i] = buffer_65_.readUTriByte();
					anIntArray1792[i] = buffer_65_.readUTriByte();
					anIntArray1760[i] = buffer_65_.readUTriByte();
				}
				aByteArray1799[i] = buffer_66_.readByte();
				aByteArray1798[i] = buffer_67_.readByte();
				anIntArray1794[i] = buffer_68_.readByte();
			}
			if (i_69_ == 2) {
				aShortArray1785[i] = (short) buffer_64_.readUShort();
				aShortArray1789[i] = (short) buffer_64_.readUShort();
				aShortArray1801[i] = (short) buffer_64_.readUShort();
				if (version < 15) {
					anIntArray1791[i] = buffer_65_.readUShort();
					if (version < 14) {
						anIntArray1792[i] = buffer_65_.readUShort();
					} else {
						anIntArray1792[i] = buffer_65_.readUTriByte();
					}
					anIntArray1760[i] = buffer_65_.readUShort();
				} else {
					anIntArray1791[i] = buffer_65_.readUTriByte();
					anIntArray1792[i] = buffer_65_.readUTriByte();
					anIntArray1760[i] = buffer_65_.readUTriByte();
				}
				aByteArray1799[i] = buffer_66_.readByte();
				aByteArray1798[i] = buffer_67_.readByte();
				anIntArray1794[i] = buffer_68_.readByte();
				anIntArray1757[i] = buffer_68_.readByte();
				anIntArray1796[i] = buffer_68_.readByte();
			}
			if (i_69_ == 3) {
				aShortArray1785[i] = (short) buffer_64_.readUShort();
				aShortArray1789[i] = (short) buffer_64_.readUShort();
				aShortArray1801[i] = (short) buffer_64_.readUShort();
				if (version < 15) {
					anIntArray1791[i] = buffer_65_.readUShort();
					if (version < 14) {
						anIntArray1792[i] = buffer_65_.readUShort();
					} else {
						anIntArray1792[i] = buffer_65_.readUTriByte();
					}
					anIntArray1760[i] = buffer_65_.readUShort();
				} else {
					anIntArray1791[i] = buffer_65_.readUTriByte();
					anIntArray1792[i] = buffer_65_.readUTriByte();
					anIntArray1760[i] = buffer_65_.readUTriByte();
				}
				aByteArray1799[i] = buffer_66_.readByte();
				aByteArray1798[i] = buffer_67_.readByte();
				anIntArray1794[i] = buffer_68_.readByte();
			}
		}
	}
}
