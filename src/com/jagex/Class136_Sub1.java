package com.jagex;

public class Class136_Sub1 extends Class136 {

	static void method14579(Buffer buffer, long key) {
		Class250 class250;
		if (null != Class31.aString405 && Class31.aString405.length() == 6) {
			if (Class31.aBool426) {
				class250 = Class250.aClass250_2673;
			} else {
				class250 = Class250.aClass250_2675;
			}
		} else if (SkyboxDefinition.aClass55_7012.containsKey(key)) {
			class250 = Class250.aClass250_2674;
		} else {
			class250 = Class250.aClass250_2676;
		}

		buffer.writeByte(class250.getId());
		switch (class250.anInt2672 * -1878261949) {
			case 0:
			case 3:
				buffer.writeTriByte(Integer.parseInt(Class31.aString405));
				buffer.offset += 1258142129;
				break;
			case 2:
				buffer.writeInt(SkyboxDefinition.aClass55_7012.get(key));
				break;
			case 1:
				buffer.offset += 737601220;
				break;
		}
	}

	Archive textures;
	Archive materials;

	public Class136_Sub1(Archive textures, Archive materials) {
		this.textures = textures;
		this.materials = materials;
	}

	@Override
	public boolean loaded(Class549 type, int file) {
		if (Class549.TEXTURE_AND_MATERIAL == type) {
			boolean loaded = true;

			if (materials.validFile(file)) {
				loaded = materials.fileLoaded(file);
			}

			return loaded & textures.fileLoaded(file);
		} else if (Class549.TEXTURE == type) {
			return textures.fileLoaded(file);
		} else if (Class549.MATERIAL == type) {
			return materials.fileLoaded(file);
		}

		return false;
	}

	@Override
	byte[] get(Class549 type, int file) {
		if ((Class549.TEXTURE == type || Class549.TEXTURE_AND_MATERIAL == type) && textures.validFile(file)) {
			return textures.get(file);
		} else if (Class549.MATERIAL == type && materials.validFile(file)) {
			return materials.get(file);
		}

		return null;
	}

}