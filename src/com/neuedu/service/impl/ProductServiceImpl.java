package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.ProductMapper;
import com.neuedu.model.Product;
import com.neuedu.model.ProductExample;
import com.neuedu.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductMapper mapper;

	@Override
	public List<Product> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	@Override
	public List<Product> selectByPrimaryKey(Integer prodid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(prodid);
	}

	@Override
	public Product findByBuyId(Integer buyid) {
		// TODO Auto-generated method stub
		return mapper.findByBuyId(buyid);
	}

	@Override
	public int update( double Buycount, double Prodcount, Integer prodid, Integer buyid ) {
		// TODO Auto-generated method stub
		return mapper.update(  Buycount, Prodcount, prodid, buyid );
	}
}
