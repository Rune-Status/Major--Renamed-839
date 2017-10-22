package com.jagex;

public class CacheResourceWorker implements Runnable {
	public static int anInt4892;

	public static boolean isAlphaNumeric(char c) {
		return c >= '0' && c <= '9' || c >= 'A' && c <= 'Z' || c >= 'a' && c <= 'z';
	}

	Thread thread;
	int remaining;
	Queue requests = new Queue();
	boolean stopped;

	public CacheResourceWorker() {
		remaining = 0;
		stopped = false;
		thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	public int remaining() {
		synchronized (requests) {
			return -704160219 * remaining;
		}
	}

	public void stop() {
		stopped = true;
		synchronized (requests) {
			requests.notifyAll();
		}
		try {
			thread.join();
		} catch (InterruptedException interruptedexception) {

		}
		thread = null;
	}

	@Override
	public void run() {
		while (!stopped) {
			CacheRequest request;
			synchronized (requests) {
				request = (CacheRequest) requests.poll();
				if (null != request) {
					remaining -= -2112909907;
				} else {
					try {
						requests.wait();
					} catch (InterruptedException interruptedexception) {

					}
					continue;
				}
			}
			try {
				if (request.type * 1010131273 == 2) {
					request.cache.write(request.data, (int) (-4988283294723658683L * request.cachedKey),
							request.data.length);
				} else if (1010131273 * request.type == 3) {
					request.data = request.cache.read((int) (-4988283294723658683L * request.cachedKey));
				}
			} catch (Exception exception) {
				HitsplatDefinitionProvider.reportError(null, exception);
			}
			request.waiting = false;
		}
	}

	CacheRequest requestWrite(ResourceCache cache, byte[] data, int file) {
		CacheRequest request = new CacheRequest();
		request.type = 262324722;
		request.cachedKey = file * -4152461709571586419L;
		request.data = data;
		request.cache = cache;
		request.highPriority = false;
		addRequest(request);
		return request;
	}

	CacheRequest priorityRead(ResourceCache cache, int file) {
		CacheRequest request = new CacheRequest();
		request.type = 131162361;
		synchronized (requests) {
			for (CacheRequest next = (CacheRequest) requests.getFront(); null != next; next = (CacheRequest) requests
					.next()) {
				if (file == -4988283294723658683L * next.cachedKey && next.cache == cache
						&& 1010131273 * next.type == 2) {
					request.data = next.data;
					request.waiting = false;
					return request;
				}
			}
		}

		request.data = cache.read(file);
		request.waiting = false;
		request.highPriority = true;
		return request;
	}

	CacheRequest requestRead(ResourceCache cache, int file) {
		CacheRequest request = new CacheRequest();
		request.type = 393487083;
		request.cachedKey = -4152461709571586419L * file;
		request.cache = cache;
		request.highPriority = false;
		addRequest(request);
		return request;
	}

	void addRequest(CacheRequest request) {
		synchronized (requests) {
			requests.offer(request);
			remaining += -2112909907;
			requests.notifyAll();
		}
	}

}