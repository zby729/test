package com.legou.modules.tradeorder.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.legou.common.tools.DBConnection;
import com.legou.common.tools.MyTools;
import com.legou.modules.category.entity.CategoryThird;
import com.legou.modules.tradeorder.entity.Tradeorder;

public class TradeorderDao {
	DBConnection dbConnection = new DBConnection();
	private Connection con = dbConnection.getConnection();
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/**
	 * 查找所有订单信息
	 * @return
	 */
	public ArrayList<Tradeorder> findAllTradeorder(){
		int flag=0;
		String sql = "select * from tb_dingdan";
		ArrayList<Tradeorder> tradeorderlist = new ArrayList<Tradeorder>();
		Tradeorder tradeorder = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				tradeorder = new Tradeorder();
				tradeorder.setId(rs.getInt("id"));
				tradeorder.setDingdanhao(rs.getString("dingdanhao"));
				tradeorder.setShouhuoren(rs.getString("shouhuoren"));
				tradeorder.setSex(rs.getString("sex"));
				tradeorder.setDizhi(rs.getString("dizhi"));
				tradeorder.setYoubian(rs.getString("youbian"));
				tradeorder.setTel(rs.getString("tel"));
				tradeorder.setShsi(rs.getString("shsi"));
				tradeorder.setZffs(rs.getString("zffs"));
				tradeorder.setLeaveword(rs.getString("leaveword"));
				tradeorder.setTime(rs.getString("time"));
				tradeorder.setXiadanren(rs.getString("xiadanren"));
				tradeorder.setZt(rs.getString("zt"));
				tradeorder.setTotal(rs.getString("total"));
				tradeorder.setSpId(rs.getInt("spid"));
				tradeorderlist.add(tradeorder);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("查询订单失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return tradeorderlist;
	}
	
	/**
	 * 按名字模糊查找所有订单
	 * @param user
	 * @return
	 */
	public ArrayList<Tradeorder> findAllLikeTradeorder(String name){
		System.out.println("进来了 获取模糊查询全部订单");
		int flag=0;
		String sql = "select * from tb_dingdan where dingdanhao like '%"+MyTools.toChinese(name)+"%'";
		ArrayList<Tradeorder> tradeorderlist = new ArrayList<Tradeorder>();
		Tradeorder tradeorder = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				tradeorder = new Tradeorder();
				tradeorder.setId(rs.getInt("id"));
				tradeorder.setDingdanhao(rs.getString("dingdanhao"));
				tradeorder.setShouhuoren(rs.getString("shouhuoren"));
				tradeorder.setSex(rs.getString("sex"));
				tradeorder.setDizhi(rs.getString("dizhi"));
				tradeorder.setYoubian(rs.getString("youbian"));
				tradeorder.setTel(rs.getString("tel"));
				tradeorder.setShsi(rs.getString("shsi"));
				tradeorder.setZffs(rs.getString("zffs"));
				tradeorder.setLeaveword(rs.getString("leaveword"));
				tradeorder.setTime(rs.getString("time"));
				tradeorder.setXiadanren(rs.getString("xiadanren"));
				tradeorder.setZt(rs.getString("zt"));
				tradeorder.setTotal(rs.getString("total"));
				tradeorder.setSpId(rs.getInt("spid"));
				tradeorderlist.add(tradeorder);
				System.out.println("结束了 模糊获取全部订单");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("模糊查询全部订单失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return tradeorderlist;
	}
	
	/**
	 * 通过Id删除指定订单
	 * @param name
	 * @return
	 */
	public int delTradeorderById(int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "delete from tb_dingdan where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("删除订单失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * 修改订单分类
	 * @param user
	 * @return
	 */
	public int updateTradeorder(Tradeorder tradeorder){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_dingdan set shouhuoren=?,dizhi=?,youbian=?,tel=? where id=?";
		System.out.println("噶不懂"+tradeorder.getShouhuoren());
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, tradeorder.getShouhuoren());
			pstmt.setString(2, tradeorder.getDizhi());
			pstmt.setString(3, tradeorder.getYoubian());
			pstmt.setString(4, tradeorder.getTel());
			pstmt.setInt(5, tradeorder.getId());
			
			flag = pstmt.executeUpdate();
			
			System.out.println("flag"+flag);
			System.out.println("真的修改了");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("更新订单失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了修改");
		return flag;
	}
}
