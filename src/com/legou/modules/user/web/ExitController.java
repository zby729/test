package com.legou.modules.user.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ExitController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.getSession().removeAttribute("userlist");
		request.getSession().removeAttribute("tradeorderlist");
		request.getSession().removeAttribute("commoditylist");
		request.getSession().removeAttribute("categoryfirstlist");
		request.getSession().removeAttribute("categorysecondlist");
		request.getSession().removeAttribute("categorythirdlist");
		request.getSession().removeAttribute("guanggaolist");
		request.getSession().removeAttribute("leavewordlist");
		request.getSession().removeAttribute("gonggaolist");
		request.getSession().removeAttribute("huifulist");
		request.getSession().removeAttribute("pinglunlist");
		
		response.sendRedirect("static/admin_login.jsp");
	}

}
