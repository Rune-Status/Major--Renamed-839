package com.jagex;

import java.io.EOFException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public final class Class126_Sub1 extends HashedVariableCollection {
	static final int anInt8689 = 1;

	public static void method14046(String string, int i) {
		if (6 == -1501875989 * Client.gameState) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4007,
					Client.lobbyConnection.encryptor);
			frame.payload.writeShort(0);
			int start = -165875887 * frame.payload.offset;
			frame.payload.writeCString(string);
			frame.payload.offset += 217060311;
			frame.payload.encodeXtea(Class34.anIntArray447, start, frame.payload.offset * -165875887);
			frame.payload.writeSizeShort(frame.payload.offset * -165875887 - start, 64776330);
			Client.lobbyConnection.sendFrame(frame);
			Class34.aClass637_448 = Class637.aClass637_8133;
		}
	}

	long aLong8685 = -956803499012045599L;
	Set aSet8686;
	public long aLong8687 = 1919865964466079015L;
	boolean aBool8688;
	int anInt8690;
	DefaultMapEntry[] aClass383Array8691;
	public boolean aBool8692 = false;

	Class419[] aClass419Array8693;

	public Class126_Sub1(DefaultProvidingVarpLoader loader) {
		super(loader);

		aClass419Array8693 = new Class419[loader.count()];
		for (int index = 0; index < loader.count(); index++) {
			aClass419Array8693[index] = loader.get(index).aClass419_1514;
		}

		aSet8686 = new HashSet(loader.count());
	}

	public void method14030() {
		if (TimeUtil.time() >= -7831315304988999457L * aLong8685) {
			if (null == aClass383Array8691) {
				if (!aBool8688) {
					return;
				}

				aClass383Array8691 = new DefaultMapEntry[aSet8686.size()];
				int i_0_ = 0;
				Iterator iterator = aSet8686.iterator();
				while (iterator.hasNext()) {
					int i_1_ = ((Integer) iterator.next()).intValue();
					aClass383Array8691[i_0_++] = new DefaultMapEntry(i_1_, map.getOrDefaultObject(i_1_));
				}

				anInt8690 = 0;
				aBool8688 = false;
				aSet8686.clear();
			}

			if (aClass383Array8691 != null && 644319277 * anInt8690 < aClass383Array8691.length) {
				BufferedConnectionContext connection = Client.getActiveConnection();
				if (381339389 * connection.buffered <= 1200) {
					OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3934, connection.encryptor);
					frame.payload.writeShort(0);
					int start = -165875887 * frame.payload.offset;
					frame.payload.offset += 1258142129;
					for (; 644319277 * anInt8690 < aClass383Array8691.length; anInt8690 += -2143549531) {
						DefaultMapEntry entry = aClass383Array8691[anInt8690 * 644319277];
						if (-165875887 * frame.payload.offset + connection.buffered * 381339389
								+ Class630.aClass77_Sub1_Sub1_8060.getEncodedSize(entry) > 1500) {
							break;
						}
						Class630.aClass77_Sub1_Sub1_8060.encode(frame.payload, entry);
					}

					frame.payload.writeSizeShort(frame.payload.offset * -165875887 - start, 128940071);
					if (644319277 * anInt8690 >= aClass383Array8691.length) {
						frame.payload.payload[start] = (byte) 1;
					} else {
						frame.payload.payload[start] = (byte) 0;
					}

					connection.sendFrame(frame);
					aLong8685 = (TimeUtil.time() + 1000L) * 956803499012045599L;
				}
			}
		}
	}

	public void method14032() {
		for (int i_5_ = 0; i_5_ < aClass419Array8693.length; i_5_++) {
			if (aClass419Array8693[i_5_] == Class419.aClass419_4652
					|| aClass419Array8693[i_5_] == Class419.aClass419_4653) {
				map.remove(i_5_);
			}
		}

		aSet8686.clear();
		aBool8688 = false;
		aClass383Array8691 = null;
		aLong8685 = -956803499012045599L;
	}

	public void method14033(DiskFile file) {
		do {
			try {
				try {
					byte[] is = new byte[(int) file.length()];
					int i_6_;
					for (int i_7_ = 0; i_7_ < is.length; i_7_ += i_6_) {
						i_6_ = file.read(is, i_7_, is.length - i_7_);
						if (i_6_ == -1) {
							throw new EOFException();
						}
					}
					Buffer buffer = new Buffer(is);
					if (buffer.payload.length - buffer.offset * -165875887 < 1) {
						try {
							file.close();
						} catch (Exception exception) {

						}
						break;
					}
					int i_8_ = buffer.readUByte();
					if (i_8_ < 0 || i_8_ > 1) {
						try {
							file.close();
						} catch (Exception exception) {

						}
						break;
					}
					if (buffer.payload.length - -165875887 * buffer.offset < 2) {
						try {
							file.close();
						} catch (Exception exception) {

						}
						break;
					}
					int i_9_ = buffer.readUShort();
					if (buffer.payload.length - buffer.offset * -165875887 < 6 * i_9_) {
						try {
							file.close();
						} catch (Exception exception) {

						}
						break;
					}
					for (int i_10_ = 0; i_10_ < i_9_; i_10_++) {
						DefaultMapEntry class383 = Class630.aClass77_Sub1_Sub1_8060.method13918(buffer);
						if (Class419.aClass419_4654 == aClass419Array8693[1960527763 * class383.key]
								&& ((BaseVariableParameterDefinition) Class630.aClass77_Sub1_Sub1_8060
										.get(1960527763 * class383.key)).aClass422_1515.getValueType().classType
										.isAssignableFrom(class383.value.getClass())) {
							map.put(class383.key * 1960527763, class383.value);
						}
					}
				} catch (Exception exception) {
					try {
						file.close();
					} catch (Exception exception_11_) {
						exception = exception_11_;
					}
					break;
				}
				try {
					file.close();
				} catch (Exception exception) {

				}
			} catch (Exception object) {
				try {
					file.close();
				} catch (Exception exception) {

				}
			}
		} while (false);
	}

	public void method14034() {
		if (null != aClass383Array8691 && anInt8690 * 644319277 >= aClass383Array8691.length) {
			aClass383Array8691 = null;
			anInt8690 = 0;
		}
	}

	public void method14038() {
		anInt8690 = 0;
	}

	public void method14041(DiskFile class670, byte i) {
		do {
			try {
				try {
					int i_12_ = 3;
					int i_13_ = 0;
					Iterator iterator = map.iterator();
					while (iterator.hasNext()) {
						DefaultMapEntry class383 = (DefaultMapEntry) iterator.next();
						if (aClass419Array8693[class383.key * 1960527763] == Class419.aClass419_4654) {
							i_12_ += Class630.aClass77_Sub1_Sub1_8060.getEncodedSize(class383);
							i_13_++;
						}
					}
					Buffer buffer = new Buffer(i_12_);
					buffer.writeByte(1);
					buffer.writeShort(i_13_);
					Iterator iterator_14_ = map.iterator();
					while (iterator_14_.hasNext()) {
						DefaultMapEntry class383 = (DefaultMapEntry) iterator_14_.next();
						if (aClass419Array8693[1960527763 * class383.key] == Class419.aClass419_4654) {
							Class630.aClass77_Sub1_Sub1_8060.encode(buffer, class383);
						}
					}
					class670.write(buffer.payload, 0, -165875887 * buffer.offset);
				} catch (Exception exception) {
					try {
						class670.close();
					} catch (Exception exception_15_) {
						exception = exception_15_;
					}
					break;
				}
				try {
					class670.close();
				} catch (Exception exception) {

				}
			} catch (Exception object) {
				try {
					class670.close();
				} catch (Exception exception) {

				}
			}
		} while (false);
		aLong8687 = TimeUtil.time() * -1919865964466079015L;
		aBool8692 = false;
	}

	@Override
	public void setIntVarp(BaseVariableParameterDefinition parameter, int value) {
		if (aClass419Array8693[169834903 * parameter.id] == Class419.aClass419_4654) {
			aBool8692 = true;
		} else if (aClass419Array8693[parameter.id * 169834903] == Class419.aClass419_4653
				&& getVarp(parameter) != value) {
			aBool8688 = true;
			aSet8686.add(Integer.valueOf(parameter.id * 169834903));
		}
		super.setIntVarp(parameter, value);
	}

	@Override
	public void setStringVarp(BaseVariableParameterDefinition parameter, Object object) {
		if (aClass419Array8693[169834903 * parameter.id] == Class419.aClass419_4654) {
			aBool8692 = true;
		} else if (aClass419Array8693[169834903 * parameter.id] == Class419.aClass419_4653) {
			if (object instanceof String) {
				String string = (String) object;
				if (string.length() > 80) {
					object = string.substring(0, 80);
				}
			}

			Object object_4_ = getStringVarp(parameter);
			if (object != null && object_4_ != null && !object.equals(object_4_)) {
				aBool8688 = true;
				aSet8686.add(Integer.valueOf(parameter.id * 169834903));
			} else if (object_4_ == null != (null == object)) {
				aBool8688 = true;
				aSet8686.add(Integer.valueOf(parameter.id * 169834903));
			}
		}

		super.setStringVarp(parameter, object);
	}

	@Override
	public void setLongVarp(BaseVariableParameterDefinition parameter, long value) {
		if (aClass419Array8693[169834903 * parameter.id] == Class419.aClass419_4654) {
			aBool8692 = true;
		} else if (aClass419Array8693[parameter.id * 169834903] == Class419.aClass419_4653
				&& getLongVarp(parameter) != value) {
			aBool8688 = true;
			aSet8686.add(Integer.valueOf(169834903 * parameter.id));
		}

		super.setLongVarp(parameter, value);
	}

}