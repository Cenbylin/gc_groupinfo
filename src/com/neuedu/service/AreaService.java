package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Area;

public interface AreaService {
	List<Area>findAllArea();
	Area findAreaById(int areaid);
	void updateArea(Area area) throws Exception;
	void addArea(Area area) throws Exception;

}
