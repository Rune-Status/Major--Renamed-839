package com.jagex;

public class HashableCache<T> {

	int capacity;
	Queue<HashableReference<T>> history = new Queue<HashableReference<T>>();
	int remaining;
	HashTable<HashableReference<T>> table;

	public HashableCache(int capacity) {
		this.capacity = capacity;
		remaining = capacity;

		int size;
		for (size = 1; size + size < capacity; size += size) {
			// computes the next power of 2
		}

		table = new HashTable<HashableReference<T>>(size);
	}

	public final void clear() {
		history.clear();
		table.clear();
		remaining = capacity;
	}

	public final void clearSoft() {
		for (HashableReference<T> reference = history.getFront(); reference != null; reference = history.next()) {
			if (reference.isSoft()) {
				reference.unlink();
				reference.uncache();
				remaining += reference.size;
			}
		}
	}

	public final T get(Hashable hashable) {
		long key = hashable.hash();

		for (HashableReference<T> reference = table.get(key); reference != null; reference = table.nextInBucket()) {
			if (reference.key.equals(hashable)) {
				T object = reference.get();

				if (object == null) {
					reference.unlink();
					reference.uncache();
					remaining += reference.size;
				} else {
					if (reference.isSoft()) {
						HardHashableReference<T> hard = new HardHashableReference<T>(hashable, reference.size, object);
						table.put(reference.linkedKey * -4821875126325281949L, hard);
						history.offer(hard);
						hard.cachedKey = 0L;

						reference.unlink();
						reference.uncache();
					} else {
						history.offer(reference);
						reference.cachedKey = 0L;
					}

					return object;
				}
			}
		}

		return null;
	}

	public final void put(T object, Hashable hashable) {
		put(hashable, 1, object);
	}

	public final void sweep(int maximumAge) {
		for (HashableReference reference = history.getFront(); reference != null; reference = history.next()) {
			if (reference.isSoft()) {
				if (reference.get() == null) {
					reference.unlink();
					reference.uncache();

					remaining += reference.size;
				}
			} else if ((reference.cachedKey += -4152461709571586419L) * -4988283294723658683L > maximumAge) {
				SoftHashableReference soft = new SoftHashableReference(reference.key, reference.size, reference.get());
				table.put(reference.linkedKey * -4821875126325281949L, soft);
				Cacheable.splice(soft, reference);

				reference.unlink();
				reference.uncache();
			}
		}
	}

	final void put(Hashable hashable, int size, T object) {
		if (size > capacity) {
			throw new IllegalStateException();
		}

		remove(hashable);
		remaining -= size;

		while (remaining < 0) {
			HashableReference<T> reference = history.poll();
			remove(reference);
		}

		HardHashableReference<T> reference = new HardHashableReference<T>(hashable, size, object);
		table.put(hashable.hash(), reference);
		history.offer(reference);
		reference.cachedKey = 0L;
	}

	final void remove(Hashable hashable) {
		long key = hashable.hash();
		for (HashableReference<T> reference = table.get(key); reference != null; reference = table.nextInBucket()) {
			if (reference.key.equals(hashable)) {
				remove(reference);
				break;
			}
		}
	}

	final void remove(HashableReference<T> reference) {
		if (reference != null) {
			reference.unlink();
			reference.uncache();
			remaining += reference.size;
		}
	}

}