package com.jagex;

public class Script extends Cacheable {
	public static Class580 aClass580_11401;
	public static Archive scripts;
	static Cache cache = new Cache(128);

	static Script create(byte[] data) {
		return new Script(new Buffer(data), Class378.anInterface14_4201);
	}

	static Script lookup(int id) {
		Script script = (Script) cache.get(id);
		if (script != null) {
			return script;
		}
		byte[] data = Script.scripts.get(id, 0);
		if (data == null || data.length <= 1) {
			return null;
		}

		try {
			script = Script.create(data);
		} catch (Exception exception) {
			throw new RuntimeException(exception.getMessage() + " " + id);
		}

		Script.cache.put(id, script);
		return script;
	}

	public ScriptInstruction[] instructions;
	public Class520 aClass520_11394;
	public HashTable[] aClass667Array11399;
	public int stringVariableCount;
	public int intVariableCount;
	public int anInt11395;
	public int anInt11396;
	public int longVariables;
	public int anInt11398;
	public int[] anIntArray11391;
	public Object[] anObjectArray11388;
	public String aString11389;
	VariableLoader anInterface14_11400;

	public Script(Buffer buffer, VariableLoader interface14) {
		anInterface14_11400 = interface14;
		int i = method17840(buffer, -2083184025);
		int i_12_ = 0;
		ScriptInstruction[] class466s = ScriptInstruction.values();
		while (buffer.offset * -165875887 < i) {
			ScriptInstruction class466 = method17845(buffer, class466s, 1213263761);
			method17841(buffer, i_12_, class466, 1293780947);
			i_12_++;
		}
	}

	int method17840(Buffer buffer, int i) {
		buffer.offset = (buffer.payload.length - 2) * 1258142129;
		int i_0_ = buffer.readUShort();
		int i_1_ = buffer.payload.length - 2 - i_0_ - 16;
		buffer.offset = 1258142129 * i_1_;
		int i_2_ = buffer.readInt();
		intVariableCount = buffer.readUShort() * -92224043;
		stringVariableCount = buffer.readUShort() * 715673003;
		longVariables = buffer.readUShort() * -1421390039;
		anInt11396 = buffer.readUShort() * -186800321;
		anInt11395 = buffer.readUShort() * -1403407973;
		anInt11398 = buffer.readUShort() * 299531601;
		int i_3_ = buffer.readUByte();
		if (i_3_ > 0) {
			aClass667Array11399 = new HashTable[i_3_];
			for (int i_4_ = 0; i_4_ < i_3_; i_4_++) {
				int i_5_ = buffer.readUShort();
				HashTable class667 = new HashTable(HashTable.nextPowerOfTwo(i_5_));
				aClass667Array11399[i_4_] = class667;
				while (i_5_-- > 0) {
					int i_6_ = buffer.readInt();
					int i_7_ = buffer.readInt();
					class667.put(i_6_, new LinkableInt(i_7_));
				}
			}
		}
		buffer.offset = 0;
		aString11389 = buffer.readStringFast();
		instructions = new ScriptInstruction[i_2_];
		return i_1_;
	}

	void method17841(Buffer buffer, int i, ScriptInstruction class466, int i_8_) {
		int i_9_ = instructions.length;
		if (ScriptInstruction.aClass466_5276 == class466 || ScriptInstruction.aClass466_5412 == class466) {
			VarpType class441 = CompressionType.findIdentifiable(VarpType.values(), buffer.readUByte());
			int i_10_ = buffer.readUShort();
			if (anObjectArray11388 == null) {
				anObjectArray11388 = new Object[i_9_];
			}
			anObjectArray11388[i] = anInterface14_11400.getVarp(class441, i_10_);
			if (anIntArray11391 == null) {
				anIntArray11391 = new int[i_9_];
			}
			anIntArray11391[i] = buffer.readUByte();
		} else if (ScriptInstruction.aClass466_5280 == class466) {
			ValueType class423 = CompressionType.findIdentifiable(ValueType.values(), buffer.readUByte());
			switch (-1355589053 * class423.anInt4854) {
				case 4:
					if (null == anIntArray11391) {
						anIntArray11391 = new int[i_9_];
					}
					class466 = ScriptInstruction.aClass466_6012;
					anIntArray11391[i] = buffer.readInt();
					break;
				case 3:
					if (anObjectArray11388 == null) {
						anObjectArray11388 = new Object[i_9_];
					}
					anObjectArray11388[i] = buffer.readString().intern();
					break;
				default:
					throw new RuntimeException();
				case 0:
					if (null == anObjectArray11388) {
						anObjectArray11388 = new Object[i_9_];
					}
					class466 = ScriptInstruction.aClass466_5300;
					anObjectArray11388[i] = Long.valueOf(buffer.readLong());
			}
		} else if (ScriptInstruction.aClass466_5930 == class466 || class466 == ScriptInstruction.aClass466_5279) {
			int i_11_ = buffer.readUShort();
			if (null == anObjectArray11388) {
				anObjectArray11388 = new Object[i_9_];
			}
			anObjectArray11388[i] = anInterface14_11400.getVarbit(i_11_);
			if (anIntArray11391 == null) {
				anIntArray11391 = new int[i_9_];
			}
			anIntArray11391[i] = buffer.readUByte();
		} else {
			if (anIntArray11391 == null) {
				anIntArray11391 = new int[i_9_];
			}
			if (null != class466 && class466.aBool6477) {
				anIntArray11391[i] = buffer.readInt();
			} else {
				anIntArray11391[i] = buffer.readUByte();
			}
		}
		instructions[i] = class466;
	}

