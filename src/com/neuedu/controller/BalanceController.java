package com.neuedu.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import com.neuedu.model.Balance;
import com.neuedu.service.BalanceService;

@Controller
@RequestMapping("Balance")
public class BalanceController {
	@Autowired
	BalanceService balanceService;

	// 只需要加上下面这段即可，注意不能忘记注解
	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {
		// 转换日期
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
	}

	@RequestMapping("add")
	public String addBalance(HttpServletRequest request, Balance balance) {
		try {
			balanceService.addBanlance(balance);
			return "redirect:index.jsp";
		} catch (Exception e) {
			request.setAttribute("returnmsg", e.getMessage());
			e.printStackTrace();
			return "addzc";
		}

	}

	@RequestMapping("findAll")
	public String findAllBalance(HttpServletRequest request) {
		request.setAttribute("listBalance", balanceService.findAllBalance());
		return "totalzc";

	}
	
	@RequestMapping("findBYzcflbh")
	public String findBYzcflbh(HttpServletRequest request, String zha) {
		request.setAttribute("listBalance", balanceService.findBYzcflbh(Integer.parseInt(zha)));
		return "totalzc";		
	}	
	
	@RequestMapping("findBYbmbh")
	public String findBYbmbh(HttpServletRequest request, String zha) {
		request.setAttribute("listBalance", balanceService.findBYbmbh(Integer.parseInt(zha)));
		return "totalzc";
	}

}
