package com.chouguleindustries.colectionss.methods.alcohols;

import java.io.Serializable;

public class AlcoholDTO implements Serializable, Comparable<AlcoholDTO> {

	private String brand;
	private double price;
	private boolean isItScotch;
	private double quantity;
	private String type;

	public AlcoholDTO() {

	}

	public AlcoholDTO(String brand, double price, boolean isItScotch, double quantity, String type) {
		super();
		this.brand = brand;
		this.price = price;
		this.isItScotch = isItScotch;
		this.quantity = quantity;
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public boolean isItScotch() {
		return isItScotch;
	}

	public void setItScotch(boolean isItScotch) {
		this.isItScotch = isItScotch;
	}

	public double getQuantity() {
		return quantity;
	}

	public void setQuantity(double quantity) {
		this.quantity = quantity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "AlcoholDTO [brand=" + brand + ", price=" + price + ", isItScotch=" + isItScotch + ", quantity="
				+ quantity + ", type=" + type + "]";
	}

	public int compareTo(AlcoholDTO other) {
		return (this.getBrand().compareTo(other.getBrand()));
	}
}
