package com.jagex;

import java.util.Arrays;
import java.util.Iterator;

public class Class515 implements Interface71, Definition {
	public static String aString7059;

	public static final int method8841(int i, int i_30_, int x, int z, int i_33_) {
		if (Client.aClass460_10760.method7687() == null) {
			return 0;
		}

		if (i_33_ < 3) {
			TileFlags flags = Client.aClass460_10760.method7775();
			int i_35_ = i >> 9;
			int i_36_ = i_30_ >> 9;

			if (x < 0 || z < 0 || x > Client.aClass460_10760.method7680() - 1
					|| z > Client.aClass460_10760.method7707() - 1) {
				return 0;
			}

			if (i_35_ < 1 || i_36_ < 1 || i_35_ > Client.aClass460_10760.method7680() - 1
					|| i_36_ > Client.aClass460_10760.method7707() - 1) {
				return 0;
			}

			boolean bool = (flags.flags[1][i >> 9][i_30_ >> 9] & 0x2) != 0;
			if ((i & 0x1ff) == 0) {
				boolean bool_37_ = (flags.flags[1][i_35_ - 1][i_30_ >> 9] & 0x2) != 0;
				boolean bool_38_ = (flags.flags[1][i_35_][i_30_ >> 9] & 0x2) != 0;

				if (bool_38_ != bool_37_) {
					bool = (flags.flags[1][x][z] & 0x2) != 0;
				}
			}

			if (0 == (i_30_ & 0x1ff)) {
				boolean bool_39_ = 0 != (flags.flags[1][i >> 9][i_36_ - 1] & 0x2);
				boolean bool_40_ = (flags.flags[1][i >> 9][i_36_] & 0x2) != 0;

				if (bool_40_ != bool_39_) {
					bool = 0 != (flags.flags[1][x][z] & 0x2);
				}
			}

			if (bool) {
				i_33_++;
			}
		}

		return Client.aClass460_10760.method7687().aClass120Array6700[i_33_].averageHeight(i, i_30_);
	}

	public boolean aBool7015;
	public int[] anIntArray7016;
	public int[] anIntArray7017;
	int anInt7018;
	public int anInt7019;
	public int anInt7020;
	public int anInt7021;
	public int anInt7022;
	public int anInt7023;
	public int anInt7024;
	public int anInt7025;
	public int[] anIntArray7026;
	public int anInt7027;
	public int anInt7028;
	public int anInt7029 = 1705714773;
	public int anInt7030;
	public int anInt7031;
	public int anInt7032;
	public int anInt7033;
	public int anInt7034;
	public int anInt7035;
	public int anInt7036;
	public int anInt7037;
	public int anInt7038;
	public int anInt7039;
	public int anInt7040;
	public int anInt7041;
	public int anInt7042;
	public int[][] anIntArrayArray7043;
	public int[][] anIntArrayArray7044;
	Class405[] aClass405Array7045;
	public int anInt7046;
	public int[] anIntArray7047;
	public int anInt7048;
	public int anInt7049;
	public int anInt7050;
	public int anInt7051;
	public int anInt7052;
	public int anInt7053;
	public int anInt7054;
	public int anInt7055;
	public int anInt7056;
	public int anInt7057;
	public int anInt7058;

	Class515() {
		anInt7050 = 1414672449;
		anInt7046 = 763324837;
		anInt7049 = 686492291;
		anInt7022 = -580756705;
		anInt7023 = -244085633;
		anInt7024 = 1922576913;
		anInt7025 = 1823861335;
		anInt7055 = 1559108225;
		anInt7027 = -1514541645;
		anInt7021 = 571655017;
		anInt7020 = 975933765;
		anInt7030 = 71279391;
		anInt7031 = -353089243;
		anInt7032 = -630548857;
		anInt7033 = -649264179;
		anInt7034 = -1523398921;
		anInt7035 = 90419181;
		anInt7036 = -1803648275;
		anInt7041 = -149957895;
		anInt7038 = 737047923;
		anInt7056 = 577377011;
		anInt7057 = 379735359;
		aBool7015 = true;
	}

	Class515(int i) {
		anInt7050 = 1414672449;
		anInt7046 = 763324837;
		anInt7049 = 686492291;
		anInt7022 = -580756705;
		anInt7023 = -244085633;
		anInt7024 = 1922576913;
		anInt7025 = 1823861335;
		anInt7055 = 1559108225;
		anInt7027 = -1514541645;
		anInt7021 = 571655017;
		anInt7020 = 975933765;
		anInt7030 = 71279391;
		anInt7031 = -353089243;
		anInt7032 = -630548857;
		anInt7033 = -649264179;
		anInt7034 = -1523398921;
		anInt7035 = 90419181;
		anInt7036 = -1803648275;
		anInt7041 = -149957895;
		anInt7038 = 737047923;
		anInt7056 = 577377011;
		anInt7057 = 379735359;
		aBool7015 = true;
	}

