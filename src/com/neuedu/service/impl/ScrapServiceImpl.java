package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.ScrapMapper;
import com.neuedu.model.Scrap;
import com.neuedu.service.ScrapService;

@Service
public class ScrapServiceImpl implements ScrapService{
	@Autowired
	ScrapMapper mapper;

	@Override
	public List<Scrap> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
		
	}

	@Override
	public List<Scrap> findBybfdh(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.findBybfdh(sid);
	
	}

	@Override
	public void addScrap(Scrap scrap) throws Exception {
		// TODO Auto-generated method stub
		if(scrap.getBid() == null) {
			throw new Exception("资产编号不能为空");
		}
		if(scrap.getStime() ==null || "".equals(scrap.getStime())) {
			throw new Exception("报废时间不能为空");
		}
		
	}

	@Override
	public void updateScrap(Scrap scrap) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dedleteScrap(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	

}
