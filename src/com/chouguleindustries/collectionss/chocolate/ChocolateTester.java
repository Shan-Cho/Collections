package com.chouguleindustries.collectionss.chocolate;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class ChocolateTester {

	public static void main(String[] args) {

		ChocolateDTO dto = new ChocolateDTO(Brand.HERSHEYS, Color.BROWN, 222D, 2021D, "Rectangle", 700D, true);

		ChocolateDTO dto1 = new ChocolateDTO(Brand.BROOKSIDE, Color.WHITE, 333D, 2020D, "Round", 800D, false);

		ChocolateDTO dto2 = new ChocolateDTO(Brand.FERREROROCHER, Color.RED, 444D, 2019, "Square", 999D, false);

		Collection<ChocolateDTO> collection = new ArrayList<ChocolateDTO>();
		collection.add(dto);
		collection.add(dto1);
		collection.add(dto2);

		Iterator<ChocolateDTO> itr = collection.iterator();
		while (itr.hasNext()) {
			ChocolateDTO refOfDTO = itr.next();
			System.out.println(refOfDTO);
		}

	}
}
