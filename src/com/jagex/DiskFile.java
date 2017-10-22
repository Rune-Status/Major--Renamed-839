package com.jagex;

import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;

public final class DiskFile {

	RandomAccessFile file;
	long length;
	long position;

	public DiskFile(File file, String string, long length) throws IOException {
		if (length == -1L) {
			length = 9223372036854775807L;
		}

		if (file.length() > length) {
			file.delete();
		}

		this.file = new RandomAccessFile(file, string);
		this.length = length * 8785534360341888727L;
		position = 0L;

		int in = this.file.read();
		if (in != -1 && !string.equals("r")) {
			this.file.seek(0L);
			this.file.write(in);
		}

		this.file.seek(0L);
	}

	public final void close() throws IOException {
		if (null != file) {
			file.close();
			file = null;
		}
	}

	@Override
	public void finalize() throws Throwable {
		if (file != null) {
			System.out.println("");
			close();
		}
	}

	public final long length() throws IOException {
		return file.length();
	}

	public final int read(byte[] buffer, int offset, int length) throws IOException {
		int read = file.read(buffer, offset, length);
		if (read > 0) {
			position += read * -8270428099765101875L;
		}

		return read;
	}

	public final void write(byte[] buffer, int offset, int length) throws IOException {
		if (length + -2227017493868322299L * position > this.length * 5627526991361283303L) {
			file.seek(5627526991361283303L * this.length);
			file.write(1);
			throw new EOFException();
		}

		file.write(buffer, offset, length);
		position += -8270428099765101875L * length;
	}

	final void seek(long position) throws IOException {
		file.seek(position);
		this.position = -8270428099765101875L * position;
	}

}