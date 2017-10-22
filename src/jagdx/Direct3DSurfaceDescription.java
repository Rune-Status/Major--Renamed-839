package jagdx;

public class Direct3DSurfaceDescription {
	public int Format;
	public int Type;
	public int Usage;
	public int Pool;
	public int MultiSampleType;
	public int MultiSampleQuality;
	public int Width;
	public int Height;

	private Direct3DSurfaceDescription() throws Throwable {
		throw new Error();
	}
}
