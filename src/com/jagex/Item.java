package com.jagex;

public class Item extends Linkable {

	public static String getColourHtml(int colour) {
		return new StringBuilder().append("<col=").append(Integer.toHexString(colour)).append(">").toString();
	}

	int amount;
	public int id;

	Item(int id, int amount) {
		this.id = id * -867057323;
		this.amount = -1157124425 * amount;
	}

	static void addGroundItem(Item item, int x, int z, int plane) {
		long key = plane << 28 | z << 14 | x;
		ItemDeque deque = Client.groundItems.get(key);

		if (null == deque) {
			deque = new ItemDeque();
			Client.groundItems.put(key, deque);
			deque.items.pushBack(item);
		} else {
			ItemDefinition definition = ItemDefinition.loader.get(item.id * 1659909117);
			int value = -1037924515 * definition.value;
			if (definition.stackable * 1146503759 == 1) {
				value *= 392072967 * item.amount + 1;
			}

			for (Item existing = deque.items.head(); existing != null; existing = deque.items.next()) {
				definition = ItemDefinition.loader.get(existing.id * 1659909117);
				int existingValue = -1037924515 * definition.value;

				if (definition.stackable * 1146503759 == 1) {
					existingValue *= 1 + 392072967 * existing.amount;
				}

				if (value > existingValue) {
					Linkable.insertBefore(item, existing);
					return;
				}
			}

			deque.items.pushBack(item);
		}
	}

}