package com.jagex;

import java.awt.event.ActionEvent;

public class Class342 {
	public static Class342 aClass342_3642;
	public static Class342 aClass342_3643;
	public static Class342 aClass342_3644;
	public static Class342 aClass342_3645;
	public static Class342 aClass342_3646 = new Class342();
	public static Class342 aClass342_3647;
	public static Class342 aClass342_3648;

	static {
		aClass342_3643 = new Class342();
		aClass342_3647 = new Class342();
		aClass342_3642 = new Class342();
		aClass342_3644 = new Class342();
		aClass342_3645 = new Class342();
		aClass342_3648 = new Class342();
	}

	static void method5870(Object object) {
		if (null != Class480_Sub11.systemEventQueue) {
			for (int i = 0; i < 50 && Class480_Sub11.systemEventQueue.peekEvent() != null; i++) {
				Client.sleep(1L);
			}

			try {
				if (null != object) {
					Class480_Sub11.systemEventQueue.postEvent(new ActionEvent(object, 1001, "dummy"));
				}
			} catch (Exception exception) {

			}
		}
	}

}