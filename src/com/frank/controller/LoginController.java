package com.frank.controller;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.frank.entity.Login;
import com.frank.entity.Result;
import com.frank.service.ILoginService;
@Controller
@ResponseBody
public class LoginController {
	@Autowired
	private ILoginService loginServiceImpl;
	@RequestMapping("login")
	public List login(HttpServletRequest request, @RequestBody Login login) {
		List list=loginServiceImpl.login(login);
		if(list.size()==1) {
			HttpSession session=request.getSession();
			session.setAttribute(login.getRole(), list);
			System.out.println("session="+session.getAttribute(login.getRole()));
		}
		return list;
	}
	@RequestMapping("getSession")
	public List getSession(HttpServletRequest request,@RequestBody Login login){
		System.out.println(login);
		System.out.println(request.getSession().getAttribute(login.getRole()));
		List list=new ArrayList<>();
		list.add(request.getSession().getAttribute(login.getRole()));
		return list;
	}
	@RequestMapping("exitSys")
	public Result exitSys(HttpServletRequest request) {
		String exit="";
		try {
			if(request.getParameter("exit")!=null) {
				exit=request.getParameter("exit");
			}
			request.getSession().removeAttribute(exit);
			return new Result(true, "注销成功");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return new Result(false, "注销失败");
		}
	}
}
