package com.legou.modules.user.entity;

import java.io.Serializable;

/**
 * �û���Ϣ
 *
 */
public class User implements Serializable{
	private int Id; // �û����
	private String name; // �û��ǳ�
	private String pwd; // �û�����
	private int dongjie; // �Ƿ񶳽�
	private String email; // ����
	private String tel; // ��ϵ�绰
	private String QQ; // qq����
	private String Ip; // IP
	private String tishi; // ��������
	private String huida; // �ܱ���
	private String dizhi; // ��ַ
	private String youbian; // �ʱ�
	private String regtime; // ע��ʱ��
	private String lastlogintime; // ���һ�ε�¼ʱ��
	private int logincishu; // ��¼����
	private String truename; // ��ʵ����
	
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
	public int getDongjie() {
		return dongjie;
	}
	public void setDongjie(int dongjie) {
		this.dongjie = dongjie;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getQQ() {
		return QQ;
	}
	public void setQQ(String qQ) {
		QQ = qQ;
	}
	public String getIp() {
		return Ip;
	}
	public void setIp(String ip) {
		Ip = ip;
	}
	public String getTishi() {
		return tishi;
	}
	public void setTishi(String tishi) {
		this.tishi = tishi;
	}
	public String getHuida() {
		return huida;
	}
	public void setHuida(String huida) {
		this.huida = huida;
	}
	public String getDizhi() {
		return dizhi;
	}
	public void setDizhi(String dizhi) {
		this.dizhi = dizhi;
	}
	public String getYoubian() {
		return youbian;
	}
	public void setYoubian(String youbian) {
		this.youbian = youbian;
	}
	public String getRegtime() {
		return regtime;
	}
	public void setRegtime(String regtime) {
		this.regtime = regtime;
	}
	public String getLastlogintime() {
		return lastlogintime;
	}
	public void setLastlogintime(String lastlogintime) {
		this.lastlogintime = lastlogintime;
	}
	public int getLogincishu() {
		return logincishu;
	}
	public void setLogincishu(int logincishu) {
		this.logincishu = logincishu;
	}
	public String getTruename() {
		return truename;
	}
	public void setTruename(String truename) {
		this.truename = truename;
	}
}
