package com.fellows.day3;

public class StringApp {

	public static void main(String[] args) {
		StringTricks stringTricks = new StringTricksImpl();
		String[] array = {"This is me", "Hello there", "I am here", "The last one", "Five", "Six", "Seven", "Eight", "Nine", "Ten"};
		System.out.println(stringTricks.beginsOrEndsWith("Hel", array));
		System.out.println(stringTricks.beginsOrEndsWith("here", array));
		System.out.println(stringTricks.beginsOrEndsWith("ere", array));
		System.out.println(stringTricks.beginsOrEndsWith("Thi", array));
		System.out.println(stringTricks.beginsOrEndsWith("en", array));
		System.out.println(stringTricks.concatenate(10));
	}
	
}
