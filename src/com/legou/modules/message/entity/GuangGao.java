package com.legou.modules.message.entity;

import java.io.Serializable;

/**
 * ���
 *
 */
public class GuangGao implements Serializable{
	private int Id; // �����
	private String path; // ͼƬ·��
	private String url; // ���ָ���URL
	private String width; // ͼƬ���
	private String height; // ͼƬ�ĸ߶�
	
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
