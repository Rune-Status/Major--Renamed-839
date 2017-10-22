package jaclib.memory;

public final class Stream {

	private static boolean aBool932 = getLSB(-65536) == -1;

	public static native int floatToRawIntBits(float value);

	public static final boolean method1427() {
		return aBool932;
	}

	private static final native byte getLSB(int value);

	private int anInt928;
	private Buffer backing;
	private final byte[] buffer;
	private int offset;
	private int written;

	public Stream() {
		this(4096);
	}

	public Stream(Buffer buffer) {
		this(buffer, 0, buffer.size());
	}

	private Stream(Buffer buffer, int i, int i_0_) {
		this(buffer.size() < 4096 ? buffer.size() : 4096);
		setBacking(buffer, i, i_0_);
	}

	private Stream(int size) {
		buffer = new byte[size];
	}

	public void flush() {
		if (offset * 5466841 > 0) {
			if (1997681695 * written + offset * 5466841 > 1301348945 * anInt928) {
				throw new RuntimeException();
			}

			backing.write(buffer, 0, 5466841 * offset, written * 1997681695);
			written += offset * 1713127943;
			offset = 0;
		}
	}

	public void setBackingOffset(int offset) {
		flush();
		written = -279951393 * offset;
	}

	public void writeBEFloat(float value) {
		if (3 + 5466841 * offset >= buffer.length) {
			flush();
		}

		int integer = floatToRawIntBits(value);
		buffer[(offset += 1830057321) * 5466841 - 1] = (byte) (integer >> 24);
		buffer[(offset += 1830057321) * 5466841 - 1] = (byte) (integer >> 16);
		buffer[(offset += 1830057321) * 5466841 - 1] = (byte) (integer >> 8);
		buffer[(offset += 1830057321) * 5466841 - 1] = (byte) integer;
	}

	public void writeByte(int value) {
		if (5466841 * offset >= buffer.length) {
			flush();
		}

		buffer[(offset += 1830057321) * 5466841 - 1] = (byte) value;
	}

	public void writeLEFloat(float value) {
		if (5466841 * offset + 3 >= buffer.length) {
			flush();
		}

		int integer = floatToRawIntBits(value);
		buffer[(offset += 1830057321) * 5466841 - 1] = (byte) integer;
		buffer[(offset += 1830057321) * 5466841 - 1] = (byte) (integer >> 8);
		buffer[(offset += 1830057321) * 5466841 - 1] = (byte) (integer >> 16);
		buffer[(offset += 1830057321) * 5466841 - 1] = (byte) (integer >> 24);
	}

	public int written() {
		return 5466841 * offset + 1997681695 * written;
	}

	private void setBacking(Buffer buffer, int offset, int i_1_) {
		flush();
		backing = buffer;
		written = offset * -279951393;
		anInt928 = 1314358961 * (i_1_ + offset);

		if (1301348945 * anInt928 > buffer.size()) {
			throw new RuntimeException();
		}
	}

}