package com.neuedu.controller;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.handle.DateEditor;
import com.neuedu.model.Balance;
import com.neuedu.service.BalanceService;



@Controller
@RequestMapping("zc")
public class BalanceController {
	@Autowired
	BalanceService balanceService;
	
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Date.class,new DateEditor());
	}
	
	
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
	
	@RequestMapping("findAll")
	public String findAllBalance(HttpServletRequest request) {
		request.setAttribute("listBalance", balanceService.findAllBalance());
		return "totalzc";
		
	}
	
	
	

}
