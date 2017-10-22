package com.jagex;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

public final class Class424 {
	public static final void method7063() {
		Class283.anImage3166 = null;
		Class203.aFont2127 = null;
	}

	Class434 type;
	Comparator comparator = new KeyValuePairComparator();
	PriorityQueue<KeyValuePair> anAbstractQueue_Sub1_4859;
	Map<Object, KeyValuePair> map;
	long timeOffset;
	PriorityQueue<KeyValuePair> anAbstractQueue_Sub1_4862;
	int capacity;

	public Class424(int capacity, Class434 class434) {
		this(-1L, capacity, class434);
	}

	Class424(long timeOffset, int capacity, Class434 type) {
		this.timeOffset = timeOffset * -679896978432469973L;
		this.capacity = capacity * 1321791289;
		this.type = type;

		if (-1 == -184201463 * this.capacity) {
			map = new HashMap(64);
			anAbstractQueue_Sub1_4859 = new PriorityQueue(64, comparator);
			anAbstractQueue_Sub1_4862 = null;
		} else {
			if (type == null) {
				throw new IllegalArgumentException("");
			}

			map = new HashMap<Object, KeyValuePair>(-184201463 * this.capacity);
			anAbstractQueue_Sub1_4859 = new PriorityQueue(this.capacity * -184201463, comparator);
			anAbstractQueue_Sub1_4862 = new PriorityQueue(this.capacity * -184201463);
		}
	}

	public Object get(Object key) {
		synchronized (this) {
			if (1940171500409211523L * timeOffset != -1L) {
				method7046();
			}

			KeyValuePair pair = map.get(key);
			if (pair == null) {
				return null;
			}

			method7049(pair, false);
			return pair.value;
		}
	}

	public Object put(Object key, Object value) {
		synchronized (this) {
			if (timeOffset * 1940171500409211523L != -1L) {
				method7046();
			}

			KeyValuePair pair = map.get(key);
			if (null != pair) {
				Object current = pair.value;
				pair.value = value;
				method7049(pair, false);
				return current;
			}

			if (hasSecondaryQueue() && map.size() == -184201463 * capacity) {
				KeyValuePair class440_5_ = anAbstractQueue_Sub1_4862.remove();
				map.remove(class440_5_.key);
				anAbstractQueue_Sub1_4859.remove(class440_5_);
			}

			KeyValuePair insertion = new KeyValuePair(key, value);
			map.put(key, insertion);
			method7049(insertion, true);
			return null;
		}
	}

	boolean hasSecondaryQueue() {
		return capacity * -184201463 != -1;
	}

	void method7046() {
		if (timeOffset * 1940171500409211523L == -1L) {
			throw new IllegalStateException("");
		}

		long change = System.currentTimeMillis() - timeOffset * 1940171500409211523L;
		while (!anAbstractQueue_Sub1_4859.isEmpty()) {
			KeyValuePair pair = anAbstractQueue_Sub1_4859.peek();

			if (3520321301416274265L * pair.updateTime < change) {
				map.remove(pair.key);
				anAbstractQueue_Sub1_4859.remove(pair);

				if (hasSecondaryQueue()) {
					anAbstractQueue_Sub1_4862.remove(pair);
				}
			} else {
				break;
			}
		}
	}

	void method7049(KeyValuePair pair, boolean bool) {
		if (!bool) {
			anAbstractQueue_Sub1_4859.remove(pair);

			if (hasSecondaryQueue() && !anAbstractQueue_Sub1_4862.remove(pair)) {
				throw new IllegalStateException("");
			}
		}

		pair.updateTime = System.currentTimeMillis() * 5576562292616023785L;
		if (hasSecondaryQueue()) {
			switch (type.value * 162804771) {
				case 0:
					pair.comparator += -7373401948021246659L;
					break;
				case 1:
					pair.comparator = -3546808533973629131L * pair.updateTime;
					break;
			}

			anAbstractQueue_Sub1_4862.add(pair);
		}

		anAbstractQueue_Sub1_4859.add(pair);
	}

}