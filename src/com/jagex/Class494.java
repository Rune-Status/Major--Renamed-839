package com.jagex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

public class Class494 {
	static boolean method8545(SceneObject object, ObjectDefinitionLoader loader, int i, int i_35_) {
		if (object == null) {
			return false;
		}

		ObjectDefinition definition = loader.get(object.getId());
		if (definition.isMembers && !Client.membersWorld) {
			return false;
		}

		int function = 1294173105 * definition.mapFunction;
		if (definition.morphisms != null) {
			for (int id : definition.morphisms) {
				if (id != -1) {
					ObjectDefinition morphism = loader.get(id);

					if (1294173105 * morphism.mapFunction >= 0) {
						function = morphism.mapFunction * 1294173105;
					}
				}
			}
		}

		if (function >= 0) {
			Class63.anIntArray953[Class63.anInt947 * -399051693] = definition.anInt7369 * -894246227;
			Class63.anIntArray945[-399051693 * Class63.anInt947] = i;
			Class63.anIntArray946[-399051693 * Class63.anInt947] = i_35_;
			Class63.anInt947 += 1964994523;
			return true;
		}

		return false;
	}

	SourceDataLine line;
	float sampleRate;
	int channels = -1004049262;
	byte[] aByteArray6792;
	boolean aBool6793;
	int anInt6794;
	int offset;
	List<Class502> aList6796 = new ArrayList<Class502>();
	int sampleSize = 1277260880;
	byte[] buffer;
	int anInt6799;
	Class343_Sub2 this$0;

	Class494(Class343_Sub2 class343_sub2, float rate, int bufferSize) {
		this$0 = class343_sub2;

		if (!aBool6793) {
			this.sampleRate = rate;
			if (-192158835 * sampleSize > 16) {
				throw new RuntimeException("");
			}

			try {
				AudioFormat format = new AudioFormat(sampleRate, sampleSize * -192158835, -1446372359 * channels, true,
						false);
				try {
					DataLine.Info info = new DataLine.Info(javax.sound.sampled.SourceDataLine.class, format, bufferSize);
					line = (SourceDataLine) AudioSystem.getLine(info);
				} catch (IllegalArgumentException ex) {
					return;
				}

				line.open(format, bufferSize);
				line.start();
			} catch (LineUnavailableException ex) {
				return;
			}

			buffer = new byte[bufferSize];
			aByteArray6792 = new byte[-192158835 * sampleSize / 8];
			offset = 0;
			aBool6793 = true;
		}
	}

	void method8529() {
		if (aBool6793) {
			if (null != line) {
				anInt6799 = line.available() * 1417449503;
			}
		}
	}

	void method8530() {
		anInt6794 = 0;
		method8537();

		int length;
		for (; -1897367679 * anInt6794 > 0; anInt6794 -= length * 1459603585) {
			length = anInt6794 * -1897367679;
			if (length + 2105877739 * offset >= buffer.length) {
				length = buffer.length - offset * 2105877739;
			}

			line.write(buffer, 2105877739 * offset, length);
			for (int index = 0; index < length; index++) {
				buffer[index + offset * 2105877739] = (byte) 0;
			}

			offset += length * -1754635325;
			offset = offset * 2105877739 % buffer.length * -1754635325;
		}
	}

	void add(Class502 class502) {
		aList6796.add(class502);
	}

	void remove(Class502 class502) {
		aList6796.remove(class502);
	}

