package com.legou.modules.message.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.message.entity.GuangGao;
import com.legou.modules.message.entity.Leaveword;
import com.legou.modules.message.service.MessageService;

public class LeavewordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("请求留言了Get");
		ArrayList<Leaveword> list = new ArrayList<Leaveword>();
		list = new MessageService().getAllLeaveword();
		request.getSession().setAttribute("leavewordlist", list);
		response.sendRedirect("static/huifu_management.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("请求留言了Post");
		ArrayList<Leaveword> list = new ArrayList<Leaveword>();
		list = new MessageService().getAllLeaveword();
		request.getSession().setAttribute("leavewordlist", list);
		response.sendRedirect("static/huifu_management.jsp");
	}

}
