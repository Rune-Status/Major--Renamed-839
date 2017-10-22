package com.jagex;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.io.FileOutputStream;
import java.util.Arrays;
import java.util.LinkedList;

public class IgnoredPlayer {
	public static Class266 aClass266_670;
	static FileOutputStream logFile;

	public static boolean isIgnored(String name) {
		if (null == name) {
			return false;
		}

		for (int index = 0; index < -1127325433 * Client.ignoredPlayerCount; index++) {
			IgnoredPlayer ignored = Client.ignoredPlayers[index];
			if (name.equalsIgnoreCase(ignored.name)) {
				return true;
			} else if (name.equalsIgnoreCase(ignored.aString668)) {
				return true;
			}
		}

		return false;
	}

	public static final void method1364(int i, String string, Color color, Color color_0_, Color color_1_, int i_2_) {
		try {
			Graphics graphics = Engine.aCanvas6501.getGraphics();
			if (Class203.aFont2127 == null) {
				Class203.aFont2127 = new Font("Helvetica", 1, 13);
			}
			if (color == null) {
				color = new Color(140, 17, 17);
			}
			if (color_0_ == null) {
				color_0_ = new Color(140, 17, 17);
			}
			if (null == color_1_) {
				color_1_ = new Color(255, 255, 255);
			}
			try {
				if (null == Class283.anImage3166) {
					Class283.anImage3166 = Engine.aCanvas6501.createImage(Engine.screenWidth * 1319181337, -551672947
							* Engine.screenHeight);
				}
				Graphics graphics_3_ = Class283.anImage3166.getGraphics();
				graphics_3_.setColor(Color.black);
				graphics_3_.fillRect(0, 0, Engine.screenWidth * 1319181337, Engine.screenHeight * -551672947);
				int i_4_ = Engine.screenWidth * 1319181337 / 2 - 152;
				int i_5_ = -551672947 * Engine.screenHeight / 2 - 18;
				graphics_3_.setColor(color_0_);
				graphics_3_.drawRect(i_4_, i_5_, 303, 33);
				graphics_3_.setColor(color);
				graphics_3_.fillRect(2 + i_4_, i_5_ + 2, 3 * i, 30);
				graphics_3_.setColor(Color.black);
				graphics_3_.drawRect(i_4_ + 1, i_5_ + 1, 301, 31);
				graphics_3_.fillRect(2 + i_4_ + i * 3, 2 + i_5_, 300 - 3 * i, 30);
				graphics_3_.setFont(Class203.aFont2127);
				graphics_3_.setColor(color_1_);
				graphics_3_.drawString(string, i_4_ + (304 - string.length() * 6) / 2, i_5_ + 22);
				if (null != Engine.aString6510) {
					graphics_3_.setFont(Class203.aFont2127);
					graphics_3_.setColor(color_1_);
					graphics_3_.drawString(Engine.aString6510,
							Engine.screenWidth * 1319181337 / 2 - Engine.aString6510.length() * 6 / 2,
							Engine.screenHeight * -551672947 / 2 - 26);
				}
				graphics.drawImage(Class283.anImage3166, 0, 0, null);
			} catch (Exception exception) {
				graphics.setColor(Color.black);
				graphics.fillRect(0, 0, Engine.screenWidth * 1319181337, -551672947 * Engine.screenHeight);
				int i_6_ = Engine.screenWidth * 1319181337 / 2 - 152;
				int i_7_ = -551672947 * Engine.screenHeight / 2 - 18;
				graphics.setColor(color_0_);
				graphics.drawRect(i_6_, i_7_, 303, 33);
				graphics.setColor(color);
				graphics.fillRect(i_6_ + 2, i_7_ + 2, i * 3, 30);
				graphics.setColor(Color.black);
				graphics.drawRect(i_6_ + 1, i_7_ + 1, 301, 31);
				graphics.fillRect(2 + i_6_ + 3 * i, 2 + i_7_, 300 - 3 * i, 30);
				graphics.setFont(Class203.aFont2127);
				graphics.setColor(color_1_);
				if (null != Engine.aString6510) {
					graphics.setFont(Class203.aFont2127);
					graphics.setColor(color_1_);
					graphics.drawString(Engine.aString6510,
							Engine.screenWidth * 1319181337 / 2 - Engine.aString6510.length() * 6 / 2,
							Engine.screenHeight * -551672947 / 2 - 26);
				}
				graphics.drawString(string, i_6_ + (304 - string.length() * 6) / 2, i_7_ + 22);
			}
		} catch (Exception exception) {
			Engine.aCanvas6501.repaint();
		}
	}

	static final void method1363(Widget class226, Interface class221, ScriptExecutionContext class613, byte i) {
		String string = (String) class613.anObjectArray7918[(class613.anInt7929 -= -1356601931) * 211787933];
		if (ScriptExecutionContext.method9239(string, class613) != null) {
			string = string.substring(0, string.length() - 1);
		}
		class226.anObjectArray2557 = Class562_Sub1.method16248(string, class613);
		class226.aBool2483 = true;
	}

	static void method1365(int[] is, LinkedList list, int i, int i_8_, float f, byte i_9_) {
		if (!list.isEmpty()) {
			for (int index = 0; index < list.size(); index++) {
				Class522 class522 = (Class522) list.get(index);
				int i_11_ = (int) (f * (719323615 * class522.anInt7210)) + i;
				int i_12_ = (int) (class522.anInt7208 * 642232159 * f) + i_8_;
				int i_13_ = (int) (f * (class522.anInt7209 * 1328064725));
				int i_14_ = (int) (class522.anInt7207 * -1075585101 * f);
				if (i_11_ < Class554.anInt7503 * 1401702975 && i_12_ < -1021853939 * IgnoredPlayer.anInt4246) {
					if (i_11_ + i_13_ > Class554.anInt7503 * 1401702975) {
						i_13_ = Class554.anInt7503 * 1401702975 - i_11_;
					}
					if (i_12_ + i_14_ > -1021853939 * IgnoredPlayer.anInt4246) {
						i_14_ = IgnoredPlayer.anInt4246 * -1021853939 - i_12_;
					}
					for (int i_15_ = i_12_; i_15_ < i_14_ + i_12_; i_15_++) {
						int i_16_ = i_11_ + i_15_ * Class554.anInt7503 * 1401702975;
						Arrays.fill(is, i_16_, i_16_ + i_13_, -16777216);
					}
				}
			}
		}
	}

	public boolean aBool667;
	public String aString665;
	public String name;
	public String aString668;
	static int anInt4246;

}