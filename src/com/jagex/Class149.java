package com.jagex;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;

public class Class149 {
	public static final int anInt1828 = 0;
	public static int[] maxParticleSystems = { 3, 7, 15 };
	public static final int anInt1830 = 8;
	public static final int anInt1831 = 2;
	public static int[] anIntArray1832 = { 2047, 16383, 65535 };
	public static final int anInt1833 = 8191;
	public static final int anInt1834 = 64;
	public static final int anInt1835 = 16;
	public static final int anInt1836 = 0;
	public static final int anInt1837 = 1;
	public static final int anInt1838 = 1023;
	public static final int anInt1839 = 2;
	public static final int anInt1840 = 16;
	public static final int anInt1841 = 32;

	public static boolean method3180() {
		if (Class485.osName.startsWith("win")) {
			String string = "msvcr110.dll";
			String string_0_ = "msvcp110.dll";
			String[] strings = { string, string_0_ };
			String string_1_ = System.getenv("WINDIR");
			if (string_1_ == "") {
				return false;
			}
			for (String string2 : strings) {
				File file = new File(new StringBuilder().append(string_1_).append("\\system32\\").append(string2)
						.toString());
				if (!file.exists() || file.isDirectory()) {
					return false;
				}
			}
			return true;
		}
		if (Class485.osName.startsWith("mac")) {
			boolean bool;
			try {
				Process process = Runtime.getRuntime().exec("ps -few");
				BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(process.getInputStream()));
				do {
					boolean bool_3_;
					try {
						int i_4_ = process.waitFor();
						if (0 == i_4_) {
							break;
						}
						bool_3_ = false;
					} catch (InterruptedException interruptedexception) {
						return false;
					}
					return bool_3_;
				} while (false);
				boolean bool_5_ = false;
				while_13_: do {
					String string;
					do {
						if ((string = bufferedreader.readLine()) == null) {
							break while_13_;
						}
					} while (string.toLowerCase().indexOf("soundflowerbed") == -1);
					bool_5_ = true;
				} while (false);
				bufferedreader.close();
				bool = bool_5_;
			} catch (Exception exception) {
				return false;
			}
			return bool;
		}
		return false;
	}

	Class149() throws Throwable {
		throw new Error();
	}

}