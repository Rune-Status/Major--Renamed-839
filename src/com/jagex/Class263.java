package com.jagex;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.geom.AffineTransform;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Class263 implements Interface27 {
	static Thread aThread2955;

	boolean aBool2947;
	boolean aBool2948;
	String aString2949;
	String aString2950;
	boolean aBool2951;
	boolean aBool2952;
	List aList2953 = new ArrayList();
	AffineTransform affine = new AffineTransform();

	@Override
	public void method106() {

	}

	@Override
	public void method156(boolean bool, int i) {
		if (!aBool2952 && !aBool2948) {
			aBool2948 = true;
			try {
				String[] strings = Class374.splitString(Client.aString10634, '|');
				if (strings.length < 3) {
					aBool2952 = true;
				} else {
					MediaTracker tracker = new MediaTracker(Engine.aCanvas6501);
					int i_2_ = 0;
					for (String string : strings) {
						String[] strings_4_ = Class374.splitString(string.trim(), '=');
						if (strings_4_[0].equals("halign")) {
							aBool2947 = Boolean.parseBoolean(strings_4_[1]);
						} else if (strings_4_[0].equals("valign")) {
							aBool2951 = Boolean.parseBoolean(strings_4_[1]);
						} else if (strings_4_[0].equals("image")) {
							String[] strings_5_ = Class374.splitString(strings_4_[1], ',');
							Image image;
							try {
								image = method4975(strings_5_[0]);
							} catch (Exception exception) {
								image = null;
							}
							if (null != image) {
								tracker.addImage(image, i_2_++);
								aList2953.add(new DrawableImage(this, image, Client.parseDecimal(strings_5_[1]), Client
										.parseDecimal(strings_5_[2])));
							}
						} else if (strings_4_[0].equals("rotatingimage")) {
							String[] strings_6_ = Class374.splitString(strings_4_[1], ',');
							Image image;
							try {
								image = method4975(strings_6_[0]);
							} catch (Exception exception) {
								image = null;
							}
							if (null != image) {
								tracker.addImage(image, i_2_++);
								aList2953.add(new RotatedDrawableImage(this, image, Client.parseDecimal(strings_6_[1]),
										Client.parseDecimal(strings_6_[2]), Float.parseFloat(strings_6_[3])));
							}
						} else if (strings_4_[0].equals("progress")) {
							String[] strings_7_ = Class374.splitString(strings_4_[1], ',');
							aList2953.add(new DrawableText(this, Boolean.parseBoolean(strings_7_[0]), strings_7_[1],
									Client.parseDecimal(strings_7_[2]), Integer.decode(strings_7_[3]).intValue(),
									Client.parseDecimal(strings_7_[4]), Client.parseDecimal(strings_7_[5])));
						}
					}
					tracker.waitForAll();
				}
			} catch (Exception exception) {
				aBool2952 = true;
			}
		}
		if (aBool2952) {
			method4983(-79015143);
		} else {
			Graphics graphics = Engine.aCanvas6501.getGraphics();
			if (graphics != null) {
				try {
					aString2949 = new StringBuilder().append("").append(IgnoredPlayer.aClass266_670.method5022())
							.append("%").toString();
					aString2950 = IgnoredPlayer.aClass266_670.method5016();
					if (Class283.anImage3166 == null) {
						Class283.anImage3166 = Engine.aCanvas6501.createImage(Engine.screenWidth * 1319181337,
								Engine.screenHeight * -551672947);
					}
					Graphics graphics_8_ = Class283.anImage3166.getGraphics();
					graphics_8_.setColor(Color.BLACK);
					graphics_8_.fillRect(0, 0, 1319181337 * Engine.screenWidth, -551672947 * Engine.screenHeight);
					Iterator iterator = aList2953.iterator();
					while (iterator.hasNext()) {
						Drawable class258 = (Drawable) iterator.next();
						class258.draw(graphics_8_);
					}
					graphics.drawImage(Class283.anImage3166, 0, 0, null);
				} catch (Exception exception) {
					aBool2952 = true;
				}
			} else {
				Engine.aCanvas6501.repaint();
			}
		}
	}

	@Override
	public void method157(byte i) {
		Class424.method7063();
	}

	@Override
	public int method159(int i) {
		return 0;
	}

	@Override
	public int method160() {
		return 100;
	}

	@Override
	public boolean method164(long l) {
		return true;
	}

	final int method4973(int i) {
		if (aBool2947) {
			return (1319181337 * Engine.screenWidth - i) / 2;
		}
		return 0;
	}

	final int method4974(int i) {
		if (aBool2951) {
			return (-551672947 * Engine.screenHeight - i) / 2;
		}
		return 0;
	}

	Image method4975(String name) throws IOException {
		InputStream input = null;
		try {

			Image image;
			try {
				input = Class454.applet.getClass().getClassLoader().getResourceAsStream(name);
				byte[] data = new byte[12000];
				int index = 0;
				int in;

				while ((in = input.read()) != -1) {
					data[index++] = (byte) in;
				}

				image = Toolkit.getDefaultToolkit().createImage(data);
				input.close();
			} catch (Exception exception) {
				throw new IOException();
			}

			input.close();
			return image;
		} catch (Exception object) {
			if (input != null) {
				input.close();
			}

			return null;
		}
	}

	void method4983(int i) {
		IgnoredPlayer.method1364(IgnoredPlayer.aClass266_670.method5022(), IgnoredPlayer.aClass266_670.method5016(),
				Client.aColorArray10641[-39997795 * Client.anInt10593], Client.aColorArray10845[Client.anInt10593
						* -39997795], Client.aColorArray10633[-39997795 * Client.anInt10593], 558044812);
	}

}