package com.jagex;

public class Class480_Sub1 extends Linkable {
	static HashTable aClass667_9961 = new HashTable(32);
	static ReferenceCache aClass168_9962 = new ReferenceCache(11);
	static int anInt9963;
	public static long aLong9966;

	public static void method15481(int i) {
		Class533.aClass116_7274 = null;
	}

	int[] anIntArray9964 = { -1 };
	int[] anIntArray9965 = { 0 };

	final Model method15450(Toolkit toolkit, int i, Class650 class650, int i_0_, boolean bool,
			PlayerAppearance appearance) {
		Model model = null;
		int mask = i;
		Class515 class515 = null;

		if (-1 != i_0_) {
			class515 = ProxyingVariableLoader.aClass678_Sub6_3003.get(i_0_);
		}

		int[] ids = anIntArray9964;
		if (class515 != null && null != class515.anIntArray7047) {
			ids = new int[class515.anIntArray7047.length];
			for (int index = 0; index < class515.anIntArray7047.length; index++) {
				int i_4_ = class515.anIntArray7047[index];

				if (i_4_ >= 0 && i_4_ < anIntArray9964.length) {
					ids[index] = anIntArray9964[i_4_];
				} else {
					ids[index] = -1;
				}
			}
		}

		if (null != class650) {
			mask |= class650.method13457();
		}

		long l = hash(ids, i_0_, appearance != null ? appearance.bodyColours : null, bool);
		if (null != aClass168_9962) {
			model = (Model) aClass168_9962.get(l);
		}

		if (model == null || toolkit.method2637(model.functionMask(), mask) != 0) {
			if (null != model) {
				mask = toolkit.mergeFunctionMasks(mask, model.functionMask());
			}

			int attributes = mask;
			boolean bool_6_ = false;
			for (int index = 0; index < ids.length; index++) {
				if (-1 != ids[index] && !ItemDefinition.loader.get(ids[index]).modelsLoaded(bool, null)) {
					bool_6_ = true;
				}
			}

			if (bool_6_) {
				return null;
			}

			BaseModel[] bases = new BaseModel[ids.length];
			for (int index = 0; index < ids.length; index++) {
				if (ids[index] != -1) {
					bases[index] = ItemDefinition.loader.get(ids[index]).getModel(bool, null);
				}
			}

			if (null != class515 && class515.anIntArrayArray7043 != null) {
				for (int index = 0; index < class515.anIntArrayArray7043.length; index++) {
					if (class515.anIntArrayArray7043[index] != null && null != bases[index]) {
						int i_10_ = class515.anIntArrayArray7043[index][0];
						int i_11_ = class515.anIntArrayArray7043[index][1];
						int i_12_ = class515.anIntArrayArray7043[index][2];
						int i_13_ = class515.anIntArrayArray7043[index][3];
						int i_14_ = class515.anIntArrayArray7043[index][4];
						int i_15_ = class515.anIntArrayArray7043[index][5];

						if (i_13_ != 0 || 0 != i_14_ || i_15_ != 0) {
							bases[index].method3102(i_13_, i_14_, i_15_);
						}

						if (0 != i_10_ || 0 != i_11_ || i_12_ != 0) {
							bases[index].translate(i_10_, i_11_, i_12_);
						}
					}
				}
			}

			BaseModel base = new BaseModel(bases, bases.length);
			if (null != appearance) {
				attributes |= 0x4000;
			}

			model = toolkit.createModel(base, attributes, anInt9963 * 609395609, 66, 857);
			if (appearance != null) {
				for (int i_16_ = 0; i_16_ < 10; i_16_++) {
					for (int i_17_ = 0; i_17_ < UnboundedDefinitionLoader.originalBodyColours[i_16_].length; i_17_++) {
						if (appearance.bodyColours[i_16_] < HuffmanCodec.replacementBodyColours[i_16_][i_17_].length) {
							model.recolour(UnboundedDefinitionLoader.originalBodyColours[i_16_][i_17_],
									HuffmanCodec.replacementBodyColours[i_16_][i_17_][appearance.bodyColours[i_16_]]);
						}
					}
				}
			}
			if (null != aClass168_9962) {
				model.updateFunctionMask(mask);
				aClass168_9962.put(l, model);
			}
		}
		if (null == class650) {
			return model;
		}

		Model class143_18_ = model.method2890((byte) 1, mask, true);
		class650.method13458(class143_18_, 0);
		return class143_18_;
	}

	long hash(int[] ids, int i, int[] colours, boolean bool) {
		long[] table = Buffer.CRC_64;
		long hash = -1L;
		hash = hash >>> 8 ^ table[(int) ((hash ^ i >> 8) & 0xffL)];
		hash = hash >>> 8 ^ table[(int) ((hash ^ i) & 0xffL)];

		for (int id : ids) {
			hash = hash >>> 8 ^ table[(int) ((hash ^ id >> 24) & 0xffL)];
			hash = hash >>> 8 ^ table[(int) ((hash ^ id >> 16) & 0xffL)];
			hash = hash >>> 8 ^ table[(int) ((hash ^ id >> 8) & 0xffL)];
			hash = hash >>> 8 ^ table[(int) ((hash ^ id) & 0xffL)];
		}

		if (null != colours) {
			for (int index = 0; index < 5; index++) {
				hash = hash >>> 8 ^ table[(int) ((hash ^ colours[index]) & 0xffL)];
			}
		}

		return hash >>> 8 ^ table[(int) ((hash ^ (bool ? 1 : 0)) & 0xffL)];
	}

	public static int method2172(int i, int i_8_, boolean bool) {
		Class480_Sub1 class480_sub1 = Class606.method10252(i, bool);
		if (class480_sub1 == null) {
			return -1;
		} else if (i_8_ < 0 || i_8_ >= class480_sub1.anIntArray9964.length) {
			return -1;
		}

		return class480_sub1.anIntArray9964[i_8_];
	}

}