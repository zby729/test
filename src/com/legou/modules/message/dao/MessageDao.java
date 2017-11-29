package com.legou.modules.message.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;

import com.legou.common.tools.DBConnection;
import com.legou.common.tools.MyTools;
import com.legou.modules.category.entity.CategorySecond;
import com.legou.modules.commodity.entity.Commodity;
import com.legou.modules.message.entity.GongGao;
import com.legou.modules.message.entity.GuangGao;
import com.legou.modules.message.entity.Huifu;
import com.legou.modules.message.entity.Leaveword;
import com.legou.modules.message.entity.Pinglun;
import com.legou.modules.user.entity.User;

public class MessageDao {
	DBConnection dbConnection = new DBConnection();
	private Connection con = dbConnection.getConnection();
	private Statement stmt = null;
	private PreparedStatement pstmt = null;
	private ResultSet rs = null;
	
	/**
	 * �������й��
	 * @return
	 */
	public ArrayList<GuangGao> findAllGuangGao(){
		int flag=0;
		String sql = "select * from tb_guanggao";
		ArrayList<GuangGao> guanggaolist = new ArrayList<GuangGao>();
		GuangGao guanggao = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				guanggao = new GuangGao();
				guanggao.setId(rs.getInt("id"));
				guanggao.setPath(rs.getString("path"));
				guanggao.setUrl(rs.getString("url"));
				guanggao.setWidth(rs.getString("width"));
				guanggao.setHeight(rs.getString("height"));
				guanggaolist.add(guanggao);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ���ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return guanggaolist;
	}
	
	/**
	 * ������������
	 * @return
	 */
	public ArrayList<Pinglun> findAllPinglun(){
		int flag=0;
		String sql = "select * from tb_pinglun";
		ArrayList<Pinglun> pinglunlist = new ArrayList<Pinglun>();
		Pinglun pinglun = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				pinglun = new Pinglun();
				pinglun.setId(rs.getInt("id"));
				pinglun.setUserId(rs.getInt("userid"));
				pinglun.setSpId(rs.getInt("spid"));
				pinglun.setTitle(rs.getString("title"));
				pinglun.setContent(rs.getString("content"));
				pinglun.setTime(rs.getString("time"));
				pinglunlist.add(pinglun);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ����ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return pinglunlist;
	}
	
	/**
	 * �������й���
	 * @return
	 */
	public ArrayList<GongGao> findAllGongGao(){
		int flag=0;
		String sql = "select * from tb_gonggao";
		ArrayList<GongGao> gonggaolist = new ArrayList<GongGao>();
		GongGao gonggao = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				gonggao = new GongGao();
				gonggao.setId(rs.getInt("id"));
				gonggao.setTitle(rs.getString("title"));
				gonggao.setContent(rs.getString("content"));
				gonggao.setTime(rs.getString("time"));
				gonggaolist.add(gonggao);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ����ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return gonggaolist;
	}
	
	/**
	 * �������лظ�
	 * @return
	 */
	public ArrayList<Huifu> findAllHuifu(){
		int flag=0;
		String sql = "select * from tb_huifu";
		ArrayList<Huifu> huifulist = new ArrayList<Huifu>();
		Huifu huifu = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				huifu = new Huifu();
				huifu.setId(rs.getInt("id"));
				huifu.setUserId(rs.getInt("userid"));
				huifu.setLeavewordId(rs.getInt("leavewordid"));
				huifu.setTitle(rs.getString("title"));
				huifu.setContent(rs.getString("content"));
				huifu.setTime(rs.getString("time"));
				huifu.setYidu(rs.getInt("yidu"));
				System.out.println(rs.getInt("yidu"));
				huifulist.add(huifu);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ�ظ�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return huifulist;
	}
	
	/**
	 * ������������
	 * @return
	 */
	public ArrayList<Leaveword> findAllLeaveword(){
		int flag=0;
		String sql = "select * from tb_leaveword";
		ArrayList<Leaveword> leavewordlist = new ArrayList<Leaveword>();
		Leaveword leaveword = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				leaveword = new Leaveword();
				leaveword.setId(rs.getInt("id"));
				leaveword.setUserId(rs.getInt("userid"));
				leaveword.setTitle(rs.getString("title"));
				leaveword.setContent(rs.getString("content"));
				leaveword.setTime(rs.getString("time"));
				leaveword.setHuifu(rs.getInt("huifu"));
				leavewordlist.add(leaveword);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("��ѯ����ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return leavewordlist;
	}
	
	/**
	 * �޸Ĺ��
	 * @param user
	 * @return
	 */
	public int upGuangGao(GuangGao guanggao){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_guanggao set path=?,url=?,width=?,height=? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, guanggao.getPath());
			System.out.println(guanggao.getPath());
			pstmt.setString(2, guanggao.getUrl());
			pstmt.setString(3, guanggao.getWidth());
			pstmt.setString(4, guanggao.getHeight());
			pstmt.setInt(5, guanggao.getId());
			flag = pstmt.executeUpdate();
			
			System.out.println("����޸ĳɹ�");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("���ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�����޸�");
		return flag;
	}
	
	/**
	 * �޸Ĺ���
	 * @param user
	 * @return
	 */
	public int upGongGao(GongGao gonggao){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_gonggao set title=?,content=?,time=? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, gonggao.getTitle());
			pstmt.setString(2, gonggao.getContent());
			pstmt.setString(3, gonggao.getTime());
			
