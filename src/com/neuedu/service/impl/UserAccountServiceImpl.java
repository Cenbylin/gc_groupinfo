package com.neuedu.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.neuedu.mapper.UseraccountMapper;
import com.neuedu.model.Useraccount;
import com.neuedu.model.UseraccountExample;
import com.neuedu.model.UseraccountExample.Criteria;
import com.neuedu.service.UserAccountSevice;

@Service
public class UserAccountServiceImpl implements UserAccountSevice{
	//注解注入
	@Resource
	private UseraccountMapper mapper;
	
	@Override
	public Useraccount findUserByAccount(String account) {
		UseraccountExample example = new UseraccountExample();
		Criteria criteria = example.createCriteria();
		criteria.andAccountsEqualTo(account);
		return mapper.selectByExample(example).get(0);
	}

}
