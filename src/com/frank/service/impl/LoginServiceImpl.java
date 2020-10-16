package com.frank.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.frank.entity.Login;
import com.frank.mapper.ILoginMapper;
import com.frank.service.ILoginService;

@Service
public class LoginServiceImpl implements ILoginService {

	@Autowired
	private ILoginMapper loginMapperImpl;
	
	@Override
	public List login(Login login) {
		List list=null;
		// TODO Auto-generated method stub
		if(login.getRole().trim().equals("admin")) {
			list= loginMapperImpl.loginToAdmin(login);
		}
        if(login.getRole().trim().equals("dormManager")) {
			list= loginMapperImpl.loginToDormManage(login);
		}
       if(login.getRole().trim().equals("student")) {
			list= loginMapperImpl.loginToStudent(login);
		}
       return list;
	}

}
