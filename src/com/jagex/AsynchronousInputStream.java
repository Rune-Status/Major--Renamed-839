package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;

public class AsynchronousInputStream implements Runnable {
	public static SystemInformation systemInfo;

	public static void method8775(Interface class221, Widget class226) {
		Widget class226_13_ = Class339.method5850(class221, class226, 50579382);
		int i_14_;
		int i_15_;
		if (null == class226_13_) {
			i_14_ = 1319181337 * Engine.screenWidth;
			i_15_ = Engine.screenHeight * -551672947;
		} else {
			i_14_ = 688089097 * class226_13_.width;
			i_15_ = 1362321717 * class226_13_.height;
		}
		Widget.method15084(class226, i_14_, i_15_, false, (byte) -70);
		Class197.method3866(class226, i_14_, i_15_, (byte) -33);
	}

	static final void method8771(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.groundBlending
				.supported() ? 1 : 0;
	}

	static final void method8772(ScriptExecutionContext class613, short i) {
		int i_10_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Class199.preferences.aClass632_Sub11_10264
				.compatible(i_10_);
	}

	static int method8773() {
		return (Class248.anInt2665 += 1761049015) * 1234285575 - 1;
	}

	IOException exception;
	InputStream input;
	int size;
	byte[] buffer;
	Thread thread;
	int offset;
	int readIndex = 0;

	AsynchronousInputStream(InputStream inputstream, int size) {
		offset = 0;
		input = inputstream;
		this.size = (size + 1) * -534320817;
		buffer = new byte[this.size * 356158895];
		thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
	}

	@Override
	public void run() {
		for (;;) {
			int length;
			synchronized (this) {
				for (;;) {
					if (null != exception) {
						return;
					}

					if (readIndex * -114465209 == 0) {
						length = size * 356158895 - 1218508679 * offset - 1;
					} else if (readIndex * -114465209 <= offset * 1218508679) {
						length = size * 356158895 - 1218508679 * offset;
					} else {
						length = -114465209 * readIndex - 1218508679 * offset - 1;
					}

					if (length > 0) {
						break;
					}

					try {
						wait();
					} catch (InterruptedException ex) {

					}
				}
			}
			int in;
			try {
				in = input.read(buffer, 1218508679 * offset, length);
				if (in == -1) {
					throw new EOFException();
				}
			} catch (IOException ioexception) {
				synchronized (this) {
					exception = ioexception;
					break;
				}
			}
			synchronized (this) {
				offset = (1218508679 * offset + in) % (size * 356158895) * -1668342217;
			}
		}
	}

	void stop() {
		synchronized (this) {
			if (exception == null) {
				exception = new IOException("");
			}
			notifyAll();
		}

		try {
			thread.join();
		} catch (InterruptedException interruptedexception) {

		}
	}

	boolean available(int count) throws IOException {
		if (count <= 0 || count >= size * 356158895) {
			throw new IOException();
		}

		synchronized (this) {
			int available;
			if (-114465209 * readIndex <= 1218508679 * offset) {
				available = 1218508679 * offset - -114465209 * readIndex;
			} else {
				available = size * 356158895 - readIndex * -114465209 + offset * 1218508679;
			}

			if (available < count) {
				if (null != exception) {
					throw new IOException(exception.toString());
				}

				notifyAll();
				return false;
			}

			return true;
		}
	}

	int available() throws IOException {
		synchronized (this) {
			int available;
			if (readIndex * -114465209 <= offset * 1218508679) {
				available = offset * 1218508679 - -114465209 * readIndex;
			} else {
				available = 356158895 * size - -114465209 * readIndex + offset * 1218508679;
			}
			if (null != exception) {
				throw new IOException(exception.toString());
			}

			notifyAll();
			return available;
		}
	}

	void close() {
		input = new DummyInputStream();
	}

	int read(byte[] buffer, int off, int length) throws IOException {
		if (length < 0 || off < 0 || length + off > buffer.length) {
			throw new IOException();
		}

		synchronized (this) {
			int max;
			if (readIndex * -114465209 <= offset * 1218508679) {
				max = offset * 1218508679 - -114465209 * readIndex;
			} else {
				max = offset * 1218508679 + size * 356158895 - -114465209 * readIndex;
			}

			if (length > max) {
				length = max;
			}

			if (0 == length && exception != null) {
				throw new IOException(exception.toString());
			}

			if (-114465209 * readIndex + length <= 356158895 * size) {
				System.arraycopy(this.buffer, readIndex * -114465209, buffer, off, length);
			} else {
				int i_8_ = size * 356158895 - readIndex * -114465209;
				System.arraycopy(this.buffer, readIndex * -114465209, buffer, off, i_8_);
				System.arraycopy(this.buffer, 0, buffer, i_8_ + off, length - i_8_);
			}

			readIndex = (-114465209 * readIndex + length) % (356158895 * size) * 736650103;
			notifyAll();
			return length;
		}
	}

}