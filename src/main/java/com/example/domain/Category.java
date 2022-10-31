package com.example.domain;

import lombok.Data;

@Data
public class Category {
	
	private Integer id;
	private Integer parentId;
	private String name;
	private String nameAll;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getParent() {
		return parentId;
	}
	public void setParent(Integer parent) {
		this.parentId = parent;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getNameAll() {
		return nameAll;
	}
	public void setNameAll(String nameAll) {
		this.nameAll = nameAll;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", parent=" + parentId + ", name=" + name + ", nameAll=" + nameAll + "]";
	}
	
	


}
