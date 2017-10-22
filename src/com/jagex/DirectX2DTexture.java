package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IDirect3DTexture;

import java.nio.ByteBuffer;

public class DirectX2DTexture extends DirectXTexture implements Native2DTexture {
	boolean aBool9861;
	boolean aBool9862;
	float aFloat9859;
	float aFloat9863;
	int height;
	int width;

	DirectX2DTexture(DirectXToolkit toolkit, Class121 class121, Class151 class151, int i, int i_38_) {
		this(toolkit, class121, class151, i, i_38_, 0, 1);
	}

	DirectX2DTexture(DirectXToolkit toolkit, Class121 class121, Class151 class151, int i, int i_0_, int i_1_, int i_2_) {
		super(toolkit, class121, class151, false, i * i_0_);
		if (!toolkit.aBool11051) {
			width = HashTable.nextPowerOfTwo(i);
			height = HashTable.nextPowerOfTwo(i_0_);
			aFloat9863 = (float) i / (float) width;
			aFloat9859 = (float) i_0_ / (float) height;
		} else {
			width = i;
			height = i_0_;
			aFloat9863 = 1.0F;
			aFloat9859 = 1.0F;
		}

		aLong4229 = IDirect3DDevice.CreateTexture(toolkit.aLong4029, width, height, 0, i_1_,
				DirectXToolkit.method17414(aClass121_4227, aClass151_4228), i_2_);
	}

	DirectX2DTexture(DirectXToolkit toolkit, Class121 class121, int i, int i_6_, boolean bool, byte[] is, int i_7_,
			int i_8_) {
		super(toolkit, class121, Class151.aClass151_2, bool && toolkit.aBool11069, i * i_6_);
		if (!this.toolkit.aBool11051) {
			width = HashTable.nextPowerOfTwo(i);
			height = HashTable.nextPowerOfTwo(i_6_);
			aFloat9863 = (float) i / (float) width;
			aFloat9859 = (float) i_6_ / (float) height;
			if (i != width || i_6_ != height) {
				is = toolkit.method2506(i, i_6_, width, height, is, i_7_, i_8_, class121.size * 115153045);
				i_7_ = 0;
				i_8_ = width;
			}
		} else {
			width = i;
			height = i_6_;
			aFloat9863 = 1.0F;
			aFloat9859 = 1.0F;
		}
		if (bool) {
			aLong4229 = IDirect3DDevice.CreateTexture(this.toolkit.aLong4029, width, height, 0, 1024,
					DirectXToolkit.method17414(aClass121_4227, Class151.aClass151_2), 1);
		} else {
			aLong4229 = IDirect3DDevice.CreateTexture(this.toolkit.aLong4029, width, height, 1, 0,
					DirectXToolkit.method17414(aClass121_4227, Class151.aClass151_2), 1);
		}
		if (i_8_ == 0) {
			i_8_ = width;
		}
		toolkit.method14589(i_8_ * height * aClass121_4227.size * 115153045);
		ByteBuffer bytebuffer = toolkit.aByteBuffer9279;
		bytebuffer.clear();
		if (aClass121_4227 == Class121.aClass121_1463) {
			bytebuffer.put(is, i_7_, height * width / 2);
			IDirect3DTexture.Upload(aLong4229, 0, 0, 0, width, height / 4, width / 4 * 8, 0, toolkit.aLong9268);
		} else if (aClass121_4227 == Class121.aClass121_1459) {
			bytebuffer.put(is, i_7_, height * width);
			IDirect3DTexture.Upload(aLong4229, 0, 0, 0, width, height / 4, width / 4 * 16, 0, toolkit.aLong9268);
		} else {
			bytebuffer.put(is, i_7_, i_8_ * height);
			IDirect3DTexture.Upload(aLong4229, 0, 0, 0, width, height, i_8_ * aClass121_4227.size * 115153045, 0,
					toolkit.aLong9268);
		}
	}

	DirectX2DTexture(DirectXToolkit toolkit, Class121 class121, int i, int i_29_, boolean bool, float[] fs, int i_30_,
			int i_31_) {
		super(toolkit, class121, Class151.aClass151_2, bool && toolkit.aBool11069, i * i_29_);
		if (!toolkit.aBool11051) {
			width = HashTable.nextPowerOfTwo(i);
			height = HashTable.nextPowerOfTwo(i_29_);
			aFloat9863 = (float) i / (float) width;
			aFloat9859 = (float) i_29_ / (float) height;

			if (i != width || i_29_ != height) {
				fs = toolkit.method2668(i, i_29_, width, height, fs, i_30_, i_31_, class121.size * 115153045);
				i_30_ = 0;
				i_31_ = width;
			}
		} else {
			width = i;
			height = i_29_;
			aFloat9863 = 1.0F;
			aFloat9859 = 1.0F;
		}

		if (bool) {
			aLong4229 = IDirect3DDevice.CreateTexture(this.toolkit.aLong4029, width, height, 0, 1024,
					DirectXToolkit.method17414(aClass121_4227, Class151.aClass151_1), 1);
		} else {
			aLong4229 = IDirect3DDevice.CreateTexture(toolkit.aLong4029, width, height, 1, 0,
					DirectXToolkit.method17414(aClass121_4227, Class151.aClass151_1), 1);
		}

		if (i_31_ == 0) {
			i_31_ = width;
		}

		toolkit.method14589(i_31_ * height * aClass121_4227.size * 115153045 * 4);
		ByteBuffer buffer = toolkit.aByteBuffer9279;
		buffer.clear();
		buffer.asFloatBuffer().put(fs, i_30_, i_31_ * height * aClass121_4227.size * 115153045);
		IDirect3DTexture.Upload(aLong4229, 0, 0, 0, width, height, i_31_ * aClass121_4227.size * 115153045 * 4, 0,
				toolkit.aLong9268);
	}

