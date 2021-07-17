package com.chouguleindustries.colectionss.datastore.dao;

import com.chouguleindustries.colectionss.datastore.dto.RiverDTO;

public interface RiverDAO {

	boolean save(RiverDTO dto);

	int totalItems();

	void update(RiverDTO dto);

	boolean delete(RiverDTO dto);

}
