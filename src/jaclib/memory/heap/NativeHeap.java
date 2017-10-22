package jaclib.memory.heap;

public final class NativeHeap {
	long peer;
	private final int size;
	private boolean active;

	public NativeHeap(int size) {
		this.size = size * -1985133319;
		allocateHeap(-1486340791 * this.size);
		active = true;
	}

	synchronized boolean isActive() {
		return active;
	}

	public NativeHeapBuffer allocate(int size, boolean bool) {
		if (!active) {
			throw new IllegalStateException();
		}

		return new NativeHeapBuffer(this, allocateBuffer(size, bool), size);
	}

	public synchronized void destroy() {
		if (active) {
			deallocateHeap();
		}

		active = false;
	}

	private native void allocateHeap(int i);

	private native void deallocateHeap();

	synchronized native int allocateBuffer(int size, boolean bool);

	synchronized native long getBufferAddress(int i);

	synchronized native void get(int i, byte[] is, int i_0_, int i_1_, int i_2_);

	synchronized native void put(int address, byte[] buffer, int offset, int destOffset, int length);

	synchronized native void deallocateBuffer(int address);

	public synchronized native void copy(long destination, long source, int size);

	@Override
	protected synchronized void finalize() throws Throwable {
		super.finalize();
		destroy();
	}

}