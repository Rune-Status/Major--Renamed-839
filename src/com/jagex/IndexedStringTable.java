package com.jagex;

public class IndexedStringTable {

	StringHashFunction hasher;
	IndexedString[] strings;
	HashTable<IndexedString> table;

	public IndexedStringTable(int capacity, StringHashFunction hasher) {
		int size;
		for (size = 1; size < capacity; size += size) {

		}

		table = new HashTable<IndexedString>(size);
		strings = new IndexedString[size];
		this.hasher = hasher;
	}

	public IndexedString indexOf(int index) {
		if (index >= strings.length) {
			return null;
		}

		return strings[index];
	}

	public void put(int index, String string, IndexedString indexed) {
		IndexedString current = valueOf(string);
		if (null != current && index != current.index * -1366862679) {
			throw new IllegalArgumentException(string);
		}

		remove(index);
		if (index >= strings.length) {
			int size;
			for (size = strings.length; index >= size; size += size) {

			}

			table = new HashTable(size);
			for (IndexedString existing : strings) {
				if (null != existing) {
					table.put(existing.linkedKey * -4821875126325281949L, existing);
				}
			}

			IndexedString[] strings = new IndexedString[size];

			for (int i = 0; i < this.strings.length; i++) {
				strings[i] = this.strings[i];
			}

			this.strings = strings;
		}

		indexed.index = 1119129497 * index;
		indexed.value = string;
		table.put(hasher.hash(string), indexed);
		strings[index] = indexed;
	}

	public IndexedString valueOf(String string) {
		long hash = hasher.hash(string);

		for (IndexedString next = table.get(hash); null != next; next = table.nextInBucket()) {
			if (next.value.equals(string)) {
				return next;
			}
		}

		return null;
	}

	void remove(int index) {
		IndexedString element = indexOf(index);
		if (null != element) {
			element.unlink();
			strings[-1366862679 * element.index] = null;
		}
	}

}