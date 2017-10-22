package com.jagex;

public class SpawnAnimatedObjectCutsceneAction extends AnimatingCutsceneAction {
	static String aString11131;
	int x;
	int z;
	int plane;

	SpawnAnimatedObjectCutsceneAction(Buffer buffer) {
		super(buffer);
		int position = buffer.readInt();
		x = -23215031 * (position >>> 16);
		z = 137327545 * (position & 0xffff);
		plane = buffer.readUByte() * -912444753;
	}

	@Override
	public void execute() {
		int worldX = 256 + x * 1658581504;
		int worldZ = 256 + -1052438016 * z;
		int collisionPlane = plane * -90217393;

		if (collisionPlane < 3 && Client.aClass460_10760.method7775().isBridge(x * -902730247, z * -1033854327)) {
			collisionPlane++;
		}

		AnimatedObject object = new AnimatedObject(Client.aClass460_10760.method7687(), -1061921263 * graphic, 0,
				-90217393 * plane, collisionPlane, worldX, Class279.getAverageHeight(worldX, worldZ, plane * -90217393)
						- 988906481 * heightOffset, worldZ, x * -902730247, x * -902730247, z * -1033854327, z
						* -1033854327, -1659203509 * anInt9559, false, 0);
		Client.animatedObjects.put(x * -902730247 << 16 | z * -1033854327, new CacheableAnimatedObject(object));
	}

}