package com.legou.modules.user.entity;

import java.io.Serializable;

/**
 * �������ñ�
 *
 */
public class Reset implements Serializable{
	private int Id; // �������
	private int uId; // �����û����
	private int shouli; // �Ƿ�����
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getShouli() {
		return shouli;
	}
	public void setShouli(int shouli) {
		this.shouli = shouli;
	}
}
