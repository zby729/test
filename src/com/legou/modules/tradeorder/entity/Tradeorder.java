package com.legou.modules.tradeorder.entity;

import java.io.Serializable;

/**
 * ����
 *
 */
public class Tradeorder implements Serializable{
	private int Id; // �������
	private String dingdanhao; // ������
	private String shouhuoren; // �ջ�������
	private String sex; // �ջ����Ա�
	private String dizhi; // �ջ��˵�ַ
	private String youbian; // �ʱ�
	private String tel; // ��ϵ�绰
	private String shsi; // �ջ�ʱ��
	private String zffs; // ֧����ʽ
	private String leaveword; // �������
	private String time; // �µ�ʱ��
	private String xiadanren; // �µ�������
	private String zt; // ����״̬
	private String total; // ֧���ܽ��
	private int spId; // ��ƷId
	
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
