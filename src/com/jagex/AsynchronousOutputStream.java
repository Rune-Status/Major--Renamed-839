package com.jagex;

import java.io.IOException;
import java.io.OutputStream;

public class AsynchronousOutputStream implements Runnable {
	public static int anInt7300;
	public static int anInt7301;

	static final void method9164(ScriptExecutionContext class613, byte i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		Interface class221 = class611.aClass221_7913;
		Class470.method8044(class226, class221, class613);
	}

	static final void method9165(ScriptExecutionContext class613, int i) {
		int i_5_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_5_);
		Interface class221 = Class598.loadedInterfaces[i_5_ >> 16];
		VolumePreference.method16788(class226, class221, class613, 1837595482);
	}

	static final void method9166(ScriptExecutionContext class613, byte i) {
		class613.anInt7924 -= -2049596966;
		int i_6_ = class613.anIntArray7942[1841827045 * class613.anInt7924];
		int i_7_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class51.method1137(i_6_, i_7_,
				false, -1497011580);
	}

	static final void method9167(ScriptExecutionContext class613, int i) {
		Class611 class611 = class613.aBool7932 ? class613.aClass611_7945 : class613.aClass611_7931;
		Widget class226 = class611.aClass226_7914;
		int i_6_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		int i_7_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] - 1;
		if (2 != class226.anInt2418 * 286135323) {
			throw new RuntimeException("");
		}
		NpcDefinition definition = NpcDefinition.loader.get(class226.anInt2486 * -643054127);
		if (class226.aClass267_2361 == null) {
			class226.aClass267_2361 = new Class267(definition, false);
		}
		class226.aClass267_2361.aLong2977 = Class36.method992() * 359135170314717883L;
		if (i_7_ < 0 || i_7_ >= definition.headModels.length) {
			throw new RuntimeException("");
		}
		class226.aClass267_2361.models[i_7_] = i_6_;
		Widget.redraw(class226);
	}

	static void method9168(OutgoingFrame frame, int i, int i_8_, int i_9_) {
		frame.payload.writeMEInt(i);
		frame.payload.writeLEShort(i_9_);
		frame.payload.writeShort(i_8_);
	}

	int writeIndex;
	OutputStream output;
	int size;
	byte[] buffer;
	boolean stopped;
	Thread thread;
	int offset = 0;
	IOException exception;

	AsynchronousOutputStream(OutputStream outputstream, int size) {
		writeIndex = 0;
		output = outputstream;
		this.size = (size + 1) * 1991766665;
		buffer = new byte[-1587469383 * this.size];
		thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
	}

	@Override
	public void run() {
		do {
			int remaining;
			synchronized (this) {
				for (;;) {
					if (exception != null) {
						return;
					}

					if (offset * 563907745 <= 2119676427 * writeIndex) {
						remaining = 2119676427 * writeIndex - 563907745 * offset;
					} else {
						remaining = 2119676427 * writeIndex + size * -1587469383 - 563907745 * offset;
					}
					if (remaining > 0) {
						break;
					}

					try {
						output.flush();
					} catch (IOException ioexception) {
						exception = ioexception;
						return;
					}
					if (stopped()) {
						return;
					}
					try {
						wait();
					} catch (InterruptedException interruptedexception) {

					}
				}
			}
			try {
				if (remaining + 563907745 * offset <= size * -1587469383) {
					output.write(buffer, 563907745 * offset, remaining);
				} else {
					int length = size * -1587469383 - offset * 563907745;
					output.write(buffer, offset * 563907745, length);
					output.write(buffer, 0, remaining - length);
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					exception = ioexception;
					break;
				}
			}
			synchronized (this) {
				offset = -2124130463 * ((remaining + offset * 563907745) % (size * -1587469383));
			}
		} while (!stopped());
	}

	boolean stopped() {
		if (stopped) {
			try {
				output.close();
				if (null == exception) {
					exception = new IOException("");
				}
			} catch (IOException ioexception) {
				if (exception == null) {
					exception = new IOException(ioexception);
				}
			}

			return true;
		}

		return false;
	}

	void write(byte[] buffer, int offset, int length) throws IOException {
		if (length < 0 || offset < 0 || offset + length > buffer.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (null != exception) {
				throw new IOException(exception.toString());
			}

			int available;
			if (563907745 * this.offset <= writeIndex * 2119676427) {
				available = -1587469383 * size - writeIndex * 2119676427 + this.offset * 563907745 - 1;
			} else {
				available = this.offset * 563907745 - writeIndex * 2119676427 - 1;
			}

			if (available < length) {
				throw new IOException("");
			}

			if (writeIndex * 2119676427 + length <= -1587469383 * size) {
				System.arraycopy(buffer, offset, this.buffer, writeIndex * 2119676427, length);
			} else {
				int i_4_ = size * -1587469383 - 2119676427 * writeIndex;
				System.arraycopy(buffer, offset, this.buffer, 2119676427 * writeIndex, i_4_);
				System.arraycopy(buffer, offset + i_4_, this.buffer, 0, length - i_4_);
			}

			writeIndex = -864171613 * ((length + 2119676427 * writeIndex) % (-1587469383 * size));
			notifyAll();
		}
	}

	void stop() {
		synchronized (this) {
			stopped = true;
			notifyAll();
		}
		try {
			thread.join();
		} catch (InterruptedException interruptedexception) {

		}
	}

	void close() {
		output = new DummyOutputStream();
	}
}
