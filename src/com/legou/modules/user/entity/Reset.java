package com.legou.modules.user.entity;

import java.io.Serializable;

/**
 * 密码重置表
 *
 */
public class Reset implements Serializable{
	private int Id; // 申述编号
	private int uId; // 申述用户编号
	private int shouli; // 是否受理
	
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
