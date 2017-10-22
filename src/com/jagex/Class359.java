package com.jagex;

public class Class359 {
	public static final int anInt3835 = 22;
	public static final int anInt3836 = 31;
	public static final int anInt3837 = 33;
	public static final int anInt3838 = 29;
	public static final int anInt3839 = 39;
	public static final int anInt3840 = 6;
	public static final int anInt3841 = 12;
	public static final int anInt3842 = 15;
	public static final int anInt3843 = 41;
	public static final int anInt3844 = 30;
	public static final int anInt3845 = 16;
	public static final int anInt3846 = 14;
	public static final int anInt3847 = 10;
	public static final int anInt3848 = 36;
	public static final int anInt3849 = 8;
	static final int anInt3850 = 42;
	public static final int anInt3851 = 28;
	public static final int anInt3852 = 25;
	public static final int anInt3853 = 1;
	public static final int anInt3854 = 9;
	public static final int anInt3855 = 7;
	public static final int anInt3856 = 21;
	public static final int anInt3857 = 20;
	public static final int anInt3858 = 17;
	public static final int anInt3859 = 4;
	public static final int anInt3860 = 5;
	public static final int anInt3861 = 24;
	public static final int anInt3862 = 13;
	public static final int anInt3863 = 37;
	public static final int anInt3864 = 38;
	public static final int anInt3865 = 18;
	public static final int anInt3866 = 26;
	public static final int anInt3867 = 23;
	public static final int anInt3868 = 34;
	public static final int anInt3869 = 2;
	public static final int anInt3870 = 32;
	public static final int anInt3871 = 11;
	public static final int anInt3872 = 27;
	public static final int anInt3873 = 43;
	public static final int anInt3874 = 3;
	public static final int anInt3875 = 35;
	public static final int anInt3876 = 40;

	public static void method6033(Class22 class22) {
		HuffmanCodec.method4342(new Class514(class22));
	}

	static void executeConsoleScript(String[] strings) {
		if (strings.length > 1) {
			for (int index = 0; index < strings.length; index++) {
				if (strings[index].startsWith("pause")) {
					int time = 5;
					try {
						time = Integer.parseInt(strings[index].substring(6));
					} catch (Exception exception) {

					}

					CutsceneMob.printConsoleMessage("Pausing for " + time + " seconds...");
					BaseCursorDefinitionProvider.consoleScript = strings;
					Class65.consoleScriptIndex = -462831975 * (index + 1);
					Class612.consolePauseTime = (TimeUtil.time() + 1000 * time) * 5127696852550607219L;
					break;
				}

				Class65.consoleText = strings[index];
				Class183.submitConsoleMessage(false);
			}
		} else {
			Class65.consoleText = Class65.consoleText + strings[0];
			Class65.consoleTextIndex += strings[0].length() * -1223481467;
		}
	}

	static void method6039(int i, int i_4_) {
		ClanChannelUpdater.anInt3185 = i * 1001358417;
		Class495_Sub1.anInt10324 = -732309487;
		Class495_Sub1.anInt10324 = -732309487;
		SpawnObjectCutsceneAction.method15149();
	}

	Class359() throws Throwable {
		throw new Error();
	}

}