package com.jagex;

public class Class295 implements Interface28 {

	Class341 aClass341_3269;

	Class295(Class341 class341) {
		aClass341_3269 = class341;
	}

	@Override
	public boolean ready() {
		return true;
	}

	@Override
	public void load() {

	}

	@Override
	public void method176(boolean bool) {
		if (bool) {
			Class60.activeToolkit.method2434(0, 0, 1319181337 * Engine.screenWidth, Engine.screenHeight * -551672947,
					-1495753167 * aClass341_3269.anInt3639, 0);
		}
	}

}