package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Provider;

public interface ProviderService {
	public List<Provider> findAllProvider();
	public Provider findProviderById(int id);
	public Provider findProviderById(String id) throws Exception;
	public void  updateProvider(Provider provider) throws Exception;
	public void AddProvider(Provider provider) throws Exception;
	public void deleteProvider(String id) throws Exception;

}
