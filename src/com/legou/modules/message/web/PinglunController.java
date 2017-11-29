package com.legou.modules.message.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.legou.modules.message.entity.Leaveword;
import com.legou.modules.message.entity.Pinglun;
import com.legou.modules.message.service.MessageService;

public class PinglunController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("请求Pinglun了Pinglun");
		ArrayList<Pinglun> list = new ArrayList<Pinglun>();
		list = new MessageService().getAllPinglun();
		request.getSession().setAttribute("pinglunlist", list);
		response.sendRedirect("static/pinglun_management.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("请求Pinglun了Pinglun");
		ArrayList<Pinglun> list = new ArrayList<Pinglun>();
		list = new MessageService().getAllPinglun();
		request.getSession().setAttribute("pinglunlist", list);
		response.sendRedirect("static/pinglun_management.jsp");
	}

}
