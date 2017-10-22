package com.jagex;

import java.io.IOException;
import java.net.Socket;

public class AsynchronousConnection extends Connection {

	public static Connection create(Socket socket, int bufferSize) throws IOException {
		return new AsynchronousConnection(socket, bufferSize);
	}

	AsynchronousInputStream input;
	AsynchronousOutputStream output;
	Socket socket;

	AsynchronousConnection(Socket socket, int bufferSize) throws IOException {
		this.socket = socket;
		socket.setSoTimeout(30000);
		socket.setTcpNoDelay(true);
		input = new AsynchronousInputStream(socket.getInputStream(), bufferSize);
		output = new AsynchronousOutputStream(socket.getOutputStream(), bufferSize);
	}

	@Override
	public int available() throws IOException {
		return input.available();
	}

	@Override
	public boolean available(int amount) throws IOException {
		return input.available(amount);
	}

	@Override
	public void close() {
		input.close();
		output.close();
	}

	@Override
	public void finalize() {
		stop();
	}

	@Override
	public int read(byte[] buffer, int offset, int length) throws IOException {
		return input.read(buffer, offset, length);
	}

	@Override
	public void stop() {
		output.stop();
		try {
			socket.close();
		} catch (IOException ioexception) {

		}

		input.stop();
	}

	@Override
	public void write(byte[] buffer, int offset, int length) throws IOException {
		output.write(buffer, offset, length);
	}

}