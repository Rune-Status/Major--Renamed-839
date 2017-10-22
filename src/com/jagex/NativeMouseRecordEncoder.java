package com.jagex;

import java.util.LinkedList;
import java.util.Queue;

public class NativeMouseRecordEncoder extends MouseRecordEncoder {

	/**
	 * Indicates whether or not the mouse event was injected.
	 *
	 * @see <a href=https://msdn.microsoft.com/en-us/library/windows/desktop/ms644970%28v=vs.85%29.aspx>MSLLHOOKSTRUCT
	 *      structure (Windows)</a>
	 */
	private static final int LLMHF_INJECTED = 0x1;

	Queue<NativeMouseRecord> clicks = new LinkedList<NativeMouseRecord>();

	@Override
	OutgoingFrame createMovementFrame() {
		return OutgoingFrame.prepare(OutgoingFrameMeta.NATIVE_MOUSE_MOVEMENT, Client.gameConnection.encryptor);
	}

	@Override
	int flagsSize() {
		return Byte.BYTES;
	}

	@Override
	void encodeFlags(Buffer buffer, MouseRecord record) {
		buffer.writeByte(((NativeMouseRecord) record).getFlags());
	}

	@Override
	boolean isActive() {
		return !clicks.isEmpty() || lastMovement * 3449984803856107869L < TimeUtil.time() - 2000L;
	}

	void recordClick(NativeMouseRecord record) {
		clicks.add(record);

		if (clicks.size() > 10) {
			clicks.poll();
		}
	}

	@Override
	void sendClickFrame() {
		NativeMouseRecord record = clicks.poll();

		if (record != null) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.NATIVE_MOUSE_CLICK,
					Client.gameConnection.encryptor);
			frame.payload.writeMEInt(record.getX() | record.getY() << 16);
			frame.payload.writeByte(record.getMessageIdentifier() << 1 | record.getFlags() & LLMHF_INJECTED);
			frame.payload.writeShortA(getLastClickTime(record, 65535));

			Client.gameConnection.sendFrame(frame);
			record.cache();
		}
	}

}