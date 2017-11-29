package com.legou.modules.message.entity;

import java.io.Serializable;

/**
 * 评论
 *
 */
public class Pinglun implements Serializable{
	private int Id; // 评论编号
	private int userId; // 用户编号
	private int spId; // 商品编号
	private String title; // 评论标题
	private String content; // 评论内容
	private String time; // 评论时间
	
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
