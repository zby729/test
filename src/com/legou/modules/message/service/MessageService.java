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
	 * 查询所有广告
	 * @return
	 */
	public ArrayList<GuangGao> getAllGuangGao(){
		ArrayList<GuangGao> list = new ArrayList<GuangGao>();
		MessageDao messageDao = new MessageDao();
		list = messageDao.findAllGuangGao();
		return list;
	}
	
	/**
	 * 查询所有评论
	 * @return
	 */
	public ArrayList<Pinglun> getAllPinglun(){
		ArrayList<Pinglun> list = new ArrayList<Pinglun>();
		MessageDao messageDao = new MessageDao();
		list = messageDao.findAllPinglun();
		return list;
	}
	
	/**
	 * 查询所有公告
	 * @return
	 */
	public ArrayList<GongGao> getAllGongGao(){
		ArrayList<GongGao> list = new ArrayList<GongGao>();
		MessageDao messageDao = new MessageDao();
		list = messageDao.findAllGongGao();
		return list;
	}
	
	/**
	 * 查询所有回复
	 * @return
	 */
	public ArrayList<Huifu> getAllHuifu(){
		ArrayList<Huifu> list = new ArrayList<Huifu>();
		MessageDao messageDao = new MessageDao();
		list = messageDao.findAllHuifu();
		return list;
	}
	
	/**
	 * 查询所有留言
	 * @return
	 */
	public ArrayList<Leaveword> getAllLeaveword(){
		ArrayList<Leaveword> list = new ArrayList<Leaveword>();
		MessageDao messageDao = new MessageDao();
		list = messageDao.findAllLeaveword();
		return list;
	}
	/**
	 * 添加广告
	 * @return
	 */
	public int addGuangGao(GuangGao guanggao){
		int flag = new MessageDao().addGuangGao(guanggao);
		return flag;
	}
	/**
	 * 修改广告
	 * @return
	 */
	public int upGuangGao(GuangGao guanggao){
		int flag = new MessageDao().upGuangGao(guanggao);
		return flag;
	}
	
	/**
	 * 通过指定Id删除广告
	 * @param user
	 * @return
	 */
	public int delGuangGaoById(int id){
		int flag = 0; // 0:用户名不存在
		MessageDao messageDao = new MessageDao();
		flag = messageDao.delGuangGaoById(id);
		
		return flag;
	}
	/**
	 * 回复留言
	 * @return
	 */
	public int addHuifu(Huifu huifu){
		int flag = new MessageDao().addHuifu(huifu);
		return flag;
	}

	/**
	 * 通过指定Id删除回复
	 * @param user
	 * @return
	 */
	public int delHuifuById(int id){
		int flag = 0; // 0:用户名不存在
		MessageDao messageDao = new MessageDao();
		flag = messageDao.delHuifuById(id);
		
		return flag;
	}
	/**
	 * 通过指定Id删除评论
	 * @param user
	 * @return
	 */
	public int delPinglunById(int id){
		int flag = 0; // 0:用户名不存在
		MessageDao messageDao = new MessageDao();
		flag = messageDao.delPinglun(id);
		
		return flag;
	}
	/**
	 * 添加公告
	 * @return
	 */
	public int addGongGao(GongGao gonggao){
		int flag = new MessageDao().addGongGao(gonggao);
		return flag;
	}
	
	/**
	 * 修改公告
	 * @return
	 */
	public int upGongGao(GongGao gonggao){
		int flag = new MessageDao().upGongGao(gonggao);
		return flag;
	}
	/**
	 * 模糊查询评论
	 */
	public ArrayList<Pinglun> getAllLikePinglun(String name){
		System.out.println("service中name:"+name);
		ArrayList<Pinglun> pl = new MessageDao().findAllLikePinglun(name);
		return pl;
	}
}
