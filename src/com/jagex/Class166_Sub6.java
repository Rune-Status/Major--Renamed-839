package com.jagex;

import java.awt.Container;
import java.awt.Insets;

public class Class166_Sub6 extends CutsceneAction {
	static int anInt9539;

	public static void method15083() {
		synchronized (Class642_Sub3.aclient10561) {
			if (Client.fullScreenFrame != null) {

			} else {
				Container container = Client.getActiveContainer();
				if (container == null) {

				} else {
					Engine.anInt6494 = container.getSize().width * 2133658683;
					Class166_Sub15.anInt9602 = container.getSize().height * 1525026869;
					if (Engine.frame == container) {
						Insets insets = Engine.frame.getInsets();
						Engine.anInt6494 -= 2133658683 * (insets.right + insets.left);
						Class166_Sub15.anInt9602 -= (insets.top + insets.bottom) * 1525026869;
					}
					if (-562696973 * Engine.anInt6494 <= 0) {
						Engine.anInt6494 = 2133658683;
					}
					if (-1308048867 * Class166_Sub15.anInt9602 <= 0) {
						Class166_Sub15.anInt9602 = 1525026869;
					}
					if (RendererType.windowMode() != 1) {
						Class391.method6322(-755245216);
					} else {
						Engine.screenWidth = 917933125 * Client.anInt10682;
						Engine.anInt6498 = (-562696973 * Engine.anInt6494 - -1936703811 * Client.anInt10682) / 2
								* -1766002387;
						Engine.screenHeight = 1711850063 * Client.anInt10813;
						Engine.anInt6499 = 0;
					}
					if (ArchiveLoader.aClass622_4521 != Class622.aClass622_8012
							&& 1319181337 * Engine.screenWidth < 1024 && Engine.screenHeight * -551672947 >= 768) {

					}
					Engine.aCanvas6501.setSize(Engine.screenWidth * 1319181337, Engine.screenHeight * -551672947);
					if (Class60.activeToolkit != null) {
						Class60.activeToolkit.method2396(Engine.aCanvas6501, 1319181337 * Engine.screenWidth,
								Engine.screenHeight * -551672947, -1842321190);
						Class531.method9030(Class60.activeToolkit, TimeUtil.time());
					}
					if (container == Engine.frame) {
						Insets insets = Engine.frame.getInsets();
						Engine.aCanvas6501.setLocation(Engine.anInt6498 * 1489471141 + insets.left, insets.top
								+ -1495234169 * Engine.anInt6499);
					} else {
						Engine.aCanvas6501.setLocation(1489471141 * Engine.anInt6498, -1495234169 * Engine.anInt6499);
					}
					ComponentKeyRecorder.method16355();
					if (Client.anInt10790 * 1764783361 != -1) {
						ShaderMetaBuffer.method4370(true);
					}
					Class351.method5970();
				}
			}
		}
	}

	static boolean method15081() {
		Client.anInt10657 += 275861575;
		Client.aBool10667 = true;
		return true;
	}

	Class166_Sub6(Buffer buffer) {
		super(buffer);
	}

	@Override
	public void execute() {
		Class187.method3739(true);
	}

}