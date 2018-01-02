package com.groupsix.freightlogisticssystem.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.groupsix.freightlogisticssystem.common.entity.PageEntity;
import com.groupsix.freightlogisticssystem.mapper.CargoMapper;
import com.groupsix.freightlogisticssystem.mapper.OrderMapper;
import com.groupsix.freightlogisticssystem.mapper.ReleaseInfoMapper;
import com.groupsix.freightlogisticssystem.pojo.Cargo;
import com.groupsix.freightlogisticssystem.pojo.ReleaseInfo;
import com.groupsix.freightlogisticssystem.service.SuppliesService;

@Service
@Transactional
public class SuppliesServiceImpl implements SuppliesService{

	@Autowired
	CargoMapper catgoMapper;
	@Autowired
	ReleaseInfoMapper releaseInfoMapper;
	
	@Override
	public List<ReleaseInfo> getSupplies() {
		ReleaseInfo type = new ReleaseInfo();
		type.setRelType(1);
		return getSuppliesByConditionToPaging(type, null);
	}

	@Override
	public List<ReleaseInfo> getSuppliesByConditionToPaging(ReleaseInfo condition, PageEntity pageEntity) {
		// rel_type = 1 货源类型 	
		// rel_type = 2 车源类型
		if (condition == null || condition.getRelType() != 1) {
			return null;
			//throw new Exception("设置类型出错,不是需要的货源类型 condition.getRelType() = " + condition.getRelType() );
		}
		
		if(pageEntity != null) {
			pageEntity.setTotalCount(releaseInfoMapper.selectCountByCondition(condition));
		}
		
		return releaseInfoMapper.selectByConditionalPaging(condition, pageEntity);
	}
	
	@Override
	public ReleaseInfo getSuppliesById(ReleaseInfo supplies) {
	
		return null;//releaseInfoMapper.se;
	}
	@Override
	public int delSuppliesById(ReleaseInfo supplies) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int modifySupplies(ReleaseInfo supplies) {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public int addSupplies(ReleaseInfo supplies) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<ReleaseInfo> getSuppliesToPaging(PageEntity pageEntity) {
		// TODO Auto-generated method stub
		return null;
	}

	


	
}
