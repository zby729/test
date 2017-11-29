package com.legou.modules.user.service;

import java.util.ArrayList;

import com.legou.modules.commodity.dao.CommodityDao;
import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.user.dao.UserDao;
import com.legou.modules.user.entity.User;

public class UserService {
	/**
	 * �û�ע��
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
	 * �û���¼
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
	 * ��ͨ�û���¼
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
	 * �û����µ�¼��Ϣ¼��
	 * @param user
	 * @return
	 */
	public void upUser(User user){
		UserDao loginDao = new UserDao();
		loginDao.updateUser(user);
	}
	
	/**
	 * ��ͨ�û����µ�¼��Ϣ¼��
	 * @param user
	 * @return
	 */
	public void upLgUser(User user){
		UserDao loginDao = new UserDao();
		loginDao.updateLgUser(user);
	}
	
	public int checkUser(String name){
		int flag = 0; // 0:�û���������
		UserDao userDao = new UserDao();
		flag = userDao.getCountByName(name);
		return flag;
	}
	
	public int updateUserById(User user){
		int flag = 0; // 0:�û���������
		User u = new User();
		UserDao userDao = new UserDao();
		u = userDao.findUserById(user.getId());
		user.setDongjie(u.getDongjie());
		user.setIp(u.getIp());
		user.setRegtime(u.getRegtime());
		user.setLastlogintime(u.getLastlogintime());
		user.setLogincishu(u.getLogincishu());
		flag = userDao.updateUser(user);
		System.out.println("ִ�н���");
		return flag;
	}
	
	public int updateLgUserById(User user){
		int flag = 0; // 0:�û���������
		User u = new User();
		UserDao userDao = new UserDao();
		u = userDao.findUserById(user.getId());
		user.setDongjie(u.getDongjie());
		user.setIp(u.getIp());
		user.setRegtime(u.getRegtime());
		user.setLastlogintime(u.getLastlogintime());
		user.setLogincishu(u.getLogincishu());
		flag = userDao.updateUser(user);
		System.out.println("ִ�н���");
		return flag;
	}
	
	/**
	 * ģ����ѯ�����û�
	 * @return
	 */
	public ArrayList<User> getLikeUser(String name){
		ArrayList<User> list = new ArrayList<User>();
		UserDao userDao = new UserDao();
		list = userDao.findAllLikeUser(name);
		return list;
	}
	/**
	 * ͨ��ָ��Idɾ���û�
	 * @param user
	 * @return
	 */
	public int delUserById(int id){
		int flag = 0; // 0:�û���������
		UserDao userDao = new UserDao();
		flag = userDao.delUserById(id);
		
		return flag;
	}
	
	/**
	 * ͨ��ָ���û�Id�޸�ָ���û�����״̬
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
