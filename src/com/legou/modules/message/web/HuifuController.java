package com.legou.modules.message.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.message.entity.GongGao;
import com.legou.modules.message.entity.Huifu;
import com.legou.modules.message.service.MessageService;


public class HuifuController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Huifu> list = new ArrayList<Huifu>();
		System.out.println("请求Huifu了");
		list = new MessageService().getAllHuifu();
		request.getSession().setAttribute("huifulist", list);
		response.sendRedirect("static/huifu_management.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Huifu> list = new ArrayList<Huifu>();
		System.out.println("请求Huifu了");
		list = new MessageService().getAllHuifu();
		request.getSession().setAttribute("huifulist", list);
		response.sendRedirect("static/huifu_management.jsp");
	}

}
