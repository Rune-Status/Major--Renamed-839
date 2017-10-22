package com.jagex.twitch;

import com.jagex.Class533;
import com.jagex.Client;

public class TwitchTV {
	public static TwitchTV tv;

	public static int getStreamState() {
		return tv.GetStreamState();
	}

	public static int getViewerCount() {
		return tv.GetViewerCount();
	}

	public static int method5832(int index, int i_0_, int i_1_) {
		Class533.aTwitchWebcamFrameData7282 = new TwitchWebcamFrameData();
		if (index < 0 || index >= TwitchWebcamDevice.webcamDevices.length) {
			return -1;
		}
	
		return tv.StartWebcamDevice(-2113671549 * TwitchWebcamDevice.webcamDevices[index].anInt925, i_0_);
	}

	public static int sendTwitchChatMessage(String string) {
		return TwitchTV.tv.ChatSendMessage(string);
	}

	public static TwitchEventLiveStreams aTwitchEventLiveStreams1243;

	public native int ChatSendMessage(String string);

	public native void FlushStreamingEvents();

	public native int GetChatState();

	public native int GetLoginState();

	public native long GetNextFreeFrameBuffer();

	public native int[] GetRecommendedSettings(int i, int i_10_, int i_11_, int i_12_, int i_13_, float f, boolean bool);

	public native int GetStreamState();

	public native String GetUsername();

	public native int GetViewerCount();

	public native TwitchWebcamDevice[] GetWebcamDevices();

	public native int GetWebcamFrameData(int i, TwitchWebcamFrameData twitchwebcamframedata);

	public native int[] GetWebcamFrameResolution(int i);

	public native int GetWebcamState();

	public native int InitialiseTTV(String string);

	public native boolean IsReadyToStream();

	public native boolean IsStreaming();

	public native int Login(String string, String string_0_);

	public native int Logout();

	public native int Pause();

	public native int RequestLiveStreams(String string);

	public native void RestartWebcamDevice();

	public native int RunCommercial();

	public native TwitchEvent[] Service();

	public native void SetAuthResponse(String string, int i, String string_1_);

	public native int SetStreamTitle(String string, String string_14_);

	public native void SetUserStreamRefreshInterval(int i);

	public native int ShutdownTTV();

	public native int StartStreaming(int i, int i_2_, int i_3_, int i_4_, boolean bool, float f, int i_5_,
			boolean bool_6_);

	public native int StartWebcamDevice(int i, int i_15_);

	public native int StopStreaming();

	public native int StopWebcamDevice(int i);

	public native int SubmitFrame(long l, boolean bool, boolean bool_7_, int i, int i_8_);

	public native int SubmitFrameRaw(int[] is, boolean bool, int i, int i_9_);

	public static boolean isStreaming() {
		return null != tv && tv.IsStreaming();
	}

	public static int setStreamTitle(String string) {
		return tv.SetStreamTitle(string, Client.game.name);
	}

	public static int getWebcamState() {
		return tv.GetWebcamState();
	}

	public static int requestLiveStreams() {
		TwitchTV.aTwitchEventLiveStreams1243 = null;
		return tv.RequestLiveStreams(Client.game.name);
	}

}