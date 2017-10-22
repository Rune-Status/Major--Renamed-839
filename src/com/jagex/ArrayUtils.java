package com.jagex;

public final class ArrayUtils {

	static void sort(long[] comparators, Object[] objects, int start, int end) {
		if (start < end) {
			int mid = (end + start) / 2;
			int i_3_ = start;
			long l = comparators[mid];
			comparators[mid] = comparators[end];
			comparators[end] = l;
			Object object = objects[mid];
			objects[mid] = objects[end];
			objects[end] = object;
			int i_4_ = l == 9223372036854775807L ? 0 : 1;

			for (int i_5_ = start; i_5_ < end; i_5_++) {
				if (comparators[i_5_] < l + (i_5_ & i_4_)) {
					long l_6_ = comparators[i_5_];
					comparators[i_5_] = comparators[i_3_];
					comparators[i_3_] = l_6_;
					Object object_7_ = objects[i_5_];
					objects[i_5_] = objects[i_3_];
					objects[i_3_++] = object_7_;
				}
			}

			comparators[end] = comparators[i_3_];
			comparators[i_3_] = l;
			objects[end] = objects[i_3_];
			objects[i_3_] = object;
			sort(comparators, objects, start, i_3_ - 1);
			sort(comparators, objects, 1 + i_3_, end);
		}
	}

	public static void sort(long[] ls, Object[] objects) {
		sort(ls, objects, 0, ls.length - 1);
	}

