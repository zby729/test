package com.legou.modules.message.service;

import java.util.ArrayList;

import com.legou.modules.message.dao.Gonggao_adminDao;
import com.legou.modules.message.entity.*;
import com.legou.modules.message.service.*;

public class Gonggao_adminService {
	
	/*
	 * 查找订单列表
	 */
	public ArrayList<GongGao> show(){
		Gonggao_adminDao dao = new Gonggao_adminDao();
		ArrayList<GongGao> list = new ArrayList<GongGao>();
		list = dao.find();
		return list;
	}
	
	public int update(GongGao gg){
		Gonggao_adminDao dao = new Gonggao_adminDao();
		GongGao list = new GongGao();
		int count = dao.update(gg);
		return count;
	}
	
	public int insert(GongGao gg){
		Gonggao_adminDao dao = new Gonggao_adminDao();
		GongGao list = new GongGao();
		int count = dao.insert(gg);
		return count;
	}
	
	public int delet(int id){
		Gonggao_adminDao dao = new Gonggao_adminDao();
		GongGao list = new GongGao();
		int count = dao.delet(id);
		return count;
	}
}
