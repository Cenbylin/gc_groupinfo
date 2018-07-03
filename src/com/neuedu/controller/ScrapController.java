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

import com.neuedu.model.Scrap;
import com.neuedu.service.BalanceService;
import com.neuedu.service.DepartmentService;
import com.neuedu.service.ScrapService;

@Controller
@RequestMapping("scrap")
public class ScrapController {
	@Autowired
	ScrapService scrapService;
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
	
	//用于查询记录的
	@RequestMapping("findAll")
	public String findAll(HttpServletRequest request) {
		request.setAttribute("listBfjl", scrapService.selectAll());
		return "baofeijilu";		
	}
	
	@RequestMapping("findBybfdh")
	public String findBybfdh(HttpServletRequest request, String zha) {
		request.setAttribute("listBfjl", scrapService.findBybfdh(Integer.parseInt(zha)));
		return "baofeijilu";		
	}
	
	@RequestMapping("findAll2")
	public String findAllScrap(HttpServletRequest request) {
		request.setAttribute("listBuy4", scrapService.selectAll());
		return "baofeixinxi";
	}
	
	@RequestMapping("foradd")
	public String forAddScrap(HttpServletRequest request) {
		request.setAttribute("balanceList", balanceService.selectAll());
		request.setAttribute("departmentList", departmentService.findAllDepartment());
		return "addbaofei";
	}
	
	@RequestMapping("add")
	public String addScrap(HttpServletRequest request,Scrap scrap) {
		try {
			scrapService.addScrap(scrap);
			request.setAttribute("listBuy4", scrapService.selectAll());
			return "baofeixinxi";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("balanceList", balanceService.selectAll());
			request.setAttribute("departmentList", departmentService.findAllDepartment());
			return "addbaofei";
		}
	}
	
	@RequestMapping("forupdate")
	public String forUpdate(HttpServletRequest request,int id) {
		try {
			request.setAttribute("query", scrapService.findScrapById(id));
			request.setAttribute("balanceList", balanceService.selectAll());
			request.setAttribute("departmentList", departmentService.findAllDepartment());
			return "updatebaoxiu";
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("listBuy4", scrapService.selectAll());
			return "baofeixinxi";
		}
		
	}
	
	@RequestMapping("update")
	public String updateScrap(HttpServletRequest request,Scrap scrap) {
		try {
			scrapService.updateScrap(scrap);
			request.setAttribute("listBuy4", scrapService.selectAll());
			return "baofeixinxi";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("balanceList", balanceService.selectAll());
			request.setAttribute("departmentList", departmentService.findAllDepartment());
			return "updatebaoxiu";
		}
	}
	
	@RequestMapping("delete")
	public String deleteScrap(HttpServletRequest request,String id) {
		try {
			scrapService.dedleteScrap(id);
			request.setAttribute("listBuy4", scrapService.selectAll());
			return "baofeixinxi";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("listBuy4", scrapService.selectAll());
			return "baofeixinxi";
		}
	}
	
	@RequestMapping("findById")
	public String findScrapmh(HttpServletRequest request,int id) {
		try {
			 request.setAttribute("query", scrapService.findScrapById(id));
			 return "baofeidetails";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("listBuy4", scrapService.selectAll());
			return "baofeixinxi";
		}
	}
	
	@RequestMapping("findByIdmh")
	public String findScrapmh(HttpServletRequest request,String id) {
		try {
			 request.setAttribute("", scrapService.findScrapById(id));
			 return "";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "";
		}
	}

}
