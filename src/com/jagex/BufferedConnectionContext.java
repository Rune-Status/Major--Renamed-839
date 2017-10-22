package com.jagex;

import java.io.IOException;

public class BufferedConnectionContext {
	public static Sprite aClass116_1212;
	public static Archive maps;
	public static int anInt1211;

	public IsaacCipher encryptor;
	public int buffered = 0;
	public boolean error;
	public int idleWritePulses;
	boolean aBool1198 = true;
	IncomingFrameMeta currentFrame;
	IncomingFrameMeta thirdLastFrame;
	IncomingFrameMeta lastFrame;
	IncomingFrameMeta secondLastFrame;
	FrameBuffer buffer = new FrameBuffer(15000);
	IsaacCipher decryptor;
	int currentFrameSize;
	int idleReadPulses;
	Connection connection;
	Deque frames = new Deque();
	LatencyMonitor monitor = new LatencyMonitor();
	Buffer outgoing = new Buffer(1700);
	int read;
	int readRate;
	int writeRate;
	int written;

	BufferedConnectionContext() {
		Thread thread = new Thread(monitor);
		thread.setDaemon(true);
		thread.setPriority(1);
		thread.start();
	}

	public final void flush() throws IOException {
		if (null != connection && buffered * 381339389 > 0) {
			outgoing.offset = 0;
			for (;;) {
				OutgoingFrame frame = (OutgoingFrame) frames.head();
				if (frame == null || frame.size * -1374729303 > outgoing.payload.length - -165875887 * outgoing.offset) {
					break;
				}

				outgoing.writeBytes(frame.payload.payload, 0, frame.size * -1374729303);
				buffered -= frame.size * 287577373;
				frame.unlink();
				frame.payload.cache();
				frame.cache();
			}

			connection.write(outgoing.payload, 0, -165875887 * outgoing.offset);
			written += outgoing.offset * 225952975;
			idleWritePulses = 0;
		}
	}

	public Connection getConnection() {
		return connection;
	}

	public final void sendFrame(OutgoingFrame frame) {
		frames.pushBack(frame);
		frame.size = frame.payload.offset * 1244139369;
		frame.payload.offset = 0;
		buffered += frame.size * 287577373;
	}

	final void dropFrames() {
		frames.clear();
		buffered = 0;
	}

	void init(Connection connection, String string) {
		this.connection = connection;
		monitor.setHost(string);
	}

	void recordStats() {
		if (0 == Client.tick % 50) {
			writeRate = 1195092927 * written;
			written = 0;
			readRate = read * -1548486831;
			read = 0;
		}
	}

	void stop() {
		connection = null;
		monitor.setHost(null);
	}

	void stopConnection() {
		if (null != connection) {
			connection.stop();
			connection = null;
		}

		monitor.setHost(null);
	}

}