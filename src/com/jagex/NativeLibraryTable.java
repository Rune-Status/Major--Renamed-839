package com.jagex;

import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Vector;

public class NativeLibraryTable implements NativeLibraryProvider {

	static String nativeLibraryName(String string) {
		if (Class485.osName.startsWith("win")) {
			return string + ".dll";
		} else if (Class485.osName.startsWith("linux")) {
			return "lib" + string + ".so";
		} else if (Class485.osName.startsWith("mac")) {
			return "lib" + string + ".dylib";
		}

		return null;
	}

	String hardware;
	Hashtable<String, File> loadedFiles = new Hashtable<String, File>();
	Hashtable<String, Class<?>> loadedTypes = new Hashtable<String, Class<?>>();
	Archive natives;

	public NativeLibraryTable(Archive natives) {
		this.natives = natives;
		String string = "";

		if (Class485.osName.startsWith("win") || Class485.osName.startsWith("windows 7")) {
			string += "windows/";
		} else if (Class485.osName.startsWith("linux")) {
			string += "linux/";
		} else if (Class485.osName.startsWith("mac")) {
			string += "macos/";
		}

		if (Class485.architecture.startsWith("amd64") || Class485.architecture.startsWith("x86_64")) {
			string += "x86_64/";
		} else if (Class485.architecture.startsWith("i386") || Class485.architecture.startsWith("i486")
				|| Class485.architecture.startsWith("i586") || Class485.architecture.startsWith("x86")) {
			string += "x86/";
		} else if (Class485.architecture.startsWith("ppc")) {
			string += "ppc/";
		} else {
			string += "universal/";
		}

		hardware = string;
	}

	@Override
	public boolean clear() {
		Hashtable<String, Class<?>> hashtable = new Hashtable<String, Class<?>>();
		Enumeration<String> enumeration = loadedTypes.keys();

		while (enumeration.hasMoreElements()) {
			String string = enumeration.nextElement();
			hashtable.put(string, loadedTypes.get(string));
		}

		try {
			Class<AccessibleObject> accessibleObject = (Class<AccessibleObject>) Class
					.forName("java.lang.reflect.AccessibleObject");
			Class<ClassLoader> loader = (Class<ClassLoader>) Class.forName("java.lang.ClassLoader");
			Field nativeLibraries = loader.getDeclaredField("nativeLibraries");
			Method setAccessible = accessibleObject.getDeclaredMethod("setAccessible", Boolean.TYPE);
			setAccessible.invoke(nativeLibraries, Boolean.TRUE);

			enumeration = loadedTypes.keys();
			while (enumeration.hasMoreElements()) {
				String string = enumeration.nextElement();

				try {
					File file = loadedFiles.get(string);
					Class<?> clazz = loadedTypes.get(string);
					Vector<?> natives = (Vector<?>) nativeLibraries.get(clazz.getClassLoader());

					for (int index = 0; index < natives.size(); index++) {
						try {
							Object library = natives.elementAt(index);
							Field nameField = library.getClass().getDeclaredField("name");
							setAccessible.invoke(nameField, Boolean.TRUE);

							try {
								String name = (String) nameField.get(library);

								if (name != null && name.equalsIgnoreCase(file.getCanonicalPath())) {
									Field handle = library.getClass().getDeclaredField("handle");
									Method finalize = library.getClass().getDeclaredMethod("finalize");
									setAccessible.invoke(handle, new Object[] { Boolean.TRUE });
									setAccessible.invoke(finalize, new Object[] { Boolean.TRUE });

									try {
										finalize.invoke(library);
										handle.set(library, new Integer(0));
										hashtable.remove(string);
									} catch (Throwable throwable) {
									}

									setAccessible.invoke(finalize, new Object[] { Boolean.FALSE });
									setAccessible.invoke(handle, new Object[] { Boolean.FALSE });
								}
							} catch (Throwable throwable) {
							}

							setAccessible.invoke(nameField, Boolean.FALSE);
						} catch (Throwable throwable) {
						}
					}
				} catch (Throwable throwable) {
				}
			}

			setAccessible.invoke(nativeLibraries, Boolean.FALSE);
		} catch (Throwable throwable) {
		}

		loadedTypes = hashtable;
		return loadedTypes.isEmpty();
	}

	@Override
	public void load(String string) throws NativeLibraryLoadException {
		load(string, DefaultNativeLibraryType.class);
	}

	@Override
	public boolean loaded(String name) {
		return loadedFiles.containsKey(name);
	}

	public int percentComplete(String name) throws NativeLibraryAccessException {
		if (loadedFiles.containsKey(name)) {
			return 100;
		}

		String local = NativeLibraryTable.nativeLibraryName(name);
		if (null == local) {
			throw new NativeLibraryAccessException(1, name);
		}

		String entry = null;
		entry = hardware + local;
		if (null == natives || !natives.validFile(entry, "")) {
			throw new NativeLibraryAccessException(2, name);
		}

		if (!natives.loadEntry(entry)) {
			return natives.percentComplete(entry);
		}

		byte[] buffer = natives.get(entry, "");
		if (null == buffer) {
			throw new NativeLibraryAccessException(3, name);
		}

		File file;
		try {
			file = Class558.openRwFile(local);
		} catch (RuntimeException ex) {
			throw new NativeLibraryAccessException(4, name, ex);
		}

		if (file == null) {
			throw new NativeLibraryAccessException(5, name);
		}

		boolean valid = true;
		byte[] data = BaseVariableParameterDefinition.readFileBytes(file);

		if (null != data && buffer.length == data.length) {
			for (int index = 0; index < data.length; index++) {
				if (data[index] != buffer[index]) {
					valid = false;
					break;
				}
			}
		} else {
			valid = false;
		}

		if (!valid) {
			try {
				FileOutputStream out = new FileOutputStream(file);
				out.write(buffer, 0, buffer.length);
				out.close();
			} catch (Throwable throwable) {
				throw new NativeLibraryAccessException(6, name, throwable);
			}
		}

		setLoaded(name, file);
		return 100;
	}

	void load(String string, Class clazz) throws NativeLibraryLoadException {
		Class<?> current = loadedTypes.get(string);
		if (current != null && current.getClassLoader() != clazz.getClassLoader()) {
			throw new NativeLibraryLoadException(1, string);
		}

		File file = loadedFiles.get(string);

		if (null != file) {
			try {
				file = new File(file.getCanonicalPath());
				Class<Runtime> runtime = (Class<Runtime>) Class.forName("java.lang.Runtime");
				Class<AccessibleObject> accessible = (Class<AccessibleObject>) Class
						.forName("java.lang.reflect.AccessibleObject");

				Method setAccessible = accessible.getDeclaredMethod("setAccessible", new Class[] { Boolean.TYPE });
				Method load0 = runtime.getDeclaredMethod("load0", Class.forName("java.lang.Class"),
						Class.forName("java.lang.String"));

				setAccessible.invoke(load0, Boolean.TRUE);
				load0.invoke(Runtime.getRuntime(), clazz, file.getPath());

				setAccessible.invoke(load0, Boolean.FALSE);
				loadedTypes.put(string, clazz);
			} catch (NoSuchMethodException ex) {
				System.load(file.getPath());
				loadedTypes.put(string, DefaultNativeLibraryType.class);
			} catch (Throwable throwable) {
				throw new NativeLibraryLoadException(3, string, throwable);
			}
		} else {
			throw new NativeLibraryLoadException(4, string);
		}
	}

	void setLoaded(String string, File file) {
		loadedFiles.put(string, file);
	}

}