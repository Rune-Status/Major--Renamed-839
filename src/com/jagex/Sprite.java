package com.jagex;

import java.awt.MediaTracker;
import java.awt.image.PixelGrabber;

public abstract class Sprite implements HorizontallyScalable {

	static Sprite[] headicons;
	public static Sprite aClass116_7904;

	@Override
	public abstract int scaleWidth();

	public abstract void setOffsets(int i, int i_0_, int i_1_, int i_2_);

	public abstract void getOffsets(int[] is);

	public abstract int scaleHeight();

	public abstract Interface16 method2075();

	public abstract void method2076(int i, int i_3_, int i_4_, int i_5_, int[] is, int[] is_6_, int i_7_, int i_8_);

	public final void method2079(int i, int i_15_) {
		method2142(i, i_15_, 1, -1, 1);
	}

	public final void method2080(float f, float f_16_, int i, int i_17_, int i_18_, int i_19_, int i_20_) {
		method2090(f, f_16_, scaleWidth() / 2.0F, scaleHeight() / 2.0F, i, i_17_, i_18_, i_19_, i_20_);
	}

	public abstract void method2081(int i, int i_21_, ClippingMask class129, int i_22_, int i_23_);

	public final void method2082(int i, int i_24_, int i_25_, int i_26_, int i_27_, int i_28_, int i_29_) {
		method2083(i, i_24_, i_25_, i_26_, i_27_, i_28_, i_29_, 1);
	}

	public final void method2084(int i, int i_37_, int i_38_, int i_39_) {
		method2085(i, i_37_, i_38_, i_39_, 1, -1, 1);
	}

	public abstract void method2085(int i, int i_40_, int i_41_, int i_42_, int i_43_, int i_44_, int i_45_);

	public final void method2086(float f, float f_46_, float f_47_, float f_48_, int i, int i_49_) {
		method2090(f, f_46_, f_47_, f_48_, i, i_49_, 1, -1, 1);
	}

	public abstract void method2088(int i, int i_50_, int i_51_, int i_52_, int i_53_, int i_54_);

	public final void method2090(float f, float f_55_, float f_56_, float f_57_, int i, int i_58_, int i_59_,
			int i_60_, int i_61_) {
		if (i != 0) {
			double d = (i_58_ & 0xffff) * 9.587379924285257E-5;
			float f_62_ = (float) Math.sin(d) * i;
			float f_63_ = (float) Math.cos(d) * i;
			float f_64_ = (-f_56_ * f_63_ + -f_57_ * f_62_) / 4096.0F + f;
			float f_65_ = (--f_56_ * f_62_ + -f_57_ * f_63_) / 4096.0F + f_55_;
			float f_66_ = ((scaleWidth() - f_56_) * f_63_ + -f_57_ * f_62_) / 4096.0F + f;
			float f_67_ = (-(scaleWidth() - f_56_) * f_62_ + -f_57_ * f_63_) / 4096.0F + f_55_;
			float f_68_ = (-f_56_ * f_63_ + (scaleHeight() - f_57_) * f_62_) / 4096.0F + f;
			float f_69_ = (--f_56_ * f_62_ + (scaleHeight() - f_57_) * f_63_) / 4096.0F + f_55_;
			method2093(f_64_, f_65_, f_66_, f_67_, f_68_, f_69_, i_59_, i_60_, i_61_);
		}
	}

	public final void method2091(float f, float f_70_, int i, int i_71_) {
		method2090(f, f_70_, scaleWidth() / 2.0F, scaleHeight() / 2.0F, i, i_71_, 1, -1, 1);
	}

	public final void method2092(float f, float f_72_, float f_73_, float f_74_, int i, int i_75_,
			ClippingMask class129, int i_76_, int i_77_) {
		if (i != 0) {
			double d = (i_75_ & 0xffff) * 9.587379924285257E-5;
			float f_78_ = (float) Math.sin(d) * i;
			float f_79_ = (float) Math.cos(d) * i;
			float f_80_ = (-f_73_ * f_79_ + -f_74_ * f_78_) / 4096.0F + f;
			float f_81_ = (--f_73_ * f_78_ + -f_74_ * f_79_) / 4096.0F + f_72_;
			float f_82_ = ((scaleWidth() - f_73_) * f_79_ + -f_74_ * f_78_) / 4096.0F + f;
			float f_83_ = (-(scaleWidth() - f_73_) * f_78_ + -f_74_ * f_79_) / 4096.0F + f_72_;
			float f_84_ = (-f_73_ * f_79_ + (scaleHeight() - f_74_) * f_78_) / 4096.0F + f;
			float f_85_ = (--f_73_ * f_78_ + (scaleHeight() - f_74_) * f_79_) / 4096.0F + f_72_;
			method2078(f_80_, f_81_, f_82_, f_83_, f_84_, f_85_, class129, i_76_, i_77_);
		}
	}

