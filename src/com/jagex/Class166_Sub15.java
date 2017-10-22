package com.jagex;

public class Class166_Sub15 extends CutsceneAction {
	protected static int anInt9602;

	public static int method15125(int i, int i_0_, int orientation) {
		orientation &= 0x3;

		if (orientation == 0) {
			return i;
		} else if (1 == orientation) {
			return i_0_;
		} else if (orientation == 2) {
			return 7 - i;
		}

		return 7 - i_0_;
	}

	int value;
	long key;

	Class166_Sub15(Buffer buffer, boolean bool) {
		super(buffer);
		int key = buffer.readUShort();

		if (bool) {
			this.key = (0x100000000L | key) * -5796775071145667775L;
		} else {
			this.key = key * -5796775071145667775L;
		}

		value = buffer.readInt() * -1665889977;
	}

	@Override
	public void execute() {
		LinkableInt linkable = Class163.variables.get(key * 1939263203405511873L);
		if (null != linkable) {
			linkable.value = value * -1348647255;
		} else {
			Class163.variables.put(1939263203405511873L * key, new LinkableInt(1348620407 * value));
		}
	}

}