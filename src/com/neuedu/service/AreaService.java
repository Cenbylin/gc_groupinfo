package com.neuedu.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import com.neuedu.model.Area;

public interface AreaService {
	public List<Area>findAllArea();
	public Area findAreaById(int areaid);
	public void updateArea(Area area) throws Exception;
	public void addArea(Area area) throws Exception;
	public void deleteArea(String areaid) throws UnsupportedEncodingException;

}
