package com.jagex;

public class Class571 implements Interface66 {
	static String method9654(int i, Language language, MobDefaults defaults) {
		if (i < 100000) {
			return Class268.getOpeningColourHtml(-53194431 * defaults.anInt7603) + i + ItemDefinition.aString8338;
		} else if (i < 10000000) {
			return Class268.getOpeningColourHtml(-1518830813 * defaults.anInt7607) + (i / 1000)
					+ TranslatableString.aClass5_161.translate(language) + ItemDefinition.aString8338;
		}

		return Class268.getOpeningColourHtml(1462888701 * defaults.anInt7612) + (i / 1000000)
				+ TranslatableString.aClass5_105.translate(language) + ItemDefinition.aString8338;
	}

	Class343 aClass343_7647;
	Class563 aClass563_7648 = Class563.aClass563_7557;
	int id;
	Archive music;
	Interface63 anInterface63_7651;

	public Class571(Archive music, int i, Class343 class343, Interface63 interface63) {
		this.music = music;
		id = 637716983 * i;

		aClass343_7647 = class343;
		anInterface63_7651 = interface63;
		aClass563_7648 = Class563.aClass563_7558;
	}

	@Override
	public void method172() {
		if (aClass563_7648 == Class563.aClass563_7558) {
			aClass563_7648 = Class563.aClass563_7559;
			if (null != anInterface63_7651) {
				anInterface63_7651.method401(this, 0, -128268345 * id, true);
			}
		}
	}

	@Override
	public void method331() {
		if (aClass563_7648 == Class563.aClass563_7558) {
			aClass563_7648 = Class563.aClass563_7559;
			if (null != anInterface63_7651) {
				anInterface63_7651.method401(this, 0, -128268345 * id, true);
			}
		}
	}

	@Override
	public void method412(Buffer buffer) {

	}

	@Override
	public Class563 method413() {
		return aClass563_7648;
	}

	@Override
	public boolean method414() {
		return true;
	}

	@Override
	public byte[] get(int id) {
		if (id == 0) {
			id = this.id * -128268345;
		}

		return music.get(id);
	}

	@Override
	public Class456 method416() {
		Class456 class456 = new Class456(aClass343_7647);
		class456.method7427(this);
		return class456;
	}

	@Override
	public Class457 method417() {
		return Class457.aClass457_5141;
	}

	@Override
	public int getId() {
		return -128268345 * id;
	}

	@Override
	public Buffer method420(int i) {
		return null;
	}

	@Override
	public boolean method422(int i) {
		return false;
	}

	@Override
	public int method429(int i) {
		return 0;
	}

	@Override
	public boolean method442() {
		return false;
	}

	@Override
	public int method445() {
		return 0;
	}

	@Override
	public void method447(boolean bool) {

	}

	@Override
	public boolean method450() {
		return false;
	}

}