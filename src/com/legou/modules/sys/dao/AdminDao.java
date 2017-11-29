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
	 * 验证管理员
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
			System.out.println("查询管理员失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return admin;
	}
	
	/**
	 * 获取满足用户名的记录数
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
			System.out.println("用户名验证失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * 修改管理员
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
			System.out.println("真的修改了");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("更新管理员失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了修改");
		return flag;
	}
	
}