			flag = pstmt.executeUpdate();
			
			System.out.println("�����޸ĳɹ�");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("����ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�����޸�");
		return flag;
	}
	/**
	 * �޸Ļظ�
	 * @param user
	 * @return
	 */
	public int upHuifu(Huifu huifu){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "update tb_huifu set userid=?,leavewordid=?,title=?,content=?,time=?,yidu=? where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, huifu.getUserId());
			pstmt.setInt(2, huifu.getLeavewordId());
			pstmt.setString(3, huifu.getTitle());
			pstmt.setString(4, huifu.getContent());
			pstmt.setString(5, huifu.getTime());
			pstmt.setInt(6, huifu.getYidu());
			flag = pstmt.executeUpdate();
			
			System.out.println("�����޸ĳɹ�");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("����ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�����޸�");
		return flag;
	}
	
	/**
	 * ��ӹ��
	 * @param user
	 * @return
	 */
	public int addGuangGao(GuangGao guanggao){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "insert into tb_guanggao (path,url,width,height) VALUES (?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, guanggao.getPath());
			pstmt.setString(2, guanggao.getUrl());
			pstmt.setString(3, guanggao.getWidth());
			pstmt.setString(4, guanggao.getHeight());
			
			flag = pstmt.executeUpdate();
			
			System.out.println("�����ӳɹ�");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�������");
		return flag;
	}
	
	/**
	 * ͨ��Idɾ��ָ�����
	 * @param name
	 * @return
	 */
	public int delGuangGaoById(int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "delete from tb_guanggao where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ����Ʒʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * ��ӻظ�
	 * @param user
	 * @return
	 */
	public int addHuifu(Huifu huifu){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "insert into tb_huifu (userid,leavewordid,title,content,time,yidu) VALUES (?,?,?,?,?,?)";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, huifu.getUserId());
			pstmt.setInt(2, huifu.getLeavewordId());
			pstmt.setString(3, huifu.getTitle());
			pstmt.setString(4, huifu.getContent());
			Date date = new Date();
			DateFormat format = DateFormat.getDateTimeInstance();
			String regtime = format.format(date);
			pstmt.setString(5, regtime);
			pstmt.setInt(6, 0);
			
			flag = pstmt.executeUpdate();
			
			System.out.println("�ظ��ɹ�");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("�ظ�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("ִ�������");
		return flag;
	}
	
	/**
	 * ͨ��Idɾ��ָ���ظ�
	 * @param name
	 * @return
	 */
	public int delHuifuById(int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "delete from tb_huifu where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ���ظ�ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	/**
	 * ͨ��Idɾ��ָ������
	 * @param name
	 * @return
	 */
	public int delPinglun(int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "delete from tb_pinglun where id=?";
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			flag = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ɾ������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	public int addGongGao(GongGao gg){
		
		int count=0;	
		try {
			con = dbConnection.getConnection();
			pstmt = con.prepareStatement("insert into tb_gonggao (title,content,time) values (?,?,?)");
    		pstmt.setString(1, gg.getTitle());
    		pstmt.setString(2, gg.getContent());
    		pstmt.setString(3, gg.getTime());
    		count=pstmt.executeUpdate();
    		pstmt.close();  
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("��ӹ���ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return count;
	}
	
	/**
	 * �����û��� 
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
	 * ������ģ���������лظ�
	 * @param user
	 * @return
	 */
	/*public ArrayList<Huifu> findAllLikeHuifu(String name){
		System.out.println("������ ��ȡģ����ѯȫ���û�");
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "select * from tb_huifu where name like '%"+MyTools.toChinese(name)+"%'";
		ArrayList<Huifu> huifulist = new ArrayList<Huifu>();
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
	}*/
	
	/**
	 * ���ݲ��ҹ��
	 * @param user
	 * @return
	 */
	public GuangGao findGuangGaoById(int id){
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "select * from tb_guanggao where id=?";
		GuangGao user = null;
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, id);
			rs = pstmt.executeQuery();
			while (rs.next()){
				user = new GuangGao();
				user.setId(rs.getInt("id"));
				user.setPath(rs.getString("path"));
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
	 * ������ģ��������������
	 * @param user
	 * @return
	 */
	public ArrayList<Pinglun> findAllLikePinglun(String name){
		System.out.println("������ ��ȡģ����ѯȫ������");
		int flag=0;
		con = dbConnection.getConnection();
		String sql = "select * from tb_pinglun where title like '%"+name+"%'";
		ArrayList<Pinglun> likeuserlist = new ArrayList<Pinglun>();
		Pinglun pinglun = null;
		try {
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while (rs.next()){
				pinglun = new Pinglun();
				pinglun.setId(rs.getInt("id"));
				pinglun.setUserId(rs.getInt("userid"));
				pinglun.setSpId(rs.getInt("spid"));
				pinglun.setTitle(rs.getString("title"));
				pinglun.setContent(rs.getString("content"));
				pinglun.setTime(rs.getString("time"));
				likeuserlist.add(pinglun);
				System.out.println(pinglun.getTitle());
				System.out.println("������ ģ����ȡȫ������");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("ģ����ѯȫ������ʧ�ܣ�");
		} finally{
			dbConnection.closeConnection();
		}
		return likeuserlist;
	}
}
