package com.legou.modules.category.entity;

import java.io.Serializable;

/**
 * ��Ʒ��������
 *
 */
public class CategoryThird implements Serializable{
	private int Id;	// �����
	private String typename; // ��Ʒ�������
	private int typeId;	// ���������
	
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
