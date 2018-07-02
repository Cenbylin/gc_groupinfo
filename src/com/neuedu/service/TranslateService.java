package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Translate;

public interface TranslateService {
	public List<Translate> findAllTranslate();
	public Translate findTranslateById(int id);
	public Translate findTranslateById(String id)throws Exception;
	public void addTranslate(Translate translate) throws Exception;
	public void deleteTranslate(String id) throws Exception;
	public void updateTranslate(Translate translate) throws Exception;
	List<Translate> selectAll();
	List<Translate> findBytpbh( int tid );
	

}
