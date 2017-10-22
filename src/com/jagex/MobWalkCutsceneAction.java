package com.jagex;

public class MobWalkCutsceneAction extends CutsceneAction {
	static Widget method15116(Widget widget) {
		Widget class226_0_ = Client.method17024(widget);
		if (null == class226_0_) {
			class226_0_ = widget.aClass226_2478;
		}
		return class226_0_;
	}

	int index;
	int walk;
	int plane;

	MobWalkCutsceneAction(Buffer buffer) {
		super(buffer);
		index = buffer.readUShort() * 117232353;
		walk = buffer.readUShort() * 1735991359;
		plane = buffer.readUByte() * 681273215;
	}

	@Override
	public void execute() {
		CutsceneMob mob = CutsceneMob.mobs[index * -1505496799];
		CutsceneWalk walk = CutsceneWalk.walks[-1594699841 * this.walk];
		walk.walk(mob, 447502463 * plane);
	}

}