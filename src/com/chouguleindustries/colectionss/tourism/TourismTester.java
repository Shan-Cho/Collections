package com.chouguleindustries.colectionss.tourism;

import java.util.ArrayList;

public class TourismTester {

	public static void main(String[] args) {

		TourismDTO dto = new TourismDTO("Shimla", true, TourismType.NATURE, 10000D, "Maggie");
		TourismDTO dto1 = new TourismDTO("Goa", true, TourismType.BEACH, 7000D, "Ros Omlete");
		TourismDTO dto2 = new TourismDTO("Jaipur", true, TourismType.ARCHITECTURAL, 11000D, "Dal Bati Churma");
		TourismDTO dto3 = new TourismDTO("Sri lanka", false, TourismType.BEACH, 20000D, "Fish Curry");
		TourismDTO dto4 = new TourismDTO("Maldives", false, TourismType.BEACH, 30000D, "Sea Food");
		TourismDTO dto5 = new TourismDTO("South Africa", false, TourismType.NATURE, 100000D, "Chakalaka Pap");

	}

}
