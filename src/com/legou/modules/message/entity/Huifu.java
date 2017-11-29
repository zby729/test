package com.legou.modules.message.entity;

import java.io.Serializable;

/**
 * 回复
 *
 */
public class Huifu implements Serializable{
	private int Id; // 回复编号
	private int userId; // 用户编号
	private int leavewordId; // 留言编号
	private String title; // 回复主题
	private String content; // 回复内容
	private String time; // 回复时间
	private int yidu; // 是否已读
	
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
