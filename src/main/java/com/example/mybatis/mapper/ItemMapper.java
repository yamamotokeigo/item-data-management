package com.example.mybatis.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.domain.Item;

//新規登録処理
@Mapper
public interface ItemMapper {

	public void insertItems(@Param("item")Item item);
}
