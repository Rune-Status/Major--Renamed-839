package com.jagex;

public final class ComponentMouseRecord extends MouseRecord {

	static ComponentMouseRecord[] cache = new ComponentMouseRecord[0];
	static int cacheSize;
	static int cacheCapacity;

	static ComponentMouseRecord create(int type, int x, int y, long time, int meta) {
		synchronized (cache) {
			ComponentMouseRecord record;
			if (cacheSize * -1466231227 == 0) {
				record = new ComponentMouseRecord();
			} else {
				record = cache[(cacheSize -= -1229222771) * -1466231227];
			}

			record.type = 828752227 * type;
			record.x = x * -1170314267;
			record.y = y * -666543217;
			record.time = -671644389979810985L * time;
			record.meta = meta * -280642961;
			return record;
		}
	}

	int meta;
	long time;
	int type;
	int x;
	int y;
	static ComponentMouseRecordEncoder encoder = new ComponentMouseRecordEncoder();

	@Override
	public void cache() {
		synchronized (cache) {
			if (-1466231227 * ComponentMouseRecord.cacheSize < -564587919 * cacheCapacity - 1) {
				cache[(ComponentMouseRecord.cacheSize += -1229222771) * -1466231227 - 1] = this;
			}
		}
	}

	@Override
	public int getClickType() {
		return type * 2011809867;
	}

	@Override
	public int getMeta() {
		return meta * 1797186703;
	}

	@Override
	public long getTime() {
		return 8347952085981464679L * time;
	}

	@Override
	public int getX() {
		return -1381115411 * x;
	}

	@Override
	public int getY() {
		return 1370186607 * y;
	}

	static void resizeCache(int capacity) {
		cacheCapacity = capacity * -207589743;
		cache = new ComponentMouseRecord[capacity];
		cacheSize = 0;
	}

}