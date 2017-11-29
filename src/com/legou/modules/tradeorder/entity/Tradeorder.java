package com.legou.modules.tradeorder.entity;

import java.io.Serializable;

/**
 * 订单
 *
 */
public class Tradeorder implements Serializable{
	private int Id; // 订单编号
	private String dingdanhao; // 订单号
	private String shouhuoren; // 收货人姓名
	private String sex; // 收货人性别
	private String dizhi; // 收货人地址
	private String youbian; // 邮编
	private String tel; // 联系电话
	private String shsi; // 收货时间
	private String zffs; // 支付方式
	private String leaveword; // 买家留言
	private String time; // 下单时间
	private String xiadanren; // 下单人姓名
	private String zt; // 订单状态
	private String total; // 支付总金额
	private int spId; // 商品Id
	
	public int getId() {
		return Id;
	}
	public int getSpId() {
		return spId;
	}
	public void setSpId(int spId) {
		this.spId = spId;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getDingdanhao() {
		return dingdanhao;
	}
	public void setDingdanhao(String dingdanhao) {
		this.dingdanhao = dingdanhao;
	}
	public String getShouhuoren() {
		return shouhuoren;
	}
	public void setShouhuoren(String shouhuoren) {
		this.shouhuoren = shouhuoren;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
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
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getShsi() {
		return shsi;
	}
	public void setShsi(String shsi) {
		this.shsi = shsi;
	}
	public String getZffs() {
		return zffs;
	}
	public void setZffs(String zffs) {
		this.zffs = zffs;
	}
	public String getLeaveword() {
		return leaveword;
	}
	public void setLeaveword(String leaveword) {
		this.leaveword = leaveword;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getXiadanren() {
		return xiadanren;
	}
	public void setXiadanren(String xiadanren) {
		this.xiadanren = xiadanren;
	}
	public String getZt() {
		return zt;
	}
	public void setZt(String zt) {
		this.zt = zt;
	}
	public String getTotal() {
		return total;
	}
	public void setTotal(String total) {
		this.total = total;
	}
}
