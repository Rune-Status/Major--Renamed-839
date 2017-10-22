package com.jagex;

import java.io.File;
import java.io.RandomAccessFile;

public class Class558 {
	public static Font p11Full;

	public static File openRwFile(String string) {
		if (!Class471.aBool6533) {
			throw new RuntimeException("");
		}

		File cached = (File) Class471.readWriteFileCache.get(string);
		if (null != cached) {
			return cached;
		}

		File file = new File(Class471.aFile6534, string);
		RandomAccessFile raf = null;

		try {
			File parent = new File(file.getParent());
			if (!parent.exists()) {
				throw new RuntimeException("");
			}

			raf = new RandomAccessFile(file, "rw");
			int in = raf.read();
			raf.seek(0L);
			raf.write(in);
			raf.seek(0L);
			raf.close();
			Class471.readWriteFileCache.put(string, file);
			return file;
		} catch (Exception exception) {
			try {
				if (raf != null) {
					raf.close();
				}
			} catch (Exception ex) {

			}

			throw new RuntimeException();
		}
	}

	static final void method9423() {
		FrameBuffer buffer = Client.gameConnection.buffer;
		for (int i_1_ = 0; i_1_ < Client.anInt10914 * 1947309341; i_1_++) {
			int i_2_ = Client.anIntArray10659[i_1_];
			Npc npc = (Npc) ((LinkableObject) Client.npcs.get(i_2_)).object;
			buffer.readUShort();
			int i_3_ = buffer.readUByte();
			if (0 != (i_3_ & 0x2)) {
				i_3_ += buffer.readUByte() << 8;
			}
			if ((i_3_ & 0x200) != 0) {
				i_3_ += buffer.readUByte() << 16;
			}
			if ((i_3_ & 0x200000) != 0) {
				i_3_ += buffer.readUByte() << 24;
			}
			if ((i_3_ & 0x2000000) != 0) {
				int i_4_ = buffer.readUShortA();
				int i_5_ = buffer.readLEInt();
				if (i_4_ == 65535) {
					i_4_ = -1;
				}
				int i_6_ = buffer.readUByteA();
				int i_7_ = i_6_ & 0x7;
				int i_8_ = i_6_ >> 3 & 0xf;
				if (15 == i_8_) {
					i_8_ = -1;
				}
				boolean bool = 1 == (i_6_ >> 7 & 0x1);
				npc.method18035(i_4_, i_5_, i_7_, i_8_, bool, 4);
			}
			if (0 != (i_3_ & 0x40000)) {
				int heads = npc.definition.headModels.length;
				int replacements = 0;
				if (null != npc.definition.replacementColours) {
					replacements = npc.definition.replacementColours.length;
				}

				int i_11_ = 0;
				if (null != npc.definition.replacementTextures) {
					replacements = npc.definition.replacementTextures.length;
				}

				int i_12_ = buffer.readNegatedUByte();
				if (1 != (i_12_ & 0x1)) {
					buffer.offset += -1778683038;
					int[] is = null;
					if (2 == (i_12_ & 0x2)) {
						is = new int[heads];
						for (int i_13_ = 0; i_13_ < heads; i_13_++) {
							is[i_13_] = buffer.readSmart32();
						}
					}
					short[] is_14_ = null;
					if ((i_12_ & 0x4) == 4) {
						is_14_ = new short[replacements];
						for (int i_15_ = 0; i_15_ < replacements; i_15_++) {
							is_14_[i_15_] = (short) buffer.readLEUShort();
						}
					}
					short[] is_16_ = null;
					if (8 == (i_12_ & 0x8)) {
						is_16_ = new short[i_11_];
						for (int i_17_ = 0; i_17_ < i_11_; i_17_++) {
							is_16_[i_17_] = (short) buffer.readUShort();
						}
					}
					long l = (Npc.anInt11790 += -1667568083) * -1622044251 - 1;
					new Class267(l, is, null, null, null, is_14_, is_16_);
				}
			}
			if (0 != (i_3_ & 0x400)) {
				npc.anInt11521 = buffer.readByteS() * -1909277121;
				npc.anInt11523 = buffer.readByte() * -1771102555;
				npc.anInt11527 = buffer.readByteA() * 1041051727;
				npc.anInt11524 = buffer.readByte() * -1458147119;
				npc.anInt11560 = (buffer.readLEUShort() + Client.tick) * 1321566137;
				npc.anInt11522 = (buffer.readLEUShortA() + Client.tick) * 771082565;
				npc.anInt11501 = buffer.readLEUShortA() * 1354029105;
				npc.anInt11521 += -1909277121 * npc.pathX[0];
				npc.anInt11523 += -1771102555 * npc.pathZ[0];
				npc.anInt11527 += npc.pathX[0] * 1041051727;
				npc.anInt11524 += -1458147119 * npc.pathZ[0];
				npc.pathLength = -379008433;
				npc.anInt11550 = 0;
			}
			if (0 != (i_3_ & 0x4000)) {
				int i_18_ = npc.definition.models.length;
				int i_19_ = 0;
				if (npc.definition.replacementColours != null) {
					i_19_ = npc.definition.replacementColours.length;
				}
				int i_20_ = 0;
				if (null != npc.definition.replacementTextures) {
					i_20_ = npc.definition.replacementTextures.length;
				}
				int i_21_ = buffer.readUByteA();
				if ((i_21_ & 0x1) == 1) {
					npc.aClass267_11788 = null;
				} else {
					buffer.offset += -1778683038;
					int[] is = null;
					float[] fs = null;
					int[][] is_22_ = null;
					int[][] is_23_ = null;
					if ((i_21_ & 0x2) == 2) {
						is = new int[i_18_];
						if (16 == (i_21_ & 0x10)) {
							fs = new float[i_18_];
							is_22_ = new int[i_18_][3];
							is_23_ = new int[i_18_][3];
						}
						for (int i_24_ = 0; i_24_ < i_18_; i_24_++) {
							is[i_24_] = buffer.readSmart32();
							if ((i_21_ & 0x10) == 16 && is[i_24_] != -1) {
								fs[i_24_] = buffer.readFloat();
								for (int i_25_ = 0; i_25_ < 3; i_25_++) {
									is_22_[i_24_][i_25_] = buffer.readLEShort();
								}
								for (int i_26_ = 0; i_26_ < 3; i_26_++) {
									is_23_[i_24_][i_26_] = buffer.readShort();
								}
							}
						}
					}
					short[] is_27_ = null;
					if (4 == (i_21_ & 0x4)) {
						is_27_ = new short[i_19_];
						for (int i_28_ = 0; i_28_ < i_19_; i_28_++) {
							is_27_[i_28_] = (short) buffer.readUShort();
						}
					}
					short[] is_29_ = null;
					if ((i_21_ & 0x8) == 8) {
						is_29_ = new short[i_20_];
						for (int i_30_ = 0; i_30_ < i_20_; i_30_++) {
							is_29_[i_30_] = (short) buffer.readUShort();
						}
					}
					long l = (Npc.anInt11796 += 496476511) * 306510495 - 1;
					npc.aClass267_11788 = new Class267(l, is, fs, is_22_, is_23_, is_27_, is_29_);
				}
			}
			if ((i_3_ & 0x8000) != 0) {
				int i_31_ = buffer.readNegatedUByte();
				int[] is = new int[i_31_];
				int[] is_32_ = new int[i_31_];
				for (int i_33_ = 0; i_33_ < i_31_; i_33_++) {
					int i_34_ = buffer.readLEUShortA();
					if ((i_34_ & 0xc000) == 49152) {
						int i_35_ = buffer.readUShort();
						is[i_33_] = i_34_ << 16 | i_35_;
					} else {
						is[i_33_] = i_34_;
					}
					is_32_[i_33_] = buffer.readLEUShort();
				}
				npc.method17946(is, is_32_);
			}
			if (0 != (i_3_ & 0x80)) {
				npc.anInt1180 = buffer.readUShort() * -953311613;
				if (-209575893 * npc.anInt1180 == 65535) {
					npc.anInt1180 = 953311613;
				}
			}
			if (0 != (i_3_ & 0x800)) {
				npc.anInt11801 = buffer.readUShortA() * -1977066073;
				if (65535 == -1676510697 * npc.anInt11801) {
					npc.anInt11801 = 1977066073;
				}
			}
			if (0 != (i_3_ & 0x2000)) {
				int i_36_ = buffer.readLEUShortA();
				int i_37_ = buffer.readLEInt();
				if (65535 == i_36_) {
					i_36_ = -1;
				}
				int i_38_ = buffer.readUByteA();
				int i_39_ = i_38_ & 0x7;
				int i_40_ = i_38_ >> 3 & 0xf;
				if (15 == i_40_) {
					i_40_ = -1;
				}
				boolean bool = (i_38_ >> 7 & 0x1) == 1;
				npc.method18035(i_36_, i_37_, i_39_, i_40_, bool, 1);
			}
			if (0 != (i_3_ & 0x8000000)) {
				npc.aByte11530 = buffer.readByteS();
				npc.aByte11531 = buffer.readByte();
				npc.aByte11492 = buffer.readNegatedByte(2030529681);
				npc.aByte11533 = (byte) buffer.readUByteS();
				npc.anInt11528 = (Client.tick + buffer.readUShort()) * -1044838623;
				npc.anInt11529 = (Client.tick + buffer.readLEUShortA()) * 1372621715;
			}
			if (0 != (i_3_ & 0x100000)) {
				npc.anInterface73_11556.clear();
				buffer.offset += -1778683038;
				int i_41_ = buffer.payload[(buffer.offset += 1258142129) * -165875887 - 1] & 0xff;
				for (int i_42_ = 0; i_42_ < i_41_; i_42_++) {
					int i_43_ = buffer.readNegatedUByte();
					ValueType class423 = CompressionType.findIdentifiable(ValueType.values(), i_43_);
					DefaultMapEntry class383 = Npc.varpLoader.method13919(buffer, class423);
					npc.anInterface73_11556.put(class383.key * 1960527763, class383.value);
				}
			}
			if ((i_3_ & 0x40) != 0) {
				int[] is = new int[4];
				for (int i_44_ = 0; i_44_ < 4; i_44_++) {
					is[i_44_] = buffer.readSmart32();
				}
				int i_45_ = buffer.readNegatedUByte();
				System.out.printf("NPC Animation: %d, %d%n", is[0], i_45_);
				Mob.method8795(npc, is, i_45_, true);
			}
			if ((i_3_ & 0x20) != 0) {
				npc.setMessage(buffer.readString(), 0, 0);
			}
			if (0 != (i_3_ & 0x8)) {
				int i_46_ = buffer.readUShort();
				int i_47_ = buffer.readMEInt();
				if (65535 == i_46_) {
					i_46_ = -1;
				}
				int i_48_ = buffer.readUByteA();
				int i_49_ = i_48_ & 0x7;
				int i_50_ = i_48_ >> 3 & 0xf;
				if (i_50_ == 15) {
					i_50_ = -1;
				}
				boolean bool = 1 == (i_48_ >> 7 & 0x1);
				npc.method18035(i_46_, i_47_, i_49_, i_50_, bool, 0);
			}
			if ((i_3_ & 0x10000) != 0) {
				npc.name = buffer.readString();
				if ("".equals(npc.name) || npc.name.equals(npc.definition.name)) {
					npc.name = npc.definition.name;
				}
			}
			if (0 != (i_3_ & 0x1)) {
				if (npc.definition.method5111()) {
					Class480_Sub18.method8150(npc);
				}
				npc.method18271(NpcDefinition.loader.get(buffer.readSmart32()), (i_3_ & 0x10000) == 0,
						0 == (i_3_ & 0x20000), true);
				npc.setBoundSize(2117527163 * npc.definition.boundSize);
				npc.anInt11540 = 2036386683 * (1704389047 * npc.definition.contrast << 3);
				if (npc.definition.method5111()) {
					Class262.method4972(npc.plane, npc.pathX[0], npc.pathZ[0], 0, null, npc, null);
				}
			}
			if ((i_3_ & 0x80000) != 0) {
				int i_51_ = buffer.payload[(buffer.offset += 1258142129) * -165875887 - 1] & 0xff;
				for (int i_52_ = 0; i_52_ < i_51_; i_52_++) {
					int i_53_ = buffer.readUByteA();
					int i_54_ = buffer.readInt();
					int i_55_ = buffer.readUTriByte();
					npc.method18273(i_53_, i_54_, i_55_, 1841827045);
				}
			}
			if (0 != (i_3_ & 0x10000000)) {
				npc.anInt11800 = buffer.readNegatedUByte() * 983876897;
			}
			if ((i_3_ & 0x4000000) != 0) {
				int i_56_ = buffer.readLEUShort();
				int i_57_ = buffer.readMEInt();
				if (65535 == i_56_) {
					i_56_ = -1;
				}
				int i_58_ = buffer.readUByte();
				int i_59_ = i_58_ & 0x7;
				int i_60_ = i_58_ >> 3 & 0xf;
				if (i_60_ == 15) {
					i_60_ = -1;
				}
				boolean bool = 1 == (i_58_ >> 7 & 0x1);
				npc.method18035(i_56_, i_57_, i_59_, i_60_, bool, 3);
			}
			if (0 != (i_3_ & 0x400000)) {
				buffer.offset += -1778683038;
				int i_61_ = buffer.payload[(buffer.offset += 1258142129) * -165875887 - 1] & 0xff;
				for (int i_62_ = 0; i_62_ < i_61_; i_62_++) {
					int i_63_ = buffer.readUByteS();
					ValueType class423 = CompressionType.findIdentifiable(ValueType.values(), i_63_);
					DefaultMapEntry class383 = Npc.varpLoader.method13919(buffer, class423);
					npc.anInterface73_11556.put(class383.key * 1960527763, class383.value);
				}
			}
			if (0 != (i_3_ & 0x4)) {
				int i_64_ = buffer.readUByteS();
				if (i_64_ > 0) {
					for (int i_65_ = 0; i_65_ < i_64_; i_65_++) {
						int i_66_ = -1;
						int i_67_ = -1;
						int i_68_ = -1;
						int i_69_ = buffer.readUSmart();
						if (32767 == i_69_) {
							i_69_ = buffer.readUSmart();
							i_67_ = buffer.readUSmart();
							i_66_ = buffer.readUSmart();
							i_68_ = buffer.readUSmart();
						} else if (i_69_ != 32766) {
							i_67_ = buffer.readUSmart();
						} else {
							i_69_ = -1;
							i_67_ = buffer.readUByteA();
						}
						int i_70_ = buffer.readUSmart();
						npc.hit(i_69_, i_67_, i_66_, i_68_, Client.tick, i_70_);
					}
				}
				int i_71_ = buffer.readUByteS();
				if (i_71_ > 0) {
					for (int i_72_ = 0; i_72_ < i_71_; i_72_++) {
						int i_73_ = buffer.readUSmart();
						int i_74_ = buffer.readUSmart();
						if (32767 != i_74_) {
							int i_75_ = buffer.readUSmart();
							int i_76_ = buffer.readNegatedUByte();
							int i_77_ = i_74_ > 0 ? buffer.readUByteS() : i_76_;
							npc.method17952(i_73_, Client.tick, i_74_, i_75_, i_76_, i_77_);
						} else {
							npc.method17953(i_73_);
						}
					}
				}
			}
			if (0 != (i_3_ & 0x800000)) {
				int i_78_ = buffer.readNegatedUByte();
				int[] is = new int[8];
				short[] is_79_ = new short[8];
				for (int i_80_ = 0; i_80_ < 8; i_80_++) {
					if ((i_78_ & 1 << i_80_) != 0) {
						is[i_80_] = buffer.readSmart32();
						is_79_[i_80_] = (short) buffer.readDecrSmart();
					} else {
						is[i_80_] = -1;
						is_79_[i_80_] = (short) -1;
					}
				}
				npc.aClass265_11793 = new Class265(is, is_79_);
			}
			if (0 != (i_3_ & 0x10)) {
				npc.anInt11786 = buffer.readUShort() * 1454304083;
				npc.anInt11787 = buffer.readLEUShortA() * -28936887;
			}
			if ((i_3_ & 0x20000) != 0) {
				npc.combat = buffer.readLEUShort() * -311822591;
				if (2011629825 * npc.combat == 65535) {
					npc.combat = 1050562515 * npc.definition.combat;
				}
			}
			if ((i_3_ & 0x1000000) != 0) {
				int i_81_ = buffer.readUShort();
				int i_82_ = buffer.readInt();
				if (65535 == i_81_) {
					i_81_ = -1;
				}
				int i_83_ = buffer.readUByteS();
				int i_84_ = i_83_ & 0x7;
				int i_85_ = i_83_ >> 3 & 0xf;
				if (15 == i_85_) {
					i_85_ = -1;
				}
				boolean bool = (i_83_ >> 7 & 0x1) == 1;
				npc.method18035(i_81_, i_82_, i_84_, i_85_, bool, 2);
			}
			if (0 != (i_3_ & 0x100)) {
				int i_86_ = buffer.readNegatedUByte();
				int[] is = new int[i_86_];
				int[] is_87_ = new int[i_86_];
				int[] is_88_ = new int[i_86_];
				for (int i_89_ = 0; i_89_ < i_86_; i_89_++) {
					int i_90_ = buffer.readSmart32();
					is[i_89_] = i_90_;
					is_87_[i_89_] = buffer.readNegatedUByte();
					is_88_[i_89_] = buffer.readUShortA();
				}
				Class166_Sub14.method15118(npc, is, is_87_, is_88_);
			}
		}
	}

	public InputSubscriber subscriber;

	public Class558(Archive defaults) {
		byte[] data = defaults.get(-1881625811 * Class577.aClass577_7733.file);
		if (data != null) {
			decode(new Buffer(data));
		}
	}

	void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			if (opcode == 1) {
				subscriber = InputSubscriberUtils.decode(buffer);
			}
		}
	}

}