package com.jagex;

public class QuickChatCategoryLoader {
	static final int anInt4658 = 32768;
	static final int anInt4659 = 0;

	public static void method7009() {
		Class63.anInt943 = 742271049;
	}

	static void method7010(Toolkit toolkit, int i, int i_4_, int i_5_, int i_6_, int i_7_, int i_8_, int i_9_) {
		toolkit.method2805(i, i_4_, i_5_, i_6_, i_7_);
		toolkit.method2805(1 + i, i_4_ + 1, i_5_ - 2, 16, i_8_);
		toolkit.method2747(1 + i, 18 + i_4_, i_5_ - 2, i_6_ - 19, i_8_);
	}

	Archive restricted;
	ReferenceCache<QuickChatCategory> cache = new ReferenceCache<QuickChatCategory>(64);
	Archive quickChat;

	public QuickChatCategoryLoader(Language language, Archive quickChat, Archive restrictedQuickChat) {
		this.quickChat = quickChat;
		restricted = restrictedQuickChat;

		if (null != quickChat) {
			quickChat.childSize(0);
		}

		if (restricted != null) {
			restricted.childSize(0);
		}
	}

	public QuickChatCategory get(int id) {
		QuickChatCategory category = cache.get(id);
		if (category != null) {
			return category;
		}

		byte[] data;
		if (id >= 32768) {
			data = restricted.get(0, id & 0x7fff);
		} else {
			data = quickChat.get(0, id);
		}

		category = new QuickChatCategory();
		if (null != data) {
			category.decode(new Buffer(data));
		}

		if (id >= 32768) {
			category.relativise();
		}

		cache.put(id, category);
		return category;
	}

}