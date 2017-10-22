package com.jagex;

import java.io.IOException;
import java.util.Iterator;

public class ConnectedResourceWorker extends PaddedResourceWorker<Connection> {

	Connection connection;

	@Override
	public void close() {
		if (connection != null) {
			connection.close();
		}
	}

	@Override
	public void init(Connection connection, boolean loggedIn) {
		if (this.connection != null) {
			try {
				this.connection.stop();
			} catch (Exception exception) {

			}
		}

		this.connection = connection;
		sendMagic();
		sendLoginState(loggedIn);
		header.offset = 0;
		meta.offset = 0;
		current = null;

		for (;;) {
			PaddedResourceRequest head = waitingPriorities.poll();
			if (null == head) {
				break;
			}

			head.buffer = null;
			priorities.offer(head);
		}

		for (;;) {
			PaddedResourceRequest head = waitingExtras.poll();
			if (head == null) {
				break;
			}

			head.buffer = null;
			extras.offer(head);
		}

		if (encryptionKey != 0) {
			try {
				outgoing.offset = 0;
				outgoing.writeByte(4);
				outgoing.writeByte(encryptionKey);
				outgoing.writeInt(0);

				this.connection.write(outgoing.payload, 0, outgoing.payload.length);
			} catch (IOException ioexception) {
				try {
					this.connection.stop();
				} catch (Exception exception) {

				}

				this.connection = null;
				errors += 422659035;
				status = 1419264290;
			}
		}

		latency = 0;
		lastAttempt = TimeUtil.time() * -5259201455896175543L;
	}

	@Override
	public boolean pulse() {
		if (connection != null) {
			long time = TimeUtil.time();
			int change = (int) (time - lastAttempt * 131395370529543673L);
			lastAttempt = -5259201455896175543L * time;

			if (change > 200) {
				change = 200;
			}

			latency += -1064472089 * change;
			if (-74247721 * latency > 30000) {
				try {
					connection.stop();
				} catch (Exception exception) {

				}

				connection = null;
			}
		}

		if (connection == null) {
			return priorities() == 0 && extras() == 0;
		}

		boolean complete;
		try {
			for (PaddedResourceRequest priority = priorities.getFront(); priority != null; priority = priorities.next()) {
				outgoing.offset = 0;
				outgoing.writeByte(1);
				outgoing.write40(priority.cachedKey * -4988283294723658683L);
				connection.write(outgoing.payload, 0, outgoing.payload.length);
				waitingPriorities.offer(priority);
			}

			for (PaddedResourceRequest passive = extras.getFront(); passive != null; passive = extras.next()) {
				outgoing.offset = 0;
				outgoing.writeByte(0);
				outgoing.write40(-4988283294723658683L * passive.cachedKey);
				connection.write(outgoing.payload, 0, outgoing.payload.length);
				waitingExtras.offer(passive);
			}

			for (int in = 0; in < 100; in++) {
				int available = connection.available();
				if (available < 0) {
					throw new IOException();
				} else if (available == 0) {
					break;
				}

				latency = 0;

				if (null == current) {
					int remaining = 5 - -165875887 * header.offset;
					if (remaining > available) {
						remaining = available;
					}

					connection.read(header.payload, -165875887 * header.offset, remaining);
					if (0 != encryptionKey) {
						for (int index = 0; index < remaining; index++) {
							header.payload[-165875887 * header.offset + index] ^= encryptionKey;
						}
					}

					header.offset += remaining * 1258142129;
					if (header.offset * -165875887 >= 5) {
						header.offset = 0;

						int type = header.readUByte();
						int attributes = header.readInt();
						boolean extra = (attributes & ~0x7fffffff) != 0;
						int file = attributes & 0x7fffffff;
						long key = ((long) type << 32) + file;

						if (extra) {
							Iterator<PaddedResourceRequest> iterator = waitingExtras.iterator();
							while (iterator.hasNext()) {
								PaddedResourceRequest next = iterator.next();
								if (-4988283294723658683L * next.cachedKey == key) {
									current = next;
									break;
								}
							}
						} else {
							Iterator<PaddedResourceRequest> iterator = waitingPriorities.iterator();
							while (iterator.hasNext()) {
								PaddedResourceRequest next = iterator.next();
								if (key == next.cachedKey * -4988283294723658683L) {
									current = next;
									break;
								}
							}
						}

						if (current == null) {
							throw new IOException();
						}

						currentBlock = -1736402867;
						header.offset = 0;
						meta.offset = 0;
					}
				} else {
					Buffer buffer = current.buffer;
					if (buffer == null) {
						int remaining = 5 - -165875887 * meta.offset;
						if (remaining > available) {
							remaining = available;
						}

						connection.read(meta.payload, meta.offset * -165875887, remaining);
						if (0 != encryptionKey) {
							for (int index = 0; index < remaining; index++) {
								meta.payload[index + -165875887 * meta.offset] ^= encryptionKey;
							}
						}

						meta.offset += remaining * 1258142129;
						if (meta.offset * -165875887 >= 5) {
							meta.offset = 0;
							int format = meta.readUByte();
							int size = meta.readInt();
							int headerSize = 5;

							if (format != CompressionType.UNCOMPRESSED.getId()) {
								headerSize = 9;
							}

							buffer = current.buffer = new Buffer(size + headerSize + current.padding);
							buffer.writeByte(format);
							buffer.writeInt(size);
							currentBlock += -1736402867;
						}
					} else {
						int remaining = buffer.payload.length - current.padding;
						int length = 512 - currentBlock * 1609949849;

						if (length > remaining - -165875887 * buffer.offset) {
							length = remaining - buffer.offset * -165875887;
						}

						if (length > available) {
							length = available;
						}

						connection.read(buffer.payload, -165875887 * buffer.offset, length);
						if (encryptionKey != 0) {
							for (int index = 0; index < length; index++) {
								buffer.payload[index + -165875887 * buffer.offset] ^= encryptionKey;
							}
						}

						buffer.offset += length * 1258142129;
						currentBlock += length * 1370706345;

						if (remaining == -165875887 * buffer.offset) {
							current.uncache();
							current.waiting = false;
							current = null;
						} else if (1609949849 * currentBlock == 512) {
							currentBlock = 0;
							current = null;
						}
					}
				}
			}
			complete = true;
		} catch (IOException ioexception) {
			try {
				connection.stop();
			} catch (Exception exception) {

			}

			connection = null;
			errors += 422659035;
			status = 1419264290;
			return priorities() == 0 && extras() == 0;
		}
		return complete;
	}

