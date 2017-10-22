package com.jagex;

public class ObjectDefinitionProvider extends BaseObjectDefinitionProvider implements
		DefinitionProvider<ObjectDefinition> {
	static void method16372(int width, int displayWidth, int[] is, int[] is_6_, float[] fs, float[] fs_7_, int i_8_,
			int i_9_, int i_10_, int i_11_, int i_12_, int i_13_) {
		int i_15_ = i_9_ * width + i_8_;
		int i_16_ = displayWidth * i_11_ + i_10_;
		int i_17_ = width - i_12_;
		int i_18_ = displayWidth - i_12_;
		if (null == is) {
			for (int i_19_ = 0; i_19_ < i_13_; i_19_++) {
				int i_20_ = i_12_ + i_15_;
				while (i_15_ < i_20_) {
					fs_7_[i_16_++] = fs[i_15_++];
				}
				i_15_ += i_17_;
				i_16_ += i_18_;
			}
		} else if (fs == null) {
			for (int i_21_ = 0; i_21_ < i_13_; i_21_++) {
				int i_22_ = i_15_ + i_12_;
				while (i_15_ < i_22_) {
					is_6_[i_16_++] = is[i_15_++];
				}
				i_15_ += i_17_;
				i_16_ += i_18_;
			}
		} else {
			for (int i_23_ = 0; i_23_ < i_13_; i_23_++) {
				int i_24_ = i_12_ + i_15_;
				while (i_15_ < i_24_) {
					is_6_[i_16_] = is[i_15_];
					fs_7_[i_16_++] = fs[i_15_++];
				}
				i_15_ += i_17_;
				i_16_ += i_18_;
			}
		}
	}

	Archive models;

	ObjectDefinitionProvider(boolean members, Archive models, Language language, GameContext context) {
		super(members, language, context);
		this.models = models;
	}

	@Override
	public Class<ObjectDefinition> getClassType() {
		return ObjectDefinition.class;
	}

	@Override
	public ObjectDefinition provide(int id, DefinitionLoader<ObjectDefinition> loader) {
		return new ObjectDefinition(id, this, loader);
	}

	@Override
	byte[] getModel(int id) {
		synchronized (models) {
			return models.get(id, 0);
		}
	}

	@Override
	boolean modelLoaded(int id) {
		synchronized (models) {
			return models.loaded(id, 0);
		}
	}

}