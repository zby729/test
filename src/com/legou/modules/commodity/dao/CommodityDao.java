package com.legou.modules.commodity.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.legou.common.tools.DBConnection;
import com.legou.common.tools.MyTools;
import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.user.entity.User;

public class CommodityDao {
	DBConnection dbConnection = new DBConnection();
	private Connection con = dbConnection.getConnection();
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/**
	 * 查找所有商品
	 * @param user
	 * @return
	 */
	public ArrayList<Commodity> findAllCommodity(){
		int flag=0;
		String sql = "select * from tb_shangpin";
		ArrayList<Commodity> commoditylist = new ArrayList<Commodity>();
		Commodity commodity = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				commodity = new Commodity();
				commodity.setId(rs.getInt("id"));
				commodity.setMingcheng(rs.getString("mingcheng"));
				commodity.setJianjie(rs.getString("jianjie"));
				commodity.setAddtime(rs.getString("addtime"));
				commodity.setDengji(rs.getString("dengji"));
				commodity.setXinghao(rs.getString("xinghao"));
				commodity.setTupian(rs.getString("tupian"));
				commodity.setShuliang(rs.getInt("shuliang"));
				commodity.setCishu(rs.getInt("cishu"));
				commodity.setTuijian(rs.getInt("tuijian"));
				commodity.setTypeId(rs.getInt("typeid"));
				commodity.setType2Id(rs.getInt("type2id"));
				commodity.setType3Id(rs.getInt("type3id"));
				commodity.setHuiyuanjia(rs.getString("huiyuanjia"));
				commodity.setShichangjia(rs.getString("shichangjia"));
				commodity.setPinpai(rs.getString("pinpai"));
				commodity.setTejia(rs.getInt("tejia"));
				commoditylist.add(commodity);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("查询全部商品失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return commoditylist;
	}
	
	/**
	 * 按名字模糊查找所有商品
	 * @param user
	 * @return
	 */
	public ArrayList<Commodity> findAllLikeCommodity(String name){
		System.out.println("进来了 获取模糊查询全部商品");
		int flag=0;
		String sql = "select * from tb_shangpin where mingcheng like '%"+MyTools.toChinese(name)+"%'";
		ArrayList<Commodity> likecommoditylist = new ArrayList<Commodity>();
		Commodity commodity = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				commodity = new Commodity();
				commodity.setId(rs.getInt("id"));
				commodity.setMingcheng(rs.getString("mingcheng"));
				commodity.setJianjie(rs.getString("jianjie"));
				commodity.setAddtime(rs.getString("addtime"));
				commodity.setDengji(rs.getString("dengji"));
				commodity.setXinghao(rs.getString("xinghao"));
				commodity.setTupian(rs.getString("tupian"));
				commodity.setShuliang(rs.getInt("shuliang"));
				commodity.setCishu(rs.getInt("cishu"));
				commodity.setTuijian(rs.getInt("tuijian"));
				commodity.setTypeId(rs.getInt("typeid"));
				commodity.setType2Id(rs.getInt("type2id"));
				commodity.setType3Id(rs.getInt("type3id"));
				commodity.setHuiyuanjia(rs.getString("huiyuanjia"));
				commodity.setShichangjia(rs.getString("shichangjia"));
				commodity.setPinpai(rs.getString("pinpai"));
				commodity.setTejia(rs.getInt("tejia"));
				likecommoditylist.add(commodity);
				System.out.println("结束了 模糊获取全部商品");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("模糊查询全部商品失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return likecommoditylist;
	}
	
	/**
	 * 通过Id删除指定商品
	 * @param name
	 * @return
	 */
	public int delCommodityById(int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "delete from tb_shangpin where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("删除商品失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * 添加商品
	 * @param user
	 * @return
	 */
	public int addCommodity(Commodity commodity){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "insert into tb_shangpin (mingcheng,addtime,dengji,xinghao,tupian,shuliang,tuijian,type3id,shichangjia,jianjie) VALUES (?,?,?,?,?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, commodity.getMingcheng());
			System.out.println(commodity.getAddtime());
			pstmt.setString(2, commodity.getAddtime());
			pstmt.setString(3, commodity.getDengji());
			pstmt.setString(4, commodity.getXinghao());
			pstmt.setString(5, MyTools.toChinese(commodity.getTupian()));
			pstmt.setInt(6, commodity.getShuliang());
			pstmt.setInt(7, commodity.getTuijian());
			pstmt.setInt(8, commodity.getType3Id());
			pstmt.setString(9, commodity.getShichangjia());
			pstmt.setString(10, commodity.getJianjie());
			flag = pstmt.executeUpdate();
			
			System.out.println("商品添加成功");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("商品添加失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了修改");
		return flag;
	}
	/**
	 * 修改商品
	 * @param user
	 * @return
	 */
	public int upCommodity(Commodity commodity){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_shangpin set mingcheng=?,addtime=?,dengji=?,xinghao=?,tupian=?,shuliang=?,tuijian=?,type3id=?,shichangjia=?,jianjie=? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, commodity.getMingcheng());
			System.out.println(commodity.getAddtime());
			pstmt.setString(2, commodity.getAddtime());
			pstmt.setString(3, commodity.getDengji());
			pstmt.setString(4, commodity.getXinghao());
			pstmt.setString(5, MyTools.toChinese(commodity.getTupian()));
			pstmt.setInt(6, commodity.getShuliang());
			pstmt.setInt(7, commodity.getTuijian());
			pstmt.setInt(8, commodity.getType3Id());
			pstmt.setString(9, commodity.getShichangjia());
			pstmt.setString(10, commodity.getJianjie());
			pstmt.setInt(11, commodity.getId());
			flag = pstmt.executeUpdate();
			
			System.out.println("商品修改成功");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("商品添加失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了修改");
		return flag;
	}
	
	/**
	 * 根据商品Id获取商品 
	 * @param id
	 * @return
	 */
public Commodity getOutShangPinBySpId(int id){
		
		Statement Stmt = null;
		ResultSet rs = null;
		Commodity commodity = null;
		
		try {
			con = DBConnection.getConnection();
			Stmt = con.createStatement();
			rs = Stmt.executeQuery("select * from tb_shangpin where id="+id);
			
			
			if(rs.next()){
				if(commodity == null){
					//创建商品ArrayList对象
					commodity = new Commodity();
				}
				
				
				commodity.setAddtime(rs.getString("addtime"));
				commodity.setCishu(rs.getInt("cishu"));
				commodity.setDengji(rs.getString("dengji"));
				commodity.setHuiyuanjia(rs.getString("huiyuanjia"));
				commodity.setId(rs.getInt("id"));
				commodity.setJianjie(rs.getString("jianjie"));
				commodity.setMingcheng(rs.getString("mingcheng"));
				commodity.setPinpai(rs.getString("pinpai"));
				commodity.setShichangjia(rs.getString("shichangjia"));
				commodity.setShuliang(rs.getInt("shuliang"));
				commodity.setTejia(rs.getInt("tejia"));
				commodity.setTuijian(rs.getInt("tuijian"));
				commodity.setTupian(rs.getString("tupian"));
				commodity.setType2Id(rs.getInt("type2Id"));
				commodity.setType3Id(rs.getInt("type3Id"));
				commodity.setTypeId(rs.getInt("typeId"));
				commodity.setXinghao(rs.getString("xinghao"));
			}
			
			rs.close();
			Stmt.close();
		
		}catch(Exception e){
			e.printStackTrace();
			System.out.println("数据库发生错误！！！！！！");
		}finally{
			DBConnection.closeConnection();
		}
		
		return commodity;
	}

}
