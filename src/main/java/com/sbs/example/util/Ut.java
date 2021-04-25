package com.sbs.example.util;

public class Ut {
	public static String f(String format, Object... values) {
		return String.format(format, values);
	}

	public static int pi(String numeric, int defaultValue) {
		try {
			return Integer.parseInt(numeric);			
		}
		catch ( NumberFormatException e ) {
			return defaultValue;
		}
	}
}
