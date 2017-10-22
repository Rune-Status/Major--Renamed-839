package com.jagex;

public class VariableBitsDefinition implements VariableDefinition {

	static int[] BIT_MASKS = new int[32];
	static {
		int mask = 2;
		for (int index = 0; index < 32; index++) {
			BIT_MASKS[index] = mask - 1;
			mask += mask;
		}
	}

	static final void method5470(ScriptExecutionContext class613) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		ScriptExecutionContext.method1138(class226, class221, class613);
	}

	static final void method5471(ScriptExecutionContext class613) {
		int i_9_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		if (-2028985543 * Client.anInt10892 == 2 && i_9_ >= 0 && i_9_ < -1763746795 * Client.friendCount) {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 274152061 * Client.friends[i_9_].anInt574;
		} else {
			class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = 0;
		}
	}

	static final void method5472(ScriptExecutionContext class613) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ((Class600_Sub1) class613.anInterface55_7937)
				.method16307();
	}

	int start;
	VarpType aClass441_3293;
	public int id;
	BaseVariableBitsDefinitionProvider provider;
	int end;
	String name;
	public BaseVariableParameterDefinition varp;
	int varpId = 21864245;
	public static VariableBitsDefinitionLoader loader;

	VariableBitsDefinition(int id, BaseVariableBitsDefinitionProvider provider) {
		this.id = 33855623 * id;
		this.provider = provider;
	}

	@Override
	public void method35() {

	}

	@Override
	public void decode(Buffer buffer) {
		decode(buffer, false);
	}

	public int method5462(int id, int i_4_) throws VarbitException {
		int mask = BIT_MASKS[end * 1511433407 - start * -1588303095];
		if (i_4_ < 0 || i_4_ > mask) {
			throw new VarbitException(name != null ? name : Integer.toString(-2037338825 * this.id), i_4_, mask);
		}

		mask <<= start * -1588303095;
		return id & (mask ^ 0xffffffff) | i_4_ << -1588303095 * start & mask;
	}

	public int getValue(int value) {
		int mask = BIT_MASKS[1511433407 * end - start * -1588303095];
		return value >> -1588303095 * start & mask;
	}

	void decode(Buffer buffer, boolean bool) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			decode(buffer, opcode, bool);
		}
	}

	void decode(Buffer buffer, int opcode, boolean allowMissing) {
		Class279 class279 = CompressionType.findIdentifiable(Class279.values(), opcode);
		switch (1787790951 * class279.anInt3142) {
			case 7:
				int type = buffer.readUByte();
				aClass441_3293 = CompressionType.findIdentifiable(VarpType.values(), type);
				if (aClass441_3293 == null) {
					throw new IllegalStateException("");
				}

				varpId = buffer.readSmart32() * -21864245;
				if (null != provider) {
					DefinitionLoader<BaseVariableParameterDefinition> loader = (DefinitionLoader<BaseVariableParameterDefinition>) provider.loaders
							.get(aClass441_3293);
					if (loader != null) {
						varp = loader.get(-439155485 * varpId);
					} else if (!allowMissing) {
						throw new IllegalStateException("");
					}
				}

				break;
			case 8:
				start = buffer.readUByte() * -1907453127;
				end = buffer.readUByte() * 1085721407;
				break;
			case 14:
				break;
		}
	}

}