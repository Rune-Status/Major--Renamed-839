package com.jagex;

public class IndexedImage extends Image {

	public byte[] alpha;
	public int offsetX;
	public int offsetY;
	public int[] palette;
	public byte[] raster;
	int deltaHeight;
	int deltaWidth;
	int height;
	int width;

	@Override
	public int[] argb(boolean scale) {
		int[] argb;

		if (scale) {
			int scaleWidth = getScaleWidth();
			argb = new int[scaleWidth * getScaleHeight()];

			if (alpha != null) {
				for (int y = 0; y < height; y++) {
					int source = y * width;
					int dest = offsetX + (y + offsetY) * scaleWidth;

					for (int x = 0; x < width; x++) {
						argb[dest++] = alpha[source] << 24 | palette[raster[source] & 0xff];
						source++;
					}
				}
			} else {
				for (int y = 0; y < height; y++) {
					int source = y * width;
					int dest = offsetX + (y + offsetY) * scaleWidth;

					for (int x = 0; x < width; x++) {
						int colour = palette[raster[source++] & 0xff];

						if (colour != 0) {
							argb[dest++] = ~0xffffff | colour;
						} else {
							argb[dest++] = 0;
						}
					}
				}
			}
		} else {
			argb = new int[width * height];
			int source = 0;
			int dest = 0;

			if (alpha != null) {
				for (int y = 0; y < height; y++) {
					for (int x = 0; x < width; x++) {
						argb[dest++] = alpha[source] << 24 | palette[raster[source] & 0xff];
						source++;
					}
				}
			} else {
				for (int y = 0; y < height; y++) {
					for (int x = 0; x < width; x++) {
						int colour = palette[raster[source++] & 0xff];
						argb[dest++] = colour != 0 ? ~0xffffff | colour : 0;
					}
				}
			}
		}

		return argb;
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
		byte[] raster = this.raster;

		if (alpha == null) {
			for (int y = (height >> 1) - 1; y >= 0; y--) {
				int left = y * width;
				int right = (height - y - 1) * width;

				for (int x = -width; x < 0; x++) {
					byte tmp = raster[left];
					raster[left] = raster[right];
					raster[right] = tmp;
					left++;
					right++;
				}
			}
		} else {
			byte[] alpha = this.alpha;
			for (int y = (height >> 1) - 1; y >= 0; y--) {
				int left = y * width;
				int right = (height - y - 1) * width;

				for (int x = -width; x < 0; x++) {
					byte tmp = raster[left];
					raster[left] = raster[right];
					raster[right] = tmp;

					tmp = alpha[left];
					alpha[left] = alpha[right];
					alpha[right] = tmp;
					left++;
					right++;
				}
			}
		}

		int tmp = offsetY;
		offsetY = deltaHeight;
		deltaHeight = tmp;
	}

	@Override
	public void flipVertical() {
		byte[] raster = this.raster;

		if (alpha == null) {
			for (int y = height - 1; y >= 0; y--) {
				int index = y * width;

				for (int max = (y + 1) * width; index < max; index++) {
					max--;

					byte tmp = raster[index];
					raster[index] = raster[max];
					raster[max] = tmp;
				}
			}
		} else {
			byte[] alpha = this.alpha;

			for (int y = height - 1; y >= 0; y--) {
				int index = y * width;

				for (int max = (y + 1) * width; index < max; index++) {
					max--;

					byte tmp = raster[index];
					raster[index] = raster[max];
					raster[max] = tmp;

					tmp = alpha[index];
					alpha[index] = alpha[max];
					alpha[max] = tmp;
				}
			}
		}

		int tmp = offsetX;
		offsetX = deltaWidth;
		deltaWidth = tmp;
	}

	@Override
	public int getColour(int x, int y) {
		return palette[raster[x + y * width] & 0xff];
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
		return alpha != null;
	}

	@Override
	public boolean isIndexed() {
		return true;
	}

	@Override
	public void offsetColour(int dr, int dg, int db) {
		for (int index = 1; index < palette.length; index++) {
			if (palette[index] != 1 && palette[index] != 16711935) {
				int red = palette[index] >> 16 & 0xff;
				red += dr;

				if (red < 0) {
					red = 0;
				} else if (red > 255) {
					red = 255;
				}

				int green = palette[index] >> 8 & 0xff;
				green += dg;

				if (green < 0) {
					green = 0;
				} else if (green > 255) {
					green = 255;
				}

				int blue = palette[index] >> 0 & 0xff;
				blue += db;

				if (blue < 0) {
					blue = 0;
				} else if (blue > 255) {
					blue = 255;
				}

				palette[index] = red << 16 | green << 8 | blue;
			}
		}
	}

