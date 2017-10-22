package com.jagex;

import java.util.Iterator;

public class HashTableIterator<T extends Linkable> implements Iterator<T> {
	static Player aClass600_Sub1_Sub3_Sub1_Sub1_8361;

	static final void method13669(Mob mob) {
		int i_0_ = mob.anInt11560 * -589638007 - Client.tick;
		int i_1_ = -1939636736 * mob.anInt11521 + mob.boundSize() * 256;
		int i_2_ = mob.anInt11523 * -1221436928 + mob.boundSize() * 256;
		Class397 class397 = mob.method10164().aClass397_4507;
		mob.method10170((int) class397.x + (i_1_ - (int) class397.x) / i_0_, (int) class397.y,
				(i_2_ - (int) class397.z) / i_0_ + (int) class397.z);
		mob.anInt11513 = 0;
		mob.turn(mob.anInt11501 * 1723039953);
	}

	static void method13671(int i) {
		if (-1955604939 * Class31.loginType == 156) {
			Class31.anInt429 = -1384596895 * i;
		} else if (203 == Class31.loginType * -1955604939) {
			Class31.anInt395 = 1410936033 * i;
		}
	}

	Linkable pointer;
	HashTable table;
	int index;
	Linkable previous = null;

	public HashTableIterator(HashTable table) {
		this.table = table;
		reset();
	}

	@Override
	public boolean hasNext() {
		if (pointer != table.buckets[867456899 * index - 1]) {
			return true;
		}

		while (index * 867456899 < table.size * -1373406603) {
			if (table.buckets[(index += -1353257173) * 867456899 - 1].next != table.buckets[index * 867456899 - 1]) {
				pointer = table.buckets[index * 867456899 - 1].next;
				return true;
			}

			pointer = table.buckets[867456899 * index - 1];
		}

		return false;
	}

	public Linkable first() {
		reset();
		return next();
	}

	@Override
	public T next() {
		if (table.buckets[867456899 * index - 1] != pointer) {
			Linkable linkable = pointer;
			pointer = linkable.next;
			previous = linkable;
			return (T) linkable;
		}

		while (867456899 * index < table.size * -1373406603) {
			Linkable linkable = table.buckets[(index += -1353257173) * 867456899 - 1].next;
			if (linkable != table.buckets[index * 867456899 - 1]) {
				pointer = linkable.next;
				previous = linkable;
				return (T) linkable;
			}
		}

		return null;
	}

	@Override
	public void remove() {
		if (previous == null) {
			throw new IllegalStateException();
		}

		previous.unlink();
		previous = null;
	}

	void reset() {
		pointer = table.buckets[0].next;
		index = -1353257173;
		previous = null;
	}

}