package com.jagex;

import jagdx.Direct3DAdapterIdentifier;
import jagdx.Direct3DCaps;
import jagdx.Direct3DDisplayMode;
import jagdx.D3DLIGHT;
import jagdx.Direct3DPresentParameters;
import jagdx.IDirect3D;
import jagdx.IDirect3DDevice;
import jagdx.IDirect3DEventQuery;
import jagdx.IDirect3DSurface;
import jagdx.IUnknown;

import java.awt.Canvas;

public class DirectXToolkit extends NativeToolkit {
	static final int anInt11082 = 3;
	static int[] anIntArray11089 = { 77, 80 };
	static int[] anIntArray11090 = { 22, 23 };

	public static Toolkit create(Canvas canvas, TextureMetricsList metricsList, Interface19 interface19,
			BillboardLoader billboardLoader, ParticleProducerDefinitionLoader particleLoader, Interface44 interface44,
			Archive shaders, int multisamples) {
		try {
			Client.loadJaclib();
			Client.getNativeProvider().load("jagdx");
			return method17418(canvas, metricsList, interface19, billboardLoader, particleLoader, interface44, shaders,
					multisamples);
		} catch (Throwable throwable) {
			throw new RuntimeException("");
		}
	}

	static final int method17402(Class333 class333) {
		switch (class333.anInt3600) {
			case 3:
				return 3;
			case 2:
				return 6;
			case 4:
				return 5;
			case 0:
				return 4;
			case 1:
				return 2;
			case 5:
				return 1;
			default:
				throw new IllegalArgumentException("");
		}
	}

	static final int method17414(Class121 class121, Class151 class151) {
		switch (class151.id * 451784863) {
			case 3:
				if (class121 == Class121.aClass121_1465) {
					return 113;
				}
				break;
			case 8:
				switch (class121.id * 1703450577) {
					case 1:
						return 77;
					case 0:
						return 51;
					case 5:
						return 28;
					default:
						break;
					case 6:
						return Class251.anInt2692 * 338669557;
					case 9:
						return Class251.anInt2691 * 1585629811;
					case 4:
						return 21;
					case 2:
						return 22;
					case 8:
						return 50;
				}
				break;
			case 6:
				if (class121 == Class121.aClass121_1465) {
					return 116;
				}
				break;
		}
		throw new IllegalArgumentException("");
	}

	static final int method17415(Class347 class347) {
		switch (class347.anInt3676) {
			default:
				throw new IllegalArgumentException();
			case 1:
				return 7;
			case 0:
				return 4;
			case 4:
				return 10;
			case 3:
				return 26;
			case 2:
				return 2;
		}
	}

	static final int method17416(Class344 class344) {
		switch (class344.anInt3653) {
			default:
				throw new IllegalArgumentException();
			case 3:
				return 1;
			case 1:
				return 0;
			case 2:
				return 3;
			case 0:
				return 2;
		}
	}

	static final int method17417(Class336 class336) {
		switch (class336.anInt3614) {
			case 1:
				return 1;
			case 0:
				return 4;
			case 4:
				return 2;
			case 5:
				return 3;
			default:
				return 0;
			case 3:
				return 256;
		}
	}

	static Toolkit method17418(Canvas canvas, TextureMetricsList metricsList, Interface19 interface19,
			BillboardLoader billboardLoader, ParticleProducerDefinitionLoader particleLoader, Interface44 interface44,
			Archive shaders, Integer integer) {
		DirectXToolkit toolkit = null;

		try {
			int i = 0;
			int i_51_ = 1;
			long l = IDirect3D.Direct3DCreate();
			Direct3DCaps caps = new Direct3DCaps();
			IDirect3D.GetDeviceCaps(l, i, i_51_, caps);
			if ((caps.RasterCaps & 0x1000000) == 0) {
				throw new RuntimeException("");
			}
			if (caps.MaxSimultaneousTextures < 2) {
				throw new RuntimeException("");
			}
			if ((caps.TextureOpCaps & 0x2) == 0) {
				throw new RuntimeException("");
			}
			if ((caps.TextureOpCaps & 0x8) == 0) {
				throw new RuntimeException("");
			}
			if ((caps.TextureOpCaps & 0x40) == 0) {
				throw new RuntimeException("");
			}
			if ((caps.TextureOpCaps & 0x200) == 0) {
				throw new RuntimeException("");
			}
			if ((caps.TextureOpCaps & 0x2000000) == 0) {
				throw new RuntimeException("");
			}
			if ((caps.SrcBlendCaps & caps.DestBlendCaps & 0x10) == 0) {
				throw new RuntimeException("");
			}
			if ((caps.SrcBlendCaps & caps.DestBlendCaps & 0x20) == 0) {
				throw new RuntimeException("");
			}
			if ((caps.SrcBlendCaps & caps.DestBlendCaps & 0x2) == 0) {
				throw new RuntimeException("");
			}
			if (caps.MaxActiveLights > 0 && caps.MaxActiveLights < 2) {
				throw new RuntimeException("");
			}
			if (caps.MaxStreams < 5) {
				throw new RuntimeException("");
			}

			Direct3DPresentParameters parameters = new Direct3DPresentParameters(canvas);
			parameters.Windowed = true;
			parameters.EnableAutoDepthStencil = true;
			parameters.BackBufferWidth = canvas.getWidth();
			parameters.BackBufferHeight = canvas.getHeight();
			parameters.BackBufferCount = 1;
			parameters.PresentationInterval = -2147483648;
			Direct3DDisplayMode mode = new Direct3DDisplayMode();

			if (!method17420(i, i_51_, l, integer.intValue(), mode, parameters)) {
				throw new RuntimeException("");
			}
			int i_52_ = 0;
			if ((caps.DevCaps & 0x100000) != 0) {
				i_52_ |= 0x10;
			}
			long l_53_ = 0L;
			try {
				l_53_ = IDirect3D.CreateDeviceContext(l, i, i_51_, canvas, i_52_ | 0x40, parameters);
			} catch (CreateDirectXDeviceContextException exception) {
				l_53_ = IDirect3D.CreateDeviceContext(l, i, i_51_, canvas, i_52_ & ~0x100000 | 0x20, parameters);
			}

			toolkit = new DirectXToolkit(i, i_51_, l, l_53_, mode, parameters, caps, metricsList, interface19,
					billboardLoader, particleLoader, interface44, shaders, integer.intValue());
			if (!toolkit.aHashtable1558.containsKey(canvas)) {
				CompressionType.ignoreRepaint(canvas);
				toolkit.method2433(canvas,
						new DirectXDelegatingDisplay(toolkit, canvas, canvas.getWidth(), canvas.getHeight(), true));
			}

			toolkit.method2620(canvas);
			toolkit.method14596();
			return toolkit;
		} catch (RuntimeException runtimeexception) {
			if (toolkit != null) {
				toolkit.method2374();
			}
			throw runtimeexception;
		}
	}

