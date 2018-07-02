package com.neuedu.service.impl;

import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.BuyMapper;
import com.neuedu.model.Buy;
import com.neuedu.service.BuyService;

@Service
public class BuyServiceImpl implements BuyService{
	@Autowired
	BuyMapper mapper;
	
	@Override
	public List<Buy> findAllBuy() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Override
	public Buy findById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateBuy(Buy buy) throws Exception {
		// TODO Auto-generated method stub
		if(buy.getBuycount() <= 0) {
			throw new Exception("购买数量应大于0");
		}
		if(buy.getBuytime() == null || "".equals(buy.getBuytime())) {
			throw new Exception("购买日期应设置");
		}
		mapper.updateByPrimaryKeySelective(buy);
		
	}

	@Override
	public void addBuy(Buy buy) throws Exception {
		// TODO Auto-generated method stub
		if(buy.getBuycount() <= 0) {
			throw new Exception("购买数量应大于0");
		}
		if(buy.getBuytime() == null || "".equals(buy.getBuytime())) {
			throw new Exception("购买日期应设置");
		}
		if(buy.getDepartid() == null) {
			throw new Exception("部门id不能为空");
		}
		if(buy.getProdid() == null) {
			throw new Exception("产品id不能为空");
		}
		if(buy.getProvid() == null) {
			throw new Exception("供应商id不能为空");
		}
		mapper.insertSelective(buy);
		
	}

	@Override
	public void deleteBuy(String id) throws Exception {
		// TODO Auto-generated method stub
		try {
			String[] id2 = id.split(":");
			for(String string:id2) {
				if(string == null || "".equals(string)) {
				}else {
					mapper.deleteByPrimaryKey(Integer.parseInt(string));
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("删除buy时出错");
		}
		
	}

	@Override
	public Buy findById(String id) throws Exception{
		// TODO Auto-generated method stub
		try {
			String id2 = URLDecoder.decode(id, "UTF-8");
			return mapper.selectByPrimaryKey(Integer.parseInt(id2));
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("请输入正确格式的采购单号");
		}
	}

}
