package com.neuedu.service;

import java.util.List;

import com.github.pagehelper.PageInfo;
import com.neuedu.model.Product;

public interface ProductService {	
	List<Product> selectAll();
	PageInfo<Product> selectAllWithPage(int currentPage,int pageSize);
	List<Product> selectByPrimaryKey(Integer prodid);
	Product findByBuyId( Integer buyid );
	int update( double Buycount, double Prodcount, Integer prodid, Integer buyid );
	
}
