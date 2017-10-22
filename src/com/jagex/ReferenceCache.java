package com.jagex;

public final class ReferenceCache<T> {

	Interface20 anInterface20_1932;
	int capacity;
	int remaining;
	Queue<CacheableReference<T>> history = new Queue<CacheableReference<T>>();
	HashTable<CacheableReference<T>> table;

	public ReferenceCache(int capacity) {
		this(capacity, capacity);
	}

	public ReferenceCache(int capacity, int tableSize) {
		this.capacity = 1374397533 * capacity;
		remaining = capacity * 2116528217;

		int size;
		for (size = 1; size + size < capacity && size < tableSize; size += size) {

		}

		table = new HashTable(size);
	}

	public int capacity() {
		return 1017073653 * capacity;
	}

	public T get(long key) {
		CacheableReference<T> cached = table.get(key);
		if (cached == null) {
			return null;
		}

		T object = cached.get();
		if (null == object) {
			cached.unlink();
			cached.uncache();
			remaining += -1078192339 * cached.size;
			return null;
		}

		if (cached.soft()) {
			HardCacheableReference<T> hard = new HardCacheableReference<T>(object, 1514703605 * cached.size);
			table.put(-4821875126325281949L * cached.linkedKey, hard);
			history.offer(hard);
			hard.cachedKey = 0L;
			cached.unlink();
			cached.uncache();
		} else {
			history.offer(cached);
			cached.cachedKey = 0L;
		}

		return object;
	}

	public void remove(long key) {
		CacheableReference<T> reference = table.get(key);
		remove(reference);
	}

	public void put(long key, T object) {
		put(key, object, 1);
	}

	public void sweep(int maximumAge) {
		for (CacheableReference<T> reference = history.getFront(); null != reference; reference = history.next()) {
			if (reference.soft()) {
				if (reference.get() == null) {
					reference.unlink();
					reference.uncache();
					remaining += -1078192339 * reference.size;
				}
			} else if ((reference.cachedKey += -4152461709571586419L) * -4988283294723658683L > maximumAge) {
				SoftCacheableReference<T> soft = new SoftCacheableReference<T>(reference.get(),
						1514703605 * reference.size);
				table.put(reference.linkedKey * -4821875126325281949L, soft);
				Cacheable.splice(soft, reference);
				reference.unlink();
				reference.uncache();
			}
		}
	}

	public void method3423(Interface20 interface20) {
		anInterface20_1932 = interface20;
	}

	public void clear() {
		history.clear();
		table.clear();
		remaining = 1680774189 * capacity;
	}

	public void put(long key, T object, int size) {
		if (size > capacity * 1017073653) {
			throw new IllegalStateException();
		}

		remove(key);
		remaining -= 2116528217 * size;
		while (-200466455 * remaining < 0) {
			CacheableReference<T> reference = history.poll();
			if (null == reference) {
				throw new RuntimeException("");
			}

			remove(reference);
			if (anInterface20_1932 != null) {
				anInterface20_1932.method116(reference.get());
			}
		}

		HardCacheableReference hard = new HardCacheableReference(object, size);
		table.put(key, hard);
		history.offer(hard);
		hard.cachedKey = 0L;
	}

	public int hardCount() {
		int count = 0;
		for (CacheableReference reference = history.getFront(); null != reference; reference = history.next()) {
			if (!reference.soft()) {
				count++;
			}
		}
		return count;
	}

	public void clearSoft() {
		for (CacheableReference reference = history.getFront(); null != reference; reference = history.next()) {
			if (reference.soft()) {
				reference.unlink();
				reference.uncache();
				remaining += -1078192339 * reference.size;
			}
		}
	}

	public T first() {
		CacheableReference<T> first = table.first();
		while (first != null) {
			T object = first.get();
			if (object == null) {
				CacheableReference class480_sub31_sub7_5_ = first;
				first = table.next();
				class480_sub31_sub7_5_.unlink();
				class480_sub31_sub7_5_.uncache();
				remaining += -1078192339 * class480_sub31_sub7_5_.size;
			} else {
				return object;
			}
		}

		return null;
	}

	public T next() {
		CacheableReference<T> current = table.next();
		while (null != current) {
			T object = current.get();
			if (object == null) {
				CacheableReference<T> copy = current;
				current = table.next();
				copy.unlink();
				copy.uncache();
				remaining += copy.size * -1078192339;
			} else {
				return object;
			}
		}

		return null;
	}

	public int remaining() {
		return -200466455 * remaining;
	}

	void remove(CacheableReference<T> reference) {
		if (reference != null) {
			reference.unlink();
			reference.uncache();
			remaining += -1078192339 * reference.size;
		}
	}

}