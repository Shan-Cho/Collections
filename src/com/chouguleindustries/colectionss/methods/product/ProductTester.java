package com.chouguleindustries.colectionss.methods.product;

import java.util.*;

public class ProductTester {

	public static void main(String[] args) {

		ProductDTO dto = new ProductDTO("Pepsi", "PepsiCo", 40D, 700D);
		ProductDTO dto1 = new ProductDTO("Thumbs Up", "Coca Cola", 90D, 1000D);
		ProductDTO dto2 = new ProductDTO("Mount and Dew", "PepsiCo", 77D, 700D);
		ProductDTO dto3 = new ProductDTO("Frooti", "Parle Agro", 20D, 200D);
		ProductDTO dto4 = new ProductDTO("Diet Coke", "Coca Cola", 70D, 400D);
		ProductDTO dto7 = new ProductDTO("Slice", "Tropicana", 33D, 400D);

		List<ProductDTO> softdrinks = new ArrayList<>();

		softdrinks.add(dto);
		softdrinks.add(dto1);
		softdrinks.add(dto2);
		softdrinks.add(dto3);
		softdrinks.add(dto4);
		softdrinks.add(dto7);

		for (ProductDTO soft : softdrinks) {
			System.out.println(soft);
		}

		System.out.println(" Below list is sorted according to price");
		Collections.sort(softdrinks);

		for (ProductDTO soft : softdrinks) {
			System.out.println(soft);
		}
	}

}
