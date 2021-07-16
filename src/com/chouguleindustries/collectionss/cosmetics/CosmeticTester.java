package com.chouguleindustries.collectionss.cosmetics;

public class CosmeticTester {

	public static void main(String[] args) {
		CosmeticDTO cosmetic = new CosmeticDTO(Brand.LAKME, 450, "LipStick", false);
		System.out.println(cosmetic);
		CosmeticDTO cosmetic1 = new CosmeticDTO(Brand.LAKME, 450, "LipStick", false);
		System.out.println(cosmetic1);
		System.out.println(cosmetic.equals(cosmetic1));

	}

}
