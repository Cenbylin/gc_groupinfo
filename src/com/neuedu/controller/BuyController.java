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

import com.neuedu.model.Buy;
import com.neuedu.service.BuyService;
import com.neuedu.service.DepartmentService;
import com.neuedu.service.ProductService;
import com.neuedu.service.ProviderService;

import oracle.net.aso.p;

@Controller
@RequestMapping("buy")
public class BuyController {
	@Autowired 
	BuyService buyService;
	@Autowired
	ProductService productService;
	@Autowired
	DepartmentService departmentService;
	@Autowired
	ProviderService providerService;
	
	@InitBinder
	public void initBinder(WebDataBinder binder, WebRequest request) {
		// 转换日期
		DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
		binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, true));// CustomDateEditor为自定义日期编辑器
	}
	
	@RequestMapping("findAll")
	public String findAllBuy(HttpServletRequest request) {
		request.setAttribute("listBuy", buyService.findAllBuy());
		return "caigouxinxi";
	}
	//用于查看
	@RequestMapping("findById2")
	public String findByIdchakan(HttpServletRequest request,int id) {
		request.setAttribute("Buy1", buyService.findById(id));
		return "caigoudetails";
	}
	
	@RequestMapping("findByIdmh")//顶部栏查询
	public String findBuyByIdmh(HttpServletRequest request,String id) {
		try {
			
			request.setAttribute("Buy1", buyService.findById(id));
			return "caigoudetails";
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("11111");
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("listBuy", buyService.findAllBuy());
			return "caigouxinxi";
		}
	}
	
	//用于编辑
	@RequestMapping("findById")
	public String findById(HttpServletRequest request,int id) {
		request.setAttribute("Buy1", buyService.findById(id));
		request.setAttribute("Buy2", providerService.findAllProvider());
		request.setAttribute("Buy3", productService.findAllProduct());
		request.setAttribute("Buy4", departmentService.findAllDepartment());
		return "updatecaigou";
	}
	
	@RequestMapping("upate")
	public String updateBuy(HttpServletRequest request,Buy buy) {
		try {
			buyService.updateBuy(buy);
			request.setAttribute("listBuy", buyService.findAllBuy());
			return "caigouxinxi";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "updatecaigou";
		}
		
	}
	
	@RequestMapping("toadd")
	public String prepareForAdd(HttpServletRequest request) {
		request.setAttribute("Buy2", providerService.findAllProvider());
		request.setAttribute("Buy3", productService.findAllProduct());
		request.setAttribute("Buy4", departmentService.findAllDepartment());
		return "addcaigou";
	}
	
	@RequestMapping("add")
	public String addBuy(HttpServletRequest request,Buy buy) {
		try {
			buyService.addBuy(buy);
			request.setAttribute("listBuy", buyService.findAllBuy());
			return "caigouxinxi";
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("msg", e.getMessage());
			return "addcaigou";
		}
	}
	
	@RequestMapping("delete")
	public String deleteBuy(HttpServletRequest request,String id) {
		try {
			buyService.deleteBuy(id);
			request.setAttribute("listBuy", buyService.findAllBuy());
			return "caigouxinxi";
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			request.setAttribute("delmsg", e.getMessage());
			request.setAttribute("listBuy", buyService.findAllBuy());
			return "caigouxinxi";
		}
		
		
	}
	
	

}
