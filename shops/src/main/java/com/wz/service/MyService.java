package com.wz.service;

import java.util.List;

import com.wz.entity.Shop;

public interface MyService {
	List selectList();
	int updatelikeByid(Integer id);
	int updateshouByid(Integer id);
	
    int deleteByPrimaryKey(Integer id);

    int insert(Shop record);

    int insertSelective(Shop record);

    Shop selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Shop record);

    int updateByPrimaryKey(Shop record);

}
