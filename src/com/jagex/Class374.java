package com.jagex;

import java.util.HashMap;
import java.util.Map;

public class Class374 {

	public static String[] splitString(String string, char c) {
		int amount = ProxyingVariableLoader.charOccurrences(string, c);
		String[] strings = new String[amount + 1];
		int length = 0;
		int start = 0;

		for (int i = 0; i < amount; i++) {
			int index;
			for (index = start; string.charAt(index) != c; index++) {

			}

			strings[length++] = string.substring(start, index);
			start = index + 1;
		}

		strings[amount] = string.substring(start);
		return strings;
	}

	Map<Integer, Tuple<Font, FontSpecification>> tuples;
	Archive fonts;
	ReferenceCache<Tuple<Font, FontSpecification>> cache = new ReferenceCache(20);
	int[] indices;
	Archive images;

	public Class374(Archive images, Archive fonts, int[] indices) {
		this.images = images;
		this.fonts = fonts;

		if (indices != null) {
			this.indices = indices;
		}
	}

	public void method6120() {
		tuples = null;
	}

	public int method6123() {
		if (indices == null) {
			return 0;
		}

		return 2 * indices.length;
	}

	public Object method6124(FontProvider<Font> provider, int i, boolean bool, boolean bool_0_) {
		Tuple<Font, FontSpecification> tuple = method6126(provider, i, bool, bool_0_);
		if (tuple == null) {
			return null;
		}

		return tuple.first;
	}

	public FontSpecification method6125(FontProvider<Font> provider, int id) {
		Tuple<Font, FontSpecification> tuple = method6126(provider, id, true, true);
		if (tuple == null) {
			return null;
		}

		return tuple.second;
	}

	public void clear() {
		cache.clear();
	}

	public void sweep(int age) {
		cache.sweep(age);
	}

	public void clearSoft() {
		cache.clearSoft();
	}

	public void init(FontProvider<Font> provider) {
		tuples = new HashMap(indices.length);

		for (int index = 0; index < indices.length; index++) {
			int file = indices[index];
			FontSpecification specification = FontSpecification.load(fonts, file);
			byte[] data = images.get(file);

			Font font = provider.get(data, specification, true);
			tuples.put(index, new Tuple<Font, FontSpecification>(font, specification));
		}
	}

	public int method6148(boolean bool) {
		if (indices == null) {
			return 0;
		} else if (!bool && tuples != null) {
			return indices.length * 2;
		}

		int loaded = 0;
		for (int index : indices) {
			if (images.fileLoaded(index)) {
				loaded++;
			}

			if (fonts.fileLoaded(index)) {
				loaded++;
			}
		}

		return loaded;
	}

	public int method6150() {
		return method6148(false);
	}

	Tuple<Font, FontSpecification> method6126(FontProvider<Font> provider, int id, boolean includeSpec, boolean bool_3_) {
		if (id == -1) {
			return null;
		}

		if (indices != null) {
			for (int index = 0; index < indices.length; index++) {
				if (indices[index] == id) {
					return tuples.get(index);
				}
			}
		}

		Tuple<Font, FontSpecification> tuple = cache.get(id << 1 | (bool_3_ ? 1 : 0));
		if (null != tuple) {
			if (includeSpec && null == tuple.second) {
				FontSpecification specification = FontSpecification.load(fonts, id);
				if (specification == null) {
					return null;
				}

				tuple.second = specification;
			}

			return tuple;
		}

		byte[] image = images.get(id);
		if (null == image) {
			return null;
		}

		FontSpecification specification = FontSpecification.load(fonts, id);
		if (null == specification) {
			return null;
		}

		if (includeSpec) {
			tuple = new Tuple<Font, FontSpecification>(provider.get(image, specification, bool_3_), specification);
		} else {
			tuple = new Tuple<Font, FontSpecification>(provider.get(image, specification, bool_3_), null);
		}

		cache.put(id << 1 | (bool_3_ ? 1 : 0), tuple);
		return tuple;
	}

}