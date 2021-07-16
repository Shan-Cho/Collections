package com.chouguleindustries.colectionss.methods.alcohols;

import java.util.*;

public class AlcoholTester {

	public static void main(String[] args) {

		AlcoholDTO dto = new AlcoholDTO("KingFisher", 100D, false, 700D, "Beer");
		AlcoholDTO dto1 = new AlcoholDTO("Jonny Walker", 17000D, false, 1000D, "Whisky");
		AlcoholDTO dto2 = new AlcoholDTO("Sula", 1200D, false, 400D, "Wine");
		AlcoholDTO dto3 = new AlcoholDTO("Budwizer", 299D, false, 300D, "Beer");
		AlcoholDTO dto4 = new AlcoholDTO("Chivas Regal", 20000D, true, 800D, "Scotch");
		AlcoholDTO dto7 = new AlcoholDTO("818", 19000D, false, 1200D, "Tquila");
		AlcoholDTO dto8 = new AlcoholDTO("Bourbon", 12000D, false, 2000D, "Whisky");

		List<AlcoholDTO> liquor = new ArrayList<>();

		liquor.add(dto8);
		liquor.add(dto7);
		liquor.add(dto4);
		liquor.add(dto3);
		liquor.add(dto2);
		liquor.add(dto1);
		liquor.add(dto);

		for (AlcoholDTO alcoholDTO : liquor) {
			System.out.println(alcoholDTO);
		}

		System.out.println("Below List is sorted alphabetically");

		Collections.sort(liquor);

		for (AlcoholDTO alcoholDTO : liquor) {
			System.out.println(alcoholDTO);
		}
	}

}
