package com.legou.modules.message.entity;

import java.io.Serializable;

/**
 * �ظ�
 *
 */
public class Huifu implements Serializable{
	private int Id; // �ظ����
	private int userId; // �û����
	private int leavewordId; // ���Ա��
	private String title; // �ظ�����
	private String content; // �ظ�����
	private String time; // �ظ�ʱ��
	private int yidu; // �Ƿ��Ѷ�
	
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
	public int getLeavewordId() {
		return leavewordId;
	}
	public void setLeavewordId(int leavewordId) {
		this.leavewordId = leavewordId;
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
	public int getYidu() {
		return yidu;
	}
	public void setYidu(int yidu) {
		this.yidu = yidu;
	}
}
