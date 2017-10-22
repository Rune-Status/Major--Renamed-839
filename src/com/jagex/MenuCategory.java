package com.jagex;

public class MenuCategory extends Cacheable {
	static ReferenceCache<MenuCategory> cache;
	static HashTable<MenuCategory> categories;
	public static int count;
	Queue<MenuOption> options = new Queue<MenuOption>();
	int size;
	String title;

	MenuCategory(String title) {
		this.title = title;
	}

	boolean add(MenuOption option) {
		boolean bool = true;
		option.uncache();
		MenuOption front = options.getFront();

		while (null != front) {
			if (MenuOption.before(-20536735 * option.type, front.type * -20536735)) {
				Cacheable.insertBefore(option, front);
				size += 1537028617;
				return !bool;
			}

			front = options.next();
			bool = false;
		}

		options.offer(option);
		size += 1537028617;
		return bool;
	}

	int firstType() {
		if (options.tail != options.tail.nextCacheable) {
			return ((MenuOption) options.tail.nextCacheable).type * -20536735;
		}

		return -1;
	}

	boolean remove(MenuOption option) {
		int type = firstType();
		option.uncache();
		size -= 1537028617;

		if (0 == size * 713555001) {
			unlink();
			uncache();
			MenuCategory.count -= -450043263;
			MenuCategory.cache.put(-6309744751763661005L * option.key, this);
			return false;
		}

		return type != firstType();
	}

	static int getTitleWidth(MenuCategory category, FontSpecification specification) {
		String string = getTitle(category);
		return specification.textWidth(string, Class368.aClass116Array4053);
	}

	static String getTitle(MenuCategory category) {
		return new StringBuilder().append(category.title).append(Item.getColourHtml(16777215)).append(" >").toString();
	}

	static void reposition(MenuCategory category) {
		boolean inserted = false;
		category.uncache();
		for (MenuCategory front = (MenuCategory) Class56.aClass638_631.getFront(); front != null; front = (MenuCategory) Class56.aClass638_631
				.next()) {
			if (MenuOption.before(category.firstType(), front.firstType())) {
				Cacheable.splice(category, front);
				inserted = true;
				break;
			}
		}

		if (!inserted) {
			Class56.aClass638_631.offer(category);
		}
	}

}