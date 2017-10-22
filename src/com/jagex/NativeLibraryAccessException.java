package com.jagex;

public class NativeLibraryAccessException extends Exception {
	public int code;
	public String name;

	NativeLibraryAccessException(int code, String name) {
		this(code, name, null);
	}

	NativeLibraryAccessException(int code, String name, Throwable throwable) {
		super(throwable);
		this.name = name;
		this.code = -1970499929 * code;
	}

}