package com.jagex;

import java.io.File;

import com.jagex.twitch.TwitchEvent;
import com.jagex.twitch.TwitchTV;

public class Class485 {
	public static String architecture;
	public static String osMeta;
	public static String osName;
	static String osVersion;

	static {
		String string = "Unknown";
		try {
			string = System.getProperty("java.vendor").toLowerCase();
		} catch (Exception exception) {

		}
		string.toLowerCase();
		string = "Unknown";

		try {
			string = System.getProperty("java.version").toLowerCase();
		} catch (Exception exception) {

		}
		string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.name").toLowerCase();
		} catch (Exception exception) {

		}

		osName = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {

		}

		architecture = string.toLowerCase();
		string = "Unknown";
		try {
			string = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {

		}

		osVersion = string.toLowerCase();
		osMeta = String.format("%s (%s) [%s]", osName, architecture, osVersion);
		string = "~/";

		try {
			string = System.getProperty("user.home").toLowerCase();
		} catch (Exception exception) {

		}

		new File(string);
	}

	public static void method8244(Toolkit toolkit, long l) {
		if (Class533.anInt7283 * 1274816843 != 3 && 0 != Class533.anInt7283 * 1274816843) {
			if (1 == Class533.anInt7283 * 1274816843) {
				if (null == Class533.aStringArray7273 || 0 == Class533.aStringArray7273.length) {
					throw new RuntimeException("");
				}

				int i = 0;
				for (String element : Class533.aStringArray7273) {
					if (null != element) {
						try {
							i += LibraryLoader.natives.percentComplete(element);
						} catch (NativeLibraryAccessException exception_sub6) {
							TimeUtil.method4149(Class16.aClass16_279, exception_sub6.name, -1593558761
									* exception_sub6.code, exception_sub6.getCause());
							Class533.anInt7283 = -1088075479;
							return;
						}
					} else {
						i += 100;
					}
				}

				Class533.anInt7272 = -1241856557 * (i / Class533.aStringArray7273.length);
				if (100 == 1363335771 * Class533.anInt7272) {
					Class533.anInt7283 = Class50.method1126(516045849) * 1068963939;
					if (Class533.anInt7283 * 1274816843 != 2) {
						return;
					}
				} else {
					return;
				}
			}

			TwitchEvent[] events = TwitchTV.tv.Service();
			if (null != events) {
				for (TwitchEvent event : events) {
					if (null != event && CutsceneArea.method16039(event, l)) {
						Class527 class527 = event.method6187();
						if (class527 != null) {
							Class60.method1369(class527.getId(), event);
						}
					}
				}
			}

			if (TwitchTV.tv.IsStreaming()
					&& l - -1224161100600739409L * Class533.aLong7285 > -2192649988051581319L * Class341.aLong6921) {
				Class533.aLong7285 = l * 9110903633089232207L;
				if (toolkit.method2806()) {
					Class533.aBool7280 = true;
				}
			}

			if (TwitchTV.tv.IsStreaming()) {
				if (l - 6050356637451508123L * Class533.aLong7277 < 1454202271 * Class533.anInt7268) {
					Class533.anInt7279 = 125652490;
				} else if (l - Class533.aLong7278 * 4766340005259170203L < 1454202271 * Class533.anInt7268) {
					Class533.anInt7279 = 62826245;
				} else {
					Class533.anInt7279 = 0;
				}
			} else {
				Class533.anInt7279 = 0;
			}

			if (l - -4873324786093317579L * Class533.aLong7271 > -1222639753 * Class533.anInt7270
					&& TwitchTV.tv.GetWebcamState() == 5) {
				TwitchTV.tv.RestartWebcamDevice();
				Class533.aLong7271 = l * 2525320551650205725L;
			}
		}
	}

	static String method8246(String subdomain, boolean ssl) {
		String protocol = ssl ? "https://" : "http://";
		if (Class622.aClass622_8010 == ArchiveLoader.aClass622_4521) {
			subdomain += "-wtrc";
		} else if (Class622.aClass622_8008 == ArchiveLoader.aClass622_4521) {
			subdomain += "-wtqa";
		} else if (Class622.aClass622_8009 == ArchiveLoader.aClass622_4521) {
			subdomain += "-wtwip";
		} else if (ArchiveLoader.aClass622_4521 == Class622.aClass622_8007) {
			subdomain += "-wti";
		} else if (ArchiveLoader.aClass622_4521 == Class622.aClass622_8013) {
			subdomain += "-demo";
		} else if (Class622.aClass622_8003 == ArchiveLoader.aClass622_4521) {
			subdomain = "local";
		}

		String parameter = "";
		if (Client.settings != null) {
			parameter += "/p=" + Client.settings;
		}

		String domain = Client.game.domain + ".com";
		return protocol + subdomain + "." + domain + "/l=" + (Client.currentLanguage.id * 552897085) + "/a="
				+ (Client.affiliateId * 672060199) + parameter + "/";
	}

	Class485() throws Throwable {
		throw new Error();
	}

}