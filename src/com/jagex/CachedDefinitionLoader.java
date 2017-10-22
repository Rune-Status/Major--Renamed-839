package com.jagex;

import java.util.Iterator;

public class CachedDefinitionLoader<D extends Definition> implements DefinitionLoader<D> {

	static int anInt8502;

	public static int[] method13912(int i) {
		int[] is = new int[3];
		Class527.method8990(Class614.method10355(i));
		is[0] = CalendarUtils.DEFAULT_CALENDAR.get(5);
		is[1] = CalendarUtils.DEFAULT_CALENDAR.get(2);
		is[2] = CalendarUtils.DEFAULT_CALENDAR.get(1);
		return is;
	}

	static final void method13913(ScriptExecutionContext class613, int i) throws ScriptException {
		class613.anInt7924 -= 195773364;
		float f = class613.anIntArray7942[class613.anInt7924 * 1841827045];
		float f_5_ = class613.anIntArray7942[class613.anInt7924 * 1841827045 + 1];
		float f_6_ = class613.anIntArray7942[2 + class613.anInt7924 * 1841827045];
		float f_7_ = class613.anIntArray7942[1841827045 * class613.anInt7924 + 3] / 1000.0F;
		Class369.aClass261_Sub1_4079.method4821(Class397.create(f, f_5_, f_6_), f_7_, 1476968774);
	}

	public int definitionCount;
	protected DefinitionProvider<D> provider;
	ConfigEntry config;
	Archive archive;
	ReferenceCache<D> cache;

	CachedDefinitionLoader(GameContext context, Language language, Archive archive, ConfigEntry config, int capacity,
			DefinitionProvider<D> provider) {
		this.archive = archive;
		this.config = config;
		this.provider = provider;
		definitionCount = FogPreference.getChildSize(archive, config) * -1779515421;
		cache = new ReferenceCache<D>(capacity);
	}

	public void reset() {
		synchronized (cache) {
			cache.clear();
		}
	}

	public void clearSoft() {
		synchronized (cache) {
			cache.clearSoft();
		}
	}

	@Override
	public int count() {
		return definitionCount * -522945077;
	}

	@Override
	public D get(int id) {
		D definition;
		synchronized (cache) {
			definition = cache.get(id);
		}

		if (null != definition) {
			return definition;
		}

		definition = load(id);
		synchronized (cache) {
			cache.put(id, definition);
		}

		return definition;
	}

	@Override
	public Iterator<D> iterator() {
		return new LruDefinitionCacheIterator<D>(this);
	}

	public void resize(int capacity) {
		synchronized (cache) {
			cache.clear();
			cache = new ReferenceCache<D>(capacity);
		}
	}

	public void sweep(int maximumAge) {
		synchronized (cache) {
			cache.sweep(maximumAge);
		}
	}

	D load(int id) {
		byte[] data;
		synchronized (archive) {
			data = ConfigEntry.get(archive, config, id);
		}

		D definition = provider.provide(id, this);
		if (null != data) {
			definition.decode(new Buffer(data));
		}

		definition.method35();
		return definition;
	}

}