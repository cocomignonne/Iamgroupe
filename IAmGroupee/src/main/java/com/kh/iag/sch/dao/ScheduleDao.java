package com.kh.iag.sch.dao;

import java.util.HashMap;
import java.util.List;

import com.kh.iag.sch.entity.SchDto;

public interface ScheduleDao {

	void enrollSchedule(SchDto schDto) throws Exception;

	List<SchDto> getPersonalList(String userNo) throws Exception;

	List<SchDto> getDeptList(String userNo) throws Exception;

	List<SchDto> getCorpList(String userNo) throws Exception;

	void modifySch(SchDto modSchDto) throws Exception;

}
