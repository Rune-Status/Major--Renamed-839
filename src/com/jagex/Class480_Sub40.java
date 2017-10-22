package com.jagex;

public abstract class Class480_Sub40 extends Linkable {
	protected static final int anInt10359 = 4095;
	protected static final int anInt10360 = 12;
	protected static final int anInt10361 = 8192;
	protected static final int anInt10362 = 2048;
	protected static final int anInt10363 = 4096;
	public static final float aFloat10364 = 4096.0F;

	static void method16234(Widget widget, int i) {
		if (Client.widgetSelected) {
			if (null != widget.anObjectArray2510) {
				Widget class226_0_ = Class185.method3584(1969702363 * Class490.anInt6751, -800680953
						* Client.anInt10756);
				if (null != class226_0_) {
					ScriptContext script = new ScriptContext();
					script.source = widget;
					script.target = class226_0_;
					script.arguments = widget.anObjectArray2510;
					Script.execute(script);
				}
			}

			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4025,
					Client.gameConnection.encryptor);
			frame.payload.writeShort(widget.component * -592186295);
			frame.payload.writeShortA(Client.anInt10756 * -800680953);
			frame.payload.writeIMEInt(1969702363 * Class490.anInt6751);
			frame.payload.writeShort(widget.item * 1391525437);
			frame.payload.writeIMEInt(1857819631 * widget.id);
			frame.payload.writeShort(Client.anInt10867 * -224153241);
			Client.gameConnection.sendFrame(frame);
		}
	}

	Class480_Sub40(int i, boolean bool) {

	}

}