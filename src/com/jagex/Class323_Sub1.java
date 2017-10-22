package com.jagex;

import jagdx.IDirect3DDevice;
import jagdx.IUnknown;

import java.nio.ByteBuffer;

public class Class323_Sub1 extends Class323 {
	long identifier = 0L;
	DirectXToolkit toolkit;

	Class323_Sub1(DirectXToolkit toolkit, Class320[] class320s) {
		super(class320s);
		this.toolkit = toolkit;
		byte i = 0;
		ByteBuffer buffer = toolkit.aByteBuffer9279;
		buffer.clear();

		for (short index = 0; index < aClass320Array3425.length; index++) {
			short i_1_ = 0;
			Class320 class320 = aClass320Array3425[index];
			for (int i_2_ = 0; i_2_ < class320.method5729(); i_2_++) {
				Class316 class316 = class320.method5731(i_2_);
				if (class316 == Class316.aClass316_3) {
					method15281(buffer, index, i_1_, (byte) 2, (byte) 0, (byte) 0, (byte) 0);
				} else if (class316 == Class316.aClass316_1) {
					method15281(buffer, index, i_1_, (byte) 2, (byte) 0, (byte) 3, (byte) 0);
				} else if (class316 == Class316.aClass316_2) {
					method15281(buffer, index, i_1_, (byte) 4, (byte) 0, (byte) 10, (byte) 0);
				} else if (class316 == Class316.aClass316_12) {
					short i_5_ = index;
					short i_6_ = i_1_;
					byte i_7_ = 0;
					byte i_8_ = 0;
					byte i_9_ = 5;
					byte i_10_ = i;
					i++;

					method15281(buffer, i_5_, i_6_, i_7_, i_8_, i_9_, i_10_);
				} else if (class316 == Class316.aClass316_9) {
					short i_13_ = index;
					short i_14_ = i_1_;
					byte i_15_ = 1;
					byte i_16_ = 0;
					byte i_17_ = 5;
					byte i_18_ = i;
					i++;

					method15281(buffer, i_13_, i_14_, i_15_, i_16_, i_17_, i_18_);
				} else if (class316 == Class316.aClass316_5) {
					short i_21_ = index;
					short i_22_ = i_1_;
					byte i_23_ = 2;
					byte i_24_ = 0;
					byte i_25_ = 5;
					byte i_26_ = i;
					i++;

					method15281(buffer, i_21_, i_22_, i_23_, i_24_, i_25_, i_26_);
				} else if (class316 == Class316.aClass316_6) {
					short i_29_ = index;
					short i_30_ = i_1_;
					byte i_31_ = 3;
					byte i_32_ = 0;
					byte i_33_ = 5;
					byte i_34_ = i;
					i++;

					method15281(buffer, i_29_, i_30_, i_31_, i_32_, i_33_, i_34_);
				}

				i_1_ += class316.anInt3377;
			}
		}

		method15281(buffer, (short) 255, (short) 0, (byte) 17, (byte) 0, (byte) 0, (byte) 0);
		identifier = IDirect3DDevice.CreateVertexDeclaration(toolkit.aLong4029, toolkit.aLong9268);
		toolkit.method14863(this);
	}

	@Override
	public void finalize() {
		if (identifier != 0L) {
			toolkit.method17421(identifier);
			identifier = 0L;
		}
	}

	@Override
	public void deleteImmediately() {
		if (identifier != 0L) {
			IUnknown.Release(identifier);
			identifier = 0L;
		}

		toolkit.method14583(this);
	}

	void method15281(ByteBuffer buffer, short i, short i_35_, byte i_36_, byte i_37_, byte i_38_, byte i_39_) {
		buffer.putShort(i);
		buffer.putShort(i_35_);
		buffer.put(i_36_);
		buffer.put(i_37_);
		buffer.put(i_38_);
		buffer.put(i_39_);
	}

}