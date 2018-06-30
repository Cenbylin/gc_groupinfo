package com.neuedu.controller;

import javax.servlet.http.HttpServletRequest;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.neuedu.handle.DateEditor;
import com.neuedu.model.Balance;
import com.neuedu.service.BalanceService;

import javafx.scene.chart.PieChart.Data;

@Controller
@RequestMapping("zc")
public class BalanceController {
	@Autowired
	BalanceService balanceService;
	
	@InitBinder
	public void InitBinder(WebDataBinder binder) {
		binder.registerCustomEditor(Data.class,new DateEditor());
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
	
	
	

}
