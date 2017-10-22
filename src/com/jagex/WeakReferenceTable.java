package com.jagex;

import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

public final class WeakReferenceTable {

	public static Sprite[] nameIcons;
	public static Class678_Sub12 aClass678_Sub12_558;
	static int anInt559;

	static void method1091(int i, int i_13_, int i_14_, boolean bool, int i_15_, boolean bool_16_) {
		if (i < i_13_) {
			int i_18_ = (i_13_ + i) / 2;
			int i_19_ = i;

			Class562_Sub1 class562_sub1 = Class671.aClass562_Sub1Array8455[i_18_];
			Class671.aClass562_Sub1Array8455[i_18_] = Class671.aClass562_Sub1Array8455[i_13_];
			Class671.aClass562_Sub1Array8455[i_13_] = class562_sub1;

			for (int i_20_ = i; i_20_ < i_13_; i_20_++) {
				if (SpawnObjectCutsceneAction.method15148(Class671.aClass562_Sub1Array8455[i_20_], class562_sub1, i_14_, bool,
						i_15_, bool_16_, -1994505823) <= 0) {
					Class562_Sub1 class562_sub1_21_ = Class671.aClass562_Sub1Array8455[i_20_];
					Class671.aClass562_Sub1Array8455[i_20_] = Class671.aClass562_Sub1Array8455[i_19_];
					Class671.aClass562_Sub1Array8455[i_19_++] = class562_sub1_21_;
				}
			}

			Class671.aClass562_Sub1Array8455[i_13_] = Class671.aClass562_Sub1Array8455[i_19_];
			Class671.aClass562_Sub1Array8455[i_19_] = class562_sub1;
			method1091(i, i_19_ - 1, i_14_, bool, i_15_, bool_16_);
			method1091(1 + i_19_, i_13_, i_14_, bool, i_15_, bool_16_);
		}
	}

	ReferenceQueue<LinkedWeakReference> queue = new ReferenceQueue<LinkedWeakReference>();
	int size;

	LinkedWeakReference[] table = new LinkedWeakReference[16];

	public void add(Object object) {
		if (object == null) {
			throw new NullPointerException();
		}

		flush();
		int code = System.identityHashCode(object);
		int index = code & table.length - 1;
		LinkedWeakReference current = table[index];

		if (current == null) {
			table[index] = new LinkedWeakReference(object, queue, code);
			size += 413895159;

			if (-2068969529 * size >= table.length) {
				method1080();
			}
		} else {
			for (; current.get() != object; current = current.next) {
				if (current.next == null) {
					current.next = new LinkedWeakReference(object, queue, code);
					size += 413895159;

					if (-2068969529 * size >= table.length) {
						method1080();
					}

					break;
				}
			}
		}
	}

	public void remove(Object object) {
		if (object == null) {
			throw new NullPointerException();
		}

		flush();
		int code = System.identityHashCode(object);
		int index = code & table.length - 1;

		LinkedWeakReference current = table[index];
		if (null != current) {
			if (current.get() == object) {
				table[index] = current.next;

				size -= 413895159;
			} else {
				for (;;) {
					LinkedWeakReference next = current.next;
					if (next == null) {
						break;
					}

					if (next.get() == object) {
						current.next = next.next;
						size -= 413895159;
						break;
					}

					current = next;
				}
			}
		}
	}

	public ArrayList<Object> toList() {
		flush();
		ArrayList<Object> list = new ArrayList<Object>(-2068969529 * size);

		for (LinkedWeakReference reference : table) {
			for (LinkedWeakReference next = reference; next != null; next = next.next) {
				Object object = next.get();

				if (object != null) {
					list.add(object);
				}
			}
		}

		return list;
	}

	void flush() {
		for (;;) {
			LinkedWeakReference head = (LinkedWeakReference) queue.poll();
			if (head == null) {
				break;
			}

			int index = 159225745 * head.hashcode & table.length - 1;
			LinkedWeakReference reference = table[index];

			if (reference == head) {
				table[index] = head.next;
				size -= 413895159;
			} else {
				for (; reference != null && head != reference.next; reference = reference.next) {

				}

				if (reference != null) {
					reference.next = head.next;
					size -= 413895159;
				}
			}
		}
	}

	void method1080() {
		LinkedWeakReference[] old = table;
		table = new LinkedWeakReference[old.length * 2];

		for (LinkedWeakReference element : old) {
			LinkedWeakReference next;

			for (LinkedWeakReference reference = element; null != reference; reference = next) {
				next = reference.next;
				int index = reference.hashcode * 159225745 & table.length - 1;

				reference.next = table[index];
				table[index] = reference;
			}
		}
	}

}