	public final void method2093(float f, float f_86_, float f_87_, float f_88_, float f_89_, float f_90_, int i,
			int i_91_, int i_92_) {
		method2143(f, f_86_, f_87_, f_88_, f_89_, f_90_, i, i_91_, i_92_, 1);
	}

	public abstract void method2100(int i, int i_100_, int i_101_, int i_102_, int[] is, int i_103_, int i_104_);

	public abstract void method2114(int i, int i_105_, int i_106_);

	public abstract int method2119();

	public final void method2128(float f, float f_107_, int i, int i_108_, ClippingMask class129, int i_109_, int i_110_) {
		method2092(f, f_107_, scaleWidth() / 2.0F, scaleHeight() / 2.0F, i, i_108_, class129, i_109_, i_110_);
	}

	public final void method2130(float f, float f_111_, float f_112_, float f_113_, int i, int i_114_, int i_115_,
			int i_116_, int i_117_, int i_118_) {
		if (i != 0 && i_114_ != 0) {
			double d = (i_115_ & 0xffff) * 9.587379924285257E-5;
			float f_119_ = (float) Math.sin(d) * i_114_;
			float f_120_ = (float) Math.cos(d) * i_114_;
			float f_121_ = (float) Math.sin(d) * i;
			float f_122_ = (float) Math.cos(d) * i;
			float f_123_ = (-f_112_ * f_122_ + -f_113_ * f_119_) / 4096.0F + f;
			float f_124_ = (--f_112_ * f_121_ + -f_113_ * f_120_) / 4096.0F + f_111_;
			float f_125_ = ((scaleWidth() - f_112_) * f_122_ + -f_113_ * f_119_) / 4096.0F + f;
			float f_126_ = (-(scaleWidth() - f_112_) * f_121_ + -f_113_ * f_120_) / 4096.0F + f_111_;
			float f_127_ = (-f_112_ * f_122_ + (scaleHeight() - f_113_) * f_119_) / 4096.0F + f;
			float f_128_ = (--f_112_ * f_121_ + (scaleHeight() - f_113_) * f_120_) / 4096.0F + f_111_;
			method2093(f_123_, f_124_, f_125_, f_126_, f_127_, f_128_, i_116_, i_117_, i_118_);
		}
	}

	public abstract void method2142(int x, int y, int i_130_, int colour, int i_132_);

	public final void method2145(int i, int i_141_, int i_142_, int i_143_) {
		method2083(i, i_141_, i_142_, i_143_, 1, -1, 1, 1);
	}

	public abstract int method2157();

	final void method2078(float f, float f_9_, float f_10_, float f_11_, float f_12_, float f_13_,
			ClippingMask class129, int i, int i_14_) {
		method2096(f, f_9_, f_10_, f_11_, f_12_, f_13_, 1, class129, i, i_14_);
	}

	abstract void method2083(int i, int i_30_, int i_31_, int i_32_, int i_33_, int i_34_, int i_35_, int i_36_);

	abstract void method2096(float f, float f_93_, float f_94_, float f_95_, float f_96_, float f_97_, int i,
			ClippingMask class129, int i_98_, int i_99_);

	abstract void method2143(float f, float f_133_, float f_134_, float f_135_, float f_136_, float f_137_, int i,
			int i_138_, int i_139_, int i_140_);

	static Sprite create(byte[] data) {
		if (data == null) {
			throw new RuntimeException("");
		}

		Sprite sprite;
		for (;;) {
			try {
				java.awt.Image image = java.awt.Toolkit.getDefaultToolkit().createImage(data);
				MediaTracker tracker = new MediaTracker(Class454.applet);
				tracker.addImage(image, 0);
				tracker.waitForAll();
				int width = image.getWidth(Class454.applet);
				int height = image.getHeight(Class454.applet);

				if (tracker.isErrorAny() || width < 0 || height < 0) {
					throw new RuntimeException("");
				}

				int[] raster = new int[height * width];
				PixelGrabber grabber = new PixelGrabber(image, 0, 0, width, height, raster, 0, width);
				grabber.grabPixels();
				sprite = Class60.activeToolkit.createSprite(raster, 0, width, width, height);
				break;
			} catch (InterruptedException interruptedexception) {

			}
		}

		return sprite;
	}

