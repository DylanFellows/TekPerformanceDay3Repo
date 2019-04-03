package com.fellows.day3.generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class StringGeneratorImpl implements StringGenerator {

	public String concatenate(int sizeOfArray) {
		String[] randomStringArray = generateRandomArray(sizeOfArray);
		StringBuffer arrayString = new StringBuffer();
		for (String stringValue : randomStringArray) {
			arrayString.append(stringValue);
		}
		return arrayString.toString();
	}

	public String[] generateRandomArray(int sizeOfArray) {
		StringBuffer randomString = new StringBuffer();
		List<String> generatedList = new ArrayList<>();
		for(int i = 0; i < sizeOfArray; i++) {
			int sizeOfString = getRandomNumberInRange(1,12);
			for(int j = 0; j < sizeOfString; j++) {
				randomString.append(String.valueOf(Character.toChars(getRandomNumberInRange(65, 90))));
			}
			generatedList.add(randomString.toString());
			randomString.delete(0, randomString.length());
		}
		System.out.println(generatedList);
		return generatedList.toArray(new String[generatedList.size()]);
	}

	private static int getRandomNumberInRange(int min, int max) {
		if (min >= max) {
			throw new IllegalArgumentException("max must be greater than min");
		}

		Random r = new Random();
		return r.ints(min, (max + 1)).findFirst().getAsInt();
	}
}