	void method8537() {
		synchronized (this) {
			int i_2_ = 2147483647;
			double d = -192158835 * sampleSize / 8 * channels * -1446372359;
			boolean bool = false;
			Iterator<Class502> iterator = aList6796.iterator();

			while (iterator.hasNext()) {
				Class502 class502 = iterator.next();
				int i_3_ = class502.aByteArray6907.length - class502.anInt6909 * 813545385;

				if (sampleRate != class502.aFloat6911) {
					i_3_ *= sampleRate / class502.aFloat6911;
					i_3_ = (int) (d * Math.ceil(i_3_ / d));
				}

				class502.anInt6910 = 1413533159 * i_3_;
				if (i_3_ > 0 && i_3_ < i_2_) {
					bool = true;
					i_2_ = i_3_;
				}
			}

			if (i_2_ > 579791839 * anInt6799) {
				i_2_ = 579791839 * anInt6799;
			}

			if (i_2_ == 0 || false == bool) {

			} else {
				int size = sampleSize * -192158835 / 8;
				Iterator iterator_5_ = aList6796.iterator();

				while (iterator_5_.hasNext()) {
					Class502 class502 = (Class502) iterator_5_.next();

					if (class502.anInt6910 * -1061947945 >= i_2_) {
						int i_6_ = offset * 2105877739;
						int i_7_ = 0;
						int i_8_ = -234671889 * class502.anInt6912 / 8;
						double d_9_ = 0.0;
						int i_10_ = 0;

						double rate = sampleRate;
						double d_12_ = class502.aFloat6911;
						int i_13_ = class502.anInt6913 * -466138681;

						for (; class502.anInt6910 * -1061947945 > 0 && i_7_ < i_2_; i_7_ += i_8_) {
							short i_14_ = 0;
							short i_15_ = 0;
							byte[] is = aByteArray6792;

							for (int i_16_ = 0; i_16_ < is.length; i_16_++) {
								is[i_16_] = buffer[i_6_ + i_16_];
								i_14_ |= (is[i_16_] & 0xff) << i_16_ * 8;
							}

							if (class502.aFloat6911 != sampleRate) {
								byte[] is_17_ = class502.aByteArray6905;
								float f = (float) (d_12_ * (d_9_ / rate));
								float f_18_ = (float) Math.floor(f);
								short i_19_ = 0;
								short i_20_ = 0;
								int i_21_ = (int) Math.floor(f);
								int i_22_ = (int) Math.ceil(f);

								i_21_ = i_21_ * is_17_.length * -1097509819 * class502.anInt6906 + i_10_
										* is_17_.length;
								i_22_ = is_17_.length * i_10_ + is_17_.length * -1097509819 * class502.anInt6906
										* i_22_;

								i_21_ += i_13_;
								i_22_ += i_13_;
								i_21_ %= class502.aByteArray6907.length;
								i_22_ %= class502.aByteArray6907.length;

								for (int i_23_ = 0; i_23_ < is_17_.length; i_23_++) {
									is_17_[i_23_] = class502.aByteArray6907[i_23_ + i_21_];
									i_19_ |= (is_17_[i_23_] & 0xff) << 8 * i_23_;
								}

								for (int i_24_ = 0; i_24_ < is_17_.length; i_24_++) {
									is_17_[i_24_] = class502.aByteArray6907[i_22_ + i_24_];
									i_20_ |= (is_17_[i_24_] & 0xff) << i_24_ * 8;
								}

								float f_25_ = f - f_18_;
								if (f_25_ < 0.0F || f_25_ > 1.0F) {
									throw new RuntimeException("");
								}

								float f_26_ = i_20_ - i_19_;
								i_15_ = (short) (int) (i_19_ + f_25_ * f_26_);
								i_10_ = ++i_10_ % (class502.anInt6906 * -1097509819);

								if (i_10_ == 0) {
									d_9_++;
								}
							} else {
								byte[] is_27_ = class502.aByteArray6905;
								for (int i_28_ = 0; i_28_ < is_27_.length; i_28_++) {
									is_27_[i_28_] = class502.aByteArray6907[-466138681 * class502.anInt6913 + i_28_];
									i_15_ |= (is_27_[i_28_] & 0xff) << i_28_ * 8;
								}

								class502.anInt6913 += -297687049 * i_8_;
								Class502 class502_29_;
								(class502_29_ = class502).anInt6913 = -297687049
										* (-466138681 * class502_29_.anInt6913 % class502.aByteArray6907.length);
								class502.anInt6909 += i_8_ * -406266727;
							}

							i_15_ += i_14_;
							if (i_15_ > 32767) {
								i_15_ = (short) 32767;
							}

							if (i_15_ < -32768) {
								i_15_ = (short) -32768;
							}

							buffer[i_6_] = (byte) i_15_;
							buffer[i_6_ + 1] = (byte) (i_15_ >> 8);

							i_6_ += size;
							i_6_ %= buffer.length;
						}

						if (sampleRate != class502.aFloat6911) {
							double d_30_ = d_12_ / rate * i_2_;
							int i_31_ = (int) (d * Math.ceil(d_30_ / d));
							class502.anInt6913 += i_31_ * -297687049;
							Class502 class502_32_;
							(class502_32_ = class502).anInt6913 = -297687049
									* (-466138681 * class502_32_.anInt6913 % class502.aByteArray6907.length);
							class502.anInt6909 += -406266727 * i_31_;
						}
					}
				}

				anInt6794 = 1459603585 * i_2_;
			}
		}
	}

}