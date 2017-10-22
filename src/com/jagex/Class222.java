package com.jagex;

public abstract class Class222 implements DefinitionProvider<Class224> {

	public static void method4165(Toolkit toolkit) {
		Class558.p11Full = (Font) Class509.aClass374_6997.method6124(Client.anInterface47_10645,
				1909085029 * Class24.p11FullIndex, true, true);
		Class24.p11Full = Class509.aClass374_6997.method6125(Client.anInterface47_10645,
				1909085029 * Class24.p11FullIndex);
		Client.p12Full = (Font) Class509.aClass374_6997.method6124(Client.anInterface47_10645, -346985765
				* Class24.p12FullIndex, true, true);
		Class24.p12Full = Class509.aClass374_6997.method6125(Client.anInterface47_10645, Class24.p12FullIndex
				* -346985765);
		Class450.b12Full = (Font) Class509.aClass374_6997.method6124(Client.anInterface47_10645,
				1256780311 * Class24.b12FullIndex, true, true);
		Class281_Sub3.b12Full = Class509.aClass374_6997.method6125(Client.anInterface47_10645,
				1256780311 * Class24.b12FullIndex);
	}

	static void method4166(BufferedConnectionContext connection, Widget widget, int type, int i_2_, int i_3_) {
		if (type == 1) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4041, connection.encryptor);
			AsynchronousOutputStream.method9168(frame, i_2_, i_3_, widget.item * 1391525437);
			connection.sendFrame(frame);
		} else if (type == 2) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3980, connection.encryptor);
			AsynchronousOutputStream.method9168(frame, i_2_, i_3_, 1391525437 * widget.item);
			connection.sendFrame(frame);
		} else if (type == 3) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3937, connection.encryptor);
			AsynchronousOutputStream.method9168(frame, i_2_, i_3_, 1391525437 * widget.item);
			connection.sendFrame(frame);
		} else if (type == 4) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4032, connection.encryptor);
			AsynchronousOutputStream.method9168(frame, i_2_, i_3_, widget.item * 1391525437);
			connection.sendFrame(frame);
		} else if (type == 5) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3984, connection.encryptor);
			AsynchronousOutputStream.method9168(frame, i_2_, i_3_, 1391525437 * widget.item);
			connection.sendFrame(frame);
		} else if (6 == type) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3922, connection.encryptor);
			AsynchronousOutputStream.method9168(frame, i_2_, i_3_, widget.item * 1391525437);
			connection.sendFrame(frame);
		} else if (7 == type) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4024, connection.encryptor);
			AsynchronousOutputStream.method9168(frame, i_2_, i_3_, widget.item * 1391525437);
			connection.sendFrame(frame);
		} else if (8 == type) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3964, connection.encryptor);
			AsynchronousOutputStream.method9168(frame, i_2_, i_3_, widget.item * 1391525437);
			connection.sendFrame(frame);
		} else if (type == 9) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3979, connection.encryptor);
			AsynchronousOutputStream.method9168(frame, i_2_, i_3_, widget.item * 1391525437);
			connection.sendFrame(frame);
		} else if (type == 10) {
			OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_4030, connection.encryptor);
			AsynchronousOutputStream.method9168(frame, i_2_, i_3_, 1391525437 * widget.item);
			connection.sendFrame(frame);
		}
	}

	ReferenceCache<Sprite> cache;
	Archive images;

	Class222(Archive images, int size) {
		this.images = images;
		cache = new ReferenceCache<Sprite>(size);
	}

}