package com.jagex.twitch;

import com.jagex.Class527;

public class TwitchEventLiveStreams extends TwitchEvent {
	public int streamCount;
	public String[] channelUrls;
	public String[] previewUrlTemplates;
	public String[] streamTitles;
	public String[] channelDisplayNames;
	public int[] viewerCounts;

	public TwitchEventLiveStreams(int type, int count) {
		super(type);
		streamCount = count;

		if (streamCount > 0) {
			channelUrls = new String[streamCount];
			previewUrlTemplates = new String[streamCount];
			streamTitles = new String[streamCount];
			channelDisplayNames = new String[streamCount];
			viewerCounts = new int[streamCount];
		}
	}

	@Override
	public void method6186(int[] ints, long[] longs, Object[] objects) {

	}

	@Override
	public Class527 method6187() {
		return null;
	}

	public void SetStream(int index, String url, String previewTemplate, String title, String displayName, int viewers) {
		if (index >= 0 && index < streamCount) {
			channelUrls[index] = url;
			previewUrlTemplates[index] = previewTemplate;
			streamTitles[index] = title;
			channelDisplayNames[index] = displayName;
			viewerCounts[index] = viewers;
		}
	}
}
