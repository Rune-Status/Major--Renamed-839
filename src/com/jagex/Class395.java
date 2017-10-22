package com.jagex;

public final class Class395 {
	static Class395[] cache = new Class395[0];
	static int cacheCapacity;
	static int cached;

	public static Class395 copy(Class395 other) {
		synchronized (cache) {
			if (cached == 0) {
				return new Class395(other);
			}

			cache[--cached].copyFrom(other);
			return cache[cached];
		}
	}

	public static Class395 create() {
		synchronized (cache) {
			if (cached == 0) {
				return new Class395();
			}

			cache[--cached].reset();
			return cache[cached];
		}
	}

	public static final Class395 method6371(Class395 other) {
		Class395 class395_21_ = copy(other);
		class395_21_.method6379();
		return class395_21_;
	}

	public static void setCacheSize(int capacity) {
		cacheCapacity = capacity;
		cache = new Class395[capacity];
		cached = 0;
	}

	static Class395 create(float f, float f_0_, float f_1_, float f_2_) {
		synchronized (cache) {
			if (cached == 0) {
				return new Class395(f, f_0_, f_1_, f_2_);
			}

			cache[--cached].set(f, f_0_, f_1_, f_2_);
			return cache[cached];
		}
	}

	static final float distance(Class395 aClass395) {
		return (float) Math.sqrt(method6375(aClass395, aClass395));
	}

	static final float method6375(Class395 class395, Class395 class395_24_) {
		return class395.method6374(class395_24_);
	}

	static final Class395 method6378(Class395 class395, Class395 class395_26_) {
		Class395 class395_27_ = copy(class395);
		class395_27_.method6377(class395_26_);
		return class395_27_;
	}

	static final Class395 product(Class395 a, float scalar) {
		Class395 class395_20_ = copy(a);
		class395_20_.multiply(scalar);
		return class395_20_;
	}

	public float aFloat4513;
	public float aFloat4516;
	public float aFloat4517;
	public float aFloat4518;

	public Class395() {
		reset();
	}

	public Class395(Class395 class395_8_) {
		copyFrom(class395_8_);
	}

	public Class395(float f, float f_9_, float f_10_) {
		method6413(f, f_9_, f_10_);
	}

	public Class395(float f, float f_5_, float f_6_, float f_7_) {
		set(f, f_5_, f_6_, f_7_);
	}

	public void cache() {
		synchronized (cache) {
			if (cached < cacheCapacity - 1) {
				cache[cached++] = this;
			}
		}
	}

	public void copyFrom(Class395 other) {
		aFloat4516 = other.aFloat4516;
		aFloat4517 = other.aFloat4517;
		aFloat4513 = other.aFloat4513;
		aFloat4518 = other.aFloat4518;
	}

	public void decode(Buffer buffer) {
		aFloat4516 = buffer.readFloat();
		aFloat4517 = buffer.readFloat();
		aFloat4513 = buffer.readFloat();
		aFloat4518 = buffer.readFloat();
	}

	public void method6367(float f, float f_15_, float f_16_, float angle) {
		float sin = (float) Math.sin(angle * 0.5F);
		float cos = (float) Math.cos(angle * 0.5F);
		aFloat4516 = f * sin;
		aFloat4517 = f_15_ * sin;
		aFloat4513 = f_16_ * sin;
		aFloat4518 = cos;
	}

	public final void method6377(Class395 other) {
		set(other.aFloat4518 * aFloat4516 + other.aFloat4516 * aFloat4518 + other.aFloat4517 * aFloat4513
				- other.aFloat4513 * aFloat4517, other.aFloat4518 * aFloat4517 - other.aFloat4516 * aFloat4513
				+ other.aFloat4517 * aFloat4518 + other.aFloat4513 * aFloat4516, other.aFloat4518 * aFloat4513
				+ other.aFloat4516 * aFloat4517 - other.aFloat4517 * aFloat4516 + other.aFloat4513 * aFloat4518,
				other.aFloat4518 * aFloat4518 - other.aFloat4516 * aFloat4516 - other.aFloat4517 * aFloat4517
						- other.aFloat4513 * aFloat4513);
	}

	public final void method6379() {
		aFloat4516 = -aFloat4516;
		aFloat4517 = -aFloat4517;
		aFloat4513 = -aFloat4513;
	}

	public void method6380(Class397 class397, float f) {
		method6367(class397.x, class397.y, class397.z, f);
	}

	public final void method6381(Class395 class395_28_, float f) {
		if (method6374(class395_28_) < 0.0F) {
			method6366();
		}

		multiply(1.0F - f);
		Class395 class395_29_ = product(class395_28_, f);
		add(class395_29_);
		class395_29_.cache();
		method6412();
	}

	public final void method6412() {
		float f = 1.0F / distance(this);
		aFloat4516 *= f;
		aFloat4517 *= f;
		aFloat4513 *= f;
		aFloat4518 *= f;
	}

	public void method6413(float f, float f_30_, float f_31_) {
		method6367(0.0F, 1.0F, 0.0F, f);
		Class395 class395_32_ = create();
		class395_32_.method6367(1.0F, 0.0F, 0.0F, f_30_);
		method6377(class395_32_);
		class395_32_.method6367(0.0F, 0.0F, 1.0F, f_31_);
		method6377(class395_32_);
		class395_32_.cache();
	}

	@Override
	public String toString() {
		return new StringBuilder().append(aFloat4516).append(",").append(aFloat4517).append(",").append(aFloat4513)
				.append(",").append(aFloat4518).toString();
	}

	final void add(Class395 other) {
		aFloat4516 += other.aFloat4516;
		aFloat4517 += other.aFloat4517;
		aFloat4513 += other.aFloat4513;
		aFloat4518 += other.aFloat4518;
	}

	final void method6366() {
		aFloat4516 = -aFloat4516;
		aFloat4517 = -aFloat4517;
		aFloat4513 = -aFloat4513;
		aFloat4518 = -aFloat4518;
	}

	final float method6374(Class395 other) {
		return aFloat4516 * other.aFloat4516 + aFloat4517 * other.aFloat4517 + aFloat4513 * other.aFloat4513
				+ aFloat4518 * other.aFloat4518;
	}

	final void multiply(float scalar) {
		aFloat4516 *= scalar;
		aFloat4517 *= scalar;
		aFloat4513 *= scalar;
		aFloat4518 *= scalar;
	}

	final void reset() {
		aFloat4513 = 0.0F;
		aFloat4517 = 0.0F;
		aFloat4516 = 0.0F;
		aFloat4518 = 1.0F;
	}

	void set(float f, float f_11_, float f_12_, float f_13_) {
		aFloat4516 = f;
		aFloat4517 = f_11_;
		aFloat4513 = f_12_;
		aFloat4518 = f_13_;
	}

}