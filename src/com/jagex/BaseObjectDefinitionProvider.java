package com.jagex;

public abstract class BaseObjectDefinitionProvider {
	public static int anInt7322;

	BaseModel[] aClass144Array7315 = new BaseModel[4];
	ReferenceCache<Model> aClass168_7318 = new ReferenceCache<Model>(500);
	ReferenceCache<Model> aClass168_7319 = new ReferenceCache<Model>(50);
	Tuple<Model, Shadow> aClass674_7321 = new Tuple<Model, Shadow>(null, null);
	int anInt7317;
	String[] defaultActions;
	boolean membersServer;
	ReferenceCache<Tuple<Model, Shadow>> tuples = new ReferenceCache<Tuple<Model, Shadow>>(30);

	BaseObjectDefinitionProvider(boolean members, Language language, GameContext context) {
		membersServer = members;

		if (context == GameContext.RUNESCAPE) {
			defaultActions = new String[] { null, null, null, null, null,
					TranslatableString.EXAMINE.translate(language) };
		} else {
			defaultActions = new String[] { null, null, null, null, null, null };
		}
	}

	void clear(int i) {
		anInt7317 = i * -844860995;
		synchronized (aClass168_7318) {
			aClass168_7318.clear();
		}

		synchronized (tuples) {
			tuples.clear();
		}

		synchronized (aClass168_7319) {
			aClass168_7319.clear();
		}
	}

	void clearSoft() {
		synchronized (aClass168_7318) {
			aClass168_7318.clearSoft();
		}

		synchronized (tuples) {
			tuples.clearSoft();
		}

		synchronized (aClass168_7319) {
			aClass168_7319.clearSoft();
		}
	}

	abstract byte[] getModel(int id);

	abstract boolean modelLoaded(int id);

	void reset() {
		synchronized (aClass168_7318) {
			aClass168_7318.clear();
		}

		synchronized (tuples) {
			tuples.clear();
		}

		synchronized (aClass168_7319) {
			aClass168_7319.clear();
		}

		aClass144Array7315 = new BaseModel[4];
		aClass674_7321 = new Tuple(null, null);
	}

	void setMembers(boolean members) {
		if (membersServer != members) {
			membersServer = members;
			reset();
		}
	}

	void sweep(int age) {
		synchronized (aClass168_7318) {
			aClass168_7318.sweep(age);
		}

		synchronized (tuples) {
			tuples.sweep(age);
		}

		synchronized (aClass168_7319) {
			aClass168_7319.sweep(age);
		}
	}

}