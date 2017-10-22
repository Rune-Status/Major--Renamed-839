package com.jagex;

public class PaddedResourceRequest extends ResourceRequest {

	Buffer buffer;
	byte padding;

	PaddedResourceRequest() {

	}

	@Override
	int complete() {
		if (null == buffer) {
			return 0;
		}
		return 592280484 * buffer.offset / (buffer.payload.length - padding);
	}

	@Override
	byte[] getData() {
		if (waiting || -165875887 * buffer.offset < buffer.payload.length - padding) {
			throw new RuntimeException();
		}
		return buffer.payload;
	}

}