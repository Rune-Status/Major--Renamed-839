package com.jagex;

import com.jagex.twitch.TwitchTV;

public class Class266 implements Runnable {
	public static int method5042() {
		if (null == TwitchTV.aTwitchEventLiveStreams1243
				|| -950739453 * Class533.anInt7259 >= TwitchTV.aTwitchEventLiveStreams1243.streamCount - 1) {
			return -1;
		}
		return (Class533.anInt7259 += 627915947) * -950739453;
	}

	Interface27 anInterface27_2964;
	String aString2965;
	Interface27 anInterface27_2966 = new Class263();
	volatile boolean aBool2967;
	long aLong2968;
	int anInt2969;
	long aLong2970;
	String aString2971;
	int anInt2972;
	boolean aBool2973;
	Class262 aClass262_2974;

	public String method5016() {
		return aString2971;
	}

	public int method5018(int i) {
		if (aClass262_2974 == null) {
			return 0;
		}
		int i_2_ = 1189066767 * aClass262_2974.anInt2944;
		if (aClass262_2974.aBool2946 && -487878131 * anInt2972 < -2004811939 * aClass262_2974.anInt2927) {
			return 1 + anInt2972 * -487878131;
		}
		if (i_2_ < 0 || i_2_ >= Class277.aClass262Array3115.length - 1) {
			return 100;
		}
		if (anInt2972 * -487878131 == 1311420491 * aClass262_2974.anInt2943) {
			return aClass262_2974.anInt2927 * -2004811939;
		}
		return aClass262_2974.anInt2943 * 1311420491;
	}

	public Class262 method5019() {
		return aClass262_2974;
	}

	public int method5022() {
		return -487878131 * anInt2972;
	}

	public long method5031(int i) {
		return aLong2970 * 1213240411724406929L;
	}

	public String method5035() {
		return aString2965;
	}

	@Override
	public void run() {
		while (!aBool2967) {
			long l = TimeUtil.time();
			synchronized (this) {
				try {
					anInt2969 += 1271637139;
					if (anInterface27_2966 instanceof Class263) {
						anInterface27_2966.method156(aBool2973, 751113381);
					} else {
						long l_3_ = TimeUtil.time();
						if (Class60.activeToolkit != null
								&& anInterface27_2964 != null
								&& anInterface27_2964.method159(-1787479203) != 0
								&& aLong2968 * -7671454992953302787L >= l_3_
										- anInterface27_2964.method159(-1786978143)) {
							int i = (int) ((l_3_ - aLong2968 * -7671454992953302787L) * 255L / anInterface27_2964
									.method159(-1847259846));
							int i_4_ = 255 - i;
							i = i << 24 | 0xffffff;
							i_4_ = i_4_ << 24 | 0xffffff;
							Class351.method5970();
							Class60.activeToolkit.method2426(1, 0);
							Sprite class116 = Class60.activeToolkit.createSprite(1319181337 * Engine.screenWidth,
									Engine.screenHeight * -551672947, true, -1508236146);
							DirectDisplay class146_sub2 = Class60.activeToolkit.createDirectDisplay();
							class146_sub2.method14256(0, class116.method2075());
							Class60.activeToolkit.method2397(class146_sub2);
							anInterface27_2964.method156(true, 1239879151);
							Class60.activeToolkit.method2398(class146_sub2);
							class116.method2142(0, 0, 0, i_4_, 1);
							Class60.activeToolkit.method2397(class146_sub2);
							Class60.activeToolkit.method2426(1, 0);
							anInterface27_2966.method156(true, 1054712355);
							Class60.activeToolkit.method2398(class146_sub2);
							class116.method2142(0, 0, 0, i, 1);
						} else {
							if (null != anInterface27_2964) {
								aBool2973 = true;
								anInterface27_2964.method157((byte) -43);
								anInterface27_2964 = null;
							}
							if (aBool2973) {
								Class351.method5970();
								if (Class60.activeToolkit != null) {
									Class60.activeToolkit.method2426(1, 0);
								}
							}
							anInterface27_2966.method156(aBool2973 || Class60.activeToolkit != null
									&& Class60.activeToolkit.method2379(), 1593527761);
						}
						if (null != Class60.activeToolkit && !(anInterface27_2966 instanceof Class263)) {
							Class60.activeToolkit.method2370();
						}
					}
					aBool2973 = false;
					if (Class60.activeToolkit != null && !(anInterface27_2966 instanceof Class263)
							&& 1189066767 * aClass262_2974.anInt2944 < 1189066767 * Class262.aClass262_2937.anInt2944) {
						Class166_Sub6.method15083();
					}
				} catch (Exception exception) {
					continue;
				}
			}
			long l_5_ = TimeUtil.time();
			int i = (int) (20L - (l_5_ - l));
			if (i > 0) {
				Client.sleep(i);
			}
		}
	}

	void method5008() {
		aBool2967 = true;
	}

	synchronized boolean method5011(byte i) {
		return anInterface27_2966.method164(-7671454992953302787L * aLong2968);
	}

	synchronized void method5012(Interface27 interface27, int i) {
		anInterface27_2964 = anInterface27_2966;
		anInterface27_2966 = interface27;
		aLong2968 = TimeUtil.time() * 5930489941091286101L;
	}

	synchronized void method5013(long l, String string, String string_0_, int i, Class262 class262) {
		aLong2970 = l * 9119487538243068017L;
		aString2965 = string;
		aString2971 = string_0_;
		anInt2972 = -1788867387 * i;
		aClass262_2974 = class262;
	}

	synchronized void method5020() {
		aBool2973 = true;
	}

	int method5026() {
		return anInt2969 * 41621915;
	}

	static void method10430() {
		if (Class262.aClass262_2650 != null) {
			IgnoredPlayer.aClass266_670 = new Class266();
			IgnoredPlayer.aClass266_670.method5013(-4493359127459657419L * Class151.aLong1860,
					Class262.aClass262_2650.aClass5_2930.translate(Client.currentLanguage),
					Class262.aClass262_2650.aClass5_2930.translate(Client.currentLanguage),
					1311420491 * Class262.aClass262_2650.anInt2943, Class262.aClass262_2650);
			Class263.aThread2955 = new Thread(IgnoredPlayer.aClass266_670, "");
			Class263.aThread2955.start();
		}
	}

}