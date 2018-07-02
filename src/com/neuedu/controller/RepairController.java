package com.neuedu.controller;

import java.text.DateFormat;
import java.text.SimpleDateFormat;


import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.WebRequest;

import com.neuedu.service.RepairService;

import java.util.Date;

@Controller
@RequestMapping("Repair")
public class RepairController {
	@Autowired
	RepairService repairService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {
		// 转换日期
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
	}
	
	//用于统计
	@RequestMapping("findAll")
	public String findAll(HttpServletRequest request) {
		request.setAttribute("listBxjl", repairService.selectAll());
		return "baoxiujilu";		
	}
	
	@RequestMapping("findBybxbh")
	public String findBybxbh(HttpServletRequest request, String zha) {
		request.setAttribute("listBxjl", repairService.findBybxbh(Integer.parseInt(zha)));
		return "baoxiujilu";		
	}
	//用于查看列表
	@RequestMapping("findAll2")
	public String findAllRepair(HttpServletRequest request) {
		request.setAttribute("listBuy3", repairService.selectAll());
		return "baoxiuxinxi";
	}
	

}
