package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Balance;

public interface BalanceService {
	public void addBanlance(Balance balance) throws Exception;

	public List<Balance> findAllBalance();

	List<Balance> selectAll();

	List<Balance> findBYzcflbh(Integer bid);

	List<Balance> findBYbmbh(Integer departid);

}
