package com.jagex;

public class Interface {

	public static String filterName(CharSequence sequence, Class25 class25) {
		if (sequence == null) {
			return null;
		}

		int start = 0;
		int end;
		for (end = sequence.length(); start < end && ProgramDefinition.illegalNameCharacter(sequence.charAt(start)); start++) {

		}

		for (; end > start && ProgramDefinition.illegalNameCharacter(sequence.charAt(end - 1)); end--) {

		}

		int length = end - start;
		if (length < 1 || length > Class474.maximumLength(class25)) {
			return null;
		}

		StringBuilder builder = new StringBuilder(length);
		for (int index = start; index < end; index++) {
			char c = sequence.charAt(index);

			if (MovementType.method10455(c)) {
				char character = Class593.method10044(c);
				if ('\0' != character) {
					builder.append(character);
				}
			}
		}

		if (builder.length() == 0) {
			return null;
		}

		return builder.toString();
	}

	public boolean aBool2278;
	public Widget[] children;
	Widget[] copy;

	Interface(boolean bool, Widget[] children) {
		this.children = children;
		aBool2278 = bool;
	}

	public Widget getChild(int id) {
		if (1857819631 * children[0].id >>> 16 != id >>> 16) {
			throw new IllegalArgumentException();
		}

		return children[id & 0xffff];
	}

	public Widget[] getChildren() {
		if (null == copy) {
			int length = children.length;
			copy = new Widget[length];
			System.arraycopy(children, 0, copy, 0, children.length);
		}

		return copy;
	}

	public Widget[] method4158() {
		return copy == null ? children : copy;
	}

	static final void method9889(int index) {
		if (Widget.loadInterface(index, null)) {
			MobDefaults.method9582(Class598.loadedInterfaces[index].children, -1);
		}
	}

	static void method5417(Interface class221, Widget class226) {
		if (null != class226) {
			if (-1 != class226.component * -592186295) {
				Widget class226_0_ = class221.getChild(1920469085 * class226.parent);
				if (class226_0_ != null) {
					if (class226_0_.aClass226Array2542 == class226_0_.aClass226Array2521) {
						class226_0_.aClass226Array2521 = new Widget[class226_0_.aClass226Array2542.length];
						class226_0_.aClass226Array2521[class226_0_.aClass226Array2521.length - 1] = class226;
						Class627.method13077(class226_0_.aClass226Array2542, 0, class226_0_.aClass226Array2521, 0,
								-592186295 * class226.component);
						Class627.method13077(class226_0_.aClass226Array2542, 1 + -592186295 * class226.component,
								class226_0_.aClass226Array2521, class226.component * -592186295,
								class226_0_.aClass226Array2542.length - -592186295 * class226.component - 1);
					} else {
						int i_1_ = 0;
						Widget[] class226s;
						for (class226s = class226_0_.aClass226Array2521; i_1_ < class226s.length
								&& class226s[i_1_] != class226; i_1_++) {
	
						}
						if (i_1_ < class226s.length) {
							Class627.method13077(class226s, i_1_ + 1, class226s, i_1_, class226s.length - i_1_ - 1);
							class226s[class226_0_.aClass226Array2521.length - 1] = class226;
						}
					}
				}
			} else {
				Widget[] widgets = class221.getChildren();
				int i_2_;
				for (i_2_ = 0; i_2_ < widgets.length && class226 != widgets[i_2_]; i_2_++) {
	
				}
	
				if (i_2_ < widgets.length) {
					Class627.method13077(widgets, 1 + i_2_, widgets, i_2_, widgets.length - i_2_ - 1);
					widgets[widgets.length - 1] = class226;
				}
			}
		}
	}

	public static Interface get(int id) {
		return Class598.loadedInterfaces[id >> 16];
	}

}