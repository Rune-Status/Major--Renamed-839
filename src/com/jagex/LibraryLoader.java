package com.jagex;

public class LibraryLoader implements Loader {

	public static NativeLibraryTable natives;
	static int lastIpAddress;

	boolean loaded;
	String name;

	LibraryLoader(String string) {
		name = string;
	}

	@Override
	public int completion() {
		if (loaded) {
			return 100;
		}

		int percentage;
		try {
			percentage = LibraryLoader.natives.percentComplete(name);
		} catch (NativeLibraryAccessException exception_sub6) {
			TimeUtil.method4149(Class16.aClass16_279, exception_sub6.name, exception_sub6.code * -1593558761,
					exception_sub6.getCause());
			loaded = true;
			return 100;
		}

		return percentage;
	}

	@Override
	public LoadingRequirementType type() {
		return LoadingRequirementType.LIBRARY;
	}

	boolean hasLoaded() {
		return loaded;
	}

	void setLoaded() {
		loaded = true;
	}

}