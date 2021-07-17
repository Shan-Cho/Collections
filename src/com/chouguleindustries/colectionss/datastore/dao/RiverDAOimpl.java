package com.chouguleindustries.colectionss.datastore.dao;

import java.util.ArrayList;
import java.util.List;

import com.chouguleindustries.colectionss.datastore.dto.RiverDTO;

public class RiverDAOimpl implements RiverDAO {

	private List<RiverDTO> list = new ArrayList<RiverDTO>();

	@Override
	public boolean save(RiverDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto :" + dto);
		System.out.println("dto was added " + added);
		return added;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}

	@Override
	public void update(RiverDTO dto) {
		boolean exist = this.list.contains(dto);
		if (exist) {
			System.out.println("river found, will updare" + dto);
			int indexOfRiver = this.list.lastIndexOf(dto);
			this.list.set(indexOfRiver, dto);
		} else {
			System.out.println("River does not exist");
		}

	}

	@Override
	public boolean delete(RiverDTO dto) {
		if (this.list.contains(dto)) {
			System.out.println("removed" + dto);
			return this.list.remove(dto);
		}
		System.out.println("river not exist, cannot remove");
		return false;
	}

}
