package com.legou.modules.message.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.message.entity.GuangGao;
import com.legou.modules.message.service.MessageService;

public class GuanggaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<GuangGao> list = new ArrayList<GuangGao>();
		System.out.println("请求广告了");
		list = new MessageService().getAllGuangGao();
		request.getSession().setAttribute("guanggaolist", list);
		response.sendRedirect("static/guanggao_management.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("请求广告了Post");
		ArrayList<GuangGao> list = new ArrayList<GuangGao>();
		list = new MessageService().getAllGuangGao();
		request.getSession().setAttribute("guanggaolist", list);
		response.sendRedirect("static/guanggao_management.jsp");
	}

}
