package com.chouguleindustries.colectionss.datastore.dto;

import com.chouguleindustries.colectionss.datastore.dao.HighWayDAO;
import com.chouguleindustries.colectionss.datastore.dao.HighwayDAOimpl;

public class HighWayTester {

	public static void main(String[] args) {
		HighWayDTO dto = new HighWayDTO(1, 99, HighWayType.NH, "Karnataka", 800, true, "Ashoka Buildcon");
		HighWayDTO dto1 = new HighWayDTO(2, 45, HighWayType.SH, "maharastra", 700, true, "Gayatri Projects");
		HighWayDTO dto2 = new HighWayDTO(3, 95, HighWayType.URBAN, "TamilNadu", 600, true, "Reliance Infra");

		HighWayDAO dao = new HighwayDAOimpl();

		dao.save(dto);
		dao.save(dto1);
		dao.save(dto2);

		System.out.println("findAll " + dao.findAll());
		System.out.println("exist " + dao.exist(dto2));
		System.out.println("find by number :" + dao.findAllNumber());
		System.out.println("find by length :" + dao.findLengthByNumber(800));
		System.out.println("find by sate name: " + dao.findbyStateName("Karnataka"));
		System.out.println("find by type :" + dao.findbyHighWayType(HighWayType.NH));
		System.out.println("find  number by state name :" + dao.findNumberbyStateName("TamilNadu"));
		System.out.println("find is condition :" + dao.isCondition(25));
		System.out.println("max : " + dao.findByMaxLength());
		System.out.println("min : " + dao.findByMinLength());
	}

}
