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
	 * 查找所有广告
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
			System.out.println("查询广告失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return guanggaolist;
	}
	
	/**
	 * 查找所有评论
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
			System.out.println("查询评论失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return pinglunlist;
	}
	
	/**
	 * 查找所有公告
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
			System.out.println("查询公告失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return gonggaolist;
	}
	
	/**
	 * 查找所有回复
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
			System.out.println("查询回复失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return huifulist;
	}
	
	/**
	 * 查找所有留言
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
			System.out.println("查询留言失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return leavewordlist;
	}
	
	/**
	 * 修改广告
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
			
			System.out.println("广告修改成功");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("广告失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了修改");
		return flag;
	}
	
	/**
	 * 修改公告
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
			
			System.out.println("公告修改成功");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("公告失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了修改");
		return flag;
	}
	/**
	 * 修改回复
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
			
			System.out.println("公告修改成功");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("公告失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了修改");
		return flag;
	}
	
	/**
	 * 添加广告
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
			
			System.out.println("广告添加成功");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("广告添加失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了添加");
		return flag;
	}
	
	/**
	 * 通过Id删除指定广告
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
			System.out.println("删除商品失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	
	/**
	 * 添加回复
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
			
			System.out.println("回复成功");
			System.out.println("flag="+flag);
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("回复失败！");
		} finally{
			dbConnection.closeConnection();
		}

		System.out.println("执行了添加");
		return flag;
	}
	
	/**
	 * 通过Id删除指定回复
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
			System.out.println("删除回复失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return flag;
	}
	/**
	 * 通过Id删除指定评论
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
			System.out.println("删除评论失败！");
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
			System.out.println("添加公告失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return count;
	}
	
	/**
	 * 根据用户名 
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
			System.out.println("查询用户失败！");
		} finally{
			dbConnection.closeConnection();
		}
		System.out.println("执行了查找");
		return user;
	}
	
	/**
	 * 按名字模糊查找所有回复
	 * @param user
	 * @return
	 */
	/*public ArrayList<Huifu> findAllLikeHuifu(String name){
		System.out.println("进来了 获取模糊查询全部用户");
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
				System.out.println("结束了 模糊获取全部用户");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("模糊查询全部用户失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return likeuserlist;
	}*/
	
	/**
	 * 根据查找广告
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
			System.out.println("查询用户失败！");
		} finally{
			dbConnection.closeConnection();
		}
		System.out.println("执行了查找");
		return user;
	}
	/**
	 * 按标题模糊查找所有评论
	 * @param user
	 * @return
	 */
	public ArrayList<Pinglun> findAllLikePinglun(String name){
		System.out.println("进来了 获取模糊查询全部评论");
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
				System.out.println("结束了 模糊获取全部评论");
			}
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("模糊查询全部评论失败！");
		} finally{
			dbConnection.closeConnection();
		}
		return likeuserlist;
	}
}
