package com.jagex;

public class MoveMobCutsceneAction extends CutsceneAction {

	int y;
	int x;
	int direction;
	int plane;
	int index;

	MoveMobCutsceneAction(Buffer buffer) {
		super(buffer);
		index = buffer.readUShort() * -1339050143;
		int position = buffer.readInt();
		x = (position >>> 16) * 825888943;
		y = -1508217483 * (position & 0xffff);
		plane = buffer.readUByte() * 1074234395;
		direction = buffer.readSmart() * 1764212829;
	}

	@Override
	public void execute() {
		CutsceneMob.mobs[index * -702993247].move(-116701617 * x, y * 695679709, plane * 1928508947,
				226890741 * direction);
	}

}