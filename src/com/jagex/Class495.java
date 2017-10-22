package com.jagex;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;

public class Class495 {
	static int[] anIntArray6800;
	static UnderlayDefinitionLoader aClass678_Sub16_6801;
	protected static ObjectDefinitionLoader aClass678_Sub17_6802;
	protected static Class678_Sub8 aClass678_Sub8_6803;
	static boolean[][] aBoolArrayArray6804;
	protected static VariableProvider anInterface12_6805;
	protected static VariableLoader anInterface14_6806;
	protected static int anInt6807;
	public static Class480_Sub31_Sub18 aClass480_Sub31_Sub18_6808;
	protected static MapSceneDefinitionLoader aClass678_Sub15_6809;
	protected static ReferenceCache aClass168_6810;
	static OverlayDefinitionLoader aClass678_Sub19_6811;
	protected static int anInt6812;
	protected static int anInt6813;
	protected static byte[][][] aByteArrayArrayArray6814;
	static Archive aClass406_6815;
	static int[] anIntArray6816;
	static byte[] aByteArray6817;
	public static float aFloat6818;
	static byte[] aByteArray6819;
	protected static Deque aClass644_6820;
	protected static Archive aClass406_6821;
	static HashTable aClass667_6822 = new HashTable(16);
	public static int anInt6823;
	protected static int anInt6824;
	protected static ReferenceCache aClass168_6825;
	protected static int anInt6826;
	public static Class560 aClass560_6827;
	static byte[] aByteArray6828;
	static short[] aShortArray6829;
	static byte[] aByteArray6830;
	static byte[] aByteArray6831;
	protected static Class488 aClass488_6832;
	static Object[] anObjectArray6833;
	protected static boolean aBool6834;
	public static float aFloat6835;
	static int[][] anIntArrayArray6836;
	static int anInt6837;
	static int anInt6838;
	static int anInt6839;
	static int anInt6840;
	static int[] anIntArray6841;
	static int anInt6842;
	static int anInt6843;
	static int anInt6844;
	protected static boolean aBool6845;
	static HashMap[][][] aHashMapArrayArrayArray6846;
	static int anInt6847;
	protected static ReferenceCache aClass168_6848;
	public static int anInt6849;
	static ArrayList anArrayList6850;
	static int anInt6851;
	static int[] anIntArray6852;
	protected static int anInt6853;
	static int anInt6854;
	static Buffer aClass480_Sub17_6855;
	protected static int anInt6856;
	protected static int anInt6857;
	static Buffer aClass480_Sub17_6858;
	static int[] anIntArray6859;
	protected static int anInt6860;
	protected static int anInt6861;
	protected static int anInt6862;
	protected static int anInt6863;
	protected static int anInt6864;
	protected static int anInt6865;
	static final int anInt6866 = 64;
	static int anInt6867;
	static int anInt6868;
	static byte[] aByteArray6869;
	static boolean[] aBoolArray6870;

	static {
		anInt6812 = (int) (Math.random() * 11.0) - 5;
		anInt6813 = (int) (Math.random() * 17.0) - 8;
		anIntArray6816 = new int[1];
		aByteArray6817 = new byte[1];
		aClass644_6820 = new Deque();
		aBool6834 = true;
		anIntArrayArray6836 = new int[][] { { 2, 2, 0, 0, 0, 0 }, { 2, 2, 2, 0, 0, 0 }, { 1, 2, 2, 2, 0, 0 },
				{ 1, 1, 1, 2, 2, 0 }, { 1, 1, 1, 2, 2, 2 }, { 1, 1, 1, 1, 2, 2 } };
		anInt6837 = NpcDirection.NORTH.getId();
		anInt6838 = NpcDirection.NORTH_EAST.getId();
		anInt6839 = NpcDirection.EAST.getId();
		anInt6840 = NpcDirection.SOUTH_EAST.getId();
		anInt6847 = NpcDirection.SOUTH.getId();
		anInt6842 = NpcDirection.SOUTH_WEST.getId();
		anInt6843 = NpcDirection.WEST.getId();
		anInt6844 = NpcDirection.NORTH_WEST.getId();
		aClass168_6825 = new ReferenceCache(4096, 256);
		aClass168_6810 = new ReferenceCache(4096, 1024);
		aClass168_6848 = aClass168_6825;
		anArrayList6850 = new ArrayList();
		anInt6851 = 262144;
		anInt6853 = 0;
		anInt6854 = 5;
		aClass480_Sub17_6855 = null;
		aClass480_Sub17_6858 = null;
		aBool6845 = true;
		new Date();
		anInt6868 = 0;
		anInt6867 = 0;
		aBoolArray6870 = new boolean[8];
	}

	public static void method8547(Archive class406, Archive class406_0_, OverlayDefinitionLoader class678_sub19,
			UnderlayDefinitionLoader class678_sub16, ObjectDefinitionLoader class678_sub17,
			Class678_Sub8 class678_sub8, MapSceneDefinitionLoader class678_sub15, VariableLoader interface14,
			VariableProvider interface12) {
		aClass406_6815 = class406;
		aClass406_6821 = class406_0_;
		aClass678_Sub19_6811 = class678_sub19;
		aClass678_Sub16_6801 = class678_sub16;
		aClass678_Sub17_6802 = class678_sub17;
		aClass678_Sub8_6803 = class678_sub8;
		aClass678_Sub15_6809 = class678_sub15;
		anInterface14_6806 = interface14;
		anInterface12_6805 = interface12;
		aClass667_6822.clear();
		int[] is = aClass406_6815.childIndices(0);
		if (is != null) {
			for (int element : is) {
				Class480_Sub31_Sub18 class480_sub31_sub18 = Class480_Sub31_Sub18
						.load(aClass406_6815, element);
				aClass667_6822.put(class480_sub31_sub18.anInt11426 * 1943328861, class480_sub31_sub18);
			}
		}
		Class44.method1067(true, false);
	}

	public static Class480_Sub31_Sub18 method8552(int i, int i_1_) {
		for (Class480_Sub31_Sub18 class480_sub31_sub18 = (Class480_Sub31_Sub18) aClass667_6822.first(); class480_sub31_sub18 != null; class480_sub31_sub18 = (Class480_Sub31_Sub18) aClass667_6822
				.next()) {
			if (class480_sub31_sub18.aBool11429 && class480_sub31_sub18.method17858(i, i_1_, -824672296)) {
				return class480_sub31_sub18;
			}
		}
		return null;
	}

	public static Class480_Sub31_Sub18 method8553(int i) {
		return (Class480_Sub31_Sub18) aClass667_6822.get(i);
	}

	public static Queue method8554(int i, int i_2_) {
		Queue class638 = new Queue();
		for (Class480_Sub31_Sub18 class480_sub31_sub18 = (Class480_Sub31_Sub18) aClass667_6822.first(); class480_sub31_sub18 != null; class480_sub31_sub18 = (Class480_Sub31_Sub18) aClass667_6822
				.next()) {
			if (class480_sub31_sub18.aBool11429 && class480_sub31_sub18.method17858(i, i_2_, -916916579)) {
				class638.offer(class480_sub31_sub18);
			}
		}
		return class638;
	}

	static void method8549() {
		aByteArray6819 = null;
		aByteArray6828 = null;
		aShortArray6829 = null;
		aByteArray6830 = null;
		aByteArray6831 = null;
		anObjectArray6833 = null;
		aByteArray6869 = null;
		aHashMapArrayArrayArray6846 = null;
		anIntArray6800 = null;
		aBoolArrayArray6804 = null;
	}

	static void method8550(int i) {
		Class480_Sub31_Sub18 class480_sub31_sub18 = (Class480_Sub31_Sub18) aClass667_6822.get(i);
		if (class480_sub31_sub18 != null && class480_sub31_sub18 != aClass480_Sub31_Sub18_6808) {
			aClass480_Sub31_Sub18_6808 = class480_sub31_sub18;
			aBool6834 = aClass480_Sub31_Sub18_6808.anInt11426 * 1943328861 == aClass560_6827.anInt7533 * -344647911;
		}
	}

	static void method8555(TextureMetricsList class147, int i, int i_3_) {
		for (int i_4_ = 0; i_4_ < aClass678_Sub19_6811.definitionCount * -522945077; i_4_++) {
			anIntArray6800[i_4_ + 1] = method8635(class147, i_4_, i, i_3_);
		}
	}

