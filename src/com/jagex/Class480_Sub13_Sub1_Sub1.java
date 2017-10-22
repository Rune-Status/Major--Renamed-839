package com.jagex;

public final class Class480_Sub13_Sub1_Sub1 extends Class480_Sub13_Sub1 {
	int[] anIntArray11644 = null;
	DirectXProgram program;
	int[] anIntArray11646 = null;

	Class480_Sub13_Sub1_Sub1(DirectXProgram program, Class241 class241) {
		super(class241);
		this.program = program;
		anIntArray11644 = class241.anIntArray2644;
		anIntArray11646 = class241.anIntArray2645;
	}

	@Override
	public final int method17547(int i) {
		int i_0_ = anIntArray11644[i];
		int i_1_ = anIntArray11646[i];
		if (i_0_ != -1) {
			return i_0_;
		} else if (i_1_ != -1) {
			return i_1_ | 0x10000;
		}

		return -1;
	}

	@Override
	public boolean method17548(int i) {
		return true;
	}

	final int method18111() {
		return anIntArray11644[program.method4454()];
	}

	final int method18113() {
		return anIntArray11646[program.method4454()];
	}

}