package com.legou.modules.tradeorder.service;

import java.util.ArrayList;

import com.legou.modules.category.dao.TyperdDao;
import com.legou.modules.category.dao.TypestDao;
import com.legou.modules.category.entity.CategoryFirst;
import com.legou.modules.category.entity.CategoryThird;
import com.legou.modules.tradeorder.dao.TradeorderDao;
import com.legou.modules.tradeorder.entity.Tradeorder;

public class TradeorderService {
	/**
	 * ��ѯ���ж���
	 * @return
	 */
	public ArrayList<Tradeorder> getAllTradeorder(){
		ArrayList<Tradeorder> list = new ArrayList<Tradeorder>();
		TradeorderDao tTradeorderDao = new TradeorderDao();
		list = tTradeorderDao.findAllTradeorder();
		return list;
	}
	
	/**
	 * ģ����ѯ���ж���
	 * @return
	 */
	public ArrayList<Tradeorder> getLikeTradeorder(String name){
		ArrayList<Tradeorder> list = new ArrayList<Tradeorder>();
		TradeorderDao tradeorderDao = new TradeorderDao();
		list = tradeorderDao.findAllLikeTradeorder(name);
		return list;
	}
	
	/**
	 * ͨ��ָ��Idɾ������
	 * @param user
	 * @return
	 */
	public int delTradeorderById(int id){
		int flag = 0; // 0:�û���������
		TradeorderDao tradeorderDao = new TradeorderDao();
		flag = tradeorderDao.delTradeorderById(id);
		
		return flag;
	}
	
	/**
	 * ����Id�޸Ķ���
	 * @param user
	 * @return
	 */
	public int updateTradeorderById(Tradeorder tradeorder){
		int flag = 0; // 0:�û���������
		TradeorderDao tradeorderDao = new TradeorderDao();
		flag = tradeorderDao.updateTradeorder(tradeorder);
		System.out.println("ִ�н���");
		return flag;
	}
}
