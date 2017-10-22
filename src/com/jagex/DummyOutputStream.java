package com.jagex;

import java.io.IOException;
import java.io.OutputStream;

public class DummyOutputStream extends OutputStream {
	static final void method16835(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = Client.publicChatMode * 2041602173;
	}

	DummyOutputStream() {

	}

	@Override
	public void write(int i) throws IOException {
		throw new IOException();
	}
}
