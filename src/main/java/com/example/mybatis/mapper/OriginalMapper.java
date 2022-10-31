package com.example.mybatis.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Mapper;

import com.example.domain.Original;

@Mapper
public interface OriginalMapper {
	
	public List<Original> findAll();
	
	
	

}
