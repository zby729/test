package com.legou.modules.message.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.legou.common.tools.DBConnection;
import com.legou.modules.message.entity.*;

public class Gonggao_adminDao {
	
	DBConnection dbConnection = new DBConnection();
	private Connection con = null;
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/**
	 * 查找公告信息
	 */
	public  ArrayList<GongGao> find(){
		
		ArrayList<GongGao> list = new ArrayList<GongGao>();
		
		String sql = "select * from tb_gonggao";
		try {
			con = dbConnection.getConnection();
			stmt=con.createStatement();
			rs=stmt.executeQuery(sql);
			while(rs.next()){
				GongGao go = new GongGao();
				go.setId(rs.getInt("id"));
				go.setTitle(rs.getString("title"));
				go.setContent(rs.getString("content"));
				go.setTime(rs.getString("time"));
				list.add(go);
			}
			
			rs.close();
			stmt.close();
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("查找公告失败 ！");
		} finally{
			dbConnection.closeConnection();
		}
		
		return list;
	}
	
	public int update(GongGao gg){
		
		int count=0;	
		Date date = new Date();
		DateFormat format = DateFormat.getDateTimeInstance();
		String regtime = format.format(date);
		try {
			con = dbConnection.getConnection();
			pstmt = con.prepareStatement("update tb_gonggao set title=?,content=?,time=? where id=?");
    		pstmt.setString(1, gg.getTitle());
    		pstmt.setString(2, gg.getContent());
    		pstmt.setString(3, regtime);
    		pstmt.setInt(4, gg.getId());
    		count=pstmt.executeUpdate();
    		pstmt.close();  
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("修改公告失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return count;
	}
	
	public int insert(GongGao gg){
		
		Date date = new Date();
		DateFormat format = DateFormat.getDateTimeInstance();
		String regtime = format.format(date);
		int count=0;	
		try {
			con = dbConnection.getConnection();
			pstmt = con.prepareStatement("insert into tb_gonggao (title,content,time) values (?,?,?)");
    		pstmt.setString(1, gg.getTitle());
    		pstmt.setString(2, gg.getContent());
    		pstmt.setString(3, regtime);
    		count=pstmt.executeUpdate();
    		pstmt.close();  
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("添加公告失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return count;
	}
	
	public int delet(int id){
		
		int count=0;	
		try {
			con = dbConnection.getConnection();
			pstmt = con.prepareStatement("delete from  tb_gonggao where id=?");
    		pstmt.setInt(1, id);
    		count=pstmt.executeUpdate();
    		pstmt.close();  
    		
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("删除公告失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return count;
	}
}
