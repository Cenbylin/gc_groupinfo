package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Product;

public interface ProductService {	
	List<Product> selectAll();
	List<Product> selectByPrimaryKey(Integer prodid);
	Product findByBuyId( Integer buyid );
	int update( double Buycount, double Prodcount, Integer prodid, Integer buyid );
	
}