	static boolean method17420(int i, int i_60_, long l, int i_61_, Direct3DDisplayMode d3ddisplaymode,
			Direct3DPresentParameters d3dpresent_parameters) {
		int i_62_ = 0;
		int i_63_ = 0;
		int i_64_ = 0;
		boolean bool;
		try {
			if (Class327.method5798(IDirect3D.GetAdapterDisplayMode(l, i, d3ddisplaymode))) {
				return false;
			}
			while_3_: for (; i_61_ >= 0; i_61_--) {
				if (i_61_ != 1) {
					i_64_ = 0 + i_61_;
					for (int i_65_ = 0; i_65_ < anIntArray11090.length; i_65_++) {
						if (IDirect3D.CheckDeviceType(l, i, i_60_, d3ddisplaymode.format, anIntArray11090[i_65_], true) == 0
								&& IDirect3D.CheckDeviceFormat(l, i, i_60_, d3ddisplaymode.format, 1, 1,
										anIntArray11090[i_65_]) == 0
								&& (i_61_ == 0 || IDirect3D.CheckDeviceMultiSampleType(l, i, i_60_,
										anIntArray11090[i_65_], true, i_64_) == 0)) {
							for (int i_66_ = 0; i_66_ < anIntArray11089.length; i_66_++) {
								if (IDirect3D.CheckDeviceFormat(l, i, i_60_, d3ddisplaymode.format, 2, 1,
										anIntArray11089[i_66_]) == 0
										&& IDirect3D.CheckDepthStencilMatch(l, i, i_60_, d3ddisplaymode.format,
												anIntArray11090[i_65_], anIntArray11089[i_66_]) == 0
										&& (i_61_ == 0 || IDirect3D.CheckDeviceMultiSampleType(l, i, i_60_,
												anIntArray11089[i_65_], true, i_64_) == 0)) {
									i_63_ = anIntArray11090[i_65_];
									i_62_ = anIntArray11089[i_66_];
									break while_3_;
								}
							}
						}
					}
				}
			}
			if (i_61_ < 0 || i_63_ == 0 || i_62_ == 0) {
				return false;
			}
			d3dpresent_parameters.BackBufferFormat = i_63_;
			d3dpresent_parameters.AutoDepthStencilFormat = i_62_;
			d3dpresent_parameters.MultiSampleType = i_64_;
			d3dpresent_parameters.MultiSampleQuality = 0;
			bool = true;
		} catch (Throwable throwable) {
			return false;
		}
		return bool;
	}

	static final int method17451(Class151 class151) {
		if (class151 == Class151.aClass151_1849) {
			return 80;
		}
		if (class151 == Class151.aClass151_1854) {
			return 77;
		}
		throw new IllegalArgumentException("");
	}

	boolean aBool11051;
	boolean aBool11052;
	boolean aBool11053;
	boolean aBool11057;
	boolean aBool11066;
	boolean aBool11069;
	boolean aBool11070;
	boolean aBool11071;
	boolean aBool11072;
	boolean aBool11073;
	boolean aBool11074;
	boolean aBool11076;
	boolean[] aBoolArray11046;
	boolean[] aBoolArray11058;
	boolean[] aBoolArray11059;
	boolean[] aBoolArray11084;
	Class249_Sub1 aClass249_Sub1_11065;
	Class318[] aClass318Array11068;
	Matrix4f aClass399_11064;
	Deque aClass644_11077 = new Deque();
	Direct3DCaps aD3DCAPS11067;
	Direct3DDisplayMode aD3DDISPLAYMODE11080;
	Direct3DPresentParameters aD3DPRESENT_PARAMETERS11050;
	float[] aFloatArray11078;
	long aLong11048 = 0L;
	long aLong4029 = 0L;
	long aLong11054;
	long aLong11055;
	long aLong11056;
	long aLong11083;
	long aLong11087;
	long[] aLongArray11062;
	long[] aLongArray11081;

	long[] aLongArray11085;

	int anInt11047;

	int anInt11060;

	int anInt11061;

	int anInt11075;

	int anInt11079;

	int anInt11088;

	int[] anIntArray11063;

	int[] anIntArray11086;

