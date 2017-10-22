package com.jagex;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public final class ComponentKeyRecorder extends KeyRecorder implements KeyListener, FocusListener {

	static final int[] KEY_CODE_MAP = { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0,
			0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19,
			20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41,
			32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 89, 87, 0,
			88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 128, 129, 130, 131, 132, 133, 134, 135,
			136, 137, 138, 139, 140, 141, 142, 143, 0, 0, 0, 0, 0, 0, 150, 151, 152, 153, 0, 100, 0, 0, 0, 0, 160, 161,
			162, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
			0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

	static final int KEY_COUNT = 112;

	public static boolean recordable(char character) {
		if (character > 0 && character < '\u0080' || character >= '\u00a0' && character <= '\u00ff') {
			return true;
		}

		if (character != 0) {
			for (char unicode : Class612.UNICODE_TABLE) {
				if (unicode == character) {
					return true;
				}
			}
		}

		return false;
	}

	static void method16355() {
		int i_10_ = Engine.screenWidth * 1319181337;
		int i_11_ = Engine.screenHeight * -551672947;
		if (Engine.anInt6494 * -562696973 < i_10_) {
			i_10_ = Engine.anInt6494 * -562696973;
		}

		if (Class166_Sub15.anInt9602 * -1308048867 < i_11_) {
			i_11_ = Class166_Sub15.anInt9602 * -1308048867;
		}

		try {
			if (Class199.preferences != null) {
				Class380.aClass380_4215.method6223(new Object[] { Integer.valueOf(i_10_), Integer.valueOf(i_11_),
						Integer.valueOf(RendererType.windowMode()),
						Integer.valueOf(Class199.preferences.maxScreenSize.getValue()) });
			}
		} catch (Throwable throwable) {

		}
	}

	private static void adjustCodeMap() {
		KEY_CODE_MAP[44] = 71;
		KEY_CODE_MAP[45] = 26;
		KEY_CODE_MAP[46] = 72;
		KEY_CODE_MAP[47] = 73;
		KEY_CODE_MAP[59] = 57;
		KEY_CODE_MAP[61] = 27;
		KEY_CODE_MAP[91] = 42;
		KEY_CODE_MAP[92] = 74;
		KEY_CODE_MAP[93] = 43;
		KEY_CODE_MAP[192] = 28;
		KEY_CODE_MAP[222] = 58;
		KEY_CODE_MAP[520] = 59;
	}

	Component component;
	boolean[] heldKeys = new boolean[KEY_COUNT];
	Deque<ComponentKeyRecord> records = new Deque<ComponentKeyRecord>();
	Deque<ComponentKeyRecord> submitted = new Deque<ComponentKeyRecord>();

	ComponentKeyRecorder(Component component) {
		adjustCodeMap();
		setComponent(component);
	}

	@Override
	public synchronized void flush() {
		submitted.clear();

		for (ComponentKeyRecord record = records.popHead(); null != record; record = records.popHead()) {
			record.flags = getFlags() * 1109232395;
			if (KeyRecord.KEY_PRESSED_TYPE == record.type * 1466963227) {
				if (!heldKeys[-74310129 * record.code]) {
					ComponentKeyRecord submission = new ComponentKeyRecord();
					submission.type = 0;
					submission.character = '\uffff';
					submission.code = record.code;
					submission.time = record.time;
					submission.flags = record.flags;
					submitted.pushBack(submission);
					heldKeys[-74310129 * record.code] = true;
				}

				record.type = 483031590;
				submitted.pushBack(record);
			} else if (1466963227 * record.type == KeyRecord.KEY_RELEASED_TYPE) {
				if (heldKeys[-74310129 * record.code]) {
					submitted.pushBack(record);

					heldKeys[-74310129 * record.code] = false;
				}
			} else if (-1 == record.type * 1466963227) {
				for (int code = 0; code < heldKeys.length; code++) {
					if (heldKeys[code]) {
						ComponentKeyRecord submission = new ComponentKeyRecord();
						submission.type = 241515795;
						submission.character = '\uffff';
						submission.code = code * -117763857;
						submission.time = record.time;
						submission.flags = record.flags;

						submitted.pushBack(submission);
						heldKeys[code] = false;
					}
				}
			} else if (KeyRecord.KEY_TYPED_TYPE == record.type * 1466963227) {
				submitted.pushBack(record);
			}
		}
	}

	@Override
	public void focusGained(FocusEvent focusevent) {

	}

	@Override
	public synchronized void focusLost(FocusEvent focusevent) {
		record(-1, '\0', 0);
	}

	@Override
	public KeyRecord getNext() {
		return submitted.popHead();
	}

	@Override
	public boolean held(int index) {
		if (index < 0 || index >= heldKeys.length) {
			return false;
		}

		return heldKeys[index];
	}

	@Override
	public synchronized void keyPressed(KeyEvent event) {
		record(event, KeyRecord.KEY_PRESSED_TYPE);
	}

	@Override
	public synchronized void keyReleased(KeyEvent event) {
		record(event, KeyRecord.KEY_RELEASED_TYPE);
	}

	@Override
	public synchronized void keyTyped(KeyEvent event) {
		char character = event.getKeyChar();

		if (character != '\uffff' && recordable(character)) {
			record(KeyRecord.KEY_TYPED_TYPE, character, -1);
			event.consume();
		}
	}

	@Override
	public void stop() {
		reset();
	}

	int getFlags() {
		int flags = 0;
		if (heldKeys[81]) {
			flags |= 0x1;
		}

		if (heldKeys[82]) {
			flags |= 0x4;
		}

		if (heldKeys[86]) {
			flags |= 0x2;
		}

		return flags;
	}

	void record(int type, char character, int code) {
		ComponentKeyRecord record = new ComponentKeyRecord();
		record.type = type * 241515795;
		record.character = character;
		record.code = code * -117763857;
		record.time = TimeUtil.time() * -7495404956605221341L;
		records.pushBack(record);
	}

	void record(KeyEvent event, int type) {
		int code = event.getKeyCode();
		if (0 != code) {
			if (code >= 0 && code < KEY_CODE_MAP.length) {
				code = KEY_CODE_MAP[code];

				if (0 == type && 0 != (code & 0x80)) {
					code = 0;
				} else {
					code &= ~0x80;
				}
			} else {
				code = 0;
			}
		} else {
			code = 0;
		}

		if (0 != code) {
			record(type, '\uffff', code);
			event.consume();
		}
	}

	void reset() {
		if (component != null) {
			component.removeKeyListener(this);
			component.removeFocusListener(this);
			component = null;

			for (int index = 0; index < heldKeys.length; index++) {
				heldKeys[index] = false;
			}

			submitted.clear();
			records.clear();
		}
	}

	void setComponent(Component component) {
		reset();
		this.component = component;
		component.addKeyListener(this);
		component.addFocusListener(this);
	}

}