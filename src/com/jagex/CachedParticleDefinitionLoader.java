package com.jagex;

import com.jagex.twitch.TwitchWebcamDevice;

public class CachedParticleDefinitionLoader implements ParticleProducerDefinitionLoader {

	public static TextureMetricsList aClass147_3727;

	public static TwitchWebcamDevice method5981(int i) {
		if (null == TwitchWebcamDevice.webcamDevices) {
			return null;
		}

		for (TwitchWebcamDevice device : TwitchWebcamDevice.webcamDevices) {
			if (i == device.anInt924 * -1008356979) {
				return device;
			}
		}

		return null;
	}

	ReferenceCache<ParticleProducerDefinition> cache = new ReferenceCache<ParticleProducerDefinition>(64);
	Archive particles;

	public CachedParticleDefinitionLoader(Archive particles) {
		this.particles = particles;
	}

	public void clearCache() {
		cache.clear();
	}

	@Override
	public synchronized ParticleProducerDefinition load(int id) {
		ParticleProducerDefinition definition = cache.get(id);
		if (definition != null) {
			return definition;
		}

		byte[] data = particles.get(0, id);
		definition = new ParticleProducerDefinition();
		if (data != null) {
			definition.decode(new Buffer(data));
		}

		definition.init();
		cache.put(id, definition);
		return definition;
	}

}