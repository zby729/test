package com.legou.modules.sys.entity;

import java.io.Serializable;

/**
 * ����Ա
 *
 */
public class Admin implements Serializable{
	private int Id; // ����Ա���
	private String name; // ����Ա����
	private String pwd; // ����Ա����
	
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
