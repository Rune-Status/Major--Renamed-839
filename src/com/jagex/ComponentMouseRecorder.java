package com.jagex;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

public class ComponentMouseRecorder extends MouseRecorder implements MouseListener, MouseMotionListener,
		MouseWheelListener {
	static final int LEFT_BUTTON_DOWN = 1;
	static final int MIDDLE_BUTTON_DOWN = 4;
	static final int RIGHT_BUTTON_DOWN = 2;

	static final void method16425(ScriptExecutionContext class613) {
		class613.anInt7924 -= 195773364;
		Client.aShort10626 = (short) class613.anIntArray7942[class613.anInt7924 * 1841827045];
		if (Client.aShort10626 <= 0) {
			Client.aShort10626 = (short) 1;
		}
		Client.aShort10758 = (short) class613.anIntArray7942[1 + 1841827045 * class613.anInt7924];
		if (Client.aShort10758 <= 0) {
			Client.aShort10758 = (short) 32767;
		} else if (Client.aShort10758 < Client.aShort10626) {
			Client.aShort10758 = Client.aShort10626;
		}
		Client.aShort10902 = (short) class613.anIntArray7942[2 + class613.anInt7924 * 1841827045];
		if (Client.aShort10902 <= 0) {
			Client.aShort10902 = (short) 1;
		}
		Client.aShort10885 = (short) class613.anIntArray7942[3 + class613.anInt7924 * 1841827045];
		if (Client.aShort10885 <= 0) {
			Client.aShort10885 = (short) 32767;
		} else if (Client.aShort10885 < Client.aShort10902) {
			Client.aShort10885 = Client.aShort10902;
		}
	}

	int clickState;
	Component component;
	int mouseX;
	int mouseY;
	boolean recording;
	Deque records = new Deque();
	Deque submissions = new Deque();
	int submittedMouseX;
	int submittedMouseY;
	int submittedState;

	ComponentMouseRecorder(Component component, boolean recording) {
		setComponent(component);
		this.recording = recording;
	}

	@Override
	public int getMouseX() {
		return -2109711659 * submittedMouseX;
	}

	@Override
	public int getMouseY() {
		return submittedMouseY * 29955329;
	}

	@Override
	public boolean leftButtonDown() {
		return 0 != (-468590271 * submittedState & LEFT_BUTTON_DOWN);
	}

	@Override
	public boolean middleButtonDown() {
		return 0 != (submittedState * -468590271 & MIDDLE_BUTTON_DOWN);
	}

	@Override
	public synchronized void mouseClicked(MouseEvent event) {
		if (event.isPopupTrigger()) {
			event.consume();
		}
	}

	@Override
	public synchronized void mouseDragged(MouseEvent event) {
		updateMousePosition(event.getX(), event.getY());
	}

	@Override
	public synchronized void mouseEntered(MouseEvent event) {
		updateMousePosition(event.getX(), event.getY());
	}

	@Override
	public synchronized void mouseExited(MouseEvent event) {
		updateMousePosition(event.getX(), event.getY());
	}

	@Override
	public synchronized void mouseMoved(MouseEvent event) {
		updateMousePosition(event.getX(), event.getY());
	}

	@Override
	public synchronized void mousePressed(MouseEvent event) {
		int type = getType(event);

		if (type == LEFT_BUTTON_DOWN) {
			record(0, event.getX(), event.getY(), event.getClickCount());
		} else if (type == MIDDLE_BUTTON_DOWN) {
			record(2, event.getX(), event.getY(), event.getClickCount());
		} else if (RIGHT_BUTTON_DOWN == type) {
			record(1, event.getX(), event.getY(), event.getClickCount());
		}

		clickState = (clickState * 165472319 | type) * -1729427521;
		if (event.isPopupTrigger()) {
			event.consume();
		}
	}

	@Override
	public synchronized void mouseReleased(MouseEvent event) {
		int type = getType(event);
		if ((165472319 * clickState & type) == 0) {
			type = 165472319 * clickState;
		}

		if (0 != (type & LEFT_BUTTON_DOWN)) {
			record(3, event.getX(), event.getY(), event.getClickCount());
		}

		if (0 != (type & MIDDLE_BUTTON_DOWN)) {
			record(5, event.getX(), event.getY(), event.getClickCount());
		}

		if ((type & RIGHT_BUTTON_DOWN) != 0) {
			record(4, event.getX(), event.getY(), event.getClickCount());
		}

		clickState = (165472319 * clickState & (type ^ 0xffffffff)) * -1729427521;
		if (event.isPopupTrigger()) {
			event.consume();
		}
	}

	@Override
	public synchronized void mouseWheelMoved(MouseWheelEvent event) {
		int x = event.getX();
		int y = event.getY();
		int rotation = event.getWheelRotation();

		record(MouseRecord.WHEEL_TYPE, x, y, rotation);
		event.consume();
	}

	@Override
	public MouseRecord nextSubmission() {
		return (MouseRecord) submissions.popHead();
	}

	@Override
	public boolean rightButtonDown() {
		return (-468590271 * submittedState & RIGHT_BUTTON_DOWN) != 0;
	}

	@Override
	public void stop() {
		reset();
	}

	@Override
	public synchronized void submit() {
		submittedMouseX = 834027189 * mouseX;
		submittedMouseY = mouseY * -550410811;
		submittedState = clickState * -965023361;

		Deque tmp = submissions;
		submissions = records;
		records = tmp;
		records.clear();
	}

	int getType(MouseEvent event) {
		if (event.getButton() == MouseEvent.BUTTON1) {
			if (event.isMetaDown()) {
				return MIDDLE_BUTTON_DOWN;
			}

			return LEFT_BUTTON_DOWN;
		} else if (event.getButton() == MouseEvent.BUTTON2) {
			return RIGHT_BUTTON_DOWN;
		} else if (event.getButton() == MouseEvent.BUTTON3) {
			return MIDDLE_BUTTON_DOWN;
		}

		return 0;
	}

	void record(int type, int x, int y, int meta) {
		ComponentMouseRecord record = ComponentMouseRecord.create(type, x, y, TimeUtil.time(), meta);
		records.pushBack(record);
	}

	void reset() {
		if (null != component) {
			component.removeMouseWheelListener(this);
			component.removeMouseMotionListener(this);
			component.removeMouseListener(this);
			component = null;

			submittedState = 0;
			submittedMouseY = 0;
			submittedMouseX = 0;
			clickState = 0;
			mouseY = 0;
			mouseX = 0;

			submissions = null;
			records = null;
		}
	}

	void setComponent(Component component) {
		reset();
		this.component = component;

		component.addMouseListener(this);
		component.addMouseMotionListener(this);
		component.addMouseWheelListener(this);
	}

	void updateMousePosition(int x, int y) {
		mouseX = -1192581719 * x;
		mouseY = y * -1437417459;

		if (recording) {
			record(-1, x, y, 0);
		}
	}

	public static MouseRecorder create(Component component, boolean bool) {
		return new ComponentMouseRecorder(component, bool);
	}

	public static void record(MouseRecord record) {
		if (!BaseAnimationDefinitionProvider.method3320(-1501875989 * Client.gameState)) {
			record.cache();
		} else {
			ComponentMouseRecord.encoder.enqueue(record);
		}
	}

}