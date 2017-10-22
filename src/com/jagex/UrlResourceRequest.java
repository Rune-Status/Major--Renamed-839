package com.jagex;

import java.net.URL;

public class UrlResourceRequest {

	static String method1572(int[] is) {
		StringBuilder builder = new StringBuilder();
		int i_0_ = 265137451 * HitsplatDefinition.anInt7257;

		for (int element : is) {
			QuestDefinition quest = QuestDefinition.loader.get(element);

			if (quest.anInt2608 * 1410144995 != -1) {
				Sprite sprite = (Sprite) Class56.aClass168_617.get(1410144995 * quest.anInt2608);
				if (sprite == null) {
					Image image = ImageUtils.loadFirst(DequeIterator.images, 1410144995 * quest.anInt2608, 0);

					if (image != null) {
						sprite = Class60.activeToolkit.createSprite(image, true);
						Class56.aClass168_617.put(1410144995 * quest.anInt2608, sprite);
					}
				}

				if (null != sprite) {
					Class368.aClass116Array4053[i_0_] = sprite;
					builder.append(" <img=").append(i_0_).append(">");
					i_0_++;
				}
			}
		}

		return builder.toString();
	}

	URL url;
	volatile boolean complete;
	volatile byte[] buffer;

	UrlResourceRequest(URL url) {
		this.url = url;
	}

	byte[] getBuffer() {
		return buffer;
	}

	boolean isComplete() {
		return complete;
	}

}