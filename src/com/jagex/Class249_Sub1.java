package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

public final class Class249_Sub1 extends Class249 {
	static final int anInt9569 = 0;
	static float[] aFloatArray9570 = new float[16];
	static final int anInt9571 = 1;
	byte[] pixelShader;
	long pixelIdentifier;
	DirectXToolkit toolkit;
	long vertexIdentifier;
	DirectXProgram shader;
	boolean aBool9567 = false;
	byte[] vertexShader;
	float[][] aFloatArrayArray9572 = new float[2][];
	boolean[] aBoolArray9573 = new boolean[2];

	Class249_Sub1(DirectXToolkit toolkit, DirectXProgram shader, Class246 class246) {
		this(toolkit, class246);
		this.toolkit = toolkit;
		this.shader = shader;
	}

	Class249_Sub1(DirectXToolkit toolkit, Class246 class246) {
		name = class246.name;

		if (class246.vertexShaderName != null) {
			vertexShaderName = class246.vertexShaderName;
			vertexShader = toolkit.loadDirectXShader(vertexShaderName);
		}

		if (class246.pixelShaderName != null) {
			pixelShaderName = class246.pixelShaderName;
			pixelShader = toolkit.loadDirectXShader(pixelShaderName);
		}

		toolkit.method14863(this);
	}

	@Override
	public void finalize() {
		method15109();
	}

	@Override
	public boolean method4648() {
		if (aBool9567) {
			return true;
		}

		vertexIdentifier = vertexShader == null ? 0L : IDirect3DDevice.CreateVertexShader(toolkit.aLong4029,
				vertexShader);
		pixelIdentifier = pixelShader == null ? 0L : IDirect3DDevice.CreatePixelShader(toolkit.aLong4029, pixelShader);

		if (vertexIdentifier == 0L && pixelIdentifier == 0L) {
			return false;
		}

		int i = -1;

		for (int i_35_ = 0; i_35_ < shader.method4506(); i_35_++) {
			if (shader.method4449(i_35_) == this) {
				i = i_35_;
				break;
			}
		}

		int i_36_ = shader.method4462();
		int i_37_ = shader.method4474();

		for (int i_38_ = 0; i_38_ < i_36_; i_38_++) {
			Class480_Sub13_Sub1 class480_sub13_sub1 = shader.method4478(i_38_);
			class480_sub13_sub1.method17548(i);
		}

		for (int i_39_ = 0; i_39_ < i_37_; i_39_++) {
			Class480_Sub13_Sub1 class480_sub13_sub1 = shader.method4475(i_39_);
			class480_sub13_sub1.method17548(i);
		}

		int i_40_ = 0;
		int i_41_ = 0;
		int i_42_ = shader.indexOf(this);

		for (int i_43_ = 0; i_43_ < i_36_ + i_37_; i_43_++) {
			Class480_Sub13_Sub1_Sub1 class480_sub13_sub1_sub1 = (Class480_Sub13_Sub1_Sub1) (i_43_ < i_36_ ? shader
					.method4478(i_43_) : shader.method4475(i_43_ - i_36_));
			Class253 class253 = class480_sub13_sub1_sub1.method17541();
			int i_44_ = 1;

			if (class253 == Class253.aClass253_2697) {
				class253 = class480_sub13_sub1_sub1.method17545();
				i_44_ = class480_sub13_sub1_sub1.method17546();
			}

			switch (class253.anInt2719 * -1741801167) {
				default:
					i_44_ = 0;
					break;
				case 44:
				case 56:
				case 100:
				case 124:
					i_44_ *= 2;
					break;
				case 13:
				case 18:
				case 90:
				case 107:
				case 112:
					break;
				case 22:
				case 36:
				case 50:
				case 81:
					i_44_ *= 4;
					break;
				case 21:
				case 70:
				case 94:
				case 101:
					i_44_ *= 3;
			}

			if (class480_sub13_sub1_sub1.anIntArray11644[i_42_] >= 0) {
				int i_45_ = class480_sub13_sub1_sub1.anIntArray11644[i_42_] + i_44_;
				if (i_40_ < i_45_) {
					i_40_ = i_45_;
				}
			}

			if (class480_sub13_sub1_sub1.anIntArray11646[i_42_] >= 0) {
				int i_46_ = class480_sub13_sub1_sub1.anIntArray11646[i_42_] + i_44_;
				if (i_41_ < i_46_) {
					i_41_ = i_46_;
				}
			}
		}

		aFloatArrayArray9572[0] = new float[i_40_ * 4];
		aFloatArrayArray9572[1] = new float[i_41_ * 4];
		aBool9567 = true;
		return true;
	}

	@Override
	public void deleteImmediately() {
		if (vertexIdentifier != 0L) {
			IUnknown.Release(vertexIdentifier);
			vertexIdentifier = 0L;
		}

		if (pixelIdentifier != 0L) {
			IUnknown.Release(pixelIdentifier);
			pixelIdentifier = 0L;
		}

		toolkit.method14583(this);
	}

