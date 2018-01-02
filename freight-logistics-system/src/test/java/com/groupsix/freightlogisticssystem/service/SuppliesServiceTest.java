package com.groupsix.freightlogisticssystem.service;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.groupsix.freightlogisticssystem.common.entity.PageEntity;
import com.groupsix.freightlogisticssystem.pojo.ReleaseInfo;
import com.zh.TestConfig;

public class SuppliesServiceTest extends TestConfig{
	@Autowired
	SuppliesService ss;
	@Test
	public void test() {
		ReleaseInfo releaseInfo = new ReleaseInfo();
		releaseInfo.setRelType(1);
		PageEntity pageEntity = new PageEntity();
		pageEntity.setCurrentPageNo(Long.MAX_VALUE);
//		pageEntity.setCurrentPageNo(Long.MIN_VALUE);
		List<ReleaseInfo> supplies = ss.getSuppliesByConditionToPaging(releaseInfo, pageEntity);
		for (ReleaseInfo ri : supplies) {
			System.out.println(ri);
		}
		System.out.println(pageEntity);
		
	}

}
