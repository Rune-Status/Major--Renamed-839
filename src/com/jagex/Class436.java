package com.jagex;

public class Class436 {
	static int[] UNDERLAY_FACE_COUNT;
	static final int anInt4925 = 0;
	static boolean[][] aBoolArrayArray4926;
	static int[] anIntArray4936;
	static final int anInt4948 = 0;
	static final int anInt4949 = 1;
	static final int anInt4951 = 3;
	static final int anInt4952 = 8;
	static final int anInt4953 = 2;
	static int[][] anIntArrayArray4954;
	static int[][] anIntArrayArray4955;
	static int[][] anIntArrayArray4956;
	static final int anInt4957 = 32;
	static final int anInt4958 = 64;
	static final int anInt4959 = 128;
	static int[][] anIntArrayArray4960;
	static final int anInt4961 = 512;
	static int[] OVERLAY_FACE_COUNT = { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };
	static int[] anIntArray4963;
	static int[] anIntArray4964;
	static int[][] anIntArrayArray4965;
	static int[] anIntArray4966;
	static int[][] anIntArrayArray4967;
	static boolean[][] aBoolArrayArray4970;
	static final int anInt4972 = 16;
	static int[][] anIntArrayArray4973;
	static boolean[][] aBoolArrayArray4975;
	static final int anInt4976 = 256;
	static int[][] anIntArrayArray4977;
	static int[][] anIntArrayArray4978;
	static final int anInt4979 = 2;
	static boolean[][] aBoolArrayArray4980;
	static int[][] anIntArrayArray4982;
	static int[] anIntArray4984;
	static final int anInt4986 = 4;
	static final int anInt4988 = 1;
	static int[] anIntArray4989;
	static int[][] anIntArrayArray5008;
	public static Archive models;
	static {
		UNDERLAY_FACE_COUNT = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };
		anIntArray4964 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray4989 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };
		anIntArray4966 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };
		anIntArray4963 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };
		anIntArray4936 = new int[] { 0, 256, 512, 512, 512, 256, 0, 0, 128, 256, 128, 384, 256 };
		anIntArray4984 = new int[] { 0, 0, 0, 256, 512, 512, 512, 256, 256, 384, 128, 128, 256 };
		aBoolArrayArray4970 = new boolean[][] {
				{ true, true, true, true, true, true, true, true, true, true, true, true, true },
				{ true, true, true, false, false, false, true, true, false, false, false, false, true },
				{ true, false, false, false, false, true, true, true, false, false, false, false, false },
				{ false, false, true, true, true, true, false, false, false, false, false, false, false },
				{ true, true, true, true, true, true, false, false, false, false, false, false, false },
				{ true, true, true, false, false, true, true, true, false, false, false, false, false },
				{ true, true, false, false, false, true, true, true, false, false, false, false, true },
				{ true, true, false, false, false, false, false, true, false, false, false, false, false },
				{ false, true, true, true, true, true, true, true, false, false, false, false, false },
				{ true, false, false, false, true, true, true, true, true, true, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false },
				{ true, true, true, false, false, false, false, false, false, false, true, true, false },
				{ false, false, false, false, false, false, false, false, false, false, false, false, false },
				{ true, true, true, true, true, true, true, true, true, true, true, true, true },
				{ false, false, false, false, false, false, false, false, false, false, false, false, false } };
		aBoolArrayArray4926 = new boolean[][] {
				{ false, false, false, false, false, false, false, false, false, false, false, false, false },
				{ false, false, true, true, true, true, true, false, false, false, false, false, true },
				{ true, true, true, true, true, true, false, false, false, false, false, false, false },
				{ true, true, true, false, false, true, true, true, false, false, false, false, false },
				{ true, false, false, false, false, true, true, true, false, false, false, false, false },
				{ false, false, true, true, true, true, false, false, false, false, false, false, false },
				{ false, true, true, true, true, true, false, false, false, false, false, false, true },
				{ false, true, true, true, true, true, true, true, false, false, false, false, true },
				{ true, true, false, false, false, false, false, true, false, false, false, false, false },
				{ true, true, true, true, true, false, false, false, true, true, false, false, false },
				{ true, false, false, false, true, true, true, true, true, true, false, false, false },
				{ true, false, true, true, true, true, true, true, false, false, true, true, false },
				{ true, true, true, true, true, true, true, true, true, true, true, true, true },
				{ false, false, false, false, false, false, false, false, false, false, false, false, false },
				{ true, true, true, true, true, true, true, true, true, true, true, true, true } };
		anIntArrayArray4967 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 },
				{ 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 },
				{ 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
		anIntArrayArray4973 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 },
				{ 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 },
				{ 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };
		anIntArrayArray4955 = new int[][] { { 6, 6 }, { 6, 6 }, { 6, 5, 5 }, { 5, 6, 5 }, { 5, 5, 6 }, { 6, 5, 5 },
				{ 5, 0, 4, 1 }, { 7, 7, 1, 2 }, { 7, 1, 2, 7 }, { 8, 9, 4, 0, 8, 9 }, { 0, 8, 9, 8, 9, 4 },
				{ 11, 0, 10, 11, 4, 2 }, { 6, 6 }, { 7, 7, 1, 2 }, { 7, 7, 1, 2 } };
		aBoolArrayArray4975 = new boolean[][] { { false, false, false, false }, { false, false, false, false },
				{ false, false, true, false }, { false, false, true, false }, { false, false, true, false },
				{ false, false, true, false }, { true, false, true, false }, { true, false, false, true },
				{ true, false, false, true }, { false, false, false, false }, { false, false, false, false },
				{ false, false, false, false }, { false, false, false, false } };
		anIntArrayArray4956 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 },
				{ 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 },
				{ 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };
		anIntArrayArray4977 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 },
				{ 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 },
				{ 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };
		anIntArrayArray4978 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 },
				{ 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 },
				{ 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };
		anIntArrayArray4960 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 },
				{ 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 },
				{ 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };
		aBoolArrayArray4980 = new boolean[][] { { false, false, false, false }, { false, true, true, false },
				{ true, false, true, false }, { true, false, true, false }, { false, false, true, false },
				{ false, false, true, false }, { true, false, true, false }, { true, false, false, true },
				{ true, false, false, true }, { true, true, false, false }, { false, false, false, false },
				{ false, true, false, true }, { false, false, false, false } };
		anIntArrayArray4954 = new int[][] { { 0, 1, 2, 3 }, { 1, -1, -1, 0 }, { -1, 2, -1, 0 }, { -1, 0, -1, 2 },
				{ 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 3, 4, -1 }, { -1, 0, 2, -1 },
				{ -1, -1, 2, 0 }, { 0, 2, 5, 3 }, { 0, -1, 6, -1 }, { 0, 1, 2, 3 } };
		anIntArrayArray4982 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 3, 5, 3 }, { 6, 0, 2, 4 }, { 2, 5, 6, 1 },
				{ 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 7, 1, 2, 4, 6 }, { 2, 4, 4, 7 },
				{ 6, 6, 4, 0, 1, 1, 3, 3 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 3, 7, 0, 4, 3 }, { 0, 2, 4, 6 } };
		anIntArrayArray4965 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 },
				{ 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 },
				{ 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };
		anIntArrayArray5008 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12, 12, 5 }, { 5, 5, 1, 1 },
				{ 5, 1, 1, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 12, 12, 12, 12, 12 },
				{ 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 3, 1, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 7, 3, 7 },
				{ 12, 12, 12, 12 } };
	}

	public static Class480_Sub31_Sub18 method7271() {
		return Class495.aClass480_Sub31_Sub18_6808;
	}

	static boolean method7269() {
		if (null == Class56.aClass480_Sub31_Sub17_647) {
			return false;
		}
		if (Class56.aClass480_Sub31_Sub17_647.type * -20536735 >= 2000) {
			Class56.aClass480_Sub31_Sub17_647.type -= -1044071984;
		}
		return 1007 == Class56.aClass480_Sub31_Sub17_647.type * -20536735;
	}

	protected byte[][][] aByteArrayArrayArray4922;
	UnderlayDefinitionLoader underlayLoader;
	protected Class490 aClass490_4924;
	public boolean aBool4927;
	public boolean aBool4928;
	public boolean aBool4929;
	int[] anIntArray4930;
	OverlayDefinitionLoader overlayLoader;
	protected int width;
	int[] anIntArray4933;
	public boolean underwater;
	public int[][][] tileHeights;
	protected boolean aBool4937;
	byte[][][] tileTypes;
	public boolean aBool4939;
	short[][][] underlays;
	short[][][] overlays;
	public int anInt4942 = 0;
	int[] anIntArray4943;
	int[] anIntArray4944;
	int[] anIntArray4945;
	int[] anIntArray4946;
	int[] anIntArray4947;
	protected TileFlags aClass425_4950;
	boolean aBool4968;
	public int anInt4969;
	public byte[][][] aByteArrayArrayArray4971;
	byte[][][] tileDirections;
	boolean aBool4981;
	int[] anIntArray4983;
	int[] anIntArray4985;
	int[] anIntArray4987;
	int[] anIntArray4990;
	int[] anIntArray4991;
	int anInt4992;
	int anInt4993;
	int anInt4994;
	int anInt4995;
	int[] anIntArray4996;
	int anInt4997;
	int anInt4998;
	int overlayTexture;
	protected int length;
	boolean aBool5001;
	boolean aBool5002;
	int underlayFaces;
	int overlayFaces;
	int[] anIntArray5005;
	int[] anIntArray5006;
	int[] anIntArray5007;

	Class436(Class490 class490, int i, int width, int length, boolean bool, OverlayDefinitionLoader overlayLoader,
			UnderlayDefinitionLoader underlayLoader, TileFlags class425) {
		aBool4939 = false;
		aBool4928 = false;
		aBool4929 = false;
		aBool4927 = false;
		anIntArray4985 = new int[6];
		anIntArray5007 = new int[13];
		anIntArray4987 = new int[13];
		anIntArray4946 = new int[13];
		anIntArray4933 = new int[13];
		anIntArray4990 = new int[13];
		anIntArray4991 = new int[13];
		anIntArray4983 = null;
		aClass490_4924 = class490;
		anInt4969 = i * -543710703;
		this.width = 1192850619 * width;
		this.length = -85173099 * length;
		underwater = bool;
		this.overlayLoader = overlayLoader;
		this.underlayLoader = underlayLoader;
		aClass425_4950 = class425;
		underlays = new short[anInt4969 * -710177039][1626386547 * width][-1252946243 * length];
		overlays = new short[anInt4969 * -710177039][width * 1626386547][-1252946243 * length];
		tileTypes = new byte[anInt4969 * -710177039][1626386547 * width][length * -1252946243];
		tileDirections = new byte[anInt4969 * -710177039][1626386547 * width][-1252946243 * length];
		tileHeights = new int[anInt4969 * -710177039][1626386547 * width + 1][1 + -1252946243 * length];
		aByteArrayArrayArray4922 = new byte[anInt4969 * -710177039][width * 1626386547 + 1][length * -1252946243 + 1];
	}

	public void method7192() {
		aBool4937 = true;
	}

	public final void method7194(int i, int i_0_, int i_1_, int i_2_) {
		for (int i_4_ = 0; i_4_ < -710177039 * anInt4969; i_4_++) {
			method7195(i_4_, i, i_0_, i_1_, i_2_);
		}
	}

	public final void method7195(int plane, int i_5_, int i_6_, int i_7_, int i_8_) {
		for (int z = i_6_; z < i_8_ + i_6_; z++) {
			for (int x = i_5_; x < i_7_ + i_5_; x++) {
				if (x >= 0 && x < 1626386547 * width && z >= 0 && z < length * -1252946243) {
					tileHeights[plane][x][z] = plane > 0 ? tileHeights[plane - 1][x][z] - 960 : 0;
				}
			}
		}
		if (i_5_ > 0 && i_5_ < 1626386547 * width) {
			for (int z = i_6_ + 1; z < i_8_ + i_6_; z++) {
				if (z >= 0 && z < -1252946243 * length) {
					tileHeights[plane][i_5_][z] = tileHeights[plane][i_5_ - 1][z];
				}
			}
		}
		if (i_6_ > 0 && i_6_ < -1252946243 * length) {
			for (int x = 1 + i_5_; x < i_5_ + i_7_; x++) {
				if (x >= 0 && x < 1626386547 * width) {
					tileHeights[plane][x][i_6_] = tileHeights[plane][x][i_6_ - 1];
				}
			}
		}

		if (i_5_ >= 0 && i_6_ >= 0 && i_5_ < width * 1626386547 && i_6_ < length * -1252946243) {
			if (plane == 0) {
				if (i_5_ > 0 && tileHeights[plane][i_5_ - 1][i_6_] != 0) {
					tileHeights[plane][i_5_][i_6_] = tileHeights[plane][i_5_ - 1][i_6_];
				} else if (i_6_ > 0 && 0 != tileHeights[plane][i_5_][i_6_ - 1]) {
					tileHeights[plane][i_5_][i_6_] = tileHeights[plane][i_5_][i_6_ - 1];
				} else if (i_5_ > 0 && i_6_ > 0 && 0 != tileHeights[plane][i_5_ - 1][i_6_ - 1]) {
					tileHeights[plane][i_5_][i_6_] = tileHeights[plane][i_5_ - 1][i_6_ - 1];
				}
			} else if (i_5_ > 0 && tileHeights[plane - 1][i_5_ - 1][i_6_] != tileHeights[plane][i_5_ - 1][i_6_]) {
				tileHeights[plane][i_5_][i_6_] = tileHeights[plane][i_5_ - 1][i_6_];
			} else if (i_6_ > 0 && tileHeights[plane][i_5_][i_6_ - 1] != tileHeights[plane - 1][i_5_][i_6_ - 1]) {
				tileHeights[plane][i_5_][i_6_] = tileHeights[plane][i_5_][i_6_ - 1];
			} else if (i_5_ > 0 && i_6_ > 0
					&& tileHeights[plane - 1][i_5_ - 1][i_6_ - 1] != tileHeights[plane][i_5_ - 1][i_6_ - 1]) {
				tileHeights[plane][i_5_][i_6_] = tileHeights[plane][i_5_ - 1][i_6_ - 1];
			}
		}
	}

	public final void method7197(Buffer buffer, int i, int i_14_, int i_15_, int i_16_, int i_17_, int i_18_,
			int i_19_, int i_20_) {
		int i_21_ = 8 * (i_17_ & 0x7);
		int i_22_ = (i_18_ & 0x7) * 8;
		int i_23_ = (i_17_ & ~0x7) << 3;
		int i_24_ = (i_18_ & ~0x7) << 3;
		int i_25_ = 0;
		int i_26_ = 0;
		if (1 == i_19_) {
			i_26_ = 1;
		} else if (i_19_ == 2) {
			i_25_ = 1;
			i_26_ = 1;
		} else if (3 == i_19_) {
			i_25_ = 1;
		}
		for (int i_27_ = 0; i_27_ < -710177039 * anInt4969; i_27_++) {
			for (int i_28_ = 0; i_28_ < 64; i_28_++) {
				for (int i_29_ = 0; i_29_ < 64; i_29_++) {
					if (i_27_ == i_16_ && i_28_ >= i_21_ && i_28_ <= i_21_ + 8 && i_29_ >= i_22_ && i_29_ <= i_22_ + 8) {
						int i_30_;
						int i_31_;
						if (i_28_ == i_21_ + 8 || i_29_ == i_22_ + 8) {
							if (0 == i_19_) {
								i_30_ = i_28_ - i_21_ + i_14_;
								i_31_ = i_29_ - i_22_ + i_15_;
							} else if (1 == i_19_) {
								i_30_ = i_14_ + i_29_ - i_22_;
								i_31_ = 8 + i_15_ - (i_28_ - i_21_);
							} else if (i_19_ == 2) {
								i_30_ = i_14_ + 8 - (i_28_ - i_21_);
								i_31_ = i_15_ + 8 - (i_29_ - i_22_);
							} else {
								i_30_ = 8 + i_14_ - (i_29_ - i_22_);
								i_31_ = i_15_ + i_28_ - i_21_;
							}
							method7198(buffer, i, i_30_, i_31_, 0, 0, i_23_ + i_28_, i_29_ + i_24_, 0, true);
						} else {
							i_30_ = i_14_ + Class166_Sub15.method15125(i_28_ & 0x7, i_29_ & 0x7, i_19_);
							i_31_ = i_15_ + Class55.method1183(i_28_ & 0x7, i_29_ & 0x7, i_19_);
							method7198(buffer, i, i_30_, i_31_, i_25_, i_26_, i_23_ + i_28_, i_29_ + i_24_, i_19_,
									false);
						}
						if (i_28_ == 63 || i_29_ == 63) {
							int i_32_ = 1;
							if (i_28_ == 63 && 63 == i_29_) {
								i_32_ = 3;
							}
							for (int i_33_ = 0; i_33_ < i_32_; i_33_++) {
								int i_34_ = i_28_;
								int i_35_ = i_29_;
								if (0 == i_33_) {
									i_34_ = 63 == i_28_ ? 64 : i_28_;
									i_35_ = 63 == i_29_ ? 64 : i_29_;
								} else if (1 == i_33_) {
									i_34_ = 64;
								} else if (2 == i_33_) {
									i_35_ = 64;
								}
								int i_36_;
								int i_37_;
								if (i_19_ == 0) {
									i_36_ = i_14_ + i_34_ - i_21_;
									i_37_ = i_35_ - i_22_ + i_15_;
								} else if (1 == i_19_) {
									i_36_ = i_14_ + i_35_ - i_22_;
									i_37_ = i_15_ + 8 - (i_34_ - i_21_);
								} else if (i_19_ == 2) {
									i_36_ = 8 + i_14_ - (i_34_ - i_21_);
									i_37_ = i_15_ + 8 - (i_35_ - i_22_);
								} else {
									i_36_ = i_14_ + 8 - (i_35_ - i_22_);
									i_37_ = i_34_ - i_21_ + i_15_;
								}
								if (i_36_ >= 0 && i_36_ < width * 1626386547 && i_37_ >= 0
										&& i_37_ < length * -1252946243) {
									tileHeights[i][i_36_][i_37_] = tileHeights[i][i_30_ + i_25_][i_26_ + i_31_];
								}
							}
						}
					} else {
						method7198(buffer, 0, -1, -1, 0, 0, 0, 0, 0, false);
					}
				}
			}
		}
	}

	public final void method7201(Toolkit class134, Ground class120, Ground class120_50_, int i) {
		int[][] is = new int[1626386547 * width][length * -1252946243];
		if (null == anIntArray4943 || anIntArray4943.length != length * -1252946243) {
			anIntArray4943 = new int[length * -1252946243];
			anIntArray4944 = new int[-1252946243 * length];
			anIntArray4945 = new int[length * -1252946243];
			anIntArray4996 = new int[length * -1252946243];
			anIntArray4947 = new int[-1252946243 * length];
		}
		for (int i_51_ = 0; i_51_ < -710177039 * anInt4969; i_51_++) {
			for (int i_52_ = 0; i_52_ < length * -1252946243; i_52_++) {
				anIntArray4943[i_52_] = 0;
				anIntArray4944[i_52_] = 0;
				anIntArray4945[i_52_] = 0;
				anIntArray4996[i_52_] = 0;
				anIntArray4947[i_52_] = 0;
			}
			for (int i_53_ = -5; i_53_ < 1626386547 * width; i_53_++) {
				for (int i_54_ = 0; i_54_ < -1252946243 * length; i_54_++) {
					int i_55_ = 5 + i_53_;
					if (i_55_ < width * 1626386547) {
						int i_56_ = underlays[i_51_][i_55_][i_54_] & 0x7fff;
						if (i_56_ > 0) {
							UnderlayDefinition class646 = underlayLoader.get(i_56_ - 1);
							anIntArray4943[i_54_] += -1258410943 * class646.hue;
							anIntArray4944[i_54_] += -1056540465 * class646.saturation;
							anIntArray4945[i_54_] += -1022526453 * class646.lightness;
							anIntArray4996[i_54_] += -2030998007 * class646.chroma;
							anIntArray4947[i_54_]++;
						}
					}
					int i_57_ = i_53_ - 5;
					if (i_57_ >= 0) {
						int i_58_ = underlays[i_51_][i_57_][i_54_] & 0x7fff;
						if (i_58_ > 0) {
							UnderlayDefinition class646 = underlayLoader.get(i_58_ - 1);
							anIntArray4943[i_54_] -= -1258410943 * class646.hue;
							anIntArray4944[i_54_] -= -1056540465 * class646.saturation;
							anIntArray4945[i_54_] -= class646.lightness * -1022526453;
							anIntArray4996[i_54_] -= -2030998007 * class646.chroma;
							anIntArray4947[i_54_]--;
						}
					}
				}
				if (i_53_ >= 0) {
					int i_59_ = 0;
					int i_60_ = 0;
					int i_61_ = 0;
					int i_62_ = 0;
					int i_63_ = 0;
					for (int i_64_ = -5; i_64_ < length * -1252946243; i_64_++) {
						int i_65_ = 5 + i_64_;
						if (i_65_ < -1252946243 * length) {
							i_59_ += anIntArray4943[i_65_];
							i_60_ += anIntArray4944[i_65_];
							i_61_ += anIntArray4945[i_65_];
							i_62_ += anIntArray4996[i_65_];
							i_63_ += anIntArray4947[i_65_];
						}
						int i_66_ = i_64_ - 5;
						if (i_66_ >= 0) {
							i_59_ -= anIntArray4943[i_66_];
							i_60_ -= anIntArray4944[i_66_];
							i_61_ -= anIntArray4945[i_66_];
							i_62_ -= anIntArray4996[i_66_];
							i_63_ -= anIntArray4947[i_66_];
						}
						if (i_64_ >= 0 && i_62_ > 0 && i_63_ > 0) {
							is[i_53_][i_64_] = ReferenceTable.method6964(256 * i_59_ / i_62_, i_60_ / i_63_, i_61_
									/ i_63_, (short) -19927);
						}
					}
				}
			}
			if (aBool4929) {
				method7203(class134, aClass490_4924.aClass120Array6700[i_51_], i_51_, is, i_51_ == 0 ? class120 : null,
						0 == i_51_ ? class120_50_ : null, 1177021808);
			} else {
				method7238(class134, aClass490_4924.aClass120Array6700[i_51_], i_51_, is, i_51_ == 0 ? class120 : null,
						0 == i_51_ ? class120_50_ : null);
			}
			underlays[i_51_] = null;
			overlays[i_51_] = null;
			tileTypes[i_51_] = null;
			tileDirections[i_51_] = null;
		}
		if (!underwater) {
			if (0 != 2146140159 * anInt4942) {
				aClass490_4924.method8406(1143175765);
			}
			if (aBool4928) {
				aClass490_4924.method8367(-1547714459);
			}
		}
		for (int i_67_ = 0; i_67_ < -710177039 * anInt4969; i_67_++) {
			aClass490_4924.aClass120Array6700[i_67_].finish();
		}
	}

	public void method7219() {
		anIntArray4943 = null;
		anIntArray4944 = null;
		anIntArray4945 = null;
		anIntArray4996 = null;
		anIntArray4947 = null;
		aBool4937 = false;
	}

	public final void method7245(Buffer buffer, int dx, int dz, int i_317_, int i_318_) {
		int i_320_ = dx + i_317_;
		int i_321_ = dz + i_318_;

		for (int plane = 0; plane < anInt4969 * -710177039; plane++) {
			for (int x = 0; x < 64; x++) {
				for (int z = 0; z < 64; z++) {
					method7198(buffer, plane, x + dx, dz + z, 0, 0, x + i_320_, i_321_ + z, 0, false);
				}
			}
		}
	}

	public void method7260(Toolkit toolkit, int[][][] is) {
		for (int plane = 0; plane < anInt4969 * -710177039; plane++) {
			int i_326_ = 0;
			int i_327_ = 0;

			if (!underwater) {
				if (aBool4939) {
					i_327_ |= 0x8;
				}

				if (aBool4928) {
					i_326_ |= 0x2;
				}

				if (0 != 2146140159 * anInt4942) {
					i_326_ |= 0x1;
					i_327_ |= 0x10;
				}
			}

			if (aBool4928) {
				i_327_ |= 0x7;
			}

			if (!aBool4927) {
				i_327_ |= 0x20;
			}

			int[][] is_328_ = is != null && plane < is.length ? is[plane] : tileHeights[plane];
			aClass490_4924.method8320(plane, toolkit.createGround(1626386547 * width, length * -1252946243,
					tileHeights[plane], is_328_, 512, i_326_, i_327_));
		}
	}

	public final void offsetTileHeights(int plane, int[][] offsets) {
		int[][] height = tileHeights[plane];
		for (int x = 0; x < 1 + width * 1626386547; x++) {
			for (int z = 0; z < -1252946243 * length + 1; z++) {
				height[x][z] += offsets[x][z];
			}
		}
	}

	final void method7198(Buffer buffer, int plane, int i_38_, int i_39_, int i_40_, int i_41_, int i_42_, int i_43_,
			int i_44_, boolean bool) {
		if (i_44_ == 1) {
			i_41_ = 1;
		} else if (2 == i_44_) {
			i_40_ = 1;
			i_41_ = 1;
		} else if (3 == i_44_) {
			i_40_ = 1;
		}
		if (i_38_ >= 0 && i_38_ < width * 1626386547 && i_39_ >= 0 && i_39_ < -1252946243 * length) {
			if (!underwater && !bool) {
				aClass425_4950.flags[plane][i_38_][i_39_] = (byte) 0;
			}
			int i_46_ = buffer.readUByte();
			if (0 != (i_46_ & 0x1)) {
				if (bool) {
					buffer.readUByte();
					buffer.readUSmart();
				} else {
					int i_47_ = buffer.readUByte();
					overlays[plane][i_38_][i_39_] = (short) buffer.readUSmart();
					tileTypes[plane][i_38_][i_39_] = (byte) (i_47_ >> 2);
					tileDirections[plane][i_38_][i_39_] = (byte) (i_47_ + i_44_ & 0x3);
				}
			}
			if ((i_46_ & 0x2) != 0) {
				if (!underwater && !bool) {
					aClass425_4950.flags[plane][i_38_][i_39_] = buffer.readByte();
				} else {
					buffer.offset += 1258142129;
				}
			}
			if (0 != (i_46_ & 0x4)) {
				if (bool) {
					buffer.readUSmart();
				} else {
					underlays[plane][i_38_][i_39_] = (short) buffer.readUSmart();
				}
			}
			if (0 != (i_46_ & 0x8)) {
				int i_48_ = buffer.readUByte();
				if (!underwater) {
					if (1 == i_48_) {
						i_48_ = 0;
					}
					if (0 == plane) {
						tileHeights[0][i_38_ + i_40_][i_39_ + i_41_] = 8 * -i_48_ << 2;
					} else {
						tileHeights[plane][i_38_ + i_40_][i_39_ + i_41_] = tileHeights[plane - 1][i_38_ + i_40_][i_39_
								+ i_41_]
								- (8 * i_48_ << 2);
					}
				} else {
					tileHeights[0][i_40_ + i_38_][i_39_ + i_41_] = i_48_ * 8 << 2;
				}
			} else if (underwater) {
				tileHeights[0][i_38_ + i_40_][i_41_ + i_39_] = 0;
			} else if (plane == 0) {
				tileHeights[0][i_38_ + i_40_][i_39_ + i_41_] = -Ground.calculateTileHeight(932731 + i_42_,
						556238 + i_43_) * 8 << 2;
			} else {
				tileHeights[plane][i_40_ + i_38_][i_41_ + i_39_] = tileHeights[plane - 1][i_40_ + i_38_][i_41_ + i_39_] - 960;
			}
		} else {
			int i_49_ = buffer.readUByte();
			if ((i_49_ & 0x1) != 0) {
				buffer.readUByte();
				buffer.readUSmart();
			}
			if (0 != (i_49_ & 0x2)) {
				buffer.offset += 1258142129;
			}
			if ((i_49_ & 0x4) != 0) {
				buffer.readUSmart();
			}
			if (0 != (i_49_ & 0x8)) {
				buffer.readUByte();
			}
		}
	}

	void method7203(Toolkit class134, Ground class120, int i, int[][] is, Ground class120_68_, Ground class120_69_,
			int i_70_) {
		byte[][] is_71_ = tileTypes[i];
		byte[][] is_72_ = tileDirections[i];
		short[][] is_73_ = underlays[i];
		short[][] is_74_ = overlays[i];
		boolean[] bools = new boolean[4];
		for (int i_75_ = 0; i_75_ < width * 1626386547; i_75_++) {
			int i_76_ = i_75_ < width * 1626386547 - 1 ? 1 + i_75_ : i_75_;
			for (int i_77_ = 0; i_77_ < length * -1252946243; i_77_++) {
				int i_78_ = i_77_ < -1252946243 * length - 1 ? i_77_ + 1 : i_77_;
				anInt4992 = is_71_[i_75_][i_77_] * -1807126807;
				anInt4993 = is_72_[i_75_][i_77_] * 1789810925;
				int i_79_ = is_74_[i_75_][i_77_] & 0x7fff;
				int i_80_ = is_73_[i_75_][i_77_] & 0x7fff;
				if (0 != i_79_ || i_80_ != 0) {
					OverlayDefinition class590 = i_79_ != 0 ? overlayLoader.get(i_79_ - 1) : null;
					UnderlayDefinition class646 = 0 != i_80_ ? underlayLoader.get(i_80_ - 1) : null;
					if (0 == anInt4992 * -1139259047 && class590 == null) {
						anInt4992 = -210685204;
					}
					aBool4968 = false;
					aBool4981 = false;
					boolean[] bools_81_ = bools;
					boolean[] bools_82_ = bools;
					boolean[] bools_83_ = bools;
					bools[3] = false;
					bools_83_[2] = false;
					bools_82_[1] = false;
					bools_81_[0] = false;
					OverlayDefinition class590_84_ = class590;
					if (class590 != null) {
						if (class590.colour * -217720799 == -1 && -1041293597 * class590.blendColour == -1) {
							class590_84_ = class590;
							class590 = null;
						} else if (null != class646 && 0 != anInt4992 * -1139259047) {
							aBool4981 = class590.aBool7806;
						}
					}
					anInt4993 = method7222(i_80_, i_75_, i_77_, i_76_, i_78_, class120, is_73_, (byte) 46) * 1789810925;
					for (int i_85_ = 0; i_85_ < 13; i_85_++) {
						anIntArray4990[i_85_] = -1;
						anIntArray4991[i_85_] = 1;
					}
					method7205(class134, class590, class646, i_75_, i_77_, is_71_, is_72_, is_74_, bools, (byte) -24);
					aBool5001 = !aBool4981 && !bools[0] && !bools[2] && !bools[1] && !bools[3];
					method7206(class590, class646, -614340564);
					int i_86_ = underlayFaces * -1398807289 + 1887065007 * overlayFaces;
					if (i_86_ <= 0) {
						aClass490_4924.method8340(i, i_75_, i_77_);
					} else {
						if (bools[0]) {
							i_86_++;
						}
						if (bools[2]) {
							i_86_++;
						}
						if (bools[1]) {
							i_86_++;
						}
						if (bools[3]) {
							i_86_++;
						}
						anInt4994 = 0;
						anInt4995 = 0;
						int i_87_ = i_86_ * 3;
						int[] is_88_ = aBool5002 ? new int[i_87_] : null;
						int[] is_89_ = new int[i_87_];
						int[] is_90_ = new int[i_87_];
						int[] is_91_ = new int[i_87_];
						int[] is_92_ = new int[i_87_];
						int[] is_93_ = new int[i_87_];
						int[] is_94_ = null != class120_69_ ? new int[i_87_] : null;
						int[] is_95_ = null != class120_69_ || null != class120_68_ ? new int[i_87_] : null;
						for (int i_96_ = 0; i_96_ < i_87_; i_96_++) {
							is_92_[i_96_] = -1;
						}
						method7207(class134, i, i_75_, i_77_, class590, bools, is_88_, is_89_, is_90_, is_91_, is_92_,
								is_93_, is_94_, is_95_, class120, class120_69_, class120_68_, (byte) -117);
						int i_97_ = is_73_[i_75_][i_78_] & 0x7fff;
						int i_98_ = is_73_[i_76_][i_78_] & 0x7fff;
						int i_99_ = is_73_[i_76_][i_77_] & 0x7fff;
						method7208(class134, i, i_75_, i_77_, i_76_, i_78_, class646, i_80_, i_97_, i_98_, i_99_,
								bools, is_88_, is_89_, is_90_, is_91_, is_92_, is_93_, is_94_, is_95_, is, class120,
								class120_69_, class120_68_, (byte) -117);
						method7209(class120, class646, class590_84_, i, i_75_, i_77_, i_76_, i_78_, i_80_, i_79_,
								1031046879);
						Class150 class150 = new Class150();
						if (underwater) {
							class150.colour = aClass490_4924.method8369(i_75_, i_77_) * 791213269;
							class150.scale = aClass490_4924.method8316(i_75_, i_77_) * 1591951847;
							class150.intensity = aClass490_4924.method8378(i_75_, i_77_) * 1370254837;
							class150.anInt1848 = aClass490_4924.method8365(i_75_, i_77_) * 471935851;
							class150.anInt1847 = aClass490_4924.method8425(i_75_, i_77_) * -2072444281;
							class150.anInt1846 = aClass490_4924.method8466(i_75_, i_77_) * -1720335367;
						}
						class120.addBlendedTile(i_75_, i_77_, is_89_, is_94_, is_90_, is_95_, is_91_, is_88_, is_92_,
								is_93_, class150, aBool4968);
						aClass490_4924.method8340(i, i_75_, i_77_);
					}
				}
			}
		}
	}

	void method7205(Toolkit class134, OverlayDefinition class590, UnderlayDefinition class646, int i, int i_100_,
			byte[][] is, byte[][] is_101_, short[][] is_102_, boolean[] bools, byte i_103_) {
		boolean[] bools_104_ = null != class590 && class590.aBool7806 ? aBoolArrayArray4980[anInt4992 * -1139259047]
				: aBoolArrayArray4975[-1139259047 * anInt4992];
		method7210(class134, class590, class646, i, i_100_, width * 1626386547, length * -1252946243, is_102_, is,
				is_101_, bools, 89773755);
		aBool5002 = class590 != null && class590.colour * -217720799 != class590.blendColour * -1041293597;
		if (!aBool5002) {
			for (int i_105_ = 0; i_105_ < 8; i_105_++) {
				if (anIntArray4990[i_105_] >= 0 && anIntArray5007[i_105_] != anIntArray4987[i_105_]) {
					aBool5002 = true;
					break;
				}
			}
		}
		if (!bools_104_[1 + anInt4993 * 942261477 & 0x3]) {
			boolean[] bools_106_ = bools;
			int i_107_ = 1;
			bools_106_[i_107_] = bools_106_[i_107_] | (anIntArray4991[2] & anIntArray4991[4]) == 0;
		}
		if (!bools_104_[3 + anInt4993 * 942261477 & 0x3]) {
			boolean[] bools_108_ = bools;
			int i_109_ = 3;
			bools_108_[i_109_] = bools_108_[i_109_] | (anIntArray4991[6] & anIntArray4991[0]) == 0;
		}
		if (!bools_104_[942261477 * anInt4993 + 0 & 0x3]) {
			boolean[] bools_110_ = bools;
			int i_111_ = 0;
			bools_110_[i_111_] = bools_110_[i_111_] | (anIntArray4991[0] & anIntArray4991[2]) == 0;
		}
		if (!bools_104_[2 + anInt4993 * 942261477 & 0x3]) {
			boolean[] bools_112_ = bools;
			int i_113_ = 2;
			bools_112_[i_113_] = bools_112_[i_113_] | 0 == (anIntArray4991[4] & anIntArray4991[6]);
		}
		if (!aBool4981 && (-1139259047 * anInt4992 == 0 || anInt4992 * -1139259047 == 12)) {
			if (bools[0] && !bools[1] && !bools[2] && bools[3]) {
				boolean[] bools_114_ = bools;
				bools[3] = false;
				bools_114_[0] = false;
				anInt4992 = (-1139259047 * anInt4992 == 0 ? 13 : 14) * -1807126807;
				anInt4993 = 0;
			} else if (bools[0] && bools[1] && !bools[2] && !bools[3]) {
				boolean[] bools_115_ = bools;
				bools[1] = false;
				bools_115_[0] = false;
				anInt4992 = -1807126807 * (0 == -1139259047 * anInt4992 ? 13 : 14);
				anInt4993 = 1074465479;
			} else if (!bools[0] && bools[1] && bools[2] && !bools[3]) {
				boolean[] bools_116_ = bools;
				bools[2] = false;
				bools_116_[1] = false;
				anInt4992 = -1807126807 * (0 == -1139259047 * anInt4992 ? 13 : 14);
				anInt4993 = -715345446;
			} else if (!bools[0] && !bools[1] && bools[2] && bools[3]) {
				boolean[] bools_117_ = bools;
				bools[3] = false;
				bools_117_[2] = false;
				anInt4992 = (0 == anInt4992 * -1139259047 ? 13 : 14) * -1807126807;
				anInt4993 = 1789810925;
			}
		}
	}

	void method7206(OverlayDefinition class590, UnderlayDefinition class646, int i) {
		if (aBool5001) {
			anIntArray5005 = anIntArrayArray4967[-1139259047 * anInt4992];
			anIntArray5006 = anIntArrayArray4973[anInt4992 * -1139259047];
			anIntArray4930 = anIntArrayArray4955[-1139259047 * anInt4992];
			overlayFaces = 1974788943 * (class590 != null ? OVERLAY_FACE_COUNT[anInt4992 * -1139259047] : 0);
			underlayFaces = 686323895 * (null != class646 ? UNDERLAY_FACE_COUNT[-1139259047 * anInt4992] : 0);
		} else if (aBool4981) {
			anIntArray5005 = anIntArrayArray4982[-1139259047 * anInt4992];
			anIntArray5006 = anIntArrayArray4965[-1139259047 * anInt4992];
			anIntArray4930 = anIntArrayArray5008[anInt4992 * -1139259047];
			overlayFaces = (null != class590 ? anIntArray4966[-1139259047 * anInt4992] : 0) * 1974788943;
			underlayFaces = (null != class646 ? anIntArray4963[-1139259047 * anInt4992] : 0) * 686323895;
			anIntArray4983 = anIntArrayArray4954[anInt4992 * -1139259047];
		} else {
			anIntArray5005 = anIntArrayArray4977[-1139259047 * anInt4992];
			anIntArray5006 = anIntArrayArray4978[-1139259047 * anInt4992];
			anIntArray4930 = anIntArrayArray4960[-1139259047 * anInt4992];
			overlayFaces = 1974788943 * (null != class590 ? anIntArray4964[-1139259047 * anInt4992] : 0);
			underlayFaces = 686323895 * (null != class646 ? anIntArray4989[anInt4992 * -1139259047] : 0);
			anIntArray4983 = anIntArrayArray4956[-1139259047 * anInt4992];
		}
	}

	void method7207(Toolkit class134, int i, int i_118_, int i_119_, OverlayDefinition class590, boolean[] bools,
			int[] is, int[] is_120_, int[] is_121_, int[] is_122_, int[] is_123_, int[] is_124_, int[] is_125_,
			int[] is_126_, Ground class120, Ground class120_127_, Ground class120_128_, byte i_129_) {
		anInt4998 = -815072249;
		overlayTexture = -1848574265;
		anInt4997 = -705253632;
		if (null != class590) {
			anInt4998 = 1835834137 * class590.colour;
			overlayTexture = 422976377 * class590.texture;
			anInt4997 = class590.scale * 1713432741;
			int i_130_ = OverlayDefinition.getOverlayColour(class134, class590);
			for (int i_131_ = 0; i_131_ < 1887065007 * overlayFaces; i_131_++) {
				int i_132_;
				if (bools[0 - 942261477 * anInt4993 & 0x3] && -596333341 * anInt4994 == anIntArray4983[0]) {
					anIntArray4985[0] = anIntArray5005[anInt4994 * -596333341];
					anIntArray4985[1] = 1;
					anIntArray4985[2] = anIntArray4930[anInt4994 * -596333341];
					anIntArray4985[3] = 1;
					anIntArray4985[4] = anIntArray5006[anInt4994 * -596333341];
					anIntArray4985[5] = anIntArray4930[-596333341 * anInt4994];
					i_132_ = 6;
				} else if (bools[2 - anInt4993 * 942261477 & 0x3] && -596333341 * anInt4994 == anIntArray4983[2]) {
					anIntArray4985[0] = anIntArray5005[anInt4994 * -596333341];
					anIntArray4985[1] = 5;
					anIntArray4985[2] = anIntArray4930[anInt4994 * -596333341];
					anIntArray4985[3] = 5;
					anIntArray4985[4] = anIntArray5006[anInt4994 * -596333341];
					anIntArray4985[5] = anIntArray4930[-596333341 * anInt4994];
					i_132_ = 6;
				} else if (bools[1 - anInt4993 * 942261477 & 0x3] && -596333341 * anInt4994 == anIntArray4983[1]) {
					anIntArray4985[0] = anIntArray5005[anInt4994 * -596333341];
					anIntArray4985[1] = 3;
					anIntArray4985[2] = anIntArray4930[anInt4994 * -596333341];
					anIntArray4985[3] = 3;
					anIntArray4985[4] = anIntArray5006[-596333341 * anInt4994];
					anIntArray4985[5] = anIntArray4930[-596333341 * anInt4994];
					i_132_ = 6;
				} else if (bools[3 - 942261477 * anInt4993 & 0x3] && anIntArray4983[3] == -596333341 * anInt4994) {
					anIntArray4985[0] = anIntArray5005[anInt4994 * -596333341];
					anIntArray4985[1] = 7;
					anIntArray4985[2] = anIntArray4930[-596333341 * anInt4994];
					anIntArray4985[3] = 7;
					anIntArray4985[4] = anIntArray5006[anInt4994 * -596333341];
					anIntArray4985[5] = anIntArray4930[anInt4994 * -596333341];
					i_132_ = 6;
				} else {
					anIntArray4985[0] = anIntArray5005[anInt4994 * -596333341];
					anIntArray4985[1] = anIntArray5006[anInt4994 * -596333341];
					anIntArray4985[2] = anIntArray4930[-596333341 * anInt4994];
					i_132_ = 3;
				}
				for (int i_133_ = 0; i_133_ < i_132_; i_133_++) {
					int i_134_ = anIntArray4985[i_133_];
					int i_135_ = i_134_ - 1884522954 * anInt4993 & 0x7;
					int i_136_ = anIntArray4936[i_134_];
					int i_137_ = anIntArray4984[i_134_];
					int i_138_;
					int i_139_;
					if (942261477 * anInt4993 == 1) {
						i_138_ = i_137_;
						i_139_ = 512 - i_136_;
					} else if (anInt4993 * 942261477 == 2) {
						i_138_ = 512 - i_136_;
						i_139_ = 512 - i_137_;
					} else if (anInt4993 * 942261477 == 3) {
						i_138_ = 512 - i_137_;
						i_139_ = i_136_;
					} else {
						i_138_ = i_136_;
						i_139_ = i_137_;
					}
					is_120_[1110560025 * anInt4995] = i_138_;
					is_121_[anInt4995 * 1110560025] = i_139_;
					if (null != is_125_ && aBoolArrayArray4970[-1139259047 * anInt4992][i_134_]) {
						int i_140_ = i_138_ + (i_118_ << 9);
						int i_141_ = i_139_ + (i_119_ << 9);
						is_125_[anInt4995 * 1110560025] = class120_127_.averageHeight(i_140_, i_141_)
								- class120.averageHeight(i_140_, i_141_);
					}
					if (is_126_ != null) {
						if (null != class120_127_ && !aBoolArrayArray4970[-1139259047 * anInt4992][i_134_]) {
							int i_142_ = i_138_ + (i_118_ << 9);
							int i_143_ = (i_119_ << 9) + i_139_;
							is_126_[anInt4995 * 1110560025] = class120.averageHeight(i_142_, i_143_)
									- class120_127_.averageHeight(i_142_, i_143_);
						} else if (null != class120_128_ && !aBoolArrayArray4926[anInt4992 * -1139259047][i_134_]) {
							int i_144_ = i_138_ + (i_118_ << 9);
							int i_145_ = i_139_ + (i_119_ << 9);
							is_126_[anInt4995 * 1110560025] = class120_128_.averageHeight(i_144_, i_145_)
									- class120.averageHeight(i_144_, i_145_);
						}
					}
					if (i_134_ < 8 && anIntArray4990[i_135_] > 868255005 * class590.anInt7807) {
						if (is != null) {
							is[1110560025 * anInt4995] = anIntArray4987[i_135_];
						}
						is_124_[anInt4995 * 1110560025] = anIntArray4933[i_135_];
						is_123_[1110560025 * anInt4995] = anIntArray4946[i_135_];
						is_122_[1110560025 * anInt4995] = anIntArray5007[i_135_];
					} else {
						if (is != null) {
							is[1110560025 * anInt4995] = i_130_;
						}
						is_123_[1110560025 * anInt4995] = class590.texture * -795268031;
						is_124_[anInt4995 * 1110560025] = class590.scale * -1134728469;
						is_122_[anInt4995 * 1110560025] = anInt4998 * 1806454345;
					}
					anInt4995 += -1919598807;
				}
				anInt4994 += -1086981941;
			}
			if (!underwater && 0 == i) {
				aClass490_4924.method8333(i_118_, i_119_, class590.waterColour * -2077371167,
						1014650648 * class590.waterScale, class590.waterIntensity * -1280602907,
						1721813633 * class590.anInt7800, -467709797 * class590.anInt7797,
						class590.anInt7812 * 77721583, 1601527267);
			}
			if (anInt4992 * -1139259047 != 12 && -1 != class590.colour * -217720799 && class590.blockShadow) {
				aBool4968 = true;
			}
		} else if (aBool5001) {
			anInt4994 += -1086981941 * OVERLAY_FACE_COUNT[-1139259047 * anInt4992];
		} else if (aBool4981) {
			anInt4994 += -1086981941 * anIntArray4966[anInt4992 * -1139259047];
		} else {
			anInt4994 += anIntArray4964[anInt4992 * -1139259047] * -1086981941;
		}
	}

	void method7208(Toolkit class134, int i, int i_146_, int i_147_, int i_148_, int i_149_,
			UnderlayDefinition class646, int i_150_, int i_151_, int i_152_, int i_153_, boolean[] bools, int[] is,
			int[] is_154_, int[] is_155_, int[] is_156_, int[] is_157_, int[] is_158_, int[] is_159_, int[] is_160_,
			int[][] is_161_, Ground class120, Ground class120_162_, Ground class120_163_, byte i_164_) {
		if (class646 != null) {
			if (0 == i_151_) {
				i_151_ = i_150_;
			}
			if (0 == i_152_) {
				i_152_ = i_150_;
			}
			if (i_153_ == 0) {
				i_153_ = i_150_;
			}
			UnderlayDefinition class646_165_ = underlayLoader.get(i_150_ - 1);
			UnderlayDefinition class646_166_ = underlayLoader.get(i_151_ - 1);
			UnderlayDefinition class646_167_ = underlayLoader.get(i_152_ - 1);
			UnderlayDefinition class646_168_ = underlayLoader.get(i_153_ - 1);
			for (int i_169_ = 0; i_169_ < underlayFaces * -1398807289; i_169_++) {
				int i_170_;
				if (bools[0 - 942261477 * anInt4993 & 0x3] && -596333341 * anInt4994 == anIntArray4983[0]) {
					anIntArray4985[0] = anIntArray5005[anInt4994 * -596333341];
					anIntArray4985[1] = 1;
					anIntArray4985[2] = anIntArray4930[anInt4994 * -596333341];
					anIntArray4985[3] = 1;
					anIntArray4985[4] = anIntArray5006[-596333341 * anInt4994];
					anIntArray4985[5] = anIntArray4930[-596333341 * anInt4994];
					i_170_ = 6;
				} else if (bools[2 - anInt4993 * 942261477 & 0x3] && anIntArray4983[2] == anInt4994 * -596333341) {
					anIntArray4985[0] = anIntArray5005[-596333341 * anInt4994];
					anIntArray4985[1] = 5;
					anIntArray4985[2] = anIntArray4930[-596333341 * anInt4994];
					anIntArray4985[3] = 5;
					anIntArray4985[4] = anIntArray5006[-596333341 * anInt4994];
					anIntArray4985[5] = anIntArray4930[-596333341 * anInt4994];
					i_170_ = 6;
				} else if (bools[1 - anInt4993 * 942261477 & 0x3] && -596333341 * anInt4994 == anIntArray4983[1]) {
					anIntArray4985[0] = anIntArray5005[anInt4994 * -596333341];
					anIntArray4985[1] = 3;
					anIntArray4985[2] = anIntArray4930[-596333341 * anInt4994];
					anIntArray4985[3] = 3;
					anIntArray4985[4] = anIntArray5006[anInt4994 * -596333341];
					anIntArray4985[5] = anIntArray4930[-596333341 * anInt4994];
					i_170_ = 6;
				} else if (bools[3 - 942261477 * anInt4993 & 0x3] && -596333341 * anInt4994 == anIntArray4983[3]) {
					anIntArray4985[0] = anIntArray5005[anInt4994 * -596333341];
					anIntArray4985[1] = 7;
					anIntArray4985[2] = anIntArray4930[anInt4994 * -596333341];
					anIntArray4985[3] = 7;
					anIntArray4985[4] = anIntArray5006[-596333341 * anInt4994];
					anIntArray4985[5] = anIntArray4930[anInt4994 * -596333341];
					i_170_ = 6;
				} else {
					anIntArray4985[0] = anIntArray5005[-596333341 * anInt4994];
					anIntArray4985[1] = anIntArray5006[-596333341 * anInt4994];
					anIntArray4985[2] = anIntArray4930[anInt4994 * -596333341];
					i_170_ = 3;
				}
				for (int i_171_ = 0; i_171_ < i_170_; i_171_++) {
					int i_172_ = anIntArray4985[i_171_];
					int i_173_ = i_172_ - 1884522954 * anInt4993 & 0x7;
					int i_174_ = anIntArray4936[i_172_];
					int i_175_ = anIntArray4984[i_172_];
					int i_176_;
					int i_177_;
					if (1 == 942261477 * anInt4993) {
						i_176_ = i_175_;
						i_177_ = 512 - i_174_;
					} else if (anInt4993 * 942261477 == 2) {
						i_176_ = 512 - i_174_;
						i_177_ = 512 - i_175_;
					} else if (anInt4993 * 942261477 == 3) {
						i_176_ = 512 - i_175_;
						i_177_ = i_174_;
					} else {
						i_176_ = i_174_;
						i_177_ = i_175_;
					}
					is_154_[anInt4995 * 1110560025] = i_176_;
					is_155_[1110560025 * anInt4995] = i_177_;
					if (is_159_ != null && aBoolArrayArray4970[-1139259047 * anInt4992][i_172_]) {
						int i_178_ = (i_146_ << 9) + i_176_;
						int i_179_ = (i_147_ << 9) + i_177_;
						is_159_[1110560025 * anInt4995] = class120_162_.averageHeight(i_178_, i_179_)
								- class120.averageHeight(i_178_, i_179_);
					}
					if (is_160_ != null) {
						if (class120_162_ != null && !aBoolArrayArray4970[anInt4992 * -1139259047][i_172_]) {
							int i_180_ = (i_146_ << 9) + i_176_;
							int i_181_ = i_177_ + (i_147_ << 9);
							is_160_[anInt4995 * 1110560025] = class120.averageHeight(i_180_, i_181_)
									- class120_162_.averageHeight(i_180_, i_181_);
						} else if (class120_163_ != null && !aBoolArrayArray4926[-1139259047 * anInt4992][i_172_]) {
							int i_182_ = i_176_ + (i_146_ << 9);
							int i_183_ = (i_147_ << 9) + i_177_;
							is_160_[1110560025 * anInt4995] = class120_163_.averageHeight(i_182_, i_183_)
									- class120.averageHeight(i_182_, i_183_);
						}
					}
					if (i_172_ < 8 && anIntArray4990[i_173_] >= 0) {
						if (null != is) {
							is[anInt4995 * 1110560025] = anIntArray4987[i_173_];
						}
						is_158_[anInt4995 * 1110560025] = anIntArray4933[i_173_];
						is_157_[anInt4995 * 1110560025] = anIntArray4946[i_173_];
						is_156_[1110560025 * anInt4995] = anIntArray5007[i_173_];
					} else {
						if (aBool4981 && aBoolArrayArray4970[anInt4992 * -1139259047][i_172_]) {
							is_157_[anInt4995 * 1110560025] = -2040423159 * overlayTexture;
							is_158_[anInt4995 * 1110560025] = anInt4997 * 1674387535;
							is_156_[anInt4995 * 1110560025] = 1806454345 * anInt4998;
						} else if (i_176_ == 0 && i_177_ == 0) {
							is_156_[1110560025 * anInt4995] = is_161_[i_146_][i_147_];
							is_157_[1110560025 * anInt4995] = -1116202401 * class646_165_.texture;
							is_158_[1110560025 * anInt4995] = 1997179659 * class646_165_.scale;
						} else if (0 == i_176_ && 512 == i_177_) {
							is_156_[1110560025 * anInt4995] = is_161_[i_146_][i_149_];
							is_157_[anInt4995 * 1110560025] = class646_166_.texture * -1116202401;
							is_158_[anInt4995 * 1110560025] = class646_166_.scale * 1997179659;
						} else if (512 == i_176_ && 512 == i_177_) {
							is_156_[anInt4995 * 1110560025] = is_161_[i_148_][i_149_];
							is_157_[anInt4995 * 1110560025] = class646_167_.texture * -1116202401;
							is_158_[1110560025 * anInt4995] = 1997179659 * class646_167_.scale;
						} else if (512 == i_176_ && i_177_ == 0) {
							is_156_[1110560025 * anInt4995] = is_161_[i_148_][i_147_];
							is_157_[1110560025 * anInt4995] = -1116202401 * class646_168_.texture;
							is_158_[1110560025 * anInt4995] = 1997179659 * class646_168_.scale;
						} else {
							if (i_176_ < 256) {
								if (i_177_ < 256) {
									is_157_[1110560025 * anInt4995] = class646_165_.texture * -1116202401;
									is_158_[1110560025 * anInt4995] = class646_165_.scale * 1997179659;
								} else {
									is_157_[1110560025 * anInt4995] = -1116202401 * class646_166_.texture;
									is_158_[anInt4995 * 1110560025] = class646_166_.scale * 1997179659;
								}
							} else if (i_177_ < 256) {
								is_157_[anInt4995 * 1110560025] = -1116202401 * class646_168_.texture;
								is_158_[anInt4995 * 1110560025] = 1997179659 * class646_168_.scale;
							} else {
								is_157_[1110560025 * anInt4995] = class646_167_.texture * -1116202401;
								is_158_[anInt4995 * 1110560025] = class646_167_.scale * 1997179659;
							}
							int i_184_ = Class477_Sub3.method15582(is_161_[i_146_][i_147_], is_161_[i_148_][i_147_],
									i_176_ << 7 >> 9, (byte) 80);
							int i_185_ = Class477_Sub3.method15582(is_161_[i_146_][i_149_], is_161_[i_148_][i_149_],
									i_176_ << 7 >> 9, (byte) 22);
							is_156_[anInt4995 * 1110560025] = Class477_Sub3.method15582(i_184_, i_185_,
									i_177_ << 7 >> 9, (byte) 95);
						}
						if (null != is) {
							is[1110560025 * anInt4995] = is_156_[1110560025 * anInt4995];
						}
					}
					anInt4995 += -1919598807;
				}
				anInt4994 += -1086981941;
			}
			if (0 != -1139259047 * anInt4992 && class646.blockShadow) {
				aBool4968 = true;
			}
		}
	}

	void method7209(Ground ground, UnderlayDefinition underlay, OverlayDefinition overlay, int plane, int i_186_,
			int i_187_, int i_188_, int i_189_, int i_190_, int i_191_, int i_192_) {
		int i_193_ = ground.getTileHeight(i_186_, i_187_);
		int i_194_ = ground.getTileHeight(i_188_, i_187_);
		int i_195_ = ground.getTileHeight(i_188_, i_189_);
		int i_196_ = ground.getTileHeight(i_186_, i_189_);
		boolean bool = aClass425_4950.isBridge(i_186_, i_187_);

		if (bool && plane > 1 || !bool && plane > 0) {
			boolean bool_197_ = true;
			if (underlay != null && !underlay.aBool8184) {
				bool_197_ = false;
			} else if (0 == i_190_ && -1139259047 * anInt4992 != 0) {
				bool_197_ = false;
			} else if (i_191_ > 0 && null != overlay && !overlay.aBool7805) {
				bool_197_ = false;
			}

			if (bool_197_ && i_194_ == i_193_ && i_195_ == i_193_ && i_196_ == i_193_) {
				aByteArrayArrayArray4922[plane][i_186_][i_187_] |= 0x4;
			}
		}
	}

	final void method7210(Toolkit class134, OverlayDefinition class590, UnderlayDefinition class646, int i, int i_198_,
			int i_199_, int i_200_, short[][] is, byte[][] is_201_, byte[][] is_202_, boolean[] bools, int i_203_) {
		boolean[] bools_204_ = class590 != null && class590.aBool7806 ? aBoolArrayArray4980[-1139259047 * anInt4992]
				: aBoolArrayArray4975[anInt4992 * -1139259047];
		if (i_198_ > 0) {
			if (i > 0) {
				int i_205_ = is[i - 1][i_198_ - 1] & 0x7fff;
				if (i_205_ > 0) {
					OverlayDefinition class590_206_ = overlayLoader.get(i_205_ - 1);
					if (-1 != class590_206_.colour * -217720799 && class590_206_.aBool7806) {
						byte i_207_ = is_201_[i - 1][i_198_ - 1];
						int i_208_ = 4 + 2 * is_202_[i - 1][i_198_ - 1] & 0x7;
						int i_209_ = OverlayDefinition.getOverlayColour(class134, class590_206_);
						if (aBoolArrayArray4970[i_207_][i_208_]) {
							anIntArray5007[0] = -217720799 * class590_206_.colour;
							anIntArray4987[0] = i_209_;
							anIntArray4946[0] = -795268031 * class590_206_.texture;
							anIntArray4933[0] = -1134728469 * class590_206_.scale;
							anIntArray4990[0] = class590_206_.anInt7807 * 868255005;
							anIntArray4991[0] = 256;
						}
					}
				}
			}
			if (i < i_199_ - 1) {
				int i_210_ = is[i + 1][i_198_ - 1] & 0x7fff;
				if (i_210_ > 0) {
					OverlayDefinition class590_211_ = overlayLoader.get(i_210_ - 1);
					if (class590_211_.colour * -217720799 != -1 && class590_211_.aBool7806) {
						byte i_212_ = is_201_[i + 1][i_198_ - 1];
						int i_213_ = is_202_[1 + i][i_198_ - 1] * 2 + 6 & 0x7;
						int i_214_ = OverlayDefinition.getOverlayColour(class134, class590_211_);
						if (aBoolArrayArray4970[i_212_][i_213_]) {
							anIntArray5007[2] = -217720799 * class590_211_.colour;
							anIntArray4987[2] = i_214_;
							anIntArray4946[2] = class590_211_.texture * -795268031;
							anIntArray4933[2] = -1134728469 * class590_211_.scale;
							anIntArray4990[2] = class590_211_.anInt7807 * 868255005;
							anIntArray4991[2] = 512;
						}
					}
				}
			}
		}
		if (i_198_ < i_200_ - 1) {
			if (i > 0) {
				int i_215_ = is[i - 1][i_198_ + 1] & 0x7fff;
				if (i_215_ > 0) {
					OverlayDefinition class590_216_ = overlayLoader.get(i_215_ - 1);
					if (class590_216_.colour * -217720799 != -1 && class590_216_.aBool7806) {
						byte i_217_ = is_201_[i - 1][1 + i_198_];
						int i_218_ = 2 * is_202_[i - 1][1 + i_198_] + 2 & 0x7;
						int i_219_ = OverlayDefinition.getOverlayColour(class134, class590_216_);
						if (aBoolArrayArray4970[i_217_][i_218_]) {
							anIntArray5007[6] = class590_216_.colour * -217720799;
							anIntArray4987[6] = i_219_;
							anIntArray4946[6] = -795268031 * class590_216_.texture;
							anIntArray4933[6] = -1134728469 * class590_216_.scale;
							anIntArray4990[6] = 868255005 * class590_216_.anInt7807;
							anIntArray4991[6] = 64;
						}
					}
				}
			}
			if (i < i_199_ - 1) {
				int i_220_ = is[i + 1][i_198_ + 1] & 0x7fff;
				if (i_220_ > 0) {
					OverlayDefinition class590_221_ = overlayLoader.get(i_220_ - 1);
					if (-1 != class590_221_.colour * -217720799 && class590_221_.aBool7806) {
						byte i_222_ = is_201_[i + 1][1 + i_198_];
						int i_223_ = 2 * is_202_[1 + i][i_198_ + 1] + 0 & 0x7;
						int i_224_ = OverlayDefinition.getOverlayColour(class134, class590_221_);
						if (aBoolArrayArray4970[i_222_][i_223_]) {
							anIntArray5007[4] = class590_221_.colour * -217720799;
							anIntArray4987[4] = i_224_;
							anIntArray4946[4] = -795268031 * class590_221_.texture;
							anIntArray4933[4] = class590_221_.scale * -1134728469;
							anIntArray4990[4] = 868255005 * class590_221_.anInt7807;
							anIntArray4991[4] = 128;
						}
					}
				}
			}
		}
		if (i_198_ > 0) {
			int i_225_ = is[i][i_198_ - 1] & 0x7fff;
			if (i_225_ > 0) {
				OverlayDefinition class590_226_ = overlayLoader.get(i_225_ - 1);
				if (-217720799 * class590_226_.colour != -1) {
					byte i_227_ = is_201_[i][i_198_ - 1];
					int i_228_ = is_202_[i][i_198_ - 1];
					if (class590_226_.aBool7806) {
						int i_229_ = 2;
						int i_230_ = 4 + 2 * i_228_;
						int i_231_ = OverlayDefinition.getOverlayColour(class134, class590_226_);
						for (int i_232_ = 0; i_232_ < 3; i_232_++) {
							i_230_ &= 0x7;
							i_229_ &= 0x7;
							if (aBoolArrayArray4970[i_227_][i_230_]
									&& anIntArray4990[i_229_] <= 868255005 * class590_226_.anInt7807) {
								anIntArray5007[i_229_] = -217720799 * class590_226_.colour;
								anIntArray4987[i_229_] = i_231_;
								anIntArray4946[i_229_] = class590_226_.texture * -795268031;
								anIntArray4933[i_229_] = class590_226_.scale * -1134728469;
								if (anIntArray4990[i_229_] == class590_226_.anInt7807 * 868255005) {
									anIntArray4991[i_229_] |= 0x20;
								} else {
									anIntArray4991[i_229_] = 32;
								}
								anIntArray4990[i_229_] = class590_226_.anInt7807 * 868255005;
							}
							i_230_++;
							i_229_--;
						}
						if (!bools_204_[anInt4993 * 942261477 + 0 & 0x3]) {
							bools[0] = aBoolArrayArray4980[i_227_][i_228_ + 2 & 0x3];
						}
					} else if (!bools_204_[942261477 * anInt4993 + 0 & 0x3]) {
						bools[0] = aBoolArrayArray4975[i_227_][2 + i_228_ & 0x3];
					}
				}
			}
		}
		if (i_198_ < i_200_ - 1) {
			int i_233_ = is[i][1 + i_198_] & 0x7fff;
			if (i_233_ > 0) {
				OverlayDefinition class590_234_ = overlayLoader.get(i_233_ - 1);
				if (-1 != -217720799 * class590_234_.colour) {
					byte i_235_ = is_201_[i][i_198_ + 1];
					int i_236_ = is_202_[i][i_198_ + 1];
					if (class590_234_.aBool7806) {
						int i_237_ = 4;
						int i_238_ = 2 + 2 * i_236_;
						int i_239_ = OverlayDefinition.getOverlayColour(class134, class590_234_);
						for (int i_240_ = 0; i_240_ < 3; i_240_++) {
							i_238_ &= 0x7;
							i_237_ &= 0x7;
							if (aBoolArrayArray4970[i_235_][i_238_]
									&& anIntArray4990[i_237_] <= class590_234_.anInt7807 * 868255005) {
								anIntArray5007[i_237_] = -217720799 * class590_234_.colour;
								anIntArray4987[i_237_] = i_239_;
								anIntArray4946[i_237_] = class590_234_.texture * -795268031;
								anIntArray4933[i_237_] = class590_234_.scale * -1134728469;
								if (class590_234_.anInt7807 * 868255005 == anIntArray4990[i_237_]) {
									anIntArray4991[i_237_] |= 0x10;
								} else {
									anIntArray4991[i_237_] = 16;
								}
								anIntArray4990[i_237_] = 868255005 * class590_234_.anInt7807;
							}
							i_238_--;
							i_237_++;
						}
						if (!bools_204_[2 + anInt4993 * 942261477 & 0x3]) {
							bools[2] = aBoolArrayArray4980[i_235_][i_236_ + 0 & 0x3];
						}
					} else if (!bools_204_[anInt4993 * 942261477 + 2 & 0x3]) {
						bools[2] = aBoolArrayArray4975[i_235_][0 + i_236_ & 0x3];
					}
				}
			}
		}
		if (i > 0) {
			int i_241_ = is[i - 1][i_198_] & 0x7fff;
			if (i_241_ > 0) {
				OverlayDefinition class590_242_ = overlayLoader.get(i_241_ - 1);
				if (-1 != -217720799 * class590_242_.colour) {
					byte i_243_ = is_201_[i - 1][i_198_];
					int i_244_ = is_202_[i - 1][i_198_];
					if (class590_242_.aBool7806) {
						int i_245_ = 6;
						int i_246_ = 4 + 2 * i_244_;
						int i_247_ = OverlayDefinition.getOverlayColour(class134, class590_242_);
						for (int i_248_ = 0; i_248_ < 3; i_248_++) {
							i_246_ &= 0x7;
							i_245_ &= 0x7;
							if (aBoolArrayArray4970[i_243_][i_246_]
									&& anIntArray4990[i_245_] <= class590_242_.anInt7807 * 868255005) {
								anIntArray5007[i_245_] = class590_242_.colour * -217720799;
								anIntArray4987[i_245_] = i_247_;
								anIntArray4946[i_245_] = class590_242_.texture * -795268031;
								anIntArray4933[i_245_] = -1134728469 * class590_242_.scale;
								if (class590_242_.anInt7807 * 868255005 == anIntArray4990[i_245_]) {
									anIntArray4991[i_245_] |= 0x8;
								} else {
									anIntArray4991[i_245_] = 8;
								}
								anIntArray4990[i_245_] = 868255005 * class590_242_.anInt7807;
							}
							i_246_--;
							i_245_++;
						}
						if (!bools_204_[3 + 942261477 * anInt4993 & 0x3]) {
							bools[3] = aBoolArrayArray4980[i_243_][i_244_ + 1 & 0x3];
						}
					} else if (!bools_204_[942261477 * anInt4993 + 3 & 0x3]) {
						bools[3] = aBoolArrayArray4975[i_243_][i_244_ + 1 & 0x3];
					}
				}
			}
		}
		if (i < i_199_ - 1) {
			int i_249_ = is[i + 1][i_198_] & 0x7fff;
			if (i_249_ > 0) {
				OverlayDefinition class590_250_ = overlayLoader.get(i_249_ - 1);
				if (class590_250_.colour * -217720799 != -1) {
					byte i_251_ = is_201_[1 + i][i_198_];
					int i_252_ = is_202_[1 + i][i_198_];
					if (class590_250_.aBool7806) {
						int i_253_ = 4;
						int i_254_ = 6 + i_252_ * 2;
						int i_255_ = OverlayDefinition.getOverlayColour(class134, class590_250_);
						for (int i_256_ = 0; i_256_ < 3; i_256_++) {
							i_254_ &= 0x7;
							i_253_ &= 0x7;
							if (aBoolArrayArray4970[i_251_][i_254_]
									&& anIntArray4990[i_253_] <= class590_250_.anInt7807 * 868255005) {
								anIntArray5007[i_253_] = -217720799 * class590_250_.colour;
								anIntArray4987[i_253_] = i_255_;
								anIntArray4946[i_253_] = -795268031 * class590_250_.texture;
								anIntArray4933[i_253_] = -1134728469 * class590_250_.scale;
								if (anIntArray4990[i_253_] == 868255005 * class590_250_.anInt7807) {
									anIntArray4991[i_253_] |= 0x4;
								} else {
									anIntArray4991[i_253_] = 4;
								}
								anIntArray4990[i_253_] = 868255005 * class590_250_.anInt7807;
							}
							i_254_++;
							i_253_--;
						}
						if (!bools_204_[anInt4993 * 942261477 + 1 & 0x3]) {
							bools[1] = aBoolArrayArray4980[i_251_][3 + i_252_ & 0x3];
						}
					} else if (!bools_204_[942261477 * anInt4993 + 1 & 0x3]) {
						bools[1] = aBoolArrayArray4975[i_251_][i_252_ + 3 & 0x3];
					}
				}
			}
		}
		if (class590 != null && class590.aBool7806) {
			int i_257_ = OverlayDefinition.getOverlayColour(class134, class590);
			for (int i_258_ = 0; i_258_ < 8; i_258_++) {
				int i_259_ = i_258_ - anInt4993 * 1884522954 & 0x7;
				if (aBoolArrayArray4970[anInt4992 * -1139259047][i_258_]
						&& anIntArray4990[i_259_] <= 868255005 * class590.anInt7807) {
					anIntArray5007[i_259_] = -217720799 * class590.colour;
					anIntArray4987[i_259_] = i_257_;
					anIntArray4946[i_259_] = -795268031 * class590.texture;
					anIntArray4933[i_259_] = -1134728469 * class590.scale;
					if (anIntArray4990[i_259_] == 868255005 * class590.anInt7807) {
						anIntArray4991[i_259_] |= 0x2;
					} else {
						anIntArray4991[i_259_] = 2;
					}
					anIntArray4990[i_259_] = 868255005 * class590.anInt7807;
				}
			}
		}
	}

	int method7222(int i, int i_260_, int i_261_, int i_262_, int i_263_, Ground class120, short[][] is, byte i_264_) {
		if ((0 == -1139259047 * anInt4992 || 12 == -1139259047 * anInt4992) && i_260_ > 0 && i_261_ > 0
				&& i_260_ < width * 1626386547 && i_261_ < -1252946243 * length) {
			int i_265_ = 0;
			int i_266_ = 0;
			int i_267_ = 0;
			int i_268_ = 0;
			i_265_ = i_265_ + (is[i_260_ - 1][i_261_ - 1] == i ? 1 : -1);
			i_266_ = i_266_ + (is[i_262_][i_261_ - 1] == i ? 1 : -1);
			i_267_ = i_267_ + (i == is[i_262_][i_263_] ? 1 : -1);
			i_268_ = i_268_ + (i == is[i_260_ - 1][i_263_] ? 1 : -1);
			if (is[i_260_][i_261_ - 1] == i) {
				i_265_++;
				i_266_++;
			} else {
				i_265_--;
				i_266_--;
			}
			if (is[i_262_][i_261_] == i) {
				i_266_++;
				i_267_++;
			} else {
				i_266_--;
				i_267_--;
			}
			if (is[i_260_][i_263_] == i) {
				i_267_++;
				i_268_++;
			} else {
				i_267_--;
				i_268_--;
			}
			if (i == is[i_260_ - 1][i_261_]) {
				i_268_++;
				i_265_++;
			} else {
				i_268_--;
				i_265_--;
			}
			int i_269_ = i_265_ - i_267_;
			if (i_269_ < 0) {
				i_269_ = -i_269_;
			}
			int i_270_ = i_266_ - i_268_;
			if (i_270_ < 0) {
				i_270_ = -i_270_;
			}
			if (i_269_ == i_270_) {
				i_269_ = class120.getTileHeight(i_260_, i_261_) - class120.getTileHeight(i_262_, i_263_);
				if (i_269_ < 0) {
					i_269_ = -i_269_;
				}
				i_270_ = class120.getTileHeight(i_262_, i_261_) - class120.getTileHeight(i_260_, i_263_);
				if (i_270_ < 0) {
					i_270_ = -i_270_;
				}
			}
			return i_269_ < i_270_ ? 1 : 0;
		}
		return anInt4993 * 942261477;
	}

	void method7238(Toolkit toolkit, Ground class120, int plane, int[][] defaultColours, Ground class120_273_,
			Ground class120_274_) {
		for (int x = 0; x < width * 1626386547; x++) {
			for (int z = 0; z < length * -1252946243; z++) {
				byte type = tileTypes[plane][x][z];
				byte direction = tileDirections[plane][x][z];
				int overlayId = overlays[plane][x][z] & 0x7fff;
				int underlayId = underlays[plane][x][z] & 0x7fff;
				OverlayDefinition overlay = overlayId != 0 ? overlayLoader.get(overlayId - 1)
						: null;
				UnderlayDefinition underlay = 0 != underlayId ? underlayLoader.get(underlayId - 1) : null;

				if (type == 0 && null == overlay) {
					type = (byte) 12;
				}

				OverlayDefinition copy = overlay;
				if (overlay != null && -217720799 * overlay.colour == -1 && overlay.blendColour * -1041293597 == -1) {
					copy = overlay;
					overlay = null;
				}

				if (null != overlay || underlay != null) {
					underlayFaces = 686323895 * UNDERLAY_FACE_COUNT[type];
					overlayFaces = OVERLAY_FACE_COUNT[type] * 1974788943;
					int faces = (null != overlay ? overlayFaces * 1887065007 : 0)
							+ (null != underlay ? -1398807289 * underlayFaces : 0);
					int index = 0;
					anInt4993 = 0;
					overlayTexture = (overlay != null ? -795268031 * overlay.texture : -1) * 1848574265;
					int i_285_ = null != underlay ? -1116202401 * underlay.texture : -1;
					int[] is_286_ = new int[faces];
					int[] is_287_ = new int[faces];
					int[] is_288_ = new int[faces];
					int[] colours = new int[faces];
					int[] textures = new int[faces];
					int[] scales = new int[faces];
					int[] is_292_ = overlay != null && -1041293597 * overlay.blendColour != -1 ? new int[faces] : null;

					if (null != overlay) {
						for (int i_293_ = 0; i_293_ < 1887065007 * overlayFaces; i_293_++) {
							is_286_[index] = anIntArrayArray4967[type][anInt4993 * 942261477];
							is_287_[index] = anIntArrayArray4973[type][942261477 * anInt4993];
							is_288_[index] = anIntArrayArray4955[type][942261477 * anInt4993];
							textures[index] = -2040423159 * overlayTexture;
							scales[index] = -1134728469 * overlay.scale;
							colours[index] = -217720799 * overlay.colour;

							if (is_292_ != null) {
								is_292_[index] = -1041293597 * overlay.blendColour;
							}
							index++;
							anInt4993 += 1789810925;
						}

						if (!underwater && plane == 0) {
							aClass490_4924.method8333(x, z, -2077371167 * overlay.waterColour,
									1014650648 * overlay.waterScale, -1280602907 * overlay.waterIntensity,
									1721813633 * overlay.anInt7800, -467709797 * overlay.anInt7797,
									overlay.anInt7812 * 77721583, 1945647329);
						}
					} else {
						anInt4993 += overlayFaces * -2064277245;
					}
					if (null != underlay) {
						for (int i_294_ = 0; i_294_ < underlayFaces * -1398807289; i_294_++) {
							is_286_[index] = anIntArrayArray4967[type][942261477 * anInt4993];
							is_287_[index] = anIntArrayArray4973[type][anInt4993 * 942261477];
							is_288_[index] = anIntArrayArray4955[type][942261477 * anInt4993];
							textures[index] = i_285_;
							scales[index] = 1997179659 * underlay.scale;
							colours[index] = defaultColours[x][z];
							if (null != is_292_) {
								is_292_[index] = colours[index];
							}
							index++;
							anInt4993 += 1789810925;
						}
					}
					int i_295_ = anIntArray4936.length;
					int[] is_296_ = new int[i_295_];
					int[] is_297_ = new int[i_295_];
					int[] is_298_ = null != class120_274_ ? new int[i_295_] : null;
					int[] is_299_ = null != class120_274_ || class120_273_ != null ? new int[i_295_] : null;
					for (int i_300_ = 0; i_300_ < i_295_; i_300_++) {
						int i_301_ = anIntArray4936[i_300_];
						int i_302_ = anIntArray4984[i_300_];
						if (direction == 0) {
							is_296_[i_300_] = i_301_;
							is_297_[i_300_] = i_302_;
						} else if (1 == direction) {
							int i_303_ = i_301_;
							is_296_[i_300_] = i_302_;
							is_297_[i_300_] = 512 - i_303_;
						} else if (direction == 2) {
							is_296_[i_300_] = 512 - i_301_;
							is_297_[i_300_] = 512 - i_302_;
						} else if (direction == 3) {
							int i_304_ = i_301_;
							is_296_[i_300_] = 512 - i_302_;
							is_297_[i_300_] = i_304_;
						}
						if (is_298_ != null && aBoolArrayArray4970[type][i_300_]) {
							int i_305_ = (x << 9) + is_296_[i_300_];
							int i_306_ = (z << 9) + is_297_[i_300_];
							is_298_[i_300_] = class120_274_.averageHeight(i_305_, i_306_)
									- class120.averageHeight(i_305_, i_306_);
						}
						if (is_299_ != null) {
							if (class120_274_ != null && !aBoolArrayArray4970[type][i_300_]) {
								int i_307_ = (x << 9) + is_296_[i_300_];
								int i_308_ = (z << 9) + is_297_[i_300_];
								is_299_[i_300_] = class120.averageHeight(i_307_, i_308_)
										- class120_274_.averageHeight(i_307_, i_308_);
							} else if (class120_273_ != null && !aBoolArrayArray4926[type][i_300_]) {
								int i_309_ = is_296_[i_300_] + (x << 9);
								int i_310_ = is_297_[i_300_] + (z << 9);
								is_299_[i_300_] = class120_273_.averageHeight(i_309_, i_310_)
										- class120.averageHeight(i_309_, i_310_);
							}
						}
					}
					int i_311_ = class120.getTileHeight(x, z);
					int i_312_ = class120.getTileHeight(x + 1, z);
					int i_313_ = class120.getTileHeight(x + 1, z + 1);
					int i_314_ = class120.getTileHeight(x, z + 1);
					boolean bool = aClass425_4950.isBridge(x, z);
					if (bool && plane > 1 || !bool && plane > 0) {
						boolean bool_315_ = true;
						if (underlay != null && !underlay.aBool8184) {
							bool_315_ = false;
						} else if (underlayId == 0 && type != 0) {
							bool_315_ = false;
						} else if (overlayId > 0 && null != copy && !copy.aBool7805) {
							bool_315_ = false;
						}
						if (bool_315_ && i_311_ == i_312_ && i_313_ == i_311_ && i_311_ == i_314_) {
							aByteArrayArrayArray4922[plane][x][z] |= 0x4;
						}
					}
					Class150 class150 = new Class150();
					if (underwater) {
						class150.colour = aClass490_4924.method8369(x, z) * 791213269;
						class150.scale = aClass490_4924.method8316(x, z) * 1591951847;
						class150.intensity = aClass490_4924.method8378(x, z) * 1370254837;
						class150.anInt1848 = aClass490_4924.method8365(x, z) * 471935851;
						class150.anInt1847 = aClass490_4924.method8425(x, z) * -2072444281;
						class150.anInt1846 = aClass490_4924.method8466(x, z) * -1720335367;
					}
					class120.method2224(x, z, is_296_, is_298_, is_297_, is_299_, is_286_, is_287_, is_288_, colours,
							is_292_, textures, scales, class150, false);
					aClass490_4924.method8340(plane, x, z);
				}
			}
		}
	}
}
