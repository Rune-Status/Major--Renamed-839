package com.jagex;

public class Class526 {
	static char method8981(char c, Language language) {
		if (c >= '\u00c0' && c <= '\u00ff') {
			if (c >= '\u00c0' && c <= '\u00c6') {
				return 'A';
			} else if (c == '\u00c7') {
				return 'C';
			} else if (c >= '\u00c8' && c <= '\u00cb') {
				return 'E';
			} else if (c >= '\u00cc' && c <= '\u00cf') {
				return 'I';
			} else if ('\u00d1' == c && Language.SPANISH != language) {
				return 'N';
			} else if (c >= '\u00d2' && c <= '\u00d6') {
				return 'O';
			} else if (c >= '\u00d9' && c <= '\u00dc') {
				return 'U';
			} else if ('\u00dd' == c) {
				return 'Y';
			} else if ('\u00df' == c) {
				return 's';
			} else if (c >= '\u00e0' && c <= '\u00e6') {
				return 'a';
			} else if ('\u00e7' == c) {
				return 'c';
			} else if (c >= '\u00e8' && c <= '\u00eb') {
				return 'e';
			} else if (c >= '\u00ec' && c <= '\u00ef') {
				return 'i';
			} else if (c == '\u00f1' && Language.SPANISH != language) {
				return 'n';
			} else if (c >= '\u00f2' && c <= '\u00f6') {
				return 'o';
			} else if (c >= '\u00f9' && c <= '\u00fc') {
				return 'u';
			} else if ('\u00fd' == c || '\u00ff' == c) {
				return 'y';
			}
		}

		if ('\u0152' == c) {
			return 'O';
		} else if (c == '\u0153') {
			return 'o';
		} else if ('\u0178' == c) {
			return 'Y';
		}

		return c;
	}

	static void initConsole() {
		Class65.anInt1009 = -278181386 + Class281_Sub3.b12Full.topPadding * -1945506657
				+ Class281_Sub3.b12Full.bottomPadding * 1489314685;
		Class65.anInt1004 = Class24.p12Full.bottomPadding * -162294503 + 1412352339 * Class24.p12Full.topPadding
				+ 1642120702;
		Class65.consoleMessages = new String[500];
		for (int index = 0; index < Class65.consoleMessages.length; index++) {
			Class65.consoleMessages[index] = "";
		}
		CutsceneMob.printConsoleMessage(TranslatableString.INIT_DEV_CONSOLE.translate(Client.currentLanguage));
	}

	Class526() throws Throwable {
		throw new Error();
	}

}