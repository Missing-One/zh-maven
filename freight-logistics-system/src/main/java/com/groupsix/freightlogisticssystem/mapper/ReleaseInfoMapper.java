package com.groupsix.freightlogisticssystem.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;

import com.groupsix.freightlogisticssystem.common.entity.PageEntity;
import com.groupsix.freightlogisticssystem.pojo.ReleaseInfo;

/**
 * tableName: release_info
 * 
 * reslutMap: <resultMap id="BaseResultMap">..</resultMap>
 * sqlColumn: 
 * 	<sql id="Base_Column_List">
 * 		rel_id, rel_type, rel_time, departure_address, arrived_address, cargo_weight, cargo_name, 
 * 		vehicle_type, price, delivery_phone, pickup_phone
 * 	</sql>
 * 
 * @author zh
 */
public interface ReleaseInfoMapper {
	
	List<ReleaseInfo> selectByCondition(@Param("conditions")ReleaseInfo condition);
	//rel_type 发布的类型; 1.货源类型2.车源类型
	List<ReleaseInfo> selectByConditionalPaging(@Param("conditions")ReleaseInfo condition, @Param("pageEntity")PageEntity pageEntity);
	
	int selectCountByCondition(@Param("conditions")ReleaseInfo condition);
	
    int deleteByPrimaryKey(Integer relId);

    int insert(ReleaseInfo record);

    int insertSelective(ReleaseInfo record);

    ReleaseInfo selectByPrimaryKey(Integer relId);

    int updateByPrimaryKeySelective(ReleaseInfo record);

    int updateByPrimaryKey(ReleaseInfo record);

	
}