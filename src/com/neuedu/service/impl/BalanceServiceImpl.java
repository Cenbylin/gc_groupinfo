package com.neuedu.service.impl;

import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neuedu.mapper.BalanceMapper;
import com.neuedu.model.Balance;
import com.neuedu.service.BalanceService;
import com.neuedu.service.CategoryService;
import com.neuedu.service.DepartmentService;

@Service
public class BalanceServiceImpl implements BalanceService{
	
	@Resource
	BalanceMapper mapper;
	DepartmentService departmentService;
	CategoryService CategoryService;

	@Override
	public void addBanlance(Balance balance) throws Exception{
		// TODO Auto-generated method stub
		if(balance.getBname() == null || "".equals(balance.getBname())) {
			throw new Exception("资产名称不能为空");
		}
		if(balance.getBcount() <= 0) {
			throw new Exception("资产数量应为正数");
		}
		if(balance.getBdate() == null ) {
			throw new Exception("资产年限不能为空");
		}
//		try {
//			SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			format.setLenient(false);//防止类似2月29转化为3月1
//			format.parse(balance.getBdate().toString());
//		}catch(ParseException  e) {
//			throw new Exception("年限格式应为如此格式2018-06-28 00:00:00");
//		}
		if(balance.getDepartid() == null || "".equals(balance.getDepartid())) {
			throw new Exception("部门编号不能为空");
		}
		if(departmentService.findDepartmentById(balance.getDepartid()) == null) {
			throw new Exception("没有对应部门编号的部门，请检查输入的部门编号是否有误或新建此部门");
		}
		if(balance.getPrice().compareTo(new BigDecimal(0)) >=0 ) {
			throw new Exception("价格应大于0");
		}
		if(balance.getCid() == 0) {
			throw new Exception("分类编号不能为空");
		}
		if(CategoryService.selectCategoryByfield(balance.getCid().toString()) == null) {
			throw new Exception("没有对应资产编号的资产分类，请检查输入的分类编号分类是否有误或新建此分类");
		}
		
		mapper.insertSelective(balance);
	}

	@Override
	public List<Balance> findAllBalance() {
		// TODO Auto-generated method stub
		
		return mapper.selectByExample(null);
	}

}
