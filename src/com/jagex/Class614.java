package com.jagex;

import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;

public class Class614 {
	static char[] BASE_64_URLSAFE = new char[64];
	static char[] BASE_64;
	static int[] anIntArray7950;
	public static Archive music;

	static {
		for (int i = 0; i < 26; i++) {
			BASE_64_URLSAFE[i] = (char) (65 + i);
		}
		for (int i = 26; i < 52; i++) {
			BASE_64_URLSAFE[i] = (char) (97 + i - 26);
		}
		for (int i = 52; i < 62; i++) {
			BASE_64_URLSAFE[i] = (char) (i + 48 - 52);
		}

		BASE_64_URLSAFE[62] = '+';
		BASE_64_URLSAFE[63] = '/';

		BASE_64 = new char[64];
		for (int i = 0; i < 26; i++) {
			BASE_64[i] = (char) (65 + i);
		}
		for (int i = 26; i < 52; i++) {
			BASE_64[i] = (char) (97 + i - 26);
		}
		for (int i = 52; i < 62; i++) {
			BASE_64[i] = (char) (i + 48 - 52);
		}

		BASE_64[62] = '*';
		BASE_64[63] = '-';

		anIntArray7950 = new int[128];
		for (int i = 0; i < anIntArray7950.length; i++) {
			anIntArray7950[i] = -1;
		}
		for (int i = 65; i <= 90; i++) {
			anIntArray7950[i] = i - 65;
		}
		for (int i = 97; i <= 122; i++) {
			anIntArray7950[i] = 26 + i - 97;
		}
		for (int i = 48; i <= 57; i++) {
			anIntArray7950[i] = 52 + i - 48;
		}

		int[] is = anIntArray7950;
		anIntArray7950[43] = 62;
		is[42] = 62;
		int[] is_0_ = anIntArray7950;
		anIntArray7950[47] = 63;
		is_0_[45] = 63;
	}

	public static long method10355(int i) {
		return (i + 11745) * 86400000L;
	}

	public static Class480_Sub31_Sub19 method10358(int i, Class228 class228, Buffer buffer, int i_9_) {
		if (class228 == Class228.aClass228_2570) {
			return new Class480_Sub31_Sub19_Sub2(i, buffer);
		}
		if (Class228.aClass228_2569 == class228) {
			return new Class480_Sub31_Sub19_Sub1(i, buffer);
		}
		return null;
	}

	static final void method10354() {
		Class31.accountName = -5617524125832062695L;
		Class31.serverKey = 0L;
		Class31.socialNetworkId = -1568798451;
	}

