package com.chouguleindustries.colectionss.datastore.dao;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import com.chouguleindustries.colectionss.datastore.dto.HighWayDTO;
import com.chouguleindustries.colectionss.datastore.dto.HighWayType;

public class HighwayDAOimpl implements HighWayDAO {
	private List<HighWayDTO> list = new ArrayList<HighWayDTO>();

	@Override
	public boolean save(HighWayDTO dto) {
		boolean added = list.add(dto);
		System.out.println("dto :" + dto);
		System.out.println("dto was added " + added);
		return added;
	}

	@Override
	public Collection<HighWayDTO> findAll() {
		return this.list;
	}

	@Override
	public Collection<HighWayDTO> findAllNumber() {
		Iterator<HighWayDTO> dto = this.list.iterator();
		Collection<HighWayDTO> str = new ArrayList<HighWayDTO>();
		while (dto.hasNext()) {
			HighWayDTO findallNumber = dto.next();
			System.out.println("findall location : " + findallNumber.getNumber());
			str.add(findallNumber);
		}

		return str;
	}

	@Override
	public int totalItems() {
		int total = list.size();
		return total;
	}

	@Override
	public Collection<HighWayDTO> findbyHighWayType(HighWayType type) {
		Collection<HighWayDTO> highwaytype = new ArrayList<HighWayDTO>();
		Iterator<HighWayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighWayDTO highway = itr.next();
			if (highway.getType().equals(type)) {
				highwaytype.add(highway);
			}
		}
		return highwaytype;
	}

	@Override
	public Collection<HighWayDTO> findbyStateName(String sname) {
		HighWayDTO dto = null;
		Collection<HighWayDTO> stateName = new ArrayList<HighWayDTO>();
		Iterator<HighWayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighWayDTO highway = itr.next();
			if (highway.getStateName().equals(sname)) {
				stateName.add(highway);
			}
		}
		return stateName;
	}

	@Override
	public Collection<Integer> findNumberbyStateName(String sname) {
		Collection<Integer> numbystateName = new ArrayList<>();
		Iterator<HighWayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighWayDTO highway = itr.next();
			if (highway.getStateName().equals(sname)) {
				numbystateName.add(highway.getNumber());
			}
		}
		return numbystateName;
	}

	@Override
	public boolean exist(HighWayDTO dto) {
		Iterator<HighWayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			dto = itr.next();
			if (this.list.contains(dto)) {
				System.out.println("---exist---");
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isCondition(int number) {
		double dto = 0;
		Iterator<HighWayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighWayDTO highway = itr.next();
			if (highway.getNumber() == (number)) {
				return true;
			}
		}
		return false;
	}

	@Override
	public double findLengthByNumber(int no) {
		double dto = 0;
		Iterator<HighWayDTO> itr = this.list.iterator();
		while (itr.hasNext()) {
			HighWayDTO highway = itr.next();
			if (highway.getLength() == (no)) {
				dto = highway.getLength();
				break;
			}
		}
		return dto;
	}

	@Override
	public HighWayDTO findByMaxLength() {
		Iterator<HighWayDTO> itr = this.list.iterator();
		HighWayDTO dto = itr.next();
		double length = dto.getLength();
		while (itr.hasNext()) {
			HighWayDTO highwayDTO = itr.next();
			if (highwayDTO.getLength() > length) {
				System.out.println("---found by maximum length---");

				dto = highwayDTO;
			}
		}
		return dto;

	}

	@Override
	public HighWayDTO findByMinLength() {
		Iterator<HighWayDTO> itr = this.list.iterator();
		HighWayDTO dto = itr.next();
		double length = dto.getLength();
		while (itr.hasNext()) {
			HighWayDTO highwayDTO = itr.next();
			if (highwayDTO.getLength() < length) {
				System.out.println("---found by maximum length---");
			}
			dto = highwayDTO;
		}
		return dto;
	}

}
