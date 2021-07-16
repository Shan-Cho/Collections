package com.chouguleindustries.collectionss.mobilenumber;

import java.util.Collection;
import java.util.Iterator;
import java.util.ArrayList;

public class MobileNumber {
	public static void main(String[] args) {

		// group of data

		long sim1 = 9847983002L;
		long sim2 = 9809704293L;
		long sim3 = 9889073129L;
		long sim4 = 9807324190L;
		long sim5 = 9812120090L;
		long sim6 = 9814439088L;
		long sim7 = 9877031132L;
		long sim8 = 9888043221L;
		long sim9 = 9880034792L;
		long sim10 = 98432324344L;

		Collection collection = new ArrayList();

		boolean added = false;
		added = collection.add(sim1);
		added = collection.add(sim2);
		added = collection.add(sim3);
		added = collection.add(sim4);
		added = collection.add(sim5);
		added = collection.add(sim6);
		added = collection.add(sim7);
		added = collection.add(sim8);
		added = collection.add(sim9);
		added = collection.add(sim10);
		added = collection.add(9898989898L);
		System.out.println(added);

		int total = collection.size();
		System.out.println(total);

		// collection.clear();

		System.out.println(collection.size());

		long check = 9880034792L;
		boolean contain = collection.contains(check);
		System.out.println("contain :" + contain);

		boolean removed = collection.remove(9809890890L);
		System.out.println(removed);

		Iterator iterator = collection.iterator(); // impl Iterator

		iterator.hasNext();
		Object object = iterator.next();
		System.out.println(object);

		iterator.hasNext();
		iterator.hasNext();
		iterator.hasNext();
		Object secret = iterator.next();
		System.out.println("Private Number:" + secret);
	}

}

