package com.legou.modules.user.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import org.apache.catalina.connector.Request;

import com.legou.common.tools.DBConnection;
import com.legou.common.tools.MyTools;
import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.user.entity.User;

public class UserDao {
	DBConnection dbConnection = new DBConnection();
	private Connection con = null;/*dbConnection.getConnection();*/
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/**
	 * ����û�
	 * @param user
	 * @return
	 */
	public int insertUser(User user){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "insert into tb_user(id,name,pwd,dongjie,email,tel,qq,ip,tishi,huida,dizhi,youbian,regtime,lastlogintime,logincishu,truename)"+" values (null,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		Date date = new Date();
		DateFormat format = DateFormat.getDateTimeInstance();
		String regtime = format.format(date);
		String lastlogintime = "0";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, MyTools.toChinese(user.getName()));
			pstmt.setString(2, MyTools.toChinese(user.getPwd()));
			pstmt.setInt(3, 0);
			pstmt.setString(4, MyTools.toChinese(user.getEmail()));
			pstmt.setString(5, MyTools.toChinese(user.getTel()));
			pstmt.setString(6, MyTools.toChinese(user.getQQ()));
			pstmt.setString(7, MyTools.toChinese(user.getIp()));
			pstmt.setString(8, user.getTishi());
			pstmt.setString(9, MyTools.toChinese(user.getHuida()));
			pstmt.setString(10, MyTools.toChinese(user.getDizhi()));
			pstmt.setString(11, MyTools.toChinese(user.getYoubian()));
			pstmt.setString(12, MyTools.toChinese(regtime));
			pstmt.setString(13, MyTools.toChinese(lastlogintime));
			pstmt.setInt(14, 0);
			pstmt.setString(15, MyTools.toChinese(user.getTruename()));
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("����û�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * �޸��û�
	 * @param user
	 * @return
	 */
	public int updateUser(User user){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_user set name=?,pwd=?,dongjie=?,email=?,tel=?,qq=?,ip=?,tishi=?,huida=?,dizhi=?,youbian=?,regtime=?,lastlogintime=?,logincishu=?,truename=? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, MyTools.toChinese(user.getName()));
			pstmt.setString(2, MyTools.toChinese(user.getPwd()));
			pstmt.setInt(3, user.getDongjie());
			pstmt.setString(4, MyTools.toChinese(user.getEmail()));
			pstmt.setString(5, MyTools.toChinese(user.getTel()));
			pstmt.setString(6, MyTools.toChinese(user.getQQ()));
			pstmt.setString(7, MyTools.toChinese(user.getIp()));
			pstmt.setString(8, MyTools.toChinese(user.getTishi()));
			pstmt.setString(9, MyTools.toChinese(user.getHuida()));
			pstmt.setString(10, MyTools.toChinese(user.getDizhi()));
			pstmt.setString(11, MyTools.toChinese(user.getYoubian()));
			pstmt.setString(12, MyTools.toChinese(user.getRegtime()));
			pstmt.setString(13, MyTools.toChinese(user.getLastlogintime()));
			pstmt.setInt(14, user.getLogincishu());
			pstmt.setString(15, MyTools.toChinese(user.getTruename()));
			pstmt.setInt(16, user.getId());
			flag = pstmt.executeUpdate();
			System.out.println("id"+user.getId());
			System.out.println("flag"+flag);
			System.out.println("����޸���");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�����û�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�����޸�");
		return flag;
	}
	
