package com.jagex;

import jaclib.nanotime.QueryPerformanceCounter;

import java.applet.Applet;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Rectangle;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.net.URL;

public abstract class Engine implements Interface56, Runnable, FocusListener, WindowListener {
	static boolean aBool6486;
	static long refreshRate = -2568875359935658752L;
	public static int anInt6488 = 0;
	public static int anInt6489 = 0;
	static final int anInt6490 = 1048576;
	static final int anInt6491 = 32;
	static long aLong6492;
	static long[] aLongArray6493;
	protected static int anInt6494;
	static int anInt6495;
	public static int screenHeight;
	static final long aLong6497 = 3221225472L;
	public static int anInt6498;
	public static int anInt6499;
	public static int anInt6500;
	public static Canvas aCanvas6501;
	protected static volatile boolean aBool6502;
	static int anInt6503;
	protected static volatile boolean aBool6504;
	static volatile long aLong6505;
	protected static boolean aBool6506;
	protected static BufferedFile random;
	public static Class467 aClass467_6508;
	static final String MAIN_CACHE_DATA_NAME = "main_file_cache.dat2";
	protected static String aString6510;
	static final int anInt6511 = 1;
	public static int screenWidth;
	static final String RANDOM_FILE_NAME = "random.dat";
	static long[] aLongArray6515 = new long[32];
	protected static BufferedFile dataFile;
	protected static BufferedFile aClass656_6517;
	static final String MAIN_CACHE_INDEX_PREFIX = "main_file_cache.idx";
	static final int anInt6519 = 0;
	static final String REFERENCE_TABLE_NAME = "main_file_cache.idx255";
	static Class465 aClass465_6521;
	static final String READ_WRITE_ACCESS = "rw";
	static volatile boolean aBool6523;
	public static int heapSize;
	public static int processorCount;
	static int anInt6527;
	static {
		aLongArray6493 = new long[32];
		anInt6498 = 0;
		anInt6499 = 0;
		aString6510 = null;
		aBool6502 = true;
		anInt6503 = -1043826236;
		aBool6504 = false;
		aLong6505 = 0L;
		aBool6506 = false;
		aBool6523 = true;
		random = null;
		dataFile = null;
		aClass656_6517 = null;
		aClass465_6521 = null;
		aLong6492 = 0L;
		aBool6486 = false;
		heapSize = 376356717;
		processorCount = -1954331449;
	}

	public static void method8026(boolean bool) {
		Class199.preferences.setValue(Class199.preferences.removeRoofs, 1);
		Class199.preferences.setValue(Class199.preferences.aClass632_Sub22_10284, 1);
		Class199.preferences.setValue(Class199.preferences.groundDecoration, 0);
		Class199.preferences.setValue(Class199.preferences.fog, 0);
		Class199.preferences.setValue(Class199.preferences.groundBlending, 0);
		Class199.preferences.setValue(Class199.preferences.idleAnimations, 0);
		Class199.preferences.setValue(Class199.preferences.flickeringEffects, 0);
		Class199.preferences.setValue(Class199.preferences.mobShadows, 0);
		Class199.preferences.setValue(Class199.preferences.sceneryShadows, 0);
		Class199.preferences.setValue(Class199.preferences.textures, 0);
		Class199.preferences.setValue(Class199.preferences.lighting, 0);
		Class199.preferences.setValue(Class199.preferences.water, 0);
		Class199.preferences.setValue(Class199.preferences.antiAliasing, 0);
		Class199.preferences.setValue(Class199.preferences.multisample, 0);
		Class199.preferences.setValue(Class199.preferences.particles, 0);
		Class199.preferences.setValue(Class199.preferences.buildArea, MapSize.STANDARD.type * 1283574337);
		Class199.preferences.setValue(Class199.preferences.bloom, 0);
		if (null != Class60.activeToolkit && Class60.activeToolkit.method2688() && Class60.activeToolkit.method2496()) {
			Class60.activeToolkit.method2495();
		}
		Class199.preferences.setValue(Class199.preferences.skyboxes, 0);
		Class199.preferences.setValue(Class199.preferences.aClass632_Sub11_10264, 0);
		TurnMobCutsceneAction.resetCpuPreference();
		Class199.preferences.setValue(Class199.preferences.maxScreenSize, 2);
		Class199.preferences.setValue(Class199.preferences.graphics, 1);
		PreferenceManager.method744();
		Client.aClass460_10760.method7690().method9709();
		Client.aBool10905 = true;
	}

