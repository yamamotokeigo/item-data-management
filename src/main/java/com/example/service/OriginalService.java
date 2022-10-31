package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Original;
import com.example.mybatis.mapper.OriginalMapper;

@Service
@Transactional
public class OriginalService{
	
	@Autowired
	private OriginalMapper originalMapper;
	
	public List<Original> findAll(){
		List<Original> originalList = originalMapper.findAll();
		return originalList;

	}

}
