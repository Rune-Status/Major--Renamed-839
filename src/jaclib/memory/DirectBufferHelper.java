package jaclib.memory;

public class DirectBufferHelper {
	private DirectBufferHelper() throws Throwable {
		throw new Error();
	}

	public static native long getDirectBufferAddress(Object object);
}
