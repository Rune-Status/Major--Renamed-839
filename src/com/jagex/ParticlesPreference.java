package com.jagex;

public class ParticlesPreference extends Preference {
	public static final int anInt10465 = 0;
	public static final int anInt10466 = 1;
	public static final int anInt10467 = 2;

	static final void method16437(ScriptExecutionContext class613) {
		ConfigEntry.method1004(Class495_Sub1.anInt10325 * 1732994751);
	}

	static final void method16438(ScriptExecutionContext context) {
		context.anInt7929 -= 1581763434;
		String string = (String) context.anObjectArray7918[context.anInt7929 * 211787933];
		String string_2_ = (String) context.anObjectArray7918[context.anInt7929 * 211787933 + 1];
		context.anInt7924 -= -2049596966;

		int i_3_ = context.anIntArray7942[1841827045 * context.anInt7924];
		int i_4_ = context.anIntArray7942[1 + 1841827045 * context.anInt7924];

		if (null == string_2_) {
			string_2_ = "";
		}

		if (string_2_.length() > 80) {
			string_2_ = string_2_.substring(0, 80);
		}

		BufferedConnectionContext class83 = Client.getActiveConnection();
		OutgoingFrame frame = OutgoingFrame.prepare(OutgoingFrameMeta.aClass366_3961, class83.encryptor);
		frame.payload.writeByte(Buffer.encodedStringLength(string) + 2
				+ Buffer.encodedStringLength(string_2_));
		frame.payload.writeCString(string);
		frame.payload.writeByte(i_3_ - 1);
		frame.payload.writeByte(i_4_);
		frame.payload.writeCString(string_2_);
		class83.sendFrame(frame);
	}

	public ParticlesPreference(int value, PreferenceManager manager) {
		super(value, manager);
		ParticleSystem.setParticleSetting(1008789325 * this.value);
	}

	public ParticlesPreference(PreferenceManager manager) {
		super(manager);
		ParticleSystem.setParticleSetting(value * 1008789325);
	}

	@Override
	public int compatible(int value) {
		if (manager.getEnvironment().getHeapSize() < 245) {
			return 3;
		}
		return 1;
	}

	public int getValue() {
		return value * 1008789325;
	}

	public boolean supported() {
		return manager.getEnvironment().getHeapSize() >= 245;
	}

	public void validate() {
		if (manager.getEnvironment().getHeapSize() < 245) {
			value = 0;
		}
		if (value * 1008789325 < 0 || 1008789325 * value > 2) {
			value = defaultValue() * -200365691;
		}
	}

	@Override
	int defaultValue() {
		if (manager.getEnvironment().getHeapSize() < 245) {
			return 0;
		}
		return 2;
	}

	@Override
	void set(int value) {
		this.value = value * -200365691;
		ParticleSystem.setParticleSetting(1008789325 * value);
	}

}