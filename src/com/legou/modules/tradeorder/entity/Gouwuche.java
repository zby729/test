package com.legou.modules.tradeorder.entity;

import java.io.Serializable;

/**
 * 购物车
 *
 */
public class Gouwuche implements Serializable{
	private int Id; // 购物车加入商品编号
	private int spId; // 商品编号
	private int uId; // 用户编号
	private int num; // 商品数量
	private String addtime; // 商品添加时间
	
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
