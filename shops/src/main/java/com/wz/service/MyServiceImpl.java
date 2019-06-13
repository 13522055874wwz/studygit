package com.wz.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wz.entity.Shop;
import com.wz.mapper.ShopMapper;

@Service
public class MyServiceImpl implements MyService{
	
	@Autowired
	private ShopMapper sm;

    @Override
	public int deleteByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Shop record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insertSelective(Shop record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Shop selectByPrimaryKey(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updateByPrimaryKeySelective(Shop record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updateByPrimaryKey(Shop record) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List selectList() {
		// TODO Auto-generated method stub
		return sm.selectList();
	}

	@Override
	public int updatelikeByid(Integer id) {
		// TODO Auto-generated method stub
		return sm.updatelikeByid(id);
	}

	@Override
	public int updateshouByid(Integer id) {
		// TODO Auto-generated method stub
		return sm.updateshouByid(id);
	}

}
