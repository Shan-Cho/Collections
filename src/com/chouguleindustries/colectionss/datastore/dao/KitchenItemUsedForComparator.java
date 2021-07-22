package com.chouguleindustries.colectionss.datastore.dao;

import java.util.Comparator;

import com.chouguleindustries.colectionss.datastore.dto.KitchenItemDTO;

public class KitchenItemUsedForComparator implements Comparator<KitchenItemDTO> {
	@Override
	public int compare(KitchenItemDTO o1, KitchenItemDTO o2) {
		return o1.getUsedFor().compareTo(o2.getUsedFor());
	}
}
