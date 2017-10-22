package com.jagex.twitch;

public class TwitchWebcamFrameData {
	public int width = 0;
	public int height = 0;
	public int[] buffer = null;

	public void method13914() {
		for (int i = height - 1; i >= 0; i--) {
			int i_1_ = width * i;

			for (int i_2_ = (i + 1) * width; i_1_ < i_2_; i_1_++) {
				i_2_--;
				int i_3_ = buffer[i_1_];
				buffer[i_1_] = buffer[i_2_];
				buffer[i_2_] = i_3_;
			}
		}
	}

	public void method13915() {
		for (int i = (height >> 1) - 1; i >= 0; i--) {
			int i_4_ = width * i;
			int i_5_ = (height - i - 1) * width;

			for (int x = -width; x < 0; x++) {
				int i_7_ = buffer[i_4_];
				buffer[i_4_] = buffer[i_5_];
				buffer[i_5_] = i_7_;
				i_4_++;
				i_5_++;
			}
		}
	}

	public void SetData(int width, int height, int[] buffer) {
		this.width = width;
		this.height = height;
		this.buffer = buffer;
	}

}