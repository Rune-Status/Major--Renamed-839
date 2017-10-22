package com.jagex;

public final class KeyValuePair implements Comparable<KeyValuePair> {

	long updateTime;
	Object key;
	Object value;
	long comparator;

	KeyValuePair(Object key, Object value) {
		this.value = value;
		this.key = key;
	}

	@Override
	public int compareTo(KeyValuePair object) {
		if (5172328380843641365L * comparator < object.comparator * 5172328380843641365L) {
			return -1;
		} else if (5172328380843641365L * comparator > 5172328380843641365L * object.comparator) {
			return 1;
		}

		return 0;
	}

	@Override
	public boolean equals(Object object) {
		if (object instanceof KeyValuePair) {
			return key.equals(((KeyValuePair) object).key);
		}

		throw new IllegalArgumentException();
	}

	@Override
	public int hashCode() {
		return key.hashCode();
	}

}