package com.chouguleindustries.colectionss.tourism;

import java.io.Serializable;

public class TourismDTO implements Serializable {

	private String place;
	private boolean isInIndia;
	private TourismType type;
	private double costEstimatePerHead;
	private String famousFood;

	public TourismDTO() {

	}

	public TourismDTO(String place, boolean isInIndia, TourismType type, double costEstimatePerHead,
			String famousFood) {
		super();
		this.place = place;
		this.isInIndia = isInIndia;
		this.type = type;
		this.costEstimatePerHead = costEstimatePerHead;
		this.famousFood = famousFood;
	}

	public String getPlace() {
		return place;
	}

	public void setPlace(String place) {
		this.place = place;
	}

	public boolean isInIndia() {
		return isInIndia;
	}

	public void setisInIndia(boolean isInIndia) {
		this.isInIndia = isInIndia;
	}

	public TourismType getType() {
		return type;
	}

	public void setType(TourismType type) {
		this.type = type;
	}

	public double getCostEstimatePerHead() {
		return costEstimatePerHead;
	}

	public void setCostEstimatePerHead(double costEstimatePerHead) {
		this.costEstimatePerHead = costEstimatePerHead;
	}

	public String getFamousFood() {
		return famousFood;
	}

	public void setFamousFood(String famousFood) {
		this.famousFood = famousFood;
	}

	@Override
	public String toString() {
		return "TourismDTO [place=" + place + ", isInIndia=" + isInIndia + ", type=" + type + ", costEstimatePerHead="
				+ costEstimatePerHead + ", famousFood=" + famousFood + "]";
	}

}
