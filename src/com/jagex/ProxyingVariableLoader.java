package com.jagex;

import java.util.Map;

import com.jagex.twitch.TwitchEventResult;
import com.jagex.twitch.TwitchTV;

final class ProxyingVariableLoader implements VariableLoader {
	public static Class678_Sub6 aClass678_Sub6_3003;
	public static int localPlane;

	public static int method5080() {
		if (!Class533.aBool7275) {
			return 12;
		}

		BaseGraphicDefinitionProvider.method10303();
		return TwitchTV.tv.Logout();
	}

	static void method5081(int i, int i_2_) {
		TwitchEventResult result = new TwitchEventResult(i, i_2_);
		Class527 class527 = result.method6187();
		if (class527 != null) {
			Class60.method1369(class527.getId(), result);
		}
	}

	static int charOccurrences(CharSequence sequence, char c) {
		int count = 0;
		int length = sequence.length();

		for (int index = 0; index < length; index++) {
			if (sequence.charAt(index) == c) {
				count++;
			}
		}

		return count;
	}

	public static Map<VarpType, DefinitionLoader<BaseVariableParameterDefinition>> parameters;

	@Override
	public BaseVariableParameterDefinition getVarp(VarpType type, int id) {
		return parameters.get(type).get(id);
	}

	@Override
	public VariableBitsDefinition getVarbit(int id) {
		return VariableBitsDefinition.loader.get(id);
	}

}