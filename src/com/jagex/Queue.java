package com.jagex;

import java.util.Iterator;

public class Queue<T extends Cacheable> implements Iterable {
	public static Class678_Sub8 aClass678_Sub8_8139;

	public static int method13190(int i, int i_2_, short i_3_) {
		int i_4_ = 0;
		for (; i_2_ > 0; i_2_--) {
			i_4_ = i_4_ << 1 | i & 0x1;
			i >>>= 1;
		}
		return i_4_;
	}

	public static int method13192(CharSequence charsequence) {
		int i_16_ = charsequence.length();
		int i_17_ = 0;
		for (int i_18_ = 0; i_18_ < i_16_; i_18_++) {
			i_17_ = (i_17_ << 5) - i_17_ + charsequence.charAt(i_18_);
		}
		return i_17_;
	}

	public Cacheable tail = new Cacheable();
	Cacheable current;

	public Queue() {
		tail.nextCacheable = tail;
		tail.previousCacheable = tail;
	}

	@Override
	public Iterator iterator() {
		return new QueueIterator(this);
	}


	public T next() {
		Cacheable cacheable = current;
		if (tail == cacheable) {
			current = null;
			return null;
		}

		current = cacheable.nextCacheable;
		return (T) cacheable;
	}
	public int size() {
		int size = 0;
		for (Cacheable cacheable = tail.nextCacheable; cacheable != tail; cacheable = cacheable.nextCacheable) {
			size++;
		}
		return size;
	}
	public void clear() {
		while (tail != tail.nextCacheable) {
			tail.nextCacheable.uncache();
		}
	}
	public void offer(Cacheable cacheable) {
		if (null != cacheable.previousCacheable) {
			cacheable.uncache();
		}

		cacheable.previousCacheable = tail.previousCacheable;
		cacheable.nextCacheable = tail;
		cacheable.previousCacheable.nextCacheable = cacheable;
		cacheable.nextCacheable.previousCacheable = cacheable;
	}
	public T poll() {
		Cacheable next = tail.nextCacheable;
		if (next == tail) {
			return null;
		}

		next.uncache();
		return (T) next;
	}
	public T getFront() {
		Cacheable front = tail.nextCacheable;

		if (tail == front) {
			current = null;
			return null;
		}

		current = front.nextCacheable;
		return (T) front;
	}

}