package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Category;
import com.example.mybatis.mapper.CategoryMapper;

@Service
@Transactional
public class CategoryService {
	
	@Autowired
	private CategoryMapper categoryMapper;
	
//	public void insertCategory() {
//		
//		List<Category> categoryList = categoryMapper.insertCategory();
//	}

}
