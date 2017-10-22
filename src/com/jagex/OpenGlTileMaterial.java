package com.jagex;

import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeapBuffer;
import jaggl.OpenGL;

public class OpenGlTileMaterial extends Linkable {
	Class150 aClass150_9997;
	NativeHeapBuffer colourBuffer;
	OpenGlArrayBufferPointer colourPointer;
	int[] faceFlags;
	OpenGlGround ground;
	NativeOpenGlElementArrayBuffer indices;
	float scale;
	Stream stream;
	int texture;
	OpenGlToolkit toolkit;

	OpenGlTileMaterial(OpenGlGround ground, int texture, int scale, Class150 class150) {
		this.ground = ground;
		this.toolkit = ground.toolkit;

		this.texture = texture;
		this.scale = scale;
		aClass150_9997 = class150;

		faceFlags = new int[ground.width * 767658255 * ground.length * 295124605];
		indices = new NativeOpenGlElementArrayBuffer(toolkit, null, 1);
	}

	void activate(int index) {
		stream.setBackingOffset(index * 4 + 3);
		stream.writeByte(-1);
	}

	void colour(int index, int colour, int lightness, float intensity) {
		if (texture != -1) {
			TextureMetrics metrics = toolkit.metricsList.get(texture);
			int alpha = metrics.alpha & 0xff;
			if (alpha != 0 && metrics.aByte1719 != 4) {
				int opaque;
				if (lightness < 0) {
					opaque = 0;
				} else if (lightness > 127) {
					opaque = 16777215;
				} else {
					opaque = 131586 * lightness;
				}

				if (alpha == 256) {
					colour = opaque;
				} else {
					int inverse = 256 - alpha;
					colour = ((opaque & 0xff00ff) * alpha + (colour & 0xff00ff) * inverse & ~0xff00ff)
							+ ((opaque & 0xff00) * alpha + (colour & 0xff00) * inverse & 0xff0000) >> 8;
				}
			}

			int offset = metrics.colourOffset & 0xff;
			if (offset != 0) {
				offset += 256;
				int red = ((colour & 0xff0000) >> 16) * offset;
				if (red > 65535) {
					red = 65535;
				}

				int green = ((colour & 0xff00) >> 8) * offset;
				if (green > 65535) {
					green = 65535;
				}

				int blue = (colour & 0xff) * offset;
				if (blue > 65535) {
					blue = 65535;
				}

				colour = (red << 8 & 0xff0000) + (green & 0xff00) + (blue >> 8);
			}
		}

		if (intensity != 1.0F) {
			int red = colour >> 16 & 0xff;
			int green = colour >> 8 & 0xff;
			int blue = colour & 0xff;
			red *= intensity;

			if (red < 0) {
				red = 0;
			} else if (red > 255) {
				red = 255;
			}

			green *= intensity;
			if (green < 0) {
				green = 0;
			} else if (green > 255) {
				green = 255;
			}

			blue *= intensity;
			if (blue < 0) {
				blue = 0;
			} else if (blue > 255) {
				blue = 255;
			}

			colour = red << 16 | green << 8 | blue;
		}

		stream.setBackingOffset(index * 4);
		stream.writeByte((byte) (colour >> 16));
		stream.writeByte((byte) (colour >> 8));
		stream.writeByte((byte) colour);
	}

	void finish(int size) {
		stream.flush();
		ArrayBuffer buffer = toolkit.createArrayBuffer(colourBuffer, 4, size * 4, false);

		if (buffer instanceof OpenGlArrayBuffer) {
			colourBuffer.deallocate();
		}

		colourPointer = new OpenGlArrayBufferPointer(buffer, 5121, 4, 0);
		colourBuffer = null;
		stream = null;
	}

	void flag(int x, int z, int flag) {
		faceFlags[z * ground.width * 767658255 + x] |= 1 << flag;
	}

	void init(int size) {
		colourBuffer = toolkit.heap.allocate(size * 4, true);
		stream = new Stream(colourBuffer);
	}

	void render(int[] tiles, int length) {
		int count = 0;
		FloatBuffer buffer = toolkit.dataBuffer;
		buffer.offset = 0;

		if (toolkit.bigEndian) {
			for (int index = 0; index < length; index++) {
				int tile = tiles[index];
				short[] materials = ground.materialIndices[tile];
				int flags = this.faceFlags[tile];

				if (flags != 0 && materials != null) {
					int face = 0;
					int vertex = 0;

					while (vertex < materials.length) {
						if ((flags & 1 << face++) != 0) {
							buffer.writeShort(materials[vertex++] & 0xffff);
							count++;

							buffer.writeShort(materials[vertex++] & 0xffff);
							count++;

							buffer.writeShort(materials[vertex++] & 0xffff);
							count++;
						} else {
							vertex += 3;
						}
					}
				}
			}
		} else {
			for (int index = 0; index < length; index++) {
				int tile = tiles[index];
				short[] materials = ground.materialIndices[tile];
				int flags = this.faceFlags[tile];

				if (flags != 0 && materials != null) {
					int face = 0;
					int vertex = 0;

					while (vertex < materials.length) {
						if ((flags & 1 << face++) != 0) {
							buffer.writeLEShort(materials[vertex++] & 0xffff);
							count++;
							buffer.writeLEShort(materials[vertex++] & 0xffff);
							count++;
							buffer.writeLEShort(materials[vertex++] & 0xffff);
							count++;
						} else {
							vertex += 3;
						}
					}
				}
			}
		}

		if (count > 0) {
			indices.write(buffer.payload, buffer.offset * -165875887);
			toolkit.setPointers(ground.vertexPointer, ground.normalPointer, colourPointer, ground.texturePointer);
			toolkit.method14325(texture, (ground.flags & 0x7) != 0, (ground.flags & 0x8) != 0);

			if (toolkit.underwater) {
				toolkit.method2804(2147483647, aClass150_9997);
			}

			OpenGL.glMatrixMode(5890);
			OpenGL.glPushMatrix();
			OpenGL.glScalef(1.0F / scale, 1.0F / scale, 1.0F);
			OpenGL.glMatrixMode(5888);
			toolkit.setPointers(ground.vertexPointer, ground.normalPointer, colourPointer, ground.texturePointer);
			toolkit.drawElements(indices, 4, 0, count);
			OpenGL.glMatrixMode(5890);
			OpenGL.glPopMatrix();
			OpenGL.glMatrixMode(5888);
		}
	}

}