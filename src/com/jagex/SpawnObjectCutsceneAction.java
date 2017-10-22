package com.jagex;

public class SpawnObjectCutsceneAction extends CutsceneAction {
	static int method15148(Class562_Sub1 class562_sub1, Class562_Sub1 class562_sub1_0_, int i, boolean bool, int i_1_,
			boolean bool_2_, int i_3_) {
		int i_4_ = ParallelHttpProvider.method7170(class562_sub1, class562_sub1_0_, i, bool);
		if (i_4_ != 0) {
			if (bool) {
				return -i_4_;
			}
			return i_4_;
		}
		if (-1 == i_1_) {
			return 0;
		}
		int i_5_ = ParallelHttpProvider.method7170(class562_sub1, class562_sub1_0_, i_1_, bool_2_);
		if (bool_2_) {
			return -i_5_;
		}
		return i_5_;
	}

	static void method15149() {
		if (AsynchronousStreamRequest.anInt4532 * -1343037161 < 0) {
			AsynchronousStreamRequest.anInt4532 = 0;
			Class495_Sub1.anInt10327 = -1164673443;
			Class495_Sub1.anInt10324 = -732309487;
		}
		if (-1343037161 * AsynchronousStreamRequest.anInt4532 > Class495.anInt6824) {
			AsynchronousStreamRequest.anInt4532 = Class495.anInt6824 * 807429799;
			Class495_Sub1.anInt10327 = -1164673443;
			Class495_Sub1.anInt10324 = -732309487;
		}
		if (-1266662223 * ClanChannelUpdater.anInt3185 < 0) {
			ClanChannelUpdater.anInt3185 = 0;
			Class495_Sub1.anInt10327 = -1164673443;
			Class495_Sub1.anInt10324 = -732309487;
		}
		if (-1266662223 * ClanChannelUpdater.anInt3185 > Class495.anInt6826) {
			ClanChannelUpdater.anInt3185 = 1001358417 * Class495.anInt6826;
			Class495_Sub1.anInt10327 = -1164673443;
			Class495_Sub1.anInt10324 = -732309487;
		}
	}

	int z;
	int index;
	int x;
	int plane;
	int orientation;

	SpawnObjectCutsceneAction(Buffer buffer) {
		super(buffer);

		index = buffer.readUShort() * 1088398863;
		int point = buffer.readInt();
		x = 1637030901 * (point >>> 16);
		z = (point & 0xffff) * -1110021549;
		plane = buffer.readUByte() * -178183863;
		orientation = buffer.readUByte() * 958090375;
	}

	@Override
	public void execute() {
		CutsceneObject.objects[1296337135 * index].spawn(plane * -84827911, -1037797283 * x, z * -11703845,
				449034551 * orientation);
	}

}