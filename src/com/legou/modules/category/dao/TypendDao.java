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
import com.legou.modules.commodity.entity.Commodity;

public class TypendDao {
	DBConnection dbConnection = new DBConnection();
	private Connection con = dbConnection.getConnection();
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/**
	 * �������ж�������
	 * @return
	 */
	public ArrayList<CategorySecond> findAllCategorySecond(){
		int flag=0;
		String sql = "select * from tb_type2";
		ArrayList<CategorySecond> categorysecondlist = new ArrayList<CategorySecond>();
		CategorySecond categorysecond = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				categorysecond = new CategorySecond();
				categorysecond.setId(rs.getInt("id"));
				categorysecond.setTypename(rs.getString("typename"));
				categorysecond.setTypeId(rs.getInt("typeid"));
				categorysecondlist.add(categorysecond);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ��������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return categorysecondlist;
	}
	/**
	 * ������ģ���������ж�������
	 * @param user
	 * @return
	 */
	public ArrayList<CategorySecond> findAllLikeCategorySecond(String name){
		System.out.println("������ ��ȡģ����ѯȫ����������");
		int flag=0;
		String sql = "select * from tb_type2 where typename like '%"+MyTools.toChinese(name)+"%'";
		ArrayList<CategorySecond> categorysecondlist = new ArrayList<CategorySecond>();
		CategorySecond categorysecond = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				categorysecond = new CategorySecond();
				categorysecond.setId(rs.getInt("id"));
				categorysecond.setTypename(rs.getString("typename"));
				categorysecond.setTypeId(rs.getInt("typeid"));
				categorysecondlist.add(categorysecond);
				System.out.println("������ ģ����ȡȫ����������");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ģ����ѯȫ����������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return categorysecondlist;
	}
	
	/**
	 * ͨ��Idɾ��ָ����������
	 * @param name
	 * @return
	 */
	public int delCategorySecondById(int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "delete from tb_type2 where id=?";
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
	 * �޸Ķ�������
	 * @param user
	 * @return
	 */
	public int updateCategorySecond(String typename, int id, int typeid){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_type2 set typename=?,typeid=? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, MyTools.toChinese(typename)+" ");
			pstmt.setInt(2, typeid);
			pstmt.setInt(3, id);
			flag = pstmt.executeUpdate();
			
			System.out.println("flag"+flag);
			System.out.println("����޸���");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���¶�������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�����޸�");
		return flag;
	}
	/**
	 * ��Ӷ�������
	 * @param user
	 * @return
	 */
	public int addCategorySecond(String typename,int typeid){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "insert into tb_type2 (typename,typeid) VALUES (?,?)";
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
