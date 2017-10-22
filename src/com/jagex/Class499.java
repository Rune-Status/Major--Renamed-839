package com.jagex;

import java.util.Comparator;

class Class499 implements Comparator {
	static final void method8686(ScriptExecutionContext class613) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		BaseVarpDefinitionLoader.method1630(string);
	}

	Class343_Sub2 this$0;

	Class499(Class343_Sub2 class343_sub2) {
		this$0 = class343_sub2;
	}

	@Override
	public int compare(Object object, Object object_2_) {
		return method8682((Class459) object, (Class459) object_2_, -264935716);
	}

	@Override
	public boolean equals(Object object) {
		return super.equals(object);
	}

	int method8682(Class459 class459, Class459 class459_0_, int i) {
		float f = class459.method7562();
		float f_1_ = class459_0_.method7562();
		if (f_1_ > f) {
			return 1;
		}
		if (f_1_ < f) {
			return -1;
		}
		return 0;
	}
}
