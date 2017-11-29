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
	 * 查询所有订单
	 * @return
	 */
	public ArrayList<Tradeorder> getAllTradeorder(){
		ArrayList<Tradeorder> list = new ArrayList<Tradeorder>();
		TradeorderDao tTradeorderDao = new TradeorderDao();
		list = tTradeorderDao.findAllTradeorder();
		return list;
	}
	
	/**
	 * 模糊查询所有订单
	 * @return
	 */
	public ArrayList<Tradeorder> getLikeTradeorder(String name){
		ArrayList<Tradeorder> list = new ArrayList<Tradeorder>();
		TradeorderDao tradeorderDao = new TradeorderDao();
		list = tradeorderDao.findAllLikeTradeorder(name);
		return list;
	}
	
	/**
	 * 通过指定Id删除订单
	 * @param user
	 * @return
	 */
	public int delTradeorderById(int id){
		int flag = 0; // 0:用户名不存在
		TradeorderDao tradeorderDao = new TradeorderDao();
		flag = tradeorderDao.delTradeorderById(id);
		
		return flag;
	}
	
	/**
	 * 根据Id修改订单
	 * @param user
	 * @return
	 */
	public int updateTradeorderById(Tradeorder tradeorder){
		int flag = 0; // 0:用户名不存在
		TradeorderDao tradeorderDao = new TradeorderDao();
		flag = tradeorderDao.updateTradeorder(tradeorder);
		System.out.println("执行结束");
		return flag;
	}
}