	boolean aBool6512;

	boolean aBool6524 = false;
	protected static Frame frame;

	Engine() {
		aBool6512 = false;
	}

	@Override
	public void destroy() {
		if (!aBool6486) {
			aLong6492 = TimeUtil.time() * -2874151345834495863L;
			Client.sleep(5000L);
			method7927(false);
		}
	}

	@Override
	public final void focusGained(FocusEvent focusevent) {
		aBool6523 = true;
		aBool6502 = true;
	}

	@Override
	public final void focusLost(FocusEvent focusevent) {
		aBool6523 = false;
	}

	@Override
	public abstract void init();

	public void method7937() throws NativeLibraryLoadException {
		if (!aBool6512) {
			Client.getNativeProvider().load("jaclib");

			try {
				QueryPerformanceCounter.init();
			} catch (Throwable throwable) {
				if (Class189.osName.startsWith("win")) {
					throw new NativeLibraryLoadException(128, "jaclib");
				}
			}

			aBool6512 = true;
		}
	}

	@Override
	public final synchronized void paint(Graphics graphics) {
		if (!aBool6486) {
			aBool6502 = true;
			if (TimeUtil.time() - -2101706498435639235L * aLong6505 > 1000L) {
				Rectangle rectangle = graphics.getClipBounds();
				if (rectangle == null || rectangle.width >= -562696973 * anInt6494
						&& rectangle.height >= -1308048867 * Class166_Sub15.anInt9602) {
					aBool6504 = true;
				}
			}
		}
	}

	@Override
	public void run() {
		do {
			try {
				try {
					method7926();
				} catch (ThreadDeath death) {
					throw death;
				} catch (Throwable throwable) {
					HitsplatDefinitionProvider.reportError(method7963(), throwable);
					error("crash");
					method7927(true);
					break;
				}
				method7927(true);
			} catch (Exception object) {
				method7927(true);
			}
		} while (false);
	}

	@Override
	public void start() {
		if (!aBool6486) {
			aLong6492 = 0L;
		}
	}

	@Override
	public void stop() {
		if (!aBool6486) {
			aLong6492 = (TimeUtil.time() + 4000L) * -2874151345834495863L;
		}
	}

	@Override
	public void supplyApplet(Applet applet) {
		Class454.applet = applet;
	}

	@Override
	public final void update(Graphics graphics) {
		paint(graphics);
	}

	@Override
	public final void windowActivated(WindowEvent windowevent) {

	}

	@Override
	public final void windowClosed(WindowEvent windowevent) {

	}

	@Override
	public final void windowClosing(WindowEvent windowevent) {
		aBool6506 = true;
		destroy();
	}

	@Override
	public final void windowDeactivated(WindowEvent windowevent) {

	}

	@Override
	public final void windowDeiconified(WindowEvent windowevent) {

	}

	@Override
	public final void windowIconified(WindowEvent windowevent) {

	}

	@Override
	public final void windowOpened(WindowEvent windowevent) {

	}

