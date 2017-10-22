package com.jagex;

public class Class183 implements Interface23 {

	public static final void method3576(boolean bool, int i, int i_7_) {
		Class480_Sub33 class480_sub33 = bool ? Class417.aClass480_Sub33_4650 : Class486.aClass480_Sub33_6643;
		if (null != class480_sub33 && i >= 0 && i < 1777256127 * class480_sub33.anInt10228) {
			Class283 class283 = class480_sub33.aClass283Array10233[i];
			if (-1 == class283.aByte3163) {
				String string = class283.aString3165;
				BufferedConnectionContext connection = Client.getActiveConnection();
				OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4015, connection.encryptor);
				frame.payload.writeByte(3 + Buffer.encodedStringLength(string));
				frame.payload.writeByte(bool ? 1 : 0);
				frame.payload.writeShort(i);
				frame.payload.writeCString(string);
				connection.sendFrame(frame);
			}
		}
	}

	static void submitConsoleMessage(boolean retainText) {
		Class65.consoleText = Class65.consoleText.trim();
		Class65.anInt1008 = 0;

		if (Class65.consoleText.length() == 0) {
			Class65.consoleTextIndex = 0;
		} else {
			CutsceneMob.printConsoleMessage("--> " + Class65.consoleText);
			Client.processConsoleCommand(Class65.consoleText, false, retainText);

			if (!retainText) {
				Class65.consoleTextIndex = 0;
				Class65.consoleText = "";
			} else {
				Class65.consoleTextIndex = Class65.consoleText.length() * -1223481467;
			}
		}
	}

	int anInt2003;
	Class195 this$0;
	int anInt2004;

	Class183(Class195 class195, Buffer buffer) {
		this$0 = class195;
		anInt2004 = buffer.readUShort() * 1810700571;
		anInt2003 = buffer.readUByte() * 508679105;
	}

	@Override
	public void method131(Class192 class192) {
		class192.method3780(1754437907 * anInt2004, anInt2003 * -1516749759);
		class192.method3806(1754437907 * anInt2004).method3888();
	}

}