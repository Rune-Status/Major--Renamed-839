package com.jagex;

public enum NpcDirection implements Identifiable {

	EAST(2, 2),
	NORTH(0, 0),
	NORTH_EAST(7, 1),
	NORTH_WEST(5, 7),
	SOUTH(6, 4),
	SOUTH_EAST(1, 3),
	SOUTH_WEST(3, 5),
	WEST(4, 6);

	public static int method10426(int i, int i_1_) {
		int i_3_ = 1;
		for (; i_1_ > 1; i_1_ >>= 1) {
			if ((i_1_ & 0x1) != 0) {
				i_3_ *= i;
			}
			i *= i;
		}

		if (i_1_ == 1) {
			return i * i_3_;
		}

		return i_3_;
	}

	public int value;
	int id;

	NpcDirection(int value, int id) {
		this.value = value * 1815043641;
		this.id = id * -1057448649;
	}

	@Override
	public int getId() {
		return id * -594564985;
	}

	public NpcDirection opposite() {
		switch (value * -435998711) {
			case 0: // north
				return SOUTH;
			case 1: // south east
				return NORTH_WEST;
			case 2: // east
				return WEST;
			case 3: // south west
				return NORTH_EAST;
			case 4: // west
				return EAST;
			case 5: // north west
				return SOUTH_EAST;
			case 6: // south
				return NORTH;
			case 7: // north east
				return SOUTH_WEST;
			default:
				throw new IllegalStateException();
		}
	}

}