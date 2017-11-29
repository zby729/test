package com.legou.modules.user.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.common.tools.MyTools;
import com.legou.modules.user.entity.User;
import com.legou.modules.user.service.UserService;

public class CheckLgPwdController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/*request.setCharacterEncoding("UTF-8");*/
		User user = new User();
		UserService userService = new UserService();
		user.setName(MyTools.toChinese(request.getParameter("username")));
		System.out.println("”√ªß√˚£∫"+user.getName());
		user.setPwd(MyTools.toChinese(request.getParameter("password")));
		System.out.println("√‹¬Î£∫"+user.getPwd());
		User myself = null;
		myself = userService.loginLgUser(user);
		PrintWriter out = response.getWriter();
		if (!myself.getPwd().equals(user.getPwd())){
			out.print("0");
		} else {
			User u = myself;
			u.setIp(request.getRemoteAddr());
			Date date = new Date();
			DateFormat format = DateFormat.getDateTimeInstance();
			String regtime = format.format(date);
			u.setLastlogintime(regtime);
			u.setLogincishu(myself.getLogincishu()+1);
			userService.upLgUser(u);
			request.getSession().setAttribute("myself", myself);
			out.print("1");
		}
	}

}
