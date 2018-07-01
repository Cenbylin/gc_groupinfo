package com.neuedu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.model.Provider;
import com.neuedu.service.ProviderService;

@Controller
@RequestMapping("provider")
public class ProviderController {
	@Autowired
	ProviderService providerService;
	
	@RequestMapping("findAll")
	public String findAllProvider(HttpServletRequest request) {
		request.setAttribute("listProvider", providerService.findAllProvider());
		return "gysxinxi";
		
	}
	
	@RequestMapping("find")
	public String findProviderDetails(HttpServletRequest request,int id) {
		request.setAttribute("listProvider", providerService.findProviderById(id));
		return "gysdetails";
	}
	
	@RequestMapping("find2")
	public String findProviderForAlter(HttpServletRequest request,int id) {
		request.setAttribute("listProvider", providerService.findProviderById(id));
		return "updategys";
	}
	
	//顶部栏通过字符串方式查找
	@RequestMapping("findBymh")
	public String findProviderDetails2(HttpServletRequest request,String zha) {
		try {
			request.setAttribute("listProvider",providerService.findProviderById(zha));
			return "gysdetails";
			
		}catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("msg", e.getMessage());
			request.setAttribute("listProvider", providerService.findAllProvider());
			return "gysxinxi";
		}
		
	}
	
	@RequestMapping("update")
	public String updateProvider(HttpServletRequest request,Provider provider) {
		try {
			providerService.updateProvider(provider);
		} catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("msg", e.getMessage());
			return "updategys";
		}
		request.setAttribute("listProvider", providerService.findAllProvider());
		return "gysxinxi";
		
	}
	
	@RequestMapping("add")
	public String addProvider(HttpServletRequest request,Provider provider) {
		try {
			providerService.AddProvider(provider);
		} catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("msg",e.getMessage());
			return "addgys";
		}
		request.setAttribute("listProvider", providerService.findAllProvider());
		return "gysxinxi";
	}
	
	@RequestMapping("delete")
	public String deleteProvider(HttpServletRequest request,String id) {
		try {
			providerService.deleteProvider(id);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			System.out.println("删除供应商时出错");
		}
		request.setAttribute("listProvider", providerService.findAllProvider());
		return "gysxinxi";
	}
	

}
