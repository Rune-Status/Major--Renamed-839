package com.jagex;

public class Class447 {
	static Class447 aClass447_5064 = new Class447();
	public static Class447 aClass447_5065 = new Class447();
	public static Class447 aClass447_5066 = new Class447();
	static Class447 aClass447_5067 = new Class447();

	static final boolean method7373(int[][] is, int[][] is_5_, int i, int i_6_, int i_7_, int i_8_, int i_9_, int i_10_) {
		for (int i_11_ = i_6_; i_11_ <= i_8_; i_11_++) {
			for (int i_12_ = i_7_; i_12_ <= i_9_; i_12_++) {
				if (i == is[i_11_][i_12_] && is_5_[i_11_][i_12_] <= 1) {
					return true;
				}
			}
		}
		return false;
	}

	Class447() {

	}

}