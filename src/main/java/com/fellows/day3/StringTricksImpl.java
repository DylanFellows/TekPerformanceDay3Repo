package com.fellows.day3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringTricksImpl implements StringTricks {

	public int beginsOrEndsWith(String searchValue, String[] array) {
		int i = 0;
		for (String searchString : array) {
			if (searchString.startsWith(searchValue) || searchString.endsWith(searchValue)) {
				return i;
			}
			i++;
		}
		return -1;
	}

	public String concatenate(int sizeOfArray) {
		String[] randomStringArray = generateRandomArray(sizeOfArray);
		StringBuffer sb = new StringBuffer();
		for (String s : randomStringArray) {
			sb.append(s);
		}
		return sb.toString();
	}

	public String[] generateRandomArray(int sizeOfArray) {
		StringBuffer sb = new StringBuffer();
		List<String> list = new ArrayList<>();
		for(int i = 0; i < sizeOfArray; i++) {
			int sizeOfString = getRandomNumberInRange(1,12);
			for(int j = 0; j < sizeOfString; j++) {
				sb.append(String.valueOf(Character.toChars(getRandomNumberInRange(65, 90))));
			}
			list.add(sb.toString());
			sb.delete(0, sb.length());
		}
		System.out.println(list);
		return list.toArray(new String[list.size()]);
	}

	private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.ints(min, (max + 1)).findFirst().getAsInt();
	}
}
