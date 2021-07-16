package com.chouguleindustries.collectionss.chocolate;

import java.io.Serializable;

public class ChocolateDTO implements Serializable {

	private Brand brand;
	private Color color;
	private double price;
	private double manufacturingYear;
	private String size;
	private double calories;
	private boolean isItDarkChocolate;

	public ChocolateDTO() {
		System.out.println("invoking default ChocolateDTO");

	}

	public ChocolateDTO(Brand brand, Color color, double price, double manufacturingYear, String size, double calories,
			boolean isItDarkChocolate) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.manufacturingYear = manufacturingYear;
		this.size = size;
		this.calories = calories;
		this.isItDarkChocolate = isItDarkChocolate;
	}

	@Override
	public String toString() {
		return "ChocolateDTO [brand=" + brand + ", color=" + color + ", price=" + price + ", manufacturingYear="
				+ manufacturingYear + ", size=" + size + ", calories=" + calories + ", isItDarkChocolate="
				+ isItDarkChocolate + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("invoked equals of Objects class from chocolate dto ");
		if (obj == null)
			return false;
		if (obj instanceof ChocolateDTO) {
			ChocolateDTO casted = (ChocolateDTO) obj;
			if (this.brand.equals(casted.brand) && this.color.equals(casted.color)) {
				System.out.println("both are same");
				return true;
				
			} else {
				System.out.println("both are diffrent");
				return false;
			}
		}
		return false;
	}
}