	static void sort(int[] is, float[] fs, float[] fs_3_, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			int i_7_ = start;
			int i_8_ = is[mid];
			is[mid] = is[end];
			is[end] = i_8_;
			float f = fs[mid];
			fs[mid] = fs[end];
			fs[end] = f;
			float f_9_ = fs_3_[mid];
			fs_3_[mid] = fs_3_[end];
			fs_3_[end] = f_9_;
			int i_10_ = 9223372036854775807L == i_8_ ? 0 : 1;

			for (int i_11_ = start; i_11_ < end; i_11_++) {
				if (is[i_11_] < (i_11_ & i_10_) + i_8_) {
					int i_12_ = is[i_11_];
					is[i_11_] = is[i_7_];
					is[i_7_] = i_12_;
					float f_13_ = fs[i_11_];
					fs[i_11_] = fs[i_7_];
					fs[i_7_] = f_13_;
					float f_14_ = fs_3_[i_11_];
					fs_3_[i_11_] = fs_3_[i_7_];
					fs_3_[i_7_] = f_14_;
					i_7_++;
				}
			}

			is[end] = is[i_7_];
			is[i_7_] = i_8_;
			fs[end] = fs[i_7_];
			fs[i_7_] = f;
			fs_3_[end] = fs_3_[i_7_];
			fs_3_[i_7_] = f_9_;
			sort(is, fs, fs_3_, start, i_7_ - 1);
			sort(is, fs, fs_3_, i_7_ + 1, end);
		}
	}

	public static void sort(int[] is, float[] fs, float[] fs_5_) {
		sort(is, fs, fs_5_, 0, is.length - 1);
	}

	static void sort(short[] comparators, String[] strings, int start, int end) {
		if (start < end) {
			int mid = (end + start) / 2;
			int i_5_ = start;
			String string = strings[mid];
			strings[mid] = strings[end];
			strings[end] = string;
			short i_6_ = comparators[mid];
			comparators[mid] = comparators[end];
			comparators[end] = i_6_;

			for (int index = start; index < end; index++) {
				if (string == null || null != strings[index] && strings[index].compareTo(string) < (index & 0x1)) {
					String string_8_ = strings[index];
					strings[index] = strings[i_5_];
					strings[i_5_] = string_8_;
					short i_9_ = comparators[index];
					comparators[index] = comparators[i_5_];
					comparators[i_5_++] = i_9_;
				}
			}

			strings[end] = strings[i_5_];
			strings[i_5_] = string;
			comparators[end] = comparators[i_5_];
			comparators[i_5_] = i_6_;
			sort(comparators, strings, start, i_5_ - 1);
			sort(comparators, strings, 1 + i_5_, end);
		}
	}

	public static void sort(short[] comparators, String[] values) {
		sort(comparators, values, 0, values.length - 1);
	}

	public static void sort(float[] array, int[] indices, int start, int end) {
		if (start < end) {
			int mid = (start + end) / 2;
			int i_4_ = start;
			float f = array[mid];
			array[mid] = array[end];
			array[end] = f;
			int i_5_ = indices[mid];
			indices[mid] = indices[end];
			indices[end] = i_5_;
			for (int i_6_ = start; i_6_ < end; i_6_++) {
				if (array[i_6_] > f) {
					float f_7_ = array[i_6_];
					array[i_6_] = array[i_4_];
					array[i_4_] = f_7_;
					int i_8_ = indices[i_6_];
					indices[i_6_] = indices[i_4_];
					indices[i_4_++] = i_8_;
				}
			}
			array[end] = array[i_4_];
			array[i_4_] = f;
			indices[end] = indices[i_4_];
			indices[i_4_] = i_5_;
			sort(array, indices, start, i_4_ - 1);
			sort(array, indices, i_4_ + 1, end);
		}
	}

	static void sort(long[] array, int[] indices, int i, int i_4_) {
		if (i < i_4_) {
			int i_6_ = (i + i_4_) / 2;
			int i_7_ = i;
			long l = array[i_6_];
			array[i_6_] = array[i_4_];
			array[i_4_] = l;
			int i_8_ = indices[i_6_];
			indices[i_6_] = indices[i_4_];
			indices[i_4_] = i_8_;
			int i_9_ = l == 9223372036854775807L ? 0 : 1;
			for (int i_10_ = i; i_10_ < i_4_; i_10_++) {
				if (array[i_10_] < (i_10_ & i_9_) + l) {
					long l_11_ = array[i_10_];
					array[i_10_] = array[i_7_];
					array[i_7_] = l_11_;
					int i_12_ = indices[i_10_];
					indices[i_10_] = indices[i_7_];
					indices[i_7_++] = i_12_;
				}
			}
			array[i_4_] = array[i_7_];
			array[i_7_] = l;
			indices[i_4_] = indices[i_7_];
			indices[i_7_] = i_8_;
			sort(array, indices, i, i_7_ - 1);
			sort(array, indices, i_7_ + 1, i_4_);
		}
	}

	public static void fill(int[] array, int index, int length, int value) {
		length = index + length - 7;
		while (index < length) {
			array[index++] = value;
			array[index++] = value;
			array[index++] = value;
			array[index++] = value;
			array[index++] = value;
			array[index++] = value;
			array[index++] = value;
			array[index++] = value;
		}

		length += 7;
		while (index < length) {
			array[index++] = value;
		}
	}

	static void sort(String[] strings, int[] indices, int i, int i_1_) {
		if (i < i_1_) {
			int i_3_ = (i + i_1_) / 2;
			int i_4_ = i;
			String string = strings[i_3_];
			strings[i_3_] = strings[i_1_];
			strings[i_1_] = string;
			int i_5_ = indices[i_3_];
			indices[i_3_] = indices[i_1_];
			indices[i_1_] = i_5_;
			for (int i_6_ = i; i_6_ < i_1_; i_6_++) {
				if (null == string || null != strings[i_6_] && strings[i_6_].compareTo(string) < (i_6_ & 0x1)) {
					String string_7_ = strings[i_6_];
					strings[i_6_] = strings[i_4_];
					strings[i_4_] = string_7_;
					int i_8_ = indices[i_6_];
					indices[i_6_] = indices[i_4_];
					indices[i_4_++] = i_8_;
				}
			}
			strings[i_1_] = strings[i_4_];
			strings[i_4_] = string;
			indices[i_1_] = indices[i_4_];
			indices[i_4_] = i_5_;
			sort(strings, indices, i, i_4_ - 1);
			sort(strings, indices, 1 + i_4_, i_1_);
		}
	}

	public static void sort(String[] strings, int[] indices) {
		sort(strings, indices, 0, strings.length - 1);
	}

	public static void sort(int[] indices, Object[] objects, int i, int i_4_) {
		if (i < i_4_) {
			int i_6_ = (i + i_4_) / 2;
			int i_7_ = i;
			int i_8_ = indices[i_6_];
			indices[i_6_] = indices[i_4_];
			indices[i_4_] = i_8_;
			Object object = objects[i_6_];
			objects[i_6_] = objects[i_4_];
			objects[i_4_] = object;
			int i_9_ = i_8_ == 2147483647 ? 0 : 1;
			for (int i_10_ = i; i_10_ < i_4_; i_10_++) {
				if (indices[i_10_] < (i_10_ & i_9_) + i_8_) {
					int i_11_ = indices[i_10_];
					indices[i_10_] = indices[i_7_];
					indices[i_7_] = i_11_;
					Object object_12_ = objects[i_10_];
					objects[i_10_] = objects[i_7_];
					objects[i_7_++] = object_12_;
				}
			}
			indices[i_4_] = indices[i_7_];
			indices[i_7_] = i_8_;
			objects[i_4_] = objects[i_7_];
			objects[i_7_] = object;
			sort(indices, objects, i, i_7_ - 1);
			sort(indices, objects, i_7_ + 1, i_4_);
		}
	}

	public static void sort(int[] indices, Object[] objects) {
		sort(indices, objects, 0, indices.length - 1);
	}

}