package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Translate;

public interface TranslateService {
	public List<Translate> findAllTranslate();
	public void findTranslateById(int id);
	public void findTranslateById(String id)throws Exception;
	public void addTranslate(Translate translate) throws Exception;
	public void deleteTranslate();
	List<Translate> selectAll();
	List<Translate> findBytpbh( int tid );
	

}
