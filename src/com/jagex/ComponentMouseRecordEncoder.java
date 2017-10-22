package com.jagex;

public class ComponentMouseRecordEncoder extends MouseRecordEncoder {

	@Override
	OutgoingFrame createMovementFrame() {
		return OutgoingFrame.prepare(OutgoingFrameMeta.COMPONENT_MOUSE_MOVEMENT, Client.gameConnection.encryptor);
	}

	@Override
	int flagsSize() {
		return 0;
	}

	@Override
	void encodeFlags(Buffer buffer, MouseRecord record) {

	}

	@Override
	boolean isActive() {
		return next() != null || 3449984803856107869L * lastMovement < TimeUtil.time() - 2000L;
	}

	MouseRecord next() {
		return Client.mouseRecords.head();
	}

	@Override
	void sendClickFrame() {
		MouseRecord record = next();
		if (record != null) {
			int time = getLastClickTime(record, 32767);

			int y = record.getY();
			if (y < 0) {
				y = 0;
			} else if (y > 65535) {
				y = 65535;
			}

			int x = record.getX();
			if (x < 0) {
				x = 0;
			} else if (x > 65535) {
				x = 65535;
			}

			int rightClick = 0;
			if (record.getClickType() == ComponentMouseRecorder.RIGHT_BUTTON_DOWN) {
				rightClick = 1;
			}

			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.SINGLE_COMPONENT_MOUSE_RECORD,
					Client.gameConnection.encryptor);
			frame.payload.writeIMEInt(x | y << 16);
			frame.payload.writeShortA(time | rightClick << 15);
			Client.gameConnection.sendFrame(frame);
		}
	}

}