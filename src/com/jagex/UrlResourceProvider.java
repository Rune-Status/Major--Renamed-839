package com.jagex;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.URL;
import java.net.URLConnection;
import java.util.LinkedList;
import java.util.Queue;

public class UrlResourceProvider implements Runnable {

	Queue<UrlResourceRequest> requests = new LinkedList<UrlResourceRequest>();
	volatile boolean stopped;
	Thread thread = new Thread(this);

	UrlResourceProvider() {
		thread.setPriority(1);
		thread.start();
	}

	@Override
	public void run() {
		while (!stopped) {
			try {
				UrlResourceRequest request;
				synchronized (this) {
					request = requests.poll();
					if (request == null) {
						try {
							wait();
						} catch (InterruptedException interruptedexception) {

						}

						continue;
					}
				}

				try {
					URLConnection connection = request.url.openConnection();
					connection.setConnectTimeout(30000);
					int length = connection.getContentLength();

					if (length >= 0) {
						byte[] buffer = new byte[length];
						new DataInputStream(connection.getInputStream()).readFully(buffer);
						request.buffer = buffer;
					}

					request.complete = true;
				} catch (IOException ioexception) {
					request.complete = true;
				}
			} catch (Exception exception) {
				HitsplatDefinitionProvider.reportError(null, exception);
			}
		}
	}

	UrlResourceRequest submit(URL url) {
		UrlResourceRequest class72 = new UrlResourceRequest(url);
		synchronized (this) {
			requests.add(class72);
			notify();
		}

		return class72;
	}

	void stop() {
		stopped = true;
		try {
			synchronized (this) {
				notify();
			}

			thread.join();
		} catch (InterruptedException interruptedexception) {

		}
	}

}