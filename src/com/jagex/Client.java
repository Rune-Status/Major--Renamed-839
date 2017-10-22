package com.jagex;

import jaclib.ping.Ping;

import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.image.BufferedImage;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.io.StringReader;
import java.io.StringWriter;
import java.net.Socket;
import java.net.URL;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.TimeZone;

import javax.imageio.ImageIO;

public final class Client extends Engine {
	public static boolean aBool10589;
	public static boolean aBool10598;
	public static boolean aBool10599;
	public static boolean aBool10611;
	public static boolean aBool10625;
	public static boolean aBool10632;
	public static boolean aBool10678;
	public static boolean membersWorld;
	public static boolean aBool10765;
	public static boolean aBool10766;
	public static boolean aBool10769;
	public static boolean widgetSelected;
	public static boolean aBool10799;
	public static boolean useJs;
	public static volatile boolean aBool10827;
	public static boolean aBool10870;
	public static boolean aBool10896;
	public static boolean aBool10905;
	public static boolean[] aBoolArray10850;
	public static byte[] aByteArray10716;
	public static Widget aClass226_10793;
	public static Widget aClass226_10798;
	public static Widget aClass226_10801;
	public static Widget aClass226_10802;
	public static Class448[] aClass448Array10869;
	public static Class460 aClass460_10760;
	public static Class473[] aClass473Array10624;
	public static LinkableObject[] aClass480_Sub25Array10654;
	public static Class588 aClass588_10855;
	public static Deque aClass644_10843;
	public static EntityList aClass649_10779;
	public static HashTable aClass667_10791;
	public static Class75[] aClass75Array10623;
	public static Color[] aColorArray10633;
	public static Color[] aColorArray10641;
	public static Color[] aColorArray10845;
	public static float aFloat10708;
	public static float aFloat10787;
	public static float[] aFloatArray10736;
	public static HashTable<CacheableAnimatedObject> animatedObjects;
	public static int affiliateId;
	public static int anInt10593;
	public static int anInt10596;
	public static int anInt10597;
	public static int anInt10617;
	public static int anInt10620;
	public static int anInt10622;
	public static int updateStage;
	public static int anInt10674;
	public static int anInt10681;
	public static int anInt10682;
	public static int anInt10684;
	public static int anInt10685;
	public static int anInt10689;
	public static int anInt10690;
	public static int anInt10700;
	public static int anInt10706;
	public static int anInt10707;
	public static int anInt10714;
	public static final int anInt10718 = 2;
	public static int anInt10722;
	public static int anInt10723;
	public static int anInt10724;
	public static int anInt10725;
	public static int anInt10726;
	public static int anInt10727;
	public static int anInt10730;
	public static final int anInt10757 = 2048;
	public static int anInt10764;
	public static int anInt10774;
	public static int anInt10781;
	public static int anInt10783;
	public static int anInt10784;
	public static volatile int anInt10790;
	public static int anInt10794;
	public static int anInt10795;
	public static int anInt10813;
	public static int anInt10823;
	public static int maximumHeldKeys;
	public static int anInt10833;
	public static final int anInt10847 = 104;
	public static int anInt10859;
	public static int anInt10862;
	public static int anInt10863;
	public static int anInt10872;
	public static int anInt10874;
	public static int anInt10888;
	public static int anInt10889;
	public static int anInt10892;
	public static int anInt10912;
	public static int[] anIntArray10754;
	public static int[][][] anIntArrayArrayArray10720;
	public static Interface22 anInterface22_10652;
	public static FontProvider anInterface47_10645;
	public static Interface57 anInterface57_10904;
	public static KeyRecord[] anInterface59Array10637;
	public static KeyRecord[] anInterface59Array10640;
	public static Object anObject10668;
	public static Object anObject10671;
	public static short aShort10613;
	public static short aShort10626;
	public static short aShort10758;
	public static short aShort10878;
	public static short aShort10880;
	public static short aShort10881;
	public static short aShort10885;
	public static short aShort10902;
	public static String aString10609;
	public static String aString10634;
	public static String aString10673;
	public static String selectedWidgetAction;
	public static String aString10789;
	public static String aString10890;
	public static int cameraX;
	public static BufferedConnectionContext[] connectionContexts;
	public static int currentCutscene;
	public static Language currentLanguage;
	public static int cutsceneStage;
	public static int friendCount;
	public static BefriendedPlayer[] friends;
	public static GameContext game = null;
	public static BufferedConnectionContext gameConnection;
	public static int gameState;
	public static HashTable<ItemDeque> groundItems;
	public static int ignoredPlayerCount;
	public static IgnoredPlayer[] ignoredPlayers;
	public static boolean isMember;
	public static BufferedConnectionContext lobbyConnection;
	public static Player localPlayer;
	public static int localPlayerIndex;
	public static int localPrivilege;
	public static Deque<MouseRecord> mouseRecords;
	public static int npcCount;
	public static int[] npcIndices;
	public static HashTable<LinkableObject<Npc>> npcs;
	public static int[] OBJECT_GROUPS;
	public static Player[] players;
	public static Deque<CacheableProjectile> projectiles;
	public static int publicChatMode;
	public static Archive quickChat;
	public static boolean sentPreferences;
	public static int tick;
	protected static BufferedFile[] indexFiles;
	static boolean aBool10590;
	static boolean aBool10603;
	static boolean aBool10604;
	static boolean aBool10605;
	static boolean aBool10616;
	static boolean aBool10643;
	static boolean aBool10667;
	static boolean aBool10675;
	static boolean aBool10687;
	static boolean aBool10693;
	static boolean aBool10697;
	static boolean aBool10729;
	static boolean aBool10739;
	static boolean aBool10740;
	static boolean aBool10767;
	static boolean reduceAttackPriority;
	static boolean aBool10797;
	static boolean aBool10806;
	static boolean aBool10811;
	static boolean aBool10814;
	static boolean aBool10816;
	static boolean aBool10817;
	static boolean aBool10828;
	static boolean aBool10841;
	static boolean[] playerOptionReducedPriority;
	static boolean[] aBoolArray10851;
	static boolean[] aBoolArray10873;
	static ReferenceCache aClass168_10649;
	static ReferenceCache aClass168_10778;
	static ReferenceCache aClass168_10883;
	static Widget aClass226_10805;
	static MobProvider aClass28_10871;
	static Matrix4f aClass399_10752;
	static Class405 aClass405_10612;
	static Class405 aClass405_10715;
	static MobMessage[] aClass482Array10860;
	static Deque aClass644_10844;
	static Deque aClass644_10897;
	static EntityList aClass649_10734;
	static HashTable aClass667_10846;
	static float aFloat10710;
	static float aFloat10711;
	static long aLong10614;
	static long aLong10621;
	static long clientKey;
	static long aLong10651;
	static long aLong10788;
	static long[] aLongArray10666;
	static Map aMap10908;
	static final int anInt10588 = 63;
	static int anInt10595;
	static int anInt10602;
	static int anInt10607;
	static int anInt10615;
	static int anInt10627;
	static int anInt10628;
	static int anInt10631;
	static final int anInt10635 = 130;
	static final int anInt10638 = 75;
	static int anInt10639;
	static int anInt10642;
	static int previousNetErrors;
	static int anInt10655;
	static int anInt10657;
	static int netWorkerDelay;
	static int anInt10660;
	static int anInt10665;
	static final int anInt10669 = 1392508928;
	static final int anInt10670 = 4095;
	static int anInt10672;
	static int anInt10679;
	static int anInt10680;
	static final int anInt10683 = 5;
	static int anInt10688;
	static final int anInt10691 = 301989888;
	static int anInt10692;
	static int anInt10694;
	static int anInt10695;
	static int anInt10698;
	static int anInt10699;
	static int anInt10701;
	static int anInt10702;
	static int anInt10703;
	static final int anInt10704 = 400;
	static final int anInt10712 = 1375731712;
	static int anInt10717;
	static int anInt10728;
	static int anInt10731;
	static int anInt10732;
	static int anInt10733;
	static int anInt10737;
	static int anInt10738;
	static int anInt10741;
	static final int anInt10742 = 2;
	static final int anInt10743 = 0;
	static int anInt10745;
	static int anInt10753;
	static int anInt10755;
	static int anInt10756;
	static final int anInt10770 = 8;
	static int anInt10775;
	static int anInt10780;
	static int anInt10782;
	static final int anInt10786 = 1179648;
	static int anInt10792;
	static final int anInt10796 = 9568256;
	static int anInt10803;
	static int anInt10804;
	static int anInt10808;
	static int anInt10809;
	static int anInt10810;
	static int anInt10812;
	static int anInt10815;
	static int anInt10818;
	static final int anInt10819 = 64;
	static int anInt10824;
	static int anInt10826;
	static int anInt10830;
	static int anInt10832;
	static int anInt10834;
	static int anInt10835;
	static int anInt10836;
	static int anInt10837;
	static int anInt10838;
	static int anInt10839;
	static int anInt10840;
	static int anInt10842;
	static int anInt10848;
	static int anInt10849;
	static int anInt10853;
	static int anInt10856;
	static int anInt10857;
	static int anInt10864;
	static final int anInt10865 = 5439488;
	static int anInt10866;
	static int anInt10867;
	static final int anInt10879 = 1;
	static final int anInt10893 = 400;
	static int anInt10898;
	static int anInt10900;
	static int anInt10901;
	static int anInt10906;
	static int anInt10907;
	static final int anInt10911 = 5373952;
	static final int anInt10913 = 13762560;
	static int anInt10914;
	static final int anInt10915 = 65535;
	static final int anInt10916 = -1845493760;
	static final int anInt10917 = -771751936;
	static final int anInt10918 = 1245184;
	static final int anInt10919 = -2;
	static final int anInt10920 = 9633792;
	static final int anInt10921 = 13828096;
	static final int anInt10922 = 318767104;
	static final int anInt10923 = 100;
	static final int anInt10924 = -1828716544;
	static final int anInt10925 = -754974720;
	static int[] anIntArray10594;
	static int[] anIntArray10601;
	static int[] playerOptionCursors;
	static int[] anIntArray10629;
	static int[] anIntArray10630;
	static int[] anIntArray10636;
	static int[] anIntArray10653;
	static int[] anIntArray10659;
	static int[] anIntArray10696;
	static int[] anIntArray10709;
	static int[] anIntArray10713;
	static int[] anIntArray10721;
	static int[] anIntArray10746;
	static int[] anIntArray10747;
	static int[] anIntArray10748;
	static int[] anIntArray10749;
	static int[] anIntArray10750;
	static int[] anIntArray10751;
	static int[] anIntArray10821;
	static int[] anIntArray10825;
	static int[] anIntArray10854;
	static int[] anIntArray10858;
	static int[] anIntArray10861;
	static int[] anIntArray10868;
	static int[] anIntArray10875;
	static int[] anIntArray10876;
	static int[] anIntArray10877;
	static int[] anIntArray10926;
	static Random aRandom10887;
	static Rectangle[] aRectangleArray10852;
	static short[] PLAYER_OPTION_TYPES;
	static String additionalInfo;
	static String aString10608;
	static String proxyError;
	static String aString10759;
	static String settings;
	static String[] playerOptions;
	static Calendar calendar;
	static boolean displayFps;
	static EntityList friendLogins;
	static NativeLibraryProvider nativeProvider;
	static int removedNpcCount;
	static int[] removedNpcIndices;
	static boolean resizableScreen;

