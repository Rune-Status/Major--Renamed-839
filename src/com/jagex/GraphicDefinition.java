package com.jagex;

public class GraphicDefinition implements Definition {
	static final int anInt7978 = 8224;

	static void method10406(Widget class226, Widget class226_46_) {
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3933, Client.gameConnection.encryptor);
		frame.payload.writeShort(class226.component * -592186295);
		frame.payload.writeLEShort(1391525437 * class226_46_.item);
		frame.payload.writeInt(1857819631 * class226_46_.id);
		frame.payload.writeIMEInt(class226.id * 1857819631);
		frame.payload.writeLEShort(-592186295 * class226_46_.component);
		frame.payload.writeLEShort(class226.item * 1391525437);
		Client.gameConnection.sendFrame(frame);
	}

	int contrast;
	BaseGraphicDefinitionProvider provider;
	int id;
	int modelId;
	short[] originalColours;
	byte[] aByteArray7975;
	short[] replacementColours;
	short[] originalTextures;
	short[] replacementTextures;
	byte[] aByteArray7980;
	int scaleXZ;
	public int animation = 2126520881;
	int scaleY;
	int ambience;
	byte aByte7985;
	public boolean aBool7986;
	int rotation;
	int anInt7988;
	public static GraphicDefinitionLoader loader;

	GraphicDefinition(int id, BaseGraphicDefinitionProvider provider) {
		scaleXZ = -594705024;
		scaleY = 1898783360;
		anInt7988 = 1267317257;
		this.id = id * -304237581;
		this.provider = provider;
	}

	public final boolean loaded() {
		if (-1 == modelId * -456768889) {
			return true;
		}

		return provider.models.loaded(modelId * -456768889, 0);
	}

	public final Model method10391(Toolkit toolkit, int i, int i_16_, Ground class120, Ground class120_17_, int i_18_,
			int i_19_, int i_20_, Class650 class650, byte i_21_) {
		return method10392(toolkit, i, true, class120, class120_17_, i_18_, i_19_, i_20_, i_16_, 0, 0, 0, class650,
				i_21_);
	}

	public final Model method10394(Toolkit toolkit, int i, Class650 class650, byte i_38_) {
		return method10392(toolkit, i, false, null, null, 0, 0, 0, 0, 0, 0, 0, class650, i_38_);
	}

	public final Model method10402(Toolkit toolkit, int i, int i_40_, int i_41_, int i_42_, int i_43_,
			Class650 class650, byte i_44_, int i_45_) {
		if (aByte7985 != 3) {
			return method10392(toolkit, i, false, null, null, 0, 0, 0, i_40_, 0, 0, 0, class650, i_44_);
		}

		return method10392(toolkit, i, true, null, null, 0, 0, 0, i_40_, i_41_, i_42_, i_43_, class650, i_44_);
	}

	@Override
	public void method35() {

	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	void decode(Buffer buffer, int opcode) {
		if (1 == opcode) {
			modelId = buffer.readSmart32() * -1463360713;
		} else if (2 == opcode) {
			animation = buffer.readSmart32() * -2126520881;
		} else if (opcode == 4) {
			scaleXZ = buffer.readUShort() * -306636021;
		} else if (5 == opcode) {
			scaleY = buffer.readUShort() * -320710075;
		} else if (6 == opcode) {
			rotation = buffer.readUShort() * 912243077;
		} else if (opcode == 7) {
			ambience = buffer.readUByte() * 1715381907;
		} else if (8 == opcode) {
			contrast = buffer.readUByte() * -964492779;
		} else if (10 == opcode) {
			aBool7986 = true;
		} else if (9 == opcode) {
			aByte7985 = (byte) 3;
			anInt7988 = 1468505824;
		} else if (15 == opcode) {
			aByte7985 = (byte) 3;
			anInt7988 = buffer.readUShort() * -1267317257;
		} else if (16 == opcode) {
			aByte7985 = (byte) 3;
			anInt7988 = buffer.readInt() * -1267317257;
		} else if (opcode == 40) {
			int count = buffer.readUByte();
			originalColours = new short[count];
			replacementColours = new short[count];

			for (int index = 0; index < count; index++) {
				originalColours[index] = (short) buffer.readUShort();
				replacementColours[index] = (short) buffer.readUShort();
			}
		} else if (opcode == 41) {
			int count = buffer.readUByte();
			originalTextures = new short[count];
			replacementTextures = new short[count];

			for (int index = 0; index < count; index++) {
				originalTextures[index] = (short) buffer.readUShort();
				replacementTextures[index] = (short) buffer.readUShort();
			}
		} else if (opcode == 44) {
			int value = buffer.readUShort();
			int count = 0;

			for (int n = value; n > 0; n >>= 1) {
				count++;
			}

			aByteArray7975 = new byte[count];
			byte previous = 0;

			for (int index = 0; index < count; index++) {
				if ((value & 1 << index) > 0) {
					aByteArray7975[index] = previous;
					previous++;
				} else {
					aByteArray7975[index] = (byte) -1;
				}
			}
		} else if (45 == opcode) {
			int value = buffer.readUShort();
			int count = 0;

			for (int n = value; n > 0; n >>= 1) {
				count++;
			}

			aByteArray7980 = new byte[count];
			byte previous = 0;

			for (int index = 0; index < count; index++) {
				if ((value & 1 << index) > 0) {
					aByteArray7980[index] = previous;
					previous++;
				} else {
					aByteArray7980[index] = (byte) -1;
				}
			}
		}
	}

	final Model method10392(Toolkit toolkit, int functionMask, boolean bool, Ground class120, Ground class120_23_,
			int i_24_, int i_25_, int i_26_, int yaw, int pitch, int roll, int dy, Class650 class650, byte i_31_) {
		int mask = functionMask;
		bool = bool & aByte7985 != 0;
		if (null != class650) {
			mask |= class650.method13457();
		}

		if (scaleY * -257185651 != 128) {
			mask |= 0x2;
		}

		if (1820874915 * scaleXZ != 128 || this.rotation * -1269475507 != 0 || 0 != yaw) {
			mask |= 0x5;
		}

		if (bool) {
			mask |= 0x7;
		}

		Model model;
		synchronized (provider.cache) {
			model = (Model) provider.cache.get(id * -542696133 | 976039213 * toolkit.id << 29);
		}

		if (model == null || toolkit.method2637(model.functionMask(), mask) != 0) {
			if (null != model) {
				mask = toolkit.mergeFunctionMasks(mask, model.functionMask());
			}

			int attributes = mask;
			if (originalColours != null) {
				attributes |= 0x4000;
			}

			if (originalTextures != null) {
				attributes |= 0x8000;
			}

			BaseModel base = BaseModel.lookup(provider.models, modelId * -456768889, 0);
			if (base == null) {
				return null;
			}
			if (base.version < 13) {
				base.method3103(2);
			}

			model = toolkit.createModel(base, attributes, provider.anInt7910 * 145451983, 1279551387 * ambience + 64,
					contrast * 604224829 + 850);
			if (originalColours != null) {
				for (int index = 0; index < originalColours.length; index++) {
					model.recolour(originalColours[index], replacementColours[index]);
				}
			}

			if (null != originalTextures) {
				for (int index = 0; index < originalTextures.length; index++) {
					model.retexture(originalTextures[index], replacementTextures[index]);
				}
			}

			model.updateFunctionMask(mask);
			synchronized (provider.cache) {
				provider.cache.put(-542696133 * id | toolkit.id * 976039213 << 29, model);
			}
		}

		Model class143_37_ = model.method2890(i_31_, mask, true);
		if (class650 != null) {
			class650.method13458(class143_37_, 0);
		}

		if (1820874915 * scaleXZ != 128 || -257185651 * scaleY != 128) {
			class143_37_.scale(scaleXZ * 1820874915, -257185651 * scaleY, scaleXZ * 1820874915);
		}

		if (-1269475507 * this.rotation != 0) {
			if (this.rotation * -1269475507 == 90) {
				yaw += 4096;
			}
			if (this.rotation * -1269475507 == 180) {
				yaw += 8192;
			}
			if (this.rotation * -1269475507 == 270) {
				yaw += 12288;
			}
		}

		if (0 != yaw) {
			yaw &= 0x3fff;
			class143_37_.yaw(yaw);
		}

		if (bool) {
			if (null != class120) {
				class143_37_.method2901(aByte7985, anInt7988 * 1507986375, class120, class120_23_, i_24_, i_25_, i_26_);
			} else {
				if (pitch != 0) {
					class143_37_.pitch(pitch);
				}
				if (roll != 0) {
					class143_37_.roll(roll);
				}
				if (dy != 0) {
					class143_37_.translate(0, dy, 0);
				}
			}
		}

		class143_37_.updateFunctionMask(functionMask);
		return class143_37_;
	}

}