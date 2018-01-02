package com.groupsix.freightlogisticssystem.service;

import java.util.List;

import com.groupsix.freightlogisticssystem.pojo.ReleaseInfo;

/**
 * 车源服务
 * @author zh
 * @see ReleaseInfo
 */
public interface VehiclesService {
	
	/**
	 * 获取所有车源信息
	 * @return
	 */
	List<ReleaseInfo> getVehicles();
}
