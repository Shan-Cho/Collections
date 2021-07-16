package com.chouguleindustries.collectionss.session;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class CollectionSession {

	public static void main(String[] args) {

		// group of data

		String chemical1 = "Carbonmono";
		String chemical2 = "Sulphur";
		String chemical3 = "Sodium Hydroxide";
		String chemical4 = "Chloride";
		String chemical5 = "Phosphorous";
		String chemical6 = "Cynide";

		Collection collection = new ArrayList();
		
		boolean added = false;
		added = collection.add(chemical1);
		added = collection.add(chemical2);
		added = collection.add(chemical3);
		added = collection.add(chemical4);
		added = collection.add(chemical5);
		added = collection.add(chemical6);
		added = collection.add("Sodium Chloride");
		System.out.println(added);

		int total = collection.size();
		System.out.println(total);

		//collection.clear();

		System.out.println(collection.size());

		String check = "Sodium Chloride";
		boolean contain = collection.contains(check);
		System.out.println("contain" + contain);

		boolean removed = collection.remove("Chilli Powder");
		System.out.println(removed);

		Iterator iterator = collection.iterator(); // impl Iterator

		iterator.hasNext();
		Object obj = iterator.next();
		System.out.println(obj);

		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		Object secret = iterator.next();
		System.out.println("Secret " + secret);
	}
}
