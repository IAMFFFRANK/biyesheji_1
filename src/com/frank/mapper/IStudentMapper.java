package com.frank.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.frank.entity.PunchClockRecord;
import com.frank.entity.Record;
import com.frank.entity.Student;


public interface IStudentMapper {
	
	public List<Record>getRecordMsgByStuNum(@Param("filter") String filter,@Param("key")String key,@Param("studentNumber") String studentNumber);
	
    public Student student_getMyMsgById(@Param("studentId") Integer studentId);
	
	public void student_updateMyMsgById(Student student);
	
	public void student_updatePsd(Student student);
	
	public List<PunchClockRecord>getPunchClockRecordMsgByStuNum(@Param("filter") String filter,@Param("key")String key,@Param("studentNumber") String studentNumber);
	
	public PunchClockRecord getPunckColcokRecordById(@Param("id")Integer id);
	
	public void updataPunchClockRecordMsg(PunchClockRecord punchClockRecord);

}
