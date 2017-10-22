package com.jagex;

public class Class310 {
	static final boolean method5552(int i, int i_0_) {
		return false;
	}

	static final boolean method5553(int i, int i_1_) {
		return (i & 0x100) != 0;
	}

	static final boolean method5554(int i, int i_2_) {
		return (i & 0x22) != 0;
	}

	static final boolean method5557(int i, int i_3_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	static final boolean method5558(int i, int i_4_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method5561(int i, int i_5_) {
		return (i & 0x10) != 0;
	}

	static final boolean method5562(int i, int i_6_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method5564(int i, int i_7_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method5565(int i, int i_8_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5568(int i, int i_9_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5569(int i, int i_10_) {
		return method5558(i, i_10_) || method5572(i, i_10_);
	}

	static final boolean method5570(int i, int i_11_) {
		return (method5596(i, i_11_) | method5554(i, i_11_) | method5580(i, i_11_)) & method5565(i, i_11_);
	}

	static final boolean method5571(int i, int i_12_) {
		return method5574(i, i_12_) & ((i & 0x2000) != 0 | method5557(i, i_12_) | method5564(i, i_12_));
	}

	static final boolean method5572(int i, int i_13_) {
		if (!method5626(i, i_13_)) {
			return false;
		}
		if ((i & 0x9000) != 0 | method5558(i, i_13_) | method5553(i, i_13_)) {
			return true;
		}
		return (i_13_ & 0x37) == 0 & ((i & 0x2000) != 0 | method5557(i, i_13_) | method5564(i, i_13_));
	}

	static final boolean method5573(int i, int i_14_) {
		return method5552(i, i_14_) & method5568(i, i_14_);
	}

	static final boolean method5574(int i, int i_15_) {
		return (i & 0x800) != 0 && (i_15_ & 0x37) != 0;
	}

	static final boolean method5575(int i, int i_16_) {
		return (i & 0x70000) != 0 || method5596(i, i_16_) || method5570(i, i_16_);
	}

	static final boolean method5576(int i, int i_17_) {
		return (i & 0x70000) != 0 || method5554(i, i_17_) || method5570(i, i_17_);
	}

	static final boolean method5577(int i, int i_18_) {
		return (i & 0x70000) != 0 || method5580(i, i_18_) || method5570(i, i_18_);
	}

	static final boolean method5578(int i, int i_19_) {
		boolean bool = (i_19_ & 0x37) != 0 ? method5571(i, i_19_) : method5572(i, i_19_);
		return (i & 0x10000) != 0 | method5557(i, i_19_) | bool;
	}

	static final boolean method5579(int i, int i_20_) {
		return (i & 0x40000) != 0 | method5553(i, i_20_) || method5572(i, i_20_);
	}

	static final boolean method5580(int i, int i_21_) {
		return (i & 0x34) != 0;
	}

	static final boolean method5581(int i, int i_22_) {
		return (i & 0x180) != 0;
	}

	static final boolean method5582(int i, int i_23_) {
		return (i & 0x20) != 0;
	}

	static final boolean method5583(int i, int i_24_) {
		return (i & 0x400) != 0;
	}

	static final boolean method5584(int i, int i_25_) {
		return (i & 0x60000) != 0 | method5561(i, i_25_) || method5638(i, i_25_);
	}

	static final boolean method5585(int i, int i_26_) {
		return (i & 0x800) != 0 | method5562(i, i_26_) || method5572(i, i_26_);
	}

	static final boolean method5596(int i, int i_27_) {
		return (i & 0x21) != 0;
	}

	static final boolean method5604(int i, int i_28_) {
		return (i & 0x37) != 0;
	}

	static final boolean method5617(int i, int i_29_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method5622(int i, int i_30_) {
		return method5552(i, i_30_) || method5573(i, i_30_);
	}

	static final boolean method5626(int i, int i_31_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5630(int i, int i_32_) {
		return (i & 0x800) != 0;
	}

	static final boolean method5638(int i, int i_33_) {
		return method5561(i, i_33_) & method5630(i, i_33_);
	}

	Class310() throws Throwable {
		throw new Error();
	}

}