	static void method10356() {
		if (Class65.anInt1011 * 2002418453 < 102) {
			Class65.anInt1011 += -889853586;
		}
		if (-1 != 105362857 * Class65.consoleScriptIndex
				&& -5822906309662135365L * Class612.consolePauseTime < TimeUtil.time()) {
			for (int i_2_ = 105362857 * Class65.consoleScriptIndex; i_2_ < BaseCursorDefinitionProvider.consoleScript.length; i_2_++) {
				if (BaseCursorDefinitionProvider.consoleScript[i_2_].startsWith("pause")) {
					int i_3_ = 5;
					try {
						i_3_ = Integer.parseInt(BaseCursorDefinitionProvider.consoleScript[i_2_].substring(6));
					} catch (Exception exception) {

					}
					CutsceneMob.printConsoleMessage(new StringBuilder().append("Pausing for ").append(i_3_)
							.append(" seconds...").toString());
					Class65.consoleScriptIndex = -462831975 * (1 + i_2_);
					Class612.consolePauseTime = (TimeUtil.time() + i_3_ * 1000) * 5127696852550607219L;
					return;
				}
				Class65.consoleText = BaseCursorDefinitionProvider.consoleScript[i_2_];
				Class183.submitConsoleMessage(false);
			}
			Class65.consoleScriptIndex = 462831975;
		}
		if (Client.anInt10818 * -199372903 != 0) {
			Class65.anInt1002 -= Client.anInt10818 * 1705675739;
			if (Class65.anInt1002 * 703340807 >= Class65.anInt1003 * 951436779) {
				Class65.anInt1002 = -131117315 * Class65.anInt1003 - -370967369;
			}
			if (Class65.anInt1002 * 703340807 < 0) {
				Class65.anInt1002 = 0;
			}
			Client.anInt10818 = 0;
		}
		for (int i_4_ = 0; i_4_ < 1019900971 * Client.anInt10690; i_4_++) {
			KeyRecord interface59 = Client.anInterface59Array10637[i_4_];
			int i_5_ = interface59.getCode();
			char c = interface59.getCharacter();
			int i_6_ = interface59.getFlags();
			if (84 == i_5_) {
				Class183.submitConsoleMessage(false);
			}
			if (80 == i_5_) {
				Class183.submitConsoleMessage(true);
			} else if (66 == i_5_ && (i_6_ & 0x4) != 0) {
				if (Class198.aClipboard2096 != null) {
					String string = "";
					for (int i_7_ = Class65.consoleMessages.length - 1; i_7_ >= 0; i_7_--) {
						if (Class65.consoleMessages[i_7_] != null && Class65.consoleMessages[i_7_].length() > 0) {
							string = new StringBuilder().append(string).append(Class65.consoleMessages[i_7_])
									.append('\n').toString();
						}
					}
					Class198.aClipboard2096.setContents(new StringSelection(string), null);
				}
			} else if (67 == i_5_ && (i_6_ & 0x4) != 0) {
				if (null != Class198.aClipboard2096) {
					try {
						Transferable transferable = Class198.aClipboard2096.getContents(null);
						if (null != transferable) {
							String string = (String) transferable.getTransferData(DataFlavor.stringFlavor);
							if (string != null) {
								String[] strings = Class374.splitString(string, '\n');
								Class359.executeConsoleScript(strings);
							}
						}
					} catch (Exception exception) {

					}
				}
			} else if (85 == i_5_ && Class65.consoleTextIndex * -581519027 > 0) {
				Class65.consoleText = new StringBuilder()
						.append(Class65.consoleText.substring(0, -581519027 * Class65.consoleTextIndex - 1))
						.append(Class65.consoleText.substring(-581519027 * Class65.consoleTextIndex)).toString();
				Class65.consoleTextIndex -= -1223481467;
			} else if (i_5_ == 101 && Class65.consoleTextIndex * -581519027 < Class65.consoleText.length()) {
				Class65.consoleText = new StringBuilder()
						.append(Class65.consoleText.substring(0, -581519027 * Class65.consoleTextIndex))
						.append(Class65.consoleText.substring(1 + -581519027 * Class65.consoleTextIndex)).toString();
			} else if (96 == i_5_ && -581519027 * Class65.consoleTextIndex > 0) {
				Class65.consoleTextIndex -= -1223481467;
			} else if (97 == i_5_ && -581519027 * Class65.consoleTextIndex < Class65.consoleText.length()) {
				Class65.consoleTextIndex += -1223481467;
			} else if (i_5_ == 102) {
				Class65.consoleTextIndex = 0;
			} else if (i_5_ == 103) {
				Class65.consoleTextIndex = Class65.consoleText.length() * -1223481467;
			} else if (104 == i_5_ && -397456237 * Class65.anInt1008 < Class65.consoleMessages.length) {
				Class65.anInt1008 += -1918258789;
				CubeMapTextureProvider.method2864(540241075);
				Class65.consoleTextIndex = Class65.consoleText.length() * -1223481467;
			} else if (105 == i_5_ && -397456237 * Class65.anInt1008 > 0) {
				Class65.anInt1008 -= -1918258789;
				CubeMapTextureProvider.method2864(1521642975);
				Class65.consoleTextIndex = Class65.consoleText.length() * -1223481467;
			} else if (CacheResourceWorker.isAlphaNumeric(c) || "\\/.:, _-+[]~@".indexOf(c) != -1) {
				Class65.consoleText = new StringBuilder()
						.append(Class65.consoleText.substring(0, Class65.consoleTextIndex * -581519027))
						.append(Client.anInterface59Array10637[i_4_].getCharacter())
						.append(Class65.consoleText.substring(Class65.consoleTextIndex * -581519027)).toString();
				Class65.consoleTextIndex += -1223481467;
			}
		}
		Client.anInt10690 = 0;
		Client.maximumHeldKeys = 0;
		EntityQueue.method13532();
	}

	Class614() throws Throwable {
		throw new Error();
	}
}
