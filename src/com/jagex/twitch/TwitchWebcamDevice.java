package com.jagex.twitch;

import java.util.LinkedList;

public class TwitchWebcamDevice {
	public String aString922;
	public String aString923;
	public int anInt924;
	public int anInt925;
	private final LinkedList<TwitchWebcamDeviceCapability> capabilities = new LinkedList<TwitchWebcamDeviceCapability>();
	public static TwitchWebcamDevice[] webcamDevices;

	public TwitchWebcamDevice(int i, int i_0_, String string, String string_1_) {
		anInt924 = -2059798203 * i;
		anInt925 = i_0_ * 2090487851;
		aString922 = string;
		aString923 = string_1_;
	}

	public void addCapability(int i, int i_2_, int i_3_, int i_4_, int i_5_) {
		capabilities.add(new TwitchWebcamDeviceCapability(i, i_2_, i_3_, i_4_, i_5_));
	}

	public TwitchWebcamDeviceCapability getCapability(int capability) {
		if (capability < 0 || capability >= capabilities.size()) {
			return null;
		}

		return capabilities.get(capability);
	}

	public TwitchWebcamDeviceCapability method1415(int i) {
		for (int index = 0; index < capabilities.size(); index++) {
			if (capabilities.get(index).anInt934 * 1172125411 == i) {
				return capabilities.get(index);
			}
		}

		return null;
	}

	public int capabilities() {
		return capabilities.size();
	}

	public static void getDevices() {
		webcamDevices = TwitchTV.tv.GetWebcamDevices();
	}

	public static int method2861() {
		return null == webcamDevices ? 0 : webcamDevices.length;
	}

	public static TwitchWebcamDevice method1368(String string, int i) {
		if (null == TwitchWebcamDevice.webcamDevices) {
			return null;
		}
		for (TwitchWebcamDevice device : TwitchWebcamDevice.webcamDevices) {
			if (device.aString922.equals(string)) {
				return device;
			}
		}
		return null;
	}

}