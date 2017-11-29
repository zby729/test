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
	 * 查找所有二级分类
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
			System.out.println("查询二级分类失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return categorysecondlist;
	}
	/**
	 * 按名字模糊查找所有二级分类
	 * @param user
	 * @return
	 */
	public ArrayList<CategorySecond> findAllLikeCategorySecond(String name){
		System.out.println("进来了 获取模糊查询全部二级分类");
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
				System.out.println("结束了 模糊获取全部二级分类");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("模糊查询全部二级分类失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return categorysecondlist;
	}
	
	/**
	 * 通过Id删除指定二级分类
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
			System.out.println("删除二级分类失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * 修改二级分类
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
			System.out.println("真的修改了");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("更新二级分类失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了修改");
		return flag;
	}
	/**
	 * 添加二级分类
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
			
			System.out.println("二级分类添加成功");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("二级分类添加失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了修改");
		return flag;
	}
}
