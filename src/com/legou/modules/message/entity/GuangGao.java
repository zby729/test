package com.legou.modules.message.entity;

import java.io.Serializable;

/**
 * 广告
 *
 */
public class GuangGao implements Serializable{
	private int Id; // 广告编号
	private String path; // 图片路径
	private String url; // 广告指向的URL
	private String width; // 图片宽度
	private String height; // 图片的高度
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getWidth() {
		return width;
	}
	public void setWidth(String width) {
		this.width = width;
	}
	public String getHeight() {
		return height;
	}
	public void setHeight(String height) {
		this.height = height;
	}
}
