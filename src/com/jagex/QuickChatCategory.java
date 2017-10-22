package com.jagex;

public class QuickChatCategory extends Cacheable {
	public char[] messageHotkeys;
	public int[] messages;
	public String name;
	public int[] subcategories;
	public char[] subcategoryHotkeys;

	public int getMessage(char hotkey) {
		if (null == messages) {
			return -1;
		}

		for (int index = 0; index < messages.length; index++) {
			if (hotkey == messageHotkeys[index]) {
				return messages[index];
			}
		}

		return -1;
	}

	public int getSubcategory(char hotkey) {
		if (subcategories == null) {
			return -1;
		}

		for (int index = 0; index < subcategories.length; index++) {
			if (hotkey == subcategoryHotkeys[index]) {
				return subcategories[index];
			}
		}

		return -1;
	}

	void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			name = buffer.readString();
		} else if (opcode == 2) {
			int count = buffer.readUByte();
			subcategories = new int[count];
			subcategoryHotkeys = new char[count];

			for (int index = 0; index < count; index++) {
				subcategories[index] = buffer.readUShort();
				byte hotkey = buffer.readByte();
				subcategoryHotkeys[index] = 0 == hotkey ? '\0' : Class215.byteToChar(hotkey);
			}
		} else if (opcode == 3) {
			int count = buffer.readUByte();
			messages = new int[count];
			messageHotkeys = new char[count];

			for (int index = 0; index < count; index++) {
				messages[index] = buffer.readUShort();
				byte hotkey = buffer.readByte();
				messageHotkeys[index] = 0 == hotkey ? '\0' : Class215.byteToChar(hotkey);
			}
		} else if (opcode == 4) {
			return;
		}
	}

	void relativise() {
		if (null != messages) {
			for (int index = 0; index < messages.length; index++) {
				messages[index] |= 0x8000;
			}
		}

		if (subcategories != null) {
			for (int index = 0; index < subcategories.length; index++) {
				subcategories[index] |= 0x8000;
			}
		}
	}

}