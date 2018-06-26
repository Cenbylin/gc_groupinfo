package com.neuedu.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.annotation.Resource;

import org.apache.catalina.mapper.Mapper;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.CategoryMapper;
import com.neuedu.model.Category;
import com.neuedu.model.CategoryExample;
import com.neuedu.model.CategoryExample.Criteria;
import com.neuedu.service.CategoryService;

@Service
public class CateGoryServiceImpl implements CategoryService{

	@Resource
	private CategoryMapper mapper;
	
	
	@Override
	public List<Category> getCategoryList() {
		// TODO Auto-generated method stub
		
		return mapper.selectByExample(null);
	}
	
	@Override
	public List<Category>getCategoryById(int cid){
		CategoryExample example=new CategoryExample();
		Criteria criteria=example.createCriteria();
		criteria.andCidEqualTo(cid);
		return mapper.selectByExample(example);
		
	}
	/**
	 * 修改成功个数
	 */
	@Override
	public int updateCategory(Category category) {
		
		return mapper.updateByPrimaryKeySelective(category);
		
	}
	
	@Override
	public void deleteCategory(String cid) {
		String[] list = cid.split(":");
		for (String string : list) {
			if(string == null || "".equals(string)) {
			}else {
				mapper.deleteByPrimaryKey(Integer.parseInt(string));
			}	
		}
		
	}
	
	/**
	 * return 插入成功个数
	 */
	@Override
	public int addCategory(Category category) throws Exception{
		if(category.getCname() == null || "".equals(category.getCname())) {
			throw new Exception("分类名称不能为空");
		}else {
			return mapper.insertSelective(category);
		}
		
	}
	
	@Override
	public List<Category>selectCategoryByfield(String field) throws UnsupportedEncodingException{
		CategoryExample example = new CategoryExample();
		Criteria criteria=example.createCriteria();	
		String cName = URLDecoder.decode(field,"UTF-8");
		criteria.andCnameLike("%"+cName+"%");
		return mapper.selectByExample(example);
		
	}
	

}
