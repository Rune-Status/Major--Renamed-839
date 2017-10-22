package jagdx;

import java.awt.Component;

public class IDirect3D extends IUnknown {
	private IDirect3D() throws Throwable {
		throw new Error();
	}

	public static native long Direct3DCreate();

	public static native int GetAdapterCount(long l);

	public static native int GetAdapterIdentifier(long l, int i, int i_0_, Direct3DAdapterIdentifier d3dadapter_identifier);

	public static native int GetDeviceCaps(long l, int i, int i_1_, Direct3DCaps d3dcaps);

	public static native int GetAdapterDisplayMode(long l, int i, Direct3DDisplayMode d3ddisplaymode);

	public static native long CreateDeviceContext(long l, int i, int i_2_, Component component, int i_3_,
			Direct3DPresentParameters d3dpresent_parameters);

	public static native int CheckDeviceType(long l, int i, int i_4_, int i_5_, int i_6_, boolean bool);

	public static native int CheckDeviceFormat(long l, int i, int i_7_, int i_8_, int i_9_, int i_10_, int i_11_);

	public static native int CheckDepthStencilMatch(long l, int i, int i_12_, int i_13_, int i_14_, int i_15_);

	public static native int CheckDeviceMultiSampleType(long l, int i, int i_16_, int i_17_, boolean bool, int i_18_);
}
