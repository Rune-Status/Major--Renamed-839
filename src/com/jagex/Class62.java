package com.jagex;

import java.math.BigInteger;

import com.jagex.twitch.TwitchTV;
import com.jagex.twitch.TwitchWebcamDevice;

public class Class62 {
	public static BigInteger aBigInteger685;
	static BigInteger LOGIN_RSA_EXPONENT = new BigInteger("10001", 16);
	public static BigInteger aBigInteger687;
	static BigInteger LOGIN_RSA_MODULUS = new BigInteger(
			"9d6eba0900c994de5526fe93a6c2a80584523b17f0dd280cd7470d4f468398172c358047311d503cfea41c968b55b3254f55f01aaa9197ab3c3cf84b1cd9d4df5e3f5ebd48a89726275a727ea7a54eb31a7c7832def6c2a6fffad250e7ef8cf595a160f0bb4486ba5c7628363982a66b77f3b51d7970ff2811b6951c8ecc9e53",
			16);
	static DisplayProperties[] aClass651Array689;

	static {
		aBigInteger687 = new BigInteger("10001", 16);
		aBigInteger685 = new BigInteger(
				"c37b6d631a0bad9e91e926a231b3b19f6293b54050fffea22cc9f30de5f937e1e2a7292c0d71e40d7cb6115f593c2a73c6550ce06442ceb6e63f6ed9be126b0c2131cfcfbf55666ef8c6ed37b094dc74785547192d62530e78122b2d97546dc96533e846b099874369e2ad2739d2c9e4c9b33f835e61d698ce61607e6015c092209be65825de32857191b8481372e133fb829c4f47f06bb825b5ac61d1e2ea91af045b9e24711f2696f08df3c477a9abdfbc4610bbe4810ee588b598435a6d7a593e34f7ed748d2fbbd7857267e81a3f0cf804ee15bac015d4c089f0221b24719e44b914610600bf2220680cf65afeb7644ebfb9329f67d78cdaa800ab8e85bc7fd190b37519cb6f9b115e85f0c244ca5337cdb69d053126e5c2bfdf9a9a210f86351590c94ec3a24baeff3a87d2f11b8dc48a282a168d5ca1b81dcae1e06f75d4641d53918b329d4cbae7902030d93d339c1f4ca773172d816b159f12697eceecbbb159cb54a53b50381ff3e79325e4d2172b6e805ef72b400ddb3e8758485f9104f4def4ac14ed1b7de66707742fb1485a924fd23fd42fb8049b59615f9dc09dc21f370a4394b23b93bfcd8c5d5700f2ab854fb0c6e84bcadecf243212efdd9ea4f777f98c68047954fd45ddd07111f62cbce578a80aa5b0a617cd6ad246f3120752ca45b4501ebd1bcd12db338d57973b6c170789282f2e5b32cca3ec00c5",
				16);
		new BigInteger("10001", 16);
		new BigInteger(
				"98594005a634cd1d637fa7e9ec3136577a199097fb110e9472a604c624697443c846edf7cabc49bfe9cb09fe972a79c42e150c53a1cc8b65a7ac63d3ea47ca2d",
				16);
	}

	public static int method1381(int i, int i_0_) {
		Class533.aTwitchWebcamFrameData7282 = null;
		Class533.aClass116_7274 = null;
		if (i < 0 || i >= TwitchWebcamDevice.webcamDevices.length) {
			return -1;
		}
		return TwitchTV.tv.StopWebcamDevice(-2113671549 * TwitchWebcamDevice.webcamDevices[i].anInt925);
	}

