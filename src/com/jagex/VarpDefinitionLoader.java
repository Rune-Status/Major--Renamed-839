package com.jagex;

import java.util.Iterator;

public class VarpDefinitionLoader extends DefaultProvidingVarpLoader {
	static short aShort10931;

	public static final int method17297(int i, int i_3_, int i_4_) {
		if (i == -1) {
			return 12345678;
		}
		i_3_ = i_3_ * (i & 0x7f) >> 7;
		if (i_3_ < 2) {
			i_3_ = 2;
		} else if (i_3_ > 126) {
			i_3_ = 126;
		}
		return i_3_ + (i & 0xff80);
	}

	Archive archive;
	ReferenceCache<VarpDefinition> cache = new ReferenceCache<VarpDefinition>(64);

	public VarpDefinitionLoader(GameContext context, VarpType type, Language language, Archive archive) {
		super(context, type, language, archive != null ? archive.childSize(type.getConfig().entry * 1179768225) : 0);
		this.archive = archive;
	}

	@Override
	public Iterator iterator() {
		return new VarpLoaderIterator(this);
	}

	public void sweep(int maximumAge) {
		synchronized (cache) {
			cache.sweep(maximumAge);
		}
	}

	public void clear() {
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
		return super.count();
	}

	@Override
	public VarpDefinition get(int id) {
		VarpDefinition parameter;
		synchronized (cache) {
			parameter = cache.get(id);

			if (null == parameter) {
				parameter = load(id);
				cache.put(id, parameter);
			}
		}

		return parameter;
	}

	VarpDefinition load(int id) {
		byte[] data = archive.get(type.getConfig().entry * 1179768225, id);
		VarpDefinition parameter = new VarpDefinition(type, id);

		if (data != null) {
			parameter.decode(new Buffer(data));
		}

		return parameter;
	}

}