package com.jagex;

import java.io.EOFException;
import java.io.IOException;

public class BufferedFile {
	static final int anInt8255 = 200000000;

	public static int crc32(byte[] buffer, int length) {
		return Class581.crc32(buffer, 0, length);
	}

	long aLong8248;
	DiskFile file;
	long aLong8250;
	long aLong8251 = -507144109590199105L;
	int anInt8252;
	byte[] aByteArray8253;
	byte[] aByteArray8254;
	long aLong8256;
	int anInt8257;
	long aLong8258;
	long aLong8259;

	public BufferedFile(DiskFile file, int i, int i_20_) throws IOException {
		aLong8248 = 7310773310351069651L;
		anInt8257 = 0;
		this.file = file;
		aLong8250 = (aLong8258 = file.length() * 8719473474000933619L) * -1162653971124809755L;
		aByteArray8254 = new byte[i];
		aByteArray8253 = new byte[i_20_];
		aLong8256 = 0L;
	}

	public long method13554(int i) {
		return aLong8250 * -6739762878586131553L;
	}

	public void read(byte[] buffer) throws IOException {
		read(buffer, 0, buffer.length);
	}

	public void read(byte[] is, int i, int i_4_) throws IOException {
		try {
			if (i + i_4_ > is.length) {
				throw new ArrayIndexOutOfBoundsException(i + i_4_ - is.length);
			}
			if (-1L != 4313602585495884197L * aLong8248
					&& -3364096132636757765L * aLong8256 >= 4313602585495884197L * aLong8248
					&& aLong8256 * -3364096132636757765L + i_4_ <= -910346097 * anInt8257 + 4313602585495884197L
							* aLong8248) {
				System.arraycopy(aByteArray8253,
						(int) (aLong8256 * -3364096132636757765L - 4313602585495884197L * aLong8248), is, i, i_4_);
				aLong8256 += i_4_ * -5264587409325893069L;
				return;
			}
			long l = -3364096132636757765L * aLong8256;
			int i_6_ = i;
			int i_7_ = i_4_;
			if (aLong8256 * -3364096132636757765L >= 7052137124192343233L * aLong8251
					&& -3364096132636757765L * aLong8256 < anInt8252 * 1548084007 + 7052137124192343233L * aLong8251) {
				int i_8_ = (int) (anInt8252 * 1548084007 - (-3364096132636757765L * aLong8256 - aLong8251 * 7052137124192343233L));
				if (i_8_ > i_4_) {
					i_8_ = i_4_;
				}
				System.arraycopy(aByteArray8254,
						(int) (aLong8256 * -3364096132636757765L - 7052137124192343233L * aLong8251), is, i, i_8_);
				aLong8256 += -5264587409325893069L * i_8_;
				i += i_8_;
				i_4_ -= i_8_;
			}
			if (i_4_ > aByteArray8254.length) {
				file.seek(-3364096132636757765L * aLong8256);
				aLong8259 = aLong8256 * -4503586463789261139L;
				int i_9_;
				for (; i_4_ > 0; i_4_ -= i_9_) {
					i_9_ = file.read(is, i, i_4_);
					if (i_9_ == -1) {
						break;
					}
					aLong8259 += i_9_ * 3318945929613749879L;
					aLong8256 += -5264587409325893069L * i_9_;
					i += i_9_;
				}
			} else if (i_4_ > 0) {
				method13553(-1877761288);
				int i_10_ = i_4_;
				if (i_10_ > 1548084007 * anInt8252) {
					i_10_ = 1548084007 * anInt8252;
				}
				System.arraycopy(aByteArray8254, 0, is, i, i_10_);
				i += i_10_;
				i_4_ -= i_10_;
				aLong8256 += i_10_ * -5264587409325893069L;
			}
			if (-1L != aLong8248 * 4313602585495884197L) {
				if (4313602585495884197L * aLong8248 > -3364096132636757765L * aLong8256 && i_4_ > 0) {
					int i_11_ = i + (int) (aLong8248 * 4313602585495884197L - -3364096132636757765L * aLong8256);
					if (i_11_ > i_4_ + i) {
						i_11_ = i_4_ + i;
					}
					while (i < i_11_) {
						is[i++] = (byte) 0;
						i_4_--;
						aLong8256 += -5264587409325893069L;
					}
				}
				long l_12_ = -1L;
				long l_13_ = -1L;
				if (aLong8248 * 4313602585495884197L >= l && aLong8248 * 4313602585495884197L < l + i_7_) {
					l_12_ = aLong8248 * 4313602585495884197L;
				} else if (l >= 4313602585495884197L * aLong8248
						&& l < 4313602585495884197L * aLong8248 + anInt8257 * -910346097) {
					l_12_ = l;
				}
				if (anInt8257 * -910346097 + aLong8248 * 4313602585495884197L > l
						&& anInt8257 * -910346097 + aLong8248 * 4313602585495884197L <= l + i_7_) {
					l_13_ = 4313602585495884197L * aLong8248 + -910346097 * anInt8257;
				} else if (l + i_7_ > aLong8248 * 4313602585495884197L
						&& l + i_7_ <= -910346097 * anInt8257 + aLong8248 * 4313602585495884197L) {
					l_13_ = i_7_ + l;
				}
				if (l_12_ > -1L && l_13_ > l_12_) {
					int i_14_ = (int) (l_13_ - l_12_);
					System.arraycopy(aByteArray8253, (int) (l_12_ - aLong8248 * 4313602585495884197L), is,
							(int) (l_12_ - l) + i_6_, i_14_);
					if (l_13_ > aLong8256 * -3364096132636757765L) {
						i_4_ -= l_13_ - -3364096132636757765L * aLong8256;
						aLong8256 = l_13_ * -5264587409325893069L;
					}
				}
			}
		} catch (IOException ioexception) {
			aLong8259 = -3318945929613749879L;
			throw ioexception;
		}
		if (i_4_ > 0) {
			throw new EOFException();
		}
	}

