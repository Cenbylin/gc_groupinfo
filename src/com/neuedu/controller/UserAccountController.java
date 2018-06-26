package com.neuedu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.model.Useraccount;
import com.neuedu.service.UserAccountSevice;

@Controller
public class UserAccountController {
	// 在mvc的控制层整合service服务层,自动注入
	@Autowired
	private UserAccountSevice userAccountSevice;
	
	//在浏览中通过URL调用这个方法进行登录:doLogin.do
	@RequestMapping("/doLogin")
	public String doLogin(String account,String password,HttpSession session) {
		Useraccount useraccount=userAccountSevice.findUserByAccount(account);
		if(useraccount!=null&&useraccount.getPassword().equals(password)) {
			session.setAttribute("login", true);
			session.setAttribute("loginUser", useraccount);
			
			return "redirect:index.jsp";
		}
		else {
			session.removeAttribute("login");
//			session.removeAttribute("loginUser");
			
			return "redirect:login.html";
		}
	}
	
	@RequestMapping("/doLogout")
	public String doLogout(HttpSession session) {
		/**
		 * 
		 * 1.HttpSession session是jsp/servlet技术中的会话对象，它用于一个浏览器窗口多次访问服务器时，可以在多个页面或servlet间共享数据
		 * 2.只要当前浏览器窗口没有关闭，或会话没有超时(默认30分钟超时),就可以使用session在服务端共享数据
		 * 3.特别的，浏览器一旦关闭，再次打开时会开启一个新的会话。之前保存在会话中的数据就无法在使用
		 * 
		 * 4.会话的时间是比较长的。对应在一次请求中共享的数据，应该使用HttpServletRequest对象进行保存共享
		 * 
		 */
		//退出，要清除用户登录状态以及登录用的信息
		session.removeAttribute("login");
		session.removeAttribute("loginUser");
		
		return "redirect:login.html";
		
	}

}
