package com.chouguleindustries.colectionss.datastore.dao;

import java.util.Collection;

import com.chouguleindustries.colectionss.datastore.dto.KitchenItemDTO;

public interface KitchenItemDAO {
	boolean saveUnique(KitchenItemDTO dto);

	Collection<KitchenItemDTO> findAllSortByUsedFor();

	Collection<KitchenItemDTO> findAllSortByUsedForDesc();

	Collection<KitchenItemDTO> findAllSortByName();

	Collection<KitchenItemDTO> findAllSortByPriceDesc();
}
