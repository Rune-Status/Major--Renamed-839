package com.jagex;

public class Class150 { // underwater something
	static void method3186() {
		Class533.aBool7280 = false;
		Class189.anIntArray2059 = null;
		Deque.anIntArray8173 = null;
		Class533.aLinkedList7260.clear();
		Class533.aLinkedList7284.clear();
		Class60.activeToolkit.method2416();
	}

	static void method3187() {
		Class65.aBool1012 = false;
		EntityQueue.method13532();
	}

	public int colour;
	public int scale;
	public int intensity;
	int anInt1845;
	public int anInt1846;
	public int anInt1847;
	public int anInt1848;

	public Class150() {

	}

	public Class150(int colour, int scale, int intensity, int i_2_, int i_3_, int i_4_, int i_5_) {
		this.colour = colour * 791213269;
		this.scale = scale * 1591951847;
		this.intensity = intensity * 1370254837;
		this.anInt1845 = i_2_ * 1759284507;
		this.anInt1848 = i_3_ * 471935851;
		this.anInt1847 = i_4_ * -2072444281;
		this.anInt1846 = i_5_ * -1720335367;
	}

	public boolean equals(Class150 other) {
		return other.colour * 2139661437 == 2139661437 * colour && -329760297 * other.scale == -329760297 * scale
				&& -1801120163 * intensity == -1801120163 * other.intensity
				&& -1465907949 * other.anInt1845 == -1465907949 * anInt1845
				&& other.anInt1848 * -1963415229 == anInt1848 * -1963415229
				&& other.anInt1847 * -1374149833 == anInt1847 * -1374149833
				&& 1882164809 * other.anInt1846 == anInt1846 * 1882164809;
	}

}