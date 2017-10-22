package com.jagex;

public class Class483 {

	public static byte charToByte(char c) {
		byte value;
		if (c > 0 && c < '\u0080' || c >= '\u00a0' && c <= '\u00ff') {
			value = (byte) c;
		} else if ('\u20ac' == c) {
			value = (byte) -128;
		} else if ('\u201a' == c) {
			value = (byte) -126;
		} else if (c == '\u0192') {
			value = (byte) -125;
		} else if (c == '\u201e') {
			value = (byte) -124;
		} else if ('\u2026' == c) {
			value = (byte) -123;
		} else if (c == '\u2020') {
			value = (byte) -122;
		} else if (c == '\u2021') {
			value = (byte) -121;
		} else if ('\u02c6' == c) {
			value = (byte) -120;
		} else if (c == '\u2030') {
			value = (byte) -119;
		} else if ('\u0160' == c) {
			value = (byte) -118;
		} else if (c == '\u2039') {
			value = (byte) -117;
		} else if (c == '\u0152') {
			value = (byte) -116;
		} else if ('\u017d' == c) {
			value = (byte) -114;
		} else if ('\u2018' == c) {
			value = (byte) -111;
		} else if ('\u2019' == c) {
			value = (byte) -110;
		} else if (c == '\u201c') {
			value = (byte) -109;
		} else if ('\u201d' == c) {
			value = (byte) -108;
		} else if ('\u2022' == c) {
			value = (byte) -107;
		} else if ('\u2013' == c) {
			value = (byte) -106;
		} else if (c == '\u2014') {
			value = (byte) -105;
		} else if (c == '\u02dc') {
			value = (byte) -104;
		} else if ('\u2122' == c) {
			value = (byte) -103;
		} else if ('\u0161' == c) {
			value = (byte) -102;
		} else if ('\u203a' == c) {
			value = (byte) -101;
		} else if ('\u0153' == c) {
			value = (byte) -100;
		} else if (c == '\u017e') {
			value = (byte) -98;
		} else if (c == '\u0178') {
			value = (byte) -97;
		} else {
			value = (byte) 63;
		}

		return value;
	}

	Class483() throws Throwable {
		throw new Error();
	}

}