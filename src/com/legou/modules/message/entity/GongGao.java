package com.legou.modules.message.entity;

import java.io.Serializable;

/**
 * ����
 *
 */
public class GongGao implements Serializable{
	private int Id; // ������
	private String title; // ��������
	private String content; // ��������
	private String time; // ���淢��ʱ��
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
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
