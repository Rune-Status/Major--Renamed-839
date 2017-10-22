package jagdx;

public class IDirect3DEventQuery extends IUnknown {
	private IDirect3DEventQuery() throws Throwable {
		throw new Error();
	}

	public static native int Issue(long l);

	public static native int IsSignaled(long l);
}
