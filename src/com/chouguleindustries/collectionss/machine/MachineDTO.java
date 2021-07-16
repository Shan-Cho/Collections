package com.chouguleindustries.collectionss.machine;

import java.io.Serializable;

public class MachineDTO implements Serializable {

	private String brand;
	private Type type;
	private String material;
	private int cost;

	MachineDTO() {
		System.out.println("default");
	}

	public MachineDTO(String brand, Type type, String material, int cost) {
		super();
		this.brand = brand;
		this.type = type;
		this.material = material;
		this.cost = cost;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public String getMaterial() {
		return material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	public int getCost() {
		return cost;
	}

	public void setCost(int cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Machine [brand=" + brand + ", type=" + type + ", material=" + material + ", cost=" + cost + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof MachineDTO) {
			System.out.println("object is passed to the machine");
			MachineDTO machine = (MachineDTO) obj;
			if (this.brand.equals(machine.brand) && this.material.equals(machine.material)) {
				System.out.println("both are same");
				return true;
			} else {
				System.out.println("both are diffferent");
				return false;
			}

		}
		return false;
	}
}
