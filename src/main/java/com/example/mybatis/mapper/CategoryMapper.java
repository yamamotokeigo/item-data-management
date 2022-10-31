package com.example.mybatis.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.Category;

//新規登録処理
@Mapper
public interface CategoryMapper {
	
	public void insertCategory(@Param("list") List<Category> category);

}
