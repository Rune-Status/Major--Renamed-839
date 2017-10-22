package com.jagex;

public class ShaderMetaBuffer {
	public static int unreadMessages;

	public static void method4368(Archive widgets, Archive models, Archive sprites, Archive fonts) {
		UnboundedDefinitionLoaderIterator.widgets = widgets;
		Class54.models = models;
		Class128.sprites = sprites;
		Class598.loadedInterfaces = new Interface[UnboundedDefinitionLoaderIterator.widgets.entryCount()];
		Widget.aBoolArray2558 = new boolean[UnboundedDefinitionLoaderIterator.widgets.entryCount()];
	}

	static void method4369(int i, int i_7_, Widget widget, byte i_8_) {
		int i_9_ = widget.width * 688089097 + i;
		int i_10_ = 15 + i_7_;

		if (Client.displayFps) {
			int i_11_ = -256;
			if (-1101491257 * Engine.anInt6488 < 20) {
				i_11_ = -65536;
			}

			Client.p12Full.method2318("Fps:" + -1101491257 * Engine.anInt6488 + " (" + Engine.anInt6489 * 835525597
					+ " ms)", i_9_, i_10_, i_11_, -1);

			i_10_ += 15;
			Runtime runtime = Runtime.getRuntime();
			long total = runtime.totalMemory() / 1024L;
			long used = total - runtime.freeMemory() / 1024L;
			int i_13_ = -256;
			if (used > 262144L) {
				i_13_ = -65536;
			}

			Client.p12Full.method2318("Mem:" + used + "/" + total + "k", i_9_, i_10_, i_13_, -1);

			i_10_ += 15;
			long l_14_ = Client.gameConnection.monitor.getLatency();
			String string = "N/A";
			if (l_14_ != -1L) {
				string = l_14_ + "ms";
				if (l_14_ > 500L) {
					string = Item.getColourHtml(16711680) + string + Item.getColourHtml(16776960);
				}
			}

			Client.p12Full.method2318("Game: In:" + Client.gameConnection.readRate * 1754788389 + "B/s " + "Out:"
					+ -1065852447 * Client.gameConnection.writeRate + "B/s " + "Ping:" + string, i_9_, i_10_, -256, -1);
			i_10_ += 15;
			long latency = Client.lobbyConnection.monitor.getLatency();
			String ping = "N/A";
			if (-1L != latency) {
				ping = latency + "ms";
				if (latency > 500L) {
					ping = Item.getColourHtml(16711680) + ping + Item.getColourHtml(16776960);
				}
			}

			Client.p12Full.method2318("Lobby: In:" + Client.lobbyConnection.readRate * 1754788389 + "B/s " + "Out:"
					+ Client.lobbyConnection.writeRate * -1065852447 + "B/s " + "Ping:" + ping, i_9_, i_10_, -256, -1);
			i_10_ += 15;
			int offheap = Class60.activeToolkit.offheapSize() / 1024;
			Client.p12Full.method2318("Offheap:" + offheap + "k", i_9_, i_10_, offheap > 65536 ? -65536 : -256, -1);
			i_10_ += 15;
			int i_18_ = 0;
			int i_19_ = 0;
			int i_20_ = 0;

			for (ArchiveResourceProvider element : Archive.providers) {
				if (null != element && element.method15370()) {
					i_18_ += element.entryCount();
					i_19_ += element.getLoaded();
					i_20_ += element.extrasCount();
				}
			}

			int i_22_ = i_18_ == 0 ? 0 : i_20_ * 100 / i_18_;
			int i_23_ = 0 == i_18_ ? 0 : 10000 * i_19_ / i_18_;
			String string_24_ = "Cache:" + Client.formatLong(i_23_, 2, true, Language.ENGLISH) + "% (" + i_22_ + "%)";
			Class558.p11Full.method2318(string_24_, i_9_, i_10_, -256, -1);
			i_10_ += 12;
		}
	}

	static final void method4370(boolean bool) {
		CustomisedItem.method13892(1764783361 * Client.anInt10790, 1319181337 * Engine.screenWidth, -551672947
				* Engine.screenHeight, bool);
	}

	int offset;
	byte[] buffer;

	ShaderMetaBuffer(byte[] buffer) {
		this.buffer = buffer;
		offset = 0;
	}

	int readUShort() {
		short value = 0;
		for (int shift = 0; shift < 2; shift++) {
			value |= (buffer[(offset += 1796603597) * -74572283 - 1] & 0xff) << 8 * shift;
		}

		return value;
	}

	String readString() {
		int length = readUShort();
		if (length == -1) {
			return null;
		}

		if (length > 256) {
			throw new IllegalShaderStringLengthException();
		}

		String string = new String(buffer, -74572283 * offset, length);
		offset += length * 1796603597;
		return string;
	}

}