package com.legou.modules.commodity.entity;

import java.io.Serializable;

/**
 * 商品信息
 *
 */
public class Commodity implements Serializable{
	private int Id; // 商品编号
	private String mingcheng; // 商品名称
	private String jianjie;	// 商品简介
	private String addtime; // 商品上市时间
	private String dengji; // 商品等级
	private String xinghao; // 商品型号
	private String tupian; // 商品图片
	private int shuliang; // 商品数量
	private int cishu; // 购买次数
	private int tuijian; // 是否推荐
	private int typeId; // 一级类别
	private int type2Id; // 二级类别
	private int type3Id; // 三级类别
	private String huiyuanjia; // 会员价
	private String shichangjia; // 市场价
	private String pinpai; // 品牌
	private int tejia; // 是否为特价商品
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getMingcheng() {
		return mingcheng;
	}
	public void setMingcheng(String mingcheng) {
		this.mingcheng = mingcheng;
	}
	public String getJianjie() {
		return jianjie;
	}
	public void setJianjie(String jianjie) {
		this.jianjie = jianjie;
	}
	public String getAddtime() {
		return addtime;
	}
	public void setAddtime(String addtime) {
		this.addtime = addtime;
	}
	public String getDengji() {
		return dengji;
	}
	public void setDengji(String dengji) {
		this.dengji = dengji;
	}
	public String getXinghao() {
		return xinghao;
	}
	public void setXinghao(String xinghao) {
		this.xinghao = xinghao;
	}
	public String getTupian() {
		return tupian;
	}
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	public int getShuliang() {
		return shuliang;
	}
	public void setShuliang(int shuliang) {
		this.shuliang = shuliang;
	}
	public int getCishu() {
		return cishu;
	}
	public void setCishu(int cishu) {
		this.cishu = cishu;
	}
	public int getTuijian() {
		return tuijian;
	}
	public void setTuijian(int tuijian) {
		this.tuijian = tuijian;
	}
	public int getTypeId() {
		return typeId;
	}
	public void setTypeId(int typeId) {
		this.typeId = typeId;
	}
	public int getType2Id() {
		return type2Id;
	}
	public void setType2Id(int type2Id) {
		this.type2Id = type2Id;
	}
	public int getType3Id() {
		return type3Id;
	}
	public void setType3Id(int type3Id) {
		this.type3Id = type3Id;
	}
	public String getHuiyuanjia() {
		return huiyuanjia;
	}
	public void setHuiyuanjia(String huiyuanjia) {
		this.huiyuanjia = huiyuanjia;
	}
	public String getShichangjia() {
		return shichangjia;
	}
	public void setShichangjia(String shichangjia) {
		this.shichangjia = shichangjia;
	}
	public String getPinpai() {
		return pinpai;
	}
	public void setPinpai(String pinpai) {
		this.pinpai = pinpai;
	}
	public int getTejia() {
		return tejia;
	}
	public void setTejia(int tejia) {
		this.tejia = tejia;
	}
}
