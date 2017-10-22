package com.jagex;

public class CursorDefinitionLoader extends CachedDefinitionLoader {
	public static void method16798(int i, byte i_12_) {
		PulseEvent class480_sub31_sub5 = PulseEvent.create(23, i);
		class480_sub31_sub5.delay();
	}

	static void method16797(Toolkit class134, int i, int i_2_, int i_3_, int i_4_, int i_5_, int i_6_) {
		if ((BufferedConnectionContext.aClass116_1212 == null || null == LatencyMonitor.aClass116_552 || Class166_Sub19.aClass116_9633 == null)
				&& DequeIterator.images.fileLoaded(Class480_Sub11.anInt10054 * -52123579)
				&& DequeIterator.images.fileLoaded(HitsplatDefinitionProvider.anInt10464 * -1741238141)
				&& DequeIterator.images.fileLoaded(Client.anInt4915 * 1502562861)) {
			Image class152 = ImageUtils.loadFirst(DequeIterator.images, -1741238141
					* HitsplatDefinitionProvider.anInt10464, 0);
			LatencyMonitor.aClass116_552 = class134.createSprite(class152, true);
			class152.flipVertical();
			Class255.aClass116_2834 = class134.createSprite(class152, true);
			BufferedConnectionContext.aClass116_1212 = class134.createSprite(
					ImageUtils.loadFirst(DequeIterator.images, Class480_Sub11.anInt10054 * -52123579, 0), true);
			Image class152_7_ = ImageUtils.loadFirst(DequeIterator.images, 1502562861 * Client.anInt4915, 0);
			Class166_Sub19.aClass116_9633 = class134.createSprite(class152_7_, true);
			class152_7_.flipVertical();
			MobChatCutsceneAction.aClass116_9646 = class134.createSprite(class152_7_, true);
		}
		if (null != BufferedConnectionContext.aClass116_1212 && null != LatencyMonitor.aClass116_552
				&& Class166_Sub19.aClass116_9633 != null) {
			int i_8_ = (i_3_ - Class166_Sub19.aClass116_9633.method2157() * 2)
					/ BufferedConnectionContext.aClass116_1212.method2157();
			for (int i_9_ = 0; i_9_ < i_8_; i_9_++) {
				BufferedConnectionContext.aClass116_1212.method2079(i + Class166_Sub19.aClass116_9633.method2157()
						+ i_9_ * BufferedConnectionContext.aClass116_1212.method2157(), i_4_ + i_2_
						- BufferedConnectionContext.aClass116_1212.method2119());
			}
			int i_10_ = (i_4_ - i_5_ - Class166_Sub19.aClass116_9633.method2119())
					/ LatencyMonitor.aClass116_552.method2119();
			for (int i_11_ = 0; i_11_ < i_10_; i_11_++) {
				LatencyMonitor.aClass116_552.method2079(i,
						i_2_ + i_5_ + i_11_ * LatencyMonitor.aClass116_552.method2119());
				Class255.aClass116_2834.method2079(i + i_3_ - Class255.aClass116_2834.method2157(), i_2_ + i_5_ + i_11_
						* LatencyMonitor.aClass116_552.method2119());
			}
			Class166_Sub19.aClass116_9633.method2079(i, i_4_ + i_2_ - Class166_Sub19.aClass116_9633.method2119());
			MobChatCutsceneAction.aClass116_9646.method2079(i_3_ + i - Class166_Sub19.aClass116_9633.method2157(), i_2_
					+ i_4_ - Class166_Sub19.aClass116_9633.method2119());
		}
	}

	public CursorDefinitionLoader(GameContext context, Language language, Archive config, Archive sprites) {
		super(context, language, config, ConfigEntry.CURSORS, 64, new CursorDefinitionProvider(sprites));
	}

	@Override
	public void reset() {
		super.reset();
		((CursorDefinitionProvider) provider).clear();
	}

	@Override
	public void sweep(int age) {
		super.sweep(age);
		((CursorDefinitionProvider) provider).sweep(age);
	}

	@Override
	public void clearSoft() {
		super.clearSoft();
		((CursorDefinitionProvider) provider).clearSoft();
	}

}