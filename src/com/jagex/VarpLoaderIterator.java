package com.jagex;

import java.util.Iterator;

class VarpLoaderIterator implements Iterator<VarpDefinition> {

	public static void method9691() {
		Class199.preferences.setValue(Class199.preferences.removeRoofs, 2);
		Class199.preferences.setValue(Class199.preferences.aClass632_Sub22_10284, 2);
		Class199.preferences.setValue(Class199.preferences.groundDecoration, 1);
		Class199.preferences.setValue(Class199.preferences.groundBlending, 1);
		Class199.preferences.setValue(Class199.preferences.idleAnimations, 1);
		Class199.preferences.setValue(Class199.preferences.flickeringEffects, 1);
		Class199.preferences.setValue(Class199.preferences.mobShadows, 1);
		Class199.preferences.setValue(Class199.preferences.textures, 1);
		Class199.preferences.setValue(Class199.preferences.sceneryShadows, 2);
		Class199.preferences.setValue(Class199.preferences.lighting, 1);
		Class199.preferences.setValue(Class199.preferences.water, 2);
		Class199.preferences.setValue(Class199.preferences.fog, 1);
		Class199.preferences.setValue(Class199.preferences.antiAliasing, 0);
		Class199.preferences.setValue(Class199.preferences.multisample, 0);
		Class199.preferences.setValue(Class199.preferences.particles, 2);
		Class199.preferences.setValue(Class199.preferences.buildArea, MapSize.STANDARD.type * 1283574337);
		Class199.preferences.setValue(Class199.preferences.bloom, 0);
		if (null != Class60.activeToolkit && Class60.activeToolkit.method2688() && Class60.activeToolkit.method2496()) {
			Class60.activeToolkit.method2495();
		}
		Class199.preferences.setValue(Class199.preferences.skyboxes, 1);
		Class199.preferences.setValue(Class199.preferences.aClass632_Sub11_10264, 1);
		TurnMobCutsceneAction.resetCpuPreference();
		Class199.preferences.setValue(Class199.preferences.maxScreenSize, 0);
		Class199.preferences.setValue(Class199.preferences.graphics, 4);
		PreferenceManager.method744();
		Client.aClass460_10760.method7690().method9709();
		Client.aBool10905 = true;
	}

	VarpDefinitionLoader loader;
	int index;

	VarpLoaderIterator(VarpDefinitionLoader loader) {
		this.loader = loader;
	}

	@Override
	public boolean hasNext() {
		return index * 1809203375 < loader.count();
	}

	@Override
	public VarpDefinition next() {
		int id = (index += -1667426737) * 1809203375 - 1;
		VarpDefinition parameter = loader.cache.get(id);
		if (parameter != null) {
			return parameter;
		}

		return loader.load(id);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}