package com.jagex;

public class FrameBuffer extends Buffer {
//PacketStream
	static int[] BIT_MASKS = { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535,
			131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727,
			268435455, 536870911, 1073741823, 2147483647, -1 };

	int bitOffset;
	IsaacCipher cipher;

	public FrameBuffer(int size) {
		super(size);
	}

	public void disableBitAccess() {
		bitOffset = -265520648 * offset;
	}

	public void enableBitAccess() {
		offset = (885681519 * bitOffset + 7) / 8 * 1258142129;
	}

	public boolean nextIsSmart() {
		int i_5_ = payload[-165875887 * offset] - cipher.peek() & 0xff;
		return i_5_ >= 128;
	}

	public int readBits(int bits) {
		int index = 885681519 * bitOffset >> 3;
		int shift = 8 - (bitOffset * 885681519 & 0x7);
		int value = 0;
		bitOffset += -845180529 * bits;

		for (; bits > shift; shift = 8) {
			value += (payload[index++] & BIT_MASKS[shift]) << bits - shift;
			bits -= shift;
		}

		if (bits == shift) {
			value += payload[index] & BIT_MASKS[shift];
		} else {
			value += payload[index] >> shift - bits & BIT_MASKS[bits];
		}

		return value;
	}

	public void readEncrypted(byte[] buffer, int offset, int length) {
		for (int index = 0; index < length; index++) {
			buffer[offset + index] = (byte) (payload[(offset += 1258142129) * -165875887 - 1] - cipher.nextInt());
		}
	}

	public int readEncryptedSmart() {
		int i_6_ = payload[(offset += 1258142129) * -165875887 - 1] - cipher.nextInt() & 0xff;
		if (i_6_ < 128) {
			return i_6_;
		}

		return (i_6_ - 128 << 8) + (payload[(offset += 1258142129) * -165875887 - 1] - cipher.nextInt() & 0xff);
	}

	public int readOpcode() {
		return payload[(offset += 1258142129) * -165875887 - 1] - cipher.nextInt() & 0xff;
	}

	public int remainingBits(int totalBytes) {
		return 8 * totalBytes - bitOffset * 885681519;
	}

	public void setCipher(IsaacCipher cipher) {
		this.cipher = cipher;
	}

	public void writeOpcode(int opcode) {
		payload[(offset += 1258142129) * -165875887 - 1] = (byte) (opcode + cipher.nextInt());
	}

}