	final void method15102(int i, float[] fs, int i_22_) {
		Class627.method13062(fs, 0, aFloatArrayArray9572[0], i * 4, i_22_);
		aBoolArray9573[0] = true;
	}

	final void method15103(int i, float[] fs, int i_23_) {
		Class627.method13062(fs, 0, aFloatArrayArray9572[1], i * 4, i_23_);
		aBoolArray9573[1] = true;
	}

	void method15104() {
		if (aBoolArray9573[0]) {
			toolkit.aByteBuffer9279.clear();
			toolkit.aByteBuffer9279.asFloatBuffer().put(aFloatArrayArray9572[0]);
			IDirect3DDevice.SetVertexShaderConstantF(toolkit.aLong4029, 0, toolkit.aLong9268,
					aFloatArrayArray9572[0].length / 4);
			aBoolArray9573[0] = false;
		}

		if (aBoolArray9573[1]) {
			toolkit.aByteBuffer9279.clear();
			toolkit.aByteBuffer9279.asFloatBuffer().put(aFloatArrayArray9572[1]);
			IDirect3DDevice.SetPixelShaderConstantF(toolkit.aLong4029, 0, toolkit.aLong9268,
					aFloatArrayArray9572[1].length / 4);
			aBoolArray9573[1] = false;
		}
	}

	void method15109() {
		if (vertexIdentifier != 0L) {
			toolkit.method17421(vertexIdentifier);
			vertexIdentifier = 0L;
		}

		if (pixelIdentifier != 0L) {
			toolkit.method17421(pixelIdentifier);
			pixelIdentifier = 0L;
		}
	}

	@Override
	void method4649(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_0_) {
		int i = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18111();
		int i_1_ = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18113();

		if (class480_sub13_sub1.method17541() != Class253.aClass253_2720) {
			throw new IllegalArgumentException_Sub1(class480_sub13_sub1, "");
		}

		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9572[0][i + 0] = f;
			aFloatArrayArray9572[0][i + 1] = f_0_;
			aBoolArray9573[0] = true;
		}

