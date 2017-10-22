package com.jagex;

import java.math.BigInteger;

public class ChecksumTable {
	public static final void method7085() {
		if (!Client.aBool10828) {
			Client.aFloat10711 += (-12.0F - Client.aFloat10711) / 2.0F;
			Client.aBool10611 = true;
			Client.aBool10828 = true;
		}
	}

	static final void method7083(ScriptExecutionContext script) {
		int i_12_ = script.anIntArray7942[(script.anInt7924 -= 1122685165) * 1841827045];
		BufferedConnectionContext connection = Client.getActiveConnection();
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3944, connection.encryptor);
		frame.payload.writeByte(0);
		int start = frame.payload.offset * -165875887;
		frame.payload.writeByte(i_12_);
		frame.payload.writeShort(script.aClass357_7946.id * -973678773);
		script.aClass357_7946.message.encode(frame.payload, script.aClass357_7946.anIntArray3818);
		frame.payload.writeSizeByte(frame.payload.offset * -165875887 - start);
		connection.sendFrame(frame);
	}

	ChecksumTableEntry[] entries;

	ChecksumTable(Buffer buffer, BigInteger exponent, BigInteger publicKey) {
		buffer.offset = 1995743349;
		int count = buffer.readUByte();
		buffer.offset += count * 1867122512;
		byte[] data = new byte[buffer.payload.length - buffer.offset * -165875887];
		buffer.readBytes(data, 0, data.length);
		byte[] expected;

		if (exponent == null || null == publicKey) {
			expected = data;
		} else {
			BigInteger decrypted = new BigInteger(data).modPow(exponent, publicKey);
			expected = decrypted.toByteArray();
		}

		if (expected.length != 65) {
			throw new RuntimeException();
		}

		byte[] hash = Class24.whirlpool(buffer.payload, 5, buffer.offset * -165875887 - data.length - 5);
		for (int index = 0; index < 64; index++) {
			if (hash[index] != expected[index + 1]) {
				throw new RuntimeException();
			}
		}

		entries = new ChecksumTableEntry[count];
		for (int index = 0; index < count; index++) {
			buffer.offset = index * 1867122512 + -1041081818;
			int checksum = buffer.readInt();
			int version = buffer.readInt();
			int i_9_ = buffer.readInt();
			int i_10_ = buffer.readInt();

			byte[] whirlpool = new byte[64];
			buffer.readBytes(whirlpool, 0, 64);
			entries[index] = new ChecksumTableEntry(checksum, i_9_, version, i_10_, whirlpool);
		}
	}

}