package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Scrap;
public interface ScrapService {
	List<Scrap> selectAll();
	List<Scrap> findBybfdh(Integer sid);
	void addScrap(Scrap scrap) throws Exception;
	void updateScrap(Scrap scrap) throws Exception;
	void dedleteScrap(String id) throws Exception;
	Scrap findScrapById(String id) throws Exception;
	Scrap findScrapById(int id) throws Exception;

}
