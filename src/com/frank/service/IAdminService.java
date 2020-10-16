package com.frank.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.frank.entity.Admin;
import com.frank.entity.DormBuild;
import com.frank.entity.DormManage;
import com.frank.entity.Notice;
import com.frank.entity.PageResult;
import com.frank.entity.PunchClock;
import com.frank.entity.PunchClockRecord;
import com.frank.entity.Record;
import com.frank.entity.Student;

public interface IAdminService {
	
	/*-------------------------宿管---------------------------*/
	
	public PageResult getDormManage(int pageNum, int pageSize,String filter,String key);
	
	public void addDormManage(DormManage dormManage);
	
	public DormManage getDormMangerById(int dormManId);
	
	public void updataDormManageById(DormManage dormManage);
	
	public void deleteDormManageById(Integer dormManId);
	
	/*-------------------------宿管---------------------------*/
	
	/*-------------------------学生---------------------------*/
	
	public PageResult getStudentManage(int pageNum, int pageSize,String filter,String key);
	
	public void addStudentManage(Student student);
	
	public Student getStudentMangerById(int studentId);
	
	public void updataStudentManageById(Student student);
	
	public void studentManagerDeleteById(int studentId);
	
	/*-------------------------学生---------------------------*/
	
	
	
	/*-------------------------宿舍楼---------------------------*/
	
	public PageResult getBuildManage(int pageNum, int pageSize,String filter,String key);
	
	public void addBuildManage(DormBuild dormBuild);
	
	public DormBuild getBuildMangerById(int dormBuildId);
	
	public void updataBuildManageById(DormBuild dormBuild);
	
	public void buildManagerDeleteById(Integer dormBuildId);
	
	public List<DormManage> getDormMangerByBuildId(Integer dormBuildId);
	
	public List<DormManage> getDormManage2();
	
	public void addDormManageToBuild(Integer dormBuildId,Integer dormManId);
	
	public void removeaDormManageToBuild(Integer dormManId);
	
	/*-------------------------宿舍楼---------------------------*/
	
	
	
	/*-------------------------考勤---------------------------*/
	
	public PageResult getRecordManage(int pageNum, int pageSize,String filter,String key);
	
	public void recordManagerDeleteById(Integer recordId);
	/*-------------------------考勤---------------------------*/
	
	
	/*-------------------------公告---------------------------*/
	
	public PageResult getNoticeManage(Integer pageNum,Integer pageSize,String filter, String key);
	
	public void addNoticeManage(Notice notice);
	
	public Notice getNoticeMangerById(Integer noticeId);
	
	public void updataNoticeManageById(Notice notice);
	
	public void noticeManagerDeleteById(Integer noticeId);
	
	/*-------------------------公告---------------------------*/
	
	/*-------------------------我的---------------------------*/
	
	public Admin getMyMsgById(Integer adminId);
	
	public void updateMyMsgById(Admin admin);
	
	public void updatePsd(Admin admin);
	
	/*-------------------------我的---------------------------*/
	
	
	
	/*-------------------------打卡---------------------------*/
	
	public PageResult getPunchClockManage(int pageNum, int pageSize,String filter,String key);
	
	public void addPunchClockManageMsg(PunchClock punchClock);
	
	public PunchClock getPunchClockMangerById(String id);
	
	public void updataPunchClockManageMsgById(PunchClock punchClock);
	
	public void punchClockManagerDeleteById(String id);
	
	public List<Student> getStudentMsg();
	
	public void insertIntoPunchClockRecord(PunchClockRecord punchClockRecord);
	
	public void updateIntoPunchClockRecordById(PunchClock punchClock);
	
	public void deletePunchClockRecordById(String id);
	
	/*-------------------------打卡---------------------------*/	


}
