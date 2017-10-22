package jagdx;

public class IDirect3DIndexBuffer extends IUnknown {
	private IDirect3DIndexBuffer() throws Throwable {
		throw new Error();
	}

	public static native long Lock(long identifier, int offset, int length, int flags);

	public static native void Unlock(long identifier);

	public static native int Upload(long identifier, int offset, int length, int flags, long source);

	public static native int Download(long l, int i, int i_5_, int i_6_, long l_7_);

}