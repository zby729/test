package com.legou.modules.tradeorder.entity;

import java.io.Serializable;

/**
 * ���ﳵ
 *
 */
public class Gouwuche implements Serializable{
	private int Id; // ���ﳵ������Ʒ���
	private int spId; // ��Ʒ���
	private int uId; // �û����
	private int num; // ��Ʒ����
	private String addtime; // ��Ʒ���ʱ��
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getSpId() {
		return spId;
	}
	public void setSpId(int spId) {
		this.spId = spId;
	}
	public int getuId() {
		return uId;
	}
	public void setuId(int uId) {
		this.uId = uId;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
}
