package com.legou.common.tools;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	static Connection con = null;

	/**
	 * ��ȡ���ݿ�����
	 * @return
	 */
	public static Connection getConnection(){
		if (con == null){
			try {	// ������������
				Class.forName("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
				System.out.println("����MySQL���ݿ�����ʧ�ܣ�");
			}
			try {	// ͨ�����������������ȡ���ݿ�����
				con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online_retailers?useUnicode=true&characterEncoding=utf8","root","root");
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("��ȡ���ݿ�����ʧ�ܣ�");
			}
		}
		return con;
	}
	
	/**
	 * �ر����ݿ�Ĳ���
	 */
	public static void closeConnection() {
     	if(con!=null)
			try {
				con.close();
				con=null;
			} catch (SQLException e) {
				e.printStackTrace();
				System.out.println("�ر�con����ʧ�ܣ�");
			}
    }
}