	final void method7913(Class470 class470, String domain, String build, int i, int i_1_, int revision, int i_3_,
			boolean bool) {
		try {
			method8003(Class465.aClass465_5273, bool);
			anInt6494 = (screenWidth = class470.method8029() * -266960855) * 64464323;
			Class166_Sub15.anInt9602 = (screenHeight = class470.method8030() * 895080261) * -1776014287;
			anInt6498 = 0;
			anInt6499 = 0;

			if (Class255.method4749() == Class465.aClass465_5272) {
				anInt6494 += -27649930 * class470.method8035();
				Class166_Sub15.anInt9602 += -1244913558 * class470.method8031();
				createFrame(class470.method8032());
			}

			ContainerDecodingException.anApplet11638 = Class454.applet;
			method7989(domain, build, i, i_1_, revision, i_3_);
		} catch (Throwable throwable) {
			HitsplatDefinitionProvider.reportError(null, throwable);
			error("crash");
		}
	}

	boolean method7917(File file, boolean bool, byte i) {
		boolean bool_5_;
		try {
			RandomAccessFile randomaccessfile = new RandomAccessFile(file, "rw");
			int i_6_ = randomaccessfile.read();
			randomaccessfile.seek(0L);
			randomaccessfile.write(i_6_);
			randomaccessfile.seek(0L);
			randomaccessfile.close();
			if (bool) {
				file.delete();
			}
			bool_5_ = true;
		} catch (Exception exception) {
			return false;
		}
		return bool_5_;
	}

	synchronized void method7919() {
		method8004(1575531989);
		Container container = Client.getActiveContainer();
		aCanvas6501 = new DelegatingCanvas(container);
		method7920(container, -2105743175);
	}

	void method7920(Container container, int i) {
		container.setBackground(Color.black);
		container.setLayout(null);
		container.add(aCanvas6501);
		aCanvas6501.setSize(1319181337 * screenWidth, screenHeight * -551672947);
		aCanvas6501.setVisible(true);
		if (Engine.frame == container) {
			Insets insets = Engine.frame.getInsets();
			aCanvas6501.setLocation(insets.left + anInt6498 * 1489471141, insets.top + -1495234169 * anInt6499);
		} else {
			aCanvas6501.setLocation(anInt6498 * 1489471141, -1495234169 * anInt6499);
		}
		aCanvas6501.addFocusListener(this);
		aCanvas6501.requestFocus();
		HashedVariableCollection.aBool1483 = true;
		aBool6523 = true;
		aCanvas6501.setFocusTraversalKeysEnabled(false);
		aBool6502 = true;
		aBool6504 = false;
		aLong6505 = TimeUtil.time() * 3416184454154960661L;
	}

	void method7921(File file, File file_7_, int i) {
		try {
			DiskFile class670 = new DiskFile(Class632_Sub19.aFile10502, "rw", 10000L);
			Buffer buffer = new Buffer(500);
			buffer.writeByte(3);
			buffer.writeByte(null != file_7_ ? 1 : 0);
			buffer.method15785(file.getPath(), (byte) 4);
			if (file_7_ != null) {
				buffer.method15785(file_7_.getPath(), (byte) 4);
			}
			class670.write(buffer.payload, 0, -165875887 * buffer.offset);
			class670.close();
		} catch (IOException ioexception) {
			ioexception.printStackTrace();
		}
	}

	final boolean method7922() {
		String string = Class454.applet.getDocumentBase().getHost().toLowerCase();
		if (string.equals("jagex.com") || string.endsWith(".jagex.com")) {
			return true;
		}
		if (string.equals("runescape.com") || string.endsWith(".runescape.com")) {
			return true;
		}
		if (string.equals("stellardawn.com") || string.endsWith(".stellardawn.com")) {
			return true;
		}
		if (string.endsWith("127.0.0.1")) {
			return true;
		}
		for (; string.length() > 0 && string.charAt(string.length() - 1) >= '0'
				&& string.charAt(string.length() - 1) <= '9'; string = string.substring(0, string.length() - 1)) {

		}
		if (string.endsWith("192.168.1.")) {
			return true;
		}
		error("invalidhost");
		return false;
	}

