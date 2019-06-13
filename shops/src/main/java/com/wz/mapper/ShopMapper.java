package com.wz.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.wz.entity.Shop;

public interface ShopMapper {
	List selectList();
	int updatelikeByid(@Param("id")Integer id);
	int updateshouByid(@Param("id")Integer id);
	
   int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);
}