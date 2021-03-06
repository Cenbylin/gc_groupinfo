package com.neuedu.service.impl;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.neuedu.mapper.AreaMapper;
import com.neuedu.model.Area;
import com.neuedu.service.AreaService;
import com.sun.xml.internal.fastinfoset.Decoder;

@Service
@RequestMapping("area")
public class AreaServiceImpl implements AreaService {
	@Autowired
	AreaMapper mapper;

	@Override
	public List<Area> findAllArea() {
		// TODO Auto-generated method stub

		return mapper.selectByExample(null);
	}

	@Override
	public Area findAreaById(int areaid) {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(areaid);
	}

	@Override
	public void updateArea(Area area) throws Exception {
		if (area.getAreaname() == null || "".equals(area.getAreaname())) {
			throw new Exception("区域名称不能为空");
		}

		mapper.updateByPrimaryKeySelective(area);
	}

	@Override
	public void addArea(Area area) throws Exception {
		if (area.getAreaname() == null || "".equals(area.getAreaname())) {
			throw new Exception("区域名称不能为空");
		}
		mapper.insertSelective(area);
	}

	@Override
	public void deleteArea(String areaid) throws UnsupportedEncodingException {
		String[] list = areaid.split(":");
		for (String string : list) {
			if (string == null || "".equals(string)) {
			} else {
				mapper.deleteByPrimaryKey(Integer.parseInt(string));
			}
		}

	}

}