	@Override
	public void requestTermination() {
		if (null != connection) {
			try {
				outgoing.offset = 0;
				outgoing.writeByte(7);
				outgoing.write40(0L);
				connection.write(outgoing.payload, 0, outgoing.payload.length);
			} catch (IOException ioexception) {
				try {
					connection.stop();
				} catch (Exception exception) {

				}

				connection = null;
				errors += 422659035;
				status = 1419264290;
			}
		}
	}

	@Override
	void reset(int type, int file) {
		try {
			connection.stop();
		} catch (Exception exception) {

		}

		connection = null;
		errors += 422659035;
		status = -1437851503;
		encryptionKey = (byte) (int) (Math.random() * 255 + 1);
		errorType = type * 1462252655;
		errorFile = 1208528675 * file;
	}

	void sendMagic() {
		if (null != connection) {
			try {
				outgoing.offset = 0;
				outgoing.writeByte(6);
				outgoing.writeTriByte(3);
				outgoing.writeShort(0);

				connection.write(outgoing.payload, 0, outgoing.payload.length);
			} catch (IOException ioexception) {
				try {
					connection.stop();
				} catch (Exception exception) {

				}

				connection = null;
				errors += 422659035;
				status = 1419264290;
			}
		}
	}

	@Override
	public void sendLoginState(boolean loggedIn) {
		if (connection != null) {
			try {
				outgoing.offset = 0;
				outgoing.writeByte(loggedIn ? 2 : 3);
				outgoing.write40(0L);
				connection.write(outgoing.payload, 0, outgoing.payload.length);
			} catch (IOException ioexception) {
				try {
					connection.stop();
				} catch (Exception exception) {

				}

				connection = null;
				errors += 422659035;
				status = 1419264290;
			}
		}
	}

	@Override
	public void stop() {
		if (null != connection) {
			connection.stop();
		}
	}

}