package com.legou.modules.category.entity;

import java.io.Serializable;

/**
 * ��Ʒһ������
 *
 */
public class CategoryFirst implements Serializable{
	private int Id;	// �����
	private String typename;	// ��Ʒ�������
	
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
}
