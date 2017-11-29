package com.legou.modules.sys.service;

import java.util.ArrayList;

import com.legou.modules.commodity.dao.CommodityDao;
import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.sys.dao.AdminDao;
import com.legou.modules.sys.entity.Admin;
import com.legou.modules.user.dao.UserDao;
import com.legou.modules.user.entity.User;

public class AdminService {
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public Admin loginUser(Admin user){
		Admin finduser = null;
		AdminDao loginDao = new AdminDao();
		finduser = loginDao.findAdminByName(user.getName());

		return finduser;
	}
	
	public int checkAdmin(String name){
		int flag = 0; // 0:管理员不存在
		AdminDao adminDao = new AdminDao();
		flag = adminDao.getCountByName(name);
		return flag;
	}
	
	public ArrayList<User> getAllUser(){
		ArrayList<User> list = new ArrayList<User>();
		UserDao userDao = new UserDao();
		list = userDao.findAllUsers();
		return list;
	}
	
	/**
	 * 查询所有商品
	 * @return
	 */
	public ArrayList<Commodity> getAllCommodity(){
		ArrayList<Commodity> list = new ArrayList<Commodity>();
		CommodityDao commodityDao = new CommodityDao();
		list = commodityDao.findAllCommodity();
		return list;
	}
	
	public int UpAdmin(Admin admin){
		AdminDao adminDao = new AdminDao();
		int flag = adminDao.updateAdmin(admin);
		return flag;
	}
}
