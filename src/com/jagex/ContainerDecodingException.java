package com.jagex;

import java.applet.Applet;

public class ContainerDecodingException extends RuntimeException {
	public static Applet anApplet11638;
	public static int revision;
	public static String localDisplayName;
	static long aLong11643;

	public static ContainerDecodingException wrap(Throwable throwable, String message) {
		if (throwable instanceof ContainerDecodingException) {
			ContainerDecodingException exception = (ContainerDecodingException) throwable;
			StringBuilder builder = new StringBuilder(exception.message);

			exception.message = builder.append(' ').append(message).toString();
			return exception;
		}

		return new ContainerDecodingException(throwable, message);
	}

	Throwable cause;

	String message;

	ContainerDecodingException(Throwable throwable, String message) {
		this.message = message;
		cause = throwable;
		initCause(throwable);
	}

}