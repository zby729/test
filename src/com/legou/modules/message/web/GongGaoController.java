package com.legou.modules.message.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.message.entity.GongGao;
import com.legou.modules.message.entity.GuangGao;
import com.legou.modules.message.service.MessageService;

public class GongGaoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<GongGao> list = new ArrayList<GongGao>();
		System.out.println("请求Gonggao了");
		list = new MessageService().getAllGongGao();
		request.getSession().setAttribute("gonggaolist", list);
		response.sendRedirect("static/gonggao_management.jsp");
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<GongGao> list = new ArrayList<GongGao>();
		System.out.println("请求Gonggao了");
		list = new MessageService().getAllGongGao();
		request.getSession().setAttribute("gonggaolist", list);
		response.sendRedirect("static/gonggao_management.jsp");
	}

}
