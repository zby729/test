package com.legou.modules.message.entity;

import java.io.Serializable;

/**
 * 公告
 *
 */
public class GongGao implements Serializable{
	private int Id; // 公告编号
	private String title; // 公告主题
	private String content; // 公告内容
	private String time; // 公告发布时间
	
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
