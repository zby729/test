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
	 * 查询所有一级分类
	 * @return
	 */
	public ArrayList<CategoryFirst> getAllCategoryFirst(){
		ArrayList<CategoryFirst> list = new ArrayList<CategoryFirst>();
		TypestDao typestDao = new TypestDao();
		list = typestDao.findAllCategoryFirst();
		return list;
	}
	
	/**
	 * 查询所有二级分类
	 * @return
	 */
	public ArrayList<CategorySecond> getAllCategorySecond(){
		ArrayList<CategorySecond> list = new ArrayList<CategorySecond>();
		TypendDao typendDao = new TypendDao();
		list = typendDao.findAllCategorySecond();
		return list;
	}
	
	/**
	 * 查询所有三级分类
	 * @return
	 */
	public ArrayList<CategoryThird> getAllCategoryThird(){
		ArrayList<CategoryThird> list = new ArrayList<CategoryThird>();
		TyperdDao typerdDao = new TyperdDao();
		list = typerdDao.findAllCategoryThird();
		return list;
	}
	
	/**
	 * 模糊查询所有一级分类
	 * @return
	 */
	public ArrayList<CategoryFirst> getLikeCategoryFirst(String name){
		ArrayList<CategoryFirst> list = new ArrayList<CategoryFirst>();
		TypestDao typestDao = new TypestDao();
		list = typestDao.findAllLikeCategoryFirst(name);
		return list;
	}
	
	/**
	 * 模糊查询所有二级分类
	 * @return
	 */
	public ArrayList<CategorySecond> getLikeCategorySecond(String name){
		ArrayList<CategorySecond> list = new ArrayList<CategorySecond>();
		TypendDao typendDao = new TypendDao();
		list = typendDao.findAllLikeCategorySecond(name);
		return list;
	}
	
	/**
	 * 模糊查询所有三级分类
	 * @return
	 */
	public ArrayList<CategoryThird> getLikeCategoryThird(String name){
		ArrayList<CategoryThird> list = new ArrayList<CategoryThird>();
		TyperdDao typerdDao = new TyperdDao();
		list = typerdDao.findAllLikeCategoryThird(name);
		return list;
	}
	
	/**
	 * 通过指定Id删除一级分类
	 * @param user
	 * @return
	 */
	public int delCategoryFirstById(int id){
		int flag = 0; // 0:用户名不存在
		TypestDao typestDao = new TypestDao();
		flag = typestDao.delCategoryFirstById(id);
		
		return flag;
	}
	
	/**
	 * 通过指定Id删除二级分类
	 * @param user
	 * @return
	 */
	public int delCategorySecondById(int id){
		int flag = 0; // 0:用户名不存在
		TypendDao typendDao = new TypendDao();
		flag = typendDao.delCategorySecondById(id);
		
		return flag;
	}
	
	/**
	 * 通过指定Id删除三级分类
	 * @param user
	 * @return
	 */
	public int delCategoryThirdById(int id){
		int flag = 0; // 0:用户名不存在
		TyperdDao typerdDao = new TyperdDao();
		flag = typerdDao.delCategoryThirdById(id);
		
		return flag;
	}
	
	/**
	 * 根据Id修改一级分类
	 * @param user
	 * @return
	 */
	public int updateCategoryFirstById(String typename, int id){
		int flag = 0; // 0:用户名不存在
		TypestDao typestDao = new TypestDao();
		flag = typestDao.updateCategoryFirst(typename, id);
		System.out.println("执行结束");
		return flag;
	}
	
	/**
	 * 根据Id修改二级分类
	 * @param user
	 * @return
	 */
	public int updateCategorySecondById(String typename, int id, int typeid){
		int flag = 0; // 0:用户名不存在
		TypendDao typendDao = new TypendDao();
		flag = typendDao.updateCategorySecond(typename, id, typeid);
		System.out.println("执行结束");
		return flag;
	}
	
	/**
	 * 根据Id修改三级分类
	 * @param user
	 * @return
	 */
	public int updateCategoryThirdById(String typename, int id, int typeid){
		int flag = 0; // 0:用户名不存在
		TyperdDao typerdDao = new TyperdDao();
		flag = typerdDao.updateCategoryThird(typename, id, typeid);
		System.out.println("执行结束");
		return flag;
	}
	
	/**
	 * 添加一级分类
	 * @param user
	 * @return
	 */
	public int addTypest(String typename){
		int flag = 0; // 0:用户名不存在
		TypestDao typestDao = new TypestDao();
		flag = typestDao.addCategoryFirst(typename);
		System.out.println("执行结束");
		return flag;
	}
	/**
	 * 添加二级分类
	 * @param user
	 * @return
	 */
	public int addTypend(String typename, int typeid){
		int flag = 0; // 0:用户名不存在
		TypendDao typendDao = new TypendDao();
		flag = typendDao.addCategorySecond(typename, typeid);
		System.out.println("执行结束");
		return flag;
	}
	/**
	 * 添加三级分类
	 * @param user
	 * @return
	 */
	public int addTyperd(String typename, int typeid){
		int flag = 0; // 0:用户名不存在
		TyperdDao typerdDao = new TyperdDao();
		flag = typerdDao.addCategoryThird(typename, typeid);
		System.out.println("执行结束");
		return flag;
	}
}
