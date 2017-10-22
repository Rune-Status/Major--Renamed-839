package com.jagex;

public class Class166_Sub21 extends CutsceneAction {

	static int method15136(Widget widget, int i) {
		if (!Client.method17050(widget).method15632(i) && widget.anObjectArray2553 == null) {
			return -1;
		}
		return null != widget.anIntArray2476 && widget.anIntArray2476.length > i ? widget.anIntArray2476[i] : -1;
	}

	int anInt9639;

	int anInt9640;

	public static int anInt546;

	Class166_Sub21(Buffer buffer) {
		super(buffer);
		anInt9640 = buffer.readUShort() * 306153011;
		anInt9639 = buffer.readInt() * 1923012835;
	}

	@Override
	public void execute() {
		Client.anInt10872 = Client.tick * -1914923795;
		Client.anInt10700 = -1236480255 * (anInt9640 * 285664507 + Client.tick);
		BaseVarpDefinitionLoader.anInt1130 = Client.anInt10684 * -943169975;
		BufferedConnectionContext.anInt1211 = -1722576319 * Client.anInt10685;
		Class166_Sub21.anInt546 = Client.anInt10774 * -1464786379;
		Class338.anInt3624 = Client.anInt10689 * -1308626881;
		Client.anInt10684 = (anInt9639 * 2023828683 >>> 24) * -635735751;
		Client.anInt10685 = (anInt9639 * 2023828683 >>> 16 & 0xff) * 2034113029;
		Client.anInt10774 = (2023828683 * anInt9639 >>> 8 & 0xff) * 1753584869;
		Client.anInt10689 = (2023828683 * anInt9639 & 0xff) * 727899805;
	}

}