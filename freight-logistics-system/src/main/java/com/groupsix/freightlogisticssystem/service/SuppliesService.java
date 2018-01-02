package com.groupsix.freightlogisticssystem.service;

import java.util.List;

import com.groupsix.freightlogisticssystem.common.entity.PageEntity;
import com.groupsix.freightlogisticssystem.pojo.ReleaseInfo;

/**
 * 货源服务
 * @author zh
 * 
 * entity
 * @see ReleaseInfo
 */
public interface SuppliesService {
	
	/**
	 * 获取所有货物信息
	 * @return
	 */
	List<ReleaseInfo> getSupplies();
	
	/**
	 * 获取所有货物信息
	 * @return
	 */
	List<ReleaseInfo> getSuppliesToPaging(PageEntity pageEntity);
	
	/**
	 * 获取货物信息
	 * 根据条件,分页获取货物集合
	 * {@link ReleaseInfo#getRelType()} 必须为  1 表示为货源类型
	 * @return
	 */
	List<ReleaseInfo> getSuppliesByConditionToPaging(ReleaseInfo condition, PageEntity pageEntity);
	
	/**
	 * 根据id获取货物信息
	 * 
	 * @param Supplies 
	 * @return 成功获取{@value != null} 否则 {@value {@code null}}
	 */
	ReleaseInfo getSuppliesById(ReleaseInfo supplies);
	
	/**
	 * 根据id删除货物信息
	 * 
	 * @param Supplies 
	 * @return 删除成功{@value > 0} 否则删除失败{@value -1,0}
	 */
	int delSuppliesById(ReleaseInfo supplies);
	
	
	/**
	 * 根据id修改货物信息
	 * @return 修改成功{@value return > 0} 否则修改失败{@value -1,0},
	 */
	int modifySupplies(ReleaseInfo supplies);
	
	
	/**
	 * 添加一条货物信息
	 * @return 添加成功{@value return > 0} 否则添加失败{@value -1,0}, 
	 */
	int addSupplies(ReleaseInfo supplies);

	
}
