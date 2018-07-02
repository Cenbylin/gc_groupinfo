package com.neuedu.service;

import java.util.List;

import com.neuedu.model.Repair;

public interface RepairService {
	public List<Repair> findAllRepair();
	public void addRepair(Repair repair)throws Exception;
	public void deleteRepair(String id)throws Exception;
	public void updateRepair(Repair repair)throws Exception;
	public Repair findRepairById(String id)throws Exception;
	public Repair findRepairById(int id)throws Exception;
	List<Repair> selectAll();
	List<Repair> findBybxbh( Integer repairid );
	

}