	public void write(byte[] is, int i, int i_15_) throws IOException {
		do {
			try {
				if (i_15_ + aLong8256 * -3364096132636757765L > aLong8250 * -6739762878586131553L) {
					aLong8250 = -6092298883991605153L * (aLong8256 * -3364096132636757765L + i_15_);
				}
				if (-1L != aLong8248 * 4313602585495884197L
						&& (aLong8256 * -3364096132636757765L < aLong8248 * 4313602585495884197L || -3364096132636757765L
								* aLong8256 > anInt8257 * -910346097 + aLong8248 * 4313602585495884197L)) {
					method13551();
				}
				if (aLong8248 * 4313602585495884197L != -1L
						&& aLong8256 * -3364096132636757765L + i_15_ > aByteArray8253.length + 4313602585495884197L
								* aLong8248) {
					int i_17_ = (int) (aByteArray8253.length - (aLong8256 * -3364096132636757765L - aLong8248 * 4313602585495884197L));
					System.arraycopy(is, i, aByteArray8253,
							(int) (-3364096132636757765L * aLong8256 - 4313602585495884197L * aLong8248), i_17_);
					aLong8256 += -5264587409325893069L * i_17_;
					i += i_17_;
					i_15_ -= i_17_;
					anInt8257 = aByteArray8253.length * -2120423825;
					method13551();
				}
				if (i_15_ > aByteArray8253.length) {
					if (-3364096132636757765L * aLong8256 != aLong8259 * 7161968085044366151L) {
						file.seek(-3364096132636757765L * aLong8256);
						aLong8259 = aLong8256 * -4503586463789261139L;
					}
					file.write(is, i, i_15_);
					aLong8259 += 3318945929613749879L * i_15_;
					if (7161968085044366151L * aLong8259 > 8642937537261737531L * aLong8258) {
						aLong8258 = -9183748399039090075L * aLong8259;
					}
					long l = -1L;
					long l_18_ = -1L;
					if (aLong8256 * -3364096132636757765L >= 7052137124192343233L * aLong8251
							&& -3364096132636757765L * aLong8256 < aLong8251 * 7052137124192343233L + 1548084007
									* anInt8252) {
						l = aLong8256 * -3364096132636757765L;
					} else if (7052137124192343233L * aLong8251 >= -3364096132636757765L * aLong8256
							&& aLong8251 * 7052137124192343233L < i_15_ + aLong8256 * -3364096132636757765L) {
						l = aLong8251 * 7052137124192343233L;
					}
					if (i_15_ + -3364096132636757765L * aLong8256 > aLong8251 * 7052137124192343233L
							&& i_15_ + aLong8256 * -3364096132636757765L <= anInt8252 * 1548084007
									+ 7052137124192343233L * aLong8251) {
						l_18_ = aLong8256 * -3364096132636757765L + i_15_;
					} else if (anInt8252 * 1548084007 + aLong8251 * 7052137124192343233L > aLong8256
							* -3364096132636757765L
							&& anInt8252 * 1548084007 + 7052137124192343233L * aLong8251 <= aLong8256
									* -3364096132636757765L + i_15_) {
						l_18_ = 7052137124192343233L * aLong8251 + 1548084007 * anInt8252;
					}
					if (l > -1L && l_18_ > l) {
						int i_19_ = (int) (l_18_ - l);
						System.arraycopy(is, (int) (i + l - aLong8256 * -3364096132636757765L), aByteArray8254,
								(int) (l - aLong8251 * 7052137124192343233L), i_19_);
					}
					aLong8256 += -5264587409325893069L * i_15_;
				} else {
					if (i_15_ <= 0) {
						break;
					}
					if (4313602585495884197L * aLong8248 == -1L) {
						aLong8248 = 5200775782706001439L * aLong8256;
					}
					System.arraycopy(is, i, aByteArray8253,
							(int) (-3364096132636757765L * aLong8256 - 4313602585495884197L * aLong8248), i_15_);
					aLong8256 += i_15_ * -5264587409325893069L;
					if (-3364096132636757765L * aLong8256 - 4313602585495884197L * aLong8248 > anInt8257 * -910346097) {
						anInt8257 = -2120423825
								* (int) (aLong8256 * -3364096132636757765L - 4313602585495884197L * aLong8248);
					}
				}
			} catch (IOException ioexception) {
				aLong8259 = -3318945929613749879L;
				throw ioexception;
			}
			break;
		} while (false);
	}

