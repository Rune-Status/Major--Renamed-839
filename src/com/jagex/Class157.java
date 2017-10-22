package com.jagex;

class Class157 implements Interface52 {

	public static Class257 method3301(int i) {
		if (-2084034471 * Class257.aClass257_2848.anInt2854 == i) {
			return Class257.aClass257_2848;
		} else if (i == Class257.aClass257_2855.anInt2854 * -2084034471) {
			return Class257.aClass257_2855;
		} else if (i == -2084034471 * Class257.aClass257_2849.anInt2854) {
			return Class257.aClass257_2849;
		} else if (Class257.aClass257_2850.anInt2854 * -2084034471 == i) {
			return Class257.aClass257_2850;
		} else if (Class257.aClass257_2851.anInt2854 * -2084034471 == i) {
			return Class257.aClass257_2851;
		} else if (Class257.aClass257_2852.anInt2854 * -2084034471 == i) {
			return Class257.aClass257_2852;
		} else if (i == Class257.aClass257_2847.anInt2854 * -2084034471) {
			return Class257.aClass257_2847;
		}

		return null;
	}

	public static void method3302() {
		NativeMouseRecord.method3315();
		ComponentMouseRecord.encoder.pulse();
		NativeMouseRecord.encoder.pulse();

		if (Client.maximumHeldKeys * 767783973 > 0) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3962,
					Client.gameConnection.encryptor);
			frame.payload.writeShort(Client.maximumHeldKeys * -1223831404);

			for (int i_24_ = 0; i_24_ < Client.maximumHeldKeys * 767783973; i_24_++) {
				KeyRecord interface59 = Client.anInterface59Array10640[i_24_];
				long l = interface59.getTime() - Class597.aLong7841 * 7157067078869771493L;
				if (l > 16777215L) {
					l = 16777215L;
				}

				Class597.aLong7841 = interface59.getTime() * 6316292173340227821L;
				frame.payload.writeByte(interface59.getCode());
				frame.payload.writeTriByte((int) l);
			}

