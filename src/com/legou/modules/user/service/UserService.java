package com.legou.modules.user.service;

import java.util.ArrayList;

import com.legou.modules.commodity.dao.CommodityDao;
import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.user.dao.UserDao;
import com.legou.modules.user.entity.User;

public class UserService {
	/**
	 * 用户注册
	 * @param user
	 * @return
	 */
	public int registerUser(User user){
		int flag = 0;
		UserDao registerDao = new UserDao();
		flag = registerDao.insertUser(user);
		return flag;
	}
	
	/**
	 * 用户登录
	 * @param user
	 * @return
	 */
	public User loginUser(User user){
		User finduser = null;
		UserDao loginDao = new UserDao();
		finduser = loginDao.findUserByName(user.getName());

		return finduser;
	}
	
	/**
	 * 普通用户登录
	 * @param user
	 * @return
	 */
	public User loginLgUser(User user){
		User finduser = null;
		UserDao loginDao = new UserDao();
		finduser = loginDao.findLgUserByName(user.getName());

		return finduser;
	}
	
	/**
	 * 用户最新登录信息录入
	 * @param user
	 * @return
	 */
	public void upUser(User user){
		UserDao loginDao = new UserDao();
		loginDao.updateUser(user);
	}
	
	/**
	 * 普通用户最新登录信息录入
	 * @param user
	 * @return
	 */
	public void upLgUser(User user){
		UserDao loginDao = new UserDao();
		loginDao.updateLgUser(user);
	}
	
	public int checkUser(String name){
		int flag = 0; // 0:用户名不存在
		UserDao userDao = new UserDao();
		flag = userDao.getCountByName(name);
		return flag;
	}
	
	public int updateUserById(User user){
		int flag = 0; // 0:用户名不存在
		User u = new User();
		UserDao userDao = new UserDao();
		u = userDao.findUserById(user.getId());
		user.setDongjie(u.getDongjie());
		user.setIp(u.getIp());
		user.setRegtime(u.getRegtime());
		user.setLastlogintime(u.getLastlogintime());
		user.setLogincishu(u.getLogincishu());
		flag = userDao.updateUser(user);
		System.out.println("执行结束");
		return flag;
	}
	
	public int updateLgUserById(User user){
		int flag = 0; // 0:用户名不存在
		User u = new User();
		UserDao userDao = new UserDao();
		u = userDao.findUserById(user.getId());
		user.setDongjie(u.getDongjie());
		user.setIp(u.getIp());
		user.setRegtime(u.getRegtime());
		user.setLastlogintime(u.getLastlogintime());
		user.setLogincishu(u.getLogincishu());
		flag = userDao.updateUser(user);
		System.out.println("执行结束");
		return flag;
	}
	
	/**
	 * 模糊查询所有用户
	 * @return
	 */
	public ArrayList<User> getLikeUser(String name){
		ArrayList<User> list = new ArrayList<User>();
		UserDao userDao = new UserDao();
		list = userDao.findAllLikeUser(name);
		return list;
	}
	/**
	 * 通过指定Id删除用户
	 * @param user
	 * @return
	 */
	public int delUserById(int id){
		int flag = 0; // 0:用户名不存在
		UserDao userDao = new UserDao();
		flag = userDao.delUserById(id);
		
		return flag;
	}
	
	/**
	 * 通过指定用户Id修改指定用户冻结状态
	 * @param user
	 * @return
	 */
	public int upDjById(int id, int djstatus){
		int flag = 0;
		UserDao userDao = new UserDao();
		if (djstatus==0){
			userDao.upDJById(id, 1);
		} else if(djstatus == 1){
			userDao.upDJById(id, 0);
		}
		
		return flag;
	}
}
