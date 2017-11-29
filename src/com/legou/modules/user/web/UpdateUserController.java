package com.legou.modules.user.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.common.tools.MyTools;
import com.legou.modules.user.dao.UserDao;
import com.legou.modules.user.entity.User;
import com.legou.modules.user.service.UserService;

public class UpdateUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("请求到了Get");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user = new User();
		String[] questions = {new String("妈妈的生日".getBytes("utf-8"),"ISO-8859-1"),new String("爸爸的生日".getBytes("utf-8"),"ISO-8859-1"),new String("我的生日".getBytes("utf-8"),"ISO-8859-1")};
		user.setId(Integer.parseInt(request.getParameter("hidden")));
		User u = new UserDao().findUserById(Integer.parseInt(request.getParameter("hidden")));
		String name = request.getParameter("new-people-name");
		if (name == null || name.equals("")){
			user.setName(new String(u.getName().getBytes("utf-8"),"ISO-8859-1"));
		} else {
			user.setName(name);
		}
		user.setPwd(request.getParameter("new-phone-number"));
		user.setEmail(request.getParameter("new-phone-email"));
		user.setQQ(request.getParameter("new-phone-qq"));
		user.setYoubian(request.getParameter("new-phone-youbian"));
		user.setTel(request.getParameter("new-phone-tel"));
		user.setTruename(request.getParameter("new-phone-truename"));
		user.setDizhi(request.getParameter("new-phone-dizhi"));
		user.setTishi(questions[Integer.parseInt(request.getParameter("quesion"))]);
		user.setHuida(request.getParameter("new-phone-huida"));
		new UserService().updateUserById(user);
		response.sendRedirect(request.getContextPath()+"/adminlogin");
	}

}
