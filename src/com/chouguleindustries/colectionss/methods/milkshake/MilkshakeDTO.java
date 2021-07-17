package com.chouguleindustries.colectionss.methods.milkshake;

import java.io.*;

public class MilkshakeDTO implements Serializable {

	String brand;
	private String flavour;
	int price;
	private int quantity;

	MilkshakeDTO() {

	}

	public MilkshakeDTO(String brand, String flavour, int price, int quantity) {
		super();
		this.brand = brand;
		this.flavour = flavour;
		this.price = price;
		this.quantity = quantity;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getFlavour() {
		return flavour;
	}

	public void setFlavour(String flavour) {
		this.flavour = flavour;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "MilkshakeDTO [brand=" + brand + ", flavour=" + flavour + ", price=" + price + ", quantity=" + quantity
				+ "]";
	}

}
