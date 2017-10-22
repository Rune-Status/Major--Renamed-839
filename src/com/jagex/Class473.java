package com.jagex;

import java.util.Iterator;
import java.util.LinkedList;

public class Class473 {
	static int anInt6545 = 0;

	int[] anIntArray6538;
	int modelId;
	int anInt6540;
	LinkedList<Class600_Sub1_Sub3_Sub4> aLinkedList6541;
	boolean aBool6542;
	public Model model;
	int[] anIntArray6544;

	public Class473(Toolkit toolkit, Buffer buffer, int modelId) {
		this.modelId = -31735225 * modelId;
		anInt6540 = buffer.readSmart() * 2053253185;
		anIntArray6544 = new int[-2039617599 * anInt6540];
		anIntArray6538 = new int[-2039617599 * anInt6540];
		int i_8_ = buffer.readUShort();
		int i_9_ = buffer.readUShort();

		for (int index = 0; index < anInt6540 * -2039617599; index++) {
			anIntArray6544[index] = i_8_ + buffer.readByte();
			anIntArray6538[index] = i_9_ + buffer.readByte();
		}

		model = getModel(toolkit);
	}

	public void method8061(Class490 class490) {
		if (class490 != null && aLinkedList6541 != null) {
			Iterator<Class600_Sub1_Sub3_Sub4> iterator = aLinkedList6541.iterator();

			while (iterator.hasNext()) {
				Class600_Sub1_Sub3_Sub4 class600_sub1_sub3_sub4 = iterator.next();
				class490.method8342(class600_sub1_sub3_sub4.plane, class600_sub1_sub3_sub4.aShort11457,
						class600_sub1_sub3_sub4.aShort11464, new Class486(class600_sub1_sub3_sub4));
			}
		}
	}

	public void method8064(Class490 class490) {
		if (null != class490 && -2039617599 * anInt6540 > 0) {
			method8065(class490);
			Iterator<Class600_Sub1_Sub3_Sub4> iterator = aLinkedList6541.iterator();

			while (iterator.hasNext()) {
				Class600_Sub1_Sub3_Sub4 class600_sub1_sub3_sub4 = iterator.next();
				class490.method8423(class600_sub1_sub3_sub4, false);
			}
			aBool6542 = true;
		}
	}

	public void method8066() {
		aBool6542 = false;
		model = null;
	}

	public boolean method8067() {
		return aBool6542;
	}

	public boolean hasModel(Toolkit toolkit) {
		model = getModel(toolkit);
		return model != null;
	}

	Model getModel(Toolkit toolkit) {
		BaseModel base = BaseModel.lookup(Class436.models, modelId * -1131329673, 0);
		if (base == null) {
			return null;
		}

		if (base.version < 13) {
			base.method3103(2);
		}

		return toolkit.createModel(base, 2048, -1985318521 * anInt6545, 64, 768);
	}

	void method8065(Class490 class490) {
		aLinkedList6541 = new LinkedList();
		TileFlags flags = Client.aClass460_10760.method7775();
		Class553 class553 = Client.aClass460_10760.method7679();
		Class553 class553_0_ = new Class553(ProxyingVariableLoader.localPlane * 1611577177, anIntArray6544[0], anIntArray6538[0]);

		for (int i_1_ = 1; i_1_ < anInt6540 * -2039617599; i_1_++) {
			Class553 class553_2_ = new Class553(1611577177 * ProxyingVariableLoader.localPlane, anIntArray6544[i_1_],
					anIntArray6538[i_1_]);

			while (2051316501 * class553_0_.x != class553_2_.x * 2051316501
					|| -180305283 * class553_0_.z != -180305283 * class553_2_.z) {
				if (2051316501 * class553_0_.x < class553_2_.x * 2051316501) {
					class553_0_.x += -1155670979;
				} else if (class553_0_.x * 2051316501 > class553_2_.x * 2051316501) {
					class553_0_.x -= -1155670979;
				}

				if (-180305283 * class553_0_.z < class553_2_.z * -180305283) {
					class553_0_.z += 2125481685;
				} else if (class553_0_.z * -180305283 > class553_2_.z * -180305283) {
					class553_0_.z -= 2125481685;
				}

				int plane = 1611577177 * ProxyingVariableLoader.localPlane;
				int localX = 2051316501 * class553_0_.x - class553.x * 2051316501;
				int localZ = -180305283 * class553_0_.z - -180305283 * class553.z;

				if (localX >= 0 && localX < 173827901 * class490.width && localZ >= 0
						&& localZ < 134933557 * class490.length) {
					int worldX = (localX << 9) + 256;
					int worldZ = 256 + (localZ << 9);
					if (flags.isBridge(localX, localZ)) {
						plane++;
					}

					aLinkedList6541.add(new Class600_Sub1_Sub3_Sub4(class490, this, ProxyingVariableLoader.localPlane * 1611577177,
							plane, worldX, Class279.getAverageHeight(worldX, worldZ, 1611577177 * ProxyingVariableLoader.localPlane),
							worldZ));
				}
			}

			class553_0_ = class553_2_;
		}
	}

}