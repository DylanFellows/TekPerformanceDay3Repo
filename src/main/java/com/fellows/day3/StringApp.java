package com.fellows.day3;

import com.fellows.day3.generator.StringGenerator;
import com.fellows.day3.generator.StringGeneratorImpl;
import com.fellows.day3.search.StringSearchImpl;

public class StringApp {

	public static void main(String[] args) {
		
		StringGenerator stringGenerator = new StringGeneratorImpl();
		
		String[] array = {"This is me", "Hello there", "I am here", "The last one", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
		
		System.out.println(StringSearchImpl.beginsOrEndsWith("Hel", array));
		System.out.println(StringSearchImpl.beginsOrEndsWith("here", array));
		System.out.println(StringSearchImpl.beginsOrEndsWith("ere", array));
		System.out.println(StringSearchImpl.beginsOrEndsWith("Thi", array));
		System.out.println(StringSearchImpl.beginsOrEndsWith("en", array));
		
		System.out.println(stringGenerator.concatenate(10));
	}
	
}
