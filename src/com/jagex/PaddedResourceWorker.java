package com.jagex;

public abstract class PaddedResourceWorker<C> {

	public static boolean aBool5033;

	static boolean method7318(int i) {
		return i == 8 || i == 11;
	}

	public volatile int errorFile = -1208528675;
	public volatile int errors;
	public volatile int errorType = -1462252655;
	public volatile int status;

	PaddedResourceRequest current;
	int currentBlock;
	byte encryptionKey;
	Queue<PaddedResourceRequest> extras = new Queue<PaddedResourceRequest>();
	Buffer header = new Buffer(5);
	long lastAttempt;
	int latency;
	Buffer meta = new Buffer(5);
	Buffer outgoing = new Buffer(6);
	Queue<PaddedResourceRequest> priorities = new Queue<PaddedResourceRequest>();
	Queue<PaddedResourceRequest> waitingExtras = new Queue<PaddedResourceRequest>();
	Queue<PaddedResourceRequest> waitingPriorities = new Queue<PaddedResourceRequest>();

	public abstract void close();

	public boolean extraUnavailable() {
		return extras() >= 20;
	}

	public abstract void init(C object, boolean loggedIn);

	public int priorities() {
		return priorities.size() + waitingPriorities.size();
	}

	public boolean priorityUnavailable() {
		return priorities() >= 100;
	}

	public abstract boolean pulse();

	public abstract void requestTermination();

	public abstract void sendLoginState(boolean loggedIn);

	public abstract void stop();

	int extras() {
		return extras.size() + waitingExtras.size();
	}

	PaddedResourceRequest request(int type, int file, byte padding, boolean priority) {
		long key = file | (long) type << 32;
		PaddedResourceRequest request = new PaddedResourceRequest();
		request.cachedKey = key * -4152461709571586419L;
		request.padding = padding;
		request.highPriority = priority;

		if (priority) {
			if (priorities() >= 100) {
				throw new RuntimeException();
			}

			priorities.offer(request);
		} else {
			if (extras() >= 20) {
				throw new RuntimeException();
			}

			extras.offer(request);
		}
		return request;
	}

	abstract void reset(int type, int file);

}