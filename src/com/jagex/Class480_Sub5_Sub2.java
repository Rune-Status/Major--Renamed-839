package com.jagex;

import jaclib.memory.heap.NativeHeap;

public class Class480_Sub5_Sub2 extends Class480_Sub5 {
	NativeHeap aNativeHeap11248;

	Class480_Sub5_Sub2(int i) {
		aNativeHeap11248 = new NativeHeap(i);
	}

	void method17576() {
		aNativeHeap11248.destroy();
	}
}
