package com.jagex;

public final class Cache {
	int capacity;
	private Cacheable empty = new Cacheable();
	Queue history = new Queue();
	HashTable table;
	int unused;

	public Cache(int capacity) {
		this.capacity = capacity * 571978505;
		unused = 803413739 * capacity;

		int size;
		for (size = 1; size + size < capacity; size += size) {
			// computes the next power of 2
		}

		table = new HashTable(size);
	}

	public void clear() {
		history.clear();
		table.clear();
		empty = new Cacheable();
		unused = 1672035155 * capacity;
	}

	public Cacheable get(long key) {
		Cacheable cacheable = (Cacheable) table.get(key);
		if (null != cacheable) {
			history.offer(cacheable);
		}

		return cacheable;
	}

	public void put(long key, Cacheable value) {
		if (978295235 * unused == 0) {
			Cacheable head = history.poll();
			head.unlink();
			head.uncache();

			if (head == empty) {
				head = history.poll();
				head.unlink();
				head.uncache();
			}
		} else {
			unused -= 803413739;
		}

		table.put(key, value);
		history.offer(value);
	}

}