	static {
		anInt10607 = 118442437;
		gameState = 412606220;
		aClass399_10752 = new Matrix4f();
		aClass405_10612 = new Class405();
		aClass405_10715 = new Class405();
		aBool10616 = true;
		sentPreferences = true;
		aClass75Array10623 = new Class75[11];
		aClass473Array10624 = new Class473[10];
		aBool10687 = true;
		clientKey = (long) (Math.random() * 9.999999999E9) * 5346905513342728825L;
		mouseRecords = new Deque();
		anInterface59Array10637 = new KeyRecord[130];
		anInterface59Array10640 = new KeyRecord[75];
		aColorArray10641 = new Color[] { new Color(9179409), new Color(3289650), new Color(3289650), new Color(3289650) };
		aColorArray10845 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277),
				new Color(16726277) };
		aColorArray10633 = new Color[] { new Color(16777215), new Color(16777215), new Color(16741381),
				new Color(16741381) };
		aClass168_10883 = new ReferenceCache(8);
		aClass168_10649 = new ReferenceCache(8);
		anInterface47_10645 = new DecodingFontProvider();
		anInterface22_10652 = new Class26();
		npcs = new HashTable(64);
		aClass480_Sub25Array10654 = new LinkableObject[1024];
		npcIndices = new int[1024];
		anIntArray10659 = new int[262];
		removedNpcIndices = new int[1000];
		lobbyConnection = new BufferedConnectionContext();
		gameConnection = new BufferedConnectionContext();
		connectionContexts = new BufferedConnectionContext[] { gameConnection, lobbyConnection };
		aClass588_10855 = new Class588();
		aClass460_10760 = new Class460(false);
		anObject10671 = new Object();
		anObject10668 = new Object();
		anIntArray10754 = new int[64];
		OBJECT_GROUPS = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };
		currentCutscene = -1216225047;
		cutsceneStage = 676960953;
		anInt10627 = -2105868375;
		anInt10872 = 1914923795;
		anInt10700 = 1236480255;
		anInt10684 = 1096140743;
		anIntArray10713 = new int[4096];
		anIntArray10594 = new int[4096];
		anIntArray10696 = new int[] { -1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048 };
		anInt10792 = -533225010;
		anInt10695 = -988000958;
		anInt10812 = -269431671;
		anInt10755 = -587360778;
		anInt10702 = -1102431957;
		aRandom10887 = new Random();
		aFloat10708 = 1116.0F;
		anInt10714 = -480573596;
		anInt10912 = 749800755 * anInt10714 + 964854280;
		aBool10611 = true;
		anIntArrayArrayArray10720 = new int[2][][];
		anInt10620 = 1980304975;
		anInt10722 = -1338730263;
		anIntArray10721 = new int[509];
		anIntArray10636 = new int[500];
		aClass649_10734 = new EntityList();
		aFloatArray10736 = new float[3];
		anInt10745 = 1548277259;
		anIntArray10746 = new int[2];
		anIntArray10747 = new int[2];
		anIntArray10748 = new int[2];
		anIntArray10749 = new int[2];
		anIntArray10750 = new int[2];
		resizableScreen = true;
		anInt10753 = 750696864;
		anInt10602 = -254463824;
		anInt10682 = -1584907967;
		anInt10813 = 1518389475;
		players = new Player[2048];
		localPlayerIndex = 5857073;
		reduceAttackPriority = true;
		PLAYER_OPTION_TYPES = new short[] { 44, 45, 46, 47, 48, 49, 50, 51 };
		playerOptionCursors = new int[8];
		playerOptions = new String[8];
		playerOptionReducedPriority = new boolean[8];
		anInt10775 = 735641993;
		groundItems = new HashTable(64);
		projectiles = new Deque();
		animatedObjects = new HashTable(16);
		aClass649_10779 = new EntityList();
		anInt10781 = -897408463;
		anInt10782 = -2101032765;
		anInt10783 = 856791521;
		anInt10784 = -1137457249;
		anInt10756 = 615736905;
		anInt10867 = -1059838551;
		anInt10790 = -1598589697;
		aClass667_10791 = new HashTable(8);
		aBool10799 = true;
		anInt10849 = 494675543;
		anInt10808 = 1369522025;
		anInt10809 = -1033098523;
		anInt10810 = 1289185899;
		anInt10628 = -830330803;
		anInt10857 = 834172279;
		anInt10823 = -1878559865;
		anIntArray10821 = new int[64];
		anIntArray10601 = new int[64];
		anIntArray10825 = new int[64];
		anIntArray10751 = new int[64];
		anIntArray10630 = new int[64];
		anIntArray10868 = new int[64];
		aClass644_10843 = new Deque();
		aClass644_10844 = new Deque();
		aClass644_10897 = new Deque();
		aClass667_10846 = new HashTable(512);
		anInt10864 = 803827386;
		aBoolArray10850 = new boolean[104];
		aBoolArray10851 = new boolean[104];
		aRectangleArray10852 = new Rectangle[104];

		for (int i = 0; i < 104; i++) {
			aRectangleArray10852[i] = new Rectangle();
		}

		anIntArray10854 = new int[4];
		anInt10856 = -192399743;
		anIntArray10629 = new int[-1095244621 * anInt10856];
		anIntArray10858 = new int[anInt10856 * -1095244621];
		anIntArray10653 = new int[anInt10856 * -1095244621];
		aClass482Array10860 = new MobMessage[-1095244621 * anInt10856];
		anIntArray10861 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };
		aLongArray10666 = new long[100];
		aClass448Array10869 = new Class448[6];
		aClass28_10871 = new MobProvider();
		aBoolArray10873 = new boolean[5];
		anIntArray10709 = new int[5];
		anIntArray10875 = new int[5];
		anIntArray10876 = new int[5];
		anIntArray10877 = new int[5];
		aShort10613 = (short) 256;
		aShort10878 = (short) 205;
		aShort10880 = (short) 256;
		aShort10881 = (short) 320;
		aShort10626 = (short) 1;
		aShort10758 = (short) 32767;
		aShort10902 = (short) 1;
		aShort10885 = (short) 32767;
		friends = new BefriendedPlayer[400];
		friendLogins = new EntityList();
		ignoredPlayers = new IgnoredPlayer[400];
		anInt10900 = 678111995;
		anInt10901 = 599277255;
		calendar = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		anInterface57_10904 = new Class27();
		aLong10651 = -6177003193931669139L;
		aLong10621 = 299448494646313335L;
		aClass168_10778 = new ReferenceCache(8);
		aMap10908 = new HashMap();
		anIntArray10926 = new int[4];
	}

	public static final void addFriend(String username) {
		int maximum = isMember ? 400 : 200;
		if (null != username) {
			if (friendCount * -1763746795 >= maximum) {
				Class632_Sub11.addUnnamedMessage(4,
						isMember ? TranslatableString.FULL_MEMBERS_FRIEND_LIST.translate(currentLanguage)
								: TranslatableString.FULL_FREE_FRIEND_LIST.translate(currentLanguage));
			} else {
				String filtered = Interface.filterName(username, Class189.aClass25_2060);
				if (null != filtered) {
					for (int index = 0; index < -1763746795 * friendCount; index++) {
						BefriendedPlayer friend = friends[index];
						String filteredFriend = Interface.filterName(friend.name, Class189.aClass25_2060);

						if (null != filteredFriend && filteredFriend.equals(filtered)) {
							Class632_Sub11.addUnnamedMessage(4,
									username + TranslatableString.ALREADY_BEFRIENDED.translate(currentLanguage));
							return;
						}

						if (null != friend.aString566) {
							String string_4_ = Interface.filterName(friend.aString566, Class189.aClass25_2060);
							if (string_4_ != null && string_4_.equals(filtered)) {
								Class632_Sub11.addUnnamedMessage(4,
										username + TranslatableString.ALREADY_BEFRIENDED.translate(currentLanguage));
								return;
							}
						}
					}

					for (int index = 0; index < ignoredPlayerCount * -1127325433; index++) {
						IgnoredPlayer ignored = ignoredPlayers[index];
						String filteredName = Interface.filterName(ignored.name, Class189.aClass25_2060);
						if (filteredName != null && filteredName.equals(filtered)) {
							Class632_Sub11.addUnnamedMessage(4,
									TranslatableString.PLEASE_REMOVE_IGNORE.translate(currentLanguage) + username
											+ TranslatableString.FROM_IGNORE_LIST_FIRST.translate(currentLanguage));
							return;
						}

						if (ignored.aString668 != null) {
							String string_7_ = Interface.filterName(ignored.aString668, Class189.aClass25_2060);
							if (null != string_7_ && string_7_.equals(filtered)) {
								Class632_Sub11.addUnnamedMessage(4,
										TranslatableString.PLEASE_REMOVE_IGNORE.translate(currentLanguage) + username
												+ TranslatableString.FROM_IGNORE_LIST_FIRST.translate(currentLanguage));
								return;
							}
						}
					}

					if (Interface.filterName(localPlayer.accountName, Class189.aClass25_2060).equals(filtered)) {
						Class632_Sub11.addUnnamedMessage(4,
								TranslatableString.CANT_BEFRIEND_SELF.translate(currentLanguage));
					} else {
						BufferedConnectionContext connection = Client.getActiveConnection();
						OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.ADD_FRIEND, connection.encryptor);
						frame.payload.writeByte(Buffer.encodedStringLength(username));
						frame.payload.writeCString(username);
						connection.sendFrame(frame);
					}
				}
			}
		}
	}

	public static String formatLong(long value, int prefix, boolean delimit, Language language) {
		char prefixTerminator = ',';
		char delimiter = '.';
		if (language == Language.ENGLISH) {
			prefixTerminator = '.';
			delimiter = ',';
		}

		if (language == Language.FRENCH) {
			delimiter = '\u00a0';
		}

		boolean negative = false;
		if (value < 0L) {
			negative = true;
			value = -value;
		}

		StringBuilder builder = new StringBuilder(26);
		if (prefix > 0) {
			for (int index = 0; index < prefix; index++) {
				int i_4_ = (int) value;
				value /= 10L;
				builder.append((char) (48 + i_4_ - 10 * (int) value));
			}
			builder.append(prefixTerminator);
		}

		int index = 0;
		for (;;) {
			int i_6_ = (int) value;
			value /= 10L;
			builder.append((char) (48 + i_6_ - (int) value * 10));
			if (value == 0L) {
				break;
			}
			if (delimit && ++index % 3 == 0) {
				builder.append(delimiter);
			}
		}

		if (negative) {
			builder.append('-');
		}

		return builder.reverse().toString();
	}

	public static NativeLibraryProvider getNativeProvider() {
		if (nativeProvider == null) {
			throw new IllegalStateException("");
		}
		return nativeProvider;
	}

	public static boolean isFriend(String name) {
		if (name == null) {
			return false;
		}

		for (int index = 0; index < friendCount * -1763746795; index++) {
			if (name.equalsIgnoreCase(friends[index].name)) {
				return true;
			}
		}

		return name.equalsIgnoreCase(localPlayer.accountName);
	}

	public static void loadJaclib() throws NativeLibraryLoadException {
		getNativeProvider().load("jaclib");
	}

	public static final void method17015(Interface class221, Widget[] widgets, int i, int i_36_, int i_37_, int i_38_,
			int i_39_, int offsetX, int offsetY, int i_42_, int i_43_) {
		for (int index = 0; index < widgets.length; index++) {
			Widget widget = widgets[index];

			if (null != widget && i == widget.parent * 1920469085) {
				int x = offsetX + widget.positionX * -346651673;
				int y = offsetY + widget.positionY * -1901639223;
				int i_47_;
				int i_48_;
				int i_49_;
				int i_50_;

				if (1558474223 * widget.type == 2) {
					i_47_ = i_36_;
					i_48_ = i_37_;
					i_49_ = i_38_;
					i_50_ = i_39_;
				} else {
					int i_51_ = x + 688089097 * widget.width;
					int maxY = y + 1362321717 * widget.height;
					if (widget.type * 1558474223 == 9) {
						i_51_++;
						maxY++;
					}

					i_47_ = x > i_36_ ? x : i_36_;
					i_48_ = y > i_37_ ? y : i_37_;
					i_49_ = i_51_ < i_38_ ? i_51_ : i_38_;
					i_50_ = maxY < i_39_ ? maxY : i_39_;
				}

				if (widget.type * 1558474223 != 0 && !widget.aBool2483
						&& method17050(widget).anInt10100 * -528482985 == 0 && widget != aClass226_10802
						&& Widget.anInt2356 * -1563899471 != widget.contentType * 1584180271
						&& 1584180271 * widget.contentType != 1311947433 * Widget.anInt2411
						&& 1584180271 * widget.contentType != 1217733147 * Widget.anInt2354
						&& Widget.anInt2355 * -1388209991 != widget.contentType * 1584180271) {
					if (i_47_ < i_49_ && i_48_ < i_50_) {
						Widget.method2232(widget);
					}

				} else if (!method16857(widget)) {
					if (aClass226_10801 == widget && Class562.method9477(aClass226_10801, -1371918511)) {
						aBool10811 = true;
						anInt10628 = x * 830330803;
						anInt10857 = -834172279 * y;
					}

					if (widget.aBool2414 || i_47_ < i_49_ && i_48_ < i_50_) {
						if (widget.disableHover && i_42_ >= i_47_ && i_43_ >= i_48_ && i_42_ < i_49_ && i_43_ < i_50_) {
							for (ScriptContext context = (ScriptContext) aClass644_10843.head(); null != context; context = (ScriptContext) aClass644_10843
									.next()) {
								if (context.aBool10248) {
									context.unlink();
									context.source.aBool2544 = false;
								}
							}

							if (Display.anInt1818 * -1153541141 == 0) {
								aClass226_10801 = null;
								aClass226_10802 = null;
							}

							anInt10815 = 0;
							Class495_Sub1.aBool10320 = false;
							aBool10817 = false;

							if (!Class56.menuOpen) {
								FriendsChatPlayer.method1540();
							}
						}

						boolean bool = widget.aBool2417 && 5 == widget.type * 1558474223
								&& -5030949 * widget.anInt2406 == 0 && widget.anInt2533 * -2141876157 < 0
								&& -1 == 1391525437 * widget.item && !widget.aBool2475
								&& 0 == -1168337917 * widget.anInt2391;
						boolean bool_53_ = false;

						if (i_42_ >= i_47_ && i_43_ >= i_48_ && i_42_ < i_49_ && i_43_ < i_50_) {
							if (bool) {
								Class211 class211 = widget.method4298(Class60.activeToolkit);
								if (null == class211 || widget.width * 688089097 != 881990655 * class211.anInt2182
										|| class211.anInt2180 * 1644092335 != widget.height * 1362321717) {
									bool_53_ = true;
								} else {
									int i_54_ = i_42_ - x;
									int i_55_ = i_43_ - y;
									if (i_55_ >= 0 && i_55_ < class211.anIntArray2181.length) {
										int i_56_ = class211.anIntArray2181[i_55_];
										if (i_54_ >= i_56_ && i_54_ <= class211.anIntArray2179[i_55_] + i_56_) {
											bool_53_ = true;
										}
									}
								}
							} else {
								bool_53_ = true;
							}
						}

						if (!widgetSelected && bool_53_) {
							if (-1203862283 * widget.anInt2427 >= 0) {
								anInt10782 = -1695723167 * widget.anInt2427;
							} else if (widget.disableHover) {
								anInt10782 = -2101032765;
							}
						}

						if (!Class56.menuOpen && bool_53_ && !class221.aBool2278) {
							Class639.method13200(widget, i_42_ - x, i_43_ - y);
						}

						boolean bool_57_ = false;
						if (Client.recorder.leftButtonDown() && bool_53_) {
							bool_57_ = true;
						}

						boolean bool_58_ = false;
						MouseRecord record = mouseRecords.head();
						if (record != null && record.getClickType() == 0 && record.getX() >= i_47_
								&& record.getY() >= i_48_ && record.getX() < i_49_ && record.getY() < i_50_) {
							if (bool) {
								Class211 class211 = widget.method4298(Class60.activeToolkit);
								if (null == class211 || class211.anInt2182 * 881990655 != 688089097 * widget.width
										|| 1644092335 * class211.anInt2180 != widget.height * 1362321717) {
									bool_58_ = true;
								} else {
									int dx = record.getX() - x;
									int dy = record.getY() - y;

									if (dy >= 0 && dy < class211.anIntArray2181.length) {
										int i_61_ = class211.anIntArray2181[dy];

										if (dx >= i_61_ && dx <= class211.anIntArray2179[dy] + i_61_) {
											bool_58_ = true;
										}
									}
								}
							} else {
								bool_58_ = true;
							}
						}

						if (widget.aBool2414 && !Class53.method1157()) {
							for (int i_62_ = 0; i_62_ < widget.aByteArrayArray2549.length; i_62_++) {
								boolean bool_63_ = false;
								boolean bool_64_ = false;

								if (widget.anIntArray2380[i_62_] > 0) {
									for (int i_65_ = 0; i_65_ < 1019900971 * anInt10690; i_65_++) {
										if (widget.anIntArray2380[i_62_] == anInterface59Array10637[i_65_]
												.getCharacter()) {
											bool_63_ = true;

											if (widget.anIntArray2378 == null || widget.anIntArray2378[i_62_] <= tick) {
												bool_64_ = true;
											}
											break;
										}
									}
								}

								if (!bool_63_ && null != widget.aByteArrayArray2549[i_62_]) {
									for (int i_66_ = 0; i_66_ < widget.aByteArrayArray2549[i_62_].length; i_66_++) {
										if (Class193.keyRecorder.held(widget.aByteArrayArray2549[i_62_][i_66_])) {
											bool_63_ = true;
											if (null != widget.anIntArray2378 && widget.anIntArray2378[i_62_] > tick) {
												break;
											}

											byte i_67_ = widget.aByteArrayArray2467[i_62_][i_66_];
											if (0 == i_67_
													|| ((i_67_ & 0x8) == 0 || !Class193.keyRecorder.held(86)
															&& !Class193.keyRecorder.held(82)
															&& !Class193.keyRecorder.held(81))
													&& (0 == (i_67_ & 0x2) || Class193.keyRecorder.held(86))
													&& ((i_67_ & 0x1) == 0 || Class193.keyRecorder.held(82))
													&& ((i_67_ & 0x4) == 0 || Class193.keyRecorder.held(81))) {
												bool_64_ = true;
												break;
											}
										}
									}
								}

								if (bool_64_) {
									if (i_62_ < 10) {
										ConnectionInfo.method13843(1 + i_62_, widget.id * 1857819631, widget.component
												* -592186295, "");
									} else if (i_62_ == 10) {
										PlayerVariableProvider.method1560();
										Class480_Sub16 class480_sub16 = method17050(widget);
										Class57.method1361(widget, class480_sub16.method15633(),
												class480_sub16.anInt10101 * 1945403175);
										selectedWidgetAction = Class341.method5865(widget);
										if (null == selectedWidgetAction) {
											selectedWidgetAction = "Null";
										}

										aString10789 = new StringBuilder().append(widget.aString2473)
												.append(Item.getColourHtml(16777215)).toString();
									}

									int i_68_ = widget.anIntArray2466[i_62_];
									if (null == widget.anIntArray2378) {
										widget.anIntArray2378 = new int[widget.aByteArrayArray2549.length];
									}

									if (widget.anIntArray2488 == null) {
										widget.anIntArray2488 = new int[widget.aByteArrayArray2549.length];
									}

									if (0 != i_68_) {
										if (widget.anIntArray2378[i_62_] == 0) {
											widget.anIntArray2378[i_62_] = tick + i_68_ + widget.anIntArray2488[i_62_];
										} else {
											widget.anIntArray2378[i_62_] = i_68_ + tick;
										}
									} else {
										widget.anIntArray2378[i_62_] = 2147483647;
									}
								}

								if (!bool_63_ && null != widget.anIntArray2378) {
									widget.anIntArray2378[i_62_] = 0;
								}
							}
						}

						if (bool_58_) {
							Class62.method1384(widget, record.getX() - x, record.getY() - y);
						}

						if (null != aClass226_10801 && aClass226_10801 != widget && bool_53_) {
							if (widget.disableHover == true) {
								aClass226_10805 = null;
							}
							if (method17050(widget).method15635(-1981646508)) {
								aClass226_10805 = widget;
							}
						}

						if (aClass226_10802 == widget) {
							aBool10806 = true;
							anInt10849 = x * -494675543;
							anInt10808 = y * -1369522025;
							anInt10809 = 186021363 * aClass226_10802.width;
							anInt10810 = 1774415065 * aClass226_10802.height;
						}

						if (widget.aBool2483 || 0 != 1584180271 * widget.contentType) {
							if (bool_53_ && 0 != -199372903 * anInt10818 && null != widget.anObjectArray2452) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.aBool10248 = true;
								class480_sub35.source = widget;
								class480_sub35.mouseY = 1320920311 * anInt10818;
								class480_sub35.arguments = widget.anObjectArray2452;
								aClass644_10843.pushBack(class480_sub35);
							}

							if (null != aClass226_10801) {
								bool_58_ = false;
								bool_57_ = false;
							} else if (Class56.menuOpen
									|| 1655048567 * Widget.anInt2537 != 1584180271 * widget.contentType
									&& anInt10815 * -1296345277 > 0) {
								bool_58_ = false;
								bool_57_ = false;
								bool_53_ = false;
							}

							if (0 != 1584180271 * widget.contentType) {
								if (1584180271 * widget.contentType == 1217733147 * Widget.anInt2354
										|| widget.contentType * 1584180271 == Widget.anInt2355 * -1388209991) {
									aClass226_10798 = widget;
									Class569 class569 = aClass460_10760.method7690().method9707();
									if (class569.method9621() != null && !Class237.aClass461_2622.method7826()) {
										class569.method9621().method8265(Class60.activeToolkit,
												1362321717 * widget.height, Class199.preferences.skyboxes.getValue());
									}
									if (Widget.anInt2354 * 1217733147 == 1584180271 * widget.contentType) {
										if (!Class56.menuOpen && i_42_ >= i_47_ && i_43_ >= i_48_ && i_42_ < i_49_
												&& i_43_ < i_50_) {
											Class531.method9032(Class60.activeToolkit, i_42_, i_43_);
											for (Class477_Sub2 class477_sub2 = (Class477_Sub2) aClass649_10734.head(); class477_sub2 != null; class477_sub2 = (Class477_Sub2) aClass649_10734
													.next()) {
												if (i_42_ >= class477_sub2.anInt9979 * 1239871935
														&& i_42_ < 1897110611 * class477_sub2.anInt9976
														&& i_43_ >= 765735825 * class477_sub2.anInt9980
														&& i_43_ < 1628500109 * class477_sub2.anInt9978) {
													FriendsChatPlayer.method1540();
													Mob.method3172(class477_sub2.mob);
												}
											}
										} else {
											Toolkit.method2868(Class60.activeToolkit);
										}
									}

									int count = -1784886003 * Class80.playerCount;
									int[] indices = Class80.playerIndices;
									for (int playerIndex = 0; playerIndex < count; playerIndex++) {
										Player player = players[indices[playerIndex]];

										if (null != player) {
											Class253.method4724(Class520.aClass520_7184, -1, -1, player,
													indices[playerIndex]);
											player.method18018(i_47_, i_48_, i_49_, i_50_, x - -1909412215
													* widget.anInt2382, y - -1881455913 * widget.scrollPosition, i_42_,
													i_43_, -1963347079);
										}
									}

									for (int n = 0; n < 1746328619 * npcCount; n++) {
										int npcIndex = npcIndices[n];
										LinkableObject<Npc> linkable = npcs.get(npcIndex);
										if (null != linkable) {
											Class253.method4724(Class520.aClass520_7175,
													linkable.object.definition.anInt3015 * -181078013, -1,
													linkable.object, npcIndex);

											linkable.object.method18018(i_47_, i_48_, i_49_, i_50_, x
													- widget.anInt2382 * -1909412215, y - widget.scrollPosition
													* -1881455913, i_42_, i_43_, 1240789083);
										}
									}
									continue;
								}
								if (-1563899471 * Widget.anInt2356 == 1584180271 * widget.contentType) {
									int i_73_ = 0;
									int i_74_ = i_38_ - i_36_;
									int i_75_ = i_42_ - x;
									int i_76_ = i_43_ - y;
									if (widget.type * 1558474223 == 5) {
										Class211 class211 = widget.method4298(Class60.activeToolkit);
										if (null == class211) {
											continue;
										}
										if (i_42_ >= i_47_ && i_43_ >= i_48_ && i_42_ < i_49_ && i_43_ < i_50_) {
											i_73_ = class211.anIntArray2181[i_76_];
											i_74_ = class211.anIntArray2179[i_76_];
										}
									}
									if ((0 == Class63.anInt954 * 422203915 || 422203915 * Class63.anInt954 == 3)
											&& !Class56.menuOpen && i_42_ >= i_47_ && i_43_ >= i_48_ && i_42_ < i_49_
											&& i_43_ < i_50_ && i_75_ >= i_73_ && i_75_ <= i_73_ + i_74_) {
										i_75_ -= widget.width * 688089097 / 2;
										i_76_ -= 1362321717 * widget.height / 2;
										int i_77_;
										if (1212513917 * Connection.anInt7170 == 6) {
											i_77_ = (int) aFloat10787 & 0x3fff;
										} else if (3 == Connection.anInt7170 * 1212513917) {
											i_77_ = (int) (Class369.aClass261_Sub1_4079.method4843() * 2607.5945876176133);
										} else {
											i_77_ = (int) aFloat10787 + 1093165775 * anInt10699 & 0x3fff;
										}
										int i_78_ = Class373.SINE[i_77_];
										int i_79_ = Class373.COSINE[i_77_];
										if (6 != Connection.anInt7170 * 1212513917) {
											i_78_ = (256 + anInt10701 * -1894746741) * i_78_ >> 8;
											i_79_ = (256 + -1894746741 * anInt10701) * i_79_ >> 8;
										}
										int i_80_ = i_79_ * i_75_ + i_76_ * i_78_ >> 14;
										int i_81_ = i_79_ * i_76_ - i_75_ * i_78_ >> 14;
										int i_82_;
										int i_83_;
										if (1212513917 * Connection.anInt7170 == 6) {
											i_82_ = (i_80_ >> 2) + (1327138123 * anInt10706 >> 9);
											i_83_ = (anInt10707 * -2128941351 >> 9) - (i_81_ >> 2);
										} else {
											int i_84_ = (Client.localPlayer.boundSize() - 1) * 256;
											Class397 class397 = Client.localPlayer.method10164().aClass397_4507;
											i_82_ = ((int) class397.x - i_84_ >> 9) + (i_80_ >> 2);
											i_83_ = ((int) class397.z - i_84_ >> 9) - (i_81_ >> 2);
										}
										if (widgetSelected
												&& 0 != (Class577.selectedWidgetAttributes * -1564025309 & 0x40)) {
											Widget class226_85_ = Class185.method3584(Class490.anInt6751 * 1969702363,
													anInt10756 * -800680953);
											if (null != class226_85_) {
												MenuOption.add(selectedWidgetAction, new StringBuilder().append(" ")
														.append(Class60.aString677).toString(), Class166_Sub8.anInt9550
														* -29134223, 59, 1391525437 * widget.item, 1L, i_82_, i_83_,
														true, false, -592186295 * widget.component << 32 | widget.id
																* 1857819631, true);
											} else {
												PlayerVariableProvider.method1560();
											}
										} else {
											if (GameContext.STELLAR_DAWN == game) {
												MenuOption.add(
														TranslatableString.FACE_HERE.translate(Client.currentLanguage),
														"", -1, 60, -1, 1L, i_82_, i_83_, true, false, 0L, true);
											}
											MenuOption.add(ParticleTriangle.aString7753, "", anInt10775 * 675691335,
													23, -1, 1L, i_82_, i_83_, true, false, 0L, true);
										}
									}
									continue;
								}
								if (1655048567 * Widget.anInt2537 == 1584180271 * widget.contentType) {
									ParticleProducer.aClass226_7678 = widget;
									if (bool_53_) {
										Class495_Sub1.aBool10320 = true;
									}
									if (bool_58_) {
										int i_86_ = (int) ((record.getX() - x - 688089097 * widget.width / 2) * 2.0 / Class495.aFloat6818);
										int i_87_ = (int) -((record.getY() - y - widget.height * 1362321717 / 2) * 2.0 / Class495.aFloat6818);
										int i_88_ = -1343037161 * AsynchronousStreamRequest.anInt4532 + i_86_
												+ Class495.anInt6849;
										int i_89_ = Class495.anInt6823 + -1266662223 * ClanChannelUpdater.anInt3185
												+ i_87_;
										Class480_Sub31_Sub18 class480_sub31_sub18 = Class436.method7271();
										if (class480_sub31_sub18 != null) {
											int[] is = new int[3];
											class480_sub31_sub18.method17867(i_88_, i_89_, is, 210884310);
											if (Class193.keyRecorder.held(82) && 1667858447 * localPrivilege > 0) {
												Client.teleport(is[0], is[1], is[2]);
												continue;
											}
											aBool10817 = true;
											Class578.anInt7740 = is[0] * 1358697747;
											Mob.anInt11561 = -1634396677 * is[1];
											Class506.anInt6966 = is[2] * 2011201699;
											anInt10815 = -702976661;
											aBool10816 = false;
											anInt10803 = Client.recorder.getMouseX() * 2080472875;
											anInt10804 = Client.recorder.getMouseY() * -931482949;
										}
									} else if (bool_57_ && anInt10815 * -1296345277 > 0) {
										if (anInt10815 * -1296345277 == 1
												&& (1600472963 * anInt10803 != Client.recorder.getMouseX() || anInt10804 * 558940787 != Client.recorder
														.getMouseY())) {
											ArchiveType.anInt8449 = AsynchronousStreamRequest.anInt4532 * 1422546503;
											Class368.anInt4052 = -415101401 * ClanChannelUpdater.anInt3185;
											anInt10815 = -1405953322;
										}
										if (anInt10815 * -1296345277 == 2) {
											aBool10816 = true;
											Class265.method5006(
													ArchiveType.anInt8449
															* -2026637647
															+ (int) ((1600472963 * anInt10803 - Client.recorder
																	.getMouseX()) * 2.0 / Class495.aFloat6835),
													-1462206291);
											Class359.method6039(
													-509758105
															* Class368.anInt4052
															- (int) ((558940787 * anInt10804 - Client.recorder
																	.getMouseY()) * 2.0 / Class495.aFloat6835),
													-273393577);
										}
									} else {
										if (anInt10815 * -1296345277 > 0 && !aBool10816) {
											if ((anInt10780 * -1088062211 == 1 || Class436.method7269())
													&& Class56.menuOptionCount * 84366055 > 2) {
												Class122.method2241(1600472963 * anInt10803, anInt10804 * 558940787);
											} else if (GlobalPlayer.method1099()) {
												Class122.method2241(anInt10803 * 1600472963, 558940787 * anInt10804);
											}
										}
										anInt10815 = 0;
									}
									continue;
								}
								if (Widget.anInt2457 * 1073954765 == 1584180271 * widget.contentType) {
									if (bool_57_) {
										DecodingFontProvider.method917(Client.recorder.getMouseX() - x,
												Client.recorder.getMouseY() - y, widget.width * 688089097,
												widget.height * 1362321717, -200365691);
									}
									continue;
								}
								if (1584180271 * widget.contentType == Widget.anInt2411 * 1311947433) {
									Class427.method7086(widget, x, y);
									continue;
								}
							}
							if (!widget.aBool2545 && bool_58_) {
								widget.aBool2545 = true;
								if (null != widget.anObjectArray2359) {
									ScriptContext class480_sub35 = new ScriptContext();
									class480_sub35.aBool10248 = true;
									class480_sub35.source = widget;
									class480_sub35.mouseX = (record.getX() - x) * 2003537681;
									class480_sub35.mouseY = (record.getY() - y) * -1907805425;
									class480_sub35.arguments = widget.anObjectArray2359;
									aClass644_10843.pushBack(class480_sub35);
								}
							}
							if (widget.aBool2545 && bool_57_ && widget.anObjectArray2357 != null) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.aBool10248 = true;
								class480_sub35.source = widget;
								class480_sub35.mouseX = (Client.recorder.getMouseX() - x) * 2003537681;
								class480_sub35.mouseY = (Client.recorder.getMouseY() - y) * -1907805425;
								class480_sub35.arguments = widget.anObjectArray2357;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (widget.aBool2545 && !bool_57_) {
								widget.aBool2545 = false;
								if (null != widget.anObjectArray2487) {
									ScriptContext class480_sub35 = new ScriptContext();
									class480_sub35.aBool10248 = true;
									class480_sub35.source = widget;
									class480_sub35.mouseX = (Client.recorder.getMouseX() - x) * 2003537681;
									class480_sub35.mouseY = (Client.recorder.getMouseY() - y) * -1907805425;
									class480_sub35.arguments = widget.anObjectArray2487;
									aClass644_10897.pushBack(class480_sub35);
								}
							}
							if (bool_57_ && widget.anObjectArray2557 != null) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.aBool10248 = true;
								class480_sub35.source = widget;
								class480_sub35.mouseX = (Client.recorder.getMouseX() - x) * 2003537681;
								class480_sub35.mouseY = (Client.recorder.getMouseY() - y) * -1907805425;
								class480_sub35.arguments = widget.anObjectArray2557;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (!widget.aBool2544 && bool_53_) {
								widget.aBool2544 = true;
								if (widget.anObjectArray2489 != null) {
									ScriptContext class480_sub35 = new ScriptContext();
									class480_sub35.aBool10248 = true;
									class480_sub35.source = widget;
									class480_sub35.mouseX = (Client.recorder.getMouseX() - x) * 2003537681;
									class480_sub35.mouseY = (Client.recorder.getMouseY() - y) * -1907805425;
									class480_sub35.arguments = widget.anObjectArray2489;
									aClass644_10843.pushBack(class480_sub35);
								}
							}
							if (widget.aBool2544 && bool_53_ && widget.anObjectArray2490 != null) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.aBool10248 = true;
								class480_sub35.source = widget;
								class480_sub35.mouseX = (Client.recorder.getMouseX() - x) * 2003537681;
								class480_sub35.mouseY = (Client.recorder.getMouseY() - y) * -1907805425;
								class480_sub35.arguments = widget.anObjectArray2490;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (widget.aBool2544 && !bool_53_) {
								widget.aBool2544 = false;
								if (widget.anObjectArray2491 != null) {
									ScriptContext class480_sub35 = new ScriptContext();
									class480_sub35.aBool10248 = true;
									class480_sub35.source = widget;
									class480_sub35.mouseX = (Client.recorder.getMouseX() - x) * 2003537681;
									class480_sub35.mouseY = (Client.recorder.getMouseY() - y) * -1907805425;
									class480_sub35.arguments = widget.anObjectArray2491;
									aClass644_10897.pushBack(class480_sub35);
								}
							}
							if (null != widget.anObjectArray2508) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2508;
								aClass644_10844.pushBack(class480_sub35);
							}
							if (null != widget.anObjectArray2502
									&& -1997518589 * anInt10672 > 451773085 * widget.anInt2550) {
								if (widget.anIntArray2503 == null
										|| -1997518589 * anInt10672 - widget.anInt2550 * 451773085 > 64) {
									ScriptContext class480_sub35 = new ScriptContext();
									class480_sub35.source = widget;
									class480_sub35.arguments = widget.anObjectArray2502;
									aClass644_10843.pushBack(class480_sub35);
								} else {
									while_26_: for (int i_90_ = widget.anInt2550 * 451773085; i_90_ < anInt10672
											* -1997518589; i_90_++) {
										int i_91_ = anIntArray10751[i_90_ & 0x3f];
										for (int i_92_ = 0; i_92_ < widget.anIntArray2503.length; i_92_++) {
											if (widget.anIntArray2503[i_92_] == i_91_) {
												ScriptContext class480_sub35 = new ScriptContext();
												class480_sub35.source = widget;
												class480_sub35.arguments = widget.anObjectArray2502;
												aClass644_10843.pushBack(class480_sub35);
												break while_26_;
											}
										}
									}
								}
								widget.anInt2550 = anInt10672 * -703735777;
							}
							if (widget.anObjectArray2504 != null
									&& anInt10830 * 1871078651 > widget.anInt2419 * -73943425) {
								if (null == widget.anIntArray2505
										|| 1871078651 * anInt10830 - widget.anInt2419 * -73943425 > 64) {
									ScriptContext class480_sub35 = new ScriptContext();
									class480_sub35.source = widget;
									class480_sub35.arguments = widget.anObjectArray2504;
									aClass644_10843.pushBack(class480_sub35);
								} else {
									while_27_: for (int i_93_ = widget.anInt2419 * -73943425; i_93_ < anInt10830 * 1871078651; i_93_++) {
										int i_94_ = anIntArray10630[i_93_ & 0x3f];
										for (int i_95_ = 0; i_95_ < widget.anIntArray2505.length; i_95_++) {
											if (widget.anIntArray2505[i_95_] == i_94_) {
												ScriptContext class480_sub35 = new ScriptContext();
												class480_sub35.source = widget;
												class480_sub35.arguments = widget.anObjectArray2504;
												aClass644_10843.pushBack(class480_sub35);
												break while_27_;
											}
										}
									}
								}
								widget.anInt2419 = anInt10830 * -1076696187;
							}
							if (widget.anObjectArray2496 != null
									&& anInt10898 * -1707026519 > 395827119 * widget.anInt2547) {
								if (widget.anIntArray2497 == null
										|| -1707026519 * anInt10898 - 395827119 * widget.anInt2547 > 64) {
									ScriptContext class480_sub35 = new ScriptContext();
									class480_sub35.source = widget;
									class480_sub35.arguments = widget.anObjectArray2496;
									aClass644_10843.pushBack(class480_sub35);
								} else {
									while_28_: for (int i_96_ = widget.anInt2547 * 395827119; i_96_ < -1707026519
											* anInt10898; i_96_++) {
										int i_97_ = anIntArray10821[i_96_ & 0x3f];
										for (int i_98_ = 0; i_98_ < widget.anIntArray2497.length; i_98_++) {
											if (widget.anIntArray2497[i_98_] == i_97_) {
												ScriptContext class480_sub35 = new ScriptContext();
												class480_sub35.source = widget;
												class480_sub35.arguments = widget.anObjectArray2496;
												aClass644_10843.pushBack(class480_sub35);
												break while_28_;
											}
										}
									}
								}
								widget.anInt2547 = -250362841 * anInt10898;
							}
							if (null != widget.anObjectArray2498
									&& -860256701 * anInt10824 > widget.anInt2548 * -139406313) {
								if (widget.anIntArray2499 == null
										|| -860256701 * anInt10824 - widget.anInt2548 * -139406313 > 64) {
									ScriptContext class480_sub35 = new ScriptContext();
									class480_sub35.source = widget;
									class480_sub35.arguments = widget.anObjectArray2498;
									aClass644_10843.pushBack(class480_sub35);
								} else {
									while_29_: for (int i_99_ = -139406313 * widget.anInt2548; i_99_ < anInt10824
											* -860256701; i_99_++) {
										int i_100_ = anIntArray10601[i_99_ & 0x3f];
										for (int i_101_ = 0; i_101_ < widget.anIntArray2499.length; i_101_++) {
											if (i_100_ == widget.anIntArray2499[i_101_]) {
												ScriptContext class480_sub35 = new ScriptContext();
												class480_sub35.source = widget;
												class480_sub35.arguments = widget.anObjectArray2498;
												aClass644_10843.pushBack(class480_sub35);
												break while_29_;
											}
										}
									}
								}
								widget.anInt2548 = -1994768715 * anInt10824;
							}
							if (widget.anObjectArray2500 != null
									&& -1224820253 * anInt10826 > widget.anInt2460 * 1695706933) {
								if (widget.anIntArray2501 == null
										|| anInt10826 * -1224820253 - widget.anInt2460 * 1695706933 > 64) {
									ScriptContext class480_sub35 = new ScriptContext();
									class480_sub35.source = widget;
									class480_sub35.arguments = widget.anObjectArray2500;
									aClass644_10843.pushBack(class480_sub35);
								} else {
									while_30_: for (int i_102_ = widget.anInt2460 * 1695706933; i_102_ < anInt10826
											* -1224820253; i_102_++) {
										int i_103_ = anIntArray10825[i_102_ & 0x3f];
										for (int i_104_ = 0; i_104_ < widget.anIntArray2501.length; i_104_++) {
											if (widget.anIntArray2501[i_104_] == i_103_) {
												ScriptContext context = new ScriptContext();
												context.source = widget;
												context.arguments = widget.anObjectArray2500;
												aClass644_10843.pushBack(context);
												break while_30_;
											}
										}
									}
								}
								widget.anInt2460 = anInt10826 * 1193062327;
							}
							if (null != widget.anObjectArray2506
									&& anInt10832 * 1633678097 > 179384269 * widget.anInt2552) {
								if (null == widget.anIntArray2507
										|| anInt10832 * 1633678097 - widget.anInt2552 * 179384269 > 64) {
									ScriptContext class480_sub35 = new ScriptContext();
									class480_sub35.source = widget;
									class480_sub35.arguments = widget.anObjectArray2506;
									aClass644_10843.pushBack(class480_sub35);
								} else {
									while_31_: for (int i_105_ = 179384269 * widget.anInt2552; i_105_ < 1633678097 * anInt10832; i_105_++) {
										int i_106_ = anIntArray10868[i_105_ & 0x3f];
										for (int i_107_ = 0; i_107_ < widget.anIntArray2507.length; i_107_++) {
											if (i_106_ == widget.anIntArray2507[i_107_]) {
												ScriptContext class480_sub35 = new ScriptContext();
												class480_sub35.source = widget;
												class480_sub35.arguments = widget.anObjectArray2506;
												aClass644_10843.pushBack(class480_sub35);
												break while_31_;
											}
										}
									}
								}
								widget.anInt2552 = 542860373 * anInt10832;
							}
							if (270723951 * anInt10833 > -1756057043 * widget.anInt2389
									&& null != widget.anObjectArray2447) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2447;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (anInt10834 * 323484595 > widget.anInt2389 * -1756057043
									&& null != widget.anObjectArray2364) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2364;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (-1734459545 * anInt10835 > -1756057043 * widget.anInt2389
									&& widget.anObjectArray2515 != null) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2515;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (-835316707 * anInt10836 > widget.anInt2389 * -1756057043
									&& null != widget.anObjectArray2516) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2516;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (anInt10837 * 128189123 > widget.anInt2389 * -1756057043
									&& widget.anObjectArray2517 != null) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2517;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (anInt10838 * -1659079765 > widget.anInt2389 * -1756057043
									&& widget.anObjectArray2519 != null) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2519;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (477564323 * anInt10839 > -1756057043 * widget.anInt2389
									&& null != widget.anObjectArray2518) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2518;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (792630773 * anInt10840 > -1756057043 * widget.anInt2389
									&& widget.anObjectArray2397 != null) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2397;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (-1315991227 * anInt10642 > -1756057043 * widget.anInt2389
									&& widget.anObjectArray2525 != null) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2525;
								aClass644_10843.pushBack(class480_sub35);
							}
							if (550469601 * anInt10842 > -1756057043 * widget.anInt2389
									&& null != widget.anObjectArray2526) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2526;
								aClass644_10843.pushBack(class480_sub35);
							}
							widget.anInt2389 = anInt10823 * 116537459;
							if (widget.anObjectArray2513 != null) {
								for (int i_108_ = 0; i_108_ < 1019900971 * anInt10690; i_108_++) {
									ScriptContext class480_sub35 = new ScriptContext();
									class480_sub35.source = widget;
									class480_sub35.typedKeyCode = anInterface59Array10637[i_108_].getCode() * 976981103;
									class480_sub35.typedKeyChar = anInterface59Array10637[i_108_].getCharacter() * 35438437;
									class480_sub35.arguments = widget.anObjectArray2513;
									aClass644_10843.pushBack(class480_sub35);
								}
							}
							if (aBool10841 && widget.anObjectArray2522 != null) {
								ScriptContext class480_sub35 = new ScriptContext();
								class480_sub35.source = widget;
								class480_sub35.arguments = widget.anObjectArray2522;
								aClass644_10843.pushBack(class480_sub35);
							}
						}
						if (widget.type * 1558474223 == 5 && -1 != widget.anInt2533 * -2141876157) {
							widget.method4269(SkyboxDefinition.loader, SunDefinition.loader, 2103217409).method8265(
									Class60.activeToolkit, 1362321717 * widget.height,
									Class199.preferences.skyboxes.getValue());
						}
						Widget.method2232(widget);
						if (0 == 1558474223 * widget.type) {
							method17015(class221, widgets, widget.id * 1857819631, i_47_, i_48_, i_49_, i_50_, x
									- widget.anInt2382 * -1909412215, y - widget.scrollPosition * -1881455913, i_42_,
									i_43_);
							if (null != widget.aClass226Array2521) {
								method17015(class221, widget.aClass226Array2521, 1857819631 * widget.id, i_47_, i_48_,
										i_49_, i_50_, x - -1909412215 * widget.anInt2382, y - widget.scrollPosition
												* -1881455913, i_42_, i_43_);
							}
							Class480_Sub41 class480_sub41 = (Class480_Sub41) aClass667_10791
									.get(widget.id * 1857819631);
							if (class480_sub41 != null) {
								Class575.method9766(class480_sub41, class480_sub41.anInt10372 * 1021060255, i_47_,
										i_48_, i_49_, i_50_, x - -1909412215 * widget.anInt2382, y - -1881455913
												* widget.scrollPosition, i_42_, i_43_);
							}
						}
					}
				}
			}
		}
	}

	public static Class480_Sub16 method17050(Widget class226) {
		Class480_Sub16 class480_sub16 = (Class480_Sub16) aClass667_10846.get(class226.component * -592186295
				+ ((long) (class226.id * 1857819631) << 32));
		return class480_sub16 != null ? class480_sub16 : class226.aClass480_Sub16_2462;
	}

	public static void method9237(boolean bool) {
		if (bool) {
			if (1764783361 * anInt10790 != -1) {
				Widget.method10427(anInt10790 * 1764783361);
			}
			for (Class480_Sub41 class480_sub41 = (Class480_Sub41) aClass667_10791.first(); null != class480_sub41; class480_sub41 = (Class480_Sub41) aClass667_10791
					.next()) {
				if (!class480_sub41.isLinked()) {
					class480_sub41 = (Class480_Sub41) aClass667_10791.first();
					if (class480_sub41 == null) {
						break;
					}
				}
				Class480_Sub41.method9830(class480_sub41, true, false);
			}
			anInt10790 = -1598589697;
			aClass667_10791 = new HashTable(8);
			CutsceneMob.method3383((byte) 1);
			anInt10790 = Mob.defaults.loginWindow * -304951561;
			if (-1 != 1764783361 * anInt10790) {
				ShaderMetaBuffer.method4370(false);
				EntityQueue.method13532();
				Widget.method5082(anInt10790 * 1764783361, null);
			}
		}
		Class27.method788();
		Class369.aClass261_Sub1_4079.method4803(true);
		Class31.aBool438 = false;
		Class367.method6092();
		anInt10782 = -2101032765;
		CursorDefinition.createCursor(918063407 * anInt10781);
		localPlayer = new Player(null);
		HashTableIterator.aClass600_Sub1_Sub3_Sub1_Sub1_8361 = new Player(null);
		HashTableIterator.aClass600_Sub1_Sub3_Sub1_Sub1_8361.index = 1836971894;
		localPlayer.method10170(aClass460_10760.method7680() * 512 / 2, 0.0F, aClass460_10760.method7707() * 512 / 2);
		localPlayer.pathX[0] = aClass460_10760.method7680() / 2;
		localPlayer.pathZ[0] = aClass460_10760.method7707() / 2;
		Wall.cameraZ = 0;
		cameraX = 0;
		if (5 == 1212513917 * Connection.anInt7170) {
			cameraX = -224503671 * (Class282.anInt3162 * 772801339 << 9);
			Wall.cameraZ = -187933039 * (-191767805 * VoiceOverVolumeNormaliser.anInt1993 << 9);
		} else {
			Class51.method1136();
		}
		aClass460_10760.method7690().method9709();
	}

	public static boolean openUrl(String url, int type, String method) {
		if (type == 0) {
			try {
				if (!Class474.osName.startsWith("win")) {
					throw new Exception();
				}

				if (!url.startsWith("http://") && !url.startsWith("https://")) {
					throw new Exception();
				}

				String valid = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:";
				for (int index = 0; index < url.length(); index++) {
					if (valid.indexOf(url.charAt(index)) == -1) {
						throw new Exception();
					}
				}

				Runtime.getRuntime().exec("cmd /c start \"j\" \"" + url + "\"");
				return true;
			} catch (Throwable throwable) {
				return false;
			}
		} else if (1 == type) {
			try {
				Object object = JavascriptUtils.call(Class474.applet, method,
						new Object[] { new URL(Class474.applet.getCodeBase(), url).toString() });
				return null != object;
			} catch (Throwable throwable) {
				return false;
			}
		} else if (2 == type) {
			try {
				Class474.applet.getAppletContext().showDocument(new URL(Class474.applet.getCodeBase(), url), "_blank");
				return true;
			} catch (Exception exception) {
				return false;
			}
		} else if (type == 3) {
			try {
				JavascriptUtils.call(Class474.applet, "loggedout");
			} catch (Throwable throwable) {
			}

			try {
				Class474.applet.getAppletContext().showDocument(new URL(Class474.applet.getCodeBase(), url), "_top");
				return true;
			} catch (Exception exception) {
				return false;
			}
		}

		throw new IllegalArgumentException();
	}

	public static int parseDecimal(CharSequence sequence) {
		return TextureMetrics.parseInt(sequence, 10, true);
	}

	public static final void sleep(long l) {
		if (l > 0L) {
			if (l % 10L == 0L) {
				Class50.sleep(l - 1L);
				Class50.sleep(1L);
			} else {
				Class50.sleep(l);
			}
		}
	}

	static final void method13191(int i) {
		int i_5_ = 256 + 537294336 * Class282.anInt3162;
		int i_6_ = 256 + VoiceOverVolumeNormaliser.anInt1993 * 599131648;
		int i_7_ = Class279.getAverageHeight(i_5_, i_6_, 1611577177 * ProxyingVariableLoader.localPlane) - 1611257481
				* Class166_Sub6.anInt9539;
		if (MobShadowsPreference.anInt10475 * 1972295663 >= 100) {
			Client.cameraX = -1638364928 + Class282.anInt3162 * 805643776;
			Wall.cameraZ = -666016256 * VoiceOverVolumeNormaliser.anInt1993 + -866217728;
			Class268.cameraY = (Class279.getAverageHeight(2006359481 * Client.cameraX, 1829446257 * Wall.cameraZ,
					ProxyingVariableLoader.localPlane * 1611577177) - Class166_Sub6.anInt9539 * 1611257481)
					* -1128143643;
		} else {
			if (2006359481 * Client.cameraX < i_5_) {
				Client.cameraX += -224503671
						* ((i_5_ - 2006359481 * Client.cameraX) * MobShadowsPreference.anInt10475 * 1972295663 / 1000 + Class122.anInt1471
								* -1441235289);
				if (Client.cameraX * 2006359481 > i_5_) {
					Client.cameraX = -224503671 * i_5_;
				}
			}
			if (Client.cameraX * 2006359481 > i_5_) {
				Client.cameraX -= -224503671
						* (Class122.anInt1471 * -1441235289 + (2006359481 * Client.cameraX - i_5_)
								* MobShadowsPreference.anInt10475 * 1972295663 / 1000);
				if (Client.cameraX * 2006359481 < i_5_) {
					Client.cameraX = i_5_ * -224503671;
				}
			}
			if (Class268.cameraY * 1525233901 < i_7_) {
				Class268.cameraY += -1128143643
						* (1972295663 * MobShadowsPreference.anInt10475 * (i_7_ - Class268.cameraY * 1525233901) / 1000 + Class122.anInt1471
								* -1441235289);
				if (Class268.cameraY * 1525233901 > i_7_) {
					Class268.cameraY = i_7_ * -1128143643;
				}
			}
			if (1525233901 * Class268.cameraY > i_7_) {
				Class268.cameraY -= -1128143643
						* (MobShadowsPreference.anInt10475 * 1972295663 * (1525233901 * Class268.cameraY - i_7_) / 1000 + -1441235289
								* Class122.anInt1471);
				if (Class268.cameraY * 1525233901 < i_7_) {
					Class268.cameraY = -1128143643 * i_7_;
				}
			}
			if (Wall.cameraZ * 1829446257 < i_6_) {
				Wall.cameraZ += -187933039
						* (Class122.anInt1471 * -1441235289 + MobShadowsPreference.anInt10475 * 1972295663
								* (i_6_ - Wall.cameraZ * 1829446257) / 1000);
				if (1829446257 * Wall.cameraZ > i_6_) {
					Wall.cameraZ = i_6_ * -187933039;
				}
			}
			if (Wall.cameraZ * 1829446257 > i_6_) {
				Wall.cameraZ -= -187933039
						* (-1441235289 * Class122.anInt1471 + (Wall.cameraZ * 1829446257 - i_6_) * 1972295663
								* MobShadowsPreference.anInt10475 / 1000);
				if (Wall.cameraZ * 1829446257 < i_6_) {
					Wall.cameraZ = i_6_ * -187933039;
				}
			}
		}
		i_5_ = ComponentKeyRecord.cameraViewX * -1733418496 + 256;
		i_6_ = 256 + -1589428736 * Class51.cameraViewZ;
		i_7_ = Class279.getAverageHeight(i_5_, i_6_, 1611577177 * ProxyingVariableLoader.localPlane)
				- Preference.cameraViewY * 1314358423;
		int i_8_ = i_5_ - Client.cameraX * 2006359481;
		int i_9_ = i_7_ - 1525233901 * Class268.cameraY;
		int i_10_ = i_6_ - 1829446257 * Wall.cameraZ;
		int i_11_ = (int) Math.sqrt(i_10_ * i_10_ + i_8_ * i_8_);
		int i_12_ = (int) (Math.atan2(i_9_, i_11_) * 2607.5945876176133) & 0x3fff;
		int i_13_ = (int) (Math.atan2(i_8_, i_10_) * -2607.5945876176133) & 0x3fff;
		if (i_12_ < 1024) {
			i_12_ = 1024;
		}
		if (i_12_ > 3072) {
			i_12_ = 3072;
		}
		if (912649057 * Class155.anInt1874 < i_12_) {
			Class155.anInt1874 += (-710162729 * Class525.anInt7217 + BefriendedPlayer.anInt576 * -1261726809
					* (i_12_ - 912649057 * Class155.anInt1874 >> 3) / 1000 << 3)
					* -1300105055;
			if (Class155.anInt1874 * 912649057 > i_12_) {
				Class155.anInt1874 = i_12_ * -1300105055;
			}
		}
		if (Class155.anInt1874 * 912649057 > i_12_) {
			Class155.anInt1874 -= -1300105055
					* ((Class155.anInt1874 * 912649057 - i_12_ >> 3) * BefriendedPlayer.anInt576 * -1261726809 / 1000
							+ -710162729 * Class525.anInt7217 << 3);
			if (912649057 * Class155.anInt1874 < i_12_) {
				Class155.anInt1874 = -1300105055 * i_12_;
			}
		}
		int i_14_ = i_13_ - 1686504405 * Class550.anInt7476;
		if (i_14_ > 8192) {
			i_14_ -= 16384;
		}
		if (i_14_ < -8192) {
			i_14_ += 16384;
		}
		i_14_ >>= 3;
		if (i_14_ > 0) {
			Class550.anInt7476 += (-710162729 * Class525.anInt7217 + -1261726809 * BefriendedPlayer.anInt576 * i_14_
					/ 1000 << 3)
					* -1726145155;
			Class550.anInt7476 = (Class550.anInt7476 * 1686504405 & 0x3fff) * -1726145155;
		}
		if (i_14_ < 0) {
			Class550.anInt7476 -= -1726145155
					* (Class525.anInt7217 * -710162729 + -i_14_ * BefriendedPlayer.anInt576 * -1261726809 / 1000 << 3);
			Class550.anInt7476 = (Class550.anInt7476 * 1686504405 & 0x3fff) * -1726145155;
		}
		int i_15_ = i_13_ - Class550.anInt7476 * 1686504405;
		if (i_15_ > 8192) {
			i_15_ -= 16384;
		}
		if (i_15_ < -8192) {
			i_15_ += 16384;
		}
		if (i_15_ < 0 && i_14_ > 0 || i_15_ > 0 && i_14_ < 0) {
			Class550.anInt7476 = i_13_ * -1726145155;
		}
		IncomingFrameMeta.anInt4473 = 0;
	}

	static final void method16849() {
		int[][] is = aClass460_10760.method7692();
		int i = aClass460_10760.method7680();
		int i_6_ = aClass460_10760.method7707();
		for (int i_7_ = 0; i_7_ < i; i_7_++) {
			int[] is_8_ = is[i_7_];
			for (int i_9_ = 0; i_9_ < i_6_; i_9_++) {
				is_8_[i_9_] = 0;
			}
		}
	}

	static final void method16850(int i) {
		int playerCount = -1784886003 * Class80.playerCount;
		int[] playerIndices = Class80.playerIndices;
		int[][] is_11_ = aClass460_10760.method7692();
		int[][] is_12_ = aClass460_10760.method7693();
		int count;
		if (1 == 2087248539 * cutsceneStage) {
			count = CutsceneMob.mobs.length;
		} else {
			count = playerCount + npcCount * 1746328619;
		}

		for (int index = 0; index < count; index++) {
			Mob mob;
			if (1 == 2087248539 * cutsceneStage) {
				CutsceneMob class165 = CutsceneMob.mobs[index];
				if (!class165.initialised) {
					continue;
				}

				mob = class165.getMob();
			} else {
				if (index < playerCount) {
					mob = players[playerIndices[index]];
				} else {
					mob = npcs.get(npcIndices[index - playerCount]).object;
				}

				if (mob.plane != i || -2109116613 * mob.drawPriority < 0) {
					continue;
				}
			}

			int i_15_ = mob.boundSize();
			Class397 class397 = mob.method10164().aClass397_4507;
			if ((i_15_ & 0x1) == 0) {
				if (((int) class397.x & 0x1ff) != 0 || 0 != ((int) class397.z & 0x1ff)) {
					continue;
				}
			} else if (256 != ((int) class397.x & 0x1ff) || 256 != ((int) class397.z & 0x1ff)) {
				continue;
			}

			if (i_15_ == 1) {
				int i_16_ = (int) class397.x >> 9;
				int i_17_ = (int) class397.z >> 9;
				if (mob.drawPriority * -2109116613 > is_11_[i_16_][i_17_]) {
					is_11_[i_16_][i_17_] = -2109116613 * mob.drawPriority;
					is_12_[i_16_][i_17_] = 1;
				} else if (mob.drawPriority * -2109116613 == is_11_[i_16_][i_17_]) {
					is_12_[i_16_][i_17_]++;
				}
			} else {
				int i_18_ = 60 + 256 * (i_15_ - 1);
				int i_19_ = (int) class397.x - i_18_ >> 9;
				int i_20_ = (int) class397.z - i_18_ >> 9;
				int i_21_ = i_18_ + (int) class397.x >> 9;
				int i_22_ = (int) class397.z + i_18_ >> 9;
				for (int i_23_ = i_19_; i_23_ <= i_21_; i_23_++) {
					for (int i_24_ = i_20_; i_24_ <= i_22_; i_24_++) {
						if (-2109116613 * mob.drawPriority > is_11_[i_23_][i_24_]) {
							is_11_[i_23_][i_24_] = -2109116613 * mob.drawPriority;
							is_12_[i_23_][i_24_] = 1;
						} else if (is_11_[i_23_][i_24_] == -2109116613 * mob.drawPriority) {
							is_12_[i_23_][i_24_]++;
						}
					}
				}
			}
		}
	}

	static boolean method16857(Widget class226) {
		if (aBool10603) {
			if (method17050(class226).anInt10100 * -528482985 != 0) {
				return false;
			} else if (class226.type * 1558474223 == 0) {
				return false;
			}
		}

		return class226.hidden;
	}

	static final void method16925() {
		int count = Class80.playerCount * -1784886003;
		int[] playerIndices = Class80.playerIndices;
		int idleAnimations = Class199.preferences.idleAnimations.getValue();
		boolean animate = idleAnimations == 1 && count > 200 || idleAnimations == 0 && count > 50;

		for (int index = 0; index < count; index++) {
			Player player = players[playerIndices[index]];
			if (!player.hasAppearance()) {
				player.drawPriority = -909218291;
			} else if (player.aBool11783) {
				player.drawPriority = -909218291;
			} else {
				player.method17912();

				if (player.aShort11457 < 0 || player.aShort11464 < 0
						|| player.aShort11458 >= aClass460_10760.method7680()
						|| player.aShort11459 >= aClass460_10760.method7707()) {
					player.drawPriority = -909218291;
				} else {
					player.aBool11773 = player.aClass650_Sub2_11525.aBool10566 ? animate : false;
					if (player == Client.localPlayer) {
						player.drawPriority = 1238265357;
					} else {
						int i_27_ = 0;
						if (!player.aBool11499) {
							i_27_++;
						}

						if (!player.aClass649_11514.isEmpty()) {
							i_27_ += 2;
						}

						i_27_ += 5 - player.boundSize() << 2;
						if (player.aClass198_11782 != Class198.aClass198_2093 || player.clanmate) {
							i_27_ += 512;
						} else {
							if (0 == anInt10665 * 1854979905) {
								i_27_ += 32;
							} else {
								i_27_ += 128;
							}
							i_27_ += 256;
						}

						if (player.method17969() == -585847029 * anInt10859) {
							i_27_ += 2047;
						}

						player.drawPriority = (1 + i_27_) * 909218291;
					}
				}
			}
		}

		for (int index = 0; index < npcCount * 1746328619; index++) {
			Npc npc = npcs.get(npcIndices[index]).object;
			if (!npc.hasDefinition()
					|| !npc.definition.method5128(PlayerVariableProvider.instance, PlayerVariableProvider.instance,
							1997940003)) {
				npc.drawPriority = -909218291;
			} else {
				npc.method17912();
				if (npc.aShort11457 < 0 || npc.aShort11464 < 0 || npc.aShort11458 >= aClass460_10760.method7680()
						|| npc.aShort11459 >= aClass460_10760.method7707()) {
					npc.drawPriority = -909218291;
				} else {
					int i_29_ = 0;
					if (!npc.aBool11499) {
						i_29_++;
					}
					if (!npc.aClass649_11514.isEmpty()) {
						i_29_ += 2;
					}
					if (npc.boundSize() < 5) {
						i_29_ += 5 - npc.boundSize() << 2;
					}
					if (anInt10665 * 1854979905 == 0) {
						if (npc.definition.aBool3041) {
							i_29_ += 64;
						} else {
							i_29_ += 128;
						}
					} else if (1854979905 * anInt10665 == 1) {
						if (npc.definition.aBool3041) {
							i_29_ += 32;
						} else {
							i_29_ += 64;
						}
					}
					if (npc.definition.aBool3040) {
						i_29_ += 1024;
					} else if (!npc.definition.aBool3033) {
						i_29_ += 256;
					}
					if (npc.method17969() == -585847029 * anInt10859) {
						i_29_ += 2047;
					}
					npc.drawPriority = 909218291 * (i_29_ + 1);
				}
			}
		}
		for (Class75 class75 : aClass75Array10623) {
			if (class75 != null) {
				if (1 == -335735335 * class75.anInt1123) {
					LinkableObject class480_sub25 = npcs.get(class75.anInt1117 * 1326506857);
					if (null != class480_sub25) {
						Npc class600_sub1_sub3_sub1_sub2 = (Npc) class480_sub25.object;
						if (-2109116613 * class600_sub1_sub3_sub1_sub2.drawPriority >= 0) {
							class600_sub1_sub3_sub1_sub2.drawPriority += -1936746496;
						}
					}
				} else if (-335735335 * class75.anInt1123 == 10) {
					Player class600_sub1_sub3_sub1_sub1 = players[class75.anInt1117 * 1326506857];
					if (null != class600_sub1_sub3_sub1_sub1 && Client.localPlayer != class600_sub1_sub3_sub1_sub1
							&& class600_sub1_sub3_sub1_sub1.drawPriority * -2109116613 >= 0) {
						class600_sub1_sub3_sub1_sub1.drawPriority += -1936746496;
					}
				}
			}
		}
	}

	static Widget method17024(Widget class226) {
		Class480_Sub16 class480_sub16 = method17050(class226);
		if (class480_sub16.method15630(1754788389)) {
			return Class172.aClass226_1961;
		}
		int i = class480_sub16.method15634(493408954);
		if (0 == i) {
			return null;
		}
		for (int i_109_ = 0; i_109_ < i; i_109_++) {
			class226 = Class339.method5850(Interface.get(1857819631 * class226.id), class226, 1617020370);
			if (class226 == null) {
				return Class172.aClass226_1961;
			}
		}
		return class226;
	}

	static final void method17048() {
		anInt10733 = 0;
		for (int i = 0; i < npcCount * 1746328619; i++) {
			Npc npc = npcs.get(npcIndices[i]).object;
			if (npc.aBool11499 && npc.getArmyIcon() != -1) {
				int worldSize = (npc.boundSize() - 1) * 256 + 252;
				Class397 class397 = npc.method10164().aClass397_4507;
				int x = (int) class397.x - worldSize >> 9;
				int z = (int) class397.z - worldSize >> 9;

				Mob mob = Mob.method10199(npc.plane, x, z);
				if (mob != null) {
					int index = mob.index * 387935885;
					if (mob instanceof Npc) {
						index += 2048;
					}

					if (mob.anInt11503 * 2049586483 == 0 && mob.getArmyIcon() != -1) {
						anIntArray10721[1448892127 * anInt10733] = index;
						anIntArray10636[anInt10733 * 1448892127] = index;
						anInt10733 += 1046799647;
						mob.anInt11503 += 468504059;
					}

					anIntArray10721[anInt10733 * 1448892127] = index;
					anIntArray10636[1448892127 * anInt10733] = npc.index * 387935885 + 2048;
					anInt10733 += 1046799647;
					mob.anInt11503 += 468504059;
				}
			}
		}

		ScriptInstruction.method7887(anIntArray10636, anIntArray10721, 0, 1448892127 * anInt10733 - 1);
	}

	static final void method17149() {
		int playerCount = Class80.playerCount * -1784886003;
		int[] playerIndices = Class80.playerIndices;
		int count;
		if (cutsceneStage * 2087248539 == 1) {
			count = CutsceneMob.mobs.length;
		} else {
			count = aBool10697 ? playerCount : 1746328619 * npcCount + playerCount;
		}

		for (int index = 0; index < count; index++) {
			Mob mob;
			if (2087248539 * cutsceneStage == 1) {
				CutsceneMob class165 = CutsceneMob.mobs[index];
				if (!class165.initialised) {
					continue;
				}
				mob = class165.getMob();
			} else {
				if (index < playerCount) {
					mob = players[playerIndices[index]];
				} else {
					mob = npcs.get(npcIndices[index - playerCount]).object;
				}

				if (-2109116613 * mob.drawPriority < 0) {
					continue;
				}
			}

			int size = mob.boundSize();
			Class397 class397 = mob.method10164().aClass397_4507;
			if ((size & 0x1) == 0) {
				if (((int) class397.x & 0x1ff) == 0 && 0 == ((int) class397.z & 0x1ff)) {
					continue;
				}
			} else if (((int) class397.x & 0x1ff) == 256 && 256 == ((int) class397.z & 0x1ff)) {
				continue;
			}
			mob.method10170(class397.x, Class279.getAverageHeight((int) class397.x, (int) class397.z, mob.plane),
					class397.z);
			aClass460_10760.method7687().method8423(mob, true);
		}
	}

	static final void method17161(int i) {
		int i_135_ = -1784886003 * Class80.playerCount;
		int[] is = Class80.playerIndices;
		int[][] is_136_ = aClass460_10760.method7692();
		int[][] is_137_ = aClass460_10760.method7693();
		int i_138_;
		if (2087248539 * cutsceneStage == 1) {
			i_138_ = CutsceneMob.mobs.length;
		} else {
			i_138_ = aBool10697 ? i_135_ : i_135_ + 1746328619 * npcCount;
		}
		for (int i_139_ = 0; i_139_ < i_138_; i_139_++) {
			Mob class600_sub1_sub3_sub1;
			if (cutsceneStage * 2087248539 == 1) {
				CutsceneMob class165 = CutsceneMob.mobs[i_139_];
				if (!class165.initialised) {
					continue;
				}
				class600_sub1_sub3_sub1 = class165.getMob();
			} else {
				if (i_139_ < i_135_) {
					class600_sub1_sub3_sub1 = players[is[i_139_]];
				} else {
					class600_sub1_sub3_sub1 = npcs.get(npcIndices[i_139_ - i_135_]).object;
				}
				if (i != class600_sub1_sub3_sub1.plane) {
					continue;
				}
				if (-2109116613 * class600_sub1_sub3_sub1.drawPriority < 0) {
					class600_sub1_sub3_sub1.aBool11499 = false;
					continue;
				}
			}
			class600_sub1_sub3_sub1.anInt11503 = 0;
			int i_140_ = class600_sub1_sub3_sub1.boundSize();
			Class397 class397 = class600_sub1_sub3_sub1.method10164().aClass397_4507;
			if (0 == (i_140_ & 0x1)) {
				if (((int) class397.x & 0x1ff) != 0 || 0 != ((int) class397.z & 0x1ff)) {
					class600_sub1_sub3_sub1.aBool11499 = false;
					continue;
				}
			} else if (256 != ((int) class397.x & 0x1ff) || 256 != ((int) class397.z & 0x1ff)) {
				class600_sub1_sub3_sub1.aBool11499 = false;
				continue;
			}
			if (2087248539 * cutsceneStage != 1) {
				if (i_140_ == 1) {
					int i_141_ = (int) class397.x >> 9;
					int i_142_ = (int) class397.z >> 9;
					if (-2109116613 * class600_sub1_sub3_sub1.drawPriority != is_136_[i_141_][i_142_]) {
						class600_sub1_sub3_sub1.aBool11499 = true;
						continue;
					}
					if (is_137_[i_141_][i_142_] > 1) {
						is_137_[i_141_][i_142_]--;
						class600_sub1_sub3_sub1.aBool11499 = true;
						continue;
					}
				} else {
					int i_143_ = 252 + 256 * (i_140_ - 1);
					int i_144_ = (int) class397.x - i_143_ >> 9;
					int i_145_ = (int) class397.z - i_143_ >> 9;
					int i_146_ = i_143_ + (int) class397.x >> 9;
					int i_147_ = i_143_ + (int) class397.z >> 9;
					if (!Class447.method7373(is_136_, is_137_, -2109116613 * class600_sub1_sub3_sub1.drawPriority,
							i_144_, i_145_, i_146_, i_147_, 397139058)) {
						for (int i_148_ = i_144_; i_148_ <= i_146_; i_148_++) {
							for (int i_149_ = i_145_; i_149_ <= i_147_; i_149_++) {
								if (is_136_[i_148_][i_149_] == class600_sub1_sub3_sub1.drawPriority * -2109116613) {
									is_137_[i_148_][i_149_]--;
								}
							}
						}
						class600_sub1_sub3_sub1.aBool11499 = true;
						continue;
					}
				}
			}
			class600_sub1_sub3_sub1.aBool11499 = false;
			class600_sub1_sub3_sub1.method10170(class397.x,
					Class279.getAverageHeight((int) class397.x, (int) class397.z, class600_sub1_sub3_sub1.plane),
					class397.z);
			aClass460_10760.method7687().method8423(class600_sub1_sub3_sub1, true);
		}
	}

	static final void method17267(ScriptExecutionContext class613, int i) {
		int i_150_ = class613.anIntArray7942[(class613.anInt7924 -= 1122685165) * 1841827045];
		Widget class226 = Widget.lookup(i_150_);
		Interface class221 = Class598.loadedInterfaces[i_150_ >> 16];
		ScriptExecutionContext.method16136(class226, class221, class613, 944439455);
	}

	static final void method17268(Widget class226, int i, ScriptExecutionContext class613) {
		if (class226.aByteArrayArray2549 == null) {
			throw new RuntimeException();
		}
		if (null == class226.anIntArray2378) {
			class226.anIntArray2378 = new int[class226.aByteArrayArray2549.length];
		}
		class226.anIntArray2378[i] = 2147483647;
	}

	static void method586(boolean bool, int i) {
		if (bool) {
			if (-1 != 1764783361 * anInt10790) {
				Widget.method10427(1764783361 * anInt10790);
			}
			for (Class480_Sub41 class480_sub41 = (Class480_Sub41) aClass667_10791.first(); class480_sub41 != null; class480_sub41 = (Class480_Sub41) aClass667_10791
					.next()) {
				if (!class480_sub41.isLinked()) {
					class480_sub41 = (Class480_Sub41) aClass667_10791.first();
					if (class480_sub41 == null) {
						break;
					}
				}
				Class480_Sub41.method9830(class480_sub41, true, false);
			}
			anInt10790 = -1598589697;
			aClass667_10791 = new HashTable(8);
			CutsceneMob.method3383((byte) 1);
			anInt10790 = Mob.defaults.lobbyWindow * 1231822565;
			if (anInt10790 * 1764783361 != -1) {
				ShaderMetaBuffer.method4370(false);
				EntityQueue.method13532();
				Widget.method5082(1764783361 * anInt10790, null);
			}
		}
		Class31.aBool438 = true;
	}

	static final void method8796(int i, int i_23_, int i_24_, int i_25_) {
		for (int i_27_ = 0; i_27_ < -573888519 * anInt10848; i_27_++) {
			Rectangle rectangle = aRectangleArray10852[i_27_];
			if (rectangle.x + rectangle.width > i && rectangle.x < i_24_ + i && rectangle.y + rectangle.height > i_23_
					&& rectangle.y < i_23_ + i_25_) {
				aBoolArray10850[i_27_] = true;
			}
		}
	}

	static boolean unconnected() {
		if (-1501875989 * gameState != 0) {
			return false;
		}
		return !(Class628.method13100() || Class200.method3939());
	}

	public static Font p12Full;
	public static boolean aBool4247;
	public static MouseRecorder recorder;
	static Socket socket;
	static Sprite[] mapDots;
	static Sprite[] mapmarkers;
	static int hintMapEdgeIndex;
	static int hintHeadiconsIndex;
	static int hintMapmarkersIndex;
	static int mapDotsIndex;
	public static int anInt4915;
	public static Frame fullScreenFrame;
	public static int friendChatSize;
	public static boolean supportsFullScreen = true;
	static int otherLevelIndex;

	@Override
	public final void init() {
		if (method7922()) {
			String string = "";

			for (ClientParameter parameter : ClientParameter.values()) {
				String value = Class454.applet.getParameter(parameter.name);
				if (null != value) {
					switch (Integer.parseInt(parameter.name)) {
						case 16:
							useJs = value.equalsIgnoreCase(Class60.TRUE);
							break;
						case 15:
							aBool10590 = value.equalsIgnoreCase(Class60.TRUE);
							break;
						case 6:
							anInt10593 = Integer.parseInt(value) * -1383184459;
							if (anInt10593 * -39997795 < 0 || anInt10593 * -39997795 >= aColorArray10641.length) {
								anInt10593 = 0;
							}
							break;
						case 12:
							affiliateId = Integer.parseInt(value) * -930386793;
							break;
						case 35:
							break;
						case 38:
							aString10608 = value;
							break;
						case 33:
							if (null == Class671.lobbyConnectionInfo) {
								Class671.lobbyConnectionInfo = new ConnectionInfo(true);
							}
							Class671.lobbyConnectionInfo.host = value;
							break;
						case 32:
							break;
						case 39:
							additionalInfo = value;
							if (additionalInfo.length() > 100) {
								additionalInfo = null;
							}
							break;
						default:
							HitsplatDefinitionProvider.reportError("", new RuntimeException());
							break;
						case 1:
							anInt10596 = Integer.parseInt(value) * -829546781;
							break;
						case 3:
							aString10759 = value;
							break;
						case 11:
							break;
						case 29:
							BuildType.active = BuildType.valueOf(Integer.parseInt(value));
							if (BuildType.WIP != BuildType.active && BuildType.active != BuildType.RC
									&& BuildType.active != BuildType.BUILDLIVE && BuildType.LIVE != BuildType.active) {
								BuildType.active = BuildType.LIVE;
							}
							break;
						case 43:
							Class515.aString7059 = value;
							break;
						case 25:
							Class340_Sub1.anInt9868 = Integer.parseInt(value) * 1655365583;
							break;
						case 41:
							HitMobCutsceneAction.aString9556 = value;
							break;
						case 18:
							aBool10604 = value.equalsIgnoreCase(Class60.TRUE);
							break;
						case 9:
							break;
						case 8:
							aString10609 = value;
							break;
						case 14:
							aByteArray10716 = Class180.method3548(Class26.method784(value));
							if (aByteArray10716.length < 16) {
								aByteArray10716 = null;
							}
							break;
						case 5:
							ArchiveLoader.aClass622_4521 = CompressionType.findIdentifiable(Class622.values(),
									Integer.parseInt(value));
							if (Class622.aClass622_8003 == ArchiveLoader.aClass622_4521) {
								ArchiveLoader.aClass622_4521 = Class622.aClass622_8009;
							} else if (!ArchiveLoader.aClass622_4521.method10432(Class620.aClass620_7991)
									&& Class622.aClass622_8012 != ArchiveLoader.aClass622_4521) {
								ArchiveLoader.aClass622_4521 = Class622.aClass622_8012;
							}
							break;
						case 30:
							settings = value;
							break;
						case 36:
							aBool10605 = value.equalsIgnoreCase(Class60.TRUE);
							break;
						case 37:
							anInt10607 = Integer.parseInt(value) * -118442437;
							break;
						case 21:
							aString10634 = value;
							break;
						case 27:
							if (Class177.aClass672_1992 == null) {
								Class177.aClass672_1992 = new ConnectionInfo(true);
							}
							Class177.aClass672_1992.host = value;
							break;
						case 2:
							anInt10597 = Integer.parseInt(value) * -266560335;
							break;
						case 22:
							game = GameContext.valueOf(Integer.parseInt(value));
							if (game == GameContext.RUNESCAPE) {
								Class189.aClass25_2060 = Class25.aClass25_347;
							} else {
								Class189.aClass25_2060 = Class25.aClass25_344;
							}
							break;
						case 10:
							if (value.equalsIgnoreCase(Class60.TRUE)) {

							}
							break;
						case 23:
							EquipmentDefaults.aString7549 = value;
							break;
						case 17:
							FloatRaster.anInt1244 = Integer.parseInt(value) * 1057555241;
							break;
						case 31:
							if (Class671.lobbyConnectionInfo == null) {
								Class671.lobbyConnectionInfo = new ConnectionInfo(true);
							}
							Class671.lobbyConnectionInfo.id = Integer.parseInt(value) * -212349065;
							break;
						case 40: {
							boolean bool = value.equals(Class60.TRUE);
							if (null == Class177.aClass672_1992) {
								Class177.aClass672_1992 = new ConnectionInfo(bool);
							} else {
								Class177.aClass672_1992.aBool8472 = bool;
							}
							break;
						}
						case 20:
							aBool10870 = value.equals(Class60.TRUE);
							break;
						case 34:
							string = value;
							break;
						case 26:
							if (null == Class177.aClass672_1992) {
								Class177.aClass672_1992 = new ConnectionInfo(true);
							}
							Class177.aClass672_1992.id = Integer.parseInt(value) * -212349065;
							break;
						case 24:
							if (value.equalsIgnoreCase(Class60.TRUE)) {
								isMember = true;
							}
							break;
						case 13:
							Class671.aClass672_8462 = new ConnectionInfo(false);
							Class671.aClass672_8462.id = Integer.parseInt(value) * -212349065;
							break;
						case 4:
							aBool10589 = value.equalsIgnoreCase(Class60.TRUE);
							break;
						case 28:
							Client.currentLanguage = Language.valueOf(Integer.parseInt(value));
							break;
						case 7:
							aBool10632 = value.equals(Class60.TRUE);
					}
				}
			}
			if (null == settings) {
				settings = "";
			}
			Class470 class470 = new Class470(-1936703811 * anInt10682, -73018749 * anInt10813,
					-1697120507 * anInt10753, -1373609821 * anInt10602, game.name);
			Class642_Sub3.aclient10561 = this;
			String build = BuildType.active.name;
			int i = -1060235925 * BuildType.active.value + 32;
			if (!string.equals("")) {
				build = new StringBuilder().append(build).append("_").append(string).toString();
				i = 0;
			}
			method7913(class470, game.domain, build, i, EquipmentDefaults.method9463(), 839, 1, aBool10605);
		}
	}

	@Override
	public String method7963() {
		String string = " ";
		try {
			Class553 class553 = aClass460_10760.method7679();
			string = new StringBuilder().append(string).append(class553.x * 2051316501).append(Class60.COMMA)
					.append(class553.z * -180305283).append(Class60.COMMA).append(aClass460_10760.method7680())
					.append(Class60.COMMA).append(aClass460_10760.method7707()).append(" ").toString();
			if (Client.localPlayer != null) {
				string = new StringBuilder().append(string).append(1611577177 * ProxyingVariableLoader.localPlane)
						.append(Class60.COMMA).append(2051316501 * class553.x + Client.localPlayer.pathX[0])
						.append(Class60.COMMA).append(-180305283 * class553.z + Client.localPlayer.pathZ[0])
						.append(" ").toString();
			} else {
				string = new StringBuilder().append(string).append(ProxyingVariableLoader.localPlane * 1611577177)
						.append(Class60.COMMA).append(1611577177 * ProxyingVariableLoader.localPlane)
						.append(Class60.COMMA).append(1611577177 * ProxyingVariableLoader.localPlane)
						.append(Class60.COMMA).append(" ").toString();
			}
			string = new StringBuilder().append(string).append(Class199.preferences.currentToolkit.getValue())
					.append(" ").append(Class199.preferences.antiAliasing.getValue()).append(" ")
					.append(RendererType.windowMode()).append(" ").append(1319181337 * screenWidth)
					.append(Class60.COMMA).append(-551672947 * screenHeight).append(" ").toString();
			string = new StringBuilder().append(string).append(Class199.preferences.lighting.getValue()).append(" ")
					.toString();
			string = new StringBuilder().append(string).append(Class199.preferences.sceneryShadows.getValue())
					.append(" ").toString();
			string = new StringBuilder().append(string).append(Class199.preferences.water.getValue()).append(" ")
					.toString();
			string = new StringBuilder().append(string).append(Class199.preferences.textures.getValue()).append(" ")
					.toString();
			string = new StringBuilder().append(string).append(Class199.preferences.bloom.getValue()).append(" ")
					.toString();
			string = new StringBuilder().append(string).append("0 ").toString();
			string = new StringBuilder().append(string).append(1926618523 * heapSize).append(" ").toString();
			string = new StringBuilder().append(string).append(-1501875989 * gameState).append(" ").toString();
			if (null != AsynchronousInputStream.systemInfo) {
				string = new StringBuilder().append(string)
						.append(AsynchronousInputStream.systemInfo.anInt10408 * -2033165835).toString();
			} else {
				string = new StringBuilder().append(string).append(-1).toString();
			}
			string = new StringBuilder().append(string).append(" ").toString();
			if (aString10608 != null) {
				string = new StringBuilder().append(string).append(aString10608).toString();
			} else {
				string = new StringBuilder().append(string).append(Class60.COMMA).toString();
			}
		} catch (Throwable throwable) {

		}
		return string;
	}

	void method16844() {
		boolean bool = Class364.netWorker.pulse();
		if (!bool) {
			startNetWorker();
		}
	}

	void updateNetStatus(int status) {
		Client.socket = null;
		Class338.updateConnection = null;
		updateStage = 0;
		Class364.netWorker.errors += 422659035;
		Class364.netWorker.status = 1437851503 * status;
	}

	final void method17052() {
		if (8 == gameState * -1501875989 && !Class628.method13100() || gameState * -1501875989 == 11
				&& Class31.anInt395 * 1004082977 == 42 || -1501875989 * gameState == 18
				&& (49 == Class31.anInt429 * 272722337 || Class31.anInt429 * 272722337 == 52)
				|| 6 == gameState * -1501875989) {
			if (-1420335485 * anInt10622 > 1) {
				anInt10622 -= -461596629;
				anInt10839 = 443759197 * anInt10823;
			}
			if (!Class56.menuOpen) {
				FriendsChatPlayer.method1540();
			}
			if (-1501875989 * gameState != 18 || 49 != 272722337 * Class31.anInt429
					&& 272722337 * Class31.anInt429 != 52) {
				for (int i_116_ = 0; i_116_ < 100 && Client.decodeFrame(lobbyConnection); i_116_++) {

				}
			}
		}
		PulseEvent.method9831();
		NativeMouseRecord.cacheAll();
		anInt10595 += 1052897239;
		Billboard.method6007(-1, -1, 1277578711);
		Class427.method7086(null, -1, -1);
		Class341.method5867();
		anInt10823 += -1878559865;
		for (int i_117_ = 0; i_117_ < -999337347 * anInt10862; i_117_++) {
			Npc class600_sub1_sub3_sub1_sub2 = (Npc) aClass480_Sub25Array10654[i_117_].object;
			if (null != class600_sub1_sub3_sub1_sub2) {
				byte i_118_ = class600_sub1_sub3_sub1_sub2.definition.movementCapabilities;
				if ((i_118_ & 0x1) != 0) {
					int i_119_ = class600_sub1_sub3_sub1_sub2.boundSize();
					if (0 != (i_118_ & 0x2) && 0 == 2071858351 * class600_sub1_sub3_sub1_sub2.pathLength
							&& Math.random() * 1000.0 < 10.0) {
						int i_120_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						int i_121_ = (int) Math.round(Math.random() * 10.0 - 5.0);
						if (i_120_ != 0 || i_121_ != 0) {
							int i_122_ = class600_sub1_sub3_sub1_sub2.pathX[0] + i_120_;
							int i_123_ = class600_sub1_sub3_sub1_sub2.pathZ[0] + i_121_;
							if (i_122_ < 0) {
							} else if (i_122_ > aClass460_10760.method7680() - i_119_ - 1) {
								i_122_ = aClass460_10760.method7680() - i_119_ - 1;
							}
							if (i_123_ < 0) {
							} else if (i_123_ > aClass460_10760.method7707() - i_119_ - 1) {
								i_123_ = aClass460_10760.method7707() - i_119_ - 1;
							}
						}
					}
					Class290_Sub1.method15204(class600_sub1_sub3_sub1_sub2, true);
					int i_124_ = KeyRecorder.method8899(class600_sub1_sub3_sub1_sub2);
					Class330.method5807(class600_sub1_sub3_sub1_sub2);
					IncomingFrameMeta.method6298(class600_sub1_sub3_sub1_sub2, -2018339177 * Class279.anInt3145,
							Class22.anInt322 * 1897950229, i_124_);
					Class24.method776(class600_sub1_sub3_sub1_sub2, -2018339177 * Class279.anInt3145);
					Class449.method7388(class600_sub1_sub3_sub1_sub2);
					Class395 class395 = Class395.create();
					class395.method6413(Class373.method6114(class600_sub1_sub3_sub1_sub2.yaw.value()),
							Class373.method6114(class600_sub1_sub3_sub1_sub2.pitch.value()),
							Class373.method6114(class600_sub1_sub3_sub1_sub2.roll.value()));
					class600_sub1_sub3_sub1_sub2.method10179(class395);
					class395.cache();
				}
			}
		}
		if ((0 == -1501875989 * gameState || 11 == gameState * -1501875989 || 8 == -1501875989 * gameState || -1501875989
				* gameState == 6)
				&& (!Class628.method13100() || 11 == -1501875989 * gameState && 42 == 1004082977 * Class31.anInt395 || 18 == gameState
						* -1501875989
						&& (49 == 272722337 * Class31.anInt429 || 272722337 * Class31.anInt429 == 52))
				&& !Class200.method3939()) {
			if (Connection.anInt7170 * 1212513917 == 5) {
				Client.method13191(1716125983);
			} else {
				Class51.method1136();
			}
			if (2006359481 * Client.cameraX >> 9 < 14
					|| 2006359481 * Client.cameraX >> 9 >= aClass460_10760.method7680() - 14
					|| Wall.cameraZ * 1829446257 >> 9 < 14
					|| Wall.cameraZ * 1829446257 >> 9 >= aClass460_10760.method7707() - 14) {
				aClass460_10760.method7706(new Class452(Class458.aClass458_5161, null));
			}
		}
		for (;;) {
			ScriptContext class480_sub35 = (ScriptContext) aClass644_10844.popHead();
			if (null == class480_sub35) {
				break;
			}
			Widget class226 = class480_sub35.source;
			if (class226.component * -592186295 >= 0) {
				Widget class226_125_ = Widget.lookup(class226.parent * 1920469085);
				if (class226_125_ == null || class226_125_.aClass226Array2542 == null
						|| class226.component * -592186295 >= class226_125_.aClass226Array2542.length
						|| class226_125_.aClass226Array2542[-592186295 * class226.component] != class226) {
					continue;
				}
			}
			Script.execute(class480_sub35);
		}
		for (;;) {
			ScriptContext class480_sub35 = (ScriptContext) aClass644_10897.popHead();
			if (null == class480_sub35) {
				break;
			}
			Widget class226 = class480_sub35.source;
			if (-592186295 * class226.component >= 0) {
				Widget class226_126_ = Widget.lookup(1920469085 * class226.parent);
				if (null == class226_126_ || class226_126_.aClass226Array2542 == null
						|| -592186295 * class226.component >= class226_126_.aClass226Array2542.length
						|| class226_126_.aClass226Array2542[class226.component * -592186295] != class226) {
					continue;
				}
			}
			Script.execute(class480_sub35);
		}
		for (;;) {
			ScriptContext class480_sub35 = (ScriptContext) aClass644_10843.popHead();
			if (class480_sub35 == null) {
				break;
			}
			Widget class226 = class480_sub35.source;
			if (-592186295 * class226.component >= 0) {
				Widget class226_127_ = Widget.lookup(1920469085 * class226.parent);
				if (null == class226_127_ || null == class226_127_.aClass226Array2542
						|| -592186295 * class226.component >= class226_127_.aClass226Array2542.length
						|| class226 != class226_127_.aClass226Array2542[-592186295 * class226.component]) {
					continue;
				}
			}
			Script.execute(class480_sub35);
		}
		if (null != aClass226_10801) {
			Class54.method1165();
		}
		if (tick % 15000 == 0) {
			Class334.method5817();
		}
		if (8 == gameState * -1501875989 && !Class628.method13100() || gameState * -1501875989 == 11
				&& 1004082977 * Class31.anInt395 == 42 || gameState * -1501875989 == 18
				&& (Class31.anInt429 * 272722337 == 49 || 272722337 * Class31.anInt429 == 52)
				|| 6 == gameState * -1501875989) {
			VariableBitsDefinitionLoader.method16717();
		}
		Class360.method6049();
		if (aBool10667 && gameState * -1501875989 == 8) {
			Class671.method13824();
			aBool10667 = false;
		}
		if (Class199.aClass126_Sub1_2099.aBool8692
				&& 8485778212217677161L * Class199.aClass126_Sub1_2099.aLong8687 < TimeUtil.time() - 60000L) {
			Class536.method9176();
		}

		for (FriendLoginUpdate update = (FriendLoginUpdate) friendLogins.head(); null != update; update = (FriendLoginUpdate) friendLogins
				.next()) {
			if (1856954959 * update.time < TimeUtil.time() / 1000L - 5L) {
				if (update.world > 0) {
					Class176.addChatMessage(5, 0, "", "", "",
							update.name + TranslatableString.HAS_LOGGED_IN.translate(Client.currentLanguage), null);
				} else if (update.world == 0) {
					Class176.addChatMessage(5, 0, "", "", "",
							update.name + TranslatableString.HAS_LOGGED_OUT.translate(Client.currentLanguage), null);
				}

				update.unlink();
			}
		}

		if (gameState * -1501875989 == 8 && !Class628.method13100() || 11 == -1501875989 * gameState
				&& Class31.anInt395 * 1004082977 == 42 || gameState * -1501875989 == 18
				&& (272722337 * Class31.anInt429 == 49 || 52 == Class31.anInt429 * 272722337)
				|| gameState * -1501875989 == 6) {
			if (gameState * -1501875989 != 11 && lobbyConnection.getConnection() == null) {
				Class495_Sub1.logout(false);
			} else if (null != lobbyConnection) {
				lobbyConnection.idleWritePulses += -1224738573;
				if (1834999867 * lobbyConnection.idleWritePulses > 50) {
					OutgoingFrame frame = OutgoingFrame
							.prepare(OutgoingFrameMeta.KEEP_ALIVE, lobbyConnection.encryptor);
					lobbyConnection.sendFrame(frame);
				}
				try {
					lobbyConnection.flush();
				} catch (IOException ioexception) {
					if (11 == gameState * -1501875989) {
						lobbyConnection.stopConnection();
					} else {
						Class495_Sub1.logout(false);
					}
				}
			}
		}
	}

	void startNetWorker() {
		if (289734739 * Class364.netWorker.errors > 1784558739 * previousNetErrors) {
			Class671.activeConnectionInfo.swap();
			netWorkerDelay = 1885598338 * Class364.netWorker.errors - 1792703286;

			if (1065330631 * netWorkerDelay > 3000) {
				netWorkerDelay = 37602952;
			}

			if (Class364.netWorker.errors * 289734739 >= 2 && -618373233 * Class364.netWorker.status == 6) {
				error("js5connect_outofdate");
				gameState = 2002105819;
				return;
			}

			if (289734739 * Class364.netWorker.errors >= 1 && Class364.netWorker.status * -618373233 == 48) {
				error("sessionexpired");
				gameState = 2002105819;
				return;
			}

			if (289734739 * Class364.netWorker.errors >= 4 && -618373233 * Class364.netWorker.status == -1) {
				error("js5crc", new StringBuilder().append("a=").append(Class364.netWorker.errorType * -195581297)
						.append("&g=").append(Class364.netWorker.errorFile * 290846859).toString(), 390899407);
				gameState = 2002105819;
				return;
			}

			if (289734739 * Class364.netWorker.errors >= 4 && Class455.loadingState(gameState * -1501875989)) {
				if (7 == Class364.netWorker.status * -618373233 || Class364.netWorker.status * -618373233 == 9) {
					error("js5connect_full");
				} else if (-618373233 * Class364.netWorker.status > 0) {
					if (null == proxyError) {
						error("js5connect");
					} else {
						error(new StringBuilder().append("js5proxy_").append(proxyError.trim()).toString());
					}
				} else {
					error("js5io");
				}

				gameState = 2002105819;
				return;
			}
		}

		previousNetErrors = -1155064511 * Class364.netWorker.errors;

		if (1065330631 * netWorkerDelay > 0) {
			netWorkerDelay -= 1020783095;
		} else {
			try {
				if (162136441 * updateStage == 0) {
					Client.socket = Class671.activeConnectionInfo.createSocket();
					updateStage += -1316120375;
				}
				if (1 == updateStage * 162136441) {
					Class338.updateConnection = AsynchronousConnection.create(Client.socket, 125000);
					int length = 9 + aString10608.length();
					Buffer buffer = new Buffer(length + 2);
					buffer.writeByte(HandshakeType.UPDATE.type * 1262357869);
					buffer.writeByte(length);
					buffer.writeInt(839);
					buffer.writeInt(1);
					buffer.writeCString(aString10608);
					Class338.updateConnection.write(buffer.payload, 0, length + 2);
					updateStage += -1316120375;
					Class536.aLong7311 = TimeUtil.time() * -4207866607113151429L;
				}
				if (updateStage * 162136441 == 2) {
					if (Class338.updateConnection.available(1)) {
						byte[] buffer = new byte[1];
						int response = Class338.updateConnection.read(buffer, 0, 1);

						if (buffer[0] != 0) {
							updateNetStatus(response);
							return;
						}

						updateStage += -1316120375;
					} else if (TimeUtil.time() - -7589982691380454157L * Class536.aLong7311 > 30000L) {
						updateNetStatus(1001);
						return;
					}
				}
				if (3 == 162136441 * updateStage) {
					LoadingRequirement[] requirements = LoadingRequirement.values();
					int length = requirements.length * 4;

					if (Class338.updateConnection.available(length)) {
						Buffer buffer = new Buffer(length);
						Class338.updateConnection.read(buffer.payload, 0, buffer.payload.length);

						for (LoadingRequirement requirement : requirements) {
							requirement.setSize(buffer.readInt());
						}

						boolean loggedOut = Class455.loadingState(-1501875989 * gameState)
								|| AsynchronousStreamRequest.loggedOutState(-1501875989 * gameState)
								|| Class456.lobbyState(gameState * -1501875989);

						Class364.netWorker.init(Class338.updateConnection, !loggedOut);
						Client.socket = null;
						Class338.updateConnection = null;
						updateStage = 0;
					}
				}
			} catch (IOException ioexception) {
				updateNetStatus(1002);
			}
		}
	}

	@Override
	final void method7931() {
		Frame frame = new Frame(" ");
		frame.pack();
		frame.dispose();

		Class172.aClass226_1961 = new Widget();
		Class166_Sub6.method15083();
		ByteArrayPool.init(new int[] { 20, 260, 2048, 5120, 10240, 75000, 100000, 153600 }, new int[] { 1000, 100,
				1000, 250, 500, 100, 100, 10 });

		Class397.resizeCache(100);
		Class395.setCacheSize(10);
		ComponentMouseRecord.resizeCache(100);
		NativeMouseRecord.init(100);

		if (Class622.aClass622_8012 != ArchiveLoader.aClass622_4521) {
			Class591.aByteArrayArray7833 = new byte[50][];
		}

		Class199.preferences = ScriptInstruction.method7886();
		if (Class199.preferences.aClass632_Sub33_10293.getValue() == 1) {
			Class490.aBool6740 = false;
		}

		switch (Class199.preferences.safeMode.getValue()) {
			case 4:
				Class73.aBool1107 = true;
				Class199.preferences.setValue(Class199.preferences.safeMode, 0);
				Class359.method6033(Class22.aClass22_318);
				break;
			case 3:
				Class73.aBool1108 = true;
				Class199.preferences.setValue(Class199.preferences.safeMode, 0);
				Class359.method6033(Class22.aClass22_308);
				break;
		}

		if (ArchiveLoader.aClass622_4521 == Class622.aClass622_8012) {
			Class671.aClass672_8462.host = Class454.applet.getCodeBase().getHost();
		} else if (ArchiveLoader.aClass622_4521.method10432(Class620.aClass620_7991)) {
			Class671.aClass672_8462.host = Class454.applet.getCodeBase().getHost();
			Class671.aClass672_8462.port = -1309620211 * Class671.aClass672_8462.id + 759363264;
			Class671.aClass672_8462.alternatePort = 733597859 * Class671.aClass672_8462.id + 380423312;
		} else if (ArchiveLoader.aClass622_4521 == Class622.aClass622_8003) {
			Class671.aClass672_8462.host = Class60.LOCALHOST;
			Class671.lobbyConnectionInfo.host = Class60.LOCALHOST;
			Class177.aClass672_1992.host = Class60.LOCALHOST;

			Class671.aClass672_8462.port = 759363264 + -1309620211 * Class671.aClass672_8462.id;
			Class671.aClass672_8462.alternatePort = 733597859 * Class671.aClass672_8462.id + 380423312;
		}

		ConnectionInfo.method10388();
		Class671.activeConnectionInfo = Class671.aClass672_8462;
		BefriendedPlayer.cacheWorker = new CacheResourceWorker();
		Class364.netWorker = new ConnectedResourceWorker();
		Class467.aClass432_6478 = new ParallelHttpProvider(Class177.aClass672_1992.host,
				Class177.aClass672_1992.getPort(), -1589762327 * game.id);

		if (game == GameContext.RUNESCAPE) {
			aBool10687 = false;
		}

		ObjectDefinition.aShortArray7446 = NpcDefinition.aShortArray3034 = ItemDefinition.aShortArray8265 = new short[256];
		try {
			Class198.aClipboard2096 = Client.getActiveContainer().getToolkit().getSystemClipboard();
		} catch (Exception exception) {

		}

		Class193.keyRecorder = Class497.method8673(aCanvas6501);
		Client.recorder = ComponentMouseRecorder.create(aCanvas6501, true);

		if (null != dataFile) {
			Class575.aClass507_7710 = new ResourceCache(255, dataFile, aClass656_6517, 2000000);
		}

		Class369.aClass261_Sub1_4079 = new Class261_Sub1(aClass28_10871);
		try {
			Class369.aClass261_Sub1_4079.method4806(Class272.aClass272_3007);
			Class369.aClass261_Sub1_4079.method4903(Class270.aClass270_2997, false);
			Class369.aClass261_Sub1_4079.method4889(Class257.aClass257_2848, false);
			Class369.aClass261_Sub1_4079.method4903(Class270.aClass270_2997, false);
			Class369.aClass261_Sub1_4079.method4818(Class397.create(99999.0F, 99999.0F, 99999.0F));

			Class369.aClass261_Sub1_4079.method4814(Class397.create(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY,
					Float.POSITIVE_INFINITY));
			Class369.aClass261_Sub1_4079.method4802(Class397.create(99999.0F, 99999.0F, 99999.0F));
			Class369.aClass261_Sub1_4079.method4871(Class397.create(Float.POSITIVE_INFINITY, Float.POSITIVE_INFINITY,
					Float.POSITIVE_INFINITY));
		} catch (ScriptException exception_sub3) {

		}

		Class474.init(Class454.applet, Class189.osName);
		if (ArchiveLoader.aClass622_4521 != Class622.aClass622_8012
				&& ArchiveLoader.aClass622_4521 != Class622.aClass622_8013) {
			displayFps = true;
		}

		aString6510 = TranslatableString.LOADING_PLEASE_WAIT.translate(Client.currentLanguage);
		Class237.aClass461_2622 = new Class461();
		new Thread(Class237.aClass461_2622).start();
		IsaacCipher.aClass52_8356 = new UrlResourceProvider();
	}

	@Override
	final void pulse() {
		if (9 != gameState * -1501875989) {
			if ((19 == -1501875989 * gameState || AsynchronousStreamRequest.loggedOutState(gameState * -1501875989) || Class456
					.lobbyState(-1501875989 * gameState)) && TurnMobCutsceneAction.aClass186_9434 != null) {
				TurnMobCutsceneAction.aClass186_9434.method3617(TurnMobCutsceneAction.aClass186_9434.method3614(),
						Class199.preferences.themeMusicVolume.getValue());
			}

			if (aBool10827) {
				synchronized (anObject10668) {
					anObject10668.notify();
				}

				synchronized (anObject10671) {
					try {
						anObject10671.wait();
					} catch (InterruptedException interruptedexception) {

					}
				}

				aBool10827 = false;
			}

			tick++;
			if (1 == tick % 1000) {
				GregorianCalendar calendar = new GregorianCalendar();
				Class54.anInt608 = calendar.get(11) * 600 + calendar.get(12) * 10 + calendar.get(13) / 6;
				aRandom10887.setSeed(Class54.anInt608);
			}

			long start = TimeUtil.time();
			gameConnection.recordStats();
			lobbyConnection.recordStats();
			method16844();

			if (ArchiveLoader.aClass402_4522 != null) {
				ArchiveLoader.aClass402_4522.pulse();
			}

			if (null != TurnMobCutsceneAction.aClass186_9434) {
				TurnMobCutsceneAction.aClass186_9434.method3615();
			}

			Class193.keyRecorder.flush();
			Client.recorder.submit();
			Class485.method8244(Class60.activeToolkit, start);

			if (null != Class60.activeToolkit) {
				Class60.activeToolkit.method2375((int) start);
			}

			anInt10690 = 0;
			maximumHeldKeys = 0;

			for (KeyRecord record = Class193.keyRecorder.getNext(); null != record; record = Class193.keyRecorder
					.getNext()) {
				int type = record.getType();

				if (type == 2 || type == KeyRecord.KEY_TYPED_TYPE) {
					if (1019900971 * anInt10690 < 130) {
						anInterface59Array10637[1019900971 * anInt10690] = record;
						anInt10690 += -825841021;
					}
				} else if (type == 0) {
					if (Class248.method4641() && record.getCode() == 28) {
						if (localPrivilege * 1667858447 >= 2 && Class193.keyRecorder.held(82)) {
							if (Class56.method1348()) {
								Class343_Sub2.method15447();
							} else {
								CutsceneWalk.method3507(Client.localPlayer.method140());
							}
						} else if (Class53.method1157()
								&& (Class199.preferences.aClass632_Sub28_10274.getValue() == 0 || Class193.keyRecorder
										.held(86))) {
							Class150.method3187();
						} else if (Class199.preferences.aClass632_Sub28_10274.getValue() == 0
								|| Class193.keyRecorder.held(86)) {
							Class208.method3995();
						} else {
							DefaultMapEntry.addChatMessage(TranslatableString.DEV_CONSOLE_ACCESS
									.translate(Client.currentLanguage));
						}
					}

					if (767783973 * maximumHeldKeys < 75) {
						anInterface59Array10640[maximumHeldKeys * 767783973] = record;
						maximumHeldKeys += -1601206355;
					}
				}
			}

			anInt10818 = 0;
			for (MouseRecord record = Client.recorder.nextSubmission(); record != null; record = Client.recorder
					.nextSubmission()) {
				int type = record.getClickType();
				if (-1 == type) {
					ComponentMouseRecorder.record(record);
				} else if (6 == type) {
					anInt10818 += record.getMeta() * 1026167977;
					record.cache();
				} else if (Deque.method13350(type)) {
					mouseRecords.pushBack(record);

					if (mouseRecords.size() > 10) {
						MouseRecord head = mouseRecords.popHead();
						if (null != head) {
							head.cache();
						}
					}
				}
			}

			if (Class53.method1157()) {
				Class614.method10356();
			}

			if (Class455.loadingState(gameState * -1501875989)) {
				Class642.method13248();
				Class454.method7418();
			} else if (Class53.method1161(gameState * -1501875989)) {
				aClass460_10760.method7810();
			}

			if (AsynchronousStreamRequest.loggedOutState(-1501875989 * gameState)
					&& !Class53.method1161(gameState * -1501875989)) {
				method17052();
				Class27.method787();
				Client.pulseLogin();
			} else if (Class456.lobbyState(-1501875989 * gameState) && !Class53.method1161(gameState * -1501875989)) {
				method17052();
				Client.pulseLogin();
			} else if (gameState * -1501875989 == 3) {
				Client.pulseLogin();
			} else if (BaseAnimationDefinitionProvider.method3320(-1501875989 * gameState)
					&& !Class53.method1161(gameState * -1501875989)) {
				AnimateObjectCutsceneAction.method15079();
			} else if (-1501875989 * gameState == 10 || 14 == gameState * -1501875989) {
				Client.pulseLogin();
				if (Class31.anInt395 * 1004082977 != -3 && 1004082977 * Class31.anInt395 != 2
						&& 15 != Class31.anInt395 * 1004082977) {
					if (14 == -1501875989 * gameState) {
						Class31.anInt433 = Class31.anInt436 * 2604123;
						Class31.anInt407 = Class31.anInt435 * -1180465941;
						Class31.anInt431 = Class31.anInt395 * -73502429;

						if (Client.aBool4247) {
							Class606.method10251(Class671.aClass672_8457.id * -1113605561, Class671.aClass672_8457.host);
							gameConnection.stop();
							Class536.setGameState(10);
						} else {
							Class495_Sub1.logout(Class31.aBool438);
						}
					} else {
						Class495_Sub1.logout(false);
					}
				}
			}

			Class357.method6020(Class60.activeToolkit);
			mouseRecords.popHead();
			if (null != Class60.activeToolkit) {
				Iterator iterator = aMap10908.entrySet().iterator();
				while (iterator.hasNext()) {
					Map.Entry entry = (Map.Entry) iterator.next();
					UrlResourceRequest class72 = (UrlResourceRequest) entry.getValue();
					if (class72.isComplete()) {
						byte[] is = class72.getBuffer();
						if (is != null) {
							try {
								BufferedImage image = ImageIO.read(new ByteArrayInputStream(is));
								int[] rgb = Class480_Sub32.getArgb(image);
								Sprite sprite = Class60.activeToolkit.createSprite(rgb, 0, image.getWidth(),
										image.getWidth(), image.getHeight());
								aClass168_10778.put(((Integer) entry.getKey()).intValue(), sprite);
							} catch (IOException ioexception) {
								HitsplatDefinitionProvider.reportError(Class642_Sub3.aclient10561.method7963(),
										ioexception);
							}
						}
						iterator.remove();
					}
				}
			}
		}
	}

	@Override
	final void method7933() {
		if (gameState * -1501875989 != 9) {
			long l = HitMobCutsceneAction.method15092() / 1000000L - -3581399309213626009L * aLong10614;
			aLong10614 = HitMobCutsceneAction.method15092() / 1000000L * 7638324751263038039L;

			if (ArchiveResourceProvider.method15392(gameState * -1501875989, 1994702016)) {
				if (-9170234031756484277L * aLong10788 != 0L && TimeUtil.time() > -9170234031756484277L * aLong10788) {
					Class254.method4740(RendererType.windowMode(), -1, -1, false);
				} else if (!Class60.activeToolkit.method2379() && aBool6504) {
					DecodingFontProvider.method915();
				}
			}

			if (Client.fullScreenFrame == null) {
				Container container = Client.getActiveContainer();
				int width = container.getSize().width;
				int height = container.getSize().height;

				if (container == Engine.frame) {
					Insets insets = Engine.frame.getInsets();
					width -= insets.right + insets.left;
					height -= insets.bottom + insets.top;
				}

				if (width != anInt6494 * -562696973 || height != -1308048867 * Class166_Sub15.anInt9602 || aBool10905) {
					if (Class60.activeToolkit == null || Class60.activeToolkit.method2466()) {
						Class166_Sub6.method15083();
					} else {
						anInt6494 = 2133658683 * width;
						Class166_Sub15.anInt9602 = height * 1525026869;
					}

					aLong10788 = (TimeUtil.time() + 500L) * -6630198594916147101L;
					aBool10905 = false;
				}
			}

			if (Client.supportsFullScreen && null != Client.fullScreenFrame && !HashedVariableCollection.aBool1483
					&& ArchiveResourceProvider.method15392(-1501875989 * gameState, 1994702016)) {
				Class254.method4740(Class199.preferences.screenSize.getValue(), -1, -1, false);
			}

			boolean bool = false;
			if (aBool6502) {
				aBool6502 = false;
				bool = true;
			}

			if (bool) {
				Class351.method5970();
			}

			if (null != Class60.activeToolkit && Class60.activeToolkit.method2379() || RendererType.windowMode() != 1) {
				EntityQueue.method13532();
			}

			if (Class455.loadingState(-1501875989 * gameState)) {
				PressedKeyInputSubscriber.method9182(bool);
			} else if (Class274.method5148(-1501875989 * gameState)) {
				Class49.method1113();
			} else if (PaddedResourceWorker.method7318(-1501875989 * gameState)) {
				Class49.method1113();
			} else if (Class53.method1161(-1501875989 * gameState)) {
				if (aClass460_10760.method7676() == Class447.aClass447_5065) {
					int i_2_ = aClass460_10760.method7779() / 2;
					Class62.method1382(TranslatableString.LOADING_PLEASE_WAIT.translate(Client.currentLanguage)
							+ Class60.LINE_BREAK + "(" + i_2_ + "%)", true, Class60.activeToolkit, Client.p12Full,
							Class24.p12Full);
				} else if (aClass460_10760.method7676() == Class447.aClass447_5066) {
					int i_3_ = 50 + aClass460_10760.method7678() / 2;
					Class62.method1382(
							new StringBuilder()
									.append(TranslatableString.LOADING_PLEASE_WAIT.translate(Client.currentLanguage))
									.append(Class60.LINE_BREAK).append("(").append(i_3_).append("%)").toString(), true,
							Class60.activeToolkit, Client.p12Full, Class24.p12Full);
				} else {
					Class62.method1382(TranslatableString.LOADING_PLEASE_WAIT.translate(Client.currentLanguage), true,
							Class60.activeToolkit, Client.p12Full, Class24.p12Full);
				}
			} else if (16 == gameState * -1501875989) {
				Class26.method785(l);
			} else if (10 == -1501875989 * gameState) {
				Class62.method1382(
						new StringBuilder()
								.append(TranslatableString.CONNECTION_LOST.translate(Client.currentLanguage))
								.append(Class60.LINE_BREAK)
								.append(TranslatableString.PLEASE_WAIT_REESTABLISHING.translate(Client.currentLanguage))
								.toString(), false, Class60.activeToolkit, Client.p12Full, Class24.p12Full);
			} else if (14 == gameState * -1501875989) {
				Class62.method1382(TranslatableString.PLEASE_WAIT.translate(Client.currentLanguage), false,
						Class60.activeToolkit, Client.p12Full, Class24.p12Full);
			}
			if (2114392935 * anInt10853 == 3) {
				for (int i_4_ = 0; i_4_ < anInt10848 * -573888519; i_4_++) {
					Rectangle rectangle = aRectangleArray10852[i_4_];
					if (aBoolArray10851[i_4_]) {
						Class60.activeToolkit.method2747(rectangle.x, rectangle.y, rectangle.width, rectangle.height,
								-65281);
					} else {
						Class60.activeToolkit.method2747(rectangle.x, rectangle.y, rectangle.width, rectangle.height,
								-16711936);
					}
				}
			}

			if (Class53.method1157()) {
				Class610.method10310(Class60.activeToolkit);
			}

			if (!Class455.loadingState(gameState * -1501875989) && !Class53.method1161(-1501875989 * gameState)
					&& -1 != anInt10790 * 1764783361) {
				Class60.activeToolkit.method2456();
				Class514.method8821(Class60.activeToolkit, TimeUtil.time(), 1319181337 * screenWidth, -551672947
						* screenHeight, -691153837);
				Class60.activeToolkit.method2370();
			}

			int cpu = Class199.preferences.cpu.getValue();
			if (cpu == 0) {
				Client.sleep(15L);
			} else if (cpu == 1) {
				Client.sleep(10L);
			} else if (cpu == 2) {
				Client.sleep(5L);
			} else if (3 == cpu) {
				Client.sleep(2L);
			}

			if (aBool10625) {
				Class364.sweepLoaderCaches();
			}

			if (Class199.preferences.safeMode.getValue() == 1 && gameState * -1501875989 == 0
					&& -1 != 1764783361 * anInt10790) {
				Class199.preferences.setValue(Class199.preferences.safeMode, 0);
				Client.savePreferences();
			}
		}
	}

	@Override
	final void method7934(byte i) {
		if (null != Class199.aClass126_Sub1_2099 && Class199.aClass126_Sub1_2099.aBool8692) {
			Class536.method9176();
		}
		Class293.method5402();
		Class154.method3280();
		if (Class60.activeToolkit != null) {
			Class60.activeToolkit.method2373();
		}
		if (Client.supportsFullScreen && Client.fullScreenFrame != null) {
			CharacterType.method7032(Class589.fullScreenAdapter, Client.fullScreenFrame, 517522038);
			Client.fullScreenFrame = null;
		}
		gameConnection.stopConnection();
		gameConnection.monitor.stop();
		lobbyConnection.stopConnection();
		lobbyConnection.monitor.stop();
		if (TurnMobCutsceneAction.aClass186_9434 != null) {
			TurnMobCutsceneAction.aClass186_9434.method3592(707240852);
		}
		Class364.netWorker.stop();
		Class467.aClass432_6478.shutdown();
		BefriendedPlayer.cacheWorker.stop();
		if (null != aClass588_10855) {
			aClass588_10855.method9909((byte) 38);
			aClass588_10855 = null;
		}
		try {
			Ping.quit();
		} catch (Throwable throwable) {

		}
		StereoSoundPreference.method16716();
		try {
			Client.closeLogFile();
		} catch (Exception exception) {

		}
		if (null != IsaacCipher.aClass52_8356) {
			IsaacCipher.aClass52_8356.stop();
		}
		if (aBool6506 && Class622.aClass622_8003 != ArchiveLoader.aClass622_4521) {
			Class40.method1033();
		}
	}

	static void method3938() {
		anInt10898 = 0;
		anInt10824 = 0;
		anInt10826 = 0;
		anInt10672 = 0;
		anInt10830 = 0;
		anInt10832 = 0;
		anInt10833 = 0;
		anInt10834 = 0;
		anInt10835 = 0;
		anInt10836 = 0;
		anInt10837 = 0;
		anInt10838 = 0;
		anInt10839 = 0;
		anInt10840 = 0;
		anInt10642 = 0;
	}

	public static void savePreferences() {
		DiskFile file = null;
		try {
			file = PriorityQueueIterator.getPreferences("", game.domain, true);
			Buffer buffer = Class199.preferences.encode();
			file.write(buffer.payload, 0, -165875887 * buffer.offset);
		} catch (Exception exception) {

		}

		try {
			if (file != null) {
				file.close();
			}
		} catch (Exception exception) {

		}
	}

	static final void pulseLogin() {
		if (-1087837371 * Class31.loginStep != 3 && -1087837371 * Class31.loginStep != 108) {
			do {
				try {
					int maximumTicks;
					if (Class31.loginErrors * -985357143 == 0 && -1087837371 * Class31.loginStep < 95) {
						maximumTicks = 500;
					} else {
						maximumTicks = 2000;
					}

					if (Class31.socialNetworkLogin && Class31.loginStep * -1087837371 >= 67) {
						maximumTicks = 6000;
					}

					if (203 == -1955604939 * Class31.loginType && 218 != Class31.loginStep * -1087837371
							&& 42 != Class31.anInt395 * 1004082977 || -1955604939 * Class31.loginType == 156
							&& 49 != 272722337 * Class31.anInt429 && Class31.anInt429 * 272722337 != 52) {
						Class31.loginTicks += 214235319;
					}

					if (-462723833 * Class31.loginTicks > maximumTicks) {
						Class31.activeConnection.stopConnection();
						if (-985357143 * Class31.loginErrors < 3) {
							if (203 == Class31.loginType * -1955604939) {
								Class671.activeConnectionInfo.swap();
							} else {
								Class671.lobbyConnectionInfo.swap();
							}
							Class31.loginTicks = 0;
							Class31.loginErrors += 2119450521;
							Class31.loginStep = -1782511293;
						} else {
							Class31.loginStep = -2074489177;
							HashTableIterator.method13671(-5);
							method5397();
							break;
						}
					}
					if (15 == -1087837371 * Class31.loginStep) {
						if (203 == Class31.loginType * -1955604939) {
							Class31.activeConnection.init(
									AsynchronousConnection.create(Class671.activeConnectionInfo.createSocket(), 15000),
									Class671.activeConnectionInfo.host);
						} else {
							Class31.activeConnection.init(
									AsynchronousConnection.create(Class671.lobbyConnectionInfo.createSocket(), 15000),
									Class671.lobbyConnectionInfo.host);
						}

						Class31.activeConnection.dropFrames();
						OutgoingFrame frame = OutgoingFrame.empty();
						if (Class31.socialNetworkLogin) {
							frame.payload.writeByte(1262357869 * HandshakeType.INIT_SOCIAL_GAME_CONNECTION.type);
							frame.payload.writeShort(0);
							int start = -165875887 * frame.payload.offset;
							frame.payload.writeInt(839);
							frame.payload.writeInt(1);

							if (203 == Class31.loginType * -1955604939) {
								frame.payload.writeByte(-1501875989 * gameState == 10 ? 1 : 0);
							}

							Buffer buffer = Buffer.withXtea();
							Class136_Sub1.method14579(buffer, -1420488133 * Class31.socialNetworkId);
							Class298_Sub1.aLong9722 = 2898162140060777773L * Class31.socialNetworkId;
							buffer.writeByte(-1420488133 * Class31.socialNetworkId);
							buffer.writeByte(currentLanguage.getId());
							buffer.writeInt(672060199 * affiliateId);

							for (int i_7_ = 0; i_7_ < 5; i_7_++) {
								buffer.writeInt((int) (Math.random() * 9.9999999E7));
							}

							buffer.writeLong(-1684458405106659383L * clientKey);
							buffer.writeByte(-1589762327 * game.id);
							buffer.writeByte((int) (Math.random() * 9.9999999E7));
							buffer.rsa(Class62.LOGIN_RSA_EXPONENT, Class62.LOGIN_RSA_MODULUS);
							frame.payload.writeBytes(buffer.payload, 0, buffer.offset * -165875887);
							frame.payload.writeSizeShort(frame.payload.offset * -165875887 - start, -312603079);
						} else {
							frame.payload.writeByte(HandshakeType.INIT_GAME_CONNECTION.type * 1262357869);
						}

						Class31.activeConnection.sendFrame(frame);
						Class31.activeConnection.flush();
						Class31.loginStep = -1938714898;
					}
					if (-1087837371 * Class31.loginStep == 38) {
						if (!Class31.activeConnection.getConnection().available(1)) {
							break;
						}

						Class31.activeConnection.getConnection().read(Class31.activeConnection.buffer.payload, 0, 1);
						Class31.activeConnection.buffer.offset = 0;
						int response = Class31.activeConnection.buffer.readUByte();

						if (0 != response) {
							Class31.loginStep = -2074489177;
							HashTableIterator.method13671(response);
							Class31.activeConnection.stopConnection();
							method5397();
							break;
						}

						Class31.activeConnection.buffer.offset = 0;
						if (Class31.socialNetworkLogin) {
							Class31.loginStep = 1167911536;
						} else {
							Class31.loginStep = -30643989;
						}
					}
					if (Class31.loginStep * -1087837371 == 48) {
						if (!Class31.activeConnection.getConnection().available(2)) {
							break;
						}
						Class31.activeConnection.getConnection().read(Class31.activeConnection.buffer.payload, 0, 2);
						Class31.activeConnection.buffer.offset = 0;
						Class31.activeConnection.buffer.offset = Class31.activeConnection.buffer.readUShort() * 1258142129;
						Class31.loginStep = 573741105;
					}
					if (53 == -1087837371 * Class31.loginStep) {
						if (!Class31.activeConnection.getConnection().available(
								Class31.activeConnection.buffer.offset * -165875887)) {
							break;
						}
						Class31.activeConnection.getConnection().read(Class31.activeConnection.buffer.payload, 0,
								-165875887 * Class31.activeConnection.buffer.offset);
						Class31.activeConnection.buffer.decodeXtea(Buffer.xtea);
						Class31.activeConnection.buffer.offset = 0;
						String url = Class31.activeConnection.buffer.readPrefixedString();
						Class31.activeConnection.buffer.offset = 0;
						String method = Class380.aClass380_4220.method6221();
						HitbarDefinition.openUrl(url, true, method, useJs);
						Class31.loginStep = -1948929561;
					}
					if (67 == -1087837371 * Class31.loginStep) {
						if (!Class31.activeConnection.getConnection().available(1)) {
							break;
						}
						Class31.activeConnection.getConnection().read(Class31.activeConnection.buffer.payload, 0, 1);
						if ((Class31.activeConnection.buffer.payload[0] & 0xff) == 1) {
							Class31.loginStep = -1802940619;
						}
					}
					if (-1087837371 * Class31.loginStep == 73) {
						if (!Class31.activeConnection.getConnection().available(16)) {
							break;
						}
						Class31.activeConnection.getConnection().read(Class31.activeConnection.buffer.payload, 0, 16);
						Class31.activeConnection.buffer.offset = -1344562416;
						Class31.activeConnection.buffer.decodeXtea(Buffer.xtea);
						Class31.activeConnection.buffer.offset = 0;
						Class31.accountName = Class31.activeConnection.buffer.readLong() * 5617524125832062695L;
						Class31.serverKey = Class31.activeConnection.buffer.readLong() * -2384142863413936637L;
						Class31.loginStep = -30643989;
					}
					if (87 == Class31.loginStep * -1087837371) {
						Class31.activeConnection.buffer.offset = 0;
						Class31.activeConnection.dropFrames();
						OutgoingFrame frame = OutgoingFrame.empty();
						FrameBuffer buf = frame.payload;

						if (203 == -1955604939 * Class31.loginType) {
							HandshakeType type;
							if (Class31.socialNetworkLogin) {
								type = HandshakeType.SOCIAL_LOGIN;
							} else {
								type = HandshakeType.GAME_LOGIN;
							}

							buf.writeByte(type.type * 1262357869);
							buf.writeShort(0);
							int start = buf.offset * -165875887;
							int encryptedStart = buf.offset * -165875887;

							if (!Class31.socialNetworkLogin) {
								buf.writeInt(839);
								buf.writeInt(1);
								buf.writeByte(10 == -1501875989 * gameState ? 1 : 0);
								encryptedStart = -165875887 * buf.offset;
								Buffer buffer = Buffer.forCredentials();
								buf.writeBytes(buffer.payload, 0, buffer.offset * -165875887);
								encryptedStart = -165875887 * buf.offset;
								buf.writeByte(-1L == Class31.accountName * -3559573875977646889L ? 1 : 0);

								if (-1L == -3559573875977646889L * Class31.accountName) {
									buf.writeCString(Class31.aString423);
								} else {
									buf.writeLong(-3559573875977646889L * Class31.accountName);
								}
							}

							buf.writeByte(RendererType.windowMode());
							buf.writeShort(1319181337 * Engine.screenWidth);
							buf.writeShort(-551672947 * Engine.screenHeight);
							buf.writeByte(Class199.preferences.multisample.getValue());
							Class326.readRandom(buf);
							buf.writeCString(settings);
							buf.writeInt(672060199 * affiliateId);

							Buffer preferences = Class199.preferences.encode();
							buf.writeByte(-165875887 * preferences.offset);
							buf.writeBytes(preferences.payload, 0, preferences.offset * -165875887);
							sentPreferences = true;

							Buffer system = new Buffer(AsynchronousInputStream.systemInfo.getEncodedSize());
							AsynchronousInputStream.systemInfo.encode(system);
							buf.writeBytes(system.payload, 0, system.payload.length);

							buf.writeInt(-1094887049 * anInt10657);
							buf.writeInt(anInt10597 * -1924912047);
							buf.writeInt(832706251 * anInt10596);
							buf.writeCString(EquipmentDefaults.aString7549);
							buf.writeByte(additionalInfo == null ? 0 : 1);

							if (null != additionalInfo) {
								buf.writeCString(additionalInfo);
							}

							buf.writeByte(aBool10589 ? 1 : 0);
							buf.writeByte(aBool10604 ? 1 : 0);
							buf.writeByte(FloatRaster.anInt1244 * -747091687 & 0x1);
							buf.writeInt(-1148538125 * anInt10607);
							buf.writeCString(aString10608);
							buf.writeByte(null == Class671.autoWorld
									|| Class671.activeConnectionInfo.id * -1113605561 != -1113605561
											* Class671.autoWorld.id ? 1 : 0);
							buf.writeShort(-1113605561 * Class671.lobbyConnectionInfo.id);
							buf.writeShort(Class177.aClass672_1992.id * -1113605561);
							Archive.addTableChecksums(buf);
							buf.encodeXtea(Buffer.xtea, encryptedStart, buf.offset * -165875887);
							buf.writeSizeShort(-165875887 * buf.offset - start, 634198513);
						} else {
							HandshakeType type;
							if (Class31.socialNetworkLogin) {
								type = HandshakeType.SOCIAL_LOGIN;
							} else {
								type = HandshakeType.LOBBY_LOGIN;
							}

							buf.writeByte(type.type * 1262357869);
							buf.writeShort(0);
							int start = -165875887 * buf.offset;
							int encryptedStart = -165875887 * buf.offset;

							if (!Class31.socialNetworkLogin) {
								buf.writeInt(839);
								buf.writeInt(1);
								Buffer buffer = Buffer.forCredentials();
								buf.writeBytes(buffer.payload, 0, -165875887 * buffer.offset);
								encryptedStart = -165875887 * buf.offset;
								buf.writeByte(Class31.accountName * -3559573875977646889L == -1L ? 1 : 0);

								if (-3559573875977646889L * Class31.accountName == -1L) {
									buf.writeCString(Class31.aString423);
								} else {
									buf.writeLong(Class31.accountName * -3559573875977646889L);
								}
							}

							buf.writeByte(-1589762327 * game.id);
							buf.writeByte(currentLanguage.getId());
							buf.writeByte(RendererType.windowMode());
							buf.writeShort(Engine.screenWidth * 1319181337);
							buf.writeShort(Engine.screenHeight * -551672947);
							buf.writeByte(Class199.preferences.multisample.getValue());
							Class326.readRandom(buf);
							buf.writeCString(settings);
							Buffer buffer = Class199.preferences.encode();
							buf.writeByte(-165875887 * buffer.offset);
							buf.writeBytes(buffer.payload, 0, -165875887 * buffer.offset);
							Buffer system = new Buffer(AsynchronousInputStream.systemInfo.getEncodedSize());
							AsynchronousInputStream.systemInfo.encode(system);
							buf.writeBytes(system.payload, 0, system.payload.length);
							buf.writeInt(-1094887049 * anInt10657);
							buf.writeCString(EquipmentDefaults.aString7549);
							buf.writeInt(672060199 * affiliateId);
							buf.writeInt(-1148538125 * anInt10607);
							buf.writeCString(aString10608);
							buf.writeByte(FloatRaster.anInt1244 * -747091687 & 0x1);
							Archive.addTableChecksums(buf);
							buf.encodeXtea(Buffer.xtea, encryptedStart, buf.offset * -165875887);
							buf.writeSizeShort(-165875887 * buf.offset - start, -4171232);
						}

						Class31.activeConnection.sendFrame(frame);
						Class31.activeConnection.flush();
						Class31.activeConnection.encryptor = new IsaacCipher(Buffer.xtea);

						for (int index = 0; index < 4; index++) {
							Buffer.xtea[index] += 50;
						}

						Class31.activeConnection.decryptor = new IsaacCipher(Buffer.xtea);
						new IsaacCipher(Buffer.xtea);
						Class31.activeConnection.buffer.setCipher(Class31.activeConnection.decryptor);
						Buffer.xtea = null;
						Class31.loginStep = 1595663699;
					}
					if (95 == Class31.loginStep * -1087837371) {
						if (!Class31.activeConnection.getConnection().available(1)) {
							break;
						}
						Class31.activeConnection.getConnection().read(Class31.activeConnection.buffer.payload, 0, 1);
						int response = Class31.activeConnection.buffer.readUByte();
						Class31.activeConnection.buffer.offset = 0;
						if (response == 21) {
							Class31.loginStep = -1229199514;
						} else {
							if (1 == response) {
								Class31.loginStep = -1667166340;
								HashTableIterator.method13671(response);
								break;
							}
							if (response == 52) {
								CutsceneObject.anInt1945 = 510399771 * response;
								Class31.loginStep = 1846782931;
							} else if (response == 2) {
								if (Class31.aBool440) {
									Class31.aBool440 = false;
									Class31.loginStep = -1782511293;
									break;
								}
								if (-1955604939 * Class31.loginType == 203) {
									Class199.aClass126_Sub1_2099.method14032();
									Class31.loginStep = 1242397837;
								} else {
									Class31.loginStep = -2125562492;
								}
							} else if (15 == response) {
								Class31.activeConnection.currentFrameSize = 1729881874;
								Class31.loginStep = -1405832445;
							} else {
								if (23 == response && Class31.loginErrors * -985357143 < 3) {
									Class31.loginTicks = 0;
									Class31.loginErrors += 2119450521;
									Class31.loginStep = -1782511293;
									Class31.activeConnection.stopConnection();
									break;
								}
								if (response == 42) {
									Class31.loginStep = -1854013934;
									HashTableIterator.method13671(response);
									break;
								}
								if (Class31.loginType * -1955604939 == 156 && response == 49
										&& gameState * -1501875989 != 3) {
									if (52 != 272722337 * Class31.anInt429) {
										HashTableIterator.method13671(response);
									}
									break;
								}
								if (Class31.aBool394 && !Class31.socialNetworkLogin
										&& -1 != Class31.socialNetworkId * -1420488133 && 35 == response) {
									Class31.socialNetworkLogin = true;
									Class31.loginTicks = 0;
									Class31.loginStep = -1782511293;
									Class31.activeConnection.stopConnection();
									break;
								}
								if (53 == response) {
									Class31.loginStep = -1124069224;
								} else {
									Class31.loginStep = -2074489177;
									HashTableIterator.method13671(response);
									Class31.activeConnection.stopConnection();
									method5397();
									break;
								}
							}
						}
					}
					if (Class31.loginStep * -1087837371 == 126) {
						if (Class31.activeConnection.getConnection().available(1)) {
							Class31.activeConnection.getConnection()
									.read(Class31.activeConnection.buffer.payload, 0, 1);
							int response = Class31.activeConnection.buffer.payload[0] & 0xff;
							Class31.anInt388 = 1416138878 * response;
							Class31.loginStep = -2074489177;
							HashTableIterator.method13671(21);
							Class31.activeConnection.stopConnection();
							method5397();
						}
					} else if (Class31.loginStep * -1087837371 == 218) {
						if (Class31.activeConnection.getConnection().available(2)) {
							Class31.activeConnection.getConnection()
									.read(Class31.activeConnection.buffer.payload, 0, 2);
							Class31.anInt437 = -688924491
									* ((Class31.activeConnection.buffer.payload[1] & 0xff) + ((Class31.activeConnection.buffer.payload[0] & 0xff) << 8));
							Class31.loginStep = 1595663699;
						}
					} else if (248 == Class31.loginStep * -1087837371) {
						if (Class31.activeConnection.getConnection().available(4)) {
							Class31.activeConnection.getConnection()
									.read(Class31.activeConnection.buffer.payload, 0, 4);
							Class31.anInt439 = Class31.activeConnection.buffer.readInt() * -1500437203;
							Class31.activeConnection.buffer.offset = 0;
							Class31.loginStep = -2074489177;
							HashTableIterator.method13671(53);
							Class31.activeConnection.stopConnection();
							method5397();
						}
					} else if (196 == -1087837371 * Class31.loginStep) {
						if (29 == CutsceneObject.anInt1945 * -1391903469) {
							if (!Class31.activeConnection.getConnection().available(1)) {
								break;
							}
							Class31.activeConnection.getConnection()
									.read(Class31.activeConnection.buffer.payload, 0, 1);
							Class31.anInt436 = -2091473183 * (Class31.activeConnection.buffer.payload[0] & 0xff);
						} else if (45 == CutsceneObject.anInt1945 * -1391903469) {
							if (!Class31.activeConnection.getConnection().available(3)) {
								break;
							}

							Class31.activeConnection.getConnection()
									.read(Class31.activeConnection.buffer.payload, 0, 3);
							Class31.anInt436 = (Class31.activeConnection.buffer.payload[0] & 0xff) * -2091473183;
							Class31.anInt435 = 1600689111 * ((Class31.activeConnection.buffer.payload[2] & 0xff) + ((Class31.activeConnection.buffer.payload[1] & 0xff) << 8));
						} else {
							throw new IllegalStateException();
						}

						Class31.loginStep = -2074489177;
						HashTableIterator.method13671(CutsceneObject.anInt1945 * -1391903469);
						Class31.activeConnection.stopConnection();
						method5397();

						if (Class456.lobbyState(gameState * -1501875989)) {
							Class495_Sub1.logout(true);
							Class31.anInt395 = -562499149 * CutsceneObject.anInt1945;
						}
					} else if (Class31.loginStep * -1087837371 == 223) {
						if (Class31.activeConnection.getConnection().available(2)) {
							Class31.activeConnection.getConnection()
									.read(Class31.activeConnection.buffer.payload, 0, 2);
							Class31.activeConnection.buffer.offset = 0;
							LoadingRequirement.anInt223 = Class31.activeConnection.buffer.readUShort() * -2000807591;
							Class31.activeConnection.buffer.offset = 0;
							Class31.loginStep = -821876677;
						}
					} else if (-1087837371 * Class31.loginStep == 231) {
						if (Class31.activeConnection.getConnection()
								.available(LoadingRequirement.anInt223 * 1900453609)) {
							Class31.activeConnection.getConnection().read(Class31.activeConnection.buffer.payload, 0,
									LoadingRequirement.anInt223 * 1900453609);
							Class31.activeConnection.buffer.offset = 0;
							byte[] is = new byte[1900453609 * LoadingRequirement.anInt223 + 1];
							Class31.activeConnection.buffer.readEncrypted(is, 0,
									1900453609 * LoadingRequirement.anInt223);
							Class31.activeConnection.buffer.offset = 0;
							Buffer buffer = new Buffer(is);
							String string = buffer.readString();
							TranslatableString.openJsUrl(string, true, useJs);
							HashTableIterator.method13671(CutsceneObject.anInt1945 * -1391903469);
							if (Class31.loginType * -1955604939 == 156 && gameState * -1501875989 != 3) {
								Class31.loginStep = 1595663699;
							} else {
								Class31.loginStep = -2074489177;
								Class31.activeConnection.stopConnection();
								method5397();
							}
						}
					} else {
						if (257 == -1087837371 * Class31.loginStep) {
							if (!Class31.activeConnection.getConnection().available(2)) {
								break;
							}
							Class31.activeConnection.getConnection()
									.read(Class31.activeConnection.buffer.payload, 0, 2);
							Class31.activeConnection.buffer.offset = 0;
							Class31.activeConnection.currentFrameSize = Class31.activeConnection.buffer.readUShort() * 1282542711;
							Class31.loginStep = -832091340;
						}
						if (260 == -1087837371 * Class31.loginStep) {
							if (!Class31.activeConnection.getConnection().available(
									-842560185 * Class31.activeConnection.currentFrameSize)) {
								break;
							}
							Class31.activeConnection.getConnection().read(Class31.activeConnection.buffer.payload, 0,
									-842560185 * Class31.activeConnection.currentFrameSize);
							Class31.activeConnection.buffer.offset = 0;
							boolean bool = Class31.activeConnection.buffer.readUByte() == 1;
							while (-165875887 * Class31.activeConnection.buffer.offset < Class31.activeConnection.currentFrameSize
									* -842560185) {
								DefaultMapEntry entry = Class630.aClass77_Sub1_Sub1_8060
										.method13918(Class31.activeConnection.buffer);
								Class199.aClass126_Sub1_2099.map.put(1960527763 * entry.key, entry.value);
							}
							if (bool) {
								OutgoingFrame frame = OutgoingFrame.empty();
								FrameBuffer buffer = frame.payload;
								buffer.writeByte(1262357869 * HandshakeType.aClass352_3715.type);
								Class31.activeConnection.sendFrame(frame);
								Class31.activeConnection.flush();
								Class31.loginStep = 1137267547;
							} else {
								Class31.loginStep = 1242397837;
							}
						}
						if (135 == -1087837371 * Class31.loginStep) {
							if (!Class31.activeConnection.getConnection().available(1)) {
								break;
							}
							Class31.activeConnection.getConnection()
									.read(Class31.activeConnection.buffer.payload, 0, 1);
							int i_19_ = Class31.activeConnection.buffer.payload[0] & 0xff;
							if (2 != i_19_) {
								if (29 == i_19_ || i_19_ == 45) {
									CutsceneObject.anInt1945 = i_19_ * 510399771;
									Class31.loginStep = -957650956;
								} else {
									Class31.loginStep = -2074489177;
									HashTableIterator.method13671(i_19_);
									Class31.activeConnection.stopConnection();
									method5397();
									if (Class456.lobbyState(-1501875989 * gameState)) {
										Class495_Sub1.logout(true);
										Class31.anInt395 = 1410936033 * i_19_;
									}
									break;
								}
								break;
							}
							Class31.loginStep = -2125562492;
						}
						if (Class31.loginStep * -1087837371 == 148) {
							if (!Class31.activeConnection.getConnection().available(1)) {
								break;
							}
							Class31.activeConnection.getConnection()
									.read(Class31.activeConnection.buffer.payload, 0, 1);
							Class252.accountInfoSize = (Class31.activeConnection.buffer.payload[0] & 0xff) * 1476833971;
							Class31.loginStep = 240904569;
						}
						if (-1087837371 * Class31.loginStep == 157) {
							FrameBuffer buffer = Class31.activeConnection.buffer;
							if (-1955604939 * Class31.loginType == 203) {
								if (!Class31.activeConnection.getConnection().available(
										-891728773 * Class252.accountInfoSize)) {
									break;
								}

								Class31.activeConnection.getConnection().read(buffer.payload, 0,
										Class252.accountInfoSize * -891728773);
								buffer.offset = 0;
								Class566.method9574(buffer);
								localPrivilege = buffer.readUByte() * -1042977041;
								anInt10764 = buffer.readUByte() * 334322021;
								aBool10765 = buffer.readUByte() == 1;
								aBool10766 = buffer.readUByte() == 1;
								aBool10767 = buffer.readUByte() == 1;
								aBool10769 = buffer.readUByte() == 1;
								localPlayerIndex = buffer.readUShort() * -5857073;
								isMember = buffer.readUByte() == 1;
								Class452.anInt5091 = buffer.readTriByte() * -280899085;
								membersWorld = buffer.readUByte() == 1;
								Class515.aString7059 = buffer.readString();
								ParameterDefinition.remainingSubscription = (buffer.read48() - TimeUtil.time()) * 2974644632008040357L;
								aClass460_10760.getObjectLoader().setMembers(membersWorld);
								Class237.aClass461_2622.method7827().getObjectLoader().setMembers(membersWorld);
								ItemDefinition.loader.setMembersServer(membersWorld);
								NpcDefinition.loader.setMembers(membersWorld);
							} else {
								if (!Class31.activeConnection.getConnection().available(
										-891728773 * Class252.accountInfoSize)) {
									break;
								}
								Class31.activeConnection.getConnection().read(buffer.payload, 0,
										Class252.accountInfoSize * -891728773);
								buffer.offset = 0;
								Class566.method9574(buffer);
								localPrivilege = buffer.readUByte() * -1042977041;
								anInt10764 = buffer.readUByte() * 334322021;
								aBool10765 = buffer.readUByte() == 1;
								Class452.anInt5091 = buffer.readTriByte() * -280899085;
								localPlayer.gender = (byte) buffer.readUByte();
								aBool10766 = buffer.readUByte() == 1;
								aBool10767 = buffer.readUByte() == 1;
								Class679.subscriptionExpiration = buffer.readLong() * 7823018641254040749L;
								ParameterDefinition.remainingSubscription = (3919361711412166437L
										* Class679.subscriptionExpiration - TimeUtil.time() - buffer.read40()) * 2974644632008040357L;
								int membershipAttributes = buffer.readUByte();
								isMember = (membershipAttributes & 0x1) != 0;
								Class548.activeSubscription = 0 != (membershipAttributes & 0x2);
								Class122.anInt1470 = buffer.readInt() * -1756115605;
								Class277.anInt3125 = buffer.readInt() * -1722738031;
								Class481.recoverySetDate = buffer.readUShort() * -2078333665;
								ShaderMetaBuffer.unreadMessages = buffer.readUShort() * -1803303919;
								Class664.lastLoginDate = buffer.readUShort() * -1436530657;
								LibraryLoader.lastIpAddress = buffer.readInt() * -545289281;
								Class551.identifier = new HostNameIdentifier(LibraryLoader.lastIpAddress * 1819960383);
								new Thread(Class551.identifier).start();
								Class191.emailStatus = buffer.readUByte() * -1373172785;
								SoundEffectsVolumeNormaliser.anInt1937 = buffer.readUShort() * -1461954735;
								Class671.anInt8465 = buffer.readUShort() * -622240749;
								PaddedResourceWorker.aBool5033 = buffer.readUByte() == 1;
								localPlayer.accountName = localPlayer.displayName = ContainerDecodingException.localDisplayName = buffer
										.readPrefixedString();
								Class272.anInt3009 = buffer.readUByte() * -1381351627;
								AsynchronousOutputStream.anInt7300 = buffer.readInt() * 1088216063;
								Class671.autoWorld = new ConnectionInfo(false);
								Class671.autoWorld.id = buffer.readUShort() * -212349065;

								if (65535 == -1113605561 * Class671.autoWorld.id) {
									Class671.autoWorld.id = 212349065;
								}

								Class671.autoWorld.host = buffer.readPrefixedString();
								if (Class622.aClass622_8012 != ArchiveLoader.aClass622_4521) {
									Class671.autoWorld.port = -1309620211 * Class671.autoWorld.id + 759363264;
									Class671.autoWorld.alternatePort = 380423312 + 733597859 * Class671.autoWorld.id;
								}

								if (Class622.aClass622_8003 != ArchiveLoader.aClass622_4521
										&& (Class622.aClass622_8008 != ArchiveLoader.aClass622_4521 || localPrivilege * 1667858447 < 2)
										&& Class671.activeConnectionInfo.equals(Class671.aClass672_8462)) {
									useAutoWorld();
								}
							}
							if (aBool10765 && !aBool10767 || isMember) {
								try {
									JavascriptUtils.call(Class454.applet, "zap");
								} catch (Throwable throwable) {
									if (aBool10590) {
										try {
											Class454.applet.getAppletContext().showDocument(
													new URL(Class454.applet.getCodeBase(), "blank.ws"), "tbi");
										} catch (Exception exception) {

										}
									}
								}
							} else {
								try {
									JavascriptUtils.call(Class454.applet, "unzap");
								} catch (Throwable throwable) {

								}
							}
							if (Class622.aClass622_8012 == ArchiveLoader.aClass622_4521) {
								Class380.aClass380_4212.method6225();
							}
							if (203 == -1955604939 * Class31.loginType) {
								Class31.loginStep = -61287978;
							} else {
								Class31.loginStep = -2074489177;
								HashTableIterator.method13671(2);
								HeldKeyInputSubscriber.method9417();
								Class536.setGameState(8);
								Class31.activeConnection.currentFrame = null;
								break;
							}
						}
						if (174 == Class31.loginStep * -1087837371) {
							if (!Class31.activeConnection.getConnection().available(3)) {
								break;
							}
							Class31.activeConnection.getConnection()
									.read(Class31.activeConnection.buffer.payload, 0, 3);
							Class31.loginStep = 84700964;
						}
						if (180 == Class31.loginStep * -1087837371) {
							FrameBuffer buffer = Class31.activeConnection.buffer;
							buffer.offset = 0;
							if (buffer.nextIsSmart()) {
								if (!Class31.activeConnection.getConnection().available(1)) {
									break;
								}
								Class31.activeConnection.getConnection().read(buffer.payload, 3, 1);
							}
							Class31.activeConnection.currentFrame = IncomingFrameMeta.values()[buffer
									.readEncryptedSmart()];
							Class31.activeConnection.currentFrameSize = buffer.readUShort() * 1282542711;
							Class31.loginStep = -207276920;
						}
						if (Class31.loginStep * -1087837371 == 168) {
							if (Class31.activeConnection.getConnection().available(
									Class31.activeConnection.currentFrameSize * -842560185)) {
								Class31.activeConnection.getConnection().read(Class31.activeConnection.buffer.payload,
										0, -842560185 * Class31.activeConnection.currentFrameSize);
								Class31.activeConnection.buffer.offset = 0;

								int size = Class31.activeConnection.currentFrameSize * -842560185;
								Class31.loginStep = -2074489177;
								HashTableIterator.method13671(2);
								Class506.method8737();

								Player.decodePlayerInfo(Class31.activeConnection.buffer);
								int remaining = size - Class31.activeConnection.buffer.offset * -165875887;

								FrameBuffer buffer = new FrameBuffer(remaining);
								System.arraycopy(Class31.activeConnection.buffer.payload,
										Class31.activeConnection.buffer.offset * -165875887, buffer.payload, 0,
										remaining);

								Class31.activeConnection.buffer.offset += remaining * 1258142129;
								if (IncomingFrameMeta.CONSTRUCTED_MAP_AREA == Class31.activeConnection.currentFrame) {
									aClass460_10760.method7706(new Class452(Class458.CONSTRUCTED, buffer));
								} else {
									aClass460_10760.method7706(new Class452(Class458.aClass458_5154, buffer));
								}

								if (-165875887 * Class31.activeConnection.buffer.offset != size) {
									throw new RuntimeException(new StringBuilder()
											.append(-165875887 * Class31.activeConnection.buffer.offset).append(" ")
											.append(size).toString());
								}
								Class31.activeConnection.currentFrame = null;
							}
						} else {
							if (207 != Class31.loginStep * -1087837371) {
								break;
							}
							if (-842560185 * Class31.activeConnection.currentFrameSize == -2) {
								if (!Class31.activeConnection.getConnection().available(2)) {
									break;
								}
								Class31.activeConnection.getConnection().read(Class31.activeConnection.buffer.payload,
										0, 2);
								Class31.activeConnection.buffer.offset = 0;
								Class31.activeConnection.currentFrameSize = Class31.activeConnection.buffer
										.readUShort() * 1282542711;
							}
							if (Class31.activeConnection.getConnection().available(
									-842560185 * Class31.activeConnection.currentFrameSize)) {
								Class31.activeConnection.getConnection().read(Class31.activeConnection.buffer.payload,
										0, Class31.activeConnection.currentFrameSize * -842560185);
								Class31.activeConnection.buffer.offset = 0;
								int i_23_ = -842560185 * Class31.activeConnection.currentFrameSize;
								Class31.loginStep = -2074489177;
								HashTableIterator.method13671(15);
								CutsceneAction.method3408();
								Player.decodePlayerInfo(Class31.activeConnection.buffer);
								if (i_23_ != -165875887 * Class31.activeConnection.buffer.offset) {
									throw new RuntimeException(new StringBuilder()
											.append(-165875887 * Class31.activeConnection.buffer.offset).append(" ")
											.append(i_23_).toString());
								}
								Class31.activeConnection.currentFrame = null;
							}
						}
					}
				} catch (IOException ioexception) {
					Class31.activeConnection.stopConnection();
					if (Class31.loginErrors * -985357143 < 3) {
						if (203 == -1955604939 * Class31.loginType) {
							Class671.activeConnectionInfo.swap();
						} else {
							Class671.lobbyConnectionInfo.swap();
						}
						Class31.loginTicks = 0;
						Class31.loginErrors += 2119450521;
						Class31.loginStep = -1782511293;
					} else {
						Class31.loginStep = -2074489177;
						HashTableIterator.method13671(-4);
						method5397();
					}
					break;
				}
				break;
			} while (false);
		}
	}

	public static final void removeIgnore(String name) {
		if (name != null) {
			String filtered = Interface.filterName(name, Class189.aClass25_2060);
			if (null != filtered) {
				for (int index = 0; index < -1127325433 * ignoredPlayerCount; index++) {
					IgnoredPlayer player = ignoredPlayers[index];
					String otherName = player.name;
					String other = Interface.filterName(otherName, Class189.aClass25_2060);

					if (Class140.equalNames(name, filtered, otherName, other)) {
						ignoredPlayerCount -= 682441911;

						for (int i = index; i < ignoredPlayerCount * -1127325433; i++) {
							ignoredPlayers[i] = ignoredPlayers[1 + i];
						}

						anInt10834 = 822603117 * anInt10823;
						BufferedConnectionContext connection = getActiveConnection();
						OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.REMOVE_IGNORED_USER,
								connection.encryptor);
						frame.payload.writeByte(Buffer.encodedStringLength(name));
						frame.payload.writeCString(name);
						connection.sendFrame(frame);
						break;
					}
				}
			}
		}
	}

	static final void pulseChat() {
		int[] indices = Class80.playerIndices;
		for (int index = 0; index < -1784886003 * Class80.playerCount; index++) {
			Player player = players[indices[index]];
			if (null != player) {
				player.pulseChat();
			}
		}

		for (int i_2_ = 0; i_2_ < npcCount * 1746328619; i_2_++) {
			long index = npcIndices[i_2_];
			LinkableObject<Npc> linkable = npcs.get(index);

			if (null != linkable) {
				linkable.object.pulseChat();
			}
		}

		if (cutsceneStage * 2087248539 == 1) {
			for (CutsceneMob mob : CutsceneMob.mobs) {
				if (mob.initialised) {
					mob.getMob().pulseChat();
				}
			}
		}
	}

	public static final void method14088(boolean keepCaches) {
		if (!keepCaches) {
			OverlayDefinition.loader.reset();
			UnderlayDefinition.loader.reset();
			IdentikitDefinition.loader.reset();
			aClass460_10760.getObjectLoader().reset();
			NpcDefinition.loader.reset();
			ItemDefinition.loader.reset();
			AnimationDefinition.loader.reset();
			GraphicDefinition.loader.reset();
			VariableBitsDefinition.loader.reset();
			BaseVariableParameterDefinition.aClass77_Sub1_Sub2_3726.clear();
			Npc.varpLoader.clear();
			Class501.aClass77_Sub1_Sub1_6903.clear();
			Class184.aClass77_Sub1_Sub1_2006.clear();
			SunDefinition.aClass77_Sub1_Sub1_2846.clear();
			ProxyingVariableLoader.aClass678_Sub6_3003.reset();
			MapSceneDefinition.loader.reset();
			Queue.aClass678_Sub8_8139.reset();
			ParameterDefinition.loader.reset();
			SkyboxDefinition.loader.reset();
			SunDefinition.loader.reset();
			Class457.aClass678_Sub21_5151.reset();
			CursorDefinition.loader.reset();
			HitsplatDefinition.loader.reset();
			HitbarDefinition.loader.reset();
			ArchiveBillboardsLoader.method6008();
			Class678_Sub6.method16730();
			Class509.aClass374_6997.clear();
			Class23.method751();
			if (Class622.aClass622_8012 != ArchiveLoader.aClass622_4521) {
				for (int i_11_ = 0; i_11_ < Class591.aByteArrayArray7833.length; i_11_++) {
					Class591.aByteArrayArray7833[i_11_] = null;
				}
				anInt10617 = 0;
			}
			aClass460_10760.method7690().clearCaches();
			Class474.method8101();
			Class60.method1371();
			ParticleProducerDefinition.loader.clearCache();
			Class274.aClass364_3093.clearCache();
			Class626.aClass168_8035.clear();
			aClass168_10883.clear();
			aClass168_10649.clear();
			Class56.aClass168_617.clear();
			aClass168_10778.clear();
		}

		Script.method9352();
		Class283.method5268();
	}

	static final boolean decodeFrame(BufferedConnectionContext connection) {
		boolean decoded;
		try {
			decoded = Class570.decodeFrame(connection);
		} catch (IOException ioexception) {
			if (11 == -1501875989 * gameState) {
				connection.stop();
				return false;
			}
			dropConnection();
			return true;
		} catch (Exception exception) {
			Class553 class553 = aClass460_10760.method7679();
			String error = new StringBuilder()
					.append(connection.currentFrame != null ? connection.currentFrame.opcode * -1401090315 : -1)
					.append(Class60.COMMA)
					.append(connection.secondLastFrame != null ? -1401090315 * connection.secondLastFrame.opcode : -1)
					.append(Class60.COMMA)
					.append(null != connection.thirdLastFrame ? connection.thirdLastFrame.opcode * -1401090315 : -1)
					.append(" ").append(connection.currentFrameSize * -842560185).append(Class60.COMMA)
					.append(localPlayer.pathX[0] + class553.x * 2051316501).append(Class60.COMMA)
					.append(localPlayer.pathZ[0] + class553.z * -180305283).append(" ").toString();
			for (int index = 0; index < connection.currentFrameSize * -842560185 && index < 50; index++) {
				error = new StringBuilder().append(error).append(connection.buffer.payload[index])
						.append(Class60.COMMA).toString();
			}

			HitsplatDefinitionProvider.reportError(error, exception);
			Class495_Sub1.logout(false);
			return true;
		}

		return decoded;
	}

	public static boolean characterIsDigit(char c) {
		return c >= '0' && c <= '9';
	}

	static final void dropConnection() {
		if (Class456.lobbyState(-1501875989 * gameState)
				|| AsynchronousStreamRequest.loggedOutState(gameState * -1501875989)) {
			Class495_Sub1.logout(false);
		} else {
			Class615.gameConnection = gameConnection.getConnection();
			gameConnection.stop();
			Class536.setGameState(10);
		}
	}

	static boolean openUrl(String string, int type) {
		return openUrl(string, type, "openjs");
	}

	public static void getVitalImageIndices(Archive images) {
		Client.hintHeadiconsIndex = images.index("hint_headicons") * 1575908191;
		Client.hintMapmarkersIndex = images.index("hint_mapmarkers") * -1908961083;
		Deque.mapflagIndex = images.index("mapflag") * 1543622279;
		Class179.crossIndex = images.index("cross") * -2105155717;
		Client.mapDotsIndex = images.index("mapdots") * 798187087;
		Class619.nameIconsIndex = images.index("name_icons") * 1107066405;
		Class572.floorShadowsIndex = images.index("floorshadows") * -1712031495;
		Drawable.compassIndex = images.index("compass") * 1694557721;
		Client.otherLevelIndex = images.index("otherlevel") * -1069161153;
		Client.hintMapEdgeIndex = images.index("hint_mapedge") * 2042246171;
	}

	static Container getActiveContainer() {
		if (null != Client.fullScreenFrame) {
			return Client.fullScreenFrame;
		} else if (Engine.frame != null) {
			return Engine.frame;
		}

		return Class454.applet;
	}

	public static void useAutoWorld() {
		if (-1 != Class671.autoWorld.id * -1113605561) {
			Class606.method10251(-1113605561 * Class671.autoWorld.id, Class671.autoWorld.host);
		}
	}

	static final void teleport(int plane, int x, int z) {
		String command = new StringBuilder().append("tele ").append(plane).append(Class60.COMMA).append(x >> 6)
				.append(Class60.COMMA).append(z >> 6).append(Class60.COMMA).append(x & 0x3f).append(Class60.COMMA)
				.append(z & 0x3f).toString();

		System.out.println(command);
		processConsoleCommand(command, true, false);
	}

	public static void resetRecordEncoders() {
		ComponentMouseRecord.encoder.reset();
		NativeMouseRecord.encoder.reset();
		Class597.aLong7841 = -6316292173340227821L;
		Class597.aBool7843 = true;
	}

	static void method5397() {
		int i = -1501875989 * gameState;
		if (11 == i || i == 17) {
			if (lobbyConnection.getConnection() == null) {
				Class536.setGameState(18);
			} else {
				Class536.setGameState(8);
			}
		} else if (18 == gameState * -1501875989 || 15 == -1501875989 * gameState) {
			Class536.setGameState(0);
		} else if (3 == gameState * -1501875989) {
			Class536.setGameState(0);
		}
	}

	public static void method5440(String string, String string_5_, String string_6_, boolean bool, int i) {
		if (string.length() <= 320 && unconnected()) {
			Class614.method10354();
			Class31.aString423 = string;
			Class31.accountPassword = string_5_;
			Class31.aString405 = string_6_;
			Class31.aBool426 = bool;
			Class536.setGameState(15);
		}
	}

	static String method15279(long l) {
		return TimeZoneUtils.format(new Date(l), "EEE dd-MMM-yyyy HH:mm:ss zzz");
	}

	static void clearPlayers() {
		Class80.playerCount = 0;
		for (int index = 0; index < 2048; index++) {
			Class80.playerAppearanceBuffers[index] = null;
			Class80.aClass480_Sub17Array1160[index] = null;
			Class80.playerMovementSpeeds[index] = MovementType.WALKING.id;
			GlobalPlayer.globals[index] = null;
		}
	}

	static String throwableToString(Throwable throwable) throws IOException {
		String string;
		if (throwable instanceof ContainerDecodingException) {
			ContainerDecodingException exception = (ContainerDecodingException) throwable;
			string = new StringBuilder().append(exception.message).append(" | ").toString();
			throwable = exception.cause;
		} else {
			string = "";
		}

		StringWriter writer = new StringWriter();
		PrintWriter printer = new PrintWriter(writer);
		throwable.printStackTrace(printer);
		printer.close();
		String stackTrace = writer.toString();
		BufferedReader reader = new BufferedReader(new StringReader(stackTrace));
		String first = reader.readLine();

		for (;;) {
			String line = reader.readLine();
			if (null == line) {
				break;
			}

			int paren = line.indexOf('(');
			int end = line.indexOf(')', 1 + paren);
			String start;

			if (-1 != paren) {
				start = line.substring(0, paren);
			} else {
				start = line;
			}

			start = start.trim();
			start = start.substring(start.lastIndexOf(' ') + 1);
			start = start.substring(start.lastIndexOf('\t') + 1);
			string = new StringBuilder().append(string).append(start).toString();

			if (paren != -1 && -1 != end) {
				int java = line.indexOf(".java:", paren);

				if (java >= 0) {
					string = new StringBuilder().append(string).append(line.substring(5 + java, end)).toString();
				}
			}

			string = new StringBuilder().append(string).append(' ').toString();
		}

		string = new StringBuilder().append(string).append("| ").append(first).toString();
		return string;
	}

	static final void printError(String string) {
		System.out.println("Error: " + Class600_Sub1_Sub4.method17914(string, "%0a", "\n"));
	}

	public static void processConsoleCommand(String command, boolean automatic, boolean retainText) {
		do {
			try {
				if (command.equalsIgnoreCase("commands") || command.equalsIgnoreCase("help")) {
					CutsceneMob.printConsoleMessage("commands - This command");
					CutsceneMob.printConsoleMessage("cls - Clear console");
					CutsceneMob.printConsoleMessage("displayfps - Toggle FPS and other information");
					CutsceneMob.printConsoleMessage("renderer - Print graphics renderer information");
					CutsceneMob.printConsoleMessage("heap - Print java memory information");
					CutsceneMob
							.printConsoleMessage("getcamerapos - Print location and direction of camera for use in bug reports");
				} else if (command.equalsIgnoreCase("cls")) {
					Class65.anInt1003 = 0;
					Class65.anInt1002 = 0;
				} else if (command.equalsIgnoreCase("displayfps")) {
					displayFps = !displayFps;
					if (displayFps) {
						CutsceneMob.printConsoleMessage("FPS on");
					} else {
						CutsceneMob.printConsoleMessage("FPS off");
					}
				} else if (command.equals("renderer")) {
					RendererType info = Class60.activeToolkit.renderer();
					CutsceneMob.printConsoleMessage(new StringBuilder().append("Toolkit ID: ")
							.append(Class199.preferences.currentToolkit.getValue()).toString());
					CutsceneMob.printConsoleMessage(new StringBuilder().append("Vendor: ")
							.append(info.vendor * -1979234319).toString());
					CutsceneMob.printConsoleMessage(new StringBuilder().append("Name: ").append(info.name).toString());
					CutsceneMob.printConsoleMessage(new StringBuilder().append("Version: ")
							.append(info.version * -1579132595).toString());
					CutsceneMob.printConsoleMessage(new StringBuilder().append("Device: ").append(info.device)
							.toString());
					CutsceneMob.printConsoleMessage(new StringBuilder().append("Driver Version: ")
							.append(5948376926536753019L * info.driver).toString());
					String message = Class60.activeToolkit.method2388();
					if (message.length() > 0) {
						CutsceneMob.printConsoleMessage(message);
					}
				} else if (command.equals("heap")) {
					CutsceneMob.printConsoleMessage(new StringBuilder().append("Heap: ")
							.append(1926618523 * Engine.heapSize).append("MB").toString());
				} else if (command.equalsIgnoreCase("getcamerapos")) {
					Class553 class553 = aClass460_10760.method7679();
					if (3 == Connection.anInt7170 * 1212513917) {
						Class397 class397 = Class369.aClass261_Sub1_4079.method4859();
						Class397 class397_3_ = Class369.aClass261_Sub1_4079.method4840();

						CutsceneMob.printConsoleMessage("Pos: "
								+ new Class553(localPlayer.plane, (int) class397.x >> 9, (int) class397.z >> 9)
								+ " Height: "
								+ Class279.getAverageHeight((int) class397.x - (class553.x * 2051316501 << 9),
										(int) class397.z - (class553.z * -180305283 << 9), localPlayer.plane)
								+ (int) class397.y);

						CutsceneMob.printConsoleMessage("Look: "
								+ new Class553(localPlayer.plane, (int) class397_3_.x >> 9, (int) class397_3_.z >> 9)
								+ " Height: "
								+ Class279.getAverageHeight((int) class397_3_.x - (class553.x * 2051316501 << 9),
										(int) class397.z - (class553.z * -180305283 << 9), localPlayer.plane)
								+ (int) class397.y);
					} else {
						CutsceneMob.printConsoleMessage("Pos: "
								+ localPlayer.plane
								+ ","
								+ (class553.x * 2051316501 + (2006359481 * cameraX >> 9) >> 6)
								+ ","
								+ (class553.z * -180305283 + (1829446257 * Wall.cameraZ >> 9) >> 6)
								+ ","
								+ (2051316501 * class553.x + (2006359481 * cameraX >> 9) & 0x3f)
								+ ","
								+ (Wall.cameraZ * 1829446257 >> 9)
								+ (-180305283 * class553.z & 0x3f)
								+ " Height: "
								+ (Class279.getAverageHeight(2006359481 * cameraX, Wall.cameraZ * 1829446257,
										localPlayer.plane) - 1525233901 * Class268.cameraY));
						CutsceneMob.printConsoleMessage(new StringBuilder()
								.append("Look: ")
								.append(localPlayer.plane)
								.append(",")
								.append(2051316501 * class553.x + ComponentKeyRecord.cameraViewX * 189552401 >> 6)
								.append(",")
								.append(-355425889 * Class51.cameraViewZ + -180305283 * class553.z >> 6)
								.append(",")
								.append(ComponentKeyRecord.cameraViewX * 189552401 + class553.x * 2051316501 & 0x3f)
								.append(",")
								.append(-180305283 * class553.z + Class51.cameraViewZ * -355425889 & 0x3f)
								.append(" Height: ")
								.append(Class279.getAverageHeight(ComponentKeyRecord.cameraViewX * 189552401,
										Class51.cameraViewZ * -355425889, localPlayer.plane)
										- 1314358423
										* Preference.cameraViewY).toString());
					}
				} else if (command.equalsIgnoreCase("cam_shake_test")) {
					Class480_Sub31_Sub19_Sub2 class480_sub31_sub19_sub2 = new Class480_Sub31_Sub19_Sub2(0,
							Class255.aClass255_2832, Class373.method6114(125), 2.0F);
					Class369.aClass261_Sub1_4079.method4826(class480_sub31_sub19_sub2);
				} else {
					if (!command.equalsIgnoreCase("cam_shake_reset")) {
						break;
					}
					Class369.aClass261_Sub1_4079.reset();
				}
			} catch (Exception exception) {
				CutsceneMob.printConsoleMessage(TranslatableString.COMMAND_EXEC_ERROR.translate(currentLanguage));
			}
			return;
		} while (false);

		if (Class622.aClass622_8012 != ArchiveLoader.aClass622_4521 || 1667858447 * localPrivilege >= 2) {
			try {
				if (command.equalsIgnoreCase("wm1")) {
					Class254.method4740(1, -1, -1, false);
					if (RendererType.windowMode() == 1) {
						CutsceneMob.printConsoleMessage("Success");
					} else {
						CutsceneMob.printConsoleMessage("Failure");
					}
					return;
				}
				if (command.equalsIgnoreCase("wm2")) {
					Class254.method4740(2, -1, -1, false);
					if (RendererType.windowMode() == 2) {
						CutsceneMob.printConsoleMessage("Success");
					} else {
						CutsceneMob.printConsoleMessage("Failure");
					}
					return;
				}
				if (Client.supportsFullScreen && command.equalsIgnoreCase("wm3")) {
					Class254.method4740(3, 1024, 768, false);
					if (RendererType.windowMode() == 3) {
						CutsceneMob.printConsoleMessage("Success");
					} else {
						CutsceneMob.printConsoleMessage("Failure");
					}
					return;
				}
				if (command.startsWith("setlobby ")) {
					if (-1501875989 * gameState != 0) {
						CutsceneMob.printConsoleMessage("Failure");
					} else {
						int prefix = -1;
						command = command.substring(9);
						int lobby = command.indexOf(' ');

						if (-1 == lobby) {
							CutsceneMob.printConsoleMessage("Failure");
						} else {
							try {
								prefix = Integer.parseInt(command.substring(0, lobby));
							} catch (NumberFormatException numberformatexception) {

							}

							if (prefix == -1) {
								CutsceneMob.printConsoleMessage("Failure");
							} else {
								String host = new StringBuilder().append(command.substring(1 + lobby).trim())
										.append(".runescape.com").toString();
								Class340.method5859(host, prefix);
								CutsceneMob.printConsoleMessage("Success");
							}
						}
					}
					return;
				}
				if (command.startsWith("setmediastream ")) {
					if (-1501875989 * gameState != 0) {
						CutsceneMob.printConsoleMessage("Failure");
					} else {
						int id = -1;
						command = command.substring(15);
						int lobby = command.indexOf(' ');
						if (-1 == lobby) {
							CutsceneMob.printConsoleMessage("Failure");
						} else {
							try {
								id = Integer.parseInt(command.substring(0, lobby));
							} catch (NumberFormatException numberformatexception) {

							}
							if (id == -1) {
								CutsceneMob.printConsoleMessage("Failure");
							} else {
								String host = command.substring(lobby + 1).trim() + ".runescape.com";
								Class241.method4579(host, id);
								Class467.aClass432_6478.setHost(Class177.aClass672_1992.host,
										Class177.aClass672_1992.getPort());
								ArchiveLoader.aClass402_4522.reset();
								CutsceneMob.printConsoleMessage("Success");
							}
						}
					}

					return;
				}
				if (command.equalsIgnoreCase("tk0")) {
					ChecksumTableEntry.method6355(0, false);
					if (Class199.preferences.currentToolkit.getValue() == 0) {
						CutsceneMob.printConsoleMessage("Success");
						Class199.preferences.setValue(Class199.preferences.desiredToolkit, 0);
						Client.savePreferences();
						sentPreferences = false;
					} else {
						CutsceneMob.printConsoleMessage("Failure");
					}
					return;
				}
				if (command.equalsIgnoreCase("tk1")) {
					ChecksumTableEntry.method6355(1, false);
					if (Class199.preferences.currentToolkit.getValue() == 1) {
						CutsceneMob.printConsoleMessage("Success");
						Class199.preferences.setValue(Class199.preferences.desiredToolkit, 1);
						Client.savePreferences();
						sentPreferences = false;
					} else {
						CutsceneMob.printConsoleMessage("Failure");
					}
					return;
				}
				if (command.equalsIgnoreCase("tk3")) {
					ChecksumTableEntry.method6355(3, false);
					if (Class199.preferences.currentToolkit.getValue() == 3) {
						CutsceneMob.printConsoleMessage("Success");
						Class199.preferences.setValue(Class199.preferences.desiredToolkit, 3);
						Client.savePreferences();
						sentPreferences = false;
					} else {
						CutsceneMob.printConsoleMessage("Failure");
					}
					return;
				}
				if (command.equalsIgnoreCase("tk5")) {
					ChecksumTableEntry.method6355(5, false);
					if (Class199.preferences.currentToolkit.getValue() == 5) {
						CutsceneMob.printConsoleMessage("Success");
						Class199.preferences.setValue(Class199.preferences.desiredToolkit, 5);
						Client.savePreferences();
						sentPreferences = false;
					} else {
						CutsceneMob.printConsoleMessage("Failure");
					}
					return;
				}
				if (command.equalsIgnoreCase("clientdrop")) {
					if (-1501875989 * gameState == 16) {
						Client.dropConnection();
					} else if (13 == gameState * -1501875989) {
						gameConnection.error = true;
					}
					return;
				}
				if (command.equalsIgnoreCase("breakcon")) {
					BufferedConnectionContext[] contexts = connectionContexts;
					for (BufferedConnectionContext context : contexts) {
						if (context.getConnection() != null) {
							context.getConnection().close();
						}
					}
					Class364.netWorker.close();
					return;
				}
				if (command.startsWith("getclientvarpbit")) {
					int id = Integer.parseInt(command.substring(17));
					CutsceneMob.printConsoleMessage("varpbit="
							+ PlayerVariableProvider.instance.getVarbit(PlayerVariableProvider.instance.getVarbit(id)));
					return;
				}
				if (command.startsWith("getclientvarp")) {
					int id = Integer.parseInt(command.substring(14));
					CutsceneMob.printConsoleMessage("varp="
							+ PlayerVariableProvider.instance.getVarp(PlayerVariableProvider.instance.getVarp(
									VarpType.PLAYER, id)));
					return;
				}
				if (command.startsWith("directlogin")) {
					String[] strings = Class374.splitString(command.substring(12), ' ');
					if (2 == strings.length || strings.length == 3) {
						if (Class628.method13100()) {
							Class364.method6081();
						}
						Client.method5440(strings[0], strings[1], strings.length > 2 ? strings[2] : "", true, 578917002);
					}
					return;
				}
				if (command.startsWith("snlogin ")) {
					String[] strings = Class374.splitString(command.substring(8), ' ');
					int id = Integer.parseInt(strings[0]);
					String string_14_ = strings.length > 1 ? strings[1] : "";
					Billboard.socialNetworkLogin(id, string_14_, true);
					return;
				}
				if (command.startsWith("setoutput ")) {
					File file = new File(command.substring(10));
					if (file.exists()) {
						file = new File(command.substring(10) + "." + TimeUtil.time() + ".log");
						if (file.exists()) {
							CutsceneMob.printConsoleMessage("file already exists!");
							return;
						}
					}

					if (IgnoredPlayer.logFile != null) {
						IgnoredPlayer.logFile.close();
						IgnoredPlayer.logFile = null;
					}
					try {
						IgnoredPlayer.logFile = new FileOutputStream(file);
					} catch (FileNotFoundException ex) {
						CutsceneMob.printConsoleMessage("Could not create " + file.getName());
					} catch (SecurityException ex) {
						CutsceneMob.printConsoleMessage("Cannot write to " + file.getName());
					}
					return;
				}
				if (command.equals("closeoutput")) {
					if (IgnoredPlayer.logFile != null) {
						IgnoredPlayer.logFile.close();
					}
					IgnoredPlayer.logFile = null;
					return;
				}
				if (command.startsWith("runscript ")) {
					File file = new File(command.substring(10));
					if (!file.exists()) {
						CutsceneMob.printConsoleMessage("No such file");
						return;
					}

					byte[] data = BaseVariableParameterDefinition.readFileBytes(file);
					if (null == data) {
						CutsceneMob.printConsoleMessage("Failed to read file");
						return;
					}

					String[] script = Class374.splitString(Class368.replaceChar(Class26.decodeString(data), '\r', ""),
							'\n');
					Class359.executeConsoleScript(script);
				}

				if (-1501875989 * gameState == 16 || 8 == gameState * -1501875989) {
					BufferedConnectionContext connection = getActiveConnection();
					OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.CLIENT_CHEAT, connection.encryptor);
					frame.payload.writeByte(command.length() + 3);
					frame.payload.writeByte(automatic ? 1 : 0);
					frame.payload.writeByte(retainText ? 1 : 0);
					frame.payload.writeCString(command);
					connection.sendFrame(frame);
				}
			} catch (Exception exception) {
				CutsceneMob.printConsoleMessage(TranslatableString.COMMAND_EXEC_ERROR.translate(currentLanguage));
				return;
			}
		}

		if (gameState * -1501875989 != 16 && 8 != gameState * -1501875989) {
			CutsceneMob.printConsoleMessage(TranslatableString.UNKNOWN_COMMAND.translate(currentLanguage) + command);
		}
	}

	public static Frame getBestFrame(FullScreenAdapter adapter, int width, int height, int bitDepth, int refreshRate) {
		if (0 == bitDepth) {
			DisplayProperties[] displays = DisplayProperties.getAll(adapter);
			if (displays == null) {
				return null;
			}

			boolean found = false;
			for (DisplayProperties display : displays) {
				if (width == 1967400213 * display.width && height == display.height * -150744351
						&& (refreshRate == 0 || refreshRate == 285304267 * display.refreshRate)
						&& (!found || 951692249 * display.bitDepth > bitDepth)) {
					bitDepth = display.bitDepth * 951692249;
					found = true;
				}
			}

			if (!found) {
				return null;
			}
		}

		Frame frame = new Frame("Jagex Full Screen");
		frame.setResizable(false);
		adapter.enable(frame, width, height, bitDepth, refreshRate);
		return frame;
	}

	static void createRandom() {
		try {
			File file = new File(Class60.USER_HOME, "random.dat");
			if (file.exists()) {
				Engine.random = new BufferedFile(new DiskFile(file, "rw", 25L), 24, 0);
			} else {
				while_36_: for (int i_1_ = 0; i_1_ < Class281_Sub1_Sub1.aStringArray11041.length; i_1_++) {
					for (int i_2_ = 0; i_2_ < ResourceProvider.cacheDirectories.length; i_2_++) {
						File file_3_ = new File(new StringBuilder().append(ResourceProvider.cacheDirectories[i_2_])
								.append(Class281_Sub1_Sub1.aStringArray11041[i_1_]).append(File.separatorChar)
								.append("random.dat").toString());
						if (file_3_.exists()) {
							Engine.random = new BufferedFile(new DiskFile(file_3_, "rw", 25L), 24, 0);
							break while_36_;
						}
					}
				}
			}
			if (Engine.random == null) {
				RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
				int i_4_ = randomaccessfile.read();
				randomaccessfile.seek(0L);
				randomaccessfile.write(i_4_);
				randomaccessfile.seek(0L);
				randomaccessfile.close();
				Engine.random = new BufferedFile(new DiskFile(file, "rw", 25L), 24, 0);
			}
		} catch (IOException ioexception) {

		}
	}

	static void closeLogFile() {
		if (IgnoredPlayer.logFile != null) {
			try {
				IgnoredPlayer.logFile.close();
			} catch (IOException ioexception) {

			}
		}
		IgnoredPlayer.logFile = null;
	}

	public static final void ignorePlayer(String string, boolean bool) {
		int count = isMember ? 400 : 100;
		if (string != null) {
			if (-1127325433 * ignoredPlayerCount >= count) {
				Class632_Sub11.addUnnamedMessage(4,
						isMember ? TranslatableString.FULL_IGNORE_LIST_MEMBERS.translate(currentLanguage)
								: TranslatableString.FULL_IGNORE_LIST_FREE.translate(currentLanguage));
			} else {
				String filtered = Interface.filterName(string, Class189.aClass25_2060);
				if (null != filtered) {
					for (int index = 0; index < -1127325433 * ignoredPlayerCount; index++) {
						IgnoredPlayer ignored = ignoredPlayers[index];

						String filteredOther = Interface.filterName(ignored.name, Class189.aClass25_2060);
						if (filteredOther != null && filteredOther.equals(filtered)) {
							Class632_Sub11.addUnnamedMessage(4,
									string + TranslatableString.ALREADY_IGNORED.translate(currentLanguage));
							return;
						}

						if (ignored.aString668 != null) {
							String string_9_ = Interface.filterName(ignored.aString668, Class189.aClass25_2060);
							if (string_9_ != null && string_9_.equals(filtered)) {
								Class632_Sub11.addUnnamedMessage(4,
										string + TranslatableString.ALREADY_IGNORED.translate(currentLanguage));
								return;
							}
						}
					}

					for (int index = 0; index < friendCount * -1763746795; index++) {
						BefriendedPlayer friend = friends[index];
						String string_11_ = Interface.filterName(friend.name, Class189.aClass25_2060);

						if (null != string_11_ && string_11_.equals(filtered)) {
							Class632_Sub11.addUnnamedMessage(4,
									TranslatableString.PLEASE_REMOVE_FRIEND.translate(currentLanguage) + string
											+ TranslatableString.FROM_FRIEND_LIST_FIRST.translate(currentLanguage));
							return;
						}

						if (friend.aString566 != null) {
							String string_12_ = Interface.filterName(friend.aString566, Class189.aClass25_2060);
							if (string_12_ != null && string_12_.equals(filtered)) {
								Class632_Sub11.addUnnamedMessage(4,
										TranslatableString.PLEASE_REMOVE_FRIEND.translate(currentLanguage) + string
												+ TranslatableString.FROM_FRIEND_LIST_FIRST.translate(currentLanguage));
								return;
							}
						}
					}
					if (Interface.filterName(localPlayer.accountName, Class189.aClass25_2060).equals(filtered)) {
						Class632_Sub11.addUnnamedMessage(4,
								TranslatableString.CANT_IGNORE_SELF.translate(currentLanguage));
					} else {
						BufferedConnectionContext connection = getActiveConnection();
						OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.IGNORE_PLAYER,
								connection.encryptor);
						frame.payload.writeByte(Buffer.encodedStringLength(string) + 1);
						frame.payload.writeCString(string);
						frame.payload.writeByte(bool ? 1 : 0);
						connection.sendFrame(frame);
					}
				}
			}
		}
	}

	static final void method13392(int i) {
		anIntArray10746 = new int[i];
		anIntArray10747 = new int[i];
		anIntArray10748 = new int[i];
		anIntArray10749 = new int[i];
		anIntArray10750 = new int[i];
	}

	public static String decodeBase64Url(byte[] buffer) {
		return toBase64Url(buffer, 0, buffer.length);
	}

	public static BufferedConnectionContext getActiveConnection() {
		if (Class456.lobbyState(gameState * -1501875989) || -1501875989 * gameState == 6) {
			return lobbyConnection;
		}

		return gameConnection;
	}

	static String toBase64Url(byte[] buffer, int offset, int length) {
		StringBuilder builder = new StringBuilder();

		for (int index = offset; index < length + offset; index += 3) {
			int current = buffer[index] & 0xff;
			builder.append(Class614.BASE_64_URLSAFE[current >>> 2]);

			if (index < length - 1) {
				int i_13_ = buffer[1 + index] & 0xff;
				builder.append(Class614.BASE_64_URLSAFE[(current & 0x3) << 4 | i_13_ >>> 4]);

				if (index < length - 2) {
					int i_14_ = buffer[index + 2] & 0xff;
					builder.append(Class614.BASE_64_URLSAFE[(i_13_ & 0xf) << 2 | i_14_ >>> 6]).append(
							Class614.BASE_64_URLSAFE[i_14_ & 0x3f]);
				} else {
					builder.append(Class614.BASE_64_URLSAFE[(i_13_ & 0xf) << 2]).append('=');
				}
			} else {
				builder.append(Class614.BASE_64_URLSAFE[(current & 0x3) << 4]).append('=').append('=');
			}
		}

		return builder.toString();
	}

	public static boolean hasNativeProvider() {
		return null != nativeProvider;
	}

	public static int loadRequiredFiles() {
		if (0 == Class391.loadingStage * -1554833429) {
			LoadingRequirement.jaclib.setLoader(new LibraryLoader("jaclib"));
			if (LoadingRequirement.jaclib.getLoader().completion() != 100) {
				return 1;
			}

			if (!((LibraryLoader) LoadingRequirement.jaclib.getLoader()).hasLoaded() && !Class185.method3582()) {
				try {
					Class642_Sub3.aclient10561.method7937();
					IncomingFrameMeta.method6297();
					Ping.init();
				} catch (NativeLibraryLoadException ex) {
					TimeUtil.method4149(Class16.aClass16_280, ex.name, ex.code * -238348111, ex.getCause());
				} catch (Throwable throwable) {

				}
			}

			Class391.loadingStage = 1963987139;
		}

		if (1 == -1554833429 * Class391.loadingStage) {
			Class391.LOADING_REQUIREMENTS = LoadingRequirement.values();
			LoadingRequirement.defaults.setLoader(new ArchiveLoader(Class22.defaults));
			LoadingRequirement.jaggl.setLoader(new LibraryLoader("jaggl"));
			LibraryLoader jagdx = new LibraryLoader("jagdx");

			if (!Class189.osName.startsWith("win")) {
				jagdx.setLoaded();
			}

			LoadingRequirement.jagdx.setLoader(jagdx);
			LoadingRequirement.sw3d.setLoader(new LibraryLoader("sw3d"));
			LoadingRequirement.hw3d.setLoader(new LibraryLoader("hw3d"));
			LoadingRequirement.shaders.setLoader(new ArchiveLoader(Class54.shaders));
			LoadingRequirement.textureDefs.setLoader(new ArchiveLoader(ValueType.textureDefinitions));
			LoadingRequirement.config.setLoader(new ArchiveLoader(Class350.config));
			LoadingRequirement.objects.setLoader(new ArchiveLoader(Class51.objects));
			LoadingRequirement.enumerations.setLoader(new ArchiveLoader(Class285.enumerations));
			LoadingRequirement.npcs.setLoader(new ArchiveLoader(ResourceProvider.npcs));
			LoadingRequirement.items.setLoader(new ArchiveLoader(Class215.items));
			LoadingRequirement.animations.setLoader(new ArchiveLoader(TranslatableString.animations));
			LoadingRequirement.graphics.setLoader(new ArchiveLoader(Ground.graphics));
			LoadingRequirement.varbits.setLoader(new ArchiveLoader(Class501.varbits));
			LoadingRequirement.quickChat.setLoader(new ArchiveLoader(quickChat));
			LoadingRequirement.restrictedQuickChat.setLoader(new ArchiveLoader(Class337.restrictedQuickChat));
			LoadingRequirement.particles.setLoader(new ArchiveLoader(Class23.particles));
			LoadingRequirement.billboards.setLoader(new ArchiveLoader(Billboard.billboards));
			LoadingRequirement.huffman.setLoader(new ArchiveFileLoader(ClientVarpType.huffman, "huffman"));
			LoadingRequirement.widgets.setLoader(new ArchiveLoader(Class671.widgets));
			LoadingRequirement.scripts.setLoader(new ArchiveLoader(Script.scripts));
			LoadingRequirement.fonts.setLoader(new ArchiveLoader(Class80.fonts));
			LoadingRequirement.worldMap.setLoader(new ArchiveChildLoader(DequeIterator.worldMapInfo, 0));

			for (LoadingRequirement requirement : Class391.LOADING_REQUIREMENTS) {
				if (requirement.getLoader() == null) {
					throw new RuntimeException();
				}
			}

			int loaded = 0;
			for (LoadingRequirement requirement : Class391.LOADING_REQUIREMENTS) {
				int size = requirement.getSize();
				int percentage = requirement.getLoader().completion();
				loaded += size * percentage / 100;
			}

			Class391.preloadSize = loaded * -803039831;
			Class391.loadingStage = -366993018;
		}

		if (Class391.LOADING_REQUIREMENTS == null) {
			return 100;
		}

		int total = 0;
		int loaded = 0;
		boolean finished = true;

		for (LoadingRequirement requirement : Class391.LOADING_REQUIREMENTS) {
			int size = requirement.getSize();
			int percentage = requirement.getLoader().completion();
			if (percentage < 100) {
				finished = false;
			}
			total += size;
			loaded += percentage * size / 100;
		}

		if (finished) {
			Class391.LOADING_REQUIREMENTS = null;
		}

		loaded -= Class391.preloadSize * -1867719015;
		total -= Class391.preloadSize * -1867719015;

		int percentage = total > 0 ? 100 * loaded / total : 100;
		if (!finished && percentage > 99) {
			percentage = 99;
		}

		return percentage;
	}

}