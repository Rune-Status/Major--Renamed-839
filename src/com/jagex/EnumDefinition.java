package com.jagex;

import java.io.Serializable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class EnumDefinition implements Definition, Interface71 {

	public CharacterType keyType;
	public CharacterType valueType;
	int defaultInt;
	String defaultString = "null";
	HashMap inverse;
	Map<Integer, Serializable> map;
	Object[] objects;
	int size = 0;
	public static EnumDefinitionLoader loader;

	EnumDefinition() {

	}

	public boolean containsValue(Object object) {
		if (0 == 744846111 * size) {
			return false;
		} else if (inverse == null) {
			createInverse();
		}

		return inverse.containsKey(object);
	}

	@Override
	public void decode(Buffer buffer) {
		for (;;) {
			int opcode = buffer.readUByte();
			if (opcode == 0) {
				break;
			}

			decode(buffer, opcode);
		}
	}

	public int getInt(int id) {
		Object object = get(id);
		if (null == object) {
			return defaultInt * 263709853;
		}

		return ((Integer) object).intValue();
	}

	public int[] getKeys(Object object) {
		if (0 == 744846111 * size) {
			return null;
		} else if (null == inverse) {
			createInverse();
		}

		return (int[]) inverse.get(object);
	}

	public int getSize() {
		return size * 744846111;
	}

	public String getString(int id) {
		Object object = get(id);
		if (null == object) {
			return defaultString;
		}

		return (String) object;
	}

	@Override
	public void method35() {

	}

	@Override
	public void method40(int i) {

	}

	@Override
	public void setId(int id) {

	}

	void createInverse() {
		Map<Object, List<Integer>> inverse = new HashMap<Object, List<Integer>>();

		if (null != objects) {
			for (int index = 0; index < objects.length; index++) {
				if (objects[index] != null) {
					Object object = objects[index];
					List list = inverse.get(object);

					if (null == list) {
						list = new LinkedList();
						inverse.put(object, list);
					}

					list.add(index);
				}
			}
		} else if (null != map) {
			Iterator<Map.Entry<Integer, Serializable>> iterator = map.entrySet().iterator();

			while (iterator.hasNext()) {
				Map.Entry<Integer, Serializable> entry = iterator.next();
				Serializable object = entry.getValue();
				List<Integer> list = inverse.get(object);

				if (list == null) {
					list = new LinkedList();
					inverse.put(object, list);
				}

				list.add(entry.getKey());
			}
		} else {
			throw new IllegalStateException();
		}

		this.inverse = new HashMap();
		Iterator<Map.Entry<Object, List<Integer>>> inverseIterator = inverse.entrySet().iterator();

		while (inverseIterator.hasNext()) {
			Map.Entry<Object, List<Integer>> entry = inverseIterator.next();
			List<Integer> list = entry.getValue();
			int[] ints = new int[list.size()];
			int index = 0;
			Iterator<Integer> iterator = list.iterator();

			while (iterator.hasNext()) {
				Integer integer = iterator.next();
				ints[index++] = integer.intValue();
			}

			if (null == objects) {
				Arrays.sort(ints);
			}

			this.inverse.put(entry.getKey(), ints);
		}
	}

	void decode(Buffer buffer, int opcode) {
		if (1 == opcode) {
			char c = Class215.byteToChar(buffer.readByte());
			keyType = CharacterType.valueOf(c);
		} else if (opcode == 2) {
			char c = Class215.byteToChar(buffer.readByte());
			valueType = CharacterType.valueOf(c);
		} else if (opcode == 3) {
			defaultString = buffer.readString();
		} else if (4 == opcode) {
			defaultInt = buffer.readInt() * 1574289845;
		} else if (opcode == 5 || opcode == 6) {
			size = buffer.readUShort() * 213928159;
			map = new HashMap<Integer, Serializable>(744846111 * size);

			for (int i = 0; i < size * 744846111; i++) {
				int id = buffer.readInt();
				Serializable serializable;

				if (opcode == 5) {
					serializable = buffer.readString();
				} else {
					serializable = new Integer(buffer.readInt());
				}

				map.put(id, serializable);
			}
		} else if (7 == opcode || 8 == opcode) {
			int count = buffer.readUShort();
			size = buffer.readUShort() * 213928159;
			objects = new Object[count];

			for (int i = 0; i < size * 744846111; i++) {
				int index = buffer.readUShort();
				if (opcode == 7) {
					objects[index] = buffer.readString();
				} else {
					objects[index] = new Integer(buffer.readInt());
				}
			}
		} else if (opcode == 101) {
			keyType = CompressionType.findIdentifiable(CharacterType.values(), buffer.readUSmart());
		} else if (opcode == 102) {
			valueType = CompressionType.findIdentifiable(CharacterType.values(), buffer.readUSmart());
		}
	}

	Object get(int id) {
		if (null != objects) {
			if (id < 0 || id >= objects.length) {
				return null;
			}

			return objects[id];
		} else if (null != map) {
			return map.get(id);
		}

		return null;
	}

}