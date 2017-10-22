package com.jagex;

import java.util.Locale;

public class Language implements Identifiable {

	static Language DUTCH = new Language("NL", "nl", "Dutch", Class622.aClass622_8009, 4, "NL");
	public static Language GERMAN = new Language("DE", "de", "German", Class622.aClass622_8012, 1, "DE");
	public static Language FRENCH = new Language("FR", "fr", "French", Class622.aClass622_8012, 2, "FR");
	static Language[] languages;
	public static Language SPANISH = new Language("ES", "es", "Spanish", Class622.aClass622_8009, 5, "ES");
	public static Language LATIN_SPANISH = new Language("ES_MX", "es-mx", "Spanish (Latin American)",
			Class622.aClass622_8012, 6, "MX");
	public static final int COUNT = 7;
	public static Language PORTUGUESE = new Language("PT", "pt", "Portuguese", Class622.aClass622_8012, 3, "BR");
	public static Language ENGLISH = new Language("EN", "en", "English", Class622.aClass622_8012, 0, "GB");

	public static int anInt7969;

	static {
		Language[] values = values();
		languages = new Language[values.length];
		for (Language language : values) {
			if (null != languages[552897085 * language.id]) {
				throw new IllegalStateException();
			}

			languages[language.id * 552897085] = language;
		}
	}

	public static Language valueOf(int ordinal) {
		if (ordinal < 0 || ordinal >= languages.length) {
			return null;
		}

		return languages[ordinal];
	}

	public static Language[] values() {
		return new Language[] { DUTCH, GERMAN, PORTUGUESE, LATIN_SPANISH, ENGLISH, FRENCH, SPANISH };
	}

	String language;
	String name;
	public int id;
	Locale locale;

	Language(String name, String language, String string_1_, Class622 class622, int id, String country) {
		this.name = name;
		this.language = language;
		this.id = -291316459 * id;

		if (country != null) {
			locale = new Locale(language.substring(0, 2), country);
		} else {
			locale = new Locale(language.substring(0, 2));
		}
	}

	public Locale getLocale() {
		return locale;
	}

	@Override
	public int getId() {
		return id * 552897085;
	}

	@Override
	public String toString() {
		return getLanguage().toLowerCase(Locale.ENGLISH);
	}

	String getLanguage() {
		return language;
	}

}