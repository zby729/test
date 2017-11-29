package com.legou.modules.user.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.user.entity.User;
import com.legou.modules.user.service.UserService;

public class LikeUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("like_str");
		UserService service = new UserService();
		ArrayList<User> userlist = new ArrayList<User>();
		userlist = service.getLikeUser(name);
		request.getSession().setAttribute("userlist", userlist);
		response.sendRedirect("static/adminindex.jsp");
	}

}
