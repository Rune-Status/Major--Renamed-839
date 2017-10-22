package com.jagex;

import java.io.File;

public abstract class BaseVariableParameterDefinition implements VariableDefinition {
	public static int method2284(Class395 class395) {
		Class397 class397 = Class397.create(0.0F, 0.0F, 1.0F);
		class397.method6480(class395);
		double d = Math.atan2(class397.x, class397.z);
		class397.cache();
		if (d < 0.0) {
			d = Math.PI + (Math.PI + d);
		}
		return (int) (d / 6.283185307179586 * 16384.0) & 0x3fff;
	}

	public static byte[] readFileBytes(File file) {
		return Buffer.readFileBytes(file, (int) file.length());
	}

	public boolean aBool1511;
	public VarpType type;
	public int id;
	public Class419 aClass419_1514 = Class419.aClass419_4652;
	public CharacterType aClass422_1515;
	public static PlayerVarpDefinitionLoader aClass77_Sub1_Sub2_3726;

	BaseVariableParameterDefinition(VarpType type, int id) {
		aBool1511 = true;
		this.type = type;
		this.id = -1099262425 * id;
	}

	public Object getDefaultValue() {
		return type.getDefaultValue(this);
	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			Class128 class128 = CompressionType.findIdentifiable(Class128.values(), opcode);
			if (null != class128) {
				switch (1639769105 * class128.anInt1497) {
					case 0:
						break;
					case 1:
						int id = buffer.readUByte();
						aClass422_1515 = CompressionType.findIdentifiable(CharacterType.values(), id);
						if (null == aClass422_1515) {
							throw new IllegalStateException("");
						}

						break;
					case 2:
						buffer.readPrefixedString();
					case 3:
						aBool1511 = false;
						break;
					case 4:
						aClass419_1514 = CompressionType.findIdentifiable(Class419.values(), buffer.readUByte());
						break;
					case 5:
						CompressionType.findIdentifiable(Class417.values(), buffer.readUByte());
						break;
					default:
						throw new IllegalStateException("");
				}
			} else {
				decode(buffer, opcode);
			}
		}
	}

	abstract void decode(Buffer buffer, int opcode);

	boolean method2278() {
		return !(type == null || null == aClass422_1515);
	}

}