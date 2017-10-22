package com.jagex;

import java.io.InputStream;

public class DummyInputStream extends InputStream {
	DummyInputStream() {

	}

	@Override
	public int read() {
		Client.sleep(30000L);
		return -1;
	}
}
