package com.jagex;

import java.util.Iterator;

public abstract class MouseRecordEncoder {

	long lastClick;
	long lastMovement;
	int lastX;
	int lastY;
	Deque<MouseRecord> records = new Deque<MouseRecord>();

	MouseRecordEncoder() {
		lastClick = 2595808658969441173L;
		lastMovement = -8737479662535430901L;
		lastX = -694505037;
		lastY = -1905387951;
	}

	abstract OutgoingFrame createMovementFrame();

	abstract int flagsSize();

	abstract void encodeFlags(Buffer buffer, MouseRecord record);

	void enqueue(MouseRecord record) {
		records.pushBack(record);
	}

	int getLastClickTime(MouseRecord record, int maximum) {
		long time;

		if (lastClick * 91148990268440643L == -1L) {
			time = maximum;
		} else {
			time = record.getTime() - 91148990268440643L * lastClick;
			if (time > maximum) {
				time = maximum;
			}
		}

		lastClick = record.getTime() * -2595808658969441173L;
		return (int) time;
	}

	abstract boolean isActive();

	void pulse() {
		if (isActive()) {
			OutgoingFrame frame = null;
			int size = 0;
			int total = 0;
			int count = 0;

			Iterator<MouseRecord> iterator = records.iterator();
			while (iterator.hasNext()) {
				MouseRecord record = iterator.next();
				if (frame != null && frame.payload.offset * -165875887 - size >= 252 - (6 + flagsSize())) {
					break;
				}

				record.unlink();
				int y = record.getY();
				if (y < -1) {
					y = -1;
				} else if (y > 65534) {
					y = 65534;
				}

				int x = record.getX();
				if (x < -1) {
					x = -1;
				} else if (x > 65534) {
					x = 65534;
				}

				if (x == 1280612997 * lastX && 1280642383 * lastY == y) {
					record.cache();
				} else {
					if (null == frame) {
						frame = createMovementFrame();
						frame.payload.writeByte(0);
						size = frame.payload.offset * -165875887;
						frame.payload.offset += -1778683038;
						total = 0;
						count = 0;
					}

					int dx;
					int dy;
					int dt;

					if (-1L != 3449984803856107869L * lastMovement) {
						dx = x - 1280612997 * lastX;
						dy = y - 1280642383 * lastY;
						dt = (int) ((record.getTime() - 3449984803856107869L * lastMovement) / 20L);
						total += (record.getTime() - 3449984803856107869L * lastMovement) % 20L;
					} else {
						dx = x;
						dy = y;
						dt = 2147483647;
					}

					lastX = x * 694505037;
					lastY = y * 1905387951;

					if (dt < 8 && dx >= -32 && dx <= 31 && dy >= -32 && dy <= 31) {
						dx += 32;
						dy += 32;

						frame.payload.writeShort(dy + (dx << 6) + (dt << 12));
					} else if (dt < 32 && dx >= -128 && dx <= 127 && dy >= -128 && dy <= 127) {
						dx += 128;
						dy += 128;

						frame.payload.writeByte(dt + 128);
						frame.payload.writeShort(dy + (dx << 8));
					} else if (dt < 32) {
						frame.payload.writeByte(192 + dt);

						if (-1 == x || -1 == y) {
							frame.payload.writeInt(-2147483648);
						} else {
							frame.payload.writeInt(x | y << 16);
						}
					} else {
						frame.payload.writeShort((dt & 0x1fff) + 57344);
						if (-1 == x || -1 == y) {
							frame.payload.writeInt(-2147483648);
						} else {
							frame.payload.writeInt(x | y << 16);
						}
					}

					count++;
					encodeFlags(frame.payload, record);
					lastMovement = record.getTime() * 8737479662535430901L;
					record.cache();
				}
			}

			if (frame != null) {
				frame.payload.writeSizeByte(frame.payload.offset * -165875887 - size);
				int start = -165875887 * frame.payload.offset;
				frame.payload.offset = size * 1258142129;
				frame.payload.writeByte(total / count);
				frame.payload.writeByte(total % count);
				frame.payload.offset = 1258142129 * start;
				Client.gameConnection.sendFrame(frame);
			}
		}

		sendClickFrame();
	}

	void reset() {
		records.clear();
		lastClick = 2595808658969441173L;
		lastMovement = -8737479662535430901L;
		lastX = -694505037;
		lastY = -1905387951;
	}

	abstract void sendClickFrame();

}