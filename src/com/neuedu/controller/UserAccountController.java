package com.neuedu.controller;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.model.Useraccount;
import com.neuedu.service.UserAccountSevice;

@Controller
public class UserAccountController {
	// ��mvc�Ŀ��Ʋ�����service�����,�Զ�ע��
	@Autowired
	private UserAccountSevice userAccountSevice;
	
	//�������ͨ��URL��������������е�¼:doLogin.do
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
		 * 1.HttpSession session��jsp/servlet�����еĻỰ����������һ����������ڶ�η��ʷ�����ʱ�������ڶ��ҳ���servlet�乲������
		 * 2.ֻҪ��ǰ���������û�йرգ���Ựû�г�ʱ(Ĭ��30���ӳ�ʱ),�Ϳ���ʹ��session�ڷ���˹�������
		 * 3.�ر�ģ������һ���رգ��ٴδ�ʱ�Ὺ��һ���µĻỰ��֮ǰ�����ڻỰ�е����ݾ��޷���ʹ��
		 * 
		 * 4.�Ự��ʱ���ǱȽϳ��ġ���Ӧ��һ�������й�������ݣ�Ӧ��ʹ��HttpServletRequest������б��湲��
		 * 
		 */
		//�˳���Ҫ����û���¼״̬�Լ���¼�õ���Ϣ
		session.removeAttribute("login");
		session.removeAttribute("loginUser");
		
		return "redirect:login.html";
		
	}

}
