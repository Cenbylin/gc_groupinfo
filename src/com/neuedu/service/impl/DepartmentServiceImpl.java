package com.neuedu.service.impl;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neuedu.mapper.DepartmentMapper;
import com.neuedu.model.Department;
import com.neuedu.model.DepartmentExample;
import com.neuedu.model.DepartmentExample.Criteria;
import com.neuedu.service.DepartmentService;
import com.sun.xml.internal.fastinfoset.Decoder;


@Service
public class DepartmentServiceImpl implements DepartmentService{
	@Resource 
	DepartmentMapper mapper;

	@Override
	public List<Department> findAllDepartment() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
		
	}
	
	@Override
	public Department findDepartmentById(int departid) {
		return mapper.selectByPrimaryKey(departid);
		
	}
	
	@Override
	public int upadteDepartment(Department department) {
		return mapper.updateByPrimaryKeySelective(department);			
		
	}
	
	@Override
	public void deleteDepartmentById(String departid) {
		String[] delid = departid.split(":");
		for (String string : delid) {
			mapper.deleteByPrimaryKey(Integer.parseInt(string));
		}
	}
	
	@Override
	public int addDepartment(Department department) {
		return mapper.insertSelective(department);
	}
	
	@Override
	public Department findDepartmentByIdmh(String departid) throws UnsupportedEncodingException {
		String id = URLDecoder.decode(departid,"UTF-8");
		return mapper.selectByPrimaryKey(Integer.parseInt(id));
	}
	

}