	DirectX2DTexture(DirectXToolkit toolkit, int i, int i_3_, boolean bool, int[] is, int i_4_, int i_5_) {
		super(toolkit, Class121.aClass121_1465, Class151.aClass151_2, bool && toolkit.aBool11069, i * i_3_);
		if (!this.toolkit.aBool11051) {
			width = HashTable.nextPowerOfTwo(i);
			height = HashTable.nextPowerOfTwo(i_3_);
			aFloat9863 = (float) i / (float) width;
			aFloat9859 = (float) i_3_ / (float) height;
			if (i != width || i_3_ != height) {
				is = toolkit.method2694(i, i_3_, width, height, is, i_4_, i_5_);
				i_4_ = 0;
				i_5_ = width;
			}
		} else {
			width = i;
			height = i_3_;
			aFloat9863 = 1.0F;
			aFloat9859 = 1.0F;
		}
		if (bool) {
			aLong4229 = IDirect3DDevice.CreateTexture(this.toolkit.aLong4029, width, height, 0, 1024, 21, 1);
		} else {
			aLong4229 = IDirect3DDevice.CreateTexture(this.toolkit.aLong4029, width, height, 1, 0, 21, 1);
		}
		if (i_5_ == 0) {
			i_5_ = width;
		}
		toolkit.method14589(i_5_ * height * aClass121_4227.size * 115153045);
		ByteBuffer buffer = toolkit.aByteBuffer9279;
		buffer.clear();
		buffer.asIntBuffer().put(is, i_4_, i_5_ * height);
		IDirect3DTexture.Upload(aLong4229, 0, 0, 0, width, height, i_5_ * aClass121_4227.size * 115153045, 0,
				toolkit.aLong9268);
	}

	@Override
	public void deleteImmediately() {
		super.deleteImmediately();
	}

	@Override
	public boolean generateMipmaps() {
		return false;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public float method180(float f) {
		return f / height;
	}

	@Override
	public boolean method181() {
		return true;
	}

	@Override
	public void method183(int i, int i_10_, int i_11_, int i_12_, int[] is, int i_13_, int i_14_) {
		if (aClass121_4227 != Class121.aClass121_1465 || aClass151_4228 != Class151.aClass151_2) {
			throw new RuntimeException();
		}
		if (i_14_ == 0) {
			i_14_ = i_11_;
		}

		toolkit.method14589(i_14_ * i_12_ * aClass121_4227.size * 115153045);
		ByteBuffer buffer = toolkit.aByteBuffer9279;
		buffer.clear();
		buffer.asIntBuffer().put(is, i_13_, i_14_ * i_12_);
		IDirect3DTexture.Upload(aLong4229, 0, i, i_10_, i_11_, i_12_, i_14_ * aClass121_4227.size * 115153045, 0,
				toolkit.aLong9268);
	}

	@Override
	public float method184() {
		return aFloat9859;
	}

	@Override
	public void method185(int i, int i_24_, int i_25_, int i_26_, int[] is, int[] is_27_, int i_28_) {
		if (aClass121_4227 != Class121.aClass121_1465 || aClass151_4228 != Class151.aClass151_2) {
			throw new RuntimeException();
		}
		method185(i, i_24_, i_25_, i_26_, is, null, i_28_);
	}

	@Override
	public float method187() {
		return aFloat9863;
	}

	@Override
	public float method191(float f) {
		return f / width;
	}

	@Override
	public void setRepeating(boolean bool, boolean bool_9_) {
		aBool9862 = bool;
		aBool9861 = bool_9_;
	}

	@Override
	public void method213(int i, int i_15_, int i_16_, int i_17_, byte[] is, Class121 class121, int i_18_, int i_19_) {
		if (aClass121_4227 != class121 || aClass151_4228 != Class151.aClass151_2) {
			throw new RuntimeException();
		}
		if (i_19_ == 0) {
			i_19_ = i_16_;
		}
		toolkit.method14589(i_19_ * i_17_ * aClass121_4227.size * 115153045);
		ByteBuffer buffer = toolkit.aByteBuffer9279;
		buffer.clear();
		buffer.put(is, i_18_, i_19_ * i_17_);
		IDirect3DTexture.Upload(aLong4229, 0, i, i_15_, i_16_, i_17_, i_19_ * aClass121_4227.size * 115153045, 0,
				toolkit.aLong9268);
	}

	@Override
	public void method218(int i, int i_20_, int i_21_, int i_22_, int[] is, int i_23_) {
		if (aClass121_4227 != Class121.aClass121_1465 || aClass151_4228 != Class151.aClass151_2) {
			throw new RuntimeException();
		}
		toolkit.method14589(i_21_ * i_22_ * 4);
		ByteBuffer buffer = toolkit.aByteBuffer9279;
		buffer.clear();
		IDirect3DTexture.Download(aLong4229, 0, i, i_20_, i_21_, i_22_, i_21_ * 4, 0, toolkit.aLong9268);
		buffer.asIntBuffer().get(is, i_23_, i_21_ * i_22_);
	}

	@Override
	public void method221(int i, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_) {
		int[] is = toolkit.method2404(i_35_, i_36_, i_33_, i_34_);
		if (is != null) {
			for (int i_37_ = 0; i_37_ < is.length; i_37_++) {
				is[i_37_] |= ~0xffffff;
			}
			method183(i, i_32_, i_33_, i_34_, is, 0, i_33_);
		}
	}

	@Override
	public void method296(Class318 class318) {
		super.method296(class318);
	}

	@Override
	public void method301() {
		toolkit.method17425(this);
	}

	@Override
	long method6237() {
		return aLong4229;
	}

}