	synchronized void createFrame(String title) {
		Engine.frame = new Frame();
		Engine.frame.setTitle(title);
		Engine.frame.setResizable(true);
		Engine.frame.addWindowListener(this);
		Engine.frame.setBackground(Color.black);
		Engine.frame.setVisible(true);
		Engine.frame.toFront();
		Insets insets = Engine.frame.getInsets();
		Engine.frame.setSize(insets.right + insets.left + -562696973 * anInt6494, insets.top + -1308048867
				* Class166_Sub15.anInt9602 + insets.bottom);
	}

	void method7924() {
		long l = TimeUtil.time();
		long l_8_ = aLongArray6493[Class50.anInt585 * 556932831];
		aLongArray6493[Class50.anInt585 * 556932831] = l;
		Class50.anInt585 = -210690785 * (Class50.anInt585 * 556932831 + 1 & 0x1f);
		if (l_8_ != 0L && l <= l_8_) {

		}

		synchronized (this) {
			HashedVariableCollection.aBool1483 = aBool6523;
		}

		pulse();
	}

	void method7925() {
		long l = TimeUtil.time();
		long l_9_ = aLongArray6515[612587343 * Class180.anInt2000 - 1 & 0x1f];
		long l_10_ = aLongArray6515[Class180.anInt2000 * 612587343];
		aLongArray6515[Class180.anInt2000 * 612587343] = l;
		Class180.anInt2000 = 299851695 * (612587343 * Class180.anInt2000 + 1 & 0x1f);

		if (0L != l_10_ && l > l_10_) {
			int i_11_ = (int) (l - l_10_);
			anInt6489 = -795274123 * (int) (l - l_9_);
			anInt6488 = ((i_11_ >> 1) + 32000) / i_11_ * -233488905;
		}

		if ((anInt6503 += 135351301) * 1418174669 - 1 > 50) {
			anInt6503 -= -1822369542;
			aBool6502 = true;
			aCanvas6501.setSize(1319181337 * screenWidth, -551672947 * screenHeight);
			aCanvas6501.setVisible(true);

			if (null != Engine.frame && null == Client.fullScreenFrame) {
				Insets insets = Engine.frame.getInsets();
				aCanvas6501.setLocation(anInt6498 * 1489471141 + insets.left, insets.top + -1495234169 * anInt6499);
			} else {
				aCanvas6501.setLocation(anInt6498 * 1489471141, anInt6499 * -1495234169);
			}
		}

		method7933();
	}

	void method7926() {
		if (TextureMetricsList.javaVendor != null) {
			String vendor = TextureMetricsList.javaVendor.toLowerCase();
			if (vendor.indexOf("sun") != -1 || vendor.indexOf("apple") != -1) {
				String version = LatencyMonitor.javaVersion;
				if (version.equals("1.1") || version.startsWith("1.1.") || version.equals("1.2")
						|| version.startsWith("1.2.") || version.equals("1.3") || version.startsWith("1.3.")
						|| version.equals("1.4") || version.startsWith("1.4.") || version.equals("1.5")
						|| version.startsWith("1.5.") || version.equals("1.6.0")) {
					error("wrongjava");
					return;
				}

				if (version.startsWith("1.6.0_")) {
					int index;
					for (index = 6; index < version.length() && Client.characterIsDigit(version.charAt(index)); index++) {

					}

					String minor = version.substring(6, index);
					if (Class292.isDecimal(minor) && Client.parseDecimal(minor) < 10) {
						error("wrongjava");
						return;
					}
				}
			}
		}

		Client.getActiveContainer().setFocusCycleRoot(true);
		heapSize = ((int) (Runtime.getRuntime().maxMemory() / 1048576L) + 1) * -376356717;
		processorCount = Runtime.getRuntime().availableProcessors() * -1954331449;
		method7919();
		method7931();
		aClass467_6508 = Class467.method6970();

		while (0L == aLong6492 * 5285465794934834617L || TimeUtil.time() < aLong6492 * 5285465794934834617L) {
			anInt6527 = aClass467_6508.method7890(refreshRate * -4348386293639228151L) * 962844487;
			for (int i_15_ = 0; i_15_ < 516203127 * anInt6527; i_15_++) {
				method7924();
			}

			method7925();
			Class342.method5870(aCanvas6501);
		}
	}

