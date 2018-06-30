package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Category;

public interface CategoryService {
	
	public List<Category> getCategoryList();
	public List<Category> getCategoryById(int cid);
	public int updateCategory(Category category);
	public void deleteCategory(String cid);
	public int addCategory(Category category)throws Exception;
	public List<Category> selectCategoryByfield(String field) throws Exception;
	

}
