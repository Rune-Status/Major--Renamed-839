package com.jagex;

public class Cacheable extends Linkable {

	public long cachedKey;
	public Cacheable nextCacheable;
	public Cacheable previousCacheable;

	public void uncache() {
		if (null != previousCacheable) {
			previousCacheable.nextCacheable = nextCacheable;
			nextCacheable.previousCacheable = previousCacheable;
			nextCacheable = null;
			previousCacheable = null;
		}
	}

	public static void insertBefore(Cacheable class480_sub31, Cacheable class480_sub31_4_) {
		if (null != class480_sub31.previousCacheable) {
			class480_sub31.uncache();
		}
		class480_sub31.previousCacheable = class480_sub31_4_.previousCacheable;
		class480_sub31.nextCacheable = class480_sub31_4_;
		class480_sub31.previousCacheable.nextCacheable = class480_sub31;
		class480_sub31.nextCacheable.previousCacheable = class480_sub31;
	}

	public static void splice(Cacheable insert, Cacheable target) {
		if (insert.previousCacheable != null) {
			insert.uncache();
		}

		insert.previousCacheable = target;
		insert.nextCacheable = target.nextCacheable;
		insert.previousCacheable.nextCacheable = insert;
		insert.nextCacheable.previousCacheable = insert;
	}
}
