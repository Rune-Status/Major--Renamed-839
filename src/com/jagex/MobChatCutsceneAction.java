package com.jagex;

public class MobChatCutsceneAction extends CutsceneAction {
	public static ClanSettings aClass288_9645;
	public static Sprite aClass116_9646;

	static long method15138(SceneObject object, int i, int i_0_) {
		long l = 4194304L;
		long l_2_ = -9223372036854775808L;
		ObjectDefinition definition = Client.aClass460_10760.getObjectLoader().get(object.getId());
		long l_3_ = i | i_0_ << 7 | object.method339() << 14 | object.method377() << 20 | 0x40000000;

		if (-1893691057 * definition.anInt7389 == 0) {
			l_3_ |= l_2_;
		}

		if (1 == definition.anInt7422 * 36878635) {
			l_3_ |= l;
		}

		return l_3_ | (long) object.getId() << 32;
	}

	int colour;
	String message;
	int index;
	int duration;

	MobChatCutsceneAction(Buffer buffer) {
		super(buffer);
		index = buffer.readUShort() * -549855097;
		message = buffer.readString();
		colour = buffer.readInt() * 2081763391;
		duration = buffer.readUShort() * -1818347887;
	}

	@Override
	public void execute() {
		CutsceneMob.mobs[index * 1535698231].getMob()
				.setMessage(message, colour * -1773224001, 0, duration * -14398863);
	}

}