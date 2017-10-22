package com.jagex;

public class NativeLibraryLoadException extends Exception {

	static final void method17347(int i, int i_0_, int i_1_, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		int i_7_ = i_5_ - 334;
		if (i_7_ < 0) {
			i_7_ = 0;
		} else if (i_7_ > 100) {
			i_7_ = 100;
		}

		int i_8_ = (Client.aShort10881 - Client.aShort10880) * i_7_ / 100 + Client.aShort10880;
		i_4_ = i_8_ * i_4_ >> 8;
		int i_9_ = 16384 - i_2_ & 0x3fff;
		int i_10_ = 16384 - i_3_ & 0x3fff;
		int i_11_ = 0;
		int i_12_ = 0;
		int i_13_ = i_4_;

		if (i_9_ != 0) {
			i_12_ = -i_13_ * Class373.SINE[i_9_] >> 14;
			i_13_ = Class373.COSINE[i_9_] * i_13_ >> 14;
		}

		if (i_10_ != 0) {
			i_11_ = i_13_ * Class373.SINE[i_10_] >> 14;
			i_13_ = Class373.COSINE[i_10_] * i_13_ >> 14;
		}

		Client.cameraX = (i - i_11_) * -224503671;
		Class268.cameraY = (i_0_ - i_12_) * -1128143643;
		Wall.cameraZ = -187933039 * (i_1_ - i_13_);
		Class155.anInt1874 = -1300105055 * i_2_;
		Class550.anInt7476 = i_3_ * -1726145155;
		IncomingFrameMeta.anInt4473 = 0;
	}

	public int code;
	public String name;

	public NativeLibraryLoadException(int code, String name) {
		this(code, name, null);
	}

	public NativeLibraryLoadException(int code, String name, Throwable throwable) {
		super(throwable);
		this.name = name;
		this.code = -757321647 * code;
	}

}