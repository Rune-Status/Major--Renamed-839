package com.jagex;

import java.awt.DisplayMode;
import java.awt.Frame;
import java.awt.GraphicsDevice;
import java.awt.GraphicsEnvironment;
import java.lang.reflect.Field;

public class FullScreenAdapter {

	public static void method13393(int plane, int localX, int localZ, int group, int id, int type, int orientation) {
		Class480_Sub12 current = null;
		for (Class480_Sub12 next = (Class480_Sub12) Class480_Sub12.aClass644_10068.head(); null != next; next = (Class480_Sub12) Class480_Sub12.aClass644_10068
				.next()) {
			if (-618261599 * next.plane == plane && next.localX * 1155137153 == localX
					&& localZ == next.localZ * 51547319 && next.group * -677397461 == group) {
				current = next;
				break;
			}
		}

		if (null == current) {
			current = new Class480_Sub12();
			current.plane = plane * 1586008161;
			current.group = -1555094909 * group;
			current.localX = localX * -1064812159;
			current.localZ = 1342836999 * localZ;

			if (localX >= 0 && localZ >= 0 && localX < Client.aClass460_10760.method7680()
					&& localZ < Client.aClass460_10760.method7707()) {
				Class27.method789(current);
			}

			Class480_Sub12.aClass644_10068.pushBack(current);
		}

		current.id = id * 340568737;
		current.type = type * -1339454739;
		current.orientation = -191354477 * orientation;
		current.aBool10069 = true;
		current.aBool10063 = false;
	}

	DisplayMode previousMode;
	GraphicsDevice device;

	public FullScreenAdapter() throws Exception {
		GraphicsEnvironment environment = GraphicsEnvironment.getLocalGraphicsEnvironment();
		device = environment.getDefaultScreenDevice();

		if (!device.isFullScreenSupported()) {
			for (GraphicsDevice device : environment.getScreenDevices()) {
				if (device != null && device.isFullScreenSupported()) {
					this.device = device;
					return;
				}
			}

			throw new Exception();
		}
	}

	int[] getDisplayProperties() {
		DisplayMode[] modes = device.getDisplayModes();
		int[] values = new int[modes.length << 2];

		for (int index = 0; index < modes.length; index++) {
			values[index << 2] = modes[index].getWidth();
			values[1 + (index << 2)] = modes[index].getHeight();
			values[(index << 2) + 2] = modes[index].getBitDepth();
			values[(index << 2) + 3] = modes[index].getRefreshRate();
		}

		return values;
	}

	void enable(Frame frame, int width, int height, int bitDepth, int refreshRate) {
		previousMode = device.getDisplayMode();
		if (null == previousMode) {
			throw new NullPointerException();
		}

		frame.setUndecorated(true);
		frame.enableInputMethods(false);
		setFullScreenWindow(frame);

		if (refreshRate == 0) {
			int oldRate = previousMode.getRefreshRate();
			boolean higherRate = false;

			for (DisplayMode mode : device.getDisplayModes()) {
				if (mode.getWidth() == width && mode.getHeight() == height && mode.getBitDepth() == bitDepth) {
					int rate = mode.getRefreshRate();

					if (!higherRate || Math.abs(rate - oldRate) < Math.abs(refreshRate - oldRate)) {
						refreshRate = rate;
						higherRate = true;
					}
				}
			}

			if (!higherRate) {
				refreshRate = oldRate;
			}
		}

		device.setDisplayMode(new DisplayMode(width, height, bitDepth, refreshRate));
	}

	void disable() {
		if (null != previousMode) {
			boolean found = false;

			for (DisplayMode mode : device.getDisplayModes()) {
				if (mode.equals(previousMode)) {
					device.setDisplayMode(previousMode);
					found = true;
					break;
				}
			}

			if (!found) {
				try {
					Field defaultDisplayMode = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField(
							"defaultDisplayMode");
					defaultDisplayMode.setAccessible(true);
					defaultDisplayMode.set(device, null);
				} catch (Throwable throwable) {

				}
			}

			previousMode = null;
		}

		setFullScreenWindow(null);
	}

	void setFullScreenWindow(Frame frame) {
		boolean validDevice = false;
		try {
			Field valid = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
			valid.setAccessible(true);

			if ((Boolean) valid.get(device)) {
				valid.set(device, Boolean.FALSE);
				validDevice = true;
			}
		} catch (Throwable throwable) {

		}

		try {
			device.setFullScreenWindow(frame);
			if (validDevice) {
				try {
					Field valid = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					valid.set(device, Boolean.TRUE);
				} catch (Throwable throwable) {

				}
			}
		} catch (Exception object) {
			if (validDevice) {
				try {
					Field valid = Class.forName("sun.awt.Win32GraphicsDevice").getDeclaredField("valid");
					valid.set(device, Boolean.TRUE);
				} catch (Throwable throwable) {

				}
			}
		}
	}

}