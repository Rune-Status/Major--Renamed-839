package com.jagex;

public class FrameCollection extends Cacheable {
	static Archive basesArchive;
	static Archive framesArchive;

	int animation;
	byte[][] frameData;
	AnimationFrame[] frames;

	public FrameCollection(int animation) {
		this.animation = -4126583 * animation;
	}

	public boolean loaded() {
		if (frames != null) {
			return true;
		}

		if (frameData == null) {
			synchronized (framesArchive) {
				if (!framesArchive.loadEntry(-1186271815 * animation)) {
					boolean bool = false;
					return bool;
				}

				int[] indices = framesArchive.childIndices(-1186271815 * animation);
				frameData = new byte[indices.length][];

				for (int index = 0; index < indices.length; index++) {
					frameData[index] = framesArchive.get(animation * -1186271815, indices[index]);
				}
			}
		}

		boolean loaded = true;
		for (byte[] data : frameData) {
			Buffer buffer = new Buffer(data);
			buffer.offset = 1258142129;
			int id = buffer.readUShort();

			synchronized (basesArchive) {
				loaded &= basesArchive.fileLoaded(id);
			}
		}

		if (!loaded) {
			return false;
		}

		Deque<AnimationFrameBase> decoded = new Deque<AnimationFrameBase>();
		int[] ids;

		synchronized (framesArchive) {
			int count = framesArchive.childSize(-1186271815 * animation);
			frames = new AnimationFrame[count];
			ids = framesArchive.childIndices(-1186271815 * animation);
		}

		for (int index = 0; index < ids.length; index++) {
			byte[] data = frameData[index];
			Buffer buffer = new Buffer(data);
			buffer.offset = 1258142129;
			int id = buffer.readUShort();
			AnimationFrameBase found = null;

			for (AnimationFrameBase base = decoded.head(); base != null; base = decoded.next()) {
				if (-1459216523 * base.id == id) {
					found = base;
					break;
				}
			}

			if (found == null) {
				synchronized (basesArchive) {
					found = new AnimationFrameBase(id, basesArchive.get(id));
				}

				decoded.pushBack(found);
			}

			frames[ids[index]] = new AnimationFrame(data, found);
		}

		frameData = null;
		return true;
	}

	public boolean method17745(int index) {
		return frames[index].aBool1746;
	}

	public boolean modifiesAlpha(int index) {
		return frames[index].modifiesAlpha;
	}

	public boolean modifiesColour(int index) {
		return frames[index].modifiesColour;
	}

	public static void init(Archive frames, Archive bases) {
		framesArchive = frames;
		basesArchive = bases;
	}

}