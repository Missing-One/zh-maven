package com.groupsix.freightlogisticssystem.mapper;

import com.groupsix.freightlogisticssystem.pojo.Cargo;

public interface CargoMapper {
    int deleteByPrimaryKey(Integer cId);

    int insert(Cargo record);

    int insertSelective(Cargo record);

    Cargo selectByPrimaryKey(Integer cId);

    int updateByPrimaryKeySelective(Cargo record);

    int updateByPrimaryKey(Cargo record);
}