	@Override
	public void rotateClockwise() {
		byte[] rotated = new byte[width * height];
		int index = 0;

		if (alpha == null) {
			for (int x = 0; x < width; x++) {
				for (int y = height - 1; y >= 0; y--) {
					rotated[index++] = raster[x + y * width];
				}
			}

			raster = rotated;
		} else {
			byte[] alpha = new byte[width * height];

			for (int x = 0; x < width; x++) {
				for (int y = height - 1; y >= 0; y--) {
					rotated[index] = raster[x + y * width];
					alpha[index++] = this.alpha[x + y * width];
				}
			}

			raster = rotated;
			this.alpha = alpha;
		}

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
			byte[] raster = new byte[width * height];

			if (alpha == null) {
				for (int y = 0; y < this.height; y++) {
					int source = y * this.width;
					int dest = (y + dy) * width + dx;

					for (int x = 0; x < this.width; x++) {
						raster[dest++] = this.raster[source++];
					}
				}
			} else {
				byte[] alpha = new byte[width * height];

				for (int y = 0; y < this.height; y++) {
					int sourceOffset = y * this.width;
					int destOffset = (y + dy) * width + dx;

					for (int x = 0; x < this.width; x++) {
						alpha[destOffset] = this.alpha[sourceOffset];
						raster[destOffset++] = this.raster[sourceOffset++];
					}
				}

				this.alpha = alpha;
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
		int paletteIndex = -1;

		if (palette.length < 255) {
			for (int index = 0; index < palette.length; index++) {
				if (palette[index] == colour) {
					paletteIndex = index;
					break;
				}
			}

			if (paletteIndex == -1) {
				int length = palette.length;
				paletteIndex = length;

				int[] palette = new int[length + 1];
				System.arraycopy(this.palette, 0, palette, 0, length);
				this.palette = palette;
				palette[paletteIndex] = colour;
			}
		} else {
			int minimum = 2147483647;
			int newR = colour >> 16 & 0xff;
			int newG = colour >> 8 & 0xff;
			int newB = colour & 0xff;

			for (int i = 0; i < palette.length; i++) {
				int current = palette[i];
				int r = current >> 16 & 0xff;
				int g = current >> 8 & 0xff;
				int b = current & 0xff;
				int dr = newR - r;
				if (dr < 0) {
					dr = -dr;
				}

				int dg = newG - g;
				if (dg < 0) {
					dg = -dg;
				}

				int db = newB - b;
				if (db < 0) {
					db = -db;
				}

				int sum = dr + dg + db;
				if (sum < minimum) {
					minimum = sum;
					paletteIndex = i;
				}
			}
		}

		int index = 0;
		byte[] recoloured = new byte[width * height];

		for (int y = 0; y < height; y++) {
			for (int x = 0; x < width; x++) {
				int current = raster[index] & 0xff;

				if (palette[current] == 0) {
					if (x > 0 && palette[raster[index - 1] & 0xff] != 0) {
						current = paletteIndex;
					} else if (y > 0 && palette[raster[index - width] & 0xff] != 0) {
						current = paletteIndex;
					} else if (x < width - 1 && palette[raster[index + 1] & 0xff] != 0) {
						current = paletteIndex;
					} else if (y < height - 1 && palette[raster[index + width] & 0xff] != 0) {
						current = paletteIndex;
					}
				}

				recoloured[index++] = (byte) current;
			}
		}

		raster = recoloured;
	}

	@Override
	public void setShadowColour(int colour) {
		int paletteIndex = -1;

		if (palette.length < 255) {
			for (int index = 0; index < palette.length; index++) {
				if (palette[index] == colour) {
					paletteIndex = index;
					break;
				}
			}

			if (paletteIndex == -1) {
				paletteIndex = palette.length;
				int[] modified = new int[palette.length + 1];

				System.arraycopy(palette, 0, modified, 0, palette.length);
				palette = modified;
				modified[paletteIndex] = colour;
			}
		} else {
			int minimum = 2147483647;
			int newR = colour >> 16 & 0xff;
			int newG = colour >> 8 & 0xff;
			int newB = colour & 0xff;

			for (int index = 0; index < palette.length; index++) {
				int current = palette[index];
				int r = current >> 16 & 0xff;
				int g = current >> 8 & 0xff;
				int b = current & 0xff;

				int dr = newR - r;
				if (dr < 0) {
					dr = -dr;
				}

				int dg = newG - g;
				if (dg < 0) {
					dg = -dg;
				}

				int db = newB - b;
				if (db < 0) {
					db = -db;
				}

				int sum = dr + dg + db;
				if (sum < minimum) {
					minimum = sum;
					paletteIndex = index;
				}
			}
		}

		for (int y = height - 1; y > 0; y--) {
			int index = y * width;

			for (int x = width - 1; x > 0; x--) {
				if (palette[raster[x + index] & 0xff] == 0 && palette[raster[x + index - 1 - width] & 0xff] != 0) {
					raster[x + index] = (byte) paletteIndex;
				}
			}
		}
	}

}