package com.chouguleindustries.collectionss.cosmetics;

import java.io.Serializable;

public class CosmeticDTO implements Serializable {

	private Brand brand;
	private int cost;
	private String item;
	private boolean isImported;

	CosmeticDTO() {
		System.out.println("defalut");
	}

	public CosmeticDTO(Brand brand, int cost, String item, boolean isImported) {
		super();
		this.brand = brand;
		this.cost = cost;
		this.item = item;
		this.isImported = isImported;
	}

	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	public boolean isImported() {
		return isImported;
	}

	public void setImported(boolean isImported) {
		this.isImported = isImported;
	}

	@Override
	public String toString() {
		return "CosmeticDto [brand=" + brand + ", cost=" + cost + ", item=" + item + ", isImported=" + isImported + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof CosmeticDTO) {
			System.out.println("object is passed to cosmetics");
			CosmeticDTO cosmetic = (CosmeticDTO) obj;
			if (this.brand.equals(cosmetic.brand) && this.item.equals(cosmetic.item)) {
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
