package com.frank.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.frank.entity.Admin;
import com.frank.entity.DormManage;
import com.frank.entity.Notice;
import com.frank.entity.PageResult;
import com.frank.entity.Record;
import com.frank.entity.Student;

public interface IDormManageService {

	public PageResult getStudentMsgByBuildId(int pageNum, int pageSize,String filter,String key,Integer dormBuildId);
	
	public void studentMsgDeleteById(int studentId);

	public PageResult getRecordMsg(int pageNum, int pageSize,String filter,String key,Integer dormBuildId);
	
	public Record getRecordById(int recordId);
	
	public void updataRecordMsg(Record record);
	
	public void addRecordMsg(Record record);
	
	public void recordManagerDeleteById1(Integer recordId);
	
/*-------------------------我的---------------------------*/
	
	public DormManage dorm_getMyMsgById(Integer dormManId);
	
	public void dorm_updateMyMsgById(DormManage dormManage);
	
	public void dorm_updatePsd(DormManage dormManage);
	
	/*-------------------------我的---------------------------*/
	
	public List<Notice> getNoticeAll();
	
	/*-------------------------打卡---------------------------*/
	
	public PageResult getPunchClockRecordMsgByDormBuildId(int pageNum, int pageSize,String filter,String key,Integer dormBuildId);
	
	/*-------------------------打卡---------------------------*/
}
