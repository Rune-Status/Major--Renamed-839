package jaggl;

import jaclib.memory.NativeBuffer;

public class MapBuffer extends NativeBuffer {

	private int dummy;

	@Override
	public void write(byte[] buffer, int offset, int length, int destOffset) {
		if (dummy * 1308205291 == 0) {
			throw new RuntimeException();
		}

		super.write(buffer, offset, length, destOffset);
	}

}