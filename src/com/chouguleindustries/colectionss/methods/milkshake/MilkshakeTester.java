package com.chouguleindustries.colectionss.methods.milkshake;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MilkshakeTester {

	public static void main(String[] args) {

		MilkshakeDTO dto = new MilkshakeDTO("Keventers", "Kitkat", 199, 400);
		MilkshakeDTO dto1 = new MilkshakeDTO("Polar Bear", "Oreo", 299, 300);
		MilkshakeDTO dto2 = new MilkshakeDTO("Cafe Coffee Day", "Cold coffee", 220, 200);
		MilkshakeDTO dto3 = new MilkshakeDTO("Starbucks", "Caramel Frapuccino", 499, 200);
		MilkshakeDTO dto4 = new MilkshakeDTO("Frozen Bottle", "Butterscotch", 177, 270);
		MilkshakeDTO dto7 = new MilkshakeDTO("Hersheys", "Strawberry", 300, 400);
		MilkshakeDTO dto8 = new MilkshakeDTO("Milkshake And Co", "Double Chocolate ", 229, 333);

		List<MilkshakeDTO> milkshake = new ArrayList<>();

		milkshake.add(dto8);
		milkshake.add(dto7);
		milkshake.add(dto4);
		milkshake.add(dto3);
		milkshake.add(dto2);
		milkshake.add(dto1);
		milkshake.add(dto);

		System.out.println("Unsorted");
		for (MilkshakeDTO milkshakeDTO : milkshake) {
			System.out.println(milkshakeDTO);
		}

		Collections.sort(milkshake, new Sortbybrand());

		System.out.println("Sort by brand");
		for (MilkshakeDTO milkshakeDTO : milkshake) {
			System.out.println(milkshakeDTO);
		}

		Collections.sort(milkshake, new Sortbyprice());

		System.out.println("Sorted by price");

		for (MilkshakeDTO milkshakeDTO : milkshake) {
			System.out.println(milkshakeDTO);
		}
	}
}