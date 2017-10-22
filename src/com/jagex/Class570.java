package com.jagex;

import java.io.IOException;
import java.util.List;

public class Class570 {
	static int anInt7633;
	static Class361[] aClass361Array7635 = new Class361[16];
	static int anInt7636 = 0;
	static int anInt7637;
	static List aList7638;
	static HashTable aClass667_7639 = new HashTable(16);
	static int anInt7640;
	static int anInt7642;
	static int anInt7643;
	static HashTable aClass667_7644 = new HashTable(8);
	static int particleSetting = 1625351754;

	public static int method9646(byte[] buffer, int i, CharSequence sequence) {
		int length = sequence.length();
		int count = i;

		for (int index = 0; index < length; index++) {
			int character = sequence.charAt(index);
			if (character <= 127) {
				buffer[count++] = (byte) character;
			} else if (character <= 2047) {
				buffer[count++] = (byte) (0xc0 | character >> 6);
				buffer[count++] = (byte) (0x80 | character & 0x3f);
			} else {
				buffer[count++] = (byte) (0xe0 | character >> 12);
				buffer[count++] = (byte) (0x80 | character >> 6 & 0x3f);
				buffer[count++] = (byte) (0x80 | character & 0x3f);
			}
		}

		return count - i;
	}

	Class570() throws Throwable {
		throw new Error();
	}

