package com.groupsix.freightlogisticssystem.mapper;

import com.groupsix.freightlogisticssystem.pojo.Commodity;

public interface CommodityMapper {
    int deleteByPrimaryKey(Integer cName);

    int insert(Commodity record);

    int insertSelective(Commodity record);

    Commodity selectByPrimaryKey(Integer cName);

    int updateByPrimaryKeySelective(Commodity record);

    int updateByPrimaryKey(Commodity record);
}