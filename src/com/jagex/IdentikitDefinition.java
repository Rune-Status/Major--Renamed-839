package com.jagex;

public class IdentikitDefinition implements Definition {

	public static int[] MALE_PARTS = { 0, 1, 2, 3, 4, 5, 6, 14 };
	public static int[] FEMALE_PARTS = { 7, 8, 9, 10, 11, 12, 13, 15 };

	int[] modelIds;
	short[] originalColours;
	short[] replacementColours;
	short[] originalTextures;
	short[] replacementTextures;
	int[] headModels = { -1, -1, -1, -1, -1 };
	byte[] aByteArray3244;
	byte[] aByteArray3245;
	Archive models;
	public static IdentikitDefinitionLoader loader;

	IdentikitDefinition(Archive models) {
		this.models = models;
	}

	@Override
	public void method35() {

	}

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

	public boolean modelsLoaded() {
		if (null == modelIds) {
			return true;
		}

		boolean loaded = true;
		synchronized (models) {
			for (int index = 0; index < modelIds.length; index++) {
				if (!models.loaded(modelIds[index], 0)) {
					loaded = false;
				}
			}
		}

		return loaded;
	}

	public BaseModel getModel() {
		if (modelIds == null) {
			return null;
		}

		BaseModel[] models = new BaseModel[modelIds.length];
		synchronized (this.models) {
			for (int index = 0; index < modelIds.length; index++) {
				models[index] = BaseModel.lookup(this.models, modelIds[index], 0);
			}
		}

		for (int index = 0; index < modelIds.length; index++) {
			if (models[index].version < 13) {
				models[index].method3103(2);
			}
		}

		BaseModel model;
		if (1 == models.length) {
			model = models[0];
		} else {
			model = new BaseModel(models, models.length);
		}

		if (null == model) {
			return null;
		}

		if (null != originalColours) {
			for (int index = 0; index < originalColours.length; index++) {
				model.recolour(originalColours[index], replacementColours[index]);
			}
		}

		if (originalTextures != null) {
			for (int index = 0; index < originalTextures.length; index++) {
				model.retexture(originalTextures[index], replacementTextures[index]);
			}
		}

		return model;
	}

	public boolean headLoaded() {
		boolean loaded = true;

		synchronized (models) {
			for (int index = 0; index < 5; index++) {
				if (-1 != headModels[index] && !models.loaded(headModels[index], 0)) {
					loaded = false;
				}
			}
		}

		return loaded;
	}

	public BaseModel getHeadModel() {
		BaseModel[] models = new BaseModel[5];
		int count = 0;

		synchronized (this.models) {
			for (int index = 0; index < 5; index++) {
				if (headModels[index] != -1) {
					models[count++] = BaseModel.lookup(this.models, headModels[index], 0);
				}
			}
		}

		for (int index = 0; index < 5; index++) {
			if (null != models[index] && models[index].version < 13) {
				models[index].method3103(2);
			}
		}

		BaseModel head = new BaseModel(models, count);
		if (null != originalColours) {
			for (int index = 0; index < originalColours.length; index++) {
				head.recolour(originalColours[index], replacementColours[index]);
			}
		}

		if (originalTextures != null) {
			for (int index = 0; index < originalTextures.length; index++) {
				head.retexture(originalTextures[index], replacementTextures[index]);
			}
		}

		return head;
	}

	void decode(Buffer buffer, int opcode) {
		if (1 == opcode) {
			buffer.readUByte();
		} else if (opcode == 2) {
			int count = buffer.readUByte();
			modelIds = new int[count];

			for (int index = 0; index < count; index++) {
				modelIds[index] = buffer.readSmart32();
			}
		} else if (3 != opcode) {
			if (40 == opcode) {
				int count = buffer.readUByte();
				originalColours = new short[count];
				replacementColours = new short[count];

				for (int index = 0; index < count; index++) {
					originalColours[index] = (short) buffer.readUShort();
					replacementColours[index] = (short) buffer.readUShort();
				}
			} else if (41 == opcode) {
				int count = buffer.readUByte();
				originalTextures = new short[count];
				replacementTextures = new short[count];

				for (int index = 0; index < count; index++) {
					originalTextures[index] = (short) buffer.readUShort();
					replacementTextures[index] = (short) buffer.readUShort();
				}
			} else if (44 == opcode) {
				int i_19_ = buffer.readUShort();
				int i_20_ = 0;
				for (int i_21_ = i_19_; i_21_ > 0; i_21_ >>= 1) {
					i_20_++;
				}
				aByteArray3245 = new byte[i_20_];
				byte i_22_ = 0;

				for (int i_23_ = 0; i_23_ < i_20_; i_23_++) {
					if ((i_19_ & 1 << i_23_) > 0) {
						aByteArray3245[i_23_] = i_22_;
						i_22_++;
					} else {
						aByteArray3245[i_23_] = (byte) -1;
					}
				}
			} else if (opcode == 45) {
				int size = buffer.readUShort();
				int count = 0;
				for (int i_26_ = size; i_26_ > 0; i_26_ >>= 1) {
					count++;
				}
				aByteArray3244 = new byte[count];
				byte i_27_ = 0;

				for (int index = 0; index < count; index++) {
					if ((size & 1 << index) > 0) {
						aByteArray3244[index] = i_27_++;
					} else {
						aByteArray3244[index] = (byte) -1;
					}
				}
			} else if (opcode >= 60 && opcode < 70) {
				headModels[opcode - 60] = buffer.readSmart32();
			}
		}
	}

}