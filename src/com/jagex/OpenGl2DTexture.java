package com.jagex;

import jaggl.OpenGL;

public class OpenGl2DTexture extends OpenGlTexture {
	int height;
	int width;

	OpenGl2DTexture(OpenGlToolkit toolkit, int target, Class121 class121, Class151 class151, int width, int height) {
		super(toolkit, target, class121, class151, width * height, false);
		this.width = width;
		this.height = height;

		toolkit.setActiveTexture(this);
		OpenGL.glTexImage2Dub(target, 0, OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), width, height,
				0, OpenGlToolkit.format(aClass121_1328), 5121, null, 0);
		filterLinear(true);
	}

	OpenGl2DTexture(OpenGlToolkit toolkit, int target, Class121 class121, Class151 class151, int width, int height,
			boolean mipmapped, byte[] data, Class121 class121_12_, boolean copy) {
		super(toolkit, target, class121, class151, width * height, mipmapped);
		this.width = width;
		this.height = height;

		if (copy) {
			byte[] duplicate = new byte[data.length];
			for (int y = 0; y < height; y++) {
				int source = y * width;
				int dest = (height - y - 1) * width;

				for (int x = 0; x < width; x++) {
					duplicate[source++] = data[dest++];
				}
			}

			data = duplicate;
		}

		toolkit.setActiveTexture(this);
		OpenGL.glPixelStorei(3317, 1);
		if (mipmapped && target != 34037) {
			method1837(target, OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), width, height,
					class121_12_, data);
			setMipmapped(true);
		} else {
			OpenGL.glTexImage2Dub(target, 0, OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), width,
					height, 0, OpenGlToolkit.format(class121_12_), 5121, data, 0);
			setMipmapped(false);
		}

		OpenGL.glPixelStorei(3317, 4);
		filterLinear(true);
	}

	OpenGl2DTexture(OpenGlToolkit toolkit, int target, Class121 class121, Class151 class151, int width, int height,
			boolean mipmapped, float[] data, Class121 class121_21_) {
		super(toolkit, target, class121, class151, width * height, mipmapped);
		this.width = width;
		this.height = height;
		toolkit.setActiveTexture(this);

		if (mipmapped && target != 34037) {
			method1829(target, OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), width, height,
					class121_21_, data);
			setMipmapped(true);
		} else {
			OpenGL.glTexImage2Df(target, 0, OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), width,
					height, 0, OpenGlToolkit.format(class121_21_), 5126, data, 0);
			setMipmapped(false);
		}

		filterLinear(true);
	}

	OpenGl2DTexture(OpenGlToolkit toolkit, int target, int width, int height, boolean mipmapped, int[] data, int i_2_,
			int i_3_, boolean copy) {
		super(toolkit, target, Class121.aClass121_1465, Class151.aClass151_2, width * height, mipmapped);
		this.width = width;
		this.height = height;

		if (copy) {
			int[] duplicate = new int[data.length];
			for (int y = 0; y < height; y++) {
				int source = y * width;
				int dest = (height - y - 1) * width;

				for (int x = 0; x < width; x++) {
					duplicate[source++] = data[dest++];
				}
			}

			data = duplicate;
		}

		toolkit.setActiveTexture(this);
		if (target == 34037 || !mipmapped || i_2_ != 0 || i_3_ != 0) {
			OpenGL.glPixelStorei(3314, i_2_);
			OpenGL.glTexImage2Di(target, 0, OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), width,
					height, 0, 32993, this.toolkit.pixelType, data, i_3_ * 4);
			OpenGL.glPixelStorei(3314, 0);
			setMipmapped(false);
		} else {
			method1845(target, OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330), width, height, 32993,
					toolkit.pixelType, data);
			setMipmapped(true);
		}

		filterLinear(true);
	}

	OpenGl2DTexture(OpenGlToolkit toolkit, int target, int x, int y, int width, int height) {
		super(toolkit, target, Class121.aClass121_1466, Class151.aClass151_2, width * height, false);
		this.width = width;
		this.height = height;
		toolkit.setActiveTexture(this);
		Display display = toolkit.method2628();

		if (display != null) {
			int actualY = display.getHeight() - (y + height);
			int format = OpenGlToolkit.internalFormat(aClass121_1328, aClass151_1330);
			OpenGL.glCopyTexImage2D(target, 0, format, x, actualY, width, height, 0);
		}

		filterLinear(true);
	}

	void copy(int offsetX, int offsetY, int width, int height, byte[] data, Class121 class121, int i_47_,
			int rowLength, boolean copy) {
		if (rowLength == 0) {
			rowLength = width;
		}

		if (copy) {
			int size = class121.size * 115153045;
			int adjustedWidth = size * width;
			int adjustedHeight = size * rowLength;
			byte[] duplicate = new byte[adjustedWidth * height];

			for (int y = 0; y < height; y++) {
				int source = y * adjustedWidth;
				int dest = (height - y - 1) * adjustedHeight + i_47_;

				for (int x = 0; x < adjustedWidth; x++) {
					duplicate[source++] = data[dest++];
				}
			}

			data = duplicate;
		}

		toolkit.setActiveTexture(this);
		OpenGL.glPixelStorei(3317, 1);
		if (rowLength != width) {
			OpenGL.glPixelStorei(3314, rowLength);
		}

		OpenGL.glTexSubImage2Dub(target, 0, offsetX, this.height - offsetY - height, width, height,
				OpenGlToolkit.format(class121), 5121, data, i_47_);
		if (rowLength != width) {
			OpenGL.glPixelStorei(3314, 0);
		}

		OpenGL.glPixelStorei(3317, 4);
	}

	void copy(int offsetX, int offsetY, int width, int height, int[] data, int i_60_, int rowLength, boolean copy) {
		if (rowLength == 0) {
			rowLength = width;
		}

		if (copy) {
			int[] duplicate = new int[width * height];
			for (int y = 0; y < height; y++) {
				int source = y * width;
				int dest = (height - y - 1) * rowLength + i_60_;

				for (int x = 0; x < width; x++) {
					duplicate[source++] = data[dest++];
				}
			}

			data = duplicate;
		}

		toolkit.setActiveTexture(this);
		if (width != rowLength) {
			OpenGL.glPixelStorei(3314, rowLength);
		}

		OpenGL.glTexSubImage2Di(target, 0, offsetX, this.height - offsetY - height, width, height, 32993,
				toolkit.pixelType, data, i_60_);
		if (width != rowLength) {
			OpenGL.glPixelStorei(3314, 0);
		}
	}

	void draw(int offsetX, int offsetY, int width, int height, int x, int y) {
		Display display = toolkit.method2628();
		if (display != null) {
			int actualY = display.getHeight() - (y + height);
			toolkit.setActiveTexture(this);

			OpenGL.glCopyTexSubImage2D(target, 0, offsetX, this.height - (offsetY + height), x, actualY, width, height);
			OpenGL.glFlush();
		}
	}

	void method13936(int i, int i_29_, int i_30_, int length, int[] is, int[] output, int i_33_) {
		int[] out = output == null ? new int[width * height] : output;
		toolkit.setActiveTexture(this);
		OpenGL.glGetTexImagei(target, 0, 32993, 5121, out, 0);

		for (int index = 0; index < length; index++) {
			System.arraycopy(out, (i_29_ + length - 1 - index) * width, is, i_33_ + index * i_30_, i_30_);
		}
	}

	Interface16 method13938(int mipmapping) {
		return new OpenGlAttachable2DTexture(this, mipmapping);
	}

	Interface17 method435(int mipmapping) {
		return new OpenGlAttachable2DTexture(this, mipmapping);
	}

	void setRepeating(boolean bool, boolean bool_22_) {
		if (target == OpenGL.GL_TEXTURE_2D) {
			toolkit.setActiveTexture(this);
			OpenGL.glTexParameteri(target, 10242, bool ? 10497 : 33071);
			OpenGL.glTexParameteri(target, 10243, bool_22_ ? 10497 : 33071);
		}
	}

}