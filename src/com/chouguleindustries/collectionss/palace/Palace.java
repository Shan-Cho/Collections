package com.chouguleindustries.collectionss.palace;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class Palace {

	public static void main(String[] args) {

		// group of data

		String palace1 = "Grand palace";
		String palace2 = "Peterhof palace";
		String palace3 = "Buckingham palace";
		String palace4 = "Schonbrunn";
		String palace5 = "Potala";
		String palace6 = "Hawa mahal";
		String palace7 = "Topkapie";
		String palace8 = "Palace of Versailles";
		String palace9 = "Alhambra";
		String palace10 = "Winter palace";

		Collection collection = new ArrayList();

		boolean added = false;
		added = collection.add(palace1);
		added = collection.add(palace2);
		added = collection.add(palace3);
		added = collection.add(palace4);
		added = collection.add(palace5);
		added = collection.add(palace6);
		added = collection.add(palace7);
		added = collection.add(palace8);
		added = collection.add(palace9);
		added = collection.add(palace10);
		added = collection.add("Lake Palace");
		System.out.println(added);

		int total = collection.size();
		System.out.println(total);

		// collection.clear();

		System.out.println(collection.size());

		String check = "Lake Palace";
		boolean contain = collection.contains(check);
		System.out.println("contain: " + contain);

		boolean removed = collection.remove("Mysore Palace");
		System.out.println(removed);

		Iterator iterator = collection.iterator(); // impl Iterator

		iterator.hasNext();
		Object object = iterator.next();
		System.out.println(object);

		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		Object secret = iterator.next();
		System.out.println("Secret: " + secret);
	}
}
