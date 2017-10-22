package com.jagex;

import jagdx.IDirect3DCubeTexture;
import jagdx.IDirect3DDevice;

import java.nio.ByteBuffer;

public final class DirectXCubeMapTexture extends DirectXTexture implements NativeCubeMapTexture {
	int levels;

	DirectXCubeMapTexture(DirectXToolkit toolkit, int levels, boolean mipmapped, int[][] data) {
		super(toolkit, Class121.aClass121_1465, Class151.aClass151_2, mipmapped && toolkit.aBool11076, levels * levels
				* 6);
		this.levels = levels;

		if (aBool4225) {
			aLong4229 = IDirect3DDevice.CreateCubeTexture(toolkit.aLong4029, levels, 0, 1024, 21, 1);
		} else {
			aLong4229 = IDirect3DDevice.CreateCubeTexture(toolkit.aLong4029, levels, 1, 0, 21, 1);
		}

		ByteBuffer buffer = toolkit.aByteBuffer9279;
		toolkit.method14589(levels * levels * 4);

		for (int index = 0; index < 6; index++) {
			buffer.clear();
			buffer.asIntBuffer().put(data[index]);
			IDirect3DCubeTexture.Upload(aLong4229, index, 0, 0, 0, levels, levels, levels * 4, 0, toolkit.aLong9268);
		}
	}

	@Override
	public void method296(Class318 class318) {
		super.method296(class318);
	}

	@Override
	public void method301() {
		toolkit.method17435(this);
	}

	@Override
	public void deleteImmediately() {
		super.deleteImmediately();
	}

}