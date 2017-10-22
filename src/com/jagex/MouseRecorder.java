package com.jagex;

public abstract class MouseRecorder {

	public abstract boolean leftButtonDown();

	public boolean buttonDown() {
		return leftButtonDown() || rightButtonDown() || middleButtonDown();
	}

	public abstract int getMouseX();

	public abstract int getMouseY();

	public abstract MouseRecord nextSubmission();

	public abstract boolean middleButtonDown();

	public abstract void stop();

	public abstract void submit();

	public abstract boolean rightButtonDown();

}