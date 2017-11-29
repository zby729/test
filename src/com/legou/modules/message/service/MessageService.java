package com.legou.modules.message.service;

import java.util.ArrayList;

import com.legou.modules.category.dao.TypestDao;
import com.legou.modules.category.entity.CategoryFirst;
import com.legou.modules.commodity.dao.CommodityDao;
import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.message.dao.MessageDao;
import com.legou.modules.message.entity.GongGao;
import com.legou.modules.message.entity.GuangGao;
import com.legou.modules.message.entity.Huifu;
import com.legou.modules.message.entity.Leaveword;
import com.legou.modules.message.entity.Pinglun;

public class MessageService {
	/**
	 * ��ѯ���й��
	 * @return
	 */
	public ArrayList<GuangGao> getAllGuangGao(){
		ArrayList<GuangGao> list = new ArrayList<GuangGao>();
		MessageDao messageDao = new MessageDao();
		list = messageDao.findAllGuangGao();
		return list;
	}
	
	/**
	 * ��ѯ��������
	 * @return
	 */
	public ArrayList<Pinglun> getAllPinglun(){
		ArrayList<Pinglun> list = new ArrayList<Pinglun>();
		MessageDao messageDao = new MessageDao();
		list = messageDao.findAllPinglun();
		return list;
	}
	
	/**
	 * ��ѯ���й���
	 * @return
	 */
	public ArrayList<GongGao> getAllGongGao(){
		ArrayList<GongGao> list = new ArrayList<GongGao>();
		MessageDao messageDao = new MessageDao();
		list = messageDao.findAllGongGao();
		return list;
	}
	
	/**
	 * ��ѯ���лظ�
	 * @return
	 */
	public ArrayList<Huifu> getAllHuifu(){
		ArrayList<Huifu> list = new ArrayList<Huifu>();
		MessageDao messageDao = new MessageDao();
		list = messageDao.findAllHuifu();
		return list;
	}
	
	/**
	 * ��ѯ��������
	 * @return
	 */
	public ArrayList<Leaveword> getAllLeaveword(){
		ArrayList<Leaveword> list = new ArrayList<Leaveword>();
		MessageDao messageDao = new MessageDao();
		list = messageDao.findAllLeaveword();
		return list;
	}
	/**
	 * ��ӹ��
	 * @return
	 */
	public int addGuangGao(GuangGao guanggao){
		int flag = new MessageDao().addGuangGao(guanggao);
		return flag;
	}
	/**
	 * �޸Ĺ��
	 * @return
	 */
	public int upGuangGao(GuangGao guanggao){
		int flag = new MessageDao().upGuangGao(guanggao);
		return flag;
	}
	
	/**
	 * ͨ��ָ��Idɾ�����
	 * @param user
	 * @return
	 */
	public int delGuangGaoById(int id){
		int flag = 0; // 0:�û���������
		MessageDao messageDao = new MessageDao();
		flag = messageDao.delGuangGaoById(id);
		
		return flag;
	}
	/**
	 * �ظ�����
	 * @return
	 */
	public int addHuifu(Huifu huifu){
		int flag = new MessageDao().addHuifu(huifu);
		return flag;
	}

	/**
	 * ͨ��ָ��Idɾ���ظ�
	 * @param user
	 * @return
	 */
	public int delHuifuById(int id){
		int flag = 0; // 0:�û���������
		MessageDao messageDao = new MessageDao();
		flag = messageDao.delHuifuById(id);
		
		return flag;
	}
	/**
	 * ͨ��ָ��Idɾ������
	 * @param user
	 * @return
	 */
	public int delPinglunById(int id){
		int flag = 0; // 0:�û���������
		MessageDao messageDao = new MessageDao();
		flag = messageDao.delPinglun(id);
		
		return flag;
	}
	/**
	 * ��ӹ���
	 * @return
	 */
	public int addGongGao(GongGao gonggao){
		int flag = new MessageDao().addGongGao(gonggao);
		return flag;
	}
	
	/**
	 * �޸Ĺ���
	 * @return
	 */
	public int upGongGao(GongGao gonggao){
		int flag = new MessageDao().upGongGao(gonggao);
		return flag;
	}
	/**
	 * ģ����ѯ����
	 */
	public ArrayList<Pinglun> getAllLikePinglun(String name){
		System.out.println("service��name:"+name);
		ArrayList<Pinglun> pl = new MessageDao().findAllLikePinglun(name);
		return pl;
	}
}
