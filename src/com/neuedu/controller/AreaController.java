package com.neuedu.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.model.Area;
import com.neuedu.service.AreaService;

@Controller
@RequestMapping("area")
public class AreaController {
	@Autowired
	AreaService areaService;
	
	@RequestMapping("list")
	public String findAllArea(HttpServletRequest request) {
		request.setAttribute("areaList", areaService.findAllArea());
		
		return "quyuxinxi";
		
	}
	
	@RequestMapping("findById")
	public String findById(HttpServletRequest request,int areaid) {
		request.setAttribute("area", areaService.findAreaById(areaid));
		return "quyudetails";
		
	}
	
	//用于页面上方查询区域
	@RequestMapping("findByIdlist")
	public String findAreaById(HttpServletRequest request,int areaid) {
		request.setAttribute("area", areaService.findAreaById(areaid));
		return "quyudetails";
		
	}
	
	@RequestMapping("findByIdalter")
	public String findByIdAlter(HttpServletRequest request,int areaid) {
		request.setAttribute("area", areaService.findAreaById(areaid));
		return "updatequyu";
	}
	
	@RequestMapping("updateArea")
	public String updateArea(HttpServletRequest request,Area area) {
		try {
			areaService.updateArea(area);
		} catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("msg", e.getMessage());
			return "updatequyu";
		}
		request.setAttribute("areaList", areaService.findAllArea());
		return "quyuxinxi";
	}
	
	@RequestMapping("addArea")
	public String addArea(HttpServletRequest request,Area area) {
		try {
			areaService.addArea(area);
		} catch (Exception e) {
			// TODO: handle exception
			request.setAttribute("msg", e.getMessage());
			return "addquyu";
		}
		request.setAttribute("areaList", areaService.findAllArea());
		return "quyuxinxi";
	}
	
	@RequestMapping("deleteArea")
	public String deleteAreaByid(HttpServletRequest request ,String areaid) {
		try {
			areaService.deleteArea(areaid);
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("删除时出错，id类型转换出错");
		}
		
		request.setAttribute("areaList", areaService.findAllArea());
		return "quyuxinxi";
	}
	

}
