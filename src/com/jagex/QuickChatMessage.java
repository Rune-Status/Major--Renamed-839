package com.jagex;

public class QuickChatMessage extends Cacheable {
	public boolean searchable = true;
	public int[] responses;
	int[][] configs;
	QuickChatMessageLoader loader;
	String[] message;
	int[] types;

	public String decodeMessage(Buffer buffer) {
		StringBuilder builder = new StringBuilder(80);
		if (null != types) {
			for (int index = 0; index < types.length; index++) {
				builder.append(message[index]);
				builder.append(loader.getInterpolant(getType(index), configs[index],
						buffer.readBytes(QuickChatMessageType.valueOf(types[index]).decodedSize * -1546296015)));
			}
		}

		builder.append(message[message.length - 1]);
		return builder.toString();
	}

	public void encode(Buffer buffer, int[] data) {
		if (types != null) {
			for (int index = 0; index < types.length && index < data.length; index++) {
				int size = getType(index).encodedSize * 1806062195;

				if (size > 0) {
					buffer.writeBytes(data[index], size);
				}
			}
		}
	}

	public int fillerCount() {
		if (types == null) {
			return 0;
		}

		return types.length;
	}

	public int getConfig(int type, int index) {
		if (types == null || type < 0 || type > types.length) {
			return -1;
		} else if (configs[type] == null || index < 0 || index > configs[type].length) {
			return -1;
		}

		return configs[type][index];
	}

	public String getMessage() {
		StringBuilder builder = new StringBuilder(80);
		if (null == message) {
			return "";
		}

		builder.append(message[0]);
		for (int index = 1; index < message.length; index++) {
			for (int ellipsis = 0; ellipsis < 3; ellipsis++) {
				builder.append('.');
			}

			builder.append(message[index]);
		}

		return builder.toString();
	}

	public QuickChatMessageType getType(int index) {
		if (null == types || index < 0 || index > types.length) {
			return null;
		}

		return QuickChatMessageType.valueOf(types[index]);
	}

	void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	void decode(Buffer buffer, int opcode) {
		if (opcode == 1) {
			message = Class374.splitString(buffer.readString(), '<');
		} else if (2 == opcode) {
			int count = buffer.readUByte();
			responses = new int[count];

			for (int index = 0; index < count; index++) {
				responses[index] = buffer.readUShort();
			}
		} else if (opcode == 3) {
			int count = buffer.readUByte();
			types = new int[count];
			configs = new int[count][];

			for (int index = 0; index < count; index++) {
				int typeId = buffer.readUShort();
				QuickChatMessageType type = QuickChatMessageType.valueOf(typeId);

				if (type != null) {
					types[index] = typeId;
					configs[index] = new int[type.configs * -1588267185];

					for (int config = 0; config < -1588267185 * type.configs; config++) {
						configs[index][config] = buffer.readUShort();
					}
				}
			}
		} else if (opcode == 4) {
			searchable = false;
		}
	}

	void relativise() {
		if (null != responses) {
			for (int index = 0; index < responses.length; index++) {
				responses[index] |= 0x8000;
			}
		}
	}

}