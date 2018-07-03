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

import com.neuedu.model.Repair;
import com.neuedu.service.BalanceService;
import com.neuedu.service.DepartmentService;
import com.neuedu.service.RepairService;

import java.util.Date;

@Controller
@RequestMapping("Repair")
public class RepairController {
	@Autowired
	RepairService repairService;
	@Autowired
	BalanceService balanceService;
	@Autowired
	DepartmentService departmentService;
	
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
	
	@RequestMapping("foradd")
	public String forAddScrap(HttpServletRequest request) {
		request.setAttribute("balanceList", balanceService.selectAll());
		request.setAttribute("departmentList", departmentService.findAllDepartment());
		return "addbaoxiu";
	}
	
	@RequestMapping("add")
	public String addRepair(HttpServletRequest request,Repair repair) {
		try {
			repairService.addRepair(repair);
			request.setAttribute("listBuy3", repairService.selectAll());
			return "baoxiuxinxi";
		} catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("balanceList", balanceService.selectAll());
			request.setAttribute("departmentList", departmentService.findAllDepartment());
			return "addbaoxiu";
		}
	}
	
	@RequestMapping("delete")
	public String deleteRepair(HttpServletRequest request,String id) {
		try {
			repairService.deleteRepair(id);
			request.setAttribute("listBuy3", repairService.selectAll());
			return "baoxiuxinxi";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("listBuy3", repairService.selectAll());
			return "baoxiuxinxi";
		}
		
	}
	
	@RequestMapping("findById")
	public String findBYId(HttpServletRequest request,int id) {
		try {
			request.setAttribute("query", repairService.findRepairById(id));
			
			return "baoxiudetails";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("listBuy3", repairService.selectAll());
			return "baoxiuxinxi";
		}
	}
	
	@RequestMapping("findByIdmh")
	public String findBYId(HttpServletRequest request,String id) {
		try {
			request.setAttribute("query", repairService.findRepairById(id));
			return "baoxiudetails";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("listBuy3", repairService.selectAll());
			return "baoxiuxinxi";
		}
	}
	
	@RequestMapping("forupdate")
	public String forUpdate(HttpServletRequest request, int id) {
		try {
			request.setAttribute("balanceList", balanceService.selectAll());
			request.setAttribute("departmentList", departmentService.findAllDepartment());
			request.setAttribute("query", repairService.findRepairById(id));
			return "updatebaoxiu";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("listBuy3", repairService.selectAll());
			return "baoxiuxinxi";
		}
		
	}
	
	@RequestMapping("update")
	public String updateRepair(HttpServletRequest request,Repair repair) {
		try {
			repairService.updateRepair(repair);
			request.setAttribute("listBuy3", repairService.selectAll());
			return "baoxiuxinxi";
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("balanceList", balanceService.selectAll());
			request.setAttribute("departmentList", departmentService.findAllDepartment());
			request.setAttribute("msg", e.getMessage());
			return "updatebaoxiu";
		}
		
		
	}
	

}
