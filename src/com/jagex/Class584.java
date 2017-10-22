package com.jagex;

import java.util.HashMap;

public class Class584 {
	public static void method9874(int i, String string, boolean bool, int i_23_) {
		if (Client.unconnected()) {
			if (Class31.socialNetworkId * -1420488133 != i) {
				Class31.accountName = -5617524125832062695L;
			}
			Class31.socialNetworkId = 1568798451 * i;
			Class31.aString405 = string;
			Class31.aBool426 = bool;
			Client.lobbyConnection.stopConnection();
			Class536.setGameState(18);
		}
	}

	static int computeSpacing(byte[][] is, byte[][] is_2_, int[] is_3_, byte[] is_4_, int[] is_5_, int i, int i_6_) {
		int i_8_ = is_3_[i];
		int i_9_ = is_5_[i] + i_8_;
		int i_10_ = is_3_[i_6_];
		int i_11_ = i_10_ + is_5_[i_6_];
		int i_12_ = i_8_;
		if (i_10_ > i_8_) {
			i_12_ = i_10_;
		}
		int i_13_ = i_9_;
		if (i_11_ < i_9_) {
			i_13_ = i_11_;
		}
		int i_14_ = is_4_[i] & 0xff;
		if ((is_4_[i_6_] & 0xff) < i_14_) {
			i_14_ = is_4_[i_6_] & 0xff;
		}
		byte[] is_15_ = is_2_[i];
		byte[] is_16_ = is[i_6_];
		int i_17_ = i_12_ - i_8_;
		int i_18_ = i_12_ - i_10_;
		for (int i_19_ = i_12_; i_19_ < i_13_; i_19_++) {
			int i_20_ = is_15_[i_17_++] + is_16_[i_18_++];
			if (i_20_ < i_14_) {
				i_14_ = i_20_;
			}
		}
		return -i_14_;
	}

	static int method9872(int i, int i_21_, byte i_22_) {
		if (i == ObjectCategory.aClass541_7336.type * -1050493863
				|| ObjectCategory.aClass541_7355.type * -1050493863 == i) {
			return Wall.anIntArray11616[i_21_ & 0x3];
		}
		return Wall.anIntArray11619[i_21_ & 0x3];
	}

	Class335 aClass335_7771;
	public HashMap<Class457, Integer> aHashMap7772 = new HashMap();

	public Class584(Class335 class335) {
		aHashMap7772.put(Class457.aClass457_5141, 50);
		aClass335_7771 = class335;
	}

}