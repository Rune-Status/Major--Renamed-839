package com.jagex;

public class EquipmentDefaults {
	public static final int anInt7541 = 0;
	public static final int anInt7547 = 1;
	public static EquipmentDefaults defaults;
	static final int anInt7542 = 2;

	static String aString7549;

	public static int method9463() {
		if (-1 == ArchiveType.anInt8448 * 248036131) {
			for (ArchiveType type : ArchiveType.values()) {
				if (type.id * -775571705 > ArchiveType.anInt8448 * 248036131) {
					ArchiveType.anInt8448 = type.id * 848590029;
				}
			}

			ArchiveType.anInt8448 += 1509706891;
		}

		return 248036131 * ArchiveType.anInt8448;
	}

	public int[] hidden;
	public int[] hiddenAnimationOffhandSlots;
	public int[] hiddenAnimationWeaponSlots;
	public int offhandSlot = 439679369;
	public int weaponSlot = -1197710035;

	public EquipmentDefaults(Archive defaults) {
		byte[] data = defaults.get(-1881625811 * Class577.EQUIPMENT.file);
		decode(new Buffer(data));
	}

	void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (0 == opcode) {
				break;
			}

			if (1 == opcode) {
				int count = buffer.readUByte();
				hidden = new int[count];

				for (int index = 0; index < hidden.length; index++) {
					hidden[index] = buffer.readUByte();

					if (hidden[index] != 0 && hidden[index] != 2) {

					}
				}
			} else if (3 == opcode) {
				offhandSlot = buffer.readUByte() * -439679369;
			} else if (4 == opcode) {
				weaponSlot = buffer.readUByte() * 1197710035;
			} else if (opcode == 5) {
				hiddenAnimationOffhandSlots = new int[buffer.readUByte()];

				for (int index = 0; index < hiddenAnimationOffhandSlots.length; index++) {
					hiddenAnimationOffhandSlots[index] = buffer.readUByte();
				}
			} else if (opcode == 6) {
				hiddenAnimationWeaponSlots = new int[buffer.readUByte()];

				for (int index = 0; index < hiddenAnimationWeaponSlots.length; index++) {
					hiddenAnimationWeaponSlots[index] = buffer.readUByte();
				}
			}
		}

		if (null == hidden) {
			throw new RuntimeException("");
		}
	}

}