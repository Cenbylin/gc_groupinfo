package com.neuedu.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.neuedu.model.Department;

public interface DepartmentService {
	public List<Department>findAllDepartment();
	public Department findDepartmentById(int departid);
	public int upadteDepartment(Department department);
	public void deleteDepartmentById(String departid);
	public int addDepartment(Department department);
	public Department findDepartmentByIdmh(String departid) throws UnsupportedEncodingException;
}
