package com.jagex;

public class OutgoingFrame extends Linkable {

	static OutgoingFrame[] frameCache = new OutgoingFrame[300];
	static int frameCacheIndex = 0;

	public int size;
	int payloadSize;
	public FrameBuffer payload;
	OutgoingFrameMeta meta;

	public void cache() {
		if (-343545235 * frameCacheIndex < frameCache.length) {
			frameCache[(frameCacheIndex += -95244443) * -343545235 - 1] = this;
		}
	}

	public static OutgoingFrame empty() {
		OutgoingFrame frame = create();
		frame.meta = null;
		frame.payloadSize = 0;
		frame.payload = new FrameBuffer(5000);
		return frame;
	}

	public static OutgoingFrame prepare(OutgoingFrameMeta meta, IsaacCipher cipher) {
		OutgoingFrame frame = create();
		frame.meta = meta;
		frame.payloadSize = meta.size * 1580530077;
		if (frame.payloadSize * 1915278141 == -1) {
			frame.payload = new FrameBuffer(260);
		} else if (1915278141 * frame.payloadSize == -2) {
			frame.payload = new FrameBuffer(10000);
		} else if (1915278141 * frame.payloadSize <= 18) {
			frame.payload = new FrameBuffer(20);
		} else if (1915278141 * frame.payloadSize <= 98) {
			frame.payload = new FrameBuffer(100);
		} else {
			frame.payload = new FrameBuffer(260);
		}

		frame.payload.setCipher(cipher);
		frame.payload.writeOpcode(-701555801 * frame.meta.opcode);
		frame.size = 0;
		return frame;
	}

	static OutgoingFrame create() {
		if (frameCacheIndex * -343545235 == 0) {
			return new OutgoingFrame();
		}
		return frameCache[(frameCacheIndex -= -95244443) * -343545235];
	}

}