package com.neuedu.service.impl;

import java.net.URLDecoder;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neuedu.mapper.RepairMapper;
import com.neuedu.model.Repair;
import com.neuedu.service.RepairService;

import oracle.net.aso.f;

@Service
public class RepairServiceImpl implements RepairService {
	@Autowired
	RepairMapper mapper;

	@Override
	public List<Repair> findAllRepair() {
		// TODO Auto-generated method stub
		return mapper.selectAll();

	}

	@Override
	public void addRepair(Repair repair) throws Exception {
		// TODO Auto-generated method stub
		if (repair.getDepartid() == null) {
			throw new Exception("部门编号不能为空");
		}
		if (repair.getRcount() <= 0) {
			throw new Exception("报修数量应该为正数");
		}
		if (repair.getRtime() == null || "".equals(repair.getRtime())) {
			throw new Exception("报修时间不能为空");
		}
		if (repair.getBid() == null) {
			throw new Exception("资产编号不能为空");
		}
		mapper.insertSelective(repair);

	}

	@Override
	public void deleteRepair(String id) throws Exception {
		// TODO Auto-generated method stub
		try {
			String[] id2 = id.split(":");
			for (String string : id2) {
				if (string == null || "".equals(string)) {
				} else {
					mapper.deleteByPrimaryKey(Integer.parseInt(string));
				}
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw new Exception("删除repail出错");

		}

	}

	@Override
	public void updateRepair(Repair repair) throws Exception {
		// TODO Auto-generated method stub
		if(repair.getRepairid() == null) {
			throw new Exception("报修编号不能为空");
		}
		if (repair.getDepartid() == null) {
			throw new Exception("部门编号不能为空");
		}
		if (repair.getRcount() <= 0) {
			throw new Exception("报修数量应该为正数");
		}
		if (repair.getRtime() == null || "".equals(repair.getRtime())) {
			throw new Exception("报修时间不能为空");
		}
		if (repair.getBid() == null) {
			throw new Exception("资产编号不能为空");
		}
		mapper.updateByPrimaryKeySelective(repair);

	}

	@Override
	public Repair findRepairById(String id) throws Exception {
		// TODO Auto-generated method stub
		String id2 = URLDecoder.decode(id,"UTF-8");
		try {
			return mapper.selectByPrimaryKey(Integer.parseInt(id2));
		} catch (Exception e) {
			// TODO: handle exception
			throw new Exception("请输入正确格式的报修编号");
		}
		
	}

	@Override
	public List<Repair> selectAll() {
		// TODO Auto-generated method stub
		return mapper.selectAll();
	}

	@Override
	public List<Repair> findBybxbh(Integer repairid) {
		// TODO Auto-generated method stub
		return mapper.findBybxbh(repairid);

	}

	@Override
	public Repair findRepairById(int id) throws Exception {
		// TODO Auto-generated method stub
		return mapper.selectByPrimaryKey(id);
		
	}

}
