package com.jagex;

public class MobMessage {

	int effect;
	int colour;
	String text;
	int duration;
	int remaining;

	public int getColour() {
		return 1230417231 * colour;
	}

	public int getEffect() {
		return 415667519 * effect;
	}

	public int getDuration() {
		return duration * 1871047931;
	}

	public int getRemaining() {
		return -807155211 * remaining;
	}

	public String getText() {
		return text;
	}

}