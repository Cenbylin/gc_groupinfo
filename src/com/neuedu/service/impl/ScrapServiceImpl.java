package com.neuedu.service.impl;

import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.neuedu.mapper.ScrapMapper;
import com.neuedu.model.Scrap;
import com.neuedu.service.ScrapService;

@Service
public class ScrapServiceImpl implements ScrapService{
	@Autowired
	ScrapMapper mapper;

	@Override
	public List<Scrap> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
		
	}

	@Override
	public List<Scrap> findBybfdh(Integer sid) {
		// TODO Auto-generated method stub
		return mapper.findBybfdh(sid);
	
	}

	@Override
	public void addScrap(Scrap scrap) throws Exception {
		// TODO Auto-generated method stub
		if(scrap.getBid() == null) {
			throw new Exception("资产编号不能为空");
		}
		if(scrap.getStime() == null || "".equals(scrap.getStime())) {
			throw new Exception("报废时间不能为空");
		}
		if(scrap.getDepartid() == null) {
			throw new Exception("部门编号不能为空");
		}
		if(scrap.getScount() <= 0) {
			throw new Exception("报废数量应为正数");
		}
		mapper.insertSelective(scrap);
		
	}

	@Override
	public void updateScrap(Scrap scrap) throws Exception {
		// TODO Auto-generated method stub
		if(scrap.getSid() == null) {
			throw new Exception("报废编号不能为空");
		}
		if(scrap.getBid() == null) {
			throw new Exception("资产编号不能为空");
		}
		if(scrap.getStime() == null || "".equals(scrap.getStime())) {
			throw new Exception("报废时间不能为空");
		}
		if(scrap.getDepartid() == null) {
			throw new Exception("部门编号不能为空");
		}
		if(scrap.getScount() <= 0) {
			throw new Exception("报废数量应为正数");
		}
		mapper.updateByPrimaryKeySelective(scrap);
		
	}

	@Override
	public void dedleteScrap(String id) throws Exception {
		// TODO Auto-generated method stub
		String[] id2 = id.split(":");
		try {
			for (String string : id2) {
				if(string == null || "".equals(string)) {
				}else {
					mapper.deleteByPrimaryKey(Integer.parseInt(string));
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("在删除scrap时报错,请检查id格式");
		}
		
	}

	@Override
	public Scrap findScrapById(String id) throws  Exception{
		// TODO Auto-generated method stub
		String id2 = URLDecoder.decode(id,"UTF-8");
		try {
			return mapper.selectByPrimaryKey(Integer.parseInt(id2));
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("请输入正确的报废编号");
		}
		
	}

	@Override
	public Scrap findScrapById(int id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
		
	}

	@Override
	public PageInfo<Scrap> selectAllWithPage(int currentPage, int pageSize) {
		// TODO Auto-generated method stub
		PageHelper.startPage(currentPage, pageSize);
		List<Scrap> scraps = mapper.selectAll();
		PageInfo<Scrap> sInfo = new PageInfo<>(scraps);
		System.out.println("在这里"+sInfo.getPages());
		return sInfo;
	}
	
	

}
