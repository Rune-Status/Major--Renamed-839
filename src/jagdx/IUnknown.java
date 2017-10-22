package jagdx;

public class IUnknown {
	IUnknown() throws Throwable {
		throw new Error();
	}

	public static native int AddRef(long l);

	public static native int Release(long identifier);
}
