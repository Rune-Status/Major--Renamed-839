package com.jagex;

import java.io.IOException;
import java.net.Socket;

public abstract class SocketProvider {

	public static String toUrlSafe(CharSequence sequence) {
		int length = sequence.length();
		StringBuilder builder = new StringBuilder(length);

		for (int index = 0; index < length; index++) {
			char character = sequence.charAt(index);
			if (character >= 'a' && character <= 'z' || character >= 'A' && character <= 'Z' || character >= '0'
					&& character <= '9' || character == '.' || character == '-' || character == '*' || character == '_') {
				builder.append(character);
			} else if (character == ' ') {
				builder.append('+');
			} else {
				int b = Class483.charToByte(character);
				builder.append('%');
				int packed = b >> 4 & 0xf;
				if (packed >= 10) {
					builder.append((char) (packed + 55));
				} else {
					builder.append((char) (packed + 48));
				}

				packed = b & 0xf;
				if (packed >= 10) {
					builder.append((char) (55 + packed));
				} else {
					builder.append((char) (packed + 48));
				}
			}
		}

		return builder.toString();
	}

	public static void method13763() {
		if (Class31.loginStep * -1087837371 == 108) {
			Class31.loginStep = -781018025;
		}
	}

	static void method13762(int plane, int localX, int localZ, int group, int i_7_, int type, Class540 class540) {
		Class480_Sub12 class480_sub12 = null;
		for (Class480_Sub12 class480_sub12_10_ = (Class480_Sub12) Class480_Sub12.aClass644_10067.head(); null != class480_sub12_10_; class480_sub12_10_ = (Class480_Sub12) Class480_Sub12.aClass644_10067
				.next()) {
			if (plane == class480_sub12_10_.plane * -618261599 && localX == 1155137153 * class480_sub12_10_.localX
					&& localZ == 51547319 * class480_sub12_10_.localZ && group == -677397461 * class480_sub12_10_.group) {
				class480_sub12 = class480_sub12_10_;
				break;
			}
		}

		if (class480_sub12 == null) {
			class480_sub12 = new Class480_Sub12();
			class480_sub12.plane = plane * 1586008161;
			class480_sub12.group = -1555094909 * group;
			class480_sub12.localX = localX * -1064812159;
			class480_sub12.localZ = localZ * 1342836999;
			Class480_Sub12.aClass644_10067.pushBack(class480_sub12);
		}

		class480_sub12.id = i_7_ * 340568737;
		class480_sub12.type = -1339454739 * type;
		class480_sub12.aClass540_10066 = class540;
		class480_sub12.aBool10069 = true;
		class480_sub12.aBool10063 = false;
	}

	int port;
	String host;

	SocketProvider() {

	}

	public abstract Socket provide() throws IOException;

	Socket direct() throws IOException {
		return new Socket(host, 147585685 * port);
	}

}