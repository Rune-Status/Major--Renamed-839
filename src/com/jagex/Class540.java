package com.jagex;

public class Class540 {
	public static void method9217() {
		if ((16 == Client.gameState * -1501875989 || Client.gameState * -1501875989 == 13)
				&& null != Client.gameConnection) {
			for (;;) {
				Encodeable encodeable = Class529.aLinkedList7226.poll();
				if (null == encodeable) {
					break;
				}

				encodeable.encode();
			}
		}
	}

	public static void animateObject(int plane, int localX, int localZ, int group, int type, int orientation,
			int animation, int i_13_) {
		if (localX >= 0 && localZ >= 0 && localX < Client.aClass460_10760.method7680() - 1
				&& localZ < Client.aClass460_10760.method7707() - 1) {

			if (Client.aClass460_10760.method7687() != null) {
				if (0 == group) {
					SceneObject interface55 = (SceneObject) Client.aClass460_10760.method7687().method8345(plane,
							localX, localZ);
					SceneObject interface55_1 = (SceneObject) Client.aClass460_10760.method7687().method8346(plane,
							localX, localZ);

					if (interface55 != null && type != 2) {
						if (interface55 instanceof Wall) {
							((Wall) interface55).aClass481_11620.method8199(animation, i_13_);
						} else {
							Class268.method5051(plane, group, localX, localZ, interface55.getId(), orientation, type,
									animation, i_13_);
						}
					}
					if (interface55_1 != null) {
						if (interface55_1 instanceof Wall) {
							((Wall) interface55_1).aClass481_11620.method8199(animation, i_13_);
						} else {
							Class268.method5051(plane, group, localX, localZ, interface55_1.getId(), orientation, type,
									animation, i_13_);
						}
					}
				} else if (group == 1) {
					SceneObject interface55 = (SceneObject) Client.aClass460_10760.method7687().method8347(plane,
							localX, localZ);
					if (null != interface55) {
						if (interface55 instanceof WallDecoration) {
							((WallDecoration) interface55).aClass481_11625.method8199(animation, i_13_);
						} else {
							int i_16_ = interface55.getId();
							if (4 == type || type == 5) {
								Class268.method5051(plane, group, localX, localZ, i_16_, orientation, 4, animation,
										i_13_);
							} else if (6 == type) {
								Class268.method5051(plane, group, localX, localZ, i_16_, orientation + 4, 4, animation,
										i_13_);
							} else if (type == 7) {
								Class268.method5051(plane, group, localX, localZ, i_16_, (2 + orientation & 0x3) + 4,
										4, animation, i_13_);
							} else if (8 == type) {
								Class268.method5051(plane, group, localX, localZ, i_16_, 4 + orientation, 4, animation,
										i_13_);
								Class268.method5051(plane, group, localX, localZ, i_16_, 4 + (orientation + 2 & 0x3),
										4, animation, i_13_);
							}
						}
					}
				} else if (group == 2) {
					SceneObject interface55 = (SceneObject) Client.aClass460_10760.method7687().method8349(plane,
							localX, localZ, Client.anInterface57_10904);
					if (null != interface55) {
						if (type == 11) {
							type = 10;
						}

						if (interface55 instanceof GameObject) {
							((GameObject) interface55).aClass481_11575.method8199(animation, i_13_);
						} else {
							Class268.method5051(plane, group, localX, localZ, interface55.getId(), orientation, type,
									animation, i_13_);
						}
					}
				} else if (group == 3) {
					SceneObject interface55 = (SceneObject) Client.aClass460_10760.method7687().method8351(plane,
							localX, localZ);
					if (null != interface55) {
						if (interface55 instanceof GroundDecoration) {
							((GroundDecoration) interface55).aClass481_11588.method8199(animation, i_13_);
						} else {
							Class268.method5051(plane, group, localX, localZ, interface55.getId(), orientation, type,
									animation, i_13_);
						}
					}
				}
			}
		}
	}

	int[] anIntArray7331;
	long aLong7332;
	short[] aShortArray7333;
	short[] aShortArray7334;

	public Class540(long l, int[] is, short[] is_0_, short[] is_1_) {
		aLong7332 = -7895650378986125249L * l;
		anIntArray7331 = is;
		aShortArray7333 = is_0_;
		aShortArray7334 = is_1_;
	}

}