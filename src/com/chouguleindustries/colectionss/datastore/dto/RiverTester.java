package com.chouguleindustries.colectionss.datastore.dto;

import com.chouguleindustries.colectionss.datastore.dao.RiverDAO;
import com.chouguleindustries.colectionss.datastore.dao.RiverDAOimpl;

public class RiverTester {

	public static void main(String[] args) {

		RiverDTO dto = new RiverDTO("Kaveri", "Talakaveri", 805, 4, true);

		RiverDTO dto1 = new RiverDTO("Sharavati", "Ambutirtha", 128, 1, true);
		// DAO -- CRUD
		RiverDAO dao = new RiverDAOimpl();
		dao.save(dto);
		dao.save(dto1);

		System.out.println(dao.totalItems());

		RiverDTO kaveriUpdate = new RiverDTO("Kaveri", "Talakaveri", 800, 4, false);
		dao.update(kaveriUpdate);

		System.out.println("total items: " + dao.totalItems());

		RiverDTO dtoDelete = new RiverDTO("Sharavati", "Ambutirtha", 806, 1, true);

		dao.delete(dtoDelete);

		System.out.println("total Items: " + dao.totalItems());

	}

}
