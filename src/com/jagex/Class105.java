package com.jagex;

public class Class105 {
	static final boolean method1876(int i, int i_0_) {
		return (i & 0x21) != 0;
	}

	static final boolean method1877(int i, int i_1_) {
		return (i & 0x22) != 0;
	}

	static final boolean method1878(int i, int i_2_) {
		return (i & 0x34) != 0;
	}

	static final boolean method1879(int i, int i_3_) {
		return (i & 0x37) != 0;
	}

	static final boolean method1881(int i, int i_4_) {
		return (i & 0x84080) != 0;
	}

	static final boolean method1882(int i, int i_5_) {
		return (i & 0x100100) != 0;
	}

	static final boolean method1884(int i, int i_6_) {
		return (i & 0x10) != 0;
	}

	static final boolean method1885(int i, int i_7_) {
		return (i & 0x8000) != 0;
	}

	static final boolean method1886(int i, int i_8_) {
		return (i & 0xc580) != 0;
	}

	static final boolean method1887(int i, int i_9_) {
		return (i & 0x10000) != 0;
	}

	static final boolean method1888(int i, int i_10_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1892(int i, int i_11_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1893(int i, int i_12_) {
		return (method1876(i, i_12_) | method1877(i, i_12_) | method1878(i, i_12_)) & method1888(i, i_12_);
	}

	static final boolean method1894(int i, int i_13_) {
		return ((i & 0x2000) != 0 | method1971(i, i_13_) | method1887(i, i_13_)) & method1924(i, i_13_);
	}

	static final boolean method1895(int i, int i_14_) {
		if (!method1939(i, i_14_)) {
			return false;
		}
		if ((i & 0xb000) != 0 | method1881(i, i_14_) | method1882(i, i_14_)) {
			return true;
		}
		return (i_14_ & 0x37) == 0 & (method1971(i, i_14_) | method1887(i, i_14_));
	}

	static final boolean method1897(int i, int i_15_) {
		return method1884(i, i_15_) & method1892(i, i_15_);
	}

	static final boolean method1898(int i, int i_16_) {
		return (i & 0x70000) != 0 | method1876(i, i_16_) || method1893(i, i_16_);
	}

	static final boolean method1899(int i, int i_17_) {
		return (i & 0x70000) != 0 | method1877(i, i_17_) || method1893(i, i_17_);
	}

	static final boolean method1900(int i, int i_18_) {
		return (i & 0x70000) != 0 | method1878(i, i_18_) || method1893(i, i_18_);
	}

	static final boolean method1901(int i, int i_19_) {
		if ((i & 0x10000) != 0 | method1971(i, i_19_) || method1894(i, i_19_)) {
			return true;
		}
		return (i_19_ & 0x37) == 0 && method1895(i, i_19_);
	}

	static final boolean method1902(int i, int i_20_) {
		return method1881(i, i_20_) || method1895(i, i_20_);
	}

	static final boolean method1903(int i, int i_21_) {
		return (i & 0x40000) != 0 | method1882(i, i_21_) || method1895(i, i_21_);
	}

	static final boolean method1904(int i, int i_22_) {
		return method1917(i, i_22_) || method1922(i, i_22_);
	}

	static final boolean method1907(int i, int i_23_) {
		return (i & 0x400) != 0;
	}

	static final boolean method1908(int i, int i_24_) {
		return (i & 0x60000) != 0 | method1884(i, i_24_) || method1895(i, i_24_) || method1897(i, i_24_);
	}

	static final boolean method1909(int i, int i_25_) {
		return (i & 0x800) != 0 | method1885(i, i_25_) || method1895(i, i_25_);
	}

	static final boolean method1912(int i, int i_26_) {
		return (i & 0x180) != 0;
	}

	static final boolean method1917(int i, int i_27_) {
		return false;
	}

	static final boolean method1922(int i, int i_28_) {
		return method1917(i, i_28_) & method1970(i, i_28_);
	}

	static final boolean method1924(int i, int i_29_) {
		return (i & 0x800) != 0 && (i_29_ & 0x37) != 0;
	}

	static final boolean method1929(int i, int i_30_) {
		return (i & 0x20) != 0;
	}

	static final boolean method1939(int i, int i_31_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1970(int i, int i_32_) {
		return (i & 0x800) != 0;
	}

	static final boolean method1971(int i, int i_33_) {
		return (i & 0x220) == 544 | (i & 0x18) != 0;
	}

	Class105() throws Throwable {
		throw new Error();
	}

}