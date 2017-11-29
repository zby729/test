package com.legou.modules.category.service;

import java.util.ArrayList;

import com.legou.modules.category.dao.TypendDao;
import com.legou.modules.category.dao.TyperdDao;
import com.legou.modules.category.dao.TypestDao;
import com.legou.modules.category.entity.CategoryFirst;
import com.legou.modules.category.entity.CategorySecond;
import com.legou.modules.category.entity.CategoryThird;
import com.legou.modules.commodity.dao.CommodityDao;
import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.user.dao.UserDao;
import com.legou.modules.user.entity.User;

public class CategoryService {
	/**
	 * ��ѯ����һ������
	 * @return
	 */
	public ArrayList<CategoryFirst> getAllCategoryFirst(){
		ArrayList<CategoryFirst> list = new ArrayList<CategoryFirst>();
		TypestDao typestDao = new TypestDao();
		list = typestDao.findAllCategoryFirst();
		return list;
	}
	
	/**
	 * ��ѯ���ж�������
	 * @return
	 */
	public ArrayList<CategorySecond> getAllCategorySecond(){
		ArrayList<CategorySecond> list = new ArrayList<CategorySecond>();
		TypendDao typendDao = new TypendDao();
		list = typendDao.findAllCategorySecond();
		return list;
	}
	
	/**
	 * ��ѯ������������
	 * @return
	 */
	public ArrayList<CategoryThird> getAllCategoryThird(){
		ArrayList<CategoryThird> list = new ArrayList<CategoryThird>();
		TyperdDao typerdDao = new TyperdDao();
		list = typerdDao.findAllCategoryThird();
		return list;
	}
	
	/**
	 * ģ����ѯ����һ������
	 * @return
	 */
	public ArrayList<CategoryFirst> getLikeCategoryFirst(String name){
		ArrayList<CategoryFirst> list = new ArrayList<CategoryFirst>();
		TypestDao typestDao = new TypestDao();
		list = typestDao.findAllLikeCategoryFirst(name);
		return list;
	}
	
	/**
	 * ģ����ѯ���ж�������
	 * @return
	 */
	public ArrayList<CategorySecond> getLikeCategorySecond(String name){
		ArrayList<CategorySecond> list = new ArrayList<CategorySecond>();
		TypendDao typendDao = new TypendDao();
		list = typendDao.findAllLikeCategorySecond(name);
		return list;
	}
	
	/**
	 * ģ����ѯ������������
	 * @return
	 */
	public ArrayList<CategoryThird> getLikeCategoryThird(String name){
		ArrayList<CategoryThird> list = new ArrayList<CategoryThird>();
		TyperdDao typerdDao = new TyperdDao();
		list = typerdDao.findAllLikeCategoryThird(name);
		return list;
	}
	
	/**
	 * ͨ��ָ��Idɾ��һ������
	 * @param user
	 * @return
	 */
	public int delCategoryFirstById(int id){
		int flag = 0; // 0:�û���������
		TypestDao typestDao = new TypestDao();
		flag = typestDao.delCategoryFirstById(id);
		
		return flag;
	}
	
	/**
	 * ͨ��ָ��Idɾ����������
	 * @param user
	 * @return
	 */
	public int delCategorySecondById(int id){
		int flag = 0; // 0:�û���������
		TypendDao typendDao = new TypendDao();
		flag = typendDao.delCategorySecondById(id);
		
		return flag;
	}
	
	/**
	 * ͨ��ָ��Idɾ����������
	 * @param user
	 * @return
	 */
	public int delCategoryThirdById(int id){
		int flag = 0; // 0:�û���������
		TyperdDao typerdDao = new TyperdDao();
		flag = typerdDao.delCategoryThirdById(id);
		
		return flag;
	}
	
	/**
	 * ����Id�޸�һ������
	 * @param user
	 * @return
	 */
	public int updateCategoryFirstById(String typename, int id){
		int flag = 0; // 0:�û���������
		TypestDao typestDao = new TypestDao();
		flag = typestDao.updateCategoryFirst(typename, id);
		System.out.println("ִ�н���");
		return flag;
	}
	
	/**
	 * ����Id�޸Ķ�������
	 * @param user
	 * @return
	 */
	public int updateCategorySecondById(String typename, int id, int typeid){
		int flag = 0; // 0:�û���������
		TypendDao typendDao = new TypendDao();
		flag = typendDao.updateCategorySecond(typename, id, typeid);
		System.out.println("ִ�н���");
		return flag;
	}
	
	/**
	 * ����Id�޸���������
	 * @param user
	 * @return
	 */
	public int updateCategoryThirdById(String typename, int id, int typeid){
		int flag = 0; // 0:�û���������
		TyperdDao typerdDao = new TyperdDao();
		flag = typerdDao.updateCategoryThird(typename, id, typeid);
		System.out.println("ִ�н���");
		return flag;
	}
	
	/**
	 * ����һ������
	 * @param user
	 * @return
	 */
	public int addTypest(String typename){
		int flag = 0; // 0:�û���������
		TypestDao typestDao = new TypestDao();
		flag = typestDao.addCategoryFirst(typename);
		System.out.println("ִ�н���");
		return flag;
	}
	/**
	 * ���Ӷ�������
	 * @param user
	 * @return
	 */
	public int addTypend(String typename, int typeid){
		int flag = 0; // 0:�û���������
		TypendDao typendDao = new TypendDao();
		flag = typendDao.addCategorySecond(typename, typeid);
		System.out.println("ִ�н���");
		return flag;
	}
	/**
	 * ������������
	 * @param user
	 * @return
	 */
	public int addTyperd(String typename, int typeid){
		int flag = 0; // 0:�û���������
		TyperdDao typerdDao = new TyperdDao();
		flag = typerdDao.addCategoryThird(typename, typeid);
		System.out.println("ִ�н���");
		return flag;
	}
}