			Client.gameConnection.sendFrame(frame);
		}

		if (Class597.anInt7842 * -947242039 > 0) {
			Class597.anInt7842 -= -501297543;
		}

		if (Client.aBool10611 && -947242039 * Class597.anInt7842 <= 0) {
			Class597.anInt7842 = -1436016268;
			Client.aBool10611 = false;
			int i_25_;
			int i_26_;

			if (Connection.anInt7170 * 1212513917 == 3) {
				if (Class369.aClass261_Sub1_4079.method4837() == Class270.aClass270_2995) {
					Class281_Sub2 class281_sub2 = (Class281_Sub2) Class369.aClass261_Sub1_4079.method4876();
					i_25_ = Class198.method3870(class281_sub2.aClass395_9749) >> 3;
					int i_27_ = 1024;
					i_26_ = (3 * i_27_ - (BaseVariableParameterDefinition.method2284(class281_sub2.aClass395_9749) >> 3))
							% (2 * i_27_);
				} else {
					i_25_ = 0;
					i_26_ = 0;
				}
			} else {
				i_25_ = (int) Client.aFloat10708 >> 3;
				i_26_ = (int) Client.aFloat10787 >> 3;
			}
			OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3935,
					Client.gameConnection.encryptor);
			class480_sub15.payload.writeShortA(i_25_);
			class480_sub15.payload.writeShort(i_26_);
			Client.gameConnection.sendFrame(class480_sub15);
		}
		if (HashedVariableCollection.aBool1483 != Class597.aBool7843) {
			Class597.aBool7843 = HashedVariableCollection.aBool1483;
			OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3959,
					Client.gameConnection.encryptor);
			class480_sub15.payload.writeByte(HashedVariableCollection.aBool1483 ? 1 : 0);
			Client.gameConnection.sendFrame(class480_sub15);
		}
		if (!Client.sentPreferences) {
			OutgoingFrame class480_sub15 = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4006,
					Client.gameConnection.encryptor);
			class480_sub15.payload.writeByte(0);
			int i_28_ = class480_sub15.payload.offset * -165875887;
			Buffer buffer = Class199.preferences.encode();
			class480_sub15.payload.writeBytes(buffer.payload, 0, buffer.offset * -165875887);
			class480_sub15.payload.writeSizeByte(class480_sub15.payload.offset * -165875887 - i_28_);
			Client.gameConnection.sendFrame(class480_sub15);
			Client.sentPreferences = true;
		}
	}

	Class186 this$0;

	Class157(Class186 class186) {
		this$0 = class186;
	}

	@Override
	public void method345(Object object, float[] fs, Object[] objects, int i) {
		Class456 class456 = (Class456) object;
		Class397 class397 = class456.method7518();
		float f = class456.method7425();
		float f_0_ = class456.method7448();
		Class397 class397_1_ = this$0.method3598();
		Class397 class397_2_ = Class397.difference(class397, class397_1_);
		float f_3_ = 0.0F;
		int i_4_ = 8192;
		float f_5_ = class397_2_.distance();
		float f_6_ = 0.0F;
		if (f_5_ >= f_0_) {
			f_3_ = 0.0F;
		} else {
			float f_7_ = ((Float) objects[0]).floatValue();
			float f_8_ = ((Float) objects[1]).floatValue();
			if (class397_1_.x > class397.x - f_7_ / 2.0F && class397_1_.x < class397.x + f_7_ / 2.0F
					&& class397_1_.z > class397.z - f_8_ / 2.0F && class397_1_.z < class397.z + f_8_ / 2.0F) {
				float f_9_ = Math.abs(class397_1_.x - (f_7_ / 2.0F + class397.x));
				float f_10_ = Math.abs(class397_1_.x - (class397.x - f_7_ / 2.0F));
				float f_11_ = Math.abs(class397_1_.z - (f_8_ / 2.0F + class397.x));
				float f_12_ = Math.abs(class397_1_.z - (class397.x - f_8_ / 2.0F));
				float f_13_ = f_0_ - f;
				float f_14_ = Math.min(f_9_, f_10_);
				float f_15_ = Math.min(f_11_, f_12_);
				float f_16_ = 1.0F / f_13_ * f_14_;
				float f_17_ = f_15_ * (1.0F / f_13_);
				f_16_ = Math.min(Math.max(f_16_, 0.0F), 1.0F);
				f_17_ = Math.min(Math.max(f_17_, 0.0F), 1.0F);
				f_3_ = Math.min(f_16_, f_17_);
			}
			if (class397_2_.x != 0.0F || class397_2_.z != 0.0F) {
				if (1212513917 * Connection.anInt7170 == 3) {
					float f_18_ = Class369.aClass261_Sub1_4079.method4843();
					if (class397_2_.x != 0.0F || class397_2_.z != 0.0F) {
						int i_19_ = (int) (2607.5945876176133 * (-1.0F * f_18_))
								- (int) (Math.atan2(class397_2_.x, class397_2_.z) * 2607.5945876176133) - 4096 & 0x3fff;
						if (i_19_ > 8192) {
							i_19_ = 16384 - i_19_;
						}
						int i_20_;
						if (f_5_ <= 0.0F) {
							i_20_ = 8192;
						} else if (f_5_ >= 4096.0F) {
							i_20_ = 16384;
						} else {
							i_20_ = (int) (f_5_ * 8192.0F / 4096.0F + 8192.0F);
						}
						i_4_ = i_20_ * i_19_ / 8192 + (16384 - i_20_ >> 1);
					}
					f_6_ = 6.1035156E-5F * i_4_;
				} else {
					int i_21_ = -(Class550.anInt7476 * 1686504405)
							- (int) (Math.atan2(class397_2_.x, class397_2_.z) * 2607.5945876176133) - 4096 & 0x3fff;
					if (i_21_ > 8192) {
						i_21_ = 16384 - i_21_;
					}
					int i_22_;
					if (f_5_ <= 0.0F) {
						i_22_ = 8192;
					} else if (f_5_ >= 4096.0F) {
						i_22_ = 16384;
					} else {
						i_22_ = (int) (f_5_ * 8192.0F / 4096.0F + 8192.0F);
					}
					i_4_ = (16384 - i_22_ >> 1) + i_22_ * i_21_ / 8192;
					f_6_ = 6.1035156E-5F * i_4_;
				}
			}
		}
		fs[0] = (float) (i_4_ < 0 ? (double) f_3_ : f_3_ * Math.sqrt(1.0F - f_6_));
		fs[1] = (float) (i_4_ < 0 ? (double) -f_3_ : f_3_ * Math.sqrt(f_6_));
	}

}