package com.legou.modules.message.entity;

import java.io.Serializable;

/**
 * ¡Ù—‘
 *
 */
public class Leaveword implements Serializable{
	private int Id; // ¡Ù—‘±‡∫≈
	private int userId; // ”√ªß±‡∫≈
	private String title; // ¡Ù—‘÷˜Ã‚
	private String content; // ¡Ù—‘ƒ⁄»›
	private String time; // ¡Ù—‘ ±º‰
	private int huifu; //  «∑Òªÿ∏¥
	
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
	public int getHuifu() {
		return huifu;
	}
	public void setHuifu(int huifu) {
		this.huifu = huifu;
	}
}
