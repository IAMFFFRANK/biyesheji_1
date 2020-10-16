package com.frank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frank.entity.Admin;
import com.frank.entity.DormManage;
import com.frank.entity.Notice;
import com.frank.entity.PageResult;
import com.frank.entity.PunchClockRecord;
import com.frank.entity.Record;
import com.frank.entity.Student;
import com.frank.mapper.IDormManageMapper;
import com.frank.service.IDormManageService;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

@Service
public class IDormManageServiceImpl implements IDormManageService{
	
	@Autowired
	private IDormManageMapper dormManageMapperImpl;

	@Override
	public PageResult getStudentMsgByBuildId(int pageNum, int pageSize, String filter, String key, Integer dormBuildId) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Student>studentsManageList= dormManageMapperImpl.getStudentMsgByBuildId(filter, key, dormBuildId);
		Page<Student> page=(Page<Student>) studentsManageList;
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public void studentMsgDeleteById(int studentId) {
		// TODO Auto-generated method stub
		dormManageMapperImpl.studentMsgDeleteById(studentId);
	}

	@Override
	public PageResult getRecordMsg(int pageNum, int pageSize, String filter, String key, Integer dormBuildId) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<Record>recordMsgList= dormManageMapperImpl.getRecordMsg(filter, key, dormBuildId);
		Page<Record> page=(Page<Record>) recordMsgList;
		return new PageResult(page.getTotal(), page.getResult());
	}

	@Override
	public Record getRecordById(int recordId) {
		// TODO Auto-generated method stub
		return dormManageMapperImpl.getRecordById(recordId);
	}

	@Override
	public void updataRecordMsg(Record record) {
		// TODO Auto-generated method stub
		dormManageMapperImpl.updataRecordMsg(record);
	}

	@Override
	public void addRecordMsg(Record record) {
		// TODO Auto-generated method stub
		dormManageMapperImpl.addRecordMsg(record);
	}

	@Override
	public void recordManagerDeleteById1(Integer recordId) {
		// TODO Auto-generated method stub
		dormManageMapperImpl.recordManagerDeleteById1(recordId);
	}

	@Override
	public DormManage dorm_getMyMsgById(Integer dormManId) {
		// TODO Auto-generated method stub
		return dormManageMapperImpl.dorm_getMyMsgById(dormManId);
	}

	@Override
	public void dorm_updateMyMsgById(DormManage dormManage) {
		// TODO Auto-generated method stub
		dormManageMapperImpl.dorm_updateMyMsgById(dormManage);
	}

	@Override
	public void dorm_updatePsd(DormManage dormManage) {
		// TODO Auto-generated method stub
		dormManageMapperImpl.dorm_updatePsd(dormManage);
	}

	@Override
	public List<Notice> getNoticeAll() {
		// TODO Auto-generated method stub
		return dormManageMapperImpl.getNoticeAll();
	}

	@Override
	public PageResult getPunchClockRecordMsgByDormBuildId(int pageNum, int pageSize, String filter, String key,
			Integer dormBuildId) {
		// TODO Auto-generated method stub
		PageHelper.startPage(pageNum, pageSize);
		List<PunchClockRecord>punchClockRecordManageList= dormManageMapperImpl.getPunchClockRecordMsgByDormBuildId(filter, key, dormBuildId);
		Page<PunchClockRecord> page=(Page<PunchClockRecord>) punchClockRecordManageList;
		return new PageResult(page.getTotal(), page.getResult());
	}

}
