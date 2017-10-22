package com.jagex;

public final class EntityQueue<T extends CacheableEntity> {

	public static final int getFps() {
		return (int) (1000000000L / (Engine.refreshRate * -4348386293639228151L));
	}

	static final void method13531() {
		ObjectDefinition.method9291(Class60.activeToolkit);
		if (Client.anInt10745 * -1388610979 != ProxyingVariableLoader.localPlane * 1611577177) {
			Class591.method9995();
		}
	}

	static void method13532() {
		for (int index = 0; index < 104; index++) {
			Client.aBoolArray10850[index] = true;
		}
	}

	public CacheableEntity tail = new CacheableEntity();
	CacheableEntity current;

	public EntityQueue() {
		tail.nextCacheable = tail;
		tail.previousCacheable = tail;
	}

	public void clear() {
		for (;;) {
			CacheableEntity entity = tail.nextCacheable;
			if (tail == entity) {
				break;
			}
			entity.uncache();
		}

		current = null;
	}

	public T getFront() {
		CacheableEntity front = tail.nextCacheable;
		if (front == tail) {
			current = null;
			return null;
		}

		current = front.nextCacheable;
		return (T) front;
	}

	public T next() {
		CacheableEntity next = current;
		if (next == tail) {
			current = null;
			return null;
		}

		current = next.nextCacheable;
		return (T) next;
	}

	public void offer(T entity) {
		if (null != entity.previousCacheable) {
			entity.uncache();
		}

		entity.previousCacheable = tail.previousCacheable;
		entity.nextCacheable = tail;
		entity.previousCacheable.nextCacheable = entity;
		entity.nextCacheable.previousCacheable = entity;
	}

}