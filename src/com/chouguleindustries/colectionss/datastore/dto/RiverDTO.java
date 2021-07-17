package com.chouguleindustries.colectionss.datastore.dto;

import java.io.Serializable;

public class RiverDTO implements Serializable {

	private String name;
	private String origin;
	private double length;
	private int noOfStates;
	private boolean hydroPlant;

	RiverDTO() {

	}

	public RiverDTO(String name, String origin, double length, int noOfStates, boolean hydroPlant) {
		super();
		this.name = name;
		this.origin = origin;
		this.length = length;
		this.noOfStates = noOfStates;
		this.hydroPlant = hydroPlant;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public int getNoOfStates() {
		return noOfStates;
	}

	public void setNoOfStates(int noOfStates) {
		this.noOfStates = noOfStates;
	}

	public boolean isHydroPlant() {
		return hydroPlant;
	}

	public void setHydroPlant(boolean hydroPlant) {
		this.hydroPlant = hydroPlant;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (obj instanceof RiverDTO) {
			RiverDTO other = (RiverDTO) obj;
			if (this.name.equals(other.getName()))
				return true;
		}
		return false;
	}

	@Override
	public String toString() {
		return "RiverDTO [name=" + name + ", origin=" + origin + ", length=" + length + ", noOfStates=" + noOfStates
				+ ", hydroPlant=" + hydroPlant + "]";
	}
}