	@Override
	public void method35() {

	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	@Override
	public void method40(int i) {

	}

	@Override
	public void setId(int id) {

	}

	public int method8824() {
		if (-1 != -885045501 * anInt7029) {
			return -885045501 * anInt7029;
		} else if (anIntArray7016 != null) {
			int i_12_ = (int) (Math.random() * (anInt7018 * 999362835));
			int i_13_;

			for (i_13_ = 0; i_12_ >= anIntArray7017[i_13_]; i_13_++) {
				i_12_ -= anIntArray7017[i_13_];
			}

			return anIntArray7016[i_13_];
		}

		return -1;
	}

	public Class405[] method8826() {
		if (aClass405Array7045 != null) {
			return aClass405Array7045;
		} else if (null == anIntArrayArray7043) {
			return null;
		}

		aClass405Array7045 = new Class405[anIntArrayArray7043.length];
		for (int i_14_ = 0; i_14_ < anIntArrayArray7043.length; i_14_++) {
			int i_15_ = 0;
			int i_16_ = 0;
			int i_17_ = 0;
			int i_18_ = 0;
			int i_19_ = 0;
			int i_20_ = 0;

			if (anIntArrayArray7043[i_14_] != null) {
				i_15_ = anIntArrayArray7043[i_14_][0];
				i_16_ = anIntArrayArray7043[i_14_][1];
				i_17_ = anIntArrayArray7043[i_14_][2];
				i_18_ = anIntArrayArray7043[i_14_][3] << 3;
				i_19_ = anIntArrayArray7043[i_14_][4] << 3;
				i_20_ = anIntArrayArray7043[i_14_][5] << 3;
			}

			if (i_15_ != 0 || 0 != i_16_ || i_17_ != 0 || 0 != i_18_ || i_19_ != 0 || 0 != i_20_) {
				Class405 class405 = aClass405Array7045[i_14_] = new Class405();
				if (i_20_ != 0) {
					class405.method6739(0.0F, 0.0F, 1.0F, Class373.method6114(i_20_));
				}

				if (i_18_ != 0) {
					class405.method6739(1.0F, 0.0F, 0.0F, Class373.method6114(i_18_));
				}

				if (i_19_ != 0) {
					class405.method6739(0.0F, 1.0F, 0.0F, Class373.method6114(i_19_));
				}

				class405.method6744(i_15_, i_16_, i_17_);
			}
		}

		return aClass405Array7045;
	}

	public int[] method8827() {
		HashTable<Linkable> table = new HashTable(16);
		HashTable.insertEmpty(table, anInt7029 * -885045501);

		if (null != anIntArray7016) {
			int[] is = anIntArray7016;
			for (int key : is) {
				HashTable.insertEmpty(table, key);
			}
		}

		HashTable.insertEmpty(table, -901898177 * anInt7050);
		HashTable.insertEmpty(table, anInt7046 * 1172744659);
		HashTable.insertEmpty(table, anInt7049 * 619637717);
		HashTable.insertEmpty(table, anInt7022 * 587636513);
		HashTable.insertEmpty(table, -894448511 * anInt7023);
		HashTable.insertEmpty(table, anInt7024 * -1078787825);
		HashTable.insertEmpty(table, -272802151 * anInt7025);
		HashTable.insertEmpty(table, 902814335 * anInt7055);
		HashTable.insertEmpty(table, 2085451397 * anInt7027);
		HashTable.insertEmpty(table, 1992950567 * anInt7021);
		HashTable.insertEmpty(table, -1451252109 * anInt7020);
		HashTable.insertEmpty(table, anInt7030 * 671475489);
		HashTable.insertEmpty(table, anInt7031 * 1418155347);
		HashTable.insertEmpty(table, anInt7032 * -1068126007);
		HashTable.insertEmpty(table, anInt7033 * 1786273531);
		HashTable.insertEmpty(table, anInt7034 * 982525241);
		HashTable.insertEmpty(table, anInt7035 * -343148005);
		HashTable.insertEmpty(table, anInt7036 * -25307877);
		HashTable.insertEmpty(table, anInt7041 * 739094711);
		HashTable.insertEmpty(table, -1928968123 * anInt7038);

		int[] is = new int[table.size()];
		int i_23_ = 0;
		Iterator<Linkable> iterator = table.iterator();

		while (iterator.hasNext()) {
			Linkable linkable = iterator.next();
			is[i_23_++] = (int) (linkable.linkedKey * -4821875126325281949L);
		}

		return is;
	}

	public boolean method8829(int i) {
		if (-1 == i) {
			return false;
		} else if (i == -885045501 * anInt7029) {
			return true;
		}

		if (null != anIntArray7016) {
			for (int element : anIntArray7016) {
				if (element == i) {
					return true;
				}
			}
		}

		return false;
	}

	void decode(Buffer buffer, int opcode) {
		if (1 == opcode) {
			anInt7029 = buffer.readSmart32() * -1705714773;
			anInt7049 = buffer.readSmart32() * -686492291;
		} else if (2 == opcode) {
			anInt7020 = buffer.readSmart32() * -975933765;
		} else if (3 == opcode) {
			anInt7030 = buffer.readSmart32() * -71279391;
		} else if (4 == opcode) {
			anInt7031 = buffer.readSmart32() * 353089243;
		} else if (opcode == 5) {
			anInt7032 = buffer.readSmart32() * 630548857;
		} else if (opcode == 6) {
			anInt7025 = buffer.readSmart32() * -1823861335;
		} else if (opcode == 7) {
			anInt7055 = buffer.readSmart32() * -1559108225;
		} else if (opcode == 8) {
			anInt7027 = buffer.readSmart32() * 1514541645;
		} else if (opcode == 9) {
			anInt7021 = buffer.readSmart32() * -571655017;
		} else if (opcode == 26) {
			anInt7039 = (short) (buffer.readUByte() * 4) * 373392275;
			anInt7040 = (short) (buffer.readUByte() * 4) * -715483213;
		} else if (opcode == 27) {
			int count = buffer.readUByte();
			if (null == anIntArrayArray7043) {
				anIntArrayArray7043 = new int[1 + count][];
			} else if (count >= anIntArrayArray7043.length) {
				anIntArrayArray7043 = Arrays.copyOf(anIntArrayArray7043, count + 1);
			}
			anIntArrayArray7043[count] = new int[6];
			for (int index = 0; index < 6; index++) {
				anIntArrayArray7043[count][index] = buffer.readShort();
			}
		} else if (opcode == 28) {
			int count = buffer.readUByte();
			anIntArray7047 = new int[count];

			for (int index = 0; index < count; index++) {
				anIntArray7047[index] = buffer.readUByte();
				if (255 == anIntArray7047[index]) {
					anIntArray7047[index] = -1;
				}
			}
		} else if (opcode == 29) {
			anInt7048 = buffer.readUByte() * 262426673;
		} else if (30 == opcode) {
			anInt7028 = buffer.readUShort() * 1759606781;
		} else if (31 == opcode) {
			anInt7054 = buffer.readUByte() * 920331481;
		} else if (32 == opcode) {
			anInt7037 = buffer.readUShort() * -836500507;
		} else if (33 == opcode) {
			anInt7019 = buffer.readShort() * 530808945;
		} else if (opcode == 34) {
			anInt7053 = buffer.readUByte() * -933465751;
		} else if (35 == opcode) {
			anInt7051 = buffer.readUShort() * -1487115899;
		} else if (36 == opcode) {
			anInt7052 = buffer.readShort() * -1634632633;
		} else if (opcode == 37) {
			anInt7056 = buffer.readUByte() * -577377011;
		} else if (opcode == 38) {
			anInt7050 = buffer.readSmart32() * -1414672449;
		} else if (opcode == 39) {
			anInt7046 = buffer.readSmart32() * -763324837;
		} else if (40 == opcode) {
			anInt7022 = buffer.readSmart32() * 580756705;
		} else if (opcode == 41) {
			anInt7023 = buffer.readSmart32() * 244085633;
		} else if (42 == opcode) {
			anInt7024 = buffer.readSmart32() * -1922576913;
		} else if (opcode == 43) {
			buffer.readUShort();
		} else if (opcode == 44) {
			buffer.readUShort();
		} else if (opcode == 45) {
			anInt7057 = buffer.readUShort() * -379735359;
		} else if (opcode == 46) {
			anInt7033 = buffer.readSmart32() * 649264179;
		} else if (47 == opcode) {
			anInt7034 = buffer.readSmart32() * 1523398921;
		} else if (48 == opcode) {
			anInt7035 = buffer.readSmart32() * -90419181;
		} else if (49 == opcode) {
			anInt7036 = buffer.readSmart32() * 1803648275;
		} else if (opcode == 50) {
			anInt7041 = buffer.readSmart32() * 149957895;
		} else if (51 == opcode) {
			anInt7038 = buffer.readSmart32() * -737047923;
		} else if (opcode == 52) {
			int count = buffer.readUByte();
			anIntArray7016 = new int[count];
			anIntArray7017 = new int[count];

			for (int index = 0; index < count; index++) {
				anIntArray7016[index] = buffer.readSmart32();
				int i_8_ = buffer.readUByte();

				anIntArray7017[index] = i_8_;
				anInt7018 += i_8_ * -1590075109;
			}
		} else if (53 == opcode) {
			aBool7015 = false;
		} else if (54 == opcode) {
			anInt7058 = (buffer.readUByte() << 6) * -1802936801;
			anInt7042 = (buffer.readUByte() << 6) * 466977559;
		} else if (55 == opcode) {
			int index = buffer.readUByte();
			if (null == anIntArray7026) {
				anIntArray7026 = new int[index + 1];
			} else if (index >= anIntArray7026.length) {
				anIntArray7026 = Arrays.copyOf(anIntArray7026, 1 + index);
			}

			anIntArray7026[index] = buffer.readUShort();
		} else if (opcode == 56) {
			int count = buffer.readUByte();
			if (null == anIntArrayArray7044) {
				anIntArrayArray7044 = new int[count + 1][];
			} else if (count >= anIntArrayArray7044.length) {
				anIntArrayArray7044 = Arrays.copyOf(anIntArrayArray7044, count + 1);
			}

			anIntArrayArray7044[count] = new int[3];
			for (int index = 0; index < 3; index++) {
				anIntArrayArray7044[count][index] = buffer.readShort();
			}
		}
	}

}