package com.jagex;

public class Class619 {
	static int nameIconsIndex;

	public static Model method10416(Toolkit toolkit, int yaw, int pitch, int roll, int dy, int key) {
		Model model = (Model) Class75.aClass168_1125.get(key);
		int attributes = 2055;

		if (null == model) {
			BaseModel base = BaseModel.lookup(Class436.models, key, 0);
			if (null == base) {
				return null;
			}

			if (base.version < 13) {
				base.method3103(2);
			}

			model = toolkit.createModel(base, attributes, 1963112619 * UnderlayDefinitionLoader.anInt10585, 64, 768);
			Class75.aClass168_1125.put(key, model);
		}

		model = model.method2890((byte) 6, attributes, true);
		if (yaw != 0) {
			model.yaw(yaw);
		}
		if (0 != pitch) {
			model.pitch(pitch);
		}
		if (0 != roll) {
			model.roll(roll);
		}
		if (dy != 0) {
			model.translate(0, dy, 0);
		}

		return model;
	}

	Class619() throws Throwable {
		throw new Error();
	}

}