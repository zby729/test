package com.legou.modules.category.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.legou.common.tools.DBConnection;
import com.legou.common.tools.MyTools;
import com.legou.modules.category.entity.CategorySecond;
import com.legou.modules.category.entity.CategoryThird;

public class TyperdDao {
	DBConnection dbConnection = new DBConnection();
	private Connection con = dbConnection.getConnection();
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/**
	 * ����������������
	 * @return
	 */
	public ArrayList<CategoryThird> findAllCategoryThird(){
		int flag=0;
		String sql = "select * from tb_type3";
		ArrayList<CategoryThird> categorythirdlist = new ArrayList<CategoryThird>();
		CategoryThird categorythird = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				categorythird = new CategoryThird();
				categorythird.setId(rs.getInt("id"));
				categorythird.setTypename(rs.getString("typename"));
				categorythird.setTypeId(rs.getInt("typeid"));
				categorythirdlist.add(categorythird);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ��������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return categorythirdlist;
	}
	
	/**
	 * ������ģ������������������
	 * @param user
	 * @return
	 */
	public ArrayList<CategoryThird> findAllLikeCategoryThird(String name){
		System.out.println("������ ��ȡģ����ѯȫ����������");
		int flag=0;
		String sql = "select * from tb_type3 where typename like '%"+MyTools.toChinese(name)+"%'";
		ArrayList<CategoryThird> categorythirdlist = new ArrayList<CategoryThird>();
		CategoryThird categorythird = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				categorythird = new CategoryThird();
				categorythird.setId(rs.getInt("id"));
				categorythird.setTypename(rs.getString("typename"));
				categorythird.setTypeId(rs.getInt("typeid"));
				categorythirdlist.add(categorythird);
				System.out.println("������ ģ����ȡȫ����������");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ģ����ѯȫ����������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return categorythirdlist;
	}
	
	/**
	 * ͨ��Idɾ��ָ����������
	 * @param name
	 * @return
	 */
	public int delCategoryThirdById(int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "delete from tb_type3 where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ����������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * �޸���������
	 * @param user
	 * @return
	 */
	public int updateCategoryThird(String typename, int id, int typeid){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_type3 set typename=?,typeid=? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, MyTools.toChinese(typename));
			System.out.println("name��"+typename);
			pstmt.setInt(2, typeid);
			pstmt.setInt(3, id);
			flag = pstmt.executeUpdate();
			
			System.out.println("flag"+flag);
			System.out.println("����޸���");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("������������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�����޸�");
		return flag;
	}
	/**
	 * �����������
	 * @param user
	 * @return
	 */
	public int addCategoryThird(String typename,int typeid){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "insert into tb_type3 (typename,typeid) VALUES (?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, typename);
			pstmt.setInt(2, typeid);
			flag = pstmt.executeUpdate();
			
			System.out.println("����������ӳɹ�");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�����������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�����޸�");
		return flag;
	}
}
