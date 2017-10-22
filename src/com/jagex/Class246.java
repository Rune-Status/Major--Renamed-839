package com.jagex;

public class Class246 {

	public String name;
	public DefineDirective[] pixelDirectives;
	public String pixelShaderName;
	public DefineDirective[] vertexDirectives;
	public String vertexShaderName;

	void decode(ShaderMetaBuffer buffer) {
		name = buffer.readString();
		vertexShaderName = buffer.readString();
		pixelShaderName = buffer.readString();

		int vertexCount = buffer.readUShort();
		int pixelCount = buffer.readUShort();

		vertexDirectives = 0 == vertexCount ? null : new DefineDirective[vertexCount];
		pixelDirectives = pixelCount == 0 ? null : new DefineDirective[pixelCount];

		for (int index = 0; index < vertexCount; index++) {
			vertexDirectives[index] = new DefineDirective();
			vertexDirectives[index].decode(buffer);
		}

		for (int index = 0; index < pixelCount; index++) {
			pixelDirectives[index] = new DefineDirective();
			pixelDirectives[index].decode(buffer);
		}
	}

}