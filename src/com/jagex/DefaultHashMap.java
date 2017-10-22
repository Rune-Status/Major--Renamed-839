package com.jagex;

import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class DefaultHashMap implements DefaultMap {

	DefaultValueProvider provider;
	Map<Integer, DefaultMapEntry> map;

	public DefaultHashMap(DefaultValueProvider provider) {
		this.provider = provider;
	}

	@Override
	public void clear() {
		if (map != null) {
			map.clear();
		}
	}

	@Override
	public int getOrDefaultInt(int key) {
		if (map != null) {
			DefaultMapEntry class383 = map.get(key);
			if (class383 != null) {
				return ((Integer) class383.value).intValue();
			}
		}

		return (Integer) provider.getDefaultValue(key);
	}

	@Override
	public long getOrDefaultLong(int key) {
		if (map != null) {
			DefaultMapEntry class383 = map.get(Integer.valueOf(key));
			if (null != class383) {
				return (Long) class383.value;
			}
		}

		return (Long) provider.getDefaultValue(key);
	}

	@Override
	public Object getOrDefaultObject(int key) {
		if (null != map) {
			DefaultMapEntry class383 = map.get(key);
			if (null != class383) {
				return class383.value;
			}
		}

		return provider.getDefaultValue(key);
	}

	@Override
	public Iterator<DefaultMapEntry> iterator() {
		if (map == null) {
			return Collections.<DefaultMapEntry> emptyList().iterator();
		}

		return map.values().iterator();
	}

	@Override
	public void put(int key, int value) {
		if (map == null) {
			map = new HashMap();
			map.put(key, new DefaultMapEntry(key, value));
		} else {
			DefaultMapEntry class383 = map.get(key);
			if (null == class383) {
				map.put(Integer.valueOf(key), new DefaultMapEntry(key, value));
			} else {
				class383.value = value;
			}
		}
	}

	@Override
	public void put(int key, long value) {
		if (map == null) {
			map = new HashMap();
			map.put(key, new DefaultMapEntry(key, value));
		} else {
			DefaultMapEntry class383 = map.get(key);
			if (null == class383) {
				map.put(key, new DefaultMapEntry(key, value));
			} else {
				class383.value = value;
			}
		}
	}

	@Override
	public void put(int key, Object object) {
		if (map == null) {
			map = new HashMap();
			map.put(key, new DefaultMapEntry(key, object));
		} else {
			DefaultMapEntry class383 = map.get(key);
			if (null == class383) {
				map.put(key, new DefaultMapEntry(key, object));
			} else {
				class383.value = object;
			}
		}
	}

	@Override
	public void remove(int key) {
		if (map != null) {
			map.remove(key);
		}
	}

}