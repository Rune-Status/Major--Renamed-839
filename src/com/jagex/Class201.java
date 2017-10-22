package com.jagex;

import java.util.Iterator;

public class Class201 implements Interface23 {
	static final void method3943() {
		Iterator<CacheableAnimatedObject> iterator = Client.animatedObjects.iterator();
		while (iterator.hasNext()) {
			CacheableAnimatedObject cached = iterator.next();
			AnimatedObject animated = cached.animated;
			animated.method18222(1);

			if (animated.method18212()) {
				cached.unlink();
				animated.method18224();
			}
		}
	}

	Class195 this$0;
	DefaultMapEntry aClass383_2113;

	Class201(Class195 class195, Buffer buffer) {
		this$0 = class195;
		if (buffer.readUShort() != 65535) {
			buffer.offset -= -1778683038;
			aClass383_2113 = class195.anInterface22_2085.method119().method13918(buffer);
		} else {
			aClass383_2113 = null;
		}
	}

	@Override
	public void method131(Class192 class192) {
		if (aClass383_2113 != null) {
			class192.method3836().setStringVarp(
					this$0.anInterface22_2085.method119().get(aClass383_2113.key * 1960527763), aClass383_2113.value);
		}
	}

}