package com.neuedu.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.ProductMapper;
import com.neuedu.model.Product;
import com.neuedu.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	
	@Autowired
	ProductMapper mapper;

	@Override
	public List<Product> findAllProduct() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}
	
	

}