		if (i_1_ >= 0) {
			i_1_ *= 4;
			aFloatArrayArray9572[1][i_1_ + 0] = f;
			aFloatArrayArray9572[1][i_1_ + 1] = f_0_;
			aBoolArray9573[1] = true;
		}
	}

	@Override
	void method4650(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_2_, float f_3_) {
		int i = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18111();
		int i_4_ = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18113();

		if (class480_sub13_sub1.method17541() != Class253.aClass253_2721) {
			throw new IllegalArgumentException_Sub1(class480_sub13_sub1, "");
		}

		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9572[0][i + 0] = f;
			aFloatArrayArray9572[0][i + 1] = f_2_;
			aFloatArrayArray9572[0][i + 2] = f_3_;
			aBoolArray9573[0] = true;
		}

		if (i_4_ >= 0) {
			i_4_ *= 4;
			aFloatArrayArray9572[1][i_4_ + 0] = f;
			aFloatArrayArray9572[1][i_4_ + 1] = f_2_;
			aFloatArrayArray9572[1][i_4_ + 2] = f_3_;
			aBoolArray9573[1] = true;
		}
	}

	@Override
	void method4651(Class480_Sub13_Sub1 class480_sub13_sub1, float f, float f_5_, float f_6_, float f_7_) {
		int i = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18111();
		int i_8_ = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18113();

		if (class480_sub13_sub1.method17541() != Class253.aClass253_2695) {
			throw new IllegalArgumentException_Sub1(class480_sub13_sub1, "");
		}

		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9572[0][i + 0] = f;
			aFloatArrayArray9572[0][i + 1] = f_5_;
			aFloatArrayArray9572[0][i + 2] = f_6_;
			aFloatArrayArray9572[0][i + 3] = f_7_;
			aBoolArray9573[0] = true;
		}

		if (i_8_ >= 0) {
			i_8_ *= 4;
			aFloatArrayArray9572[1][i_8_ + 0] = f;
			aFloatArrayArray9572[1][i_8_ + 1] = f_5_;
			aFloatArrayArray9572[1][i_8_ + 2] = f_6_;
			aFloatArrayArray9572[1][i_8_ + 3] = f_7_;
			aBoolArray9573[1] = true;
		}
	}

	@Override
	void method4653(Class480_Sub13_Sub1 class480_sub13_sub1, Matrix4f matrix) {
		int i = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18111();
		int i_9_ = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18113();

		if (class480_sub13_sub1.method17541() != Class253.aClass253_2736) {
			throw new IllegalArgumentException_Sub1(class480_sub13_sub1, "");
		}

		if (i >= 0) {
			method15102(i, matrix.method6575(aFloatArray9570), 8);
		}

		if (i_9_ >= 0) {
			method15103(i_9_, matrix.method6575(aFloatArray9570), 8);
		}
	}

	@Override
	void method4655(Class480_Sub13_Sub1 class480_sub13_sub1, int i, NativeTexture texture) {
		toolkit.method14666(i);
		toolkit.method14689(texture);
	}

	@Override
	void method4659(int i, Matrix4f class399) {
		int i_30_ = i >> 16;
		int i_31_ = (i & 0xffff) * 4;

		System.arraycopy(class399.method6573(aFloatArray9570), 0, aFloatArrayArray9572[i_30_], i_31_, 12);
		aBoolArray9573[i_30_] = true;
	}

	@Override
	void method4660(int i, Matrix4f class399) {
		int i_15_ = i >> 16;
		int i_16_ = (i & 0xffff) * 4;

		System.arraycopy(class399.method6575(aFloatArray9570), 0, aFloatArrayArray9572[i_15_], i_16_, 8);
		aBoolArray9573[i_15_] = true;
	}

	@Override
	void method4661(int i, float[] fs, int i_19_) {
		int i_20_ = i >> 16;
		int i_21_ = (i & 0xffff) * 4;

		System.arraycopy(fs, 0, aFloatArrayArray9572[i_20_], i_21_, i_19_);
		aBoolArray9573[i_20_] = true;
	}

	@Override
	void method4663(Class480_Sub13_Sub1 class480_sub13_sub1, float[] fs, int i) {
		int i_32_ = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18111();
		int i_33_ = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18113();

		if (class480_sub13_sub1.method17541() != Class253.aClass253_2697) {
			throw new IllegalArgumentException_Sub1(class480_sub13_sub1, "");
		}

		if (i_32_ >= 0) {
			method15102(i_32_, fs, i);
		}

		if (i_33_ >= 0) {
			method15103(i_33_, fs, i);
		}
	}

	@Override
	void method4665(Class480_Sub13_Sub1 class480_sub13_sub1, Matrix4f texture) {
		int i = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18111();
		int i_10_ = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18113();

		if (class480_sub13_sub1.method17541() != Class253.aClass253_2738) {
			throw new IllegalArgumentException_Sub1(class480_sub13_sub1, "");
		}

		if (i >= 0) {
			method15102(i, texture.method6573(aFloatArray9570), 16);
		}

		if (i_10_ >= 0) {
			method15103(i_10_, texture.method6573(aFloatArray9570), 16);
		}
	}

	@Override
	void method4668(int i, float f, float f_25_, float f_26_, float f_27_) {
		int i_28_ = i >> 16;
		int i_29_ = (i & 0xffff) * 4;

		aFloatArrayArray9572[i_28_][i_29_] = f;
		aFloatArrayArray9572[i_28_][i_29_ + 1] = f_25_;
		aFloatArrayArray9572[i_28_][i_29_ + 2] = f_26_;
		aFloatArrayArray9572[i_28_][i_29_ + 3] = f_27_;
		aBoolArray9573[i_28_] = true;
	}

	@Override
	void method4674(int i, int i_24_, NativeTexture texture) {
		toolkit.method14666(i_24_);
		toolkit.method14689(texture);
	}

	@Override
	void method4681(int i, float f, float f_11_, float f_12_) {
		int i_13_ = i >> 16;
		int i_14_ = (i & 0xffff) * 4;

		aFloatArrayArray9572[i_13_][i_14_] = f;
		aFloatArrayArray9572[i_13_][i_14_ + 1] = f_11_;
		aFloatArrayArray9572[i_13_][i_14_ + 2] = f_12_;
		aBoolArray9573[i_13_] = true;
	}

	@Override
	void method4692(int i, Matrix4f matrix) {
		int i_17_ = i >> 16;
		int i_18_ = (i & 0xffff) * 4;

		System.arraycopy(matrix.method6573(aFloatArray9570), 0, aFloatArrayArray9572[i_17_], i_18_, 16);
		aBoolArray9573[i_17_] = true;
	}

	@Override
	void method4697(Class480_Sub13_Sub1 class480_sub13_sub1, float f) {
		int i = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18111();
		int i_34_ = ((Class480_Sub13_Sub1_Sub1) class480_sub13_sub1).method18113();

		if (class480_sub13_sub1.method17541() != Class253.aClass253_2729
				&& class480_sub13_sub1.method17541() != Class253.aClass253_2707) {
			throw new IllegalArgumentException_Sub1(class480_sub13_sub1, "");
		}

		if (i >= 0) {
			i *= 4;
			aFloatArrayArray9572[0][i] = f;
			aBoolArray9573[0] = true;
		}

		if (i_34_ >= 0) {
			i_34_ *= 4;
			aFloatArrayArray9572[1][i_34_] = f;
			aBoolArray9573[1] = true;
		}
	}

}