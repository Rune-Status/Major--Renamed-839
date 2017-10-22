package com.jagex;

public class Class397 {
	static Class397[] cache = new Class397[0];
	static int cacheCapacity;
	static int cached;

	public static Class397 copyOf(Class397 class397) {
		synchronized (cache) {
			if (cached == 0) {
				return new Class397(class397);
			}

			cache[--cached].copyFrom(class397);
			return cache[cached];
		}
	}

	public static Class397 create(float x, float z, float y) {
		synchronized (cache) {
			if (cached == 0) {
				return new Class397(x, z, y);
			}

			cache[--cached].set(x, z, y);
			return cache[cached];
		}
	}

	public static final Class397 difference(Class397 a, Class397 b) {
		Class397 difference = copyOf(a);
		difference.subtract(b);
		return difference;
	}

	public static Class397 empty() {
		synchronized (cache) {
			if (cached == 0) {
				return new Class397();
			}

			cache[--cached].reset();
			return cache[cached];
		}
	}

	public static Class397 from(Buffer buffer) {
		synchronized (cache) {
			if (cached == 0) {
				return new Class397(buffer);
			}

			cache[--cached].decode(buffer);
			return cache[cached];
		}
	}

	public static final float method6452(Class397 class397, Class397 class397_12_) {
		return class397.method6488(class397_12_);
	}

	public static final Class397 method6454(Class397 class397, Class397 class397_14_) {
		Class397 class397_15_ = copyOf(class397);
		class397_15_.method6453(class397_14_);
		return class397_15_;
	}

	public static final Class397 product(Class397 a, Class397 b) {
		Class397 product = copyOf(a);
		product.multiply(b);
		return product;
	}

	public static final Class397 product(Class397 a, float scalar) {
		Class397 product = copyOf(a);
		product.multiply(scalar);
		return product;
	}

	public static final Class397 quotient(Class397 a, Class397 b) {
		Class397 quotient = copyOf(a);
		quotient.divide(b);
		return quotient;
	}

	public static void resizeCache(int capacity) {
		cacheCapacity = capacity;
		cache = new Class397[capacity];
		cached = 0;
	}

	public static final Class397 sum(Class397 a, Class397 b) {
		Class397 sum = copyOf(a);
		sum.add(b);
		return sum;
	}

	public float x;
	public float z;
	public float y;

	public Class397() {

	}

	public Class397(Class397 other) {
		x = other.x;
		y = other.y;
		z = other.z;
	}

	public Class397(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	Class397(Buffer buffer) {
		x = buffer.readFloat();
		y = buffer.readFloat();
		z = buffer.readFloat();
	}

	public final void abs() {
		if (x < 0.0F) {
			x *= -1.0F;
		}

		if (y < 0.0F) {
			y *= -1.0F;
		}

		if (z < 0.0F) {
			z *= -1.0F;
		}
	}

	public final void add(Class397 other) {
		x += other.x;
		y += other.y;
		z += other.z;
	}

	public void cache() {
		synchronized (cache) {
			if (cached < cacheCapacity - 1) {
				cache[cached++] = this;
			}
		}
	}

	public void copyFrom(Class397 other) {
		set(other.x, other.y, other.z);
	}

	public void decode(Buffer buffer) {
		x = buffer.readFloat();
		y = buffer.readFloat();
		z = buffer.readFloat();
	}

	public final void divide(float scalar) {
		x /= scalar;
		y /= scalar;
		z /= scalar;
	}

	public boolean equals(Class397 other) {
		return x == other.x && y == other.y && z == other.z;
	}

	public final void invert() {
		x = -x;
		y = -y;
		z = -z;
	}

	public final float distance() {
		return (float) Math.sqrt(x * x + y * y + z * z);
	}

	public final void method6446() {
		float f = 1.0F / distance();
		x *= f;
		y *= f;
		z *= f;
	}

	public final void method6448(Class397 other, float scalar) {
		x += other.x * scalar;
		y += other.y * scalar;
		z += other.z * scalar;
	}

	public final void method6465(Class405 class405) {
		float x = this.x;
		float y = this.y;

		this.x = class405.aFloat4556 * x + class405.aFloat4564 * y + class405.aFloat4559 * z + class405.aFloat4565;
		this.y = class405.aFloat4562 * x + class405.aFloat4560 * y + class405.aFloat4555 * z + class405.aFloat4566;
		z = class405.aFloat4558 * x + class405.aFloat4561 * y + class405.aFloat4557 * z + class405.aFloat4567;
	}

	public final void method6466(Class405 class405) {
		float x = this.x;
		float y = this.y;

		this.x = class405.aFloat4556 * x + class405.aFloat4564 * y + class405.aFloat4559 * z;
		this.y = class405.aFloat4562 * x + class405.aFloat4560 * y + class405.aFloat4555 * z;
		z = class405.aFloat4558 * x + class405.aFloat4561 * y + class405.aFloat4557 * z;
	}

	public final void method6467(Class397 other, float scalar) {
		multiply(1.0F - scalar);
		add(product(other, scalar));
	}

	public final void method6480(Class395 class395) {
		Class395 class395_25_ = Class395.create(x, y, z, 0.0F);
		Class395 class395_26_ = Class395.method6371(class395);
		Class395 class395_27_ = Class395.method6378(class395_26_, class395_25_);
		class395_27_.method6377(class395);
		set(class395_27_.aFloat4516, class395_27_.aFloat4517, class395_27_.aFloat4513);
		class395_25_.cache();
		class395_26_.cache();
		class395_27_.cache();
	}

	public final float method6488(Class397 other) {
		return x * other.x + y * other.y + z * other.z;
	}

	public final void multiply(float f) {
		x *= f;
		y *= f;
		z *= f;
	}

	public final void reset() {
		z = 0.0F;
		y = 0.0F;
		x = 0.0F;
	}

	public void set(float x, float y, float z) {
		this.x = x;
		this.y = y;
		this.z = z;
	}

	public final void subtract(Class397 other) {
		x -= other.x;
		y -= other.y;
		z -= other.z;
	}

	@Override
	public String toString() {
		return x + ", " + y + ", " + z;
	}

	final void divide(Class397 other) {
		x /= other.x;
		y /= other.y;
		z /= other.z;
	}

	final void method6453(Class397 other) {
		set(y * other.z - z * other.y, z * other.x - x * other.z, x * other.y - y * other.x);
	}

	final void multiply(Class397 other) {
		x *= other.x;
		y *= other.y;
		z *= other.z;
	}

}