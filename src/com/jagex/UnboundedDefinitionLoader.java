package com.jagex;

import java.lang.reflect.Array;
import java.util.Iterator;

public class UnboundedDefinitionLoader<T extends Definition> implements DefinitionLoader<T> {
	public static short[][] originalBodyColours;
	static Archive aClass406_231;

	protected int size;
	ConfigEntry config;
	Archive archive;
	DefinitionProvider<T> provider;
	T anInterface8_228;
	Definition[] definitions;

	UnboundedDefinitionLoader(GameContext context, Language language, ConfigEntry config, Archive archive,
			DefinitionProvider<T> provider, boolean loadImmediately) {
		this.provider = provider;
		this.config = config;
		this.archive = archive;
		size = FogPreference.getChildSize(archive, config) * 371121147;
		definitions = (Definition[]) Array.newInstance(provider.getClassType(), 1323431731 * size);

		if (loadImmediately) {
			for (int id = 0; id < 1323431731 * size; id++) {
				load(id);
			}
		}
	}

	@Override
	public Iterator iterator() {
		return new UnboundedDefinitionLoaderIterator(this);
	}

	@Override
	public int count() {
		return definitions.length;
	}

	@Override
	public T get(int id) {
		if (id < 0) {
			if (anInterface8_228 == null) {
				anInterface8_228 = provider.provide(-1, this);
			}

			return anInterface8_228;
		}

		if (null == definitions[id]) {
			load(id);
		}

		return (T) definitions[id];
	}

	void load(int id) {
		if (null == definitions[id]) {
			try {
				definitions[id] = provider.provide(id, this);
			} catch (Exception exception) {
				exception.printStackTrace();
				return;
			}

			byte[] data = ConfigEntry.get(archive, config, id);
			if (null != data) {
				definitions[id].decode(new Buffer(data));
			}

			definitions[id].method35();
		}
	}

}