	/**
	 * �޸��û�
	 * @param user
	 * @return
	 */
	public int updateLgUser(User user){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_user set name=?,pwd=?,dongjie=?,email=?,tel=?,qq=?,ip=?,tishi=?,huida=?,dizhi=?,youbian=?,regtime=?,lastlogintime=?,logincishu=?,truename=? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, user.getName());
			pstmt.setString(2, user.getPwd());
			pstmt.setInt(3, user.getDongjie());
			pstmt.setString(4, user.getEmail());
			pstmt.setString(5, user.getTel());
			pstmt.setString(6, user.getQQ());
			pstmt.setString(7, user.getIp());
			pstmt.setString(8, user.getTishi());
			pstmt.setString(9, user.getHuida());
			pstmt.setString(10, user.getDizhi());
			pstmt.setString(11, user.getYoubian());
			pstmt.setString(12, user.getRegtime());
			pstmt.setString(13, user.getLastlogintime());
			pstmt.setInt(14, user.getLogincishu());
			pstmt.setString(15, user.getTruename());
			pstmt.setInt(16, user.getId());
			flag = pstmt.executeUpdate();
			System.out.println("id"+user.getId());
			System.out.println("flag"+flag);
			System.out.println("����޸���");
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�����û�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�����޸�");
		return flag;
	}
	
	/**
	 * ��֤�û�
	 * @param user
	 * @return
	 */
	public User findUserByName(String name){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "select * from tb_user where name=?";
		User user = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()){
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setDongjie(rs.getInt("dongjie"));
				user.setEmail(rs.getString("email"));
				user.setTel(rs.getString("tel"));
				user.setQQ(rs.getString("qq"));
				user.setIp(rs.getString("ip"));
				user.setTishi(rs.getString("tishi"));
				user.setHuida(rs.getString("huida"));
				user.setDizhi(rs.getString("dizhi"));
				user.setYoubian(rs.getString("youbian"));
				user.setRegtime(rs.getString("regtime"));
				user.setLastlogintime(rs.getString("lastlogintime"));
				user.setLogincishu(rs.getInt("logincishu"));
				user.setTruename(rs.getString("truename"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ�û�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return user;
	}
	/**
	 * ��֤�û�
	 * @param user
	 * @return
	 */
	public User findLgUserByName(String name){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "select * from tb_user where name=?";
		User user = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()){
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setDongjie(rs.getInt("dongjie"));
				user.setEmail(rs.getString("email"));
				user.setTel(rs.getString("tel"));
				user.setQQ(rs.getString("qq"));
				user.setIp(rs.getString("ip"));
				user.setTishi(rs.getString("tishi"));
				user.setHuida(rs.getString("huida"));
				user.setDizhi(rs.getString("dizhi"));
				user.setYoubian(rs.getString("youbian"));
				user.setRegtime(rs.getString("regtime"));
				user.setLastlogintime(rs.getString("lastlogintime"));
				user.setLogincishu(rs.getInt("logincishu"));
				user.setTruename(rs.getString("truename"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ�û�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return user;
	}
	
	/**
	 * ��ȡ�����û����ļ�¼��
	 * @param name
	 * @return
	 */
	public int getCountByName(String name){
		int flag=0;
		int dongjie = -1;
		con = dbConnection.getConnection();
		String sql = "select * from tb_user where name=?";
		try {
			pstmt = con.prepareStatement(sql);
			System.out.println("name:::::");
			pstmt.setString(1, MyTools.toChinese(name));
			System.out.println("name:::::"+MyTools.toChinese(name));
			rs = pstmt.executeQuery();
			while (rs.next()){
				flag++;
				dongjie = rs.getInt("dongjie");
			}
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�û�����֤ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		if (dongjie == 1){
			flag = 3;
		}
		return flag;
	}
	
	/**
	 * ���������û�
	 * @param user
	 * @return
	 */
	public ArrayList<User> findAllUsers(){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "select * from tb_user";
		ArrayList<User> userlist = new ArrayList<User>();
		User user = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setDongjie(rs.getInt("dongjie"));
				user.setEmail(rs.getString("email"));
				user.setTel(rs.getString("tel"));
				user.setQQ(rs.getString("qq"));
				user.setIp(rs.getString("ip"));
				user.setTishi(rs.getString("tishi"));
				user.setHuida(rs.getString("huida"));
				user.setDizhi(rs.getString("dizhi"));
				user.setYoubian(rs.getString("youbian"));
				user.setRegtime(rs.getString("regtime"));
				user.setLastlogintime(rs.getString("lastlogintime"));
				user.setLogincishu(rs.getInt("logincishu"));
				user.setTruename(rs.getString("truename"));
				userlist.add(user);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ�û�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return userlist;
	}
	
	/**
	 * ���ݲ����û�
	 * @param user
	 * @return
	 */
	public User findUserById(int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "select * from tb_user where id=?";
		User user = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()){
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setDongjie(rs.getInt("dongjie"));
				user.setEmail(rs.getString("email"));
				user.setTel(rs.getString("tel"));
				user.setQQ(rs.getString("qq"));
				user.setIp(rs.getString("ip"));
				user.setTishi(rs.getString("tishi"));
				user.setHuida(rs.getString("huida"));
				user.setDizhi(rs.getString("dizhi"));
				user.setYoubian(rs.getString("youbian"));
				user.setRegtime(rs.getString("regtime"));
				user.setLastlogintime(rs.getString("lastlogintime"));
				user.setLogincishu(rs.getInt("logincishu"));
				user.setTruename(rs.getString("truename"));
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ�û�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		System.out.println("ִ���˲���");
		return user;
	}
	
	/**
	 * ������ģ������������Ʒ
	 * @param user
	 * @return
	 */
	public ArrayList<User> findAllLikeUser(String name){
		System.out.println("������ ��ȡģ����ѯȫ���û�");
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "select * from tb_user where name like '%"+MyTools.toChinese(name)+"%'";
		ArrayList<User> likeuserlist = new ArrayList<User>();
		User user = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setPwd(rs.getString("pwd"));
				user.setDongjie(rs.getInt("dongjie"));
				user.setEmail(rs.getString("email"));
				user.setTel(rs.getString("tel"));
				user.setQQ(rs.getString("qq"));
				user.setIp(rs.getString("ip"));
				user.setTishi(rs.getString("tishi"));
				user.setHuida(rs.getString("huida"));
				user.setDizhi(rs.getString("dizhi"));
				user.setYoubian(rs.getString("youbian"));
				user.setRegtime(rs.getString("regtime"));
				user.setLastlogintime(rs.getString("lastlogintime"));
				user.setLogincishu(rs.getInt("logincishu"));
				user.setTruename(rs.getString("truename"));
				likeuserlist.add(user);
				System.out.println("������ ģ����ȡȫ���û�");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ģ����ѯȫ���û�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return likeuserlist;
	}
	
	/**
	 * ͨ��Idɾ��ָ���û�
	 * @param name
	 * @return
	 */
	public int delUserById(int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "delete from tb_user where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ���û�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * �����û�Id�޸Ķ���״̬
	 * @param name
	 * @return
	 */
	public int upDJById(int id, int djstatus){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_user set dongjie=?  where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, djstatus);
			pstmt.setInt(2, id);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�޸Ķ���״̬ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
}


