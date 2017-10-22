package jaclib.memory;

public interface Buffer {

	int size();

	long getAddress();

	void write(byte[] buffer, int offset, int length, int destOffset);

}