package com.jagex;

import java.io.IOException;
import java.util.Date;

public final class CutsceneMob {
	static final int anInt1921 = 25;

	public static void method3383(byte i) {
		Class598.loadedInterfaces = new Interface[UnboundedDefinitionLoaderIterator.widgets.entryCount()];
		Widget.aBoolArray2558 = new boolean[UnboundedDefinitionLoaderIterator.widgets.entryCount()];
	}

	public static void printConsoleMessage(String string) {
		if (Class65.consoleMessages == null) {
			Class526.initConsole();
		}
		Client.calendar.setTime(new Date(TimeUtil.time()));
		int hour = Client.calendar.get(11);
		int minute = Client.calendar.get(12);
		int second = Client.calendar.get(13);
		String time = new StringBuilder().append(Integer.toString(hour / 10)).append(hour % 10).append(":")
				.append(minute / 10).append(minute % 10).append(":").append(second / 10).append(second % 10).toString();
		String[] messages = Class374.splitString(string, '\n');
		for (String message : messages) {
			for (int index = 951436779 * Class65.anInt1003; index > 0; index--) {
				Class65.consoleMessages[index] = Class65.consoleMessages[index - 1];
			}
			Class65.consoleMessages[0] = new StringBuilder().append(time).append(": ").append(message).toString();
			if (IgnoredPlayer.logFile != null) {
				try {
					IgnoredPlayer.logFile.write(Wall.getStringBytes(new StringBuilder()
							.append(Class65.consoleMessages[0]).append("\n").toString()));
				} catch (IOException ioexception) {

				}
			}

			if (Class65.anInt1003 * 951436779 < Class65.consoleMessages.length - 1) {
				Class65.anInt1003 += 1884895939;
				if (703340807 * Class65.anInt1002 > 0) {
					Class65.anInt1002 += -370967369;
				}
			}
		}
	}

	static final void method3384(Widget class226, Interface class221, ScriptExecutionContext class613, int i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (ScriptExecutionContext.method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2492 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static final void method3385(ScriptExecutionContext class613) {
		AnimationFrameBase.method15586();
	}

	static final void method3387(ScriptExecutionContext class613, int i) {
		class613.anIntArray7942[(class613.anInt7924 += 1122685165) * 1841827045 - 1] = ItemDefinition.aClass192_8339
				.method3764().size();
	}

	public int id;
	public boolean initialised = false;
	int[] animations;
	int index;
	Npc npc;
	Player player;
	public static CutsceneMob[] mobs;

	CutsceneMob(Buffer buffer, int index) {
		npc = null;
		player = null;
		this.index = 1274488431 * index;

		int type = buffer.readUByte();
		switch (type) {
			case 1:
				id = -1224784333;
				break;
			case 0:
				id = buffer.readSmart32() * 1224784333;
				break;
			default:
				id = -1224784333;
		}

		buffer.readString();
	}

	public Mob getMob() {
		if (null != npc) {
			return npc;
		}

		return player;
	}

	void move(int x, int z, int plane) {
		if (null != npc) {
			npc.move(x, z, plane, true, npc.boundSize());
		} else {
			player.plane = player.collisionPlane = (byte) plane;
			player.move(x, z);
		}
	}

	void move(int x, int y, int plane, int direction) {
		if (!initialised) {
			initialised = true;

			if (id * 1379064581 >= 0) {
				npc = new Npc(Client.aClass460_10760.method7687(), 25);
				npc.index = index * -2025440629;
				npc.lastUpdate = Client.tick * 648279047;
				npc.setDefinition(NpcDefinition.loader.get(id * 1379064581));
				npc.setBoundSize(2117527163 * npc.definition.boundSize);
				npc.anInt11540 = (1704389047 * npc.definition.contrast << 3) * 2036386683;
				npc.drawPriority = ((Class163.anInt1907 += -1697778917) * 630140691 - 1) * 909218291;
			} else {
				player = new Player(Client.aClass460_10760.method7687(), 25);
				player.method18251(HashedVariableCollection.aClass480_Sub17_1484);
				player.index = index * -2025440629;
				player.lastUpdate = Client.tick * 648279047;
				player.drawPriority = ((Class163.anInt1907 += -1697778917) * 630140691 - 1) * 909218291;
			}
		}

		if (1379064581 * id >= 0) {
			npc.move(x, y, plane, true, npc.boundSize());
			npc.turn(direction, true);
		} else {
			player.plane = player.collisionPlane = (byte) plane;
			player.move(x, y);
			player.turn(direction, true);
		}
	}

	boolean ready() {
		if (id * 1379064581 >= 0) {
			NpcDefinition definition = NpcDefinition.loader.get(id * 1379064581);
			boolean ready = definition.ready();

			if (null == animations) {
				Class515 class515 = ProxyingVariableLoader.aClass678_Sub6_3003.get(995718295 * definition.anInt3021);
				animations = class515.method8827();
			}

			for (int animation : animations) {
				ready &= AnimationDefinition.loader.get(animation).ready();
			}

			return ready;
		}

		return true;
	}

	void reset() {
		npc = null;
		player = null;
		initialised = false;
	}

}