	public void close() throws IOException {
		method13551();
		file.close();
	}

	public void seek(long l) throws IOException {
		if (l < 0L) {
			throw new IOException();
		}
		aLong8256 = -5264587409325893069L * l;
	}

	void method13551() throws IOException {
		if (-1L != aLong8248 * 4313602585495884197L) {
			if (7161968085044366151L * aLong8259 != 4313602585495884197L * aLong8248) {
				file.seek(aLong8248 * 4313602585495884197L);
				aLong8259 = aLong8248 * -139537306531358285L;
			}
			file.write(aByteArray8253, 0, -910346097 * anInt8257);
			aLong8259 += anInt8257 * 8536850630289128569L;
			if (aLong8259 * 7161968085044366151L > 8642937537261737531L * aLong8258) {
				aLong8258 = -9183748399039090075L * aLong8259;
			}
			long l = -1L;
			long l_0_ = -1L;
			if (aLong8248 * 4313602585495884197L >= 7052137124192343233L * aLong8251
					&& aLong8248 * 4313602585495884197L < anInt8252 * 1548084007 + 7052137124192343233L * aLong8251) {
				l = aLong8248 * 4313602585495884197L;
			} else if (7052137124192343233L * aLong8251 >= aLong8248 * 4313602585495884197L
					&& aLong8251 * 7052137124192343233L < -910346097 * anInt8257 + 4313602585495884197L * aLong8248) {
				l = aLong8251 * 7052137124192343233L;
			}
			if (anInt8257 * -910346097 + aLong8248 * 4313602585495884197L > 7052137124192343233L * aLong8251
					&& 4313602585495884197L * aLong8248 + anInt8257 * -910346097 <= 7052137124192343233L * aLong8251
							+ 1548084007 * anInt8252) {
				l_0_ = 4313602585495884197L * aLong8248 + anInt8257 * -910346097;
			} else if (aLong8251 * 7052137124192343233L + anInt8252 * 1548084007 > aLong8248 * 4313602585495884197L
					&& anInt8252 * 1548084007 + 7052137124192343233L * aLong8251 <= 4313602585495884197L * aLong8248
							+ -910346097 * anInt8257) {
				l_0_ = 1548084007 * anInt8252 + aLong8251 * 7052137124192343233L;
			}
			if (l > -1L && l_0_ > l) {
				int i_1_ = (int) (l_0_ - l);
				System.arraycopy(aByteArray8253, (int) (l - 4313602585495884197L * aLong8248), aByteArray8254,
						(int) (l - 7052137124192343233L * aLong8251), i_1_);
			}
			aLong8248 = 7310773310351069651L;
			anInt8257 = 0;
		}
	}

	void method13553(int i) throws IOException {
		anInt8252 = 0;
		if (7161968085044366151L * aLong8259 != aLong8256 * -3364096132636757765L) {
			file.seek(aLong8256 * -3364096132636757765L);
			aLong8259 = -4503586463789261139L * aLong8256;
		}
		aLong8251 = -6414599379031963461L * aLong8256;
		int i_2_;
		for (; 1548084007 * anInt8252 < aByteArray8254.length; anInt8252 += i_2_ * 1691573399) {
			int i_3_ = aByteArray8254.length - 1548084007 * anInt8252;
			if (i_3_ > 200000000) {
				i_3_ = 200000000;
			}
			i_2_ = file.read(aByteArray8254, anInt8252 * 1548084007, i_3_);
			if (-1 == i_2_) {
				break;
			}
			aLong8259 += i_2_ * 3318945929613749879L;
		}
	}
}
