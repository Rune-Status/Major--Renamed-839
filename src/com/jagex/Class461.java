package com.jagex;

import java.util.LinkedList;

public class Class461 implements Runnable {
	Class460 aClass460_5256 = new Class460(true);
	volatile boolean aBool5257 = false;

	LinkedList aLinkedList5258 = new LinkedList();

	public void method7824(ObjectDefinitionLoader loader) {
		aClass460_5256.setObjectLoader(loader);
	}

	public void method7825(Class452 class452) {
		synchronized (aLinkedList5258) {
			aLinkedList5258.add(class452);
			aLinkedList5258.notify();
		}
	}

	public boolean method7826() {
		return aBool5257;
	}

	public Class460 method7827() {
		return aClass460_5256;
	}

	@Override
	public void run() {
		for (;;) {
			method7835();
		}
	}

	void method7830(Class452 class452) {
		if (Class458.aClass458_5159 == class452.aClass458_5090) {
			aClass460_5256.method7705();
		} else {
			aClass460_5256.method7706(class452);
		}

		for (boolean bool = aClass460_5256.method7810(); !bool; bool = aClass460_5256.method7810()) {

		}

		aClass460_5256.method7700();
		Client.aClass460_10760.method7700();
	}

	void method7835() {
		Class452 class452;
		synchronized (aLinkedList5258) {
			try {
				aLinkedList5258.wait();
			} catch (InterruptedException ex) {

			}

			class452 = (Class452) aLinkedList5258.pollFirst();
		}

		try {
			try {
				if (null != class452) {
					aBool5257 = true;
					method7830(class452);
				}
			} catch (Exception exception) {
				aBool5257 = false;
				return;
			}

			aBool5257 = false;
		} catch (Exception ex) {
			aBool5257 = false;
		}
	}

	void method7840(Class460 class460) {
		aClass460_5256 = class460;
	}

}