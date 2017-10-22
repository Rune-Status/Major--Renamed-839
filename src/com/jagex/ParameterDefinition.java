package com.jagex;

public class ParameterDefinition implements Definition, Interface71 {
	public static long remainingSubscription;

	public static ParameterDefinitionLoader loader;

	static final void method924(long l) {
		Class397 class397 = Client.localPlayer.method10164().aClass397_4507;
		int i = Client.anInt10692 * -123944055 + (int) class397.x;
		int i_3_ = -861250759 * Client.anInt10694 + (int) class397.z;
		if (Class215.anInt2196 * -55942707 - i < -2000 || Class215.anInt2196 * -55942707 - i > 2000
				|| -457862351 * Class115.anInt1444 - i_3_ < -2000 || -457862351 * Class115.anInt1444 - i_3_ > 2000) {
			Class215.anInt2196 = -2001636603 * i;
			Class115.anInt1444 = 1452860881 * i_3_;
		}
		if (i != Class215.anInt2196 * -55942707) {
			int i_4_ = i - -55942707 * Class215.anInt2196;
			int i_5_ = (int) (i_4_ * l / 320L);
			if (i_4_ > 0) {
				if (0 == i_5_) {
					i_5_ = 1;
				} else if (i_5_ > i_4_) {
					i_5_ = i_4_;
				}
			} else if (i_5_ == 0) {
				i_5_ = -1;
			} else if (i_5_ < i_4_) {
				i_5_ = i_4_;
			}
			Class215.anInt2196 += i_5_ * -2001636603;
		}
		if (i_3_ != -457862351 * Class115.anInt1444) {
			int i_6_ = i_3_ - Class115.anInt1444 * -457862351;
			int i_7_ = (int) (i_6_ * l / 320L);
			if (i_6_ > 0) {
				if (i_7_ == 0) {
					i_7_ = 1;
				} else if (i_7_ > i_6_) {
					i_7_ = i_6_;
				}
			} else if (i_7_ == 0) {
				i_7_ = -1;
			} else if (i_7_ < i_6_) {
				i_7_ = i_6_;
			}
			Class115.anInt1444 += i_7_ * 1452860881;
		}
		Client.aFloat10787 += l * Client.aFloat10710 / 6.0F;
		Client.aFloat10708 += l * Client.aFloat10711 / 6.0F;
		MovementType.method10452();
	}

	public int defaultInt;
	public String defaultString;
	public boolean disable = true;
	CharacterType type;

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

	public boolean isString() {
		return CharacterType.S_LOWER == type;
	}

	@Override
	public void method35() {

	}

	@Override
	public void method40(int i) {

	}

	@Override
	public void setId(int id) {

	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			char character = Class215.byteToChar(buffer.readByte());
			type = CharacterType.valueOf(character);
		} else if (2 == opcode) {
			defaultInt = buffer.readInt() * 1872568001;
		} else if (4 == opcode) {
			disable = false;
		} else if (5 == opcode) {
			defaultString = buffer.readString();
		} else if (opcode == 101) {
			type = CompressionType.findIdentifiable(CharacterType.values(), buffer.readUSmart());
		}
	}

}