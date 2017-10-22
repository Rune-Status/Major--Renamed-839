package com.jagex;

import jaggl.OpenGL;

public class OpenGlXCubeMapTexture extends OpenGlXTexture implements NativeCubeMapTexture {
	private static final int TEXTURE_CUBE_MAP = 0x8513;
	private static final int TEXTURE_CUBE_MAP_POSITIVE_X = 0x8515;

	OpenGlXCubeMapTexture(OpenGlXToolkit toolkit, int length, boolean mipmapped, int[][] data) {
		super(toolkit, TEXTURE_CUBE_MAP, Class121.aClass121_1465, Class151.aClass151_2, length * length * 6, mipmapped);

		for (int index = 0; index < 6; index++) {
			for (int i_1_ = 0; i_1_ < data[index].length; i_1_++) {
				int i_2_ = data[index][i_1_];
				data[index][i_1_] = ~0xff00ff & i_2_ | (i_2_ & 0xff) << 16 | i_2_ >> 16 & 0xff;
			}
		}

		toolkit.method14689(this);
		if (mipmapped) {
			for (int target = 0; target < 6; target++) {
				method7859(TEXTURE_CUBE_MAP_POSITIVE_X + target, length, length, data[target]);
			}
		} else {
			for (int target = 0; target < 6; target++) {
				OpenGL.glTexImage2Di(34069 + target, 0, OpenGlXToolkit.method17357(aClass121_5266, aClass151_5267),
						length, length, 0, OpenGlXToolkit.method17363(aClass121_5266), toolkit.anInt10993,
						data[target], 0);
			}
		}
	}

	@Override
	public void method296(Class318 class318) {
		super.method296(class318);
	}

	@Override
	public void method301() {
		super.method301();
	}

	@Override
	public void deleteImmediately() {
		super.deleteImmediately();
	}

}