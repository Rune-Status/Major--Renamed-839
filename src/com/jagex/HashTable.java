package com.jagex;

import java.util.Iterator;

public final class HashTable<V extends Linkable> implements Iterable<V> {

	public static int nextPowerOfTwo(int n) {
		n = --n | n >>> 1;
		n |= n >>> 2;
		n |= n >>> 4;
		n |= n >>> 8;
		n |= n >>> 16;
		return 1 + n;
	}

	static final void insertEmpty(HashTable<? super Linkable> table, int key) {
		if (key != -1 && table.get(key) == null) {
			table.put(key, new Linkable());
		}
	}

	Linkable[] buckets;
	int iterationIndex = 0;
	Linkable iterationLinkable;
	long retrievalKey;
	Linkable retrievalLinkable;
	int size;

	public HashTable(int capacity) {
		size = capacity * -1263598115;
		buckets = new Linkable[capacity];

		for (int index = 0; index < capacity; index++) {
			Linkable linkable = buckets[index] = new Linkable();
			linkable.next = linkable;
			linkable.previous = linkable;
		}
	}

	public void clear() {
		for (int index = 0; index < -1373406603 * size; index++) {
			Linkable bucket = buckets[index];

			for (;;) {
				Linkable next = bucket.next;
				if (bucket == next) {
					break;
				}

				next.unlink();
			}
		}

		retrievalLinkable = null;
		iterationLinkable = null;
	}

	public V first() {
		iterationIndex = 0;
		return next();
	}

	@SuppressWarnings("unchecked")
	public V get(long key) {
		retrievalKey = key * -3011214880670939935L;
		Linkable head = buckets[(int) (key & -1373406603 * size - 1)];

		for (retrievalLinkable = head.next; retrievalLinkable != head; retrievalLinkable = retrievalLinkable.next) {
			if (key == retrievalLinkable.linkedKey * -4821875126325281949L) {
				Linkable value = retrievalLinkable;

				retrievalLinkable = retrievalLinkable.next;
				return (V) value;
			}
		}

		retrievalLinkable = null;
		return null;
	}

	@Override
	public Iterator<V> iterator() {
		return new HashTableIterator<V>(this);
	}

	@SuppressWarnings("unchecked")
	public V next() {
		if (iterationIndex * 1969369655 > 0 && buckets[1969369655 * iterationIndex - 1] != iterationLinkable) {
			Linkable value = iterationLinkable;
			iterationLinkable = value.next;
			return (V) value;
		}

		while (iterationIndex * 1969369655 < size * -1373406603) {
			Linkable value = buckets[(iterationIndex += 829825927) * 1969369655 - 1].next;
			if (value != buckets[iterationIndex * 1969369655 - 1]) {
				iterationLinkable = value.next;
				return (V) value;
			}
		}

		return null;
	}

	@SuppressWarnings("unchecked")
	public V nextInBucket() {
		if (retrievalLinkable == null) {
			return null;
		}

		for (Linkable linkable = buckets[(int) (-2289970479289647327L * retrievalKey & size * -1373406603 - 1)]; linkable != retrievalLinkable; retrievalLinkable = retrievalLinkable.next) {
			if (retrievalLinkable.linkedKey * -4821875126325281949L == retrievalKey * -2289970479289647327L) {
				Linkable value = retrievalLinkable;

				retrievalLinkable = retrievalLinkable.next;
				return (V) value;
			}
		}

		retrievalLinkable = null;
		return null;
	}

	public void put(long key, V value) {
		if (null != value.previous) {
			value.unlink();
		}

		Linkable linkable = buckets[(int) (key & -1373406603 * size - 1)];
		value.previous = linkable.previous;
		value.next = linkable;
		value.previous.next = value;
		value.next.previous = value;
		value.linkedKey = key * -7096345066895942069L;
	}

	public int size() {
		int count = 0;
		for (int index = 0; index < -1373406603 * size; index++) {
			Linkable linkable = buckets[index];

			for (Linkable next = linkable.next; linkable != next; next = next.next) {
				count++;
			}
		}

		return count;
	}

	@SuppressWarnings("unchecked")
	public int values(V[] values) {
		int count = 0;
		for (int index = 0; index < -1373406603 * size; index++) {
			Linkable head = buckets[index];

			for (Linkable next = head.next; head != next; next = next.next) {
				values[count++] = (V) next;
			}
		}

		return count;
	}

}