package com.legou.modules.sys.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.Date;

import org.apache.catalina.connector.Request;

import com.legou.common.tools.DBConnection;
import com.legou.common.tools.MyTools;
import com.legou.modules.sys.entity.Admin;
import com.legou.modules.user.entity.User;

public class AdminDao {
	DBConnection dbConnection = new DBConnection();
	private Connection con = dbConnection.getConnection();
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/**
	 * ��֤����Ա
	 * @param user
	 * @return
	 */
	public Admin findAdminByName(String name){
		int flag=0;
		String sql = "select * from tb_admin where name=?";
		Admin admin = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()){
				admin = new Admin();
				admin.setId(rs.getInt("id"));
				admin.setPwd(rs.getString("pwd"));	
				admin.setName(rs.getString("name"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ����Աʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return admin;
	}
	
	/**
	 * ��ȡ�����û����ļ�¼��
	 * @param name
	 * @return
	 */
	public int getCountByName(String name){
		int flag=0;
		String sql = "select * from tb_admin where name=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()){
				flag++;
			}
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�û�����֤ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * �޸Ĺ���Ա
	 * @param admin
	 * @return
	 */
	public int updateAdmin(Admin admin){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_admin set pwd=? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, admin.getPwd());
			pstmt.setInt(2, admin.getId());
			flag = pstmt.executeUpdate();
			System.out.println("id"+admin.getId());
			System.out.println("flag"+flag);
			System.out.println("����޸���");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���¹���Աʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�����޸�");
		return flag;
	}
	
}
