package com.jagex;

public class JavaFont extends Font {
	public static ClanSettings aClass288_8793;

	int[] widths;
	Sprite[] polychrome;
	Sprite[] monochrome;
	int[] heights;
	int[] offsetsY;
	JavaToolkit toolkit;
	int[] offsetsX;

	JavaFont(JavaToolkit toolkit, FontSpecification specification, DirectImage[] images, int[] widths, int[] heights) {
		super(toolkit, specification);
		this.toolkit = toolkit;

		this.widths = widths;
		this.heights = heights;

		polychrome = new Sprite[images.length];
		monochrome = new Sprite[images.length];

		offsetsY = new int[images.length];
		offsetsX = new int[images.length];

		for (int index = 0; index < images.length; index++) {
			polychrome[index] = toolkit.createSprite(images[index], false);
			int[] argb = images[index].argb(false).clone();

			for (int pixel = 0; pixel < argb.length; pixel++) {
				int colour = argb[pixel];
				int adjusted = (byte) ((colour & 0xff) + 3 * (colour >> 16 & 0xff) + 4 * (colour >> 8 & 0xff) >> 3);
				argb[pixel] = argb[pixel] & ~0xffffff | adjusted << 16 | adjusted << 8 | adjusted;
			}

			monochrome[index] = toolkit.createSprite(argb, 0, widths[index], widths[index], heights[index], false);
			offsetsY[index] = images[index].getOffsetY();
			offsetsX[index] = images[index].getOffsetX();
		}
	}

	@Override
	void renderCharacter(char character, int x, int y, int colour, boolean mono) {
		if (null != toolkit.anIntArray8797) {
			x += offsetsX[character];
			y += offsetsY[character];

			if (mono) {
				monochrome[character].method2142(x, y, 1, colour, 1);
			} else {
				polychrome[character].method2142(x, y, 1, colour, 1);
			}
		}
	}

	@Override
	void renderCharacter(char c, int i, int i_0_, int i_1_, boolean bool, ClippingMask clipping, int i_2_, int i_3_) {

	}

}