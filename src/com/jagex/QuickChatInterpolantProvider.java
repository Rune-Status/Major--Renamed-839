package com.jagex;

public interface QuickChatInterpolantProvider {

	String provide(QuickChatMessageType type, int[] configs, long data);

}