package com.jagex;

public class Class281_Sub2 extends Class281 {
	Class397 aClass397_9748;
	public Class395 aClass395_9749;
	int anInt9750;
	boolean aBool9751;
	Class397 aClass397_9752 = new Class397();
	int anInt9753;
	GameCharacter anInterface26_9754;
	Class397 aClass397_9755;

	Class397 aClass397_9756;

	Class395 aClass395_9757;

	public Class281_Sub2(Class261 class261) {
		super(class261);
		aClass395_9749 = new Class395();
		anInt9750 = -101644456;
		aClass397_9748 = new Class397(Float.NaN, Float.NaN, Float.NaN);
		aClass397_9755 = new Class397(Float.NaN, Float.NaN, Float.NaN);
		aClass397_9756 = new Class397();
		aClass395_9757 = new Class395();
	}

	public void method15237(GameCharacter interface26, Class397 class397, Class395 class395, boolean bool, int i,
			int[][][] is, TileFlags class425, int i_0_, int i_1_) {
		anInterface26_9754 = interface26;
		aClass397_9752.copyFrom(class397);
		aClass395_9749.copyFrom(class395);
		aBool9751 = bool;
		anInt9750 = i * -301155933;
		anInt9753 = anInterface26_9754.method140().plane * 428396617;
		method15241(is, class425, i_0_, i_1_, 572148952);
	}

	public void method15238() {
		if (null != anInterface26_9754) {
			anInterface26_9754 = aClass261_3155.method4835().get(anInterface26_9754.getType(),
					anInterface26_9754.method33());
		}
	}

	public Class397 method15243(byte i) {
		return aClass397_9748;
	}

	public Class397 method15244(byte i) {
		return aClass397_9752;
	}

	public float method15246(int i) {
		return QuestDefinition.method4406(aClass395_9749);
	}

	public float method15263(int i) {
		return LoadingRequirementType.method592(aClass395_9749, -2069688416);
	}

	@Override
	public Class397 method5224() {
		Class397 class397 = Class397.copyOf(aClass397_9752);
		class397.method6480(aClass395_9757);
		Class397 class397_16_ = Class397.sum(aClass397_9748, class397);
		class397.cache();
		return class397_16_;
	}

	@Override
	public void method5225(float f, int[][][] is, TileFlags class425, int i, int i_20_, byte i_21_) {
		if (anInterface26_9754 != null) {
			method15241(is, class425, i, i_20_, 572148952);
			Class395 class395 = method15240(1117123175);
			aClass395_9757.method6381(class395, aClass261_3155.method4851(-1878101346));
			if (Float.isNaN(aClass395_9757.aFloat4516)) {
				aClass395_9757.copyFrom(class395);
			}
			class395.cache();
			aClass397_9755.copyFrom(anInterface26_9754.method140().copy());
			aClass261_3155.method4862(true, f, aClass397_9748, aClass261_3155.method4883((byte) 66), aClass397_9755,
					aClass397_9756, -958958229);
		}
	}

	@Override
	public boolean method5226() {
		return !Float.isNaN(aClass397_9748.x);
	}

	@Override
	public double[] method5228() {
		double[] ds = new double[3];
		Class397 class397 = method5224();
		ds[0] = class397.x;
		ds[1] = class397.y;
		ds[2] = class397.z;
		return ds;
	}

	@Override
	public float method5230(byte i) {
		return 0.0F;
	}

	@Override
	public Class480_Sub22 method5238(short i) {
		Class397 class397 = method5224();
		Class480_Sub22 class480_sub22 = new Class480_Sub22(808162555 * anInt9753, (int) class397.x, (int) class397.y,
				(int) class397.z);
		class397.cache();
		return class480_sub22;
	}

	@Override
	public void method5248(Class268 class268, int i, int i_17_, byte i_18_) {
		Class397 class397 = method5224();
		class268.anInt2983 = 1771748405 * ((int) class397.x - i);
		class268.anInt2982 = 600782361 * (int) -class397.y;
		class268.anInt2984 = 994250225 * ((int) class397.z - i_17_);
		class397.cache();
	}

	@Override
	public void method5256(Buffer buffer, byte i) {
		MobType class260 = MobType.valueOf(buffer.readUByte());
		int i_19_ = buffer.readUShort();
		aClass397_9752.decode(buffer);
		aClass395_9749.decode(buffer);
		aBool9751 = buffer.readUByte() == 1;
		anInt9750 = buffer.readUShort() * -301155933;
		anInterface26_9754 = aClass261_3155.method4835().get(class260, i_19_);
	}

