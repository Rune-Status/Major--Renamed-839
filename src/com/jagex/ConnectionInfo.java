package com.jagex;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

public class ConnectionInfo {
	public static void method13843(int i, int i_1_, int i_2_, String option) {
		Widget widget = Class185.method3584(i_1_, i_2_);
		if (null != widget) {
			if (null != widget.anObjectArray2553) {
				ScriptContext script = new ScriptContext();
				script.source = widget;
				script.menuIndex = i * -718980677;
				script.menuOption = option;
				script.arguments = widget.anObjectArray2553;
				Script.execute(script);
			}

			if (Client.method17050(widget).method15632(i - 1)) {
				BufferedConnectionContext connection = Client.getActiveConnection();
				if (Client.gameState * -1501875989 == 8 || -1501875989 * Client.gameState == 16
						|| -1501875989 * Client.gameState == 6) {
					if (widget.aString2530 != null && null != widget.aClass227_2531) {
						OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3946,
								connection.encryptor);
						frame.payload.writeByte(7 + Buffer.encodedStringLength(widget.aString2530) + 1);

						frame.payload.writeShortA(i_2_);
						frame.payload.writeByte(i);
						frame.payload.writeInt(i_1_);
						frame.payload.writeByte(widget.aClass227_2531.getId());
						frame.payload.writeCString(widget.aString2530);

						connection.sendFrame(frame);
					} else {
						Class222.method4166(connection, widget, i, i_1_, i_2_);
					}
				}
			}
		}
	}

	static void method10388() {
		if (ArchiveLoader.aClass622_4521 == Class622.aClass622_8012) {
			Class177.aClass672_1992.port = -2116202999;
			Class177.aClass672_1992.alternatePort = 364821904;
		} else if (ArchiveLoader.aClass622_4521.method10432(Class620.aClass620_7991)) {
			Class671.lobbyConnectionInfo.port = 759363264 + -1309620211 * Class671.lobbyConnectionInfo.id;
			Class671.lobbyConnectionInfo.alternatePort = 380423312 + Class671.lobbyConnectionInfo.id * 733597859;
			Class177.aClass672_1992.port = 759363264 + Class177.aClass672_1992.id * -1309620211;
			if (Class177.aClass672_1992.aBool8472) {
				Class177.aClass672_1992.alternatePort = -1111289248 + 733597859 * Class177.aClass672_1992.id;
			} else {
				Class177.aClass672_1992.alternatePort = 733597859 * Class177.aClass672_1992.id + 1857145528;
			}
		} else if (ArchiveLoader.aClass622_4521 == Class622.aClass622_8003) {
			Class671.lobbyConnectionInfo.port = Class671.lobbyConnectionInfo.id * -1309620211 + 759363264;
			Class671.lobbyConnectionInfo.alternatePort = 733597859 * Class671.lobbyConnectionInfo.id + 380423312;
			Class177.aClass672_1992.port = Class177.aClass672_1992.id * -1309620211 + 759363264;
			if (Class177.aClass672_1992.aBool8472) {
				Class177.aClass672_1992.alternatePort = Class177.aClass672_1992.id * 733597859 + -1111289248;
			} else {
				Class177.aClass672_1992.alternatePort = 733597859 * Class177.aClass672_1992.id + 1857145528;
			}
		}
	}

	public boolean aBool8472;
	public int id;
	public int port = -111502546;
	public int alternatePort = 302214375;
	public String host;
	boolean alternate = true;
	boolean proxied;

	public ConnectionInfo(boolean bool) {
		aBool8472 = bool;
	}

	public Socket createSocket() throws IOException {
		if (!proxied) {
			return new Socket(InetAddress.getByName(host), alternate ? -2076740083 * alternatePort : 1349599907 * port);
		}

		return ProxySocketProvider.create(host, alternate ? -2076740083 * alternatePort : port * 1349599907).provide();
	}

	public boolean equals(ConnectionInfo other) {
		if (null == other) {
			return false;
		}

		return -1113605561 * other.id == -1113605561 * id && host.equals(other.host);
	}

	public int getPort() {
		if (alternate) {
			return alternatePort * -2076740083;
		}

		return 1349599907 * port;
	}

	public void swap() {
		if (!alternate) {
			alternate = true;
			proxied = true;
		} else if (proxied) {
			proxied = false;
		} else {
			alternate = false;
		}
	}

}