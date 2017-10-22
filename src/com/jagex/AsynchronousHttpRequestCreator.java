package com.jagex;

import java.awt.Canvas;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.concurrent.Callable;

public class AsynchronousHttpRequestCreator implements Callable<AsynchronousStreamRequest> {
	static int anInt4613;

	public static int method6954() {
		Canvas canvas = new Canvas();
		canvas.setSize(100, 100);
		Toolkit toolkit = Toolkit.create(0, canvas, null, null, null, null, null, null, 0);
		long time = TimeUtil.time();

		for (int i = 0; i < 10000; i++) {
			toolkit.method2435(5, 10, 100.0F, 75, 50, 100.0F, 15, 90, 100.0F, -65536, -65536, -65536, 1);
		}

		int difference = (int) (TimeUtil.time() - time);
		toolkit.method2805(0, 0, 100, 100, -16777216);
		toolkit.method2373();
		return difference;
	}

	static boolean method6956(HeldKeyInputSubscriber subscriber) {
		return ScriptContext.method16107(subscriber, null);
	}

	AsynchronousRequest request;
	ParallelHttpProvider provider;
	URL url;

	AsynchronousHttpRequestCreator(ParallelHttpProvider provider, URL url, AsynchronousRequest request) {
		this.provider = provider;
		this.url = url;
		this.request = request;
	}

	@Override
	public AsynchronousStreamRequest call() throws Exception {
		URLConnection connection = url.openConnection();
		connection.setConnectTimeout(10000);
		connection.setReadTimeout(60000);
		boolean valid = true;

		try {
			connection.connect();
		} catch (IOException ioexception) {
			provider.startTime = TimeUtil.time() * 6860643485726859313L;
			valid = false;
		}

		return new AsynchronousStreamRequest(provider, valid ? connection.getInputStream() : null, request, url);
	}

}