package com.legou.common.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con = null;

	/**
	 * 获取数据库连接
	 * @return
	 */
	public static Connection getConnection(){
		if (con == null){
			try {	// 加载驱动程序
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("加载MySQL数据库驱动失败！");
			}
			try {	// 通过驱动程序管理器获取数据库连接
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_retailers?useUnicode=true&characterEncoding=utf8","root","root");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("获取数据库连接失败！");
			}
		}
		return con;
	}
	
	/**
	 * 关闭数据库的操作
	 */
	public static void closeConnection() {
     	if(con!=null)
			try {
				con.close();
				con=null;
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("关闭con对象失败！");
			}
    }
}