	Class395 method15240(int i) {
		Class395 class395 = Class395.copy(aClass395_9749);
		if (aBool9751) {
			Class397 class397 = anInterface26_9754.method143();
			if (class397.distance() < -1786232309 * anInt9750) {
				class397 = Class397.create(0.0F, 0.0F, 1.0F);
				Class395 class395_3_ = anInterface26_9754.method142();
				class397.method6480(class395_3_);
			}
			class397.y = 0.0F;
			float f = (float) Math.atan2(class397.x, class397.z);
			class397.cache();
			Class395 class395_4_ = new Class395();
			class395_4_.method6367(0.0F, 1.0F, 0.0F, f);
			class395.method6377(class395_4_);
		}
		return class395;
	}

	void method15241(int[][][] is, TileFlags class425, int i, int i_5_, int i_6_) {
		if (method5226() && (aClass261_3155.method4845() || aClass261_3155.method4855())) {
			Class480_Sub22 class480_sub22 = anInterface26_9754.method140();
			anInt9753 = class480_sub22.plane * 428396617;
			int i_7_ = 808162555 * anInt9753;
			boolean bool = true;
			if (anInt9753 * 808162555 == 3) {
				bool = false;
			} else if (class425 != null
					&& class425.isBridge(class480_sub22.anInt10154 * -61099889 - i >> 9, -980788885
							* class480_sub22.anInt10156 - i_5_ >> 9)) {
				i_7_ = anInt9753 * 808162555 + 1;
				bool = false;
			}
			if (aClass261_3155.method4855() && is != null) {
				float f = method15251(is, class425, i, i_5_, i_7_, bool, (short) 10076);
				if (!Float.isNaN(f)) {
					if (f > 0.0F) {
						float f_8_ = ((float) Math.PI);
						Class397 class397 = Class397.create(0.0F, 0.0F, 1.0F);
						class397.method6480(aClass395_9749);
						Class397 class397_9_ = Class397.create(class397.x, 0.0F, class397.z);
						class397_9_.method6446();
						float f_10_ = Class397.method6452(class397, class397_9_);
						for (int i_11_ = 0; i_11_ < 10; i_11_++) {
							float f_12_ = (f_10_ + f_8_) / 2.0F - f_10_;
							float f_13_ = f_12_;
							if (f > 0.0F) {
								f_13_ *= -1.0F;
							}
							Class397 class397_14_ = Class397.create(1.0F, 0.0F, 0.0F);
							class397_14_.method6480(aClass395_9749);
							Class395 class395 = Class395.create();
							class395.method6380(class397_14_, f_13_);
							aClass395_9749.method6377(class395);
							aClass395_9749.method6412();
							class397_14_.cache();
							class395.cache();
							f = method15251(is, class425, i, i_5_, i_7_, bool, (short) 7219);
							if (Float.isNaN(f)) {
								break;
							}
							if (f > 0.0F) {
								f_10_ += f_12_;
							} else {
								f_8_ -= f_12_;
							}
						}
					}
				}
			}
		}
	}

	Class397 method15242(Class395 class395, int i) {
		Class397 class397 = Class397.copyOf(aClass397_9752);
		class397.method6480(class395);
		Class397 class397_15_ = Class397.sum(aClass397_9755, class397);
		class397.cache();
		return class397_15_;
	}

	float method15251(int[][][] is, TileFlags class425, int i, int i_22_, int i_23_, boolean bool, short i_24_) {
		Class395 class395 = method15240(315949093);
		Class397 class397 = method15242(class395, 1169311691);
		class395.cache();
		int i_25_ = (int) class397.x - i >> 9;
		int i_26_ = (int) class397.z - i_22_ >> 9;
		if (i_25_ >= 0 && i_26_ >= 0 && 1 + i_25_ < is[0].length && i_26_ + 1 < is[0][0].length) {
			int i_27_ = i_23_;
			if (bool && class425.isBridge(i_25_, i_26_)) {
				i_27_ = i_23_ + 1;
			}
			long l = (long) class397.x % 512L;
			long l_28_ = (long) class397.z % 512L;
			long l_29_ = (512L - l_28_) * is[i_27_][i_25_][i_26_] * (512L - l);
			l_29_ += is[i_27_][1 + i_25_][i_26_] * l * (512L - l_28_);
			l_29_ += l_28_ * is[i_27_][i_25_][i_26_ + 1] * (512L - l);
			l_29_ += l * is[i_27_][1 + i_25_][1 + i_26_] * l_28_;
			l_29_ /= 262144L;
			l_29_ -= 1024L;
			float f = (-l_29_) - class397.y;
			class397.cache();
			return f;
		}
		class397.cache();
		return Float.NaN;
	}
}
