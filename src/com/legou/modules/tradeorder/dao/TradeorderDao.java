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
	 * �������ж�����Ϣ
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
			System.out.println("��ѯ����ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return tradeorderlist;
	}
	
	/**
	 * ������ģ���������ж���
	 * @param user
	 * @return
	 */
	public ArrayList<Tradeorder> findAllLikeTradeorder(String name){
		System.out.println("������ ��ȡģ����ѯȫ������");
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
				System.out.println("������ ģ����ȡȫ������");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ģ����ѯȫ������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return tradeorderlist;
	}
	
	/**
	 * ͨ��Idɾ��ָ������
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
			System.out.println("ɾ������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * �޸Ķ�������
	 * @param user
	 * @return
	 */
	public int updateTradeorder(Tradeorder tradeorder){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_dingdan set shouhuoren=?,dizhi=?,youbian=?,tel=? where id=?";
		System.out.println("������"+tradeorder.getShouhuoren());
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, tradeorder.getShouhuoren());
			pstmt.setString(2, tradeorder.getDizhi());
			pstmt.setString(3, tradeorder.getYoubian());
			pstmt.setString(4, tradeorder.getTel());
			pstmt.setInt(5, tradeorder.getId());
			
			flag = pstmt.executeUpdate();
			
			System.out.println("flag"+flag);
			System.out.println("����޸���");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���¶���ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�����޸�");
		return flag;
	}
}
