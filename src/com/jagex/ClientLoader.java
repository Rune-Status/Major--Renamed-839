package com.jagex;

import java.applet.Applet;
import java.applet.AppletStub;
import java.awt.Dimension;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigInteger;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import javax.swing.JFrame;

public class ClientLoader extends Applet implements AppletStub {

	public static final BigInteger JS5_PUBLIC_KEY = new BigInteger("65537");
	public static final BigInteger JS5_MODULUS = new BigInteger(
			"93640689943905294863765289827408621343761622604573228853685321771858455502571982144215122897901870174704904532494432887476204270705658036872335563522839443554400688853336049767174347131774078429389825418360856177758652274802442661649907032212044334175713179544786760681935009554912428382556040178918498953291");

	public static final BigInteger LOGIN_PUBLIC_KEY = new BigInteger("65537");
	public static final BigInteger LOGIN_MODULUS = new BigInteger(
			"137231748351587392190809953716915182123465338795074521835896428835126169526019076587293170903588521763557567459582547479079642180558752726684397858599275255304449851625071569461332634322311365163954923133814322684645819581379454656384728571691404975282936307990170244347701323826199274022610768178400420620079");

	public static String[] IN_PACKET_NAMES = new String[512];
	public static boolean[] IGNORED_PACKETS = new boolean[512];

	public static final boolean DISABLE_TEMP_STUFF = true;

	private static final long serialVersionUID = 1670498001014004354L;

	public static ClientLoader ctx;

	public static boolean RSPS = false;

	public static String host = "localhost";

	public static String lobbyHost = "localhost";

	public static void main(String... args) {
		System.setProperty("socksProxyHost", "localhost");

		// System.setOut(new PrintStream("jan.txt") {

		// @Override public void println(String s) { Logging.log(s); }

		// @Override public void write(byte[] b) throws IOException { Logging.log(new String(b)); }

		// @Override public PrintStream append(CharSequence csq) { Logging.log(csq.toString()); return this; } });

		ClientLoader rsLoader = ctx = new ClientLoader();
		rsLoader.doFrame();
	}

	private final Properties parameters = new Properties();

	public JFrame clientFrame = null;

	public boolean debug = true;

	@Override
	public void appletResize(int dimensionX, int dimensionY) {
		super.resize(new Dimension(dimensionX, dimensionY));
	}

	public void debug(String message) {
		if (debug) {
			// logStream.println(message);
			// printStream.println(message);
		}
	}

	@Override
	public URL getCodeBase() {
		try {
			return new URL("http://" + host + "");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public URL getDocumentBase() {
		try {
			return new URL("http://" + host + "");
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String getParameter(String paramName) {
		return (String) parameters.get(paramName);
	}

	private void doFrame() {
		readParameters();
		openFrame();
		startClient();
		clientFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

	private void openFrame() {
		clientFrame = new JFrame("Catanai RS3 805");
		clientFrame.add(this);
		clientFrame.setSize(1000, 700);
		clientFrame.setLocationRelativeTo(null);
		clientFrame.setVisible(true);
	}

	@SuppressWarnings("resource")
	private void readParameters() {
		if (!RSPS) {
			try {
				BufferedReader reader = new BufferedReader(new FileReader("data/params.txt"));

				String line;
				while ((line = reader.readLine()) != null) {
					if (line.contains("document.write('<param name=")) {
						String[] regex = line.split(" value=");

						String parameterName = regex[0];
						String[] parameterRegex = parameterName.split("name=");
						String finalParameter = parameterRegex[1].replaceAll("\"", "");

						String parameterValue = regex[1];
						String finalValue = parameterValue.replaceAll("\"", "").replace(">');", "");

						if (RSPS && finalValue.startsWith("lobby")) {
							finalValue = lobbyHost;
						}
						parameters.put(finalParameter, finalValue);
					}
				}
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} else {

			parameters
					.put("java_arguments",
							"-Xmx384m -Xss2m -Dsun.java2d.noddraw=true -XX:CompileThreshold=1500 -Xincgc -XX:+UseConcMarkSweepGC -XX:+UseParNewGC");
			parameters.put("boxborder", "false");
			parameters.put("separate_jvm", "true");
			parameters.put("boxbgcolor", "black");
			parameters.put("image", "http://www.runescape.com/img/game/splash5.gif");
			parameters.put("centerimage", "true");
			parameters.put("15", host);
			parameters
					.put("26",
							"halign=true|valign=true|image=rs3_logo.gif,0,-43|rotatingimage=rs3_loading_spinner.gif,0,47,9.6|progress=true,Verdana,13,0xFFFFFF,0,51");
			parameters.put("23", "false");
			parameters.put("41", "");
			parameters.put("3", "0");
			parameters.put("16", "true");
			parameters.put("42", "false");
			parameters.put("25", "0");
			parameters.put("28", "http://services.runescape.com/m=gamelogspecs/clientstats?data=");
			parameters.put("20", "false");
			parameters.put("6", "0");
			parameters.put("13", "false");
			parameters.put("31", lobbyHost);
			parameters.put("40", "false");
			parameters.put("4", "");
			parameters.put("21", lobbyHost);
			parameters.put("32", "0");
			parameters.put("7", "");
			parameters.put("38", "false");
			parameters.put("37", "1132");
			parameters.put("1", "false");
			parameters.put("11", "false");
			parameters.put("35", "34570");
			parameters.put("14", ".runescape.com");
			parameters.put("29", "");
			parameters.put("22", "1132");
			parameters.put("34", "1308101816");
			parameters.put("-1", "1Ch3KfPh-Skx1YjtgzqzGQ");
			parameters.put("2", "vZsDj7Xjn2O2LyccVi/1xVUL89hhfFMw");
			parameters.put("30", "161");
			parameters.put("39", "");
			parameters.put("12", "0");
			parameters.put("5", "0");
			parameters.put("0", "ELfDCYlvjSLW-6v8*q*EQw");
			parameters.put("33", "wwGlrZHF5gKN6D3mDdihco3oPeYN2KFybL9hUUFqOvk");
			parameters.put("27", "");
			parameters.put("36", host);
			parameters.put("24", "51");
			parameters.put("17", "0");
			parameters.put("8", "0");
			parameters.put("haveie6", "true");
		}
	}

	private void startClient() {
		Client clnt = new Client();
		clnt.supplyApplet(this);
		clnt.init();
		clnt.start();
	}

}