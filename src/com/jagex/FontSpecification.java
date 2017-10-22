package com.jagex;

import java.awt.Point;

public class FontSpecification {
	static String[] lines = new String[100];

	public static int[] getFontIndices() {
		return new int[] { Class24.p11FullIndex * 1909085029, Class24.p12FullIndex * -346985765,
				1256780311 * Class24.b12FullIndex };
	}

	public static FontSpecification load(Archive fonts, int file) {
		byte[] data = fonts.get(file);
		if (null == data) {
			return null;
		}

		return new FontSpecification(data);
	}

	public static Sprite method641() {
		return Class533.aClass116_7274;
	}

	public int bottomPadding;
	public int topPadding;
	public int verticalSpacing;
	byte[][] glyphSpacing;
	byte[] glyphWidths;

	FontSpecification(byte[] is) {
		Buffer buffer = new Buffer(is);
		int magic = buffer.readUByte();
		if (0 != magic) {
			throw new RuntimeException("");
		}

		boolean variadicWidth = buffer.readUByte() == 1;
		glyphWidths = new byte[256];
		buffer.readBytes(glyphWidths, 0, 256);

		if (variadicWidth) {
			int[] is_34_ = new int[256];
			int[] is_35_ = new int[256];
			for (int i_36_ = 0; i_36_ < 256; i_36_++) {
				is_34_[i_36_] = buffer.readUByte();
			}

			for (int i_37_ = 0; i_37_ < 256; i_37_++) {
				is_35_[i_37_] = buffer.readUByte();
			}

			byte[][] is_38_ = new byte[256][];
			for (int i_39_ = 0; i_39_ < 256; i_39_++) {
				is_38_[i_39_] = new byte[is_34_[i_39_]];
				byte i_40_ = 0;
				for (int i_41_ = 0; i_41_ < is_38_[i_39_].length; i_41_++) {
					i_40_ += buffer.readByte();
					is_38_[i_39_][i_41_] = i_40_;
				}
			}

			byte[][] is_42_ = new byte[256][];
			for (int i_43_ = 0; i_43_ < 256; i_43_++) {
				is_42_[i_43_] = new byte[is_34_[i_43_]];
				byte i_44_ = 0;
				for (int i_45_ = 0; i_45_ < is_42_[i_43_].length; i_45_++) {
					i_44_ += buffer.readByte();
					is_42_[i_43_][i_45_] = i_44_;
				}
			}

			glyphSpacing = new byte[256][256];
			for (int i_46_ = 0; i_46_ < 256; i_46_++) {
				if (32 != i_46_ && i_46_ != 160) {
					for (int i_47_ = 0; i_47_ < 256; i_47_++) {
						if (32 != i_47_ && i_47_ != 160) {
							glyphSpacing[i_46_][i_47_] = (byte) Class584.computeSpacing(is_38_, is_42_, is_35_,
									glyphWidths, is_34_, i_46_, i_47_);
						}
					}
				}
			}

			verticalSpacing = 1374385103 * (is_34_[32] + is_35_[32]);
		} else {
			verticalSpacing = buffer.readUByte() * 1374385103;
		}

		buffer.readUByte();
		buffer.readUByte();
		topPadding = buffer.readUByte() * 1326599717;
		bottomPadding = buffer.readUByte() * 1878123479;
	}

