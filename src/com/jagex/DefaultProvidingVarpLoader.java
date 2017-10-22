package com.jagex;

public abstract class DefaultProvidingVarpLoader extends BaseVarpDefinitionLoader implements DefaultValueProvider {

	public static int method13931(int i, int i_5_, boolean bool, int i_6_) {
		Class480_Sub1 class480_sub1 = Class606.method10252(i, bool);
		if (null == class480_sub1) {
			return 0;
		}
		if (-1 == i_5_) {
			return 0;
		}
		int i_7_ = 0;
		for (int i_8_ = 0; i_8_ < class480_sub1.anIntArray9965.length; i_8_++) {
			if (class480_sub1.anIntArray9964[i_8_] == i_5_) {
				i_7_ += class480_sub1.anIntArray9965[i_8_];
			}
		}
		return i_7_;
	}

	protected VarpType type;

	DefaultProvidingVarpLoader(GameContext context, VarpType type, Language language, int count) {
		super(context, language, count);
		this.type = type;
	}

	@Override
	public int count() {
		return count * -1710250107;
	}

	public void encode(Buffer buffer, DefaultMapEntry class383) {
		buffer.writeShort(class383.key * 1960527763);
		if (class383.value instanceof Integer) {
			buffer.writeInt(((Integer) class383.value).intValue());
		} else if (class383.value instanceof Long) {
			buffer.writeLong(((Long) class383.value).longValue());
		} else if (class383.value instanceof String) {
			buffer.writeString((String) class383.value);
		} else if (class383.value instanceof Serializable) {
			((Serializable) class383.value).encode(buffer);
		} else {
			throw new IllegalStateException();
		}
	}

	@Override
	public abstract BaseVariableParameterDefinition get(int id);

	@Override
	public Object getDefaultValue(int id) {
		BaseVariableParameterDefinition parameter = get(id);
		if (null == parameter || !parameter.method2278()) {
			return null;
		}

		return parameter.getDefaultValue();
	}

	public int getEncodedSize(DefaultMapEntry class383) {
		int bytes = 2;
		if (class383.value instanceof Integer) {
			bytes += 4;
		} else if (class383.value instanceof Long) {
			bytes += 8;
		} else if (class383.value instanceof String) {
			bytes += TimeZoneUtils.method4000((String) class383.value);
		} else if (class383.value instanceof Serializable) {
			bytes += ((Serializable) class383.value).encodedSize();
		} else {
			throw new IllegalStateException();
		}

		return bytes;
	}

	public DefaultMapEntry method13918(Buffer buffer) {
		int id = buffer.readUShort();
		BaseVariableParameterDefinition parameter = get(id);
		if (!parameter.method2278()) {
			throw new IllegalStateException("");
		}

		DefaultMapEntry class383 = new DefaultMapEntry(id);
		Class clazz = parameter.aClass422_1515.getValueType().classType;

		if (Integer.class == clazz) {
			class383.value = Integer.valueOf(buffer.readInt());
		} else if (clazz == java.lang.Long.class) {
			class383.value = Long.valueOf(buffer.readLong());
		} else if (clazz == java.lang.String.class) {
			class383.value = buffer.readPrefixedString();
		} else if (Serializable.class.isAssignableFrom(clazz)) {
			try {
				Serializable serializable = (Serializable) clazz.newInstance();
				serializable.decode(buffer);

				class383.value = serializable;
			} catch (InstantiationException ex) {
			} catch (IllegalAccessException ex) {
			}
		} else {
			throw new IllegalStateException();
		}

		return class383;
	}

	public DefaultMapEntry method13919(Buffer buffer, ValueType type) {
		int id = buffer.readUShort();
		DefaultMapEntry class383 = new DefaultMapEntry(id);
		Class clazz = type.classType;

		if (java.lang.Integer.class == clazz) {
			class383.value = Integer.valueOf(buffer.readInt());
		} else if (clazz == java.lang.Long.class) {
			class383.value = Long.valueOf(buffer.readLong());
		} else if (clazz == java.lang.String.class) {
			class383.value = buffer.readPrefixedString();
		} else if (Serializable.class.isAssignableFrom(clazz)) {
			try {
				Serializable serializable = (Serializable) clazz.newInstance();
				serializable.decode(buffer);
				class383.value = serializable;
			} catch (InstantiationException instantiationexception) {
			} catch (IllegalAccessException illegalaccessexception) {
			}
		} else {
			throw new IllegalStateException();
		}

		BaseVariableParameterDefinition parameter = get(id);
		if (!parameter.method2278() || parameter.aClass422_1515.getValueType() != type) {
			return null;
		}

		return class383;
	}

}