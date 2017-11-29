package com.legou.modules.commodity.service;

import java.util.ArrayList;

import com.legou.modules.category.dao.TyperdDao;
import com.legou.modules.commodity.dao.CommodityDao;
import com.legou.modules.commodity.entity.Commodity;

public class CommodityService {
	/**
	 * ģ����ѯ������Ʒ
	 * @return
	 */
	public ArrayList<Commodity> getLikeCommodity(String name){
		ArrayList<Commodity> list = new ArrayList<Commodity>();
		CommodityDao commodityDao = new CommodityDao();
		list = commodityDao.findAllLikeCommodity(name);
		return list;
	}
	
	/**
	 * ͨ��ָ��Idɾ����Ʒ
	 * @param user
	 * @return
	 */
	public int delCommodityById(int id){
		int flag = 0; // 0:�û���������
		CommodityDao commodityDao = new CommodityDao();
		flag = commodityDao.delCommodityById(id);
		
		return flag;
	}
	
	public int addCommodity(Commodity commodity){
		int flag = new CommodityDao().addCommodity(commodity);
		return flag;
	}
	
	public int upCommodity(Commodity commodity){
		int flag = new CommodityDao().upCommodity(commodity);
		return flag;
	}
	
	/**
	 * ������ƷId��ȡ��Ʒ
	 * @param commodity
	 * @return
	 */
	public Commodity getCommodity(int id){
		Commodity commodity = new CommodityDao().getOutShangPinBySpId(id);
		return commodity;
	}
}
