package com.chouguleindustries.collectionss.actor;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class Actor {

	public static void main(String[] args) {

		// group of data

		String actor1 = "Tom Holland";
		String actor2 = "Stanlee";
		String actor3 = "Rober Downey Jr";
		String actor4 = "Chris Hemsworth";
		String actor5 = "Chandvik Boseman";
		String actor6 = "Chris Evans";
		String actor7 = "Scarlett Johansson";
		String actor8 = "Kevin Feige";
		String actor9 = "Chris Pratt";
		String actor10 = "Sebastian Stan";

		Collection collection = new ArrayList();

		boolean added = false;
		added = collection.add(actor1);
		added = collection.add(actor2);
		added = collection.add(actor3);
		added = collection.add(actor4);
		added = collection.add(actor5);
		added = collection.add(actor6);
		added = collection.add(actor7);
		added = collection.add(actor8);
		added = collection.add(actor9);
		added = collection.add(actor10);
		added = collection.add("James Gunn");
		System.out.println(added);

		int total = collection.size();
		System.out.println(total);

		// collection.clear();

		System.out.println(collection.size());

		String check = "James Gunn";
		boolean contain = collection.contains(check);
		System.out.println("contain: " + contain);

		boolean removed = collection.remove("Salman Khan");
		System.out.println(removed);

		Iterator iterator = collection.iterator(); // impl Iterator

		iterator.hasNext();
		Object object = iterator.next();
		System.out.println(object);

		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		Object secret = iterator.next();
		System.out.println("Secret entry in every movie by legend: " + secret);
	}

}
