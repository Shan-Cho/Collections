package com.chouguleindustries.colectionss.datastore.dao;

import java.util.Collection;

import com.chouguleindustries.colectionss.datastore.dto.HighWayDTO;
import com.chouguleindustries.colectionss.datastore.dto.HighWayType;

public interface HighWayDAO {

	boolean save(HighWayDTO dto);

	Collection<HighWayDTO> findAll();

	Collection<HighWayDTO> findAllNumber();

	int totalItems();

	Collection<HighWayDTO> findbyHighWayType(HighWayType type);

	Collection<HighWayDTO> findbyStateName(String sname);

	Collection<Integer> findNumberbyStateName(String sname);

	boolean exist(HighWayDTO dto);

	boolean isCondition(int number);

	double findLengthByNumber(int no);

	HighWayDTO findByMaxLength();

	HighWayDTO findByMinLength();
}
