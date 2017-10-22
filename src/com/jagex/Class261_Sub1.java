package com.jagex;

import java.util.Iterator;

public class Class261_Sub1 extends Class261 {
	static final void method15146(int i, int i_9_, int i_10_, int i_11_, Class540 class540) {
		if (i_10_ >= 1 && i_11_ >= 1 && i_10_ <= Client.aClass460_10760.method7680() - 2
				&& i_11_ <= Client.aClass460_10760.method7707() - 2) {
			if (Client.aClass460_10760.method7687() != null) {
				SceneObject object = Client.aClass460_10760.method7696().getObject(i, i_9_, i_10_, i_11_);
				if (object != null) {
					if (object instanceof GameObject) {
						((GameObject) object).method18048(class540);
					} else if (object instanceof GroundDecoration) {
						((GroundDecoration) object).method18063(class540);
					} else if (object instanceof Wall) {
						((Wall) object).method18084(class540);
					} else if (object instanceof WallDecoration) {
						((WallDecoration) object).method18090(class540);
					}
				}
			}
		}
	}

	int anInt9650 = 0;

	public Class261_Sub1(GameCharacterProvider provider) {
		super(Class278.aClass278_3127, provider);
	}

	public void method15142(Buffer buffer, int i) {
		int i_1_ = buffer.offset * -165875887;
		int i_2_ = buffer.readUByte();
		method4806(Class600_Sub1_Sub3_Sub3.method18083(i_2_ & 0x1));
		if (0 != (i_2_ & 0x8)) {
			Class257 class257 = Class157.method3301(buffer.readUByte());
			if (aClass257_2911 != class257) {
				try {
					method4889(class257, true);
				} catch (ScriptException exception_sub3) {
					exception_sub3.printStackTrace();
				}
			}
		}
		if ((i_2_ & 0x10) != 0) {
			Class270 class270 = Class626.method13054(buffer.readUByte());
			if (aClass270_2890 != class270) {
				try {
					method4903(class270, true);
				} catch (ScriptException exception_sub3) {
					exception_sub3.printStackTrace();
				}
			}
		}
		if (1 == (i_2_ >> 7 & 0x1)) {
			int i_3_ = buffer.readUShort();
			if ((i_3_ >> 426780991 * Class276.aClass276_3100.anInt3098 & 0x1) == 1) {
				aClass397_2896.decode(buffer);
			}
			if ((i_3_ >> Class276.aClass276_3099.anInt3098 * 426780991 & 0x1) == 1) {
				aClass397_2912.decode(buffer);
			}
			if (1 == (i_3_ >> 426780991 * Class276.aClass276_3102.anInt3098 & 0x1)) {
				aClass397_2898.decode(buffer);
			}
			if ((i_3_ >> Class276.aClass276_3101.anInt3098 * 426780991 & 0x1) == 1) {
				aClass397_2900.decode(buffer);
			}
			if (1 == (i_3_ >> 426780991 * Class276.aClass276_3108.anInt3098 & 0x1)) {
				aFloat2889 = buffer.readFloat();
				aFloat2921 = buffer.readFloat();
			}
			if ((i_3_ >> 426780991 * Class276.aClass276_3104.anInt3098 & 0x1) == 1) {
				aFloat2901 = buffer.readFloat();
				aFloat2916 = buffer.readFloat();
			}
			if (1 == (i_3_ >> Class276.aClass276_3103.anInt3098 * 426780991 & 0x1)) {
				aClass275_2887 = PriorityQueueElement.method6074(buffer.readUByte());
			}
			if (1 == (i_3_ >> 426780991 * Class276.aClass276_3105.anInt3098 & 0x1)) {
				anInt2894 = buffer.readUTriByte() * -1621565917;
				buffer.readUByte();
			}
			if ((i_3_ >> 426780991 * Class276.aClass276_3113.anInt3098 & 0x1) == 1) {
				int i_4_ = buffer.readUByte();
				aBool2917 = 1 == (i_4_ & 0x1);
				aBool2918 = (i_4_ & 0x2) == 2;
			}
			if (1 == (i_3_ >> Class276.aClass276_3107.anInt3098 * 426780991 & 0x1)) {
				int i_5_ = buffer.readUByte();
				for (int i_6_ = 0; i_6_ < i_5_; i_6_++) {
					int i_7_ = buffer.readUByte();
					int i_8_ = buffer.readUByte();
					if (i_7_ == 0) {
						method4827(i_8_, 578223817);
					} else {
						Class228 class228 = Class16.method688(buffer.readUByte(), -487603469);
						boolean bool = true;
						Iterator iterator = aClass667_2906.iterator();
						while (iterator.hasNext()) {
							Class480_Sub31_Sub19 class480_sub31_sub19 = (Class480_Sub31_Sub19) iterator.next();
							if (i_8_ == class480_sub31_sub19.anInt11433 * 361545025) {
								class480_sub31_sub19.method17882(buffer, 2109154231);
								bool = false;
								break;
							}
						}
						if (bool) {
							method4826(Class614.method10358(i_8_, class228, buffer, 1515023121));
						}
					}
				}
			}
			if (1 == (i_3_ >> Class276.aClass276_3106.anInt3098 * 426780991 & 0x1)) {
				anInt2919 = buffer.readUShort() * 676493399;
				aFloat2920 = buffer.readFloat();
			}
			if ((i_3_ >> Class276.aClass276_3109.anInt3098 * 426780991 & 0x1) == 1) {
				aClass264_2893 = Class40.method1029(buffer.readUByte());
			}
			if (1 == (i_3_ >> Class276.aClass276_3110.anInt3098 * 426780991 & 0x1)) {
				aClass397_2907.decode(buffer);
				aClass397_2904.decode(buffer);
				aFloat2891 = buffer.readFloat();
				aFloat2910 = buffer.readFloat();
			}
			if ((i_3_ >> 426780991 * Class276.aClass276_3111.anInt3098 & 0x1) == 1) {
				buffer.readFloat();
			}
			if ((i_3_ >> Class276.aClass276_3112.anInt3098 * 426780991 & 0x1) == 1) {
				aFloat2895 = buffer.readFloat();
			}
		}
		if (aClass642_2915 != null && (i_2_ >> 5 & 0x1) == 1) {
			aClass642_2915.method13244(buffer, -1307538733);
		}
		if (aClass281_2885 != null && (i_2_ >> 6 & 0x1) == 1) {
			aClass281_2885.method5256(buffer, (byte) -103);
		}
		if (-165875887 * buffer.offset - i_1_ != i) {
			throw new RuntimeException(new StringBuilder().append(-165875887 * buffer.offset - i_1_).append(",")
					.append(i).toString());
		}
	}

	public int method15144() {
		anInt9650 += -1351553585;
		if (anInt9650 * -517277393 == 126) {
			anInt9650 = 0;
		}
		return anInt9650 * -517277393;
	}

}