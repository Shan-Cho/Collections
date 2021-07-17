package com.chouguleindustries.colectionss.methods.milkshake;

import java.util.Comparator;

public class Sortbyprice implements Comparator<MilkshakeDTO> {

	public int compare(MilkshakeDTO a, MilkshakeDTO b) {

		return a.price - b.price;
	}
}
