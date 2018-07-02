package com.neuedu.service.impl;

import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.ProviderMapper;
import com.neuedu.model.Provider;
import com.neuedu.service.ProviderService;


@Service
public class ProviderServiceImpl implements ProviderService{
	@Autowired
	ProviderMapper mapper;

	@Override
	public List<Provider> findAllProvider() {
		// TODO Auto-generated method stub
		return mapper.selectByExample(null);
	}

	@Override
	public Provider findProviderById(int id) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
	}

	@Override
	public void updateProvider(Provider provider) throws Exception {
		// TODO Auto-generated method stub
		if(provider.getProvname() == null || "".equals(provider.getProvname())) {
			throw new Exception("供应商名称不能为空");
		}
		if(provider.getPhone() == null || "".equals(provider.getPhone())) {
			throw new Exception("供应商电话不能为空");
		}
		if(provider.getAddress() == null || "".equals(provider.getAddress())) {
			throw new Exception("供应商地址不能为空");
		}
		mapper.updateByPrimaryKeySelective(provider);
		
	}

	@Override
	public void AddProvider(Provider provider) throws Exception {
		// TODO Auto-generated method stub
		if(provider.getProvname() == null || "".equals(provider.getProvname())) {
			throw new Exception("供应商名称不能为空");
		}
		if(provider.getPhone() == null || "".equals(provider.getPhone())) {
			throw new Exception("供应商电话不能为空");
		}
		if(provider.getAddress() == null || "".equals(provider.getAddress())) {
			throw new Exception("供应商地址不能为空");
		}
		mapper.insertSelective(provider);
	}

	@Override
	public void deleteProvider(String id) throws Exception {
		// TODO Auto-generated method stub
		
		String[] liStrings = id.split(":");
		for (String string : liStrings) {
			if (string == null || "".equals(string)) {				
			}else {
				mapper.deleteByPrimaryKey(Integer.parseInt(string));
			}
		}
		
	}

	@Override
	public Provider findProviderById(String id) throws Exception{
		// TODO Auto-generated method stub
		try {
			String id2 = URLDecoder.decode(id,"UTF-8");
			return mapper.selectByPrimaryKey(Integer.parseInt(id2));
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("请输入正确的供应商编号");
		}	
	}

}
