package com.jagex;

import java.applet.Applet;

public class JavascriptUtils {

	public static void eval(Applet applet, String string) throws Throwable {
		// JSObject.getWindow(applet).eval(string);
	}

	public static Object call(Applet applet, String method, Object[] parameters) throws Throwable {
		return null;// JSObject.getWindow(applet).call(method, parameters);
	}

	public static Object call(Applet applet, String method) throws Throwable {
		return null;// JSObject.getWindow(applet).call(method, null);
	}

	JavascriptUtils() throws Throwable {
		throw new Error();
	}

}