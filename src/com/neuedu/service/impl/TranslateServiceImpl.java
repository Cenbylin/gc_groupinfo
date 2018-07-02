package com.neuedu.service.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.net.URLDecoder;
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
	public void addTranslate(Translate translate) throws Exception{
		// TODO Auto-generated method stub
		//待加addTranslatejsp页面update,details页面,有时间再加校验信息baokuo下面3个
		if(translate.getTcount() <= 0) {
			throw new Exception("调配数量应大于0");
		}
		if(translate.getTrtime() == null || "".equals(translate.getTrtime())) {
			throw new Exception("调配时间不能为空");
		}
		if(translate.getBid() == null) {
			throw new Exception("资产编号");
		}
		if(translate.getDepartid() == null) {
			throw new Exception("部门编号不能为空");
		}
		mapper.insertSelective(translate);
	}

	@Override
	public Translate findTranslateById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
		
		
	}

	@Override
	public Translate findTranslateById(String id) throws Exception {
		// TODO Auto-generated method stub
		try {
			String id2 = URLDecoder.decode(id,"UTF-8");
			return mapper.selectByPrimaryKey(Integer.parseInt(id2));
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("请输入正确格式的调配编号");
		}
		
	}
	
	@Override
	public void deleteTranslate(String id) throws Exception{
		// TODO Auto-generated method stub
		try {
			String[] id2 = id.split(id);
			for (String string : id2) {
				if(string == null || "".equals(string)) {
				}else {
					mapper.deleteByPrimaryKey(Integer.parseInt(string));
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("请输入正确的要删除的id");
		}
		
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

	@Override
	public void updateTranslate(Translate translate) throws Exception {
		// TODO Auto-generated method stub
		if(translate.getTid() == null) {
			throw new Exception("调配编号不能为空");
		}
		if(translate.getTcount() <= 0) {
			throw new Exception("调配数量应大于0");
		}
		if(translate.getTrtime() == null || "".equals(translate.getTrtime())) {
			throw new Exception("调配时间不能为空");
		}
		if(translate.getBid() == null) {
			throw new Exception("资产编号");
		}
		if(translate.getDepartid() == null) {
			throw new Exception("部门编号不能为空");
		}
		mapper.updateByPrimaryKeySelective(translate);
		
	}

}