	DirectXToolkit(int i, int i_0_, long l, long l_1_, Direct3DDisplayMode mode, Direct3DPresentParameters parameters,
			Direct3DCaps d3dcaps, TextureMetricsList metricsList, Interface19 interface19, BillboardLoader billboardLoader,
			ParticleProducerDefinitionLoader particleLoader, Interface44 interface44, Archive shaders, int i_2_) {
		super(metricsList, interface19, billboardLoader, particleLoader, interface44, shaders, i_2_, 0);
		aBool11053 = false;
		aLong11054 = 0L;
		aLong11055 = 0L;
		aLong11056 = 0L;
		aBool11057 = false;
		aFloatArray11078 = new float[16];
		anInt11079 = 128;
		anInt11088 = 0;
		aLongArray11081 = new long[anInt11079];
		aLong11083 = 0L;
		aLongArray11062 = new long[3];
		aLongArray11085 = new long[3];
		anIntArray11086 = new int[3];
		anInt11075 = 0;
		anInt11060 = 0;
		try {
			anInt11061 = i;
			anInt11047 = i_0_;
			aLong11048 = l;
			aLong4029 = l_1_;
			aD3DDISPLAYMODE11080 = mode;
			aD3DPRESENT_PARAMETERS11050 = parameters;
			aD3DCAPS11067 = d3dcaps;
			aLong11054 = D3DLIGHT.Create();
			aLong11055 = D3DLIGHT.Create();
			aLong11056 = D3DLIGHT.Create();
			anInt9406 = aD3DCAPS11067.MaxSimultaneousTextures;
			anInt9407 = aD3DCAPS11067.MaxActiveLights > 0 ? aD3DCAPS11067.MaxActiveLights : 8;
			aBool11051 = (aD3DCAPS11067.TextureCaps & 0x2) == 0;
			aBool9412 = (aD3DCAPS11067.TextureCaps & 0x800) != 0;
			threeDimensional = (aD3DCAPS11067.TextureCaps & 0x2000) != 0;
			aBool11071 = (aD3DCAPS11067.TextureCaps & 0x8000) != 0;
			aBool11076 = (aD3DCAPS11067.TextureCaps & 0x10000) != 0;
			aBool11069 = (aD3DCAPS11067.TextureCaps & 0x4000) != 0;
			aBool9408 = aD3DCAPS11067.NumSimultaneousRTs > 0;
			aBool9414 = aBool9408;
			aBool9409 = aD3DCAPS11067.NumSimultaneousRTs > 0;
			aBool9411 = anInt9400 > 0
					|| IDirect3D.CheckDeviceMultiSampleType(aLong11048, anInt11061, anInt11047,
							aD3DPRESENT_PARAMETERS11050.BackBufferFormat, true, 2) == 0;
			aBool9271 = aD3DCAPS11067.NumSimultaneousRTs > 0 && anInt9400 > 0
					|| IDirect3D.CheckDeviceMultiSampleType(aLong11048, anInt11061, anInt11047, 113, true, 2) == 0;
			aBool11072 = IDirect3D.CheckDeviceFormat(aLong11048, anInt11061, anInt11047,
					aD3DPRESENT_PARAMETERS11050.BackBufferFormat, 0, 1, method14824('A', 'T', 'O', 'C')) == 0;
			aBool11073 = IDirect3D.CheckDeviceFormat(aLong11048, anInt11061, anInt11047,
					aD3DPRESENT_PARAMETERS11050.BackBufferFormat, 0, 1, method14824('A', '2', 'M', '1')) == 0;
			aBool11074 = IDirect3D.CheckDeviceFormat(aLong11048, anInt11061, anInt11047,
					aD3DPRESENT_PARAMETERS11050.BackBufferFormat, 0, 1, method14824('S', 'S', 'A', 'A')) == 0;
			aBool9415 = (aD3DCAPS11067.PrimitiveMiscCaps & 0x20000) != 0;
			aBool11052 = IDirect3D.CheckDeviceFormat(aLong11048, anInt11061, anInt11047, aD3DDISPLAYMODE11080.format,
					524288, 3, 113) == 0;
			aBool11070 = IDirect3D.CheckDeviceFormat(aLong11048, anInt11061, anInt11047, aD3DDISPLAYMODE11080.format,
					524288, 3, 116) == 0;
			aBoolArray11058 = new boolean[anInt9406];
			aBoolArray11059 = new boolean[anInt9406];
			aBoolArray11084 = new boolean[anInt9406];
			aClass318Array11068 = new Class318[anInt9406];
			aBoolArray11046 = new boolean[anInt9406];
			anIntArray11063 = new int[anInt9406];
			Class405 class405 = new Class405();
			class405.method6740(1.0F, -1.0F, 0.5F);
			class405.method6744(0.0F, 0.0F, 0.5F);
			aClass399_11064 = new Matrix4f();
			aClass399_11064.method6548(class405);
			IDirect3DDevice.BeginScene(aLong4029);
		} catch (Throwable throwable) {
			throwable.printStackTrace();
			method2373();
			throw new RuntimeException("");
		}
	}

	@Override
	public void finalize() {
		super.finalize();
	}

	@Override
	public boolean method14585() {
		return (aD3DCAPS11067.VertexShaderVersion & 0xffff) >= 257;
	}

	@Override
	public boolean method14586() {
		return (aD3DCAPS11067.PixelShaderVersion & 0xffff) >= 257;
	}

	@Override
	public float method14608() {
		return -0.5F;
	}

	@Override
	public void method14620(int i, NativeArrayBuffer interface32) {
		DirectXArrayBuffer class377 = (DirectXArrayBuffer) interface32;
		IDirect3DDevice.SetStreamSource(aLong4029, i, class377.identifier, 0, class377.getStride());
	}

	@Override
	public void method14667() {
		if (aBoolArray11084[anInt9353]) {
			aBoolArray11084[anInt9353] = false;
			IDirect3DDevice.SetTexture(aLong4029, anInt9353, 0L);
			method14682();
			method14678();
		}
	}

	@Override
	public void method14697(Class323 class323) {
		Class323_Sub1 class323_sub1 = (Class323_Sub1) class323;
		IDirect3DDevice.SetVertexDeclaration(aLong4029, class323_sub1.identifier);
	}

	@Override
	public final void method14707(Class333 class333, int i, int i_54_) {
		if (aClass249_Sub1_11065 != null) {
			aClass249_Sub1_11065.method15104();
		}
		IDirect3DDevice.DrawPrimitive(aLong4029, method17402(class333), i, i_54_);
	}

	@Override
	public void method14735(Matrix4f class399) {
		class399.method6547(aClass399_11064);
	}

	@Override
	public final void method14773(Class333 class333, int i, int i_75_, int i_76_, int i_77_) {
		if (aClass249_Sub1_11065 != null) {
			aClass249_Sub1_11065.method15104();
		}
		IDirect3DDevice.DrawIndexedPrimitive(aLong4029, method17402(class333), 0, i, i_75_, i_76_, i_77_);
	}

	@Override
	public void method14789(Matrix4f class399, Matrix4f class399_13_, Matrix4f class399_14_) {
		IDirect3DDevice.SetTransform(aLong4029, 256, class399.array);
		IDirect3DDevice.SetTransform(aLong4029, 2, class399_13_.array);
		IDirect3DDevice.SetTransform(aLong4029, 3, class399_14_.array);
	}

	@Override
	public Program loadProgram(String string) {
		byte[] data = loadDirectXShader(string);
		if (data == null) {
			return null;
		}

		ProgramDefinition class239 = method14924(data);
		return new DirectXProgram(this, class239);
	}

	@Override
	public boolean method14964(boolean bool) {
		if (bool) {
			return aBool11052;
		}
		return aBool11052 && aBool11070;
	}

	@Override
	public void method2372() {
		long l = IDirect3DDevice.CreateEventQuery(aLong4029);
		if (Class327.method5799(IDirect3DEventQuery.Issue(l))) {
			for (;;) {
				int i = IDirect3DEventQuery.IsSignaled(l);
				if (i != 1) {
					break;
				}
				Thread.yield();
			}
		}
		IUnknown.Release(l);
	}