	public String fitText(String string, HorizontallyScalable[] icons, int maximumWidth) {
		if (textWidth(string, icons) <= maximumWidth) {
			return string;
		}
		maximumWidth -= textWidth("...", null);
		int escapeStart = -1;
		int previous = -1;
		int width = 0;
		int length = string.length();
		String prefix = "";

		for (int index = 0; index < length; index++) {
			char current = string.charAt(index);

			if (current == '<') {
				escapeStart = index;
			} else {
				if (current == '>' && escapeStart != -1) {
					String escaoed = string.substring(escapeStart + 1, index);
					escapeStart = -1;
					if (escaoed.equals("lt")) {
						current = '<';
					} else if (escaoed.equals("gt")) {
						current = '>';
					} else if (escaoed.equals("nbsp")) {
						current = '\u00a0';
					} else if (escaoed.equals("shy")) {
						current = '\u00ad';
					} else if (escaoed.equals("times")) {
						current = '\u00d7';
					} else if (escaoed.equals("euro")) {
						current = '\u20ac';
					} else if (escaoed.equals("copy")) {
						current = '\u00a9';
					} else if (escaoed.equals("reg")) {
						current = '\u00ae';
					} else {
						if (escaoed.startsWith("img=") && null != icons) {
							try {
								int id = Client.parseDecimal(escaoed.substring(4));
								width += icons[id].scaleWidth();
								previous = -1;

								if (width > maximumWidth) {
									return new StringBuilder().append(prefix).append("...").toString();
								}

								prefix = string.substring(0, index + 1);
							} catch (Exception exception) {

							}
						}

						continue;
					}
				}

				if (escapeStart == -1) {
					width += glyphWidths[Class483.charToByte(current) & 0xff] & 0xff;
					if (glyphSpacing != null && -1 != previous) {
						width += glyphSpacing[previous][current];
					}

					previous = current;
					int total = width;
					if (glyphSpacing != null) {
						total += glyphSpacing[current][46];
					}

					if (total > maximumWidth) {
						return new StringBuilder().append(prefix).append("...").toString();
					}

					prefix = string.substring(0, index + 1);
				}
			}
		}

		return string;
	}

	public int getSpacing(int former, char latter) {
		if (glyphSpacing != null) {
			return glyphSpacing[former][latter];
		}
		return 0;
	}

	public int getWidth(int character) {
		return glyphWidths[character] & 0xff;
	}

	public int getLineCount(String string, int bound, HorizontallyScalable[] icons) {
		return splitLines(string, new int[] { bound }, icons, lines);
	}

	public String getSplitLine(String string, int width, HorizontallyScalable[] icons, int index) {
		int count = splitLines(string, new int[] { width }, icons, lines);
		if (index >= 0 && index < count) {
			return lines[index];
		}

		return null;
	}

	public Point method608(String text, int width, int height, int i_57_, HorizontallyScalable[] icons) {
		if (i_57_ <= 0) {
			return new Point(0, -1971642963 * topPadding + height);
		}

		if (i_57_ > text.length()) {
			i_57_ = text.length();
		}

		if (height == 0) {
			height = verticalSpacing * 108311343;
		}

		int lineCount = splitLines(text, new int[] { width }, icons, false, lines);
		int i_60_ = 0;

		for (int index = 0; index < lineCount; index++) {
			int length = lines[index].length();
			if (i_60_ + length > i_57_ || index == lineCount - 1 && i_57_ == text.length()) {
				String string_63_ = text.substring(i_60_, i_57_);
				if (string_63_.endsWith("<br>")) {
					string_63_ = "";
					i_60_ += length;
					index++;
				}

				int x = textWidth(string_63_, icons);
				int y = index * height + -1971642963 * topPadding;
				return new Point(x, y);
			}

			i_60_ += length;
		}

		return null;
	}

	public int method610(String string, int width, int i_66_, int i_67_, int index, HorizontallyScalable[] icons) {
		if (0 == i_66_) {
			i_66_ = verticalSpacing * 108311343;
		}

		int lineCount = splitLines(string, new int[] { width }, icons, false, lines);
		if (lineCount == 0) {
			return 0;
		}

		if (index < 0) {
			index = 0;
		}

		index /= i_66_;
		if (index >= lineCount) {
			index = lineCount - 1;
		}

		String line = lines[index];
		int length = 0;
		int i_73_ = 0;
		int i_74_;
		for (i_74_ = 0; i_74_ < i_67_ && length < line.length(); i_74_ = textWidth(line.substring(0, ++length), icons)) {
			i_73_ = i_74_;
		}

		if (length == line.length() && line.endsWith("<br>")) {
			length -= 4;
		}

		if (i_67_ - i_73_ < i_74_ - i_67_) {
			length--;
		}

		for (int i_75_ = 0; i_75_ < index; i_75_++) {
			length += lines[i_75_].length();
		}

		return length;
	}