	public static void method1382(String string, boolean bool, Toolkit class134, Font class132, FontSpecification class9) {
		boolean bool_1_ = !Class82.aBool1187 || Class80.method1676();
		if (bool_1_) {
			if (Class82.aBool1187 && bool_1_) {
				class9 = Class110.aClass9_1411;
				class132 = class134.createFont(class9, Class82.aClass152_Sub1Array1186, true);
				int i_2_ = class9.textWidth(string, 250, null);
				int i_3_ = class9.textHeight(string, 250, 108311343 * class9.verticalSpacing, null);
				int i_4_ = ItemDeque.aClass152_9984.getWidth();
				int i_5_ = i_4_ + 4;
				i_2_ += i_5_ * 2;
				i_3_ += i_5_ * 2;
				if (i_2_ < ResetMobCutsceneAction.anInt9558 * -1336279639) {
					i_2_ = -1336279639 * ResetMobCutsceneAction.anInt9558;
				}
				if (i_3_ < -1256777137 * Class82.anInt1184) {
					i_3_ = Class82.anInt1184 * -1256777137;
				}
				int i_6_ = Class82.aClass349_1182.method5948(i_2_, -1936703811 * Client.anInt10682) + Class82.anInt1179
						* -1391401859;
				int i_7_ = Class82.aClass334_1177.method5811(i_3_, Client.anInt10813 * -73018749)
						+ -528850291 * Class82.anInt1180;
				class134.createSprite(Class80.aClass152_7063, false).method2085(
						i_6_ + Class82.aClass152_1178.getWidth(), i_7_ + Class82.aClass152_1178.getHeight(),
						i_2_ - Class82.aClass152_1178.getWidth() * 2, i_3_ - Class82.aClass152_1178.getHeight() * 2, 1,
						-1, 0);
				class134.createSprite(Class82.aClass152_1178, true).method2079(i_6_, i_7_);
				Class82.aClass152_1178.flipVertical();
				class134.createSprite(Class82.aClass152_1178, true).method2079(i_6_ + i_2_ - i_4_, i_7_);
				Class82.aClass152_1178.flipHorizontal();
				class134.createSprite(Class82.aClass152_1178, true).method2079(i_6_ + i_2_ - i_4_, i_3_ + i_7_ - i_4_);
				Class82.aClass152_1178.flipVertical();
				class134.createSprite(Class82.aClass152_1178, true).method2079(i_6_, i_3_ + i_7_ - i_4_);
				Class82.aClass152_1178.flipHorizontal();
				class134.createSprite(ItemDeque.aClass152_9984, true).method2084(i_6_,
						i_7_ + Class82.aClass152_1178.getHeight(), i_4_, i_3_ - Class82.aClass152_1178.getHeight() * 2);
				ItemDeque.aClass152_9984.rotateClockwise();
				class134.createSprite(ItemDeque.aClass152_9984, true).method2084(
						i_6_ + Class82.aClass152_1178.getWidth(), i_7_, i_2_ - Class82.aClass152_1178.getWidth() * 2,
						i_4_);
				ItemDeque.aClass152_9984.rotateClockwise();
				class134.createSprite(ItemDeque.aClass152_9984, true).method2084(i_6_ + i_2_ - i_4_,
						i_7_ + Class82.aClass152_1178.getHeight(), i_4_, i_3_ - Class82.aClass152_1178.getHeight() * 2);
				ItemDeque.aClass152_9984.rotateClockwise();
				class134.createSprite(ItemDeque.aClass152_9984, true).method2084(
						i_6_ + Class82.aClass152_1178.getWidth(), i_3_ + i_7_ - i_4_,
						i_2_ - Class82.aClass152_1178.getWidth() * 2, i_4_);
				ItemDeque.aClass152_9984.rotateClockwise();
				class132.method2294(string, i_5_ + i_6_, i_7_ + i_5_, i_2_ - i_5_ * 2, i_3_ - 2 * i_5_,
						CachedDefinitionLoader.anInt8502 * -883824013 | ~0xffffff, -1, 1, 1, 0, null, null, null, 0, 0);
				Client.method8796(i_6_, i_7_, i_2_, i_3_);
			} else {
				int i_8_ = class9.textWidth(string, 250, null);
				int i_9_ = class9.getLineCount(string, 250, null) * 13;
				int i_10_ = 4;
				int i_11_ = i_10_ + 6;
				int i_12_ = i_10_ + 6;
				class134.method2434(i_11_ - i_10_, i_12_ - i_10_, i_10_ + i_8_ + i_10_, i_10_ + i_9_ + i_10_,
						-16777216, 0);
				class134.method2625(i_11_ - i_10_, i_12_ - i_10_, i_10_ + i_8_ + i_10_, i_10_ + i_10_ + i_9_, -1, 0);
				class132.method2294(string, i_11_, i_12_, i_8_, i_9_, -1, -1, 1, 1, 0, null, null, null, 0, 0);
				Client.method8796(i_11_ - i_10_, i_12_ - i_10_, i_8_ + i_10_ + i_10_, i_10_ + i_9_ + i_10_);
			}
			if (bool) {
				class134.method2456();
				class134.method2370();
			}
		}
	}