	@Override
	public final synchronized void method2375(int i) {
		for (int i_55_ = 0; i_55_ < anInt11088; i_55_++) {
			IUnknown.Release(aLongArray11081[i_55_]);
		}
		anInt11088 = 0;
		super.method2375(i);
	}

	@Override
	public String method2388() {
		String string = "Caps: 4:";
		String string_67_ = ":";
		string = new StringBuilder().append(string).append(anInt9400).append(string_67_).toString();
		string = new StringBuilder().append(string).append(anInt9406).append(string_67_).toString();
		string = new StringBuilder().append(string).append(anInt9407).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool9411 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(method14585() ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(method14586() ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(threeDimensional ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool9412 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool11051 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool11071 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool11076 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool11069 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool9408 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool9409 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool9271 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool11072 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool11073 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool11074 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool9415 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool11052 ? 1 : 0).append(string_67_).toString();
		string = new StringBuilder().append(string).append(aBool11070 ? 1 : 0).toString();
		return string;
	}

	@Override
	public Interface16 method2401(int i, int i_10_, Class121 class121, Class151 class151, int i_11_) {
		return new Class376(this, class121, class151, i, i_10_, i_11_);
	}

	@Override
	public Interface17 method2403(int i, int i_78_, int i_79_) {
		return new DirectXDepthStencil(this, Class151.aClass151_1854, i, i_78_, i_79_);
	}

	@Override
	public int[] method2404(int i, int i_45_, int i_46_, int i_47_) {
		method2456();
		int[] is = null;
		long l = IDirect3DDevice.GetRenderTarget(aLong4029, 0);
		long l_48_ = IDirect3DDevice.CreateRenderTarget(aLong4029, i_46_, i_47_, 21, 0, 0, true);
		int i_49_ = IDirect3DDevice.StretchRect(aLong4029, l, i, i_45_, i_46_, i_47_, l_48_, 0, 0, i_46_, i_47_, 1);
		method14589(i_46_ * i_47_ * 4);
		if (Class327.method5799(i_49_)) {
			is = new int[i_46_ * i_47_];
			IDirect3DSurface.Download(l_48_, 0, 0, i_46_, i_47_, i_46_ * 4, 16, aLong9268);
			aByteBuffer9279.clear();
			aByteBuffer9279.asIntBuffer().get(is);
		}
		IUnknown.Release(l);
		IUnknown.Release(l_48_);
		return is;
	}

	@Override
	public void method2405() {

	}

	@Override
	public boolean method2406() {
		return true;
	}

	@Override
	public boolean method2408() {
		return true;
	}

	@Override
	public void method2412(int i, int i_17_, int i_18_) {
		if (aLong11083 == 0L) {
			method17406(i_17_, i_18_);
		}
		long l = IDirect3DDevice.GetRenderTarget(aLong4029, 0);
		if (!Class327.method5798(IDirect3DDevice.StretchRect(aLong4029, l, 0, 0, aClass146_1561.getWidth(),
				aClass146_1561.getHeight(), aLong11083, anInt1569 * 81622179, anInt1568 * -2040424545, anInt1559
						* -673653535, anInt1570 * -303698357, 2))) {

		}
		IUnknown.Release(l);
		IDirect3DDevice.GetRenderTargetData(aLong4029, aLong11083, aLongArray11085[anInt11060]);
		long l_19_ = IDirect3DDevice.CreateEventQuery(aLong4029);
		if (Class327.method5799(IDirect3DEventQuery.Issue(l_19_))) {
			aLongArray11062[anInt11060] = l_19_;
		}
		anIntArray11086[anInt11060] = i;
		if (++anInt11060 >= 3) {
			anInt11060 = 0;
		}
	}

	@Override
	public void method2413(long l) {

	}

	@Override
	public void method2416() {
		if (aLong11083 != 0L) {
			IUnknown.Release(aLong11083);
			aLong11083 = 0L;
		}
		for (int i = 0; i < 3; i++) {
			if (aLongArray11062[i] != 0L) {
				IUnknown.Release(aLongArray11062[i]);
				aLongArray11062[i] = 0L;
			}
			if (aLongArray11085[i] != 0L) {
				IUnknown.Release(aLongArray11085[i]);
				aLongArray11085[i] = 0L;
			}
		}
		anInt11060 = 0;
		anInt11075 = 0;
	}

	@Override
	public void method2426(int i, int i_24_) {
		IDirect3DDevice.Clear(aLong4029, i, i_24_, 1.0F, 0);
	}

	@Override
	public CubeMapTextureProvider method2484(CubeMapTextureProvider class138, CubeMapTextureProvider class138_22_, float f, CubeMapTextureProvider class138_23_) {
		return f < 0.5F ? class138 : class138_22_;
	}

	@Override
	public int method2499() {
		if (aLongArray11062[anInt11075] == 0L) {
			return -1;
		}
		return Class327.method5799(IDirect3DEventQuery.IsSignaled(aLongArray11062[anInt11075])) ? anIntArray11086[anInt11075]
				: -1;
	}

	@Override
	public void method2507(boolean bool) {

	}

	@Override
	public DirectDisplay createDirectDisplay() {
		return new DirectXDirectDisplay(this);
	}

	@Override
	public void method2525(int i, int i_20_, int[] is, int[] is_21_) {
		method17411(i, i_20_, is, is_21_);
	}

	@Override
	public void method2574() {
		for (int i = 0; i < 3; i++) {
			if (aLongArray11062[i] != 0L) {
				IUnknown.Release(aLongArray11062[i]);
				aLongArray11062[i] = 0L;
			}
		}
		anInt11060 = 0;
		anInt11075 = 0;
	}

	@Override
	public long method2685(int i, int i_26_) {
		return method17411(i, i_26_, null, null);
	}

	@Override
	public boolean method2707() {
		return false;
	}

	@Override
	public Interface17 method2774(int i, int i_12_) {
		return new DirectXDepthStencil(this, Class151.aClass151_1854, i, i_12_, 0);
	}

	@Override
	public boolean method2806() {
		if (aBool11053) {
			return false;
		}
		if (aLongArray11062[anInt11060] != 0L) {
			return false;
		}
		return true;
	}

	@Override
	public RendererType renderer() {
		Direct3DAdapterIdentifier identifier = new Direct3DAdapterIdentifier();
		IDirect3D.GetAdapterIdentifier(aLong11048, anInt11061, 0, identifier);
		return new RendererType(identifier.vendorID, isFixedFunction() ? "Direct3D FF" : "Direct3D", 9,
				identifier.description, identifier.driverVersion);
	}

	@Override
	void method14598() {
		for (int i = 0; i < anInt9406; i++) {
			IDirect3DDevice.SetSamplerState(aLong4029, i, 7, 2);
			IDirect3DDevice.SetSamplerState(aLong4029, i, 6, 2);
			IDirect3DDevice.SetSamplerState(aLong4029, i, 5, 2);
			IDirect3DDevice.SetSamplerState(aLong4029, i, 1, 1);
			IDirect3DDevice.SetSamplerState(aLong4029, i, 2, 1);
			aClass318Array11068[i] = Class318.aClass318_3394;
			boolean[] bools = aBoolArray11058;
			int i_9_ = i;
			aBoolArray11059[i] = true;
			bools[i_9_] = true;
			aBoolArray11046[i] = false;
			anIntArray11063[i] = 0;
		}
		IDirect3DDevice.SetTextureStageState(aLong4029, 0, 6, 1);
		IDirect3DDevice.SetRenderState(aLong4029, 9, 2);
		IDirect3DDevice.SetRenderState(aLong4029, 23, 4);
		IDirect3DDevice.SetRenderState(aLong4029, 25, 5);
		IDirect3DDevice.SetRenderState(aLong4029, 24, 0);
		IDirect3DDevice.method15584(aLong4029, 206, aBool9415);
		IDirect3DDevice.SetRenderState(aLong4029, 181, 0);
		IDirect3DDevice.SetRenderState(aLong4029, 22, 2);
		IDirect3DDevice.SetRenderState(aLong4029, 147, 1);
		IDirect3DDevice.SetRenderState(aLong4029, 145, 1);
		IDirect3DDevice.method15583(aLong4029, 38, 0.95F);
		IDirect3DDevice.SetRenderState(aLong4029, 35, 3);
		IDirect3DDevice.method15583(aLong4029, 154, 1.0F);
		D3DLIGHT.SetType(aLong11054, 3);
		D3DLIGHT.SetType(aLong11055, 3);
		D3DLIGHT.SetType(aLong11056, 1);
		aBool11057 = false;
		super.method14598();
	}

	@Override
	void method14604() {
		if (fixedFunction) {
			D3DLIGHT.SetAmbient(aLong11054, aFloat9340 * aFloat9331, aFloat9321 * aFloat9331, aFloat9320 * aFloat9331,
					0.0F);
			aBool11057 = false;
		}
	}

	@Override
	void method14621() {
		method14649();
		method14651();
	}

	@Override
	void method14625() {
		IDirect3DDevice.method15584(aLong4029, 27, aBool9397);
	}

	@Override
	void method14627() {
		if (aClass146_1561 != null) {
			IDirect3DDevice.SetViewport(aLong4029, anInt9292 + anInt9372, anInt9328 + anInt9337, anInt9368, anInt9376,
					aFloat9309, aFloat9310);
		}
	}

	@Override
	void method14629() {
		IDirect3DDevice.method15584(aLong4029, 174, aBool9430);
	}

	@Override
	void method14638() {
		for (LinkableObject class480_sub25 = (LinkableObject) aClass644_11077.head(); class480_sub25 != null; class480_sub25 = (LinkableObject) aClass644_11077
				.next()) {
			Interface45 interface45 = (Interface45) class480_sub25.object;
			interface45.method331();
			if (interface45 == aClass146_1561) {
				interface45.method324();
			}
		}
		super.method14638();
	}

	@Override
	void method14645() {
		IDirect3DDevice.method15584(aLong4029, 7, aBool9307);
	}

	@Override
	void method14649() {
		if (fixedFunction) {
			float f = aBool9333 ? aFloat9344 : 0.0F;
			float f_29_ = aBool9333 ? -aFloat9345 : 0.0F;
			D3DLIGHT.SetDiffuse(aLong11054, f * aFloat9340, f * aFloat9321, f * aFloat9320, 0.0F);
			D3DLIGHT.SetDiffuse(aLong11055, f_29_ * aFloat9340, f_29_ * aFloat9321, f_29_ * aFloat9320, 0.0F);
			aBool11057 = false;
		}
	}

	@Override
	void method14650() {
		if (fixedFunction) {
			D3DLIGHT.SetDirection(aLong11054, -aFloatArray9298[0], -aFloatArray9298[1], -aFloatArray9298[2]);
			D3DLIGHT.SetDirection(aLong11055, -aFloatArray9329[0], -aFloatArray9329[1], -aFloatArray9329[2]);
			aBool11057 = false;
		}
	}

	@Override
	void method14651() {
		if (fixedFunction && !aBool11057) {
			IDirect3DDevice.LightEnable(aLong4029, 0, false);
			IDirect3DDevice.LightEnable(aLong4029, 1, false);
			IDirect3DDevice.SetLight(aLong4029, 0, aLong11054);
			IDirect3DDevice.SetLight(aLong4029, 1, aLong11055);
			IDirect3DDevice.LightEnable(aLong4029, 0, true);
			IDirect3DDevice.LightEnable(aLong4029, 1, true);
			aBool11057 = true;
		}
	}

	@Override
	void method14654() {
		int i;
		for (i = 0; i < anInt9348; i++) {
			PointLight class480_sub23 = aClass480_Sub23Array9346[i];
			int i_30_ = i + 2;
			int i_31_ = class480_sub23.getColour();
			float f = class480_sub23.getIntensity() / 255.0F;
			D3DLIGHT.SetPosition(aLong11056, class480_sub23.getX(),
					class480_sub23.getY(), class480_sub23.getZ());
			D3DLIGHT.SetDiffuse(aLong11056, (i_31_ >> 16 & 0xff) * f, (i_31_ >> 8 & 0xff) * f, (i_31_ & 0xff) * f, 0.0F);
			D3DLIGHT.SetAttenuation(aLong11056, 0.0F, 0.0F,
					1.0F / (class480_sub23.getRange() * class480_sub23.getRange()));
			D3DLIGHT.SetRange(aLong11056, class480_sub23.getRange());
			IDirect3DDevice.SetLight(aLong4029, i_30_, aLong11056);
			IDirect3DDevice.LightEnable(aLong4029, i_30_, true);
		}
		for (; i < anInt9347; i++) {
			IDirect3DDevice.LightEnable(aLong4029, i + 2, false);
		}
	}

	@Override
	boolean method14655(Class121 class121, Class151 class151) {
		Direct3DDisplayMode d3ddisplaymode = new Direct3DDisplayMode();
		return Class327.method5799(IDirect3D.GetAdapterDisplayMode(aLong11048, anInt11061, d3ddisplaymode))
				&& Class327.method5799(IDirect3D.CheckDeviceFormat(aLong11048, anInt11061, anInt11047,
						d3ddisplaymode.format, 0, 3, method17414(class121, class151)));
	}

	@Override
	boolean method14656(Class121 class121, Class151 class151) {
		Direct3DDisplayMode d3ddisplaymode = new Direct3DDisplayMode();
		return Class327.method5799(IDirect3D.GetAdapterDisplayMode(aLong11048, anInt11061, d3ddisplaymode))
				&& Class327.method5799(IDirect3D.CheckDeviceFormat(aLong11048, anInt11061, anInt11047,
						d3ddisplaymode.format, 0, 4, method17414(class121, class151)));
	}

	@Override
	void method14660(int i) {
		if (!aBool11066) {
			int i_25_ = (i & 0x2) != 0 ? 2 : 3;
			IDirect3DDevice.SetRenderState(aLong4029, 8, i_25_);
		}
	}

	@Override
	void method14661() {
		IDirect3DDevice.method15584(aLong4029, 14, aBool9427 && aBool9330);
	}

	@Override
	NativeCubeMapTexture createCubeMapTexture(int levels, boolean mipmapped, int[][] data) {
		return new DirectXCubeMapTexture(this, levels, mipmapped, data);
	}

	@Override
	Interface40 create2DTexture(Class121 class121, Class151 class151, int i, int i_59_) {
		return new RectangularDirectX2DTexture(this, class121, class151, i, i_59_);
	}

	@Override
	final void method14671(int i, Class344 class344, boolean bool, boolean bool_40_) {
		if (fixedFunction) {
			int i_41_ = 0;
			int i_42_;
			switch (i) {
				default:
					i_42_ = 2;
					break;
				case 1:
					i_42_ = 3;
					break;
				case 2:
					i_42_ = 26;
			}
			if (bool) {
				i_41_ |= 0x20;
			}
			if (bool_40_) {
				i_41_ |= 0x10;
			}
			IDirect3DDevice.SetTextureStageState(aLong4029, anInt9353, i_42_, method17416(class344) | i_41_);
		}
	}

	@Override
	final NativeElementArrayBuffer createElementArrayBuffer(boolean bool) {
		return new DirectXNativeElementArrayBuffer(this, Class151.aClass151_1849, bool);
	}

	@Override
	final void method14673(int i, Class344 class344, boolean bool) {
		if (fixedFunction) {
			int i_43_ = 0;
			int i_44_;
			switch (i) {
				case 2:
					i_44_ = 27;
					break;
				default:
					i_44_ = 5;
					break;
				case 1:
					i_44_ = 6;
			}
			if (bool) {
				i_43_ |= 0x10;
			}
			IDirect3DDevice.SetTextureStageState(aLong4029, anInt9353, i_44_, method17416(class344) | i_43_);
		}
	}

	@Override
	Native3DTexture create3DTexture(Class121 class121, int width, int height, int depth, boolean bool, byte[] data) {
		return new DirectX3DTexture(this, class121, width, height, depth, data);
	}

	@Override
	void method14678() {
		if (fixedFunction) {
			int i = aBoolArray11084[anInt9353] ? method17415(aClass347Array9357[anInt9353]) : 1;
			IDirect3DDevice.SetTextureStageState(aLong4029, anInt9353, 1, i);
		}
	}

	@Override
	final void method14679() {
		if (fixedFunction) {
			IDirect3DDevice.SetRenderState(aLong4029, 60, anInt9384);
		}
	}

	@Override
	void method14680() {
		if (aLong11087 == 0L && aClass336Array9356[anInt9353] != Class336.aClass336_3610) {
			if (aClass336Array9356[anInt9353] == Class336.aClass336_3611) {
				IDirect3DDevice.SetTransform(aLong4029, 16 + anInt9353,
						aClass399Array9396[anInt9353].method6570(aFloatArray11078));
			} else {
				IDirect3DDevice.SetTransform(aLong4029, 16 + anInt9353,
						aClass399Array9396[anInt9353].copy(aFloatArray11078));
			}
			int i = method17417(aClass336Array9356[anInt9353]);
			if (i != anIntArray11063[anInt9353]) {
				IDirect3DDevice.SetTextureStageState(aLong4029, anInt9353, 24, i);
				anIntArray11063[anInt9353] = i;
			}
		} else {
			IDirect3DDevice.SetTextureStageState(aLong4029, anInt9353, 24, 0);
			anIntArray11063[anInt9353] = 0;
		}
	}

	@Override
	void method14681() {

	}

	@Override
	void method14682() {
		if (fixedFunction) {
			int i = aBoolArray11084[anInt9353] ? method17415(aClass347Array9358[anInt9353]) : 1;
			IDirect3DDevice.SetTextureStageState(aLong4029, anInt9353, 4, i);
		}
	}

	@Override
	void method14686(int i) {
		IDirect3DDevice.SetRenderState(aLong4029, 168, i);
	}

	@Override
	void method14688() {
		switch (aClass308_9325.anInt3323) {
			case 1:
				IDirect3DDevice.SetRenderState(aLong4029, 19, 2);
				IDirect3DDevice.SetRenderState(aLong4029, 20, 2);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(aLong4029, 19, 9);
				IDirect3DDevice.SetRenderState(aLong4029, 20, 2);
				break;
			case 2:
				IDirect3DDevice.SetRenderState(aLong4029, 19, 5);
				IDirect3DDevice.SetRenderState(aLong4029, 20, 6);
				break;
			case 0:
				IDirect3DDevice.SetRenderState(aLong4029, 19, 2);
				IDirect3DDevice.SetRenderState(aLong4029, 20, 1);
				break;
		}

		switch (anInt9395) {
			case 2:
				IDirect3DDevice.SetRenderState(aLong4029, 207, 2);
				IDirect3DDevice.SetRenderState(aLong4029, 208, 2);
				break;
			case 0:
				IDirect3DDevice.SetRenderState(aLong4029, 207, 1);
				IDirect3DDevice.SetRenderState(aLong4029, 208, 1);
				break;
			case 3:
				IDirect3DDevice.SetRenderState(aLong4029, 207, 1);
				IDirect3DDevice.SetRenderState(aLong4029, 208, 2);
				break;
			case 1:
				IDirect3DDevice.SetRenderState(aLong4029, 207, 2);
				IDirect3DDevice.SetRenderState(aLong4029, 208, 1);
				break;
		}
	}

	@Override
	void method14693() {
		aFloat9393 = aFloat9314 - anInt9391;
		aFloat9392 = aFloat9393 - anInt9390;
		if (aFloat9392 < aFloat9313) {
			aFloat9392 = aFloat9313;
		}
		if (fixedFunction) {
			IDirect3DDevice.method15583(aLong4029, 36, aFloat9392);
			IDirect3DDevice.method15583(aLong4029, 37, aFloat9393);
			IDirect3DDevice.SetRenderState(aLong4029, 34, anInt9293);
		}
	}

	@Override
	final NativeArrayBuffer createArrayBuffer(boolean stream) {
		return new DirectXArrayBuffer(this, stream);
	}

	@Override
	Class323 method14696(Class320... class320s) {
		return new Class323_Sub1(this, class320s);
	}

	@Override
	Native2DTexture method14699(Class121 class121, int i, int i_56_, boolean bool, float[] fs, int i_57_, int i_58_) {
		return new DirectX2DTexture(this, class121, i, i_56_, bool, fs, i_57_, i_58_);
	}

	@Override
	Native2DTexture method14717(int i, int i_32_, boolean bool, int[] is, int i_33_, int i_34_) {
		return new DirectX2DTexture(this, i, i_32_, bool, is, i_33_, i_34_);
	}

	@Override
	void method14720() {
		IDirect3DDevice.method15584(aLong4029, 15, aBool9398);
		IDirect3DDevice.SetRenderState(aLong4029, 24, aByte9399 & 0xff);
		if (aD3DPRESENT_PARAMETERS11050.MultiSampleType > 0) {
			if (!aBool9398 || aByte9399 == 0) {
				if (aBool11074 || aBool11072) {
					IDirect3DDevice.SetRenderState(aLong4029, 181, 0);
				} else if (aBool11073) {
					IDirect3DDevice.method15583(aLong4029, 154, 1.0F);
				}
			} else if (aBool11074) {
				IDirect3DDevice.SetRenderState(aLong4029, 181, method14824('S', 'S', 'A', 'A'));
			} else if (aBool11072) {
				IDirect3DDevice.SetRenderState(aLong4029, 181, method14824('A', 'T', 'O', 'C'));
			} else if (aBool11073) {
				IDirect3DDevice.SetRenderState(aLong4029, 154, method14824('A', '2', 'M', '1'));
			}
		}
	}

	@Override
	void method14731() {
		method2416();
		for (LinkableObject class480_sub25 = (LinkableObject) aClass644_11077.head(); class480_sub25 != null; class480_sub25 = (LinkableObject) aClass644_11077
				.next()) {
			Interface45 interface45 = (Interface45) class480_sub25.object;
			interface45.delete();
		}
		super.method14731();
	}

	@Override
	void method14733() {
		if (fixedFunction) {
			IDirect3DDevice.method15584(aLong4029, 28, aBool9388 && aBool9387 && anInt9390 >= 0);
		}
	}

	@Override
	Native2DTexture method14740(Class121 class121, Class151 class151, int i, int i_68_) {
		return new DirectX2DTexture(this, class121, class151, i, i_68_);
	}

	@Override
	void method14748(NativeElementArrayBuffer interface36) {
		IDirect3DDevice.SetIndices(aLong4029, ((DirectXNativeElementArrayBuffer) interface36).identifier);
	}

	@Override
	Native2DTexture create2DTexture(Class121 class121, int i, int i_35_, boolean bool, byte[] is, int i_36_, int i_37_) {
		return new DirectX2DTexture(this, class121, i, i_35_, bool, is, i_36_, i_37_);
	}

	@Override
	void method14908(boolean bool) {
		IDirect3DDevice.method15584(aLong4029, 161, bool);
	}

	@Override
	void method14953() {
		if (fixedFunction) {
			IDirect3DDevice.method15584(aLong4029, 137, aBool9332 && !aBool9380);
		}
	}

	@Override
	void method14968() {
		IDirect3DDevice.SetScissorRect(aLong4029, anInt9292 + anInt9305, anInt9328 + anInt9373, anInt9318, anInt9394);
	}

	@Override
	final void method14977(NativeElementArrayBuffer interface36, Class333 class333, int i, int i_70_, int i_71_,
			int i_72_) {
		if (aClass249_Sub1_11065 != null) {
			aClass249_Sub1_11065.method15104();
		}
		IDirect3DDevice.DrawIndexedPrimitiveIB(aLong4029, ((DirectXNativeElementArrayBuffer) interface36).identifier,
				4, 0, i, i_70_, i_71_, i_72_);
	}

	boolean method17403(int i, int i_3_) {
		int i_4_ = IDirect3DDevice.TestCooperativeLevel(aLong4029);
		if (i_4_ == 0 || i_4_ == -2005530519) {
			IDirect3DDevice.SetDepthStencilSurface(aLong4029, 0L);
			for (int i_5_ = 1; i_5_ < 4; i_5_++) {
				IDirect3DDevice.SetRenderTarget(aLong4029, i_5_, 0L);
			}
			for (int i_6_ = 0; i_6_ < 4; i_6_++) {
				IDirect3DDevice.SetStreamSource(aLong4029, i_6_, 0L, 0, 0);
			}
			for (int i_7_ = 0; i_7_ < 4; i_7_++) {
				IDirect3DDevice.SetTexture(aLong4029, i_7_, 0L);
			}
			IDirect3DDevice.SetIndices(aLong4029, 0L);
			method14731();
			aD3DPRESENT_PARAMETERS11050.BackBufferWidth = i;
			aD3DPRESENT_PARAMETERS11050.BackBufferHeight = i_3_;
			aD3DPRESENT_PARAMETERS11050.BackBufferCount = 1;
			if (method17420(anInt11061, anInt11047, aLong11048, anInt9400, aD3DDISPLAYMODE11080,
					aD3DPRESENT_PARAMETERS11050)) {
				int i_8_ = IDirect3DDevice.Reset(aLong4029, aD3DPRESENT_PARAMETERS11050);
				if (Class327.method5799(i_8_)) {
					aBool11053 = false;
					method14638();
					method14598();
					return true;
				}
			}
		}
		return false;
	}

	LinkableObject method17404(Interface45 interface45) {
		for (LinkableObject class480_sub25 = (LinkableObject) aClass644_11077.head(); class480_sub25 != null; class480_sub25 = (LinkableObject) aClass644_11077
				.next()) {
			if (class480_sub25.object == interface45) {
				return class480_sub25;
			}
		}
		return null;
	}

	void method17405(Interface45 interface45) {
		LinkableObject class480_sub25 = method17404(interface45);
		if (class480_sub25 != null) {
			class480_sub25.unlink();
		}
	}

	void method17406(int i, int i_15_) {
		method2416();
		method2757(i, i_15_);
		aLong11083 = IDirect3DDevice.CreateRenderTarget(aLong4029, i, i_15_,
				method17414(Class121.aClass121_1465, Class151.aClass151_2), 0, 0, false);
		for (int i_16_ = 0; i_16_ < 3; i_16_++) {
			aLongArray11085[i_16_] = IDirect3DDevice.CreateOffscreenPlainSurface(aLong4029, i, i_15_,
					method17414(Class121.aClass121_1465, Class151.aClass151_2), 2);
		}
		method14589(i * i_15_ * 4);
	}

	final void method17408(long l) {
		aLong11087 = l;
		IDirect3DDevice.SetVertexShader(aLong4029, l);
	}

	final void method17409(long l) {
		IDirect3DDevice.SetPixelShader(aLong4029, l);
	}

	long method17411(int i, int i_27_, int[] is, int[] is_28_) {
		if (aLongArray11062[anInt11075] != 0L) {
			IUnknown.Release(aLongArray11062[anInt11075]);
			aLongArray11062[anInt11075] = 0L;
		}
		aByteBuffer9279.clear();
		IDirect3DSurface.Download(aLongArray11085[anInt11075], 0, 0, i, i_27_, i * 4, 0, aLong9268);
		if (++anInt11075 >= 3) {
			anInt11075 = 0;
		}
		if (is != null) {
			aByteBuffer9279.asIntBuffer().get(is);
			return 0L;
		}
		return aLong9268;
	}

	void method17412(Interface45 interface45) {
		if (method17404(interface45) == null) {
			aClass644_11077.pushBack(new LinkableObject(interface45));
		}
	}

	byte[] loadDirectXShader(String string) {
		return loadShader("dx", string);
	}

	synchronized void method17421(long identifier) {
		if (anInt11088 == anInt11079) {
			anInt11079 *= 2;
			long[] ls = new long[anInt11079];
			System.arraycopy(aLongArray11081, 0, ls, 0, anInt11088);
			aLongArray11081 = ls;
		}

		aLongArray11081[anInt11088] = identifier;
		anInt11088++;
	}

	final void method17425(DirectX2DTexture class381_sub2) {
		method17435(class381_sub2);
		if (aBoolArray11058[anInt9353] != class381_sub2.aBool9862) {
			IDirect3DDevice.SetSamplerState(aLong4029, anInt9353, 1, class381_sub2.aBool9862 ? 1 : 3);
			aBoolArray11058[anInt9353] = class381_sub2.aBool9862;
		}
		if (aBoolArray11059[anInt9353] != class381_sub2.aBool9861) {
			IDirect3DDevice.SetSamplerState(aLong4029, anInt9353, 2, class381_sub2.aBool9861 ? 1 : 3);
			aBoolArray11059[anInt9353] = class381_sub2.aBool9861;
		}
	}

	final void method17431(DirectX3DTexture class381_sub1) {
		method17435(class381_sub1);
		if (!aBoolArray11058[anInt9353]) {
			IDirect3DDevice.SetSamplerState(aLong4029, anInt9353, 1, 1);
			aBoolArray11058[anInt9353] = true;
		}
		if (!aBoolArray11059[anInt9353]) {
			IDirect3DDevice.SetSamplerState(aLong4029, anInt9353, 2, 1);
			aBoolArray11059[anInt9353] = true;
		}
	}

	final void method17435(DirectXTexture class381) {
		IDirect3DDevice.SetTexture(aLong4029, anInt9353, class381.method6237());

		if (fixedFunction && !aBoolArray11084[anInt9353]) {
			aBoolArray11084[anInt9353] = true;
			method14682();
			method14678();
		}
	}

	@Override
	void method2374() {
		super.method2374();
		if (aLong11054 != 0L) {
			D3DLIGHT.Destroy(aLong11054);
			aLong11054 = 0L;
		}
		if (aLong11055 != 0L) {
			D3DLIGHT.Destroy(aLong11055);
			aLong11055 = 0L;
		}
		if (aLong11056 != 0L) {
			D3DLIGHT.Destroy(aLong11056);
			aLong11056 = 0L;
		}
		if (aLong4029 != 0L) {
			IDirect3DDevice.Destroy(aLong4029);
			aLong4029 = 0L;
		}
		if (aLong11048 != 0L) {
			IUnknown.Release(aLong11048);
			aLong11048 = 0L;
		}
	}

	@Override
	DelegatingDisplay createDelegatingDisplay(Canvas canvas, int width, int height) {
		return new DirectXDelegatingDisplay(this, canvas, width, height, false);
	}

	@Override
	void method2647(int i, int i_73_) {
		if (aBool11053) {
			if (!method17403(aClass146_Sub1_1552.getWidth(), aClass146_Sub1_1552.getHeight())) {
				return;
			}
			((DirectXDelegatingDisplay) aClass146_Sub1_1552).method331();
		} else {
			IDirect3DDevice.EndScene(aLong4029);
		}
		int i_74_ = aClass146_Sub1_1552.draw();
		if (Class327.method5798(i_74_)) {
			aBool11053 = true;
			aClass146_Sub1_1552.delete();
		} else {
			IDirect3DDevice.BeginScene(aLong4029);
			if (anInterface19_1546 != null) {
				anInterface19_1546.method106();
			}
		}
	}

}