	public int textWidth(String string) {
		return textWidth(string, null);
	}

	public int textWidth(String text, int bound, HorizontallyScalable[] icons) {
		int lineCount = splitLines(text, new int[] { bound }, icons, lines);
		int maxWidth = 0;

		for (int index = 0; index < lineCount; index++) {
			int width = textWidth(lines[index], icons);
			if (width > maxWidth) {
				maxWidth = width;
			}
		}

		return maxWidth;
	}

	public int splitLines(String text, int[] bounds, HorizontallyScalable[] icons, String[] output) {
		return splitLines(text, bounds, icons, true, output);
	}

	public int textHeight(String string, int width, int verticalSpacing, HorizontallyScalable[] icons) {
		if (0 == verticalSpacing) {
			verticalSpacing = this.verticalSpacing * 108311343;
		}

		int count = splitLines(string, new int[] { width }, icons, lines);
		int height = verticalSpacing * (count - 1);
		return height + topPadding * -1971642963 + bottomPadding * -1569538073;
	}

	public int textWidth(String string, HorizontallyScalable[] icons) {
		if (null == string) {
			return 0;
		}

		int escapeStart = -1;
		int previous = -1;
		int width = 0;
		int length = string.length();

		for (int index = 0; index < length; index++) {
			char current = string.charAt(index);
			if ('<' == current) {
				escapeStart = index;
			} else {
				if ('>' == current && -1 != escapeStart) {
					String escaped = string.substring(escapeStart + 1, index);
					escapeStart = -1;
					if (escaped.equals("lt")) {
						current = '<';
					} else if (escaped.equals("gt")) {
						current = '>';
					} else if (escaped.equals("nbsp")) {
						current = '\u00a0';
					} else if (escaped.equals("shy")) {
						current = '\u00ad';
					} else if (escaped.equals("times")) {
						current = '\u00d7';
					} else if (escaped.equals("euro")) {
						current = '\u20ac';
					} else if (escaped.equals("copy")) {
						current = '\u00a9';
					} else if (escaped.equals("reg")) {
						current = '\u00ae';
					} else {
						if (escaped.startsWith("img=") && null != icons) {
							try {
								int id = Client.parseDecimal(escaped.substring(4));
								width += icons[id].scaleWidth();
								previous = -1;
							} catch (Exception exception) {

							}
						}
						continue;
					}
				}

				if (escapeStart == -1) {
					width += glyphWidths[Class483.charToByte(current) & 0xff] & 0xff;
					if (glyphSpacing != null && previous != -1) {
						width += glyphSpacing[previous][current];
					}
					previous = current;
				}
			}
		}
		return width;
	}

