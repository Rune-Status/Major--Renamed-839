package com.jagex;

public class DisplayProperties {

	public static DisplayProperties[] getAll(FullScreenAdapter adapter) {
		int[] properties = adapter.getDisplayProperties();
		DisplayProperties[] displays = new DisplayProperties[properties.length >> 2];

		for (int index = 0; index < displays.length; index++) {
			DisplayProperties display = new DisplayProperties();
			displays[index] = display;
			display.width = -53149123 * properties[index << 2];
			display.height = -1434652383 * properties[(index << 2) + 1];
			display.bitDepth = -161602455 * properties[2 + (index << 2)];
			display.refreshRate = 1932040163 * properties[3 + (index << 2)];
		}

		return displays;
	}

	public int bitDepth;
	public int height;
	public int width;
	int refreshRate;

}