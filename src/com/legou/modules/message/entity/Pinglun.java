package com.legou.modules.message.entity;

import java.io.Serializable;

/**
 * ����
 *
 */
public class Pinglun implements Serializable{
	private int Id; // ���۱��
	private int userId; // �û����
	private int spId; // ��Ʒ���
	private String title; // ���۱���
	private String content; // ��������
	private String time; // ����ʱ��
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getSpId() {
		return spId;
	}
	public void setSpId(int spId) {
		this.spId = spId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
}
