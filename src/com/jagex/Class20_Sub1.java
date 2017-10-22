package com.jagex;

public class Class20_Sub1 extends Class20 implements Encodeable {

	public static void method15486(int i, int i_0_, int i_1_, int i_2_) {
		HuffmanCodec.method4342(new Class20_Sub1(i, i_0_, i_1_, Client.updateStage * 162136441,
				Class364.netWorker.errors * 289734739, -618373233 * Class364.netWorker.status, Class364.netWorker
						.priorityUnavailable(), Class364.netWorker.extraUnavailable(), BefriendedPlayer.cacheWorker
						.remaining()));
	}

	Class20_Sub1(int i, int i_0_, int i_1_, int updateStage, int netErrors, int status, boolean priorityUnavailable,
			boolean extraUnavailable, int remaining) {
		super(i, i_0_, i_1_ > 65535 ? 65535 : i_1_, updateStage, netErrors > 255 ? 255 : netErrors, status,
				priorityUnavailable, extraUnavailable, remaining > 255 ? 255 : remaining);
	}

	@Override
	public void encode() {
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3970, Client.gameConnection.encryptor);
		frame.payload.writeByteS(anInt300 * -602910541);
		frame.payload.writeByte(-512451709 * anInt299);
		frame.payload.writeByte(anInt298 * -1403337353);
		int i_7_ = (aBool295 ? 2 : 0) | (aBool301 ? 1 : 0);
		frame.payload.writeByte(i_7_);
		frame.payload.writeByte(62323871 * anInt303);
		frame.payload.writeIMEInt(anInt296 * -376763369);
		frame.payload.writeIMEInt(1715925505 * anInt302);
		frame.payload.writeShort(anInt297 * -227012693);
		Client.gameConnection.sendFrame(frame);
	}

}