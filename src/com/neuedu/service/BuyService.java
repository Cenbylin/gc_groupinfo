package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Buy;

public interface BuyService {
	List<Buy> findAllBuy();

	Buy findById(int id);

	Buy findById(String id) throws Exception;

	void updateBuy(Buy buy) throws Exception;

	void addBuy(Buy buy) throws Exception;

	void deleteBuy(String id) throws Exception;

	List<Buy> selectAll();

	List<Buy> findBycgdh(int buyid);

}
