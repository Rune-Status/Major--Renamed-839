package jagdx;

import java.awt.Component;

public class Direct3DPresentParameters {
	public static final int anInt938 = -2147483648;
	public int BackBufferWidth = 0;
	public int BackBufferHeight = 0;
	public int BackBufferFormat = 0;
	public int BackBufferCount = 0;
	public int MultiSampleType = 0;
	public int MultiSampleQuality = 0;
	public int SwapEffect = 1;
	public Component DeviceWindow;
	public boolean Windowed;
	public boolean EnableAutoDepthStencil;
	public int AutoDepthStencilFormat = 0;
	public int Flags;
	public int FullScreen_RefreshRateInHz;
	public int PresentationInterval = -2147483648;

	public Direct3DPresentParameters(Component component) {
		DeviceWindow = component;
	}

}