	public static final void method1384(Widget class226, int i, int i_21_) {
		if (Client.aClass226_10801 == null && !Class56.menuOpen && class226 != null
				&& Class562.method9477(class226, 1431528156)) {
			Client.aClass226_10801 = class226;
			Client.aClass226_10802 = MobWalkCutsceneAction.method15116(class226);
			Client.anInt10803 = i * 2080472875;
			Client.anInt10804 = i_21_ * -931482949;
			Display.anInt1818 = 0;
			Client.aBool10814 = false;
		}
	}

	static final void method1383(boolean bool) {
		FrameBuffer buffer = Client.gameConnection.buffer;
		while (buffer.remainingBits(-842560185 * Client.gameConnection.currentFrameSize) >= 15) {
			int index = buffer.readBits(15);
			if (32767 == index) {
				break;
			}

			boolean newNpc = false;
			LinkableObject linkable = Client.npcs.get(index);
			if (null == linkable) {
				Npc npc = new Npc(Client.aClass460_10760.method7687());
				npc.index = 1228997701 * index;
				linkable = new LinkableObject(npc);
				Client.npcs.put(index, linkable);
				Client.aClass480_Sub25Array10654[(Client.anInt10862 += 1526871765) * -999337347 - 1] = linkable;
				newNpc = true;
			}

			Npc npc = (Npc) linkable.object;
			Client.npcIndices[(Client.npcCount += 541000323) * 1746328619 - 1] = index;
			npc.lastUpdate = Client.anInt10660 * 840355919;
			if (null != npc.definition && npc.definition.method5111()) {
				Class480_Sub18.method8150(npc);
			}

			npc.setDefinition(NpcDefinition.loader.get(buffer.readBits(15)));
			int direction = buffer.readBits(3) + 4 << 11 & 0x3fff;
			int stateUpdate = buffer.readBits(1);

			if (1 == stateUpdate) {
				Client.anIntArray10659[(Client.anInt10914 += 2038945077) * 1947309341 - 1] = index;
			}

			int dx;
			if (bool) {
				dx = buffer.readBits(8);
				if (dx > 127) {
					dx -= 256;
				}
			} else {
				dx = buffer.readBits(5);
				if (dx > 15) {
					dx -= 32;
				}
			}

			int plane = buffer.readBits(2);
			int discardQueue = buffer.readBits(1);
			int dz;

			if (bool) {
				dz = buffer.readBits(8);
				if (dz > 127) {
					dz -= 256;
				}
			} else {
				dz = buffer.readBits(5);
				if (dz > 15) {
					dz -= 32;
				}
			}

			npc.setBoundSize(npc.definition.boundSize * 2117527163);
			npc.anInt11540 = 2036386683 * (1704389047 * npc.definition.contrast << 3);

			if (newNpc) {
				npc.turn(direction, true);
			}

			npc.move(dx + Client.localPlayer.pathX[0], dz + Client.localPlayer.pathZ[0], plane, 1 == discardQueue,
					npc.boundSize());

			if (npc.definition.method5111()) {
				Class262.method4972(npc.plane, npc.pathX[0], npc.pathZ[0], 0, null, npc, null);
			}

			if (newNpc) {
				npc.method18269();
			}
		}

		buffer.enableBitAccess();
	}

	Class62() throws Throwable {
		throw new Error();
	}

}