	static final boolean decodeFrame(BufferedConnectionContext context) throws IOException {
		Connection connection = context.getConnection();
		FrameBuffer buffer = context.buffer;
		if (null == connection) {
			return false;
		}

		int opcode = 0;
		if (context.currentFrame == null) {
			if (context.aBool1198) {
				if (!connection.available(1)) {
					return false;
				}

				connection.read(context.buffer.payload, 0, 1);
				context.read += 487464349;
				context.idleReadPulses = 0;
				context.aBool1198 = false;
			}

			buffer.offset = 0;
			if (buffer.nextIsSmart()) {
				if (!connection.available(1)) {
					return false;
				}

				connection.read(context.buffer.payload, 1, 1);
				context.read += 487464349;
				context.idleReadPulses = 0;
			}

			context.aBool1198 = true;
			IncomingFrameMeta[] metas = IncomingFrameMeta.values();
			opcode = buffer.readEncryptedSmart();

			if (opcode < 0 || opcode >= metas.length) {
				throw new IOException(new StringBuilder().append(opcode).append(" ").append(-165875887 * buffer.offset)
						.toString());
			}

			context.currentFrame = metas[opcode];
			context.currentFrameSize = context.currentFrame.size * -258753063;
		}

		if (-1 == -842560185 * context.currentFrameSize) {
			if (!connection.available(1)) {
				return false;
			}

			connection.read(buffer.payload, 0, 1);
			context.currentFrameSize = 1282542711 * (buffer.payload[0] & 0xff);
			context.read += 487464349;
			context.idleReadPulses = 0;
		}

		if (-2 == -842560185 * context.currentFrameSize) {
			if (!connection.available(2)) {
				return false;
			}

			connection.read(buffer.payload, 0, 2);
			buffer.offset = 0;
			context.currentFrameSize = buffer.readUShort() * 1282542711;
			context.read += 974928698;
			context.idleReadPulses = 0;
		}

		if (-842560185 * context.currentFrameSize > 0) {
			if (!connection.available(-842560185 * context.currentFrameSize)) {
				return false;
			}

			buffer.offset = 0;
			connection.read(buffer.payload, 0, -842560185 * context.currentFrameSize);
			context.read += context.currentFrameSize * -1824215157;
			context.idleReadPulses = 0;
		}

		context.thirdLastFrame = context.secondLastFrame;
		context.secondLastFrame = context.lastFrame;
		context.lastFrame = context.currentFrame;

		if (context.currentFrame == IncomingFrameMeta.aClass386_4364) {
			Client.anInt10840 = -1202483205 * Client.anInt10823;

			if (0 == context.currentFrameSize * -842560185) {
				ItemDefinition.aClass192_8339 = null;
			} else {
				ItemDefinition.aClass192_8339 = new Class192(0L, buffer, true, Client.anInterface22_10652);
			}

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.REDUCE_ATTACK_OPTION_PRIORITY == context.currentFrame) {
			Client.reduceAttackPriority = buffer.readUByteA() == 1;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4432 == context.currentFrame) {
			Client.anInt10836 = -727869597 * Client.anInt10823;
			boolean bool = buffer.readUByte() == 1;

			if (context.currentFrameSize * -842560185 == 1) {
				if (bool) {
					JavaFont.aClass288_8793 = null;
				} else {
					MobChatCutsceneAction.aClass288_9645 = null;
				}

				context.currentFrame = null;
				return true;
			}

			if (bool) {
				JavaFont.aClass288_8793 = new ClanSettings(buffer);
			} else {
				MobChatCutsceneAction.aClass288_9645 = new ClanSettings(buffer);
			}

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4366 == context.currentFrame) {
			TurnMobCutsceneAction.aClass186_9434.method3620();
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4385 == context.currentFrame) {
			int i_3_ = buffer.readLEUShort();
			int i_4_ = buffer.readLEUShort();
			Class166_Sub6.method15081();
			Class474.method8102(i_4_, i_3_, 0);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4408 == context.currentFrame) {
			Class199.aClass126_Sub1_2099.method14034();
			context.currentFrame = null;
			return false;
		}
		if (context.currentFrame == IncomingFrameMeta.ANIMATE_OBJECT) {
			int packed = buffer.readNegatedUByte();
			int type = packed >> 2;
			int orientation = packed & 0x3;
			int group = Client.OBJECT_GROUPS[type];
			int i_9_ = buffer.readUByteA();
			int animation = buffer.readInt();
			int position = buffer.readLEInt();
			int plane = position >> 28 & 0x3;
			int localX = position >> 14 & 0x3fff;
			int localZ = position & 0x3fff;
			Class553 class553 = Client.aClass460_10760.method7679();
			localX -= class553.x * 2051316501;
			localZ -= class553.z * -180305283;
			Class540.animateObject(plane, localX, localZ, group, type, orientation, animation, i_9_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4379) {
			LinkableObject.aClass126_10169 = new HashedVariableCollection(Class501.aClass77_Sub1_Sub1_6903);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4331) {
			int i_15_ = buffer.readInt();
			int i_16_ = buffer.readInt();
			int i_17_ = buffer.readIMEInt();
			int i_18_ = buffer.readUShortA();
			int i_19_ = buffer.readIMEInt();
			int i_20_ = buffer.readUByteS();
			int i_21_ = buffer.readIMEInt();
			Class166_Sub6.method15081();
			Class480_Sub41.method4800(i_17_, new Class480_Sub41(i_18_, i_20_),
					new int[] { i_16_, i_19_, i_15_, i_21_ }, false);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4427) {
			int i_22_ = buffer.readUByteA();
			int i_23_ = buffer.readNegatedUByte();
			int i_24_ = buffer.readNegatedUByte();
			int i_25_ = buffer.readUByteA();
			int i_26_ = buffer.readLEUShort();
			Class166_Sub6.method15081();
			Client.aBoolArray10873[i_23_] = true;
			Client.anIntArray10709[i_23_] = i_24_;
			Client.anIntArray10875[i_23_] = i_25_;
			Client.anIntArray10876[i_23_] = i_22_;
			Client.anIntArray10877[i_23_] = i_26_;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SET_WIDGET_COLOUR) {
			int widget = buffer.readInt();
			int colour = buffer.readLEUShortA();
			Class166_Sub6.method15081();
			PulseEvent.setWidgetColour(widget, colour);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SPAWN_ANIMABLE) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.SPAWN_ANIMABLE);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4429 == context.currentFrame) {
			int i_29_ = buffer.readUByte();
			Class630 class630 = CompressionType.findIdentifiable(Class536.method9175(), i_29_);
			if (null == class630) {
				class630 = Class630.aClass630_8052;
			}

			Class296_Sub3.method15312(class630);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4352 == context.currentFrame) {
			boolean bool = buffer.readUByte() == 1;

			if (bool) {
				Class637.method13160(3);
			} else {
				Class637.method13160(2);
			}

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.REMOVE_GROUND_ITEM == context.currentFrame) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.REMOVE_GROUND_ITEM);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.PLAY_CUTSCENE) {
			int cutscene = buffer.readUShort();
			Client.anInt10627 = -2105868375;
			Client.currentCutscene = cutscene * 1216225047;
			Client.cutsceneStage = 902614604;
			Class140.cutscenes.fileLoaded(1642530983 * Client.currentCutscene);
			HitbarDefinition.method8950();
			FriendsChatPlayer.method1540();
			int i_31_ = buffer.readUShort();
			Client.anInt10681 = i_31_ * 560653091;
			int size = buffer.readUByte();
			HashedVariableCollection.aClass480_Sub17_1484 = new Buffer(size);
			HashedVariableCollection.aClass480_Sub17_1484.writeBytes(buffer.payload, buffer.offset * -165875887, size);
			buffer.offset += size * 1258142129;
			context.currentFrame = null;
			return false;
		}
		if (IncomingFrameMeta.aClass386_4452 == context.currentFrame) {
			int i_33_ = buffer.readLEUShortA();
			if (i_33_ == 65535) {
				i_33_ = -1;
			}

			int i_34_ = buffer.readUByteS();
			TurnMobCutsceneAction.aClass186_9434.method3617(i_33_, i_34_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4439 == context.currentFrame) {
			int i_35_ = buffer.readUByteA();
			int i_36_ = buffer.readIMEInt();
			int i_37_ = buffer.readUByteA();
			Class197.aClass566_9252.method9565(i_37_);
			PlayerVariableProvider.instance.aClass565Array1023[i_37_].method9532(i_36_);
			PlayerVariableProvider.instance.aClass565Array1023[i_37_].method9529(i_35_);
			Client.anIntArray10825[(Client.anInt10826 += 1068127179) * -1224820253 - 1 & 0x3f] = i_37_;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4387 == context.currentFrame) {
			int i_38_ = buffer.readLEUShort();
			byte i_39_ = buffer.readByte();
			Class166_Sub6.method15081();
			RegionUpdateType.method6032(i_38_, i_39_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4377) {
			FrameBuffer copy = new FrameBuffer(context.currentFrameSize * -842560185);
			System.arraycopy(context.buffer.payload, context.buffer.offset * -165875887, copy.payload, 0,
					context.currentFrameSize * -842560185);
			Class255.method4748();

			if (Class199.preferences.aClass632_Sub33_10293.getValue() == 1) {
				Class237.aClass461_2622.method7825(new Class452(Class458.aClass458_5154, copy));
			} else {
				Client.aClass460_10760.method7706(new Class452(Class458.aClass458_5154, copy));
			}

			context.currentFrame = null;
			return false;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4313) {
			int i_41_ = buffer.readUShort();
			int i_42_ = buffer.readIMEInt();
			int i_43_ = buffer.readInt();
			int i_44_ = buffer.readInt();
			int i_45_ = buffer.readLEUShortA();
			int i_46_ = buffer.readInt();
			int i_47_ = buffer.readIMEInt();
			int i_48_ = buffer.readUByteS();

			Class166_Sub6.method15081();
			Class480_Sub41.method4800(i_42_, new Class480_Sub41_Sub3(i_45_, i_48_, i_41_), new int[] { i_46_, i_47_,
					i_43_, i_44_ }, false);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.CHAT_MESSAGE) {
			int type = buffer.readUSmart();
			int i_50_ = buffer.readInt();
			int i_51_ = buffer.readUByte();
			String string = "";
			String string_52_ = string;

			if ((i_51_ & 0x1) != 0) {
				string = buffer.readString();
				if ((i_51_ & 0x2) != 0) {
					string_52_ = buffer.readString();
				} else {
					string_52_ = string;
				}
			}

			String message = buffer.readString();
			if (99 == type) {
				CutsceneMob.printConsoleMessage(message);
			} else if (98 == type) {
				ProgramDefinition.setConsoleText(message);
			} else {
				if (!string_52_.equals("") && IgnoredPlayer.isIgnored(string_52_)) {
					context.currentFrame = null;
					return true;
				}
				Class176.addChatMessage(type, i_50_, string, string_52_, string, message, null);
			}

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.IDENTIFY_HOST_NAME == context.currentFrame) {
			int ip = buffer.readInt();
			Class551.identifier = new HostNameIdentifier(ip);
			Thread thread = new Thread(Class551.identifier);
			thread.setPriority(1);
			thread.start();
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4334 == context.currentFrame) {
			int i_55_ = buffer.readMEInt();
			int i_56_ = buffer.readLEUShort();
			Class166_Sub6.method15081();
			RegionUpdateType.method6032(i_56_, i_55_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.LOGOUT_TO_LOBBY) {
			Class495_Sub1.logout(Class31.aBool438);
			context.currentFrame = null;
			return false;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4327) {
			String name = buffer.readString();
			long l = buffer.readUShort();
			long l_57_ = buffer.readUTriByte();
			Class351 class351 = CompressionType.findIdentifiable(Class351.values(), buffer.readUByte());
			boolean bool = buffer.readUByte() == 1;
			int i_58_ = buffer.readUShort();
			long l_59_ = (l << 32) + l_57_;
			boolean bool_60_ = false;

			while_43_: do {
				if (null == ItemDefinition.aClass192_8339) {
					bool_60_ = true;
				} else {
					for (int index = 0; index < 100; index++) {
						if (Client.aLongArray10666[index] == l_59_) {
							bool_60_ = true;
							break while_43_;
						}
					}
					if (class351.aBool3707 && IgnoredPlayer.isIgnored(name)) {
						bool_60_ = true;
					}
				}
			} while (false);

			if (!bool_60_) {
				Client.aLongArray10666[Client.anInt10866 * -373922325] = l_59_;
				Client.anInt10866 = (Client.anInt10866 * -373922325 + 1) % 100 * 1828952771;
				String string_62_ = ThemeMusicVolumeNormaliser.aClass10_2062.get(i_58_).decodeMessage(buffer);
				int i_63_ = bool ? 23 : 25;
				if (class351.crown * 1921955303 != -1) {
					JavaThreadResource.addChatMessage(i_63_, 0,
							Class290_Sub1.crown(class351.crown * 1921955303) + name,
							Class290_Sub1.crown(class351.crown * 1921955303) + name, name, string_62_,
							ItemDefinition.aClass192_8339.method3811(), i_58_, class351);
				} else {
					JavaThreadResource.addChatMessage(i_63_, 0, name, name, name, string_62_,
							ItemDefinition.aClass192_8339.method3811(), i_58_, class351);
				}
			}
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4350 == context.currentFrame) {
			int i_64_ = buffer.readIMEInt();
			Class166_Sub6.method15081();
			PulseEvent.method502(i_64_, 3, Client.localPlayerIndex * -406165969, 0);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4333 == context.currentFrame) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.aClass358_3820);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4401) {
			Client.anInt10642 = Client.anInt10823 * 1015592779;
			int i_65_ = -165875887 * buffer.offset;
			int i_66_ = buffer.readUShort();
			boolean bool = buffer.readUByte() == 1;
			Class200 class200 = ItemDefinition.aClass192_8339.method3806(i_66_);
			DefaultHashMap class666 = class200.method3893();

			if (null == class666 || bool) {
				class200.method3892(Client.anInterface22_10652);
				class666 = class200.method3893();
			}

			while (context.currentFrameSize * -842560185 - (buffer.offset * -165875887 - i_65_) > 0) {
				DefaultMapEntry class383 = BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726.method13918(buffer);
				class666.put(1960527763 * class383.key, class383.value);
			}

			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4435) {
			Client.anInt10837 = Client.anInt10823 * 1059111805;
			boolean bool = buffer.readUByte() == 1;
			Class280 class280 = new Class280(buffer);
			Class480_Sub33 class480_sub33;

			if (bool) {
				class480_sub33 = Class417.aClass480_Sub33_4650;
			} else {
				class480_sub33 = Class486.aClass480_Sub33_6643;
			}

			class280.method5216(class480_sub33);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4414) {
			int i_67_ = buffer.readMEInt();
			int i_68_ = buffer.readIMEInt();
			Class166_Sub6.method15081();
			ContainerHeader.method7120(i_68_, i_67_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4420) {
			LookupTable.method4583();
			context.currentFrame = null;
			return false;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4470) {
			Client.anInt10892 = -474621175;
			Client.anInt10834 = 822603117 * Client.anInt10823;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4291) {
			Client.anInt10837 = 1059111805 * Client.anInt10823;
			boolean bool = buffer.readUByte() == 1;
			if (-842560185 * context.currentFrameSize == 1) {
				if (bool) {
					Class417.aClass480_Sub33_4650 = null;
				} else {
					Class486.aClass480_Sub33_6643 = null;
				}

				context.currentFrame = null;
				return true;
			}

			if (bool) {
				Class417.aClass480_Sub33_4650 = new Class480_Sub33(buffer);
			} else {
				Class486.aClass480_Sub33_6643 = new Class480_Sub33(buffer);
			}

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4374 == context.currentFrame) {
			int i_69_ = buffer.readLEUShort();
			int i_70_ = buffer.readLEInt();
			int i_71_ = buffer.readLEInt();
			Class166_Sub6.method15081();
			PulseEvent.method502(i_71_, 5, i_69_, i_70_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4337 == context.currentFrame) {
			int i_72_ = buffer.readUShort();
			int i_73_ = buffer.readUByte();
			boolean bool = 1 == (i_73_ & 0x1);
			Class186.method3724(i_72_, bool);
			int i_74_ = buffer.readUShort();

			for (int i_75_ = 0; i_75_ < i_74_; i_75_++) {
				int i_76_ = buffer.readLEUShort();
				int i_77_ = buffer.readUByte();
				if (i_77_ == 255) {
					i_77_ = buffer.readInt();
				}

				NanoTimer.method683(i_72_, i_75_, i_76_ - 1, i_77_, bool);
			}

			Client.anIntArray10601[(Client.anInt10824 += 1460041323) * -860256701 - 1 & 0x3f] = i_72_;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4381) {
			int i_78_ = buffer.readUShort();
			int i_79_ = buffer.readUShort();
			int i_80_ = buffer.readUShort();
			Class166_Sub6.method15081();

			if (null != Class598.loadedInterfaces[i_78_]) {
				for (int i_81_ = i_79_; i_81_ < i_80_; i_81_++) {
					int i_82_ = buffer.readUTriByte();
					if (i_81_ < Class598.loadedInterfaces[i_78_].children.length
							&& Class598.loadedInterfaces[i_78_].children[i_81_] != null) {
						Class598.loadedInterfaces[i_78_].children[i_81_].anInt2375 = i_82_ * 741620033;
					}
				}
			}
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4378 == context.currentFrame) {
			int i_83_ = buffer.readUShort();
			ScriptInstruction.method7888(i_83_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4375) {
			if (Client.anInt10790 * 1764783361 != -1) {
				Widget.method15440(1764783361 * Client.anInt10790, 0);
			}
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4440 == context.currentFrame) {
			String string = buffer.readString();
			int port = buffer.readUShort();
			Class671.lobbyConnectionInfo.host = string;
			Class671.lobbyConnectionInfo.id = port * -212349065;
			ConnectionInfo.method10388();
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4461 == context.currentFrame) {
			int id = buffer.readUShort();
			byte value = buffer.readByteS();
			PlayerVariableProvider.instance.collection.updateVariableParameter(
					BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726.get(id), value);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4451 == context.currentFrame) {
			int i_87_ = buffer.readUShort();
			if (i_87_ == 65535) {
				i_87_ = -1;
			}
			int i_88_ = buffer.readUByte();
			int i_89_ = buffer.readUShort();
			int i_90_ = buffer.readUByte();
			int i_91_ = buffer.readUShort();

			TurnMobCutsceneAction.aClass186_9434.method3710(Class171.aClass171_1947, i_87_, i_88_, i_90_,
					Class156.aClass156_1876.method3293(), Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_91_, i_89_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4430 == context.currentFrame) {
			int i_92_ = buffer.readUByte();
			Class636 class636 = CompressionType.findIdentifiable(Class636.values(), i_92_);

			if (class636 == null) {
				class636 = Class636.aClass636_8125;
			}

			Class340_Sub2.method15400(class636);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.EXECUTE_SCRIPT == context.currentFrame) {
			String descriptor = buffer.readString();
			Object[] arguments = new Object[descriptor.length() + 1];

			for (int index = descriptor.length() - 1; index >= 0; index--) {
				if (descriptor.charAt(index) == 's') {
					arguments[1 + index] = buffer.readString();
				} else {
					arguments[index + 1] = new Integer(buffer.readInt());
				}
			}

			arguments[0] = new Integer(buffer.readInt());
			Class166_Sub6.method15081();
			ScriptContext script = new ScriptContext();
			script.arguments = arguments;
			Script.execute(script);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4368) {
			Client.anInt10795 = buffer.readShort() * 1999597139;
			Client.anInt10839 = Client.anInt10823 * 443759197;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4453 == context.currentFrame) {
			boolean bool = buffer.readUByte() == 1;
			String string = buffer.readString();
			long l = buffer.readUShort();
			long l_94_ = buffer.readUTriByte();
			Class351 class351 = CompressionType.findIdentifiable(Class351.values(), buffer.readUByte());
			int i_95_ = buffer.readUShort();
			long l_96_ = l_94_ + (l << 32);
			boolean bool_97_ = false;
			Class480_Sub33 class480_sub33 = bool ? Class417.aClass480_Sub33_4650 : Class486.aClass480_Sub33_6643;
			while_44_: do {
				if (null == class480_sub33) {
					bool_97_ = true;
				} else {
					for (int i_98_ = 0; i_98_ < 100; i_98_++) {
						if (Client.aLongArray10666[i_98_] == l_96_) {
							bool_97_ = true;
							break while_44_;
						}
					}
					if (class351.aBool3707 && IgnoredPlayer.isIgnored(string)) {
						bool_97_ = true;
					}
				}
			} while (false);
			if (!bool_97_) {
				Client.aLongArray10666[-373922325 * Client.anInt10866] = l_96_;
				Client.anInt10866 = (1 + -373922325 * Client.anInt10866) % 100 * 1828952771;
				String string_99_ = ThemeMusicVolumeNormaliser.aClass10_2062.get(i_95_).decodeMessage(buffer);
				int i_100_ = bool ? 42 : 45;
				if (1921955303 * class351.crown != -1) {
					JavaThreadResource.addChatMessage(i_100_, 0,
							new StringBuilder().append(Class290_Sub1.crown(1921955303 * class351.crown)).append(string)
									.toString(),
							new StringBuilder().append(Class290_Sub1.crown(1921955303 * class351.crown)).append(string)
									.toString(), string, string_99_, class480_sub33.aString10231, i_95_, class351);
				} else {
					JavaThreadResource.addChatMessage(i_100_, 0, string, string, string, string_99_,
							class480_sub33.aString10231, i_95_, class351);
				}
			}
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.UPDATE_PLAYERS) {
			Player.updatePlayers(buffer, context.currentFrameSize * -842560185);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4362 == context.currentFrame) {
			Class591 class591 = new Class591();
			boolean bool = class591.method9959(buffer);
			Client.aClass460_10760.method7690().method9696(Client.aClass460_10760, bool ? class591 : null,
					class591.method9953());
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4465) {
			int[] animations = new int[4];
			for (int index = 0; index < 4; index++) {
				animations[index] = buffer.readMEInt();
			}

			int i_102_ = buffer.readUByte();
			int index = buffer.readLEUShortA();
			LinkableObject<Npc> linkable = Client.npcs.get(index);

			if (linkable != null) {
				Mob.method8795(linkable.object, animations, i_102_, true);
			}

			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4294) {
			Class369.aClass261_Sub1_4079.method15142(buffer, context.currentFrameSize * -842560185);
			Client.anInt10842 = Client.anInt10823 * 2079065367;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4380 == context.currentFrame) {
			int i_104_ = buffer.readUShortA();
			byte i_105_ = buffer.readByte();
			Class166_Sub6.method15081();
			PulseEvent.setIntVarp(i_104_, i_105_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4438 == context.currentFrame) {
			String string = buffer.readString();
			int i_106_ = buffer.readUShort();
			String string_107_ = ThemeMusicVolumeNormaliser.aClass10_2062.get(i_106_).decodeMessage(buffer);
			JavaThreadResource.addChatMessage(19, 0, string, string, string, string_107_, null, i_106_, null);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4403) {
			int setting = buffer.readMEInt();
			int to = buffer.readLEUShortA();
			if (65535 == to) {
				to = -1;
			}

			int target = buffer.readMEInt();
			int from = buffer.readLEUShort();
			if (from == 65535) {
				from = -1;
			}

			Class166_Sub6.method15081();
			for (int i_112_ = from; i_112_ <= to; i_112_++) {
				long l = i_112_ + ((long) target << 32);
				Class480_Sub16 class480_sub16 = (Class480_Sub16) Client.aClass667_10846.get(l);
				Class480_Sub16 class480_sub16_113_;

				if (null == class480_sub16) {
					if (i_112_ == -1) {
						class480_sub16_113_ = new Class480_Sub16(setting,
								Widget.lookup(target).aClass480_Sub16_2462.anInt10101 * 1945403175);
					} else {
						class480_sub16_113_ = new Class480_Sub16(setting, -1);
					}
				} else {
					class480_sub16_113_ = new Class480_Sub16(setting, 1945403175 * class480_sub16.anInt10101);
					class480_sub16.unlink();
				}

				Client.aClass667_10846.put(l, class480_sub16_113_);
			}

			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4441) {
			int id = buffer.readLEUShortA();
			int i_115_ = buffer.readUByteS();
			PlayerVariableProvider.instance.collection.method9308(VariableBitsDefinition.loader.get(id), i_115_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4292 == context.currentFrame) {
			int i_116_ = buffer.readUByte();
			int i_117_ = buffer.readSmart32();

			if (null != Client.aClass473Array10624[i_116_]) {
				Client.aClass473Array10624[i_116_].method8061(Client.aClass460_10760.method7687());
				Client.aClass473Array10624[i_116_] = null;
			}

			if (i_117_ != -1) {
				Client.aClass473Array10624[i_116_] = new Class473(Class60.activeToolkit, buffer, i_117_);
			}
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4330) {
			int i_118_ = buffer.readMEInt();
			Class166_Sub6.method15081();
			Class480_Sub41 class480_sub41 = (Class480_Sub41) Client.aClass667_10791.get(i_118_);

			if (class480_sub41 != null) {
				Class480_Sub41.method9830(class480_sub41, true, false);
			}

			if (null != Client.aClass226_10793) {
				Widget.redraw(Client.aClass226_10793);
				Client.aClass226_10793 = null;
			}

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4370 == context.currentFrame) {
			int i_119_ = buffer.readUByte();
			int i_120_ = i_119_ >> 5;
			int i_121_ = i_119_ & 0x1f;

			if (0 == i_121_) {
				Client.aClass75Array10623[i_120_] = null;
				context.currentFrame = null;
				return true;
			}

			Class75 class75 = new Class75();
			class75.anInt1123 = i_121_ * 1250564713;
			class75.anInt1116 = buffer.readUByte() * 238093003;

			if (class75.anInt1116 * -1698639133 >= 0 && class75.anInt1116 * -1698639133 < Sprite.headicons.length) {
				if (1 == class75.anInt1123 * -335735335 || -335735335 * class75.anInt1123 == 10) {
					class75.anInt1117 = buffer.readUShort() * -233186087;
					class75.anInt1120 = buffer.readUShort() * 1000230755;
					buffer.offset += 737601220;
				} else if (class75.anInt1123 * -335735335 >= 2 && class75.anInt1123 * -335735335 <= 6) {
					if (2 == class75.anInt1123 * -335735335) {
						class75.anInt1119 = -1851201280;
						class75.anInt1122 = -1561694976;
					} else if (-335735335 * class75.anInt1123 == 3) {
						class75.anInt1119 = 0;
						class75.anInt1122 = -1561694976;
					} else if (4 == -335735335 * class75.anInt1123) {
						class75.anInt1119 = 592564736;
						class75.anInt1122 = -1561694976;
					} else if (5 == -335735335 * class75.anInt1123) {
						class75.anInt1119 = -1851201280;
						class75.anInt1122 = 0;
					} else if (6 == -335735335 * class75.anInt1123) {
						class75.anInt1119 = -1851201280;
						class75.anInt1122 = 1171577344;
					}

					class75.anInt1123 = -1793837870;
					class75.anInt1118 = buffer.readUByte() * -406200473;
					Class553 class553 = Client.aClass460_10760.method7679();
					class75.anInt1119 += (buffer.readUShort() - 2051316501 * class553.x << 9) * -1315854103;
					class75.anInt1122 += (buffer.readUShort() - class553.z * -180305283 << 9) * 1705175661;
					class75.anInt1124 = (buffer.readUByte() << 2) * 1873633851;
					class75.anInt1121 = buffer.readUShort() * -658166427;
				}

				class75.anInt1115 = buffer.readInt() * 1173898881;
				Client.aClass75Array10623[i_120_] = class75;
			}

			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.LOGOUT_FULLY) {
			Class495_Sub1.logout(false);
			context.currentFrame = null;
			return false;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4347) {
			String string = buffer.readString();
			int i_122_ = buffer.readUShort();
			Class166_Sub6.method15081();
			PulseEvent.setStringVarp(i_122_, string);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SPAWN_PRIVATE_GROUND_ITEM) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.SPAWN_PRIVATE_GROUND_ITEM);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4328) {
			Client.anInt10840 = Client.anInt10823 * -1202483205;
			Class195 class195 = new Class195(buffer, Client.anInterface22_10652);
			class195.method3852(ItemDefinition.aClass192_8339);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4357) {
			int i_123_ = buffer.readUByte();
			int i_124_ = buffer.readUByteS();
			if (i_123_ == 255) {
				i_123_ = -1;
				i_124_ = -1;
			}

			PulseEvent.method6906(i_123_, i_124_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4404 == context.currentFrame) {
			int i_125_ = buffer.readUShortA();
			int i_126_ = buffer.readUByteA();
			int i_127_ = i_126_ >> 2;
			int i_128_ = i_126_ & 0x3;
			int i_129_ = buffer.readIMEInt();
			Class553 class553 = new Class553(buffer.readInt());
			int i_130_ = buffer.readLEInt();
			int i_131_ = buffer.readLEInt();
			int i_132_ = buffer.readLEInt();
			int i_133_ = buffer.readLEInt();
			int i_134_ = buffer.readUByteS();
			int i_135_ = buffer.readLEInt();
			Class166_Sub6.method15081();

			Class480_Sub41.method4800(i_133_, new Class480_Sub41_Sub2(i_125_, i_134_, new Class628(class553, i_127_,
					i_128_, i_130_)), new int[] { i_129_, i_132_, i_131_, i_135_ }, false);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4296) {
			int i_136_ = buffer.readUShort();
			int i_137_ = buffer.readUByte();
			boolean bool = (i_137_ & 0x1) == 1;

			while (-165875887 * buffer.offset < context.currentFrameSize * -842560185) {
				int i_138_ = buffer.readUSmart();
				int i_139_ = buffer.readUShort();
				int i_140_ = 0;

				if (i_139_ != 0) {
					i_140_ = buffer.readUByte();
					if (255 == i_140_) {
						i_140_ = buffer.readInt();
					}
				}

				NanoTimer.method683(i_136_, i_138_, i_139_ - 1, i_140_, bool);
			}

			Client.anIntArray10601[(Client.anInt10824 += 1460041323) * -860256701 - 1 & 0x3f] = i_136_;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.SPAWN_FIRED_PROJECTILE == context.currentFrame) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.SPAWN_FIRED_PROJECTILE);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4448 == context.currentFrame) {
			int i_141_ = buffer.readLEUShort();
			String string = buffer.readString();
			Class166_Sub6.method15081();
			PulseEvent.setStringVarp(i_141_, string);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.EXECUTE_COMMAND) {
			String command = buffer.readString();
			Client.processConsoleCommand(command, false, false);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4412) {
			Client.anInt10836 = Client.anInt10823 * -727869597;
			boolean bool = buffer.readUByte() == 1;
			ClanChannelUpdater class284 = new ClanChannelUpdater(buffer);
			ClanSettings class288;

			if (bool) {
				class288 = JavaFont.aClass288_8793;
			} else {
				class288 = MobChatCutsceneAction.aClass288_9645;
			}

			class284.apply(class288);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4367) {
			String host = buffer.readString();
			int i_142_ = buffer.readUShort();
			Class177.aClass672_1992.host = host;
			Class177.aClass672_1992.id = -212349065 * i_142_;
			ConnectionInfo.method10388();
			Class467.aClass432_6478.setHost(Class177.aClass672_1992.host, Class177.aClass672_1992.getPort());
			ArchiveLoader.aClass402_4522.reset();
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4445 == context.currentFrame) {
			TurnMobCutsceneAction.aClass186_9434.method3603(buffer.readUShort());
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SEND_QUICKCHAT_MESSAGE) {
			boolean bool = buffer.readUByte() == 1;
			String string = buffer.readString();
			String username = string;
			if (bool) {
				username = buffer.readString();
			}
			String string_144_ = buffer.readString();
			long l = buffer.readUShort();
			long l_145_ = buffer.readUTriByte();
			Class351 class351 = CompressionType.findIdentifiable(Class351.values(), buffer.readUByte());
			int i_146_ = buffer.readUShort();
			long l_147_ = l_145_ + (l << 32);
			boolean invalid = false;

			while_45_: do {
				for (int i_149_ = 0; i_149_ < 100; i_149_++) {
					if (Client.aLongArray10666[i_149_] == l_147_) {
						invalid = true;
						break while_45_;
					}
				}

				if (class351.aBool3707 && IgnoredPlayer.isIgnored(username)) {
					invalid = true;
				}
			} while (false);

			if (!invalid) {
				Client.aLongArray10666[Client.anInt10866 * -373922325] = l_147_;
				Client.anInt10866 = 1828952771 * ((1 + -373922325 * Client.anInt10866) % 100);
				String message = ThemeMusicVolumeNormaliser.aClass10_2062.get(i_146_).decodeMessage(buffer);

				if (class351.crown * 1921955303 != -1) {
					JavaThreadResource.addChatMessage(20, 0, Class290_Sub1.crown(1921955303 * class351.crown) + string,
							Class290_Sub1.crown(class351.crown * 1921955303) + username, string, message, string_144_,
							i_146_, class351);
				} else {
					JavaThreadResource.addChatMessage(20, 0, string, username, string, message, string_144_, i_146_,
							class351);
				}
			}

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4329 == context.currentFrame) {
			if (Client.supportsFullScreen && null != Client.fullScreenFrame) {
				Class254.method4740(Class199.preferences.screenSize.getValue(), -1, -1, false);
			}

			byte[] bytes = new byte[context.currentFrameSize * -842560185 - 1];
			boolean bool = buffer.readUByte() == 1;
			buffer.readEncrypted(bytes, 0, -842560185 * context.currentFrameSize - 1);
			Buffer decrypted = new Buffer(bytes);
			String url = decrypted.readString();

			if (bool) {
				String backup = decrypted.readString();
				if (backup.length() == 0) {
					backup = url;
				}

				if (!Client.aBool10589 || Class189.osName.startsWith("mac")
						|| !Client.openUrl(url, 1, Class380.aClass380_4218.method6221())) {
					TranslatableString.openJsUrl(backup, true, Client.useJs);
				}
			} else {
				TranslatableString.openJsUrl(url, true, Client.useJs);
			}

			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SET_WIDGET_ANIMATION) {
			int animation = buffer.readMEInt();
			int widget = buffer.readMEInt();
			Class166_Sub6.method15081();
			PulseEvent.setWidgetAnimation(widget, animation);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.ANIMATE_OBJECT_REGION_UPDATE == context.currentFrame) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.ANIMATE_OBJECT);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4371 == context.currentFrame) {
			int i_154_ = buffer.readUShortA();
			if (65535 == i_154_) {
				i_154_ = -1;
			}

			TurnMobCutsceneAction.aClass186_9434.method3685(i_154_, 255);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4459) {
			int i_155_ = buffer.readUByteS();
			int i_156_ = buffer.readShort();
			int i_157_ = buffer.readByteA();
			int i_158_ = buffer.readUByte();
			int i_159_ = buffer.readUShortA();
			int i_160_ = buffer.readNegatedUByte();
			if (i_160_ == 255) {
				i_160_ = -1;
			}

			int i_161_ = buffer.readUShortA();
			int i_162_ = buffer.readByte();
			int i_163_ = buffer.readLEUShort();
			int i_164_ = buffer.readShortA();
			int i_165_ = buffer.readLEUShortA();
			int i_166_ = buffer.readUShort();
			int i_167_ = buffer.readUByteS() * 4;
			int i_168_ = buffer.readUShort();
			boolean bool = (i_155_ & 0x1) != 0;
			boolean bool_169_ = 0 != (i_155_ & 0x2);
			int i_170_ = bool_169_ ? i_155_ >> 2 : -1;

			if (bool_169_) {
				i_158_ = (byte) i_158_;
			} else {
				i_158_ *= 4;
			}

			Class553 class553 = Client.aClass460_10760.method7679();
			int i_171_ = i_163_ - -192334294 * class553.x;
			int i_172_ = i_166_ - class553.z * -360610566;
			i_162_ += i_171_;
			i_157_ += i_172_;

			if (i_171_ >= 0 && i_172_ >= 0 && i_171_ < Client.aClass460_10760.method7680() * 2
					&& i_172_ < Client.aClass460_10760.method7680() * 2 && i_162_ >= 0 && i_157_ >= 0
					&& i_162_ < Client.aClass460_10760.method7707() * 2
					&& i_157_ < Client.aClass460_10760.method7707() * 2 && i_168_ != 65535) {
				i_171_ *= 256;
				i_172_ *= 256;
				i_162_ = 256 * i_162_;
				i_157_ *= 256;
				i_158_ <<= 2;
				i_167_ <<= 2;
				i_159_ <<= 2;

				Projectile.create(i_168_, i_164_, i_156_, i_170_, i_158_, i_167_, i_171_, i_172_, i_162_, i_157_,
						i_161_, i_165_, i_160_, i_159_, bool, 0);
			}

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4449 == context.currentFrame) {
			int i_173_ = buffer.readIMEInt();
			int i_174_ = buffer.readIMEInt();
			Class166_Sub6.method15081();
			PulseEvent.method13201(i_173_, i_174_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4442) {
			int i_175_ = buffer.readUByte();
			Class640 class640 = CompressionType.findIdentifiable(Class640.values(), i_175_);
			if (class640 == null) {
				class640 = Class640.aClass640_8143;
			}

			QuestDefinitionLoader.method16831(class640);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4416 == context.currentFrame) {
			Class489.aClass655_6685 = Class655.valueOf(buffer.readUByte());
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.SET_LOCAL_REGION == context.currentFrame) {
			Class185.localRegionX = (buffer.readByte() << 3) * -32265385;
			Class164.localRegionZ = (buffer.readByte() << 3) * 211413053;
			BaseVarpDefinitionLoader.anInt1129 = buffer.readUByteS() * -1776605585;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.ITEM_ON_WIDGET) {
			int widget = buffer.readLEInt();
			int amount = buffer.readInt();
			int id = buffer.readUShort();
			if (65535 == id) {
				id = -1;
			}

			Class166_Sub6.method15081();
			PulseEvent.setWidgetItem(widget, id, amount);
			ItemDefinition definition = ItemDefinition.loader.get(id);
			PulseEvent.method1713(widget, 1763387363 * definition.modelPitch, definition.modelRoll * -706143343,
					777862773 * definition.modelScale);
			PulseEvent.method15089(widget, 805773215 * definition.modelTranslateX, -1113093815
					* definition.modelTranslateY, 1309401375 * definition.modelYaw);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4422 == context.currentFrame) {
			boolean bool = buffer.readUByteA() == 1;
			Class166_Sub6.method15081();
			TextureMetrics.aBool1729 = bool;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SET_CAMERA_VIEW) {
			int i_179_ = buffer.readUByteS();
			int viewY = buffer.readUShort() << 2;
			int viewX = buffer.readUByteS();
			int i_182_ = buffer.readNegatedUByte();
			int viewZ = buffer.readUByteA();
			Class166_Sub6.method15081();
			Class148.method3177(viewX, viewZ, viewY, i_182_, i_179_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4326) {
			int i_184_ = buffer.readInt();
			int i_185_ = buffer.readLEUShort();
			Class166_Sub6.method15081();
			PulseEvent.setIntVarp(i_185_, i_184_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4311) {
			LinkableObject.aClass126_10169 = null;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.UPDATE_APPEARANCE) {
			byte gender = buffer.readByte();
			Client.localPlayer.decodeAppearance(buffer, gender);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.NOP == context.currentFrame) {
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SEND_FRIENDS_LIST) {
			while (-165875887 * buffer.offset < context.currentFrameSize * -842560185) {
				boolean bool = buffer.readUByte() == 1;
				String name = buffer.readString();
				String string_187_ = buffer.readString();
				int world = buffer.readUShort();
				int i_189_ = buffer.readUByte();
				int i_190_ = buffer.readUByte();
				boolean bool_191_ = (i_190_ & 0x2) != 0;
				boolean bool_192_ = (i_190_ & 0x1) != 0;
				String string_193_ = "";
				int i_194_ = -1;
				int i_195_ = 0;

				if (world > 0) {
					string_193_ = buffer.readString();
					i_194_ = buffer.readUByte();
					i_195_ = buffer.readInt();
				}

				String string_196_ = buffer.readString();
				for (int index = 0; index < Client.friendCount * -1763746795; index++) {
					BefriendedPlayer friend = Client.friends[index];
					if (!bool) {
						if (name.equals(friend.name)) {
							if (world != -1900962431 * friend.world) {
								boolean existing = true;
								for (FriendLoginUpdate update = (FriendLoginUpdate) Client.friendLogins.head(); null != update; update = (FriendLoginUpdate) Client.friendLogins
										.next()) {
									if (update.name.equals(name)) {
										if (world != 0 && 0 == update.world) {
											update.unlink();
											existing = false;
										} else if (world == 0 && update.world != 0) {
											update.unlink();
											existing = false;
										}
									}
								}

								if (existing) {
									Client.friendLogins.offer(new FriendLoginUpdate(name, world));
								}

								friend.world = 1154785921 * world;
							}

							friend.aString566 = string_187_;
							friend.aString568 = string_193_;
							friend.anInt565 = 911292547 * i_189_;
							friend.anInt574 = 1591185109 * i_194_;
							friend.aBool570 = bool_191_;
							friend.aBool569 = bool_192_;
							friend.aString573 = string_196_;
							friend.anInt572 = -706517921 * i_195_;
							name = null;
							break;
						}
					} else if (string_187_.equals(friend.name)) {
						friend.name = name;
						friend.aString566 = string_187_;
						name = null;
						break;
					}
				}

				if (null != name && -1763746795 * Client.friendCount < 400) {
					BefriendedPlayer friend = new BefriendedPlayer();
					Client.friends[Client.friendCount * -1763746795] = friend;
					friend.name = name;
					friend.aString566 = string_187_;
					friend.world = world * 1154785921;
					friend.aString568 = string_193_;
					friend.anInt565 = 911292547 * i_189_;
					friend.anInt574 = 1591185109 * i_194_;
					friend.aBool570 = bool_191_;
					friend.aBool569 = bool_192_;
					friend.aString573 = string_196_;
					friend.anInt572 = -706517921 * i_195_;
					Client.friendCount += -32795843;
				}
			}
			Client.anInt10892 = -949242350;
			Client.anInt10834 = Client.anInt10823 * 822603117;
			boolean bool = false;
			int i_199_ = -1763746795 * Client.friendCount;
			do {
				if (i_199_ <= 0) {
					break;
				}
				bool = true;
				i_199_--;
				for (int index = 0; index < i_199_; index++) {
					boolean bool_201_ = false;
					BefriendedPlayer class47 = Client.friends[index];
					BefriendedPlayer class47_202_ = Client.friends[1 + index];
					if (-1900962431 * class47.world != -1113605561 * Class671.activeConnectionInfo.id
							&& Class671.activeConnectionInfo.id * -1113605561 == -1900962431 * class47_202_.world) {
						bool_201_ = true;
					}
					if (!bool_201_ && 0 == -1900962431 * class47.world && 0 != class47_202_.world * -1900962431) {
						bool_201_ = true;
					}
					if (!bool_201_ && !class47.aBool570 && class47_202_.aBool570) {
						bool_201_ = true;
					}
					if (!bool_201_ && !class47.aBool569 && class47_202_.aBool569) {
						bool_201_ = true;
					}
					if (bool_201_) {
						BefriendedPlayer friend = Client.friends[index];
						Client.friends[index] = Client.friends[index + 1];
						Client.friends[index + 1] = friend;
						bool = false;
					}
				}
			} while (!bool);

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.SEND_IGNORE_LIST == context.currentFrame) {
			while (buffer.offset * -165875887 < context.currentFrameSize * -842560185) {
				int i_204_ = buffer.readUByte();
				boolean bool = (i_204_ & 0x1) == 1;
				String string = buffer.readString();
				String string_205_ = buffer.readString();
				String string_206_ = buffer.readString();

				for (int index = 0; index < Client.ignoredPlayerCount * -1127325433; index++) {
					IgnoredPlayer ignored = Client.ignoredPlayers[index];

					if (bool) {
						if (string_205_.equals(ignored.name)) {
							ignored.name = string;
							ignored.aString668 = string_205_;
							string = null;
							break;
						}
					} else if (string.equals(ignored.name)) {
						ignored.name = string;
						ignored.aString668 = string_205_;
						ignored.aString665 = string_206_;
						string = null;
						break;
					}
				}

				if (string != null && Client.ignoredPlayerCount * -1127325433 < 400) {
					IgnoredPlayer ignored = new IgnoredPlayer();
					Client.ignoredPlayers[-1127325433 * Client.ignoredPlayerCount] = ignored;
					ignored.name = string;
					ignored.aString668 = string_205_;
					ignored.aString665 = string_206_;
					ignored.aBool667 = 2 == (i_204_ & 0x2);
					Client.ignoredPlayerCount += 682441911;
				}
			}

			Client.anInt10834 = 822603117 * Client.anInt10823;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4345) {
			int i_208_ = buffer.readMEInt();
			int i_209_ = buffer.readMEInt();
			Class166_Sub6.method15081();
			Class480_Sub41 class480_sub41 = (Class480_Sub41) Client.aClass667_10791.get(i_208_);
			Class480_Sub41 class480_sub41_210_ = (Class480_Sub41) Client.aClass667_10791.get(i_209_);

			if (null != class480_sub41_210_) {
				Class480_Sub41
						.method9830(
								class480_sub41_210_,
								class480_sub41 == null
										|| 1021060255 * class480_sub41.anInt10372 != 1021060255 * class480_sub41_210_.anInt10372,
								false);
			}

			if (class480_sub41 != null) {
				class480_sub41.unlink();
				Client.aClass667_10791.put(i_209_, class480_sub41);
			}

			Widget class226 = Widget.lookup(i_208_);
			if (null != class226) {
				Widget.redraw(class226);
			}

			class226 = Widget.lookup(i_209_);
			if (class226 != null) {
				Widget.redraw(class226);
				Class548.method9327(Class598.loadedInterfaces[class226.id * 1857819631 >>> 16], class226, true);
			}

			if (Client.anInt10790 * 1764783361 != -1) {
				Widget.method15440(1764783361 * Client.anInt10790, 1);
			}

			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SERVER_CHAT_MESSAGE) {
			boolean bool = buffer.readUByte() == 1;
			long l = buffer.readUShort();
			long l_211_ = buffer.readUTriByte();
			long l_212_ = (l << 32) + l_211_;
			boolean bool_213_ = false;

			Class480_Sub33 class480_sub33 = bool ? Class417.aClass480_Sub33_4650 : Class486.aClass480_Sub33_6643;
			if (null == class480_sub33) {
				bool_213_ = true;
			} else {
				for (int index = 0; index < 100; index++) {
					if (l_212_ == Client.aLongArray10666[index]) {
						bool_213_ = true;
						break;
					}
				}
			}

			if (!bool_213_) {
				Client.aLongArray10666[-373922325 * Client.anInt10866] = l_212_;
				Client.anInt10866 = 1828952771 * ((1 + -373922325 * Client.anInt10866) % 100);
				String message = ParticleTriangle.decodeString(buffer);
				int type = bool ? 43 : 46;
				JavaThreadResource.addChatMessage(type, 0, "", "", "", message, class480_sub33.aString10231, -1, null);
			}

			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4323) {
			int i_216_ = buffer.readLEInt();
			int i_217_ = buffer.readUShort();
			int i_218_ = buffer.readUShortA();
			if (i_218_ == 65535) {
				i_218_ = -1;
			}
			int i_219_ = buffer.readUShortA();
			if (65535 == i_219_) {
				i_219_ = -1;
			}
			Class166_Sub6.method15081();
			for (int i_220_ = i_218_; i_220_ <= i_219_; i_220_++) {
				long l = i_220_ + ((long) i_216_ << 32);
				Class480_Sub16 class480_sub16 = (Class480_Sub16) Client.aClass667_10846.get(l);
				Class480_Sub16 class480_sub16_221_;
				if (class480_sub16 == null) {
					if (-1 == i_220_) {
						class480_sub16_221_ = new Class480_Sub16(Widget.lookup(i_216_).aClass480_Sub16_2462.anInt10100
								* -528482985, i_217_);
					} else {
						class480_sub16_221_ = new Class480_Sub16(0, i_217_);
					}
				} else {
					class480_sub16_221_ = new Class480_Sub16(class480_sub16.anInt10100 * -528482985, i_217_);
					class480_sub16.unlink();
				}
				Client.aClass667_10846.put(l, class480_sub16_221_);
			}
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4317) {
			if (LinkableObject.aClass126_10169 == null) {
				LinkableObject.aClass126_10169 = new HashedVariableCollection(Class501.aClass77_Sub1_Sub1_6903);
			}

			DefaultMapEntry class383 = Class501.aClass77_Sub1_Sub1_6903.method13918(buffer);
			LinkableObject.aClass126_10169.map.put(class383.key * 1960527763, class383.value);
			Client.anIntArray10868[(Client.anInt10832 += -982557199) * 1633678097 - 1 & 0x3f] = 1960527763 * class383.key;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4382 == context.currentFrame) {
			int i_222_ = buffer.readUShort();
			String host = buffer.readString();
			boolean bool = buffer.readUByte() == 1;
			Class671.aClass672_8457 = Class671.activeConnectionInfo;
			Client.aBool4247 = bool;
			Class606.method10251(i_222_, host);
			Class536.setGameState(14);
			context.currentFrame = null;
			return false;
		}
		if (IncomingFrameMeta.aClass386_4437 == context.currentFrame) {
			int i_223_ = buffer.readUShortA();
			if (65535 == i_223_) {
				i_223_ = -1;
			}
			int i_224_ = buffer.readNegatedUByte();
			TurnMobCutsceneAction.aClass186_9434.method3621(i_223_, i_224_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SET_PLAYER_MESSAGE) {
			int index = buffer.readUShort();
			Player player;
			if (-406165969 * Client.localPlayerIndex == index) {
				player = Client.localPlayer;
			} else {
				player = Client.players[index];
			}

			if (null == player) {
				context.currentFrame = null;
				return true;
			}

			int meta = buffer.readUShort();
			Class351 class351 = CompressionType.findIdentifiable(Class351.values(), buffer.readUByte());
			boolean bool = (meta & 0x8000) != 0;

			if (player.accountName != null && player.appearance != null) {
				boolean bool_227_ = false;
				if (class351.aBool3707) {
					if (!bool && (Client.aBool10765 && !Client.aBool10766 || Client.aBool10769)) {
						bool_227_ = true;
					} else if (IgnoredPlayer.isIgnored(player.accountName)) {
						bool_227_ = true;
					}
				}

				if (!bool_227_) {
					int i_228_ = -1;
					String text;
					if (bool) {
						meta &= 0x7fff;
						Class357 class357 = Class357.decode(buffer);
						i_228_ = class357.id * -973678773;
						text = class357.message.decodeMessage(buffer);
					} else {
						text = Class577.escapeHtml(ParticleTriangle.decodeString(buffer));
					}

					player.setMessage(text.trim(), meta >> 8, meta & 0xff);
					int i_229_;
					if (class351.aBool3706) {
						i_229_ = bool ? 17 : 1;
					} else {
						i_229_ = bool ? 17 : 2;
					}

					if (-1 != 1921955303 * class351.crown) {
						JavaThreadResource.addChatMessage(i_229_, 0, Class290_Sub1.crown(class351.crown * 1921955303)
								+ player.formattedName(true),
								Class290_Sub1.crown(1921955303 * class351.crown) + player.getName(false),
								player.displayName, text, null, i_228_, class351);
					} else {
						JavaThreadResource.addChatMessage(i_229_, 0, player.formattedName(true), player.getName(false),
								player.displayName, text, null, i_228_, class351);
					}
				}
			}

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4450 == context.currentFrame) {
			int i_230_ = buffer.readUShort();
			TurnMobCutsceneAction.aClass186_9434.method3652(i_230_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4415 == context.currentFrame) {
			int widget = buffer.readInt();
			int i_232_ = buffer.readLEUShort();
			int i_233_ = buffer.readNegatedUByte();
			int i_234_ = buffer.readLEInt();
			int i_235_ = buffer.readMEInt();
			int i_236_ = buffer.readUShortA();
			int i_237_ = buffer.readLEInt();
			int i_238_ = buffer.readIMEInt();
			Class166_Sub6.method15081();

			Class480_Sub41.method4800(widget, new Class480_Sub41_Sub4(i_232_, i_233_, i_236_), new int[] { i_237_,
					i_238_, i_234_, i_235_ }, false);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4336 == context.currentFrame) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.aClass358_3824);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.PLAY_GRAPHIC) {
			int position = buffer.readLEInt();
			int heightOffset = buffer.readLEUShort();
			int i_241_ = buffer.readNegatedUByte();
			int graphicId = buffer.readLEUShort();
			if (65535 == graphicId) {
				graphicId = -1;
			}
			int i_243_ = buffer.readUShort();
			int i_244_ = buffer.readUByteA();
			int i_245_ = i_241_ & 0x7;
			int i_246_ = i_241_ >> 3 & 0xf;
			if (15 == i_246_) {
				i_246_ = -1;
			}

			boolean bool = (i_241_ >> 7 & 0x1) == 1;
			if (0 != position >> 30) {
				Class553 class553 = Client.aClass460_10760.method7679();
				int plane = position >> 28 & 0x3;
				int x = (position >> 14 & 0x3fff) - class553.x * 2051316501;
				int z = (position & 0x3fff) - class553.z * -180305283;

				if (x >= 0 && z >= 0 && x < Client.aClass460_10760.method7680()
						&& z < Client.aClass460_10760.method7707()) {
					if (-1 == graphicId) {
						CacheableAnimatedObject cached = Client.animatedObjects.get(x << 16 | z);
						if (null != cached) {
							cached.animated.method18224();
							cached.unlink();
						}
					} else {
						int worldX = 256 + 512 * x;
						int worldZ = z * 512 + 256;
						int collisionPlane = plane;
						if (collisionPlane < 3 && Client.aClass460_10760.method7775().isBridge(x, z)) {
							collisionPlane++;
						}

						AnimatedObject animated = new AnimatedObject(Client.aClass460_10760.method7687(), graphicId,
								i_243_, plane, collisionPlane, worldX, Class279.getAverageHeight(worldX, worldZ, plane)
										- heightOffset, worldZ, x, x, z, z, i_245_, bool, 0);
						Client.animatedObjects.put(x << 16 | z, new CacheableAnimatedObject(animated));
					}
				}
			} else if (0 != position >> 29) {
				int index = position & 0xffff;
				LinkableObject linkable = Client.npcs.get(index);
				if (null != linkable) {
					Npc npc = (Npc) linkable.object;
					Class468 class468 = npc.aClass468Array11520[i_244_];
					if (graphicId == 65535) {
						graphicId = -1;
					}

					boolean replace = true;
					int currentGraphic = class468.graphic * -2008549027;

					if (-1 != graphicId && currentGraphic != -1) {
						if (graphicId == currentGraphic) {
							GraphicDefinition graphic = GraphicDefinition.loader.get(graphicId);

							if (graphic.aBool7986 && -1 != 2053507375 * graphic.animation) {
								AnimationDefinition animation = AnimationDefinition.loader
										.get(graphic.animation * 2053507375);
								int replayMode = -1719904053 * animation.replayMode;

								if (replayMode == 0 || 2 == replayMode) {
									replace = false;
								} else if (1 == replayMode) {
									replace = true;
								}
							}
						} else {
							GraphicDefinition replacement = GraphicDefinition.loader.get(graphicId);
							GraphicDefinition current = GraphicDefinition.loader.get(currentGraphic);
							if (2053507375 * replacement.animation != -1 && 2053507375 * current.animation != -1) {
								AnimationDefinition replacementAnimation = AnimationDefinition.loader
										.get(2053507375 * replacement.animation);
								AnimationDefinition currentAnimation = AnimationDefinition.loader
										.get(current.animation * 2053507375);
								if (739199743 * replacementAnimation.priority < 739199743 * currentAnimation.priority) {
									replace = false;
								}
							}
						}
					}

					if (replace) {
						class468.graphic = graphicId * -738188555;
						class468.anInt6482 = heightOffset * 272663415;
						class468.anInt6481 = -508611417 * i_246_;

						if (-1 != graphicId) {
							GraphicDefinition graphic = GraphicDefinition.loader.get(graphicId);
							int i_259_ = graphic.aBool7986 ? 0 : 2;
							if (bool) {
								i_259_ = 1;
							}

							class468.aClass650_6484.method13453(graphic.animation * 2053507375, i_243_, i_259_, false);
						} else {
							class468.aClass650_6484.update(-1);
						}
					}
				}
			} else if (0 != position >> 28) {
				int index = position & 0xffff;
				Player player;
				if (index == Client.localPlayerIndex * -406165969) {
					player = Client.localPlayer;
				} else {
					player = Client.players[index];
				}

				if (player != null) {
					Class468 class468 = player.aClass468Array11520[i_244_];
					if (65535 == graphicId) {
						graphicId = -1;
					}

					boolean replace = true;
					int currentGraphic = -2008549027 * class468.graphic;
					if (graphicId != -1 && -1 != currentGraphic) {
						if (currentGraphic == graphicId) {
							GraphicDefinition graphic = GraphicDefinition.loader.get(graphicId);

							if (graphic.aBool7986 && 2053507375 * graphic.animation != -1) {
								AnimationDefinition animation = AnimationDefinition.loader
										.get(2053507375 * graphic.animation);
								int replayMode = animation.replayMode * -1719904053;

								if (0 == replayMode || replayMode == 2) {
									replace = false;
								} else if (replayMode == 1) {
									replace = true;
								}
							}
						} else {
							GraphicDefinition graphic = GraphicDefinition.loader.get(graphicId);
							GraphicDefinition current = GraphicDefinition.loader.get(currentGraphic);

							if (-1 != graphic.animation * 2053507375 && -1 != 2053507375 * current.animation) {
								AnimationDefinition animation = AnimationDefinition.loader
										.get(2053507375 * graphic.animation);
								AnimationDefinition currentAnimation = AnimationDefinition.loader
										.get(2053507375 * current.animation);

								if (739199743 * animation.priority < currentAnimation.priority * 739199743) {
									replace = false;
								}
							}
						}
					}

					if (replace) {
						class468.graphic = -738188555 * graphicId;
						class468.anInt6482 = heightOffset * 272663415;
						class468.anInt6481 = i_246_ * -508611417;
						class468.anInt6483 = 925563113 * i_245_;

						if (-1 != graphicId) {
							GraphicDefinition graphic = GraphicDefinition.loader.get(graphicId);
							int i_266_ = graphic.aBool7986 ? 0 : 2;
							if (bool) {
								i_266_ = 1;
							}

							class468.aClass650_6484.method13453(graphic.animation * 2053507375, i_243_, i_266_, false);
						} else {
							class468.aClass650_6484.update(-1);
						}
					}
				}
			}

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.ADD_FRIENDS_CHATTER == context.currentFrame) {
			Client.anInt10835 = Client.anInt10823 * -1392634703;
			if (0 == -842560185 * context.currentFrameSize) {
				Client.aString10890 = null;
				Client.aString10673 = null;
				Client.friendChatSize = 0;
				Class551.friendsChat = null;
				context.currentFrame = null;
				return true;
			}

			Client.aString10673 = buffer.readString();
			boolean bool = buffer.readUByte() == 1;
			if (bool) {
				buffer.readString();
			}

			Client.aString10890 = buffer.readString();
			HitsplatDefinitionLoader.aByte10553 = buffer.readByte();
			int size = buffer.readUByte();
			if (255 == size) {
				context.currentFrame = null;
				return true;
			}

			Client.friendChatSize = size * -1867137787;
			FriendsChatPlayer[] players = new FriendsChatPlayer[100];
			for (int index = 0; index < Client.friendChatSize * 46303181; index++) {
				players[index] = new FriendsChatPlayer();
				players[index].aString1017 = buffer.readString();
				boolean changed = buffer.readUByte() == 1;

				if (changed) {
					players[index].accountName = buffer.readString();
				} else {
					players[index].accountName = players[index].aString1017;
				}

				players[index].displayName = Interface.filterName(players[index].accountName, Class189.aClass25_2060);
				players[index].world = buffer.readUShort() * -2133705647;
				players[index].rank = buffer.readByte();
				players[index].aString1022 = buffer.readString();

				if (players[index].accountName.equals(Client.localPlayer.accountName)) {
					Class419.localFcRank = players[index].rank;
				}
			}

			boolean ordered = false;
			int count = Client.friendChatSize * 46303181;
			do {
				if (count <= 0) {
					break;
				}

				ordered = true;
				count--;

				for (int index = 0; index < count; index++) {
					if (players[index].displayName.compareTo(players[index + 1].displayName) > 0) {
						FriendsChatPlayer player = players[index];
						players[index] = players[index + 1];
						players[1 + index] = player;
						ordered = false;
					}
				}
			} while (!ordered);

			Class551.friendsChat = players;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SET_WIDGET_HIDDEN) {
			int hidden = buffer.readUByte();
			int widget = buffer.readLEInt();
			Class166_Sub6.method15081();
			PulseEvent.setWidgetHidden(widget, hidden);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4413 == context.currentFrame) {
			int i_274_ = buffer.readUByte();
			Class637 class637 = CompressionType.findIdentifiable(Class637.values(), i_274_);
			if (null == class637) {
				class637 = Class637.aClass637_8129;
			}

			Class378.method6213(class637);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.OPEN_URL == context.currentFrame) {
			if (Client.supportsFullScreen && Client.fullScreenFrame != null) {
				Class254.method4740(Class199.preferences.screenSize.getValue(), -1, -1, false);
			}

			byte[] bytes = new byte[-842560185 * context.currentFrameSize];
			buffer.readEncrypted(bytes, 0, context.currentFrameSize * -842560185);
			String url = Buffer.decodeString(bytes, 0, context.currentFrameSize * -842560185);
			TranslatableString.openJsUrl(url, true, Client.useJs);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4343 == context.currentFrame) {
			int position = buffer.readMEInt();
			Class166_Sub6.method15081();

			if (position == -1) {
				Class156.anInt1886 = -1672889529;
				TurnMobCutsceneAction.anInt9433 = -1490979241;
			} else {
				Class553 class553 = Client.aClass460_10760.method7679();
				int x = position >> 14 & 0x3fff;
				int z = position & 0x3fff;
				x -= 2051316501 * class553.x;
				if (x < 0) {
					x = 0;
				} else if (x >= Client.aClass460_10760.method7680()) {
					x = Client.aClass460_10760.method7680();
				}
				z -= class553.z * -180305283;
				if (z < 0) {
					z = 0;
				} else if (z >= Client.aClass460_10760.method7707()) {
					z = Client.aClass460_10760.method7707();
				}
				Class156.anInt1886 = 1672889529 * (256 + (x << 9));
				TurnMobCutsceneAction.anInt9433 = (256 + (z << 9)) * 1490979241;
			}
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4409 == context.currentFrame) {
			PlayerVariableProvider.instance.collection.reset();
			Client.anInt10898 += 1374627392;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4351) {
			if (Class456.lobbyState(Client.gameState * -1501875989)) {
				Client.anInt10622 = (int) (buffer.readUShort() * 2.5F) * -461596629;
			} else {
				Client.anInt10622 = buffer.readUShort() * -962996982;
			}
			Client.anInt10839 = Client.anInt10823 * 443759197;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SET_UID) {
			buffer.offset += 868241244;
			if (buffer.matchingCrcs()) {
				Class378.saveUid(buffer, buffer.offset * -165875887 - 28);
			}
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4306 == context.currentFrame) {
			Class166_Sub6.method15081();
			Class637.method13160(FloatRaster.method1728());
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4365) {
			int i_278_ = buffer.readUShort();
			TurnMobCutsceneAction.aClass186_9434.method3594(i_278_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4316) {
			int i_279_ = buffer.readUShort();
			int i_280_ = buffer.readUByteA();
			boolean bool = (i_280_ & 0x1) == 1;
			ClanChannelUpdater.method5279(i_279_, bool, 467076911);
			Client.anIntArray10601[(Client.anInt10824 += 1460041323) * -860256701 - 1 & 0x3f] = i_279_;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4310) {
			int i_281_ = buffer.readUShort();
			TurnMobCutsceneAction.aClass186_9434.method3655(i_281_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4318 == context.currentFrame) {
			int i_282_ = buffer.readInt();
			int i_283_ = buffer.readNegatedUByte();
			int i_284_ = buffer.readUByte();
			int i_285_ = buffer.readNegatedUByte();
			int i_286_ = buffer.readLEInt();
			int i_287_ = i_286_ >> 28;
			int i_288_ = i_286_ >> 14 & 0x3fff;
			int i_289_ = i_286_ & 0x3fff;
			TurnMobCutsceneAction.aClass186_9434.method3618(i_282_, i_283_, true, i_287_, i_288_ << 9, i_289_ << 9,
					i_284_ << 9, i_285_ << 9);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4342) {
			int i_290_ = buffer.readUShort();
			int i_291_ = buffer.readLEInt();
			int i_292_ = buffer.readLEUShortA();
			int i_293_ = buffer.readNegatedUByte();
			Class166_Sub6.method15081();
			PulseEvent.method3762(i_291_, i_293_, i_290_, i_292_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4460 == context.currentFrame) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.SET_GROUND_ITEM_AMOUNT);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.SET_WIDGET_TEXT == context.currentFrame) {
			String text = buffer.readString();
			int widget = buffer.readLEInt();
			Class166_Sub6.method15081();
			PulseEvent.setWidgetText(widget, text);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4424) {
			ParticleTriangle.aString7753 = -842560185 * context.currentFrameSize > 2 ? buffer.readString()
					: TranslatableString.WALK_HERE.translate(Client.currentLanguage);
			Client.anInt10775 = (context.currentFrameSize * -842560185 > 0 ? buffer.readUShort() : -1) * -735641993;
			if (65535 == Client.anInt10775 * 675691335) {
				Client.anInt10775 = 735641993;
			}
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.CONSTRUCTED_MAP_AREA) {
			FrameBuffer copy = new FrameBuffer(context.currentFrameSize * -842560185);
			System.arraycopy(context.buffer.payload, -165875887 * context.buffer.offset, copy.payload, 0,
					context.currentFrameSize * -842560185);
			Class255.method4748();
			if (Class199.preferences.aClass632_Sub33_10293.getValue() == 1) {
				Class237.aClass461_2622.method7825(new Class452(Class458.CONSTRUCTED, copy));
			} else {
				Client.aClass460_10760.method7706(new Class452(Class458.CONSTRUCTED, copy));
			}
			context.currentFrame = null;
			return false;
		}
		if (IncomingFrameMeta.aClass386_4395 == context.currentFrame) {
			int i_296_ = buffer.readLEUShortA();
			if (65535 == i_296_) {
				i_296_ = -1;
			}

			int i_297_ = buffer.readNegatedUByte();
			String action = buffer.readString();
			int slot = buffer.readUByteS();
			if (slot >= 1 && slot <= 8) {
				if (action.equalsIgnoreCase("null")) {
					action = null;
				}

				Client.playerOptions[slot - 1] = action;
				Client.playerOptionCursors[slot - 1] = i_296_;
				Client.playerOptionReducedPriority[slot - 1] = i_297_ == 0;
			}

			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4464 == context.currentFrame) {
			int i_299_ = buffer.readUShort();
			int i_300_ = buffer.readUShort();
			int i_301_ = buffer.readUShort();
			TurnMobCutsceneAction.aClass186_9434.method3720(i_299_, i_300_, i_301_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4447 == context.currentFrame) {
			int i_302_ = buffer.readUShort();
			if (65535 == i_302_) {
				i_302_ = -1;
			}
			int i_303_ = buffer.readUByte();
			int i_304_ = buffer.readUShort();
			int i_305_ = buffer.readUByte();
			int i_306_ = buffer.readUShort();
			int i_307_ = buffer.readUShort();

			Class456 class456 = TurnMobCutsceneAction.aClass186_9434.method3609(Class171.aClass171_1947,
					TurnMobCutsceneAction.aClass186_9434, i_302_, i_303_, i_305_, Class156.aClass156_1876.method3293(),
					Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_306_, false);
			if (class456 != null) {
				TurnMobCutsceneAction.aClass186_9434.method3593(class456, i_307_, i_304_, 1515471737);
			}
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.GROUPED_REGION_UPDATE) {
			Class164.localRegionZ = (buffer.readByte() << 3) * 211413053;
			Class185.localRegionX = (buffer.readNegatedByte(2030529681) << 3) * -32265385;
			BaseVarpDefinitionLoader.anInt1129 = buffer.readUByteS() * -1776605585;

			while (buffer.offset * -165875887 < context.currentFrameSize * -842560185) {
				RegionUpdateType update = RegionUpdateType.values()[buffer.readUByte()];
				HostNameIdentifier.decodeRegionUpdate(update);
			}

			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4307) {
			int i_308_ = buffer.readIMEInt();
			int i_309_ = buffer.readUShortA();
			int i_310_ = buffer.readLEUShortA();
			Client.aClass460_10760.method7687().method8461(i_310_, i_308_, i_309_, (byte) 52);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4443 == context.currentFrame) {
			context.currentFrame = null;
			return false;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4469) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.SPAWN_PROJECTILE);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4428) {
			int i_311_ = buffer.readIMEInt();
			boolean bool = buffer.readUByte() == 1;
			Class166_Sub6.method15081();
			PulseEvent.method8240(i_311_, bool, 1329309499);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4462 == context.currentFrame) {
			int i_312_ = buffer.readMEInt();
			if (i_312_ != Class277.anInt3125 * 679863921) {
				Class277.anInt3125 = -1722738031 * i_312_;
				ScriptExecutionContext.method6991(Class520.aClass520_7174, -1, -1);
			}
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4434 == context.currentFrame) {
			int i_313_ = buffer.readUByte();
			Class166_Sub6.method15081();
			Client.anInt10665 = 364630209 * i_313_;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4431 == context.currentFrame) {
			BaseVarpDefinitionLoader.anInt1129 = buffer.readUByte() * -1776605585;
			Class164.localRegionZ = (buffer.readByte() << 3) * 211413053;
			Class185.localRegionX = (buffer.readByteS() << 3) * -32265385;
			Class553 class553 = Client.aClass460_10760.method7679();

			for (ItemDeque deque = Client.groundItems.first(); deque != null; deque = Client.groundItems.next()) {
				int i_314_ = (int) (-4821875126325281949L * deque.linkedKey >> 28 & 0x3L);
				int x = (int) (deque.linkedKey * -4821875126325281949L & 0x3fffL);
				int localX = x - class553.x * 2051316501;
				int z = (int) (deque.linkedKey * -4821875126325281949L >> 14 & 0x3fffL);
				int localZ = z - -180305283 * class553.z;

				if (i_314_ == BaseVarpDefinitionLoader.anInt1129 * -1123616625
						&& localX >= Class185.localRegionX * 1507881063
						&& localX < 1507881063 * Class185.localRegionX + 8
						&& localZ >= 1606151957 * Class164.localRegionZ
						&& localZ < 8 + 1606151957 * Class164.localRegionZ) {
					deque.unlink();
					if (localX >= 0 && localZ >= 0 && localX < Client.aClass460_10760.method7680()
							&& localZ < Client.aClass460_10760.method7707()) {
						FloatRaster.method1727(-1123616625 * BaseVarpDefinitionLoader.anInt1129, localX, localZ);
					}
				}
			}
			for (Class480_Sub12 class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10068.head(); class480_sub12 != null; class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10068
					.next()) {
				if (1155137153 * class480_sub12.localX >= Class185.localRegionX * 1507881063
						&& 1155137153 * class480_sub12.localX < 8 + Class185.localRegionX * 1507881063
						&& class480_sub12.localZ * 51547319 >= 1606151957 * Class164.localRegionZ
						&& class480_sub12.localZ * 51547319 < 1606151957 * Class164.localRegionZ + 8
						&& -618261599 * class480_sub12.plane == -1123616625 * BaseVarpDefinitionLoader.anInt1129) {
					class480_sub12.aBool10063 = true;
				}
			}

			for (Class480_Sub12 class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10067.head(); class480_sub12 != null; class480_sub12 = (Class480_Sub12) Class480_Sub12.aClass644_10067
					.next()) {
				if (1155137153 * class480_sub12.localX >= 1507881063 * Class185.localRegionX
						&& class480_sub12.localX * 1155137153 < 1507881063 * Class185.localRegionX + 8
						&& class480_sub12.localZ * 51547319 >= 1606151957 * Class164.localRegionZ
						&& 51547319 * class480_sub12.localZ < 1606151957 * Class164.localRegionZ + 8
						&& -1123616625 * BaseVarpDefinitionLoader.anInt1129 == -618261599 * class480_sub12.plane) {
					class480_sub12.aBool10063 = true;
				}
			}

			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4335) {
			String string = buffer.readString();
			long l = buffer.readUShort();
			long l_319_ = buffer.readUTriByte();
			Class351 class351 = CompressionType.findIdentifiable(Class351.values(), buffer.readUByte());
			boolean bool = buffer.readUByte() == 1;
			long l_320_ = (l << 32) + l_319_;
			boolean bool_321_ = false;

			while_46_: do {
				if (null == ItemDefinition.aClass192_8339) {
					bool_321_ = true;
				} else {
					for (int i_322_ = 0; i_322_ < 100; i_322_++) {
						if (Client.aLongArray10666[i_322_] == l_320_) {
							bool_321_ = true;
							break while_46_;
						}
					}
					if (class351.aBool3707) {
						if (Client.aBool10765 && !Client.aBool10766 || Client.aBool10769) {
							bool_321_ = true;
						} else if (IgnoredPlayer.isIgnored(string)) {
							bool_321_ = true;
						}
					}
				}
			} while (false);
			if (!bool_321_) {
				Client.aLongArray10666[-373922325 * Client.anInt10866] = l_320_;
				Client.anInt10866 = (1 + -373922325 * Client.anInt10866) % 100 * 1828952771;
				String string_323_ = Class577.escapeHtml(ParticleTriangle.decodeString(buffer));
				int i_324_ = bool ? 22 : 24;
				if (class351.crown * 1921955303 != -1) {
					JavaThreadResource.addChatMessage(i_324_, 0,
							new StringBuilder().append(Class290_Sub1.crown(1921955303 * class351.crown)).append(string)
									.toString(),
							new StringBuilder().append(Class290_Sub1.crown(1921955303 * class351.crown)).append(string)
									.toString(), string, string_323_, ItemDefinition.aClass192_8339.method3811(), -1,
							class351);
				} else {
					JavaThreadResource.addChatMessage(i_324_, 0, string, string, string, string_323_,
							ItemDefinition.aClass192_8339.method3811(), -1, class351);
				}
			}
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4457 == context.currentFrame) {
			String string = buffer.readString();
			Class369.method6108(string);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4314) {
			boolean bool = buffer.readUByte() == 1;
			byte[] is = new byte[-842560185 * context.currentFrameSize - 1];
			buffer.readBytes(is, 0, context.currentFrameSize * -842560185 - 1);
			Class80.method1678(bool, is);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4433) {
			int i_325_ = buffer.readUByte();
			if (buffer.readUByte() == 0) {
				Client.aClass448Array10869[i_325_] = new Class448();
			} else {
				buffer.offset -= 1258142129;
				Client.aClass448Array10869[i_325_] = new Class448(buffer, null);
			}
			Client.anInt10838 = 168230821 * Client.anInt10823;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4321 == context.currentFrame) {
			String string = buffer.readString();
			String string_326_ = Class577.escapeHtml(ParticleTriangle.decodeString(buffer));
			Class176.addChatMessage(6, 0, string, string, string, string_326_, null);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4339 == context.currentFrame) {
			int i_327_ = buffer.readUShort();
			if (65535 == i_327_) {
				i_327_ = -1;
			}

			int i_328_ = buffer.readUByte();
			int i_329_ = buffer.readUShort();
			int i_330_ = buffer.readUByte();

			TurnMobCutsceneAction.aClass186_9434.method3710(Class171.aClass171_1947, i_327_, i_328_, i_330_,
					Class156.aClass156_1877.method3293(), Class167.aClass167_1926, 0.0F, 0.0F, null, 0, 256, i_329_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4398) {
			Class655.method13548(false);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4468) {
			boolean bool = buffer.readUByte() == 1;
			String string = buffer.readString();
			long l = buffer.readUShort();
			long l_331_ = buffer.readUTriByte();
			Class351 class351 = CompressionType.findIdentifiable(Class351.values(), buffer.readUByte());
			long l_332_ = (l << 32) + l_331_;
			boolean bool_333_ = false;
			Class480_Sub33 class480_sub33 = bool ? Class417.aClass480_Sub33_4650 : Class486.aClass480_Sub33_6643;
			while_47_: do {
				if (null == class480_sub33) {
					bool_333_ = true;
				} else {
					for (int i_334_ = 0; i_334_ < 100; i_334_++) {
						if (l_332_ == Client.aLongArray10666[i_334_]) {
							bool_333_ = true;
							break while_47_;
						}
					}
					if (class351.aBool3707) {
						if (Client.aBool10765 && !Client.aBool10766 || Client.aBool10769) {
							bool_333_ = true;
						} else if (IgnoredPlayer.isIgnored(string)) {
							bool_333_ = true;
						}
					}
				}
			} while (false);
			if (!bool_333_) {
				Client.aLongArray10666[Client.anInt10866 * -373922325] = l_332_;
				Client.anInt10866 = 1828952771 * ((1 + -373922325 * Client.anInt10866) % 100);
				String string_335_ = Class577.escapeHtml(ParticleTriangle.decodeString(buffer));
				int i_336_ = bool ? 41 : 44;
				if (1921955303 * class351.crown != -1) {
					JavaThreadResource.addChatMessage(i_336_, 0,
							new StringBuilder().append(Class290_Sub1.crown(class351.crown * 1921955303)).append(string)
									.toString(),
							new StringBuilder().append(Class290_Sub1.crown(1921955303 * class351.crown)).append(string)
									.toString(), string, string_335_, class480_sub33.aString10231, -1, class351);
				} else {
					JavaThreadResource.addChatMessage(i_336_, 0, string, string, string, string_335_,
							class480_sub33.aString10231, -1, class351);
				}
			}
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4369 == context.currentFrame) {
			int i_337_ = buffer.readUShort();
			int i_338_ = buffer.readUShort();
			TurnMobCutsceneAction.aClass186_9434.method3599(i_337_, i_338_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.REFLECTION_REQUEST == context.currentFrame) {
			ReflectionRequest.decode(buffer);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.SPAWN_PUBLIC_GROUND_ITEM == context.currentFrame) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.SPAWN_PUBLIC_GROUND_ITEM);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4373) {
			Client.anInt10863 = buffer.readUByte() * 1692699105;
			Client.publicChatMode = buffer.readUByte() * -834397995;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4454 == context.currentFrame) {
			int i_339_ = buffer.readInt();
			int i_340_ = buffer.readInt();
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4005, context.encryptor);
			frame.payload.writeByteA(Engine.anInt6488 * -1101491257);
			frame.payload.writeLEInt(i_339_);
			frame.payload.writeInt(i_340_);
			context.sendFrame(frame);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4303) {
			int id = buffer.readInt();
			int i_342_ = buffer.readInt();
			Class166_Sub6.method15081();
			Widget widget = Widget.lookup(id);
			widget.anInt2396 = i_342_ * 1115802887;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4402 == context.currentFrame) {
			boolean bool = buffer.readUByte() == 1;
			int i_343_ = buffer.readIMEInt();
			Class166_Sub6.method15081();
			PulseEvent.method18134(i_343_, bool);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4308 == context.currentFrame) {
			int i_344_ = buffer.readNegatedUByte();
			int i_345_ = buffer.readUByteA();
			int i_346_ = buffer.readUByte();
			int i_347_ = buffer.readLEUShortA() << 2;
			int i_348_ = buffer.readUByteS();
			Class166_Sub6.method15081();
			ResourceManager.method6709(i_346_, i_345_, i_347_, i_348_, i_344_, true);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4340) {
			Class166_Sub6.method15081();
			Class257.method4766();
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.SET_SCROLL_POSITION == context.currentFrame) {
			int widget = buffer.readIMEInt();
			int position = buffer.readLEUShort();
			Class166_Sub6.method15081();
			PulseEvent.setWidgetScrollPosition(widget, position);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4376) {
			Class63.anInt954 = buffer.readUByte() * -453105245;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SET_APPEARANCE) {
			byte gender = buffer.readByte();
			HashTableIterator.aClass600_Sub1_Sub3_Sub1_Sub1_8361.decodeAppearance(buffer, gender);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4302 == context.currentFrame) {
			Client.anInt10794 = buffer.readUByte() * 198896865;
			Client.anInt10839 = 443759197 * Client.anInt10823;
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4297) {
			int i_352_ = buffer.readInt();
			int i_353_ = buffer.readUShortA();
			int i_354_ = buffer.readLEUShortA();
			int i_355_ = buffer.readUShort();
			Class166_Sub6.method15081();
			PulseEvent.method1713(i_352_, i_353_, i_355_, i_354_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4349 == context.currentFrame) {
			int i_356_ = buffer.readUShort();
			int i_357_ = buffer.readMEInt();
			PlayerVariableProvider.instance.collection.updateVariableParameter(
					BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726.get(i_356_), i_357_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4418) {
			Class452.anInt5091 = buffer.readTriByte() * -280899085;
			Client.aBool10765 = buffer.readUByte() == 1;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4444 == context.currentFrame) {
			int i_358_ = buffer.readIMEInt();
			if (i_358_ != 1046345539 * Class122.anInt1470) {
				Class122.anInt1470 = i_358_ * -1756115605;
				ScriptExecutionContext.method6991(Class520.aClass520_7181, -1, -1);
			}
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4392 == context.currentFrame) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.aClass358_3822);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4436 == context.currentFrame) {
			boolean bool = buffer.readUByte() == 1;
			String string = buffer.readString();
			String string_359_ = string;
			if (bool) {
				string_359_ = buffer.readString();
			}
			String string_360_ = buffer.readString();
			long l = buffer.readUShort();
			long l_361_ = buffer.readUTriByte();
			Class351 class351 = CompressionType.findIdentifiable(Class351.values(), buffer.readUByte());
			long l_362_ = l_361_ + (l << 32);
			boolean bool_363_ = false;
			while_48_: do {
				for (int i_364_ = 0; i_364_ < 100; i_364_++) {
					if (l_362_ == Client.aLongArray10666[i_364_]) {
						bool_363_ = true;
						break while_48_;
					}
				}
				if (class351.aBool3707) {
					if (Client.aBool10765 && !Client.aBool10766 || Client.aBool10769) {
						bool_363_ = true;
					} else if (IgnoredPlayer.isIgnored(string_359_)) {
						bool_363_ = true;
					}
				}
			} while (false);
			if (!bool_363_) {
				Client.aLongArray10666[Client.anInt10866 * -373922325] = l_362_;
				Client.anInt10866 = 1828952771 * ((Client.anInt10866 * -373922325 + 1) % 100);
				String string_365_ = Class577.escapeHtml(ParticleTriangle.decodeString(buffer));
				if (1921955303 * class351.crown != -1) {
					JavaThreadResource.addChatMessage(
							9,
							0,
							new StringBuilder().append(Class290_Sub1.crown(class351.crown * 1921955303)).append(string)
									.toString(),
							new StringBuilder().append(Class290_Sub1.crown(class351.crown * 1921955303))
									.append(string_359_).toString(), string, string_365_, string_360_, -1, class351);
				} else {
					JavaThreadResource.addChatMessage(9, 0, string, string_359_, string, string_365_, string_360_, -1,
							class351);
				}
			}
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.RESET_MOB_ANIMATIONS) {
			for (int i_366_ = 0; i_366_ < Client.players.length; i_366_++) {
				if (Client.players[i_366_] != null) {
					Client.players[i_366_].anIntArray11538 = null;
					Client.players[i_366_].aClass650_11526.update(-1);
				}
			}
			for (int i_367_ = 0; i_367_ < -999337347 * Client.anInt10862; i_367_++) {
				((Mob) Client.aClass480_Sub25Array10654[i_367_].object).anIntArray11538 = null;
				((Mob) Client.aClass480_Sub25Array10654[i_367_].object).aClass650_11526.update(-1);
			}
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4300 == context.currentFrame) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.aClass358_3826);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4344) {
			Class553 class553 = new Class553(buffer.readIMEInt());
			int i_368_ = buffer.readLEInt();
			int i_369_ = buffer.readMEInt();
			int i_370_ = buffer.readLEInt();
			int i_371_ = buffer.readLEUShortA();
			int i_372_ = buffer.readLEUShort();
			int i_373_ = buffer.readLEInt();
			int i_374_ = buffer.readUByteS();
			int i_375_ = buffer.readInt();
			Class166_Sub6.method15081();
			Class480_Sub41.method4800(i_369_, new Class480_Sub41_Sub1(i_372_, i_374_, new Class606(class553, i_371_)),
					new int[] { i_373_, i_368_, i_375_, i_370_ }, false);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4383 == context.currentFrame) {
			Class628.method13099(buffer.readString());
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4410 == context.currentFrame) {
			int i_376_ = buffer.readLEUShortA();
			int i_377_ = buffer.readMEInt();
			int i_378_ = buffer.readLEInt();
			Class166_Sub6.method15081();
			PulseEvent.method502(i_378_, 3, i_376_, i_377_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4463 == context.currentFrame) {
			int i_379_ = buffer.readIMEInt();
			int i_380_ = buffer.readLEUShort();
			int i_381_ = buffer.readUShortA();
			int i_382_ = buffer.readUByteS();
			Class166_Sub6.method15081();
			PulseEvent.method13221(i_379_, i_382_, i_380_, i_381_);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4355) {
			int i_383_ = buffer.readLEInt();
			Class166_Sub6.method15081();
			PulseEvent.method502(i_383_, 5, -2, 0);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4363) {
			int i_384_ = buffer.readInt();
			Class166_Sub6.method15081();
			PulseEvent.method502(i_384_, 5, -406165969 * Client.localPlayerIndex, 0);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.SET_WIDGET_POSITION) {
			int x = buffer.readShortA();
			int widget = buffer.readIMEInt();
			int y = buffer.readLEShort();
			Class166_Sub6.method15081();
			PulseEvent.setWidgetPosition(widget, x, y);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4472 == context.currentFrame) {
			int i_388_ = buffer.readLEInt();
			int i_389_ = buffer.readIMEInt();
			Class166_Sub6.method15081();
			PulseEvent.method502(i_389_, 1, i_388_, -1);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4396 == context.currentFrame) {
			int i_390_ = buffer.readLEUShort();
			int i_391_ = buffer.readUShortA();
			int i_392_ = buffer.readMEInt();
			int i_393_ = buffer.readLEUShortA();
			Class166_Sub6.method15081();
			PulseEvent.method502(i_392_, 7, i_393_ << 16 | i_391_, i_390_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4295 == context.currentFrame) {
			int i_394_ = buffer.readLEInt();
			int i_395_ = buffer.readMEInt();
			Class166_Sub6.method15081();
			PulseEvent.method502(i_394_, 2, i_395_, -1);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4361) {
			String string = buffer.readString();
			boolean bool = buffer.readUByte() == 1;
			String accountName;

			if (bool) {
				accountName = buffer.readString();
			} else {
				accountName = string;
			}

			int world = buffer.readUShort();
			byte rank = buffer.readByte();
			boolean bool_399_ = false;

			if (-128 == rank) {
				bool_399_ = true;
			}

			if (bool_399_) {
				if (46303181 * Client.friendChatSize == 0) {
					context.currentFrame = null;
					return true;
				}

				int index;
				for (index = 0; index < Client.friendChatSize * 46303181
						&& (!Class551.friendsChat[index].accountName.equals(accountName) || world != -1188524879
								* Class551.friendsChat[index].world); index++) {

				}
				if (index < Client.friendChatSize * 46303181) {
					for (; index < Client.friendChatSize * 46303181 - 1; index++) {
						Class551.friendsChat[index] = Class551.friendsChat[1 + index];
					}

					Client.friendChatSize -= -1867137787;
					Class551.friendsChat[Client.friendChatSize * 46303181] = null;
				}
			} else {
				String string_402_ = buffer.readString();
				FriendsChatPlayer chatter = new FriendsChatPlayer();
				chatter.aString1017 = string;
				chatter.accountName = accountName;
				chatter.displayName = Interface.filterName(chatter.accountName, Class189.aClass25_2060);
				chatter.world = world * -2133705647;
				chatter.rank = rank;
				chatter.aString1022 = string_402_;
				int index;

				for (index = 46303181 * Client.friendChatSize - 1; index >= 0; index--) {
					int i_404_ = Class551.friendsChat[index].displayName.compareTo(chatter.displayName);
					if (0 == i_404_) {
						Class551.friendsChat[index].world = world * -2133705647;
						Class551.friendsChat[index].rank = rank;
						Class551.friendsChat[index].aString1022 = string_402_;
						if (accountName.equals(Client.localPlayer.accountName)) {
							Class419.localFcRank = rank;
						}

						Client.anInt10835 = Client.anInt10823 * -1392634703;
						context.currentFrame = null;
						return true;
					}

					if (i_404_ < 0) {
						break;
					}
				}

				if (Client.friendChatSize * 46303181 >= Class551.friendsChat.length) {
					context.currentFrame = null;
					return true;
				}

				for (int i_405_ = 46303181 * Client.friendChatSize - 1; i_405_ > index; i_405_--) {
					Class551.friendsChat[1 + i_405_] = Class551.friendsChat[i_405_];
				}

				if (46303181 * Client.friendChatSize == 0) {
					Class551.friendsChat = new FriendsChatPlayer[100];
				}

				Class551.friendsChat[1 + index] = chatter;
				Client.friendChatSize += -1867137787;

				if (accountName.equals(Client.localPlayer.accountName)) {
					Class419.localFcRank = rank;
				}
			}

			Client.anInt10835 = -1392634703 * Client.anInt10823;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4299 == context.currentFrame) {
			boolean bool = buffer.readUByte() == 1;
			String string = buffer.readString();
			String string_406_ = string;
			if (bool) {
				string_406_ = buffer.readString();
			}

			long l = buffer.readUShort();
			long l_407_ = buffer.readUTriByte();
			Class351 class351 = CompressionType.findIdentifiable(Class351.values(), buffer.readUByte());
			long l_408_ = l_407_ + (l << 32);
			boolean bool_409_ = false;
			while_49_: do {
				for (int i_410_ = 0; i_410_ < 100; i_410_++) {
					if (l_408_ == Client.aLongArray10666[i_410_]) {
						bool_409_ = true;
						break while_49_;
					}
				}
				if (class351.aBool3707) {
					if (Client.aBool10765 && !Client.aBool10766 || Client.aBool10769) {
						bool_409_ = true;
					} else if (IgnoredPlayer.isIgnored(string_406_)) {
						bool_409_ = true;
					}
				}
			} while (false);
			if (!bool_409_) {
				Client.aLongArray10666[-373922325 * Client.anInt10866] = l_408_;
				Client.anInt10866 = 1828952771 * ((1 + -373922325 * Client.anInt10866) % 100);
				String string_411_ = Class577.escapeHtml(ParticleTriangle.decodeString(buffer));
				int i_412_ = class351.aBool3706 ? 7 : 3;
				if (1921955303 * class351.crown != -1) {
					JavaThreadResource.addChatMessage(
							i_412_,
							0,
							new StringBuilder().append(Class290_Sub1.crown(1921955303 * class351.crown)).append(string)
									.toString(),
							new StringBuilder().append(Class290_Sub1.crown(1921955303 * class351.crown))
									.append(string_406_).toString(), string, string_411_, null, -1, class351);
				} else {
					JavaThreadResource.addChatMessage(i_412_, 0, string, string_406_, string, string_411_, null, -1,
							class351);
				}
			}
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4458) {
			int i_413_ = buffer.readIMEInt();
			int i_414_ = buffer.readMEInt();
			buffer.readNegatedUByte();
			int i_415_ = buffer.readLEInt();
			int i_416_ = buffer.readLEUShort();
			int i_417_ = buffer.readLEInt();
			Class166_Sub6.method15081();
			int[] is = { i_414_, i_415_, i_417_, i_413_ };
			Client.anInt10790 = i_416_ * 1598589697;
			ParticleProducer.method9684(i_416_, is);
			ShaderMetaBuffer.method4370(false);
			Widget.method5082(1764783361 * Client.anInt10790, is);
			for (int i_418_ = 0; i_418_ < 104; i_418_++) {
				Client.aBoolArray10850[i_418_] = true;
			}
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4304 == context.currentFrame) {
			Client.anInt10859 = buffer.readShort() * -1207622493;
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4338 == context.currentFrame) {
			TurnMobCutsceneAction.aClass186_9434.method3686(Class156.aClass156_1877.method3293());
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4372) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.aClass358_3823);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4393) {
			boolean bool = buffer.readUByte() == 1;
			String string = buffer.readString();
			String string_419_ = string;
			if (bool) {
				string_419_ = buffer.readString();
			}
			long l = buffer.readUShort();
			long l_420_ = buffer.readUTriByte();
			Class351 class351 = CompressionType.findIdentifiable(Class351.values(), buffer.readUByte());
			int i_421_ = buffer.readUShort();
			long l_422_ = l_420_ + (l << 32);
			boolean bool_423_ = false;
			while_50_: do {
				for (int i_424_ = 0; i_424_ < 100; i_424_++) {
					if (l_422_ == Client.aLongArray10666[i_424_]) {
						bool_423_ = true;
						break while_50_;
					}
				}
				if (class351.aBool3707 && IgnoredPlayer.isIgnored(string_419_)) {
					bool_423_ = true;
				}
			} while (false);
			if (!bool_423_) {
				Client.aLongArray10666[-373922325 * Client.anInt10866] = l_422_;
				Client.anInt10866 = 1828952771 * ((1 + Client.anInt10866 * -373922325) % 100);
				String string_425_ = ThemeMusicVolumeNormaliser.aClass10_2062.get(i_421_).decodeMessage(buffer);
				if (1921955303 * class351.crown != -1) {
					JavaThreadResource.addChatMessage(
							18,
							0,
							new StringBuilder().append(Class290_Sub1.crown(1921955303 * class351.crown)).append(string)
									.toString(),
							new StringBuilder().append(Class290_Sub1.crown(class351.crown * 1921955303))
									.append(string_419_).toString(), string, string_425_, null, i_421_, class351);
				} else {
					JavaThreadResource.addChatMessage(18, 0, string, string_419_, string, string_425_, null, i_421_,
							class351);
				}
			}
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4421) {
			int i_426_ = buffer.readNegatedUByte();
			int i_427_ = buffer.readShortA();
			int index = buffer.readUShort();
			int i_429_ = buffer.readIMEInt();
			LinkableObject<Npc> linkable = Client.npcs.get(index);
			if (null != linkable) {
				Npc npc = linkable.object;
				if (npc.aClass265_11793 == null) {
					npc.aClass265_11793 = new Class265(npc.definition);
				}

				npc.aClass265_11793.anIntArray2962[i_426_] = i_429_;
				npc.aClass265_11793.aShortArray2963[i_426_] = (short) i_427_;
			}

			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4358) {
			int i_430_ = buffer.readMEInt();
			int varbit = buffer.readUShortA();
			PlayerVariableProvider.instance.collection.method9308(VariableBitsDefinition.loader.get(varbit), i_430_);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4309 == context.currentFrame) {
			Class655.method13548(true);
			context.currentFrame = null;
			return true;
		}
		if (context.currentFrame == IncomingFrameMeta.aClass386_4298) {
			HostNameIdentifier.decodeRegionUpdate(RegionUpdateType.aClass358_3833);
			context.currentFrame = null;
			return true;
		}
		if (IncomingFrameMeta.aClass386_4406 == context.currentFrame) {
			int i_432_ = buffer.readUShort();
			if (65535 == i_432_) {
				i_432_ = -1;
			}
			int i_433_ = buffer.readUByte();
			int i_434_ = buffer.readUShort();
			int i_435_ = buffer.readUByte();
			int i_436_ = buffer.readUShort();

			TurnMobCutsceneAction.aClass186_9434.method3710(Class171.aClass171_1947, i_432_, i_433_, i_435_,
					Class156.aClass156_1876.method3293(), Class167.aClass167_1926, 0.0F, 0.0F, null, 0, i_436_, i_434_);
			context.currentFrame = null;
			return true;
		}

		HitsplatDefinitionProvider.reportError(
				new StringBuilder()
						.append(null != context.currentFrame ? context.currentFrame.opcode * -1401090315 : -1)
						.append(Class60.COMMA)
						.append(context.secondLastFrame != null ? -1401090315 * context.secondLastFrame.opcode : -1)
						.append(Class60.COMMA)
						.append(null != context.thirdLastFrame ? context.thirdLastFrame.opcode * -1401090315 : -1)
						.append(" ").append(context.currentFrameSize * -842560185).toString(), new RuntimeException());
		Class495_Sub1.logout(false);
		return true;
	}

}