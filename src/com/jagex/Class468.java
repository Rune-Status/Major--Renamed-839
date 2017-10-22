package com.jagex;

public class Class468 {
	static final void method7911(Widget widget, Interface class221, ScriptExecutionContext script) {
		script.anInt7924 -= 195773364;
		widget.basePositionX = script.anIntArray7942[1841827045 * script.anInt7924] * 2065256071;
		widget.basePositionY = script.anIntArray7942[1 + script.anInt7924 * 1841827045] * -970876179;
		int i_0_ = script.anIntArray7942[script.anInt7924 * 1841827045 + 2];
		if (i_0_ < 0) {
			i_0_ = 0;
		} else if (i_0_ > 5) {
			i_0_ = 5;
		}
		int i_1_ = script.anIntArray7942[script.anInt7924 * 1841827045 + 3];
		if (i_1_ < 0) {
			i_1_ = 0;
		} else if (i_1_ > 5) {
			i_1_ = 5;
		}
		widget.aByte2400 = (byte) i_0_;
		widget.aByte2381 = (byte) i_1_;
		Widget.redraw(widget);
		AsynchronousInputStream.method8775(class221, widget);
		if (widget.type * 1558474223 == 0) {
			Class548.method9327(class221, widget, false);
		}
		if (-592186295 * widget.component == -1 && !class221.aBool2278) {
			PulseEvent.resetWidgetPosition(1857819631 * widget.id);
		}
	}

	public int graphic = 738188555;
	public int anInt6481;
	public int anInt6482;
	public int anInt6483;
	public Class650 aClass650_6484;

	Class468(Mob mob) {
		aClass650_6484 = new Class650_Sub1(mob, false);
	}

}