	final void method7927(boolean bool) {
		synchronized (this) {
			if (aBool6486) {
				return;
			}
			aBool6486 = true;
		}
		try {
			method7934((byte) 2);
		} catch (Exception exception) {

		}
		try {
			dataFile.close();
			for (int i_16_ = 0; i_16_ < -2138485565 * Class255.anInt2833; i_16_++) {
				Client.indexFiles[i_16_].close();
			}
			aClass656_6517.close();
			random.close();
		} catch (Exception exception) {

		}
		if (aBool6512) {
			try {
				QueryPerformanceCounter.quit();
			} catch (Throwable throwable) {

			}
		}
		if (Client.hasNativeProvider()) {
			Client.getNativeProvider().clear();
		}
		if (null != aCanvas6501) {
			try {
				aCanvas6501.removeFocusListener(this);
				aCanvas6501.getParent().remove(aCanvas6501);
			} catch (Exception exception) {

			}
		}
		if (null != Engine.frame) {
			Engine.frame.setVisible(false);
			Engine.frame.dispose();
			Engine.frame = null;
		}
	}

	abstract void method7931();

	abstract void pulse();

	abstract void method7933();

	abstract void method7934(byte i);

	void error(String string) {
		if (!aBool6524) {
			aBool6524 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				JavascriptUtils.call(Class454.applet, "loggedout");
			} catch (Throwable throwable) {

			}
			try {
				Class454.applet.getAppletContext().showDocument(
						new URL(Class454.applet.getCodeBase(), new StringBuilder().append("error_game_").append(string)
								.append(".ws").toString()), "_top");
			} catch (Exception exception) {

			}
		}
	}

	File method7939(String string, String game, int i) {
		String string_19_ = 0 == i ? "" : new StringBuilder().append("").append(i).toString();
		Class632_Sub19.aFile10502 = new File(Class60.USER_HOME, new StringBuilder().append("jagex_cl_").append(string)
				.append("_").append(game).append(string_19_).append(".dat").toString());
		String string_20_ = null;
		String string_21_ = null;
		boolean bool = false;
		if (Class632_Sub19.aFile10502.exists()) {
			try {
				DiskFile class670 = new DiskFile(Class632_Sub19.aFile10502, "rw", 10000L);
				int i_22_;
				Buffer buffer;
				for (buffer = new Buffer((int) class670.length()); buffer.offset * -165875887 < buffer.payload.length; buffer.offset += 1258142129 * i_22_) {
					i_22_ = class670.read(buffer.payload, buffer.offset * -165875887, buffer.payload.length
							- -165875887 * buffer.offset);
					if (i_22_ == -1) {
						throw new IOException();
					}
				}
				buffer.offset = 0;
				i_22_ = buffer.readUByte();
				if (i_22_ < 1 || i_22_ > 3) {
					throw new IOException(new StringBuilder().append("").append(i_22_).toString());
				}
				int i_23_ = 0;
				if (i_22_ > 1) {
					i_23_ = buffer.readUByte();
				}
				if (i_22_ <= 2) {
					string_20_ = buffer.readPrefixedString();
					if (i_23_ == 1) {
						string_21_ = buffer.readPrefixedString();
					}
				} else {
					string_20_ = buffer.method15692(-640477564);
					if (1 == i_23_) {
						string_21_ = buffer.method15692(-982411786);
					}
				}
				class670.close();
			} catch (IOException ioexception) {
				ioexception.printStackTrace();
			}
			if (string_20_ != null) {
				File file = new File(string_20_);
				if (!file.exists()) {
					string_20_ = null;
				}
			}
			if (string_20_ != null) {
				File file = new File(string_20_, "test.dat");
				if (!method7917(file, true, (byte) 77)) {
					string_20_ = null;
				}
			}
		}
		if (null == string_20_ && i == 0) {
			while_17_: for (int i_24_ = 0; i_24_ < Class281_Sub1_Sub1.aStringArray11041.length; i_24_++) {
				for (int i_25_ = 0; i_25_ < ResourceProvider.cacheDirectories.length; i_25_++) {
					File file = new File(new StringBuilder().append(ResourceProvider.cacheDirectories[i_25_])
							.append(Class281_Sub1_Sub1.aStringArray11041[i_24_]).append(File.separatorChar)
							.append(string).append(File.separatorChar).toString());
					if (file.exists() && method7917(new File(file, "test.dat"), true, (byte) 77)) {
						string_20_ = file.toString();
						bool = true;
						break while_17_;
					}
				}
			}
		}
		if (null == string_20_) {
			string_20_ = new StringBuilder().append(Class60.USER_HOME).append(File.separatorChar).append("jagexcache")
					.append(string_19_).append(File.separatorChar).append(string).append(File.separatorChar)
					.append(game).append(File.separatorChar).toString();
			bool = true;
		}
		if (string_21_ != null) {
			File file = new File(string_21_);
			File file_26_ = new File(string_20_);
			try {
				File[] files = file.listFiles();
				File[] files_27_ = files;
				for (File file_29_ : files_27_) {
					File file_30_ = new File(file_26_, file_29_.getName());
					boolean bool_31_ = file_29_.renameTo(file_30_);
					if (!bool_31_) {
						throw new IOException();
					}
				}
			} catch (Exception exception) {
				exception.printStackTrace();
			}
			bool = true;
		}
		if (bool) {
			method7921(new File(string_20_), null, -1458317517);
		}
		return new File(string_20_);
	}

	String method7963() {
		return null;
	}

	final void method7989(String gameName, String buildName, int i, int i_33_, int revision, int i_35_)
			throws Exception {
		Class255.anInt2833 = -1851079701 * i_33_;
		anInt6495 = -523290031 * i;
		ContainerDecodingException.revision = 1653250923 * revision;
		Class628.anInt8049 = 801573087 * i_35_;
		TextureMetricsList.javaVendor = "Unknown";
		LatencyMonitor.javaVersion = "1.1";
		try {
			TextureMetricsList.javaVendor = System.getProperty("java.vendor");
			LatencyMonitor.javaVersion = System.getProperty("java.version");
		} catch (Exception exception) {

		}
		try {
			Class340.formattedOsName = System.getProperty("os.name");
		} catch (Exception exception) {
			Class340.formattedOsName = "Unknown";
		}
		Class189.osName = Class340.formattedOsName.toLowerCase();
		try {
			IntRaster.architecture = System.getProperty("os.arch").toLowerCase();
		} catch (Exception exception) {
			IntRaster.architecture = "";
		}
		try {
			Class343_Sub2.osVersion = System.getProperty("os.version").toLowerCase();
		} catch (Exception exception) {
			Class343_Sub2.osVersion = "";
		}
		try {
			Class60.USER_HOME = System.getProperty("user.home");
			if (null != Class60.USER_HOME) {
				Class60.USER_HOME = new StringBuilder().append(Class60.USER_HOME).append("/").toString();
			}
		} catch (Exception exception) {

		}
		try {
			if (Class189.osName.startsWith("win")) {
				if (null == Class60.USER_HOME) {
					Class60.USER_HOME = System.getenv("USERPROFILE");
				}
			} else if (Class60.USER_HOME == null) {
				Class60.USER_HOME = System.getenv("HOME");
			}
			if (null != Class60.USER_HOME) {
				Class60.USER_HOME = new StringBuilder().append(Class60.USER_HOME).append("/").toString();
			}
		} catch (Exception exception) {

		}
		if (null == Class60.USER_HOME) {
			Class60.USER_HOME = "~/";
		}
		try {
			Class480_Sub11.systemEventQueue = Toolkit.getDefaultToolkit().getSystemEventQueue();
		} catch (Throwable throwable) {

		}
		ResourceProvider.cacheDirectories = new String[] { "c:/rscache/", "/rscache/", "c:/windows/", "c:/winnt/",
				"c:/", Class60.USER_HOME, "/tmp/", "" };
		Class281_Sub1_Sub1.aStringArray11041 = new String[] {
				new StringBuilder().append(".jagex_cache_").append(anInt6495 * -1397469519).toString(),
				new StringBuilder().append(".file_store_").append(-1397469519 * anInt6495).toString() };
		while_19_: for (int i_37_ = 0; i_37_ < 4; i_37_++) {
			Class637.aFile8136 = method7939(gameName, buildName, i_37_);
			if (!Class637.aFile8136.exists()) {
				Class637.aFile8136.mkdirs();
			}
			File[] files = Class637.aFile8136.listFiles();
			if (null != files) {
				File[] files_38_ = files;
				for (int i_39_ = 0; i_39_ < files_38_.length; i_39_++) {
					File file = files_38_[i_39_];
					if (!method7917(file, false, (byte) 54)) {
						continue while_19_;
					}
				}
			}
			break;
		}
		Class173.method3500(Class637.aFile8136);
		Client.createRandom();
		dataFile = new BufferedFile(new DiskFile(Class558.openRwFile("main_file_cache.dat2"), "rw", 3221225472L), 5200,
				0);
		aClass656_6517 = new BufferedFile(new DiskFile(Class558.openRwFile("main_file_cache.idx255"), "rw", 1048576L),
				6000, 0);
		Client.indexFiles = new BufferedFile[-2138485565 * Class255.anInt2833];
		for (int i_40_ = 0; i_40_ < -2138485565 * Class255.anInt2833; i_40_++) {
			Client.indexFiles[i_40_] = new BufferedFile(new DiskFile(Class558.openRwFile(new StringBuilder()
					.append("main_file_cache.idx").append(i_40_).toString()), "rw", 1048576L), 6000, 0);
		}

		try {
			Class589.fullScreenAdapter = new FullScreenAdapter();
		} catch (Exception exception) {
			Client.supportsFullScreen = false;
		}

		Class167.aClass478_1931 = new Class478();
		ThreadGroup group = Thread.currentThread().getThreadGroup();

		for (ThreadGroup parent = group.getParent(); null != parent; parent = group.getParent()) {
			group = parent;
		}

		Thread[] threads = new Thread[1000];
		group.enumerate(threads);
		for (Thread thread : threads) {
			if (thread != null && thread.getName().startsWith("AWT")) {
				thread.setPriority(1);
			}
		}

		Thread thread = new Thread(this);
		thread.setDaemon(true);
		thread.start();
		thread.setPriority(1);
	}

	void method8003(Class465 class465, boolean bool) {
		if (null == class465) {
			throw new NullPointerException();
		}
		if (Class465.aClass465_5273 != class465 && Class465.aClass465_5274 != class465) {
			throw new IllegalStateException();
		}
		aClass465_6521 = class465;
		if (aClass465_6521 != Class465.aClass465_5274) {
			if (bool) {
				aClass465_6521 = Class465.aClass465_5272;
			}
		}
	}

	void method8004(int i) {
		if (null != aCanvas6501) {
			aCanvas6501.removeFocusListener(this);
			aCanvas6501.getParent().setBackground(Color.black);
			aCanvas6501.getParent().remove(aCanvas6501);
		}
	}

	void error(String string, String string_43_, int i) {
		if (!aBool6524) {
			aBool6524 = true;
			System.out.println(new StringBuilder().append("error_game_").append(string).toString());
			try {
				JavascriptUtils.call(Class454.applet, "loggedout");
			} catch (Throwable throwable) {

			}
			try {
				Class454.applet.getAppletContext().showDocument(
						new URL(Class454.applet.getCodeBase(), new StringBuilder().append("error_game_").append(string)
								.append(".ws?").append(string_43_).toString()), "_top");
			} catch (Exception exception) {

			}
		}
	}

}