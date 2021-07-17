package com.chouguleindustries.colectionss.methods.milkshake;

import java.util.Comparator;

public class Sortbybrand implements Comparator<MilkshakeDTO> {

	public int compare(MilkshakeDTO a, MilkshakeDTO b) {

		return a.brand.compareTo(b.brand);
	}
}
