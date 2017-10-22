package com.jagex;

import java.io.File;
import java.io.IOException;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class PriorityQueueIterator<T> implements Iterator<T> {

	public static DiskFile getPreferences(String string, String game, boolean bool) {
		File file = new File(Class637.aFile8136, "preferences" + string + ".dat");

		if (file.exists()) {
			try {
				return new DiskFile(file, "rw", 10000L);
			} catch (IOException ex) {
			}
		}

		String suffix = "";
		if (33 == Engine.anInt6495 * -1397469519) {
			suffix = "_rc";
		} else if (34 == Engine.anInt6495 * -1397469519) {
			suffix = "_wip";
		}

		File file_3_ = new File(Class60.USER_HOME, "jagex_" + game + "_preferences" + string + suffix + ".dat");
		if (!bool && file_3_.exists()) {
			try {
				return new DiskFile(file_3_, "rw", 10000L);
			} catch (IOException ex) {
			}
		}

		try {
			return new DiskFile(file, "rw", 10000L);
		} catch (IOException ioexception) {
			throw new RuntimeException();
		}
	}

	public static Class326 method6069(int i) {
		if (Class593.aClass343_7835 != null) {
			return Class593.aClass343_7835.method5888().method5845(i);
		}
		return null;
	}

	int modCount;
	int current = 0;
	PriorityQueue<T> queue;

	PriorityQueueIterator(PriorityQueue<T> queue) {
		modCount = this.queue.modCount * -162009997;
		this.queue = queue;
	}

	@Override
	public boolean hasNext() {
		return current * -1823910329 < 15691677 * this.queue.size;
	}

	@Override
	public T next() {
		if (this.queue.modCount * 1230741723 != modCount * 465733625) {
			throw new ConcurrentModificationException();
		}

		if (current * -1823910329 < 15691677 * queue.size) {
			Object object = this.queue.queue[current * -1823910329].object;
			current += -937331849;
			return (T) object;
		}

		throw new NoSuchElementException();
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}