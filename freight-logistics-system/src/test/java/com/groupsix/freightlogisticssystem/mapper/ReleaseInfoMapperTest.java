package com.groupsix.freightlogisticssystem.mapper;

import static org.junit.Assert.*;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.groupsix.freightlogisticssystem.common.entity.PageEntity;
import com.groupsix.freightlogisticssystem.pojo.ReleaseInfo;
import com.sun.tools.internal.xjc.model.SymbolSpace;
import com.zh.TestConfig;

public class ReleaseInfoMapperTest extends TestConfig{
	@Autowired
	ReleaseInfoMapper releaseInfoMapper;
	@Test
	public void testSelectAllSupplies() {
		ReleaseInfo condition = new ReleaseInfo();
		PageHelper.startPage(2, 8);
		List<ReleaseInfo> list = releaseInfoMapper.selectByCondition(null);
		PageInfo<ReleaseInfo> page = new PageInfo<>(list);
		
		for (ReleaseInfo i : page.getList()) {
			System.out.println(i);
		}
	}
}

