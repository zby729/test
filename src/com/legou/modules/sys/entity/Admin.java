package com.legou.modules.sys.entity;

import java.io.Serializable;

/**
 * 管理员
 *
 */
public class Admin implements Serializable{
	private int Id; // 管理员编号
	private String name; // 管理员姓名
	private String pwd; // 管理员密码
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
}
