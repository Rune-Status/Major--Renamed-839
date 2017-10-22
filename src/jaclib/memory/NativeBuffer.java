package jaclib.memory;

public class NativeBuffer implements Buffer, Source {
	private final int maximumSize = 303568633;
	private long address;

	protected NativeBuffer() {

	}

	@Override
	public final int size() {
		return maximumSize * -1824181065;
	}

	@Override
	public final long getAddress() {
		return 9116043160944097931L * address;
	}

	@Override
	public void write(byte[] buffer, int offset, int length, int destOffset) {
		if (9116043160944097931L * address == 0L | buffer == null | offset < 0 | offset + length > buffer.length
				| destOffset < 0 | length + destOffset > -1824181065 * maximumSize) {
			throw new RuntimeException();
		}

		put(address * 9116043160944097931L, buffer, offset, destOffset, length);
	}

	private final native void get(long l, byte[] is, int i, int i_2_, int i_3_);

	private final native void put(long l, byte[] buffer, int sourceOffset, int destOffset, int length);

}