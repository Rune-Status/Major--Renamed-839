package com.jagex;

import java.util.Iterator;

public class PlayerVarpDefinitionLoader extends DefaultProvidingVarpLoader {
	Archive archive;
	ReferenceCache<PlayerVariableParameterDefinition> cache = new ReferenceCache<PlayerVariableParameterDefinition>(64);

	public PlayerVarpDefinitionLoader(GameContext context, VarpType type, Language language, Archive archive) {
		super(context, type, language, null != archive ? archive.childSize(type.getConfig().entry * 1179768225) : 0);
		this.archive = archive;
	}

	@Override
	public Iterator iterator() {
		return new PlayerVarpDefinitionIterator(this);
	}

	public void clear() {
		synchronized (cache) {
			cache.clear();
		}
	}

	public void sweep(int age) {
		synchronized (cache) {
			cache.sweep(age);
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
	public PlayerVariableParameterDefinition get(int id) {
		PlayerVariableParameterDefinition parameter;

		synchronized (cache) {
			parameter = cache.get(id);
			if (null == parameter) {
				parameter = load(id);
				cache.put(id, parameter);
			}
		}

		return parameter;
	}

	PlayerVariableParameterDefinition load(int id) {
		byte[] data = archive.get(type.getConfig().entry * 1179768225, id);
		PlayerVariableParameterDefinition parameter = new PlayerVariableParameterDefinition(type, id);

		if (null != data) {
			parameter.decode(new Buffer(data));
		}

		return parameter;
	}

}