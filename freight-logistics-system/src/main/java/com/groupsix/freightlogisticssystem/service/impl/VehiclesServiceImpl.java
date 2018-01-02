package com.groupsix.freightlogisticssystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.groupsix.freightlogisticssystem.mapper.CargoMapper;
import com.groupsix.freightlogisticssystem.mapper.ReleaseInfoMapper;
import com.groupsix.freightlogisticssystem.pojo.ReleaseInfo;
import com.groupsix.freightlogisticssystem.service.VehiclesService;

@Service
public class VehiclesServiceImpl implements VehiclesService{

	@Autowired
	CargoMapper catgoMapper;
	@Autowired
	ReleaseInfoMapper releaseInfoMapper;
	
	@Override
	public List<ReleaseInfo> getVehicles() {
		return null;//releaseInfoMapper.selectAllByType(2);
	}
	
}
