package com.jagex;

import com.jagex.twitch.TwitchTV;

public abstract class BaseGraphicDefinitionProvider implements DefinitionProvider<GraphicDefinition> {
	public static int method10303() {
		Class150.method3186();
		return TwitchTV.tv.StopStreaming();
	}

	Archive models;
	ReferenceCache cache = new ReferenceCache(60);
	int anInt7910;

	BaseGraphicDefinitionProvider(Archive models) {
		this.models = models;
	}

	void sweep(int maximumAge) {
		synchronized (cache) {
			cache.sweep(maximumAge);
		}
	}

	void clear(int i) {
		anInt7910 = 1367980847 * i;
		synchronized (cache) {
			cache.clear();
		}
	}

	void reset() {
		synchronized (cache) {
			cache.clear();
		}
	}

	void clearSoft() {
		synchronized (cache) {
			cache.clearSoft();
		}
	}

}