	ScriptInstruction method17845(Buffer buffer, ScriptInstruction[] class466s, int i) {
		int i_13_ = buffer.readUShort();
		if (i_13_ < 0 || i_13_ >= class466s.length) {
			throw new RuntimeException("");
		}
		ScriptInstruction class466 = class466s[i_13_];
		return class466;
	}

	public static void execute(ScriptContext context) {
		execute(context, 200000);
	}

	static void execute(ScriptContext context, int maximumOperations) {
		Object[] arguments = context.arguments;
		int id = ((Integer) arguments[0]).intValue();
		Script script = lookup(id);

		if (null != script) {
			ScriptExecutionContext class613 = ScriptExecutionContext.method9584();
			class613.intVariables = new int[58870653 * script.intVariableCount];
			int intIndex = 0;
			class613.stringVariables = new String[-515357437 * script.stringVariableCount];
			int stringIndex = 0;
			class613.longVariables = new long[-422003431 * script.longVariables];
			int longIndex = 0;

			for (int index = 1; index < arguments.length; index++) {
				if (arguments[index] instanceof Integer) {
					int value = ((Integer) arguments[index]).intValue();
					if (value == -2147483647) {
						value = context.mouseX * -1816444431;
					}
					if (-2147483646 == value) {
						value = -1488102417 * context.mouseY;
					}
					if (value == -2147483645) {
						value = context.source != null ? context.source.id * 1857819631 : -1;
					}
					if (-2147483644 == value) {
						value = context.menuIndex * -826301581;
					}
					if (value == -2147483643) {
						value = null != context.source ? -592186295 * context.source.component : -1;
					}
					if (value == -2147483642) {
						value = context.target != null ? context.target.id * 1857819631 : -1;
					}
					if (value == -2147483641) {
						value = context.target != null ? context.target.component * -592186295 : -1;
					}
					if (value == -2147483640) {
						value = -1462807921 * context.typedKeyCode;
					}
					if (value == -2147483639) {
						value = context.typedKeyChar * -477799827;
					}
					class613.intVariables[intIndex++] = value;
				} else if (arguments[index] instanceof String) {
					String value = (String) arguments[index];
					if (value.equals("event_opbase")) {
						value = context.menuOption;
					}

					class613.stringVariables[stringIndex++] = value;
				} else if (arguments[index] instanceof Long) {
					long value = ((Long) arguments[index]).longValue();
					class613.longVariables[longIndex++] = value;
				}
			}

			class613.anInt7921 = context.anInt10257 * 1832607901;
			ScriptExecutionContext.execute(script, maximumOperations, class613);
			class613.anInt7921 = 0;
		}
	}

	public static void method9352() {
		cache.clear();
	}

	public static void executeScript(int id, String string, int operations) {
		Script script = lookup(Class520.aClass520_7171, id, -1);

		if (script != null) {
			ScriptExecutionContext context = ScriptExecutionContext.method9584();
			context.intVariables = new int[script.intVariableCount * 58870653];
			context.stringVariables = new String[-515357437 * script.stringVariableCount];
			context.stringVariables[0] = string;
			context.intVariables[0] = operations;
			ScriptExecutionContext.execute(script, 200000, context);
		}
	}

	static Script lookup(Class520 class520, int i, int i_7_) {
		int id = class520.id * -1817417621 | i << 10;
		Script script = (Script) cache.get((long) id << 16);
		if (script != null) {
			return script;
		}

		byte[] is = scripts.get(scripts.index(id));
		if (is != null) {
			if (is.length <= 1) {
				return null;
			}
			try {
				script = create(is);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(id)
						.toString());
			}
			script.aClass520_11394 = class520;
			cache.put((long) id << 16, script);
			return script;
		}

		id = -1817417621 * class520.id | 65536 + i_7_ << 10;
		script = (Script) cache.get((long) id << 16);
		if (null != script) {
			return script;
		}

		is = scripts.get(scripts.index(id));
		if (is != null) {
			if (is.length <= 1) {
				return null;
			}
			try {
				script = create(is);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(id)
						.toString());
			}
			script.aClass520_11394 = class520;
			cache.put((long) id << 16, script);
			return script;
		}

		id = class520.id * -1817417621 | 0x3fffc00;
		script = (Script) cache.get((long) id << 16);
		if (script != null) {
			return script;
		}

		is = scripts.get(scripts.index(id));
		if (is != null) {
			if (is.length <= 1) {
				return null;
			}

			try {
				script = create(is);
			} catch (Exception exception) {
				throw new RuntimeException(new StringBuilder().append(exception.getMessage()).append(" ").append(id)
						.toString());
			}

			script.aClass520_11394 = class520;
			cache.put((long) id << 16, script);
			return script;
		}

		return null;
	}

}