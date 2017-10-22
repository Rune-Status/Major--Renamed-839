package com.jagex;

public class MenuOption extends Cacheable {
	static Deque<MenuOption> options;

	static boolean before(int first, int second) {
		if (second >= 1000 && first < 1000) {
			return true;
		} else if (second < 1000 && first < 1000) {
			if (Class455.method7421(first)) {
				return true;
			}

			return !Class455.method7421(second);
		}

		return second >= 1000 && first >= 1000;
	}

	static void insert(MenuOption option) {
		if (null != option) {
			MenuOption.options.pushBack(option);
			Class56.menuOptionCount += 2089787607;
			MenuCategory category;

			if (!option.independent && !"".equals(option.target)) {
				long key = option.key * -6309744751763661005L;
				for (category = MenuCategory.categories.get(key); category != null
						&& !category.title.equals(option.target); category = MenuCategory.categories.nextInBucket()) {

				}

				if (category == null) {
					category = MenuCategory.cache.get(key);
					if (null != category && !category.title.equals(option.target)) {
						category = null;
					}

					if (category == null) {
						category = new MenuCategory(option.target);
					}

					MenuCategory.categories.put(key, category);
					MenuCategory.count += -450043263;
				}
			} else {
				category = new MenuCategory(option.target);
				MenuCategory.count += -450043263;
			}

			if (category.add(option)) {
				MenuCategory.reposition(category);
			}
		}
	}

	boolean aBool11412;
	boolean aBool11417;
	String action;
	long primary;
	int secondary;
	int tertiary;
	String aString11415;
	int cursor;
	boolean independent;
	int item;
	long key;

	String target;

	int type;
	static MenuOption aClass480_Sub31_Sub17_348;

	MenuOption(String action, String target, int cursor, int type, int item, long primary, int secondary, int tertiary,
			boolean bool, boolean bool_2, long key, boolean independent) {
		this.target = target;
		this.action = action;
		this.cursor = 1464369171 * cursor;
		this.type = -1226735199 * type;
		this.item = 86543237 * item;
		this.primary = 6871826772339952485L * primary;
		this.secondary = 1578736833 * secondary;
		this.tertiary = tertiary * 1436137301;
		aBool11412 = bool;
		aBool11417 = bool_2;
		this.key = key * -521596808906591237L;
		this.independent = independent;
	}

	public long getKey() {
		return key * -6309744751763661005L;
	}

	public long getPrimary() {
		return primary * -1867655888037237139L;
	}

	public static String getAction(MenuOption option) {
		if (Class56.menuOpen || option == null) {
			return "";
		}
	
		return option.action;
	}

	static boolean method1628(int type) {
		return type == 57 || type == 58 || type == 1007 || type == 25 || 30 == type;
	}

	static void method727(MenuOption option) {
		if (!Class56.menuOpen) {
			option.unlink();
			Class56.menuOptionCount -= 2089787607;
			if (!option.independent) {
				long key = option.key * -6309744751763661005L;
				MenuCategory category;
				for (category = MenuCategory.categories.get(key); category != null
						&& !category.title.equals(option.target); category = MenuCategory.categories.nextInBucket()) {
				}
	
				if (category != null && category.remove(option)) {
					MenuCategory.reposition(category);
				}
			} else {
				for (MenuCategory category = (MenuCategory) Class56.aClass638_631.getFront(); category != null; category = (MenuCategory) Class56.aClass638_631
						.next()) {
					if (category.title.equals(option.target)) {
						boolean bool = false;
						for (MenuOption next = category.options.getFront(); next != null; next = category.options
								.next()) {
							if (option == next) {
								if (category.remove(option)) {
									MenuCategory.reposition(category);
								}
								bool = true;
								break;
							}
						}
	
						if (bool) {
							break;
						}
					}
				}
			}
		}
	}

	static void add(String action, String target, int cursor, int type, int item, long primary, int secondary,
			int tertiary, boolean bool, boolean bool_9_, long key, boolean independent) {
		if (!Class56.menuOpen && Class56.menuOptionCount * 84366055 < 500) {
			cursor = cursor != -1 ? cursor : -1573005291 * Client.anInt10782;

			MenuOption option = new MenuOption(action, target, cursor, type, item, primary, secondary, tertiary, bool,
					bool_9_, key, independent);
			insert(option);
		}
	}

}