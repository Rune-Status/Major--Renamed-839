package com.jagex;

import java.util.Iterator;

public class DequeIterator<T extends Linkable> implements Iterator<T> {
	public static Archive worldMapInfo;
	public static Archive images;

	static final void method13363(ScriptExecutionContext class613) {
		class613.anInt7924 -= -926911801;
		if (Class369.aClass261_Sub1_4079.method4836() != Class257.aClass257_2850) {
			throw new RuntimeException();
		}
		((Class642_Sub1) Class369.aClass261_Sub1_4079.method4834()).method16691(
				class613.anIntArray7942[1841827045 * class613.anInt7924],
				class613.anIntArray7942[1 + 1841827045 * class613.anInt7924],
				class613.anIntArray7942[2 + 1841827045 * class613.anInt7924], 538692304);
	}

	static final void method13364(Widget class226, Interface class221, ScriptExecutionContext class613) {
		class226.aBool2520 = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045] == 1;
		Widget.redraw(class226);
	}

	Linkable current;
	Deque deque;
	Linkable previous = null;

	public DequeIterator(Deque<T> deque) {
		this.deque = deque;
		current = deque.tail.next;
	}

	public Linkable front() {
		reset();
		return next();
	}

	@Override
	public boolean hasNext() {
		return deque.tail != current;
	}

	@Override
	public T next() {
		Linkable linkable = current;
		if (deque.tail == linkable) {
			linkable = null;
			current = null;
		} else {
			current = linkable.next;
		}

		previous = linkable;
		return (T) linkable;
	}

	@Override
	public void remove() {
		if (null == previous) {
			throw new IllegalStateException();
		}

		previous.unlink();
		previous = null;
	}

	public void setDeque(Deque<T> deque) {
		this.deque = deque;
		current = deque.tail.next;
		previous = null;
	}

	void reset() {
		current = deque.tail.next;
		previous = null;
	}

}