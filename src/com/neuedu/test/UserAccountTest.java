package com.neuedu.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.neuedu.mapper.UseraccountMapper;
import com.neuedu.model.Useraccount;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/spring-common.xml")
public class UserAccountTest {
	@Autowired
	UseraccountMapper mapper; 

	@Transactional
	@Test
	public void test() {
		Useraccount useraccount=mapper.findUserByAccount("admin");
		System.out.println("zhelizheli"+useraccount.getUsername());
		fail("Not yet implemented");
	}

}
