package com.jagex;

import java.util.Iterator;

class PlayerVarpDefinitionIterator implements Iterator<PlayerVariableParameterDefinition> {
	public static MenuOption method4143() {
		return MenuOption.aClass480_Sub31_Sub17_348;
	}

	static void method4139(Toolkit toolkit, Widget widget) {
		boolean bool = ItemDefinition.loader.getCachedSprite(toolkit, widget.item * 1391525437, -1212380503
				* widget.itemAmount, widget.anInt2432 * 972044571, ~0xffffff | -1694773323 * widget.anInt2425,
				1276796321 * widget.anInt2435, widget.aBool2532 ? Client.localPlayer.appearance : null) == null;
		if (bool) {
			Class49.aClass644_579.pushBack(new Class480_Sub2(widget.item * 1391525437, widget.itemAmount * -1212380503,
					widget.anInt2432 * 972044571, ~0xffffff | -1694773323 * widget.anInt2425,
					widget.anInt2435 * 1276796321, widget.aBool2532));
			Widget.redraw(widget);
		}
	}

	PlayerVarpDefinitionLoader loader;
	int index;

	PlayerVarpDefinitionIterator(PlayerVarpDefinitionLoader loader) {
		this.loader = loader;
	}

	@Override
	public boolean hasNext() {
		return index * -612307497 < loader.count();
	}

	@Override
	public PlayerVariableParameterDefinition next() {
		int next = (index += 1572296167) * -612307497 - 1;
		PlayerVariableParameterDefinition definition = loader.cache.get(next);
		if (null != definition) {
			return definition;
		}

		return loader.load(next);
	}

	@Override
	public void remove() {
		throw new UnsupportedOperationException();
	}

}