package com.neuedu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.model.Balance;
import com.neuedu.service.BalanceService;

@Controller
@RequestMapping("zc")
public class BalanceController {
	@Autowired
	BalanceService balanceService;
	
	
	@RequestMapping("add")
	public String addBalance(HttpServletRequest request,Balance balance) {
		try {
			balanceService.addBanlance(balance);
			return "redirect:index.jsp";
		}catch(Exception e) {
			request.setAttribute("returnmsg", e.getMessage());
			return "addzc";
		}
		
	}
	
	
	

}
