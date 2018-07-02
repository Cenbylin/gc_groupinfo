package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.TranslateMapper;
import com.neuedu.model.Translate;
import com.neuedu.service.TranslateService;

@Service
public class TranslateServiceImpl implements TranslateService{
	@Autowired
	TranslateMapper mapper;

	@Override
	public List<Translate> findAllTranslate() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
		
	}

	@Override
	public void addTranslate(Translate translate) {
		// TODO Auto-generated method stub
		//待加addTranslatejsp页面update,details页面,有时间再加校验信息baokuo下面3个
		
	}

	@Override
	public void findTranslateById(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void findTranslateById(String id) throws Exception {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void deleteTranslate() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Translate> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	@Override
	public List<Translate> findBytpbh(int tid) {
		// TODO Auto-generated method stub
		return mapper.findBytpbh(tid);
		
	}

}
