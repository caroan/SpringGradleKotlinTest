package com.example.demo.home.repository.impl;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.home.mapper.HomeMapper;
import com.example.demo.home.repository.HomeRepository;

@Repository
public class HomeRepositoryImpl implements HomeRepository {
	
	@Autowired
	HomeMapper homeMapper;

	@Override
	public String getMemberInfo(Map<String, String> param) {
		// TODO Auto-generated method stub
		return homeMapper.getMemberInfo();
	}

}
