package com.jagex;

public class HashedVariableCollection implements VariableCollection {
	public static boolean aBool1483;
	public static Buffer aClass480_Sub17_1484;
	static int anInt1485;

	public static int method2262(int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if ((i_6_ & 0x1) == 1) {
			int i_8_ = i_4_;
			i_4_ = i_5_;
			i_5_ = i_8_;
		}
		i_3_ &= 0x3;
		if (i_3_ == 0) {
			return i;
		}
		if (i_3_ == 1) {
			return i_2_;
		}
		if (i_3_ == 2) {
			return 7 - i - (i_4_ - 1);
		}
		return 7 - i_2_ - (i_5_ - 1);
	}

	public DefaultMap map;

	public HashedVariableCollection(VarpType type, DefaultHashMap map) {
		this.map = map;
	}

	public HashedVariableCollection(DefaultProvidingVarpLoader loader) {
		this(loader, new DefaultHashMap(loader));
	}

	HashedVariableCollection(DefaultProvidingVarpLoader loader, DefaultHashMap map) {
		this(loader.type, map);
	}

	@Override
	public int getVarp(BaseVariableParameterDefinition parameter) {
		return map.getOrDefaultInt(parameter.id * 169834903);
	}

	@Override
	public int getVarbit(VariableBitsDefinition varbit) {
		return varbit.getValue(getVarp(varbit.varp));
	}

	@Override
	public long getLongVarp(BaseVariableParameterDefinition parameter) {
		return map.getOrDefaultLong(169834903 * parameter.id);
	}

	@Override
	public void setIntVarp(BaseVariableParameterDefinition parameter, int value) {
		map.put(169834903 * parameter.id, value);
	}

	@Override
	public Object getStringVarp(BaseVariableParameterDefinition parameter) {
		return map.getOrDefaultObject(parameter.id * 169834903);
	}

	@Override
	public void setStringVarp(BaseVariableParameterDefinition parameter, Object object) {
		map.put(169834903 * parameter.id, object);
	}

	@Override
	public void setVarbit(VariableBitsDefinition varbit, int i) throws VarbitException {
		setIntVarp(varbit.varp, varbit.method5462(getVarp(varbit.varp), i));
	}

	@Override
	public void setLongVarp(BaseVariableParameterDefinition parameter, long l) {
		map.put(parameter.id * 169834903, l);
	}

}