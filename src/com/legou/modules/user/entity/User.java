package com.legou.modules.user.entity;

import java.io.Serializable;

/**
 * 用户信息
 *
 */
public class User implements Serializable{
	private int Id; // 用户编号
	private String name; // 用户昵称
	private String pwd; // 用户密码
	private int dongjie; // 是否冻结
	private String email; // 邮箱
	private String tel; // 联系电话
	private String QQ; // qq号码
	private String Ip; // IP
	private String tishi; // 密码问题
	private String huida; // 密保答案
	private String dizhi; // 地址
	private String youbian; // 邮编
	private String regtime; // 注册时间
	private String lastlogintime; // 最后一次登录时间
	private int logincishu; // 登录次数
	private String truename; // 真实姓名
	
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