	static boolean method8557(Toolkit class134, int i, int i_5_, boolean bool) {
		long l = TimeUtil.time();
		if (anInt6853 == 0) {
			if (aClass480_Sub31_Sub18_6808.anInt11426 * 1943328861 == aClass560_6827.anInt7534 * -1885442045) {
				int i_6_ = aClass406_6821.index(aClass480_Sub31_Sub18_6808.aString11419);
				if (aClass480_Sub17_6858 == null) {
					aClass480_Sub17_6858 = new Buffer(aClass406_6821.get(i_6_, 0));
				}
				aClass480_Sub17_6855 = aClass480_Sub17_6858;
				aClass480_Sub17_6855.offset = 0;
			} else {
				int i_7_ = aClass406_6821.index(aClass480_Sub31_Sub18_6808.aString11419);
				aClass480_Sub17_6855 = new Buffer(aClass406_6821.get(i_7_, 0));
			}
			int i_8_ = aClass480_Sub17_6855.readUByte();
			anIntArray6841 = new int[i_8_];
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				anIntArray6841[i_9_] = aClass480_Sub17_6855.readUSmart();
			}
			int i_10_ = aClass480_Sub17_6855.readUByte();
			anIntArray6859 = new int[i_10_];
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				anIntArray6859[i_11_] = aClass480_Sub17_6855.readUSmart();
			}
		}
		while (aClass480_Sub17_6855 != null
				&& aClass480_Sub17_6855.offset * -165875887 < aClass480_Sub17_6855.payload.length
				&& (!bool || TimeUtil.time() < l + anInt6854)) {
			if (aClass480_Sub17_6855.readUByte() == 0) {
				int i_12_ = aClass480_Sub17_6855.readUByte();
				int i_13_ = aClass480_Sub17_6855.readUByte();
				for (int i_14_ = 0; i_14_ < 8; i_14_++) {
					int i_15_ = aClass480_Sub17_6855.readUByte();
					int i_16_ = i_12_ * 8 + i_14_ - anInt6849 / 8;
					for (int i_17_ = 0; i_17_ < 8; i_17_++) {
						int i_18_ = i_13_ * 8 + i_17_ - anInt6823 / 8;
						aBoolArrayArray6804[i_16_][i_18_] = (i_15_ & 1 << i_17_) != 0;
					}
				}
				for (int i_19_ = 0; i_19_ < 64; i_19_++) {
					for (int i_20_ = 0; i_20_ < 64; i_20_++) {
						int i_21_ = i_12_ * 64 + i_19_ - anInt6849;
						int i_22_ = i_13_ * 64 + i_20_ - anInt6823;
						method8558(class134, aClass480_Sub17_6855, i_12_, i_13_, i_21_, i_22_, anIntArray6841,
								anIntArray6859);
					}
				}
			} else {
				int i_23_ = aClass480_Sub17_6855.readUByte();
				int i_24_ = aClass480_Sub17_6855.readUByte();
				int i_25_ = aClass480_Sub17_6855.readUByte();
				int i_26_ = aClass480_Sub17_6855.readUByte();
				aBoolArrayArray6804[i_23_ * 8 + i_25_ - anInt6849 / 8][i_24_ * 8 + i_26_ - anInt6823 / 8] = aClass480_Sub17_6855
						.readUByte() != 0;
				for (int i_27_ = 0; i_27_ < 8; i_27_++) {
					for (int i_28_ = 0; i_28_ < 8; i_28_++) {
						int i_29_ = i_23_ * 64 + i_25_ * 8 + i_27_ - anInt6849;
						int i_30_ = i_24_ * 64 + i_26_ * 8 + i_28_ - anInt6823;
						method8558(class134, aClass480_Sub17_6855, i_23_, i_24_, i_29_, i_30_, anIntArray6841,
								anIntArray6859);
					}
				}
			}
		}
		if (aClass480_Sub17_6855 != null) {
			anInt6853 = aClass480_Sub17_6855.offset * -165875887;
			if (aClass480_Sub17_6855.offset * -165875887 < aClass480_Sub17_6855.payload.length) {
				return false;
			}
		}
		aClass480_Sub17_6855 = null;
		anIntArray6859 = null;
		anIntArray6841 = null;
		if (aByteArray6819 != null) {
			aByteArray6828 = new byte[anInt6824 * anInt6826];
			aShortArray6829 = new short[anInt6824 * anInt6826];
			for (int i_31_ = 0; i_31_ < 3; i_31_++) {
				byte[] is = new byte[anInt6824 * anInt6826];
				for (int i_32_ = 0; i_32_ < aHashMapArrayArrayArray6846[i_31_].length; i_32_++) {
					for (int i_33_ = 0; i_33_ < aHashMapArrayArrayArray6846[i_31_][0].length; i_33_++) {
						HashMap hashmap = aHashMapArrayArrayArray6846[i_31_][i_32_][i_33_];
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class500 class500 = (Class500) iterator.next();
								is[i_32_ * 64 + class500.aByte6896 + (i_33_ * 64 + class500.aByte6895) * anInt6824] = (byte) class500.anInt6898;
							}
						}
					}
				}
				method8580(is, aByteArray6828, aShortArray6829, i, i_5_);
				for (int i_34_ = 0; i_34_ < aHashMapArrayArrayArray6846[i_31_].length; i_34_++) {
					for (int i_35_ = 0; i_35_ < aHashMapArrayArrayArray6846[i_31_][0].length; i_35_++) {
						HashMap hashmap = aHashMapArrayArrayArray6846[i_31_][i_34_][i_35_];
						if (hashmap != null) {
							Iterator iterator = hashmap.values().iterator();
							while (iterator.hasNext()) {
								Class500 class500 = (Class500) iterator.next();
								int i_36_ = i_34_ * 64 + class500.aByte6896 + (i_35_ * 64 + class500.aByte6895)
										* anInt6824;
								class500.anInt6898 = (aByteArray6828[i_36_] & 0xff) << 16 | aShortArray6829[i_36_]
										& 0xffff;
								if (class500.anInt6898 != 0) {
									class500.anInt6898 |= ~0xffffff;
								}
							}
						}
					}
				}
			}
			method8580(aByteArray6819, aByteArray6828, aShortArray6829, i, i_5_);
			aByteArray6819 = null;
		}
		if (!bool || TimeUtil.time() < l + anInt6854) {
			method8637();
			return true;
		}
		return false;
	}

	static void method8558(Toolkit class134, Buffer buffer, int i, int i_37_, int i_38_, int i_39_, int[] is,
			int[] is_40_) {
		int i_41_ = buffer.readUByte();
		if ((i_41_ & 0x1) == 0) {
			boolean bool = (i_41_ & 0x2) == 0;
			int i_42_ = i_41_ >> 2 & 0x3f;
			if (i_42_ != 62) {
				if (i_42_ == 63) {
					i_42_ = buffer.readUByte();
				} else if (bool) {
					i_42_ = is[i_42_];
				} else {
					i_42_ = is_40_[i_42_];
				}
				if (bool) {
					aByteArray6819[i_38_ + i_39_ * anInt6824] = (byte) i_42_;
					aByteArray6830[i_38_ + i_39_ * anInt6824] = (byte) 0;
				} else {
					aByteArray6830[i_38_ + i_39_ * anInt6824] = (byte) i_42_;
					aByteArray6831[i_38_ + i_39_ * anInt6824] = (byte) 0;
					aByteArray6819[i_38_ + i_39_ * anInt6824] = buffer.readByte();
				}
			}
		} else {
			int i_43_ = (i_41_ >> 1 & 0x3) + 1;
			boolean bool = (i_41_ & 0x8) != 0;
			boolean bool_44_ = (i_41_ & 0x10) != 0;
			for (int i_45_ = 0; i_45_ < i_43_; i_45_++) {
				int i_46_ = buffer.readUByte();
				int i_47_ = 0;
				int i_48_ = 0;
				if (bool) {
					i_47_ = buffer.readUByte();
					i_48_ = buffer.readUByte();
				}
				int i_49_ = 0;
				if (bool_44_) {
					i_49_ = buffer.readUByte();
				}
				if (i_45_ == 0) {
					aByteArray6819[i_38_ + i_39_ * anInt6824] = (byte) i_46_;
					aByteArray6830[i_38_ + i_39_ * anInt6824] = (byte) i_47_;
					aByteArray6831[i_38_ + i_39_ * anInt6824] = (byte) i_48_;
					if (i_49_ == 1) {
						anObjectArray6833[i_38_ + i_39_ * anInt6824] = new Integer(buffer.readSmart32());
						aByteArray6869[i_38_ + i_39_ * anInt6824] = buffer.readByte();
					} else if (i_49_ > 1) {
						int[] is_50_ = new int[i_49_];
						byte[] is_51_ = new byte[i_49_];
						for (int i_52_ = 0; i_52_ < i_49_; i_52_++) {
							is_50_[i_52_] = buffer.readSmart32();
							is_51_[i_52_] = buffer.readByte();
						}
						anObjectArray6833[i_38_ + i_39_ * anInt6824] = new Class480_Sub19(is_50_, is_51_);
					}
				} else {
					int[] is_53_ = null;
					byte[] is_54_ = null;
					if (i_49_ > 0) {
						is_53_ = new int[i_49_];
						is_54_ = new byte[i_49_];
						for (int i_55_ = 0; i_55_ < i_49_; i_55_++) {
							is_53_[i_55_] = buffer.readSmart32();
							is_54_[i_55_] = buffer.readByte();
						}
					}
					if (aHashMapArrayArrayArray6846[i_45_ - 1][i - (anInt6849 >> 6)][i_37_ - (anInt6823 >> 6)] == null) {
						aHashMapArrayArrayArray6846[i_45_ - 1][i - (anInt6849 >> 6)][i_37_ - (anInt6823 >> 6)] = new HashMap();
					}
					int i_56_ = ((i_38_ & 0x3f) << 8) + (i_39_ & 0x3f);
					Class500 class500 = new Class500(i_38_ & 0x3f, i_39_ & 0x3f, i_46_, i_47_, i_48_, is_53_, is_54_);
					aHashMapArrayArrayArray6846[i_45_ - 1][i - (anInt6849 >> 6)][i_37_ - (anInt6823 >> 6)].put(
							Integer.valueOf(i_56_), class500);
				}
			}
		}
	}

	static void method8560() {
		int[] is = new int[3];
		for (int i = 0; i < aClass488_6832.anInt6669 * -428779527; i++) {
			boolean bool = aClass480_Sub31_Sub18_6808.method17861(aClass488_6832.anIntArray6670[i] >> 28 & 0x3,
					aClass488_6832.anIntArray6670[i] >> 14 & 0x3fff, aClass488_6832.anIntArray6670[i] & 0x3fff, is);
			if (bool) {
				Class480_Sub37 class480_sub37 = new Class480_Sub37(aClass488_6832.anIntArray6671[i]);
				class480_sub37.anInt10310 = (is[1] - anInt6849) * 579363759;
				class480_sub37.anInt10308 = (is[2] - anInt6823) * 1018598297;
				aClass644_6820.pushBack(class480_sub37);
			}
		}
	}

	static void method8561(int i, int i_57_, int i_58_, int i_59_, int i_60_, int i_61_, int i_62_, int i_63_) {
		anInt6860 = i - anInt6849;
		anInt6861 = i_57_ - anInt6823;
		anInt6862 = i_58_ - anInt6849;
		anInt6863 = i_59_ - anInt6823;
		anInt6864 = i_60_;
		anInt6865 = i_61_;
		anInt6856 = i_62_;
		anInt6807 = i_63_;
	}

	static void method8562(Toolkit class134, boolean bool, boolean bool_64_, boolean bool_65_, boolean bool_66_) {
		int i = anInt6862 - anInt6860;
		int i_67_ = anInt6861 - anInt6863;
		int i_68_ = (anInt6856 - anInt6864 << 16) / i;
		int i_69_ = (anInt6807 - anInt6865 << 16) / i_67_;
		method8563(class134, bool, bool_64_, i_68_, i_69_, 0, 0, bool_65_, bool_66_);
	}

	static void method8563(Toolkit class134, boolean bool, boolean bool_70_, int i, int i_71_, int i_72_, int i_73_,
			boolean bool_74_, boolean bool_75_) {
		int i_76_ = anInt6862 - anInt6860;
		int i_77_ = anInt6861 - anInt6863;
		if (anInt6862 < anInt6824) {
			i_76_++;
		}
		if (anInt6861 < anInt6826) {
			i_77_++;
		}
		int i_78_ = anInt6860 / 64;
		int i_79_ = anInt6863 / 64;
		int i_80_ = (anInt6860 + i_76_) / 64;
		int i_81_ = (anInt6863 + i_77_) / 64;
		int i_82_;
		int i_83_;
		if (bool_75_) {
			i_82_ = (anInt6856 - anInt6864) / ((anInt6862 - anInt6860) / 64);
			i_83_ = i_82_;
		} else {
			i_82_ = method8574();
			i_83_ = (int) Math.ceil(64.0F * aFloat6818 / 2.0F);
		}
		anArrayList6850.clear();
		int i_84_ = 0;
		int i_85_ = i_82_ * i_82_;
		for (int i_86_ = i_78_; i_86_ <= i_80_; i_86_++) {
			for (int i_87_ = i_79_; i_87_ <= i_81_; i_87_++) {
				int i_88_ = (i_86_ << 16) + i_87_;
				int i_89_ = method8575(i_88_);
				if (i_89_ != i_82_) {
					if (i_86_ < 0 || i_86_ * 64 >= anInt6824 || i_87_ < 0 || i_87_ * 64 >= anInt6826) {
						method8564(class134, i_86_, i_87_, i_82_, i_88_);
					} else if (i_89_ == -1) {
						method8591(i_86_, i_87_, i_82_, i_88_, bool, bool_70_, bool_74_, class134);
						i_84_ += i_85_;
					} else {
						anArrayList6850.add(Integer.valueOf(i_88_));
					}
				}
			}
		}
		if (!anArrayList6850.isEmpty() && i_84_ < anInt6851) {
			for (Iterator iterator = anArrayList6850.iterator(); i_84_ < anInt6851 && iterator.hasNext(); i_84_ += i_85_) {
				int i_90_ = ((Integer) iterator.next()).intValue();
				int i_91_ = i_90_ >> 16 & 0xffff;
				int i_92_ = i_90_ & 0xffff;
				method8591(i_91_, i_92_, i_82_, i_90_, bool, bool_70_, bool_74_, class134);
			}
		}
		for (int i_93_ = i_78_; i_93_ <= i_80_; i_93_++) {
			int i_94_ = i_93_ * 64;
			int i_95_ = i_94_ - anInt6860;
			int i_96_ = i_83_;
			int i_97_ = (i_72_ + i * i_95_ >> 16) + anInt6864;
			int i_98_ = (i_72_ + i * (i_95_ + 64) >> 16) + anInt6864;
			if (i_97_ + i_96_ != i_98_) {
				i_96_ = i_98_ - i_97_;
			}
			for (int i_99_ = i_79_; i_99_ <= i_81_; i_99_++) {
				int i_100_ = i_99_ * 64;
				int i_101_ = i_100_ - anInt6863;
				int i_102_ = (i_93_ << 16) + i_99_;
				int i_103_ = i_83_;
				int i_104_ = anInt6807 - (i_73_ + i_71_ * i_101_ >> 16);
				int i_105_ = anInt6807 - (i_73_ + i_71_ * (i_101_ + 64) >> 16);
				if (i_104_ - i_103_ != i_105_) {
					i_103_ = i_104_ - i_105_;
				}
				i_104_ -= i_103_;
				Sprite class116 = (Sprite) aClass168_6848.get(i_102_);
				if (class116 == null) {
					throw new RuntimeException();
				}
				if (class116.method2157() == i_96_ && class116.method2119() == i_103_) {
					class116.method2079(i_97_, i_104_);
				} else {
					class116.method2145(i_97_, i_104_, i_96_, i_103_);
				}
			}
		}
	}

	static void method8564(Toolkit class134, int i, int i_106_, int i_107_, int i_108_) {
		Sprite class116 = (Sprite) aClass168_6848.get(-1L);
		if (class116 == null || class116.method2157() != i_107_) {
			int i_109_;
			if (aClass480_Sub31_Sub18_6808.anInt11423 * 543253501 != -1) {
				i_109_ = ~0xffffff | aClass480_Sub31_Sub18_6808.anInt11423 * 543253501;
			} else {
				i_109_ = -16777216;
			}
			if (anIntArray6852 == null || anIntArray6852.length != i_107_ * i_107_) {
				anIntArray6852 = new int[i_107_ * i_107_];
			}
			Arrays.fill(anIntArray6852, i_109_);
			class116 = class134.createSprite(anIntArray6852, 0, i_107_, i_107_, i_107_, true);
			aClass168_6848.put(-1L, class116);
		}
		aClass168_6848.put(i_108_, class116);
	}

	static void method8566(int[] is, int i, int i_110_, int i_111_, int i_112_, int i_113_, boolean bool, int i_114_,
			int i_115_, int i_116_, int[] is_117_, byte[] is_118_, boolean bool_119_) {
		if (bool_119_ || i_114_ != 0 || i_115_ > 0) {
			if (i_115_ == 0) {
				method8576(is, i, i_110_, i_111_, i_112_, i_113_, i_114_ | ~0xffffff);
			} else {
				int i_120_ = i_116_ & 0x3f;
				if (i_120_ == 0 || anInt6857 == 0) {
					int i_121_ = anIntArray6800[i_115_];
					if (bool_119_ || i_121_ != 0) {
						method8576(is, i, i_110_, i_111_, i_112_, i_113_, i_121_ | ~0xffffff);
					}
				} else {
					int i_122_ = bool_119_ ? 0 : 1;
					int i_123_ = Class275.method5154(i_116_ >> 6 & 0x3, i_120_, 214316939);
					i_120_ = Class550.method9337(i_120_, (byte) 1);
					method8581(is, i, i_110_, i_111_, i_112_, i_113_, i_114_, anIntArray6800[i_115_],
							aByteArrayArrayArray6814[i_120_ - 1][i_123_], anInt6857, i_122_);
				}
			}
		}
		if (bool && is_117_ != null) {
			int i_124_ = i_110_ - i + 1;
			int i_125_ = i_112_ - i_111_ + 1;
			for (int i_126_ = 0; i_126_ < is_117_.length; i_126_++) {
				int i_127_ = is_118_[i_126_] & 0x3f;
				if (i_127_ == ObjectCategory.aClass541_7335.type * -1050493863
						|| i_127_ == ObjectCategory.aClass541_7337.type * -1050493863
						|| i_127_ == ObjectCategory.aClass541_7355.type * -1050493863
						|| i_127_ == ObjectCategory.aClass541_7339.type * -1050493863) {
					ObjectDefinition class544 = aClass678_Sub17_6802.get(is_117_[i_126_]);
					if (class544.mapscene * -995642805 == -1) {
						int i_128_ = -3355444;
						if (class544.anInt7389 * -1893691057 == 1) {
							i_128_ = -3407872;
						}
						int i_129_ = is_118_[i_126_] >> 6 & 0x3;
						if (i_127_ == ObjectCategory.aClass541_7335.type * -1050493863) {
							if (i_129_ == 0) {
								method8583(is, i, i_112_, i_125_, i_113_, i_128_);
							} else if (i_129_ == 1) {
								method8582(is, i, i_112_, i_124_, i_113_, i_128_);
							} else if (i_129_ == 2) {
								method8583(is, i_110_, i_112_, i_125_, i_113_, i_128_);
							} else {
								method8582(is, i, i_111_, i_124_, i_113_, i_128_);
							}
						} else if (i_127_ == ObjectCategory.aClass541_7337.type * -1050493863) {
							if (i_129_ == 0) {
								method8583(is, i, i_112_, i_125_, i_113_, -1);
								method8582(is, i, i_112_, i_124_, i_113_, i_128_);
							} else if (i_129_ == 1) {
								method8583(is, i_110_, i_112_, i_125_, i_113_, -1);
								method8582(is, i, i_112_, i_124_, i_113_, i_128_);
							} else if (i_129_ == 2) {
								method8583(is, i_110_, i_112_, i_125_, i_113_, -1);
								method8582(is, i, i_111_, i_124_, i_113_, i_128_);
							} else {
								method8583(is, i, i_112_, i_125_, i_113_, -1);
								method8582(is, i, i_111_, i_124_, i_113_, i_128_);
							}
						} else if (i_127_ == ObjectCategory.aClass541_7355.type * -1050493863) {
							if (i_129_ == 0) {
								method8582(is, i, i_112_, 1, i_113_, i_128_);
							} else if (i_129_ == 1) {
								method8582(is, i_110_, i_112_, 1, i_113_, i_128_);
							} else if (i_129_ == 2) {
								method8582(is, i_110_, i_111_, 1, i_113_, i_128_);
							} else {
								method8582(is, i, i_111_, 1, i_113_, i_128_);
							}
						} else if (i_127_ == ObjectCategory.aClass541_7339.type * -1050493863) {
							if (i_129_ == 0 || i_129_ == 2) {
								for (int i_130_ = 0; i_130_ < i_125_; i_130_++) {
									method8582(is, i + i_130_, i_111_ + i_130_, 1, i_113_, i_128_);
								}
							} else {
								for (int i_131_ = 0; i_131_ < i_125_; i_131_++) {
									method8582(is, i + i_131_, i_112_ - i_131_, 1, i_113_, i_128_);
								}
							}
						}
					}
				}
			}
		}
	}

	static void method8567(int[] is, int i, int i_132_, int i_133_, int i_134_, int i_135_, int i_136_) {
		for (int i_137_ = 0; i_137_ < aClass560_6827.anInt7538 * -1993093695; i_137_++) {
			int i_138_ = i_137_;
			if (i_136_ == anInt6838 || i_136_ == anInt6840) {
				i_138_ = aClass560_6827.anInt7538 * -1993093695 - i_137_ - 1;
			}
			for (int i_139_ = 0; i_139_ < aClass560_6827.anInt7538 * -1993093695; i_139_++) {
				int i_140_ = i_139_;
				if (i_136_ == anInt6840 || i_136_ == anInt6842) {
					i_140_ = aClass560_6827.anInt7538 * -1993093695 - i_139_ - 1;
				}
				int i_141_ = anIntArrayArray6836[i_138_][i_140_];
				if (i_141_ != 0) {
					if (i_141_ == 1) {
						int i_142_ = is[(i_133_ - i_132_ - i_139_ - 1) * i_133_ + i + i_137_];
						if (i_142_ != anInt6868) {
							anInt6868 = i_142_;
							anInt6867 = ~0xffffff
									| ((aClass560_6827.anInt7537 * -1382594383 & 0xff00ff) * i_134_
											+ (i_142_ & 0xff00ff) * i_135_ & ~0xff00ff)
											+ ((aClass560_6827.anInt7537 * -1382594383 & 0xff00) * i_134_
													+ (i_142_ & 0xff00) * i_135_ & 0xff0000) >> 8;
						}
						is[(i_133_ - i_132_ - i_139_ - 1) * i_133_ + i + i_137_] = anInt6867;
					} else if (i_141_ == 2) {
						is[(i_133_ - i_132_ - i_139_ - 1) * i_133_ + i + i_137_] = aClass560_6827.anInt7535
								* -1489150795;
					}
				}
			}
		}
	}

	static void method8568(Toolkit toolkit, int[] is, int i, int i_143_, int i_144_, int[] objects, byte[] is_146_) {
		if (objects != null) {
			for (int index = 0; index < objects.length; index++) {
				ObjectDefinition object = aClass678_Sub17_6802.get(objects[index]);
				int i_148_ = object.mapscene * -995642805;
				if (i_148_ != -1) {
					MapSceneDefinition scene = aClass678_Sub15_6809.get(i_148_);
					Sprite sprite = scene.getSprite(toolkit, object.aBool7437 ? is_146_[index] >> 6 & 0x3 : 0,
							object.invertMapScene ? object.mirrorModel : false);
					int[] argb = scene.argb(toolkit, object.aBool7437 ? is_146_[index] >> 6 & 0x3 : 0,
							object.invertMapScene ? object.mirrorModel : false);

					if (sprite != null) {
						int width = sprite.scaleWidth();
						int height = sprite.scaleHeight();
						int i_152_ = i * width / 64 >> 2;
						int i_153_ = i * height / 64 >> 2;

						if (scene.aBool292) {
							int i_154_ = object.width * 723391465;
							int i_155_ = object.length * 2076427087;

							if ((is_146_[index] >> 6 & 0x1) == 1) {
								int i_156_ = i_154_;
								i_154_ = i_155_;
								i_155_ = i_156_;
							}

							i_152_ = i_154_ * i / 64;
							i_153_ = i_155_ * i / 64;
						}

						if (i_152_ != 0 && i_153_ != 0) {
							int i_157_ = i_143_ * i / 64;
							int i_158_ = (64 - i_144_) * i / 64 - i_153_ + 1;

							for (int i_159_ = 0; i_159_ < i_152_; i_159_++) {
								int i_160_ = i_159_ + i_157_;

								if (i_160_ >= 0) {
									if (i_160_ >= i) {
										break;
									}

									for (int i_161_ = 0; i_161_ < i_153_; i_161_++) {
										int i_162_ = i_161_ + i_158_;

										if (i_162_ >= 0) {
											if (i_162_ >= i) {
												break;
											}

											int i_163_ = argb[i_159_ * width / i_152_ + width
													* (i_161_ * height / i_153_)];
											int i_164_ = i_163_ >> 24 & 0xff;

											if (i_164_ != 0) {
												is[i_160_ + i * i_162_] = i_163_;
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

	static Deque method8570(Toolkit class134, int i, int i_165_, int i_166_, int i_167_) {
		for (Class480_Sub37 class480_sub37 = (Class480_Sub37) aClass644_6820.head(); class480_sub37 != null; class480_sub37 = (Class480_Sub37) aClass644_6820
				.next()) {
			method8571(class134, class480_sub37, i, i_165_, i_166_, i_167_);
		}
		return aClass644_6820;
	}

	static void method8571(Toolkit class134, Class480_Sub37 class480_sub37, int i, int i_168_, int i_169_, int i_170_) {
		class480_sub37.anInt10312 = (anInt6864 + (i_169_ + i * (class480_sub37.anInt10310 * -1639918769 - anInt6860) >> 16)) * 1952138157;
		class480_sub37.anInt10313 = (anInt6807 - (i_170_ + i_168_
				* (class480_sub37.anInt10308 * -342421335 - anInt6863) >> 16))
				* -410267307;
	}

	static void method8572(Toolkit class134, Class480_Sub37 class480_sub37, Class224 class224) {
		if (class224.anIntArray2324 != null) {
			int[] is = new int[class224.anIntArray2324.length];
			for (int i = 0; i < is.length / 2; i++) {
				int i_171_ = class224.anIntArray2324[i * 2] + class480_sub37.anInt10310 * -1639918769;
				int i_172_ = class224.anIntArray2324[i * 2 + 1] + class480_sub37.anInt10308 * -342421335;
				is[i * 2] = anInt6864 + (anInt6856 - anInt6864) * (i_171_ - anInt6860) / (anInt6862 - anInt6860);
				is[i * 2 + 1] = anInt6807 - (anInt6807 - anInt6865) * (i_172_ - anInt6863) / (anInt6861 - anInt6863);
			}
			Class133.method2338(class134, is, class224.anInt2319 * -1269404395);
			if (class224.anInt2343 * -2038170095 > 0) {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					int i_173_ = is[i * 2];
					int i_174_ = is[i * 2 + 1];
					int i_175_ = is[(i + 1) * 2];
					int i_176_ = is[(i + 1) * 2 + 1];
					if (i_175_ < i_173_) {
						int i_177_ = i_173_;
						int i_178_ = i_174_;
						i_173_ = i_175_;
						i_174_ = i_176_;
						i_175_ = i_177_;
						i_176_ = i_178_;
					} else if (i_175_ == i_173_ && i_176_ < i_174_) {
						int i_179_ = i_174_;
						i_174_ = i_176_;
						i_176_ = i_179_;
					}
					class134.method2441(i_173_, i_174_, i_175_, i_176_,
							class224.anIntArray2337[class224.aByteArray2323[i] & 0xff], 1, class224.anInt2343
									* -2038170095, class224.anInt2331 * -1863776093, class224.anInt2332 * -178285943);
				}
				int i = is[is.length - 2];
				int i_180_ = is[is.length - 1];
				int i_181_ = is[0];
				int i_182_ = is[1];
				if (i_181_ < i) {
					int i_183_ = i;
					int i_184_ = i_180_;
					i = i_181_;
					i_180_ = i_182_;
					i_181_ = i_183_;
					i_182_ = i_184_;
				} else if (i_181_ == i && i_182_ < i_180_) {
					int i_185_ = i_180_;
					i_180_ = i_182_;
					i_182_ = i_185_;
				}
				class134.method2441(i, i_180_, i_181_, i_182_,
						class224.anIntArray2337[class224.aByteArray2323[class224.aByteArray2323.length - 1] & 0xff], 1,
						class224.anInt2343 * -2038170095, class224.anInt2331 * -1863776093, class224.anInt2332
								* -178285943);
			} else {
				for (int i = 0; i < is.length / 2 - 1; i++) {
					class134.method2432(is[i * 2], is[i * 2 + 1], is[(i + 1) * 2], is[(i + 1) * 2 + 1],
							class224.anIntArray2337[class224.aByteArray2323[i] & 0xff]);
				}
				class134.method2432(is[is.length - 2], is[is.length - 1], is[0], is[1],
						class224.anIntArray2337[class224.aByteArray2323[class224.aByteArray2323.length - 1] & 0xff]);
			}
		}
	}

	static boolean method8573(int i, int i_186_) {
		int i_187_ = i >> 3;
		int i_188_ = i_186_ >> 3;
		if (i_187_ < 0 || i_188_ < 0 || i_187_ >= aBoolArrayArray6804.length
				|| i_188_ >= aBoolArrayArray6804[i_187_].length) {
			return false;
		}
		return aBoolArrayArray6804[i_187_][i_188_];
	}

	static int method8574() {
		return (int) (64.0F * aFloat6835 / 2.0F);
	}

	static int method8575(long l) {
		Sprite class116 = (Sprite) aClass168_6848.get(l);
		if (class116 != null) {
			return class116.method2157();
		}
		return -1;
	}

	static void method8576(int[] is, int i, int i_189_, int i_190_, int i_191_, int i_192_, int i_193_) {
		for (int i_194_ = i; i_194_ <= i_189_; i_194_++) {
			for (int i_195_ = i_190_; i_195_ <= i_191_; i_195_++) {
				is[(i_192_ - i_195_ - 1) * i_192_ + i_194_] = i_193_;
			}
		}
	}

	static int method8577(DefinitionLoader<OverlayDefinition> loader, TextureMetricsList class147, int i, int i_196_,
			int i_197_) {
		OverlayDefinition overlay = loader.get(i);
		if (overlay == null) {
			return 0;
		}

		int texture = overlay.texture * -795268031;
		if (texture >= 0 && class147.get(texture).aBool1724) {
			texture = -1;
		}

		int hsv;
		if (overlay.blendColour * -1041293597 >= 0) {
			int i_200_ = overlay.blendColour * -1041293597;
			int i_201_ = (i_200_ & 0x7f) + i_197_;

			if (i_201_ < 0) {
				i_201_ = 0;
			} else if (i_201_ > 127) {
				i_201_ = 127;
			}

			int blended = (i_200_ + i_196_ & 0xfc00) + (i_200_ & 0x380) + i_201_;
			hsv = ~0xffffff | Class335.HSV_TABLE[HslUtils.hslToHsv(Class467.safeLight(blended, 96)) & 0xffff];
		} else if (texture >= 0) {
			hsv = ~0xffffff
					| Class335.HSV_TABLE[HslUtils.hslToHsv(Class467.safeLight(class147.get(texture).colour, 96)) & 0xffff];
		} else if (overlay.colour * -217720799 == -1) {
			hsv = 0;
		} else {
			int colour = overlay.colour * -217720799;
			int i_204_ = (colour & 0x7f) + i_197_;
			if (i_204_ < 0) {
				i_204_ = 0;
			} else if (i_204_ > 127) {
				i_204_ = 127;
			}

			int blended = (colour + i_196_ & 0xfc00) + (colour & 0x380) + i_204_;
			hsv = ~0xFFFFFF | Class335.HSV_TABLE[HslUtils.hslToHsv(Class467.safeLight(blended, 96)) & 0xffff];
		}

		return hsv;
	}

	static void method8578(int[] is, int i, int i_206_, int i_207_, int i_208_, int i_209_) {
		int i_210_ = aClass560_6827.anInt7537 * -1382594383 >> 24 & 0xff;
		int i_211_ = 255 - i_210_;
		for (int i_212_ = i; i_212_ <= i_206_; i_212_++) {
			for (int i_213_ = i_207_; i_213_ <= i_208_; i_213_++) {
				int i_214_ = is[(i_209_ - i_213_ - 1) * i_209_ + i_212_];
				if (i_214_ != anInt6868) {
					anInt6868 = i_214_;
					anInt6867 = ~0xffffff
							| ((aClass560_6827.anInt7537 * -1382594383 & 0xff00ff) * i_210_ + (i_214_ & 0xff00ff)
									* i_211_ & ~0xff00ff)
									+ ((aClass560_6827.anInt7537 * -1382594383 & 0xff00) * i_210_ + (i_214_ & 0xff00)
											* i_211_ & 0xff0000) >> 8;
				}
				is[(i_209_ - i_213_ - 1) * i_209_ + i_212_] = anInt6867;
			}
		}
	}

	static void method8579(int[] is, int i, int i_215_, int i_216_, int i_217_, int i_218_, int i_219_, int i_220_,
			boolean bool, boolean bool_221_, boolean bool_222_, boolean bool_223_) {
		for (int i_224_ = i; i_224_ <= i_215_; i_224_++) {
			boolean bool_225_ = bool_221_ ? aBoolArray6870[anInt6839]
					&& i_215_ - i_224_ < aClass560_6827.anInt7536 * -1087016023 : false;
			boolean bool_226_ = bool_223_ ? aBoolArray6870[anInt6843]
					&& i_224_ - i < aClass560_6827.anInt7536 * -1087016023 : false;
			for (int i_227_ = i_216_; i_227_ <= i_217_; i_227_++) {
				if (bool_225_ || bool_226_) {
					is[(i_218_ - i_227_ - 1) * i_218_ + i_224_] = aClass560_6827.anInt7535 * -1489150795;
				} else {
					boolean bool_228_ = bool ? aBoolArray6870[anInt6837]
							&& i_217_ - i_227_ < aClass560_6827.anInt7536 * -1087016023 : false;
					boolean bool_229_ = bool_222_ ? aBoolArray6870[anInt6847]
							&& i_227_ - i_216_ < aClass560_6827.anInt7536 * -1087016023 : false;
					if (bool_228_ || bool_229_) {
						is[(i_218_ - i_227_ - 1) * i_218_ + i_224_] = aClass560_6827.anInt7535 * -1489150795;
					} else {
						int i_230_ = is[(i_218_ - i_227_ - 1) * i_218_ + i_224_];
						if (i_230_ != anInt6868) {
							anInt6868 = i_230_;
							anInt6867 = ~0xffffff
									| ((aClass560_6827.anInt7537 * -1382594383 & 0xff00ff) * i_219_
											+ (i_230_ & 0xff00ff) * i_220_ & ~0xff00ff)
											+ ((aClass560_6827.anInt7537 * -1382594383 & 0xff00) * i_219_
													+ (i_230_ & 0xff00) * i_220_ & 0xff0000) >> 8;
						}
						is[(i_218_ - i_227_ - 1) * i_218_ + i_224_] = anInt6867;
					}
				}
			}
		}
	}

	static void method8580(byte[] is, byte[] is_231_, short[] is_232_, int i, int i_233_) {
		int[] is_234_ = new int[anInt6826];
		int[] is_235_ = new int[anInt6826];
		int[] is_236_ = new int[anInt6826];
		int[] is_237_ = new int[anInt6826];
		int[] is_238_ = new int[anInt6826];
		for (int i_239_ = -5; i_239_ < anInt6824; i_239_++) {
			int i_240_ = i_239_ + 5;
			int i_241_ = i_239_ - 5;
			for (int i_242_ = 0; i_242_ < anInt6826; i_242_++) {
				if (i_240_ < anInt6824) {
					int i_243_ = is[i_240_ + i_242_ * anInt6824] & 0xff;
					if (i_243_ > 0) {
						UnderlayDefinition class646 = aClass678_Sub16_6801.get(i_243_ - 1);
						is_234_[i_242_] += class646.hue * -1258410943;
						is_235_[i_242_] += class646.saturation * -1056540465;
						is_236_[i_242_] += class646.lightness * -1022526453;
						is_237_[i_242_] += class646.chroma * -2030998007;
						is_238_[i_242_]++;
					}
				}
				if (i_241_ >= 0) {
					int i_244_ = is[i_241_ + i_242_ * anInt6824] & 0xff;
					if (i_244_ > 0) {
						UnderlayDefinition class646 = aClass678_Sub16_6801.get(i_244_ - 1);
						is_234_[i_242_] -= class646.hue * -1258410943;
						is_235_[i_242_] -= class646.saturation * -1056540465;
						is_236_[i_242_] -= class646.lightness * -1022526453;
						is_237_[i_242_] -= class646.chroma * -2030998007;
						is_238_[i_242_]--;
					}
				}
			}
			if (i_239_ >= 0) {
				int i_245_ = 0;
				int i_246_ = 0;
				int i_247_ = 0;
				int i_248_ = 0;
				int i_249_ = 0;
				for (int i_250_ = -5; i_250_ < anInt6826; i_250_++) {
					int i_251_ = i_250_ + 5;
					if (i_251_ < anInt6826) {
						i_245_ += is_234_[i_251_];
						i_246_ += is_235_[i_251_];
						i_247_ += is_236_[i_251_];
						i_248_ += is_237_[i_251_];
						i_249_ += is_238_[i_251_];
					}
					int i_252_ = i_250_ - 5;
					if (i_252_ >= 0) {
						i_245_ -= is_234_[i_252_];
						i_246_ -= is_235_[i_252_];
						i_247_ -= is_236_[i_252_];
						i_248_ -= is_237_[i_252_];
						i_249_ -= is_238_[i_252_];
					}
					if (i_250_ >= 0 && i_249_ > 0) {
						if ((is[i_239_ + i_250_ * anInt6824] & 0xff) == 0) {
							int i_253_ = i_239_ + i_250_ * anInt6824;
							is_231_[i_253_] = (byte) 0;
							is_232_[i_253_] = (short) 0;
						} else {
							int i_254_ = i_248_ == 0 ? 0 : ReferenceTable.method6964(i_245_ * 256 / i_248_, i_246_
									/ i_249_, i_247_ / i_249_, (short) -19430);
							int i_255_ = (i_254_ & 0x7f) + i_233_;
							if (i_255_ < 0) {
								i_255_ = 0;
							} else if (i_255_ > 127) {
								i_255_ = 127;
							}
							int i_256_ = (i_254_ + i & 0xfc00) + (i_254_ & 0x380) + i_255_;
							int i_257_ = i_239_ + i_250_ * anInt6824;
							int i_258_ = Class335.HSV_TABLE[HslUtils.hslToHsv(VarpDefinitionLoader.method17297(
									i_256_, 96, -1833509109)) & 0xffff];
							is_231_[i_257_] = (byte) (i_258_ >> 16 & 0xff);
							is_232_[i_257_] = (short) (i_258_ & 0xffff);
						}
					}
				}
			}
		}
	}

	static void method8581(int[] is, int i, int i_259_, int i_260_, int i_261_, int i_262_, int i_263_, int i_264_,
			byte[] is_265_, int i_266_, int i_267_) {
		int i_268_ = 0;
		int i_269_ = 0;
		int i_270_ = i_259_ - i + 1;
		int i_271_ = i_261_ - i_260_ + 1;
		int i_272_ = (i_266_ << 16) / i_270_;
		int i_273_ = (is_265_.length / i_266_ << 16) / i_271_;
		int i_274_ = i + (i_262_ - i_261_ - 1) * i_262_;
		int i_275_ = i_263_ >> 24;
		int i_276_ = i_264_ >> 24;
		if (i_267_ == 0 || i_267_ == 1 && i_275_ == 255 && i_276_ == 255) {
			int i_277_ = i_268_;
			for (int i_278_ = -i_271_; i_278_ < 0; i_278_++) {
				int i_279_ = (i_269_ >> 16) * i_266_;
				for (int i_280_ = -i_270_; i_280_ < 0; i_280_++) {
					if (is_265_[(i_268_ >> 16) + i_279_] != 0) {
						is[i_274_++] = i_264_;
					} else {
						is[i_274_++] = i_263_;
					}
					i_268_ += i_272_;
				}
				i_269_ += i_273_;
				i_268_ = i_277_;
				i_274_ += i_262_ - i_270_;
			}
		} else if (i_267_ == 1) {
			int i_281_ = i_268_;
			for (int i_282_ = -i_271_; i_282_ < 0; i_282_++) {
				int i_283_ = (i_269_ >> 16) * i_266_;
				for (int i_284_ = -i_270_; i_284_ < 0; i_284_++) {
					int i_285_ = i_263_;
					if (is_265_[(i_268_ >> 16) + i_283_] != 0) {
						i_285_ = i_264_;
					}
					int i_286_ = i_285_ >>> 24;
					int i_287_ = 255 - i_286_;
					int i_288_ = is[i_274_];
					is[i_274_++] = ~0xffffff
							| ((i_285_ & 0xff00ff) * i_286_ + (i_288_ & 0xff00ff) * i_287_ & ~0xff00ff)
									+ ((i_285_ & 0xff00) * i_286_ + (i_288_ & 0xff00) * i_287_ & 0xff0000) >> 8;
					i_268_ += i_272_;
				}
				i_269_ += i_273_;
				i_268_ = i_281_;
				i_274_ += i_262_ - i_270_;
			}
		} else {
			throw new IllegalArgumentException();
		}
	}

	static void method8582(int[] is, int i, int i_289_, int i_290_, int i_291_, int i_292_) {
		int i_293_ = i + (i_291_ - i_289_ - 1) * i_291_;
		for (int i_294_ = 0; i_294_ < i_290_; i_294_++) {
			is[i_293_ + i_294_] = i_292_;
		}
	}

	static void method8583(int[] is, int i, int i_295_, int i_296_, int i_297_, int i_298_) {
		int i_299_ = i + (i_297_ - i_295_ - 1) * i_297_;
		for (int i_300_ = 0; i_300_ < i_296_; i_300_++) {
			is[i_299_ + i_300_ * i_297_] = i_298_;
		}
	}

	static void method8591(int i, int i_301_, int i_302_, int i_303_, boolean bool, boolean bool_304_,
			boolean bool_305_, Toolkit class134) {
		int i_306_ = i * 64;
		int i_307_ = i_301_ * 64;
		if (anIntArray6852 == null || anIntArray6852.length != i_302_ * i_302_) {
			anIntArray6852 = new int[i_302_ * i_302_];
		}
		boolean bool_308_ = aBool6834 && !bool_305_;
		for (int i_309_ = 0; i_309_ < 64; i_309_++) {
			int i_310_ = i_306_ + i_309_;
			int i_311_ = i_309_ * i_302_ / 64;
			int i_312_ = (i_309_ + 1) * i_302_ / 64 - 1;
			if (i_312_ < i_311_) {
				i_312_ = i_311_;
			}
			for (int i_313_ = 0; i_313_ < 64; i_313_++) {
				int i_314_ = i_307_ + i_313_;
				boolean bool_315_ = bool;
				if (bool_308_ && !method8573(i_310_, i_314_)) {
					bool_315_ = false;
				}
				int i_316_ = i_310_ + i_314_ * anInt6824;
				Object object = null;
				int i_319_ = (aByteArray6828[i_316_] & 0xff) << 16 | aShortArray6829[i_316_] & 0xffff;
				if (i_319_ != 0) {
					i_319_ |= ~0xffffff;
				}
				int i_320_ = aByteArray6830[i_316_] & 0xff;
				object = anObjectArray6833[i_316_];
				int i_321_ = i_313_ * i_302_ / 64;
				int i_322_ = (i_313_ + 1) * i_302_ / 64 - 1;
				if (i_322_ < i_321_) {
					i_322_ = i_321_;
				}
				if (object != null) {
					if (object instanceof Class480_Sub19) {
						Class480_Sub19 class480_sub19 = (Class480_Sub19) object;
						method8566(anIntArray6852, i_311_, i_312_, i_321_, i_322_, i_302_, bool_315_, i_319_, i_320_,
								aByteArray6831[i_316_], class480_sub19.anIntArray10142, class480_sub19.aByteArray10143,
								true);
					} else {
						Integer integer = (Integer) object;
						anIntArray6816[0] = integer.intValue();
						aByteArray6817[0] = aByteArray6869[i_316_];
						method8566(anIntArray6852, i_311_, i_312_, i_321_, i_322_, i_302_, bool_315_, i_319_, i_320_,
								aByteArray6831[i_316_], anIntArray6816, aByteArray6817, true);
					}
				} else {
					method8566(anIntArray6852, i_311_, i_312_, i_321_, i_322_, i_302_, bool_315_, i_319_, i_320_,
							aByteArray6831[i_316_], null, null, true);
				}
			}
		}
		if (bool_304_) {
			for (int i_323_ = 0; i_323_ < 64; i_323_++) {
				int i_324_ = i_306_ + i_323_;
				boolean bool_325_ = i_323_ == 0 && i_324_ != 0;
				for (int i_326_ = 0; i_326_ < 64; i_326_++) {
					int i_327_ = i_307_ + i_326_;
					if (!bool_308_ || method8573(i_324_, i_327_)) {
						boolean bool_328_ = i_326_ == 0 && i_327_ != 0;
						int i_329_ = i_324_ + i_327_ * anInt6824;
						if (bool_325_ && bool_328_) {
							method8595(class134, anIntArray6852, i_302_, -1, -1, i_324_ - 1, i_327_ - 1, i_329_ - 1
									- anInt6824);
						}
						if (bool_325_) {
							method8595(class134, anIntArray6852, i_302_, -1, i_326_, i_324_ - 1, i_327_, i_329_ - 1);
						}
						if (bool_328_) {
							method8595(class134, anIntArray6852, i_302_, i_323_, -1, i_324_, i_327_ - 1, i_329_
									- anInt6824);
						}
						method8595(class134, anIntArray6852, i_302_, i_323_, i_326_, i_324_, i_327_, i_329_);
					}
				}
			}
		}
		int i_330_ = i * 64 / 64;
		int i_331_ = i_301_ * 64 / 64;
		for (int i_332_ = 0; i_332_ < 3; i_332_++) {
			for (int i_333_ = 0; i_333_ < 64; i_333_++) {
				int i_334_ = i_306_ + i_333_;
				int i_335_ = i_334_ & 0x3f;
				int i_336_ = i_333_ * i_302_ / 64;
				int i_337_ = (i_333_ + 1) * i_302_ / 64 - 1;
				if (i_337_ < i_336_) {
					i_337_ = i_336_;
				}
				for (int i_338_ = 0; i_338_ < 64; i_338_++) {
					int i_339_ = i_307_ + i_338_;
					boolean bool_340_ = bool;
					if (bool_308_ && !method8573(i_334_, i_339_)) {
						bool_340_ = false;
					}
					int i_341_ = i_339_ & 0x3f;
					int i_342_ = i_338_ * i_302_ / 64;
					int i_343_ = (i_338_ + 1) * i_302_ / 64 - 1;
					if (i_343_ < i_342_) {
						i_343_ = i_342_;
					}
					HashMap hashmap = aHashMapArrayArrayArray6846[i_332_][i_330_][i_331_];
					if (hashmap != null) {
						Class500 class500 = (Class500) hashmap.get(Integer.valueOf((i_335_ << 8) + i_341_));
						if (class500 != null) {
							method8566(anIntArray6852, i_336_, i_337_, i_342_, i_343_, i_302_, bool_340_,
									class500.anInt6898, class500.aByte6897 & 0xff, class500.aByte6899,
									class500.anIntArray6900, class500.aByteArray6901, false);
						}
					}
				}
			}
			for (int i_344_ = 0; i_344_ < 64; i_344_++) {
				int i_345_ = i_306_ + i_344_;
				int i_346_ = i_345_ & 0x3f;
				for (int i_347_ = 0; i_347_ < 64; i_347_++) {
					int i_348_ = i_307_ + i_347_;
					if (!bool_308_ || method8573(i_345_, i_348_)) {
						int i_349_ = i_348_ & 0x3f;
						HashMap hashmap = aHashMapArrayArrayArray6846[i_332_][i_330_][i_331_];
						if (hashmap != null) {
							Class500 class500 = (Class500) hashmap.get(Integer.valueOf((i_346_ << 8) + i_349_));
							if (class500 != null) {
								method8568(class134, anIntArray6852, i_302_, i_344_, i_347_, class500.anIntArray6900,
										class500.aByteArray6901);
							}
						}
					}
				}
			}
		}
		if (bool_308_) {
			int i_350_ = 8;
			for (int i_351_ = 0; i_351_ < i_350_; i_351_++) {
				int i_352_ = i_306_ + i_351_ * 8;
				int i_353_ = i_351_ * i_302_ / i_350_;
				int i_354_ = (i_351_ + 1) * i_302_ / i_350_ - 1;
				for (int i_355_ = 0; i_355_ < i_350_; i_355_++) {
					int i_356_ = i_307_ + i_355_ * 8;
					if (!method8573(i_352_, i_356_)) {
						int i_357_ = i_355_ * i_302_ / i_350_;
						int i_358_ = (i_355_ + 1) * i_302_ / i_350_ - 1;
						if (i_302_ < 64) {
							method8578(anIntArray6852, i_353_, i_354_, i_357_, i_358_, i_302_);
						} else {
							aBoolArray6870[anInt6837] = method8573(i_352_, i_356_ + 8);
							aBoolArray6870[anInt6838] = method8573(i_352_ + 8, i_356_ + 8);
							aBoolArray6870[anInt6839] = method8573(i_352_ + 8, i_356_);
							aBoolArray6870[anInt6840] = method8573(i_352_ + 8, i_356_ - 8);
							aBoolArray6870[anInt6847] = method8573(i_352_, i_356_ - 8);
							aBoolArray6870[anInt6842] = method8573(i_352_ - 8, i_356_ - 8);
							aBoolArray6870[anInt6843] = method8573(i_352_ - 8, i_356_);
							aBoolArray6870[anInt6844] = method8573(i_352_ - 8, i_356_ + 8);
							method8633(anIntArray6852, i_353_, i_354_, i_357_, i_358_, i_302_);
						}
					}
				}
			}
		}
		aClass168_6848.put(i_303_, class134.createSprite(anIntArray6852, 0, i_302_, i_302_, i_302_, true));
	}

	static Deque method8592(Toolkit class134) {
		int i = anInt6862 - anInt6860;
		int i_359_ = anInt6861 - anInt6863;
		int i_360_ = (anInt6856 - anInt6864 << 16) / i;
		int i_361_ = (anInt6807 - anInt6865 << 16) / i_359_;
		return method8570(class134, i_360_, i_361_, 0, 0);
	}

	static void method8595(Toolkit class134, int[] is, int i, int i_362_, int i_363_, int i_364_, int i_365_, int i_366_) {
		Object object = anObjectArray6833[i_366_];
		if (object != null) {
			if (object instanceof Class480_Sub19) {
				Class480_Sub19 class480_sub19 = (Class480_Sub19) object;
				method8568(class134, is, i, i_362_, i_363_, class480_sub19.anIntArray10142,
						class480_sub19.aByteArray10143);
			} else {
				Integer integer = (Integer) object;
				anIntArray6816[0] = integer.intValue();
				aByteArray6817[0] = aByteArray6869[i_364_ + i_365_ * anInt6824];
				method8568(class134, is, i, i_362_, i_363_, anIntArray6816, aByteArray6817);
			}
		}
	}

	static void method8610() {
		aByteArray6819 = new byte[anInt6824 * anInt6826];
		aByteArray6830 = new byte[anInt6824 * anInt6826];
		aByteArray6831 = new byte[anInt6824 * anInt6826];
		anObjectArray6833 = new Object[anInt6824 * anInt6826];
		aByteArray6869 = new byte[anInt6824 * anInt6826];
		aHashMapArrayArrayArray6846 = new HashMap[3][anInt6824 >> 6][anInt6826 >> 6];
		anIntArray6800 = new int[aClass678_Sub19_6811.definitionCount * -522945077 + 1];
		aBoolArrayArray6804 = new boolean[anInt6824 / 8][anInt6826 / 8];
	}

	static boolean method8613(Class480_Sub31_Sub18 class480_sub31_sub18) {
		if (class480_sub31_sub18 != null && class480_sub31_sub18 != aClass480_Sub31_Sub18_6808) {
			aClass480_Sub31_Sub18_6808 = class480_sub31_sub18;
			aBool6834 = aClass480_Sub31_Sub18_6808.anInt11426 * 1943328861 == aClass560_6827.anInt7533 * -344647911;
			return true;
		}
		return false;
	}

	static void method8633(int[] is, int i, int i_367_, int i_368_, int i_369_, int i_370_) {
		int i_371_ = aClass560_6827.anInt7537 * -1382594383 >> 24 & 0xff;
		int i_372_ = 255 - i_371_;
		if ((!aBoolArray6870[anInt6837] || !aBoolArray6870[anInt6839] && !aBoolArray6870[anInt6843])
				&& (!aBoolArray6870[anInt6847] || !aBoolArray6870[anInt6839] && !aBoolArray6870[anInt6843])) {
			method8579(is, i, i_367_, i_368_, i_369_, i_370_, i_371_, i_372_, true, true, true, true);
			if (aBoolArray6870[anInt6838]) {
				is[(i_370_ - i_369_ - 1) * i_370_ + i_367_] = aClass560_6827.anInt7535 * -1489150795;
				is[(i_370_ - i_369_) * i_370_ + i_367_] = aClass560_6827.anInt7535 * -1489150795;
				is[(i_370_ - i_369_ - 1) * i_370_ + i_367_ - 1] = aClass560_6827.anInt7535 * -1489150795;
			}
			if (aBoolArray6870[anInt6840]) {
				is[(i_370_ - i_368_ - 1) * i_370_ + i_367_] = aClass560_6827.anInt7535 * -1489150795;
				is[(i_370_ - i_368_ - 2) * i_370_ + i_367_] = aClass560_6827.anInt7535 * -1489150795;
				is[(i_370_ - i_368_ - 1) * i_370_ + i_367_ - 1] = aClass560_6827.anInt7535 * -1489150795;
			}
			if (aBoolArray6870[anInt6842]) {
				is[(i_370_ - i_368_ - 1) * i_370_ + i] = aClass560_6827.anInt7535 * -1489150795;
				is[(i_370_ - i_368_ - 2) * i_370_ + i] = aClass560_6827.anInt7535 * -1489150795;
				is[(i_370_ - i_368_ - 1) * i_370_ + i + 1] = aClass560_6827.anInt7535 * -1489150795;
			}
			if (aBoolArray6870[anInt6844]) {
				is[(i_370_ - i_369_ - 1) * i_370_ + i] = aClass560_6827.anInt7535 * -1489150795;
				is[(i_370_ - i_369_) * i_370_ + i] = aClass560_6827.anInt7535 * -1489150795;
				is[(i_370_ - i_369_ - 1) * i_370_ + i + 1] = aClass560_6827.anInt7535 * -1489150795;
			}
		} else {
			if (aBoolArray6870[anInt6837] && aBoolArray6870[anInt6839]) {
				method8567(is, i_367_ - aClass560_6827.anInt7538 * -1993093695 + 1, i_369_ - aClass560_6827.anInt7538
						* -1993093695 + 1, i_370_, i_371_, i_372_, anInt6838);
			} else {
				method8579(is, i_367_ - aClass560_6827.anInt7538 * -1993093695 + 1, i_367_, i_369_
						- aClass560_6827.anInt7538 * -1993093695 + 1, i_369_, i_370_, i_371_, i_372_, true, true,
						false, false);
				if (aBoolArray6870[anInt6838]) {
					is[(i_370_ - i_369_ - 1) * i_370_ + i_367_] = aClass560_6827.anInt7535 * -1489150795;
					is[(i_370_ - i_369_) * i_370_ + i_367_] = aClass560_6827.anInt7535 * -1489150795;
					is[(i_370_ - i_369_ - 1) * i_370_ + i_367_ - 1] = aClass560_6827.anInt7535 * -1489150795;
				}
			}
			if (aBoolArray6870[anInt6847] && aBoolArray6870[anInt6839]) {
				method8567(is, i_367_ - aClass560_6827.anInt7538 * -1993093695 + 1, i_368_, i_370_, i_371_, i_372_,
						anInt6840);
			} else {
				method8579(is, i_367_ - aClass560_6827.anInt7538 * -1993093695 + 1, i_367_, i_368_, i_368_
						+ aClass560_6827.anInt7538 * -1993093695 - 1, i_370_, i_371_, i_372_, false, true, true, false);
				if (aBoolArray6870[anInt6840]) {
					is[(i_370_ - i_368_ - 1) * i_370_ + i_367_] = aClass560_6827.anInt7535 * -1489150795;
					is[(i_370_ - i_368_ - 2) * i_370_ + i_367_] = aClass560_6827.anInt7535 * -1489150795;
					is[(i_370_ - i_368_ - 1) * i_370_ + i_367_ - 1] = aClass560_6827.anInt7535 * -1489150795;
				}
			}
			if (aBoolArray6870[anInt6847] && aBoolArray6870[anInt6843]) {
				method8567(is, i, i_368_, i_370_, i_371_, i_372_, anInt6842);
			} else {
				method8579(is, i, i + aClass560_6827.anInt7538 * -1993093695 - 1, i_368_, i_368_
						+ aClass560_6827.anInt7538 * -1993093695 - 1, i_370_, i_371_, i_372_, false, false, true, true);
				if (aBoolArray6870[anInt6842]) {
					is[(i_370_ - i_368_ - 1) * i_370_ + i] = aClass560_6827.anInt7535 * -1489150795;
					is[(i_370_ - i_368_ - 2) * i_370_ + i] = aClass560_6827.anInt7535 * -1489150795;
					is[(i_370_ - i_368_ - 1) * i_370_ + i + 1] = aClass560_6827.anInt7535 * -1489150795;
				}
			}
			if (aBoolArray6870[anInt6837] && aBoolArray6870[anInt6843]) {
				method8567(is, i, i_369_ - aClass560_6827.anInt7538 * -1993093695 + 1, i_370_, i_371_, i_372_,
						anInt6844);
			} else {
				method8579(is, i, i + aClass560_6827.anInt7538 * -1993093695 - 1, i_369_ - aClass560_6827.anInt7538
						* -1993093695 + 1, i_369_, i_370_, i_371_, i_372_, true, false, false, true);
				if (aBoolArray6870[anInt6844]) {
					is[(i_370_ - i_369_ - 1) * i_370_ + i] = aClass560_6827.anInt7535 * -1489150795;
					is[(i_370_ - i_369_) * i_370_ + i] = aClass560_6827.anInt7535 * -1489150795;
					is[(i_370_ - i_369_ - 1) * i_370_ + i + 1] = aClass560_6827.anInt7535 * -1489150795;
				}
			}
			if (i + aClass560_6827.anInt7538 * -1993093695 < i_367_ - aClass560_6827.anInt7538 * -1993093695) {
				method8579(is, i + aClass560_6827.anInt7538 * -1993093695, i_367_ - aClass560_6827.anInt7538
						* -1993093695, i_368_, i_369_, i_370_, i_371_, i_372_, true, false, true, false);
			}
			if (i_368_ + aClass560_6827.anInt7538 * -1993093695 + 1 < i_369_ - aClass560_6827.anInt7538 * -1993093695
					- 1) {
				method8579(is, i, i + aClass560_6827.anInt7538 * -1993093695 - 1, i_368_ + aClass560_6827.anInt7538
						* -1993093695, i_369_ - aClass560_6827.anInt7538 * -1993093695, i_370_, i_371_, i_372_, false,
						false, false, true);
				method8579(is, i_367_ - aClass560_6827.anInt7538 * -1993093695 + 1, i_367_, i_368_
						+ aClass560_6827.anInt7538 * -1993093695, i_369_ - aClass560_6827.anInt7538 * -1993093695,
						i_370_, i_371_, i_372_, false, true, false, false);
			}
		}
	}

	static int method8635(TextureMetricsList class147, int i, int i_373_, int i_374_) {
		return method8577(aClass678_Sub19_6811, class147, i, i_373_, i_374_);
	}

	static void method8637() {
		for (int i = 0; i < anInt6824; i++) {
			for (int i_375_ = 0; i_375_ < anInt6826; i_375_++) {
				Object object = anObjectArray6833[i + i_375_ * anInt6824];
				if (object != null) {
					if (object instanceof Class480_Sub19) {
						Class480_Sub19 class480_sub19 = (Class480_Sub19) object;
						for (int i_376_ = 0; i_376_ < class480_sub19.anIntArray10142.length; i_376_++) {
							ObjectDefinition class544 = aClass678_Sub17_6802
									.get(class480_sub19.anIntArray10142[i_376_]);
							int i_377_ = class544.mapFunction * 1294173105;
							if (class544.morphisms != null) {
								class544 = class544.method9255(anInterface14_6806, anInterface12_6805);
								if (class544 != null) {
									i_377_ = class544.mapFunction * 1294173105;
								}
							}
							if (i_377_ != -1) {
								Class480_Sub37 class480_sub37 = new Class480_Sub37(i_377_);
								class480_sub37.anInt10310 = i * 579363759;
								class480_sub37.anInt10308 = i_375_ * 1018598297;
								aClass644_6820.pushBack(class480_sub37);
							}
						}
					} else {
						Integer integer = (Integer) object;
						ObjectDefinition definition = aClass678_Sub17_6802.get(integer.intValue());
						int i_378_ = definition.mapFunction * 1294173105;
						if (definition.morphisms != null) {
							definition = definition.method9255(anInterface14_6806, anInterface12_6805);

							if (definition != null) {
								i_378_ = definition.mapFunction * 1294173105;
							}
						}
						if (i_378_ != -1) {
							Class480_Sub37 class480_sub37 = new Class480_Sub37(i_378_);
							class480_sub37.anInt10310 = i * 579363759;
							class480_sub37.anInt10308 = i_375_ * 1018598297;
							aClass644_6820.pushBack(class480_sub37);
						}
					}
				}
			}
		}
		for (int i = 0; i < 3; i++) {
			for (int i_379_ = 0; i_379_ < aHashMapArrayArrayArray6846[0].length; i_379_++) {
				for (int i_380_ = 0; i_380_ < aHashMapArrayArrayArray6846[0][0].length; i_380_++) {
					HashMap hashmap = aHashMapArrayArrayArray6846[i][i_379_][i_380_];
					if (hashmap != null) {
						Iterator iterator = hashmap.values().iterator();
						while (iterator.hasNext()) {
							Class500 class500 = (Class500) iterator.next();
							if (class500.anIntArray6900 != null) {
								for (int i_381_ = 0; i_381_ < class500.anIntArray6900.length; i_381_++) {
									ObjectDefinition class544 = aClass678_Sub17_6802
											.get(class500.anIntArray6900[i_381_]);
									int i_382_ = class544.mapFunction * 1294173105;
									if (class544.morphisms != null) {
										class544 = class544.method9255(anInterface14_6806, anInterface12_6805);
										if (class544 != null) {
											i_382_ = class544.mapFunction * 1294173105;
										}
									}
									if (i_382_ != -1) {
										Class480_Sub37 class480_sub37 = new Class480_Sub37(i_382_);
										class480_sub37.anInt10310 = ((i_379_ + (anInt6849 >> 6)) * 64
												+ class500.aByte6896 - anInt6849) * 579363759;
										class480_sub37.anInt10308 = ((i_380_ + (anInt6823 >> 6)) * 64
												+ class500.aByte6895 - anInt6823) * 1018598297;
										aClass644_6820.pushBack(class480_sub37);
									}
								}
							}
						}
					}
				}
			}
		}
	}

	Class495() throws Throwable {
		throw new Error();
	}

	public static int method15087() {
		if (2.0 == aFloat6835) {
			return 25;
		} else if (aFloat6835 == 3.0) {
			return 37;
		} else if (aFloat6835 == 4.0) {
			return 50;
		} else if (6.0 == aFloat6835) {
			return 75;
		} else if (aFloat6835 == 8.0) {
			return 100;
		}
	
		return 200;
	}
}
