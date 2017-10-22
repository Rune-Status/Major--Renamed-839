package jaclib.ping;

public abstract class IcmpService implements Runnable {

	public static native boolean available();

	protected IcmpService() {

	}

	public native void e();

	public native void o();

	public native void quit();

	@Override
	public native void run();

	protected abstract void notify(int dummy);

	protected abstract void notify(int point, int type, int flags);

}