	public static void loadVitalImages(Toolkit toolkit, Archive archive) {
		Image[] images = ImageUtils.load(archive, Client.hintHeadiconsIndex * -1865373537, 0);
		headicons = new Sprite[images.length];
		for (int index = 0; index < images.length; index++) {
			headicons[index] = toolkit.createSprite(images[index], true);
		}

		images = ImageUtils.load(archive, Client.hintMapmarkersIndex * -1197117939, 0);
		Client.mapmarkers = new Sprite[images.length];
		for (int index = 0; index < images.length; index++) {
			Client.mapmarkers[index] = toolkit.createSprite(images[index], true);
		}

		images = ImageUtils.load(archive, -291662025 * Deque.mapflagIndex, 0);
		Class351.mapflags = new Sprite[images.length];
		int i_4_ = 25;
		for (int index = 0; index < images.length; index++) {
			images[index].offsetColour(-i_4_ + (int) (Math.random() * i_4_ * 2.0), -i_4_
					+ (int) (Math.random() * i_4_ * 2.0), -i_4_ + (int) (Math.random() * i_4_ * 2.0));
			Class351.mapflags[index] = toolkit.createSprite(images[index], true);
		}

		images = ImageUtils.load(archive, Class179.crossIndex * -1573181517, 0);
		Class293.crosses = new Sprite[images.length];
		for (int index = 0; index < images.length; index++) {
			Class293.crosses[index] = toolkit.createSprite(images[index], true);
		}

		images = ImageUtils.load(archive, -684001105 * Client.mapDotsIndex, 0);
		Client.mapDots = new Sprite[images.length];
		i_4_ = 12;

		for (int index = 0; index < images.length; index++) {
			images[index].offsetColour(-i_4_ + (int) (Math.random() * i_4_ * 2.0), -i_4_
					+ (int) (Math.random() * i_4_ * 2.0), -i_4_ + (int) (Math.random() * i_4_ * 2.0));
			Client.mapDots[index] = toolkit.createSprite(images[index], true);
		}

		images = ImageUtils.load(archive, -717918803 * Class619.nameIconsIndex, 0);
		WeakReferenceTable.nameIcons = new Sprite[images.length];
		i_4_ = 12;

		for (int index = 0; index < images.length; index++) {
			images[index].offsetColour(-i_4_ + (int) (Math.random() * i_4_ * 2.0), -i_4_
					+ (int) (Math.random() * i_4_ * 2.0), -i_4_ + (int) (Math.random() * i_4_ * 2.0));
			WeakReferenceTable.nameIcons[index] = toolkit.createSprite(images[index], true);
		}

		CutsceneObject.compass = toolkit.createSprite(
				ImageUtils.loadFirst(archive, 1750930985 * Drawable.compassIndex, 0), true);
		Class216.otherLevel = toolkit.createSprite(
				ImageUtils.loadFirst(archive, -1841657153 * Client.otherLevelIndex, 0), true);

		images = ImageUtils.load(archive, -298285549 * Client.hintMapEdgeIndex, 0);
		Class264.hintMapEdges = new Sprite[images.length];
		for (int index = 0; index < images.length; index++) {
			Class264.hintMapEdges[index] = toolkit.createSprite(images[index], true);
		}
	}

	public static void method8794(Sprite[] sprites) {
		HitsplatDefinition.anInt7257 = sprites.length * -439506557;
		Class368.aClass116Array4053 = new Sprite[10 + 265137451 * HitsplatDefinition.anInt7257];
		LruDefinitionCacheIterator.anIntArray278 = new int[10 + 265137451 * HitsplatDefinition.anInt7257];
		System.arraycopy(sprites, 0, Class368.aClass116Array4053, 0, 265137451 * HitsplatDefinition.anInt7257);
		for (int i_15_ = 0; i_15_ < 265137451 * HitsplatDefinition.anInt7257; i_15_++) {
			LruDefinitionCacheIterator.anIntArray278[i_15_] = Class368.aClass116Array4053[i_15_].scaleHeight();
		}

		for (int i_16_ = HitsplatDefinition.anInt7257 * 265137451; i_16_ < Class368.aClass116Array4053.length; i_16_++) {
			LruDefinitionCacheIterator.anIntArray278[i_16_] = 12;
		}
	}
}
