package com.jagex;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

public class LinkedWeakReference extends WeakReference {

	int hashcode;
	LinkedWeakReference next;

	LinkedWeakReference(Object object, ReferenceQueue queue, int hash) {
		super(object, queue);
		hashcode = hash * -881063567;
	}

}