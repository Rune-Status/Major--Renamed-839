package com.jagex;

public final class PriorityQueueElement<T> {
	public static void method6072(Widget[] widgets) {
		for (Widget widget : widgets) {
			if (null != widget.anObjectArray2440) {
				ScriptContext context = new ScriptContext();
				context.source = widget;
				context.arguments = widget.anObjectArray2440;
				Script.execute(context, 2000000);
			}
		}
	}

	static Class275 method6074(int i) {
		if (948674401 * Class275.aClass275_3097.anInt3096 == i) {
			return Class275.aClass275_3097;
		} else if (i == Class275.aClass275_3095.anInt3096 * 948674401) {
			return Class275.aClass275_3095;
		} else if (i == Class275.aClass275_3094.anInt3096 * 948674401) {
			return Class275.aClass275_3094;
		}

		return null;
	}

	int index;
	T object;

	PriorityQueueElement(T object, int index) {
		this.object = object;
		this.index = index * -769776549;
	}

}