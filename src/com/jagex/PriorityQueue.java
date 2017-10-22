package com.jagex;

import java.util.AbstractQueue;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PriorityQueue<T> extends AbstractQueue<T> {
	static final void method17940(ScriptExecutionContext class613, int i) {
		int i_12_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_12_);
		Interface class221 = Class598.loadedInterfaces[i_12_ >> 16];
		Class490.method8471(class226, class221, class613, -1284192831);
	}

	Comparator comparator;
	Map map = new HashMap();
	int modCount = 0;
	PriorityQueueElement[] queue;
	int size;

	public PriorityQueue(int capacity) {
		this(capacity, null);
	}

	public PriorityQueue(int capacity, Comparator comparator) {
		queue = new PriorityQueueElement[capacity];
		this.comparator = comparator;
	}

	@Override
	public boolean contains(Object object) {
		return map.containsKey(object);
	}

	@Override
	public Iterator<T> iterator() {
		return new PriorityQueueIterator<T>(this);
	}

	@Override
	public boolean offer(T object) {
		if (map.containsKey(object)) {
			throw new IllegalArgumentException("");
		}

		modCount += -681092269;
		int index = size * 15691677;
		if (index >= queue.length) {
			grow();
		}

		size += 82939573;
		if (index == 0) {
			queue[0] = new PriorityQueueElement(object, 0);
			map.put(object, queue[0]);
		} else {
			queue[index] = new PriorityQueueElement(object, index);
			map.put(object, queue[index]);
			siftUp(index);
		}
		return true;
	}

	@Override
	public T peek() {
		if (0 == 15691677 * size) {
			return null;
		}

		return (T) queue[0].object;
	}

	@Override
	public T poll() {
		if (15691677 * size == 0) {
			return null;
		}

		modCount += -681092269;
		Object object = queue[0].object;
		map.remove(object);
		size -= 82939573;

		if (size * 15691677 == 0) {
			queue[15691677 * size] = null;
		} else {
			queue[0] = queue[size * 15691677];
			this.queue[0].index = 0;
			queue[size * 15691677] = null;
			siftDown(0);
		}

		return (T) object;
	}

	@Override
	public boolean remove(Object object) {
		PriorityQueueElement<T> element = (PriorityQueueElement<T>) map.remove(object);
		if (null == element) {
			return false;
		}

		modCount += -681092269;
		size -= 82939573;
		if (element.index * -238916653 == size * 15691677) {
			queue[size * 15691677] = null;
			return true;
		}

		PriorityQueueElement<T> moved = queue[size * 15691677];
		queue[15691677 * size] = null;
		queue[-238916653 * element.index] = moved;
		queue[element.index * -238916653].index = 1 * element.index;
		siftDown(element.index * -238916653);

		if (queue[element.index * -238916653] == moved) {
			siftUp(-238916653 * element.index);
		}

		return true;
	}

	@Override
	public int size() {
		return 15691677 * size;
	}

	@Override
	public Object[] toArray() {
		Object[] objects = super.toArray();
		if (null != comparator) {
			Arrays.sort(objects, comparator);
		} else {
			Arrays.sort(objects);
		}

		return objects;
	}

	void grow() {
		int size = (queue.length << 1) + 1;
		queue = Arrays.copyOf(queue, size);
	}

	void siftDown(int index) {
		PriorityQueueElement<T> element = queue[index];
		int moved;

		for (int half = size * 15691677 >>> 1; index < half; index = moved) {
			int leftIndex = 1 + (index << 1);
			PriorityQueueElement<T> left = queue[leftIndex];
			int rightIndex = (index << 1) + 2;
			PriorityQueueElement<T> right = queue[rightIndex];

			if (comparator != null) {
				if (rightIndex < 15691677 * size && comparator.compare(left.object, right.object) > 0) {
					moved = rightIndex;
				} else {
					moved = leftIndex;
				}
			} else if (rightIndex < size * 15691677 && ((Comparable) left.object).compareTo(right.object) > 0) {
				moved = rightIndex;
			} else {
				moved = leftIndex;
			}

			if (comparator != null) {
				if (comparator.compare(element.object, queue[moved].object) <= 0) {
					break;
				}
			} else if (((Comparable) element.object).compareTo(this.queue[moved].object) <= 0) {
				break;
			}

			queue[index] = queue[moved];
			queue[index].index = index * -769776549;
		}

		queue[index] = element;
		queue[index].index = index * -769776549;
	}

	void siftUp(int index) {
		PriorityQueueElement<T> element = queue[index];
		int parentIndex;

		for (; index > 0; index = parentIndex) {
			parentIndex = index - 1 >>> 1;
			PriorityQueueElement<T> parent = queue[parentIndex];

			if (comparator != null) {
				if (comparator.compare(element.object, parent.object) >= 0) {
					break;
				}
			} else if (((Comparable) element.object).compareTo(parent.object) >= 0) {
				break;
			}

			queue[index] = parent;
			queue[index].index = -769776549 * index;
		}

		queue[index] = element;
		queue[index].index = index * -769776549;
	}

}