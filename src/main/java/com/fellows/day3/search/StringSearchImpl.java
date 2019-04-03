package com.fellows.day3.search;

public class StringSearchImpl {

	public static int beginsOrEndsWith(String searchValue, String[] array) {
		int i = 0;
		for (String searchString : array) {
			if (searchString.startsWith(searchValue) || searchString.endsWith(searchValue)) {
				return i;
			}
			i++;
		}
		throw new RuntimeException("Value not present within the array.");
	}
	
}
