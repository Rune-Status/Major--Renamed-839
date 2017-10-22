package com.jagex;

import java.util.Date;

public class Class181 implements Interface21 {
	public static void method3550() {
		Sprite.aClass116_7904 = null;
		Class272.aClass116_3008 = null;
		Class338.aClass116_3626 = null;
		LatencyMonitor.aClass116_552 = null;
		Class255.aClass116_2834 = null;
		BufferedConnectionContext.aClass116_1212 = null;
		Class166_Sub19.aClass116_9633 = null;
		MobChatCutsceneAction.aClass116_9646 = null;
		VariableBitsDefinitionProvider.aClass132_9779 = null;
		Class592.aClass9_7834 = null;
	}

	static void method3557(long l) {
		CalendarUtils.GMT_CALENDAR.setTime(new Date(l));
	}

	Class200 aClass200_2001;
	Class195 this$0;

	Class181(Class195 class195, Buffer buffer) {
		this$0 = class195;
		boolean bool = buffer.readUByte() != 255;
		if (bool) {
			buffer.offset -= 1258142129;
		}
		aClass200_2001 = new Class200(buffer, bool, true, class195.anInterface22_2085);
	}

	@Override
	public void method131(Class192 class192) {
		class192.method3776(aClass200_2001);
	}

}