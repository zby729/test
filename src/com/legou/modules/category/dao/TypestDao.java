package com.legou.modules.category.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.legou.common.tools.DBConnection;
import com.legou.common.tools.MyTools;
import com.legou.modules.category.entity.CategoryFirst;
import com.legou.modules.category.entity.CategorySecond;
import com.legou.modules.user.entity.User;

public class TypestDao {
	DBConnection dbConnection = new DBConnection();
	private Connection con = dbConnection.getConnection();
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/**
	 * 查找所有一级分类
	 * @return
	 */
	public ArrayList<CategoryFirst> findAllCategoryFirst(){
		int flag=0;
		String sql = "select * from tb_type";
		ArrayList<CategoryFirst> categoryfirstlist = new ArrayList<CategoryFirst>();
		CategoryFirst categoryfirst = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				categoryfirst = new CategoryFirst();
				categoryfirst.setId(rs.getInt("id"));
				categoryfirst.setTypename(rs.getString("typename"));
				categoryfirstlist.add(categoryfirst);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("查询一级分类失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return categoryfirstlist;
	}
	
	/**
	 * 按名字模糊查找所有一级分类
	 * @param user
	 * @return
	 */
	public ArrayList<CategoryFirst> findAllLikeCategoryFirst(String name){
		System.out.println("进来了 获取模糊查询全部一级分类");
		int flag=0;
		String sql = "select * from tb_type where typename like '%"+MyTools.toChinese(name)+"%'";
		ArrayList<CategoryFirst> categoryfirstlist = new ArrayList<CategoryFirst>();
		CategoryFirst categoryfirst = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				categoryfirst = new CategoryFirst();
				categoryfirst.setId(rs.getInt("id"));
				categoryfirst.setTypename(rs.getString("typename"));
				categoryfirstlist.add(categoryfirst);
				System.out.println("结束了 模糊获取全部一级分类");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("模糊查询全部二级分类失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return categoryfirstlist;
	}
	
	/**
	 * 通过Id删除指定一级分类
	 * @param name
	 * @return
	 */
	public int delCategoryFirstById(int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "delete from tb_type where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("删除一级分类失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * 修改一级分类
	 * @param user
	 * @return
	 */
	public int updateCategoryFirst(String typename, int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_type set typename=? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, MyTools.toChinese(typename));
			pstmt.setInt(2, id);
			flag = pstmt.executeUpdate();
			
			System.out.println("flag"+flag);
			System.out.println("真的修改了");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("更新一级分类失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了修改");
		return flag;
	}
	
	/**
	 * 添加一级分类
	 * @param user
	 * @return
	 */
	public int addCategoryFirst(String typename){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "insert into tb_type (typename) VALUES (?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, typename);
			flag = pstmt.executeUpdate();
			
			System.out.println("一级分类添加成功");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("一级分类添加失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了修改");
		return flag;
	}
	
}
