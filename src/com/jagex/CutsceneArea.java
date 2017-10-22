package com.jagex;

import com.jagex.twitch.TwitchEvent;
import com.jagex.twitch.TwitchEventLiveStreams;
import com.jagex.twitch.TwitchEventResult;
import com.jagex.twitch.TwitchTV;
import com.jagex.twitch.TwitchWebcamDevice;

public class CutsceneArea extends Linkable {
	static boolean method16039(TwitchEvent event, long l) {
		if (!Class533.aBool7266) {
			switch (event.eventType) {
				case 7:
				case 8:
				case 9:
					return false;
			}
		}

		if (event.eventType == 33) {
			if (null == Class533.aTwitchWebcamFrameData7282) {
				return false;
			}

			int result = ((TwitchEventResult) event).result;
			int i_0_ = TwitchTV.tv.GetWebcamFrameData(result, Class533.aTwitchWebcamFrameData7282);
			if (i_0_ == 0) {
				if (Class533.aBool7289) {
					Class533.aTwitchWebcamFrameData7282.method13914();
				}
				if (Class533.aBool7290) {
					Class533.aTwitchWebcamFrameData7282.method13915();
				}
				RegionUpdateType.method6026();
				Class533.aLong7271 = 2525320551650205725L * l;
				ProxyingVariableLoader.method5081(33, 0);
			} else {
				Class533.aClass116_7274 = null;
			}
			return false;
		}
		if (event.eventType == 30) {
			int result = ((TwitchEventResult) event).result;
			if (0 == result || result == 1) {
				TwitchWebcamDevice.getDevices();
			} else if (2 == result) {
				Class533.aLong7271 = l * 2525320551650205725L;
			}
		}
		if (34 == event.eventType) {
			TwitchTV.aTwitchEventLiveStreams1243 = (TwitchEventLiveStreams) event;
			ProxyingVariableLoader.method5081(34, 0);
		}
		return true;
	}

	static void method16040() {
		Class208.aClass644_2168 = null;
		Class495_Sub1.anInt10322 = 0;
		Class495.anInt6853 = 0;
		ParticleProducer.aClass226_7678 = null;
		Class495.method8549();
		Class495.aClass644_6820.clear();
		Class495.aClass488_6832 = null;
		Class495.aClass168_6825.clear();
		Class495.aClass168_6810.clear();
		Class361.aClass116_3912 = null;
		Class495_Sub1.anInt10327 = -1164673443;
		Class495_Sub1.anInt10324 = -732309487;
		if (null != Class495.aClass678_Sub8_6803) {
			Class495.aClass678_Sub8_6803.reset();
			Class495.aClass678_Sub8_6803.resizeCaches(128, 64);
		}
		if (null != Class495.aClass678_Sub15_6809) {
			Class495.aClass678_Sub15_6809.resizeCache(64, 64);
		}
		if (null != Class495.aClass678_Sub17_6802) {
			Class495.aClass678_Sub17_6802.resize(256);
		}
		VariableBitsDefinition.loader.resize(64);
	}

	public int regionZ;
	public int regionX;
	public int length;
	public int anInt10198;
	public int anInt10199;
	public int anInt10200;
	public int plane;
	public int width;
	public int anInt10203;
	public static Deque cutsceneAreas = new Deque();

	CutsceneArea(Buffer buffer) {
		int position = buffer.readInt();
		plane = (position >>> 28) * -954943237;
		regionX = (position >>> 14 & 0x3fff) * -2037051623;
		regionZ = (position & 0x3fff) * 418141483;
		width = buffer.readUByte() * -1594758125;
		length = buffer.readUByte() * -493711173;
		anInt10198 = buffer.readUByte() * -1836367751;
		anInt10199 = buffer.readUByte() * -1642175287;
		anInt10200 = buffer.readUByte() * 310477807;
		anInt10203 = buffer.readUByte() * -1314905239;
	}

}