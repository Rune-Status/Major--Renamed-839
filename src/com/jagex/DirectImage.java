package com.jagex;

public class DirectImage extends Image {

	int deltaHeight;
	int deltaWidth;
	boolean hasAlpha = false;
	int height;
	int offsetX;
	int offsetY;
	int[] raster;
	int width;

	DirectImage(int width, int height, int[] raster) {
		this.width = width;
		this.height = height;
		this.raster = raster;

		for (int pixel : raster) {
			if ((pixel & ~0xffffff) != -16777216) {
				hasAlpha = true;
				break;
			}
		}
	}

	@Override
	public int[] argb(boolean scale) {
		if (scale && (getScaleWidth() != width || getScaleHeight() != height)) {
			int scaleWidth = getScaleWidth();
			int[] argb = new int[scaleWidth * getScaleHeight()];

			for (int y = 0; y < height; y++) {
				int source = y * width;
				int dest = offsetX + (y + offsetY) * scaleWidth;

				for (int x = 0; x < width; x++) {
					argb[dest++] = raster[source];
					source++;
				}
			}

			return argb;
		}

		return raster;
	}

	@Override
	public void clearOffsets() {
		deltaHeight = 0;
		offsetY = 0;
		deltaWidth = 0;
		offsetX = 0;
	}

	@Override
	public void flipHorizontal() {
		int[] raster = this.raster;
		for (int y = (height >> 1) - 1; y >= 0; y--) {
			int left = y * width;
			int right = (height - y - 1) * width;

			for (int x = -width; x < 0; x++) {
				int tmp = raster[left];
				raster[left] = raster[right];
				raster[right] = tmp;
				left++;
				right++;
			}
		}

		int tmp = offsetY;
		offsetY = deltaHeight;
		deltaHeight = tmp;
	}

	@Override
	public void flipVertical() {
		int[] raster = this.raster;

		for (int y = height - 1; y >= 0; y--) {
			int index = y * width;

			for (int max = (y + 1) * width; index < max; index++) {
				max--;
				int tmp = raster[index];
				raster[index] = raster[max];
				raster[max] = tmp;
			}
		}

		int tmp = offsetX;
		offsetX = deltaWidth;
		deltaWidth = tmp;
	}

	@Override
	public int getColour(int x, int y) {
		return raster[x + y * width];
	}

	@Override
	public int getDeltaHeight() {
		return deltaHeight;
	}

	@Override
	public int getDeltaWidth() {
		return deltaWidth;
	}

	@Override
	public int getHeight() {
		return height;
	}

	@Override
	public int getOffsetX() {
		return offsetX;
	}

	@Override
	public int getOffsetY() {
		return offsetY;
	}

	@Override
	public int getScaleHeight() {
		return height + offsetY + deltaHeight;
	}

	@Override
	public int getScaleWidth() {
		return width + offsetX + deltaWidth;
	}

	@Override
	public int getWidth() {
		return width;
	}

	@Override
	public boolean hasAlpha() {
		return hasAlpha;
	}

	@Override
	public boolean isIndexed() {
		return false;
	}

	@Override
	public void offsetColour(int dr, int dg, int db) {
		for (int index = 1; index < raster.length; index++) {
			int red = raster[index] >> 16 & 0xff;
			red += dr;

			if (red < 0) {
				red = 0;
			} else if (red > 255) {
				red = 255;
			}

			int green = raster[index] >> 8 & 0xff;
			green += dg;
			if (green < 0) {
				green = 0;
			} else if (green > 255) {
				green = 255;
			}

			int blue = raster[index] >> 0 & 0xff;
			blue += db;
			if (blue < 0) {
				blue = 0;
			} else if (blue > 255) {
				blue = 255;
			}

			raster[index] = raster[index] & ~0xffffff | red << 16 | green << 8 | blue;
		}
	}

	@Override
	public void rotateClockwise() {
		int[] rotated = new int[width * height];
		int index = 0;

		for (int x = 0; x < width; x++) {
			for (int y = height - 1; y >= 0; y--) {
				rotated[index++] = raster[x + y * width];
			}
		}

		raster = rotated;
		int tmp = offsetY;
		offsetY = offsetX;
		offsetX = deltaHeight;
		deltaHeight = deltaWidth;
		deltaWidth = tmp;
		tmp = height;
		height = width;
		width = tmp;
	}

	@Override
	public void scale(int border) {
		int scaleWidth = getScaleWidth();
		int scaleHeight = getScaleHeight();

		if (width != scaleWidth || height != scaleHeight) {
			int dx = border;
			if (dx > offsetX) {
				dx = offsetX;
			}

			int dw = border;
			if (dw + offsetX + width > scaleWidth) {
				dw = scaleWidth - offsetX - width;
			}

			int dy = border;
			if (dy > offsetY) {
				dy = offsetY;
			}

			int dh = border;
			if (dh + offsetY + height > scaleHeight) {
				dh = scaleHeight - offsetY - height;
			}

			int width = this.width + dx + dw;
			int height = this.height + dy + dh;
			int[] raster = new int[width * height];
			hasAlpha = false;

			for (int y = 0; y < this.height; y++) {
				int source = y * this.width;
				int dest = (y + dy) * width + dx;

				for (int x = 0; x < this.width; x++) {
					if ((this.raster[source] & ~0xffffff) != -16777216) {
						hasAlpha = true;
					}

					raster[dest++] = this.raster[source++];
				}
			}

			offsetX -= dx;
			offsetY -= dy;
			deltaWidth -= dw;
			deltaHeight -= dh;
			this.width = width;
			this.height = height;
			this.raster = raster;
		}
	}

	@Override
	public void setBorderColour(int colour) {
		int index = 0;
		hasAlpha = false;
		int[] recoloured = new int[width * height];

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int current = raster[index];

				if ((current & ~0xffffff) == 0) {
					if (x > 0 && (raster[index - 1] & ~0xffffff) != 0) {
						current = colour;
					} else if (y > 0 && (raster[index - width] & ~0xffffff) != 0) {
						current = colour;
					} else if (x < width - 1 && (raster[index + 1] & ~0xffffff) != 0) {
						current = colour;
					} else if (y < height - 1 && (raster[index + width] & ~0xffffff) != 0) {
						current = colour;
					}
				}

				if ((current & ~0xffffff) != -16777216) {
					hasAlpha = true;
				}

				recoloured[index++] = current;
			}
		}

		raster = recoloured;
	}

	@Override
	public void setShadowColour(int colour) {
		for (int y = height - 1; y > 0; y--) {
			int index = y * width;

			for (int x = width - 1; x > 0; x--) {
				if ((raster[x + index] & ~0xffffff) == 0 && (raster[x + index - 1 - width] & ~0xffffff) != 0) {
					raster[x + index] = colour;
				}
			}
		}
	}

}