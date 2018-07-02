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

import com.neuedu.model.Translate;
import com.neuedu.service.BalanceService;
import com.neuedu.service.DepartmentService;
import com.neuedu.service.TranslateService;

@Controller
@RequestMapping("translate")
public class TranslateController {
	
	@Autowired
	TranslateService translateService;
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
	
	@RequestMapping("findAll")
	public String findAllTranslate(HttpServletRequest request) {
		request.setAttribute("list", translateService.findAllTranslate());
		return "daiopeixinxi";
	}
	
	@RequestMapping("findAll2")
	public String findAll(HttpServletRequest request) {
		request.setAttribute("listTpjl", translateService.selectAll());
		return "tiaopeijilu";		
	}
	
	@RequestMapping("findBytpbh")
	public String findBytpbh( HttpServletRequest request, String zha ) {
		request.setAttribute("listTpjl", translateService.findBytpbh(Integer.parseInt(zha)));
		return "tiaopeijilu";
	}
	
	@RequestMapping("findById")
	public String findById(HttpServletRequest request,int id) {
		request.setAttribute("translate", translateService.findTranslateById(id));
		return "diaopeidetails";
	}
	
	@RequestMapping("findByIdmh")
	public String findById(HttpServletRequest request,String id) {
		try {
			request.setAttribute("translate", translateService.findTranslateById(id));
			return "diaopeidetails";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("list", translateService.findAllTranslate());
			return "daiopeixinxi";
			
		}
	}
	
	@RequestMapping("foradd")
	public String forAdd(HttpServletRequest request) {
		try {
			request.setAttribute("balance", balanceService.findAllBalance());
			request.setAttribute("Buy3", departmentService.findAllDepartment());
			return "addtiaopei";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "daiopeixinxi";
		}
	}
	
	@RequestMapping("add")
	public String addTranslate(HttpServletRequest request,Translate translate) {
		try {
			translateService.addTranslate(translate);
			request.setAttribute("list", translateService.findAllTranslate());
			return "daiopeixinxi";
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("balance", balanceService.findAllBalance());
			request.setAttribute("Buy3", departmentService.findAllDepartment());
			return "addtiaopei";
		}
			
	}
	
	@RequestMapping("delete")
	public String deleteTranslate(HttpServletRequest request,String id) {
		try {
			translateService.deleteTranslate(id);
			request.setAttribute("list", translateService.findAllTranslate());
			return "daiopeixinxi";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("list", translateService.findAllTranslate());
			return "daiopeixinxi";
		}
	}
	
	@RequestMapping("forupdate")
	public String forUpdate(HttpServletRequest request,int id) {
		try {
			request.setAttribute("balance", balanceService.findAllBalance());
			request.setAttribute("Buy3", departmentService.findAllDepartment());
			return "updatediaopei";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("list", translateService.findAllTranslate());
			return "daiopeixinxi";
		}
	}
	
	@RequestMapping("update")
	public String updateTranslate(HttpServletRequest request,Translate translate) {
		try {
			translateService.updateTranslate(translate);
			request.setAttribute("list", translateService.findAllTranslate());
			return "daiopeixinxi";
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "updatediaopei";
		}
	}

}
