package com.jagex;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InvalidClassException;
import java.io.ObjectInputStream;
import java.io.OptionalDataException;
import java.io.StreamCorruptedException;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectionRequest extends Linkable {

	static Deque<ReflectionRequest> active = new Deque<ReflectionRequest>();

	public static void decode(Buffer buffer) {
		ReflectionRequest request = new ReflectionRequest();
		request.members = buffer.readUByte() * -2004633233;
		request.identifier = buffer.readInt() * -334732271;
		request.types = new int[1683473807 * request.members];
		request.statuses = new int[1683473807 * request.members];
		request.fields = new Field[1683473807 * request.members];
		request.fieldValues = new int[request.members * 1683473807];
		request.methods = new Method[1683473807 * request.members];
		request.arguments = new byte[1683473807 * request.members][][];

		for (int member = 0; member < request.members * 1683473807; member++) {
			try {
				int type = buffer.readUByte();
				if (type == 0 || 1 == type || type == 2) {
					String className = buffer.readString();
					String fieldName = buffer.readString();

					int value = 0;
					if (1 == type) {
						value = buffer.readInt();
					}
					request.types[member] = type;
					request.fieldValues[member] = value;

					if (ReflectionRequest.classForName(className).getClassLoader() == null) {
						throw new SecurityException();
					}

					request.fields[member] = ReflectionRequest.classForName(className).getDeclaredField(fieldName);
				} else if (3 == type || type == 4) {
					String className = buffer.readString();
					String methodName = buffer.readString();
					int parameterCount = buffer.readUByte();

					String[] parameterClassNames = new String[parameterCount];
					for (int index = 0; index < parameterCount; index++) {
						parameterClassNames[index] = buffer.readString();
					}

					String returnClass = buffer.readString();

					byte[][] arguments = new byte[parameterCount][];
					if (type == 3) {
						for (int index = 0; index < parameterCount; index++) {
							int count = buffer.readInt();
							arguments[index] = new byte[count];
							buffer.readBytes(arguments[index], 0, count);
						}
					}

					request.types[member] = type;
					Class[] params = new Class[parameterCount];
					for (int index = 0; index < parameterCount; index++) {
						params[index] = ReflectionRequest.classForName(parameterClassNames[index]);
					}

					Class result = ReflectionRequest.classForName(returnClass);
					if (ReflectionRequest.classForName(className).getClassLoader() == null) {
						throw new SecurityException();
					}

					Method[] methods = ReflectionRequest.classForName(className).getDeclaredMethods();
					for (Method method : methods) {
						if (method.getName().equals(methodName)) {
							Class[] parameters = method.getParameterTypes();
							if (parameters.length == params.length) {

								boolean match = true;
								for (int parameter = 0; parameter < params.length; parameter++) {
									if (params[parameter] != parameters[parameter]) {
										match = false;
										break;
									}
								}

								if (match && result == method.getReturnType()) {
									request.methods[member] = method;
								}
							}
						}
					}
					request.arguments[member] = arguments;
				}
			} catch (ClassNotFoundException classnotfoundexception) {
				request.statuses[member] = -1;
			} catch (SecurityException securityexception) {
				request.statuses[member] = -2;
			} catch (NullPointerException nullpointerexception) {
				request.statuses[member] = -3;
			} catch (Exception exception) {
				request.statuses[member] = -4;
			} catch (Throwable throwable) {
				request.statuses[member] = -5;
			}
		}

		active.pushBack(request);
	}

	public static void pulseActive(FrameBuffer buffer) {
		ReflectionRequest request = active.head();
		if (null != request) {
			int start = -165875887 * buffer.offset;
			buffer.writeInt(1515523313 * request.identifier);

			for (int index = 0; index < 1683473807 * request.members; index++) {
				if (0 != request.statuses[index]) {
					buffer.writeByte(request.statuses[index]);
				} else {
					try {
						int type = request.types[index];

						if (type == 0) {
							Field field = request.fields[index];
							int value = field.getInt(null);

							buffer.writeByte(0);
							buffer.writeInt(value);
						} else if (1 == type) {
							Field field = request.fields[index];
							field.setInt(null, request.fieldValues[index]);
							buffer.writeByte(0);
						} else if (2 == type) {
							Field field = request.fields[index];
							int modifiers = field.getModifiers();

							buffer.writeByte(0);
							buffer.writeInt(modifiers);
						}

						if (type == 3) {
							Method method = request.methods[index];
							byte[][] arguments = request.arguments[index];
							Object[] args = new Object[arguments.length];

							for (int argument = 0; argument < arguments.length; argument++) {
								ObjectInputStream input = new ObjectInputStream(new ByteArrayInputStream(
										arguments[argument]));
								args[argument] = input.readObject();
							}

							Object result = method.invoke(null, args);
							if (result == null) {
								buffer.writeByte(0);
							} else if (result instanceof Number) {
								buffer.writeByte(1);
								buffer.writeLong(((Number) result).longValue());
							} else if (result instanceof String) {
								buffer.writeByte(2);
								buffer.writeCString((String) result);
							} else {
								buffer.writeByte(4);
							}
						} else if (4 == type) {
							Method method = request.methods[index];
							int modifiers = method.getModifiers();
							buffer.writeByte(0);
							buffer.writeInt(modifiers);
						}
					} catch (ClassNotFoundException classnotfoundexception) {
						buffer.writeByte(-10);
					} catch (InvalidClassException invalidclassexception) {
						buffer.writeByte(-11);
					} catch (StreamCorruptedException streamcorruptedexception) {
						buffer.writeByte(-12);
					} catch (OptionalDataException optionaldataexception) {
						buffer.writeByte(-13);
					} catch (IllegalAccessException illegalaccessexception) {
						buffer.writeByte(-14);
					} catch (IllegalArgumentException illegalargumentexception) {
						buffer.writeByte(-15);
					} catch (InvocationTargetException invocationtargetexception) {
						buffer.writeByte(-16);
					} catch (SecurityException securityexception) {
						buffer.writeByte(-17);
					} catch (IOException ioexception) {
						buffer.writeByte(-18);
					} catch (NullPointerException nullpointerexception) {
						buffer.writeByte(-19);
					} catch (Exception exception) {
						buffer.writeByte(-20);
					} catch (Throwable throwable) {
						buffer.writeByte(-21);
					}
				}
			}

			buffer.crc32(start);
			request.unlink();
		}
	}

	public static boolean remaining() {
		return active.head() != null;
	}

	byte[][][] arguments;
	Field[] fields;
	int[] fieldValues;
	int identifier;
	int members;
	Method[] methods;
	int[] statuses;
	int[] types;

	static Class classForName(String string) throws ClassNotFoundException {
		if (string.equals("B")) {
			return Byte.TYPE;
		} else if (string.equals("I")) {
			return Integer.TYPE;
		} else if (string.equals("S")) {
			return Short.TYPE;
		} else if (string.equals("J")) {
			return Long.TYPE;
		} else if (string.equals("Z")) {
			return Boolean.TYPE;
		} else if (string.equals("F")) {
			return Float.TYPE;
		} else if (string.equals("D")) {
			return Double.TYPE;
		} else if (string.equals("C")) {
			return Character.TYPE;
		} else if (string.equals("void")) {
			return Void.TYPE;
		}

		return Class.forName(string);
	}

	public static void resetActiveRequests() {
		active = new Deque();
	}

}