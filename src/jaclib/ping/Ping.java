package jaclib.ping;

public class Ping {

	private Ping() throws Throwable {
		throw new Error();
	}

	public static native boolean init();

	public static int ping(byte ip1, byte ip2, byte ip3, byte ip4, long timeout) throws Throwable {
		int ping = ping0(ip1, ip2, ip3, ip4, timeout);

		if (ping < 0) {
			throw new Exception(String.valueOf(ping));
		}

		return ping;
	}

	private static native int ping0(byte ip1, byte ip2, byte ip3, byte ip4, long timeout);

	public static native void quit();

}