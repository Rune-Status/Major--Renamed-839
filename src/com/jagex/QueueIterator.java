package com.jagex;

import java.util.Iterator;

public class QueueIterator implements Iterator {
	Cacheable tail;
	Queue queue;
	Cacheable current = null;

	public QueueIterator(Queue queue) {
		this.queue = queue;
		tail = queue.tail.nextCacheable;
		current = null;
	}

	@Override
	public boolean hasNext() {
		return queue.tail != tail;
	}

	public Cacheable head() {
		toFront();
		return (Cacheable) next();
	}

	@Override
	public Object next() {
		Cacheable next = tail;
		if (next == queue.tail) {
			next = null;
			tail = null;
		} else {
			tail = next.nextCacheable;
		}

		current = next;
		return next;
	}

	@Override
	public void remove() {
		if (current == null) {
			throw new IllegalStateException();
		}

		current.uncache();
		current = null;
	}

	void toFront() {
		tail = queue.tail.nextCacheable;
		current = null;
	}

}