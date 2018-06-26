package com.neuedu.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.mapper.CategoryMapper;
import com.neuedu.model.Category;
import com.neuedu.model.CategoryExample;
import com.neuedu.model.CategoryExample.Criteria;
import com.neuedu.service.CategoryService;

@Controller
@RequestMapping("category")
public class CategoryController {
	
	@Autowired 
	CategoryService categoryService;
	
	
	@RequestMapping("findAll")
	public String findAllCategory(HttpServletRequest request){
		List<Category> categories=categoryService.getCategoryList();
		request.setAttribute("list", categories);
		return "zcflxinxi";
		
	}
	
	@RequestMapping("findByIdchakan")
	public String findCategoryById(HttpServletRequest request,int cid) {
		
		List<Category> category=categoryService.getCategoryById(cid);
		request.setAttribute("category", category.get(0));
		return "zcfldetails";
		
	}
	
	@RequestMapping("findById")
	public String findCategory(HttpServletRequest request,int cid) {
		List<Category> category=categoryService.getCategoryById(cid);
		request.setAttribute("category", category.get(0));
		return "updatezcfl";
	}
	
	@RequestMapping("update")
	public String updateCategory(HttpServletRequest request,Category category) throws Exception{
		if(categoryService.updateCategory(category)==0) {
			throw new Exception("更新资产分类返回改变个数为0");
		}
		request.setAttribute("category", category);
		return "zcfldetails";
		
	}
	
	@RequestMapping("delete")
	public String deleteCategory(HttpServletRequest request,String cid) {
		categoryService.deleteCategory(cid);
		List<Category> categories = categoryService.getCategoryList();
		request.setAttribute("list", categories);
		return "zcflxinxi";
	}
	
	@RequestMapping("add")
	public String addCategory(HttpServletRequest request,Category category) throws Exception{
		categoryService.addCategory(category);
		List<Category> categories = categoryService.getCategoryList();
		request.setAttribute("list", categories);
		return "zcflxinxi";	
	}
	
	@RequestMapping("findBymh")
	public String selectCategoryBymh(HttpServletRequest request,String zha) throws Exception{
		List<Category> categories = categoryService.selectCategoryByfield(zha);
		request.setAttribute("list", categories);
		return "zcflxinxi";
		
	}

}
