package com.jagex;

public class Class477_Sub2 extends Entity {
	static EntityList<Class477_Sub2> aClass649_9982 = new EntityList<Class477_Sub2>();
	static int anInt9977;

	static Class477_Sub2 method13574() {
		Class477_Sub2 class477_sub2 = aClass649_9982.method13443();
		if (class477_sub2 != null) {
			anInt9977 -= -1199953777;
			return class477_sub2;
		}

		return new Class477_Sub2();
	}

	static void method6938(Class477_Sub2 class477_sub2) {
		class477_sub2.mob = null;
		if (-796789137 * anInt9977 < 20) {
			aClass649_9982.offer(class477_sub2);
			anInt9977 += -1199953777;
		}
	}

	int anInt9976;
	int anInt9978;
	int anInt9979;
	int anInt9980;

	Mob mob;

	Class477_Sub2() {

	}

}