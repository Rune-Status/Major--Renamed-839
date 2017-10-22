package com.jagex;

public class QuickChatMessageLoader {
	static final int anInt246 = 1;
	static final int anInt248 = 32768;

	public int anInt243;
	Archive restricted;
	public int anInt245 = 0;
	ReferenceCache<QuickChatMessage> cache = new ReferenceCache<QuickChatMessage>(64);
	Archive quickChat;
	QuickChatInterpolantProvider interpolantProvider;

	public QuickChatMessageLoader(Language language, Archive quickChat, Archive restricted,
			QuickChatInterpolantProvider interpolantProvider) {
		this.quickChat = quickChat;
		this.restricted = restricted;
		this.interpolantProvider = interpolantProvider;

		if (null != quickChat) {
			anInt245 = quickChat.childSize(1) * -1106864631;
		}

		if (null != restricted) {
			anInt243 = restricted.childSize(1) * -898423003;
		}
	}

	public QuickChatMessage get(int id) {
		QuickChatMessage message = cache.get(id);
		if (null != message) {
			return message;
		}

		byte[] data;
		if (id >= 32768) {
			data = restricted.get(1, id & 0x7fff);
		} else {
			data = quickChat.get(1, id);
		}

		message = new QuickChatMessage();
		message.loader = this;

		if (null != data) {
			message.decode(new Buffer(data));
		}

		if (id >= 32768) {
			message.relativise();
		}

		cache.put(id, message);
		return message;
	}

	String getInterpolant(QuickChatMessageType type, int[] configs, long data) {
		if (null != interpolantProvider) {
			String string = interpolantProvider.provide(type, configs, data);
			if (null != string) {
				return string;
			}
		}

		return Long.toString(data);
	}

}