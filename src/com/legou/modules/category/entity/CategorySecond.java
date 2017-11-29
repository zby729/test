package com.legou.modules.category.entity;

import java.io.Serializable;

/**
 * 商品二级分类
 *
 */
public class CategorySecond implements Serializable{
	private int Id;	// 类别编号
	private String typename; // 商品类别名称
	private int typeId;	// 一级类别编号
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
}