	int splitLines(String text, int[] bounds, HorizontallyScalable[] icons, boolean bool, String[] lines) {
		if (text == null) {
			return 0;
		}

		int lineWidth = 0;
		int lineStart = 0;
		int lastSpace = -1;
		int widthOffset = 0;
		int spaceOffset = 0;
		int escapeStart = -1;
		int previous = -1;
		int lineCount = 0;
		int length = text.length();

		for (int index = 0; index < length; index++) {
			int current = Class483.charToByte(text.charAt(index)) & 0xff;
			int currentWidth = 0;

			if ('<' == current) {
				escapeStart = index;
			} else {
				int lineEnd;
				if (-1 != escapeStart) {
					if (current != '>') {
						continue;
					}

					lineEnd = escapeStart;
					String escaped = text.substring(1 + escapeStart, index);
					escapeStart = -1;

					if (escaped.equals("br")) {
						lines[lineCount] = text.substring(lineStart, index + 1);
						if (++lineCount >= lines.length) {
							return 0;
						}

						lineStart = 1 + index;
						lineWidth = 0;
						lastSpace = -1;
						previous = -1;
						continue;
					} else if (escaped.equals("lt")) {
						currentWidth += getWidth(60);
						if (glyphSpacing != null && -1 != previous) {
							currentWidth += glyphSpacing[previous][60];
						}
						previous = 60;
					} else if (escaped.equals("gt")) {
						currentWidth += getWidth(62);
						if (glyphSpacing != null && previous != -1) {
							currentWidth += glyphSpacing[previous][62];
						}
						previous = 62;
					} else if (escaped.equals("nbsp")) {
						currentWidth += getWidth(160);
						if (glyphSpacing != null && previous != -1) {
							currentWidth += glyphSpacing[previous][160];
						}
						previous = 160;
					} else if (escaped.equals("shy")) {
						currentWidth += getWidth(173);
						if (null != glyphSpacing && -1 != previous) {
							currentWidth += glyphSpacing[previous][173];
						}
						previous = 173;
					} else if (escaped.equals("times")) {
						currentWidth += getWidth(215);
						if (null != glyphSpacing && -1 != previous) {
							currentWidth += glyphSpacing[previous][215];
						}
						previous = 215;
					} else if (escaped.equals("euro")) {
						currentWidth += getWidth(8364);
						if (glyphSpacing != null && -1 != previous) {
							currentWidth += glyphSpacing[previous][8364];
						}
						previous = 8364;
					} else if (escaped.equals("copy")) {
						currentWidth += getWidth(169);
						if (null != glyphSpacing && previous != -1) {
							currentWidth += glyphSpacing[previous][169];
						}
						previous = 169;
					} else if (escaped.equals("reg")) {
						currentWidth += getWidth(174);
						if (glyphSpacing != null && previous != -1) {
							currentWidth += glyphSpacing[previous][174];
						}
						previous = 174;
					} else if (escaped.startsWith("img=") && icons != null) {
						try {
							int id = Client.parseDecimal(escaped.substring(4));
							currentWidth += icons[id].scaleWidth();
							previous = -1;
						} catch (Exception exception) {

						}
					}
					current = -1;
				} else {
					lineEnd = index;
					currentWidth += getWidth(current);

					if (glyphSpacing != null && -1 != previous) {
						currentWidth += glyphSpacing[previous][current];
					}
					previous = current;
				}

				if (currentWidth > 0) {
					lineWidth += currentWidth;
					if (bounds != null) {
						if (current == 32) {
							lastSpace = index;
							widthOffset = lineWidth;
							spaceOffset = bool ? 1 : 0;
						}

						if (lineWidth > bounds[lineCount < bounds.length ? lineCount : bounds.length - 1]) {
							if (lastSpace >= 0) {
								lines[lineCount] = text.substring(lineStart, 1 + lastSpace - spaceOffset);
								if (++lineCount >= lines.length) {
									return 0;
								}

								lineStart = 1 + lastSpace;
								lastSpace = -1;
								lineWidth -= widthOffset;
								previous = -1;
							} else {
								lines[lineCount] = text.substring(lineStart, lineEnd);
								if (++lineCount >= lines.length) {
									return 0;
								}

								lineStart = lineEnd;
								lastSpace = -1;
								lineWidth = currentWidth;
								previous = -1;
							}
						}

						if (current == 45) {
							lastSpace = index;
							widthOffset = lineWidth;
							spaceOffset = 0;
						}
					}
				}
			}
		}

		if (text.length() > lineStart) {
			lines[lineCount] = text.substring(lineStart, text.length());
			lineCount++;
		}

		return lineCount;
	}

	public static FontSpecification create(Archive fonts, int entry, int child) {
		byte[] data = fonts.get(entry, child);
		if (data == null) {
			return null;
		}
	
		return new FontSpecification(data);
	}
}
