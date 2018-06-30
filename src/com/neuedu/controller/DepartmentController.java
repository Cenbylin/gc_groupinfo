package com.neuedu.controller;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.model.Department;
import com.neuedu.service.DepartmentService;

@Controller
@RequestMapping("department")
public class DepartmentController {
	@Autowired
	DepartmentService departmentService;
	
	@RequestMapping("findAll")
	public String findAllDepartment(HttpServletRequest request) {
		request.setAttribute("listDepartment", departmentService.findAllDepartment());
		return "bmxinxi";
	}
	
	@RequestMapping("findById")
	public String findDepartmentById(HttpServletRequest request,int departid) {
		request.setAttribute("department", departmentService.findDepartmentById(departid));
		
		return "updatebm";
	}
	
	@RequestMapping("update")
	public String updateDepartment(HttpServletRequest request,Department department) throws Exception{
		if(department.getAreaname().equals("==请选择==") ||department.getAreaname() == null || "".equals(department.getAreaname())) {
			throw new Exception("部门所属区域不能为空");	
		}
		departmentService.upadteDepartment(department);
		request.setAttribute("listDepartment", departmentService.findAllDepartment());
		return "bmxinxi";
	}
	
	@RequestMapping("findByIdchakan")
	public String DepartmentDetail(HttpServletRequest request,int departid) {
		request.setAttribute("department", departmentService.findDepartmentById(departid));
		return "bmdetails";
	}
	
	@RequestMapping("findByIdmh")
	public String findDepartmentBymh(HttpServletRequest request,String id) throws UnsupportedEncodingException {
		request.setAttribute("department", departmentService.findDepartmentByIdmh(id));
		
		return "bmdetails";
		
	}
	
	@RequestMapping("delete")
	public String deleteDepartmentById(HttpServletRequest request,String cid) {
		departmentService.deleteDepartmentById(cid);
		request.setAttribute("listDepartment", departmentService.findAllDepartment());
		return "bmxinxi";	
	}
	
	@RequestMapping("add")
	public String addDepartment(HttpServletRequest request,Department department) throws Exception{
		if(department.getAreaname().equals("==请选择==") ||department.getAreaname() == null || "".equals(department.getAreaname())) {
			throw new Exception("部门所属区域不能为空");	
		}
		departmentService.addDepartment(department);
		request.setAttribute("listDepartment", departmentService.findAllDepartment());
		return "bmxinxi";
	}
	

}
