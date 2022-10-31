package com.example.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.domain.Item;
import com.example.mybatis.mapper.ItemMapper;

@Service
@Transactional
public class ItemService {
	
	@Autowired
	private ItemMapper itemMapper;
	
	public void insertItem(Item item) {
		itemMapper.insertItems(item);
	}

}
