package com.chouguleindustries.colectionss.methods.color;

import java.util.*;

public class ColorsDTO {

	public static void main(String[] args) {

		List<String> color = new ArrayList<String>();

		// 1 adding elements to the list

		color.add("Yellow");
		color.add("Brown");
		color.add("White");
		color.add("Black");
		color.add("Pink");
		color.add("Blue");
		color.add("Maroon");
		color.add("Orange");
		color.add("Navy Blue");
		color.add("Grey");
		color.add("Purple");
		color.add("Brown");

		System.out.println(" Total number of colors in list: " + color.size());

		// Iterating the List element using for-each loop
		for (String colorPalette : color)
			System.out.println(colorPalette);

		// 2 get & set methods for list

		System.out.println(" Color to get is: " + color.get(1));
		// get by index number
		color.set(1, "Teal");
		// set by index number and value to be replaced
		for (String colorPalette : color)
			System.out.println(colorPalette);

		// 3 index of

		int indexOfGrey = color.indexOf("Grey");
		System.out.println(" Index of Grey is:" + indexOfGrey);

		// 4 last index of

		int lastIndexOf = color.lastIndexOf("Black");
		System.out.println(" Last index of Black: " + lastIndexOf);

		// 5 contains

		boolean pinkThere = color.contains("Pink");
		System.out.println(" Is color Pink in list? " + pinkThere);

		// 6 remove

		boolean removeBrown = color.remove("Brown");
		System.out.println(" Removing Brown from list: " + removeBrown);
		for (String colorPalette : color)
			System.out.println(colorPalette);

		List<String> moreColors = new ArrayList<String>();

		moreColors.add("Golden");
		moreColors.add("Ruby");
		moreColors.add("French Rose");
		moreColors.add("Lavender");
		moreColors.add("Green");
		moreColors.add("Olive");
		moreColors.add("Jade");
		moreColors.add("Lime");
		moreColors.add("Mint");
		moreColors.add("Army");

		// 7 add all

		boolean addAll = color.addAll(11, moreColors);
		System.out.println(" Using Add all method: " + addAll);

		for (String colorPalette : color)
			System.out.println(colorPalette);

		/*
		 * 8 remove all
		 * 
		 * boolean removeAll = color.removeAll(moreColors);
		 * System.out.println(removeAll);
		 */

		// 9 contains all

		boolean containsAll = color.containsAll(moreColors);
		System.out.println(" Checking contains all: " + containsAll);

		// sorting

		Collections.sort(color);
		System.out.println(" Below data is sorted");

		for (String colorPalette : color)
			System.out.println(colorPalette);

		// retain all = check common things in both

		// iterator

		ListIterator<String> itr = color.listIterator(21);

		System.out.println(" ITR Index " + itr.nextIndex());

		while (itr.hasPrevious()) {
			String e = itr.previous();
			System.out.println(e);
		}
		System.out.println(" ***********");

		while (itr.hasNext()) {
			String string = itr.next();
			System.out.println(string);
		}
		System.out.println(color.size());
	}
}
