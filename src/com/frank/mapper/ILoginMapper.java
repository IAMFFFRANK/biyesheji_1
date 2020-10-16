package com.frank.mapper;

import java.util.List;

import com.frank.entity.Admin;
import com.frank.entity.DormManage;
import com.frank.entity.Login;
import com.frank.entity.Student;

public interface ILoginMapper {
	
	public List<Admin> loginToAdmin(Login login);
	
	public List<DormManage> loginToDormManage(Login login);
	
	public List<Student> loginToStudent(Login login);
}
